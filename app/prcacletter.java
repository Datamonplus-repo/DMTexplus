package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class prcacletter extends GXReport
{
   public prcacletter( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prcacletter.class ), "" );
   }

   public prcacletter( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 )
   {
      prcacletter.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      prcacletter.this.AV181EmprCod = aP0[0];
      this.aP0 = aP0;
      prcacletter.this.AV148BarCod = aP1[0];
      this.aP1 = aP1;
      prcacletter.this.AV150BarCodReo = aP2[0];
      this.aP2 = aP2;
      prcacletter.this.AV149BarCodPar = aP3[0];
      this.aP3 = aP3;
      prcacletter.this.AV152BarMaqCod = aP4[0];
      this.aP4 = aP4;
      prcacletter.this.AV154BarSua = aP5[0];
      this.aP5 = aP5;
      prcacletter.this.AV286Volumen = aP6[0];
      this.aP6 = aP6;
      prcacletter.this.AV278RecLinMaq = aP7[0];
      this.aP7 = aP7;
      prcacletter.this.AV226ImpCod = aP8[0];
      this.aP8 = aP8;
      prcacletter.this.Gx_out = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 1 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 1, 15840, 12240, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Receta Acabado formato LETTER") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Execute user subroutine: 'INICIAMOS' */
         S161 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV378TotBanyos = (short)(0) ;
         AV379NumBanyo = (short)(0) ;
         /* Using cursor P05M62 */
         pr_default.execute(0, new Object[] {AV181EmprCod, Integer.valueOf(AV148BarCod), Byte.valueOf(AV150BarCodReo), AV149BarCodPar, AV152BarMaqCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A6039RecAcab = P05M62_A6039RecAcab[0] ;
            n6039RecAcab = P05M62_n6039RecAcab[0] ;
            A602MaqCod = P05M62_A602MaqCod[0] ;
            A130BarCodPar = P05M62_A130BarCodPar[0] ;
            A132BarCodReo = P05M62_A132BarCodReo[0] ;
            A129BarCod = P05M62_A129BarCod[0] ;
            A396EmprCod = P05M62_A396EmprCod[0] ;
            A2804RecLinMaq = P05M62_A2804RecLinMaq[0] ;
            if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) == 0 )
            {
               AV378TotBanyos = (short)(AV378TotBanyos+1) ;
               if ( AV278RecLinMaq == A2804RecLinMaq )
               {
                  AV379NumBanyo = AV378TotBanyos ;
               }
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV172Coste = DecimalUtil.doubleToDec(0) ;
         AV173Coste2 = DecimalUtil.doubleToDec(0) ;
         AV175DesCol = GXutil.substring( AV251TipCol, 1, 15) ;
         AV176DesInt = GXutil.substring( AV227Intens, 1, 20) ;
         GxHdr3 = true ;
         /* Using cursor P05M66 */
         pr_default.execute(1, new Object[] {AV181EmprCod, Integer.valueOf(AV148BarCod), Byte.valueOf(AV150BarCodReo), AV149BarCodPar, Short.valueOf(AV278RecLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3915EmpNumDec = P05M66_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P05M66_n3915EmpNumDec[0] ;
            A130BarCodPar = P05M66_A130BarCodPar[0] ;
            A132BarCodReo = P05M66_A132BarCodReo[0] ;
            A396EmprCod = P05M66_A396EmprCod[0] ;
            A129BarCod = P05M66_A129BarCod[0] ;
            A2804RecLinMaq = P05M66_A2804RecLinMaq[0] ;
            A4018BarBot = P05M66_A4018BarBot[0] ;
            A6434BarAsi = P05M66_A6434BarAsi[0] ;
            A4833BarAudTur = P05M66_A4833BarAudTur[0] ;
            n4833BarAudTur = P05M66_n4833BarAudTur[0] ;
            A4937BarCtrPdas = P05M66_A4937BarCtrPdas[0] ;
            n4937BarCtrPdas = P05M66_n4937BarCtrPdas[0] ;
            A4467BarAcaMar = P05M66_A4467BarAcaMar[0] ;
            A5115RecAbsFac = P05M66_A5115RecAbsFac[0] ;
            A9998RecAnc = P05M66_A9998RecAnc[0] ;
            n9998RecAnc = P05M66_n9998RecAnc[0] ;
            A9996RecObsq = P05M66_A9996RecObsq[0] ;
            n9996RecObsq = P05M66_n9996RecObsq[0] ;
            A9997Recgrm = P05M66_A9997Recgrm[0] ;
            n9997Recgrm = P05M66_n9997Recgrm[0] ;
            A9764RecLtsSR = P05M66_A9764RecLtsSR[0] ;
            n9764RecLtsSR = P05M66_n9764RecLtsSR[0] ;
            A11507RecAva = P05M66_A11507RecAva[0] ;
            n11507RecAva = P05M66_n11507RecAva[0] ;
            A12128RecAs = P05M66_A12128RecAs[0] ;
            n12128RecAs = P05M66_n12128RecAs[0] ;
            A12129RecAi = P05M66_A12129RecAi[0] ;
            n12129RecAi = P05M66_n12129RecAi[0] ;
            A148BarEstReo = P05M66_A148BarEstReo[0] ;
            A3006BarCoef = P05M66_A3006BarCoef[0] ;
            n3006BarCoef = P05M66_n3006BarCoef[0] ;
            A1226BarGraCru = P05M66_A1226BarGraCru[0] ;
            A4268RecOrdLin = P05M66_A4268RecOrdLin[0] ;
            n4268RecOrdLin = P05M66_n4268RecOrdLin[0] ;
            A4812BarEncCli = P05M66_A4812BarEncCli[0] ;
            A4867RecFecMod = P05M66_A4867RecFecMod[0] ;
            n4867RecFecMod = P05M66_n4867RecFecMod[0] ;
            A4868RecUsrMod = P05M66_A4868RecUsrMod[0] ;
            n4868RecUsrMod = P05M66_n4868RecUsrMod[0] ;
            A4866RecFecAlt = P05M66_A4866RecFecAlt[0] ;
            n4866RecFecAlt = P05M66_n4866RecFecAlt[0] ;
            A4402RecUsrCod = P05M66_A4402RecUsrCod[0] ;
            A5109RecNumInt = P05M66_A5109RecNumInt[0] ;
            A212BarSer = P05M66_A212BarSer[0] ;
            A224BarTraP1 = P05M66_A224BarTraP1[0] ;
            A221BarTra1 = P05M66_A221BarTra1[0] ;
            A225BarTraP2 = P05M66_A225BarTraP2[0] ;
            A222BarTra2 = P05M66_A222BarTra2[0] ;
            A226BarTraP3 = P05M66_A226BarTraP3[0] ;
            A223BarTra3 = P05M66_A223BarTra3[0] ;
            A217BarTipArt = P05M66_A217BarTipArt[0] ;
            n217BarTipArt = P05M66_n217BarTipArt[0] ;
            A3137BarGraAca2 = P05M66_A3137BarGraAca2[0] ;
            A1652BarSerDsc = P05M66_A1652BarSerDsc[0] ;
            A126BarAncAca2 = P05M66_A126BarAncAca2[0] ;
            A125BarAncAca1 = P05M66_A125BarAncAca1[0] ;
            A1909BarGraAca = P05M66_A1909BarGraAca[0] ;
            A143BarDisNum = P05M66_A143BarDisNum[0] ;
            A2806RecFA = P05M66_A2806RecFA[0] ;
            A5110RecNumPrg = P05M66_A5110RecNumPrg[0] ;
            A218BarTipCol = P05M66_A218BarTipCol[0] ;
            A136BarColNum = P05M66_A136BarColNum[0] ;
            A135BarColNom = P05M66_A135BarColNom[0] ;
            A279CliNom = P05M66_A279CliNom[0] ;
            A252CliCod = P05M66_A252CliCod[0] ;
            n252CliCod = P05M66_n252CliCod[0] ;
            A9812RecHdrLts = P05M66_A9812RecHdrLts[0] ;
            n9812RecHdrLts = P05M66_n9812RecHdrLts[0] ;
            A9811RecAbs2 = P05M66_A9811RecAbs2[0] ;
            n9811RecAbs2 = P05M66_n9811RecAbs2[0] ;
            A4271RecFagKgs = P05M66_A4271RecFagKgs[0] ;
            A4259RecTotKgs = P05M66_A4259RecTotKgs[0] ;
            A4272RecFagMts = P05M66_A4272RecFagMts[0] ;
            A4260RecTotMts = P05M66_A4260RecTotMts[0] ;
            n4260RecTotMts = P05M66_n4260RecTotMts[0] ;
            A184BarMtr = P05M66_A184BarMtr[0] ;
            n184BarMtr = P05M66_n184BarMtr[0] ;
            A870BarTotMtr = P05M66_A870BarTotMtr[0] ;
            n870BarTotMtr = P05M66_n870BarTotMtr[0] ;
            A3915EmpNumDec = P05M66_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P05M66_n3915EmpNumDec[0] ;
            A4018BarBot = P05M66_A4018BarBot[0] ;
            A6434BarAsi = P05M66_A6434BarAsi[0] ;
            A4833BarAudTur = P05M66_A4833BarAudTur[0] ;
            n4833BarAudTur = P05M66_n4833BarAudTur[0] ;
            A4937BarCtrPdas = P05M66_A4937BarCtrPdas[0] ;
            n4937BarCtrPdas = P05M66_n4937BarCtrPdas[0] ;
            A4467BarAcaMar = P05M66_A4467BarAcaMar[0] ;
            A148BarEstReo = P05M66_A148BarEstReo[0] ;
            A3006BarCoef = P05M66_A3006BarCoef[0] ;
            n3006BarCoef = P05M66_n3006BarCoef[0] ;
            A1226BarGraCru = P05M66_A1226BarGraCru[0] ;
            A4812BarEncCli = P05M66_A4812BarEncCli[0] ;
            A212BarSer = P05M66_A212BarSer[0] ;
            A224BarTraP1 = P05M66_A224BarTraP1[0] ;
            A221BarTra1 = P05M66_A221BarTra1[0] ;
            A225BarTraP2 = P05M66_A225BarTraP2[0] ;
            A222BarTra2 = P05M66_A222BarTra2[0] ;
            A226BarTraP3 = P05M66_A226BarTraP3[0] ;
            A223BarTra3 = P05M66_A223BarTra3[0] ;
            A217BarTipArt = P05M66_A217BarTipArt[0] ;
            n217BarTipArt = P05M66_n217BarTipArt[0] ;
            A3137BarGraAca2 = P05M66_A3137BarGraAca2[0] ;
            A1652BarSerDsc = P05M66_A1652BarSerDsc[0] ;
            A126BarAncAca2 = P05M66_A126BarAncAca2[0] ;
            A125BarAncAca1 = P05M66_A125BarAncAca1[0] ;
            A1909BarGraAca = P05M66_A1909BarGraAca[0] ;
            A143BarDisNum = P05M66_A143BarDisNum[0] ;
            A218BarTipCol = P05M66_A218BarTipCol[0] ;
            A136BarColNum = P05M66_A136BarColNum[0] ;
            A135BarColNom = P05M66_A135BarColNom[0] ;
            A252CliCod = P05M66_A252CliCod[0] ;
            n252CliCod = P05M66_n252CliCod[0] ;
            A279CliNom = P05M66_A279CliNom[0] ;
            A870BarTotMtr = P05M66_A870BarTotMtr[0] ;
            n870BarTotMtr = P05M66_n870BarTotMtr[0] ;
            A184BarMtr = P05M66_A184BarMtr[0] ;
            n184BarMtr = P05M66_n184BarMtr[0] ;
            A4271RecFagKgs = P05M66_A4271RecFagKgs[0] ;
            A4272RecFagMts = P05M66_A4272RecFagMts[0] ;
            A4317RecMaqMts = A4260RecTotMts.add(A4272RecFagMts) ;
            A4316RecMaqKgs = A4259RecTotKgs.add(A4271RecFagKgs) ;
            if ( A870BarTotMtr.doubleValue() != 0 )
            {
               A871RecTotMtr = A870BarTotMtr.add(A184BarMtr) ;
            }
            else
            {
               A871RecTotMtr = A184BarMtr ;
            }
            AV366S = " " ;
            AV367C = " " ;
            AV370P = A4018BarBot ;
            AV368Pf = " " ;
            if ( A6434BarAsi == 1 )
            {
               AV367C = httpContext.getMessage( "N", "") ;
            }
            if ( A6434BarAsi == 2 )
            {
               AV367C = httpContext.getMessage( "S", "") ;
            }
            if ( A4833BarAudTur == 1 )
            {
               AV366S = httpContext.getMessage( "N", "") ;
            }
            if ( A4833BarAudTur == 2 )
            {
               AV366S = httpContext.getMessage( "S", "") ;
            }
            if ( A4937BarCtrPdas == 1 )
            {
               AV368Pf = httpContext.getMessage( "S", "") ;
            }
            AV369Forcodext = ((GXutil.strcmp(A4467BarAcaMar, "0")==0) ? " " : A4467BarAcaMar) ;
            AV156CliCod = A252CliCod ;
            AV145ArtCod = A212BarSer ;
            AV245ForColNom = A135BarColNom ;
            AV246ForColNum = A136BarColNum ;
            AV162Colorante = AV252TipColCod ;
            AV339Recabsfac = (short)(DecimalUtil.decToDouble(A5115RecAbsFac)) ;
            AV337RecAnc = A9998RecAnc ;
            AV340RecObsq = A9996RecObsq ;
            AV338Recgrm = A9997Recgrm ;
            AV346RecLtssr = A9764RecLtsSR ;
            AV362Recava = A11507RecAva ;
            AV364RecAs = A12128RecAs ;
            AV365RecAi = A12129RecAi ;
            AV197Remonta = "" ;
            if ( A148BarEstReo >= 1 )
            {
               AV197Remonta = AV260Lit44 ;
            }
            AV228Largura = DecimalUtil.doubleToDec(A125BarAncAca1/ (double) (100)) ;
            AV151BarGraAca = A1909BarGraAca ;
            AV250TiempoV = A3006BarCoef ;
            AV222GrMlin = DecimalUtil.doubleToDec(A1226BarGraCru*(A125BarAncAca1/ (double) (100))) ;
            AV164CompTP = DecimalUtil.doubleToDec(0) ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV222GrMlin)==0) )
            {
               AV164CompTP = (A4316RecMaqKgs.multiply(DecimalUtil.doubleToDec(1000))).divide(AV222GrMlin, 18, java.math.RoundingMode.DOWN) ;
            }
            AV266Lts1 = AV286Volumen ;
            AV267Lts2 = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV266Lts1).subtract((DecimalUtil.doubleToDec(2).multiply(A4316RecMaqKgs))))) ;
            AV279RelBany = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV286Volumen).divide(A4316RecMaqKgs, 18, java.math.RoundingMode.DOWN)), 0))) ;
            GX_I = 1 ;
            while ( GX_I <= 6 )
            {
               AV193Procesos[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 6 )
            {
               AV194Tiempos[GX_I-1] = (short)(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV225I = (byte)(1) ;
            AV254TotTiempo = 0 ;
            /* Using cursor P05M67 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV278RecLinMaq)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2804RecLinMaq = P05M67_A2804RecLinMaq[0] ;
               A764ProForCod = P05M67_A764ProForCod[0] ;
               A771ProForTie = P05M67_A771ProForTie[0] ;
               A1273RecLinPro = P05M67_A1273RecLinPro[0] ;
               A771ProForTie = P05M67_A771ProForTie[0] ;
               AV193Procesos[AV225I-1] = A764ProForCod ;
               AV194Tiempos[AV225I-1] = A771ProForTie ;
               AV254TotTiempo = (long)(AV254TotTiempo+A771ProForTie) ;
               AV225I = (byte)(AV225I+1) ;
               if ( AV225I > 6 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            GX_I = 1 ;
            while ( GX_I <= 10 )
            {
               AV310RecObs[GX_I-1] = GXutil.space( (short)(60)) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV225I = (byte)(1) ;
            /* Using cursor P05M68 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A5258RecTxtObs = P05M68_A5258RecTxtObs[0] ;
               n5258RecTxtObs = P05M68_n5258RecTxtObs[0] ;
               A5257RecLinObs = P05M68_A5257RecLinObs[0] ;
               if ( AV225I > 2 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV310RecObs[AV225I-1] = A5258RecTxtObs ;
               AV225I = (byte)(AV225I+1) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV224HojRut = "*" + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
            AV198Hdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.str( A132BarCodReo, 1, 0) + " " + A130BarCodPar ;
            /* Execute user subroutine: 'DESCMAQ' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( (0==AV273NumCam) )
            {
               AV273NumCam = (byte)(1) ;
            }
            AV163CompCamar = AV164CompTP.divide(DecimalUtil.doubleToDec(AV273NumCam), 18, java.math.RoundingMode.DOWN) ;
            /* Using cursor P05M69 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV278RecLinMaq)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A4587ProRecObs = P05M69_A4587ProRecObs[0] ;
               A1273RecLinPro = P05M69_A1273RecLinPro[0] ;
               A2804RecLinMaq = P05M69_A2804RecLinMaq[0] ;
               A772ProForTmx = P05M69_A772ProForTmx[0] ;
               A2393ProNumRec = P05M69_A2393ProNumRec[0] ;
               A2392ProNumPro = P05M69_A2392ProNumPro[0] ;
               A766ProForDsc = P05M69_A766ProForDsc[0] ;
               A771ProForTie = P05M69_A771ProForTie[0] ;
               A764ProForCod = P05M69_A764ProForCod[0] ;
               A772ProForTmx = P05M69_A772ProForTmx[0] ;
               A2393ProNumRec = P05M69_A2393ProNumRec[0] ;
               A2392ProNumPro = P05M69_A2392ProNumPro[0] ;
               A766ProForDsc = P05M69_A766ProForDsc[0] ;
               A771ProForTie = P05M69_A771ProForTie[0] ;
               AV344Profortmx = A772ProForTmx ;
               h5M60( false, 27) ;
               getPrinter().GxDrawRect(6, Gx_line+2, 779, Gx_line+25, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "m", ""), 506, Gx_line+5, 517, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 34, Gx_line+5, 84, Gx_line+22, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9")), 469, Gx_line+5, 499, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 97, Gx_line+5, 348, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9")), 633, Gx_line+5, 670, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9")), 739, Gx_line+5, 776, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV214Lit35, "")), 398, Gx_line+5, 470, Gx_line+21, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV216Lit37, "")), 677, Gx_line+5, 735, Gx_line+22, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Temp", ""), 294, Gx_line+5, 325, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV344Profortmx), "ZZZZ")), 343, Gx_line+4, 382, Gx_line+23, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV215Lit36, "")), 550, Gx_line+5, 633, Gx_line+22, 2, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+27) ;
               /* Using cursor P05M610 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A719PrdNum = P05M610_A719PrdNum[0] ;
                  n719PrdNum = P05M610_n719PrdNum[0] ;
                  A488ForPrdDsc = P05M610_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P05M610_n488ForPrdDsc[0] ;
                  A431FacCon = P05M610_A431FacCon[0] ;
                  A2394RecForNro = P05M610_A2394RecForNro[0] ;
                  A1643PrdTip = P05M610_A1643PrdTip[0] ;
                  A5416PrdDensS = P05M610_A5416PrdDensS[0] ;
                  A4693PrdNum2 = P05M610_A4693PrdNum2[0] ;
                  A872RecPrdNum = P05M610_A872RecPrdNum[0] ;
                  A875RecPrdDsc = P05M610_A875RecPrdDsc[0] ;
                  A686PrdCant = P05M610_A686PrdCant[0] ;
                  A490ForPrdUMe = P05M610_A490ForPrdUMe[0] ;
                  n490ForPrdUMe = P05M610_n490ForPrdUMe[0] ;
                  A743PrdUniCon = P05M610_A743PrdUniCon[0] ;
                  A5725RecLote = P05M610_A5725RecLote[0] ;
                  A707PrdFacCon = P05M610_A707PrdFacCon[0] ;
                  A724PrdPreAct = P05M610_A724PrdPreAct[0] ;
                  A811RecLin = P05M610_A811RecLin[0] ;
                  A1643PrdTip = P05M610_A1643PrdTip[0] ;
                  A5416PrdDensS = P05M610_A5416PrdDensS[0] ;
                  A4693PrdNum2 = P05M610_A4693PrdNum2[0] ;
                  A743PrdUniCon = P05M610_A743PrdUniCon[0] ;
                  A707PrdFacCon = P05M610_A707PrdFacCon[0] ;
                  A724PrdPreAct = P05M610_A724PrdPreAct[0] ;
                  A488ForPrdDsc = P05M610_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P05M610_n488ForPrdDsc[0] ;
                  if ( AV376Cambiarcpp == 1 )
                  {
                  }
                  AV257Var2 = GXutil.substring( A488ForPrdDsc, 1, 4) ;
                  AV256Var1 = GXutil.str( A431FacCon, 11, 5) + " " + AV257Var2 ;
                  if ( (0==A2394RecForNro) )
                  {
                     AV277RecForNro = "  " ;
                  }
                  else
                  {
                     AV277RecForNro = GXutil.str( A2394RecForNro, 2, 0) ;
                  }
                  if ( AV343Orient == 1 )
                  {
                     if ( GXutil.strcmp(A1643PrdTip, httpContext.getMessage( "A", "")) == 0 )
                     {
                        AV277RecForNro = httpContext.getMessage( "AUT", "") ;
                     }
                     else
                     {
                        AV277RecForNro = httpContext.getMessage( "MAN", "") ;
                     }
                  }
                  AV372Densidad = A5416PrdDensS ;
                  AV345PrdAux = ((AV352Jpf==1) ? GXutil.str( AV372Densidad, 7, 5) : GXutil.substring( A4693PrdNum2, 1, 3)) ;
                  if ( (GXutil.strcmp("", A872RecPrdNum)==0) )
                  {
                     if ( (GXutil.strcmp("", A875RecPrdDsc)==0) && ( AV191FlagNline == 0 ) )
                     {
                        h5M60( false, 10) ;
                        getPrinter().GxDrawLine(6, Gx_line+6, 779, Gx_line+6, 1, 0, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+10) ;
                     }
                     else
                     {
                        if ( GXutil.strcmp(A875RecPrdDsc, ".") == 0 )
                        {
                        }
                        else
                        {
                           AV275PrdDsc = A875RecPrdDsc ;
                           h5M60( false, 17) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV275PrdDsc, "")), 206, Gx_line+0, 423, Gx_line+17, 0, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+17) ;
                        }
                     }
                  }
                  else
                  {
                     AV161CodPrd = GXutil.substring( A872RecPrdNum, 1, 1) ;
                     if ( AV189FlagImp == 1 )
                     {
                        if ( ( ( A686PrdCant.doubleValue() >= 1000 ) && ( ( GXutil.strcmp(AV161CodPrd, "0") == 0 ) || ( GXutil.strcmp(AV161CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV161CodPrd, "9") == 0 ) ) && ( AV377todosproductos == 0 ) ) || ( ( ( GXutil.strcmp(AV161CodPrd, "0") >= 0 ) && ( GXutil.strcmp(AV161CodPrd, "9") <= 0 ) ) && ( AV377todosproductos == 1 ) ) )
                        {
                           AV155Cantidad = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                           if ( A490ForPrdUMe == 2 )
                           {
                              AV255Unidades = httpContext.getMessage( "l", "") ;
                           }
                           else
                           {
                              if ( A490ForPrdUMe == 3 )
                              {
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV255Unidades = httpContext.getMessage( "l", "") ;
                                 }
                                 else
                                 {
                                    AV255Unidades = httpContext.getMessage( "kg", "") ;
                                 }
                              }
                              else
                              {
                                 AV255Unidades = httpContext.getMessage( "kg", "") ;
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV255Unidades = httpContext.getMessage( "l", "") ;
                                 }
                              }
                           }
                        }
                        else
                        {
                           AV155Cantidad = A686PrdCant ;
                           if ( A490ForPrdUMe == 2 )
                           {
                              AV255Unidades = httpContext.getMessage( "cc", "") ;
                           }
                           else
                           {
                              if ( A490ForPrdUMe == 3 )
                              {
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV255Unidades = httpContext.getMessage( "cc", "") ;
                                 }
                                 else
                                 {
                                    AV255Unidades = httpContext.getMessage( "g", "") ;
                                 }
                              }
                              else
                              {
                                 AV255Unidades = httpContext.getMessage( "g", "") ;
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV255Unidades = httpContext.getMessage( "cc", "") ;
                                 }
                              }
                           }
                        }
                        if ( ( GXutil.strcmp(AV161CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV161CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV161CodPrd, "0") == 0 ) )
                        {
                           AV317Cant_a = GXutil.str( AV155Cantidad, 11, 3) ;
                           if ( ( GXutil.strcmp(GXutil.substring( AV317Cant_a, 9, 3), "000") == 0 ) && ( AV319Sin_dec == 1 ) )
                           {
                              AV318Cant_sd = (int)(GXutil.Int( DecimalUtil.decToDouble(AV155Cantidad))) ;
                              if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                              {
                                 h5M60( false, 40) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV318Cant_sd), "ZZZ,ZZZ")), 525, Gx_line+0, 577, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255Unidades, "")), 584, Gx_line+0, 606, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(607, Gx_line+25, 736, Gx_line+42, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+40) ;
                              }
                              else
                              {
                                 h5M60( false, 17) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV318Cant_sd), "ZZZ,ZZZ")), 525, Gx_line+0, 577, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255Unidades, "")), 581, Gx_line+0, 603, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(607, Gx_line+0, 736, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(651, Gx_line+1, 651, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(692, Gx_line+0, 692, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(734, Gx_line+0, 734, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV345PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+17) ;
                              }
                           }
                           else
                           {
                              if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                              {
                                 h5M60( false, 17) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV155Cantidad, "ZZZ,ZZ9.9999")), 489, Gx_line+0, 578, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255Unidades, "")), 581, Gx_line+0, 603, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+17) ;
                              }
                              else
                              {
                                 h5M60( false, 18) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV155Cantidad, "ZZZ,ZZ9.9999")), 489, Gx_line+0, 578, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255Unidades, "")), 581, Gx_line+0, 603, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV345PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(607, Gx_line+0, 736, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(651, Gx_line+1, 651, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(692, Gx_line+0, 692, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(740, Gx_line+0, 740, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+18) ;
                              }
                           }
                        }
                        else
                        {
                           if ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), httpContext.getMessage( "C", "")) == 0 )
                           {
                              h5M60( false, 17) ;
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 370, Gx_line+17, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+17) ;
                           }
                           else
                           {
                              AV317Cant_a = GXutil.str( AV155Cantidad, 11, 3) ;
                              if ( ( GXutil.strcmp(GXutil.substring( AV317Cant_a, 9, 3), "000") == 0 ) && ( AV319Sin_dec == 1 ) )
                              {
                                 AV318Cant_sd = (int)(GXutil.Int( DecimalUtil.decToDouble(AV155Cantidad))) ;
                                 if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                                 {
                                    h5M60( false, 18) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV318Cant_sd), "ZZZ,ZZZ")), 518, Gx_line+0, 577, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255Unidades, "")), 581, Gx_line+1, 603, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+18) ;
                                 }
                                 else
                                 {
                                    h5M60( false, 19) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV318Cant_sd), "ZZZ,ZZZ")), 518, Gx_line+0, 577, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawRect(607, Gx_line+0, 736, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(651, Gx_line+1, 651, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(692, Gx_line+0, 692, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(734, Gx_line+0, 734, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255Unidades, "")), 581, Gx_line+1, 603, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV345PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+19) ;
                                 }
                              }
                              else
                              {
                                 if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                                 {
                                    h5M60( false, 19) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 211, Gx_line+0, 261, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV155Cantidad, "ZZZ,ZZ9.9999")), 476, Gx_line+0, 577, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255Unidades, "")), 581, Gx_line+1, 603, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+19) ;
                                 }
                                 else
                                 {
                                    h5M60( false, 18) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 206, Gx_line+0, 256, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV155Cantidad, "ZZZ,ZZ9.9999")), 476, Gx_line+0, 577, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV255Unidades, "")), 581, Gx_line+1, 603, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawRect(607, Gx_line+0, 736, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(651, Gx_line+1, 651, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(692, Gx_line+0, 692, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(734, Gx_line+0, 734, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV345PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+18) ;
                                 }
                              }
                           }
                        }
                     }
                     else
                     {
                        AV155Cantidad = A686PrdCant ;
                        if ( ( GXutil.strcmp(AV161CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV161CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV161CodPrd, "0") == 0 ) )
                        {
                           AV317Cant_a = GXutil.str( AV155Cantidad, 11, 3) ;
                           if ( ( GXutil.strcmp(GXutil.substring( AV317Cant_a, 9, 3), "000") == 0 ) && ( AV319Sin_dec == 1 ) )
                           {
                              AV318Cant_sd = (int)(GXutil.Int( DecimalUtil.decToDouble(AV155Cantidad))) ;
                              if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                              {
                                 h5M60( false, 18) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV318Cant_sd), "ZZZ,ZZZ")), 525, Gx_line+0, 577, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+18) ;
                              }
                              else
                              {
                                 h5M60( false, 18) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV318Cant_sd), "ZZZ,ZZZ")), 525, Gx_line+0, 577, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(607, Gx_line+0, 736, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(656, Gx_line+1, 656, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(697, Gx_line+0, 697, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(740, Gx_line+0, 740, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV345PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+18) ;
                              }
                           }
                           else
                           {
                              if ( AV361Er == 0 )
                              {
                                 if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                                 {
                                    h5M60( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV155Cantidad, "ZZZ,ZZ9.9999")), 489, Gx_line+0, 578, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                 }
                                 else
                                 {
                                    h5M60( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV155Cantidad, "ZZZ,ZZ9.9999")), 489, Gx_line+0, 578, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawRect(607, Gx_line+0, 736, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(656, Gx_line+1, 656, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(697, Gx_line+0, 697, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(740, Gx_line+0, 740, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV345PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                 }
                              }
                              else
                              {
                                 h5M60( false, 18) ;
                                 getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 162, Gx_line+19, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 167, Gx_line+0, 224, Gx_line+19, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 228, Gx_line+0, 461, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV155Cantidad, "ZZZ,ZZ9.9999")), 464, Gx_line+0, 578, Gx_line+19, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV345PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(607, Gx_line+0, 733, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(656, Gx_line+0, 656, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(697, Gx_line+0, 697, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+18) ;
                              }
                           }
                        }
                        else
                        {
                           if ( GXutil.strcmp(GXutil.substring( A872RecPrdNum, 1, 1), httpContext.getMessage( "C", "")) == 0 )
                           {
                              h5M60( false, 17) ;
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 370, Gx_line+17, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+17) ;
                           }
                           else
                           {
                              AV317Cant_a = GXutil.str( AV155Cantidad, 11, 3) ;
                              if ( ( GXutil.strcmp(GXutil.substring( AV317Cant_a, 9, 3), "000") == 0 ) && ( AV319Sin_dec == 1 ) )
                              {
                                 AV318Cant_sd = (int)(GXutil.Int( DecimalUtil.decToDouble(AV155Cantidad))) ;
                                 if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                                 {
                                    h5M60( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV318Cant_sd), "ZZZ,ZZZ")), 525, Gx_line+0, 577, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                 }
                                 else
                                 {
                                    h5M60( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV318Cant_sd), "ZZZ,ZZZ")), 525, Gx_line+0, 577, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawRect(607, Gx_line+0, 736, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(656, Gx_line+1, 656, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(697, Gx_line+0, 697, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(740, Gx_line+0, 740, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV345PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                 }
                              }
                              else
                              {
                                 if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                                 {
                                    h5M60( false, 18) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV155Cantidad, "ZZZ,ZZ9.9999")), 476, Gx_line+0, 577, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+18) ;
                                 }
                                 else
                                 {
                                    h5M60( false, 18) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV256Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV277RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawRect(607, Gx_line+0, 736, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(656, Gx_line+1, 656, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(697, Gx_line+0, 697, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(740, Gx_line+0, 740, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV155Cantidad, "ZZZ,ZZ9.9999")), 476, Gx_line+0, 577, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV345PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+18) ;
                                 }
                              }
                           }
                        }
                     }
                  }
                  if ( AV182Flag == 1 )
                  {
                     if ( A3915EmpNumDec == 0 )
                     {
                        AV173Coste2 = AV173Coste2.add((A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                     }
                     else
                     {
                        if ( A3915EmpNumDec == 2 )
                        {
                           if ( A490ForPrdUMe == 4 )
                           {
                              AV173Coste2 = AV173Coste2.add(GXutil.roundDecimal( A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon), 2)) ;
                           }
                           else
                           {
                              AV173Coste2 = AV173Coste2.add(GXutil.roundDecimal( A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
                           }
                        }
                     }
                  }
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               if ( ! (GXutil.strcmp("", A4587ProRecObs)==0) )
               {
                  AV330Nlin = (short)(GXutil.gxmlines( A4587ProRecObs, (short)(40))) ;
                  if ( AV330Nlin > 20 )
                  {
                     AV330Nlin = (short)(20) ;
                  }
                  AV331j = (short)(1) ;
                  while ( AV331j <= AV330Nlin )
                  {
                     AV332Obs_l = GXutil.gxgetmli( A4587ProRecObs, AV331j, (short)(40)) ;
                     if ( GXutil.strcmp(AV332Obs_l, " ") != 0 )
                     {
                        if ( AV331j == 1 )
                        {
                           h5M60( false, 32) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV332Obs_l, "")), 6, Gx_line+16, 507, Gx_line+33, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(httpContext.getMessage( "Observaçoes", ""), 6, Gx_line+0, 79, Gx_line+18, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+32) ;
                        }
                        else
                        {
                           h5M60( false, 17) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV332Obs_l, "")), 6, Gx_line+0, 507, Gx_line+17, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+17) ;
                        }
                     }
                     AV331j = (short)(AV331j+1) ;
                  }
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            if ( AV182Flag == 1 )
            {
               if ( A3915EmpNumDec == 0 )
               {
                  AV172Coste = AV173Coste2 ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     AV172Coste = GXutil.roundDecimal( AV173Coste2, 2) ;
                  }
               }
               if ( A4316RecMaqKgs.doubleValue() != 0 )
               {
                  if ( A3915EmpNumDec == 0 )
                  {
                     AV170CosKgm = AV172Coste.divide(A4316RecMaqKgs, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     if ( A3915EmpNumDec == 2 )
                     {
                        AV170CosKgm = GXutil.roundDecimal( AV172Coste.divide(A4316RecMaqKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                     }
                  }
               }
               else
               {
                  AV170CosKgm = DecimalUtil.doubleToDec(0) ;
               }
               if ( A871RecTotMtr.doubleValue() != 0 )
               {
                  if ( A3915EmpNumDec == 0 )
                  {
                     AV171CosMtr = AV172Coste.divide(A4317RecMaqMts, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     if ( A3915EmpNumDec == 2 )
                     {
                        AV171CosMtr = GXutil.roundDecimal( AV172Coste.divide(A4317RecMaqMts, 18, java.math.RoundingMode.DOWN), 2) ;
                     }
                  }
               }
               else
               {
                  AV171CosMtr = DecimalUtil.doubleToDec(0) ;
               }
               h5M60( false, 21) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "K", ""), 645, Gx_line+4, 655, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "M", ""), 754, Gx_line+4, 766, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV172Coste, "ZZZZZZ9.99")), 7, Gx_line+4, 81, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV170CosKgm, "ZZZZZZ9.99")), 552, Gx_line+4, 626, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV171CosMtr, "ZZZZZZ9.99")), 667, Gx_line+4, 741, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+2, 780, Gx_line+2, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+21) ;
            }
            if ( AV329Carvema == 0 )
            {
               /* Execute user subroutine: 'OBSFOR' */
               S141 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  pr_default.close(1);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV328Recordlin = A4268RecOrdLin ;
            if ( AV373piolera == 1 )
            {
               h5M60( false, 56) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("_____________________", 36, Gx_line+23, 190, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Gerente de Produccion", ""), 45, Gx_line+38, 182, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("_________________________", 222, Gx_line+23, 376, Gx_line+37, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Jefe de Planta", ""), 255, Gx_line+38, 341, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("_________________________", 407, Gx_line+23, 561, Gx_line+37, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Jefe de Turno", ""), 443, Gx_line+38, 526, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("_________________________", 592, Gx_line+23, 746, Gx_line+37, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Bodega de Quimicos", ""), 607, Gx_line+38, 729, Gx_line+52, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+56) ;
            }
            else
            {
               if ( AV380anahuac == 1 )
               {
                  h5M60( false, 57) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("_____________________", 38, Gx_line+29, 192, Gx_line+43, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Autoriza", ""), 90, Gx_line+44, 139, Gx_line+58, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText("_________________________", 314, Gx_line+29, 468, Gx_line+43, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Recibido", ""), 349, Gx_line+44, 402, Gx_line+58, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText("_________________________", 590, Gx_line+29, 744, Gx_line+43, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Entrega", ""), 643, Gx_line+44, 690, Gx_line+58, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+57) ;
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         GxHdr3 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h5M60( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S126( ) throws ProcessInterruptedException
   {
      /* 'AGRUPADAS' Routine */
      returnInSub = false ;
      AV287Flag_Agr = (byte)(0) ;
      /* Using cursor P05M611 */
      pr_default.execute(6, new Object[] {AV181EmprCod, Integer.valueOf(AV148BarCod), Byte.valueOf(AV150BarCodReo), AV149BarCodPar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A130BarCodPar = P05M611_A130BarCodPar[0] ;
         A132BarCodReo = P05M611_A132BarCodReo[0] ;
         A129BarCod = P05M611_A129BarCod[0] ;
         A396EmprCod = P05M611_A396EmprCod[0] ;
         A6034Ac_Metros = P05M611_A6034Ac_Metros[0] ;
         n6034Ac_Metros = P05M611_n6034Ac_Metros[0] ;
         A6035Ac_Kilos = P05M611_A6035Ac_Kilos[0] ;
         n6035Ac_Kilos = P05M611_n6035Ac_Kilos[0] ;
         A6033Ac_BarPar = P05M611_A6033Ac_BarPar[0] ;
         A6032Ac_BarReo = P05M611_A6032Ac_BarReo[0] ;
         A6031Ac_Barcod = P05M611_A6031Ac_Barcod[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A6031Ac_Barcod ;
         GXv_int3[0] = A6032Ac_BarReo ;
         GXv_char4[0] = A6033Ac_BarPar ;
         GXv_int5[0] = AV322CliCod_a ;
         GXv_char6[0] = AV289CliNom_a ;
         GXv_char7[0] = AV323BarSer_a ;
         GXv_char8[0] = AV290SerDsc_a ;
         GXv_int9[0] = AV336Barancaca1 ;
         GXv_char10[0] = AV359Barcolnom ;
         GXv_int11[0] = AV360Barcolnum ;
         new app.prac007(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_char7, GXv_char8, GXv_int9, GXv_char10, GXv_int11) ;
         prcacletter.this.A396EmprCod = GXv_char1[0] ;
         prcacletter.this.A6031Ac_Barcod = GXv_int2[0] ;
         prcacletter.this.A6032Ac_BarReo = GXv_int3[0] ;
         prcacletter.this.A6033Ac_BarPar = GXv_char4[0] ;
         prcacletter.this.AV322CliCod_a = GXv_int5[0] ;
         prcacletter.this.AV289CliNom_a = GXv_char6[0] ;
         prcacletter.this.AV323BarSer_a = GXv_char7[0] ;
         prcacletter.this.AV290SerDsc_a = GXv_char8[0] ;
         prcacletter.this.AV336Barancaca1 = GXv_int9[0] ;
         prcacletter.this.AV359Barcolnom = GXv_char10[0] ;
         prcacletter.this.AV360Barcolnum = GXv_int11[0] ;
         AV288Hdr_a = GXutil.str( A6031Ac_Barcod, 8, 0) + "-" + GXutil.str( A6032Ac_BarReo, 1, 0) + A6033Ac_BarPar ;
         if ( AV287Flag_Agr == 0 )
         {
            AV287Flag_Agr = (byte)(1) ;
            if ( AV182Flag == 0 )
            {
            }
            h5M60( false, 56) ;
            getPrinter().GxDrawRect(7, Gx_line+0, 780, Gx_line+39, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV288Hdr_a, "")), 14, Gx_line+40, 95, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV323BarSer_a, "")), 291, Gx_line+40, 409, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV289CliNom_a, "")), 103, Gx_line+40, 286, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6035Ac_Kilos, "ZZZZZ9.99")), 621, Gx_line+40, 688, Gx_line+57, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV218Lit39, "")), 14, Gx_line+20, 109, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV220Lit40, "")), 103, Gx_line+20, 186, Gx_line+37, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV221Lit41, "")), 291, Gx_line+20, 392, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV281Lit42, "")), 636, Gx_line+20, 686, Gx_line+37, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV280Lit43, "")), 14, Gx_line+4, 167, Gx_line+19, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6034Ac_Metros, "ZZZZZ9.99")), 692, Gx_line+40, 759, Gx_line+57, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV309Lit49, "")), 695, Gx_line+20, 759, Gx_line+37, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV239Lit18, "")), 558, Gx_line+20, 613, Gx_line+37, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV336Barancaca1), "ZZ9")), 574, Gx_line+40, 597, Gx_line+57, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV359Barcolnom, "")), 417, Gx_line+40, 513, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV233Lit12, "")), 417, Gx_line+20, 486, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV360Barcolnum), "ZZZZZ9")), 519, Gx_line+40, 564, Gx_line+57, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(14, Gx_line+34, 108, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(103, Gx_line+34, 285, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(291, Gx_line+34, 408, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(417, Gx_line+34, 558, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(574, Gx_line+34, 596, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(621, Gx_line+34, 687, Gx_line+34, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(692, Gx_line+34, 758, Gx_line+34, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+56) ;
         }
         else
         {
            h5M60( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV288Hdr_a, "")), 14, Gx_line+0, 95, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV289CliNom_a, "")), 103, Gx_line+0, 286, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV323BarSer_a, "")), 291, Gx_line+0, 409, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6035Ac_Kilos, "ZZZZZ9.99")), 621, Gx_line+0, 688, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6034Ac_Metros, "ZZZZZ9.99")), 692, Gx_line+0, 759, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV336Barancaca1), "ZZ9")), 574, Gx_line+0, 597, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV359Barcolnom, "")), 417, Gx_line+0, 513, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV360Barcolnum), "ZZZZZ9")), 519, Gx_line+0, 564, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'DESCMAQ' Routine */
      returnInSub = false ;
      AV272NTubos = (byte)(0) ;
      AV347MaqVolRes = 0 ;
      /* Using cursor P05M612 */
      pr_default.execute(7, new Object[] {AV181EmprCod, AV152BarMaqCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A602MaqCod = P05M612_A602MaqCod[0] ;
         A396EmprCod = P05M612_A396EmprCod[0] ;
         A606MaqDsc = P05M612_A606MaqDsc[0] ;
         n606MaqDsc = P05M612_n606MaqDsc[0] ;
         A2391MaqMicro = P05M612_A2391MaqMicro[0] ;
         n2391MaqMicro = P05M612_n2391MaqMicro[0] ;
         A3598MaqNroTub = P05M612_A3598MaqNroTub[0] ;
         n3598MaqNroTub = P05M612_n3598MaqNroTub[0] ;
         A2801MaqVolRes = P05M612_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P05M612_n2801MaqVolRes[0] ;
         AV174DescMaq = A606MaqDsc ;
         AV268MaqMicro = A2391MaqMicro ;
         AV273NumCam = A2391MaqMicro ;
         AV272NTubos = A3598MaqNroTub ;
         AV347MaqVolRes = A2801MaqVolRes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'OBSFOR' Routine */
      returnInSub = false ;
      AV192FlagObs = (byte)(0) ;
      /* Using cursor P05M613 */
      pr_default.execute(8, new Object[] {AV181EmprCod, Integer.valueOf(AV156CliCod), AV145ArtCod, AV245ForColNom, Integer.valueOf(AV246ForColNum), Byte.valueOf(AV162Colorante)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A831TipColCod = P05M613_A831TipColCod[0] ;
         A483ForColNum = P05M613_A483ForColNum[0] ;
         A482ForColNom = P05M613_A482ForColNom[0] ;
         A494ForSer = P05M613_A494ForSer[0] ;
         A252CliCod = P05M613_A252CliCod[0] ;
         n252CliCod = P05M613_n252CliCod[0] ;
         A396EmprCod = P05M613_A396EmprCod[0] ;
         A649ObsForTxt = P05M613_A649ObsForTxt[0] ;
         A650ObsLin = P05M613_A650ObsLin[0] ;
         if ( AV192FlagObs == 0 )
         {
            AV192FlagObs = (byte)(1) ;
            h5M60( false, 23) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A649ObsForTxt, "")), 122, Gx_line+6, 372, Gx_line+23, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV217Lit38, "")), 7, Gx_line+6, 116, Gx_line+23, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+2, 780, Gx_line+2, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+23) ;
         }
         else
         {
            h5M60( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A649ObsForTxt, "")), 122, Gx_line+0, 372, Gx_line+16, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
         }
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S116( ) throws ProcessInterruptedException
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV294TipArtDsc = GXutil.space( (short)(30)) ;
      /* Using cursor P05M614 */
      pr_default.execute(9, new Object[] {AV181EmprCod, Short.valueOf(AV297BarTipArt)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A829TipArtCod = P05M614_A829TipArtCod[0] ;
         A396EmprCod = P05M614_A396EmprCod[0] ;
         A830TipArtDsc = P05M614_A830TipArtDsc[0] ;
         n830TipArtDsc = P05M614_n830TipArtDsc[0] ;
         AV294TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'HISREO' Routine */
      returnInSub = false ;
      AV320DSCCAUSA = "" ;
      AV321Texto_r = "" ;
      /* Using cursor P05M615 */
      pr_default.execute(10, new Object[] {AV181EmprCod, Integer.valueOf(AV148BarCod), Byte.valueOf(AV150BarCodReo), AV149BarCodPar});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A833TipDefCod = P05M615_A833TipDefCod[0] ;
         A5085CodCausa = P05M615_A5085CodCausa[0] ;
         n5085CodCausa = P05M615_n5085CodCausa[0] ;
         A544HisCodPar = P05M615_A544HisCodPar[0] ;
         A545HisCodReo = P05M615_A545HisCodReo[0] ;
         A539HisBarCod = P05M615_A539HisBarCod[0] ;
         A396EmprCod = P05M615_A396EmprCod[0] ;
         A5086DscCausa = P05M615_A5086DscCausa[0] ;
         n5086DscCausa = P05M615_n5086DscCausa[0] ;
         A834TipDefDsc = P05M615_A834TipDefDsc[0] ;
         n834TipDefDsc = P05M615_n834TipDefDsc[0] ;
         A834TipDefDsc = P05M615_A834TipDefDsc[0] ;
         n834TipDefDsc = P05M615_n834TipDefDsc[0] ;
         A5086DscCausa = P05M615_A5086DscCausa[0] ;
         n5086DscCausa = P05M615_n5086DscCausa[0] ;
         AV320DSCCAUSA = GXutil.substring( A5086DscCausa, 1, 30) ;
         AV321Texto_r = GXutil.substring( A834TipDefDsc, 1, 15) ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'INICIAMOS' Routine */
      returnInSub = false ;
      AV298Imp_agrup = (byte)(0) ;
      GXt_int12 = AV319Sin_dec ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, httpContext.getMessage( "SINDEC", ""), GXv_int3) ;
      prcacletter.this.GXt_int12 = GXv_int3[0] ;
      AV319Sin_dec = GXt_int12 ;
      GXt_int12 = AV329Carvema ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int3) ;
      prcacletter.this.GXt_int12 = GXv_int3[0] ;
      AV329Carvema = GXt_int12 ;
      GXv_int3[0] = AV188Flagidioma ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, "100001", GXv_int3) ;
      prcacletter.this.AV188Flagidioma = GXv_int3[0] ;
      AV258Var3 = " " ;
      if ( AV188Flagidioma == 1 )
      {
         AV258Var3 = httpContext.getMessage( "Processado por Computador", "") ;
      }
      GXv_int3[0] = AV182Flag ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, "030800", GXv_int3) ;
      prcacletter.this.AV182Flag = GXv_int3[0] ;
      GXv_int3[0] = AV189FlagImp ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, "100000", GXv_int3) ;
      prcacletter.this.AV189FlagImp = GXv_int3[0] ;
      GXv_int3[0] = AV183FlagBar ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, "100007", GXv_int3) ;
      prcacletter.this.AV183FlagBar = GXv_int3[0] ;
      GXv_int3[0] = AV185FlagCod ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, "100009", GXv_int3) ;
      prcacletter.this.AV185FlagCod = GXv_int3[0] ;
      GXv_int3[0] = AV191FlagNline ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, httpContext.getMessage( "NOLINE", ""), GXv_int3) ;
      prcacletter.this.AV191FlagNline = GXv_int3[0] ;
      GXv_char10[0] = AV168ContDsc ;
      new app.pexidsc(remoteHandle, context).execute( AV181EmprCod, httpContext.getMessage( "RECPZA", ""), GXv_char10) ;
      prcacletter.this.AV168ContDsc = GXv_char10[0] ;
      GXt_int12 = AV341ideas ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, httpContext.getMessage( "IDEAS", ""), GXv_int3) ;
      prcacletter.this.GXt_int12 = GXv_int3[0] ;
      AV341ideas = GXt_int12 ;
      GXv_int3[0] = AV342Carolina ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, httpContext.getMessage( "CAROLI", ""), GXv_int3) ;
      prcacletter.this.AV342Carolina = GXv_int3[0] ;
      GXt_int12 = AV343Orient ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int3) ;
      prcacletter.this.GXt_int12 = GXv_int3[0] ;
      AV343Orient = GXt_int12 ;
      GXt_int12 = AV352Jpf ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, httpContext.getMessage( "JPF", ""), GXv_int3) ;
      prcacletter.this.GXt_int12 = GXv_int3[0] ;
      AV352Jpf = GXt_int12 ;
      GXt_int12 = AV361Er ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, httpContext.getMessage( "EROTAT", ""), GXv_int3) ;
      prcacletter.this.GXt_int12 = GXv_int3[0] ;
      AV361Er = GXt_int12 ;
      GXt_int12 = AV373piolera ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, httpContext.getMessage( "PIOLER", ""), GXv_int3) ;
      prcacletter.this.GXt_int12 = GXv_int3[0] ;
      AV373piolera = GXt_int12 ;
      GXt_char13 = AV374FecPiolera ;
      GXv_char10[0] = AV181EmprCod ;
      GXv_char8[0] = httpContext.getMessage( "PIOLER", "") ;
      GXv_char7[0] = GXt_char13 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7) ;
      prcacletter.this.AV181EmprCod = GXv_char10[0] ;
      prcacletter.this.GXt_char13 = GXv_char7[0] ;
      AV374FecPiolera = GXt_char13 ;
      GXt_int12 = AV376Cambiarcpp ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, httpContext.getMessage( "CAMCPP", ""), GXv_int3) ;
      prcacletter.this.GXt_int12 = GXv_int3[0] ;
      AV376Cambiarcpp = GXt_int12 ;
      GXt_int12 = AV377todosproductos ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, httpContext.getMessage( "ALLCP0", ""), GXv_int3) ;
      prcacletter.this.GXt_int12 = GXv_int3[0] ;
      AV377todosproductos = GXt_int12 ;
      GXt_int12 = AV380anahuac ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV181EmprCod, httpContext.getMessage( "ANAHUA", ""), GXv_int3) ;
      prcacletter.this.GXt_int12 = GXv_int3[0] ;
      AV380anahuac = GXt_int12 ;
      GXt_char13 = AV229Lit0 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN046", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV229Lit0 = GXt_char13 ;
      GXt_char13 = AV208Lit3 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN674_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV208Lit3 = GXt_char13 ;
      GXt_char13 = AV219Lit4 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV219Lit4 = GXt_char13 ;
      GXt_char13 = AV261Lit5 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1211_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV261Lit5 = GXt_char13 ;
      GXt_char13 = AV262Lit6 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV262Lit6 = GXt_char13 ;
      GXt_char13 = AV263Lit7 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV263Lit7 = GXt_char13 ;
      GXt_char13 = AV264Lit8 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV264Lit8 = GXt_char13 ;
      GXt_char13 = AV265Lit9 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV265Lit9 = GXt_char13 ;
      GXt_char13 = AV231Lit10 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV231Lit10 = GXt_char13 ;
      GXt_char13 = AV232Lit11 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1127_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV232Lit11 = GXt_char13 ;
      GXt_char13 = AV233Lit12 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN387_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV233Lit12 = GXt_char13 ;
      GXt_char13 = AV234Lit13 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV234Lit13 = GXt_char13 ;
      GXt_char13 = AV235Lit14 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV235Lit14 = GXt_char13 ;
      GXt_char13 = AV236Lit15 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV236Lit15 = GXt_char13 ;
      GXt_char13 = AV237Lit16 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2205_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV237Lit16 = GXt_char13 ;
      GXt_char13 = AV238Lit17 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN416_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV238Lit17 = GXt_char13 ;
      GXt_char13 = AV239Lit18 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1022_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV239Lit18 = GXt_char13 ;
      GXt_char13 = AV240Lit19 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1217_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV240Lit19 = GXt_char13 ;
      GXt_char13 = AV242Lit20 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2396_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV242Lit20 = GXt_char13 ;
      GXt_char13 = AV199Lit21 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV199Lit21 = GXt_char13 ;
      GXt_char13 = AV200Lit22 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV200Lit22 = GXt_char13 ;
      GXt_char13 = AV201Lit23 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV201Lit23 = GXt_char13 ;
      GXt_char13 = AV202Lit24 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV202Lit24 = GXt_char13 ;
      GXt_char13 = AV203Lit25 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV203Lit25 = GXt_char13 ;
      GXt_char13 = AV204Lit26 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1663_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV204Lit26 = GXt_char13 ;
      GXt_char13 = AV205Lit27 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3003_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV205Lit27 = GXt_char13 ;
      GXt_char13 = AV206Lit28 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1373_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV206Lit28 = GXt_char13 ;
      GXt_char13 = AV207Lit29 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV004_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV207Lit29 = GXt_char13 ;
      GXt_char13 = AV209Lit30 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN378_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV209Lit30 = GXt_char13 ;
      GXt_char13 = AV210Lit31 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV210Lit31 = GXt_char13 ;
      GXt_char13 = AV211Lit32 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2470_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV211Lit32 = GXt_char13 ;
      GXt_char13 = AV212Lit33 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV212Lit33 = GXt_char13 ;
      AV213Lit34 = httpContext.getMessage( "N Lote", "") ;
      GXt_char13 = AV214Lit35 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV005_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV214Lit35 = GXt_char13 ;
      GXt_char13 = AV215Lit36 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV004_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV215Lit36 = GXt_char13 ;
      GXt_char13 = AV216Lit37 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT108_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV216Lit37 = GXt_char13 ;
      GXt_char13 = AV217Lit38 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV217Lit38 = GXt_char13 ;
      GXt_char13 = AV218Lit39 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV218Lit39 = GXt_char13 ;
      GXt_char13 = AV220Lit40 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV220Lit40 = GXt_char13 ;
      GXt_char13 = AV221Lit41 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV221Lit41 = GXt_char13 ;
      GXt_char13 = AV281Lit42 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV281Lit42 = GXt_char13 ;
      GXt_char13 = AV280Lit43 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3023_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV280Lit43 = GXt_char13 ;
      GXt_char13 = AV304Lit45 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT188_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV304Lit45 = GXt_char13 ;
      AV304Lit45 = GXutil.substring( AV304Lit45, 1, 7) ;
      GXt_char13 = AV305Lit46 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN209_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV305Lit46 = GXt_char13 ;
      GXt_char13 = AV306Lit47 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV306Lit47 = GXt_char13 ;
      GXt_char13 = AV308Lit48 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2028_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV308Lit48 = GXt_char13 ;
      GXt_char13 = AV309Lit49 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV309Lit49 = GXt_char13 ;
      AV311Lit50 = httpContext.getMessage( "Gr/m2", "") ;
      GXt_char13 = AV313Lit51 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV313Lit51 = GXt_char13 ;
      GXt_char13 = AV314Lit52 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN209", ""), (byte)(99), GXv_char10) ;
      prcacletter.this.GXt_char13 = GXv_char10[0] ;
      AV314Lit52 = GXt_char13 ;
      /* Using cursor P05M616 */
      pr_default.execute(11, new Object[] {AV181EmprCod, Integer.valueOf(AV148BarCod), Byte.valueOf(AV150BarCodReo), AV149BarCodPar});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A130BarCodPar = P05M616_A130BarCodPar[0] ;
         A132BarCodReo = P05M616_A132BarCodReo[0] ;
         A129BarCod = P05M616_A129BarCod[0] ;
         A396EmprCod = P05M616_A396EmprCod[0] ;
         A252CliCod = P05M616_A252CliCod[0] ;
         n252CliCod = P05M616_n252CliCod[0] ;
         A212BarSer = P05M616_A212BarSer[0] ;
         A135BarColNom = P05M616_A135BarColNom[0] ;
         A136BarColNum = P05M616_A136BarColNum[0] ;
         A218BarTipCol = P05M616_A218BarTipCol[0] ;
         A1652BarSerDsc = P05M616_A1652BarSerDsc[0] ;
         A148BarEstReo = P05M616_A148BarEstReo[0] ;
         AV292Cliente = A252CliCod ;
         AV291ForSer = A212BarSer ;
         AV245ForColNom = A135BarColNom ;
         AV246ForColNum = A136BarColNum ;
         AV252TipColCod = A218BarTipCol ;
         AV248Serie = A1652BarSerDsc ;
         AV321Texto_r = "" ;
         AV320DSCCAUSA = "" ;
         if ( ( A148BarEstReo == 1 ) && ( AV293FlagEnd == 1 ) )
         {
            /* Execute user subroutine: 'HISREO' */
            S151 ();
            if ( returnInSub )
            {
               pr_default.close(11);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
         }
         AV326x = (short)(1) ;
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV325Tab_notas[GX_I-1] = " " ;
            GX_I = (int)(GX_I+1) ;
         }
         /* Using cursor P05M617 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A187BarNotDsc = P05M617_A187BarNotDsc[0] ;
            A188BarNotLin = P05M617_A188BarNotLin[0] ;
            if ( AV326x > 100 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV325Tab_notas[AV326x-1] = A187BarNotDsc ;
            AV326x = (short)(AV326x+1) ;
            pr_default.readNext(12);
         }
         pr_default.close(12);
         AV326x = (short)(1) ;
         GX_I = 1 ;
         while ( GX_I <= 20 )
         {
            AV333Tab_f[GX_I-1] = " " ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 20 )
         {
            AV334Tab_fd[GX_I-1] = " " ;
            GX_I = (int)(GX_I+1) ;
         }
         AV353Varp1 = "" ;
         AV354Varp2 = "" ;
         AV355Varpar3 = "" ;
         AV356VarP4 = "" ;
         AV357VarP5 = "" ;
         AV358varP6 = "" ;
         /* Using cursor P05M618 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A194BarOrdLin = P05M618_A194BarOrdLin[0] ;
            A758ProCod = P05M618_A758ProCod[0] ;
            A153BarFasEst = P05M618_A153BarFasEst[0] ;
            A457FasCod = P05M618_A457FasCod[0] ;
            A460FasDsc = P05M618_A460FasDsc[0] ;
            A460FasDsc = P05M618_A460FasDsc[0] ;
            if ( AV326x > 20 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV335Texto_f = "" ;
            if ( A153BarFasEst == 1 )
            {
               AV335Texto_f = httpContext.getMessage( "Em Processo", "") ;
            }
            if ( A153BarFasEst == 2 )
            {
               AV335Texto_f = httpContext.getMessage( "Finalizada", "") ;
            }
            AV333Tab_f[AV326x-1] = A457FasCod ;
            AV334Tab_fd[AV326x-1] = A460FasDsc + " " + AV335Texto_f ;
            AV326x = (short)(AV326x+1) ;
            if ( AV352Jpf == 1 )
            {
               /* Using cursor P05M619 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               while ( (pr_default.getStatus(14) != 101) )
               {
                  A1664ParFasCod = P05M619_A1664ParFasCod[0] ;
                  A3295BarParVal = P05M619_A3295BarParVal[0] ;
                  A9737BarValPar = P05M619_A9737BarValPar[0] ;
                  if ( A1664ParFasCod == 50 )
                  {
                     if ( GXutil.strcmp(A3295BarParVal, " ") != 0 )
                     {
                        AV353Varp1 = A3295BarParVal ;
                     }
                     if ( GXutil.strcmp(A9737BarValPar, " ") != 0 )
                     {
                        AV353Varp1 = A9737BarValPar ;
                     }
                  }
                  if ( A1664ParFasCod == 4 )
                  {
                     if ( GXutil.strcmp(A3295BarParVal, " ") != 0 )
                     {
                        AV354Varp2 = A3295BarParVal ;
                     }
                     if ( GXutil.strcmp(A9737BarValPar, " ") != 0 )
                     {
                        AV354Varp2 = A9737BarValPar ;
                     }
                  }
                  if ( A1664ParFasCod == 40 )
                  {
                     if ( GXutil.strcmp(A3295BarParVal, " ") != 0 )
                     {
                        AV355Varpar3 = A3295BarParVal ;
                     }
                     if ( GXutil.strcmp(A9737BarValPar, " ") != 0 )
                     {
                        AV355Varpar3 = A9737BarValPar ;
                     }
                  }
                  if ( A1664ParFasCod == 100 )
                  {
                     if ( GXutil.strcmp(A3295BarParVal, " ") != 0 )
                     {
                        AV356VarP4 = A3295BarParVal ;
                     }
                     if ( GXutil.strcmp(A9737BarValPar, " ") != 0 )
                     {
                        AV356VarP4 = A9737BarValPar ;
                     }
                  }
                  if ( A1664ParFasCod == 101 )
                  {
                     if ( GXutil.strcmp(A3295BarParVal, " ") != 0 )
                     {
                        AV357VarP5 = A3295BarParVal ;
                     }
                     if ( GXutil.strcmp(A9737BarValPar, " ") != 0 )
                     {
                        AV357VarP5 = A9737BarValPar ;
                     }
                  }
                  if ( ( A1664ParFasCod == 200 ) || ( A1664ParFasCod == 201 ) )
                  {
                     if ( GXutil.strcmp(A3295BarParVal, " ") != 0 )
                     {
                        AV358varP6 = A3295BarParVal ;
                     }
                     if ( GXutil.strcmp(A9737BarValPar, " ") != 0 )
                     {
                        AV358varP6 = A9737BarValPar ;
                     }
                  }
                  pr_default.readNext(14);
               }
               pr_default.close(14);
            }
            pr_default.readNext(13);
         }
         pr_default.close(13);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
      /* Using cursor P05M620 */
      pr_default.execute(15, new Object[] {AV181EmprCod, Integer.valueOf(AV292Cliente), AV291ForSer, AV245ForColNom, Integer.valueOf(AV246ForColNum), Byte.valueOf(AV252TipColCod)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A583IntCod = P05M620_A583IntCod[0] ;
         A831TipColCod = P05M620_A831TipColCod[0] ;
         A483ForColNum = P05M620_A483ForColNum[0] ;
         A482ForColNom = P05M620_A482ForColNom[0] ;
         A494ForSer = P05M620_A494ForSer[0] ;
         A252CliCod = P05M620_A252CliCod[0] ;
         n252CliCod = P05M620_n252CliCod[0] ;
         A396EmprCod = P05M620_A396EmprCod[0] ;
         A584IntDsc = P05M620_A584IntDsc[0] ;
         n584IntDsc = P05M620_n584IntDsc[0] ;
         A627MatDsc = P05M620_A627MatDsc[0] ;
         n627MatDsc = P05M620_n627MatDsc[0] ;
         A626MatCod = P05M620_A626MatCod[0] ;
         A832TipColDsc = P05M620_A832TipColDsc[0] ;
         n832TipColDsc = P05M620_n832TipColDsc[0] ;
         A1191ForNomCli = P05M620_A1191ForNomCli[0] ;
         n1191ForNomCli = P05M620_n1191ForNomCli[0] ;
         A1192ForNumCli = P05M620_A1192ForNumCli[0] ;
         n1192ForNumCli = P05M620_n1192ForNumCli[0] ;
         A995ForTonal = P05M620_A995ForTonal[0] ;
         n995ForTonal = P05M620_n995ForTonal[0] ;
         A3317DscSol = P05M620_A3317DscSol[0] ;
         n3317DscSol = P05M620_n3317DscSol[0] ;
         A3316CodSol = P05M620_A3316CodSol[0] ;
         n3316CodSol = P05M620_n3316CodSol[0] ;
         A584IntDsc = P05M620_A584IntDsc[0] ;
         n584IntDsc = P05M620_n584IntDsc[0] ;
         A832TipColDsc = P05M620_A832TipColDsc[0] ;
         n832TipColDsc = P05M620_n832TipColDsc[0] ;
         A627MatDsc = P05M620_A627MatDsc[0] ;
         n627MatDsc = P05M620_n627MatDsc[0] ;
         A3317DscSol = P05M620_A3317DscSol[0] ;
         n3317DscSol = P05M620_n3317DscSol[0] ;
         AV227Intens = A584IntDsc ;
         AV270Matiz = A627MatDsc ;
         AV269MatCod = A626MatCod ;
         AV252TipColCod = A831TipColCod ;
         AV251TipCol = A832TipColDsc ;
         AV253Tonalidad = A1191ForNomCli ;
         AV274NumCli = A1192ForNumCli ;
         AV312ForTonal = A995ForTonal ;
         AV302DscSol = A3317DscSol ;
         AV303CodSol = A3316CodSol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
      /* Using cursor P05M621 */
      pr_default.execute(16, new Object[] {AV181EmprCod});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A396EmprCod = P05M621_A396EmprCod[0] ;
         A407EmprNom = P05M621_A407EmprNom[0] ;
         n407EmprNom = P05M621_n407EmprNom[0] ;
         AV271NomEmp = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
      AV249Termin = context.getWorkstationId( remoteHandle) ;
      /* Using cursor P05M622 */
      pr_default.execute(17, new Object[] {AV249Termin});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A942TermCod = P05M622_A942TermCod[0] ;
         A1189TermUsu = P05M622_A1189TermUsu[0] ;
         n1189TermUsu = P05M622_n1189TermUsu[0] ;
         AV196TermUsu = A1189TermUsu ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(17);
   }

   public void h5M60( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxAttris("Times New Roman", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV258Var3, "")), 656, Gx_line+2, 780, Gx_line+15, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV168ContDsc, "")), 7, Gx_line+2, 91, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Terminal", ""), 133, Gx_line+0, 186, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV196TermUsu, "@!")), 194, Gx_line+0, 253, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 380, Gx_line+0, 447, Gx_line+17, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 477, Gx_line+0, 536, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("/", 460, Gx_line+0, 465, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if ( GxHdr3 )
            {
               if ( AV373piolera == 1 )
               {
                  getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "d8cbdd29-f1e4-48b9-806a-d2305f7dbc67", "", context.getHttpContext().getTheme( )), 25, Gx_line+11, 227, Gx_line+97) ;
                  getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Sistema de Gestión de la Calidad SCG 9001:2015", ""), 235, Gx_line+14, 621, Gx_line+34, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "REG TIN 004", ""), 378, Gx_line+41, 479, Gx_line+61, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RECETA DE ACABADOS", ""), 330, Gx_line+73, 526, Gx_line+93, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+0, 780, Gx_line+109, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(628, Gx_line+0, 628, Gx_line+109, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Version V1", ""), 666, Gx_line+47, 737, Gx_line+64, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(232, Gx_line+0, 232, Gx_line+109, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV374FecPiolera, "")), 670, Gx_line+75, 734, Gx_line+93, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+114) ;
               }
               if ( ! (0==AV183FlagBar) )
               {
                  getPrinter().GxAttris("Microsoft Sans Serif", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV224HojRut, "")), 213, Gx_line+5, 389, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV321Texto_r, "")), 574, Gx_line+1, 684, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV320DSCCAUSA, "")), 574, Gx_line+25, 731, Gx_line+42, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+43) ;
               }
               if ( AV373piolera == 1 )
               {
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4402RecUsrCod, "")), 421, Gx_line+11, 480, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4866RecFecAlt, "99/99/99 99:99"), 513, Gx_line+11, 616, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+7, 780, Gx_line+61, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV208Lit3, "")), 358, Gx_line+11, 416, Gx_line+28, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(338, Gx_line+7, 647, Gx_line+56, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV263Lit7, "")), 658, Gx_line+43, 728, Gx_line+60, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 734, Gx_line+43, 779, Gx_line+60, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV314Lit52, "")), 358, Gx_line+34, 416, Gx_line+50, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4868RecUsrMod, "@!")), 422, Gx_line+34, 481, Gx_line+51, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4867RecFecMod, "99/99/99 99:99"), 513, Gx_line+34, 616, Gx_line+51, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "LOTE:", ""), 30, Gx_line+24, 80, Gx_line+44, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), 88, Gx_line+25, 297, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV379NumBanyo), "ZZZ9")), 672, Gx_line+17, 702, Gx_line+34, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("/", 711, Gx_line+17, 716, Gx_line+35, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV378TotBanyos), "ZZZ9")), 726, Gx_line+17, 756, Gx_line+34, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+80) ;
               }
               if ( A5109RecNumInt > 0 )
               {
                  AV299Num_int = "(" + GXutil.trim( GXutil.str( A5109RecNumInt, 8, 0)) + ")" ;
               }
               else
               {
                  AV299Num_int = GXutil.space( (short)(10)) ;
               }
               AV300LinMaq = "(" + GXutil.trim( GXutil.str( A2804RecLinMaq, 4, 0)) + ")" ;
               if ( AV373piolera == 0 )
               {
                  getPrinter().GxAttris("Times New Roman", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV271NomEmp, "")), 16, Gx_line+5, 205, Gx_line+24, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4402RecUsrCod, "")), 414, Gx_line+5, 473, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4866RecFecAlt, "99/99/99 99:99"), 505, Gx_line+5, 608, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV197Remonta, "")), 204, Gx_line+36, 283, Gx_line+53, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+1, 780, Gx_line+55, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV229Lit0, "")), 16, Gx_line+35, 111, Gx_line+54, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV208Lit3, "")), 351, Gx_line+5, 409, Gx_line+22, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(338, Gx_line+1, 631, Gx_line+50, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV263Lit7, "")), 651, Gx_line+36, 721, Gx_line+53, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 727, Gx_line+36, 772, Gx_line+53, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV314Lit52, "")), 351, Gx_line+28, 409, Gx_line+44, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4868RecUsrMod, "@!")), 415, Gx_line+28, 474, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4867RecFecMod, "99/99/99 99:99"), 505, Gx_line+28, 608, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV379NumBanyo), "ZZZ9")), 698, Gx_line+5, 728, Gx_line+22, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("/", 732, Gx_line+5, 737, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV378TotBanyos), "ZZZ9")), 742, Gx_line+5, 772, Gx_line+22, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "N Baños", ""), 646, Gx_line+5, 695, Gx_line+23, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+57) ;
               }
               AV296BarSer_10 = GXutil.substring( A212BarSer, 1, 10) ;
               if ( A224BarTraP1 > 0 )
               {
                  AV295VCompo = GXutil.trim( A221BarTra1) + " " + GXutil.trim( GXutil.str( A224BarTraP1, 3, 0)) + "%" ;
                  if ( A225BarTraP2 > 0 )
                  {
                     AV295VCompo += GXutil.trim( A222BarTra2) + " " + GXutil.trim( GXutil.str( A225BarTraP2, 3, 0)) + "%" ;
                  }
                  if ( A226BarTraP3 > 0 )
                  {
                     AV295VCompo += GXutil.trim( A223BarTra3) + " " + GXutil.trim( GXutil.str( A226BarTraP3, 3, 0)) + "%" ;
                  }
               }
               AV297BarTipArt = A217BarTipArt ;
               /* Execute user subroutine: 'TIPART' */
               S116 ();
               if ( returnInSub )
               {
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               getPrinter().GxDrawRect(520, Gx_line+6, 786, Gx_line+53, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 89, Gx_line+10, 139, Gx_line+27, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 152, Gx_line+10, 405, Gx_line+27, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 89, Gx_line+29, 222, Gx_line+46, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 95, Gx_line+105, 191, Gx_line+122, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 264, Gx_line+106, 309, Gx_line+123, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 322, Gx_line+105, 337, Gx_line+123, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV175DesCol, "")), 384, Gx_line+105, 509, Gx_line+122, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV253Tonalidad, "")), 95, Gx_line+126, 191, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV274NumCli), "ZZZZZ9")), 264, Gx_line+126, 309, Gx_line+143, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV198Hdr, "")), 656, Gx_line+11, 757, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(7, Gx_line+5, 514, Gx_line+97, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(7, Gx_line+101, 514, Gx_line+167, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV264Lit8, "")), 21, Gx_line+10, 71, Gx_line+26, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV265Lit9, "")), 527, Gx_line+15, 652, Gx_line+32, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV231Lit10, "")), 21, Gx_line+29, 71, Gx_line+45, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV232Lit11, "")), 21, Gx_line+69, 71, Gx_line+85, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV233Lit12, "")), 23, Gx_line+105, 90, Gx_line+121, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV234Lit13, "")), 209, Gx_line+105, 260, Gx_line+121, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV235Lit14, "")), 23, Gx_line+126, 90, Gx_line+142, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV236Lit15, "")), 209, Gx_line+126, 260, Gx_line+142, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 366, Gx_line+105, 382, Gx_line+122, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV295VCompo, "")), 89, Gx_line+69, 339, Gx_line+86, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV294TipArtDsc, "")), 89, Gx_line+49, 339, Gx_line+66, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Lit26, "")), 526, Gx_line+74, 591, Gx_line+90, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV152BarMaqCod, "")), 596, Gx_line+94, 659, Gx_line+113, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV174DescMaq, "")), 596, Gx_line+73, 763, Gx_line+92, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV207Lit29, "")), 526, Gx_line+118, 591, Gx_line+134, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5110RecNumPrg, "")), 596, Gx_line+118, 678, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV206Lit28, "")), 526, Gx_line+145, 591, Gx_line+161, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2806RecFA, "ZZ9.99")), 596, Gx_line+145, 646, Gx_line+162, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV205Lit27, "")), 690, Gx_line+118, 748, Gx_line+134, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV268MaqMicro), "Z9")), 755, Gx_line+118, 772, Gx_line+135, 2, 0, 0, 0) ;
               getPrinter().GxDrawRect(520, Gx_line+69, 779, Gx_line+167, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV300LinMaq, "")), 527, Gx_line+35, 572, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV299Num_int, "")), 656, Gx_line+34, 739, Gx_line+51, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 441, Gx_line+33, 508, Gx_line+50, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV305Lit46, "")), 441, Gx_line+15, 508, Gx_line+32, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9")), 440, Gx_line+76, 470, Gx_line+93, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV306Lit47, "")), 440, Gx_line+58, 508, Gx_line+75, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 379, Gx_line+76, 402, Gx_line+93, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV308Lit48, "")), 379, Gx_line+58, 437, Gx_line+75, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9")), 416, Gx_line+76, 439, Gx_line+93, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(375, Gx_line+49, 375, Gx_line+96, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(375, Gx_line+49, 433, Gx_line+49, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(432, Gx_line+5, 432, Gx_line+50, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV237Lit16, "")), 322, Gx_line+126, 372, Gx_line+142, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV176DesInt, "")), 393, Gx_line+126, 503, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 227, Gx_line+29, 418, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV313Lit51, "")), 23, Gx_line+146, 87, Gx_line+163, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV312ForTonal, "")), 95, Gx_line+146, 242, Gx_line+163, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3137BarGraAca2), "ZZZ9")), 478, Gx_line+76, 508, Gx_line+93, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+170) ;
               AV324Obs_ok = (byte)(0) ;
               AV326x = (short)(1) ;
               while ( AV326x <= 100 )
               {
                  if ( AV324Obs_ok == 0 )
                  {
                     AV324Obs_ok = (byte)(1) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 34, Gx_line+1, 107, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(6, Gx_line+1, 6, Gx_line+18, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(778, Gx_line+1, 778, Gx_line+18, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  AV327barNotDsc = AV325Tab_notas[AV326x-1] ;
                  if ( ! (GXutil.strcmp("", AV327barNotDsc)==0) )
                  {
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV327barNotDsc, "")), 171, Gx_line+1, 578, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(6, Gx_line+0, 6, Gx_line+21, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(778, Gx_line+0, 778, Gx_line+21, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+21) ;
                  }
                  AV326x = (short)(AV326x+1) ;
               }
               if ( AV324Obs_ok == 1 )
               {
                  getPrinter().GxDrawLine(6, Gx_line+4, 779, Gx_line+4, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(6, Gx_line+0, 6, Gx_line+5, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(778, Gx_line+0, 778, Gx_line+5, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+8) ;
               }
               if ( AV298Imp_agrup == 0 )
               {
                  /* Execute user subroutine: 'AGRUPADAS' */
                  S126 ();
                  if ( returnInSub )
                  {
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV298Imp_agrup = (byte)(1) ;
               }
               AV348Lit500 = httpContext.getMessage( "Lts Propuestos", "") ;
               AV349LtsIni = (int)(AV286Volumen+AV346RecLtssr) ;
               if ( GXutil.strcmp(A9812RecHdrLts, " ") != 0 )
               {
                  AV351Hdrl = GXutil.substring( A9812RecHdrLts, 1, 8) + "-" + GXutil.substring( A9812RecHdrLts, 9, 1) + GXutil.substring( A9812RecHdrLts, 10, 1) ;
                  AV350Texto_h = httpContext.getMessage( "Hdr Ultimo Baño ", "") + AV351Hdrl + httpContext.getMessage( " F Abs %", "") + GXutil.str( A9811RecAbs2, 6, 2) ;
               }
               else
               {
                  AV350Texto_h = " " ;
               }
               if ( AV329Carvema == 0 )
               {
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Litros", ""), 208, Gx_line+47, 272, Gx_line+66, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV286Volumen), "ZZZZ9")), 147, Gx_line+47, 200, Gx_line+67, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4316RecMaqKgs, "ZZZZZZ9.99")), 420, Gx_line+6, 504, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4317RecMaqMts, "ZZZZZZ9.99")), 629, Gx_line+6, 713, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(6, Gx_line+1, 779, Gx_line+99, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV200Lit22, "")), 19, Gx_line+47, 92, Gx_line+66, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV201Lit23, "")), 344, Gx_line+7, 407, Gx_line+26, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Lit25, "")), 569, Gx_line+8, 619, Gx_line+25, 2, 0, 0, 0) ;
                  getPrinter().GxDrawRect(6, Gx_line+1, 779, Gx_line+73, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 444, Gx_line+77, 459, Gx_line+94, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(433, Gx_line+72, 433, Gx_line+98, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(468, Gx_line+72, 468, Gx_line+98, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(585, Gx_line+72, 585, Gx_line+98, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(147, Gx_line+72, 147, Gx_line+98, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV209Lit30, "")), 33, Gx_line+77, 83, Gx_line+94, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV210Lit31, "")), 180, Gx_line+77, 397, Gx_line+94, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV212Lit33, "")), 479, Gx_line+77, 562, Gx_line+94, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV213Lit34, "")), 631, Gx_line+77, 731, Gx_line+94, 1, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV346RecLtssr), "ZZZZ9")), 147, Gx_line+26, 200, Gx_line+46, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Lts Recuperados", ""), 19, Gx_line+25, 139, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(330, Gx_line+2, 330, Gx_line+74, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV348Lit500, "")), 19, Gx_line+3, 129, Gx_line+24, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV349LtsIni), "ZZZZ9")), 147, Gx_line+4, 200, Gx_line+24, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV350Texto_h, "")), 338, Gx_line+47, 756, Gx_line+67, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+100) ;
               }
               else
               {
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Lts", ""), 206, Gx_line+6, 238, Gx_line+25, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV286Volumen), "ZZZZ9")), 147, Gx_line+6, 200, Gx_line+26, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4316RecMaqKgs, "ZZZZZZ9.99")), 418, Gx_line+5, 502, Gx_line+26, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4317RecMaqMts, "ZZZZZZ9.99")), 627, Gx_line+5, 711, Gx_line+26, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(5, Gx_line+0, 779, Gx_line+58, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV200Lit22, "")), 19, Gx_line+6, 92, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV201Lit23, "")), 342, Gx_line+6, 405, Gx_line+25, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Lit25, "")), 567, Gx_line+7, 617, Gx_line+24, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 442, Gx_line+36, 457, Gx_line+53, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(433, Gx_line+29, 433, Gx_line+55, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(468, Gx_line+29, 468, Gx_line+55, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(585, Gx_line+29, 585, Gx_line+55, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(147, Gx_line+29, 147, Gx_line+57, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV209Lit30, "")), 31, Gx_line+36, 81, Gx_line+53, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV210Lit31, "")), 178, Gx_line+36, 395, Gx_line+53, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV212Lit33, "")), 477, Gx_line+36, 560, Gx_line+53, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV213Lit34, "")), 629, Gx_line+36, 729, Gx_line+53, 1, 0, 0, 0) ;
                  getPrinter().GxDrawLine(328, Gx_line+1, 328, Gx_line+31, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(4, Gx_line+28, 778, Gx_line+28, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+61) ;
               }
            }
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   protected void cleanup( )
   {
      this.aP0[0] = prcacletter.this.AV181EmprCod;
      this.aP1[0] = prcacletter.this.AV148BarCod;
      this.aP2[0] = prcacletter.this.AV150BarCodReo;
      this.aP3[0] = prcacletter.this.AV149BarCodPar;
      this.aP4[0] = prcacletter.this.AV152BarMaqCod;
      this.aP5[0] = prcacletter.this.AV154BarSua;
      this.aP6[0] = prcacletter.this.AV286Volumen;
      this.aP7[0] = prcacletter.this.AV278RecLinMaq;
      this.aP8[0] = prcacletter.this.AV226ImpCod;
      this.aP9[0] = prcacletter.this.Gx_out;
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
      P05M62_A6039RecAcab = new String[] {""} ;
      P05M62_n6039RecAcab = new boolean[] {false} ;
      P05M62_A602MaqCod = new String[] {""} ;
      P05M62_A130BarCodPar = new String[] {""} ;
      P05M62_A132BarCodReo = new byte[1] ;
      P05M62_A129BarCod = new int[1] ;
      P05M62_A396EmprCod = new String[] {""} ;
      P05M62_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      A602MaqCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      AV172Coste = DecimalUtil.ZERO ;
      AV173Coste2 = DecimalUtil.ZERO ;
      AV175DesCol = "" ;
      AV251TipCol = "" ;
      AV176DesInt = "" ;
      AV227Intens = "" ;
      P05M66_A3915EmpNumDec = new byte[1] ;
      P05M66_n3915EmpNumDec = new boolean[] {false} ;
      P05M66_A130BarCodPar = new String[] {""} ;
      P05M66_A132BarCodReo = new byte[1] ;
      P05M66_A396EmprCod = new String[] {""} ;
      P05M66_A129BarCod = new int[1] ;
      P05M66_A2804RecLinMaq = new short[1] ;
      P05M66_A4018BarBot = new String[] {""} ;
      P05M66_A6434BarAsi = new byte[1] ;
      P05M66_A4833BarAudTur = new byte[1] ;
      P05M66_n4833BarAudTur = new boolean[] {false} ;
      P05M66_A4937BarCtrPdas = new byte[1] ;
      P05M66_n4937BarCtrPdas = new boolean[] {false} ;
      P05M66_A4467BarAcaMar = new String[] {""} ;
      P05M66_A5115RecAbsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M66_A9998RecAnc = new short[1] ;
      P05M66_n9998RecAnc = new boolean[] {false} ;
      P05M66_A9996RecObsq = new String[] {""} ;
      P05M66_n9996RecObsq = new boolean[] {false} ;
      P05M66_A9997Recgrm = new short[1] ;
      P05M66_n9997Recgrm = new boolean[] {false} ;
      P05M66_A9764RecLtsSR = new int[1] ;
      P05M66_n9764RecLtsSR = new boolean[] {false} ;
      P05M66_A11507RecAva = new String[] {""} ;
      P05M66_n11507RecAva = new boolean[] {false} ;
      P05M66_A12128RecAs = new String[] {""} ;
      P05M66_n12128RecAs = new boolean[] {false} ;
      P05M66_A12129RecAi = new String[] {""} ;
      P05M66_n12129RecAi = new boolean[] {false} ;
      P05M66_A148BarEstReo = new byte[1] ;
      P05M66_A3006BarCoef = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M66_n3006BarCoef = new boolean[] {false} ;
      P05M66_A1226BarGraCru = new short[1] ;
      P05M66_A4268RecOrdLin = new short[1] ;
      P05M66_n4268RecOrdLin = new boolean[] {false} ;
      P05M66_A4812BarEncCli = new String[] {""} ;
      P05M66_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P05M66_n4867RecFecMod = new boolean[] {false} ;
      P05M66_A4868RecUsrMod = new String[] {""} ;
      P05M66_n4868RecUsrMod = new boolean[] {false} ;
      P05M66_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P05M66_n4866RecFecAlt = new boolean[] {false} ;
      P05M66_A4402RecUsrCod = new String[] {""} ;
      P05M66_A5109RecNumInt = new int[1] ;
      P05M66_A212BarSer = new String[] {""} ;
      P05M66_A224BarTraP1 = new short[1] ;
      P05M66_A221BarTra1 = new String[] {""} ;
      P05M66_A225BarTraP2 = new short[1] ;
      P05M66_A222BarTra2 = new String[] {""} ;
      P05M66_A226BarTraP3 = new short[1] ;
      P05M66_A223BarTra3 = new String[] {""} ;
      P05M66_A217BarTipArt = new short[1] ;
      P05M66_n217BarTipArt = new boolean[] {false} ;
      P05M66_A3137BarGraAca2 = new short[1] ;
      P05M66_A1652BarSerDsc = new String[] {""} ;
      P05M66_A126BarAncAca2 = new short[1] ;
      P05M66_A125BarAncAca1 = new short[1] ;
      P05M66_A1909BarGraAca = new short[1] ;
      P05M66_A143BarDisNum = new String[] {""} ;
      P05M66_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M66_A5110RecNumPrg = new String[] {""} ;
      P05M66_A218BarTipCol = new byte[1] ;
      P05M66_A136BarColNum = new int[1] ;
      P05M66_A135BarColNom = new String[] {""} ;
      P05M66_A279CliNom = new String[] {""} ;
      P05M66_A252CliCod = new int[1] ;
      P05M66_n252CliCod = new boolean[] {false} ;
      P05M66_A9812RecHdrLts = new String[] {""} ;
      P05M66_n9812RecHdrLts = new boolean[] {false} ;
      P05M66_A9811RecAbs2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M66_n9811RecAbs2 = new boolean[] {false} ;
      P05M66_A4271RecFagKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M66_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M66_A4272RecFagMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M66_A4260RecTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M66_n4260RecTotMts = new boolean[] {false} ;
      P05M66_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M66_n184BarMtr = new boolean[] {false} ;
      P05M66_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M66_n870BarTotMtr = new boolean[] {false} ;
      A4018BarBot = "" ;
      A4467BarAcaMar = "" ;
      A5115RecAbsFac = DecimalUtil.ZERO ;
      A9996RecObsq = "" ;
      A11507RecAva = "" ;
      A12128RecAs = "" ;
      A12129RecAi = "" ;
      A3006BarCoef = DecimalUtil.ZERO ;
      A4812BarEncCli = "" ;
      A4867RecFecMod = GXutil.resetTime( GXutil.nullDate() );
      A4868RecUsrMod = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4402RecUsrCod = "" ;
      A212BarSer = "" ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A1652BarSerDsc = "" ;
      A143BarDisNum = "" ;
      A2806RecFA = DecimalUtil.ZERO ;
      A5110RecNumPrg = "" ;
      A135BarColNom = "" ;
      A279CliNom = "" ;
      A9812RecHdrLts = "" ;
      A9811RecAbs2 = DecimalUtil.ZERO ;
      A4271RecFagKgs = DecimalUtil.ZERO ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4272RecFagMts = DecimalUtil.ZERO ;
      A4260RecTotMts = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A4317RecMaqMts = DecimalUtil.ZERO ;
      A4316RecMaqKgs = DecimalUtil.ZERO ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      AV366S = "" ;
      AV367C = "" ;
      AV370P = "" ;
      AV368Pf = "" ;
      AV369Forcodext = "" ;
      AV145ArtCod = "" ;
      AV245ForColNom = "" ;
      AV340RecObsq = "" ;
      AV362Recava = "" ;
      AV364RecAs = "" ;
      AV365RecAi = "" ;
      AV197Remonta = "" ;
      AV260Lit44 = "" ;
      AV228Largura = DecimalUtil.ZERO ;
      AV250TiempoV = DecimalUtil.ZERO ;
      AV222GrMlin = DecimalUtil.ZERO ;
      AV164CompTP = DecimalUtil.ZERO ;
      AV193Procesos = new String[6] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         AV193Procesos[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV194Tiempos = new short[6] ;
      P05M67_A396EmprCod = new String[] {""} ;
      P05M67_A129BarCod = new int[1] ;
      P05M67_A132BarCodReo = new byte[1] ;
      P05M67_A130BarCodPar = new String[] {""} ;
      P05M67_A2804RecLinMaq = new short[1] ;
      P05M67_A764ProForCod = new String[] {""} ;
      P05M67_A771ProForTie = new short[1] ;
      P05M67_A1273RecLinPro = new byte[1] ;
      A764ProForCod = "" ;
      AV310RecObs = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV310RecObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05M68_A396EmprCod = new String[] {""} ;
      P05M68_A129BarCod = new int[1] ;
      P05M68_A132BarCodReo = new byte[1] ;
      P05M68_A130BarCodPar = new String[] {""} ;
      P05M68_A2804RecLinMaq = new short[1] ;
      P05M68_A5258RecTxtObs = new String[] {""} ;
      P05M68_n5258RecTxtObs = new boolean[] {false} ;
      P05M68_A5257RecLinObs = new short[1] ;
      A5258RecTxtObs = "" ;
      AV224HojRut = "" ;
      AV198Hdr = "" ;
      AV163CompCamar = DecimalUtil.ZERO ;
      P05M69_A4587ProRecObs = new String[] {""} ;
      P05M69_A396EmprCod = new String[] {""} ;
      P05M69_A129BarCod = new int[1] ;
      P05M69_A132BarCodReo = new byte[1] ;
      P05M69_A130BarCodPar = new String[] {""} ;
      P05M69_A1273RecLinPro = new byte[1] ;
      P05M69_A2804RecLinMaq = new short[1] ;
      P05M69_A772ProForTmx = new short[1] ;
      P05M69_A2393ProNumRec = new int[1] ;
      P05M69_A2392ProNumPro = new int[1] ;
      P05M69_A766ProForDsc = new String[] {""} ;
      P05M69_A771ProForTie = new short[1] ;
      P05M69_A764ProForCod = new String[] {""} ;
      A4587ProRecObs = "" ;
      A766ProForDsc = "" ;
      AV214Lit35 = "" ;
      AV216Lit37 = "" ;
      AV215Lit36 = "" ;
      P05M610_A719PrdNum = new String[] {""} ;
      P05M610_n719PrdNum = new boolean[] {false} ;
      P05M610_A396EmprCod = new String[] {""} ;
      P05M610_A129BarCod = new int[1] ;
      P05M610_A132BarCodReo = new byte[1] ;
      P05M610_A130BarCodPar = new String[] {""} ;
      P05M610_A2804RecLinMaq = new short[1] ;
      P05M610_A1273RecLinPro = new byte[1] ;
      P05M610_A488ForPrdDsc = new String[] {""} ;
      P05M610_n488ForPrdDsc = new boolean[] {false} ;
      P05M610_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M610_A2394RecForNro = new byte[1] ;
      P05M610_A1643PrdTip = new String[] {""} ;
      P05M610_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M610_A4693PrdNum2 = new String[] {""} ;
      P05M610_A872RecPrdNum = new String[] {""} ;
      P05M610_A875RecPrdDsc = new String[] {""} ;
      P05M610_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M610_A490ForPrdUMe = new byte[1] ;
      P05M610_n490ForPrdUMe = new boolean[] {false} ;
      P05M610_A743PrdUniCon = new byte[1] ;
      P05M610_A5725RecLote = new String[] {""} ;
      P05M610_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M610_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M610_A811RecLin = new short[1] ;
      A719PrdNum = "" ;
      A488ForPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A1643PrdTip = "" ;
      A5416PrdDensS = DecimalUtil.ZERO ;
      A4693PrdNum2 = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A5725RecLote = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV257Var2 = "" ;
      AV256Var1 = "" ;
      AV277RecForNro = "" ;
      AV372Densidad = DecimalUtil.ZERO ;
      AV345PrdAux = "" ;
      AV275PrdDsc = "" ;
      AV161CodPrd = "" ;
      AV155Cantidad = DecimalUtil.ZERO ;
      AV255Unidades = "" ;
      AV317Cant_a = "" ;
      AV332Obs_l = "" ;
      AV170CosKgm = DecimalUtil.ZERO ;
      AV171CosMtr = DecimalUtil.ZERO ;
      P05M611_A130BarCodPar = new String[] {""} ;
      P05M611_A132BarCodReo = new byte[1] ;
      P05M611_A129BarCod = new int[1] ;
      P05M611_A396EmprCod = new String[] {""} ;
      P05M611_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M611_n6034Ac_Metros = new boolean[] {false} ;
      P05M611_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05M611_n6035Ac_Kilos = new boolean[] {false} ;
      P05M611_A6033Ac_BarPar = new String[] {""} ;
      P05M611_A6032Ac_BarReo = new byte[1] ;
      P05M611_A6031Ac_Barcod = new int[1] ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      A6033Ac_BarPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      AV289CliNom_a = "" ;
      GXv_char6 = new String[1] ;
      AV323BarSer_a = "" ;
      AV290SerDsc_a = "" ;
      GXv_int9 = new short[1] ;
      AV359Barcolnom = "" ;
      GXv_int11 = new int[1] ;
      AV288Hdr_a = "" ;
      AV218Lit39 = "" ;
      AV220Lit40 = "" ;
      AV221Lit41 = "" ;
      AV281Lit42 = "" ;
      AV280Lit43 = "" ;
      AV309Lit49 = "" ;
      AV239Lit18 = "" ;
      AV233Lit12 = "" ;
      P05M612_A602MaqCod = new String[] {""} ;
      P05M612_A396EmprCod = new String[] {""} ;
      P05M612_A606MaqDsc = new String[] {""} ;
      P05M612_n606MaqDsc = new boolean[] {false} ;
      P05M612_A2391MaqMicro = new byte[1] ;
      P05M612_n2391MaqMicro = new boolean[] {false} ;
      P05M612_A3598MaqNroTub = new byte[1] ;
      P05M612_n3598MaqNroTub = new boolean[] {false} ;
      P05M612_A2801MaqVolRes = new int[1] ;
      P05M612_n2801MaqVolRes = new boolean[] {false} ;
      A606MaqDsc = "" ;
      AV174DescMaq = "" ;
      P05M613_A831TipColCod = new byte[1] ;
      P05M613_A483ForColNum = new int[1] ;
      P05M613_A482ForColNom = new String[] {""} ;
      P05M613_A494ForSer = new String[] {""} ;
      P05M613_A252CliCod = new int[1] ;
      P05M613_n252CliCod = new boolean[] {false} ;
      P05M613_A396EmprCod = new String[] {""} ;
      P05M613_A649ObsForTxt = new String[] {""} ;
      P05M613_A650ObsLin = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A649ObsForTxt = "" ;
      AV217Lit38 = "" ;
      AV294TipArtDsc = "" ;
      P05M614_A829TipArtCod = new short[1] ;
      P05M614_A396EmprCod = new String[] {""} ;
      P05M614_A830TipArtDsc = new String[] {""} ;
      P05M614_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      AV320DSCCAUSA = "" ;
      AV321Texto_r = "" ;
      P05M615_A833TipDefCod = new short[1] ;
      P05M615_A5085CodCausa = new short[1] ;
      P05M615_n5085CodCausa = new boolean[] {false} ;
      P05M615_A544HisCodPar = new String[] {""} ;
      P05M615_A545HisCodReo = new byte[1] ;
      P05M615_A539HisBarCod = new int[1] ;
      P05M615_A396EmprCod = new String[] {""} ;
      P05M615_A5086DscCausa = new String[] {""} ;
      P05M615_n5086DscCausa = new boolean[] {false} ;
      P05M615_A834TipDefDsc = new String[] {""} ;
      P05M615_n834TipDefDsc = new boolean[] {false} ;
      A544HisCodPar = "" ;
      A5086DscCausa = "" ;
      A834TipDefDsc = "" ;
      AV258Var3 = "" ;
      AV168ContDsc = "" ;
      AV374FecPiolera = "" ;
      GXv_char8 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_int3 = new byte[1] ;
      AV229Lit0 = "" ;
      AV208Lit3 = "" ;
      AV219Lit4 = "" ;
      AV261Lit5 = "" ;
      AV262Lit6 = "" ;
      AV263Lit7 = "" ;
      AV264Lit8 = "" ;
      AV265Lit9 = "" ;
      AV231Lit10 = "" ;
      AV232Lit11 = "" ;
      AV234Lit13 = "" ;
      AV235Lit14 = "" ;
      AV236Lit15 = "" ;
      AV237Lit16 = "" ;
      AV238Lit17 = "" ;
      AV240Lit19 = "" ;
      AV242Lit20 = "" ;
      AV199Lit21 = "" ;
      AV200Lit22 = "" ;
      AV201Lit23 = "" ;
      AV202Lit24 = "" ;
      AV203Lit25 = "" ;
      AV204Lit26 = "" ;
      AV205Lit27 = "" ;
      AV206Lit28 = "" ;
      AV207Lit29 = "" ;
      AV209Lit30 = "" ;
      AV210Lit31 = "" ;
      AV211Lit32 = "" ;
      AV212Lit33 = "" ;
      AV213Lit34 = "" ;
      AV304Lit45 = "" ;
      AV305Lit46 = "" ;
      AV306Lit47 = "" ;
      AV308Lit48 = "" ;
      AV311Lit50 = "" ;
      AV313Lit51 = "" ;
      AV314Lit52 = "" ;
      GXt_char13 = "" ;
      GXv_char10 = new String[1] ;
      P05M616_A130BarCodPar = new String[] {""} ;
      P05M616_A132BarCodReo = new byte[1] ;
      P05M616_A129BarCod = new int[1] ;
      P05M616_A396EmprCod = new String[] {""} ;
      P05M616_A252CliCod = new int[1] ;
      P05M616_n252CliCod = new boolean[] {false} ;
      P05M616_A212BarSer = new String[] {""} ;
      P05M616_A135BarColNom = new String[] {""} ;
      P05M616_A136BarColNum = new int[1] ;
      P05M616_A218BarTipCol = new byte[1] ;
      P05M616_A1652BarSerDsc = new String[] {""} ;
      P05M616_A148BarEstReo = new byte[1] ;
      AV291ForSer = "" ;
      AV248Serie = "" ;
      AV325Tab_notas = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV325Tab_notas[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P05M617_A396EmprCod = new String[] {""} ;
      P05M617_A129BarCod = new int[1] ;
      P05M617_A132BarCodReo = new byte[1] ;
      P05M617_A130BarCodPar = new String[] {""} ;
      P05M617_A187BarNotDsc = new String[] {""} ;
      P05M617_A188BarNotLin = new byte[1] ;
      A187BarNotDsc = "" ;
      AV333Tab_f = new String[20] ;
      GX_I = 1 ;
      while ( GX_I <= 20 )
      {
         AV333Tab_f[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV334Tab_fd = new String[20] ;
      GX_I = 1 ;
      while ( GX_I <= 20 )
      {
         AV334Tab_fd[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV353Varp1 = "" ;
      AV354Varp2 = "" ;
      AV355Varpar3 = "" ;
      AV356VarP4 = "" ;
      AV357VarP5 = "" ;
      AV358varP6 = "" ;
      P05M618_A396EmprCod = new String[] {""} ;
      P05M618_A129BarCod = new int[1] ;
      P05M618_A132BarCodReo = new byte[1] ;
      P05M618_A130BarCodPar = new String[] {""} ;
      P05M618_A194BarOrdLin = new short[1] ;
      P05M618_A758ProCod = new String[] {""} ;
      P05M618_A153BarFasEst = new byte[1] ;
      P05M618_A457FasCod = new String[] {""} ;
      P05M618_A460FasDsc = new String[] {""} ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV335Texto_f = "" ;
      P05M619_A396EmprCod = new String[] {""} ;
      P05M619_A129BarCod = new int[1] ;
      P05M619_A132BarCodReo = new byte[1] ;
      P05M619_A130BarCodPar = new String[] {""} ;
      P05M619_A758ProCod = new String[] {""} ;
      P05M619_A194BarOrdLin = new short[1] ;
      P05M619_A1664ParFasCod = new short[1] ;
      P05M619_A3295BarParVal = new String[] {""} ;
      P05M619_A9737BarValPar = new String[] {""} ;
      A3295BarParVal = "" ;
      A9737BarValPar = "" ;
      P05M620_A583IntCod = new byte[1] ;
      P05M620_A831TipColCod = new byte[1] ;
      P05M620_A483ForColNum = new int[1] ;
      P05M620_A482ForColNom = new String[] {""} ;
      P05M620_A494ForSer = new String[] {""} ;
      P05M620_A252CliCod = new int[1] ;
      P05M620_n252CliCod = new boolean[] {false} ;
      P05M620_A396EmprCod = new String[] {""} ;
      P05M620_A584IntDsc = new String[] {""} ;
      P05M620_n584IntDsc = new boolean[] {false} ;
      P05M620_A627MatDsc = new String[] {""} ;
      P05M620_n627MatDsc = new boolean[] {false} ;
      P05M620_A626MatCod = new short[1] ;
      P05M620_A832TipColDsc = new String[] {""} ;
      P05M620_n832TipColDsc = new boolean[] {false} ;
      P05M620_A1191ForNomCli = new String[] {""} ;
      P05M620_n1191ForNomCli = new boolean[] {false} ;
      P05M620_A1192ForNumCli = new int[1] ;
      P05M620_n1192ForNumCli = new boolean[] {false} ;
      P05M620_A995ForTonal = new String[] {""} ;
      P05M620_n995ForTonal = new boolean[] {false} ;
      P05M620_A3317DscSol = new String[] {""} ;
      P05M620_n3317DscSol = new boolean[] {false} ;
      P05M620_A3316CodSol = new short[1] ;
      P05M620_n3316CodSol = new boolean[] {false} ;
      A584IntDsc = "" ;
      A627MatDsc = "" ;
      A832TipColDsc = "" ;
      A1191ForNomCli = "" ;
      A995ForTonal = "" ;
      A3317DscSol = "" ;
      AV270Matiz = "" ;
      AV253Tonalidad = "" ;
      AV312ForTonal = "" ;
      AV302DscSol = "" ;
      P05M621_A396EmprCod = new String[] {""} ;
      P05M621_A407EmprNom = new String[] {""} ;
      P05M621_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV271NomEmp = "" ;
      AV249Termin = "" ;
      P05M622_A942TermCod = new String[] {""} ;
      P05M622_A1189TermUsu = new String[] {""} ;
      P05M622_n1189TermUsu = new boolean[] {false} ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      AV196TermUsu = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV299Num_int = "" ;
      AV300LinMaq = "" ;
      AV296BarSer_10 = "" ;
      AV295VCompo = "" ;
      AV327barNotDsc = "" ;
      AV348Lit500 = "" ;
      AV351Hdrl = "" ;
      AV350Texto_h = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prcacletter__default(),
         new Object[] {
             new Object[] {
            P05M62_A6039RecAcab, P05M62_n6039RecAcab, P05M62_A602MaqCod, P05M62_A130BarCodPar, P05M62_A132BarCodReo, P05M62_A129BarCod, P05M62_A396EmprCod, P05M62_A2804RecLinMaq
            }
            , new Object[] {
            P05M66_A3915EmpNumDec, P05M66_n3915EmpNumDec, P05M66_A130BarCodPar, P05M66_A132BarCodReo, P05M66_A396EmprCod, P05M66_A129BarCod, P05M66_A2804RecLinMaq, P05M66_A4018BarBot, P05M66_A6434BarAsi, P05M66_A4833BarAudTur,
            P05M66_n4833BarAudTur, P05M66_A4937BarCtrPdas, P05M66_n4937BarCtrPdas, P05M66_A4467BarAcaMar, P05M66_A5115RecAbsFac, P05M66_A9998RecAnc, P05M66_n9998RecAnc, P05M66_A9996RecObsq, P05M66_n9996RecObsq, P05M66_A9997Recgrm,
            P05M66_n9997Recgrm, P05M66_A9764RecLtsSR, P05M66_n9764RecLtsSR, P05M66_A11507RecAva, P05M66_n11507RecAva, P05M66_A12128RecAs, P05M66_n12128RecAs, P05M66_A12129RecAi, P05M66_n12129RecAi, P05M66_A148BarEstReo,
            P05M66_A3006BarCoef, P05M66_n3006BarCoef, P05M66_A1226BarGraCru, P05M66_A4268RecOrdLin, P05M66_n4268RecOrdLin, P05M66_A4812BarEncCli, P05M66_A4867RecFecMod, P05M66_n4867RecFecMod, P05M66_A4868RecUsrMod, P05M66_n4868RecUsrMod,
            P05M66_A4866RecFecAlt, P05M66_n4866RecFecAlt, P05M66_A4402RecUsrCod, P05M66_A5109RecNumInt, P05M66_A212BarSer, P05M66_A224BarTraP1, P05M66_A221BarTra1, P05M66_A225BarTraP2, P05M66_A222BarTra2, P05M66_A226BarTraP3,
            P05M66_A223BarTra3, P05M66_A217BarTipArt, P05M66_n217BarTipArt, P05M66_A3137BarGraAca2, P05M66_A1652BarSerDsc, P05M66_A126BarAncAca2, P05M66_A125BarAncAca1, P05M66_A1909BarGraAca, P05M66_A143BarDisNum, P05M66_A2806RecFA,
            P05M66_A5110RecNumPrg, P05M66_A218BarTipCol, P05M66_A136BarColNum, P05M66_A135BarColNom, P05M66_A279CliNom, P05M66_A252CliCod, P05M66_n252CliCod, P05M66_A9812RecHdrLts, P05M66_n9812RecHdrLts, P05M66_A9811RecAbs2,
            P05M66_n9811RecAbs2, P05M66_A4271RecFagKgs, P05M66_A4259RecTotKgs, P05M66_A4272RecFagMts, P05M66_A4260RecTotMts, P05M66_n4260RecTotMts, P05M66_A184BarMtr, P05M66_n184BarMtr, P05M66_A870BarTotMtr, P05M66_n870BarTotMtr
            }
            , new Object[] {
            P05M67_A396EmprCod, P05M67_A129BarCod, P05M67_A132BarCodReo, P05M67_A130BarCodPar, P05M67_A2804RecLinMaq, P05M67_A764ProForCod, P05M67_A771ProForTie, P05M67_A1273RecLinPro
            }
            , new Object[] {
            P05M68_A396EmprCod, P05M68_A129BarCod, P05M68_A132BarCodReo, P05M68_A130BarCodPar, P05M68_A2804RecLinMaq, P05M68_A5258RecTxtObs, P05M68_n5258RecTxtObs, P05M68_A5257RecLinObs
            }
            , new Object[] {
            P05M69_A4587ProRecObs, P05M69_A396EmprCod, P05M69_A129BarCod, P05M69_A132BarCodReo, P05M69_A130BarCodPar, P05M69_A1273RecLinPro, P05M69_A2804RecLinMaq, P05M69_A772ProForTmx, P05M69_A2393ProNumRec, P05M69_A2392ProNumPro,
            P05M69_A766ProForDsc, P05M69_A771ProForTie, P05M69_A764ProForCod
            }
            , new Object[] {
            P05M610_A719PrdNum, P05M610_n719PrdNum, P05M610_A396EmprCod, P05M610_A129BarCod, P05M610_A132BarCodReo, P05M610_A130BarCodPar, P05M610_A2804RecLinMaq, P05M610_A1273RecLinPro, P05M610_A488ForPrdDsc, P05M610_n488ForPrdDsc,
            P05M610_A431FacCon, P05M610_A2394RecForNro, P05M610_A1643PrdTip, P05M610_A5416PrdDensS, P05M610_A4693PrdNum2, P05M610_A872RecPrdNum, P05M610_A875RecPrdDsc, P05M610_A686PrdCant, P05M610_A490ForPrdUMe, P05M610_n490ForPrdUMe,
            P05M610_A743PrdUniCon, P05M610_A5725RecLote, P05M610_A707PrdFacCon, P05M610_A724PrdPreAct, P05M610_A811RecLin
            }
            , new Object[] {
            P05M611_A130BarCodPar, P05M611_A132BarCodReo, P05M611_A129BarCod, P05M611_A396EmprCod, P05M611_A6034Ac_Metros, P05M611_n6034Ac_Metros, P05M611_A6035Ac_Kilos, P05M611_n6035Ac_Kilos, P05M611_A6033Ac_BarPar, P05M611_A6032Ac_BarReo,
            P05M611_A6031Ac_Barcod
            }
            , new Object[] {
            P05M612_A602MaqCod, P05M612_A396EmprCod, P05M612_A606MaqDsc, P05M612_n606MaqDsc, P05M612_A2391MaqMicro, P05M612_n2391MaqMicro, P05M612_A3598MaqNroTub, P05M612_n3598MaqNroTub, P05M612_A2801MaqVolRes, P05M612_n2801MaqVolRes
            }
            , new Object[] {
            P05M613_A831TipColCod, P05M613_A483ForColNum, P05M613_A482ForColNom, P05M613_A494ForSer, P05M613_A252CliCod, P05M613_A396EmprCod, P05M613_A649ObsForTxt, P05M613_A650ObsLin
            }
            , new Object[] {
            P05M614_A829TipArtCod, P05M614_A396EmprCod, P05M614_A830TipArtDsc, P05M614_n830TipArtDsc
            }
            , new Object[] {
            P05M615_A833TipDefCod, P05M615_A5085CodCausa, P05M615_n5085CodCausa, P05M615_A544HisCodPar, P05M615_A545HisCodReo, P05M615_A539HisBarCod, P05M615_A396EmprCod, P05M615_A5086DscCausa, P05M615_n5086DscCausa, P05M615_A834TipDefDsc,
            P05M615_n834TipDefDsc
            }
            , new Object[] {
            P05M616_A130BarCodPar, P05M616_A132BarCodReo, P05M616_A129BarCod, P05M616_A396EmprCod, P05M616_A252CliCod, P05M616_n252CliCod, P05M616_A212BarSer, P05M616_A135BarColNom, P05M616_A136BarColNum, P05M616_A218BarTipCol,
            P05M616_A1652BarSerDsc, P05M616_A148BarEstReo
            }
            , new Object[] {
            P05M617_A396EmprCod, P05M617_A129BarCod, P05M617_A132BarCodReo, P05M617_A130BarCodPar, P05M617_A187BarNotDsc, P05M617_A188BarNotLin
            }
            , new Object[] {
            P05M618_A396EmprCod, P05M618_A129BarCod, P05M618_A132BarCodReo, P05M618_A130BarCodPar, P05M618_A194BarOrdLin, P05M618_A758ProCod, P05M618_A153BarFasEst, P05M618_A457FasCod, P05M618_A460FasDsc
            }
            , new Object[] {
            P05M619_A396EmprCod, P05M619_A129BarCod, P05M619_A132BarCodReo, P05M619_A130BarCodPar, P05M619_A758ProCod, P05M619_A194BarOrdLin, P05M619_A1664ParFasCod, P05M619_A3295BarParVal, P05M619_A9737BarValPar
            }
            , new Object[] {
            P05M620_A583IntCod, P05M620_A831TipColCod, P05M620_A483ForColNum, P05M620_A482ForColNom, P05M620_A494ForSer, P05M620_A252CliCod, P05M620_A396EmprCod, P05M620_A584IntDsc, P05M620_n584IntDsc, P05M620_A627MatDsc,
            P05M620_n627MatDsc, P05M620_A626MatCod, P05M620_A832TipColDsc, P05M620_n832TipColDsc, P05M620_A1191ForNomCli, P05M620_n1191ForNomCli, P05M620_A1192ForNumCli, P05M620_n1192ForNumCli, P05M620_A995ForTonal, P05M620_n995ForTonal,
            P05M620_A3317DscSol, P05M620_n3317DscSol, P05M620_A3316CodSol, P05M620_n3316CodSol
            }
            , new Object[] {
            P05M621_A396EmprCod, P05M621_A407EmprNom, P05M621_n407EmprNom
            }
            , new Object[] {
            P05M622_A942TermCod, P05M622_A1189TermUsu, P05M622_n1189TermUsu
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV150BarCodReo ;
   private byte A132BarCodReo ;
   private byte A3915EmpNumDec ;
   private byte A6434BarAsi ;
   private byte A4833BarAudTur ;
   private byte A4937BarCtrPdas ;
   private byte A148BarEstReo ;
   private byte A218BarTipCol ;
   private byte AV162Colorante ;
   private byte AV252TipColCod ;
   private byte AV225I ;
   private byte A1273RecLinPro ;
   private byte AV273NumCam ;
   private byte A2394RecForNro ;
   private byte A490ForPrdUMe ;
   private byte A743PrdUniCon ;
   private byte AV376Cambiarcpp ;
   private byte AV343Orient ;
   private byte AV352Jpf ;
   private byte AV191FlagNline ;
   private byte AV189FlagImp ;
   private byte AV377todosproductos ;
   private byte AV319Sin_dec ;
   private byte AV361Er ;
   private byte AV182Flag ;
   private byte AV329Carvema ;
   private byte AV373piolera ;
   private byte AV380anahuac ;
   private byte AV287Flag_Agr ;
   private byte A6032Ac_BarReo ;
   private byte AV272NTubos ;
   private byte A2391MaqMicro ;
   private byte A3598MaqNroTub ;
   private byte AV268MaqMicro ;
   private byte AV192FlagObs ;
   private byte A831TipColCod ;
   private byte A545HisCodReo ;
   private byte AV298Imp_agrup ;
   private byte AV188Flagidioma ;
   private byte AV183FlagBar ;
   private byte AV185FlagCod ;
   private byte AV341ideas ;
   private byte AV342Carolina ;
   private byte GXt_int12 ;
   private byte GXv_int3[] ;
   private byte AV293FlagEnd ;
   private byte A188BarNotLin ;
   private byte A153BarFasEst ;
   private byte A583IntCod ;
   private byte AV324Obs_ok ;
   private short AV278RecLinMaq ;
   private short AV378TotBanyos ;
   private short AV379NumBanyo ;
   private short A2804RecLinMaq ;
   private short A9998RecAnc ;
   private short A9997Recgrm ;
   private short A1226BarGraCru ;
   private short A4268RecOrdLin ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A217BarTipArt ;
   private short A3137BarGraAca2 ;
   private short A126BarAncAca2 ;
   private short A125BarAncAca1 ;
   private short A1909BarGraAca ;
   private short AV339Recabsfac ;
   private short AV337RecAnc ;
   private short AV338Recgrm ;
   private short AV151BarGraAca ;
   private short AV279RelBany ;
   private short AV194Tiempos[] ;
   private short A771ProForTie ;
   private short A5257RecLinObs ;
   private short A772ProForTmx ;
   private short AV344Profortmx ;
   private short A811RecLin ;
   private short AV330Nlin ;
   private short AV331j ;
   private short AV328Recordlin ;
   private short AV336Barancaca1 ;
   private short GXv_int9[] ;
   private short A650ObsLin ;
   private short AV297BarTipArt ;
   private short A829TipArtCod ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short AV326x ;
   private short A194BarOrdLin ;
   private short A1664ParFasCod ;
   private short A626MatCod ;
   private short A3316CodSol ;
   private short AV269MatCod ;
   private short AV303CodSol ;
   private short Gx_err ;
   private int AV148BarCod ;
   private int AV286Volumen ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A129BarCod ;
   private int A9764RecLtsSR ;
   private int A5109RecNumInt ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int AV156CliCod ;
   private int AV246ForColNum ;
   private int AV346RecLtssr ;
   private int AV266Lts1 ;
   private int AV267Lts2 ;
   private int GX_I ;
   private int A2393ProNumRec ;
   private int A2392ProNumPro ;
   private int Gx_OldLine ;
   private int AV318Cant_sd ;
   private int A6031Ac_Barcod ;
   private int GXv_int2[] ;
   private int AV322CliCod_a ;
   private int GXv_int5[] ;
   private int AV360Barcolnum ;
   private int GXv_int11[] ;
   private int AV347MaqVolRes ;
   private int A2801MaqVolRes ;
   private int A483ForColNum ;
   private int A539HisBarCod ;
   private int AV292Cliente ;
   private int A1192ForNumCli ;
   private int AV274NumCli ;
   private int AV349LtsIni ;
   private long AV254TotTiempo ;
   private java.math.BigDecimal AV172Coste ;
   private java.math.BigDecimal AV173Coste2 ;
   private java.math.BigDecimal A5115RecAbsFac ;
   private java.math.BigDecimal A3006BarCoef ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A9811RecAbs2 ;
   private java.math.BigDecimal A4271RecFagKgs ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4272RecFagMts ;
   private java.math.BigDecimal A4260RecTotMts ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A4317RecMaqMts ;
   private java.math.BigDecimal A4316RecMaqKgs ;
   private java.math.BigDecimal A871RecTotMtr ;
   private java.math.BigDecimal AV228Largura ;
   private java.math.BigDecimal AV250TiempoV ;
   private java.math.BigDecimal AV222GrMlin ;
   private java.math.BigDecimal AV164CompTP ;
   private java.math.BigDecimal AV163CompCamar ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A5416PrdDensS ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV372Densidad ;
   private java.math.BigDecimal AV155Cantidad ;
   private java.math.BigDecimal AV170CosKgm ;
   private java.math.BigDecimal AV171CosMtr ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private java.math.BigDecimal A6035Ac_Kilos ;
   private String AV181EmprCod ;
   private String AV149BarCodPar ;
   private String AV152BarMaqCod ;
   private String AV154BarSua ;
   private String AV226ImpCod ;
   private String Gx_out ;
   private String scmdbuf ;
   private String A6039RecAcab ;
   private String A602MaqCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String AV175DesCol ;
   private String AV251TipCol ;
   private String AV176DesInt ;
   private String AV227Intens ;
   private String A4018BarBot ;
   private String A4467BarAcaMar ;
   private String A11507RecAva ;
   private String A12128RecAs ;
   private String A12129RecAi ;
   private String A4812BarEncCli ;
   private String A4868RecUsrMod ;
   private String A4402RecUsrCod ;
   private String A212BarSer ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A1652BarSerDsc ;
   private String A143BarDisNum ;
   private String A5110RecNumPrg ;
   private String A135BarColNom ;
   private String A279CliNom ;
   private String A9812RecHdrLts ;
   private String AV366S ;
   private String AV367C ;
   private String AV370P ;
   private String AV368Pf ;
   private String AV369Forcodext ;
   private String AV145ArtCod ;
   private String AV245ForColNom ;
   private String AV362Recava ;
   private String AV364RecAs ;
   private String AV365RecAi ;
   private String AV197Remonta ;
   private String AV260Lit44 ;
   private String AV193Procesos[] ;
   private String A764ProForCod ;
   private String AV310RecObs[] ;
   private String A5258RecTxtObs ;
   private String AV224HojRut ;
   private String AV198Hdr ;
   private String A766ProForDsc ;
   private String AV214Lit35 ;
   private String AV216Lit37 ;
   private String AV215Lit36 ;
   private String A719PrdNum ;
   private String A488ForPrdDsc ;
   private String A1643PrdTip ;
   private String A4693PrdNum2 ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A5725RecLote ;
   private String AV257Var2 ;
   private String AV256Var1 ;
   private String AV277RecForNro ;
   private String AV345PrdAux ;
   private String AV275PrdDsc ;
   private String AV161CodPrd ;
   private String AV255Unidades ;
   private String AV317Cant_a ;
   private String AV332Obs_l ;
   private String A6033Ac_BarPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String AV289CliNom_a ;
   private String GXv_char6[] ;
   private String AV323BarSer_a ;
   private String AV290SerDsc_a ;
   private String AV359Barcolnom ;
   private String AV288Hdr_a ;
   private String AV218Lit39 ;
   private String AV220Lit40 ;
   private String AV221Lit41 ;
   private String AV281Lit42 ;
   private String AV280Lit43 ;
   private String AV309Lit49 ;
   private String AV239Lit18 ;
   private String AV233Lit12 ;
   private String A606MaqDsc ;
   private String AV174DescMaq ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A649ObsForTxt ;
   private String AV217Lit38 ;
   private String AV294TipArtDsc ;
   private String A830TipArtDsc ;
   private String AV320DSCCAUSA ;
   private String AV321Texto_r ;
   private String A544HisCodPar ;
   private String A5086DscCausa ;
   private String A834TipDefDsc ;
   private String AV258Var3 ;
   private String AV168ContDsc ;
   private String AV374FecPiolera ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String AV229Lit0 ;
   private String AV208Lit3 ;
   private String AV219Lit4 ;
   private String AV261Lit5 ;
   private String AV262Lit6 ;
   private String AV263Lit7 ;
   private String AV264Lit8 ;
   private String AV265Lit9 ;
   private String AV231Lit10 ;
   private String AV232Lit11 ;
   private String AV234Lit13 ;
   private String AV235Lit14 ;
   private String AV236Lit15 ;
   private String AV237Lit16 ;
   private String AV238Lit17 ;
   private String AV240Lit19 ;
   private String AV242Lit20 ;
   private String AV199Lit21 ;
   private String AV200Lit22 ;
   private String AV201Lit23 ;
   private String AV202Lit24 ;
   private String AV203Lit25 ;
   private String AV204Lit26 ;
   private String AV205Lit27 ;
   private String AV206Lit28 ;
   private String AV207Lit29 ;
   private String AV209Lit30 ;
   private String AV210Lit31 ;
   private String AV211Lit32 ;
   private String AV212Lit33 ;
   private String AV213Lit34 ;
   private String AV304Lit45 ;
   private String AV305Lit46 ;
   private String AV306Lit47 ;
   private String AV308Lit48 ;
   private String AV311Lit50 ;
   private String AV313Lit51 ;
   private String AV314Lit52 ;
   private String GXt_char13 ;
   private String GXv_char10[] ;
   private String AV291ForSer ;
   private String AV248Serie ;
   private String AV325Tab_notas[] ;
   private String A187BarNotDsc ;
   private String AV333Tab_f[] ;
   private String AV334Tab_fd[] ;
   private String AV353Varp1 ;
   private String AV354Varp2 ;
   private String AV355Varpar3 ;
   private String AV356VarP4 ;
   private String AV357VarP5 ;
   private String AV358varP6 ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV335Texto_f ;
   private String A3295BarParVal ;
   private String A9737BarValPar ;
   private String A584IntDsc ;
   private String A627MatDsc ;
   private String A832TipColDsc ;
   private String A1191ForNomCli ;
   private String A995ForTonal ;
   private String A3317DscSol ;
   private String AV270Matiz ;
   private String AV253Tonalidad ;
   private String AV312ForTonal ;
   private String AV302DscSol ;
   private String A407EmprNom ;
   private String AV271NomEmp ;
   private String AV249Termin ;
   private String A942TermCod ;
   private String A1189TermUsu ;
   private String AV196TermUsu ;
   private String Gx_time ;
   private String AV299Num_int ;
   private String AV300LinMaq ;
   private String AV296BarSer_10 ;
   private String AV295VCompo ;
   private String AV327barNotDsc ;
   private String AV348Lit500 ;
   private String AV351Hdrl ;
   private String AV350Texto_h ;
   private java.util.Date A4867RecFecMod ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date Gx_date ;
   private boolean returnInSub ;
   private boolean n6039RecAcab ;
   private boolean GxHdr3 ;
   private boolean n3915EmpNumDec ;
   private boolean n4833BarAudTur ;
   private boolean n4937BarCtrPdas ;
   private boolean n9998RecAnc ;
   private boolean n9996RecObsq ;
   private boolean n9997Recgrm ;
   private boolean n9764RecLtsSR ;
   private boolean n11507RecAva ;
   private boolean n12128RecAs ;
   private boolean n12129RecAi ;
   private boolean n3006BarCoef ;
   private boolean n4268RecOrdLin ;
   private boolean n4867RecFecMod ;
   private boolean n4868RecUsrMod ;
   private boolean n4866RecFecAlt ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n9812RecHdrLts ;
   private boolean n9811RecAbs2 ;
   private boolean n4260RecTotMts ;
   private boolean n184BarMtr ;
   private boolean n870BarTotMtr ;
   private boolean n5258RecTxtObs ;
   private boolean n719PrdNum ;
   private boolean n488ForPrdDsc ;
   private boolean n490ForPrdUMe ;
   private boolean n6034Ac_Metros ;
   private boolean n6035Ac_Kilos ;
   private boolean n606MaqDsc ;
   private boolean n2391MaqMicro ;
   private boolean n3598MaqNroTub ;
   private boolean n2801MaqVolRes ;
   private boolean n830TipArtDsc ;
   private boolean n5085CodCausa ;
   private boolean n5086DscCausa ;
   private boolean n834TipDefDsc ;
   private boolean n584IntDsc ;
   private boolean n627MatDsc ;
   private boolean n832TipColDsc ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean n995ForTonal ;
   private boolean n3317DscSol ;
   private boolean n3316CodSol ;
   private boolean n407EmprNom ;
   private boolean n1189TermUsu ;
   private String A4587ProRecObs ;
   private String A9996RecObsq ;
   private String AV340RecObsq ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P05M62_A6039RecAcab ;
   private boolean[] P05M62_n6039RecAcab ;
   private String[] P05M62_A602MaqCod ;
   private String[] P05M62_A130BarCodPar ;
   private byte[] P05M62_A132BarCodReo ;
   private int[] P05M62_A129BarCod ;
   private String[] P05M62_A396EmprCod ;
   private short[] P05M62_A2804RecLinMaq ;
   private byte[] P05M66_A3915EmpNumDec ;
   private boolean[] P05M66_n3915EmpNumDec ;
   private String[] P05M66_A130BarCodPar ;
   private byte[] P05M66_A132BarCodReo ;
   private String[] P05M66_A396EmprCod ;
   private int[] P05M66_A129BarCod ;
   private short[] P05M66_A2804RecLinMaq ;
   private String[] P05M66_A4018BarBot ;
   private byte[] P05M66_A6434BarAsi ;
   private byte[] P05M66_A4833BarAudTur ;
   private boolean[] P05M66_n4833BarAudTur ;
   private byte[] P05M66_A4937BarCtrPdas ;
   private boolean[] P05M66_n4937BarCtrPdas ;
   private String[] P05M66_A4467BarAcaMar ;
   private java.math.BigDecimal[] P05M66_A5115RecAbsFac ;
   private short[] P05M66_A9998RecAnc ;
   private boolean[] P05M66_n9998RecAnc ;
   private String[] P05M66_A9996RecObsq ;
   private boolean[] P05M66_n9996RecObsq ;
   private short[] P05M66_A9997Recgrm ;
   private boolean[] P05M66_n9997Recgrm ;
   private int[] P05M66_A9764RecLtsSR ;
   private boolean[] P05M66_n9764RecLtsSR ;
   private String[] P05M66_A11507RecAva ;
   private boolean[] P05M66_n11507RecAva ;
   private String[] P05M66_A12128RecAs ;
   private boolean[] P05M66_n12128RecAs ;
   private String[] P05M66_A12129RecAi ;
   private boolean[] P05M66_n12129RecAi ;
   private byte[] P05M66_A148BarEstReo ;
   private java.math.BigDecimal[] P05M66_A3006BarCoef ;
   private boolean[] P05M66_n3006BarCoef ;
   private short[] P05M66_A1226BarGraCru ;
   private short[] P05M66_A4268RecOrdLin ;
   private boolean[] P05M66_n4268RecOrdLin ;
   private String[] P05M66_A4812BarEncCli ;
   private java.util.Date[] P05M66_A4867RecFecMod ;
   private boolean[] P05M66_n4867RecFecMod ;
   private String[] P05M66_A4868RecUsrMod ;
   private boolean[] P05M66_n4868RecUsrMod ;
   private java.util.Date[] P05M66_A4866RecFecAlt ;
   private boolean[] P05M66_n4866RecFecAlt ;
   private String[] P05M66_A4402RecUsrCod ;
   private int[] P05M66_A5109RecNumInt ;
   private String[] P05M66_A212BarSer ;
   private short[] P05M66_A224BarTraP1 ;
   private String[] P05M66_A221BarTra1 ;
   private short[] P05M66_A225BarTraP2 ;
   private String[] P05M66_A222BarTra2 ;
   private short[] P05M66_A226BarTraP3 ;
   private String[] P05M66_A223BarTra3 ;
   private short[] P05M66_A217BarTipArt ;
   private boolean[] P05M66_n217BarTipArt ;
   private short[] P05M66_A3137BarGraAca2 ;
   private String[] P05M66_A1652BarSerDsc ;
   private short[] P05M66_A126BarAncAca2 ;
   private short[] P05M66_A125BarAncAca1 ;
   private short[] P05M66_A1909BarGraAca ;
   private String[] P05M66_A143BarDisNum ;
   private java.math.BigDecimal[] P05M66_A2806RecFA ;
   private String[] P05M66_A5110RecNumPrg ;
   private byte[] P05M66_A218BarTipCol ;
   private int[] P05M66_A136BarColNum ;
   private String[] P05M66_A135BarColNom ;
   private String[] P05M66_A279CliNom ;
   private int[] P05M66_A252CliCod ;
   private boolean[] P05M66_n252CliCod ;
   private String[] P05M66_A9812RecHdrLts ;
   private boolean[] P05M66_n9812RecHdrLts ;
   private java.math.BigDecimal[] P05M66_A9811RecAbs2 ;
   private boolean[] P05M66_n9811RecAbs2 ;
   private java.math.BigDecimal[] P05M66_A4271RecFagKgs ;
   private java.math.BigDecimal[] P05M66_A4259RecTotKgs ;
   private java.math.BigDecimal[] P05M66_A4272RecFagMts ;
   private java.math.BigDecimal[] P05M66_A4260RecTotMts ;
   private boolean[] P05M66_n4260RecTotMts ;
   private java.math.BigDecimal[] P05M66_A184BarMtr ;
   private boolean[] P05M66_n184BarMtr ;
   private java.math.BigDecimal[] P05M66_A870BarTotMtr ;
   private boolean[] P05M66_n870BarTotMtr ;
   private String[] P05M67_A396EmprCod ;
   private int[] P05M67_A129BarCod ;
   private byte[] P05M67_A132BarCodReo ;
   private String[] P05M67_A130BarCodPar ;
   private short[] P05M67_A2804RecLinMaq ;
   private String[] P05M67_A764ProForCod ;
   private short[] P05M67_A771ProForTie ;
   private byte[] P05M67_A1273RecLinPro ;
   private String[] P05M68_A396EmprCod ;
   private int[] P05M68_A129BarCod ;
   private byte[] P05M68_A132BarCodReo ;
   private String[] P05M68_A130BarCodPar ;
   private short[] P05M68_A2804RecLinMaq ;
   private String[] P05M68_A5258RecTxtObs ;
   private boolean[] P05M68_n5258RecTxtObs ;
   private short[] P05M68_A5257RecLinObs ;
   private String[] P05M69_A4587ProRecObs ;
   private String[] P05M69_A396EmprCod ;
   private int[] P05M69_A129BarCod ;
   private byte[] P05M69_A132BarCodReo ;
   private String[] P05M69_A130BarCodPar ;
   private byte[] P05M69_A1273RecLinPro ;
   private short[] P05M69_A2804RecLinMaq ;
   private short[] P05M69_A772ProForTmx ;
   private int[] P05M69_A2393ProNumRec ;
   private int[] P05M69_A2392ProNumPro ;
   private String[] P05M69_A766ProForDsc ;
   private short[] P05M69_A771ProForTie ;
   private String[] P05M69_A764ProForCod ;
   private String[] P05M610_A719PrdNum ;
   private boolean[] P05M610_n719PrdNum ;
   private String[] P05M610_A396EmprCod ;
   private int[] P05M610_A129BarCod ;
   private byte[] P05M610_A132BarCodReo ;
   private String[] P05M610_A130BarCodPar ;
   private short[] P05M610_A2804RecLinMaq ;
   private byte[] P05M610_A1273RecLinPro ;
   private String[] P05M610_A488ForPrdDsc ;
   private boolean[] P05M610_n488ForPrdDsc ;
   private java.math.BigDecimal[] P05M610_A431FacCon ;
   private byte[] P05M610_A2394RecForNro ;
   private String[] P05M610_A1643PrdTip ;
   private java.math.BigDecimal[] P05M610_A5416PrdDensS ;
   private String[] P05M610_A4693PrdNum2 ;
   private String[] P05M610_A872RecPrdNum ;
   private String[] P05M610_A875RecPrdDsc ;
   private java.math.BigDecimal[] P05M610_A686PrdCant ;
   private byte[] P05M610_A490ForPrdUMe ;
   private boolean[] P05M610_n490ForPrdUMe ;
   private byte[] P05M610_A743PrdUniCon ;
   private String[] P05M610_A5725RecLote ;
   private java.math.BigDecimal[] P05M610_A707PrdFacCon ;
   private java.math.BigDecimal[] P05M610_A724PrdPreAct ;
   private short[] P05M610_A811RecLin ;
   private String[] P05M611_A130BarCodPar ;
   private byte[] P05M611_A132BarCodReo ;
   private int[] P05M611_A129BarCod ;
   private String[] P05M611_A396EmprCod ;
   private java.math.BigDecimal[] P05M611_A6034Ac_Metros ;
   private boolean[] P05M611_n6034Ac_Metros ;
   private java.math.BigDecimal[] P05M611_A6035Ac_Kilos ;
   private boolean[] P05M611_n6035Ac_Kilos ;
   private String[] P05M611_A6033Ac_BarPar ;
   private byte[] P05M611_A6032Ac_BarReo ;
   private int[] P05M611_A6031Ac_Barcod ;
   private String[] P05M612_A602MaqCod ;
   private String[] P05M612_A396EmprCod ;
   private String[] P05M612_A606MaqDsc ;
   private boolean[] P05M612_n606MaqDsc ;
   private byte[] P05M612_A2391MaqMicro ;
   private boolean[] P05M612_n2391MaqMicro ;
   private byte[] P05M612_A3598MaqNroTub ;
   private boolean[] P05M612_n3598MaqNroTub ;
   private int[] P05M612_A2801MaqVolRes ;
   private boolean[] P05M612_n2801MaqVolRes ;
   private byte[] P05M613_A831TipColCod ;
   private int[] P05M613_A483ForColNum ;
   private String[] P05M613_A482ForColNom ;
   private String[] P05M613_A494ForSer ;
   private int[] P05M613_A252CliCod ;
   private boolean[] P05M613_n252CliCod ;
   private String[] P05M613_A396EmprCod ;
   private String[] P05M613_A649ObsForTxt ;
   private short[] P05M613_A650ObsLin ;
   private short[] P05M614_A829TipArtCod ;
   private String[] P05M614_A396EmprCod ;
   private String[] P05M614_A830TipArtDsc ;
   private boolean[] P05M614_n830TipArtDsc ;
   private short[] P05M615_A833TipDefCod ;
   private short[] P05M615_A5085CodCausa ;
   private boolean[] P05M615_n5085CodCausa ;
   private String[] P05M615_A544HisCodPar ;
   private byte[] P05M615_A545HisCodReo ;
   private int[] P05M615_A539HisBarCod ;
   private String[] P05M615_A396EmprCod ;
   private String[] P05M615_A5086DscCausa ;
   private boolean[] P05M615_n5086DscCausa ;
   private String[] P05M615_A834TipDefDsc ;
   private boolean[] P05M615_n834TipDefDsc ;
   private String[] P05M616_A130BarCodPar ;
   private byte[] P05M616_A132BarCodReo ;
   private int[] P05M616_A129BarCod ;
   private String[] P05M616_A396EmprCod ;
   private int[] P05M616_A252CliCod ;
   private boolean[] P05M616_n252CliCod ;
   private String[] P05M616_A212BarSer ;
   private String[] P05M616_A135BarColNom ;
   private int[] P05M616_A136BarColNum ;
   private byte[] P05M616_A218BarTipCol ;
   private String[] P05M616_A1652BarSerDsc ;
   private byte[] P05M616_A148BarEstReo ;
   private String[] P05M617_A396EmprCod ;
   private int[] P05M617_A129BarCod ;
   private byte[] P05M617_A132BarCodReo ;
   private String[] P05M617_A130BarCodPar ;
   private String[] P05M617_A187BarNotDsc ;
   private byte[] P05M617_A188BarNotLin ;
   private String[] P05M618_A396EmprCod ;
   private int[] P05M618_A129BarCod ;
   private byte[] P05M618_A132BarCodReo ;
   private String[] P05M618_A130BarCodPar ;
   private short[] P05M618_A194BarOrdLin ;
   private String[] P05M618_A758ProCod ;
   private byte[] P05M618_A153BarFasEst ;
   private String[] P05M618_A457FasCod ;
   private String[] P05M618_A460FasDsc ;
   private String[] P05M619_A396EmprCod ;
   private int[] P05M619_A129BarCod ;
   private byte[] P05M619_A132BarCodReo ;
   private String[] P05M619_A130BarCodPar ;
   private String[] P05M619_A758ProCod ;
   private short[] P05M619_A194BarOrdLin ;
   private short[] P05M619_A1664ParFasCod ;
   private String[] P05M619_A3295BarParVal ;
   private String[] P05M619_A9737BarValPar ;
   private byte[] P05M620_A583IntCod ;
   private byte[] P05M620_A831TipColCod ;
   private int[] P05M620_A483ForColNum ;
   private String[] P05M620_A482ForColNom ;
   private String[] P05M620_A494ForSer ;
   private int[] P05M620_A252CliCod ;
   private boolean[] P05M620_n252CliCod ;
   private String[] P05M620_A396EmprCod ;
   private String[] P05M620_A584IntDsc ;
   private boolean[] P05M620_n584IntDsc ;
   private String[] P05M620_A627MatDsc ;
   private boolean[] P05M620_n627MatDsc ;
   private short[] P05M620_A626MatCod ;
   private String[] P05M620_A832TipColDsc ;
   private boolean[] P05M620_n832TipColDsc ;
   private String[] P05M620_A1191ForNomCli ;
   private boolean[] P05M620_n1191ForNomCli ;
   private int[] P05M620_A1192ForNumCli ;
   private boolean[] P05M620_n1192ForNumCli ;
   private String[] P05M620_A995ForTonal ;
   private boolean[] P05M620_n995ForTonal ;
   private String[] P05M620_A3317DscSol ;
   private boolean[] P05M620_n3317DscSol ;
   private short[] P05M620_A3316CodSol ;
   private boolean[] P05M620_n3316CodSol ;
   private String[] P05M621_A396EmprCod ;
   private String[] P05M621_A407EmprNom ;
   private boolean[] P05M621_n407EmprNom ;
   private String[] P05M622_A942TermCod ;
   private String[] P05M622_A1189TermUsu ;
   private boolean[] P05M622_n1189TermUsu ;
}

final  class prcacletter__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05M62", "SELECT RecAcab, MaqCod, BarCodPar, BarCodReo, BarCod, EmprCod, RecLinMaq FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (MaqCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05M66", "SELECT T2.EmpNumDec, T1.BarCodPar, T1.BarCodReo, T1.EmprCod, T1.BarCod, T1.RecLinMaq, T3.BarBot, T3.BarAsi, T3.BarAudTur, T3.BarCtrPdas, T3.BarAcaMar, T1.RecAbsFac, T1.RecAnc, T1.RecObsq, T1.Recgrm, T1.RecLtsSR, T1.RecAva, T1.RecAs, T1.RecAi, T3.BarEstReo, T3.BarCoef, T3.BarGraCru, T1.RecOrdLin, T3.BarEncCli, T1.RecFecMod, T1.RecUsrMod, T1.RecFecAlt, T1.RecUsrCod, T1.RecNumInt, T3.BarSer, T3.BarTraP1, T3.BarTra1, T3.BarTraP2, T3.BarTra2, T3.BarTraP3, T3.BarTra3, T3.BarTipArt, T3.BarGraAca2, T3.BarSerDsc, T3.BarAncAca2, T3.BarAncAca1, T3.BarGraAca, T3.BarDisNum, T1.RecFA, T1.RecNumPrg, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T4.CliNom, T3.CliCod, T1.RecHdrLts, T1.RecAbs2, COALESCE( T7.RecFagKgs, 0) AS RecFagKgs, T1.RecTotKgs, COALESCE( T7.RecFagMts, 0) AS RecFagMts, T1.RecTotMts, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE( T5.BarTotMtr, 0) AS BarTotMtr FROM ((((((TXPRECMAQ T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(RecAgrMts) AS RecFagMts, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, SUM(RecAgrKgs) AS RecFagKgs FROM TXPRECFAG GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar AND T7.RecLinMaq = T1.RecLinMaq) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05M67", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.ProForCod, T2.ProForTie, T1.RecLinPro FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05M68", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecTxtObs, RecLinObs FROM TXPOBSREC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05M69", "SELECT T1.ProRecObs, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinPro, T1.RecLinMaq, T2.ProForTmx, T2.ProNumRec, T2.ProNumPro, T2.ProForDsc, T2.ProForTie, T1.ProForCod FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05M610", "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T3.ForPrdDsc, T1.FacCon, T1.RecForNro, T2.PrdTip, T2.PrdDensS, T2.PrdNum2, T1.RecPrdNum, T1.RecPrdDsc, T1.PrdCant, T1.ForPrdUMe, T2.PrdUniCon, T1.RecLote, T2.PrdFacCon, T2.PrdPreAct, T1.RecLin FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05M611", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, Ac_Metros, Ac_Kilos, Ac_BarPar, Ac_BarReo, Ac_Barcod FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05M612", "SELECT MaqCod, EmprCod, MaqDsc, MaqMicro, MaqNroTub, MaqVolRes FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05M613", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ObsForTxt, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05M614", "SELECT TipArtCod, EmprCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05M615", "SELECT T1.TipDefCod, T1.CodCausa, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod, T1.EmprCod, T3.DscCausa, T2.TipDefDsc FROM ((TXPHISREO T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T3 ON T3.EmprCod = T1.EmprCod AND T3.CodCausa = T1.CodCausa) WHERE T1.EmprCod = ? and T1.HisBarCod = ? and T1.HisCodReo = ? and T1.HisCodPar = ? ORDER BY T1.EmprCod, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05M616", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarSerDsc, BarEstReo FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05M617", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotDsc, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05M618", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.ProCod, T1.BarFasEst, T1.FasCod, T2.FasDsc FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05M619", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod, BarParVal, BarValPar FROM TXPBarPar WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05M620", "SELECT T1.IntCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.EmprCod, T2.IntDsc, T4.MatDsc, T1.MatCod, T3.TipColDsc, T1.ForNomCli, T1.ForNumCli, T1.ForTonal, T5.DscSol, T1.CodSol FROM ((((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) INNER JOIN TXPTIPCOL T3 ON T3.EmprCod = T1.EmprCod AND T3.TipColCod = T1.TipColCod) INNER JOIN TXPMATICE T4 ON T4.EmprCod = T1.EmprCod AND T4.MatCod = T1.MatCod) LEFT JOIN TXPSOLIDE T5 ON T5.EmprCod = T1.EmprCod AND T5.CodSol = T1.CodSol) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05M621", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05M622", "SELECT TermCod, TermUsu FROM TXPTERMIN WHERE TermCod = ? ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[15])[0] = rslt.getShort(13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(17, 4);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(18, 3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(19, 3);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(20);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(22);
               ((short[]) buf[33])[0] = rslt.getShort(23);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(24, 20);
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(25);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(26, 8);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(27);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(28, 8);
               ((int[]) buf[43])[0] = rslt.getInt(29);
               ((String[]) buf[44])[0] = rslt.getString(30, 16);
               ((short[]) buf[45])[0] = rslt.getShort(31);
               ((String[]) buf[46])[0] = rslt.getString(32, 4);
               ((short[]) buf[47])[0] = rslt.getShort(33);
               ((String[]) buf[48])[0] = rslt.getString(34, 4);
               ((short[]) buf[49])[0] = rslt.getShort(35);
               ((String[]) buf[50])[0] = rslt.getString(36, 4);
               ((short[]) buf[51])[0] = rslt.getShort(37);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(38);
               ((String[]) buf[54])[0] = rslt.getString(39, 26);
               ((short[]) buf[55])[0] = rslt.getShort(40);
               ((short[]) buf[56])[0] = rslt.getShort(41);
               ((short[]) buf[57])[0] = rslt.getShort(42);
               ((String[]) buf[58])[0] = rslt.getString(43, 8);
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[60])[0] = rslt.getString(45, 6);
               ((byte[]) buf[61])[0] = rslt.getByte(46);
               ((int[]) buf[62])[0] = rslt.getInt(47);
               ((String[]) buf[63])[0] = rslt.getString(48, 13);
               ((String[]) buf[64])[0] = rslt.getString(49, 30);
               ((int[]) buf[65])[0] = rslt.getInt(50);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(51, 12);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(52,2);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(53,2);
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(54,2);
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(55,2);
               ((java.math.BigDecimal[]) buf[74])[0] = rslt.getBigDecimal(56,2);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[76])[0] = rslt.getBigDecimal(57,2);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[78])[0] = rslt.getBigDecimal(58,2);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,5);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,3);
               ((String[]) buf[14])[0] = rslt.getString(13, 16);
               ((String[]) buf[15])[0] = rslt.getString(14, 6);
               ((String[]) buf[16])[0] = rslt.getString(15, 26);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,3);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 26);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,4);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,5);
               ((short[]) buf[24])[0] = rslt.getShort(22);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 8 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((String[]) buf[7])[0] = rslt.getString(7, 60);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 28);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 15 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 10);
               return;
      }
   }

}

