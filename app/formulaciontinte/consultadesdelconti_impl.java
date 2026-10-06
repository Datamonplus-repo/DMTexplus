package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadesdelconti_impl extends GXWebComponent
{
   public consultadesdelconti_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultadesdelconti_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadesdelconti_impl.class ));
   }

   public consultadesdelconti_impl( int remoteHandle ,
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
               AV7Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
               AV8Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Fec1", localUtil.format(AV8Fec1, "99/99/99"));
               AV9Fec3 = localUtil.parseDateParm( httpContext.GetPar( "Fec3")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Fec3", localUtil.format(AV9Fec3, "99/99/99"));
               AV10PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10PCliCod), 6, 0));
               AV11CliCodP = (int)(GXutil.lval( httpContext.GetPar( "CliCodP"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CliCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCodP), 6, 0));
               AV12PBarCod = (int)(GXutil.lval( httpContext.GetPar( "PBarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12PBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12PBarCod), 8, 0));
               AV13Barcodp = (int)(GXutil.lval( httpContext.GetPar( "Barcodp"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Barcodp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Barcodp), 8, 0));
               AV14PBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "PBarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14PBarCodReo", GXutil.str( AV14PBarCodReo, 1, 0));
               AV15BarCodReoP = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoP"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarCodReoP", GXutil.str( AV15BarCodReoP, 1, 0));
               AV16PBarCodPar = httpContext.GetPar( "PBarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16PBarCodPar", AV16PBarCodPar);
               AV17BarCodParP = httpContext.GetPar( "BarCodParP") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarCodParP", AV17BarCodParP);
               AV18PSerie = httpContext.GetPar( "PSerie") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18PSerie", AV18PSerie);
               AV19SerieP = httpContext.GetPar( "SerieP") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19SerieP", AV19SerieP);
               AV20PColor = httpContext.GetPar( "PColor") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20PColor", AV20PColor);
               AV21ColorP = httpContext.GetPar( "ColorP") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ColorP", AV21ColorP);
               AV22PColNum = (int)(GXutil.lval( httpContext.GetPar( "PColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22PColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22PColNum), 6, 0));
               AV23ColNumP = (int)(GXutil.lval( httpContext.GetPar( "ColNumP"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ColNumP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23ColNumP), 6, 0));
               AV24DispCli1 = httpContext.GetPar( "DispCli1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24DispCli1", AV24DispCli1);
               AV25DispCli3 = httpContext.GetPar( "DispCli3") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25DispCli3", AV25DispCli3);
               AV26HreRacab = httpContext.GetPar( "HreRacab") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26HreRacab", AV26HreRacab);
               AV27MaqCodi = httpContext.GetPar( "MaqCodi") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27MaqCodi", AV27MaqCodi);
               AV28MaqCod3 = httpContext.GetPar( "MaqCod3") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28MaqCod3", AV28MaqCod3);
               AV118TipArtCodfrom = (short)(GXutil.lval( httpContext.GetPar( "TipArtCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TipArtCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118TipArtCodfrom), 4, 0));
               AV119TipArtCodto = (short)(GXutil.lval( httpContext.GetPar( "TipArtCodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TipArtCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119TipArtCodto), 4, 0));
               AV120SoloAd = httpContext.GetPar( "SoloAd") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120SoloAd", AV120SoloAd);
               AV121CorAdi = httpContext.GetPar( "CorAdi") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121CorAdi", AV121CorAdi);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7Emprcod,AV8Fec1,AV9Fec3,Integer.valueOf(AV10PCliCod),Integer.valueOf(AV11CliCodP),Integer.valueOf(AV12PBarCod),Integer.valueOf(AV13Barcodp),Byte.valueOf(AV14PBarCodReo),Byte.valueOf(AV15BarCodReoP),AV16PBarCodPar,AV17BarCodParP,AV18PSerie,AV19SerieP,AV20PColor,AV21ColorP,Integer.valueOf(AV22PColNum),Integer.valueOf(AV23ColNumP),AV24DispCli1,AV25DispCli3,AV26HreRacab,AV27MaqCodi,AV28MaqCod3,Short.valueOf(AV118TipArtCodfrom),Short.valueOf(AV119TipArtCodto),AV120SoloAd,AV121CorAdi});
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
      nRC_GXsfl_34 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_34"))) ;
      nGXsfl_34_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_34_idx"))) ;
      sGXsfl_34_idx = httpContext.GetPar( "sGXsfl_34_idx") ;
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
      AV7Emprcod = httpContext.GetPar( "Emprcod") ;
      AV8Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
      AV9Fec3 = localUtil.parseDateParm( httpContext.GetPar( "Fec3")) ;
      AV10PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
      AV11CliCodP = (int)(GXutil.lval( httpContext.GetPar( "CliCodP"))) ;
      AV12PBarCod = (int)(GXutil.lval( httpContext.GetPar( "PBarCod"))) ;
      AV13Barcodp = (int)(GXutil.lval( httpContext.GetPar( "Barcodp"))) ;
      AV14PBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "PBarCodReo"))) ;
      AV15BarCodReoP = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoP"))) ;
      AV16PBarCodPar = httpContext.GetPar( "PBarCodPar") ;
      AV17BarCodParP = httpContext.GetPar( "BarCodParP") ;
      AV18PSerie = httpContext.GetPar( "PSerie") ;
      AV19SerieP = httpContext.GetPar( "SerieP") ;
      AV20PColor = httpContext.GetPar( "PColor") ;
      AV21ColorP = httpContext.GetPar( "ColorP") ;
      AV22PColNum = (int)(GXutil.lval( httpContext.GetPar( "PColNum"))) ;
      AV23ColNumP = (int)(GXutil.lval( httpContext.GetPar( "ColNumP"))) ;
      AV24DispCli1 = httpContext.GetPar( "DispCli1") ;
      AV25DispCli3 = httpContext.GetPar( "DispCli3") ;
      AV26HreRacab = httpContext.GetPar( "HreRacab") ;
      AV27MaqCodi = httpContext.GetPar( "MaqCodi") ;
      AV28MaqCod3 = httpContext.GetPar( "MaqCod3") ;
      AV118TipArtCodfrom = (short)(GXutil.lval( httpContext.GetPar( "TipArtCodfrom"))) ;
      AV119TipArtCodto = (short)(GXutil.lval( httpContext.GetPar( "TipArtCodto"))) ;
      AV120SoloAd = httpContext.GetPar( "SoloAd") ;
      AV121CorAdi = httpContext.GetPar( "CorAdi") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV50ColumnsSelector);
      AV56TFEstFecCier = localUtil.parseDateParm( httpContext.GetPar( "TFEstFecCier")) ;
      AV60TFEstTinNr = (short)(GXutil.lval( httpContext.GetPar( "TFEstTinNr"))) ;
      AV61TFEstTinNr_To = (short)(GXutil.lval( httpContext.GetPar( "TFEstTinNr_To"))) ;
      AV130TFBarCodTin = (int)(GXutil.lval( httpContext.GetPar( "TFBarCodTin"))) ;
      AV131TFBarCodTin_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarCodTin_To"))) ;
      AV132TFBarReoTin = (byte)(GXutil.lval( httpContext.GetPar( "TFBarReoTin"))) ;
      AV133TFBarReoTin_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarReoTin_To"))) ;
      AV134TFBarParTin = httpContext.GetPar( "TFBarParTin") ;
      AV135TFBarParTin_Sel = httpContext.GetPar( "TFBarParTin_Sel") ;
      AV64TFBarAgrLot = httpContext.GetPar( "TFBarAgrLot") ;
      AV65TFBarAgrLot_Sel = httpContext.GetPar( "TFBarAgrLot_Sel") ;
      AV66TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV67TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV68TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV69TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV70TFBarSerTin = httpContext.GetPar( "TFBarSerTin") ;
      AV71TFBarSerTin_Sel = httpContext.GetPar( "TFBarSerTin_Sel") ;
      AV72TFBarDscTin = httpContext.GetPar( "TFBarDscTin") ;
      AV73TFBarDscTin_Sel = httpContext.GetPar( "TFBarDscTin_Sel") ;
      AV106TFBarArtTin = (short)(GXutil.lval( httpContext.GetPar( "TFBarArtTin"))) ;
      AV107TFBarArtTin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarArtTin_To"))) ;
      AV108TFBarArtTinD = httpContext.GetPar( "TFBarArtTinD") ;
      AV109TFBarArtTinD_Sel = httpContext.GetPar( "TFBarArtTinD_Sel") ;
      AV74TFBarColNoT = httpContext.GetPar( "TFBarColNoT") ;
      AV75TFBarColNoT_Sel = httpContext.GetPar( "TFBarColNoT_Sel") ;
      AV76TFBarColNuT = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNuT"))) ;
      AV77TFBarColNuT_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNuT_To"))) ;
      AV78TFBarTipCoT = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCoT"))) ;
      AV79TFBarTipCoT_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarTipCoT_To"))) ;
      AV80TFBarKgmTin = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgmTin"), ".") ;
      AV81TFBarKgmTin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgmTin_To"), ".") ;
      AV82TFBarKgsTt = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgsTt"), ".") ;
      AV83TFBarKgsTt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgsTt_To"), ".") ;
      AV84TFBarMtrTin = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtrTin"), ".") ;
      AV85TFBarMtrTin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtrTin_To"), ".") ;
      AV114TFBarNumtint = (short)(GXutil.lval( httpContext.GetPar( "TFBarNumtint"))) ;
      AV115TFBarNumtint_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarNumtint_To"))) ;
      AV86TFBarMtsTt = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtsTt"), ".") ;
      AV87TFBarMtsTt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtsTt_To"), ".") ;
      AV88TFBarMaqTin = httpContext.GetPar( "TFBarMaqTin") ;
      AV89TFBarMaqTin_Sel = httpContext.GetPar( "TFBarMaqTin_Sel") ;
      AV90TFBarVolTin = (int)(GXutil.lval( httpContext.GetPar( "TFBarVolTin"))) ;
      AV91TFBarVolTin_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarVolTin_To"))) ;
      AV110TFBarNumEny = (int)(GXutil.lval( httpContext.GetPar( "TFBarNumEny"))) ;
      AV111TFBarNumEny_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarNumEny_To"))) ;
      AV92TFBarDispCli = httpContext.GetPar( "TFBarDispCli") ;
      AV93TFBarDispCli_Sel = httpContext.GetPar( "TFBarDispCli_Sel") ;
      AV94TFBarNumAna = (short)(GXutil.lval( httpContext.GetPar( "TFBarNumAna"))) ;
      AV95TFBarNumAna_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarNumAna_To"))) ;
      AV122TFCosteInicial = CommonUtil.decimalVal( httpContext.GetPar( "TFCosteInicial"), ".") ;
      AV123TFCosteInicial_To = CommonUtil.decimalVal( httpContext.GetPar( "TFCosteInicial_To"), ".") ;
      AV124TFCosteAnyadidas = CommonUtil.decimalVal( httpContext.GetPar( "TFCosteAnyadidas"), ".") ;
      AV125TFCosteAnyadidas_To = CommonUtil.decimalVal( httpContext.GetPar( "TFCosteAnyadidas_To"), ".") ;
      AV138Pgmname = httpContext.GetPar( "Pgmname") ;
      AV34OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV35OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV100TotBarKgmTin = CommonUtil.decimalVal( httpContext.GetPar( "TotBarKgmTin"), ".") ;
      AV101TotBarMtrTin = CommonUtil.decimalVal( httpContext.GetPar( "TotBarMtrTin"), ".") ;
      AV116TotBarNumtint = GXutil.lval( httpContext.GetPar( "TotBarNumtint")) ;
      AV126TotCosteInicial = CommonUtil.decimalVal( httpContext.GetPar( "TotCosteInicial"), ".") ;
      AV128TotCosteAnyadidas = CommonUtil.decimalVal( httpContext.GetPar( "TotCosteAnyadidas"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8Fec1, AV9Fec3, AV10PCliCod, AV11CliCodP, AV12PBarCod, AV13Barcodp, AV14PBarCodReo, AV15BarCodReoP, AV16PBarCodPar, AV17BarCodParP, AV18PSerie, AV19SerieP, AV20PColor, AV21ColorP, AV22PColNum, AV23ColNumP, AV24DispCli1, AV25DispCli3, AV26HreRacab, AV27MaqCodi, AV28MaqCod3, AV118TipArtCodfrom, AV119TipArtCodto, AV120SoloAd, AV121CorAdi, AV50ColumnsSelector, AV56TFEstFecCier, AV60TFEstTinNr, AV61TFEstTinNr_To, AV130TFBarCodTin, AV131TFBarCodTin_To, AV132TFBarReoTin, AV133TFBarReoTin_To, AV134TFBarParTin, AV135TFBarParTin_Sel, AV64TFBarAgrLot, AV65TFBarAgrLot_Sel, AV66TFCliCod, AV67TFCliCod_To, AV68TFCliNom, AV69TFCliNom_Sel, AV70TFBarSerTin, AV71TFBarSerTin_Sel, AV72TFBarDscTin, AV73TFBarDscTin_Sel, AV106TFBarArtTin, AV107TFBarArtTin_To, AV108TFBarArtTinD, AV109TFBarArtTinD_Sel, AV74TFBarColNoT, AV75TFBarColNoT_Sel, AV76TFBarColNuT, AV77TFBarColNuT_To, AV78TFBarTipCoT, AV79TFBarTipCoT_To, AV80TFBarKgmTin, AV81TFBarKgmTin_To, AV82TFBarKgsTt, AV83TFBarKgsTt_To, AV84TFBarMtrTin, AV85TFBarMtrTin_To, AV114TFBarNumtint, AV115TFBarNumtint_To, AV86TFBarMtsTt, AV87TFBarMtsTt_To, AV88TFBarMaqTin, AV89TFBarMaqTin_Sel, AV90TFBarVolTin, AV91TFBarVolTin_To, AV110TFBarNumEny, AV111TFBarNumEny_To, AV92TFBarDispCli, AV93TFBarDispCli_Sel, AV94TFBarNumAna, AV95TFBarNumAna_To, AV122TFCosteInicial, AV123TFCosteInicial_To, AV124TFCosteAnyadidas, AV125TFCosteAnyadidas_To, AV138Pgmname, AV34OrderedBy, AV35OrderedDsc, AV100TotBarKgmTin, AV101TotBarMtrTin, AV116TotBarNumtint, AV126TotCosteInicial, AV128TotCosteAnyadidas, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa15C2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " LCONTI", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.consultadesdelconti", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV8Fec1)),GXutil.URLEncode(GXutil.formatDateParm(AV9Fec3)),GXutil.URLEncode(GXutil.ltrimstr(AV10PCliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11CliCodP,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12PBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13Barcodp,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14PBarCodReo,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCodReoP,1,0)),GXutil.URLEncode(GXutil.rtrim(AV16PBarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV17BarCodParP)),GXutil.URLEncode(GXutil.rtrim(AV18PSerie)),GXutil.URLEncode(GXutil.rtrim(AV19SerieP)),GXutil.URLEncode(GXutil.rtrim(AV20PColor)),GXutil.URLEncode(GXutil.rtrim(AV21ColorP)),GXutil.URLEncode(GXutil.ltrimstr(AV22PColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV23ColNumP,6,0)),GXutil.URLEncode(GXutil.rtrim(AV24DispCli1)),GXutil.URLEncode(GXutil.rtrim(AV25DispCli3)),GXutil.URLEncode(GXutil.rtrim(AV26HreRacab)),GXutil.URLEncode(GXutil.rtrim(AV27MaqCodi)),GXutil.URLEncode(GXutil.rtrim(AV28MaqCod3)),GXutil.URLEncode(GXutil.ltrimstr(AV118TipArtCodfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV119TipArtCodto,4,0)),GXutil.URLEncode(GXutil.rtrim(AV120SoloAd)),GXutil.URLEncode(GXutil.rtrim(AV121CorAdi))}, new String[] {"Emprcod","Fec1","Fec3","PCliCod","CliCodP","PBarCod","Barcodp","PBarCodReo","BarCodReoP","PBarCodPar","BarCodParP","PSerie","SerieP","PColor","ColorP","PColNum","ColNumP","DispCli1","DispCli3","HreRacab","MaqCodi","MaqCod3","TipArtCodfrom","TipArtCodto","SoloAd","CorAdi"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGMTIN", getSecureSignedToken( sPrefix, localUtil.format( AV100TotBarKgmTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTRTIN", getSecureSignedToken( sPrefix, localUtil.format( AV101TotBarMtrTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARNUMTINT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV116TotBarNumtint), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCOSTEINICIAL", getSecureSignedToken( sPrefix, localUtil.format( AV126TotCosteInicial, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCOSTEANYADIDAS", getSecureSignedToken( sPrefix, localUtil.format( AV128TotCosteAnyadidas, "ZZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadesdeLconti");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV138Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\consultadesdelconti:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_34", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_34, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV98GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV99GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV96DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV96DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV50ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV50ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Emprcod", GXutil.rtrim( wcpOAV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Fec1", localUtil.dtoc( wcpOAV8Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9Fec3", localUtil.dtoc( wcpOAV9Fec3, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10PCliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV10PCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11CliCodP", GXutil.ltrim( localUtil.ntoc( wcpOAV11CliCodP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12PBarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV12PBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13Barcodp", GXutil.ltrim( localUtil.ntoc( wcpOAV13Barcodp, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14PBarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOAV14PBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15BarCodReoP", GXutil.ltrim( localUtil.ntoc( wcpOAV15BarCodReoP, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16PBarCodPar", GXutil.rtrim( wcpOAV16PBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17BarCodParP", GXutil.rtrim( wcpOAV17BarCodParP));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18PSerie", GXutil.rtrim( wcpOAV18PSerie));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19SerieP", GXutil.rtrim( wcpOAV19SerieP));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20PColor", GXutil.rtrim( wcpOAV20PColor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21ColorP", GXutil.rtrim( wcpOAV21ColorP));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22PColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV22PColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23ColNumP", GXutil.ltrim( localUtil.ntoc( wcpOAV23ColNumP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24DispCli1", GXutil.rtrim( wcpOAV24DispCli1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25DispCli3", GXutil.rtrim( wcpOAV25DispCli3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26HreRacab", GXutil.rtrim( wcpOAV26HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27MaqCodi", GXutil.rtrim( wcpOAV27MaqCodi));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28MaqCod3", GXutil.rtrim( wcpOAV28MaqCod3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV118TipArtCodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV118TipArtCodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV119TipArtCodto", GXutil.ltrim( localUtil.ntoc( wcpOAV119TipArtCodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV120SoloAd", GXutil.rtrim( wcpOAV120SoloAd));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV121CorAdi", GXutil.rtrim( wcpOAV121CorAdi));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFESTFECCIER", localUtil.dtoc( AV56TFEstFecCier, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFESTTINNR", GXutil.ltrim( localUtil.ntoc( AV60TFEstTinNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFESTTINNR_TO", GXutil.ltrim( localUtil.ntoc( AV61TFEstTinNr_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODTIN", GXutil.ltrim( localUtil.ntoc( AV130TFBarCodTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODTIN_TO", GXutil.ltrim( localUtil.ntoc( AV131TFBarCodTin_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARREOTIN", GXutil.ltrim( localUtil.ntoc( AV132TFBarReoTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARREOTIN_TO", GXutil.ltrim( localUtil.ntoc( AV133TFBarReoTin_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPARTIN", GXutil.rtrim( AV134TFBarParTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARPARTIN_SEL", GXutil.rtrim( AV135TFBarParTin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGRLOT", GXutil.rtrim( AV64TFBarAgrLot));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARAGRLOT_SEL", GXutil.rtrim( AV65TFBarAgrLot_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV66TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV67TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV68TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV69TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERTIN", GXutil.rtrim( AV70TFBarSerTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERTIN_SEL", GXutil.rtrim( AV71TFBarSerTin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARDSCTIN", GXutil.rtrim( AV72TFBarDscTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARDSCTIN_SEL", GXutil.rtrim( AV73TFBarDscTin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARARTTIN", GXutil.ltrim( localUtil.ntoc( AV106TFBarArtTin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARARTTIN_TO", GXutil.ltrim( localUtil.ntoc( AV107TFBarArtTin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARARTTIND", GXutil.rtrim( AV108TFBarArtTinD));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARARTTIND_SEL", GXutil.rtrim( AV109TFBarArtTinD_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOT", GXutil.rtrim( AV74TFBarColNoT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOT_SEL", GXutil.rtrim( AV75TFBarColNoT_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUT", GXutil.ltrim( localUtil.ntoc( AV76TFBarColNuT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUT_TO", GXutil.ltrim( localUtil.ntoc( AV77TFBarColNuT_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOT", GXutil.ltrim( localUtil.ntoc( AV78TFBarTipCoT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARTIPCOT_TO", GXutil.ltrim( localUtil.ntoc( AV79TFBarTipCoT_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGMTIN", GXutil.ltrim( localUtil.ntoc( AV80TFBarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGMTIN_TO", GXutil.ltrim( localUtil.ntoc( AV81TFBarKgmTin_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGSTT", GXutil.ltrim( localUtil.ntoc( AV82TFBarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGSTT_TO", GXutil.ltrim( localUtil.ntoc( AV83TFBarKgsTt_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTRTIN", GXutil.ltrim( localUtil.ntoc( AV84TFBarMtrTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTRTIN_TO", GXutil.ltrim( localUtil.ntoc( AV85TFBarMtrTin_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMTINT", GXutil.ltrim( localUtil.ntoc( AV114TFBarNumtint, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMTINT_TO", GXutil.ltrim( localUtil.ntoc( AV115TFBarNumtint_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTSTT", GXutil.ltrim( localUtil.ntoc( AV86TFBarMtsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTSTT_TO", GXutil.ltrim( localUtil.ntoc( AV87TFBarMtsTt_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMAQTIN", GXutil.rtrim( AV88TFBarMaqTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMAQTIN_SEL", GXutil.rtrim( AV89TFBarMaqTin_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARVOLTIN", GXutil.ltrim( localUtil.ntoc( AV90TFBarVolTin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARVOLTIN_TO", GXutil.ltrim( localUtil.ntoc( AV91TFBarVolTin_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMENY", GXutil.ltrim( localUtil.ntoc( AV110TFBarNumEny, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMENY_TO", GXutil.ltrim( localUtil.ntoc( AV111TFBarNumEny_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARDISPCLI", GXutil.rtrim( AV92TFBarDispCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARDISPCLI_SEL", GXutil.rtrim( AV93TFBarDispCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMANA", GXutil.ltrim( localUtil.ntoc( AV94TFBarNumAna, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNUMANA_TO", GXutil.ltrim( localUtil.ntoc( AV95TFBarNumAna_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOSTEINICIAL", GXutil.ltrim( localUtil.ntoc( AV122TFCosteInicial, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOSTEINICIAL_TO", GXutil.ltrim( localUtil.ntoc( AV123TFCosteInicial_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOSTEANYADIDAS", GXutil.ltrim( localUtil.ntoc( AV124TFCosteAnyadidas, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCOSTEANYADIDAS_TO", GXutil.ltrim( localUtil.ntoc( AV125TFCosteAnyadidas_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV34OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV35OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC1", localUtil.dtoc( AV8Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC3", localUtil.dtoc( AV9Fec3, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPCLICOD", GXutil.ltrim( localUtil.ntoc( AV10PCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODP", GXutil.ltrim( localUtil.ntoc( AV11CliCodP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPBARCOD", GXutil.ltrim( localUtil.ntoc( AV12PBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODP", GXutil.ltrim( localUtil.ntoc( AV13Barcodp, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPBARCODREO", GXutil.ltrim( localUtil.ntoc( AV14PBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOP", GXutil.ltrim( localUtil.ntoc( AV15BarCodReoP, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPBARCODPAR", GXutil.rtrim( AV16PBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARP", GXutil.rtrim( AV17BarCodParP));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPSERIE", GXutil.rtrim( AV18PSerie));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSERIEP", GXutil.rtrim( AV19SerieP));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPCOLOR", GXutil.rtrim( AV20PColor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOLORP", GXutil.rtrim( AV21ColorP));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPCOLNUM", GXutil.ltrim( localUtil.ntoc( AV22PColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCOLNUMP", GXutil.ltrim( localUtil.ntoc( AV23ColNumP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDISPCLI1", GXutil.rtrim( AV24DispCli1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDISPCLI3", GXutil.rtrim( AV25DispCli3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRERACAB", GXutil.rtrim( AV26HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODI", GXutil.rtrim( AV27MaqCodi));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD3", GXutil.rtrim( AV28MaqCod3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCODFROM", GXutil.ltrim( localUtil.ntoc( AV118TipArtCodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCODTO", GXutil.ltrim( localUtil.ntoc( AV119TipArtCodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSOLOAD", GXutil.rtrim( AV120SoloAd));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCORADI", GXutil.rtrim( AV121CorAdi));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARRECACB", GXutil.rtrim( A6634BarRecAcb));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSANC", GXutil.ltrim( localUtil.ntoc( A3706BarCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGMTIN", GXutil.ltrim( localUtil.ntoc( AV100TotBarKgmTin, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGMTIN", getSecureSignedToken( sPrefix, localUtil.format( AV100TotBarKgmTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMTRTIN", GXutil.ltrim( localUtil.ntoc( AV101TotBarMtrTin, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTRTIN", getSecureSignedToken( sPrefix, localUtil.format( AV101TotBarMtrTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARNUMTINT", GXutil.ltrim( localUtil.ntoc( AV116TotBarNumtint, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARNUMTINT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV116TotBarNumtint), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCOSTEINICIAL", GXutil.ltrim( localUtil.ntoc( AV126TotCosteInicial, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCOSTEINICIAL", getSecureSignedToken( sPrefix, localUtil.format( AV126TotCosteInicial, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCOSTEANYADIDAS", GXutil.ltrim( localUtil.ntoc( AV128TotCosteAnyadidas, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCOSTEANYADIDAS", getSecureSignedToken( sPrefix, localUtil.format( AV128TotCosteAnyadidas, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSPD", GXutil.ltrim( localUtil.ntoc( A3654BarCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSPA", GXutil.ltrim( localUtil.ntoc( A3658BarCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOSCOL", GXutil.ltrim( localUtil.ntoc( A3705BarCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
   }

   public void renderHtmlCloseForm15C2( )
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
      return "FormulacionTinte.ConsultadesdeLconti" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " LCONTI", "") ;
   }

   public void wb15C0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.consultadesdelconti");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ConsultadesdeLconti.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ConsultadesdeLconti.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ConsultadesdeLconti.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_15C2( true) ;
      }
      else
      {
         wb_table1_23_15C2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_15C2e( boolean wbgen )
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
         startgridcontrol34( ) ;
      }
      if ( wbEnd == 34 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_34 = (int)(nGXsfl_34_idx-1) ;
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
         wb_table2_72_15C2( true) ;
      }
      else
      {
         wb_table2_72_15C2( false) ;
      }
      return  ;
   }

   public void wb_table2_72_15C2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV98GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV99GridPageCount);
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0124"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0124"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_34_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0124"+"");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV138Pgmname), GXutil.rtrim( localUtil.format( AV138Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV96DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV96DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV50ColumnsSelector);
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
         app.GxWebStd.gx_div_start( httpContext, divDdo_estfeccierauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_estfeccierauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_estfeccierauxdate_Internalname, localUtil.format(AV58DDO_EstFecCierAuxDate, "99/99/99"), localUtil.format( AV58DDO_EstFecCierAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,137);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_estfeccierauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_estfeccierauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 34 )
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

   public void start15C2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " LCONTI", ""), (short)(0)) ;
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
            strup15C0( ) ;
         }
      }
   }

   public void ws15C2( )
   {
      start15C2( ) ;
      evt15C2( ) ;
   }

   public void evt15C2( )
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
                              strup15C0( ) ;
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
                              strup15C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1115C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1215C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1315C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1415C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1515C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1615C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavBarcod_Internalname ;
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
                              strup15C0( ) ;
                           }
                           nGXsfl_34_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_342( ) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
                              GX_FocusControl = edtavBarcod_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV43BarCod = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43BarCod), 8, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD"+"_"+sGXsfl_34_idx, getSecureSignedToken( sPrefix+sGXsfl_34_idx, localUtil.format( DecimalUtil.doubleToDec(AV43BarCod), "ZZZZZZZ9")));
                           }
                           else
                           {
                              AV43BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43BarCod), 8, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD"+"_"+sGXsfl_34_idx, getSecureSignedToken( sPrefix+sGXsfl_34_idx, localUtil.format( DecimalUtil.doubleToDec(AV43BarCod), "ZZZZZZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
                              GX_FocusControl = edtavBarcodreo_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV44BarCodReo = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreo_Internalname, GXutil.str( AV44BarCodReo, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO"+"_"+sGXsfl_34_idx, getSecureSignedToken( sPrefix+sGXsfl_34_idx, localUtil.format( DecimalUtil.doubleToDec(AV44BarCodReo), "9")));
                           }
                           else
                           {
                              AV44BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreo_Internalname, GXutil.str( AV44BarCodReo, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO"+"_"+sGXsfl_34_idx, getSecureSignedToken( sPrefix+sGXsfl_34_idx, localUtil.format( DecimalUtil.doubleToDec(AV44BarCodReo), "9")));
                           }
                           AV45BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpar_Internalname, AV45BarCodPar);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR"+"_"+sGXsfl_34_idx, getSecureSignedToken( sPrefix+sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV45BarCodPar, ""))));
                           AV103DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV103DetailWebComponent);
                           A13759EstFecCier = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtEstFecCier_Internalname), 0)) ;
                           A1929EstTinNr = (short)(localUtil.ctol( httpContext.cgiGet( edtEstTinNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV113Marca = httpContext.cgiGet( edtavMarca_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMarca_Internalname, AV113Marca);
                           A1933BarCodTin = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCodTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1933BarCodTin = false ;
                           A1934BarReoTin = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarReoTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1934BarReoTin = false ;
                           A1935BarParTin = httpContext.cgiGet( edtBarParTin_Internalname) ;
                           n1935BarParTin = false ;
                           A13841Barnhdr_lc = httpContext.cgiGet( edtBarnhdr_lc_Internalname) ;
                           A2316BarAgrLot = httpContext.cgiGet( edtBarAgrLot_Internalname) ;
                           n2316BarAgrLot = false ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A1936BarSerTin = httpContext.cgiGet( edtBarSerTin_Internalname) ;
                           n1936BarSerTin = false ;
                           A1937BarDscTin = httpContext.cgiGet( edtBarDscTin_Internalname) ;
                           n1937BarDscTin = false ;
                           A1939BarArtTin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarArtTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1939BarArtTin = false ;
                           A13962BarArtTinD = httpContext.cgiGet( edtBarArtTinD_Internalname) ;
                           n13962BarArtTinD = false ;
                           A1940BarColNoT = httpContext.cgiGet( edtBarColNoT_Internalname) ;
                           n1940BarColNoT = false ;
                           A1941BarColNuT = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNuT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1941BarColNuT = false ;
                           A1942BarTipCoT = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCoT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1942BarTipCoT = false ;
                           A1947BarKgmTin = localUtil.ctond( httpContext.cgiGet( edtBarKgmTin_Internalname)) ;
                           n1947BarKgmTin = false ;
                           A8563BarKgsTt = localUtil.ctond( httpContext.cgiGet( edtBarKgsTt_Internalname)) ;
                           n8563BarKgsTt = false ;
                           A1948BarMtrTin = localUtil.ctond( httpContext.cgiGet( edtBarMtrTin_Internalname)) ;
                           n1948BarMtrTin = false ;
                           A13975BarNumtint = (short)(localUtil.ctol( httpContext.cgiGet( edtBarNumtint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A12993BarMtsTt = localUtil.ctond( httpContext.cgiGet( edtBarMtsTt_Internalname)) ;
                           n12993BarMtsTt = false ;
                           A1945BarMaqTin = httpContext.cgiGet( edtBarMaqTin_Internalname) ;
                           n1945BarMaqTin = false ;
                           A1946BarVolTin = (int)(localUtil.ctol( httpContext.cgiGet( edtBarVolTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1946BarVolTin = false ;
                           A13967BarNumEny = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumEny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13967BarNumEny = false ;
                           A11762BarDispCli = httpContext.cgiGet( edtBarDispCli_Internalname) ;
                           n11762BarDispCli = false ;
                           A3650BarNumAna = (short)(localUtil.ctol( httpContext.cgiGet( edtBarNumAna_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n3650BarNumAna = false ;
                           A14199CosteInici = localUtil.ctond( httpContext.cgiGet( edtCosteInici_Internalname)) ;
                           A14200CosteAnyad = localUtil.ctond( httpContext.cgiGet( edtCosteAnyad_Internalname)) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostekg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostekg_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEKG");
                              GX_FocusControl = edtavCostekg_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV41CosteKg = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostekg_Internalname, GXutil.ltrimstr( AV41CosteKg, 11, 5));
                           }
                           else
                           {
                              AV41CosteKg = localUtil.ctond( httpContext.cgiGet( edtavCostekg_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostekg_Internalname, GXutil.ltrimstr( AV41CosteKg, 11, 5));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostemt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostemt_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEMT");
                              GX_FocusControl = edtavCostemt_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV42CosteMT = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostemt_Internalname, GXutil.ltrimstr( AV42CosteMT, 11, 5));
                           }
                           else
                           {
                              AV42CosteMT = localUtil.ctond( httpContext.cgiGet( edtavCostemt_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostemt_Internalname, GXutil.ltrimstr( AV42CosteMT, 11, 5));
                           }
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
                                       GX_FocusControl = edtavBarcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1715C2 ();
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
                                       GX_FocusControl = edtavBarcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1815C2 ();
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
                                       GX_FocusControl = edtavBarcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1915C2 ();
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
                                    strup15C0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavBarcod_Internalname ;
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
                     if ( nCmpId == 124 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0124") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0124", "", sEvt);
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

   public void we15C2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm15C2( ) ;
         }
      }
   }

   public void pa15C2( )
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
            GX_FocusControl = edtavTotvaluebarkgmtin_Internalname ;
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
      subsflControlProps_342( ) ;
      while ( nGXsfl_34_idx <= nRC_GXsfl_34 )
      {
         sendrow_342( ) ;
         nGXsfl_34_idx = ((subGrid_Islastpage==1)&&(nGXsfl_34_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_34_idx+1) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV7Emprcod ,
                                 java.util.Date AV8Fec1 ,
                                 java.util.Date AV9Fec3 ,
                                 int AV10PCliCod ,
                                 int AV11CliCodP ,
                                 int AV12PBarCod ,
                                 int AV13Barcodp ,
                                 byte AV14PBarCodReo ,
                                 byte AV15BarCodReoP ,
                                 String AV16PBarCodPar ,
                                 String AV17BarCodParP ,
                                 String AV18PSerie ,
                                 String AV19SerieP ,
                                 String AV20PColor ,
                                 String AV21ColorP ,
                                 int AV22PColNum ,
                                 int AV23ColNumP ,
                                 String AV24DispCli1 ,
                                 String AV25DispCli3 ,
                                 String AV26HreRacab ,
                                 String AV27MaqCodi ,
                                 String AV28MaqCod3 ,
                                 short AV118TipArtCodfrom ,
                                 short AV119TipArtCodto ,
                                 String AV120SoloAd ,
                                 String AV121CorAdi ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV50ColumnsSelector ,
                                 java.util.Date AV56TFEstFecCier ,
                                 short AV60TFEstTinNr ,
                                 short AV61TFEstTinNr_To ,
                                 int AV130TFBarCodTin ,
                                 int AV131TFBarCodTin_To ,
                                 byte AV132TFBarReoTin ,
                                 byte AV133TFBarReoTin_To ,
                                 String AV134TFBarParTin ,
                                 String AV135TFBarParTin_Sel ,
                                 String AV64TFBarAgrLot ,
                                 String AV65TFBarAgrLot_Sel ,
                                 int AV66TFCliCod ,
                                 int AV67TFCliCod_To ,
                                 String AV68TFCliNom ,
                                 String AV69TFCliNom_Sel ,
                                 String AV70TFBarSerTin ,
                                 String AV71TFBarSerTin_Sel ,
                                 String AV72TFBarDscTin ,
                                 String AV73TFBarDscTin_Sel ,
                                 short AV106TFBarArtTin ,
                                 short AV107TFBarArtTin_To ,
                                 String AV108TFBarArtTinD ,
                                 String AV109TFBarArtTinD_Sel ,
                                 String AV74TFBarColNoT ,
                                 String AV75TFBarColNoT_Sel ,
                                 int AV76TFBarColNuT ,
                                 int AV77TFBarColNuT_To ,
                                 byte AV78TFBarTipCoT ,
                                 byte AV79TFBarTipCoT_To ,
                                 java.math.BigDecimal AV80TFBarKgmTin ,
                                 java.math.BigDecimal AV81TFBarKgmTin_To ,
                                 java.math.BigDecimal AV82TFBarKgsTt ,
                                 java.math.BigDecimal AV83TFBarKgsTt_To ,
                                 java.math.BigDecimal AV84TFBarMtrTin ,
                                 java.math.BigDecimal AV85TFBarMtrTin_To ,
                                 short AV114TFBarNumtint ,
                                 short AV115TFBarNumtint_To ,
                                 java.math.BigDecimal AV86TFBarMtsTt ,
                                 java.math.BigDecimal AV87TFBarMtsTt_To ,
                                 String AV88TFBarMaqTin ,
                                 String AV89TFBarMaqTin_Sel ,
                                 int AV90TFBarVolTin ,
                                 int AV91TFBarVolTin_To ,
                                 int AV110TFBarNumEny ,
                                 int AV111TFBarNumEny_To ,
                                 String AV92TFBarDispCli ,
                                 String AV93TFBarDispCli_Sel ,
                                 short AV94TFBarNumAna ,
                                 short AV95TFBarNumAna_To ,
                                 java.math.BigDecimal AV122TFCosteInicial ,
                                 java.math.BigDecimal AV123TFCosteInicial_To ,
                                 java.math.BigDecimal AV124TFCosteAnyadidas ,
                                 java.math.BigDecimal AV125TFCosteAnyadidas_To ,
                                 String AV138Pgmname ,
                                 short AV34OrderedBy ,
                                 boolean AV35OrderedDsc ,
                                 java.math.BigDecimal AV100TotBarKgmTin ,
                                 java.math.BigDecimal AV101TotBarMtrTin ,
                                 long AV116TotBarNumtint ,
                                 java.math.BigDecimal AV126TotCosteInicial ,
                                 java.math.BigDecimal AV128TotCosteAnyadidas ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1815C2 ();
      GRID_nCurrentRecord = 0 ;
      rf15C2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadesdeLconti");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV138Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\consultadesdelconti:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV43BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV44BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV44BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV45BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV45BarCodPar));
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
      rf15C2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV138Pgmname = "FormulacionTinte.ConsultadesdeLconti" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138Pgmname", AV138Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMarca_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavCostekg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostekg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostekg_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavCostemt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostemt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostemt_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavTotvaluebarkgmtin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgmtin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgmtin_Enabled), 5, 0), true);
      edtavTotvaluebarmtrtin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtrtin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtrtin_Enabled), 5, 0), true);
      edtavTotvaluebarnumtint_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarnumtint_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarnumtint_Enabled), 5, 0), true);
      edtavTotvaluecosteinicial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecosteinicial_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecosteinicial_Enabled), 5, 0), true);
      edtavTotvaluecosteanyadidas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecosteanyadidas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecosteanyadidas_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf15C2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(34) ;
      /* Execute user event: Refresh */
      e1815C2 ();
      nGXsfl_34_idx = 1 ;
      sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_342( ) ;
      bGXsfl_34_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_342( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                              Short.valueOf(AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr) ,
                                              Short.valueOf(AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) ,
                                              Integer.valueOf(AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) ,
                                              Integer.valueOf(AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) ,
                                              Byte.valueOf(AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin) ,
                                              Byte.valueOf(AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) ,
                                              AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                              AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                              AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                              AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                              Integer.valueOf(AV153Formulaciontinte_consultadesdelcontids_12_tfclicod) ,
                                              Integer.valueOf(AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to) ,
                                              AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                              AV155Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                              AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                              AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                              AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                              AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                              Short.valueOf(AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin) ,
                                              Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) ,
                                              AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                              AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                              Integer.valueOf(AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) ,
                                              Integer.valueOf(AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) ,
                                              Byte.valueOf(AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot) ,
                                              Byte.valueOf(AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) ,
                                              AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                              AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                              AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                              AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                              AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                              AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                              Short.valueOf(AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) ,
                                              Short.valueOf(AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) ,
                                              AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                              AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                              AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                              AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                              Integer.valueOf(AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) ,
                                              Integer.valueOf(AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) ,
                                              AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                              AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                              Short.valueOf(AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana) ,
                                              Short.valueOf(AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) ,
                                              AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                              AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                              AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                              AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                              Byte.valueOf(AV15BarCodReoP) ,
                                              A13759EstFecCier ,
                                              Short.valueOf(A1929EstTinNr) ,
                                              Integer.valueOf(A1933BarCodTin) ,
                                              Byte.valueOf(A1934BarReoTin) ,
                                              A1935BarParTin ,
                                              A2316BarAgrLot ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A1936BarSerTin ,
                                              A1937BarDscTin ,
                                              Short.valueOf(A1939BarArtTin) ,
                                              A1940BarColNoT ,
                                              Integer.valueOf(A1941BarColNuT) ,
                                              Byte.valueOf(A1942BarTipCoT) ,
                                              A1947BarKgmTin ,
                                              A8563BarKgsTt ,
                                              A1948BarMtrTin ,
                                              A12993BarMtsTt ,
                                              A1945BarMaqTin ,
                                              Integer.valueOf(A1946BarVolTin) ,
                                              A11762BarDispCli ,
                                              Short.valueOf(A3650BarNumAna) ,
                                              A3654BarCosPD ,
                                              A3658BarCosPA ,
                                              A3705BarCosCol ,
                                              A3656BarCosAD ,
                                              A3657BarCosAA ,
                                              A3706BarCosAnc ,
                                              Short.valueOf(AV34OrderedBy) ,
                                              Boolean.valueOf(AV35OrderedDsc) ,
                                              AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                              AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                              A13962BarArtTinD ,
                                              Integer.valueOf(AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny) ,
                                              Integer.valueOf(A13967BarNumEny) ,
                                              Integer.valueOf(AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to) ,
                                              AV8Fec1 ,
                                              AV9Fec3 ,
                                              Integer.valueOf(AV10PCliCod) ,
                                              Integer.valueOf(AV11CliCodP) ,
                                              Integer.valueOf(AV12PBarCod) ,
                                              Integer.valueOf(AV13Barcodp) ,
                                              Byte.valueOf(AV14PBarCodReo) ,
                                              AV16PBarCodPar ,
                                              AV17BarCodParP ,
                                              AV18PSerie ,
                                              AV19SerieP ,
                                              AV20PColor ,
                                              AV21ColorP ,
                                              Integer.valueOf(AV22PColNum) ,
                                              Integer.valueOf(AV23ColNumP) ,
                                              AV24DispCli1 ,
                                              AV25DispCli3 ,
                                              A6634BarRecAcb ,
                                              AV26HreRacab ,
                                              AV27MaqCodi ,
                                              AV28MaqCod3 ,
                                              Short.valueOf(AV118TipArtCodfrom) ,
                                              Short.valueOf(AV119TipArtCodto) ,
                                              AV120SoloAd ,
                                              AV121CorAdi ,
                                              A14200CosteAnyad ,
                                              AV7Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                              TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                              TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                              TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING,
                                              TypeConstants.STRING
                                              }
         });
         lV163Formulaciontinte_consultadesdelcontids_22_tfbararttind = GXutil.padr( GXutil.rtrim( AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind), 30, "%") ;
         lV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin = GXutil.padr( GXutil.rtrim( AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin), 1, "%") ;
         lV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = GXutil.padr( GXutil.rtrim( AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot), 10, "%") ;
         lV155Formulaciontinte_consultadesdelcontids_14_tfclinom = GXutil.padr( GXutil.rtrim( AV155Formulaciontinte_consultadesdelcontids_14_tfclinom), 30, "%") ;
         lV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin = GXutil.padr( GXutil.rtrim( AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin), 16, "%") ;
         lV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin = GXutil.padr( GXutil.rtrim( AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin), 26, "%") ;
         lV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = GXutil.padr( GXutil.rtrim( AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot), 13, "%") ;
         lV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = GXutil.padr( GXutil.rtrim( AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin), 6, "%") ;
         lV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli = GXutil.padr( GXutil.rtrim( AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli), 20, "%") ;
         /* Using cursor H015C2 */
         pr_default.execute(0, new Object[] {AV7Emprcod, AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind, lV163Formulaciontinte_consultadesdelcontids_22_tfbararttind, AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, Integer.valueOf(AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), Integer.valueOf(AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), AV8Fec1, AV9Fec3, Integer.valueOf(AV10PCliCod), Integer.valueOf(AV11CliCodP), Integer.valueOf(AV12PBarCod), Integer.valueOf(AV13Barcodp), Byte.valueOf(AV14PBarCodReo), AV16PBarCodPar, AV17BarCodParP, AV18PSerie, AV19SerieP, AV20PColor, AV21ColorP, Integer.valueOf(AV22PColNum), Integer.valueOf(AV23ColNumP), AV24DispCli1, AV25DispCli3, AV26HreRacab, AV26HreRacab, AV27MaqCodi, AV28MaqCod3, Short.valueOf(AV118TipArtCodfrom), Short.valueOf(AV119TipArtCodto), AV120SoloAd, AV120SoloAd, AV121CorAdi, AV120SoloAd, AV121CorAdi, AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier, Short.valueOf(AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr), Short.valueOf(AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to), Integer.valueOf(AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin), Integer.valueOf(AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to), Byte.valueOf(AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin), Byte.valueOf(AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to), lV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin, AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel, lV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot, AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel, Integer.valueOf(AV153Formulaciontinte_consultadesdelcontids_12_tfclicod), Integer.valueOf(AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to), lV155Formulaciontinte_consultadesdelcontids_14_tfclinom, AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel, lV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin, AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel, lV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin, AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel, Short.valueOf(AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin), Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to), lV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot, AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel, Integer.valueOf(AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut), Integer.valueOf(AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to), Byte.valueOf(AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot), Byte.valueOf(AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to), AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin, AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to, AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt, AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to, AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin, AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to, Short.valueOf(AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint), Short.valueOf(AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to), AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt, AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to, lV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin, AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel, Integer.valueOf(AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin), Integer.valueOf(AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to), lV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli, AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel, Short.valueOf(AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana), Short.valueOf(AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to), AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial, AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to, AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas, AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to, Byte.valueOf(AV15BarCodReoP), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_34_idx = 1 ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_342( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A6634BarRecAcb = H015C2_A6634BarRecAcb[0] ;
            n6634BarRecAcb = H015C2_n6634BarRecAcb[0] ;
            A396EmprCod = H015C2_A396EmprCod[0] ;
            A14200CosteAnyad = H015C2_A14200CosteAnyad[0] ;
            A3650BarNumAna = H015C2_A3650BarNumAna[0] ;
            n3650BarNumAna = H015C2_n3650BarNumAna[0] ;
            A11762BarDispCli = H015C2_A11762BarDispCli[0] ;
            n11762BarDispCli = H015C2_n11762BarDispCli[0] ;
            A1946BarVolTin = H015C2_A1946BarVolTin[0] ;
            n1946BarVolTin = H015C2_n1946BarVolTin[0] ;
            A1945BarMaqTin = H015C2_A1945BarMaqTin[0] ;
            n1945BarMaqTin = H015C2_n1945BarMaqTin[0] ;
            A12993BarMtsTt = H015C2_A12993BarMtsTt[0] ;
            n12993BarMtsTt = H015C2_n12993BarMtsTt[0] ;
            A1948BarMtrTin = H015C2_A1948BarMtrTin[0] ;
            n1948BarMtrTin = H015C2_n1948BarMtrTin[0] ;
            A8563BarKgsTt = H015C2_A8563BarKgsTt[0] ;
            n8563BarKgsTt = H015C2_n8563BarKgsTt[0] ;
            A1947BarKgmTin = H015C2_A1947BarKgmTin[0] ;
            n1947BarKgmTin = H015C2_n1947BarKgmTin[0] ;
            A1942BarTipCoT = H015C2_A1942BarTipCoT[0] ;
            n1942BarTipCoT = H015C2_n1942BarTipCoT[0] ;
            A1941BarColNuT = H015C2_A1941BarColNuT[0] ;
            n1941BarColNuT = H015C2_n1941BarColNuT[0] ;
            A1940BarColNoT = H015C2_A1940BarColNoT[0] ;
            n1940BarColNoT = H015C2_n1940BarColNoT[0] ;
            A1939BarArtTin = H015C2_A1939BarArtTin[0] ;
            n1939BarArtTin = H015C2_n1939BarArtTin[0] ;
            A1937BarDscTin = H015C2_A1937BarDscTin[0] ;
            n1937BarDscTin = H015C2_n1937BarDscTin[0] ;
            A1936BarSerTin = H015C2_A1936BarSerTin[0] ;
            n1936BarSerTin = H015C2_n1936BarSerTin[0] ;
            A279CliNom = H015C2_A279CliNom[0] ;
            A252CliCod = H015C2_A252CliCod[0] ;
            A1929EstTinNr = H015C2_A1929EstTinNr[0] ;
            A13759EstFecCier = H015C2_A13759EstFecCier[0] ;
            A3656BarCosAD = H015C2_A3656BarCosAD[0] ;
            n3656BarCosAD = H015C2_n3656BarCosAD[0] ;
            A3657BarCosAA = H015C2_A3657BarCosAA[0] ;
            n3657BarCosAA = H015C2_n3657BarCosAA[0] ;
            A3706BarCosAnc = H015C2_A3706BarCosAnc[0] ;
            n3706BarCosAnc = H015C2_n3706BarCosAnc[0] ;
            A13967BarNumEny = H015C2_A13967BarNumEny[0] ;
            n13967BarNumEny = H015C2_n13967BarNumEny[0] ;
            A13962BarArtTinD = H015C2_A13962BarArtTinD[0] ;
            n13962BarArtTinD = H015C2_n13962BarArtTinD[0] ;
            A1935BarParTin = H015C2_A1935BarParTin[0] ;
            n1935BarParTin = H015C2_n1935BarParTin[0] ;
            A1934BarReoTin = H015C2_A1934BarReoTin[0] ;
            n1934BarReoTin = H015C2_n1934BarReoTin[0] ;
            A1933BarCodTin = H015C2_A1933BarCodTin[0] ;
            n1933BarCodTin = H015C2_n1933BarCodTin[0] ;
            A2316BarAgrLot = H015C2_A2316BarAgrLot[0] ;
            n2316BarAgrLot = H015C2_n2316BarAgrLot[0] ;
            A3705BarCosCol = H015C2_A3705BarCosCol[0] ;
            n3705BarCosCol = H015C2_n3705BarCosCol[0] ;
            A3658BarCosPA = H015C2_A3658BarCosPA[0] ;
            n3658BarCosPA = H015C2_n3658BarCosPA[0] ;
            A3654BarCosPD = H015C2_A3654BarCosPD[0] ;
            n3654BarCosPD = H015C2_n3654BarCosPD[0] ;
            A13962BarArtTinD = H015C2_A13962BarArtTinD[0] ;
            n13962BarArtTinD = H015C2_n13962BarArtTinD[0] ;
            A279CliNom = H015C2_A279CliNom[0] ;
            A13967BarNumEny = H015C2_A13967BarNumEny[0] ;
            n13967BarNumEny = H015C2_n13967BarNumEny[0] ;
            A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
            if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
            {
               A13975BarNumtint = (short)(1) ;
            }
            else
            {
               if ( true )
               {
                  A13975BarNumtint = (short)(0) ;
               }
               else
               {
                  A13975BarNumtint = (short)(0) ;
               }
            }
            A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
            e1915C2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(34) ;
         wb15C0( ) ;
      }
      bGXsfl_34_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes15C2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGMTIN", GXutil.ltrim( localUtil.ntoc( AV100TotBarKgmTin, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGMTIN", getSecureSignedToken( sPrefix, localUtil.format( AV100TotBarKgmTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMTRTIN", GXutil.ltrim( localUtil.ntoc( AV101TotBarMtrTin, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTRTIN", getSecureSignedToken( sPrefix, localUtil.format( AV101TotBarMtrTin, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARNUMTINT", GXutil.ltrim( localUtil.ntoc( AV116TotBarNumtint, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARNUMTINT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV116TotBarNumtint), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCOSTEINICIAL", GXutil.ltrim( localUtil.ntoc( AV126TotCosteInicial, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCOSTEINICIAL", getSecureSignedToken( sPrefix, localUtil.format( AV126TotCosteInicial, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTCOSTEANYADIDAS", GXutil.ltrim( localUtil.ntoc( AV128TotCosteAnyadidas, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCOSTEANYADIDAS", getSecureSignedToken( sPrefix, localUtil.format( AV128TotCosteAnyadidas, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD"+"_"+sGXsfl_34_idx, getSecureSignedToken( sPrefix+sGXsfl_34_idx, localUtil.format( DecimalUtil.doubleToDec(AV43BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO"+"_"+sGXsfl_34_idx, getSecureSignedToken( sPrefix+sGXsfl_34_idx, localUtil.format( DecimalUtil.doubleToDec(AV44BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR"+"_"+sGXsfl_34_idx, getSecureSignedToken( sPrefix+sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV45BarCodPar, ""))));
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
      AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV56TFEstFecCier ;
      AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV60TFEstTinNr ;
      AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV61TFEstTinNr_To ;
      AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV130TFBarCodTin ;
      AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV131TFBarCodTin_To ;
      AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV132TFBarReoTin ;
      AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV133TFBarReoTin_To ;
      AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV134TFBarParTin ;
      AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV135TFBarParTin_Sel ;
      AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV64TFBarAgrLot ;
      AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV65TFBarAgrLot_Sel ;
      AV153Formulaciontinte_consultadesdelcontids_12_tfclicod = AV66TFCliCod ;
      AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV67TFCliCod_To ;
      AV155Formulaciontinte_consultadesdelcontids_14_tfclinom = AV68TFCliNom ;
      AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV69TFCliNom_Sel ;
      AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV70TFBarSerTin ;
      AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV71TFBarSerTin_Sel ;
      AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV72TFBarDscTin ;
      AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV73TFBarDscTin_Sel ;
      AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV106TFBarArtTin ;
      AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV107TFBarArtTin_To ;
      AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV108TFBarArtTinD ;
      AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV109TFBarArtTinD_Sel ;
      AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV74TFBarColNoT ;
      AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV75TFBarColNoT_Sel ;
      AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV76TFBarColNuT ;
      AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV77TFBarColNuT_To ;
      AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV78TFBarTipCoT ;
      AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV79TFBarTipCoT_To ;
      AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV80TFBarKgmTin ;
      AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV81TFBarKgmTin_To ;
      AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV82TFBarKgsTt ;
      AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV83TFBarKgsTt_To ;
      AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV84TFBarMtrTin ;
      AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV85TFBarMtrTin_To ;
      AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV114TFBarNumtint ;
      AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV115TFBarNumtint_To ;
      AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV86TFBarMtsTt ;
      AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV87TFBarMtsTt_To ;
      AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV88TFBarMaqTin ;
      AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV89TFBarMaqTin_Sel ;
      AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV90TFBarVolTin ;
      AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV91TFBarVolTin_To ;
      AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV110TFBarNumEny ;
      AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV111TFBarNumEny_To ;
      AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV92TFBarDispCli ;
      AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV93TFBarDispCli_Sel ;
      AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV94TFBarNumAna ;
      AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV95TFBarNumAna_To ;
      AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV122TFCosteInicial ;
      AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV123TFCosteInicial_To ;
      AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV124TFCosteAnyadidas ;
      AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV125TFCosteAnyadidas_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                           Short.valueOf(AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr) ,
                                           Short.valueOf(AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) ,
                                           Integer.valueOf(AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) ,
                                           Integer.valueOf(AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) ,
                                           Byte.valueOf(AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin) ,
                                           Byte.valueOf(AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) ,
                                           AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                           AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                           AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                           AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                           Integer.valueOf(AV153Formulaciontinte_consultadesdelcontids_12_tfclicod) ,
                                           Integer.valueOf(AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to) ,
                                           AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                           AV155Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                           AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                           AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                           AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                           AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                           Short.valueOf(AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin) ,
                                           Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) ,
                                           AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                           AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                           Integer.valueOf(AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) ,
                                           Integer.valueOf(AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) ,
                                           Byte.valueOf(AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot) ,
                                           Byte.valueOf(AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) ,
                                           AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                           AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                           AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                           AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                           AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                           AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                           Short.valueOf(AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) ,
                                           Short.valueOf(AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) ,
                                           AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                           AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                           AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                           AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                           Integer.valueOf(AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) ,
                                           Integer.valueOf(AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) ,
                                           AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                           AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                           Short.valueOf(AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana) ,
                                           Short.valueOf(AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) ,
                                           AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                           AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                           AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                           AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                           Byte.valueOf(AV15BarCodReoP) ,
                                           A13759EstFecCier ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           Short.valueOf(A1939BarArtTin) ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           A3654BarCosPD ,
                                           A3658BarCosPA ,
                                           A3705BarCosCol ,
                                           A3656BarCosAD ,
                                           A3657BarCosAA ,
                                           A3706BarCosAnc ,
                                           Short.valueOf(AV34OrderedBy) ,
                                           Boolean.valueOf(AV35OrderedDsc) ,
                                           AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                           AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                           A13962BarArtTinD ,
                                           Integer.valueOf(AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny) ,
                                           Integer.valueOf(A13967BarNumEny) ,
                                           Integer.valueOf(AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to) ,
                                           AV8Fec1 ,
                                           AV9Fec3 ,
                                           Integer.valueOf(AV10PCliCod) ,
                                           Integer.valueOf(AV11CliCodP) ,
                                           Integer.valueOf(AV12PBarCod) ,
                                           Integer.valueOf(AV13Barcodp) ,
                                           Byte.valueOf(AV14PBarCodReo) ,
                                           AV16PBarCodPar ,
                                           AV17BarCodParP ,
                                           AV18PSerie ,
                                           AV19SerieP ,
                                           AV20PColor ,
                                           AV21ColorP ,
                                           Integer.valueOf(AV22PColNum) ,
                                           Integer.valueOf(AV23ColNumP) ,
                                           AV24DispCli1 ,
                                           AV25DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV26HreRacab ,
                                           AV27MaqCodi ,
                                           AV28MaqCod3 ,
                                           Short.valueOf(AV118TipArtCodfrom) ,
                                           Short.valueOf(AV119TipArtCodto) ,
                                           AV120SoloAd ,
                                           AV121CorAdi ,
                                           A14200CosteAnyad ,
                                           AV7Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV163Formulaciontinte_consultadesdelcontids_22_tfbararttind = GXutil.padr( GXutil.rtrim( AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind), 30, "%") ;
      lV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin = GXutil.padr( GXutil.rtrim( AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin), 1, "%") ;
      lV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = GXutil.padr( GXutil.rtrim( AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot), 10, "%") ;
      lV155Formulaciontinte_consultadesdelcontids_14_tfclinom = GXutil.padr( GXutil.rtrim( AV155Formulaciontinte_consultadesdelcontids_14_tfclinom), 30, "%") ;
      lV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin = GXutil.padr( GXutil.rtrim( AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin), 16, "%") ;
      lV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin = GXutil.padr( GXutil.rtrim( AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin), 26, "%") ;
      lV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = GXutil.padr( GXutil.rtrim( AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot), 13, "%") ;
      lV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = GXutil.padr( GXutil.rtrim( AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin), 6, "%") ;
      lV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli = GXutil.padr( GXutil.rtrim( AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli), 20, "%") ;
      /* Using cursor H015C3 */
      pr_default.execute(1, new Object[] {AV7Emprcod, AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind, lV163Formulaciontinte_consultadesdelcontids_22_tfbararttind, AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, Integer.valueOf(AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), Integer.valueOf(AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), AV8Fec1, AV9Fec3, Integer.valueOf(AV10PCliCod), Integer.valueOf(AV11CliCodP), Integer.valueOf(AV12PBarCod), Integer.valueOf(AV13Barcodp), Byte.valueOf(AV14PBarCodReo), AV16PBarCodPar, AV17BarCodParP, AV18PSerie, AV19SerieP, AV20PColor, AV21ColorP, Integer.valueOf(AV22PColNum), Integer.valueOf(AV23ColNumP), AV24DispCli1, AV25DispCli3, AV26HreRacab, AV26HreRacab, AV27MaqCodi, AV28MaqCod3, Short.valueOf(AV118TipArtCodfrom), Short.valueOf(AV119TipArtCodto), AV120SoloAd, AV120SoloAd, AV121CorAdi, AV120SoloAd, AV121CorAdi, AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier, Short.valueOf(AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr), Short.valueOf(AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to), Integer.valueOf(AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin), Integer.valueOf(AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to), Byte.valueOf(AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin), Byte.valueOf(AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to), lV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin, AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel, lV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot, AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel, Integer.valueOf(AV153Formulaciontinte_consultadesdelcontids_12_tfclicod), Integer.valueOf(AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to), lV155Formulaciontinte_consultadesdelcontids_14_tfclinom, AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel, lV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin, AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel, lV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin, AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel, Short.valueOf(AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin), Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to), lV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot, AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel, Integer.valueOf(AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut), Integer.valueOf(AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to), Byte.valueOf(AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot), Byte.valueOf(AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to), AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin, AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to, AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt, AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to, AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin, AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to, Short.valueOf(AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint), Short.valueOf(AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to), AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt, AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to, lV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin, AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel, Integer.valueOf(AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin), Integer.valueOf(AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to), lV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli, AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel, Short.valueOf(AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana), Short.valueOf(AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to), AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial, AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to, AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas, AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to, Byte.valueOf(AV15BarCodReoP)});
      GRID_nRecordCount = H015C3_AGRID_nRecordCount[0] ;
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
      AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV56TFEstFecCier ;
      AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV60TFEstTinNr ;
      AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV61TFEstTinNr_To ;
      AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV130TFBarCodTin ;
      AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV131TFBarCodTin_To ;
      AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV132TFBarReoTin ;
      AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV133TFBarReoTin_To ;
      AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV134TFBarParTin ;
      AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV135TFBarParTin_Sel ;
      AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV64TFBarAgrLot ;
      AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV65TFBarAgrLot_Sel ;
      AV153Formulaciontinte_consultadesdelcontids_12_tfclicod = AV66TFCliCod ;
      AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV67TFCliCod_To ;
      AV155Formulaciontinte_consultadesdelcontids_14_tfclinom = AV68TFCliNom ;
      AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV69TFCliNom_Sel ;
      AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV70TFBarSerTin ;
      AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV71TFBarSerTin_Sel ;
      AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV72TFBarDscTin ;
      AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV73TFBarDscTin_Sel ;
      AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV106TFBarArtTin ;
      AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV107TFBarArtTin_To ;
      AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV108TFBarArtTinD ;
      AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV109TFBarArtTinD_Sel ;
      AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV74TFBarColNoT ;
      AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV75TFBarColNoT_Sel ;
      AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV76TFBarColNuT ;
      AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV77TFBarColNuT_To ;
      AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV78TFBarTipCoT ;
      AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV79TFBarTipCoT_To ;
      AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV80TFBarKgmTin ;
      AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV81TFBarKgmTin_To ;
      AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV82TFBarKgsTt ;
      AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV83TFBarKgsTt_To ;
      AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV84TFBarMtrTin ;
      AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV85TFBarMtrTin_To ;
      AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV114TFBarNumtint ;
      AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV115TFBarNumtint_To ;
      AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV86TFBarMtsTt ;
      AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV87TFBarMtsTt_To ;
      AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV88TFBarMaqTin ;
      AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV89TFBarMaqTin_Sel ;
      AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV90TFBarVolTin ;
      AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV91TFBarVolTin_To ;
      AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV110TFBarNumEny ;
      AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV111TFBarNumEny_To ;
      AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV92TFBarDispCli ;
      AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV93TFBarDispCli_Sel ;
      AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV94TFBarNumAna ;
      AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV95TFBarNumAna_To ;
      AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV122TFCosteInicial ;
      AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV123TFCosteInicial_To ;
      AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV124TFCosteAnyadidas ;
      AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV125TFCosteAnyadidas_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8Fec1, AV9Fec3, AV10PCliCod, AV11CliCodP, AV12PBarCod, AV13Barcodp, AV14PBarCodReo, AV15BarCodReoP, AV16PBarCodPar, AV17BarCodParP, AV18PSerie, AV19SerieP, AV20PColor, AV21ColorP, AV22PColNum, AV23ColNumP, AV24DispCli1, AV25DispCli3, AV26HreRacab, AV27MaqCodi, AV28MaqCod3, AV118TipArtCodfrom, AV119TipArtCodto, AV120SoloAd, AV121CorAdi, AV50ColumnsSelector, AV56TFEstFecCier, AV60TFEstTinNr, AV61TFEstTinNr_To, AV130TFBarCodTin, AV131TFBarCodTin_To, AV132TFBarReoTin, AV133TFBarReoTin_To, AV134TFBarParTin, AV135TFBarParTin_Sel, AV64TFBarAgrLot, AV65TFBarAgrLot_Sel, AV66TFCliCod, AV67TFCliCod_To, AV68TFCliNom, AV69TFCliNom_Sel, AV70TFBarSerTin, AV71TFBarSerTin_Sel, AV72TFBarDscTin, AV73TFBarDscTin_Sel, AV106TFBarArtTin, AV107TFBarArtTin_To, AV108TFBarArtTinD, AV109TFBarArtTinD_Sel, AV74TFBarColNoT, AV75TFBarColNoT_Sel, AV76TFBarColNuT, AV77TFBarColNuT_To, AV78TFBarTipCoT, AV79TFBarTipCoT_To, AV80TFBarKgmTin, AV81TFBarKgmTin_To, AV82TFBarKgsTt, AV83TFBarKgsTt_To, AV84TFBarMtrTin, AV85TFBarMtrTin_To, AV114TFBarNumtint, AV115TFBarNumtint_To, AV86TFBarMtsTt, AV87TFBarMtsTt_To, AV88TFBarMaqTin, AV89TFBarMaqTin_Sel, AV90TFBarVolTin, AV91TFBarVolTin_To, AV110TFBarNumEny, AV111TFBarNumEny_To, AV92TFBarDispCli, AV93TFBarDispCli_Sel, AV94TFBarNumAna, AV95TFBarNumAna_To, AV122TFCosteInicial, AV123TFCosteInicial_To, AV124TFCosteAnyadidas, AV125TFCosteAnyadidas_To, AV138Pgmname, AV34OrderedBy, AV35OrderedDsc, AV100TotBarKgmTin, AV101TotBarMtrTin, AV116TotBarNumtint, AV126TotCosteInicial, AV128TotCosteAnyadidas, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV56TFEstFecCier ;
      AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV60TFEstTinNr ;
      AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV61TFEstTinNr_To ;
      AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV130TFBarCodTin ;
      AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV131TFBarCodTin_To ;
      AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV132TFBarReoTin ;
      AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV133TFBarReoTin_To ;
      AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV134TFBarParTin ;
      AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV135TFBarParTin_Sel ;
      AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV64TFBarAgrLot ;
      AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV65TFBarAgrLot_Sel ;
      AV153Formulaciontinte_consultadesdelcontids_12_tfclicod = AV66TFCliCod ;
      AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV67TFCliCod_To ;
      AV155Formulaciontinte_consultadesdelcontids_14_tfclinom = AV68TFCliNom ;
      AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV69TFCliNom_Sel ;
      AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV70TFBarSerTin ;
      AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV71TFBarSerTin_Sel ;
      AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV72TFBarDscTin ;
      AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV73TFBarDscTin_Sel ;
      AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV106TFBarArtTin ;
      AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV107TFBarArtTin_To ;
      AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV108TFBarArtTinD ;
      AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV109TFBarArtTinD_Sel ;
      AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV74TFBarColNoT ;
      AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV75TFBarColNoT_Sel ;
      AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV76TFBarColNuT ;
      AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV77TFBarColNuT_To ;
      AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV78TFBarTipCoT ;
      AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV79TFBarTipCoT_To ;
      AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV80TFBarKgmTin ;
      AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV81TFBarKgmTin_To ;
      AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV82TFBarKgsTt ;
      AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV83TFBarKgsTt_To ;
      AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV84TFBarMtrTin ;
      AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV85TFBarMtrTin_To ;
      AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV114TFBarNumtint ;
      AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV115TFBarNumtint_To ;
      AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV86TFBarMtsTt ;
      AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV87TFBarMtsTt_To ;
      AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV88TFBarMaqTin ;
      AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV89TFBarMaqTin_Sel ;
      AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV90TFBarVolTin ;
      AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV91TFBarVolTin_To ;
      AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV110TFBarNumEny ;
      AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV111TFBarNumEny_To ;
      AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV92TFBarDispCli ;
      AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV93TFBarDispCli_Sel ;
      AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV94TFBarNumAna ;
      AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV95TFBarNumAna_To ;
      AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV122TFCosteInicial ;
      AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV123TFCosteInicial_To ;
      AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV124TFCosteAnyadidas ;
      AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV125TFCosteAnyadidas_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8Fec1, AV9Fec3, AV10PCliCod, AV11CliCodP, AV12PBarCod, AV13Barcodp, AV14PBarCodReo, AV15BarCodReoP, AV16PBarCodPar, AV17BarCodParP, AV18PSerie, AV19SerieP, AV20PColor, AV21ColorP, AV22PColNum, AV23ColNumP, AV24DispCli1, AV25DispCli3, AV26HreRacab, AV27MaqCodi, AV28MaqCod3, AV118TipArtCodfrom, AV119TipArtCodto, AV120SoloAd, AV121CorAdi, AV50ColumnsSelector, AV56TFEstFecCier, AV60TFEstTinNr, AV61TFEstTinNr_To, AV130TFBarCodTin, AV131TFBarCodTin_To, AV132TFBarReoTin, AV133TFBarReoTin_To, AV134TFBarParTin, AV135TFBarParTin_Sel, AV64TFBarAgrLot, AV65TFBarAgrLot_Sel, AV66TFCliCod, AV67TFCliCod_To, AV68TFCliNom, AV69TFCliNom_Sel, AV70TFBarSerTin, AV71TFBarSerTin_Sel, AV72TFBarDscTin, AV73TFBarDscTin_Sel, AV106TFBarArtTin, AV107TFBarArtTin_To, AV108TFBarArtTinD, AV109TFBarArtTinD_Sel, AV74TFBarColNoT, AV75TFBarColNoT_Sel, AV76TFBarColNuT, AV77TFBarColNuT_To, AV78TFBarTipCoT, AV79TFBarTipCoT_To, AV80TFBarKgmTin, AV81TFBarKgmTin_To, AV82TFBarKgsTt, AV83TFBarKgsTt_To, AV84TFBarMtrTin, AV85TFBarMtrTin_To, AV114TFBarNumtint, AV115TFBarNumtint_To, AV86TFBarMtsTt, AV87TFBarMtsTt_To, AV88TFBarMaqTin, AV89TFBarMaqTin_Sel, AV90TFBarVolTin, AV91TFBarVolTin_To, AV110TFBarNumEny, AV111TFBarNumEny_To, AV92TFBarDispCli, AV93TFBarDispCli_Sel, AV94TFBarNumAna, AV95TFBarNumAna_To, AV122TFCosteInicial, AV123TFCosteInicial_To, AV124TFCosteAnyadidas, AV125TFCosteAnyadidas_To, AV138Pgmname, AV34OrderedBy, AV35OrderedDsc, AV100TotBarKgmTin, AV101TotBarMtrTin, AV116TotBarNumtint, AV126TotCosteInicial, AV128TotCosteAnyadidas, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV56TFEstFecCier ;
      AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV60TFEstTinNr ;
      AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV61TFEstTinNr_To ;
      AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV130TFBarCodTin ;
      AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV131TFBarCodTin_To ;
      AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV132TFBarReoTin ;
      AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV133TFBarReoTin_To ;
      AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV134TFBarParTin ;
      AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV135TFBarParTin_Sel ;
      AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV64TFBarAgrLot ;
      AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV65TFBarAgrLot_Sel ;
      AV153Formulaciontinte_consultadesdelcontids_12_tfclicod = AV66TFCliCod ;
      AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV67TFCliCod_To ;
      AV155Formulaciontinte_consultadesdelcontids_14_tfclinom = AV68TFCliNom ;
      AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV69TFCliNom_Sel ;
      AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV70TFBarSerTin ;
      AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV71TFBarSerTin_Sel ;
      AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV72TFBarDscTin ;
      AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV73TFBarDscTin_Sel ;
      AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV106TFBarArtTin ;
      AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV107TFBarArtTin_To ;
      AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV108TFBarArtTinD ;
      AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV109TFBarArtTinD_Sel ;
      AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV74TFBarColNoT ;
      AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV75TFBarColNoT_Sel ;
      AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV76TFBarColNuT ;
      AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV77TFBarColNuT_To ;
      AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV78TFBarTipCoT ;
      AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV79TFBarTipCoT_To ;
      AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV80TFBarKgmTin ;
      AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV81TFBarKgmTin_To ;
      AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV82TFBarKgsTt ;
      AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV83TFBarKgsTt_To ;
      AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV84TFBarMtrTin ;
      AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV85TFBarMtrTin_To ;
      AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV114TFBarNumtint ;
      AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV115TFBarNumtint_To ;
      AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV86TFBarMtsTt ;
      AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV87TFBarMtsTt_To ;
      AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV88TFBarMaqTin ;
      AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV89TFBarMaqTin_Sel ;
      AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV90TFBarVolTin ;
      AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV91TFBarVolTin_To ;
      AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV110TFBarNumEny ;
      AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV111TFBarNumEny_To ;
      AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV92TFBarDispCli ;
      AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV93TFBarDispCli_Sel ;
      AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV94TFBarNumAna ;
      AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV95TFBarNumAna_To ;
      AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV122TFCosteInicial ;
      AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV123TFCosteInicial_To ;
      AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV124TFCosteAnyadidas ;
      AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV125TFCosteAnyadidas_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8Fec1, AV9Fec3, AV10PCliCod, AV11CliCodP, AV12PBarCod, AV13Barcodp, AV14PBarCodReo, AV15BarCodReoP, AV16PBarCodPar, AV17BarCodParP, AV18PSerie, AV19SerieP, AV20PColor, AV21ColorP, AV22PColNum, AV23ColNumP, AV24DispCli1, AV25DispCli3, AV26HreRacab, AV27MaqCodi, AV28MaqCod3, AV118TipArtCodfrom, AV119TipArtCodto, AV120SoloAd, AV121CorAdi, AV50ColumnsSelector, AV56TFEstFecCier, AV60TFEstTinNr, AV61TFEstTinNr_To, AV130TFBarCodTin, AV131TFBarCodTin_To, AV132TFBarReoTin, AV133TFBarReoTin_To, AV134TFBarParTin, AV135TFBarParTin_Sel, AV64TFBarAgrLot, AV65TFBarAgrLot_Sel, AV66TFCliCod, AV67TFCliCod_To, AV68TFCliNom, AV69TFCliNom_Sel, AV70TFBarSerTin, AV71TFBarSerTin_Sel, AV72TFBarDscTin, AV73TFBarDscTin_Sel, AV106TFBarArtTin, AV107TFBarArtTin_To, AV108TFBarArtTinD, AV109TFBarArtTinD_Sel, AV74TFBarColNoT, AV75TFBarColNoT_Sel, AV76TFBarColNuT, AV77TFBarColNuT_To, AV78TFBarTipCoT, AV79TFBarTipCoT_To, AV80TFBarKgmTin, AV81TFBarKgmTin_To, AV82TFBarKgsTt, AV83TFBarKgsTt_To, AV84TFBarMtrTin, AV85TFBarMtrTin_To, AV114TFBarNumtint, AV115TFBarNumtint_To, AV86TFBarMtsTt, AV87TFBarMtsTt_To, AV88TFBarMaqTin, AV89TFBarMaqTin_Sel, AV90TFBarVolTin, AV91TFBarVolTin_To, AV110TFBarNumEny, AV111TFBarNumEny_To, AV92TFBarDispCli, AV93TFBarDispCli_Sel, AV94TFBarNumAna, AV95TFBarNumAna_To, AV122TFCosteInicial, AV123TFCosteInicial_To, AV124TFCosteAnyadidas, AV125TFCosteAnyadidas_To, AV138Pgmname, AV34OrderedBy, AV35OrderedDsc, AV100TotBarKgmTin, AV101TotBarMtrTin, AV116TotBarNumtint, AV126TotCosteInicial, AV128TotCosteAnyadidas, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV56TFEstFecCier ;
      AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV60TFEstTinNr ;
      AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV61TFEstTinNr_To ;
      AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV130TFBarCodTin ;
      AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV131TFBarCodTin_To ;
      AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV132TFBarReoTin ;
      AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV133TFBarReoTin_To ;
      AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV134TFBarParTin ;
      AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV135TFBarParTin_Sel ;
      AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV64TFBarAgrLot ;
      AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV65TFBarAgrLot_Sel ;
      AV153Formulaciontinte_consultadesdelcontids_12_tfclicod = AV66TFCliCod ;
      AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV67TFCliCod_To ;
      AV155Formulaciontinte_consultadesdelcontids_14_tfclinom = AV68TFCliNom ;
      AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV69TFCliNom_Sel ;
      AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV70TFBarSerTin ;
      AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV71TFBarSerTin_Sel ;
      AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV72TFBarDscTin ;
      AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV73TFBarDscTin_Sel ;
      AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV106TFBarArtTin ;
      AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV107TFBarArtTin_To ;
      AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV108TFBarArtTinD ;
      AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV109TFBarArtTinD_Sel ;
      AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV74TFBarColNoT ;
      AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV75TFBarColNoT_Sel ;
      AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV76TFBarColNuT ;
      AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV77TFBarColNuT_To ;
      AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV78TFBarTipCoT ;
      AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV79TFBarTipCoT_To ;
      AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV80TFBarKgmTin ;
      AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV81TFBarKgmTin_To ;
      AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV82TFBarKgsTt ;
      AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV83TFBarKgsTt_To ;
      AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV84TFBarMtrTin ;
      AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV85TFBarMtrTin_To ;
      AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV114TFBarNumtint ;
      AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV115TFBarNumtint_To ;
      AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV86TFBarMtsTt ;
      AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV87TFBarMtsTt_To ;
      AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV88TFBarMaqTin ;
      AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV89TFBarMaqTin_Sel ;
      AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV90TFBarVolTin ;
      AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV91TFBarVolTin_To ;
      AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV110TFBarNumEny ;
      AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV111TFBarNumEny_To ;
      AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV92TFBarDispCli ;
      AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV93TFBarDispCli_Sel ;
      AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV94TFBarNumAna ;
      AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV95TFBarNumAna_To ;
      AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV122TFCosteInicial ;
      AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV123TFCosteInicial_To ;
      AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV124TFCosteAnyadidas ;
      AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV125TFCosteAnyadidas_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8Fec1, AV9Fec3, AV10PCliCod, AV11CliCodP, AV12PBarCod, AV13Barcodp, AV14PBarCodReo, AV15BarCodReoP, AV16PBarCodPar, AV17BarCodParP, AV18PSerie, AV19SerieP, AV20PColor, AV21ColorP, AV22PColNum, AV23ColNumP, AV24DispCli1, AV25DispCli3, AV26HreRacab, AV27MaqCodi, AV28MaqCod3, AV118TipArtCodfrom, AV119TipArtCodto, AV120SoloAd, AV121CorAdi, AV50ColumnsSelector, AV56TFEstFecCier, AV60TFEstTinNr, AV61TFEstTinNr_To, AV130TFBarCodTin, AV131TFBarCodTin_To, AV132TFBarReoTin, AV133TFBarReoTin_To, AV134TFBarParTin, AV135TFBarParTin_Sel, AV64TFBarAgrLot, AV65TFBarAgrLot_Sel, AV66TFCliCod, AV67TFCliCod_To, AV68TFCliNom, AV69TFCliNom_Sel, AV70TFBarSerTin, AV71TFBarSerTin_Sel, AV72TFBarDscTin, AV73TFBarDscTin_Sel, AV106TFBarArtTin, AV107TFBarArtTin_To, AV108TFBarArtTinD, AV109TFBarArtTinD_Sel, AV74TFBarColNoT, AV75TFBarColNoT_Sel, AV76TFBarColNuT, AV77TFBarColNuT_To, AV78TFBarTipCoT, AV79TFBarTipCoT_To, AV80TFBarKgmTin, AV81TFBarKgmTin_To, AV82TFBarKgsTt, AV83TFBarKgsTt_To, AV84TFBarMtrTin, AV85TFBarMtrTin_To, AV114TFBarNumtint, AV115TFBarNumtint_To, AV86TFBarMtsTt, AV87TFBarMtsTt_To, AV88TFBarMaqTin, AV89TFBarMaqTin_Sel, AV90TFBarVolTin, AV91TFBarVolTin_To, AV110TFBarNumEny, AV111TFBarNumEny_To, AV92TFBarDispCli, AV93TFBarDispCli_Sel, AV94TFBarNumAna, AV95TFBarNumAna_To, AV122TFCosteInicial, AV123TFCosteInicial_To, AV124TFCosteAnyadidas, AV125TFCosteAnyadidas_To, AV138Pgmname, AV34OrderedBy, AV35OrderedDsc, AV100TotBarKgmTin, AV101TotBarMtrTin, AV116TotBarNumtint, AV126TotCosteInicial, AV128TotCosteAnyadidas, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV56TFEstFecCier ;
      AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV60TFEstTinNr ;
      AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV61TFEstTinNr_To ;
      AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV130TFBarCodTin ;
      AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV131TFBarCodTin_To ;
      AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV132TFBarReoTin ;
      AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV133TFBarReoTin_To ;
      AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV134TFBarParTin ;
      AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV135TFBarParTin_Sel ;
      AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV64TFBarAgrLot ;
      AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV65TFBarAgrLot_Sel ;
      AV153Formulaciontinte_consultadesdelcontids_12_tfclicod = AV66TFCliCod ;
      AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV67TFCliCod_To ;
      AV155Formulaciontinte_consultadesdelcontids_14_tfclinom = AV68TFCliNom ;
      AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV69TFCliNom_Sel ;
      AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV70TFBarSerTin ;
      AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV71TFBarSerTin_Sel ;
      AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV72TFBarDscTin ;
      AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV73TFBarDscTin_Sel ;
      AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV106TFBarArtTin ;
      AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV107TFBarArtTin_To ;
      AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV108TFBarArtTinD ;
      AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV109TFBarArtTinD_Sel ;
      AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV74TFBarColNoT ;
      AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV75TFBarColNoT_Sel ;
      AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV76TFBarColNuT ;
      AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV77TFBarColNuT_To ;
      AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV78TFBarTipCoT ;
      AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV79TFBarTipCoT_To ;
      AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV80TFBarKgmTin ;
      AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV81TFBarKgmTin_To ;
      AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV82TFBarKgsTt ;
      AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV83TFBarKgsTt_To ;
      AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV84TFBarMtrTin ;
      AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV85TFBarMtrTin_To ;
      AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV114TFBarNumtint ;
      AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV115TFBarNumtint_To ;
      AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV86TFBarMtsTt ;
      AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV87TFBarMtsTt_To ;
      AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV88TFBarMaqTin ;
      AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV89TFBarMaqTin_Sel ;
      AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV90TFBarVolTin ;
      AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV91TFBarVolTin_To ;
      AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV110TFBarNumEny ;
      AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV111TFBarNumEny_To ;
      AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV92TFBarDispCli ;
      AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV93TFBarDispCli_Sel ;
      AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV94TFBarNumAna ;
      AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV95TFBarNumAna_To ;
      AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV122TFCosteInicial ;
      AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV123TFCosteInicial_To ;
      AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV124TFCosteAnyadidas ;
      AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV125TFCosteAnyadidas_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7Emprcod, AV8Fec1, AV9Fec3, AV10PCliCod, AV11CliCodP, AV12PBarCod, AV13Barcodp, AV14PBarCodReo, AV15BarCodReoP, AV16PBarCodPar, AV17BarCodParP, AV18PSerie, AV19SerieP, AV20PColor, AV21ColorP, AV22PColNum, AV23ColNumP, AV24DispCli1, AV25DispCli3, AV26HreRacab, AV27MaqCodi, AV28MaqCod3, AV118TipArtCodfrom, AV119TipArtCodto, AV120SoloAd, AV121CorAdi, AV50ColumnsSelector, AV56TFEstFecCier, AV60TFEstTinNr, AV61TFEstTinNr_To, AV130TFBarCodTin, AV131TFBarCodTin_To, AV132TFBarReoTin, AV133TFBarReoTin_To, AV134TFBarParTin, AV135TFBarParTin_Sel, AV64TFBarAgrLot, AV65TFBarAgrLot_Sel, AV66TFCliCod, AV67TFCliCod_To, AV68TFCliNom, AV69TFCliNom_Sel, AV70TFBarSerTin, AV71TFBarSerTin_Sel, AV72TFBarDscTin, AV73TFBarDscTin_Sel, AV106TFBarArtTin, AV107TFBarArtTin_To, AV108TFBarArtTinD, AV109TFBarArtTinD_Sel, AV74TFBarColNoT, AV75TFBarColNoT_Sel, AV76TFBarColNuT, AV77TFBarColNuT_To, AV78TFBarTipCoT, AV79TFBarTipCoT_To, AV80TFBarKgmTin, AV81TFBarKgmTin_To, AV82TFBarKgsTt, AV83TFBarKgsTt_To, AV84TFBarMtrTin, AV85TFBarMtrTin_To, AV114TFBarNumtint, AV115TFBarNumtint_To, AV86TFBarMtsTt, AV87TFBarMtsTt_To, AV88TFBarMaqTin, AV89TFBarMaqTin_Sel, AV90TFBarVolTin, AV91TFBarVolTin_To, AV110TFBarNumEny, AV111TFBarNumEny_To, AV92TFBarDispCli, AV93TFBarDispCli_Sel, AV94TFBarNumAna, AV95TFBarNumAna_To, AV122TFCosteInicial, AV123TFCosteInicial_To, AV124TFCosteAnyadidas, AV125TFCosteAnyadidas_To, AV138Pgmname, AV34OrderedBy, AV35OrderedDsc, AV100TotBarKgmTin, AV101TotBarMtrTin, AV116TotBarNumtint, AV126TotCosteInicial, AV128TotCosteAnyadidas, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV138Pgmname = "FormulacionTinte.ConsultadesdeLconti" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138Pgmname", AV138Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMarca_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavCostekg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostekg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostekg_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavCostemt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostemt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostemt_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavTotvaluebarkgmtin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgmtin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgmtin_Enabled), 5, 0), true);
      edtavTotvaluebarmtrtin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtrtin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtrtin_Enabled), 5, 0), true);
      edtavTotvaluebarnumtint_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarnumtint_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarnumtint_Enabled), 5, 0), true);
      edtavTotvaluecosteinicial_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecosteinicial_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecosteinicial_Enabled), 5, 0), true);
      edtavTotvaluecosteanyadidas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluecosteanyadidas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluecosteanyadidas_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup15C0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1715C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV96DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV50ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_34 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_34"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV98GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV99GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV7Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7Emprcod") ;
         wcpOAV8Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8Fec1"), 0) ;
         wcpOAV9Fec3 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9Fec3"), 0) ;
         wcpOAV10PCliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10PCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV11CliCodP = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11CliCodP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV12PBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV12PBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV13Barcodp = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13Barcodp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV14PBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14PBarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV15BarCodReoP = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15BarCodReoP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV16PBarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV16PBarCodPar") ;
         wcpOAV17BarCodParP = httpContext.cgiGet( sPrefix+"wcpOAV17BarCodParP") ;
         wcpOAV18PSerie = httpContext.cgiGet( sPrefix+"wcpOAV18PSerie") ;
         wcpOAV19SerieP = httpContext.cgiGet( sPrefix+"wcpOAV19SerieP") ;
         wcpOAV20PColor = httpContext.cgiGet( sPrefix+"wcpOAV20PColor") ;
         wcpOAV21ColorP = httpContext.cgiGet( sPrefix+"wcpOAV21ColorP") ;
         wcpOAV22PColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22PColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV23ColNumP = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV23ColNumP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV24DispCli1 = httpContext.cgiGet( sPrefix+"wcpOAV24DispCli1") ;
         wcpOAV25DispCli3 = httpContext.cgiGet( sPrefix+"wcpOAV25DispCli3") ;
         wcpOAV26HreRacab = httpContext.cgiGet( sPrefix+"wcpOAV26HreRacab") ;
         wcpOAV27MaqCodi = httpContext.cgiGet( sPrefix+"wcpOAV27MaqCodi") ;
         wcpOAV28MaqCod3 = httpContext.cgiGet( sPrefix+"wcpOAV28MaqCod3") ;
         wcpOAV118TipArtCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV118TipArtCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV119TipArtCodto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV119TipArtCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV120SoloAd = httpContext.cgiGet( sPrefix+"wcpOAV120SoloAd") ;
         wcpOAV121CorAdi = httpContext.cgiGet( sPrefix+"wcpOAV121CorAdi") ;
         AV7Emprcod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
         /* Read variables values. */
         AV104TotValueBarKgmTin = httpContext.cgiGet( edtavTotvaluebarkgmtin_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TotValueBarKgmTin", AV104TotValueBarKgmTin);
         AV105TotValueBarMtrTin = httpContext.cgiGet( edtavTotvaluebarmtrtin_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TotValueBarMtrTin", AV105TotValueBarMtrTin);
         AV117TotValueBarNumtint = httpContext.cgiGet( edtavTotvaluebarnumtint_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117TotValueBarNumtint", AV117TotValueBarNumtint);
         AV127TotValueCosteInicial = httpContext.cgiGet( edtavTotvaluecosteinicial_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127TotValueCosteInicial", AV127TotValueCosteInicial);
         AV129TotValueCosteAnyadidas = httpContext.cgiGet( edtavTotvaluecosteanyadidas_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129TotValueCosteAnyadidas", AV129TotValueCosteAnyadidas);
         AV138Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138Pgmname", AV138Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_estfeccierauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ESTFECCIERAUXDATE");
            GX_FocusControl = edtavDdo_estfeccierauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV58DDO_EstFecCierAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58DDO_EstFecCierAuxDate", localUtil.format(AV58DDO_EstFecCierAuxDate, "99/99/99"));
         }
         else
         {
            AV58DDO_EstFecCierAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_estfeccierauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58DDO_EstFecCierAuxDate", localUtil.format(AV58DDO_EstFecCierAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConsultadesdeLconti");
         AV138Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV138Pgmname", AV138Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV138Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\consultadesdelconti:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1715C2 ();
      if (returnInSub) return;
   }

   public void e1715C2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV139Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultadesdelconti_impl.this.GXt_char1 = GXv_char2[0] ;
      AV139Station = GXt_char1 ;
      GXv_char2[0] = AV7Emprcod ;
      GXv_char3[0] = AV140Emprnom ;
      GXv_char4[0] = AV141Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV139Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultadesdelconti_impl.this.AV7Emprcod = GXv_char2[0] ;
      consultadesdelconti_impl.this.AV140Emprnom = GXv_char3[0] ;
      consultadesdelconti_impl.this.AV141Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
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
      if ( AV34OrderedBy < 1 )
      {
         AV34OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV96DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV96DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e1815C2( )
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
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV52Session.getValue("FormulacionTinte.ConsultadesdeLcontiColumnsSelector"), "") != 0 )
      {
         AV48ColumnsSelectorXML = AV52Session.getValue("FormulacionTinte.ConsultadesdeLcontiColumnsSelector") ;
         AV50ColumnsSelector.fromxml(AV48ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S152 ();
         if (returnInSub) return;
      }
      edtEstFecCier_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEstFecCier_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstFecCier_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtEstTinNr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEstTinNr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinNr_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavMarca_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMarca_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMarca_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarCodTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodTin_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarReoTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarReoTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarReoTin_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarParTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarParTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParTin_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarAgrLot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarAgrLot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrLot_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarSerTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerTin_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarDscTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarDscTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDscTin_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarArtTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarArtTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarArtTin_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarArtTinD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarArtTinD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarArtTinD_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarColNoT_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNoT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNoT_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarColNuT_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNuT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNuT_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarTipCoT_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarTipCoT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCoT_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarKgmTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarKgmTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgmTin_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarKgsTt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarKgsTt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgsTt_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarMtrTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMtrTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtrTin_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarNumtint_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNumtint_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumtint_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarMtsTt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMtsTt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtsTt_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarMaqTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMaqTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqTin_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarVolTin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarVolTin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarVolTin_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarNumEny_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNumEny_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumEny_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarDispCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarDispCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDispCli_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtBarNumAna_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNumAna_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumAna_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtCosteInici_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCosteInici_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCosteInici_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtCosteAnyad_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCosteAnyad_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCosteAnyad_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavCostekg_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostekg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostekg_Visible), 5, 0), !bGXsfl_34_Refreshing);
      edtavCostemt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostemt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostemt_Visible), 5, 0), !bGXsfl_34_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      AV98GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98GridCurrentPage), 10, 0));
      AV99GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV99GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV56TFEstFecCier ;
      AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV60TFEstTinNr ;
      AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV61TFEstTinNr_To ;
      AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV130TFBarCodTin ;
      AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV131TFBarCodTin_To ;
      AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV132TFBarReoTin ;
      AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV133TFBarReoTin_To ;
      AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV134TFBarParTin ;
      AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV135TFBarParTin_Sel ;
      AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV64TFBarAgrLot ;
      AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV65TFBarAgrLot_Sel ;
      AV153Formulaciontinte_consultadesdelcontids_12_tfclicod = AV66TFCliCod ;
      AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV67TFCliCod_To ;
      AV155Formulaciontinte_consultadesdelcontids_14_tfclinom = AV68TFCliNom ;
      AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV69TFCliNom_Sel ;
      AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV70TFBarSerTin ;
      AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV71TFBarSerTin_Sel ;
      AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV72TFBarDscTin ;
      AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV73TFBarDscTin_Sel ;
      AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV106TFBarArtTin ;
      AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV107TFBarArtTin_To ;
      AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV108TFBarArtTinD ;
      AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV109TFBarArtTinD_Sel ;
      AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV74TFBarColNoT ;
      AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV75TFBarColNoT_Sel ;
      AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV76TFBarColNuT ;
      AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV77TFBarColNuT_To ;
      AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV78TFBarTipCoT ;
      AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV79TFBarTipCoT_To ;
      AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV80TFBarKgmTin ;
      AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV81TFBarKgmTin_To ;
      AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV82TFBarKgsTt ;
      AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV83TFBarKgsTt_To ;
      AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV84TFBarMtrTin ;
      AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV85TFBarMtrTin_To ;
      AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV114TFBarNumtint ;
      AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV115TFBarNumtint_To ;
      AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV86TFBarMtsTt ;
      AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV87TFBarMtsTt_To ;
      AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV88TFBarMaqTin ;
      AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV89TFBarMaqTin_Sel ;
      AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV90TFBarVolTin ;
      AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV91TFBarVolTin_To ;
      AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV110TFBarNumEny ;
      AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV111TFBarNumEny_To ;
      AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV92TFBarDispCli ;
      AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV93TFBarDispCli_Sel ;
      AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV94TFBarNumAna ;
      AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV95TFBarNumAna_To ;
      AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV122TFCosteInicial ;
      AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV123TFCosteInicial_To ;
      AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV124TFCosteAnyadidas ;
      AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV125TFCosteAnyadidas_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV50ColumnsSelector", AV50ColumnsSelector);
   }

   public void e1115C2( )
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
         AV97PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV97PageToGo) ;
      }
   }

   public void e1215C2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1315C2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV34OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
         AV35OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35OrderedDsc", AV35OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EstFecCier") == 0 )
         {
            AV56TFEstFecCier = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFEstFecCier", localUtil.format(AV56TFEstFecCier, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EstTinNr") == 0 )
         {
            AV60TFEstTinNr = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFEstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFEstTinNr), 4, 0));
            AV61TFEstTinNr_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFEstTinNr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFEstTinNr_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodTin") == 0 )
         {
            AV130TFBarCodTin = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130TFBarCodTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130TFBarCodTin), 8, 0));
            AV131TFBarCodTin_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131TFBarCodTin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV131TFBarCodTin_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarReoTin") == 0 )
         {
            AV132TFBarReoTin = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132TFBarReoTin", GXutil.str( AV132TFBarReoTin, 1, 0));
            AV133TFBarReoTin_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV133TFBarReoTin_To", GXutil.str( AV133TFBarReoTin_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarParTin") == 0 )
         {
            AV134TFBarParTin = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134TFBarParTin", AV134TFBarParTin);
            AV135TFBarParTin_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV135TFBarParTin_Sel", AV135TFBarParTin_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarAgrLot") == 0 )
         {
            AV64TFBarAgrLot = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFBarAgrLot", AV64TFBarAgrLot);
            AV65TFBarAgrLot_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarAgrLot_Sel", AV65TFBarAgrLot_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV66TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFCliCod), 6, 0));
            AV67TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV68TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFCliNom", AV68TFCliNom);
            AV69TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFCliNom_Sel", AV69TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerTin") == 0 )
         {
            AV70TFBarSerTin = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFBarSerTin", AV70TFBarSerTin);
            AV71TFBarSerTin_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarSerTin_Sel", AV71TFBarSerTin_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarDscTin") == 0 )
         {
            AV72TFBarDscTin = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFBarDscTin", AV72TFBarDscTin);
            AV73TFBarDscTin_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFBarDscTin_Sel", AV73TFBarDscTin_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarArtTin") == 0 )
         {
            AV106TFBarArtTin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106TFBarArtTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106TFBarArtTin), 4, 0));
            AV107TFBarArtTin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFBarArtTin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107TFBarArtTin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarArtTinD") == 0 )
         {
            AV108TFBarArtTinD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFBarArtTinD", AV108TFBarArtTinD);
            AV109TFBarArtTinD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFBarArtTinD_Sel", AV109TFBarArtTinD_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNoT") == 0 )
         {
            AV74TFBarColNoT = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFBarColNoT", AV74TFBarColNoT);
            AV75TFBarColNoT_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFBarColNoT_Sel", AV75TFBarColNoT_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNuT") == 0 )
         {
            AV76TFBarColNuT = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFBarColNuT", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFBarColNuT), 6, 0));
            AV77TFBarColNuT_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFBarColNuT_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFBarColNuT_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTipCoT") == 0 )
         {
            AV78TFBarTipCoT = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFBarTipCoT", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFBarTipCoT), 2, 0));
            AV79TFBarTipCoT_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFBarTipCoT_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFBarTipCoT_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarKgmTin") == 0 )
         {
            AV80TFBarKgmTin = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFBarKgmTin", GXutil.ltrimstr( AV80TFBarKgmTin, 9, 2));
            AV81TFBarKgmTin_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFBarKgmTin_To", GXutil.ltrimstr( AV81TFBarKgmTin_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarKgsTt") == 0 )
         {
            AV82TFBarKgsTt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFBarKgsTt", GXutil.ltrimstr( AV82TFBarKgsTt, 10, 2));
            AV83TFBarKgsTt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFBarKgsTt_To", GXutil.ltrimstr( AV83TFBarKgsTt_To, 10, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMtrTin") == 0 )
         {
            AV84TFBarMtrTin = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFBarMtrTin", GXutil.ltrimstr( AV84TFBarMtrTin, 9, 2));
            AV85TFBarMtrTin_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFBarMtrTin_To", GXutil.ltrimstr( AV85TFBarMtrTin_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNumtint") == 0 )
         {
            AV114TFBarNumtint = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFBarNumtint", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TFBarNumtint), 4, 0));
            AV115TFBarNumtint_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115TFBarNumtint_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115TFBarNumtint_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMtsTt") == 0 )
         {
            AV86TFBarMtsTt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFBarMtsTt", GXutil.ltrimstr( AV86TFBarMtsTt, 10, 2));
            AV87TFBarMtsTt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFBarMtsTt_To", GXutil.ltrimstr( AV87TFBarMtsTt_To, 10, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMaqTin") == 0 )
         {
            AV88TFBarMaqTin = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFBarMaqTin", AV88TFBarMaqTin);
            AV89TFBarMaqTin_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFBarMaqTin_Sel", AV89TFBarMaqTin_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarVolTin") == 0 )
         {
            AV90TFBarVolTin = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFBarVolTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90TFBarVolTin), 5, 0));
            AV91TFBarVolTin_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFBarVolTin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFBarVolTin_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNumEny") == 0 )
         {
            AV110TFBarNumEny = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFBarNumEny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110TFBarNumEny), 8, 0));
            AV111TFBarNumEny_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFBarNumEny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111TFBarNumEny_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarDispCli") == 0 )
         {
            AV92TFBarDispCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFBarDispCli", AV92TFBarDispCli);
            AV93TFBarDispCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFBarDispCli_Sel", AV93TFBarDispCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNumAna") == 0 )
         {
            AV94TFBarNumAna = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFBarNumAna", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TFBarNumAna), 3, 0));
            AV95TFBarNumAna_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFBarNumAna_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TFBarNumAna_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CosteInicial") == 0 )
         {
            AV122TFCosteInicial = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TFCosteInicial", GXutil.ltrimstr( AV122TFCosteInicial, 10, 2));
            AV123TFCosteInicial_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123TFCosteInicial_To", GXutil.ltrimstr( AV123TFCosteInicial_To, 10, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CosteAnyadidas") == 0 )
         {
            AV124TFCosteAnyadidas = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124TFCosteAnyadidas", GXutil.ltrimstr( AV124TFCosteAnyadidas, 10, 2));
            AV125TFCosteAnyadidas_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TFCosteAnyadidas_To", GXutil.ltrimstr( AV125TFCosteAnyadidas_To, 10, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1915C2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV103DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV103DetailWebComponent);
      AV43BarCod = (int)(GXutil.lval( GXutil.substring( A2316BarAgrLot, 1, 8))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43BarCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCOD"+"_"+sGXsfl_34_idx, getSecureSignedToken( sPrefix+sGXsfl_34_idx, localUtil.format( DecimalUtil.doubleToDec(AV43BarCod), "ZZZZZZZ9")));
      AV44BarCodReo = (byte)(GXutil.lval( GXutil.substring( A2316BarAgrLot, 9, 1))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreo_Internalname, GXutil.str( AV44BarCodReo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODREO"+"_"+sGXsfl_34_idx, getSecureSignedToken( sPrefix+sGXsfl_34_idx, localUtil.format( DecimalUtil.doubleToDec(AV44BarCodReo), "9")));
      AV45BarCodPar = GXutil.substring( A2316BarAgrLot, 10, 1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpar_Internalname, AV45BarCodPar);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARCODPAR"+"_"+sGXsfl_34_idx, getSecureSignedToken( sPrefix+sGXsfl_34_idx, GXutil.rtrim( localUtil.format( AV45BarCodPar, ""))));
      AV113Marca = ((A1933BarCodTin==AV43BarCod)&&(A1934BarReoTin==AV44BarCodReo)&&(GXutil.strcmp(A1935BarParTin, AV45BarCodPar)==0) ? "*" : " ") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMarca_Internalname, AV113Marca);
      AV41CosteKg = ((A8563BarKgsTt.doubleValue()>0) ? (A14199CosteInici.add(A14200CosteAnyad)).divide(A8563BarKgsTt, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostekg_Internalname, GXutil.ltrimstr( AV41CosteKg, 11, 5));
      AV42CosteMT = ((A1948BarMtrTin.doubleValue()>0) ? (A14199CosteInici.add(A14200CosteAnyad)).divide(A1948BarMtrTin, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostemt_Internalname, GXutil.ltrimstr( AV42CosteMT, 11, 5));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(34) ;
      }
      sendrow_342( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
      {
         httpContext.doAjaxLoad(34, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e1415C2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV48ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV50ColumnsSelector.fromJSonString(AV48ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ConsultadesdeLcontiColumnsSelector", ((GXutil.strcmp("", AV48ColumnsSelectorXML)==0) ? "" : AV50ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV50ColumnsSelector", AV50ColumnsSelector);
   }

   public void e1515C2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV46ExcelFilename ;
      GXv_char3[0] = AV47ErrorMessage ;
      new app.formulaciontinte.consultadesdelcontiexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      consultadesdelconti_impl.this.AV46ExcelFilename = GXv_char4[0] ;
      consultadesdelconti_impl.this.AV47ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV46ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV46ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV47ErrorMessage);
      }
   }

   public void e1615C2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.formulaciontinte.consultadesdelcontiexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV34OrderedBy, 4, 0))+":"+(AV35OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV50ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EstFecCier", "", "Fecha", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EstTinNr", "", "#", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Marca", "", "M", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarCodTin", "", "Nº Hdr", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarReoTin", "", "R", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarParTin", "", "P", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarAgrLot", "", "Lote", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", false, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre Cliente", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarSerTin", "", "Articulo", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarDscTin", "", "Descripcion", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarArtTin", "", "Tip. Art.", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarArtTinD", "", "Descripcion", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarColNoT", "", "Color", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarColNuT", "", "Numero", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarTipCoT", "", "Tc", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarKgmTin", "", "Kgs", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarKgsTt", "", "Kgs Tot", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarMtrTin", "", "Mts", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarNumtint", "", "#", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarMtsTt", "", "Mts Tot", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarMaqTin", "", "Maquina", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarVolTin", "", "Volumen", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarNumEny", "", "Nº Ensayo", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarDispCli", "", "Disp Cli", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarNumAna", "", "Nº Adi", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CosteInicial", "Coste", "Inicial", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CosteAnyadidas", "Coste", "Añadidas", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&CosteKg", "Coste", "Kg", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&CosteMT", "Coste", "Mt", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV49UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ConsultadesdeLcontiColumnsSelector", GXv_char4) ;
      consultadesdelconti_impl.this.GXt_char1 = GXv_char4[0] ;
      AV49UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV49UserCustomValue)==0) ) )
      {
         AV51ColumnsSelectorAux.fromxml(AV49UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV51ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV50ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV51ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV50ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV52Session.getValue(AV138Pgmname+"GridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV138Pgmname+"GridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV52Session.getValue(AV138Pgmname+"GridState"), null, null);
      }
      AV34OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
      AV35OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35OrderedDsc", AV35OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV195GXV1 = 1 ;
      while ( AV195GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV195GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTFECCIER") == 0 )
         {
            AV56TFEstFecCier = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFEstFecCier", localUtil.format(AV56TFEstFecCier, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTTINNR") == 0 )
         {
            AV60TFEstTinNr = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFEstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFEstTinNr), 4, 0));
            AV61TFEstTinNr_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFEstTinNr_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFEstTinNr_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODTIN") == 0 )
         {
            AV130TFBarCodTin = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV130TFBarCodTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130TFBarCodTin), 8, 0));
            AV131TFBarCodTin_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV131TFBarCodTin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV131TFBarCodTin_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARREOTIN") == 0 )
         {
            AV132TFBarReoTin = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV132TFBarReoTin", GXutil.str( AV132TFBarReoTin, 1, 0));
            AV133TFBarReoTin_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV133TFBarReoTin_To", GXutil.str( AV133TFBarReoTin_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPARTIN") == 0 )
         {
            AV134TFBarParTin = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134TFBarParTin", AV134TFBarParTin);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPARTIN_SEL") == 0 )
         {
            AV135TFBarParTin_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV135TFBarParTin_Sel", AV135TFBarParTin_Sel);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRLOT") == 0 )
         {
            AV64TFBarAgrLot = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFBarAgrLot", AV64TFBarAgrLot);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRLOT_SEL") == 0 )
         {
            AV65TFBarAgrLot_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarAgrLot_Sel", AV65TFBarAgrLot_Sel);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV66TFCliCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFCliCod), 6, 0));
            AV67TFCliCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV68TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFCliNom", AV68TFCliNom);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV69TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFCliNom_Sel", AV69TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERTIN") == 0 )
         {
            AV70TFBarSerTin = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFBarSerTin", AV70TFBarSerTin);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERTIN_SEL") == 0 )
         {
            AV71TFBarSerTin_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFBarSerTin_Sel", AV71TFBarSerTin_Sel);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDSCTIN") == 0 )
         {
            AV72TFBarDscTin = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFBarDscTin", AV72TFBarDscTin);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDSCTIN_SEL") == 0 )
         {
            AV73TFBarDscTin_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFBarDscTin_Sel", AV73TFBarDscTin_Sel);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARARTTIN") == 0 )
         {
            AV106TFBarArtTin = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV106TFBarArtTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106TFBarArtTin), 4, 0));
            AV107TFBarArtTin_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV107TFBarArtTin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107TFBarArtTin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARARTTIND") == 0 )
         {
            AV108TFBarArtTinD = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV108TFBarArtTinD", AV108TFBarArtTinD);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARARTTIND_SEL") == 0 )
         {
            AV109TFBarArtTinD_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109TFBarArtTinD_Sel", AV109TFBarArtTinD_Sel);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOT") == 0 )
         {
            AV74TFBarColNoT = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFBarColNoT", AV74TFBarColNoT);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOT_SEL") == 0 )
         {
            AV75TFBarColNoT_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFBarColNoT_Sel", AV75TFBarColNoT_Sel);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUT") == 0 )
         {
            AV76TFBarColNuT = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFBarColNuT", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFBarColNuT), 6, 0));
            AV77TFBarColNuT_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFBarColNuT_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFBarColNuT_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOT") == 0 )
         {
            AV78TFBarTipCoT = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TFBarTipCoT", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFBarTipCoT), 2, 0));
            AV79TFBarTipCoT_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TFBarTipCoT_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFBarTipCoT_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGMTIN") == 0 )
         {
            AV80TFBarKgmTin = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TFBarKgmTin", GXutil.ltrimstr( AV80TFBarKgmTin, 9, 2));
            AV81TFBarKgmTin_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TFBarKgmTin_To", GXutil.ltrimstr( AV81TFBarKgmTin_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGSTT") == 0 )
         {
            AV82TFBarKgsTt = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TFBarKgsTt", GXutil.ltrimstr( AV82TFBarKgsTt, 10, 2));
            AV83TFBarKgsTt_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TFBarKgsTt_To", GXutil.ltrimstr( AV83TFBarKgsTt_To, 10, 2));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTRTIN") == 0 )
         {
            AV84TFBarMtrTin = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TFBarMtrTin", GXutil.ltrimstr( AV84TFBarMtrTin, 9, 2));
            AV85TFBarMtrTin_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85TFBarMtrTin_To", GXutil.ltrimstr( AV85TFBarMtrTin_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMTINT") == 0 )
         {
            AV114TFBarNumtint = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFBarNumtint", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TFBarNumtint), 4, 0));
            AV115TFBarNumtint_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115TFBarNumtint_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV115TFBarNumtint_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTSTT") == 0 )
         {
            AV86TFBarMtsTt = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86TFBarMtsTt", GXutil.ltrimstr( AV86TFBarMtsTt, 10, 2));
            AV87TFBarMtsTt_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TFBarMtsTt_To", GXutil.ltrimstr( AV87TFBarMtsTt_To, 10, 2));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQTIN") == 0 )
         {
            AV88TFBarMaqTin = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88TFBarMaqTin", AV88TFBarMaqTin);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQTIN_SEL") == 0 )
         {
            AV89TFBarMaqTin_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TFBarMaqTin_Sel", AV89TFBarMaqTin_Sel);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARVOLTIN") == 0 )
         {
            AV90TFBarVolTin = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90TFBarVolTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90TFBarVolTin), 5, 0));
            AV91TFBarVolTin_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91TFBarVolTin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFBarVolTin_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMENY") == 0 )
         {
            AV110TFBarNumEny = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV110TFBarNumEny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110TFBarNumEny), 8, 0));
            AV111TFBarNumEny_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV111TFBarNumEny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111TFBarNumEny_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISPCLI") == 0 )
         {
            AV92TFBarDispCli = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92TFBarDispCli", AV92TFBarDispCli);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISPCLI_SEL") == 0 )
         {
            AV93TFBarDispCli_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TFBarDispCli_Sel", AV93TFBarDispCli_Sel);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMANA") == 0 )
         {
            AV94TFBarNumAna = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TFBarNumAna", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TFBarNumAna), 3, 0));
            AV95TFBarNumAna_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV95TFBarNumAna_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TFBarNumAna_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOSTEINICIAL") == 0 )
         {
            AV122TFCosteInicial = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV122TFCosteInicial", GXutil.ltrimstr( AV122TFCosteInicial, 10, 2));
            AV123TFCosteInicial_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123TFCosteInicial_To", GXutil.ltrimstr( AV123TFCosteInicial_To, 10, 2));
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOSTEANYADIDAS") == 0 )
         {
            AV124TFCosteAnyadidas = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124TFCosteAnyadidas", GXutil.ltrimstr( AV124TFCosteAnyadidas, 10, 2));
            AV125TFCosteAnyadidas_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV125TFCosteAnyadidas_To", GXutil.ltrimstr( AV125TFCosteAnyadidas_To, 10, 2));
         }
         AV195GXV1 = (int)(AV195GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV135TFBarParTin_Sel)==0), AV135TFBarParTin_Sel, GXv_char4) ;
      consultadesdelconti_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFBarAgrLot_Sel)==0), AV65TFBarAgrLot_Sel, GXv_char3) ;
      consultadesdelconti_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char11 = "" ;
      GXv_char2[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFCliNom_Sel)==0), AV69TFCliNom_Sel, GXv_char2) ;
      consultadesdelconti_impl.this.GXt_char11 = GXv_char2[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFBarSerTin_Sel)==0), AV71TFBarSerTin_Sel, GXv_char13) ;
      consultadesdelconti_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFBarDscTin_Sel)==0), AV73TFBarDscTin_Sel, GXv_char15) ;
      consultadesdelconti_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV109TFBarArtTinD_Sel)==0), AV109TFBarArtTinD_Sel, GXv_char17) ;
      consultadesdelconti_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFBarColNoT_Sel)==0), AV75TFBarColNoT_Sel, GXv_char19) ;
      consultadesdelconti_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV89TFBarMaqTin_Sel)==0), AV89TFBarMaqTin_Sel, GXv_char21) ;
      consultadesdelconti_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV93TFBarDispCli_Sel)==0), AV93TFBarDispCli_Sel, GXv_char23) ;
      consultadesdelconti_impl.this.GXt_char22 = GXv_char23[0] ;
      Ddo_grid_Selectedvalue_set = "|||||"+GXt_char1+"|"+GXt_char10+"||"+GXt_char11+"|"+GXt_char12+"|"+GXt_char14+"||"+GXt_char16+"|"+GXt_char18+"||||||||"+GXt_char20+"|||"+GXt_char22+"|||||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV134TFBarParTin)==0), AV134TFBarParTin, GXv_char23) ;
      consultadesdelconti_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFBarAgrLot)==0), AV64TFBarAgrLot, GXv_char21) ;
      consultadesdelconti_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFCliNom)==0), AV68TFCliNom, GXv_char19) ;
      consultadesdelconti_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFBarSerTin)==0), AV70TFBarSerTin, GXv_char17) ;
      consultadesdelconti_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFBarDscTin)==0), AV72TFBarDscTin, GXv_char15) ;
      consultadesdelconti_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV108TFBarArtTinD)==0), AV108TFBarArtTinD, GXv_char13) ;
      consultadesdelconti_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFBarColNoT)==0), AV74TFBarColNoT, GXv_char4) ;
      consultadesdelconti_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV88TFBarMaqTin)==0), AV88TFBarMaqTin, GXv_char3) ;
      consultadesdelconti_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV92TFBarDispCli)==0), AV92TFBarDispCli, GXv_char2) ;
      consultadesdelconti_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFEstFecCier)) ? "" : localUtil.dtoc( AV56TFEstFecCier, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV60TFEstTinNr) ? "" : GXutil.str( AV60TFEstTinNr, 4, 0))+"||"+((0==AV130TFBarCodTin) ? "" : GXutil.str( AV130TFBarCodTin, 8, 0))+"|"+((0==AV132TFBarReoTin) ? "" : GXutil.str( AV132TFBarReoTin, 1, 0))+"|"+GXt_char22+"|"+GXt_char20+"|"+((0==AV66TFCliCod) ? "" : GXutil.str( AV66TFCliCod, 6, 0))+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+((0==AV106TFBarArtTin) ? "" : GXutil.str( AV106TFBarArtTin, 4, 0))+"|"+GXt_char12+"|"+GXt_char11+"|"+((0==AV76TFBarColNuT) ? "" : GXutil.str( AV76TFBarColNuT, 6, 0))+"|"+((0==AV78TFBarTipCoT) ? "" : GXutil.str( AV78TFBarTipCoT, 2, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV80TFBarKgmTin)==0) ? "" : GXutil.str( AV80TFBarKgmTin, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV82TFBarKgsTt)==0) ? "" : GXutil.str( AV82TFBarKgsTt, 10, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV84TFBarMtrTin)==0) ? "" : GXutil.str( AV84TFBarMtrTin, 9, 2))+"|"+((0==AV114TFBarNumtint) ? "" : GXutil.str( AV114TFBarNumtint, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV86TFBarMtsTt)==0) ? "" : GXutil.str( AV86TFBarMtsTt, 10, 2))+"|"+GXt_char10+"|"+((0==AV90TFBarVolTin) ? "" : GXutil.str( AV90TFBarVolTin, 5, 0))+"|"+((0==AV110TFBarNumEny) ? "" : GXutil.str( AV110TFBarNumEny, 8, 0))+"|"+GXt_char1+"|"+((0==AV94TFBarNumAna) ? "" : GXutil.str( AV94TFBarNumAna, 3, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV122TFCosteInicial)==0) ? "" : GXutil.str( AV122TFCosteInicial, 10, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV124TFCosteAnyadidas)==0) ? "" : GXutil.str( AV124TFCosteAnyadidas, 10, 2))+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV61TFEstTinNr_To) ? "" : GXutil.str( AV61TFEstTinNr_To, 4, 0))+"||"+((0==AV131TFBarCodTin_To) ? "" : GXutil.str( AV131TFBarCodTin_To, 8, 0))+"|"+((0==AV133TFBarReoTin_To) ? "" : GXutil.str( AV133TFBarReoTin_To, 1, 0))+"|||"+((0==AV67TFCliCod_To) ? "" : GXutil.str( AV67TFCliCod_To, 6, 0))+"||||"+((0==AV107TFBarArtTin_To) ? "" : GXutil.str( AV107TFBarArtTin_To, 4, 0))+"|||"+((0==AV77TFBarColNuT_To) ? "" : GXutil.str( AV77TFBarColNuT_To, 6, 0))+"|"+((0==AV79TFBarTipCoT_To) ? "" : GXutil.str( AV79TFBarTipCoT_To, 2, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV81TFBarKgmTin_To)==0) ? "" : GXutil.str( AV81TFBarKgmTin_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV83TFBarKgsTt_To)==0) ? "" : GXutil.str( AV83TFBarKgsTt_To, 10, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV85TFBarMtrTin_To)==0) ? "" : GXutil.str( AV85TFBarMtrTin_To, 9, 2))+"|"+((0==AV115TFBarNumtint_To) ? "" : GXutil.str( AV115TFBarNumtint_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV87TFBarMtsTt_To)==0) ? "" : GXutil.str( AV87TFBarMtsTt_To, 10, 2))+"||"+((0==AV91TFBarVolTin_To) ? "" : GXutil.str( AV91TFBarVolTin_To, 5, 0))+"|"+((0==AV111TFBarNumEny_To) ? "" : GXutil.str( AV111TFBarNumEny_To, 8, 0))+"||"+((0==AV95TFBarNumAna_To) ? "" : GXutil.str( AV95TFBarNumAna_To, 3, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV123TFCosteInicial_To)==0) ? "" : GXutil.str( AV123TFCosteInicial_To, 10, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV125TFCosteAnyadidas_To)==0) ? "" : GXutil.str( AV125TFCosteAnyadidas_To, 10, 2))+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV32GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV32GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV32GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV32GridState.fromxml(AV52Session.getValue(AV138Pgmname+"GridState"), null, null);
      AV32GridState.setgxTv_SdtWWPGridState_Orderedby( AV34OrderedBy );
      AV32GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV35OrderedDsc );
      AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFESTFECCIER", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFEstFecCier)), (short)(0), GXutil.trim( localUtil.dtoc( AV56TFEstFecCier, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFESTTINNR", "", !((0==AV60TFEstTinNr)&&(0==AV61TFEstTinNr_To)), (short)(0), GXutil.trim( GXutil.str( AV60TFEstTinNr, 4, 0)), GXutil.trim( GXutil.str( AV61TFEstTinNr_To, 4, 0))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCODTIN", "", !((0==AV130TFBarCodTin)&&(0==AV131TFBarCodTin_To)), (short)(0), GXutil.trim( GXutil.str( AV130TFBarCodTin, 8, 0)), GXutil.trim( GXutil.str( AV131TFBarCodTin_To, 8, 0))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARREOTIN", "", !((0==AV132TFBarReoTin)&&(0==AV133TFBarReoTin_To)), (short)(0), GXutil.trim( GXutil.str( AV132TFBarReoTin, 1, 0)), GXutil.trim( GXutil.str( AV133TFBarReoTin_To, 1, 0))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARPARTIN", "", !(GXutil.strcmp("", AV134TFBarParTin)==0), (short)(0), AV134TFBarParTin, "", !(GXutil.strcmp("", AV135TFBarParTin_Sel)==0), AV135TFBarParTin_Sel, "") ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARAGRLOT", "", !(GXutil.strcmp("", AV64TFBarAgrLot)==0), (short)(0), AV64TFBarAgrLot, "", !(GXutil.strcmp("", AV65TFBarAgrLot_Sel)==0), AV65TFBarAgrLot_Sel, "") ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLICOD", "", !((0==AV66TFCliCod)&&(0==AV67TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV66TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV67TFCliCod_To, 6, 0))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLINOM", "", !(GXutil.strcmp("", AV68TFCliNom)==0), (short)(0), AV68TFCliNom, "", !(GXutil.strcmp("", AV69TFCliNom_Sel)==0), AV69TFCliNom_Sel, "") ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARSERTIN", "", !(GXutil.strcmp("", AV70TFBarSerTin)==0), (short)(0), AV70TFBarSerTin, "", !(GXutil.strcmp("", AV71TFBarSerTin_Sel)==0), AV71TFBarSerTin_Sel, "") ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARDSCTIN", "", !(GXutil.strcmp("", AV72TFBarDscTin)==0), (short)(0), AV72TFBarDscTin, "", !(GXutil.strcmp("", AV73TFBarDscTin_Sel)==0), AV73TFBarDscTin_Sel, "") ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARARTTIN", "", !((0==AV106TFBarArtTin)&&(0==AV107TFBarArtTin_To)), (short)(0), GXutil.trim( GXutil.str( AV106TFBarArtTin, 4, 0)), GXutil.trim( GXutil.str( AV107TFBarArtTin_To, 4, 0))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARARTTIND", "", !(GXutil.strcmp("", AV108TFBarArtTinD)==0), (short)(0), AV108TFBarArtTinD, "", !(GXutil.strcmp("", AV109TFBarArtTinD_Sel)==0), AV109TFBarArtTinD_Sel, "") ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCOLNOT", "", !(GXutil.strcmp("", AV74TFBarColNoT)==0), (short)(0), AV74TFBarColNoT, "", !(GXutil.strcmp("", AV75TFBarColNoT_Sel)==0), AV75TFBarColNoT_Sel, "") ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCOLNUT", "", !((0==AV76TFBarColNuT)&&(0==AV77TFBarColNuT_To)), (short)(0), GXutil.trim( GXutil.str( AV76TFBarColNuT, 6, 0)), GXutil.trim( GXutil.str( AV77TFBarColNuT_To, 6, 0))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARTIPCOT", "", !((0==AV78TFBarTipCoT)&&(0==AV79TFBarTipCoT_To)), (short)(0), GXutil.trim( GXutil.str( AV78TFBarTipCoT, 2, 0)), GXutil.trim( GXutil.str( AV79TFBarTipCoT_To, 2, 0))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARKGMTIN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV80TFBarKgmTin)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV81TFBarKgmTin_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV80TFBarKgmTin, 9, 2)), GXutil.trim( GXutil.str( AV81TFBarKgmTin_To, 9, 2))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARKGSTT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV82TFBarKgsTt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV83TFBarKgsTt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV82TFBarKgsTt, 10, 2)), GXutil.trim( GXutil.str( AV83TFBarKgsTt_To, 10, 2))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARMTRTIN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV84TFBarMtrTin)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV85TFBarMtrTin_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV84TFBarMtrTin, 9, 2)), GXutil.trim( GXutil.str( AV85TFBarMtrTin_To, 9, 2))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARNUMTINT", "", !((0==AV114TFBarNumtint)&&(0==AV115TFBarNumtint_To)), (short)(0), GXutil.trim( GXutil.str( AV114TFBarNumtint, 4, 0)), GXutil.trim( GXutil.str( AV115TFBarNumtint_To, 4, 0))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARMTSTT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV86TFBarMtsTt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV87TFBarMtsTt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV86TFBarMtsTt, 10, 2)), GXutil.trim( GXutil.str( AV87TFBarMtsTt_To, 10, 2))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARMAQTIN", "", !(GXutil.strcmp("", AV88TFBarMaqTin)==0), (short)(0), AV88TFBarMaqTin, "", !(GXutil.strcmp("", AV89TFBarMaqTin_Sel)==0), AV89TFBarMaqTin_Sel, "") ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARVOLTIN", "", !((0==AV90TFBarVolTin)&&(0==AV91TFBarVolTin_To)), (short)(0), GXutil.trim( GXutil.str( AV90TFBarVolTin, 5, 0)), GXutil.trim( GXutil.str( AV91TFBarVolTin_To, 5, 0))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARNUMENY", "", !((0==AV110TFBarNumEny)&&(0==AV111TFBarNumEny_To)), (short)(0), GXutil.trim( GXutil.str( AV110TFBarNumEny, 8, 0)), GXutil.trim( GXutil.str( AV111TFBarNumEny_To, 8, 0))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARDISPCLI", "", !(GXutil.strcmp("", AV92TFBarDispCli)==0), (short)(0), AV92TFBarDispCli, "", !(GXutil.strcmp("", AV93TFBarDispCli_Sel)==0), AV93TFBarDispCli_Sel, "") ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARNUMANA", "", !((0==AV94TFBarNumAna)&&(0==AV95TFBarNumAna_To)), (short)(0), GXutil.trim( GXutil.str( AV94TFBarNumAna, 3, 0)), GXutil.trim( GXutil.str( AV95TFBarNumAna_To, 3, 0))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCOSTEINICIAL", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV122TFCosteInicial)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV123TFCosteInicial_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV122TFCosteInicial, 10, 2)), GXutil.trim( GXutil.str( AV123TFCosteInicial_To, 10, 2))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV32GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCOSTEANYADIDAS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV124TFCosteAnyadidas)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV125TFCosteAnyadidas_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV124TFCosteAnyadidas, 10, 2)), GXutil.trim( GXutil.str( AV125TFCosteAnyadidas_To, 10, 2))) ;
      AV32GridState = GXv_SdtWWPGridState24[0] ;
      if ( ! (GXutil.strcmp("", AV7Emprcod)==0) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7Emprcod );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8Fec1)) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FEC1" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV8Fec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV9Fec3)) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FEC3" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV9Fec3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (0==AV10PCliCod) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PCLICOD" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV10PCliCod, 6, 0) );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (0==AV11CliCodP) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICODP" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV11CliCodP, 6, 0) );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (0==AV12PBarCod) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PBARCOD" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV12PBarCod, 8, 0) );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (0==AV13Barcodp) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODP" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV13Barcodp, 8, 0) );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (0==AV14PBarCodReo) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PBARCODREO" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV14PBarCodReo, 1, 0) );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (0==AV15BarCodReoP) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREOP" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV15BarCodReoP, 1, 0) );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV16PBarCodPar)==0) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PBARCODPAR" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV16PBarCodPar );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV17BarCodParP)==0) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPARP" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV17BarCodParP );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV18PSerie)==0) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PSERIE" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV18PSerie );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV19SerieP)==0) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SERIEP" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV19SerieP );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV20PColor)==0) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PCOLOR" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV20PColor );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV21ColorP)==0) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&COLORP" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV21ColorP );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (0==AV22PColNum) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PCOLNUM" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV22PColNum, 6, 0) );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (0==AV23ColNumP) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&COLNUMP" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV23ColNumP, 6, 0) );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV24DispCli1)==0) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DISPCLI1" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV24DispCli1 );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV25DispCli3)==0) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DISPCLI3" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV25DispCli3 );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV26HreRacab)==0) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HRERACAB" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV26HreRacab );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV27MaqCodi)==0) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCODI" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV27MaqCodi );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV28MaqCod3)==0) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD3" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV28MaqCod3 );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (0==AV118TipArtCodfrom) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPARTCODFROM" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV118TipArtCodfrom, 4, 0) );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (0==AV119TipArtCodto) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPARTCODTO" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV119TipArtCodto, 4, 0) );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV120SoloAd)==0) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SOLOAD" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV120SoloAd );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV121CorAdi)==0) )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CORADI" );
         AV33GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV121CorAdi );
         AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV33GridStateFilterValue, 0);
      }
      AV32GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV32GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV138Pgmname+"GridState", AV32GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV30TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV30TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV138Pgmname );
      AV30TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV30TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV29HTTPRequest.getScriptName()+"?"+AV29HTTPRequest.getQuerystring() );
      AV30TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LCONTI" );
      AV52Session.setValue("TrnContext", AV30TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S162( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV100TotBarKgmTin = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100TotBarKgmTin", GXutil.ltrimstr( AV100TotBarKgmTin, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGMTIN", getSecureSignedToken( sPrefix, localUtil.format( AV100TotBarKgmTin, "ZZZZZ9.99")));
      AV101TotBarMtrTin = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TotBarMtrTin", GXutil.ltrimstr( AV101TotBarMtrTin, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTRTIN", getSecureSignedToken( sPrefix, localUtil.format( AV101TotBarMtrTin, "ZZZZZ9.99")));
      AV116TotBarNumtint = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116TotBarNumtint", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116TotBarNumtint), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARNUMTINT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV116TotBarNumtint), "ZZZ9")));
      AV126TotCosteInicial = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126TotCosteInicial", GXutil.ltrimstr( AV126TotCosteInicial, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCOSTEINICIAL", getSecureSignedToken( sPrefix, localUtil.format( AV126TotCosteInicial, "ZZZZZZ9.99")));
      AV128TotCosteAnyadidas = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128TotCosteAnyadidas", GXutil.ltrimstr( AV128TotCosteAnyadidas, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCOSTEANYADIDAS", getSecureSignedToken( sPrefix, localUtil.format( AV128TotCosteAnyadidas, "ZZZZZZ9.99")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV56TFEstFecCier ;
      AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV60TFEstTinNr ;
      AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV61TFEstTinNr_To ;
      AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV130TFBarCodTin ;
      AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV131TFBarCodTin_To ;
      AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV132TFBarReoTin ;
      AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV133TFBarReoTin_To ;
      AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV134TFBarParTin ;
      AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV135TFBarParTin_Sel ;
      AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV64TFBarAgrLot ;
      AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV65TFBarAgrLot_Sel ;
      AV153Formulaciontinte_consultadesdelcontids_12_tfclicod = AV66TFCliCod ;
      AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV67TFCliCod_To ;
      AV155Formulaciontinte_consultadesdelcontids_14_tfclinom = AV68TFCliNom ;
      AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV69TFCliNom_Sel ;
      AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV70TFBarSerTin ;
      AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV71TFBarSerTin_Sel ;
      AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV72TFBarDscTin ;
      AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV73TFBarDscTin_Sel ;
      AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV106TFBarArtTin ;
      AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV107TFBarArtTin_To ;
      AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV108TFBarArtTinD ;
      AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV109TFBarArtTinD_Sel ;
      AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV74TFBarColNoT ;
      AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV75TFBarColNoT_Sel ;
      AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV76TFBarColNuT ;
      AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV77TFBarColNuT_To ;
      AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV78TFBarTipCoT ;
      AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV79TFBarTipCoT_To ;
      AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV80TFBarKgmTin ;
      AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV81TFBarKgmTin_To ;
      AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV82TFBarKgsTt ;
      AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV83TFBarKgsTt_To ;
      AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV84TFBarMtrTin ;
      AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV85TFBarMtrTin_To ;
      AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV114TFBarNumtint ;
      AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV115TFBarNumtint_To ;
      AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV86TFBarMtsTt ;
      AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV87TFBarMtsTt_To ;
      AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV88TFBarMaqTin ;
      AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV89TFBarMaqTin_Sel ;
      AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV90TFBarVolTin ;
      AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV91TFBarVolTin_To ;
      AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV110TFBarNumEny ;
      AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV111TFBarNumEny_To ;
      AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV92TFBarDispCli ;
      AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV93TFBarDispCli_Sel ;
      AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV94TFBarNumAna ;
      AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV95TFBarNumAna_To ;
      AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV122TFCosteInicial ;
      AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV123TFCosteInicial_To ;
      AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV124TFCosteAnyadidas ;
      AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV125TFCosteAnyadidas_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                           Short.valueOf(AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr) ,
                                           Short.valueOf(AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) ,
                                           Integer.valueOf(AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) ,
                                           Integer.valueOf(AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) ,
                                           Byte.valueOf(AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin) ,
                                           Byte.valueOf(AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) ,
                                           AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                           AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                           AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                           AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                           Integer.valueOf(AV153Formulaciontinte_consultadesdelcontids_12_tfclicod) ,
                                           Integer.valueOf(AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to) ,
                                           AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                           AV155Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                           AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                           AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                           AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                           AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                           Short.valueOf(AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin) ,
                                           Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) ,
                                           AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                           AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                           Integer.valueOf(AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) ,
                                           Integer.valueOf(AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) ,
                                           Byte.valueOf(AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot) ,
                                           Byte.valueOf(AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) ,
                                           AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                           AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                           AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                           AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                           AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                           AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                           Short.valueOf(AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) ,
                                           Short.valueOf(AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) ,
                                           AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                           AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                           AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                           AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                           Integer.valueOf(AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) ,
                                           Integer.valueOf(AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) ,
                                           AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                           AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                           Short.valueOf(AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana) ,
                                           Short.valueOf(AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) ,
                                           AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                           AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                           AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                           AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                           Byte.valueOf(AV15BarCodReoP) ,
                                           A13759EstFecCier ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           Short.valueOf(A1939BarArtTin) ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           A3654BarCosPD ,
                                           A3658BarCosPA ,
                                           A3705BarCosCol ,
                                           A3656BarCosAD ,
                                           A3657BarCosAA ,
                                           A3706BarCosAnc ,
                                           AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                           AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                           A13962BarArtTinD ,
                                           Integer.valueOf(AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny) ,
                                           Integer.valueOf(A13967BarNumEny) ,
                                           Integer.valueOf(AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to) ,
                                           AV8Fec1 ,
                                           AV9Fec3 ,
                                           Integer.valueOf(AV10PCliCod) ,
                                           Integer.valueOf(AV11CliCodP) ,
                                           Integer.valueOf(AV12PBarCod) ,
                                           Integer.valueOf(AV13Barcodp) ,
                                           Byte.valueOf(AV14PBarCodReo) ,
                                           AV16PBarCodPar ,
                                           AV17BarCodParP ,
                                           AV18PSerie ,
                                           AV19SerieP ,
                                           AV20PColor ,
                                           AV21ColorP ,
                                           Integer.valueOf(AV22PColNum) ,
                                           Integer.valueOf(AV23ColNumP) ,
                                           AV24DispCli1 ,
                                           AV25DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV26HreRacab ,
                                           AV27MaqCodi ,
                                           AV28MaqCod3 ,
                                           Short.valueOf(AV118TipArtCodfrom) ,
                                           Short.valueOf(AV119TipArtCodto) ,
                                           AV120SoloAd ,
                                           AV121CorAdi ,
                                           A14200CosteAnyad ,
                                           AV7Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV163Formulaciontinte_consultadesdelcontids_22_tfbararttind = GXutil.padr( GXutil.rtrim( AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind), 30, "%") ;
      lV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin = GXutil.padr( GXutil.rtrim( AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin), 1, "%") ;
      lV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = GXutil.padr( GXutil.rtrim( AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot), 10, "%") ;
      lV155Formulaciontinte_consultadesdelcontids_14_tfclinom = GXutil.padr( GXutil.rtrim( AV155Formulaciontinte_consultadesdelcontids_14_tfclinom), 30, "%") ;
      lV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin = GXutil.padr( GXutil.rtrim( AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin), 16, "%") ;
      lV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin = GXutil.padr( GXutil.rtrim( AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin), 26, "%") ;
      lV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = GXutil.padr( GXutil.rtrim( AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot), 13, "%") ;
      lV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = GXutil.padr( GXutil.rtrim( AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin), 6, "%") ;
      lV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli = GXutil.padr( GXutil.rtrim( AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli), 20, "%") ;
      /* Using cursor H015C4 */
      pr_default.execute(2, new Object[] {AV7Emprcod, AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind, lV163Formulaciontinte_consultadesdelcontids_22_tfbararttind, AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, Integer.valueOf(AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), Integer.valueOf(AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), AV8Fec1, AV9Fec3, Integer.valueOf(AV10PCliCod), Integer.valueOf(AV11CliCodP), Integer.valueOf(AV12PBarCod), Integer.valueOf(AV13Barcodp), Byte.valueOf(AV14PBarCodReo), AV16PBarCodPar, AV17BarCodParP, AV18PSerie, AV19SerieP, AV20PColor, AV21ColorP, Integer.valueOf(AV22PColNum), Integer.valueOf(AV23ColNumP), AV24DispCli1, AV25DispCli3, AV26HreRacab, AV26HreRacab, AV27MaqCodi, AV28MaqCod3, Short.valueOf(AV118TipArtCodfrom), Short.valueOf(AV119TipArtCodto), AV120SoloAd, AV120SoloAd, AV121CorAdi, AV120SoloAd, AV121CorAdi, AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier, Short.valueOf(AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr), Short.valueOf(AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to), Integer.valueOf(AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin), Integer.valueOf(AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to), Byte.valueOf(AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin), Byte.valueOf(AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to), lV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin, AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel, lV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot, AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel, Integer.valueOf(AV153Formulaciontinte_consultadesdelcontids_12_tfclicod), Integer.valueOf(AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to), lV155Formulaciontinte_consultadesdelcontids_14_tfclinom, AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel, lV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin, AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel, lV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin, AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel, Short.valueOf(AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin), Short.valueOf(AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to), lV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot, AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel, Integer.valueOf(AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut), Integer.valueOf(AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to), Byte.valueOf(AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot), Byte.valueOf(AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to), AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin, AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to, AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt, AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to, AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin, AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to, Short.valueOf(AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint), Short.valueOf(AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to), AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt, AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to, lV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin, AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel, Integer.valueOf(AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin), Integer.valueOf(AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to), lV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli, AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel, Short.valueOf(AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana), Short.valueOf(AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to), AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial, AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to, AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas, AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to, Byte.valueOf(AV15BarCodReoP)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A6634BarRecAcb = H015C4_A6634BarRecAcb[0] ;
         n6634BarRecAcb = H015C4_n6634BarRecAcb[0] ;
         A396EmprCod = H015C4_A396EmprCod[0] ;
         A14200CosteAnyad = H015C4_A14200CosteAnyad[0] ;
         A3650BarNumAna = H015C4_A3650BarNumAna[0] ;
         n3650BarNumAna = H015C4_n3650BarNumAna[0] ;
         A11762BarDispCli = H015C4_A11762BarDispCli[0] ;
         n11762BarDispCli = H015C4_n11762BarDispCli[0] ;
         A1946BarVolTin = H015C4_A1946BarVolTin[0] ;
         n1946BarVolTin = H015C4_n1946BarVolTin[0] ;
         A1945BarMaqTin = H015C4_A1945BarMaqTin[0] ;
         n1945BarMaqTin = H015C4_n1945BarMaqTin[0] ;
         A12993BarMtsTt = H015C4_A12993BarMtsTt[0] ;
         n12993BarMtsTt = H015C4_n12993BarMtsTt[0] ;
         A1948BarMtrTin = H015C4_A1948BarMtrTin[0] ;
         n1948BarMtrTin = H015C4_n1948BarMtrTin[0] ;
         A8563BarKgsTt = H015C4_A8563BarKgsTt[0] ;
         n8563BarKgsTt = H015C4_n8563BarKgsTt[0] ;
         A1947BarKgmTin = H015C4_A1947BarKgmTin[0] ;
         n1947BarKgmTin = H015C4_n1947BarKgmTin[0] ;
         A1942BarTipCoT = H015C4_A1942BarTipCoT[0] ;
         n1942BarTipCoT = H015C4_n1942BarTipCoT[0] ;
         A1941BarColNuT = H015C4_A1941BarColNuT[0] ;
         n1941BarColNuT = H015C4_n1941BarColNuT[0] ;
         A1940BarColNoT = H015C4_A1940BarColNoT[0] ;
         n1940BarColNoT = H015C4_n1940BarColNoT[0] ;
         A1939BarArtTin = H015C4_A1939BarArtTin[0] ;
         n1939BarArtTin = H015C4_n1939BarArtTin[0] ;
         A1937BarDscTin = H015C4_A1937BarDscTin[0] ;
         n1937BarDscTin = H015C4_n1937BarDscTin[0] ;
         A1936BarSerTin = H015C4_A1936BarSerTin[0] ;
         n1936BarSerTin = H015C4_n1936BarSerTin[0] ;
         A279CliNom = H015C4_A279CliNom[0] ;
         A252CliCod = H015C4_A252CliCod[0] ;
         A1929EstTinNr = H015C4_A1929EstTinNr[0] ;
         A13759EstFecCier = H015C4_A13759EstFecCier[0] ;
         A3656BarCosAD = H015C4_A3656BarCosAD[0] ;
         n3656BarCosAD = H015C4_n3656BarCosAD[0] ;
         A3657BarCosAA = H015C4_A3657BarCosAA[0] ;
         n3657BarCosAA = H015C4_n3657BarCosAA[0] ;
         A3706BarCosAnc = H015C4_A3706BarCosAnc[0] ;
         n3706BarCosAnc = H015C4_n3706BarCosAnc[0] ;
         A13967BarNumEny = H015C4_A13967BarNumEny[0] ;
         n13967BarNumEny = H015C4_n13967BarNumEny[0] ;
         A13962BarArtTinD = H015C4_A13962BarArtTinD[0] ;
         n13962BarArtTinD = H015C4_n13962BarArtTinD[0] ;
         A1935BarParTin = H015C4_A1935BarParTin[0] ;
         n1935BarParTin = H015C4_n1935BarParTin[0] ;
         A1934BarReoTin = H015C4_A1934BarReoTin[0] ;
         n1934BarReoTin = H015C4_n1934BarReoTin[0] ;
         A1933BarCodTin = H015C4_A1933BarCodTin[0] ;
         n1933BarCodTin = H015C4_n1933BarCodTin[0] ;
         A2316BarAgrLot = H015C4_A2316BarAgrLot[0] ;
         n2316BarAgrLot = H015C4_n2316BarAgrLot[0] ;
         A3705BarCosCol = H015C4_A3705BarCosCol[0] ;
         n3705BarCosCol = H015C4_n3705BarCosCol[0] ;
         A3658BarCosPA = H015C4_A3658BarCosPA[0] ;
         n3658BarCosPA = H015C4_n3658BarCosPA[0] ;
         A3654BarCosPD = H015C4_A3654BarCosPD[0] ;
         n3654BarCosPD = H015C4_n3654BarCosPD[0] ;
         A13962BarArtTinD = H015C4_A13962BarArtTinD[0] ;
         n13962BarArtTinD = H015C4_n13962BarArtTinD[0] ;
         A279CliNom = H015C4_A279CliNom[0] ;
         A13967BarNumEny = H015C4_A13967BarNumEny[0] ;
         n13967BarNumEny = H015C4_n13967BarNumEny[0] ;
         A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
         if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
         {
            A13975BarNumtint = (short)(1) ;
         }
         else
         {
            if ( true )
            {
               A13975BarNumtint = (short)(0) ;
            }
            else
            {
               A13975BarNumtint = (short)(0) ;
            }
         }
         AV100TotBarKgmTin = A1947BarKgmTin.add(AV100TotBarKgmTin) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV100TotBarKgmTin", GXutil.ltrimstr( AV100TotBarKgmTin, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGMTIN", getSecureSignedToken( sPrefix, localUtil.format( AV100TotBarKgmTin, "ZZZZZ9.99")));
         AV101TotBarMtrTin = A1948BarMtrTin.add(AV101TotBarMtrTin) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101TotBarMtrTin", GXutil.ltrimstr( AV101TotBarMtrTin, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTRTIN", getSecureSignedToken( sPrefix, localUtil.format( AV101TotBarMtrTin, "ZZZZZ9.99")));
         AV116TotBarNumtint = (long)(A13975BarNumtint+AV116TotBarNumtint) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV116TotBarNumtint", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116TotBarNumtint), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARNUMTINT", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV116TotBarNumtint), "ZZZ9")));
         AV126TotCosteInicial = A14199CosteInici.add(AV126TotCosteInicial) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV126TotCosteInicial", GXutil.ltrimstr( AV126TotCosteInicial, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCOSTEINICIAL", getSecureSignedToken( sPrefix, localUtil.format( AV126TotCosteInicial, "ZZZZZZ9.99")));
         AV128TotCosteAnyadidas = A14200CosteAnyad.add(AV128TotCosteAnyadidas) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV128TotCosteAnyadidas", GXutil.ltrimstr( AV128TotCosteAnyadidas, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTCOSTEANYADIDAS", getSecureSignedToken( sPrefix, localUtil.format( AV128TotCosteAnyadidas, "ZZZZZZ9.99")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV104TotValueBarKgmTin = localUtil.format( AV100TotBarKgmTin, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV104TotValueBarKgmTin", AV104TotValueBarKgmTin);
      AV105TotValueBarMtrTin = localUtil.format( AV101TotBarMtrTin, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV105TotValueBarMtrTin", AV105TotValueBarMtrTin);
      AV117TotValueBarNumtint = localUtil.format( DecimalUtil.doubleToDec(AV116TotBarNumtint), "ZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV117TotValueBarNumtint", AV117TotValueBarNumtint);
      AV127TotValueCosteInicial = localUtil.format( AV126TotCosteInicial, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV127TotValueCosteInicial", AV127TotValueCosteInicial);
      AV129TotValueCosteAnyadidas = localUtil.format( AV128TotCosteAnyadidas, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV129TotValueCosteAnyadidas", AV129TotValueCosteAnyadidas);
   }

   public void wb_table2_72_15C2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarkgmtin_Internalname, httpContext.getMessage( "Tot Value Bar Kgm Tin", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarkgmtin_Internalname, AV104TotValueBarKgmTin, GXutil.rtrim( localUtil.format( AV104TotValueBarKgmTin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarkgmtin_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarkgmtin_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarmtrtin_Internalname, httpContext.getMessage( "Tot Value Bar Mtr Tin", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarmtrtin_Internalname, AV105TotValueBarMtrTin, GXutil.rtrim( localUtil.format( AV105TotValueBarMtrTin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarmtrtin_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarmtrtin_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarnumtint_Internalname, httpContext.getMessage( "Tot Value Bar Numtint", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarnumtint_Internalname, AV117TotValueBarNumtint, GXutil.rtrim( localUtil.format( AV117TotValueBarNumtint, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarnumtint_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarnumtint_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluecosteinicial_Internalname, httpContext.getMessage( "Tot Value Coste Inicial", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluecosteinicial_Internalname, AV127TotValueCosteInicial, GXutil.rtrim( localUtil.format( AV127TotValueCosteInicial, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluecosteinicial_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluecosteinicial_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluecosteanyadidas_Internalname, httpContext.getMessage( "Tot Value Coste Anyadidas", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluecosteanyadidas_Internalname, AV129TotValueCosteAnyadidas, GXutil.rtrim( localUtil.format( AV129TotValueCosteAnyadidas, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluecosteanyadidas_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluecosteanyadidas_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_72_15C2e( true) ;
      }
      else
      {
         wb_table2_72_15C2e( false) ;
      }
   }

   public void wb_table1_23_15C2( boolean wbgen )
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
         wb_table1_23_15C2e( true) ;
      }
      else
      {
         wb_table1_23_15C2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      AV8Fec1 = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Fec1", localUtil.format(AV8Fec1, "99/99/99"));
      AV9Fec3 = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Fec3", localUtil.format(AV9Fec3, "99/99/99"));
      AV10PCliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10PCliCod), 6, 0));
      AV11CliCodP = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CliCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCodP), 6, 0));
      AV12PBarCod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12PBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12PBarCod), 8, 0));
      AV13Barcodp = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Barcodp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Barcodp), 8, 0));
      AV14PBarCodReo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14PBarCodReo", GXutil.str( AV14PBarCodReo, 1, 0));
      AV15BarCodReoP = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarCodReoP", GXutil.str( AV15BarCodReoP, 1, 0));
      AV16PBarCodPar = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16PBarCodPar", AV16PBarCodPar);
      AV17BarCodParP = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarCodParP", AV17BarCodParP);
      AV18PSerie = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18PSerie", AV18PSerie);
      AV19SerieP = (String)getParm(obj,12,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19SerieP", AV19SerieP);
      AV20PColor = (String)getParm(obj,13,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20PColor", AV20PColor);
      AV21ColorP = (String)getParm(obj,14,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ColorP", AV21ColorP);
      AV22PColNum = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22PColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22PColNum), 6, 0));
      AV23ColNumP = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ColNumP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23ColNumP), 6, 0));
      AV24DispCli1 = (String)getParm(obj,17,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24DispCli1", AV24DispCli1);
      AV25DispCli3 = (String)getParm(obj,18,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25DispCli3", AV25DispCli3);
      AV26HreRacab = (String)getParm(obj,19,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26HreRacab", AV26HreRacab);
      AV27MaqCodi = (String)getParm(obj,20,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27MaqCodi", AV27MaqCodi);
      AV28MaqCod3 = (String)getParm(obj,21,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28MaqCod3", AV28MaqCod3);
      AV118TipArtCodfrom = ((Number) GXutil.testNumericType( getParm(obj,22,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TipArtCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118TipArtCodfrom), 4, 0));
      AV119TipArtCodto = ((Number) GXutil.testNumericType( getParm(obj,23,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TipArtCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119TipArtCodto), 4, 0));
      AV120SoloAd = (String)getParm(obj,24,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120SoloAd", AV120SoloAd);
      AV121CorAdi = (String)getParm(obj,25,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121CorAdi", AV121CorAdi);
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
      pa15C2( ) ;
      ws15C2( ) ;
      we15C2( ) ;
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
      sCtrlAV7Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8Fec1 = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV9Fec3 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV10PCliCod = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV11CliCodP = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV12PBarCod = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV13Barcodp = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV14PBarCodReo = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV15BarCodReoP = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV16PBarCodPar = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV17BarCodParP = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV18PSerie = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV19SerieP = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV20PColor = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV21ColorP = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV22PColNum = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV23ColNumP = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV24DispCli1 = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV25DispCli3 = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV26HreRacab = (String)getParm(obj,19,TypeConstants.STRING) ;
      sCtrlAV27MaqCodi = (String)getParm(obj,20,TypeConstants.STRING) ;
      sCtrlAV28MaqCod3 = (String)getParm(obj,21,TypeConstants.STRING) ;
      sCtrlAV118TipArtCodfrom = (String)getParm(obj,22,TypeConstants.STRING) ;
      sCtrlAV119TipArtCodto = (String)getParm(obj,23,TypeConstants.STRING) ;
      sCtrlAV120SoloAd = (String)getParm(obj,24,TypeConstants.STRING) ;
      sCtrlAV121CorAdi = (String)getParm(obj,25,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa15C2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\consultadesdelconti", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa15C2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
         AV8Fec1 = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Fec1", localUtil.format(AV8Fec1, "99/99/99"));
         AV9Fec3 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Fec3", localUtil.format(AV9Fec3, "99/99/99"));
         AV10PCliCod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10PCliCod), 6, 0));
         AV11CliCodP = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CliCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCodP), 6, 0));
         AV12PBarCod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12PBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12PBarCod), 8, 0));
         AV13Barcodp = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Barcodp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Barcodp), 8, 0));
         AV14PBarCodReo = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14PBarCodReo", GXutil.str( AV14PBarCodReo, 1, 0));
         AV15BarCodReoP = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarCodReoP", GXutil.str( AV15BarCodReoP, 1, 0));
         AV16PBarCodPar = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16PBarCodPar", AV16PBarCodPar);
         AV17BarCodParP = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarCodParP", AV17BarCodParP);
         AV18PSerie = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18PSerie", AV18PSerie);
         AV19SerieP = (String)getParm(obj,14,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19SerieP", AV19SerieP);
         AV20PColor = (String)getParm(obj,15,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20PColor", AV20PColor);
         AV21ColorP = (String)getParm(obj,16,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ColorP", AV21ColorP);
         AV22PColNum = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22PColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22PColNum), 6, 0));
         AV23ColNumP = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ColNumP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23ColNumP), 6, 0));
         AV24DispCli1 = (String)getParm(obj,19,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24DispCli1", AV24DispCli1);
         AV25DispCli3 = (String)getParm(obj,20,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25DispCli3", AV25DispCli3);
         AV26HreRacab = (String)getParm(obj,21,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26HreRacab", AV26HreRacab);
         AV27MaqCodi = (String)getParm(obj,22,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27MaqCodi", AV27MaqCodi);
         AV28MaqCod3 = (String)getParm(obj,23,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28MaqCod3", AV28MaqCod3);
         AV118TipArtCodfrom = ((Number) GXutil.testNumericType( getParm(obj,24,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TipArtCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118TipArtCodfrom), 4, 0));
         AV119TipArtCodto = ((Number) GXutil.testNumericType( getParm(obj,25,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TipArtCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119TipArtCodto), 4, 0));
         AV120SoloAd = (String)getParm(obj,26,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120SoloAd", AV120SoloAd);
         AV121CorAdi = (String)getParm(obj,27,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121CorAdi", AV121CorAdi);
      }
      wcpOAV7Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7Emprcod") ;
      wcpOAV8Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8Fec1"), 0) ;
      wcpOAV9Fec3 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9Fec3"), 0) ;
      wcpOAV10PCliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10PCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV11CliCodP = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11CliCodP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV12PBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV12PBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV13Barcodp = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13Barcodp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV14PBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14PBarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV15BarCodReoP = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15BarCodReoP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV16PBarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV16PBarCodPar") ;
      wcpOAV17BarCodParP = httpContext.cgiGet( sPrefix+"wcpOAV17BarCodParP") ;
      wcpOAV18PSerie = httpContext.cgiGet( sPrefix+"wcpOAV18PSerie") ;
      wcpOAV19SerieP = httpContext.cgiGet( sPrefix+"wcpOAV19SerieP") ;
      wcpOAV20PColor = httpContext.cgiGet( sPrefix+"wcpOAV20PColor") ;
      wcpOAV21ColorP = httpContext.cgiGet( sPrefix+"wcpOAV21ColorP") ;
      wcpOAV22PColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22PColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV23ColNumP = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV23ColNumP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV24DispCli1 = httpContext.cgiGet( sPrefix+"wcpOAV24DispCli1") ;
      wcpOAV25DispCli3 = httpContext.cgiGet( sPrefix+"wcpOAV25DispCli3") ;
      wcpOAV26HreRacab = httpContext.cgiGet( sPrefix+"wcpOAV26HreRacab") ;
      wcpOAV27MaqCodi = httpContext.cgiGet( sPrefix+"wcpOAV27MaqCodi") ;
      wcpOAV28MaqCod3 = httpContext.cgiGet( sPrefix+"wcpOAV28MaqCod3") ;
      wcpOAV118TipArtCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV118TipArtCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV119TipArtCodto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV119TipArtCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV120SoloAd = httpContext.cgiGet( sPrefix+"wcpOAV120SoloAd") ;
      wcpOAV121CorAdi = httpContext.cgiGet( sPrefix+"wcpOAV121CorAdi") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7Emprcod, wcpOAV7Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV8Fec1), GXutil.resetTime(wcpOAV8Fec1)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV9Fec3), GXutil.resetTime(wcpOAV9Fec3)) ) || ( AV10PCliCod != wcpOAV10PCliCod ) || ( AV11CliCodP != wcpOAV11CliCodP ) || ( AV12PBarCod != wcpOAV12PBarCod ) || ( AV13Barcodp != wcpOAV13Barcodp ) || ( AV14PBarCodReo != wcpOAV14PBarCodReo ) || ( AV15BarCodReoP != wcpOAV15BarCodReoP ) || ( GXutil.strcmp(AV16PBarCodPar, wcpOAV16PBarCodPar) != 0 ) || ( GXutil.strcmp(AV17BarCodParP, wcpOAV17BarCodParP) != 0 ) || ( GXutil.strcmp(AV18PSerie, wcpOAV18PSerie) != 0 ) || ( GXutil.strcmp(AV19SerieP, wcpOAV19SerieP) != 0 ) || ( GXutil.strcmp(AV20PColor, wcpOAV20PColor) != 0 ) || ( GXutil.strcmp(AV21ColorP, wcpOAV21ColorP) != 0 ) || ( AV22PColNum != wcpOAV22PColNum ) || ( AV23ColNumP != wcpOAV23ColNumP ) || ( GXutil.strcmp(AV24DispCli1, wcpOAV24DispCli1) != 0 ) || ( GXutil.strcmp(AV25DispCli3, wcpOAV25DispCli3) != 0 ) || ( GXutil.strcmp(AV26HreRacab, wcpOAV26HreRacab) != 0 ) || ( GXutil.strcmp(AV27MaqCodi, wcpOAV27MaqCodi) != 0 ) || ( GXutil.strcmp(AV28MaqCod3, wcpOAV28MaqCod3) != 0 ) || ( AV118TipArtCodfrom != wcpOAV118TipArtCodfrom ) || ( AV119TipArtCodto != wcpOAV119TipArtCodto ) || ( GXutil.strcmp(AV120SoloAd, wcpOAV120SoloAd) != 0 ) || ( GXutil.strcmp(AV121CorAdi, wcpOAV121CorAdi) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV7Emprcod = AV7Emprcod ;
      wcpOAV8Fec1 = AV8Fec1 ;
      wcpOAV9Fec3 = AV9Fec3 ;
      wcpOAV10PCliCod = AV10PCliCod ;
      wcpOAV11CliCodP = AV11CliCodP ;
      wcpOAV12PBarCod = AV12PBarCod ;
      wcpOAV13Barcodp = AV13Barcodp ;
      wcpOAV14PBarCodReo = AV14PBarCodReo ;
      wcpOAV15BarCodReoP = AV15BarCodReoP ;
      wcpOAV16PBarCodPar = AV16PBarCodPar ;
      wcpOAV17BarCodParP = AV17BarCodParP ;
      wcpOAV18PSerie = AV18PSerie ;
      wcpOAV19SerieP = AV19SerieP ;
      wcpOAV20PColor = AV20PColor ;
      wcpOAV21ColorP = AV21ColorP ;
      wcpOAV22PColNum = AV22PColNum ;
      wcpOAV23ColNumP = AV23ColNumP ;
      wcpOAV24DispCli1 = AV24DispCli1 ;
      wcpOAV25DispCli3 = AV25DispCli3 ;
      wcpOAV26HreRacab = AV26HreRacab ;
      wcpOAV27MaqCodi = AV27MaqCodi ;
      wcpOAV28MaqCod3 = AV28MaqCod3 ;
      wcpOAV118TipArtCodfrom = AV118TipArtCodfrom ;
      wcpOAV119TipArtCodto = AV119TipArtCodto ;
      wcpOAV120SoloAd = AV120SoloAd ;
      wcpOAV121CorAdi = AV121CorAdi ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7Emprcod = httpContext.cgiGet( sPrefix+"AV7Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV7Emprcod) > 0 )
      {
         AV7Emprcod = httpContext.cgiGet( sCtrlAV7Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      }
      else
      {
         AV7Emprcod = httpContext.cgiGet( sPrefix+"AV7Emprcod_PARM") ;
      }
      sCtrlAV8Fec1 = httpContext.cgiGet( sPrefix+"AV8Fec1_CTRL") ;
      if ( GXutil.len( sCtrlAV8Fec1) > 0 )
      {
         AV8Fec1 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV8Fec1), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Fec1", localUtil.format(AV8Fec1, "99/99/99"));
      }
      else
      {
         AV8Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV8Fec1_PARM"), 0) ;
      }
      sCtrlAV9Fec3 = httpContext.cgiGet( sPrefix+"AV9Fec3_CTRL") ;
      if ( GXutil.len( sCtrlAV9Fec3) > 0 )
      {
         AV9Fec3 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV9Fec3), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Fec3", localUtil.format(AV9Fec3, "99/99/99"));
      }
      else
      {
         AV9Fec3 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV9Fec3_PARM"), 0) ;
      }
      sCtrlAV10PCliCod = httpContext.cgiGet( sPrefix+"AV10PCliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV10PCliCod) > 0 )
      {
         AV10PCliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10PCliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10PCliCod), 6, 0));
      }
      else
      {
         AV10PCliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10PCliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV11CliCodP = httpContext.cgiGet( sPrefix+"AV11CliCodP_CTRL") ;
      if ( GXutil.len( sCtrlAV11CliCodP) > 0 )
      {
         AV11CliCodP = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV11CliCodP), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CliCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCodP), 6, 0));
      }
      else
      {
         AV11CliCodP = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV11CliCodP_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV12PBarCod = httpContext.cgiGet( sPrefix+"AV12PBarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV12PBarCod) > 0 )
      {
         AV12PBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV12PBarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12PBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12PBarCod), 8, 0));
      }
      else
      {
         AV12PBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV12PBarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV13Barcodp = httpContext.cgiGet( sPrefix+"AV13Barcodp_CTRL") ;
      if ( GXutil.len( sCtrlAV13Barcodp) > 0 )
      {
         AV13Barcodp = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV13Barcodp), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Barcodp", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Barcodp), 8, 0));
      }
      else
      {
         AV13Barcodp = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV13Barcodp_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV14PBarCodReo = httpContext.cgiGet( sPrefix+"AV14PBarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlAV14PBarCodReo) > 0 )
      {
         AV14PBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV14PBarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14PBarCodReo", GXutil.str( AV14PBarCodReo, 1, 0));
      }
      else
      {
         AV14PBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV14PBarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV15BarCodReoP = httpContext.cgiGet( sPrefix+"AV15BarCodReoP_CTRL") ;
      if ( GXutil.len( sCtrlAV15BarCodReoP) > 0 )
      {
         AV15BarCodReoP = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV15BarCodReoP), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15BarCodReoP", GXutil.str( AV15BarCodReoP, 1, 0));
      }
      else
      {
         AV15BarCodReoP = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV15BarCodReoP_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV16PBarCodPar = httpContext.cgiGet( sPrefix+"AV16PBarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlAV16PBarCodPar) > 0 )
      {
         AV16PBarCodPar = httpContext.cgiGet( sCtrlAV16PBarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16PBarCodPar", AV16PBarCodPar);
      }
      else
      {
         AV16PBarCodPar = httpContext.cgiGet( sPrefix+"AV16PBarCodPar_PARM") ;
      }
      sCtrlAV17BarCodParP = httpContext.cgiGet( sPrefix+"AV17BarCodParP_CTRL") ;
      if ( GXutil.len( sCtrlAV17BarCodParP) > 0 )
      {
         AV17BarCodParP = httpContext.cgiGet( sCtrlAV17BarCodParP) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarCodParP", AV17BarCodParP);
      }
      else
      {
         AV17BarCodParP = httpContext.cgiGet( sPrefix+"AV17BarCodParP_PARM") ;
      }
      sCtrlAV18PSerie = httpContext.cgiGet( sPrefix+"AV18PSerie_CTRL") ;
      if ( GXutil.len( sCtrlAV18PSerie) > 0 )
      {
         AV18PSerie = httpContext.cgiGet( sCtrlAV18PSerie) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18PSerie", AV18PSerie);
      }
      else
      {
         AV18PSerie = httpContext.cgiGet( sPrefix+"AV18PSerie_PARM") ;
      }
      sCtrlAV19SerieP = httpContext.cgiGet( sPrefix+"AV19SerieP_CTRL") ;
      if ( GXutil.len( sCtrlAV19SerieP) > 0 )
      {
         AV19SerieP = httpContext.cgiGet( sCtrlAV19SerieP) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19SerieP", AV19SerieP);
      }
      else
      {
         AV19SerieP = httpContext.cgiGet( sPrefix+"AV19SerieP_PARM") ;
      }
      sCtrlAV20PColor = httpContext.cgiGet( sPrefix+"AV20PColor_CTRL") ;
      if ( GXutil.len( sCtrlAV20PColor) > 0 )
      {
         AV20PColor = httpContext.cgiGet( sCtrlAV20PColor) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20PColor", AV20PColor);
      }
      else
      {
         AV20PColor = httpContext.cgiGet( sPrefix+"AV20PColor_PARM") ;
      }
      sCtrlAV21ColorP = httpContext.cgiGet( sPrefix+"AV21ColorP_CTRL") ;
      if ( GXutil.len( sCtrlAV21ColorP) > 0 )
      {
         AV21ColorP = httpContext.cgiGet( sCtrlAV21ColorP) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ColorP", AV21ColorP);
      }
      else
      {
         AV21ColorP = httpContext.cgiGet( sPrefix+"AV21ColorP_PARM") ;
      }
      sCtrlAV22PColNum = httpContext.cgiGet( sPrefix+"AV22PColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV22PColNum) > 0 )
      {
         AV22PColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV22PColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22PColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22PColNum), 6, 0));
      }
      else
      {
         AV22PColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV22PColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV23ColNumP = httpContext.cgiGet( sPrefix+"AV23ColNumP_CTRL") ;
      if ( GXutil.len( sCtrlAV23ColNumP) > 0 )
      {
         AV23ColNumP = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV23ColNumP), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ColNumP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23ColNumP), 6, 0));
      }
      else
      {
         AV23ColNumP = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV23ColNumP_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV24DispCli1 = httpContext.cgiGet( sPrefix+"AV24DispCli1_CTRL") ;
      if ( GXutil.len( sCtrlAV24DispCli1) > 0 )
      {
         AV24DispCli1 = httpContext.cgiGet( sCtrlAV24DispCli1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24DispCli1", AV24DispCli1);
      }
      else
      {
         AV24DispCli1 = httpContext.cgiGet( sPrefix+"AV24DispCli1_PARM") ;
      }
      sCtrlAV25DispCli3 = httpContext.cgiGet( sPrefix+"AV25DispCli3_CTRL") ;
      if ( GXutil.len( sCtrlAV25DispCli3) > 0 )
      {
         AV25DispCli3 = httpContext.cgiGet( sCtrlAV25DispCli3) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25DispCli3", AV25DispCli3);
      }
      else
      {
         AV25DispCli3 = httpContext.cgiGet( sPrefix+"AV25DispCli3_PARM") ;
      }
      sCtrlAV26HreRacab = httpContext.cgiGet( sPrefix+"AV26HreRacab_CTRL") ;
      if ( GXutil.len( sCtrlAV26HreRacab) > 0 )
      {
         AV26HreRacab = httpContext.cgiGet( sCtrlAV26HreRacab) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26HreRacab", AV26HreRacab);
      }
      else
      {
         AV26HreRacab = httpContext.cgiGet( sPrefix+"AV26HreRacab_PARM") ;
      }
      sCtrlAV27MaqCodi = httpContext.cgiGet( sPrefix+"AV27MaqCodi_CTRL") ;
      if ( GXutil.len( sCtrlAV27MaqCodi) > 0 )
      {
         AV27MaqCodi = httpContext.cgiGet( sCtrlAV27MaqCodi) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27MaqCodi", AV27MaqCodi);
      }
      else
      {
         AV27MaqCodi = httpContext.cgiGet( sPrefix+"AV27MaqCodi_PARM") ;
      }
      sCtrlAV28MaqCod3 = httpContext.cgiGet( sPrefix+"AV28MaqCod3_CTRL") ;
      if ( GXutil.len( sCtrlAV28MaqCod3) > 0 )
      {
         AV28MaqCod3 = httpContext.cgiGet( sCtrlAV28MaqCod3) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28MaqCod3", AV28MaqCod3);
      }
      else
      {
         AV28MaqCod3 = httpContext.cgiGet( sPrefix+"AV28MaqCod3_PARM") ;
      }
      sCtrlAV118TipArtCodfrom = httpContext.cgiGet( sPrefix+"AV118TipArtCodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV118TipArtCodfrom) > 0 )
      {
         AV118TipArtCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV118TipArtCodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV118TipArtCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118TipArtCodfrom), 4, 0));
      }
      else
      {
         AV118TipArtCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV118TipArtCodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV119TipArtCodto = httpContext.cgiGet( sPrefix+"AV119TipArtCodto_CTRL") ;
      if ( GXutil.len( sCtrlAV119TipArtCodto) > 0 )
      {
         AV119TipArtCodto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV119TipArtCodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV119TipArtCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119TipArtCodto), 4, 0));
      }
      else
      {
         AV119TipArtCodto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV119TipArtCodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV120SoloAd = httpContext.cgiGet( sPrefix+"AV120SoloAd_CTRL") ;
      if ( GXutil.len( sCtrlAV120SoloAd) > 0 )
      {
         AV120SoloAd = httpContext.cgiGet( sCtrlAV120SoloAd) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV120SoloAd", AV120SoloAd);
      }
      else
      {
         AV120SoloAd = httpContext.cgiGet( sPrefix+"AV120SoloAd_PARM") ;
      }
      sCtrlAV121CorAdi = httpContext.cgiGet( sPrefix+"AV121CorAdi_CTRL") ;
      if ( GXutil.len( sCtrlAV121CorAdi) > 0 )
      {
         AV121CorAdi = httpContext.cgiGet( sCtrlAV121CorAdi) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV121CorAdi", AV121CorAdi);
      }
      else
      {
         AV121CorAdi = httpContext.cgiGet( sPrefix+"AV121CorAdi_PARM") ;
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
      pa15C2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws15C2( ) ;
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
      ws15C2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Emprcod_PARM", GXutil.rtrim( AV7Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Emprcod_CTRL", GXutil.rtrim( sCtrlAV7Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Fec1_PARM", localUtil.dtoc( AV8Fec1, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Fec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Fec1_CTRL", GXutil.rtrim( sCtrlAV8Fec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Fec3_PARM", localUtil.dtoc( AV9Fec3, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9Fec3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Fec3_CTRL", GXutil.rtrim( sCtrlAV9Fec3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10PCliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV10PCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10PCliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10PCliCod_CTRL", GXutil.rtrim( sCtrlAV10PCliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11CliCodP_PARM", GXutil.ltrim( localUtil.ntoc( AV11CliCodP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11CliCodP)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11CliCodP_CTRL", GXutil.rtrim( sCtrlAV11CliCodP));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12PBarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV12PBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12PBarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12PBarCod_CTRL", GXutil.rtrim( sCtrlAV12PBarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13Barcodp_PARM", GXutil.ltrim( localUtil.ntoc( AV13Barcodp, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13Barcodp)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13Barcodp_CTRL", GXutil.rtrim( sCtrlAV13Barcodp));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14PBarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( AV14PBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14PBarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14PBarCodReo_CTRL", GXutil.rtrim( sCtrlAV14PBarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15BarCodReoP_PARM", GXutil.ltrim( localUtil.ntoc( AV15BarCodReoP, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15BarCodReoP)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15BarCodReoP_CTRL", GXutil.rtrim( sCtrlAV15BarCodReoP));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16PBarCodPar_PARM", GXutil.rtrim( AV16PBarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16PBarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16PBarCodPar_CTRL", GXutil.rtrim( sCtrlAV16PBarCodPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17BarCodParP_PARM", GXutil.rtrim( AV17BarCodParP));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17BarCodParP)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17BarCodParP_CTRL", GXutil.rtrim( sCtrlAV17BarCodParP));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18PSerie_PARM", GXutil.rtrim( AV18PSerie));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18PSerie)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18PSerie_CTRL", GXutil.rtrim( sCtrlAV18PSerie));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19SerieP_PARM", GXutil.rtrim( AV19SerieP));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19SerieP)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19SerieP_CTRL", GXutil.rtrim( sCtrlAV19SerieP));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20PColor_PARM", GXutil.rtrim( AV20PColor));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20PColor)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20PColor_CTRL", GXutil.rtrim( sCtrlAV20PColor));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21ColorP_PARM", GXutil.rtrim( AV21ColorP));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21ColorP)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21ColorP_CTRL", GXutil.rtrim( sCtrlAV21ColorP));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22PColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV22PColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22PColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22PColNum_CTRL", GXutil.rtrim( sCtrlAV22PColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23ColNumP_PARM", GXutil.ltrim( localUtil.ntoc( AV23ColNumP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23ColNumP)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23ColNumP_CTRL", GXutil.rtrim( sCtrlAV23ColNumP));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24DispCli1_PARM", GXutil.rtrim( AV24DispCli1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24DispCli1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24DispCli1_CTRL", GXutil.rtrim( sCtrlAV24DispCli1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25DispCli3_PARM", GXutil.rtrim( AV25DispCli3));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25DispCli3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25DispCli3_CTRL", GXutil.rtrim( sCtrlAV25DispCli3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26HreRacab_PARM", GXutil.rtrim( AV26HreRacab));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26HreRacab)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26HreRacab_CTRL", GXutil.rtrim( sCtrlAV26HreRacab));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27MaqCodi_PARM", GXutil.rtrim( AV27MaqCodi));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27MaqCodi)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27MaqCodi_CTRL", GXutil.rtrim( sCtrlAV27MaqCodi));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28MaqCod3_PARM", GXutil.rtrim( AV28MaqCod3));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28MaqCod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28MaqCod3_CTRL", GXutil.rtrim( sCtrlAV28MaqCod3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV118TipArtCodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV118TipArtCodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV118TipArtCodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV118TipArtCodfrom_CTRL", GXutil.rtrim( sCtrlAV118TipArtCodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV119TipArtCodto_PARM", GXutil.ltrim( localUtil.ntoc( AV119TipArtCodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV119TipArtCodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV119TipArtCodto_CTRL", GXutil.rtrim( sCtrlAV119TipArtCodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV120SoloAd_PARM", GXutil.rtrim( AV120SoloAd));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV120SoloAd)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV120SoloAd_CTRL", GXutil.rtrim( sCtrlAV120SoloAd));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV121CorAdi_PARM", GXutil.rtrim( AV121CorAdi));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV121CorAdi)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV121CorAdi_CTRL", GXutil.rtrim( sCtrlAV121CorAdi));
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
      we15C2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115564460", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/consultadesdelconti.js", "?202682115564461", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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

   public void subsflControlProps_342( )
   {
      edtavBarcod_Internalname = sPrefix+"vBARCOD_"+sGXsfl_34_idx ;
      edtavBarcodreo_Internalname = sPrefix+"vBARCODREO_"+sGXsfl_34_idx ;
      edtavBarcodpar_Internalname = sPrefix+"vBARCODPAR_"+sGXsfl_34_idx ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_34_idx ;
      edtEstFecCier_Internalname = sPrefix+"ESTFECCIER_"+sGXsfl_34_idx ;
      edtEstTinNr_Internalname = sPrefix+"ESTTINNR_"+sGXsfl_34_idx ;
      edtavMarca_Internalname = sPrefix+"vMARCA_"+sGXsfl_34_idx ;
      edtBarCodTin_Internalname = sPrefix+"BARCODTIN_"+sGXsfl_34_idx ;
      edtBarReoTin_Internalname = sPrefix+"BARREOTIN_"+sGXsfl_34_idx ;
      edtBarParTin_Internalname = sPrefix+"BARPARTIN_"+sGXsfl_34_idx ;
      edtBarnhdr_lc_Internalname = sPrefix+"BARNHDR_LC_"+sGXsfl_34_idx ;
      edtBarAgrLot_Internalname = sPrefix+"BARAGRLOT_"+sGXsfl_34_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_34_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_34_idx ;
      edtBarSerTin_Internalname = sPrefix+"BARSERTIN_"+sGXsfl_34_idx ;
      edtBarDscTin_Internalname = sPrefix+"BARDSCTIN_"+sGXsfl_34_idx ;
      edtBarArtTin_Internalname = sPrefix+"BARARTTIN_"+sGXsfl_34_idx ;
      edtBarArtTinD_Internalname = sPrefix+"BARARTTIND_"+sGXsfl_34_idx ;
      edtBarColNoT_Internalname = sPrefix+"BARCOLNOT_"+sGXsfl_34_idx ;
      edtBarColNuT_Internalname = sPrefix+"BARCOLNUT_"+sGXsfl_34_idx ;
      edtBarTipCoT_Internalname = sPrefix+"BARTIPCOT_"+sGXsfl_34_idx ;
      edtBarKgmTin_Internalname = sPrefix+"BARKGMTIN_"+sGXsfl_34_idx ;
      edtBarKgsTt_Internalname = sPrefix+"BARKGSTT_"+sGXsfl_34_idx ;
      edtBarMtrTin_Internalname = sPrefix+"BARMTRTIN_"+sGXsfl_34_idx ;
      edtBarNumtint_Internalname = sPrefix+"BARNUMTINT_"+sGXsfl_34_idx ;
      edtBarMtsTt_Internalname = sPrefix+"BARMTSTT_"+sGXsfl_34_idx ;
      edtBarMaqTin_Internalname = sPrefix+"BARMAQTIN_"+sGXsfl_34_idx ;
      edtBarVolTin_Internalname = sPrefix+"BARVOLTIN_"+sGXsfl_34_idx ;
      edtBarNumEny_Internalname = sPrefix+"BARNUMENY_"+sGXsfl_34_idx ;
      edtBarDispCli_Internalname = sPrefix+"BARDISPCLI_"+sGXsfl_34_idx ;
      edtBarNumAna_Internalname = sPrefix+"BARNUMANA_"+sGXsfl_34_idx ;
      edtCosteInici_Internalname = sPrefix+"COSTEINICI_"+sGXsfl_34_idx ;
      edtCosteAnyad_Internalname = sPrefix+"COSTEANYAD_"+sGXsfl_34_idx ;
      edtavCostekg_Internalname = sPrefix+"vCOSTEKG_"+sGXsfl_34_idx ;
      edtavCostemt_Internalname = sPrefix+"vCOSTEMT_"+sGXsfl_34_idx ;
   }

   public void subsflControlProps_fel_342( )
   {
      edtavBarcod_Internalname = sPrefix+"vBARCOD_"+sGXsfl_34_fel_idx ;
      edtavBarcodreo_Internalname = sPrefix+"vBARCODREO_"+sGXsfl_34_fel_idx ;
      edtavBarcodpar_Internalname = sPrefix+"vBARCODPAR_"+sGXsfl_34_fel_idx ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_34_fel_idx ;
      edtEstFecCier_Internalname = sPrefix+"ESTFECCIER_"+sGXsfl_34_fel_idx ;
      edtEstTinNr_Internalname = sPrefix+"ESTTINNR_"+sGXsfl_34_fel_idx ;
      edtavMarca_Internalname = sPrefix+"vMARCA_"+sGXsfl_34_fel_idx ;
      edtBarCodTin_Internalname = sPrefix+"BARCODTIN_"+sGXsfl_34_fel_idx ;
      edtBarReoTin_Internalname = sPrefix+"BARREOTIN_"+sGXsfl_34_fel_idx ;
      edtBarParTin_Internalname = sPrefix+"BARPARTIN_"+sGXsfl_34_fel_idx ;
      edtBarnhdr_lc_Internalname = sPrefix+"BARNHDR_LC_"+sGXsfl_34_fel_idx ;
      edtBarAgrLot_Internalname = sPrefix+"BARAGRLOT_"+sGXsfl_34_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_34_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_34_fel_idx ;
      edtBarSerTin_Internalname = sPrefix+"BARSERTIN_"+sGXsfl_34_fel_idx ;
      edtBarDscTin_Internalname = sPrefix+"BARDSCTIN_"+sGXsfl_34_fel_idx ;
      edtBarArtTin_Internalname = sPrefix+"BARARTTIN_"+sGXsfl_34_fel_idx ;
      edtBarArtTinD_Internalname = sPrefix+"BARARTTIND_"+sGXsfl_34_fel_idx ;
      edtBarColNoT_Internalname = sPrefix+"BARCOLNOT_"+sGXsfl_34_fel_idx ;
      edtBarColNuT_Internalname = sPrefix+"BARCOLNUT_"+sGXsfl_34_fel_idx ;
      edtBarTipCoT_Internalname = sPrefix+"BARTIPCOT_"+sGXsfl_34_fel_idx ;
      edtBarKgmTin_Internalname = sPrefix+"BARKGMTIN_"+sGXsfl_34_fel_idx ;
      edtBarKgsTt_Internalname = sPrefix+"BARKGSTT_"+sGXsfl_34_fel_idx ;
      edtBarMtrTin_Internalname = sPrefix+"BARMTRTIN_"+sGXsfl_34_fel_idx ;
      edtBarNumtint_Internalname = sPrefix+"BARNUMTINT_"+sGXsfl_34_fel_idx ;
      edtBarMtsTt_Internalname = sPrefix+"BARMTSTT_"+sGXsfl_34_fel_idx ;
      edtBarMaqTin_Internalname = sPrefix+"BARMAQTIN_"+sGXsfl_34_fel_idx ;
      edtBarVolTin_Internalname = sPrefix+"BARVOLTIN_"+sGXsfl_34_fel_idx ;
      edtBarNumEny_Internalname = sPrefix+"BARNUMENY_"+sGXsfl_34_fel_idx ;
      edtBarDispCli_Internalname = sPrefix+"BARDISPCLI_"+sGXsfl_34_fel_idx ;
      edtBarNumAna_Internalname = sPrefix+"BARNUMANA_"+sGXsfl_34_fel_idx ;
      edtCosteInici_Internalname = sPrefix+"COSTEINICI_"+sGXsfl_34_fel_idx ;
      edtCosteAnyad_Internalname = sPrefix+"COSTEANYAD_"+sGXsfl_34_fel_idx ;
      edtavCostekg_Internalname = sPrefix+"vCOSTEKG_"+sGXsfl_34_fel_idx ;
      edtavCostemt_Internalname = sPrefix+"vCOSTEMT_"+sGXsfl_34_fel_idx ;
   }

   public void sendrow_342( )
   {
      subsflControlProps_342( ) ;
      wb15C0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_34_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_34_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_34_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcod_Enabled!=0)&&(edtavBarcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 35,'"+sPrefix+"',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV43BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV43BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV43BarCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarcod_Enabled!=0)&&(edtavBarcod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcodreo_Enabled!=0)&&(edtavBarcodreo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 36,'"+sPrefix+"',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( AV44BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV44BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV44BarCodReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarcodreo_Enabled!=0)&&(edtavBarcodreo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcodpar_Enabled!=0)&&(edtavBarcodpar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 37,'"+sPrefix+"',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodpar_Internalname,GXutil.rtrim( AV45BarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarcodpar_Enabled!=0)&&(edtavBarcodpar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,37);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 38,'"+sPrefix+"',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV103DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,38);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e2015c2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEstFecCier_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstFecCier_Internalname,localUtil.format(A13759EstFecCier, "99/99/99"),localUtil.format( A13759EstFecCier, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEstFecCier_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtEstFecCier_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtEstTinNr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstTinNr_Internalname,GXutil.ltrim( localUtil.ntoc( A1929EstTinNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1929EstTinNr), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEstTinNr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtEstTinNr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavMarca_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMarca_Enabled!=0)&&(edtavMarca_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 41,'"+sPrefix+"',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMarca_Internalname,GXutil.rtrim( AV113Marca),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMarca_Enabled!=0)&&(edtavMarca_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,41);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMarca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavMarca_Visible),Integer.valueOf(edtavMarca_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarCodTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1933BarCodTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1933BarCodTin), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarCodTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarReoTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarReoTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1934BarReoTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1934BarReoTin), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarReoTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarReoTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarParTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarParTin_Internalname,GXutil.rtrim( A1935BarParTin),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarParTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarParTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarnhdr_lc_Internalname,GXutil.rtrim( A13841Barnhdr_lc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarnhdr_lc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarAgrLot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrLot_Internalname,GXutil.rtrim( A2316BarAgrLot),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrLot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAgrLot_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerTin_Internalname,GXutil.rtrim( A1936BarSerTin),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarSerTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarDscTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDscTin_Internalname,GXutil.rtrim( A1937BarDscTin),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarDscTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarDscTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarArtTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarArtTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1939BarArtTin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1939BarArtTin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarArtTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarArtTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarArtTinD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarArtTinD_Internalname,GXutil.rtrim( A13962BarArtTinD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarArtTinD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarArtTinD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNoT_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNoT_Internalname,GXutil.rtrim( A1940BarColNoT),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNoT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNoT_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNuT_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNuT_Internalname,GXutil.ltrim( localUtil.ntoc( A1941BarColNuT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1941BarColNuT), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNuT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNuT_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarTipCoT_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipCoT_Internalname,GXutil.ltrim( localUtil.ntoc( A1942BarTipCoT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1942BarTipCoT), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarTipCoT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarTipCoT_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKgmTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgmTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1947BarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1947BarKgmTin, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarKgmTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarKgmTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKgsTt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgsTt_Internalname,GXutil.ltrim( localUtil.ntoc( A8563BarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8563BarKgsTt, "ZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarKgsTt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarKgsTt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarMtrTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtrTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1948BarMtrTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1948BarMtrTin, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMtrTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarMtrTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarNumtint_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumtint_Internalname,GXutil.ltrim( localUtil.ntoc( A13975BarNumtint, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13975BarNumtint), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNumtint_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNumtint_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarMtsTt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtsTt_Internalname,GXutil.ltrim( localUtil.ntoc( A12993BarMtsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A12993BarMtsTt, "ZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMtsTt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarMtsTt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarMaqTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMaqTin_Internalname,GXutil.rtrim( A1945BarMaqTin),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMaqTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarMaqTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarVolTin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarVolTin_Internalname,GXutil.ltrim( localUtil.ntoc( A1946BarVolTin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1946BarVolTin), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarVolTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarVolTin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarNumEny_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumEny_Internalname,GXutil.ltrim( localUtil.ntoc( A13967BarNumEny, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13967BarNumEny), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNumEny_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNumEny_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarDispCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDispCli_Internalname,GXutil.rtrim( A11762BarDispCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarDispCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarDispCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarNumAna_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNumAna_Internalname,GXutil.ltrim( localUtil.ntoc( A3650BarNumAna, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3650BarNumAna), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNumAna_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNumAna_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCosteInici_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCosteInici_Internalname,GXutil.ltrim( localUtil.ntoc( A14199CosteInici, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14199CosteInici, "ZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCosteInici_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCosteInici_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCosteAnyad_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCosteAnyad_Internalname,GXutil.ltrim( localUtil.ntoc( A14200CosteAnyad, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14200CosteAnyad, "ZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCosteAnyad_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCosteAnyad_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostekg_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCostekg_Enabled!=0)&&(edtavCostekg_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 68,'"+sPrefix+"',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostekg_Internalname,GXutil.ltrim( localUtil.ntoc( AV41CosteKg, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostekg_Enabled!=0) ? localUtil.format( AV41CosteKg, "ZZZZ9.99999") : localUtil.format( AV41CosteKg, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavCostekg_Enabled!=0)&&(edtavCostekg_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,68);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostekg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostekg_Visible),Integer.valueOf(edtavCostekg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostemt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCostemt_Enabled!=0)&&(edtavCostemt_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 69,'"+sPrefix+"',false,'"+sGXsfl_34_idx+"',34)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostemt_Internalname,GXutil.ltrim( localUtil.ntoc( AV42CosteMT, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostemt_Enabled!=0) ? localUtil.format( AV42CosteMT, "ZZZZ9.99999") : localUtil.format( AV42CosteMT, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavCostemt_Enabled!=0)&&(edtavCostemt_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,69);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostemt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCostemt_Visible),Integer.valueOf(edtavCostemt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes15C2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_34_idx = ((subGrid_Islastpage==1)&&(nGXsfl_34_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_34_idx+1) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
      /* End function sendrow_342 */
   }

   public void startgridcontrol34( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"34\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEstFecCier_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEstTinNr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMarca_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "M", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCodTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarReoTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarParTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAgrLot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarDscTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarArtTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tip. Art.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarArtTinD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNoT_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNuT_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarTipCoT_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKgmTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKgsTt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs Tot", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMtrTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNumtint_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMtsTt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts Tot", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMaqTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarVolTin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNumEny_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Ensayo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarDispCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disp Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNumAna_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Adi", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCosteInici_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicial", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCosteAnyad_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Añadidas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostekg_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kg", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostemt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mt", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV43BarCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV44BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV45BarCodPar));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV103DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A13759EstFecCier, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEstFecCier_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1929EstTinNr, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEstTinNr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV113Marca));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMarca_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMarca_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1933BarCodTin, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCodTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1934BarReoTin, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarReoTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1935BarParTin));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarParTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13841Barnhdr_lc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2316BarAgrLot));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAgrLot_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1936BarSerTin));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSerTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1937BarDscTin));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarDscTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1939BarArtTin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarArtTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13962BarArtTinD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarArtTinD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1940BarColNoT));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNoT_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1941BarColNuT, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNuT_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1942BarTipCoT, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarTipCoT_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1947BarKgmTin, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarKgmTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8563BarKgsTt, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarKgsTt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1948BarMtrTin, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMtrTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13975BarNumtint, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNumtint_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12993BarMtsTt, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMtsTt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1945BarMaqTin));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMaqTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1946BarVolTin, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarVolTin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13967BarNumEny, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNumEny_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11762BarDispCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarDispCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3650BarNumAna, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNumAna_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14199CosteInici, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCosteInici_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14200CosteAnyad, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCosteAnyad_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV41CosteKg, (byte)(11), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostekg_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostekg_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42CosteMT, (byte)(11), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostemt_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostemt_Visible, (byte)(5), (byte)(0), ".", "")));
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
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavBarcod_Internalname = sPrefix+"vBARCOD" ;
      edtavBarcodreo_Internalname = sPrefix+"vBARCODREO" ;
      edtavBarcodpar_Internalname = sPrefix+"vBARCODPAR" ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtEstFecCier_Internalname = sPrefix+"ESTFECCIER" ;
      edtEstTinNr_Internalname = sPrefix+"ESTTINNR" ;
      edtavMarca_Internalname = sPrefix+"vMARCA" ;
      edtBarCodTin_Internalname = sPrefix+"BARCODTIN" ;
      edtBarReoTin_Internalname = sPrefix+"BARREOTIN" ;
      edtBarParTin_Internalname = sPrefix+"BARPARTIN" ;
      edtBarnhdr_lc_Internalname = sPrefix+"BARNHDR_LC" ;
      edtBarAgrLot_Internalname = sPrefix+"BARAGRLOT" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarSerTin_Internalname = sPrefix+"BARSERTIN" ;
      edtBarDscTin_Internalname = sPrefix+"BARDSCTIN" ;
      edtBarArtTin_Internalname = sPrefix+"BARARTTIN" ;
      edtBarArtTinD_Internalname = sPrefix+"BARARTTIND" ;
      edtBarColNoT_Internalname = sPrefix+"BARCOLNOT" ;
      edtBarColNuT_Internalname = sPrefix+"BARCOLNUT" ;
      edtBarTipCoT_Internalname = sPrefix+"BARTIPCOT" ;
      edtBarKgmTin_Internalname = sPrefix+"BARKGMTIN" ;
      edtBarKgsTt_Internalname = sPrefix+"BARKGSTT" ;
      edtBarMtrTin_Internalname = sPrefix+"BARMTRTIN" ;
      edtBarNumtint_Internalname = sPrefix+"BARNUMTINT" ;
      edtBarMtsTt_Internalname = sPrefix+"BARMTSTT" ;
      edtBarMaqTin_Internalname = sPrefix+"BARMAQTIN" ;
      edtBarVolTin_Internalname = sPrefix+"BARVOLTIN" ;
      edtBarNumEny_Internalname = sPrefix+"BARNUMENY" ;
      edtBarDispCli_Internalname = sPrefix+"BARDISPCLI" ;
      edtBarNumAna_Internalname = sPrefix+"BARNUMANA" ;
      edtCosteInici_Internalname = sPrefix+"COSTEINICI" ;
      edtCosteAnyad_Internalname = sPrefix+"COSTEANYAD" ;
      edtavCostekg_Internalname = sPrefix+"vCOSTEKG" ;
      edtavCostemt_Internalname = sPrefix+"vCOSTEMT" ;
      edtavTotvaluebarkgmtin_Internalname = sPrefix+"vTOTVALUEBARKGMTIN" ;
      edtavTotvaluebarmtrtin_Internalname = sPrefix+"vTOTVALUEBARMTRTIN" ;
      edtavTotvaluebarnumtint_Internalname = sPrefix+"vTOTVALUEBARNUMTINT" ;
      edtavTotvaluecosteinicial_Internalname = sPrefix+"vTOTVALUECOSTEINICIAL" ;
      edtavTotvaluecosteanyadidas_Internalname = sPrefix+"vTOTVALUECOSTEANYADIDAS" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_estfeccierauxdate_Internalname = sPrefix+"vDDO_ESTFECCIERAUXDATE" ;
      divDdo_estfeccierauxdates_Internalname = sPrefix+"DDO_ESTFECCIERAUXDATES" ;
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
      edtavCostemt_Jsonclick = "" ;
      edtavCostemt_Enabled = 1 ;
      edtavCostekg_Jsonclick = "" ;
      edtavCostekg_Enabled = 1 ;
      edtCosteAnyad_Jsonclick = "" ;
      edtCosteInici_Jsonclick = "" ;
      edtBarNumAna_Jsonclick = "" ;
      edtBarDispCli_Jsonclick = "" ;
      edtBarNumEny_Jsonclick = "" ;
      edtBarVolTin_Jsonclick = "" ;
      edtBarMaqTin_Jsonclick = "" ;
      edtBarMtsTt_Jsonclick = "" ;
      edtBarNumtint_Jsonclick = "" ;
      edtBarMtrTin_Jsonclick = "" ;
      edtBarKgsTt_Jsonclick = "" ;
      edtBarKgmTin_Jsonclick = "" ;
      edtBarTipCoT_Jsonclick = "" ;
      edtBarColNuT_Jsonclick = "" ;
      edtBarColNoT_Jsonclick = "" ;
      edtBarArtTinD_Jsonclick = "" ;
      edtBarArtTin_Jsonclick = "" ;
      edtBarDscTin_Jsonclick = "" ;
      edtBarSerTin_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtBarAgrLot_Jsonclick = "" ;
      edtBarnhdr_lc_Jsonclick = "" ;
      edtBarParTin_Jsonclick = "" ;
      edtBarReoTin_Jsonclick = "" ;
      edtBarCodTin_Jsonclick = "" ;
      edtavMarca_Jsonclick = "" ;
      edtavMarca_Enabled = 1 ;
      edtEstTinNr_Jsonclick = "" ;
      edtEstFecCier_Jsonclick = "" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Visible = 0 ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Visible = 0 ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Visible = 0 ;
      edtavBarcod_Enabled = 1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluecosteanyadidas_Jsonclick = "" ;
      edtavTotvaluecosteanyadidas_Enabled = 1 ;
      edtavTotvaluecosteinicial_Jsonclick = "" ;
      edtavTotvaluecosteinicial_Enabled = 1 ;
      edtavTotvaluebarnumtint_Jsonclick = "" ;
      edtavTotvaluebarnumtint_Enabled = 1 ;
      edtavTotvaluebarmtrtin_Jsonclick = "" ;
      edtavTotvaluebarmtrtin_Enabled = 1 ;
      edtavTotvaluebarkgmtin_Jsonclick = "" ;
      edtavTotvaluebarkgmtin_Enabled = 1 ;
      edtavCostemt_Visible = -1 ;
      edtavCostekg_Visible = -1 ;
      edtCosteAnyad_Visible = -1 ;
      edtCosteInici_Visible = -1 ;
      edtBarNumAna_Visible = -1 ;
      edtBarDispCli_Visible = -1 ;
      edtBarNumEny_Visible = -1 ;
      edtBarVolTin_Visible = -1 ;
      edtBarMaqTin_Visible = -1 ;
      edtBarMtsTt_Visible = -1 ;
      edtBarNumtint_Visible = -1 ;
      edtBarMtrTin_Visible = -1 ;
      edtBarKgsTt_Visible = -1 ;
      edtBarKgmTin_Visible = -1 ;
      edtBarTipCoT_Visible = -1 ;
      edtBarColNuT_Visible = -1 ;
      edtBarColNoT_Visible = -1 ;
      edtBarArtTinD_Visible = -1 ;
      edtBarArtTin_Visible = -1 ;
      edtBarDscTin_Visible = -1 ;
      edtBarSerTin_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtBarAgrLot_Visible = -1 ;
      edtBarParTin_Visible = -1 ;
      edtBarReoTin_Visible = -1 ;
      edtBarCodTin_Visible = -1 ;
      edtavMarca_Visible = -1 ;
      edtEstTinNr_Visible = -1 ;
      edtEstFecCier_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_estfeccierauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;Coste;Coste;Coste;Coste" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "FormulacionTinte.ConsultadesdeLcontiGetFilterData" ;
      Ddo_grid_Datalisttype = "|||||Dynamic|Dynamic||Dynamic|Dynamic|Dynamic||Dynamic|Dynamic||||||||Dynamic|||Dynamic|||||" ;
      Ddo_grid_Includedatalist = "|||||T|T||T|T|T||T|T||||||||T|||T|||||" ;
      Ddo_grid_Filterisrange = "|T||T|T|||T||||T|||T|T|T|T|T|T|T||T|T||T|T|T||" ;
      Ddo_grid_Filtertype = "Date|Numeric||Numeric|Numeric|Character|Character|Numeric|Character|Character|Character|Numeric|Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Character|Numeric|Numeric|Character|Numeric|Numeric|Numeric||" ;
      Ddo_grid_Includefilter = "T|T||T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T|T|T|T|T|T|T|T|T||T|T|T|T|T|T||T|T|T||T|T||||" ;
      Ddo_grid_Columnssortvalues = "2|3||4|5|6|7|8|9|10|11|12||13|14|15|16|17|18||19|20|21||22|23||||" ;
      Ddo_grid_Columnids = "4:EstFecCier|5:EstTinNr|6:Marca|7:BarCodTin|8:BarReoTin|9:BarParTin|11:BarAgrLot|12:CliCod|13:CliNom|14:BarSerTin|15:BarDscTin|16:BarArtTin|17:BarArtTinD|18:BarColNoT|19:BarColNuT|20:BarTipCoT|21:BarKgmTin|22:BarKgsTt|23:BarMtrTin|24:BarNumtint|25:BarMtsTt|26:BarMaqTin|27:BarVolTin|28:BarNumEny|29:BarDispCli|30:BarNumAna|31:CosteInicial|32:CosteAnyadidas|33:CosteKg|34:CosteMT" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Fec1',fld:'vFEC1',pic:''},{av:'AV9Fec3',fld:'vFEC3',pic:''},{av:'AV10PCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV11CliCodP',fld:'vCLICODP',pic:'ZZZZZ9'},{av:'AV12PBarCod',fld:'vPBARCOD',pic:'ZZZZZZZ9'},{av:'AV13Barcodp',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV14PBarCodReo',fld:'vPBARCODREO',pic:'9'},{av:'AV15BarCodReoP',fld:'vBARCODREOP',pic:'9'},{av:'AV16PBarCodPar',fld:'vPBARCODPAR',pic:''},{av:'AV17BarCodParP',fld:'vBARCODPARP',pic:''},{av:'AV18PSerie',fld:'vPSERIE',pic:''},{av:'AV19SerieP',fld:'vSERIEP',pic:''},{av:'AV20PColor',fld:'vPCOLOR',pic:''},{av:'AV21ColorP',fld:'vCOLORP',pic:''},{av:'AV22PColNum',fld:'vPCOLNUM',pic:'ZZZZZ9'},{av:'AV23ColNumP',fld:'vCOLNUMP',pic:'ZZZZZ9'},{av:'AV24DispCli1',fld:'vDISPCLI1',pic:''},{av:'AV25DispCli3',fld:'vDISPCLI3',pic:''},{av:'AV26HreRacab',fld:'vHRERACAB',pic:''},{av:'AV27MaqCodi',fld:'vMAQCODI',pic:''},{av:'AV28MaqCod3',fld:'vMAQCOD3',pic:''},{av:'AV118TipArtCodfrom',fld:'vTIPARTCODFROM',pic:'ZZZ9'},{av:'AV119TipArtCodto',fld:'vTIPARTCODTO',pic:'ZZZ9'},{av:'AV120SoloAd',fld:'vSOLOAD',pic:''},{av:'AV121CorAdi',fld:'vCORADI',pic:''},{av:'AV56TFEstFecCier',fld:'vTFESTFECCIER',pic:''},{av:'AV60TFEstTinNr',fld:'vTFESTTINNR',pic:'ZZZ9'},{av:'AV61TFEstTinNr_To',fld:'vTFESTTINNR_TO',pic:'ZZZ9'},{av:'AV130TFBarCodTin',fld:'vTFBARCODTIN',pic:'ZZZZZZZ9'},{av:'AV131TFBarCodTin_To',fld:'vTFBARCODTIN_TO',pic:'ZZZZZZZ9'},{av:'AV132TFBarReoTin',fld:'vTFBARREOTIN',pic:'9'},{av:'AV133TFBarReoTin_To',fld:'vTFBARREOTIN_TO',pic:'9'},{av:'AV134TFBarParTin',fld:'vTFBARPARTIN',pic:''},{av:'AV135TFBarParTin_Sel',fld:'vTFBARPARTIN_SEL',pic:''},{av:'AV64TFBarAgrLot',fld:'vTFBARAGRLOT',pic:''},{av:'AV65TFBarAgrLot_Sel',fld:'vTFBARAGRLOT_SEL',pic:''},{av:'AV66TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV67TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV70TFBarSerTin',fld:'vTFBARSERTIN',pic:''},{av:'AV71TFBarSerTin_Sel',fld:'vTFBARSERTIN_SEL',pic:''},{av:'AV72TFBarDscTin',fld:'vTFBARDSCTIN',pic:''},{av:'AV73TFBarDscTin_Sel',fld:'vTFBARDSCTIN_SEL',pic:''},{av:'AV106TFBarArtTin',fld:'vTFBARARTTIN',pic:'ZZZ9'},{av:'AV107TFBarArtTin_To',fld:'vTFBARARTTIN_TO',pic:'ZZZ9'},{av:'AV108TFBarArtTinD',fld:'vTFBARARTTIND',pic:''},{av:'AV109TFBarArtTinD_Sel',fld:'vTFBARARTTIND_SEL',pic:''},{av:'AV74TFBarColNoT',fld:'vTFBARCOLNOT',pic:''},{av:'AV75TFBarColNoT_Sel',fld:'vTFBARCOLNOT_SEL',pic:''},{av:'AV76TFBarColNuT',fld:'vTFBARCOLNUT',pic:'ZZZZZ9'},{av:'AV77TFBarColNuT_To',fld:'vTFBARCOLNUT_TO',pic:'ZZZZZ9'},{av:'AV78TFBarTipCoT',fld:'vTFBARTIPCOT',pic:'Z9'},{av:'AV79TFBarTipCoT_To',fld:'vTFBARTIPCOT_TO',pic:'Z9'},{av:'AV80TFBarKgmTin',fld:'vTFBARKGMTIN',pic:'ZZZZZ9.99'},{av:'AV81TFBarKgmTin_To',fld:'vTFBARKGMTIN_TO',pic:'ZZZZZ9.99'},{av:'AV82TFBarKgsTt',fld:'vTFBARKGSTT',pic:'ZZZZZZ9.99'},{av:'AV83TFBarKgsTt_To',fld:'vTFBARKGSTT_TO',pic:'ZZZZZZ9.99'},{av:'AV84TFBarMtrTin',fld:'vTFBARMTRTIN',pic:'ZZZZZ9.99'},{av:'AV85TFBarMtrTin_To',fld:'vTFBARMTRTIN_TO',pic:'ZZZZZ9.99'},{av:'AV114TFBarNumtint',fld:'vTFBARNUMTINT',pic:'ZZZ9'},{av:'AV115TFBarNumtint_To',fld:'vTFBARNUMTINT_TO',pic:'ZZZ9'},{av:'AV86TFBarMtsTt',fld:'vTFBARMTSTT',pic:'ZZZZZZ9.99'},{av:'AV87TFBarMtsTt_To',fld:'vTFBARMTSTT_TO',pic:'ZZZZZZ9.99'},{av:'AV88TFBarMaqTin',fld:'vTFBARMAQTIN',pic:''},{av:'AV89TFBarMaqTin_Sel',fld:'vTFBARMAQTIN_SEL',pic:''},{av:'AV90TFBarVolTin',fld:'vTFBARVOLTIN',pic:'ZZZZ9'},{av:'AV91TFBarVolTin_To',fld:'vTFBARVOLTIN_TO',pic:'ZZZZ9'},{av:'AV110TFBarNumEny',fld:'vTFBARNUMENY',pic:'ZZZZZZZ9'},{av:'AV111TFBarNumEny_To',fld:'vTFBARNUMENY_TO',pic:'ZZZZZZZ9'},{av:'AV92TFBarDispCli',fld:'vTFBARDISPCLI',pic:''},{av:'AV93TFBarDispCli_Sel',fld:'vTFBARDISPCLI_SEL',pic:''},{av:'AV94TFBarNumAna',fld:'vTFBARNUMANA',pic:'ZZ9'},{av:'AV95TFBarNumAna_To',fld:'vTFBARNUMANA_TO',pic:'ZZ9'},{av:'AV122TFCosteInicial',fld:'vTFCOSTEINICIAL',pic:'ZZZZZZ9.99'},{av:'AV123TFCosteInicial_To',fld:'vTFCOSTEINICIAL_TO',pic:'ZZZZZZ9.99'},{av:'AV124TFCosteAnyadidas',fld:'vTFCOSTEANYADIDAS',pic:'ZZZZZZ9.99'},{av:'AV125TFCosteAnyadidas_To',fld:'vTFCOSTEANYADIDAS_TO',pic:'ZZZZZZ9.99'},{av:'AV138Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV100TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV116TotBarNumtint',fld:'vTOTBARNUMTINT',pic:'ZZZ9',hsh:true},{av:'AV126TotCosteInicial',fld:'vTOTCOSTEINICIAL',pic:'ZZZZZZ9.99',hsh:true},{av:'AV128TotCosteAnyadidas',fld:'vTOTCOSTEANYADIDAS',pic:'ZZZZZZ9.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13759EstFecCier',fld:'ESTFECCIER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'A1936BarSerTin',fld:'BARSERTIN',pic:''},{av:'A1940BarColNoT',fld:'BARCOLNOT',pic:''},{av:'A1941BarColNuT',fld:'BARCOLNUT',pic:'ZZZZZ9'},{av:'A11762BarDispCli',fld:'BARDISPCLI',pic:''},{av:'A6634BarRecAcb',fld:'BARRECACB',pic:''},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A1939BarArtTin',fld:'BARARTTIN',pic:'ZZZ9'},{av:'A14200CosteAnyad',fld:'COSTEANYAD',pic:'ZZZZZZ9.99'},{av:'A3706BarCosAnc',fld:'BARCOSANC',pic:'ZZZZZZ9.99'},{av:'A1947BarKgmTin',fld:'BARKGMTIN',pic:'ZZZZZ9.99'},{av:'A1948BarMtrTin',fld:'BARMTRTIN',pic:'ZZZZZ9.99'},{av:'A13975BarNumtint',fld:'BARNUMTINT',pic:'ZZZ9'},{av:'A14199CosteInici',fld:'COSTEINICI',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEstFecCier_Visible',ctrl:'ESTFECCIER',prop:'Visible'},{av:'edtEstTinNr_Visible',ctrl:'ESTTINNR',prop:'Visible'},{av:'edtavMarca_Visible',ctrl:'vMARCA',prop:'Visible'},{av:'edtBarCodTin_Visible',ctrl:'BARCODTIN',prop:'Visible'},{av:'edtBarReoTin_Visible',ctrl:'BARREOTIN',prop:'Visible'},{av:'edtBarParTin_Visible',ctrl:'BARPARTIN',prop:'Visible'},{av:'edtBarAgrLot_Visible',ctrl:'BARAGRLOT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSerTin_Visible',ctrl:'BARSERTIN',prop:'Visible'},{av:'edtBarDscTin_Visible',ctrl:'BARDSCTIN',prop:'Visible'},{av:'edtBarArtTin_Visible',ctrl:'BARARTTIN',prop:'Visible'},{av:'edtBarArtTinD_Visible',ctrl:'BARARTTIND',prop:'Visible'},{av:'edtBarColNoT_Visible',ctrl:'BARCOLNOT',prop:'Visible'},{av:'edtBarColNuT_Visible',ctrl:'BARCOLNUT',prop:'Visible'},{av:'edtBarTipCoT_Visible',ctrl:'BARTIPCOT',prop:'Visible'},{av:'edtBarKgmTin_Visible',ctrl:'BARKGMTIN',prop:'Visible'},{av:'edtBarKgsTt_Visible',ctrl:'BARKGSTT',prop:'Visible'},{av:'edtBarMtrTin_Visible',ctrl:'BARMTRTIN',prop:'Visible'},{av:'edtBarNumtint_Visible',ctrl:'BARNUMTINT',prop:'Visible'},{av:'edtBarMtsTt_Visible',ctrl:'BARMTSTT',prop:'Visible'},{av:'edtBarMaqTin_Visible',ctrl:'BARMAQTIN',prop:'Visible'},{av:'edtBarVolTin_Visible',ctrl:'BARVOLTIN',prop:'Visible'},{av:'edtBarNumEny_Visible',ctrl:'BARNUMENY',prop:'Visible'},{av:'edtBarDispCli_Visible',ctrl:'BARDISPCLI',prop:'Visible'},{av:'edtBarNumAna_Visible',ctrl:'BARNUMANA',prop:'Visible'},{av:'edtCosteInici_Visible',ctrl:'COSTEINICI',prop:'Visible'},{av:'edtCosteAnyad_Visible',ctrl:'COSTEANYAD',prop:'Visible'},{av:'edtavCostekg_Visible',ctrl:'vCOSTEKG',prop:'Visible'},{av:'edtavCostemt_Visible',ctrl:'vCOSTEMT',prop:'Visible'},{av:'AV98GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV99GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV100TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV116TotBarNumtint',fld:'vTOTBARNUMTINT',pic:'ZZZ9',hsh:true},{av:'AV126TotCosteInicial',fld:'vTOTCOSTEINICIAL',pic:'ZZZZZZ9.99',hsh:true},{av:'AV128TotCosteAnyadidas',fld:'vTOTCOSTEANYADIDAS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV104TotValueBarKgmTin',fld:'vTOTVALUEBARKGMTIN',pic:''},{av:'AV105TotValueBarMtrTin',fld:'vTOTVALUEBARMTRTIN',pic:''},{av:'AV117TotValueBarNumtint',fld:'vTOTVALUEBARNUMTINT',pic:''},{av:'AV127TotValueCosteInicial',fld:'vTOTVALUECOSTEINICIAL',pic:''},{av:'AV129TotValueCosteAnyadidas',fld:'vTOTVALUECOSTEANYADIDAS',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1115C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Fec1',fld:'vFEC1',pic:''},{av:'AV9Fec3',fld:'vFEC3',pic:''},{av:'AV10PCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV11CliCodP',fld:'vCLICODP',pic:'ZZZZZ9'},{av:'AV12PBarCod',fld:'vPBARCOD',pic:'ZZZZZZZ9'},{av:'AV13Barcodp',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV14PBarCodReo',fld:'vPBARCODREO',pic:'9'},{av:'AV15BarCodReoP',fld:'vBARCODREOP',pic:'9'},{av:'AV16PBarCodPar',fld:'vPBARCODPAR',pic:''},{av:'AV17BarCodParP',fld:'vBARCODPARP',pic:''},{av:'AV18PSerie',fld:'vPSERIE',pic:''},{av:'AV19SerieP',fld:'vSERIEP',pic:''},{av:'AV20PColor',fld:'vPCOLOR',pic:''},{av:'AV21ColorP',fld:'vCOLORP',pic:''},{av:'AV22PColNum',fld:'vPCOLNUM',pic:'ZZZZZ9'},{av:'AV23ColNumP',fld:'vCOLNUMP',pic:'ZZZZZ9'},{av:'AV24DispCli1',fld:'vDISPCLI1',pic:''},{av:'AV25DispCli3',fld:'vDISPCLI3',pic:''},{av:'AV26HreRacab',fld:'vHRERACAB',pic:''},{av:'AV27MaqCodi',fld:'vMAQCODI',pic:''},{av:'AV28MaqCod3',fld:'vMAQCOD3',pic:''},{av:'AV118TipArtCodfrom',fld:'vTIPARTCODFROM',pic:'ZZZ9'},{av:'AV119TipArtCodto',fld:'vTIPARTCODTO',pic:'ZZZ9'},{av:'AV120SoloAd',fld:'vSOLOAD',pic:''},{av:'AV121CorAdi',fld:'vCORADI',pic:''},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV56TFEstFecCier',fld:'vTFESTFECCIER',pic:''},{av:'AV60TFEstTinNr',fld:'vTFESTTINNR',pic:'ZZZ9'},{av:'AV61TFEstTinNr_To',fld:'vTFESTTINNR_TO',pic:'ZZZ9'},{av:'AV130TFBarCodTin',fld:'vTFBARCODTIN',pic:'ZZZZZZZ9'},{av:'AV131TFBarCodTin_To',fld:'vTFBARCODTIN_TO',pic:'ZZZZZZZ9'},{av:'AV132TFBarReoTin',fld:'vTFBARREOTIN',pic:'9'},{av:'AV133TFBarReoTin_To',fld:'vTFBARREOTIN_TO',pic:'9'},{av:'AV134TFBarParTin',fld:'vTFBARPARTIN',pic:''},{av:'AV135TFBarParTin_Sel',fld:'vTFBARPARTIN_SEL',pic:''},{av:'AV64TFBarAgrLot',fld:'vTFBARAGRLOT',pic:''},{av:'AV65TFBarAgrLot_Sel',fld:'vTFBARAGRLOT_SEL',pic:''},{av:'AV66TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV67TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV70TFBarSerTin',fld:'vTFBARSERTIN',pic:''},{av:'AV71TFBarSerTin_Sel',fld:'vTFBARSERTIN_SEL',pic:''},{av:'AV72TFBarDscTin',fld:'vTFBARDSCTIN',pic:''},{av:'AV73TFBarDscTin_Sel',fld:'vTFBARDSCTIN_SEL',pic:''},{av:'AV106TFBarArtTin',fld:'vTFBARARTTIN',pic:'ZZZ9'},{av:'AV107TFBarArtTin_To',fld:'vTFBARARTTIN_TO',pic:'ZZZ9'},{av:'AV108TFBarArtTinD',fld:'vTFBARARTTIND',pic:''},{av:'AV109TFBarArtTinD_Sel',fld:'vTFBARARTTIND_SEL',pic:''},{av:'AV74TFBarColNoT',fld:'vTFBARCOLNOT',pic:''},{av:'AV75TFBarColNoT_Sel',fld:'vTFBARCOLNOT_SEL',pic:''},{av:'AV76TFBarColNuT',fld:'vTFBARCOLNUT',pic:'ZZZZZ9'},{av:'AV77TFBarColNuT_To',fld:'vTFBARCOLNUT_TO',pic:'ZZZZZ9'},{av:'AV78TFBarTipCoT',fld:'vTFBARTIPCOT',pic:'Z9'},{av:'AV79TFBarTipCoT_To',fld:'vTFBARTIPCOT_TO',pic:'Z9'},{av:'AV80TFBarKgmTin',fld:'vTFBARKGMTIN',pic:'ZZZZZ9.99'},{av:'AV81TFBarKgmTin_To',fld:'vTFBARKGMTIN_TO',pic:'ZZZZZ9.99'},{av:'AV82TFBarKgsTt',fld:'vTFBARKGSTT',pic:'ZZZZZZ9.99'},{av:'AV83TFBarKgsTt_To',fld:'vTFBARKGSTT_TO',pic:'ZZZZZZ9.99'},{av:'AV84TFBarMtrTin',fld:'vTFBARMTRTIN',pic:'ZZZZZ9.99'},{av:'AV85TFBarMtrTin_To',fld:'vTFBARMTRTIN_TO',pic:'ZZZZZ9.99'},{av:'AV114TFBarNumtint',fld:'vTFBARNUMTINT',pic:'ZZZ9'},{av:'AV115TFBarNumtint_To',fld:'vTFBARNUMTINT_TO',pic:'ZZZ9'},{av:'AV86TFBarMtsTt',fld:'vTFBARMTSTT',pic:'ZZZZZZ9.99'},{av:'AV87TFBarMtsTt_To',fld:'vTFBARMTSTT_TO',pic:'ZZZZZZ9.99'},{av:'AV88TFBarMaqTin',fld:'vTFBARMAQTIN',pic:''},{av:'AV89TFBarMaqTin_Sel',fld:'vTFBARMAQTIN_SEL',pic:''},{av:'AV90TFBarVolTin',fld:'vTFBARVOLTIN',pic:'ZZZZ9'},{av:'AV91TFBarVolTin_To',fld:'vTFBARVOLTIN_TO',pic:'ZZZZ9'},{av:'AV110TFBarNumEny',fld:'vTFBARNUMENY',pic:'ZZZZZZZ9'},{av:'AV111TFBarNumEny_To',fld:'vTFBARNUMENY_TO',pic:'ZZZZZZZ9'},{av:'AV92TFBarDispCli',fld:'vTFBARDISPCLI',pic:''},{av:'AV93TFBarDispCli_Sel',fld:'vTFBARDISPCLI_SEL',pic:''},{av:'AV94TFBarNumAna',fld:'vTFBARNUMANA',pic:'ZZ9'},{av:'AV95TFBarNumAna_To',fld:'vTFBARNUMANA_TO',pic:'ZZ9'},{av:'AV122TFCosteInicial',fld:'vTFCOSTEINICIAL',pic:'ZZZZZZ9.99'},{av:'AV123TFCosteInicial_To',fld:'vTFCOSTEINICIAL_TO',pic:'ZZZZZZ9.99'},{av:'AV124TFCosteAnyadidas',fld:'vTFCOSTEANYADIDAS',pic:'ZZZZZZ9.99'},{av:'AV125TFCosteAnyadidas_To',fld:'vTFCOSTEANYADIDAS_TO',pic:'ZZZZZZ9.99'},{av:'AV138Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV100TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV116TotBarNumtint',fld:'vTOTBARNUMTINT',pic:'ZZZ9',hsh:true},{av:'AV126TotCosteInicial',fld:'vTOTCOSTEINICIAL',pic:'ZZZZZZ9.99',hsh:true},{av:'AV128TotCosteAnyadidas',fld:'vTOTCOSTEANYADIDAS',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1215C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Fec1',fld:'vFEC1',pic:''},{av:'AV9Fec3',fld:'vFEC3',pic:''},{av:'AV10PCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV11CliCodP',fld:'vCLICODP',pic:'ZZZZZ9'},{av:'AV12PBarCod',fld:'vPBARCOD',pic:'ZZZZZZZ9'},{av:'AV13Barcodp',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV14PBarCodReo',fld:'vPBARCODREO',pic:'9'},{av:'AV15BarCodReoP',fld:'vBARCODREOP',pic:'9'},{av:'AV16PBarCodPar',fld:'vPBARCODPAR',pic:''},{av:'AV17BarCodParP',fld:'vBARCODPARP',pic:''},{av:'AV18PSerie',fld:'vPSERIE',pic:''},{av:'AV19SerieP',fld:'vSERIEP',pic:''},{av:'AV20PColor',fld:'vPCOLOR',pic:''},{av:'AV21ColorP',fld:'vCOLORP',pic:''},{av:'AV22PColNum',fld:'vPCOLNUM',pic:'ZZZZZ9'},{av:'AV23ColNumP',fld:'vCOLNUMP',pic:'ZZZZZ9'},{av:'AV24DispCli1',fld:'vDISPCLI1',pic:''},{av:'AV25DispCli3',fld:'vDISPCLI3',pic:''},{av:'AV26HreRacab',fld:'vHRERACAB',pic:''},{av:'AV27MaqCodi',fld:'vMAQCODI',pic:''},{av:'AV28MaqCod3',fld:'vMAQCOD3',pic:''},{av:'AV118TipArtCodfrom',fld:'vTIPARTCODFROM',pic:'ZZZ9'},{av:'AV119TipArtCodto',fld:'vTIPARTCODTO',pic:'ZZZ9'},{av:'AV120SoloAd',fld:'vSOLOAD',pic:''},{av:'AV121CorAdi',fld:'vCORADI',pic:''},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV56TFEstFecCier',fld:'vTFESTFECCIER',pic:''},{av:'AV60TFEstTinNr',fld:'vTFESTTINNR',pic:'ZZZ9'},{av:'AV61TFEstTinNr_To',fld:'vTFESTTINNR_TO',pic:'ZZZ9'},{av:'AV130TFBarCodTin',fld:'vTFBARCODTIN',pic:'ZZZZZZZ9'},{av:'AV131TFBarCodTin_To',fld:'vTFBARCODTIN_TO',pic:'ZZZZZZZ9'},{av:'AV132TFBarReoTin',fld:'vTFBARREOTIN',pic:'9'},{av:'AV133TFBarReoTin_To',fld:'vTFBARREOTIN_TO',pic:'9'},{av:'AV134TFBarParTin',fld:'vTFBARPARTIN',pic:''},{av:'AV135TFBarParTin_Sel',fld:'vTFBARPARTIN_SEL',pic:''},{av:'AV64TFBarAgrLot',fld:'vTFBARAGRLOT',pic:''},{av:'AV65TFBarAgrLot_Sel',fld:'vTFBARAGRLOT_SEL',pic:''},{av:'AV66TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV67TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV70TFBarSerTin',fld:'vTFBARSERTIN',pic:''},{av:'AV71TFBarSerTin_Sel',fld:'vTFBARSERTIN_SEL',pic:''},{av:'AV72TFBarDscTin',fld:'vTFBARDSCTIN',pic:''},{av:'AV73TFBarDscTin_Sel',fld:'vTFBARDSCTIN_SEL',pic:''},{av:'AV106TFBarArtTin',fld:'vTFBARARTTIN',pic:'ZZZ9'},{av:'AV107TFBarArtTin_To',fld:'vTFBARARTTIN_TO',pic:'ZZZ9'},{av:'AV108TFBarArtTinD',fld:'vTFBARARTTIND',pic:''},{av:'AV109TFBarArtTinD_Sel',fld:'vTFBARARTTIND_SEL',pic:''},{av:'AV74TFBarColNoT',fld:'vTFBARCOLNOT',pic:''},{av:'AV75TFBarColNoT_Sel',fld:'vTFBARCOLNOT_SEL',pic:''},{av:'AV76TFBarColNuT',fld:'vTFBARCOLNUT',pic:'ZZZZZ9'},{av:'AV77TFBarColNuT_To',fld:'vTFBARCOLNUT_TO',pic:'ZZZZZ9'},{av:'AV78TFBarTipCoT',fld:'vTFBARTIPCOT',pic:'Z9'},{av:'AV79TFBarTipCoT_To',fld:'vTFBARTIPCOT_TO',pic:'Z9'},{av:'AV80TFBarKgmTin',fld:'vTFBARKGMTIN',pic:'ZZZZZ9.99'},{av:'AV81TFBarKgmTin_To',fld:'vTFBARKGMTIN_TO',pic:'ZZZZZ9.99'},{av:'AV82TFBarKgsTt',fld:'vTFBARKGSTT',pic:'ZZZZZZ9.99'},{av:'AV83TFBarKgsTt_To',fld:'vTFBARKGSTT_TO',pic:'ZZZZZZ9.99'},{av:'AV84TFBarMtrTin',fld:'vTFBARMTRTIN',pic:'ZZZZZ9.99'},{av:'AV85TFBarMtrTin_To',fld:'vTFBARMTRTIN_TO',pic:'ZZZZZ9.99'},{av:'AV114TFBarNumtint',fld:'vTFBARNUMTINT',pic:'ZZZ9'},{av:'AV115TFBarNumtint_To',fld:'vTFBARNUMTINT_TO',pic:'ZZZ9'},{av:'AV86TFBarMtsTt',fld:'vTFBARMTSTT',pic:'ZZZZZZ9.99'},{av:'AV87TFBarMtsTt_To',fld:'vTFBARMTSTT_TO',pic:'ZZZZZZ9.99'},{av:'AV88TFBarMaqTin',fld:'vTFBARMAQTIN',pic:''},{av:'AV89TFBarMaqTin_Sel',fld:'vTFBARMAQTIN_SEL',pic:''},{av:'AV90TFBarVolTin',fld:'vTFBARVOLTIN',pic:'ZZZZ9'},{av:'AV91TFBarVolTin_To',fld:'vTFBARVOLTIN_TO',pic:'ZZZZ9'},{av:'AV110TFBarNumEny',fld:'vTFBARNUMENY',pic:'ZZZZZZZ9'},{av:'AV111TFBarNumEny_To',fld:'vTFBARNUMENY_TO',pic:'ZZZZZZZ9'},{av:'AV92TFBarDispCli',fld:'vTFBARDISPCLI',pic:''},{av:'AV93TFBarDispCli_Sel',fld:'vTFBARDISPCLI_SEL',pic:''},{av:'AV94TFBarNumAna',fld:'vTFBARNUMANA',pic:'ZZ9'},{av:'AV95TFBarNumAna_To',fld:'vTFBARNUMANA_TO',pic:'ZZ9'},{av:'AV122TFCosteInicial',fld:'vTFCOSTEINICIAL',pic:'ZZZZZZ9.99'},{av:'AV123TFCosteInicial_To',fld:'vTFCOSTEINICIAL_TO',pic:'ZZZZZZ9.99'},{av:'AV124TFCosteAnyadidas',fld:'vTFCOSTEANYADIDAS',pic:'ZZZZZZ9.99'},{av:'AV125TFCosteAnyadidas_To',fld:'vTFCOSTEANYADIDAS_TO',pic:'ZZZZZZ9.99'},{av:'AV138Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV100TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV116TotBarNumtint',fld:'vTOTBARNUMTINT',pic:'ZZZ9',hsh:true},{av:'AV126TotCosteInicial',fld:'vTOTCOSTEINICIAL',pic:'ZZZZZZ9.99',hsh:true},{av:'AV128TotCosteAnyadidas',fld:'vTOTCOSTEANYADIDAS',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1315C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Fec1',fld:'vFEC1',pic:''},{av:'AV9Fec3',fld:'vFEC3',pic:''},{av:'AV10PCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV11CliCodP',fld:'vCLICODP',pic:'ZZZZZ9'},{av:'AV12PBarCod',fld:'vPBARCOD',pic:'ZZZZZZZ9'},{av:'AV13Barcodp',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV14PBarCodReo',fld:'vPBARCODREO',pic:'9'},{av:'AV15BarCodReoP',fld:'vBARCODREOP',pic:'9'},{av:'AV16PBarCodPar',fld:'vPBARCODPAR',pic:''},{av:'AV17BarCodParP',fld:'vBARCODPARP',pic:''},{av:'AV18PSerie',fld:'vPSERIE',pic:''},{av:'AV19SerieP',fld:'vSERIEP',pic:''},{av:'AV20PColor',fld:'vPCOLOR',pic:''},{av:'AV21ColorP',fld:'vCOLORP',pic:''},{av:'AV22PColNum',fld:'vPCOLNUM',pic:'ZZZZZ9'},{av:'AV23ColNumP',fld:'vCOLNUMP',pic:'ZZZZZ9'},{av:'AV24DispCli1',fld:'vDISPCLI1',pic:''},{av:'AV25DispCli3',fld:'vDISPCLI3',pic:''},{av:'AV26HreRacab',fld:'vHRERACAB',pic:''},{av:'AV27MaqCodi',fld:'vMAQCODI',pic:''},{av:'AV28MaqCod3',fld:'vMAQCOD3',pic:''},{av:'AV118TipArtCodfrom',fld:'vTIPARTCODFROM',pic:'ZZZ9'},{av:'AV119TipArtCodto',fld:'vTIPARTCODTO',pic:'ZZZ9'},{av:'AV120SoloAd',fld:'vSOLOAD',pic:''},{av:'AV121CorAdi',fld:'vCORADI',pic:''},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV56TFEstFecCier',fld:'vTFESTFECCIER',pic:''},{av:'AV60TFEstTinNr',fld:'vTFESTTINNR',pic:'ZZZ9'},{av:'AV61TFEstTinNr_To',fld:'vTFESTTINNR_TO',pic:'ZZZ9'},{av:'AV130TFBarCodTin',fld:'vTFBARCODTIN',pic:'ZZZZZZZ9'},{av:'AV131TFBarCodTin_To',fld:'vTFBARCODTIN_TO',pic:'ZZZZZZZ9'},{av:'AV132TFBarReoTin',fld:'vTFBARREOTIN',pic:'9'},{av:'AV133TFBarReoTin_To',fld:'vTFBARREOTIN_TO',pic:'9'},{av:'AV134TFBarParTin',fld:'vTFBARPARTIN',pic:''},{av:'AV135TFBarParTin_Sel',fld:'vTFBARPARTIN_SEL',pic:''},{av:'AV64TFBarAgrLot',fld:'vTFBARAGRLOT',pic:''},{av:'AV65TFBarAgrLot_Sel',fld:'vTFBARAGRLOT_SEL',pic:''},{av:'AV66TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV67TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV70TFBarSerTin',fld:'vTFBARSERTIN',pic:''},{av:'AV71TFBarSerTin_Sel',fld:'vTFBARSERTIN_SEL',pic:''},{av:'AV72TFBarDscTin',fld:'vTFBARDSCTIN',pic:''},{av:'AV73TFBarDscTin_Sel',fld:'vTFBARDSCTIN_SEL',pic:''},{av:'AV106TFBarArtTin',fld:'vTFBARARTTIN',pic:'ZZZ9'},{av:'AV107TFBarArtTin_To',fld:'vTFBARARTTIN_TO',pic:'ZZZ9'},{av:'AV108TFBarArtTinD',fld:'vTFBARARTTIND',pic:''},{av:'AV109TFBarArtTinD_Sel',fld:'vTFBARARTTIND_SEL',pic:''},{av:'AV74TFBarColNoT',fld:'vTFBARCOLNOT',pic:''},{av:'AV75TFBarColNoT_Sel',fld:'vTFBARCOLNOT_SEL',pic:''},{av:'AV76TFBarColNuT',fld:'vTFBARCOLNUT',pic:'ZZZZZ9'},{av:'AV77TFBarColNuT_To',fld:'vTFBARCOLNUT_TO',pic:'ZZZZZ9'},{av:'AV78TFBarTipCoT',fld:'vTFBARTIPCOT',pic:'Z9'},{av:'AV79TFBarTipCoT_To',fld:'vTFBARTIPCOT_TO',pic:'Z9'},{av:'AV80TFBarKgmTin',fld:'vTFBARKGMTIN',pic:'ZZZZZ9.99'},{av:'AV81TFBarKgmTin_To',fld:'vTFBARKGMTIN_TO',pic:'ZZZZZ9.99'},{av:'AV82TFBarKgsTt',fld:'vTFBARKGSTT',pic:'ZZZZZZ9.99'},{av:'AV83TFBarKgsTt_To',fld:'vTFBARKGSTT_TO',pic:'ZZZZZZ9.99'},{av:'AV84TFBarMtrTin',fld:'vTFBARMTRTIN',pic:'ZZZZZ9.99'},{av:'AV85TFBarMtrTin_To',fld:'vTFBARMTRTIN_TO',pic:'ZZZZZ9.99'},{av:'AV114TFBarNumtint',fld:'vTFBARNUMTINT',pic:'ZZZ9'},{av:'AV115TFBarNumtint_To',fld:'vTFBARNUMTINT_TO',pic:'ZZZ9'},{av:'AV86TFBarMtsTt',fld:'vTFBARMTSTT',pic:'ZZZZZZ9.99'},{av:'AV87TFBarMtsTt_To',fld:'vTFBARMTSTT_TO',pic:'ZZZZZZ9.99'},{av:'AV88TFBarMaqTin',fld:'vTFBARMAQTIN',pic:''},{av:'AV89TFBarMaqTin_Sel',fld:'vTFBARMAQTIN_SEL',pic:''},{av:'AV90TFBarVolTin',fld:'vTFBARVOLTIN',pic:'ZZZZ9'},{av:'AV91TFBarVolTin_To',fld:'vTFBARVOLTIN_TO',pic:'ZZZZ9'},{av:'AV110TFBarNumEny',fld:'vTFBARNUMENY',pic:'ZZZZZZZ9'},{av:'AV111TFBarNumEny_To',fld:'vTFBARNUMENY_TO',pic:'ZZZZZZZ9'},{av:'AV92TFBarDispCli',fld:'vTFBARDISPCLI',pic:''},{av:'AV93TFBarDispCli_Sel',fld:'vTFBARDISPCLI_SEL',pic:''},{av:'AV94TFBarNumAna',fld:'vTFBARNUMANA',pic:'ZZ9'},{av:'AV95TFBarNumAna_To',fld:'vTFBARNUMANA_TO',pic:'ZZ9'},{av:'AV122TFCosteInicial',fld:'vTFCOSTEINICIAL',pic:'ZZZZZZ9.99'},{av:'AV123TFCosteInicial_To',fld:'vTFCOSTEINICIAL_TO',pic:'ZZZZZZ9.99'},{av:'AV124TFCosteAnyadidas',fld:'vTFCOSTEANYADIDAS',pic:'ZZZZZZ9.99'},{av:'AV125TFCosteAnyadidas_To',fld:'vTFCOSTEANYADIDAS_TO',pic:'ZZZZZZ9.99'},{av:'AV138Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV100TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV116TotBarNumtint',fld:'vTOTBARNUMTINT',pic:'ZZZ9',hsh:true},{av:'AV126TotCosteInicial',fld:'vTOTCOSTEINICIAL',pic:'ZZZZZZ9.99',hsh:true},{av:'AV128TotCosteAnyadidas',fld:'vTOTCOSTEANYADIDAS',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124TFCosteAnyadidas',fld:'vTFCOSTEANYADIDAS',pic:'ZZZZZZ9.99'},{av:'AV125TFCosteAnyadidas_To',fld:'vTFCOSTEANYADIDAS_TO',pic:'ZZZZZZ9.99'},{av:'AV122TFCosteInicial',fld:'vTFCOSTEINICIAL',pic:'ZZZZZZ9.99'},{av:'AV123TFCosteInicial_To',fld:'vTFCOSTEINICIAL_TO',pic:'ZZZZZZ9.99'},{av:'AV94TFBarNumAna',fld:'vTFBARNUMANA',pic:'ZZ9'},{av:'AV95TFBarNumAna_To',fld:'vTFBARNUMANA_TO',pic:'ZZ9'},{av:'AV92TFBarDispCli',fld:'vTFBARDISPCLI',pic:''},{av:'AV93TFBarDispCli_Sel',fld:'vTFBARDISPCLI_SEL',pic:''},{av:'AV110TFBarNumEny',fld:'vTFBARNUMENY',pic:'ZZZZZZZ9'},{av:'AV111TFBarNumEny_To',fld:'vTFBARNUMENY_TO',pic:'ZZZZZZZ9'},{av:'AV90TFBarVolTin',fld:'vTFBARVOLTIN',pic:'ZZZZ9'},{av:'AV91TFBarVolTin_To',fld:'vTFBARVOLTIN_TO',pic:'ZZZZ9'},{av:'AV88TFBarMaqTin',fld:'vTFBARMAQTIN',pic:''},{av:'AV89TFBarMaqTin_Sel',fld:'vTFBARMAQTIN_SEL',pic:''},{av:'AV86TFBarMtsTt',fld:'vTFBARMTSTT',pic:'ZZZZZZ9.99'},{av:'AV87TFBarMtsTt_To',fld:'vTFBARMTSTT_TO',pic:'ZZZZZZ9.99'},{av:'AV114TFBarNumtint',fld:'vTFBARNUMTINT',pic:'ZZZ9'},{av:'AV115TFBarNumtint_To',fld:'vTFBARNUMTINT_TO',pic:'ZZZ9'},{av:'AV84TFBarMtrTin',fld:'vTFBARMTRTIN',pic:'ZZZZZ9.99'},{av:'AV85TFBarMtrTin_To',fld:'vTFBARMTRTIN_TO',pic:'ZZZZZ9.99'},{av:'AV82TFBarKgsTt',fld:'vTFBARKGSTT',pic:'ZZZZZZ9.99'},{av:'AV83TFBarKgsTt_To',fld:'vTFBARKGSTT_TO',pic:'ZZZZZZ9.99'},{av:'AV80TFBarKgmTin',fld:'vTFBARKGMTIN',pic:'ZZZZZ9.99'},{av:'AV81TFBarKgmTin_To',fld:'vTFBARKGMTIN_TO',pic:'ZZZZZ9.99'},{av:'AV78TFBarTipCoT',fld:'vTFBARTIPCOT',pic:'Z9'},{av:'AV79TFBarTipCoT_To',fld:'vTFBARTIPCOT_TO',pic:'Z9'},{av:'AV76TFBarColNuT',fld:'vTFBARCOLNUT',pic:'ZZZZZ9'},{av:'AV77TFBarColNuT_To',fld:'vTFBARCOLNUT_TO',pic:'ZZZZZ9'},{av:'AV74TFBarColNoT',fld:'vTFBARCOLNOT',pic:''},{av:'AV75TFBarColNoT_Sel',fld:'vTFBARCOLNOT_SEL',pic:''},{av:'AV108TFBarArtTinD',fld:'vTFBARARTTIND',pic:''},{av:'AV109TFBarArtTinD_Sel',fld:'vTFBARARTTIND_SEL',pic:''},{av:'AV106TFBarArtTin',fld:'vTFBARARTTIN',pic:'ZZZ9'},{av:'AV107TFBarArtTin_To',fld:'vTFBARARTTIN_TO',pic:'ZZZ9'},{av:'AV72TFBarDscTin',fld:'vTFBARDSCTIN',pic:''},{av:'AV73TFBarDscTin_Sel',fld:'vTFBARDSCTIN_SEL',pic:''},{av:'AV70TFBarSerTin',fld:'vTFBARSERTIN',pic:''},{av:'AV71TFBarSerTin_Sel',fld:'vTFBARSERTIN_SEL',pic:''},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV66TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV67TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFBarAgrLot',fld:'vTFBARAGRLOT',pic:''},{av:'AV65TFBarAgrLot_Sel',fld:'vTFBARAGRLOT_SEL',pic:''},{av:'AV134TFBarParTin',fld:'vTFBARPARTIN',pic:''},{av:'AV135TFBarParTin_Sel',fld:'vTFBARPARTIN_SEL',pic:''},{av:'AV132TFBarReoTin',fld:'vTFBARREOTIN',pic:'9'},{av:'AV133TFBarReoTin_To',fld:'vTFBARREOTIN_TO',pic:'9'},{av:'AV130TFBarCodTin',fld:'vTFBARCODTIN',pic:'ZZZZZZZ9'},{av:'AV131TFBarCodTin_To',fld:'vTFBARCODTIN_TO',pic:'ZZZZZZZ9'},{av:'AV60TFEstTinNr',fld:'vTFESTTINNR',pic:'ZZZ9'},{av:'AV61TFEstTinNr_To',fld:'vTFESTTINNR_TO',pic:'ZZZ9'},{av:'AV56TFEstFecCier',fld:'vTFESTFECCIER',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1915C2',iparms:[{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'A14199CosteInici',fld:'COSTEINICI',pic:'ZZZZZZ9.99'},{av:'A14200CosteAnyad',fld:'COSTEANYAD',pic:'ZZZZZZ9.99'},{av:'A8563BarKgsTt',fld:'BARKGSTT',pic:'ZZZZZZ9.99'},{av:'A1948BarMtrTin',fld:'BARMTRTIN',pic:'ZZZZZ9.99'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV103DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV43BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV44BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV45BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV113Marca',fld:'vMARCA',pic:''},{av:'AV41CosteKg',fld:'vCOSTEKG',pic:'ZZZZ9.99999'},{av:'AV42CosteMT',fld:'vCOSTEMT',pic:'ZZZZ9.99999'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1415C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Fec1',fld:'vFEC1',pic:''},{av:'AV9Fec3',fld:'vFEC3',pic:''},{av:'AV10PCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV11CliCodP',fld:'vCLICODP',pic:'ZZZZZ9'},{av:'AV12PBarCod',fld:'vPBARCOD',pic:'ZZZZZZZ9'},{av:'AV13Barcodp',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV14PBarCodReo',fld:'vPBARCODREO',pic:'9'},{av:'AV15BarCodReoP',fld:'vBARCODREOP',pic:'9'},{av:'AV16PBarCodPar',fld:'vPBARCODPAR',pic:''},{av:'AV17BarCodParP',fld:'vBARCODPARP',pic:''},{av:'AV18PSerie',fld:'vPSERIE',pic:''},{av:'AV19SerieP',fld:'vSERIEP',pic:''},{av:'AV20PColor',fld:'vPCOLOR',pic:''},{av:'AV21ColorP',fld:'vCOLORP',pic:''},{av:'AV22PColNum',fld:'vPCOLNUM',pic:'ZZZZZ9'},{av:'AV23ColNumP',fld:'vCOLNUMP',pic:'ZZZZZ9'},{av:'AV24DispCli1',fld:'vDISPCLI1',pic:''},{av:'AV25DispCli3',fld:'vDISPCLI3',pic:''},{av:'AV26HreRacab',fld:'vHRERACAB',pic:''},{av:'AV27MaqCodi',fld:'vMAQCODI',pic:''},{av:'AV28MaqCod3',fld:'vMAQCOD3',pic:''},{av:'AV118TipArtCodfrom',fld:'vTIPARTCODFROM',pic:'ZZZ9'},{av:'AV119TipArtCodto',fld:'vTIPARTCODTO',pic:'ZZZ9'},{av:'AV120SoloAd',fld:'vSOLOAD',pic:''},{av:'AV121CorAdi',fld:'vCORADI',pic:''},{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV56TFEstFecCier',fld:'vTFESTFECCIER',pic:''},{av:'AV60TFEstTinNr',fld:'vTFESTTINNR',pic:'ZZZ9'},{av:'AV61TFEstTinNr_To',fld:'vTFESTTINNR_TO',pic:'ZZZ9'},{av:'AV130TFBarCodTin',fld:'vTFBARCODTIN',pic:'ZZZZZZZ9'},{av:'AV131TFBarCodTin_To',fld:'vTFBARCODTIN_TO',pic:'ZZZZZZZ9'},{av:'AV132TFBarReoTin',fld:'vTFBARREOTIN',pic:'9'},{av:'AV133TFBarReoTin_To',fld:'vTFBARREOTIN_TO',pic:'9'},{av:'AV134TFBarParTin',fld:'vTFBARPARTIN',pic:''},{av:'AV135TFBarParTin_Sel',fld:'vTFBARPARTIN_SEL',pic:''},{av:'AV64TFBarAgrLot',fld:'vTFBARAGRLOT',pic:''},{av:'AV65TFBarAgrLot_Sel',fld:'vTFBARAGRLOT_SEL',pic:''},{av:'AV66TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV67TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV70TFBarSerTin',fld:'vTFBARSERTIN',pic:''},{av:'AV71TFBarSerTin_Sel',fld:'vTFBARSERTIN_SEL',pic:''},{av:'AV72TFBarDscTin',fld:'vTFBARDSCTIN',pic:''},{av:'AV73TFBarDscTin_Sel',fld:'vTFBARDSCTIN_SEL',pic:''},{av:'AV106TFBarArtTin',fld:'vTFBARARTTIN',pic:'ZZZ9'},{av:'AV107TFBarArtTin_To',fld:'vTFBARARTTIN_TO',pic:'ZZZ9'},{av:'AV108TFBarArtTinD',fld:'vTFBARARTTIND',pic:''},{av:'AV109TFBarArtTinD_Sel',fld:'vTFBARARTTIND_SEL',pic:''},{av:'AV74TFBarColNoT',fld:'vTFBARCOLNOT',pic:''},{av:'AV75TFBarColNoT_Sel',fld:'vTFBARCOLNOT_SEL',pic:''},{av:'AV76TFBarColNuT',fld:'vTFBARCOLNUT',pic:'ZZZZZ9'},{av:'AV77TFBarColNuT_To',fld:'vTFBARCOLNUT_TO',pic:'ZZZZZ9'},{av:'AV78TFBarTipCoT',fld:'vTFBARTIPCOT',pic:'Z9'},{av:'AV79TFBarTipCoT_To',fld:'vTFBARTIPCOT_TO',pic:'Z9'},{av:'AV80TFBarKgmTin',fld:'vTFBARKGMTIN',pic:'ZZZZZ9.99'},{av:'AV81TFBarKgmTin_To',fld:'vTFBARKGMTIN_TO',pic:'ZZZZZ9.99'},{av:'AV82TFBarKgsTt',fld:'vTFBARKGSTT',pic:'ZZZZZZ9.99'},{av:'AV83TFBarKgsTt_To',fld:'vTFBARKGSTT_TO',pic:'ZZZZZZ9.99'},{av:'AV84TFBarMtrTin',fld:'vTFBARMTRTIN',pic:'ZZZZZ9.99'},{av:'AV85TFBarMtrTin_To',fld:'vTFBARMTRTIN_TO',pic:'ZZZZZ9.99'},{av:'AV114TFBarNumtint',fld:'vTFBARNUMTINT',pic:'ZZZ9'},{av:'AV115TFBarNumtint_To',fld:'vTFBARNUMTINT_TO',pic:'ZZZ9'},{av:'AV86TFBarMtsTt',fld:'vTFBARMTSTT',pic:'ZZZZZZ9.99'},{av:'AV87TFBarMtsTt_To',fld:'vTFBARMTSTT_TO',pic:'ZZZZZZ9.99'},{av:'AV88TFBarMaqTin',fld:'vTFBARMAQTIN',pic:''},{av:'AV89TFBarMaqTin_Sel',fld:'vTFBARMAQTIN_SEL',pic:''},{av:'AV90TFBarVolTin',fld:'vTFBARVOLTIN',pic:'ZZZZ9'},{av:'AV91TFBarVolTin_To',fld:'vTFBARVOLTIN_TO',pic:'ZZZZ9'},{av:'AV110TFBarNumEny',fld:'vTFBARNUMENY',pic:'ZZZZZZZ9'},{av:'AV111TFBarNumEny_To',fld:'vTFBARNUMENY_TO',pic:'ZZZZZZZ9'},{av:'AV92TFBarDispCli',fld:'vTFBARDISPCLI',pic:''},{av:'AV93TFBarDispCli_Sel',fld:'vTFBARDISPCLI_SEL',pic:''},{av:'AV94TFBarNumAna',fld:'vTFBARNUMANA',pic:'ZZ9'},{av:'AV95TFBarNumAna_To',fld:'vTFBARNUMANA_TO',pic:'ZZ9'},{av:'AV122TFCosteInicial',fld:'vTFCOSTEINICIAL',pic:'ZZZZZZ9.99'},{av:'AV123TFCosteInicial_To',fld:'vTFCOSTEINICIAL_TO',pic:'ZZZZZZ9.99'},{av:'AV124TFCosteAnyadidas',fld:'vTFCOSTEANYADIDAS',pic:'ZZZZZZ9.99'},{av:'AV125TFCosteAnyadidas_To',fld:'vTFCOSTEANYADIDAS_TO',pic:'ZZZZZZ9.99'},{av:'AV138Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV100TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV116TotBarNumtint',fld:'vTOTBARNUMTINT',pic:'ZZZ9',hsh:true},{av:'AV126TotCosteInicial',fld:'vTOTCOSTEINICIAL',pic:'ZZZZZZ9.99',hsh:true},{av:'AV128TotCosteAnyadidas',fld:'vTOTCOSTEANYADIDAS',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13759EstFecCier',fld:'ESTFECCIER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'A1936BarSerTin',fld:'BARSERTIN',pic:''},{av:'A1940BarColNoT',fld:'BARCOLNOT',pic:''},{av:'A1941BarColNuT',fld:'BARCOLNUT',pic:'ZZZZZ9'},{av:'A11762BarDispCli',fld:'BARDISPCLI',pic:''},{av:'A6634BarRecAcb',fld:'BARRECACB',pic:''},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A1939BarArtTin',fld:'BARARTTIN',pic:'ZZZ9'},{av:'A14200CosteAnyad',fld:'COSTEANYAD',pic:'ZZZZZZ9.99'},{av:'A3706BarCosAnc',fld:'BARCOSANC',pic:'ZZZZZZ9.99'},{av:'A1947BarKgmTin',fld:'BARKGMTIN',pic:'ZZZZZ9.99'},{av:'A1948BarMtrTin',fld:'BARMTRTIN',pic:'ZZZZZ9.99'},{av:'A13975BarNumtint',fld:'BARNUMTINT',pic:'ZZZ9'},{av:'A14199CosteInici',fld:'COSTEINICI',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV50ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEstFecCier_Visible',ctrl:'ESTFECCIER',prop:'Visible'},{av:'edtEstTinNr_Visible',ctrl:'ESTTINNR',prop:'Visible'},{av:'edtavMarca_Visible',ctrl:'vMARCA',prop:'Visible'},{av:'edtBarCodTin_Visible',ctrl:'BARCODTIN',prop:'Visible'},{av:'edtBarReoTin_Visible',ctrl:'BARREOTIN',prop:'Visible'},{av:'edtBarParTin_Visible',ctrl:'BARPARTIN',prop:'Visible'},{av:'edtBarAgrLot_Visible',ctrl:'BARAGRLOT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSerTin_Visible',ctrl:'BARSERTIN',prop:'Visible'},{av:'edtBarDscTin_Visible',ctrl:'BARDSCTIN',prop:'Visible'},{av:'edtBarArtTin_Visible',ctrl:'BARARTTIN',prop:'Visible'},{av:'edtBarArtTinD_Visible',ctrl:'BARARTTIND',prop:'Visible'},{av:'edtBarColNoT_Visible',ctrl:'BARCOLNOT',prop:'Visible'},{av:'edtBarColNuT_Visible',ctrl:'BARCOLNUT',prop:'Visible'},{av:'edtBarTipCoT_Visible',ctrl:'BARTIPCOT',prop:'Visible'},{av:'edtBarKgmTin_Visible',ctrl:'BARKGMTIN',prop:'Visible'},{av:'edtBarKgsTt_Visible',ctrl:'BARKGSTT',prop:'Visible'},{av:'edtBarMtrTin_Visible',ctrl:'BARMTRTIN',prop:'Visible'},{av:'edtBarNumtint_Visible',ctrl:'BARNUMTINT',prop:'Visible'},{av:'edtBarMtsTt_Visible',ctrl:'BARMTSTT',prop:'Visible'},{av:'edtBarMaqTin_Visible',ctrl:'BARMAQTIN',prop:'Visible'},{av:'edtBarVolTin_Visible',ctrl:'BARVOLTIN',prop:'Visible'},{av:'edtBarNumEny_Visible',ctrl:'BARNUMENY',prop:'Visible'},{av:'edtBarDispCli_Visible',ctrl:'BARDISPCLI',prop:'Visible'},{av:'edtBarNumAna_Visible',ctrl:'BARNUMANA',prop:'Visible'},{av:'edtCosteInici_Visible',ctrl:'COSTEINICI',prop:'Visible'},{av:'edtCosteAnyad_Visible',ctrl:'COSTEANYAD',prop:'Visible'},{av:'edtavCostekg_Visible',ctrl:'vCOSTEKG',prop:'Visible'},{av:'edtavCostemt_Visible',ctrl:'vCOSTEMT',prop:'Visible'},{av:'AV98GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV99GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV100TotBarKgmTin',fld:'vTOTBARKGMTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV101TotBarMtrTin',fld:'vTOTBARMTRTIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV116TotBarNumtint',fld:'vTOTBARNUMTINT',pic:'ZZZ9',hsh:true},{av:'AV126TotCosteInicial',fld:'vTOTCOSTEINICIAL',pic:'ZZZZZZ9.99',hsh:true},{av:'AV128TotCosteAnyadidas',fld:'vTOTCOSTEANYADIDAS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV104TotValueBarKgmTin',fld:'vTOTVALUEBARKGMTIN',pic:''},{av:'AV105TotValueBarMtrTin',fld:'vTOTVALUEBARMTRTIN',pic:''},{av:'AV117TotValueBarNumtint',fld:'vTOTVALUEBARNUMTINT',pic:''},{av:'AV127TotValueCosteInicial',fld:'vTOTVALUECOSTEINICIAL',pic:''},{av:'AV129TotValueCosteAnyadidas',fld:'vTOTVALUECOSTEANYADIDAS',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1515C2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1615C2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e2015C2',iparms:[{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV43BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV44BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV45BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A13759EstFecCier',fld:'ESTFECCIER',pic:''}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("VALID_BARCODTIN","{handler:'valid_Barcodtin',iparms:[]");
      setEventMetadata("VALID_BARCODTIN",",oparms:[]}");
      setEventMetadata("VALID_BARREOTIN","{handler:'valid_Barreotin',iparms:[]");
      setEventMetadata("VALID_BARREOTIN",",oparms:[]}");
      setEventMetadata("VALID_BARPARTIN","{handler:'valid_Barpartin',iparms:[]");
      setEventMetadata("VALID_BARPARTIN",",oparms:[]}");
      setEventMetadata("VALID_BARAGRLOT","{handler:'valid_Baragrlot',iparms:[]");
      setEventMetadata("VALID_BARAGRLOT",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARSERTIN","{handler:'valid_Barsertin',iparms:[]");
      setEventMetadata("VALID_BARSERTIN",",oparms:[]}");
      setEventMetadata("VALID_BARARTTIN","{handler:'valid_Bararttin',iparms:[]");
      setEventMetadata("VALID_BARARTTIN",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNOT","{handler:'valid_Barcolnot',iparms:[]");
      setEventMetadata("VALID_BARCOLNOT",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNUT","{handler:'valid_Barcolnut',iparms:[]");
      setEventMetadata("VALID_BARCOLNUT",",oparms:[]}");
      setEventMetadata("VALID_BARTIPCOT","{handler:'valid_Bartipcot',iparms:[]");
      setEventMetadata("VALID_BARTIPCOT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Costemt',iparms:[]");
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
      wcpOAV7Emprcod = "" ;
      wcpOAV8Fec1 = GXutil.nullDate() ;
      wcpOAV9Fec3 = GXutil.nullDate() ;
      wcpOAV16PBarCodPar = "" ;
      wcpOAV17BarCodParP = "" ;
      wcpOAV18PSerie = "" ;
      wcpOAV19SerieP = "" ;
      wcpOAV20PColor = "" ;
      wcpOAV21ColorP = "" ;
      wcpOAV24DispCli1 = "" ;
      wcpOAV25DispCli3 = "" ;
      wcpOAV26HreRacab = "" ;
      wcpOAV27MaqCodi = "" ;
      wcpOAV28MaqCod3 = "" ;
      wcpOAV120SoloAd = "" ;
      wcpOAV121CorAdi = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7Emprcod = "" ;
      AV8Fec1 = GXutil.nullDate() ;
      AV9Fec3 = GXutil.nullDate() ;
      AV16PBarCodPar = "" ;
      AV17BarCodParP = "" ;
      AV18PSerie = "" ;
      AV19SerieP = "" ;
      AV20PColor = "" ;
      AV21ColorP = "" ;
      AV24DispCli1 = "" ;
      AV25DispCli3 = "" ;
      AV26HreRacab = "" ;
      AV27MaqCodi = "" ;
      AV28MaqCod3 = "" ;
      AV120SoloAd = "" ;
      AV121CorAdi = "" ;
      AV50ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV56TFEstFecCier = GXutil.nullDate() ;
      AV134TFBarParTin = "" ;
      AV135TFBarParTin_Sel = "" ;
      AV64TFBarAgrLot = "" ;
      AV65TFBarAgrLot_Sel = "" ;
      AV68TFCliNom = "" ;
      AV69TFCliNom_Sel = "" ;
      AV70TFBarSerTin = "" ;
      AV71TFBarSerTin_Sel = "" ;
      AV72TFBarDscTin = "" ;
      AV73TFBarDscTin_Sel = "" ;
      AV108TFBarArtTinD = "" ;
      AV109TFBarArtTinD_Sel = "" ;
      AV74TFBarColNoT = "" ;
      AV75TFBarColNoT_Sel = "" ;
      AV80TFBarKgmTin = DecimalUtil.ZERO ;
      AV81TFBarKgmTin_To = DecimalUtil.ZERO ;
      AV82TFBarKgsTt = DecimalUtil.ZERO ;
      AV83TFBarKgsTt_To = DecimalUtil.ZERO ;
      AV84TFBarMtrTin = DecimalUtil.ZERO ;
      AV85TFBarMtrTin_To = DecimalUtil.ZERO ;
      AV86TFBarMtsTt = DecimalUtil.ZERO ;
      AV87TFBarMtsTt_To = DecimalUtil.ZERO ;
      AV88TFBarMaqTin = "" ;
      AV89TFBarMaqTin_Sel = "" ;
      AV92TFBarDispCli = "" ;
      AV93TFBarDispCli_Sel = "" ;
      AV122TFCosteInicial = DecimalUtil.ZERO ;
      AV123TFCosteInicial_To = DecimalUtil.ZERO ;
      AV124TFCosteAnyadidas = DecimalUtil.ZERO ;
      AV125TFCosteAnyadidas_To = DecimalUtil.ZERO ;
      AV138Pgmname = "" ;
      AV100TotBarKgmTin = DecimalUtil.ZERO ;
      AV101TotBarMtrTin = DecimalUtil.ZERO ;
      AV126TotCosteInicial = DecimalUtil.ZERO ;
      AV128TotCosteAnyadidas = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV96DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      A6634BarRecAcb = "" ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3705BarCosCol = DecimalUtil.ZERO ;
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
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV58DDO_EstFecCierAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV45BarCodPar = "" ;
      AV103DetailWebComponent = "" ;
      A13759EstFecCier = GXutil.nullDate() ;
      AV113Marca = "" ;
      A1935BarParTin = "" ;
      A13841Barnhdr_lc = "" ;
      A2316BarAgrLot = "" ;
      A279CliNom = "" ;
      A1936BarSerTin = "" ;
      A1937BarDscTin = "" ;
      A13962BarArtTinD = "" ;
      A1940BarColNoT = "" ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      A1948BarMtrTin = DecimalUtil.ZERO ;
      A12993BarMtsTt = DecimalUtil.ZERO ;
      A1945BarMaqTin = "" ;
      A11762BarDispCli = "" ;
      A14199CosteInici = DecimalUtil.ZERO ;
      A14200CosteAnyad = DecimalUtil.ZERO ;
      AV41CosteKg = DecimalUtil.ZERO ;
      AV42CosteMT = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV163Formulaciontinte_consultadesdelcontids_22_tfbararttind = "" ;
      lV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin = "" ;
      lV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = "" ;
      lV155Formulaciontinte_consultadesdelcontids_14_tfclinom = "" ;
      lV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin = "" ;
      lV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin = "" ;
      lV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = "" ;
      lV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = "" ;
      lV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli = "" ;
      AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier = GXutil.nullDate() ;
      AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = "" ;
      AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin = "" ;
      AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = "" ;
      AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = "" ;
      AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = "" ;
      AV155Formulaciontinte_consultadesdelcontids_14_tfclinom = "" ;
      AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = "" ;
      AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin = "" ;
      AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = "" ;
      AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin = "" ;
      AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = "" ;
      AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = "" ;
      AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = DecimalUtil.ZERO ;
      AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = DecimalUtil.ZERO ;
      AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = DecimalUtil.ZERO ;
      AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = DecimalUtil.ZERO ;
      AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = DecimalUtil.ZERO ;
      AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = DecimalUtil.ZERO ;
      AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = DecimalUtil.ZERO ;
      AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = DecimalUtil.ZERO ;
      AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = "" ;
      AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = "" ;
      AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = "" ;
      AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli = "" ;
      AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = DecimalUtil.ZERO ;
      AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = DecimalUtil.ZERO ;
      AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = DecimalUtil.ZERO ;
      AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = "" ;
      AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind = "" ;
      H015C2_A494ForSer = new String[] {""} ;
      H015C2_A482ForColNom = new String[] {""} ;
      H015C2_A483ForColNum = new int[1] ;
      H015C2_A831TipColCod = new byte[1] ;
      H015C2_A829TipArtCod = new short[1] ;
      H015C2_A3646EstTinAny = new short[1] ;
      H015C2_A3647EstTinMes = new byte[1] ;
      H015C2_A3648EstTinDia = new byte[1] ;
      H015C2_A6634BarRecAcb = new String[] {""} ;
      H015C2_n6634BarRecAcb = new boolean[] {false} ;
      H015C2_A396EmprCod = new String[] {""} ;
      H015C2_A14200CosteAnyad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C2_A3650BarNumAna = new short[1] ;
      H015C2_n3650BarNumAna = new boolean[] {false} ;
      H015C2_A11762BarDispCli = new String[] {""} ;
      H015C2_n11762BarDispCli = new boolean[] {false} ;
      H015C2_A1946BarVolTin = new int[1] ;
      H015C2_n1946BarVolTin = new boolean[] {false} ;
      H015C2_A1945BarMaqTin = new String[] {""} ;
      H015C2_n1945BarMaqTin = new boolean[] {false} ;
      H015C2_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C2_n12993BarMtsTt = new boolean[] {false} ;
      H015C2_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C2_n1948BarMtrTin = new boolean[] {false} ;
      H015C2_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C2_n8563BarKgsTt = new boolean[] {false} ;
      H015C2_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C2_n1947BarKgmTin = new boolean[] {false} ;
      H015C2_A1942BarTipCoT = new byte[1] ;
      H015C2_n1942BarTipCoT = new boolean[] {false} ;
      H015C2_A1941BarColNuT = new int[1] ;
      H015C2_n1941BarColNuT = new boolean[] {false} ;
      H015C2_A1940BarColNoT = new String[] {""} ;
      H015C2_n1940BarColNoT = new boolean[] {false} ;
      H015C2_A1939BarArtTin = new short[1] ;
      H015C2_n1939BarArtTin = new boolean[] {false} ;
      H015C2_A1937BarDscTin = new String[] {""} ;
      H015C2_n1937BarDscTin = new boolean[] {false} ;
      H015C2_A1936BarSerTin = new String[] {""} ;
      H015C2_n1936BarSerTin = new boolean[] {false} ;
      H015C2_A279CliNom = new String[] {""} ;
      H015C2_A252CliCod = new int[1] ;
      H015C2_A1929EstTinNr = new short[1] ;
      H015C2_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      H015C2_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C2_n3656BarCosAD = new boolean[] {false} ;
      H015C2_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C2_n3657BarCosAA = new boolean[] {false} ;
      H015C2_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C2_n3706BarCosAnc = new boolean[] {false} ;
      H015C2_A13967BarNumEny = new int[1] ;
      H015C2_n13967BarNumEny = new boolean[] {false} ;
      H015C2_A13962BarArtTinD = new String[] {""} ;
      H015C2_n13962BarArtTinD = new boolean[] {false} ;
      H015C2_A1935BarParTin = new String[] {""} ;
      H015C2_n1935BarParTin = new boolean[] {false} ;
      H015C2_A1934BarReoTin = new byte[1] ;
      H015C2_n1934BarReoTin = new boolean[] {false} ;
      H015C2_A1933BarCodTin = new int[1] ;
      H015C2_n1933BarCodTin = new boolean[] {false} ;
      H015C2_A2316BarAgrLot = new String[] {""} ;
      H015C2_n2316BarAgrLot = new boolean[] {false} ;
      H015C2_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C2_n3705BarCosCol = new boolean[] {false} ;
      H015C2_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C2_n3658BarCosPA = new boolean[] {false} ;
      H015C2_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C2_n3654BarCosPD = new boolean[] {false} ;
      H015C3_AGRID_nRecordCount = new long[1] ;
      AV104TotValueBarKgmTin = "" ;
      AV105TotValueBarMtrTin = "" ;
      AV117TotValueBarNumtint = "" ;
      AV127TotValueCosteInicial = "" ;
      AV129TotValueCosteAnyadidas = "" ;
      hsh = "" ;
      AV139Station = "" ;
      AV140Emprnom = "" ;
      AV141Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV52Session = httpContext.getWebSession();
      AV48ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV46ExcelFilename = "" ;
      AV47ErrorMessage = "" ;
      AV49UserCustomValue = "" ;
      AV51ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
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
      GXt_char12 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char11 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char10 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV30TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV29HTTPRequest = httpContext.getHttpRequest();
      H015C4_A494ForSer = new String[] {""} ;
      H015C4_A482ForColNom = new String[] {""} ;
      H015C4_A483ForColNum = new int[1] ;
      H015C4_A831TipColCod = new byte[1] ;
      H015C4_A829TipArtCod = new short[1] ;
      H015C4_A3646EstTinAny = new short[1] ;
      H015C4_A3647EstTinMes = new byte[1] ;
      H015C4_A3648EstTinDia = new byte[1] ;
      H015C4_A6634BarRecAcb = new String[] {""} ;
      H015C4_n6634BarRecAcb = new boolean[] {false} ;
      H015C4_A396EmprCod = new String[] {""} ;
      H015C4_A14200CosteAnyad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C4_A3650BarNumAna = new short[1] ;
      H015C4_n3650BarNumAna = new boolean[] {false} ;
      H015C4_A11762BarDispCli = new String[] {""} ;
      H015C4_n11762BarDispCli = new boolean[] {false} ;
      H015C4_A1946BarVolTin = new int[1] ;
      H015C4_n1946BarVolTin = new boolean[] {false} ;
      H015C4_A1945BarMaqTin = new String[] {""} ;
      H015C4_n1945BarMaqTin = new boolean[] {false} ;
      H015C4_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C4_n12993BarMtsTt = new boolean[] {false} ;
      H015C4_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C4_n1948BarMtrTin = new boolean[] {false} ;
      H015C4_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C4_n8563BarKgsTt = new boolean[] {false} ;
      H015C4_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C4_n1947BarKgmTin = new boolean[] {false} ;
      H015C4_A1942BarTipCoT = new byte[1] ;
      H015C4_n1942BarTipCoT = new boolean[] {false} ;
      H015C4_A1941BarColNuT = new int[1] ;
      H015C4_n1941BarColNuT = new boolean[] {false} ;
      H015C4_A1940BarColNoT = new String[] {""} ;
      H015C4_n1940BarColNoT = new boolean[] {false} ;
      H015C4_A1939BarArtTin = new short[1] ;
      H015C4_n1939BarArtTin = new boolean[] {false} ;
      H015C4_A1937BarDscTin = new String[] {""} ;
      H015C4_n1937BarDscTin = new boolean[] {false} ;
      H015C4_A1936BarSerTin = new String[] {""} ;
      H015C4_n1936BarSerTin = new boolean[] {false} ;
      H015C4_A279CliNom = new String[] {""} ;
      H015C4_A252CliCod = new int[1] ;
      H015C4_A1929EstTinNr = new short[1] ;
      H015C4_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      H015C4_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C4_n3656BarCosAD = new boolean[] {false} ;
      H015C4_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C4_n3657BarCosAA = new boolean[] {false} ;
      H015C4_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C4_n3706BarCosAnc = new boolean[] {false} ;
      H015C4_A13967BarNumEny = new int[1] ;
      H015C4_n13967BarNumEny = new boolean[] {false} ;
      H015C4_A13962BarArtTinD = new String[] {""} ;
      H015C4_n13962BarArtTinD = new boolean[] {false} ;
      H015C4_A1935BarParTin = new String[] {""} ;
      H015C4_n1935BarParTin = new boolean[] {false} ;
      H015C4_A1934BarReoTin = new byte[1] ;
      H015C4_n1934BarReoTin = new boolean[] {false} ;
      H015C4_A1933BarCodTin = new int[1] ;
      H015C4_n1933BarCodTin = new boolean[] {false} ;
      H015C4_A2316BarAgrLot = new String[] {""} ;
      H015C4_n2316BarAgrLot = new boolean[] {false} ;
      H015C4_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C4_n3705BarCosCol = new boolean[] {false} ;
      H015C4_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C4_n3658BarCosPA = new boolean[] {false} ;
      H015C4_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015C4_n3654BarCosPD = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7Emprcod = "" ;
      sCtrlAV8Fec1 = "" ;
      sCtrlAV9Fec3 = "" ;
      sCtrlAV10PCliCod = "" ;
      sCtrlAV11CliCodP = "" ;
      sCtrlAV12PBarCod = "" ;
      sCtrlAV13Barcodp = "" ;
      sCtrlAV14PBarCodReo = "" ;
      sCtrlAV15BarCodReoP = "" ;
      sCtrlAV16PBarCodPar = "" ;
      sCtrlAV17BarCodParP = "" ;
      sCtrlAV18PSerie = "" ;
      sCtrlAV19SerieP = "" ;
      sCtrlAV20PColor = "" ;
      sCtrlAV21ColorP = "" ;
      sCtrlAV22PColNum = "" ;
      sCtrlAV23ColNumP = "" ;
      sCtrlAV24DispCli1 = "" ;
      sCtrlAV25DispCli3 = "" ;
      sCtrlAV26HreRacab = "" ;
      sCtrlAV27MaqCodi = "" ;
      sCtrlAV28MaqCod3 = "" ;
      sCtrlAV118TipArtCodfrom = "" ;
      sCtrlAV119TipArtCodto = "" ;
      sCtrlAV120SoloAd = "" ;
      sCtrlAV121CorAdi = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consultadesdelconti__default(),
         new Object[] {
             new Object[] {
            H015C2_A494ForSer, H015C2_A482ForColNom, H015C2_A483ForColNum, H015C2_A831TipColCod, H015C2_A829TipArtCod, H015C2_A3646EstTinAny, H015C2_A3647EstTinMes, H015C2_A3648EstTinDia, H015C2_A6634BarRecAcb, H015C2_n6634BarRecAcb,
            H015C2_A396EmprCod, H015C2_A14200CosteAnyad, H015C2_A3650BarNumAna, H015C2_n3650BarNumAna, H015C2_A11762BarDispCli, H015C2_n11762BarDispCli, H015C2_A1946BarVolTin, H015C2_n1946BarVolTin, H015C2_A1945BarMaqTin, H015C2_n1945BarMaqTin,
            H015C2_A12993BarMtsTt, H015C2_n12993BarMtsTt, H015C2_A1948BarMtrTin, H015C2_n1948BarMtrTin, H015C2_A8563BarKgsTt, H015C2_n8563BarKgsTt, H015C2_A1947BarKgmTin, H015C2_n1947BarKgmTin, H015C2_A1942BarTipCoT, H015C2_n1942BarTipCoT,
            H015C2_A1941BarColNuT, H015C2_n1941BarColNuT, H015C2_A1940BarColNoT, H015C2_n1940BarColNoT, H015C2_A1939BarArtTin, H015C2_n1939BarArtTin, H015C2_A1937BarDscTin, H015C2_n1937BarDscTin, H015C2_A1936BarSerTin, H015C2_n1936BarSerTin,
            H015C2_A279CliNom, H015C2_A252CliCod, H015C2_A1929EstTinNr, H015C2_A13759EstFecCier, H015C2_A3656BarCosAD, H015C2_n3656BarCosAD, H015C2_A3657BarCosAA, H015C2_n3657BarCosAA, H015C2_A3706BarCosAnc, H015C2_n3706BarCosAnc,
            H015C2_A13967BarNumEny, H015C2_n13967BarNumEny, H015C2_A13962BarArtTinD, H015C2_n13962BarArtTinD, H015C2_A1935BarParTin, H015C2_n1935BarParTin, H015C2_A1934BarReoTin, H015C2_n1934BarReoTin, H015C2_A1933BarCodTin, H015C2_n1933BarCodTin,
            H015C2_A2316BarAgrLot, H015C2_n2316BarAgrLot, H015C2_A3705BarCosCol, H015C2_n3705BarCosCol, H015C2_A3658BarCosPA, H015C2_n3658BarCosPA, H015C2_A3654BarCosPD, H015C2_n3654BarCosPD
            }
            , new Object[] {
            H015C3_AGRID_nRecordCount
            }
            , new Object[] {
            H015C4_A494ForSer, H015C4_A482ForColNom, H015C4_A483ForColNum, H015C4_A831TipColCod, H015C4_A829TipArtCod, H015C4_A3646EstTinAny, H015C4_A3647EstTinMes, H015C4_A3648EstTinDia, H015C4_A6634BarRecAcb, H015C4_n6634BarRecAcb,
            H015C4_A396EmprCod, H015C4_A14200CosteAnyad, H015C4_A3650BarNumAna, H015C4_n3650BarNumAna, H015C4_A11762BarDispCli, H015C4_n11762BarDispCli, H015C4_A1946BarVolTin, H015C4_n1946BarVolTin, H015C4_A1945BarMaqTin, H015C4_n1945BarMaqTin,
            H015C4_A12993BarMtsTt, H015C4_n12993BarMtsTt, H015C4_A1948BarMtrTin, H015C4_n1948BarMtrTin, H015C4_A8563BarKgsTt, H015C4_n8563BarKgsTt, H015C4_A1947BarKgmTin, H015C4_n1947BarKgmTin, H015C4_A1942BarTipCoT, H015C4_n1942BarTipCoT,
            H015C4_A1941BarColNuT, H015C4_n1941BarColNuT, H015C4_A1940BarColNoT, H015C4_n1940BarColNoT, H015C4_A1939BarArtTin, H015C4_n1939BarArtTin, H015C4_A1937BarDscTin, H015C4_n1937BarDscTin, H015C4_A1936BarSerTin, H015C4_n1936BarSerTin,
            H015C4_A279CliNom, H015C4_A252CliCod, H015C4_A1929EstTinNr, H015C4_A13759EstFecCier, H015C4_A3656BarCosAD, H015C4_n3656BarCosAD, H015C4_A3657BarCosAA, H015C4_n3657BarCosAA, H015C4_A3706BarCosAnc, H015C4_n3706BarCosAnc,
            H015C4_A13967BarNumEny, H015C4_n13967BarNumEny, H015C4_A13962BarArtTinD, H015C4_n13962BarArtTinD, H015C4_A1935BarParTin, H015C4_n1935BarParTin, H015C4_A1934BarReoTin, H015C4_n1934BarReoTin, H015C4_A1933BarCodTin, H015C4_n1933BarCodTin,
            H015C4_A2316BarAgrLot, H015C4_n2316BarAgrLot, H015C4_A3705BarCosCol, H015C4_n3705BarCosCol, H015C4_A3658BarCosPA, H015C4_n3658BarCosPA, H015C4_A3654BarCosPD, H015C4_n3654BarCosPD
            }
         }
      );
      AV138Pgmname = "FormulacionTinte.ConsultadesdeLconti" ;
      /* GeneXus formulas. */
      AV138Pgmname = "FormulacionTinte.ConsultadesdeLconti" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavMarca_Enabled = 0 ;
      edtavCostekg_Enabled = 0 ;
      edtavCostemt_Enabled = 0 ;
      edtavTotvaluebarkgmtin_Enabled = 0 ;
      edtavTotvaluebarmtrtin_Enabled = 0 ;
      edtavTotvaluebarnumtint_Enabled = 0 ;
      edtavTotvaluecosteinicial_Enabled = 0 ;
      edtavTotvaluecosteanyadidas_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV14PBarCodReo ;
   private byte wcpOAV15BarCodReoP ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV14PBarCodReo ;
   private byte AV15BarCodReoP ;
   private byte AV132TFBarReoTin ;
   private byte AV133TFBarReoTin_To ;
   private byte AV78TFBarTipCoT ;
   private byte AV79TFBarTipCoT_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV44BarCodReo ;
   private byte A1934BarReoTin ;
   private byte A1942BarTipCoT ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin ;
   private byte AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ;
   private byte AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot ;
   private byte AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV118TipArtCodfrom ;
   private short wcpOAV119TipArtCodto ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV118TipArtCodfrom ;
   private short AV119TipArtCodto ;
   private short AV60TFEstTinNr ;
   private short AV61TFEstTinNr_To ;
   private short AV106TFBarArtTin ;
   private short AV107TFBarArtTin_To ;
   private short AV114TFBarNumtint ;
   private short AV115TFBarNumtint_To ;
   private short AV94TFBarNumAna ;
   private short AV95TFBarNumAna_To ;
   private short AV34OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A1929EstTinNr ;
   private short A1939BarArtTin ;
   private short A13975BarNumtint ;
   private short A3650BarNumAna ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr ;
   private short AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ;
   private short AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin ;
   private short AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ;
   private short AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ;
   private short AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ;
   private short AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana ;
   private short AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ;
   private int wcpOAV10PCliCod ;
   private int wcpOAV11CliCodP ;
   private int wcpOAV12PBarCod ;
   private int wcpOAV13Barcodp ;
   private int wcpOAV22PColNum ;
   private int wcpOAV23ColNumP ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_34 ;
   private int AV10PCliCod ;
   private int AV11CliCodP ;
   private int AV12PBarCod ;
   private int AV13Barcodp ;
   private int AV22PColNum ;
   private int AV23ColNumP ;
   private int nGXsfl_34_idx=1 ;
   private int AV130TFBarCodTin ;
   private int AV131TFBarCodTin_To ;
   private int AV66TFCliCod ;
   private int AV67TFCliCod_To ;
   private int AV76TFBarColNuT ;
   private int AV77TFBarColNuT_To ;
   private int AV90TFBarVolTin ;
   private int AV91TFBarVolTin_To ;
   private int AV110TFBarNumEny ;
   private int AV111TFBarNumEny_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int AV43BarCod ;
   private int A1933BarCodTin ;
   private int A252CliCod ;
   private int A1941BarColNuT ;
   private int A1946BarVolTin ;
   private int A13967BarNumEny ;
   private int subGrid_Islastpage ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavMarca_Enabled ;
   private int edtavCostekg_Enabled ;
   private int edtavCostemt_Enabled ;
   private int edtavTotvaluebarkgmtin_Enabled ;
   private int edtavTotvaluebarmtrtin_Enabled ;
   private int edtavTotvaluebarnumtint_Enabled ;
   private int edtavTotvaluecosteinicial_Enabled ;
   private int edtavTotvaluecosteanyadidas_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ;
   private int AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ;
   private int AV153Formulaciontinte_consultadesdelcontids_12_tfclicod ;
   private int AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to ;
   private int AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ;
   private int AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ;
   private int AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ;
   private int AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ;
   private int AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ;
   private int AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ;
   private int edtEstFecCier_Visible ;
   private int edtEstTinNr_Visible ;
   private int edtavMarca_Visible ;
   private int edtBarCodTin_Visible ;
   private int edtBarReoTin_Visible ;
   private int edtBarParTin_Visible ;
   private int edtBarAgrLot_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtBarSerTin_Visible ;
   private int edtBarDscTin_Visible ;
   private int edtBarArtTin_Visible ;
   private int edtBarArtTinD_Visible ;
   private int edtBarColNoT_Visible ;
   private int edtBarColNuT_Visible ;
   private int edtBarTipCoT_Visible ;
   private int edtBarKgmTin_Visible ;
   private int edtBarKgsTt_Visible ;
   private int edtBarMtrTin_Visible ;
   private int edtBarNumtint_Visible ;
   private int edtBarMtsTt_Visible ;
   private int edtBarMaqTin_Visible ;
   private int edtBarVolTin_Visible ;
   private int edtBarNumEny_Visible ;
   private int edtBarDispCli_Visible ;
   private int edtBarNumAna_Visible ;
   private int edtCosteInici_Visible ;
   private int edtCosteAnyad_Visible ;
   private int edtavCostekg_Visible ;
   private int edtavCostemt_Visible ;
   private int AV97PageToGo ;
   private int AV195GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavBarcod_Visible ;
   private int edtavBarcodreo_Visible ;
   private int edtavBarcodpar_Visible ;
   private int edtavDetailwebcomponent_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV116TotBarNumtint ;
   private long AV98GridCurrentPage ;
   private long AV99GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV80TFBarKgmTin ;
   private java.math.BigDecimal AV81TFBarKgmTin_To ;
   private java.math.BigDecimal AV82TFBarKgsTt ;
   private java.math.BigDecimal AV83TFBarKgsTt_To ;
   private java.math.BigDecimal AV84TFBarMtrTin ;
   private java.math.BigDecimal AV85TFBarMtrTin_To ;
   private java.math.BigDecimal AV86TFBarMtsTt ;
   private java.math.BigDecimal AV87TFBarMtsTt_To ;
   private java.math.BigDecimal AV122TFCosteInicial ;
   private java.math.BigDecimal AV123TFCosteInicial_To ;
   private java.math.BigDecimal AV124TFCosteAnyadidas ;
   private java.math.BigDecimal AV125TFCosteAnyadidas_To ;
   private java.math.BigDecimal AV100TotBarKgmTin ;
   private java.math.BigDecimal AV101TotBarMtrTin ;
   private java.math.BigDecimal AV126TotCosteInicial ;
   private java.math.BigDecimal AV128TotCosteAnyadidas ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal A3654BarCosPD ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A1948BarMtrTin ;
   private java.math.BigDecimal A12993BarMtsTt ;
   private java.math.BigDecimal A14199CosteInici ;
   private java.math.BigDecimal A14200CosteAnyad ;
   private java.math.BigDecimal AV41CosteKg ;
   private java.math.BigDecimal AV42CosteMT ;
   private java.math.BigDecimal AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ;
   private java.math.BigDecimal AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ;
   private java.math.BigDecimal AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ;
   private java.math.BigDecimal AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ;
   private java.math.BigDecimal AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ;
   private java.math.BigDecimal AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ;
   private java.math.BigDecimal AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ;
   private java.math.BigDecimal AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ;
   private java.math.BigDecimal AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ;
   private java.math.BigDecimal AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ;
   private java.math.BigDecimal AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ;
   private java.math.BigDecimal AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3657BarCosAA ;
   private String wcpOAV7Emprcod ;
   private String wcpOAV16PBarCodPar ;
   private String wcpOAV17BarCodParP ;
   private String wcpOAV18PSerie ;
   private String wcpOAV19SerieP ;
   private String wcpOAV20PColor ;
   private String wcpOAV21ColorP ;
   private String wcpOAV24DispCli1 ;
   private String wcpOAV25DispCli3 ;
   private String wcpOAV26HreRacab ;
   private String wcpOAV27MaqCodi ;
   private String wcpOAV28MaqCod3 ;
   private String wcpOAV120SoloAd ;
   private String wcpOAV121CorAdi ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV7Emprcod ;
   private String AV16PBarCodPar ;
   private String AV17BarCodParP ;
   private String AV18PSerie ;
   private String AV19SerieP ;
   private String AV20PColor ;
   private String AV21ColorP ;
   private String AV24DispCli1 ;
   private String AV25DispCli3 ;
   private String AV26HreRacab ;
   private String AV27MaqCodi ;
   private String AV28MaqCod3 ;
   private String AV120SoloAd ;
   private String AV121CorAdi ;
   private String sGXsfl_34_idx="0001" ;
   private String AV134TFBarParTin ;
   private String AV135TFBarParTin_Sel ;
   private String AV64TFBarAgrLot ;
   private String AV65TFBarAgrLot_Sel ;
   private String AV68TFCliNom ;
   private String AV69TFCliNom_Sel ;
   private String AV70TFBarSerTin ;
   private String AV71TFBarSerTin_Sel ;
   private String AV72TFBarDscTin ;
   private String AV73TFBarDscTin_Sel ;
   private String AV108TFBarArtTinD ;
   private String AV109TFBarArtTinD_Sel ;
   private String AV74TFBarColNoT ;
   private String AV75TFBarColNoT_Sel ;
   private String AV88TFBarMaqTin ;
   private String AV89TFBarMaqTin_Sel ;
   private String AV92TFBarDispCli ;
   private String AV93TFBarDispCli_Sel ;
   private String AV138Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A6634BarRecAcb ;
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
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_estfeccierauxdates_Internalname ;
   private String edtavDdo_estfeccierauxdate_Internalname ;
   private String edtavDdo_estfeccierauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcodreo_Internalname ;
   private String AV45BarCodPar ;
   private String edtavBarcodpar_Internalname ;
   private String AV103DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String edtEstFecCier_Internalname ;
   private String edtEstTinNr_Internalname ;
   private String AV113Marca ;
   private String edtavMarca_Internalname ;
   private String edtBarCodTin_Internalname ;
   private String edtBarReoTin_Internalname ;
   private String A1935BarParTin ;
   private String edtBarParTin_Internalname ;
   private String A13841Barnhdr_lc ;
   private String edtBarnhdr_lc_Internalname ;
   private String A2316BarAgrLot ;
   private String edtBarAgrLot_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A1936BarSerTin ;
   private String edtBarSerTin_Internalname ;
   private String A1937BarDscTin ;
   private String edtBarDscTin_Internalname ;
   private String edtBarArtTin_Internalname ;
   private String A13962BarArtTinD ;
   private String edtBarArtTinD_Internalname ;
   private String A1940BarColNoT ;
   private String edtBarColNoT_Internalname ;
   private String edtBarColNuT_Internalname ;
   private String edtBarTipCoT_Internalname ;
   private String edtBarKgmTin_Internalname ;
   private String edtBarKgsTt_Internalname ;
   private String edtBarMtrTin_Internalname ;
   private String edtBarNumtint_Internalname ;
   private String edtBarMtsTt_Internalname ;
   private String A1945BarMaqTin ;
   private String edtBarMaqTin_Internalname ;
   private String edtBarVolTin_Internalname ;
   private String edtBarNumEny_Internalname ;
   private String A11762BarDispCli ;
   private String edtBarDispCli_Internalname ;
   private String edtBarNumAna_Internalname ;
   private String edtCosteInici_Internalname ;
   private String edtCosteAnyad_Internalname ;
   private String edtavCostekg_Internalname ;
   private String edtavCostemt_Internalname ;
   private String edtavTotvaluebarkgmtin_Internalname ;
   private String edtavTotvaluebarmtrtin_Internalname ;
   private String edtavTotvaluebarnumtint_Internalname ;
   private String edtavTotvaluecosteinicial_Internalname ;
   private String edtavTotvaluecosteanyadidas_Internalname ;
   private String scmdbuf ;
   private String lV163Formulaciontinte_consultadesdelcontids_22_tfbararttind ;
   private String lV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin ;
   private String lV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ;
   private String lV155Formulaciontinte_consultadesdelcontids_14_tfclinom ;
   private String lV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin ;
   private String lV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin ;
   private String lV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ;
   private String lV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ;
   private String lV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli ;
   private String AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ;
   private String AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin ;
   private String AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ;
   private String AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ;
   private String AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ;
   private String AV155Formulaciontinte_consultadesdelcontids_14_tfclinom ;
   private String AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ;
   private String AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin ;
   private String AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ;
   private String AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin ;
   private String AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ;
   private String AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ;
   private String AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ;
   private String AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ;
   private String AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ;
   private String AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli ;
   private String AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ;
   private String AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind ;
   private String hsh ;
   private String AV139Station ;
   private String AV140Emprnom ;
   private String AV141Usurcod ;
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
   private String GXt_char12 ;
   private String GXv_char13[] ;
   private String GXt_char11 ;
   private String GXv_char4[] ;
   private String GXt_char10 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluebarkgmtin_Jsonclick ;
   private String edtavTotvaluebarmtrtin_Jsonclick ;
   private String edtavTotvaluebarnumtint_Jsonclick ;
   private String edtavTotvaluecosteinicial_Jsonclick ;
   private String edtavTotvaluecosteanyadidas_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV7Emprcod ;
   private String sCtrlAV8Fec1 ;
   private String sCtrlAV9Fec3 ;
   private String sCtrlAV10PCliCod ;
   private String sCtrlAV11CliCodP ;
   private String sCtrlAV12PBarCod ;
   private String sCtrlAV13Barcodp ;
   private String sCtrlAV14PBarCodReo ;
   private String sCtrlAV15BarCodReoP ;
   private String sCtrlAV16PBarCodPar ;
   private String sCtrlAV17BarCodParP ;
   private String sCtrlAV18PSerie ;
   private String sCtrlAV19SerieP ;
   private String sCtrlAV20PColor ;
   private String sCtrlAV21ColorP ;
   private String sCtrlAV22PColNum ;
   private String sCtrlAV23ColNumP ;
   private String sCtrlAV24DispCli1 ;
   private String sCtrlAV25DispCli3 ;
   private String sCtrlAV26HreRacab ;
   private String sCtrlAV27MaqCodi ;
   private String sCtrlAV28MaqCod3 ;
   private String sCtrlAV118TipArtCodfrom ;
   private String sCtrlAV119TipArtCodto ;
   private String sCtrlAV120SoloAd ;
   private String sCtrlAV121CorAdi ;
   private String sGXsfl_34_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtEstFecCier_Jsonclick ;
   private String edtEstTinNr_Jsonclick ;
   private String edtavMarca_Jsonclick ;
   private String edtBarCodTin_Jsonclick ;
   private String edtBarReoTin_Jsonclick ;
   private String edtBarParTin_Jsonclick ;
   private String edtBarnhdr_lc_Jsonclick ;
   private String edtBarAgrLot_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarSerTin_Jsonclick ;
   private String edtBarDscTin_Jsonclick ;
   private String edtBarArtTin_Jsonclick ;
   private String edtBarArtTinD_Jsonclick ;
   private String edtBarColNoT_Jsonclick ;
   private String edtBarColNuT_Jsonclick ;
   private String edtBarTipCoT_Jsonclick ;
   private String edtBarKgmTin_Jsonclick ;
   private String edtBarKgsTt_Jsonclick ;
   private String edtBarMtrTin_Jsonclick ;
   private String edtBarNumtint_Jsonclick ;
   private String edtBarMtsTt_Jsonclick ;
   private String edtBarMaqTin_Jsonclick ;
   private String edtBarVolTin_Jsonclick ;
   private String edtBarNumEny_Jsonclick ;
   private String edtBarDispCli_Jsonclick ;
   private String edtBarNumAna_Jsonclick ;
   private String edtCosteInici_Jsonclick ;
   private String edtCosteAnyad_Jsonclick ;
   private String edtavCostekg_Jsonclick ;
   private String edtavCostemt_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV8Fec1 ;
   private java.util.Date wcpOAV9Fec3 ;
   private java.util.Date AV8Fec1 ;
   private java.util.Date AV9Fec3 ;
   private java.util.Date AV56TFEstFecCier ;
   private java.util.Date AV58DDO_EstFecCierAuxDate ;
   private java.util.Date A13759EstFecCier ;
   private java.util.Date AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV35OrderedDsc ;
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
   private boolean bGXsfl_34_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n1933BarCodTin ;
   private boolean n1934BarReoTin ;
   private boolean n1935BarParTin ;
   private boolean n2316BarAgrLot ;
   private boolean n1936BarSerTin ;
   private boolean n1937BarDscTin ;
   private boolean n1939BarArtTin ;
   private boolean n13962BarArtTinD ;
   private boolean n1940BarColNoT ;
   private boolean n1941BarColNuT ;
   private boolean n1942BarTipCoT ;
   private boolean n1947BarKgmTin ;
   private boolean n8563BarKgsTt ;
   private boolean n1948BarMtrTin ;
   private boolean n12993BarMtsTt ;
   private boolean n1945BarMaqTin ;
   private boolean n1946BarVolTin ;
   private boolean n13967BarNumEny ;
   private boolean n11762BarDispCli ;
   private boolean n3650BarNumAna ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n6634BarRecAcb ;
   private boolean n3656BarCosAD ;
   private boolean n3657BarCosAA ;
   private boolean n3706BarCosAnc ;
   private boolean n3705BarCosCol ;
   private boolean n3658BarCosPA ;
   private boolean n3654BarCosPD ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV48ColumnsSelectorXML ;
   private String AV49UserCustomValue ;
   private String AV104TotValueBarKgmTin ;
   private String AV105TotValueBarMtrTin ;
   private String AV117TotValueBarNumtint ;
   private String AV127TotValueCosteInicial ;
   private String AV129TotValueCosteAnyadidas ;
   private String AV46ExcelFilename ;
   private String AV47ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV29HTTPRequest ;
   private com.genexus.webpanels.WebSession AV52Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H015C2_A494ForSer ;
   private String[] H015C2_A482ForColNom ;
   private int[] H015C2_A483ForColNum ;
   private byte[] H015C2_A831TipColCod ;
   private short[] H015C2_A829TipArtCod ;
   private short[] H015C2_A3646EstTinAny ;
   private byte[] H015C2_A3647EstTinMes ;
   private byte[] H015C2_A3648EstTinDia ;
   private String[] H015C2_A6634BarRecAcb ;
   private boolean[] H015C2_n6634BarRecAcb ;
   private String[] H015C2_A396EmprCod ;
   private java.math.BigDecimal[] H015C2_A14200CosteAnyad ;
   private short[] H015C2_A3650BarNumAna ;
   private boolean[] H015C2_n3650BarNumAna ;
   private String[] H015C2_A11762BarDispCli ;
   private boolean[] H015C2_n11762BarDispCli ;
   private int[] H015C2_A1946BarVolTin ;
   private boolean[] H015C2_n1946BarVolTin ;
   private String[] H015C2_A1945BarMaqTin ;
   private boolean[] H015C2_n1945BarMaqTin ;
   private java.math.BigDecimal[] H015C2_A12993BarMtsTt ;
   private boolean[] H015C2_n12993BarMtsTt ;
   private java.math.BigDecimal[] H015C2_A1948BarMtrTin ;
   private boolean[] H015C2_n1948BarMtrTin ;
   private java.math.BigDecimal[] H015C2_A8563BarKgsTt ;
   private boolean[] H015C2_n8563BarKgsTt ;
   private java.math.BigDecimal[] H015C2_A1947BarKgmTin ;
   private boolean[] H015C2_n1947BarKgmTin ;
   private byte[] H015C2_A1942BarTipCoT ;
   private boolean[] H015C2_n1942BarTipCoT ;
   private int[] H015C2_A1941BarColNuT ;
   private boolean[] H015C2_n1941BarColNuT ;
   private String[] H015C2_A1940BarColNoT ;
   private boolean[] H015C2_n1940BarColNoT ;
   private short[] H015C2_A1939BarArtTin ;
   private boolean[] H015C2_n1939BarArtTin ;
   private String[] H015C2_A1937BarDscTin ;
   private boolean[] H015C2_n1937BarDscTin ;
   private String[] H015C2_A1936BarSerTin ;
   private boolean[] H015C2_n1936BarSerTin ;
   private String[] H015C2_A279CliNom ;
   private int[] H015C2_A252CliCod ;
   private short[] H015C2_A1929EstTinNr ;
   private java.util.Date[] H015C2_A13759EstFecCier ;
   private java.math.BigDecimal[] H015C2_A3656BarCosAD ;
   private boolean[] H015C2_n3656BarCosAD ;
   private java.math.BigDecimal[] H015C2_A3657BarCosAA ;
   private boolean[] H015C2_n3657BarCosAA ;
   private java.math.BigDecimal[] H015C2_A3706BarCosAnc ;
   private boolean[] H015C2_n3706BarCosAnc ;
   private int[] H015C2_A13967BarNumEny ;
   private boolean[] H015C2_n13967BarNumEny ;
   private String[] H015C2_A13962BarArtTinD ;
   private boolean[] H015C2_n13962BarArtTinD ;
   private String[] H015C2_A1935BarParTin ;
   private boolean[] H015C2_n1935BarParTin ;
   private byte[] H015C2_A1934BarReoTin ;
   private boolean[] H015C2_n1934BarReoTin ;
   private int[] H015C2_A1933BarCodTin ;
   private boolean[] H015C2_n1933BarCodTin ;
   private String[] H015C2_A2316BarAgrLot ;
   private boolean[] H015C2_n2316BarAgrLot ;
   private java.math.BigDecimal[] H015C2_A3705BarCosCol ;
   private boolean[] H015C2_n3705BarCosCol ;
   private java.math.BigDecimal[] H015C2_A3658BarCosPA ;
   private boolean[] H015C2_n3658BarCosPA ;
   private java.math.BigDecimal[] H015C2_A3654BarCosPD ;
   private boolean[] H015C2_n3654BarCosPD ;
   private long[] H015C3_AGRID_nRecordCount ;
   private String[] H015C4_A494ForSer ;
   private String[] H015C4_A482ForColNom ;
   private int[] H015C4_A483ForColNum ;
   private byte[] H015C4_A831TipColCod ;
   private short[] H015C4_A829TipArtCod ;
   private short[] H015C4_A3646EstTinAny ;
   private byte[] H015C4_A3647EstTinMes ;
   private byte[] H015C4_A3648EstTinDia ;
   private String[] H015C4_A6634BarRecAcb ;
   private boolean[] H015C4_n6634BarRecAcb ;
   private String[] H015C4_A396EmprCod ;
   private java.math.BigDecimal[] H015C4_A14200CosteAnyad ;
   private short[] H015C4_A3650BarNumAna ;
   private boolean[] H015C4_n3650BarNumAna ;
   private String[] H015C4_A11762BarDispCli ;
   private boolean[] H015C4_n11762BarDispCli ;
   private int[] H015C4_A1946BarVolTin ;
   private boolean[] H015C4_n1946BarVolTin ;
   private String[] H015C4_A1945BarMaqTin ;
   private boolean[] H015C4_n1945BarMaqTin ;
   private java.math.BigDecimal[] H015C4_A12993BarMtsTt ;
   private boolean[] H015C4_n12993BarMtsTt ;
   private java.math.BigDecimal[] H015C4_A1948BarMtrTin ;
   private boolean[] H015C4_n1948BarMtrTin ;
   private java.math.BigDecimal[] H015C4_A8563BarKgsTt ;
   private boolean[] H015C4_n8563BarKgsTt ;
   private java.math.BigDecimal[] H015C4_A1947BarKgmTin ;
   private boolean[] H015C4_n1947BarKgmTin ;
   private byte[] H015C4_A1942BarTipCoT ;
   private boolean[] H015C4_n1942BarTipCoT ;
   private int[] H015C4_A1941BarColNuT ;
   private boolean[] H015C4_n1941BarColNuT ;
   private String[] H015C4_A1940BarColNoT ;
   private boolean[] H015C4_n1940BarColNoT ;
   private short[] H015C4_A1939BarArtTin ;
   private boolean[] H015C4_n1939BarArtTin ;
   private String[] H015C4_A1937BarDscTin ;
   private boolean[] H015C4_n1937BarDscTin ;
   private String[] H015C4_A1936BarSerTin ;
   private boolean[] H015C4_n1936BarSerTin ;
   private String[] H015C4_A279CliNom ;
   private int[] H015C4_A252CliCod ;
   private short[] H015C4_A1929EstTinNr ;
   private java.util.Date[] H015C4_A13759EstFecCier ;
   private java.math.BigDecimal[] H015C4_A3656BarCosAD ;
   private boolean[] H015C4_n3656BarCosAD ;
   private java.math.BigDecimal[] H015C4_A3657BarCosAA ;
   private boolean[] H015C4_n3657BarCosAA ;
   private java.math.BigDecimal[] H015C4_A3706BarCosAnc ;
   private boolean[] H015C4_n3706BarCosAnc ;
   private int[] H015C4_A13967BarNumEny ;
   private boolean[] H015C4_n13967BarNumEny ;
   private String[] H015C4_A13962BarArtTinD ;
   private boolean[] H015C4_n13962BarArtTinD ;
   private String[] H015C4_A1935BarParTin ;
   private boolean[] H015C4_n1935BarParTin ;
   private byte[] H015C4_A1934BarReoTin ;
   private boolean[] H015C4_n1934BarReoTin ;
   private int[] H015C4_A1933BarCodTin ;
   private boolean[] H015C4_n1933BarCodTin ;
   private String[] H015C4_A2316BarAgrLot ;
   private boolean[] H015C4_n2316BarAgrLot ;
   private java.math.BigDecimal[] H015C4_A3705BarCosCol ;
   private boolean[] H015C4_n3705BarCosCol ;
   private java.math.BigDecimal[] H015C4_A3658BarCosPA ;
   private boolean[] H015C4_n3658BarCosPA ;
   private java.math.BigDecimal[] H015C4_A3654BarCosPD ;
   private boolean[] H015C4_n3654BarCosPD ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV30TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV50ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV51ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV96DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class consultadesdelconti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H015C2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                          short AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr ,
                                          short AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ,
                                          int AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ,
                                          int AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ,
                                          byte AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin ,
                                          byte AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ,
                                          String AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                          String AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                          String AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                          String AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                          int AV153Formulaciontinte_consultadesdelcontids_12_tfclicod ,
                                          int AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to ,
                                          String AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                          String AV155Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                          String AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                          String AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                          String AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                          String AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                          short AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin ,
                                          short AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ,
                                          String AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                          String AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                          int AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ,
                                          int AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ,
                                          byte AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot ,
                                          byte AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ,
                                          java.math.BigDecimal AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                          java.math.BigDecimal AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                          java.math.BigDecimal AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                          java.math.BigDecimal AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                          java.math.BigDecimal AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                          java.math.BigDecimal AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                          short AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ,
                                          short AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ,
                                          java.math.BigDecimal AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                          java.math.BigDecimal AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                          String AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                          String AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                          int AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ,
                                          int AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ,
                                          String AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                          String AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                          short AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana ,
                                          short AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ,
                                          java.math.BigDecimal AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                          java.math.BigDecimal AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                          java.math.BigDecimal AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                          java.math.BigDecimal AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                          byte AV15BarCodReoP ,
                                          java.util.Date A13759EstFecCier ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          short A1939BarArtTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          java.math.BigDecimal A3654BarCosPD ,
                                          java.math.BigDecimal A3658BarCosPA ,
                                          java.math.BigDecimal A3705BarCosCol ,
                                          java.math.BigDecimal A3656BarCosAD ,
                                          java.math.BigDecimal A3657BarCosAA ,
                                          java.math.BigDecimal A3706BarCosAnc ,
                                          short AV34OrderedBy ,
                                          boolean AV35OrderedDsc ,
                                          String AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                          String AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                          String A13962BarArtTinD ,
                                          int AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ,
                                          int A13967BarNumEny ,
                                          int AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ,
                                          java.util.Date AV8Fec1 ,
                                          java.util.Date AV9Fec3 ,
                                          int AV10PCliCod ,
                                          int AV11CliCodP ,
                                          int AV12PBarCod ,
                                          int AV13Barcodp ,
                                          byte AV14PBarCodReo ,
                                          String AV16PBarCodPar ,
                                          String AV17BarCodParP ,
                                          String AV18PSerie ,
                                          String AV19SerieP ,
                                          String AV20PColor ,
                                          String AV21ColorP ,
                                          int AV22PColNum ,
                                          int AV23ColNumP ,
                                          String AV24DispCli1 ,
                                          String AV25DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV26HreRacab ,
                                          String AV27MaqCodi ,
                                          String AV28MaqCod3 ,
                                          short AV118TipArtCodfrom ,
                                          short AV119TipArtCodto ,
                                          String AV120SoloAd ,
                                          String AV121CorAdi ,
                                          java.math.BigDecimal A14200CosteAnyad ,
                                          String AV7Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[93];
      Object[] GXv_Object26 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T4.ForSer, T4.ForColNom, T4.ForColNum, T4.TipColCod, T2.TipArtCod, T1.EstTinAny, T1.EstTinMes, T1.EstTinDia, T1.BarRecAcb, T1.EmprCod, COALESCE( T1.BarCosAD, 0)" ;
      sSelectString += " + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) AS CosteAnyad, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt," ;
      sSelectString += " T1.BarKgmTin, T1.BarTipCoT, T1.BarColNuT, T1.BarColNoT, T1.BarArtTin, T1.BarDscTin, T1.BarSerTin, T3.CliNom, T1.CliCod, T1.EstTinNr, T1.EstFecCier, T1.BarCosAD," ;
      sSelectString += " T1.BarCosAA, T1.BarCosAnc, COALESCE( T4.ForNumArc, 0) AS BarNumEny, COALESCE( T2.TipArtDsc, ' ') AS BarArtTinD, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.BarAgrLot," ;
      sSelectString += " T1.BarCosCol, T1.BarCosPA, T1.BarCosPD" ;
      sFromString = " FROM (((TXPLCONTI T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarArtTin) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      sFromString += " = T1.CliCod) LEFT JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ForSer = T1.BarSerTin AND T4.ForColNom = T1.BarColNoT AND T4.ForColNum" ;
      sFromString += " = T1.BarColNuT AND T4.TipColCod = T1.BarTipCoT)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) <= ?))");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ?)");
      addWhere(sWhereString, "(T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ?)");
      addWhere(sWhereString, "(T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      addWhere(sWhereString, "(( ? = 'N') or ( ? = 'S' and ? = 'N' and COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) > 0) or ( ? = 'S' and ? = 'S' and T1.BarCosAnc > 0))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int25[38] = (byte)(1) ;
      }
      if ( ! (0==AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int25[39] = (byte)(1) ;
      }
      if ( ! (0==AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int25[40] = (byte)(1) ;
      }
      if ( ! (0==AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) )
      {
         addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      }
      else
      {
         GXv_int25[41] = (byte)(1) ;
      }
      if ( ! (0==AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) )
      {
         addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      }
      else
      {
         GXv_int25[42] = (byte)(1) ;
      }
      if ( ! (0==AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin) )
      {
         addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      }
      else
      {
         GXv_int25[43] = (byte)(1) ;
      }
      if ( ! (0==AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int25[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) && ( ! (GXutil.strcmp("", AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarParTin = ?)");
      }
      else
      {
         GXv_int25[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) && ( ! (GXutil.strcmp("", AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int25[48] = (byte)(1) ;
      }
      if ( ! (0==AV153Formulaciontinte_consultadesdelcontids_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[49] = (byte)(1) ;
      }
      if ( ! (0==AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int25[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) && ( ! (GXutil.strcmp("", AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int25[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) && ( ! (GXutil.strcmp("", AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int25[56] = (byte)(1) ;
      }
      if ( ! (0==AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin) )
      {
         addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      }
      else
      {
         GXv_int25[57] = (byte)(1) ;
      }
      if ( ! (0==AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) )
      {
         addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      }
      else
      {
         GXv_int25[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) && ( ! (GXutil.strcmp("", AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int25[60] = (byte)(1) ;
      }
      if ( ! (0==AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int25[61] = (byte)(1) ;
      }
      if ( ! (0==AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int25[62] = (byte)(1) ;
      }
      if ( ! (0==AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int25[63] = (byte)(1) ;
      }
      if ( ! (0==AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int25[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int25[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int25[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int25[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int25[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int25[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int25[70] = (byte)(1) ;
      }
      if ( ! (0==AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int25[71] = (byte)(1) ;
      }
      if ( ! (0==AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int25[72] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int25[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int25[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) && ( ! (GXutil.strcmp("", AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int25[76] = (byte)(1) ;
      }
      if ( ! (0==AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int25[77] = (byte)(1) ;
      }
      if ( ! (0==AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int25[78] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) && ( ! (GXutil.strcmp("", AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[79] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int25[80] = (byte)(1) ;
      }
      if ( ! (0==AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int25[81] = (byte)(1) ;
      }
      if ( ! (0==AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int25[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) >= ?)");
      }
      else
      {
         GXv_int25[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) <= ?)");
      }
      else
      {
         GXv_int25[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) >= ?)");
      }
      else
      {
         GXv_int25[85] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) <= ?)");
      }
      else
      {
         GXv_int25[86] = (byte)(1) ;
      }
      if ( ! (0==AV15BarCodReoP) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int25[87] = (byte)(1) ;
      }
      if ( AV34OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.EstFecCier, T1.EstTinNr" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EstFecCier" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EstFecCier DESC" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EstTinNr" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EstTinNr DESC" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarCodTin" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarCodTin DESC" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarReoTin" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarReoTin DESC" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarParTin" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarParTin DESC" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarAgrLot" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarAgrLot DESC" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarSerTin" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarSerTin DESC" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarDscTin" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarDscTin DESC" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarArtTin" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarArtTin DESC" ;
      }
      else if ( ( AV34OrderedBy == 13 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarColNoT" ;
      }
      else if ( ( AV34OrderedBy == 13 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarColNoT DESC" ;
      }
      else if ( ( AV34OrderedBy == 14 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarColNuT" ;
      }
      else if ( ( AV34OrderedBy == 14 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarColNuT DESC" ;
      }
      else if ( ( AV34OrderedBy == 15 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarTipCoT" ;
      }
      else if ( ( AV34OrderedBy == 15 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarTipCoT DESC" ;
      }
      else if ( ( AV34OrderedBy == 16 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarKgmTin" ;
      }
      else if ( ( AV34OrderedBy == 16 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarKgmTin DESC" ;
      }
      else if ( ( AV34OrderedBy == 17 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarKgsTt" ;
      }
      else if ( ( AV34OrderedBy == 17 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarKgsTt DESC" ;
      }
      else if ( ( AV34OrderedBy == 18 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarMtrTin" ;
      }
      else if ( ( AV34OrderedBy == 18 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarMtrTin DESC" ;
      }
      else if ( ( AV34OrderedBy == 19 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarMtsTt" ;
      }
      else if ( ( AV34OrderedBy == 19 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarMtsTt DESC" ;
      }
      else if ( ( AV34OrderedBy == 20 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarMaqTin" ;
      }
      else if ( ( AV34OrderedBy == 20 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarMaqTin DESC" ;
      }
      else if ( ( AV34OrderedBy == 21 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarVolTin" ;
      }
      else if ( ( AV34OrderedBy == 21 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarVolTin DESC" ;
      }
      else if ( ( AV34OrderedBy == 22 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarDispCli" ;
      }
      else if ( ( AV34OrderedBy == 22 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarDispCli DESC" ;
      }
      else if ( ( AV34OrderedBy == 23 ) && ! AV35OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarNumAna" ;
      }
      else if ( ( AV34OrderedBy == 23 ) && ( AV35OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarNumAna DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.EstTinAny, T1.EstTinMes, T1.EstTinDia, T1.EstTinNr" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H015C3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                          short AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr ,
                                          short AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ,
                                          int AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ,
                                          int AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ,
                                          byte AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin ,
                                          byte AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ,
                                          String AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                          String AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                          String AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                          String AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                          int AV153Formulaciontinte_consultadesdelcontids_12_tfclicod ,
                                          int AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to ,
                                          String AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                          String AV155Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                          String AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                          String AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                          String AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                          String AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                          short AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin ,
                                          short AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ,
                                          String AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                          String AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                          int AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ,
                                          int AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ,
                                          byte AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot ,
                                          byte AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ,
                                          java.math.BigDecimal AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                          java.math.BigDecimal AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                          java.math.BigDecimal AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                          java.math.BigDecimal AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                          java.math.BigDecimal AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                          java.math.BigDecimal AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                          short AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ,
                                          short AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ,
                                          java.math.BigDecimal AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                          java.math.BigDecimal AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                          String AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                          String AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                          int AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ,
                                          int AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ,
                                          String AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                          String AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                          short AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana ,
                                          short AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ,
                                          java.math.BigDecimal AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                          java.math.BigDecimal AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                          java.math.BigDecimal AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                          java.math.BigDecimal AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                          byte AV15BarCodReoP ,
                                          java.util.Date A13759EstFecCier ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          short A1939BarArtTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          java.math.BigDecimal A3654BarCosPD ,
                                          java.math.BigDecimal A3658BarCosPA ,
                                          java.math.BigDecimal A3705BarCosCol ,
                                          java.math.BigDecimal A3656BarCosAD ,
                                          java.math.BigDecimal A3657BarCosAA ,
                                          java.math.BigDecimal A3706BarCosAnc ,
                                          short AV34OrderedBy ,
                                          boolean AV35OrderedDsc ,
                                          String AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                          String AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                          String A13962BarArtTinD ,
                                          int AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ,
                                          int A13967BarNumEny ,
                                          int AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ,
                                          java.util.Date AV8Fec1 ,
                                          java.util.Date AV9Fec3 ,
                                          int AV10PCliCod ,
                                          int AV11CliCodP ,
                                          int AV12PBarCod ,
                                          int AV13Barcodp ,
                                          byte AV14PBarCodReo ,
                                          String AV16PBarCodPar ,
                                          String AV17BarCodParP ,
                                          String AV18PSerie ,
                                          String AV19SerieP ,
                                          String AV20PColor ,
                                          String AV21ColorP ,
                                          int AV22PColNum ,
                                          int AV23ColNumP ,
                                          String AV24DispCli1 ,
                                          String AV25DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV26HreRacab ,
                                          String AV27MaqCodi ,
                                          String AV28MaqCod3 ,
                                          short AV118TipArtCodfrom ,
                                          short AV119TipArtCodto ,
                                          String AV120SoloAd ,
                                          String AV121CorAdi ,
                                          java.math.BigDecimal A14200CosteAnyad ,
                                          String AV7Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[88];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((TXPLCONTI T1 LEFT JOIN TXPTIPART T4 ON T4.EmprCod = T1.EmprCod AND T4.TipArtCod = T1.BarArtTin) INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod) LEFT JOIN TXPCFORMU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ForSer = T1.BarSerTin AND T3.ForColNom = T1.BarColNoT" ;
      scmdbuf += " AND T3.ForColNum = T1.BarColNuT AND T3.TipColCod = T1.BarTipCoT)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.ForNumArc, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.ForNumArc, 0) <= ?))");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ?)");
      addWhere(sWhereString, "(T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ?)");
      addWhere(sWhereString, "(T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      addWhere(sWhereString, "(( ? = 'N') or ( ? = 'S' and ? = 'N' and COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) > 0) or ( ? = 'S' and ? = 'S' and T1.BarCosAnc > 0))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int27[38] = (byte)(1) ;
      }
      if ( ! (0==AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int27[39] = (byte)(1) ;
      }
      if ( ! (0==AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int27[40] = (byte)(1) ;
      }
      if ( ! (0==AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) )
      {
         addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      }
      else
      {
         GXv_int27[41] = (byte)(1) ;
      }
      if ( ! (0==AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) )
      {
         addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      }
      else
      {
         GXv_int27[42] = (byte)(1) ;
      }
      if ( ! (0==AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin) )
      {
         addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      }
      else
      {
         GXv_int27[43] = (byte)(1) ;
      }
      if ( ! (0==AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int27[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) && ( ! (GXutil.strcmp("", AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarParTin = ?)");
      }
      else
      {
         GXv_int27[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) && ( ! (GXutil.strcmp("", AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int27[48] = (byte)(1) ;
      }
      if ( ! (0==AV153Formulaciontinte_consultadesdelcontids_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int27[49] = (byte)(1) ;
      }
      if ( ! (0==AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int27[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int27[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) && ( ! (GXutil.strcmp("", AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int27[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) && ( ! (GXutil.strcmp("", AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int27[56] = (byte)(1) ;
      }
      if ( ! (0==AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin) )
      {
         addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      }
      else
      {
         GXv_int27[57] = (byte)(1) ;
      }
      if ( ! (0==AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) )
      {
         addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      }
      else
      {
         GXv_int27[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) && ( ! (GXutil.strcmp("", AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int27[60] = (byte)(1) ;
      }
      if ( ! (0==AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int27[61] = (byte)(1) ;
      }
      if ( ! (0==AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int27[62] = (byte)(1) ;
      }
      if ( ! (0==AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int27[63] = (byte)(1) ;
      }
      if ( ! (0==AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int27[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int27[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int27[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int27[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int27[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int27[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int27[70] = (byte)(1) ;
      }
      if ( ! (0==AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int27[71] = (byte)(1) ;
      }
      if ( ! (0==AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int27[72] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int27[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int27[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) && ( ! (GXutil.strcmp("", AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int27[76] = (byte)(1) ;
      }
      if ( ! (0==AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int27[77] = (byte)(1) ;
      }
      if ( ! (0==AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int27[78] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) && ( ! (GXutil.strcmp("", AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[79] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int27[80] = (byte)(1) ;
      }
      if ( ! (0==AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int27[81] = (byte)(1) ;
      }
      if ( ! (0==AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int27[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) >= ?)");
      }
      else
      {
         GXv_int27[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) <= ?)");
      }
      else
      {
         GXv_int27[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) >= ?)");
      }
      else
      {
         GXv_int27[85] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) <= ?)");
      }
      else
      {
         GXv_int27[86] = (byte)(1) ;
      }
      if ( ! (0==AV15BarCodReoP) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int27[87] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV34OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 13 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 13 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 14 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 14 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 15 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 15 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 16 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 16 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 17 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 17 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 18 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 18 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 19 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 19 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 20 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 20 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 21 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 21 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 22 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 22 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 23 ) && ! AV35OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV34OrderedBy == 23 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
   }

   protected Object[] conditional_H015C4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                          short AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr ,
                                          short AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ,
                                          int AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ,
                                          int AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ,
                                          byte AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin ,
                                          byte AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ,
                                          String AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                          String AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                          String AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                          String AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                          int AV153Formulaciontinte_consultadesdelcontids_12_tfclicod ,
                                          int AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to ,
                                          String AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                          String AV155Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                          String AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                          String AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                          String AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                          String AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                          short AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin ,
                                          short AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ,
                                          String AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                          String AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                          int AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ,
                                          int AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ,
                                          byte AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot ,
                                          byte AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ,
                                          java.math.BigDecimal AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                          java.math.BigDecimal AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                          java.math.BigDecimal AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                          java.math.BigDecimal AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                          java.math.BigDecimal AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                          java.math.BigDecimal AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                          short AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ,
                                          short AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ,
                                          java.math.BigDecimal AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                          java.math.BigDecimal AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                          String AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                          String AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                          int AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ,
                                          int AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ,
                                          String AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                          String AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                          short AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana ,
                                          short AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ,
                                          java.math.BigDecimal AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                          java.math.BigDecimal AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                          java.math.BigDecimal AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                          java.math.BigDecimal AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                          byte AV15BarCodReoP ,
                                          java.util.Date A13759EstFecCier ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          short A1939BarArtTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          java.math.BigDecimal A3654BarCosPD ,
                                          java.math.BigDecimal A3658BarCosPA ,
                                          java.math.BigDecimal A3705BarCosCol ,
                                          java.math.BigDecimal A3656BarCosAD ,
                                          java.math.BigDecimal A3657BarCosAA ,
                                          java.math.BigDecimal A3706BarCosAnc ,
                                          String AV164Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                          String AV163Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                          String A13962BarArtTinD ,
                                          int AV185Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ,
                                          int A13967BarNumEny ,
                                          int AV186Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ,
                                          java.util.Date AV8Fec1 ,
                                          java.util.Date AV9Fec3 ,
                                          int AV10PCliCod ,
                                          int AV11CliCodP ,
                                          int AV12PBarCod ,
                                          int AV13Barcodp ,
                                          byte AV14PBarCodReo ,
                                          String AV16PBarCodPar ,
                                          String AV17BarCodParP ,
                                          String AV18PSerie ,
                                          String AV19SerieP ,
                                          String AV20PColor ,
                                          String AV21ColorP ,
                                          int AV22PColNum ,
                                          int AV23ColNumP ,
                                          String AV24DispCli1 ,
                                          String AV25DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV26HreRacab ,
                                          String AV27MaqCodi ,
                                          String AV28MaqCod3 ,
                                          short AV118TipArtCodfrom ,
                                          short AV119TipArtCodto ,
                                          String AV120SoloAd ,
                                          String AV121CorAdi ,
                                          java.math.BigDecimal A14200CosteAnyad ,
                                          String AV7Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[88];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T4.ForSer, T4.ForColNom, T4.ForColNum, T4.TipColCod, T2.TipArtCod, T1.EstTinAny, T1.EstTinMes, T1.EstTinDia, T1.BarRecAcb, T1.EmprCod, COALESCE( T1.BarCosAD," ;
      scmdbuf += " 0) + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) AS CosteAnyad, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt," ;
      scmdbuf += " T1.BarKgmTin, T1.BarTipCoT, T1.BarColNuT, T1.BarColNoT, T1.BarArtTin, T1.BarDscTin, T1.BarSerTin, T3.CliNom, T1.CliCod, T1.EstTinNr, T1.EstFecCier, T1.BarCosAD," ;
      scmdbuf += " T1.BarCosAA, T1.BarCosAnc, COALESCE( T4.ForNumArc, 0) AS BarNumEny, COALESCE( T2.TipArtDsc, ' ') AS BarArtTinD, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.BarAgrLot," ;
      scmdbuf += " T1.BarCosCol, T1.BarCosPA, T1.BarCosPD FROM (((TXPLCONTI T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarArtTin) INNER JOIN TXPCLIENT" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ForSer = T1.BarSerTin" ;
      scmdbuf += " AND T4.ForColNom = T1.BarColNoT AND T4.ForColNum = T1.BarColNuT AND T4.TipColCod = T1.BarTipCoT)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) <= ?))");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ?)");
      addWhere(sWhereString, "(T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ?)");
      addWhere(sWhereString, "(T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      addWhere(sWhereString, "(( ? = 'N') or ( ? = 'S' and ? = 'N' and COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) > 0) or ( ? = 'S' and ? = 'S' and T1.BarCosAnc > 0))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV142Formulaciontinte_consultadesdelcontids_1_tfestfeccier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! (0==AV143Formulaciontinte_consultadesdelcontids_2_tfesttinnr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( ! (0==AV144Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      if ( ! (0==AV145Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) )
      {
         addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      }
      else
      {
         GXv_int29[41] = (byte)(1) ;
      }
      if ( ! (0==AV146Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) )
      {
         addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      }
      else
      {
         GXv_int29[42] = (byte)(1) ;
      }
      if ( ! (0==AV147Formulaciontinte_consultadesdelcontids_6_tfbarreotin) )
      {
         addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      }
      else
      {
         GXv_int29[43] = (byte)(1) ;
      }
      if ( ! (0==AV148Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int29[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) && ( ! (GXutil.strcmp("", AV149Formulaciontinte_consultadesdelcontids_8_tfbarpartin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarParTin = ?)");
      }
      else
      {
         GXv_int29[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) && ( ! (GXutil.strcmp("", AV151Formulaciontinte_consultadesdelcontids_10_tfbaragrlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV152Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int29[48] = (byte)(1) ;
      }
      if ( ! (0==AV153Formulaciontinte_consultadesdelcontids_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int29[49] = (byte)(1) ;
      }
      if ( ! (0==AV154Formulaciontinte_consultadesdelcontids_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int29[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV155Formulaciontinte_consultadesdelcontids_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int29[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) && ( ! (GXutil.strcmp("", AV157Formulaciontinte_consultadesdelcontids_16_tfbarsertin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int29[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) && ( ! (GXutil.strcmp("", AV159Formulaciontinte_consultadesdelcontids_18_tfbardsctin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int29[56] = (byte)(1) ;
      }
      if ( ! (0==AV161Formulaciontinte_consultadesdelcontids_20_tfbararttin) )
      {
         addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      }
      else
      {
         GXv_int29[57] = (byte)(1) ;
      }
      if ( ! (0==AV162Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) )
      {
         addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      }
      else
      {
         GXv_int29[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) && ( ! (GXutil.strcmp("", AV165Formulaciontinte_consultadesdelcontids_24_tfbarcolnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int29[60] = (byte)(1) ;
      }
      if ( ! (0==AV167Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int29[61] = (byte)(1) ;
      }
      if ( ! (0==AV168Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int29[62] = (byte)(1) ;
      }
      if ( ! (0==AV169Formulaciontinte_consultadesdelcontids_28_tfbartipcot) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int29[63] = (byte)(1) ;
      }
      if ( ! (0==AV170Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int29[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV171Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int29[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV172Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int29[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV173Formulaciontinte_consultadesdelcontids_32_tfbarkgstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int29[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV174Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int29[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV175Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int29[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV176Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int29[70] = (byte)(1) ;
      }
      if ( ! (0==AV177Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int29[71] = (byte)(1) ;
      }
      if ( ! (0==AV178Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int29[72] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV179Formulaciontinte_consultadesdelcontids_38_tfbarmtstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int29[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV180Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int29[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) && ( ! (GXutil.strcmp("", AV181Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int29[76] = (byte)(1) ;
      }
      if ( ! (0==AV183Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int29[77] = (byte)(1) ;
      }
      if ( ! (0==AV184Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int29[78] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) && ( ! (GXutil.strcmp("", AV187Formulaciontinte_consultadesdelcontids_46_tfbardispcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[79] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int29[80] = (byte)(1) ;
      }
      if ( ! (0==AV189Formulaciontinte_consultadesdelcontids_48_tfbarnumana) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int29[81] = (byte)(1) ;
      }
      if ( ! (0==AV190Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int29[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV191Formulaciontinte_consultadesdelcontids_50_tfcosteinicial)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) >= ?)");
      }
      else
      {
         GXv_int29[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV192Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) <= ?)");
      }
      else
      {
         GXv_int29[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV193Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) >= ?)");
      }
      else
      {
         GXv_int29[85] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV194Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) <= ?)");
      }
      else
      {
         GXv_int29[86] = (byte)(1) ;
      }
      if ( ! (0==AV15BarCodReoP) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int29[87] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
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
                  return conditional_H015C2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).shortValue() , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (java.math.BigDecimal)dynConstraints[77] , ((Number) dynConstraints[78]).shortValue() , ((Boolean) dynConstraints[79]).booleanValue() , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).intValue() , (java.util.Date)dynConstraints[86] , (java.util.Date)dynConstraints[87] , ((Number) dynConstraints[88]).intValue() , ((Number) dynConstraints[89]).intValue() , ((Number) dynConstraints[90]).intValue() , ((Number) dynConstraints[91]).intValue() , ((Number) dynConstraints[92]).byteValue() , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , (String)dynConstraints[96] , (String)dynConstraints[97] , (String)dynConstraints[98] , ((Number) dynConstraints[99]).intValue() , ((Number) dynConstraints[100]).intValue() , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , (String)dynConstraints[106] , ((Number) dynConstraints[107]).shortValue() , ((Number) dynConstraints[108]).shortValue() , (String)dynConstraints[109] , (String)dynConstraints[110] , (java.math.BigDecimal)dynConstraints[111] , (String)dynConstraints[112] , (String)dynConstraints[113] );
            case 1 :
                  return conditional_H015C3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).shortValue() , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (java.math.BigDecimal)dynConstraints[77] , ((Number) dynConstraints[78]).shortValue() , ((Boolean) dynConstraints[79]).booleanValue() , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).intValue() , (java.util.Date)dynConstraints[86] , (java.util.Date)dynConstraints[87] , ((Number) dynConstraints[88]).intValue() , ((Number) dynConstraints[89]).intValue() , ((Number) dynConstraints[90]).intValue() , ((Number) dynConstraints[91]).intValue() , ((Number) dynConstraints[92]).byteValue() , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , (String)dynConstraints[96] , (String)dynConstraints[97] , (String)dynConstraints[98] , ((Number) dynConstraints[99]).intValue() , ((Number) dynConstraints[100]).intValue() , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , (String)dynConstraints[106] , ((Number) dynConstraints[107]).shortValue() , ((Number) dynConstraints[108]).shortValue() , (String)dynConstraints[109] , (String)dynConstraints[110] , (java.math.BigDecimal)dynConstraints[111] , (String)dynConstraints[112] , (String)dynConstraints[113] );
            case 2 :
                  return conditional_H015C4(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).shortValue() , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (java.math.BigDecimal)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , ((Number) dynConstraints[81]).intValue() , ((Number) dynConstraints[82]).intValue() , ((Number) dynConstraints[83]).intValue() , (java.util.Date)dynConstraints[84] , (java.util.Date)dynConstraints[85] , ((Number) dynConstraints[86]).intValue() , ((Number) dynConstraints[87]).intValue() , ((Number) dynConstraints[88]).intValue() , ((Number) dynConstraints[89]).intValue() , ((Number) dynConstraints[90]).byteValue() , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , (String)dynConstraints[96] , ((Number) dynConstraints[97]).intValue() , ((Number) dynConstraints[98]).intValue() , (String)dynConstraints[99] , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , ((Number) dynConstraints[105]).shortValue() , ((Number) dynConstraints[106]).shortValue() , (String)dynConstraints[107] , (String)dynConstraints[108] , (java.math.BigDecimal)dynConstraints[109] , (String)dynConstraints[110] , (String)dynConstraints[111] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H015C2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015C3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015C4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((byte[]) buf[28])[0] = rslt.getByte(20);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(21);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(22, 13);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(23);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(24, 26);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(25, 16);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(26, 30);
               ((int[]) buf[41])[0] = rslt.getInt(27);
               ((short[]) buf[42])[0] = rslt.getShort(28);
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDate(29);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((int[]) buf[50])[0] = rslt.getInt(33);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(34, 30);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((byte[]) buf[56])[0] = rslt.getByte(36);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((int[]) buf[58])[0] = rslt.getInt(37);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(38, 10);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[64])[0] = rslt.getBigDecimal(40,2);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(41,2);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 3);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((byte[]) buf[28])[0] = rslt.getByte(20);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(21);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(22, 13);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(23);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(24, 26);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(25, 16);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(26, 30);
               ((int[]) buf[41])[0] = rslt.getInt(27);
               ((short[]) buf[42])[0] = rslt.getShort(28);
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDate(29);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((int[]) buf[50])[0] = rslt.getInt(33);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(34, 30);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((byte[]) buf[56])[0] = rslt.getByte(36);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((int[]) buf[58])[0] = rslt.getInt(37);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(38, 10);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[64])[0] = rslt.getBigDecimal(40,2);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(41,2);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[93], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[103]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[104]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[105]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[109]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[117]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[124]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[125]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 1);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[131]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[132]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[133]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[135]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[136]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[137]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 10);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 26);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[150]).shortValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 13);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[153], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[154]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[155]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[156]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[157]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[158], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[159], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[160], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[162], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[163], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[164]).shortValue());
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[165]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[166], 2);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[167], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 6);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[169], 6);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[170]).intValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[171]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[172], 20);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[173], 20);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[174]).shortValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[175]).shortValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[176], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[177], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[178], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[179], 2);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[180]).byteValue());
               }
               if ( ((Number) parms[88]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[181]).intValue());
               }
               if ( ((Number) parms[89]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[182]).intValue());
               }
               if ( ((Number) parms[90]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[183]).intValue());
               }
               if ( ((Number) parms[91]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[184]).intValue());
               }
               if ( ((Number) parms[92]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[185]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[120]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[127]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[128]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[131]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 10);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 26);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[145]).shortValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[149]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[151]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[152]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[156], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[157], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[158], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[162], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 6);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 6);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[166]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[167], 20);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 20);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[169]).shortValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[170]).shortValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[175]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[120]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[127]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[128]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[131]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 10);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 26);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[145]).shortValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[149]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[151]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[152]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[156], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[157], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[158], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[162], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 6);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 6);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[166]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[167], 20);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 20);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[169]).shortValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[170]).shortValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[175]).byteValue());
               }
               return;
      }
   }

}

