package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdvproduc extends GXProcedure
{
   public pdvproduc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdvproduc.class ), "" );
   }

   public pdvproduc( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pdvproduc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pdvproduc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdvproduc.this.AV9Prdnum = aP1[0];
      this.aP1 = aP1;
      pdvproduc.this.Gx_mode = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DLT", "")) != 0 )
      {
         /* Using cursor P04XM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV9Prdnum});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A696PrdConDia = P04XM2_A696PrdConDia[0] ;
            A719PrdNum = P04XM2_A719PrdNum[0] ;
            A718PrdNom = P04XM2_A718PrdNom[0] ;
            A795PrvNum = P04XM2_A795PrvNum[0] ;
            A724PrdPreAct = P04XM2_A724PrdPreAct[0] ;
            A698PrdDetPar = P04XM2_A698PrdDetPar[0] ;
            A856ValCod = P04XM2_A856ValCod[0] ;
            A713PrdFulEnt = P04XM2_A713PrdFulEnt[0] ;
            A726PrdPreMed = P04XM2_A726PrdPreMed[0] ;
            A727PrdRec = P04XM2_A727PrdRec[0] ;
            A725PrdPreAnt = P04XM2_A725PrdPreAnt[0] ;
            A709PrdFecPre = P04XM2_A709PrdFecPre[0] ;
            A707PrdFacCon = P04XM2_A707PrdFacCon[0] ;
            A732PrdStkMinU = P04XM2_A732PrdStkMinU[0] ;
            A731PrdStkMinD = P04XM2_A731PrdStkMinD[0] ;
            A722PrdPlaEnt = P04XM2_A722PrdPlaEnt[0] ;
            A629MetCod = P04XM2_A629MetCod[0] ;
            n629MetCod = P04XM2_n629MetCod[0] ;
            A716PrdLotMin = P04XM2_A716PrdLotMin[0] ;
            A721PrdNumUco = P04XM2_A721PrdNumUco[0] ;
            A714PrdFulPed = P04XM2_A714PrdFulPed[0] ;
            A712PrdFulCC = P04XM2_A712PrdFulCC[0] ;
            A695PrdConCC = P04XM2_A695PrdConCC[0] ;
            A703PrdDscTec = P04XM2_A703PrdDscTec[0] ;
            A742PrdUniCom = P04XM2_A742PrdUniCom[0] ;
            A743PrdUniCon = P04XM2_A743PrdUniCon[0] ;
            A728PrdRefPrv = P04XM2_A728PrdRefPrv[0] ;
            A734PrdSus = P04XM2_A734PrdSus[0] ;
            n734PrdSus = P04XM2_n734PrdSus[0] ;
            A682PrdCalNec = P04XM2_A682PrdCalNec[0] ;
            A730PrdSit = P04XM2_A730PrdSit[0] ;
            A835TipDtoCod = P04XM2_A835TipDtoCod[0] ;
            n835TipDtoCod = P04XM2_n835TipDtoCod[0] ;
            A708PrdFecEnt = P04XM2_A708PrdFecEnt[0] ;
            A1193PrdPosX = P04XM2_A1193PrdPosX[0] ;
            A1194PrdPosY = P04XM2_A1194PrdPosY[0] ;
            A1643PrdTip = P04XM2_A1643PrdTip[0] ;
            A1644PrdDqo = P04XM2_A1644PrdDqo[0] ;
            A3004PrdRev = P04XM2_A3004PrdRev[0] ;
            A3273PrdTnq = P04XM2_A3273PrdTnq[0] ;
            A4338PrdUMeFo = P04XM2_A4338PrdUMeFo[0] ;
            A4692PrdNom2 = P04XM2_A4692PrdNom2[0] ;
            A4693PrdNum2 = P04XM2_A4693PrdNum2[0] ;
            A4694PrdObs = P04XM2_A4694PrdObs[0] ;
            A5255PrdPreAc2 = P04XM2_A5255PrdPreAc2[0] ;
            A5416PrdDensS = P04XM2_A5416PrdDensS[0] ;
            A5417PrdConcS = P04XM2_A5417PrdConcS[0] ;
            A5418PrdSalM = P04XM2_A5418PrdSalM[0] ;
            A5590PrdSolub = P04XM2_A5590PrdSolub[0] ;
            A6191PrdNumCent = P04XM2_A6191PrdNumCent[0] ;
            A6301TipPrdCod = P04XM2_A6301TipPrdCod[0] ;
            n6301TipPrdCod = P04XM2_n6301TipPrdCod[0] ;
            A7226PrdNumct1 = P04XM2_A7226PrdNumct1[0] ;
            A7227PrdNumct2 = P04XM2_A7227PrdNumct2[0] ;
            A7260PrdHorMad = P04XM2_A7260PrdHorMad[0] ;
            A7763PrdPreRef = P04XM2_A7763PrdPreRef[0] ;
            n7763PrdPreRef = P04XM2_n7763PrdPreRef[0] ;
            A8647Mat_Lts = P04XM2_A8647Mat_Lts[0] ;
            n8647Mat_Lts = P04XM2_n8647Mat_Lts[0] ;
            A8895PrdAltAct = P04XM2_A8895PrdAltAct[0] ;
            n8895PrdAltAct = P04XM2_n8895PrdAltAct[0] ;
            A8896PrdPesCon = P04XM2_A8896PrdPesCon[0] ;
            A8897PrdPesTerm = P04XM2_A8897PrdPesTerm[0] ;
            A8936PrdSal = P04XM2_A8936PrdSal[0] ;
            A9609SubFamCod = P04XM2_A9609SubFamCod[0] ;
            n9609SubFamCod = P04XM2_n9609SubFamCod[0] ;
            A9731PrdInc = P04XM2_A9731PrdInc[0] ;
            A9732PrdComp = P04XM2_A9732PrdComp[0] ;
            A9733PrdAox = P04XM2_A9733PrdAox[0] ;
            A9734PrdNCAS = P04XM2_A9734PrdNCAS[0] ;
            A9739PrdFT = P04XM2_A9739PrdFT[0] ;
            A9740PrdFFT = P04XM2_A9740PrdFFT[0] ;
            A9741PrdHS = P04XM2_A9741PrdHS[0] ;
            A9742PrdFHS = P04XM2_A9742PrdFHS[0] ;
            A5887PrdReach = P04XM2_A5887PrdReach[0] ;
            A5888PrdOkotex = P04XM2_A5888PrdOkotex[0] ;
            A10119PrdColIdx = P04XM2_A10119PrdColIdx[0] ;
            A10881PrdLote = P04XM2_A10881PrdLote[0] ;
            A10935PrdRTM = P04XM2_A10935PrdRTM[0] ;
            A10936PrdCtw1 = P04XM2_A10936PrdCtw1[0] ;
            A10937PrdCtw2 = P04XM2_A10937PrdCtw2[0] ;
            A10938PrdCtw3 = P04XM2_A10938PrdCtw3[0] ;
            A11196PrdNroCAS = P04XM2_A11196PrdNroCAS[0] ;
            A11363PrdGots = P04XM2_A11363PrdGots[0] ;
            A11364PrdHm = P04XM2_A11364PrdHm[0] ;
            A11470PrdConct = P04XM2_A11470PrdConct[0] ;
            A11614PrdEINECS = P04XM2_A11614PrdEINECS[0] ;
            A11615PrdFuncion = P04XM2_A11615PrdFuncion[0] ;
            A11616PrdNmQu = P04XM2_A11616PrdNmQu[0] ;
            A3936PrdEqLP = P04XM2_A3936PrdEqLP[0] ;
            A3937PrdConc = P04XM2_A3937PrdConc[0] ;
            n3937PrdConc = P04XM2_n3937PrdConc[0] ;
            A11663PrdCtw4 = P04XM2_A11663PrdCtw4[0] ;
            A11687PrdList = P04XM2_A11687PrdList[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE LVNDVPRODUC

            */
            W396EmprCod = A396EmprCod ;
            A11935DVPrdNum = A719PrdNum ;
            A12003DVPrdNom = A718PrdNom ;
            n12003DVPrdNom = false ;
            A12004DVPrvNum = A795PrvNum ;
            n12004DVPrvNum = false ;
            A12005DVPrdExiAl = DecimalUtil.doubleToDec(0) ;
            n12005DVPrdExiAl = false ;
            A12006DVPrdPreAc = A724PrdPreAct ;
            n12006DVPrdPreAc = false ;
            A12007DVUltLinEn = (short)(0) ;
            n12007DVUltLinEn = false ;
            A12008DVPrdDetPa = A698PrdDetPar ;
            n12008DVPrdDetPa = false ;
            A12009DVValCod = A856ValCod ;
            n12009DVValCod = false ;
            A12010DVPrdFulEn = A713PrdFulEnt ;
            n12010DVPrdFulEn = false ;
            A12011DVPrdCanPe = DecimalUtil.doubleToDec(0) ;
            n12011DVPrdCanPe = false ;
            A12012DVPrdRotRe = DecimalUtil.doubleToDec(0) ;
            n12012DVPrdRotRe = false ;
            A12013DVPrdPreMe = A726PrdPreMed ;
            n12013DVPrdPreMe = false ;
            A12014DVPrdRec = A727PrdRec ;
            n12014DVPrdRec = false ;
            A12015DVPrdPreAn = A725PrdPreAnt ;
            n12015DVPrdPreAn = false ;
            A12016DVPrdFecPr = A709PrdFecPre ;
            n12016DVPrdFecPr = false ;
            A12017DVMovEspUL = (short)(0) ;
            n12017DVMovEspUL = false ;
            A12018DVPrdExiCC = DecimalUtil.doubleToDec(0) ;
            n12018DVPrdExiCC = false ;
            A12019DVPrdUltDC = DecimalUtil.doubleToDec(0) ;
            n12019DVPrdUltDC = false ;
            A12020DVPrdUltEC = DecimalUtil.doubleToDec(0) ;
            n12020DVPrdUltEC = false ;
            A12021DVPrdUltCC = (short)(0) ;
            n12021DVPrdUltCC = false ;
            A12022DVPrdExiCP = DecimalUtil.doubleToDec(0) ;
            n12022DVPrdExiCP = false ;
            A12023DVPrdDifCC = DecimalUtil.doubleToDec(0) ;
            n12023DVPrdDifCC = false ;
            A12024DVPrdFacCo = A707PrdFacCon ;
            n12024DVPrdFacCo = false ;
            A12025DVPrdConDi = DecimalUtil.doubleToDec(0) ;
            n12025DVPrdConDi = false ;
            A12026DVPrdStkMi = A732PrdStkMinU ;
            n12026DVPrdStkMi = false ;
            A12027DVPrdStkMD = A731PrdStkMinD ;
            n12027DVPrdStkMD = false ;
            A12028DVPrdDiaRo = (short)(0) ;
            n12028DVPrdDiaRo = false ;
            A12029DVPrdPlaEn = A722PrdPlaEnt ;
            n12029DVPrdPlaEn = false ;
            A12030DVMetCod = A629MetCod ;
            n12030DVMetCod = false ;
            A12031DVPrdLotMi = A716PrdLotMin ;
            n12031DVPrdLotMi = false ;
            A12032DVPrdNumUc = A721PrdNumUco ;
            n12032DVPrdNumUc = false ;
            A12033DVPrdCanRe = DecimalUtil.doubleToDec(0) ;
            n12033DVPrdCanRe = false ;
            A12034DVPrdFulPe = A714PrdFulPed ;
            n12034DVPrdFulPe = false ;
            A12035DVPrdFulCC = A712PrdFulCC ;
            n12035DVPrdFulCC = false ;
            A12036DVPrdConCC = A695PrdConCC ;
            n12036DVPrdConCC = false ;
            A12037DVPrdDscTe = A703PrdDscTec ;
            n12037DVPrdDscTe = false ;
            A12038DVPrdUniCo = A742PrdUniCom ;
            n12038DVPrdUniCo = false ;
            A12039DVPrdUniCn = A743PrdUniCon ;
            n12039DVPrdUniCn = false ;
            A12040DVPrdRefPr = A728PrdRefPrv ;
            n12040DVPrdRefPr = false ;
            A12041DVPrdSus = A734PrdSus ;
            n12041DVPrdSus = false ;
            A12042DVPrdCalNe = A682PrdCalNec ;
            n12042DVPrdCalNe = false ;
            A12043DVPrdSit = A730PrdSit ;
            n12043DVPrdSit = false ;
            A12044DVTipDtoCo = A835TipDtoCod ;
            n12044DVTipDtoCo = false ;
            A12045DVPrdValSt = DecimalUtil.doubleToDec(0) ;
            n12045DVPrdValSt = false ;
            A12046DVDifValSt = DecimalUtil.doubleToDec(0) ;
            n12046DVDifValSt = false ;
            A12047DVPrdFecEn = A708PrdFecEnt ;
            n12047DVPrdFecEn = false ;
            A12048DVPrdPosX = A1193PrdPosX ;
            n12048DVPrdPosX = false ;
            A12049DVPrdPosY = A1194PrdPosY ;
            n12049DVPrdPosY = false ;
            A12050DVPrdTip = A1643PrdTip ;
            n12050DVPrdTip = false ;
            A12051DVPrdDqo = A1644PrdDqo ;
            n12051DVPrdDqo = false ;
            A12052DVPrdRev = A3004PrdRev ;
            n12052DVPrdRev = false ;
            A12053DVPrdTnq = A3273PrdTnq ;
            n12053DVPrdTnq = false ;
            A12054DVCCStKULi = 0 ;
            n12054DVCCStKULi = false ;
            A12055DVPrdUMeFo = A4338PrdUMeFo ;
            n12055DVPrdUMeFo = false ;
            A12056DVPrdNom2 = A4692PrdNom2 ;
            n12056DVPrdNom2 = false ;
            A12057DVPrdNum2 = A4693PrdNum2 ;
            n12057DVPrdNum2 = false ;
            A12058DVPrdObs = A4694PrdObs ;
            n12058DVPrdObs = false ;
            A12059DVPrdPreA2 = A5255PrdPreAc2 ;
            n12059DVPrdPreA2 = false ;
            A12060DVPrdDensS = A5416PrdDensS ;
            n12060DVPrdDensS = false ;
            A12061DVPrdConcS = A5417PrdConcS ;
            n12061DVPrdConcS = false ;
            A12062DVPrdSalM = A5418PrdSalM ;
            n12062DVPrdSalM = false ;
            A12063DVPrdSolub = A5590PrdSolub ;
            n12063DVPrdSolub = false ;
            A12064DVPrdNumCe = A6191PrdNumCent ;
            n12064DVPrdNumCe = false ;
            A12065DVTipPrdCo = A6301TipPrdCod ;
            n12065DVTipPrdCo = false ;
            A12066DVPrdNumct = A7226PrdNumct1 ;
            n12066DVPrdNumct = false ;
            A12067DVPrdNumc2 = A7227PrdNumct2 ;
            n12067DVPrdNumc2 = false ;
            A12068DVPrdHorMa = A7260PrdHorMad ;
            n12068DVPrdHorMa = false ;
            A12069DVPrdPreRe = A7763PrdPreRef ;
            n12069DVPrdPreRe = false ;
            A12070DVMat_Lts = A8647Mat_Lts ;
            n12070DVMat_Lts = false ;
            A12071DVPrdExiAc = DecimalUtil.doubleToDec(0) ;
            n12071DVPrdExiAc = false ;
            A12072DVAlmc_Ult = 0 ;
            n12072DVAlmc_Ult = false ;
            A12073DVPrdAltAc = A8895PrdAltAct ;
            n12073DVPrdAltAc = false ;
            A12074DVPrdPesCo = A8896PrdPesCon ;
            n12074DVPrdPesCo = false ;
            A12075DVPrdPesTe = A8897PrdPesTerm ;
            n12075DVPrdPesTe = false ;
            A12076DVCC_Ultln = 0 ;
            n12076DVCC_Ultln = false ;
            A12077DVPrdSal = A8936PrdSal ;
            n12077DVPrdSal = false ;
            A12078DVSubFamCo = A9609SubFamCod ;
            n12078DVSubFamCo = false ;
            A12079DVPrdInc = A9731PrdInc ;
            n12079DVPrdInc = false ;
            A12080DVPrdComp = A9732PrdComp ;
            n12080DVPrdComp = false ;
            A12081DVPrdAox = A9733PrdAox ;
            n12081DVPrdAox = false ;
            A12082DVPrdNCAS = A9734PrdNCAS ;
            n12082DVPrdNCAS = false ;
            A12083DVPrdFT = A9739PrdFT ;
            n12083DVPrdFT = false ;
            A12084DVPrdFFT = A9740PrdFFT ;
            n12084DVPrdFFT = false ;
            A12085DVPrdHS = A9741PrdHS ;
            n12085DVPrdHS = false ;
            A12086DVPrdFHS = A9742PrdFHS ;
            n12086DVPrdFHS = false ;
            A12087DVPrdReach = A5887PrdReach ;
            n12087DVPrdReach = false ;
            A12088DVPrdOkote = A5888PrdOkotex ;
            n12088DVPrdOkote = false ;
            A12089DVPrdColId = A10119PrdColIdx ;
            n12089DVPrdColId = false ;
            A12090DVPrdLote = A10881PrdLote ;
            n12090DVPrdLote = false ;
            A12091DVPrdRTM = A10935PrdRTM ;
            n12091DVPrdRTM = false ;
            A12092DVPrdCtw1 = A10936PrdCtw1 ;
            n12092DVPrdCtw1 = false ;
            A12093DVPrdCtw2 = A10937PrdCtw2 ;
            n12093DVPrdCtw2 = false ;
            A12094DVPrdCtw3 = A10938PrdCtw3 ;
            n12094DVPrdCtw3 = false ;
            A12095DVPrdNroCA = A11196PrdNroCAS ;
            n12095DVPrdNroCA = false ;
            A12096DVPrdGots = A11363PrdGots ;
            n12096DVPrdGots = false ;
            A12097DVPrdHm = A11364PrdHm ;
            n12097DVPrdHm = false ;
            A12098DVPrdConct = A11470PrdConct ;
            n12098DVPrdConct = false ;
            A12099DVPrdEINEC = A11614PrdEINECS ;
            n12099DVPrdEINEC = false ;
            A12100DVPrdFunci = A11615PrdFuncion ;
            n12100DVPrdFunci = false ;
            A12101DVPrdNmQu = A11616PrdNmQu ;
            n12101DVPrdNmQu = false ;
            A12102DVPrdEqLP = A3936PrdEqLP ;
            n12102DVPrdEqLP = false ;
            A12103DVPrdConc = A3937PrdConc ;
            n12103DVPrdConc = false ;
            A12104DVPrdCtw4 = A11663PrdCtw4 ;
            n12104DVPrdCtw4 = false ;
            A12105DVPrdList = A11687PrdList ;
            n12105DVPrdList = false ;
            /* Using cursor P04XM3 */
            pr_default.execute(1, new Object[] {A396EmprCod, A11935DVPrdNum, Boolean.valueOf(n12003DVPrdNom), A12003DVPrdNom, Boolean.valueOf(n12004DVPrvNum), Integer.valueOf(A12004DVPrvNum), Boolean.valueOf(n12005DVPrdExiAl), A12005DVPrdExiAl, Boolean.valueOf(n12006DVPrdPreAc), A12006DVPrdPreAc, Boolean.valueOf(n12007DVUltLinEn), Short.valueOf(A12007DVUltLinEn), Boolean.valueOf(n12008DVPrdDetPa), A12008DVPrdDetPa, Boolean.valueOf(n12009DVValCod), Byte.valueOf(A12009DVValCod), Boolean.valueOf(n12010DVPrdFulEn), A12010DVPrdFulEn, Boolean.valueOf(n12011DVPrdCanPe), A12011DVPrdCanPe, Boolean.valueOf(n12012DVPrdRotRe), A12012DVPrdRotRe, Boolean.valueOf(n12013DVPrdPreMe), A12013DVPrdPreMe, Boolean.valueOf(n12014DVPrdRec), A12014DVPrdRec, Boolean.valueOf(n12015DVPrdPreAn), A12015DVPrdPreAn, Boolean.valueOf(n12016DVPrdFecPr), A12016DVPrdFecPr, Boolean.valueOf(n12017DVMovEspUL), Short.valueOf(A12017DVMovEspUL), Boolean.valueOf(n12018DVPrdExiCC), A12018DVPrdExiCC, Boolean.valueOf(n12019DVPrdUltDC), A12019DVPrdUltDC, Boolean.valueOf(n12020DVPrdUltEC), A12020DVPrdUltEC, Boolean.valueOf(n12021DVPrdUltCC), Short.valueOf(A12021DVPrdUltCC), Boolean.valueOf(n12022DVPrdExiCP), A12022DVPrdExiCP, Boolean.valueOf(n12023DVPrdDifCC), A12023DVPrdDifCC, Boolean.valueOf(n12024DVPrdFacCo), A12024DVPrdFacCo, Boolean.valueOf(n12025DVPrdConDi), A12025DVPrdConDi, Boolean.valueOf(n12026DVPrdStkMi), A12026DVPrdStkMi, Boolean.valueOf(n12027DVPrdStkMD), Short.valueOf(A12027DVPrdStkMD), Boolean.valueOf(n12028DVPrdDiaRo), Short.valueOf(A12028DVPrdDiaRo), Boolean.valueOf(n12029DVPrdPlaEn), Short.valueOf(A12029DVPrdPlaEn), Boolean.valueOf(n12030DVMetCod), Byte.valueOf(A12030DVMetCod), Boolean.valueOf(n12031DVPrdLotMi), Short.valueOf(A12031DVPrdLotMi), Boolean.valueOf(n12032DVPrdNumUc), A12032DVPrdNumUc, Boolean.valueOf(n12033DVPrdCanRe), A12033DVPrdCanRe, Boolean.valueOf(n12034DVPrdFulPe), A12034DVPrdFulPe, Boolean.valueOf(n12035DVPrdFulCC), A12035DVPrdFulCC, Boolean.valueOf(n12036DVPrdConCC), Short.valueOf(A12036DVPrdConCC), Boolean.valueOf(n12037DVPrdDscTe), A12037DVPrdDscTe, Boolean.valueOf(n12038DVPrdUniCo), Byte.valueOf(A12038DVPrdUniCo), Boolean.valueOf(n12039DVPrdUniCn), Byte.valueOf(A12039DVPrdUniCn), Boolean.valueOf(n12040DVPrdRefPr), A12040DVPrdRefPr, Boolean.valueOf(n12041DVPrdSus), A12041DVPrdSus, Boolean.valueOf(n12042DVPrdCalNe), A12042DVPrdCalNe, Boolean.valueOf(n12043DVPrdSit), Byte.valueOf(A12043DVPrdSit), Boolean.valueOf(n12044DVTipDtoCo), Byte.valueOf(A12044DVTipDtoCo), Boolean.valueOf(n12045DVPrdValSt), A12045DVPrdValSt, Boolean.valueOf(n12046DVDifValSt), A12046DVDifValSt, Boolean.valueOf(n12047DVPrdFecEn), A12047DVPrdFecEn, Boolean.valueOf(n12048DVPrdPosX), Short.valueOf(A12048DVPrdPosX), Boolean.valueOf(n12049DVPrdPosY), Short.valueOf(A12049DVPrdPosY), Boolean.valueOf(n12050DVPrdTip), A12050DVPrdTip, Boolean.valueOf(n12051DVPrdDqo), Short.valueOf(A12051DVPrdDqo), Boolean.valueOf(n12052DVPrdRev), A12052DVPrdRev, Boolean.valueOf(n12053DVPrdTnq), Byte.valueOf(A12053DVPrdTnq), Boolean.valueOf(n12054DVCCStKULi), Long.valueOf(A12054DVCCStKULi), Boolean.valueOf(n12055DVPrdUMeFo), Byte.valueOf(A12055DVPrdUMeFo), Boolean.valueOf(n12056DVPrdNom2), A12056DVPrdNom2, Boolean.valueOf(n12057DVPrdNum2), A12057DVPrdNum2, Boolean.valueOf(n12058DVPrdObs), A12058DVPrdObs, Boolean.valueOf(n12059DVPrdPreA2), A12059DVPrdPreA2, Boolean.valueOf(n12060DVPrdDensS), A12060DVPrdDensS, Boolean.valueOf(n12061DVPrdConcS), A12061DVPrdConcS, Boolean.valueOf(n12062DVPrdSalM), A12062DVPrdSalM,
            Boolean.valueOf(n12063DVPrdSolub), A12063DVPrdSolub, Boolean.valueOf(n12064DVPrdNumCe), A12064DVPrdNumCe, Boolean.valueOf(n12065DVTipPrdCo), Short.valueOf(A12065DVTipPrdCo), Boolean.valueOf(n12066DVPrdNumct), A12066DVPrdNumct, Boolean.valueOf(n12067DVPrdNumc2), A12067DVPrdNumc2, Boolean.valueOf(n12068DVPrdHorMa), Byte.valueOf(A12068DVPrdHorMa), Boolean.valueOf(n12069DVPrdPreRe), A12069DVPrdPreRe, Boolean.valueOf(n12070DVMat_Lts), A12070DVMat_Lts, Boolean.valueOf(n12071DVPrdExiAc), A12071DVPrdExiAc, Boolean.valueOf(n12072DVAlmc_Ult), Integer.valueOf(A12072DVAlmc_Ult), Boolean.valueOf(n12073DVPrdAltAc), Byte.valueOf(A12073DVPrdAltAc), Boolean.valueOf(n12074DVPrdPesCo), Byte.valueOf(A12074DVPrdPesCo), Boolean.valueOf(n12075DVPrdPesTe), A12075DVPrdPesTe, Boolean.valueOf(n12076DVCC_Ultln), Long.valueOf(A12076DVCC_Ultln), Boolean.valueOf(n12077DVPrdSal), A12077DVPrdSal, Boolean.valueOf(n12078DVSubFamCo), Byte.valueOf(A12078DVSubFamCo), Boolean.valueOf(n12079DVPrdInc), A12079DVPrdInc, Boolean.valueOf(n12080DVPrdComp), A12080DVPrdComp, Boolean.valueOf(n12081DVPrdAox), A12081DVPrdAox, Boolean.valueOf(n12082DVPrdNCAS), A12082DVPrdNCAS, Boolean.valueOf(n12083DVPrdFT), A12083DVPrdFT, Boolean.valueOf(n12084DVPrdFFT), A12084DVPrdFFT, Boolean.valueOf(n12085DVPrdHS), A12085DVPrdHS, Boolean.valueOf(n12086DVPrdFHS), A12086DVPrdFHS, Boolean.valueOf(n12087DVPrdReach), A12087DVPrdReach, Boolean.valueOf(n12088DVPrdOkote), A12088DVPrdOkote, Boolean.valueOf(n12089DVPrdColId), A12089DVPrdColId, Boolean.valueOf(n12090DVPrdLote), A12090DVPrdLote, Boolean.valueOf(n12091DVPrdRTM), A12091DVPrdRTM, Boolean.valueOf(n12092DVPrdCtw1), A12092DVPrdCtw1, Boolean.valueOf(n12093DVPrdCtw2), A12093DVPrdCtw2, Boolean.valueOf(n12094DVPrdCtw3), A12094DVPrdCtw3, Boolean.valueOf(n12095DVPrdNroCA), A12095DVPrdNroCA, Boolean.valueOf(n12096DVPrdGots), A12096DVPrdGots, Boolean.valueOf(n12097DVPrdHm), A12097DVPrdHm, Boolean.valueOf(n12098DVPrdConct), Short.valueOf(A12098DVPrdConct), Boolean.valueOf(n12099DVPrdEINEC), A12099DVPrdEINEC, Boolean.valueOf(n12100DVPrdFunci), A12100DVPrdFunci, Boolean.valueOf(n12101DVPrdNmQu), A12101DVPrdNmQu, Boolean.valueOf(n12102DVPrdEqLP), A12102DVPrdEqLP, Boolean.valueOf(n12103DVPrdConc), A12103DVPrdConc, Boolean.valueOf(n12104DVPrdCtw4), A12104DVPrdCtw4, Boolean.valueOf(n12105DVPrdList), A12105DVPrdList});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNDVPRODUC");
            if ( (pr_default.getStatus(1) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               /* Using cursor P04XM4 */
               pr_default.execute(2, new Object[] {A396EmprCod, AV9Prdnum});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A12058DVPrdObs = P04XM4_A12058DVPrdObs[0] ;
                  n12058DVPrdObs = P04XM4_n12058DVPrdObs[0] ;
                  A396EmprCod = P04XM4_A396EmprCod[0] ;
                  A11935DVPrdNum = P04XM4_A11935DVPrdNum[0] ;
                  A12003DVPrdNom = P04XM4_A12003DVPrdNom[0] ;
                  n12003DVPrdNom = P04XM4_n12003DVPrdNom[0] ;
                  A12004DVPrvNum = P04XM4_A12004DVPrvNum[0] ;
                  n12004DVPrvNum = P04XM4_n12004DVPrvNum[0] ;
                  A12006DVPrdPreAc = P04XM4_A12006DVPrdPreAc[0] ;
                  n12006DVPrdPreAc = P04XM4_n12006DVPrdPreAc[0] ;
                  A12008DVPrdDetPa = P04XM4_A12008DVPrdDetPa[0] ;
                  n12008DVPrdDetPa = P04XM4_n12008DVPrdDetPa[0] ;
                  A12013DVPrdPreMe = P04XM4_A12013DVPrdPreMe[0] ;
                  n12013DVPrdPreMe = P04XM4_n12013DVPrdPreMe[0] ;
                  A12014DVPrdRec = P04XM4_A12014DVPrdRec[0] ;
                  n12014DVPrdRec = P04XM4_n12014DVPrdRec[0] ;
                  A12015DVPrdPreAn = P04XM4_A12015DVPrdPreAn[0] ;
                  n12015DVPrdPreAn = P04XM4_n12015DVPrdPreAn[0] ;
                  A12016DVPrdFecPr = P04XM4_A12016DVPrdFecPr[0] ;
                  n12016DVPrdFecPr = P04XM4_n12016DVPrdFecPr[0] ;
                  A12024DVPrdFacCo = P04XM4_A12024DVPrdFacCo[0] ;
                  n12024DVPrdFacCo = P04XM4_n12024DVPrdFacCo[0] ;
                  A12025DVPrdConDi = P04XM4_A12025DVPrdConDi[0] ;
                  n12025DVPrdConDi = P04XM4_n12025DVPrdConDi[0] ;
                  A12026DVPrdStkMi = P04XM4_A12026DVPrdStkMi[0] ;
                  n12026DVPrdStkMi = P04XM4_n12026DVPrdStkMi[0] ;
                  A12027DVPrdStkMD = P04XM4_A12027DVPrdStkMD[0] ;
                  n12027DVPrdStkMD = P04XM4_n12027DVPrdStkMD[0] ;
                  A12029DVPrdPlaEn = P04XM4_A12029DVPrdPlaEn[0] ;
                  n12029DVPrdPlaEn = P04XM4_n12029DVPrdPlaEn[0] ;
                  A12030DVMetCod = P04XM4_A12030DVMetCod[0] ;
                  n12030DVMetCod = P04XM4_n12030DVMetCod[0] ;
                  A12031DVPrdLotMi = P04XM4_A12031DVPrdLotMi[0] ;
                  n12031DVPrdLotMi = P04XM4_n12031DVPrdLotMi[0] ;
                  A12032DVPrdNumUc = P04XM4_A12032DVPrdNumUc[0] ;
                  n12032DVPrdNumUc = P04XM4_n12032DVPrdNumUc[0] ;
                  A12034DVPrdFulPe = P04XM4_A12034DVPrdFulPe[0] ;
                  n12034DVPrdFulPe = P04XM4_n12034DVPrdFulPe[0] ;
                  A12035DVPrdFulCC = P04XM4_A12035DVPrdFulCC[0] ;
                  n12035DVPrdFulCC = P04XM4_n12035DVPrdFulCC[0] ;
                  A12036DVPrdConCC = P04XM4_A12036DVPrdConCC[0] ;
                  n12036DVPrdConCC = P04XM4_n12036DVPrdConCC[0] ;
                  A12037DVPrdDscTe = P04XM4_A12037DVPrdDscTe[0] ;
                  n12037DVPrdDscTe = P04XM4_n12037DVPrdDscTe[0] ;
                  A12038DVPrdUniCo = P04XM4_A12038DVPrdUniCo[0] ;
                  n12038DVPrdUniCo = P04XM4_n12038DVPrdUniCo[0] ;
                  A12039DVPrdUniCn = P04XM4_A12039DVPrdUniCn[0] ;
                  n12039DVPrdUniCn = P04XM4_n12039DVPrdUniCn[0] ;
                  A12040DVPrdRefPr = P04XM4_A12040DVPrdRefPr[0] ;
                  n12040DVPrdRefPr = P04XM4_n12040DVPrdRefPr[0] ;
                  A12041DVPrdSus = P04XM4_A12041DVPrdSus[0] ;
                  n12041DVPrdSus = P04XM4_n12041DVPrdSus[0] ;
                  A12042DVPrdCalNe = P04XM4_A12042DVPrdCalNe[0] ;
                  n12042DVPrdCalNe = P04XM4_n12042DVPrdCalNe[0] ;
                  A12043DVPrdSit = P04XM4_A12043DVPrdSit[0] ;
                  n12043DVPrdSit = P04XM4_n12043DVPrdSit[0] ;
                  A12044DVTipDtoCo = P04XM4_A12044DVTipDtoCo[0] ;
                  n12044DVTipDtoCo = P04XM4_n12044DVTipDtoCo[0] ;
                  A12047DVPrdFecEn = P04XM4_A12047DVPrdFecEn[0] ;
                  n12047DVPrdFecEn = P04XM4_n12047DVPrdFecEn[0] ;
                  A12048DVPrdPosX = P04XM4_A12048DVPrdPosX[0] ;
                  n12048DVPrdPosX = P04XM4_n12048DVPrdPosX[0] ;
                  A12049DVPrdPosY = P04XM4_A12049DVPrdPosY[0] ;
                  n12049DVPrdPosY = P04XM4_n12049DVPrdPosY[0] ;
                  A12050DVPrdTip = P04XM4_A12050DVPrdTip[0] ;
                  n12050DVPrdTip = P04XM4_n12050DVPrdTip[0] ;
                  A12051DVPrdDqo = P04XM4_A12051DVPrdDqo[0] ;
                  n12051DVPrdDqo = P04XM4_n12051DVPrdDqo[0] ;
                  A12052DVPrdRev = P04XM4_A12052DVPrdRev[0] ;
                  n12052DVPrdRev = P04XM4_n12052DVPrdRev[0] ;
                  A12053DVPrdTnq = P04XM4_A12053DVPrdTnq[0] ;
                  n12053DVPrdTnq = P04XM4_n12053DVPrdTnq[0] ;
                  A12055DVPrdUMeFo = P04XM4_A12055DVPrdUMeFo[0] ;
                  n12055DVPrdUMeFo = P04XM4_n12055DVPrdUMeFo[0] ;
                  A12056DVPrdNom2 = P04XM4_A12056DVPrdNom2[0] ;
                  n12056DVPrdNom2 = P04XM4_n12056DVPrdNom2[0] ;
                  A12057DVPrdNum2 = P04XM4_A12057DVPrdNum2[0] ;
                  n12057DVPrdNum2 = P04XM4_n12057DVPrdNum2[0] ;
                  A12059DVPrdPreA2 = P04XM4_A12059DVPrdPreA2[0] ;
                  n12059DVPrdPreA2 = P04XM4_n12059DVPrdPreA2[0] ;
                  A12060DVPrdDensS = P04XM4_A12060DVPrdDensS[0] ;
                  n12060DVPrdDensS = P04XM4_n12060DVPrdDensS[0] ;
                  A12061DVPrdConcS = P04XM4_A12061DVPrdConcS[0] ;
                  n12061DVPrdConcS = P04XM4_n12061DVPrdConcS[0] ;
                  A12062DVPrdSalM = P04XM4_A12062DVPrdSalM[0] ;
                  n12062DVPrdSalM = P04XM4_n12062DVPrdSalM[0] ;
                  A12063DVPrdSolub = P04XM4_A12063DVPrdSolub[0] ;
                  n12063DVPrdSolub = P04XM4_n12063DVPrdSolub[0] ;
                  A12064DVPrdNumCe = P04XM4_A12064DVPrdNumCe[0] ;
                  n12064DVPrdNumCe = P04XM4_n12064DVPrdNumCe[0] ;
                  A12065DVTipPrdCo = P04XM4_A12065DVTipPrdCo[0] ;
                  n12065DVTipPrdCo = P04XM4_n12065DVTipPrdCo[0] ;
                  A12066DVPrdNumct = P04XM4_A12066DVPrdNumct[0] ;
                  n12066DVPrdNumct = P04XM4_n12066DVPrdNumct[0] ;
                  A12067DVPrdNumc2 = P04XM4_A12067DVPrdNumc2[0] ;
                  n12067DVPrdNumc2 = P04XM4_n12067DVPrdNumc2[0] ;
                  A12068DVPrdHorMa = P04XM4_A12068DVPrdHorMa[0] ;
                  n12068DVPrdHorMa = P04XM4_n12068DVPrdHorMa[0] ;
                  A12069DVPrdPreRe = P04XM4_A12069DVPrdPreRe[0] ;
                  n12069DVPrdPreRe = P04XM4_n12069DVPrdPreRe[0] ;
                  A12070DVMat_Lts = P04XM4_A12070DVMat_Lts[0] ;
                  n12070DVMat_Lts = P04XM4_n12070DVMat_Lts[0] ;
                  A12073DVPrdAltAc = P04XM4_A12073DVPrdAltAc[0] ;
                  n12073DVPrdAltAc = P04XM4_n12073DVPrdAltAc[0] ;
                  A12074DVPrdPesCo = P04XM4_A12074DVPrdPesCo[0] ;
                  n12074DVPrdPesCo = P04XM4_n12074DVPrdPesCo[0] ;
                  A12075DVPrdPesTe = P04XM4_A12075DVPrdPesTe[0] ;
                  n12075DVPrdPesTe = P04XM4_n12075DVPrdPesTe[0] ;
                  A12077DVPrdSal = P04XM4_A12077DVPrdSal[0] ;
                  n12077DVPrdSal = P04XM4_n12077DVPrdSal[0] ;
                  A12078DVSubFamCo = P04XM4_A12078DVSubFamCo[0] ;
                  n12078DVSubFamCo = P04XM4_n12078DVSubFamCo[0] ;
                  A12079DVPrdInc = P04XM4_A12079DVPrdInc[0] ;
                  n12079DVPrdInc = P04XM4_n12079DVPrdInc[0] ;
                  A12080DVPrdComp = P04XM4_A12080DVPrdComp[0] ;
                  n12080DVPrdComp = P04XM4_n12080DVPrdComp[0] ;
                  A12081DVPrdAox = P04XM4_A12081DVPrdAox[0] ;
                  n12081DVPrdAox = P04XM4_n12081DVPrdAox[0] ;
                  A12082DVPrdNCAS = P04XM4_A12082DVPrdNCAS[0] ;
                  n12082DVPrdNCAS = P04XM4_n12082DVPrdNCAS[0] ;
                  A12083DVPrdFT = P04XM4_A12083DVPrdFT[0] ;
                  n12083DVPrdFT = P04XM4_n12083DVPrdFT[0] ;
                  A12084DVPrdFFT = P04XM4_A12084DVPrdFFT[0] ;
                  n12084DVPrdFFT = P04XM4_n12084DVPrdFFT[0] ;
                  A12085DVPrdHS = P04XM4_A12085DVPrdHS[0] ;
                  n12085DVPrdHS = P04XM4_n12085DVPrdHS[0] ;
                  A12086DVPrdFHS = P04XM4_A12086DVPrdFHS[0] ;
                  n12086DVPrdFHS = P04XM4_n12086DVPrdFHS[0] ;
                  A12087DVPrdReach = P04XM4_A12087DVPrdReach[0] ;
                  n12087DVPrdReach = P04XM4_n12087DVPrdReach[0] ;
                  A12088DVPrdOkote = P04XM4_A12088DVPrdOkote[0] ;
                  n12088DVPrdOkote = P04XM4_n12088DVPrdOkote[0] ;
                  A12089DVPrdColId = P04XM4_A12089DVPrdColId[0] ;
                  n12089DVPrdColId = P04XM4_n12089DVPrdColId[0] ;
                  A12090DVPrdLote = P04XM4_A12090DVPrdLote[0] ;
                  n12090DVPrdLote = P04XM4_n12090DVPrdLote[0] ;
                  A12091DVPrdRTM = P04XM4_A12091DVPrdRTM[0] ;
                  n12091DVPrdRTM = P04XM4_n12091DVPrdRTM[0] ;
                  A12092DVPrdCtw1 = P04XM4_A12092DVPrdCtw1[0] ;
                  n12092DVPrdCtw1 = P04XM4_n12092DVPrdCtw1[0] ;
                  A12093DVPrdCtw2 = P04XM4_A12093DVPrdCtw2[0] ;
                  n12093DVPrdCtw2 = P04XM4_n12093DVPrdCtw2[0] ;
                  A12094DVPrdCtw3 = P04XM4_A12094DVPrdCtw3[0] ;
                  n12094DVPrdCtw3 = P04XM4_n12094DVPrdCtw3[0] ;
                  A12095DVPrdNroCA = P04XM4_A12095DVPrdNroCA[0] ;
                  n12095DVPrdNroCA = P04XM4_n12095DVPrdNroCA[0] ;
                  A12096DVPrdGots = P04XM4_A12096DVPrdGots[0] ;
                  n12096DVPrdGots = P04XM4_n12096DVPrdGots[0] ;
                  A12097DVPrdHm = P04XM4_A12097DVPrdHm[0] ;
                  n12097DVPrdHm = P04XM4_n12097DVPrdHm[0] ;
                  A12098DVPrdConct = P04XM4_A12098DVPrdConct[0] ;
                  n12098DVPrdConct = P04XM4_n12098DVPrdConct[0] ;
                  A12099DVPrdEINEC = P04XM4_A12099DVPrdEINEC[0] ;
                  n12099DVPrdEINEC = P04XM4_n12099DVPrdEINEC[0] ;
                  A12100DVPrdFunci = P04XM4_A12100DVPrdFunci[0] ;
                  n12100DVPrdFunci = P04XM4_n12100DVPrdFunci[0] ;
                  A12101DVPrdNmQu = P04XM4_A12101DVPrdNmQu[0] ;
                  n12101DVPrdNmQu = P04XM4_n12101DVPrdNmQu[0] ;
                  A12102DVPrdEqLP = P04XM4_A12102DVPrdEqLP[0] ;
                  n12102DVPrdEqLP = P04XM4_n12102DVPrdEqLP[0] ;
                  A12103DVPrdConc = P04XM4_A12103DVPrdConc[0] ;
                  n12103DVPrdConc = P04XM4_n12103DVPrdConc[0] ;
                  A12104DVPrdCtw4 = P04XM4_A12104DVPrdCtw4[0] ;
                  n12104DVPrdCtw4 = P04XM4_n12104DVPrdCtw4[0] ;
                  A12105DVPrdList = P04XM4_A12105DVPrdList[0] ;
                  n12105DVPrdList = P04XM4_n12105DVPrdList[0] ;
                  A12003DVPrdNom = A718PrdNom ;
                  n12003DVPrdNom = false ;
                  A12004DVPrvNum = A795PrvNum ;
                  n12004DVPrvNum = false ;
                  A12006DVPrdPreAc = A724PrdPreAct ;
                  n12006DVPrdPreAc = false ;
                  A12008DVPrdDetPa = A698PrdDetPar ;
                  n12008DVPrdDetPa = false ;
                  A12013DVPrdPreMe = A726PrdPreMed ;
                  n12013DVPrdPreMe = false ;
                  A12014DVPrdRec = A727PrdRec ;
                  n12014DVPrdRec = false ;
                  A12015DVPrdPreAn = A725PrdPreAnt ;
                  n12015DVPrdPreAn = false ;
                  A12016DVPrdFecPr = A709PrdFecPre ;
                  n12016DVPrdFecPr = false ;
                  A12024DVPrdFacCo = A707PrdFacCon ;
                  n12024DVPrdFacCo = false ;
                  A12025DVPrdConDi = A696PrdConDia ;
                  n12025DVPrdConDi = false ;
                  A12026DVPrdStkMi = A732PrdStkMinU ;
                  n12026DVPrdStkMi = false ;
                  A12027DVPrdStkMD = A731PrdStkMinD ;
                  n12027DVPrdStkMD = false ;
                  A12029DVPrdPlaEn = A722PrdPlaEnt ;
                  n12029DVPrdPlaEn = false ;
                  A12030DVMetCod = A629MetCod ;
                  n12030DVMetCod = false ;
                  A12031DVPrdLotMi = A716PrdLotMin ;
                  n12031DVPrdLotMi = false ;
                  A12032DVPrdNumUc = A721PrdNumUco ;
                  n12032DVPrdNumUc = false ;
                  A12034DVPrdFulPe = A714PrdFulPed ;
                  n12034DVPrdFulPe = false ;
                  A12035DVPrdFulCC = A712PrdFulCC ;
                  n12035DVPrdFulCC = false ;
                  A12036DVPrdConCC = A695PrdConCC ;
                  n12036DVPrdConCC = false ;
                  A12037DVPrdDscTe = A703PrdDscTec ;
                  n12037DVPrdDscTe = false ;
                  A12038DVPrdUniCo = A742PrdUniCom ;
                  n12038DVPrdUniCo = false ;
                  A12039DVPrdUniCn = A743PrdUniCon ;
                  n12039DVPrdUniCn = false ;
                  A12040DVPrdRefPr = A728PrdRefPrv ;
                  n12040DVPrdRefPr = false ;
                  A12041DVPrdSus = A734PrdSus ;
                  n12041DVPrdSus = false ;
                  A12042DVPrdCalNe = A682PrdCalNec ;
                  n12042DVPrdCalNe = false ;
                  A12043DVPrdSit = A730PrdSit ;
                  n12043DVPrdSit = false ;
                  A12044DVTipDtoCo = A835TipDtoCod ;
                  n12044DVTipDtoCo = false ;
                  A12047DVPrdFecEn = A708PrdFecEnt ;
                  n12047DVPrdFecEn = false ;
                  A12048DVPrdPosX = A1193PrdPosX ;
                  n12048DVPrdPosX = false ;
                  A12049DVPrdPosY = A1194PrdPosY ;
                  n12049DVPrdPosY = false ;
                  A12050DVPrdTip = A1643PrdTip ;
                  n12050DVPrdTip = false ;
                  A12051DVPrdDqo = A1644PrdDqo ;
                  n12051DVPrdDqo = false ;
                  A12052DVPrdRev = A3004PrdRev ;
                  n12052DVPrdRev = false ;
                  A12053DVPrdTnq = A3273PrdTnq ;
                  n12053DVPrdTnq = false ;
                  A12055DVPrdUMeFo = A4338PrdUMeFo ;
                  n12055DVPrdUMeFo = false ;
                  A12056DVPrdNom2 = A4692PrdNom2 ;
                  n12056DVPrdNom2 = false ;
                  A12057DVPrdNum2 = A4693PrdNum2 ;
                  n12057DVPrdNum2 = false ;
                  A12058DVPrdObs = A4694PrdObs ;
                  n12058DVPrdObs = false ;
                  A12059DVPrdPreA2 = A5255PrdPreAc2 ;
                  n12059DVPrdPreA2 = false ;
                  A12060DVPrdDensS = A5416PrdDensS ;
                  n12060DVPrdDensS = false ;
                  A12061DVPrdConcS = A5417PrdConcS ;
                  n12061DVPrdConcS = false ;
                  A12062DVPrdSalM = A5418PrdSalM ;
                  n12062DVPrdSalM = false ;
                  A12063DVPrdSolub = A5590PrdSolub ;
                  n12063DVPrdSolub = false ;
                  A12064DVPrdNumCe = A6191PrdNumCent ;
                  n12064DVPrdNumCe = false ;
                  A12065DVTipPrdCo = A6301TipPrdCod ;
                  n12065DVTipPrdCo = false ;
                  A12066DVPrdNumct = A7226PrdNumct1 ;
                  n12066DVPrdNumct = false ;
                  A12067DVPrdNumc2 = A7227PrdNumct2 ;
                  n12067DVPrdNumc2 = false ;
                  A12068DVPrdHorMa = A7260PrdHorMad ;
                  n12068DVPrdHorMa = false ;
                  A12069DVPrdPreRe = A7763PrdPreRef ;
                  n12069DVPrdPreRe = false ;
                  A12070DVMat_Lts = A8647Mat_Lts ;
                  n12070DVMat_Lts = false ;
                  A12073DVPrdAltAc = A8895PrdAltAct ;
                  n12073DVPrdAltAc = false ;
                  A12074DVPrdPesCo = A8896PrdPesCon ;
                  n12074DVPrdPesCo = false ;
                  A12075DVPrdPesTe = A8897PrdPesTerm ;
                  n12075DVPrdPesTe = false ;
                  A12077DVPrdSal = A8936PrdSal ;
                  n12077DVPrdSal = false ;
                  A12078DVSubFamCo = A9609SubFamCod ;
                  n12078DVSubFamCo = false ;
                  A12079DVPrdInc = A9731PrdInc ;
                  n12079DVPrdInc = false ;
                  A12080DVPrdComp = A9732PrdComp ;
                  n12080DVPrdComp = false ;
                  A12081DVPrdAox = A9733PrdAox ;
                  n12081DVPrdAox = false ;
                  A12082DVPrdNCAS = A9734PrdNCAS ;
                  n12082DVPrdNCAS = false ;
                  A12083DVPrdFT = A9739PrdFT ;
                  n12083DVPrdFT = false ;
                  A12084DVPrdFFT = A9740PrdFFT ;
                  n12084DVPrdFFT = false ;
                  A12085DVPrdHS = A9741PrdHS ;
                  n12085DVPrdHS = false ;
                  A12086DVPrdFHS = A9742PrdFHS ;
                  n12086DVPrdFHS = false ;
                  A12087DVPrdReach = A5887PrdReach ;
                  n12087DVPrdReach = false ;
                  A12088DVPrdOkote = A5888PrdOkotex ;
                  n12088DVPrdOkote = false ;
                  A12089DVPrdColId = A10119PrdColIdx ;
                  n12089DVPrdColId = false ;
                  A12090DVPrdLote = A10881PrdLote ;
                  n12090DVPrdLote = false ;
                  A12091DVPrdRTM = A10935PrdRTM ;
                  n12091DVPrdRTM = false ;
                  A12092DVPrdCtw1 = A10936PrdCtw1 ;
                  n12092DVPrdCtw1 = false ;
                  A12093DVPrdCtw2 = A10937PrdCtw2 ;
                  n12093DVPrdCtw2 = false ;
                  A12094DVPrdCtw3 = A10938PrdCtw3 ;
                  n12094DVPrdCtw3 = false ;
                  A12095DVPrdNroCA = A11196PrdNroCAS ;
                  n12095DVPrdNroCA = false ;
                  A12096DVPrdGots = A11363PrdGots ;
                  n12096DVPrdGots = false ;
                  A12097DVPrdHm = A11364PrdHm ;
                  n12097DVPrdHm = false ;
                  A12098DVPrdConct = A11470PrdConct ;
                  n12098DVPrdConct = false ;
                  A12099DVPrdEINEC = A11614PrdEINECS ;
                  n12099DVPrdEINEC = false ;
                  A12100DVPrdFunci = A11615PrdFuncion ;
                  n12100DVPrdFunci = false ;
                  A12101DVPrdNmQu = A11616PrdNmQu ;
                  n12101DVPrdNmQu = false ;
                  A12102DVPrdEqLP = A3936PrdEqLP ;
                  n12102DVPrdEqLP = false ;
                  A12103DVPrdConc = A3937PrdConc ;
                  n12103DVPrdConc = false ;
                  A12104DVPrdCtw4 = A11663PrdCtw4 ;
                  n12104DVPrdCtw4 = false ;
                  A12105DVPrdList = A11687PrdList ;
                  n12105DVPrdList = false ;
                  /* Using cursor P04XM5 */
                  pr_default.execute(3, new Object[] {Boolean.valueOf(n12003DVPrdNom), A12003DVPrdNom, Boolean.valueOf(n12004DVPrvNum), Integer.valueOf(A12004DVPrvNum), Boolean.valueOf(n12006DVPrdPreAc), A12006DVPrdPreAc, Boolean.valueOf(n12008DVPrdDetPa), A12008DVPrdDetPa, Boolean.valueOf(n12013DVPrdPreMe), A12013DVPrdPreMe, Boolean.valueOf(n12014DVPrdRec), A12014DVPrdRec, Boolean.valueOf(n12015DVPrdPreAn), A12015DVPrdPreAn, Boolean.valueOf(n12016DVPrdFecPr), A12016DVPrdFecPr, Boolean.valueOf(n12024DVPrdFacCo), A12024DVPrdFacCo, Boolean.valueOf(n12025DVPrdConDi), A12025DVPrdConDi, Boolean.valueOf(n12026DVPrdStkMi), A12026DVPrdStkMi, Boolean.valueOf(n12027DVPrdStkMD), Short.valueOf(A12027DVPrdStkMD), Boolean.valueOf(n12029DVPrdPlaEn), Short.valueOf(A12029DVPrdPlaEn), Boolean.valueOf(n12030DVMetCod), Byte.valueOf(A12030DVMetCod), Boolean.valueOf(n12031DVPrdLotMi), Short.valueOf(A12031DVPrdLotMi), Boolean.valueOf(n12032DVPrdNumUc), A12032DVPrdNumUc, Boolean.valueOf(n12034DVPrdFulPe), A12034DVPrdFulPe, Boolean.valueOf(n12035DVPrdFulCC), A12035DVPrdFulCC, Boolean.valueOf(n12036DVPrdConCC), Short.valueOf(A12036DVPrdConCC), Boolean.valueOf(n12037DVPrdDscTe), A12037DVPrdDscTe, Boolean.valueOf(n12038DVPrdUniCo), Byte.valueOf(A12038DVPrdUniCo), Boolean.valueOf(n12039DVPrdUniCn), Byte.valueOf(A12039DVPrdUniCn), Boolean.valueOf(n12040DVPrdRefPr), A12040DVPrdRefPr, Boolean.valueOf(n12041DVPrdSus), A12041DVPrdSus, Boolean.valueOf(n12042DVPrdCalNe), A12042DVPrdCalNe, Boolean.valueOf(n12043DVPrdSit), Byte.valueOf(A12043DVPrdSit), Boolean.valueOf(n12044DVTipDtoCo), Byte.valueOf(A12044DVTipDtoCo), Boolean.valueOf(n12047DVPrdFecEn), A12047DVPrdFecEn, Boolean.valueOf(n12048DVPrdPosX), Short.valueOf(A12048DVPrdPosX), Boolean.valueOf(n12049DVPrdPosY), Short.valueOf(A12049DVPrdPosY), Boolean.valueOf(n12050DVPrdTip), A12050DVPrdTip, Boolean.valueOf(n12051DVPrdDqo), Short.valueOf(A12051DVPrdDqo), Boolean.valueOf(n12052DVPrdRev), A12052DVPrdRev, Boolean.valueOf(n12053DVPrdTnq), Byte.valueOf(A12053DVPrdTnq), Boolean.valueOf(n12055DVPrdUMeFo), Byte.valueOf(A12055DVPrdUMeFo), Boolean.valueOf(n12056DVPrdNom2), A12056DVPrdNom2, Boolean.valueOf(n12057DVPrdNum2), A12057DVPrdNum2, Boolean.valueOf(n12058DVPrdObs), A12058DVPrdObs, Boolean.valueOf(n12059DVPrdPreA2), A12059DVPrdPreA2, Boolean.valueOf(n12060DVPrdDensS), A12060DVPrdDensS, Boolean.valueOf(n12061DVPrdConcS), A12061DVPrdConcS, Boolean.valueOf(n12062DVPrdSalM), A12062DVPrdSalM, Boolean.valueOf(n12063DVPrdSolub), A12063DVPrdSolub, Boolean.valueOf(n12064DVPrdNumCe), A12064DVPrdNumCe, Boolean.valueOf(n12065DVTipPrdCo), Short.valueOf(A12065DVTipPrdCo), Boolean.valueOf(n12066DVPrdNumct), A12066DVPrdNumct, Boolean.valueOf(n12067DVPrdNumc2), A12067DVPrdNumc2, Boolean.valueOf(n12068DVPrdHorMa), Byte.valueOf(A12068DVPrdHorMa), Boolean.valueOf(n12069DVPrdPreRe), A12069DVPrdPreRe, Boolean.valueOf(n12070DVMat_Lts), A12070DVMat_Lts, Boolean.valueOf(n12073DVPrdAltAc), Byte.valueOf(A12073DVPrdAltAc), Boolean.valueOf(n12074DVPrdPesCo), Byte.valueOf(A12074DVPrdPesCo), Boolean.valueOf(n12075DVPrdPesTe), A12075DVPrdPesTe, Boolean.valueOf(n12077DVPrdSal), A12077DVPrdSal, Boolean.valueOf(n12078DVSubFamCo), Byte.valueOf(A12078DVSubFamCo), Boolean.valueOf(n12079DVPrdInc), A12079DVPrdInc, Boolean.valueOf(n12080DVPrdComp), A12080DVPrdComp, Boolean.valueOf(n12081DVPrdAox), A12081DVPrdAox, Boolean.valueOf(n12082DVPrdNCAS), A12082DVPrdNCAS, Boolean.valueOf(n12083DVPrdFT), A12083DVPrdFT, Boolean.valueOf(n12084DVPrdFFT), A12084DVPrdFFT,
                  Boolean.valueOf(n12085DVPrdHS), A12085DVPrdHS, Boolean.valueOf(n12086DVPrdFHS), A12086DVPrdFHS, Boolean.valueOf(n12087DVPrdReach), A12087DVPrdReach, Boolean.valueOf(n12088DVPrdOkote), A12088DVPrdOkote, Boolean.valueOf(n12089DVPrdColId), A12089DVPrdColId, Boolean.valueOf(n12090DVPrdLote), A12090DVPrdLote, Boolean.valueOf(n12091DVPrdRTM), A12091DVPrdRTM, Boolean.valueOf(n12092DVPrdCtw1), A12092DVPrdCtw1, Boolean.valueOf(n12093DVPrdCtw2), A12093DVPrdCtw2, Boolean.valueOf(n12094DVPrdCtw3), A12094DVPrdCtw3, Boolean.valueOf(n12095DVPrdNroCA), A12095DVPrdNroCA, Boolean.valueOf(n12096DVPrdGots), A12096DVPrdGots, Boolean.valueOf(n12097DVPrdHm), A12097DVPrdHm, Boolean.valueOf(n12098DVPrdConct), Short.valueOf(A12098DVPrdConct), Boolean.valueOf(n12099DVPrdEINEC), A12099DVPrdEINEC, Boolean.valueOf(n12100DVPrdFunci), A12100DVPrdFunci, Boolean.valueOf(n12101DVPrdNmQu), A12101DVPrdNmQu, Boolean.valueOf(n12102DVPrdEqLP), A12102DVPrdEqLP, Boolean.valueOf(n12103DVPrdConc), A12103DVPrdConc, Boolean.valueOf(n12104DVPrdCtw4), A12104DVPrdCtw4, Boolean.valueOf(n12105DVPrdList), A12105DVPrdList, A396EmprCod, A11935DVPrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNDVPRODUC");
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(2);
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P04XM6 */
         pr_default.execute(4, new Object[] {A396EmprCod, AV9Prdnum});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A719PrdNum = P04XM6_A719PrdNum[0] ;
            A6158PrdPrv = P04XM6_A6158PrdPrv[0] ;
            A7240PrdPrea = P04XM6_A7240PrdPrea[0] ;
            A10121PrdRefn = P04XM6_A10121PrdRefn[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE LVNPROPRV

            */
            W396EmprCod = A396EmprCod ;
            A11935DVPrdNum = A719PrdNum ;
            A12106DVPrdPrv = A6158PrdPrv ;
            A12107DVPrdPrea = A7240PrdPrea ;
            n12107DVPrdPrea = false ;
            A12108DVPrdRefn = A10121PrdRefn ;
            n12108DVPrdRefn = false ;
            /* Using cursor P04XM7 */
            pr_default.execute(5, new Object[] {A396EmprCod, A11935DVPrdNum, Integer.valueOf(A12106DVPrdPrv), Boolean.valueOf(n12107DVPrdPrea), A12107DVPrdPrea, Boolean.valueOf(n12108DVPrdRefn), A12108DVPrdRefn});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNPROPRV");
            if ( (pr_default.getStatus(5) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               /* Using cursor P04XM8 */
               pr_default.execute(6, new Object[] {A396EmprCod, AV9Prdnum, Integer.valueOf(A12106DVPrdPrv)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A396EmprCod = P04XM8_A396EmprCod[0] ;
                  A12106DVPrdPrv = P04XM8_A12106DVPrdPrv[0] ;
                  A11935DVPrdNum = P04XM8_A11935DVPrdNum[0] ;
                  A12107DVPrdPrea = P04XM8_A12107DVPrdPrea[0] ;
                  n12107DVPrdPrea = P04XM8_n12107DVPrdPrea[0] ;
                  A12108DVPrdRefn = P04XM8_A12108DVPrdRefn[0] ;
                  n12108DVPrdRefn = P04XM8_n12108DVPrdRefn[0] ;
                  A12107DVPrdPrea = A7240PrdPrea ;
                  n12107DVPrdPrea = false ;
                  A12108DVPrdRefn = A10121PrdRefn ;
                  n12108DVPrdRefn = false ;
                  /* Using cursor P04XM9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n12107DVPrdPrea), A12107DVPrdPrea, Boolean.valueOf(n12108DVPrdRefn), A12108DVPrdRefn, A396EmprCod, A11935DVPrdNum, Integer.valueOf(A12106DVPrdPrv)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNPROPRV");
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(6);
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      else
      {
         /* Using cursor P04XM10 */
         pr_default.execute(8, new Object[] {A396EmprCod, AV9Prdnum});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A11935DVPrdNum = P04XM10_A11935DVPrdNum[0] ;
            A12004DVPrvNum = P04XM10_A12004DVPrvNum[0] ;
            n12004DVPrvNum = P04XM10_n12004DVPrvNum[0] ;
            while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P04XM10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P04XM10_A11935DVPrdNum[0], A11935DVPrdNum) == 0 ) )
            {
               A12004DVPrvNum = P04XM10_A12004DVPrvNum[0] ;
               n12004DVPrvNum = P04XM10_n12004DVPrvNum[0] ;
               /* Using cursor P04XM11 */
               pr_default.execute(9, new Object[] {A396EmprCod, A11935DVPrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNDVPRODUC");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            /* Using cursor P04XM12 */
            pr_default.execute(10, new Object[] {A396EmprCod, A11935DVPrdNum});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("LVNDVPRODUC");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdvproduc.this.A396EmprCod;
      this.aP1[0] = pdvproduc.this.AV9Prdnum;
      this.aP2[0] = pdvproduc.this.Gx_mode;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdvproduc");
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
      P04XM2_A396EmprCod = new String[] {""} ;
      P04XM2_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_A719PrdNum = new String[] {""} ;
      P04XM2_A718PrdNom = new String[] {""} ;
      P04XM2_A795PrvNum = new int[1] ;
      P04XM2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_A698PrdDetPar = new String[] {""} ;
      P04XM2_A856ValCod = new byte[1] ;
      P04XM2_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P04XM2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_A727PrdRec = new String[] {""} ;
      P04XM2_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P04XM2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_A731PrdStkMinD = new short[1] ;
      P04XM2_A722PrdPlaEnt = new short[1] ;
      P04XM2_A629MetCod = new byte[1] ;
      P04XM2_n629MetCod = new boolean[] {false} ;
      P04XM2_A716PrdLotMin = new short[1] ;
      P04XM2_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_A714PrdFulPed = new java.util.Date[] {GXutil.nullDate()} ;
      P04XM2_A712PrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      P04XM2_A695PrdConCC = new short[1] ;
      P04XM2_A703PrdDscTec = new String[] {""} ;
      P04XM2_A742PrdUniCom = new byte[1] ;
      P04XM2_A743PrdUniCon = new byte[1] ;
      P04XM2_A728PrdRefPrv = new String[] {""} ;
      P04XM2_A734PrdSus = new String[] {""} ;
      P04XM2_n734PrdSus = new boolean[] {false} ;
      P04XM2_A682PrdCalNec = new String[] {""} ;
      P04XM2_A730PrdSit = new byte[1] ;
      P04XM2_A835TipDtoCod = new byte[1] ;
      P04XM2_n835TipDtoCod = new boolean[] {false} ;
      P04XM2_A708PrdFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P04XM2_A1193PrdPosX = new short[1] ;
      P04XM2_A1194PrdPosY = new byte[1] ;
      P04XM2_A1643PrdTip = new String[] {""} ;
      P04XM2_A1644PrdDqo = new short[1] ;
      P04XM2_A3004PrdRev = new String[] {""} ;
      P04XM2_A3273PrdTnq = new byte[1] ;
      P04XM2_A4338PrdUMeFo = new byte[1] ;
      P04XM2_A4692PrdNom2 = new String[] {""} ;
      P04XM2_A4693PrdNum2 = new String[] {""} ;
      P04XM2_A4694PrdObs = new String[] {""} ;
      P04XM2_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_A5418PrdSalM = new String[] {""} ;
      P04XM2_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_A6191PrdNumCent = new String[] {""} ;
      P04XM2_A6301TipPrdCod = new short[1] ;
      P04XM2_n6301TipPrdCod = new boolean[] {false} ;
      P04XM2_A7226PrdNumct1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_A7227PrdNumct2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_A7260PrdHorMad = new byte[1] ;
      P04XM2_A7763PrdPreRef = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_n7763PrdPreRef = new boolean[] {false} ;
      P04XM2_A8647Mat_Lts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_n8647Mat_Lts = new boolean[] {false} ;
      P04XM2_A8895PrdAltAct = new byte[1] ;
      P04XM2_n8895PrdAltAct = new boolean[] {false} ;
      P04XM2_A8896PrdPesCon = new byte[1] ;
      P04XM2_A8897PrdPesTerm = new String[] {""} ;
      P04XM2_A8936PrdSal = new String[] {""} ;
      P04XM2_A9609SubFamCod = new byte[1] ;
      P04XM2_n9609SubFamCod = new boolean[] {false} ;
      P04XM2_A9731PrdInc = new String[] {""} ;
      P04XM2_A9732PrdComp = new String[] {""} ;
      P04XM2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_A9734PrdNCAS = new String[] {""} ;
      P04XM2_A9739PrdFT = new String[] {""} ;
      P04XM2_A9740PrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      P04XM2_A9741PrdHS = new String[] {""} ;
      P04XM2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P04XM2_A5887PrdReach = new String[] {""} ;
      P04XM2_A5888PrdOkotex = new String[] {""} ;
      P04XM2_A10119PrdColIdx = new String[] {""} ;
      P04XM2_A10881PrdLote = new String[] {""} ;
      P04XM2_A10935PrdRTM = new String[] {""} ;
      P04XM2_A10936PrdCtw1 = new String[] {""} ;
      P04XM2_A10937PrdCtw2 = new String[] {""} ;
      P04XM2_A10938PrdCtw3 = new String[] {""} ;
      P04XM2_A11196PrdNroCAS = new String[] {""} ;
      P04XM2_A11363PrdGots = new String[] {""} ;
      P04XM2_A11364PrdHm = new String[] {""} ;
      P04XM2_A11470PrdConct = new short[1] ;
      P04XM2_A11614PrdEINECS = new String[] {""} ;
      P04XM2_A11615PrdFuncion = new String[] {""} ;
      P04XM2_A11616PrdNmQu = new String[] {""} ;
      P04XM2_A3936PrdEqLP = new String[] {""} ;
      P04XM2_A3937PrdConc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM2_n3937PrdConc = new boolean[] {false} ;
      P04XM2_A11663PrdCtw4 = new String[] {""} ;
      P04XM2_A11687PrdList = new String[] {""} ;
      A696PrdConDia = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A698PrdDetPar = "" ;
      A713PrdFulEnt = GXutil.nullDate() ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A727PrdRec = "" ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      A714PrdFulPed = GXutil.nullDate() ;
      A712PrdFulCC = GXutil.nullDate() ;
      A703PrdDscTec = "" ;
      A728PrdRefPrv = "" ;
      A734PrdSus = "" ;
      A682PrdCalNec = "" ;
      A708PrdFecEnt = GXutil.nullDate() ;
      A1643PrdTip = "" ;
      A3004PrdRev = "" ;
      A4692PrdNom2 = "" ;
      A4693PrdNum2 = "" ;
      A4694PrdObs = "" ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      A5416PrdDensS = DecimalUtil.ZERO ;
      A5417PrdConcS = DecimalUtil.ZERO ;
      A5418PrdSalM = "" ;
      A5590PrdSolub = DecimalUtil.ZERO ;
      A6191PrdNumCent = "" ;
      A7226PrdNumct1 = DecimalUtil.ZERO ;
      A7227PrdNumct2 = DecimalUtil.ZERO ;
      A7763PrdPreRef = DecimalUtil.ZERO ;
      A8647Mat_Lts = DecimalUtil.ZERO ;
      A8897PrdPesTerm = "" ;
      A8936PrdSal = "" ;
      A9731PrdInc = "" ;
      A9732PrdComp = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A9734PrdNCAS = "" ;
      A9739PrdFT = "" ;
      A9740PrdFFT = GXutil.nullDate() ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A5887PrdReach = "" ;
      A5888PrdOkotex = "" ;
      A10119PrdColIdx = "" ;
      A10881PrdLote = "" ;
      A10935PrdRTM = "" ;
      A10936PrdCtw1 = "" ;
      A10937PrdCtw2 = "" ;
      A10938PrdCtw3 = "" ;
      A11196PrdNroCAS = "" ;
      A11363PrdGots = "" ;
      A11364PrdHm = "" ;
      A11614PrdEINECS = "" ;
      A11615PrdFuncion = "" ;
      A11616PrdNmQu = "" ;
      A3936PrdEqLP = "" ;
      A3937PrdConc = DecimalUtil.ZERO ;
      A11663PrdCtw4 = "" ;
      A11687PrdList = "" ;
      W396EmprCod = "" ;
      A11935DVPrdNum = "" ;
      A12003DVPrdNom = "" ;
      A12005DVPrdExiAl = DecimalUtil.ZERO ;
      A12006DVPrdPreAc = DecimalUtil.ZERO ;
      A12008DVPrdDetPa = "" ;
      A12010DVPrdFulEn = GXutil.nullDate() ;
      A12011DVPrdCanPe = DecimalUtil.ZERO ;
      A12012DVPrdRotRe = DecimalUtil.ZERO ;
      A12013DVPrdPreMe = DecimalUtil.ZERO ;
      A12014DVPrdRec = "" ;
      A12015DVPrdPreAn = DecimalUtil.ZERO ;
      A12016DVPrdFecPr = GXutil.nullDate() ;
      A12018DVPrdExiCC = DecimalUtil.ZERO ;
      A12019DVPrdUltDC = DecimalUtil.ZERO ;
      A12020DVPrdUltEC = DecimalUtil.ZERO ;
      A12022DVPrdExiCP = DecimalUtil.ZERO ;
      A12023DVPrdDifCC = DecimalUtil.ZERO ;
      A12024DVPrdFacCo = DecimalUtil.ZERO ;
      A12025DVPrdConDi = DecimalUtil.ZERO ;
      A12026DVPrdStkMi = DecimalUtil.ZERO ;
      A12032DVPrdNumUc = DecimalUtil.ZERO ;
      A12033DVPrdCanRe = DecimalUtil.ZERO ;
      A12034DVPrdFulPe = GXutil.nullDate() ;
      A12035DVPrdFulCC = GXutil.nullDate() ;
      A12037DVPrdDscTe = "" ;
      A12040DVPrdRefPr = "" ;
      A12041DVPrdSus = "" ;
      A12042DVPrdCalNe = "" ;
      A12045DVPrdValSt = DecimalUtil.ZERO ;
      A12046DVDifValSt = DecimalUtil.ZERO ;
      A12047DVPrdFecEn = GXutil.nullDate() ;
      A12050DVPrdTip = "" ;
      A12052DVPrdRev = "" ;
      A12056DVPrdNom2 = "" ;
      A12057DVPrdNum2 = "" ;
      A12058DVPrdObs = "" ;
      A12059DVPrdPreA2 = DecimalUtil.ZERO ;
      A12060DVPrdDensS = DecimalUtil.ZERO ;
      A12061DVPrdConcS = DecimalUtil.ZERO ;
      A12062DVPrdSalM = "" ;
      A12063DVPrdSolub = DecimalUtil.ZERO ;
      A12064DVPrdNumCe = "" ;
      A12066DVPrdNumct = DecimalUtil.ZERO ;
      A12067DVPrdNumc2 = DecimalUtil.ZERO ;
      A12069DVPrdPreRe = DecimalUtil.ZERO ;
      A12070DVMat_Lts = DecimalUtil.ZERO ;
      A12071DVPrdExiAc = DecimalUtil.ZERO ;
      A12075DVPrdPesTe = "" ;
      A12077DVPrdSal = "" ;
      A12079DVPrdInc = "" ;
      A12080DVPrdComp = "" ;
      A12081DVPrdAox = DecimalUtil.ZERO ;
      A12082DVPrdNCAS = "" ;
      A12083DVPrdFT = "" ;
      A12084DVPrdFFT = GXutil.nullDate() ;
      A12085DVPrdHS = "" ;
      A12086DVPrdFHS = GXutil.nullDate() ;
      A12087DVPrdReach = "" ;
      A12088DVPrdOkote = "" ;
      A12089DVPrdColId = "" ;
      A12090DVPrdLote = "" ;
      A12091DVPrdRTM = "" ;
      A12092DVPrdCtw1 = "" ;
      A12093DVPrdCtw2 = "" ;
      A12094DVPrdCtw3 = "" ;
      A12095DVPrdNroCA = "" ;
      A12096DVPrdGots = "" ;
      A12097DVPrdHm = "" ;
      A12099DVPrdEINEC = "" ;
      A12100DVPrdFunci = "" ;
      A12101DVPrdNmQu = "" ;
      A12102DVPrdEqLP = "" ;
      A12103DVPrdConc = DecimalUtil.ZERO ;
      A12104DVPrdCtw4 = "" ;
      A12105DVPrdList = "" ;
      Gx_emsg = "" ;
      P04XM4_A12058DVPrdObs = new String[] {""} ;
      P04XM4_n12058DVPrdObs = new boolean[] {false} ;
      P04XM4_A396EmprCod = new String[] {""} ;
      P04XM4_A11935DVPrdNum = new String[] {""} ;
      P04XM4_A12003DVPrdNom = new String[] {""} ;
      P04XM4_n12003DVPrdNom = new boolean[] {false} ;
      P04XM4_A12004DVPrvNum = new int[1] ;
      P04XM4_n12004DVPrvNum = new boolean[] {false} ;
      P04XM4_A12006DVPrdPreAc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12006DVPrdPreAc = new boolean[] {false} ;
      P04XM4_A12008DVPrdDetPa = new String[] {""} ;
      P04XM4_n12008DVPrdDetPa = new boolean[] {false} ;
      P04XM4_A12013DVPrdPreMe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12013DVPrdPreMe = new boolean[] {false} ;
      P04XM4_A12014DVPrdRec = new String[] {""} ;
      P04XM4_n12014DVPrdRec = new boolean[] {false} ;
      P04XM4_A12015DVPrdPreAn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12015DVPrdPreAn = new boolean[] {false} ;
      P04XM4_A12016DVPrdFecPr = new java.util.Date[] {GXutil.nullDate()} ;
      P04XM4_n12016DVPrdFecPr = new boolean[] {false} ;
      P04XM4_A12024DVPrdFacCo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12024DVPrdFacCo = new boolean[] {false} ;
      P04XM4_A12025DVPrdConDi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12025DVPrdConDi = new boolean[] {false} ;
      P04XM4_A12026DVPrdStkMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12026DVPrdStkMi = new boolean[] {false} ;
      P04XM4_A12027DVPrdStkMD = new short[1] ;
      P04XM4_n12027DVPrdStkMD = new boolean[] {false} ;
      P04XM4_A12029DVPrdPlaEn = new short[1] ;
      P04XM4_n12029DVPrdPlaEn = new boolean[] {false} ;
      P04XM4_A12030DVMetCod = new byte[1] ;
      P04XM4_n12030DVMetCod = new boolean[] {false} ;
      P04XM4_A12031DVPrdLotMi = new short[1] ;
      P04XM4_n12031DVPrdLotMi = new boolean[] {false} ;
      P04XM4_A12032DVPrdNumUc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12032DVPrdNumUc = new boolean[] {false} ;
      P04XM4_A12034DVPrdFulPe = new java.util.Date[] {GXutil.nullDate()} ;
      P04XM4_n12034DVPrdFulPe = new boolean[] {false} ;
      P04XM4_A12035DVPrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      P04XM4_n12035DVPrdFulCC = new boolean[] {false} ;
      P04XM4_A12036DVPrdConCC = new short[1] ;
      P04XM4_n12036DVPrdConCC = new boolean[] {false} ;
      P04XM4_A12037DVPrdDscTe = new String[] {""} ;
      P04XM4_n12037DVPrdDscTe = new boolean[] {false} ;
      P04XM4_A12038DVPrdUniCo = new byte[1] ;
      P04XM4_n12038DVPrdUniCo = new boolean[] {false} ;
      P04XM4_A12039DVPrdUniCn = new byte[1] ;
      P04XM4_n12039DVPrdUniCn = new boolean[] {false} ;
      P04XM4_A12040DVPrdRefPr = new String[] {""} ;
      P04XM4_n12040DVPrdRefPr = new boolean[] {false} ;
      P04XM4_A12041DVPrdSus = new String[] {""} ;
      P04XM4_n12041DVPrdSus = new boolean[] {false} ;
      P04XM4_A12042DVPrdCalNe = new String[] {""} ;
      P04XM4_n12042DVPrdCalNe = new boolean[] {false} ;
      P04XM4_A12043DVPrdSit = new byte[1] ;
      P04XM4_n12043DVPrdSit = new boolean[] {false} ;
      P04XM4_A12044DVTipDtoCo = new byte[1] ;
      P04XM4_n12044DVTipDtoCo = new boolean[] {false} ;
      P04XM4_A12047DVPrdFecEn = new java.util.Date[] {GXutil.nullDate()} ;
      P04XM4_n12047DVPrdFecEn = new boolean[] {false} ;
      P04XM4_A12048DVPrdPosX = new short[1] ;
      P04XM4_n12048DVPrdPosX = new boolean[] {false} ;
      P04XM4_A12049DVPrdPosY = new short[1] ;
      P04XM4_n12049DVPrdPosY = new boolean[] {false} ;
      P04XM4_A12050DVPrdTip = new String[] {""} ;
      P04XM4_n12050DVPrdTip = new boolean[] {false} ;
      P04XM4_A12051DVPrdDqo = new short[1] ;
      P04XM4_n12051DVPrdDqo = new boolean[] {false} ;
      P04XM4_A12052DVPrdRev = new String[] {""} ;
      P04XM4_n12052DVPrdRev = new boolean[] {false} ;
      P04XM4_A12053DVPrdTnq = new byte[1] ;
      P04XM4_n12053DVPrdTnq = new boolean[] {false} ;
      P04XM4_A12055DVPrdUMeFo = new byte[1] ;
      P04XM4_n12055DVPrdUMeFo = new boolean[] {false} ;
      P04XM4_A12056DVPrdNom2 = new String[] {""} ;
      P04XM4_n12056DVPrdNom2 = new boolean[] {false} ;
      P04XM4_A12057DVPrdNum2 = new String[] {""} ;
      P04XM4_n12057DVPrdNum2 = new boolean[] {false} ;
      P04XM4_A12059DVPrdPreA2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12059DVPrdPreA2 = new boolean[] {false} ;
      P04XM4_A12060DVPrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12060DVPrdDensS = new boolean[] {false} ;
      P04XM4_A12061DVPrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12061DVPrdConcS = new boolean[] {false} ;
      P04XM4_A12062DVPrdSalM = new String[] {""} ;
      P04XM4_n12062DVPrdSalM = new boolean[] {false} ;
      P04XM4_A12063DVPrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12063DVPrdSolub = new boolean[] {false} ;
      P04XM4_A12064DVPrdNumCe = new String[] {""} ;
      P04XM4_n12064DVPrdNumCe = new boolean[] {false} ;
      P04XM4_A12065DVTipPrdCo = new short[1] ;
      P04XM4_n12065DVTipPrdCo = new boolean[] {false} ;
      P04XM4_A12066DVPrdNumct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12066DVPrdNumct = new boolean[] {false} ;
      P04XM4_A12067DVPrdNumc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12067DVPrdNumc2 = new boolean[] {false} ;
      P04XM4_A12068DVPrdHorMa = new byte[1] ;
      P04XM4_n12068DVPrdHorMa = new boolean[] {false} ;
      P04XM4_A12069DVPrdPreRe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12069DVPrdPreRe = new boolean[] {false} ;
      P04XM4_A12070DVMat_Lts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12070DVMat_Lts = new boolean[] {false} ;
      P04XM4_A12073DVPrdAltAc = new byte[1] ;
      P04XM4_n12073DVPrdAltAc = new boolean[] {false} ;
      P04XM4_A12074DVPrdPesCo = new byte[1] ;
      P04XM4_n12074DVPrdPesCo = new boolean[] {false} ;
      P04XM4_A12075DVPrdPesTe = new String[] {""} ;
      P04XM4_n12075DVPrdPesTe = new boolean[] {false} ;
      P04XM4_A12077DVPrdSal = new String[] {""} ;
      P04XM4_n12077DVPrdSal = new boolean[] {false} ;
      P04XM4_A12078DVSubFamCo = new byte[1] ;
      P04XM4_n12078DVSubFamCo = new boolean[] {false} ;
      P04XM4_A12079DVPrdInc = new String[] {""} ;
      P04XM4_n12079DVPrdInc = new boolean[] {false} ;
      P04XM4_A12080DVPrdComp = new String[] {""} ;
      P04XM4_n12080DVPrdComp = new boolean[] {false} ;
      P04XM4_A12081DVPrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12081DVPrdAox = new boolean[] {false} ;
      P04XM4_A12082DVPrdNCAS = new String[] {""} ;
      P04XM4_n12082DVPrdNCAS = new boolean[] {false} ;
      P04XM4_A12083DVPrdFT = new String[] {""} ;
      P04XM4_n12083DVPrdFT = new boolean[] {false} ;
      P04XM4_A12084DVPrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      P04XM4_n12084DVPrdFFT = new boolean[] {false} ;
      P04XM4_A12085DVPrdHS = new String[] {""} ;
      P04XM4_n12085DVPrdHS = new boolean[] {false} ;
      P04XM4_A12086DVPrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P04XM4_n12086DVPrdFHS = new boolean[] {false} ;
      P04XM4_A12087DVPrdReach = new String[] {""} ;
      P04XM4_n12087DVPrdReach = new boolean[] {false} ;
      P04XM4_A12088DVPrdOkote = new String[] {""} ;
      P04XM4_n12088DVPrdOkote = new boolean[] {false} ;
      P04XM4_A12089DVPrdColId = new String[] {""} ;
      P04XM4_n12089DVPrdColId = new boolean[] {false} ;
      P04XM4_A12090DVPrdLote = new String[] {""} ;
      P04XM4_n12090DVPrdLote = new boolean[] {false} ;
      P04XM4_A12091DVPrdRTM = new String[] {""} ;
      P04XM4_n12091DVPrdRTM = new boolean[] {false} ;
      P04XM4_A12092DVPrdCtw1 = new String[] {""} ;
      P04XM4_n12092DVPrdCtw1 = new boolean[] {false} ;
      P04XM4_A12093DVPrdCtw2 = new String[] {""} ;
      P04XM4_n12093DVPrdCtw2 = new boolean[] {false} ;
      P04XM4_A12094DVPrdCtw3 = new String[] {""} ;
      P04XM4_n12094DVPrdCtw3 = new boolean[] {false} ;
      P04XM4_A12095DVPrdNroCA = new String[] {""} ;
      P04XM4_n12095DVPrdNroCA = new boolean[] {false} ;
      P04XM4_A12096DVPrdGots = new String[] {""} ;
      P04XM4_n12096DVPrdGots = new boolean[] {false} ;
      P04XM4_A12097DVPrdHm = new String[] {""} ;
      P04XM4_n12097DVPrdHm = new boolean[] {false} ;
      P04XM4_A12098DVPrdConct = new short[1] ;
      P04XM4_n12098DVPrdConct = new boolean[] {false} ;
      P04XM4_A12099DVPrdEINEC = new String[] {""} ;
      P04XM4_n12099DVPrdEINEC = new boolean[] {false} ;
      P04XM4_A12100DVPrdFunci = new String[] {""} ;
      P04XM4_n12100DVPrdFunci = new boolean[] {false} ;
      P04XM4_A12101DVPrdNmQu = new String[] {""} ;
      P04XM4_n12101DVPrdNmQu = new boolean[] {false} ;
      P04XM4_A12102DVPrdEqLP = new String[] {""} ;
      P04XM4_n12102DVPrdEqLP = new boolean[] {false} ;
      P04XM4_A12103DVPrdConc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM4_n12103DVPrdConc = new boolean[] {false} ;
      P04XM4_A12104DVPrdCtw4 = new String[] {""} ;
      P04XM4_n12104DVPrdCtw4 = new boolean[] {false} ;
      P04XM4_A12105DVPrdList = new String[] {""} ;
      P04XM4_n12105DVPrdList = new boolean[] {false} ;
      P04XM6_A396EmprCod = new String[] {""} ;
      P04XM6_A719PrdNum = new String[] {""} ;
      P04XM6_A6158PrdPrv = new int[1] ;
      P04XM6_A7240PrdPrea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM6_A10121PrdRefn = new String[] {""} ;
      A7240PrdPrea = DecimalUtil.ZERO ;
      A10121PrdRefn = "" ;
      A12107DVPrdPrea = DecimalUtil.ZERO ;
      A12108DVPrdRefn = "" ;
      P04XM8_A396EmprCod = new String[] {""} ;
      P04XM8_A12106DVPrdPrv = new int[1] ;
      P04XM8_A11935DVPrdNum = new String[] {""} ;
      P04XM8_A12107DVPrdPrea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04XM8_n12107DVPrdPrea = new boolean[] {false} ;
      P04XM8_A12108DVPrdRefn = new String[] {""} ;
      P04XM8_n12108DVPrdRefn = new boolean[] {false} ;
      P04XM10_A396EmprCod = new String[] {""} ;
      P04XM10_A11935DVPrdNum = new String[] {""} ;
      P04XM10_A12004DVPrvNum = new int[1] ;
      P04XM10_n12004DVPrvNum = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdvproduc__default(),
         new Object[] {
             new Object[] {
            P04XM2_A396EmprCod, P04XM2_A696PrdConDia, P04XM2_A719PrdNum, P04XM2_A718PrdNom, P04XM2_A795PrvNum, P04XM2_A724PrdPreAct, P04XM2_A698PrdDetPar, P04XM2_A856ValCod, P04XM2_A713PrdFulEnt, P04XM2_A726PrdPreMed,
            P04XM2_A727PrdRec, P04XM2_A725PrdPreAnt, P04XM2_A709PrdFecPre, P04XM2_A707PrdFacCon, P04XM2_A732PrdStkMinU, P04XM2_A731PrdStkMinD, P04XM2_A722PrdPlaEnt, P04XM2_A629MetCod, P04XM2_n629MetCod, P04XM2_A716PrdLotMin,
            P04XM2_A721PrdNumUco, P04XM2_A714PrdFulPed, P04XM2_A712PrdFulCC, P04XM2_A695PrdConCC, P04XM2_A703PrdDscTec, P04XM2_A742PrdUniCom, P04XM2_A743PrdUniCon, P04XM2_A728PrdRefPrv, P04XM2_A734PrdSus, P04XM2_n734PrdSus,
            P04XM2_A682PrdCalNec, P04XM2_A730PrdSit, P04XM2_A835TipDtoCod, P04XM2_n835TipDtoCod, P04XM2_A708PrdFecEnt, P04XM2_A1193PrdPosX, P04XM2_A1194PrdPosY, P04XM2_A1643PrdTip, P04XM2_A1644PrdDqo, P04XM2_A3004PrdRev,
            P04XM2_A3273PrdTnq, P04XM2_A4338PrdUMeFo, P04XM2_A4692PrdNom2, P04XM2_A4693PrdNum2, P04XM2_A4694PrdObs, P04XM2_A5255PrdPreAc2, P04XM2_A5416PrdDensS, P04XM2_A5417PrdConcS, P04XM2_A5418PrdSalM, P04XM2_A5590PrdSolub,
            P04XM2_A6191PrdNumCent, P04XM2_A6301TipPrdCod, P04XM2_n6301TipPrdCod, P04XM2_A7226PrdNumct1, P04XM2_A7227PrdNumct2, P04XM2_A7260PrdHorMad, P04XM2_A7763PrdPreRef, P04XM2_n7763PrdPreRef, P04XM2_A8647Mat_Lts, P04XM2_n8647Mat_Lts,
            P04XM2_A8895PrdAltAct, P04XM2_n8895PrdAltAct, P04XM2_A8896PrdPesCon, P04XM2_A8897PrdPesTerm, P04XM2_A8936PrdSal, P04XM2_A9609SubFamCod, P04XM2_n9609SubFamCod, P04XM2_A9731PrdInc, P04XM2_A9732PrdComp, P04XM2_A9733PrdAox,
            P04XM2_A9734PrdNCAS, P04XM2_A9739PrdFT, P04XM2_A9740PrdFFT, P04XM2_A9741PrdHS, P04XM2_A9742PrdFHS, P04XM2_A5887PrdReach, P04XM2_A5888PrdOkotex, P04XM2_A10119PrdColIdx, P04XM2_A10881PrdLote, P04XM2_A10935PrdRTM,
            P04XM2_A10936PrdCtw1, P04XM2_A10937PrdCtw2, P04XM2_A10938PrdCtw3, P04XM2_A11196PrdNroCAS, P04XM2_A11363PrdGots, P04XM2_A11364PrdHm, P04XM2_A11470PrdConct, P04XM2_A11614PrdEINECS, P04XM2_A11615PrdFuncion, P04XM2_A11616PrdNmQu,
            P04XM2_A3936PrdEqLP, P04XM2_A3937PrdConc, P04XM2_n3937PrdConc, P04XM2_A11663PrdCtw4, P04XM2_A11687PrdList
            }
            , new Object[] {
            }
            , new Object[] {
            P04XM4_A12058DVPrdObs, P04XM4_n12058DVPrdObs, P04XM4_A396EmprCod, P04XM4_A11935DVPrdNum, P04XM4_A12003DVPrdNom, P04XM4_n12003DVPrdNom, P04XM4_A12004DVPrvNum, P04XM4_n12004DVPrvNum, P04XM4_A12006DVPrdPreAc, P04XM4_n12006DVPrdPreAc,
            P04XM4_A12008DVPrdDetPa, P04XM4_n12008DVPrdDetPa, P04XM4_A12013DVPrdPreMe, P04XM4_n12013DVPrdPreMe, P04XM4_A12014DVPrdRec, P04XM4_n12014DVPrdRec, P04XM4_A12015DVPrdPreAn, P04XM4_n12015DVPrdPreAn, P04XM4_A12016DVPrdFecPr, P04XM4_n12016DVPrdFecPr,
            P04XM4_A12024DVPrdFacCo, P04XM4_n12024DVPrdFacCo, P04XM4_A12025DVPrdConDi, P04XM4_n12025DVPrdConDi, P04XM4_A12026DVPrdStkMi, P04XM4_n12026DVPrdStkMi, P04XM4_A12027DVPrdStkMD, P04XM4_n12027DVPrdStkMD, P04XM4_A12029DVPrdPlaEn, P04XM4_n12029DVPrdPlaEn,
            P04XM4_A12030DVMetCod, P04XM4_n12030DVMetCod, P04XM4_A12031DVPrdLotMi, P04XM4_n12031DVPrdLotMi, P04XM4_A12032DVPrdNumUc, P04XM4_n12032DVPrdNumUc, P04XM4_A12034DVPrdFulPe, P04XM4_n12034DVPrdFulPe, P04XM4_A12035DVPrdFulCC, P04XM4_n12035DVPrdFulCC,
            P04XM4_A12036DVPrdConCC, P04XM4_n12036DVPrdConCC, P04XM4_A12037DVPrdDscTe, P04XM4_n12037DVPrdDscTe, P04XM4_A12038DVPrdUniCo, P04XM4_n12038DVPrdUniCo, P04XM4_A12039DVPrdUniCn, P04XM4_n12039DVPrdUniCn, P04XM4_A12040DVPrdRefPr, P04XM4_n12040DVPrdRefPr,
            P04XM4_A12041DVPrdSus, P04XM4_n12041DVPrdSus, P04XM4_A12042DVPrdCalNe, P04XM4_n12042DVPrdCalNe, P04XM4_A12043DVPrdSit, P04XM4_n12043DVPrdSit, P04XM4_A12044DVTipDtoCo, P04XM4_n12044DVTipDtoCo, P04XM4_A12047DVPrdFecEn, P04XM4_n12047DVPrdFecEn,
            P04XM4_A12048DVPrdPosX, P04XM4_n12048DVPrdPosX, P04XM4_A12049DVPrdPosY, P04XM4_n12049DVPrdPosY, P04XM4_A12050DVPrdTip, P04XM4_n12050DVPrdTip, P04XM4_A12051DVPrdDqo, P04XM4_n12051DVPrdDqo, P04XM4_A12052DVPrdRev, P04XM4_n12052DVPrdRev,
            P04XM4_A12053DVPrdTnq, P04XM4_n12053DVPrdTnq, P04XM4_A12055DVPrdUMeFo, P04XM4_n12055DVPrdUMeFo, P04XM4_A12056DVPrdNom2, P04XM4_n12056DVPrdNom2, P04XM4_A12057DVPrdNum2, P04XM4_n12057DVPrdNum2, P04XM4_A12059DVPrdPreA2, P04XM4_n12059DVPrdPreA2,
            P04XM4_A12060DVPrdDensS, P04XM4_n12060DVPrdDensS, P04XM4_A12061DVPrdConcS, P04XM4_n12061DVPrdConcS, P04XM4_A12062DVPrdSalM, P04XM4_n12062DVPrdSalM, P04XM4_A12063DVPrdSolub, P04XM4_n12063DVPrdSolub, P04XM4_A12064DVPrdNumCe, P04XM4_n12064DVPrdNumCe,
            P04XM4_A12065DVTipPrdCo, P04XM4_n12065DVTipPrdCo, P04XM4_A12066DVPrdNumct, P04XM4_n12066DVPrdNumct, P04XM4_A12067DVPrdNumc2, P04XM4_n12067DVPrdNumc2, P04XM4_A12068DVPrdHorMa, P04XM4_n12068DVPrdHorMa, P04XM4_A12069DVPrdPreRe, P04XM4_n12069DVPrdPreRe,
            P04XM4_A12070DVMat_Lts, P04XM4_n12070DVMat_Lts, P04XM4_A12073DVPrdAltAc, P04XM4_n12073DVPrdAltAc, P04XM4_A12074DVPrdPesCo, P04XM4_n12074DVPrdPesCo, P04XM4_A12075DVPrdPesTe, P04XM4_n12075DVPrdPesTe, P04XM4_A12077DVPrdSal, P04XM4_n12077DVPrdSal,
            P04XM4_A12078DVSubFamCo, P04XM4_n12078DVSubFamCo, P04XM4_A12079DVPrdInc, P04XM4_n12079DVPrdInc, P04XM4_A12080DVPrdComp, P04XM4_n12080DVPrdComp, P04XM4_A12081DVPrdAox, P04XM4_n12081DVPrdAox, P04XM4_A12082DVPrdNCAS, P04XM4_n12082DVPrdNCAS,
            P04XM4_A12083DVPrdFT, P04XM4_n12083DVPrdFT, P04XM4_A12084DVPrdFFT, P04XM4_n12084DVPrdFFT, P04XM4_A12085DVPrdHS, P04XM4_n12085DVPrdHS, P04XM4_A12086DVPrdFHS, P04XM4_n12086DVPrdFHS, P04XM4_A12087DVPrdReach, P04XM4_n12087DVPrdReach,
            P04XM4_A12088DVPrdOkote, P04XM4_n12088DVPrdOkote, P04XM4_A12089DVPrdColId, P04XM4_n12089DVPrdColId, P04XM4_A12090DVPrdLote, P04XM4_n12090DVPrdLote, P04XM4_A12091DVPrdRTM, P04XM4_n12091DVPrdRTM, P04XM4_A12092DVPrdCtw1, P04XM4_n12092DVPrdCtw1,
            P04XM4_A12093DVPrdCtw2, P04XM4_n12093DVPrdCtw2, P04XM4_A12094DVPrdCtw3, P04XM4_n12094DVPrdCtw3, P04XM4_A12095DVPrdNroCA, P04XM4_n12095DVPrdNroCA, P04XM4_A12096DVPrdGots, P04XM4_n12096DVPrdGots, P04XM4_A12097DVPrdHm, P04XM4_n12097DVPrdHm,
            P04XM4_A12098DVPrdConct, P04XM4_n12098DVPrdConct, P04XM4_A12099DVPrdEINEC, P04XM4_n12099DVPrdEINEC, P04XM4_A12100DVPrdFunci, P04XM4_n12100DVPrdFunci, P04XM4_A12101DVPrdNmQu, P04XM4_n12101DVPrdNmQu, P04XM4_A12102DVPrdEqLP, P04XM4_n12102DVPrdEqLP,
            P04XM4_A12103DVPrdConc, P04XM4_n12103DVPrdConc, P04XM4_A12104DVPrdCtw4, P04XM4_n12104DVPrdCtw4, P04XM4_A12105DVPrdList, P04XM4_n12105DVPrdList
            }
            , new Object[] {
            }
            , new Object[] {
            P04XM6_A396EmprCod, P04XM6_A719PrdNum, P04XM6_A6158PrdPrv, P04XM6_A7240PrdPrea, P04XM6_A10121PrdRefn
            }
            , new Object[] {
            }
            , new Object[] {
            P04XM8_A396EmprCod, P04XM8_A12106DVPrdPrv, P04XM8_A11935DVPrdNum, P04XM8_A12107DVPrdPrea, P04XM8_n12107DVPrdPrea, P04XM8_A12108DVPrdRefn, P04XM8_n12108DVPrdRefn
            }
            , new Object[] {
            }
            , new Object[] {
            P04XM10_A396EmprCod, P04XM10_A11935DVPrdNum, P04XM10_A12004DVPrvNum, P04XM10_n12004DVPrvNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private byte A629MetCod ;
   private byte A742PrdUniCom ;
   private byte A743PrdUniCon ;
   private byte A730PrdSit ;
   private byte A835TipDtoCod ;
   private byte A1194PrdPosY ;
   private byte A3273PrdTnq ;
   private byte A4338PrdUMeFo ;
   private byte A7260PrdHorMad ;
   private byte A8895PrdAltAct ;
   private byte A8896PrdPesCon ;
   private byte A9609SubFamCod ;
   private byte A12009DVValCod ;
   private byte A12030DVMetCod ;
   private byte A12038DVPrdUniCo ;
   private byte A12039DVPrdUniCn ;
   private byte A12043DVPrdSit ;
   private byte A12044DVTipDtoCo ;
   private byte A12053DVPrdTnq ;
   private byte A12055DVPrdUMeFo ;
   private byte A12068DVPrdHorMa ;
   private byte A12073DVPrdAltAc ;
   private byte A12074DVPrdPesCo ;
   private byte A12078DVSubFamCo ;
   private short A731PrdStkMinD ;
   private short A722PrdPlaEnt ;
   private short A716PrdLotMin ;
   private short A695PrdConCC ;
   private short A1193PrdPosX ;
   private short A1644PrdDqo ;
   private short A6301TipPrdCod ;
   private short A11470PrdConct ;
   private short A12007DVUltLinEn ;
   private short A12017DVMovEspUL ;
   private short A12021DVPrdUltCC ;
   private short A12027DVPrdStkMD ;
   private short A12028DVPrdDiaRo ;
   private short A12029DVPrdPlaEn ;
   private short A12031DVPrdLotMi ;
   private short A12036DVPrdConCC ;
   private short A12048DVPrdPosX ;
   private short A12049DVPrdPosY ;
   private short A12051DVPrdDqo ;
   private short A12065DVTipPrdCo ;
   private short A12098DVPrdConct ;
   private short Gx_err ;
   private int A795PrvNum ;
   private int GX_INS1678 ;
   private int A12004DVPrvNum ;
   private int A12072DVAlmc_Ult ;
   private int A6158PrdPrv ;
   private int GX_INS1679 ;
   private int A12106DVPrdPrv ;
   private long A12054DVCCStKULi ;
   private long A12076DVCC_Ultln ;
   private java.math.BigDecimal A696PrdConDia ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal A721PrdNumUco ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal A5416PrdDensS ;
   private java.math.BigDecimal A5417PrdConcS ;
   private java.math.BigDecimal A5590PrdSolub ;
   private java.math.BigDecimal A7226PrdNumct1 ;
   private java.math.BigDecimal A7227PrdNumct2 ;
   private java.math.BigDecimal A7763PrdPreRef ;
   private java.math.BigDecimal A8647Mat_Lts ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal A3937PrdConc ;
   private java.math.BigDecimal A12005DVPrdExiAl ;
   private java.math.BigDecimal A12006DVPrdPreAc ;
   private java.math.BigDecimal A12011DVPrdCanPe ;
   private java.math.BigDecimal A12012DVPrdRotRe ;
   private java.math.BigDecimal A12013DVPrdPreMe ;
   private java.math.BigDecimal A12015DVPrdPreAn ;
   private java.math.BigDecimal A12018DVPrdExiCC ;
   private java.math.BigDecimal A12019DVPrdUltDC ;
   private java.math.BigDecimal A12020DVPrdUltEC ;
   private java.math.BigDecimal A12022DVPrdExiCP ;
   private java.math.BigDecimal A12023DVPrdDifCC ;
   private java.math.BigDecimal A12024DVPrdFacCo ;
   private java.math.BigDecimal A12025DVPrdConDi ;
   private java.math.BigDecimal A12026DVPrdStkMi ;
   private java.math.BigDecimal A12032DVPrdNumUc ;
   private java.math.BigDecimal A12033DVPrdCanRe ;
   private java.math.BigDecimal A12045DVPrdValSt ;
   private java.math.BigDecimal A12046DVDifValSt ;
   private java.math.BigDecimal A12059DVPrdPreA2 ;
   private java.math.BigDecimal A12060DVPrdDensS ;
   private java.math.BigDecimal A12061DVPrdConcS ;
   private java.math.BigDecimal A12063DVPrdSolub ;
   private java.math.BigDecimal A12066DVPrdNumct ;
   private java.math.BigDecimal A12067DVPrdNumc2 ;
   private java.math.BigDecimal A12069DVPrdPreRe ;
   private java.math.BigDecimal A12070DVMat_Lts ;
   private java.math.BigDecimal A12071DVPrdExiAc ;
   private java.math.BigDecimal A12081DVPrdAox ;
   private java.math.BigDecimal A12103DVPrdConc ;
   private java.math.BigDecimal A7240PrdPrea ;
   private java.math.BigDecimal A12107DVPrdPrea ;
   private String A396EmprCod ;
   private String AV9Prdnum ;
   private String Gx_mode ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A698PrdDetPar ;
   private String A727PrdRec ;
   private String A703PrdDscTec ;
   private String A728PrdRefPrv ;
   private String A734PrdSus ;
   private String A682PrdCalNec ;
   private String A1643PrdTip ;
   private String A3004PrdRev ;
   private String A4692PrdNom2 ;
   private String A4693PrdNum2 ;
   private String A5418PrdSalM ;
   private String A6191PrdNumCent ;
   private String A8897PrdPesTerm ;
   private String A8936PrdSal ;
   private String A9731PrdInc ;
   private String A9732PrdComp ;
   private String A9734PrdNCAS ;
   private String A9739PrdFT ;
   private String A9741PrdHS ;
   private String A5887PrdReach ;
   private String A5888PrdOkotex ;
   private String A10119PrdColIdx ;
   private String A10881PrdLote ;
   private String A10935PrdRTM ;
   private String A10936PrdCtw1 ;
   private String A10937PrdCtw2 ;
   private String A10938PrdCtw3 ;
   private String A11196PrdNroCAS ;
   private String A11363PrdGots ;
   private String A11364PrdHm ;
   private String A11614PrdEINECS ;
   private String A11615PrdFuncion ;
   private String A3936PrdEqLP ;
   private String A11663PrdCtw4 ;
   private String A11687PrdList ;
   private String W396EmprCod ;
   private String A11935DVPrdNum ;
   private String A12003DVPrdNom ;
   private String A12008DVPrdDetPa ;
   private String A12014DVPrdRec ;
   private String A12037DVPrdDscTe ;
   private String A12040DVPrdRefPr ;
   private String A12041DVPrdSus ;
   private String A12042DVPrdCalNe ;
   private String A12050DVPrdTip ;
   private String A12052DVPrdRev ;
   private String A12056DVPrdNom2 ;
   private String A12057DVPrdNum2 ;
   private String A12062DVPrdSalM ;
   private String A12064DVPrdNumCe ;
   private String A12075DVPrdPesTe ;
   private String A12077DVPrdSal ;
   private String A12079DVPrdInc ;
   private String A12080DVPrdComp ;
   private String A12082DVPrdNCAS ;
   private String A12083DVPrdFT ;
   private String A12085DVPrdHS ;
   private String A12087DVPrdReach ;
   private String A12088DVPrdOkote ;
   private String A12089DVPrdColId ;
   private String A12090DVPrdLote ;
   private String A12091DVPrdRTM ;
   private String A12092DVPrdCtw1 ;
   private String A12093DVPrdCtw2 ;
   private String A12094DVPrdCtw3 ;
   private String A12095DVPrdNroCA ;
   private String A12096DVPrdGots ;
   private String A12097DVPrdHm ;
   private String A12099DVPrdEINEC ;
   private String A12100DVPrdFunci ;
   private String A12102DVPrdEqLP ;
   private String A12104DVPrdCtw4 ;
   private String A12105DVPrdList ;
   private String Gx_emsg ;
   private String A10121PrdRefn ;
   private String A12108DVPrdRefn ;
   private java.util.Date A713PrdFulEnt ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date A714PrdFulPed ;
   private java.util.Date A712PrdFulCC ;
   private java.util.Date A708PrdFecEnt ;
   private java.util.Date A9740PrdFFT ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date A12010DVPrdFulEn ;
   private java.util.Date A12016DVPrdFecPr ;
   private java.util.Date A12034DVPrdFulPe ;
   private java.util.Date A12035DVPrdFulCC ;
   private java.util.Date A12047DVPrdFecEn ;
   private java.util.Date A12084DVPrdFFT ;
   private java.util.Date A12086DVPrdFHS ;
   private boolean n629MetCod ;
   private boolean n734PrdSus ;
   private boolean n835TipDtoCod ;
   private boolean n6301TipPrdCod ;
   private boolean n7763PrdPreRef ;
   private boolean n8647Mat_Lts ;
   private boolean n8895PrdAltAct ;
   private boolean n9609SubFamCod ;
   private boolean n3937PrdConc ;
   private boolean n12003DVPrdNom ;
   private boolean n12004DVPrvNum ;
   private boolean n12005DVPrdExiAl ;
   private boolean n12006DVPrdPreAc ;
   private boolean n12007DVUltLinEn ;
   private boolean n12008DVPrdDetPa ;
   private boolean n12009DVValCod ;
   private boolean n12010DVPrdFulEn ;
   private boolean n12011DVPrdCanPe ;
   private boolean n12012DVPrdRotRe ;
   private boolean n12013DVPrdPreMe ;
   private boolean n12014DVPrdRec ;
   private boolean n12015DVPrdPreAn ;
   private boolean n12016DVPrdFecPr ;
   private boolean n12017DVMovEspUL ;
   private boolean n12018DVPrdExiCC ;
   private boolean n12019DVPrdUltDC ;
   private boolean n12020DVPrdUltEC ;
   private boolean n12021DVPrdUltCC ;
   private boolean n12022DVPrdExiCP ;
   private boolean n12023DVPrdDifCC ;
   private boolean n12024DVPrdFacCo ;
   private boolean n12025DVPrdConDi ;
   private boolean n12026DVPrdStkMi ;
   private boolean n12027DVPrdStkMD ;
   private boolean n12028DVPrdDiaRo ;
   private boolean n12029DVPrdPlaEn ;
   private boolean n12030DVMetCod ;
   private boolean n12031DVPrdLotMi ;
   private boolean n12032DVPrdNumUc ;
   private boolean n12033DVPrdCanRe ;
   private boolean n12034DVPrdFulPe ;
   private boolean n12035DVPrdFulCC ;
   private boolean n12036DVPrdConCC ;
   private boolean n12037DVPrdDscTe ;
   private boolean n12038DVPrdUniCo ;
   private boolean n12039DVPrdUniCn ;
   private boolean n12040DVPrdRefPr ;
   private boolean n12041DVPrdSus ;
   private boolean n12042DVPrdCalNe ;
   private boolean n12043DVPrdSit ;
   private boolean n12044DVTipDtoCo ;
   private boolean n12045DVPrdValSt ;
   private boolean n12046DVDifValSt ;
   private boolean n12047DVPrdFecEn ;
   private boolean n12048DVPrdPosX ;
   private boolean n12049DVPrdPosY ;
   private boolean n12050DVPrdTip ;
   private boolean n12051DVPrdDqo ;
   private boolean n12052DVPrdRev ;
   private boolean n12053DVPrdTnq ;
   private boolean n12054DVCCStKULi ;
   private boolean n12055DVPrdUMeFo ;
   private boolean n12056DVPrdNom2 ;
   private boolean n12057DVPrdNum2 ;
   private boolean n12058DVPrdObs ;
   private boolean n12059DVPrdPreA2 ;
   private boolean n12060DVPrdDensS ;
   private boolean n12061DVPrdConcS ;
   private boolean n12062DVPrdSalM ;
   private boolean n12063DVPrdSolub ;
   private boolean n12064DVPrdNumCe ;
   private boolean n12065DVTipPrdCo ;
   private boolean n12066DVPrdNumct ;
   private boolean n12067DVPrdNumc2 ;
   private boolean n12068DVPrdHorMa ;
   private boolean n12069DVPrdPreRe ;
   private boolean n12070DVMat_Lts ;
   private boolean n12071DVPrdExiAc ;
   private boolean n12072DVAlmc_Ult ;
   private boolean n12073DVPrdAltAc ;
   private boolean n12074DVPrdPesCo ;
   private boolean n12075DVPrdPesTe ;
   private boolean n12076DVCC_Ultln ;
   private boolean n12077DVPrdSal ;
   private boolean n12078DVSubFamCo ;
   private boolean n12079DVPrdInc ;
   private boolean n12080DVPrdComp ;
   private boolean n12081DVPrdAox ;
   private boolean n12082DVPrdNCAS ;
   private boolean n12083DVPrdFT ;
   private boolean n12084DVPrdFFT ;
   private boolean n12085DVPrdHS ;
   private boolean n12086DVPrdFHS ;
   private boolean n12087DVPrdReach ;
   private boolean n12088DVPrdOkote ;
   private boolean n12089DVPrdColId ;
   private boolean n12090DVPrdLote ;
   private boolean n12091DVPrdRTM ;
   private boolean n12092DVPrdCtw1 ;
   private boolean n12093DVPrdCtw2 ;
   private boolean n12094DVPrdCtw3 ;
   private boolean n12095DVPrdNroCA ;
   private boolean n12096DVPrdGots ;
   private boolean n12097DVPrdHm ;
   private boolean n12098DVPrdConct ;
   private boolean n12099DVPrdEINEC ;
   private boolean n12100DVPrdFunci ;
   private boolean n12101DVPrdNmQu ;
   private boolean n12102DVPrdEqLP ;
   private boolean n12103DVPrdConc ;
   private boolean n12104DVPrdCtw4 ;
   private boolean n12105DVPrdList ;
   private boolean n12107DVPrdPrea ;
   private boolean n12108DVPrdRefn ;
   private String A12058DVPrdObs ;
   private String A4694PrdObs ;
   private String A11616PrdNmQu ;
   private String A12101DVPrdNmQu ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04XM2_A396EmprCod ;
   private java.math.BigDecimal[] P04XM2_A696PrdConDia ;
   private String[] P04XM2_A719PrdNum ;
   private String[] P04XM2_A718PrdNom ;
   private int[] P04XM2_A795PrvNum ;
   private java.math.BigDecimal[] P04XM2_A724PrdPreAct ;
   private String[] P04XM2_A698PrdDetPar ;
   private byte[] P04XM2_A856ValCod ;
   private java.util.Date[] P04XM2_A713PrdFulEnt ;
   private java.math.BigDecimal[] P04XM2_A726PrdPreMed ;
   private String[] P04XM2_A727PrdRec ;
   private java.math.BigDecimal[] P04XM2_A725PrdPreAnt ;
   private java.util.Date[] P04XM2_A709PrdFecPre ;
   private java.math.BigDecimal[] P04XM2_A707PrdFacCon ;
   private java.math.BigDecimal[] P04XM2_A732PrdStkMinU ;
   private short[] P04XM2_A731PrdStkMinD ;
   private short[] P04XM2_A722PrdPlaEnt ;
   private byte[] P04XM2_A629MetCod ;
   private boolean[] P04XM2_n629MetCod ;
   private short[] P04XM2_A716PrdLotMin ;
   private java.math.BigDecimal[] P04XM2_A721PrdNumUco ;
   private java.util.Date[] P04XM2_A714PrdFulPed ;
   private java.util.Date[] P04XM2_A712PrdFulCC ;
   private short[] P04XM2_A695PrdConCC ;
   private String[] P04XM2_A703PrdDscTec ;
   private byte[] P04XM2_A742PrdUniCom ;
   private byte[] P04XM2_A743PrdUniCon ;
   private String[] P04XM2_A728PrdRefPrv ;
   private String[] P04XM2_A734PrdSus ;
   private boolean[] P04XM2_n734PrdSus ;
   private String[] P04XM2_A682PrdCalNec ;
   private byte[] P04XM2_A730PrdSit ;
   private byte[] P04XM2_A835TipDtoCod ;
   private boolean[] P04XM2_n835TipDtoCod ;
   private java.util.Date[] P04XM2_A708PrdFecEnt ;
   private short[] P04XM2_A1193PrdPosX ;
   private byte[] P04XM2_A1194PrdPosY ;
   private String[] P04XM2_A1643PrdTip ;
   private short[] P04XM2_A1644PrdDqo ;
   private String[] P04XM2_A3004PrdRev ;
   private byte[] P04XM2_A3273PrdTnq ;
   private byte[] P04XM2_A4338PrdUMeFo ;
   private String[] P04XM2_A4692PrdNom2 ;
   private String[] P04XM2_A4693PrdNum2 ;
   private String[] P04XM2_A4694PrdObs ;
   private java.math.BigDecimal[] P04XM2_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] P04XM2_A5416PrdDensS ;
   private java.math.BigDecimal[] P04XM2_A5417PrdConcS ;
   private String[] P04XM2_A5418PrdSalM ;
   private java.math.BigDecimal[] P04XM2_A5590PrdSolub ;
   private String[] P04XM2_A6191PrdNumCent ;
   private short[] P04XM2_A6301TipPrdCod ;
   private boolean[] P04XM2_n6301TipPrdCod ;
   private java.math.BigDecimal[] P04XM2_A7226PrdNumct1 ;
   private java.math.BigDecimal[] P04XM2_A7227PrdNumct2 ;
   private byte[] P04XM2_A7260PrdHorMad ;
   private java.math.BigDecimal[] P04XM2_A7763PrdPreRef ;
   private boolean[] P04XM2_n7763PrdPreRef ;
   private java.math.BigDecimal[] P04XM2_A8647Mat_Lts ;
   private boolean[] P04XM2_n8647Mat_Lts ;
   private byte[] P04XM2_A8895PrdAltAct ;
   private boolean[] P04XM2_n8895PrdAltAct ;
   private byte[] P04XM2_A8896PrdPesCon ;
   private String[] P04XM2_A8897PrdPesTerm ;
   private String[] P04XM2_A8936PrdSal ;
   private byte[] P04XM2_A9609SubFamCod ;
   private boolean[] P04XM2_n9609SubFamCod ;
   private String[] P04XM2_A9731PrdInc ;
   private String[] P04XM2_A9732PrdComp ;
   private java.math.BigDecimal[] P04XM2_A9733PrdAox ;
   private String[] P04XM2_A9734PrdNCAS ;
   private String[] P04XM2_A9739PrdFT ;
   private java.util.Date[] P04XM2_A9740PrdFFT ;
   private String[] P04XM2_A9741PrdHS ;
   private java.util.Date[] P04XM2_A9742PrdFHS ;
   private String[] P04XM2_A5887PrdReach ;
   private String[] P04XM2_A5888PrdOkotex ;
   private String[] P04XM2_A10119PrdColIdx ;
   private String[] P04XM2_A10881PrdLote ;
   private String[] P04XM2_A10935PrdRTM ;
   private String[] P04XM2_A10936PrdCtw1 ;
   private String[] P04XM2_A10937PrdCtw2 ;
   private String[] P04XM2_A10938PrdCtw3 ;
   private String[] P04XM2_A11196PrdNroCAS ;
   private String[] P04XM2_A11363PrdGots ;
   private String[] P04XM2_A11364PrdHm ;
   private short[] P04XM2_A11470PrdConct ;
   private String[] P04XM2_A11614PrdEINECS ;
   private String[] P04XM2_A11615PrdFuncion ;
   private String[] P04XM2_A11616PrdNmQu ;
   private String[] P04XM2_A3936PrdEqLP ;
   private java.math.BigDecimal[] P04XM2_A3937PrdConc ;
   private boolean[] P04XM2_n3937PrdConc ;
   private String[] P04XM2_A11663PrdCtw4 ;
   private String[] P04XM2_A11687PrdList ;
   private String[] P04XM4_A12058DVPrdObs ;
   private boolean[] P04XM4_n12058DVPrdObs ;
   private String[] P04XM4_A396EmprCod ;
   private String[] P04XM4_A11935DVPrdNum ;
   private String[] P04XM4_A12003DVPrdNom ;
   private boolean[] P04XM4_n12003DVPrdNom ;
   private int[] P04XM4_A12004DVPrvNum ;
   private boolean[] P04XM4_n12004DVPrvNum ;
   private java.math.BigDecimal[] P04XM4_A12006DVPrdPreAc ;
   private boolean[] P04XM4_n12006DVPrdPreAc ;
   private String[] P04XM4_A12008DVPrdDetPa ;
   private boolean[] P04XM4_n12008DVPrdDetPa ;
   private java.math.BigDecimal[] P04XM4_A12013DVPrdPreMe ;
   private boolean[] P04XM4_n12013DVPrdPreMe ;
   private String[] P04XM4_A12014DVPrdRec ;
   private boolean[] P04XM4_n12014DVPrdRec ;
   private java.math.BigDecimal[] P04XM4_A12015DVPrdPreAn ;
   private boolean[] P04XM4_n12015DVPrdPreAn ;
   private java.util.Date[] P04XM4_A12016DVPrdFecPr ;
   private boolean[] P04XM4_n12016DVPrdFecPr ;
   private java.math.BigDecimal[] P04XM4_A12024DVPrdFacCo ;
   private boolean[] P04XM4_n12024DVPrdFacCo ;
   private java.math.BigDecimal[] P04XM4_A12025DVPrdConDi ;
   private boolean[] P04XM4_n12025DVPrdConDi ;
   private java.math.BigDecimal[] P04XM4_A12026DVPrdStkMi ;
   private boolean[] P04XM4_n12026DVPrdStkMi ;
   private short[] P04XM4_A12027DVPrdStkMD ;
   private boolean[] P04XM4_n12027DVPrdStkMD ;
   private short[] P04XM4_A12029DVPrdPlaEn ;
   private boolean[] P04XM4_n12029DVPrdPlaEn ;
   private byte[] P04XM4_A12030DVMetCod ;
   private boolean[] P04XM4_n12030DVMetCod ;
   private short[] P04XM4_A12031DVPrdLotMi ;
   private boolean[] P04XM4_n12031DVPrdLotMi ;
   private java.math.BigDecimal[] P04XM4_A12032DVPrdNumUc ;
   private boolean[] P04XM4_n12032DVPrdNumUc ;
   private java.util.Date[] P04XM4_A12034DVPrdFulPe ;
   private boolean[] P04XM4_n12034DVPrdFulPe ;
   private java.util.Date[] P04XM4_A12035DVPrdFulCC ;
   private boolean[] P04XM4_n12035DVPrdFulCC ;
   private short[] P04XM4_A12036DVPrdConCC ;
   private boolean[] P04XM4_n12036DVPrdConCC ;
   private String[] P04XM4_A12037DVPrdDscTe ;
   private boolean[] P04XM4_n12037DVPrdDscTe ;
   private byte[] P04XM4_A12038DVPrdUniCo ;
   private boolean[] P04XM4_n12038DVPrdUniCo ;
   private byte[] P04XM4_A12039DVPrdUniCn ;
   private boolean[] P04XM4_n12039DVPrdUniCn ;
   private String[] P04XM4_A12040DVPrdRefPr ;
   private boolean[] P04XM4_n12040DVPrdRefPr ;
   private String[] P04XM4_A12041DVPrdSus ;
   private boolean[] P04XM4_n12041DVPrdSus ;
   private String[] P04XM4_A12042DVPrdCalNe ;
   private boolean[] P04XM4_n12042DVPrdCalNe ;
   private byte[] P04XM4_A12043DVPrdSit ;
   private boolean[] P04XM4_n12043DVPrdSit ;
   private byte[] P04XM4_A12044DVTipDtoCo ;
   private boolean[] P04XM4_n12044DVTipDtoCo ;
   private java.util.Date[] P04XM4_A12047DVPrdFecEn ;
   private boolean[] P04XM4_n12047DVPrdFecEn ;
   private short[] P04XM4_A12048DVPrdPosX ;
   private boolean[] P04XM4_n12048DVPrdPosX ;
   private short[] P04XM4_A12049DVPrdPosY ;
   private boolean[] P04XM4_n12049DVPrdPosY ;
   private String[] P04XM4_A12050DVPrdTip ;
   private boolean[] P04XM4_n12050DVPrdTip ;
   private short[] P04XM4_A12051DVPrdDqo ;
   private boolean[] P04XM4_n12051DVPrdDqo ;
   private String[] P04XM4_A12052DVPrdRev ;
   private boolean[] P04XM4_n12052DVPrdRev ;
   private byte[] P04XM4_A12053DVPrdTnq ;
   private boolean[] P04XM4_n12053DVPrdTnq ;
   private byte[] P04XM4_A12055DVPrdUMeFo ;
   private boolean[] P04XM4_n12055DVPrdUMeFo ;
   private String[] P04XM4_A12056DVPrdNom2 ;
   private boolean[] P04XM4_n12056DVPrdNom2 ;
   private String[] P04XM4_A12057DVPrdNum2 ;
   private boolean[] P04XM4_n12057DVPrdNum2 ;
   private java.math.BigDecimal[] P04XM4_A12059DVPrdPreA2 ;
   private boolean[] P04XM4_n12059DVPrdPreA2 ;
   private java.math.BigDecimal[] P04XM4_A12060DVPrdDensS ;
   private boolean[] P04XM4_n12060DVPrdDensS ;
   private java.math.BigDecimal[] P04XM4_A12061DVPrdConcS ;
   private boolean[] P04XM4_n12061DVPrdConcS ;
   private String[] P04XM4_A12062DVPrdSalM ;
   private boolean[] P04XM4_n12062DVPrdSalM ;
   private java.math.BigDecimal[] P04XM4_A12063DVPrdSolub ;
   private boolean[] P04XM4_n12063DVPrdSolub ;
   private String[] P04XM4_A12064DVPrdNumCe ;
   private boolean[] P04XM4_n12064DVPrdNumCe ;
   private short[] P04XM4_A12065DVTipPrdCo ;
   private boolean[] P04XM4_n12065DVTipPrdCo ;
   private java.math.BigDecimal[] P04XM4_A12066DVPrdNumct ;
   private boolean[] P04XM4_n12066DVPrdNumct ;
   private java.math.BigDecimal[] P04XM4_A12067DVPrdNumc2 ;
   private boolean[] P04XM4_n12067DVPrdNumc2 ;
   private byte[] P04XM4_A12068DVPrdHorMa ;
   private boolean[] P04XM4_n12068DVPrdHorMa ;
   private java.math.BigDecimal[] P04XM4_A12069DVPrdPreRe ;
   private boolean[] P04XM4_n12069DVPrdPreRe ;
   private java.math.BigDecimal[] P04XM4_A12070DVMat_Lts ;
   private boolean[] P04XM4_n12070DVMat_Lts ;
   private byte[] P04XM4_A12073DVPrdAltAc ;
   private boolean[] P04XM4_n12073DVPrdAltAc ;
   private byte[] P04XM4_A12074DVPrdPesCo ;
   private boolean[] P04XM4_n12074DVPrdPesCo ;
   private String[] P04XM4_A12075DVPrdPesTe ;
   private boolean[] P04XM4_n12075DVPrdPesTe ;
   private String[] P04XM4_A12077DVPrdSal ;
   private boolean[] P04XM4_n12077DVPrdSal ;
   private byte[] P04XM4_A12078DVSubFamCo ;
   private boolean[] P04XM4_n12078DVSubFamCo ;
   private String[] P04XM4_A12079DVPrdInc ;
   private boolean[] P04XM4_n12079DVPrdInc ;
   private String[] P04XM4_A12080DVPrdComp ;
   private boolean[] P04XM4_n12080DVPrdComp ;
   private java.math.BigDecimal[] P04XM4_A12081DVPrdAox ;
   private boolean[] P04XM4_n12081DVPrdAox ;
   private String[] P04XM4_A12082DVPrdNCAS ;
   private boolean[] P04XM4_n12082DVPrdNCAS ;
   private String[] P04XM4_A12083DVPrdFT ;
   private boolean[] P04XM4_n12083DVPrdFT ;
   private java.util.Date[] P04XM4_A12084DVPrdFFT ;
   private boolean[] P04XM4_n12084DVPrdFFT ;
   private String[] P04XM4_A12085DVPrdHS ;
   private boolean[] P04XM4_n12085DVPrdHS ;
   private java.util.Date[] P04XM4_A12086DVPrdFHS ;
   private boolean[] P04XM4_n12086DVPrdFHS ;
   private String[] P04XM4_A12087DVPrdReach ;
   private boolean[] P04XM4_n12087DVPrdReach ;
   private String[] P04XM4_A12088DVPrdOkote ;
   private boolean[] P04XM4_n12088DVPrdOkote ;
   private String[] P04XM4_A12089DVPrdColId ;
   private boolean[] P04XM4_n12089DVPrdColId ;
   private String[] P04XM4_A12090DVPrdLote ;
   private boolean[] P04XM4_n12090DVPrdLote ;
   private String[] P04XM4_A12091DVPrdRTM ;
   private boolean[] P04XM4_n12091DVPrdRTM ;
   private String[] P04XM4_A12092DVPrdCtw1 ;
   private boolean[] P04XM4_n12092DVPrdCtw1 ;
   private String[] P04XM4_A12093DVPrdCtw2 ;
   private boolean[] P04XM4_n12093DVPrdCtw2 ;
   private String[] P04XM4_A12094DVPrdCtw3 ;
   private boolean[] P04XM4_n12094DVPrdCtw3 ;
   private String[] P04XM4_A12095DVPrdNroCA ;
   private boolean[] P04XM4_n12095DVPrdNroCA ;
   private String[] P04XM4_A12096DVPrdGots ;
   private boolean[] P04XM4_n12096DVPrdGots ;
   private String[] P04XM4_A12097DVPrdHm ;
   private boolean[] P04XM4_n12097DVPrdHm ;
   private short[] P04XM4_A12098DVPrdConct ;
   private boolean[] P04XM4_n12098DVPrdConct ;
   private String[] P04XM4_A12099DVPrdEINEC ;
   private boolean[] P04XM4_n12099DVPrdEINEC ;
   private String[] P04XM4_A12100DVPrdFunci ;
   private boolean[] P04XM4_n12100DVPrdFunci ;
   private String[] P04XM4_A12101DVPrdNmQu ;
   private boolean[] P04XM4_n12101DVPrdNmQu ;
   private String[] P04XM4_A12102DVPrdEqLP ;
   private boolean[] P04XM4_n12102DVPrdEqLP ;
   private java.math.BigDecimal[] P04XM4_A12103DVPrdConc ;
   private boolean[] P04XM4_n12103DVPrdConc ;
   private String[] P04XM4_A12104DVPrdCtw4 ;
   private boolean[] P04XM4_n12104DVPrdCtw4 ;
   private String[] P04XM4_A12105DVPrdList ;
   private boolean[] P04XM4_n12105DVPrdList ;
   private String[] P04XM6_A396EmprCod ;
   private String[] P04XM6_A719PrdNum ;
   private int[] P04XM6_A6158PrdPrv ;
   private java.math.BigDecimal[] P04XM6_A7240PrdPrea ;
   private String[] P04XM6_A10121PrdRefn ;
   private String[] P04XM8_A396EmprCod ;
   private int[] P04XM8_A12106DVPrdPrv ;
   private String[] P04XM8_A11935DVPrdNum ;
   private java.math.BigDecimal[] P04XM8_A12107DVPrdPrea ;
   private boolean[] P04XM8_n12107DVPrdPrea ;
   private String[] P04XM8_A12108DVPrdRefn ;
   private boolean[] P04XM8_n12108DVPrdRefn ;
   private String[] P04XM10_A396EmprCod ;
   private String[] P04XM10_A11935DVPrdNum ;
   private int[] P04XM10_A12004DVPrvNum ;
   private boolean[] P04XM10_n12004DVPrvNum ;
}

final  class pdvproduc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04XM2", "SELECT EmprCod, PrdConDia, PrdNum, PrdNom, PrvNum, PrdPreAct, PrdDetPar, ValCod, PrdFulEnt, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, PrdFacCon, PrdStkMinU, PrdStkMinD, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdAltAct, PrdPesCon, PrdPesTerm, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04XM3", "INSERT INTO LVNDVPRODUC(Emprcod, Prdnum, PrdNom, PrvNum, PrdExiAlm, PrdPreAct, UltLinEnt, PrdDetPar, ValCod, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, MovEspULin, PrdExiCC, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "LVNDVPRODUC")
         ,new ForEachCursor("P04XM4", "SELECT PrdObs, Emprcod AS EmprCod, Prdnum AS DVPrdNum, PrdNom, PrvNum, PrdPreAct, PrdDetPar, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdUMeFo, PrdNom2, PrdNum2, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdAltAct, PrdPesCon, PrdPesTerm, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList FROM LVNDVPRODUC WHERE Emprcod = ? and Prdnum = ? ORDER BY Emprcod, Prdnum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04XM5", "UPDATE LVNDVPRODUC SET PrdNom=?, PrvNum=?, PrdPreAct=?, PrdDetPar=?, PrdPreMed=?, PrdRec=?, PrdPreAnt=?, PrdFecPre=?, PrdFacCon=?, PrdConDia=?, PrdStkMinU=?, PrdStkMinD=?, PrdPlaEnt=?, MetCod=?, PrdLotMin=?, PrdNumUco=?, PrdFulPed=?, PrdFulCC=?, PrdConCC=?, PrdDscTec=?, PrdUniCom=?, PrdUniCon=?, PrdRefPrv=?, PrdSus=?, PrdCalNec=?, PrdSit=?, TipDtoCod=?, PrdFecEnt=?, PrdPosX=?, PrdPosY=?, PrdTip=?, PrdDqo=?, PrdRev=?, PrdTnq=?, PrdUMeFo=?, PrdNom2=?, PrdNum2=?, PrdObs=?, PrdPreAc2=?, PrdDensS=?, PrdConcS=?, PrdSalM=?, PrdSolub=?, PrdNumCent=?, TipPrdCod=?, PrdNumct1=?, PrdNumct2=?, PrdHorMad=?, PrdPreRef=?, Mat_Lts=?, PrdAltAct=?, PrdPesCon=?, PrdPesTerm=?, PrdSal=?, SubFamCod=?, PrdInc=?, PrdComp=?, PrdAox=?, PrdNCAS=?, PrdFT=?, PrdFFT=?, PrdHS=?, PrdFHS=?, PrdReach=?, PrdOkotex=?, PrdColIdx=?, PrdLote=?, PrdRTM=?, PrdCtw1=?, PrdCtw2=?, PrdCtw3=?, PrdNroCAS=?, PrdGots=?, PrdHm=?, PrdConct=?, PrdEINECS=?, PrdFuncion=?, PrdNmQu=?, PrdEqLP=?, PrdConc=?, PrdCtw4=?, PrdList=?  WHERE Emprcod = ? AND Prdnum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "LVNDVPRODUC")
         ,new ForEachCursor("P04XM6", "SELECT EmprCod, PrdNum, PrdPrv, PrdPrea, PrdRefn FROM TXPPROPRV WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, PrdPrv ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04XM7", "INSERT INTO LVNPROPRV(Emprcod, Prdnum, PrdPrv, PrdPrea, PrdRefn) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "LVNPROPRV")
         ,new ForEachCursor("P04XM8", "SELECT Emprcod AS EmprCod, PrdPrv, Prdnum AS DVPrdNum, PrdPrea, PrdRefn FROM LVNPROPRV WHERE Emprcod = ? and Prdnum = ? and PrdPrv = ? ORDER BY Emprcod, Prdnum, PrdPrv ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04XM9", "UPDATE LVNPROPRV SET PrdPrea=?, PrdRefn=?  WHERE Emprcod = ? AND Prdnum = ? AND PrdPrv = ?", GX_NOMASK + GX_MASKLOOPLOCK, "LVNPROPRV")
         ,new ForEachCursor("P04XM10", "SELECT Emprcod AS EmprCod, Prdnum AS DVPrdNum, PrvNum FROM LVNDVPRODUC WHERE Emprcod = ? and Prdnum = ? ORDER BY Emprcod, Prdnum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04XM11", "DELETE FROM LVNDVPRODUC  WHERE Emprcod = ? AND Prdnum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "LVNDVPRODUC")
         ,new UpdateCursor("P04XM12", "DELETE FROM LVNDVPRODUC  WHERE Emprcod = ? AND Prdnum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "LVNDVPRODUC")
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,4);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(21);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(22);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 4);
               ((byte[]) buf[25])[0] = rslt.getByte(25);
               ((byte[]) buf[26])[0] = rslt.getByte(26);
               ((String[]) buf[27])[0] = rslt.getString(27, 30);
               ((String[]) buf[28])[0] = rslt.getString(28, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(29, 1);
               ((byte[]) buf[31])[0] = rslt.getByte(30);
               ((byte[]) buf[32])[0] = rslt.getByte(31);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(32);
               ((short[]) buf[35])[0] = rslt.getShort(33);
               ((byte[]) buf[36])[0] = rslt.getByte(34);
               ((String[]) buf[37])[0] = rslt.getString(35, 1);
               ((short[]) buf[38])[0] = rslt.getShort(36);
               ((String[]) buf[39])[0] = rslt.getString(37, 1);
               ((byte[]) buf[40])[0] = rslt.getByte(38);
               ((byte[]) buf[41])[0] = rslt.getByte(39);
               ((String[]) buf[42])[0] = rslt.getString(40, 40);
               ((String[]) buf[43])[0] = rslt.getString(41, 16);
               ((String[]) buf[44])[0] = rslt.getVarchar(42);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(43,5);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(44,3);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(45,3);
               ((String[]) buf[48])[0] = rslt.getString(46, 1);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(47,2);
               ((String[]) buf[50])[0] = rslt.getString(48, 6);
               ((short[]) buf[51])[0] = rslt.getShort(49);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(50,2);
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(51,2);
               ((byte[]) buf[55])[0] = rslt.getByte(52);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(53,5);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(54,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((byte[]) buf[60])[0] = rslt.getByte(55);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((byte[]) buf[62])[0] = rslt.getByte(56);
               ((String[]) buf[63])[0] = rslt.getString(57, 10);
               ((String[]) buf[64])[0] = rslt.getString(58, 1);
               ((byte[]) buf[65])[0] = rslt.getByte(59);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(60, 2);
               ((String[]) buf[68])[0] = rslt.getString(61, 2);
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(62,2);
               ((String[]) buf[70])[0] = rslt.getString(63, 30);
               ((String[]) buf[71])[0] = rslt.getString(64, 1);
               ((java.util.Date[]) buf[72])[0] = rslt.getGXDate(65);
               ((String[]) buf[73])[0] = rslt.getString(66, 1);
               ((java.util.Date[]) buf[74])[0] = rslt.getGXDate(67);
               ((String[]) buf[75])[0] = rslt.getString(68, 1);
               ((String[]) buf[76])[0] = rslt.getString(69, 1);
               ((String[]) buf[77])[0] = rslt.getString(70, 10);
               ((String[]) buf[78])[0] = rslt.getString(71, 26);
               ((String[]) buf[79])[0] = rslt.getString(72, 10);
               ((String[]) buf[80])[0] = rslt.getString(73, 3);
               ((String[]) buf[81])[0] = rslt.getString(74, 20);
               ((String[]) buf[82])[0] = rslt.getString(75, 3);
               ((String[]) buf[83])[0] = rslt.getString(76, 40);
               ((String[]) buf[84])[0] = rslt.getString(77, 1);
               ((String[]) buf[85])[0] = rslt.getString(78, 1);
               ((short[]) buf[86])[0] = rslt.getShort(79);
               ((String[]) buf[87])[0] = rslt.getString(80, 40);
               ((String[]) buf[88])[0] = rslt.getString(81, 50);
               ((String[]) buf[89])[0] = rslt.getVarchar(82);
               ((String[]) buf[90])[0] = rslt.getString(83, 6);
               ((java.math.BigDecimal[]) buf[91])[0] = rslt.getBigDecimal(84,2);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(85, 3);
               ((String[]) buf[94])[0] = rslt.getString(86, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,4);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((byte[]) buf[30])[0] = rslt.getByte(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDate(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(22);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 4);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((byte[]) buf[44])[0] = rslt.getByte(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((byte[]) buf[46])[0] = rslt.getByte(25);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 30);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(27, 6);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((byte[]) buf[54])[0] = rslt.getByte(29);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((byte[]) buf[56])[0] = rslt.getByte(30);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[58])[0] = rslt.getGXDate(31);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(32);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((short[]) buf[62])[0] = rslt.getShort(33);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(35);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(36, 1);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((byte[]) buf[70])[0] = rslt.getByte(37);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((byte[]) buf[72])[0] = rslt.getByte(38);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(39, 40);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(40, 16);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[78])[0] = rslt.getBigDecimal(41,5);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[80])[0] = rslt.getBigDecimal(42,3);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(43,3);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(44, 1);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(45,2);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(46, 6);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((short[]) buf[90])[0] = rslt.getShort(47);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[92])[0] = rslt.getBigDecimal(48,2);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[94])[0] = rslt.getBigDecimal(49,2);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((byte[]) buf[96])[0] = rslt.getByte(50);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[98])[0] = rslt.getBigDecimal(51,5);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[100])[0] = rslt.getBigDecimal(52,2);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((byte[]) buf[102])[0] = rslt.getByte(53);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((byte[]) buf[104])[0] = rslt.getByte(54);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(55, 10);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getString(56, 1);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((byte[]) buf[110])[0] = rslt.getByte(57);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getString(58, 2);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getString(59, 2);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[116])[0] = rslt.getBigDecimal(60,2);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(61, 30);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((String[]) buf[120])[0] = rslt.getString(62, 1);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[122])[0] = rslt.getGXDate(63);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getString(64, 1);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[126])[0] = rslt.getGXDate(65);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getString(66, 1);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getString(67, 1);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getString(68, 10);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getString(69, 26);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getString(70, 10);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((String[]) buf[138])[0] = rslt.getString(71, 3);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((String[]) buf[140])[0] = rslt.getString(72, 20);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((String[]) buf[142])[0] = rslt.getString(73, 3);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((String[]) buf[144])[0] = rslt.getString(74, 40);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((String[]) buf[146])[0] = rslt.getString(75, 1);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((String[]) buf[148])[0] = rslt.getString(76, 1);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((short[]) buf[150])[0] = rslt.getShort(77);
               ((boolean[]) buf[151])[0] = rslt.wasNull();
               ((String[]) buf[152])[0] = rslt.getString(78, 40);
               ((boolean[]) buf[153])[0] = rslt.wasNull();
               ((String[]) buf[154])[0] = rslt.getString(79, 50);
               ((boolean[]) buf[155])[0] = rslt.wasNull();
               ((String[]) buf[156])[0] = rslt.getVarchar(80);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((String[]) buf[158])[0] = rslt.getString(81, 6);
               ((boolean[]) buf[159])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[160])[0] = rslt.getBigDecimal(82,2);
               ((boolean[]) buf[161])[0] = rslt.wasNull();
               ((String[]) buf[162])[0] = rslt.getString(83, 3);
               ((boolean[]) buf[163])[0] = rslt.wasNull();
               ((String[]) buf[164])[0] = rslt.getString(84, 1);
               ((boolean[]) buf[165])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 26);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[19], 4);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[21], 5);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[23], 5);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DATE );
               }
               else
               {
                  stmt.setDate(16, (java.util.Date)parms[29]);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[33], 4);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[45], 4);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[53]).shortValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[55]).shortValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(30, ((Number) parms[57]).byteValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[59]).shortValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[63], 4);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DATE );
               }
               else
               {
                  stmt.setDate(34, (java.util.Date)parms[65]);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DATE );
               }
               else
               {
                  stmt.setDate(35, (java.util.Date)parms[67]);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[69]).shortValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[71], 4);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(38, ((Number) parms[73]).byteValue());
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(39, ((Number) parms[75]).byteValue());
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[77], 30);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[79], 6);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[81], 1);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(43, ((Number) parms[83]).byteValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(44, ((Number) parms[85]).byteValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(45, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(46, (java.math.BigDecimal)parms[89], 2);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.DATE );
               }
               else
               {
                  stmt.setDate(47, (java.util.Date)parms[91]);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(48, ((Number) parms[93]).shortValue());
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(49, ((Number) parms[95]).shortValue());
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[97], 1);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(51, ((Number) parms[99]).shortValue());
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[101], 1);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(53, ((Number) parms[103]).byteValue());
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(54, ((Number) parms[105]).longValue());
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(55, ((Number) parms[107]).byteValue());
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[109], 40);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[111], 16);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(58, (String)parms[113]);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(59, (java.math.BigDecimal)parms[115], 5);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(60, (java.math.BigDecimal)parms[117], 3);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(61, (java.math.BigDecimal)parms[119], 3);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(62, (String)parms[121], 1);
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(63, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(64, (String)parms[125], 6);
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(65, ((Number) parms[127]).shortValue());
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(66, (java.math.BigDecimal)parms[129], 2);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(67, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(68, ((Number) parms[133]).byteValue());
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(69, (java.math.BigDecimal)parms[135], 5);
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(70, (java.math.BigDecimal)parms[137], 2);
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(71, (java.math.BigDecimal)parms[139], 4);
               }
               if ( ((Boolean) parms[140]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(72, ((Number) parms[141]).intValue());
               }
               if ( ((Boolean) parms[142]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(73, ((Number) parms[143]).byteValue());
               }
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(74, ((Number) parms[145]).byteValue());
               }
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(75, (String)parms[147], 10);
               }
               if ( ((Boolean) parms[148]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(76, ((Number) parms[149]).longValue());
               }
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(77, (String)parms[151], 1);
               }
               if ( ((Boolean) parms[152]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(78, ((Number) parms[153]).byteValue());
               }
               if ( ((Boolean) parms[154]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(79, (String)parms[155], 2);
               }
               if ( ((Boolean) parms[156]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(80, (String)parms[157], 2);
               }
               if ( ((Boolean) parms[158]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(81, (java.math.BigDecimal)parms[159], 2);
               }
               if ( ((Boolean) parms[160]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(82, (String)parms[161], 30);
               }
               if ( ((Boolean) parms[162]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(83, (String)parms[163], 1);
               }
               if ( ((Boolean) parms[164]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.DATE );
               }
               else
               {
                  stmt.setDate(84, (java.util.Date)parms[165]);
               }
               if ( ((Boolean) parms[166]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(85, (String)parms[167], 1);
               }
               if ( ((Boolean) parms[168]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.DATE );
               }
               else
               {
                  stmt.setDate(86, (java.util.Date)parms[169]);
               }
               if ( ((Boolean) parms[170]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(87, (String)parms[171], 1);
               }
               if ( ((Boolean) parms[172]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(88, (String)parms[173], 1);
               }
               if ( ((Boolean) parms[174]).booleanValue() )
               {
                  stmt.setNull( 89 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(89, (String)parms[175], 10);
               }
               if ( ((Boolean) parms[176]).booleanValue() )
               {
                  stmt.setNull( 90 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(90, (String)parms[177], 26);
               }
               if ( ((Boolean) parms[178]).booleanValue() )
               {
                  stmt.setNull( 91 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(91, (String)parms[179], 10);
               }
               if ( ((Boolean) parms[180]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(92, (String)parms[181], 3);
               }
               if ( ((Boolean) parms[182]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(93, (String)parms[183], 20);
               }
               if ( ((Boolean) parms[184]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(94, (String)parms[185], 3);
               }
               if ( ((Boolean) parms[186]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(95, (String)parms[187], 40);
               }
               if ( ((Boolean) parms[188]).booleanValue() )
               {
                  stmt.setNull( 96 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(96, (String)parms[189], 1);
               }
               if ( ((Boolean) parms[190]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(97, (String)parms[191], 1);
               }
               if ( ((Boolean) parms[192]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(98, ((Number) parms[193]).shortValue());
               }
               if ( ((Boolean) parms[194]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(99, (String)parms[195], 40);
               }
               if ( ((Boolean) parms[196]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(100, (String)parms[197], 50);
               }
               if ( ((Boolean) parms[198]).booleanValue() )
               {
                  stmt.setNull( 101 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(101, (String)parms[199], 200);
               }
               if ( ((Boolean) parms[200]).booleanValue() )
               {
                  stmt.setNull( 102 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(102, (String)parms[201], 6);
               }
               if ( ((Boolean) parms[202]).booleanValue() )
               {
                  stmt.setNull( 103 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(103, (java.math.BigDecimal)parms[203], 2);
               }
               if ( ((Boolean) parms[204]).booleanValue() )
               {
                  stmt.setNull( 104 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(104, (String)parms[205], 3);
               }
               if ( ((Boolean) parms[206]).booleanValue() )
               {
                  stmt.setNull( 105 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(105, (String)parms[207], 1);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 5);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[17], 4);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DATE );
               }
               else
               {
                  stmt.setDate(17, (java.util.Date)parms[33]);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DATE );
               }
               else
               {
                  stmt.setDate(18, (java.util.Date)parms[35]);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 4);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[41]).byteValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[43]).byteValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 30);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 6);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(26, ((Number) parms[51]).byteValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[53]).byteValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DATE );
               }
               else
               {
                  stmt.setDate(28, (java.util.Date)parms[55]);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[59]).shortValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 1);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[65], 1);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(34, ((Number) parms[67]).byteValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(35, ((Number) parms[69]).byteValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[71], 40);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[73], 16);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(38, (String)parms[75]);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(39, (java.math.BigDecimal)parms[77], 5);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(40, (java.math.BigDecimal)parms[79], 3);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(41, (java.math.BigDecimal)parms[81], 3);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[83], 1);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(43, (java.math.BigDecimal)parms[85], 2);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[87], 6);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(45, ((Number) parms[89]).shortValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(46, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(47, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(48, ((Number) parms[95]).byteValue());
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(49, (java.math.BigDecimal)parms[97], 5);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(50, (java.math.BigDecimal)parms[99], 2);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(51, ((Number) parms[101]).byteValue());
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(52, ((Number) parms[103]).byteValue());
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[105], 10);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[107], 1);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(55, ((Number) parms[109]).byteValue());
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[111], 2);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[113], 2);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(58, (java.math.BigDecimal)parms[115], 2);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[117], 30);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(60, (String)parms[119], 1);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.DATE );
               }
               else
               {
                  stmt.setDate(61, (java.util.Date)parms[121]);
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(62, (String)parms[123], 1);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.DATE );
               }
               else
               {
                  stmt.setDate(63, (java.util.Date)parms[125]);
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(64, (String)parms[127], 1);
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(65, (String)parms[129], 1);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(66, (String)parms[131], 10);
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(67, (String)parms[133], 26);
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(68, (String)parms[135], 10);
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(69, (String)parms[137], 3);
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(70, (String)parms[139], 20);
               }
               if ( ((Boolean) parms[140]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(71, (String)parms[141], 3);
               }
               if ( ((Boolean) parms[142]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(72, (String)parms[143], 40);
               }
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[145], 1);
               }
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[147], 1);
               }
               if ( ((Boolean) parms[148]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(75, ((Number) parms[149]).shortValue());
               }
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(76, (String)parms[151], 40);
               }
               if ( ((Boolean) parms[152]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(77, (String)parms[153], 50);
               }
               if ( ((Boolean) parms[154]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(78, (String)parms[155], 200);
               }
               if ( ((Boolean) parms[156]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(79, (String)parms[157], 6);
               }
               if ( ((Boolean) parms[158]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(80, (java.math.BigDecimal)parms[159], 2);
               }
               if ( ((Boolean) parms[160]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(81, (String)parms[161], 3);
               }
               if ( ((Boolean) parms[162]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(82, (String)parms[163], 1);
               }
               stmt.setString(83, (String)parms[164], 3);
               stmt.setString(84, (String)parms[165], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 30);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setString(4, (String)parms[5], 6);
               stmt.setInt(5, ((Number) parms[6]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

