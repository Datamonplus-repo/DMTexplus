package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_20_prc extends GXProcedure
{
   public documentodetransporteproduccion_20_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_20_prc.class ), "" );
   }

   public documentodetransporteproduccion_20_prc( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           long aP1 ,
                                           int aP2 ,
                                           byte aP3 ,
                                           String aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           short[] aP6 ,
                                           short[] aP7 ,
                                           java.math.BigDecimal[] aP8 ,
                                           int[] aP9 ,
                                           short[] aP10 ,
                                           int[] aP11 ,
                                           String[] aP12 ,
                                           byte[] aP13 ,
                                           String[] aP14 ,
                                           byte[] aP15 ,
                                           String[] aP16 ,
                                           int[] aP17 ,
                                           String[] aP18 ,
                                           String[] aP19 ,
                                           short[] aP20 ,
                                           byte[] aP21 ,
                                           int[] aP22 ,
                                           String[] aP23 ,
                                           String[] aP24 ,
                                           short[] aP25 ,
                                           short[] aP26 ,
                                           java.math.BigDecimal[] aP27 ,
                                           java.math.BigDecimal[] aP28 ,
                                           java.math.BigDecimal[] aP29 ,
                                           int[] aP30 ,
                                           String[] aP31 ,
                                           int[] aP32 ,
                                           String[] aP33 ,
                                           String aP34 ,
                                           int[] aP35 ,
                                           String[] aP36 ,
                                           int[] aP37 )
   {
      documentodetransporteproduccion_20_prc.this.aP38 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38);
      return aP38[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 ,
                        short[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        int[] aP9 ,
                        short[] aP10 ,
                        int[] aP11 ,
                        String[] aP12 ,
                        byte[] aP13 ,
                        String[] aP14 ,
                        byte[] aP15 ,
                        String[] aP16 ,
                        int[] aP17 ,
                        String[] aP18 ,
                        String[] aP19 ,
                        short[] aP20 ,
                        byte[] aP21 ,
                        int[] aP22 ,
                        String[] aP23 ,
                        String[] aP24 ,
                        short[] aP25 ,
                        short[] aP26 ,
                        java.math.BigDecimal[] aP27 ,
                        java.math.BigDecimal[] aP28 ,
                        java.math.BigDecimal[] aP29 ,
                        int[] aP30 ,
                        String[] aP31 ,
                        int[] aP32 ,
                        String[] aP33 ,
                        String aP34 ,
                        int[] aP35 ,
                        String[] aP36 ,
                        int[] aP37 ,
                        java.math.BigDecimal[] aP38 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 ,
                             short[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             int[] aP9 ,
                             short[] aP10 ,
                             int[] aP11 ,
                             String[] aP12 ,
                             byte[] aP13 ,
                             String[] aP14 ,
                             byte[] aP15 ,
                             String[] aP16 ,
                             int[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             short[] aP20 ,
                             byte[] aP21 ,
                             int[] aP22 ,
                             String[] aP23 ,
                             String[] aP24 ,
                             short[] aP25 ,
                             short[] aP26 ,
                             java.math.BigDecimal[] aP27 ,
                             java.math.BigDecimal[] aP28 ,
                             java.math.BigDecimal[] aP29 ,
                             int[] aP30 ,
                             String[] aP31 ,
                             int[] aP32 ,
                             String[] aP33 ,
                             String aP34 ,
                             int[] aP35 ,
                             String[] aP36 ,
                             int[] aP37 ,
                             java.math.BigDecimal[] aP38 )
   {
      documentodetransporteproduccion_20_prc.this.AV8Emprcod = aP0;
      documentodetransporteproduccion_20_prc.this.AV9AlbProcod = aP1;
      documentodetransporteproduccion_20_prc.this.AV10barcod = aP2;
      documentodetransporteproduccion_20_prc.this.AV11Barcodreo = aP3;
      documentodetransporteproduccion_20_prc.this.AV12Barcodpar = aP4;
      documentodetransporteproduccion_20_prc.this.aP5 = aP5;
      documentodetransporteproduccion_20_prc.this.aP6 = aP6;
      documentodetransporteproduccion_20_prc.this.aP7 = aP7;
      documentodetransporteproduccion_20_prc.this.aP8 = aP8;
      documentodetransporteproduccion_20_prc.this.aP9 = aP9;
      documentodetransporteproduccion_20_prc.this.aP10 = aP10;
      documentodetransporteproduccion_20_prc.this.aP11 = aP11;
      documentodetransporteproduccion_20_prc.this.aP12 = aP12;
      documentodetransporteproduccion_20_prc.this.aP13 = aP13;
      documentodetransporteproduccion_20_prc.this.aP14 = aP14;
      documentodetransporteproduccion_20_prc.this.aP15 = aP15;
      documentodetransporteproduccion_20_prc.this.aP16 = aP16;
      documentodetransporteproduccion_20_prc.this.aP17 = aP17;
      documentodetransporteproduccion_20_prc.this.aP18 = aP18;
      documentodetransporteproduccion_20_prc.this.aP19 = aP19;
      documentodetransporteproduccion_20_prc.this.aP20 = aP20;
      documentodetransporteproduccion_20_prc.this.aP21 = aP21;
      documentodetransporteproduccion_20_prc.this.aP22 = aP22;
      documentodetransporteproduccion_20_prc.this.aP23 = aP23;
      documentodetransporteproduccion_20_prc.this.aP24 = aP24;
      documentodetransporteproduccion_20_prc.this.aP25 = aP25;
      documentodetransporteproduccion_20_prc.this.aP26 = aP26;
      documentodetransporteproduccion_20_prc.this.aP27 = aP27;
      documentodetransporteproduccion_20_prc.this.aP28 = aP28;
      documentodetransporteproduccion_20_prc.this.aP29 = aP29;
      documentodetransporteproduccion_20_prc.this.aP30 = aP30;
      documentodetransporteproduccion_20_prc.this.aP31 = aP31;
      documentodetransporteproduccion_20_prc.this.aP32 = aP32;
      documentodetransporteproduccion_20_prc.this.aP33 = aP33;
      documentodetransporteproduccion_20_prc.this.AV43albpropri = aP34;
      documentodetransporteproduccion_20_prc.this.aP35 = aP35;
      documentodetransporteproduccion_20_prc.this.aP36 = aP36;
      documentodetransporteproduccion_20_prc.this.aP37 = aP37;
      documentodetransporteproduccion_20_prc.this.aP38 = aP38;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33albbar = (short)(0) ;
      AV34Barcad = (short)(0) ;
      AV51GXLvl4 = (byte)(0) ;
      /* Using cursor P0AGD3 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Long.valueOf(AV9AlbProcod), Integer.valueOf(AV10barcod), Byte.valueOf(AV11Barcodreo), AV12Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0AGD3_A130BarCodPar[0] ;
         A132BarCodReo = P0AGD3_A132BarCodReo[0] ;
         A129BarCod = P0AGD3_A129BarCod[0] ;
         A30AlbProCod = P0AGD3_A30AlbProCod[0] ;
         A1261BarAlbKgmE = P0AGD3_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P0AGD3_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = P0AGD3_A1265BarAlbPie[0] ;
         A12195BarAlbUnd = P0AGD3_A12195BarAlbUnd[0] ;
         A3271AlbHdrAnc = P0AGD3_A3271AlbHdrAnc[0] ;
         A5019AlbHdrgm2 = P0AGD3_A5019AlbHdrgm2[0] ;
         A2839AlbProVal = P0AGD3_A2839AlbProVal[0] ;
         A1266BarAlbTub = P0AGD3_A1266BarAlbTub[0] ;
         A1206TubCod = P0AGD3_A1206TubCod[0] ;
         n1206TubCod = P0AGD3_n1206TubCod[0] ;
         A2441AlbHdrObs = P0AGD3_A2441AlbHdrObs[0] ;
         A148BarEstReo = P0AGD3_A148BarEstReo[0] ;
         A5291BarTipCor = P0AGD3_A5291BarTipCor[0] ;
         A213BarSit = P0AGD3_A213BarSit[0] ;
         A1234BarNomCli = P0AGD3_A1234BarNomCli[0] ;
         A1235BarNumCli = P0AGD3_A1235BarNumCli[0] ;
         A212BarSer = P0AGD3_A212BarSer[0] ;
         A1652BarSerDsc = P0AGD3_A1652BarSerDsc[0] ;
         A217BarTipArt = P0AGD3_A217BarTipArt[0] ;
         n217BarTipArt = P0AGD3_n217BarTipArt[0] ;
         A218BarTipCol = P0AGD3_A218BarTipCol[0] ;
         A252CliCod = P0AGD3_A252CliCod[0] ;
         n252CliCod = P0AGD3_n252CliCod[0] ;
         A135BarColNom = P0AGD3_A135BarColNom[0] ;
         A136BarColNum = P0AGD3_A136BarColNum[0] ;
         A228BarUniMed = P0AGD3_A228BarUniMed[0] ;
         A2010BarTipDis = P0AGD3_A2010BarTipDis[0] ;
         A166BarKgm = P0AGD3_A166BarKgm[0] ;
         A199BarPie1 = P0AGD3_A199BarPie1[0] ;
         A365DisDes = P0AGD3_A365DisDes[0] ;
         A898BarPieNDes = P0AGD3_A898BarPieNDes[0] ;
         A143BarDisNum = P0AGD3_A143BarDisNum[0] ;
         A4812BarEncCli = P0AGD3_A4812BarEncCli[0] ;
         A396EmprCod = P0AGD3_A396EmprCod[0] ;
         A148BarEstReo = P0AGD3_A148BarEstReo[0] ;
         A5291BarTipCor = P0AGD3_A5291BarTipCor[0] ;
         A213BarSit = P0AGD3_A213BarSit[0] ;
         A1234BarNomCli = P0AGD3_A1234BarNomCli[0] ;
         A1235BarNumCli = P0AGD3_A1235BarNumCli[0] ;
         A212BarSer = P0AGD3_A212BarSer[0] ;
         A1652BarSerDsc = P0AGD3_A1652BarSerDsc[0] ;
         A217BarTipArt = P0AGD3_A217BarTipArt[0] ;
         n217BarTipArt = P0AGD3_n217BarTipArt[0] ;
         A218BarTipCol = P0AGD3_A218BarTipCol[0] ;
         A252CliCod = P0AGD3_A252CliCod[0] ;
         n252CliCod = P0AGD3_n252CliCod[0] ;
         A135BarColNom = P0AGD3_A135BarColNom[0] ;
         A136BarColNum = P0AGD3_A136BarColNum[0] ;
         A228BarUniMed = P0AGD3_A228BarUniMed[0] ;
         A2010BarTipDis = P0AGD3_A2010BarTipDis[0] ;
         A365DisDes = P0AGD3_A365DisDes[0] ;
         A143BarDisNum = P0AGD3_A143BarDisNum[0] ;
         A4812BarEncCli = P0AGD3_A4812BarEncCli[0] ;
         A166BarKgm = P0AGD3_A166BarKgm[0] ;
         A199BarPie1 = P0AGD3_A199BarPie1[0] ;
         A898BarPieNDes = P0AGD3_A898BarPieNDes[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char5[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
         documentodetransporteproduccion_20_prc.this.A396EmprCod = GXv_char2[0] ;
         documentodetransporteproduccion_20_prc.this.A4812BarEncCli = GXv_char3[0] ;
         documentodetransporteproduccion_20_prc.this.A143BarDisNum = GXv_char4[0] ;
         documentodetransporteproduccion_20_prc.this.GXt_char1 = GXv_char5[0] ;
         A13878PedidoClie = GXt_char1 ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV51GXLvl4 = (byte)(1) ;
         AV13BarAlbKgmE = A1261BarAlbKgmE ;
         AV16BarAlbMtrE = A1263BarAlbMtrE ;
         AV17BarAlbPie = A1265BarAlbPie ;
         AV38BarAlbKgmEold = A1261BarAlbKgmE ;
         AV37BarAlbMtrEold = A1263BarAlbMtrE ;
         AV36BarAlbPieold = A1265BarAlbPie ;
         AV44BarAlbUnd = A12195BarAlbUnd ;
         AV14AlbHdrAnc = A3271AlbHdrAnc ;
         AV15AlbHdrgm2 = A5019AlbHdrgm2 ;
         AV20AlbProVal = A2839AlbProVal ;
         AV19BarAlbTub = A1266BarAlbTub ;
         AV18TubCod = A1206TubCod ;
         AV32AlbHdrObs = A2441AlbHdrObs ;
         if ( A148BarEstReo == 1 )
         {
            GXv_int6[0] = AV41Barestreoanterior ;
            new app.ncesrc(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int6) ;
            documentodetransporteproduccion_20_prc.this.AV41Barestreoanterior = GXv_int6[0] ;
            if ( AV41Barestreoanterior == 2 )
            {
               AV21BarEstReo = AV41Barestreoanterior ;
            }
            else
            {
               AV21BarEstReo = A148BarEstReo ;
            }
         }
         else
         {
            AV21BarEstReo = A148BarEstReo ;
         }
         AV22BarTipCor = A5291BarTipCor ;
         AV23Barsit = A213BarSit ;
         AV24BarNomCli = A1234BarNomCli ;
         AV25BarNumcli = A1235BarNumCli ;
         AV26BarSer = A212BarSer ;
         AV27Barserdsc = A1652BarSerDsc ;
         AV28BarTipArt = A217BarTipArt ;
         AV29BarTipCol = A218BarTipCol ;
         AV30CliCod = A252CliCod ;
         AV31BarEncCli = A13878PedidoClie ;
         AV35Barkgm = A166BarKgm ;
         AV47Barpie = A198BarPie ;
         AV39Barcolnom = A135BarColNom ;
         AV40Barcolnum = A136BarColNum ;
         AV42Barunimed = A228BarUniMed ;
         AV45Bartipdis = A2010BarTipDis ;
         AV48AlbPmpPza = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P0AGD4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A44AlbRecCod = P0AGD4_A44AlbRecCod[0] ;
            A203BarPieKil = P0AGD4_A203BarPieKil[0] ;
            A4290AlbPmPPza = P0AGD4_A4290AlbPmPPza[0] ;
            A200BarPieCod = P0AGD4_A200BarPieCod[0] ;
            A4290AlbPmPPza = P0AGD4_A4290AlbPmPPza[0] ;
            AV48AlbPmpPza = A4290AlbPmPPza ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV33albbar = (short)(1) ;
         AV34Barcad = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV51GXLvl4 == 0 )
      {
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV34Barcad = (short)(0) ;
      /* Using cursor P0AGD6 */
      pr_default.execute(2, new Object[] {AV8Emprcod, Integer.valueOf(AV10barcod), Byte.valueOf(AV11Barcodreo), AV12Barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = P0AGD6_A130BarCodPar[0] ;
         A132BarCodReo = P0AGD6_A132BarCodReo[0] ;
         A129BarCod = P0AGD6_A129BarCod[0] ;
         A125BarAncAca1 = P0AGD6_A125BarAncAca1[0] ;
         A1909BarGraAca = P0AGD6_A1909BarGraAca[0] ;
         A148BarEstReo = P0AGD6_A148BarEstReo[0] ;
         A5291BarTipCor = P0AGD6_A5291BarTipCor[0] ;
         A213BarSit = P0AGD6_A213BarSit[0] ;
         A1234BarNomCli = P0AGD6_A1234BarNomCli[0] ;
         A1235BarNumCli = P0AGD6_A1235BarNumCli[0] ;
         A212BarSer = P0AGD6_A212BarSer[0] ;
         A1652BarSerDsc = P0AGD6_A1652BarSerDsc[0] ;
         A217BarTipArt = P0AGD6_A217BarTipArt[0] ;
         n217BarTipArt = P0AGD6_n217BarTipArt[0] ;
         A218BarTipCol = P0AGD6_A218BarTipCol[0] ;
         A252CliCod = P0AGD6_A252CliCod[0] ;
         n252CliCod = P0AGD6_n252CliCod[0] ;
         A135BarColNom = P0AGD6_A135BarColNom[0] ;
         A136BarColNum = P0AGD6_A136BarColNum[0] ;
         A228BarUniMed = P0AGD6_A228BarUniMed[0] ;
         A2010BarTipDis = P0AGD6_A2010BarTipDis[0] ;
         A166BarKgm = P0AGD6_A166BarKgm[0] ;
         A199BarPie1 = P0AGD6_A199BarPie1[0] ;
         A365DisDes = P0AGD6_A365DisDes[0] ;
         A898BarPieNDes = P0AGD6_A898BarPieNDes[0] ;
         A143BarDisNum = P0AGD6_A143BarDisNum[0] ;
         A4812BarEncCli = P0AGD6_A4812BarEncCli[0] ;
         A396EmprCod = P0AGD6_A396EmprCod[0] ;
         A166BarKgm = P0AGD6_A166BarKgm[0] ;
         A199BarPie1 = P0AGD6_A199BarPie1[0] ;
         A898BarPieNDes = P0AGD6_A898BarPieNDes[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char3[0] = A143BarDisNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
         documentodetransporteproduccion_20_prc.this.A396EmprCod = GXv_char5[0] ;
         documentodetransporteproduccion_20_prc.this.A4812BarEncCli = GXv_char4[0] ;
         documentodetransporteproduccion_20_prc.this.A143BarDisNum = GXv_char3[0] ;
         documentodetransporteproduccion_20_prc.this.GXt_char1 = GXv_char2[0] ;
         A13878PedidoClie = GXt_char1 ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         GXt_decimal7 = AV13BarAlbKgmE ;
         GXv_decimal8[0] = GXt_decimal7 ;
         new app.kilosaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal8) ;
         documentodetransporteproduccion_20_prc.this.GXt_decimal7 = GXv_decimal8[0] ;
         AV13BarAlbKgmE = GXt_decimal7 ;
         GXt_int9 = AV17BarAlbPie ;
         GXv_int10[0] = GXt_int9 ;
         new app.piezasaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
         documentodetransporteproduccion_20_prc.this.GXt_int9 = GXv_int10[0] ;
         AV17BarAlbPie = GXt_int9 ;
         GXt_decimal7 = AV16BarAlbMtrE ;
         GXv_decimal8[0] = GXt_decimal7 ;
         new app.metrosaentregar(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal8) ;
         documentodetransporteproduccion_20_prc.this.GXt_decimal7 = GXv_decimal8[0] ;
         AV16BarAlbMtrE = GXt_decimal7 ;
         AV19BarAlbTub = AV17BarAlbPie ;
         AV44BarAlbUnd = AV17BarAlbPie ;
         AV14AlbHdrAnc = A125BarAncAca1 ;
         AV15AlbHdrgm2 = A1909BarGraAca ;
         AV18TubCod = (short)(0) ;
         AV20AlbProVal = ((GXutil.strcmp(AV43albpropri, "1")==0) ? "S" : "N") ;
         if ( A148BarEstReo == 1 )
         {
            GXv_int6[0] = AV41Barestreoanterior ;
            new app.ncesrc(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int6) ;
            documentodetransporteproduccion_20_prc.this.AV41Barestreoanterior = GXv_int6[0] ;
            if ( AV41Barestreoanterior == 2 )
            {
               AV21BarEstReo = AV41Barestreoanterior ;
            }
            else
            {
               AV21BarEstReo = A148BarEstReo ;
            }
         }
         else
         {
            AV21BarEstReo = A148BarEstReo ;
         }
         AV22BarTipCor = A5291BarTipCor ;
         AV23Barsit = A213BarSit ;
         AV24BarNomCli = A1234BarNomCli ;
         AV25BarNumcli = A1235BarNumCli ;
         AV26BarSer = A212BarSer ;
         AV27Barserdsc = A1652BarSerDsc ;
         AV28BarTipArt = A217BarTipArt ;
         AV29BarTipCol = A218BarTipCol ;
         AV30CliCod = A252CliCod ;
         AV31BarEncCli = A13878PedidoClie ;
         AV32AlbHdrObs = "" ;
         AV35Barkgm = A166BarKgm ;
         AV47Barpie = A198BarPie ;
         AV39Barcolnom = A135BarColNom ;
         AV40Barcolnum = A136BarColNum ;
         AV42Barunimed = A228BarUniMed ;
         AV45Bartipdis = A2010BarTipDis ;
         AV38BarAlbKgmEold = DecimalUtil.ZERO ;
         AV37BarAlbMtrEold = DecimalUtil.ZERO ;
         AV36BarAlbPieold = 0 ;
         AV34Barcad = (short)(1) ;
         AV48AlbPmpPza = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P0AGD7 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A44AlbRecCod = P0AGD7_A44AlbRecCod[0] ;
            A203BarPieKil = P0AGD7_A203BarPieKil[0] ;
            A4290AlbPmPPza = P0AGD7_A4290AlbPmPPza[0] ;
            A200BarPieCod = P0AGD7_A200BarPieCod[0] ;
            A4290AlbPmPPza = P0AGD7_A4290AlbPmPPza[0] ;
            AV48AlbPmpPza = A4290AlbPmPPza ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP5[0] = documentodetransporteproduccion_20_prc.this.AV13BarAlbKgmE;
      this.aP6[0] = documentodetransporteproduccion_20_prc.this.AV14AlbHdrAnc;
      this.aP7[0] = documentodetransporteproduccion_20_prc.this.AV15AlbHdrgm2;
      this.aP8[0] = documentodetransporteproduccion_20_prc.this.AV16BarAlbMtrE;
      this.aP9[0] = documentodetransporteproduccion_20_prc.this.AV17BarAlbPie;
      this.aP10[0] = documentodetransporteproduccion_20_prc.this.AV18TubCod;
      this.aP11[0] = documentodetransporteproduccion_20_prc.this.AV19BarAlbTub;
      this.aP12[0] = documentodetransporteproduccion_20_prc.this.AV20AlbProVal;
      this.aP13[0] = documentodetransporteproduccion_20_prc.this.AV21BarEstReo;
      this.aP14[0] = documentodetransporteproduccion_20_prc.this.AV22BarTipCor;
      this.aP15[0] = documentodetransporteproduccion_20_prc.this.AV23Barsit;
      this.aP16[0] = documentodetransporteproduccion_20_prc.this.AV24BarNomCli;
      this.aP17[0] = documentodetransporteproduccion_20_prc.this.AV25BarNumcli;
      this.aP18[0] = documentodetransporteproduccion_20_prc.this.AV26BarSer;
      this.aP19[0] = documentodetransporteproduccion_20_prc.this.AV27Barserdsc;
      this.aP20[0] = documentodetransporteproduccion_20_prc.this.AV28BarTipArt;
      this.aP21[0] = documentodetransporteproduccion_20_prc.this.AV29BarTipCol;
      this.aP22[0] = documentodetransporteproduccion_20_prc.this.AV30CliCod;
      this.aP23[0] = documentodetransporteproduccion_20_prc.this.AV31BarEncCli;
      this.aP24[0] = documentodetransporteproduccion_20_prc.this.AV32AlbHdrObs;
      this.aP25[0] = documentodetransporteproduccion_20_prc.this.AV34Barcad;
      this.aP26[0] = documentodetransporteproduccion_20_prc.this.AV33albbar;
      this.aP27[0] = documentodetransporteproduccion_20_prc.this.AV35Barkgm;
      this.aP28[0] = documentodetransporteproduccion_20_prc.this.AV38BarAlbKgmEold;
      this.aP29[0] = documentodetransporteproduccion_20_prc.this.AV37BarAlbMtrEold;
      this.aP30[0] = documentodetransporteproduccion_20_prc.this.AV36BarAlbPieold;
      this.aP31[0] = documentodetransporteproduccion_20_prc.this.AV39Barcolnom;
      this.aP32[0] = documentodetransporteproduccion_20_prc.this.AV40Barcolnum;
      this.aP33[0] = documentodetransporteproduccion_20_prc.this.AV42Barunimed;
      this.aP35[0] = documentodetransporteproduccion_20_prc.this.AV44BarAlbUnd;
      this.aP36[0] = documentodetransporteproduccion_20_prc.this.AV45Bartipdis;
      this.aP37[0] = documentodetransporteproduccion_20_prc.this.AV47Barpie;
      this.aP38[0] = documentodetransporteproduccion_20_prc.this.AV48AlbPmpPza;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13BarAlbKgmE = DecimalUtil.ZERO ;
      AV16BarAlbMtrE = DecimalUtil.ZERO ;
      AV20AlbProVal = "" ;
      AV22BarTipCor = "" ;
      AV24BarNomCli = "" ;
      AV26BarSer = "" ;
      AV27Barserdsc = "" ;
      AV31BarEncCli = "" ;
      AV32AlbHdrObs = "" ;
      AV35Barkgm = DecimalUtil.ZERO ;
      AV38BarAlbKgmEold = DecimalUtil.ZERO ;
      AV37BarAlbMtrEold = DecimalUtil.ZERO ;
      AV39Barcolnom = "" ;
      AV42Barunimed = "" ;
      AV45Bartipdis = "" ;
      AV48AlbPmpPza = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AGD3_A130BarCodPar = new String[] {""} ;
      P0AGD3_A132BarCodReo = new byte[1] ;
      P0AGD3_A129BarCod = new int[1] ;
      P0AGD3_A30AlbProCod = new long[1] ;
      P0AGD3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGD3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGD3_A1265BarAlbPie = new int[1] ;
      P0AGD3_A12195BarAlbUnd = new int[1] ;
      P0AGD3_A3271AlbHdrAnc = new short[1] ;
      P0AGD3_A5019AlbHdrgm2 = new short[1] ;
      P0AGD3_A2839AlbProVal = new String[] {""} ;
      P0AGD3_A1266BarAlbTub = new int[1] ;
      P0AGD3_A1206TubCod = new short[1] ;
      P0AGD3_n1206TubCod = new boolean[] {false} ;
      P0AGD3_A2441AlbHdrObs = new String[] {""} ;
      P0AGD3_A148BarEstReo = new byte[1] ;
      P0AGD3_A5291BarTipCor = new String[] {""} ;
      P0AGD3_A213BarSit = new byte[1] ;
      P0AGD3_A1234BarNomCli = new String[] {""} ;
      P0AGD3_A1235BarNumCli = new int[1] ;
      P0AGD3_A212BarSer = new String[] {""} ;
      P0AGD3_A1652BarSerDsc = new String[] {""} ;
      P0AGD3_A217BarTipArt = new short[1] ;
      P0AGD3_n217BarTipArt = new boolean[] {false} ;
      P0AGD3_A218BarTipCol = new byte[1] ;
      P0AGD3_A252CliCod = new int[1] ;
      P0AGD3_n252CliCod = new boolean[] {false} ;
      P0AGD3_A135BarColNom = new String[] {""} ;
      P0AGD3_A136BarColNum = new int[1] ;
      P0AGD3_A228BarUniMed = new String[] {""} ;
      P0AGD3_A2010BarTipDis = new String[] {""} ;
      P0AGD3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGD3_A199BarPie1 = new short[1] ;
      P0AGD3_A365DisDes = new String[] {""} ;
      P0AGD3_A898BarPieNDes = new int[1] ;
      P0AGD3_A143BarDisNum = new String[] {""} ;
      P0AGD3_A4812BarEncCli = new String[] {""} ;
      P0AGD3_A396EmprCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2839AlbProVal = "" ;
      A2441AlbHdrObs = "" ;
      A5291BarTipCor = "" ;
      A1234BarNomCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A228BarUniMed = "" ;
      A2010BarTipDis = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A396EmprCod = "" ;
      A13878PedidoClie = "" ;
      P0AGD4_A44AlbRecCod = new int[1] ;
      P0AGD4_A396EmprCod = new String[] {""} ;
      P0AGD4_A129BarCod = new int[1] ;
      P0AGD4_A132BarCodReo = new byte[1] ;
      P0AGD4_A130BarCodPar = new String[] {""} ;
      P0AGD4_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGD4_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGD4_A200BarPieCod = new String[] {""} ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      P0AGD6_A130BarCodPar = new String[] {""} ;
      P0AGD6_A132BarCodReo = new byte[1] ;
      P0AGD6_A129BarCod = new int[1] ;
      P0AGD6_A125BarAncAca1 = new short[1] ;
      P0AGD6_A1909BarGraAca = new short[1] ;
      P0AGD6_A148BarEstReo = new byte[1] ;
      P0AGD6_A5291BarTipCor = new String[] {""} ;
      P0AGD6_A213BarSit = new byte[1] ;
      P0AGD6_A1234BarNomCli = new String[] {""} ;
      P0AGD6_A1235BarNumCli = new int[1] ;
      P0AGD6_A212BarSer = new String[] {""} ;
      P0AGD6_A1652BarSerDsc = new String[] {""} ;
      P0AGD6_A217BarTipArt = new short[1] ;
      P0AGD6_n217BarTipArt = new boolean[] {false} ;
      P0AGD6_A218BarTipCol = new byte[1] ;
      P0AGD6_A252CliCod = new int[1] ;
      P0AGD6_n252CliCod = new boolean[] {false} ;
      P0AGD6_A135BarColNom = new String[] {""} ;
      P0AGD6_A136BarColNum = new int[1] ;
      P0AGD6_A228BarUniMed = new String[] {""} ;
      P0AGD6_A2010BarTipDis = new String[] {""} ;
      P0AGD6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGD6_A199BarPie1 = new short[1] ;
      P0AGD6_A365DisDes = new String[] {""} ;
      P0AGD6_A898BarPieNDes = new int[1] ;
      P0AGD6_A143BarDisNum = new String[] {""} ;
      P0AGD6_A4812BarEncCli = new String[] {""} ;
      P0AGD6_A396EmprCod = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXt_decimal7 = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int6 = new byte[1] ;
      P0AGD7_A44AlbRecCod = new int[1] ;
      P0AGD7_A396EmprCod = new String[] {""} ;
      P0AGD7_A129BarCod = new int[1] ;
      P0AGD7_A132BarCodReo = new byte[1] ;
      P0AGD7_A130BarCodPar = new String[] {""} ;
      P0AGD7_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGD7_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGD7_A200BarPieCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_20_prc__default(),
         new Object[] {
             new Object[] {
            P0AGD3_A130BarCodPar, P0AGD3_A132BarCodReo, P0AGD3_A129BarCod, P0AGD3_A30AlbProCod, P0AGD3_A1261BarAlbKgmE, P0AGD3_A1263BarAlbMtrE, P0AGD3_A1265BarAlbPie, P0AGD3_A12195BarAlbUnd, P0AGD3_A3271AlbHdrAnc, P0AGD3_A5019AlbHdrgm2,
            P0AGD3_A2839AlbProVal, P0AGD3_A1266BarAlbTub, P0AGD3_A1206TubCod, P0AGD3_n1206TubCod, P0AGD3_A2441AlbHdrObs, P0AGD3_A148BarEstReo, P0AGD3_A5291BarTipCor, P0AGD3_A213BarSit, P0AGD3_A1234BarNomCli, P0AGD3_A1235BarNumCli,
            P0AGD3_A212BarSer, P0AGD3_A1652BarSerDsc, P0AGD3_A217BarTipArt, P0AGD3_n217BarTipArt, P0AGD3_A218BarTipCol, P0AGD3_A252CliCod, P0AGD3_n252CliCod, P0AGD3_A135BarColNom, P0AGD3_A136BarColNum, P0AGD3_A228BarUniMed,
            P0AGD3_A2010BarTipDis, P0AGD3_A166BarKgm, P0AGD3_A199BarPie1, P0AGD3_A365DisDes, P0AGD3_A898BarPieNDes, P0AGD3_A143BarDisNum, P0AGD3_A4812BarEncCli, P0AGD3_A396EmprCod
            }
            , new Object[] {
            P0AGD4_A44AlbRecCod, P0AGD4_A396EmprCod, P0AGD4_A129BarCod, P0AGD4_A132BarCodReo, P0AGD4_A130BarCodPar, P0AGD4_A203BarPieKil, P0AGD4_A4290AlbPmPPza, P0AGD4_A200BarPieCod
            }
            , new Object[] {
            P0AGD6_A130BarCodPar, P0AGD6_A132BarCodReo, P0AGD6_A129BarCod, P0AGD6_A125BarAncAca1, P0AGD6_A1909BarGraAca, P0AGD6_A148BarEstReo, P0AGD6_A5291BarTipCor, P0AGD6_A213BarSit, P0AGD6_A1234BarNomCli, P0AGD6_A1235BarNumCli,
            P0AGD6_A212BarSer, P0AGD6_A1652BarSerDsc, P0AGD6_A217BarTipArt, P0AGD6_n217BarTipArt, P0AGD6_A218BarTipCol, P0AGD6_A252CliCod, P0AGD6_n252CliCod, P0AGD6_A135BarColNom, P0AGD6_A136BarColNum, P0AGD6_A228BarUniMed,
            P0AGD6_A2010BarTipDis, P0AGD6_A166BarKgm, P0AGD6_A199BarPie1, P0AGD6_A365DisDes, P0AGD6_A898BarPieNDes, P0AGD6_A143BarDisNum, P0AGD6_A4812BarEncCli, P0AGD6_A396EmprCod
            }
            , new Object[] {
            P0AGD7_A44AlbRecCod, P0AGD7_A396EmprCod, P0AGD7_A129BarCod, P0AGD7_A132BarCodReo, P0AGD7_A130BarCodPar, P0AGD7_A203BarPieKil, P0AGD7_A4290AlbPmPPza, P0AGD7_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Barcodreo ;
   private byte AV21BarEstReo ;
   private byte AV23Barsit ;
   private byte AV29BarTipCol ;
   private byte AV51GXLvl4 ;
   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte AV41Barestreoanterior ;
   private byte GXv_int6[] ;
   private short AV14AlbHdrAnc ;
   private short AV15AlbHdrgm2 ;
   private short AV18TubCod ;
   private short AV28BarTipArt ;
   private short AV34Barcad ;
   private short AV33albbar ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A1206TubCod ;
   private short A217BarTipArt ;
   private short A199BarPie1 ;
   private short A125BarAncAca1 ;
   private short A1909BarGraAca ;
   private short Gx_err ;
   private int AV10barcod ;
   private int AV17BarAlbPie ;
   private int AV19BarAlbTub ;
   private int AV25BarNumcli ;
   private int AV30CliCod ;
   private int AV36BarAlbPieold ;
   private int AV40Barcolnum ;
   private int AV44BarAlbUnd ;
   private int AV47Barpie ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int A12195BarAlbUnd ;
   private int A1266BarAlbTub ;
   private int A1235BarNumCli ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int A44AlbRecCod ;
   private int GXt_int9 ;
   private int GXv_int10[] ;
   private long AV9AlbProcod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV13BarAlbKgmE ;
   private java.math.BigDecimal AV16BarAlbMtrE ;
   private java.math.BigDecimal AV35Barkgm ;
   private java.math.BigDecimal AV38BarAlbKgmEold ;
   private java.math.BigDecimal AV37BarAlbMtrEold ;
   private java.math.BigDecimal AV48AlbPmpPza ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A4290AlbPmPPza ;
   private java.math.BigDecimal GXt_decimal7 ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String AV8Emprcod ;
   private String AV12Barcodpar ;
   private String AV20AlbProVal ;
   private String AV22BarTipCor ;
   private String AV24BarNomCli ;
   private String AV26BarSer ;
   private String AV27Barserdsc ;
   private String AV31BarEncCli ;
   private String AV32AlbHdrObs ;
   private String AV39Barcolnom ;
   private String AV42Barunimed ;
   private String AV43albpropri ;
   private String AV45Bartipdis ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A2839AlbProVal ;
   private String A2441AlbHdrObs ;
   private String A5291BarTipCor ;
   private String A1234BarNomCli ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A228BarUniMed ;
   private String A2010BarTipDis ;
   private String A365DisDes ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A396EmprCod ;
   private String A13878PedidoClie ;
   private String A200BarPieCod ;
   private String GXt_char1 ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean n1206TubCod ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private java.math.BigDecimal[] aP38 ;
   private java.math.BigDecimal[] aP5 ;
   private short[] aP6 ;
   private short[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private int[] aP9 ;
   private short[] aP10 ;
   private int[] aP11 ;
   private String[] aP12 ;
   private byte[] aP13 ;
   private String[] aP14 ;
   private byte[] aP15 ;
   private String[] aP16 ;
   private int[] aP17 ;
   private String[] aP18 ;
   private String[] aP19 ;
   private short[] aP20 ;
   private byte[] aP21 ;
   private int[] aP22 ;
   private String[] aP23 ;
   private String[] aP24 ;
   private short[] aP25 ;
   private short[] aP26 ;
   private java.math.BigDecimal[] aP27 ;
   private java.math.BigDecimal[] aP28 ;
   private java.math.BigDecimal[] aP29 ;
   private int[] aP30 ;
   private String[] aP31 ;
   private int[] aP32 ;
   private String[] aP33 ;
   private int[] aP35 ;
   private String[] aP36 ;
   private int[] aP37 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AGD3_A130BarCodPar ;
   private byte[] P0AGD3_A132BarCodReo ;
   private int[] P0AGD3_A129BarCod ;
   private long[] P0AGD3_A30AlbProCod ;
   private java.math.BigDecimal[] P0AGD3_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P0AGD3_A1263BarAlbMtrE ;
   private int[] P0AGD3_A1265BarAlbPie ;
   private int[] P0AGD3_A12195BarAlbUnd ;
   private short[] P0AGD3_A3271AlbHdrAnc ;
   private short[] P0AGD3_A5019AlbHdrgm2 ;
   private String[] P0AGD3_A2839AlbProVal ;
   private int[] P0AGD3_A1266BarAlbTub ;
   private short[] P0AGD3_A1206TubCod ;
   private boolean[] P0AGD3_n1206TubCod ;
   private String[] P0AGD3_A2441AlbHdrObs ;
   private byte[] P0AGD3_A148BarEstReo ;
   private String[] P0AGD3_A5291BarTipCor ;
   private byte[] P0AGD3_A213BarSit ;
   private String[] P0AGD3_A1234BarNomCli ;
   private int[] P0AGD3_A1235BarNumCli ;
   private String[] P0AGD3_A212BarSer ;
   private String[] P0AGD3_A1652BarSerDsc ;
   private short[] P0AGD3_A217BarTipArt ;
   private boolean[] P0AGD3_n217BarTipArt ;
   private byte[] P0AGD3_A218BarTipCol ;
   private int[] P0AGD3_A252CliCod ;
   private boolean[] P0AGD3_n252CliCod ;
   private String[] P0AGD3_A135BarColNom ;
   private int[] P0AGD3_A136BarColNum ;
   private String[] P0AGD3_A228BarUniMed ;
   private String[] P0AGD3_A2010BarTipDis ;
   private java.math.BigDecimal[] P0AGD3_A166BarKgm ;
   private short[] P0AGD3_A199BarPie1 ;
   private String[] P0AGD3_A365DisDes ;
   private int[] P0AGD3_A898BarPieNDes ;
   private String[] P0AGD3_A143BarDisNum ;
   private String[] P0AGD3_A4812BarEncCli ;
   private String[] P0AGD3_A396EmprCod ;
   private int[] P0AGD4_A44AlbRecCod ;
   private String[] P0AGD4_A396EmprCod ;
   private int[] P0AGD4_A129BarCod ;
   private byte[] P0AGD4_A132BarCodReo ;
   private String[] P0AGD4_A130BarCodPar ;
   private java.math.BigDecimal[] P0AGD4_A203BarPieKil ;
   private java.math.BigDecimal[] P0AGD4_A4290AlbPmPPza ;
   private String[] P0AGD4_A200BarPieCod ;
   private String[] P0AGD6_A130BarCodPar ;
   private byte[] P0AGD6_A132BarCodReo ;
   private int[] P0AGD6_A129BarCod ;
   private short[] P0AGD6_A125BarAncAca1 ;
   private short[] P0AGD6_A1909BarGraAca ;
   private byte[] P0AGD6_A148BarEstReo ;
   private String[] P0AGD6_A5291BarTipCor ;
   private byte[] P0AGD6_A213BarSit ;
   private String[] P0AGD6_A1234BarNomCli ;
   private int[] P0AGD6_A1235BarNumCli ;
   private String[] P0AGD6_A212BarSer ;
   private String[] P0AGD6_A1652BarSerDsc ;
   private short[] P0AGD6_A217BarTipArt ;
   private boolean[] P0AGD6_n217BarTipArt ;
   private byte[] P0AGD6_A218BarTipCol ;
   private int[] P0AGD6_A252CliCod ;
   private boolean[] P0AGD6_n252CliCod ;
   private String[] P0AGD6_A135BarColNom ;
   private int[] P0AGD6_A136BarColNum ;
   private String[] P0AGD6_A228BarUniMed ;
   private String[] P0AGD6_A2010BarTipDis ;
   private java.math.BigDecimal[] P0AGD6_A166BarKgm ;
   private short[] P0AGD6_A199BarPie1 ;
   private String[] P0AGD6_A365DisDes ;
   private int[] P0AGD6_A898BarPieNDes ;
   private String[] P0AGD6_A143BarDisNum ;
   private String[] P0AGD6_A4812BarEncCli ;
   private String[] P0AGD6_A396EmprCod ;
   private int[] P0AGD7_A44AlbRecCod ;
   private String[] P0AGD7_A396EmprCod ;
   private int[] P0AGD7_A129BarCod ;
   private byte[] P0AGD7_A132BarCodReo ;
   private String[] P0AGD7_A130BarCodPar ;
   private java.math.BigDecimal[] P0AGD7_A203BarPieKil ;
   private java.math.BigDecimal[] P0AGD7_A4290AlbPmPPza ;
   private String[] P0AGD7_A200BarPieCod ;
}

final  class documentodetransporteproduccion_20_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGD3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbPie, T1.BarAlbUnd, T1.AlbHdrAnc, T1.AlbHdrgm2, T1.AlbProVal, T1.BarAlbTub, T1.TubCod, T1.AlbHdrObs, T2.BarEstReo, T2.BarTipCor, T2.BarSit, T2.BarNomCli, T2.BarNumCli, T2.BarSer, T2.BarSerDsc, T2.BarTipArt, T2.BarTipCol, T2.CliCod, T2.BarColNom, T2.BarColNum, T2.BarUniMed, T2.BarTipDis, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarPie1, 0) AS BarPie1, T2.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AGD4", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieKil, T2.AlbPmPPza, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGD6", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarAncAca1, T1.BarGraAca, T1.BarEstReo, T1.BarTipCor, T1.BarSit, T1.BarNomCli, T1.BarNumCli, T1.BarSer, T1.BarSerDsc, T1.BarTipArt, T1.BarTipCol, T1.CliCod, T1.BarColNom, T1.BarColNum, T1.BarUniMed, T1.BarTipDis, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AGD7", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieKil, T2.AlbPmPPza, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 60);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 2);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 13);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 16);
               ((String[]) buf[21])[0] = rslt.getString(21, 26);
               ((short[]) buf[22])[0] = rslt.getShort(22);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(23);
               ((int[]) buf[25])[0] = rslt.getInt(24);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(25, 13);
               ((int[]) buf[28])[0] = rslt.getInt(26);
               ((String[]) buf[29])[0] = rslt.getString(27, 1);
               ((String[]) buf[30])[0] = rslt.getString(28, 1);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(29,2);
               ((short[]) buf[32])[0] = rslt.getShort(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 1);
               ((int[]) buf[34])[0] = rslt.getInt(32);
               ((String[]) buf[35])[0] = rslt.getString(33, 8);
               ((String[]) buf[36])[0] = rslt.getString(34, 20);
               ((String[]) buf[37])[0] = rslt.getString(35, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 13);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 1);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((short[]) buf[22])[0] = rslt.getShort(21);
               ((String[]) buf[23])[0] = rslt.getString(22, 1);
               ((int[]) buf[24])[0] = rslt.getInt(23);
               ((String[]) buf[25])[0] = rslt.getString(24, 8);
               ((String[]) buf[26])[0] = rslt.getString(25, 20);
               ((String[]) buf[27])[0] = rslt.getString(26, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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

