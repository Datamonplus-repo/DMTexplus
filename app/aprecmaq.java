package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aprecmaq extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aprecmaq pgm = new aprecmaq (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aprecmaq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aprecmaq.class ), "" );
   }

   public aprecmaq( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00KE2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8353RecMaqObs = P00KE2_A8353RecMaqObs[0] ;
         A180BarMaqCod = P00KE2_A180BarMaqCod[0] ;
         A236BarVolMaq = P00KE2_A236BarVolMaq[0] ;
         A12902Rsedo14 = P00KE2_A12902Rsedo14[0] ;
         A12901Rsedo13 = P00KE2_A12901Rsedo13[0] ;
         A12900Rsedo12 = P00KE2_A12900Rsedo12[0] ;
         A12274Rsedo11 = P00KE2_A12274Rsedo11[0] ;
         A12273Rsedo10 = P00KE2_A12273Rsedo10[0] ;
         A12272Rsedo9 = P00KE2_A12272Rsedo9[0] ;
         A12271Rsedo8 = P00KE2_A12271Rsedo8[0] ;
         A12270Rsedo7 = P00KE2_A12270Rsedo7[0] ;
         A12129RecAi = P00KE2_A12129RecAi[0] ;
         n12129RecAi = P00KE2_n12129RecAi[0] ;
         A12128RecAs = P00KE2_A12128RecAs[0] ;
         n12128RecAs = P00KE2_n12128RecAs[0] ;
         A11507RecAva = P00KE2_A11507RecAva[0] ;
         n11507RecAva = P00KE2_n11507RecAva[0] ;
         A10385RecCAut = P00KE2_A10385RecCAut[0] ;
         A10129Rsedo6 = P00KE2_A10129Rsedo6[0] ;
         A10128Rsedo5 = P00KE2_A10128Rsedo5[0] ;
         A10127Rsedo4 = P00KE2_A10127Rsedo4[0] ;
         A10126Rsedo3 = P00KE2_A10126Rsedo3[0] ;
         A10125Rsedo2 = P00KE2_A10125Rsedo2[0] ;
         A10124Rsedo1 = P00KE2_A10124Rsedo1[0] ;
         A9998RecAnc = P00KE2_A9998RecAnc[0] ;
         n9998RecAnc = P00KE2_n9998RecAnc[0] ;
         A9997Recgrm = P00KE2_A9997Recgrm[0] ;
         n9997Recgrm = P00KE2_n9997Recgrm[0] ;
         A9996RecObsq = P00KE2_A9996RecObsq[0] ;
         n9996RecObsq = P00KE2_n9996RecObsq[0] ;
         A9812RecHdrLts = P00KE2_A9812RecHdrLts[0] ;
         n9812RecHdrLts = P00KE2_n9812RecHdrLts[0] ;
         A9811RecAbs2 = P00KE2_A9811RecAbs2[0] ;
         n9811RecAbs2 = P00KE2_n9811RecAbs2[0] ;
         A9765RecLtsDf = P00KE2_A9765RecLtsDf[0] ;
         n9765RecLtsDf = P00KE2_n9765RecLtsDf[0] ;
         A9764RecLtsSR = P00KE2_A9764RecLtsSR[0] ;
         n9764RecLtsSR = P00KE2_n9764RecLtsSR[0] ;
         A8367RecPriAca = P00KE2_A8367RecPriAca[0] ;
         n8367RecPriAca = P00KE2_n8367RecPriAca[0] ;
         A7774RecMaqPML = P00KE2_A7774RecMaqPML[0] ;
         A7773RecMaqDel = P00KE2_A7773RecMaqDel[0] ;
         A7772RecMaqTej = P00KE2_A7772RecMaqTej[0] ;
         A7771RecMaqCla = P00KE2_A7771RecMaqCla[0] ;
         A7770RecMaqTor = P00KE2_A7770RecMaqTor[0] ;
         A7769RecMaqMol = P00KE2_A7769RecMaqMol[0] ;
         A7768RecMaqRPM = P00KE2_A7768RecMaqRPM[0] ;
         A7767RecMaqFlow = P00KE2_A7767RecMaqFlow[0] ;
         A7766RecMaqBL = P00KE2_A7766RecMaqBL[0] ;
         A7765RecMaqVX = P00KE2_A7765RecMaqVX[0] ;
         A7764RecMaqNh = P00KE2_A7764RecMaqNh[0] ;
         A6270RecPrg3 = P00KE2_A6270RecPrg3[0] ;
         A6269RecPrg2 = P00KE2_A6269RecPrg2[0] ;
         A6039RecAcab = P00KE2_A6039RecAcab[0] ;
         n6039RecAcab = P00KE2_n6039RecAcab[0] ;
         A5431RecPriPla = P00KE2_A5431RecPriPla[0] ;
         n5431RecPriPla = P00KE2_n5431RecPriPla[0] ;
         A5430RecFecPla = P00KE2_A5430RecFecPla[0] ;
         n5430RecFecPla = P00KE2_n5430RecFecPla[0] ;
         A5413RecMatCol = P00KE2_A5413RecMatCol[0] ;
         n5413RecMatCol = P00KE2_n5413RecMatCol[0] ;
         A5412RecIntCol = P00KE2_A5412RecIntCol[0] ;
         n5412RecIntCol = P00KE2_n5412RecIntCol[0] ;
         A5407RecUltLCo = P00KE2_A5407RecUltLCo[0] ;
         n5407RecUltLCo = P00KE2_n5407RecUltLCo[0] ;
         A5256RecUltObs = P00KE2_A5256RecUltObs[0] ;
         n5256RecUltObs = P00KE2_n5256RecUltObs[0] ;
         A5115RecAbsFac = P00KE2_A5115RecAbsFac[0] ;
         A5114RecBp15 = P00KE2_A5114RecBp15[0] ;
         A5113RecBp14 = P00KE2_A5113RecBp14[0] ;
         A5112RecBp13 = P00KE2_A5112RecBp13[0] ;
         A5111RecBp12 = P00KE2_A5111RecBp12[0] ;
         A5110RecNumPrg = P00KE2_A5110RecNumPrg[0] ;
         A5109RecNumInt = P00KE2_A5109RecNumInt[0] ;
         A4868RecUsrMod = P00KE2_A4868RecUsrMod[0] ;
         n4868RecUsrMod = P00KE2_n4868RecUsrMod[0] ;
         A4867RecFecMod = P00KE2_A4867RecFecMod[0] ;
         n4867RecFecMod = P00KE2_n4867RecFecMod[0] ;
         A4866RecFecAlt = P00KE2_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P00KE2_n4866RecFecAlt[0] ;
         A4701RecRecep = P00KE2_A4701RecRecep[0] ;
         A4700RecEnvio = P00KE2_A4700RecEnvio[0] ;
         A4654RecNroPar = P00KE2_A4654RecNroPar[0] ;
         n4654RecNroPar = P00KE2_n4654RecNroPar[0] ;
         A4575RecMaqPes = P00KE2_A4575RecMaqPes[0] ;
         A4574RecFecPes = P00KE2_A4574RecFecPes[0] ;
         A4402RecUsrCod = P00KE2_A4402RecUsrCod[0] ;
         A4298RecRecLan = P00KE2_A4298RecRecLan[0] ;
         n4298RecRecLan = P00KE2_n4298RecRecLan[0] ;
         A4281RecAgrEst = P00KE2_A4281RecAgrEst[0] ;
         n4281RecAgrEst = P00KE2_n4281RecAgrEst[0] ;
         A4268RecOrdLin = P00KE2_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P00KE2_n4268RecOrdLin[0] ;
         A4264RecBarPar = P00KE2_A4264RecBarPar[0] ;
         n4264RecBarPar = P00KE2_n4264RecBarPar[0] ;
         A4263RecBarReo = P00KE2_A4263RecBarReo[0] ;
         n4263RecBarReo = P00KE2_n4263RecBarReo[0] ;
         A4262RecBarCod = P00KE2_A4262RecBarCod[0] ;
         n4262RecBarCod = P00KE2_n4262RecBarCod[0] ;
         A4261RecTotPrd = P00KE2_A4261RecTotPrd[0] ;
         n4261RecTotPrd = P00KE2_n4261RecTotPrd[0] ;
         A4260RecTotMts = P00KE2_A4260RecTotMts[0] ;
         n4260RecTotMts = P00KE2_n4260RecTotMts[0] ;
         A4259RecTotKgs = P00KE2_A4259RecTotKgs[0] ;
         A4258RecMaqFas = P00KE2_A4258RecMaqFas[0] ;
         n4258RecMaqFas = P00KE2_n4258RecMaqFas[0] ;
         A2804RecLinMaq = P00KE2_A2804RecLinMaq[0] ;
         A130BarCodPar = P00KE2_A130BarCodPar[0] ;
         A132BarCodReo = P00KE2_A132BarCodReo[0] ;
         A129BarCod = P00KE2_A129BarCod[0] ;
         A396EmprCod = P00KE2_A396EmprCod[0] ;
         A1273RecLinPro = P00KE2_A1273RecLinPro[0] ;
         A180BarMaqCod = P00KE2_A180BarMaqCod[0] ;
         A236BarVolMaq = P00KE2_A236BarVolMaq[0] ;
         A8353RecMaqObs = P00KE2_A8353RecMaqObs[0] ;
         A12902Rsedo14 = P00KE2_A12902Rsedo14[0] ;
         A12901Rsedo13 = P00KE2_A12901Rsedo13[0] ;
         A12900Rsedo12 = P00KE2_A12900Rsedo12[0] ;
         A12274Rsedo11 = P00KE2_A12274Rsedo11[0] ;
         A12273Rsedo10 = P00KE2_A12273Rsedo10[0] ;
         A12272Rsedo9 = P00KE2_A12272Rsedo9[0] ;
         A12271Rsedo8 = P00KE2_A12271Rsedo8[0] ;
         A12270Rsedo7 = P00KE2_A12270Rsedo7[0] ;
         A12129RecAi = P00KE2_A12129RecAi[0] ;
         n12129RecAi = P00KE2_n12129RecAi[0] ;
         A12128RecAs = P00KE2_A12128RecAs[0] ;
         n12128RecAs = P00KE2_n12128RecAs[0] ;
         A11507RecAva = P00KE2_A11507RecAva[0] ;
         n11507RecAva = P00KE2_n11507RecAva[0] ;
         A10385RecCAut = P00KE2_A10385RecCAut[0] ;
         A10129Rsedo6 = P00KE2_A10129Rsedo6[0] ;
         A10128Rsedo5 = P00KE2_A10128Rsedo5[0] ;
         A10127Rsedo4 = P00KE2_A10127Rsedo4[0] ;
         A10126Rsedo3 = P00KE2_A10126Rsedo3[0] ;
         A10125Rsedo2 = P00KE2_A10125Rsedo2[0] ;
         A10124Rsedo1 = P00KE2_A10124Rsedo1[0] ;
         A9998RecAnc = P00KE2_A9998RecAnc[0] ;
         n9998RecAnc = P00KE2_n9998RecAnc[0] ;
         A9997Recgrm = P00KE2_A9997Recgrm[0] ;
         n9997Recgrm = P00KE2_n9997Recgrm[0] ;
         A9996RecObsq = P00KE2_A9996RecObsq[0] ;
         n9996RecObsq = P00KE2_n9996RecObsq[0] ;
         A9812RecHdrLts = P00KE2_A9812RecHdrLts[0] ;
         n9812RecHdrLts = P00KE2_n9812RecHdrLts[0] ;
         A9811RecAbs2 = P00KE2_A9811RecAbs2[0] ;
         n9811RecAbs2 = P00KE2_n9811RecAbs2[0] ;
         A9765RecLtsDf = P00KE2_A9765RecLtsDf[0] ;
         n9765RecLtsDf = P00KE2_n9765RecLtsDf[0] ;
         A9764RecLtsSR = P00KE2_A9764RecLtsSR[0] ;
         n9764RecLtsSR = P00KE2_n9764RecLtsSR[0] ;
         A8367RecPriAca = P00KE2_A8367RecPriAca[0] ;
         n8367RecPriAca = P00KE2_n8367RecPriAca[0] ;
         A7774RecMaqPML = P00KE2_A7774RecMaqPML[0] ;
         A7773RecMaqDel = P00KE2_A7773RecMaqDel[0] ;
         A7772RecMaqTej = P00KE2_A7772RecMaqTej[0] ;
         A7771RecMaqCla = P00KE2_A7771RecMaqCla[0] ;
         A7770RecMaqTor = P00KE2_A7770RecMaqTor[0] ;
         A7769RecMaqMol = P00KE2_A7769RecMaqMol[0] ;
         A7768RecMaqRPM = P00KE2_A7768RecMaqRPM[0] ;
         A7767RecMaqFlow = P00KE2_A7767RecMaqFlow[0] ;
         A7766RecMaqBL = P00KE2_A7766RecMaqBL[0] ;
         A7765RecMaqVX = P00KE2_A7765RecMaqVX[0] ;
         A7764RecMaqNh = P00KE2_A7764RecMaqNh[0] ;
         A6270RecPrg3 = P00KE2_A6270RecPrg3[0] ;
         A6269RecPrg2 = P00KE2_A6269RecPrg2[0] ;
         A6039RecAcab = P00KE2_A6039RecAcab[0] ;
         n6039RecAcab = P00KE2_n6039RecAcab[0] ;
         A5431RecPriPla = P00KE2_A5431RecPriPla[0] ;
         n5431RecPriPla = P00KE2_n5431RecPriPla[0] ;
         A5430RecFecPla = P00KE2_A5430RecFecPla[0] ;
         n5430RecFecPla = P00KE2_n5430RecFecPla[0] ;
         A5413RecMatCol = P00KE2_A5413RecMatCol[0] ;
         n5413RecMatCol = P00KE2_n5413RecMatCol[0] ;
         A5412RecIntCol = P00KE2_A5412RecIntCol[0] ;
         n5412RecIntCol = P00KE2_n5412RecIntCol[0] ;
         A5407RecUltLCo = P00KE2_A5407RecUltLCo[0] ;
         n5407RecUltLCo = P00KE2_n5407RecUltLCo[0] ;
         A5256RecUltObs = P00KE2_A5256RecUltObs[0] ;
         n5256RecUltObs = P00KE2_n5256RecUltObs[0] ;
         A5115RecAbsFac = P00KE2_A5115RecAbsFac[0] ;
         A5114RecBp15 = P00KE2_A5114RecBp15[0] ;
         A5113RecBp14 = P00KE2_A5113RecBp14[0] ;
         A5112RecBp13 = P00KE2_A5112RecBp13[0] ;
         A5111RecBp12 = P00KE2_A5111RecBp12[0] ;
         A5110RecNumPrg = P00KE2_A5110RecNumPrg[0] ;
         A5109RecNumInt = P00KE2_A5109RecNumInt[0] ;
         A4868RecUsrMod = P00KE2_A4868RecUsrMod[0] ;
         n4868RecUsrMod = P00KE2_n4868RecUsrMod[0] ;
         A4867RecFecMod = P00KE2_A4867RecFecMod[0] ;
         n4867RecFecMod = P00KE2_n4867RecFecMod[0] ;
         A4866RecFecAlt = P00KE2_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P00KE2_n4866RecFecAlt[0] ;
         A4701RecRecep = P00KE2_A4701RecRecep[0] ;
         A4700RecEnvio = P00KE2_A4700RecEnvio[0] ;
         A4654RecNroPar = P00KE2_A4654RecNroPar[0] ;
         n4654RecNroPar = P00KE2_n4654RecNroPar[0] ;
         A4575RecMaqPes = P00KE2_A4575RecMaqPes[0] ;
         A4574RecFecPes = P00KE2_A4574RecFecPes[0] ;
         A4402RecUsrCod = P00KE2_A4402RecUsrCod[0] ;
         A4298RecRecLan = P00KE2_A4298RecRecLan[0] ;
         n4298RecRecLan = P00KE2_n4298RecRecLan[0] ;
         A4281RecAgrEst = P00KE2_A4281RecAgrEst[0] ;
         n4281RecAgrEst = P00KE2_n4281RecAgrEst[0] ;
         A4268RecOrdLin = P00KE2_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P00KE2_n4268RecOrdLin[0] ;
         A4264RecBarPar = P00KE2_A4264RecBarPar[0] ;
         n4264RecBarPar = P00KE2_n4264RecBarPar[0] ;
         A4263RecBarReo = P00KE2_A4263RecBarReo[0] ;
         n4263RecBarReo = P00KE2_n4263RecBarReo[0] ;
         A4262RecBarCod = P00KE2_A4262RecBarCod[0] ;
         n4262RecBarCod = P00KE2_n4262RecBarCod[0] ;
         A4261RecTotPrd = P00KE2_A4261RecTotPrd[0] ;
         n4261RecTotPrd = P00KE2_n4261RecTotPrd[0] ;
         A4260RecTotMts = P00KE2_A4260RecTotMts[0] ;
         n4260RecTotMts = P00KE2_n4260RecTotMts[0] ;
         A4259RecTotKgs = P00KE2_A4259RecTotKgs[0] ;
         A4258RecMaqFas = P00KE2_A4258RecMaqFas[0] ;
         n4258RecMaqFas = P00KE2_n4258RecMaqFas[0] ;
         /*
            INSERT RECORD ON TABLE TXPRECMAQ

         */
         W602MaqCod = A602MaqCod ;
         W2805RecVolPrd = A2805RecVolPrd ;
         W2806RecFA = A2806RecFA ;
         W1272UltLinPro = A1272UltLinPro ;
         A602MaqCod = A180BarMaqCod ;
         A2805RecVolPrd = A236BarVolMaq ;
         A2806RecFA = DecimalUtil.doubleToDec(0) ;
         A1272UltLinPro = AV8UltLinPro ;
         /* Using cursor P00KE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), A602MaqCod, Integer.valueOf(A2805RecVolPrd), A2806RecFA, Byte.valueOf(A1272UltLinPro), Boolean.valueOf(n4258RecMaqFas), A4258RecMaqFas, A4259RecTotKgs, Boolean.valueOf(n4260RecTotMts), A4260RecTotMts, Boolean.valueOf(n4261RecTotPrd), Integer.valueOf(A4261RecTotPrd), Boolean.valueOf(n4262RecBarCod), Integer.valueOf(A4262RecBarCod), Boolean.valueOf(n4263RecBarReo), Byte.valueOf(A4263RecBarReo), Boolean.valueOf(n4264RecBarPar), A4264RecBarPar, Boolean.valueOf(n4268RecOrdLin), Short.valueOf(A4268RecOrdLin), Boolean.valueOf(n4281RecAgrEst), A4281RecAgrEst, Boolean.valueOf(n4298RecRecLan), A4298RecRecLan, A4402RecUsrCod, A4574RecFecPes, Byte.valueOf(A4575RecMaqPes), Boolean.valueOf(n4654RecNroPar), Integer.valueOf(A4654RecNroPar), Byte.valueOf(A4700RecEnvio), Byte.valueOf(A4701RecRecep), Boolean.valueOf(n4866RecFecAlt), A4866RecFecAlt, Boolean.valueOf(n4867RecFecMod), A4867RecFecMod, Boolean.valueOf(n4868RecUsrMod), A4868RecUsrMod, Integer.valueOf(A5109RecNumInt), A5110RecNumPrg, Short.valueOf(A5111RecBp12), Short.valueOf(A5112RecBp13), Short.valueOf(A5113RecBp14), Short.valueOf(A5114RecBp15), A5115RecAbsFac, Boolean.valueOf(n5256RecUltObs), Short.valueOf(A5256RecUltObs), Boolean.valueOf(n5407RecUltLCo), Short.valueOf(A5407RecUltLCo), Boolean.valueOf(n5412RecIntCol), Byte.valueOf(A5412RecIntCol), Boolean.valueOf(n5413RecMatCol), Short.valueOf(A5413RecMatCol), Boolean.valueOf(n5430RecFecPla), A5430RecFecPla, Boolean.valueOf(n5431RecPriPla), Byte.valueOf(A5431RecPriPla), Boolean.valueOf(n6039RecAcab), A6039RecAcab, A6269RecPrg2, A6270RecPrg3, Short.valueOf(A7764RecMaqNh), Byte.valueOf(A7765RecMaqVX), Byte.valueOf(A7766RecMaqBL), Byte.valueOf(A7767RecMaqFlow), Short.valueOf(A7768RecMaqRPM), Short.valueOf(A7769RecMaqMol), Short.valueOf(A7770RecMaqTor), A7771RecMaqCla, Byte.valueOf(A7772RecMaqTej), Byte.valueOf(A7773RecMaqDel), Short.valueOf(A7774RecMaqPML), A8353RecMaqObs, Boolean.valueOf(n8367RecPriAca), Short.valueOf(A8367RecPriAca), Boolean.valueOf(n9764RecLtsSR), Integer.valueOf(A9764RecLtsSR), Boolean.valueOf(n9765RecLtsDf), Integer.valueOf(A9765RecLtsDf), Boolean.valueOf(n9811RecAbs2), A9811RecAbs2, Boolean.valueOf(n9812RecHdrLts), A9812RecHdrLts, Boolean.valueOf(n9996RecObsq), A9996RecObsq, Boolean.valueOf(n9997Recgrm), Short.valueOf(A9997Recgrm), Boolean.valueOf(n9998RecAnc), Short.valueOf(A9998RecAnc), A10124Rsedo1, A10125Rsedo2, Short.valueOf(A10126Rsedo3), A10127Rsedo4, Byte.valueOf(A10128Rsedo5), Byte.valueOf(A10129Rsedo6), Byte.valueOf(A10385RecCAut), Boolean.valueOf(n11507RecAva), A11507RecAva, Boolean.valueOf(n12128RecAs), A12128RecAs, Boolean.valueOf(n12129RecAi), A12129RecAi, A12270Rsedo7, A12271Rsedo8, Short.valueOf(A12272Rsedo9), Short.valueOf(A12273Rsedo10), Short.valueOf(A12274Rsedo11), Short.valueOf(A12900Rsedo12), Short.valueOf(A12901Rsedo13), Integer.valueOf(A12902Rsedo14)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A602MaqCod = W602MaqCod ;
         A2805RecVolPrd = W2805RecVolPrd ;
         A2806RecFA = W2806RecFA ;
         A1272UltLinPro = W1272UltLinPro ;
         /* End Insert */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(precmaq.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aprecmaq");
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
      P00KE2_A8353RecMaqObs = new String[] {""} ;
      P00KE2_A180BarMaqCod = new String[] {""} ;
      P00KE2_A236BarVolMaq = new int[1] ;
      P00KE2_A12902Rsedo14 = new int[1] ;
      P00KE2_A12901Rsedo13 = new short[1] ;
      P00KE2_A12900Rsedo12 = new short[1] ;
      P00KE2_A12274Rsedo11 = new short[1] ;
      P00KE2_A12273Rsedo10 = new short[1] ;
      P00KE2_A12272Rsedo9 = new short[1] ;
      P00KE2_A12271Rsedo8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KE2_A12270Rsedo7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KE2_A12129RecAi = new String[] {""} ;
      P00KE2_n12129RecAi = new boolean[] {false} ;
      P00KE2_A12128RecAs = new String[] {""} ;
      P00KE2_n12128RecAs = new boolean[] {false} ;
      P00KE2_A11507RecAva = new String[] {""} ;
      P00KE2_n11507RecAva = new boolean[] {false} ;
      P00KE2_A10385RecCAut = new byte[1] ;
      P00KE2_A10129Rsedo6 = new byte[1] ;
      P00KE2_A10128Rsedo5 = new byte[1] ;
      P00KE2_A10127Rsedo4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KE2_A10126Rsedo3 = new short[1] ;
      P00KE2_A10125Rsedo2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KE2_A10124Rsedo1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KE2_A9998RecAnc = new short[1] ;
      P00KE2_n9998RecAnc = new boolean[] {false} ;
      P00KE2_A9997Recgrm = new short[1] ;
      P00KE2_n9997Recgrm = new boolean[] {false} ;
      P00KE2_A9996RecObsq = new String[] {""} ;
      P00KE2_n9996RecObsq = new boolean[] {false} ;
      P00KE2_A9812RecHdrLts = new String[] {""} ;
      P00KE2_n9812RecHdrLts = new boolean[] {false} ;
      P00KE2_A9811RecAbs2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KE2_n9811RecAbs2 = new boolean[] {false} ;
      P00KE2_A9765RecLtsDf = new int[1] ;
      P00KE2_n9765RecLtsDf = new boolean[] {false} ;
      P00KE2_A9764RecLtsSR = new int[1] ;
      P00KE2_n9764RecLtsSR = new boolean[] {false} ;
      P00KE2_A8367RecPriAca = new short[1] ;
      P00KE2_n8367RecPriAca = new boolean[] {false} ;
      P00KE2_A7774RecMaqPML = new short[1] ;
      P00KE2_A7773RecMaqDel = new byte[1] ;
      P00KE2_A7772RecMaqTej = new byte[1] ;
      P00KE2_A7771RecMaqCla = new String[] {""} ;
      P00KE2_A7770RecMaqTor = new short[1] ;
      P00KE2_A7769RecMaqMol = new short[1] ;
      P00KE2_A7768RecMaqRPM = new short[1] ;
      P00KE2_A7767RecMaqFlow = new byte[1] ;
      P00KE2_A7766RecMaqBL = new byte[1] ;
      P00KE2_A7765RecMaqVX = new byte[1] ;
      P00KE2_A7764RecMaqNh = new short[1] ;
      P00KE2_A6270RecPrg3 = new String[] {""} ;
      P00KE2_A6269RecPrg2 = new String[] {""} ;
      P00KE2_A6039RecAcab = new String[] {""} ;
      P00KE2_n6039RecAcab = new boolean[] {false} ;
      P00KE2_A5431RecPriPla = new byte[1] ;
      P00KE2_n5431RecPriPla = new boolean[] {false} ;
      P00KE2_A5430RecFecPla = new java.util.Date[] {GXutil.nullDate()} ;
      P00KE2_n5430RecFecPla = new boolean[] {false} ;
      P00KE2_A5413RecMatCol = new short[1] ;
      P00KE2_n5413RecMatCol = new boolean[] {false} ;
      P00KE2_A5412RecIntCol = new byte[1] ;
      P00KE2_n5412RecIntCol = new boolean[] {false} ;
      P00KE2_A5407RecUltLCo = new short[1] ;
      P00KE2_n5407RecUltLCo = new boolean[] {false} ;
      P00KE2_A5256RecUltObs = new short[1] ;
      P00KE2_n5256RecUltObs = new boolean[] {false} ;
      P00KE2_A5115RecAbsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KE2_A5114RecBp15 = new short[1] ;
      P00KE2_A5113RecBp14 = new short[1] ;
      P00KE2_A5112RecBp13 = new short[1] ;
      P00KE2_A5111RecBp12 = new short[1] ;
      P00KE2_A5110RecNumPrg = new String[] {""} ;
      P00KE2_A5109RecNumInt = new int[1] ;
      P00KE2_A4868RecUsrMod = new String[] {""} ;
      P00KE2_n4868RecUsrMod = new boolean[] {false} ;
      P00KE2_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P00KE2_n4867RecFecMod = new boolean[] {false} ;
      P00KE2_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P00KE2_n4866RecFecAlt = new boolean[] {false} ;
      P00KE2_A4701RecRecep = new byte[1] ;
      P00KE2_A4700RecEnvio = new byte[1] ;
      P00KE2_A4654RecNroPar = new int[1] ;
      P00KE2_n4654RecNroPar = new boolean[] {false} ;
      P00KE2_A4575RecMaqPes = new byte[1] ;
      P00KE2_A4574RecFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      P00KE2_A4402RecUsrCod = new String[] {""} ;
      P00KE2_A4298RecRecLan = new String[] {""} ;
      P00KE2_n4298RecRecLan = new boolean[] {false} ;
      P00KE2_A4281RecAgrEst = new String[] {""} ;
      P00KE2_n4281RecAgrEst = new boolean[] {false} ;
      P00KE2_A4268RecOrdLin = new short[1] ;
      P00KE2_n4268RecOrdLin = new boolean[] {false} ;
      P00KE2_A4264RecBarPar = new String[] {""} ;
      P00KE2_n4264RecBarPar = new boolean[] {false} ;
      P00KE2_A4263RecBarReo = new byte[1] ;
      P00KE2_n4263RecBarReo = new boolean[] {false} ;
      P00KE2_A4262RecBarCod = new int[1] ;
      P00KE2_n4262RecBarCod = new boolean[] {false} ;
      P00KE2_A4261RecTotPrd = new int[1] ;
      P00KE2_n4261RecTotPrd = new boolean[] {false} ;
      P00KE2_A4260RecTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KE2_n4260RecTotMts = new boolean[] {false} ;
      P00KE2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00KE2_A4258RecMaqFas = new String[] {""} ;
      P00KE2_n4258RecMaqFas = new boolean[] {false} ;
      P00KE2_A2804RecLinMaq = new short[1] ;
      P00KE2_A130BarCodPar = new String[] {""} ;
      P00KE2_A132BarCodReo = new byte[1] ;
      P00KE2_A129BarCod = new int[1] ;
      P00KE2_A396EmprCod = new String[] {""} ;
      P00KE2_A1273RecLinPro = new byte[1] ;
      A8353RecMaqObs = "" ;
      A180BarMaqCod = "" ;
      A12271Rsedo8 = DecimalUtil.ZERO ;
      A12270Rsedo7 = DecimalUtil.ZERO ;
      A12129RecAi = "" ;
      A12128RecAs = "" ;
      A11507RecAva = "" ;
      A10127Rsedo4 = DecimalUtil.ZERO ;
      A10125Rsedo2 = DecimalUtil.ZERO ;
      A10124Rsedo1 = DecimalUtil.ZERO ;
      A9996RecObsq = "" ;
      A9812RecHdrLts = "" ;
      A9811RecAbs2 = DecimalUtil.ZERO ;
      A7771RecMaqCla = "" ;
      A6270RecPrg3 = "" ;
      A6269RecPrg2 = "" ;
      A6039RecAcab = "" ;
      A5430RecFecPla = GXutil.nullDate() ;
      A5115RecAbsFac = DecimalUtil.ZERO ;
      A5110RecNumPrg = "" ;
      A4868RecUsrMod = "" ;
      A4867RecFecMod = GXutil.resetTime( GXutil.nullDate() );
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4574RecFecPes = GXutil.resetTime( GXutil.nullDate() );
      A4402RecUsrCod = "" ;
      A4298RecRecLan = "" ;
      A4281RecAgrEst = "" ;
      A4264RecBarPar = "" ;
      A4260RecTotMts = DecimalUtil.ZERO ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4258RecMaqFas = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      W602MaqCod = "" ;
      A602MaqCod = "" ;
      W2806RecFA = DecimalUtil.ZERO ;
      A2806RecFA = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aprecmaq__default(),
         new Object[] {
             new Object[] {
            P00KE2_A8353RecMaqObs, P00KE2_A180BarMaqCod, P00KE2_A236BarVolMaq, P00KE2_A12902Rsedo14, P00KE2_A12901Rsedo13, P00KE2_A12900Rsedo12, P00KE2_A12274Rsedo11, P00KE2_A12273Rsedo10, P00KE2_A12272Rsedo9, P00KE2_A12271Rsedo8,
            P00KE2_A12270Rsedo7, P00KE2_A12129RecAi, P00KE2_n12129RecAi, P00KE2_A12128RecAs, P00KE2_n12128RecAs, P00KE2_A11507RecAva, P00KE2_n11507RecAva, P00KE2_A10385RecCAut, P00KE2_A10129Rsedo6, P00KE2_A10128Rsedo5,
            P00KE2_A10127Rsedo4, P00KE2_A10126Rsedo3, P00KE2_A10125Rsedo2, P00KE2_A10124Rsedo1, P00KE2_A9998RecAnc, P00KE2_n9998RecAnc, P00KE2_A9997Recgrm, P00KE2_n9997Recgrm, P00KE2_A9996RecObsq, P00KE2_n9996RecObsq,
            P00KE2_A9812RecHdrLts, P00KE2_n9812RecHdrLts, P00KE2_A9811RecAbs2, P00KE2_n9811RecAbs2, P00KE2_A9765RecLtsDf, P00KE2_n9765RecLtsDf, P00KE2_A9764RecLtsSR, P00KE2_n9764RecLtsSR, P00KE2_A8367RecPriAca, P00KE2_n8367RecPriAca,
            P00KE2_A7774RecMaqPML, P00KE2_A7773RecMaqDel, P00KE2_A7772RecMaqTej, P00KE2_A7771RecMaqCla, P00KE2_A7770RecMaqTor, P00KE2_A7769RecMaqMol, P00KE2_A7768RecMaqRPM, P00KE2_A7767RecMaqFlow, P00KE2_A7766RecMaqBL, P00KE2_A7765RecMaqVX,
            P00KE2_A7764RecMaqNh, P00KE2_A6270RecPrg3, P00KE2_A6269RecPrg2, P00KE2_A6039RecAcab, P00KE2_n6039RecAcab, P00KE2_A5431RecPriPla, P00KE2_n5431RecPriPla, P00KE2_A5430RecFecPla, P00KE2_n5430RecFecPla, P00KE2_A5413RecMatCol,
            P00KE2_n5413RecMatCol, P00KE2_A5412RecIntCol, P00KE2_n5412RecIntCol, P00KE2_A5407RecUltLCo, P00KE2_n5407RecUltLCo, P00KE2_A5256RecUltObs, P00KE2_n5256RecUltObs, P00KE2_A5115RecAbsFac, P00KE2_A5114RecBp15, P00KE2_A5113RecBp14,
            P00KE2_A5112RecBp13, P00KE2_A5111RecBp12, P00KE2_A5110RecNumPrg, P00KE2_A5109RecNumInt, P00KE2_A4868RecUsrMod, P00KE2_n4868RecUsrMod, P00KE2_A4867RecFecMod, P00KE2_n4867RecFecMod, P00KE2_A4866RecFecAlt, P00KE2_n4866RecFecAlt,
            P00KE2_A4701RecRecep, P00KE2_A4700RecEnvio, P00KE2_A4654RecNroPar, P00KE2_n4654RecNroPar, P00KE2_A4575RecMaqPes, P00KE2_A4574RecFecPes, P00KE2_A4402RecUsrCod, P00KE2_A4298RecRecLan, P00KE2_n4298RecRecLan, P00KE2_A4281RecAgrEst,
            P00KE2_n4281RecAgrEst, P00KE2_A4268RecOrdLin, P00KE2_n4268RecOrdLin, P00KE2_A4264RecBarPar, P00KE2_n4264RecBarPar, P00KE2_A4263RecBarReo, P00KE2_n4263RecBarReo, P00KE2_A4262RecBarCod, P00KE2_n4262RecBarCod, P00KE2_A4261RecTotPrd,
            P00KE2_n4261RecTotPrd, P00KE2_A4260RecTotMts, P00KE2_n4260RecTotMts, P00KE2_A4259RecTotKgs, P00KE2_A4258RecMaqFas, P00KE2_n4258RecMaqFas, P00KE2_A2804RecLinMaq, P00KE2_A130BarCodPar, P00KE2_A132BarCodReo, P00KE2_A129BarCod,
            P00KE2_A396EmprCod, P00KE2_A1273RecLinPro
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10385RecCAut ;
   private byte A10129Rsedo6 ;
   private byte A10128Rsedo5 ;
   private byte A7773RecMaqDel ;
   private byte A7772RecMaqTej ;
   private byte A7767RecMaqFlow ;
   private byte A7766RecMaqBL ;
   private byte A7765RecMaqVX ;
   private byte A5431RecPriPla ;
   private byte A5412RecIntCol ;
   private byte A4701RecRecep ;
   private byte A4700RecEnvio ;
   private byte A4575RecMaqPes ;
   private byte A4263RecBarReo ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte W1272UltLinPro ;
   private byte A1272UltLinPro ;
   private byte AV8UltLinPro ;
   private short A12901Rsedo13 ;
   private short A12900Rsedo12 ;
   private short A12274Rsedo11 ;
   private short A12273Rsedo10 ;
   private short A12272Rsedo9 ;
   private short A10126Rsedo3 ;
   private short A9998RecAnc ;
   private short A9997Recgrm ;
   private short A8367RecPriAca ;
   private short A7774RecMaqPML ;
   private short A7770RecMaqTor ;
   private short A7769RecMaqMol ;
   private short A7768RecMaqRPM ;
   private short A7764RecMaqNh ;
   private short A5413RecMatCol ;
   private short A5407RecUltLCo ;
   private short A5256RecUltObs ;
   private short A5114RecBp15 ;
   private short A5113RecBp14 ;
   private short A5112RecBp13 ;
   private short A5111RecBp12 ;
   private short A4268RecOrdLin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A236BarVolMaq ;
   private int A12902Rsedo14 ;
   private int A9765RecLtsDf ;
   private int A9764RecLtsSR ;
   private int A5109RecNumInt ;
   private int A4654RecNroPar ;
   private int A4262RecBarCod ;
   private int A4261RecTotPrd ;
   private int A129BarCod ;
   private int GX_INS408 ;
   private int W2805RecVolPrd ;
   private int A2805RecVolPrd ;
   private java.math.BigDecimal A12271Rsedo8 ;
   private java.math.BigDecimal A12270Rsedo7 ;
   private java.math.BigDecimal A10127Rsedo4 ;
   private java.math.BigDecimal A10125Rsedo2 ;
   private java.math.BigDecimal A10124Rsedo1 ;
   private java.math.BigDecimal A9811RecAbs2 ;
   private java.math.BigDecimal A5115RecAbsFac ;
   private java.math.BigDecimal A4260RecTotMts ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal W2806RecFA ;
   private java.math.BigDecimal A2806RecFA ;
   private String scmdbuf ;
   private String A180BarMaqCod ;
   private String A12129RecAi ;
   private String A12128RecAs ;
   private String A11507RecAva ;
   private String A9812RecHdrLts ;
   private String A7771RecMaqCla ;
   private String A6270RecPrg3 ;
   private String A6269RecPrg2 ;
   private String A6039RecAcab ;
   private String A5110RecNumPrg ;
   private String A4868RecUsrMod ;
   private String A4402RecUsrCod ;
   private String A4298RecRecLan ;
   private String A4281RecAgrEst ;
   private String A4264RecBarPar ;
   private String A4258RecMaqFas ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String W602MaqCod ;
   private String A602MaqCod ;
   private String Gx_emsg ;
   private java.util.Date A4867RecFecMod ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date A4574RecFecPes ;
   private java.util.Date A5430RecFecPla ;
   private boolean n12129RecAi ;
   private boolean n12128RecAs ;
   private boolean n11507RecAva ;
   private boolean n9998RecAnc ;
   private boolean n9997Recgrm ;
   private boolean n9996RecObsq ;
   private boolean n9812RecHdrLts ;
   private boolean n9811RecAbs2 ;
   private boolean n9765RecLtsDf ;
   private boolean n9764RecLtsSR ;
   private boolean n8367RecPriAca ;
   private boolean n6039RecAcab ;
   private boolean n5431RecPriPla ;
   private boolean n5430RecFecPla ;
   private boolean n5413RecMatCol ;
   private boolean n5412RecIntCol ;
   private boolean n5407RecUltLCo ;
   private boolean n5256RecUltObs ;
   private boolean n4868RecUsrMod ;
   private boolean n4867RecFecMod ;
   private boolean n4866RecFecAlt ;
   private boolean n4654RecNroPar ;
   private boolean n4298RecRecLan ;
   private boolean n4281RecAgrEst ;
   private boolean n4268RecOrdLin ;
   private boolean n4264RecBarPar ;
   private boolean n4263RecBarReo ;
   private boolean n4262RecBarCod ;
   private boolean n4261RecTotPrd ;
   private boolean n4260RecTotMts ;
   private boolean n4258RecMaqFas ;
   private String A8353RecMaqObs ;
   private String A9996RecObsq ;
   private IDataStoreProvider pr_default ;
   private String[] P00KE2_A8353RecMaqObs ;
   private String[] P00KE2_A180BarMaqCod ;
   private int[] P00KE2_A236BarVolMaq ;
   private int[] P00KE2_A12902Rsedo14 ;
   private short[] P00KE2_A12901Rsedo13 ;
   private short[] P00KE2_A12900Rsedo12 ;
   private short[] P00KE2_A12274Rsedo11 ;
   private short[] P00KE2_A12273Rsedo10 ;
   private short[] P00KE2_A12272Rsedo9 ;
   private java.math.BigDecimal[] P00KE2_A12271Rsedo8 ;
   private java.math.BigDecimal[] P00KE2_A12270Rsedo7 ;
   private String[] P00KE2_A12129RecAi ;
   private boolean[] P00KE2_n12129RecAi ;
   private String[] P00KE2_A12128RecAs ;
   private boolean[] P00KE2_n12128RecAs ;
   private String[] P00KE2_A11507RecAva ;
   private boolean[] P00KE2_n11507RecAva ;
   private byte[] P00KE2_A10385RecCAut ;
   private byte[] P00KE2_A10129Rsedo6 ;
   private byte[] P00KE2_A10128Rsedo5 ;
   private java.math.BigDecimal[] P00KE2_A10127Rsedo4 ;
   private short[] P00KE2_A10126Rsedo3 ;
   private java.math.BigDecimal[] P00KE2_A10125Rsedo2 ;
   private java.math.BigDecimal[] P00KE2_A10124Rsedo1 ;
   private short[] P00KE2_A9998RecAnc ;
   private boolean[] P00KE2_n9998RecAnc ;
   private short[] P00KE2_A9997Recgrm ;
   private boolean[] P00KE2_n9997Recgrm ;
   private String[] P00KE2_A9996RecObsq ;
   private boolean[] P00KE2_n9996RecObsq ;
   private String[] P00KE2_A9812RecHdrLts ;
   private boolean[] P00KE2_n9812RecHdrLts ;
   private java.math.BigDecimal[] P00KE2_A9811RecAbs2 ;
   private boolean[] P00KE2_n9811RecAbs2 ;
   private int[] P00KE2_A9765RecLtsDf ;
   private boolean[] P00KE2_n9765RecLtsDf ;
   private int[] P00KE2_A9764RecLtsSR ;
   private boolean[] P00KE2_n9764RecLtsSR ;
   private short[] P00KE2_A8367RecPriAca ;
   private boolean[] P00KE2_n8367RecPriAca ;
   private short[] P00KE2_A7774RecMaqPML ;
   private byte[] P00KE2_A7773RecMaqDel ;
   private byte[] P00KE2_A7772RecMaqTej ;
   private String[] P00KE2_A7771RecMaqCla ;
   private short[] P00KE2_A7770RecMaqTor ;
   private short[] P00KE2_A7769RecMaqMol ;
   private short[] P00KE2_A7768RecMaqRPM ;
   private byte[] P00KE2_A7767RecMaqFlow ;
   private byte[] P00KE2_A7766RecMaqBL ;
   private byte[] P00KE2_A7765RecMaqVX ;
   private short[] P00KE2_A7764RecMaqNh ;
   private String[] P00KE2_A6270RecPrg3 ;
   private String[] P00KE2_A6269RecPrg2 ;
   private String[] P00KE2_A6039RecAcab ;
   private boolean[] P00KE2_n6039RecAcab ;
   private byte[] P00KE2_A5431RecPriPla ;
   private boolean[] P00KE2_n5431RecPriPla ;
   private java.util.Date[] P00KE2_A5430RecFecPla ;
   private boolean[] P00KE2_n5430RecFecPla ;
   private short[] P00KE2_A5413RecMatCol ;
   private boolean[] P00KE2_n5413RecMatCol ;
   private byte[] P00KE2_A5412RecIntCol ;
   private boolean[] P00KE2_n5412RecIntCol ;
   private short[] P00KE2_A5407RecUltLCo ;
   private boolean[] P00KE2_n5407RecUltLCo ;
   private short[] P00KE2_A5256RecUltObs ;
   private boolean[] P00KE2_n5256RecUltObs ;
   private java.math.BigDecimal[] P00KE2_A5115RecAbsFac ;
   private short[] P00KE2_A5114RecBp15 ;
   private short[] P00KE2_A5113RecBp14 ;
   private short[] P00KE2_A5112RecBp13 ;
   private short[] P00KE2_A5111RecBp12 ;
   private String[] P00KE2_A5110RecNumPrg ;
   private int[] P00KE2_A5109RecNumInt ;
   private String[] P00KE2_A4868RecUsrMod ;
   private boolean[] P00KE2_n4868RecUsrMod ;
   private java.util.Date[] P00KE2_A4867RecFecMod ;
   private boolean[] P00KE2_n4867RecFecMod ;
   private java.util.Date[] P00KE2_A4866RecFecAlt ;
   private boolean[] P00KE2_n4866RecFecAlt ;
   private byte[] P00KE2_A4701RecRecep ;
   private byte[] P00KE2_A4700RecEnvio ;
   private int[] P00KE2_A4654RecNroPar ;
   private boolean[] P00KE2_n4654RecNroPar ;
   private byte[] P00KE2_A4575RecMaqPes ;
   private java.util.Date[] P00KE2_A4574RecFecPes ;
   private String[] P00KE2_A4402RecUsrCod ;
   private String[] P00KE2_A4298RecRecLan ;
   private boolean[] P00KE2_n4298RecRecLan ;
   private String[] P00KE2_A4281RecAgrEst ;
   private boolean[] P00KE2_n4281RecAgrEst ;
   private short[] P00KE2_A4268RecOrdLin ;
   private boolean[] P00KE2_n4268RecOrdLin ;
   private String[] P00KE2_A4264RecBarPar ;
   private boolean[] P00KE2_n4264RecBarPar ;
   private byte[] P00KE2_A4263RecBarReo ;
   private boolean[] P00KE2_n4263RecBarReo ;
   private int[] P00KE2_A4262RecBarCod ;
   private boolean[] P00KE2_n4262RecBarCod ;
   private int[] P00KE2_A4261RecTotPrd ;
   private boolean[] P00KE2_n4261RecTotPrd ;
   private java.math.BigDecimal[] P00KE2_A4260RecTotMts ;
   private boolean[] P00KE2_n4260RecTotMts ;
   private java.math.BigDecimal[] P00KE2_A4259RecTotKgs ;
   private String[] P00KE2_A4258RecMaqFas ;
   private boolean[] P00KE2_n4258RecMaqFas ;
   private short[] P00KE2_A2804RecLinMaq ;
   private String[] P00KE2_A130BarCodPar ;
   private byte[] P00KE2_A132BarCodReo ;
   private int[] P00KE2_A129BarCod ;
   private String[] P00KE2_A396EmprCod ;
   private byte[] P00KE2_A1273RecLinPro ;
}

final  class aprecmaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00KE2", "SELECT T3.RecMaqObs, T2.BarMaqCod, T2.BarVolMaq, T3.Rsedo14, T3.Rsedo13, T3.Rsedo12, T3.Rsedo11, T3.Rsedo10, T3.Rsedo9, T3.Rsedo8, T3.Rsedo7, T3.RecAi, T3.RecAs, T3.RecAva, T3.RecCAut, T3.Rsedo6, T3.Rsedo5, T3.Rsedo4, T3.Rsedo3, T3.Rsedo2, T3.Rsedo1, T3.RecAnc, T3.Recgrm, T3.RecObsq, T3.RecHdrLts, T3.RecAbs2, T3.RecLtsDf, T3.RecLtsSR, T3.RecPriAca, T3.RecMaqPML, T3.RecMaqDel, T3.RecMaqTej, T3.RecMaqCla, T3.RecMaqTor, T3.RecMaqMol, T3.RecMaqRPM, T3.RecMaqFlow, T3.RecMaqBL, T3.RecMaqVX, T3.RecMaqNh, T3.RecPrg3, T3.RecPrg2, T3.RecAcab, T3.RecPriPla, T3.RecFecPla, T3.RecMatCol, T3.RecIntCol, T3.RecUltLCo, T3.RecUltObs, T3.RecAbsFac, T3.RecBp15, T3.RecBp14, T3.RecBp13, T3.RecBp12, T3.RecNumPrg, T3.RecNumInt, T3.RecUsrMod, T3.RecFecMod, T3.RecFecAlt, T3.RecRecep, T3.RecEnvio, T3.RecNroPar, T3.RecMaqPes, T3.RecFecPes, T3.RecUsrCod, T3.RecRecLan, T3.RecAgrEst, T3.RecOrdLin, T3.RecBarPar, T3.RecBarReo, T3.RecBarCod, T3.RecTotPrd, T3.RecTotMts, T3.RecTotKgs, T3.RecMaqFas, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.RecLinPro FROM ((TXPCRECET T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN TXPRECMAQ T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00KE3", "INSERT INTO TXPRECMAQ(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, MaqCod, RecVolPrd, RecFA, UltLinPro, RecMaqFas, RecTotKgs, RecTotMts, RecTotPrd, RecBarCod, RecBarReo, RecBarPar, RecOrdLin, RecAgrEst, RecRecLan, RecUsrCod, RecFecPes, RecMaqPes, RecNroPar, RecEnvio, RecRecep, RecFecAlt, RecFecMod, RecUsrMod, RecNumInt, RecNumPrg, RecBp12, RecBp13, RecBp14, RecBp15, RecAbsFac, RecUltObs, RecUltLCo, RecIntCol, RecMatCol, RecFecPla, RecPriPla, RecAcab, RecPrg2, RecPrg3, RecMaqNh, RecMaqVX, RecMaqBL, RecMaqFlow, RecMaqRPM, RecMaqMol, RecMaqTor, RecMaqCla, RecMaqTej, RecMaqDel, RecMaqPML, RecMaqObs, RecPriAca, RecLtsSR, RecLtsDf, RecAbs2, RecHdrLts, RecObsq, Recgrm, RecAnc, Rsedo1, Rsedo2, Rsedo3, Rsedo4, Rsedo5, Rsedo6, RecCAut, RecAva, RecAs, RecAi, Rsedo7, Rsedo8, Rsedo9, Rsedo10, Rsedo11, Rsedo12, Rsedo13, Rsedo14) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,1);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,1);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((byte[]) buf[18])[0] = rslt.getByte(16);
               ((byte[]) buf[19])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((short[]) buf[21])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,1);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(21,1);
               ((short[]) buf[24])[0] = rslt.getShort(22);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(23);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(25, 12);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(27);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(28);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(29);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(30);
               ((byte[]) buf[41])[0] = rslt.getByte(31);
               ((byte[]) buf[42])[0] = rslt.getByte(32);
               ((String[]) buf[43])[0] = rslt.getString(33, 10);
               ((short[]) buf[44])[0] = rslt.getShort(34);
               ((short[]) buf[45])[0] = rslt.getShort(35);
               ((short[]) buf[46])[0] = rslt.getShort(36);
               ((byte[]) buf[47])[0] = rslt.getByte(37);
               ((byte[]) buf[48])[0] = rslt.getByte(38);
               ((byte[]) buf[49])[0] = rslt.getByte(39);
               ((short[]) buf[50])[0] = rslt.getShort(40);
               ((String[]) buf[51])[0] = rslt.getString(41, 6);
               ((String[]) buf[52])[0] = rslt.getString(42, 6);
               ((String[]) buf[53])[0] = rslt.getString(43, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(44);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[57])[0] = rslt.getGXDate(45);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(46);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((byte[]) buf[61])[0] = rslt.getByte(47);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(48);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(49);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(50,2);
               ((short[]) buf[68])[0] = rslt.getShort(51);
               ((short[]) buf[69])[0] = rslt.getShort(52);
               ((short[]) buf[70])[0] = rslt.getShort(53);
               ((short[]) buf[71])[0] = rslt.getShort(54);
               ((String[]) buf[72])[0] = rslt.getString(55, 6);
               ((int[]) buf[73])[0] = rslt.getInt(56);
               ((String[]) buf[74])[0] = rslt.getString(57, 8);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[76])[0] = rslt.getGXDateTime(58);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[78])[0] = rslt.getGXDateTime(59);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((byte[]) buf[80])[0] = rslt.getByte(60);
               ((byte[]) buf[81])[0] = rslt.getByte(61);
               ((int[]) buf[82])[0] = rslt.getInt(62);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((byte[]) buf[84])[0] = rslt.getByte(63);
               ((java.util.Date[]) buf[85])[0] = rslt.getGXDateTime(64);
               ((String[]) buf[86])[0] = rslt.getString(65, 8);
               ((String[]) buf[87])[0] = rslt.getString(66, 1);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(67, 1);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((short[]) buf[91])[0] = rslt.getShort(68);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(69, 1);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((byte[]) buf[95])[0] = rslt.getByte(70);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((int[]) buf[97])[0] = rslt.getInt(71);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((int[]) buf[99])[0] = rslt.getInt(72);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[101])[0] = rslt.getBigDecimal(73,2);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[103])[0] = rslt.getBigDecimal(74,2);
               ((String[]) buf[104])[0] = rslt.getString(75, 8);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((short[]) buf[106])[0] = rslt.getShort(76);
               ((String[]) buf[107])[0] = rslt.getString(77, 1);
               ((byte[]) buf[108])[0] = rslt.getByte(78);
               ((int[]) buf[109])[0] = rslt.getInt(79);
               ((String[]) buf[110])[0] = rslt.getString(80, 3);
               ((byte[]) buf[111])[0] = rslt.getByte(81);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[10], 8);
               }
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[27], 1);
               }
               stmt.setString(20, (String)parms[28], 8);
               stmt.setDateTime(21, (java.util.Date)parms[29], false);
               stmt.setByte(22, ((Number) parms[30]).byteValue());
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[32]).intValue());
               }
               stmt.setByte(24, ((Number) parms[33]).byteValue());
               stmt.setByte(25, ((Number) parms[34]).byteValue());
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(26, (java.util.Date)parms[36], false);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(27, (java.util.Date)parms[38], false);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[40], 8);
               }
               stmt.setInt(29, ((Number) parms[41]).intValue());
               stmt.setString(30, (String)parms[42], 6);
               stmt.setShort(31, ((Number) parms[43]).shortValue());
               stmt.setShort(32, ((Number) parms[44]).shortValue());
               stmt.setShort(33, ((Number) parms[45]).shortValue());
               stmt.setShort(34, ((Number) parms[46]).shortValue());
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[47], 2);
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[49]).shortValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(38, ((Number) parms[53]).byteValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(39, ((Number) parms[55]).shortValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DATE );
               }
               else
               {
                  stmt.setDate(40, (java.util.Date)parms[57]);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(41, ((Number) parms[59]).byteValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[61], 1);
               }
               stmt.setString(43, (String)parms[62], 6);
               stmt.setString(44, (String)parms[63], 6);
               stmt.setShort(45, ((Number) parms[64]).shortValue());
               stmt.setByte(46, ((Number) parms[65]).byteValue());
               stmt.setByte(47, ((Number) parms[66]).byteValue());
               stmt.setByte(48, ((Number) parms[67]).byteValue());
               stmt.setShort(49, ((Number) parms[68]).shortValue());
               stmt.setShort(50, ((Number) parms[69]).shortValue());
               stmt.setShort(51, ((Number) parms[70]).shortValue());
               stmt.setString(52, (String)parms[71], 10);
               stmt.setByte(53, ((Number) parms[72]).byteValue());
               stmt.setByte(54, ((Number) parms[73]).byteValue());
               stmt.setShort(55, ((Number) parms[74]).shortValue());
               stmt.setLongVarchar(56, (String)parms[75], false);
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(57, ((Number) parms[77]).shortValue());
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(58, ((Number) parms[79]).intValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(59, ((Number) parms[81]).intValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(60, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[85], 12);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(62, (String)parms[87], 800);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(63, ((Number) parms[89]).shortValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(64, ((Number) parms[91]).shortValue());
               }
               stmt.setBigDecimal(65, (java.math.BigDecimal)parms[92], 1);
               stmt.setBigDecimal(66, (java.math.BigDecimal)parms[93], 1);
               stmt.setShort(67, ((Number) parms[94]).shortValue());
               stmt.setBigDecimal(68, (java.math.BigDecimal)parms[95], 2);
               stmt.setByte(69, ((Number) parms[96]).byteValue());
               stmt.setByte(70, ((Number) parms[97]).byteValue());
               stmt.setByte(71, ((Number) parms[98]).byteValue());
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(72, (String)parms[100], 4);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[102], 3);
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[104], 3);
               }
               stmt.setBigDecimal(75, (java.math.BigDecimal)parms[105], 1);
               stmt.setBigDecimal(76, (java.math.BigDecimal)parms[106], 1);
               stmt.setShort(77, ((Number) parms[107]).shortValue());
               stmt.setShort(78, ((Number) parms[108]).shortValue());
               stmt.setShort(79, ((Number) parms[109]).shortValue());
               stmt.setShort(80, ((Number) parms[110]).shortValue());
               stmt.setShort(81, ((Number) parms[111]).shortValue());
               stmt.setInt(82, ((Number) parms[112]).intValue());
               return;
      }
   }

}

