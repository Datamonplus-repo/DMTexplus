package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls010 extends GXProcedure
{
   public pcls010( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls010.class ), "" );
   }

   public pcls010( int remoteHandle ,
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
                                     java.math.BigDecimal[] aP5 ,
                                     java.math.BigDecimal[] aP6 ,
                                     java.math.BigDecimal[] aP7 ,
                                     java.math.BigDecimal[] aP8 ,
                                     java.math.BigDecimal[] aP9 ,
                                     java.math.BigDecimal[] aP10 )
   {
      pcls010.this.aP11 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
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
                        java.math.BigDecimal[] aP10 ,
                        java.util.Date[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
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
                             java.math.BigDecimal[] aP10 ,
                             java.util.Date[] aP11 )
   {
      pcls010.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcls010.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcls010.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcls010.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcls010.this.AV65RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pcls010.this.AV44Barcospd = aP5[0];
      this.aP5 = aP5;
      pcls010.this.AV40Barcosad = aP6[0];
      this.aP6 = aP6;
      pcls010.this.AV39Barcosaa = aP7[0];
      this.aP7 = aP7;
      pcls010.this.AV43Barcospa = aP8[0];
      this.aP8 = aP8;
      pcls010.this.AV42barcoscol = aP9[0];
      this.aP9 = aP9;
      pcls010.this.AV41barcosanc = aP10[0];
      this.aP10 = aP10;
      pcls010.this.AV78FechCierre = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV67recTotKgs = DecimalUtil.doubleToDec(0) ;
      AV68RecTotMts = DecimalUtil.doubleToDec(0) ;
      AV66recnumint = 0 ;
      AV64recacab = "@" ;
      AV58MaqCod = httpContext.getMessage( "XXYYZZ", "") ;
      AV72Hredti = GXutil.resetTime( GXutil.nullDate() );
      AV73HreDtf = GXutil.resetTime( GXutil.nullDate() );
      AV76HreFascod = " " ;
      AV77hreordlin = (short)(0) ;
      /* Using cursor P055T2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV65RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P055T2_A2804RecLinMaq[0] ;
         A602MaqCod = P055T2_A602MaqCod[0] ;
         A6039RecAcab = P055T2_A6039RecAcab[0] ;
         n6039RecAcab = P055T2_n6039RecAcab[0] ;
         A4259RecTotKgs = P055T2_A4259RecTotKgs[0] ;
         A4260RecTotMts = P055T2_A4260RecTotMts[0] ;
         n4260RecTotMts = P055T2_n4260RecTotMts[0] ;
         A5109RecNumInt = P055T2_A5109RecNumInt[0] ;
         A5256RecUltObs = P055T2_A5256RecUltObs[0] ;
         n5256RecUltObs = P055T2_n5256RecUltObs[0] ;
         A4258RecMaqFas = P055T2_A4258RecMaqFas[0] ;
         n4258RecMaqFas = P055T2_n4258RecMaqFas[0] ;
         A4268RecOrdLin = P055T2_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P055T2_n4268RecOrdLin[0] ;
         AV58MaqCod = A602MaqCod ;
         AV64recacab = A6039RecAcab ;
         AV67recTotKgs = A4259RecTotKgs ;
         AV68RecTotMts = A4260RecTotMts ;
         AV66recnumint = A5109RecNumInt ;
         AV69RecUltObs = A5256RecUltObs ;
         AV76HreFascod = A4258RecMaqFas ;
         AV77hreordlin = A4268RecOrdLin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV64recacab, httpContext.getMessage( "N", "")) == 0 )
      {
         /* Using cursor P055T3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A150BarFacTin = P055T3_A150BarFacTin[0] ;
            A4442BarFasDTI = P055T3_A4442BarFasDTI[0] ;
            n4442BarFasDTI = P055T3_n4442BarFasDTI[0] ;
            A4443BarFasDTF = P055T3_A4443BarFasDTF[0] ;
            n4443BarFasDTF = P055T3_n4443BarFasDTF[0] ;
            A457FasCod = P055T3_A457FasCod[0] ;
            A194BarOrdLin = P055T3_A194BarOrdLin[0] ;
            A758ProCod = P055T3_A758ProCod[0] ;
            if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
            {
               AV72Hredti = A4442BarFasDTI ;
               AV73HreDtf = A4443BarFasDTF ;
               AV76HreFascod = ((GXutil.strcmp("", AV76HreFascod)==0) ? A457FasCod : AV76HreFascod) ;
               AV77hreordlin = ((0==AV77hreordlin) ? A194BarOrdLin : AV77hreordlin) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      /* Using cursor P055T6 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P055T6_A361DisCod[0] ;
         A143BarDisNum = P055T6_A143BarDisNum[0] ;
         A212BarSer = P055T6_A212BarSer[0] ;
         A1652BarSerDsc = P055T6_A1652BarSerDsc[0] ;
         A217BarTipArt = P055T6_A217BarTipArt[0] ;
         n217BarTipArt = P055T6_n217BarTipArt[0] ;
         A135BarColNom = P055T6_A135BarColNom[0] ;
         A136BarColNum = P055T6_A136BarColNum[0] ;
         A1234BarNomCli = P055T6_A1234BarNomCli[0] ;
         A1235BarNumCli = P055T6_A1235BarNumCli[0] ;
         A218BarTipCol = P055T6_A218BarTipCol[0] ;
         A159BarFecGen = P055T6_A159BarFecGen[0] ;
         A155BarFecCli = P055T6_A155BarFecCli[0] ;
         A158BarFecFpr = P055T6_A158BarFecFpr[0] ;
         A182BarMat = P055T6_A182BarMat[0] ;
         A966PartCod = P055T6_A966PartCod[0] ;
         n966PartCod = P055T6_n966PartCod[0] ;
         A1500BarNMtr = P055T6_A1500BarNMtr[0] ;
         A1499BarNMez = P055T6_A1499BarNMez[0] ;
         A1878BarNumTen = P055T6_A1878BarNumTen[0] ;
         A3313BarNumTon = P055T6_A3313BarNumTon[0] ;
         A4812BarEncCli = P055T6_A4812BarEncCli[0] ;
         A3595BarMacCod = P055T6_A3595BarMacCod[0] ;
         A221BarTra1 = P055T6_A221BarTra1[0] ;
         A224BarTraP1 = P055T6_A224BarTraP1[0] ;
         A222BarTra2 = P055T6_A222BarTra2[0] ;
         A225BarTraP2 = P055T6_A225BarTraP2[0] ;
         A223BarTra3 = P055T6_A223BarTra3[0] ;
         A226BarTraP3 = P055T6_A226BarTraP3[0] ;
         A229BarUrd1 = P055T6_A229BarUrd1[0] ;
         A232BarUrdP1 = P055T6_A232BarUrdP1[0] ;
         A230BarUrd2 = P055T6_A230BarUrd2[0] ;
         A233BarUrdP2 = P055T6_A233BarUrdP2[0] ;
         A231BarUrd3 = P055T6_A231BarUrd3[0] ;
         A234BarUrdP3 = P055T6_A234BarUrdP3[0] ;
         A252CliCod = P055T6_A252CliCod[0] ;
         n252CliCod = P055T6_n252CliCod[0] ;
         A2452BarCal = P055T6_A2452BarCal[0] ;
         n2452BarCal = P055T6_n2452BarCal[0] ;
         A4466BarAcaAnh = P055T6_A4466BarAcaAnh[0] ;
         A2829BarProPer = P055T6_A2829BarProPer[0] ;
         A220BarTotPie = P055T6_A220BarTotPie[0] ;
         A184BarMtr = P055T6_A184BarMtr[0] ;
         A870BarTotMtr = P055T6_A870BarTotMtr[0] ;
         A166BarKgm = P055T6_A166BarKgm[0] ;
         A219BarTotAgr = P055T6_A219BarTotAgr[0] ;
         A199BarPie1 = P055T6_A199BarPie1[0] ;
         A365DisDes = P055T6_A365DisDes[0] ;
         A898BarPieNDes = P055T6_A898BarPieNDes[0] ;
         A966PartCod = P055T6_A966PartCod[0] ;
         n966PartCod = P055T6_n966PartCod[0] ;
         A184BarMtr = P055T6_A184BarMtr[0] ;
         A166BarKgm = P055T6_A166BarKgm[0] ;
         A199BarPie1 = P055T6_A199BarPie1[0] ;
         A898BarPieNDes = P055T6_A898BarPieNDes[0] ;
         A220BarTotPie = P055T6_A220BarTotPie[0] ;
         A870BarTotMtr = P055T6_A870BarTotMtr[0] ;
         A219BarTotAgr = P055T6_A219BarTotAgr[0] ;
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
         AV49CliCod = A252CliCod ;
         AV46BarSer = A212BarSer ;
         AV37BarColNom = A135BarColNom ;
         AV38BarColNum = A136BarColNum ;
         AV48BarTipCol = A218BarTipCol ;
         AV47BarTipArt = A217BarTipArt ;
         AV34BarCod = A129BarCod ;
         AV36BarCodReo = A132BarCodReo ;
         AV35BarCodPar = A130BarCodPar ;
         AV45BarGirar = A2452BarCal ;
         AV74HreCencId = A4466BarAcaAnh ;
         GXt_char1 = AV75HreCenDsc ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = AV74HreCencId ;
         GXv_char4[0] = GXt_char1 ;
         new app.pptable1(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
         pcls010.this.A396EmprCod = GXv_char2[0] ;
         pcls010.this.AV74HreCencId = GXv_int3[0] ;
         pcls010.this.GXt_char1 = GXv_char4[0] ;
         AV75HreCenDsc = ((AV74HreCencId==0) ? "" : GXt_char1) ;
         AV82HreCdn2 = GXutil.substring( A2829BarProPer, 1, 4) ;
         AV83HreCtw = GXutil.substring( A2829BarProPer, 1, 4) ;
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
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = AV49CliCod ;
         GXv_char2[0] = AV46BarSer ;
         GXv_char6[0] = AV37BarColNom ;
         GXv_int7[0] = AV38BarColNum ;
         GXv_int8[0] = AV48BarTipCol ;
         GXv_int9[0] = AV54IntCod ;
         GXv_char10[0] = AV55IntDsc ;
         GXv_char11[0] = " " ;
         GXv_int12[0] = 0 ;
         new app.pbusint(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char2, GXv_char6, GXv_int7, GXv_int8, GXv_int9, GXv_char10, GXv_char11, GXv_int12) ;
         pcls010.this.A396EmprCod = GXv_char4[0] ;
         pcls010.this.AV49CliCod = GXv_int5[0] ;
         pcls010.this.AV46BarSer = GXv_char2[0] ;
         pcls010.this.AV37BarColNom = GXv_char6[0] ;
         pcls010.this.AV38BarColNum = GXv_int7[0] ;
         pcls010.this.AV48BarTipCol = GXv_int8[0] ;
         pcls010.this.AV54IntCod = GXv_int9[0] ;
         pcls010.this.AV55IntDsc = GXv_char10[0] ;
         GXv_char11[0] = A396EmprCod ;
         GXv_int12[0] = AV49CliCod ;
         GXv_char10[0] = AV46BarSer ;
         GXv_char6[0] = AV37BarColNom ;
         GXv_int7[0] = AV38BarColNum ;
         GXv_int9[0] = AV48BarTipCol ;
         GXv_int5[0] = AV51ForNumCol ;
         GXv_int3[0] = AV53HreFamCodt ;
         GXv_char4[0] = AV52Hilasa ;
         GXv_int13[0] = AV60NEnsayo ;
         GXv_char2[0] = AV57Lb_opcion ;
         GXv_int8[0] = AV56Lb_numop ;
         GXv_int14[0] = AV50Flag ;
         new app.pbufon2(remoteHandle, context).execute( GXv_char11, GXv_int12, GXv_char10, GXv_char6, GXv_int7, GXv_int9, GXv_int5, GXv_int3, GXv_char4, GXv_int13, GXv_char2, GXv_int8, GXv_int14) ;
         pcls010.this.A396EmprCod = GXv_char11[0] ;
         pcls010.this.AV49CliCod = GXv_int12[0] ;
         pcls010.this.AV46BarSer = GXv_char10[0] ;
         pcls010.this.AV37BarColNom = GXv_char6[0] ;
         pcls010.this.AV38BarColNum = GXv_int7[0] ;
         pcls010.this.AV48BarTipCol = GXv_int9[0] ;
         pcls010.this.AV51ForNumCol = GXv_int5[0] ;
         pcls010.this.AV53HreFamCodt = GXv_int3[0] ;
         pcls010.this.AV52Hilasa = GXv_char4[0] ;
         pcls010.this.AV60NEnsayo = GXv_int13[0] ;
         pcls010.this.AV57Lb_opcion = GXv_char2[0] ;
         pcls010.this.AV56Lb_numop = GXv_int8[0] ;
         pcls010.this.AV50Flag = GXv_int14[0] ;
         Gx_msg = httpContext.getMessage( "Actualizando HISREH ", "") + GXutil.str( AV34BarCod, 8, 0) + "-" + GXutil.str( AV36BarCodReo, 1, 0) + AV35BarCodPar ;
         /*
            INSERT RECORD ON TABLE TXPHISREH

         */
         A4492HreBarCod = AV34BarCod ;
         A4493HreBarReo = AV36BarCodReo ;
         A4494HreBarPar = AV35BarCodPar ;
         A4495HreNumCie = AV61NumCie ;
         A4516HreDisCli = A143BarDisNum ;
         n4516HreDisCli = false ;
         A4517HreBarSer = A212BarSer ;
         n4517HreBarSer = false ;
         A4518HreBarDsc = A1652BarSerDsc ;
         n4518HreBarDsc = false ;
         A4519HreTipArt = A217BarTipArt ;
         n4519HreTipArt = false ;
         A4520HreTipArtD = AV70TipArtDsc ;
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
         A4526HreTipColN = GXutil.substring( AV71TipColDsc, 1, 26) ;
         n4526HreTipColN = false ;
         A4527HreFecGen = A159BarFecGen ;
         n4527HreFecGen = false ;
         A4528HreFecCli = A155BarFecCli ;
         n4528HreFecCli = false ;
         A4529HreFecTin = AV78FechCierre ;
         n4529HreFecTin = false ;
         A4530HreFecFpr = A158BarFecFpr ;
         n4530HreFecFpr = false ;
         if ( A166BarKgm.doubleValue() == 0 )
         {
            A4532HreBarKgm = AV67recTotKgs ;
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
         A4539HreIntCod = AV54IntCod ;
         n4539HreIntCod = false ;
         A4540HreIntDsc = AV55IntDsc ;
         n4540HreIntDsc = false ;
         A4541HreNumTon = A3313BarNumTon ;
         n4541HreNumTon = false ;
         A4496HreMaqHdr = AV58MaqCod ;
         n4496HreMaqHdr = false ;
         if ( AV67recTotKgs.doubleValue() > 0 )
         {
            A4542HreTotKgm = AV67recTotKgs ;
            n4542HreTotKgm = false ;
         }
         else
         {
            A4542HreTotKgm = A812RecTotKgm ;
            n4542HreTotKgm = false ;
         }
         if ( AV68RecTotMts.doubleValue() > 0 )
         {
            A4543HreTotMtr = AV68RecTotMts ;
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
         A8608HreNumColF = AV51ForNumCol ;
         n8608HreNumColF = false ;
         A8610HreFamCodT = AV53HreFamCodt ;
         n8610HreFamCodT = false ;
         A8623HreHilasa = GXutil.substring( AV52Hilasa, 1, 20) ;
         n8623HreHilasa = false ;
         A8624HreEnsayo = AV60NEnsayo ;
         n8624HreEnsayo = false ;
         A8625HreOpa = AV57Lb_opcion ;
         n8625HreOpa = false ;
         A8626HreOpn = AV56Lb_numop ;
         n8626HreOpn = false ;
         A11318HreDispCli = A4812BarEncCli ;
         n11318HreDispCli = false ;
         A11320HreMacCod = A3595BarMacCod ;
         n11320HreMacCod = false ;
         A12264HreNInter = AV66recnumint ;
         n12264HreNInter = false ;
         A12535HreCencId = AV74HreCencId ;
         n12535HreCencId = false ;
         A12536HreCenDsc = AV75HreCenDsc ;
         n12536HreCenDsc = false ;
         AV79HreComp1 = " " ;
         AV80HreComp2 = " " ;
         if ( GXutil.strcmp(A221BarTra1, "") != 0 )
         {
            AV79HreComp1 = A221BarTra1 + GXutil.space( (short)(1)) + GXutil.str( A224BarTraP1, 3, 0) ;
         }
         if ( GXutil.strcmp(A222BarTra2, "") != 0 )
         {
            AV79HreComp1 += A222BarTra2 + GXutil.space( (short)(1)) + GXutil.str( A225BarTraP2, 3, 0) ;
         }
         if ( GXutil.strcmp(A223BarTra3, "") != 0 )
         {
            AV79HreComp1 += A223BarTra3 + GXutil.space( (short)(1)) + GXutil.str( A226BarTraP3, 3, 0) ;
         }
         if ( GXutil.strcmp(A229BarUrd1, " ") != 0 )
         {
            AV80HreComp2 = A229BarUrd1 + GXutil.str( A232BarUrdP1, 3, 0) ;
         }
         if ( GXutil.strcmp(A230BarUrd2, " ") != 0 )
         {
            AV80HreComp2 += A230BarUrd2 + GXutil.str( A233BarUrdP2, 3, 0) ;
         }
         if ( GXutil.strcmp(A231BarUrd3, " ") != 0 )
         {
            AV80HreComp2 += A231BarUrd3 + GXutil.str( A234BarUrdP3, 3, 0) ;
         }
         A13450HreComp1 = GXutil.substring( AV79HreComp1, (int)(DecimalUtil.decToDouble(DecimalUtil.stringToDec("1.21"))), -1) ;
         n13450HreComp1 = false ;
         A13451HreComp2 = GXutil.substring( AV80HreComp2, (int)(DecimalUtil.decToDouble(DecimalUtil.stringToDec("1.21"))), -1) ;
         n13451HreComp2 = false ;
         A13763HreUser = AV81UsurCod ;
         A13764HreDiaHora = GXutil.serverNow( context, remoteHandle, pr_default) ;
         A13765HreCdn2 = AV82HreCdn2 ;
         A13766HreCtw = AV83HreCtw ;
         /* Using cursor P055T7 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Boolean.valueOf(n4496HreMaqHdr), A4496HreMaqHdr, Boolean.valueOf(n4516HreDisCli), A4516HreDisCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n4517HreBarSer), A4517HreBarSer, Boolean.valueOf(n4518HreBarDsc), A4518HreBarDsc, Boolean.valueOf(n4519HreTipArt), Short.valueOf(A4519HreTipArt), Boolean.valueOf(n4520HreTipArtD), A4520HreTipArtD, Boolean.valueOf(n4521HreColNom), A4521HreColNom, Boolean.valueOf(n4522HreColNum), Integer.valueOf(A4522HreColNum), Boolean.valueOf(n4523HreColNomC), A4523HreColNomC, Boolean.valueOf(n4524HreColNumC), Integer.valueOf(A4524HreColNumC), Boolean.valueOf(n4525HreTipCol), Byte.valueOf(A4525HreTipCol), Boolean.valueOf(n4526HreTipColN), A4526HreTipColN, Boolean.valueOf(n4527HreFecGen), A4527HreFecGen, Boolean.valueOf(n4528HreFecCli), A4528HreFecCli, Boolean.valueOf(n4529HreFecTin), A4529HreFecTin, Boolean.valueOf(n4530HreFecFpr), A4530HreFecFpr, Boolean.valueOf(n4531HreBarMat), A4531HreBarMat, Boolean.valueOf(n4532HreBarKgm), A4532HreBarKgm, Boolean.valueOf(n4533HreBarMtr), A4533HreBarMtr, Boolean.valueOf(n4534HreBarPie), Integer.valueOf(A4534HreBarPie), Boolean.valueOf(n4535HrePartCod), A4535HrePartCod, Boolean.valueOf(n4536HreBarNMtr), A4536HreBarNMtr, Boolean.valueOf(n4537HreBarNMez), A4537HreBarNMez, Boolean.valueOf(n4538HreNumTen), A4538HreNumTen, Boolean.valueOf(n4539HreIntCod), Byte.valueOf(A4539HreIntCod), Boolean.valueOf(n4540HreIntDsc), A4540HreIntDsc, Boolean.valueOf(n4541HreNumTon), A4541HreNumTon, Boolean.valueOf(n4542HreTotKgm), A4542HreTotKgm, Boolean.valueOf(n4543HreTotMtr), A4543HreTotMtr, Boolean.valueOf(n4544HreTotPie), Integer.valueOf(A4544HreTotPie), Boolean.valueOf(n8608HreNumColF), Integer.valueOf(A8608HreNumColF), Boolean.valueOf(n8610HreFamCodT), Short.valueOf(A8610HreFamCodT), Boolean.valueOf(n8623HreHilasa), A8623HreHilasa, Boolean.valueOf(n8624HreEnsayo), Integer.valueOf(A8624HreEnsayo), Boolean.valueOf(n8625HreOpa), A8625HreOpa, Boolean.valueOf(n8626HreOpn), Byte.valueOf(A8626HreOpn), Boolean.valueOf(n11318HreDispCli), A11318HreDispCli, Boolean.valueOf(n11320HreMacCod), Integer.valueOf(A11320HreMacCod), Boolean.valueOf(n12264HreNInter), Integer.valueOf(A12264HreNInter), Boolean.valueOf(n12535HreCencId), Short.valueOf(A12535HreCencId), Boolean.valueOf(n12536HreCenDsc), A12536HreCenDsc, Boolean.valueOf(n13450HreComp1), A13450HreComp1, Boolean.valueOf(n13451HreComp2), A13451HreComp2, A13763HreUser, A13764HreDiaHora, A13765HreCdn2, A13766HreCtw});
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
         Gx_msg = httpContext.getMessage( "Actualizando HISREM ", "") + GXutil.str( AV34BarCod, 8, 0) + "-" + GXutil.str( AV36BarCodReo, 1, 0) + AV35BarCodPar ;
         /* Using cursor P055T10 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV65RecLinMaq)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A2804RecLinMaq = P055T10_A2804RecLinMaq[0] ;
            A602MaqCod = P055T10_A602MaqCod[0] ;
            A2805RecVolPrd = P055T10_A2805RecVolPrd[0] ;
            A2806RecFA = P055T10_A2806RecFA[0] ;
            A1272UltLinPro = P055T10_A1272UltLinPro[0] ;
            A4574RecFecPes = P055T10_A4574RecFecPes[0] ;
            A4575RecMaqPes = P055T10_A4575RecMaqPes[0] ;
            A4402RecUsrCod = P055T10_A4402RecUsrCod[0] ;
            A4654RecNroPar = P055T10_A4654RecNroPar[0] ;
            n4654RecNroPar = P055T10_n4654RecNroPar[0] ;
            A4866RecFecAlt = P055T10_A4866RecFecAlt[0] ;
            n4866RecFecAlt = P055T10_n4866RecFecAlt[0] ;
            A4867RecFecMod = P055T10_A4867RecFecMod[0] ;
            n4867RecFecMod = P055T10_n4867RecFecMod[0] ;
            A4868RecUsrMod = P055T10_A4868RecUsrMod[0] ;
            n4868RecUsrMod = P055T10_n4868RecUsrMod[0] ;
            A4261RecTotPrd = P055T10_A4261RecTotPrd[0] ;
            n4261RecTotPrd = P055T10_n4261RecTotPrd[0] ;
            A7764RecMaqNh = P055T10_A7764RecMaqNh[0] ;
            A7765RecMaqVX = P055T10_A7765RecMaqVX[0] ;
            A7766RecMaqBL = P055T10_A7766RecMaqBL[0] ;
            A7767RecMaqFlow = P055T10_A7767RecMaqFlow[0] ;
            A7768RecMaqRPM = P055T10_A7768RecMaqRPM[0] ;
            A7769RecMaqMol = P055T10_A7769RecMaqMol[0] ;
            A7770RecMaqTor = P055T10_A7770RecMaqTor[0] ;
            A7771RecMaqCla = P055T10_A7771RecMaqCla[0] ;
            A7772RecMaqTej = P055T10_A7772RecMaqTej[0] ;
            A7773RecMaqDel = P055T10_A7773RecMaqDel[0] ;
            A7774RecMaqPML = P055T10_A7774RecMaqPML[0] ;
            A5110RecNumPrg = P055T10_A5110RecNumPrg[0] ;
            A189BarNumAny = P055T10_A189BarNumAny[0] ;
            A219BarTotAgr = P055T10_A219BarTotAgr[0] ;
            A166BarKgm = P055T10_A166BarKgm[0] ;
            A870BarTotMtr = P055T10_A870BarTotMtr[0] ;
            A184BarMtr = P055T10_A184BarMtr[0] ;
            A189BarNumAny = P055T10_A189BarNumAny[0] ;
            A219BarTotAgr = P055T10_A219BarTotAgr[0] ;
            A870BarTotMtr = P055T10_A870BarTotMtr[0] ;
            A166BarKgm = P055T10_A166BarKgm[0] ;
            A184BarMtr = P055T10_A184BarMtr[0] ;
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
            A4492HreBarCod = AV34BarCod ;
            A4493HreBarReo = AV36BarCodReo ;
            A4494HreBarPar = AV35BarCodPar ;
            A4495HreNumCie = AV61NumCie ;
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
            A4963HreFasCod = AV76HreFascod ;
            n4963HreFasCod = false ;
            A4964HreOrdLin = AV77hreordlin ;
            n4964HreOrdLin = false ;
            A4965HreNroPar = A4654RecNroPar ;
            n4965HreNroPar = false ;
            A4960HreFecAlt = A4866RecFecAlt ;
            n4960HreFecAlt = false ;
            A4962HreFecMod = A4867RecFecMod ;
            n4962HreFecMod = false ;
            A4961HreUsrMod = A4868RecUsrMod ;
            n4961HreUsrMod = false ;
            A4968HreTotKgs = ((AV67recTotKgs.doubleValue()>0) ? AV67recTotKgs : A812RecTotKgm) ;
            n4968HreTotKgs = false ;
            A4969HreTotMts = ((AV68RecTotMts.doubleValue()>0) ? AV68RecTotMts : A871RecTotMtr) ;
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
            A8602HreCosAA = AV39Barcosaa ;
            n8602HreCosAA = false ;
            A8603HrecosAd = AV40Barcosad ;
            n8603HrecosAd = false ;
            A8604HreCosAnc = AV41barcosanc ;
            n8604HreCosAnc = false ;
            A8605HreCosCol = AV42barcoscol ;
            n8605HreCosCol = false ;
            A8606HreCosPA = AV43Barcospa ;
            n8606HreCosPA = false ;
            A8607HreCosPD = AV44Barcospd ;
            n8607HreCosPD = false ;
            A1094HreNPrg = A5110RecNumPrg ;
            n1094HreNPrg = false ;
            A697HreLotF = AV45BarGirar ;
            n697HreLotF = false ;
            A10102HreNumInt = AV66recnumint ;
            n10102HreNumInt = false ;
            A10103HreDti = AV72Hredti ;
            n10103HreDti = false ;
            A10104HreDtf = AV73HreDtf ;
            n10104HreDtf = false ;
            A11321HreUltObs = AV69RecUltObs ;
            A5978HreNumRmt = A189BarNumAny ;
            n5978HreNumRmt = false ;
            /* Using cursor P055T11 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Boolean.valueOf(n4546HreMaqCod), A4546HreMaqCod, Boolean.valueOf(n4547HreVolPrd), Integer.valueOf(A4547HreVolPrd), Boolean.valueOf(n4548HreFacAbs), A4548HreFacAbs, Boolean.valueOf(n4549HreULinPro), Byte.valueOf(A4549HreULinPro), Boolean.valueOf(n4584HreFecPes), A4584HreFecPes, Boolean.valueOf(n4585HreMaqPes), Byte.valueOf(A4585HreMaqPes), Boolean.valueOf(n4863HreUsrCod), A4863HreUsrCod, Boolean.valueOf(n4960HreFecAlt), A4960HreFecAlt, Boolean.valueOf(n4961HreUsrMod), A4961HreUsrMod, Boolean.valueOf(n4962HreFecMod), A4962HreFecMod, Boolean.valueOf(n4963HreFasCod), A4963HreFasCod, Boolean.valueOf(n4964HreOrdLin), Short.valueOf(A4964HreOrdLin), Boolean.valueOf(n4965HreNroPar), Integer.valueOf(A4965HreNroPar), Boolean.valueOf(n4968HreTotKgs), A4968HreTotKgs, Boolean.valueOf(n4969HreTotMts), A4969HreTotMts, Boolean.valueOf(n4970HreTotPrd), Integer.valueOf(A4970HreTotPrd), Boolean.valueOf(n5978HreNumRmt), Integer.valueOf(A5978HreNumRmt), Boolean.valueOf(n7814HReMaqNh), Short.valueOf(A7814HReMaqNh), Boolean.valueOf(n7815HReMaqVX), Byte.valueOf(A7815HReMaqVX), Boolean.valueOf(n7816HReMaqBL), Byte.valueOf(A7816HReMaqBL), Boolean.valueOf(n7817HReMaqFlow), Byte.valueOf(A7817HReMaqFlow), Boolean.valueOf(n7818HReMaqRPM), Short.valueOf(A7818HReMaqRPM), Boolean.valueOf(n7819HReMaqMol), Short.valueOf(A7819HReMaqMol), Boolean.valueOf(n7820HReMaqTor), Short.valueOf(A7820HReMaqTor), Boolean.valueOf(n7821HReMaqCla), A7821HReMaqCla, Boolean.valueOf(n7822HReMaqTej), Byte.valueOf(A7822HReMaqTej), Boolean.valueOf(n7823HReMaqDel), Byte.valueOf(A7823HReMaqDel), Boolean.valueOf(n7824HReMaqPML), Short.valueOf(A7824HReMaqPML), Boolean.valueOf(n8602HreCosAA), A8602HreCosAA, Boolean.valueOf(n8603HrecosAd), A8603HrecosAd, Boolean.valueOf(n8604HreCosAnc), A8604HreCosAnc, Boolean.valueOf(n8605HreCosCol), A8605HreCosCol, Boolean.valueOf(n8606HreCosPA), A8606HreCosPA, Boolean.valueOf(n8607HreCosPD), A8607HreCosPD, Boolean.valueOf(n1094HreNPrg), A1094HreNPrg, Boolean.valueOf(n697HreLotF), A697HreLotF, Boolean.valueOf(n10102HreNumInt), Integer.valueOf(A10102HreNumInt), Boolean.valueOf(n10103HreDti), A10103HreDti, Boolean.valueOf(n10104HreDtf), A10104HreDtf, Short.valueOf(A11321HreUltObs)});
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
            Gx_msg = httpContext.getMessage( "Actualizando HISREC ", "") + GXutil.str( AV34BarCod, 8, 0) + "-" + GXutil.str( AV36BarCodReo, 1, 0) + AV35BarCodPar ;
            /* Using cursor P055T12 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A1273RecLinPro = P055T12_A1273RecLinPro[0] ;
               A764ProForCod = P055T12_A764ProForCod[0] ;
               A766ProForDsc = P055T12_A766ProForDsc[0] ;
               A771ProForTie = P055T12_A771ProForTie[0] ;
               A772ProForTmx = P055T12_A772ProForTmx[0] ;
               A4697RecNroPrg = P055T12_A4697RecNroPrg[0] ;
               A1251RecNumRec = P055T12_A1251RecNumRec[0] ;
               A4695RecVolPrf = P055T12_A4695RecVolPrf[0] ;
               A10544RecNH2O = P055T12_A10544RecNH2O[0] ;
               A766ProForDsc = P055T12_A766ProForDsc[0] ;
               A771ProForTie = P055T12_A771ProForTie[0] ;
               A772ProForTmx = P055T12_A772ProForTmx[0] ;
               /*
                  INSERT RECORD ON TABLE TXPHISREC

               */
               A4492HreBarCod = AV34BarCod ;
               A4493HreBarReo = AV36BarCodReo ;
               A4494HreBarPar = AV35BarCodPar ;
               A4495HreNumCie = AV61NumCie ;
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
               /* Using cursor P055T13 */
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
               Gx_msg = httpContext.getMessage( "Actualizando HISREL ", "") + GXutil.str( AV34BarCod, 8, 0) + "-" + GXutil.str( AV36BarCodReo, 1, 0) + AV35BarCodPar ;
               /* Using cursor P055T14 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A811RecLin = P055T14_A811RecLin[0] ;
                  A872RecPrdNum = P055T14_A872RecPrdNum[0] ;
                  A875RecPrdDsc = P055T14_A875RecPrdDsc[0] ;
                  A490ForPrdUMe = P055T14_A490ForPrdUMe[0] ;
                  n490ForPrdUMe = P055T14_n490ForPrdUMe[0] ;
                  A488ForPrdDsc = P055T14_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P055T14_n488ForPrdDsc[0] ;
                  A431FacCon = P055T14_A431FacCon[0] ;
                  A686PrdCant = P055T14_A686PrdCant[0] ;
                  A683PrdCanFin = P055T14_A683PrdCanFin[0] ;
                  A1797PrdCanAny = P055T14_A1797PrdCanAny[0] ;
                  A2394RecForNro = P055T14_A2394RecForNro[0] ;
                  A3274RecPrdTnq = P055T14_A3274RecPrdTnq[0] ;
                  A3804RecFecMov = P055T14_A3804RecFecMov[0] ;
                  A3805RecAnyTie = P055T14_A3805RecAnyTie[0] ;
                  A3806RecUltAny = P055T14_A3806RecUltAny[0] ;
                  A3807RecPorAny = P055T14_A3807RecPorAny[0] ;
                  A3938RecCanEns = P055T14_A3938RecCanEns[0] ;
                  A4024RecMar = P055T14_A4024RecMar[0] ;
                  A4576RecLinUsr = P055T14_A4576RecLinUsr[0] ;
                  A4577RecPesFec = P055T14_A4577RecPesFec[0] ;
                  A724PrdPreAct = P055T14_A724PrdPreAct[0] ;
                  A5725RecLote = P055T14_A5725RecLote[0] ;
                  A11708RecProv = P055T14_A11708RecProv[0] ;
                  A12641RecPrdDc2 = P055T14_A12641RecPrdDc2[0] ;
                  A12717RecFabId = P055T14_A12717RecFabId[0] ;
                  A13938RecLoteFch = P055T14_A13938RecLoteFch[0] ;
                  A13937RecLotAlm = P055T14_A13937RecLotAlm[0] ;
                  A719PrdNum = P055T14_A719PrdNum[0] ;
                  n719PrdNum = P055T14_n719PrdNum[0] ;
                  A724PrdPreAct = P055T14_A724PrdPreAct[0] ;
                  A488ForPrdDsc = P055T14_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P055T14_n488ForPrdDsc[0] ;
                  /*
                     INSERT RECORD ON TABLE TXPHISLRE

                  */
                  A4492HreBarCod = AV34BarCod ;
                  A4493HreBarReo = AV36BarCodReo ;
                  A4494HreBarPar = AV35BarCodPar ;
                  A4495HreNumCie = AV61NumCie ;
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
                  A12453HreFecAct = AV78FechCierre ;
                  n12453HreFecAct = false ;
                  A12642HrePrdDc2 = A12641RecPrdDc2 ;
                  n12642HrePrdDc2 = false ;
                  A12718HreFabId = A12717RecFabId ;
                  n12718HreFabId = false ;
                  A13942HreLoteFch = A13938RecLoteFch ;
                  A13943HreLotAlm = A13937RecLotAlm ;
                  /* Using cursor P055T15 */
                  pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A4557HreRecLin), Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n4558HrePrdNum), A4558HrePrdNum, Boolean.valueOf(n4559HrePrdDsc), A4559HrePrdDsc, Boolean.valueOf(n4560HrePrdUMe), Byte.valueOf(A4560HrePrdUMe), Boolean.valueOf(n4561HrePrdUDs), A4561HrePrdUDs, Boolean.valueOf(n4562HreFacCon), A4562HreFacCon, Boolean.valueOf(n4563HrePrdCant), A4563HrePrdCant, Boolean.valueOf(n4564HreCanFin), A4564HreCanFin, Boolean.valueOf(n4565HreCanAny), A4565HreCanAny, Boolean.valueOf(n4566HreForNro), Byte.valueOf(A4566HreForNro), Boolean.valueOf(n4567HrePrdTnq), Byte.valueOf(A4567HrePrdTnq), Boolean.valueOf(n4568HreFecMov), A4568HreFecMov, Boolean.valueOf(n4569HreAnyTie), Short.valueOf(A4569HreAnyTie), Boolean.valueOf(n4570HreUltAny), A4570HreUltAny, Boolean.valueOf(n4571HrePorAny), A4571HrePorAny, Boolean.valueOf(n4572HreCanEns), A4572HreCanEns, Boolean.valueOf(n4573HreRecMar), Byte.valueOf(A4573HreRecMar), Boolean.valueOf(n4582HreLinUsr), A4582HreLinUsr, Boolean.valueOf(n4583HrePesFec), A4583HrePesFec, Boolean.valueOf(n4967HrePrePrd), A4967HrePrePrd, Boolean.valueOf(n5726HreLote), A5726HreLote, Boolean.valueOf(n11707HreProv), Integer.valueOf(A11707HreProv), Boolean.valueOf(n12453HreFecAct), A12453HreFecAct, Boolean.valueOf(n12642HrePrdDc2), A12642HrePrdDc2, Boolean.valueOf(n12718HreFabId), Integer.valueOf(A12718HreFabId), A13942HreLoteFch, Short.valueOf(A13943HreLotAlm)});
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
            Gx_msg = httpContext.getMessage( "Actualizando HISOBS ", "") + GXutil.str( AV34BarCod, 8, 0) + "-" + GXutil.str( AV36BarCodReo, 1, 0) + AV35BarCodPar ;
            /* Using cursor P055T16 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(10) != 101) )
            {
               A5257RecLinObs = P055T16_A5257RecLinObs[0] ;
               A5258RecTxtObs = P055T16_A5258RecTxtObs[0] ;
               n5258RecTxtObs = P055T16_n5258RecTxtObs[0] ;
               /*
                  INSERT RECORD ON TABLE TXPHISOBS

               */
               A4492HreBarCod = AV34BarCod ;
               A4493HreBarReo = AV36BarCodReo ;
               A4494HreBarPar = AV35BarCodPar ;
               A4495HreNumCie = AV61NumCie ;
               A4545HreLinMaq = A2804RecLinMaq ;
               A11322HreLinObs = A5257RecLinObs ;
               A11323HreTxtObs = A5258RecTxtObs ;
               n11323HreTxtObs = false ;
               /* Using cursor P055T17 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Short.valueOf(A11322HreLinObs), Boolean.valueOf(n11323HreTxtObs), A11323HreTxtObs});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISOBS");
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
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      Gx_msg = httpContext.getMessage( "Actualizando HISREA ", "") + GXutil.str( AV34BarCod, 8, 0) + "-" + GXutil.str( AV36BarCodReo, 1, 0) + AV35BarCodPar ;
      /* Using cursor P055T18 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV65RecLinMaq)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A2808RecLinMAL = P055T18_A2808RecLinMAL[0] ;
         A1377RecNumAny = P055T18_A1377RecNumAny[0] ;
         A718PrdNom = P055T18_A718PrdNom[0] ;
         A1378PrdCFin = P055T18_A1378PrdCFin[0] ;
         n1378PrdCFin = P055T18_n1378PrdCFin[0] ;
         A3380LanyPrd = P055T18_A3380LanyPrd[0] ;
         n3380LanyPrd = P055T18_n3380LanyPrd[0] ;
         A3381LanyCan = P055T18_A3381LanyCan[0] ;
         n3381LanyCan = P055T18_n3381LanyCan[0] ;
         A3382LanyNro = P055T18_A3382LanyNro[0] ;
         n3382LanyNro = P055T18_n3382LanyNro[0] ;
         A3383LanyTnq = P055T18_A3383LanyTnq[0] ;
         n3383LanyTnq = P055T18_n3383LanyTnq[0] ;
         A4578LanyUsr = P055T18_A4578LanyUsr[0] ;
         n4578LanyUsr = P055T18_n4578LanyUsr[0] ;
         A4579LanyFec = P055T18_A4579LanyFec[0] ;
         n4579LanyFec = P055T18_n4579LanyFec[0] ;
         A5807LanyLote = P055T18_A5807LanyLote[0] ;
         n5807LanyLote = P055T18_n5807LanyLote[0] ;
         A12705LanyCtd = P055T18_A12705LanyCtd[0] ;
         n12705LanyCtd = P055T18_n12705LanyCtd[0] ;
         A12706LanyUnd = P055T18_A12706LanyUnd[0] ;
         n12706LanyUnd = P055T18_n12706LanyUnd[0] ;
         A13939LanyLoteFc = P055T18_A13939LanyLoteFc[0] ;
         A719PrdNum = P055T18_A719PrdNum[0] ;
         n719PrdNum = P055T18_n719PrdNum[0] ;
         A718PrdNom = P055T18_A718PrdNom[0] ;
         /*
            INSERT RECORD ON TABLE TXPHISREA

         */
         A4492HreBarCod = AV34BarCod ;
         A4493HreBarReo = AV36BarCodReo ;
         A4494HreBarPar = AV35BarCodPar ;
         A4495HreNumCie = AV61NumCie ;
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
         A12708HreLanyCtd = A12705LanyCtd ;
         n12708HreLanyCtd = false ;
         A12707HreLanyUnd = A12706LanyUnd ;
         n12707HreLanyUnd = false ;
         A13940HreLanyLtF = A13939LanyLoteFc ;
         /* Using cursor P055T19 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4508HreLinMAL), Byte.valueOf(A4509HreNumAny), Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n4510HrdPrdDsc), A4510HrdPrdDsc, Boolean.valueOf(n4511HrePrdCFin), A4511HrePrdCFin, Boolean.valueOf(n4512HreLanyPrd), A4512HreLanyPrd, Boolean.valueOf(n4513HreLanyCan), A4513HreLanyCan, Boolean.valueOf(n4514HreLanyNro), Byte.valueOf(A4514HreLanyNro), Boolean.valueOf(n4515HreLanyTnq), Byte.valueOf(A4515HreLanyTnq), Boolean.valueOf(n4580HreLanyUsr), A4580HreLanyUsr, Boolean.valueOf(n4581HreLanyFec), A4581HreLanyFec, Boolean.valueOf(n5808HreLanyLot), A5808HreLanyLot, Boolean.valueOf(n12708HreLanyCtd), A12708HreLanyCtd, Boolean.valueOf(n12707HreLanyUnd), A12707HreLanyUnd, A13940HreLanyLtF});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREA");
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
      if ( GXutil.strcmp(AV64recacab, httpContext.getMessage( "S", "")) != 0 )
      {
         Gx_msg = httpContext.getMessage( "Actualizando HISREA ", "") + GXutil.str( AV34BarCod, 8, 0) + "-" + GXutil.str( AV36BarCodReo, 1, 0) + AV35BarCodPar ;
         /* Using cursor P055T20 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A119BarAgrCod = P055T20_A119BarAgrCod[0] ;
            A124BarAgrReo = P055T20_A124BarAgrReo[0] ;
            A122BarAgrPar = P055T20_A122BarAgrPar[0] ;
            A590KgmAgr = P055T20_A590KgmAgr[0] ;
            A869MtrAgr = P055T20_A869MtrAgr[0] ;
            A671PieAgr = P055T20_A671PieAgr[0] ;
            A1508CliCodAgr = P055T20_A1508CliCodAgr[0] ;
            GXv_char11[0] = A396EmprCod ;
            GXv_int13[0] = A119BarAgrCod ;
            GXv_int14[0] = A124BarAgrReo ;
            GXv_char10[0] = A122BarAgrPar ;
            GXv_decimal15[0] = AV88BarKgmAgr ;
            GXv_decimal16[0] = AV89BarMtrAgr ;
            GXv_int12[0] = AV90BarPieagr ;
            GXv_char6[0] = AV84BarAgrSer ;
            GXv_char4[0] = AV86Barcolnomagr ;
            GXv_int7[0] = AV87BarcolnumAgr ;
            GXv_int9[0] = (byte)(0) ;
            GXv_char2[0] = "" ;
            GXv_date17[0] = AV91fec ;
            GXv_int8[0] = (byte)(0) ;
            GXv_char18[0] = "" ;
            GXv_char19[0] = "" ;
            GXv_int5[0] = 0 ;
            GXv_date20[0] = AV91fec ;
            GXv_char21[0] = "" ;
            GXv_char22[0] = AV85barserdscAgr ;
            GXv_int23[0] = 0 ;
            GXv_date24[0] = AV91fec ;
            GXv_char25[0] = "" ;
            GXv_int3[0] = (short)(0) ;
            GXv_int26[0] = AV92DiscodAgr ;
            new app.pinfagrmas(remoteHandle, context).execute( GXv_char11, GXv_int13, GXv_int14, GXv_char10, GXv_decimal15, GXv_decimal16, GXv_int12, GXv_char6, GXv_char4, GXv_int7, GXv_int9, GXv_char2, GXv_date17, GXv_int8, GXv_char18, GXv_char19, GXv_int5, GXv_date20, GXv_char21, GXv_char22, GXv_int23, GXv_date24, GXv_char25, GXv_int3, GXv_int26) ;
            pcls010.this.A396EmprCod = GXv_char11[0] ;
            pcls010.this.A119BarAgrCod = GXv_int13[0] ;
            pcls010.this.A124BarAgrReo = GXv_int14[0] ;
            pcls010.this.A122BarAgrPar = GXv_char10[0] ;
            pcls010.this.AV88BarKgmAgr = GXv_decimal15[0] ;
            pcls010.this.AV89BarMtrAgr = GXv_decimal16[0] ;
            pcls010.this.AV90BarPieagr = (short)((short)(GXv_int12[0])) ;
            pcls010.this.AV84BarAgrSer = GXv_char6[0] ;
            pcls010.this.AV86Barcolnomagr = GXv_char4[0] ;
            pcls010.this.AV87BarcolnumAgr = GXv_int7[0] ;
            pcls010.this.AV91fec = GXv_date17[0] ;
            pcls010.this.AV91fec = GXv_date20[0] ;
            pcls010.this.AV85barserdscAgr = GXv_char22[0] ;
            pcls010.this.AV91fec = GXv_date24[0] ;
            pcls010.this.AV92DiscodAgr = GXv_int26[0] ;
            /*
               INSERT RECORD ON TABLE TXPHISRAG

            */
            A4492HreBarCod = AV34BarCod ;
            A4493HreBarReo = AV36BarCodReo ;
            A4494HreBarPar = AV35BarCodPar ;
            A4495HreNumCie = AV61NumCie ;
            A4497HreAgrCod = A119BarAgrCod ;
            A4498HreAgrReo = A124BarAgrReo ;
            A4499HreAgrPar = A122BarAgrPar ;
            A4500HreAgrKgm = A590KgmAgr ;
            A4501HreAgrMtr = A869MtrAgr ;
            A4502HreAgrPie = A671PieAgr ;
            A4503HreAgrCli = A1508CliCodAgr ;
            A4504HreAgrSer = AV84BarAgrSer ;
            A4505HreAgrDsc = AV85barserdscAgr ;
            A4506HreAgrCol = AV86Barcolnomagr ;
            A4507HreAgrNumC = AV87BarcolnumAgr ;
            /* Using cursor P055T21 */
            pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4498HreAgrReo), A4499HreAgrPar, A4500HreAgrKgm, A4501HreAgrMtr, Short.valueOf(A4502HreAgrPie), Integer.valueOf(A4503HreAgrCli), A4504HreAgrSer, A4505HreAgrDsc, A4506HreAgrCol, Integer.valueOf(A4507HreAgrNumC)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISRAG");
            if ( (pr_default.getStatus(15) == 1) )
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
            /* Using cursor P055T22 */
            pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(AV92DiscodAgr)});
            while ( (pr_default.getStatus(16) != 101) )
            {
               A13213DisNormID = P055T22_A13213DisNormID[0] ;
               A13216DisNormDsc = P055T22_A13216DisNormDsc[0] ;
               n13216DisNormDsc = P055T22_n13216DisNormDsc[0] ;
               A13214DisNormSt = P055T22_A13214DisNormSt[0] ;
               A13215DisNormNC = P055T22_A13215DisNormNC[0] ;
               A361DisCod = P055T22_A361DisCod[0] ;
               A13216DisNormDsc = P055T22_A13216DisNormDsc[0] ;
               n13216DisNormDsc = P055T22_n13216DisNormDsc[0] ;
               /*
                  INSERT RECORD ON TABLE TXPHISRA1

               */
               A4492HreBarCod = AV34BarCod ;
               A4493HreBarReo = AV36BarCodReo ;
               A4494HreBarPar = AV35BarCodPar ;
               A4495HreNumCie = AV61NumCie ;
               A4497HreAgrCod = A119BarAgrCod ;
               A4498HreAgrReo = A124BarAgrReo ;
               A4499HreAgrPar = A122BarAgrPar ;
               A14081HreAgrNmId = A13213DisNormID ;
               A14082HreAgrNmDc = A13216DisNormDsc ;
               A14083HreAgrNmSt = A13214DisNormSt ;
               A14084HreAgrNmNc = A13215DisNormNC ;
               /* Using cursor P055T23 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4498HreAgrReo), A4499HreAgrPar, A14081HreAgrNmId, A14082HreAgrNmDc, A14083HreAgrNmSt, A14084HreAgrNmNc});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISRA1");
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
            /* Using cursor P055T24 */
            pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(AV92DiscodAgr)});
            while ( (pr_default.getStatus(18) != 101) )
            {
               A13376DisTraID = P055T24_A13376DisTraID[0] ;
               A13375DisTraDsc = P055T24_A13375DisTraDsc[0] ;
               n13375DisTraDsc = P055T24_n13375DisTraDsc[0] ;
               A361DisCod = P055T24_A361DisCod[0] ;
               A13375DisTraDsc = P055T24_A13375DisTraDsc[0] ;
               n13375DisTraDsc = P055T24_n13375DisTraDsc[0] ;
               /*
                  INSERT RECORD ON TABLE TXPHISRA2

               */
               A4492HreBarCod = AV34BarCod ;
               A4493HreBarReo = AV36BarCodReo ;
               A4494HreBarPar = AV35BarCodPar ;
               A4495HreNumCie = AV61NumCie ;
               A4497HreAgrCod = A119BarAgrCod ;
               A4498HreAgrReo = A124BarAgrReo ;
               A4499HreAgrPar = A122BarAgrPar ;
               A14085HreAgrTraI = A13376DisTraID ;
               A14086HreAgrTraD = A13375DisTraDsc ;
               /* Using cursor P055T25 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Integer.valueOf(A4497HreAgrCod), Byte.valueOf(A4498HreAgrReo), A4499HreAgrPar, A14085HreAgrTraI, A14086HreAgrTraD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISRA2");
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
            pr_default.readNext(14);
         }
         pr_default.close(14);
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'NUMCIE' Routine */
      returnInSub = false ;
      AV61NumCie = (byte)(0) ;
      /* Using cursor P055T26 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(AV34BarCod), Byte.valueOf(AV36BarCodReo), AV35BarCodPar});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A4492HreBarCod = P055T26_A4492HreBarCod[0] ;
         A4493HreBarReo = P055T26_A4493HreBarReo[0] ;
         A4494HreBarPar = P055T26_A4494HreBarPar[0] ;
         A4495HreNumCie = P055T26_A4495HreNumCie[0] ;
         AV61NumCie = A4495HreNumCie ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(20);
      }
      pr_default.close(20);
      AV61NumCie = (byte)(AV61NumCie+1) ;
   }

   public void S121( )
   {
      /* 'TIPCOL' Routine */
      returnInSub = false ;
      AV71TipColDsc = "" ;
      /* Using cursor P055T27 */
      pr_default.execute(21, new Object[] {A396EmprCod, Byte.valueOf(AV48BarTipCol)});
      while ( (pr_default.getStatus(21) != 101) )
      {
         A831TipColCod = P055T27_A831TipColCod[0] ;
         A832TipColDsc = P055T27_A832TipColDsc[0] ;
         n832TipColDsc = P055T27_n832TipColDsc[0] ;
         AV71TipColDsc = A832TipColDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(21);
   }

   public void S131( )
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV70TipArtDsc = "" ;
      /* Using cursor P055T28 */
      pr_default.execute(22, new Object[] {A396EmprCod, Short.valueOf(AV47BarTipArt)});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A829TipArtCod = P055T28_A829TipArtCod[0] ;
         A830TipArtDsc = P055T28_A830TipArtDsc[0] ;
         n830TipArtDsc = P055T28_n830TipArtDsc[0] ;
         AV70TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(22);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcls010.this.A396EmprCod;
      this.aP1[0] = pcls010.this.A129BarCod;
      this.aP2[0] = pcls010.this.A132BarCodReo;
      this.aP3[0] = pcls010.this.A130BarCodPar;
      this.aP4[0] = pcls010.this.AV65RecLinMaq;
      this.aP5[0] = pcls010.this.AV44Barcospd;
      this.aP6[0] = pcls010.this.AV40Barcosad;
      this.aP7[0] = pcls010.this.AV39Barcosaa;
      this.aP8[0] = pcls010.this.AV43Barcospa;
      this.aP9[0] = pcls010.this.AV42barcoscol;
      this.aP10[0] = pcls010.this.AV41barcosanc;
      this.aP11[0] = pcls010.this.AV78FechCierre;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV67recTotKgs = DecimalUtil.ZERO ;
      AV68RecTotMts = DecimalUtil.ZERO ;
      AV64recacab = "" ;
      AV58MaqCod = "" ;
      AV72Hredti = GXutil.resetTime( GXutil.nullDate() );
      AV73HreDtf = GXutil.resetTime( GXutil.nullDate() );
      AV76HreFascod = "" ;
      scmdbuf = "" ;
      P055T2_A396EmprCod = new String[] {""} ;
      P055T2_A129BarCod = new int[1] ;
      P055T2_A132BarCodReo = new byte[1] ;
      P055T2_A130BarCodPar = new String[] {""} ;
      P055T2_A2804RecLinMaq = new short[1] ;
      P055T2_A602MaqCod = new String[] {""} ;
      P055T2_A6039RecAcab = new String[] {""} ;
      P055T2_n6039RecAcab = new boolean[] {false} ;
      P055T2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T2_A4260RecTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T2_n4260RecTotMts = new boolean[] {false} ;
      P055T2_A5109RecNumInt = new int[1] ;
      P055T2_A5256RecUltObs = new short[1] ;
      P055T2_n5256RecUltObs = new boolean[] {false} ;
      P055T2_A4258RecMaqFas = new String[] {""} ;
      P055T2_n4258RecMaqFas = new boolean[] {false} ;
      P055T2_A4268RecOrdLin = new short[1] ;
      P055T2_n4268RecOrdLin = new boolean[] {false} ;
      A602MaqCod = "" ;
      A6039RecAcab = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4260RecTotMts = DecimalUtil.ZERO ;
      A4258RecMaqFas = "" ;
      P055T3_A396EmprCod = new String[] {""} ;
      P055T3_A129BarCod = new int[1] ;
      P055T3_A132BarCodReo = new byte[1] ;
      P055T3_A130BarCodPar = new String[] {""} ;
      P055T3_A150BarFacTin = new String[] {""} ;
      P055T3_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P055T3_n4442BarFasDTI = new boolean[] {false} ;
      P055T3_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P055T3_n4443BarFasDTF = new boolean[] {false} ;
      P055T3_A457FasCod = new String[] {""} ;
      P055T3_A194BarOrdLin = new short[1] ;
      P055T3_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A457FasCod = "" ;
      A758ProCod = "" ;
      P055T6_A361DisCod = new int[1] ;
      P055T6_A396EmprCod = new String[] {""} ;
      P055T6_A129BarCod = new int[1] ;
      P055T6_A132BarCodReo = new byte[1] ;
      P055T6_A130BarCodPar = new String[] {""} ;
      P055T6_A143BarDisNum = new String[] {""} ;
      P055T6_A212BarSer = new String[] {""} ;
      P055T6_A1652BarSerDsc = new String[] {""} ;
      P055T6_A217BarTipArt = new short[1] ;
      P055T6_n217BarTipArt = new boolean[] {false} ;
      P055T6_A135BarColNom = new String[] {""} ;
      P055T6_A136BarColNum = new int[1] ;
      P055T6_A1234BarNomCli = new String[] {""} ;
      P055T6_A1235BarNumCli = new int[1] ;
      P055T6_A218BarTipCol = new byte[1] ;
      P055T6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P055T6_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P055T6_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P055T6_A182BarMat = new String[] {""} ;
      P055T6_A966PartCod = new String[] {""} ;
      P055T6_n966PartCod = new boolean[] {false} ;
      P055T6_A1500BarNMtr = new String[] {""} ;
      P055T6_A1499BarNMez = new String[] {""} ;
      P055T6_A1878BarNumTen = new String[] {""} ;
      P055T6_A3313BarNumTon = new String[] {""} ;
      P055T6_A4812BarEncCli = new String[] {""} ;
      P055T6_A3595BarMacCod = new int[1] ;
      P055T6_A221BarTra1 = new String[] {""} ;
      P055T6_A224BarTraP1 = new short[1] ;
      P055T6_A222BarTra2 = new String[] {""} ;
      P055T6_A225BarTraP2 = new short[1] ;
      P055T6_A223BarTra3 = new String[] {""} ;
      P055T6_A226BarTraP3 = new short[1] ;
      P055T6_A229BarUrd1 = new String[] {""} ;
      P055T6_A232BarUrdP1 = new short[1] ;
      P055T6_A230BarUrd2 = new String[] {""} ;
      P055T6_A233BarUrdP2 = new short[1] ;
      P055T6_A231BarUrd3 = new String[] {""} ;
      P055T6_A234BarUrdP3 = new short[1] ;
      P055T6_A252CliCod = new int[1] ;
      P055T6_n252CliCod = new boolean[] {false} ;
      P055T6_A2452BarCal = new String[] {""} ;
      P055T6_n2452BarCal = new boolean[] {false} ;
      P055T6_A4466BarAcaAnh = new short[1] ;
      P055T6_A2829BarProPer = new String[] {""} ;
      P055T6_A220BarTotPie = new int[1] ;
      P055T6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T6_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T6_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T6_A199BarPie1 = new short[1] ;
      P055T6_A365DisDes = new String[] {""} ;
      P055T6_A898BarPieNDes = new int[1] ;
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
      AV46BarSer = "" ;
      AV37BarColNom = "" ;
      AV35BarCodPar = "" ;
      AV45BarGirar = "" ;
      AV75HreCenDsc = "" ;
      GXt_char1 = "" ;
      AV82HreCdn2 = "" ;
      AV83HreCtw = "" ;
      AV55IntDsc = "" ;
      AV52Hilasa = "" ;
      AV57Lb_opcion = "" ;
      Gx_msg = "" ;
      A4494HreBarPar = "" ;
      A4516HreDisCli = "" ;
      A4517HreBarSer = "" ;
      A4518HreBarDsc = "" ;
      A4520HreTipArtD = "" ;
      AV70TipArtDsc = "" ;
      A4521HreColNom = "" ;
      A4523HreColNomC = "" ;
      A4526HreTipColN = "" ;
      AV71TipColDsc = "" ;
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
      A8623HreHilasa = "" ;
      A8625HreOpa = "" ;
      A11318HreDispCli = "" ;
      A12536HreCenDsc = "" ;
      AV79HreComp1 = "" ;
      AV80HreComp2 = "" ;
      A13450HreComp1 = "" ;
      A13451HreComp2 = "" ;
      A13763HreUser = "" ;
      AV81UsurCod = "" ;
      A13764HreDiaHora = GXutil.resetTime( GXutil.nullDate() );
      A13765HreCdn2 = "" ;
      A13766HreCtw = "" ;
      Gx_emsg = "" ;
      P055T10_A396EmprCod = new String[] {""} ;
      P055T10_A129BarCod = new int[1] ;
      P055T10_A132BarCodReo = new byte[1] ;
      P055T10_A130BarCodPar = new String[] {""} ;
      P055T10_A2804RecLinMaq = new short[1] ;
      P055T10_A602MaqCod = new String[] {""} ;
      P055T10_A2805RecVolPrd = new int[1] ;
      P055T10_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T10_A1272UltLinPro = new byte[1] ;
      P055T10_A4574RecFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      P055T10_A4575RecMaqPes = new byte[1] ;
      P055T10_A4402RecUsrCod = new String[] {""} ;
      P055T10_A4654RecNroPar = new int[1] ;
      P055T10_n4654RecNroPar = new boolean[] {false} ;
      P055T10_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P055T10_n4866RecFecAlt = new boolean[] {false} ;
      P055T10_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P055T10_n4867RecFecMod = new boolean[] {false} ;
      P055T10_A4868RecUsrMod = new String[] {""} ;
      P055T10_n4868RecUsrMod = new boolean[] {false} ;
      P055T10_A4261RecTotPrd = new int[1] ;
      P055T10_n4261RecTotPrd = new boolean[] {false} ;
      P055T10_A7764RecMaqNh = new short[1] ;
      P055T10_A7765RecMaqVX = new byte[1] ;
      P055T10_A7766RecMaqBL = new byte[1] ;
      P055T10_A7767RecMaqFlow = new byte[1] ;
      P055T10_A7768RecMaqRPM = new short[1] ;
      P055T10_A7769RecMaqMol = new short[1] ;
      P055T10_A7770RecMaqTor = new short[1] ;
      P055T10_A7771RecMaqCla = new String[] {""} ;
      P055T10_A7772RecMaqTej = new byte[1] ;
      P055T10_A7773RecMaqDel = new byte[1] ;
      P055T10_A7774RecMaqPML = new short[1] ;
      P055T10_A5110RecNumPrg = new String[] {""} ;
      P055T10_A189BarNumAny = new short[1] ;
      P055T10_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T10_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T10_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T10_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2806RecFA = DecimalUtil.ZERO ;
      A4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      A4402RecUsrCod = "" ;
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
      P055T12_A396EmprCod = new String[] {""} ;
      P055T12_A129BarCod = new int[1] ;
      P055T12_A132BarCodReo = new byte[1] ;
      P055T12_A130BarCodPar = new String[] {""} ;
      P055T12_A2804RecLinMaq = new short[1] ;
      P055T12_A1273RecLinPro = new byte[1] ;
      P055T12_A764ProForCod = new String[] {""} ;
      P055T12_A766ProForDsc = new String[] {""} ;
      P055T12_A771ProForTie = new short[1] ;
      P055T12_A772ProForTmx = new short[1] ;
      P055T12_A4697RecNroPrg = new int[1] ;
      P055T12_A1251RecNumRec = new int[1] ;
      P055T12_A4695RecVolPrf = new int[1] ;
      P055T12_A10544RecNH2O = new short[1] ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      P055T14_A396EmprCod = new String[] {""} ;
      P055T14_A129BarCod = new int[1] ;
      P055T14_A132BarCodReo = new byte[1] ;
      P055T14_A130BarCodPar = new String[] {""} ;
      P055T14_A2804RecLinMaq = new short[1] ;
      P055T14_A1273RecLinPro = new byte[1] ;
      P055T14_A811RecLin = new short[1] ;
      P055T14_A872RecPrdNum = new String[] {""} ;
      P055T14_A875RecPrdDsc = new String[] {""} ;
      P055T14_A490ForPrdUMe = new byte[1] ;
      P055T14_n490ForPrdUMe = new boolean[] {false} ;
      P055T14_A488ForPrdDsc = new String[] {""} ;
      P055T14_n488ForPrdDsc = new boolean[] {false} ;
      P055T14_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T14_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T14_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T14_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T14_A2394RecForNro = new byte[1] ;
      P055T14_A3274RecPrdTnq = new byte[1] ;
      P055T14_A3804RecFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      P055T14_A3805RecAnyTie = new short[1] ;
      P055T14_A3806RecUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T14_A3807RecPorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T14_A3938RecCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T14_A4024RecMar = new byte[1] ;
      P055T14_A4576RecLinUsr = new String[] {""} ;
      P055T14_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      P055T14_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T14_A5725RecLote = new String[] {""} ;
      P055T14_A11708RecProv = new int[1] ;
      P055T14_A12641RecPrdDc2 = new String[] {""} ;
      P055T14_A12717RecFabId = new int[1] ;
      P055T14_A13938RecLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      P055T14_A13937RecLotAlm = new short[1] ;
      P055T14_A719PrdNum = new String[] {""} ;
      P055T14_n719PrdNum = new boolean[] {false} ;
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
      A12453HreFecAct = GXutil.nullDate() ;
      A12642HrePrdDc2 = "" ;
      A13942HreLoteFch = GXutil.nullDate() ;
      P055T16_A396EmprCod = new String[] {""} ;
      P055T16_A129BarCod = new int[1] ;
      P055T16_A132BarCodReo = new byte[1] ;
      P055T16_A130BarCodPar = new String[] {""} ;
      P055T16_A2804RecLinMaq = new short[1] ;
      P055T16_A5257RecLinObs = new short[1] ;
      P055T16_A5258RecTxtObs = new String[] {""} ;
      P055T16_n5258RecTxtObs = new boolean[] {false} ;
      A5258RecTxtObs = "" ;
      A11323HreTxtObs = "" ;
      P055T18_A396EmprCod = new String[] {""} ;
      P055T18_A129BarCod = new int[1] ;
      P055T18_A132BarCodReo = new byte[1] ;
      P055T18_A130BarCodPar = new String[] {""} ;
      P055T18_A2808RecLinMAL = new short[1] ;
      P055T18_A1377RecNumAny = new byte[1] ;
      P055T18_A718PrdNom = new String[] {""} ;
      P055T18_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T18_n1378PrdCFin = new boolean[] {false} ;
      P055T18_A3380LanyPrd = new String[] {""} ;
      P055T18_n3380LanyPrd = new boolean[] {false} ;
      P055T18_A3381LanyCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T18_n3381LanyCan = new boolean[] {false} ;
      P055T18_A3382LanyNro = new byte[1] ;
      P055T18_n3382LanyNro = new boolean[] {false} ;
      P055T18_A3383LanyTnq = new byte[1] ;
      P055T18_n3383LanyTnq = new boolean[] {false} ;
      P055T18_A4578LanyUsr = new String[] {""} ;
      P055T18_n4578LanyUsr = new boolean[] {false} ;
      P055T18_A4579LanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      P055T18_n4579LanyFec = new boolean[] {false} ;
      P055T18_A5807LanyLote = new String[] {""} ;
      P055T18_n5807LanyLote = new boolean[] {false} ;
      P055T18_A12705LanyCtd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T18_n12705LanyCtd = new boolean[] {false} ;
      P055T18_A12706LanyUnd = new String[] {""} ;
      P055T18_n12706LanyUnd = new boolean[] {false} ;
      P055T18_A13939LanyLoteFc = new java.util.Date[] {GXutil.nullDate()} ;
      P055T18_A719PrdNum = new String[] {""} ;
      P055T18_n719PrdNum = new boolean[] {false} ;
      A718PrdNom = "" ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A3380LanyPrd = "" ;
      A3381LanyCan = DecimalUtil.ZERO ;
      A4578LanyUsr = "" ;
      A4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
      A5807LanyLote = "" ;
      A12705LanyCtd = DecimalUtil.ZERO ;
      A12706LanyUnd = "" ;
      A13939LanyLoteFc = GXutil.nullDate() ;
      A4510HrdPrdDsc = "" ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      A4512HreLanyPrd = "" ;
      A4513HreLanyCan = DecimalUtil.ZERO ;
      A4580HreLanyUsr = "" ;
      A4581HreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      A5808HreLanyLot = "" ;
      A12708HreLanyCtd = DecimalUtil.ZERO ;
      A12707HreLanyUnd = "" ;
      A13940HreLanyLtF = GXutil.nullDate() ;
      P055T20_A396EmprCod = new String[] {""} ;
      P055T20_A129BarCod = new int[1] ;
      P055T20_A132BarCodReo = new byte[1] ;
      P055T20_A130BarCodPar = new String[] {""} ;
      P055T20_A119BarAgrCod = new int[1] ;
      P055T20_A124BarAgrReo = new byte[1] ;
      P055T20_A122BarAgrPar = new String[] {""} ;
      P055T20_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T20_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055T20_A671PieAgr = new short[1] ;
      P055T20_A1508CliCodAgr = new int[1] ;
      A122BarAgrPar = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      GXv_char11 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_char10 = new String[1] ;
      AV88BarKgmAgr = DecimalUtil.ZERO ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      AV89BarMtrAgr = DecimalUtil.ZERO ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_int12 = new int[1] ;
      AV84BarAgrSer = "" ;
      GXv_char6 = new String[1] ;
      AV86Barcolnomagr = "" ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char2 = new String[1] ;
      AV91fec = GXutil.nullDate() ;
      GXv_date17 = new java.util.Date[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char18 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_date20 = new java.util.Date[1] ;
      GXv_char21 = new String[1] ;
      AV85barserdscAgr = "" ;
      GXv_char22 = new String[1] ;
      GXv_int23 = new int[1] ;
      GXv_date24 = new java.util.Date[1] ;
      GXv_char25 = new String[1] ;
      GXv_int3 = new short[1] ;
      GXv_int26 = new int[1] ;
      A4499HreAgrPar = "" ;
      A4500HreAgrKgm = DecimalUtil.ZERO ;
      A4501HreAgrMtr = DecimalUtil.ZERO ;
      A4504HreAgrSer = "" ;
      A4505HreAgrDsc = "" ;
      A4506HreAgrCol = "" ;
      P055T22_A396EmprCod = new String[] {""} ;
      P055T22_A13213DisNormID = new String[] {""} ;
      P055T22_A13216DisNormDsc = new String[] {""} ;
      P055T22_n13216DisNormDsc = new boolean[] {false} ;
      P055T22_A13214DisNormSt = new String[] {""} ;
      P055T22_A13215DisNormNC = new String[] {""} ;
      P055T22_A361DisCod = new int[1] ;
      A13213DisNormID = "" ;
      A13216DisNormDsc = "" ;
      A13214DisNormSt = "" ;
      A13215DisNormNC = "" ;
      A14081HreAgrNmId = "" ;
      A14082HreAgrNmDc = "" ;
      A14083HreAgrNmSt = "" ;
      A14084HreAgrNmNc = "" ;
      P055T24_A396EmprCod = new String[] {""} ;
      P055T24_A13376DisTraID = new String[] {""} ;
      P055T24_A13375DisTraDsc = new String[] {""} ;
      P055T24_n13375DisTraDsc = new boolean[] {false} ;
      P055T24_A361DisCod = new int[1] ;
      A13376DisTraID = "" ;
      A13375DisTraDsc = "" ;
      A14085HreAgrTraI = "" ;
      A14086HreAgrTraD = "" ;
      P055T26_A396EmprCod = new String[] {""} ;
      P055T26_A4492HreBarCod = new int[1] ;
      P055T26_A4493HreBarReo = new byte[1] ;
      P055T26_A4494HreBarPar = new String[] {""} ;
      P055T26_A4495HreNumCie = new byte[1] ;
      P055T27_A396EmprCod = new String[] {""} ;
      P055T27_A831TipColCod = new byte[1] ;
      P055T27_A832TipColDsc = new String[] {""} ;
      P055T27_n832TipColDsc = new boolean[] {false} ;
      A832TipColDsc = "" ;
      P055T28_A396EmprCod = new String[] {""} ;
      P055T28_A829TipArtCod = new short[1] ;
      P055T28_A830TipArtDsc = new String[] {""} ;
      P055T28_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcls010__default(),
         new Object[] {
             new Object[] {
            P055T2_A396EmprCod, P055T2_A129BarCod, P055T2_A132BarCodReo, P055T2_A130BarCodPar, P055T2_A2804RecLinMaq, P055T2_A602MaqCod, P055T2_A6039RecAcab, P055T2_n6039RecAcab, P055T2_A4259RecTotKgs, P055T2_A4260RecTotMts,
            P055T2_n4260RecTotMts, P055T2_A5109RecNumInt, P055T2_A5256RecUltObs, P055T2_n5256RecUltObs, P055T2_A4258RecMaqFas, P055T2_n4258RecMaqFas, P055T2_A4268RecOrdLin, P055T2_n4268RecOrdLin
            }
            , new Object[] {
            P055T3_A396EmprCod, P055T3_A129BarCod, P055T3_A132BarCodReo, P055T3_A130BarCodPar, P055T3_A150BarFacTin, P055T3_A4442BarFasDTI, P055T3_n4442BarFasDTI, P055T3_A4443BarFasDTF, P055T3_n4443BarFasDTF, P055T3_A457FasCod,
            P055T3_A194BarOrdLin, P055T3_A758ProCod
            }
            , new Object[] {
            P055T6_A361DisCod, P055T6_A396EmprCod, P055T6_A129BarCod, P055T6_A132BarCodReo, P055T6_A130BarCodPar, P055T6_A143BarDisNum, P055T6_A212BarSer, P055T6_A1652BarSerDsc, P055T6_A217BarTipArt, P055T6_n217BarTipArt,
            P055T6_A135BarColNom, P055T6_A136BarColNum, P055T6_A1234BarNomCli, P055T6_A1235BarNumCli, P055T6_A218BarTipCol, P055T6_A159BarFecGen, P055T6_A155BarFecCli, P055T6_A158BarFecFpr, P055T6_A182BarMat, P055T6_A966PartCod,
            P055T6_n966PartCod, P055T6_A1500BarNMtr, P055T6_A1499BarNMez, P055T6_A1878BarNumTen, P055T6_A3313BarNumTon, P055T6_A4812BarEncCli, P055T6_A3595BarMacCod, P055T6_A221BarTra1, P055T6_A224BarTraP1, P055T6_A222BarTra2,
            P055T6_A225BarTraP2, P055T6_A223BarTra3, P055T6_A226BarTraP3, P055T6_A229BarUrd1, P055T6_A232BarUrdP1, P055T6_A230BarUrd2, P055T6_A233BarUrdP2, P055T6_A231BarUrd3, P055T6_A234BarUrdP3, P055T6_A252CliCod,
            P055T6_n252CliCod, P055T6_A2452BarCal, P055T6_n2452BarCal, P055T6_A4466BarAcaAnh, P055T6_A2829BarProPer, P055T6_A220BarTotPie, P055T6_A184BarMtr, P055T6_A870BarTotMtr, P055T6_A166BarKgm, P055T6_A219BarTotAgr,
            P055T6_A199BarPie1, P055T6_A365DisDes, P055T6_A898BarPieNDes
            }
            , new Object[] {
            }
            , new Object[] {
            P055T10_A396EmprCod, P055T10_A129BarCod, P055T10_A132BarCodReo, P055T10_A130BarCodPar, P055T10_A2804RecLinMaq, P055T10_A602MaqCod, P055T10_A2805RecVolPrd, P055T10_A2806RecFA, P055T10_A1272UltLinPro, P055T10_A4574RecFecPes,
            P055T10_A4575RecMaqPes, P055T10_A4402RecUsrCod, P055T10_A4654RecNroPar, P055T10_n4654RecNroPar, P055T10_A4866RecFecAlt, P055T10_n4866RecFecAlt, P055T10_A4867RecFecMod, P055T10_n4867RecFecMod, P055T10_A4868RecUsrMod, P055T10_n4868RecUsrMod,
            P055T10_A4261RecTotPrd, P055T10_n4261RecTotPrd, P055T10_A7764RecMaqNh, P055T10_A7765RecMaqVX, P055T10_A7766RecMaqBL, P055T10_A7767RecMaqFlow, P055T10_A7768RecMaqRPM, P055T10_A7769RecMaqMol, P055T10_A7770RecMaqTor, P055T10_A7771RecMaqCla,
            P055T10_A7772RecMaqTej, P055T10_A7773RecMaqDel, P055T10_A7774RecMaqPML, P055T10_A5110RecNumPrg, P055T10_A189BarNumAny, P055T10_A219BarTotAgr, P055T10_A166BarKgm, P055T10_A870BarTotMtr, P055T10_A184BarMtr
            }
            , new Object[] {
            }
            , new Object[] {
            P055T12_A396EmprCod, P055T12_A129BarCod, P055T12_A132BarCodReo, P055T12_A130BarCodPar, P055T12_A2804RecLinMaq, P055T12_A1273RecLinPro, P055T12_A764ProForCod, P055T12_A766ProForDsc, P055T12_A771ProForTie, P055T12_A772ProForTmx,
            P055T12_A4697RecNroPrg, P055T12_A1251RecNumRec, P055T12_A4695RecVolPrf, P055T12_A10544RecNH2O
            }
            , new Object[] {
            }
            , new Object[] {
            P055T14_A396EmprCod, P055T14_A129BarCod, P055T14_A132BarCodReo, P055T14_A130BarCodPar, P055T14_A2804RecLinMaq, P055T14_A1273RecLinPro, P055T14_A811RecLin, P055T14_A872RecPrdNum, P055T14_A875RecPrdDsc, P055T14_A490ForPrdUMe,
            P055T14_n490ForPrdUMe, P055T14_A488ForPrdDsc, P055T14_n488ForPrdDsc, P055T14_A431FacCon, P055T14_A686PrdCant, P055T14_A683PrdCanFin, P055T14_A1797PrdCanAny, P055T14_A2394RecForNro, P055T14_A3274RecPrdTnq, P055T14_A3804RecFecMov,
            P055T14_A3805RecAnyTie, P055T14_A3806RecUltAny, P055T14_A3807RecPorAny, P055T14_A3938RecCanEns, P055T14_A4024RecMar, P055T14_A4576RecLinUsr, P055T14_A4577RecPesFec, P055T14_A724PrdPreAct, P055T14_A5725RecLote, P055T14_A11708RecProv,
            P055T14_A12641RecPrdDc2, P055T14_A12717RecFabId, P055T14_A13938RecLoteFch, P055T14_A13937RecLotAlm, P055T14_A719PrdNum, P055T14_n719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            P055T16_A396EmprCod, P055T16_A129BarCod, P055T16_A132BarCodReo, P055T16_A130BarCodPar, P055T16_A2804RecLinMaq, P055T16_A5257RecLinObs, P055T16_A5258RecTxtObs, P055T16_n5258RecTxtObs
            }
            , new Object[] {
            }
            , new Object[] {
            P055T18_A396EmprCod, P055T18_A129BarCod, P055T18_A132BarCodReo, P055T18_A130BarCodPar, P055T18_A2808RecLinMAL, P055T18_A1377RecNumAny, P055T18_A718PrdNom, P055T18_A1378PrdCFin, P055T18_n1378PrdCFin, P055T18_A3380LanyPrd,
            P055T18_n3380LanyPrd, P055T18_A3381LanyCan, P055T18_n3381LanyCan, P055T18_A3382LanyNro, P055T18_n3382LanyNro, P055T18_A3383LanyTnq, P055T18_n3383LanyTnq, P055T18_A4578LanyUsr, P055T18_n4578LanyUsr, P055T18_A4579LanyFec,
            P055T18_n4579LanyFec, P055T18_A5807LanyLote, P055T18_n5807LanyLote, P055T18_A12705LanyCtd, P055T18_n12705LanyCtd, P055T18_A12706LanyUnd, P055T18_n12706LanyUnd, P055T18_A13939LanyLoteFc, P055T18_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            P055T20_A396EmprCod, P055T20_A129BarCod, P055T20_A132BarCodReo, P055T20_A130BarCodPar, P055T20_A119BarAgrCod, P055T20_A124BarAgrReo, P055T20_A122BarAgrPar, P055T20_A590KgmAgr, P055T20_A869MtrAgr, P055T20_A671PieAgr,
            P055T20_A1508CliCodAgr
            }
            , new Object[] {
            }
            , new Object[] {
            P055T22_A396EmprCod, P055T22_A13213DisNormID, P055T22_A13216DisNormDsc, P055T22_n13216DisNormDsc, P055T22_A13214DisNormSt, P055T22_A13215DisNormNC, P055T22_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            P055T24_A396EmprCod, P055T24_A13376DisTraID, P055T24_A13375DisTraDsc, P055T24_n13375DisTraDsc, P055T24_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            P055T26_A396EmprCod, P055T26_A4492HreBarCod, P055T26_A4493HreBarReo, P055T26_A4494HreBarPar, P055T26_A4495HreNumCie
            }
            , new Object[] {
            P055T27_A396EmprCod, P055T27_A831TipColCod, P055T27_A832TipColDsc, P055T27_n832TipColDsc
            }
            , new Object[] {
            P055T28_A396EmprCod, P055T28_A829TipArtCod, P055T28_A830TipArtDsc, P055T28_n830TipArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV48BarTipCol ;
   private byte AV36BarCodReo ;
   private byte AV54IntCod ;
   private byte AV56Lb_numop ;
   private byte AV50Flag ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte AV61NumCie ;
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
   private byte GXv_int14[] ;
   private byte GXv_int9[] ;
   private byte GXv_int8[] ;
   private byte A4498HreAgrReo ;
   private byte A831TipColCod ;
   private short AV65RecLinMaq ;
   private short AV77hreordlin ;
   private short A2804RecLinMaq ;
   private short A5256RecUltObs ;
   private short A4268RecOrdLin ;
   private short AV69RecUltObs ;
   private short A194BarOrdLin ;
   private short A217BarTipArt ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A232BarUrdP1 ;
   private short A233BarUrdP2 ;
   private short A234BarUrdP3 ;
   private short A4466BarAcaAnh ;
   private short A199BarPie1 ;
   private short AV47BarTipArt ;
   private short AV74HreCencId ;
   private short AV53HreFamCodt ;
   private short A4519HreTipArt ;
   private short A8610HreFamCodT ;
   private short A12535HreCencId ;
   private short Gx_err ;
   private short A7764RecMaqNh ;
   private short A7768RecMaqRPM ;
   private short A7769RecMaqMol ;
   private short A7770RecMaqTor ;
   private short A7774RecMaqPML ;
   private short A189BarNumAny ;
   private short A4545HreLinMaq ;
   private short A4964HreOrdLin ;
   private short A7814HReMaqNh ;
   private short A7818HReMaqRPM ;
   private short A7819HReMaqMol ;
   private short A7820HReMaqTor ;
   private short A7824HReMaqPML ;
   private short A11321HreUltObs ;
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
   private short A5257RecLinObs ;
   private short A11322HreLinObs ;
   private short A2808RecLinMAL ;
   private short A4508HreLinMAL ;
   private short A671PieAgr ;
   private short AV90BarPieagr ;
   private short GXv_int3[] ;
   private short A4502HreAgrPie ;
   private short A829TipArtCod ;
   private int A129BarCod ;
   private int AV66recnumint ;
   private int A5109RecNumInt ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A3595BarMacCod ;
   private int A252CliCod ;
   private int A220BarTotPie ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int A813RecTotPie ;
   private int AV49CliCod ;
   private int AV38BarColNum ;
   private int AV34BarCod ;
   private int AV51ForNumCol ;
   private int AV60NEnsayo ;
   private int GX_INS675 ;
   private int A4492HreBarCod ;
   private int A4522HreColNum ;
   private int A4524HreColNumC ;
   private int A4534HreBarPie ;
   private int A4544HreTotPie ;
   private int A8608HreNumColF ;
   private int A8624HreEnsayo ;
   private int A11320HreMacCod ;
   private int A12264HreNInter ;
   private int A2805RecVolPrd ;
   private int A4654RecNroPar ;
   private int A4261RecTotPrd ;
   private int GX_INS678 ;
   private int A4547HreVolPrd ;
   private int A4965HreNroPar ;
   private int A4970HreTotPrd ;
   private int A10102HreNumInt ;
   private int A5978HreNumRmt ;
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
   private int GX_INS1511 ;
   private int GX_INS677 ;
   private int A119BarAgrCod ;
   private int A1508CliCodAgr ;
   private int GXv_int13[] ;
   private int GXv_int12[] ;
   private int AV87BarcolnumAgr ;
   private int GXv_int7[] ;
   private int GXv_int5[] ;
   private int GXv_int23[] ;
   private int AV92DiscodAgr ;
   private int GXv_int26[] ;
   private int GX_INS676 ;
   private int A4497HreAgrCod ;
   private int A4503HreAgrCli ;
   private int A4507HreAgrNumC ;
   private int GX_INS1885 ;
   private int GX_INS1886 ;
   private java.math.BigDecimal AV44Barcospd ;
   private java.math.BigDecimal AV40Barcosad ;
   private java.math.BigDecimal AV39Barcosaa ;
   private java.math.BigDecimal AV43Barcospa ;
   private java.math.BigDecimal AV42barcoscol ;
   private java.math.BigDecimal AV41barcosanc ;
   private java.math.BigDecimal AV67recTotKgs ;
   private java.math.BigDecimal AV68RecTotMts ;
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
   private java.math.BigDecimal A12705LanyCtd ;
   private java.math.BigDecimal A4511HrePrdCFin ;
   private java.math.BigDecimal A4513HreLanyCan ;
   private java.math.BigDecimal A12708HreLanyCtd ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal AV88BarKgmAgr ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal AV89BarMtrAgr ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal A4500HreAgrKgm ;
   private java.math.BigDecimal A4501HreAgrMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV64recacab ;
   private String AV58MaqCod ;
   private String AV76HreFascod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A6039RecAcab ;
   private String A4258RecMaqFas ;
   private String A150BarFacTin ;
   private String A457FasCod ;
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
   private String AV46BarSer ;
   private String AV37BarColNom ;
   private String AV35BarCodPar ;
   private String AV45BarGirar ;
   private String AV75HreCenDsc ;
   private String GXt_char1 ;
   private String AV82HreCdn2 ;
   private String AV83HreCtw ;
   private String AV55IntDsc ;
   private String AV52Hilasa ;
   private String AV57Lb_opcion ;
   private String Gx_msg ;
   private String A4494HreBarPar ;
   private String A4516HreDisCli ;
   private String A4517HreBarSer ;
   private String A4518HreBarDsc ;
   private String A4520HreTipArtD ;
   private String AV70TipArtDsc ;
   private String A4521HreColNom ;
   private String A4523HreColNomC ;
   private String A4526HreTipColN ;
   private String AV71TipColDsc ;
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
   private String A11318HreDispCli ;
   private String A12536HreCenDsc ;
   private String AV79HreComp1 ;
   private String AV80HreComp2 ;
   private String A13450HreComp1 ;
   private String A13451HreComp2 ;
   private String A13763HreUser ;
   private String AV81UsurCod ;
   private String A13765HreCdn2 ;
   private String A13766HreCtw ;
   private String Gx_emsg ;
   private String A4402RecUsrCod ;
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
   private String A5258RecTxtObs ;
   private String A11323HreTxtObs ;
   private String A718PrdNom ;
   private String A3380LanyPrd ;
   private String A4578LanyUsr ;
   private String A5807LanyLote ;
   private String A12706LanyUnd ;
   private String A4510HrdPrdDsc ;
   private String A4512HreLanyPrd ;
   private String A4580HreLanyUsr ;
   private String A5808HreLanyLot ;
   private String A12707HreLanyUnd ;
   private String A122BarAgrPar ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String AV84BarAgrSer ;
   private String GXv_char6[] ;
   private String AV86Barcolnomagr ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXv_char18[] ;
   private String GXv_char19[] ;
   private String GXv_char21[] ;
   private String AV85barserdscAgr ;
   private String GXv_char22[] ;
   private String GXv_char25[] ;
   private String A4499HreAgrPar ;
   private String A4504HreAgrSer ;
   private String A4505HreAgrDsc ;
   private String A4506HreAgrCol ;
   private String A13213DisNormID ;
   private String A13216DisNormDsc ;
   private String A13214DisNormSt ;
   private String A13215DisNormNC ;
   private String A14081HreAgrNmId ;
   private String A14082HreAgrNmDc ;
   private String A14083HreAgrNmSt ;
   private String A14084HreAgrNmNc ;
   private String A13376DisTraID ;
   private String A13375DisTraDsc ;
   private String A14085HreAgrTraI ;
   private String A14086HreAgrTraD ;
   private String A832TipColDsc ;
   private String A830TipArtDsc ;
   private java.util.Date AV72Hredti ;
   private java.util.Date AV73HreDtf ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A13764HreDiaHora ;
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
   private java.util.Date AV78FechCierre ;
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
   private java.util.Date AV91fec ;
   private java.util.Date GXv_date17[] ;
   private java.util.Date GXv_date20[] ;
   private java.util.Date GXv_date24[] ;
   private boolean n6039RecAcab ;
   private boolean n4260RecTotMts ;
   private boolean n5256RecUltObs ;
   private boolean n4258RecMaqFas ;
   private boolean n4268RecOrdLin ;
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
   private boolean n11318HreDispCli ;
   private boolean n11320HreMacCod ;
   private boolean n12264HreNInter ;
   private boolean n12535HreCencId ;
   private boolean n12536HreCenDsc ;
   private boolean n13450HreComp1 ;
   private boolean n13451HreComp2 ;
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
   private boolean n5978HreNumRmt ;
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
   private boolean n12453HreFecAct ;
   private boolean n12642HrePrdDc2 ;
   private boolean n12718HreFabId ;
   private boolean n5258RecTxtObs ;
   private boolean n11323HreTxtObs ;
   private boolean n1378PrdCFin ;
   private boolean n3380LanyPrd ;
   private boolean n3381LanyCan ;
   private boolean n3382LanyNro ;
   private boolean n3383LanyTnq ;
   private boolean n4578LanyUsr ;
   private boolean n4579LanyFec ;
   private boolean n5807LanyLote ;
   private boolean n12705LanyCtd ;
   private boolean n12706LanyUnd ;
   private boolean n4510HrdPrdDsc ;
   private boolean n4511HrePrdCFin ;
   private boolean n4512HreLanyPrd ;
   private boolean n4513HreLanyCan ;
   private boolean n4514HreLanyNro ;
   private boolean n4515HreLanyTnq ;
   private boolean n4580HreLanyUsr ;
   private boolean n4581HreLanyFec ;
   private boolean n5808HreLanyLot ;
   private boolean n12708HreLanyCtd ;
   private boolean n12707HreLanyUnd ;
   private boolean n13216DisNormDsc ;
   private boolean n13375DisTraDsc ;
   private boolean n832TipColDsc ;
   private boolean n830TipArtDsc ;
   private java.util.Date[] aP11 ;
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
   private java.math.BigDecimal[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P055T2_A396EmprCod ;
   private int[] P055T2_A129BarCod ;
   private byte[] P055T2_A132BarCodReo ;
   private String[] P055T2_A130BarCodPar ;
   private short[] P055T2_A2804RecLinMaq ;
   private String[] P055T2_A602MaqCod ;
   private String[] P055T2_A6039RecAcab ;
   private boolean[] P055T2_n6039RecAcab ;
   private java.math.BigDecimal[] P055T2_A4259RecTotKgs ;
   private java.math.BigDecimal[] P055T2_A4260RecTotMts ;
   private boolean[] P055T2_n4260RecTotMts ;
   private int[] P055T2_A5109RecNumInt ;
   private short[] P055T2_A5256RecUltObs ;
   private boolean[] P055T2_n5256RecUltObs ;
   private String[] P055T2_A4258RecMaqFas ;
   private boolean[] P055T2_n4258RecMaqFas ;
   private short[] P055T2_A4268RecOrdLin ;
   private boolean[] P055T2_n4268RecOrdLin ;
   private String[] P055T3_A396EmprCod ;
   private int[] P055T3_A129BarCod ;
   private byte[] P055T3_A132BarCodReo ;
   private String[] P055T3_A130BarCodPar ;
   private String[] P055T3_A150BarFacTin ;
   private java.util.Date[] P055T3_A4442BarFasDTI ;
   private boolean[] P055T3_n4442BarFasDTI ;
   private java.util.Date[] P055T3_A4443BarFasDTF ;
   private boolean[] P055T3_n4443BarFasDTF ;
   private String[] P055T3_A457FasCod ;
   private short[] P055T3_A194BarOrdLin ;
   private String[] P055T3_A758ProCod ;
   private int[] P055T6_A361DisCod ;
   private String[] P055T6_A396EmprCod ;
   private int[] P055T6_A129BarCod ;
   private byte[] P055T6_A132BarCodReo ;
   private String[] P055T6_A130BarCodPar ;
   private String[] P055T6_A143BarDisNum ;
   private String[] P055T6_A212BarSer ;
   private String[] P055T6_A1652BarSerDsc ;
   private short[] P055T6_A217BarTipArt ;
   private boolean[] P055T6_n217BarTipArt ;
   private String[] P055T6_A135BarColNom ;
   private int[] P055T6_A136BarColNum ;
   private String[] P055T6_A1234BarNomCli ;
   private int[] P055T6_A1235BarNumCli ;
   private byte[] P055T6_A218BarTipCol ;
   private java.util.Date[] P055T6_A159BarFecGen ;
   private java.util.Date[] P055T6_A155BarFecCli ;
   private java.util.Date[] P055T6_A158BarFecFpr ;
   private String[] P055T6_A182BarMat ;
   private String[] P055T6_A966PartCod ;
   private boolean[] P055T6_n966PartCod ;
   private String[] P055T6_A1500BarNMtr ;
   private String[] P055T6_A1499BarNMez ;
   private String[] P055T6_A1878BarNumTen ;
   private String[] P055T6_A3313BarNumTon ;
   private String[] P055T6_A4812BarEncCli ;
   private int[] P055T6_A3595BarMacCod ;
   private String[] P055T6_A221BarTra1 ;
   private short[] P055T6_A224BarTraP1 ;
   private String[] P055T6_A222BarTra2 ;
   private short[] P055T6_A225BarTraP2 ;
   private String[] P055T6_A223BarTra3 ;
   private short[] P055T6_A226BarTraP3 ;
   private String[] P055T6_A229BarUrd1 ;
   private short[] P055T6_A232BarUrdP1 ;
   private String[] P055T6_A230BarUrd2 ;
   private short[] P055T6_A233BarUrdP2 ;
   private String[] P055T6_A231BarUrd3 ;
   private short[] P055T6_A234BarUrdP3 ;
   private int[] P055T6_A252CliCod ;
   private boolean[] P055T6_n252CliCod ;
   private String[] P055T6_A2452BarCal ;
   private boolean[] P055T6_n2452BarCal ;
   private short[] P055T6_A4466BarAcaAnh ;
   private String[] P055T6_A2829BarProPer ;
   private int[] P055T6_A220BarTotPie ;
   private java.math.BigDecimal[] P055T6_A184BarMtr ;
   private java.math.BigDecimal[] P055T6_A870BarTotMtr ;
   private java.math.BigDecimal[] P055T6_A166BarKgm ;
   private java.math.BigDecimal[] P055T6_A219BarTotAgr ;
   private short[] P055T6_A199BarPie1 ;
   private String[] P055T6_A365DisDes ;
   private int[] P055T6_A898BarPieNDes ;
   private String[] P055T10_A396EmprCod ;
   private int[] P055T10_A129BarCod ;
   private byte[] P055T10_A132BarCodReo ;
   private String[] P055T10_A130BarCodPar ;
   private short[] P055T10_A2804RecLinMaq ;
   private String[] P055T10_A602MaqCod ;
   private int[] P055T10_A2805RecVolPrd ;
   private java.math.BigDecimal[] P055T10_A2806RecFA ;
   private byte[] P055T10_A1272UltLinPro ;
   private java.util.Date[] P055T10_A4574RecFecPes ;
   private byte[] P055T10_A4575RecMaqPes ;
   private String[] P055T10_A4402RecUsrCod ;
   private int[] P055T10_A4654RecNroPar ;
   private boolean[] P055T10_n4654RecNroPar ;
   private java.util.Date[] P055T10_A4866RecFecAlt ;
   private boolean[] P055T10_n4866RecFecAlt ;
   private java.util.Date[] P055T10_A4867RecFecMod ;
   private boolean[] P055T10_n4867RecFecMod ;
   private String[] P055T10_A4868RecUsrMod ;
   private boolean[] P055T10_n4868RecUsrMod ;
   private int[] P055T10_A4261RecTotPrd ;
   private boolean[] P055T10_n4261RecTotPrd ;
   private short[] P055T10_A7764RecMaqNh ;
   private byte[] P055T10_A7765RecMaqVX ;
   private byte[] P055T10_A7766RecMaqBL ;
   private byte[] P055T10_A7767RecMaqFlow ;
   private short[] P055T10_A7768RecMaqRPM ;
   private short[] P055T10_A7769RecMaqMol ;
   private short[] P055T10_A7770RecMaqTor ;
   private String[] P055T10_A7771RecMaqCla ;
   private byte[] P055T10_A7772RecMaqTej ;
   private byte[] P055T10_A7773RecMaqDel ;
   private short[] P055T10_A7774RecMaqPML ;
   private String[] P055T10_A5110RecNumPrg ;
   private short[] P055T10_A189BarNumAny ;
   private java.math.BigDecimal[] P055T10_A219BarTotAgr ;
   private java.math.BigDecimal[] P055T10_A166BarKgm ;
   private java.math.BigDecimal[] P055T10_A870BarTotMtr ;
   private java.math.BigDecimal[] P055T10_A184BarMtr ;
   private String[] P055T12_A396EmprCod ;
   private int[] P055T12_A129BarCod ;
   private byte[] P055T12_A132BarCodReo ;
   private String[] P055T12_A130BarCodPar ;
   private short[] P055T12_A2804RecLinMaq ;
   private byte[] P055T12_A1273RecLinPro ;
   private String[] P055T12_A764ProForCod ;
   private String[] P055T12_A766ProForDsc ;
   private short[] P055T12_A771ProForTie ;
   private short[] P055T12_A772ProForTmx ;
   private int[] P055T12_A4697RecNroPrg ;
   private int[] P055T12_A1251RecNumRec ;
   private int[] P055T12_A4695RecVolPrf ;
   private short[] P055T12_A10544RecNH2O ;
   private String[] P055T14_A396EmprCod ;
   private int[] P055T14_A129BarCod ;
   private byte[] P055T14_A132BarCodReo ;
   private String[] P055T14_A130BarCodPar ;
   private short[] P055T14_A2804RecLinMaq ;
   private byte[] P055T14_A1273RecLinPro ;
   private short[] P055T14_A811RecLin ;
   private String[] P055T14_A872RecPrdNum ;
   private String[] P055T14_A875RecPrdDsc ;
   private byte[] P055T14_A490ForPrdUMe ;
   private boolean[] P055T14_n490ForPrdUMe ;
   private String[] P055T14_A488ForPrdDsc ;
   private boolean[] P055T14_n488ForPrdDsc ;
   private java.math.BigDecimal[] P055T14_A431FacCon ;
   private java.math.BigDecimal[] P055T14_A686PrdCant ;
   private java.math.BigDecimal[] P055T14_A683PrdCanFin ;
   private java.math.BigDecimal[] P055T14_A1797PrdCanAny ;
   private byte[] P055T14_A2394RecForNro ;
   private byte[] P055T14_A3274RecPrdTnq ;
   private java.util.Date[] P055T14_A3804RecFecMov ;
   private short[] P055T14_A3805RecAnyTie ;
   private java.math.BigDecimal[] P055T14_A3806RecUltAny ;
   private java.math.BigDecimal[] P055T14_A3807RecPorAny ;
   private java.math.BigDecimal[] P055T14_A3938RecCanEns ;
   private byte[] P055T14_A4024RecMar ;
   private String[] P055T14_A4576RecLinUsr ;
   private java.util.Date[] P055T14_A4577RecPesFec ;
   private java.math.BigDecimal[] P055T14_A724PrdPreAct ;
   private String[] P055T14_A5725RecLote ;
   private int[] P055T14_A11708RecProv ;
   private String[] P055T14_A12641RecPrdDc2 ;
   private int[] P055T14_A12717RecFabId ;
   private java.util.Date[] P055T14_A13938RecLoteFch ;
   private short[] P055T14_A13937RecLotAlm ;
   private String[] P055T14_A719PrdNum ;
   private boolean[] P055T14_n719PrdNum ;
   private String[] P055T16_A396EmprCod ;
   private int[] P055T16_A129BarCod ;
   private byte[] P055T16_A132BarCodReo ;
   private String[] P055T16_A130BarCodPar ;
   private short[] P055T16_A2804RecLinMaq ;
   private short[] P055T16_A5257RecLinObs ;
   private String[] P055T16_A5258RecTxtObs ;
   private boolean[] P055T16_n5258RecTxtObs ;
   private String[] P055T18_A396EmprCod ;
   private int[] P055T18_A129BarCod ;
   private byte[] P055T18_A132BarCodReo ;
   private String[] P055T18_A130BarCodPar ;
   private short[] P055T18_A2808RecLinMAL ;
   private byte[] P055T18_A1377RecNumAny ;
   private String[] P055T18_A718PrdNom ;
   private java.math.BigDecimal[] P055T18_A1378PrdCFin ;
   private boolean[] P055T18_n1378PrdCFin ;
   private String[] P055T18_A3380LanyPrd ;
   private boolean[] P055T18_n3380LanyPrd ;
   private java.math.BigDecimal[] P055T18_A3381LanyCan ;
   private boolean[] P055T18_n3381LanyCan ;
   private byte[] P055T18_A3382LanyNro ;
   private boolean[] P055T18_n3382LanyNro ;
   private byte[] P055T18_A3383LanyTnq ;
   private boolean[] P055T18_n3383LanyTnq ;
   private String[] P055T18_A4578LanyUsr ;
   private boolean[] P055T18_n4578LanyUsr ;
   private java.util.Date[] P055T18_A4579LanyFec ;
   private boolean[] P055T18_n4579LanyFec ;
   private String[] P055T18_A5807LanyLote ;
   private boolean[] P055T18_n5807LanyLote ;
   private java.math.BigDecimal[] P055T18_A12705LanyCtd ;
   private boolean[] P055T18_n12705LanyCtd ;
   private String[] P055T18_A12706LanyUnd ;
   private boolean[] P055T18_n12706LanyUnd ;
   private java.util.Date[] P055T18_A13939LanyLoteFc ;
   private String[] P055T18_A719PrdNum ;
   private boolean[] P055T18_n719PrdNum ;
   private String[] P055T20_A396EmprCod ;
   private int[] P055T20_A129BarCod ;
   private byte[] P055T20_A132BarCodReo ;
   private String[] P055T20_A130BarCodPar ;
   private int[] P055T20_A119BarAgrCod ;
   private byte[] P055T20_A124BarAgrReo ;
   private String[] P055T20_A122BarAgrPar ;
   private java.math.BigDecimal[] P055T20_A590KgmAgr ;
   private java.math.BigDecimal[] P055T20_A869MtrAgr ;
   private short[] P055T20_A671PieAgr ;
   private int[] P055T20_A1508CliCodAgr ;
   private String[] P055T22_A396EmprCod ;
   private String[] P055T22_A13213DisNormID ;
   private String[] P055T22_A13216DisNormDsc ;
   private boolean[] P055T22_n13216DisNormDsc ;
   private String[] P055T22_A13214DisNormSt ;
   private String[] P055T22_A13215DisNormNC ;
   private int[] P055T22_A361DisCod ;
   private String[] P055T24_A396EmprCod ;
   private String[] P055T24_A13376DisTraID ;
   private String[] P055T24_A13375DisTraDsc ;
   private boolean[] P055T24_n13375DisTraDsc ;
   private int[] P055T24_A361DisCod ;
   private String[] P055T26_A396EmprCod ;
   private int[] P055T26_A4492HreBarCod ;
   private byte[] P055T26_A4493HreBarReo ;
   private String[] P055T26_A4494HreBarPar ;
   private byte[] P055T26_A4495HreNumCie ;
   private String[] P055T27_A396EmprCod ;
   private byte[] P055T27_A831TipColCod ;
   private String[] P055T27_A832TipColDsc ;
   private boolean[] P055T27_n832TipColDsc ;
   private String[] P055T28_A396EmprCod ;
   private short[] P055T28_A829TipArtCod ;
   private String[] P055T28_A830TipArtDsc ;
   private boolean[] P055T28_n830TipArtDsc ;
}

final  class pcls010__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P055T2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, MaqCod, RecAcab, RecTotKgs, RecTotMts, RecNumInt, RecUltObs, RecMaqFas, RecOrdLin FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P055T3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, BarFasDTI, BarFasDTF, FasCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P055T6", "SELECT T1.DisCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarDisNum, T1.BarSer, T1.BarSerDsc, T1.BarTipArt, T1.BarColNom, T1.BarColNum, T1.BarNomCli, T1.BarNumCli, T1.BarTipCol, T1.BarFecGen, T1.BarFecCli, T1.BarFecFpr, T1.BarMat, T2.PartCod, T1.BarNMtr, T1.BarNMez, T1.BarNumTen, T1.BarNumTon, T1.BarEncCli, T1.BarMacCod, T1.BarTra1, T1.BarTraP1, T1.BarTra2, T1.BarTraP2, T1.BarTra3, T1.BarTraP3, T1.BarUrd1, T1.BarUrdP1, T1.BarUrd2, T1.BarUrdP2, T1.BarUrd3, T1.BarUrdP3, T1.CliCod, T1.BarCal, T1.BarAcaAnh, T1.BarProPer, COALESCE( T4.BarTotPie, 0) AS BarTotPie, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T4.BarTotMtr, 0) AS BarTotMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T4.BarTotAgr, 0) AS BarTotAgr, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM (((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(MtrAgr) AS BarTotMtr, SUM(PieAgr) AS BarTotPie FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P055T7", "INSERT INTO TXPHISREH(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreMaqHdr, HreDisCli, CliCod, HreBarSer, HreBarDsc, HreTipArt, HreTipArtD, HreColNom, HreColNum, HreColNomC, HreColNumC, HreTipCol, HreTipColN, HreFecGen, HreFecCli, HreFecTin, HreFecFpr, HreBarMat, HreBarKgm, HreBarMtr, HreBarPie, HrePartCod, HreBarNMtr, HreBarNMez, HreNumTen, HreIntCod, HreIntDsc, HreNumTon, HreTotKgm, HreTotMtr, HreTotPie, HreNumColF, HreFamCodT, HreHilasa, HreEnsayo, HreOpa, HreOpn, HreDispCli, HreMacCod, HreNInter, HreCencId, HreCenDsc, HreComp1, HreComp2, HreUser, HreDiaHora, HreCdn2, HreCtw, HreLtsSR, HreLtsRs, HreAcaQm, HreRacab, HreFecAcb, HreAbs, HreLtsRc, HreHdrLts, HreFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREH")
         ,new ForEachCursor("P055T10", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.MaqCod, T1.RecVolPrd, T1.RecFA, T1.UltLinPro, T1.RecFecPes, T1.RecMaqPes, T1.RecUsrCod, T1.RecNroPar, T1.RecFecAlt, T1.RecFecMod, T1.RecUsrMod, T1.RecTotPrd, T1.RecMaqNh, T1.RecMaqVX, T1.RecMaqBL, T1.RecMaqFlow, T1.RecMaqRPM, T1.RecMaqMol, T1.RecMaqTor, T1.RecMaqCla, T1.RecMaqTej, T1.RecMaqDel, T1.RecMaqPML, T1.RecNumPrg, T2.BarNumAny, COALESCE( T3.BarTotAgr, 0) AS BarTotAgr, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T3.BarTotMtr, 0) AS BarTotMtr, COALESCE( T4.BarMtr, 0) AS BarMtr FROM (((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(MtrAgr) AS BarTotMtr FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P055T11", "INSERT INTO TXPHISREM(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreMaqCod, HreVolPrd, HreFacAbs, HreULinPro, HreFecPes, HreMaqPes, HreUsrCod, HreFecAlt, HreUsrMod, HreFecMod, HreFasCod, HreOrdLin, HreNroPar, HreTotKgs, HreTotMts, HreTotPrd, HreNumRmt, HReMaqNh, HReMaqVX, HReMaqBL, HReMaqFlow, HReMaqRPM, HReMaqMol, HReMaqTor, HReMaqCla, HReMaqTej, HReMaqDel, HReMaqPML, HreCosAA, HrecosAd, HreCosAnc, HreCosCol, HreCosPA, HreCosPD, HreNPrg, HreLotF, HreNumInt, HreDti, HreDtf, HreUltObs, HreProPrd, HreNumReo, HreLtsSb, HreLtsRm, HreAcaQ, HreAcab, HreAnc, HreGrm, HreVel, HreObs, HreAva, HreAs, HreAi) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREM")
         ,new ForEachCursor("P055T12", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.ProForCod, T2.ProForDsc, T2.ProForTie, T2.ProForTmx, T1.RecNroPrg, T1.RecNumRec, T1.RecVolPrf, T1.RecNH2O FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P055T13", "INSERT INTO TXPHISREC(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreNH2O, HreProCod, HreProDsc, HreProTie, HreProTmx, HreNumPro, HreNumRec, HreVolPro, HreTieprg, HreNroPrg) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREC")
         ,new ForEachCursor("P055T14", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin, T1.RecPrdNum, T1.RecPrdDsc, T1.ForPrdUMe, T3.ForPrdDsc, T1.FacCon, T1.PrdCant, T1.PrdCanFin, T1.PrdCanAny, T1.RecForNro, T1.RecPrdTnq, T1.RecFecMov, T1.RecAnyTie, T1.RecUltAny, T1.RecPorAny, T1.RecCanEns, T1.RecMar, T1.RecLinUsr, T1.RecPesFec, T2.PrdPreAct, T1.RecLote, T1.RecProv, T1.RecPrdDc2, T1.RecFabId, T1.RecLoteFch, T1.RecLotAlm, T1.PrdNum FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P055T15", "INSERT INTO TXPHISLRE(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin, PrdNum, HrePrdNum, HrePrdDsc, HrePrdUMe, HrePrdUDs, HreFacCon, HrePrdCant, HreCanFin, HreCanAny, HreForNro, HrePrdTnq, HreFecMov, HreAnyTie, HreUltAny, HrePorAny, HreCanEns, HreRecMar, HreLinUsr, HrePesFec, HrePrePrd, HreLote, HreProv, HreFecAct, HrePrdDc2, HreFabId, HreLoteFch, HreLotAlm, HreSalMP, HreSalVol, HreFacCon1) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISLRE")
         ,new ForEachCursor("P055T16", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs, RecTxtObs FROM TXPOBSREC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P055T17", "INSERT INTO TXPHISOBS(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinObs, HreTxtObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISOBS")
         ,new ForEachCursor("P055T18", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.RecNumAny, T2.PrdNom, T1.PrdCFin, T1.LanyPrd, T1.LanyCan, T1.LanyNro, T1.LanyTnq, T1.LanyUsr, T1.LanyFec, T1.LanyLote, T1.LanyCtd, T1.LanyUnd, T1.LanyLoteFc, T1.PrdNum FROM (TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.RecNumAny, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P055T19", "INSERT INTO TXPHISREA(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum, HrdPrdDsc, HrePrdCFin, HreLanyPrd, HreLanyCan, HreLanyNro, HreLanyTnq, HreLanyUsr, HreLanyFec, HreLanyLot, HreLanyCtd, HreLanyUnd, HreLanyLtF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREA")
         ,new ForEachCursor("P055T20", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar, KgmAgr, MtrAgr, PieAgr, CliCodAgr FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P055T21", "INSERT INTO TXPHISRAG(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar, HreAgrKgm, HreAgrMtr, HreAgrPie, HreAgrCli, HreAgrSer, HreAgrDsc, HreAgrCol, HreAgrNumC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISRAG")
         ,new ForEachCursor("P055T22", "SELECT T1.EmprCod, T1.DisNormID AS DisNormID, T2.NormaDsc AS DisNormDsc, T1.DisNormSt, T1.DisNormNC, T1.DisCod FROM (TXPDISNOR T1 INNER JOIN TXPNORMAS T2 ON T2.EmprCod = T1.EmprCod AND T2.NormaID = T1.DisNormID) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P055T23", "INSERT INTO TXPHISRA1(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar, HreAgrNmId, HreAgrNmDc, HreAgrNmSt, HreAgrNmNc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISRA1")
         ,new ForEachCursor("P055T24", "SELECT T1.EmprCod, T1.DisTraID AS DisTraID, T2.TRADsc AS DisTraDsc, T1.DisCod FROM (TXPDISATI T1 INNER JOIN TXPTRATIN T2 ON T2.EmprCod = T1.EmprCod AND T2.TRAID = T1.DisTraID) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.DisTraID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P055T25", "INSERT INTO TXPHISRA2(EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar, HreAgrTraI, HreAgrTraD) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISRA2")
         ,new ForEachCursor("P055T26", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P055T27", "SELECT EmprCod, TipColCod, TipColDsc FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P055T28", "SELECT EmprCod, TipArtCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
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
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
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
               ((String[]) buf[25])[0] = rslt.getString(24, 20);
               ((int[]) buf[26])[0] = rslt.getInt(25);
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
               ((String[]) buf[37])[0] = rslt.getString(36, 4);
               ((short[]) buf[38])[0] = rslt.getShort(37);
               ((int[]) buf[39])[0] = rslt.getInt(38);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(39, 20);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(40);
               ((String[]) buf[44])[0] = rslt.getString(41, 8);
               ((int[]) buf[45])[0] = rslt.getInt(42);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(44,2);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(45,2);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(46,2);
               ((short[]) buf[50])[0] = rslt.getShort(47);
               ((String[]) buf[51])[0] = rslt.getString(48, 1);
               ((int[]) buf[52])[0] = rslt.getInt(49);
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
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(16, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(18);
               ((byte[]) buf[23])[0] = rslt.getByte(19);
               ((byte[]) buf[24])[0] = rslt.getByte(20);
               ((byte[]) buf[25])[0] = rslt.getByte(21);
               ((short[]) buf[26])[0] = rslt.getShort(22);
               ((short[]) buf[27])[0] = rslt.getShort(23);
               ((short[]) buf[28])[0] = rslt.getShort(24);
               ((String[]) buf[29])[0] = rslt.getString(25, 10);
               ((byte[]) buf[30])[0] = rslt.getByte(26);
               ((byte[]) buf[31])[0] = rslt.getByte(27);
               ((short[]) buf[32])[0] = rslt.getShort(28);
               ((String[]) buf[33])[0] = rslt.getString(29, 6);
               ((short[]) buf[34])[0] = rslt.getShort(30);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(32,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(33,2);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(34,2);
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
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(31);
               ((short[]) buf[33])[0] = rslt.getShort(32);
               ((String[]) buf[34])[0] = rslt.getString(33, 6);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 12 :
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
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,3);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(18);
               ((String[]) buf[28])[0] = rslt.getString(19, 6);
               return;
            case 14 :
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
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 22 :
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
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[80], 20);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(44, ((Number) parms[82]).intValue());
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(45, ((Number) parms[84]).intValue());
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(46, ((Number) parms[86]).shortValue());
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[88], 80);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[90], 21);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[92], 21);
               }
               stmt.setString(50, (String)parms[93], 10);
               stmt.setDateTime(51, (java.util.Date)parms[94], false);
               stmt.setString(52, (String)parms[95], 4);
               stmt.setString(53, (String)parms[96], 4);
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
                  stmt.setInt(23, ((Number) parms[39]).intValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[41]).shortValue());
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
                  stmt.setByte(27, ((Number) parms[47]).byteValue());
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
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[53]).shortValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[55], 10);
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
                  stmt.setByte(33, ((Number) parms[59]).byteValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[61]).shortValue());
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
                  stmt.setNull( 40 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(40, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[75], 6);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[77], 20);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(43, ((Number) parms[79]).intValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(44, (java.util.Date)parms[81], false);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(45, (java.util.Date)parms[83], false);
               }
               stmt.setShort(46, ((Number) parms[84]).shortValue());
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
                  stmt.setNull( 31 , Types.DATE );
               }
               else
               {
                  stmt.setDate(31, (java.util.Date)parms[53]);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[55], 40);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(33, ((Number) parms[57]).intValue());
               }
               stmt.setDate(34, (java.util.Date)parms[58]);
               stmt.setShort(35, ((Number) parms[59]).shortValue());
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
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 60);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 13 :
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
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[28], 3);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[30], 1);
               }
               stmt.setDate(20, (java.util.Date)parms[31]);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 15 :
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
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 4);
               stmt.setString(10, (String)parms[9], 60);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 1);
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
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 4);
               stmt.setString(10, (String)parms[9], 30);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

