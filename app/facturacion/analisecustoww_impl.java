package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class analisecustoww_impl extends GXDataArea
{
   public analisecustoww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public analisecustoww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( analisecustoww_impl.class ));
   }

   public analisecustoww_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Subfile1") == 0 )
         {
            gxnrsubfile1_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Subfile1") == 0 )
         {
            gxgrsubfile1_refresh_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Subfile2") == 0 )
         {
            gxnrsubfile2_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Subfile2") == 0 )
         {
            gxgrsubfile2_refresh_invoke( ) ;
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrsubfile1_newrow_invoke( )
   {
      nRC_GXsfl_111 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_111"))) ;
      nGXsfl_111_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_111_idx"))) ;
      sGXsfl_111_idx = httpContext.GetPar( "sGXsfl_111_idx") ;
      edtavValor_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValor_Internalname, "Title", edtavValor_Title, !bGXsfl_111_Refreshing);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrsubfile1_newrow( ) ;
      /* End function gxnrSubfile1_newrow_invoke */
   }

   public void gxgrsubfile1_refresh_invoke( )
   {
      subSubfile1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subSubfile1_Rows"))) ;
      subSubfile2_Rows = (int)(GXutil.lval( httpContext.GetPar( "subSubfile2_Rows"))) ;
      edtavValor_Title = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValor_Internalname, "Title", edtavValor_Title, !bGXsfl_111_Refreshing);
      AV47Clicod2 = (int)(GXutil.lval( httpContext.GetPar( "Clicod2"))) ;
      AV10Barcod1 = (int)(GXutil.lval( httpContext.GetPar( "Barcod1"))) ;
      AV109Fec3 = localUtil.parseDateParm( httpContext.GetPar( "Fec3")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      n252CliCod = false ;
      A159BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
      AV97EmprCod = httpContext.GetPar( "EmprCod") ;
      AV46Clicod1 = (int)(GXutil.lval( httpContext.GetPar( "Clicod1"))) ;
      AV110Fec4 = localUtil.parseDateParm( httpContext.GetPar( "Fec4")) ;
      A212BarSer = httpContext.GetPar( "BarSer") ;
      AV7Artcod = httpContext.GetPar( "Artcod") ;
      A161BarFecSal = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal")) ;
      AV107fec1 = localUtil.parseDateParm( httpContext.GetPar( "fec1")) ;
      AV108Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
      A166BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
      A184BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
      A3311BarManCod1 = (short)(GXutil.lval( httpContext.GetPar( "BarManCod1"))) ;
      AV29BarMancod1 = (short)(GXutil.lval( httpContext.GetPar( "BarMancod1"))) ;
      A143BarDisNum = httpContext.GetPar( "BarDisNum") ;
      AV21Bardisnum = httpContext.GetPar( "Bardisnum") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV14Barcodreo1 = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo1"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV12Barcodpar1 = httpContext.GetPar( "Barcodpar1") ;
      A2010BarTipDis = httpContext.GetPar( "BarTipDis") ;
      A1652BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
      A135BarColNom = httpContext.GetPar( "BarColNom") ;
      A136BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      A218BarTipCol = (byte)(GXutil.lval( httpContext.GetPar( "BarTipCol"))) ;
      A141BarCosPro = CommonUtil.decimalVal( httpContext.GetPar( "BarCosPro"), ".") ;
      A140BarCosAny = CommonUtil.decimalVal( httpContext.GetPar( "BarCosAny"), ".") ;
      A279CliNom = httpContext.GetPar( "CliNom") ;
      A228BarUniMed = httpContext.GetPar( "BarUniMed") ;
      A4812BarEncCli = httpContext.GetPar( "BarEncCli") ;
      AV78CosteFab = CommonUtil.decimalVal( httpContext.GetPar( "CosteFab"), ".") ;
      AV88CosteTeo = CommonUtil.decimalVal( httpContext.GetPar( "CosteTeo"), ".") ;
      AV224Traza = (byte)(GXutil.lval( httpContext.GetPar( "Traza"))) ;
      AV117FlagColor = (byte)(GXutil.lval( httpContext.GetPar( "FlagColor"))) ;
      AV199Simulador = (byte)(GXutil.lval( httpContext.GetPar( "Simulador"))) ;
      AV120ForRelban = CommonUtil.decimalVal( httpContext.GetPar( "ForRelban"), ".") ;
      AV201Station = httpContext.GetPar( "Station") ;
      AV84CosteSimula = CommonUtil.decimalVal( httpContext.GetPar( "CosteSimula"), ".") ;
      AV235Valor = CommonUtil.decimalVal( httpContext.GetPar( "Valor"), ".") ;
      A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
      AV9BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV13BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV11BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A203BarPieKil = CommonUtil.decimalVal( httpContext.GetPar( "BarPieKil"), ".") ;
      A205BarPieMet = CommonUtil.decimalVal( httpContext.GetPar( "BarPieMet"), ".") ;
      A3275BarKgsAut = CommonUtil.decimalVal( httpContext.GetPar( "BarKgsAut"), ".") ;
      n3275BarKgsAut = false ;
      A3276BarMtsAut = CommonUtil.decimalVal( httpContext.GetPar( "BarMtsAut"), ".") ;
      n3276BarMtsAut = false ;
      A32AlbProEsp = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEsp"))) ;
      A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
      A1261BarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbKgmE"), ".") ;
      A1262BarPreKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarPreKgm"), ".") ;
      A1263BarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbMtrE"), ".") ;
      A1264BarPreMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarPreMtr"), ".") ;
      A1275FasKgm = CommonUtil.decimalVal( httpContext.GetPar( "FasKgm"), ".") ;
      A1241GuiFasPKg = CommonUtil.decimalVal( httpContext.GetPar( "GuiFasPKg"), ".") ;
      A1276FasMtr = CommonUtil.decimalVal( httpContext.GetPar( "FasMtr"), ".") ;
      A1242GuiFasPMt = CommonUtil.decimalVal( httpContext.GetPar( "GuiFasPMt"), ".") ;
      AV180Moda21 = (byte)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      A1294FacBarCod = (int)(GXutil.lval( httpContext.GetPar( "FacBarCod"))) ;
      A1295FacBarReo = (byte)(GXutil.lval( httpContext.GetPar( "FacBarReo"))) ;
      A1296FacBarPar = httpContext.GetPar( "FacBarPar") ;
      A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
      AV198Sicsv = (byte)(GXutil.lval( httpContext.GetPar( "Sicsv"))) ;
      AV43carpeta = httpContext.GetPar( "carpeta") ;
      AV90CosTiR = (byte)(GXutil.lval( httpContext.GetPar( "CosTiR"))) ;
      AV211Tiempo_m = (int)(GXutil.lval( httpContext.GetPar( "Tiempo_m"))) ;
      AV214TipmaqCod = httpContext.GetPar( "TipmaqCod") ;
      AV112fecteo = localUtil.parseDateParm( httpContext.GetPar( "fecteo")) ;
      AV125hnd = GXutil.lval( httpContext.GetPar( "hnd")) ;
      AV119Fornumcol = (int)(GXutil.lval( httpContext.GetPar( "Fornumcol"))) ;
      AV18BarCosPro = CommonUtil.decimalVal( httpContext.GetPar( "BarCosPro"), ".") ;
      AV17BarCosAny = CommonUtil.decimalVal( httpContext.GetPar( "BarCosAny"), ".") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrsubfile1_refresh( subSubfile1_Rows, subSubfile2_Rows, AV47Clicod2, AV10Barcod1, AV109Fec3, A396EmprCod, A252CliCod, A159BarFecGen, AV97EmprCod, AV46Clicod1, AV110Fec4, A212BarSer, AV7Artcod, A161BarFecSal, AV107fec1, AV108Fec2, A166BarKgm, A184BarMtr, A3311BarManCod1, AV29BarMancod1, A143BarDisNum, AV21Bardisnum, A129BarCod, A132BarCodReo, AV14Barcodreo1, A130BarCodPar, AV12Barcodpar1, A2010BarTipDis, A1652BarSerDsc, A135BarColNom, A136BarColNum, A218BarTipCol, A141BarCosPro, A140BarCosAny, A279CliNom, A228BarUniMed, A4812BarEncCli, AV78CosteFab, AV88CosteTeo, AV224Traza, AV117FlagColor, AV199Simulador, AV120ForRelban, AV201Station, AV84CosteSimula, AV235Valor, A200BarPieCod, AV9BarCod, AV13BarCodReo, AV11BarCodPar, A203BarPieKil, A205BarPieMet, A3275BarKgsAut, A3276BarMtsAut, A32AlbProEsp, A30AlbProCod, A1261BarAlbKgmE, A1262BarPreKgm, A1263BarAlbMtrE, A1264BarPreMtr, A1275FasKgm, A1241GuiFasPKg, A1276FasMtr, A1242GuiFasPMt, AV180Moda21, A1294FacBarCod, A1295FacBarReo, A1296FacBarPar, A430FacCod, AV198Sicsv, AV43carpeta, AV90CosTiR, AV211Tiempo_m, AV214TipmaqCod, AV112fecteo, AV125hnd, AV119Fornumcol, AV18BarCosPro, AV17BarCosAny) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrSubfile1_refresh_invoke */
   }

   public void gxnrsubfile2_newrow_invoke( )
   {
      nRC_GXsfl_144 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_144"))) ;
      nGXsfl_144_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_144_idx"))) ;
      sGXsfl_144_idx = httpContext.GetPar( "sGXsfl_144_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrsubfile2_newrow( ) ;
      /* End function gxnrSubfile2_newrow_invoke */
   }

   public void gxgrsubfile2_refresh_invoke( )
   {
      subSubfile1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subSubfile1_Rows"))) ;
      subSubfile2_Rows = (int)(GXutil.lval( httpContext.GetPar( "subSubfile2_Rows"))) ;
      AV198Sicsv = (byte)(GXutil.lval( httpContext.GetPar( "Sicsv"))) ;
      AV43carpeta = httpContext.GetPar( "carpeta") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A758ProCod = httpContext.GetPar( "ProCod") ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV97EmprCod = httpContext.GetPar( "EmprCod") ;
      AV9BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV13BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV11BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A457FasCod = httpContext.GetPar( "FasCod") ;
      A603MaqCodBis = httpContext.GetPar( "MaqCodBis") ;
      A460FasDsc = httpContext.GetPar( "FasDsc") ;
      A228BarUniMed = httpContext.GetPar( "BarUniMed") ;
      A166BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
      A184BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
      A3837BarFasKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarFasKgm"), ".") ;
      n3837BarFasKgm = false ;
      A5719BarFasKgT = CommonUtil.decimalVal( httpContext.GetPar( "BarFasKgT"), ".") ;
      n5719BarFasKgT = false ;
      A6173BarFasSec = httpContext.GetPar( "BarFasSec") ;
      n6173BarFasSec = false ;
      A5168FasPreMC = (short)(GXutil.lval( httpContext.GetPar( "FasPreMC"))) ;
      n5168FasPreMC = false ;
      AV90CosTiR = (byte)(GXutil.lval( httpContext.GetPar( "CosTiR"))) ;
      A215BarTieRea = CommonUtil.decimalVal( httpContext.GetPar( "BarTieRea"), ".") ;
      AV211Tiempo_m = (int)(GXutil.lval( httpContext.GetPar( "Tiempo_m"))) ;
      AV167MaqCosMin = CommonUtil.decimalVal( httpContext.GetPar( "MaqCosMin"), ".") ;
      AV166MaqCosKg = CommonUtil.decimalVal( httpContext.GetPar( "MaqCosKg"), ".") ;
      AV165MaqCosFijo = CommonUtil.decimalVal( httpContext.GetPar( "MaqCosFijo"), ".") ;
      AV214TipmaqCod = httpContext.GetPar( "TipmaqCod") ;
      A5720BarFasMtT = CommonUtil.decimalVal( httpContext.GetPar( "BarFasMtT"), ".") ;
      n5720BarFasMtT = false ;
      A3838BarFasMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarFasMtr"), ".") ;
      n3838BarFasMtr = false ;
      A216BarTieTeo = CommonUtil.decimalVal( httpContext.GetPar( "BarTieTeo"), ".") ;
      AV112fecteo = localUtil.parseDateParm( httpContext.GetPar( "fecteo")) ;
      AV225tteo = CommonUtil.decimalVal( httpContext.GetPar( "tteo"), ".") ;
      A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      n252CliCod = false ;
      A212BarSer = httpContext.GetPar( "BarSer") ;
      AV125hnd = GXutil.lval( httpContext.GetPar( "hnd")) ;
      A135BarColNom = httpContext.GetPar( "BarColNom") ;
      A136BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      A218BarTipCol = (byte)(GXutil.lval( httpContext.GetPar( "BarTipCol"))) ;
      AV119Fornumcol = (int)(GXutil.lval( httpContext.GetPar( "Fornumcol"))) ;
      A217BarTipArt = (short)(GXutil.lval( httpContext.GetPar( "BarTipArt"))) ;
      n217BarTipArt = false ;
      AV122Grdtipart = (short)(GXutil.lval( httpContext.GetPar( "Grdtipart"))) ;
      AV209teotixfi = (short)(GXutil.lval( httpContext.GetPar( "teotixfi"))) ;
      A150BarFacTin = httpContext.GetPar( "BarFacTin") ;
      AV180Moda21 = (byte)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      A165BarHorIni = (short)(GXutil.lval( httpContext.GetPar( "BarHorIni"))) ;
      A164BarHorFin = (short)(GXutil.lval( httpContext.GetPar( "BarHorFin"))) ;
      AV18BarCosPro = CommonUtil.decimalVal( httpContext.GetPar( "BarCosPro"), ".") ;
      AV17BarCosAny = CommonUtil.decimalVal( httpContext.GetPar( "BarCosAny"), ".") ;
      A602MaqCod = httpContext.GetPar( "MaqCod") ;
      AV163MaqCod = httpContext.GetPar( "MaqCod") ;
      A605MaqCosMin = CommonUtil.decimalVal( httpContext.GetPar( "MaqCosMin"), ".") ;
      n605MaqCosMin = false ;
      A13180MaqCosKg = CommonUtil.decimalVal( httpContext.GetPar( "MaqCosKg"), ".") ;
      n13180MaqCosKg = false ;
      A13179MaqCosFijo = CommonUtil.decimalVal( httpContext.GetPar( "MaqCosFijo"), ".") ;
      n13179MaqCosFijo = false ;
      A606MaqDsc = httpContext.GetPar( "MaqDsc") ;
      n606MaqDsc = false ;
      A1011TipMaqCod = httpContext.GetPar( "TipMaqCod") ;
      n1011TipMaqCod = false ;
      AV32BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      A656ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
      n656ParCod = false ;
      A556HisProEst = (byte)(GXutil.lval( httpContext.GetPar( "HisProEst"))) ;
      A558HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
      A561HisProLin = (int)(GXutil.lval( httpContext.GetPar( "HisProLin"))) ;
      A5605HisProTr2 = (short)(GXutil.lval( httpContext.GetPar( "HisProTr2"))) ;
      A4364GrdTipArt = (short)(GXutil.lval( httpContext.GetPar( "GrdTipArt"))) ;
      A829TipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod"))) ;
      AV39BarTipArt = (short)(GXutil.lval( httpContext.GetPar( "BarTipArt"))) ;
      AV107fec1 = localUtil.parseDateParm( httpContext.GetPar( "fec1")) ;
      AV108Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
      AV88CosteTeo = CommonUtil.decimalVal( httpContext.GetPar( "CosteTeo"), ".") ;
      AV224Traza = (byte)(GXutil.lval( httpContext.GetPar( "Traza"))) ;
      AV117FlagColor = (byte)(GXutil.lval( httpContext.GetPar( "FlagColor"))) ;
      AV120ForRelban = CommonUtil.decimalVal( httpContext.GetPar( "ForRelban"), ".") ;
      AV201Station = httpContext.GetPar( "Station") ;
      AV84CosteSimula = CommonUtil.decimalVal( httpContext.GetPar( "CosteSimula"), ".") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrsubfile2_refresh( subSubfile1_Rows, subSubfile2_Rows, AV198Sicsv, AV43carpeta, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV97EmprCod, AV9BarCod, AV13BarCodReo, AV11BarCodPar, A457FasCod, A603MaqCodBis, A460FasDsc, A228BarUniMed, A166BarKgm, A184BarMtr, A3837BarFasKgm, A5719BarFasKgT, A6173BarFasSec, A5168FasPreMC, AV90CosTiR, A215BarTieRea, AV211Tiempo_m, AV167MaqCosMin, AV166MaqCosKg, AV165MaqCosFijo, AV214TipmaqCod, A5720BarFasMtT, A3838BarFasMtr, A216BarTieTeo, AV112fecteo, AV225tteo, A252CliCod, A212BarSer, AV125hnd, A135BarColNom, A136BarColNum, A218BarTipCol, AV119Fornumcol, A217BarTipArt, AV122Grdtipart, AV209teotixfi, A150BarFacTin, AV180Moda21, A165BarHorIni, A164BarHorFin, AV18BarCosPro, AV17BarCosAny, A602MaqCod, AV163MaqCod, A605MaqCosMin, A13180MaqCosKg, A13179MaqCosFijo, A606MaqDsc, A1011TipMaqCod, AV32BarOrdLin, A656ParCod, A556HisProEst, A558HisProFec, A561HisProLin, A5605HisProTr2, A4364GrdTipArt, A829TipArtCod, AV39BarTipArt, AV107fec1, AV108Fec2, AV88CosteTeo, AV224Traza, AV117FlagColor, AV120ForRelban, AV201Station, AV84CosteSimula) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrSubfile2_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpage");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
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
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa2CY2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2CY2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.analisecustoww", new String[] {}, new String[] {}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFEC1", getSecureSignedToken( "", AV107fec1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFEC2", getSecureSignedToken( "", AV108Fec2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTETEO", getSecureSignedToken( "", localUtil.format( AV88CosteTeo, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAZA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV224Traza), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCOLOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV117FlagColor), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORRELBAN", getSecureSignedToken( "", localUtil.format( AV120ForRelban, "ZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV201Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTESIMULA", getSecureSignedToken( "", localUtil.format( AV84CosteSimula, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV180Moda21), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSICSV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV198Sicsv), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARPETA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43carpeta, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTIR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV90CosTiR), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIEMPO_M", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV211Tiempo_m), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV214TipmaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECTEO", getSecureSignedToken( "", AV112fecteo));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHND", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV125hnd), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV119Fornumcol), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOSPRO", getSecureSignedToken( "", localUtil.format( AV18BarCosPro, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOSANY", getSecureSignedToken( "", localUtil.format( AV17BarCosAny, "ZZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_111", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_111, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_144", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_144, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD1_DATA", AV245Clicod1_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD1_DATA", AV245Clicod1_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD2_DATA", AV247Clicod2_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD2_DATA", AV247Clicod2_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vSUBFILE1PAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV244subfile1PageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSUBFILE2PAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV252subfile2PageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECGEN", localUtil.dtoc( A159BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV97EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECSAL", localUtil.dtoc( A161BarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vFEC1", localUtil.dtoc( AV107fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFEC1", getSecureSignedToken( "", AV107fec1));
      app.GxWebStd.gx_hidden_field( httpContext, "vFEC2", localUtil.dtoc( AV108Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFEC2", getSecureSignedToken( "", AV108Fec2));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKGM", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMTR", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMANCOD1", GXutil.ltrim( localUtil.ntoc( A3311BarManCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPDIS", GXutil.rtrim( A2010BarTipDis));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERDSC", GXutil.rtrim( A1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPCOL", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOSPRO", GXutil.ltrim( localUtil.ntoc( A141BarCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOSANY", GXutil.ltrim( localUtil.ntoc( A140BarCosAny, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARUNIMED", GXutil.rtrim( A228BarUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSTETEO", GXutil.ltrim( localUtil.ntoc( AV88CosteTeo, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTETEO", getSecureSignedToken( "", localUtil.format( AV88CosteTeo, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTRAZA", GXutil.ltrim( localUtil.ntoc( AV224Traza, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAZA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV224Traza), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCOLOR", GXutil.ltrim( localUtil.ntoc( AV117FlagColor, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCOLOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV117FlagColor), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORRELBAN", GXutil.ltrim( localUtil.ntoc( AV120ForRelban, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORRELBAN", getSecureSignedToken( "", localUtil.format( AV120ForRelban, "ZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV201Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV201Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSTESIMULA", GXutil.ltrim( localUtil.ntoc( AV84CosteSimula, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTESIMULA", getSecureSignedToken( "", localUtil.format( AV84CosteSimula, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIECOD", GXutil.rtrim( A200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEKIL", GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEMET", GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKGSAUT", GXutil.ltrim( localUtil.ntoc( A3275BarKgsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMTSAUT", GXutil.ltrim( localUtil.ntoc( A3276BarMtsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROESP", GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCOD", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBKGME", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPREKGM", GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBMTRE", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPREMTR", GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASKGM", GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASPKG", GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASMTR", GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASPMT", GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV180Moda21, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV180Moda21), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACBARCOD", GXutil.ltrim( localUtil.ntoc( A1294FacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACBARREO", GXutil.ltrim( localUtil.ntoc( A1295FacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACBARPAR", GXutil.rtrim( A1296FacBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOD", GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSICSV", GXutil.ltrim( localUtil.ntoc( AV198Sicsv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSICSV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV198Sicsv), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARPETA", GXutil.rtrim( AV43carpeta));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARPETA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43carpeta, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCODBIS", GXutil.rtrim( A603MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASKGM", GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASKGT", GXutil.ltrim( localUtil.ntoc( A5719BarFasKgT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASSEC", GXutil.rtrim( A6173BarFasSec));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREMC", GXutil.ltrim( localUtil.ntoc( A5168FasPreMC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSTIR", GXutil.ltrim( localUtil.ntoc( AV90CosTiR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTIR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV90CosTiR), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIEREA", GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIEMPO_M", GXutil.ltrim( localUtil.ntoc( AV211Tiempo_m, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIEMPO_M", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV211Tiempo_m), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPMAQCOD", GXutil.rtrim( AV214TipmaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV214TipmaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASMTT", GXutil.ltrim( localUtil.ntoc( A5720BarFasMtT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASMTR", GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIETEO", GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECTEO", localUtil.dtoc( AV112fecteo, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECTEO", getSecureSignedToken( "", AV112fecteo));
      app.GxWebStd.gx_hidden_field( httpContext, "vHND", GXutil.ltrim( localUtil.ntoc( AV125hnd, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHND", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV125hnd), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV119Fornumcol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV119Fornumcol), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPART", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFACTIN", GXutil.rtrim( A150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHORINI", GXutil.ltrim( localUtil.ntoc( A165BarHorIni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARHORFIN", GXutil.ltrim( localUtil.ntoc( A164BarHorFin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOSPRO", GXutil.ltrim( localUtil.ntoc( AV18BarCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOSPRO", getSecureSignedToken( "", localUtil.format( AV18BarCosPro, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOSANY", GXutil.ltrim( localUtil.ntoc( AV17BarCosAny, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOSANY", getSecureSignedToken( "", localUtil.format( AV17BarCosAny, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOSMIN", GXutil.ltrim( localUtil.ntoc( A605MaqCosMin, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOSKG", GXutil.ltrim( localUtil.ntoc( A13180MaqCosKg, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOSFIJO", GXutil.ltrim( localUtil.ntoc( A13179MaqCosFijo, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDSC", GXutil.rtrim( A606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPMAQCOD", GXutil.rtrim( A1011TipMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PARCOD", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROEST", GXutil.ltrim( localUtil.ntoc( A556HisProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROFEC", localUtil.dtoc( A558HisProFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROLIN", GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROTR2", GXutil.ltrim( localUtil.ntoc( A5605HisProTr2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRDTIPART", GXutil.ltrim( localUtil.ntoc( A4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPARTCOD", GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( SUBFILE1_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( SUBFILE2_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_nEOF", GXutil.ltrim( localUtil.ntoc( SUBFILE1_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_nEOF", GXutil.ltrim( localUtil.ntoc( SUBFILE2_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_Rows", GXutil.ltrim( localUtil.ntoc( subSubfile1_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_Rows", GXutil.ltrim( localUtil.ntoc( subSubfile2_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD1_Cls", GXutil.rtrim( Combo_clicod1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD1_Selectedvalue_set", GXutil.rtrim( Combo_clicod1_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD1_Emptyitemtext", GXutil.rtrim( Combo_clicod1_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD2_Cls", GXutil.rtrim( Combo_clicod2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD2_Selectedvalue_set", GXutil.rtrim( Combo_clicod2_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD2_Emptyitemtext", GXutil.rtrim( Combo_clicod2_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Width", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autowidth", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoheight", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Cls", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Title", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsible", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsed", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Iconposition", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Width", GXutil.rtrim( Dvpanel_panel_filtros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autowidth", GXutil.booltostr( Dvpanel_panel_filtros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoheight", GXutil.booltostr( Dvpanel_panel_filtros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Cls", GXutil.rtrim( Dvpanel_panel_filtros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Title", GXutil.rtrim( Dvpanel_panel_filtros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsible", GXutil.booltostr( Dvpanel_panel_filtros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsed", GXutil.booltostr( Dvpanel_panel_filtros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Iconposition", GXutil.rtrim( Dvpanel_panel_filtros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtros_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Class", GXutil.rtrim( Subfile1paginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Showfirst", GXutil.booltostr( Subfile1paginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Showprevious", GXutil.booltostr( Subfile1paginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Shownext", GXutil.booltostr( Subfile1paginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Showlast", GXutil.booltostr( Subfile1paginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Subfile1paginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Subfile1paginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Subfile1paginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Emptygridclass", GXutil.rtrim( Subfile1paginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Subfile1paginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Subfile1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Subfile1paginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Previous", GXutil.rtrim( Subfile1paginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Next", GXutil.rtrim( Subfile1paginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Caption", GXutil.rtrim( Subfile1paginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Subfile1paginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Subfile1paginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Class", GXutil.rtrim( Subfile2paginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Showfirst", GXutil.booltostr( Subfile2paginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Showprevious", GXutil.booltostr( Subfile2paginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Shownext", GXutil.booltostr( Subfile2paginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Showlast", GXutil.booltostr( Subfile2paginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Subfile2paginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Subfile2paginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Subfile2paginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Emptygridclass", GXutil.rtrim( Subfile2paginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Subfile2paginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Subfile2paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Subfile2paginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Previous", GXutil.rtrim( Subfile2paginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Next", GXutil.rtrim( Subfile2paginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Caption", GXutil.rtrim( Subfile2paginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Subfile2paginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Subfile2paginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Width", GXutil.rtrim( Dvpanel_panel_resultado_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autowidth", GXutil.booltostr( Dvpanel_panel_resultado_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autoheight", GXutil.booltostr( Dvpanel_panel_resultado_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Cls", GXutil.rtrim( Dvpanel_panel_resultado_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Title", GXutil.rtrim( Dvpanel_panel_resultado_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Collapsible", GXutil.booltostr( Dvpanel_panel_resultado_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Collapsed", GXutil.booltostr( Dvpanel_panel_resultado_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_resultado_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Iconposition", GXutil.rtrim( Dvpanel_panel_resultado_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autoscroll", GXutil.booltostr( Dvpanel_panel_resultado_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_EMPOWERER_Gridinternalname", GXutil.rtrim( Subfile1_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_EMPOWERER_Gridinternalname", GXutil.rtrim( Subfile2_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_Rows", GXutil.ltrim( localUtil.ntoc( subSubfile1_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_Rows", GXutil.ltrim( localUtil.ntoc( subSubfile2_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Selectedpage", GXutil.rtrim( Subfile1paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Subfile1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Selectedpage", GXutil.rtrim( Subfile2paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Subfile2paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD2_Selectedvalue_get", GXutil.rtrim( Combo_clicod2_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD1_Selectedvalue_get", GXutil.rtrim( Combo_clicod1_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALOR_Title", GXutil.rtrim( edtavValor_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_Rows", GXutil.ltrim( localUtil.ntoc( subSubfile1_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_Rows", GXutil.ltrim( localUtil.ntoc( subSubfile2_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Selectedpage", GXutil.rtrim( Subfile1paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Subfile1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Selectedpage", GXutil.rtrim( Subfile2paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Subfile2paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD1_Selectedvalue_get", GXutil.rtrim( Combo_clicod1_Selectedvalue_get));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
      httpContext.writeText( "<script type=\"text/javascript\">") ;
      httpContext.writeText( "gx.setLanguageCode(\""+httpContext.getLanguageProperty( "code")+"\");") ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         httpContext.writeText( "gx.setDateFormat(\""+httpContext.getLanguageProperty( "date_fmt")+"\");") ;
         httpContext.writeText( "gx.setTimeFormat("+httpContext.getLanguageProperty( "time_fmt")+");") ;
         httpContext.writeText( "gx.setCenturyFirstYear("+40+");") ;
         httpContext.writeText( "gx.setDecimalPoint(\""+httpContext.getLanguageProperty( "decimal_point")+"\");") ;
         httpContext.writeText( "gx.setThousandSeparator(\""+httpContext.getLanguageProperty( "thousand_sep")+"\");") ;
         httpContext.writeText( "gx.StorageTimeZone = "+2+";") ;
      }
      httpContext.writeText( "</script>") ;
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we2CY2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2CY2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.facturacion.analisecustoww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.AnaliseCustoWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Analise Custo", "") ;
   }

   public void wb2CY0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtros.setProperty("Width", Dvpanel_panel_filtros_Width);
         ucDvpanel_panel_filtros.setProperty("AutoWidth", Dvpanel_panel_filtros_Autowidth);
         ucDvpanel_panel_filtros.setProperty("AutoHeight", Dvpanel_panel_filtros_Autoheight);
         ucDvpanel_panel_filtros.setProperty("Cls", Dvpanel_panel_filtros_Cls);
         ucDvpanel_panel_filtros.setProperty("Title", Dvpanel_panel_filtros_Title);
         ucDvpanel_panel_filtros.setProperty("Collapsible", Dvpanel_panel_filtros_Collapsible);
         ucDvpanel_panel_filtros.setProperty("Collapsed", Dvpanel_panel_filtros_Collapsed);
         ucDvpanel_panel_filtros.setProperty("ShowCollapseIcon", Dvpanel_panel_filtros_Showcollapseicon);
         ucDvpanel_panel_filtros.setProperty("IconPosition", Dvpanel_panel_filtros_Iconposition);
         ucDvpanel_panel_filtros.setProperty("AutoScroll", Dvpanel_panel_filtros_Autoscroll);
         ucDvpanel_panel_filtros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtros_Internalname, "DVPANEL_PANEL_FILTROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSContainer"+"Panel_Filtros"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtrosgenerales.setProperty("Width", Dvpanel_panel_filtrosgenerales_Width);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoWidth", Dvpanel_panel_filtrosgenerales_Autowidth);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoHeight", Dvpanel_panel_filtrosgenerales_Autoheight);
         ucDvpanel_panel_filtrosgenerales.setProperty("Cls", Dvpanel_panel_filtrosgenerales_Cls);
         ucDvpanel_panel_filtrosgenerales.setProperty("Title", Dvpanel_panel_filtrosgenerales_Title);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsible", Dvpanel_panel_filtrosgenerales_Collapsible);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsed", Dvpanel_panel_filtrosgenerales_Collapsed);
         ucDvpanel_panel_filtrosgenerales.setProperty("ShowCollapseIcon", Dvpanel_panel_filtrosgenerales_Showcollapseicon);
         ucDvpanel_panel_filtrosgenerales.setProperty("IconPosition", Dvpanel_panel_filtrosgenerales_Iconposition);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoScroll", Dvpanel_panel_filtrosgenerales_Autoscroll);
         ucDvpanel_panel_filtrosgenerales.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtrosgenerales_Internalname, "DVPANEL_PANEL_FILTROSGENERALESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSGENERALESContainer"+"Panel_FiltrosGenerales"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicod1_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicod1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicod1.setProperty("Caption", Combo_clicod1_Caption);
         ucCombo_clicod1.setProperty("Cls", Combo_clicod1_Cls);
         ucCombo_clicod1.setProperty("EmptyItemText", Combo_clicod1_Emptyitemtext);
         ucCombo_clicod1.setProperty("DropDownOptionsData", AV245Clicod1_Data);
         ucCombo_clicod1.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod1_Internalname, "COMBO_CLICOD1Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicod2_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicod2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicod2.setProperty("Caption", Combo_clicod2_Caption);
         ucCombo_clicod2.setProperty("Cls", Combo_clicod2_Cls);
         ucCombo_clicod2.setProperty("EmptyItemText", Combo_clicod2_Emptyitemtext);
         ucCombo_clicod2.setProperty("DropDownOptionsData", AV247Clicod2_Data);
         ucCombo_clicod2.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod2_Internalname, "COMBO_CLICOD2Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFec3_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFec3_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec3_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec3_Internalname, localUtil.format(AV109Fec3, "99/99/99"), localUtil.format( AV109Fec3, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec3_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFec3_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec3_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec3_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFec4_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFec4_Internalname, httpContext.getMessage( "Fecha final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec4_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec4_Internalname, localUtil.format(AV110Fec4, "99/99/99"), localUtil.format( AV110Fec4, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec4_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFec4_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec4_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec4_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcod_Internalname, httpContext.getMessage( "Código Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod_Internalname, GXutil.rtrim( AV7Artcod), GXutil.rtrim( localUtil.format( AV7Artcod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod1_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV10Barcod1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10Barcod1), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10Barcod1), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod1_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo1_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo1_Internalname, GXutil.ltrim( localUtil.ntoc( AV14Barcodreo1, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14Barcodreo1), "9") : localUtil.format( DecimalUtil.doubleToDec(AV14Barcodreo1), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo1_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar1_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar1_Internalname, GXutil.rtrim( AV12Barcodpar1), GXutil.rtrim( localUtil.format( AV12Barcodpar1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar1_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSimulador_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSimulador_Internalname, httpContext.getMessage( "Simulador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSimulador_Internalname, GXutil.ltrim( localUtil.ntoc( AV199Simulador, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSimulador_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV199Simulador), "9") : localUtil.format( DecimalUtil.doubleToDec(AV199Simulador), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSimulador_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSimulador_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBardisnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBardisnum_Internalname, httpContext.getMessage( "Disposicion Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBardisnum_Internalname, GXutil.rtrim( AV21Bardisnum), GXutil.rtrim( localUtil.format( AV21Bardisnum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBardisnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBardisnum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmancod1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmancod1_Internalname, httpContext.getMessage( "Manufacturador 1 (Bobinador)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmancod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV29BarMancod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmancod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV29BarMancod1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV29BarMancod1), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmancod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmancod1_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_acciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "gx.evt.setGridEvt("+GXutil.str( 111, 3, 0)+","+"null"+");", httpContext.getMessage( "Ver resultados", ""), bttBtnresultados_Jsonclick, 7, httpContext.getMessage( "Ver resultados", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112cy1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexcel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 111, 3, 0)+","+"null"+");", httpContext.getMessage( "Excel", ""), bttBtnexcel_Jsonclick, 7, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e122cy1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "gx.evt.setGridEvt("+GXutil.str( 111, 3, 0)+","+"null"+");", httpContext.getMessage( "PDF", ""), bttBtnpdf_Jsonclick, 7, httpContext.getMessage( "PDF", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e132cy1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 111, 3, 0)+","+"null"+");", httpContext.getMessage( "CSV", ""), bttBtncsv_Jsonclick, 7, httpContext.getMessage( "CSV", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e142cy1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 111, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e152cy1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_progress_Internalname, 1, 0, "px", 0, "px", "Table_ProgressBar", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucProgressbar.render(context, "gxprogressindicator", Progressbar_Internalname, "PROGRESSBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_resultado.setProperty("Width", Dvpanel_panel_resultado_Width);
         ucDvpanel_panel_resultado.setProperty("AutoWidth", Dvpanel_panel_resultado_Autowidth);
         ucDvpanel_panel_resultado.setProperty("AutoHeight", Dvpanel_panel_resultado_Autoheight);
         ucDvpanel_panel_resultado.setProperty("Cls", Dvpanel_panel_resultado_Cls);
         ucDvpanel_panel_resultado.setProperty("Title", Dvpanel_panel_resultado_Title);
         ucDvpanel_panel_resultado.setProperty("Collapsible", Dvpanel_panel_resultado_Collapsible);
         ucDvpanel_panel_resultado.setProperty("Collapsed", Dvpanel_panel_resultado_Collapsed);
         ucDvpanel_panel_resultado.setProperty("ShowCollapseIcon", Dvpanel_panel_resultado_Showcollapseicon);
         ucDvpanel_panel_resultado.setProperty("IconPosition", Dvpanel_panel_resultado_Iconposition);
         ucDvpanel_panel_resultado.setProperty("AutoScroll", Dvpanel_panel_resultado_Autoscroll);
         ucDvpanel_panel_resultado.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_resultado_Internalname, "DVPANEL_PANEL_RESULTADOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_RESULTADOContainer"+"Panel_Resultado"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_resultado_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divSubfile1tablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Subfile1Container.SetWrapped(nGXWrapped);
         startgridcontrol111( ) ;
      }
      if ( wbEnd == 111 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_111 = (int)(nGXsfl_111_idx-1) ;
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Subfile1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Subfile1", Subfile1Container, subSubfile1_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Subfile1ContainerData", Subfile1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Subfile1ContainerData"+"V", Subfile1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Subfile1ContainerData"+"V"+"\" value='"+Subfile1Container.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucSubfile1paginationbar.setProperty("Class", Subfile1paginationbar_Class);
         ucSubfile1paginationbar.setProperty("ShowFirst", Subfile1paginationbar_Showfirst);
         ucSubfile1paginationbar.setProperty("ShowPrevious", Subfile1paginationbar_Showprevious);
         ucSubfile1paginationbar.setProperty("ShowNext", Subfile1paginationbar_Shownext);
         ucSubfile1paginationbar.setProperty("ShowLast", Subfile1paginationbar_Showlast);
         ucSubfile1paginationbar.setProperty("PagesToShow", Subfile1paginationbar_Pagestoshow);
         ucSubfile1paginationbar.setProperty("PagingButtonsPosition", Subfile1paginationbar_Pagingbuttonsposition);
         ucSubfile1paginationbar.setProperty("PagingCaptionPosition", Subfile1paginationbar_Pagingcaptionposition);
         ucSubfile1paginationbar.setProperty("EmptyGridClass", Subfile1paginationbar_Emptygridclass);
         ucSubfile1paginationbar.setProperty("RowsPerPageSelector", Subfile1paginationbar_Rowsperpageselector);
         ucSubfile1paginationbar.setProperty("RowsPerPageOptions", Subfile1paginationbar_Rowsperpageoptions);
         ucSubfile1paginationbar.setProperty("Previous", Subfile1paginationbar_Previous);
         ucSubfile1paginationbar.setProperty("Next", Subfile1paginationbar_Next);
         ucSubfile1paginationbar.setProperty("Caption", Subfile1paginationbar_Caption);
         ucSubfile1paginationbar.setProperty("EmptyGridCaption", Subfile1paginationbar_Emptygridcaption);
         ucSubfile1paginationbar.setProperty("RowsPerPageCaption", Subfile1paginationbar_Rowsperpagecaption);
         ucSubfile1paginationbar.setProperty("CurrentPage", AV243subfile1CurrentPage);
         ucSubfile1paginationbar.setProperty("PageCount", AV244subfile1PageCount);
         ucSubfile1paginationbar.render(context, "dvelop.dvpaginationbar", Subfile1paginationbar_Internalname, "SUBFILE1PAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divSubfile2tablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Subfile2Container.SetWrapped(nGXWrapped);
         startgridcontrol144( ) ;
      }
      if ( wbEnd == 144 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_144 = (int)(nGXsfl_144_idx-1) ;
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Subfile2Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Subfile2", Subfile2Container, subSubfile2_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Subfile2ContainerData", Subfile2Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Subfile2ContainerData"+"V", Subfile2Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Subfile2ContainerData"+"V"+"\" value='"+Subfile2Container.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucSubfile2paginationbar.setProperty("Class", Subfile2paginationbar_Class);
         ucSubfile2paginationbar.setProperty("ShowFirst", Subfile2paginationbar_Showfirst);
         ucSubfile2paginationbar.setProperty("ShowPrevious", Subfile2paginationbar_Showprevious);
         ucSubfile2paginationbar.setProperty("ShowNext", Subfile2paginationbar_Shownext);
         ucSubfile2paginationbar.setProperty("ShowLast", Subfile2paginationbar_Showlast);
         ucSubfile2paginationbar.setProperty("PagesToShow", Subfile2paginationbar_Pagestoshow);
         ucSubfile2paginationbar.setProperty("PagingButtonsPosition", Subfile2paginationbar_Pagingbuttonsposition);
         ucSubfile2paginationbar.setProperty("PagingCaptionPosition", Subfile2paginationbar_Pagingcaptionposition);
         ucSubfile2paginationbar.setProperty("EmptyGridClass", Subfile2paginationbar_Emptygridclass);
         ucSubfile2paginationbar.setProperty("RowsPerPageSelector", Subfile2paginationbar_Rowsperpageselector);
         ucSubfile2paginationbar.setProperty("RowsPerPageOptions", Subfile2paginationbar_Rowsperpageoptions);
         ucSubfile2paginationbar.setProperty("Previous", Subfile2paginationbar_Previous);
         ucSubfile2paginationbar.setProperty("Next", Subfile2paginationbar_Next);
         ucSubfile2paginationbar.setProperty("Caption", Subfile2paginationbar_Caption);
         ucSubfile2paginationbar.setProperty("EmptyGridCaption", Subfile2paginationbar_Emptygridcaption);
         ucSubfile2paginationbar.setProperty("RowsPerPageCaption", Subfile2paginationbar_Rowsperpagecaption);
         ucSubfile2paginationbar.setProperty("CurrentPage", AV251subfile2CurrentPage);
         ucSubfile2paginationbar.setProperty("PageCount", AV252subfile2PageCount);
         ucSubfile2paginationbar.render(context, "dvelop.dvpaginationbar", Subfile2paginationbar_Internalname, "SUBFILE2PAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV258Pgmname), GXutil.rtrim( localUtil.format( AV258Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV46Clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46Clicod1), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,182);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod1_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod1_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod2_Internalname, GXutil.ltrim( localUtil.ntoc( AV47Clicod2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47Clicod2), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,183);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod2_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod2_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSubfile1currentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV243subfile1CurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV243subfile1CurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSubfile1currentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavSubfile1currentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'" + sGXsfl_111_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSubfile2currentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV251subfile2CurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV251subfile2CurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSubfile2currentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavSubfile2currentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\AnaliseCustoWW.htm");
         /* User Defined Control */
         ucSubfile1_empowerer.render(context, "wwp.gridempowerer", Subfile1_empowerer_Internalname, "SUBFILE1_EMPOWERERContainer");
         /* User Defined Control */
         ucSubfile2_empowerer.render(context, "wwp.gridempowerer", Subfile2_empowerer_Internalname, "SUBFILE2_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 111 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Subfile1Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Subfile1Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Subfile1", Subfile1Container, subSubfile1_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Subfile1ContainerData", Subfile1Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Subfile1ContainerData"+"V", Subfile1Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Subfile1ContainerData"+"V"+"\" value='"+Subfile1Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 144 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Subfile2Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Subfile2Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Subfile2", Subfile2Container, subSubfile2_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Subfile2ContainerData", Subfile2Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Subfile2ContainerData"+"V", Subfile2Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Subfile2ContainerData"+"V"+"\" value='"+Subfile2Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2CY2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "Analise Custo", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2CY0( ) ;
   }

   public void ws2CY2( )
   {
      start2CY2( ) ;
      evt2CY2( ) ;
   }

   public void evt2CY2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICOD1.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e162CY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "SUBFILE1PAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e172CY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "SUBFILE1PAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e182CY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "SUBFILE2PAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e192CY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "SUBFILE2PAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e202CY2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "SUBFILE1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_111_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_111_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_111_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1112( ) ;
                           AV254Details = httpContext.cgiGet( edtavDetails_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavDetails_Internalname, "Bitmap", ((GXutil.strcmp("", AV254Details)==0) ? AV259Details_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV254Details))), !bGXsfl_111_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavDetails_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV254Details), true);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
                              GX_FocusControl = edtavClicod_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV45CliCod = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCod), 6, 0));
                           }
                           else
                           {
                              AV45CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCod), 6, 0));
                           }
                           AV49CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV49CliNom);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
                              GX_FocusControl = edtavBarcod_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV9BarCod = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
                           }
                           else
                           {
                              AV9BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
                              GX_FocusControl = edtavBarcodreo_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV13BarCodReo = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarcodreo_Internalname, GXutil.str( AV13BarCodReo, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReo), "9")));
                           }
                           else
                           {
                              AV13BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarcodreo_Internalname, GXutil.str( AV13BarCodReo, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReo), "9")));
                           }
                           AV11BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarcodpar_Internalname, AV11BarCodPar);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV11BarCodPar, ""))));
                           AV22BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarenccli_Internalname, AV22BarEncCli);
                           AV36BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV36BarSer);
                           AV37BarSerDsc = httpContext.cgiGet( edtavBarserdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarserdsc_Internalname, AV37BarSerDsc);
                           AV15BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV15BarColNom);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
                              GX_FocusControl = edtavBarcolnum_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV16BarColNum = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarColNum), 6, 0));
                           }
                           else
                           {
                              AV16BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarColNum), 6, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrograma_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrograma_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPROGRAMA");
                              GX_FocusControl = edtavPrograma_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV196Programa = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrograma_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV196Programa), 4, 0));
                           }
                           else
                           {
                              AV196Programa = (short)(localUtil.ctol( httpContext.cgiGet( edtavPrograma_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrograma_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV196Programa), 4, 0));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARKGM");
                              GX_FocusControl = edtavBarkgm_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV28BarKgm = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarkgm_Internalname, GXutil.ltrimstr( AV28BarKgm, 9, 2));
                           }
                           else
                           {
                              AV28BarKgm = localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarkgm_Internalname, GXutil.ltrimstr( AV28BarKgm, 9, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARMTR");
                              GX_FocusControl = edtavBarmtr_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV31BarMtr = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarmtr_Internalname, GXutil.ltrimstr( AV31BarMtr, 9, 2));
                           }
                           else
                           {
                              AV31BarMtr = localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarmtr_Internalname, GXutil.ltrimstr( AV31BarMtr, 9, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCoste_p_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCoste_p_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTE_P");
                              GX_FocusControl = edtavCoste_p_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV68Coste_p = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCoste_p_Internalname, GXutil.ltrimstr( AV68Coste_p, 10, 2));
                           }
                           else
                           {
                              AV68Coste_p = localUtil.ctond( httpContext.cgiGet( edtavCoste_p_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCoste_p_Internalname, GXutil.ltrimstr( AV68Coste_p, 10, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostefab_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostefab_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEFAB");
                              GX_FocusControl = edtavCostefab_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV78CosteFab = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCostefab_Internalname, GXutil.ltrimstr( AV78CosteFab, 12, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTEFAB"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV78CosteFab, "ZZZZZZZZ9.99")));
                           }
                           else
                           {
                              AV78CosteFab = localUtil.ctond( httpContext.cgiGet( edtavCostefab_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCostefab_Internalname, GXutil.ltrimstr( AV78CosteFab, 12, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTEFAB"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV78CosteFab, "ZZZZZZZZ9.99")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR");
                              GX_FocusControl = edtavValor_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV235Valor = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV235Valor, 12, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV235Valor, "ZZZZZZZZ9.99")));
                           }
                           else
                           {
                              AV235Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV235Valor, 12, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV235Valor, "ZZZZZZZZ9.99")));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMargen_Internalname)), DecimalUtil.stringToDec("-99999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMargen_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMARGEN");
                              GX_FocusControl = edtavMargen_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV173Margen = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMargen_Internalname, GXutil.ltrimstr( AV173Margen, 12, 2));
                           }
                           else
                           {
                              AV173Margen = localUtil.ctond( httpContext.cgiGet( edtavMargen_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavMargen_Internalname, GXutil.ltrimstr( AV173Margen, 12, 2));
                           }
                           AV227TxtAlb = httpContext.cgiGet( edtavTxtalb_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavTxtalb_Internalname, AV227TxtAlb);
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavBarfecgen_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGEN");
                              GX_FocusControl = edtavBarfecgen_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV26BarFecGen = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarfecgen_Internalname, localUtil.format(AV26BarFecGen, "99/99/99"));
                           }
                           else
                           {
                              AV26BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavBarfecgen_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarfecgen_Internalname, localUtil.format(AV26BarFecGen, "99/99/99"));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavBarfecsal_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECSAL");
                              GX_FocusControl = edtavBarfecsal_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV27BarFecSal = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarfecsal_Internalname, localUtil.format(AV27BarFecSal, "99/99/99"));
                           }
                           else
                           {
                              AV27BarFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavBarfecsal_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarfecsal_Internalname, localUtil.format(AV27BarFecSal, "99/99/99"));
                           }
                           AV41BarTipDis = GXutil.upper( httpContext.cgiGet( edtavBartipdis_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBartipdis_Internalname, AV41BarTipDis);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostepold_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostepold_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEPOLD");
                              GX_FocusControl = edtavCostepold_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV82CostepOld = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCostepold_Internalname, GXutil.ltrimstr( AV82CostepOld, 10, 2));
                           }
                           else
                           {
                              AV82CostepOld = localUtil.ctond( httpContext.cgiGet( edtavCostepold_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCostepold_Internalname, GXutil.ltrimstr( AV82CostepOld, 10, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKilosppieza_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKilosppieza_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKILOSPPIEZA");
                              GX_FocusControl = edtavKilosppieza_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV136KilospPieza = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavKilosppieza_Internalname, GXutil.ltrimstr( AV136KilospPieza, 9, 2));
                           }
                           else
                           {
                              AV136KilospPieza = localUtil.ctond( httpContext.cgiGet( edtavKilosppieza_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavKilosppieza_Internalname, GXutil.ltrimstr( AV136KilospPieza, 9, 2));
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e212CY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e222CY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SUBFILE1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e232CY2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 13), "SUBFILE2.LOAD") == 0 )
                        {
                           nGXsfl_144_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_144_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_144_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1444( ) ;
                           AV25BarFasSec = httpContext.cgiGet( edtavBarfassec_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfassec_Internalname, AV25BarFasSec);
                           AV32BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarOrdLin), 4, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(AV32BarOrdLin), "ZZZ9")));
                           AV105FasDsc = httpContext.cgiGet( edtavFasdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavFasdsc_Internalname, AV105FasDsc);
                           AV163MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod_Internalname, AV163MaqCod);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, GXutil.rtrim( localUtil.format( AV163MaqCod, ""))));
                           AV168MaqDsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqdsc_Internalname, AV168MaqDsc);
                           AV231Unidades = localUtil.ctond( httpContext.cgiGet( edtavUnidades_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavUnidades_Internalname, GXutil.ltrimstr( AV231Unidades, 9, 2));
                           AV232Unidadest = (short)(localUtil.ctol( httpContext.cgiGet( edtavUnidadest_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavUnidadest_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV232Unidadest), 4, 0));
                           AV42BarUniMed = GXutil.upper( httpContext.cgiGet( edtavBarunimed_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarunimed_Internalname, AV42BarUniMed);
                           AV249Horlni_5 = httpContext.cgiGet( edtavHorlni_5_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHorlni_5_Internalname, AV249Horlni_5);
                           AV127HorFin_5 = httpContext.cgiGet( edtavHorfin_5_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHorfin_5_Internalname, AV127HorFin_5);
                           AV38BarTieRea = localUtil.ctond( httpContext.cgiGet( edtavBartierea_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBartierea_Internalname, GXutil.ltrimstr( AV38BarTieRea, 5, 2));
                           AV225tteo = localUtil.ctond( httpContext.cgiGet( edtavTteo_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavTteo_Internalname, GXutil.ltrimstr( AV225tteo, 5, 2));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTTEO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV225tteo, "Z9.99")));
                           AV167MaqCosMin = localUtil.ctond( httpContext.cgiGet( edtavMaqcosmin_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcosmin_Internalname, GXutil.ltrimstr( AV167MaqCosMin, 10, 4));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSMIN"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV167MaqCosMin, "ZZZZ9.9999")));
                           AV166MaqCosKg = localUtil.ctond( httpContext.cgiGet( edtavMaqcoskg_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcoskg_Internalname, GXutil.ltrimstr( AV166MaqCosKg, 10, 4));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSKG"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV166MaqCosKg, "ZZZZ9.9999")));
                           AV165MaqCosFijo = localUtil.ctond( httpContext.cgiGet( edtavMaqcosfijo_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcosfijo_Internalname, GXutil.ltrimstr( AV165MaqCosFijo, 10, 4));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSFIJO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV165MaqCosFijo, "ZZZZ9.9999")));
                           AV62Coste_m = (short)(localUtil.ctol( httpContext.cgiGet( edtavCoste_m_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCoste_m_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Coste_m), 4, 0));
                           AV73Coste_tm = (short)(localUtil.ctol( httpContext.cgiGet( edtavCoste_tm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCoste_tm_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73Coste_tm), 4, 0));
                           AV212TieTeo = (short)(localUtil.ctol( httpContext.cgiGet( edtavTieteo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavTieteo_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV212TieTeo), 4, 0));
                           AV104FasCod = GXutil.upper( httpContext.cgiGet( edtavFascod_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavFascod_Internalname, AV104FasCod);
                           AV69Coste_p_k = (short)(localUtil.ctol( httpContext.cgiGet( edtavCoste_p_k_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCoste_p_k_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Coste_p_k), 4, 0));
                           AV209teotixfi = (short)(localUtil.ctol( httpContext.cgiGet( edtavTeotixfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavTeotixfi_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV209teotixfi), 4, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEOTIXFI"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(AV209teotixfi), "ZZZ9")));
                           AV250Fomumcol = (short)(localUtil.ctol( httpContext.cgiGet( edtavFomumcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavFomumcol_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV250Fomumcol), 4, 0));
                           AV39BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtavBartipart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBartipart_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarTipArt), 4, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTIPART"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(AV39BarTipArt), "ZZZ9")));
                           AV122Grdtipart = (short)(localUtil.ctol( httpContext.cgiGet( edtavGrdtipart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGrdtipart_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122Grdtipart), 4, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRDTIPART"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(AV122Grdtipart), "ZZZ9")));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "SUBFILE2.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242CY4 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
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

   public void we2CY2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa2CY2( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavFec3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrsubfile1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1112( ) ;
      while ( nGXsfl_111_idx <= nRC_GXsfl_111 )
      {
         sendrow_1112( ) ;
         nGXsfl_111_idx = ((subSubfile1_Islastpage==1)&&(nGXsfl_111_idx+1>subsubfile1_fnc_recordsperpage( )) ? 1 : nGXsfl_111_idx+1) ;
         sGXsfl_111_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_111_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1112( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Subfile1Container)) ;
      /* End function gxnrSubfile1_newrow */
   }

   public void gxnrsubfile2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1444( ) ;
      while ( nGXsfl_144_idx <= nRC_GXsfl_144 )
      {
         sendrow_1444( ) ;
         nGXsfl_144_idx = ((subSubfile2_Islastpage==1)&&(nGXsfl_144_idx+1>subsubfile2_fnc_recordsperpage( )) ? 1 : nGXsfl_144_idx+1) ;
         sGXsfl_144_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_144_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1444( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Subfile2Container)) ;
      /* End function gxnrSubfile2_newrow */
   }

   public void gxgrsubfile1_refresh( int subSubfile1_Rows ,
                                     int subSubfile2_Rows ,
                                     int AV47Clicod2 ,
                                     int AV10Barcod1 ,
                                     java.util.Date AV109Fec3 ,
                                     String A396EmprCod ,
                                     int A252CliCod ,
                                     java.util.Date A159BarFecGen ,
                                     String AV97EmprCod ,
                                     int AV46Clicod1 ,
                                     java.util.Date AV110Fec4 ,
                                     String A212BarSer ,
                                     String AV7Artcod ,
                                     java.util.Date A161BarFecSal ,
                                     java.util.Date AV107fec1 ,
                                     java.util.Date AV108Fec2 ,
                                     java.math.BigDecimal A166BarKgm ,
                                     java.math.BigDecimal A184BarMtr ,
                                     short A3311BarManCod1 ,
                                     short AV29BarMancod1 ,
                                     String A143BarDisNum ,
                                     String AV21Bardisnum ,
                                     int A129BarCod ,
                                     byte A132BarCodReo ,
                                     byte AV14Barcodreo1 ,
                                     String A130BarCodPar ,
                                     String AV12Barcodpar1 ,
                                     String A2010BarTipDis ,
                                     String A1652BarSerDsc ,
                                     String A135BarColNom ,
                                     int A136BarColNum ,
                                     byte A218BarTipCol ,
                                     java.math.BigDecimal A141BarCosPro ,
                                     java.math.BigDecimal A140BarCosAny ,
                                     String A279CliNom ,
                                     String A228BarUniMed ,
                                     String A4812BarEncCli ,
                                     java.math.BigDecimal AV78CosteFab ,
                                     java.math.BigDecimal AV88CosteTeo ,
                                     byte AV224Traza ,
                                     byte AV117FlagColor ,
                                     byte AV199Simulador ,
                                     java.math.BigDecimal AV120ForRelban ,
                                     String AV201Station ,
                                     java.math.BigDecimal AV84CosteSimula ,
                                     java.math.BigDecimal AV235Valor ,
                                     String A200BarPieCod ,
                                     int AV9BarCod ,
                                     byte AV13BarCodReo ,
                                     String AV11BarCodPar ,
                                     java.math.BigDecimal A203BarPieKil ,
                                     java.math.BigDecimal A205BarPieMet ,
                                     java.math.BigDecimal A3275BarKgsAut ,
                                     java.math.BigDecimal A3276BarMtsAut ,
                                     byte A32AlbProEsp ,
                                     long A30AlbProCod ,
                                     java.math.BigDecimal A1261BarAlbKgmE ,
                                     java.math.BigDecimal A1262BarPreKgm ,
                                     java.math.BigDecimal A1263BarAlbMtrE ,
                                     java.math.BigDecimal A1264BarPreMtr ,
                                     java.math.BigDecimal A1275FasKgm ,
                                     java.math.BigDecimal A1241GuiFasPKg ,
                                     java.math.BigDecimal A1276FasMtr ,
                                     java.math.BigDecimal A1242GuiFasPMt ,
                                     byte AV180Moda21 ,
                                     int A1294FacBarCod ,
                                     byte A1295FacBarReo ,
                                     String A1296FacBarPar ,
                                     int A430FacCod ,
                                     byte AV198Sicsv ,
                                     String AV43carpeta ,
                                     byte AV90CosTiR ,
                                     int AV211Tiempo_m ,
                                     String AV214TipmaqCod ,
                                     java.util.Date AV112fecteo ,
                                     long AV125hnd ,
                                     int AV119Fornumcol ,
                                     java.math.BigDecimal AV18BarCosPro ,
                                     java.math.BigDecimal AV17BarCosAny )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e222CY2 ();
      SUBFILE1_nCurrentRecord = 0 ;
      rf2CY2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrSubfile1_refresh */
   }

   public void gxgrsubfile2_refresh( int subSubfile1_Rows ,
                                     int subSubfile2_Rows ,
                                     byte AV198Sicsv ,
                                     String AV43carpeta ,
                                     String A396EmprCod ,
                                     int A129BarCod ,
                                     byte A132BarCodReo ,
                                     String A130BarCodPar ,
                                     String A758ProCod ,
                                     short A194BarOrdLin ,
                                     String AV97EmprCod ,
                                     int AV9BarCod ,
                                     byte AV13BarCodReo ,
                                     String AV11BarCodPar ,
                                     String A457FasCod ,
                                     String A603MaqCodBis ,
                                     String A460FasDsc ,
                                     String A228BarUniMed ,
                                     java.math.BigDecimal A166BarKgm ,
                                     java.math.BigDecimal A184BarMtr ,
                                     java.math.BigDecimal A3837BarFasKgm ,
                                     java.math.BigDecimal A5719BarFasKgT ,
                                     String A6173BarFasSec ,
                                     short A5168FasPreMC ,
                                     byte AV90CosTiR ,
                                     java.math.BigDecimal A215BarTieRea ,
                                     int AV211Tiempo_m ,
                                     java.math.BigDecimal AV167MaqCosMin ,
                                     java.math.BigDecimal AV166MaqCosKg ,
                                     java.math.BigDecimal AV165MaqCosFijo ,
                                     String AV214TipmaqCod ,
                                     java.math.BigDecimal A5720BarFasMtT ,
                                     java.math.BigDecimal A3838BarFasMtr ,
                                     java.math.BigDecimal A216BarTieTeo ,
                                     java.util.Date AV112fecteo ,
                                     java.math.BigDecimal AV225tteo ,
                                     int A252CliCod ,
                                     String A212BarSer ,
                                     long AV125hnd ,
                                     String A135BarColNom ,
                                     int A136BarColNum ,
                                     byte A218BarTipCol ,
                                     int AV119Fornumcol ,
                                     short A217BarTipArt ,
                                     short AV122Grdtipart ,
                                     short AV209teotixfi ,
                                     String A150BarFacTin ,
                                     byte AV180Moda21 ,
                                     short A165BarHorIni ,
                                     short A164BarHorFin ,
                                     java.math.BigDecimal AV18BarCosPro ,
                                     java.math.BigDecimal AV17BarCosAny ,
                                     String A602MaqCod ,
                                     String AV163MaqCod ,
                                     java.math.BigDecimal A605MaqCosMin ,
                                     java.math.BigDecimal A13180MaqCosKg ,
                                     java.math.BigDecimal A13179MaqCosFijo ,
                                     String A606MaqDsc ,
                                     String A1011TipMaqCod ,
                                     short AV32BarOrdLin ,
                                     short A656ParCod ,
                                     byte A556HisProEst ,
                                     java.util.Date A558HisProFec ,
                                     int A561HisProLin ,
                                     short A5605HisProTr2 ,
                                     short A4364GrdTipArt ,
                                     short A829TipArtCod ,
                                     short AV39BarTipArt ,
                                     java.util.Date AV107fec1 ,
                                     java.util.Date AV108Fec2 ,
                                     java.math.BigDecimal AV88CosteTeo ,
                                     byte AV224Traza ,
                                     byte AV117FlagColor ,
                                     java.math.BigDecimal AV120ForRelban ,
                                     String AV201Station ,
                                     java.math.BigDecimal AV84CosteSimula )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e222CY2 ();
      SUBFILE2_nCurrentRecord = 0 ;
      rf2CY4( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrSubfile2_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTEFAB", getSecureSignedToken( "", localUtil.format( AV78CosteFab, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSTEFAB", GXutil.ltrim( localUtil.ntoc( AV78CosteFab, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR", getSecureSignedToken( "", localUtil.format( AV235Valor, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALOR", GXutil.ltrim( localUtil.ntoc( AV235Valor, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV13BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV11BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSMIN", getSecureSignedToken( "", localUtil.format( AV167MaqCosMin, "ZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOSMIN", GXutil.ltrim( localUtil.ntoc( AV167MaqCosMin, (byte)(10), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSKG", getSecureSignedToken( "", localUtil.format( AV166MaqCosKg, "ZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOSKG", GXutil.ltrim( localUtil.ntoc( AV166MaqCosKg, (byte)(10), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSFIJO", getSecureSignedToken( "", localUtil.format( AV165MaqCosFijo, "ZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOSFIJO", GXutil.ltrim( localUtil.ntoc( AV165MaqCosFijo, (byte)(10), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTTEO", getSecureSignedToken( "", localUtil.format( AV225tteo, "Z9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTTEO", GXutil.ltrim( localUtil.ntoc( AV225tteo, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRDTIPART", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV122Grdtipart), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRDTIPART", GXutil.ltrim( localUtil.ntoc( AV122Grdtipart, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEOTIXFI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV209teotixfi), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEOTIXFI", GXutil.ltrim( localUtil.ntoc( AV209teotixfi, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV163MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV163MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV32BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTIPART", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39BarTipArt), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTIPART", GXutil.ltrim( localUtil.ntoc( AV39BarTipArt, (byte)(4), (byte)(0), ".", "")));
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
      rf2CY2( ) ;
      rf2CY4( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV258Pgmname = "Facturacion.AnaliseCustoWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV258Pgmname", AV258Pgmname);
      Gx_err = (short)(0) ;
      Gx_date = GXutil.today( ) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavPrograma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrograma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrograma_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCoste_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCoste_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_p_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCostefab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCostefab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostefab_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavValor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavMargen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMargen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMargen_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavTxtalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTxtalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTxtalb_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarfecgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfecgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecgen_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarfecsal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfecsal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecsal_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBartipdis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipdis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipdis_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCostepold_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCostepold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostepold_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavKilosppieza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKilosppieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKilosppieza_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarfassec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfassec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfassec_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavBarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlin_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavUnidades_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUnidades_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUnidades_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavUnidadest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUnidadest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUnidadest_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavHorlni_5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHorlni_5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorlni_5_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavHorfin_5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHorfin_5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorfin_5_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavBartierea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartierea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartierea_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavTteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTteo_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavMaqcosmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcosmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcosmin_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavMaqcoskg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcoskg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcoskg_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavMaqcosfijo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcosfijo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcosfijo_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavCoste_m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCoste_m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_m_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavCoste_tm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCoste_tm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_tm_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavTieteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTieteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTieteo_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavFascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavCoste_p_k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCoste_p_k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_p_k_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavTeotixfi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTeotixfi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTeotixfi_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavFomumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFomumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFomumcol_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavBartipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipart_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavGrdtipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrdtipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrdtipart_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2CY2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Subfile1Container.ClearRows();
      }
      wbStart = (short)(111) ;
      /* Execute user event: Refresh */
      e222CY2 ();
      nGXsfl_111_idx = 1 ;
      sGXsfl_111_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_111_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1112( ) ;
      bGXsfl_111_Refreshing = true ;
      Subfile1Container.AddObjectProperty("GridName", "Subfile1");
      Subfile1Container.AddObjectProperty("CmpContext", "");
      Subfile1Container.AddObjectProperty("InMasterPage", "false");
      Subfile1Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      Subfile1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Subfile1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Subfile1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subSubfile1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Subfile1Container.setPageSize( subsubfile1_fnc_recordsperpage( ) );
      if ( subSubfile1_Islastpage != 0 )
      {
         SUBFILE1_nFirstRecordOnPage = (long)(subsubfile1_fnc_recordcount( )-subsubfile1_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( SUBFILE1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         Subfile1Container.AddObjectProperty("SUBFILE1_nFirstRecordOnPage", SUBFILE1_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1112( ) ;
         e232CY2 ();
         if ( ( SUBFILE1_nCurrentRecord > 0 ) && ( SUBFILE1_nGridOutOfScope == 0 ) && ( nGXsfl_111_idx == 1 ) )
         {
            SUBFILE1_nCurrentRecord = 0 ;
            SUBFILE1_nGridOutOfScope = 1 ;
            subsubfile1_firstpage( ) ;
            e232CY2 ();
         }
         wbEnd = (short)(111) ;
         wb2CY0( ) ;
      }
      bGXsfl_111_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2CY2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV97EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFEC1", localUtil.dtoc( AV107fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFEC1", getSecureSignedToken( "", AV107fec1));
      app.GxWebStd.gx_hidden_field( httpContext, "vFEC2", localUtil.dtoc( AV108Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFEC2", getSecureSignedToken( "", AV108Fec2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTEFAB"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV78CosteFab, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSTETEO", GXutil.ltrim( localUtil.ntoc( AV88CosteTeo, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTETEO", getSecureSignedToken( "", localUtil.format( AV88CosteTeo, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTRAZA", GXutil.ltrim( localUtil.ntoc( AV224Traza, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAZA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV224Traza), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCOLOR", GXutil.ltrim( localUtil.ntoc( AV117FlagColor, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCOLOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV117FlagColor), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORRELBAN", GXutil.ltrim( localUtil.ntoc( AV120ForRelban, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORRELBAN", getSecureSignedToken( "", localUtil.format( AV120ForRelban, "ZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV201Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV201Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSTESIMULA", GXutil.ltrim( localUtil.ntoc( AV84CosteSimula, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTESIMULA", getSecureSignedToken( "", localUtil.format( AV84CosteSimula, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV235Valor, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV11BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV180Moda21, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV180Moda21), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSICSV", GXutil.ltrim( localUtil.ntoc( AV198Sicsv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSICSV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV198Sicsv), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARPETA", GXutil.rtrim( AV43carpeta));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARPETA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43carpeta, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSTIR", GXutil.ltrim( localUtil.ntoc( AV90CosTiR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTIR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV90CosTiR), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIEMPO_M", GXutil.ltrim( localUtil.ntoc( AV211Tiempo_m, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIEMPO_M", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV211Tiempo_m), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPMAQCOD", GXutil.rtrim( AV214TipmaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV214TipmaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECTEO", localUtil.dtoc( AV112fecteo, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECTEO", getSecureSignedToken( "", AV112fecteo));
      app.GxWebStd.gx_hidden_field( httpContext, "vHND", GXutil.ltrim( localUtil.ntoc( AV125hnd, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHND", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV125hnd), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV119Fornumcol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV119Fornumcol), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOSPRO", GXutil.ltrim( localUtil.ntoc( AV18BarCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOSPRO", getSecureSignedToken( "", localUtil.format( AV18BarCosPro, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOSANY", GXutil.ltrim( localUtil.ntoc( AV17BarCosAny, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOSANY", getSecureSignedToken( "", localUtil.format( AV17BarCosAny, "ZZZZZZ9.99")));
   }

   public void rf2CY4( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Subfile2Container.ClearRows();
      }
      wbStart = (short)(144) ;
      nGXsfl_144_idx = 1 ;
      sGXsfl_144_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_144_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1444( ) ;
      bGXsfl_144_Refreshing = true ;
      Subfile2Container.AddObjectProperty("GridName", "Subfile2");
      Subfile2Container.AddObjectProperty("CmpContext", "");
      Subfile2Container.AddObjectProperty("InMasterPage", "false");
      Subfile2Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Subfile2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Subfile2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Subfile2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subSubfile2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Subfile2Container.setPageSize( subsubfile2_fnc_recordsperpage( ) );
      if ( subSubfile1_Islastpage != 0 )
      {
         SUBFILE1_nFirstRecordOnPage = (long)(subsubfile1_fnc_recordcount( )-subsubfile1_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( SUBFILE1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         Subfile1Container.AddObjectProperty("SUBFILE1_nFirstRecordOnPage", SUBFILE1_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1444( ) ;
         e242CY4 ();
         if ( ( SUBFILE2_nCurrentRecord > 0 ) && ( SUBFILE2_nGridOutOfScope == 0 ) && ( nGXsfl_144_idx == 1 ) )
         {
            SUBFILE2_nCurrentRecord = 0 ;
            SUBFILE2_nGridOutOfScope = 1 ;
            subsubfile2_firstpage( ) ;
            e242CY4 ();
         }
         wbEnd = (short)(144) ;
         wb2CY0( ) ;
      }
      bGXsfl_144_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2CY4( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSMIN"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV167MaqCosMin, "ZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSKG"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV166MaqCosKg, "ZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSFIJO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV165MaqCosFijo, "ZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTTEO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV225tteo, "Z9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRDTIPART"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(AV122Grdtipart), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEOTIXFI"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(AV209teotixfi), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, GXutil.rtrim( localUtil.format( AV163MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(AV32BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTIPART"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(AV39BarTipArt), "ZZZ9")));
   }

   public int subsubfile1_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subsubfile1_fnc_recordcount( )
   {
      return (int)(((subSubfile1_Recordcount==0) ? SUBFILE1_nFirstRecordOnPage+1 : subSubfile1_Recordcount)) ;
   }

   public int subsubfile1_fnc_recordsperpage( )
   {
      if ( subSubfile1_Rows > 0 )
      {
         return subSubfile1_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subsubfile1_fnc_currentpage( )
   {
      return (int)(((subSubfile1_Islastpage==1) ? subsubfile1_fnc_recordcount( )/ (double) (subsubfile1_fnc_recordsperpage( ))+((((int)((subsubfile1_fnc_recordcount( )) % (subsubfile1_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( SUBFILE1_nFirstRecordOnPage/ (double) (subsubfile1_fnc_recordsperpage( )))+1)) ;
   }

   public short subsubfile1_firstpage( )
   {
      SUBFILE1_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( SUBFILE1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrsubfile1_refresh( subSubfile1_Rows, subSubfile2_Rows, AV47Clicod2, AV10Barcod1, AV109Fec3, A396EmprCod, A252CliCod, A159BarFecGen, AV97EmprCod, AV46Clicod1, AV110Fec4, A212BarSer, AV7Artcod, A161BarFecSal, AV107fec1, AV108Fec2, A166BarKgm, A184BarMtr, A3311BarManCod1, AV29BarMancod1, A143BarDisNum, AV21Bardisnum, A129BarCod, A132BarCodReo, AV14Barcodreo1, A130BarCodPar, AV12Barcodpar1, A2010BarTipDis, A1652BarSerDsc, A135BarColNom, A136BarColNum, A218BarTipCol, A141BarCosPro, A140BarCosAny, A279CliNom, A228BarUniMed, A4812BarEncCli, AV78CosteFab, AV88CosteTeo, AV224Traza, AV117FlagColor, AV199Simulador, AV120ForRelban, AV201Station, AV84CosteSimula, AV235Valor, A200BarPieCod, AV9BarCod, AV13BarCodReo, AV11BarCodPar, A203BarPieKil, A205BarPieMet, A3275BarKgsAut, A3276BarMtsAut, A32AlbProEsp, A30AlbProCod, A1261BarAlbKgmE, A1262BarPreKgm, A1263BarAlbMtrE, A1264BarPreMtr, A1275FasKgm, A1241GuiFasPKg, A1276FasMtr, A1242GuiFasPMt, AV180Moda21, A1294FacBarCod, A1295FacBarReo, A1296FacBarPar, A430FacCod, AV198Sicsv, AV43carpeta, AV90CosTiR, AV211Tiempo_m, AV214TipmaqCod, AV112fecteo, AV125hnd, AV119Fornumcol, AV18BarCosPro, AV17BarCosAny) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subsubfile1_nextpage( )
   {
      if ( SUBFILE1_nEOF == 0 )
      {
         SUBFILE1_nFirstRecordOnPage = (long)(SUBFILE1_nFirstRecordOnPage+subsubfile1_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( SUBFILE1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Subfile1Container.AddObjectProperty("SUBFILE1_nFirstRecordOnPage", SUBFILE1_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrsubfile1_refresh( subSubfile1_Rows, subSubfile2_Rows, AV47Clicod2, AV10Barcod1, AV109Fec3, A396EmprCod, A252CliCod, A159BarFecGen, AV97EmprCod, AV46Clicod1, AV110Fec4, A212BarSer, AV7Artcod, A161BarFecSal, AV107fec1, AV108Fec2, A166BarKgm, A184BarMtr, A3311BarManCod1, AV29BarMancod1, A143BarDisNum, AV21Bardisnum, A129BarCod, A132BarCodReo, AV14Barcodreo1, A130BarCodPar, AV12Barcodpar1, A2010BarTipDis, A1652BarSerDsc, A135BarColNom, A136BarColNum, A218BarTipCol, A141BarCosPro, A140BarCosAny, A279CliNom, A228BarUniMed, A4812BarEncCli, AV78CosteFab, AV88CosteTeo, AV224Traza, AV117FlagColor, AV199Simulador, AV120ForRelban, AV201Station, AV84CosteSimula, AV235Valor, A200BarPieCod, AV9BarCod, AV13BarCodReo, AV11BarCodPar, A203BarPieKil, A205BarPieMet, A3275BarKgsAut, A3276BarMtsAut, A32AlbProEsp, A30AlbProCod, A1261BarAlbKgmE, A1262BarPreKgm, A1263BarAlbMtrE, A1264BarPreMtr, A1275FasKgm, A1241GuiFasPKg, A1276FasMtr, A1242GuiFasPMt, AV180Moda21, A1294FacBarCod, A1295FacBarReo, A1296FacBarPar, A430FacCod, AV198Sicsv, AV43carpeta, AV90CosTiR, AV211Tiempo_m, AV214TipmaqCod, AV112fecteo, AV125hnd, AV119Fornumcol, AV18BarCosPro, AV17BarCosAny) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((SUBFILE1_nEOF==0) ? 0 : 2)) ;
   }

   public short subsubfile1_previouspage( )
   {
      if ( SUBFILE1_nFirstRecordOnPage >= subsubfile1_fnc_recordsperpage( ) )
      {
         SUBFILE1_nFirstRecordOnPage = (long)(SUBFILE1_nFirstRecordOnPage-subsubfile1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( SUBFILE1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrsubfile1_refresh( subSubfile1_Rows, subSubfile2_Rows, AV47Clicod2, AV10Barcod1, AV109Fec3, A396EmprCod, A252CliCod, A159BarFecGen, AV97EmprCod, AV46Clicod1, AV110Fec4, A212BarSer, AV7Artcod, A161BarFecSal, AV107fec1, AV108Fec2, A166BarKgm, A184BarMtr, A3311BarManCod1, AV29BarMancod1, A143BarDisNum, AV21Bardisnum, A129BarCod, A132BarCodReo, AV14Barcodreo1, A130BarCodPar, AV12Barcodpar1, A2010BarTipDis, A1652BarSerDsc, A135BarColNom, A136BarColNum, A218BarTipCol, A141BarCosPro, A140BarCosAny, A279CliNom, A228BarUniMed, A4812BarEncCli, AV78CosteFab, AV88CosteTeo, AV224Traza, AV117FlagColor, AV199Simulador, AV120ForRelban, AV201Station, AV84CosteSimula, AV235Valor, A200BarPieCod, AV9BarCod, AV13BarCodReo, AV11BarCodPar, A203BarPieKil, A205BarPieMet, A3275BarKgsAut, A3276BarMtsAut, A32AlbProEsp, A30AlbProCod, A1261BarAlbKgmE, A1262BarPreKgm, A1263BarAlbMtrE, A1264BarPreMtr, A1275FasKgm, A1241GuiFasPKg, A1276FasMtr, A1242GuiFasPMt, AV180Moda21, A1294FacBarCod, A1295FacBarReo, A1296FacBarPar, A430FacCod, AV198Sicsv, AV43carpeta, AV90CosTiR, AV211Tiempo_m, AV214TipmaqCod, AV112fecteo, AV125hnd, AV119Fornumcol, AV18BarCosPro, AV17BarCosAny) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subsubfile1_lastpage( )
   {
      subSubfile1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrsubfile1_refresh( subSubfile1_Rows, subSubfile2_Rows, AV47Clicod2, AV10Barcod1, AV109Fec3, A396EmprCod, A252CliCod, A159BarFecGen, AV97EmprCod, AV46Clicod1, AV110Fec4, A212BarSer, AV7Artcod, A161BarFecSal, AV107fec1, AV108Fec2, A166BarKgm, A184BarMtr, A3311BarManCod1, AV29BarMancod1, A143BarDisNum, AV21Bardisnum, A129BarCod, A132BarCodReo, AV14Barcodreo1, A130BarCodPar, AV12Barcodpar1, A2010BarTipDis, A1652BarSerDsc, A135BarColNom, A136BarColNum, A218BarTipCol, A141BarCosPro, A140BarCosAny, A279CliNom, A228BarUniMed, A4812BarEncCli, AV78CosteFab, AV88CosteTeo, AV224Traza, AV117FlagColor, AV199Simulador, AV120ForRelban, AV201Station, AV84CosteSimula, AV235Valor, A200BarPieCod, AV9BarCod, AV13BarCodReo, AV11BarCodPar, A203BarPieKil, A205BarPieMet, A3275BarKgsAut, A3276BarMtsAut, A32AlbProEsp, A30AlbProCod, A1261BarAlbKgmE, A1262BarPreKgm, A1263BarAlbMtrE, A1264BarPreMtr, A1275FasKgm, A1241GuiFasPKg, A1276FasMtr, A1242GuiFasPMt, AV180Moda21, A1294FacBarCod, A1295FacBarReo, A1296FacBarPar, A430FacCod, AV198Sicsv, AV43carpeta, AV90CosTiR, AV211Tiempo_m, AV214TipmaqCod, AV112fecteo, AV125hnd, AV119Fornumcol, AV18BarCosPro, AV17BarCosAny) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subsubfile1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         SUBFILE1_nFirstRecordOnPage = (long)(subsubfile1_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         SUBFILE1_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( SUBFILE1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrsubfile1_refresh( subSubfile1_Rows, subSubfile2_Rows, AV47Clicod2, AV10Barcod1, AV109Fec3, A396EmprCod, A252CliCod, A159BarFecGen, AV97EmprCod, AV46Clicod1, AV110Fec4, A212BarSer, AV7Artcod, A161BarFecSal, AV107fec1, AV108Fec2, A166BarKgm, A184BarMtr, A3311BarManCod1, AV29BarMancod1, A143BarDisNum, AV21Bardisnum, A129BarCod, A132BarCodReo, AV14Barcodreo1, A130BarCodPar, AV12Barcodpar1, A2010BarTipDis, A1652BarSerDsc, A135BarColNom, A136BarColNum, A218BarTipCol, A141BarCosPro, A140BarCosAny, A279CliNom, A228BarUniMed, A4812BarEncCli, AV78CosteFab, AV88CosteTeo, AV224Traza, AV117FlagColor, AV199Simulador, AV120ForRelban, AV201Station, AV84CosteSimula, AV235Valor, A200BarPieCod, AV9BarCod, AV13BarCodReo, AV11BarCodPar, A203BarPieKil, A205BarPieMet, A3275BarKgsAut, A3276BarMtsAut, A32AlbProEsp, A30AlbProCod, A1261BarAlbKgmE, A1262BarPreKgm, A1263BarAlbMtrE, A1264BarPreMtr, A1275FasKgm, A1241GuiFasPKg, A1276FasMtr, A1242GuiFasPMt, AV180Moda21, A1294FacBarCod, A1295FacBarReo, A1296FacBarPar, A430FacCod, AV198Sicsv, AV43carpeta, AV90CosTiR, AV211Tiempo_m, AV214TipmaqCod, AV112fecteo, AV125hnd, AV119Fornumcol, AV18BarCosPro, AV17BarCosAny) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public int subsubfile2_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subsubfile2_fnc_recordcount( )
   {
      return (int)(((subSubfile2_Recordcount==0) ? SUBFILE2_nFirstRecordOnPage+1 : subSubfile2_Recordcount)) ;
   }

   public int subsubfile2_fnc_recordsperpage( )
   {
      if ( subSubfile2_Rows > 0 )
      {
         return subSubfile2_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subsubfile2_fnc_currentpage( )
   {
      return (int)(((subSubfile2_Islastpage==1) ? subsubfile2_fnc_recordcount( )/ (double) (subsubfile2_fnc_recordsperpage( ))+((((int)((subsubfile2_fnc_recordcount( )) % (subsubfile2_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( SUBFILE2_nFirstRecordOnPage/ (double) (subsubfile2_fnc_recordsperpage( )))+1)) ;
   }

   public short subsubfile2_firstpage( )
   {
      SUBFILE2_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( SUBFILE2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrsubfile2_refresh( subSubfile1_Rows, subSubfile2_Rows, AV198Sicsv, AV43carpeta, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV97EmprCod, AV9BarCod, AV13BarCodReo, AV11BarCodPar, A457FasCod, A603MaqCodBis, A460FasDsc, A228BarUniMed, A166BarKgm, A184BarMtr, A3837BarFasKgm, A5719BarFasKgT, A6173BarFasSec, A5168FasPreMC, AV90CosTiR, A215BarTieRea, AV211Tiempo_m, AV167MaqCosMin, AV166MaqCosKg, AV165MaqCosFijo, AV214TipmaqCod, A5720BarFasMtT, A3838BarFasMtr, A216BarTieTeo, AV112fecteo, AV225tteo, A252CliCod, A212BarSer, AV125hnd, A135BarColNom, A136BarColNum, A218BarTipCol, AV119Fornumcol, A217BarTipArt, AV122Grdtipart, AV209teotixfi, A150BarFacTin, AV180Moda21, A165BarHorIni, A164BarHorFin, AV18BarCosPro, AV17BarCosAny, A602MaqCod, AV163MaqCod, A605MaqCosMin, A13180MaqCosKg, A13179MaqCosFijo, A606MaqDsc, A1011TipMaqCod, AV32BarOrdLin, A656ParCod, A556HisProEst, A558HisProFec, A561HisProLin, A5605HisProTr2, A4364GrdTipArt, A829TipArtCod, AV39BarTipArt, AV107fec1, AV108Fec2, AV88CosteTeo, AV224Traza, AV117FlagColor, AV120ForRelban, AV201Station, AV84CosteSimula) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subsubfile2_nextpage( )
   {
      if ( SUBFILE2_nEOF == 0 )
      {
         SUBFILE2_nFirstRecordOnPage = (long)(SUBFILE2_nFirstRecordOnPage+subsubfile2_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( SUBFILE2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Subfile2Container.AddObjectProperty("SUBFILE2_nFirstRecordOnPage", SUBFILE2_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrsubfile2_refresh( subSubfile1_Rows, subSubfile2_Rows, AV198Sicsv, AV43carpeta, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV97EmprCod, AV9BarCod, AV13BarCodReo, AV11BarCodPar, A457FasCod, A603MaqCodBis, A460FasDsc, A228BarUniMed, A166BarKgm, A184BarMtr, A3837BarFasKgm, A5719BarFasKgT, A6173BarFasSec, A5168FasPreMC, AV90CosTiR, A215BarTieRea, AV211Tiempo_m, AV167MaqCosMin, AV166MaqCosKg, AV165MaqCosFijo, AV214TipmaqCod, A5720BarFasMtT, A3838BarFasMtr, A216BarTieTeo, AV112fecteo, AV225tteo, A252CliCod, A212BarSer, AV125hnd, A135BarColNom, A136BarColNum, A218BarTipCol, AV119Fornumcol, A217BarTipArt, AV122Grdtipart, AV209teotixfi, A150BarFacTin, AV180Moda21, A165BarHorIni, A164BarHorFin, AV18BarCosPro, AV17BarCosAny, A602MaqCod, AV163MaqCod, A605MaqCosMin, A13180MaqCosKg, A13179MaqCosFijo, A606MaqDsc, A1011TipMaqCod, AV32BarOrdLin, A656ParCod, A556HisProEst, A558HisProFec, A561HisProLin, A5605HisProTr2, A4364GrdTipArt, A829TipArtCod, AV39BarTipArt, AV107fec1, AV108Fec2, AV88CosteTeo, AV224Traza, AV117FlagColor, AV120ForRelban, AV201Station, AV84CosteSimula) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((SUBFILE2_nEOF==0) ? 0 : 2)) ;
   }

   public short subsubfile2_previouspage( )
   {
      if ( SUBFILE2_nFirstRecordOnPage >= subsubfile2_fnc_recordsperpage( ) )
      {
         SUBFILE2_nFirstRecordOnPage = (long)(SUBFILE2_nFirstRecordOnPage-subsubfile2_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( SUBFILE2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrsubfile2_refresh( subSubfile1_Rows, subSubfile2_Rows, AV198Sicsv, AV43carpeta, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV97EmprCod, AV9BarCod, AV13BarCodReo, AV11BarCodPar, A457FasCod, A603MaqCodBis, A460FasDsc, A228BarUniMed, A166BarKgm, A184BarMtr, A3837BarFasKgm, A5719BarFasKgT, A6173BarFasSec, A5168FasPreMC, AV90CosTiR, A215BarTieRea, AV211Tiempo_m, AV167MaqCosMin, AV166MaqCosKg, AV165MaqCosFijo, AV214TipmaqCod, A5720BarFasMtT, A3838BarFasMtr, A216BarTieTeo, AV112fecteo, AV225tteo, A252CliCod, A212BarSer, AV125hnd, A135BarColNom, A136BarColNum, A218BarTipCol, AV119Fornumcol, A217BarTipArt, AV122Grdtipart, AV209teotixfi, A150BarFacTin, AV180Moda21, A165BarHorIni, A164BarHorFin, AV18BarCosPro, AV17BarCosAny, A602MaqCod, AV163MaqCod, A605MaqCosMin, A13180MaqCosKg, A13179MaqCosFijo, A606MaqDsc, A1011TipMaqCod, AV32BarOrdLin, A656ParCod, A556HisProEst, A558HisProFec, A561HisProLin, A5605HisProTr2, A4364GrdTipArt, A829TipArtCod, AV39BarTipArt, AV107fec1, AV108Fec2, AV88CosteTeo, AV224Traza, AV117FlagColor, AV120ForRelban, AV201Station, AV84CosteSimula) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subsubfile2_lastpage( )
   {
      subSubfile2_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrsubfile2_refresh( subSubfile1_Rows, subSubfile2_Rows, AV198Sicsv, AV43carpeta, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV97EmprCod, AV9BarCod, AV13BarCodReo, AV11BarCodPar, A457FasCod, A603MaqCodBis, A460FasDsc, A228BarUniMed, A166BarKgm, A184BarMtr, A3837BarFasKgm, A5719BarFasKgT, A6173BarFasSec, A5168FasPreMC, AV90CosTiR, A215BarTieRea, AV211Tiempo_m, AV167MaqCosMin, AV166MaqCosKg, AV165MaqCosFijo, AV214TipmaqCod, A5720BarFasMtT, A3838BarFasMtr, A216BarTieTeo, AV112fecteo, AV225tteo, A252CliCod, A212BarSer, AV125hnd, A135BarColNom, A136BarColNum, A218BarTipCol, AV119Fornumcol, A217BarTipArt, AV122Grdtipart, AV209teotixfi, A150BarFacTin, AV180Moda21, A165BarHorIni, A164BarHorFin, AV18BarCosPro, AV17BarCosAny, A602MaqCod, AV163MaqCod, A605MaqCosMin, A13180MaqCosKg, A13179MaqCosFijo, A606MaqDsc, A1011TipMaqCod, AV32BarOrdLin, A656ParCod, A556HisProEst, A558HisProFec, A561HisProLin, A5605HisProTr2, A4364GrdTipArt, A829TipArtCod, AV39BarTipArt, AV107fec1, AV108Fec2, AV88CosteTeo, AV224Traza, AV117FlagColor, AV120ForRelban, AV201Station, AV84CosteSimula) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subsubfile2_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         SUBFILE2_nFirstRecordOnPage = (long)(subsubfile2_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         SUBFILE2_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( SUBFILE2_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrsubfile2_refresh( subSubfile1_Rows, subSubfile2_Rows, AV198Sicsv, AV43carpeta, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV97EmprCod, AV9BarCod, AV13BarCodReo, AV11BarCodPar, A457FasCod, A603MaqCodBis, A460FasDsc, A228BarUniMed, A166BarKgm, A184BarMtr, A3837BarFasKgm, A5719BarFasKgT, A6173BarFasSec, A5168FasPreMC, AV90CosTiR, A215BarTieRea, AV211Tiempo_m, AV167MaqCosMin, AV166MaqCosKg, AV165MaqCosFijo, AV214TipmaqCod, A5720BarFasMtT, A3838BarFasMtr, A216BarTieTeo, AV112fecteo, AV225tteo, A252CliCod, A212BarSer, AV125hnd, A135BarColNom, A136BarColNum, A218BarTipCol, AV119Fornumcol, A217BarTipArt, AV122Grdtipart, AV209teotixfi, A150BarFacTin, AV180Moda21, A165BarHorIni, A164BarHorFin, AV18BarCosPro, AV17BarCosAny, A602MaqCod, AV163MaqCod, A605MaqCosMin, A13180MaqCosKg, A13179MaqCosFijo, A606MaqDsc, A1011TipMaqCod, AV32BarOrdLin, A656ParCod, A556HisProEst, A558HisProFec, A561HisProLin, A5605HisProTr2, A4364GrdTipArt, A829TipArtCod, AV39BarTipArt, AV107fec1, AV108Fec2, AV88CosteTeo, AV224Traza, AV117FlagColor, AV120ForRelban, AV201Station, AV84CosteSimula) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV258Pgmname = "Facturacion.AnaliseCustoWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV258Pgmname", AV258Pgmname);
      Gx_err = (short)(0) ;
      Gx_date = GXutil.today( ) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavPrograma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrograma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrograma_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCoste_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCoste_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_p_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCostefab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCostefab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostefab_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavValor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavMargen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMargen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMargen_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavTxtalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTxtalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTxtalb_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarfecgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfecgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecgen_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarfecsal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfecsal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecsal_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBartipdis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipdis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipdis_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavCostepold_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCostepold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostepold_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavKilosppieza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavKilosppieza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKilosppieza_Enabled), 5, 0), !bGXsfl_111_Refreshing);
      edtavBarfassec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfassec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfassec_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavBarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlin_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavUnidades_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUnidades_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUnidades_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavUnidadest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUnidadest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUnidadest_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavHorlni_5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHorlni_5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorlni_5_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavHorfin_5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHorfin_5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHorfin_5_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavBartierea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartierea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartierea_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavTteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTteo_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavMaqcosmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcosmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcosmin_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavMaqcoskg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcoskg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcoskg_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavMaqcosfijo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcosfijo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcosfijo_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavCoste_m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCoste_m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_m_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavCoste_tm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCoste_tm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_tm_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavTieteo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTieteo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTieteo_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavFascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascod_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavCoste_p_k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCoste_p_k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoste_p_k_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavTeotixfi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTeotixfi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTeotixfi_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavFomumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFomumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFomumcol_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavBartipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipart_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavGrdtipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrdtipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrdtipart_Enabled), 5, 0), !bGXsfl_144_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2CY0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e212CY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD1_DATA"), AV245Clicod1_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD2_DATA"), AV247Clicod2_Data);
         /* Read saved values. */
         nRC_GXsfl_111 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_111"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_144 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_144"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV244subfile1PageCount = localUtil.ctol( httpContext.cgiGet( "vSUBFILE1PAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV252subfile2PageCount = localUtil.ctol( httpContext.cgiGet( "vSUBFILE2PAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         SUBFILE1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "SUBFILE1_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         SUBFILE2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "SUBFILE2_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         SUBFILE1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "SUBFILE1_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         SUBFILE2_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "SUBFILE2_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subSubfile1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "SUBFILE1_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_Rows", GXutil.ltrim( localUtil.ntoc( subSubfile1_Rows, (byte)(6), (byte)(0), ".", "")));
         subSubfile2_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "SUBFILE2_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_Rows", GXutil.ltrim( localUtil.ntoc( subSubfile2_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_clicod1_Cls = httpContext.cgiGet( "COMBO_CLICOD1_Cls") ;
         Combo_clicod1_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD1_Selectedvalue_set") ;
         Combo_clicod1_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD1_Emptyitemtext") ;
         Combo_clicod2_Cls = httpContext.cgiGet( "COMBO_CLICOD2_Cls") ;
         Combo_clicod2_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD2_Selectedvalue_set") ;
         Combo_clicod2_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD2_Emptyitemtext") ;
         Dvpanel_panel_filtrosgenerales_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Width") ;
         Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autowidth")) ;
         Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoheight")) ;
         Dvpanel_panel_filtrosgenerales_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Cls") ;
         Dvpanel_panel_filtrosgenerales_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Title") ;
         Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsible")) ;
         Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsed")) ;
         Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon")) ;
         Dvpanel_panel_filtrosgenerales_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Iconposition") ;
         Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll")) ;
         Dvpanel_panel_filtros_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Width") ;
         Dvpanel_panel_filtros_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autowidth")) ;
         Dvpanel_panel_filtros_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoheight")) ;
         Dvpanel_panel_filtros_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Cls") ;
         Dvpanel_panel_filtros_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Title") ;
         Dvpanel_panel_filtros_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsible")) ;
         Dvpanel_panel_filtros_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsed")) ;
         Dvpanel_panel_filtros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Showcollapseicon")) ;
         Dvpanel_panel_filtros_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Iconposition") ;
         Dvpanel_panel_filtros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoscroll")) ;
         Subfile1paginationbar_Class = httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Class") ;
         Subfile1paginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Showfirst")) ;
         Subfile1paginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Showprevious")) ;
         Subfile1paginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Shownext")) ;
         Subfile1paginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Showlast")) ;
         Subfile1paginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Subfile1paginationbar_Pagingbuttonsposition = httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Pagingbuttonsposition") ;
         Subfile1paginationbar_Pagingcaptionposition = httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Pagingcaptionposition") ;
         Subfile1paginationbar_Emptygridclass = httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Emptygridclass") ;
         Subfile1paginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Rowsperpageselector")) ;
         Subfile1paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Subfile1paginationbar_Rowsperpageoptions = httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Rowsperpageoptions") ;
         Subfile1paginationbar_Previous = httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Previous") ;
         Subfile1paginationbar_Next = httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Next") ;
         Subfile1paginationbar_Caption = httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Caption") ;
         Subfile1paginationbar_Emptygridcaption = httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Emptygridcaption") ;
         Subfile1paginationbar_Rowsperpagecaption = httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Rowsperpagecaption") ;
         Subfile2paginationbar_Class = httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Class") ;
         Subfile2paginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Showfirst")) ;
         Subfile2paginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Showprevious")) ;
         Subfile2paginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Shownext")) ;
         Subfile2paginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Showlast")) ;
         Subfile2paginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Subfile2paginationbar_Pagingbuttonsposition = httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Pagingbuttonsposition") ;
         Subfile2paginationbar_Pagingcaptionposition = httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Pagingcaptionposition") ;
         Subfile2paginationbar_Emptygridclass = httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Emptygridclass") ;
         Subfile2paginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Rowsperpageselector")) ;
         Subfile2paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Subfile2paginationbar_Rowsperpageoptions = httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Rowsperpageoptions") ;
         Subfile2paginationbar_Previous = httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Previous") ;
         Subfile2paginationbar_Next = httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Next") ;
         Subfile2paginationbar_Caption = httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Caption") ;
         Subfile2paginationbar_Emptygridcaption = httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Emptygridcaption") ;
         Subfile2paginationbar_Rowsperpagecaption = httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_panel_resultado_Width = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Width") ;
         Dvpanel_panel_resultado_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autowidth")) ;
         Dvpanel_panel_resultado_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autoheight")) ;
         Dvpanel_panel_resultado_Cls = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Cls") ;
         Dvpanel_panel_resultado_Title = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Title") ;
         Dvpanel_panel_resultado_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Collapsible")) ;
         Dvpanel_panel_resultado_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Collapsed")) ;
         Dvpanel_panel_resultado_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Showcollapseicon")) ;
         Dvpanel_panel_resultado_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Iconposition") ;
         Dvpanel_panel_resultado_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autoscroll")) ;
         Subfile1_empowerer_Gridinternalname = httpContext.cgiGet( "SUBFILE1_EMPOWERER_Gridinternalname") ;
         Subfile2_empowerer_Gridinternalname = httpContext.cgiGet( "SUBFILE2_EMPOWERER_Gridinternalname") ;
         subSubfile1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "SUBFILE1_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_Rows", GXutil.ltrim( localUtil.ntoc( subSubfile1_Rows, (byte)(6), (byte)(0), ".", "")));
         subSubfile2_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "SUBFILE2_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_Rows", GXutil.ltrim( localUtil.ntoc( subSubfile2_Rows, (byte)(6), (byte)(0), ".", "")));
         Subfile1paginationbar_Selectedpage = httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Selectedpage") ;
         Subfile1paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "SUBFILE1PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Subfile2paginationbar_Selectedpage = httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Selectedpage") ;
         Subfile2paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "SUBFILE2PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Combo_clicod1_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICOD1_Selectedvalue_get") ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec3_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC3");
            GX_FocusControl = edtavFec3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV109Fec3 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109Fec3", localUtil.format(AV109Fec3, "99/99/99"));
         }
         else
         {
            AV109Fec3 = localUtil.ctod( httpContext.cgiGet( edtavFec3_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109Fec3", localUtil.format(AV109Fec3, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec4_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC4");
            GX_FocusControl = edtavFec4_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV110Fec4 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110Fec4", localUtil.format(AV110Fec4, "99/99/99"));
         }
         else
         {
            AV110Fec4 = localUtil.ctod( httpContext.cgiGet( edtavFec4_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110Fec4", localUtil.format(AV110Fec4, "99/99/99"));
         }
         AV7Artcod = httpContext.cgiGet( edtavArtcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Artcod", AV7Artcod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD1");
            GX_FocusControl = edtavBarcod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10Barcod1 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod1), 8, 0));
         }
         else
         {
            AV10Barcod1 = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod1), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO1");
            GX_FocusControl = edtavBarcodreo1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14Barcodreo1 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodreo1", GXutil.str( AV14Barcodreo1, 1, 0));
         }
         else
         {
            AV14Barcodreo1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodreo1", GXutil.str( AV14Barcodreo1, 1, 0));
         }
         AV12Barcodpar1 = httpContext.cgiGet( edtavBarcodpar1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Barcodpar1", AV12Barcodpar1);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSimulador_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSimulador_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSIMULADOR");
            GX_FocusControl = edtavSimulador_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV199Simulador = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV199Simulador", GXutil.str( AV199Simulador, 1, 0));
         }
         else
         {
            AV199Simulador = (byte)(localUtil.ctol( httpContext.cgiGet( edtavSimulador_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV199Simulador", GXutil.str( AV199Simulador, 1, 0));
         }
         AV21Bardisnum = httpContext.cgiGet( edtavBardisnum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Bardisnum", AV21Bardisnum);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarmancod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarmancod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARMANCOD1");
            GX_FocusControl = edtavBarmancod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV29BarMancod1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29BarMancod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarMancod1), 4, 0));
         }
         else
         {
            AV29BarMancod1 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarmancod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29BarMancod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarMancod1), 4, 0));
         }
         AV258Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV258Pgmname", AV258Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD1");
            GX_FocusControl = edtavClicod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46Clicod1 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Clicod1), 6, 0));
         }
         else
         {
            AV46Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Clicod1), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD2");
            GX_FocusControl = edtavClicod2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV47Clicod2 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47Clicod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Clicod2), 6, 0));
         }
         else
         {
            AV47Clicod2 = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47Clicod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Clicod2), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSubfile1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSubfile1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSUBFILE1CURRENTPAGE");
            GX_FocusControl = edtavSubfile1currentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV243subfile1CurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV243subfile1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV243subfile1CurrentPage), 10, 0));
         }
         else
         {
            AV243subfile1CurrentPage = localUtil.ctol( httpContext.cgiGet( edtavSubfile1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV243subfile1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV243subfile1CurrentPage), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSubfile2currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSubfile2currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSUBFILE2CURRENTPAGE");
            GX_FocusControl = edtavSubfile2currentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV251subfile2CurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV251subfile2CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV251subfile2CurrentPage), 10, 0));
         }
         else
         {
            AV251subfile2CurrentPage = localUtil.ctol( httpContext.cgiGet( edtavSubfile2currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV251subfile2CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV251subfile2CurrentPage), 10, 0));
         }
         /* Read subfile selected row values. */
         nGXsfl_111_idx = (int)(localUtil.cton( httpContext.cgiGet( subSubfile1_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_111_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_111_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1112( ) ;
         if ( nGXsfl_111_idx > 0 )
         {
            AV254Details = httpContext.cgiGet( edtavDetails_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
               GX_FocusControl = edtavClicod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV45CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCod), 6, 0));
            }
            else
            {
               AV45CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCod), 6, 0));
            }
            AV49CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV49CliNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
               GX_FocusControl = edtavBarcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV9BarCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
            }
            else
            {
               AV9BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
               GX_FocusControl = edtavBarcodreo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV13BarCodReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarcodreo_Internalname, GXutil.str( AV13BarCodReo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReo), "9")));
            }
            else
            {
               AV13BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarcodreo_Internalname, GXutil.str( AV13BarCodReo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReo), "9")));
            }
            AV11BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarcodpar_Internalname, AV11BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV11BarCodPar, ""))));
            AV22BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarenccli_Internalname, AV22BarEncCli);
            AV36BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV36BarSer);
            AV37BarSerDsc = httpContext.cgiGet( edtavBarserdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarserdsc_Internalname, AV37BarSerDsc);
            AV15BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV15BarColNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
               GX_FocusControl = edtavBarcolnum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV16BarColNum = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarColNum), 6, 0));
            }
            else
            {
               AV16BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarColNum), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrograma_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrograma_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPROGRAMA");
               GX_FocusControl = edtavPrograma_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV196Programa = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavPrograma_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV196Programa), 4, 0));
            }
            else
            {
               AV196Programa = (short)(localUtil.ctol( httpContext.cgiGet( edtavPrograma_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavPrograma_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV196Programa), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARKGM");
               GX_FocusControl = edtavBarkgm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV28BarKgm = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarkgm_Internalname, GXutil.ltrimstr( AV28BarKgm, 9, 2));
            }
            else
            {
               AV28BarKgm = localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarkgm_Internalname, GXutil.ltrimstr( AV28BarKgm, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARMTR");
               GX_FocusControl = edtavBarmtr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV31BarMtr = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarmtr_Internalname, GXutil.ltrimstr( AV31BarMtr, 9, 2));
            }
            else
            {
               AV31BarMtr = localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarmtr_Internalname, GXutil.ltrimstr( AV31BarMtr, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCoste_p_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCoste_p_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTE_P");
               GX_FocusControl = edtavCoste_p_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV68Coste_p = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCoste_p_Internalname, GXutil.ltrimstr( AV68Coste_p, 10, 2));
            }
            else
            {
               AV68Coste_p = localUtil.ctond( httpContext.cgiGet( edtavCoste_p_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCoste_p_Internalname, GXutil.ltrimstr( AV68Coste_p, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostefab_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostefab_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEFAB");
               GX_FocusControl = edtavCostefab_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV78CosteFab = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCostefab_Internalname, GXutil.ltrimstr( AV78CosteFab, 12, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTEFAB"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV78CosteFab, "ZZZZZZZZ9.99")));
            }
            else
            {
               AV78CosteFab = localUtil.ctond( httpContext.cgiGet( edtavCostefab_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCostefab_Internalname, GXutil.ltrimstr( AV78CosteFab, 12, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTEFAB"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV78CosteFab, "ZZZZZZZZ9.99")));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR");
               GX_FocusControl = edtavValor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV235Valor = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV235Valor, 12, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV235Valor, "ZZZZZZZZ9.99")));
            }
            else
            {
               AV235Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV235Valor, 12, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV235Valor, "ZZZZZZZZ9.99")));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMargen_Internalname)), DecimalUtil.stringToDec("-99999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMargen_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMARGEN");
               GX_FocusControl = edtavMargen_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV173Margen = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMargen_Internalname, GXutil.ltrimstr( AV173Margen, 12, 2));
            }
            else
            {
               AV173Margen = localUtil.ctond( httpContext.cgiGet( edtavMargen_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavMargen_Internalname, GXutil.ltrimstr( AV173Margen, 12, 2));
            }
            AV227TxtAlb = httpContext.cgiGet( edtavTxtalb_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavTxtalb_Internalname, AV227TxtAlb);
            if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGEN");
               GX_FocusControl = edtavBarfecgen_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV26BarFecGen = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarfecgen_Internalname, localUtil.format(AV26BarFecGen, "99/99/99"));
            }
            else
            {
               AV26BarFecGen = localUtil.ctod( httpContext.cgiGet( edtavBarfecgen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarfecgen_Internalname, localUtil.format(AV26BarFecGen, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecsal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECSAL");
               GX_FocusControl = edtavBarfecsal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV27BarFecSal = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarfecsal_Internalname, localUtil.format(AV27BarFecSal, "99/99/99"));
            }
            else
            {
               AV27BarFecSal = localUtil.ctod( httpContext.cgiGet( edtavBarfecsal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavBarfecsal_Internalname, localUtil.format(AV27BarFecSal, "99/99/99"));
            }
            AV41BarTipDis = GXutil.upper( httpContext.cgiGet( edtavBartipdis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBartipdis_Internalname, AV41BarTipDis);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostepold_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostepold_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEPOLD");
               GX_FocusControl = edtavCostepold_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV82CostepOld = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCostepold_Internalname, GXutil.ltrimstr( AV82CostepOld, 10, 2));
            }
            else
            {
               AV82CostepOld = localUtil.ctond( httpContext.cgiGet( edtavCostepold_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCostepold_Internalname, GXutil.ltrimstr( AV82CostepOld, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKilosppieza_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKilosppieza_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKILOSPPIEZA");
               GX_FocusControl = edtavKilosppieza_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV136KilospPieza = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavKilosppieza_Internalname, GXutil.ltrimstr( AV136KilospPieza, 9, 2));
            }
            else
            {
               AV136KilospPieza = localUtil.ctond( httpContext.cgiGet( edtavKilosppieza_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavKilosppieza_Internalname, GXutil.ltrimstr( AV136KilospPieza, 9, 2));
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
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
      e212CY2 ();
      if (returnInSub) return;
   }

   public void e212CY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV201Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      analisecustoww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV201Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV201Station", AV201Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV201Station, ""))));
      GXv_char2[0] = AV97EmprCod ;
      GXv_char3[0] = AV98EmprNom ;
      GXv_char4[0] = AV234UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV201Station, GXv_char2, GXv_char3, GXv_char4) ;
      analisecustoww_impl.this.AV97EmprCod = GXv_char2[0] ;
      analisecustoww_impl.this.AV98EmprNom = GXv_char3[0] ;
      analisecustoww_impl.this.AV234UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97EmprCod", AV97EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97EmprCod, "@!"))));
      edtavClicod2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod2_Visible), 5, 0), true);
      edtavClicod1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod1_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICOD1' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICOD2' */
      S122 ();
      if (returnInSub) return;
      Subfile1_empowerer_Gridinternalname = subSubfile1_Internalname ;
      ucSubfile1_empowerer.sendProperty(context, "", false, Subfile1_empowerer_Internalname, "GridInternalName", Subfile1_empowerer_Gridinternalname);
      subSubfile1_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_Rows", GXutil.ltrim( localUtil.ntoc( subSubfile1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV243subfile1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV243subfile1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV243subfile1CurrentPage), 10, 0));
      edtavSubfile1currentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSubfile1currentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSubfile1currentpage_Visible), 5, 0), true);
      AV244subfile1PageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV244subfile1PageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV244subfile1PageCount), 10, 0));
      Subfile2_empowerer_Gridinternalname = subSubfile2_Internalname ;
      ucSubfile2_empowerer.sendProperty(context, "", false, Subfile2_empowerer_Internalname, "GridInternalName", Subfile2_empowerer_Gridinternalname);
      subSubfile2_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_Rows", GXutil.ltrim( localUtil.ntoc( subSubfile2_Rows, (byte)(6), (byte)(0), ".", "")));
      AV251subfile2CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV251subfile2CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV251subfile2CurrentPage), 10, 0));
      edtavSubfile2currentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSubfile2currentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSubfile2currentpage_Visible), 5, 0), true);
      AV252subfile2PageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV252subfile2PageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV252subfile2PageCount), 10, 0));
      Subfile1paginationbar_Rowsperpageselectedvalue = subSubfile1_Rows ;
      ucSubfile1paginationbar.sendProperty(context, "", false, Subfile1paginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Subfile1paginationbar_Rowsperpageselectedvalue), 9, 0));
      Subfile2paginationbar_Rowsperpageselectedvalue = subSubfile2_Rows ;
      ucSubfile2paginationbar.sendProperty(context, "", false, Subfile2paginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Subfile2paginationbar_Rowsperpageselectedvalue), 9, 0));
      AV108Fec2 = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108Fec2", localUtil.format(AV108Fec2, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFEC2", getSecureSignedToken( "", AV108Fec2));
      AV110Fec4 = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110Fec4", localUtil.format(AV110Fec4, "99/99/99"));
      GXt_char1 = AV43carpeta ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV97EmprCod, httpContext.getMessage( "CARPET", ""), GXv_char4) ;
      analisecustoww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV43carpeta = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43carpeta", AV43carpeta);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARPETA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43carpeta, ""))));
      GXt_int5 = AV131Iexcel ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV97EmprCod, httpContext.getMessage( "IEXCEL", ""), GXv_int6) ;
      analisecustoww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV131Iexcel = GXt_int5 ;
      GXt_int5 = AV90CosTiR ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV97EmprCod, httpContext.getMessage( "COSTIR", ""), GXv_int6) ;
      analisecustoww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV90CosTiR = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90CosTiR", GXutil.str( AV90CosTiR, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTIR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV90CosTiR), "9")));
      GXt_int5 = AV180Moda21 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV97EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      analisecustoww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV180Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV180Moda21", GXutil.str( AV180Moda21, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV180Moda21), "9")));
      GXt_char1 = AV43carpeta ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.sys(remoteHandle, context).execute( (short)(2003), GXv_char4) ;
      analisecustoww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV43carpeta = ((GXutil.strcmp("", AV43carpeta)==0) ? GXt_char1 : AV43carpeta) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43carpeta", AV43carpeta);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARPETA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43carpeta, ""))));
      AV199Simulador = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV199Simulador", GXutil.str( AV199Simulador, 1, 0));
      edtavValor_Title = ((AV180Moda21==1) ? httpContext.getMessage( "Tot Fact Liq", "") : httpContext.getMessage( "Tot Guia", "")) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValor_Internalname, "Title", edtavValor_Title, !bGXsfl_111_Refreshing);
   }

   public void e222CY2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV248RecordCount = (short)(subsubfile1_fnc_recordcount( )) ;
      AV244subfile1PageCount = (long)(AV248RecordCount/ (double) (subSubfile1_Rows)+((((int)((AV248RecordCount) % (subSubfile1_Rows)))>0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV244subfile1PageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV244subfile1PageCount), 10, 0));
      AV253RecordCount2 = (short)(subsubfile2_fnc_recordcount( )) ;
      AV252subfile2PageCount = (long)(AV253RecordCount2/ (double) (subSubfile2_Rows)+((((int)((AV253RecordCount2) % (subSubfile2_Rows)))>0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV252subfile2PageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV252subfile2PageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e232CY2( )
   {
      /* Subfile1_Load Routine */
      returnInSub = false ;
      AV48Clicod3 = ((AV47Clicod2>0) ? AV47Clicod2 : 999999) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Clicod3), 6, 0));
      edtavDetails_gximage = "ActionDisplay" ;
      AV254Details = context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavDetails_Internalname, AV254Details);
      AV259Details_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f11923b6-6acd-4a79-bfc0-0cfc6f3bced5", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      /* Execute user subroutine: 'INICIALIZOVARIABLES' */
      S132 ();
      if (returnInSub) return;
      AV109Fec3 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV109Fec3))&&(0==AV10Barcod1) ? GXutil.today( ) : AV109Fec3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109Fec3", localUtil.format(AV109Fec3, "99/99/99"));
      lV7Artcod = GXutil.padr( GXutil.rtrim( AV7Artcod), 16, "%") ;
      /* Using cursor H02CY3 */
      pr_default.execute(0, new Object[] {AV97EmprCod, Integer.valueOf(AV46Clicod1), AV109Fec3, AV110Fec4, lV7Artcod, AV107fec1, AV107fec1, AV108Fec2, AV108Fec2, Short.valueOf(AV29BarMancod1), Short.valueOf(AV29BarMancod1), AV21Bardisnum, AV21Bardisnum, Integer.valueOf(AV10Barcod1), Integer.valueOf(AV10Barcod1), Byte.valueOf(AV14Barcodreo1), Byte.valueOf(AV14Barcodreo1), AV12Barcodpar1, AV12Barcodpar1, Integer.valueOf(AV48Clicod3)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H02CY3_A396EmprCod[0] ;
         A130BarCodPar = H02CY3_A130BarCodPar[0] ;
         A132BarCodReo = H02CY3_A132BarCodReo[0] ;
         A129BarCod = H02CY3_A129BarCod[0] ;
         A143BarDisNum = H02CY3_A143BarDisNum[0] ;
         A3311BarManCod1 = H02CY3_A3311BarManCod1[0] ;
         A161BarFecSal = H02CY3_A161BarFecSal[0] ;
         A212BarSer = H02CY3_A212BarSer[0] ;
         A159BarFecGen = H02CY3_A159BarFecGen[0] ;
         A252CliCod = H02CY3_A252CliCod[0] ;
         n252CliCod = H02CY3_n252CliCod[0] ;
         A2010BarTipDis = H02CY3_A2010BarTipDis[0] ;
         A1652BarSerDsc = H02CY3_A1652BarSerDsc[0] ;
         A135BarColNom = H02CY3_A135BarColNom[0] ;
         A136BarColNum = H02CY3_A136BarColNum[0] ;
         A218BarTipCol = H02CY3_A218BarTipCol[0] ;
         A141BarCosPro = H02CY3_A141BarCosPro[0] ;
         A140BarCosAny = H02CY3_A140BarCosAny[0] ;
         A279CliNom = H02CY3_A279CliNom[0] ;
         A228BarUniMed = H02CY3_A228BarUniMed[0] ;
         A4812BarEncCli = H02CY3_A4812BarEncCli[0] ;
         A184BarMtr = H02CY3_A184BarMtr[0] ;
         A166BarKgm = H02CY3_A166BarKgm[0] ;
         A184BarMtr = H02CY3_A184BarMtr[0] ;
         A166BarKgm = H02CY3_A166BarKgm[0] ;
         A279CliNom = H02CY3_A279CliNom[0] ;
         AV9BarCod = A129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")));
         AV13BarCodReo = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcodreo_Internalname, GXutil.str( AV13BarCodReo, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReo), "9")));
         AV11BarCodPar = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcodpar_Internalname, AV11BarCodPar);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, GXutil.rtrim( localUtil.format( AV11BarCodPar, ""))));
         AV41BarTipDis = A2010BarTipDis ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBartipdis_Internalname, AV41BarTipDis);
         /* Execute user subroutine: 'BARPIE' */
         S143 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'BARPIEAUT' */
         S153 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         /* Execute user subroutine: 'ALBBAR' */
         S163 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV36BarSer = A212BarSer ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV36BarSer);
         AV37BarSerDsc = A1652BarSerDsc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarserdsc_Internalname, AV37BarSerDsc);
         AV15BarColNom = A135BarColNom ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV15BarColNom);
         AV16BarColNum = A136BarColNum ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarColNum), 6, 0));
         AV40BarTipCol = A218BarTipCol ;
         AV18BarCosPro = A141BarCosPro ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18BarCosPro", GXutil.ltrimstr( AV18BarCosPro, 10, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOSPRO", getSecureSignedToken( "", localUtil.format( AV18BarCosPro, "ZZZZZZ9.99")));
         AV17BarCosAny = A140BarCosAny ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17BarCosAny", GXutil.ltrimstr( AV17BarCosAny, 10, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOSANY", getSecureSignedToken( "", localUtil.format( AV17BarCosAny, "ZZZZZZ9.99")));
         AV45CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCod), 6, 0));
         AV49CliNom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV49CliNom);
         AV28BarKgm = A166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarkgm_Internalname, GXutil.ltrimstr( AV28BarKgm, 9, 2));
         AV31BarMtr = A184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarmtr_Internalname, GXutil.ltrimstr( AV31BarMtr, 9, 2));
         AV230Und = A228BarUniMed ;
         AV27BarFecSal = A161BarFecSal ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfecsal_Internalname, localUtil.format(AV27BarFecSal, "99/99/99"));
         AV26BarFecGen = A159BarFecGen ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfecgen_Internalname, localUtil.format(AV26BarFecGen, "99/99/99"));
         AV22BarEncCli = ((GXutil.strcmp(A4812BarEncCli, " ")!=0) ? A4812BarEncCli : A143BarDisNum) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarenccli_Internalname, AV22BarEncCli);
         AV196Programa = A3311BarManCod1 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavPrograma_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV196Programa), 4, 0));
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = AV230Und ;
         GXv_decimal8[0] = AV28BarKgm ;
         GXv_decimal9[0] = AV31BarMtr ;
         GXv_decimal10[0] = AV78CosteFab ;
         GXv_decimal11[0] = AV88CosteTeo ;
         GXv_int12[0] = AV224Traza ;
         new app.pbas001(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_char2, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_int12) ;
         analisecustoww_impl.this.A396EmprCod = GXv_char4[0] ;
         analisecustoww_impl.this.A129BarCod = GXv_int7[0] ;
         analisecustoww_impl.this.A132BarCodReo = GXv_int6[0] ;
         analisecustoww_impl.this.A130BarCodPar = GXv_char3[0] ;
         analisecustoww_impl.this.AV230Und = GXv_char2[0] ;
         analisecustoww_impl.this.AV28BarKgm = GXv_decimal8[0] ;
         analisecustoww_impl.this.AV31BarMtr = GXv_decimal9[0] ;
         analisecustoww_impl.this.AV78CosteFab = GXv_decimal10[0] ;
         analisecustoww_impl.this.AV88CosteTeo = GXv_decimal11[0] ;
         analisecustoww_impl.this.AV224Traza = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, edtavBarkgm_Internalname, GXutil.ltrimstr( AV28BarKgm, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarmtr_Internalname, GXutil.ltrimstr( AV31BarMtr, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, edtavCostefab_Internalname, GXutil.ltrimstr( AV78CosteFab, 12, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTEFAB"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV78CosteFab, "ZZZZZZZZ9.99")));
         httpContext.ajax_rsp_assign_attri("", false, "AV88CosteTeo", GXutil.ltrimstr( AV88CosteTeo, 10, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTETEO", getSecureSignedToken( "", localUtil.format( AV88CosteTeo, "ZZZZZZ9.99")));
         httpContext.ajax_rsp_assign_attri("", false, "AV224Traza", GXutil.str( AV224Traza, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRAZA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV224Traza), "9")));
         AV68Coste_p = AV18BarCosPro.add(AV17BarCosAny) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCoste_p_Internalname, GXutil.ltrimstr( AV68Coste_p, 10, 2));
         AV82CostepOld = AV18BarCosPro.add(AV17BarCosAny) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCostepold_Internalname, GXutil.ltrimstr( AV82CostepOld, 10, 2));
         GXv_char4[0] = AV97EmprCod ;
         GXv_int7[0] = AV45CliCod ;
         GXv_char3[0] = AV36BarSer ;
         GXv_char2[0] = AV15BarColNom ;
         GXv_int13[0] = AV16BarColNum ;
         GXv_int12[0] = AV40BarTipCol ;
         GXv_int6[0] = AV117FlagColor ;
         new app.pexicol(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_char2, GXv_int13, GXv_int12, GXv_int6) ;
         analisecustoww_impl.this.AV97EmprCod = GXv_char4[0] ;
         analisecustoww_impl.this.AV45CliCod = GXv_int7[0] ;
         analisecustoww_impl.this.AV36BarSer = GXv_char3[0] ;
         analisecustoww_impl.this.AV15BarColNom = GXv_char2[0] ;
         analisecustoww_impl.this.AV16BarColNum = GXv_int13[0] ;
         analisecustoww_impl.this.AV40BarTipCol = GXv_int12[0] ;
         analisecustoww_impl.this.AV117FlagColor = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV97EmprCod", AV97EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97EmprCod, "@!"))));
         httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV36BarSer);
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV15BarColNom);
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV117FlagColor", GXutil.str( AV117FlagColor, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCOLOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV117FlagColor), "9")));
         if ( ( AV199Simulador == 1 ) && ( AV117FlagColor == 1 ) )
         {
            GXv_char4[0] = AV97EmprCod ;
            GXv_int13[0] = AV45CliCod ;
            GXv_char3[0] = AV36BarSer ;
            GXv_char2[0] = AV15BarColNom ;
            GXv_int7[0] = AV16BarColNum ;
            GXv_int12[0] = AV40BarTipCol ;
            GXv_decimal11[0] = AV120ForRelban ;
            new app.prbcolor(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_char3, GXv_char2, GXv_int7, GXv_int12, GXv_decimal11) ;
            analisecustoww_impl.this.AV97EmprCod = GXv_char4[0] ;
            analisecustoww_impl.this.AV45CliCod = GXv_int13[0] ;
            analisecustoww_impl.this.AV36BarSer = GXv_char3[0] ;
            analisecustoww_impl.this.AV15BarColNom = GXv_char2[0] ;
            analisecustoww_impl.this.AV16BarColNum = GXv_int7[0] ;
            analisecustoww_impl.this.AV40BarTipCol = GXv_int12[0] ;
            analisecustoww_impl.this.AV120ForRelban = GXv_decimal11[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97EmprCod", AV97EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97EmprCod, "@!"))));
            httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV36BarSer);
            httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV15BarColNom);
            httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarColNum), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV120ForRelban", GXutil.ltrimstr( AV120ForRelban, 7, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORRELBAN", getSecureSignedToken( "", localUtil.format( AV120ForRelban, "ZZZ9.99")));
            AV120ForRelban = ((AV120ForRelban.doubleValue()==0) ? DecimalUtil.doubleToDec(10) : AV120ForRelban) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120ForRelban", GXutil.ltrimstr( AV120ForRelban, 7, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORRELBAN", getSecureSignedToken( "", localUtil.format( AV120ForRelban, "ZZZ9.99")));
            GXv_char4[0] = AV97EmprCod ;
            GXv_int13[0] = AV45CliCod ;
            GXv_char3[0] = AV36BarSer ;
            GXv_char2[0] = AV15BarColNom ;
            GXv_int7[0] = AV16BarColNum ;
            GXv_int12[0] = AV40BarTipCol ;
            GXv_decimal11[0] = DecimalUtil.doubleToDec(1) ;
            GXv_int14[0] = (int)(DecimalUtil.decToDouble(AV120ForRelban)) ;
            GXv_char15[0] = " " ;
            GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
            new app.psimulax(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_char3, GXv_char2, GXv_int7, GXv_int12, GXv_decimal11, GXv_int14, GXv_char15, GXv_decimal10) ;
            analisecustoww_impl.this.AV97EmprCod = GXv_char4[0] ;
            analisecustoww_impl.this.AV45CliCod = GXv_int13[0] ;
            analisecustoww_impl.this.AV36BarSer = GXv_char3[0] ;
            analisecustoww_impl.this.AV15BarColNom = GXv_char2[0] ;
            analisecustoww_impl.this.AV16BarColNum = GXv_int7[0] ;
            analisecustoww_impl.this.AV40BarTipCol = GXv_int12[0] ;
            analisecustoww_impl.this.AV120ForRelban = DecimalUtil.doubleToDec(GXv_int14[0]) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97EmprCod", AV97EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97EmprCod, "@!"))));
            httpContext.ajax_rsp_assign_attri("", false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV36BarSer);
            httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV15BarColNom);
            httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16BarColNum), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV120ForRelban", GXutil.ltrimstr( AV120ForRelban, 7, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORRELBAN", getSecureSignedToken( "", localUtil.format( AV120ForRelban, "ZZZ9.99")));
            GXv_char15[0] = AV97EmprCod ;
            GXv_char4[0] = AV201Station ;
            GXv_decimal11[0] = AV84CosteSimula ;
            new app.pcoscor(remoteHandle, context).execute( GXv_char15, GXv_char4, GXv_decimal11) ;
            analisecustoww_impl.this.AV97EmprCod = GXv_char15[0] ;
            analisecustoww_impl.this.AV201Station = GXv_char4[0] ;
            analisecustoww_impl.this.AV84CosteSimula = GXv_decimal11[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97EmprCod", AV97EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97EmprCod, "@!"))));
            httpContext.ajax_rsp_assign_attri("", false, "AV201Station", AV201Station);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV201Station, ""))));
            httpContext.ajax_rsp_assign_attri("", false, "AV84CosteSimula", GXutil.ltrimstr( AV84CosteSimula, 11, 5));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTESIMULA", getSecureSignedToken( "", localUtil.format( AV84CosteSimula, "ZZZZ9.99999")));
            AV68Coste_p = AV84CosteSimula.multiply(A166BarKgm) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCoste_p_Internalname, GXutil.ltrimstr( AV68Coste_p, 10, 2));
         }
         AV85Costest = DecimalUtil.doubleToDec(0) ;
         AV70Coste_t = AV78CosteFab.add(AV68Coste_p).add(AV85Costest) ;
         AV173Margen = AV235Valor.subtract(AV70Coste_t) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMargen_Internalname, GXutil.ltrimstr( AV173Margen, 12, 2));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(111) ;
         }
         if ( ( subSubfile1_Islastpage == 1 ) || ( subSubfile1_Rows == 0 ) || ( ( SUBFILE1_nCurrentRecord >= SUBFILE1_nFirstRecordOnPage ) && ( SUBFILE1_nCurrentRecord < SUBFILE1_nFirstRecordOnPage + subsubfile1_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1112( ) ;
            SUBFILE1_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_nEOF", GXutil.ltrim( localUtil.ntoc( SUBFILE1_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subSubfile1_Islastpage == 1 ) && ( ((int)((SUBFILE1_nCurrentRecord) % (subsubfile1_fnc_recordsperpage( )))) == 0 ) )
            {
               SUBFILE1_nFirstRecordOnPage = SUBFILE1_nCurrentRecord ;
            }
         }
         if ( SUBFILE1_nCurrentRecord >= SUBFILE1_nFirstRecordOnPage + subsubfile1_fnc_recordsperpage( ) )
         {
            SUBFILE1_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_nEOF", GXutil.ltrim( localUtil.ntoc( SUBFILE1_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         SUBFILE1_nCurrentRecord = (long)(SUBFILE1_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_111_Refreshing )
         {
            httpContext.doAjaxLoad(111, Subfile1Row);
         }
         /* Execute user subroutine: 'INICIALIZOVARIABLES' */
         S132 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /*  Sending Event outputs  */
   }

   public void e172CY2( )
   {
      /* Subfile1paginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Subfile1paginationbar_Selectedpage, "Previous") == 0 )
      {
         AV243subfile1CurrentPage = (long)(AV243subfile1CurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV243subfile1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV243subfile1CurrentPage), 10, 0));
         subsubfile1_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Subfile1paginationbar_Selectedpage, "Next") == 0 )
      {
         AV243subfile1CurrentPage = (long)(AV243subfile1CurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV243subfile1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV243subfile1CurrentPage), 10, 0));
         subsubfile1_nextpage( ) ;
      }
      else
      {
         AV242PageToGo = (int)(GXutil.lval( Subfile1paginationbar_Selectedpage)) ;
         AV243subfile1CurrentPage = AV242PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV243subfile1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV243subfile1CurrentPage), 10, 0));
         subsubfile1_gotopage( AV242PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e182CY2( )
   {
      /* Subfile1paginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subSubfile1_Rows = Subfile1paginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE1_Rows", GXutil.ltrim( localUtil.ntoc( subSubfile1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV243subfile1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV243subfile1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV243subfile1CurrentPage), 10, 0));
      subsubfile1_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e192CY2( )
   {
      /* Subfile2paginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Subfile2paginationbar_Selectedpage, "Previous") == 0 )
      {
         AV251subfile2CurrentPage = (long)(AV251subfile2CurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV251subfile2CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV251subfile2CurrentPage), 10, 0));
         subsubfile2_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Subfile2paginationbar_Selectedpage, "Next") == 0 )
      {
         AV251subfile2CurrentPage = (long)(AV251subfile2CurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV251subfile2CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV251subfile2CurrentPage), 10, 0));
         subsubfile2_nextpage( ) ;
      }
      else
      {
         AV242PageToGo = (int)(GXutil.lval( Subfile2paginationbar_Selectedpage)) ;
         AV251subfile2CurrentPage = AV242PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV251subfile2CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV251subfile2CurrentPage), 10, 0));
         subsubfile2_gotopage( AV242PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e202CY2( )
   {
      /* Subfile2paginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subSubfile2_Rows = Subfile2paginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_Rows", GXutil.ltrim( localUtil.ntoc( subSubfile2_Rows, (byte)(6), (byte)(0), ".", "")));
      AV251subfile2CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV251subfile2CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV251subfile2CurrentPage), 10, 0));
      subsubfile2_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e162CY2( )
   {
      /* Combo_clicod1_Onoptionclicked Routine */
      returnInSub = false ;
      AV46Clicod1 = (int)(GXutil.lval( Combo_clicod1_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46Clicod1), 6, 0));
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICOD2' Routine */
      returnInSub = false ;
      /* Using cursor H02CY4 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10045CliAct = H02CY4_A10045CliAct[0] ;
         A13735CliCNom = H02CY4_A13735CliCNom[0] ;
         A252CliCod = H02CY4_A252CliCod[0] ;
         n252CliCod = H02CY4_n252CliCod[0] ;
         A279CliNom = H02CY4_A279CliNom[0] ;
         AV246Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV246Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV246Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV247Clicod2_Data.add(AV246Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_clicod2_Selectedvalue_set = ((0==AV47Clicod2) ? "" : GXutil.trim( GXutil.str( AV47Clicod2, 6, 0))) ;
      ucCombo_clicod2.sendProperty(context, "", false, Combo_clicod2_Internalname, "SelectedValue_set", Combo_clicod2_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICOD1' Routine */
      returnInSub = false ;
      /* Using cursor H02CY5 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A10045CliAct = H02CY5_A10045CliAct[0] ;
         A13735CliCNom = H02CY5_A13735CliCNom[0] ;
         A252CliCod = H02CY5_A252CliCod[0] ;
         n252CliCod = H02CY5_n252CliCod[0] ;
         A279CliNom = H02CY5_A279CliNom[0] ;
         AV246Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV246Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV246Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV245Clicod1_Data.add(AV246Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_clicod1_Selectedvalue_set = ((0==AV46Clicod1) ? "" : GXutil.trim( GXutil.str( AV46Clicod1, 6, 0))) ;
      ucCombo_clicod1.sendProperty(context, "", false, Combo_clicod1_Internalname, "SelectedValue_set", Combo_clicod1_Selectedvalue_set);
   }

   public void S163( )
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV235Valor = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV235Valor, 12, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV235Valor, "ZZZZZZZZ9.99")));
      AV227TxtAlb = " " ;
      httpContext.ajax_rsp_assign_attri("", false, edtavTxtalb_Internalname, AV227TxtAlb);
      AV136KilospPieza = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavKilosppieza_Internalname, GXutil.ltrimstr( AV136KilospPieza, 9, 2));
      /* Using cursor H02CY6 */
      pr_default.execute(3, new Object[] {AV97EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV13BarCodReo), AV11BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = H02CY6_A130BarCodPar[0] ;
         A132BarCodReo = H02CY6_A132BarCodReo[0] ;
         A129BarCod = H02CY6_A129BarCod[0] ;
         A30AlbProCod = H02CY6_A30AlbProCod[0] ;
         A396EmprCod = H02CY6_A396EmprCod[0] ;
         A32AlbProEsp = H02CY6_A32AlbProEsp[0] ;
         A1264BarPreMtr = H02CY6_A1264BarPreMtr[0] ;
         A1263BarAlbMtrE = H02CY6_A1263BarAlbMtrE[0] ;
         A1262BarPreKgm = H02CY6_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = H02CY6_A1261BarAlbKgmE[0] ;
         if ( GXutil.strcmp(AV227TxtAlb, "") == 0 )
         {
            AV227TxtAlb = GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavTxtalb_Internalname, AV227TxtAlb);
         }
         else
         {
            AV227TxtAlb += "/" + GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavTxtalb_Internalname, AV227TxtAlb);
         }
         AV235Valor = AV235Valor.add((GXutil.roundDecimal( A1261BarAlbKgmE.multiply(A1262BarPreKgm), 2).add(GXutil.roundDecimal( A1263BarAlbMtrE.multiply(A1264BarPreMtr), 2)))) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV235Valor, 12, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV235Valor, "ZZZZZZZZ9.99")));
         /* Using cursor H02CY7 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A1242GuiFasPMt = H02CY7_A1242GuiFasPMt[0] ;
            A1276FasMtr = H02CY7_A1276FasMtr[0] ;
            A1241GuiFasPKg = H02CY7_A1241GuiFasPKg[0] ;
            A1275FasKgm = H02CY7_A1275FasKgm[0] ;
            AV235Valor = AV235Valor.add((GXutil.roundDecimal( A1275FasKgm.multiply(A1241GuiFasPKg), 2).add(GXutil.roundDecimal( A1276FasMtr.multiply(A1242GuiFasPMt), 2)))) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV235Valor, 12, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV235Valor, "ZZZZZZZZ9.99")));
            pr_default.readNext(4);
         }
         pr_default.close(4);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV180Moda21 == 1 )
      {
         AV235Valor = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV235Valor, 12, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV235Valor, "ZZZZZZZZ9.99")));
         /* Using cursor H02CY8 */
         pr_default.execute(5, new Object[] {AV97EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV13BarCodReo), AV11BarCodPar});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A1296FacBarPar = H02CY8_A1296FacBarPar[0] ;
            A1295FacBarReo = H02CY8_A1295FacBarReo[0] ;
            A1294FacBarCod = H02CY8_A1294FacBarCod[0] ;
            A396EmprCod = H02CY8_A396EmprCod[0] ;
            A430FacCod = H02CY8_A430FacCod[0] ;
            AV101facbarcod = A1294FacBarCod ;
            AV103FacBarReo = A1295FacBarReo ;
            AV102FacBarPar = A1296FacBarPar ;
            GXv_char15[0] = AV97EmprCod ;
            GXv_int14[0] = A430FacCod ;
            GXv_int13[0] = AV101facbarcod ;
            GXv_int12[0] = AV103FacBarReo ;
            GXv_char4[0] = AV102FacBarPar ;
            GXv_decimal11[0] = AV235Valor ;
            new app.pm21totliquido(remoteHandle, context).execute( GXv_char15, GXv_int14, GXv_int13, GXv_int12, GXv_char4, GXv_decimal11) ;
            analisecustoww_impl.this.AV97EmprCod = GXv_char15[0] ;
            analisecustoww_impl.this.A430FacCod = GXv_int14[0] ;
            analisecustoww_impl.this.AV101facbarcod = GXv_int13[0] ;
            analisecustoww_impl.this.AV103FacBarReo = GXv_int12[0] ;
            analisecustoww_impl.this.AV102FacBarPar = GXv_char4[0] ;
            analisecustoww_impl.this.AV235Valor = GXv_decimal11[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97EmprCod", AV97EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97EmprCod, "@!"))));
            httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV235Valor, 12, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV235Valor, "ZZZZZZZZ9.99")));
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
   }

   public void S185( )
   {
      /* 'TIEREA' Routine */
      returnInSub = false ;
      AV211Tiempo_m = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV211Tiempo_m", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV211Tiempo_m), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIEMPO_M", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV211Tiempo_m), "ZZZZZ9")));
      /* Using cursor H02CY9 */
      pr_default.execute(6, new Object[] {AV97EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV13BarCodReo), AV11BarCodPar, Short.valueOf(AV32BarOrdLin)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A556HisProEst = H02CY9_A556HisProEst[0] ;
         A656ParCod = H02CY9_A656ParCod[0] ;
         n656ParCod = H02CY9_n656ParCod[0] ;
         A194BarOrdLin = H02CY9_A194BarOrdLin[0] ;
         A130BarCodPar = H02CY9_A130BarCodPar[0] ;
         A132BarCodReo = H02CY9_A132BarCodReo[0] ;
         A129BarCod = H02CY9_A129BarCod[0] ;
         A396EmprCod = H02CY9_A396EmprCod[0] ;
         A561HisProLin = H02CY9_A561HisProLin[0] ;
         A558HisProFec = H02CY9_A558HisProFec[0] ;
         A4440HisProDTI = H02CY9_A4440HisProDTI[0] ;
         n4440HisProDTI = H02CY9_n4440HisProDTI[0] ;
         A4441HisProDTF = H02CY9_A4441HisProDTF[0] ;
         n4441HisProDTF = H02CY9_n4441HisProDTF[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
         }
         AV211Tiempo_m = (int)(AV211Tiempo_m+(GXutil.Int( A5605HisProTr2))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV211Tiempo_m", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV211Tiempo_m), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIEMPO_M", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV211Tiempo_m), "ZZZZZ9")));
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S195( )
   {
      /* 'FAMILIA' Routine */
      returnInSub = false ;
      AV122Grdtipart = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavGrdtipart_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122Grdtipart), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRDTIPART"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(AV122Grdtipart), "ZZZ9")));
      /* Using cursor H02CY10 */
      pr_default.execute(7, new Object[] {AV97EmprCod, Short.valueOf(AV39BarTipArt)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A829TipArtCod = H02CY10_A829TipArtCod[0] ;
         A396EmprCod = H02CY10_A396EmprCod[0] ;
         A4364GrdTipArt = H02CY10_A4364GrdTipArt[0] ;
         AV122Grdtipart = A4364GrdTipArt ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGrdtipart_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122Grdtipart), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRDTIPART"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(AV122Grdtipart), "ZZZ9")));
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S175( )
   {
      /* 'COSMIN' Routine */
      returnInSub = false ;
      AV167MaqCosMin = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcosmin_Internalname, GXutil.ltrimstr( AV167MaqCosMin, 10, 4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSMIN"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV167MaqCosMin, "ZZZZ9.9999")));
      AV168MaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqdsc_Internalname, AV168MaqDsc);
      AV214TipmaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV214TipmaqCod", AV214TipmaqCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV214TipmaqCod, ""))));
      AV166MaqCosKg = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcoskg_Internalname, GXutil.ltrimstr( AV166MaqCosKg, 10, 4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSKG"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV166MaqCosKg, "ZZZZ9.9999")));
      AV165MaqCosFijo = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcosfijo_Internalname, GXutil.ltrimstr( AV165MaqCosFijo, 10, 4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSFIJO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV165MaqCosFijo, "ZZZZ9.9999")));
      /* Using cursor H02CY11 */
      pr_default.execute(8, new Object[] {AV97EmprCod, AV163MaqCod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A602MaqCod = H02CY11_A602MaqCod[0] ;
         A396EmprCod = H02CY11_A396EmprCod[0] ;
         A605MaqCosMin = H02CY11_A605MaqCosMin[0] ;
         n605MaqCosMin = H02CY11_n605MaqCosMin[0] ;
         A13180MaqCosKg = H02CY11_A13180MaqCosKg[0] ;
         n13180MaqCosKg = H02CY11_n13180MaqCosKg[0] ;
         A13179MaqCosFijo = H02CY11_A13179MaqCosFijo[0] ;
         n13179MaqCosFijo = H02CY11_n13179MaqCosFijo[0] ;
         A606MaqDsc = H02CY11_A606MaqDsc[0] ;
         n606MaqDsc = H02CY11_n606MaqDsc[0] ;
         A1011TipMaqCod = H02CY11_A1011TipMaqCod[0] ;
         n1011TipMaqCod = H02CY11_n1011TipMaqCod[0] ;
         AV167MaqCosMin = A605MaqCosMin ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMaqcosmin_Internalname, GXutil.ltrimstr( AV167MaqCosMin, 10, 4));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSMIN"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV167MaqCosMin, "ZZZZ9.9999")));
         AV166MaqCosKg = A13180MaqCosKg ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMaqcoskg_Internalname, GXutil.ltrimstr( AV166MaqCosKg, 10, 4));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSKG"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV166MaqCosKg, "ZZZZ9.9999")));
         AV165MaqCosFijo = A13179MaqCosFijo ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMaqcosfijo_Internalname, GXutil.ltrimstr( AV165MaqCosFijo, 10, 4));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSFIJO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV165MaqCosFijo, "ZZZZ9.9999")));
         AV168MaqDsc = A606MaqDsc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMaqdsc_Internalname, AV168MaqDsc);
         AV214TipmaqCod = A1011TipMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV214TipmaqCod", AV214TipmaqCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV214TipmaqCod, ""))));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S143( )
   {
      /* 'BARPIE' Routine */
      returnInSub = false ;
      AV134KgsT = DecimalUtil.doubleToDec(0) ;
      AV183MtsT = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor H02CY12 */
      pr_default.execute(9, new Object[] {AV97EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV13BarCodReo), AV11BarCodPar});
      c203BarPieKil = H02CY12_A203BarPieKil[0] ;
      c205BarPieMet = H02CY12_A205BarPieMet[0] ;
      pr_default.close(9);
      AV134KgsT = AV134KgsT.add(c203BarPieKil) ;
      AV183MtsT = AV183MtsT.add(c205BarPieMet) ;
      /* End optimized group. */
   }

   public void S153( )
   {
      /* 'BARPIEAUT' Routine */
      returnInSub = false ;
      AV135KgsTS = DecimalUtil.doubleToDec(0) ;
      AV184MtsTS = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor H02CY13 */
      pr_default.execute(10, new Object[] {AV97EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV13BarCodReo), AV11BarCodPar});
      c3275BarKgsAut = H02CY13_A3275BarKgsAut[0] ;
      n3275BarKgsAut = H02CY13_n3275BarKgsAut[0] ;
      c3276BarMtsAut = H02CY13_A3276BarMtsAut[0] ;
      n3276BarMtsAut = H02CY13_n3276BarMtsAut[0] ;
      pr_default.close(10);
      AV135KgsTS = AV135KgsTS.add(c3275BarKgsAut) ;
      AV184MtsTS = AV184MtsTS.add(c3276BarMtsAut) ;
      /* End optimized group. */
   }

   public void S132( )
   {
      /* 'INICIALIZOVARIABLES' Routine */
      returnInSub = false ;
      AV56Coste_f = DecimalUtil.doubleToDec(0) ;
      AV52CosoPrd1 = DecimalUtil.doubleToDec(0) ;
      AV53CosPrd = DecimalUtil.doubleToDec(0) ;
      AV54cosprd1 = DecimalUtil.doubleToDec(0) ;
      AV56Coste_f = DecimalUtil.doubleToDec(0) ;
      AV62Coste_m = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCoste_m_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Coste_m), 4, 0));
      AV68Coste_p = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCoste_p_Internalname, GXutil.ltrimstr( AV68Coste_p, 10, 2));
      AV69Coste_p_k = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCoste_p_k_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Coste_p_k), 4, 0));
      AV70Coste_t = DecimalUtil.doubleToDec(0) ;
      AV71Coste_t_m = DecimalUtil.doubleToDec(0) ;
      AV72Coste_teo = DecimalUtil.doubleToDec(0) ;
      AV73Coste_tm = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCoste_tm_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73Coste_tm), 4, 0));
      AV74Coste_tp = DecimalUtil.doubleToDec(0) ;
      AV75Coste_tt = DecimalUtil.doubleToDec(0) ;
      AV78CosteFab = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCostefab_Internalname, GXutil.ltrimstr( AV78CosteFab, 12, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTEFAB"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV78CosteFab, "ZZZZZZZZ9.99")));
      AV79Costefpp = DecimalUtil.doubleToDec(0) ;
      AV80CosteL = DecimalUtil.doubleToDec(0) ;
      AV82CostepOld = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCostepold_Internalname, GXutil.ltrimstr( AV82CostepOld, 10, 2));
      AV83Costeqpp = DecimalUtil.doubleToDec(0) ;
      AV84CosteSimula = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84CosteSimula", GXutil.ltrimstr( AV84CosteSimula, 11, 5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTESIMULA", getSecureSignedToken( "", localUtil.format( AV84CosteSimula, "ZZZZ9.99999")));
      AV88CosteTeo = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88CosteTeo", GXutil.ltrimstr( AV88CosteTeo, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTETEO", getSecureSignedToken( "", localUtil.format( AV88CosteTeo, "ZZZZZZ9.99")));
      AV90CosTiR = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90CosTiR", GXutil.str( AV90CosTiR, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOSTIR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV90CosTiR), "9")));
      AV235Valor = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavValor_Internalname, GXutil.ltrimstr( AV235Valor, 12, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR"+"_"+sGXsfl_111_idx, getSecureSignedToken( sGXsfl_111_idx, localUtil.format( AV235Valor, "ZZZZZZZZ9.99")));
      AV236Valor_c = DecimalUtil.doubleToDec(0) ;
      AV237Valor_cor = DecimalUtil.doubleToDec(0) ;
      AV167MaqCosMin = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcosmin_Internalname, GXutil.ltrimstr( AV167MaqCosMin, 10, 4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSMIN"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV167MaqCosMin, "ZZZZ9.9999")));
      AV173Margen = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMargen_Internalname, GXutil.ltrimstr( AV173Margen, 12, 2));
      AV183MtsT = DecimalUtil.doubleToDec(0) ;
      AV184MtsTS = DecimalUtil.doubleToDec(0) ;
      AV165MaqCosFijo = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcosfijo_Internalname, GXutil.ltrimstr( AV165MaqCosFijo, 10, 4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSFIJO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV165MaqCosFijo, "ZZZZ9.9999")));
      AV166MaqCosKg = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcoskg_Internalname, GXutil.ltrimstr( AV166MaqCosKg, 10, 4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOSKG"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV166MaqCosKg, "ZZZZ9.9999")));
   }

   private void e242CY4( )
   {
      /* Subfile2_Load Routine */
      returnInSub = false ;
      if ( AV198Sicsv == 1 )
      {
         AV115File1 = GXutil.trim( AV43carpeta) + "\\" + httpContext.getMessage( "TrazaCalculoTiempoTeorico", "") + httpContext.getMessage( ".csv", "") ;
         if ( new app.core.file(remoteHandle, context).executeUdp( AV115File1) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         if ( Cond_result )
         {
            AV200Stat = GXutil.deleteFile( AV115File1) ;
         }
         GXt_int16 = AV125hnd ;
         GXv_int17[0] = GXt_int16 ;
         new app.core.fcreate(remoteHandle, context).execute( AV115File1, GXv_int17) ;
         analisecustoww_impl.this.GXt_int16 = GXv_int17[0] ;
         AV125hnd = GXt_int16 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV125hnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125hnd), 10, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHND", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV125hnd), "ZZZZZZZZZ9")));
         AV51Control = httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Metros", "") + ";" + httpContext.getMessage( "KIlos", "") + ";" + httpContext.getMessage( "Piezas", "") + ";" + httpContext.getMessage( "Unidad", "") + ";" + httpContext.getMessage( "Fase", "") + ";" + httpContext.getMessage( "Tinte?", "") + ";" + httpContext.getMessage( "Estampacion", "") + ";" + httpContext.getMessage( "TiempoPreparacionSalida", "") + ";" + httpContext.getMessage( "TiempoPreparacionporPieza", "") + ";" + httpContext.getMessage( "Velocidad", "") + ";" + httpContext.getMessage( "NumeroPases", "") + ";" ;
         AV51Control += httpContext.getMessage( "TiempoPreparacionMoldeCilindro", "") + ";" + httpContext.getMessage( "N Variantes", "") + ";" + httpContext.getMessage( "Cilindros_Molde", "") + ";" + httpContext.getMessage( "TiempoTeoricoCalculado(m)", "") + ";" + httpContext.getMessage( "UnidadTiempo", "") ;
         GXt_int5 = AV200Stat ;
         GXv_int12[0] = GXt_int5 ;
         new app.core.fputs(remoteHandle, context).execute( AV125hnd, AV51Control, GXv_int12) ;
         analisecustoww_impl.this.GXt_int5 = GXv_int12[0] ;
         AV200Stat = GXt_int5 ;
      }
      /* Using cursor H02CY15 */
      pr_default.execute(11, new Object[] {AV97EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV13BarCodReo), AV11BarCodPar});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A130BarCodPar = H02CY15_A130BarCodPar[0] ;
         A132BarCodReo = H02CY15_A132BarCodReo[0] ;
         A129BarCod = H02CY15_A129BarCod[0] ;
         A396EmprCod = H02CY15_A396EmprCod[0] ;
         A457FasCod = H02CY15_A457FasCod[0] ;
         A603MaqCodBis = H02CY15_A603MaqCodBis[0] ;
         A460FasDsc = H02CY15_A460FasDsc[0] ;
         A228BarUniMed = H02CY15_A228BarUniMed[0] ;
         A3837BarFasKgm = H02CY15_A3837BarFasKgm[0] ;
         n3837BarFasKgm = H02CY15_n3837BarFasKgm[0] ;
         A5719BarFasKgT = H02CY15_A5719BarFasKgT[0] ;
         n5719BarFasKgT = H02CY15_n5719BarFasKgT[0] ;
         A6173BarFasSec = H02CY15_A6173BarFasSec[0] ;
         n6173BarFasSec = H02CY15_n6173BarFasSec[0] ;
         A5168FasPreMC = H02CY15_A5168FasPreMC[0] ;
         n5168FasPreMC = H02CY15_n5168FasPreMC[0] ;
         A215BarTieRea = H02CY15_A215BarTieRea[0] ;
         A5720BarFasMtT = H02CY15_A5720BarFasMtT[0] ;
         n5720BarFasMtT = H02CY15_n5720BarFasMtT[0] ;
         A3838BarFasMtr = H02CY15_A3838BarFasMtr[0] ;
         n3838BarFasMtr = H02CY15_n3838BarFasMtr[0] ;
         A216BarTieTeo = H02CY15_A216BarTieTeo[0] ;
         A252CliCod = H02CY15_A252CliCod[0] ;
         n252CliCod = H02CY15_n252CliCod[0] ;
         A212BarSer = H02CY15_A212BarSer[0] ;
         A135BarColNom = H02CY15_A135BarColNom[0] ;
         A136BarColNum = H02CY15_A136BarColNum[0] ;
         A218BarTipCol = H02CY15_A218BarTipCol[0] ;
         A217BarTipArt = H02CY15_A217BarTipArt[0] ;
         n217BarTipArt = H02CY15_n217BarTipArt[0] ;
         A150BarFacTin = H02CY15_A150BarFacTin[0] ;
         A165BarHorIni = H02CY15_A165BarHorIni[0] ;
         A164BarHorFin = H02CY15_A164BarHorFin[0] ;
         A194BarOrdLin = H02CY15_A194BarOrdLin[0] ;
         A758ProCod = H02CY15_A758ProCod[0] ;
         A166BarKgm = H02CY15_A166BarKgm[0] ;
         A184BarMtr = H02CY15_A184BarMtr[0] ;
         A228BarUniMed = H02CY15_A228BarUniMed[0] ;
         A252CliCod = H02CY15_A252CliCod[0] ;
         n252CliCod = H02CY15_n252CliCod[0] ;
         A212BarSer = H02CY15_A212BarSer[0] ;
         A135BarColNom = H02CY15_A135BarColNom[0] ;
         A136BarColNum = H02CY15_A136BarColNum[0] ;
         A218BarTipCol = H02CY15_A218BarTipCol[0] ;
         A217BarTipArt = H02CY15_A217BarTipArt[0] ;
         n217BarTipArt = H02CY15_n217BarTipArt[0] ;
         A166BarKgm = H02CY15_A166BarKgm[0] ;
         A184BarMtr = H02CY15_A184BarMtr[0] ;
         A460FasDsc = H02CY15_A460FasDsc[0] ;
         A5168FasPreMC = H02CY15_A5168FasPreMC[0] ;
         n5168FasPreMC = H02CY15_n5168FasPreMC[0] ;
         AV104FasCod = A457FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavFascod_Internalname, AV104FasCod);
         AV163MaqCod = A603MaqCodBis ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod_Internalname, AV163MaqCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, GXutil.rtrim( localUtil.format( AV163MaqCod, ""))));
         AV32BarOrdLin = A194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarOrdLin), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(AV32BarOrdLin), "ZZZ9")));
         AV105FasDsc = A460FasDsc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavFasdsc_Internalname, AV105FasDsc);
         AV42BarUniMed = A228BarUniMed ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarunimed_Internalname, AV42BarUniMed);
         AV133Kgm = A166BarKgm ;
         AV182Mtr = A184BarMtr ;
         AV23Barfaskgm = A3837BarFasKgm ;
         AV24Barfaskgt = A5719BarFasKgT ;
         AV25BarFasSec = A6173BarFasSec ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarfassec_Internalname, AV25BarFasSec);
         AV106FasPreMC = A5168FasPreMC ;
         AV53CosPrd = DecimalUtil.doubleToDec(0) ;
         AV54cosprd1 = DecimalUtil.doubleToDec(0) ;
         AV62Coste_m = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCoste_m_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Coste_m), 4, 0));
         /* Execute user subroutine: 'COSMIN' */
         S175 ();
         if ( returnInSub )
         {
            pr_default.close(11);
            pr_default.close(11);
            pr_default.close(11);
            pr_default.close(11);
            returnInSub = true;
            if (true) return;
         }
         if ( AV90CosTiR == 0 )
         {
            AV176Min = (byte)(DecimalUtil.decToDouble((A215BarTieRea.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))))).multiply(DecimalUtil.doubleToDec(100)))) ;
            AV211Tiempo_m = (int)((GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))*60)+AV176Min) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV211Tiempo_m", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV211Tiempo_m), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIEMPO_M", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV211Tiempo_m), "ZZZZZ9")));
            AV38BarTieRea = A215BarTieRea ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBartierea_Internalname, GXutil.ltrimstr( AV38BarTieRea, 5, 2));
         }
         else
         {
            /* Execute user subroutine: 'TIEREA' */
            S185 ();
            if ( returnInSub )
            {
               pr_default.close(11);
               pr_default.close(11);
               pr_default.close(11);
               pr_default.close(11);
               returnInSub = true;
               if (true) return;
            }
            AV38BarTieRea = DecimalUtil.doubleToDec(GXutil.Int( AV211Tiempo_m/ (double) (60))+(AV211Tiempo_m-(GXutil.Int( AV211Tiempo_m/ (double) (60))*60))/ (double) (100)) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavBartierea_Internalname, GXutil.ltrimstr( AV38BarTieRea, 5, 2));
         }
         AV54cosprd1 = ((AV167MaqCosMin.doubleValue()>0) ? GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV211Tiempo_m).multiply(AV167MaqCosMin)), 2) : ((AV166MaqCosKg.doubleValue()>0) ? GXutil.roundDecimal( (AV133Kgm.multiply(AV166MaqCosKg)), 2) : ((AV165MaqCosFijo.doubleValue()>0) ? AV165MaqCosFijo : DecimalUtil.doubleToDec(0)))) ;
         if ( GXutil.strcmp(GXutil.trim( AV214TipmaqCod), httpContext.getMessage( "EXT", "")) == 0 )
         {
            AV62Coste_m = (short)(DecimalUtil.decToDouble(((GXutil.strcmp(AV42BarUniMed, httpContext.getMessage( "K", ""))==0) ? GXutil.roundDecimal( (AV167MaqCosMin.multiply(AV133Kgm)), 2) : GXutil.roundDecimal( (AV167MaqCosMin.multiply(AV182Mtr)), 2)))) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCoste_m_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Coste_m), 4, 0));
         }
         else
         {
            if ( GXutil.strcmp(AV42BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( A5719BarFasKgT.doubleValue() > 0 )
               {
                  AV62Coste_m = (short)(DecimalUtil.decToDouble((AV54cosprd1.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN))) ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavCoste_m_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Coste_m), 4, 0));
                  AV231Unidades = A3837BarFasKgm ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavUnidades_Internalname, GXutil.ltrimstr( AV231Unidades, 9, 2));
                  AV232Unidadest = (short)(DecimalUtil.decToDouble(A5719BarFasKgT)) ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavUnidadest_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV232Unidadest), 4, 0));
               }
               else
               {
                  AV62Coste_m = (short)(DecimalUtil.decToDouble(((AV133Kgm.doubleValue()>0) ? (AV54cosprd1.multiply(AV133Kgm)).divide(AV133Kgm, 18, java.math.RoundingMode.DOWN) : AV54cosprd1))) ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavCoste_m_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Coste_m), 4, 0));
                  AV231Unidades = AV133Kgm ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavUnidades_Internalname, GXutil.ltrimstr( AV231Unidades, 9, 2));
                  AV232Unidadest = (short)(DecimalUtil.decToDouble(AV133Kgm)) ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavUnidadest_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV232Unidadest), 4, 0));
               }
            }
            else
            {
               if ( A5720BarFasMtT.doubleValue() > 0 )
               {
                  AV62Coste_m = (short)(DecimalUtil.decToDouble((AV54cosprd1.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN))) ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavCoste_m_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Coste_m), 4, 0));
                  AV231Unidades = A3838BarFasMtr ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavUnidades_Internalname, GXutil.ltrimstr( AV231Unidades, 9, 2));
                  AV232Unidadest = (short)(DecimalUtil.decToDouble(A5720BarFasMtT)) ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavUnidadest_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV232Unidadest), 4, 0));
               }
               else
               {
                  AV62Coste_m = (short)(DecimalUtil.decToDouble(((AV182Mtr.doubleValue()>0) ? (AV54cosprd1.multiply(AV182Mtr)).divide(AV182Mtr, 18, java.math.RoundingMode.DOWN) : AV54cosprd1))) ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavCoste_m_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Coste_m), 4, 0));
                  AV231Unidades = AV182Mtr ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavUnidades_Internalname, GXutil.ltrimstr( AV231Unidades, 9, 2));
                  AV232Unidadest = (short)(DecimalUtil.decToDouble(AV182Mtr)) ;
                  httpContext.ajax_rsp_assign_attri("", false, edtavUnidadest_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV232Unidadest), 4, 0));
               }
            }
         }
         AV212TieTeo = (short)(DecimalUtil.decToDouble(A216BarTieTeo)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavTieteo_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV212TieTeo), 4, 0));
         GXv_char15[0] = A396EmprCod ;
         GXv_int14[0] = A129BarCod ;
         GXv_int12[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = A457FasCod ;
         GXv_date18[0] = AV112fecteo ;
         GXv_decimal11[0] = AV225tteo ;
         GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char2[0] = "" ;
         GXv_char19[0] = A758ProCod ;
         GXv_char20[0] = A603MaqCodBis ;
         GXv_int13[0] = A252CliCod ;
         GXv_char21[0] = A212BarSer ;
         GXv_int17[0] = AV125hnd ;
         GXv_int6[0] = AV198Sicsv ;
         new app.ppla001(remoteHandle, context).execute( GXv_char15, GXv_int14, GXv_int12, GXv_char4, GXv_char3, GXv_date18, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_char2, GXv_char19, GXv_char20, GXv_int13, GXv_char21, GXv_int17, GXv_int6) ;
         analisecustoww_impl.this.A396EmprCod = GXv_char15[0] ;
         analisecustoww_impl.this.A129BarCod = GXv_int14[0] ;
         analisecustoww_impl.this.A132BarCodReo = GXv_int12[0] ;
         analisecustoww_impl.this.A130BarCodPar = GXv_char4[0] ;
         analisecustoww_impl.this.A457FasCod = GXv_char3[0] ;
         analisecustoww_impl.this.AV112fecteo = GXv_date18[0] ;
         analisecustoww_impl.this.AV225tteo = GXv_decimal11[0] ;
         analisecustoww_impl.this.A758ProCod = GXv_char19[0] ;
         analisecustoww_impl.this.A603MaqCodBis = GXv_char20[0] ;
         analisecustoww_impl.this.A252CliCod = GXv_int13[0] ;
         analisecustoww_impl.this.A212BarSer = GXv_char21[0] ;
         analisecustoww_impl.this.AV125hnd = GXv_int17[0] ;
         analisecustoww_impl.this.AV198Sicsv = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV112fecteo", localUtil.format(AV112fecteo, "99/99/99"));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECTEO", getSecureSignedToken( "", AV112fecteo));
         httpContext.ajax_rsp_assign_attri("", false, edtavTteo_Internalname, GXutil.ltrimstr( AV225tteo, 5, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTTEO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV225tteo, "Z9.99")));
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A603MaqCodBis", A603MaqCodBis);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         httpContext.ajax_rsp_assign_attri("", false, "AV125hnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125hnd), 10, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHND", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV125hnd), "ZZZZZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, "AV198Sicsv", GXutil.str( AV198Sicsv, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSICSV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV198Sicsv), "9")));
         GXv_char21[0] = A396EmprCod ;
         GXv_int14[0] = A252CliCod ;
         GXv_char20[0] = A212BarSer ;
         GXv_char19[0] = A135BarColNom ;
         GXv_int13[0] = A136BarColNum ;
         GXv_int12[0] = A218BarTipCol ;
         GXv_int7[0] = AV119Fornumcol ;
         new app.pfdnumcolor(remoteHandle, context).execute( GXv_char21, GXv_int14, GXv_char20, GXv_char19, GXv_int13, GXv_int12, GXv_int7) ;
         analisecustoww_impl.this.A396EmprCod = GXv_char21[0] ;
         analisecustoww_impl.this.A252CliCod = GXv_int14[0] ;
         analisecustoww_impl.this.A212BarSer = GXv_char20[0] ;
         analisecustoww_impl.this.A135BarColNom = GXv_char19[0] ;
         analisecustoww_impl.this.A136BarColNum = GXv_int13[0] ;
         analisecustoww_impl.this.A218BarTipCol = GXv_int12[0] ;
         analisecustoww_impl.this.AV119Fornumcol = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV119Fornumcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119Fornumcol), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV119Fornumcol), "ZZZZZZZ9")));
         AV39BarTipArt = A217BarTipArt ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBartipart_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarTipArt), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARTIPART"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(AV39BarTipArt), "ZZZ9")));
         /* Execute user subroutine: 'FAMILIA' */
         S195 ();
         if ( returnInSub )
         {
            pr_default.close(11);
            pr_default.close(11);
            pr_default.close(11);
            pr_default.close(11);
            returnInSub = true;
            if (true) return;
         }
         GXv_char21[0] = A396EmprCod ;
         GXv_int14[0] = AV119Fornumcol ;
         GXv_int22[0] = AV122Grdtipart ;
         GXv_int23[0] = AV209teotixfi ;
         new app.pteoftixfi(remoteHandle, context).execute( GXv_char21, GXv_int14, GXv_int22, GXv_int23) ;
         analisecustoww_impl.this.A396EmprCod = GXv_char21[0] ;
         analisecustoww_impl.this.AV119Fornumcol = GXv_int14[0] ;
         analisecustoww_impl.this.AV122Grdtipart = GXv_int22[0] ;
         analisecustoww_impl.this.AV209teotixfi = GXv_int23[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV119Fornumcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119Fornumcol), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV119Fornumcol), "ZZZZZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavGrdtipart_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122Grdtipart), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRDTIPART"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(AV122Grdtipart), "ZZZ9")));
         httpContext.ajax_rsp_assign_attri("", false, edtavTeotixfi_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV209teotixfi), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEOTIXFI"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(AV209teotixfi), "ZZZ9")));
         AV209teotixfi = (short)(((GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", ""))==0) ? AV209teotixfi : 0)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavTeotixfi_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV209teotixfi), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEOTIXFI"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( DecimalUtil.doubleToDec(AV209teotixfi), "ZZZ9")));
         AV225tteo = ((GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", ""))==0)&&(AV180Moda21==1) ? DecimalUtil.doubleToDec(AV209teotixfi/ (double) (60)) : AV225tteo) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavTteo_Internalname, GXutil.ltrimstr( AV225tteo, 5, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTTEO"+"_"+sGXsfl_144_idx, getSecureSignedToken( sGXsfl_144_idx, localUtil.format( AV225tteo, "Z9.99")));
         AV53CosPrd = DecimalUtil.doubleToDec(0) ;
         AV73Coste_tm = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCoste_tm_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73Coste_tm), 4, 0));
         AV176Min = (byte)((AV212TieTeo-GXutil.Int( AV212TieTeo))*100) ;
         AV53CosPrd = ((AV167MaqCosMin.doubleValue()>0) ? GXutil.roundDecimal( (DecimalUtil.doubleToDec(((GXutil.Int( AV212TieTeo)*60)+AV176Min)).multiply(AV167MaqCosMin)), 2) : ((AV166MaqCosKg.doubleValue()>0) ? GXutil.roundDecimal( (AV133Kgm.multiply(AV166MaqCosKg)), 2) : ((AV165MaqCosFijo.doubleValue()>0) ? AV165MaqCosFijo : DecimalUtil.doubleToDec(0)))) ;
         if ( GXutil.strcmp(GXutil.trim( AV214TipmaqCod), httpContext.getMessage( "EXT", "")) == 0 )
         {
            AV73Coste_tm = (short)(DecimalUtil.decToDouble(((GXutil.strcmp(AV42BarUniMed, httpContext.getMessage( "K", ""))==0) ? GXutil.roundDecimal( (AV167MaqCosMin.multiply(AV133Kgm)), 2) : GXutil.roundDecimal( (AV167MaqCosMin.multiply(AV182Mtr)), 2)))) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCoste_tm_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73Coste_tm), 4, 0));
         }
         else
         {
            if ( GXutil.strcmp(AV42BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               AV73Coste_tm = (short)(DecimalUtil.decToDouble(((A5719BarFasKgT.doubleValue()>0) ? (AV53CosPrd.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) : AV53CosPrd))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCoste_tm_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73Coste_tm), 4, 0));
            }
            else
            {
               AV73Coste_tm = (short)(DecimalUtil.decToDouble(((A5720BarFasMtT.doubleValue()>0) ? (AV53CosPrd.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) : AV53CosPrd))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavCoste_tm_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73Coste_tm), 4, 0));
            }
         }
         AV44Ceros4 = "0000" ;
         AV128HorIni = GXutil.str( A165BarHorIni, 4, 0) ;
         AV128HorIni = GXutil.ltrim( GXutil.rtrim( AV128HorIni)) ;
         AV138Lenvar = (short)(GXutil.len( AV128HorIni)) ;
         AV138Lenvar = (short)(4-AV138Lenvar) ;
         AV128HorIni = GXutil.substring( AV44Ceros4, 1, AV138Lenvar) + AV128HorIni ;
         AV129HorIni_5 = GXutil.substring( AV128HorIni, 1, 2) + "." + GXutil.substring( AV128HorIni, 3, 2) ;
         AV126HorFin = GXutil.str( A164BarHorFin, 4, 0) ;
         AV126HorFin = GXutil.ltrim( GXutil.rtrim( AV126HorFin)) ;
         AV138Lenvar = (short)(GXutil.len( AV126HorFin)) ;
         AV138Lenvar = (short)(4-AV138Lenvar) ;
         AV126HorFin = GXutil.substring( AV44Ceros4, 1, AV138Lenvar) + AV126HorFin ;
         AV127HorFin_5 = GXutil.substring( AV126HorFin, 1, 2) + "." + GXutil.substring( AV126HorFin, 3, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavHorfin_5_Internalname, AV127HorFin_5);
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) != 0 )
         {
            AV69Coste_p_k = (short)(DecimalUtil.decToDouble(((AV133Kgm.doubleValue()>0) ? DecimalUtil.doubleToDec(AV62Coste_m).divide(AV133Kgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)))) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCoste_p_k_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Coste_p_k), 4, 0));
         }
         else
         {
            AV69Coste_p_k = (short)(DecimalUtil.decToDouble(((AV133Kgm.doubleValue()>0) ? (DecimalUtil.doubleToDec(AV62Coste_m).add(AV18BarCosPro).add(AV17BarCosAny)).divide(AV133Kgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)))) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCoste_p_k_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69Coste_p_k), 4, 0));
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(144) ;
         }
         if ( ( subSubfile2_Islastpage == 1 ) || ( subSubfile2_Rows == 0 ) || ( ( SUBFILE2_nCurrentRecord >= SUBFILE2_nFirstRecordOnPage ) && ( SUBFILE2_nCurrentRecord < SUBFILE2_nFirstRecordOnPage + subsubfile2_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1444( ) ;
            SUBFILE2_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_nEOF", GXutil.ltrim( localUtil.ntoc( SUBFILE2_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subSubfile2_Islastpage == 1 ) && ( ((int)((SUBFILE2_nCurrentRecord) % (subsubfile2_fnc_recordsperpage( )))) == 0 ) )
            {
               SUBFILE2_nFirstRecordOnPage = SUBFILE2_nCurrentRecord ;
            }
         }
         if ( SUBFILE2_nCurrentRecord >= SUBFILE2_nFirstRecordOnPage + subsubfile2_fnc_recordsperpage( ) )
         {
            SUBFILE2_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "SUBFILE2_nEOF", GXutil.ltrim( localUtil.ntoc( SUBFILE2_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         SUBFILE2_nCurrentRecord = (long)(SUBFILE2_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_144_Refreshing )
         {
            httpContext.doAjaxLoad(144, Subfile2Row);
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
      GXt_int5 = AV200Stat ;
      GXv_int12[0] = GXt_int5 ;
      new app.core.fclose(remoteHandle, context).execute( AV125hnd, GXv_int12) ;
      analisecustoww_impl.this.GXt_int5 = GXv_int12[0] ;
      AV200Stat = GXt_int5 ;
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      pa2CY2( ) ;
      ws2CY2( ) ;
      we2CY2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
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

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714253245", true, true);
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
         httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
         httpContext.AddJavascriptSource("facturacion/analisecustoww.js", "?202681714253246", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
         httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
         httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_1112( )
   {
      edtavDetails_Internalname = "vDETAILS_"+sGXsfl_111_idx ;
      edtavClicod_Internalname = "vCLICOD_"+sGXsfl_111_idx ;
      edtavClinom_Internalname = "vCLINOM_"+sGXsfl_111_idx ;
      edtavBarcod_Internalname = "vBARCOD_"+sGXsfl_111_idx ;
      edtavBarcodreo_Internalname = "vBARCODREO_"+sGXsfl_111_idx ;
      edtavBarcodpar_Internalname = "vBARCODPAR_"+sGXsfl_111_idx ;
      edtavBarenccli_Internalname = "vBARENCCLI_"+sGXsfl_111_idx ;
      edtavBarser_Internalname = "vBARSER_"+sGXsfl_111_idx ;
      edtavBarserdsc_Internalname = "vBARSERDSC_"+sGXsfl_111_idx ;
      edtavBarcolnom_Internalname = "vBARCOLNOM_"+sGXsfl_111_idx ;
      edtavBarcolnum_Internalname = "vBARCOLNUM_"+sGXsfl_111_idx ;
      edtavPrograma_Internalname = "vPROGRAMA_"+sGXsfl_111_idx ;
      edtavBarkgm_Internalname = "vBARKGM_"+sGXsfl_111_idx ;
      edtavBarmtr_Internalname = "vBARMTR_"+sGXsfl_111_idx ;
      edtavCoste_p_Internalname = "vCOSTE_P_"+sGXsfl_111_idx ;
      edtavCostefab_Internalname = "vCOSTEFAB_"+sGXsfl_111_idx ;
      edtavValor_Internalname = "vVALOR_"+sGXsfl_111_idx ;
      edtavMargen_Internalname = "vMARGEN_"+sGXsfl_111_idx ;
      edtavTxtalb_Internalname = "vTXTALB_"+sGXsfl_111_idx ;
      edtavBarfecgen_Internalname = "vBARFECGEN_"+sGXsfl_111_idx ;
      edtavBarfecsal_Internalname = "vBARFECSAL_"+sGXsfl_111_idx ;
      edtavBartipdis_Internalname = "vBARTIPDIS_"+sGXsfl_111_idx ;
      edtavCostepold_Internalname = "vCOSTEPOLD_"+sGXsfl_111_idx ;
      edtavKilosppieza_Internalname = "vKILOSPPIEZA_"+sGXsfl_111_idx ;
   }

   public void subsflControlProps_fel_1112( )
   {
      edtavDetails_Internalname = "vDETAILS_"+sGXsfl_111_fel_idx ;
      edtavClicod_Internalname = "vCLICOD_"+sGXsfl_111_fel_idx ;
      edtavClinom_Internalname = "vCLINOM_"+sGXsfl_111_fel_idx ;
      edtavBarcod_Internalname = "vBARCOD_"+sGXsfl_111_fel_idx ;
      edtavBarcodreo_Internalname = "vBARCODREO_"+sGXsfl_111_fel_idx ;
      edtavBarcodpar_Internalname = "vBARCODPAR_"+sGXsfl_111_fel_idx ;
      edtavBarenccli_Internalname = "vBARENCCLI_"+sGXsfl_111_fel_idx ;
      edtavBarser_Internalname = "vBARSER_"+sGXsfl_111_fel_idx ;
      edtavBarserdsc_Internalname = "vBARSERDSC_"+sGXsfl_111_fel_idx ;
      edtavBarcolnom_Internalname = "vBARCOLNOM_"+sGXsfl_111_fel_idx ;
      edtavBarcolnum_Internalname = "vBARCOLNUM_"+sGXsfl_111_fel_idx ;
      edtavPrograma_Internalname = "vPROGRAMA_"+sGXsfl_111_fel_idx ;
      edtavBarkgm_Internalname = "vBARKGM_"+sGXsfl_111_fel_idx ;
      edtavBarmtr_Internalname = "vBARMTR_"+sGXsfl_111_fel_idx ;
      edtavCoste_p_Internalname = "vCOSTE_P_"+sGXsfl_111_fel_idx ;
      edtavCostefab_Internalname = "vCOSTEFAB_"+sGXsfl_111_fel_idx ;
      edtavValor_Internalname = "vVALOR_"+sGXsfl_111_fel_idx ;
      edtavMargen_Internalname = "vMARGEN_"+sGXsfl_111_fel_idx ;
      edtavTxtalb_Internalname = "vTXTALB_"+sGXsfl_111_fel_idx ;
      edtavBarfecgen_Internalname = "vBARFECGEN_"+sGXsfl_111_fel_idx ;
      edtavBarfecsal_Internalname = "vBARFECSAL_"+sGXsfl_111_fel_idx ;
      edtavBartipdis_Internalname = "vBARTIPDIS_"+sGXsfl_111_fel_idx ;
      edtavCostepold_Internalname = "vCOSTEPOLD_"+sGXsfl_111_fel_idx ;
      edtavKilosppieza_Internalname = "vKILOSPPIEZA_"+sGXsfl_111_fel_idx ;
   }

   public void sendrow_1112( )
   {
      subsflControlProps_1112( ) ;
      wb2CY0( ) ;
      if ( ( subSubfile1_Rows * 1 == 0 ) || ( nGXsfl_111_idx <= subsubfile1_fnc_recordsperpage( ) * 1 ) )
      {
         Subfile1Row = GXWebRow.GetNew(context,Subfile1Container) ;
         if ( subSubfile1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subSubfile1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subSubfile1_Class, "") != 0 )
            {
               subSubfile1_Linesclass = subSubfile1_Class+"Odd" ;
            }
         }
         else if ( subSubfile1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subSubfile1_Backstyle = (byte)(0) ;
            subSubfile1_Backcolor = subSubfile1_Allbackcolor ;
            if ( GXutil.strcmp(subSubfile1_Class, "") != 0 )
            {
               subSubfile1_Linesclass = subSubfile1_Class+"Uniform" ;
            }
         }
         else if ( subSubfile1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subSubfile1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subSubfile1_Class, "") != 0 )
            {
               subSubfile1_Linesclass = subSubfile1_Class+"Odd" ;
            }
            subSubfile1_Backcolor = (int)(0x0) ;
         }
         else if ( subSubfile1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subSubfile1_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_111_idx) % (2))) == 0 )
            {
               subSubfile1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subSubfile1_Class, "") != 0 )
               {
                  subSubfile1_Linesclass = subSubfile1_Class+"Even" ;
               }
            }
            else
            {
               subSubfile1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subSubfile1_Class, "") != 0 )
               {
                  subSubfile1_Linesclass = subSubfile1_Class+"Odd" ;
               }
            }
         }
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_111_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavDetails_Enabled!=0)&&(edtavDetails_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 112,'',false,'',111)\"" : " ") ;
         ClassString = "Attribute" + " " + ((GXutil.strcmp(edtavDetails_gximage, "")==0) ? "" : "GX_Image_"+edtavDetails_gximage+"_Class") ;
         StyleString = "" ;
         AV254Details_IsBlob = (boolean)(((GXutil.strcmp("", AV254Details)==0)&&(GXutil.strcmp("", AV259Details_GXI)==0))||!(GXutil.strcmp("", AV254Details)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV254Details)==0) ? AV259Details_GXI : httpContext.getResourceRelative(AV254Details)) ;
         Subfile1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavDetails_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(7),edtavDetails_Jsonclick,"'"+""+"'"+",false,"+"'"+"e252cy2_client"+"'",StyleString,ClassString,"WWColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV254Details_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavClicod_Enabled!=0)&&(edtavClicod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 113,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClicod_Internalname,GXutil.ltrim( localUtil.ntoc( AV45CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV45CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV45CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavClicod_Enabled!=0)&&(edtavClicod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavClicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavClicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavClinom_Enabled!=0)&&(edtavClinom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 114,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClinom_Internalname,GXutil.rtrim( AV49CliNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavClinom_Enabled!=0)&&(edtavClinom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,114);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavClinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavClinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcod_Enabled!=0)&&(edtavBarcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 115,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarcod_Enabled!=0)&&(edtavBarcod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,115);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcodreo_Enabled!=0)&&(edtavBarcodreo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 116,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( AV13BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarcodreo_Enabled!=0)&&(edtavBarcodreo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcodpar_Enabled!=0)&&(edtavBarcodpar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 117,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodpar_Internalname,GXutil.rtrim( AV11BarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarcodpar_Enabled!=0)&&(edtavBarcodpar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,117);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarenccli_Enabled!=0)&&(edtavBarenccli_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 118,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarenccli_Internalname,GXutil.rtrim( AV22BarEncCli),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarenccli_Enabled!=0)&&(edtavBarenccli_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,118);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarser_Enabled!=0)&&(edtavBarser_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 119,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarser_Internalname,GXutil.rtrim( AV36BarSer),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarser_Enabled!=0)&&(edtavBarser_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,119);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarserdsc_Enabled!=0)&&(edtavBarserdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 120,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarserdsc_Internalname,GXutil.rtrim( AV37BarSerDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarserdsc_Enabled!=0)&&(edtavBarserdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,120);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcolnom_Enabled!=0)&&(edtavBarcolnom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 121,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcolnom_Internalname,GXutil.rtrim( AV15BarColNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarcolnom_Enabled!=0)&&(edtavBarcolnom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,121);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcolnum_Enabled!=0)&&(edtavBarcolnum_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 122,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( AV16BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV16BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV16BarColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarcolnum_Enabled!=0)&&(edtavBarcolnum_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,122);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrograma_Enabled!=0)&&(edtavPrograma_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 123,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrograma_Internalname,GXutil.ltrim( localUtil.ntoc( AV196Programa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrograma_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV196Programa), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV196Programa), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavPrograma_Enabled!=0)&&(edtavPrograma_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,123);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrograma_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrograma_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarkgm_Enabled!=0)&&(edtavBarkgm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 124,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarkgm_Internalname,GXutil.ltrim( localUtil.ntoc( AV28BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV28BarKgm, "ZZZZZ9.99") : localUtil.format( AV28BarKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavBarkgm_Enabled!=0)&&(edtavBarkgm_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,124);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarmtr_Enabled!=0)&&(edtavBarmtr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 125,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarmtr_Internalname,GXutil.ltrim( localUtil.ntoc( AV31BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV31BarMtr, "ZZZZZ9.99") : localUtil.format( AV31BarMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavBarmtr_Enabled!=0)&&(edtavBarmtr_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,125);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarmtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarmtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCoste_p_Enabled!=0)&&(edtavCoste_p_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 126,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCoste_p_Internalname,GXutil.ltrim( localUtil.ntoc( AV68Coste_p, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCoste_p_Enabled!=0) ? localUtil.format( AV68Coste_p, "ZZZZZZ9.99") : localUtil.format( AV68Coste_p, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCoste_p_Enabled!=0)&&(edtavCoste_p_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,126);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCoste_p_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCoste_p_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCostefab_Enabled!=0)&&(edtavCostefab_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 127,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostefab_Internalname,GXutil.ltrim( localUtil.ntoc( AV78CosteFab, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostefab_Enabled!=0) ? localUtil.format( AV78CosteFab, "ZZZZZZZZ9.99") : localUtil.format( AV78CosteFab, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCostefab_Enabled!=0)&&(edtavCostefab_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,127);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCostefab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCostefab_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavValor_Enabled!=0)&&(edtavValor_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 128,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValor_Internalname,GXutil.ltrim( localUtil.ntoc( AV235Valor, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavValor_Enabled!=0) ? localUtil.format( AV235Valor, "ZZZZZZZZ9.99") : localUtil.format( AV235Valor, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavValor_Enabled!=0)&&(edtavValor_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,128);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavValor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavValor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMargen_Enabled!=0)&&(edtavMargen_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 129,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMargen_Internalname,GXutil.ltrim( localUtil.ntoc( AV173Margen, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMargen_Enabled!=0) ? localUtil.format( AV173Margen, "ZZZZZZZZ9.99") : localUtil.format( AV173Margen, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavMargen_Enabled!=0)&&(edtavMargen_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,129);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMargen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMargen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTxtalb_Enabled!=0)&&(edtavTxtalb_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 130,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTxtalb_Internalname,AV227TxtAlb,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavTxtalb_Enabled!=0)&&(edtavTxtalb_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,130);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTxtalb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTxtalb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarfecgen_Enabled!=0)&&(edtavBarfecgen_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 131,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfecgen_Internalname,localUtil.format(AV26BarFecGen, "99/99/99"),localUtil.format( AV26BarFecGen, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavBarfecgen_Enabled!=0)&&(edtavBarfecgen_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,131);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfecgen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarfecgen_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarfecsal_Enabled!=0)&&(edtavBarfecsal_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 132,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfecsal_Internalname,localUtil.format(AV27BarFecSal, "99/99/99"),localUtil.format( AV27BarFecSal, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavBarfecsal_Enabled!=0)&&(edtavBarfecsal_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,132);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfecsal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarfecsal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBartipdis_Enabled!=0)&&(edtavBartipdis_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 133,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBartipdis_Internalname,GXutil.rtrim( AV41BarTipDis),GXutil.rtrim( localUtil.format( AV41BarTipDis, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavBartipdis_Enabled!=0)&&(edtavBartipdis_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,133);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBartipdis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBartipdis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCostepold_Enabled!=0)&&(edtavCostepold_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 134,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostepold_Internalname,GXutil.ltrim( localUtil.ntoc( AV82CostepOld, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostepold_Enabled!=0) ? localUtil.format( AV82CostepOld, "ZZZZZZ9.99") : localUtil.format( AV82CostepOld, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCostepold_Enabled!=0)&&(edtavCostepold_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,134);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCostepold_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCostepold_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavKilosppieza_Enabled!=0)&&(edtavKilosppieza_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 135,'',false,'"+sGXsfl_111_idx+"',111)\"" : " ") ;
         ROClassString = "Attribute" ;
         Subfile1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKilosppieza_Internalname,GXutil.ltrim( localUtil.ntoc( AV136KilospPieza, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavKilosppieza_Enabled!=0) ? localUtil.format( AV136KilospPieza, "ZZZZZ9.99") : localUtil.format( AV136KilospPieza, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavKilosppieza_Enabled!=0)&&(edtavKilosppieza_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,135);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavKilosppieza_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavKilosppieza_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(111),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2CY2( ) ;
         Subfile1Container.AddRow(Subfile1Row);
         nGXsfl_111_idx = ((subSubfile1_Islastpage==1)&&(nGXsfl_111_idx+1>subsubfile1_fnc_recordsperpage( )) ? 1 : nGXsfl_111_idx+1) ;
         sGXsfl_111_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_111_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1112( ) ;
      }
      /* End function sendrow_1112 */
   }

   public void subsflControlProps_1444( )
   {
      edtavBarfassec_Internalname = "vBARFASSEC_"+sGXsfl_144_idx ;
      edtavBarordlin_Internalname = "vBARORDLIN_"+sGXsfl_144_idx ;
      edtavFasdsc_Internalname = "vFASDSC_"+sGXsfl_144_idx ;
      edtavMaqcod_Internalname = "vMAQCOD_"+sGXsfl_144_idx ;
      edtavMaqdsc_Internalname = "vMAQDSC_"+sGXsfl_144_idx ;
      edtavUnidades_Internalname = "vUNIDADES_"+sGXsfl_144_idx ;
      edtavUnidadest_Internalname = "vUNIDADEST_"+sGXsfl_144_idx ;
      edtavBarunimed_Internalname = "vBARUNIMED_"+sGXsfl_144_idx ;
      edtavHorlni_5_Internalname = "vHORLNI_5_"+sGXsfl_144_idx ;
      edtavHorfin_5_Internalname = "vHORFIN_5_"+sGXsfl_144_idx ;
      edtavBartierea_Internalname = "vBARTIEREA_"+sGXsfl_144_idx ;
      edtavTteo_Internalname = "vTTEO_"+sGXsfl_144_idx ;
      edtavMaqcosmin_Internalname = "vMAQCOSMIN_"+sGXsfl_144_idx ;
      edtavMaqcoskg_Internalname = "vMAQCOSKG_"+sGXsfl_144_idx ;
      edtavMaqcosfijo_Internalname = "vMAQCOSFIJO_"+sGXsfl_144_idx ;
      edtavCoste_m_Internalname = "vCOSTE_M_"+sGXsfl_144_idx ;
      edtavCoste_tm_Internalname = "vCOSTE_TM_"+sGXsfl_144_idx ;
      edtavTieteo_Internalname = "vTIETEO_"+sGXsfl_144_idx ;
      edtavFascod_Internalname = "vFASCOD_"+sGXsfl_144_idx ;
      edtavCoste_p_k_Internalname = "vCOSTE_P_K_"+sGXsfl_144_idx ;
      edtavTeotixfi_Internalname = "vTEOTIXFI_"+sGXsfl_144_idx ;
      edtavFomumcol_Internalname = "vFOMUMCOL_"+sGXsfl_144_idx ;
      edtavBartipart_Internalname = "vBARTIPART_"+sGXsfl_144_idx ;
      edtavGrdtipart_Internalname = "vGRDTIPART_"+sGXsfl_144_idx ;
   }

   public void subsflControlProps_fel_1444( )
   {
      edtavBarfassec_Internalname = "vBARFASSEC_"+sGXsfl_144_fel_idx ;
      edtavBarordlin_Internalname = "vBARORDLIN_"+sGXsfl_144_fel_idx ;
      edtavFasdsc_Internalname = "vFASDSC_"+sGXsfl_144_fel_idx ;
      edtavMaqcod_Internalname = "vMAQCOD_"+sGXsfl_144_fel_idx ;
      edtavMaqdsc_Internalname = "vMAQDSC_"+sGXsfl_144_fel_idx ;
      edtavUnidades_Internalname = "vUNIDADES_"+sGXsfl_144_fel_idx ;
      edtavUnidadest_Internalname = "vUNIDADEST_"+sGXsfl_144_fel_idx ;
      edtavBarunimed_Internalname = "vBARUNIMED_"+sGXsfl_144_fel_idx ;
      edtavHorlni_5_Internalname = "vHORLNI_5_"+sGXsfl_144_fel_idx ;
      edtavHorfin_5_Internalname = "vHORFIN_5_"+sGXsfl_144_fel_idx ;
      edtavBartierea_Internalname = "vBARTIEREA_"+sGXsfl_144_fel_idx ;
      edtavTteo_Internalname = "vTTEO_"+sGXsfl_144_fel_idx ;
      edtavMaqcosmin_Internalname = "vMAQCOSMIN_"+sGXsfl_144_fel_idx ;
      edtavMaqcoskg_Internalname = "vMAQCOSKG_"+sGXsfl_144_fel_idx ;
      edtavMaqcosfijo_Internalname = "vMAQCOSFIJO_"+sGXsfl_144_fel_idx ;
      edtavCoste_m_Internalname = "vCOSTE_M_"+sGXsfl_144_fel_idx ;
      edtavCoste_tm_Internalname = "vCOSTE_TM_"+sGXsfl_144_fel_idx ;
      edtavTieteo_Internalname = "vTIETEO_"+sGXsfl_144_fel_idx ;
      edtavFascod_Internalname = "vFASCOD_"+sGXsfl_144_fel_idx ;
      edtavCoste_p_k_Internalname = "vCOSTE_P_K_"+sGXsfl_144_fel_idx ;
      edtavTeotixfi_Internalname = "vTEOTIXFI_"+sGXsfl_144_fel_idx ;
      edtavFomumcol_Internalname = "vFOMUMCOL_"+sGXsfl_144_fel_idx ;
      edtavBartipart_Internalname = "vBARTIPART_"+sGXsfl_144_fel_idx ;
      edtavGrdtipart_Internalname = "vGRDTIPART_"+sGXsfl_144_fel_idx ;
   }

   public void sendrow_1444( )
   {
      subsflControlProps_1444( ) ;
      wb2CY0( ) ;
      if ( ( subSubfile2_Rows * 1 == 0 ) || ( nGXsfl_144_idx <= subsubfile2_fnc_recordsperpage( ) * 1 ) )
      {
         Subfile2Row = GXWebRow.GetNew(context,Subfile2Container) ;
         if ( subSubfile2_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subSubfile2_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subSubfile2_Class, "") != 0 )
            {
               subSubfile2_Linesclass = subSubfile2_Class+"Odd" ;
            }
         }
         else if ( subSubfile2_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subSubfile2_Backstyle = (byte)(0) ;
            subSubfile2_Backcolor = subSubfile2_Allbackcolor ;
            if ( GXutil.strcmp(subSubfile2_Class, "") != 0 )
            {
               subSubfile2_Linesclass = subSubfile2_Class+"Uniform" ;
            }
         }
         else if ( subSubfile2_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subSubfile2_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subSubfile2_Class, "") != 0 )
            {
               subSubfile2_Linesclass = subSubfile2_Class+"Odd" ;
            }
            subSubfile2_Backcolor = (int)(0x0) ;
         }
         else if ( subSubfile2_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subSubfile2_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_144_idx) % (2))) == 0 )
            {
               subSubfile2_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subSubfile2_Class, "") != 0 )
               {
                  subSubfile2_Linesclass = subSubfile2_Class+"Even" ;
               }
            }
            else
            {
               subSubfile2_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subSubfile2_Class, "") != 0 )
               {
                  subSubfile2_Linesclass = subSubfile2_Class+"Odd" ;
               }
            }
         }
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_144_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfassec_Internalname,GXutil.rtrim( AV25BarFasSec),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfassec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarfassec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarordlin_Internalname,GXutil.ltrim( localUtil.ntoc( AV32BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV32BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV32BarOrdLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarordlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarordlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFasdsc_Internalname,GXutil.rtrim( AV105FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod_Internalname,GXutil.rtrim( AV163MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMaqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqdsc_Internalname,GXutil.rtrim( AV168MaqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMaqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavUnidades_Internalname,GXutil.ltrim( localUtil.ntoc( AV231Unidades, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavUnidades_Enabled!=0) ? localUtil.format( AV231Unidades, "ZZZZZ9.99") : localUtil.format( AV231Unidades, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavUnidades_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavUnidades_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavUnidadest_Internalname,GXutil.ltrim( localUtil.ntoc( AV232Unidadest, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavUnidadest_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV232Unidadest), "ZZZZZ9.99") : localUtil.format( DecimalUtil.doubleToDec(AV232Unidadest), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavUnidadest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavUnidadest_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarunimed_Internalname,GXutil.rtrim( AV42BarUniMed),GXutil.rtrim( localUtil.format( AV42BarUniMed, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarunimed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarunimed_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHorlni_5_Internalname,GXutil.rtrim( AV249Horlni_5),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHorlni_5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHorlni_5_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHorfin_5_Internalname,GXutil.rtrim( AV127HorFin_5),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHorfin_5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHorfin_5_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBartierea_Internalname,GXutil.ltrim( localUtil.ntoc( AV38BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBartierea_Enabled!=0) ? localUtil.format( AV38BarTieRea, "Z9.99") : localUtil.format( AV38BarTieRea, "Z9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBartierea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBartierea_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTteo_Internalname,GXutil.ltrim( localUtil.ntoc( AV225tteo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTteo_Enabled!=0) ? localUtil.format( AV225tteo, "Z9.99") : localUtil.format( AV225tteo, "Z9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTteo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTteo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcosmin_Internalname,GXutil.ltrim( localUtil.ntoc( AV167MaqCosMin, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMaqcosmin_Enabled!=0) ? localUtil.format( AV167MaqCosMin, "ZZZZ9.9999") : localUtil.format( AV167MaqCosMin, "ZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcosmin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMaqcosmin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcoskg_Internalname,GXutil.ltrim( localUtil.ntoc( AV166MaqCosKg, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMaqcoskg_Enabled!=0) ? localUtil.format( AV166MaqCosKg, "ZZZZ9.9999") : localUtil.format( AV166MaqCosKg, "ZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcoskg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMaqcoskg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcosfijo_Internalname,GXutil.ltrim( localUtil.ntoc( AV165MaqCosFijo, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMaqcosfijo_Enabled!=0) ? localUtil.format( AV165MaqCosFijo, "ZZZZ9.9999") : localUtil.format( AV165MaqCosFijo, "ZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcosfijo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMaqcosfijo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCoste_m_Internalname,GXutil.ltrim( localUtil.ntoc( AV62Coste_m, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCoste_m_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV62Coste_m), "ZZZZZZ9.99") : localUtil.format( DecimalUtil.doubleToDec(AV62Coste_m), "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCoste_m_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCoste_m_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCoste_tm_Internalname,GXutil.ltrim( localUtil.ntoc( AV73Coste_tm, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCoste_tm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV73Coste_tm), "ZZZZZZZZ9.99") : localUtil.format( DecimalUtil.doubleToDec(AV73Coste_tm), "ZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCoste_tm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCoste_tm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTieteo_Internalname,GXutil.ltrim( localUtil.ntoc( AV212TieTeo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTieteo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV212TieTeo), "ZZ9.99") : localUtil.format( DecimalUtil.doubleToDec(AV212TieTeo), "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTieteo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTieteo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFascod_Internalname,GXutil.rtrim( AV104FasCod),GXutil.rtrim( localUtil.format( AV104FasCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCoste_p_k_Internalname,GXutil.ltrim( localUtil.ntoc( AV69Coste_p_k, (byte)(7), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCoste_p_k_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV69Coste_p_k), "ZZZ9.99") : localUtil.format( DecimalUtil.doubleToDec(AV69Coste_p_k), "ZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCoste_p_k_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCoste_p_k_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTeotixfi_Internalname,GXutil.ltrim( localUtil.ntoc( AV209teotixfi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTeotixfi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV209teotixfi), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV209teotixfi), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTeotixfi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTeotixfi_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFomumcol_Internalname,GXutil.ltrim( localUtil.ntoc( AV250Fomumcol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFomumcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV250Fomumcol), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV250Fomumcol), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFomumcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFomumcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBartipart_Internalname,GXutil.ltrim( localUtil.ntoc( AV39BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBartipart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV39BarTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV39BarTipArt), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBartipart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBartipart_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Subfile2Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Subfile2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGrdtipart_Internalname,GXutil.ltrim( localUtil.ntoc( AV122Grdtipart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGrdtipart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV122Grdtipart), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV122Grdtipart), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGrdtipart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGrdtipart_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(144),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2CY4( ) ;
         Subfile2Container.AddRow(Subfile2Row);
         nGXsfl_144_idx = ((subSubfile2_Islastpage==1)&&(nGXsfl_144_idx+1>subsubfile2_fnc_recordsperpage( )) ? 1 : nGXsfl_144_idx+1) ;
         sGXsfl_144_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_144_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1444( ) ;
      }
      /* End function sendrow_1444 */
   }

   public void startgridcontrol111( )
   {
      if ( Subfile1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Subfile1Container"+"DivS\" data-gxgridid=\"111\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subSubfile1_Internalname, subSubfile1_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subSubfile1_Backcolorstyle == 0 )
         {
            subSubfile1_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subSubfile1_Class) > 0 )
            {
               subSubfile1_Linesclass = subSubfile1_Class+"Title" ;
            }
         }
         else
         {
            subSubfile1_Titlebackstyle = (byte)(1) ;
            if ( subSubfile1_Backcolorstyle == 1 )
            {
               subSubfile1_Titlebackcolor = subSubfile1_Allbackcolor ;
               if ( GXutil.len( subSubfile1_Class) > 0 )
               {
                  subSubfile1_Linesclass = subSubfile1_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subSubfile1_Class) > 0 )
               {
                  subSubfile1_Linesclass = subSubfile1_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+" "+((GXutil.strcmp(edtavDetails_gximage, "")==0) ? "" : "GX_Image_"+edtavDetails_gximage+"_Class")+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "OS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Enc Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Prog", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Q", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Fab", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavValor_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Margen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Guia(s)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha OS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Old", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilosp Piezza", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Subfile1Container.AddObjectProperty("GridName", "Subfile1");
      }
      else
      {
         Subfile1Container.AddObjectProperty("GridName", "Subfile1");
         Subfile1Container.AddObjectProperty("Header", subSubfile1_Header);
         Subfile1Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         Subfile1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Subfile1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Subfile1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subSubfile1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Subfile1Container.AddObjectProperty("CmpContext", "");
         Subfile1Container.AddObjectProperty("InMasterPage", "false");
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", httpContext.convertURL( AV254Details));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV45CliCod, (byte)(6), (byte)(0), ".", "")));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.rtrim( AV49CliNom));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), ".", "")));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV13BarCodReo, (byte)(1), (byte)(0), ".", "")));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.rtrim( AV11BarCodPar));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.rtrim( AV22BarEncCli));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarenccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.rtrim( AV36BarSer));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarser_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.rtrim( AV37BarSerDsc));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.rtrim( AV15BarColNom));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV16BarColNum, (byte)(6), (byte)(0), ".", "")));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV196Programa, (byte)(4), (byte)(0), ".", "")));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrograma_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV28BarKgm, (byte)(9), (byte)(2), ".", "")));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV31BarMtr, (byte)(9), (byte)(2), ".", "")));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarmtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV68Coste_p, (byte)(10), (byte)(2), ".", "")));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCoste_p_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV78CosteFab, (byte)(12), (byte)(2), ".", "")));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostefab_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV235Valor, (byte)(12), (byte)(2), ".", "")));
         Subfile1Column.AddObjectProperty("Title", GXutil.rtrim( edtavValor_Title));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValor_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV173Margen, (byte)(12), (byte)(2), ".", "")));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMargen_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", AV227TxtAlb);
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTxtalb_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", localUtil.format(AV26BarFecGen, "99/99/99"));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfecgen_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", localUtil.format(AV27BarFecSal, "99/99/99"));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfecsal_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.rtrim( AV41BarTipDis));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBartipdis_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV82CostepOld, (byte)(10), (byte)(2), ".", "")));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostepold_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV136KilospPieza, (byte)(9), (byte)(2), ".", "")));
         Subfile1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavKilosppieza_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile1Container.AddColumnProperties(Subfile1Column);
         Subfile1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subSubfile1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Subfile1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subSubfile1_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Subfile1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subSubfile1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Subfile1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subSubfile1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Subfile1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subSubfile1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Subfile1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subSubfile1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Subfile1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subSubfile1_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol144( )
   {
      if ( Subfile2Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Subfile2Container"+"DivS\" data-gxgridid=\"144\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subSubfile2_Internalname, subSubfile2_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subSubfile2_Backcolorstyle == 0 )
         {
            subSubfile2_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subSubfile2_Class) > 0 )
            {
               subSubfile2_Linesclass = subSubfile2_Class+"Title" ;
            }
         }
         else
         {
            subSubfile2_Titlebackstyle = (byte)(1) ;
            if ( subSubfile2_Backcolorstyle == 1 )
            {
               subSubfile2_Titlebackcolor = subSubfile2_Allbackcolor ;
               if ( GXutil.len( subSubfile2_Class) > 0 )
               {
                  subSubfile2_Linesclass = subSubfile2_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subSubfile2_Class) > 0 )
               {
                  subSubfile2_Linesclass = subSubfile2_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Total", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TTeo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Maq", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costo fijo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Fijo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costo Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costo TM", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Gran Tipo de Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Subfile2Container.AddObjectProperty("GridName", "Subfile2");
      }
      else
      {
         Subfile2Container.AddObjectProperty("GridName", "Subfile2");
         Subfile2Container.AddObjectProperty("Header", subSubfile2_Header);
         Subfile2Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Subfile2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Subfile2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Subfile2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subSubfile2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Subfile2Container.AddObjectProperty("CmpContext", "");
         Subfile2Container.AddObjectProperty("InMasterPage", "false");
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.rtrim( AV25BarFasSec));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfassec_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV32BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarordlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.rtrim( AV105FasDsc));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.rtrim( AV163MaqCod));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.rtrim( AV168MaqDsc));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV231Unidades, (byte)(9), (byte)(2), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavUnidades_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV232Unidadest, (byte)(9), (byte)(0), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavUnidadest_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.rtrim( AV42BarUniMed));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarunimed_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.rtrim( AV249Horlni_5));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHorlni_5_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.rtrim( AV127HorFin_5));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHorfin_5_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV38BarTieRea, (byte)(5), (byte)(2), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBartierea_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV225tteo, (byte)(5), (byte)(2), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTteo_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV167MaqCosMin, (byte)(10), (byte)(4), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcosmin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV166MaqCosKg, (byte)(10), (byte)(4), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcoskg_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV165MaqCosFijo, (byte)(10), (byte)(4), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcosfijo_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV62Coste_m, (byte)(10), (byte)(0), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCoste_m_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV73Coste_tm, (byte)(12), (byte)(0), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCoste_tm_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV212TieTeo, (byte)(6), (byte)(0), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTieteo_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.rtrim( AV104FasCod));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV69Coste_p_k, (byte)(7), (byte)(0), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCoste_p_k_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV209teotixfi, (byte)(4), (byte)(0), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTeotixfi_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV250Fomumcol, (byte)(4), (byte)(0), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFomumcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV39BarTipArt, (byte)(4), (byte)(0), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBartipart_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Subfile2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV122Grdtipart, (byte)(4), (byte)(0), ".", "")));
         Subfile2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGrdtipart_Enabled, (byte)(5), (byte)(0), ".", "")));
         Subfile2Container.AddColumnProperties(Subfile2Column);
         Subfile2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subSubfile2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Subfile2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subSubfile2_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Subfile2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subSubfile2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Subfile2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subSubfile2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Subfile2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subSubfile2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Subfile2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subSubfile2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Subfile2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subSubfile2_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_clicod1_Internalname = "TEXTBLOCKCOMBO_CLICOD1" ;
      Combo_clicod1_Internalname = "COMBO_CLICOD1" ;
      divTablesplittedclicod1_Internalname = "TABLESPLITTEDCLICOD1" ;
      lblTextblockcombo_clicod2_Internalname = "TEXTBLOCKCOMBO_CLICOD2" ;
      Combo_clicod2_Internalname = "COMBO_CLICOD2" ;
      divTablesplittedclicod2_Internalname = "TABLESPLITTEDCLICOD2" ;
      edtavFec3_Internalname = "vFEC3" ;
      edtavFec4_Internalname = "vFEC4" ;
      edtavArtcod_Internalname = "vARTCOD" ;
      edtavBarcod1_Internalname = "vBARCOD1" ;
      edtavBarcodreo1_Internalname = "vBARCODREO1" ;
      edtavBarcodpar1_Internalname = "vBARCODPAR1" ;
      edtavSimulador_Internalname = "vSIMULADOR" ;
      edtavBardisnum_Internalname = "vBARDISNUM" ;
      edtavBarmancod1_Internalname = "vBARMANCOD1" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtnexcel_Internalname = "BTNEXCEL" ;
      bttBtnpdf_Internalname = "BTNPDF" ;
      bttBtncsv_Internalname = "BTNCSV" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTable_progress_Internalname = "TABLE_PROGRESS" ;
      edtavDetails_Internalname = "vDETAILS" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      edtavBarenccli_Internalname = "vBARENCCLI" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarserdsc_Internalname = "vBARSERDSC" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      edtavPrograma_Internalname = "vPROGRAMA" ;
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavBarmtr_Internalname = "vBARMTR" ;
      edtavCoste_p_Internalname = "vCOSTE_P" ;
      edtavCostefab_Internalname = "vCOSTEFAB" ;
      edtavValor_Internalname = "vVALOR" ;
      edtavMargen_Internalname = "vMARGEN" ;
      edtavTxtalb_Internalname = "vTXTALB" ;
      edtavBarfecgen_Internalname = "vBARFECGEN" ;
      edtavBarfecsal_Internalname = "vBARFECSAL" ;
      edtavBartipdis_Internalname = "vBARTIPDIS" ;
      edtavCostepold_Internalname = "vCOSTEPOLD" ;
      edtavKilosppieza_Internalname = "vKILOSPPIEZA" ;
      Subfile1paginationbar_Internalname = "SUBFILE1PAGINATIONBAR" ;
      divSubfile1tablewithpaginationbar_Internalname = "SUBFILE1TABLEWITHPAGINATIONBAR" ;
      edtavBarfassec_Internalname = "vBARFASSEC" ;
      edtavBarordlin_Internalname = "vBARORDLIN" ;
      edtavFasdsc_Internalname = "vFASDSC" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      edtavMaqdsc_Internalname = "vMAQDSC" ;
      edtavUnidades_Internalname = "vUNIDADES" ;
      edtavUnidadest_Internalname = "vUNIDADEST" ;
      edtavBarunimed_Internalname = "vBARUNIMED" ;
      edtavHorlni_5_Internalname = "vHORLNI_5" ;
      edtavHorfin_5_Internalname = "vHORFIN_5" ;
      edtavBartierea_Internalname = "vBARTIEREA" ;
      edtavTteo_Internalname = "vTTEO" ;
      edtavMaqcosmin_Internalname = "vMAQCOSMIN" ;
      edtavMaqcoskg_Internalname = "vMAQCOSKG" ;
      edtavMaqcosfijo_Internalname = "vMAQCOSFIJO" ;
      edtavCoste_m_Internalname = "vCOSTE_M" ;
      edtavCoste_tm_Internalname = "vCOSTE_TM" ;
      edtavTieteo_Internalname = "vTIETEO" ;
      edtavFascod_Internalname = "vFASCOD" ;
      edtavCoste_p_k_Internalname = "vCOSTE_P_K" ;
      edtavTeotixfi_Internalname = "vTEOTIXFI" ;
      edtavFomumcol_Internalname = "vFOMUMCOL" ;
      edtavBartipart_Internalname = "vBARTIPART" ;
      edtavGrdtipart_Internalname = "vGRDTIPART" ;
      Subfile2paginationbar_Internalname = "SUBFILE2PAGINATIONBAR" ;
      divSubfile2tablewithpaginationbar_Internalname = "SUBFILE2TABLEWITHPAGINATIONBAR" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicod1_Internalname = "vCLICOD1" ;
      edtavClicod2_Internalname = "vCLICOD2" ;
      edtavSubfile1currentpage_Internalname = "vSUBFILE1CURRENTPAGE" ;
      edtavSubfile2currentpage_Internalname = "vSUBFILE2CURRENTPAGE" ;
      Subfile1_empowerer_Internalname = "SUBFILE1_EMPOWERER" ;
      Subfile2_empowerer_Internalname = "SUBFILE2_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subSubfile1_Internalname = "SUBFILE1" ;
      subSubfile2_Internalname = "SUBFILE2" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      subSubfile2_Allowcollapsing = (byte)(0) ;
      subSubfile2_Allowselection = (byte)(0) ;
      subSubfile2_Header = "" ;
      subSubfile1_Allowcollapsing = (byte)(0) ;
      subSubfile1_Allowhovering = (byte)(-1) ;
      subSubfile1_Allowselection = (byte)(1) ;
      subSubfile1_Header = "" ;
      edtavGrdtipart_Jsonclick = "" ;
      edtavGrdtipart_Enabled = 0 ;
      edtavBartipart_Jsonclick = "" ;
      edtavBartipart_Enabled = 0 ;
      edtavFomumcol_Jsonclick = "" ;
      edtavFomumcol_Enabled = 0 ;
      edtavTeotixfi_Jsonclick = "" ;
      edtavTeotixfi_Enabled = 0 ;
      edtavCoste_p_k_Jsonclick = "" ;
      edtavCoste_p_k_Enabled = 0 ;
      edtavFascod_Jsonclick = "" ;
      edtavFascod_Enabled = 0 ;
      edtavTieteo_Jsonclick = "" ;
      edtavTieteo_Enabled = 0 ;
      edtavCoste_tm_Jsonclick = "" ;
      edtavCoste_tm_Enabled = 0 ;
      edtavCoste_m_Jsonclick = "" ;
      edtavCoste_m_Enabled = 0 ;
      edtavMaqcosfijo_Jsonclick = "" ;
      edtavMaqcosfijo_Enabled = 0 ;
      edtavMaqcoskg_Jsonclick = "" ;
      edtavMaqcoskg_Enabled = 0 ;
      edtavMaqcosmin_Jsonclick = "" ;
      edtavMaqcosmin_Enabled = 0 ;
      edtavTteo_Jsonclick = "" ;
      edtavTteo_Enabled = 0 ;
      edtavBartierea_Jsonclick = "" ;
      edtavBartierea_Enabled = 0 ;
      edtavHorfin_5_Jsonclick = "" ;
      edtavHorfin_5_Enabled = 0 ;
      edtavHorlni_5_Jsonclick = "" ;
      edtavHorlni_5_Enabled = 0 ;
      edtavBarunimed_Jsonclick = "" ;
      edtavBarunimed_Enabled = 0 ;
      edtavUnidadest_Jsonclick = "" ;
      edtavUnidadest_Enabled = 0 ;
      edtavUnidades_Jsonclick = "" ;
      edtavUnidades_Enabled = 0 ;
      edtavMaqdsc_Jsonclick = "" ;
      edtavMaqdsc_Enabled = 0 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 0 ;
      edtavFasdsc_Jsonclick = "" ;
      edtavFasdsc_Enabled = 0 ;
      edtavBarordlin_Jsonclick = "" ;
      edtavBarordlin_Enabled = 0 ;
      edtavBarfassec_Jsonclick = "" ;
      edtavBarfassec_Enabled = 0 ;
      subSubfile2_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subSubfile2_Backcolorstyle = (byte)(0) ;
      edtavKilosppieza_Jsonclick = "" ;
      edtavKilosppieza_Visible = -1 ;
      edtavKilosppieza_Enabled = 1 ;
      edtavCostepold_Jsonclick = "" ;
      edtavCostepold_Visible = -1 ;
      edtavCostepold_Enabled = 1 ;
      edtavBartipdis_Jsonclick = "" ;
      edtavBartipdis_Visible = -1 ;
      edtavBartipdis_Enabled = 1 ;
      edtavBarfecsal_Jsonclick = "" ;
      edtavBarfecsal_Visible = -1 ;
      edtavBarfecsal_Enabled = 1 ;
      edtavBarfecgen_Jsonclick = "" ;
      edtavBarfecgen_Visible = -1 ;
      edtavBarfecgen_Enabled = 1 ;
      edtavTxtalb_Jsonclick = "" ;
      edtavTxtalb_Visible = -1 ;
      edtavTxtalb_Enabled = 1 ;
      edtavMargen_Jsonclick = "" ;
      edtavMargen_Visible = -1 ;
      edtavMargen_Enabled = 1 ;
      edtavValor_Jsonclick = "" ;
      edtavValor_Visible = -1 ;
      edtavValor_Enabled = 1 ;
      edtavCostefab_Jsonclick = "" ;
      edtavCostefab_Visible = -1 ;
      edtavCostefab_Enabled = 1 ;
      edtavCoste_p_Jsonclick = "" ;
      edtavCoste_p_Visible = -1 ;
      edtavCoste_p_Enabled = 1 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Visible = -1 ;
      edtavBarmtr_Enabled = 1 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Visible = -1 ;
      edtavBarkgm_Enabled = 1 ;
      edtavPrograma_Jsonclick = "" ;
      edtavPrograma_Visible = -1 ;
      edtavPrograma_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Visible = -1 ;
      edtavBarcolnum_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Visible = -1 ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Visible = -1 ;
      edtavBarserdsc_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Visible = -1 ;
      edtavBarser_Enabled = 1 ;
      edtavBarenccli_Jsonclick = "" ;
      edtavBarenccli_Visible = -1 ;
      edtavBarenccli_Enabled = 1 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Visible = -1 ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Visible = -1 ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Visible = -1 ;
      edtavBarcod_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Visible = -1 ;
      edtavClinom_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Visible = -1 ;
      edtavClicod_Enabled = 1 ;
      edtavDetails_Jsonclick = "" ;
      edtavDetails_gximage = "" ;
      edtavDetails_Visible = -1 ;
      edtavDetails_Enabled = 1 ;
      subSubfile1_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subSubfile1_Backcolorstyle = (byte)(0) ;
      edtavSubfile2currentpage_Jsonclick = "" ;
      edtavSubfile2currentpage_Visible = 1 ;
      edtavSubfile1currentpage_Jsonclick = "" ;
      edtavSubfile1currentpage_Visible = 1 ;
      edtavClicod2_Jsonclick = "" ;
      edtavClicod2_Visible = 1 ;
      edtavClicod1_Jsonclick = "" ;
      edtavClicod1_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavBarmancod1_Jsonclick = "" ;
      edtavBarmancod1_Enabled = 1 ;
      edtavBardisnum_Jsonclick = "" ;
      edtavBardisnum_Enabled = 1 ;
      edtavSimulador_Jsonclick = "" ;
      edtavSimulador_Enabled = 1 ;
      edtavBarcodpar1_Jsonclick = "" ;
      edtavBarcodpar1_Enabled = 1 ;
      edtavBarcodreo1_Jsonclick = "" ;
      edtavBarcodreo1_Enabled = 1 ;
      edtavBarcod1_Jsonclick = "" ;
      edtavBarcod1_Enabled = 1 ;
      edtavArtcod_Jsonclick = "" ;
      edtavArtcod_Enabled = 1 ;
      edtavFec4_Jsonclick = "" ;
      edtavFec4_Enabled = 1 ;
      edtavFec3_Jsonclick = "" ;
      edtavFec3_Enabled = 1 ;
      Dvpanel_panel_resultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Iconposition = "Right" ;
      Dvpanel_panel_resultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Title = httpContext.getMessage( "<i class=\"fas fa-poll-h\"></i>  Resultados", "") ;
      Dvpanel_panel_resultado_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_resultado_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Width = "100%" ;
      Subfile2paginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Subfile2paginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Subfile2paginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Subfile2paginationbar_Next = "WWP_PagingNextCaption" ;
      Subfile2paginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Subfile2paginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Subfile2paginationbar_Rowsperpageselectedvalue = 10 ;
      Subfile2paginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Subfile2paginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Subfile2paginationbar_Pagingcaptionposition = "Left" ;
      Subfile2paginationbar_Pagingbuttonsposition = "Right" ;
      Subfile2paginationbar_Pagestoshow = 5 ;
      Subfile2paginationbar_Showlast = GXutil.toBoolean( 0) ;
      Subfile2paginationbar_Shownext = GXutil.toBoolean( -1) ;
      Subfile2paginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Subfile2paginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Subfile2paginationbar_Class = "PaginationBar" ;
      Subfile1paginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Subfile1paginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Subfile1paginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Subfile1paginationbar_Next = "WWP_PagingNextCaption" ;
      Subfile1paginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Subfile1paginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Subfile1paginationbar_Rowsperpageselectedvalue = 10 ;
      Subfile1paginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Subfile1paginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Subfile1paginationbar_Pagingcaptionposition = "Left" ;
      Subfile1paginationbar_Pagingbuttonsposition = "Right" ;
      Subfile1paginationbar_Pagestoshow = 5 ;
      Subfile1paginationbar_Showlast = GXutil.toBoolean( 0) ;
      Subfile1paginationbar_Shownext = GXutil.toBoolean( -1) ;
      Subfile1paginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Subfile1paginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Subfile1paginationbar_Class = "PaginationBar" ;
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Title = httpContext.getMessage( "<i class=\"fas fa-filter\"></i> Filtros", "") ;
      Dvpanel_panel_filtros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Width = "100%" ;
      Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Iconposition = "Right" ;
      Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_panel_filtrosgenerales_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Width = "100%" ;
      Combo_clicod2_Emptyitemtext = "Todos" ;
      Combo_clicod2_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod1_Emptyitemtext = "Todos" ;
      Combo_clicod1_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Analise Custo", "") );
      edtavValor_Title = httpContext.getMessage( "Valor", "") ;
      subSubfile2_Rows = 0 ;
      subSubfile1_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'SUBFILE1_nFirstRecordOnPage'},{av:'SUBFILE1_nEOF'},{av:'edtavValor_Title',ctrl:'vVALOR',prop:'Title'},{av:'AV47Clicod2',fld:'vCLICOD2',pic:'ZZZZZ9'},{av:'AV10Barcod1',fld:'vBARCOD1',pic:'ZZZZZZZ9'},{av:'AV109Fec3',fld:'vFEC3',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'AV46Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV110Fec4',fld:'vFEC4',pic:''},{av:'AV7Artcod',fld:'vARTCOD',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A3311BarManCod1',fld:'BARMANCOD1',pic:'ZZZ9'},{av:'AV29BarMancod1',fld:'vBARMANCOD1',pic:'ZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'AV21Bardisnum',fld:'vBARDISNUM',pic:''},{av:'AV14Barcodreo1',fld:'vBARCODREO1',pic:'9'},{av:'AV12Barcodpar1',fld:'vBARCODPAR1',pic:''},{av:'A2010BarTipDis',fld:'BARTIPDIS',pic:'@!'},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A141BarCosPro',fld:'BARCOSPRO',pic:'ZZZZZZ9.99'},{av:'A140BarCosAny',fld:'BARCOSANY',pic:'ZZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'AV78CosteFab',fld:'vCOSTEFAB',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV199Simulador',fld:'vSIMULADOR',pic:'9'},{av:'AV235Valor',fld:'vVALOR',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A3275BarKgsAut',fld:'BARKGSAUT',pic:'ZZZZZ9.99'},{av:'A3276BarMtsAut',fld:'BARMTSAUT',pic:'ZZZZZ9.99'},{av:'A32AlbProEsp',fld:'ALBPROESP',pic:'99'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1262BarPreKgm',fld:'BARPREKGM',pic:'ZZZZZZ9.999'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1264BarPreMtr',fld:'BARPREMTR',pic:'ZZZZZZ9.999'},{av:'A1275FasKgm',fld:'FASKGM',pic:'ZZZZZ9.99'},{av:'A1241GuiFasPKg',fld:'GUIFASPKG',pic:'ZZZZZZ9.999'},{av:'A1276FasMtr',fld:'FASMTR',pic:'ZZZZZ9.99'},{av:'A1242GuiFasPMt',fld:'GUIFASPMT',pic:'ZZZZZZ9.999'},{av:'A1294FacBarCod',fld:'FACBARCOD',pic:'ZZZZZZZ9'},{av:'A1295FacBarReo',fld:'FACBARREO',pic:'9'},{av:'A1296FacBarPar',fld:'FACBARPAR',pic:''},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'SUBFILE2_nFirstRecordOnPage'},{av:'SUBFILE2_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV13BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A3837BarFasKgm',fld:'BARFASKGM',pic:'ZZZZZ9.99'},{av:'A5719BarFasKgT',fld:'BARFASKGT',pic:'ZZZZZ9.99'},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A5168FasPreMC',fld:'FASPREMC',pic:'ZZZ9'},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'AV167MaqCosMin',fld:'vMAQCOSMIN',pic:'ZZZZ9.9999',hsh:true},{av:'AV166MaqCosKg',fld:'vMAQCOSKG',pic:'ZZZZ9.9999',hsh:true},{av:'AV165MaqCosFijo',fld:'vMAQCOSFIJO',pic:'ZZZZ9.9999',hsh:true},{av:'A5720BarFasMtT',fld:'BARFASMTT',pic:'ZZZZZ9.99'},{av:'A3838BarFasMtr',fld:'BARFASMTR',pic:'ZZZZZ9.99'},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99'},{av:'AV225tteo',fld:'vTTEO',pic:'Z9.99',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'AV122Grdtipart',fld:'vGRDTIPART',pic:'ZZZ9',hsh:true},{av:'AV209teotixfi',fld:'vTEOTIXFI',pic:'ZZZ9',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A165BarHorIni',fld:'BARHORINI',pic:'ZZZ9'},{av:'A164BarHorFin',fld:'BARHORFIN',pic:'ZZZ9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV163MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'A605MaqCosMin',fld:'MAQCOSMIN',pic:'ZZZZ9.9999'},{av:'A13180MaqCosKg',fld:'MAQCOSKG',pic:'ZZZZ9.9999'},{av:'A13179MaqCosFijo',fld:'MAQCOSFIJO',pic:'ZZZZ9.9999'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A1011TipMaqCod',fld:'TIPMAQCOD',pic:''},{av:'AV32BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A556HisProEst',fld:'HISPROEST',pic:'9'},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'A4364GrdTipArt',fld:'GRDTIPART',pic:'ZZZ9'},{av:'A829TipArtCod',fld:'TIPARTCOD',pic:'ZZZ9'},{av:'AV39BarTipArt',fld:'vBARTIPART',pic:'ZZZ9',hsh:true},{av:'subSubfile1_Rows',ctrl:'SUBFILE1',prop:'Rows'},{av:'subSubfile2_Rows',ctrl:'SUBFILE2',prop:'Rows'},{av:'AV97EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV107fec1',fld:'vFEC1',pic:'',hsh:true},{av:'AV108Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV224Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'AV117FlagColor',fld:'vFLAGCOLOR',pic:'9',hsh:true},{av:'AV120ForRelban',fld:'vFORRELBAN',pic:'ZZZ9.99',hsh:true},{av:'AV201Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV84CosteSimula',fld:'vCOSTESIMULA',pic:'ZZZZ9.99999',hsh:true},{av:'AV180Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'AV198Sicsv',fld:'vSICSV',pic:'9',hsh:true},{av:'AV43carpeta',fld:'vCARPETA',pic:'',hsh:true},{av:'AV90CosTiR',fld:'vCOSTIR',pic:'9',hsh:true},{av:'AV211Tiempo_m',fld:'vTIEMPO_M',pic:'ZZZZZ9',hsh:true},{av:'AV214TipmaqCod',fld:'vTIPMAQCOD',pic:'',hsh:true},{av:'AV112fecteo',fld:'vFECTEO',pic:'',hsh:true},{av:'AV125hnd',fld:'vHND',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV119Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV18BarCosPro',fld:'vBARCOSPRO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17BarCosAny',fld:'vBARCOSANY',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV244subfile1PageCount',fld:'vSUBFILE1PAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV252subfile2PageCount',fld:'vSUBFILE2PAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("SUBFILE1.LOAD","{handler:'e232CY2',iparms:[{av:'AV47Clicod2',fld:'vCLICOD2',pic:'ZZZZZ9'},{av:'AV10Barcod1',fld:'vBARCOD1',pic:'ZZZZZZZ9'},{av:'AV109Fec3',fld:'vFEC3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'AV97EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV46Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV110Fec4',fld:'vFEC4',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'AV7Artcod',fld:'vARTCOD',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'AV107fec1',fld:'vFEC1',pic:'',hsh:true},{av:'AV108Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A3311BarManCod1',fld:'BARMANCOD1',pic:'ZZZ9'},{av:'AV29BarMancod1',fld:'vBARMANCOD1',pic:'ZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'AV21Bardisnum',fld:'vBARDISNUM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV14Barcodreo1',fld:'vBARCODREO1',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV12Barcodpar1',fld:'vBARCODPAR1',pic:''},{av:'A2010BarTipDis',fld:'BARTIPDIS',pic:'@!'},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A141BarCosPro',fld:'BARCOSPRO',pic:'ZZZZZZ9.99'},{av:'A140BarCosAny',fld:'BARCOSANY',pic:'ZZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'AV78CosteFab',fld:'vCOSTEFAB',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV224Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'AV117FlagColor',fld:'vFLAGCOLOR',pic:'9',hsh:true},{av:'AV199Simulador',fld:'vSIMULADOR',pic:'9'},{av:'AV120ForRelban',fld:'vFORRELBAN',pic:'ZZZ9.99',hsh:true},{av:'AV201Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV84CosteSimula',fld:'vCOSTESIMULA',pic:'ZZZZ9.99999',hsh:true},{av:'AV235Valor',fld:'vVALOR',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV13BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A3275BarKgsAut',fld:'BARKGSAUT',pic:'ZZZZZ9.99'},{av:'A3276BarMtsAut',fld:'BARMTSAUT',pic:'ZZZZZ9.99'},{av:'A32AlbProEsp',fld:'ALBPROESP',pic:'99'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1262BarPreKgm',fld:'BARPREKGM',pic:'ZZZZZZ9.999'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1264BarPreMtr',fld:'BARPREMTR',pic:'ZZZZZZ9.999'},{av:'A1275FasKgm',fld:'FASKGM',pic:'ZZZZZ9.99'},{av:'A1241GuiFasPKg',fld:'GUIFASPKG',pic:'ZZZZZZ9.999'},{av:'A1276FasMtr',fld:'FASMTR',pic:'ZZZZZ9.99'},{av:'A1242GuiFasPMt',fld:'GUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV180Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'A1294FacBarCod',fld:'FACBARCOD',pic:'ZZZZZZZ9'},{av:'A1295FacBarReo',fld:'FACBARREO',pic:'9'},{av:'A1296FacBarPar',fld:'FACBARPAR',pic:''},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("SUBFILE1.LOAD",",oparms:[{av:'AV48Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV254Details',fld:'vDETAILS',pic:''},{av:'AV109Fec3',fld:'vFEC3',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV13BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV41BarTipDis',fld:'vBARTIPDIS',pic:'@!'},{av:'AV36BarSer',fld:'vBARSER',pic:''},{av:'AV37BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV15BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV16BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV18BarCosPro',fld:'vBARCOSPRO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17BarCosAny',fld:'vBARCOSANY',pic:'ZZZZZZ9.99',hsh:true},{av:'AV45CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV49CliNom',fld:'vCLINOM',pic:''},{av:'AV28BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV31BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV27BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV26BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV22BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV196Programa',fld:'vPROGRAMA',pic:'ZZZ9'},{av:'AV224Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV78CosteFab',fld:'vCOSTEFAB',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV68Coste_p',fld:'vCOSTE_P',pic:'ZZZZZZ9.99'},{av:'AV82CostepOld',fld:'vCOSTEPOLD',pic:'ZZZZZZ9.99'},{av:'AV117FlagColor',fld:'vFLAGCOLOR',pic:'9',hsh:true},{av:'AV97EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV120ForRelban',fld:'vFORRELBAN',pic:'ZZZ9.99',hsh:true},{av:'AV84CosteSimula',fld:'vCOSTESIMULA',pic:'ZZZZ9.99999',hsh:true},{av:'AV201Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV173Margen',fld:'vMARGEN',pic:'ZZZZZZZZ9.99'},{av:'AV62Coste_m',fld:'vCOSTE_M',pic:'ZZZZZZ9.99'},{av:'AV69Coste_p_k',fld:'vCOSTE_P_K',pic:'ZZZ9.99'},{av:'AV73Coste_tm',fld:'vCOSTE_TM',pic:'ZZZZZZZZ9.99'},{av:'AV90CosTiR',fld:'vCOSTIR',pic:'9',hsh:true},{av:'AV235Valor',fld:'vVALOR',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV167MaqCosMin',fld:'vMAQCOSMIN',pic:'ZZZZ9.9999',hsh:true},{av:'AV165MaqCosFijo',fld:'vMAQCOSFIJO',pic:'ZZZZ9.9999',hsh:true},{av:'AV166MaqCosKg',fld:'vMAQCOSKG',pic:'ZZZZ9.9999',hsh:true},{av:'AV227TxtAlb',fld:'vTXTALB',pic:''},{av:'AV136KilospPieza',fld:'vKILOSPPIEZA',pic:'ZZZZZ9.99'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("SUBFILE2.LOAD","{handler:'e242CY4',iparms:[{av:'AV198Sicsv',fld:'vSICSV',pic:'9',hsh:true},{av:'AV43carpeta',fld:'vCARPETA',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV97EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV13BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A3837BarFasKgm',fld:'BARFASKGM',pic:'ZZZZZ9.99'},{av:'A5719BarFasKgT',fld:'BARFASKGT',pic:'ZZZZZ9.99'},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A5168FasPreMC',fld:'FASPREMC',pic:'ZZZ9'},{av:'AV90CosTiR',fld:'vCOSTIR',pic:'9',hsh:true},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'AV211Tiempo_m',fld:'vTIEMPO_M',pic:'ZZZZZ9',hsh:true},{av:'AV167MaqCosMin',fld:'vMAQCOSMIN',pic:'ZZZZ9.9999',hsh:true},{av:'AV166MaqCosKg',fld:'vMAQCOSKG',pic:'ZZZZ9.9999',hsh:true},{av:'AV165MaqCosFijo',fld:'vMAQCOSFIJO',pic:'ZZZZ9.9999',hsh:true},{av:'AV214TipmaqCod',fld:'vTIPMAQCOD',pic:'',hsh:true},{av:'A5720BarFasMtT',fld:'BARFASMTT',pic:'ZZZZZ9.99'},{av:'A3838BarFasMtr',fld:'BARFASMTR',pic:'ZZZZZ9.99'},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99'},{av:'AV112fecteo',fld:'vFECTEO',pic:'',hsh:true},{av:'AV225tteo',fld:'vTTEO',pic:'Z9.99',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'AV125hnd',fld:'vHND',pic:'ZZZZZZZZZ9',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'AV119Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'AV122Grdtipart',fld:'vGRDTIPART',pic:'ZZZ9',hsh:true},{av:'AV209teotixfi',fld:'vTEOTIXFI',pic:'ZZZ9',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'AV180Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'A165BarHorIni',fld:'BARHORINI',pic:'ZZZ9'},{av:'A164BarHorFin',fld:'BARHORFIN',pic:'ZZZ9'},{av:'AV18BarCosPro',fld:'vBARCOSPRO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17BarCosAny',fld:'vBARCOSANY',pic:'ZZZZZZ9.99',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV163MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'A605MaqCosMin',fld:'MAQCOSMIN',pic:'ZZZZ9.9999'},{av:'A13180MaqCosKg',fld:'MAQCOSKG',pic:'ZZZZ9.9999'},{av:'A13179MaqCosFijo',fld:'MAQCOSFIJO',pic:'ZZZZ9.9999'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A1011TipMaqCod',fld:'TIPMAQCOD',pic:''},{av:'AV32BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A556HisProEst',fld:'HISPROEST',pic:'9'},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'A4364GrdTipArt',fld:'GRDTIPART',pic:'ZZZ9'},{av:'A829TipArtCod',fld:'TIPARTCOD',pic:'ZZZ9'},{av:'AV39BarTipArt',fld:'vBARTIPART',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("SUBFILE2.LOAD",",oparms:[{av:'AV125hnd',fld:'vHND',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV104FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV163MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV32BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV105FasDsc',fld:'vFASDSC',pic:''},{av:'AV42BarUniMed',fld:'vBARUNIMED',pic:'@!'},{av:'AV25BarFasSec',fld:'vBARFASSEC',pic:''},{av:'AV62Coste_m',fld:'vCOSTE_M',pic:'ZZZZZZ9.99'},{av:'AV211Tiempo_m',fld:'vTIEMPO_M',pic:'ZZZZZ9',hsh:true},{av:'AV38BarTieRea',fld:'vBARTIEREA',pic:'Z9.99'},{av:'AV231Unidades',fld:'vUNIDADES',pic:'ZZZZZ9.99'},{av:'AV232Unidadest',fld:'vUNIDADEST',pic:'ZZZZZ9.99'},{av:'AV212TieTeo',fld:'vTIETEO',pic:'ZZ9.99'},{av:'AV198Sicsv',fld:'vSICSV',pic:'9',hsh:true},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV225tteo',fld:'vTTEO',pic:'Z9.99',hsh:true},{av:'AV112fecteo',fld:'vFECTEO',pic:'',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV119Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV39BarTipArt',fld:'vBARTIPART',pic:'ZZZ9',hsh:true},{av:'AV209teotixfi',fld:'vTEOTIXFI',pic:'ZZZ9',hsh:true},{av:'AV122Grdtipart',fld:'vGRDTIPART',pic:'ZZZ9',hsh:true},{av:'AV73Coste_tm',fld:'vCOSTE_TM',pic:'ZZZZZZZZ9.99'},{av:'AV127HorFin_5',fld:'vHORFIN_5',pic:''},{av:'AV69Coste_p_k',fld:'vCOSTE_P_K',pic:'ZZZ9.99'},{av:'AV167MaqCosMin',fld:'vMAQCOSMIN',pic:'ZZZZ9.9999',hsh:true},{av:'AV168MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV214TipmaqCod',fld:'vTIPMAQCOD',pic:'',hsh:true},{av:'AV166MaqCosKg',fld:'vMAQCOSKG',pic:'ZZZZ9.9999',hsh:true},{av:'AV165MaqCosFijo',fld:'vMAQCOSFIJO',pic:'ZZZZ9.9999',hsh:true}]}");
      setEventMetadata("SUBFILE1PAGINATIONBAR.CHANGEPAGE","{handler:'e172CY2',iparms:[{av:'SUBFILE1_nFirstRecordOnPage'},{av:'SUBFILE1_nEOF'},{av:'subSubfile1_Rows',ctrl:'SUBFILE1',prop:'Rows'},{av:'subSubfile2_Rows',ctrl:'SUBFILE2',prop:'Rows'},{av:'edtavValor_Title',ctrl:'vVALOR',prop:'Title'},{av:'AV47Clicod2',fld:'vCLICOD2',pic:'ZZZZZ9'},{av:'AV10Barcod1',fld:'vBARCOD1',pic:'ZZZZZZZ9'},{av:'AV109Fec3',fld:'vFEC3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'AV97EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV46Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV110Fec4',fld:'vFEC4',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'AV7Artcod',fld:'vARTCOD',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'AV107fec1',fld:'vFEC1',pic:'',hsh:true},{av:'AV108Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A3311BarManCod1',fld:'BARMANCOD1',pic:'ZZZ9'},{av:'AV29BarMancod1',fld:'vBARMANCOD1',pic:'ZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'AV21Bardisnum',fld:'vBARDISNUM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV14Barcodreo1',fld:'vBARCODREO1',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV12Barcodpar1',fld:'vBARCODPAR1',pic:''},{av:'A2010BarTipDis',fld:'BARTIPDIS',pic:'@!'},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A141BarCosPro',fld:'BARCOSPRO',pic:'ZZZZZZ9.99'},{av:'A140BarCosAny',fld:'BARCOSANY',pic:'ZZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'AV78CosteFab',fld:'vCOSTEFAB',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV224Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'AV117FlagColor',fld:'vFLAGCOLOR',pic:'9',hsh:true},{av:'AV199Simulador',fld:'vSIMULADOR',pic:'9'},{av:'AV120ForRelban',fld:'vFORRELBAN',pic:'ZZZ9.99',hsh:true},{av:'AV201Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV84CosteSimula',fld:'vCOSTESIMULA',pic:'ZZZZ9.99999',hsh:true},{av:'AV235Valor',fld:'vVALOR',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV13BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A3275BarKgsAut',fld:'BARKGSAUT',pic:'ZZZZZ9.99'},{av:'A3276BarMtsAut',fld:'BARMTSAUT',pic:'ZZZZZ9.99'},{av:'A32AlbProEsp',fld:'ALBPROESP',pic:'99'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1262BarPreKgm',fld:'BARPREKGM',pic:'ZZZZZZ9.999'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1264BarPreMtr',fld:'BARPREMTR',pic:'ZZZZZZ9.999'},{av:'A1275FasKgm',fld:'FASKGM',pic:'ZZZZZ9.99'},{av:'A1241GuiFasPKg',fld:'GUIFASPKG',pic:'ZZZZZZ9.999'},{av:'A1276FasMtr',fld:'FASMTR',pic:'ZZZZZ9.99'},{av:'A1242GuiFasPMt',fld:'GUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV180Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'A1294FacBarCod',fld:'FACBARCOD',pic:'ZZZZZZZ9'},{av:'A1295FacBarReo',fld:'FACBARREO',pic:'9'},{av:'A1296FacBarPar',fld:'FACBARPAR',pic:''},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV198Sicsv',fld:'vSICSV',pic:'9',hsh:true},{av:'AV43carpeta',fld:'vCARPETA',pic:'',hsh:true},{av:'AV90CosTiR',fld:'vCOSTIR',pic:'9',hsh:true},{av:'AV211Tiempo_m',fld:'vTIEMPO_M',pic:'ZZZZZ9',hsh:true},{av:'AV214TipmaqCod',fld:'vTIPMAQCOD',pic:'',hsh:true},{av:'AV112fecteo',fld:'vFECTEO',pic:'',hsh:true},{av:'AV125hnd',fld:'vHND',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV119Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV18BarCosPro',fld:'vBARCOSPRO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17BarCosAny',fld:'vBARCOSANY',pic:'ZZZZZZ9.99',hsh:true},{av:'Subfile1paginationbar_Selectedpage',ctrl:'SUBFILE1PAGINATIONBAR',prop:'SelectedPage'},{av:'AV243subfile1CurrentPage',fld:'vSUBFILE1CURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'SUBFILE2_nFirstRecordOnPage'},{av:'SUBFILE2_nEOF'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A3837BarFasKgm',fld:'BARFASKGM',pic:'ZZZZZ9.99'},{av:'A5719BarFasKgT',fld:'BARFASKGT',pic:'ZZZZZ9.99'},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A5168FasPreMC',fld:'FASPREMC',pic:'ZZZ9'},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'AV167MaqCosMin',fld:'vMAQCOSMIN',pic:'ZZZZ9.9999',hsh:true},{av:'AV166MaqCosKg',fld:'vMAQCOSKG',pic:'ZZZZ9.9999',hsh:true},{av:'AV165MaqCosFijo',fld:'vMAQCOSFIJO',pic:'ZZZZ9.9999',hsh:true},{av:'A5720BarFasMtT',fld:'BARFASMTT',pic:'ZZZZZ9.99'},{av:'A3838BarFasMtr',fld:'BARFASMTR',pic:'ZZZZZ9.99'},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99'},{av:'AV225tteo',fld:'vTTEO',pic:'Z9.99',hsh:true},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'AV122Grdtipart',fld:'vGRDTIPART',pic:'ZZZ9',hsh:true},{av:'AV209teotixfi',fld:'vTEOTIXFI',pic:'ZZZ9',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A165BarHorIni',fld:'BARHORINI',pic:'ZZZ9'},{av:'A164BarHorFin',fld:'BARHORFIN',pic:'ZZZ9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV163MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'A605MaqCosMin',fld:'MAQCOSMIN',pic:'ZZZZ9.9999'},{av:'A13180MaqCosKg',fld:'MAQCOSKG',pic:'ZZZZ9.9999'},{av:'A13179MaqCosFijo',fld:'MAQCOSFIJO',pic:'ZZZZ9.9999'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A1011TipMaqCod',fld:'TIPMAQCOD',pic:''},{av:'AV32BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A556HisProEst',fld:'HISPROEST',pic:'9'},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'A4364GrdTipArt',fld:'GRDTIPART',pic:'ZZZ9'},{av:'A829TipArtCod',fld:'TIPARTCOD',pic:'ZZZ9'},{av:'AV39BarTipArt',fld:'vBARTIPART',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("SUBFILE1PAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV243subfile1CurrentPage',fld:'vSUBFILE1CURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV244subfile1PageCount',fld:'vSUBFILE1PAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV252subfile2PageCount',fld:'vSUBFILE2PAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("SUBFILE1PAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e182CY2',iparms:[{av:'SUBFILE1_nFirstRecordOnPage'},{av:'SUBFILE1_nEOF'},{av:'subSubfile1_Rows',ctrl:'SUBFILE1',prop:'Rows'},{av:'subSubfile2_Rows',ctrl:'SUBFILE2',prop:'Rows'},{av:'edtavValor_Title',ctrl:'vVALOR',prop:'Title'},{av:'AV47Clicod2',fld:'vCLICOD2',pic:'ZZZZZ9'},{av:'AV10Barcod1',fld:'vBARCOD1',pic:'ZZZZZZZ9'},{av:'AV109Fec3',fld:'vFEC3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'AV97EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV46Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV110Fec4',fld:'vFEC4',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'AV7Artcod',fld:'vARTCOD',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'AV107fec1',fld:'vFEC1',pic:'',hsh:true},{av:'AV108Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A3311BarManCod1',fld:'BARMANCOD1',pic:'ZZZ9'},{av:'AV29BarMancod1',fld:'vBARMANCOD1',pic:'ZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'AV21Bardisnum',fld:'vBARDISNUM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV14Barcodreo1',fld:'vBARCODREO1',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV12Barcodpar1',fld:'vBARCODPAR1',pic:''},{av:'A2010BarTipDis',fld:'BARTIPDIS',pic:'@!'},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A141BarCosPro',fld:'BARCOSPRO',pic:'ZZZZZZ9.99'},{av:'A140BarCosAny',fld:'BARCOSANY',pic:'ZZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'AV78CosteFab',fld:'vCOSTEFAB',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV224Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'AV117FlagColor',fld:'vFLAGCOLOR',pic:'9',hsh:true},{av:'AV199Simulador',fld:'vSIMULADOR',pic:'9'},{av:'AV120ForRelban',fld:'vFORRELBAN',pic:'ZZZ9.99',hsh:true},{av:'AV201Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV84CosteSimula',fld:'vCOSTESIMULA',pic:'ZZZZ9.99999',hsh:true},{av:'AV235Valor',fld:'vVALOR',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV13BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A3275BarKgsAut',fld:'BARKGSAUT',pic:'ZZZZZ9.99'},{av:'A3276BarMtsAut',fld:'BARMTSAUT',pic:'ZZZZZ9.99'},{av:'A32AlbProEsp',fld:'ALBPROESP',pic:'99'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1262BarPreKgm',fld:'BARPREKGM',pic:'ZZZZZZ9.999'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1264BarPreMtr',fld:'BARPREMTR',pic:'ZZZZZZ9.999'},{av:'A1275FasKgm',fld:'FASKGM',pic:'ZZZZZ9.99'},{av:'A1241GuiFasPKg',fld:'GUIFASPKG',pic:'ZZZZZZ9.999'},{av:'A1276FasMtr',fld:'FASMTR',pic:'ZZZZZ9.99'},{av:'A1242GuiFasPMt',fld:'GUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV180Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'A1294FacBarCod',fld:'FACBARCOD',pic:'ZZZZZZZ9'},{av:'A1295FacBarReo',fld:'FACBARREO',pic:'9'},{av:'A1296FacBarPar',fld:'FACBARPAR',pic:''},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV198Sicsv',fld:'vSICSV',pic:'9',hsh:true},{av:'AV43carpeta',fld:'vCARPETA',pic:'',hsh:true},{av:'AV90CosTiR',fld:'vCOSTIR',pic:'9',hsh:true},{av:'AV211Tiempo_m',fld:'vTIEMPO_M',pic:'ZZZZZ9',hsh:true},{av:'AV214TipmaqCod',fld:'vTIPMAQCOD',pic:'',hsh:true},{av:'AV112fecteo',fld:'vFECTEO',pic:'',hsh:true},{av:'AV125hnd',fld:'vHND',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV119Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV18BarCosPro',fld:'vBARCOSPRO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17BarCosAny',fld:'vBARCOSANY',pic:'ZZZZZZ9.99',hsh:true},{av:'Subfile1paginationbar_Rowsperpageselectedvalue',ctrl:'SUBFILE1PAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("SUBFILE1PAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subSubfile1_Rows',ctrl:'SUBFILE1',prop:'Rows'},{av:'AV243subfile1CurrentPage',fld:'vSUBFILE1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("SUBFILE2PAGINATIONBAR.CHANGEPAGE","{handler:'e192CY2',iparms:[{av:'SUBFILE1_nFirstRecordOnPage'},{av:'SUBFILE1_nEOF'},{av:'subSubfile1_Rows',ctrl:'SUBFILE1',prop:'Rows'},{av:'subSubfile2_Rows',ctrl:'SUBFILE2',prop:'Rows'},{av:'edtavValor_Title',ctrl:'vVALOR',prop:'Title'},{av:'AV47Clicod2',fld:'vCLICOD2',pic:'ZZZZZ9'},{av:'AV10Barcod1',fld:'vBARCOD1',pic:'ZZZZZZZ9'},{av:'AV109Fec3',fld:'vFEC3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'AV97EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV46Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV110Fec4',fld:'vFEC4',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'AV7Artcod',fld:'vARTCOD',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'AV107fec1',fld:'vFEC1',pic:'',hsh:true},{av:'AV108Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A3311BarManCod1',fld:'BARMANCOD1',pic:'ZZZ9'},{av:'AV29BarMancod1',fld:'vBARMANCOD1',pic:'ZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'AV21Bardisnum',fld:'vBARDISNUM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV14Barcodreo1',fld:'vBARCODREO1',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV12Barcodpar1',fld:'vBARCODPAR1',pic:''},{av:'A2010BarTipDis',fld:'BARTIPDIS',pic:'@!'},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A141BarCosPro',fld:'BARCOSPRO',pic:'ZZZZZZ9.99'},{av:'A140BarCosAny',fld:'BARCOSANY',pic:'ZZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'AV78CosteFab',fld:'vCOSTEFAB',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV224Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'AV117FlagColor',fld:'vFLAGCOLOR',pic:'9',hsh:true},{av:'AV199Simulador',fld:'vSIMULADOR',pic:'9'},{av:'AV120ForRelban',fld:'vFORRELBAN',pic:'ZZZ9.99',hsh:true},{av:'AV201Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV84CosteSimula',fld:'vCOSTESIMULA',pic:'ZZZZ9.99999',hsh:true},{av:'AV235Valor',fld:'vVALOR',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV13BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A3275BarKgsAut',fld:'BARKGSAUT',pic:'ZZZZZ9.99'},{av:'A3276BarMtsAut',fld:'BARMTSAUT',pic:'ZZZZZ9.99'},{av:'A32AlbProEsp',fld:'ALBPROESP',pic:'99'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1262BarPreKgm',fld:'BARPREKGM',pic:'ZZZZZZ9.999'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1264BarPreMtr',fld:'BARPREMTR',pic:'ZZZZZZ9.999'},{av:'A1275FasKgm',fld:'FASKGM',pic:'ZZZZZ9.99'},{av:'A1241GuiFasPKg',fld:'GUIFASPKG',pic:'ZZZZZZ9.999'},{av:'A1276FasMtr',fld:'FASMTR',pic:'ZZZZZ9.99'},{av:'A1242GuiFasPMt',fld:'GUIFASPMT',pic:'ZZZZZZ9.999'},{av:'AV180Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'A1294FacBarCod',fld:'FACBARCOD',pic:'ZZZZZZZ9'},{av:'A1295FacBarReo',fld:'FACBARREO',pic:'9'},{av:'A1296FacBarPar',fld:'FACBARPAR',pic:''},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV198Sicsv',fld:'vSICSV',pic:'9',hsh:true},{av:'AV43carpeta',fld:'vCARPETA',pic:'',hsh:true},{av:'AV90CosTiR',fld:'vCOSTIR',pic:'9',hsh:true},{av:'AV211Tiempo_m',fld:'vTIEMPO_M',pic:'ZZZZZ9',hsh:true},{av:'AV214TipmaqCod',fld:'vTIPMAQCOD',pic:'',hsh:true},{av:'AV112fecteo',fld:'vFECTEO',pic:'',hsh:true},{av:'AV125hnd',fld:'vHND',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV119Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV18BarCosPro',fld:'vBARCOSPRO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17BarCosAny',fld:'vBARCOSANY',pic:'ZZZZZZ9.99',hsh:true},{av:'SUBFILE2_nFirstRecordOnPage'},{av:'SUBFILE2_nEOF'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A3837BarFasKgm',fld:'BARFASKGM',pic:'ZZZZZ9.99'},{av:'A5719BarFasKgT',fld:'BARFASKGT',pic:'ZZZZZ9.99'},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A5168FasPreMC',fld:'FASPREMC',pic:'ZZZ9'},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'AV167MaqCosMin',fld:'vMAQCOSMIN',pic:'ZZZZ9.9999',hsh:true},{av:'AV166MaqCosKg',fld:'vMAQCOSKG',pic:'ZZZZ9.9999',hsh:true},{av:'AV165MaqCosFijo',fld:'vMAQCOSFIJO',pic:'ZZZZ9.9999',hsh:true},{av:'A5720BarFasMtT',fld:'BARFASMTT',pic:'ZZZZZ9.99'},{av:'A3838BarFasMtr',fld:'BARFASMTR',pic:'ZZZZZ9.99'},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99'},{av:'AV225tteo',fld:'vTTEO',pic:'Z9.99',hsh:true},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'AV122Grdtipart',fld:'vGRDTIPART',pic:'ZZZ9',hsh:true},{av:'AV209teotixfi',fld:'vTEOTIXFI',pic:'ZZZ9',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A165BarHorIni',fld:'BARHORINI',pic:'ZZZ9'},{av:'A164BarHorFin',fld:'BARHORFIN',pic:'ZZZ9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV163MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'A605MaqCosMin',fld:'MAQCOSMIN',pic:'ZZZZ9.9999'},{av:'A13180MaqCosKg',fld:'MAQCOSKG',pic:'ZZZZ9.9999'},{av:'A13179MaqCosFijo',fld:'MAQCOSFIJO',pic:'ZZZZ9.9999'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A1011TipMaqCod',fld:'TIPMAQCOD',pic:''},{av:'AV32BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A556HisProEst',fld:'HISPROEST',pic:'9'},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'A4364GrdTipArt',fld:'GRDTIPART',pic:'ZZZ9'},{av:'A829TipArtCod',fld:'TIPARTCOD',pic:'ZZZ9'},{av:'AV39BarTipArt',fld:'vBARTIPART',pic:'ZZZ9',hsh:true},{av:'Subfile2paginationbar_Selectedpage',ctrl:'SUBFILE2PAGINATIONBAR',prop:'SelectedPage'},{av:'AV251subfile2CurrentPage',fld:'vSUBFILE2CURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("SUBFILE2PAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV251subfile2CurrentPage',fld:'vSUBFILE2CURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV244subfile1PageCount',fld:'vSUBFILE1PAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV252subfile2PageCount',fld:'vSUBFILE2PAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("SUBFILE2PAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e202CY2',iparms:[{av:'SUBFILE2_nFirstRecordOnPage'},{av:'SUBFILE2_nEOF'},{av:'subSubfile1_Rows',ctrl:'SUBFILE1',prop:'Rows'},{av:'subSubfile2_Rows',ctrl:'SUBFILE2',prop:'Rows'},{av:'AV198Sicsv',fld:'vSICSV',pic:'9',hsh:true},{av:'AV43carpeta',fld:'vCARPETA',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV97EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV13BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A3837BarFasKgm',fld:'BARFASKGM',pic:'ZZZZZ9.99'},{av:'A5719BarFasKgT',fld:'BARFASKGT',pic:'ZZZZZ9.99'},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A5168FasPreMC',fld:'FASPREMC',pic:'ZZZ9'},{av:'AV90CosTiR',fld:'vCOSTIR',pic:'9',hsh:true},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'AV211Tiempo_m',fld:'vTIEMPO_M',pic:'ZZZZZ9',hsh:true},{av:'AV167MaqCosMin',fld:'vMAQCOSMIN',pic:'ZZZZ9.9999',hsh:true},{av:'AV166MaqCosKg',fld:'vMAQCOSKG',pic:'ZZZZ9.9999',hsh:true},{av:'AV165MaqCosFijo',fld:'vMAQCOSFIJO',pic:'ZZZZ9.9999',hsh:true},{av:'AV214TipmaqCod',fld:'vTIPMAQCOD',pic:'',hsh:true},{av:'A5720BarFasMtT',fld:'BARFASMTT',pic:'ZZZZZ9.99'},{av:'A3838BarFasMtr',fld:'BARFASMTR',pic:'ZZZZZ9.99'},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99'},{av:'AV112fecteo',fld:'vFECTEO',pic:'',hsh:true},{av:'AV225tteo',fld:'vTTEO',pic:'Z9.99',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'AV125hnd',fld:'vHND',pic:'ZZZZZZZZZ9',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'AV119Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'AV122Grdtipart',fld:'vGRDTIPART',pic:'ZZZ9',hsh:true},{av:'AV209teotixfi',fld:'vTEOTIXFI',pic:'ZZZ9',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'AV180Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'A165BarHorIni',fld:'BARHORINI',pic:'ZZZ9'},{av:'A164BarHorFin',fld:'BARHORFIN',pic:'ZZZ9'},{av:'AV18BarCosPro',fld:'vBARCOSPRO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17BarCosAny',fld:'vBARCOSANY',pic:'ZZZZZZ9.99',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV163MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'A605MaqCosMin',fld:'MAQCOSMIN',pic:'ZZZZ9.9999'},{av:'A13180MaqCosKg',fld:'MAQCOSKG',pic:'ZZZZ9.9999'},{av:'A13179MaqCosFijo',fld:'MAQCOSFIJO',pic:'ZZZZ9.9999'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A1011TipMaqCod',fld:'TIPMAQCOD',pic:''},{av:'AV32BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A556HisProEst',fld:'HISPROEST',pic:'9'},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'A4364GrdTipArt',fld:'GRDTIPART',pic:'ZZZ9'},{av:'A829TipArtCod',fld:'TIPARTCOD',pic:'ZZZ9'},{av:'AV39BarTipArt',fld:'vBARTIPART',pic:'ZZZ9',hsh:true},{av:'AV107fec1',fld:'vFEC1',pic:'',hsh:true},{av:'AV108Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV224Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'AV117FlagColor',fld:'vFLAGCOLOR',pic:'9',hsh:true},{av:'AV120ForRelban',fld:'vFORRELBAN',pic:'ZZZ9.99',hsh:true},{av:'AV201Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV84CosteSimula',fld:'vCOSTESIMULA',pic:'ZZZZ9.99999',hsh:true},{av:'Subfile2paginationbar_Rowsperpageselectedvalue',ctrl:'SUBFILE2PAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("SUBFILE2PAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subSubfile2_Rows',ctrl:'SUBFILE2',prop:'Rows'},{av:'AV251subfile2CurrentPage',fld:'vSUBFILE2CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e112CY1',iparms:[]");
      setEventMetadata("'DORESULTADOS'",",oparms:[]}");
      setEventMetadata("'DOEXCEL'","{handler:'e122CY1',iparms:[]");
      setEventMetadata("'DOEXCEL'",",oparms:[]}");
      setEventMetadata("'DOPDF'","{handler:'e132CY1',iparms:[]");
      setEventMetadata("'DOPDF'",",oparms:[]}");
      setEventMetadata("'DOCSV'","{handler:'e142CY1',iparms:[]");
      setEventMetadata("'DOCSV'",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e152CY1',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("COMBO_CLICOD1.ONOPTIONCLICKED","{handler:'e162CY2',iparms:[{av:'Combo_clicod1_Selectedvalue_get',ctrl:'COMBO_CLICOD1',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICOD1.ONOPTIONCLICKED",",oparms:[{av:'AV46Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'}]}");
      setEventMetadata("VDETAILS.CLICK","{handler:'e252CY2',iparms:[{av:'SUBFILE2_nFirstRecordOnPage'},{av:'SUBFILE2_nEOF'},{av:'subSubfile1_Rows',ctrl:'SUBFILE1',prop:'Rows'},{av:'subSubfile2_Rows',ctrl:'SUBFILE2',prop:'Rows'},{av:'AV198Sicsv',fld:'vSICSV',pic:'9',hsh:true},{av:'AV43carpeta',fld:'vCARPETA',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV97EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV13BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV11BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A3837BarFasKgm',fld:'BARFASKGM',pic:'ZZZZZ9.99'},{av:'A5719BarFasKgT',fld:'BARFASKGT',pic:'ZZZZZ9.99'},{av:'A6173BarFasSec',fld:'BARFASSEC',pic:''},{av:'A5168FasPreMC',fld:'FASPREMC',pic:'ZZZ9'},{av:'AV90CosTiR',fld:'vCOSTIR',pic:'9',hsh:true},{av:'A215BarTieRea',fld:'BARTIEREA',pic:'Z9.99'},{av:'AV211Tiempo_m',fld:'vTIEMPO_M',pic:'ZZZZZ9',hsh:true},{av:'AV167MaqCosMin',fld:'vMAQCOSMIN',pic:'ZZZZ9.9999',hsh:true},{av:'AV166MaqCosKg',fld:'vMAQCOSKG',pic:'ZZZZ9.9999',hsh:true},{av:'AV165MaqCosFijo',fld:'vMAQCOSFIJO',pic:'ZZZZ9.9999',hsh:true},{av:'AV214TipmaqCod',fld:'vTIPMAQCOD',pic:'',hsh:true},{av:'A5720BarFasMtT',fld:'BARFASMTT',pic:'ZZZZZ9.99'},{av:'A3838BarFasMtr',fld:'BARFASMTR',pic:'ZZZZZ9.99'},{av:'A216BarTieTeo',fld:'BARTIETEO',pic:'Z9.99'},{av:'AV112fecteo',fld:'vFECTEO',pic:'',hsh:true},{av:'AV225tteo',fld:'vTTEO',pic:'Z9.99',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'AV125hnd',fld:'vHND',pic:'ZZZZZZZZZ9',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'AV119Fornumcol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'AV122Grdtipart',fld:'vGRDTIPART',pic:'ZZZ9',hsh:true},{av:'AV209teotixfi',fld:'vTEOTIXFI',pic:'ZZZ9',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'AV180Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'A165BarHorIni',fld:'BARHORINI',pic:'ZZZ9'},{av:'A164BarHorFin',fld:'BARHORFIN',pic:'ZZZ9'},{av:'AV18BarCosPro',fld:'vBARCOSPRO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV17BarCosAny',fld:'vBARCOSANY',pic:'ZZZZZZ9.99',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV163MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'A605MaqCosMin',fld:'MAQCOSMIN',pic:'ZZZZ9.9999'},{av:'A13180MaqCosKg',fld:'MAQCOSKG',pic:'ZZZZ9.9999'},{av:'A13179MaqCosFijo',fld:'MAQCOSFIJO',pic:'ZZZZ9.9999'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A1011TipMaqCod',fld:'TIPMAQCOD',pic:''},{av:'AV32BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A556HisProEst',fld:'HISPROEST',pic:'9'},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'A4364GrdTipArt',fld:'GRDTIPART',pic:'ZZZ9'},{av:'A829TipArtCod',fld:'TIPARTCOD',pic:'ZZZ9'},{av:'AV39BarTipArt',fld:'vBARTIPART',pic:'ZZZ9',hsh:true},{av:'AV107fec1',fld:'vFEC1',pic:'',hsh:true},{av:'AV108Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'AV88CosteTeo',fld:'vCOSTETEO',pic:'ZZZZZZ9.99',hsh:true},{av:'AV224Traza',fld:'vTRAZA',pic:'9',hsh:true},{av:'AV117FlagColor',fld:'vFLAGCOLOR',pic:'9',hsh:true},{av:'AV120ForRelban',fld:'vFORRELBAN',pic:'ZZZ9.99',hsh:true},{av:'AV201Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV84CosteSimula',fld:'vCOSTESIMULA',pic:'ZZZZ9.99999',hsh:true},{av:'SUBFILE1_nFirstRecordOnPage'},{av:'SUBFILE1_nEOF'},{av:'edtavValor_Title',ctrl:'vVALOR',prop:'Title'},{av:'AV47Clicod2',fld:'vCLICOD2',pic:'ZZZZZ9'},{av:'AV10Barcod1',fld:'vBARCOD1',pic:'ZZZZZZZ9'},{av:'AV109Fec3',fld:'vFEC3',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'AV46Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV110Fec4',fld:'vFEC4',pic:''},{av:'AV7Artcod',fld:'vARTCOD',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A3311BarManCod1',fld:'BARMANCOD1',pic:'ZZZ9'},{av:'AV29BarMancod1',fld:'vBARMANCOD1',pic:'ZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'AV21Bardisnum',fld:'vBARDISNUM',pic:''},{av:'AV14Barcodreo1',fld:'vBARCODREO1',pic:'9'},{av:'AV12Barcodpar1',fld:'vBARCODPAR1',pic:''},{av:'A2010BarTipDis',fld:'BARTIPDIS',pic:'@!'},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A141BarCosPro',fld:'BARCOSPRO',pic:'ZZZZZZ9.99'},{av:'A140BarCosAny',fld:'BARCOSANY',pic:'ZZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'AV78CosteFab',fld:'vCOSTEFAB',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV199Simulador',fld:'vSIMULADOR',pic:'9'},{av:'AV235Valor',fld:'vVALOR',pic:'ZZZZZZZZ9.99',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A3275BarKgsAut',fld:'BARKGSAUT',pic:'ZZZZZ9.99'},{av:'A3276BarMtsAut',fld:'BARMTSAUT',pic:'ZZZZZ9.99'},{av:'A32AlbProEsp',fld:'ALBPROESP',pic:'99'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1262BarPreKgm',fld:'BARPREKGM',pic:'ZZZZZZ9.999'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1264BarPreMtr',fld:'BARPREMTR',pic:'ZZZZZZ9.999'},{av:'A1275FasKgm',fld:'FASKGM',pic:'ZZZZZ9.99'},{av:'A1241GuiFasPKg',fld:'GUIFASPKG',pic:'ZZZZZZ9.999'},{av:'A1276FasMtr',fld:'FASMTR',pic:'ZZZZZ9.99'},{av:'A1242GuiFasPMt',fld:'GUIFASPMT',pic:'ZZZZZZ9.999'},{av:'A1294FacBarCod',fld:'FACBARCOD',pic:'ZZZZZZZ9'},{av:'A1295FacBarReo',fld:'FACBARREO',pic:'9'},{av:'A1296FacBarPar',fld:'FACBARPAR',pic:''},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VDETAILS.CLICK",",oparms:[{av:'AV244subfile1PageCount',fld:'vSUBFILE1PAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV252subfile2PageCount',fld:'vSUBFILE2PAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Kilosppieza',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALIDV_MAQCOD","{handler:'validv_Maqcod',iparms:[]");
      setEventMetadata("VALIDV_MAQCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARUNIMED","{handler:'validv_Barunimed',iparms:[]");
      setEventMetadata("VALIDV_BARUNIMED",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Grdtipart',iparms:[]");
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
      Subfile1paginationbar_Selectedpage = "" ;
      Subfile2paginationbar_Selectedpage = "" ;
      Combo_clicod2_Selectedvalue_get = "" ;
      Combo_clicod1_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV109Fec3 = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      AV97EmprCod = "" ;
      AV110Fec4 = GXutil.nullDate() ;
      A212BarSer = "" ;
      AV7Artcod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      AV107fec1 = GXutil.nullDate() ;
      AV108Fec2 = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A143BarDisNum = "" ;
      AV21Bardisnum = "" ;
      A130BarCodPar = "" ;
      AV12Barcodpar1 = "" ;
      A2010BarTipDis = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A228BarUniMed = "" ;
      A4812BarEncCli = "" ;
      AV78CosteFab = DecimalUtil.ZERO ;
      AV88CosteTeo = DecimalUtil.ZERO ;
      AV120ForRelban = DecimalUtil.ZERO ;
      AV201Station = "" ;
      AV84CosteSimula = DecimalUtil.ZERO ;
      AV235Valor = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      AV11BarCodPar = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1296FacBarPar = "" ;
      AV43carpeta = "" ;
      AV214TipmaqCod = "" ;
      AV112fecteo = GXutil.nullDate() ;
      AV18BarCosPro = DecimalUtil.ZERO ;
      AV17BarCosAny = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A603MaqCodBis = "" ;
      A460FasDsc = "" ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A6173BarFasSec = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      AV167MaqCosMin = DecimalUtil.ZERO ;
      AV166MaqCosKg = DecimalUtil.ZERO ;
      AV165MaqCosFijo = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      AV225tteo = DecimalUtil.ZERO ;
      A150BarFacTin = "" ;
      A602MaqCod = "" ;
      AV163MaqCod = "" ;
      A605MaqCosMin = DecimalUtil.ZERO ;
      A13180MaqCosKg = DecimalUtil.ZERO ;
      A13179MaqCosFijo = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      A1011TipMaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV245Clicod1_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV247Clicod2_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Combo_clicod1_Selectedvalue_set = "" ;
      Combo_clicod2_Selectedvalue_set = "" ;
      Subfile1_empowerer_Gridinternalname = "" ;
      Subfile2_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicod1_Jsonclick = "" ;
      ucCombo_clicod1 = new com.genexus.webpanels.GXUserControl();
      Combo_clicod1_Caption = "" ;
      lblTextblockcombo_clicod2_Jsonclick = "" ;
      ucCombo_clicod2 = new com.genexus.webpanels.GXUserControl();
      Combo_clicod2_Caption = "" ;
      TempTags = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtnexcel_Jsonclick = "" ;
      bttBtnpdf_Jsonclick = "" ;
      bttBtncsv_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      Subfile1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucSubfile1paginationbar = new com.genexus.webpanels.GXUserControl();
      Subfile2Container = new com.genexus.webpanels.GXWebGrid(context);
      ucSubfile2paginationbar = new com.genexus.webpanels.GXUserControl();
      AV258Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucSubfile1_empowerer = new com.genexus.webpanels.GXUserControl();
      ucSubfile2_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV254Details = "" ;
      AV259Details_GXI = "" ;
      AV49CliNom = "" ;
      AV22BarEncCli = "" ;
      AV36BarSer = "" ;
      AV37BarSerDsc = "" ;
      AV15BarColNom = "" ;
      AV28BarKgm = DecimalUtil.ZERO ;
      AV31BarMtr = DecimalUtil.ZERO ;
      AV68Coste_p = DecimalUtil.ZERO ;
      AV173Margen = DecimalUtil.ZERO ;
      AV227TxtAlb = "" ;
      AV26BarFecGen = GXutil.nullDate() ;
      AV27BarFecSal = GXutil.nullDate() ;
      AV41BarTipDis = "" ;
      AV82CostepOld = DecimalUtil.ZERO ;
      AV136KilospPieza = DecimalUtil.ZERO ;
      AV25BarFasSec = "" ;
      AV105FasDsc = "" ;
      AV168MaqDsc = "" ;
      AV231Unidades = DecimalUtil.ZERO ;
      AV42BarUniMed = "" ;
      AV249Horlni_5 = "" ;
      AV127HorFin_5 = "" ;
      AV38BarTieRea = DecimalUtil.ZERO ;
      AV104FasCod = "" ;
      Gx_date = GXutil.nullDate() ;
      AV98EmprNom = "" ;
      AV234UsurCod = "" ;
      GXt_char1 = "" ;
      lV7Artcod = "" ;
      scmdbuf = "" ;
      H02CY3_A396EmprCod = new String[] {""} ;
      H02CY3_A130BarCodPar = new String[] {""} ;
      H02CY3_A132BarCodReo = new byte[1] ;
      H02CY3_A129BarCod = new int[1] ;
      H02CY3_A143BarDisNum = new String[] {""} ;
      H02CY3_A3311BarManCod1 = new short[1] ;
      H02CY3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H02CY3_A212BarSer = new String[] {""} ;
      H02CY3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H02CY3_A252CliCod = new int[1] ;
      H02CY3_n252CliCod = new boolean[] {false} ;
      H02CY3_A2010BarTipDis = new String[] {""} ;
      H02CY3_A1652BarSerDsc = new String[] {""} ;
      H02CY3_A135BarColNom = new String[] {""} ;
      H02CY3_A136BarColNum = new int[1] ;
      H02CY3_A218BarTipCol = new byte[1] ;
      H02CY3_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY3_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY3_A279CliNom = new String[] {""} ;
      H02CY3_A228BarUniMed = new String[] {""} ;
      H02CY3_A4812BarEncCli = new String[] {""} ;
      H02CY3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV230Und = "" ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV85Costest = DecimalUtil.ZERO ;
      AV70Coste_t = DecimalUtil.ZERO ;
      Subfile1Row = new com.genexus.webpanels.GXWebRow();
      H02CY4_A396EmprCod = new String[] {""} ;
      H02CY4_A10045CliAct = new String[] {""} ;
      H02CY4_A13735CliCNom = new String[] {""} ;
      H02CY4_A252CliCod = new int[1] ;
      H02CY4_n252CliCod = new boolean[] {false} ;
      H02CY4_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      AV246Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H02CY5_A396EmprCod = new String[] {""} ;
      H02CY5_A10045CliAct = new String[] {""} ;
      H02CY5_A13735CliCNom = new String[] {""} ;
      H02CY5_A252CliCod = new int[1] ;
      H02CY5_n252CliCod = new boolean[] {false} ;
      H02CY5_A279CliNom = new String[] {""} ;
      H02CY6_A130BarCodPar = new String[] {""} ;
      H02CY6_A132BarCodReo = new byte[1] ;
      H02CY6_A129BarCod = new int[1] ;
      H02CY6_A30AlbProCod = new long[1] ;
      H02CY6_A396EmprCod = new String[] {""} ;
      H02CY6_A32AlbProEsp = new byte[1] ;
      H02CY6_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY6_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY7_A1240GuiFasLin = new short[1] ;
      H02CY7_A396EmprCod = new String[] {""} ;
      H02CY7_A30AlbProCod = new long[1] ;
      H02CY7_A129BarCod = new int[1] ;
      H02CY7_A132BarCodReo = new byte[1] ;
      H02CY7_A130BarCodPar = new String[] {""} ;
      H02CY7_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY7_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY7_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY7_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY8_A446FacLin = new int[1] ;
      H02CY8_A1296FacBarPar = new String[] {""} ;
      H02CY8_A1295FacBarReo = new byte[1] ;
      H02CY8_A1294FacBarCod = new int[1] ;
      H02CY8_A396EmprCod = new String[] {""} ;
      H02CY8_A430FacCod = new int[1] ;
      AV102FacBarPar = "" ;
      H02CY9_A602MaqCod = new String[] {""} ;
      H02CY9_A556HisProEst = new byte[1] ;
      H02CY9_A656ParCod = new short[1] ;
      H02CY9_n656ParCod = new boolean[] {false} ;
      H02CY9_A194BarOrdLin = new short[1] ;
      H02CY9_A130BarCodPar = new String[] {""} ;
      H02CY9_A132BarCodReo = new byte[1] ;
      H02CY9_A129BarCod = new int[1] ;
      H02CY9_A396EmprCod = new String[] {""} ;
      H02CY9_A561HisProLin = new int[1] ;
      H02CY9_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H02CY9_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H02CY9_n4440HisProDTI = new boolean[] {false} ;
      H02CY9_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H02CY9_n4441HisProDTF = new boolean[] {false} ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      H02CY10_A829TipArtCod = new short[1] ;
      H02CY10_A396EmprCod = new String[] {""} ;
      H02CY10_A4364GrdTipArt = new short[1] ;
      H02CY11_A602MaqCod = new String[] {""} ;
      H02CY11_A396EmprCod = new String[] {""} ;
      H02CY11_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY11_n605MaqCosMin = new boolean[] {false} ;
      H02CY11_A13180MaqCosKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY11_n13180MaqCosKg = new boolean[] {false} ;
      H02CY11_A13179MaqCosFijo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY11_n13179MaqCosFijo = new boolean[] {false} ;
      H02CY11_A606MaqDsc = new String[] {""} ;
      H02CY11_n606MaqDsc = new boolean[] {false} ;
      H02CY11_A1011TipMaqCod = new String[] {""} ;
      H02CY11_n1011TipMaqCod = new boolean[] {false} ;
      AV134KgsT = DecimalUtil.ZERO ;
      AV183MtsT = DecimalUtil.ZERO ;
      c203BarPieKil = DecimalUtil.ZERO ;
      c205BarPieMet = DecimalUtil.ZERO ;
      H02CY12_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY12_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV135KgsTS = DecimalUtil.ZERO ;
      AV184MtsTS = DecimalUtil.ZERO ;
      c3275BarKgsAut = DecimalUtil.ZERO ;
      c3276BarMtsAut = DecimalUtil.ZERO ;
      H02CY13_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY13_n3275BarKgsAut = new boolean[] {false} ;
      H02CY13_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY13_n3276BarMtsAut = new boolean[] {false} ;
      AV56Coste_f = DecimalUtil.ZERO ;
      AV52CosoPrd1 = DecimalUtil.ZERO ;
      AV53CosPrd = DecimalUtil.ZERO ;
      AV54cosprd1 = DecimalUtil.ZERO ;
      AV71Coste_t_m = DecimalUtil.ZERO ;
      AV72Coste_teo = DecimalUtil.ZERO ;
      AV74Coste_tp = DecimalUtil.ZERO ;
      AV75Coste_tt = DecimalUtil.ZERO ;
      AV79Costefpp = DecimalUtil.ZERO ;
      AV80CosteL = DecimalUtil.ZERO ;
      AV83Costeqpp = DecimalUtil.ZERO ;
      AV236Valor_c = DecimalUtil.ZERO ;
      AV237Valor_cor = DecimalUtil.ZERO ;
      AV115File1 = "" ;
      AV51Control = "" ;
      H02CY15_A130BarCodPar = new String[] {""} ;
      H02CY15_A132BarCodReo = new byte[1] ;
      H02CY15_A129BarCod = new int[1] ;
      H02CY15_A396EmprCod = new String[] {""} ;
      H02CY15_A457FasCod = new String[] {""} ;
      H02CY15_A603MaqCodBis = new String[] {""} ;
      H02CY15_A460FasDsc = new String[] {""} ;
      H02CY15_A228BarUniMed = new String[] {""} ;
      H02CY15_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY15_n3837BarFasKgm = new boolean[] {false} ;
      H02CY15_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY15_n5719BarFasKgT = new boolean[] {false} ;
      H02CY15_A6173BarFasSec = new String[] {""} ;
      H02CY15_n6173BarFasSec = new boolean[] {false} ;
      H02CY15_A5168FasPreMC = new short[1] ;
      H02CY15_n5168FasPreMC = new boolean[] {false} ;
      H02CY15_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY15_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY15_n5720BarFasMtT = new boolean[] {false} ;
      H02CY15_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY15_n3838BarFasMtr = new boolean[] {false} ;
      H02CY15_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY15_A252CliCod = new int[1] ;
      H02CY15_n252CliCod = new boolean[] {false} ;
      H02CY15_A212BarSer = new String[] {""} ;
      H02CY15_A135BarColNom = new String[] {""} ;
      H02CY15_A136BarColNum = new int[1] ;
      H02CY15_A218BarTipCol = new byte[1] ;
      H02CY15_A217BarTipArt = new short[1] ;
      H02CY15_n217BarTipArt = new boolean[] {false} ;
      H02CY15_A150BarFacTin = new String[] {""} ;
      H02CY15_A165BarHorIni = new short[1] ;
      H02CY15_A164BarHorFin = new short[1] ;
      H02CY15_A194BarOrdLin = new short[1] ;
      H02CY15_A758ProCod = new String[] {""} ;
      H02CY15_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CY15_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV133Kgm = DecimalUtil.ZERO ;
      AV182Mtr = DecimalUtil.ZERO ;
      AV23Barfaskgm = DecimalUtil.ZERO ;
      AV24Barfaskgt = DecimalUtil.ZERO ;
      GXv_char15 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_date18 = new java.util.Date[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      GXv_int17 = new long[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char20 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_char21 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int22 = new short[1] ;
      GXv_int23 = new short[1] ;
      AV44Ceros4 = "" ;
      AV128HorIni = "" ;
      AV129HorIni_5 = "" ;
      AV126HorFin = "" ;
      Subfile2Row = new com.genexus.webpanels.GXWebRow();
      GXv_int12 = new byte[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subSubfile1_Linesclass = "" ;
      sImgUrl = "" ;
      ROClassString = "" ;
      subSubfile2_Linesclass = "" ;
      Subfile1Column = new com.genexus.webpanels.GXWebColumn();
      Subfile2Column = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.analisecustoww__default(),
         new Object[] {
             new Object[] {
            H02CY3_A396EmprCod, H02CY3_A130BarCodPar, H02CY3_A132BarCodReo, H02CY3_A129BarCod, H02CY3_A143BarDisNum, H02CY3_A3311BarManCod1, H02CY3_A161BarFecSal, H02CY3_A212BarSer, H02CY3_A159BarFecGen, H02CY3_A252CliCod,
            H02CY3_n252CliCod, H02CY3_A2010BarTipDis, H02CY3_A1652BarSerDsc, H02CY3_A135BarColNom, H02CY3_A136BarColNum, H02CY3_A218BarTipCol, H02CY3_A141BarCosPro, H02CY3_A140BarCosAny, H02CY3_A279CliNom, H02CY3_A228BarUniMed,
            H02CY3_A4812BarEncCli, H02CY3_A184BarMtr, H02CY3_A166BarKgm
            }
            , new Object[] {
            H02CY4_A396EmprCod, H02CY4_A10045CliAct, H02CY4_A13735CliCNom, H02CY4_A252CliCod, H02CY4_A279CliNom
            }
            , new Object[] {
            H02CY5_A396EmprCod, H02CY5_A10045CliAct, H02CY5_A13735CliCNom, H02CY5_A252CliCod, H02CY5_A279CliNom
            }
            , new Object[] {
            H02CY6_A130BarCodPar, H02CY6_A132BarCodReo, H02CY6_A129BarCod, H02CY6_A30AlbProCod, H02CY6_A396EmprCod, H02CY6_A32AlbProEsp, H02CY6_A1264BarPreMtr, H02CY6_A1263BarAlbMtrE, H02CY6_A1262BarPreKgm, H02CY6_A1261BarAlbKgmE
            }
            , new Object[] {
            H02CY7_A1240GuiFasLin, H02CY7_A396EmprCod, H02CY7_A30AlbProCod, H02CY7_A129BarCod, H02CY7_A132BarCodReo, H02CY7_A130BarCodPar, H02CY7_A1242GuiFasPMt, H02CY7_A1276FasMtr, H02CY7_A1241GuiFasPKg, H02CY7_A1275FasKgm
            }
            , new Object[] {
            H02CY8_A446FacLin, H02CY8_A1296FacBarPar, H02CY8_A1295FacBarReo, H02CY8_A1294FacBarCod, H02CY8_A396EmprCod, H02CY8_A430FacCod
            }
            , new Object[] {
            H02CY9_A602MaqCod, H02CY9_A556HisProEst, H02CY9_A656ParCod, H02CY9_n656ParCod, H02CY9_A194BarOrdLin, H02CY9_A130BarCodPar, H02CY9_A132BarCodReo, H02CY9_A129BarCod, H02CY9_A396EmprCod, H02CY9_A561HisProLin,
            H02CY9_A558HisProFec, H02CY9_A4440HisProDTI, H02CY9_n4440HisProDTI, H02CY9_A4441HisProDTF, H02CY9_n4441HisProDTF
            }
            , new Object[] {
            H02CY10_A829TipArtCod, H02CY10_A396EmprCod, H02CY10_A4364GrdTipArt
            }
            , new Object[] {
            H02CY11_A602MaqCod, H02CY11_A396EmprCod, H02CY11_A605MaqCosMin, H02CY11_n605MaqCosMin, H02CY11_A13180MaqCosKg, H02CY11_n13180MaqCosKg, H02CY11_A13179MaqCosFijo, H02CY11_n13179MaqCosFijo, H02CY11_A606MaqDsc, H02CY11_n606MaqDsc,
            H02CY11_A1011TipMaqCod, H02CY11_n1011TipMaqCod
            }
            , new Object[] {
            H02CY12_A203BarPieKil, H02CY12_A205BarPieMet
            }
            , new Object[] {
            H02CY13_A3275BarKgsAut, H02CY13_n3275BarKgsAut, H02CY13_A3276BarMtsAut, H02CY13_n3276BarMtsAut
            }
            , new Object[] {
            H02CY15_A130BarCodPar, H02CY15_A132BarCodReo, H02CY15_A129BarCod, H02CY15_A396EmprCod, H02CY15_A457FasCod, H02CY15_A603MaqCodBis, H02CY15_A460FasDsc, H02CY15_A228BarUniMed, H02CY15_A3837BarFasKgm, H02CY15_n3837BarFasKgm,
            H02CY15_A5719BarFasKgT, H02CY15_n5719BarFasKgT, H02CY15_A6173BarFasSec, H02CY15_n6173BarFasSec, H02CY15_A5168FasPreMC, H02CY15_n5168FasPreMC, H02CY15_A215BarTieRea, H02CY15_A5720BarFasMtT, H02CY15_n5720BarFasMtT, H02CY15_A3838BarFasMtr,
            H02CY15_n3838BarFasMtr, H02CY15_A216BarTieTeo, H02CY15_A252CliCod, H02CY15_n252CliCod, H02CY15_A212BarSer, H02CY15_A135BarColNom, H02CY15_A136BarColNum, H02CY15_A218BarTipCol, H02CY15_A217BarTipArt, H02CY15_n217BarTipArt,
            H02CY15_A150BarFacTin, H02CY15_A165BarHorIni, H02CY15_A164BarHorFin, H02CY15_A194BarOrdLin, H02CY15_A758ProCod, H02CY15_A166BarKgm, H02CY15_A184BarMtr
            }
         }
      );
      AV258Pgmname = "Facturacion.AnaliseCustoWW" ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      AV258Pgmname = "Facturacion.AnaliseCustoWW" ;
      Gx_err = (short)(0) ;
      Gx_date = GXutil.today( ) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarenccli_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavPrograma_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavCoste_p_Enabled = 0 ;
      edtavCostefab_Enabled = 0 ;
      edtavValor_Enabled = 0 ;
      edtavMargen_Enabled = 0 ;
      edtavTxtalb_Enabled = 0 ;
      edtavBarfecgen_Enabled = 0 ;
      edtavBarfecsal_Enabled = 0 ;
      edtavBartipdis_Enabled = 0 ;
      edtavCostepold_Enabled = 0 ;
      edtavKilosppieza_Enabled = 0 ;
      edtavBarfassec_Enabled = 0 ;
      edtavBarordlin_Enabled = 0 ;
      edtavFasdsc_Enabled = 0 ;
      edtavMaqcod_Enabled = 0 ;
      edtavMaqdsc_Enabled = 0 ;
      edtavUnidades_Enabled = 0 ;
      edtavUnidadest_Enabled = 0 ;
      edtavBarunimed_Enabled = 0 ;
      edtavHorlni_5_Enabled = 0 ;
      edtavHorfin_5_Enabled = 0 ;
      edtavBartierea_Enabled = 0 ;
      edtavTteo_Enabled = 0 ;
      edtavMaqcosmin_Enabled = 0 ;
      edtavMaqcoskg_Enabled = 0 ;
      edtavMaqcosfijo_Enabled = 0 ;
      edtavCoste_m_Enabled = 0 ;
      edtavCoste_tm_Enabled = 0 ;
      edtavTieteo_Enabled = 0 ;
      edtavFascod_Enabled = 0 ;
      edtavCoste_p_k_Enabled = 0 ;
      edtavTeotixfi_Enabled = 0 ;
      edtavFomumcol_Enabled = 0 ;
      edtavBartipart_Enabled = 0 ;
      edtavGrdtipart_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte SUBFILE1_nEOF ;
   private byte SUBFILE2_nEOF ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV14Barcodreo1 ;
   private byte A218BarTipCol ;
   private byte AV224Traza ;
   private byte AV117FlagColor ;
   private byte AV199Simulador ;
   private byte AV13BarCodReo ;
   private byte A32AlbProEsp ;
   private byte AV180Moda21 ;
   private byte A1295FacBarReo ;
   private byte AV198Sicsv ;
   private byte AV90CosTiR ;
   private byte A556HisProEst ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte nDonePA ;
   private byte subSubfile1_Backcolorstyle ;
   private byte subSubfile2_Backcolorstyle ;
   private byte AV131Iexcel ;
   private byte AV40BarTipCol ;
   private byte AV103FacBarReo ;
   private byte AV200Stat ;
   private byte AV176Min ;
   private byte GXv_int6[] ;
   private byte GXt_int5 ;
   private byte GXv_int12[] ;
   private byte subSubfile1_Backstyle ;
   private byte subSubfile2_Backstyle ;
   private byte subSubfile1_Titlebackstyle ;
   private byte subSubfile1_Allowselection ;
   private byte subSubfile1_Allowhovering ;
   private byte subSubfile1_Allowcollapsing ;
   private byte subSubfile1_Collapsed ;
   private byte subSubfile2_Titlebackstyle ;
   private byte subSubfile2_Allowselection ;
   private byte subSubfile2_Allowhovering ;
   private byte subSubfile2_Allowcollapsing ;
   private byte subSubfile2_Collapsed ;
   private short nRcdExists_15 ;
   private short nIsMod_15 ;
   private short nRcdExists_14 ;
   private short nIsMod_14 ;
   private short nRcdExists_13 ;
   private short nIsMod_13 ;
   private short nRcdExists_12 ;
   private short nIsMod_12 ;
   private short nRcdExists_11 ;
   private short nIsMod_11 ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A3311BarManCod1 ;
   private short AV29BarMancod1 ;
   private short A194BarOrdLin ;
   private short A5168FasPreMC ;
   private short A217BarTipArt ;
   private short AV122Grdtipart ;
   private short AV209teotixfi ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short AV32BarOrdLin ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short A4364GrdTipArt ;
   private short A829TipArtCod ;
   private short AV39BarTipArt ;
   private short wbEnd ;
   private short wbStart ;
   private short AV196Programa ;
   private short AV232Unidadest ;
   private short AV62Coste_m ;
   private short AV73Coste_tm ;
   private short AV212TieTeo ;
   private short AV69Coste_p_k ;
   private short AV250Fomumcol ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV248RecordCount ;
   private short AV253RecordCount2 ;
   private short AV106FasPreMC ;
   private short GXv_int22[] ;
   private short GXv_int23[] ;
   private short AV138Lenvar ;
   private int subSubfile1_Rows ;
   private int subSubfile2_Rows ;
   private int Subfile1paginationbar_Rowsperpageselectedvalue ;
   private int Subfile2paginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_111 ;
   private int nRC_GXsfl_144 ;
   private int nGXsfl_111_idx=1 ;
   private int AV47Clicod2 ;
   private int AV10Barcod1 ;
   private int A252CliCod ;
   private int AV46Clicod1 ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV9BarCod ;
   private int A1294FacBarCod ;
   private int A430FacCod ;
   private int AV211Tiempo_m ;
   private int AV119Fornumcol ;
   private int nGXsfl_144_idx=1 ;
   private int A561HisProLin ;
   private int Subfile1paginationbar_Pagestoshow ;
   private int Subfile2paginationbar_Pagestoshow ;
   private int edtavFec3_Enabled ;
   private int edtavFec4_Enabled ;
   private int edtavArtcod_Enabled ;
   private int edtavBarcod1_Enabled ;
   private int edtavBarcodreo1_Enabled ;
   private int edtavBarcodpar1_Enabled ;
   private int edtavSimulador_Enabled ;
   private int edtavBardisnum_Enabled ;
   private int edtavBarmancod1_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavClicod1_Visible ;
   private int edtavClicod2_Visible ;
   private int edtavSubfile1currentpage_Visible ;
   private int edtavSubfile2currentpage_Visible ;
   private int AV45CliCod ;
   private int AV16BarColNum ;
   private int subSubfile1_Islastpage ;
   private int subSubfile2_Islastpage ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavBarenccli_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavPrograma_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavCoste_p_Enabled ;
   private int edtavCostefab_Enabled ;
   private int edtavValor_Enabled ;
   private int edtavMargen_Enabled ;
   private int edtavTxtalb_Enabled ;
   private int edtavBarfecgen_Enabled ;
   private int edtavBarfecsal_Enabled ;
   private int edtavBartipdis_Enabled ;
   private int edtavCostepold_Enabled ;
   private int edtavKilosppieza_Enabled ;
   private int edtavBarfassec_Enabled ;
   private int edtavBarordlin_Enabled ;
   private int edtavFasdsc_Enabled ;
   private int edtavMaqcod_Enabled ;
   private int edtavMaqdsc_Enabled ;
   private int edtavUnidades_Enabled ;
   private int edtavUnidadest_Enabled ;
   private int edtavBarunimed_Enabled ;
   private int edtavHorlni_5_Enabled ;
   private int edtavHorfin_5_Enabled ;
   private int edtavBartierea_Enabled ;
   private int edtavTteo_Enabled ;
   private int edtavMaqcosmin_Enabled ;
   private int edtavMaqcoskg_Enabled ;
   private int edtavMaqcosfijo_Enabled ;
   private int edtavCoste_m_Enabled ;
   private int edtavCoste_tm_Enabled ;
   private int edtavTieteo_Enabled ;
   private int edtavFascod_Enabled ;
   private int edtavCoste_p_k_Enabled ;
   private int edtavTeotixfi_Enabled ;
   private int edtavFomumcol_Enabled ;
   private int edtavBartipart_Enabled ;
   private int edtavGrdtipart_Enabled ;
   private int SUBFILE1_nGridOutOfScope ;
   private int SUBFILE2_nGridOutOfScope ;
   private int subSubfile1_Recordcount ;
   private int subSubfile2_Recordcount ;
   private int AV48Clicod3 ;
   private int AV242PageToGo ;
   private int AV101facbarcod ;
   private int GXv_int13[] ;
   private int GXv_int7[] ;
   private int GXv_int14[] ;
   private int idxLst ;
   private int subSubfile1_Backcolor ;
   private int subSubfile1_Allbackcolor ;
   private int edtavDetails_Enabled ;
   private int edtavDetails_Visible ;
   private int edtavClicod_Visible ;
   private int edtavClinom_Visible ;
   private int edtavBarcod_Visible ;
   private int edtavBarcodreo_Visible ;
   private int edtavBarcodpar_Visible ;
   private int edtavBarenccli_Visible ;
   private int edtavBarser_Visible ;
   private int edtavBarserdsc_Visible ;
   private int edtavBarcolnom_Visible ;
   private int edtavBarcolnum_Visible ;
   private int edtavPrograma_Visible ;
   private int edtavBarkgm_Visible ;
   private int edtavBarmtr_Visible ;
   private int edtavCoste_p_Visible ;
   private int edtavCostefab_Visible ;
   private int edtavValor_Visible ;
   private int edtavMargen_Visible ;
   private int edtavTxtalb_Visible ;
   private int edtavBarfecgen_Visible ;
   private int edtavBarfecsal_Visible ;
   private int edtavBartipdis_Visible ;
   private int edtavCostepold_Visible ;
   private int edtavKilosppieza_Visible ;
   private int subSubfile2_Backcolor ;
   private int subSubfile2_Allbackcolor ;
   private int subSubfile1_Titlebackcolor ;
   private int subSubfile1_Selectedindex ;
   private int subSubfile1_Selectioncolor ;
   private int subSubfile1_Hoveringcolor ;
   private int subSubfile2_Titlebackcolor ;
   private int subSubfile2_Selectedindex ;
   private int subSubfile2_Selectioncolor ;
   private int subSubfile2_Hoveringcolor ;
   private long SUBFILE1_nFirstRecordOnPage ;
   private long SUBFILE2_nFirstRecordOnPage ;
   private long A30AlbProCod ;
   private long AV125hnd ;
   private long AV244subfile1PageCount ;
   private long AV252subfile2PageCount ;
   private long AV243subfile1CurrentPage ;
   private long AV251subfile2CurrentPage ;
   private long SUBFILE1_nCurrentRecord ;
   private long SUBFILE2_nCurrentRecord ;
   private long GXt_int16 ;
   private long GXv_int17[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal AV78CosteFab ;
   private java.math.BigDecimal AV88CosteTeo ;
   private java.math.BigDecimal AV120ForRelban ;
   private java.math.BigDecimal AV84CosteSimula ;
   private java.math.BigDecimal AV235Valor ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal AV18BarCosPro ;
   private java.math.BigDecimal AV17BarCosAny ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal AV167MaqCosMin ;
   private java.math.BigDecimal AV166MaqCosKg ;
   private java.math.BigDecimal AV165MaqCosFijo ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal AV225tteo ;
   private java.math.BigDecimal A605MaqCosMin ;
   private java.math.BigDecimal A13180MaqCosKg ;
   private java.math.BigDecimal A13179MaqCosFijo ;
   private java.math.BigDecimal AV28BarKgm ;
   private java.math.BigDecimal AV31BarMtr ;
   private java.math.BigDecimal AV68Coste_p ;
   private java.math.BigDecimal AV173Margen ;
   private java.math.BigDecimal AV82CostepOld ;
   private java.math.BigDecimal AV136KilospPieza ;
   private java.math.BigDecimal AV231Unidades ;
   private java.math.BigDecimal AV38BarTieRea ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV85Costest ;
   private java.math.BigDecimal AV70Coste_t ;
   private java.math.BigDecimal AV134KgsT ;
   private java.math.BigDecimal AV183MtsT ;
   private java.math.BigDecimal c203BarPieKil ;
   private java.math.BigDecimal c205BarPieMet ;
   private java.math.BigDecimal AV135KgsTS ;
   private java.math.BigDecimal AV184MtsTS ;
   private java.math.BigDecimal c3275BarKgsAut ;
   private java.math.BigDecimal c3276BarMtsAut ;
   private java.math.BigDecimal AV56Coste_f ;
   private java.math.BigDecimal AV52CosoPrd1 ;
   private java.math.BigDecimal AV53CosPrd ;
   private java.math.BigDecimal AV54cosprd1 ;
   private java.math.BigDecimal AV71Coste_t_m ;
   private java.math.BigDecimal AV72Coste_teo ;
   private java.math.BigDecimal AV74Coste_tp ;
   private java.math.BigDecimal AV75Coste_tt ;
   private java.math.BigDecimal AV79Costefpp ;
   private java.math.BigDecimal AV80CosteL ;
   private java.math.BigDecimal AV83Costeqpp ;
   private java.math.BigDecimal AV236Valor_c ;
   private java.math.BigDecimal AV237Valor_cor ;
   private java.math.BigDecimal AV133Kgm ;
   private java.math.BigDecimal AV182Mtr ;
   private java.math.BigDecimal AV23Barfaskgm ;
   private java.math.BigDecimal AV24Barfaskgt ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String edtavValor_Title ;
   private String Subfile1paginationbar_Selectedpage ;
   private String Subfile2paginationbar_Selectedpage ;
   private String Combo_clicod2_Selectedvalue_get ;
   private String Combo_clicod1_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_111_idx="0001" ;
   private String edtavValor_Internalname ;
   private String A396EmprCod ;
   private String AV97EmprCod ;
   private String A212BarSer ;
   private String AV7Artcod ;
   private String A143BarDisNum ;
   private String AV21Bardisnum ;
   private String A130BarCodPar ;
   private String AV12Barcodpar1 ;
   private String A2010BarTipDis ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A279CliNom ;
   private String A228BarUniMed ;
   private String A4812BarEncCli ;
   private String AV201Station ;
   private String A200BarPieCod ;
   private String AV11BarCodPar ;
   private String A1296FacBarPar ;
   private String AV43carpeta ;
   private String AV214TipmaqCod ;
   private String sGXsfl_144_idx="0001" ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A460FasDsc ;
   private String A6173BarFasSec ;
   private String A150BarFacTin ;
   private String A602MaqCod ;
   private String AV163MaqCod ;
   private String A606MaqDsc ;
   private String A1011TipMaqCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Combo_clicod1_Cls ;
   private String Combo_clicod1_Selectedvalue_set ;
   private String Combo_clicod1_Emptyitemtext ;
   private String Combo_clicod2_Cls ;
   private String Combo_clicod2_Selectedvalue_set ;
   private String Combo_clicod2_Emptyitemtext ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Subfile1paginationbar_Class ;
   private String Subfile1paginationbar_Pagingbuttonsposition ;
   private String Subfile1paginationbar_Pagingcaptionposition ;
   private String Subfile1paginationbar_Emptygridclass ;
   private String Subfile1paginationbar_Rowsperpageoptions ;
   private String Subfile1paginationbar_Previous ;
   private String Subfile1paginationbar_Next ;
   private String Subfile1paginationbar_Caption ;
   private String Subfile1paginationbar_Emptygridcaption ;
   private String Subfile1paginationbar_Rowsperpagecaption ;
   private String Subfile2paginationbar_Class ;
   private String Subfile2paginationbar_Pagingbuttonsposition ;
   private String Subfile2paginationbar_Pagingcaptionposition ;
   private String Subfile2paginationbar_Emptygridclass ;
   private String Subfile2paginationbar_Rowsperpageoptions ;
   private String Subfile2paginationbar_Previous ;
   private String Subfile2paginationbar_Next ;
   private String Subfile2paginationbar_Caption ;
   private String Subfile2paginationbar_Emptygridcaption ;
   private String Subfile2paginationbar_Rowsperpagecaption ;
   private String Dvpanel_panel_resultado_Width ;
   private String Dvpanel_panel_resultado_Cls ;
   private String Dvpanel_panel_resultado_Title ;
   private String Dvpanel_panel_resultado_Iconposition ;
   private String Subfile1_empowerer_Gridinternalname ;
   private String Subfile2_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_panel_filtrosgenerales_Internalname ;
   private String divPanel_filtrosgenerales_Internalname ;
   private String divTable_filtrosgenerales_Internalname ;
   private String divTablesplittedclicod1_Internalname ;
   private String lblTextblockcombo_clicod1_Internalname ;
   private String lblTextblockcombo_clicod1_Jsonclick ;
   private String Combo_clicod1_Caption ;
   private String Combo_clicod1_Internalname ;
   private String divTablesplittedclicod2_Internalname ;
   private String lblTextblockcombo_clicod2_Internalname ;
   private String lblTextblockcombo_clicod2_Jsonclick ;
   private String Combo_clicod2_Caption ;
   private String Combo_clicod2_Internalname ;
   private String edtavFec3_Internalname ;
   private String TempTags ;
   private String edtavFec3_Jsonclick ;
   private String edtavFec4_Internalname ;
   private String edtavFec4_Jsonclick ;
   private String edtavArtcod_Internalname ;
   private String edtavArtcod_Jsonclick ;
   private String edtavBarcod1_Internalname ;
   private String edtavBarcod1_Jsonclick ;
   private String edtavBarcodreo1_Internalname ;
   private String edtavBarcodreo1_Jsonclick ;
   private String edtavBarcodpar1_Internalname ;
   private String edtavBarcodpar1_Jsonclick ;
   private String edtavSimulador_Internalname ;
   private String edtavSimulador_Jsonclick ;
   private String edtavBardisnum_Internalname ;
   private String edtavBardisnum_Jsonclick ;
   private String edtavBarmancod1_Internalname ;
   private String edtavBarmancod1_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtnexcel_Internalname ;
   private String bttBtnexcel_Jsonclick ;
   private String bttBtnpdf_Internalname ;
   private String bttBtnpdf_Jsonclick ;
   private String bttBtncsv_Internalname ;
   private String bttBtncsv_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divTable_progress_Internalname ;
   private String Progressbar_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String divSubfile1tablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subSubfile1_Internalname ;
   private String Subfile1paginationbar_Internalname ;
   private String divSubfile2tablewithpaginationbar_Internalname ;
   private String subSubfile2_Internalname ;
   private String Subfile2paginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV258Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicod1_Internalname ;
   private String edtavClicod1_Jsonclick ;
   private String edtavClicod2_Internalname ;
   private String edtavClicod2_Jsonclick ;
   private String edtavSubfile1currentpage_Internalname ;
   private String edtavSubfile1currentpage_Jsonclick ;
   private String edtavSubfile2currentpage_Internalname ;
   private String edtavSubfile2currentpage_Jsonclick ;
   private String Subfile1_empowerer_Internalname ;
   private String Subfile2_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavDetails_Internalname ;
   private String edtavClicod_Internalname ;
   private String AV49CliNom ;
   private String edtavClinom_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodpar_Internalname ;
   private String AV22BarEncCli ;
   private String edtavBarenccli_Internalname ;
   private String AV36BarSer ;
   private String edtavBarser_Internalname ;
   private String AV37BarSerDsc ;
   private String edtavBarserdsc_Internalname ;
   private String AV15BarColNom ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnum_Internalname ;
   private String edtavPrograma_Internalname ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarmtr_Internalname ;
   private String edtavCoste_p_Internalname ;
   private String edtavCostefab_Internalname ;
   private String edtavMargen_Internalname ;
   private String edtavTxtalb_Internalname ;
   private String edtavBarfecgen_Internalname ;
   private String edtavBarfecsal_Internalname ;
   private String AV41BarTipDis ;
   private String edtavBartipdis_Internalname ;
   private String edtavCostepold_Internalname ;
   private String edtavKilosppieza_Internalname ;
   private String AV25BarFasSec ;
   private String edtavBarfassec_Internalname ;
   private String edtavBarordlin_Internalname ;
   private String AV105FasDsc ;
   private String edtavFasdsc_Internalname ;
   private String edtavMaqcod_Internalname ;
   private String AV168MaqDsc ;
   private String edtavMaqdsc_Internalname ;
   private String edtavUnidades_Internalname ;
   private String edtavUnidadest_Internalname ;
   private String AV42BarUniMed ;
   private String edtavBarunimed_Internalname ;
   private String AV249Horlni_5 ;
   private String edtavHorlni_5_Internalname ;
   private String AV127HorFin_5 ;
   private String edtavHorfin_5_Internalname ;
   private String edtavBartierea_Internalname ;
   private String edtavTteo_Internalname ;
   private String edtavMaqcosmin_Internalname ;
   private String edtavMaqcoskg_Internalname ;
   private String edtavMaqcosfijo_Internalname ;
   private String edtavCoste_m_Internalname ;
   private String edtavCoste_tm_Internalname ;
   private String edtavTieteo_Internalname ;
   private String AV104FasCod ;
   private String edtavFascod_Internalname ;
   private String edtavCoste_p_k_Internalname ;
   private String edtavTeotixfi_Internalname ;
   private String edtavFomumcol_Internalname ;
   private String edtavBartipart_Internalname ;
   private String edtavGrdtipart_Internalname ;
   private String AV98EmprNom ;
   private String AV234UsurCod ;
   private String GXt_char1 ;
   private String edtavDetails_gximage ;
   private String lV7Artcod ;
   private String scmdbuf ;
   private String AV230Und ;
   private String A10045CliAct ;
   private String AV102FacBarPar ;
   private String GXv_char15[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char20[] ;
   private String GXv_char19[] ;
   private String GXv_char21[] ;
   private String AV44Ceros4 ;
   private String AV128HorIni ;
   private String AV129HorIni_5 ;
   private String AV126HorFin ;
   private String sGXsfl_111_fel_idx="0001" ;
   private String subSubfile1_Class ;
   private String subSubfile1_Linesclass ;
   private String sImgUrl ;
   private String edtavDetails_Jsonclick ;
   private String ROClassString ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Jsonclick ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavBarenccli_Jsonclick ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserdsc_Jsonclick ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Jsonclick ;
   private String edtavPrograma_Jsonclick ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarmtr_Jsonclick ;
   private String edtavCoste_p_Jsonclick ;
   private String edtavCostefab_Jsonclick ;
   private String edtavValor_Jsonclick ;
   private String edtavMargen_Jsonclick ;
   private String edtavTxtalb_Jsonclick ;
   private String edtavBarfecgen_Jsonclick ;
   private String edtavBarfecsal_Jsonclick ;
   private String edtavBartipdis_Jsonclick ;
   private String edtavCostepold_Jsonclick ;
   private String edtavKilosppieza_Jsonclick ;
   private String sGXsfl_144_fel_idx="0001" ;
   private String subSubfile2_Class ;
   private String subSubfile2_Linesclass ;
   private String edtavBarfassec_Jsonclick ;
   private String edtavBarordlin_Jsonclick ;
   private String edtavFasdsc_Jsonclick ;
   private String edtavMaqcod_Jsonclick ;
   private String edtavMaqdsc_Jsonclick ;
   private String edtavUnidades_Jsonclick ;
   private String edtavUnidadest_Jsonclick ;
   private String edtavBarunimed_Jsonclick ;
   private String edtavHorlni_5_Jsonclick ;
   private String edtavHorfin_5_Jsonclick ;
   private String edtavBartierea_Jsonclick ;
   private String edtavTteo_Jsonclick ;
   private String edtavMaqcosmin_Jsonclick ;
   private String edtavMaqcoskg_Jsonclick ;
   private String edtavMaqcosfijo_Jsonclick ;
   private String edtavCoste_m_Jsonclick ;
   private String edtavCoste_tm_Jsonclick ;
   private String edtavTieteo_Jsonclick ;
   private String edtavFascod_Jsonclick ;
   private String edtavCoste_p_k_Jsonclick ;
   private String edtavTeotixfi_Jsonclick ;
   private String edtavFomumcol_Jsonclick ;
   private String edtavBartipart_Jsonclick ;
   private String edtavGrdtipart_Jsonclick ;
   private String subSubfile1_Header ;
   private String subSubfile2_Header ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV109Fec3 ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV110Fec4 ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV107fec1 ;
   private java.util.Date AV108Fec2 ;
   private java.util.Date AV112fecteo ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV26BarFecGen ;
   private java.util.Date AV27BarFecSal ;
   private java.util.Date Gx_date ;
   private java.util.Date GXv_date18[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_111_Refreshing=false ;
   private boolean n252CliCod ;
   private boolean n3275BarKgsAut ;
   private boolean n3276BarMtsAut ;
   private boolean n3837BarFasKgm ;
   private boolean n5719BarFasKgT ;
   private boolean n6173BarFasSec ;
   private boolean n5168FasPreMC ;
   private boolean n5720BarFasMtT ;
   private boolean n3838BarFasMtr ;
   private boolean n217BarTipArt ;
   private boolean n605MaqCosMin ;
   private boolean n13180MaqCosKg ;
   private boolean n13179MaqCosFijo ;
   private boolean n606MaqDsc ;
   private boolean n1011TipMaqCod ;
   private boolean n656ParCod ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean Subfile1paginationbar_Showfirst ;
   private boolean Subfile1paginationbar_Showprevious ;
   private boolean Subfile1paginationbar_Shownext ;
   private boolean Subfile1paginationbar_Showlast ;
   private boolean Subfile1paginationbar_Rowsperpageselector ;
   private boolean Subfile2paginationbar_Showfirst ;
   private boolean Subfile2paginationbar_Showprevious ;
   private boolean Subfile2paginationbar_Shownext ;
   private boolean Subfile2paginationbar_Showlast ;
   private boolean Subfile2paginationbar_Rowsperpageselector ;
   private boolean Dvpanel_panel_resultado_Autowidth ;
   private boolean Dvpanel_panel_resultado_Autoheight ;
   private boolean Dvpanel_panel_resultado_Collapsible ;
   private boolean Dvpanel_panel_resultado_Collapsed ;
   private boolean Dvpanel_panel_resultado_Showcollapseicon ;
   private boolean Dvpanel_panel_resultado_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_144_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean Cond_result ;
   private boolean AV254Details_IsBlob ;
   private String AV259Details_GXI ;
   private String AV227TxtAlb ;
   private String A13735CliCNom ;
   private String AV115File1 ;
   private String AV51Control ;
   private String AV254Details ;
   private com.genexus.webpanels.GXWebGrid Subfile1Container ;
   private com.genexus.webpanels.GXWebGrid Subfile2Container ;
   private com.genexus.webpanels.GXWebRow Subfile1Row ;
   private com.genexus.webpanels.GXWebRow Subfile2Row ;
   private com.genexus.webpanels.GXWebColumn Subfile1Column ;
   private com.genexus.webpanels.GXWebColumn Subfile2Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod2 ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucSubfile1paginationbar ;
   private com.genexus.webpanels.GXUserControl ucSubfile2paginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucSubfile1_empowerer ;
   private com.genexus.webpanels.GXUserControl ucSubfile2_empowerer ;
   private IDataStoreProvider pr_default ;
   private String[] H02CY3_A396EmprCod ;
   private String[] H02CY3_A130BarCodPar ;
   private byte[] H02CY3_A132BarCodReo ;
   private int[] H02CY3_A129BarCod ;
   private String[] H02CY3_A143BarDisNum ;
   private short[] H02CY3_A3311BarManCod1 ;
   private java.util.Date[] H02CY3_A161BarFecSal ;
   private String[] H02CY3_A212BarSer ;
   private java.util.Date[] H02CY3_A159BarFecGen ;
   private int[] H02CY3_A252CliCod ;
   private boolean[] H02CY3_n252CliCod ;
   private String[] H02CY3_A2010BarTipDis ;
   private String[] H02CY3_A1652BarSerDsc ;
   private String[] H02CY3_A135BarColNom ;
   private int[] H02CY3_A136BarColNum ;
   private byte[] H02CY3_A218BarTipCol ;
   private java.math.BigDecimal[] H02CY3_A141BarCosPro ;
   private java.math.BigDecimal[] H02CY3_A140BarCosAny ;
   private String[] H02CY3_A279CliNom ;
   private String[] H02CY3_A228BarUniMed ;
   private String[] H02CY3_A4812BarEncCli ;
   private java.math.BigDecimal[] H02CY3_A184BarMtr ;
   private java.math.BigDecimal[] H02CY3_A166BarKgm ;
   private String[] H02CY4_A396EmprCod ;
   private String[] H02CY4_A10045CliAct ;
   private String[] H02CY4_A13735CliCNom ;
   private int[] H02CY4_A252CliCod ;
   private boolean[] H02CY4_n252CliCod ;
   private String[] H02CY4_A279CliNom ;
   private String[] H02CY5_A396EmprCod ;
   private String[] H02CY5_A10045CliAct ;
   private String[] H02CY5_A13735CliCNom ;
   private int[] H02CY5_A252CliCod ;
   private boolean[] H02CY5_n252CliCod ;
   private String[] H02CY5_A279CliNom ;
   private String[] H02CY6_A130BarCodPar ;
   private byte[] H02CY6_A132BarCodReo ;
   private int[] H02CY6_A129BarCod ;
   private long[] H02CY6_A30AlbProCod ;
   private String[] H02CY6_A396EmprCod ;
   private byte[] H02CY6_A32AlbProEsp ;
   private java.math.BigDecimal[] H02CY6_A1264BarPreMtr ;
   private java.math.BigDecimal[] H02CY6_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] H02CY6_A1262BarPreKgm ;
   private java.math.BigDecimal[] H02CY6_A1261BarAlbKgmE ;
   private short[] H02CY7_A1240GuiFasLin ;
   private String[] H02CY7_A396EmprCod ;
   private long[] H02CY7_A30AlbProCod ;
   private int[] H02CY7_A129BarCod ;
   private byte[] H02CY7_A132BarCodReo ;
   private String[] H02CY7_A130BarCodPar ;
   private java.math.BigDecimal[] H02CY7_A1242GuiFasPMt ;
   private java.math.BigDecimal[] H02CY7_A1276FasMtr ;
   private java.math.BigDecimal[] H02CY7_A1241GuiFasPKg ;
   private java.math.BigDecimal[] H02CY7_A1275FasKgm ;
   private int[] H02CY8_A446FacLin ;
   private String[] H02CY8_A1296FacBarPar ;
   private byte[] H02CY8_A1295FacBarReo ;
   private int[] H02CY8_A1294FacBarCod ;
   private String[] H02CY8_A396EmprCod ;
   private int[] H02CY8_A430FacCod ;
   private String[] H02CY9_A602MaqCod ;
   private byte[] H02CY9_A556HisProEst ;
   private short[] H02CY9_A656ParCod ;
   private boolean[] H02CY9_n656ParCod ;
   private short[] H02CY9_A194BarOrdLin ;
   private String[] H02CY9_A130BarCodPar ;
   private byte[] H02CY9_A132BarCodReo ;
   private int[] H02CY9_A129BarCod ;
   private String[] H02CY9_A396EmprCod ;
   private int[] H02CY9_A561HisProLin ;
   private java.util.Date[] H02CY9_A558HisProFec ;
   private java.util.Date[] H02CY9_A4440HisProDTI ;
   private boolean[] H02CY9_n4440HisProDTI ;
   private java.util.Date[] H02CY9_A4441HisProDTF ;
   private boolean[] H02CY9_n4441HisProDTF ;
   private short[] H02CY10_A829TipArtCod ;
   private String[] H02CY10_A396EmprCod ;
   private short[] H02CY10_A4364GrdTipArt ;
   private String[] H02CY11_A602MaqCod ;
   private String[] H02CY11_A396EmprCod ;
   private java.math.BigDecimal[] H02CY11_A605MaqCosMin ;
   private boolean[] H02CY11_n605MaqCosMin ;
   private java.math.BigDecimal[] H02CY11_A13180MaqCosKg ;
   private boolean[] H02CY11_n13180MaqCosKg ;
   private java.math.BigDecimal[] H02CY11_A13179MaqCosFijo ;
   private boolean[] H02CY11_n13179MaqCosFijo ;
   private String[] H02CY11_A606MaqDsc ;
   private boolean[] H02CY11_n606MaqDsc ;
   private String[] H02CY11_A1011TipMaqCod ;
   private boolean[] H02CY11_n1011TipMaqCod ;
   private java.math.BigDecimal[] H02CY12_A203BarPieKil ;
   private java.math.BigDecimal[] H02CY12_A205BarPieMet ;
   private java.math.BigDecimal[] H02CY13_A3275BarKgsAut ;
   private boolean[] H02CY13_n3275BarKgsAut ;
   private java.math.BigDecimal[] H02CY13_A3276BarMtsAut ;
   private boolean[] H02CY13_n3276BarMtsAut ;
   private String[] H02CY15_A130BarCodPar ;
   private byte[] H02CY15_A132BarCodReo ;
   private int[] H02CY15_A129BarCod ;
   private String[] H02CY15_A396EmprCod ;
   private String[] H02CY15_A457FasCod ;
   private String[] H02CY15_A603MaqCodBis ;
   private String[] H02CY15_A460FasDsc ;
   private String[] H02CY15_A228BarUniMed ;
   private java.math.BigDecimal[] H02CY15_A3837BarFasKgm ;
   private boolean[] H02CY15_n3837BarFasKgm ;
   private java.math.BigDecimal[] H02CY15_A5719BarFasKgT ;
   private boolean[] H02CY15_n5719BarFasKgT ;
   private String[] H02CY15_A6173BarFasSec ;
   private boolean[] H02CY15_n6173BarFasSec ;
   private short[] H02CY15_A5168FasPreMC ;
   private boolean[] H02CY15_n5168FasPreMC ;
   private java.math.BigDecimal[] H02CY15_A215BarTieRea ;
   private java.math.BigDecimal[] H02CY15_A5720BarFasMtT ;
   private boolean[] H02CY15_n5720BarFasMtT ;
   private java.math.BigDecimal[] H02CY15_A3838BarFasMtr ;
   private boolean[] H02CY15_n3838BarFasMtr ;
   private java.math.BigDecimal[] H02CY15_A216BarTieTeo ;
   private int[] H02CY15_A252CliCod ;
   private boolean[] H02CY15_n252CliCod ;
   private String[] H02CY15_A212BarSer ;
   private String[] H02CY15_A135BarColNom ;
   private int[] H02CY15_A136BarColNum ;
   private byte[] H02CY15_A218BarTipCol ;
   private short[] H02CY15_A217BarTipArt ;
   private boolean[] H02CY15_n217BarTipArt ;
   private String[] H02CY15_A150BarFacTin ;
   private short[] H02CY15_A165BarHorIni ;
   private short[] H02CY15_A164BarHorFin ;
   private short[] H02CY15_A194BarOrdLin ;
   private String[] H02CY15_A758ProCod ;
   private java.math.BigDecimal[] H02CY15_A166BarKgm ;
   private java.math.BigDecimal[] H02CY15_A184BarMtr ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV245Clicod1_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV247Clicod2_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV246Combo_DataItem ;
}

final  class analisecustoww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02CY3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarManCod1, T1.BarFecSal, T1.BarSer, T1.BarFecGen, T1.CliCod, T1.BarTipDis, T1.BarSerDsc, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarCosPro, T1.BarCosAny, T3.CliNom, T1.BarUniMed, T1.BarEncCli, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.BarFecGen >= ?) AND (T1.BarFecGen <= ?) AND (T1.BarSer like ?) AND (T1.BarFecSal >= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD'))) AND (T1.BarFecSal <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD'))) AND (COALESCE( T2.BarKgm, 0) > 0 or COALESCE( T2.BarMtr, 0) > 0) AND (T1.BarManCod1 = ? or (? = 0)) AND (T1.BarDisNum = ? or (rtrim(?) IS NULL)) AND (T1.BarCod = ? or (? = 0)) AND (T1.BarCodReo = ? or (? = 0)) AND (T1.BarCodPar = ? or (rtrim(?) IS NULL)) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.BarFecGen ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02CY4", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02CY5", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02CY6", "SELECT BarCodPar, BarCodReo, BarCod, AlbProCod, EmprCod, AlbProEsp, BarPreMtr, BarAlbMtrE, BarPreKgm, BarAlbKgmE FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02CY7", "SELECT GuiFasLin, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasPMt, FasMtr, GuiFasPKg, FasKgm FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02CY8", "SELECT FacLin, FacBarPar, FacBarReo, FacBarCod, EmprCod, FacCod FROM TXPLFAVEN WHERE EmprCod = ? and FacBarCod = ? and FacBarReo = ? and FacBarPar = ? ORDER BY EmprCod, FacBarCod, FacBarReo, FacBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02CY9", "SELECT MaqCod, HisProEst, ParCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, HisProLin, HisProFec, HisProDTI, HisProDTF FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) AND (ParCod = 0) AND (HisProEst = 1) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02CY10", "SELECT TipArtCod, EmprCod, GrdTipArt FROM TXPGRDTI1 WHERE (EmprCod = ?) AND (TipArtCod = ?) ORDER BY EmprCod, GrdTipArt, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02CY11", "SELECT MaqCod, EmprCod, MaqCosMin, MaqCosKg, MaqCosFijo, MaqDsc, TipMaqCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02CY12", "SELECT SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02CY13", "SELECT SUM(BarKgsAut), SUM(BarMtsAut) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02CY15", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.FasCod, T1.MaqCodBis, T4.FasDsc, T2.BarUniMed, T1.BarFasKgm, T1.BarFasKgT, T1.BarFasSec, T4.FasPreMC, T1.BarTieRea, T1.BarFasMtT, T1.BarFasMtr, T1.BarTieTeo, T2.CliCod, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T2.BarTipArt, T1.BarFacTin, T1.BarHorIni, T1.BarHorFin, T1.BarOrdLin, T1.ProCod, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr FROM (((TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) INNER JOIN TXPFASPRO T4 ON T4.EmprCod = T1.EmprCod AND T4.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 30);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((String[]) buf[20])[0] = rslt.getString(20, 20);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,2);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(18, 16);
               ((String[]) buf[25])[0] = rslt.getString(19, 13);
               ((int[]) buf[26])[0] = rslt.getInt(20);
               ((byte[]) buf[27])[0] = rslt.getByte(21);
               ((short[]) buf[28])[0] = rslt.getShort(22);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(23, 1);
               ((short[]) buf[31])[0] = rslt.getShort(24);
               ((short[]) buf[32])[0] = rslt.getShort(25);
               ((short[]) buf[33])[0] = rslt.getShort(26);
               ((String[]) buf[34])[0] = rslt.getString(27, 8);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(28,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(29,2);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setDate(9, (java.util.Date)parms[8]);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setString(12, (String)parms[11], 8);
               stmt.setString(13, (String)parms[12], 8);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setString(18, (String)parms[17], 1);
               stmt.setString(19, (String)parms[18], 1);
               stmt.setInt(20, ((Number) parms[19]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

