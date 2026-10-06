package app.recetasdeacabados ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phisreca extends GXProcedure
{
   public phisreca( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phisreca.class ), "" );
   }

   public phisreca( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     String[] aP3 ,
                                     short[] aP4 ,
                                     int[] aP5 ,
                                     String[] aP6 ,
                                     java.math.BigDecimal[] aP7 ,
                                     java.math.BigDecimal[] aP8 ,
                                     java.math.BigDecimal[] aP9 ,
                                     java.math.BigDecimal[] aP10 ,
                                     java.math.BigDecimal[] aP11 ,
                                     java.math.BigDecimal[] aP12 ,
                                     java.math.BigDecimal[] aP13 )
   {
      phisreca.this.aP14 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        java.util.Date[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             java.util.Date[] aP14 )
   {
      phisreca.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phisreca.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      phisreca.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      phisreca.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      phisreca.this.AV23RecLinMaq = aP4[0];
      this.aP4 = aP4;
      phisreca.this.AV30RecLtsSr = aP5[0];
      this.aP5 = aP5;
      phisreca.this.AV31Hreacaq = aP6[0];
      this.aP6 = aP6;
      phisreca.this.AV33Abs2 = aP7[0];
      this.aP7 = aP7;
      phisreca.this.AV57BarCosPD = aP8[0];
      this.aP8 = aP8;
      phisreca.this.AV53BarCosAD = aP9[0];
      this.aP9 = aP9;
      phisreca.this.AV52BarCosAA = aP10[0];
      this.aP10 = aP10;
      phisreca.this.AV56BarCosPA = aP11[0];
      this.aP11 = aP11;
      phisreca.this.AV55BarCosCol = aP12[0];
      this.aP12 = aP12;
      phisreca.this.AV54BarCosAnc = aP13[0];
      this.aP13 = aP13;
      phisreca.this.AV60Fechacierre = aP14[0];
      this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV25NCLec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int2) ;
      phisreca.this.GXt_int1 = GXv_int2[0] ;
      AV25NCLec = GXt_int1 ;
      AV61UsurCod = " " ;
      AV62Station = context.getWorkstationId( remoteHandle) ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = AV63EmprNom ;
      GXv_char5[0] = AV61UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV62Station, GXv_char3, GXv_char4, GXv_char5) ;
      phisreca.this.A396EmprCod = GXv_char3[0] ;
      phisreca.this.AV63EmprNom = GXv_char4[0] ;
      phisreca.this.AV61UsurCod = GXv_char5[0] ;
      AV28recTotKgs = DecimalUtil.doubleToDec(0) ;
      AV29RecTotMts = DecimalUtil.doubleToDec(0) ;
      AV44RecNumInt = 0 ;
      AV32RecFa = DecimalUtil.doubleToDec(0) ;
      AV41RecHdrLts = " " ;
      AV42LtsRec = 0 ;
      AV43RecAbs2 = DecimalUtil.doubleToDec(0) ;
      AV26MaqCod = httpContext.getMessage( "XXYYZZ", "") ;
      AV27recacab = "@" ;
      AV45Hredti = GXutil.resetTime( GXutil.nullDate() );
      AV46Hredtf = GXutil.resetTime( GXutil.nullDate() );
      /* Using cursor P03U32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV23RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P03U32_A2804RecLinMaq[0] ;
         A602MaqCod = P03U32_A602MaqCod[0] ;
         A6039RecAcab = P03U32_A6039RecAcab[0] ;
         n6039RecAcab = P03U32_n6039RecAcab[0] ;
         A4259RecTotKgs = P03U32_A4259RecTotKgs[0] ;
         A4260RecTotMts = P03U32_A4260RecTotMts[0] ;
         n4260RecTotMts = P03U32_n4260RecTotMts[0] ;
         A2806RecFA = P03U32_A2806RecFA[0] ;
         A9812RecHdrLts = P03U32_A9812RecHdrLts[0] ;
         n9812RecHdrLts = P03U32_n9812RecHdrLts[0] ;
         A9764RecLtsSR = P03U32_A9764RecLtsSR[0] ;
         n9764RecLtsSR = P03U32_n9764RecLtsSR[0] ;
         A9811RecAbs2 = P03U32_A9811RecAbs2[0] ;
         n9811RecAbs2 = P03U32_n9811RecAbs2[0] ;
         A5109RecNumInt = P03U32_A5109RecNumInt[0] ;
         A9998RecAnc = P03U32_A9998RecAnc[0] ;
         n9998RecAnc = P03U32_n9998RecAnc[0] ;
         A9997Recgrm = P03U32_A9997Recgrm[0] ;
         n9997Recgrm = P03U32_n9997Recgrm[0] ;
         A5115RecAbsFac = P03U32_A5115RecAbsFac[0] ;
         A9996RecObsq = P03U32_A9996RecObsq[0] ;
         n9996RecObsq = P03U32_n9996RecObsq[0] ;
         A11507RecAva = P03U32_A11507RecAva[0] ;
         n11507RecAva = P03U32_n11507RecAva[0] ;
         A12128RecAs = P03U32_A12128RecAs[0] ;
         n12128RecAs = P03U32_n12128RecAs[0] ;
         A12129RecAi = P03U32_A12129RecAi[0] ;
         n12129RecAi = P03U32_n12129RecAi[0] ;
         AV26MaqCod = A602MaqCod ;
         AV27recacab = A6039RecAcab ;
         AV28recTotKgs = A4259RecTotKgs ;
         AV29RecTotMts = A4260RecTotMts ;
         AV32RecFa = A2806RecFA ;
         AV41RecHdrLts = A9812RecHdrLts ;
         AV42LtsRec = A9764RecLtsSR ;
         AV43RecAbs2 = A9811RecAbs2 ;
         AV44RecNumInt = A5109RecNumInt ;
         AV47Hreanc = A9998RecAnc ;
         AV48Hregrm = A9997Recgrm ;
         AV49Hrevel = A5115RecAbsFac ;
         AV50Hreobs = A9996RecObsq ;
         AV51Hreava = A11507RecAva ;
         AV58HreAs = A12128RecAs ;
         AV59HreAi = A12129RecAi ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P03U35 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A143BarDisNum = P03U35_A143BarDisNum[0] ;
         A212BarSer = P03U35_A212BarSer[0] ;
         A1652BarSerDsc = P03U35_A1652BarSerDsc[0] ;
         A217BarTipArt = P03U35_A217BarTipArt[0] ;
         n217BarTipArt = P03U35_n217BarTipArt[0] ;
         A135BarColNom = P03U35_A135BarColNom[0] ;
         A136BarColNum = P03U35_A136BarColNum[0] ;
         A1234BarNomCli = P03U35_A1234BarNomCli[0] ;
         A1235BarNumCli = P03U35_A1235BarNumCli[0] ;
         A218BarTipCol = P03U35_A218BarTipCol[0] ;
         A159BarFecGen = P03U35_A159BarFecGen[0] ;
         A155BarFecCli = P03U35_A155BarFecCli[0] ;
         A158BarFecFpr = P03U35_A158BarFecFpr[0] ;
         A182BarMat = P03U35_A182BarMat[0] ;
         A966PartCod = P03U35_A966PartCod[0] ;
         n966PartCod = P03U35_n966PartCod[0] ;
         A1500BarNMtr = P03U35_A1500BarNMtr[0] ;
         A1499BarNMez = P03U35_A1499BarNMez[0] ;
         A1878BarNumTen = P03U35_A1878BarNumTen[0] ;
         A3313BarNumTon = P03U35_A3313BarNumTon[0] ;
         A4812BarEncCli = P03U35_A4812BarEncCli[0] ;
         A221BarTra1 = P03U35_A221BarTra1[0] ;
         A224BarTraP1 = P03U35_A224BarTraP1[0] ;
         A222BarTra2 = P03U35_A222BarTra2[0] ;
         A225BarTraP2 = P03U35_A225BarTraP2[0] ;
         A223BarTra3 = P03U35_A223BarTra3[0] ;
         A226BarTraP3 = P03U35_A226BarTraP3[0] ;
         A229BarUrd1 = P03U35_A229BarUrd1[0] ;
         A232BarUrdP1 = P03U35_A232BarUrdP1[0] ;
         A230BarUrd2 = P03U35_A230BarUrd2[0] ;
         A233BarUrdP2 = P03U35_A233BarUrdP2[0] ;
         A231BarUrd3 = P03U35_A231BarUrd3[0] ;
         A234BarUrdP3 = P03U35_A234BarUrdP3[0] ;
         A252CliCod = P03U35_A252CliCod[0] ;
         n252CliCod = P03U35_n252CliCod[0] ;
         A2452BarCal = P03U35_A2452BarCal[0] ;
         n2452BarCal = P03U35_n2452BarCal[0] ;
         A361DisCod = P03U35_A361DisCod[0] ;
         A4466BarAcaAnh = P03U35_A4466BarAcaAnh[0] ;
         A2829BarProPer = P03U35_A2829BarProPer[0] ;
         A220BarTotPie = P03U35_A220BarTotPie[0] ;
         A184BarMtr = P03U35_A184BarMtr[0] ;
         A870BarTotMtr = P03U35_A870BarTotMtr[0] ;
         A166BarKgm = P03U35_A166BarKgm[0] ;
         A219BarTotAgr = P03U35_A219BarTotAgr[0] ;
         A199BarPie1 = P03U35_A199BarPie1[0] ;
         A365DisDes = P03U35_A365DisDes[0] ;
         A898BarPieNDes = P03U35_A898BarPieNDes[0] ;
         A966PartCod = P03U35_A966PartCod[0] ;
         n966PartCod = P03U35_n966PartCod[0] ;
         A184BarMtr = P03U35_A184BarMtr[0] ;
         A166BarKgm = P03U35_A166BarKgm[0] ;
         A199BarPie1 = P03U35_A199BarPie1[0] ;
         A898BarPieNDes = P03U35_A898BarPieNDes[0] ;
         A220BarTotPie = P03U35_A220BarTotPie[0] ;
         A870BarTotMtr = P03U35_A870BarTotMtr[0] ;
         A219BarTotAgr = P03U35_A219BarTotAgr[0] ;
         if ( A219BarTotAgr.doubleValue() != 0 )
         {
            A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
         }
         else
         {
            A812RecTotKgm = A166BarKgm ;
         }
         if ( A870BarTotMtr.doubleValue() != 0 )
         {
            A871RecTotMtr = A870BarTotMtr.add(A184BarMtr) ;
         }
         else
         {
            A871RecTotMtr = A184BarMtr ;
         }
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         if ( A220BarTotPie != 0 )
         {
            A813RecTotPie = (int)(A220BarTotPie+A198BarPie) ;
         }
         else
         {
            A813RecTotPie = A198BarPie ;
         }
         AV18CliCod = A252CliCod ;
         AV19BarSer = A212BarSer ;
         AV20BarColNom = A135BarColNom ;
         AV21BarColNum = A136BarColNum ;
         AV12BarTipCol = A218BarTipCol ;
         AV15BarTipArt = A217BarTipArt ;
         AV8BarCod = A129BarCod ;
         AV9BarCodReo = A132BarCodReo ;
         AV10BarCodPar = A130BarCodPar ;
         AV40Bargirar = A2452BarCal ;
         AV40Bargirar = A2452BarCal ;
         AV64Discod = A361DisCod ;
         AV65HreCencId = A4466BarAcaAnh ;
         GXt_char6 = AV66HreCenDsc ;
         GXv_char5[0] = A396EmprCod ;
         GXv_int7[0] = AV65HreCencId ;
         GXv_char4[0] = GXt_char6 ;
         new app.pptable1(remoteHandle, context).execute( GXv_char5, GXv_int7, GXv_char4) ;
         phisreca.this.A396EmprCod = GXv_char5[0] ;
         phisreca.this.AV65HreCencId = GXv_int7[0] ;
         phisreca.this.GXt_char6 = GXv_char4[0] ;
         AV66HreCenDsc = ((AV65HreCencId==0) ? "" : GXt_char6) ;
         AV67HreCdn2 = GXutil.substring( A2829BarProPer, 1, 4) ;
         AV68HreCtw = GXutil.substring( A2829BarProPer, 1, 4) ;
         /* Execute user subroutine: 'NUMCIE' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'TIPCOL' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'TIPART' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_char5[0] = A396EmprCod ;
         GXv_int8[0] = AV18CliCod ;
         GXv_char4[0] = AV19BarSer ;
         GXv_char3[0] = AV20BarColNom ;
         GXv_int9[0] = AV21BarColNum ;
         GXv_int2[0] = AV12BarTipCol ;
         GXv_int10[0] = AV16IntCod ;
         GXv_char11[0] = AV17IntDsc ;
         GXv_char12[0] = " " ;
         GXv_int13[0] = 0 ;
         new app.pbusint(remoteHandle, context).execute( GXv_char5, GXv_int8, GXv_char4, GXv_char3, GXv_int9, GXv_int2, GXv_int10, GXv_char11, GXv_char12, GXv_int13) ;
         phisreca.this.A396EmprCod = GXv_char5[0] ;
         phisreca.this.AV18CliCod = GXv_int8[0] ;
         phisreca.this.AV19BarSer = GXv_char4[0] ;
         phisreca.this.AV20BarColNom = GXv_char3[0] ;
         phisreca.this.AV21BarColNum = GXv_int9[0] ;
         phisreca.this.AV12BarTipCol = GXv_int2[0] ;
         phisreca.this.AV16IntCod = GXv_int10[0] ;
         phisreca.this.AV17IntDsc = GXv_char11[0] ;
         /*
            INSERT RECORD ON TABLE TXPHISREH

         */
         A4492HreBarCod = AV8BarCod ;
         A4493HreBarReo = AV9BarCodReo ;
         A4494HreBarPar = AV10BarCodPar ;
         A4495HreNumCie = AV11NumCie ;
         A4516HreDisCli = A143BarDisNum ;
         n4516HreDisCli = false ;
         A4517HreBarSer = A212BarSer ;
         n4517HreBarSer = false ;
         A4518HreBarDsc = A1652BarSerDsc ;
         n4518HreBarDsc = false ;
         A4519HreTipArt = A217BarTipArt ;
         n4519HreTipArt = false ;
         A4520HreTipArtD = AV14TipArtDsc ;
         n4520HreTipArtD = false ;
         A4521HreColNom = A135BarColNom ;
         n4521HreColNom = false ;
         A4522HreColNum = A136BarColNum ;
         n4522HreColNum = false ;
         A4523HreColNomC = A1234BarNomCli ;
         n4523HreColNomC = false ;
         A4524HreColNumC = A1235BarNumCli ;
         n4524HreColNumC = false ;
         A4525HreTipCol = A218BarTipCol ;
         n4525HreTipCol = false ;
         A4526HreTipColN = GXutil.substring( AV13TipColDsc, 1, 26) ;
         n4526HreTipColN = false ;
         A4527HreFecGen = A159BarFecGen ;
         n4527HreFecGen = false ;
         A4528HreFecCli = A155BarFecCli ;
         n4528HreFecCli = false ;
         A4529HreFecTin = AV60Fechacierre ;
         n4529HreFecTin = false ;
         A4530HreFecFpr = A158BarFecFpr ;
         n4530HreFecFpr = false ;
         A4532HreBarKgm = A166BarKgm ;
         n4532HreBarKgm = false ;
         A4533HreBarMtr = A184BarMtr ;
         n4533HreBarMtr = false ;
         A4534HreBarPie = A198BarPie ;
         n4534HreBarPie = false ;
         A4531HreBarMat = A182BarMat ;
         n4531HreBarMat = false ;
         A4535HrePartCod = A966PartCod ;
         n4535HrePartCod = false ;
         A4536HreBarNMtr = A1500BarNMtr ;
         n4536HreBarNMtr = false ;
         A4537HreBarNMez = A1499BarNMez ;
         n4537HreBarNMez = false ;
         A4538HreNumTen = A1878BarNumTen ;
         n4538HreNumTen = false ;
         A4539HreIntCod = AV16IntCod ;
         n4539HreIntCod = false ;
         A4540HreIntDsc = AV17IntDsc ;
         n4540HreIntDsc = false ;
         A4541HreNumTon = A3313BarNumTon ;
         n4541HreNumTon = false ;
         A4496HreMaqHdr = AV26MaqCod ;
         n4496HreMaqHdr = false ;
         if ( AV28recTotKgs.doubleValue() > 0 )
         {
            A4542HreTotKgm = AV28recTotKgs ;
            n4542HreTotKgm = false ;
         }
         else
         {
            A4542HreTotKgm = A812RecTotKgm ;
            n4542HreTotKgm = false ;
         }
         if ( AV29RecTotMts.doubleValue() > 0 )
         {
            A4543HreTotMtr = AV29RecTotMts ;
            n4543HreTotMtr = false ;
         }
         else
         {
            A4543HreTotMtr = A871RecTotMtr ;
            n4543HreTotMtr = false ;
         }
         A4544HreTotPie = A813RecTotPie ;
         n4544HreTotPie = false ;
         A9805HreLtsSR = AV30RecLtsSr ;
         n9805HreLtsSR = false ;
         A9806HreLtsRs = AV30RecLtsSr ;
         n9806HreLtsRs = false ;
         A9807HreAcaQm = AV31Hreacaq ;
         n9807HreAcaQm = false ;
         A9808HreRacab = AV27recacab ;
         n9808HreRacab = false ;
         A9809HreFecAcb = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n9809HreFecAcb = false ;
         A9810HreAbs = AV33Abs2 ;
         n9810HreAbs = false ;
         if ( AV33Abs2.doubleValue() == 0 )
         {
            A9810HreAbs = AV32RecFa ;
            n9810HreAbs = false ;
         }
         A10099HreLtsRc = AV42LtsRec ;
         n10099HreLtsRc = false ;
         A10100HreHdrLts = AV41RecHdrLts ;
         n10100HreHdrLts = false ;
         A10101HreFabs = AV43RecAbs2 ;
         n10101HreFabs = false ;
         A11318HreDispCli = A4812BarEncCli ;
         n11318HreDispCli = false ;
         A12264HreNInter = AV44RecNumInt ;
         n12264HreNInter = false ;
         A12535HreCencId = AV65HreCencId ;
         n12535HreCencId = false ;
         A12536HreCenDsc = AV66HreCenDsc ;
         n12536HreCenDsc = false ;
         AV69HreComp1 = " " ;
         AV70HreComp2 = " " ;
         if ( GXutil.strcmp(A221BarTra1, "") != 0 )
         {
            AV69HreComp1 = A221BarTra1 + GXutil.space( (short)(1)) + GXutil.str( A224BarTraP1, 3, 0) ;
         }
         if ( GXutil.strcmp(A222BarTra2, "") != 0 )
         {
            AV69HreComp1 += A222BarTra2 + GXutil.space( (short)(1)) + GXutil.str( A225BarTraP2, 3, 0) ;
         }
         if ( GXutil.strcmp(A223BarTra3, "") != 0 )
         {
            AV69HreComp1 += A223BarTra3 + GXutil.space( (short)(1)) + GXutil.str( A226BarTraP3, 3, 0) ;
         }
         if ( GXutil.strcmp(A229BarUrd1, " ") != 0 )
         {
            AV70HreComp2 = A229BarUrd1 + GXutil.str( A232BarUrdP1, 3, 0) ;
         }
         if ( GXutil.strcmp(A230BarUrd2, " ") != 0 )
         {
            AV70HreComp2 += A230BarUrd2 + GXutil.str( A233BarUrdP2, 3, 0) ;
         }
         if ( GXutil.strcmp(A231BarUrd3, " ") != 0 )
         {
            AV70HreComp2 += A231BarUrd3 + GXutil.str( A234BarUrdP3, 3, 0) ;
         }
         A13450HreComp1 = AV69HreComp1 ;
         n13450HreComp1 = false ;
         A13451HreComp2 = AV70HreComp2 ;
         n13451HreComp2 = false ;
         A13763HreUser = AV61UsurCod ;
         A13764HreDiaHora = GXutil.serverNow( context, remoteHandle, pr_default) ;
         A13765HreCdn2 = AV67HreCdn2 ;
         A13766HreCtw = AV68HreCtw ;
         /* Using cursor P03U36 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Boolean.valueOf(n4496HreMaqHdr), A4496HreMaqHdr, Boolean.valueOf(n4516HreDisCli), A4516HreDisCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n4517HreBarSer), A4517HreBarSer, Boolean.valueOf(n4518HreBarDsc), A4518HreBarDsc, Boolean.valueOf(n4519HreTipArt), Short.valueOf(A4519HreTipArt), Boolean.valueOf(n4520HreTipArtD), A4520HreTipArtD, Boolean.valueOf(n4521HreColNom), A4521HreColNom, Boolean.valueOf(n4522HreColNum), Integer.valueOf(A4522HreColNum), Boolean.valueOf(n4523HreColNomC), A4523HreColNomC, Boolean.valueOf(n4524HreColNumC), Integer.valueOf(A4524HreColNumC), Boolean.valueOf(n4525HreTipCol), Byte.valueOf(A4525HreTipCol), Boolean.valueOf(n4526HreTipColN), A4526HreTipColN, Boolean.valueOf(n4527HreFecGen), A4527HreFecGen, Boolean.valueOf(n4528HreFecCli), A4528HreFecCli, Boolean.valueOf(n4529HreFecTin), A4529HreFecTin, Boolean.valueOf(n4530HreFecFpr), A4530HreFecFpr, Boolean.valueOf(n4531HreBarMat), A4531HreBarMat, Boolean.valueOf(n4532HreBarKgm), A4532HreBarKgm, Boolean.valueOf(n4533HreBarMtr), A4533HreBarMtr, Boolean.valueOf(n4534HreBarPie), Integer.valueOf(A4534HreBarPie), Boolean.valueOf(n4535HrePartCod), A4535HrePartCod, Boolean.valueOf(n4536HreBarNMtr), A4536HreBarNMtr, Boolean.valueOf(n4537HreBarNMez), A4537HreBarNMez, Boolean.valueOf(n4538HreNumTen), A4538HreNumTen, Boolean.valueOf(n4539HreIntCod), Byte.valueOf(A4539HreIntCod), Boolean.valueOf(n4540HreIntDsc), A4540HreIntDsc, Boolean.valueOf(n4541HreNumTon), A4541HreNumTon, Boolean.valueOf(n4542HreTotKgm), A4542HreTotKgm, Boolean.valueOf(n4543HreTotMtr), A4543HreTotMtr, Boolean.valueOf(n4544HreTotPie), Integer.valueOf(A4544HreTotPie), Boolean.valueOf(n9805HreLtsSR), Integer.valueOf(A9805HreLtsSR), Boolean.valueOf(n9806HreLtsRs), Integer.valueOf(A9806HreLtsRs), Boolean.valueOf(n9807HreAcaQm), A9807HreAcaQm, Boolean.valueOf(n9808HreRacab), A9808HreRacab, Boolean.valueOf(n9809HreFecAcb), A9809HreFecAcb, Boolean.valueOf(n9810HreAbs), A9810HreAbs, Boolean.valueOf(n10099HreLtsRc), Integer.valueOf(A10099HreLtsRc), Boolean.valueOf(n10100HreHdrLts), A10100HreHdrLts, Boolean.valueOf(n10101HreFabs), A10101HreFabs, Boolean.valueOf(n11318HreDispCli), A11318HreDispCli, Boolean.valueOf(n12264HreNInter), Integer.valueOf(A12264HreNInter), Boolean.valueOf(n12535HreCencId), Short.valueOf(A12535HreCencId), Boolean.valueOf(n12536HreCenDsc), A12536HreCenDsc, Boolean.valueOf(n13450HreComp1), A13450HreComp1, Boolean.valueOf(n13451HreComp2), A13451HreComp2, A13763HreUser, A13764HreDiaHora, A13765HreCdn2, A13766HreCtw});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREH");
         if ( (pr_default.getStatus(2) == 1) )
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
         /* Using cursor P03U39 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV23RecLinMaq)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A2804RecLinMaq = P03U39_A2804RecLinMaq[0] ;
            A602MaqCod = P03U39_A602MaqCod[0] ;
            A2805RecVolPrd = P03U39_A2805RecVolPrd[0] ;
            A2806RecFA = P03U39_A2806RecFA[0] ;
            A1272UltLinPro = P03U39_A1272UltLinPro[0] ;
            A4574RecFecPes = P03U39_A4574RecFecPes[0] ;
            A4575RecMaqPes = P03U39_A4575RecMaqPes[0] ;
            A4402RecUsrCod = P03U39_A4402RecUsrCod[0] ;
            A4258RecMaqFas = P03U39_A4258RecMaqFas[0] ;
            n4258RecMaqFas = P03U39_n4258RecMaqFas[0] ;
            A4268RecOrdLin = P03U39_A4268RecOrdLin[0] ;
            n4268RecOrdLin = P03U39_n4268RecOrdLin[0] ;
            A4654RecNroPar = P03U39_A4654RecNroPar[0] ;
            n4654RecNroPar = P03U39_n4654RecNroPar[0] ;
            A4866RecFecAlt = P03U39_A4866RecFecAlt[0] ;
            n4866RecFecAlt = P03U39_n4866RecFecAlt[0] ;
            A4867RecFecMod = P03U39_A4867RecFecMod[0] ;
            n4867RecFecMod = P03U39_n4867RecFecMod[0] ;
            A4868RecUsrMod = P03U39_A4868RecUsrMod[0] ;
            n4868RecUsrMod = P03U39_n4868RecUsrMod[0] ;
            A4261RecTotPrd = P03U39_A4261RecTotPrd[0] ;
            n4261RecTotPrd = P03U39_n4261RecTotPrd[0] ;
            A7764RecMaqNh = P03U39_A7764RecMaqNh[0] ;
            A7765RecMaqVX = P03U39_A7765RecMaqVX[0] ;
            A7766RecMaqBL = P03U39_A7766RecMaqBL[0] ;
            A7767RecMaqFlow = P03U39_A7767RecMaqFlow[0] ;
            A7768RecMaqRPM = P03U39_A7768RecMaqRPM[0] ;
            A7769RecMaqMol = P03U39_A7769RecMaqMol[0] ;
            A7770RecMaqTor = P03U39_A7770RecMaqTor[0] ;
            A7771RecMaqCla = P03U39_A7771RecMaqCla[0] ;
            A7772RecMaqTej = P03U39_A7772RecMaqTej[0] ;
            A7773RecMaqDel = P03U39_A7773RecMaqDel[0] ;
            A7774RecMaqPML = P03U39_A7774RecMaqPML[0] ;
            A6039RecAcab = P03U39_A6039RecAcab[0] ;
            n6039RecAcab = P03U39_n6039RecAcab[0] ;
            A5110RecNumPrg = P03U39_A5110RecNumPrg[0] ;
            A219BarTotAgr = P03U39_A219BarTotAgr[0] ;
            A166BarKgm = P03U39_A166BarKgm[0] ;
            A870BarTotMtr = P03U39_A870BarTotMtr[0] ;
            A184BarMtr = P03U39_A184BarMtr[0] ;
            A219BarTotAgr = P03U39_A219BarTotAgr[0] ;
            A870BarTotMtr = P03U39_A870BarTotMtr[0] ;
            A166BarKgm = P03U39_A166BarKgm[0] ;
            A184BarMtr = P03U39_A184BarMtr[0] ;
            if ( A870BarTotMtr.doubleValue() != 0 )
            {
               A871RecTotMtr = A870BarTotMtr.add(A184BarMtr) ;
            }
            else
            {
               A871RecTotMtr = A184BarMtr ;
            }
            if ( A219BarTotAgr.doubleValue() != 0 )
            {
               A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
            }
            else
            {
               A812RecTotKgm = A166BarKgm ;
            }
            /*
               INSERT RECORD ON TABLE TXPHISREM

            */
            A4492HreBarCod = AV8BarCod ;
            A4493HreBarReo = AV9BarCodReo ;
            A4494HreBarPar = AV10BarCodPar ;
            A4495HreNumCie = AV11NumCie ;
            A4545HreLinMaq = A2804RecLinMaq ;
            A4546HreMaqCod = A602MaqCod ;
            n4546HreMaqCod = false ;
            A4547HreVolPrd = A2805RecVolPrd ;
            n4547HreVolPrd = false ;
            A4548HreFacAbs = A2806RecFA ;
            n4548HreFacAbs = false ;
            A4549HreULinPro = A1272UltLinPro ;
            n4549HreULinPro = false ;
            A4584HreFecPes = A4574RecFecPes ;
            n4584HreFecPes = false ;
            A4585HreMaqPes = A4575RecMaqPes ;
            n4585HreMaqPes = false ;
            A4863HreUsrCod = A4402RecUsrCod ;
            n4863HreUsrCod = false ;
            A4963HreFasCod = A4258RecMaqFas ;
            n4963HreFasCod = false ;
            A4964HreOrdLin = A4268RecOrdLin ;
            n4964HreOrdLin = false ;
            A4965HreNroPar = A4654RecNroPar ;
            n4965HreNroPar = false ;
            A4960HreFecAlt = A4866RecFecAlt ;
            n4960HreFecAlt = false ;
            A4962HreFecMod = A4867RecFecMod ;
            n4962HreFecMod = false ;
            A4961HreUsrMod = A4868RecUsrMod ;
            n4961HreUsrMod = false ;
            A4968HreTotKgs = ((AV28recTotKgs.doubleValue()>0) ? AV28recTotKgs : A812RecTotKgm) ;
            n4968HreTotKgs = false ;
            A4969HreTotMts = ((AV29RecTotMts.doubleValue()>0) ? AV29RecTotMts : A871RecTotMtr) ;
            n4969HreTotMts = false ;
            A4970HreTotPrd = A4261RecTotPrd ;
            n4970HreTotPrd = false ;
            A7814HReMaqNh = A7764RecMaqNh ;
            n7814HReMaqNh = false ;
            A7815HReMaqVX = A7765RecMaqVX ;
            n7815HReMaqVX = false ;
            A7816HReMaqBL = A7766RecMaqBL ;
            n7816HReMaqBL = false ;
            A7817HReMaqFlow = A7767RecMaqFlow ;
            n7817HReMaqFlow = false ;
            A7818HReMaqRPM = A7768RecMaqRPM ;
            n7818HReMaqRPM = false ;
            A7819HReMaqMol = A7769RecMaqMol ;
            n7819HReMaqMol = false ;
            A7820HReMaqTor = A7770RecMaqTor ;
            n7820HReMaqTor = false ;
            A7821HReMaqCla = A7771RecMaqCla ;
            n7821HReMaqCla = false ;
            A7822HReMaqTej = A7772RecMaqTej ;
            n7822HReMaqTej = false ;
            A7823HReMaqDel = A7773RecMaqDel ;
            n7823HReMaqDel = false ;
            A7824HReMaqPML = A7774RecMaqPML ;
            n7824HReMaqPML = false ;
            A9780HreLtsSb = AV30RecLtsSr ;
            n9780HreLtsSb = false ;
            A9781HreLtsRm = AV30RecLtsSr ;
            n9781HreLtsRm = false ;
            A9803HreAcaQ = AV31Hreacaq ;
            n9803HreAcaQ = false ;
            A9804HreAcab = A6039RecAcab ;
            n9804HreAcab = false ;
            A1094HreNPrg = A5110RecNumPrg ;
            n1094HreNPrg = false ;
            A697HreLotF = AV40Bargirar ;
            n697HreLotF = false ;
            A10102HreNumInt = AV44RecNumInt ;
            n10102HreNumInt = false ;
            A10104HreDtf = AV46Hredtf ;
            n10104HreDtf = false ;
            A10103HreDti = AV45Hredti ;
            n10103HreDti = false ;
            A10381HreAnc = AV47Hreanc ;
            n10381HreAnc = false ;
            A10382HreGrm = AV48Hregrm ;
            n10382HreGrm = false ;
            A10383HreVel = AV49Hrevel ;
            n10383HreVel = false ;
            A10384HreObs = AV50Hreobs ;
            n10384HreObs = false ;
            A11508HreAva = AV51Hreava ;
            n11508HreAva = false ;
            A8602HreCosAA = AV52BarCosAA ;
            n8602HreCosAA = false ;
            A8603HrecosAd = AV53BarCosAD ;
            n8603HrecosAd = false ;
            A8604HreCosAnc = AV54BarCosAnc ;
            n8604HreCosAnc = false ;
            A8605HreCosCol = AV55BarCosCol ;
            n8605HreCosCol = false ;
            A8606HreCosPA = AV56BarCosPA ;
            n8606HreCosPA = false ;
            A8607HreCosPD = AV57BarCosPD ;
            n8607HreCosPD = false ;
            A12126HreAs = AV58HreAs ;
            n12126HreAs = false ;
            A12127HreAi = AV59HreAi ;
            n12127HreAi = false ;
            /* Using cursor P03U310 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Boolean.valueOf(n4546HreMaqCod), A4546HreMaqCod, Boolean.valueOf(n4547HreVolPrd), Integer.valueOf(A4547HreVolPrd), Boolean.valueOf(n4548HreFacAbs), A4548HreFacAbs, Boolean.valueOf(n4549HreULinPro), Byte.valueOf(A4549HreULinPro), Boolean.valueOf(n4584HreFecPes), A4584HreFecPes, Boolean.valueOf(n4585HreMaqPes), Byte.valueOf(A4585HreMaqPes), Boolean.valueOf(n4863HreUsrCod), A4863HreUsrCod, Boolean.valueOf(n4960HreFecAlt), A4960HreFecAlt, Boolean.valueOf(n4961HreUsrMod), A4961HreUsrMod, Boolean.valueOf(n4962HreFecMod), A4962HreFecMod, Boolean.valueOf(n4963HreFasCod), A4963HreFasCod, Boolean.valueOf(n4964HreOrdLin), Short.valueOf(A4964HreOrdLin), Boolean.valueOf(n4965HreNroPar), Integer.valueOf(A4965HreNroPar), Boolean.valueOf(n4968HreTotKgs), A4968HreTotKgs, Boolean.valueOf(n4969HreTotMts), A4969HreTotMts, Boolean.valueOf(n4970HreTotPrd), Integer.valueOf(A4970HreTotPrd), Boolean.valueOf(n7814HReMaqNh), Short.valueOf(A7814HReMaqNh), Boolean.valueOf(n7815HReMaqVX), Byte.valueOf(A7815HReMaqVX), Boolean.valueOf(n7816HReMaqBL), Byte.valueOf(A7816HReMaqBL), Boolean.valueOf(n7817HReMaqFlow), Byte.valueOf(A7817HReMaqFlow), Boolean.valueOf(n7818HReMaqRPM), Short.valueOf(A7818HReMaqRPM), Boolean.valueOf(n7819HReMaqMol), Short.valueOf(A7819HReMaqMol), Boolean.valueOf(n7820HReMaqTor), Short.valueOf(A7820HReMaqTor), Boolean.valueOf(n7821HReMaqCla), A7821HReMaqCla, Boolean.valueOf(n7822HReMaqTej), Byte.valueOf(A7822HReMaqTej), Boolean.valueOf(n7823HReMaqDel), Byte.valueOf(A7823HReMaqDel), Boolean.valueOf(n7824HReMaqPML), Short.valueOf(A7824HReMaqPML), Boolean.valueOf(n8602HreCosAA), A8602HreCosAA, Boolean.valueOf(n8603HrecosAd), A8603HrecosAd, Boolean.valueOf(n8604HreCosAnc), A8604HreCosAnc, Boolean.valueOf(n8605HreCosCol), A8605HreCosCol, Boolean.valueOf(n8606HreCosPA), A8606HreCosPA, Boolean.valueOf(n8607HreCosPD), A8607HreCosPD, Boolean.valueOf(n9780HreLtsSb), Integer.valueOf(A9780HreLtsSb), Boolean.valueOf(n9781HreLtsRm), Integer.valueOf(A9781HreLtsRm), Boolean.valueOf(n9803HreAcaQ), A9803HreAcaQ, Boolean.valueOf(n9804HreAcab), A9804HreAcab, Boolean.valueOf(n1094HreNPrg), A1094HreNPrg, Boolean.valueOf(n697HreLotF), A697HreLotF, Boolean.valueOf(n10102HreNumInt), Integer.valueOf(A10102HreNumInt), Boolean.valueOf(n10103HreDti), A10103HreDti, Boolean.valueOf(n10104HreDtf), A10104HreDtf, Boolean.valueOf(n10381HreAnc), Short.valueOf(A10381HreAnc), Boolean.valueOf(n10382HreGrm), Short.valueOf(A10382HreGrm), Boolean.valueOf(n10383HreVel), A10383HreVel, Boolean.valueOf(n10384HreObs), A10384HreObs, Boolean.valueOf(n11508HreAva), A11508HreAva, Boolean.valueOf(n12126HreAs), A12126HreAs, Boolean.valueOf(n12127HreAi), A12127HreAi});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREM");
            if ( (pr_default.getStatus(4) == 1) )
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
            Gx_msg = httpContext.getMessage( "Actualizando HISRE2 ", "") + GXutil.str( AV8BarCod, 8, 0) + "-" + GXutil.str( AV9BarCodReo, 1, 0) + AV10BarCodPar ;
            /* Execute user subroutine: 'HISRE2HISRE3' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(3);
               pr_default.close(3);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            Gx_msg = httpContext.getMessage( "Actualizando HISREC ", "") + GXutil.str( AV8BarCod, 8, 0) + "-" + GXutil.str( AV9BarCodReo, 1, 0) + AV10BarCodPar ;
            /* Using cursor P03U311 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A1273RecLinPro = P03U311_A1273RecLinPro[0] ;
               A764ProForCod = P03U311_A764ProForCod[0] ;
               A766ProForDsc = P03U311_A766ProForDsc[0] ;
               A771ProForTie = P03U311_A771ProForTie[0] ;
               A772ProForTmx = P03U311_A772ProForTmx[0] ;
               A4697RecNroPrg = P03U311_A4697RecNroPrg[0] ;
               A1251RecNumRec = P03U311_A1251RecNumRec[0] ;
               A4695RecVolPrf = P03U311_A4695RecVolPrf[0] ;
               A10544RecNH2O = P03U311_A10544RecNH2O[0] ;
               A766ProForDsc = P03U311_A766ProForDsc[0] ;
               A771ProForTie = P03U311_A771ProForTie[0] ;
               A772ProForTmx = P03U311_A772ProForTmx[0] ;
               /*
                  INSERT RECORD ON TABLE TXPHISREC

               */
               A4492HreBarCod = AV8BarCod ;
               A4493HreBarReo = AV9BarCodReo ;
               A4494HreBarPar = AV10BarCodPar ;
               A4495HreNumCie = AV11NumCie ;
               A4545HreLinMaq = A2804RecLinMaq ;
               A4550HreLinPro = A1273RecLinPro ;
               A4551HreProCod = A764ProForCod ;
               A4552HreProDsc = A766ProForDsc ;
               A4553HreProTie = A771ProForTie ;
               A4554HreProTmx = A772ProForTmx ;
               A4555HreNumPro = A4697RecNroPrg ;
               A4556HreNumRec = A1251RecNumRec ;
               A4966HreVolPro = A4695RecVolPrf ;
               A10545HreNH2O = A10544RecNH2O ;
               /* Using cursor P03U312 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A10545HreNH2O), A4551HreProCod, A4552HreProDsc, Short.valueOf(A4553HreProTie), Short.valueOf(A4554HreProTmx), Integer.valueOf(A4555HreNumPro), Integer.valueOf(A4556HreNumRec), Integer.valueOf(A4966HreVolPro)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREC");
               if ( (pr_default.getStatus(6) == 1) )
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
               /* Using cursor P03U313 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               while ( (pr_default.getStatus(7) != 101) )
               {
                  A811RecLin = P03U313_A811RecLin[0] ;
                  A872RecPrdNum = P03U313_A872RecPrdNum[0] ;
                  A875RecPrdDsc = P03U313_A875RecPrdDsc[0] ;
                  A490ForPrdUMe = P03U313_A490ForPrdUMe[0] ;
                  n490ForPrdUMe = P03U313_n490ForPrdUMe[0] ;
                  A488ForPrdDsc = P03U313_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P03U313_n488ForPrdDsc[0] ;
                  A431FacCon = P03U313_A431FacCon[0] ;
                  A686PrdCant = P03U313_A686PrdCant[0] ;
                  A683PrdCanFin = P03U313_A683PrdCanFin[0] ;
                  A1797PrdCanAny = P03U313_A1797PrdCanAny[0] ;
                  A2394RecForNro = P03U313_A2394RecForNro[0] ;
                  A3274RecPrdTnq = P03U313_A3274RecPrdTnq[0] ;
                  A3804RecFecMov = P03U313_A3804RecFecMov[0] ;
                  A3805RecAnyTie = P03U313_A3805RecAnyTie[0] ;
                  A3806RecUltAny = P03U313_A3806RecUltAny[0] ;
                  A3807RecPorAny = P03U313_A3807RecPorAny[0] ;
                  A3938RecCanEns = P03U313_A3938RecCanEns[0] ;
                  A4024RecMar = P03U313_A4024RecMar[0] ;
                  A4576RecLinUsr = P03U313_A4576RecLinUsr[0] ;
                  A4577RecPesFec = P03U313_A4577RecPesFec[0] ;
                  A724PrdPreAct = P03U313_A724PrdPreAct[0] ;
                  A5725RecLote = P03U313_A5725RecLote[0] ;
                  A9813FacCon1 = P03U313_A9813FacCon1[0] ;
                  A11708RecProv = P03U313_A11708RecProv[0] ;
                  A12641RecPrdDc2 = P03U313_A12641RecPrdDc2[0] ;
                  A12717RecFabId = P03U313_A12717RecFabId[0] ;
                  A13938RecLoteFch = P03U313_A13938RecLoteFch[0] ;
                  A13937RecLotAlm = P03U313_A13937RecLotAlm[0] ;
                  A719PrdNum = P03U313_A719PrdNum[0] ;
                  n719PrdNum = P03U313_n719PrdNum[0] ;
                  A724PrdPreAct = P03U313_A724PrdPreAct[0] ;
                  A488ForPrdDsc = P03U313_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P03U313_n488ForPrdDsc[0] ;
                  /*
                     INSERT RECORD ON TABLE TXPHISLRE

                  */
                  A4492HreBarCod = AV8BarCod ;
                  A4493HreBarReo = AV9BarCodReo ;
                  A4494HreBarPar = AV10BarCodPar ;
                  A4495HreNumCie = AV11NumCie ;
                  A4545HreLinMaq = A2804RecLinMaq ;
                  A4550HreLinPro = A1273RecLinPro ;
                  A4557HreRecLin = A811RecLin ;
                  A4558HrePrdNum = A872RecPrdNum ;
                  n4558HrePrdNum = false ;
                  A4559HrePrdDsc = A875RecPrdDsc ;
                  n4559HrePrdDsc = false ;
                  A4560HrePrdUMe = A490ForPrdUMe ;
                  n4560HrePrdUMe = false ;
                  A4561HrePrdUDs = A488ForPrdDsc ;
                  n4561HrePrdUDs = false ;
                  A4562HreFacCon = A431FacCon ;
                  n4562HreFacCon = false ;
                  A4563HrePrdCant = A686PrdCant ;
                  n4563HrePrdCant = false ;
                  A4564HreCanFin = A683PrdCanFin ;
                  n4564HreCanFin = false ;
                  A4565HreCanAny = A1797PrdCanAny ;
                  n4565HreCanAny = false ;
                  A4566HreForNro = A2394RecForNro ;
                  n4566HreForNro = false ;
                  A4567HrePrdTnq = A3274RecPrdTnq ;
                  n4567HrePrdTnq = false ;
                  A4568HreFecMov = A3804RecFecMov ;
                  n4568HreFecMov = false ;
                  A4569HreAnyTie = A3805RecAnyTie ;
                  n4569HreAnyTie = false ;
                  A4570HreUltAny = A3806RecUltAny ;
                  n4570HreUltAny = false ;
                  A4571HrePorAny = A3807RecPorAny ;
                  n4571HrePorAny = false ;
                  A4572HreCanEns = A3938RecCanEns ;
                  n4572HreCanEns = false ;
                  A4573HreRecMar = A4024RecMar ;
                  n4573HreRecMar = false ;
                  A4582HreLinUsr = A4576RecLinUsr ;
                  n4582HreLinUsr = false ;
                  A4583HrePesFec = A4577RecPesFec ;
                  n4583HrePesFec = false ;
                  A4967HrePrePrd = A724PrdPreAct ;
                  n4967HrePrePrd = false ;
                  A5726HreLote = A5725RecLote ;
                  n5726HreLote = false ;
                  A9827HreFacCon1 = A9813FacCon1 ;
                  n9827HreFacCon1 = false ;
                  A11707HreProv = A11708RecProv ;
                  n11707HreProv = false ;
                  A12453HreFecAct = GXutil.today( ) ;
                  n12453HreFecAct = false ;
                  A12642HrePrdDc2 = A12641RecPrdDc2 ;
                  n12642HrePrdDc2 = false ;
                  A12718HreFabId = A12717RecFabId ;
                  n12718HreFabId = false ;
                  A13942HreLoteFch = A13938RecLoteFch ;
                  A13943HreLotAlm = A13937RecLotAlm ;
                  /* Using cursor P03U314 */
                  pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A4557HreRecLin), Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n4558HrePrdNum), A4558HrePrdNum, Boolean.valueOf(n4559HrePrdDsc), A4559HrePrdDsc, Boolean.valueOf(n4560HrePrdUMe), Byte.valueOf(A4560HrePrdUMe), Boolean.valueOf(n4561HrePrdUDs), A4561HrePrdUDs, Boolean.valueOf(n4562HreFacCon), A4562HreFacCon, Boolean.valueOf(n4563HrePrdCant), A4563HrePrdCant, Boolean.valueOf(n4564HreCanFin), A4564HreCanFin, Boolean.valueOf(n4565HreCanAny), A4565HreCanAny, Boolean.valueOf(n4566HreForNro), Byte.valueOf(A4566HreForNro), Boolean.valueOf(n4567HrePrdTnq), Byte.valueOf(A4567HrePrdTnq), Boolean.valueOf(n4568HreFecMov), A4568HreFecMov, Boolean.valueOf(n4569HreAnyTie), Short.valueOf(A4569HreAnyTie), Boolean.valueOf(n4570HreUltAny), A4570HreUltAny, Boolean.valueOf(n4571HrePorAny), A4571HrePorAny, Boolean.valueOf(n4572HreCanEns), A4572HreCanEns, Boolean.valueOf(n4573HreRecMar), Byte.valueOf(A4573HreRecMar), Boolean.valueOf(n4582HreLinUsr), A4582HreLinUsr, Boolean.valueOf(n4583HrePesFec), A4583HrePesFec, Boolean.valueOf(n4967HrePrePrd), A4967HrePrePrd, Boolean.valueOf(n5726HreLote), A5726HreLote, Boolean.valueOf(n9827HreFacCon1), A9827HreFacCon1, Boolean.valueOf(n11707HreProv), Integer.valueOf(A11707HreProv), Boolean.valueOf(n12453HreFecAct), A12453HreFecAct, Boolean.valueOf(n12642HrePrdDc2), A12642HrePrdDc2, Boolean.valueOf(n12718HreFabId), Integer.valueOf(A12718HreFabId), A13942HreLoteFch, Short.valueOf(A13943HreLotAlm)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISLRE");
                  if ( (pr_default.getStatus(8) == 1) )
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
                  pr_default.readNext(7);
               }
               pr_default.close(7);
               pr_default.readNext(5);
            }
            pr_default.close(5);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor P03U315 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV23RecLinMaq)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A2808RecLinMAL = P03U315_A2808RecLinMAL[0] ;
         A1377RecNumAny = P03U315_A1377RecNumAny[0] ;
         A718PrdNom = P03U315_A718PrdNom[0] ;
         A1378PrdCFin = P03U315_A1378PrdCFin[0] ;
         n1378PrdCFin = P03U315_n1378PrdCFin[0] ;
         A3380LanyPrd = P03U315_A3380LanyPrd[0] ;
         n3380LanyPrd = P03U315_n3380LanyPrd[0] ;
         A3381LanyCan = P03U315_A3381LanyCan[0] ;
         n3381LanyCan = P03U315_n3381LanyCan[0] ;
         A3382LanyNro = P03U315_A3382LanyNro[0] ;
         n3382LanyNro = P03U315_n3382LanyNro[0] ;
         A3383LanyTnq = P03U315_A3383LanyTnq[0] ;
         n3383LanyTnq = P03U315_n3383LanyTnq[0] ;
         A4578LanyUsr = P03U315_A4578LanyUsr[0] ;
         n4578LanyUsr = P03U315_n4578LanyUsr[0] ;
         A4579LanyFec = P03U315_A4579LanyFec[0] ;
         n4579LanyFec = P03U315_n4579LanyFec[0] ;
         A5807LanyLote = P03U315_A5807LanyLote[0] ;
         n5807LanyLote = P03U315_n5807LanyLote[0] ;
         A13939LanyLoteFc = P03U315_A13939LanyLoteFc[0] ;
         A719PrdNum = P03U315_A719PrdNum[0] ;
         n719PrdNum = P03U315_n719PrdNum[0] ;
         A718PrdNom = P03U315_A718PrdNom[0] ;
         /*
            INSERT RECORD ON TABLE TXPHISREA

         */
         A4492HreBarCod = AV8BarCod ;
         A4493HreBarReo = AV9BarCodReo ;
         A4494HreBarPar = AV10BarCodPar ;
         A4495HreNumCie = AV11NumCie ;
         A4508HreLinMAL = A2808RecLinMAL ;
         A4509HreNumAny = A1377RecNumAny ;
         A4510HrdPrdDsc = A718PrdNom ;
         n4510HrdPrdDsc = false ;
         A4511HrePrdCFin = A1378PrdCFin ;
         n4511HrePrdCFin = false ;
         A4512HreLanyPrd = A3380LanyPrd ;
         n4512HreLanyPrd = false ;
         A4513HreLanyCan = A3381LanyCan ;
         n4513HreLanyCan = false ;
         A4514HreLanyNro = A3382LanyNro ;
         n4514HreLanyNro = false ;
         A4515HreLanyTnq = A3383LanyTnq ;
         n4515HreLanyTnq = false ;
         A4580HreLanyUsr = A4578LanyUsr ;
         n4580HreLanyUsr = false ;
         A4581HreLanyFec = A4579LanyFec ;
         n4581HreLanyFec = false ;
         A5808HreLanyLot = A5807LanyLote ;
         n5808HreLanyLot = false ;
         A13940HreLanyLtF = A13939LanyLoteFc ;
         /* Using cursor P03U316 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4508HreLinMAL), Byte.valueOf(A4509HreNumAny), Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n4510HrdPrdDsc), A4510HrdPrdDsc, Boolean.valueOf(n4511HrePrdCFin), A4511HrePrdCFin, Boolean.valueOf(n4512HreLanyPrd), A4512HreLanyPrd, Boolean.valueOf(n4513HreLanyCan), A4513HreLanyCan, Boolean.valueOf(n4514HreLanyNro), Byte.valueOf(A4514HreLanyNro), Boolean.valueOf(n4515HreLanyTnq), Byte.valueOf(A4515HreLanyTnq), Boolean.valueOf(n4580HreLanyUsr), A4580HreLanyUsr, Boolean.valueOf(n4581HreLanyFec), A4581HreLanyFec, Boolean.valueOf(n5808HreLanyLot), A5808HreLanyLot, A13940HreLanyLtF});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREA");
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
         /* End Insert */
         pr_default.readNext(9);
      }
      pr_default.close(9);
      /* Using cursor P03U317 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A6031Ac_Barcod = P03U317_A6031Ac_Barcod[0] ;
         A6032Ac_BarReo = P03U317_A6032Ac_BarReo[0] ;
         A6033Ac_BarPar = P03U317_A6033Ac_BarPar[0] ;
         A6035Ac_Kilos = P03U317_A6035Ac_Kilos[0] ;
         n6035Ac_Kilos = P03U317_n6035Ac_Kilos[0] ;
         A6034Ac_Metros = P03U317_A6034Ac_Metros[0] ;
         n6034Ac_Metros = P03U317_n6034Ac_Metros[0] ;
         A6036Ac_Pzs = P03U317_A6036Ac_Pzs[0] ;
         n6036Ac_Pzs = P03U317_n6036Ac_Pzs[0] ;
         GXv_char12[0] = A396EmprCod ;
         GXv_int13[0] = A6031Ac_Barcod ;
         GXv_int10[0] = A6032Ac_BarReo ;
         GXv_char11[0] = A6033Ac_BarPar ;
         GXv_int9[0] = AV35Clicodagr ;
         GXv_char5[0] = AV36BarAgrser ;
         GXv_char4[0] = AV37Baragrdsc ;
         GXv_char3[0] = AV38Colnomagr ;
         GXv_int8[0] = AV39Colnumagr ;
         new app.recetasdeacabados.pinfhdraac(remoteHandle, context).execute( GXv_char12, GXv_int13, GXv_int10, GXv_char11, GXv_int9, GXv_char5, GXv_char4, GXv_char3, GXv_int8) ;
         phisreca.this.A396EmprCod = GXv_char12[0] ;
         phisreca.this.A6031Ac_Barcod = GXv_int13[0] ;
         phisreca.this.A6032Ac_BarReo = GXv_int10[0] ;
         phisreca.this.A6033Ac_BarPar = GXv_char11[0] ;
         phisreca.this.AV35Clicodagr = GXv_int9[0] ;
         phisreca.this.AV36BarAgrser = GXv_char5[0] ;
         phisreca.this.AV37Baragrdsc = GXv_char4[0] ;
         phisreca.this.AV38Colnomagr = GXv_char3[0] ;
         phisreca.this.AV39Colnumagr = GXv_int8[0] ;
         /*
            INSERT RECORD ON TABLE TXPHISHRA

         */
         A4492HreBarCod = AV8BarCod ;
         A4493HreBarReo = AV9BarCodReo ;
         A4494HreBarPar = AV10BarCodPar ;
         A4495HreNumCie = AV11NumCie ;
         A9985HreAcCod = A6031Ac_Barcod ;
         A9986HreAcReo = A6032Ac_BarReo ;
         A9987HreAcPar = A6033Ac_BarPar ;
         A9988HreAcKgm = A6035Ac_Kilos ;
         n9988HreAcKgm = false ;
         A9989HreAcMtr = A6034Ac_Metros ;
         n9989HreAcMtr = false ;
         A9990HreAcPie = A6036Ac_Pzs ;
         n9990HreAcPie = false ;
         A9991HreAcCli = AV35Clicodagr ;
         n9991HreAcCli = false ;
         A9992HreAcSer = AV36BarAgrser ;
         n9992HreAcSer = false ;
         A9993HreAcDsc = AV37Baragrdsc ;
         n9993HreAcDsc = false ;
         A9994HreAcCol = AV38Colnomagr ;
         n9994HreAcCol = false ;
         A9995HreAcNumC = AV39Colnumagr ;
         n9995HreAcNumC = false ;
         /* Using cursor P03U318 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A9985HreAcCod), Byte.valueOf(A9986HreAcReo), A9987HreAcPar, Boolean.valueOf(n9988HreAcKgm), A9988HreAcKgm, Boolean.valueOf(n9989HreAcMtr), A9989HreAcMtr, Boolean.valueOf(n9990HreAcPie), Integer.valueOf(A9990HreAcPie), Boolean.valueOf(n9991HreAcCli), Integer.valueOf(A9991HreAcCli), Boolean.valueOf(n9992HreAcSer), A9992HreAcSer, Boolean.valueOf(n9993HreAcDsc), A9993HreAcDsc, Boolean.valueOf(n9994HreAcCol), A9994HreAcCol, Boolean.valueOf(n9995HreAcNumC), Integer.valueOf(A9995HreAcNumC)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISHRA");
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
      if ( AV25NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "recetasdeacabados.phisreca");
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'NUMCIE' Routine */
      returnInSub = false ;
      AV11NumCie = (byte)(0) ;
      AV24Ok_Linmaq = (byte)(0) ;
      /* Using cursor P03U319 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A4494HreBarPar = P03U319_A4494HreBarPar[0] ;
         A4493HreBarReo = P03U319_A4493HreBarReo[0] ;
         A4492HreBarCod = P03U319_A4492HreBarCod[0] ;
         A4495HreNumCie = P03U319_A4495HreNumCie[0] ;
         AV11NumCie = A4495HreNumCie ;
         pr_default.readNext(13);
      }
      pr_default.close(13);
      AV11NumCie = (byte)(AV11NumCie+1) ;
   }

   public void S121( )
   {
      /* 'TIPCOL' Routine */
      returnInSub = false ;
      AV13TipColDsc = "" ;
      /* Using cursor P03U320 */
      pr_default.execute(14, new Object[] {A396EmprCod, Byte.valueOf(AV12BarTipCol)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A831TipColCod = P03U320_A831TipColCod[0] ;
         A832TipColDsc = P03U320_A832TipColDsc[0] ;
         n832TipColDsc = P03U320_n832TipColDsc[0] ;
         AV13TipColDsc = A832TipColDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   public void S131( )
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV14TipArtDsc = "" ;
      /* Using cursor P03U321 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(AV15BarTipArt)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A829TipArtCod = P03U321_A829TipArtCod[0] ;
         A830TipArtDsc = P03U321_A830TipArtDsc[0] ;
         n830TipArtDsc = P03U321_n830TipArtDsc[0] ;
         AV14TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   public void S141( )
   {
      /* 'HISRE2HISRE3' Routine */
      returnInSub = false ;
      /* Using cursor P03U322 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(AV64Discod)});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A13213DisNormID = P03U322_A13213DisNormID[0] ;
         A13216DisNormDsc = P03U322_A13216DisNormDsc[0] ;
         n13216DisNormDsc = P03U322_n13216DisNormDsc[0] ;
         A13214DisNormSt = P03U322_A13214DisNormSt[0] ;
         A13215DisNormNC = P03U322_A13215DisNormNC[0] ;
         A361DisCod = P03U322_A361DisCod[0] ;
         A13216DisNormDsc = P03U322_A13216DisNormDsc[0] ;
         n13216DisNormDsc = P03U322_n13216DisNormDsc[0] ;
         /*
            INSERT RECORD ON TABLE TXPHISRE2

         */
         A4492HreBarCod = AV8BarCod ;
         A4493HreBarReo = AV9BarCodReo ;
         A4494HreBarPar = AV10BarCodPar ;
         A4495HreNumCie = AV11NumCie ;
         A4545HreLinMaq = AV23RecLinMaq ;
         A14278HreNormId = A13213DisNormID ;
         A14279HreNormDsc = A13216DisNormDsc ;
         A14280HreNormSt = A13214DisNormSt ;
         A14281HreNormNc = A13215DisNormNC ;
         /* Using cursor P03U323 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), A14278HreNormId, A14279HreNormDsc, A14280HreNormSt, A14281HreNormNc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISRE2");
         if ( (pr_default.getStatus(17) == 1) )
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
         pr_default.readNext(16);
      }
      pr_default.close(16);
      /* Using cursor P03U324 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(AV64Discod)});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A13376DisTraID = P03U324_A13376DisTraID[0] ;
         A13375DisTraDsc = P03U324_A13375DisTraDsc[0] ;
         n13375DisTraDsc = P03U324_n13375DisTraDsc[0] ;
         A361DisCod = P03U324_A361DisCod[0] ;
         A13375DisTraDsc = P03U324_A13375DisTraDsc[0] ;
         n13375DisTraDsc = P03U324_n13375DisTraDsc[0] ;
         /*
            INSERT RECORD ON TABLE TXPHISRE3

         */
         A4492HreBarCod = AV8BarCod ;
         A4493HreBarReo = AV9BarCodReo ;
         A4494HreBarPar = AV10BarCodPar ;
         A4495HreNumCie = AV11NumCie ;
         A4545HreLinMaq = AV23RecLinMaq ;
         A14282HreTraID = A13376DisTraID ;
         A14283HreTraDsc = A13375DisTraDsc ;
         /* Using cursor P03U325 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), A14282HreTraID, A14283HreTraDsc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISRE3");
         if ( (pr_default.getStatus(19) == 1) )
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
         pr_default.readNext(18);
      }
      pr_default.close(18);
   }

   protected void cleanup( )
   {
      this.aP0[0] = phisreca.this.A396EmprCod;
      this.aP1[0] = phisreca.this.A129BarCod;
      this.aP2[0] = phisreca.this.A132BarCodReo;
      this.aP3[0] = phisreca.this.A130BarCodPar;
      this.aP4[0] = phisreca.this.AV23RecLinMaq;
      this.aP5[0] = phisreca.this.AV30RecLtsSr;
      this.aP6[0] = phisreca.this.AV31Hreacaq;
      this.aP7[0] = phisreca.this.AV33Abs2;
      this.aP8[0] = phisreca.this.AV57BarCosPD;
      this.aP9[0] = phisreca.this.AV53BarCosAD;
      this.aP10[0] = phisreca.this.AV52BarCosAA;
      this.aP11[0] = phisreca.this.AV56BarCosPA;
      this.aP12[0] = phisreca.this.AV55BarCosCol;
      this.aP13[0] = phisreca.this.AV54BarCosAnc;
      this.aP14[0] = phisreca.this.AV60Fechacierre;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV61UsurCod = "" ;
      AV62Station = "" ;
      AV63EmprNom = "" ;
      AV28recTotKgs = DecimalUtil.ZERO ;
      AV29RecTotMts = DecimalUtil.ZERO ;
      AV32RecFa = DecimalUtil.ZERO ;
      AV41RecHdrLts = "" ;
      AV43RecAbs2 = DecimalUtil.ZERO ;
      AV26MaqCod = "" ;
      AV27recacab = "" ;
      AV45Hredti = GXutil.resetTime( GXutil.nullDate() );
      AV46Hredtf = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P03U32_A396EmprCod = new String[] {""} ;
      P03U32_A129BarCod = new int[1] ;
      P03U32_A132BarCodReo = new byte[1] ;
      P03U32_A130BarCodPar = new String[] {""} ;
      P03U32_A2804RecLinMaq = new short[1] ;
      P03U32_A602MaqCod = new String[] {""} ;
      P03U32_A6039RecAcab = new String[] {""} ;
      P03U32_n6039RecAcab = new boolean[] {false} ;
      P03U32_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U32_A4260RecTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U32_n4260RecTotMts = new boolean[] {false} ;
      P03U32_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U32_A9812RecHdrLts = new String[] {""} ;
      P03U32_n9812RecHdrLts = new boolean[] {false} ;
      P03U32_A9764RecLtsSR = new int[1] ;
      P03U32_n9764RecLtsSR = new boolean[] {false} ;
      P03U32_A9811RecAbs2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U32_n9811RecAbs2 = new boolean[] {false} ;
      P03U32_A5109RecNumInt = new int[1] ;
      P03U32_A9998RecAnc = new short[1] ;
      P03U32_n9998RecAnc = new boolean[] {false} ;
      P03U32_A9997Recgrm = new short[1] ;
      P03U32_n9997Recgrm = new boolean[] {false} ;
      P03U32_A5115RecAbsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U32_A9996RecObsq = new String[] {""} ;
      P03U32_n9996RecObsq = new boolean[] {false} ;
      P03U32_A11507RecAva = new String[] {""} ;
      P03U32_n11507RecAva = new boolean[] {false} ;
      P03U32_A12128RecAs = new String[] {""} ;
      P03U32_n12128RecAs = new boolean[] {false} ;
      P03U32_A12129RecAi = new String[] {""} ;
      P03U32_n12129RecAi = new boolean[] {false} ;
      A602MaqCod = "" ;
      A6039RecAcab = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4260RecTotMts = DecimalUtil.ZERO ;
      A2806RecFA = DecimalUtil.ZERO ;
      A9812RecHdrLts = "" ;
      A9811RecAbs2 = DecimalUtil.ZERO ;
      A5115RecAbsFac = DecimalUtil.ZERO ;
      A9996RecObsq = "" ;
      A11507RecAva = "" ;
      A12128RecAs = "" ;
      A12129RecAi = "" ;
      AV49Hrevel = DecimalUtil.ZERO ;
      AV50Hreobs = "" ;
      AV51Hreava = "" ;
      AV58HreAs = "" ;
      AV59HreAi = "" ;
      P03U35_A396EmprCod = new String[] {""} ;
      P03U35_A129BarCod = new int[1] ;
      P03U35_A132BarCodReo = new byte[1] ;
      P03U35_A130BarCodPar = new String[] {""} ;
      P03U35_A143BarDisNum = new String[] {""} ;
      P03U35_A212BarSer = new String[] {""} ;
      P03U35_A1652BarSerDsc = new String[] {""} ;
      P03U35_A217BarTipArt = new short[1] ;
      P03U35_n217BarTipArt = new boolean[] {false} ;
      P03U35_A135BarColNom = new String[] {""} ;
      P03U35_A136BarColNum = new int[1] ;
      P03U35_A1234BarNomCli = new String[] {""} ;
      P03U35_A1235BarNumCli = new int[1] ;
      P03U35_A218BarTipCol = new byte[1] ;
      P03U35_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P03U35_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P03U35_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P03U35_A182BarMat = new String[] {""} ;
      P03U35_A966PartCod = new String[] {""} ;
      P03U35_n966PartCod = new boolean[] {false} ;
      P03U35_A1500BarNMtr = new String[] {""} ;
      P03U35_A1499BarNMez = new String[] {""} ;
      P03U35_A1878BarNumTen = new String[] {""} ;
      P03U35_A3313BarNumTon = new String[] {""} ;
      P03U35_A4812BarEncCli = new String[] {""} ;
      P03U35_A221BarTra1 = new String[] {""} ;
      P03U35_A224BarTraP1 = new short[1] ;
      P03U35_A222BarTra2 = new String[] {""} ;
      P03U35_A225BarTraP2 = new short[1] ;
      P03U35_A223BarTra3 = new String[] {""} ;
      P03U35_A226BarTraP3 = new short[1] ;
      P03U35_A229BarUrd1 = new String[] {""} ;
      P03U35_A232BarUrdP1 = new short[1] ;
      P03U35_A230BarUrd2 = new String[] {""} ;
      P03U35_A233BarUrdP2 = new short[1] ;
      P03U35_A231BarUrd3 = new String[] {""} ;
      P03U35_A234BarUrdP3 = new short[1] ;
      P03U35_A252CliCod = new int[1] ;
      P03U35_n252CliCod = new boolean[] {false} ;
      P03U35_A2452BarCal = new String[] {""} ;
      P03U35_n2452BarCal = new boolean[] {false} ;
      P03U35_A361DisCod = new int[1] ;
      P03U35_A4466BarAcaAnh = new short[1] ;
      P03U35_A2829BarProPer = new String[] {""} ;
      P03U35_A220BarTotPie = new int[1] ;
      P03U35_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U35_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U35_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U35_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U35_A199BarPie1 = new short[1] ;
      P03U35_A365DisDes = new String[] {""} ;
      P03U35_A898BarPieNDes = new int[1] ;
      A143BarDisNum = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A182BarMat = "" ;
      A966PartCod = "" ;
      A1500BarNMtr = "" ;
      A1499BarNMez = "" ;
      A1878BarNumTen = "" ;
      A3313BarNumTon = "" ;
      A4812BarEncCli = "" ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A229BarUrd1 = "" ;
      A230BarUrd2 = "" ;
      A231BarUrd3 = "" ;
      A2452BarCal = "" ;
      A2829BarProPer = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      AV19BarSer = "" ;
      AV20BarColNom = "" ;
      AV10BarCodPar = "" ;
      AV40Bargirar = "" ;
      AV66HreCenDsc = "" ;
      GXt_char6 = "" ;
      GXv_int7 = new short[1] ;
      AV67HreCdn2 = "" ;
      AV68HreCtw = "" ;
      GXv_int2 = new byte[1] ;
      AV17IntDsc = "" ;
      A4494HreBarPar = "" ;
      A4516HreDisCli = "" ;
      A4517HreBarSer = "" ;
      A4518HreBarDsc = "" ;
      A4520HreTipArtD = "" ;
      AV14TipArtDsc = "" ;
      A4521HreColNom = "" ;
      A4523HreColNomC = "" ;
      A4526HreTipColN = "" ;
      AV13TipColDsc = "" ;
      A4527HreFecGen = GXutil.nullDate() ;
      A4528HreFecCli = GXutil.nullDate() ;
      A4529HreFecTin = GXutil.nullDate() ;
      A4530HreFecFpr = GXutil.nullDate() ;
      A4532HreBarKgm = DecimalUtil.ZERO ;
      A4533HreBarMtr = DecimalUtil.ZERO ;
      A4531HreBarMat = "" ;
      A4535HrePartCod = "" ;
      A4536HreBarNMtr = "" ;
      A4537HreBarNMez = "" ;
      A4538HreNumTen = "" ;
      A4540HreIntDsc = "" ;
      A4541HreNumTon = "" ;
      A4496HreMaqHdr = "" ;
      A4542HreTotKgm = DecimalUtil.ZERO ;
      A4543HreTotMtr = DecimalUtil.ZERO ;
      A9807HreAcaQm = "" ;
      A9808HreRacab = "" ;
      A9809HreFecAcb = GXutil.resetTime( GXutil.nullDate() );
      A9810HreAbs = DecimalUtil.ZERO ;
      A10100HreHdrLts = "" ;
      A10101HreFabs = DecimalUtil.ZERO ;
      A11318HreDispCli = "" ;
      A12536HreCenDsc = "" ;
      AV69HreComp1 = "" ;
      AV70HreComp2 = "" ;
      A13450HreComp1 = "" ;
      A13451HreComp2 = "" ;
      A13763HreUser = "" ;
      A13764HreDiaHora = GXutil.resetTime( GXutil.nullDate() );
      A13765HreCdn2 = "" ;
      A13766HreCtw = "" ;
      Gx_emsg = "" ;
      P03U39_A396EmprCod = new String[] {""} ;
      P03U39_A129BarCod = new int[1] ;
      P03U39_A132BarCodReo = new byte[1] ;
      P03U39_A130BarCodPar = new String[] {""} ;
      P03U39_A2804RecLinMaq = new short[1] ;
      P03U39_A602MaqCod = new String[] {""} ;
      P03U39_A2805RecVolPrd = new int[1] ;
      P03U39_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U39_A1272UltLinPro = new byte[1] ;
      P03U39_A4574RecFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      P03U39_A4575RecMaqPes = new byte[1] ;
      P03U39_A4402RecUsrCod = new String[] {""} ;
      P03U39_A4258RecMaqFas = new String[] {""} ;
      P03U39_n4258RecMaqFas = new boolean[] {false} ;
      P03U39_A4268RecOrdLin = new short[1] ;
      P03U39_n4268RecOrdLin = new boolean[] {false} ;
      P03U39_A4654RecNroPar = new int[1] ;
      P03U39_n4654RecNroPar = new boolean[] {false} ;
      P03U39_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P03U39_n4866RecFecAlt = new boolean[] {false} ;
      P03U39_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P03U39_n4867RecFecMod = new boolean[] {false} ;
      P03U39_A4868RecUsrMod = new String[] {""} ;
      P03U39_n4868RecUsrMod = new boolean[] {false} ;
      P03U39_A4261RecTotPrd = new int[1] ;
      P03U39_n4261RecTotPrd = new boolean[] {false} ;
      P03U39_A7764RecMaqNh = new short[1] ;
      P03U39_A7765RecMaqVX = new byte[1] ;
      P03U39_A7766RecMaqBL = new byte[1] ;
      P03U39_A7767RecMaqFlow = new byte[1] ;
      P03U39_A7768RecMaqRPM = new short[1] ;
      P03U39_A7769RecMaqMol = new short[1] ;
      P03U39_A7770RecMaqTor = new short[1] ;
      P03U39_A7771RecMaqCla = new String[] {""} ;
      P03U39_A7772RecMaqTej = new byte[1] ;
      P03U39_A7773RecMaqDel = new byte[1] ;
      P03U39_A7774RecMaqPML = new short[1] ;
      P03U39_A6039RecAcab = new String[] {""} ;
      P03U39_n6039RecAcab = new boolean[] {false} ;
      P03U39_A5110RecNumPrg = new String[] {""} ;
      P03U39_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U39_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U39_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U39_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      A4402RecUsrCod = "" ;
      A4258RecMaqFas = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4867RecFecMod = GXutil.resetTime( GXutil.nullDate() );
      A4868RecUsrMod = "" ;
      A7771RecMaqCla = "" ;
      A5110RecNumPrg = "" ;
      A4546HreMaqCod = "" ;
      A4548HreFacAbs = DecimalUtil.ZERO ;
      A4584HreFecPes = GXutil.resetTime( GXutil.nullDate() );
      A4863HreUsrCod = "" ;
      A4963HreFasCod = "" ;
      A4960HreFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4962HreFecMod = GXutil.resetTime( GXutil.nullDate() );
      A4961HreUsrMod = "" ;
      A4968HreTotKgs = DecimalUtil.ZERO ;
      A4969HreTotMts = DecimalUtil.ZERO ;
      A7821HReMaqCla = "" ;
      A9803HreAcaQ = "" ;
      A9804HreAcab = "" ;
      A1094HreNPrg = "" ;
      A697HreLotF = "" ;
      A10104HreDtf = GXutil.resetTime( GXutil.nullDate() );
      A10103HreDti = GXutil.resetTime( GXutil.nullDate() );
      A10383HreVel = DecimalUtil.ZERO ;
      A10384HreObs = "" ;
      A11508HreAva = "" ;
      A8602HreCosAA = DecimalUtil.ZERO ;
      A8603HrecosAd = DecimalUtil.ZERO ;
      A8604HreCosAnc = DecimalUtil.ZERO ;
      A8605HreCosCol = DecimalUtil.ZERO ;
      A8606HreCosPA = DecimalUtil.ZERO ;
      A8607HreCosPD = DecimalUtil.ZERO ;
      A12126HreAs = "" ;
      A12127HreAi = "" ;
      Gx_msg = "" ;
      P03U311_A396EmprCod = new String[] {""} ;
      P03U311_A129BarCod = new int[1] ;
      P03U311_A132BarCodReo = new byte[1] ;
      P03U311_A130BarCodPar = new String[] {""} ;
      P03U311_A2804RecLinMaq = new short[1] ;
      P03U311_A1273RecLinPro = new byte[1] ;
      P03U311_A764ProForCod = new String[] {""} ;
      P03U311_A766ProForDsc = new String[] {""} ;
      P03U311_A771ProForTie = new short[1] ;
      P03U311_A772ProForTmx = new short[1] ;
      P03U311_A4697RecNroPrg = new int[1] ;
      P03U311_A1251RecNumRec = new int[1] ;
      P03U311_A4695RecVolPrf = new int[1] ;
      P03U311_A10544RecNH2O = new short[1] ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      P03U313_A396EmprCod = new String[] {""} ;
      P03U313_A129BarCod = new int[1] ;
      P03U313_A132BarCodReo = new byte[1] ;
      P03U313_A130BarCodPar = new String[] {""} ;
      P03U313_A2804RecLinMaq = new short[1] ;
      P03U313_A1273RecLinPro = new byte[1] ;
      P03U313_A811RecLin = new short[1] ;
      P03U313_A872RecPrdNum = new String[] {""} ;
      P03U313_A875RecPrdDsc = new String[] {""} ;
      P03U313_A490ForPrdUMe = new byte[1] ;
      P03U313_n490ForPrdUMe = new boolean[] {false} ;
      P03U313_A488ForPrdDsc = new String[] {""} ;
      P03U313_n488ForPrdDsc = new boolean[] {false} ;
      P03U313_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U313_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U313_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U313_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U313_A2394RecForNro = new byte[1] ;
      P03U313_A3274RecPrdTnq = new byte[1] ;
      P03U313_A3804RecFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      P03U313_A3805RecAnyTie = new short[1] ;
      P03U313_A3806RecUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U313_A3807RecPorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U313_A3938RecCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U313_A4024RecMar = new byte[1] ;
      P03U313_A4576RecLinUsr = new String[] {""} ;
      P03U313_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P03U313_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U313_A5725RecLote = new String[] {""} ;
      P03U313_A9813FacCon1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U313_A11708RecProv = new int[1] ;
      P03U313_A12641RecPrdDc2 = new String[] {""} ;
      P03U313_A12717RecFabId = new int[1] ;
      P03U313_A13938RecLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      P03U313_A13937RecLotAlm = new short[1] ;
      P03U313_A719PrdNum = new String[] {""} ;
      P03U313_n719PrdNum = new boolean[] {false} ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A488ForPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A3804RecFecMov = GXutil.nullDate() ;
      A3806RecUltAny = DecimalUtil.ZERO ;
      A3807RecPorAny = DecimalUtil.ZERO ;
      A3938RecCanEns = DecimalUtil.ZERO ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A724PrdPreAct = DecimalUtil.ZERO ;
      A5725RecLote = "" ;
      A9813FacCon1 = DecimalUtil.ZERO ;
      A12641RecPrdDc2 = "" ;
      A13938RecLoteFch = GXutil.nullDate() ;
      A719PrdNum = "" ;
      A4558HrePrdNum = "" ;
      A4559HrePrdDsc = "" ;
      A4561HrePrdUDs = "" ;
      A4562HreFacCon = DecimalUtil.ZERO ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4564HreCanFin = DecimalUtil.ZERO ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      A4568HreFecMov = GXutil.nullDate() ;
      A4570HreUltAny = DecimalUtil.ZERO ;
      A4571HrePorAny = DecimalUtil.ZERO ;
      A4572HreCanEns = DecimalUtil.ZERO ;
      A4582HreLinUsr = "" ;
      A4583HrePesFec = GXutil.resetTime( GXutil.nullDate() );
      A4967HrePrePrd = DecimalUtil.ZERO ;
      A5726HreLote = "" ;
      A9827HreFacCon1 = DecimalUtil.ZERO ;
      A12453HreFecAct = GXutil.nullDate() ;
      A12642HrePrdDc2 = "" ;
      A13942HreLoteFch = GXutil.nullDate() ;
      P03U315_A396EmprCod = new String[] {""} ;
      P03U315_A129BarCod = new int[1] ;
      P03U315_A132BarCodReo = new byte[1] ;
      P03U315_A130BarCodPar = new String[] {""} ;
      P03U315_A2808RecLinMAL = new short[1] ;
      P03U315_A1377RecNumAny = new byte[1] ;
      P03U315_A718PrdNom = new String[] {""} ;
      P03U315_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U315_n1378PrdCFin = new boolean[] {false} ;
      P03U315_A3380LanyPrd = new String[] {""} ;
      P03U315_n3380LanyPrd = new boolean[] {false} ;
      P03U315_A3381LanyCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U315_n3381LanyCan = new boolean[] {false} ;
      P03U315_A3382LanyNro = new byte[1] ;
      P03U315_n3382LanyNro = new boolean[] {false} ;
      P03U315_A3383LanyTnq = new byte[1] ;
      P03U315_n3383LanyTnq = new boolean[] {false} ;
      P03U315_A4578LanyUsr = new String[] {""} ;
      P03U315_n4578LanyUsr = new boolean[] {false} ;
      P03U315_A4579LanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      P03U315_n4579LanyFec = new boolean[] {false} ;
      P03U315_A5807LanyLote = new String[] {""} ;
      P03U315_n5807LanyLote = new boolean[] {false} ;
      P03U315_A13939LanyLoteFc = new java.util.Date[] {GXutil.nullDate()} ;
      P03U315_A719PrdNum = new String[] {""} ;
      P03U315_n719PrdNum = new boolean[] {false} ;
      A718PrdNom = "" ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A3380LanyPrd = "" ;
      A3381LanyCan = DecimalUtil.ZERO ;
      A4578LanyUsr = "" ;
      A4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
      A5807LanyLote = "" ;
      A13939LanyLoteFc = GXutil.nullDate() ;
      A4510HrdPrdDsc = "" ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      A4512HreLanyPrd = "" ;
      A4513HreLanyCan = DecimalUtil.ZERO ;
      A4580HreLanyUsr = "" ;
      A4581HreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      A5808HreLanyLot = "" ;
      A13940HreLanyLtF = GXutil.nullDate() ;
      P03U317_A396EmprCod = new String[] {""} ;
      P03U317_A129BarCod = new int[1] ;
      P03U317_A132BarCodReo = new byte[1] ;
      P03U317_A130BarCodPar = new String[] {""} ;
      P03U317_A6031Ac_Barcod = new int[1] ;
      P03U317_A6032Ac_BarReo = new byte[1] ;
      P03U317_A6033Ac_BarPar = new String[] {""} ;
      P03U317_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U317_n6035Ac_Kilos = new boolean[] {false} ;
      P03U317_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03U317_n6034Ac_Metros = new boolean[] {false} ;
      P03U317_A6036Ac_Pzs = new short[1] ;
      P03U317_n6036Ac_Pzs = new boolean[] {false} ;
      A6033Ac_BarPar = "" ;
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      GXv_char12 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_int9 = new int[1] ;
      AV36BarAgrser = "" ;
      GXv_char5 = new String[1] ;
      AV37Baragrdsc = "" ;
      GXv_char4 = new String[1] ;
      AV38Colnomagr = "" ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new int[1] ;
      A9987HreAcPar = "" ;
      A9988HreAcKgm = DecimalUtil.ZERO ;
      A9989HreAcMtr = DecimalUtil.ZERO ;
      A9992HreAcSer = "" ;
      A9993HreAcDsc = "" ;
      A9994HreAcCol = "" ;
      P03U319_A396EmprCod = new String[] {""} ;
      P03U319_A4494HreBarPar = new String[] {""} ;
      P03U319_A4493HreBarReo = new byte[1] ;
      P03U319_A4492HreBarCod = new int[1] ;
      P03U319_A4495HreNumCie = new byte[1] ;
      P03U320_A396EmprCod = new String[] {""} ;
      P03U320_A831TipColCod = new byte[1] ;
      P03U320_A832TipColDsc = new String[] {""} ;
      P03U320_n832TipColDsc = new boolean[] {false} ;
      A832TipColDsc = "" ;
      P03U321_A396EmprCod = new String[] {""} ;
      P03U321_A829TipArtCod = new short[1] ;
      P03U321_A830TipArtDsc = new String[] {""} ;
      P03U321_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      P03U322_A396EmprCod = new String[] {""} ;
      P03U322_A13213DisNormID = new String[] {""} ;
      P03U322_A13216DisNormDsc = new String[] {""} ;
      P03U322_n13216DisNormDsc = new boolean[] {false} ;
      P03U322_A13214DisNormSt = new String[] {""} ;
      P03U322_A13215DisNormNC = new String[] {""} ;
      P03U322_A361DisCod = new int[1] ;
      A13213DisNormID = "" ;
      A13216DisNormDsc = "" ;
      A13214DisNormSt = "" ;
      A13215DisNormNC = "" ;
      A14278HreNormId = "" ;
      A14279HreNormDsc = "" ;
      A14280HreNormSt = "" ;
      A14281HreNormNc = "" ;
      P03U324_A396EmprCod = new String[] {""} ;
      P03U324_A13376DisTraID = new String[] {""} ;
      P03U324_A13375DisTraDsc = new String[] {""} ;
      P03U324_n13375DisTraDsc = new boolean[] {false} ;
      P03U324_A361DisCod = new int[1] ;
      A13376DisTraID = "" ;
      A13375DisTraDsc = "" ;
      A14282HreTraID = "" ;
      A14283HreTraDsc = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.phisreca__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.phisreca__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.phisreca__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.phisreca__default(),
         new Object[] {
             new Object[] {
            P03U32_A396EmprCod, P03U32_A129BarCod, P03U32_A132BarCodReo, P03U32_A130BarCodPar, P03U32_A2804RecLinMaq, P03U32_A602MaqCod, P03U32_A6039RecAcab, P03U32_n6039RecAcab, P03U32_A4259RecTotKgs, P03U32_A4260RecTotMts,
            P03U32_n4260RecTotMts, P03U32_A2806RecFA, P03U32_A9812RecHdrLts, P03U32_n9812RecHdrLts, P03U32_A9764RecLtsSR, P03U32_n9764RecLtsSR, P03U32_A9811RecAbs2, P03U32_n9811RecAbs2, P03U32_A5109RecNumInt, P03U32_A9998RecAnc,
            P03U32_n9998RecAnc, P03U32_A9997Recgrm, P03U32_n9997Recgrm, P03U32_A5115RecAbsFac, P03U32_A9996RecObsq, P03U32_n9996RecObsq, P03U32_A11507RecAva, P03U32_n11507RecAva, P03U32_A12128RecAs, P03U32_n12128RecAs,
            P03U32_A12129RecAi, P03U32_n12129RecAi
            }
            , new Object[] {
            P03U35_A396EmprCod, P03U35_A129BarCod, P03U35_A132BarCodReo, P03U35_A130BarCodPar, P03U35_A143BarDisNum, P03U35_A212BarSer, P03U35_A1652BarSerDsc, P03U35_A217BarTipArt, P03U35_n217BarTipArt, P03U35_A135BarColNom,
            P03U35_A136BarColNum, P03U35_A1234BarNomCli, P03U35_A1235BarNumCli, P03U35_A218BarTipCol, P03U35_A159BarFecGen, P03U35_A155BarFecCli, P03U35_A158BarFecFpr, P03U35_A182BarMat, P03U35_A966PartCod, P03U35_n966PartCod,
            P03U35_A1500BarNMtr, P03U35_A1499BarNMez, P03U35_A1878BarNumTen, P03U35_A3313BarNumTon, P03U35_A4812BarEncCli, P03U35_A221BarTra1, P03U35_A224BarTraP1, P03U35_A222BarTra2, P03U35_A225BarTraP2, P03U35_A223BarTra3,
            P03U35_A226BarTraP3, P03U35_A229BarUrd1, P03U35_A232BarUrdP1, P03U35_A230BarUrd2, P03U35_A233BarUrdP2, P03U35_A231BarUrd3, P03U35_A234BarUrdP3, P03U35_A252CliCod, P03U35_n252CliCod, P03U35_A2452BarCal,
            P03U35_n2452BarCal, P03U35_A361DisCod, P03U35_A4466BarAcaAnh, P03U35_A2829BarProPer, P03U35_A220BarTotPie, P03U35_A184BarMtr, P03U35_A870BarTotMtr, P03U35_A166BarKgm, P03U35_A219BarTotAgr, P03U35_A199BarPie1,
            P03U35_A365DisDes, P03U35_A898BarPieNDes
            }
            , new Object[] {
            }
            , new Object[] {
            P03U39_A396EmprCod, P03U39_A129BarCod, P03U39_A132BarCodReo, P03U39_A130BarCodPar, P03U39_A2804RecLinMaq, P03U39_A602MaqCod, P03U39_A2805RecVolPrd, P03U39_A2806RecFA, P03U39_A1272UltLinPro, P03U39_A4574RecFecPes,
            P03U39_A4575RecMaqPes, P03U39_A4402RecUsrCod, P03U39_A4258RecMaqFas, P03U39_n4258RecMaqFas, P03U39_A4268RecOrdLin, P03U39_n4268RecOrdLin, P03U39_A4654RecNroPar, P03U39_n4654RecNroPar, P03U39_A4866RecFecAlt, P03U39_n4866RecFecAlt,
            P03U39_A4867RecFecMod, P03U39_n4867RecFecMod, P03U39_A4868RecUsrMod, P03U39_n4868RecUsrMod, P03U39_A4261RecTotPrd, P03U39_n4261RecTotPrd, P03U39_A7764RecMaqNh, P03U39_A7765RecMaqVX, P03U39_A7766RecMaqBL, P03U39_A7767RecMaqFlow,
            P03U39_A7768RecMaqRPM, P03U39_A7769RecMaqMol, P03U39_A7770RecMaqTor, P03U39_A7771RecMaqCla, P03U39_A7772RecMaqTej, P03U39_A7773RecMaqDel, P03U39_A7774RecMaqPML, P03U39_A6039RecAcab, P03U39_n6039RecAcab, P03U39_A5110RecNumPrg,
            P03U39_A219BarTotAgr, P03U39_A166BarKgm, P03U39_A870BarTotMtr, P03U39_A184BarMtr
            }
            , new Object[] {
            }
            , new Object[] {
            P03U311_A396EmprCod, P03U311_A129BarCod, P03U311_A132BarCodReo, P03U311_A130BarCodPar, P03U311_A2804RecLinMaq, P03U311_A1273RecLinPro, P03U311_A764ProForCod, P03U311_A766ProForDsc, P03U311_A771ProForTie, P03U311_A772ProForTmx,
            P03U311_A4697RecNroPrg, P03U311_A1251RecNumRec, P03U311_A4695RecVolPrf, P03U311_A10544RecNH2O
            }
            , new Object[] {
            }
            , new Object[] {
            P03U313_A396EmprCod, P03U313_A129BarCod, P03U313_A132BarCodReo, P03U313_A130BarCodPar, P03U313_A2804RecLinMaq, P03U313_A1273RecLinPro, P03U313_A811RecLin, P03U313_A872RecPrdNum, P03U313_A875RecPrdDsc, P03U313_A490ForPrdUMe,
            P03U313_n490ForPrdUMe, P03U313_A488ForPrdDsc, P03U313_n488ForPrdDsc, P03U313_A431FacCon, P03U313_A686PrdCant, P03U313_A683PrdCanFin, P03U313_A1797PrdCanAny, P03U313_A2394RecForNro, P03U313_A3274RecPrdTnq, P03U313_A3804RecFecMov,
            P03U313_A3805RecAnyTie, P03U313_A3806RecUltAny, P03U313_A3807RecPorAny, P03U313_A3938RecCanEns, P03U313_A4024RecMar, P03U313_A4576RecLinUsr, P03U313_A4577RecPesFec, P03U313_A724PrdPreAct, P03U313_A5725RecLote, P03U313_A9813FacCon1,
            P03U313_A11708RecProv, P03U313_A12641RecPrdDc2, P03U313_A12717RecFabId, P03U313_A13938RecLoteFch, P03U313_A13937RecLotAlm, P03U313_A719PrdNum, P03U313_n719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            P03U315_A396EmprCod, P03U315_A129BarCod, P03U315_A132BarCodReo, P03U315_A130BarCodPar, P03U315_A2808RecLinMAL, P03U315_A1377RecNumAny, P03U315_A718PrdNom, P03U315_A1378PrdCFin, P03U315_n1378PrdCFin, P03U315_A3380LanyPrd,
            P03U315_n3380LanyPrd, P03U315_A3381LanyCan, P03U315_n3381LanyCan, P03U315_A3382LanyNro, P03U315_n3382LanyNro, P03U315_A3383LanyTnq, P03U315_n3383LanyTnq, P03U315_A4578LanyUsr, P03U315_n4578LanyUsr, P03U315_A4579LanyFec,
            P03U315_n4579LanyFec, P03U315_A5807LanyLote, P03U315_n5807LanyLote, P03U315_A13939LanyLoteFc, P03U315_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            P03U317_A396EmprCod, P03U317_A129BarCod, P03U317_A132BarCodReo, P03U317_A130BarCodPar, P03U317_A6031Ac_Barcod, P03U317_A6032Ac_BarReo, P03U317_A6033Ac_BarPar, P03U317_A6035Ac_Kilos, P03U317_n6035Ac_Kilos, P03U317_A6034Ac_Metros,
            P03U317_n6034Ac_Metros, P03U317_A6036Ac_Pzs, P03U317_n6036Ac_Pzs
            }
            , new Object[] {
            }
            , new Object[] {
            P03U319_A396EmprCod, P03U319_A4494HreBarPar, P03U319_A4493HreBarReo, P03U319_A4492HreBarCod, P03U319_A4495HreNumCie
            }
            , new Object[] {
            P03U320_A396EmprCod, P03U320_A831TipColCod, P03U320_A832TipColDsc, P03U320_n832TipColDsc
            }
            , new Object[] {
            P03U321_A396EmprCod, P03U321_A829TipArtCod, P03U321_A830TipArtDsc, P03U321_n830TipArtDsc
            }
            , new Object[] {
            P03U322_A396EmprCod, P03U322_A13213DisNormID, P03U322_A13216DisNormDsc, P03U322_n13216DisNormDsc, P03U322_A13214DisNormSt, P03U322_A13215DisNormNC, P03U322_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            P03U324_A396EmprCod, P03U324_A13376DisTraID, P03U324_A13375DisTraDsc, P03U324_n13375DisTraDsc, P03U324_A361DisCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV25NCLec ;
   private byte GXt_int1 ;
   private byte A218BarTipCol ;
   private byte AV12BarTipCol ;
   private byte AV9BarCodReo ;
   private byte GXv_int2[] ;
   private byte AV16IntCod ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte AV11NumCie ;
   private byte A4525HreTipCol ;
   private byte A4539HreIntCod ;
   private byte A1272UltLinPro ;
   private byte A4575RecMaqPes ;
   private byte A7765RecMaqVX ;
   private byte A7766RecMaqBL ;
   private byte A7767RecMaqFlow ;
   private byte A7772RecMaqTej ;
   private byte A7773RecMaqDel ;
   private byte A4549HreULinPro ;
   private byte A4585HreMaqPes ;
   private byte A7815HReMaqVX ;
   private byte A7816HReMaqBL ;
   private byte A7817HReMaqFlow ;
   private byte A7822HReMaqTej ;
   private byte A7823HReMaqDel ;
   private byte A1273RecLinPro ;
   private byte A4550HreLinPro ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A4024RecMar ;
   private byte A4560HrePrdUMe ;
   private byte A4566HreForNro ;
   private byte A4567HrePrdTnq ;
   private byte A4573HreRecMar ;
   private byte A1377RecNumAny ;
   private byte A3382LanyNro ;
   private byte A3383LanyTnq ;
   private byte A4509HreNumAny ;
   private byte A4514HreLanyNro ;
   private byte A4515HreLanyTnq ;
   private byte A6032Ac_BarReo ;
   private byte GXv_int10[] ;
   private byte A9986HreAcReo ;
   private byte AV24Ok_Linmaq ;
   private byte A831TipColCod ;
   private short AV23RecLinMaq ;
   private short A2804RecLinMaq ;
   private short A9998RecAnc ;
   private short A9997Recgrm ;
   private short AV47Hreanc ;
   private short AV48Hregrm ;
   private short A217BarTipArt ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A232BarUrdP1 ;
   private short A233BarUrdP2 ;
   private short A234BarUrdP3 ;
   private short A4466BarAcaAnh ;
   private short A199BarPie1 ;
   private short AV15BarTipArt ;
   private short AV65HreCencId ;
   private short GXv_int7[] ;
   private short A4519HreTipArt ;
   private short A12535HreCencId ;
   private short Gx_err ;
   private short A4268RecOrdLin ;
   private short A7764RecMaqNh ;
   private short A7768RecMaqRPM ;
   private short A7769RecMaqMol ;
   private short A7770RecMaqTor ;
   private short A7774RecMaqPML ;
   private short A4545HreLinMaq ;
   private short A4964HreOrdLin ;
   private short A7814HReMaqNh ;
   private short A7818HReMaqRPM ;
   private short A7819HReMaqMol ;
   private short A7820HReMaqTor ;
   private short A7824HReMaqPML ;
   private short A10381HreAnc ;
   private short A10382HreGrm ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short A10544RecNH2O ;
   private short A4553HreProTie ;
   private short A4554HreProTmx ;
   private short A10545HreNH2O ;
   private short A811RecLin ;
   private short A3805RecAnyTie ;
   private short A13937RecLotAlm ;
   private short A4557HreRecLin ;
   private short A4569HreAnyTie ;
   private short A13943HreLotAlm ;
   private short A2808RecLinMAL ;
   private short A4508HreLinMAL ;
   private short A6036Ac_Pzs ;
   private short A829TipArtCod ;
   private int A129BarCod ;
   private int AV30RecLtsSr ;
   private int AV44RecNumInt ;
   private int AV42LtsRec ;
   private int A9764RecLtsSR ;
   private int A5109RecNumInt ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A220BarTotPie ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int A813RecTotPie ;
   private int AV18CliCod ;
   private int AV21BarColNum ;
   private int AV8BarCod ;
   private int AV64Discod ;
   private int GX_INS675 ;
   private int A4492HreBarCod ;
   private int A4522HreColNum ;
   private int A4524HreColNumC ;
   private int A4534HreBarPie ;
   private int A4544HreTotPie ;
   private int A9805HreLtsSR ;
   private int A9806HreLtsRs ;
   private int A10099HreLtsRc ;
   private int A12264HreNInter ;
   private int A2805RecVolPrd ;
   private int A4654RecNroPar ;
   private int A4261RecTotPrd ;
   private int GX_INS678 ;
   private int A4547HreVolPrd ;
   private int A4965HreNroPar ;
   private int A4970HreTotPrd ;
   private int A9780HreLtsSb ;
   private int A9781HreLtsRm ;
   private int A10102HreNumInt ;
   private int A4697RecNroPrg ;
   private int A1251RecNumRec ;
   private int A4695RecVolPrf ;
   private int GX_INS1874 ;
   private int A4555HreNumPro ;
   private int A4556HreNumRec ;
   private int A4966HreVolPro ;
   private int A11708RecProv ;
   private int A12717RecFabId ;
   private int GX_INS680 ;
   private int A11707HreProv ;
   private int A12718HreFabId ;
   private int GX_INS677 ;
   private int A6031Ac_Barcod ;
   private int GXv_int13[] ;
   private int AV35Clicodagr ;
   private int GXv_int9[] ;
   private int AV39Colnumagr ;
   private int GXv_int8[] ;
   private int GX_INS1327 ;
   private int A9985HreAcCod ;
   private int A9990HreAcPie ;
   private int A9991HreAcCli ;
   private int A9995HreAcNumC ;
   private int GX_INS1901 ;
   private int GX_INS1900 ;
   private java.math.BigDecimal AV33Abs2 ;
   private java.math.BigDecimal AV57BarCosPD ;
   private java.math.BigDecimal AV53BarCosAD ;
   private java.math.BigDecimal AV52BarCosAA ;
   private java.math.BigDecimal AV56BarCosPA ;
   private java.math.BigDecimal AV55BarCosCol ;
   private java.math.BigDecimal AV54BarCosAnc ;
   private java.math.BigDecimal AV28recTotKgs ;
   private java.math.BigDecimal AV29RecTotMts ;
   private java.math.BigDecimal AV32RecFa ;
   private java.math.BigDecimal AV43RecAbs2 ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4260RecTotMts ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A9811RecAbs2 ;
   private java.math.BigDecimal A5115RecAbsFac ;
   private java.math.BigDecimal AV49Hrevel ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal A871RecTotMtr ;
   private java.math.BigDecimal A4532HreBarKgm ;
   private java.math.BigDecimal A4533HreBarMtr ;
   private java.math.BigDecimal A4542HreTotKgm ;
   private java.math.BigDecimal A4543HreTotMtr ;
   private java.math.BigDecimal A9810HreAbs ;
   private java.math.BigDecimal A10101HreFabs ;
   private java.math.BigDecimal A4548HreFacAbs ;
   private java.math.BigDecimal A4968HreTotKgs ;
   private java.math.BigDecimal A4969HreTotMts ;
   private java.math.BigDecimal A10383HreVel ;
   private java.math.BigDecimal A8602HreCosAA ;
   private java.math.BigDecimal A8603HrecosAd ;
   private java.math.BigDecimal A8604HreCosAnc ;
   private java.math.BigDecimal A8605HreCosCol ;
   private java.math.BigDecimal A8606HreCosPA ;
   private java.math.BigDecimal A8607HreCosPD ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A3806RecUltAny ;
   private java.math.BigDecimal A3807RecPorAny ;
   private java.math.BigDecimal A3938RecCanEns ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A9813FacCon1 ;
   private java.math.BigDecimal A4562HreFacCon ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4564HreCanFin ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal A4570HreUltAny ;
   private java.math.BigDecimal A4571HrePorAny ;
   private java.math.BigDecimal A4572HreCanEns ;
   private java.math.BigDecimal A4967HrePrePrd ;
   private java.math.BigDecimal A9827HreFacCon1 ;
   private java.math.BigDecimal A1378PrdCFin ;
   private java.math.BigDecimal A3381LanyCan ;
   private java.math.BigDecimal A4511HrePrdCFin ;
   private java.math.BigDecimal A4513HreLanyCan ;
   private java.math.BigDecimal A6035Ac_Kilos ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private java.math.BigDecimal A9988HreAcKgm ;
   private java.math.BigDecimal A9989HreAcMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV31Hreacaq ;
   private String AV61UsurCod ;
   private String AV62Station ;
   private String AV63EmprNom ;
   private String AV41RecHdrLts ;
   private String AV26MaqCod ;
   private String AV27recacab ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A6039RecAcab ;
   private String A9812RecHdrLts ;
   private String A11507RecAva ;
   private String A12128RecAs ;
   private String A12129RecAi ;
   private String AV51Hreava ;
   private String AV58HreAs ;
   private String AV59HreAi ;
   private String A143BarDisNum ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A182BarMat ;
   private String A966PartCod ;
   private String A1500BarNMtr ;
   private String A1499BarNMez ;
   private String A1878BarNumTen ;
   private String A3313BarNumTon ;
   private String A4812BarEncCli ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A229BarUrd1 ;
   private String A230BarUrd2 ;
   private String A231BarUrd3 ;
   private String A2452BarCal ;
   private String A2829BarProPer ;
   private String A365DisDes ;
   private String AV19BarSer ;
   private String AV20BarColNom ;
   private String AV10BarCodPar ;
   private String AV40Bargirar ;
   private String AV66HreCenDsc ;
   private String GXt_char6 ;
   private String AV67HreCdn2 ;
   private String AV68HreCtw ;
   private String AV17IntDsc ;
   private String A4494HreBarPar ;
   private String A4516HreDisCli ;
   private String A4517HreBarSer ;
   private String A4518HreBarDsc ;
   private String A4520HreTipArtD ;
   private String AV14TipArtDsc ;
   private String A4521HreColNom ;
   private String A4523HreColNomC ;
   private String A4526HreTipColN ;
   private String AV13TipColDsc ;
   private String A4531HreBarMat ;
   private String A4535HrePartCod ;
   private String A4536HreBarNMtr ;
   private String A4537HreBarNMez ;
   private String A4538HreNumTen ;
   private String A4540HreIntDsc ;
   private String A4541HreNumTon ;
   private String A4496HreMaqHdr ;
   private String A9807HreAcaQm ;
   private String A9808HreRacab ;
   private String A10100HreHdrLts ;
   private String A11318HreDispCli ;
   private String A12536HreCenDsc ;
   private String AV69HreComp1 ;
   private String AV70HreComp2 ;
   private String A13450HreComp1 ;
   private String A13451HreComp2 ;
   private String A13763HreUser ;
   private String A13765HreCdn2 ;
   private String A13766HreCtw ;
   private String Gx_emsg ;
   private String A4402RecUsrCod ;
   private String A4258RecMaqFas ;
   private String A4868RecUsrMod ;
   private String A7771RecMaqCla ;
   private String A5110RecNumPrg ;
   private String A4546HreMaqCod ;
   private String A4863HreUsrCod ;
   private String A4963HreFasCod ;
   private String A4961HreUsrMod ;
   private String A7821HReMaqCla ;
   private String A9803HreAcaQ ;
   private String A9804HreAcab ;
   private String A1094HreNPrg ;
   private String A697HreLotF ;
   private String A11508HreAva ;
   private String A12126HreAs ;
   private String A12127HreAi ;
   private String Gx_msg ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A4551HreProCod ;
   private String A4552HreProDsc ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A4576RecLinUsr ;
   private String A5725RecLote ;
   private String A12641RecPrdDc2 ;
   private String A719PrdNum ;
   private String A4558HrePrdNum ;
   private String A4559HrePrdDsc ;
   private String A4561HrePrdUDs ;
   private String A4582HreLinUsr ;
   private String A5726HreLote ;
   private String A12642HrePrdDc2 ;
   private String A718PrdNom ;
   private String A3380LanyPrd ;
   private String A4578LanyUsr ;
   private String A5807LanyLote ;
   private String A4510HrdPrdDsc ;
   private String A4512HreLanyPrd ;
   private String A4580HreLanyUsr ;
   private String A5808HreLanyLot ;
   private String A6033Ac_BarPar ;
   private String GXv_char12[] ;
   private String GXv_char11[] ;
   private String AV36BarAgrser ;
   private String GXv_char5[] ;
   private String AV37Baragrdsc ;
   private String GXv_char4[] ;
   private String AV38Colnomagr ;
   private String GXv_char3[] ;
   private String A9987HreAcPar ;
   private String A9992HreAcSer ;
   private String A9993HreAcDsc ;
   private String A9994HreAcCol ;
   private String A832TipColDsc ;
   private String A830TipArtDsc ;
   private String A13213DisNormID ;
   private String A13216DisNormDsc ;
   private String A13214DisNormSt ;
   private String A13215DisNormNC ;
   private String A14278HreNormId ;
   private String A14279HreNormDsc ;
   private String A14280HreNormSt ;
   private String A14281HreNormNc ;
   private String A13376DisTraID ;
   private String A13375DisTraDsc ;
   private String A14282HreTraID ;
   private String A14283HreTraDsc ;
   private java.util.Date AV45Hredti ;
   private java.util.Date AV46Hredtf ;
   private java.util.Date A9809HreFecAcb ;
   private java.util.Date A13764HreDiaHora ;
   private java.util.Date A4574RecFecPes ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date A4867RecFecMod ;
   private java.util.Date A4584HreFecPes ;
   private java.util.Date A4960HreFecAlt ;
   private java.util.Date A4962HreFecMod ;
   private java.util.Date A10104HreDtf ;
   private java.util.Date A10103HreDti ;
   private java.util.Date A4577RecPesFec ;
   private java.util.Date A4583HrePesFec ;
   private java.util.Date A4579LanyFec ;
   private java.util.Date A4581HreLanyFec ;
   private java.util.Date AV60Fechacierre ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A4527HreFecGen ;
   private java.util.Date A4528HreFecCli ;
   private java.util.Date A4529HreFecTin ;
   private java.util.Date A4530HreFecFpr ;
   private java.util.Date A3804RecFecMov ;
   private java.util.Date A13938RecLoteFch ;
   private java.util.Date A4568HreFecMov ;
   private java.util.Date A12453HreFecAct ;
   private java.util.Date A13942HreLoteFch ;
   private java.util.Date A13939LanyLoteFc ;
   private java.util.Date A13940HreLanyLtF ;
   private boolean n6039RecAcab ;
   private boolean n4260RecTotMts ;
   private boolean n9812RecHdrLts ;
   private boolean n9764RecLtsSR ;
   private boolean n9811RecAbs2 ;
   private boolean n9998RecAnc ;
   private boolean n9997Recgrm ;
   private boolean n9996RecObsq ;
   private boolean n11507RecAva ;
   private boolean n12128RecAs ;
   private boolean n12129RecAi ;
   private boolean n217BarTipArt ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n2452BarCal ;
   private boolean returnInSub ;
   private boolean n4516HreDisCli ;
   private boolean n4517HreBarSer ;
   private boolean n4518HreBarDsc ;
   private boolean n4519HreTipArt ;
   private boolean n4520HreTipArtD ;
   private boolean n4521HreColNom ;
   private boolean n4522HreColNum ;
   private boolean n4523HreColNomC ;
   private boolean n4524HreColNumC ;
   private boolean n4525HreTipCol ;
   private boolean n4526HreTipColN ;
   private boolean n4527HreFecGen ;
   private boolean n4528HreFecCli ;
   private boolean n4529HreFecTin ;
   private boolean n4530HreFecFpr ;
   private boolean n4532HreBarKgm ;
   private boolean n4533HreBarMtr ;
   private boolean n4534HreBarPie ;
   private boolean n4531HreBarMat ;
   private boolean n4535HrePartCod ;
   private boolean n4536HreBarNMtr ;
   private boolean n4537HreBarNMez ;
   private boolean n4538HreNumTen ;
   private boolean n4539HreIntCod ;
   private boolean n4540HreIntDsc ;
   private boolean n4541HreNumTon ;
   private boolean n4496HreMaqHdr ;
   private boolean n4542HreTotKgm ;
   private boolean n4543HreTotMtr ;
   private boolean n4544HreTotPie ;
   private boolean n9805HreLtsSR ;
   private boolean n9806HreLtsRs ;
   private boolean n9807HreAcaQm ;
   private boolean n9808HreRacab ;
   private boolean n9809HreFecAcb ;
   private boolean n9810HreAbs ;
   private boolean n10099HreLtsRc ;
   private boolean n10100HreHdrLts ;
   private boolean n10101HreFabs ;
   private boolean n11318HreDispCli ;
   private boolean n12264HreNInter ;
   private boolean n12535HreCencId ;
   private boolean n12536HreCenDsc ;
   private boolean n13450HreComp1 ;
   private boolean n13451HreComp2 ;
   private boolean n4258RecMaqFas ;
   private boolean n4268RecOrdLin ;
   private boolean n4654RecNroPar ;
   private boolean n4866RecFecAlt ;
   private boolean n4867RecFecMod ;
   private boolean n4868RecUsrMod ;
   private boolean n4261RecTotPrd ;
   private boolean n4546HreMaqCod ;
   private boolean n4547HreVolPrd ;
   private boolean n4548HreFacAbs ;
   private boolean n4549HreULinPro ;
   private boolean n4584HreFecPes ;
   private boolean n4585HreMaqPes ;
   private boolean n4863HreUsrCod ;
   private boolean n4963HreFasCod ;
   private boolean n4964HreOrdLin ;
   private boolean n4965HreNroPar ;
   private boolean n4960HreFecAlt ;
   private boolean n4962HreFecMod ;
   private boolean n4961HreUsrMod ;
   private boolean n4968HreTotKgs ;
   private boolean n4969HreTotMts ;
   private boolean n4970HreTotPrd ;
   private boolean n7814HReMaqNh ;
   private boolean n7815HReMaqVX ;
   private boolean n7816HReMaqBL ;
   private boolean n7817HReMaqFlow ;
   private boolean n7818HReMaqRPM ;
   private boolean n7819HReMaqMol ;
   private boolean n7820HReMaqTor ;
   private boolean n7821HReMaqCla ;
   private boolean n7822HReMaqTej ;
   private boolean n7823HReMaqDel ;
   private boolean n7824HReMaqPML ;
   private boolean n9780HreLtsSb ;
   private boolean n9781HreLtsRm ;
   private boolean n9803HreAcaQ ;
   private boolean n9804HreAcab ;
   private boolean n1094HreNPrg ;
   private boolean n697HreLotF ;
   private boolean n10102HreNumInt ;
   private boolean n10104HreDtf ;
   private boolean n10103HreDti ;
   private boolean n10381HreAnc ;
   private boolean n10382HreGrm ;
   private boolean n10383HreVel ;
   private boolean n10384HreObs ;
   private boolean n11508HreAva ;
   private boolean n8602HreCosAA ;
   private boolean n8603HrecosAd ;
   private boolean n8604HreCosAnc ;
   private boolean n8605HreCosCol ;
   private boolean n8606HreCosPA ;
   private boolean n8607HreCosPD ;
   private boolean n12126HreAs ;
   private boolean n12127HreAi ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean n719PrdNum ;
   private boolean n4558HrePrdNum ;
   private boolean n4559HrePrdDsc ;
   private boolean n4560HrePrdUMe ;
   private boolean n4561HrePrdUDs ;
   private boolean n4562HreFacCon ;
   private boolean n4563HrePrdCant ;
   private boolean n4564HreCanFin ;
   private boolean n4565HreCanAny ;
   private boolean n4566HreForNro ;
   private boolean n4567HrePrdTnq ;
   private boolean n4568HreFecMov ;
   private boolean n4569HreAnyTie ;
   private boolean n4570HreUltAny ;
   private boolean n4571HrePorAny ;
   private boolean n4572HreCanEns ;
   private boolean n4573HreRecMar ;
   private boolean n4582HreLinUsr ;
   private boolean n4583HrePesFec ;
   private boolean n4967HrePrePrd ;
   private boolean n5726HreLote ;
   private boolean n9827HreFacCon1 ;
   private boolean n11707HreProv ;
   private boolean n12453HreFecAct ;
   private boolean n12642HrePrdDc2 ;
   private boolean n12718HreFabId ;
   private boolean n1378PrdCFin ;
   private boolean n3380LanyPrd ;
   private boolean n3381LanyCan ;
   private boolean n3382LanyNro ;
   private boolean n3383LanyTnq ;
   private boolean n4578LanyUsr ;
   private boolean n4579LanyFec ;
   private boolean n5807LanyLote ;
   private boolean n4510HrdPrdDsc ;
   private boolean n4511HrePrdCFin ;
   private boolean n4512HreLanyPrd ;
   private boolean n4513HreLanyCan ;
   private boolean n4514HreLanyNro ;
   private boolean n4515HreLanyTnq ;
   private boolean n4580HreLanyUsr ;
   private boolean n4581HreLanyFec ;
   private boolean n5808HreLanyLot ;
   private boolean n6035Ac_Kilos ;
   private boolean n6034Ac_Metros ;
   private boolean n6036Ac_Pzs ;
   private boolean n9988HreAcKgm ;
   private boolean n9989HreAcMtr ;
   private boolean n9990HreAcPie ;
   private boolean n9991HreAcCli ;
   private boolean n9992HreAcSer ;
   private boolean n9993HreAcDsc ;
   private boolean n9994HreAcCol ;
   private boolean n9995HreAcNumC ;
   private boolean n832TipColDsc ;
   private boolean n830TipArtDsc ;
   private boolean n13216DisNormDsc ;
   private boolean n13375DisTraDsc ;
   private String A9996RecObsq ;
   private String AV50Hreobs ;
   private String A10384HreObs ;
   private java.util.Date[] aP14 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private int[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P03U32_A396EmprCod ;
   private int[] P03U32_A129BarCod ;
   private byte[] P03U32_A132BarCodReo ;
   private String[] P03U32_A130BarCodPar ;
   private short[] P03U32_A2804RecLinMaq ;
   private String[] P03U32_A602MaqCod ;
   private String[] P03U32_A6039RecAcab ;
   private boolean[] P03U32_n6039RecAcab ;
   private java.math.BigDecimal[] P03U32_A4259RecTotKgs ;
   private java.math.BigDecimal[] P03U32_A4260RecTotMts ;
   private boolean[] P03U32_n4260RecTotMts ;
   private java.math.BigDecimal[] P03U32_A2806RecFA ;
   private String[] P03U32_A9812RecHdrLts ;
   private boolean[] P03U32_n9812RecHdrLts ;
   private int[] P03U32_A9764RecLtsSR ;
   private boolean[] P03U32_n9764RecLtsSR ;
   private java.math.BigDecimal[] P03U32_A9811RecAbs2 ;
   private boolean[] P03U32_n9811RecAbs2 ;
   private int[] P03U32_A5109RecNumInt ;
   private short[] P03U32_A9998RecAnc ;
   private boolean[] P03U32_n9998RecAnc ;
   private short[] P03U32_A9997Recgrm ;
   private boolean[] P03U32_n9997Recgrm ;
   private java.math.BigDecimal[] P03U32_A5115RecAbsFac ;
   private String[] P03U32_A9996RecObsq ;
   private boolean[] P03U32_n9996RecObsq ;
   private String[] P03U32_A11507RecAva ;
   private boolean[] P03U32_n11507RecAva ;
   private String[] P03U32_A12128RecAs ;
   private boolean[] P03U32_n12128RecAs ;
   private String[] P03U32_A12129RecAi ;
   private boolean[] P03U32_n12129RecAi ;
   private String[] P03U35_A396EmprCod ;
   private int[] P03U35_A129BarCod ;
   private byte[] P03U35_A132BarCodReo ;
   private String[] P03U35_A130BarCodPar ;
   private String[] P03U35_A143BarDisNum ;
   private String[] P03U35_A212BarSer ;
   private String[] P03U35_A1652BarSerDsc ;
   private short[] P03U35_A217BarTipArt ;
   private boolean[] P03U35_n217BarTipArt ;
   private String[] P03U35_A135BarColNom ;
   private int[] P03U35_A136BarColNum ;
   private String[] P03U35_A1234BarNomCli ;
   private int[] P03U35_A1235BarNumCli ;
   private byte[] P03U35_A218BarTipCol ;
   private java.util.Date[] P03U35_A159BarFecGen ;
   private java.util.Date[] P03U35_A155BarFecCli ;
   private java.util.Date[] P03U35_A158BarFecFpr ;
   private String[] P03U35_A182BarMat ;
   private String[] P03U35_A966PartCod ;
   private boolean[] P03U35_n966PartCod ;
   private String[] P03U35_A1500BarNMtr ;
   private String[] P03U35_A1499BarNMez ;
   private String[] P03U35_A1878BarNumTen ;
   private String[] P03U35_A3313BarNumTon ;
   private String[] P03U35_A4812BarEncCli ;
   private String[] P03U35_A221BarTra1 ;
   private short[] P03U35_A224BarTraP1 ;
   private String[] P03U35_A222BarTra2 ;
   private short[] P03U35_A225BarTraP2 ;
   private String[] P03U35_A223BarTra3 ;
   private short[] P03U35_A226BarTraP3 ;
   private String[] P03U35_A229BarUrd1 ;
   private short[] P03U35_A232BarUrdP1 ;
   private String[] P03U35_A230BarUrd2 ;
   private short[] P03U35_A233BarUrdP2 ;
   private String[] P03U35_A231BarUrd3 ;
   private short[] P03U35_A234BarUrdP3 ;
   private int[] P03U35_A252CliCod ;
   private boolean[] P03U35_n252CliCod ;
   private String[] P03U35_A2452BarCal ;
   private boolean[] P03U35_n2452BarCal ;
   private int[] P03U35_A361DisCod ;
   private short[] P03U35_A4466BarAcaAnh ;
   private String[] P03U35_A2829BarProPer ;
   private int[] P03U35_A220BarTotPie ;
   private java.math.BigDecimal[] P03U35_A184BarMtr ;
   private java.math.BigDecimal[] P03U35_A870BarTotMtr ;
   private java.math.BigDecimal[] P03U35_A166BarKgm ;
   private java.math.BigDecimal[] P03U35_A219BarTotAgr ;
   private short[] P03U35_A199BarPie1 ;
   private String[] P03U35_A365DisDes ;
   private int[] P03U35_A898BarPieNDes ;
   private String[] P03U39_A396EmprCod ;
   private int[] P03U39_A129BarCod ;
   private byte[] P03U39_A132BarCodReo ;
   private String[] P03U39_A130BarCodPar ;
   private short[] P03U39_A2804RecLinMaq ;
   private String[] P03U39_A602MaqCod ;
   private int[] P03U39_A2805RecVolPrd ;
   private java.math.BigDecimal[] P03U39_A2806RecFA ;
   private byte[] P03U39_A1272UltLinPro ;
   private java.util.Date[] P03U39_A4574RecFecPes ;
   private byte[] P03U39_A4575RecMaqPes ;
   private String[] P03U39_A4402RecUsrCod ;
   private String[] P03U39_A4258RecMaqFas ;
   private boolean[] P03U39_n4258RecMaqFas ;
   private short[] P03U39_A4268RecOrdLin ;
   private boolean[] P03U39_n4268RecOrdLin ;
   private int[] P03U39_A4654RecNroPar ;
   private boolean[] P03U39_n4654RecNroPar ;
   private java.util.Date[] P03U39_A4866RecFecAlt ;
   private boolean[] P03U39_n4866RecFecAlt ;
   private java.util.Date[] P03U39_A4867RecFecMod ;
   private boolean[] P03U39_n4867RecFecMod ;
   private String[] P03U39_A4868RecUsrMod ;
   private boolean[] P03U39_n4868RecUsrMod ;
   private int[] P03U39_A4261RecTotPrd ;
   private boolean[] P03U39_n4261RecTotPrd ;
   private short[] P03U39_A7764RecMaqNh ;
   private byte[] P03U39_A7765RecMaqVX ;
   private byte[] P03U39_A7766RecMaqBL ;
   private byte[] P03U39_A7767RecMaqFlow ;
   private short[] P03U39_A7768RecMaqRPM ;
   private short[] P03U39_A7769RecMaqMol ;
   private short[] P03U39_A7770RecMaqTor ;
   private String[] P03U39_A7771RecMaqCla ;
   private byte[] P03U39_A7772RecMaqTej ;
   private byte[] P03U39_A7773RecMaqDel ;
   private short[] P03U39_A7774RecMaqPML ;
   private String[] P03U39_A6039RecAcab ;
   private boolean[] P03U39_n6039RecAcab ;
   private String[] P03U39_A5110RecNumPrg ;
   private java.math.BigDecimal[] P03U39_A219BarTotAgr ;
   private java.math.BigDecimal[] P03U39_A166BarKgm ;
   private java.math.BigDecimal[] P03U39_A870BarTotMtr ;
   private java.math.BigDecimal[] P03U39_A184BarMtr ;
   private String[] P03U311_A396EmprCod ;
   private int[] P03U311_A129BarCod ;
   private byte[] P03U311_A132BarCodReo ;
   private String[] P03U311_A130BarCodPar ;
   private short[] P03U311_A2804RecLinMaq ;
   private byte[] P03U311_A1273RecLinPro ;
   private String[] P03U311_A764ProForCod ;
   private String[] P03U311_A766ProForDsc ;
   private short[] P03U311_A771ProForTie ;
   private short[] P03U311_A772ProForTmx ;
   private int[] P03U311_A4697RecNroPrg ;
   private int[] P03U311_A1251RecNumRec ;
   private int[] P03U311_A4695RecVolPrf ;
   private short[] P03U311_A10544RecNH2O ;
   private String[] P03U313_A396EmprCod ;
   private int[] P03U313_A129BarCod ;
   private byte[] P03U313_A132BarCodReo ;
   private String[] P03U313_A130BarCodPar ;
   private short[] P03U313_A2804RecLinMaq ;
   private byte[] P03U313_A1273RecLinPro ;
   private short[] P03U313_A811RecLin ;
   private String[] P03U313_A872RecPrdNum ;
   private String[] P03U313_A875RecPrdDsc ;
   private byte[] P03U313_A490ForPrdUMe ;
   private boolean[] P03U313_n490ForPrdUMe ;
   private String[] P03U313_A488ForPrdDsc ;
   private boolean[] P03U313_n488ForPrdDsc ;
   private java.math.BigDecimal[] P03U313_A431FacCon ;
   private java.math.BigDecimal[] P03U313_A686PrdCant ;
   private java.math.BigDecimal[] P03U313_A683PrdCanFin ;
   private java.math.BigDecimal[] P03U313_A1797PrdCanAny ;
   private byte[] P03U313_A2394RecForNro ;
   private byte[] P03U313_A3274RecPrdTnq ;
   private java.util.Date[] P03U313_A3804RecFecMov ;
   private short[] P03U313_A3805RecAnyTie ;
   private java.math.BigDecimal[] P03U313_A3806RecUltAny ;
   private java.math.BigDecimal[] P03U313_A3807RecPorAny ;
   private java.math.BigDecimal[] P03U313_A3938RecCanEns ;
   private byte[] P03U313_A4024RecMar ;
   private String[] P03U313_A4576RecLinUsr ;
   private java.util.Date[] P03U313_A4577RecPesFec ;
   private java.math.BigDecimal[] P03U313_A724PrdPreAct ;
   private String[] P03U313_A5725RecLote ;
   private java.math.BigDecimal[] P03U313_A9813FacCon1 ;
   private int[] P03U313_A11708RecProv ;
   private String[] P03U313_A12641RecPrdDc2 ;
   private int[] P03U313_A12717RecFabId ;
   private java.util.Date[] P03U313_A13938RecLoteFch ;
   private short[] P03U313_A13937RecLotAlm ;
   private String[] P03U313_A719PrdNum ;
   private boolean[] P03U313_n719PrdNum ;
   private String[] P03U315_A396EmprCod ;
   private int[] P03U315_A129BarCod ;
   private byte[] P03U315_A132BarCodReo ;
   private String[] P03U315_A130BarCodPar ;
   private short[] P03U315_A2808RecLinMAL ;
   private byte[] P03U315_A1377RecNumAny ;
   private String[] P03U315_A718PrdNom ;
   private java.math.BigDecimal[] P03U315_A1378PrdCFin ;
   private boolean[] P03U315_n1378PrdCFin ;
   private String[] P03U315_A3380LanyPrd ;
   private boolean[] P03U315_n3380LanyPrd ;
   private java.math.BigDecimal[] P03U315_A3381LanyCan ;
   private boolean[] P03U315_n3381LanyCan ;
   private byte[] P03U315_A3382LanyNro ;
   private boolean[] P03U315_n3382LanyNro ;
   private byte[] P03U315_A3383LanyTnq ;
   private boolean[] P03U315_n3383LanyTnq ;
   private String[] P03U315_A4578LanyUsr ;
   private boolean[] P03U315_n4578LanyUsr ;
   private java.util.Date[] P03U315_A4579LanyFec ;
   private boolean[] P03U315_n4579LanyFec ;
   private String[] P03U315_A5807LanyLote ;
   private boolean[] P03U315_n5807LanyLote ;
   private java.util.Date[] P03U315_A13939LanyLoteFc ;
   private String[] P03U315_A719PrdNum ;
   private boolean[] P03U315_n719PrdNum ;
   private String[] P03U317_A396EmprCod ;
   private int[] P03U317_A129BarCod ;
   private byte[] P03U317_A132BarCodReo ;
   private String[] P03U317_A130BarCodPar ;
   private int[] P03U317_A6031Ac_Barcod ;
   private byte[] P03U317_A6032Ac_BarReo ;
   private String[] P03U317_A6033Ac_BarPar ;
   private java.math.BigDecimal[] P03U317_A6035Ac_Kilos ;
   private boolean[] P03U317_n6035Ac_Kilos ;
   private java.math.BigDecimal[] P03U317_A6034Ac_Metros ;
   private boolean[] P03U317_n6034Ac_Metros ;
   private short[] P03U317_A6036Ac_Pzs ;
   private boolean[] P03U317_n6036Ac_Pzs ;
   private String[] P03U319_A396EmprCod ;
   private String[] P03U319_A4494HreBarPar ;
   private byte[] P03U319_A4493HreBarReo ;
   private int[] P03U319_A4492HreBarCod ;
   private byte[] P03U319_A4495HreNumCie ;
   private String[] P03U320_A396EmprCod ;
   private byte[] P03U320_A831TipColCod ;
   private String[] P03U320_A832TipColDsc ;
   private boolean[] P03U320_n832TipColDsc ;
   private String[] P03U321_A396EmprCod ;
   private short[] P03U321_A829TipArtCod ;
   private String[] P03U321_A830TipArtDsc ;
   private boolean[] P03U321_n830TipArtDsc ;
   private String[] P03U322_A396EmprCod ;
   private String[] P03U322_A13213DisNormID ;
   private String[] P03U322_A13216DisNormDsc ;
   private boolean[] P03U322_n13216DisNormDsc ;
   private String[] P03U322_A13214DisNormSt ;
   private String[] P03U322_A13215DisNormNC ;
   private int[] P03U322_A361DisCod ;
   private String[] P03U324_A396EmprCod ;
   private String[] P03U324_A13376DisTraID ;
   private String[] P03U324_A13375DisTraDsc ;
   private boolean[] P03U324_n13375DisTraDsc ;
   private int[] P03U324_A361DisCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class phisreca__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class phisreca__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class phisreca__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class phisreca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03U32", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, MaqCod, RecAcab, RecTotKgs, RecTotMts, RecFA, RecHdrLts, RecLtsSR, RecAbs2, RecNumInt, RecAnc, Recgrm, RecAbsFac, RecObsq, RecAva, RecAs, RecAi FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03U35", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarDisNum, T1.BarSer, T1.BarSerDsc, T1.BarTipArt, T1.BarColNom, T1.BarColNum, T1.BarNomCli, T1.BarNumCli, T1.BarTipCol, T1.BarFecGen, T1.BarFecCli, T1.BarFecFpr, T1.BarMat, T2.PartCod, T1.BarNMtr, T1.BarNMez, T1.BarNumTen, T1.BarNumTon, T1.BarEncCli, T1.BarTra1, T1.BarTraP1, T1.BarTra2, T1.BarTraP2, T1.BarTra3, T1.BarTraP3, T1.BarUrd1, T1.BarUrdP1, T1.BarUrd2, T1.BarUrdP2, T1.BarUrd3, T1.BarUrdP3, T1.CliCod, T1.BarCal, T1.DisCod, T1.BarAcaAnh, T1.BarProPer, COALESCE( T4.BarTotPie, 0) AS BarTotPie, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T4.BarTotMtr, 0) AS BarTotMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T4.BarTotAgr, 0) AS BarTotAgr, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM (((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(MtrAgr) AS BarTotMtr, SUM(PieAgr) AS BarTotPie FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03U36", "INSERT INTO TXPHISREH(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreMaqHdr, HreDisCli, CliCod, HreBarSer, HreBarDsc, HreTipArt, HreTipArtD, HreColNom, HreColNum, HreColNomC, HreColNumC, HreTipCol, HreTipColN, HreFecGen, HreFecCli, HreFecTin, HreFecFpr, HreBarMat, HreBarKgm, HreBarMtr, HreBarPie, HrePartCod, HreBarNMtr, HreBarNMez, HreNumTen, HreIntCod, HreIntDsc, HreNumTon, HreTotKgm, HreTotMtr, HreTotPie, HreLtsSR, HreLtsRs, HreAcaQm, HreRacab, HreFecAcb, HreAbs, HreLtsRc, HreHdrLts, HreFabs, HreDispCli, HreNInter, HreCencId, HreCenDsc, HreComp1, HreComp2, HreUser, HreDiaHora, HreCdn2, HreCtw, HreNumColF, HreFamCodT, HreHilasa, HreEnsayo, HreOpa, HreOpn, HreMacCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0, ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREH")
         ,new ForEachCursor("P03U39", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.MaqCod, T1.RecVolPrd, T1.RecFA, T1.UltLinPro, T1.RecFecPes, T1.RecMaqPes, T1.RecUsrCod, T1.RecMaqFas, T1.RecOrdLin, T1.RecNroPar, T1.RecFecAlt, T1.RecFecMod, T1.RecUsrMod, T1.RecTotPrd, T1.RecMaqNh, T1.RecMaqVX, T1.RecMaqBL, T1.RecMaqFlow, T1.RecMaqRPM, T1.RecMaqMol, T1.RecMaqTor, T1.RecMaqCla, T1.RecMaqTej, T1.RecMaqDel, T1.RecMaqPML, T1.RecAcab, T1.RecNumPrg, COALESCE( T2.BarTotAgr, 0) AS BarTotAgr, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T2.BarTotMtr, 0) AS BarTotMtr, COALESCE( T3.BarMtr, 0) AS BarMtr FROM ((TXPRECMAQ T1 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(MtrAgr) AS BarTotMtr FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03U310", "INSERT INTO TXPHISREM(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreMaqCod, HreVolPrd, HreFacAbs, HreULinPro, HreFecPes, HreMaqPes, HreUsrCod, HreFecAlt, HreUsrMod, HreFecMod, HreFasCod, HreOrdLin, HreNroPar, HreTotKgs, HreTotMts, HreTotPrd, HReMaqNh, HReMaqVX, HReMaqBL, HReMaqFlow, HReMaqRPM, HReMaqMol, HReMaqTor, HReMaqCla, HReMaqTej, HReMaqDel, HReMaqPML, HreCosAA, HrecosAd, HreCosAnc, HreCosCol, HreCosPA, HreCosPD, HreLtsSb, HreLtsRm, HreAcaQ, HreAcab, HreNPrg, HreLotF, HreNumInt, HreDti, HreDtf, HreAnc, HreGrm, HreVel, HreObs, HreAva, HreAs, HreAi, HreProPrd, HreNumRmt, HreNumReo, HreUltObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREM")
         ,new ForEachCursor("P03U311", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.ProForCod, T2.ProForDsc, T2.ProForTie, T2.ProForTmx, T1.RecNroPrg, T1.RecNumRec, T1.RecVolPrf, T1.RecNH2O FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03U312", "INSERT INTO TXPHISREC(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreNH2O, HreProCod, HreProDsc, HreProTie, HreProTmx, HreNumPro, HreNumRec, HreVolPro, HreTieprg, HreNroPrg) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREC")
         ,new ForEachCursor("P03U313", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin, T1.RecPrdNum, T1.RecPrdDsc, T1.ForPrdUMe, T3.ForPrdDsc, T1.FacCon, T1.PrdCant, T1.PrdCanFin, T1.PrdCanAny, T1.RecForNro, T1.RecPrdTnq, T1.RecFecMov, T1.RecAnyTie, T1.RecUltAny, T1.RecPorAny, T1.RecCanEns, T1.RecMar, T1.RecLinUsr, T1.RecPesFec, T2.PrdPreAct, T1.RecLote, T1.FacCon1, T1.RecProv, T1.RecPrdDc2, T1.RecFabId, T1.RecLoteFch, T1.RecLotAlm, T1.PrdNum FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03U314", "INSERT INTO TXPHISLRE(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin, PrdNum, HrePrdNum, HrePrdDsc, HrePrdUMe, HrePrdUDs, HreFacCon, HrePrdCant, HreCanFin, HreCanAny, HreForNro, HrePrdTnq, HreFecMov, HreAnyTie, HreUltAny, HrePorAny, HreCanEns, HreRecMar, HreLinUsr, HrePesFec, HrePrePrd, HreLote, HreFacCon1, HreProv, HreFecAct, HrePrdDc2, HreFabId, HreLoteFch, HreLotAlm, HreSalMP, HreSalVol) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISLRE")
         ,new ForEachCursor("P03U315", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.RecNumAny, T2.PrdNom, T1.PrdCFin, T1.LanyPrd, T1.LanyCan, T1.LanyNro, T1.LanyTnq, T1.LanyUsr, T1.LanyFec, T1.LanyLote, T1.LanyLoteFc, T1.PrdNum FROM (TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.RecNumAny, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03U316", "INSERT INTO TXPHISREA(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum, HrdPrdDsc, HrePrdCFin, HreLanyPrd, HreLanyCan, HreLanyNro, HreLanyTnq, HreLanyUsr, HreLanyFec, HreLanyLot, HreLanyLtF, HreLanyCtd, HreLanyUnd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREA")
         ,new ForEachCursor("P03U317", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar, Ac_Kilos, Ac_Metros, Ac_Pzs FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03U318", "INSERT INTO TXPHISHRA(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar, HreAcKgm, HreAcMtr, HreAcPie, HreAcCli, HreAcSer, HreAcDsc, HreAcCol, HreAcNumC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISHRA")
         ,new ForEachCursor("P03U319", "SELECT EmprCod, HreBarPar, HreBarReo, HreBarCod, HreNumCie FROM TXPHISREH WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03U320", "SELECT EmprCod, TipColCod, TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03U321", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03U322", "SELECT T1.EmprCod, T1.DisNormID AS DisNormID, T2.NormaDsc AS DisNormDsc, T1.DisNormSt, T1.DisNormNC, T1.DisCod FROM (TXPDISNOR T1 INNER JOIN TXPNORMAS T2 ON T2.EmprCod = T1.EmprCod AND T2.NormaID = T1.DisNormID) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03U323", "INSERT INTO TXPHISRE2(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreNormId, HreNormDsc, HreNormSt, HreNormNc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISRE2")
         ,new ForEachCursor("P03U324", "SELECT T1.EmprCod, T1.DisTraID AS DisTraID, T2.TRADsc AS DisTraDsc, T1.DisCod FROM (TXPDISATI T1 INNER JOIN TXPTRATIN T2 ON T2.EmprCod = T1.EmprCod AND T2.TRAID = T1.DisTraID) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisTraID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03U325", "INSERT INTO TXPHISRE3(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreTraID, HreTraDsc) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISRE3")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[12])[0] = rslt.getString(11, 12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((short[]) buf[19])[0] = rslt.getShort(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[24])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 4);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(20, 3);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(21, 3);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 16);
               ((String[]) buf[18])[0] = rslt.getString(18, 16);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 10);
               ((String[]) buf[21])[0] = rslt.getString(20, 10);
               ((String[]) buf[22])[0] = rslt.getString(21, 10);
               ((String[]) buf[23])[0] = rslt.getString(22, 10);
               ((String[]) buf[24])[0] = rslt.getString(23, 20);
               ((String[]) buf[25])[0] = rslt.getString(24, 4);
               ((short[]) buf[26])[0] = rslt.getShort(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 4);
               ((short[]) buf[28])[0] = rslt.getShort(27);
               ((String[]) buf[29])[0] = rslt.getString(28, 4);
               ((short[]) buf[30])[0] = rslt.getShort(29);
               ((String[]) buf[31])[0] = rslt.getString(30, 4);
               ((short[]) buf[32])[0] = rslt.getShort(31);
               ((String[]) buf[33])[0] = rslt.getString(32, 4);
               ((short[]) buf[34])[0] = rslt.getShort(33);
               ((String[]) buf[35])[0] = rslt.getString(34, 4);
               ((short[]) buf[36])[0] = rslt.getShort(35);
               ((int[]) buf[37])[0] = rslt.getInt(36);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(37, 20);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(38);
               ((short[]) buf[42])[0] = rslt.getShort(39);
               ((String[]) buf[43])[0] = rslt.getString(40, 8);
               ((int[]) buf[44])[0] = rslt.getInt(41);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(42,2);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(44,2);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(45,2);
               ((short[]) buf[49])[0] = rslt.getShort(46);
               ((String[]) buf[50])[0] = rslt.getString(47, 1);
               ((int[]) buf[51])[0] = rslt.getInt(48);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(16);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(17);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(19);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(20);
               ((byte[]) buf[27])[0] = rslt.getByte(21);
               ((byte[]) buf[28])[0] = rslt.getByte(22);
               ((byte[]) buf[29])[0] = rslt.getByte(23);
               ((short[]) buf[30])[0] = rslt.getShort(24);
               ((short[]) buf[31])[0] = rslt.getShort(25);
               ((short[]) buf[32])[0] = rslt.getShort(26);
               ((String[]) buf[33])[0] = rslt.getString(27, 10);
               ((byte[]) buf[34])[0] = rslt.getByte(28);
               ((byte[]) buf[35])[0] = rslt.getByte(29);
               ((short[]) buf[36])[0] = rslt.getShort(30);
               ((String[]) buf[37])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(32, 6);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(33,2);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(35,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(36,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,3);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,3);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,3);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(18);
               ((short[]) buf[20])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,5);
               ((byte[]) buf[24])[0] = rslt.getByte(23);
               ((String[]) buf[25])[0] = rslt.getString(24, 8);
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(25);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(26,5);
               ((String[]) buf[28])[0] = rslt.getString(27, 26);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(28,5);
               ((int[]) buf[30])[0] = rslt.getInt(29);
               ((String[]) buf[31])[0] = rslt.getString(30, 40);
               ((int[]) buf[32])[0] = rslt.getInt(31);
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(32);
               ((short[]) buf[34])[0] = rslt.getShort(33);
               ((String[]) buf[35])[0] = rslt.getString(34, 6);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(16);
               ((String[]) buf[24])[0] = rslt.getString(17, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 8);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 16);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 26);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[18], 30);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[20], 13);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[22]).intValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[24], 13);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[28]).byteValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[30], 26);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DATE );
               }
               else
               {
                  stmt.setDate(19, (java.util.Date)parms[32]);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DATE );
               }
               else
               {
                  stmt.setDate(20, (java.util.Date)parms[34]);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DATE );
               }
               else
               {
                  stmt.setDate(21, (java.util.Date)parms[36]);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DATE );
               }
               else
               {
                  stmt.setDate(22, (java.util.Date)parms[38]);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[40], 16);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[46]).intValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[48], 16);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[50], 10);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[52], 10);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[54], 10);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(31, ((Number) parms[56]).byteValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[58], 30);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[60], 10);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(36, ((Number) parms[66]).intValue());
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(37, ((Number) parms[68]).intValue());
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(38, ((Number) parms[70]).intValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[72], 6);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[74], 1);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(41, (java.util.Date)parms[76], false);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(42, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(43, ((Number) parms[80]).intValue());
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[82], 12);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(45, (java.math.BigDecimal)parms[84], 2);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[86], 20);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(47, ((Number) parms[88]).intValue());
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(48, ((Number) parms[90]).shortValue());
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[92], 80);
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[94], 21);
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[96], 21);
               }
               stmt.setString(52, (String)parms[97], 10);
               stmt.setDateTime(53, (java.util.Date)parms[98], false);
               stmt.setString(54, (String)parms[99], 4);
               stmt.setString(55, (String)parms[100], 4);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[19], 8);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[21], false);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[23], 8);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(16, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[27], 8);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[31]).intValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[37]).intValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[41]).byteValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(25, ((Number) parms[43]).byteValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(26, ((Number) parms[45]).byteValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[47]).shortValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[49]).shortValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[53], 10);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(31, ((Number) parms[55]).byteValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(32, ((Number) parms[57]).byteValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[59]).shortValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(39, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(40, ((Number) parms[73]).intValue());
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(41, ((Number) parms[75]).intValue());
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[77], 6);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[79], 1);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[81], 6);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[83], 20);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(46, ((Number) parms[85]).intValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(47, (java.util.Date)parms[87], false);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(48, (java.util.Date)parms[89], false);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(49, ((Number) parms[91]).shortValue());
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(50, ((Number) parms[93]).shortValue());
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(51, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(52, (String)parms[97], 800);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[99], 4);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[101], 3);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[103], 3);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 6);
               stmt.setString(10, (String)parms[9], 30);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[11], 6);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[13], 26);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[17], 5);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[19], 5);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[21], 3);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[23], 3);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[25], 3);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[29]).byteValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DATE );
               }
               else
               {
                  stmt.setDate(20, (java.util.Date)parms[31]);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[35], 3);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[39], 5);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(25, ((Number) parms[41]).byteValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[43], 8);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(27, (java.util.Date)parms[45], false);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[49], 26);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[51], 5);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(31, ((Number) parms[53]).intValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DATE );
               }
               else
               {
                  stmt.setDate(32, (java.util.Date)parms[55]);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[57], 40);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(34, ((Number) parms[59]).intValue());
               }
               stmt.setDate(35, (java.util.Date)parms[60]);
               stmt.setShort(36, ((Number) parms[61]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[10], 26);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 3);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 6);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[16], 3);
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
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[20]).byteValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[22], 8);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(16, (java.util.Date)parms[24], false);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[26], 26);
               }
               stmt.setDate(18, (java.util.Date)parms[27]);
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
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[17], 16);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[19], 26);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[21], 13);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[23]).intValue());
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 4);
               stmt.setString(8, (String)parms[7], 30);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 4);
               stmt.setString(8, (String)parms[7], 30);
               return;
      }
   }

}

