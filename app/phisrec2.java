package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phisrec2 extends GXProcedure
{
   public phisrec2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phisrec2.class ), "" );
   }

   public phisrec2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           short[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           java.math.BigDecimal[] aP8 ,
                                           java.math.BigDecimal[] aP9 )
   {
      phisrec2.this.aP10 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 )
   {
      phisrec2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phisrec2.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      phisrec2.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      phisrec2.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      phisrec2.this.AV60RecLinMaq = aP4[0];
      this.aP4 = aP4;
      phisrec2.this.AV67Barcospd = aP5[0];
      this.aP5 = aP5;
      phisrec2.this.AV68Barcosad = aP6[0];
      this.aP6 = aP6;
      phisrec2.this.AV69Barcosaa = aP7[0];
      this.aP7 = aP7;
      phisrec2.this.AV70Barcospa = aP8[0];
      this.aP8 = aP8;
      phisrec2.this.AV71barcoscol = aP9[0];
      this.aP9 = aP9;
      phisrec2.this.AV72barcosanc = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV62NCLec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int2) ;
      phisrec2.this.GXt_int1 = GXv_int2[0] ;
      AV62NCLec = GXt_int1 ;
      AV65recTotKgs = DecimalUtil.doubleToDec(0) ;
      AV66RecTotMts = DecimalUtil.doubleToDec(0) ;
      AV81recnumint = 0 ;
      AV64recacab = "@" ;
      AV63MaqCod = httpContext.getMessage( "XXYYZZ", "") ;
      AV82Hredti = GXutil.resetTime( GXutil.nullDate() );
      AV83Hredtf = GXutil.resetTime( GXutil.nullDate() );
      /* Using cursor P03CC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV60RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P03CC2_A2804RecLinMaq[0] ;
         A602MaqCod = P03CC2_A602MaqCod[0] ;
         A6039RecAcab = P03CC2_A6039RecAcab[0] ;
         n6039RecAcab = P03CC2_n6039RecAcab[0] ;
         A4259RecTotKgs = P03CC2_A4259RecTotKgs[0] ;
         A4260RecTotMts = P03CC2_A4260RecTotMts[0] ;
         n4260RecTotMts = P03CC2_n4260RecTotMts[0] ;
         A5109RecNumInt = P03CC2_A5109RecNumInt[0] ;
         AV63MaqCod = A602MaqCod ;
         AV64recacab = A6039RecAcab ;
         AV65recTotKgs = A4259RecTotKgs ;
         AV66RecTotMts = A4260RecTotMts ;
         AV81recnumint = A5109RecNumInt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV64recacab, httpContext.getMessage( "N", "")) == 0 )
      {
         /* Using cursor P03CC3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A150BarFacTin = P03CC3_A150BarFacTin[0] ;
            A4442BarFasDTI = P03CC3_A4442BarFasDTI[0] ;
            n4442BarFasDTI = P03CC3_n4442BarFasDTI[0] ;
            A4443BarFasDTF = P03CC3_A4443BarFasDTF[0] ;
            n4443BarFasDTF = P03CC3_n4443BarFasDTF[0] ;
            A194BarOrdLin = P03CC3_A194BarOrdLin[0] ;
            A758ProCod = P03CC3_A758ProCod[0] ;
            if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
            {
               AV82Hredti = A4442BarFasDTI ;
               AV83Hredtf = A4443BarFasDTF ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      /* Using cursor P03CC6 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P03CC6_A361DisCod[0] ;
         A143BarDisNum = P03CC6_A143BarDisNum[0] ;
         A212BarSer = P03CC6_A212BarSer[0] ;
         A1652BarSerDsc = P03CC6_A1652BarSerDsc[0] ;
         A217BarTipArt = P03CC6_A217BarTipArt[0] ;
         n217BarTipArt = P03CC6_n217BarTipArt[0] ;
         A135BarColNom = P03CC6_A135BarColNom[0] ;
         A136BarColNum = P03CC6_A136BarColNum[0] ;
         A1234BarNomCli = P03CC6_A1234BarNomCli[0] ;
         A1235BarNumCli = P03CC6_A1235BarNumCli[0] ;
         A218BarTipCol = P03CC6_A218BarTipCol[0] ;
         A159BarFecGen = P03CC6_A159BarFecGen[0] ;
         A155BarFecCli = P03CC6_A155BarFecCli[0] ;
         A158BarFecFpr = P03CC6_A158BarFecFpr[0] ;
         A182BarMat = P03CC6_A182BarMat[0] ;
         A966PartCod = P03CC6_A966PartCod[0] ;
         n966PartCod = P03CC6_n966PartCod[0] ;
         A1500BarNMtr = P03CC6_A1500BarNMtr[0] ;
         A1499BarNMez = P03CC6_A1499BarNMez[0] ;
         A1878BarNumTen = P03CC6_A1878BarNumTen[0] ;
         A3313BarNumTon = P03CC6_A3313BarNumTon[0] ;
         A252CliCod = P03CC6_A252CliCod[0] ;
         n252CliCod = P03CC6_n252CliCod[0] ;
         A2452BarCal = P03CC6_A2452BarCal[0] ;
         n2452BarCal = P03CC6_n2452BarCal[0] ;
         A220BarTotPie = P03CC6_A220BarTotPie[0] ;
         A184BarMtr = P03CC6_A184BarMtr[0] ;
         A870BarTotMtr = P03CC6_A870BarTotMtr[0] ;
         A166BarKgm = P03CC6_A166BarKgm[0] ;
         A219BarTotAgr = P03CC6_A219BarTotAgr[0] ;
         A199BarPie1 = P03CC6_A199BarPie1[0] ;
         A365DisDes = P03CC6_A365DisDes[0] ;
         A898BarPieNDes = P03CC6_A898BarPieNDes[0] ;
         A966PartCod = P03CC6_A966PartCod[0] ;
         n966PartCod = P03CC6_n966PartCod[0] ;
         A184BarMtr = P03CC6_A184BarMtr[0] ;
         A166BarKgm = P03CC6_A166BarKgm[0] ;
         A199BarPie1 = P03CC6_A199BarPie1[0] ;
         A898BarPieNDes = P03CC6_A898BarPieNDes[0] ;
         A220BarTotPie = P03CC6_A220BarTotPie[0] ;
         A870BarTotMtr = P03CC6_A870BarTotMtr[0] ;
         A219BarTotAgr = P03CC6_A219BarTotAgr[0] ;
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
         AV55CliCod = A252CliCod ;
         AV56BarSer = A212BarSer ;
         AV57BarColNom = A135BarColNom ;
         AV58BarColNum = A136BarColNum ;
         AV49BarTipCol = A218BarTipCol ;
         AV52BarTipArt = A217BarTipArt ;
         AV45BarCod = A129BarCod ;
         AV46BarCodReo = A132BarCodReo ;
         AV47BarCodPar = A130BarCodPar ;
         AV80BarGirar = A2452BarCal ;
         /* Execute user subroutine: 'NUMCIE' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'TIPCOL' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'TIPART' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = AV55CliCod ;
         GXv_char5[0] = AV56BarSer ;
         GXv_char6[0] = AV57BarColNom ;
         GXv_int7[0] = AV58BarColNum ;
         GXv_int2[0] = AV49BarTipCol ;
         GXv_int8[0] = AV53IntCod ;
         GXv_char9[0] = AV54IntDsc ;
         GXv_char10[0] = " " ;
         GXv_int11[0] = 0 ;
         new app.pbusint(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_char6, GXv_int7, GXv_int2, GXv_int8, GXv_char9, GXv_char10, GXv_int11) ;
         phisrec2.this.A396EmprCod = GXv_char3[0] ;
         phisrec2.this.AV55CliCod = GXv_int4[0] ;
         phisrec2.this.AV56BarSer = GXv_char5[0] ;
         phisrec2.this.AV57BarColNom = GXv_char6[0] ;
         phisrec2.this.AV58BarColNum = GXv_int7[0] ;
         phisrec2.this.AV49BarTipCol = GXv_int2[0] ;
         phisrec2.this.AV53IntCod = GXv_int8[0] ;
         phisrec2.this.AV54IntDsc = GXv_char9[0] ;
         GXv_char10[0] = A396EmprCod ;
         GXv_int11[0] = AV55CliCod ;
         GXv_char9[0] = AV56BarSer ;
         GXv_char6[0] = AV57BarColNom ;
         GXv_int7[0] = AV58BarColNum ;
         GXv_int8[0] = AV49BarTipCol ;
         GXv_int4[0] = AV73ForNumCol ;
         GXv_int12[0] = AV75HreFamCodt ;
         GXv_char5[0] = AV76Hilasa ;
         GXv_int13[0] = AV77NEnsayo ;
         GXv_char3[0] = AV78Lb_opcion ;
         GXv_int2[0] = AV79Lb_numop ;
         GXv_int14[0] = AV74Flag ;
         new app.pbufon2(remoteHandle, context).execute( GXv_char10, GXv_int11, GXv_char9, GXv_char6, GXv_int7, GXv_int8, GXv_int4, GXv_int12, GXv_char5, GXv_int13, GXv_char3, GXv_int2, GXv_int14) ;
         phisrec2.this.A396EmprCod = GXv_char10[0] ;
         phisrec2.this.AV55CliCod = GXv_int11[0] ;
         phisrec2.this.AV56BarSer = GXv_char9[0] ;
         phisrec2.this.AV57BarColNom = GXv_char6[0] ;
         phisrec2.this.AV58BarColNum = GXv_int7[0] ;
         phisrec2.this.AV49BarTipCol = GXv_int8[0] ;
         phisrec2.this.AV73ForNumCol = GXv_int4[0] ;
         phisrec2.this.AV75HreFamCodt = GXv_int12[0] ;
         phisrec2.this.AV76Hilasa = GXv_char5[0] ;
         phisrec2.this.AV77NEnsayo = GXv_int13[0] ;
         phisrec2.this.AV78Lb_opcion = GXv_char3[0] ;
         phisrec2.this.AV79Lb_numop = GXv_int2[0] ;
         phisrec2.this.AV74Flag = GXv_int14[0] ;
         System.out.println( httpContext.getMessage( "Hisreh", "") );
         /*
            INSERT RECORD ON TABLE TXPHISREH

         */
         A4492HreBarCod = AV45BarCod ;
         A4493HreBarReo = AV46BarCodReo ;
         A4494HreBarPar = AV47BarCodPar ;
         A4495HreNumCie = AV48NumCie ;
         A4516HreDisCli = A143BarDisNum ;
         n4516HreDisCli = false ;
         A4517HreBarSer = A212BarSer ;
         n4517HreBarSer = false ;
         A4518HreBarDsc = A1652BarSerDsc ;
         n4518HreBarDsc = false ;
         A4519HreTipArt = A217BarTipArt ;
         n4519HreTipArt = false ;
         A4520HreTipArtD = AV51TipArtDsc ;
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
         A4526HreTipColN = AV50TipColDsc ;
         n4526HreTipColN = false ;
         A4527HreFecGen = A159BarFecGen ;
         n4527HreFecGen = false ;
         A4528HreFecCli = A155BarFecCli ;
         n4528HreFecCli = false ;
         A4529HreFecTin = Gx_date ;
         n4529HreFecTin = false ;
         A4530HreFecFpr = A158BarFecFpr ;
         n4530HreFecFpr = false ;
         System.out.println( httpContext.getMessage( "1.Find to Error", "") );
         if ( A166BarKgm.doubleValue() == 0 )
         {
            A4532HreBarKgm = AV65recTotKgs ;
            n4532HreBarKgm = false ;
         }
         else
         {
            A4532HreBarKgm = A166BarKgm ;
            n4532HreBarKgm = false ;
         }
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
         A4539HreIntCod = AV53IntCod ;
         n4539HreIntCod = false ;
         A4540HreIntDsc = AV54IntDsc ;
         n4540HreIntDsc = false ;
         A4541HreNumTon = A3313BarNumTon ;
         n4541HreNumTon = false ;
         A4496HreMaqHdr = AV63MaqCod ;
         n4496HreMaqHdr = false ;
         System.out.println( httpContext.getMessage( "2.Find to Error", "") );
         if ( AV65recTotKgs.doubleValue() > 0 )
         {
            A4542HreTotKgm = AV65recTotKgs ;
            n4542HreTotKgm = false ;
         }
         else
         {
            A4542HreTotKgm = A812RecTotKgm ;
            n4542HreTotKgm = false ;
         }
         if ( AV66RecTotMts.doubleValue() > 0 )
         {
            A4543HreTotMtr = AV66RecTotMts ;
            n4543HreTotMtr = false ;
         }
         else
         {
            A4543HreTotMtr = A871RecTotMtr ;
            n4543HreTotMtr = false ;
         }
         if ( A813RecTotPie > 9999 )
         {
            A4544HreTotPie = 9999 ;
            n4544HreTotPie = false ;
         }
         else
         {
            A4544HreTotPie = A813RecTotPie ;
            n4544HreTotPie = false ;
         }
         A8608HreNumColF = AV73ForNumCol ;
         n8608HreNumColF = false ;
         A8610HreFamCodT = AV75HreFamCodt ;
         n8610HreFamCodT = false ;
         A8623HreHilasa = AV76Hilasa ;
         n8623HreHilasa = false ;
         A8624HreEnsayo = AV77NEnsayo ;
         n8624HreEnsayo = false ;
         A8625HreOpa = AV78Lb_opcion ;
         n8625HreOpa = false ;
         A8626HreOpn = AV79Lb_numop ;
         n8626HreOpn = false ;
         A12264HreNInter = AV81recnumint ;
         n12264HreNInter = false ;
         /* Using cursor P03CC7 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Boolean.valueOf(n4496HreMaqHdr), A4496HreMaqHdr, Boolean.valueOf(n4516HreDisCli), A4516HreDisCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n4517HreBarSer), A4517HreBarSer, Boolean.valueOf(n4518HreBarDsc), A4518HreBarDsc, Boolean.valueOf(n4519HreTipArt), Short.valueOf(A4519HreTipArt), Boolean.valueOf(n4520HreTipArtD), A4520HreTipArtD, Boolean.valueOf(n4521HreColNom), A4521HreColNom, Boolean.valueOf(n4522HreColNum), Integer.valueOf(A4522HreColNum), Boolean.valueOf(n4523HreColNomC), A4523HreColNomC, Boolean.valueOf(n4524HreColNumC), Integer.valueOf(A4524HreColNumC), Boolean.valueOf(n4525HreTipCol), Byte.valueOf(A4525HreTipCol), Boolean.valueOf(n4526HreTipColN), A4526HreTipColN, Boolean.valueOf(n4527HreFecGen), A4527HreFecGen, Boolean.valueOf(n4528HreFecCli), A4528HreFecCli, Boolean.valueOf(n4529HreFecTin), A4529HreFecTin, Boolean.valueOf(n4530HreFecFpr), A4530HreFecFpr, Boolean.valueOf(n4531HreBarMat), A4531HreBarMat, Boolean.valueOf(n4532HreBarKgm), A4532HreBarKgm, Boolean.valueOf(n4533HreBarMtr), A4533HreBarMtr, Boolean.valueOf(n4534HreBarPie), Integer.valueOf(A4534HreBarPie), Boolean.valueOf(n4535HrePartCod), A4535HrePartCod, Boolean.valueOf(n4536HreBarNMtr), A4536HreBarNMtr, Boolean.valueOf(n4537HreBarNMez), A4537HreBarNMez, Boolean.valueOf(n4538HreNumTen), A4538HreNumTen, Boolean.valueOf(n4539HreIntCod), Byte.valueOf(A4539HreIntCod), Boolean.valueOf(n4540HreIntDsc), A4540HreIntDsc, Boolean.valueOf(n4541HreNumTon), A4541HreNumTon, Boolean.valueOf(n4542HreTotKgm), A4542HreTotKgm, Boolean.valueOf(n4543HreTotMtr), A4543HreTotMtr, Boolean.valueOf(n4544HreTotPie), Integer.valueOf(A4544HreTotPie), Boolean.valueOf(n8608HreNumColF), Integer.valueOf(A8608HreNumColF), Boolean.valueOf(n8610HreFamCodT), Short.valueOf(A8610HreFamCodT), Boolean.valueOf(n8623HreHilasa), A8623HreHilasa, Boolean.valueOf(n8624HreEnsayo), Integer.valueOf(A8624HreEnsayo), Boolean.valueOf(n8625HreOpa), A8625HreOpa, Boolean.valueOf(n8626HreOpn), Byte.valueOf(A8626HreOpn), Boolean.valueOf(n12264HreNInter), Integer.valueOf(A12264HreNInter)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREH");
         if ( (pr_default.getStatus(3) == 1) )
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
         System.out.println( httpContext.getMessage( "Hisrem", "") );
         /* Using cursor P03CC8 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV60RecLinMaq)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A2804RecLinMaq = P03CC8_A2804RecLinMaq[0] ;
            A602MaqCod = P03CC8_A602MaqCod[0] ;
            A2805RecVolPrd = P03CC8_A2805RecVolPrd[0] ;
            A2806RecFA = P03CC8_A2806RecFA[0] ;
            A1272UltLinPro = P03CC8_A1272UltLinPro[0] ;
            A4574RecFecPes = P03CC8_A4574RecFecPes[0] ;
            A4575RecMaqPes = P03CC8_A4575RecMaqPes[0] ;
            A4402RecUsrCod = P03CC8_A4402RecUsrCod[0] ;
            A4258RecMaqFas = P03CC8_A4258RecMaqFas[0] ;
            n4258RecMaqFas = P03CC8_n4258RecMaqFas[0] ;
            A4268RecOrdLin = P03CC8_A4268RecOrdLin[0] ;
            n4268RecOrdLin = P03CC8_n4268RecOrdLin[0] ;
            A4654RecNroPar = P03CC8_A4654RecNroPar[0] ;
            n4654RecNroPar = P03CC8_n4654RecNroPar[0] ;
            A4866RecFecAlt = P03CC8_A4866RecFecAlt[0] ;
            n4866RecFecAlt = P03CC8_n4866RecFecAlt[0] ;
            A4867RecFecMod = P03CC8_A4867RecFecMod[0] ;
            n4867RecFecMod = P03CC8_n4867RecFecMod[0] ;
            A4868RecUsrMod = P03CC8_A4868RecUsrMod[0] ;
            n4868RecUsrMod = P03CC8_n4868RecUsrMod[0] ;
            A4259RecTotKgs = P03CC8_A4259RecTotKgs[0] ;
            A4260RecTotMts = P03CC8_A4260RecTotMts[0] ;
            n4260RecTotMts = P03CC8_n4260RecTotMts[0] ;
            A4261RecTotPrd = P03CC8_A4261RecTotPrd[0] ;
            n4261RecTotPrd = P03CC8_n4261RecTotPrd[0] ;
            A7764RecMaqNh = P03CC8_A7764RecMaqNh[0] ;
            A7765RecMaqVX = P03CC8_A7765RecMaqVX[0] ;
            A7766RecMaqBL = P03CC8_A7766RecMaqBL[0] ;
            A7767RecMaqFlow = P03CC8_A7767RecMaqFlow[0] ;
            A7768RecMaqRPM = P03CC8_A7768RecMaqRPM[0] ;
            A7769RecMaqMol = P03CC8_A7769RecMaqMol[0] ;
            A7770RecMaqTor = P03CC8_A7770RecMaqTor[0] ;
            A7771RecMaqCla = P03CC8_A7771RecMaqCla[0] ;
            A7772RecMaqTej = P03CC8_A7772RecMaqTej[0] ;
            A7773RecMaqDel = P03CC8_A7773RecMaqDel[0] ;
            A7774RecMaqPML = P03CC8_A7774RecMaqPML[0] ;
            A5110RecNumPrg = P03CC8_A5110RecNumPrg[0] ;
            /*
               INSERT RECORD ON TABLE TXPHISREM

            */
            A4492HreBarCod = AV45BarCod ;
            A4493HreBarReo = AV46BarCodReo ;
            A4494HreBarPar = AV47BarCodPar ;
            A4495HreNumCie = AV48NumCie ;
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
            A4968HreTotKgs = A4259RecTotKgs ;
            n4968HreTotKgs = false ;
            A4969HreTotMts = A4260RecTotMts ;
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
            A8602HreCosAA = AV69Barcosaa ;
            n8602HreCosAA = false ;
            A8603HrecosAd = AV68Barcosad ;
            n8603HrecosAd = false ;
            A8604HreCosAnc = AV72barcosanc ;
            n8604HreCosAnc = false ;
            A8605HreCosCol = AV71barcoscol ;
            n8605HreCosCol = false ;
            A8606HreCosPA = AV70Barcospa ;
            n8606HreCosPA = false ;
            A8607HreCosPD = AV67Barcospd ;
            n8607HreCosPD = false ;
            A1094HreNPrg = A5110RecNumPrg ;
            n1094HreNPrg = false ;
            A697HreLotF = AV80BarGirar ;
            n697HreLotF = false ;
            A10102HreNumInt = AV81recnumint ;
            n10102HreNumInt = false ;
            A10103HreDti = AV82Hredti ;
            n10103HreDti = false ;
            A10104HreDtf = AV83Hredtf ;
            n10104HreDtf = false ;
            /* Using cursor P03CC9 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Boolean.valueOf(n4546HreMaqCod), A4546HreMaqCod, Boolean.valueOf(n4547HreVolPrd), Integer.valueOf(A4547HreVolPrd), Boolean.valueOf(n4548HreFacAbs), A4548HreFacAbs, Boolean.valueOf(n4549HreULinPro), Byte.valueOf(A4549HreULinPro), Boolean.valueOf(n4584HreFecPes), A4584HreFecPes, Boolean.valueOf(n4585HreMaqPes), Byte.valueOf(A4585HreMaqPes), Boolean.valueOf(n4863HreUsrCod), A4863HreUsrCod, Boolean.valueOf(n4960HreFecAlt), A4960HreFecAlt, Boolean.valueOf(n4961HreUsrMod), A4961HreUsrMod, Boolean.valueOf(n4962HreFecMod), A4962HreFecMod, Boolean.valueOf(n4963HreFasCod), A4963HreFasCod, Boolean.valueOf(n4964HreOrdLin), Short.valueOf(A4964HreOrdLin), Boolean.valueOf(n4965HreNroPar), Integer.valueOf(A4965HreNroPar), Boolean.valueOf(n4968HreTotKgs), A4968HreTotKgs, Boolean.valueOf(n4969HreTotMts), A4969HreTotMts, Boolean.valueOf(n4970HreTotPrd), Integer.valueOf(A4970HreTotPrd), Boolean.valueOf(n7814HReMaqNh), Short.valueOf(A7814HReMaqNh), Boolean.valueOf(n7815HReMaqVX), Byte.valueOf(A7815HReMaqVX), Boolean.valueOf(n7816HReMaqBL), Byte.valueOf(A7816HReMaqBL), Boolean.valueOf(n7817HReMaqFlow), Byte.valueOf(A7817HReMaqFlow), Boolean.valueOf(n7818HReMaqRPM), Short.valueOf(A7818HReMaqRPM), Boolean.valueOf(n7819HReMaqMol), Short.valueOf(A7819HReMaqMol), Boolean.valueOf(n7820HReMaqTor), Short.valueOf(A7820HReMaqTor), Boolean.valueOf(n7821HReMaqCla), A7821HReMaqCla, Boolean.valueOf(n7822HReMaqTej), Byte.valueOf(A7822HReMaqTej), Boolean.valueOf(n7823HReMaqDel), Byte.valueOf(A7823HReMaqDel), Boolean.valueOf(n7824HReMaqPML), Short.valueOf(A7824HReMaqPML), Boolean.valueOf(n8602HreCosAA), A8602HreCosAA, Boolean.valueOf(n8603HrecosAd), A8603HrecosAd, Boolean.valueOf(n8604HreCosAnc), A8604HreCosAnc, Boolean.valueOf(n8605HreCosCol), A8605HreCosCol, Boolean.valueOf(n8606HreCosPA), A8606HreCosPA, Boolean.valueOf(n8607HreCosPD), A8607HreCosPD, Boolean.valueOf(n1094HreNPrg), A1094HreNPrg, Boolean.valueOf(n697HreLotF), A697HreLotF, Boolean.valueOf(n10102HreNumInt), Integer.valueOf(A10102HreNumInt), Boolean.valueOf(n10103HreDti), A10103HreDti, Boolean.valueOf(n10104HreDtf), A10104HreDtf});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREM");
            if ( (pr_default.getStatus(5) == 1) )
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
            System.out.println( httpContext.getMessage( "Hisrec", "") );
            /* Using cursor P03CC10 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A1273RecLinPro = P03CC10_A1273RecLinPro[0] ;
               A764ProForCod = P03CC10_A764ProForCod[0] ;
               A766ProForDsc = P03CC10_A766ProForDsc[0] ;
               A771ProForTie = P03CC10_A771ProForTie[0] ;
               A772ProForTmx = P03CC10_A772ProForTmx[0] ;
               A4697RecNroPrg = P03CC10_A4697RecNroPrg[0] ;
               A1251RecNumRec = P03CC10_A1251RecNumRec[0] ;
               A4695RecVolPrf = P03CC10_A4695RecVolPrf[0] ;
               A10544RecNH2O = P03CC10_A10544RecNH2O[0] ;
               A766ProForDsc = P03CC10_A766ProForDsc[0] ;
               A771ProForTie = P03CC10_A771ProForTie[0] ;
               A772ProForTmx = P03CC10_A772ProForTmx[0] ;
               /*
                  INSERT RECORD ON TABLE TXPHISREC

               */
               A4492HreBarCod = AV45BarCod ;
               A4493HreBarReo = AV46BarCodReo ;
               A4494HreBarPar = AV47BarCodPar ;
               A4495HreNumCie = AV48NumCie ;
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
               /* Using cursor P03CC11 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A10545HreNH2O), A4551HreProCod, A4552HreProDsc, Short.valueOf(A4553HreProTie), Short.valueOf(A4554HreProTmx), Integer.valueOf(A4555HreNumPro), Integer.valueOf(A4556HreNumRec), Integer.valueOf(A4966HreVolPro)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREC");
               if ( (pr_default.getStatus(7) == 1) )
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
               System.out.println( httpContext.getMessage( "Hisrel", "") );
               /* Using cursor P03CC12 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A811RecLin = P03CC12_A811RecLin[0] ;
                  A872RecPrdNum = P03CC12_A872RecPrdNum[0] ;
                  A875RecPrdDsc = P03CC12_A875RecPrdDsc[0] ;
                  A490ForPrdUMe = P03CC12_A490ForPrdUMe[0] ;
                  n490ForPrdUMe = P03CC12_n490ForPrdUMe[0] ;
                  A488ForPrdDsc = P03CC12_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P03CC12_n488ForPrdDsc[0] ;
                  A431FacCon = P03CC12_A431FacCon[0] ;
                  A686PrdCant = P03CC12_A686PrdCant[0] ;
                  A683PrdCanFin = P03CC12_A683PrdCanFin[0] ;
                  A1797PrdCanAny = P03CC12_A1797PrdCanAny[0] ;
                  A2394RecForNro = P03CC12_A2394RecForNro[0] ;
                  A3274RecPrdTnq = P03CC12_A3274RecPrdTnq[0] ;
                  A3804RecFecMov = P03CC12_A3804RecFecMov[0] ;
                  A3805RecAnyTie = P03CC12_A3805RecAnyTie[0] ;
                  A3806RecUltAny = P03CC12_A3806RecUltAny[0] ;
                  A3807RecPorAny = P03CC12_A3807RecPorAny[0] ;
                  A3938RecCanEns = P03CC12_A3938RecCanEns[0] ;
                  A4024RecMar = P03CC12_A4024RecMar[0] ;
                  A4576RecLinUsr = P03CC12_A4576RecLinUsr[0] ;
                  A4577RecPesFec = P03CC12_A4577RecPesFec[0] ;
                  A724PrdPreAct = P03CC12_A724PrdPreAct[0] ;
                  A5725RecLote = P03CC12_A5725RecLote[0] ;
                  A11708RecProv = P03CC12_A11708RecProv[0] ;
                  A12641RecPrdDc2 = P03CC12_A12641RecPrdDc2[0] ;
                  A12717RecFabId = P03CC12_A12717RecFabId[0] ;
                  A719PrdNum = P03CC12_A719PrdNum[0] ;
                  n719PrdNum = P03CC12_n719PrdNum[0] ;
                  A724PrdPreAct = P03CC12_A724PrdPreAct[0] ;
                  A488ForPrdDsc = P03CC12_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P03CC12_n488ForPrdDsc[0] ;
                  /*
                     INSERT RECORD ON TABLE TXPHISLRE

                  */
                  A4492HreBarCod = AV45BarCod ;
                  A4493HreBarReo = AV46BarCodReo ;
                  A4494HreBarPar = AV47BarCodPar ;
                  A4495HreNumCie = AV48NumCie ;
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
                  A11707HreProv = A11708RecProv ;
                  n11707HreProv = false ;
                  A12642HrePrdDc2 = A12641RecPrdDc2 ;
                  n12642HrePrdDc2 = false ;
                  A12718HreFabId = A12717RecFabId ;
                  n12718HreFabId = false ;
                  /* Using cursor P03CC13 */
                  pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A4557HreRecLin), Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n4558HrePrdNum), A4558HrePrdNum, Boolean.valueOf(n4559HrePrdDsc), A4559HrePrdDsc, Boolean.valueOf(n4560HrePrdUMe), Byte.valueOf(A4560HrePrdUMe), Boolean.valueOf(n4561HrePrdUDs), A4561HrePrdUDs, Boolean.valueOf(n4562HreFacCon), A4562HreFacCon, Boolean.valueOf(n4563HrePrdCant), A4563HrePrdCant, Boolean.valueOf(n4564HreCanFin), A4564HreCanFin, Boolean.valueOf(n4565HreCanAny), A4565HreCanAny, Boolean.valueOf(n4566HreForNro), Byte.valueOf(A4566HreForNro), Boolean.valueOf(n4567HrePrdTnq), Byte.valueOf(A4567HrePrdTnq), Boolean.valueOf(n4568HreFecMov), A4568HreFecMov, Boolean.valueOf(n4569HreAnyTie), Short.valueOf(A4569HreAnyTie), Boolean.valueOf(n4570HreUltAny), A4570HreUltAny, Boolean.valueOf(n4571HrePorAny), A4571HrePorAny, Boolean.valueOf(n4572HreCanEns), A4572HreCanEns, Boolean.valueOf(n4573HreRecMar), Byte.valueOf(A4573HreRecMar), Boolean.valueOf(n4582HreLinUsr), A4582HreLinUsr, Boolean.valueOf(n4583HrePesFec), A4583HrePesFec, Boolean.valueOf(n4967HrePrePrd), A4967HrePrePrd, Boolean.valueOf(n5726HreLote), A5726HreLote, Boolean.valueOf(n11707HreProv), Integer.valueOf(A11707HreProv), Boolean.valueOf(n12642HrePrdDc2), A12642HrePrdDc2, Boolean.valueOf(n12718HreFabId), Integer.valueOf(A12718HreFabId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISLRE");
                  if ( (pr_default.getStatus(9) == 1) )
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
                  pr_default.readNext(8);
               }
               pr_default.close(8);
               pr_default.readNext(6);
            }
            pr_default.close(6);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      System.out.println( httpContext.getMessage( "Lanyad", "") );
      /* Using cursor P03CC14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV60RecLinMaq)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A2808RecLinMAL = P03CC14_A2808RecLinMAL[0] ;
         A1377RecNumAny = P03CC14_A1377RecNumAny[0] ;
         A718PrdNom = P03CC14_A718PrdNom[0] ;
         A1378PrdCFin = P03CC14_A1378PrdCFin[0] ;
         n1378PrdCFin = P03CC14_n1378PrdCFin[0] ;
         A3380LanyPrd = P03CC14_A3380LanyPrd[0] ;
         n3380LanyPrd = P03CC14_n3380LanyPrd[0] ;
         A3381LanyCan = P03CC14_A3381LanyCan[0] ;
         n3381LanyCan = P03CC14_n3381LanyCan[0] ;
         A3382LanyNro = P03CC14_A3382LanyNro[0] ;
         n3382LanyNro = P03CC14_n3382LanyNro[0] ;
         A3383LanyTnq = P03CC14_A3383LanyTnq[0] ;
         n3383LanyTnq = P03CC14_n3383LanyTnq[0] ;
         A4578LanyUsr = P03CC14_A4578LanyUsr[0] ;
         n4578LanyUsr = P03CC14_n4578LanyUsr[0] ;
         A4579LanyFec = P03CC14_A4579LanyFec[0] ;
         n4579LanyFec = P03CC14_n4579LanyFec[0] ;
         A5807LanyLote = P03CC14_A5807LanyLote[0] ;
         n5807LanyLote = P03CC14_n5807LanyLote[0] ;
         A719PrdNum = P03CC14_A719PrdNum[0] ;
         n719PrdNum = P03CC14_n719PrdNum[0] ;
         A718PrdNom = P03CC14_A718PrdNom[0] ;
         /*
            INSERT RECORD ON TABLE TXPHISREA

         */
         A4492HreBarCod = AV45BarCod ;
         A4493HreBarReo = AV46BarCodReo ;
         A4494HreBarPar = AV47BarCodPar ;
         A4495HreNumCie = AV48NumCie ;
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
         /* Using cursor P03CC15 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4508HreLinMAL), Byte.valueOf(A4509HreNumAny), Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n4510HrdPrdDsc), A4510HrdPrdDsc, Boolean.valueOf(n4511HrePrdCFin), A4511HrePrdCFin, Boolean.valueOf(n4512HreLanyPrd), A4512HreLanyPrd, Boolean.valueOf(n4513HreLanyCan), A4513HreLanyCan, Boolean.valueOf(n4514HreLanyNro), Byte.valueOf(A4514HreLanyNro), Boolean.valueOf(n4515HreLanyTnq), Byte.valueOf(A4515HreLanyTnq), Boolean.valueOf(n4580HreLanyUsr), A4580HreLanyUsr, Boolean.valueOf(n4581HreLanyFec), A4581HreLanyFec, Boolean.valueOf(n5808HreLanyLot), A5808HreLanyLot});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREA");
         if ( (pr_default.getStatus(11) == 1) )
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
         pr_default.readNext(10);
      }
      pr_default.close(10);
      if ( GXutil.strcmp(AV64recacab, httpContext.getMessage( "S", "")) != 0 )
      {
         System.out.println( httpContext.getMessage( "Hisrea", "") );
         /* Using cursor P03CC16 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A119BarAgrCod = P03CC16_A119BarAgrCod[0] ;
            A124BarAgrReo = P03CC16_A124BarAgrReo[0] ;
            A122BarAgrPar = P03CC16_A122BarAgrPar[0] ;
            A590KgmAgr = P03CC16_A590KgmAgr[0] ;
            A869MtrAgr = P03CC16_A869MtrAgr[0] ;
            A671PieAgr = P03CC16_A671PieAgr[0] ;
            A1508CliCodAgr = P03CC16_A1508CliCodAgr[0] ;
            A1245BarAgrSer = P03CC16_A1245BarAgrSer[0] ;
            A1507BarAgrDsc = P03CC16_A1507BarAgrDsc[0] ;
            A1510ColNomAgr = P03CC16_A1510ColNomAgr[0] ;
            A1512ColNumAgr = P03CC16_A1512ColNumAgr[0] ;
            /*
               INSERT RECORD ON TABLE TXPHISRAG

            */
            A4492HreBarCod = AV45BarCod ;
            A4493HreBarReo = AV46BarCodReo ;
            A4494HreBarPar = AV47BarCodPar ;
            A4495HreNumCie = AV48NumCie ;
            A4497HreAgrCod = A119BarAgrCod ;
            A4498HreAgrReo = A124BarAgrReo ;
            A4499HreAgrPar = A122BarAgrPar ;
            A4500HreAgrKgm = A590KgmAgr ;
            A4501HreAgrMtr = A869MtrAgr ;
            A4502HreAgrPie = A671PieAgr ;
            A4503HreAgrCli = A1508CliCodAgr ;
            A4504HreAgrSer = A1245BarAgrSer ;
            A4505HreAgrDsc = A1507BarAgrDsc ;
            A4506HreAgrCol = A1510ColNomAgr ;
            A4507HreAgrNumC = A1512ColNumAgr ;
            /* Using cursor P03CC17 */
            pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4498HreAgrReo), A4499HreAgrPar, A4500HreAgrKgm, A4501HreAgrMtr, Short.valueOf(A4502HreAgrPie), Integer.valueOf(A4503HreAgrCli), A4504HreAgrSer, A4505HreAgrDsc, A4506HreAgrCol, Integer.valueOf(A4507HreAgrNumC)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISRAG");
            if ( (pr_default.getStatus(13) == 1) )
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
            pr_default.readNext(12);
         }
         pr_default.close(12);
      }
      if ( AV62NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "phisrec2");
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'NUMCIE' Routine */
      returnInSub = false ;
      AV48NumCie = (byte)(0) ;
      AV61Ok_Linmaq = (byte)(0) ;
      /* Using cursor P03CC18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV45BarCod), Byte.valueOf(AV46BarCodReo), AV47BarCodPar, Short.valueOf(AV60RecLinMaq)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A4545HreLinMaq = P03CC18_A4545HreLinMaq[0] ;
         A4494HreBarPar = P03CC18_A4494HreBarPar[0] ;
         A4493HreBarReo = P03CC18_A4493HreBarReo[0] ;
         A4492HreBarCod = P03CC18_A4492HreBarCod[0] ;
         A4495HreNumCie = P03CC18_A4495HreNumCie[0] ;
         AV48NumCie = A4495HreNumCie ;
         AV61Ok_Linmaq = (byte)(1) ;
         pr_default.readNext(14);
      }
      pr_default.close(14);
      if ( AV61Ok_Linmaq == 1 )
      {
         AV48NumCie = (byte)(AV48NumCie+1) ;
      }
      else
      {
         /* Using cursor P03CC19 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV45BarCod), Byte.valueOf(AV46BarCodReo), AV47BarCodPar});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A4494HreBarPar = P03CC19_A4494HreBarPar[0] ;
            A4493HreBarReo = P03CC19_A4493HreBarReo[0] ;
            A4492HreBarCod = P03CC19_A4492HreBarCod[0] ;
            A4495HreNumCie = P03CC19_A4495HreNumCie[0] ;
            AV48NumCie = A4495HreNumCie ;
            pr_default.readNext(15);
         }
         pr_default.close(15);
         AV48NumCie = (byte)(AV48NumCie+1) ;
      }
   }

   public void S121( )
   {
      /* 'TIPCOL' Routine */
      returnInSub = false ;
      AV50TipColDsc = "" ;
      /* Using cursor P03CC20 */
      pr_default.execute(16, new Object[] {A396EmprCod, Byte.valueOf(AV49BarTipCol)});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A831TipColCod = P03CC20_A831TipColCod[0] ;
         A832TipColDsc = P03CC20_A832TipColDsc[0] ;
         n832TipColDsc = P03CC20_n832TipColDsc[0] ;
         AV50TipColDsc = A832TipColDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
   }

   public void S131( )
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV51TipArtDsc = "" ;
      /* Using cursor P03CC21 */
      pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(AV52BarTipArt)});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A829TipArtCod = P03CC21_A829TipArtCod[0] ;
         A830TipArtDsc = P03CC21_A830TipArtDsc[0] ;
         n830TipArtDsc = P03CC21_n830TipArtDsc[0] ;
         AV51TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(17);
   }

   protected void cleanup( )
   {
      this.aP0[0] = phisrec2.this.A396EmprCod;
      this.aP1[0] = phisrec2.this.A129BarCod;
      this.aP2[0] = phisrec2.this.A132BarCodReo;
      this.aP3[0] = phisrec2.this.A130BarCodPar;
      this.aP4[0] = phisrec2.this.AV60RecLinMaq;
      this.aP5[0] = phisrec2.this.AV67Barcospd;
      this.aP6[0] = phisrec2.this.AV68Barcosad;
      this.aP7[0] = phisrec2.this.AV69Barcosaa;
      this.aP8[0] = phisrec2.this.AV70Barcospa;
      this.aP9[0] = phisrec2.this.AV71barcoscol;
      this.aP10[0] = phisrec2.this.AV72barcosanc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV65recTotKgs = DecimalUtil.ZERO ;
      AV66RecTotMts = DecimalUtil.ZERO ;
      AV64recacab = "" ;
      AV63MaqCod = "" ;
      AV82Hredti = GXutil.resetTime( GXutil.nullDate() );
      AV83Hredtf = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P03CC2_A396EmprCod = new String[] {""} ;
      P03CC2_A129BarCod = new int[1] ;
      P03CC2_A132BarCodReo = new byte[1] ;
      P03CC2_A130BarCodPar = new String[] {""} ;
      P03CC2_A2804RecLinMaq = new short[1] ;
      P03CC2_A602MaqCod = new String[] {""} ;
      P03CC2_A6039RecAcab = new String[] {""} ;
      P03CC2_n6039RecAcab = new boolean[] {false} ;
      P03CC2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC2_A4260RecTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC2_n4260RecTotMts = new boolean[] {false} ;
      P03CC2_A5109RecNumInt = new int[1] ;
      A602MaqCod = "" ;
      A6039RecAcab = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4260RecTotMts = DecimalUtil.ZERO ;
      P03CC3_A396EmprCod = new String[] {""} ;
      P03CC3_A129BarCod = new int[1] ;
      P03CC3_A132BarCodReo = new byte[1] ;
      P03CC3_A130BarCodPar = new String[] {""} ;
      P03CC3_A150BarFacTin = new String[] {""} ;
      P03CC3_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P03CC3_n4442BarFasDTI = new boolean[] {false} ;
      P03CC3_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P03CC3_n4443BarFasDTF = new boolean[] {false} ;
      P03CC3_A194BarOrdLin = new short[1] ;
      P03CC3_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A758ProCod = "" ;
      P03CC6_A361DisCod = new int[1] ;
      P03CC6_A396EmprCod = new String[] {""} ;
      P03CC6_A129BarCod = new int[1] ;
      P03CC6_A132BarCodReo = new byte[1] ;
      P03CC6_A130BarCodPar = new String[] {""} ;
      P03CC6_A143BarDisNum = new String[] {""} ;
      P03CC6_A212BarSer = new String[] {""} ;
      P03CC6_A1652BarSerDsc = new String[] {""} ;
      P03CC6_A217BarTipArt = new short[1] ;
      P03CC6_n217BarTipArt = new boolean[] {false} ;
      P03CC6_A135BarColNom = new String[] {""} ;
      P03CC6_A136BarColNum = new int[1] ;
      P03CC6_A1234BarNomCli = new String[] {""} ;
      P03CC6_A1235BarNumCli = new int[1] ;
      P03CC6_A218BarTipCol = new byte[1] ;
      P03CC6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P03CC6_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P03CC6_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P03CC6_A182BarMat = new String[] {""} ;
      P03CC6_A966PartCod = new String[] {""} ;
      P03CC6_n966PartCod = new boolean[] {false} ;
      P03CC6_A1500BarNMtr = new String[] {""} ;
      P03CC6_A1499BarNMez = new String[] {""} ;
      P03CC6_A1878BarNumTen = new String[] {""} ;
      P03CC6_A3313BarNumTon = new String[] {""} ;
      P03CC6_A252CliCod = new int[1] ;
      P03CC6_n252CliCod = new boolean[] {false} ;
      P03CC6_A2452BarCal = new String[] {""} ;
      P03CC6_n2452BarCal = new boolean[] {false} ;
      P03CC6_A220BarTotPie = new int[1] ;
      P03CC6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC6_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC6_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC6_A199BarPie1 = new short[1] ;
      P03CC6_A365DisDes = new String[] {""} ;
      P03CC6_A898BarPieNDes = new int[1] ;
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
      A2452BarCal = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      AV56BarSer = "" ;
      AV57BarColNom = "" ;
      AV47BarCodPar = "" ;
      AV80BarGirar = "" ;
      AV54IntDsc = "" ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_char9 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int4 = new int[1] ;
      GXv_int12 = new short[1] ;
      AV76Hilasa = "" ;
      GXv_char5 = new String[1] ;
      GXv_int13 = new int[1] ;
      AV78Lb_opcion = "" ;
      GXv_char3 = new String[1] ;
      GXv_int2 = new byte[1] ;
      GXv_int14 = new byte[1] ;
      A4494HreBarPar = "" ;
      A4516HreDisCli = "" ;
      A4517HreBarSer = "" ;
      A4518HreBarDsc = "" ;
      A4520HreTipArtD = "" ;
      AV51TipArtDsc = "" ;
      A4521HreColNom = "" ;
      A4523HreColNomC = "" ;
      A4526HreTipColN = "" ;
      AV50TipColDsc = "" ;
      A4527HreFecGen = GXutil.nullDate() ;
      A4528HreFecCli = GXutil.nullDate() ;
      A4529HreFecTin = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
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
      A8623HreHilasa = "" ;
      A8625HreOpa = "" ;
      Gx_emsg = "" ;
      P03CC8_A396EmprCod = new String[] {""} ;
      P03CC8_A129BarCod = new int[1] ;
      P03CC8_A132BarCodReo = new byte[1] ;
      P03CC8_A130BarCodPar = new String[] {""} ;
      P03CC8_A2804RecLinMaq = new short[1] ;
      P03CC8_A602MaqCod = new String[] {""} ;
      P03CC8_A2805RecVolPrd = new int[1] ;
      P03CC8_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC8_A1272UltLinPro = new byte[1] ;
      P03CC8_A4574RecFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      P03CC8_A4575RecMaqPes = new byte[1] ;
      P03CC8_A4402RecUsrCod = new String[] {""} ;
      P03CC8_A4258RecMaqFas = new String[] {""} ;
      P03CC8_n4258RecMaqFas = new boolean[] {false} ;
      P03CC8_A4268RecOrdLin = new short[1] ;
      P03CC8_n4268RecOrdLin = new boolean[] {false} ;
      P03CC8_A4654RecNroPar = new int[1] ;
      P03CC8_n4654RecNroPar = new boolean[] {false} ;
      P03CC8_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P03CC8_n4866RecFecAlt = new boolean[] {false} ;
      P03CC8_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P03CC8_n4867RecFecMod = new boolean[] {false} ;
      P03CC8_A4868RecUsrMod = new String[] {""} ;
      P03CC8_n4868RecUsrMod = new boolean[] {false} ;
      P03CC8_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC8_A4260RecTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC8_n4260RecTotMts = new boolean[] {false} ;
      P03CC8_A4261RecTotPrd = new int[1] ;
      P03CC8_n4261RecTotPrd = new boolean[] {false} ;
      P03CC8_A7764RecMaqNh = new short[1] ;
      P03CC8_A7765RecMaqVX = new byte[1] ;
      P03CC8_A7766RecMaqBL = new byte[1] ;
      P03CC8_A7767RecMaqFlow = new byte[1] ;
      P03CC8_A7768RecMaqRPM = new short[1] ;
      P03CC8_A7769RecMaqMol = new short[1] ;
      P03CC8_A7770RecMaqTor = new short[1] ;
      P03CC8_A7771RecMaqCla = new String[] {""} ;
      P03CC8_A7772RecMaqTej = new byte[1] ;
      P03CC8_A7773RecMaqDel = new byte[1] ;
      P03CC8_A7774RecMaqPML = new short[1] ;
      P03CC8_A5110RecNumPrg = new String[] {""} ;
      A2806RecFA = DecimalUtil.ZERO ;
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
      A8602HreCosAA = DecimalUtil.ZERO ;
      A8603HrecosAd = DecimalUtil.ZERO ;
      A8604HreCosAnc = DecimalUtil.ZERO ;
      A8605HreCosCol = DecimalUtil.ZERO ;
      A8606HreCosPA = DecimalUtil.ZERO ;
      A8607HreCosPD = DecimalUtil.ZERO ;
      A1094HreNPrg = "" ;
      A697HreLotF = "" ;
      A10103HreDti = GXutil.resetTime( GXutil.nullDate() );
      A10104HreDtf = GXutil.resetTime( GXutil.nullDate() );
      P03CC10_A396EmprCod = new String[] {""} ;
      P03CC10_A129BarCod = new int[1] ;
      P03CC10_A132BarCodReo = new byte[1] ;
      P03CC10_A130BarCodPar = new String[] {""} ;
      P03CC10_A2804RecLinMaq = new short[1] ;
      P03CC10_A1273RecLinPro = new byte[1] ;
      P03CC10_A764ProForCod = new String[] {""} ;
      P03CC10_A766ProForDsc = new String[] {""} ;
      P03CC10_A771ProForTie = new short[1] ;
      P03CC10_A772ProForTmx = new short[1] ;
      P03CC10_A4697RecNroPrg = new int[1] ;
      P03CC10_A1251RecNumRec = new int[1] ;
      P03CC10_A4695RecVolPrf = new int[1] ;
      P03CC10_A10544RecNH2O = new short[1] ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      P03CC12_A396EmprCod = new String[] {""} ;
      P03CC12_A129BarCod = new int[1] ;
      P03CC12_A132BarCodReo = new byte[1] ;
      P03CC12_A130BarCodPar = new String[] {""} ;
      P03CC12_A2804RecLinMaq = new short[1] ;
      P03CC12_A1273RecLinPro = new byte[1] ;
      P03CC12_A811RecLin = new short[1] ;
      P03CC12_A872RecPrdNum = new String[] {""} ;
      P03CC12_A875RecPrdDsc = new String[] {""} ;
      P03CC12_A490ForPrdUMe = new byte[1] ;
      P03CC12_n490ForPrdUMe = new boolean[] {false} ;
      P03CC12_A488ForPrdDsc = new String[] {""} ;
      P03CC12_n488ForPrdDsc = new boolean[] {false} ;
      P03CC12_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC12_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC12_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC12_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC12_A2394RecForNro = new byte[1] ;
      P03CC12_A3274RecPrdTnq = new byte[1] ;
      P03CC12_A3804RecFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      P03CC12_A3805RecAnyTie = new short[1] ;
      P03CC12_A3806RecUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC12_A3807RecPorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC12_A3938RecCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC12_A4024RecMar = new byte[1] ;
      P03CC12_A4576RecLinUsr = new String[] {""} ;
      P03CC12_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P03CC12_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC12_A5725RecLote = new String[] {""} ;
      P03CC12_A11708RecProv = new int[1] ;
      P03CC12_A12641RecPrdDc2 = new String[] {""} ;
      P03CC12_A12717RecFabId = new int[1] ;
      P03CC12_A719PrdNum = new String[] {""} ;
      P03CC12_n719PrdNum = new boolean[] {false} ;
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
      A12641RecPrdDc2 = "" ;
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
      A12642HrePrdDc2 = "" ;
      P03CC14_A396EmprCod = new String[] {""} ;
      P03CC14_A129BarCod = new int[1] ;
      P03CC14_A132BarCodReo = new byte[1] ;
      P03CC14_A130BarCodPar = new String[] {""} ;
      P03CC14_A2808RecLinMAL = new short[1] ;
      P03CC14_A1377RecNumAny = new byte[1] ;
      P03CC14_A718PrdNom = new String[] {""} ;
      P03CC14_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC14_n1378PrdCFin = new boolean[] {false} ;
      P03CC14_A3380LanyPrd = new String[] {""} ;
      P03CC14_n3380LanyPrd = new boolean[] {false} ;
      P03CC14_A3381LanyCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC14_n3381LanyCan = new boolean[] {false} ;
      P03CC14_A3382LanyNro = new byte[1] ;
      P03CC14_n3382LanyNro = new boolean[] {false} ;
      P03CC14_A3383LanyTnq = new byte[1] ;
      P03CC14_n3383LanyTnq = new boolean[] {false} ;
      P03CC14_A4578LanyUsr = new String[] {""} ;
      P03CC14_n4578LanyUsr = new boolean[] {false} ;
      P03CC14_A4579LanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      P03CC14_n4579LanyFec = new boolean[] {false} ;
      P03CC14_A5807LanyLote = new String[] {""} ;
      P03CC14_n5807LanyLote = new boolean[] {false} ;
      P03CC14_A719PrdNum = new String[] {""} ;
      P03CC14_n719PrdNum = new boolean[] {false} ;
      A718PrdNom = "" ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A3380LanyPrd = "" ;
      A3381LanyCan = DecimalUtil.ZERO ;
      A4578LanyUsr = "" ;
      A4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
      A5807LanyLote = "" ;
      A4510HrdPrdDsc = "" ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      A4512HreLanyPrd = "" ;
      A4513HreLanyCan = DecimalUtil.ZERO ;
      A4580HreLanyUsr = "" ;
      A4581HreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      A5808HreLanyLot = "" ;
      P03CC16_A396EmprCod = new String[] {""} ;
      P03CC16_A129BarCod = new int[1] ;
      P03CC16_A132BarCodReo = new byte[1] ;
      P03CC16_A130BarCodPar = new String[] {""} ;
      P03CC16_A119BarAgrCod = new int[1] ;
      P03CC16_A124BarAgrReo = new byte[1] ;
      P03CC16_A122BarAgrPar = new String[] {""} ;
      P03CC16_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC16_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CC16_A671PieAgr = new short[1] ;
      P03CC16_A1508CliCodAgr = new int[1] ;
      P03CC16_A1245BarAgrSer = new String[] {""} ;
      P03CC16_A1507BarAgrDsc = new String[] {""} ;
      P03CC16_A1510ColNomAgr = new String[] {""} ;
      P03CC16_A1512ColNumAgr = new int[1] ;
      A122BarAgrPar = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      A1510ColNomAgr = "" ;
      A4499HreAgrPar = "" ;
      A4500HreAgrKgm = DecimalUtil.ZERO ;
      A4501HreAgrMtr = DecimalUtil.ZERO ;
      A4504HreAgrSer = "" ;
      A4505HreAgrDsc = "" ;
      A4506HreAgrCol = "" ;
      P03CC18_A396EmprCod = new String[] {""} ;
      P03CC18_A4545HreLinMaq = new short[1] ;
      P03CC18_A4494HreBarPar = new String[] {""} ;
      P03CC18_A4493HreBarReo = new byte[1] ;
      P03CC18_A4492HreBarCod = new int[1] ;
      P03CC18_A4495HreNumCie = new byte[1] ;
      P03CC19_A396EmprCod = new String[] {""} ;
      P03CC19_A4494HreBarPar = new String[] {""} ;
      P03CC19_A4493HreBarReo = new byte[1] ;
      P03CC19_A4492HreBarCod = new int[1] ;
      P03CC19_A4495HreNumCie = new byte[1] ;
      P03CC20_A396EmprCod = new String[] {""} ;
      P03CC20_A831TipColCod = new byte[1] ;
      P03CC20_A832TipColDsc = new String[] {""} ;
      P03CC20_n832TipColDsc = new boolean[] {false} ;
      A832TipColDsc = "" ;
      P03CC21_A396EmprCod = new String[] {""} ;
      P03CC21_A829TipArtCod = new short[1] ;
      P03CC21_A830TipArtDsc = new String[] {""} ;
      P03CC21_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.phisrec2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.phisrec2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.phisrec2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phisrec2__default(),
         new Object[] {
             new Object[] {
            P03CC2_A396EmprCod, P03CC2_A129BarCod, P03CC2_A132BarCodReo, P03CC2_A130BarCodPar, P03CC2_A2804RecLinMaq, P03CC2_A602MaqCod, P03CC2_A6039RecAcab, P03CC2_n6039RecAcab, P03CC2_A4259RecTotKgs, P03CC2_A4260RecTotMts,
            P03CC2_n4260RecTotMts, P03CC2_A5109RecNumInt
            }
            , new Object[] {
            P03CC3_A396EmprCod, P03CC3_A129BarCod, P03CC3_A132BarCodReo, P03CC3_A130BarCodPar, P03CC3_A150BarFacTin, P03CC3_A4442BarFasDTI, P03CC3_n4442BarFasDTI, P03CC3_A4443BarFasDTF, P03CC3_n4443BarFasDTF, P03CC3_A194BarOrdLin,
            P03CC3_A758ProCod
            }
            , new Object[] {
            P03CC6_A361DisCod, P03CC6_A396EmprCod, P03CC6_A129BarCod, P03CC6_A132BarCodReo, P03CC6_A130BarCodPar, P03CC6_A143BarDisNum, P03CC6_A212BarSer, P03CC6_A1652BarSerDsc, P03CC6_A217BarTipArt, P03CC6_n217BarTipArt,
            P03CC6_A135BarColNom, P03CC6_A136BarColNum, P03CC6_A1234BarNomCli, P03CC6_A1235BarNumCli, P03CC6_A218BarTipCol, P03CC6_A159BarFecGen, P03CC6_A155BarFecCli, P03CC6_A158BarFecFpr, P03CC6_A182BarMat, P03CC6_A966PartCod,
            P03CC6_n966PartCod, P03CC6_A1500BarNMtr, P03CC6_A1499BarNMez, P03CC6_A1878BarNumTen, P03CC6_A3313BarNumTon, P03CC6_A252CliCod, P03CC6_n252CliCod, P03CC6_A2452BarCal, P03CC6_n2452BarCal, P03CC6_A220BarTotPie,
            P03CC6_A184BarMtr, P03CC6_A870BarTotMtr, P03CC6_A166BarKgm, P03CC6_A219BarTotAgr, P03CC6_A199BarPie1, P03CC6_A365DisDes, P03CC6_A898BarPieNDes
            }
            , new Object[] {
            }
            , new Object[] {
            P03CC8_A396EmprCod, P03CC8_A129BarCod, P03CC8_A132BarCodReo, P03CC8_A130BarCodPar, P03CC8_A2804RecLinMaq, P03CC8_A602MaqCod, P03CC8_A2805RecVolPrd, P03CC8_A2806RecFA, P03CC8_A1272UltLinPro, P03CC8_A4574RecFecPes,
            P03CC8_A4575RecMaqPes, P03CC8_A4402RecUsrCod, P03CC8_A4258RecMaqFas, P03CC8_n4258RecMaqFas, P03CC8_A4268RecOrdLin, P03CC8_n4268RecOrdLin, P03CC8_A4654RecNroPar, P03CC8_n4654RecNroPar, P03CC8_A4866RecFecAlt, P03CC8_n4866RecFecAlt,
            P03CC8_A4867RecFecMod, P03CC8_n4867RecFecMod, P03CC8_A4868RecUsrMod, P03CC8_n4868RecUsrMod, P03CC8_A4259RecTotKgs, P03CC8_A4260RecTotMts, P03CC8_n4260RecTotMts, P03CC8_A4261RecTotPrd, P03CC8_n4261RecTotPrd, P03CC8_A7764RecMaqNh,
            P03CC8_A7765RecMaqVX, P03CC8_A7766RecMaqBL, P03CC8_A7767RecMaqFlow, P03CC8_A7768RecMaqRPM, P03CC8_A7769RecMaqMol, P03CC8_A7770RecMaqTor, P03CC8_A7771RecMaqCla, P03CC8_A7772RecMaqTej, P03CC8_A7773RecMaqDel, P03CC8_A7774RecMaqPML,
            P03CC8_A5110RecNumPrg
            }
            , new Object[] {
            }
            , new Object[] {
            P03CC10_A396EmprCod, P03CC10_A129BarCod, P03CC10_A132BarCodReo, P03CC10_A130BarCodPar, P03CC10_A2804RecLinMaq, P03CC10_A1273RecLinPro, P03CC10_A764ProForCod, P03CC10_A766ProForDsc, P03CC10_A771ProForTie, P03CC10_A772ProForTmx,
            P03CC10_A4697RecNroPrg, P03CC10_A1251RecNumRec, P03CC10_A4695RecVolPrf, P03CC10_A10544RecNH2O
            }
            , new Object[] {
            }
            , new Object[] {
            P03CC12_A396EmprCod, P03CC12_A129BarCod, P03CC12_A132BarCodReo, P03CC12_A130BarCodPar, P03CC12_A2804RecLinMaq, P03CC12_A1273RecLinPro, P03CC12_A811RecLin, P03CC12_A872RecPrdNum, P03CC12_A875RecPrdDsc, P03CC12_A490ForPrdUMe,
            P03CC12_n490ForPrdUMe, P03CC12_A488ForPrdDsc, P03CC12_n488ForPrdDsc, P03CC12_A431FacCon, P03CC12_A686PrdCant, P03CC12_A683PrdCanFin, P03CC12_A1797PrdCanAny, P03CC12_A2394RecForNro, P03CC12_A3274RecPrdTnq, P03CC12_A3804RecFecMov,
            P03CC12_A3805RecAnyTie, P03CC12_A3806RecUltAny, P03CC12_A3807RecPorAny, P03CC12_A3938RecCanEns, P03CC12_A4024RecMar, P03CC12_A4576RecLinUsr, P03CC12_A4577RecPesFec, P03CC12_A724PrdPreAct, P03CC12_A5725RecLote, P03CC12_A11708RecProv,
            P03CC12_A12641RecPrdDc2, P03CC12_A12717RecFabId, P03CC12_A719PrdNum, P03CC12_n719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            P03CC14_A396EmprCod, P03CC14_A129BarCod, P03CC14_A132BarCodReo, P03CC14_A130BarCodPar, P03CC14_A2808RecLinMAL, P03CC14_A1377RecNumAny, P03CC14_A718PrdNom, P03CC14_A1378PrdCFin, P03CC14_n1378PrdCFin, P03CC14_A3380LanyPrd,
            P03CC14_n3380LanyPrd, P03CC14_A3381LanyCan, P03CC14_n3381LanyCan, P03CC14_A3382LanyNro, P03CC14_n3382LanyNro, P03CC14_A3383LanyTnq, P03CC14_n3383LanyTnq, P03CC14_A4578LanyUsr, P03CC14_n4578LanyUsr, P03CC14_A4579LanyFec,
            P03CC14_n4579LanyFec, P03CC14_A5807LanyLote, P03CC14_n5807LanyLote, P03CC14_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            P03CC16_A396EmprCod, P03CC16_A129BarCod, P03CC16_A132BarCodReo, P03CC16_A130BarCodPar, P03CC16_A119BarAgrCod, P03CC16_A124BarAgrReo, P03CC16_A122BarAgrPar, P03CC16_A590KgmAgr, P03CC16_A869MtrAgr, P03CC16_A671PieAgr,
            P03CC16_A1508CliCodAgr, P03CC16_A1245BarAgrSer, P03CC16_A1507BarAgrDsc, P03CC16_A1510ColNomAgr, P03CC16_A1512ColNumAgr
            }
            , new Object[] {
            }
            , new Object[] {
            P03CC18_A396EmprCod, P03CC18_A4545HreLinMaq, P03CC18_A4494HreBarPar, P03CC18_A4493HreBarReo, P03CC18_A4492HreBarCod, P03CC18_A4495HreNumCie
            }
            , new Object[] {
            P03CC19_A396EmprCod, P03CC19_A4494HreBarPar, P03CC19_A4493HreBarReo, P03CC19_A4492HreBarCod, P03CC19_A4495HreNumCie
            }
            , new Object[] {
            P03CC20_A396EmprCod, P03CC20_A831TipColCod, P03CC20_A832TipColDsc, P03CC20_n832TipColDsc
            }
            , new Object[] {
            P03CC21_A396EmprCod, P03CC21_A829TipArtCod, P03CC21_A830TipArtDsc, P03CC21_n830TipArtDsc
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV62NCLec ;
   private byte GXt_int1 ;
   private byte A218BarTipCol ;
   private byte AV49BarTipCol ;
   private byte AV46BarCodReo ;
   private byte AV53IntCod ;
   private byte GXv_int8[] ;
   private byte AV79Lb_numop ;
   private byte GXv_int2[] ;
   private byte AV74Flag ;
   private byte GXv_int14[] ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte AV48NumCie ;
   private byte A4525HreTipCol ;
   private byte A4539HreIntCod ;
   private byte A8626HreOpn ;
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
   private byte A124BarAgrReo ;
   private byte A4498HreAgrReo ;
   private byte AV61Ok_Linmaq ;
   private byte A831TipColCod ;
   private short AV60RecLinMaq ;
   private short A2804RecLinMaq ;
   private short A194BarOrdLin ;
   private short A217BarTipArt ;
   private short A199BarPie1 ;
   private short AV52BarTipArt ;
   private short AV75HreFamCodt ;
   private short GXv_int12[] ;
   private short A4519HreTipArt ;
   private short A8610HreFamCodT ;
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
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short A10544RecNH2O ;
   private short A4553HreProTie ;
   private short A4554HreProTmx ;
   private short A10545HreNH2O ;
   private short A811RecLin ;
   private short A3805RecAnyTie ;
   private short A4557HreRecLin ;
   private short A4569HreAnyTie ;
   private short A2808RecLinMAL ;
   private short A4508HreLinMAL ;
   private short A671PieAgr ;
   private short A4502HreAgrPie ;
   private short A829TipArtCod ;
   private int A129BarCod ;
   private int AV81recnumint ;
   private int A5109RecNumInt ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A252CliCod ;
   private int A220BarTotPie ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int A813RecTotPie ;
   private int AV55CliCod ;
   private int AV58BarColNum ;
   private int AV45BarCod ;
   private int GXv_int11[] ;
   private int GXv_int7[] ;
   private int AV73ForNumCol ;
   private int GXv_int4[] ;
   private int AV77NEnsayo ;
   private int GXv_int13[] ;
   private int GX_INS675 ;
   private int A4492HreBarCod ;
   private int A4522HreColNum ;
   private int A4524HreColNumC ;
   private int A4534HreBarPie ;
   private int A4544HreTotPie ;
   private int A8608HreNumColF ;
   private int A8624HreEnsayo ;
   private int A12264HreNInter ;
   private int A2805RecVolPrd ;
   private int A4654RecNroPar ;
   private int A4261RecTotPrd ;
   private int GX_INS678 ;
   private int A4547HreVolPrd ;
   private int A4965HreNroPar ;
   private int A4970HreTotPrd ;
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
   private int A119BarAgrCod ;
   private int A1508CliCodAgr ;
   private int A1512ColNumAgr ;
   private int GX_INS676 ;
   private int A4497HreAgrCod ;
   private int A4503HreAgrCli ;
   private int A4507HreAgrNumC ;
   private java.math.BigDecimal AV67Barcospd ;
   private java.math.BigDecimal AV68Barcosad ;
   private java.math.BigDecimal AV69Barcosaa ;
   private java.math.BigDecimal AV70Barcospa ;
   private java.math.BigDecimal AV71barcoscol ;
   private java.math.BigDecimal AV72barcosanc ;
   private java.math.BigDecimal AV65recTotKgs ;
   private java.math.BigDecimal AV66RecTotMts ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4260RecTotMts ;
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
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A4548HreFacAbs ;
   private java.math.BigDecimal A4968HreTotKgs ;
   private java.math.BigDecimal A4969HreTotMts ;
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
   private java.math.BigDecimal A4562HreFacCon ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4564HreCanFin ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal A4570HreUltAny ;
   private java.math.BigDecimal A4571HrePorAny ;
   private java.math.BigDecimal A4572HreCanEns ;
   private java.math.BigDecimal A4967HrePrePrd ;
   private java.math.BigDecimal A1378PrdCFin ;
   private java.math.BigDecimal A3381LanyCan ;
   private java.math.BigDecimal A4511HrePrdCFin ;
   private java.math.BigDecimal A4513HreLanyCan ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal A4500HreAgrKgm ;
   private java.math.BigDecimal A4501HreAgrMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV64recacab ;
   private String AV63MaqCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A6039RecAcab ;
   private String A150BarFacTin ;
   private String A758ProCod ;
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
   private String A2452BarCal ;
   private String A365DisDes ;
   private String AV56BarSer ;
   private String AV57BarColNom ;
   private String AV47BarCodPar ;
   private String AV80BarGirar ;
   private String AV54IntDsc ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char6[] ;
   private String AV76Hilasa ;
   private String GXv_char5[] ;
   private String AV78Lb_opcion ;
   private String GXv_char3[] ;
   private String A4494HreBarPar ;
   private String A4516HreDisCli ;
   private String A4517HreBarSer ;
   private String A4518HreBarDsc ;
   private String A4520HreTipArtD ;
   private String AV51TipArtDsc ;
   private String A4521HreColNom ;
   private String A4523HreColNomC ;
   private String A4526HreTipColN ;
   private String AV50TipColDsc ;
   private String A4531HreBarMat ;
   private String A4535HrePartCod ;
   private String A4536HreBarNMtr ;
   private String A4537HreBarNMez ;
   private String A4538HreNumTen ;
   private String A4540HreIntDsc ;
   private String A4541HreNumTon ;
   private String A4496HreMaqHdr ;
   private String A8623HreHilasa ;
   private String A8625HreOpa ;
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
   private String A1094HreNPrg ;
   private String A697HreLotF ;
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
   private String A122BarAgrPar ;
   private String A1245BarAgrSer ;
   private String A1507BarAgrDsc ;
   private String A1510ColNomAgr ;
   private String A4499HreAgrPar ;
   private String A4504HreAgrSer ;
   private String A4505HreAgrDsc ;
   private String A4506HreAgrCol ;
   private String A832TipColDsc ;
   private String A830TipArtDsc ;
   private java.util.Date AV82Hredti ;
   private java.util.Date AV83Hredtf ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A4574RecFecPes ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date A4867RecFecMod ;
   private java.util.Date A4584HreFecPes ;
   private java.util.Date A4960HreFecAlt ;
   private java.util.Date A4962HreFecMod ;
   private java.util.Date A10103HreDti ;
   private java.util.Date A10104HreDtf ;
   private java.util.Date A4577RecPesFec ;
   private java.util.Date A4583HrePesFec ;
   private java.util.Date A4579LanyFec ;
   private java.util.Date A4581HreLanyFec ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A4527HreFecGen ;
   private java.util.Date A4528HreFecCli ;
   private java.util.Date A4529HreFecTin ;
   private java.util.Date Gx_date ;
   private java.util.Date A4530HreFecFpr ;
   private java.util.Date A3804RecFecMov ;
   private java.util.Date A4568HreFecMov ;
   private boolean n6039RecAcab ;
   private boolean n4260RecTotMts ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
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
   private boolean n8608HreNumColF ;
   private boolean n8610HreFamCodT ;
   private boolean n8623HreHilasa ;
   private boolean n8624HreEnsayo ;
   private boolean n8625HreOpa ;
   private boolean n8626HreOpn ;
   private boolean n12264HreNInter ;
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
   private boolean n8602HreCosAA ;
   private boolean n8603HrecosAd ;
   private boolean n8604HreCosAnc ;
   private boolean n8605HreCosCol ;
   private boolean n8606HreCosPA ;
   private boolean n8607HreCosPD ;
   private boolean n1094HreNPrg ;
   private boolean n697HreLotF ;
   private boolean n10102HreNumInt ;
   private boolean n10103HreDti ;
   private boolean n10104HreDtf ;
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
   private boolean n11707HreProv ;
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
   private boolean n832TipColDsc ;
   private boolean n830TipArtDsc ;
   private java.math.BigDecimal[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P03CC2_A396EmprCod ;
   private int[] P03CC2_A129BarCod ;
   private byte[] P03CC2_A132BarCodReo ;
   private String[] P03CC2_A130BarCodPar ;
   private short[] P03CC2_A2804RecLinMaq ;
   private String[] P03CC2_A602MaqCod ;
   private String[] P03CC2_A6039RecAcab ;
   private boolean[] P03CC2_n6039RecAcab ;
   private java.math.BigDecimal[] P03CC2_A4259RecTotKgs ;
   private java.math.BigDecimal[] P03CC2_A4260RecTotMts ;
   private boolean[] P03CC2_n4260RecTotMts ;
   private int[] P03CC2_A5109RecNumInt ;
   private String[] P03CC3_A396EmprCod ;
   private int[] P03CC3_A129BarCod ;
   private byte[] P03CC3_A132BarCodReo ;
   private String[] P03CC3_A130BarCodPar ;
   private String[] P03CC3_A150BarFacTin ;
   private java.util.Date[] P03CC3_A4442BarFasDTI ;
   private boolean[] P03CC3_n4442BarFasDTI ;
   private java.util.Date[] P03CC3_A4443BarFasDTF ;
   private boolean[] P03CC3_n4443BarFasDTF ;
   private short[] P03CC3_A194BarOrdLin ;
   private String[] P03CC3_A758ProCod ;
   private int[] P03CC6_A361DisCod ;
   private String[] P03CC6_A396EmprCod ;
   private int[] P03CC6_A129BarCod ;
   private byte[] P03CC6_A132BarCodReo ;
   private String[] P03CC6_A130BarCodPar ;
   private String[] P03CC6_A143BarDisNum ;
   private String[] P03CC6_A212BarSer ;
   private String[] P03CC6_A1652BarSerDsc ;
   private short[] P03CC6_A217BarTipArt ;
   private boolean[] P03CC6_n217BarTipArt ;
   private String[] P03CC6_A135BarColNom ;
   private int[] P03CC6_A136BarColNum ;
   private String[] P03CC6_A1234BarNomCli ;
   private int[] P03CC6_A1235BarNumCli ;
   private byte[] P03CC6_A218BarTipCol ;
   private java.util.Date[] P03CC6_A159BarFecGen ;
   private java.util.Date[] P03CC6_A155BarFecCli ;
   private java.util.Date[] P03CC6_A158BarFecFpr ;
   private String[] P03CC6_A182BarMat ;
   private String[] P03CC6_A966PartCod ;
   private boolean[] P03CC6_n966PartCod ;
   private String[] P03CC6_A1500BarNMtr ;
   private String[] P03CC6_A1499BarNMez ;
   private String[] P03CC6_A1878BarNumTen ;
   private String[] P03CC6_A3313BarNumTon ;
   private int[] P03CC6_A252CliCod ;
   private boolean[] P03CC6_n252CliCod ;
   private String[] P03CC6_A2452BarCal ;
   private boolean[] P03CC6_n2452BarCal ;
   private int[] P03CC6_A220BarTotPie ;
   private java.math.BigDecimal[] P03CC6_A184BarMtr ;
   private java.math.BigDecimal[] P03CC6_A870BarTotMtr ;
   private java.math.BigDecimal[] P03CC6_A166BarKgm ;
   private java.math.BigDecimal[] P03CC6_A219BarTotAgr ;
   private short[] P03CC6_A199BarPie1 ;
   private String[] P03CC6_A365DisDes ;
   private int[] P03CC6_A898BarPieNDes ;
   private String[] P03CC8_A396EmprCod ;
   private int[] P03CC8_A129BarCod ;
   private byte[] P03CC8_A132BarCodReo ;
   private String[] P03CC8_A130BarCodPar ;
   private short[] P03CC8_A2804RecLinMaq ;
   private String[] P03CC8_A602MaqCod ;
   private int[] P03CC8_A2805RecVolPrd ;
   private java.math.BigDecimal[] P03CC8_A2806RecFA ;
   private byte[] P03CC8_A1272UltLinPro ;
   private java.util.Date[] P03CC8_A4574RecFecPes ;
   private byte[] P03CC8_A4575RecMaqPes ;
   private String[] P03CC8_A4402RecUsrCod ;
   private String[] P03CC8_A4258RecMaqFas ;
   private boolean[] P03CC8_n4258RecMaqFas ;
   private short[] P03CC8_A4268RecOrdLin ;
   private boolean[] P03CC8_n4268RecOrdLin ;
   private int[] P03CC8_A4654RecNroPar ;
   private boolean[] P03CC8_n4654RecNroPar ;
   private java.util.Date[] P03CC8_A4866RecFecAlt ;
   private boolean[] P03CC8_n4866RecFecAlt ;
   private java.util.Date[] P03CC8_A4867RecFecMod ;
   private boolean[] P03CC8_n4867RecFecMod ;
   private String[] P03CC8_A4868RecUsrMod ;
   private boolean[] P03CC8_n4868RecUsrMod ;
   private java.math.BigDecimal[] P03CC8_A4259RecTotKgs ;
   private java.math.BigDecimal[] P03CC8_A4260RecTotMts ;
   private boolean[] P03CC8_n4260RecTotMts ;
   private int[] P03CC8_A4261RecTotPrd ;
   private boolean[] P03CC8_n4261RecTotPrd ;
   private short[] P03CC8_A7764RecMaqNh ;
   private byte[] P03CC8_A7765RecMaqVX ;
   private byte[] P03CC8_A7766RecMaqBL ;
   private byte[] P03CC8_A7767RecMaqFlow ;
   private short[] P03CC8_A7768RecMaqRPM ;
   private short[] P03CC8_A7769RecMaqMol ;
   private short[] P03CC8_A7770RecMaqTor ;
   private String[] P03CC8_A7771RecMaqCla ;
   private byte[] P03CC8_A7772RecMaqTej ;
   private byte[] P03CC8_A7773RecMaqDel ;
   private short[] P03CC8_A7774RecMaqPML ;
   private String[] P03CC8_A5110RecNumPrg ;
   private String[] P03CC10_A396EmprCod ;
   private int[] P03CC10_A129BarCod ;
   private byte[] P03CC10_A132BarCodReo ;
   private String[] P03CC10_A130BarCodPar ;
   private short[] P03CC10_A2804RecLinMaq ;
   private byte[] P03CC10_A1273RecLinPro ;
   private String[] P03CC10_A764ProForCod ;
   private String[] P03CC10_A766ProForDsc ;
   private short[] P03CC10_A771ProForTie ;
   private short[] P03CC10_A772ProForTmx ;
   private int[] P03CC10_A4697RecNroPrg ;
   private int[] P03CC10_A1251RecNumRec ;
   private int[] P03CC10_A4695RecVolPrf ;
   private short[] P03CC10_A10544RecNH2O ;
   private String[] P03CC12_A396EmprCod ;
   private int[] P03CC12_A129BarCod ;
   private byte[] P03CC12_A132BarCodReo ;
   private String[] P03CC12_A130BarCodPar ;
   private short[] P03CC12_A2804RecLinMaq ;
   private byte[] P03CC12_A1273RecLinPro ;
   private short[] P03CC12_A811RecLin ;
   private String[] P03CC12_A872RecPrdNum ;
   private String[] P03CC12_A875RecPrdDsc ;
   private byte[] P03CC12_A490ForPrdUMe ;
   private boolean[] P03CC12_n490ForPrdUMe ;
   private String[] P03CC12_A488ForPrdDsc ;
   private boolean[] P03CC12_n488ForPrdDsc ;
   private java.math.BigDecimal[] P03CC12_A431FacCon ;
   private java.math.BigDecimal[] P03CC12_A686PrdCant ;
   private java.math.BigDecimal[] P03CC12_A683PrdCanFin ;
   private java.math.BigDecimal[] P03CC12_A1797PrdCanAny ;
   private byte[] P03CC12_A2394RecForNro ;
   private byte[] P03CC12_A3274RecPrdTnq ;
   private java.util.Date[] P03CC12_A3804RecFecMov ;
   private short[] P03CC12_A3805RecAnyTie ;
   private java.math.BigDecimal[] P03CC12_A3806RecUltAny ;
   private java.math.BigDecimal[] P03CC12_A3807RecPorAny ;
   private java.math.BigDecimal[] P03CC12_A3938RecCanEns ;
   private byte[] P03CC12_A4024RecMar ;
   private String[] P03CC12_A4576RecLinUsr ;
   private java.util.Date[] P03CC12_A4577RecPesFec ;
   private java.math.BigDecimal[] P03CC12_A724PrdPreAct ;
   private String[] P03CC12_A5725RecLote ;
   private int[] P03CC12_A11708RecProv ;
   private String[] P03CC12_A12641RecPrdDc2 ;
   private int[] P03CC12_A12717RecFabId ;
   private String[] P03CC12_A719PrdNum ;
   private boolean[] P03CC12_n719PrdNum ;
   private String[] P03CC14_A396EmprCod ;
   private int[] P03CC14_A129BarCod ;
   private byte[] P03CC14_A132BarCodReo ;
   private String[] P03CC14_A130BarCodPar ;
   private short[] P03CC14_A2808RecLinMAL ;
   private byte[] P03CC14_A1377RecNumAny ;
   private String[] P03CC14_A718PrdNom ;
   private java.math.BigDecimal[] P03CC14_A1378PrdCFin ;
   private boolean[] P03CC14_n1378PrdCFin ;
   private String[] P03CC14_A3380LanyPrd ;
   private boolean[] P03CC14_n3380LanyPrd ;
   private java.math.BigDecimal[] P03CC14_A3381LanyCan ;
   private boolean[] P03CC14_n3381LanyCan ;
   private byte[] P03CC14_A3382LanyNro ;
   private boolean[] P03CC14_n3382LanyNro ;
   private byte[] P03CC14_A3383LanyTnq ;
   private boolean[] P03CC14_n3383LanyTnq ;
   private String[] P03CC14_A4578LanyUsr ;
   private boolean[] P03CC14_n4578LanyUsr ;
   private java.util.Date[] P03CC14_A4579LanyFec ;
   private boolean[] P03CC14_n4579LanyFec ;
   private String[] P03CC14_A5807LanyLote ;
   private boolean[] P03CC14_n5807LanyLote ;
   private String[] P03CC14_A719PrdNum ;
   private boolean[] P03CC14_n719PrdNum ;
   private String[] P03CC16_A396EmprCod ;
   private int[] P03CC16_A129BarCod ;
   private byte[] P03CC16_A132BarCodReo ;
   private String[] P03CC16_A130BarCodPar ;
   private int[] P03CC16_A119BarAgrCod ;
   private byte[] P03CC16_A124BarAgrReo ;
   private String[] P03CC16_A122BarAgrPar ;
   private java.math.BigDecimal[] P03CC16_A590KgmAgr ;
   private java.math.BigDecimal[] P03CC16_A869MtrAgr ;
   private short[] P03CC16_A671PieAgr ;
   private int[] P03CC16_A1508CliCodAgr ;
   private String[] P03CC16_A1245BarAgrSer ;
   private String[] P03CC16_A1507BarAgrDsc ;
   private String[] P03CC16_A1510ColNomAgr ;
   private int[] P03CC16_A1512ColNumAgr ;
   private String[] P03CC18_A396EmprCod ;
   private short[] P03CC18_A4545HreLinMaq ;
   private String[] P03CC18_A4494HreBarPar ;
   private byte[] P03CC18_A4493HreBarReo ;
   private int[] P03CC18_A4492HreBarCod ;
   private byte[] P03CC18_A4495HreNumCie ;
   private String[] P03CC19_A396EmprCod ;
   private String[] P03CC19_A4494HreBarPar ;
   private byte[] P03CC19_A4493HreBarReo ;
   private int[] P03CC19_A4492HreBarCod ;
   private byte[] P03CC19_A4495HreNumCie ;
   private String[] P03CC20_A396EmprCod ;
   private byte[] P03CC20_A831TipColCod ;
   private String[] P03CC20_A832TipColDsc ;
   private boolean[] P03CC20_n832TipColDsc ;
   private String[] P03CC21_A396EmprCod ;
   private short[] P03CC21_A829TipArtCod ;
   private String[] P03CC21_A830TipArtDsc ;
   private boolean[] P03CC21_n830TipArtDsc ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class phisrec2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class phisrec2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class phisrec2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class phisrec2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03CC2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, MaqCod, RecAcab, RecTotKgs, RecTotMts, RecNumInt FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03CC3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, BarFasDTI, BarFasDTF, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03CC6", "SELECT T1.DisCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarDisNum, T1.BarSer, T1.BarSerDsc, T1.BarTipArt, T1.BarColNom, T1.BarColNum, T1.BarNomCli, T1.BarNumCli, T1.BarTipCol, T1.BarFecGen, T1.BarFecCli, T1.BarFecFpr, T1.BarMat, T2.PartCod, T1.BarNMtr, T1.BarNMez, T1.BarNumTen, T1.BarNumTon, T1.CliCod, T1.BarCal, COALESCE( T4.BarTotPie, 0) AS BarTotPie, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T4.BarTotMtr, 0) AS BarTotMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T4.BarTotAgr, 0) AS BarTotAgr, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM (((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(MtrAgr) AS BarTotMtr, SUM(PieAgr) AS BarTotPie FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03CC7", "INSERT INTO TXPHISREH(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreMaqHdr, HreDisCli, CliCod, HreBarSer, HreBarDsc, HreTipArt, HreTipArtD, HreColNom, HreColNum, HreColNomC, HreColNumC, HreTipCol, HreTipColN, HreFecGen, HreFecCli, HreFecTin, HreFecFpr, HreBarMat, HreBarKgm, HreBarMtr, HreBarPie, HrePartCod, HreBarNMtr, HreBarNMez, HreNumTen, HreIntCod, HreIntDsc, HreNumTon, HreTotKgm, HreTotMtr, HreTotPie, HreNumColF, HreFamCodT, HreHilasa, HreEnsayo, HreOpa, HreOpn, HreNInter, HreLtsSR, HreLtsRs, HreAcaQm, HreRacab, HreFecAcb, HreAbs, HreLtsRc, HreHdrLts, HreFabs, HreDispCli, HreMacCod, HreCencId, HreCenDsc, HreComp1, HreComp2, HreUser, HreDiaHora, HreCdn2, HreCtw) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREH")
         ,new ForEachCursor("P03CC8", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, MaqCod, RecVolPrd, RecFA, UltLinPro, RecFecPes, RecMaqPes, RecUsrCod, RecMaqFas, RecOrdLin, RecNroPar, RecFecAlt, RecFecMod, RecUsrMod, RecTotKgs, RecTotMts, RecTotPrd, RecMaqNh, RecMaqVX, RecMaqBL, RecMaqFlow, RecMaqRPM, RecMaqMol, RecMaqTor, RecMaqCla, RecMaqTej, RecMaqDel, RecMaqPML, RecNumPrg FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03CC9", "INSERT INTO TXPHISREM(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreMaqCod, HreVolPrd, HreFacAbs, HreULinPro, HreFecPes, HreMaqPes, HreUsrCod, HreFecAlt, HreUsrMod, HreFecMod, HreFasCod, HreOrdLin, HreNroPar, HreTotKgs, HreTotMts, HreTotPrd, HReMaqNh, HReMaqVX, HReMaqBL, HReMaqFlow, HReMaqRPM, HReMaqMol, HReMaqTor, HReMaqCla, HReMaqTej, HReMaqDel, HReMaqPML, HreCosAA, HrecosAd, HreCosAnc, HreCosCol, HreCosPA, HreCosPD, HreNPrg, HreLotF, HreNumInt, HreDti, HreDtf, HreProPrd, HreNumRmt, HreNumReo, HreLtsSb, HreLtsRm, HreAcaQ, HreAcab, HreAnc, HreGrm, HreVel, HreObs, HreUltObs, HreAva, HreAs, HreAi) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREM")
         ,new ForEachCursor("P03CC10", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.ProForCod, T2.ProForDsc, T2.ProForTie, T2.ProForTmx, T1.RecNroPrg, T1.RecNumRec, T1.RecVolPrf, T1.RecNH2O FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03CC11", "INSERT INTO TXPHISREC(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreNH2O, HreProCod, HreProDsc, HreProTie, HreProTmx, HreNumPro, HreNumRec, HreVolPro, HreTieprg, HreNroPrg) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREC")
         ,new ForEachCursor("P03CC12", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin, T1.RecPrdNum, T1.RecPrdDsc, T1.ForPrdUMe, T3.ForPrdDsc, T1.FacCon, T1.PrdCant, T1.PrdCanFin, T1.PrdCanAny, T1.RecForNro, T1.RecPrdTnq, T1.RecFecMov, T1.RecAnyTie, T1.RecUltAny, T1.RecPorAny, T1.RecCanEns, T1.RecMar, T1.RecLinUsr, T1.RecPesFec, T2.PrdPreAct, T1.RecLote, T1.RecProv, T1.RecPrdDc2, T1.RecFabId, T1.PrdNum FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03CC13", "INSERT INTO TXPHISLRE(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin, PrdNum, HrePrdNum, HrePrdDsc, HrePrdUMe, HrePrdUDs, HreFacCon, HrePrdCant, HreCanFin, HreCanAny, HreForNro, HrePrdTnq, HreFecMov, HreAnyTie, HreUltAny, HrePorAny, HreCanEns, HreRecMar, HreLinUsr, HrePesFec, HrePrePrd, HreLote, HreProv, HrePrdDc2, HreFabId, HreSalMP, HreSalVol, HreFacCon1, HreFecAct, HreLoteFch, HreLotAlm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISLRE")
         ,new ForEachCursor("P03CC14", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.RecNumAny, T2.PrdNom, T1.PrdCFin, T1.LanyPrd, T1.LanyCan, T1.LanyNro, T1.LanyTnq, T1.LanyUsr, T1.LanyFec, T1.LanyLote, T1.PrdNum FROM (TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.RecNumAny, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03CC15", "INSERT INTO TXPHISREA(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum, HrdPrdDsc, HrePrdCFin, HreLanyPrd, HreLanyCan, HreLanyNro, HreLanyTnq, HreLanyUsr, HreLanyFec, HreLanyLot, HreLanyCtd, HreLanyUnd, HreLanyLtF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREA")
         ,new ForEachCursor("P03CC16", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, MtrAgr, PieAgr, CliCodAgr, BarAgrSer, BarAgrDsc, ColNomAgr, ColNumAgr FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03CC17", "INSERT INTO TXPHISRAG(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar, HreAgrKgm, HreAgrMtr, HreAgrPie, HreAgrCli, HreAgrSer, HreAgrDsc, HreAgrCol, HreAgrNumC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISRAG")
         ,new ForEachCursor("P03CC18", "SELECT EmprCod, HreLinMaq, HreBarPar, HreBarReo, HreBarCod, HreNumCie FROM TXPHISREM WHERE (EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ?) AND (HreLinMaq = ?) ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03CC19", "SELECT EmprCod, HreBarPar, HreBarReo, HreBarCod, HreNumCie FROM TXPHISREH WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03CC20", "SELECT EmprCod, TipColCod, TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03CC21", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[11])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 16);
               ((String[]) buf[19])[0] = rslt.getString(19, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(20, 10);
               ((String[]) buf[22])[0] = rslt.getString(21, 10);
               ((String[]) buf[23])[0] = rslt.getString(22, 10);
               ((String[]) buf[24])[0] = rslt.getString(23, 10);
               ((int[]) buf[25])[0] = rslt.getInt(24);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(28,2);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(30,2);
               ((short[]) buf[34])[0] = rslt.getShort(31);
               ((String[]) buf[35])[0] = rslt.getString(32, 1);
               ((int[]) buf[36])[0] = rslt.getInt(33);
               return;
            case 4 :
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
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(21);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(22);
               ((byte[]) buf[30])[0] = rslt.getByte(23);
               ((byte[]) buf[31])[0] = rslt.getByte(24);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((short[]) buf[33])[0] = rslt.getShort(26);
               ((short[]) buf[34])[0] = rslt.getShort(27);
               ((short[]) buf[35])[0] = rslt.getShort(28);
               ((String[]) buf[36])[0] = rslt.getString(29, 10);
               ((byte[]) buf[37])[0] = rslt.getByte(30);
               ((byte[]) buf[38])[0] = rslt.getByte(31);
               ((short[]) buf[39])[0] = rslt.getShort(32);
               ((String[]) buf[40])[0] = rslt.getString(33, 6);
               return;
            case 6 :
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
            case 8 :
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
               ((int[]) buf[29])[0] = rslt.getInt(28);
               ((String[]) buf[30])[0] = rslt.getString(29, 40);
               ((int[]) buf[31])[0] = rslt.getInt(30);
               ((String[]) buf[32])[0] = rslt.getString(31, 6);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 10 :
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
               ((String[]) buf[23])[0] = rslt.getString(16, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((String[]) buf[12])[0] = rslt.getString(13, 26);
               ((String[]) buf[13])[0] = rslt.getString(14, 13);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               return;
            case 3 :
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
                  stmt.setShort(38, ((Number) parms[70]).shortValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[72], 20);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(40, ((Number) parms[74]).intValue());
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[76], 1);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(42, ((Number) parms[78]).byteValue());
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(43, ((Number) parms[80]).intValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
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
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[73], 6);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[75], 20);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(42, ((Number) parms[77]).intValue());
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(43, (java.util.Date)parms[79], false);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(44, (java.util.Date)parms[81], false);
               }
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
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 9 :
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
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[51]).intValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[53], 40);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(32, ((Number) parms[55]).intValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
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
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 16);
               stmt.setString(14, (String)parms[13], 26);
               stmt.setString(15, (String)parms[14], 13);
               stmt.setInt(16, ((Number) parms[15]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

