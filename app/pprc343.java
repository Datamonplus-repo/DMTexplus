package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc343 extends GXProcedure
{
   public pprc343( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc343.class ), "" );
   }

   public pprc343( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pprc343.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pprc343.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc343.this.AV63Hdr = aP1[0];
      this.aP1 = aP1;
      pprc343.this.AV80r = aP2[0];
      this.aP2 = aP2;
      pprc343.this.AV78p = aP3[0];
      this.aP3 = aP3;
      pprc343.this.AV48Factur = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV52FlagEst ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ESTAMP", ""), GXv_int2) ;
      pprc343.this.GXt_int1 = GXv_int2[0] ;
      AV52FlagEst = GXt_int1 ;
      GXt_int1 = AV46F_tinamar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int2) ;
      pprc343.this.GXt_int1 = GXv_int2[0] ;
      AV46F_tinamar = GXt_int1 ;
      GXt_int1 = AV88TasasEstandar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TASSTD", ""), GXv_int2) ;
      pprc343.this.GXt_int1 = GXv_int2[0] ;
      AV88TasasEstandar = GXt_int1 ;
      GXt_int1 = AV92Vertex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COSVTX", ""), GXv_int2) ;
      pprc343.this.GXt_int1 = GXv_int2[0] ;
      AV92Vertex = GXt_int1 ;
      GXt_int1 = AV100costefabricari ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COFBNC", ""), GXv_int2) ;
      pprc343.this.GXt_int1 = GXv_int2[0] ;
      AV100costefabricari = GXt_int1 ;
      /* Using cursor P09R22 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A963Ser1 = P09R22_A963Ser1[0] ;
         n963Ser1 = P09R22_n963Ser1[0] ;
         A964Ser0 = P09R22_A964Ser0[0] ;
         n964Ser0 = P09R22_n964Ser0[0] ;
         A2387Ser2 = P09R22_A2387Ser2[0] ;
         n2387Ser2 = P09R22_n2387Ser2[0] ;
         A2388Ser20 = P09R22_A2388Ser20[0] ;
         n2388Ser20 = P09R22_n2388Ser20[0] ;
         A2389Ser3 = P09R22_A2389Ser3[0] ;
         n2389Ser3 = P09R22_n2389Ser3[0] ;
         A2390Ser30 = P09R22_A2390Ser30[0] ;
         n2390Ser30 = P09R22_n2390Ser30[0] ;
         AV83Ser1 = A963Ser1 ;
         AV82Ser0 = A964Ser0 ;
         AV84Ser2 = A2387Ser2 ;
         AV85Ser20 = A2388Ser20 ;
         AV86Ser3 = A2389Ser3 ;
         AV87Ser30 = A2390Ser30 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P09R23 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV63Hdr), Byte.valueOf(AV80r), AV78p, A396EmprCod, Integer.valueOf(AV63Hdr), Byte.valueOf(AV80r), AV78p});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A361DisCod = P09R23_A361DisCod[0] ;
         A143BarDisNum = P09R23_A143BarDisNum[0] ;
         A212BarSer = P09R23_A212BarSer[0] ;
         A135BarColNom = P09R23_A135BarColNom[0] ;
         A136BarColNum = P09R23_A136BarColNum[0] ;
         A218BarTipCol = P09R23_A218BarTipCol[0] ;
         A217BarTipArt = P09R23_A217BarTipArt[0] ;
         n217BarTipArt = P09R23_n217BarTipArt[0] ;
         A209BarPri = P09R23_A209BarPri[0] ;
         A159BarFecGen = P09R23_A159BarFecGen[0] ;
         A155BarFecCli = P09R23_A155BarFecCli[0] ;
         A161BarFecSal = P09R23_A161BarFecSal[0] ;
         A158BarFecFpr = P09R23_A158BarFecFpr[0] ;
         A180BarMaqCod = P09R23_A180BarMaqCod[0] ;
         A189BarNumAny = P09R23_A189BarNumAny[0] ;
         A211BarRdt = P09R23_A211BarRdt[0] ;
         A148BarEstReo = P09R23_A148BarEstReo[0] ;
         A140BarCosAny = P09R23_A140BarCosAny[0] ;
         A141BarCosPro = P09R23_A141BarCosPro[0] ;
         A1878BarNumTen = P09R23_A1878BarNumTen[0] ;
         A1500BarNMtr = P09R23_A1500BarNMtr[0] ;
         A1235BarNumCli = P09R23_A1235BarNumCli[0] ;
         A1003BarFecLan = P09R23_A1003BarFecLan[0] ;
         n1003BarFecLan = P09R23_n1003BarFecLan[0] ;
         A1652BarSerDsc = P09R23_A1652BarSerDsc[0] ;
         A1798BarDibCli = P09R23_A1798BarDibCli[0] ;
         A1799BarDibInt = P09R23_A1799BarDibInt[0] ;
         A1224BarEncAnh = P09R23_A1224BarEncAnh[0] ;
         A1223BarEncCom = P09R23_A1223BarEncCom[0] ;
         A1499BarNMez = P09R23_A1499BarNMez[0] ;
         A2010BarTipDis = P09R23_A2010BarTipDis[0] ;
         A252CliCod = P09R23_A252CliCod[0] ;
         n252CliCod = P09R23_n252CliCod[0] ;
         A228BarUniMed = P09R23_A228BarUniMed[0] ;
         A130BarCodPar = P09R23_A130BarCodPar[0] ;
         A132BarCodReo = P09R23_A132BarCodReo[0] ;
         A129BarCod = P09R23_A129BarCod[0] ;
         A213BarSit = P09R23_A213BarSit[0] ;
         A365DisDes = P09R23_A365DisDes[0] ;
         /* Using cursor P09R25 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A166BarKgm = P09R25_A166BarKgm[0] ;
            A184BarMtr = P09R25_A184BarMtr[0] ;
            A199BarPie1 = P09R25_A199BarPie1[0] ;
            A898BarPieNDes = P09R25_A898BarPieNDes[0] ;
         }
         else
         {
            A898BarPieNDes = 0 ;
            A199BarPie1 = (short)(0) ;
            A166BarKgm = DecimalUtil.doubleToDec(0) ;
            A184BarMtr = DecimalUtil.doubleToDec(0) ;
         }
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         /* Using cursor P09R27 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(3) != 101) )
         {
            A1538BarCMtr = P09R27_A1538BarCMtr[0] ;
            A1545BarCPie = P09R27_A1545BarCPie[0] ;
            A1537BarCMLan = P09R27_A1537BarCMLan[0] ;
            A1546BarCPLan = P09R27_A1546BarCPLan[0] ;
         }
         else
         {
            A1538BarCMtr = DecimalUtil.doubleToDec(0) ;
            A1545BarCPie = (short)(0) ;
            A1537BarCMLan = DecimalUtil.doubleToDec(0) ;
            A1546BarCPLan = (short)(0) ;
         }
         /* Using cursor P09R28 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A212BarSer, A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol)});
         if ( (pr_default.getStatus(4) != 101) )
         {
            A13904BarIntColo = P09R28_A13904BarIntColo[0] ;
            n13904BarIntColo = P09R28_n13904BarIntColo[0] ;
            A13903BarMatColo = P09R28_A13903BarMatColo[0] ;
            n13903BarMatColo = P09R28_n13903BarMatColo[0] ;
         }
         else
         {
            A13903BarMatColo = (short)(0) ;
            n13903BarMatColo = false ;
            A13904BarIntColo = (byte)(0) ;
            n13904BarIntColo = false ;
         }
         /* Using cursor P09R29 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A966PartCod = P09R29_A966PartCod[0] ;
         n966PartCod = P09R29_n966PartCod[0] ;
         A1051DisNumCol = P09R29_A1051DisNumCol[0] ;
         n1051DisNumCol = P09R29_n1051DisNumCol[0] ;
         A1031EmpesCod = P09R29_A1031EmpesCod[0] ;
         n1031EmpesCod = P09R29_n1031EmpesCod[0] ;
         W396EmprCod = A396EmprCod ;
         AV26CliCod = A252CliCod ;
         AV23BarSer = A212BarSer ;
         AV24BarTipArt = A217BarTipArt ;
         AV12BarColNom = A135BarColNom ;
         AV13BarColNum = A136BarColNum ;
         AV25BarTipCol = A218BarTipCol ;
         AV64IntCod = A13904BarIntColo ;
         AV75matcod = A13903BarMatColo ;
         AV18BarKgmLan = DecimalUtil.ZERO ;
         AV20BarMtrLan = DecimalUtil.ZERO ;
         AV21BarPieLan = (short)(0) ;
         /* Optimized group. */
         /* Using cursor P09R210 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         c1261BarAlbKgmE = P09R210_A1261BarAlbKgmE[0] ;
         c1263BarAlbMtrE = P09R210_A1263BarAlbMtrE[0] ;
         c1265BarAlbPie = (short)((short)(P09R210_A1265BarAlbPie[0])) ;
         pr_default.close(6);
         AV18BarKgmLan = AV18BarKgmLan.add(c1261BarAlbKgmE) ;
         AV20BarMtrLan = AV20BarMtrLan.add(c1263BarAlbMtrE) ;
         AV21BarPieLan = (short)(AV21BarPieLan+c1265BarAlbPie) ;
         /* End optimized group. */
         AV28CosPrd = DecimalUtil.doubleToDec(0) ;
         AV30Coste_f = DecimalUtil.doubleToDec(0) ;
         AV31Coste_lin = DecimalUtil.ZERO ;
         AV33Coste_tin = DecimalUtil.ZERO ;
         AV35CosteFF = DecimalUtil.ZERO ;
         AV36CosteFNF = DecimalUtil.ZERO ;
         AV60HbaCosteT = DecimalUtil.ZERO ;
         AV34CosteExt = DecimalUtil.ZERO ;
         /* Using cursor P09R211 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A603MaqCodBis = P09R211_A603MaqCodBis[0] ;
            A457FasCod = P09R211_A457FasCod[0] ;
            A215BarTieRea = P09R211_A215BarTieRea[0] ;
            A3837BarFasKgm = P09R211_A3837BarFasKgm[0] ;
            n3837BarFasKgm = P09R211_n3837BarFasKgm[0] ;
            A3838BarFasMtr = P09R211_A3838BarFasMtr[0] ;
            n3838BarFasMtr = P09R211_n3838BarFasMtr[0] ;
            A5719BarFasKgT = P09R211_A5719BarFasKgT[0] ;
            n5719BarFasKgT = P09R211_n5719BarFasKgT[0] ;
            A5720BarFasMtT = P09R211_A5720BarFasMtT[0] ;
            n5720BarFasMtT = P09R211_n5720BarFasMtT[0] ;
            A150BarFacTin = P09R211_A150BarFacTin[0] ;
            A194BarOrdLin = P09R211_A194BarOrdLin[0] ;
            A758ProCod = P09R211_A758ProCod[0] ;
            AV69MaqCod = A603MaqCodBis ;
            AV49fascod = A457FasCod ;
            /* Execute user subroutine: 'COSMIN' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(7);
               pr_default.close(5);
               pr_default.close(4);
               pr_default.close(3);
               pr_default.close(2);
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV76Min = (byte)(DecimalUtil.decToDouble((A215BarTieRea.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))))).multiply(DecimalUtil.doubleToDec(100)))) ;
            AV89Tiempo_m = (int)((GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))*60)+AV76Min) ;
            AV28CosPrd = GXutil.roundDecimal( (DecimalUtil.doubleToDec(((GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))*60)+AV76Min)).multiply(AV70MaqCosMin)), 2) ;
            AV65Kgm = ((A3837BarFasKgm.doubleValue()>0) ? A3837BarFasKgm : A166BarKgm) ;
            AV77Mtr = ((A3837BarFasKgm.doubleValue()>0) ? A3838BarFasMtr : A184BarMtr) ;
            if ( GXutil.strcmp(GXutil.trim( AV90TipMaqCod), httpContext.getMessage( "EXT", "")) == 0 )
            {
               if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 )
               {
                  if ( A3837BarFasKgm.doubleValue() > 0 )
                  {
                     AV32Coste_m = GXutil.roundDecimal( (AV70MaqCosMin.multiply(A3837BarFasKgm)), 2) ;
                  }
                  else
                  {
                     AV32Coste_m = GXutil.roundDecimal( (AV70MaqCosMin.multiply(A166BarKgm)), 2) ;
                  }
                  AV34CosteExt = AV34CosteExt.add(AV32Coste_m) ;
               }
               else
               {
                  if ( A3838BarFasMtr.doubleValue() > 0 )
                  {
                     AV32Coste_m = GXutil.roundDecimal( (AV70MaqCosMin.multiply(A3838BarFasMtr)), 2) ;
                  }
                  else
                  {
                     AV32Coste_m = GXutil.roundDecimal( (AV70MaqCosMin.multiply(A184BarMtr)), 2) ;
                  }
               }
            }
            else
            {
               if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 )
               {
                  if ( ( A5719BarFasKgT.doubleValue() > 0 ) && ( A3837BarFasKgm.doubleValue() > 0 ) )
                  {
                     AV32Coste_m = (AV28CosPrd.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     AV32Coste_m = AV28CosPrd ;
                  }
               }
               else
               {
                  if ( ( A5720BarFasMtT.doubleValue() > 0 ) && ( A3838BarFasMtr.doubleValue() > 0 ) )
                  {
                     AV32Coste_m = (AV28CosPrd.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     AV32Coste_m = AV28CosPrd ;
                  }
               }
            }
            if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
            {
               AV33Coste_tin = AV33Coste_tin.add(AV32Coste_m) ;
            }
            else
            {
               AV31Coste_lin = AV32Coste_m ;
            }
            /* Execute user subroutine: 'ALBFAS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(7);
               pr_default.close(5);
               pr_default.close(4);
               pr_default.close(3);
               pr_default.close(2);
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) != 0 )
            {
               if ( AV8Albfas == 0 )
               {
                  AV36CosteFNF = AV36CosteFNF.add(AV31Coste_lin) ;
               }
               else
               {
                  AV35CosteFF = AV35CosteFF.add(AV31Coste_lin) ;
               }
            }
            AV30Coste_f = AV30Coste_f.add(AV32Coste_m) ;
            pr_default.readNext(7);
         }
         pr_default.close(7);
         AV91TotFac = DecimalUtil.doubleToDec(0) ;
         AV9BarCod = A129BarCod ;
         AV11BarCodReo = A132BarCodReo ;
         AV10BarCodPar = A130BarCodPar ;
         AV91TotFac = DecimalUtil.ZERO ;
         if ( GXutil.strcmp(AV48Factur, httpContext.getMessage( "NO", "")) == 0 )
         {
            /* Using cursor P09R212 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A30AlbProCod = P09R212_A30AlbProCod[0] ;
               A1264BarPreMtr = P09R212_A1264BarPreMtr[0] ;
               A1263BarAlbMtrE = P09R212_A1263BarAlbMtrE[0] ;
               A1262BarPreKgm = P09R212_A1262BarPreKgm[0] ;
               A1261BarAlbKgmE = P09R212_A1261BarAlbKgmE[0] ;
               AV91TotFac = GXutil.roundDecimal( A1261BarAlbKgmE.multiply(A1262BarPreKgm), 2).add(GXutil.roundDecimal( A1263BarAlbMtrE.multiply(A1264BarPreMtr), 2)) ;
               /* Using cursor P09R213 */
               pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(9) != 101) )
               {
                  A1242GuiFasPMt = P09R213_A1242GuiFasPMt[0] ;
                  A1276FasMtr = P09R213_A1276FasMtr[0] ;
                  A1241GuiFasPKg = P09R213_A1241GuiFasPKg[0] ;
                  A1275FasKgm = P09R213_A1275FasKgm[0] ;
                  A1240GuiFasLin = P09R213_A1240GuiFasLin[0] ;
                  AV91TotFac = AV91TotFac.add((GXutil.roundDecimal( A1275FasKgm.multiply(A1241GuiFasPKg), 2).add(GXutil.roundDecimal( A1276FasMtr.multiply(A1242GuiFasPMt), 2)))) ;
                  pr_default.readNext(9);
               }
               pr_default.close(9);
               pr_default.readNext(8);
            }
            pr_default.close(8);
         }
         else
         {
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = AV9BarCod ;
            GXv_int2[0] = AV11BarCodReo ;
            GXv_char5[0] = AV10BarCodPar ;
            GXv_decimal6[0] = AV91TotFac ;
            new app.ptotbaf(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_char5, GXv_decimal6) ;
            pprc343.this.A396EmprCod = GXv_char3[0] ;
            pprc343.this.AV9BarCod = GXv_int4[0] ;
            pprc343.this.AV11BarCodReo = GXv_int2[0] ;
            pprc343.this.AV10BarCodPar = GXv_char5[0] ;
            pprc343.this.AV91TotFac = GXv_decimal6[0] ;
         }
         AV96barcodm = A129BarCod ;
         AV97barcodreom = A132BarCodReo ;
         AV98barcodparm = A130BarCodPar ;
         new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV96barcodm, AV97barcodreom, AV98barcodparm) ;
         AV67Lote = GXutil.str( AV96barcodm, 8, 0) + GXutil.str( AV97barcodreom, 1, 0) + AV98barcodparm ;
         if ( AV92Vertex == 1 )
         {
            GXv_decimal6[0] = AV38Costest ;
            new app.pvxhrcot(remoteHandle, context).execute( A396EmprCod, AV9BarCod, AV11BarCodReo, AV10BarCodPar, GXv_decimal6) ;
            pprc343.this.AV38Costest = GXv_decimal6[0] ;
         }
         /*
            INSERT RECORD ON TABLE TXPHISBAR

         */
         W396EmprCod = A396EmprCod ;
         A506HbaBarCod = A129BarCod ;
         A508HbaBarReo = A132BarCodReo ;
         A507HbaBarPar = A130BarCodPar ;
         A529HbaNumDis = A361DisCod ;
         n529HbaNumDis = false ;
         A516HbaDisCli = A143BarDisNum ;
         n516HbaDisCli = false ;
         A535HbaSer = A212BarSer ;
         n535HbaSer = false ;
         A509HbaColNom = A135BarColNom ;
         n509HbaColNom = false ;
         A510HbaColNum = A136BarColNum ;
         n510HbaColNum = false ;
         A537HbaTipCol = A218BarTipCol ;
         n537HbaTipCol = false ;
         A536HbaTipArt = A217BarTipArt ;
         n536HbaTipArt = false ;
         A532HbaPri = A209BarPri ;
         n532HbaPri = false ;
         A523HbaKgm = A166BarKgm ;
         n523HbaKgm = false ;
         A527HbaMtr = A184BarMtr ;
         n527HbaMtr = false ;
         if ( A198BarPie > 9999 )
         {
            A530HbaPie = (short)(9999) ;
            n530HbaPie = false ;
         }
         else
         {
            A530HbaPie = (short)(A198BarPie) ;
            n530HbaPie = false ;
         }
         A524HbaKgmEnt = AV18BarKgmLan ;
         n524HbaKgmEnt = false ;
         A528HbaMtrEnt = AV20BarMtrLan ;
         n528HbaMtrEnt = false ;
         A531HbaPieEnt = AV21BarPieLan ;
         n531HbaPieEnt = false ;
         A521HbaFecGen = A159BarFecGen ;
         n521HbaFecGen = false ;
         A520HbaFecDis = A155BarFecCli ;
         n520HbaFecDis = false ;
         A522HbaFecSal = A161BarFecSal ;
         n522HbaFecSal = false ;
         A519HbaFecCom = A158BarFecFpr ;
         n519HbaFecCom = false ;
         if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A161BarFecSal)) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A155BarFecCli)) && (( GXutil.resetTime(A161BarFecSal).after( GXutil.resetTime( A155BarFecCli )) ) || ( GXutil.dateCompare(GXutil.resetTime(A161BarFecSal), GXutil.resetTime(A155BarFecCli)) )) )
         {
            if ( ( ( GXutil.ddiff( A161BarFecSal , A155BarFecCli ) ) > DecimalUtil.stringToDec("999.9").doubleValue() ) )
            {
               A515HbaDia = DecimalUtil.stringToDec("999.9") ;
               n515HbaDia = false ;
            }
            else
            {
               A515HbaDia = DecimalUtil.doubleToDec(GXutil.ddiff(A161BarFecSal,A155BarFecCli)) ;
               n515HbaDia = false ;
            }
         }
         else
         {
            A515HbaDia = DecimalUtil.ZERO ;
            n515HbaDia = false ;
         }
         A526HbaMaqCod = A180BarMaqCod ;
         n526HbaMaqCod = false ;
         A505HbaAny = A189BarNumAny ;
         n505HbaAny = false ;
         A533HbaRen = A211BarRdt ;
         n533HbaRen = false ;
         A534HbaRenRea = DecimalUtil.doubleToDec(0) ;
         n534HbaRenRea = false ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV18BarKgmLan)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV20BarMtrLan)==0) )
         {
            if ( DecimalUtil.compareTo((AV20BarMtrLan.divide(AV18BarKgmLan, 18, java.math.RoundingMode.DOWN)), DecimalUtil.stringToDec("999.99")) > 0 )
            {
               A534HbaRenRea = DecimalUtil.stringToDec("999.99") ;
               n534HbaRenRea = false ;
            }
            else
            {
               A534HbaRenRea = AV20BarMtrLan.divide(AV18BarKgmLan, 18, java.math.RoundingMode.DOWN) ;
               n534HbaRenRea = false ;
            }
         }
         AV99coste_fr = DecimalUtil.ZERO ;
         if ( ( A148BarEstReo == 1 ) && ( AV100costefabricari == 1 ) )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_int4[0] = A129BarCod ;
            GXv_int2[0] = A132BarCodReo ;
            GXv_char3[0] = A130BarCodPar ;
            GXv_decimal6[0] = AV99coste_fr ;
            new app.pprc388(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_int2, GXv_char3, GXv_decimal6) ;
            pprc343.this.A396EmprCod = GXv_char5[0] ;
            pprc343.this.A129BarCod = GXv_int4[0] ;
            pprc343.this.A132BarCodReo = GXv_int2[0] ;
            pprc343.this.A130BarCodPar = GXv_char3[0] ;
            pprc343.this.AV99coste_fr = GXv_decimal6[0] ;
            AV30Coste_f = AV30Coste_f.add(AV99coste_fr) ;
         }
         A514HbaCosPro = AV30Coste_f ;
         n514HbaCosPro = false ;
         A511HbaCosAny = A140BarCosAny ;
         n511HbaCosAny = false ;
         A513HbaCosPrd = A141BarCosPro ;
         n513HbaCosPrd = false ;
         A512HbaCosDir = AV38Costest ;
         n512HbaCosDir = false ;
         A518HbaFac = AV91TotFac ;
         n518HbaFac = false ;
         A6052HbaCosteT = (A511HbaCosAny.add(A513HbaCosPrd)) ;
         n6052HbaCosteT = false ;
         A6053HbaCosteF = AV35CosteFF ;
         n6053HbaCosteF = false ;
         if ( ( A523HbaKgm.doubleValue() == 0 ) && ( A527HbaMtr.doubleValue() == 0 ) )
         {
            A514HbaCosPro = DecimalUtil.doubleToDec(0) ;
            n514HbaCosPro = false ;
            A511HbaCosAny = DecimalUtil.doubleToDec(0) ;
            n511HbaCosAny = false ;
            A513HbaCosPrd = DecimalUtil.doubleToDec(0) ;
            n513HbaCosPrd = false ;
            A6053HbaCosteF = DecimalUtil.doubleToDec(0) ;
            n6053HbaCosteF = false ;
            A6052HbaCosteT = DecimalUtil.doubleToDec(0) ;
            n6052HbaCosteT = false ;
         }
         A517HbaEstReo = A148BarEstReo ;
         n517HbaEstReo = false ;
         A525HbaLot = AV67Lote ;
         n525HbaLot = false ;
         A2292HbaPartCod = A966PartCod ;
         n2292HbaPartCod = false ;
         A2294HbaNumTin = A1878BarNumTen ;
         n2294HbaNumTin = false ;
         A2293HbaNh = A1500BarNMtr ;
         n2293HbaNh = false ;
         A2295HbaNomCli = A135BarColNom ;
         n2295HbaNomCli = false ;
         A2296HbaNumCli = A1235BarNumCli ;
         n2296HbaNumCli = false ;
         A2760HbaFecLan = A1003BarFecLan ;
         n2760HbaFecLan = false ;
         if ( AV52FlagEst == 1 )
         {
            A2627HbaSerDsc = A1652BarSerDsc ;
            n2627HbaSerDsc = false ;
            A2622HbaDibCli = A1798BarDibCli ;
            n2622HbaDibCli = false ;
            A2623HbaDibInt = A1799BarDibInt ;
            n2623HbaDibInt = false ;
            A2626HbaNumCol = A1051DisNumCol ;
            n2626HbaNumCol = false ;
            A2624HbaEmpesCo = A1031EmpesCod ;
            n2624HbaEmpesCo = false ;
            A527HbaMtr = A1538BarCMtr ;
            n527HbaMtr = false ;
            A530HbaPie = A1545BarCPie ;
            n530HbaPie = false ;
            A528HbaMtrEnt = A1537BarCMLan ;
            n528HbaMtrEnt = false ;
            A531HbaPieEnt = A1546BarCPLan ;
            n531HbaPieEnt = false ;
         }
         A5528HbaEncAnh = A1224BarEncAnh ;
         n5528HbaEncAnh = false ;
         A5529HbaEncCom = A1223BarEncCom ;
         n5529HbaEncCom = false ;
         A5692HbaNMez = A1499BarNMez ;
         n5692HbaNMez = false ;
         A2627HbaSerDsc = A1652BarSerDsc ;
         n2627HbaSerDsc = false ;
         A5721HbaIntCod = AV64IntCod ;
         n5721HbaIntCod = false ;
         A6051HbaTipDis = A2010BarTipDis ;
         n6051HbaTipDis = false ;
         A6054HbaFacFS = AV34CosteExt ;
         n6054HbaFacFS = false ;
         A14121HbaMatCod = AV75matcod ;
         n14121HbaMatCod = false ;
         /* Using cursor P09R214 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A506HbaBarCod), Byte.valueOf(A508HbaBarReo), A507HbaBarPar, Boolean.valueOf(n529HbaNumDis), Integer.valueOf(A529HbaNumDis), Boolean.valueOf(n516HbaDisCli), A516HbaDisCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n535HbaSer), A535HbaSer, Boolean.valueOf(n509HbaColNom), A509HbaColNom, Boolean.valueOf(n510HbaColNum), Integer.valueOf(A510HbaColNum), Boolean.valueOf(n537HbaTipCol), Byte.valueOf(A537HbaTipCol), Boolean.valueOf(n536HbaTipArt), Short.valueOf(A536HbaTipArt), Boolean.valueOf(n532HbaPri), A532HbaPri, Boolean.valueOf(n523HbaKgm), A523HbaKgm, Boolean.valueOf(n527HbaMtr), A527HbaMtr, Boolean.valueOf(n530HbaPie), Short.valueOf(A530HbaPie), Boolean.valueOf(n524HbaKgmEnt), A524HbaKgmEnt, Boolean.valueOf(n528HbaMtrEnt), A528HbaMtrEnt, Boolean.valueOf(n531HbaPieEnt), Short.valueOf(A531HbaPieEnt), Boolean.valueOf(n521HbaFecGen), A521HbaFecGen, Boolean.valueOf(n520HbaFecDis), A520HbaFecDis, Boolean.valueOf(n522HbaFecSal), A522HbaFecSal, Boolean.valueOf(n519HbaFecCom), A519HbaFecCom, Boolean.valueOf(n515HbaDia), A515HbaDia, Boolean.valueOf(n526HbaMaqCod), A526HbaMaqCod, Boolean.valueOf(n505HbaAny), Short.valueOf(A505HbaAny), Boolean.valueOf(n533HbaRen), A533HbaRen, Boolean.valueOf(n534HbaRenRea), A534HbaRenRea, Boolean.valueOf(n514HbaCosPro), A514HbaCosPro, Boolean.valueOf(n511HbaCosAny), A511HbaCosAny, Boolean.valueOf(n513HbaCosPrd), A513HbaCosPrd, Boolean.valueOf(n512HbaCosDir), A512HbaCosDir, Boolean.valueOf(n518HbaFac), A518HbaFac, Boolean.valueOf(n517HbaEstReo), Byte.valueOf(A517HbaEstReo), Boolean.valueOf(n525HbaLot), A525HbaLot, Boolean.valueOf(n2292HbaPartCod), A2292HbaPartCod, Boolean.valueOf(n2293HbaNh), A2293HbaNh, Boolean.valueOf(n2294HbaNumTin), A2294HbaNumTin, Boolean.valueOf(n2295HbaNomCli), A2295HbaNomCli, Boolean.valueOf(n2296HbaNumCli), Integer.valueOf(A2296HbaNumCli), Boolean.valueOf(n2760HbaFecLan), A2760HbaFecLan, Boolean.valueOf(n2627HbaSerDsc), A2627HbaSerDsc, Boolean.valueOf(n2623HbaDibInt), Integer.valueOf(A2623HbaDibInt), Boolean.valueOf(n2622HbaDibCli), A2622HbaDibCli, Boolean.valueOf(n2626HbaNumCol), Short.valueOf(A2626HbaNumCol), Boolean.valueOf(n2624HbaEmpesCo), A2624HbaEmpesCo, Boolean.valueOf(n5528HbaEncAnh), A5528HbaEncAnh, Boolean.valueOf(n5529HbaEncCom), A5529HbaEncCom, Boolean.valueOf(n5692HbaNMez), A5692HbaNMez, Boolean.valueOf(n5721HbaIntCod), Byte.valueOf(A5721HbaIntCod), Boolean.valueOf(n6051HbaTipDis), A6051HbaTipDis, Boolean.valueOf(n6052HbaCosteT), A6052HbaCosteT, Boolean.valueOf(n6053HbaCosteF), A6053HbaCosteF, Boolean.valueOf(n6054HbaFacFS), A6054HbaFacFS, Boolean.valueOf(n14121HbaMatCod), Short.valueOf(A14121HbaMatCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISBAR");
         if ( (pr_default.getStatus(10) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         if ( AV52FlagEst == 1 )
         {
            /* Using cursor P09R215 */
            pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(11) != 101) )
            {
               A2524DisComLin = P09R215_A2524DisComLin[0] ;
               A1056DisComCod = P09R215_A1056DisComCod[0] ;
               A1032FonCod = P09R215_A1032FonCod[0] ;
               A1541BarComMtr = P09R215_A1541BarComMtr[0] ;
               n1541BarComMtr = P09R215_n1541BarComMtr[0] ;
               A1543BarComPie = P09R215_A1543BarComPie[0] ;
               n1543BarComPie = P09R215_n1543BarComPie[0] ;
               A2071BarMtrEst = P09R215_A2071BarMtrEst[0] ;
               n2071BarMtrEst = P09R215_n2071BarMtrEst[0] ;
               A1540BarComMLan = P09R215_A1540BarComMLan[0] ;
               n1540BarComMLan = P09R215_n1540BarComMLan[0] ;
               A1544BarComPLan = P09R215_A1544BarComPLan[0] ;
               n1544BarComPLan = P09R215_n1544BarComPLan[0] ;
               A1539BarComAnh = P09R215_A1539BarComAnh[0] ;
               n1539BarComAnh = P09R215_n1539BarComAnh[0] ;
               A155BarFecCli = P09R215_A155BarFecCli[0] ;
               A161BarFecSal = P09R215_A161BarFecSal[0] ;
               A2515BarGasEst = P09R215_A2515BarGasEst[0] ;
               n2515BarGasEst = P09R215_n2515BarGasEst[0] ;
               A2514BarGasEmp = P09R215_A2514BarGasEmp[0] ;
               n2514BarGasEmp = P09R215_n2514BarGasEmp[0] ;
               A2516BarGasOpe = P09R215_A2516BarGasOpe[0] ;
               n2516BarGasOpe = P09R215_n2516BarGasOpe[0] ;
               A2513BarGasAca = P09R215_A2513BarGasAca[0] ;
               n2513BarGasAca = P09R215_n2513BarGasAca[0] ;
               A2517BarPrcMtr = P09R215_A2517BarPrcMtr[0] ;
               n2517BarPrcMtr = P09R215_n2517BarPrcMtr[0] ;
               A2511BarComRep = P09R215_A2511BarComRep[0] ;
               n2511BarComRep = P09R215_n2511BarComRep[0] ;
               A155BarFecCli = P09R215_A155BarFecCli[0] ;
               A161BarFecSal = P09R215_A161BarFecSal[0] ;
               /*
                  INSERT RECORD ON TABLE TXPHISCOM

               */
               A506HbaBarCod = A129BarCod ;
               A508HbaBarReo = A132BarCodReo ;
               A507HbaBarPar = A130BarCodPar ;
               A2611HbaComLin = A2524DisComLin ;
               A2606HbaComCod = A1056DisComCod ;
               A2625HbaFonCod = A1032FonCod ;
               A2612HbaComMDis = A1541BarComMtr ;
               n2612HbaComMDis = false ;
               A2617HbaComPDis = A1543BarComPie ;
               n2617HbaComPDis = false ;
               A2614HbaComMEst = A2071BarMtrEst ;
               n2614HbaComMEst = false ;
               A2619HbaComPEst = A1543BarComPie ;
               n2619HbaComPEst = false ;
               A2615HbaComMRep = A2071BarMtrEst ;
               n2615HbaComMRep = false ;
               if ( A1543BarComPie > 9 )
               {
                  A2621HbaComPRep = (byte)(0) ;
                  n2621HbaComPRep = false ;
               }
               else
               {
                  A2621HbaComPRep = (byte)(A1543BarComPie) ;
                  n2621HbaComPRep = false ;
               }
               A2613HbaComMEnt = A1540BarComMLan ;
               n2613HbaComMEnt = false ;
               A2618HbaComPEnt = A1544BarComPLan ;
               n2618HbaComPEnt = false ;
               A2605HbaComAnh = A1539BarComAnh ;
               n2605HbaComAnh = false ;
               A2610HbaComFecP = A155BarFecCli ;
               n2610HbaComFecP = false ;
               A2609HbaComFecE = A161BarFecSal ;
               n2609HbaComFecE = false ;
               A2608HbaComEstC = A2515BarGasEst ;
               n2608HbaComEstC = false ;
               A2607HbaComEmpC = A2514BarGasEmp ;
               n2607HbaComEmpC = false ;
               A2616HbaComOpeC = A2516BarGasOpe ;
               n2616HbaComOpeC = false ;
               A2604HbaComAcaC = A2513BarGasAca ;
               n2604HbaComAcaC = false ;
               A2620HbaComPre = A2517BarPrcMtr ;
               n2620HbaComPre = false ;
               /* Using cursor P09R216 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A506HbaBarCod), Byte.valueOf(A508HbaBarReo), A507HbaBarPar, Byte.valueOf(A2611HbaComLin), A2606HbaComCod, A2625HbaFonCod, Boolean.valueOf(n2612HbaComMDis), A2612HbaComMDis, Boolean.valueOf(n2617HbaComPDis), Short.valueOf(A2617HbaComPDis), Boolean.valueOf(n2614HbaComMEst), A2614HbaComMEst, Boolean.valueOf(n2619HbaComPEst), Short.valueOf(A2619HbaComPEst), Boolean.valueOf(n2615HbaComMRep), A2615HbaComMRep, Boolean.valueOf(n2621HbaComPRep), Byte.valueOf(A2621HbaComPRep), Boolean.valueOf(n2613HbaComMEnt), A2613HbaComMEnt, Boolean.valueOf(n2618HbaComPEnt), Short.valueOf(A2618HbaComPEnt), Boolean.valueOf(n2605HbaComAnh), Short.valueOf(A2605HbaComAnh), Boolean.valueOf(n2610HbaComFecP), A2610HbaComFecP, Boolean.valueOf(n2609HbaComFecE), A2609HbaComFecE, Boolean.valueOf(n2608HbaComEstC), A2608HbaComEstC, Boolean.valueOf(n2607HbaComEmpC), A2607HbaComEmpC, Boolean.valueOf(n2616HbaComOpeC), A2616HbaComOpeC, Boolean.valueOf(n2604HbaComAcaC), A2604HbaComAcaC, Boolean.valueOf(n2620HbaComPre), A2620HbaComPre});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISCOM");
               if ( (pr_default.getStatus(12) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               /* End Insert */
               pr_default.readNext(11);
            }
            pr_default.close(11);
         }
         AV22BarPri = A209BarPri ;
         AV58FlagTin = httpContext.getMessage( "N", "") ;
         /* Using cursor P09R217 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A150BarFacTin = P09R217_A150BarFacTin[0] ;
            A194BarOrdLin = P09R217_A194BarOrdLin[0] ;
            A758ProCod = P09R217_A758ProCod[0] ;
            if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
            {
               AV58FlagTin = httpContext.getMessage( "S", "") ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(13);
         }
         pr_default.close(13);
         if ( GXutil.strcmp(AV22BarPri, "1") == 0 )
         {
            AV47FacSerNum = AV83Ser1 ;
         }
         else
         {
            AV47FacSerNum = AV82Ser0 ;
         }
         GXv_char5[0] = A396EmprCod ;
         GXv_int4[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_char7[0] = AV47FacSerNum ;
         GXv_date8[0] = A161BarFecSal ;
         GXv_char9[0] = AV58FlagTin ;
         GXv_char10[0] = A209BarPri ;
         GXv_int11[0] = A217BarTipArt ;
         GXv_decimal6[0] = A166BarKgm ;
         GXv_decimal12[0] = AV18BarKgmLan ;
         GXv_decimal13[0] = A184BarMtr ;
         GXv_decimal14[0] = AV20BarMtrLan ;
         GXv_int2[0] = A148BarEstReo ;
         new app.pacesta(remoteHandle, context).execute( GXv_char5, GXv_int4, GXv_char3, GXv_char7, GXv_date8, GXv_char9, GXv_char10, GXv_int11, GXv_decimal6, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_int2) ;
         pprc343.this.A396EmprCod = GXv_char5[0] ;
         pprc343.this.A252CliCod = GXv_int4[0] ;
         pprc343.this.A212BarSer = GXv_char3[0] ;
         pprc343.this.AV47FacSerNum = GXv_char7[0] ;
         pprc343.this.A161BarFecSal = GXv_date8[0] ;
         pprc343.this.AV58FlagTin = GXv_char9[0] ;
         pprc343.this.A209BarPri = GXv_char10[0] ;
         pprc343.this.A217BarTipArt = GXv_int11[0] ;
         pprc343.this.A166BarKgm = GXv_decimal6[0] ;
         pprc343.this.AV18BarKgmLan = GXv_decimal12[0] ;
         pprc343.this.A184BarMtr = GXv_decimal13[0] ;
         pprc343.this.AV20BarMtrLan = GXv_decimal14[0] ;
         pprc343.this.A148BarEstReo = GXv_int2[0] ;
         if ( AV52FlagEst == 1 )
         {
            /*
               INSERT RECORD ON TABLE TXPCESTDI

            */
            W1013DibCli = A1013DibCli ;
            W1014DibInt = A1014DibInt ;
            A1013DibCli = A1798BarDibCli ;
            A1014DibInt = A1799BarDibInt ;
            A425EstAny = (short)(GXutil.year( A161BarFecSal)) ;
            /* Using cursor P09R218 */
            pr_default.execute(14, new Object[] {A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESTDI");
            if ( (pr_default.getStatus(14) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A1013DibCli = W1013DibCli ;
            A1014DibInt = W1014DibInt ;
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPLESTDI

            */
            A425EstAny = (short)(GXutil.year( A161BarFecSal)) ;
            A426EstMes = (byte)(GXutil.month( A161BarFecSal)) ;
            if ( GXutil.strcmp(AV22BarPri, "1") == 0 )
            {
               A1137MtrEst1 = A1538BarCMtr ;
               n1137MtrEst1 = false ;
            }
            else
            {
               A1086MtrEst = A1538BarCMtr ;
               n1086MtrEst = false ;
            }
            /* Using cursor P09R219 */
            pr_default.execute(15, new Object[] {A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac, Byte.valueOf(A426EstMes), Boolean.valueOf(n1086MtrEst), A1086MtrEst, Boolean.valueOf(n1137MtrEst1), A1137MtrEst1});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESTDI");
            if ( (pr_default.getStatus(15) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               /* Using cursor P09R220 */
               pr_default.execute(16, new Object[] {A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac, Byte.valueOf(A426EstMes)});
               while ( (pr_default.getStatus(16) != 101) )
               {
                  A396EmprCod = P09R220_A396EmprCod[0] ;
                  A1013DibCli = P09R220_A1013DibCli[0] ;
                  A252CliCod = P09R220_A252CliCod[0] ;
                  n252CliCod = P09R220_n252CliCod[0] ;
                  A1014DibInt = P09R220_A1014DibInt[0] ;
                  A425EstAny = P09R220_A425EstAny[0] ;
                  A3913DibSerFac = P09R220_A3913DibSerFac[0] ;
                  A426EstMes = P09R220_A426EstMes[0] ;
                  A1137MtrEst1 = P09R220_A1137MtrEst1[0] ;
                  n1137MtrEst1 = P09R220_n1137MtrEst1[0] ;
                  A1086MtrEst = P09R220_A1086MtrEst[0] ;
                  n1086MtrEst = P09R220_n1086MtrEst[0] ;
                  if ( GXutil.strcmp(AV22BarPri, "1") == 0 )
                  {
                     A1137MtrEst1 = A1137MtrEst1.add(A1538BarCMtr) ;
                     n1137MtrEst1 = false ;
                  }
                  else
                  {
                     A1086MtrEst = A1086MtrEst.add(A1538BarCMtr) ;
                     n1086MtrEst = false ;
                  }
                  /* Using cursor P09R221 */
                  pr_default.execute(17, new Object[] {Boolean.valueOf(n1137MtrEst1), A1137MtrEst1, Boolean.valueOf(n1086MtrEst), A1086MtrEst, A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Short.valueOf(A425EstAny), A3913DibSerFac, Byte.valueOf(A426EstMes)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESTDI");
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(16);
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
         A213BarSit = (byte)(11) ;
         /* Using cursor P09R222 */
         pr_default.execute(18, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      pr_default.close(5);
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      cleanup();
   }

   public void S111( )
   {
      /* 'ALBFAS' Routine */
      returnInSub = false ;
      AV8Albfas = (byte)(0) ;
      /* Using cursor P09R223 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV11BarCodReo), AV10BarCodPar, AV49fascod});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A129BarCod = P09R223_A129BarCod[0] ;
         A132BarCodReo = P09R223_A132BarCodReo[0] ;
         A130BarCodPar = P09R223_A130BarCodPar[0] ;
         A457FasCod = P09R223_A457FasCod[0] ;
         A1241GuiFasPKg = P09R223_A1241GuiFasPKg[0] ;
         A30AlbProCod = P09R223_A30AlbProCod[0] ;
         A1240GuiFasLin = P09R223_A1240GuiFasLin[0] ;
         AV8Albfas = (byte)(1) ;
         pr_default.readNext(19);
      }
      pr_default.close(19);
   }

   public void S121( )
   {
      /* 'COSMIN' Routine */
      returnInSub = false ;
      AV70MaqCosMin = DecimalUtil.ZERO ;
      AV73MaqMOD = DecimalUtil.doubleToDec(0) ;
      AV74MaqMOI = DecimalUtil.doubleToDec(0) ;
      AV71MaqEnerg = DecimalUtil.doubleToDec(0) ;
      AV72MaqGas = DecimalUtil.doubleToDec(0) ;
      AV68MaqAgua = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P09R224 */
      pr_default.execute(20, new Object[] {A396EmprCod, AV69MaqCod});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A602MaqCod = P09R224_A602MaqCod[0] ;
         A605MaqCosMin = P09R224_A605MaqCosMin[0] ;
         n605MaqCosMin = P09R224_n605MaqCosMin[0] ;
         A11825MaqAgua = P09R224_A11825MaqAgua[0] ;
         n11825MaqAgua = P09R224_n11825MaqAgua[0] ;
         A11824MaqGas = P09R224_A11824MaqGas[0] ;
         n11824MaqGas = P09R224_n11824MaqGas[0] ;
         A11823MaqEnerg = P09R224_A11823MaqEnerg[0] ;
         n11823MaqEnerg = P09R224_n11823MaqEnerg[0] ;
         A11822MaqMOI = P09R224_A11822MaqMOI[0] ;
         n11822MaqMOI = P09R224_n11822MaqMOI[0] ;
         A11821MaqMOD = P09R224_A11821MaqMOD[0] ;
         n11821MaqMOD = P09R224_n11821MaqMOD[0] ;
         A1011TipMaqCod = P09R224_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P09R224_n1011TipMaqCod[0] ;
         AV70MaqCosMin = ((AV88TasasEstandar>0) ? (A11821MaqMOD.add(A11822MaqMOI).add(A11823MaqEnerg).add(A11824MaqGas).add(A11825MaqAgua)) : A605MaqCosMin) ;
         AV90TipMaqCod = A1011TipMaqCod ;
         if ( AV88TasasEstandar == 1 )
         {
            AV73MaqMOD = A11821MaqMOD ;
            AV74MaqMOI = A11822MaqMOI ;
            AV71MaqEnerg = A11823MaqEnerg ;
            AV72MaqGas = A11824MaqGas ;
            AV68MaqAgua = A11825MaqAgua ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(20);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc343.this.A396EmprCod;
      this.aP1[0] = pprc343.this.AV63Hdr;
      this.aP2[0] = pprc343.this.AV80r;
      this.aP3[0] = pprc343.this.AV78p;
      this.aP4[0] = pprc343.this.AV48Factur;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc343");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P09R22_A396EmprCod = new String[] {""} ;
      P09R22_A963Ser1 = new String[] {""} ;
      P09R22_n963Ser1 = new boolean[] {false} ;
      P09R22_A964Ser0 = new String[] {""} ;
      P09R22_n964Ser0 = new boolean[] {false} ;
      P09R22_A2387Ser2 = new String[] {""} ;
      P09R22_n2387Ser2 = new boolean[] {false} ;
      P09R22_A2388Ser20 = new String[] {""} ;
      P09R22_n2388Ser20 = new boolean[] {false} ;
      P09R22_A2389Ser3 = new String[] {""} ;
      P09R22_n2389Ser3 = new boolean[] {false} ;
      P09R22_A2390Ser30 = new String[] {""} ;
      P09R22_n2390Ser30 = new boolean[] {false} ;
      A963Ser1 = "" ;
      A964Ser0 = "" ;
      A2387Ser2 = "" ;
      A2388Ser20 = "" ;
      A2389Ser3 = "" ;
      A2390Ser30 = "" ;
      AV83Ser1 = "" ;
      AV82Ser0 = "" ;
      AV84Ser2 = "" ;
      AV85Ser20 = "" ;
      AV86Ser3 = "" ;
      AV87Ser30 = "" ;
      P09R23_A396EmprCod = new String[] {""} ;
      P09R23_A361DisCod = new int[1] ;
      P09R23_A143BarDisNum = new String[] {""} ;
      P09R23_A212BarSer = new String[] {""} ;
      P09R23_A135BarColNom = new String[] {""} ;
      P09R23_A136BarColNum = new int[1] ;
      P09R23_A218BarTipCol = new byte[1] ;
      P09R23_A217BarTipArt = new short[1] ;
      P09R23_n217BarTipArt = new boolean[] {false} ;
      P09R23_A209BarPri = new String[] {""} ;
      P09R23_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09R23_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09R23_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09R23_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P09R23_A180BarMaqCod = new String[] {""} ;
      P09R23_A189BarNumAny = new short[1] ;
      P09R23_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R23_A148BarEstReo = new byte[1] ;
      P09R23_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R23_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R23_A1878BarNumTen = new String[] {""} ;
      P09R23_A1500BarNMtr = new String[] {""} ;
      P09R23_A1235BarNumCli = new int[1] ;
      P09R23_A1003BarFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P09R23_n1003BarFecLan = new boolean[] {false} ;
      P09R23_A1652BarSerDsc = new String[] {""} ;
      P09R23_A1798BarDibCli = new String[] {""} ;
      P09R23_A1799BarDibInt = new int[1] ;
      P09R23_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R23_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R23_A1499BarNMez = new String[] {""} ;
      P09R23_A2010BarTipDis = new String[] {""} ;
      P09R23_A252CliCod = new int[1] ;
      P09R23_n252CliCod = new boolean[] {false} ;
      P09R23_A228BarUniMed = new String[] {""} ;
      P09R23_A130BarCodPar = new String[] {""} ;
      P09R23_A132BarCodReo = new byte[1] ;
      P09R23_A129BarCod = new int[1] ;
      P09R23_A213BarSit = new byte[1] ;
      P09R23_A365DisDes = new String[] {""} ;
      A143BarDisNum = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A209BarPri = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A180BarMaqCod = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A1878BarNumTen = "" ;
      A1500BarNMtr = "" ;
      A1003BarFecLan = GXutil.nullDate() ;
      A1652BarSerDsc = "" ;
      A1798BarDibCli = "" ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      A1499BarNMez = "" ;
      A2010BarTipDis = "" ;
      A228BarUniMed = "" ;
      A130BarCodPar = "" ;
      A365DisDes = "" ;
      P09R25_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R25_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R25_A199BarPie1 = new short[1] ;
      P09R25_A898BarPieNDes = new int[1] ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      P09R27_A1538BarCMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R27_A1545BarCPie = new short[1] ;
      P09R27_A1537BarCMLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R27_A1546BarCPLan = new short[1] ;
      A1538BarCMtr = DecimalUtil.ZERO ;
      A1537BarCMLan = DecimalUtil.ZERO ;
      P09R28_A13904BarIntColo = new byte[1] ;
      P09R28_n13904BarIntColo = new boolean[] {false} ;
      P09R28_A13903BarMatColo = new short[1] ;
      P09R28_n13903BarMatColo = new boolean[] {false} ;
      P09R29_A966PartCod = new String[] {""} ;
      P09R29_n966PartCod = new boolean[] {false} ;
      P09R29_A1051DisNumCol = new short[1] ;
      P09R29_n1051DisNumCol = new boolean[] {false} ;
      P09R29_A1031EmpesCod = new String[] {""} ;
      P09R29_n1031EmpesCod = new boolean[] {false} ;
      A966PartCod = "" ;
      A1031EmpesCod = "" ;
      W396EmprCod = "" ;
      AV23BarSer = "" ;
      AV12BarColNom = "" ;
      AV18BarKgmLan = DecimalUtil.ZERO ;
      AV20BarMtrLan = DecimalUtil.ZERO ;
      c1261BarAlbKgmE = DecimalUtil.ZERO ;
      c1263BarAlbMtrE = DecimalUtil.ZERO ;
      P09R210_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R210_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R210_A1265BarAlbPie = new int[1] ;
      AV28CosPrd = DecimalUtil.ZERO ;
      AV30Coste_f = DecimalUtil.ZERO ;
      AV31Coste_lin = DecimalUtil.ZERO ;
      AV33Coste_tin = DecimalUtil.ZERO ;
      AV35CosteFF = DecimalUtil.ZERO ;
      AV36CosteFNF = DecimalUtil.ZERO ;
      AV60HbaCosteT = DecimalUtil.ZERO ;
      AV34CosteExt = DecimalUtil.ZERO ;
      P09R211_A396EmprCod = new String[] {""} ;
      P09R211_A129BarCod = new int[1] ;
      P09R211_A132BarCodReo = new byte[1] ;
      P09R211_A130BarCodPar = new String[] {""} ;
      P09R211_A603MaqCodBis = new String[] {""} ;
      P09R211_A457FasCod = new String[] {""} ;
      P09R211_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R211_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R211_n3837BarFasKgm = new boolean[] {false} ;
      P09R211_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R211_n3838BarFasMtr = new boolean[] {false} ;
      P09R211_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R211_n5719BarFasKgT = new boolean[] {false} ;
      P09R211_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R211_n5720BarFasMtT = new boolean[] {false} ;
      P09R211_A150BarFacTin = new String[] {""} ;
      P09R211_A194BarOrdLin = new short[1] ;
      P09R211_A758ProCod = new String[] {""} ;
      A603MaqCodBis = "" ;
      A457FasCod = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A150BarFacTin = "" ;
      A758ProCod = "" ;
      AV69MaqCod = "" ;
      AV49fascod = "" ;
      AV70MaqCosMin = DecimalUtil.ZERO ;
      AV65Kgm = DecimalUtil.ZERO ;
      AV77Mtr = DecimalUtil.ZERO ;
      AV90TipMaqCod = "" ;
      AV32Coste_m = DecimalUtil.ZERO ;
      AV91TotFac = DecimalUtil.ZERO ;
      AV10BarCodPar = "" ;
      P09R212_A396EmprCod = new String[] {""} ;
      P09R212_A129BarCod = new int[1] ;
      P09R212_A132BarCodReo = new byte[1] ;
      P09R212_A130BarCodPar = new String[] {""} ;
      P09R212_A30AlbProCod = new long[1] ;
      P09R212_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R212_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R212_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R212_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P09R213_A396EmprCod = new String[] {""} ;
      P09R213_A30AlbProCod = new long[1] ;
      P09R213_A129BarCod = new int[1] ;
      P09R213_A132BarCodReo = new byte[1] ;
      P09R213_A130BarCodPar = new String[] {""} ;
      P09R213_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R213_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R213_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R213_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R213_A1240GuiFasLin = new short[1] ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      AV98barcodparm = "" ;
      AV67Lote = "" ;
      AV38Costest = DecimalUtil.ZERO ;
      A507HbaBarPar = "" ;
      A516HbaDisCli = "" ;
      A535HbaSer = "" ;
      A509HbaColNom = "" ;
      A532HbaPri = "" ;
      A523HbaKgm = DecimalUtil.ZERO ;
      A527HbaMtr = DecimalUtil.ZERO ;
      A524HbaKgmEnt = DecimalUtil.ZERO ;
      A528HbaMtrEnt = DecimalUtil.ZERO ;
      A521HbaFecGen = GXutil.nullDate() ;
      A520HbaFecDis = GXutil.nullDate() ;
      A522HbaFecSal = GXutil.nullDate() ;
      A519HbaFecCom = GXutil.nullDate() ;
      A515HbaDia = DecimalUtil.ZERO ;
      A526HbaMaqCod = "" ;
      A533HbaRen = DecimalUtil.ZERO ;
      A534HbaRenRea = DecimalUtil.ZERO ;
      AV99coste_fr = DecimalUtil.ZERO ;
      A514HbaCosPro = DecimalUtil.ZERO ;
      A511HbaCosAny = DecimalUtil.ZERO ;
      A513HbaCosPrd = DecimalUtil.ZERO ;
      A512HbaCosDir = DecimalUtil.ZERO ;
      A518HbaFac = DecimalUtil.ZERO ;
      A6052HbaCosteT = DecimalUtil.ZERO ;
      A6053HbaCosteF = DecimalUtil.ZERO ;
      A525HbaLot = "" ;
      A2292HbaPartCod = "" ;
      A2294HbaNumTin = "" ;
      A2293HbaNh = "" ;
      A2295HbaNomCli = "" ;
      A2760HbaFecLan = GXutil.nullDate() ;
      A2627HbaSerDsc = "" ;
      A2622HbaDibCli = "" ;
      A2624HbaEmpesCo = "" ;
      A5528HbaEncAnh = DecimalUtil.ZERO ;
      A5529HbaEncCom = DecimalUtil.ZERO ;
      A5692HbaNMez = "" ;
      A6051HbaTipDis = "" ;
      A6054HbaFacFS = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P09R215_A396EmprCod = new String[] {""} ;
      P09R215_A129BarCod = new int[1] ;
      P09R215_A132BarCodReo = new byte[1] ;
      P09R215_A130BarCodPar = new String[] {""} ;
      P09R215_A2524DisComLin = new byte[1] ;
      P09R215_A1056DisComCod = new String[] {""} ;
      P09R215_A1032FonCod = new String[] {""} ;
      P09R215_A1541BarComMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R215_n1541BarComMtr = new boolean[] {false} ;
      P09R215_A1543BarComPie = new short[1] ;
      P09R215_n1543BarComPie = new boolean[] {false} ;
      P09R215_A2071BarMtrEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R215_n2071BarMtrEst = new boolean[] {false} ;
      P09R215_A1540BarComMLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R215_n1540BarComMLan = new boolean[] {false} ;
      P09R215_A1544BarComPLan = new short[1] ;
      P09R215_n1544BarComPLan = new boolean[] {false} ;
      P09R215_A1539BarComAnh = new short[1] ;
      P09R215_n1539BarComAnh = new boolean[] {false} ;
      P09R215_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09R215_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09R215_A2515BarGasEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R215_n2515BarGasEst = new boolean[] {false} ;
      P09R215_A2514BarGasEmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R215_n2514BarGasEmp = new boolean[] {false} ;
      P09R215_A2516BarGasOpe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R215_n2516BarGasOpe = new boolean[] {false} ;
      P09R215_A2513BarGasAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R215_n2513BarGasAca = new boolean[] {false} ;
      P09R215_A2517BarPrcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R215_n2517BarPrcMtr = new boolean[] {false} ;
      P09R215_A2511BarComRep = new byte[1] ;
      P09R215_n2511BarComRep = new boolean[] {false} ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      A2071BarMtrEst = DecimalUtil.ZERO ;
      A1540BarComMLan = DecimalUtil.ZERO ;
      A2515BarGasEst = DecimalUtil.ZERO ;
      A2514BarGasEmp = DecimalUtil.ZERO ;
      A2516BarGasOpe = DecimalUtil.ZERO ;
      A2513BarGasAca = DecimalUtil.ZERO ;
      A2517BarPrcMtr = DecimalUtil.ZERO ;
      A2606HbaComCod = "" ;
      A2625HbaFonCod = "" ;
      A2612HbaComMDis = DecimalUtil.ZERO ;
      A2614HbaComMEst = DecimalUtil.ZERO ;
      A2615HbaComMRep = DecimalUtil.ZERO ;
      A2613HbaComMEnt = DecimalUtil.ZERO ;
      A2610HbaComFecP = GXutil.nullDate() ;
      A2609HbaComFecE = GXutil.nullDate() ;
      A2608HbaComEstC = DecimalUtil.ZERO ;
      A2607HbaComEmpC = DecimalUtil.ZERO ;
      A2616HbaComOpeC = DecimalUtil.ZERO ;
      A2604HbaComAcaC = DecimalUtil.ZERO ;
      A2620HbaComPre = DecimalUtil.ZERO ;
      AV22BarPri = "" ;
      AV58FlagTin = "" ;
      P09R217_A396EmprCod = new String[] {""} ;
      P09R217_A129BarCod = new int[1] ;
      P09R217_A132BarCodReo = new byte[1] ;
      P09R217_A130BarCodPar = new String[] {""} ;
      P09R217_A150BarFacTin = new String[] {""} ;
      P09R217_A194BarOrdLin = new short[1] ;
      P09R217_A758ProCod = new String[] {""} ;
      AV47FacSerNum = "" ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int2 = new byte[1] ;
      W1013DibCli = "" ;
      A1013DibCli = "" ;
      A3913DibSerFac = "" ;
      A1137MtrEst1 = DecimalUtil.ZERO ;
      A1086MtrEst = DecimalUtil.ZERO ;
      P09R220_A396EmprCod = new String[] {""} ;
      P09R220_A1013DibCli = new String[] {""} ;
      P09R220_A252CliCod = new int[1] ;
      P09R220_n252CliCod = new boolean[] {false} ;
      P09R220_A1014DibInt = new int[1] ;
      P09R220_A425EstAny = new short[1] ;
      P09R220_A3913DibSerFac = new String[] {""} ;
      P09R220_A426EstMes = new byte[1] ;
      P09R220_A1137MtrEst1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R220_n1137MtrEst1 = new boolean[] {false} ;
      P09R220_A1086MtrEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R220_n1086MtrEst = new boolean[] {false} ;
      P09R223_A396EmprCod = new String[] {""} ;
      P09R223_A129BarCod = new int[1] ;
      P09R223_A132BarCodReo = new byte[1] ;
      P09R223_A130BarCodPar = new String[] {""} ;
      P09R223_A457FasCod = new String[] {""} ;
      P09R223_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R223_A30AlbProCod = new long[1] ;
      P09R223_A1240GuiFasLin = new short[1] ;
      AV73MaqMOD = DecimalUtil.ZERO ;
      AV74MaqMOI = DecimalUtil.ZERO ;
      AV71MaqEnerg = DecimalUtil.ZERO ;
      AV72MaqGas = DecimalUtil.ZERO ;
      AV68MaqAgua = DecimalUtil.ZERO ;
      P09R224_A396EmprCod = new String[] {""} ;
      P09R224_A602MaqCod = new String[] {""} ;
      P09R224_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R224_n605MaqCosMin = new boolean[] {false} ;
      P09R224_A11825MaqAgua = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R224_n11825MaqAgua = new boolean[] {false} ;
      P09R224_A11824MaqGas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R224_n11824MaqGas = new boolean[] {false} ;
      P09R224_A11823MaqEnerg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R224_n11823MaqEnerg = new boolean[] {false} ;
      P09R224_A11822MaqMOI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R224_n11822MaqMOI = new boolean[] {false} ;
      P09R224_A11821MaqMOD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09R224_n11821MaqMOD = new boolean[] {false} ;
      P09R224_A1011TipMaqCod = new String[] {""} ;
      P09R224_n1011TipMaqCod = new boolean[] {false} ;
      A602MaqCod = "" ;
      A605MaqCosMin = DecimalUtil.ZERO ;
      A11825MaqAgua = DecimalUtil.ZERO ;
      A11824MaqGas = DecimalUtil.ZERO ;
      A11823MaqEnerg = DecimalUtil.ZERO ;
      A11822MaqMOI = DecimalUtil.ZERO ;
      A11821MaqMOD = DecimalUtil.ZERO ;
      A1011TipMaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc343__default(),
         new Object[] {
             new Object[] {
            P09R22_A396EmprCod, P09R22_A963Ser1, P09R22_n963Ser1, P09R22_A964Ser0, P09R22_n964Ser0, P09R22_A2387Ser2, P09R22_n2387Ser2, P09R22_A2388Ser20, P09R22_n2388Ser20, P09R22_A2389Ser3,
            P09R22_n2389Ser3, P09R22_A2390Ser30, P09R22_n2390Ser30
            }
            , new Object[] {
            P09R23_A396EmprCod, P09R23_A361DisCod, P09R23_A143BarDisNum, P09R23_A212BarSer, P09R23_A135BarColNom, P09R23_A136BarColNum, P09R23_A218BarTipCol, P09R23_A217BarTipArt, P09R23_n217BarTipArt, P09R23_A209BarPri,
            P09R23_A159BarFecGen, P09R23_A155BarFecCli, P09R23_A161BarFecSal, P09R23_A158BarFecFpr, P09R23_A180BarMaqCod, P09R23_A189BarNumAny, P09R23_A211BarRdt, P09R23_A148BarEstReo, P09R23_A140BarCosAny, P09R23_A141BarCosPro,
            P09R23_A1878BarNumTen, P09R23_A1500BarNMtr, P09R23_A1235BarNumCli, P09R23_A1003BarFecLan, P09R23_n1003BarFecLan, P09R23_A1652BarSerDsc, P09R23_A1798BarDibCli, P09R23_A1799BarDibInt, P09R23_A1224BarEncAnh, P09R23_A1223BarEncCom,
            P09R23_A1499BarNMez, P09R23_A2010BarTipDis, P09R23_A252CliCod, P09R23_n252CliCod, P09R23_A228BarUniMed, P09R23_A130BarCodPar, P09R23_A132BarCodReo, P09R23_A129BarCod, P09R23_A213BarSit, P09R23_A365DisDes
            }
            , new Object[] {
            P09R25_A166BarKgm, P09R25_A184BarMtr, P09R25_A199BarPie1, P09R25_A898BarPieNDes
            }
            , new Object[] {
            P09R27_A1538BarCMtr, P09R27_A1545BarCPie, P09R27_A1537BarCMLan, P09R27_A1546BarCPLan
            }
            , new Object[] {
            P09R28_A13904BarIntColo, P09R28_n13904BarIntColo, P09R28_A13903BarMatColo, P09R28_n13903BarMatColo
            }
            , new Object[] {
            P09R29_A966PartCod, P09R29_n966PartCod, P09R29_A1051DisNumCol, P09R29_n1051DisNumCol, P09R29_A1031EmpesCod, P09R29_n1031EmpesCod
            }
            , new Object[] {
            P09R210_A1261BarAlbKgmE, P09R210_A1263BarAlbMtrE, P09R210_A1265BarAlbPie
            }
            , new Object[] {
            P09R211_A396EmprCod, P09R211_A129BarCod, P09R211_A132BarCodReo, P09R211_A130BarCodPar, P09R211_A603MaqCodBis, P09R211_A457FasCod, P09R211_A215BarTieRea, P09R211_A3837BarFasKgm, P09R211_n3837BarFasKgm, P09R211_A3838BarFasMtr,
            P09R211_n3838BarFasMtr, P09R211_A5719BarFasKgT, P09R211_n5719BarFasKgT, P09R211_A5720BarFasMtT, P09R211_n5720BarFasMtT, P09R211_A150BarFacTin, P09R211_A194BarOrdLin, P09R211_A758ProCod
            }
            , new Object[] {
            P09R212_A396EmprCod, P09R212_A129BarCod, P09R212_A132BarCodReo, P09R212_A130BarCodPar, P09R212_A30AlbProCod, P09R212_A1264BarPreMtr, P09R212_A1263BarAlbMtrE, P09R212_A1262BarPreKgm, P09R212_A1261BarAlbKgmE
            }
            , new Object[] {
            P09R213_A396EmprCod, P09R213_A30AlbProCod, P09R213_A129BarCod, P09R213_A132BarCodReo, P09R213_A130BarCodPar, P09R213_A1242GuiFasPMt, P09R213_A1276FasMtr, P09R213_A1241GuiFasPKg, P09R213_A1275FasKgm, P09R213_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            P09R215_A396EmprCod, P09R215_A129BarCod, P09R215_A132BarCodReo, P09R215_A130BarCodPar, P09R215_A2524DisComLin, P09R215_A1056DisComCod, P09R215_A1032FonCod, P09R215_A1541BarComMtr, P09R215_n1541BarComMtr, P09R215_A1543BarComPie,
            P09R215_n1543BarComPie, P09R215_A2071BarMtrEst, P09R215_n2071BarMtrEst, P09R215_A1540BarComMLan, P09R215_n1540BarComMLan, P09R215_A1544BarComPLan, P09R215_n1544BarComPLan, P09R215_A1539BarComAnh, P09R215_n1539BarComAnh, P09R215_A155BarFecCli,
            P09R215_A161BarFecSal, P09R215_A2515BarGasEst, P09R215_n2515BarGasEst, P09R215_A2514BarGasEmp, P09R215_n2514BarGasEmp, P09R215_A2516BarGasOpe, P09R215_n2516BarGasOpe, P09R215_A2513BarGasAca, P09R215_n2513BarGasAca, P09R215_A2517BarPrcMtr,
            P09R215_n2517BarPrcMtr, P09R215_A2511BarComRep, P09R215_n2511BarComRep
            }
            , new Object[] {
            }
            , new Object[] {
            P09R217_A396EmprCod, P09R217_A129BarCod, P09R217_A132BarCodReo, P09R217_A130BarCodPar, P09R217_A150BarFacTin, P09R217_A194BarOrdLin, P09R217_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P09R220_A396EmprCod, P09R220_A1013DibCli, P09R220_A252CliCod, P09R220_A1014DibInt, P09R220_A425EstAny, P09R220_A3913DibSerFac, P09R220_A426EstMes, P09R220_A1137MtrEst1, P09R220_n1137MtrEst1, P09R220_A1086MtrEst,
            P09R220_n1086MtrEst
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P09R223_A396EmprCod, P09R223_A129BarCod, P09R223_A132BarCodReo, P09R223_A130BarCodPar, P09R223_A457FasCod, P09R223_A1241GuiFasPKg, P09R223_A30AlbProCod, P09R223_A1240GuiFasLin
            }
            , new Object[] {
            P09R224_A396EmprCod, P09R224_A602MaqCod, P09R224_A605MaqCosMin, P09R224_n605MaqCosMin, P09R224_A11825MaqAgua, P09R224_n11825MaqAgua, P09R224_A11824MaqGas, P09R224_n11824MaqGas, P09R224_A11823MaqEnerg, P09R224_n11823MaqEnerg,
            P09R224_A11822MaqMOI, P09R224_n11822MaqMOI, P09R224_A11821MaqMOD, P09R224_n11821MaqMOD, P09R224_A1011TipMaqCod, P09R224_n1011TipMaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV80r ;
   private byte AV52FlagEst ;
   private byte AV46F_tinamar ;
   private byte AV88TasasEstandar ;
   private byte AV92Vertex ;
   private byte AV100costefabricari ;
   private byte GXt_int1 ;
   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A13904BarIntColo ;
   private byte AV25BarTipCol ;
   private byte AV64IntCod ;
   private byte AV76Min ;
   private byte AV8Albfas ;
   private byte AV11BarCodReo ;
   private byte AV97barcodreom ;
   private byte A508HbaBarReo ;
   private byte A537HbaTipCol ;
   private byte A517HbaEstReo ;
   private byte A5721HbaIntCod ;
   private byte A2524DisComLin ;
   private byte A2511BarComRep ;
   private byte A2611HbaComLin ;
   private byte A2621HbaComPRep ;
   private byte GXv_int2[] ;
   private byte A426EstMes ;
   private short A217BarTipArt ;
   private short A189BarNumAny ;
   private short A199BarPie1 ;
   private short A1545BarCPie ;
   private short A1546BarCPLan ;
   private short A13903BarMatColo ;
   private short A1051DisNumCol ;
   private short AV24BarTipArt ;
   private short AV75matcod ;
   private short AV21BarPieLan ;
   private short c1265BarAlbPie ;
   private short A194BarOrdLin ;
   private short A1240GuiFasLin ;
   private short A536HbaTipArt ;
   private short A530HbaPie ;
   private short A531HbaPieEnt ;
   private short A505HbaAny ;
   private short A2626HbaNumCol ;
   private short A14121HbaMatCod ;
   private short Gx_err ;
   private short A1543BarComPie ;
   private short A1544BarComPLan ;
   private short A1539BarComAnh ;
   private short A2617HbaComPDis ;
   private short A2619HbaComPEst ;
   private short A2618HbaComPEnt ;
   private short A2605HbaComAnh ;
   private short GXv_int11[] ;
   private short A425EstAny ;
   private int AV63Hdr ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A1799BarDibInt ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV26CliCod ;
   private int AV13BarColNum ;
   private int AV89Tiempo_m ;
   private int AV9BarCod ;
   private int AV96barcodm ;
   private int GX_INS55 ;
   private int A506HbaBarCod ;
   private int A529HbaNumDis ;
   private int A510HbaColNum ;
   private int A2296HbaNumCli ;
   private int A2623HbaDibInt ;
   private int GX_INS573 ;
   private int GXv_int4[] ;
   private int GX_INS546 ;
   private int W1014DibInt ;
   private int A1014DibInt ;
   private int GX_INS547 ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A1538BarCMtr ;
   private java.math.BigDecimal A1537BarCMLan ;
   private java.math.BigDecimal AV18BarKgmLan ;
   private java.math.BigDecimal AV20BarMtrLan ;
   private java.math.BigDecimal c1261BarAlbKgmE ;
   private java.math.BigDecimal c1263BarAlbMtrE ;
   private java.math.BigDecimal AV28CosPrd ;
   private java.math.BigDecimal AV30Coste_f ;
   private java.math.BigDecimal AV31Coste_lin ;
   private java.math.BigDecimal AV33Coste_tin ;
   private java.math.BigDecimal AV35CosteFF ;
   private java.math.BigDecimal AV36CosteFNF ;
   private java.math.BigDecimal AV60HbaCosteT ;
   private java.math.BigDecimal AV34CosteExt ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal AV70MaqCosMin ;
   private java.math.BigDecimal AV65Kgm ;
   private java.math.BigDecimal AV77Mtr ;
   private java.math.BigDecimal AV32Coste_m ;
   private java.math.BigDecimal AV91TotFac ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal AV38Costest ;
   private java.math.BigDecimal A523HbaKgm ;
   private java.math.BigDecimal A527HbaMtr ;
   private java.math.BigDecimal A524HbaKgmEnt ;
   private java.math.BigDecimal A528HbaMtrEnt ;
   private java.math.BigDecimal A515HbaDia ;
   private java.math.BigDecimal A533HbaRen ;
   private java.math.BigDecimal A534HbaRenRea ;
   private java.math.BigDecimal AV99coste_fr ;
   private java.math.BigDecimal A514HbaCosPro ;
   private java.math.BigDecimal A511HbaCosAny ;
   private java.math.BigDecimal A513HbaCosPrd ;
   private java.math.BigDecimal A512HbaCosDir ;
   private java.math.BigDecimal A518HbaFac ;
   private java.math.BigDecimal A6052HbaCosteT ;
   private java.math.BigDecimal A6053HbaCosteF ;
   private java.math.BigDecimal A5528HbaEncAnh ;
   private java.math.BigDecimal A5529HbaEncCom ;
   private java.math.BigDecimal A6054HbaFacFS ;
   private java.math.BigDecimal A1541BarComMtr ;
   private java.math.BigDecimal A2071BarMtrEst ;
   private java.math.BigDecimal A1540BarComMLan ;
   private java.math.BigDecimal A2515BarGasEst ;
   private java.math.BigDecimal A2514BarGasEmp ;
   private java.math.BigDecimal A2516BarGasOpe ;
   private java.math.BigDecimal A2513BarGasAca ;
   private java.math.BigDecimal A2517BarPrcMtr ;
   private java.math.BigDecimal A2612HbaComMDis ;
   private java.math.BigDecimal A2614HbaComMEst ;
   private java.math.BigDecimal A2615HbaComMRep ;
   private java.math.BigDecimal A2613HbaComMEnt ;
   private java.math.BigDecimal A2608HbaComEstC ;
   private java.math.BigDecimal A2607HbaComEmpC ;
   private java.math.BigDecimal A2616HbaComOpeC ;
   private java.math.BigDecimal A2604HbaComAcaC ;
   private java.math.BigDecimal A2620HbaComPre ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal A1137MtrEst1 ;
   private java.math.BigDecimal A1086MtrEst ;
   private java.math.BigDecimal AV73MaqMOD ;
   private java.math.BigDecimal AV74MaqMOI ;
   private java.math.BigDecimal AV71MaqEnerg ;
   private java.math.BigDecimal AV72MaqGas ;
   private java.math.BigDecimal AV68MaqAgua ;
   private java.math.BigDecimal A605MaqCosMin ;
   private java.math.BigDecimal A11825MaqAgua ;
   private java.math.BigDecimal A11824MaqGas ;
   private java.math.BigDecimal A11823MaqEnerg ;
   private java.math.BigDecimal A11822MaqMOI ;
   private java.math.BigDecimal A11821MaqMOD ;
   private String A396EmprCod ;
   private String AV78p ;
   private String AV48Factur ;
   private String scmdbuf ;
   private String A963Ser1 ;
   private String A964Ser0 ;
   private String A2387Ser2 ;
   private String A2388Ser20 ;
   private String A2389Ser3 ;
   private String A2390Ser30 ;
   private String AV83Ser1 ;
   private String AV82Ser0 ;
   private String AV84Ser2 ;
   private String AV85Ser20 ;
   private String AV86Ser3 ;
   private String AV87Ser30 ;
   private String A143BarDisNum ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A209BarPri ;
   private String A180BarMaqCod ;
   private String A1878BarNumTen ;
   private String A1500BarNMtr ;
   private String A1652BarSerDsc ;
   private String A1798BarDibCli ;
   private String A1499BarNMez ;
   private String A2010BarTipDis ;
   private String A228BarUniMed ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String A966PartCod ;
   private String A1031EmpesCod ;
   private String W396EmprCod ;
   private String AV23BarSer ;
   private String AV12BarColNom ;
   private String A603MaqCodBis ;
   private String A457FasCod ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String AV69MaqCod ;
   private String AV49fascod ;
   private String AV90TipMaqCod ;
   private String AV10BarCodPar ;
   private String AV98barcodparm ;
   private String AV67Lote ;
   private String A507HbaBarPar ;
   private String A516HbaDisCli ;
   private String A535HbaSer ;
   private String A509HbaColNom ;
   private String A532HbaPri ;
   private String A526HbaMaqCod ;
   private String A525HbaLot ;
   private String A2292HbaPartCod ;
   private String A2294HbaNumTin ;
   private String A2293HbaNh ;
   private String A2295HbaNomCli ;
   private String A2627HbaSerDsc ;
   private String A2622HbaDibCli ;
   private String A2624HbaEmpesCo ;
   private String A5692HbaNMez ;
   private String A6051HbaTipDis ;
   private String Gx_emsg ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String A2606HbaComCod ;
   private String A2625HbaFonCod ;
   private String AV22BarPri ;
   private String AV58FlagTin ;
   private String AV47FacSerNum ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private String GXv_char7[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String W1013DibCli ;
   private String A1013DibCli ;
   private String A3913DibSerFac ;
   private String A602MaqCod ;
   private String A1011TipMaqCod ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A1003BarFecLan ;
   private java.util.Date A521HbaFecGen ;
   private java.util.Date A520HbaFecDis ;
   private java.util.Date A522HbaFecSal ;
   private java.util.Date A519HbaFecCom ;
   private java.util.Date A2760HbaFecLan ;
   private java.util.Date A2610HbaComFecP ;
   private java.util.Date A2609HbaComFecE ;
   private java.util.Date GXv_date8[] ;
   private boolean n963Ser1 ;
   private boolean n964Ser0 ;
   private boolean n2387Ser2 ;
   private boolean n2388Ser20 ;
   private boolean n2389Ser3 ;
   private boolean n2390Ser30 ;
   private boolean n217BarTipArt ;
   private boolean n1003BarFecLan ;
   private boolean n252CliCod ;
   private boolean n13904BarIntColo ;
   private boolean n13903BarMatColo ;
   private boolean n966PartCod ;
   private boolean n1051DisNumCol ;
   private boolean n1031EmpesCod ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean n5719BarFasKgT ;
   private boolean n5720BarFasMtT ;
   private boolean returnInSub ;
   private boolean n529HbaNumDis ;
   private boolean n516HbaDisCli ;
   private boolean n535HbaSer ;
   private boolean n509HbaColNom ;
   private boolean n510HbaColNum ;
   private boolean n537HbaTipCol ;
   private boolean n536HbaTipArt ;
   private boolean n532HbaPri ;
   private boolean n523HbaKgm ;
   private boolean n527HbaMtr ;
   private boolean n530HbaPie ;
   private boolean n524HbaKgmEnt ;
   private boolean n528HbaMtrEnt ;
   private boolean n531HbaPieEnt ;
   private boolean n521HbaFecGen ;
   private boolean n520HbaFecDis ;
   private boolean n522HbaFecSal ;
   private boolean n519HbaFecCom ;
   private boolean n515HbaDia ;
   private boolean n526HbaMaqCod ;
   private boolean n505HbaAny ;
   private boolean n533HbaRen ;
   private boolean n534HbaRenRea ;
   private boolean n514HbaCosPro ;
   private boolean n511HbaCosAny ;
   private boolean n513HbaCosPrd ;
   private boolean n512HbaCosDir ;
   private boolean n518HbaFac ;
   private boolean n6052HbaCosteT ;
   private boolean n6053HbaCosteF ;
   private boolean n517HbaEstReo ;
   private boolean n525HbaLot ;
   private boolean n2292HbaPartCod ;
   private boolean n2294HbaNumTin ;
   private boolean n2293HbaNh ;
   private boolean n2295HbaNomCli ;
   private boolean n2296HbaNumCli ;
   private boolean n2760HbaFecLan ;
   private boolean n2627HbaSerDsc ;
   private boolean n2622HbaDibCli ;
   private boolean n2623HbaDibInt ;
   private boolean n2626HbaNumCol ;
   private boolean n2624HbaEmpesCo ;
   private boolean n5528HbaEncAnh ;
   private boolean n5529HbaEncCom ;
   private boolean n5692HbaNMez ;
   private boolean n5721HbaIntCod ;
   private boolean n6051HbaTipDis ;
   private boolean n6054HbaFacFS ;
   private boolean n14121HbaMatCod ;
   private boolean n1541BarComMtr ;
   private boolean n1543BarComPie ;
   private boolean n2071BarMtrEst ;
   private boolean n1540BarComMLan ;
   private boolean n1544BarComPLan ;
   private boolean n1539BarComAnh ;
   private boolean n2515BarGasEst ;
   private boolean n2514BarGasEmp ;
   private boolean n2516BarGasOpe ;
   private boolean n2513BarGasAca ;
   private boolean n2517BarPrcMtr ;
   private boolean n2511BarComRep ;
   private boolean n2612HbaComMDis ;
   private boolean n2617HbaComPDis ;
   private boolean n2614HbaComMEst ;
   private boolean n2619HbaComPEst ;
   private boolean n2615HbaComMRep ;
   private boolean n2621HbaComPRep ;
   private boolean n2613HbaComMEnt ;
   private boolean n2618HbaComPEnt ;
   private boolean n2605HbaComAnh ;
   private boolean n2610HbaComFecP ;
   private boolean n2609HbaComFecE ;
   private boolean n2608HbaComEstC ;
   private boolean n2607HbaComEmpC ;
   private boolean n2616HbaComOpeC ;
   private boolean n2604HbaComAcaC ;
   private boolean n2620HbaComPre ;
   private boolean n1137MtrEst1 ;
   private boolean n1086MtrEst ;
   private boolean n605MaqCosMin ;
   private boolean n11825MaqAgua ;
   private boolean n11824MaqGas ;
   private boolean n11823MaqEnerg ;
   private boolean n11822MaqMOI ;
   private boolean n11821MaqMOD ;
   private boolean n1011TipMaqCod ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P09R22_A396EmprCod ;
   private String[] P09R22_A963Ser1 ;
   private boolean[] P09R22_n963Ser1 ;
   private String[] P09R22_A964Ser0 ;
   private boolean[] P09R22_n964Ser0 ;
   private String[] P09R22_A2387Ser2 ;
   private boolean[] P09R22_n2387Ser2 ;
   private String[] P09R22_A2388Ser20 ;
   private boolean[] P09R22_n2388Ser20 ;
   private String[] P09R22_A2389Ser3 ;
   private boolean[] P09R22_n2389Ser3 ;
   private String[] P09R22_A2390Ser30 ;
   private boolean[] P09R22_n2390Ser30 ;
   private String[] P09R23_A396EmprCod ;
   private int[] P09R23_A361DisCod ;
   private String[] P09R23_A143BarDisNum ;
   private String[] P09R23_A212BarSer ;
   private String[] P09R23_A135BarColNom ;
   private int[] P09R23_A136BarColNum ;
   private byte[] P09R23_A218BarTipCol ;
   private short[] P09R23_A217BarTipArt ;
   private boolean[] P09R23_n217BarTipArt ;
   private String[] P09R23_A209BarPri ;
   private java.util.Date[] P09R23_A159BarFecGen ;
   private java.util.Date[] P09R23_A155BarFecCli ;
   private java.util.Date[] P09R23_A161BarFecSal ;
   private java.util.Date[] P09R23_A158BarFecFpr ;
   private String[] P09R23_A180BarMaqCod ;
   private short[] P09R23_A189BarNumAny ;
   private java.math.BigDecimal[] P09R23_A211BarRdt ;
   private byte[] P09R23_A148BarEstReo ;
   private java.math.BigDecimal[] P09R23_A140BarCosAny ;
   private java.math.BigDecimal[] P09R23_A141BarCosPro ;
   private String[] P09R23_A1878BarNumTen ;
   private String[] P09R23_A1500BarNMtr ;
   private int[] P09R23_A1235BarNumCli ;
   private java.util.Date[] P09R23_A1003BarFecLan ;
   private boolean[] P09R23_n1003BarFecLan ;
   private String[] P09R23_A1652BarSerDsc ;
   private String[] P09R23_A1798BarDibCli ;
   private int[] P09R23_A1799BarDibInt ;
   private java.math.BigDecimal[] P09R23_A1224BarEncAnh ;
   private java.math.BigDecimal[] P09R23_A1223BarEncCom ;
   private String[] P09R23_A1499BarNMez ;
   private String[] P09R23_A2010BarTipDis ;
   private int[] P09R23_A252CliCod ;
   private boolean[] P09R23_n252CliCod ;
   private String[] P09R23_A228BarUniMed ;
   private String[] P09R23_A130BarCodPar ;
   private byte[] P09R23_A132BarCodReo ;
   private int[] P09R23_A129BarCod ;
   private byte[] P09R23_A213BarSit ;
   private String[] P09R23_A365DisDes ;
   private java.math.BigDecimal[] P09R25_A166BarKgm ;
   private java.math.BigDecimal[] P09R25_A184BarMtr ;
   private short[] P09R25_A199BarPie1 ;
   private int[] P09R25_A898BarPieNDes ;
   private java.math.BigDecimal[] P09R27_A1538BarCMtr ;
   private short[] P09R27_A1545BarCPie ;
   private java.math.BigDecimal[] P09R27_A1537BarCMLan ;
   private short[] P09R27_A1546BarCPLan ;
   private byte[] P09R28_A13904BarIntColo ;
   private boolean[] P09R28_n13904BarIntColo ;
   private short[] P09R28_A13903BarMatColo ;
   private boolean[] P09R28_n13903BarMatColo ;
   private String[] P09R29_A966PartCod ;
   private boolean[] P09R29_n966PartCod ;
   private short[] P09R29_A1051DisNumCol ;
   private boolean[] P09R29_n1051DisNumCol ;
   private String[] P09R29_A1031EmpesCod ;
   private boolean[] P09R29_n1031EmpesCod ;
   private java.math.BigDecimal[] P09R210_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P09R210_A1263BarAlbMtrE ;
   private int[] P09R210_A1265BarAlbPie ;
   private String[] P09R211_A396EmprCod ;
   private int[] P09R211_A129BarCod ;
   private byte[] P09R211_A132BarCodReo ;
   private String[] P09R211_A130BarCodPar ;
   private String[] P09R211_A603MaqCodBis ;
   private String[] P09R211_A457FasCod ;
   private java.math.BigDecimal[] P09R211_A215BarTieRea ;
   private java.math.BigDecimal[] P09R211_A3837BarFasKgm ;
   private boolean[] P09R211_n3837BarFasKgm ;
   private java.math.BigDecimal[] P09R211_A3838BarFasMtr ;
   private boolean[] P09R211_n3838BarFasMtr ;
   private java.math.BigDecimal[] P09R211_A5719BarFasKgT ;
   private boolean[] P09R211_n5719BarFasKgT ;
   private java.math.BigDecimal[] P09R211_A5720BarFasMtT ;
   private boolean[] P09R211_n5720BarFasMtT ;
   private String[] P09R211_A150BarFacTin ;
   private short[] P09R211_A194BarOrdLin ;
   private String[] P09R211_A758ProCod ;
   private String[] P09R212_A396EmprCod ;
   private int[] P09R212_A129BarCod ;
   private byte[] P09R212_A132BarCodReo ;
   private String[] P09R212_A130BarCodPar ;
   private long[] P09R212_A30AlbProCod ;
   private java.math.BigDecimal[] P09R212_A1264BarPreMtr ;
   private java.math.BigDecimal[] P09R212_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P09R212_A1262BarPreKgm ;
   private java.math.BigDecimal[] P09R212_A1261BarAlbKgmE ;
   private String[] P09R213_A396EmprCod ;
   private long[] P09R213_A30AlbProCod ;
   private int[] P09R213_A129BarCod ;
   private byte[] P09R213_A132BarCodReo ;
   private String[] P09R213_A130BarCodPar ;
   private java.math.BigDecimal[] P09R213_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P09R213_A1276FasMtr ;
   private java.math.BigDecimal[] P09R213_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P09R213_A1275FasKgm ;
   private short[] P09R213_A1240GuiFasLin ;
   private String[] P09R215_A396EmprCod ;
   private int[] P09R215_A129BarCod ;
   private byte[] P09R215_A132BarCodReo ;
   private String[] P09R215_A130BarCodPar ;
   private byte[] P09R215_A2524DisComLin ;
   private String[] P09R215_A1056DisComCod ;
   private String[] P09R215_A1032FonCod ;
   private java.math.BigDecimal[] P09R215_A1541BarComMtr ;
   private boolean[] P09R215_n1541BarComMtr ;
   private short[] P09R215_A1543BarComPie ;
   private boolean[] P09R215_n1543BarComPie ;
   private java.math.BigDecimal[] P09R215_A2071BarMtrEst ;
   private boolean[] P09R215_n2071BarMtrEst ;
   private java.math.BigDecimal[] P09R215_A1540BarComMLan ;
   private boolean[] P09R215_n1540BarComMLan ;
   private short[] P09R215_A1544BarComPLan ;
   private boolean[] P09R215_n1544BarComPLan ;
   private short[] P09R215_A1539BarComAnh ;
   private boolean[] P09R215_n1539BarComAnh ;
   private java.util.Date[] P09R215_A155BarFecCli ;
   private java.util.Date[] P09R215_A161BarFecSal ;
   private java.math.BigDecimal[] P09R215_A2515BarGasEst ;
   private boolean[] P09R215_n2515BarGasEst ;
   private java.math.BigDecimal[] P09R215_A2514BarGasEmp ;
   private boolean[] P09R215_n2514BarGasEmp ;
   private java.math.BigDecimal[] P09R215_A2516BarGasOpe ;
   private boolean[] P09R215_n2516BarGasOpe ;
   private java.math.BigDecimal[] P09R215_A2513BarGasAca ;
   private boolean[] P09R215_n2513BarGasAca ;
   private java.math.BigDecimal[] P09R215_A2517BarPrcMtr ;
   private boolean[] P09R215_n2517BarPrcMtr ;
   private byte[] P09R215_A2511BarComRep ;
   private boolean[] P09R215_n2511BarComRep ;
   private String[] P09R217_A396EmprCod ;
   private int[] P09R217_A129BarCod ;
   private byte[] P09R217_A132BarCodReo ;
   private String[] P09R217_A130BarCodPar ;
   private String[] P09R217_A150BarFacTin ;
   private short[] P09R217_A194BarOrdLin ;
   private String[] P09R217_A758ProCod ;
   private String[] P09R220_A396EmprCod ;
   private String[] P09R220_A1013DibCli ;
   private int[] P09R220_A252CliCod ;
   private boolean[] P09R220_n252CliCod ;
   private int[] P09R220_A1014DibInt ;
   private short[] P09R220_A425EstAny ;
   private String[] P09R220_A3913DibSerFac ;
   private byte[] P09R220_A426EstMes ;
   private java.math.BigDecimal[] P09R220_A1137MtrEst1 ;
   private boolean[] P09R220_n1137MtrEst1 ;
   private java.math.BigDecimal[] P09R220_A1086MtrEst ;
   private boolean[] P09R220_n1086MtrEst ;
   private String[] P09R223_A396EmprCod ;
   private int[] P09R223_A129BarCod ;
   private byte[] P09R223_A132BarCodReo ;
   private String[] P09R223_A130BarCodPar ;
   private String[] P09R223_A457FasCod ;
   private java.math.BigDecimal[] P09R223_A1241GuiFasPKg ;
   private long[] P09R223_A30AlbProCod ;
   private short[] P09R223_A1240GuiFasLin ;
   private String[] P09R224_A396EmprCod ;
   private String[] P09R224_A602MaqCod ;
   private java.math.BigDecimal[] P09R224_A605MaqCosMin ;
   private boolean[] P09R224_n605MaqCosMin ;
   private java.math.BigDecimal[] P09R224_A11825MaqAgua ;
   private boolean[] P09R224_n11825MaqAgua ;
   private java.math.BigDecimal[] P09R224_A11824MaqGas ;
   private boolean[] P09R224_n11824MaqGas ;
   private java.math.BigDecimal[] P09R224_A11823MaqEnerg ;
   private boolean[] P09R224_n11823MaqEnerg ;
   private java.math.BigDecimal[] P09R224_A11822MaqMOI ;
   private boolean[] P09R224_n11822MaqMOI ;
   private java.math.BigDecimal[] P09R224_A11821MaqMOD ;
   private boolean[] P09R224_n11821MaqMOD ;
   private String[] P09R224_A1011TipMaqCod ;
   private boolean[] P09R224_n1011TipMaqCod ;
}

final  class pprc343__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09R22", "SELECT EmprCod, Ser1, Ser0, Ser2, Ser20, Ser3, Ser30 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09R23", "SELECT EmprCod, DisCod, BarDisNum, BarSer, BarColNom, BarColNum, BarTipCol, BarTipArt, BarPri, BarFecGen, BarFecCli, BarFecSal, BarFecFpr, BarMaqCod, BarNumAny, BarRdt, BarEstReo, BarCosAny, BarCosPro, BarNumTen, BarNMtr, BarNumCli, BarFecLan, BarSerDsc, BarDibCli, BarDibInt, BarEncAnh, BarEncCom, BarNMez, BarTipDis, CliCod, BarUniMed, BarCodPar, BarCodReo, BarCod, BarSit, DisDes FROM TXPBARCAD WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)  FOR UPDATE OF BarSit NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09R25", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarMtr, 0) AS BarMtr, COALESCE( T1.BarPie1, 0) AS BarPie1, COALESCE( T1.BarPieNDes, 0) AS BarPieNDes FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09R27", "SELECT COALESCE( T1.BarCMtr, 0) AS BarCMtr, COALESCE( T1.BarCPie, 0) AS BarCPie, COALESCE( T1.BarCMLan, 0) AS BarCMLan, COALESCE( T1.BarCPLan, 0) AS BarCPLan FROM (SELECT SUM(BarComMtr) AS BarCMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarComPie) AS BarCPie, SUM(BarComMLan) AS BarCMLan, SUM(BarComPLan) AS BarCPLan FROM TXPBARCOM GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09R28", "SELECT COALESCE( IntCod, 0) AS BarIntColo, COALESCE( MatCod, 0) AS BarMatColo FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09R29", "SELECT PartCod, DisNumCol, EmpesCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09R210", "SELECT SUM(BarAlbKgmE), SUM(BarAlbMtrE), SUM(BarAlbPie) FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09R211", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MaqCodBis, FasCod, BarTieRea, BarFasKgm, BarFasMtr, BarFasKgT, BarFasMtT, BarFacTin, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09R212", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, BarPreMtr, BarAlbMtrE, BarPreKgm, BarAlbKgmE FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09R213", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasPMt, FasMtr, GuiFasPKg, FasKgm, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09R214", "INSERT INTO TXPHISBAR(EmprCod, HbaBarCod, HbaBarReo, HbaBarPar, HbaNumDis, HbaDisCli, CliCod, HbaSer, HbaColNom, HbaColNum, HbaTipCol, HbaTipArt, HbaPri, HbaKgm, HbaMtr, HbaPie, HbaKgmEnt, HbaMtrEnt, HbaPieEnt, HbaFecGen, HbaFecDis, HbaFecSal, HbaFecCom, HbaDia, HbaMaqCod, HbaAny, HbaRen, HbaRenRea, HbaCosPro, HbaCosAny, HbaCosPrd, HbaCosDir, HbaFac, HbaEstReo, HbaLot, HbaPartCod, HbaNh, HbaNumTin, HbaNomCli, HbaNumCli, HbaFecLan, HbaSerDsc, HbaDibInt, HbaDibCli, HbaNumCol, HbaEmpesCo, HbaEncAnh, HbaEncCom, HbaNMez, HbaIntCod, HbaTipDis, HbaCosteT, HbaCosteF, HbaFacFS, HbaMatCod, HbaNumCor, HbaAncSal1, HbaAncSal2, HbaAncSal3, HbaDibColD, HbaDibColC, HbaDibCoND, HbaDibCoNC, HbaCosPkg, HbaLotKg, HbaLotMt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISBAR")
         ,new ForEachCursor("P09R215", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.BarComMtr, T1.BarComPie, T1.BarMtrEst, T1.BarComMLan, T1.BarComPLan, T1.BarComAnh, T2.BarFecCli, T2.BarFecSal, T1.BarGasEst, T1.BarGasEmp, T1.BarGasOpe, T1.BarGasAca, T1.BarPrcMtr, T1.BarComRep FROM (TXPBARCOM T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisComLin, T1.DisComCod, T1.FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09R216", "INSERT INTO TXPHISCOM(EmprCod, HbaBarCod, HbaBarReo, HbaBarPar, HbaComLin, HbaComCod, HbaFonCod, HbaComMDis, HbaComPDis, HbaComMEst, HbaComPEst, HbaComMRep, HbaComPRep, HbaComMEnt, HbaComPEnt, HbaComAnh, HbaComFecP, HbaComFecE, HbaComEstC, HbaComEmpC, HbaComOpeC, HbaComAcaC, HbaComPre) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISCOM")
         ,new ForEachCursor("P09R217", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P09R218", "INSERT INTO TXPCESTDI(EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCESTDI")
         ,new UpdateCursor("P09R219", "INSERT INTO TXPLESTDI(EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac, EstMes, MtrEst, MtrEst1, MtrFac, MtrFac1, ImpFac, ImpFac1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLESTDI")
         ,new ForEachCursor("P09R220", "SELECT EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac, EstMes, MtrEst1, MtrEst FROM TXPLESTDI WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? and EstAny = ? and DibSerFac = ? and EstMes = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, EstAny, DibSerFac, EstMes  FOR UPDATE OF MtrEst1, MtrEst NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09R221", "UPDATE TXPLESTDI SET MtrEst1=?, MtrEst=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? AND EstAny = ? AND DibSerFac = ? AND EstMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLESTDI")
         ,new UpdateCursor("P09R222", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P09R223", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, GuiFasPKg, AlbProCod, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and FasCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09R224", "SELECT EmprCod, MaqCod, MaqCosMin, MaqAgua, MaqGas, MaqEnerg, MaqMOI, MaqMOD, TipMaqCod FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 6);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((String[]) buf[20])[0] = rslt.getString(20, 10);
               ((String[]) buf[21])[0] = rslt.getString(21, 10);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(23);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(24, 26);
               ((String[]) buf[26])[0] = rslt.getString(25, 16);
               ((int[]) buf[27])[0] = rslt.getInt(26);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(28,2);
               ((String[]) buf[30])[0] = rslt.getString(29, 10);
               ((String[]) buf[31])[0] = rslt.getString(30, 1);
               ((int[]) buf[32])[0] = rslt.getInt(31);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(32, 1);
               ((String[]) buf[35])[0] = rslt.getString(33, 1);
               ((byte[]) buf[36])[0] = rslt.getByte(34);
               ((int[]) buf[37])[0] = rslt.getInt(35);
               ((byte[]) buf[38])[0] = rslt.getByte(36);
               ((String[]) buf[39])[0] = rslt.getString(37, 1);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(20,5);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(21);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 13);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[13], 13);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DATE );
               }
               else
               {
                  stmt.setDate(20, (java.util.Date)parms[35]);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DATE );
               }
               else
               {
                  stmt.setDate(21, (java.util.Date)parms[37]);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DATE );
               }
               else
               {
                  stmt.setDate(22, (java.util.Date)parms[39]);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DATE );
               }
               else
               {
                  stmt.setDate(23, (java.util.Date)parms[41]);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[45], 8);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[47]).shortValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(34, ((Number) parms[63]).byteValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[65], 10);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[67], 16);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[69], 10);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[71], 10);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[73], 13);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(40, ((Number) parms[75]).intValue());
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.DATE );
               }
               else
               {
                  stmt.setDate(41, (java.util.Date)parms[77]);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[79], 26);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(43, ((Number) parms[81]).intValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[83], 16);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(45, ((Number) parms[85]).shortValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[87], 16);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(47, (java.math.BigDecimal)parms[89], 2);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(48, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[93], 10);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(50, ((Number) parms[95]).byteValue());
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[97], 1);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(52, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(53, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(54, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(55, ((Number) parms[105]).shortValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[22]).shortValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DATE );
               }
               else
               {
                  stmt.setDate(17, (java.util.Date)parms[26]);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DATE );
               }
               else
               {
                  stmt.setDate(18, (java.util.Date)parms[28]);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[38], 5);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 3);
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setString(6, (String)parms[6], 3);
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setString(4, (String)parms[5], 16);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setShort(7, ((Number) parms[9]).shortValue());
               stmt.setString(8, (String)parms[10], 3);
               stmt.setByte(9, ((Number) parms[11]).byteValue());
               return;
            case 18 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

