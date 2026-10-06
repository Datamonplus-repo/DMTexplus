package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rrac006_impl extends GXWebReport
{
   public rrac006_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV44EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV11BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            AV13BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            AV12BarCodPar = httpContext.GetPar( "BarCodPar") ;
            AV15BarMaqCod = httpContext.GetPar( "BarMaqCod") ;
            AV17BarSua = httpContext.GetPar( "BarSua") ;
            AV156Volumen = (int)(GXutil.lval( httpContext.GetPar( "Volumen"))) ;
            AV148RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
            AV91ImpCod = httpContext.GetPar( "ImpCod") ;
            Gx_out = httpContext.GetPar( "Gx_out") ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 1 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Execute user subroutine: 'INICIAMOS' */
         S181 ();
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
         AV248TotBanyos = (short)(0) ;
         AV249NumBanyo = (short)(0) ;
         /* Using cursor P07212 */
         pr_default.execute(0, new Object[] {AV44EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV13BarCodReo), AV12BarCodPar, AV15BarMaqCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A6039RecAcab = P07212_A6039RecAcab[0] ;
            n6039RecAcab = P07212_n6039RecAcab[0] ;
            A602MaqCod = P07212_A602MaqCod[0] ;
            A130BarCodPar = P07212_A130BarCodPar[0] ;
            A132BarCodReo = P07212_A132BarCodReo[0] ;
            A129BarCod = P07212_A129BarCod[0] ;
            A396EmprCod = P07212_A396EmprCod[0] ;
            A2804RecLinMaq = P07212_A2804RecLinMaq[0] ;
            AV248TotBanyos = (short)(AV248TotBanyos+1) ;
            if ( AV148RecLinMaq == A2804RecLinMaq )
            {
               AV249NumBanyo = AV248TotBanyos ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV35Coste = DecimalUtil.doubleToDec(0) ;
         AV36Coste2 = DecimalUtil.doubleToDec(0) ;
         AV38DesCol = GXutil.substring( AV116TipCol, 1, 15) ;
         AV39DesInt = GXutil.substring( AV92Intens, 1, 20) ;
         GxHdr3 = true ;
         /* Using cursor P07216 */
         pr_default.execute(1, new Object[] {AV44EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV13BarCodReo), AV12BarCodPar, Short.valueOf(AV148RecLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3915EmpNumDec = P07216_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P07216_n3915EmpNumDec[0] ;
            A130BarCodPar = P07216_A130BarCodPar[0] ;
            A132BarCodReo = P07216_A132BarCodReo[0] ;
            A396EmprCod = P07216_A396EmprCod[0] ;
            A129BarCod = P07216_A129BarCod[0] ;
            A2804RecLinMaq = P07216_A2804RecLinMaq[0] ;
            A4018BarBot = P07216_A4018BarBot[0] ;
            A6434BarAsi = P07216_A6434BarAsi[0] ;
            A4833BarAudTur = P07216_A4833BarAudTur[0] ;
            n4833BarAudTur = P07216_n4833BarAudTur[0] ;
            A4937BarCtrPdas = P07216_A4937BarCtrPdas[0] ;
            n4937BarCtrPdas = P07216_n4937BarCtrPdas[0] ;
            A4467BarAcaMar = P07216_A4467BarAcaMar[0] ;
            A5115RecAbsFac = P07216_A5115RecAbsFac[0] ;
            A9998RecAnc = P07216_A9998RecAnc[0] ;
            n9998RecAnc = P07216_n9998RecAnc[0] ;
            A9996RecObsq = P07216_A9996RecObsq[0] ;
            n9996RecObsq = P07216_n9996RecObsq[0] ;
            A9997Recgrm = P07216_A9997Recgrm[0] ;
            n9997Recgrm = P07216_n9997Recgrm[0] ;
            A9764RecLtsSR = P07216_A9764RecLtsSR[0] ;
            n9764RecLtsSR = P07216_n9764RecLtsSR[0] ;
            A11507RecAva = P07216_A11507RecAva[0] ;
            n11507RecAva = P07216_n11507RecAva[0] ;
            A12128RecAs = P07216_A12128RecAs[0] ;
            n12128RecAs = P07216_n12128RecAs[0] ;
            A12129RecAi = P07216_A12129RecAi[0] ;
            n12129RecAi = P07216_n12129RecAi[0] ;
            A148BarEstReo = P07216_A148BarEstReo[0] ;
            A3006BarCoef = P07216_A3006BarCoef[0] ;
            n3006BarCoef = P07216_n3006BarCoef[0] ;
            A1226BarGraCru = P07216_A1226BarGraCru[0] ;
            A4268RecOrdLin = P07216_A4268RecOrdLin[0] ;
            n4268RecOrdLin = P07216_n4268RecOrdLin[0] ;
            A4812BarEncCli = P07216_A4812BarEncCli[0] ;
            A4867RecFecMod = P07216_A4867RecFecMod[0] ;
            n4867RecFecMod = P07216_n4867RecFecMod[0] ;
            A4868RecUsrMod = P07216_A4868RecUsrMod[0] ;
            n4868RecUsrMod = P07216_n4868RecUsrMod[0] ;
            A4866RecFecAlt = P07216_A4866RecFecAlt[0] ;
            n4866RecFecAlt = P07216_n4866RecFecAlt[0] ;
            A4402RecUsrCod = P07216_A4402RecUsrCod[0] ;
            A5109RecNumInt = P07216_A5109RecNumInt[0] ;
            A212BarSer = P07216_A212BarSer[0] ;
            A224BarTraP1 = P07216_A224BarTraP1[0] ;
            A221BarTra1 = P07216_A221BarTra1[0] ;
            A225BarTraP2 = P07216_A225BarTraP2[0] ;
            A222BarTra2 = P07216_A222BarTra2[0] ;
            A226BarTraP3 = P07216_A226BarTraP3[0] ;
            A223BarTra3 = P07216_A223BarTra3[0] ;
            A217BarTipArt = P07216_A217BarTipArt[0] ;
            n217BarTipArt = P07216_n217BarTipArt[0] ;
            A3137BarGraAca2 = P07216_A3137BarGraAca2[0] ;
            A1652BarSerDsc = P07216_A1652BarSerDsc[0] ;
            A126BarAncAca2 = P07216_A126BarAncAca2[0] ;
            A125BarAncAca1 = P07216_A125BarAncAca1[0] ;
            A1909BarGraAca = P07216_A1909BarGraAca[0] ;
            A143BarDisNum = P07216_A143BarDisNum[0] ;
            A2806RecFA = P07216_A2806RecFA[0] ;
            A5110RecNumPrg = P07216_A5110RecNumPrg[0] ;
            A218BarTipCol = P07216_A218BarTipCol[0] ;
            A136BarColNum = P07216_A136BarColNum[0] ;
            A135BarColNom = P07216_A135BarColNom[0] ;
            A279CliNom = P07216_A279CliNom[0] ;
            A252CliCod = P07216_A252CliCod[0] ;
            n252CliCod = P07216_n252CliCod[0] ;
            A9789BarItem5 = P07216_A9789BarItem5[0] ;
            A4461BarLotMts = P07216_A4461BarLotMts[0] ;
            A9775BarItem1 = P07216_A9775BarItem1[0] ;
            A9812RecHdrLts = P07216_A9812RecHdrLts[0] ;
            n9812RecHdrLts = P07216_n9812RecHdrLts[0] ;
            A9811RecAbs2 = P07216_A9811RecAbs2[0] ;
            n9811RecAbs2 = P07216_n9811RecAbs2[0] ;
            A4271RecFagKgs = P07216_A4271RecFagKgs[0] ;
            A4259RecTotKgs = P07216_A4259RecTotKgs[0] ;
            A4272RecFagMts = P07216_A4272RecFagMts[0] ;
            A4260RecTotMts = P07216_A4260RecTotMts[0] ;
            n4260RecTotMts = P07216_n4260RecTotMts[0] ;
            A184BarMtr = P07216_A184BarMtr[0] ;
            n184BarMtr = P07216_n184BarMtr[0] ;
            A870BarTotMtr = P07216_A870BarTotMtr[0] ;
            n870BarTotMtr = P07216_n870BarTotMtr[0] ;
            A3915EmpNumDec = P07216_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P07216_n3915EmpNumDec[0] ;
            A4018BarBot = P07216_A4018BarBot[0] ;
            A6434BarAsi = P07216_A6434BarAsi[0] ;
            A4833BarAudTur = P07216_A4833BarAudTur[0] ;
            n4833BarAudTur = P07216_n4833BarAudTur[0] ;
            A4937BarCtrPdas = P07216_A4937BarCtrPdas[0] ;
            n4937BarCtrPdas = P07216_n4937BarCtrPdas[0] ;
            A4467BarAcaMar = P07216_A4467BarAcaMar[0] ;
            A148BarEstReo = P07216_A148BarEstReo[0] ;
            A3006BarCoef = P07216_A3006BarCoef[0] ;
            n3006BarCoef = P07216_n3006BarCoef[0] ;
            A1226BarGraCru = P07216_A1226BarGraCru[0] ;
            A4812BarEncCli = P07216_A4812BarEncCli[0] ;
            A212BarSer = P07216_A212BarSer[0] ;
            A224BarTraP1 = P07216_A224BarTraP1[0] ;
            A221BarTra1 = P07216_A221BarTra1[0] ;
            A225BarTraP2 = P07216_A225BarTraP2[0] ;
            A222BarTra2 = P07216_A222BarTra2[0] ;
            A226BarTraP3 = P07216_A226BarTraP3[0] ;
            A223BarTra3 = P07216_A223BarTra3[0] ;
            A217BarTipArt = P07216_A217BarTipArt[0] ;
            n217BarTipArt = P07216_n217BarTipArt[0] ;
            A3137BarGraAca2 = P07216_A3137BarGraAca2[0] ;
            A1652BarSerDsc = P07216_A1652BarSerDsc[0] ;
            A126BarAncAca2 = P07216_A126BarAncAca2[0] ;
            A125BarAncAca1 = P07216_A125BarAncAca1[0] ;
            A1909BarGraAca = P07216_A1909BarGraAca[0] ;
            A143BarDisNum = P07216_A143BarDisNum[0] ;
            A218BarTipCol = P07216_A218BarTipCol[0] ;
            A136BarColNum = P07216_A136BarColNum[0] ;
            A135BarColNom = P07216_A135BarColNom[0] ;
            A252CliCod = P07216_A252CliCod[0] ;
            n252CliCod = P07216_n252CliCod[0] ;
            A9789BarItem5 = P07216_A9789BarItem5[0] ;
            A4461BarLotMts = P07216_A4461BarLotMts[0] ;
            A9775BarItem1 = P07216_A9775BarItem1[0] ;
            A279CliNom = P07216_A279CliNom[0] ;
            A870BarTotMtr = P07216_A870BarTotMtr[0] ;
            n870BarTotMtr = P07216_n870BarTotMtr[0] ;
            A184BarMtr = P07216_A184BarMtr[0] ;
            n184BarMtr = P07216_n184BarMtr[0] ;
            A4271RecFagKgs = P07216_A4271RecFagKgs[0] ;
            A4272RecFagMts = P07216_A4272RecFagMts[0] ;
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
            AV236S = " " ;
            AV237C = " " ;
            AV240P = A4018BarBot ;
            AV238Pf = " " ;
            if ( A6434BarAsi == 1 )
            {
               AV237C = httpContext.getMessage( "N", "") ;
            }
            if ( A6434BarAsi == 2 )
            {
               AV237C = httpContext.getMessage( "S", "") ;
            }
            if ( A4833BarAudTur == 1 )
            {
               AV236S = httpContext.getMessage( "N", "") ;
            }
            if ( A4833BarAudTur == 2 )
            {
               AV236S = httpContext.getMessage( "S", "") ;
            }
            if ( A4937BarCtrPdas == 1 )
            {
               AV238Pf = httpContext.getMessage( "S", "") ;
            }
            AV239Forcodext = ((GXutil.strcmp(A4467BarAcaMar, "0")==0) ? " " : A4467BarAcaMar) ;
            AV19CliCod = A252CliCod ;
            AV8ArtCod = A212BarSer ;
            AV110ForColNom = A135BarColNom ;
            AV111ForColNum = A136BarColNum ;
            AV25Colorante = AV117TipColCod ;
            AV209Recabsfac = (short)(DecimalUtil.decToDouble(A5115RecAbsFac)) ;
            AV207RecAnc = A9998RecAnc ;
            AV210RecObsq = A9996RecObsq ;
            AV208Recgrm = A9997Recgrm ;
            AV216RecLtssr = A9764RecLtsSR ;
            AV232Recava = A11507RecAva ;
            AV234RecAs = A12128RecAs ;
            AV235RecAi = A12129RecAi ;
            AV62Remonta = "" ;
            if ( A148BarEstReo >= 1 )
            {
               AV62Remonta = AV125Lit44 ;
            }
            AV93Largura = DecimalUtil.doubleToDec(A125BarAncAca1/ (double) (100)) ;
            AV14BarGraAca = A1909BarGraAca ;
            AV115TiempoV = A3006BarCoef ;
            AV87GrMlin = DecimalUtil.doubleToDec(A1226BarGraCru*(A125BarAncAca1/ (double) (100))) ;
            AV27CompTP = DecimalUtil.doubleToDec(0) ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87GrMlin)==0) )
            {
               AV27CompTP = (A4316RecMaqKgs.multiply(DecimalUtil.doubleToDec(1000))).divide(AV87GrMlin, 18, java.math.RoundingMode.DOWN) ;
            }
            AV131Lts1 = AV156Volumen ;
            AV132Lts2 = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV131Lts1).subtract((DecimalUtil.doubleToDec(2).multiply(A4316RecMaqKgs))))) ;
            AV149RelBany = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV156Volumen).divide(A4316RecMaqKgs, 18, java.math.RoundingMode.DOWN)), 0))) ;
            GX_I = 1 ;
            while ( GX_I <= 6 )
            {
               AV58Procesos[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 6 )
            {
               AV59Tiempos[GX_I-1] = (short)(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV90I = (byte)(1) ;
            AV119TotTiempo = 0 ;
            /* Using cursor P07217 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV148RecLinMaq)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2804RecLinMaq = P07217_A2804RecLinMaq[0] ;
               A764ProForCod = P07217_A764ProForCod[0] ;
               A771ProForTie = P07217_A771ProForTie[0] ;
               A1273RecLinPro = P07217_A1273RecLinPro[0] ;
               A771ProForTie = P07217_A771ProForTie[0] ;
               AV58Procesos[AV90I-1] = A764ProForCod ;
               AV59Tiempos[AV90I-1] = A771ProForTie ;
               AV119TotTiempo = (long)(AV119TotTiempo+A771ProForTie) ;
               AV90I = (byte)(AV90I+1) ;
               if ( AV90I > 6 )
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
               AV180RecObs[GX_I-1] = GXutil.space( (short)(60)) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV90I = (byte)(1) ;
            /* Using cursor P07218 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A5258RecTxtObs = P07218_A5258RecTxtObs[0] ;
               n5258RecTxtObs = P07218_n5258RecTxtObs[0] ;
               A5257RecLinObs = P07218_A5257RecLinObs[0] ;
               if ( AV90I > 2 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV180RecObs[AV90I-1] = A5258RecTxtObs ;
               AV90I = (byte)(AV90I+1) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            AV89HojRut = "*" + GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + "*" ;
            AV63Hdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.str( A132BarCodReo, 1, 0) + " " + A130BarCodPar ;
            /* Execute user subroutine: 'DESCMAQ' */
            S151 ();
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
            if ( (0==AV141NumCam) )
            {
               AV141NumCam = (byte)(1) ;
            }
            AV26CompCamar = AV27CompTP.divide(DecimalUtil.doubleToDec(AV141NumCam), 18, java.math.RoundingMode.DOWN) ;
            /* Using cursor P07219 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV148RecLinMaq)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A4587ProRecObs = P07219_A4587ProRecObs[0] ;
               A1273RecLinPro = P07219_A1273RecLinPro[0] ;
               A2804RecLinMaq = P07219_A2804RecLinMaq[0] ;
               A772ProForTmx = P07219_A772ProForTmx[0] ;
               A2393ProNumRec = P07219_A2393ProNumRec[0] ;
               A2392ProNumPro = P07219_A2392ProNumPro[0] ;
               A766ProForDsc = P07219_A766ProForDsc[0] ;
               A771ProForTie = P07219_A771ProForTie[0] ;
               A764ProForCod = P07219_A764ProForCod[0] ;
               A772ProForTmx = P07219_A772ProForTmx[0] ;
               A2393ProNumRec = P07219_A2393ProNumRec[0] ;
               A2392ProNumPro = P07219_A2392ProNumPro[0] ;
               A766ProForDsc = P07219_A766ProForDsc[0] ;
               A771ProForTie = P07219_A771ProForTie[0] ;
               AV214Profortmx = A772ProForTmx ;
               h7210( false, 27) ;
               getPrinter().GxDrawRect(6, Gx_line+2, 779, Gx_line+25, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "m", ""), 506, Gx_line+5, 517, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 34, Gx_line+5, 84, Gx_line+22, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9")), 469, Gx_line+5, 499, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 97, Gx_line+5, 286, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 1, 192, 192, 192) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9")), 633, Gx_line+5, 670, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9")), 739, Gx_line+5, 776, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79Lit35, "")), 398, Gx_line+5, 470, Gx_line+21, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81Lit37, "")), 677, Gx_line+5, 735, Gx_line+22, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Temp", ""), 294, Gx_line+5, 325, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV214Profortmx), "ZZZZ")), 343, Gx_line+4, 382, Gx_line+23, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80Lit36, "")), 550, Gx_line+5, 633, Gx_line+22, 2, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+27) ;
               /* Using cursor P072110 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A719PrdNum = P072110_A719PrdNum[0] ;
                  n719PrdNum = P072110_n719PrdNum[0] ;
                  A488ForPrdDsc = P072110_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P072110_n488ForPrdDsc[0] ;
                  A431FacCon = P072110_A431FacCon[0] ;
                  A2394RecForNro = P072110_A2394RecForNro[0] ;
                  A1643PrdTip = P072110_A1643PrdTip[0] ;
                  A5416PrdDensS = P072110_A5416PrdDensS[0] ;
                  A4693PrdNum2 = P072110_A4693PrdNum2[0] ;
                  A724PrdPreAct = P072110_A724PrdPreAct[0] ;
                  A686PrdCant = P072110_A686PrdCant[0] ;
                  A872RecPrdNum = P072110_A872RecPrdNum[0] ;
                  A875RecPrdDsc = P072110_A875RecPrdDsc[0] ;
                  A12641RecPrdDc2 = P072110_A12641RecPrdDc2[0] ;
                  A490ForPrdUMe = P072110_A490ForPrdUMe[0] ;
                  n490ForPrdUMe = P072110_n490ForPrdUMe[0] ;
                  A743PrdUniCon = P072110_A743PrdUniCon[0] ;
                  A5725RecLote = P072110_A5725RecLote[0] ;
                  A707PrdFacCon = P072110_A707PrdFacCon[0] ;
                  A811RecLin = P072110_A811RecLin[0] ;
                  A1643PrdTip = P072110_A1643PrdTip[0] ;
                  A5416PrdDensS = P072110_A5416PrdDensS[0] ;
                  A4693PrdNum2 = P072110_A4693PrdNum2[0] ;
                  A724PrdPreAct = P072110_A724PrdPreAct[0] ;
                  A743PrdUniCon = P072110_A743PrdUniCon[0] ;
                  A707PrdFacCon = P072110_A707PrdFacCon[0] ;
                  A488ForPrdDsc = P072110_A488ForPrdDsc[0] ;
                  n488ForPrdDsc = P072110_n488ForPrdDsc[0] ;
                  AV122Var2 = GXutil.substring( A488ForPrdDsc, 1, 4) ;
                  AV121Var1 = GXutil.str( A431FacCon, 11, 5) + " " + AV122Var2 ;
                  if ( (0==A2394RecForNro) )
                  {
                     AV147RecForNro = "  " ;
                  }
                  else
                  {
                     AV147RecForNro = GXutil.str( A2394RecForNro, 2, 0) ;
                  }
                  if ( AV213Orient == 1 )
                  {
                     if ( GXutil.strcmp(A1643PrdTip, httpContext.getMessage( "A", "")) == 0 )
                     {
                        AV147RecForNro = httpContext.getMessage( "AUT", "") ;
                     }
                     else
                     {
                        AV147RecForNro = httpContext.getMessage( "MAN", "") ;
                     }
                  }
                  AV242Densidad = A5416PrdDensS ;
                  AV215PrdAux = ((AV222Jpf==1) ? GXutil.str( AV242Densidad, 7, 5) : GXutil.substring( A4693PrdNum2, 1, 3)) ;
                  if ( AV254Costelinea == 1 )
                  {
                     AV253ValorEI = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( (A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A724PrdPreAct), 2))) ;
                     AV215PrdAux = GXutil.str( AV253ValorEI, 7, 0) ;
                  }
                  if ( (GXutil.strcmp("", A872RecPrdNum)==0) )
                  {
                     if ( (GXutil.strcmp("", A875RecPrdDsc)==0) && ( AV56FlagNline == 0 ) )
                     {
                        h7210( false, 10) ;
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
                           if ( AV199Carvema == 0 )
                           {
                              AV145PrdDsc = A875RecPrdDsc ;
                              h7210( false, 17) ;
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV145PrdDsc, "")), 206, Gx_line+0, 423, Gx_line+17, 0, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+17) ;
                           }
                           else
                           {
                              AV252Linea2 = A875RecPrdDsc + A12641RecPrdDc2 ;
                              h7210( false, 17) ;
                              getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV252Linea2, "")), 11, Gx_line+0, 487, Gx_line+17, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+17) ;
                           }
                        }
                     }
                  }
                  else
                  {
                     AV24CodPrd = GXutil.substring( A872RecPrdNum, 1, 1) ;
                     if ( AV54FlagImp == 1 )
                     {
                        if ( ( ( A686PrdCant.doubleValue() >= 1000 ) && ( ( GXutil.strcmp(AV24CodPrd, "0") == 0 ) || ( GXutil.strcmp(AV24CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV24CodPrd, "9") == 0 ) ) && ( AV247todosproductos == 0 ) ) || ( ( ( GXutil.strcmp(AV24CodPrd, "0") >= 0 ) && ( GXutil.strcmp(AV24CodPrd, "9") <= 0 ) ) && ( AV247todosproductos == 1 ) ) )
                        {
                           AV18Cantidad = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                           if ( A490ForPrdUMe == 2 )
                           {
                              AV120Unidades = httpContext.getMessage( "l", "") ;
                           }
                           else
                           {
                              if ( A490ForPrdUMe == 3 )
                              {
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV120Unidades = httpContext.getMessage( "l", "") ;
                                 }
                                 else
                                 {
                                    AV120Unidades = httpContext.getMessage( "kg", "") ;
                                 }
                              }
                              else
                              {
                                 AV120Unidades = httpContext.getMessage( "kg", "") ;
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV120Unidades = httpContext.getMessage( "l", "") ;
                                 }
                              }
                           }
                        }
                        else
                        {
                           AV18Cantidad = A686PrdCant ;
                           if ( A490ForPrdUMe == 2 )
                           {
                              AV120Unidades = httpContext.getMessage( "cc", "") ;
                           }
                           else
                           {
                              if ( A490ForPrdUMe == 3 )
                              {
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV120Unidades = httpContext.getMessage( "cc", "") ;
                                 }
                                 else
                                 {
                                    AV120Unidades = httpContext.getMessage( "g", "") ;
                                 }
                              }
                              else
                              {
                                 AV120Unidades = httpContext.getMessage( "g", "") ;
                                 if ( A743PrdUniCon == 3 )
                                 {
                                    AV120Unidades = httpContext.getMessage( "cc", "") ;
                                 }
                              }
                           }
                        }
                        if ( ( GXutil.strcmp(AV24CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV24CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV24CodPrd, "0") == 0 ) )
                        {
                           AV187Cant_a = GXutil.str( AV18Cantidad, 11, 3) ;
                           if ( ( GXutil.strcmp(GXutil.substring( AV187Cant_a, 9, 3), "000") == 0 ) && ( AV189Sin_dec == 1 ) )
                           {
                              AV188Cant_sd = (int)(GXutil.Int( DecimalUtil.decToDouble(AV18Cantidad))) ;
                              if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                              {
                                 h7210( false, 40) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV188Cant_sd), "ZZZ,ZZZ")), 525, Gx_line+0, 577, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 584, Gx_line+0, 606, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(607, Gx_line+25, 736, Gx_line+42, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+40) ;
                              }
                              else
                              {
                                 h7210( false, 17) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV188Cant_sd), "ZZZ,ZZZ")), 525, Gx_line+0, 577, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 581, Gx_line+0, 603, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(607, Gx_line+0, 736, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(651, Gx_line+1, 651, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(692, Gx_line+0, 692, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(734, Gx_line+0, 734, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV215PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+17) ;
                              }
                           }
                           else
                           {
                              if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                              {
                                 h7210( false, 17) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.9999")), 489, Gx_line+0, 578, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 581, Gx_line+0, 603, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+17) ;
                              }
                              else
                              {
                                 h7210( false, 18) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.9999")), 489, Gx_line+0, 578, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 581, Gx_line+0, 603, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV215PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
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
                              if ( AV199Carvema == 0 )
                              {
                                 h7210( false, 17) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 370, Gx_line+17, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+17) ;
                              }
                              else
                              {
                                 AV252Linea2 = A875RecPrdDsc + A12641RecPrdDc2 ;
                                 h7210( false, 17) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV252Linea2, "")), 11, Gx_line+0, 487, Gx_line+17, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+17) ;
                              }
                           }
                           else
                           {
                              AV187Cant_a = GXutil.str( AV18Cantidad, 11, 3) ;
                              if ( ( GXutil.strcmp(GXutil.substring( AV187Cant_a, 9, 3), "000") == 0 ) && ( AV189Sin_dec == 1 ) )
                              {
                                 AV188Cant_sd = (int)(GXutil.Int( DecimalUtil.decToDouble(AV18Cantidad))) ;
                                 if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                                 {
                                    h7210( false, 18) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV188Cant_sd), "ZZZ,ZZZ")), 518, Gx_line+0, 577, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 581, Gx_line+1, 603, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+18) ;
                                 }
                                 else
                                 {
                                    h7210( false, 19) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV188Cant_sd), "ZZZ,ZZZ")), 518, Gx_line+0, 577, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawRect(607, Gx_line+0, 736, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(651, Gx_line+1, 651, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(692, Gx_line+0, 692, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(734, Gx_line+0, 734, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 581, Gx_line+1, 603, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV215PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+19) ;
                                 }
                              }
                              else
                              {
                                 if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                                 {
                                    h7210( false, 19) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 211, Gx_line+0, 261, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.9999")), 476, Gx_line+0, 577, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 581, Gx_line+1, 603, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+19) ;
                                 }
                                 else
                                 {
                                    h7210( false, 18) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 206, Gx_line+0, 256, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.9999")), 476, Gx_line+0, 577, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV120Unidades, "")), 581, Gx_line+1, 603, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawRect(607, Gx_line+0, 736, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(651, Gx_line+1, 651, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(692, Gx_line+0, 692, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(734, Gx_line+0, 734, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV215PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
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
                        AV18Cantidad = A686PrdCant ;
                        if ( ( GXutil.strcmp(AV24CodPrd, "8") == 0 ) || ( GXutil.strcmp(AV24CodPrd, "9") == 0 ) || ( GXutil.strcmp(AV24CodPrd, "0") == 0 ) )
                        {
                           AV187Cant_a = GXutil.str( AV18Cantidad, 11, 3) ;
                           if ( ( GXutil.strcmp(GXutil.substring( AV187Cant_a, 9, 3), "000") == 0 ) && ( AV189Sin_dec == 1 ) )
                           {
                              AV188Cant_sd = (int)(GXutil.Int( DecimalUtil.decToDouble(AV18Cantidad))) ;
                              if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                              {
                                 h7210( false, 18) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV188Cant_sd), "ZZZ,ZZZ")), 525, Gx_line+0, 577, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+18) ;
                              }
                              else
                              {
                                 h7210( false, 18) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV188Cant_sd), "ZZZ,ZZZ")), 525, Gx_line+0, 577, Gx_line+17, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawRect(607, Gx_line+0, 736, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(656, Gx_line+1, 656, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(697, Gx_line+0, 697, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxDrawLine(740, Gx_line+0, 740, Gx_line+17, 1, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV215PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+18) ;
                              }
                           }
                           else
                           {
                              if ( AV231Er == 0 )
                              {
                                 if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                                 {
                                    h7210( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.9999")), 489, Gx_line+0, 578, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                 }
                                 else
                                 {
                                    h7210( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.9999")), 489, Gx_line+0, 578, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawRect(607, Gx_line+0, 736, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(656, Gx_line+1, 656, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(697, Gx_line+0, 697, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(740, Gx_line+0, 740, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV215PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                 }
                              }
                              else
                              {
                                 h7210( false, 18) ;
                                 getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 162, Gx_line+19, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 167, Gx_line+0, 224, Gx_line+19, 0+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 228, Gx_line+0, 461, Gx_line+17, 0, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.9999")), 464, Gx_line+0, 578, Gx_line+19, 2+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV215PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
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
                              if ( AV199Carvema == 0 )
                              {
                                 h7210( false, 17) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 370, Gx_line+17, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+17) ;
                              }
                              else
                              {
                                 AV252Linea2 = A875RecPrdDsc + A12641RecPrdDc2 ;
                                 h7210( false, 17) ;
                                 getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV252Linea2, "")), 11, Gx_line+0, 487, Gx_line+17, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+17) ;
                              }
                           }
                           else
                           {
                              AV187Cant_a = GXutil.str( AV18Cantidad, 11, 3) ;
                              if ( ( GXutil.strcmp(GXutil.substring( AV187Cant_a, 9, 3), "000") == 0 ) && ( AV189Sin_dec == 1 ) )
                              {
                                 AV188Cant_sd = (int)(GXutil.Int( DecimalUtil.decToDouble(AV18Cantidad))) ;
                                 if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                                 {
                                    h7210( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV188Cant_sd), "ZZZ,ZZZ")), 525, Gx_line+0, 577, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                 }
                                 else
                                 {
                                    h7210( false, 17) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV188Cant_sd), "ZZZ,ZZZ")), 525, Gx_line+0, 577, Gx_line+17, 2+256, 0, 0, 0) ;
                                    getPrinter().GxDrawRect(607, Gx_line+0, 736, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(656, Gx_line+1, 656, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(697, Gx_line+0, 697, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(740, Gx_line+0, 740, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV215PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+17) ;
                                 }
                              }
                              else
                              {
                                 if ( GXutil.strcmp(A5725RecLote, "") != 0 )
                                 {
                                    h7210( false, 18) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.9999")), 476, Gx_line+0, 577, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Calibri", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5725RecLote, "")), 653, Gx_line+0, 817, Gx_line+16, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+18) ;
                                 }
                                 else
                                 {
                                    h7210( false, 18) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121Var1, "")), 11, Gx_line+0, 144, Gx_line+16, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), 152, Gx_line+0, 202, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), 206, Gx_line+0, 439, Gx_line+17, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV147RecForNro, "")), 447, Gx_line+0, 470, Gx_line+17, 0+256, 0, 0, 0) ;
                                    getPrinter().GxDrawRect(607, Gx_line+0, 736, Gx_line+17, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(656, Gx_line+1, 656, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(697, Gx_line+0, 697, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxDrawLine(740, Gx_line+0, 740, Gx_line+17, 1, 0, 0, 0, 0) ;
                                    getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV18Cantidad, "ZZZ,ZZ9.9999")), 476, Gx_line+0, 577, Gx_line+19, 2+256, 0, 0, 0) ;
                                    getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                    getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV215PrdAux, "")), 739, Gx_line+0, 791, Gx_line+18, 0+256, 0, 0, 0) ;
                                    Gx_OldLine = Gx_line ;
                                    Gx_line = (int)(Gx_line+18) ;
                                 }
                              }
                           }
                        }
                     }
                  }
                  if ( AV47Flag == 1 )
                  {
                     if ( A3915EmpNumDec == 0 )
                     {
                        AV36Coste2 = AV36Coste2.add((A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                     }
                     else
                     {
                        if ( A3915EmpNumDec == 2 )
                        {
                           if ( A490ForPrdUMe == 4 )
                           {
                              AV36Coste2 = AV36Coste2.add(GXutil.roundDecimal( A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon), 2)) ;
                           }
                           else
                           {
                              AV36Coste2 = AV36Coste2.add(GXutil.roundDecimal( A686PrdCant.multiply(A724PrdPreAct).multiply(A707PrdFacCon).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2)) ;
                           }
                        }
                     }
                  }
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               if ( ! (GXutil.strcmp("", A4587ProRecObs)==0) )
               {
                  AV200Nlin = (short)(GXutil.gxmlines( A4587ProRecObs, (short)(40))) ;
                  if ( AV200Nlin > 20 )
                  {
                     AV200Nlin = (short)(20) ;
                  }
                  AV201j = (short)(1) ;
                  while ( AV201j <= AV200Nlin )
                  {
                     AV202Obs_l = GXutil.gxgetmli( A4587ProRecObs, AV201j, (short)(40)) ;
                     if ( GXutil.strcmp(AV202Obs_l, " ") != 0 )
                     {
                        if ( AV201j == 1 )
                        {
                           h7210( false, 32) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV202Obs_l, "")), 6, Gx_line+16, 507, Gx_line+33, 0+256, 0, 0, 0) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(httpContext.getMessage( "Observaçoes", ""), 6, Gx_line+0, 79, Gx_line+18, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+32) ;
                        }
                        else
                        {
                           h7210( false, 17) ;
                           getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                           getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV202Obs_l, "")), 6, Gx_line+0, 507, Gx_line+17, 0+256, 0, 0, 0) ;
                           Gx_OldLine = Gx_line ;
                           Gx_line = (int)(Gx_line+17) ;
                        }
                     }
                     AV201j = (short)(AV201j+1) ;
                  }
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            if ( AV47Flag == 1 )
            {
               if ( A3915EmpNumDec == 0 )
               {
                  AV35Coste = AV36Coste2 ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     AV35Coste = GXutil.roundDecimal( AV36Coste2, 2) ;
                  }
               }
               if ( A4316RecMaqKgs.doubleValue() != 0 )
               {
                  if ( A3915EmpNumDec == 0 )
                  {
                     AV33CosKgm = AV35Coste.divide(A4316RecMaqKgs, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     if ( A3915EmpNumDec == 2 )
                     {
                        AV33CosKgm = GXutil.roundDecimal( AV35Coste.divide(A4316RecMaqKgs, 18, java.math.RoundingMode.DOWN), 2) ;
                     }
                  }
               }
               else
               {
                  AV33CosKgm = DecimalUtil.doubleToDec(0) ;
               }
               if ( A871RecTotMtr.doubleValue() != 0 )
               {
                  if ( A3915EmpNumDec == 0 )
                  {
                     AV34CosMtr = AV35Coste.divide(A4317RecMaqMts, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     if ( A3915EmpNumDec == 2 )
                     {
                        AV34CosMtr = GXutil.roundDecimal( AV35Coste.divide(A4317RecMaqMts, 18, java.math.RoundingMode.DOWN), 2) ;
                     }
                  }
               }
               else
               {
                  AV34CosMtr = DecimalUtil.doubleToDec(0) ;
               }
               h7210( false, 21) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "K", ""), 645, Gx_line+4, 655, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "M", ""), 754, Gx_line+4, 766, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35Coste, "ZZZZZZ9.99")), 7, Gx_line+4, 81, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33CosKgm, "ZZZZZZ9.99")), 552, Gx_line+4, 626, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34CosMtr, "ZZZZZZ9.99")), 667, Gx_line+4, 741, Gx_line+21, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(7, Gx_line+2, 780, Gx_line+2, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+21) ;
            }
            if ( AV199Carvema == 0 )
            {
               /* Execute user subroutine: 'OBSFOR' */
               S161 ();
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
            AV198Recordlin = A4268RecOrdLin ;
            if ( AV199Carvema == 1 )
            {
               /* Execute user subroutine: 'FASQUI' */
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
               /* Execute user subroutine: 'MASDATOS' */
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
            if ( AV243piolera == 1 )
            {
               h7210( false, 56) ;
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
               if ( AV250anahuac == 1 )
               {
                  h7210( false, 57) ;
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
         if ( AV213Orient == 1 )
         {
            h7210( false, 84) ;
            getPrinter().GxAttris("Times New Roman", 16, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "SEGUIR LA TEMPERATURA INDICADA", ""), 6, Gx_line+19, 779, Gx_line+48, 1, 0, 1, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "\\\"COMPROBAR LOS PRODUCTOS MANUALES QUE SE HAN DE AÑADIR\\\"", ""), 6, Gx_line+48, 779, Gx_line+77, 1, 0, 1, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+84) ;
         }
         if ( AV222Jpf == 1 )
         {
            if ( GXutil.strcmp(AV15BarMaqCod, httpContext.getMessage( "CONOPR", "")) != 0 )
            {
               h7210( false, 185) ;
               getPrinter().GxDrawRect(107, Gx_line+16, 665, Gx_line+183, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "RAMOLA", ""), 239, Gx_line+50, 298, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Sobrealiment.:", ""), 117, Gx_line+76, 235, Gx_line+93, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV223Varp1, "")), 247, Gx_line+76, 306, Gx_line+93, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("%", 316, Gx_line+76, 333, Gx_line+94, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Velocidade", ""), 239, Gx_line+100, 300, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Automatico", ""), 117, Gx_line+127, 201, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV224Varp2, "")), 210, Gx_line+127, 269, Gx_line+144, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Manual", ""), 275, Gx_line+127, 326, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV225Varpar3, "")), 328, Gx_line+127, 387, Gx_line+144, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "m/ min", ""), 392, Gx_line+127, 433, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "SANFOR", ""), 516, Gx_line+100, 571, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Compataçao:", ""), 446, Gx_line+127, 539, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV226VarP4, "")), 554, Gx_line+127, 613, Gx_line+144, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "mm", ""), 618, Gx_line+127, 640, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Velocidade:", ""), 445, Gx_line+158, 538, Gx_line+175, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV227VarP5, "")), 554, Gx_line+158, 613, Gx_line+175, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "m/ min", ""), 618, Gx_line+158, 659, Gx_line+176, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CALANDRA", ""), 505, Gx_line+50, 580, Gx_line+68, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pressao:", ""), 450, Gx_line+76, 518, Gx_line+93, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV228varP6, "")), 521, Gx_line+76, 580, Gx_line+93, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ton/DaN", ""), 586, Gx_line+76, 637, Gx_line+94, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Parametros do Artigo", ""), 325, Gx_line+22, 448, Gx_line+40, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(439, Gx_line+45, 439, Gx_line+183, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(107, Gx_line+45, 439, Gx_line+153, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(107, Gx_line+68, 439, Gx_line+68, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(107, Gx_line+98, 665, Gx_line+98, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(107, Gx_line+118, 665, Gx_line+118, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(270, Gx_line+118, 270, Gx_line+153, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(547, Gx_line+118, 547, Gx_line+183, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(439, Gx_line+45, 666, Gx_line+69, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(440, Gx_line+152, 666, Gx_line+152, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+185) ;
            }
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7210( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'FASQUI' Routine */
      returnInSub = false ;
      h7210( false, 34) ;
      getPrinter().GxDrawLine(6, Gx_line+4, 779, Gx_line+4, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV207RecAnc), "ZZ9")), 130, Gx_line+16, 153, Gx_line+34, 2+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV208Recgrm), "ZZZ9")), 278, Gx_line+16, 308, Gx_line+34, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "LARG. FINAL (cm)", ""), 13, Gx_line+16, 122, Gx_line+34, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "GR. FINAL(gr/m2)", ""), 166, Gx_line+16, 274, Gx_line+34, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV209Recabsfac), "ZZ9")), 551, Gx_line+16, 574, Gx_line+34, 2+256, 0, 0, 0) ;
      getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "AVANÇO(%)", ""), 319, Gx_line+16, 397, Gx_line+34, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 192, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV232Recava, "")), 406, Gx_line+16, 436, Gx_line+34, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV234RecAs, "")), 657, Gx_line+16, 680, Gx_line+34, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV235RecAi, "")), 733, Gx_line+16, 756, Gx_line+34, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "V.M. (mts/min)", ""), 458, Gx_line+16, 542, Gx_line+34, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "AS(%)", ""), 611, Gx_line+16, 654, Gx_line+34, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "AI(%)", ""), 690, Gx_line+16, 729, Gx_line+34, 0+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+34) ;
      AV200Nlin = (short)(GXutil.gxmlines( AV210RecObsq, (short)(80))) ;
      if ( AV200Nlin > 10 )
      {
         AV200Nlin = (short)(10) ;
      }
      AV201j = (short)(1) ;
      while ( AV90I <= AV200Nlin )
      {
         AV202Obs_l = GXutil.gxgetmli( AV210RecObsq, AV201j, (short)(80)) ;
         if ( GXutil.strcmp(AV202Obs_l, GXutil.space( (short)(80))) == 0 )
         {
            if (true) break;
         }
         if ( AV201j == 1 )
         {
            h7210( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV202Obs_l, "")), 196, Gx_line+0, 780, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "OBSERVAÇÕES:", ""), 61, Gx_line+0, 163, Gx_line+18, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
         }
         else
         {
            h7210( false, 17) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV202Obs_l, "")), 196, Gx_line+0, 780, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+17) ;
         }
         AV201j = (short)(AV201j+1) ;
      }
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'MASDATOS' Routine */
      returnInSub = false ;
      h7210( false, 325) ;
      getPrinter().GxDrawRect(61, Gx_line+10, 212, Gx_line+150, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(61, Gx_line+46, 212, Gx_line+46, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "RAMOLA:", ""), 102, Gx_line+21, 172, Gx_line+39, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(61, Gx_line+78, 212, Gx_line+78, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "% A.S. =", ""), 73, Gx_line+55, 133, Gx_line+73, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "% A.I. =", ""), 73, Gx_line+88, 127, Gx_line+106, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "VM =", ""), 73, Gx_line+115, 109, Gx_line+133, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(6, Gx_line+7, 779, Gx_line+7, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(61, Gx_line+113, 212, Gx_line+113, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawRect(235, Gx_line+10, 386, Gx_line+213, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(235, Gx_line+46, 386, Gx_line+46, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "TERMOFIXAR:", ""), 258, Gx_line+21, 364, Gx_line+39, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(235, Gx_line+78, 386, Gx_line+78, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(235, Gx_line+111, 386, Gx_line+111, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(235, Gx_line+144, 386, Gx_line+144, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "L. CRÚ =", ""), 245, Gx_line+51, 309, Gx_line+69, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "GR. CRÚ =", ""), 246, Gx_line+83, 324, Gx_line+101, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "L. F. =", ""), 247, Gx_line+119, 291, Gx_line+137, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "L. FINAL =", ""), 247, Gx_line+148, 321, Gx_line+166, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(235, Gx_line+176, 386, Gx_line+176, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "GR. FINAL =", ""), 247, Gx_line+184, 336, Gx_line+202, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "FASES", ""), 411, Gx_line+10, 463, Gx_line+28, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Tab_f[1-1], "")), 411, Gx_line+31, 470, Gx_line+48, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Tab_fd[1-1], "")), 476, Gx_line+31, 769, Gx_line+48, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Tab_f[2-1], "")), 411, Gx_line+51, 470, Gx_line+68, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Tab_fd[2-1], "")), 476, Gx_line+51, 769, Gx_line+68, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Tab_f[3-1], "")), 411, Gx_line+71, 470, Gx_line+88, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Tab_fd[3-1], "")), 476, Gx_line+71, 769, Gx_line+88, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Tab_f[4-1], "")), 411, Gx_line+91, 470, Gx_line+108, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Tab_fd[4-1], "")), 476, Gx_line+91, 769, Gx_line+108, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Tab_f[5-1], "")), 411, Gx_line+109, 470, Gx_line+126, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Tab_fd[5-1], "")), 476, Gx_line+109, 769, Gx_line+126, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Tab_f[6-1], "")), 411, Gx_line+129, 470, Gx_line+146, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Tab_fd[6-1], "")), 476, Gx_line+129, 769, Gx_line+146, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Tab_f[7-1], "")), 411, Gx_line+149, 470, Gx_line+166, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Tab_fd[7-1], "")), 476, Gx_line+149, 769, Gx_line+166, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Tab_f[8-1], "")), 411, Gx_line+168, 470, Gx_line+185, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Tab_fd[8-1], "")), 476, Gx_line+168, 769, Gx_line+185, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Tab_f[9-1], "")), 411, Gx_line+188, 470, Gx_line+205, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Tab_fd[9-1], "")), 476, Gx_line+188, 769, Gx_line+205, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Tab_f[10-1], "")), 411, Gx_line+207, 470, Gx_line+224, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Tab_fd[10-1], "")), 476, Gx_line+207, 769, Gx_line+224, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Tab_f[11-1], "")), 411, Gx_line+226, 470, Gx_line+243, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Tab_fd[11-1], "")), 476, Gx_line+226, 769, Gx_line+243, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Tab_f[12-1], "")), 411, Gx_line+246, 470, Gx_line+263, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Tab_fd[12-1], "")), 476, Gx_line+246, 769, Gx_line+263, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Tab_f[13-1], "")), 411, Gx_line+266, 470, Gx_line+283, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Tab_fd[13-1], "")), 476, Gx_line+266, 769, Gx_line+283, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Tab_f[14-1], "")), 411, Gx_line+284, 470, Gx_line+301, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Tab_fd[14-1], "")), 476, Gx_line+284, 769, Gx_line+301, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV203Tab_f[15-1], "")), 411, Gx_line+304, 470, Gx_line+321, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV204Tab_fd[15-1], "")), 476, Gx_line+304, 769, Gx_line+321, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawRect(407, Gx_line+10, 774, Gx_line+324, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(407, Gx_line+28, 773, Gx_line+28, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawRect(32, Gx_line+173, 215, Gx_line+202, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "S", ""), 81, Gx_line+179, 90, Gx_line+197, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "C", ""), 42, Gx_line+179, 52, Gx_line+197, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "P", ""), 119, Gx_line+179, 128, Gx_line+197, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "PF", ""), 153, Gx_line+179, 170, Gx_line+197, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fx", ""), 192, Gx_line+179, 207, Gx_line+197, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawLine(67, Gx_line+173, 67, Gx_line+202, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(104, Gx_line+173, 104, Gx_line+202, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(142, Gx_line+173, 142, Gx_line+202, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(179, Gx_line+173, 179, Gx_line+202, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV237C, "")), 43, Gx_line+203, 51, Gx_line+220, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV236S, "")), 81, Gx_line+203, 89, Gx_line+220, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV240P, "")), 119, Gx_line+203, 127, Gx_line+220, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV238Pf, "")), 157, Gx_line+203, 165, Gx_line+220, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV239Forcodext, "")), 192, Gx_line+203, 208, Gx_line+220, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawRect(32, Gx_line+201, 215, Gx_line+221, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(67, Gx_line+202, 67, Gx_line+221, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(104, Gx_line+202, 104, Gx_line+221, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(142, Gx_line+202, 142, Gx_line+221, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(179, Gx_line+202, 179, Gx_line+221, 1, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+325) ;
   }

   public void S126( ) throws ProcessInterruptedException
   {
      /* 'AGRUPADAS' Routine */
      returnInSub = false ;
      AV157Flag_Agr = (byte)(0) ;
      /* Using cursor P072111 */
      pr_default.execute(6, new Object[] {AV44EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV13BarCodReo), AV12BarCodPar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A130BarCodPar = P072111_A130BarCodPar[0] ;
         A132BarCodReo = P072111_A132BarCodReo[0] ;
         A129BarCod = P072111_A129BarCod[0] ;
         A396EmprCod = P072111_A396EmprCod[0] ;
         A6034Ac_Metros = P072111_A6034Ac_Metros[0] ;
         n6034Ac_Metros = P072111_n6034Ac_Metros[0] ;
         A6035Ac_Kilos = P072111_A6035Ac_Kilos[0] ;
         n6035Ac_Kilos = P072111_n6035Ac_Kilos[0] ;
         A6033Ac_BarPar = P072111_A6033Ac_BarPar[0] ;
         A6032Ac_BarReo = P072111_A6032Ac_BarReo[0] ;
         A6031Ac_Barcod = P072111_A6031Ac_Barcod[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A6031Ac_Barcod ;
         GXv_int3[0] = A6032Ac_BarReo ;
         GXv_char4[0] = A6033Ac_BarPar ;
         GXv_int5[0] = AV192CliCod_a ;
         GXv_char6[0] = AV159CliNom_a ;
         GXv_char7[0] = AV193BarSer_a ;
         GXv_char8[0] = AV160SerDsc_a ;
         GXv_int9[0] = AV206Barancaca1 ;
         GXv_char10[0] = AV229Barcolnom ;
         GXv_int11[0] = AV230Barcolnum ;
         new app.prac007(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_char7, GXv_char8, GXv_int9, GXv_char10, GXv_int11) ;
         rrac006_impl.this.A396EmprCod = GXv_char1[0] ;
         rrac006_impl.this.A6031Ac_Barcod = GXv_int2[0] ;
         rrac006_impl.this.A6032Ac_BarReo = GXv_int3[0] ;
         rrac006_impl.this.A6033Ac_BarPar = GXv_char4[0] ;
         rrac006_impl.this.AV192CliCod_a = GXv_int5[0] ;
         rrac006_impl.this.AV159CliNom_a = GXv_char6[0] ;
         rrac006_impl.this.AV193BarSer_a = GXv_char7[0] ;
         rrac006_impl.this.AV160SerDsc_a = GXv_char8[0] ;
         rrac006_impl.this.AV206Barancaca1 = GXv_int9[0] ;
         rrac006_impl.this.AV229Barcolnom = GXv_char10[0] ;
         rrac006_impl.this.AV230Barcolnum = GXv_int11[0] ;
         AV158Hdr_a = GXutil.str( A6031Ac_Barcod, 8, 0) + "-" + GXutil.str( A6032Ac_BarReo, 1, 0) + A6033Ac_BarPar ;
         if ( AV157Flag_Agr == 0 )
         {
            AV157Flag_Agr = (byte)(1) ;
            if ( AV47Flag == 0 )
            {
            }
            h7210( false, 56) ;
            getPrinter().GxDrawRect(7, Gx_line+0, 780, Gx_line+39, 1, 192, 192, 192, 1, 192, 192, 192, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV158Hdr_a, "")), 14, Gx_line+40, 95, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV193BarSer_a, "")), 291, Gx_line+40, 409, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV159CliNom_a, "")), 103, Gx_line+40, 286, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6035Ac_Kilos, "ZZZZZ9.99")), 621, Gx_line+40, 688, Gx_line+57, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83Lit39, "")), 14, Gx_line+20, 109, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85Lit40, "")), 103, Gx_line+20, 186, Gx_line+37, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86Lit41, "")), 291, Gx_line+20, 392, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV151Lit42, "")), 636, Gx_line+20, 686, Gx_line+37, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 8, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV150Lit43, "")), 14, Gx_line+4, 167, Gx_line+19, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6034Ac_Metros, "ZZZZZ9.99")), 692, Gx_line+40, 759, Gx_line+57, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV179Lit49, "")), 695, Gx_line+20, 759, Gx_line+37, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104Lit18, "")), 558, Gx_line+20, 613, Gx_line+37, 1+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV206Barancaca1), "ZZ9")), 574, Gx_line+40, 597, Gx_line+57, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV229Barcolnom, "")), 417, Gx_line+40, 513, Gx_line+57, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98Lit12, "")), 417, Gx_line+20, 486, Gx_line+37, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV230Barcolnum), "ZZZZZ9")), 519, Gx_line+40, 564, Gx_line+57, 2+256, 0, 0, 0) ;
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
            h7210( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV158Hdr_a, "")), 14, Gx_line+0, 95, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV159CliNom_a, "")), 103, Gx_line+0, 286, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV193BarSer_a, "")), 291, Gx_line+0, 409, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6035Ac_Kilos, "ZZZZZ9.99")), 621, Gx_line+0, 688, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A6034Ac_Metros, "ZZZZZ9.99")), 692, Gx_line+0, 759, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV206Barancaca1), "ZZ9")), 574, Gx_line+0, 597, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV229Barcolnom, "")), 417, Gx_line+0, 513, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV230Barcolnum), "ZZZZZ9")), 519, Gx_line+0, 564, Gx_line+17, 2+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'DESCMAQ' Routine */
      returnInSub = false ;
      AV140NTubos = (byte)(0) ;
      AV217MaqVolRes = 0 ;
      /* Using cursor P072112 */
      pr_default.execute(7, new Object[] {AV44EmprCod, AV15BarMaqCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A602MaqCod = P072112_A602MaqCod[0] ;
         A396EmprCod = P072112_A396EmprCod[0] ;
         A606MaqDsc = P072112_A606MaqDsc[0] ;
         n606MaqDsc = P072112_n606MaqDsc[0] ;
         A2391MaqMicro = P072112_A2391MaqMicro[0] ;
         n2391MaqMicro = P072112_n2391MaqMicro[0] ;
         A3598MaqNroTub = P072112_A3598MaqNroTub[0] ;
         n3598MaqNroTub = P072112_n3598MaqNroTub[0] ;
         A2801MaqVolRes = P072112_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P072112_n2801MaqVolRes[0] ;
         AV37DescMaq = A606MaqDsc ;
         AV133MaqMicro = A2391MaqMicro ;
         AV141NumCam = A2391MaqMicro ;
         AV140NTubos = A3598MaqNroTub ;
         AV217MaqVolRes = A2801MaqVolRes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'OBSFOR' Routine */
      returnInSub = false ;
      AV57FlagObs = (byte)(0) ;
      /* Using cursor P072113 */
      pr_default.execute(8, new Object[] {AV44EmprCod, Integer.valueOf(AV19CliCod), AV8ArtCod, AV110ForColNom, Integer.valueOf(AV111ForColNum), Byte.valueOf(AV25Colorante)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A831TipColCod = P072113_A831TipColCod[0] ;
         A483ForColNum = P072113_A483ForColNum[0] ;
         A482ForColNom = P072113_A482ForColNom[0] ;
         A494ForSer = P072113_A494ForSer[0] ;
         A252CliCod = P072113_A252CliCod[0] ;
         n252CliCod = P072113_n252CliCod[0] ;
         A396EmprCod = P072113_A396EmprCod[0] ;
         A649ObsForTxt = P072113_A649ObsForTxt[0] ;
         A650ObsLin = P072113_A650ObsLin[0] ;
         if ( AV57FlagObs == 0 )
         {
            AV57FlagObs = (byte)(1) ;
            h7210( false, 23) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A649ObsForTxt, "")), 122, Gx_line+6, 372, Gx_line+23, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82Lit38, "")), 7, Gx_line+6, 116, Gx_line+23, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(7, Gx_line+2, 780, Gx_line+2, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+23) ;
         }
         else
         {
            h7210( false, 17) ;
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
      AV164TipArtDsc = GXutil.space( (short)(30)) ;
      /* Using cursor P072114 */
      pr_default.execute(9, new Object[] {AV44EmprCod, Short.valueOf(AV167BarTipArt)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A829TipArtCod = P072114_A829TipArtCod[0] ;
         A396EmprCod = P072114_A396EmprCod[0] ;
         A830TipArtDsc = P072114_A830TipArtDsc[0] ;
         n830TipArtDsc = P072114_n830TipArtDsc[0] ;
         AV164TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'HISREO' Routine */
      returnInSub = false ;
      AV190DSCCAUSA = "" ;
      AV191Texto_r = "" ;
      /* Using cursor P072115 */
      pr_default.execute(10, new Object[] {AV44EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV13BarCodReo), AV12BarCodPar});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A833TipDefCod = P072115_A833TipDefCod[0] ;
         A5085CodCausa = P072115_A5085CodCausa[0] ;
         n5085CodCausa = P072115_n5085CodCausa[0] ;
         A544HisCodPar = P072115_A544HisCodPar[0] ;
         A545HisCodReo = P072115_A545HisCodReo[0] ;
         A539HisBarCod = P072115_A539HisBarCod[0] ;
         A396EmprCod = P072115_A396EmprCod[0] ;
         A5086DscCausa = P072115_A5086DscCausa[0] ;
         n5086DscCausa = P072115_n5086DscCausa[0] ;
         A834TipDefDsc = P072115_A834TipDefDsc[0] ;
         n834TipDefDsc = P072115_n834TipDefDsc[0] ;
         A834TipDefDsc = P072115_A834TipDefDsc[0] ;
         n834TipDefDsc = P072115_n834TipDefDsc[0] ;
         A5086DscCausa = P072115_A5086DscCausa[0] ;
         n5086DscCausa = P072115_n5086DscCausa[0] ;
         AV190DSCCAUSA = GXutil.substring( A5086DscCausa, 1, 30) ;
         AV191Texto_r = GXutil.substring( A834TipDefDsc, 1, 15) ;
         pr_default.readNext(10);
      }
      pr_default.close(10);
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'INICIAMOS' Routine */
      returnInSub = false ;
      AV168Imp_agrup = (byte)(0) ;
      GXt_int12 = AV189Sin_dec ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "SINDEC", ""), GXv_int3) ;
      rrac006_impl.this.GXt_int12 = GXv_int3[0] ;
      AV189Sin_dec = GXt_int12 ;
      GXt_int12 = AV199Carvema ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int3) ;
      rrac006_impl.this.GXt_int12 = GXv_int3[0] ;
      AV199Carvema = GXt_int12 ;
      GXv_int3[0] = AV53Flagidioma ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, "100001", GXv_int3) ;
      rrac006_impl.this.AV53Flagidioma = GXv_int3[0] ;
      AV123Var3 = " " ;
      if ( AV53Flagidioma == 1 )
      {
         AV123Var3 = httpContext.getMessage( "Processado por Computador", "") ;
      }
      GXv_int3[0] = AV47Flag ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, "030800", GXv_int3) ;
      rrac006_impl.this.AV47Flag = GXv_int3[0] ;
      GXv_int3[0] = AV54FlagImp ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, "100000", GXv_int3) ;
      rrac006_impl.this.AV54FlagImp = GXv_int3[0] ;
      GXv_int3[0] = AV48FlagBar ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, "100007", GXv_int3) ;
      rrac006_impl.this.AV48FlagBar = GXv_int3[0] ;
      GXv_int3[0] = AV50FlagCod ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, "100009", GXv_int3) ;
      rrac006_impl.this.AV50FlagCod = GXv_int3[0] ;
      GXv_int3[0] = AV56FlagNline ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "NOLINE", ""), GXv_int3) ;
      rrac006_impl.this.AV56FlagNline = GXv_int3[0] ;
      GXv_char10[0] = AV31ContDsc ;
      new app.pexidsc(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "RECPZA", ""), GXv_char10) ;
      rrac006_impl.this.AV31ContDsc = GXv_char10[0] ;
      GXt_int12 = AV211ideas ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "IDEAS", ""), GXv_int3) ;
      rrac006_impl.this.GXt_int12 = GXv_int3[0] ;
      AV211ideas = GXt_int12 ;
      GXv_int3[0] = AV212Carolina ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "CAROLI", ""), GXv_int3) ;
      rrac006_impl.this.AV212Carolina = GXv_int3[0] ;
      GXt_int12 = AV213Orient ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int3) ;
      rrac006_impl.this.GXt_int12 = GXv_int3[0] ;
      AV213Orient = GXt_int12 ;
      GXt_int12 = AV222Jpf ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "JPF", ""), GXv_int3) ;
      rrac006_impl.this.GXt_int12 = GXv_int3[0] ;
      AV222Jpf = GXt_int12 ;
      GXt_int12 = AV231Er ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "EROTAT", ""), GXv_int3) ;
      rrac006_impl.this.GXt_int12 = GXv_int3[0] ;
      AV231Er = GXt_int12 ;
      GXt_int12 = AV243piolera ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "PIOLER", ""), GXv_int3) ;
      rrac006_impl.this.GXt_int12 = GXv_int3[0] ;
      AV243piolera = GXt_int12 ;
      GXt_char13 = AV244FecPiolera ;
      GXv_char10[0] = AV44EmprCod ;
      GXv_char8[0] = httpContext.getMessage( "PIOLER", "") ;
      GXv_char7[0] = GXt_char13 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char10, GXv_char8, GXv_char7) ;
      rrac006_impl.this.AV44EmprCod = GXv_char10[0] ;
      rrac006_impl.this.GXt_char13 = GXv_char7[0] ;
      AV244FecPiolera = GXt_char13 ;
      GXt_int12 = AV246Cambiarcpp ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "CAMCPP", ""), GXv_int3) ;
      rrac006_impl.this.GXt_int12 = GXv_int3[0] ;
      AV246Cambiarcpp = GXt_int12 ;
      GXt_int12 = AV247todosproductos ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "ALLCP0", ""), GXv_int3) ;
      rrac006_impl.this.GXt_int12 = GXv_int3[0] ;
      AV247todosproductos = GXt_int12 ;
      GXt_int12 = AV250anahuac ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "ANAHUA", ""), GXv_int3) ;
      rrac006_impl.this.GXt_int12 = GXv_int3[0] ;
      AV250anahuac = GXt_int12 ;
      GXt_int12 = AV254Costelinea ;
      GXv_int3[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, httpContext.getMessage( "COSTLN", ""), GXv_int3) ;
      rrac006_impl.this.GXt_int12 = GXv_int3[0] ;
      AV254Costelinea = GXt_int12 ;
      GXt_char13 = AV94Lit0 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN046", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV94Lit0 = GXt_char13 ;
      GXt_char13 = AV73Lit3 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN674_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV73Lit3 = GXt_char13 ;
      GXt_char13 = AV84Lit4 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV84Lit4 = GXt_char13 ;
      GXt_char13 = AV126Lit5 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1211_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV126Lit5 = GXt_char13 ;
      GXt_char13 = AV127Lit6 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV127Lit6 = GXt_char13 ;
      GXt_char13 = AV128Lit7 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV128Lit7 = GXt_char13 ;
      GXt_char13 = AV129Lit8 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV129Lit8 = GXt_char13 ;
      GXt_char13 = AV130Lit9 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV130Lit9 = GXt_char13 ;
      GXt_char13 = AV96Lit10 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV96Lit10 = GXt_char13 ;
      GXt_char13 = AV97Lit11 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1127_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV97Lit11 = GXt_char13 ;
      GXt_char13 = AV98Lit12 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN387_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV98Lit12 = GXt_char13 ;
      GXt_char13 = AV99Lit13 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV99Lit13 = GXt_char13 ;
      GXt_char13 = AV100Lit14 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV100Lit14 = GXt_char13 ;
      GXt_char13 = AV101Lit15 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV101Lit15 = GXt_char13 ;
      GXt_char13 = AV102Lit16 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2205_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV102Lit16 = GXt_char13 ;
      GXt_char13 = AV103Lit17 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN416_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV103Lit17 = GXt_char13 ;
      GXt_char13 = AV104Lit18 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1022_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV104Lit18 = GXt_char13 ;
      GXt_char13 = AV105Lit19 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1217_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV105Lit19 = GXt_char13 ;
      GXt_char13 = AV107Lit20 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2396_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV107Lit20 = GXt_char13 ;
      GXt_char13 = AV64Lit21 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV64Lit21 = GXt_char13 ;
      GXt_char13 = AV65Lit22 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1439_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV65Lit22 = GXt_char13 ;
      GXt_char13 = AV66Lit23 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV66Lit23 = GXt_char13 ;
      GXt_char13 = AV67Lit24 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN440_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV67Lit24 = GXt_char13 ;
      GXt_char13 = AV68Lit25 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV68Lit25 = GXt_char13 ;
      GXt_char13 = AV69Lit26 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1663_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV69Lit26 = GXt_char13 ;
      GXt_char13 = AV70Lit27 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3003_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV70Lit27 = GXt_char13 ;
      GXt_char13 = AV71Lit28 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1373_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV71Lit28 = GXt_char13 ;
      GXt_char13 = AV72Lit29 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV004_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV72Lit29 = GXt_char13 ;
      GXt_char13 = AV74Lit30 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN378_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV74Lit30 = GXt_char13 ;
      GXt_char13 = AV75Lit31 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV75Lit31 = GXt_char13 ;
      GXt_char13 = AV76Lit32 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2470_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV76Lit32 = GXt_char13 ;
      GXt_char13 = AV77Lit33 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1544_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV77Lit33 = GXt_char13 ;
      AV78Lit34 = httpContext.getMessage( "N Lote", "") ;
      GXt_char13 = AV79Lit35 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV005_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV79Lit35 = GXt_char13 ;
      GXt_char13 = AV80Lit36 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV004_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV80Lit36 = GXt_char13 ;
      GXt_char13 = AV81Lit37 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT108_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV81Lit37 = GXt_char13 ;
      GXt_char13 = AV82Lit38 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1156_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV82Lit38 = GXt_char13 ;
      GXt_char13 = AV83Lit39 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV83Lit39 = GXt_char13 ;
      GXt_char13 = AV85Lit40 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN389_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV85Lit40 = GXt_char13 ;
      GXt_char13 = AV86Lit41 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV86Lit41 = GXt_char13 ;
      GXt_char13 = AV151Lit42 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV151Lit42 = GXt_char13 ;
      GXt_char13 = AV150Lit43 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3023_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV150Lit43 = GXt_char13 ;
      GXt_char13 = AV174Lit45 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT188_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV174Lit45 = GXt_char13 ;
      AV174Lit45 = GXutil.substring( AV174Lit45, 1, 7) ;
      GXt_char13 = AV175Lit46 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN209_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV175Lit46 = GXt_char13 ;
      GXt_char13 = AV176Lit47 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV176Lit47 = GXt_char13 ;
      GXt_char13 = AV178Lit48 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2028_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV178Lit48 = GXt_char13 ;
      GXt_char13 = AV179Lit49 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV179Lit49 = GXt_char13 ;
      AV181Lit50 = httpContext.getMessage( "Gr/m2", "") ;
      GXt_char13 = AV183Lit51 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2014_", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV183Lit51 = GXt_char13 ;
      GXt_char13 = AV184Lit52 ;
      GXv_char10[0] = GXt_char13 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN209", ""), (byte)(99), GXv_char10) ;
      rrac006_impl.this.GXt_char13 = GXv_char10[0] ;
      AV184Lit52 = GXt_char13 ;
      /* Using cursor P072116 */
      pr_default.execute(11, new Object[] {AV44EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV13BarCodReo), AV12BarCodPar});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A130BarCodPar = P072116_A130BarCodPar[0] ;
         A132BarCodReo = P072116_A132BarCodReo[0] ;
         A129BarCod = P072116_A129BarCod[0] ;
         A396EmprCod = P072116_A396EmprCod[0] ;
         A252CliCod = P072116_A252CliCod[0] ;
         n252CliCod = P072116_n252CliCod[0] ;
         A212BarSer = P072116_A212BarSer[0] ;
         A135BarColNom = P072116_A135BarColNom[0] ;
         A136BarColNum = P072116_A136BarColNum[0] ;
         A218BarTipCol = P072116_A218BarTipCol[0] ;
         A1652BarSerDsc = P072116_A1652BarSerDsc[0] ;
         A148BarEstReo = P072116_A148BarEstReo[0] ;
         AV162Cliente = A252CliCod ;
         AV161ForSer = A212BarSer ;
         AV110ForColNom = A135BarColNom ;
         AV111ForColNum = A136BarColNum ;
         AV117TipColCod = A218BarTipCol ;
         AV113Serie = A1652BarSerDsc ;
         AV191Texto_r = "" ;
         AV190DSCCAUSA = "" ;
         if ( ( A148BarEstReo == 1 ) && ( AV163FlagEnd == 1 ) )
         {
            /* Execute user subroutine: 'HISREO' */
            S171 ();
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
         AV196x = (short)(1) ;
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV195Tab_notas[GX_I-1] = " " ;
            GX_I = (int)(GX_I+1) ;
         }
         /* Using cursor P072117 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A187BarNotDsc = P072117_A187BarNotDsc[0] ;
            A188BarNotLin = P072117_A188BarNotLin[0] ;
            if ( AV196x > 100 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV195Tab_notas[AV196x-1] = A187BarNotDsc ;
            AV196x = (short)(AV196x+1) ;
            pr_default.readNext(12);
         }
         pr_default.close(12);
         AV196x = (short)(1) ;
         GX_I = 1 ;
         while ( GX_I <= 20 )
         {
            AV203Tab_f[GX_I-1] = " " ;
            GX_I = (int)(GX_I+1) ;
         }
         GX_I = 1 ;
         while ( GX_I <= 20 )
         {
            AV204Tab_fd[GX_I-1] = " " ;
            GX_I = (int)(GX_I+1) ;
         }
         AV223Varp1 = "" ;
         AV224Varp2 = "" ;
         AV225Varpar3 = "" ;
         AV226VarP4 = "" ;
         AV227VarP5 = "" ;
         AV228varP6 = "" ;
         /* Using cursor P072118 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(13) != 101) )
         {
            A194BarOrdLin = P072118_A194BarOrdLin[0] ;
            A758ProCod = P072118_A758ProCod[0] ;
            A153BarFasEst = P072118_A153BarFasEst[0] ;
            A457FasCod = P072118_A457FasCod[0] ;
            A460FasDsc = P072118_A460FasDsc[0] ;
            A460FasDsc = P072118_A460FasDsc[0] ;
            if ( AV196x > 20 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV205Texto_f = "" ;
            if ( A153BarFasEst == 1 )
            {
               AV205Texto_f = httpContext.getMessage( "Em Processo", "") ;
            }
            if ( A153BarFasEst == 2 )
            {
               AV205Texto_f = httpContext.getMessage( "Finalizada", "") ;
            }
            AV203Tab_f[AV196x-1] = A457FasCod ;
            AV204Tab_fd[AV196x-1] = A460FasDsc + " " + AV205Texto_f ;
            AV196x = (short)(AV196x+1) ;
            if ( AV222Jpf == 1 )
            {
               /* Using cursor P072119 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               while ( (pr_default.getStatus(14) != 101) )
               {
                  A9737BarValPar = P072119_A9737BarValPar[0] ;
                  A3295BarParVal = P072119_A3295BarParVal[0] ;
                  A12671BarParVl2 = P072119_A12671BarParVl2[0] ;
                  A1664ParFasCod = P072119_A1664ParFasCod[0] ;
                  if ( A1664ParFasCod == 50 )
                  {
                     AV223Varp1 = (!(GXutil.strcmp("", A12671BarParVl2)==0) ? GXutil.trim( A12671BarParVl2) : (!(GXutil.strcmp("", A3295BarParVal)==0) ? GXutil.trim( A3295BarParVal) : GXutil.trim( A9737BarValPar))) ;
                  }
                  if ( A1664ParFasCod == 4 )
                  {
                     AV224Varp2 = (!(GXutil.strcmp("", A12671BarParVl2)==0) ? GXutil.trim( A12671BarParVl2) : (!(GXutil.strcmp("", A3295BarParVal)==0) ? GXutil.trim( A3295BarParVal) : GXutil.trim( A9737BarValPar))) ;
                  }
                  if ( A1664ParFasCod == 40 )
                  {
                     AV225Varpar3 = (!(GXutil.strcmp("", A12671BarParVl2)==0) ? GXutil.trim( A12671BarParVl2) : (!(GXutil.strcmp("", A3295BarParVal)==0) ? GXutil.trim( A3295BarParVal) : GXutil.trim( A9737BarValPar))) ;
                  }
                  if ( A1664ParFasCod == 100 )
                  {
                     AV226VarP4 = (!(GXutil.strcmp("", A12671BarParVl2)==0) ? GXutil.trim( A12671BarParVl2) : (!(GXutil.strcmp("", A3295BarParVal)==0) ? GXutil.trim( A3295BarParVal) : GXutil.trim( A9737BarValPar))) ;
                  }
                  if ( A1664ParFasCod == 101 )
                  {
                     AV227VarP5 = (!(GXutil.strcmp("", A12671BarParVl2)==0) ? GXutil.trim( A12671BarParVl2) : (!(GXutil.strcmp("", A3295BarParVal)==0) ? GXutil.trim( A3295BarParVal) : GXutil.trim( A9737BarValPar))) ;
                  }
                  if ( ( A1664ParFasCod == 200 ) || ( A1664ParFasCod == 201 ) )
                  {
                     AV228varP6 = (!(GXutil.strcmp("", A12671BarParVl2)==0) ? GXutil.trim( A12671BarParVl2) : (!(GXutil.strcmp("", A3295BarParVal)==0) ? GXutil.trim( A3295BarParVal) : GXutil.trim( A9737BarValPar))) ;
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
      /* Using cursor P072120 */
      pr_default.execute(15, new Object[] {AV44EmprCod, Integer.valueOf(AV162Cliente), AV161ForSer, AV110ForColNom, Integer.valueOf(AV111ForColNum), Byte.valueOf(AV117TipColCod)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A583IntCod = P072120_A583IntCod[0] ;
         A831TipColCod = P072120_A831TipColCod[0] ;
         A483ForColNum = P072120_A483ForColNum[0] ;
         A482ForColNom = P072120_A482ForColNom[0] ;
         A494ForSer = P072120_A494ForSer[0] ;
         A252CliCod = P072120_A252CliCod[0] ;
         n252CliCod = P072120_n252CliCod[0] ;
         A396EmprCod = P072120_A396EmprCod[0] ;
         A584IntDsc = P072120_A584IntDsc[0] ;
         n584IntDsc = P072120_n584IntDsc[0] ;
         A627MatDsc = P072120_A627MatDsc[0] ;
         n627MatDsc = P072120_n627MatDsc[0] ;
         A626MatCod = P072120_A626MatCod[0] ;
         A832TipColDsc = P072120_A832TipColDsc[0] ;
         n832TipColDsc = P072120_n832TipColDsc[0] ;
         A1191ForNomCli = P072120_A1191ForNomCli[0] ;
         n1191ForNomCli = P072120_n1191ForNomCli[0] ;
         A1192ForNumCli = P072120_A1192ForNumCli[0] ;
         n1192ForNumCli = P072120_n1192ForNumCli[0] ;
         A995ForTonal = P072120_A995ForTonal[0] ;
         n995ForTonal = P072120_n995ForTonal[0] ;
         A3317DscSol = P072120_A3317DscSol[0] ;
         n3317DscSol = P072120_n3317DscSol[0] ;
         A3316CodSol = P072120_A3316CodSol[0] ;
         n3316CodSol = P072120_n3316CodSol[0] ;
         A584IntDsc = P072120_A584IntDsc[0] ;
         n584IntDsc = P072120_n584IntDsc[0] ;
         A832TipColDsc = P072120_A832TipColDsc[0] ;
         n832TipColDsc = P072120_n832TipColDsc[0] ;
         A627MatDsc = P072120_A627MatDsc[0] ;
         n627MatDsc = P072120_n627MatDsc[0] ;
         A3317DscSol = P072120_A3317DscSol[0] ;
         n3317DscSol = P072120_n3317DscSol[0] ;
         AV92Intens = A584IntDsc ;
         AV135Matiz = A627MatDsc ;
         AV134MatCod = A626MatCod ;
         AV117TipColCod = A831TipColCod ;
         AV116TipCol = A832TipColDsc ;
         AV118Tonalidad = A1191ForNomCli ;
         AV142NumCli = A1192ForNumCli ;
         AV182ForTonal = A995ForTonal ;
         AV172DscSol = A3317DscSol ;
         AV173CodSol = A3316CodSol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
      /* Using cursor P072121 */
      pr_default.execute(16, new Object[] {AV44EmprCod});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A396EmprCod = P072121_A396EmprCod[0] ;
         A407EmprNom = P072121_A407EmprNom[0] ;
         n407EmprNom = P072121_n407EmprNom[0] ;
         AV139NomEmp = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
      AV114Termin = context.getWorkstationId( remoteHandle) ;
      /* Using cursor P072122 */
      pr_default.execute(17, new Object[] {AV114Termin});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A942TermCod = P072122_A942TermCod[0] ;
         A1189TermUsu = P072122_A1189TermUsu[0] ;
         n1189TermUsu = P072122_n1189TermUsu[0] ;
         AV61TermUsu = A1189TermUsu ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(17);
   }

   public void h7210( boolean bFoot ,
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
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV123Var3, "")), 656, Gx_line+2, 780, Gx_line+15, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31ContDsc, "")), 7, Gx_line+2, 91, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Terminal", ""), 133, Gx_line+0, 186, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TermUsu, "@!")), 194, Gx_line+0, 253, Gx_line+17, 0+256, 0, 0, 0) ;
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
               if ( AV243piolera == 1 )
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
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV244FecPiolera, "")), 670, Gx_line+75, 734, Gx_line+93, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+114) ;
               }
               if ( ! (0==AV48FlagBar) )
               {
                  getPrinter().GxAttris("3 of 9 Barcode", 24, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89HojRut, "")), 213, Gx_line+5, 452, Gx_line+31, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV191Texto_r, "")), 574, Gx_line+1, 684, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV190DSCCAUSA, "")), 574, Gx_line+25, 731, Gx_line+42, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+43) ;
               }
               if ( AV243piolera == 1 )
               {
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4402RecUsrCod, "")), 421, Gx_line+11, 480, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4866RecFecAlt, "99/99/99 99:99"), 513, Gx_line+11, 616, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+7, 780, Gx_line+61, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Lit3, "")), 358, Gx_line+11, 416, Gx_line+28, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(338, Gx_line+7, 647, Gx_line+56, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV128Lit7, "")), 658, Gx_line+43, 728, Gx_line+60, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 734, Gx_line+43, 779, Gx_line+60, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV184Lit52, "")), 358, Gx_line+34, 416, Gx_line+50, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4868RecUsrMod, "@!")), 422, Gx_line+34, 481, Gx_line+51, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4867RecFecMod, "99/99/99 99:99"), 513, Gx_line+34, 616, Gx_line+51, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "LOTE:", ""), 30, Gx_line+24, 80, Gx_line+44, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), 88, Gx_line+25, 297, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV249NumBanyo), "ZZZ9")), 672, Gx_line+17, 702, Gx_line+34, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("/", 711, Gx_line+17, 716, Gx_line+35, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV248TotBanyos), "ZZZ9")), 726, Gx_line+17, 756, Gx_line+34, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+80) ;
               }
               if ( A5109RecNumInt > 0 )
               {
                  AV169Num_int = "(" + GXutil.trim( GXutil.str( A5109RecNumInt, 8, 0)) + ")" ;
               }
               else
               {
                  AV169Num_int = GXutil.space( (short)(10)) ;
               }
               AV170LinMaq = "(" + GXutil.trim( GXutil.str( A2804RecLinMaq, 4, 0)) + ")" ;
               if ( AV243piolera == 0 )
               {
                  getPrinter().GxAttris("Times New Roman", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV139NomEmp, "")), 16, Gx_line+5, 205, Gx_line+24, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4402RecUsrCod, "")), 414, Gx_line+5, 473, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4866RecFecAlt, "99/99/99 99:99"), 505, Gx_line+5, 608, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62Remonta, "")), 204, Gx_line+36, 283, Gx_line+53, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(7, Gx_line+1, 780, Gx_line+55, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94Lit0, "")), 16, Gx_line+35, 111, Gx_line+54, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73Lit3, "")), 351, Gx_line+5, 409, Gx_line+22, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(338, Gx_line+1, 631, Gx_line+50, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV128Lit7, "")), 651, Gx_line+36, 721, Gx_line+53, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 727, Gx_line+36, 772, Gx_line+53, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV184Lit52, "")), 351, Gx_line+28, 409, Gx_line+44, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4868RecUsrMod, "@!")), 415, Gx_line+28, 474, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(localUtil.format( A4867RecFecMod, "99/99/99 99:99"), 505, Gx_line+28, 608, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV249NumBanyo), "ZZZ9")), 698, Gx_line+5, 728, Gx_line+22, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText("/", 732, Gx_line+5, 737, Gx_line+23, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV248TotBanyos), "ZZZ9")), 742, Gx_line+5, 772, Gx_line+22, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "N Baños", ""), 646, Gx_line+5, 695, Gx_line+23, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+57) ;
               }
               AV166BarSer_10 = GXutil.substring( A212BarSer, 1, 10) ;
               if ( A224BarTraP1 > 0 )
               {
                  AV165VCompo = GXutil.trim( A221BarTra1) + " " + GXutil.trim( GXutil.str( A224BarTraP1, 3, 0)) + "%" ;
                  if ( A225BarTraP2 > 0 )
                  {
                     AV165VCompo += GXutil.trim( A222BarTra2) + " " + GXutil.trim( GXutil.str( A225BarTraP2, 3, 0)) + "%" ;
                  }
                  if ( A226BarTraP3 > 0 )
                  {
                     AV165VCompo += GXutil.trim( A223BarTra3) + " " + GXutil.trim( GXutil.str( A226BarTraP3, 3, 0)) + "%" ;
                  }
               }
               AV167BarTipArt = A217BarTipArt ;
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
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38DesCol, "")), 384, Gx_line+105, 509, Gx_line+122, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118Tonalidad, "")), 95, Gx_line+126, 191, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV142NumCli), "ZZZZZ9")), 264, Gx_line+126, 309, Gx_line+143, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 14, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Hdr, "")), 656, Gx_line+11, 757, Gx_line+35, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(7, Gx_line+5, 514, Gx_line+97, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(7, Gx_line+101, 514, Gx_line+167, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV129Lit8, "")), 21, Gx_line+10, 71, Gx_line+26, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV130Lit9, "")), 527, Gx_line+15, 652, Gx_line+32, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96Lit10, "")), 21, Gx_line+29, 71, Gx_line+45, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97Lit11, "")), 21, Gx_line+69, 71, Gx_line+85, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV98Lit12, "")), 23, Gx_line+105, 90, Gx_line+121, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99Lit13, "")), 209, Gx_line+105, 260, Gx_line+121, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100Lit14, "")), 23, Gx_line+126, 90, Gx_line+142, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101Lit15, "")), 209, Gx_line+126, 260, Gx_line+142, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 366, Gx_line+105, 382, Gx_line+122, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV165VCompo, "")), 89, Gx_line+69, 339, Gx_line+86, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV164TipArtDsc, "")), 89, Gx_line+49, 339, Gx_line+66, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Lit26, "")), 526, Gx_line+74, 591, Gx_line+90, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15BarMaqCod, "")), 596, Gx_line+94, 659, Gx_line+113, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37DescMaq, "")), 596, Gx_line+73, 763, Gx_line+92, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Lit29, "")), 526, Gx_line+118, 591, Gx_line+134, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5110RecNumPrg, "")), 596, Gx_line+118, 678, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71Lit28, "")), 526, Gx_line+145, 591, Gx_line+161, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A2806RecFA, "ZZ9.99")), 596, Gx_line+145, 646, Gx_line+162, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70Lit27, "")), 690, Gx_line+118, 748, Gx_line+134, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV133MaqMicro), "Z9")), 755, Gx_line+118, 772, Gx_line+135, 2, 0, 0, 0) ;
               getPrinter().GxDrawRect(520, Gx_line+69, 779, Gx_line+167, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV170LinMaq, "")), 527, Gx_line+35, 572, Gx_line+52, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV169Num_int, "")), 656, Gx_line+34, 739, Gx_line+51, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A143BarDisNum, "")), 441, Gx_line+33, 508, Gx_line+50, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV175Lit46, "")), 441, Gx_line+15, 508, Gx_line+32, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9")), 440, Gx_line+76, 470, Gx_line+93, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV176Lit47, "")), 440, Gx_line+58, 508, Gx_line+75, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9")), 379, Gx_line+76, 402, Gx_line+93, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV178Lit48, "")), 379, Gx_line+58, 437, Gx_line+75, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A126BarAncAca2), "ZZ9")), 416, Gx_line+76, 439, Gx_line+93, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(375, Gx_line+49, 375, Gx_line+96, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(375, Gx_line+49, 433, Gx_line+49, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(432, Gx_line+5, 432, Gx_line+50, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102Lit16, "")), 322, Gx_line+126, 372, Gx_line+142, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39DesInt, "")), 393, Gx_line+126, 503, Gx_line+143, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), 227, Gx_line+29, 418, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV183Lit51, "")), 23, Gx_line+146, 87, Gx_line+163, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV182ForTonal, "")), 95, Gx_line+146, 242, Gx_line+163, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3137BarGraAca2), "ZZZ9")), 478, Gx_line+76, 508, Gx_line+93, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+170) ;
               if ( AV211ideas == 1 )
               {
                  getPrinter().GxDrawRect(7, Gx_line+5, 821, Gx_line+32, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Combinacion", ""), 23, Gx_line+10, 98, Gx_line+28, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9789BarItem5, "")), 119, Gx_line+10, 266, Gx_line+27, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+36) ;
               }
               if ( AV212Carolina == 1 )
               {
                  getPrinter().GxDrawRect(13, Gx_line+0, 827, Gx_line+27, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Orden Producción:", ""), 36, Gx_line+4, 145, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9775BarItem1, "")), 160, Gx_line+4, 307, Gx_line+21, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Metros Iniciales:", ""), 348, Gx_line+4, 446, Gx_line+22, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4461BarLotMts, "ZZZZZ9.99")), 463, Gx_line+4, 530, Gx_line+21, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+29) ;
               }
               AV194Obs_ok = (byte)(0) ;
               AV196x = (short)(1) ;
               while ( AV196x <= 100 )
               {
                  if ( AV194Obs_ok == 0 )
                  {
                     AV194Obs_ok = (byte)(1) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Observações", ""), 34, Gx_line+1, 107, Gx_line+19, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(6, Gx_line+1, 779, Gx_line+1, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(6, Gx_line+1, 6, Gx_line+18, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(778, Gx_line+1, 778, Gx_line+18, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  AV197barNotDsc = AV195Tab_notas[AV196x-1] ;
                  if ( ! (GXutil.strcmp("", AV197barNotDsc)==0) )
                  {
                     getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV197barNotDsc, "")), 171, Gx_line+1, 578, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawLine(6, Gx_line+0, 6, Gx_line+21, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(778, Gx_line+0, 778, Gx_line+21, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+21) ;
                  }
                  AV196x = (short)(AV196x+1) ;
               }
               if ( AV194Obs_ok == 1 )
               {
                  getPrinter().GxDrawLine(6, Gx_line+4, 779, Gx_line+4, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(6, Gx_line+0, 6, Gx_line+5, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(778, Gx_line+0, 778, Gx_line+5, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+8) ;
               }
               if ( AV168Imp_agrup == 0 )
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
                  AV168Imp_agrup = (byte)(1) ;
               }
               AV218Lit500 = httpContext.getMessage( "Lts Propuestos", "") ;
               AV219LtsIni = (int)(AV156Volumen+AV216RecLtssr) ;
               if ( GXutil.strcmp(A9812RecHdrLts, " ") != 0 )
               {
                  AV221Hdrl = GXutil.substring( A9812RecHdrLts, 1, 8) + "-" + GXutil.substring( A9812RecHdrLts, 9, 1) + GXutil.substring( A9812RecHdrLts, 10, 1) ;
                  AV220Texto_h = httpContext.getMessage( "Hdr Ultimo Baño ", "") + AV221Hdrl + httpContext.getMessage( " F Abs %", "") + GXutil.str( A9811RecAbs2, 6, 2) ;
               }
               else
               {
                  AV220Texto_h = " " ;
               }
               if ( AV199Carvema == 0 )
               {
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Litros", ""), 208, Gx_line+47, 272, Gx_line+66, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV156Volumen), "ZZZZ9")), 147, Gx_line+47, 200, Gx_line+67, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4316RecMaqKgs, "ZZZZZZ9.99")), 420, Gx_line+6, 504, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4317RecMaqMts, "ZZZZZZ9.99")), 629, Gx_line+6, 713, Gx_line+27, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(6, Gx_line+1, 779, Gx_line+99, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit22, "")), 19, Gx_line+47, 92, Gx_line+66, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit23, "")), 344, Gx_line+7, 407, Gx_line+26, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit25, "")), 569, Gx_line+8, 619, Gx_line+25, 2, 0, 0, 0) ;
                  getPrinter().GxDrawRect(6, Gx_line+1, 779, Gx_line+73, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 444, Gx_line+77, 459, Gx_line+94, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(433, Gx_line+72, 433, Gx_line+98, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(468, Gx_line+72, 468, Gx_line+98, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(585, Gx_line+72, 585, Gx_line+98, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(147, Gx_line+72, 147, Gx_line+98, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Lit30, "")), 33, Gx_line+77, 83, Gx_line+94, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Lit31, "")), 180, Gx_line+77, 397, Gx_line+94, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77Lit33, "")), 479, Gx_line+77, 562, Gx_line+94, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Lit34, "")), 631, Gx_line+77, 731, Gx_line+94, 1, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV216RecLtssr), "ZZZZ9")), 147, Gx_line+26, 200, Gx_line+46, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Lts Recuperados", ""), 19, Gx_line+25, 139, Gx_line+45, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(330, Gx_line+2, 330, Gx_line+74, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV218Lit500, "")), 19, Gx_line+3, 129, Gx_line+24, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV219LtsIni), "ZZZZ9")), 147, Gx_line+4, 200, Gx_line+24, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV220Texto_h, "")), 338, Gx_line+47, 756, Gx_line+67, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+100) ;
               }
               else
               {
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Lts", ""), 206, Gx_line+6, 238, Gx_line+25, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV156Volumen), "ZZZZ9")), 147, Gx_line+6, 200, Gx_line+26, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4316RecMaqKgs, "ZZZZZZ9.99")), 418, Gx_line+5, 502, Gx_line+26, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A4317RecMaqMts, "ZZZZZZ9.99")), 627, Gx_line+5, 711, Gx_line+26, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawRect(5, Gx_line+0, 779, Gx_line+58, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65Lit22, "")), 19, Gx_line+6, 92, Gx_line+25, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66Lit23, "")), 342, Gx_line+6, 405, Gx_line+25, 2, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV68Lit25, "")), 567, Gx_line+7, 617, Gx_line+24, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 442, Gx_line+36, 457, Gx_line+53, 1+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(433, Gx_line+29, 433, Gx_line+55, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(468, Gx_line+29, 468, Gx_line+55, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(585, Gx_line+29, 585, Gx_line+55, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(147, Gx_line+29, 147, Gx_line+57, 1, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74Lit30, "")), 31, Gx_line+36, 81, Gx_line+53, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75Lit31, "")), 178, Gx_line+36, 395, Gx_line+53, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77Lit33, "")), 477, Gx_line+36, 560, Gx_line+53, 1, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78Lit34, "")), 629, Gx_line+36, 729, Gx_line+53, 1, 0, 0, 0) ;
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

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
      add_metrics3( ) ;
      add_metrics4( ) ;
      add_metrics5( ) ;
      add_metrics6( ) ;
      add_metrics7( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Times New Roman", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Times New Roman", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics4( )
   {
      getPrinter().setMetrics("Calibri", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics5( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics6( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics7( )
   {
      getPrinter().setMetrics("3 of 9 Barcode", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
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
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV44EmprCod = "" ;
      AV12BarCodPar = "" ;
      AV15BarMaqCod = "" ;
      AV17BarSua = "" ;
      AV91ImpCod = "" ;
      scmdbuf = "" ;
      P07212_A6039RecAcab = new String[] {""} ;
      P07212_n6039RecAcab = new boolean[] {false} ;
      P07212_A602MaqCod = new String[] {""} ;
      P07212_A130BarCodPar = new String[] {""} ;
      P07212_A132BarCodReo = new byte[1] ;
      P07212_A129BarCod = new int[1] ;
      P07212_A396EmprCod = new String[] {""} ;
      P07212_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      A602MaqCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      AV35Coste = DecimalUtil.ZERO ;
      AV36Coste2 = DecimalUtil.ZERO ;
      AV38DesCol = "" ;
      AV116TipCol = "" ;
      AV39DesInt = "" ;
      AV92Intens = "" ;
      P07216_A3915EmpNumDec = new byte[1] ;
      P07216_n3915EmpNumDec = new boolean[] {false} ;
      P07216_A130BarCodPar = new String[] {""} ;
      P07216_A132BarCodReo = new byte[1] ;
      P07216_A396EmprCod = new String[] {""} ;
      P07216_A129BarCod = new int[1] ;
      P07216_A2804RecLinMaq = new short[1] ;
      P07216_A4018BarBot = new String[] {""} ;
      P07216_A6434BarAsi = new byte[1] ;
      P07216_A4833BarAudTur = new byte[1] ;
      P07216_n4833BarAudTur = new boolean[] {false} ;
      P07216_A4937BarCtrPdas = new byte[1] ;
      P07216_n4937BarCtrPdas = new boolean[] {false} ;
      P07216_A4467BarAcaMar = new String[] {""} ;
      P07216_A5115RecAbsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07216_A9998RecAnc = new short[1] ;
      P07216_n9998RecAnc = new boolean[] {false} ;
      P07216_A9996RecObsq = new String[] {""} ;
      P07216_n9996RecObsq = new boolean[] {false} ;
      P07216_A9997Recgrm = new short[1] ;
      P07216_n9997Recgrm = new boolean[] {false} ;
      P07216_A9764RecLtsSR = new int[1] ;
      P07216_n9764RecLtsSR = new boolean[] {false} ;
      P07216_A11507RecAva = new String[] {""} ;
      P07216_n11507RecAva = new boolean[] {false} ;
      P07216_A12128RecAs = new String[] {""} ;
      P07216_n12128RecAs = new boolean[] {false} ;
      P07216_A12129RecAi = new String[] {""} ;
      P07216_n12129RecAi = new boolean[] {false} ;
      P07216_A148BarEstReo = new byte[1] ;
      P07216_A3006BarCoef = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07216_n3006BarCoef = new boolean[] {false} ;
      P07216_A1226BarGraCru = new short[1] ;
      P07216_A4268RecOrdLin = new short[1] ;
      P07216_n4268RecOrdLin = new boolean[] {false} ;
      P07216_A4812BarEncCli = new String[] {""} ;
      P07216_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P07216_n4867RecFecMod = new boolean[] {false} ;
      P07216_A4868RecUsrMod = new String[] {""} ;
      P07216_n4868RecUsrMod = new boolean[] {false} ;
      P07216_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P07216_n4866RecFecAlt = new boolean[] {false} ;
      P07216_A4402RecUsrCod = new String[] {""} ;
      P07216_A5109RecNumInt = new int[1] ;
      P07216_A212BarSer = new String[] {""} ;
      P07216_A224BarTraP1 = new short[1] ;
      P07216_A221BarTra1 = new String[] {""} ;
      P07216_A225BarTraP2 = new short[1] ;
      P07216_A222BarTra2 = new String[] {""} ;
      P07216_A226BarTraP3 = new short[1] ;
      P07216_A223BarTra3 = new String[] {""} ;
      P07216_A217BarTipArt = new short[1] ;
      P07216_n217BarTipArt = new boolean[] {false} ;
      P07216_A3137BarGraAca2 = new short[1] ;
      P07216_A1652BarSerDsc = new String[] {""} ;
      P07216_A126BarAncAca2 = new short[1] ;
      P07216_A125BarAncAca1 = new short[1] ;
      P07216_A1909BarGraAca = new short[1] ;
      P07216_A143BarDisNum = new String[] {""} ;
      P07216_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07216_A5110RecNumPrg = new String[] {""} ;
      P07216_A218BarTipCol = new byte[1] ;
      P07216_A136BarColNum = new int[1] ;
      P07216_A135BarColNom = new String[] {""} ;
      P07216_A279CliNom = new String[] {""} ;
      P07216_A252CliCod = new int[1] ;
      P07216_n252CliCod = new boolean[] {false} ;
      P07216_A9789BarItem5 = new String[] {""} ;
      P07216_A4461BarLotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07216_A9775BarItem1 = new String[] {""} ;
      P07216_A9812RecHdrLts = new String[] {""} ;
      P07216_n9812RecHdrLts = new boolean[] {false} ;
      P07216_A9811RecAbs2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07216_n9811RecAbs2 = new boolean[] {false} ;
      P07216_A4271RecFagKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07216_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07216_A4272RecFagMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07216_A4260RecTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07216_n4260RecTotMts = new boolean[] {false} ;
      P07216_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07216_n184BarMtr = new boolean[] {false} ;
      P07216_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07216_n870BarTotMtr = new boolean[] {false} ;
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
      A9789BarItem5 = "" ;
      A4461BarLotMts = DecimalUtil.ZERO ;
      A9775BarItem1 = "" ;
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
      AV236S = "" ;
      AV237C = "" ;
      AV240P = "" ;
      AV238Pf = "" ;
      AV239Forcodext = "" ;
      AV8ArtCod = "" ;
      AV110ForColNom = "" ;
      AV210RecObsq = "" ;
      AV232Recava = "" ;
      AV234RecAs = "" ;
      AV235RecAi = "" ;
      AV62Remonta = "" ;
      AV125Lit44 = "" ;
      AV93Largura = DecimalUtil.ZERO ;
      AV115TiempoV = DecimalUtil.ZERO ;
      AV87GrMlin = DecimalUtil.ZERO ;
      AV27CompTP = DecimalUtil.ZERO ;
      AV58Procesos = new String[6] ;
      GX_I = 1 ;
      while ( GX_I <= 6 )
      {
         AV58Procesos[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV59Tiempos = new short[6] ;
      P07217_A396EmprCod = new String[] {""} ;
      P07217_A129BarCod = new int[1] ;
      P07217_A132BarCodReo = new byte[1] ;
      P07217_A130BarCodPar = new String[] {""} ;
      P07217_A2804RecLinMaq = new short[1] ;
      P07217_A764ProForCod = new String[] {""} ;
      P07217_A771ProForTie = new short[1] ;
      P07217_A1273RecLinPro = new byte[1] ;
      A764ProForCod = "" ;
      AV180RecObs = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV180RecObs[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P07218_A396EmprCod = new String[] {""} ;
      P07218_A129BarCod = new int[1] ;
      P07218_A132BarCodReo = new byte[1] ;
      P07218_A130BarCodPar = new String[] {""} ;
      P07218_A2804RecLinMaq = new short[1] ;
      P07218_A5258RecTxtObs = new String[] {""} ;
      P07218_n5258RecTxtObs = new boolean[] {false} ;
      P07218_A5257RecLinObs = new short[1] ;
      A5258RecTxtObs = "" ;
      AV89HojRut = "" ;
      AV63Hdr = "" ;
      AV26CompCamar = DecimalUtil.ZERO ;
      P07219_A4587ProRecObs = new String[] {""} ;
      P07219_A396EmprCod = new String[] {""} ;
      P07219_A129BarCod = new int[1] ;
      P07219_A132BarCodReo = new byte[1] ;
      P07219_A130BarCodPar = new String[] {""} ;
      P07219_A1273RecLinPro = new byte[1] ;
      P07219_A2804RecLinMaq = new short[1] ;
      P07219_A772ProForTmx = new short[1] ;
      P07219_A2393ProNumRec = new int[1] ;
      P07219_A2392ProNumPro = new int[1] ;
      P07219_A766ProForDsc = new String[] {""} ;
      P07219_A771ProForTie = new short[1] ;
      P07219_A764ProForCod = new String[] {""} ;
      A4587ProRecObs = "" ;
      A766ProForDsc = "" ;
      AV79Lit35 = "" ;
      AV81Lit37 = "" ;
      AV80Lit36 = "" ;
      P072110_A719PrdNum = new String[] {""} ;
      P072110_n719PrdNum = new boolean[] {false} ;
      P072110_A396EmprCod = new String[] {""} ;
      P072110_A129BarCod = new int[1] ;
      P072110_A132BarCodReo = new byte[1] ;
      P072110_A130BarCodPar = new String[] {""} ;
      P072110_A2804RecLinMaq = new short[1] ;
      P072110_A1273RecLinPro = new byte[1] ;
      P072110_A488ForPrdDsc = new String[] {""} ;
      P072110_n488ForPrdDsc = new boolean[] {false} ;
      P072110_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P072110_A2394RecForNro = new byte[1] ;
      P072110_A1643PrdTip = new String[] {""} ;
      P072110_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P072110_A4693PrdNum2 = new String[] {""} ;
      P072110_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P072110_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P072110_A872RecPrdNum = new String[] {""} ;
      P072110_A875RecPrdDsc = new String[] {""} ;
      P072110_A12641RecPrdDc2 = new String[] {""} ;
      P072110_A490ForPrdUMe = new byte[1] ;
      P072110_n490ForPrdUMe = new boolean[] {false} ;
      P072110_A743PrdUniCon = new byte[1] ;
      P072110_A5725RecLote = new String[] {""} ;
      P072110_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P072110_A811RecLin = new short[1] ;
      A719PrdNum = "" ;
      A488ForPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A1643PrdTip = "" ;
      A5416PrdDensS = DecimalUtil.ZERO ;
      A4693PrdNum2 = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A12641RecPrdDc2 = "" ;
      A5725RecLote = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      AV122Var2 = "" ;
      AV121Var1 = "" ;
      AV147RecForNro = "" ;
      AV242Densidad = DecimalUtil.ZERO ;
      AV215PrdAux = "" ;
      AV145PrdDsc = "" ;
      AV252Linea2 = "" ;
      AV24CodPrd = "" ;
      AV18Cantidad = DecimalUtil.ZERO ;
      AV120Unidades = "" ;
      AV187Cant_a = "" ;
      AV202Obs_l = "" ;
      AV33CosKgm = DecimalUtil.ZERO ;
      AV34CosMtr = DecimalUtil.ZERO ;
      AV223Varp1 = "" ;
      AV224Varp2 = "" ;
      AV225Varpar3 = "" ;
      AV226VarP4 = "" ;
      AV227VarP5 = "" ;
      AV228varP6 = "" ;
      AV203Tab_f = new String[20] ;
      GX_I = 1 ;
      while ( GX_I <= 20 )
      {
         AV203Tab_f[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV204Tab_fd = new String[20] ;
      GX_I = 1 ;
      while ( GX_I <= 20 )
      {
         AV204Tab_fd[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P072111_A130BarCodPar = new String[] {""} ;
      P072111_A132BarCodReo = new byte[1] ;
      P072111_A129BarCod = new int[1] ;
      P072111_A396EmprCod = new String[] {""} ;
      P072111_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P072111_n6034Ac_Metros = new boolean[] {false} ;
      P072111_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P072111_n6035Ac_Kilos = new boolean[] {false} ;
      P072111_A6033Ac_BarPar = new String[] {""} ;
      P072111_A6032Ac_BarReo = new byte[1] ;
      P072111_A6031Ac_Barcod = new int[1] ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      A6033Ac_BarPar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      AV159CliNom_a = "" ;
      GXv_char6 = new String[1] ;
      AV193BarSer_a = "" ;
      AV160SerDsc_a = "" ;
      GXv_int9 = new short[1] ;
      AV229Barcolnom = "" ;
      GXv_int11 = new int[1] ;
      AV158Hdr_a = "" ;
      AV83Lit39 = "" ;
      AV85Lit40 = "" ;
      AV86Lit41 = "" ;
      AV151Lit42 = "" ;
      AV150Lit43 = "" ;
      AV179Lit49 = "" ;
      AV104Lit18 = "" ;
      AV98Lit12 = "" ;
      P072112_A602MaqCod = new String[] {""} ;
      P072112_A396EmprCod = new String[] {""} ;
      P072112_A606MaqDsc = new String[] {""} ;
      P072112_n606MaqDsc = new boolean[] {false} ;
      P072112_A2391MaqMicro = new byte[1] ;
      P072112_n2391MaqMicro = new boolean[] {false} ;
      P072112_A3598MaqNroTub = new byte[1] ;
      P072112_n3598MaqNroTub = new boolean[] {false} ;
      P072112_A2801MaqVolRes = new int[1] ;
      P072112_n2801MaqVolRes = new boolean[] {false} ;
      A606MaqDsc = "" ;
      AV37DescMaq = "" ;
      P072113_A831TipColCod = new byte[1] ;
      P072113_A483ForColNum = new int[1] ;
      P072113_A482ForColNom = new String[] {""} ;
      P072113_A494ForSer = new String[] {""} ;
      P072113_A252CliCod = new int[1] ;
      P072113_n252CliCod = new boolean[] {false} ;
      P072113_A396EmprCod = new String[] {""} ;
      P072113_A649ObsForTxt = new String[] {""} ;
      P072113_A650ObsLin = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A649ObsForTxt = "" ;
      AV82Lit38 = "" ;
      AV164TipArtDsc = "" ;
      P072114_A829TipArtCod = new short[1] ;
      P072114_A396EmprCod = new String[] {""} ;
      P072114_A830TipArtDsc = new String[] {""} ;
      P072114_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      AV190DSCCAUSA = "" ;
      AV191Texto_r = "" ;
      P072115_A833TipDefCod = new short[1] ;
      P072115_A5085CodCausa = new short[1] ;
      P072115_n5085CodCausa = new boolean[] {false} ;
      P072115_A544HisCodPar = new String[] {""} ;
      P072115_A545HisCodReo = new byte[1] ;
      P072115_A539HisBarCod = new int[1] ;
      P072115_A396EmprCod = new String[] {""} ;
      P072115_A5086DscCausa = new String[] {""} ;
      P072115_n5086DscCausa = new boolean[] {false} ;
      P072115_A834TipDefDsc = new String[] {""} ;
      P072115_n834TipDefDsc = new boolean[] {false} ;
      A544HisCodPar = "" ;
      A5086DscCausa = "" ;
      A834TipDefDsc = "" ;
      AV123Var3 = "" ;
      AV31ContDsc = "" ;
      AV244FecPiolera = "" ;
      GXv_char8 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_int3 = new byte[1] ;
      AV94Lit0 = "" ;
      AV73Lit3 = "" ;
      AV84Lit4 = "" ;
      AV126Lit5 = "" ;
      AV127Lit6 = "" ;
      AV128Lit7 = "" ;
      AV129Lit8 = "" ;
      AV130Lit9 = "" ;
      AV96Lit10 = "" ;
      AV97Lit11 = "" ;
      AV99Lit13 = "" ;
      AV100Lit14 = "" ;
      AV101Lit15 = "" ;
      AV102Lit16 = "" ;
      AV103Lit17 = "" ;
      AV105Lit19 = "" ;
      AV107Lit20 = "" ;
      AV64Lit21 = "" ;
      AV65Lit22 = "" ;
      AV66Lit23 = "" ;
      AV67Lit24 = "" ;
      AV68Lit25 = "" ;
      AV69Lit26 = "" ;
      AV70Lit27 = "" ;
      AV71Lit28 = "" ;
      AV72Lit29 = "" ;
      AV74Lit30 = "" ;
      AV75Lit31 = "" ;
      AV76Lit32 = "" ;
      AV77Lit33 = "" ;
      AV78Lit34 = "" ;
      AV174Lit45 = "" ;
      AV175Lit46 = "" ;
      AV176Lit47 = "" ;
      AV178Lit48 = "" ;
      AV181Lit50 = "" ;
      AV183Lit51 = "" ;
      AV184Lit52 = "" ;
      GXt_char13 = "" ;
      GXv_char10 = new String[1] ;
      P072116_A130BarCodPar = new String[] {""} ;
      P072116_A132BarCodReo = new byte[1] ;
      P072116_A129BarCod = new int[1] ;
      P072116_A396EmprCod = new String[] {""} ;
      P072116_A252CliCod = new int[1] ;
      P072116_n252CliCod = new boolean[] {false} ;
      P072116_A212BarSer = new String[] {""} ;
      P072116_A135BarColNom = new String[] {""} ;
      P072116_A136BarColNum = new int[1] ;
      P072116_A218BarTipCol = new byte[1] ;
      P072116_A1652BarSerDsc = new String[] {""} ;
      P072116_A148BarEstReo = new byte[1] ;
      AV161ForSer = "" ;
      AV113Serie = "" ;
      AV195Tab_notas = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV195Tab_notas[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P072117_A396EmprCod = new String[] {""} ;
      P072117_A129BarCod = new int[1] ;
      P072117_A132BarCodReo = new byte[1] ;
      P072117_A130BarCodPar = new String[] {""} ;
      P072117_A187BarNotDsc = new String[] {""} ;
      P072117_A188BarNotLin = new byte[1] ;
      A187BarNotDsc = "" ;
      P072118_A396EmprCod = new String[] {""} ;
      P072118_A129BarCod = new int[1] ;
      P072118_A132BarCodReo = new byte[1] ;
      P072118_A130BarCodPar = new String[] {""} ;
      P072118_A194BarOrdLin = new short[1] ;
      P072118_A758ProCod = new String[] {""} ;
      P072118_A153BarFasEst = new byte[1] ;
      P072118_A457FasCod = new String[] {""} ;
      P072118_A460FasDsc = new String[] {""} ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV205Texto_f = "" ;
      P072119_A396EmprCod = new String[] {""} ;
      P072119_A129BarCod = new int[1] ;
      P072119_A132BarCodReo = new byte[1] ;
      P072119_A130BarCodPar = new String[] {""} ;
      P072119_A758ProCod = new String[] {""} ;
      P072119_A194BarOrdLin = new short[1] ;
      P072119_A9737BarValPar = new String[] {""} ;
      P072119_A3295BarParVal = new String[] {""} ;
      P072119_A12671BarParVl2 = new String[] {""} ;
      P072119_A1664ParFasCod = new short[1] ;
      A9737BarValPar = "" ;
      A3295BarParVal = "" ;
      A12671BarParVl2 = "" ;
      P072120_A583IntCod = new byte[1] ;
      P072120_A831TipColCod = new byte[1] ;
      P072120_A483ForColNum = new int[1] ;
      P072120_A482ForColNom = new String[] {""} ;
      P072120_A494ForSer = new String[] {""} ;
      P072120_A252CliCod = new int[1] ;
      P072120_n252CliCod = new boolean[] {false} ;
      P072120_A396EmprCod = new String[] {""} ;
      P072120_A584IntDsc = new String[] {""} ;
      P072120_n584IntDsc = new boolean[] {false} ;
      P072120_A627MatDsc = new String[] {""} ;
      P072120_n627MatDsc = new boolean[] {false} ;
      P072120_A626MatCod = new short[1] ;
      P072120_A832TipColDsc = new String[] {""} ;
      P072120_n832TipColDsc = new boolean[] {false} ;
      P072120_A1191ForNomCli = new String[] {""} ;
      P072120_n1191ForNomCli = new boolean[] {false} ;
      P072120_A1192ForNumCli = new int[1] ;
      P072120_n1192ForNumCli = new boolean[] {false} ;
      P072120_A995ForTonal = new String[] {""} ;
      P072120_n995ForTonal = new boolean[] {false} ;
      P072120_A3317DscSol = new String[] {""} ;
      P072120_n3317DscSol = new boolean[] {false} ;
      P072120_A3316CodSol = new short[1] ;
      P072120_n3316CodSol = new boolean[] {false} ;
      A584IntDsc = "" ;
      A627MatDsc = "" ;
      A832TipColDsc = "" ;
      A1191ForNomCli = "" ;
      A995ForTonal = "" ;
      A3317DscSol = "" ;
      AV135Matiz = "" ;
      AV118Tonalidad = "" ;
      AV182ForTonal = "" ;
      AV172DscSol = "" ;
      P072121_A396EmprCod = new String[] {""} ;
      P072121_A407EmprNom = new String[] {""} ;
      P072121_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV139NomEmp = "" ;
      AV114Termin = "" ;
      P072122_A942TermCod = new String[] {""} ;
      P072122_A1189TermUsu = new String[] {""} ;
      P072122_n1189TermUsu = new boolean[] {false} ;
      A942TermCod = "" ;
      A1189TermUsu = "" ;
      AV61TermUsu = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV169Num_int = "" ;
      AV170LinMaq = "" ;
      AV166BarSer_10 = "" ;
      AV165VCompo = "" ;
      AV197barNotDsc = "" ;
      AV218Lit500 = "" ;
      AV221Hdrl = "" ;
      AV220Texto_h = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rrac006__default(),
         new Object[] {
             new Object[] {
            P07212_A6039RecAcab, P07212_n6039RecAcab, P07212_A602MaqCod, P07212_A130BarCodPar, P07212_A132BarCodReo, P07212_A129BarCod, P07212_A396EmprCod, P07212_A2804RecLinMaq
            }
            , new Object[] {
            P07216_A3915EmpNumDec, P07216_n3915EmpNumDec, P07216_A130BarCodPar, P07216_A132BarCodReo, P07216_A396EmprCod, P07216_A129BarCod, P07216_A2804RecLinMaq, P07216_A4018BarBot, P07216_A6434BarAsi, P07216_A4833BarAudTur,
            P07216_n4833BarAudTur, P07216_A4937BarCtrPdas, P07216_n4937BarCtrPdas, P07216_A4467BarAcaMar, P07216_A5115RecAbsFac, P07216_A9998RecAnc, P07216_n9998RecAnc, P07216_A9996RecObsq, P07216_n9996RecObsq, P07216_A9997Recgrm,
            P07216_n9997Recgrm, P07216_A9764RecLtsSR, P07216_n9764RecLtsSR, P07216_A11507RecAva, P07216_n11507RecAva, P07216_A12128RecAs, P07216_n12128RecAs, P07216_A12129RecAi, P07216_n12129RecAi, P07216_A148BarEstReo,
            P07216_A3006BarCoef, P07216_n3006BarCoef, P07216_A1226BarGraCru, P07216_A4268RecOrdLin, P07216_n4268RecOrdLin, P07216_A4812BarEncCli, P07216_A4867RecFecMod, P07216_n4867RecFecMod, P07216_A4868RecUsrMod, P07216_n4868RecUsrMod,
            P07216_A4866RecFecAlt, P07216_n4866RecFecAlt, P07216_A4402RecUsrCod, P07216_A5109RecNumInt, P07216_A212BarSer, P07216_A224BarTraP1, P07216_A221BarTra1, P07216_A225BarTraP2, P07216_A222BarTra2, P07216_A226BarTraP3,
            P07216_A223BarTra3, P07216_A217BarTipArt, P07216_n217BarTipArt, P07216_A3137BarGraAca2, P07216_A1652BarSerDsc, P07216_A126BarAncAca2, P07216_A125BarAncAca1, P07216_A1909BarGraAca, P07216_A143BarDisNum, P07216_A2806RecFA,
            P07216_A5110RecNumPrg, P07216_A218BarTipCol, P07216_A136BarColNum, P07216_A135BarColNom, P07216_A279CliNom, P07216_A252CliCod, P07216_n252CliCod, P07216_A9789BarItem5, P07216_A4461BarLotMts, P07216_A9775BarItem1,
            P07216_A9812RecHdrLts, P07216_n9812RecHdrLts, P07216_A9811RecAbs2, P07216_n9811RecAbs2, P07216_A4271RecFagKgs, P07216_A4259RecTotKgs, P07216_A4272RecFagMts, P07216_A4260RecTotMts, P07216_n4260RecTotMts, P07216_A184BarMtr,
            P07216_n184BarMtr, P07216_A870BarTotMtr, P07216_n870BarTotMtr
            }
            , new Object[] {
            P07217_A396EmprCod, P07217_A129BarCod, P07217_A132BarCodReo, P07217_A130BarCodPar, P07217_A2804RecLinMaq, P07217_A764ProForCod, P07217_A771ProForTie, P07217_A1273RecLinPro
            }
            , new Object[] {
            P07218_A396EmprCod, P07218_A129BarCod, P07218_A132BarCodReo, P07218_A130BarCodPar, P07218_A2804RecLinMaq, P07218_A5258RecTxtObs, P07218_n5258RecTxtObs, P07218_A5257RecLinObs
            }
            , new Object[] {
            P07219_A4587ProRecObs, P07219_A396EmprCod, P07219_A129BarCod, P07219_A132BarCodReo, P07219_A130BarCodPar, P07219_A1273RecLinPro, P07219_A2804RecLinMaq, P07219_A772ProForTmx, P07219_A2393ProNumRec, P07219_A2392ProNumPro,
            P07219_A766ProForDsc, P07219_A771ProForTie, P07219_A764ProForCod
            }
            , new Object[] {
            P072110_A719PrdNum, P072110_n719PrdNum, P072110_A396EmprCod, P072110_A129BarCod, P072110_A132BarCodReo, P072110_A130BarCodPar, P072110_A2804RecLinMaq, P072110_A1273RecLinPro, P072110_A488ForPrdDsc, P072110_n488ForPrdDsc,
            P072110_A431FacCon, P072110_A2394RecForNro, P072110_A1643PrdTip, P072110_A5416PrdDensS, P072110_A4693PrdNum2, P072110_A724PrdPreAct, P072110_A686PrdCant, P072110_A872RecPrdNum, P072110_A875RecPrdDsc, P072110_A12641RecPrdDc2,
            P072110_A490ForPrdUMe, P072110_n490ForPrdUMe, P072110_A743PrdUniCon, P072110_A5725RecLote, P072110_A707PrdFacCon, P072110_A811RecLin
            }
            , new Object[] {
            P072111_A130BarCodPar, P072111_A132BarCodReo, P072111_A129BarCod, P072111_A396EmprCod, P072111_A6034Ac_Metros, P072111_n6034Ac_Metros, P072111_A6035Ac_Kilos, P072111_n6035Ac_Kilos, P072111_A6033Ac_BarPar, P072111_A6032Ac_BarReo,
            P072111_A6031Ac_Barcod
            }
            , new Object[] {
            P072112_A602MaqCod, P072112_A396EmprCod, P072112_A606MaqDsc, P072112_n606MaqDsc, P072112_A2391MaqMicro, P072112_n2391MaqMicro, P072112_A3598MaqNroTub, P072112_n3598MaqNroTub, P072112_A2801MaqVolRes, P072112_n2801MaqVolRes
            }
            , new Object[] {
            P072113_A831TipColCod, P072113_A483ForColNum, P072113_A482ForColNom, P072113_A494ForSer, P072113_A252CliCod, P072113_A396EmprCod, P072113_A649ObsForTxt, P072113_A650ObsLin
            }
            , new Object[] {
            P072114_A829TipArtCod, P072114_A396EmprCod, P072114_A830TipArtDsc, P072114_n830TipArtDsc
            }
            , new Object[] {
            P072115_A833TipDefCod, P072115_A5085CodCausa, P072115_n5085CodCausa, P072115_A544HisCodPar, P072115_A545HisCodReo, P072115_A539HisBarCod, P072115_A396EmprCod, P072115_A5086DscCausa, P072115_n5086DscCausa, P072115_A834TipDefDsc,
            P072115_n834TipDefDsc
            }
            , new Object[] {
            P072116_A130BarCodPar, P072116_A132BarCodReo, P072116_A129BarCod, P072116_A396EmprCod, P072116_A252CliCod, P072116_n252CliCod, P072116_A212BarSer, P072116_A135BarColNom, P072116_A136BarColNum, P072116_A218BarTipCol,
            P072116_A1652BarSerDsc, P072116_A148BarEstReo
            }
            , new Object[] {
            P072117_A396EmprCod, P072117_A129BarCod, P072117_A132BarCodReo, P072117_A130BarCodPar, P072117_A187BarNotDsc, P072117_A188BarNotLin
            }
            , new Object[] {
            P072118_A396EmprCod, P072118_A129BarCod, P072118_A132BarCodReo, P072118_A130BarCodPar, P072118_A194BarOrdLin, P072118_A758ProCod, P072118_A153BarFasEst, P072118_A457FasCod, P072118_A460FasDsc
            }
            , new Object[] {
            P072119_A396EmprCod, P072119_A129BarCod, P072119_A132BarCodReo, P072119_A130BarCodPar, P072119_A758ProCod, P072119_A194BarOrdLin, P072119_A9737BarValPar, P072119_A3295BarParVal, P072119_A12671BarParVl2, P072119_A1664ParFasCod
            }
            , new Object[] {
            P072120_A583IntCod, P072120_A831TipColCod, P072120_A483ForColNum, P072120_A482ForColNom, P072120_A494ForSer, P072120_A252CliCod, P072120_A396EmprCod, P072120_A584IntDsc, P072120_n584IntDsc, P072120_A627MatDsc,
            P072120_n627MatDsc, P072120_A626MatCod, P072120_A832TipColDsc, P072120_n832TipColDsc, P072120_A1191ForNomCli, P072120_n1191ForNomCli, P072120_A1192ForNumCli, P072120_n1192ForNumCli, P072120_A995ForTonal, P072120_n995ForTonal,
            P072120_A3317DscSol, P072120_n3317DscSol, P072120_A3316CodSol, P072120_n3316CodSol
            }
            , new Object[] {
            P072121_A396EmprCod, P072121_A407EmprNom, P072121_n407EmprNom
            }
            , new Object[] {
            P072122_A942TermCod, P072122_A1189TermUsu, P072122_n1189TermUsu
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

   private byte AV13BarCodReo ;
   private byte A132BarCodReo ;
   private byte A3915EmpNumDec ;
   private byte A6434BarAsi ;
   private byte A4833BarAudTur ;
   private byte A4937BarCtrPdas ;
   private byte A148BarEstReo ;
   private byte A218BarTipCol ;
   private byte AV25Colorante ;
   private byte AV117TipColCod ;
   private byte AV90I ;
   private byte A1273RecLinPro ;
   private byte AV141NumCam ;
   private byte A2394RecForNro ;
   private byte A490ForPrdUMe ;
   private byte A743PrdUniCon ;
   private byte AV213Orient ;
   private byte AV222Jpf ;
   private byte AV254Costelinea ;
   private byte AV56FlagNline ;
   private byte AV199Carvema ;
   private byte AV54FlagImp ;
   private byte AV247todosproductos ;
   private byte AV189Sin_dec ;
   private byte AV231Er ;
   private byte AV47Flag ;
   private byte AV243piolera ;
   private byte AV250anahuac ;
   private byte AV157Flag_Agr ;
   private byte A6032Ac_BarReo ;
   private byte AV140NTubos ;
   private byte A2391MaqMicro ;
   private byte A3598MaqNroTub ;
   private byte AV133MaqMicro ;
   private byte AV57FlagObs ;
   private byte A831TipColCod ;
   private byte A545HisCodReo ;
   private byte AV168Imp_agrup ;
   private byte AV53Flagidioma ;
   private byte AV48FlagBar ;
   private byte AV50FlagCod ;
   private byte AV211ideas ;
   private byte AV212Carolina ;
   private byte AV246Cambiarcpp ;
   private byte GXt_int12 ;
   private byte GXv_int3[] ;
   private byte AV163FlagEnd ;
   private byte A188BarNotLin ;
   private byte A153BarFasEst ;
   private byte A583IntCod ;
   private byte AV194Obs_ok ;
   private short gxcookieaux ;
   private short AV148RecLinMaq ;
   private short AV248TotBanyos ;
   private short AV249NumBanyo ;
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
   private short AV209Recabsfac ;
   private short AV207RecAnc ;
   private short AV208Recgrm ;
   private short AV14BarGraAca ;
   private short AV149RelBany ;
   private short AV59Tiempos[] ;
   private short A771ProForTie ;
   private short A5257RecLinObs ;
   private short A772ProForTmx ;
   private short AV214Profortmx ;
   private short A811RecLin ;
   private short AV200Nlin ;
   private short AV201j ;
   private short AV198Recordlin ;
   private short AV206Barancaca1 ;
   private short GXv_int9[] ;
   private short A650ObsLin ;
   private short AV167BarTipArt ;
   private short A829TipArtCod ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short AV196x ;
   private short A194BarOrdLin ;
   private short A1664ParFasCod ;
   private short A626MatCod ;
   private short A3316CodSol ;
   private short AV134MatCod ;
   private short AV173CodSol ;
   private short Gx_err ;
   private int AV11BarCod ;
   private int AV156Volumen ;
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
   private int AV19CliCod ;
   private int AV111ForColNum ;
   private int AV216RecLtssr ;
   private int AV131Lts1 ;
   private int AV132Lts2 ;
   private int GX_I ;
   private int A2393ProNumRec ;
   private int A2392ProNumPro ;
   private int Gx_OldLine ;
   private int AV253ValorEI ;
   private int AV188Cant_sd ;
   private int A6031Ac_Barcod ;
   private int GXv_int2[] ;
   private int AV192CliCod_a ;
   private int GXv_int5[] ;
   private int AV230Barcolnum ;
   private int GXv_int11[] ;
   private int AV217MaqVolRes ;
   private int A2801MaqVolRes ;
   private int A483ForColNum ;
   private int A539HisBarCod ;
   private int AV162Cliente ;
   private int A1192ForNumCli ;
   private int AV142NumCli ;
   private int AV219LtsIni ;
   private long AV119TotTiempo ;
   private java.math.BigDecimal AV35Coste ;
   private java.math.BigDecimal AV36Coste2 ;
   private java.math.BigDecimal A5115RecAbsFac ;
   private java.math.BigDecimal A3006BarCoef ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A4461BarLotMts ;
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
   private java.math.BigDecimal AV93Largura ;
   private java.math.BigDecimal AV115TiempoV ;
   private java.math.BigDecimal AV87GrMlin ;
   private java.math.BigDecimal AV27CompTP ;
   private java.math.BigDecimal AV26CompCamar ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A5416PrdDensS ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal AV242Densidad ;
   private java.math.BigDecimal AV18Cantidad ;
   private java.math.BigDecimal AV33CosKgm ;
   private java.math.BigDecimal AV34CosMtr ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private java.math.BigDecimal A6035Ac_Kilos ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV44EmprCod ;
   private String AV12BarCodPar ;
   private String AV15BarMaqCod ;
   private String AV17BarSua ;
   private String AV91ImpCod ;
   private String scmdbuf ;
   private String A6039RecAcab ;
   private String A602MaqCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String AV38DesCol ;
   private String AV116TipCol ;
   private String AV39DesInt ;
   private String AV92Intens ;
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
   private String A9789BarItem5 ;
   private String A9775BarItem1 ;
   private String A9812RecHdrLts ;
   private String AV236S ;
   private String AV237C ;
   private String AV240P ;
   private String AV238Pf ;
   private String AV239Forcodext ;
   private String AV8ArtCod ;
   private String AV110ForColNom ;
   private String AV232Recava ;
   private String AV234RecAs ;
   private String AV235RecAi ;
   private String AV62Remonta ;
   private String AV125Lit44 ;
   private String AV58Procesos[] ;
   private String A764ProForCod ;
   private String AV180RecObs[] ;
   private String A5258RecTxtObs ;
   private String AV89HojRut ;
   private String AV63Hdr ;
   private String A766ProForDsc ;
   private String AV79Lit35 ;
   private String AV81Lit37 ;
   private String AV80Lit36 ;
   private String A719PrdNum ;
   private String A488ForPrdDsc ;
   private String A1643PrdTip ;
   private String A4693PrdNum2 ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A12641RecPrdDc2 ;
   private String A5725RecLote ;
   private String AV122Var2 ;
   private String AV121Var1 ;
   private String AV147RecForNro ;
   private String AV215PrdAux ;
   private String AV145PrdDsc ;
   private String AV252Linea2 ;
   private String AV24CodPrd ;
   private String AV120Unidades ;
   private String AV187Cant_a ;
   private String AV202Obs_l ;
   private String AV223Varp1 ;
   private String AV224Varp2 ;
   private String AV225Varpar3 ;
   private String AV226VarP4 ;
   private String AV227VarP5 ;
   private String AV228varP6 ;
   private String AV203Tab_f[] ;
   private String AV204Tab_fd[] ;
   private String A6033Ac_BarPar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String AV159CliNom_a ;
   private String GXv_char6[] ;
   private String AV193BarSer_a ;
   private String AV160SerDsc_a ;
   private String AV229Barcolnom ;
   private String AV158Hdr_a ;
   private String AV83Lit39 ;
   private String AV85Lit40 ;
   private String AV86Lit41 ;
   private String AV151Lit42 ;
   private String AV150Lit43 ;
   private String AV179Lit49 ;
   private String AV104Lit18 ;
   private String AV98Lit12 ;
   private String A606MaqDsc ;
   private String AV37DescMaq ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A649ObsForTxt ;
   private String AV82Lit38 ;
   private String AV164TipArtDsc ;
   private String A830TipArtDsc ;
   private String AV190DSCCAUSA ;
   private String AV191Texto_r ;
   private String A544HisCodPar ;
   private String A5086DscCausa ;
   private String A834TipDefDsc ;
   private String AV123Var3 ;
   private String AV31ContDsc ;
   private String AV244FecPiolera ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String AV94Lit0 ;
   private String AV73Lit3 ;
   private String AV84Lit4 ;
   private String AV126Lit5 ;
   private String AV127Lit6 ;
   private String AV128Lit7 ;
   private String AV129Lit8 ;
   private String AV130Lit9 ;
   private String AV96Lit10 ;
   private String AV97Lit11 ;
   private String AV99Lit13 ;
   private String AV100Lit14 ;
   private String AV101Lit15 ;
   private String AV102Lit16 ;
   private String AV103Lit17 ;
   private String AV105Lit19 ;
   private String AV107Lit20 ;
   private String AV64Lit21 ;
   private String AV65Lit22 ;
   private String AV66Lit23 ;
   private String AV67Lit24 ;
   private String AV68Lit25 ;
   private String AV69Lit26 ;
   private String AV70Lit27 ;
   private String AV71Lit28 ;
   private String AV72Lit29 ;
   private String AV74Lit30 ;
   private String AV75Lit31 ;
   private String AV76Lit32 ;
   private String AV77Lit33 ;
   private String AV78Lit34 ;
   private String AV174Lit45 ;
   private String AV175Lit46 ;
   private String AV176Lit47 ;
   private String AV178Lit48 ;
   private String AV181Lit50 ;
   private String AV183Lit51 ;
   private String AV184Lit52 ;
   private String GXt_char13 ;
   private String GXv_char10[] ;
   private String AV161ForSer ;
   private String AV113Serie ;
   private String AV195Tab_notas[] ;
   private String A187BarNotDsc ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV205Texto_f ;
   private String A9737BarValPar ;
   private String A3295BarParVal ;
   private String A12671BarParVl2 ;
   private String A584IntDsc ;
   private String A627MatDsc ;
   private String A832TipColDsc ;
   private String A1191ForNomCli ;
   private String A995ForTonal ;
   private String A3317DscSol ;
   private String AV135Matiz ;
   private String AV118Tonalidad ;
   private String AV182ForTonal ;
   private String AV172DscSol ;
   private String A407EmprNom ;
   private String AV139NomEmp ;
   private String AV114Termin ;
   private String A942TermCod ;
   private String A1189TermUsu ;
   private String AV61TermUsu ;
   private String Gx_time ;
   private String AV169Num_int ;
   private String AV170LinMaq ;
   private String AV166BarSer_10 ;
   private String AV165VCompo ;
   private String AV197barNotDsc ;
   private String AV218Lit500 ;
   private String AV221Hdrl ;
   private String AV220Texto_h ;
   private java.util.Date A4867RecFecMod ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private String AV210RecObsq ;
   private IDataStoreProvider pr_default ;
   private String[] P07212_A6039RecAcab ;
   private boolean[] P07212_n6039RecAcab ;
   private String[] P07212_A602MaqCod ;
   private String[] P07212_A130BarCodPar ;
   private byte[] P07212_A132BarCodReo ;
   private int[] P07212_A129BarCod ;
   private String[] P07212_A396EmprCod ;
   private short[] P07212_A2804RecLinMaq ;
   private byte[] P07216_A3915EmpNumDec ;
   private boolean[] P07216_n3915EmpNumDec ;
   private String[] P07216_A130BarCodPar ;
   private byte[] P07216_A132BarCodReo ;
   private String[] P07216_A396EmprCod ;
   private int[] P07216_A129BarCod ;
   private short[] P07216_A2804RecLinMaq ;
   private String[] P07216_A4018BarBot ;
   private byte[] P07216_A6434BarAsi ;
   private byte[] P07216_A4833BarAudTur ;
   private boolean[] P07216_n4833BarAudTur ;
   private byte[] P07216_A4937BarCtrPdas ;
   private boolean[] P07216_n4937BarCtrPdas ;
   private String[] P07216_A4467BarAcaMar ;
   private java.math.BigDecimal[] P07216_A5115RecAbsFac ;
   private short[] P07216_A9998RecAnc ;
   private boolean[] P07216_n9998RecAnc ;
   private String[] P07216_A9996RecObsq ;
   private boolean[] P07216_n9996RecObsq ;
   private short[] P07216_A9997Recgrm ;
   private boolean[] P07216_n9997Recgrm ;
   private int[] P07216_A9764RecLtsSR ;
   private boolean[] P07216_n9764RecLtsSR ;
   private String[] P07216_A11507RecAva ;
   private boolean[] P07216_n11507RecAva ;
   private String[] P07216_A12128RecAs ;
   private boolean[] P07216_n12128RecAs ;
   private String[] P07216_A12129RecAi ;
   private boolean[] P07216_n12129RecAi ;
   private byte[] P07216_A148BarEstReo ;
   private java.math.BigDecimal[] P07216_A3006BarCoef ;
   private boolean[] P07216_n3006BarCoef ;
   private short[] P07216_A1226BarGraCru ;
   private short[] P07216_A4268RecOrdLin ;
   private boolean[] P07216_n4268RecOrdLin ;
   private String[] P07216_A4812BarEncCli ;
   private java.util.Date[] P07216_A4867RecFecMod ;
   private boolean[] P07216_n4867RecFecMod ;
   private String[] P07216_A4868RecUsrMod ;
   private boolean[] P07216_n4868RecUsrMod ;
   private java.util.Date[] P07216_A4866RecFecAlt ;
   private boolean[] P07216_n4866RecFecAlt ;
   private String[] P07216_A4402RecUsrCod ;
   private int[] P07216_A5109RecNumInt ;
   private String[] P07216_A212BarSer ;
   private short[] P07216_A224BarTraP1 ;
   private String[] P07216_A221BarTra1 ;
   private short[] P07216_A225BarTraP2 ;
   private String[] P07216_A222BarTra2 ;
   private short[] P07216_A226BarTraP3 ;
   private String[] P07216_A223BarTra3 ;
   private short[] P07216_A217BarTipArt ;
   private boolean[] P07216_n217BarTipArt ;
   private short[] P07216_A3137BarGraAca2 ;
   private String[] P07216_A1652BarSerDsc ;
   private short[] P07216_A126BarAncAca2 ;
   private short[] P07216_A125BarAncAca1 ;
   private short[] P07216_A1909BarGraAca ;
   private String[] P07216_A143BarDisNum ;
   private java.math.BigDecimal[] P07216_A2806RecFA ;
   private String[] P07216_A5110RecNumPrg ;
   private byte[] P07216_A218BarTipCol ;
   private int[] P07216_A136BarColNum ;
   private String[] P07216_A135BarColNom ;
   private String[] P07216_A279CliNom ;
   private int[] P07216_A252CliCod ;
   private boolean[] P07216_n252CliCod ;
   private String[] P07216_A9789BarItem5 ;
   private java.math.BigDecimal[] P07216_A4461BarLotMts ;
   private String[] P07216_A9775BarItem1 ;
   private String[] P07216_A9812RecHdrLts ;
   private boolean[] P07216_n9812RecHdrLts ;
   private java.math.BigDecimal[] P07216_A9811RecAbs2 ;
   private boolean[] P07216_n9811RecAbs2 ;
   private java.math.BigDecimal[] P07216_A4271RecFagKgs ;
   private java.math.BigDecimal[] P07216_A4259RecTotKgs ;
   private java.math.BigDecimal[] P07216_A4272RecFagMts ;
   private java.math.BigDecimal[] P07216_A4260RecTotMts ;
   private boolean[] P07216_n4260RecTotMts ;
   private java.math.BigDecimal[] P07216_A184BarMtr ;
   private boolean[] P07216_n184BarMtr ;
   private java.math.BigDecimal[] P07216_A870BarTotMtr ;
   private boolean[] P07216_n870BarTotMtr ;
   private String[] P07217_A396EmprCod ;
   private int[] P07217_A129BarCod ;
   private byte[] P07217_A132BarCodReo ;
   private String[] P07217_A130BarCodPar ;
   private short[] P07217_A2804RecLinMaq ;
   private String[] P07217_A764ProForCod ;
   private short[] P07217_A771ProForTie ;
   private byte[] P07217_A1273RecLinPro ;
   private String[] P07218_A396EmprCod ;
   private int[] P07218_A129BarCod ;
   private byte[] P07218_A132BarCodReo ;
   private String[] P07218_A130BarCodPar ;
   private short[] P07218_A2804RecLinMaq ;
   private String[] P07218_A5258RecTxtObs ;
   private boolean[] P07218_n5258RecTxtObs ;
   private short[] P07218_A5257RecLinObs ;
   private String[] P07219_A4587ProRecObs ;
   private String[] P07219_A396EmprCod ;
   private int[] P07219_A129BarCod ;
   private byte[] P07219_A132BarCodReo ;
   private String[] P07219_A130BarCodPar ;
   private byte[] P07219_A1273RecLinPro ;
   private short[] P07219_A2804RecLinMaq ;
   private short[] P07219_A772ProForTmx ;
   private int[] P07219_A2393ProNumRec ;
   private int[] P07219_A2392ProNumPro ;
   private String[] P07219_A766ProForDsc ;
   private short[] P07219_A771ProForTie ;
   private String[] P07219_A764ProForCod ;
   private String[] P072110_A719PrdNum ;
   private boolean[] P072110_n719PrdNum ;
   private String[] P072110_A396EmprCod ;
   private int[] P072110_A129BarCod ;
   private byte[] P072110_A132BarCodReo ;
   private String[] P072110_A130BarCodPar ;
   private short[] P072110_A2804RecLinMaq ;
   private byte[] P072110_A1273RecLinPro ;
   private String[] P072110_A488ForPrdDsc ;
   private boolean[] P072110_n488ForPrdDsc ;
   private java.math.BigDecimal[] P072110_A431FacCon ;
   private byte[] P072110_A2394RecForNro ;
   private String[] P072110_A1643PrdTip ;
   private java.math.BigDecimal[] P072110_A5416PrdDensS ;
   private String[] P072110_A4693PrdNum2 ;
   private java.math.BigDecimal[] P072110_A724PrdPreAct ;
   private java.math.BigDecimal[] P072110_A686PrdCant ;
   private String[] P072110_A872RecPrdNum ;
   private String[] P072110_A875RecPrdDsc ;
   private String[] P072110_A12641RecPrdDc2 ;
   private byte[] P072110_A490ForPrdUMe ;
   private boolean[] P072110_n490ForPrdUMe ;
   private byte[] P072110_A743PrdUniCon ;
   private String[] P072110_A5725RecLote ;
   private java.math.BigDecimal[] P072110_A707PrdFacCon ;
   private short[] P072110_A811RecLin ;
   private String[] P072111_A130BarCodPar ;
   private byte[] P072111_A132BarCodReo ;
   private int[] P072111_A129BarCod ;
   private String[] P072111_A396EmprCod ;
   private java.math.BigDecimal[] P072111_A6034Ac_Metros ;
   private boolean[] P072111_n6034Ac_Metros ;
   private java.math.BigDecimal[] P072111_A6035Ac_Kilos ;
   private boolean[] P072111_n6035Ac_Kilos ;
   private String[] P072111_A6033Ac_BarPar ;
   private byte[] P072111_A6032Ac_BarReo ;
   private int[] P072111_A6031Ac_Barcod ;
   private String[] P072112_A602MaqCod ;
   private String[] P072112_A396EmprCod ;
   private String[] P072112_A606MaqDsc ;
   private boolean[] P072112_n606MaqDsc ;
   private byte[] P072112_A2391MaqMicro ;
   private boolean[] P072112_n2391MaqMicro ;
   private byte[] P072112_A3598MaqNroTub ;
   private boolean[] P072112_n3598MaqNroTub ;
   private int[] P072112_A2801MaqVolRes ;
   private boolean[] P072112_n2801MaqVolRes ;
   private byte[] P072113_A831TipColCod ;
   private int[] P072113_A483ForColNum ;
   private String[] P072113_A482ForColNom ;
   private String[] P072113_A494ForSer ;
   private int[] P072113_A252CliCod ;
   private boolean[] P072113_n252CliCod ;
   private String[] P072113_A396EmprCod ;
   private String[] P072113_A649ObsForTxt ;
   private short[] P072113_A650ObsLin ;
   private short[] P072114_A829TipArtCod ;
   private String[] P072114_A396EmprCod ;
   private String[] P072114_A830TipArtDsc ;
   private boolean[] P072114_n830TipArtDsc ;
   private short[] P072115_A833TipDefCod ;
   private short[] P072115_A5085CodCausa ;
   private boolean[] P072115_n5085CodCausa ;
   private String[] P072115_A544HisCodPar ;
   private byte[] P072115_A545HisCodReo ;
   private int[] P072115_A539HisBarCod ;
   private String[] P072115_A396EmprCod ;
   private String[] P072115_A5086DscCausa ;
   private boolean[] P072115_n5086DscCausa ;
   private String[] P072115_A834TipDefDsc ;
   private boolean[] P072115_n834TipDefDsc ;
   private String[] P072116_A130BarCodPar ;
   private byte[] P072116_A132BarCodReo ;
   private int[] P072116_A129BarCod ;
   private String[] P072116_A396EmprCod ;
   private int[] P072116_A252CliCod ;
   private boolean[] P072116_n252CliCod ;
   private String[] P072116_A212BarSer ;
   private String[] P072116_A135BarColNom ;
   private int[] P072116_A136BarColNum ;
   private byte[] P072116_A218BarTipCol ;
   private String[] P072116_A1652BarSerDsc ;
   private byte[] P072116_A148BarEstReo ;
   private String[] P072117_A396EmprCod ;
   private int[] P072117_A129BarCod ;
   private byte[] P072117_A132BarCodReo ;
   private String[] P072117_A130BarCodPar ;
   private String[] P072117_A187BarNotDsc ;
   private byte[] P072117_A188BarNotLin ;
   private String[] P072118_A396EmprCod ;
   private int[] P072118_A129BarCod ;
   private byte[] P072118_A132BarCodReo ;
   private String[] P072118_A130BarCodPar ;
   private short[] P072118_A194BarOrdLin ;
   private String[] P072118_A758ProCod ;
   private byte[] P072118_A153BarFasEst ;
   private String[] P072118_A457FasCod ;
   private String[] P072118_A460FasDsc ;
   private String[] P072119_A396EmprCod ;
   private int[] P072119_A129BarCod ;
   private byte[] P072119_A132BarCodReo ;
   private String[] P072119_A130BarCodPar ;
   private String[] P072119_A758ProCod ;
   private short[] P072119_A194BarOrdLin ;
   private String[] P072119_A9737BarValPar ;
   private String[] P072119_A3295BarParVal ;
   private String[] P072119_A12671BarParVl2 ;
   private short[] P072119_A1664ParFasCod ;
   private byte[] P072120_A583IntCod ;
   private byte[] P072120_A831TipColCod ;
   private int[] P072120_A483ForColNum ;
   private String[] P072120_A482ForColNom ;
   private String[] P072120_A494ForSer ;
   private int[] P072120_A252CliCod ;
   private boolean[] P072120_n252CliCod ;
   private String[] P072120_A396EmprCod ;
   private String[] P072120_A584IntDsc ;
   private boolean[] P072120_n584IntDsc ;
   private String[] P072120_A627MatDsc ;
   private boolean[] P072120_n627MatDsc ;
   private short[] P072120_A626MatCod ;
   private String[] P072120_A832TipColDsc ;
   private boolean[] P072120_n832TipColDsc ;
   private String[] P072120_A1191ForNomCli ;
   private boolean[] P072120_n1191ForNomCli ;
   private int[] P072120_A1192ForNumCli ;
   private boolean[] P072120_n1192ForNumCli ;
   private String[] P072120_A995ForTonal ;
   private boolean[] P072120_n995ForTonal ;
   private String[] P072120_A3317DscSol ;
   private boolean[] P072120_n3317DscSol ;
   private short[] P072120_A3316CodSol ;
   private boolean[] P072120_n3316CodSol ;
   private String[] P072121_A396EmprCod ;
   private String[] P072121_A407EmprNom ;
   private boolean[] P072121_n407EmprNom ;
   private String[] P072122_A942TermCod ;
   private String[] P072122_A1189TermUsu ;
   private boolean[] P072122_n1189TermUsu ;
}

final  class rrac006__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07212", "SELECT RecAcab, MaqCod, BarCodPar, BarCodReo, BarCod, EmprCod, RecLinMaq FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (MaqCod = ?) AND (RecAcab = 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07216", "SELECT T2.EmpNumDec, T1.BarCodPar, T1.BarCodReo, T1.EmprCod, T1.BarCod, T1.RecLinMaq, T3.BarBot, T3.BarAsi, T3.BarAudTur, T3.BarCtrPdas, T3.BarAcaMar, T1.RecAbsFac, T1.RecAnc, T1.RecObsq, T1.Recgrm, T1.RecLtsSR, T1.RecAva, T1.RecAs, T1.RecAi, T3.BarEstReo, T3.BarCoef, T3.BarGraCru, T1.RecOrdLin, T3.BarEncCli, T1.RecFecMod, T1.RecUsrMod, T1.RecFecAlt, T1.RecUsrCod, T1.RecNumInt, T3.BarSer, T3.BarTraP1, T3.BarTra1, T3.BarTraP2, T3.BarTra2, T3.BarTraP3, T3.BarTra3, T3.BarTipArt, T3.BarGraAca2, T3.BarSerDsc, T3.BarAncAca2, T3.BarAncAca1, T3.BarGraAca, T3.BarDisNum, T1.RecFA, T1.RecNumPrg, T3.BarTipCol, T3.BarColNum, T3.BarColNom, T4.CliNom, T3.CliCod, T3.BarItem5, T3.BarLotMts, T3.BarItem1, T1.RecHdrLts, T1.RecAbs2, COALESCE( T7.RecFagKgs, 0) AS RecFagKgs, T1.RecTotKgs, COALESCE( T7.RecFagMts, 0) AS RecFagMts, T1.RecTotMts, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE( T5.BarTotMtr, 0) AS BarTotMtr FROM ((((((TXPRECMAQ T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod) LEFT JOIN (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(RecAgrMts) AS RecFagMts, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, SUM(RecAgrKgs) AS RecFagKgs FROM TXPRECFAG GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar AND T7.RecLinMaq = T1.RecLinMaq) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07217", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.ProForCod, T2.ProForTie, T1.RecLinPro FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07218", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecTxtObs, RecLinObs FROM TXPOBSREC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinObs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07219", "SELECT T1.ProRecObs, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinPro, T1.RecLinMaq, T2.ProForTmx, T2.ProNumRec, T2.ProNumPro, T2.ProForDsc, T2.ProForTie, T1.ProForCod FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P072110", "SELECT T1.PrdNum, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T3.ForPrdDsc, T1.FacCon, T1.RecForNro, T2.PrdTip, T2.PrdDensS, T2.PrdNum2, T2.PrdPreAct, T1.PrdCant, T1.RecPrdNum, T1.RecPrdDsc, T1.RecPrdDc2, T1.ForPrdUMe, T2.PrdUniCon, T1.RecLote, T2.PrdFacCon, T1.RecLin FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P072111", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, Ac_Metros, Ac_Kilos, Ac_BarPar, Ac_BarReo, Ac_Barcod FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P072112", "SELECT MaqCod, EmprCod, MaqDsc, MaqMicro, MaqNroTub, MaqVolRes FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P072113", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ObsForTxt, ObsLin FROM TXPLOBFOR WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P072114", "SELECT TipArtCod, EmprCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P072115", "SELECT T1.TipDefCod, T1.CodCausa, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod, T1.EmprCod, T3.DscCausa, T2.TipDefDsc FROM ((TXPHISREO T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T3 ON T3.EmprCod = T1.EmprCod AND T3.CodCausa = T1.CodCausa) WHERE T1.EmprCod = ? and T1.HisBarCod = ? and T1.HisCodReo = ? and T1.HisCodPar = ? ORDER BY T1.EmprCod, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P072116", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarSerDsc, BarEstReo FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P072117", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotDsc, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P072118", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.ProCod, T1.BarFasEst, T1.FasCod, T2.FasDsc FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P072119", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarValPar, BarParVal, BarParVl2, ParFasCod FROM TXPBarPar WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P072120", "SELECT T1.IntCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.EmprCod, T2.IntDsc, T4.MatDsc, T1.MatCod, T3.TipColDsc, T1.ForNomCli, T1.ForNumCli, T1.ForTonal, T5.DscSol, T1.CodSol FROM ((((TXPCFORMU T1 INNER JOIN TXPINTENS T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCod = T1.IntCod) INNER JOIN TXPTIPCOL T3 ON T3.EmprCod = T1.EmprCod AND T3.TipColCod = T1.TipColCod) INNER JOIN TXPMATICE T4 ON T4.EmprCod = T1.EmprCod AND T4.MatCod = T1.MatCod) LEFT JOIN TXPSOLIDE T5 ON T5.EmprCod = T1.EmprCod AND T5.CodSol = T1.CodSol) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P072121", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P072122", "SELECT TermCod, TermUsu FROM TXPTERMIN WHERE TermCod = ? ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[67])[0] = rslt.getString(51, 20);
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(52,2);
               ((String[]) buf[69])[0] = rslt.getString(53, 20);
               ((String[]) buf[70])[0] = rslt.getString(54, 12);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(55,2);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[74])[0] = rslt.getBigDecimal(56,2);
               ((java.math.BigDecimal[]) buf[75])[0] = rslt.getBigDecimal(57,2);
               ((java.math.BigDecimal[]) buf[76])[0] = rslt.getBigDecimal(58,2);
               ((java.math.BigDecimal[]) buf[77])[0] = rslt.getBigDecimal(59,2);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[79])[0] = rslt.getBigDecimal(60,2);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(61,2);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
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
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,3);
               ((String[]) buf[17])[0] = rslt.getString(16, 6);
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 40);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(20);
               ((String[]) buf[23])[0] = rslt.getString(21, 26);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,4);
               ((short[]) buf[25])[0] = rslt.getShort(23);
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
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((short[]) buf[9])[0] = rslt.getShort(10);
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

