package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informeproduccionresumenhdr_wc_impl extends GXWebComponent
{
   public informeproduccionresumenhdr_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informeproduccionresumenhdr_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumenhdr_wc_impl.class ));
   }

   public informeproduccionresumenhdr_wc_impl( int remoteHandle ,
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
               AV13EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV13EmprCod);
               AV21HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HisEstReo", GXutil.str( AV21HisEstReo, 1, 0));
               AV22MaqCod1 = httpContext.GetPar( "MaqCod1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22MaqCod1", AV22MaqCod1);
               AV23MaqCod2 = httpContext.GetPar( "MaqCod2") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCod2", AV23MaqCod2);
               AV24HisProFec1 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24HisProFec1", localUtil.ttoc( AV24HisProFec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV25HisProFec2 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25HisProFec2", localUtil.ttoc( AV25HisProFec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV13EmprCod,Byte.valueOf(AV21HisEstReo),AV22MaqCod1,AV23MaqCod2,AV24HisProFec1,AV25HisProFec2});
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
      nRC_GXsfl_52 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_52"))) ;
      nGXsfl_52_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_52_idx"))) ;
      sGXsfl_52_idx = httpContext.GetPar( "sGXsfl_52_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      AV13EmprCod = httpContext.GetPar( "EmprCod") ;
      edtavCostei_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavCostet_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavCostek_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarkgmtin_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgmtin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgmtin_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarkgstt_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgstt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgstt_Visible), 5, 0), !bGXsfl_52_Refreshing);
      AV48FlagMarca = (byte)(GXutil.lval( httpContext.GetPar( "FlagMarca"))) ;
      AV38HhMmAlfa = httpContext.GetPar( "HhMmAlfa") ;
      AV49Minutos = GXutil.lval( httpContext.GetPar( "Minutos")) ;
      AV72HisProTr2 = (short)(GXutil.lval( httpContext.GetPar( "HisProTr2"))) ;
      AV73HorReaInt = (short)(GXutil.lval( httpContext.GetPar( "HorReaInt"))) ;
      AV74MinRea = (short)(GXutil.lval( httpContext.GetPar( "MinRea"))) ;
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
      AV21HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
      AV22MaqCod1 = httpContext.GetPar( "MaqCod1") ;
      AV23MaqCod2 = httpContext.GetPar( "MaqCod2") ;
      AV24HisProFec1 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec1")) ;
      AV25HisProFec2 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec2")) ;
      AV13EmprCod = httpContext.GetPar( "EmprCod") ;
      edtavCostei_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavCostet_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavCostek_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarkgmtin_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgmtin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgmtin_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarkgstt_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgstt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgstt_Visible), 5, 0), !bGXsfl_52_Refreshing);
      AV48FlagMarca = (byte)(GXutil.lval( httpContext.GetPar( "FlagMarca"))) ;
      AV38HhMmAlfa = httpContext.GetPar( "HhMmAlfa") ;
      AV49Minutos = GXutil.lval( httpContext.GetPar( "Minutos")) ;
      AV72HisProTr2 = (short)(GXutil.lval( httpContext.GetPar( "HisProTr2"))) ;
      AV73HorReaInt = (short)(GXutil.lval( httpContext.GetPar( "HorReaInt"))) ;
      AV74MinRea = (short)(GXutil.lval( httpContext.GetPar( "MinRea"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A602MaqCod = httpContext.GetPar( "MaqCod") ;
      A558HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
      A561HisProLin = (int)(GXutil.lval( httpContext.GetPar( "HisProLin"))) ;
      A4441HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTF")) ;
      n4441HisProDTF = false ;
      A3612HisProReo = (byte)(GXutil.lval( httpContext.GetPar( "HisProReo"))) ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A4440HisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTI")) ;
      n4440HisProDTI = false ;
      A1525HisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "HisProKgr"), ".") ;
      A1526HisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "HisProMtr"), ".") ;
      A566HisProTur = (byte)(GXutil.lval( httpContext.GetPar( "HisProTur"))) ;
      A279CliNom = httpContext.GetPar( "CliNom") ;
      A212BarSer = httpContext.GetPar( "BarSer") ;
      A135BarColNom = httpContext.GetPar( "BarColNom") ;
      A136BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      A557HisProF = httpContext.GetPar( "HisProF") ;
      A503GruOpeCod = (int)(GXutil.lval( httpContext.GetPar( "GruOpeCod"))) ;
      A461Fase = httpContext.GetPar( "Fase") ;
      A2247HisProTip = (short)(GXutil.lval( httpContext.GetPar( "HisProTip"))) ;
      A3611HisProTc = (byte)(GXutil.lval( httpContext.GetPar( "HisProTc"))) ;
      A217BarTipArt = (short)(GXutil.lval( httpContext.GetPar( "BarTipArt"))) ;
      n217BarTipArt = false ;
      A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      n252CliCod = false ;
      A218BarTipCol = (byte)(GXutil.lval( httpContext.GetPar( "BarTipCol"))) ;
      AV44MatDsc = httpContext.GetPar( "MatDsc") ;
      AV43MatCod = (short)(GXutil.lval( httpContext.GetPar( "MatCod"))) ;
      AV87fechadt = localUtil.parseDTimeParm( httpContext.GetPar( "fechadt")) ;
      AV60ForRGB = GXutil.lval( httpContext.GetPar( "ForRGB")) ;
      A5608HisProDf = localUtil.parseDateParm( httpContext.GetPar( "HisProDf")) ;
      A3610HisProLot = httpContext.GetPar( "HisProLot") ;
      AV86Grulec = (byte)(GXutil.lval( httpContext.GetPar( "Grulec"))) ;
      AV75FasDivTime = httpContext.GetPar( "FasDivTime") ;
      A6680HisproTdab = (short)(GXutil.lval( httpContext.GetPar( "HisproTdab"))) ;
      A5605HisProTr2 = (short)(GXutil.lval( httpContext.GetPar( "HisProTr2"))) ;
      A556HisProEst = (byte)(GXutil.lval( httpContext.GetPar( "HisProEst"))) ;
      A148BarEstReo = (byte)(GXutil.lval( httpContext.GetPar( "BarEstReo"))) ;
      A833TipDefCod = (short)(GXutil.lval( httpContext.GetPar( "TipDefCod"))) ;
      n833TipDefCod = false ;
      A834TipDefDsc = httpContext.GetPar( "TipDefDsc") ;
      n834TipDefDsc = false ;
      A656ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
      n656ParCod = false ;
      A867ParCodNom = httpContext.GetPar( "ParCodNom") ;
      n867ParCodNom = false ;
      A457FasCod = httpContext.GetPar( "FasCod") ;
      AV76fase = httpContext.GetPar( "fase") ;
      A14054FasDivTime = httpContext.GetPar( "FasDivTime") ;
      A1933BarCodTin = (int)(GXutil.lval( httpContext.GetPar( "BarCodTin"))) ;
      n1933BarCodTin = false ;
      A1934BarReoTin = (byte)(GXutil.lval( httpContext.GetPar( "BarReoTin"))) ;
      n1934BarReoTin = false ;
      A1935BarParTin = httpContext.GetPar( "BarParTin") ;
      n1935BarParTin = false ;
      AV57BarCod4 = (int)(GXutil.lval( httpContext.GetPar( "BarCod4"))) ;
      AV59BarCodReo4 = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo4"))) ;
      AV58BarCodPar4 = httpContext.GetPar( "BarCodPar4") ;
      A1945BarMaqTin = httpContext.GetPar( "BarMaqTin") ;
      n1945BarMaqTin = false ;
      A8563BarKgsTt = CommonUtil.decimalVal( httpContext.GetPar( "BarKgsTt"), ".") ;
      n8563BarKgsTt = false ;
      A1947BarKgmTin = CommonUtil.decimalVal( httpContext.GetPar( "BarKgmTin"), ".") ;
      n1947BarKgmTin = false ;
      A3705BarCosCol = CommonUtil.decimalVal( httpContext.GetPar( "BarCosCol"), ".") ;
      n3705BarCosCol = false ;
      A3658BarCosPA = CommonUtil.decimalVal( httpContext.GetPar( "BarCosPA"), ".") ;
      n3658BarCosPA = false ;
      A3654BarCosPD = CommonUtil.decimalVal( httpContext.GetPar( "BarCosPD"), ".") ;
      n3654BarCosPD = false ;
      A3657BarCosAA = CommonUtil.decimalVal( httpContext.GetPar( "BarCosAA"), ".") ;
      n3657BarCosAA = false ;
      A3656BarCosAD = CommonUtil.decimalVal( httpContext.GetPar( "BarCosAD"), ".") ;
      n3656BarCosAD = false ;
      A3706BarCosAnc = CommonUtil.decimalVal( httpContext.GetPar( "BarCosAnc"), ".") ;
      n3706BarCosAnc = false ;
      A2316BarAgrLot = httpContext.GetPar( "BarAgrLot") ;
      n2316BarAgrLot = false ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV21HisEstReo, AV22MaqCod1, AV23MaqCod2, AV24HisProFec1, AV25HisProFec2, AV13EmprCod, AV48FlagMarca, AV38HhMmAlfa, AV49Minutos, AV72HisProTr2, AV73HorReaInt, AV74MinRea, A396EmprCod, A602MaqCod, A558HisProFec, A561HisProLin, A4441HisProDTF, A3612HisProReo, A129BarCod, A132BarCodReo, A130BarCodPar, A4440HisProDTI, A1525HisProKgr, A1526HisProMtr, A566HisProTur, A279CliNom, A212BarSer, A135BarColNom, A136BarColNum, A557HisProF, A503GruOpeCod, A461Fase, A2247HisProTip, A3611HisProTc, A217BarTipArt, A252CliCod, A218BarTipCol, AV44MatDsc, AV43MatCod, AV87fechadt, AV60ForRGB, A5608HisProDf, A3610HisProLot, AV86Grulec, AV75FasDivTime, A6680HisproTdab, A5605HisProTr2, A556HisProEst, A148BarEstReo, A833TipDefCod, A834TipDefDsc, A656ParCod, A867ParCodNom, A457FasCod, AV76fase, A14054FasDivTime, A1933BarCodTin, A1934BarReoTin, A1935BarParTin, AV57BarCod4, AV59BarCodReo4, AV58BarCodPar4, A1945BarMaqTin, A8563BarKgsTt, A1947BarKgmTin, A3705BarCosCol, A3658BarCosPA, A3654BarCosPD, A3657BarCosAA, A3656BarCosAD, A3706BarCosAnc, A2316BarAgrLot, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1YM2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Informe Produccion Resumen Hdr", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.informeproduccionresumenhdr_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV21HisEstReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV22MaqCod1)),GXutil.URLEncode(GXutil.rtrim(AV23MaqCod2)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV24HisProFec1)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV25HisProFec2))}, new String[] {"EmprCod","HisEstReo","MaqCod1","MaqCod2","HisProFec1","HisProFec2"}) +"\">") ;
            app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
            httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
         }
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFECHADT", getSecureSignedToken( sPrefix, localUtil.format( AV87fechadt, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGRULEC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV86Grulec), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASDIVTIME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV75FasDivTime, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV76fase, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_52", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_52, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13EmprCod", GXutil.rtrim( wcpOAV13EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21HisEstReo", GXutil.ltrim( localUtil.ntoc( wcpOAV21HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22MaqCod1", GXutil.rtrim( wcpOAV22MaqCod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23MaqCod2", GXutil.rtrim( wcpOAV23MaqCod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24HisProFec1", localUtil.ttoc( wcpOAV24HisProFec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25HisProFec2", localUtil.ttoc( wcpOAV25HisProFec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV21HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD1", GXutil.rtrim( AV22MaqCod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD2", GXutil.rtrim( AV23MaqCod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC1", localUtil.ttoc( AV24HisProFec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC2", localUtil.ttoc( AV25HisProFec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROFEC", localUtil.dtoc( A558HisProFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROLIN", GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROREO", GXutil.ltrim( localUtil.ntoc( A3612HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROKGR", GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROMTR", GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROTUR", GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOLNUM", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROF", GXutil.rtrim( A557HisProF));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRUOPECOD", GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASE", GXutil.rtrim( A461Fase));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROTIP", GXutil.ltrim( localUtil.ntoc( A2247HisProTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROTC", GXutil.ltrim( localUtil.ntoc( A3611HisProTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARTIPART", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARTIPCOL", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHADT", localUtil.ttoc( AV87fechadt, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFECHADT", getSecureSignedToken( sPrefix, localUtil.format( AV87fechadt, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPRODF", localUtil.dtoc( A5608HisProDf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROLOT", GXutil.rtrim( A3610HisProLot));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRULEC", GXutil.ltrim( localUtil.ntoc( AV86Grulec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGRULEC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV86Grulec), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASDIVTIME", GXutil.rtrim( AV75FasDivTime));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASDIVTIME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV75FasDivTime, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROTDAB", GXutil.ltrim( localUtil.ntoc( A6680HisproTdab, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROEST", GXutil.ltrim( localUtil.ntoc( A556HisProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARESTREO", GXutil.ltrim( localUtil.ntoc( A148BarEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TIPDEFCOD", GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TIPDEFDSC", GXutil.rtrim( A834TipDefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PARCOD", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PARCODNOM", GXutil.rtrim( A867ParCodNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASE", GXutil.rtrim( AV76fase));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV76fase, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASDIVTIME", GXutil.rtrim( A14054FasDivTime));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODTIN", GXutil.ltrim( localUtil.ntoc( A1933BarCodTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARREOTIN", GXutil.ltrim( localUtil.ntoc( A1934BarReoTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARPARTIN", GXutil.rtrim( A1935BarParTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARMAQTIN", GXutil.rtrim( A1945BarMaqTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARKGSTT", GXutil.ltrim( localUtil.ntoc( A8563BarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARKGMTIN", GXutil.ltrim( localUtil.ntoc( A1947BarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSCOL", GXutil.ltrim( localUtil.ntoc( A3705BarCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSPA", GXutil.ltrim( localUtil.ntoc( A3658BarCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSPD", GXutil.ltrim( localUtil.ntoc( A3654BarCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSAA", GXutil.ltrim( localUtil.ntoc( A3657BarCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSAD", GXutil.ltrim( localUtil.ntoc( A3656BarCosAD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSANC", GXutil.ltrim( localUtil.ntoc( A3706BarCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARAGRLOT", GXutil.rtrim( A2316BarAgrLot));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPRODTF", localUtil.ttoc( A4441HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPRODTI", localUtil.ttoc( A4440HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROTR2", GXutil.ltrim( localUtil.ntoc( A5605HisProTr2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTEI_Visible", GXutil.ltrim( localUtil.ntoc( edtavCostei_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTET_Visible", GXutil.ltrim( localUtil.ntoc( edtavCostet_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOSTEK_Visible", GXutil.ltrim( localUtil.ntoc( edtavCostek_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARKGMTIN_Visible", GXutil.ltrim( localUtil.ntoc( edtavBarkgmtin_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARKGSTT_Visible", GXutil.ltrim( localUtil.ntoc( edtavBarkgstt_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm1YM2( )
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
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "</form>") ;
         }
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
      return "Produccion.InformeProduccionResumenHdr_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Produccion Resumen Hdr", "") ;
   }

   public void wb1YM0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.informeproduccionresumenhdr_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbuttonexcel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel", ""), bttBtnbuttonexcel_Jsonclick, 5, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOBUTTONEXCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionResumenHdr_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_22_1YM2( true) ;
      }
      else
      {
         wb_table1_22_1YM2( false) ;
      }
      return  ;
   }

   public void wb_table1_22_1YM2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, divUnnamedtable1_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCantidadregistros_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCantidadregistros_Internalname, httpContext.getMessage( "Registros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'" + sPrefix + "',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCantidadregistros_Internalname, GXutil.ltrim( localUtil.ntoc( AV111CantidadRegistros, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCantidadregistros_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV111CantidadRegistros), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV111CantidadRegistros), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,38);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCantidadregistros_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCantidadregistros_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGridrows_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGridrows_Internalname, httpContext.getMessage( "GridRow", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'" + sPrefix + "',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGridrows_Internalname, GXutil.ltrim( localUtil.ntoc( AV110GridRows, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGridrows_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV110GridRows), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV110GridRows), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGridrows_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGridrows_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGridpagecount_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGridpagecount_Internalname, httpContext.getMessage( "GridPageCount", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'" + sPrefix + "',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGridpagecount_Internalname, GXutil.ltrim( localUtil.ntoc( AV20GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGridpagecount_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20GridPageCount), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20GridPageCount), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGridpagecount_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGridpagecount_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol52( ) ;
      }
      if ( wbEnd == 52 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_52 = (int)(nGXsfl_52_idx-1) ;
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
         wb_table2_103_1YM2( true) ;
      }
      else
      {
         wb_table2_103_1YM2( false) ;
      }
      return  ;
   }

   public void wb_table2_103_1YM2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV19GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV20GridPageCount);
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTbl_totales_Internalname, divTbl_totales_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotkhdr_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'" + sPrefix + "',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotkhdr_Internalname, GXutil.ltrim( localUtil.ntoc( AV91TotkHDR, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotkhdr_Enabled!=0) ? localUtil.format( AV91TotkHDR, "ZZZZZZ9.99") : localUtil.format( AV91TotkHDR, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,167);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotkhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotkhdr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTotmthdr_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'" + sPrefix + "',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotmthdr_Internalname, GXutil.ltrim( localUtil.ntoc( AV90TotMtHDR, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTotmthdr_Enabled!=0) ? localUtil.format( AV90TotMtHDR, "ZZZZZZ9.99") : localUtil.format( AV90TotMtHDR, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,171);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotmthdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTotmthdr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTiempom_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 175,'" + sPrefix + "',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTiempom_Internalname, GXutil.ltrim( localUtil.ntoc( AV88Tiempom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTiempom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV88Tiempom), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV88Tiempom), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,175);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTiempom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTiempom_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'" + sPrefix + "',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGridcurrentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV19GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19GridCurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,179);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGridcurrentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGridcurrentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV132Pgmname), GXutil.rtrim( localUtil.format( AV132Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", edtavPgmname_Visible, 0, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC.htm");
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 52 )
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

   public void start1YM2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe Produccion Resumen Hdr", ""), (short)(0)) ;
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
            strup1YM0( ) ;
         }
      }
   }

   public void ws1YM2( )
   {
      start1YM2( ) ;
      evt1YM2( ) ;
   }

   public void evt1YM2( )
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
                              strup1YM0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111YM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121YM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOBUTTONEXCEL'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoButtonExcel' */
                                 e131YM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavCantidadregistros_Internalname ;
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
                              strup1YM0( ) ;
                           }
                           nGXsfl_52_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_522( ) ;
                           if ( GXutil.len( sPrefix) == 0 )
                           {
                              AV13EmprCod = GXutil.upper( httpContext.cgiGet( edtavEmprcod_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV13EmprCod);
                           }
                           AV28Hdr = httpContext.cgiGet( edtavHdr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV28Hdr);
                           AV29MaqCodHdr = httpContext.cgiGet( edtavMaqcodhdr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqcodhdr_Internalname, AV29MaqCodHdr);
                           AV30HisProFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavHisprofec_Internalname), 0)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprofec_Internalname, localUtil.format(AV30HisProFec, "99/99/99"));
                           AV31HidProLin = (int)(localUtil.ctol( httpContext.cgiGet( edtavHidprolin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHidprolin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31HidProLin), 8, 0));
                           AV32HisProKgrHDR = localUtil.ctond( httpContext.cgiGet( edtavHisprokgrhdr_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprokgrhdr_Internalname, GXutil.ltrimstr( AV32HisProKgrHDR, 9, 2));
                           AV33HisProMtrHDR = localUtil.ctond( httpContext.cgiGet( edtavHispromtrhdr_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHispromtrhdr_Internalname, GXutil.ltrimstr( AV33HisProMtrHDR, 9, 2));
                           AV34HisProTurHdr = (byte)(localUtil.ctol( httpContext.cgiGet( edtavHisproturhdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisproturhdr_Internalname, GXutil.str( AV34HisProTurHdr, 1, 0));
                           AV35HisProF = GXutil.upper( httpContext.cgiGet( edtavHisprof_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprof_Internalname, AV35HisProF);
                           AV36HisProDtiHdr = localUtil.ctot( httpContext.cgiGet( edtavHisprodtihdr_Internalname), 0) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprodtihdr_Internalname, localUtil.ttoc( AV36HisProDtiHdr, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           AV37HisProDtfHdr = localUtil.ctot( httpContext.cgiGet( edtavHisprodtfhdr_Internalname), 0) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprodtfhdr_Internalname, localUtil.ttoc( AV37HisProDtfHdr, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           AV38HhMmAlfa = httpContext.cgiGet( edtavHhmmalfa_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHhmmalfa_Internalname, AV38HhMmAlfa);
                           AV39CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClinom_Internalname, AV39CliNom);
                           AV40BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarser_Internalname, AV40BarSer);
                           AV41BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcolnom_Internalname, AV41BarColNom);
                           AV42BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42BarColNum), 6, 0));
                           AV43MatCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavMatcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMatcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MatCod), 3, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATCOD"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(AV43MatCod), "ZZ9")));
                           AV44MatDsc = httpContext.cgiGet( edtavMatdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMatdsc_Internalname, AV44MatDsc);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATDSC"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, GXutil.rtrim( localUtil.format( AV44MatDsc, ""))));
                           AV45OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOpecod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45OpeCod), 6, 0));
                           AV46FasCod = GXutil.upper( httpContext.cgiGet( edtavFascod_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFascod_Internalname, AV46FasCod);
                           AV47FasDsc = httpContext.cgiGet( edtavFasdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdsc_Internalname, AV47FasDsc);
                           AV48FlagMarca = (byte)(localUtil.ctol( httpContext.cgiGet( edtavFlagmarca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFlagmarca_Internalname, GXutil.str( AV48FlagMarca, 1, 0));
                           AV49Minutos = localUtil.ctol( httpContext.cgiGet( edtavMinutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinutos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Minutos), 10, 0));
                           AV50Op4 = httpContext.cgiGet( edtavOp4_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOp4_Internalname, AV50Op4);
                           AV51BarTipArt4 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBartipart4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBartipart4_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51BarTipArt4), 4, 0));
                           AV52HisProTip4 = (short)(localUtil.ctol( httpContext.cgiGet( edtavHisprotip4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprotip4_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52HisProTip4), 4, 0));
                           AV53TipArtDc = httpContext.cgiGet( edtavTipartdc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipartdc_Internalname, AV53TipArtDc);
                           AV54HisProTc4 = (short)(localUtil.ctol( httpContext.cgiGet( edtavHisprotc4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprotc4_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54HisProTc4), 4, 0));
                           AV55TipColDsc4 = httpContext.cgiGet( edtavTipcoldsc4_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipcoldsc4_Internalname, AV55TipColDsc4);
                           AV56HisProDf = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavHisprodf_Internalname), 0)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprodf_Internalname, localUtil.format(AV56HisProDf, "99/99/99"));
                           AV57BarCod4 = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcod4_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57BarCod4), 8, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD4"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(AV57BarCod4), "ZZZZZZZ9")));
                           AV58BarCodPar4 = httpContext.cgiGet( edtavBarcodpar4_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpar4_Internalname, AV58BarCodPar4);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR4"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, GXutil.rtrim( localUtil.format( AV58BarCodPar4, ""))));
                           AV59BarCodReo4 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreo4_Internalname, GXutil.str( AV59BarCodReo4, 1, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO4"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(AV59BarCodReo4), "9")));
                           AV60ForRGB = localUtil.ctol( httpContext.cgiGet( edtavForrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavForrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60ForRGB), 10, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORRGB"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(AV60ForRGB), "ZZZZZZZZZ9")));
                           AV61R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61R), 3, 0));
                           AV62G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62G), 3, 0));
                           AV63B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63B), 3, 0));
                           AV64TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipdefcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipdefcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TipDefCod), 4, 0));
                           AV65TipDefDsc = httpContext.cgiGet( edtavTipdefdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipdefdsc_Internalname, AV65TipDefDsc);
                           AV66CosteI = localUtil.ctond( httpContext.cgiGet( edtavCostei_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostei_Internalname, GXutil.ltrimstr( AV66CosteI, 10, 2));
                           AV67CosteT = localUtil.ctond( httpContext.cgiGet( edtavCostet_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostet_Internalname, GXutil.ltrimstr( AV67CosteT, 10, 2));
                           AV68CosteK = localUtil.ctond( httpContext.cgiGet( edtavCostek_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV68CosteK, 10, 2));
                           AV69HdrP = httpContext.cgiGet( edtavHdrp_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrp_Internalname, AV69HdrP);
                           AV70BarKgmTin = localUtil.ctond( httpContext.cgiGet( edtavBarkgmtin_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgmtin_Internalname, GXutil.ltrimstr( AV70BarKgmTin, 9, 2));
                           AV71BarKgsTt = localUtil.ctond( httpContext.cgiGet( edtavBarkgstt_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgstt_Internalname, GXutil.ltrimstr( AV71BarKgsTt, 10, 2));
                           AV72HisProTr2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavHisprotr2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprotr2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72HisProTr2), 4, 0));
                           AV73HorReaInt = (short)(localUtil.ctol( httpContext.cgiGet( edtavHorreaint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorreaint_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73HorReaInt), 4, 0));
                           AV74MinRea = (short)(localUtil.ctol( httpContext.cgiGet( edtavMinrea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinrea_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74MinRea), 4, 0));
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
                                       GX_FocusControl = edtavCantidadregistros_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e141YM2 ();
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
                                       GX_FocusControl = edtavCantidadregistros_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e151YM2 ();
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
                                       GX_FocusControl = edtavCantidadregistros_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e161YM2 ();
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
                                    strup1YM0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavCantidadregistros_Internalname ;
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

   public void we1YM2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1YM2( ) ;
         }
      }
   }

   public void pa1YM2( )
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
            GX_FocusControl = edtavCantidadregistros_Internalname ;
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
      subsflControlProps_522( ) ;
      while ( nGXsfl_52_idx <= nRC_GXsfl_52 )
      {
         sendrow_522( ) ;
         nGXsfl_52_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV21HisEstReo ,
                                 String AV22MaqCod1 ,
                                 String AV23MaqCod2 ,
                                 java.util.Date AV24HisProFec1 ,
                                 java.util.Date AV25HisProFec2 ,
                                 String AV13EmprCod ,
                                 byte AV48FlagMarca ,
                                 String AV38HhMmAlfa ,
                                 long AV49Minutos ,
                                 short AV72HisProTr2 ,
                                 short AV73HorReaInt ,
                                 short AV74MinRea ,
                                 String A396EmprCod ,
                                 String A602MaqCod ,
                                 java.util.Date A558HisProFec ,
                                 int A561HisProLin ,
                                 java.util.Date A4441HisProDTF ,
                                 byte A3612HisProReo ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 java.util.Date A4440HisProDTI ,
                                 java.math.BigDecimal A1525HisProKgr ,
                                 java.math.BigDecimal A1526HisProMtr ,
                                 byte A566HisProTur ,
                                 String A279CliNom ,
                                 String A212BarSer ,
                                 String A135BarColNom ,
                                 int A136BarColNum ,
                                 String A557HisProF ,
                                 int A503GruOpeCod ,
                                 String A461Fase ,
                                 short A2247HisProTip ,
                                 byte A3611HisProTc ,
                                 short A217BarTipArt ,
                                 int A252CliCod ,
                                 byte A218BarTipCol ,
                                 String AV44MatDsc ,
                                 short AV43MatCod ,
                                 java.util.Date AV87fechadt ,
                                 long AV60ForRGB ,
                                 java.util.Date A5608HisProDf ,
                                 String A3610HisProLot ,
                                 byte AV86Grulec ,
                                 String AV75FasDivTime ,
                                 short A6680HisproTdab ,
                                 short A5605HisProTr2 ,
                                 byte A556HisProEst ,
                                 byte A148BarEstReo ,
                                 short A833TipDefCod ,
                                 String A834TipDefDsc ,
                                 short A656ParCod ,
                                 String A867ParCodNom ,
                                 String A457FasCod ,
                                 String AV76fase ,
                                 String A14054FasDivTime ,
                                 int A1933BarCodTin ,
                                 byte A1934BarReoTin ,
                                 String A1935BarParTin ,
                                 int AV57BarCod4 ,
                                 byte AV59BarCodReo4 ,
                                 String AV58BarCodPar4 ,
                                 String A1945BarMaqTin ,
                                 java.math.BigDecimal A8563BarKgsTt ,
                                 java.math.BigDecimal A1947BarKgmTin ,
                                 java.math.BigDecimal A3705BarCosCol ,
                                 java.math.BigDecimal A3658BarCosPA ,
                                 java.math.BigDecimal A3654BarCosPD ,
                                 java.math.BigDecimal A3657BarCosAA ,
                                 java.math.BigDecimal A3656BarCosAD ,
                                 java.math.BigDecimal A3706BarCosAnc ,
                                 String A2316BarAgrLot ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e151YM2 ();
      GRID_nCurrentRecord = 0 ;
      rf1YM2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV44MatDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMATDSC", GXutil.rtrim( AV44MatDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43MatCod), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMATCOD", GXutil.ltrim( localUtil.ntoc( AV43MatCod, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORRGB", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV60ForRGB), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORRGB", GXutil.ltrim( localUtil.ntoc( AV60ForRGB, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD4", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV57BarCod4), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD4", GXutil.ltrim( localUtil.ntoc( AV57BarCod4, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO4", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV59BarCodReo4), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO4", GXutil.ltrim( localUtil.ntoc( AV59BarCodReo4, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR4", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV58BarCodPar4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR4", GXutil.rtrim( AV58BarCodPar4));
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
      rf1YM2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV132Pgmname = "Produccion.InformeProduccionResumenHdr_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132Pgmname", AV132Pgmname);
      Gx_err = (short)(0) ;
      edtavCantidadregistros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantidadregistros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantidadregistros_Enabled), 5, 0), true);
      edtavGridrows_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGridrows_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridrows_Enabled), 5, 0), true);
      edtavGridpagecount_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGridpagecount_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridpagecount_Enabled), 5, 0), true);
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavMaqcodhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcodhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcodhdr_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprofec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprofec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprofec_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHidprolin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHidprolin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHidprolin_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprokgrhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprokgrhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprokgrhdr_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHispromtrhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHispromtrhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHispromtrhdr_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisproturhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisproturhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisproturhdr_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprof_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprof_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprof_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprodtihdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprodtihdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprodtihdr_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprodtfhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprodtfhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprodtfhdr_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHhmmalfa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHhmmalfa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHhmmalfa_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavMatcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMatcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMatcod_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavMatdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMatdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMatdsc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavOpecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOpecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpecod_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavFascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavFlagmarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFlagmarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFlagmarca_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavMinutos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMinutos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMinutos_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavOp4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOp4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBartipart4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartipart4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipart4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprotip4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprotip4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprotip4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavTipartdc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipartdc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprotc4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprotc4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprotc4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavTipcoldsc4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipcoldsc4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprodf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprodf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprodf_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarcod4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcod4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarcodpar4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpar4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarcodreo4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreo4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavForrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavForrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForrgb_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavTipdefcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipdefcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefcod_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavTipdefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipdefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefdsc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavCostei_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavCostet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavCostek_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHdrp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdrp_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarkgmtin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgmtin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgmtin_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarkgstt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgstt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgstt_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprotr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprotr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprotr2_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHorreaint_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHorreaint_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorreaint_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavMinrea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMinrea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMinrea_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavTotvaluehisprokgrhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehisprokgrhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisprokgrhdr_Enabled), 5, 0), true);
      edtavTotvaluehispromtrhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehispromtrhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehispromtrhdr_Enabled), 5, 0), true);
      edtavTotkhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotkhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotkhdr_Enabled), 5, 0), true);
      edtavTotmthdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotmthdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotmthdr_Enabled), 5, 0), true);
      edtavTiempom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTiempom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTiempom_Enabled), 5, 0), true);
   }

   public void rf1YM2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(52) ;
      /* Execute user event: Refresh */
      e151YM2 ();
      nGXsfl_52_idx = 1 ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_522( ) ;
      bGXsfl_52_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( subGrid_Islastpage != 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordcount( )-subgrid_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_522( ) ;
         e161YM2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_52_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e161YM2 ();
         }
         wbEnd = (short)(52) ;
         wb1YM0( ) ;
      }
      bGXsfl_52_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1YM2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATDSC"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, GXutil.rtrim( localUtil.format( AV44MatDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATCOD"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(AV43MatCod), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHADT", localUtil.ttoc( AV87fechadt, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFECHADT", getSecureSignedToken( sPrefix, localUtil.format( AV87fechadt, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORRGB"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(AV60ForRGB), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRULEC", GXutil.ltrim( localUtil.ntoc( AV86Grulec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGRULEC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV86Grulec), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASDIVTIME", GXutil.rtrim( AV75FasDivTime));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASDIVTIME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV75FasDivTime, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASE", GXutil.rtrim( AV76fase));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV76fase, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD4"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(AV57BarCod4), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO4"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(AV59BarCodReo4), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR4"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, GXutil.rtrim( localUtil.format( AV58BarCodPar4, ""))));
   }

   public int subgrid_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return (int)(((subGrid_Recordcount==0) ? GRID_nFirstRecordOnPage+1 : subGrid_Recordcount)) ;
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
      return (int)(((subGrid_Islastpage==1) ? subgrid_fnc_recordcount( )/ (double) (subgrid_fnc_recordsperpage( ))+((((int)((subgrid_fnc_recordcount( )) % (subgrid_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV21HisEstReo, AV22MaqCod1, AV23MaqCod2, AV24HisProFec1, AV25HisProFec2, AV13EmprCod, AV48FlagMarca, AV38HhMmAlfa, AV49Minutos, AV72HisProTr2, AV73HorReaInt, AV74MinRea, A396EmprCod, A602MaqCod, A558HisProFec, A561HisProLin, A4441HisProDTF, A3612HisProReo, A129BarCod, A132BarCodReo, A130BarCodPar, A4440HisProDTI, A1525HisProKgr, A1526HisProMtr, A566HisProTur, A279CliNom, A212BarSer, A135BarColNom, A136BarColNum, A557HisProF, A503GruOpeCod, A461Fase, A2247HisProTip, A3611HisProTc, A217BarTipArt, A252CliCod, A218BarTipCol, AV44MatDsc, AV43MatCod, AV87fechadt, AV60ForRGB, A5608HisProDf, A3610HisProLot, AV86Grulec, AV75FasDivTime, A6680HisproTdab, A5605HisProTr2, A556HisProEst, A148BarEstReo, A833TipDefCod, A834TipDefDsc, A656ParCod, A867ParCodNom, A457FasCod, AV76fase, A14054FasDivTime, A1933BarCodTin, A1934BarReoTin, A1935BarParTin, AV57BarCod4, AV59BarCodReo4, AV58BarCodPar4, A1945BarMaqTin, A8563BarKgsTt, A1947BarKgmTin, A3705BarCosCol, A3658BarCosPA, A3654BarCosPD, A3657BarCosAA, A3656BarCosAD, A3706BarCosAnc, A2316BarAgrLot, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV21HisEstReo, AV22MaqCod1, AV23MaqCod2, AV24HisProFec1, AV25HisProFec2, AV13EmprCod, AV48FlagMarca, AV38HhMmAlfa, AV49Minutos, AV72HisProTr2, AV73HorReaInt, AV74MinRea, A396EmprCod, A602MaqCod, A558HisProFec, A561HisProLin, A4441HisProDTF, A3612HisProReo, A129BarCod, A132BarCodReo, A130BarCodPar, A4440HisProDTI, A1525HisProKgr, A1526HisProMtr, A566HisProTur, A279CliNom, A212BarSer, A135BarColNom, A136BarColNum, A557HisProF, A503GruOpeCod, A461Fase, A2247HisProTip, A3611HisProTc, A217BarTipArt, A252CliCod, A218BarTipCol, AV44MatDsc, AV43MatCod, AV87fechadt, AV60ForRGB, A5608HisProDf, A3610HisProLot, AV86Grulec, AV75FasDivTime, A6680HisproTdab, A5605HisProTr2, A556HisProEst, A148BarEstReo, A833TipDefCod, A834TipDefDsc, A656ParCod, A867ParCodNom, A457FasCod, AV76fase, A14054FasDivTime, A1933BarCodTin, A1934BarReoTin, A1935BarParTin, AV57BarCod4, AV59BarCodReo4, AV58BarCodPar4, A1945BarMaqTin, A8563BarKgsTt, A1947BarKgmTin, A3705BarCosCol, A3658BarCosPA, A3654BarCosPD, A3657BarCosAA, A3656BarCosAD, A3706BarCosAnc, A2316BarAgrLot, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21HisEstReo, AV22MaqCod1, AV23MaqCod2, AV24HisProFec1, AV25HisProFec2, AV13EmprCod, AV48FlagMarca, AV38HhMmAlfa, AV49Minutos, AV72HisProTr2, AV73HorReaInt, AV74MinRea, A396EmprCod, A602MaqCod, A558HisProFec, A561HisProLin, A4441HisProDTF, A3612HisProReo, A129BarCod, A132BarCodReo, A130BarCodPar, A4440HisProDTI, A1525HisProKgr, A1526HisProMtr, A566HisProTur, A279CliNom, A212BarSer, A135BarColNom, A136BarColNum, A557HisProF, A503GruOpeCod, A461Fase, A2247HisProTip, A3611HisProTc, A217BarTipArt, A252CliCod, A218BarTipCol, AV44MatDsc, AV43MatCod, AV87fechadt, AV60ForRGB, A5608HisProDf, A3610HisProLot, AV86Grulec, AV75FasDivTime, A6680HisproTdab, A5605HisProTr2, A556HisProEst, A148BarEstReo, A833TipDefCod, A834TipDefDsc, A656ParCod, A867ParCodNom, A457FasCod, AV76fase, A14054FasDivTime, A1933BarCodTin, A1934BarReoTin, A1935BarParTin, AV57BarCod4, AV59BarCodReo4, AV58BarCodPar4, A1945BarMaqTin, A8563BarKgsTt, A1947BarKgmTin, A3705BarCosCol, A3658BarCosPA, A3654BarCosPD, A3657BarCosAA, A3656BarCosAD, A3706BarCosAnc, A2316BarAgrLot, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV21HisEstReo, AV22MaqCod1, AV23MaqCod2, AV24HisProFec1, AV25HisProFec2, AV13EmprCod, AV48FlagMarca, AV38HhMmAlfa, AV49Minutos, AV72HisProTr2, AV73HorReaInt, AV74MinRea, A396EmprCod, A602MaqCod, A558HisProFec, A561HisProLin, A4441HisProDTF, A3612HisProReo, A129BarCod, A132BarCodReo, A130BarCodPar, A4440HisProDTI, A1525HisProKgr, A1526HisProMtr, A566HisProTur, A279CliNom, A212BarSer, A135BarColNom, A136BarColNum, A557HisProF, A503GruOpeCod, A461Fase, A2247HisProTip, A3611HisProTc, A217BarTipArt, A252CliCod, A218BarTipCol, AV44MatDsc, AV43MatCod, AV87fechadt, AV60ForRGB, A5608HisProDf, A3610HisProLot, AV86Grulec, AV75FasDivTime, A6680HisproTdab, A5605HisProTr2, A556HisProEst, A148BarEstReo, A833TipDefCod, A834TipDefDsc, A656ParCod, A867ParCodNom, A457FasCod, AV76fase, A14054FasDivTime, A1933BarCodTin, A1934BarReoTin, A1935BarParTin, AV57BarCod4, AV59BarCodReo4, AV58BarCodPar4, A1945BarMaqTin, A8563BarKgsTt, A1947BarKgmTin, A3705BarCosCol, A3658BarCosPA, A3654BarCosPD, A3657BarCosAA, A3656BarCosAD, A3706BarCosAnc, A2316BarAgrLot, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21HisEstReo, AV22MaqCod1, AV23MaqCod2, AV24HisProFec1, AV25HisProFec2, AV13EmprCod, AV48FlagMarca, AV38HhMmAlfa, AV49Minutos, AV72HisProTr2, AV73HorReaInt, AV74MinRea, A396EmprCod, A602MaqCod, A558HisProFec, A561HisProLin, A4441HisProDTF, A3612HisProReo, A129BarCod, A132BarCodReo, A130BarCodPar, A4440HisProDTI, A1525HisProKgr, A1526HisProMtr, A566HisProTur, A279CliNom, A212BarSer, A135BarColNom, A136BarColNum, A557HisProF, A503GruOpeCod, A461Fase, A2247HisProTip, A3611HisProTc, A217BarTipArt, A252CliCod, A218BarTipCol, AV44MatDsc, AV43MatCod, AV87fechadt, AV60ForRGB, A5608HisProDf, A3610HisProLot, AV86Grulec, AV75FasDivTime, A6680HisproTdab, A5605HisProTr2, A556HisProEst, A148BarEstReo, A833TipDefCod, A834TipDefDsc, A656ParCod, A867ParCodNom, A457FasCod, AV76fase, A14054FasDivTime, A1933BarCodTin, A1934BarReoTin, A1935BarParTin, AV57BarCod4, AV59BarCodReo4, AV58BarCodPar4, A1945BarMaqTin, A8563BarKgsTt, A1947BarKgmTin, A3705BarCosCol, A3658BarCosPA, A3654BarCosPD, A3657BarCosAA, A3656BarCosAD, A3706BarCosAnc, A2316BarAgrLot, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV132Pgmname = "Produccion.InformeProduccionResumenHdr_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132Pgmname", AV132Pgmname);
      Gx_err = (short)(0) ;
      edtavCantidadregistros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantidadregistros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantidadregistros_Enabled), 5, 0), true);
      edtavGridrows_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGridrows_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridrows_Enabled), 5, 0), true);
      edtavGridpagecount_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGridpagecount_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridpagecount_Enabled), 5, 0), true);
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavMaqcodhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcodhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcodhdr_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprofec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprofec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprofec_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHidprolin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHidprolin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHidprolin_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprokgrhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprokgrhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprokgrhdr_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHispromtrhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHispromtrhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHispromtrhdr_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisproturhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisproturhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisproturhdr_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprof_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprof_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprof_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprodtihdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprodtihdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprodtihdr_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprodtfhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprodtfhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprodtfhdr_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHhmmalfa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHhmmalfa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHhmmalfa_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavMatcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMatcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMatcod_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavMatdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMatdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMatdsc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavOpecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOpecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpecod_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavFascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavFlagmarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFlagmarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFlagmarca_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavMinutos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMinutos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMinutos_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavOp4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOp4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOp4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBartipart4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBartipart4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipart4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprotip4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprotip4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprotip4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavTipartdc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipartdc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprotc4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprotc4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprotc4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavTipcoldsc4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipcoldsc4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcoldsc4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprodf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprodf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprodf_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarcod4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcod4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarcodpar4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpar4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarcodreo4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreo4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo4_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavForrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavForrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForrgb_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavTipdefcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipdefcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefcod_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavTipdefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipdefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefdsc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavCostei_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavCostet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavCostek_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHdrp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdrp_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarkgmtin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgmtin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgmtin_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavBarkgstt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgstt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgstt_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHisprotr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprotr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprotr2_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavHorreaint_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHorreaint_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorreaint_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavMinrea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMinrea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMinrea_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavTotvaluehisprokgrhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehisprokgrhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisprokgrhdr_Enabled), 5, 0), true);
      edtavTotvaluehispromtrhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehispromtrhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehispromtrhdr_Enabled), 5, 0), true);
      edtavTotkhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotkhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotkhdr_Enabled), 5, 0), true);
      edtavTotmthdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotmthdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotmthdr_Enabled), 5, 0), true);
      edtavTiempom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTiempom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTiempom_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1YM0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e141YM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV13EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV13EmprCod") ;
         wcpOAV21HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV22MaqCod1 = httpContext.cgiGet( sPrefix+"wcpOAV22MaqCod1") ;
         wcpOAV23MaqCod2 = httpContext.cgiGet( sPrefix+"wcpOAV23MaqCod2") ;
         wcpOAV24HisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV24HisProFec1"), 0) ;
         wcpOAV25HisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV25HisProFec2"), 0) ;
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
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCantidadregistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCantidadregistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDADREGISTROS");
            GX_FocusControl = edtavCantidadregistros_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV111CantidadRegistros = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111CantidadRegistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111CantidadRegistros), 12, 0));
         }
         else
         {
            AV111CantidadRegistros = localUtil.ctol( httpContext.cgiGet( edtavCantidadregistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111CantidadRegistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111CantidadRegistros), 12, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridrows_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridrows_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDROWS");
            GX_FocusControl = edtavGridrows_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV110GridRows = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110GridRows", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110GridRows), 6, 0));
         }
         else
         {
            AV110GridRows = (int)(localUtil.ctol( httpContext.cgiGet( edtavGridrows_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110GridRows", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110GridRows), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridpagecount_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridpagecount_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDPAGECOUNT");
            GX_FocusControl = edtavGridpagecount_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20GridPageCount = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridPageCount), 10, 0));
         }
         else
         {
            AV20GridPageCount = localUtil.ctol( httpContext.cgiGet( edtavGridpagecount_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridPageCount), 10, 0));
         }
         AV116TotValueHisProKgrHDR = httpContext.cgiGet( edtavTotvaluehisprokgrhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116TotValueHisProKgrHDR", AV116TotValueHisProKgrHDR);
         AV118TotValueHisProMtrHDR = httpContext.cgiGet( edtavTotvaluehispromtrhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TotValueHisProMtrHDR", AV118TotValueHisProMtrHDR);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotkhdr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotkhdr_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTKHDR");
            GX_FocusControl = edtavTotkhdr_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV91TotkHDR = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TotkHDR", GXutil.ltrimstr( AV91TotkHDR, 10, 2));
         }
         else
         {
            AV91TotkHDR = localUtil.ctond( httpContext.cgiGet( edtavTotkhdr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TotkHDR", GXutil.ltrimstr( AV91TotkHDR, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotmthdr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotmthdr_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTMTHDR");
            GX_FocusControl = edtavTotmthdr_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV90TotMtHDR = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TotMtHDR", GXutil.ltrimstr( AV90TotMtHDR, 10, 2));
         }
         else
         {
            AV90TotMtHDR = localUtil.ctond( httpContext.cgiGet( edtavTotmthdr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TotMtHDR", GXutil.ltrimstr( AV90TotMtHDR, 10, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTiempom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTiempom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIEMPOM");
            GX_FocusControl = edtavTiempom_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV88Tiempom = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88Tiempom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88Tiempom), 8, 0));
         }
         else
         {
            AV88Tiempom = (int)(localUtil.ctol( httpContext.cgiGet( edtavTiempom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88Tiempom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88Tiempom), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDCURRENTPAGE");
            GX_FocusControl = edtavGridcurrentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19GridCurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
         }
         else
         {
            AV19GridCurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
         }
         AV132Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132Pgmname", AV132Pgmname);
         /* Read subfile selected row values. */
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
      e141YM2 ();
      if (returnInSub) return;
   }

   public void e141YM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV124Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informeproduccionresumenhdr_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV124Station = GXt_char1 ;
      GXv_char2[0] = AV13EmprCod ;
      GXv_char3[0] = AV125EmprNom ;
      GXv_char4[0] = AV126UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV124Station, GXv_char2, GXv_char3, GXv_char4) ;
      informeproduccionresumenhdr_wc_impl.this.AV13EmprCod = GXv_char2[0] ;
      informeproduccionresumenhdr_wc_impl.this.AV125EmprNom = GXv_char3[0] ;
      informeproduccionresumenhdr_wc_impl.this.AV126UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV13EmprCod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      edtavPgmname_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Visible), 5, 0), true);
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV19GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
      edtavGridcurrentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGridcurrentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridcurrentpage_Visible), 5, 0), true);
      AV20GridPageCount = -1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridPageCount), 10, 0));
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int5 = AV86Grulec ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "GRUHDR", ""), GXv_int6) ;
      informeproduccionresumenhdr_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV86Grulec = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86Grulec", GXutil.str( AV86Grulec, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGRULEC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV86Grulec), "9")));
      GXt_int5 = AV95lecotex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "LECOTE", ""), GXv_int6) ;
      informeproduccionresumenhdr_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV95lecotex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95lecotex", GXutil.str( AV95lecotex, 1, 0));
      /* Execute user subroutine: 'TOTALES' */
      S122 ();
      if (returnInSub) return;
      this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "ProgressBar", new Object[] {Integer.valueOf(1),Integer.valueOf(100),Boolean.valueOf(false),httpContext.getMessage( "Iniciando Informe Produccion Resumen Hdr...", ""),httpContext.getMessage( "GXProgressBarDanger", "")}, true);
   }

   public void e151YM2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_int7 = AV111CantidadRegistros ;
      GXv_int8[0] = GXt_int7 ;
      new app.produccion.registroshdr(remoteHandle, context).execute( AV13EmprCod, AV21HisEstReo, AV22MaqCod1, AV23MaqCod2, AV24HisProFec1, AV25HisProFec2, GXv_int8) ;
      informeproduccionresumenhdr_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV111CantidadRegistros = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111CantidadRegistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111CantidadRegistros), 12, 0));
      AV110GridRows = ((subGrid_Rows==0) ? 1 : subGrid_Rows) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110GridRows", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110GridRows), 6, 0));
      AV20GridPageCount = (long)((AV111CantidadRegistros/ (double) (AV110GridRows))+1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridPageCount), 10, 0));
      AV19GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e161YM2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV91TotkHDR = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TotkHDR", GXutil.ltrimstr( AV91TotkHDR, 10, 2));
      AV90TotMtHDR = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TotMtHDR", GXutil.ltrimstr( AV90TotMtHDR, 10, 2));
      AV88Tiempom = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88Tiempom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88Tiempom), 8, 0));
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV21HisEstReo) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           A4441HisProDTF ,
                                           AV24HisProFec1 ,
                                           AV25HisProFec2 ,
                                           AV13EmprCod ,
                                           AV22MaqCod1 ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           AV23MaqCod2 } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      /* Using cursor H01YM2 */
      pr_default.execute(0, new Object[] {AV13EmprCod, AV22MaqCod1, AV24HisProFec1, AV25HisProFec2, AV23MaqCod2, Byte.valueOf(AV21HisEstReo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3612HisProReo = H01YM2_A3612HisProReo[0] ;
         A602MaqCod = H01YM2_A602MaqCod[0] ;
         A396EmprCod = H01YM2_A396EmprCod[0] ;
         A129BarCod = H01YM2_A129BarCod[0] ;
         A132BarCodReo = H01YM2_A132BarCodReo[0] ;
         A130BarCodPar = H01YM2_A130BarCodPar[0] ;
         A1525HisProKgr = H01YM2_A1525HisProKgr[0] ;
         A1526HisProMtr = H01YM2_A1526HisProMtr[0] ;
         A566HisProTur = H01YM2_A566HisProTur[0] ;
         A279CliNom = H01YM2_A279CliNom[0] ;
         A212BarSer = H01YM2_A212BarSer[0] ;
         A135BarColNom = H01YM2_A135BarColNom[0] ;
         A136BarColNum = H01YM2_A136BarColNum[0] ;
         A557HisProF = H01YM2_A557HisProF[0] ;
         A503GruOpeCod = H01YM2_A503GruOpeCod[0] ;
         A461Fase = H01YM2_A461Fase[0] ;
         A2247HisProTip = H01YM2_A2247HisProTip[0] ;
         A3611HisProTc = H01YM2_A3611HisProTc[0] ;
         A217BarTipArt = H01YM2_A217BarTipArt[0] ;
         n217BarTipArt = H01YM2_n217BarTipArt[0] ;
         A252CliCod = H01YM2_A252CliCod[0] ;
         n252CliCod = H01YM2_n252CliCod[0] ;
         A218BarTipCol = H01YM2_A218BarTipCol[0] ;
         A5608HisProDf = H01YM2_A5608HisProDf[0] ;
         A3610HisProLot = H01YM2_A3610HisProLot[0] ;
         A6680HisproTdab = H01YM2_A6680HisproTdab[0] ;
         A556HisProEst = H01YM2_A556HisProEst[0] ;
         A833TipDefCod = H01YM2_A833TipDefCod[0] ;
         n833TipDefCod = H01YM2_n833TipDefCod[0] ;
         A148BarEstReo = H01YM2_A148BarEstReo[0] ;
         A834TipDefDsc = H01YM2_A834TipDefDsc[0] ;
         n834TipDefDsc = H01YM2_n834TipDefDsc[0] ;
         A656ParCod = H01YM2_A656ParCod[0] ;
         n656ParCod = H01YM2_n656ParCod[0] ;
         A867ParCodNom = H01YM2_A867ParCodNom[0] ;
         n867ParCodNom = H01YM2_n867ParCodNom[0] ;
         A561HisProLin = H01YM2_A561HisProLin[0] ;
         A558HisProFec = H01YM2_A558HisProFec[0] ;
         A4440HisProDTI = H01YM2_A4440HisProDTI[0] ;
         n4440HisProDTI = H01YM2_n4440HisProDTI[0] ;
         A4441HisProDTF = H01YM2_A4441HisProDTF[0] ;
         n4441HisProDTF = H01YM2_n4441HisProDTF[0] ;
         A212BarSer = H01YM2_A212BarSer[0] ;
         A135BarColNom = H01YM2_A135BarColNom[0] ;
         A136BarColNum = H01YM2_A136BarColNum[0] ;
         A217BarTipArt = H01YM2_A217BarTipArt[0] ;
         n217BarTipArt = H01YM2_n217BarTipArt[0] ;
         A252CliCod = H01YM2_A252CliCod[0] ;
         n252CliCod = H01YM2_n252CliCod[0] ;
         A218BarTipCol = H01YM2_A218BarTipCol[0] ;
         A833TipDefCod = H01YM2_A833TipDefCod[0] ;
         n833TipDefCod = H01YM2_n833TipDefCod[0] ;
         A148BarEstReo = H01YM2_A148BarEstReo[0] ;
         A279CliNom = H01YM2_A279CliNom[0] ;
         A834TipDefDsc = H01YM2_A834TipDefDsc[0] ;
         n834TipDefDsc = H01YM2_n834TipDefDsc[0] ;
         A867ParCodNom = H01YM2_A867ParCodNom[0] ;
         n867ParCodNom = H01YM2_n867ParCodNom[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
         }
         AV50Op4 = httpContext.getMessage( "N", "") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOp4_Internalname, AV50Op4);
         AV57BarCod4 = A129BarCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcod4_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57BarCod4), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD4"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(AV57BarCod4), "ZZZZZZZ9")));
         AV59BarCodReo4 = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreo4_Internalname, GXutil.str( AV59BarCodReo4, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO4"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(AV59BarCodReo4), "9")));
         AV58BarCodPar4 = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpar4_Internalname, AV58BarCodPar4);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR4"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, GXutil.rtrim( localUtil.format( AV58BarCodPar4, ""))));
         AV28Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV28Hdr);
         AV79HisProLin = A561HisProLin ;
         AV30HisProFec = A558HisProFec ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprofec_Internalname, localUtil.format(AV30HisProFec, "99/99/99"));
         AV29MaqCodHdr = A602MaqCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqcodhdr_Internalname, AV29MaqCodHdr);
         AV37HisProDtfHdr = A4441HisProDTF ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprodtfhdr_Internalname, localUtil.ttoc( AV37HisProDtfHdr, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV36HisProDtiHdr = A4440HisProDTI ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprodtihdr_Internalname, localUtil.ttoc( AV36HisProDtiHdr, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV32HisProKgrHDR = A1525HisProKgr ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprokgrhdr_Internalname, GXutil.ltrimstr( AV32HisProKgrHDR, 9, 2));
         AV33HisProMtrHDR = A1526HisProMtr ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHispromtrhdr_Internalname, GXutil.ltrimstr( AV33HisProMtrHDR, 9, 2));
         AV34HisProTurHdr = A566HisProTur ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisproturhdr_Internalname, GXutil.str( AV34HisProTurHdr, 1, 0));
         AV39CliNom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClinom_Internalname, AV39CliNom);
         AV40BarSer = A212BarSer ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarser_Internalname, AV40BarSer);
         AV41BarColNom = A135BarColNom ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcolnom_Internalname, AV41BarColNom);
         AV42BarColNum = A136BarColNum ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42BarColNum), 6, 0));
         AV35HisProF = A557HisProF ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprof_Internalname, AV35HisProF);
         AV45OpeCod = A503GruOpeCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOpecod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45OpeCod), 6, 0));
         AV46FasCod = A461Fase ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFascod_Internalname, AV46FasCod);
         GXt_char1 = AV47FasDsc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char4) ;
         informeproduccionresumenhdr_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV47FasDsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdsc_Internalname, AV47FasDsc);
         AV52HisProTip4 = A2247HisProTip ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprotip4_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52HisProTip4), 4, 0));
         GXt_char1 = AV53TipArtDc ;
         GXv_char4[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A2247HisProTip, GXv_char4) ;
         informeproduccionresumenhdr_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV53TipArtDc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipartdc_Internalname, AV53TipArtDc);
         AV54HisProTc4 = A3611HisProTc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprotc4_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54HisProTc4), 4, 0));
         GXt_char1 = AV55TipColDsc4 ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A3611HisProTc ;
         GXv_char3[0] = GXt_char1 ;
         new app.pfcoldsc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
         informeproduccionresumenhdr_wc_impl.this.A396EmprCod = GXv_char4[0] ;
         informeproduccionresumenhdr_wc_impl.this.A3611HisProTc = GXv_int6[0] ;
         informeproduccionresumenhdr_wc_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A3611HisProTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3611HisProTc), 2, 0));
         AV55TipColDsc4 = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipcoldsc4_Internalname, AV55TipColDsc4);
         AV51BarTipArt4 = A217BarTipArt ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBartipart4_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51BarTipArt4), 4, 0));
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_char2[0] = A135BarColNom ;
         GXv_int10[0] = A136BarColNum ;
         GXv_int6[0] = A218BarTipCol ;
         GXv_char11[0] = "" ;
         GXv_char12[0] = AV44MatDsc ;
         GXv_int13[0] = AV43MatCod ;
         GXv_int14[0] = (byte)(0) ;
         GXv_char15[0] = "" ;
         GXv_char16[0] = "" ;
         GXv_int17[0] = 0 ;
         GXv_char18[0] = "" ;
         GXv_char19[0] = "" ;
         GXv_int20[0] = (short)(0) ;
         GXv_char21[0] = "" ;
         GXv_char22[0] = "" ;
         GXv_int23[0] = 0 ;
         GXv_decimal24[0] = DecimalUtil.doubleToDec(0) ;
         GXv_dtime25[0] = AV87fechadt ;
         GXv_char26[0] = "" ;
         new app.pmasinf2(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3, GXv_char2, GXv_int10, GXv_int6, GXv_char11, GXv_char12, GXv_int13, GXv_int14, GXv_char15, GXv_char16, GXv_int17, GXv_char18, GXv_char19, GXv_int20, GXv_char21, GXv_char22, GXv_int23, GXv_decimal24, GXv_dtime25, GXv_char26) ;
         informeproduccionresumenhdr_wc_impl.this.A396EmprCod = GXv_char4[0] ;
         informeproduccionresumenhdr_wc_impl.this.A252CliCod = GXv_int9[0] ;
         informeproduccionresumenhdr_wc_impl.this.A212BarSer = GXv_char3[0] ;
         informeproduccionresumenhdr_wc_impl.this.A135BarColNom = GXv_char2[0] ;
         informeproduccionresumenhdr_wc_impl.this.A136BarColNum = GXv_int10[0] ;
         informeproduccionresumenhdr_wc_impl.this.A218BarTipCol = GXv_int6[0] ;
         informeproduccionresumenhdr_wc_impl.this.AV44MatDsc = GXv_char12[0] ;
         informeproduccionresumenhdr_wc_impl.this.AV43MatCod = GXv_int13[0] ;
         informeproduccionresumenhdr_wc_impl.this.AV87fechadt = GXv_dtime25[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A212BarSer", A212BarSer);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A135BarColNom", A135BarColNom);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMatdsc_Internalname, AV44MatDsc);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATDSC"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, GXutil.rtrim( localUtil.format( AV44MatDsc, ""))));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMatcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43MatCod), 3, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMATCOD"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(AV43MatCod), "ZZ9")));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87fechadt", localUtil.ttoc( AV87fechadt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFECHADT", getSecureSignedToken( sPrefix, localUtil.format( AV87fechadt, "99/99/99 99:99")));
         GXv_char26[0] = A396EmprCod ;
         GXv_int23[0] = A252CliCod ;
         GXv_char22[0] = A212BarSer ;
         GXv_char21[0] = A135BarColNom ;
         GXv_int17[0] = A136BarColNum ;
         GXv_int14[0] = A218BarTipCol ;
         GXv_int8[0] = AV60ForRGB ;
         new app.pbusrgb(remoteHandle, context).execute( GXv_char26, GXv_int23, GXv_char22, GXv_char21, GXv_int17, GXv_int14, GXv_int8) ;
         informeproduccionresumenhdr_wc_impl.this.A396EmprCod = GXv_char26[0] ;
         informeproduccionresumenhdr_wc_impl.this.A252CliCod = GXv_int23[0] ;
         informeproduccionresumenhdr_wc_impl.this.A212BarSer = GXv_char22[0] ;
         informeproduccionresumenhdr_wc_impl.this.A135BarColNom = GXv_char21[0] ;
         informeproduccionresumenhdr_wc_impl.this.A136BarColNum = GXv_int17[0] ;
         informeproduccionresumenhdr_wc_impl.this.A218BarTipCol = GXv_int14[0] ;
         informeproduccionresumenhdr_wc_impl.this.AV60ForRGB = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A212BarSer", A212BarSer);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A135BarColNom", A135BarColNom);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavForrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60ForRGB), 10, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORRGB"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(AV60ForRGB), "ZZZZZZZZZ9")));
         GXv_int8[0] = AV60ForRGB ;
         GXv_int20[0] = AV61R ;
         GXv_int13[0] = AV62G ;
         GXv_int27[0] = AV63B ;
         new app.pleorgb(remoteHandle, context).execute( GXv_int8, GXv_int20, GXv_int13, GXv_int27) ;
         informeproduccionresumenhdr_wc_impl.this.AV60ForRGB = GXv_int8[0] ;
         informeproduccionresumenhdr_wc_impl.this.AV61R = GXv_int20[0] ;
         informeproduccionresumenhdr_wc_impl.this.AV62G = GXv_int13[0] ;
         informeproduccionresumenhdr_wc_impl.this.AV63B = GXv_int27[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavForrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60ForRGB), 10, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFORRGB"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(AV60ForRGB), "ZZZZZZZZZ9")));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61R), 3, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62G), 3, 0));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63B), 3, 0));
         GXv_char26[0] = A396EmprCod ;
         GXv_char22[0] = A461Fase ;
         GXv_char21[0] = AV80FasActTin ;
         new app.pfasest(remoteHandle, context).execute( GXv_char26, GXv_char22, GXv_char21) ;
         informeproduccionresumenhdr_wc_impl.this.A396EmprCod = GXv_char26[0] ;
         informeproduccionresumenhdr_wc_impl.this.A461Fase = GXv_char22[0] ;
         informeproduccionresumenhdr_wc_impl.this.AV80FasActTin = GXv_char21[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A461Fase", A461Fase);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80FasActTin", AV80FasActTin);
         AV81HisProLot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81HisProLot", AV81HisProLot);
         AV56HisProDf = A5608HisProDf ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprodf_Internalname, localUtil.format(AV56HisProDf, "99/99/99"));
         AV48FlagMarca = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFlagmarca_Internalname, GXutil.str( AV48FlagMarca, 1, 0));
         AV48FlagMarca = (byte)(((GXutil.strcmp(A3610HisProLot, AV81HisProLot)==0) ? 1 : 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFlagmarca_Internalname, GXutil.str( AV48FlagMarca, 1, 0));
         if ( AV86Grulec == 0 )
         {
            if ( GXutil.strcmp(AV80FasActTin, httpContext.getMessage( "N", "")) == 0 )
            {
               AV48FlagMarca = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFlagmarca_Internalname, GXutil.str( AV48FlagMarca, 1, 0));
            }
         }
         else
         {
            AV48FlagMarca = (byte)(((GXutil.strcmp(A3610HisProLot, AV81HisProLot)==0)&&(GXutil.strcmp(AV80FasActTin, httpContext.getMessage( "N", ""))==0) ? 1 : AV48FlagMarca)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFlagmarca_Internalname, GXutil.str( AV48FlagMarca, 1, 0));
         }
         AV76fase = A461Fase ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76fase", AV76fase);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV76fase, ""))));
         /* Execute user subroutine: 'FASPRO' */
         S133 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV38HhMmAlfa = " " ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHhmmalfa_Internalname, AV38HhMmAlfa);
         AV49Minutos = 0 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinutos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Minutos), 10, 0));
         AV72HisProTr2 = ((GXutil.strcmp(AV75FasDivTime, httpContext.getMessage( "S", ""))==0) ? A6680HisproTdab : A5605HisProTr2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprotr2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72HisProTr2), 4, 0));
         AV82HorRea = (short)(0) ;
         AV73HorReaInt = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorreaint_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73HorReaInt), 4, 0));
         AV74MinRea = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinrea_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74MinRea), 4, 0));
         if ( A556HisProEst != 0 )
         {
            AV83HhMm = DecimalUtil.doubleToDec(AV72HisProTr2/ (double) (60)) ;
            AV82HorRea = (short)(AV72HisProTr2/ (double) (60)) ;
            AV73HorReaInt = (short)(GXutil.Int( AV82HorRea)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorreaint_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73HorReaInt), 4, 0));
            AV74MinRea = (short)(AV72HisProTr2-(AV73HorReaInt*60)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinrea_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74MinRea), 4, 0));
            AV84Mmalfa = GXutil.padl( GXutil.trim( GXutil.str( AV74MinRea, 2, 0)), (short)(2), "0") ;
            AV85hhalfa = GXutil.str( AV73HorReaInt, 4, 0) ;
            AV38HhMmAlfa = AV85hhalfa + ":" + AV84Mmalfa ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHhmmalfa_Internalname, AV38HhMmAlfa);
            AV49Minutos = (long)((AV73HorReaInt*60)+AV74MinRea) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinutos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Minutos), 10, 0));
         }
         AV64TipDefCod = (short)(((A148BarEstReo==0) ? 0 : A833TipDefCod)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipdefcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TipDefCod), 4, 0));
         AV65TipDefDsc = ((A148BarEstReo==0) ? "" : A834TipDefDsc) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipdefdsc_Internalname, AV65TipDefDsc);
         AV129parcod = A656ParCod ;
         AV128parcodnom = A867ParCodNom ;
         /* Execute user subroutine: 'COSTES' */
         S143 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV91TotkHDR = AV91TotkHDR.add(A1525HisProKgr) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TotkHDR", GXutil.ltrimstr( AV91TotkHDR, 10, 2));
         AV90TotMtHDR = AV90TotMtHDR.add(A1526HisProMtr) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TotMtHDR", GXutil.ltrimstr( AV90TotMtHDR, 10, 2));
         AV88Tiempom = (int)(AV88Tiempom+(((GXutil.strcmp(AV75FasDivTime, httpContext.getMessage( "S", ""))==0) ? AV72HisProTr2 : ((AV48FlagMarca==1)&&(A556HisProEst!=0) ? AV72HisProTr2 : 0)))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88Tiempom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88Tiempom), 8, 0));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(52) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_522( ) ;
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
         if ( isFullAjaxMode( ) && ! bGXsfl_52_Refreshing )
         {
            httpContext.doAjaxLoad(52, GridRow);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /*  Sending Event outputs  */
   }

   public void e111YM2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         AV19GridCurrentPage = (long)(AV19GridCurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         AV19GridCurrentPage = (long)(AV19GridCurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
         subgrid_nextpage( ) ;
      }
      else
      {
         AV18PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         AV19GridCurrentPage = AV18PageToGo ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
         subgrid_gotopage( AV18PageToGo) ;
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
   }

   public void e121YM2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV19GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131YM2( )
   {
      /* 'DoButtonExcel' Routine */
      returnInSub = false ;
      GXv_char26[0] = AV127ExcelFilename ;
      GXv_char22[0] = AV100ErrorMessage ;
      new app.produccion.informeproduccionresumenhdr_usuwcexport(remoteHandle, context).execute( AV13EmprCod, AV21HisEstReo, AV22MaqCod1, AV23MaqCod2, AV24HisProFec1, AV25HisProFec2, GXv_char26, GXv_char22) ;
      informeproduccionresumenhdr_wc_impl.this.AV127ExcelFilename = GXv_char26[0] ;
      informeproduccionresumenhdr_wc_impl.this.AV100ErrorMessage = GXv_char22[0] ;
      if ( GXutil.strcmp(AV127ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV127ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV100ErrorMessage);
      }
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( AV95lecotex == 1 ) ) )
      {
         edtavCostei_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Visible), 5, 0), !bGXsfl_52_Refreshing);
      }
      if ( ! ( ( AV95lecotex == 1 ) ) )
      {
         edtavCostet_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Visible), 5, 0), !bGXsfl_52_Refreshing);
      }
      if ( ! ( ( AV95lecotex == 1 ) ) )
      {
         edtavCostek_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Visible), 5, 0), !bGXsfl_52_Refreshing);
      }
      if ( ! ( ( AV95lecotex == 1 ) ) )
      {
         edtavBarkgmtin_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgmtin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgmtin_Visible), 5, 0), !bGXsfl_52_Refreshing);
      }
      if ( ! ( ( AV95lecotex == 1 ) ) )
      {
         edtavBarkgstt_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarkgstt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgstt_Visible), 5, 0), !bGXsfl_52_Refreshing);
      }
      divUnnamedtable1_Visible = (((1==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divUnnamedtable1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable1_Visible), 5, 0), true);
      divTbl_totales_Visible = (((1==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTbl_totales_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTbl_totales_Visible), 5, 0), true);
   }

   public void S133( )
   {
      /* 'FASPRO' Routine */
      returnInSub = false ;
      AV75FasDivTime = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75FasDivTime", AV75FasDivTime);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASDIVTIME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV75FasDivTime, ""))));
      /* Using cursor H01YM3 */
      pr_default.execute(1, new Object[] {AV13EmprCod, AV76fase});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = H01YM3_A457FasCod[0] ;
         A396EmprCod = H01YM3_A396EmprCod[0] ;
         A14054FasDivTime = H01YM3_A14054FasDivTime[0] ;
         AV75FasDivTime = A14054FasDivTime ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75FasDivTime", AV75FasDivTime);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASDIVTIME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV75FasDivTime, ""))));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S143( )
   {
      /* 'COSTES' Routine */
      returnInSub = false ;
      AV71BarKgsTt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgstt_Internalname, GXutil.ltrimstr( AV71BarKgsTt, 10, 2));
      AV70BarKgmTin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgmtin_Internalname, GXutil.ltrimstr( AV70BarKgmTin, 9, 2));
      AV69HdrP = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrp_Internalname, AV69HdrP);
      /* Using cursor H01YM4 */
      pr_default.execute(2, new Object[] {AV13EmprCod, Integer.valueOf(AV57BarCod4), Byte.valueOf(AV59BarCodReo4), AV58BarCodPar4, AV22MaqCod1, AV23MaqCod2});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1945BarMaqTin = H01YM4_A1945BarMaqTin[0] ;
         n1945BarMaqTin = H01YM4_n1945BarMaqTin[0] ;
         A1935BarParTin = H01YM4_A1935BarParTin[0] ;
         n1935BarParTin = H01YM4_n1935BarParTin[0] ;
         A1934BarReoTin = H01YM4_A1934BarReoTin[0] ;
         n1934BarReoTin = H01YM4_n1934BarReoTin[0] ;
         A1933BarCodTin = H01YM4_A1933BarCodTin[0] ;
         n1933BarCodTin = H01YM4_n1933BarCodTin[0] ;
         A396EmprCod = H01YM4_A396EmprCod[0] ;
         A8563BarKgsTt = H01YM4_A8563BarKgsTt[0] ;
         n8563BarKgsTt = H01YM4_n8563BarKgsTt[0] ;
         A1947BarKgmTin = H01YM4_A1947BarKgmTin[0] ;
         n1947BarKgmTin = H01YM4_n1947BarKgmTin[0] ;
         A3654BarCosPD = H01YM4_A3654BarCosPD[0] ;
         n3654BarCosPD = H01YM4_n3654BarCosPD[0] ;
         A3658BarCosPA = H01YM4_A3658BarCosPA[0] ;
         n3658BarCosPA = H01YM4_n3658BarCosPA[0] ;
         A3705BarCosCol = H01YM4_A3705BarCosCol[0] ;
         n3705BarCosCol = H01YM4_n3705BarCosCol[0] ;
         A3706BarCosAnc = H01YM4_A3706BarCosAnc[0] ;
         n3706BarCosAnc = H01YM4_n3706BarCosAnc[0] ;
         A3656BarCosAD = H01YM4_A3656BarCosAD[0] ;
         n3656BarCosAD = H01YM4_n3656BarCosAD[0] ;
         A3657BarCosAA = H01YM4_A3657BarCosAA[0] ;
         n3657BarCosAA = H01YM4_n3657BarCosAA[0] ;
         A2316BarAgrLot = H01YM4_A2316BarAgrLot[0] ;
         n2316BarAgrLot = H01YM4_n2316BarAgrLot[0] ;
         AV71BarKgsTt = A8563BarKgsTt ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgstt_Internalname, GXutil.ltrimstr( AV71BarKgsTt, 10, 2));
         AV70BarKgmTin = A1947BarKgmTin ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarkgmtin_Internalname, GXutil.ltrimstr( AV70BarKgmTin, 9, 2));
         AV66CosteI = A3705BarCosCol.add(A3658BarCosPA).add(A3654BarCosPD) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostei_Internalname, GXutil.ltrimstr( AV66CosteI, 10, 2));
         AV67CosteT = A3657BarCosAA.add(A3656BarCosAD).add(A3706BarCosAnc).add(A3705BarCosCol).add(A3658BarCosPA).add(A3654BarCosPD) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostet_Internalname, GXutil.ltrimstr( AV67CosteT, 10, 2));
         AV93Dif = AV66CosteI.subtract(AV67CosteT) ;
         AV94Porc = DecimalUtil.doubleToDec(0) ;
         if ( AV66CosteI.doubleValue() != 0 )
         {
            AV94Porc = GXutil.roundDecimal( (AV93Dif.divide(AV66CosteI, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) ;
         }
         AV68CosteK = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV68CosteK, 10, 2));
         if ( AV70BarKgmTin.doubleValue() > 0 )
         {
            AV68CosteK = GXutil.roundDecimal( AV67CosteT.divide(AV70BarKgmTin, 18, java.math.RoundingMode.DOWN), 2) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV68CosteK, 10, 2));
         }
         AV69HdrP = GXutil.substring( A2316BarAgrLot, 1, 8) + "-" + GXutil.substring( A2316BarAgrLot, 9, 1) + GXutil.substring( A2316BarAgrLot, 10, 1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrp_Internalname, AV69HdrP);
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S122( )
   {
      /* 'TOTALES' Routine */
      returnInSub = false ;
      AV119TTotk = DecimalUtil.doubleToDec(0) ;
      AV120TTotMt = DecimalUtil.doubleToDec(0) ;
      AV123Ttiempom = 0 ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(AV21HisEstReo) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           A4441HisProDTF ,
                                           AV24HisProFec1 ,
                                           AV25HisProFec2 ,
                                           AV13EmprCod ,
                                           AV22MaqCod1 ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           AV23MaqCod2 } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      /* Using cursor H01YM5 */
      pr_default.execute(3, new Object[] {AV13EmprCod, AV22MaqCod1, AV24HisProFec1, AV25HisProFec2, AV23MaqCod2, Byte.valueOf(AV21HisEstReo)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A3612HisProReo = H01YM5_A3612HisProReo[0] ;
         A602MaqCod = H01YM5_A602MaqCod[0] ;
         A396EmprCod = H01YM5_A396EmprCod[0] ;
         A3610HisProLot = H01YM5_A3610HisProLot[0] ;
         A461Fase = H01YM5_A461Fase[0] ;
         A6680HisproTdab = H01YM5_A6680HisproTdab[0] ;
         A556HisProEst = H01YM5_A556HisProEst[0] ;
         A1525HisProKgr = H01YM5_A1525HisProKgr[0] ;
         A1526HisProMtr = H01YM5_A1526HisProMtr[0] ;
         A561HisProLin = H01YM5_A561HisProLin[0] ;
         A558HisProFec = H01YM5_A558HisProFec[0] ;
         A4440HisProDTI = H01YM5_A4440HisProDTI[0] ;
         n4440HisProDTI = H01YM5_n4440HisProDTI[0] ;
         A4441HisProDTF = H01YM5_A4441HisProDTF[0] ;
         n4441HisProDTF = H01YM5_n4441HisProDTF[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
         }
         AV48FlagMarca = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFlagmarca_Internalname, GXutil.str( AV48FlagMarca, 1, 0));
         AV48FlagMarca = (byte)(((GXutil.strcmp(A3610HisProLot, AV81HisProLot)==0) ? 1 : 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFlagmarca_Internalname, GXutil.str( AV48FlagMarca, 1, 0));
         if ( AV86Grulec == 0 )
         {
            if ( GXutil.strcmp(AV80FasActTin, httpContext.getMessage( "N", "")) == 0 )
            {
               AV48FlagMarca = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFlagmarca_Internalname, GXutil.str( AV48FlagMarca, 1, 0));
            }
         }
         else
         {
            AV48FlagMarca = (byte)(((GXutil.strcmp(A3610HisProLot, AV81HisProLot)==0)&&(GXutil.strcmp(AV80FasActTin, httpContext.getMessage( "N", ""))==0) ? 1 : AV48FlagMarca)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFlagmarca_Internalname, GXutil.str( AV48FlagMarca, 1, 0));
         }
         AV76fase = A461Fase ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76fase", AV76fase);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV76fase, ""))));
         /* Execute user subroutine: 'FASPRO' */
         S133 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            returnInSub = true;
            if (true) return;
         }
         AV38HhMmAlfa = " " ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHhmmalfa_Internalname, AV38HhMmAlfa);
         AV49Minutos = 0 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinutos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Minutos), 10, 0));
         AV72HisProTr2 = ((GXutil.strcmp(AV75FasDivTime, httpContext.getMessage( "S", ""))==0) ? A6680HisproTdab : A5605HisProTr2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprotr2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72HisProTr2), 4, 0));
         AV82HorRea = (short)(0) ;
         AV73HorReaInt = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorreaint_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73HorReaInt), 4, 0));
         AV74MinRea = (short)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinrea_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74MinRea), 4, 0));
         if ( A556HisProEst != 0 )
         {
            AV83HhMm = DecimalUtil.doubleToDec(AV72HisProTr2/ (double) (60)) ;
            AV82HorRea = (short)(AV72HisProTr2/ (double) (60)) ;
            AV73HorReaInt = (short)(GXutil.Int( AV82HorRea)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHorreaint_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73HorReaInt), 4, 0));
            AV74MinRea = (short)(AV72HisProTr2-(AV73HorReaInt*60)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinrea_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74MinRea), 4, 0));
            AV84Mmalfa = GXutil.padl( GXutil.trim( GXutil.str( AV74MinRea, 2, 0)), (short)(2), "0") ;
            AV85hhalfa = GXutil.str( AV73HorReaInt, 4, 0) ;
            AV38HhMmAlfa = AV85hhalfa + ":" + AV84Mmalfa ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHhmmalfa_Internalname, AV38HhMmAlfa);
            AV49Minutos = (long)((AV73HorReaInt*60)+AV74MinRea) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMinutos_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Minutos), 10, 0));
         }
         AV119TTotk = AV119TTotk.add(A1525HisProKgr) ;
         AV120TTotMt = AV120TTotMt.add(A1526HisProMtr) ;
         AV123Ttiempom = (int)(AV123Ttiempom+(((GXutil.strcmp(AV75FasDivTime, httpContext.getMessage( "S", ""))==0) ? AV72HisProTr2 : ((AV48FlagMarca==1)&&(A556HisProEst!=0) ? AV72HisProTr2 : 0)))) ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV115TotHisProKgrHDR = AV119TTotk ;
      AV117TotHisProMtrHDR = AV120TTotMt ;
      AV121TotHhMmAlfa = AV123Ttiempom ;
      AV116TotValueHisProKgrHDR = localUtil.format( AV115TotHisProKgrHDR, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116TotValueHisProKgrHDR", AV116TotValueHisProKgrHDR);
      AV118TotValueHisProMtrHDR = localUtil.format( AV117TotHisProMtrHDR, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TotValueHisProMtrHDR", AV118TotValueHisProMtrHDR);
      AV122TotValueHhMmAlfa = localUtil.format( DecimalUtil.doubleToDec(AV121TotHhMmAlfa), "ZZZ,ZZZ,ZZZ,ZZZ,ZZZ,ZZ9") ;
   }

   public void wb_table2_103_1YM2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehisprokgrhdr_Internalname, httpContext.getMessage( "Tot Value His Pro Kgr HDR", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'" + sPrefix + "',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehisprokgrhdr_Internalname, AV116TotValueHisProKgrHDR, GXutil.rtrim( localUtil.format( AV116TotValueHisProKgrHDR, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehisprokgrhdr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehisprokgrhdr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehispromtrhdr_Internalname, httpContext.getMessage( "Tot Value His Pro Mtr HDR", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'" + sPrefix + "',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehispromtrhdr_Internalname, AV118TotValueHisProMtrHDR, GXutil.rtrim( localUtil.format( AV118TotValueHisProMtrHDR, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehispromtrhdr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehispromtrhdr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenHdr_WC.htm");
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
         wb_table2_103_1YM2e( true) ;
      }
      else
      {
         wb_table2_103_1YM2e( false) ;
      }
   }

   public void wb_table1_22_1YM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='TextBlockTitleCell'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_hdr_Internalname, httpContext.getMessage( "Datos por Hdr", ""), "", "", lblTextblock_hdr_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenHdr_WC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_22_1YM2e( true) ;
      }
      else
      {
         wb_table1_22_1YM2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV13EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV13EmprCod);
      AV21HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HisEstReo", GXutil.str( AV21HisEstReo, 1, 0));
      AV22MaqCod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22MaqCod1", AV22MaqCod1);
      AV23MaqCod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCod2", AV23MaqCod2);
      AV24HisProFec1 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24HisProFec1", localUtil.ttoc( AV24HisProFec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV25HisProFec2 = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25HisProFec2", localUtil.ttoc( AV25HisProFec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      pa1YM2( ) ;
      ws1YM2( ) ;
      we1YM2( ) ;
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
      sCtrlAV13EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV21HisEstReo = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV22MaqCod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV23MaqCod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV24HisProFec1 = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV25HisProFec2 = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1YM2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\informeproduccionresumenhdr_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1YM2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV13EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV13EmprCod);
         AV21HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HisEstReo", GXutil.str( AV21HisEstReo, 1, 0));
         AV22MaqCod1 = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22MaqCod1", AV22MaqCod1);
         AV23MaqCod2 = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCod2", AV23MaqCod2);
         AV24HisProFec1 = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24HisProFec1", localUtil.ttoc( AV24HisProFec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV25HisProFec2 = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25HisProFec2", localUtil.ttoc( AV25HisProFec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      wcpOAV13EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV13EmprCod") ;
      wcpOAV21HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV22MaqCod1 = httpContext.cgiGet( sPrefix+"wcpOAV22MaqCod1") ;
      wcpOAV23MaqCod2 = httpContext.cgiGet( sPrefix+"wcpOAV23MaqCod2") ;
      wcpOAV24HisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV24HisProFec1"), 0) ;
      wcpOAV25HisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV25HisProFec2"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV13EmprCod, wcpOAV13EmprCod) != 0 ) || ( AV21HisEstReo != wcpOAV21HisEstReo ) || ( GXutil.strcmp(AV22MaqCod1, wcpOAV22MaqCod1) != 0 ) || ( GXutil.strcmp(AV23MaqCod2, wcpOAV23MaqCod2) != 0 ) || !( GXutil.dateCompare(AV24HisProFec1, wcpOAV24HisProFec1) ) || !( GXutil.dateCompare(AV25HisProFec2, wcpOAV25HisProFec2) ) ) )
      {
         setjustcreated();
      }
      wcpOAV13EmprCod = AV13EmprCod ;
      wcpOAV21HisEstReo = AV21HisEstReo ;
      wcpOAV22MaqCod1 = AV22MaqCod1 ;
      wcpOAV23MaqCod2 = AV23MaqCod2 ;
      wcpOAV24HisProFec1 = AV24HisProFec1 ;
      wcpOAV25HisProFec2 = AV25HisProFec2 ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV13EmprCod = httpContext.cgiGet( sPrefix+"AV13EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV13EmprCod) > 0 )
      {
         AV13EmprCod = httpContext.cgiGet( sCtrlAV13EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV13EmprCod);
      }
      else
      {
         AV13EmprCod = httpContext.cgiGet( sPrefix+"AV13EmprCod_PARM") ;
      }
      sCtrlAV21HisEstReo = httpContext.cgiGet( sPrefix+"AV21HisEstReo_CTRL") ;
      if ( GXutil.len( sCtrlAV21HisEstReo) > 0 )
      {
         AV21HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV21HisEstReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21HisEstReo", GXutil.str( AV21HisEstReo, 1, 0));
      }
      else
      {
         AV21HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV21HisEstReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV22MaqCod1 = httpContext.cgiGet( sPrefix+"AV22MaqCod1_CTRL") ;
      if ( GXutil.len( sCtrlAV22MaqCod1) > 0 )
      {
         AV22MaqCod1 = httpContext.cgiGet( sCtrlAV22MaqCod1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22MaqCod1", AV22MaqCod1);
      }
      else
      {
         AV22MaqCod1 = httpContext.cgiGet( sPrefix+"AV22MaqCod1_PARM") ;
      }
      sCtrlAV23MaqCod2 = httpContext.cgiGet( sPrefix+"AV23MaqCod2_CTRL") ;
      if ( GXutil.len( sCtrlAV23MaqCod2) > 0 )
      {
         AV23MaqCod2 = httpContext.cgiGet( sCtrlAV23MaqCod2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCod2", AV23MaqCod2);
      }
      else
      {
         AV23MaqCod2 = httpContext.cgiGet( sPrefix+"AV23MaqCod2_PARM") ;
      }
      sCtrlAV24HisProFec1 = httpContext.cgiGet( sPrefix+"AV24HisProFec1_CTRL") ;
      if ( GXutil.len( sCtrlAV24HisProFec1) > 0 )
      {
         AV24HisProFec1 = localUtil.ctot( httpContext.cgiGet( sCtrlAV24HisProFec1), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24HisProFec1", localUtil.ttoc( AV24HisProFec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV24HisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV24HisProFec1_PARM"), 0) ;
      }
      sCtrlAV25HisProFec2 = httpContext.cgiGet( sPrefix+"AV25HisProFec2_CTRL") ;
      if ( GXutil.len( sCtrlAV25HisProFec2) > 0 )
      {
         AV25HisProFec2 = localUtil.ctot( httpContext.cgiGet( sCtrlAV25HisProFec2), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25HisProFec2", localUtil.ttoc( AV25HisProFec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV25HisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV25HisProFec2_PARM"), 0) ;
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
      pa1YM2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1YM2( ) ;
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
      ws1YM2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13EmprCod_PARM", GXutil.rtrim( AV13EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13EmprCod_CTRL", GXutil.rtrim( sCtrlAV13EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21HisEstReo_PARM", GXutil.ltrim( localUtil.ntoc( AV21HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21HisEstReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21HisEstReo_CTRL", GXutil.rtrim( sCtrlAV21HisEstReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22MaqCod1_PARM", GXutil.rtrim( AV22MaqCod1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22MaqCod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22MaqCod1_CTRL", GXutil.rtrim( sCtrlAV22MaqCod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23MaqCod2_PARM", GXutil.rtrim( AV23MaqCod2));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23MaqCod2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23MaqCod2_CTRL", GXutil.rtrim( sCtrlAV23MaqCod2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24HisProFec1_PARM", localUtil.ttoc( AV24HisProFec1, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24HisProFec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24HisProFec1_CTRL", GXutil.rtrim( sCtrlAV24HisProFec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25HisProFec2_PARM", localUtil.ttoc( AV25HisProFec2, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25HisProFec2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25HisProFec2_CTRL", GXutil.rtrim( sCtrlAV25HisProFec2));
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
      we1YM2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211555443", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("produccion/informeproduccionresumenhdr_wc.js", "?20268211555444", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_522( )
   {
      edtavEmprcod_Internalname = sPrefix+"vEMPRCOD_"+sGXsfl_52_idx ;
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_52_idx ;
      edtavMaqcodhdr_Internalname = sPrefix+"vMAQCODHDR_"+sGXsfl_52_idx ;
      edtavHisprofec_Internalname = sPrefix+"vHISPROFEC_"+sGXsfl_52_idx ;
      edtavHidprolin_Internalname = sPrefix+"vHIDPROLIN_"+sGXsfl_52_idx ;
      edtavHisprokgrhdr_Internalname = sPrefix+"vHISPROKGRHDR_"+sGXsfl_52_idx ;
      edtavHispromtrhdr_Internalname = sPrefix+"vHISPROMTRHDR_"+sGXsfl_52_idx ;
      edtavHisproturhdr_Internalname = sPrefix+"vHISPROTURHDR_"+sGXsfl_52_idx ;
      edtavHisprof_Internalname = sPrefix+"vHISPROF_"+sGXsfl_52_idx ;
      edtavHisprodtihdr_Internalname = sPrefix+"vHISPRODTIHDR_"+sGXsfl_52_idx ;
      edtavHisprodtfhdr_Internalname = sPrefix+"vHISPRODTFHDR_"+sGXsfl_52_idx ;
      edtavHhmmalfa_Internalname = sPrefix+"vHHMMALFA_"+sGXsfl_52_idx ;
      edtavClinom_Internalname = sPrefix+"vCLINOM_"+sGXsfl_52_idx ;
      edtavBarser_Internalname = sPrefix+"vBARSER_"+sGXsfl_52_idx ;
      edtavBarcolnom_Internalname = sPrefix+"vBARCOLNOM_"+sGXsfl_52_idx ;
      edtavBarcolnum_Internalname = sPrefix+"vBARCOLNUM_"+sGXsfl_52_idx ;
      edtavMatcod_Internalname = sPrefix+"vMATCOD_"+sGXsfl_52_idx ;
      edtavMatdsc_Internalname = sPrefix+"vMATDSC_"+sGXsfl_52_idx ;
      edtavOpecod_Internalname = sPrefix+"vOPECOD_"+sGXsfl_52_idx ;
      edtavFascod_Internalname = sPrefix+"vFASCOD_"+sGXsfl_52_idx ;
      edtavFasdsc_Internalname = sPrefix+"vFASDSC_"+sGXsfl_52_idx ;
      edtavFlagmarca_Internalname = sPrefix+"vFLAGMARCA_"+sGXsfl_52_idx ;
      edtavMinutos_Internalname = sPrefix+"vMINUTOS_"+sGXsfl_52_idx ;
      edtavOp4_Internalname = sPrefix+"vOP4_"+sGXsfl_52_idx ;
      edtavBartipart4_Internalname = sPrefix+"vBARTIPART4_"+sGXsfl_52_idx ;
      edtavHisprotip4_Internalname = sPrefix+"vHISPROTIP4_"+sGXsfl_52_idx ;
      edtavTipartdc_Internalname = sPrefix+"vTIPARTDC_"+sGXsfl_52_idx ;
      edtavHisprotc4_Internalname = sPrefix+"vHISPROTC4_"+sGXsfl_52_idx ;
      edtavTipcoldsc4_Internalname = sPrefix+"vTIPCOLDSC4_"+sGXsfl_52_idx ;
      edtavHisprodf_Internalname = sPrefix+"vHISPRODF_"+sGXsfl_52_idx ;
      edtavBarcod4_Internalname = sPrefix+"vBARCOD4_"+sGXsfl_52_idx ;
      edtavBarcodpar4_Internalname = sPrefix+"vBARCODPAR4_"+sGXsfl_52_idx ;
      edtavBarcodreo4_Internalname = sPrefix+"vBARCODREO4_"+sGXsfl_52_idx ;
      edtavForrgb_Internalname = sPrefix+"vFORRGB_"+sGXsfl_52_idx ;
      edtavR_Internalname = sPrefix+"vR_"+sGXsfl_52_idx ;
      edtavG_Internalname = sPrefix+"vG_"+sGXsfl_52_idx ;
      edtavB_Internalname = sPrefix+"vB_"+sGXsfl_52_idx ;
      edtavTipdefcod_Internalname = sPrefix+"vTIPDEFCOD_"+sGXsfl_52_idx ;
      edtavTipdefdsc_Internalname = sPrefix+"vTIPDEFDSC_"+sGXsfl_52_idx ;
      edtavCostei_Internalname = sPrefix+"vCOSTEI_"+sGXsfl_52_idx ;
      edtavCostet_Internalname = sPrefix+"vCOSTET_"+sGXsfl_52_idx ;
      edtavCostek_Internalname = sPrefix+"vCOSTEK_"+sGXsfl_52_idx ;
      edtavHdrp_Internalname = sPrefix+"vHDRP_"+sGXsfl_52_idx ;
      edtavBarkgmtin_Internalname = sPrefix+"vBARKGMTIN_"+sGXsfl_52_idx ;
      edtavBarkgstt_Internalname = sPrefix+"vBARKGSTT_"+sGXsfl_52_idx ;
      edtavHisprotr2_Internalname = sPrefix+"vHISPROTR2_"+sGXsfl_52_idx ;
      edtavHorreaint_Internalname = sPrefix+"vHORREAINT_"+sGXsfl_52_idx ;
      edtavMinrea_Internalname = sPrefix+"vMINREA_"+sGXsfl_52_idx ;
   }

   public void subsflControlProps_fel_522( )
   {
      edtavEmprcod_Internalname = sPrefix+"vEMPRCOD_"+sGXsfl_52_fel_idx ;
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_52_fel_idx ;
      edtavMaqcodhdr_Internalname = sPrefix+"vMAQCODHDR_"+sGXsfl_52_fel_idx ;
      edtavHisprofec_Internalname = sPrefix+"vHISPROFEC_"+sGXsfl_52_fel_idx ;
      edtavHidprolin_Internalname = sPrefix+"vHIDPROLIN_"+sGXsfl_52_fel_idx ;
      edtavHisprokgrhdr_Internalname = sPrefix+"vHISPROKGRHDR_"+sGXsfl_52_fel_idx ;
      edtavHispromtrhdr_Internalname = sPrefix+"vHISPROMTRHDR_"+sGXsfl_52_fel_idx ;
      edtavHisproturhdr_Internalname = sPrefix+"vHISPROTURHDR_"+sGXsfl_52_fel_idx ;
      edtavHisprof_Internalname = sPrefix+"vHISPROF_"+sGXsfl_52_fel_idx ;
      edtavHisprodtihdr_Internalname = sPrefix+"vHISPRODTIHDR_"+sGXsfl_52_fel_idx ;
      edtavHisprodtfhdr_Internalname = sPrefix+"vHISPRODTFHDR_"+sGXsfl_52_fel_idx ;
      edtavHhmmalfa_Internalname = sPrefix+"vHHMMALFA_"+sGXsfl_52_fel_idx ;
      edtavClinom_Internalname = sPrefix+"vCLINOM_"+sGXsfl_52_fel_idx ;
      edtavBarser_Internalname = sPrefix+"vBARSER_"+sGXsfl_52_fel_idx ;
      edtavBarcolnom_Internalname = sPrefix+"vBARCOLNOM_"+sGXsfl_52_fel_idx ;
      edtavBarcolnum_Internalname = sPrefix+"vBARCOLNUM_"+sGXsfl_52_fel_idx ;
      edtavMatcod_Internalname = sPrefix+"vMATCOD_"+sGXsfl_52_fel_idx ;
      edtavMatdsc_Internalname = sPrefix+"vMATDSC_"+sGXsfl_52_fel_idx ;
      edtavOpecod_Internalname = sPrefix+"vOPECOD_"+sGXsfl_52_fel_idx ;
      edtavFascod_Internalname = sPrefix+"vFASCOD_"+sGXsfl_52_fel_idx ;
      edtavFasdsc_Internalname = sPrefix+"vFASDSC_"+sGXsfl_52_fel_idx ;
      edtavFlagmarca_Internalname = sPrefix+"vFLAGMARCA_"+sGXsfl_52_fel_idx ;
      edtavMinutos_Internalname = sPrefix+"vMINUTOS_"+sGXsfl_52_fel_idx ;
      edtavOp4_Internalname = sPrefix+"vOP4_"+sGXsfl_52_fel_idx ;
      edtavBartipart4_Internalname = sPrefix+"vBARTIPART4_"+sGXsfl_52_fel_idx ;
      edtavHisprotip4_Internalname = sPrefix+"vHISPROTIP4_"+sGXsfl_52_fel_idx ;
      edtavTipartdc_Internalname = sPrefix+"vTIPARTDC_"+sGXsfl_52_fel_idx ;
      edtavHisprotc4_Internalname = sPrefix+"vHISPROTC4_"+sGXsfl_52_fel_idx ;
      edtavTipcoldsc4_Internalname = sPrefix+"vTIPCOLDSC4_"+sGXsfl_52_fel_idx ;
      edtavHisprodf_Internalname = sPrefix+"vHISPRODF_"+sGXsfl_52_fel_idx ;
      edtavBarcod4_Internalname = sPrefix+"vBARCOD4_"+sGXsfl_52_fel_idx ;
      edtavBarcodpar4_Internalname = sPrefix+"vBARCODPAR4_"+sGXsfl_52_fel_idx ;
      edtavBarcodreo4_Internalname = sPrefix+"vBARCODREO4_"+sGXsfl_52_fel_idx ;
      edtavForrgb_Internalname = sPrefix+"vFORRGB_"+sGXsfl_52_fel_idx ;
      edtavR_Internalname = sPrefix+"vR_"+sGXsfl_52_fel_idx ;
      edtavG_Internalname = sPrefix+"vG_"+sGXsfl_52_fel_idx ;
      edtavB_Internalname = sPrefix+"vB_"+sGXsfl_52_fel_idx ;
      edtavTipdefcod_Internalname = sPrefix+"vTIPDEFCOD_"+sGXsfl_52_fel_idx ;
      edtavTipdefdsc_Internalname = sPrefix+"vTIPDEFDSC_"+sGXsfl_52_fel_idx ;
      edtavCostei_Internalname = sPrefix+"vCOSTEI_"+sGXsfl_52_fel_idx ;
      edtavCostet_Internalname = sPrefix+"vCOSTET_"+sGXsfl_52_fel_idx ;
      edtavCostek_Internalname = sPrefix+"vCOSTEK_"+sGXsfl_52_fel_idx ;
      edtavHdrp_Internalname = sPrefix+"vHDRP_"+sGXsfl_52_fel_idx ;
      edtavBarkgmtin_Internalname = sPrefix+"vBARKGMTIN_"+sGXsfl_52_fel_idx ;
      edtavBarkgstt_Internalname = sPrefix+"vBARKGSTT_"+sGXsfl_52_fel_idx ;
      edtavHisprotr2_Internalname = sPrefix+"vHISPROTR2_"+sGXsfl_52_fel_idx ;
      edtavHorreaint_Internalname = sPrefix+"vHORREAINT_"+sGXsfl_52_fel_idx ;
      edtavMinrea_Internalname = sPrefix+"vMINREA_"+sGXsfl_52_fel_idx ;
   }

   public void sendrow_522( )
   {
      subsflControlProps_522( ) ;
      wb1YM0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_52_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_52_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_52_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEmprcod_Internalname,GXutil.rtrim( AV13EmprCod),GXutil.rtrim( localUtil.format( AV13EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEmprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEmprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr_Internalname,GXutil.rtrim( AV28Hdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcodhdr_Internalname,GXutil.rtrim( AV29MaqCodHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcodhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMaqcodhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprofec_Internalname,localUtil.format(AV30HisProFec, "99/99/99"),localUtil.format( AV30HisProFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisprofec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHisprofec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHidprolin_Internalname,GXutil.ltrim( localUtil.ntoc( AV31HidProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHidprolin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV31HidProLin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV31HidProLin), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHidprolin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavHidprolin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprokgrhdr_Internalname,GXutil.ltrim( localUtil.ntoc( AV32HisProKgrHDR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHisprokgrhdr_Enabled!=0) ? localUtil.format( AV32HisProKgrHDR, "ZZZZZ9.99") : localUtil.format( AV32HisProKgrHDR, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisprokgrhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHisprokgrhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHispromtrhdr_Internalname,GXutil.ltrim( localUtil.ntoc( AV33HisProMtrHDR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHispromtrhdr_Enabled!=0) ? localUtil.format( AV33HisProMtrHDR, "ZZZZZ9.99") : localUtil.format( AV33HisProMtrHDR, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHispromtrhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHispromtrhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisproturhdr_Internalname,GXutil.ltrim( localUtil.ntoc( AV34HisProTurHdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHisproturhdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV34HisProTurHdr), "9") : localUtil.format( DecimalUtil.doubleToDec(AV34HisProTurHdr), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisproturhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHisproturhdr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprof_Internalname,GXutil.rtrim( AV35HisProF),GXutil.rtrim( localUtil.format( AV35HisProF, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisprof_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHisprof_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprodtihdr_Internalname,localUtil.ttoc( AV36HisProDtiHdr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( AV36HisProDtiHdr, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisprodtihdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHisprodtihdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprodtfhdr_Internalname,localUtil.ttoc( AV37HisProDtfHdr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( AV37HisProDtfHdr, "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisprodtfhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHisprodtfhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHhmmalfa_Internalname,GXutil.rtrim( AV38HhMmAlfa),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHhmmalfa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHhmmalfa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClinom_Internalname,GXutil.rtrim( AV39CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavClinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavClinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarser_Internalname,GXutil.rtrim( AV40BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcolnom_Internalname,GXutil.rtrim( AV41BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( AV42BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV42BarColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMatcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV43MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMatcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV43MatCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV43MatCod), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMatcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMatcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMatdsc_Internalname,GXutil.rtrim( AV44MatDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMatdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMatdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOpecod_Internalname,GXutil.ltrim( localUtil.ntoc( AV45OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavOpecod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV45OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV45OpeCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOpecod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOpecod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFascod_Internalname,GXutil.rtrim( AV46FasCod),GXutil.rtrim( localUtil.format( AV46FasCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFasdsc_Internalname,GXutil.rtrim( AV47FasDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFlagmarca_Internalname,GXutil.ltrim( localUtil.ntoc( AV48FlagMarca, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFlagmarca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV48FlagMarca), "9") : localUtil.format( DecimalUtil.doubleToDec(AV48FlagMarca), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFlagmarca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFlagmarca_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMinutos_Internalname,GXutil.ltrim( localUtil.ntoc( AV49Minutos, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMinutos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV49Minutos), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV49Minutos), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMinutos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMinutos_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOp4_Internalname,GXutil.rtrim( AV50Op4),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOp4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavOp4_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBartipart4_Internalname,GXutil.ltrim( localUtil.ntoc( AV51BarTipArt4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBartipart4_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV51BarTipArt4), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV51BarTipArt4), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBartipart4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBartipart4_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprotip4_Internalname,GXutil.ltrim( localUtil.ntoc( AV52HisProTip4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHisprotip4_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV52HisProTip4), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV52HisProTip4), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisprotip4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHisprotip4_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipartdc_Internalname,GXutil.rtrim( AV53TipArtDc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTipartdc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTipartdc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprotc4_Internalname,GXutil.ltrim( localUtil.ntoc( AV54HisProTc4, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHisprotc4_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV54HisProTc4), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV54HisProTc4), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisprotc4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHisprotc4_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipcoldsc4_Internalname,GXutil.rtrim( AV55TipColDsc4),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTipcoldsc4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTipcoldsc4_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprodf_Internalname,localUtil.format(AV56HisProDf, "99/99/99"),localUtil.format( AV56HisProDf, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisprodf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHisprodf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcod4_Internalname,GXutil.ltrim( localUtil.ntoc( AV57BarCod4, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcod4_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV57BarCod4), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV57BarCod4), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcod4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarcod4_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodpar4_Internalname,GXutil.rtrim( AV58BarCodPar4),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodpar4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarcodpar4_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodreo4_Internalname,GXutil.ltrim( localUtil.ntoc( AV59BarCodReo4, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcodreo4_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV59BarCodReo4), "9") : localUtil.format( DecimalUtil.doubleToDec(AV59BarCodReo4), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodreo4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarcodreo4_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavForrgb_Internalname,GXutil.ltrim( localUtil.ntoc( AV60ForRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavForrgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV60ForRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV60ForRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavForrgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavForrgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR_Internalname,GXutil.ltrim( localUtil.ntoc( AV61R, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV61R), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV61R), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG_Internalname,GXutil.ltrim( localUtil.ntoc( AV62G, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV62G), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV62G), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavG_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB_Internalname,GXutil.ltrim( localUtil.ntoc( AV63B, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV63B), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV63B), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipdefcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV64TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTipdefcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV64TipDefCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV64TipDefCod), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTipdefcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTipdefcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipdefdsc_Internalname,GXutil.rtrim( AV65TipDefDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTipdefdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTipdefdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostei_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostei_Internalname,GXutil.ltrim( localUtil.ntoc( AV66CosteI, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostei_Enabled!=0) ? localUtil.format( AV66CosteI, "ZZZZZZ9.99") : localUtil.format( AV66CosteI, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostei_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostei_Visible),Integer.valueOf(edtavCostei_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostet_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostet_Internalname,GXutil.ltrim( localUtil.ntoc( AV67CosteT, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostet_Enabled!=0) ? localUtil.format( AV67CosteT, "ZZZZZZ9.99") : localUtil.format( AV67CosteT, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostet_Visible),Integer.valueOf(edtavCostet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostek_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostek_Internalname,GXutil.ltrim( localUtil.ntoc( AV68CosteK, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostek_Enabled!=0) ? localUtil.format( AV68CosteK, "ZZZZZZ9.99") : localUtil.format( AV68CosteK, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostek_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostek_Visible),Integer.valueOf(edtavCostek_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdrp_Internalname,GXutil.rtrim( AV69HdrP),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHdrp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHdrp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarkgmtin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarkgmtin_Internalname,GXutil.ltrim( localUtil.ntoc( AV70BarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarkgmtin_Enabled!=0) ? localUtil.format( AV70BarKgmTin, "ZZZZZ9.99") : localUtil.format( AV70BarKgmTin, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarkgmtin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarkgmtin_Visible),Integer.valueOf(edtavBarkgmtin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavBarkgstt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarkgstt_Internalname,GXutil.ltrim( localUtil.ntoc( AV71BarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarkgstt_Enabled!=0) ? localUtil.format( AV71BarKgsTt, "ZZZZZZ9.99") : localUtil.format( AV71BarKgsTt, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarkgstt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarkgstt_Visible),Integer.valueOf(edtavBarkgstt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprotr2_Internalname,GXutil.ltrim( localUtil.ntoc( AV72HisProTr2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHisprotr2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV72HisProTr2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV72HisProTr2), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisprotr2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHisprotr2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHorreaint_Internalname,GXutil.ltrim( localUtil.ntoc( AV73HorReaInt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHorreaint_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV73HorReaInt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV73HorReaInt), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHorreaint_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHorreaint_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMinrea_Internalname,GXutil.ltrim( localUtil.ntoc( AV74MinRea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMinrea_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV74MinRea), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV74MinRea), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMinrea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMinrea_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1YM2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_52_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      /* End function sendrow_522 */
   }

   public void startgridcontrol52( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"52\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HhMm", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tono", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Flag", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Minutos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T.Art.Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "BarCod4", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "BarCodPar4", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "BarCodReo4", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "For Rgb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "G", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "B", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Defecto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostei_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste I", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostet_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste T", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostek_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste p/k", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr.P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarkgmtin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarkgstt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs.Tot", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TReal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hh", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mm", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV13EmprCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEmprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV28Hdr));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV29MaqCodHdr));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcodhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV30HisProFec, "99/99/99"));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprofec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV31HidProLin, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHidprolin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV32HisProKgrHDR, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprokgrhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV33HisProMtrHDR, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHispromtrhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV34HisProTurHdr, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisproturhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV35HisProF));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprof_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( AV36HisProDtiHdr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprodtihdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( AV37HisProDtfHdr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprodtfhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV38HhMmAlfa));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHhmmalfa_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV39CliNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV40BarSer));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV41BarColNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV43MatCod, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMatcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV44MatDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMatdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV45OpeCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOpecod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV46FasCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV47FasDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV48FlagMarca, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFlagmarca_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV49Minutos, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMinutos_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV50Op4));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOp4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV51BarTipArt4, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBartipart4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV52HisProTip4, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprotip4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV53TipArtDc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipartdc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV54HisProTc4, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprotc4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV55TipColDsc4));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipcoldsc4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV56HisProDf, "99/99/99"));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprodf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV57BarCod4, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcod4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV58BarCodPar4));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcodpar4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV59BarCodReo4, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcodreo4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV60ForRGB, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavForrgb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV61R, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV62G, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV63B, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV64TipDefCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipdefcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV65TipDefDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipdefdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV66CosteI, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostei_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostei_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV67CosteT, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostet_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostet_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV68CosteK, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostek_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostek_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV69HdrP));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdrp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV70BarKgmTin, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarkgmtin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarkgmtin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV71BarKgsTt, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarkgstt_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarkgstt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV72HisProTr2, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprotr2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV73HorReaInt, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHorreaint_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV74MinRea, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMinrea_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnbuttonexcel_Internalname = sPrefix+"BTNBUTTONEXCEL" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      lblTextblock_hdr_Internalname = sPrefix+"TEXTBLOCK_HDR" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavCantidadregistros_Internalname = sPrefix+"vCANTIDADREGISTROS" ;
      edtavGridrows_Internalname = sPrefix+"vGRIDROWS" ;
      edtavGridpagecount_Internalname = sPrefix+"vGRIDPAGECOUNT" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtavEmprcod_Internalname = sPrefix+"vEMPRCOD" ;
      edtavHdr_Internalname = sPrefix+"vHDR" ;
      edtavMaqcodhdr_Internalname = sPrefix+"vMAQCODHDR" ;
      edtavHisprofec_Internalname = sPrefix+"vHISPROFEC" ;
      edtavHidprolin_Internalname = sPrefix+"vHIDPROLIN" ;
      edtavHisprokgrhdr_Internalname = sPrefix+"vHISPROKGRHDR" ;
      edtavHispromtrhdr_Internalname = sPrefix+"vHISPROMTRHDR" ;
      edtavHisproturhdr_Internalname = sPrefix+"vHISPROTURHDR" ;
      edtavHisprof_Internalname = sPrefix+"vHISPROF" ;
      edtavHisprodtihdr_Internalname = sPrefix+"vHISPRODTIHDR" ;
      edtavHisprodtfhdr_Internalname = sPrefix+"vHISPRODTFHDR" ;
      edtavHhmmalfa_Internalname = sPrefix+"vHHMMALFA" ;
      edtavClinom_Internalname = sPrefix+"vCLINOM" ;
      edtavBarser_Internalname = sPrefix+"vBARSER" ;
      edtavBarcolnom_Internalname = sPrefix+"vBARCOLNOM" ;
      edtavBarcolnum_Internalname = sPrefix+"vBARCOLNUM" ;
      edtavMatcod_Internalname = sPrefix+"vMATCOD" ;
      edtavMatdsc_Internalname = sPrefix+"vMATDSC" ;
      edtavOpecod_Internalname = sPrefix+"vOPECOD" ;
      edtavFascod_Internalname = sPrefix+"vFASCOD" ;
      edtavFasdsc_Internalname = sPrefix+"vFASDSC" ;
      edtavFlagmarca_Internalname = sPrefix+"vFLAGMARCA" ;
      edtavMinutos_Internalname = sPrefix+"vMINUTOS" ;
      edtavOp4_Internalname = sPrefix+"vOP4" ;
      edtavBartipart4_Internalname = sPrefix+"vBARTIPART4" ;
      edtavHisprotip4_Internalname = sPrefix+"vHISPROTIP4" ;
      edtavTipartdc_Internalname = sPrefix+"vTIPARTDC" ;
      edtavHisprotc4_Internalname = sPrefix+"vHISPROTC4" ;
      edtavTipcoldsc4_Internalname = sPrefix+"vTIPCOLDSC4" ;
      edtavHisprodf_Internalname = sPrefix+"vHISPRODF" ;
      edtavBarcod4_Internalname = sPrefix+"vBARCOD4" ;
      edtavBarcodpar4_Internalname = sPrefix+"vBARCODPAR4" ;
      edtavBarcodreo4_Internalname = sPrefix+"vBARCODREO4" ;
      edtavForrgb_Internalname = sPrefix+"vFORRGB" ;
      edtavR_Internalname = sPrefix+"vR" ;
      edtavG_Internalname = sPrefix+"vG" ;
      edtavB_Internalname = sPrefix+"vB" ;
      edtavTipdefcod_Internalname = sPrefix+"vTIPDEFCOD" ;
      edtavTipdefdsc_Internalname = sPrefix+"vTIPDEFDSC" ;
      edtavCostei_Internalname = sPrefix+"vCOSTEI" ;
      edtavCostet_Internalname = sPrefix+"vCOSTET" ;
      edtavCostek_Internalname = sPrefix+"vCOSTEK" ;
      edtavHdrp_Internalname = sPrefix+"vHDRP" ;
      edtavBarkgmtin_Internalname = sPrefix+"vBARKGMTIN" ;
      edtavBarkgstt_Internalname = sPrefix+"vBARKGSTT" ;
      edtavHisprotr2_Internalname = sPrefix+"vHISPROTR2" ;
      edtavHorreaint_Internalname = sPrefix+"vHORREAINT" ;
      edtavMinrea_Internalname = sPrefix+"vMINREA" ;
      edtavTotvaluehisprokgrhdr_Internalname = sPrefix+"vTOTVALUEHISPROKGRHDR" ;
      edtavTotvaluehispromtrhdr_Internalname = sPrefix+"vTOTVALUEHISPROMTRHDR" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavTotkhdr_Internalname = sPrefix+"vTOTKHDR" ;
      edtavTotmthdr_Internalname = sPrefix+"vTOTMTHDR" ;
      edtavTiempom_Internalname = sPrefix+"vTIEMPOM" ;
      divTbl_totales_Internalname = sPrefix+"TBL_TOTALES" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      edtavGridcurrentpage_Internalname = sPrefix+"vGRIDCURRENTPAGE" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
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
      edtavMinrea_Jsonclick = "" ;
      edtavMinrea_Enabled = 0 ;
      edtavHorreaint_Jsonclick = "" ;
      edtavHorreaint_Enabled = 0 ;
      edtavHisprotr2_Jsonclick = "" ;
      edtavHisprotr2_Enabled = 0 ;
      edtavBarkgstt_Jsonclick = "" ;
      edtavBarkgstt_Enabled = 0 ;
      edtavBarkgmtin_Jsonclick = "" ;
      edtavBarkgmtin_Enabled = 0 ;
      edtavHdrp_Jsonclick = "" ;
      edtavHdrp_Enabled = 0 ;
      edtavCostek_Jsonclick = "" ;
      edtavCostek_Enabled = 0 ;
      edtavCostet_Jsonclick = "" ;
      edtavCostet_Enabled = 0 ;
      edtavCostei_Jsonclick = "" ;
      edtavCostei_Enabled = 0 ;
      edtavTipdefdsc_Jsonclick = "" ;
      edtavTipdefdsc_Enabled = 0 ;
      edtavTipdefcod_Jsonclick = "" ;
      edtavTipdefcod_Enabled = 0 ;
      edtavB_Jsonclick = "" ;
      edtavB_Enabled = 0 ;
      edtavG_Jsonclick = "" ;
      edtavG_Enabled = 0 ;
      edtavR_Jsonclick = "" ;
      edtavR_Enabled = 0 ;
      edtavForrgb_Jsonclick = "" ;
      edtavForrgb_Enabled = 0 ;
      edtavBarcodreo4_Jsonclick = "" ;
      edtavBarcodreo4_Enabled = 0 ;
      edtavBarcodpar4_Jsonclick = "" ;
      edtavBarcodpar4_Enabled = 0 ;
      edtavBarcod4_Jsonclick = "" ;
      edtavBarcod4_Enabled = 0 ;
      edtavHisprodf_Jsonclick = "" ;
      edtavHisprodf_Enabled = 0 ;
      edtavTipcoldsc4_Jsonclick = "" ;
      edtavTipcoldsc4_Enabled = 0 ;
      edtavHisprotc4_Jsonclick = "" ;
      edtavHisprotc4_Enabled = 0 ;
      edtavTipartdc_Jsonclick = "" ;
      edtavTipartdc_Enabled = 0 ;
      edtavHisprotip4_Jsonclick = "" ;
      edtavHisprotip4_Enabled = 0 ;
      edtavBartipart4_Jsonclick = "" ;
      edtavBartipart4_Enabled = 0 ;
      edtavOp4_Jsonclick = "" ;
      edtavOp4_Enabled = 0 ;
      edtavMinutos_Jsonclick = "" ;
      edtavMinutos_Enabled = 0 ;
      edtavFlagmarca_Jsonclick = "" ;
      edtavFlagmarca_Enabled = 0 ;
      edtavFasdsc_Jsonclick = "" ;
      edtavFasdsc_Enabled = 0 ;
      edtavFascod_Jsonclick = "" ;
      edtavFascod_Enabled = 0 ;
      edtavOpecod_Jsonclick = "" ;
      edtavOpecod_Enabled = 0 ;
      edtavMatdsc_Jsonclick = "" ;
      edtavMatdsc_Enabled = 0 ;
      edtavMatcod_Jsonclick = "" ;
      edtavMatcod_Enabled = 0 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavHhmmalfa_Jsonclick = "" ;
      edtavHhmmalfa_Enabled = 0 ;
      edtavHisprodtfhdr_Jsonclick = "" ;
      edtavHisprodtfhdr_Enabled = 0 ;
      edtavHisprodtihdr_Jsonclick = "" ;
      edtavHisprodtihdr_Enabled = 0 ;
      edtavHisprof_Jsonclick = "" ;
      edtavHisprof_Enabled = 0 ;
      edtavHisproturhdr_Jsonclick = "" ;
      edtavHisproturhdr_Enabled = 0 ;
      edtavHispromtrhdr_Jsonclick = "" ;
      edtavHispromtrhdr_Enabled = 0 ;
      edtavHisprokgrhdr_Jsonclick = "" ;
      edtavHisprokgrhdr_Enabled = 0 ;
      edtavHidprolin_Jsonclick = "" ;
      edtavHidprolin_Enabled = 0 ;
      edtavHisprofec_Jsonclick = "" ;
      edtavHisprofec_Enabled = 0 ;
      edtavMaqcodhdr_Jsonclick = "" ;
      edtavMaqcodhdr_Enabled = 0 ;
      edtavHdr_Jsonclick = "" ;
      edtavHdr_Enabled = 0 ;
      edtavEmprcod_Jsonclick = "" ;
      edtavEmprcod_Enabled = 0 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluehispromtrhdr_Jsonclick = "" ;
      edtavTotvaluehispromtrhdr_Enabled = 1 ;
      edtavTotvaluehisprokgrhdr_Jsonclick = "" ;
      edtavTotvaluehisprokgrhdr_Enabled = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Visible = 1 ;
      edtavGridcurrentpage_Jsonclick = "" ;
      edtavGridcurrentpage_Visible = 1 ;
      edtavTiempom_Jsonclick = "" ;
      edtavTiempom_Enabled = 1 ;
      edtavTotmthdr_Jsonclick = "" ;
      edtavTotmthdr_Enabled = 1 ;
      edtavTotkhdr_Jsonclick = "" ;
      edtavTotkhdr_Enabled = 1 ;
      divTbl_totales_Visible = 1 ;
      edtavGridpagecount_Jsonclick = "" ;
      edtavGridpagecount_Enabled = 1 ;
      edtavGridrows_Jsonclick = "" ;
      edtavGridrows_Enabled = 1 ;
      edtavCantidadregistros_Jsonclick = "" ;
      edtavCantidadregistros_Enabled = 1 ;
      divUnnamedtable1_Visible = 1 ;
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
      edtavBarkgstt_Visible = -1 ;
      edtavBarkgmtin_Visible = -1 ;
      edtavCostek_Visible = -1 ;
      edtavCostet_Visible = -1 ;
      edtavCostei_Visible = -1 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'edtavCostei_Visible',ctrl:'vCOSTEI',prop:'Visible'},{av:'edtavCostet_Visible',ctrl:'vCOSTET',prop:'Visible'},{av:'edtavCostek_Visible',ctrl:'vCOSTEK',prop:'Visible'},{av:'edtavBarkgmtin_Visible',ctrl:'vBARKGMTIN',prop:'Visible'},{av:'edtavBarkgstt_Visible',ctrl:'vBARKGSTT',prop:'Visible'},{av:'AV48FlagMarca',fld:'vFLAGMARCA',pic:'9'},{av:'AV38HhMmAlfa',fld:'vHHMMALFA',pic:''},{av:'AV49Minutos',fld:'vMINUTOS',pic:'ZZZZZZZZZ9'},{av:'AV72HisProTr2',fld:'vHISPROTR2',pic:'ZZZ9'},{av:'AV73HorReaInt',fld:'vHORREAINT',pic:'ZZZ9'},{av:'AV74MinRea',fld:'vMINREA',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A4440HisProDTI',fld:'HISPRODTI',pic:'99/99/99 99:99:99'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'},{av:'A3611HisProTc',fld:'HISPROTC',pic:'Z9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'AV44MatDsc',fld:'vMATDSC',pic:'',hsh:true},{av:'AV43MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV60ForRGB',fld:'vFORRGB',pic:'ZZZZZZZZZ9',hsh:true},{av:'A5608HisProDf',fld:'HISPRODF',pic:''},{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'A6680HisproTdab',fld:'HISPROTDAB',pic:'ZZZ9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'A556HisProEst',fld:'HISPROEST',pic:'9'},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A14054FasDivTime',fld:'FASDIVTIME',pic:''},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'AV57BarCod4',fld:'vBARCOD4',pic:'ZZZZZZZ9',hsh:true},{av:'AV59BarCodReo4',fld:'vBARCODREO4',pic:'9',hsh:true},{av:'AV58BarCodPar4',fld:'vBARCODPAR4',pic:'',hsh:true},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A8563BarKgsTt',fld:'BARKGSTT',pic:'ZZZZZZ9.99'},{av:'A1947BarKgmTin',fld:'BARKGMTIN',pic:'ZZZZZ9.99'},{av:'A3705BarCosCol',fld:'BARCOSCOL',pic:'ZZZZZZ9.99'},{av:'A3658BarCosPA',fld:'BARCOSPA',pic:'ZZZZZZ9.99'},{av:'A3654BarCosPD',fld:'BARCOSPD',pic:'ZZZZZZ9.99'},{av:'A3657BarCosAA',fld:'BARCOSAA',pic:'ZZZZZZ9.99'},{av:'A3656BarCosAD',fld:'BARCOSAD',pic:'ZZZZZZ9.99'},{av:'A3706BarCosAnc',fld:'BARCOSANC',pic:'ZZZZZZ9.99'},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''},{av:'sPrefix'},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV21HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV22MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV23MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV24HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99'},{av:'AV25HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV87fechadt',fld:'vFECHADT',pic:'99/99/99 99:99',hsh:true},{av:'AV86Grulec',fld:'vGRULEC',pic:'9',hsh:true},{av:'AV75FasDivTime',fld:'vFASDIVTIME',pic:'',hsh:true},{av:'AV76fase',fld:'vFASE',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV111CantidadRegistros',fld:'vCANTIDADREGISTROS',pic:'ZZZZZZZZZZZ9'},{av:'AV110GridRows',fld:'vGRIDROWS',pic:'ZZZZZ9'},{av:'AV20GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e161YM2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV23MaqCod2',fld:'vMAQCOD2',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV24HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99'},{av:'AV25HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'AV21HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A4440HisProDTI',fld:'HISPRODTI',pic:'99/99/99 99:99:99'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'},{av:'A3611HisProTc',fld:'HISPROTC',pic:'Z9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'AV44MatDsc',fld:'vMATDSC',pic:'',hsh:true},{av:'AV43MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV87fechadt',fld:'vFECHADT',pic:'99/99/99 99:99',hsh:true},{av:'AV60ForRGB',fld:'vFORRGB',pic:'ZZZZZZZZZ9',hsh:true},{av:'A5608HisProDf',fld:'HISPRODF',pic:''},{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'AV86Grulec',fld:'vGRULEC',pic:'9',hsh:true},{av:'AV75FasDivTime',fld:'vFASDIVTIME',pic:'',hsh:true},{av:'A6680HisproTdab',fld:'HISPROTDAB',pic:'ZZZ9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'A556HisProEst',fld:'HISPROEST',pic:'9'},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'AV76fase',fld:'vFASE',pic:'',hsh:true},{av:'A14054FasDivTime',fld:'FASDIVTIME',pic:''},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'AV57BarCod4',fld:'vBARCOD4',pic:'ZZZZZZZ9',hsh:true},{av:'AV59BarCodReo4',fld:'vBARCODREO4',pic:'9',hsh:true},{av:'AV58BarCodPar4',fld:'vBARCODPAR4',pic:'',hsh:true},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A8563BarKgsTt',fld:'BARKGSTT',pic:'ZZZZZZ9.99'},{av:'A1947BarKgmTin',fld:'BARKGMTIN',pic:'ZZZZZ9.99'},{av:'A3705BarCosCol',fld:'BARCOSCOL',pic:'ZZZZZZ9.99'},{av:'A3658BarCosPA',fld:'BARCOSPA',pic:'ZZZZZZ9.99'},{av:'A3654BarCosPD',fld:'BARCOSPD',pic:'ZZZZZZ9.99'},{av:'A3657BarCosAA',fld:'BARCOSAA',pic:'ZZZZZZ9.99'},{av:'A3656BarCosAD',fld:'BARCOSAD',pic:'ZZZZZZ9.99'},{av:'A3706BarCosAnc',fld:'BARCOSANC',pic:'ZZZZZZ9.99'},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV91TotkHDR',fld:'vTOTKHDR',pic:'ZZZZZZ9.99'},{av:'AV90TotMtHDR',fld:'vTOTMTHDR',pic:'ZZZZZZ9.99'},{av:'AV88Tiempom',fld:'vTIEMPOM',pic:'ZZZZZZZ9'},{av:'AV50Op4',fld:'vOP4',pic:''},{av:'AV57BarCod4',fld:'vBARCOD4',pic:'ZZZZZZZ9',hsh:true},{av:'AV59BarCodReo4',fld:'vBARCODREO4',pic:'9',hsh:true},{av:'AV58BarCodPar4',fld:'vBARCODPAR4',pic:'',hsh:true},{av:'AV28Hdr',fld:'vHDR',pic:''},{av:'AV30HisProFec',fld:'vHISPROFEC',pic:''},{av:'AV29MaqCodHdr',fld:'vMAQCODHDR',pic:''},{av:'AV37HisProDtfHdr',fld:'vHISPRODTFHDR',pic:'99/99/99 99:99:99'},{av:'AV36HisProDtiHdr',fld:'vHISPRODTIHDR',pic:'99/99/99 99:99:99'},{av:'AV32HisProKgrHDR',fld:'vHISPROKGRHDR',pic:'ZZZZZ9.99'},{av:'AV33HisProMtrHDR',fld:'vHISPROMTRHDR',pic:'ZZZZZ9.99'},{av:'AV34HisProTurHdr',fld:'vHISPROTURHDR',pic:'9'},{av:'AV39CliNom',fld:'vCLINOM',pic:''},{av:'AV40BarSer',fld:'vBARSER',pic:''},{av:'AV41BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV42BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV35HisProF',fld:'vHISPROF',pic:'@!'},{av:'AV45OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV46FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV47FasDsc',fld:'vFASDSC',pic:''},{av:'AV52HisProTip4',fld:'vHISPROTIP4',pic:'ZZZ9'},{av:'AV53TipArtDc',fld:'vTIPARTDC',pic:''},{av:'AV54HisProTc4',fld:'vHISPROTC4',pic:'ZZZ9'},{av:'AV55TipColDsc4',fld:'vTIPCOLDSC4',pic:''},{av:'AV51BarTipArt4',fld:'vBARTIPART4',pic:'ZZZ9'},{av:'AV87fechadt',fld:'vFECHADT',pic:'99/99/99 99:99',hsh:true},{av:'AV43MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV44MatDsc',fld:'vMATDSC',pic:'',hsh:true},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV60ForRGB',fld:'vFORRGB',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV63B',fld:'vB',pic:'ZZ9'},{av:'AV62G',fld:'vG',pic:'ZZ9'},{av:'AV61R',fld:'vR',pic:'ZZ9'},{av:'AV80FasActTin',fld:'vFASACTTIN',pic:'@!'},{av:'A461Fase',fld:'FASE',pic:''},{av:'AV81HisProLot',fld:'vHISPROLOT',pic:''},{av:'AV56HisProDf',fld:'vHISPRODF',pic:''},{av:'AV48FlagMarca',fld:'vFLAGMARCA',pic:'9'},{av:'AV76fase',fld:'vFASE',pic:'',hsh:true},{av:'AV38HhMmAlfa',fld:'vHHMMALFA',pic:''},{av:'AV49Minutos',fld:'vMINUTOS',pic:'ZZZZZZZZZ9'},{av:'AV72HisProTr2',fld:'vHISPROTR2',pic:'ZZZ9'},{av:'AV73HorReaInt',fld:'vHORREAINT',pic:'ZZZ9'},{av:'AV74MinRea',fld:'vMINREA',pic:'ZZZ9'},{av:'AV64TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'AV65TipDefDsc',fld:'vTIPDEFDSC',pic:''},{av:'AV75FasDivTime',fld:'vFASDIVTIME',pic:'',hsh:true},{av:'AV71BarKgsTt',fld:'vBARKGSTT',pic:'ZZZZZZ9.99'},{av:'AV70BarKgmTin',fld:'vBARKGMTIN',pic:'ZZZZZ9.99'},{av:'AV69HdrP',fld:'vHDRP',pic:''},{av:'AV66CosteI',fld:'vCOSTEI',pic:'ZZZZZZ9.99'},{av:'AV67CosteT',fld:'vCOSTET',pic:'ZZZZZZ9.99'},{av:'AV68CosteK',fld:'vCOSTEK',pic:'ZZZZZZ9.99'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111YM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV22MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV23MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV24HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99'},{av:'AV25HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99'},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'edtavCostei_Visible',ctrl:'vCOSTEI',prop:'Visible'},{av:'edtavCostet_Visible',ctrl:'vCOSTET',prop:'Visible'},{av:'edtavCostek_Visible',ctrl:'vCOSTEK',prop:'Visible'},{av:'edtavBarkgmtin_Visible',ctrl:'vBARKGMTIN',prop:'Visible'},{av:'edtavBarkgstt_Visible',ctrl:'vBARKGSTT',prop:'Visible'},{av:'AV48FlagMarca',fld:'vFLAGMARCA',pic:'9'},{av:'AV38HhMmAlfa',fld:'vHHMMALFA',pic:''},{av:'AV49Minutos',fld:'vMINUTOS',pic:'ZZZZZZZZZ9'},{av:'AV72HisProTr2',fld:'vHISPROTR2',pic:'ZZZ9'},{av:'AV73HorReaInt',fld:'vHORREAINT',pic:'ZZZ9'},{av:'AV74MinRea',fld:'vMINREA',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A4440HisProDTI',fld:'HISPRODTI',pic:'99/99/99 99:99:99'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'},{av:'A3611HisProTc',fld:'HISPROTC',pic:'Z9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'AV44MatDsc',fld:'vMATDSC',pic:'',hsh:true},{av:'AV43MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV87fechadt',fld:'vFECHADT',pic:'99/99/99 99:99',hsh:true},{av:'AV60ForRGB',fld:'vFORRGB',pic:'ZZZZZZZZZ9',hsh:true},{av:'A5608HisProDf',fld:'HISPRODF',pic:''},{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'AV86Grulec',fld:'vGRULEC',pic:'9',hsh:true},{av:'AV75FasDivTime',fld:'vFASDIVTIME',pic:'',hsh:true},{av:'A6680HisproTdab',fld:'HISPROTDAB',pic:'ZZZ9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'A556HisProEst',fld:'HISPROEST',pic:'9'},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'AV76fase',fld:'vFASE',pic:'',hsh:true},{av:'A14054FasDivTime',fld:'FASDIVTIME',pic:''},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'AV57BarCod4',fld:'vBARCOD4',pic:'ZZZZZZZ9',hsh:true},{av:'AV59BarCodReo4',fld:'vBARCODREO4',pic:'9',hsh:true},{av:'AV58BarCodPar4',fld:'vBARCODPAR4',pic:'',hsh:true},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A8563BarKgsTt',fld:'BARKGSTT',pic:'ZZZZZZ9.99'},{av:'A1947BarKgmTin',fld:'BARKGMTIN',pic:'ZZZZZ9.99'},{av:'A3705BarCosCol',fld:'BARCOSCOL',pic:'ZZZZZZ9.99'},{av:'A3658BarCosPA',fld:'BARCOSPA',pic:'ZZZZZZ9.99'},{av:'A3654BarCosPD',fld:'BARCOSPD',pic:'ZZZZZZ9.99'},{av:'A3657BarCosAA',fld:'BARCOSAA',pic:'ZZZZZZ9.99'},{av:'A3656BarCosAD',fld:'BARCOSAD',pic:'ZZZZZZ9.99'},{av:'A3706BarCosAnc',fld:'BARCOSANC',pic:'ZZZZZZ9.99'},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'},{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV111CantidadRegistros',fld:'vCANTIDADREGISTROS',pic:'ZZZZZZZZZZZ9'},{av:'AV110GridRows',fld:'vGRIDROWS',pic:'ZZZZZ9'},{av:'AV20GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121YM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV22MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV23MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV24HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99'},{av:'AV25HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99'},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'edtavCostei_Visible',ctrl:'vCOSTEI',prop:'Visible'},{av:'edtavCostet_Visible',ctrl:'vCOSTET',prop:'Visible'},{av:'edtavCostek_Visible',ctrl:'vCOSTEK',prop:'Visible'},{av:'edtavBarkgmtin_Visible',ctrl:'vBARKGMTIN',prop:'Visible'},{av:'edtavBarkgstt_Visible',ctrl:'vBARKGSTT',prop:'Visible'},{av:'AV48FlagMarca',fld:'vFLAGMARCA',pic:'9'},{av:'AV38HhMmAlfa',fld:'vHHMMALFA',pic:''},{av:'AV49Minutos',fld:'vMINUTOS',pic:'ZZZZZZZZZ9'},{av:'AV72HisProTr2',fld:'vHISPROTR2',pic:'ZZZ9'},{av:'AV73HorReaInt',fld:'vHORREAINT',pic:'ZZZ9'},{av:'AV74MinRea',fld:'vMINREA',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A4440HisProDTI',fld:'HISPRODTI',pic:'99/99/99 99:99:99'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'},{av:'A3611HisProTc',fld:'HISPROTC',pic:'Z9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'AV44MatDsc',fld:'vMATDSC',pic:'',hsh:true},{av:'AV43MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV87fechadt',fld:'vFECHADT',pic:'99/99/99 99:99',hsh:true},{av:'AV60ForRGB',fld:'vFORRGB',pic:'ZZZZZZZZZ9',hsh:true},{av:'A5608HisProDf',fld:'HISPRODF',pic:''},{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'AV86Grulec',fld:'vGRULEC',pic:'9',hsh:true},{av:'AV75FasDivTime',fld:'vFASDIVTIME',pic:'',hsh:true},{av:'A6680HisproTdab',fld:'HISPROTDAB',pic:'ZZZ9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'A556HisProEst',fld:'HISPROEST',pic:'9'},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'AV76fase',fld:'vFASE',pic:'',hsh:true},{av:'A14054FasDivTime',fld:'FASDIVTIME',pic:''},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'AV57BarCod4',fld:'vBARCOD4',pic:'ZZZZZZZ9',hsh:true},{av:'AV59BarCodReo4',fld:'vBARCODREO4',pic:'9',hsh:true},{av:'AV58BarCodPar4',fld:'vBARCODPAR4',pic:'',hsh:true},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A8563BarKgsTt',fld:'BARKGSTT',pic:'ZZZZZZ9.99'},{av:'A1947BarKgmTin',fld:'BARKGMTIN',pic:'ZZZZZ9.99'},{av:'A3705BarCosCol',fld:'BARCOSCOL',pic:'ZZZZZZ9.99'},{av:'A3658BarCosPA',fld:'BARCOSPA',pic:'ZZZZZZ9.99'},{av:'A3654BarCosPD',fld:'BARCOSPD',pic:'ZZZZZZ9.99'},{av:'A3657BarCosAA',fld:'BARCOSAA',pic:'ZZZZZZ9.99'},{av:'A3656BarCosAD',fld:'BARCOSAD',pic:'ZZZZZZ9.99'},{av:'A3706BarCosAnc',fld:'BARCOSANC',pic:'ZZZZZZ9.99'},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOBUTTONEXCEL'","{handler:'e131YM2',iparms:[{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV21HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV22MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV23MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV24HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99'},{av:'AV25HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99'}]");
      setEventMetadata("'DOBUTTONEXCEL'",",oparms:[]}");
      setEventMetadata("VALIDV_EMPRCOD","{handler:'validv_Emprcod',iparms:[]");
      setEventMetadata("VALIDV_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALIDV_HISPROF","{handler:'validv_Hisprof',iparms:[]");
      setEventMetadata("VALIDV_HISPROF",",oparms:[]}");
      setEventMetadata("VALIDV_BARCOD4","{handler:'validv_Barcod4',iparms:[]");
      setEventMetadata("VALIDV_BARCOD4",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR4","{handler:'validv_Barcodpar4',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR4",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO4","{handler:'validv_Barcodreo4',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO4",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Minrea',iparms:[]");
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
      wcpOAV13EmprCod = "" ;
      wcpOAV22MaqCod1 = "" ;
      wcpOAV23MaqCod2 = "" ;
      wcpOAV24HisProFec1 = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV25HisProFec2 = GXutil.resetTime( GXutil.nullDate() );
      Gridpaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV13EmprCod = "" ;
      AV22MaqCod1 = "" ;
      AV23MaqCod2 = "" ;
      AV24HisProFec1 = GXutil.resetTime( GXutil.nullDate() );
      AV25HisProFec2 = GXutil.resetTime( GXutil.nullDate() );
      AV38HhMmAlfa = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A130BarCodPar = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A557HisProF = "" ;
      A461Fase = "" ;
      AV44MatDsc = "" ;
      AV87fechadt = GXutil.resetTime( GXutil.nullDate() );
      A5608HisProDf = GXutil.nullDate() ;
      A3610HisProLot = "" ;
      AV75FasDivTime = "" ;
      A834TipDefDsc = "" ;
      A867ParCodNom = "" ;
      A457FasCod = "" ;
      AV76fase = "" ;
      A14054FasDivTime = "" ;
      A1935BarParTin = "" ;
      AV58BarCodPar4 = "" ;
      A1945BarMaqTin = "" ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      A2316BarAgrLot = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnbuttonexcel_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      AV91TotkHDR = DecimalUtil.ZERO ;
      AV90TotMtHDR = DecimalUtil.ZERO ;
      AV132Pgmname = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV28Hdr = "" ;
      AV29MaqCodHdr = "" ;
      AV30HisProFec = GXutil.nullDate() ;
      AV32HisProKgrHDR = DecimalUtil.ZERO ;
      AV33HisProMtrHDR = DecimalUtil.ZERO ;
      AV35HisProF = "" ;
      AV36HisProDtiHdr = GXutil.resetTime( GXutil.nullDate() );
      AV37HisProDtfHdr = GXutil.resetTime( GXutil.nullDate() );
      AV39CliNom = "" ;
      AV40BarSer = "" ;
      AV41BarColNom = "" ;
      AV46FasCod = "" ;
      AV47FasDsc = "" ;
      AV50Op4 = "" ;
      AV53TipArtDc = "" ;
      AV55TipColDsc4 = "" ;
      AV56HisProDf = GXutil.nullDate() ;
      AV65TipDefDsc = "" ;
      AV66CosteI = DecimalUtil.ZERO ;
      AV67CosteT = DecimalUtil.ZERO ;
      AV68CosteK = DecimalUtil.ZERO ;
      AV69HdrP = "" ;
      AV70BarKgmTin = DecimalUtil.ZERO ;
      AV71BarKgsTt = DecimalUtil.ZERO ;
      AV116TotValueHisProKgrHDR = "" ;
      AV118TotValueHisProMtrHDR = "" ;
      AV124Station = "" ;
      AV125EmprNom = "" ;
      AV126UsurCod = "" ;
      scmdbuf = "" ;
      H01YM2_A3612HisProReo = new byte[1] ;
      H01YM2_A602MaqCod = new String[] {""} ;
      H01YM2_A396EmprCod = new String[] {""} ;
      H01YM2_A129BarCod = new int[1] ;
      H01YM2_A132BarCodReo = new byte[1] ;
      H01YM2_A130BarCodPar = new String[] {""} ;
      H01YM2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YM2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YM2_A566HisProTur = new byte[1] ;
      H01YM2_A279CliNom = new String[] {""} ;
      H01YM2_A212BarSer = new String[] {""} ;
      H01YM2_A135BarColNom = new String[] {""} ;
      H01YM2_A136BarColNum = new int[1] ;
      H01YM2_A557HisProF = new String[] {""} ;
      H01YM2_A503GruOpeCod = new int[1] ;
      H01YM2_A461Fase = new String[] {""} ;
      H01YM2_A2247HisProTip = new short[1] ;
      H01YM2_A3611HisProTc = new byte[1] ;
      H01YM2_A217BarTipArt = new short[1] ;
      H01YM2_n217BarTipArt = new boolean[] {false} ;
      H01YM2_A252CliCod = new int[1] ;
      H01YM2_n252CliCod = new boolean[] {false} ;
      H01YM2_A218BarTipCol = new byte[1] ;
      H01YM2_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      H01YM2_A3610HisProLot = new String[] {""} ;
      H01YM2_A6680HisproTdab = new short[1] ;
      H01YM2_A556HisProEst = new byte[1] ;
      H01YM2_A833TipDefCod = new short[1] ;
      H01YM2_n833TipDefCod = new boolean[] {false} ;
      H01YM2_A148BarEstReo = new byte[1] ;
      H01YM2_A834TipDefDsc = new String[] {""} ;
      H01YM2_n834TipDefDsc = new boolean[] {false} ;
      H01YM2_A656ParCod = new short[1] ;
      H01YM2_n656ParCod = new boolean[] {false} ;
      H01YM2_A867ParCodNom = new String[] {""} ;
      H01YM2_n867ParCodNom = new boolean[] {false} ;
      H01YM2_A561HisProLin = new int[1] ;
      H01YM2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01YM2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H01YM2_n4440HisProDTI = new boolean[] {false} ;
      H01YM2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H01YM2_n4441HisProDTF = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_decimal24 = new java.math.BigDecimal[1] ;
      GXv_dtime25 = new java.util.Date[1] ;
      GXv_int23 = new int[1] ;
      GXv_int17 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_int8 = new long[1] ;
      GXv_int20 = new short[1] ;
      GXv_int13 = new short[1] ;
      GXv_int27 = new short[1] ;
      AV80FasActTin = "" ;
      GXv_char21 = new String[1] ;
      AV81HisProLot = "" ;
      AV83HhMm = DecimalUtil.ZERO ;
      AV84Mmalfa = "" ;
      AV85hhalfa = "" ;
      AV128parcodnom = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV127ExcelFilename = "" ;
      GXv_char26 = new String[1] ;
      AV100ErrorMessage = "" ;
      GXv_char22 = new String[1] ;
      H01YM3_A457FasCod = new String[] {""} ;
      H01YM3_A396EmprCod = new String[] {""} ;
      H01YM3_A14054FasDivTime = new String[] {""} ;
      H01YM4_A3646EstTinAny = new short[1] ;
      H01YM4_A3647EstTinMes = new byte[1] ;
      H01YM4_A3648EstTinDia = new byte[1] ;
      H01YM4_A1929EstTinNr = new short[1] ;
      H01YM4_A1945BarMaqTin = new String[] {""} ;
      H01YM4_n1945BarMaqTin = new boolean[] {false} ;
      H01YM4_A1935BarParTin = new String[] {""} ;
      H01YM4_n1935BarParTin = new boolean[] {false} ;
      H01YM4_A1934BarReoTin = new byte[1] ;
      H01YM4_n1934BarReoTin = new boolean[] {false} ;
      H01YM4_A1933BarCodTin = new int[1] ;
      H01YM4_n1933BarCodTin = new boolean[] {false} ;
      H01YM4_A396EmprCod = new String[] {""} ;
      H01YM4_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YM4_n8563BarKgsTt = new boolean[] {false} ;
      H01YM4_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YM4_n1947BarKgmTin = new boolean[] {false} ;
      H01YM4_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YM4_n3654BarCosPD = new boolean[] {false} ;
      H01YM4_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YM4_n3658BarCosPA = new boolean[] {false} ;
      H01YM4_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YM4_n3705BarCosCol = new boolean[] {false} ;
      H01YM4_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YM4_n3706BarCosAnc = new boolean[] {false} ;
      H01YM4_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YM4_n3656BarCosAD = new boolean[] {false} ;
      H01YM4_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YM4_n3657BarCosAA = new boolean[] {false} ;
      H01YM4_A2316BarAgrLot = new String[] {""} ;
      H01YM4_n2316BarAgrLot = new boolean[] {false} ;
      AV93Dif = DecimalUtil.ZERO ;
      AV94Porc = DecimalUtil.ZERO ;
      AV119TTotk = DecimalUtil.ZERO ;
      AV120TTotMt = DecimalUtil.ZERO ;
      H01YM5_A3612HisProReo = new byte[1] ;
      H01YM5_A602MaqCod = new String[] {""} ;
      H01YM5_A396EmprCod = new String[] {""} ;
      H01YM5_A3610HisProLot = new String[] {""} ;
      H01YM5_A461Fase = new String[] {""} ;
      H01YM5_A6680HisproTdab = new short[1] ;
      H01YM5_A556HisProEst = new byte[1] ;
      H01YM5_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YM5_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YM5_A561HisProLin = new int[1] ;
      H01YM5_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01YM5_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H01YM5_n4440HisProDTI = new boolean[] {false} ;
      H01YM5_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H01YM5_n4441HisProDTF = new boolean[] {false} ;
      AV115TotHisProKgrHDR = DecimalUtil.ZERO ;
      AV117TotHisProMtrHDR = DecimalUtil.ZERO ;
      AV122TotValueHhMmAlfa = "" ;
      lblTextblock_hdr_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV13EmprCod = "" ;
      sCtrlAV21HisEstReo = "" ;
      sCtrlAV22MaqCod1 = "" ;
      sCtrlAV23MaqCod2 = "" ;
      sCtrlAV24HisProFec1 = "" ;
      sCtrlAV25HisProFec2 = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionresumenhdr_wc__default(),
         new Object[] {
             new Object[] {
            H01YM2_A3612HisProReo, H01YM2_A602MaqCod, H01YM2_A396EmprCod, H01YM2_A129BarCod, H01YM2_A132BarCodReo, H01YM2_A130BarCodPar, H01YM2_A1525HisProKgr, H01YM2_A1526HisProMtr, H01YM2_A566HisProTur, H01YM2_A279CliNom,
            H01YM2_A212BarSer, H01YM2_A135BarColNom, H01YM2_A136BarColNum, H01YM2_A557HisProF, H01YM2_A503GruOpeCod, H01YM2_A461Fase, H01YM2_A2247HisProTip, H01YM2_A3611HisProTc, H01YM2_A217BarTipArt, H01YM2_n217BarTipArt,
            H01YM2_A252CliCod, H01YM2_n252CliCod, H01YM2_A218BarTipCol, H01YM2_A5608HisProDf, H01YM2_A3610HisProLot, H01YM2_A6680HisproTdab, H01YM2_A556HisProEst, H01YM2_A833TipDefCod, H01YM2_n833TipDefCod, H01YM2_A148BarEstReo,
            H01YM2_A834TipDefDsc, H01YM2_n834TipDefDsc, H01YM2_A656ParCod, H01YM2_n656ParCod, H01YM2_A867ParCodNom, H01YM2_n867ParCodNom, H01YM2_A561HisProLin, H01YM2_A558HisProFec, H01YM2_A4440HisProDTI, H01YM2_n4440HisProDTI,
            H01YM2_A4441HisProDTF, H01YM2_n4441HisProDTF
            }
            , new Object[] {
            H01YM3_A457FasCod, H01YM3_A396EmprCod, H01YM3_A14054FasDivTime
            }
            , new Object[] {
            H01YM4_A3646EstTinAny, H01YM4_A3647EstTinMes, H01YM4_A3648EstTinDia, H01YM4_A1929EstTinNr, H01YM4_A1945BarMaqTin, H01YM4_n1945BarMaqTin, H01YM4_A1935BarParTin, H01YM4_n1935BarParTin, H01YM4_A1934BarReoTin, H01YM4_n1934BarReoTin,
            H01YM4_A1933BarCodTin, H01YM4_n1933BarCodTin, H01YM4_A396EmprCod, H01YM4_A8563BarKgsTt, H01YM4_n8563BarKgsTt, H01YM4_A1947BarKgmTin, H01YM4_n1947BarKgmTin, H01YM4_A3654BarCosPD, H01YM4_n3654BarCosPD, H01YM4_A3658BarCosPA,
            H01YM4_n3658BarCosPA, H01YM4_A3705BarCosCol, H01YM4_n3705BarCosCol, H01YM4_A3706BarCosAnc, H01YM4_n3706BarCosAnc, H01YM4_A3656BarCosAD, H01YM4_n3656BarCosAD, H01YM4_A3657BarCosAA, H01YM4_n3657BarCosAA, H01YM4_A2316BarAgrLot,
            H01YM4_n2316BarAgrLot
            }
            , new Object[] {
            H01YM5_A3612HisProReo, H01YM5_A602MaqCod, H01YM5_A396EmprCod, H01YM5_A3610HisProLot, H01YM5_A461Fase, H01YM5_A6680HisproTdab, H01YM5_A556HisProEst, H01YM5_A1525HisProKgr, H01YM5_A1526HisProMtr, H01YM5_A561HisProLin,
            H01YM5_A558HisProFec, H01YM5_A4440HisProDTI, H01YM5_n4440HisProDTI, H01YM5_A4441HisProDTF, H01YM5_n4441HisProDTF
            }
         }
      );
      AV132Pgmname = "Produccion.InformeProduccionResumenHdr_WC" ;
      /* GeneXus formulas. */
      AV132Pgmname = "Produccion.InformeProduccionResumenHdr_WC" ;
      Gx_err = (short)(0) ;
      edtavCantidadregistros_Enabled = 0 ;
      edtavGridrows_Enabled = 0 ;
      edtavGridpagecount_Enabled = 0 ;
      edtavEmprcod_Enabled = 0 ;
      edtavHdr_Enabled = 0 ;
      edtavMaqcodhdr_Enabled = 0 ;
      edtavHisprofec_Enabled = 0 ;
      edtavHidprolin_Enabled = 0 ;
      edtavHisprokgrhdr_Enabled = 0 ;
      edtavHispromtrhdr_Enabled = 0 ;
      edtavHisproturhdr_Enabled = 0 ;
      edtavHisprof_Enabled = 0 ;
      edtavHisprodtihdr_Enabled = 0 ;
      edtavHisprodtfhdr_Enabled = 0 ;
      edtavHhmmalfa_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavMatcod_Enabled = 0 ;
      edtavMatdsc_Enabled = 0 ;
      edtavOpecod_Enabled = 0 ;
      edtavFascod_Enabled = 0 ;
      edtavFasdsc_Enabled = 0 ;
      edtavFlagmarca_Enabled = 0 ;
      edtavMinutos_Enabled = 0 ;
      edtavOp4_Enabled = 0 ;
      edtavBartipart4_Enabled = 0 ;
      edtavHisprotip4_Enabled = 0 ;
      edtavTipartdc_Enabled = 0 ;
      edtavHisprotc4_Enabled = 0 ;
      edtavTipcoldsc4_Enabled = 0 ;
      edtavHisprodf_Enabled = 0 ;
      edtavBarcod4_Enabled = 0 ;
      edtavBarcodpar4_Enabled = 0 ;
      edtavBarcodreo4_Enabled = 0 ;
      edtavForrgb_Enabled = 0 ;
      edtavR_Enabled = 0 ;
      edtavG_Enabled = 0 ;
      edtavB_Enabled = 0 ;
      edtavTipdefcod_Enabled = 0 ;
      edtavTipdefdsc_Enabled = 0 ;
      edtavCostei_Enabled = 0 ;
      edtavCostet_Enabled = 0 ;
      edtavCostek_Enabled = 0 ;
      edtavHdrp_Enabled = 0 ;
      edtavBarkgmtin_Enabled = 0 ;
      edtavBarkgstt_Enabled = 0 ;
      edtavHisprotr2_Enabled = 0 ;
      edtavHorreaint_Enabled = 0 ;
      edtavMinrea_Enabled = 0 ;
      edtavTotvaluehisprokgrhdr_Enabled = 0 ;
      edtavTotvaluehispromtrhdr_Enabled = 0 ;
      edtavTotkhdr_Enabled = 0 ;
      edtavTotmthdr_Enabled = 0 ;
      edtavTiempom_Enabled = 0 ;
   }

   private byte wcpOAV21HisEstReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV21HisEstReo ;
   private byte AV48FlagMarca ;
   private byte A3612HisProReo ;
   private byte A132BarCodReo ;
   private byte A566HisProTur ;
   private byte A3611HisProTc ;
   private byte A218BarTipCol ;
   private byte AV86Grulec ;
   private byte A556HisProEst ;
   private byte A148BarEstReo ;
   private byte A1934BarReoTin ;
   private byte AV59BarCodReo4 ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV34HisProTurHdr ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte AV95lecotex ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte GXv_int14[] ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV72HisProTr2 ;
   private short AV73HorReaInt ;
   private short AV74MinRea ;
   private short A2247HisProTip ;
   private short A217BarTipArt ;
   private short AV43MatCod ;
   private short A6680HisproTdab ;
   private short A5605HisProTr2 ;
   private short A833TipDefCod ;
   private short A656ParCod ;
   private short wbEnd ;
   private short wbStart ;
   private short AV51BarTipArt4 ;
   private short AV52HisProTip4 ;
   private short AV54HisProTc4 ;
   private short AV61R ;
   private short AV62G ;
   private short AV63B ;
   private short AV64TipDefCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int20[] ;
   private short GXv_int13[] ;
   private short GXv_int27[] ;
   private short AV82HorRea ;
   private short AV129parcod ;
   private int edtavCostei_Visible ;
   private int edtavCostet_Visible ;
   private int edtavCostek_Visible ;
   private int edtavBarkgmtin_Visible ;
   private int edtavBarkgstt_Visible ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_52 ;
   private int nGXsfl_52_idx=1 ;
   private int A561HisProLin ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A503GruOpeCod ;
   private int A252CliCod ;
   private int A1933BarCodTin ;
   private int AV57BarCod4 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int divUnnamedtable1_Visible ;
   private int edtavCantidadregistros_Enabled ;
   private int AV110GridRows ;
   private int edtavGridrows_Enabled ;
   private int edtavGridpagecount_Enabled ;
   private int divTbl_totales_Visible ;
   private int edtavTotkhdr_Enabled ;
   private int edtavTotmthdr_Enabled ;
   private int AV88Tiempom ;
   private int edtavTiempom_Enabled ;
   private int edtavGridcurrentpage_Visible ;
   private int edtavPgmname_Visible ;
   private int AV31HidProLin ;
   private int AV42BarColNum ;
   private int AV45OpeCod ;
   private int subGrid_Islastpage ;
   private int edtavEmprcod_Enabled ;
   private int edtavHdr_Enabled ;
   private int edtavMaqcodhdr_Enabled ;
   private int edtavHisprofec_Enabled ;
   private int edtavHidprolin_Enabled ;
   private int edtavHisprokgrhdr_Enabled ;
   private int edtavHispromtrhdr_Enabled ;
   private int edtavHisproturhdr_Enabled ;
   private int edtavHisprof_Enabled ;
   private int edtavHisprodtihdr_Enabled ;
   private int edtavHisprodtfhdr_Enabled ;
   private int edtavHhmmalfa_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavMatcod_Enabled ;
   private int edtavMatdsc_Enabled ;
   private int edtavOpecod_Enabled ;
   private int edtavFascod_Enabled ;
   private int edtavFasdsc_Enabled ;
   private int edtavFlagmarca_Enabled ;
   private int edtavMinutos_Enabled ;
   private int edtavOp4_Enabled ;
   private int edtavBartipart4_Enabled ;
   private int edtavHisprotip4_Enabled ;
   private int edtavTipartdc_Enabled ;
   private int edtavHisprotc4_Enabled ;
   private int edtavTipcoldsc4_Enabled ;
   private int edtavHisprodf_Enabled ;
   private int edtavBarcod4_Enabled ;
   private int edtavBarcodpar4_Enabled ;
   private int edtavBarcodreo4_Enabled ;
   private int edtavForrgb_Enabled ;
   private int edtavR_Enabled ;
   private int edtavG_Enabled ;
   private int edtavB_Enabled ;
   private int edtavTipdefcod_Enabled ;
   private int edtavTipdefdsc_Enabled ;
   private int edtavCostei_Enabled ;
   private int edtavCostet_Enabled ;
   private int edtavCostek_Enabled ;
   private int edtavHdrp_Enabled ;
   private int edtavBarkgmtin_Enabled ;
   private int edtavBarkgstt_Enabled ;
   private int edtavHisprotr2_Enabled ;
   private int edtavHorreaint_Enabled ;
   private int edtavMinrea_Enabled ;
   private int edtavTotvaluehisprokgrhdr_Enabled ;
   private int edtavTotvaluehispromtrhdr_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int AV79HisProLin ;
   private int GXv_int9[] ;
   private int GXv_int10[] ;
   private int GXv_int23[] ;
   private int GXv_int17[] ;
   private int AV18PageToGo ;
   private int AV123Ttiempom ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV49Minutos ;
   private long AV60ForRGB ;
   private long AV111CantidadRegistros ;
   private long AV20GridPageCount ;
   private long AV19GridCurrentPage ;
   private long GRID_nCurrentRecord ;
   private long GXt_int7 ;
   private long GXv_int8[] ;
   private long AV121TotHhMmAlfa ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3654BarCosPD ;
   private java.math.BigDecimal A3657BarCosAA ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal AV91TotkHDR ;
   private java.math.BigDecimal AV90TotMtHDR ;
   private java.math.BigDecimal AV32HisProKgrHDR ;
   private java.math.BigDecimal AV33HisProMtrHDR ;
   private java.math.BigDecimal AV66CosteI ;
   private java.math.BigDecimal AV67CosteT ;
   private java.math.BigDecimal AV68CosteK ;
   private java.math.BigDecimal AV70BarKgmTin ;
   private java.math.BigDecimal AV71BarKgsTt ;
   private java.math.BigDecimal GXv_decimal24[] ;
   private java.math.BigDecimal AV83HhMm ;
   private java.math.BigDecimal AV93Dif ;
   private java.math.BigDecimal AV94Porc ;
   private java.math.BigDecimal AV119TTotk ;
   private java.math.BigDecimal AV120TTotMt ;
   private java.math.BigDecimal AV115TotHisProKgrHDR ;
   private java.math.BigDecimal AV117TotHisProMtrHDR ;
   private String wcpOAV13EmprCod ;
   private String wcpOAV22MaqCod1 ;
   private String wcpOAV23MaqCod2 ;
   private String Gridpaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV13EmprCod ;
   private String edtavEmprcod_Internalname ;
   private String AV22MaqCod1 ;
   private String AV23MaqCod2 ;
   private String sGXsfl_52_idx="0001" ;
   private String edtavCostei_Internalname ;
   private String edtavCostet_Internalname ;
   private String edtavCostek_Internalname ;
   private String edtavBarkgmtin_Internalname ;
   private String edtavBarkgstt_Internalname ;
   private String AV38HhMmAlfa ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A130BarCodPar ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A557HisProF ;
   private String A461Fase ;
   private String AV44MatDsc ;
   private String A3610HisProLot ;
   private String AV75FasDivTime ;
   private String A834TipDefDsc ;
   private String A867ParCodNom ;
   private String A457FasCod ;
   private String AV76fase ;
   private String A14054FasDivTime ;
   private String A1935BarParTin ;
   private String AV58BarCodPar4 ;
   private String A1945BarMaqTin ;
   private String A2316BarAgrLot ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnbuttonexcel_Internalname ;
   private String bttBtnbuttonexcel_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String edtavCantidadregistros_Internalname ;
   private String edtavCantidadregistros_Jsonclick ;
   private String edtavGridrows_Internalname ;
   private String edtavGridrows_Jsonclick ;
   private String edtavGridpagecount_Internalname ;
   private String edtavGridpagecount_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divTbl_totales_Internalname ;
   private String edtavTotkhdr_Internalname ;
   private String edtavTotkhdr_Jsonclick ;
   private String edtavTotmthdr_Internalname ;
   private String edtavTotmthdr_Jsonclick ;
   private String edtavTiempom_Internalname ;
   private String edtavTiempom_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavGridcurrentpage_Internalname ;
   private String edtavGridcurrentpage_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV132Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV28Hdr ;
   private String edtavHdr_Internalname ;
   private String AV29MaqCodHdr ;
   private String edtavMaqcodhdr_Internalname ;
   private String edtavHisprofec_Internalname ;
   private String edtavHidprolin_Internalname ;
   private String edtavHisprokgrhdr_Internalname ;
   private String edtavHispromtrhdr_Internalname ;
   private String edtavHisproturhdr_Internalname ;
   private String AV35HisProF ;
   private String edtavHisprof_Internalname ;
   private String edtavHisprodtihdr_Internalname ;
   private String edtavHisprodtfhdr_Internalname ;
   private String edtavHhmmalfa_Internalname ;
   private String AV39CliNom ;
   private String edtavClinom_Internalname ;
   private String AV40BarSer ;
   private String edtavBarser_Internalname ;
   private String AV41BarColNom ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnum_Internalname ;
   private String edtavMatcod_Internalname ;
   private String edtavMatdsc_Internalname ;
   private String edtavOpecod_Internalname ;
   private String AV46FasCod ;
   private String edtavFascod_Internalname ;
   private String AV47FasDsc ;
   private String edtavFasdsc_Internalname ;
   private String edtavFlagmarca_Internalname ;
   private String edtavMinutos_Internalname ;
   private String AV50Op4 ;
   private String edtavOp4_Internalname ;
   private String edtavBartipart4_Internalname ;
   private String edtavHisprotip4_Internalname ;
   private String AV53TipArtDc ;
   private String edtavTipartdc_Internalname ;
   private String edtavHisprotc4_Internalname ;
   private String AV55TipColDsc4 ;
   private String edtavTipcoldsc4_Internalname ;
   private String edtavHisprodf_Internalname ;
   private String edtavBarcod4_Internalname ;
   private String edtavBarcodpar4_Internalname ;
   private String edtavBarcodreo4_Internalname ;
   private String edtavForrgb_Internalname ;
   private String edtavR_Internalname ;
   private String edtavG_Internalname ;
   private String edtavB_Internalname ;
   private String edtavTipdefcod_Internalname ;
   private String AV65TipDefDsc ;
   private String edtavTipdefdsc_Internalname ;
   private String AV69HdrP ;
   private String edtavHdrp_Internalname ;
   private String edtavHisprotr2_Internalname ;
   private String edtavHorreaint_Internalname ;
   private String edtavMinrea_Internalname ;
   private String edtavTotvaluehisprokgrhdr_Internalname ;
   private String edtavTotvaluehispromtrhdr_Internalname ;
   private String AV124Station ;
   private String AV125EmprNom ;
   private String AV126UsurCod ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char15[] ;
   private String GXv_char16[] ;
   private String GXv_char18[] ;
   private String GXv_char19[] ;
   private String AV80FasActTin ;
   private String GXv_char21[] ;
   private String AV81HisProLot ;
   private String AV84Mmalfa ;
   private String AV85hhalfa ;
   private String AV128parcodnom ;
   private String GXv_char26[] ;
   private String GXv_char22[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluehisprokgrhdr_Jsonclick ;
   private String edtavTotvaluehispromtrhdr_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String lblTextblock_hdr_Internalname ;
   private String lblTextblock_hdr_Jsonclick ;
   private String sCtrlAV13EmprCod ;
   private String sCtrlAV21HisEstReo ;
   private String sCtrlAV22MaqCod1 ;
   private String sCtrlAV23MaqCod2 ;
   private String sCtrlAV24HisProFec1 ;
   private String sCtrlAV25HisProFec2 ;
   private String sGXsfl_52_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavEmprcod_Jsonclick ;
   private String edtavHdr_Jsonclick ;
   private String edtavMaqcodhdr_Jsonclick ;
   private String edtavHisprofec_Jsonclick ;
   private String edtavHidprolin_Jsonclick ;
   private String edtavHisprokgrhdr_Jsonclick ;
   private String edtavHispromtrhdr_Jsonclick ;
   private String edtavHisproturhdr_Jsonclick ;
   private String edtavHisprof_Jsonclick ;
   private String edtavHisprodtihdr_Jsonclick ;
   private String edtavHisprodtfhdr_Jsonclick ;
   private String edtavHhmmalfa_Jsonclick ;
   private String edtavClinom_Jsonclick ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Jsonclick ;
   private String edtavMatcod_Jsonclick ;
   private String edtavMatdsc_Jsonclick ;
   private String edtavOpecod_Jsonclick ;
   private String edtavFascod_Jsonclick ;
   private String edtavFasdsc_Jsonclick ;
   private String edtavFlagmarca_Jsonclick ;
   private String edtavMinutos_Jsonclick ;
   private String edtavOp4_Jsonclick ;
   private String edtavBartipart4_Jsonclick ;
   private String edtavHisprotip4_Jsonclick ;
   private String edtavTipartdc_Jsonclick ;
   private String edtavHisprotc4_Jsonclick ;
   private String edtavTipcoldsc4_Jsonclick ;
   private String edtavHisprodf_Jsonclick ;
   private String edtavBarcod4_Jsonclick ;
   private String edtavBarcodpar4_Jsonclick ;
   private String edtavBarcodreo4_Jsonclick ;
   private String edtavForrgb_Jsonclick ;
   private String edtavR_Jsonclick ;
   private String edtavG_Jsonclick ;
   private String edtavB_Jsonclick ;
   private String edtavTipdefcod_Jsonclick ;
   private String edtavTipdefdsc_Jsonclick ;
   private String edtavCostei_Jsonclick ;
   private String edtavCostet_Jsonclick ;
   private String edtavCostek_Jsonclick ;
   private String edtavHdrp_Jsonclick ;
   private String edtavBarkgmtin_Jsonclick ;
   private String edtavBarkgstt_Jsonclick ;
   private String edtavHisprotr2_Jsonclick ;
   private String edtavHorreaint_Jsonclick ;
   private String edtavMinrea_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV24HisProFec1 ;
   private java.util.Date wcpOAV25HisProFec2 ;
   private java.util.Date AV24HisProFec1 ;
   private java.util.Date AV25HisProFec2 ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date AV87fechadt ;
   private java.util.Date AV36HisProDtiHdr ;
   private java.util.Date AV37HisProDtfHdr ;
   private java.util.Date GXv_dtime25[] ;
   private java.util.Date A558HisProFec ;
   private java.util.Date A5608HisProDf ;
   private java.util.Date AV30HisProFec ;
   private java.util.Date AV56HisProDf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_52_Refreshing=false ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n833TipDefCod ;
   private boolean n834TipDefDsc ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n1933BarCodTin ;
   private boolean n1934BarReoTin ;
   private boolean n1935BarParTin ;
   private boolean n1945BarMaqTin ;
   private boolean n8563BarKgsTt ;
   private boolean n1947BarKgmTin ;
   private boolean n3705BarCosCol ;
   private boolean n3658BarCosPA ;
   private boolean n3654BarCosPD ;
   private boolean n3657BarCosAA ;
   private boolean n3656BarCosAD ;
   private boolean n3706BarCosAnc ;
   private boolean n2316BarAgrLot ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV116TotValueHisProKgrHDR ;
   private String AV118TotValueHisProMtrHDR ;
   private String AV127ExcelFilename ;
   private String AV100ErrorMessage ;
   private String AV122TotValueHhMmAlfa ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private IDataStoreProvider pr_default ;
   private byte[] H01YM2_A3612HisProReo ;
   private String[] H01YM2_A602MaqCod ;
   private String[] H01YM2_A396EmprCod ;
   private int[] H01YM2_A129BarCod ;
   private byte[] H01YM2_A132BarCodReo ;
   private String[] H01YM2_A130BarCodPar ;
   private java.math.BigDecimal[] H01YM2_A1525HisProKgr ;
   private java.math.BigDecimal[] H01YM2_A1526HisProMtr ;
   private byte[] H01YM2_A566HisProTur ;
   private String[] H01YM2_A279CliNom ;
   private String[] H01YM2_A212BarSer ;
   private String[] H01YM2_A135BarColNom ;
   private int[] H01YM2_A136BarColNum ;
   private String[] H01YM2_A557HisProF ;
   private int[] H01YM2_A503GruOpeCod ;
   private String[] H01YM2_A461Fase ;
   private short[] H01YM2_A2247HisProTip ;
   private byte[] H01YM2_A3611HisProTc ;
   private short[] H01YM2_A217BarTipArt ;
   private boolean[] H01YM2_n217BarTipArt ;
   private int[] H01YM2_A252CliCod ;
   private boolean[] H01YM2_n252CliCod ;
   private byte[] H01YM2_A218BarTipCol ;
   private java.util.Date[] H01YM2_A5608HisProDf ;
   private String[] H01YM2_A3610HisProLot ;
   private short[] H01YM2_A6680HisproTdab ;
   private byte[] H01YM2_A556HisProEst ;
   private short[] H01YM2_A833TipDefCod ;
   private boolean[] H01YM2_n833TipDefCod ;
   private byte[] H01YM2_A148BarEstReo ;
   private String[] H01YM2_A834TipDefDsc ;
   private boolean[] H01YM2_n834TipDefDsc ;
   private short[] H01YM2_A656ParCod ;
   private boolean[] H01YM2_n656ParCod ;
   private String[] H01YM2_A867ParCodNom ;
   private boolean[] H01YM2_n867ParCodNom ;
   private int[] H01YM2_A561HisProLin ;
   private java.util.Date[] H01YM2_A558HisProFec ;
   private java.util.Date[] H01YM2_A4440HisProDTI ;
   private boolean[] H01YM2_n4440HisProDTI ;
   private java.util.Date[] H01YM2_A4441HisProDTF ;
   private boolean[] H01YM2_n4441HisProDTF ;
   private String[] H01YM3_A457FasCod ;
   private String[] H01YM3_A396EmprCod ;
   private String[] H01YM3_A14054FasDivTime ;
   private short[] H01YM4_A3646EstTinAny ;
   private byte[] H01YM4_A3647EstTinMes ;
   private byte[] H01YM4_A3648EstTinDia ;
   private short[] H01YM4_A1929EstTinNr ;
   private String[] H01YM4_A1945BarMaqTin ;
   private boolean[] H01YM4_n1945BarMaqTin ;
   private String[] H01YM4_A1935BarParTin ;
   private boolean[] H01YM4_n1935BarParTin ;
   private byte[] H01YM4_A1934BarReoTin ;
   private boolean[] H01YM4_n1934BarReoTin ;
   private int[] H01YM4_A1933BarCodTin ;
   private boolean[] H01YM4_n1933BarCodTin ;
   private String[] H01YM4_A396EmprCod ;
   private java.math.BigDecimal[] H01YM4_A8563BarKgsTt ;
   private boolean[] H01YM4_n8563BarKgsTt ;
   private java.math.BigDecimal[] H01YM4_A1947BarKgmTin ;
   private boolean[] H01YM4_n1947BarKgmTin ;
   private java.math.BigDecimal[] H01YM4_A3654BarCosPD ;
   private boolean[] H01YM4_n3654BarCosPD ;
   private java.math.BigDecimal[] H01YM4_A3658BarCosPA ;
   private boolean[] H01YM4_n3658BarCosPA ;
   private java.math.BigDecimal[] H01YM4_A3705BarCosCol ;
   private boolean[] H01YM4_n3705BarCosCol ;
   private java.math.BigDecimal[] H01YM4_A3706BarCosAnc ;
   private boolean[] H01YM4_n3706BarCosAnc ;
   private java.math.BigDecimal[] H01YM4_A3656BarCosAD ;
   private boolean[] H01YM4_n3656BarCosAD ;
   private java.math.BigDecimal[] H01YM4_A3657BarCosAA ;
   private boolean[] H01YM4_n3657BarCosAA ;
   private String[] H01YM4_A2316BarAgrLot ;
   private boolean[] H01YM4_n2316BarAgrLot ;
   private byte[] H01YM5_A3612HisProReo ;
   private String[] H01YM5_A602MaqCod ;
   private String[] H01YM5_A396EmprCod ;
   private String[] H01YM5_A3610HisProLot ;
   private String[] H01YM5_A461Fase ;
   private short[] H01YM5_A6680HisproTdab ;
   private byte[] H01YM5_A556HisProEst ;
   private java.math.BigDecimal[] H01YM5_A1525HisProKgr ;
   private java.math.BigDecimal[] H01YM5_A1526HisProMtr ;
   private int[] H01YM5_A561HisProLin ;
   private java.util.Date[] H01YM5_A558HisProFec ;
   private java.util.Date[] H01YM5_A4440HisProDTI ;
   private boolean[] H01YM5_n4440HisProDTI ;
   private java.util.Date[] H01YM5_A4441HisProDTF ;
   private boolean[] H01YM5_n4441HisProDTF ;
}

final  class informeproduccionresumenhdr_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01YM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV21HisEstReo ,
                                          byte A3612HisProReo ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV24HisProFec1 ,
                                          java.util.Date AV25HisProFec2 ,
                                          String AV13EmprCod ,
                                          String AV22MaqCod1 ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          String AV23MaqCod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[6];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT T1.HisProReo, T1.MaqCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProKgr, T1.HisProMtr, T1.HisProTur, T3.CliNom, T2.BarSer, T2.BarColNom," ;
      scmdbuf += " T2.BarColNum, T1.HisProF, T1.GruOpeCod, T1.Fase, T1.HisProTip, T1.HisProTc, T2.BarTipArt, T2.CliCod, T2.BarTipCol, T1.HisProDf, T1.HisProLot, T1.HisproTdab, T1.HisProEst," ;
      scmdbuf += " T2.TipDefCod, T2.BarEstReo, T4.TipDefDsc, T1.ParCod, T5.ParCodNom, T1.HisProLin, T1.HisProFec, T1.HisProDTI, T1.HisProDTF FROM ((((TXPLHIPRO T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN TXPTIPDEF T4 ON T4.EmprCod = T1.EmprCod AND T4.TipDefCod = T2.TipDefCod) LEFT JOIN TXPCODPAR T5 ON T5.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T5.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( ! ( AV21HisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int28[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin" ;
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
   }

   protected Object[] conditional_H01YM5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV21HisEstReo ,
                                          byte A3612HisProReo ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV24HisProFec1 ,
                                          java.util.Date AV25HisProFec2 ,
                                          String AV13EmprCod ,
                                          String AV22MaqCod1 ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          String AV23MaqCod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int30 = new byte[6];
      Object[] GXv_Object31 = new Object[2];
      scmdbuf = "SELECT HisProReo, MaqCod, EmprCod, HisProLot, Fase, HisproTdab, HisProEst, HisProKgr, HisProMtr, HisProLin, HisProFec, HisProDTI, HisProDTF FROM TXPLHIPRO" ;
      addWhere(sWhereString, "(EmprCod = ? and MaqCod >= ?)");
      addWhere(sWhereString, "(HisProDTF >= ?)");
      addWhere(sWhereString, "(HisProDTF <= ?)");
      addWhere(sWhereString, "(MaqCod <= ?)");
      if ( ! ( AV21HisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(HisProReo = ?)");
      }
      else
      {
         GXv_int30[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, MaqCod, HisProFec, HisProLin" ;
      GXv_Object31[0] = scmdbuf ;
      GXv_Object31[1] = GXv_int30 ;
      return GXv_Object31 ;
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
                  return conditional_H01YM2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
            case 3 :
                  return conditional_H01YM5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01YM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YM3", "SELECT FasCod, EmprCod, FasDivTime FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01YM4", "SELECT EstTinAny, EstTinMes, EstTinDia, EstTinNr, BarMaqTin, BarParTin, BarReoTin, BarCodTin, EmprCod, BarKgsTt, BarKgmTin, BarCosPD, BarCosPA, BarCosCol, BarCosAnc, BarCosAD, BarCosAA, BarAgrLot FROM TXPLCONTI WHERE (EmprCod = ? and BarCodTin = ? and BarReoTin = ? and BarParTin = ?) AND (BarMaqTin >= ?) AND (BarMaqTin <= ?) ORDER BY EmprCod, BarCodTin, BarReoTin, BarParTin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YM5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 8);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((short[]) buf[18])[0] = rslt.getShort(19);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(22);
               ((String[]) buf[24])[0] = rslt.getString(23, 10);
               ((short[]) buf[25])[0] = rslt.getShort(24);
               ((byte[]) buf[26])[0] = rslt.getByte(25);
               ((short[]) buf[27])[0] = rslt.getShort(26);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(27);
               ((String[]) buf[30])[0] = rslt.getString(28, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(29);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(30, 30);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(31);
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDate(32);
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(33);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(34);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 3);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 10);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[9], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[9], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               return;
      }
   }

}

