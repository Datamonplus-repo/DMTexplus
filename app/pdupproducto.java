package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdupproducto extends GXProcedure
{
   public pdupproducto( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdupproducto.class ), "" );
   }

   public pdupproducto( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pdupproducto.this.aP2 = new String[] {""};
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
      pdupproducto.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdupproducto.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      pdupproducto.this.AV8Prdnum = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05TR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A731PrdStkMinD = P05TR2_A731PrdStkMinD[0] ;
         A732PrdStkMinU = P05TR2_A732PrdStkMinU[0] ;
         A696PrdConDia = P05TR2_A696PrdConDia[0] ;
         A707PrdFacCon = P05TR2_A707PrdFacCon[0] ;
         A700PrdDifCC = P05TR2_A700PrdDifCC[0] ;
         A706PrdExiCCP = P05TR2_A706PrdExiCCP[0] ;
         A738PrdUltCCC = P05TR2_A738PrdUltCCC[0] ;
         A740PrdUltECC = P05TR2_A740PrdUltECC[0] ;
         A739PrdUltDCC = P05TR2_A739PrdUltDCC[0] ;
         A705PrdExiCC = P05TR2_A705PrdExiCC[0] ;
         A644MovEspULin = P05TR2_A644MovEspULin[0] ;
         n644MovEspULin = P05TR2_n644MovEspULin[0] ;
         A709PrdFecPre = P05TR2_A709PrdFecPre[0] ;
         A725PrdPreAnt = P05TR2_A725PrdPreAnt[0] ;
         A727PrdRec = P05TR2_A727PrdRec[0] ;
         A726PrdPreMed = P05TR2_A726PrdPreMed[0] ;
         A729PrdRotRea = P05TR2_A729PrdRotRea[0] ;
         A684PrdCanPen = P05TR2_A684PrdCanPen[0] ;
         A713PrdFulEnt = P05TR2_A713PrdFulEnt[0] ;
         A856ValCod = P05TR2_A856ValCod[0] ;
         A698PrdDetPar = P05TR2_A698PrdDetPar[0] ;
         A724PrdPreAct = P05TR2_A724PrdPreAct[0] ;
         A704PrdExiAlm = P05TR2_A704PrdExiAlm[0] ;
         A795PrvNum = P05TR2_A795PrvNum[0] ;
         A718PrdNom = P05TR2_A718PrdNom[0] ;
         A14201PrdZDHCId = P05TR2_A14201PrdZDHCId[0] ;
         A14095PrdCosto = P05TR2_A14095PrdCosto[0] ;
         A14094PrdFibra = P05TR2_A14094PrdFibra[0] ;
         n14094PrdFibra = P05TR2_n14094PrdFibra[0] ;
         A847UltLinEnt = P05TR2_A847UltLinEnt[0] ;
         A14010ForAlmID = P05TR2_A14010ForAlmID[0] ;
         n14010ForAlmID = P05TR2_n14010ForAlmID[0] ;
         A14011LocUtiID = P05TR2_A14011LocUtiID[0] ;
         n14011LocUtiID = P05TR2_n14011LocUtiID[0] ;
         A13974PrdGRS = P05TR2_A13974PrdGRS[0] ;
         n13974PrdGRS = P05TR2_n13974PrdGRS[0] ;
         A13973PrdFSdoc = P05TR2_A13973PrdFSdoc[0] ;
         n13973PrdFSdoc = P05TR2_n13973PrdFSdoc[0] ;
         A13972PrdFTdoc = P05TR2_A13972PrdFTdoc[0] ;
         n13972PrdFTdoc = P05TR2_n13972PrdFTdoc[0] ;
         A13971PrdLoteFch = P05TR2_A13971PrdLoteFch[0] ;
         n13971PrdLoteFch = P05TR2_n13971PrdLoteFch[0] ;
         A13927AlmPrdID = P05TR2_A13927AlmPrdID[0] ;
         n13927AlmPrdID = P05TR2_n13927AlmPrdID[0] ;
         A13970PrdMatSeca = P05TR2_A13970PrdMatSeca[0] ;
         n13970PrdMatSeca = P05TR2_n13970PrdMatSeca[0] ;
         A13969PrdGruFamI = P05TR2_A13969PrdGruFamI[0] ;
         n13969PrdGruFamI = P05TR2_n13969PrdGruFamI[0] ;
         A13968PrdCantAtM = P05TR2_A13968PrdCantAtM[0] ;
         n13968PrdCantAtM = P05TR2_n13968PrdCantAtM[0] ;
         A13457PrdUbicaci = P05TR2_A13457PrdUbicaci[0] ;
         A13302PrdTHELIST = P05TR2_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P05TR2_n13302PrdTHELIST[0] ;
         A13301PrdZDHC = P05TR2_A13301PrdZDHC[0] ;
         A13232PrdRGB = P05TR2_A13232PrdRGB[0] ;
         A12957PrdLoteOb = P05TR2_A12957PrdLoteOb[0] ;
         A12714PrdFabId = P05TR2_A12714PrdFabId[0] ;
         n12714PrdFabId = P05TR2_n12714PrdFabId[0] ;
         A11687PrdList = P05TR2_A11687PrdList[0] ;
         A11663PrdCtw4 = P05TR2_A11663PrdCtw4[0] ;
         A3937PrdConc = P05TR2_A3937PrdConc[0] ;
         n3937PrdConc = P05TR2_n3937PrdConc[0] ;
         A3936PrdEqLP = P05TR2_A3936PrdEqLP[0] ;
         A11616PrdNmQu = P05TR2_A11616PrdNmQu[0] ;
         A11615PrdFuncion = P05TR2_A11615PrdFuncion[0] ;
         A11614PrdEINECS = P05TR2_A11614PrdEINECS[0] ;
         A11470PrdConct = P05TR2_A11470PrdConct[0] ;
         A11364PrdHm = P05TR2_A11364PrdHm[0] ;
         A11363PrdGots = P05TR2_A11363PrdGots[0] ;
         A11196PrdNroCAS = P05TR2_A11196PrdNroCAS[0] ;
         A10938PrdCtw3 = P05TR2_A10938PrdCtw3[0] ;
         A10937PrdCtw2 = P05TR2_A10937PrdCtw2[0] ;
         A10936PrdCtw1 = P05TR2_A10936PrdCtw1[0] ;
         A10935PrdRTM = P05TR2_A10935PrdRTM[0] ;
         A10881PrdLote = P05TR2_A10881PrdLote[0] ;
         A10119PrdColIdx = P05TR2_A10119PrdColIdx[0] ;
         A5888PrdOkotex = P05TR2_A5888PrdOkotex[0] ;
         A5887PrdReach = P05TR2_A5887PrdReach[0] ;
         A9742PrdFHS = P05TR2_A9742PrdFHS[0] ;
         A9741PrdHS = P05TR2_A9741PrdHS[0] ;
         A9740PrdFFT = P05TR2_A9740PrdFFT[0] ;
         A9739PrdFT = P05TR2_A9739PrdFT[0] ;
         A9734PrdNCAS = P05TR2_A9734PrdNCAS[0] ;
         A9733PrdAox = P05TR2_A9733PrdAox[0] ;
         A9732PrdComp = P05TR2_A9732PrdComp[0] ;
         A9731PrdInc = P05TR2_A9731PrdInc[0] ;
         A9609SubFamCod = P05TR2_A9609SubFamCod[0] ;
         n9609SubFamCod = P05TR2_n9609SubFamCod[0] ;
         A8936PrdSal = P05TR2_A8936PrdSal[0] ;
         A8910CC_Ultln = P05TR2_A8910CC_Ultln[0] ;
         n8910CC_Ultln = P05TR2_n8910CC_Ultln[0] ;
         A8897PrdPesTerm = P05TR2_A8897PrdPesTerm[0] ;
         A8896PrdPesCon = P05TR2_A8896PrdPesCon[0] ;
         A8895PrdAltAct = P05TR2_A8895PrdAltAct[0] ;
         n8895PrdAltAct = P05TR2_n8895PrdAltAct[0] ;
         A8660Almc_Ult = P05TR2_A8660Almc_Ult[0] ;
         n8660Almc_Ult = P05TR2_n8660Almc_Ult[0] ;
         A8659PrdExiAlmc = P05TR2_A8659PrdExiAlmc[0] ;
         A8647Mat_Lts = P05TR2_A8647Mat_Lts[0] ;
         n8647Mat_Lts = P05TR2_n8647Mat_Lts[0] ;
         A7763PrdPreRef = P05TR2_A7763PrdPreRef[0] ;
         n7763PrdPreRef = P05TR2_n7763PrdPreRef[0] ;
         A7260PrdHorMad = P05TR2_A7260PrdHorMad[0] ;
         A7227PrdNumct2 = P05TR2_A7227PrdNumct2[0] ;
         A7226PrdNumct1 = P05TR2_A7226PrdNumct1[0] ;
         A6301TipPrdCod = P05TR2_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P05TR2_n6301TipPrdCod[0] ;
         A6191PrdNumCent = P05TR2_A6191PrdNumCent[0] ;
         A5590PrdSolub = P05TR2_A5590PrdSolub[0] ;
         A5418PrdSalM = P05TR2_A5418PrdSalM[0] ;
         A5417PrdConcS = P05TR2_A5417PrdConcS[0] ;
         A5416PrdDensS = P05TR2_A5416PrdDensS[0] ;
         A5255PrdPreAc2 = P05TR2_A5255PrdPreAc2[0] ;
         A4694PrdObs = P05TR2_A4694PrdObs[0] ;
         A4693PrdNum2 = P05TR2_A4693PrdNum2[0] ;
         A4692PrdNom2 = P05TR2_A4692PrdNom2[0] ;
         A4338PrdUMeFo = P05TR2_A4338PrdUMeFo[0] ;
         A3341CCStKULin = P05TR2_A3341CCStKULin[0] ;
         n3341CCStKULin = P05TR2_n3341CCStKULin[0] ;
         A3273PrdTnq = P05TR2_A3273PrdTnq[0] ;
         A3004PrdRev = P05TR2_A3004PrdRev[0] ;
         A1644PrdDqo = P05TR2_A1644PrdDqo[0] ;
         A1643PrdTip = P05TR2_A1643PrdTip[0] ;
         A1194PrdPosY = P05TR2_A1194PrdPosY[0] ;
         A1193PrdPosX = P05TR2_A1193PrdPosX[0] ;
         A708PrdFecEnt = P05TR2_A708PrdFecEnt[0] ;
         A332DifValStk = P05TR2_A332DifValStk[0] ;
         A750PrdValStk = P05TR2_A750PrdValStk[0] ;
         A835TipDtoCod = P05TR2_A835TipDtoCod[0] ;
         n835TipDtoCod = P05TR2_n835TipDtoCod[0] ;
         A730PrdSit = P05TR2_A730PrdSit[0] ;
         A682PrdCalNec = P05TR2_A682PrdCalNec[0] ;
         A734PrdSus = P05TR2_A734PrdSus[0] ;
         n734PrdSus = P05TR2_n734PrdSus[0] ;
         A728PrdRefPrv = P05TR2_A728PrdRefPrv[0] ;
         A743PrdUniCon = P05TR2_A743PrdUniCon[0] ;
         A742PrdUniCom = P05TR2_A742PrdUniCom[0] ;
         A703PrdDscTec = P05TR2_A703PrdDscTec[0] ;
         A695PrdConCC = P05TR2_A695PrdConCC[0] ;
         A712PrdFulCC = P05TR2_A712PrdFulCC[0] ;
         A714PrdFulPed = P05TR2_A714PrdFulPed[0] ;
         A685PrdCanRes = P05TR2_A685PrdCanRes[0] ;
         A721PrdNumUco = P05TR2_A721PrdNumUco[0] ;
         A716PrdLotMin = P05TR2_A716PrdLotMin[0] ;
         A629MetCod = P05TR2_A629MetCod[0] ;
         n629MetCod = P05TR2_n629MetCod[0] ;
         A722PrdPlaEnt = P05TR2_A722PrdPlaEnt[0] ;
         A699PrdDiaRot = P05TR2_A699PrdDiaRot[0] ;
         W396EmprCod = A396EmprCod ;
         W719PrdNum = A719PrdNum ;
         /*
            INSERT RECORD ON TABLE TXPPRODUC

         */
         W396EmprCod = A396EmprCod ;
         W719PrdNum = A719PrdNum ;
         A719PrdNum = AV8Prdnum ;
         /* Using cursor P05TR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, A718PrdNom, Integer.valueOf(A795PrvNum), A704PrdExiAlm, A724PrdPreAct, A698PrdDetPar, Byte.valueOf(A856ValCod), A713PrdFulEnt, A684PrdCanPen, A729PrdRotRea, A726PrdPreMed, A727PrdRec, A725PrdPreAnt, A709PrdFecPre, Boolean.valueOf(n644MovEspULin), Short.valueOf(A644MovEspULin), A705PrdExiCC, A739PrdUltDCC, A740PrdUltECC, Short.valueOf(A738PrdUltCCC), A706PrdExiCCP, A700PrdDifCC, A707PrdFacCon, A696PrdConDia, A732PrdStkMinU, Short.valueOf(A731PrdStkMinD), Short.valueOf(A699PrdDiaRot), Short.valueOf(A722PrdPlaEnt), Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod), Short.valueOf(A716PrdLotMin), A721PrdNumUco, A685PrdCanRes, A714PrdFulPed, A712PrdFulCC, Short.valueOf(A695PrdConCC), A703PrdDscTec, Byte.valueOf(A742PrdUniCom), Byte.valueOf(A743PrdUniCon), A728PrdRefPrv, Boolean.valueOf(n734PrdSus), A734PrdSus, A682PrdCalNec, Byte.valueOf(A730PrdSit), Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod), A750PrdValStk, A332DifValStk, A708PrdFecEnt, Short.valueOf(A1193PrdPosX), Byte.valueOf(A1194PrdPosY), A1643PrdTip, Short.valueOf(A1644PrdDqo), A3004PrdRev, Byte.valueOf(A3273PrdTnq), Boolean.valueOf(n3341CCStKULin), Long.valueOf(A3341CCStKULin), Byte.valueOf(A4338PrdUMeFo), A4692PrdNom2, A4693PrdNum2, A4694PrdObs, A5255PrdPreAc2, A5416PrdDensS, A5417PrdConcS, A5418PrdSalM, A5590PrdSolub, A6191PrdNumCent, Boolean.valueOf(n6301TipPrdCod), Short.valueOf(A6301TipPrdCod), A7226PrdNumct1, A7227PrdNumct2, Byte.valueOf(A7260PrdHorMad), Boolean.valueOf(n7763PrdPreRef), A7763PrdPreRef, Boolean.valueOf(n8647Mat_Lts), A8647Mat_Lts, A8659PrdExiAlmc, Boolean.valueOf(n8660Almc_Ult), Integer.valueOf(A8660Almc_Ult), Boolean.valueOf(n8895PrdAltAct), Byte.valueOf(A8895PrdAltAct), Byte.valueOf(A8896PrdPesCon), A8897PrdPesTerm, Boolean.valueOf(n8910CC_Ultln), Long.valueOf(A8910CC_Ultln), A8936PrdSal, Boolean.valueOf(n9609SubFamCod), Byte.valueOf(A9609SubFamCod), A9731PrdInc, A9732PrdComp, A9733PrdAox, A9734PrdNCAS, A9739PrdFT, A9740PrdFFT, A9741PrdHS, A9742PrdFHS, A5887PrdReach, A5888PrdOkotex, A10119PrdColIdx, A10881PrdLote, A10935PrdRTM, A10936PrdCtw1, A10937PrdCtw2, A10938PrdCtw3, A11196PrdNroCAS, A11363PrdGots, A11364PrdHm, Short.valueOf(A11470PrdConct), A11614PrdEINECS, A11615PrdFuncion, A11616PrdNmQu, A3936PrdEqLP, Boolean.valueOf(n3937PrdConc), A3937PrdConc, A11663PrdCtw4, A11687PrdList, Boolean.valueOf(n12714PrdFabId), Integer.valueOf(A12714PrdFabId), A12957PrdLoteOb, Long.valueOf(A13232PrdRGB), A13301PrdZDHC,
         Boolean.valueOf(n13302PrdTHELIST), A13302PrdTHELIST, A13457PrdUbicaci, Boolean.valueOf(n13968PrdCantAtM), Short.valueOf(A13968PrdCantAtM), Boolean.valueOf(n13969PrdGruFamI), Byte.valueOf(A13969PrdGruFamI), Boolean.valueOf(n13970PrdMatSeca), A13970PrdMatSeca, Boolean.valueOf(n13927AlmPrdID), Short.valueOf(A13927AlmPrdID), Boolean.valueOf(n13971PrdLoteFch), A13971PrdLoteFch, Boolean.valueOf(n13972PrdFTdoc), A13972PrdFTdoc, Boolean.valueOf(n13973PrdFSdoc), A13973PrdFSdoc, Boolean.valueOf(n13974PrdGRS), A13974PrdGRS, Boolean.valueOf(n14011LocUtiID), Short.valueOf(A14011LocUtiID), Boolean.valueOf(n14010ForAlmID), Short.valueOf(A14010ForAlmID), Short.valueOf(A847UltLinEnt), Boolean.valueOf(n14094PrdFibra), A14094PrdFibra, A14095PrdCosto, A14201PrdZDHCId});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
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
         A396EmprCod = W396EmprCod ;
         A719PrdNum = W719PrdNum ;
         /* End Insert */
         /* Using cursor P05TR4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A10121PrdRefn = P05TR4_A10121PrdRefn[0] ;
            A7240PrdPrea = P05TR4_A7240PrdPrea[0] ;
            A6158PrdPrv = P05TR4_A6158PrdPrv[0] ;
            W396EmprCod = A396EmprCod ;
            W719PrdNum = A719PrdNum ;
            /*
               INSERT RECORD ON TABLE TXPPROPRV

            */
            W396EmprCod = A396EmprCod ;
            W719PrdNum = A719PrdNum ;
            W6158PrdPrv = A6158PrdPrv ;
            A719PrdNum = AV8Prdnum ;
            /* Using cursor P05TR5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Integer.valueOf(A6158PrdPrv), A7240PrdPrea, A10121PrdRefn});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROPRV");
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
            A396EmprCod = W396EmprCod ;
            A719PrdNum = W719PrdNum ;
            A6158PrdPrv = W6158PrdPrv ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A719PrdNum = W719PrdNum ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         A396EmprCod = W396EmprCod ;
         A719PrdNum = W719PrdNum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdupproducto.this.A396EmprCod;
      this.aP1[0] = pdupproducto.this.A719PrdNum;
      this.aP2[0] = pdupproducto.this.AV8Prdnum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdupproducto");
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
      P05TR2_A731PrdStkMinD = new short[1] ;
      P05TR2_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A700PrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A738PrdUltCCC = new short[1] ;
      P05TR2_A740PrdUltECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A739PrdUltDCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A644MovEspULin = new short[1] ;
      P05TR2_n644MovEspULin = new boolean[] {false} ;
      P05TR2_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      P05TR2_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A727PrdRec = new String[] {""} ;
      P05TR2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P05TR2_A856ValCod = new byte[1] ;
      P05TR2_A698PrdDetPar = new String[] {""} ;
      P05TR2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A795PrvNum = new int[1] ;
      P05TR2_A718PrdNom = new String[] {""} ;
      P05TR2_A396EmprCod = new String[] {""} ;
      P05TR2_A719PrdNum = new String[] {""} ;
      P05TR2_A14201PrdZDHCId = new String[] {""} ;
      P05TR2_A14095PrdCosto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A14094PrdFibra = new String[] {""} ;
      P05TR2_n14094PrdFibra = new boolean[] {false} ;
      P05TR2_A847UltLinEnt = new short[1] ;
      P05TR2_A14010ForAlmID = new short[1] ;
      P05TR2_n14010ForAlmID = new boolean[] {false} ;
      P05TR2_A14011LocUtiID = new short[1] ;
      P05TR2_n14011LocUtiID = new boolean[] {false} ;
      P05TR2_A13974PrdGRS = new String[] {""} ;
      P05TR2_n13974PrdGRS = new boolean[] {false} ;
      P05TR2_A13973PrdFSdoc = new String[] {""} ;
      P05TR2_n13973PrdFSdoc = new boolean[] {false} ;
      P05TR2_A13972PrdFTdoc = new String[] {""} ;
      P05TR2_n13972PrdFTdoc = new boolean[] {false} ;
      P05TR2_A13971PrdLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      P05TR2_n13971PrdLoteFch = new boolean[] {false} ;
      P05TR2_A13927AlmPrdID = new short[1] ;
      P05TR2_n13927AlmPrdID = new boolean[] {false} ;
      P05TR2_A13970PrdMatSeca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_n13970PrdMatSeca = new boolean[] {false} ;
      P05TR2_A13969PrdGruFamI = new byte[1] ;
      P05TR2_n13969PrdGruFamI = new boolean[] {false} ;
      P05TR2_A13968PrdCantAtM = new short[1] ;
      P05TR2_n13968PrdCantAtM = new boolean[] {false} ;
      P05TR2_A13457PrdUbicaci = new String[] {""} ;
      P05TR2_A13302PrdTHELIST = new String[] {""} ;
      P05TR2_n13302PrdTHELIST = new boolean[] {false} ;
      P05TR2_A13301PrdZDHC = new String[] {""} ;
      P05TR2_A13232PrdRGB = new long[1] ;
      P05TR2_A12957PrdLoteOb = new String[] {""} ;
      P05TR2_A12714PrdFabId = new int[1] ;
      P05TR2_n12714PrdFabId = new boolean[] {false} ;
      P05TR2_A11687PrdList = new String[] {""} ;
      P05TR2_A11663PrdCtw4 = new String[] {""} ;
      P05TR2_A3937PrdConc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_n3937PrdConc = new boolean[] {false} ;
      P05TR2_A3936PrdEqLP = new String[] {""} ;
      P05TR2_A11616PrdNmQu = new String[] {""} ;
      P05TR2_A11615PrdFuncion = new String[] {""} ;
      P05TR2_A11614PrdEINECS = new String[] {""} ;
      P05TR2_A11470PrdConct = new short[1] ;
      P05TR2_A11364PrdHm = new String[] {""} ;
      P05TR2_A11363PrdGots = new String[] {""} ;
      P05TR2_A11196PrdNroCAS = new String[] {""} ;
      P05TR2_A10938PrdCtw3 = new String[] {""} ;
      P05TR2_A10937PrdCtw2 = new String[] {""} ;
      P05TR2_A10936PrdCtw1 = new String[] {""} ;
      P05TR2_A10935PrdRTM = new String[] {""} ;
      P05TR2_A10881PrdLote = new String[] {""} ;
      P05TR2_A10119PrdColIdx = new String[] {""} ;
      P05TR2_A5888PrdOkotex = new String[] {""} ;
      P05TR2_A5887PrdReach = new String[] {""} ;
      P05TR2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P05TR2_A9741PrdHS = new String[] {""} ;
      P05TR2_A9740PrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      P05TR2_A9739PrdFT = new String[] {""} ;
      P05TR2_A9734PrdNCAS = new String[] {""} ;
      P05TR2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A9732PrdComp = new String[] {""} ;
      P05TR2_A9731PrdInc = new String[] {""} ;
      P05TR2_A9609SubFamCod = new byte[1] ;
      P05TR2_n9609SubFamCod = new boolean[] {false} ;
      P05TR2_A8936PrdSal = new String[] {""} ;
      P05TR2_A8910CC_Ultln = new long[1] ;
      P05TR2_n8910CC_Ultln = new boolean[] {false} ;
      P05TR2_A8897PrdPesTerm = new String[] {""} ;
      P05TR2_A8896PrdPesCon = new byte[1] ;
      P05TR2_A8895PrdAltAct = new byte[1] ;
      P05TR2_n8895PrdAltAct = new boolean[] {false} ;
      P05TR2_A8660Almc_Ult = new int[1] ;
      P05TR2_n8660Almc_Ult = new boolean[] {false} ;
      P05TR2_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A8647Mat_Lts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_n8647Mat_Lts = new boolean[] {false} ;
      P05TR2_A7763PrdPreRef = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_n7763PrdPreRef = new boolean[] {false} ;
      P05TR2_A7260PrdHorMad = new byte[1] ;
      P05TR2_A7227PrdNumct2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A7226PrdNumct1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A6301TipPrdCod = new short[1] ;
      P05TR2_n6301TipPrdCod = new boolean[] {false} ;
      P05TR2_A6191PrdNumCent = new String[] {""} ;
      P05TR2_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A5418PrdSalM = new String[] {""} ;
      P05TR2_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A4694PrdObs = new String[] {""} ;
      P05TR2_A4693PrdNum2 = new String[] {""} ;
      P05TR2_A4692PrdNom2 = new String[] {""} ;
      P05TR2_A4338PrdUMeFo = new byte[1] ;
      P05TR2_A3341CCStKULin = new long[1] ;
      P05TR2_n3341CCStKULin = new boolean[] {false} ;
      P05TR2_A3273PrdTnq = new byte[1] ;
      P05TR2_A3004PrdRev = new String[] {""} ;
      P05TR2_A1644PrdDqo = new short[1] ;
      P05TR2_A1643PrdTip = new String[] {""} ;
      P05TR2_A1194PrdPosY = new byte[1] ;
      P05TR2_A1193PrdPosX = new short[1] ;
      P05TR2_A708PrdFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P05TR2_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A835TipDtoCod = new byte[1] ;
      P05TR2_n835TipDtoCod = new boolean[] {false} ;
      P05TR2_A730PrdSit = new byte[1] ;
      P05TR2_A682PrdCalNec = new String[] {""} ;
      P05TR2_A734PrdSus = new String[] {""} ;
      P05TR2_n734PrdSus = new boolean[] {false} ;
      P05TR2_A728PrdRefPrv = new String[] {""} ;
      P05TR2_A743PrdUniCon = new byte[1] ;
      P05TR2_A742PrdUniCom = new byte[1] ;
      P05TR2_A703PrdDscTec = new String[] {""} ;
      P05TR2_A695PrdConCC = new short[1] ;
      P05TR2_A712PrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      P05TR2_A714PrdFulPed = new java.util.Date[] {GXutil.nullDate()} ;
      P05TR2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR2_A716PrdLotMin = new short[1] ;
      P05TR2_A629MetCod = new byte[1] ;
      P05TR2_n629MetCod = new boolean[] {false} ;
      P05TR2_A722PrdPlaEnt = new short[1] ;
      P05TR2_A699PrdDiaRot = new short[1] ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A696PrdConDia = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A700PrdDifCC = DecimalUtil.ZERO ;
      A706PrdExiCCP = DecimalUtil.ZERO ;
      A740PrdUltECC = DecimalUtil.ZERO ;
      A739PrdUltDCC = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A727PrdRec = "" ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A729PrdRotRea = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A713PrdFulEnt = GXutil.nullDate() ;
      A698PrdDetPar = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A14201PrdZDHCId = "" ;
      A14095PrdCosto = DecimalUtil.ZERO ;
      A14094PrdFibra = "" ;
      A13974PrdGRS = "" ;
      A13973PrdFSdoc = "" ;
      A13972PrdFTdoc = "" ;
      A13971PrdLoteFch = GXutil.nullDate() ;
      A13970PrdMatSeca = DecimalUtil.ZERO ;
      A13457PrdUbicaci = "" ;
      A13302PrdTHELIST = "" ;
      A13301PrdZDHC = "" ;
      A12957PrdLoteOb = "" ;
      A11687PrdList = "" ;
      A11663PrdCtw4 = "" ;
      A3937PrdConc = DecimalUtil.ZERO ;
      A3936PrdEqLP = "" ;
      A11616PrdNmQu = "" ;
      A11615PrdFuncion = "" ;
      A11614PrdEINECS = "" ;
      A11364PrdHm = "" ;
      A11363PrdGots = "" ;
      A11196PrdNroCAS = "" ;
      A10938PrdCtw3 = "" ;
      A10937PrdCtw2 = "" ;
      A10936PrdCtw1 = "" ;
      A10935PrdRTM = "" ;
      A10881PrdLote = "" ;
      A10119PrdColIdx = "" ;
      A5888PrdOkotex = "" ;
      A5887PrdReach = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A9741PrdHS = "" ;
      A9740PrdFFT = GXutil.nullDate() ;
      A9739PrdFT = "" ;
      A9734PrdNCAS = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A9732PrdComp = "" ;
      A9731PrdInc = "" ;
      A8936PrdSal = "" ;
      A8897PrdPesTerm = "" ;
      A8659PrdExiAlmc = DecimalUtil.ZERO ;
      A8647Mat_Lts = DecimalUtil.ZERO ;
      A7763PrdPreRef = DecimalUtil.ZERO ;
      A7227PrdNumct2 = DecimalUtil.ZERO ;
      A7226PrdNumct1 = DecimalUtil.ZERO ;
      A6191PrdNumCent = "" ;
      A5590PrdSolub = DecimalUtil.ZERO ;
      A5418PrdSalM = "" ;
      A5417PrdConcS = DecimalUtil.ZERO ;
      A5416PrdDensS = DecimalUtil.ZERO ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      A4694PrdObs = "" ;
      A4693PrdNum2 = "" ;
      A4692PrdNom2 = "" ;
      A3004PrdRev = "" ;
      A1643PrdTip = "" ;
      A708PrdFecEnt = GXutil.nullDate() ;
      A332DifValStk = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A682PrdCalNec = "" ;
      A734PrdSus = "" ;
      A728PrdRefPrv = "" ;
      A703PrdDscTec = "" ;
      A712PrdFulCC = GXutil.nullDate() ;
      A714PrdFulPed = GXutil.nullDate() ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      W719PrdNum = "" ;
      Gx_emsg = "" ;
      P05TR4_A396EmprCod = new String[] {""} ;
      P05TR4_A719PrdNum = new String[] {""} ;
      P05TR4_A10121PrdRefn = new String[] {""} ;
      P05TR4_A7240PrdPrea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05TR4_A6158PrdPrv = new int[1] ;
      A10121PrdRefn = "" ;
      A7240PrdPrea = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdupproducto__default(),
         new Object[] {
             new Object[] {
            P05TR2_A731PrdStkMinD, P05TR2_A732PrdStkMinU, P05TR2_A696PrdConDia, P05TR2_A707PrdFacCon, P05TR2_A700PrdDifCC, P05TR2_A706PrdExiCCP, P05TR2_A738PrdUltCCC, P05TR2_A740PrdUltECC, P05TR2_A739PrdUltDCC, P05TR2_A705PrdExiCC,
            P05TR2_A644MovEspULin, P05TR2_n644MovEspULin, P05TR2_A709PrdFecPre, P05TR2_A725PrdPreAnt, P05TR2_A727PrdRec, P05TR2_A726PrdPreMed, P05TR2_A729PrdRotRea, P05TR2_A684PrdCanPen, P05TR2_A713PrdFulEnt, P05TR2_A856ValCod,
            P05TR2_A698PrdDetPar, P05TR2_A724PrdPreAct, P05TR2_A704PrdExiAlm, P05TR2_A795PrvNum, P05TR2_A718PrdNom, P05TR2_A396EmprCod, P05TR2_A719PrdNum, P05TR2_A14201PrdZDHCId, P05TR2_A14095PrdCosto, P05TR2_A14094PrdFibra,
            P05TR2_n14094PrdFibra, P05TR2_A847UltLinEnt, P05TR2_A14010ForAlmID, P05TR2_n14010ForAlmID, P05TR2_A14011LocUtiID, P05TR2_n14011LocUtiID, P05TR2_A13974PrdGRS, P05TR2_n13974PrdGRS, P05TR2_A13973PrdFSdoc, P05TR2_n13973PrdFSdoc,
            P05TR2_A13972PrdFTdoc, P05TR2_n13972PrdFTdoc, P05TR2_A13971PrdLoteFch, P05TR2_n13971PrdLoteFch, P05TR2_A13927AlmPrdID, P05TR2_n13927AlmPrdID, P05TR2_A13970PrdMatSeca, P05TR2_n13970PrdMatSeca, P05TR2_A13969PrdGruFamI, P05TR2_n13969PrdGruFamI,
            P05TR2_A13968PrdCantAtM, P05TR2_n13968PrdCantAtM, P05TR2_A13457PrdUbicaci, P05TR2_A13302PrdTHELIST, P05TR2_n13302PrdTHELIST, P05TR2_A13301PrdZDHC, P05TR2_A13232PrdRGB, P05TR2_A12957PrdLoteOb, P05TR2_A12714PrdFabId, P05TR2_n12714PrdFabId,
            P05TR2_A11687PrdList, P05TR2_A11663PrdCtw4, P05TR2_A3937PrdConc, P05TR2_n3937PrdConc, P05TR2_A3936PrdEqLP, P05TR2_A11616PrdNmQu, P05TR2_A11615PrdFuncion, P05TR2_A11614PrdEINECS, P05TR2_A11470PrdConct, P05TR2_A11364PrdHm,
            P05TR2_A11363PrdGots, P05TR2_A11196PrdNroCAS, P05TR2_A10938PrdCtw3, P05TR2_A10937PrdCtw2, P05TR2_A10936PrdCtw1, P05TR2_A10935PrdRTM, P05TR2_A10881PrdLote, P05TR2_A10119PrdColIdx, P05TR2_A5888PrdOkotex, P05TR2_A5887PrdReach,
            P05TR2_A9742PrdFHS, P05TR2_A9741PrdHS, P05TR2_A9740PrdFFT, P05TR2_A9739PrdFT, P05TR2_A9734PrdNCAS, P05TR2_A9733PrdAox, P05TR2_A9732PrdComp, P05TR2_A9731PrdInc, P05TR2_A9609SubFamCod, P05TR2_n9609SubFamCod,
            P05TR2_A8936PrdSal, P05TR2_A8910CC_Ultln, P05TR2_n8910CC_Ultln, P05TR2_A8897PrdPesTerm, P05TR2_A8896PrdPesCon, P05TR2_A8895PrdAltAct, P05TR2_n8895PrdAltAct, P05TR2_A8660Almc_Ult, P05TR2_n8660Almc_Ult, P05TR2_A8659PrdExiAlmc,
            P05TR2_A8647Mat_Lts, P05TR2_n8647Mat_Lts, P05TR2_A7763PrdPreRef, P05TR2_n7763PrdPreRef, P05TR2_A7260PrdHorMad, P05TR2_A7227PrdNumct2, P05TR2_A7226PrdNumct1, P05TR2_A6301TipPrdCod, P05TR2_n6301TipPrdCod, P05TR2_A6191PrdNumCent,
            P05TR2_A5590PrdSolub, P05TR2_A5418PrdSalM, P05TR2_A5417PrdConcS, P05TR2_A5416PrdDensS, P05TR2_A5255PrdPreAc2, P05TR2_A4694PrdObs, P05TR2_A4693PrdNum2, P05TR2_A4692PrdNom2, P05TR2_A4338PrdUMeFo, P05TR2_A3341CCStKULin,
            P05TR2_n3341CCStKULin, P05TR2_A3273PrdTnq, P05TR2_A3004PrdRev, P05TR2_A1644PrdDqo, P05TR2_A1643PrdTip, P05TR2_A1194PrdPosY, P05TR2_A1193PrdPosX, P05TR2_A708PrdFecEnt, P05TR2_A332DifValStk, P05TR2_A750PrdValStk,
            P05TR2_A835TipDtoCod, P05TR2_n835TipDtoCod, P05TR2_A730PrdSit, P05TR2_A682PrdCalNec, P05TR2_A734PrdSus, P05TR2_n734PrdSus, P05TR2_A728PrdRefPrv, P05TR2_A743PrdUniCon, P05TR2_A742PrdUniCom, P05TR2_A703PrdDscTec,
            P05TR2_A695PrdConCC, P05TR2_A712PrdFulCC, P05TR2_A714PrdFulPed, P05TR2_A685PrdCanRes, P05TR2_A721PrdNumUco, P05TR2_A716PrdLotMin, P05TR2_A629MetCod, P05TR2_n629MetCod, P05TR2_A722PrdPlaEnt, P05TR2_A699PrdDiaRot
            }
            , new Object[] {
            }
            , new Object[] {
            P05TR4_A396EmprCod, P05TR4_A719PrdNum, P05TR4_A10121PrdRefn, P05TR4_A7240PrdPrea, P05TR4_A6158PrdPrv
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private byte A13969PrdGruFamI ;
   private byte A9609SubFamCod ;
   private byte A8896PrdPesCon ;
   private byte A8895PrdAltAct ;
   private byte A7260PrdHorMad ;
   private byte A4338PrdUMeFo ;
   private byte A3273PrdTnq ;
   private byte A1194PrdPosY ;
   private byte A835TipDtoCod ;
   private byte A730PrdSit ;
   private byte A743PrdUniCon ;
   private byte A742PrdUniCom ;
   private byte A629MetCod ;
   private short A731PrdStkMinD ;
   private short A738PrdUltCCC ;
   private short A644MovEspULin ;
   private short A847UltLinEnt ;
   private short A14010ForAlmID ;
   private short A14011LocUtiID ;
   private short A13927AlmPrdID ;
   private short A13968PrdCantAtM ;
   private short A11470PrdConct ;
   private short A6301TipPrdCod ;
   private short A1644PrdDqo ;
   private short A1193PrdPosX ;
   private short A695PrdConCC ;
   private short A716PrdLotMin ;
   private short A722PrdPlaEnt ;
   private short A699PrdDiaRot ;
   private short Gx_err ;
   private int A795PrvNum ;
   private int A12714PrdFabId ;
   private int A8660Almc_Ult ;
   private int GX_INS29 ;
   private int A6158PrdPrv ;
   private int GX_INS898 ;
   private int W6158PrdPrv ;
   private long A13232PrdRGB ;
   private long A8910CC_Ultln ;
   private long A3341CCStKULin ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal A696PrdConDia ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A700PrdDifCC ;
   private java.math.BigDecimal A706PrdExiCCP ;
   private java.math.BigDecimal A740PrdUltECC ;
   private java.math.BigDecimal A739PrdUltDCC ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A729PrdRotRea ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A14095PrdCosto ;
   private java.math.BigDecimal A13970PrdMatSeca ;
   private java.math.BigDecimal A3937PrdConc ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal A8659PrdExiAlmc ;
   private java.math.BigDecimal A8647Mat_Lts ;
   private java.math.BigDecimal A7763PrdPreRef ;
   private java.math.BigDecimal A7227PrdNumct2 ;
   private java.math.BigDecimal A7226PrdNumct1 ;
   private java.math.BigDecimal A5590PrdSolub ;
   private java.math.BigDecimal A5417PrdConcS ;
   private java.math.BigDecimal A5416PrdDensS ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal A332DifValStk ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A721PrdNumUco ;
   private java.math.BigDecimal A7240PrdPrea ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV8Prdnum ;
   private String scmdbuf ;
   private String A727PrdRec ;
   private String A698PrdDetPar ;
   private String A718PrdNom ;
   private String A14201PrdZDHCId ;
   private String A14094PrdFibra ;
   private String A13974PrdGRS ;
   private String A13457PrdUbicaci ;
   private String A13302PrdTHELIST ;
   private String A13301PrdZDHC ;
   private String A12957PrdLoteOb ;
   private String A11687PrdList ;
   private String A11663PrdCtw4 ;
   private String A3936PrdEqLP ;
   private String A11615PrdFuncion ;
   private String A11614PrdEINECS ;
   private String A11364PrdHm ;
   private String A11363PrdGots ;
   private String A11196PrdNroCAS ;
   private String A10938PrdCtw3 ;
   private String A10937PrdCtw2 ;
   private String A10936PrdCtw1 ;
   private String A10935PrdRTM ;
   private String A10881PrdLote ;
   private String A10119PrdColIdx ;
   private String A5888PrdOkotex ;
   private String A5887PrdReach ;
   private String A9741PrdHS ;
   private String A9739PrdFT ;
   private String A9734PrdNCAS ;
   private String A9732PrdComp ;
   private String A9731PrdInc ;
   private String A8936PrdSal ;
   private String A8897PrdPesTerm ;
   private String A6191PrdNumCent ;
   private String A5418PrdSalM ;
   private String A4693PrdNum2 ;
   private String A4692PrdNom2 ;
   private String A3004PrdRev ;
   private String A1643PrdTip ;
   private String A682PrdCalNec ;
   private String A734PrdSus ;
   private String A728PrdRefPrv ;
   private String A703PrdDscTec ;
   private String W396EmprCod ;
   private String W719PrdNum ;
   private String Gx_emsg ;
   private String A10121PrdRefn ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date A713PrdFulEnt ;
   private java.util.Date A13971PrdLoteFch ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date A9740PrdFFT ;
   private java.util.Date A708PrdFecEnt ;
   private java.util.Date A712PrdFulCC ;
   private java.util.Date A714PrdFulPed ;
   private boolean n644MovEspULin ;
   private boolean n14094PrdFibra ;
   private boolean n14010ForAlmID ;
   private boolean n14011LocUtiID ;
   private boolean n13974PrdGRS ;
   private boolean n13973PrdFSdoc ;
   private boolean n13972PrdFTdoc ;
   private boolean n13971PrdLoteFch ;
   private boolean n13927AlmPrdID ;
   private boolean n13970PrdMatSeca ;
   private boolean n13969PrdGruFamI ;
   private boolean n13968PrdCantAtM ;
   private boolean n13302PrdTHELIST ;
   private boolean n12714PrdFabId ;
   private boolean n3937PrdConc ;
   private boolean n9609SubFamCod ;
   private boolean n8910CC_Ultln ;
   private boolean n8895PrdAltAct ;
   private boolean n8660Almc_Ult ;
   private boolean n8647Mat_Lts ;
   private boolean n7763PrdPreRef ;
   private boolean n6301TipPrdCod ;
   private boolean n3341CCStKULin ;
   private boolean n835TipDtoCod ;
   private boolean n734PrdSus ;
   private boolean n629MetCod ;
   private String A13973PrdFSdoc ;
   private String A13972PrdFTdoc ;
   private String A11616PrdNmQu ;
   private String A4694PrdObs ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private short[] P05TR2_A731PrdStkMinD ;
   private java.math.BigDecimal[] P05TR2_A732PrdStkMinU ;
   private java.math.BigDecimal[] P05TR2_A696PrdConDia ;
   private java.math.BigDecimal[] P05TR2_A707PrdFacCon ;
   private java.math.BigDecimal[] P05TR2_A700PrdDifCC ;
   private java.math.BigDecimal[] P05TR2_A706PrdExiCCP ;
   private short[] P05TR2_A738PrdUltCCC ;
   private java.math.BigDecimal[] P05TR2_A740PrdUltECC ;
   private java.math.BigDecimal[] P05TR2_A739PrdUltDCC ;
   private java.math.BigDecimal[] P05TR2_A705PrdExiCC ;
   private short[] P05TR2_A644MovEspULin ;
   private boolean[] P05TR2_n644MovEspULin ;
   private java.util.Date[] P05TR2_A709PrdFecPre ;
   private java.math.BigDecimal[] P05TR2_A725PrdPreAnt ;
   private String[] P05TR2_A727PrdRec ;
   private java.math.BigDecimal[] P05TR2_A726PrdPreMed ;
   private java.math.BigDecimal[] P05TR2_A729PrdRotRea ;
   private java.math.BigDecimal[] P05TR2_A684PrdCanPen ;
   private java.util.Date[] P05TR2_A713PrdFulEnt ;
   private byte[] P05TR2_A856ValCod ;
   private String[] P05TR2_A698PrdDetPar ;
   private java.math.BigDecimal[] P05TR2_A724PrdPreAct ;
   private java.math.BigDecimal[] P05TR2_A704PrdExiAlm ;
   private int[] P05TR2_A795PrvNum ;
   private String[] P05TR2_A718PrdNom ;
   private String[] P05TR2_A396EmprCod ;
   private String[] P05TR2_A719PrdNum ;
   private String[] P05TR2_A14201PrdZDHCId ;
   private java.math.BigDecimal[] P05TR2_A14095PrdCosto ;
   private String[] P05TR2_A14094PrdFibra ;
   private boolean[] P05TR2_n14094PrdFibra ;
   private short[] P05TR2_A847UltLinEnt ;
   private short[] P05TR2_A14010ForAlmID ;
   private boolean[] P05TR2_n14010ForAlmID ;
   private short[] P05TR2_A14011LocUtiID ;
   private boolean[] P05TR2_n14011LocUtiID ;
   private String[] P05TR2_A13974PrdGRS ;
   private boolean[] P05TR2_n13974PrdGRS ;
   private String[] P05TR2_A13973PrdFSdoc ;
   private boolean[] P05TR2_n13973PrdFSdoc ;
   private String[] P05TR2_A13972PrdFTdoc ;
   private boolean[] P05TR2_n13972PrdFTdoc ;
   private java.util.Date[] P05TR2_A13971PrdLoteFch ;
   private boolean[] P05TR2_n13971PrdLoteFch ;
   private short[] P05TR2_A13927AlmPrdID ;
   private boolean[] P05TR2_n13927AlmPrdID ;
   private java.math.BigDecimal[] P05TR2_A13970PrdMatSeca ;
   private boolean[] P05TR2_n13970PrdMatSeca ;
   private byte[] P05TR2_A13969PrdGruFamI ;
   private boolean[] P05TR2_n13969PrdGruFamI ;
   private short[] P05TR2_A13968PrdCantAtM ;
   private boolean[] P05TR2_n13968PrdCantAtM ;
   private String[] P05TR2_A13457PrdUbicaci ;
   private String[] P05TR2_A13302PrdTHELIST ;
   private boolean[] P05TR2_n13302PrdTHELIST ;
   private String[] P05TR2_A13301PrdZDHC ;
   private long[] P05TR2_A13232PrdRGB ;
   private String[] P05TR2_A12957PrdLoteOb ;
   private int[] P05TR2_A12714PrdFabId ;
   private boolean[] P05TR2_n12714PrdFabId ;
   private String[] P05TR2_A11687PrdList ;
   private String[] P05TR2_A11663PrdCtw4 ;
   private java.math.BigDecimal[] P05TR2_A3937PrdConc ;
   private boolean[] P05TR2_n3937PrdConc ;
   private String[] P05TR2_A3936PrdEqLP ;
   private String[] P05TR2_A11616PrdNmQu ;
   private String[] P05TR2_A11615PrdFuncion ;
   private String[] P05TR2_A11614PrdEINECS ;
   private short[] P05TR2_A11470PrdConct ;
   private String[] P05TR2_A11364PrdHm ;
   private String[] P05TR2_A11363PrdGots ;
   private String[] P05TR2_A11196PrdNroCAS ;
   private String[] P05TR2_A10938PrdCtw3 ;
   private String[] P05TR2_A10937PrdCtw2 ;
   private String[] P05TR2_A10936PrdCtw1 ;
   private String[] P05TR2_A10935PrdRTM ;
   private String[] P05TR2_A10881PrdLote ;
   private String[] P05TR2_A10119PrdColIdx ;
   private String[] P05TR2_A5888PrdOkotex ;
   private String[] P05TR2_A5887PrdReach ;
   private java.util.Date[] P05TR2_A9742PrdFHS ;
   private String[] P05TR2_A9741PrdHS ;
   private java.util.Date[] P05TR2_A9740PrdFFT ;
   private String[] P05TR2_A9739PrdFT ;
   private String[] P05TR2_A9734PrdNCAS ;
   private java.math.BigDecimal[] P05TR2_A9733PrdAox ;
   private String[] P05TR2_A9732PrdComp ;
   private String[] P05TR2_A9731PrdInc ;
   private byte[] P05TR2_A9609SubFamCod ;
   private boolean[] P05TR2_n9609SubFamCod ;
   private String[] P05TR2_A8936PrdSal ;
   private long[] P05TR2_A8910CC_Ultln ;
   private boolean[] P05TR2_n8910CC_Ultln ;
   private String[] P05TR2_A8897PrdPesTerm ;
   private byte[] P05TR2_A8896PrdPesCon ;
   private byte[] P05TR2_A8895PrdAltAct ;
   private boolean[] P05TR2_n8895PrdAltAct ;
   private int[] P05TR2_A8660Almc_Ult ;
   private boolean[] P05TR2_n8660Almc_Ult ;
   private java.math.BigDecimal[] P05TR2_A8659PrdExiAlmc ;
   private java.math.BigDecimal[] P05TR2_A8647Mat_Lts ;
   private boolean[] P05TR2_n8647Mat_Lts ;
   private java.math.BigDecimal[] P05TR2_A7763PrdPreRef ;
   private boolean[] P05TR2_n7763PrdPreRef ;
   private byte[] P05TR2_A7260PrdHorMad ;
   private java.math.BigDecimal[] P05TR2_A7227PrdNumct2 ;
   private java.math.BigDecimal[] P05TR2_A7226PrdNumct1 ;
   private short[] P05TR2_A6301TipPrdCod ;
   private boolean[] P05TR2_n6301TipPrdCod ;
   private String[] P05TR2_A6191PrdNumCent ;
   private java.math.BigDecimal[] P05TR2_A5590PrdSolub ;
   private String[] P05TR2_A5418PrdSalM ;
   private java.math.BigDecimal[] P05TR2_A5417PrdConcS ;
   private java.math.BigDecimal[] P05TR2_A5416PrdDensS ;
   private java.math.BigDecimal[] P05TR2_A5255PrdPreAc2 ;
   private String[] P05TR2_A4694PrdObs ;
   private String[] P05TR2_A4693PrdNum2 ;
   private String[] P05TR2_A4692PrdNom2 ;
   private byte[] P05TR2_A4338PrdUMeFo ;
   private long[] P05TR2_A3341CCStKULin ;
   private boolean[] P05TR2_n3341CCStKULin ;
   private byte[] P05TR2_A3273PrdTnq ;
   private String[] P05TR2_A3004PrdRev ;
   private short[] P05TR2_A1644PrdDqo ;
   private String[] P05TR2_A1643PrdTip ;
   private byte[] P05TR2_A1194PrdPosY ;
   private short[] P05TR2_A1193PrdPosX ;
   private java.util.Date[] P05TR2_A708PrdFecEnt ;
   private java.math.BigDecimal[] P05TR2_A332DifValStk ;
   private java.math.BigDecimal[] P05TR2_A750PrdValStk ;
   private byte[] P05TR2_A835TipDtoCod ;
   private boolean[] P05TR2_n835TipDtoCod ;
   private byte[] P05TR2_A730PrdSit ;
   private String[] P05TR2_A682PrdCalNec ;
   private String[] P05TR2_A734PrdSus ;
   private boolean[] P05TR2_n734PrdSus ;
   private String[] P05TR2_A728PrdRefPrv ;
   private byte[] P05TR2_A743PrdUniCon ;
   private byte[] P05TR2_A742PrdUniCom ;
   private String[] P05TR2_A703PrdDscTec ;
   private short[] P05TR2_A695PrdConCC ;
   private java.util.Date[] P05TR2_A712PrdFulCC ;
   private java.util.Date[] P05TR2_A714PrdFulPed ;
   private java.math.BigDecimal[] P05TR2_A685PrdCanRes ;
   private java.math.BigDecimal[] P05TR2_A721PrdNumUco ;
   private short[] P05TR2_A716PrdLotMin ;
   private byte[] P05TR2_A629MetCod ;
   private boolean[] P05TR2_n629MetCod ;
   private short[] P05TR2_A722PrdPlaEnt ;
   private short[] P05TR2_A699PrdDiaRot ;
   private String[] P05TR4_A396EmprCod ;
   private String[] P05TR4_A719PrdNum ;
   private String[] P05TR4_A10121PrdRefn ;
   private java.math.BigDecimal[] P05TR4_A7240PrdPrea ;
   private int[] P05TR4_A6158PrdPrv ;
}

final  class pdupproducto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05TR2", "SELECT PrdStkMinD, PrdStkMinU, PrdConDia, PrdFacCon, PrdDifCC, PrdExiCCP, PrdUltCCC, PrdUltECC, PrdUltDCC, PrdExiCC, MovEspULin, PrdFecPre, PrdPreAnt, PrdRec, PrdPreMed, PrdRotRea, PrdCanPen, PrdFulEnt, ValCod, PrdDetPar, PrdPreAct, PrdExiAlm, PrvNum, PrdNom, EmprCod, PrdNum, PrdZDHCId, PrdCosto, PrdFibra, UltLinEnt, ForAlmID, LocUtiID, PrdGRS, PrdFSdoc, PrdFTdoc, PrdLoteFch, AlmPrdID, PrdMatSeca, PrdGruFamI, PrdCantAtM, PrdUbicaci, PrdTHELIST, PrdZDHC, PrdRGB, PrdLoteOb, PrdFabId, PrdList, PrdCtw4, PrdConc, PrdEqLP, PrdNmQu, PrdFuncion, PrdEINECS, PrdConct, PrdHm, PrdGots, PrdNroCAS, PrdCtw3, PrdCtw2, PrdCtw1, PrdRTM, PrdLote, PrdColIdx, PrdOkotex, PrdReach, PrdFHS, PrdHS, PrdFFT, PrdFT, PrdNCAS, PrdAox, PrdComp, PrdInc, SubFamCod, PrdSal, CC_Ultln, PrdPesTerm, PrdPesCon, PrdAltAct, Almc_Ult, PrdExiAlmc, Mat_Lts, PrdPreRef, PrdHorMad, PrdNumct2, PrdNumct1, TipPrdCod, PrdNumCent, PrdSolub, PrdSalM, PrdConcS, PrdDensS, PrdPreAc2, PrdObs, PrdNum2, PrdNom2, PrdUMeFo, CCStKULin, PrdTnq, PrdRev, PrdDqo, PrdTip, PrdPosY, PrdPosX, PrdFecEnt, DifValStk, PrdValStk, TipDtoCod, PrdSit, PrdCalNec, PrdSus, PrdRefPrv, PrdUniCon, PrdUniCom, PrdDscTec, PrdConCC, PrdFulCC, PrdFulPed, PrdCanRes, PrdNumUco, PrdLotMin, MetCod, PrdPlaEnt, PrdDiaRot FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05TR3", "INSERT INTO TXPPRODUC(EmprCod, PrdNum, PrdNom, PrvNum, PrdExiAlm, PrdPreAct, PrdDetPar, ValCod, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, MovEspULin, PrdExiCC, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList, PrdFabId, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdCantAtM, PrdGruFamI, PrdMatSeca, AlmPrdID, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, LocUtiID, ForAlmID, UltLinEnt, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new ForEachCursor("P05TR4", "SELECT EmprCod, PrdNum, PrdRefn, PrdPrea, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05TR5", "INSERT INTO TXPPROPRV(EmprCod, PrdNum, PrdPrv, PrdPrea, PrdRefn) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROPRV")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,4);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,5);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,4);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(18);
               ((byte[]) buf[19])[0] = rslt.getByte(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,5);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,4);
               ((int[]) buf[23])[0] = rslt.getInt(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 26);
               ((String[]) buf[25])[0] = rslt.getString(25, 3);
               ((String[]) buf[26])[0] = rslt.getString(26, 6);
               ((String[]) buf[27])[0] = rslt.getString(27, 20);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(28,3);
               ((String[]) buf[29])[0] = rslt.getString(29, 4);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(30);
               ((short[]) buf[32])[0] = rslt.getShort(31);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(32);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(34);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(35);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDate(36);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(37);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((byte[]) buf[48])[0] = rslt.getByte(39);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((short[]) buf[50])[0] = rslt.getShort(40);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(41, 20);
               ((String[]) buf[53])[0] = rslt.getString(42, 4);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(43, 1);
               ((long[]) buf[56])[0] = rslt.getLong(44);
               ((String[]) buf[57])[0] = rslt.getString(45, 1);
               ((int[]) buf[58])[0] = rslt.getInt(46);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(47, 1);
               ((String[]) buf[61])[0] = rslt.getString(48, 3);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(49,2);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(50, 6);
               ((String[]) buf[65])[0] = rslt.getVarchar(51);
               ((String[]) buf[66])[0] = rslt.getString(52, 50);
               ((String[]) buf[67])[0] = rslt.getString(53, 40);
               ((short[]) buf[68])[0] = rslt.getShort(54);
               ((String[]) buf[69])[0] = rslt.getString(55, 1);
               ((String[]) buf[70])[0] = rslt.getString(56, 1);
               ((String[]) buf[71])[0] = rslt.getString(57, 40);
               ((String[]) buf[72])[0] = rslt.getString(58, 3);
               ((String[]) buf[73])[0] = rslt.getString(59, 20);
               ((String[]) buf[74])[0] = rslt.getString(60, 3);
               ((String[]) buf[75])[0] = rslt.getString(61, 10);
               ((String[]) buf[76])[0] = rslt.getString(62, 26);
               ((String[]) buf[77])[0] = rslt.getString(63, 10);
               ((String[]) buf[78])[0] = rslt.getString(64, 1);
               ((String[]) buf[79])[0] = rslt.getString(65, 1);
               ((java.util.Date[]) buf[80])[0] = rslt.getGXDate(66);
               ((String[]) buf[81])[0] = rslt.getString(67, 1);
               ((java.util.Date[]) buf[82])[0] = rslt.getGXDate(68);
               ((String[]) buf[83])[0] = rslt.getString(69, 1);
               ((String[]) buf[84])[0] = rslt.getString(70, 30);
               ((java.math.BigDecimal[]) buf[85])[0] = rslt.getBigDecimal(71,2);
               ((String[]) buf[86])[0] = rslt.getString(72, 2);
               ((String[]) buf[87])[0] = rslt.getString(73, 2);
               ((byte[]) buf[88])[0] = rslt.getByte(74);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(75, 1);
               ((long[]) buf[91])[0] = rslt.getLong(76);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(77, 10);
               ((byte[]) buf[94])[0] = rslt.getByte(78);
               ((byte[]) buf[95])[0] = rslt.getByte(79);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((int[]) buf[97])[0] = rslt.getInt(80);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[99])[0] = rslt.getBigDecimal(81,4);
               ((java.math.BigDecimal[]) buf[100])[0] = rslt.getBigDecimal(82,2);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[102])[0] = rslt.getBigDecimal(83,5);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((byte[]) buf[104])[0] = rslt.getByte(84);
               ((java.math.BigDecimal[]) buf[105])[0] = rslt.getBigDecimal(85,2);
               ((java.math.BigDecimal[]) buf[106])[0] = rslt.getBigDecimal(86,2);
               ((short[]) buf[107])[0] = rslt.getShort(87);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getString(88, 6);
               ((java.math.BigDecimal[]) buf[110])[0] = rslt.getBigDecimal(89,2);
               ((String[]) buf[111])[0] = rslt.getString(90, 1);
               ((java.math.BigDecimal[]) buf[112])[0] = rslt.getBigDecimal(91,3);
               ((java.math.BigDecimal[]) buf[113])[0] = rslt.getBigDecimal(92,3);
               ((java.math.BigDecimal[]) buf[114])[0] = rslt.getBigDecimal(93,5);
               ((String[]) buf[115])[0] = rslt.getVarchar(94);
               ((String[]) buf[116])[0] = rslt.getString(95, 16);
               ((String[]) buf[117])[0] = rslt.getString(96, 40);
               ((byte[]) buf[118])[0] = rslt.getByte(97);
               ((long[]) buf[119])[0] = rslt.getLong(98);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((byte[]) buf[121])[0] = rslt.getByte(99);
               ((String[]) buf[122])[0] = rslt.getString(100, 1);
               ((short[]) buf[123])[0] = rslt.getShort(101);
               ((String[]) buf[124])[0] = rslt.getString(102, 1);
               ((byte[]) buf[125])[0] = rslt.getByte(103);
               ((short[]) buf[126])[0] = rslt.getShort(104);
               ((java.util.Date[]) buf[127])[0] = rslt.getGXDate(105);
               ((java.math.BigDecimal[]) buf[128])[0] = rslt.getBigDecimal(106,2);
               ((java.math.BigDecimal[]) buf[129])[0] = rslt.getBigDecimal(107,2);
               ((byte[]) buf[130])[0] = rslt.getByte(108);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((byte[]) buf[132])[0] = rslt.getByte(109);
               ((String[]) buf[133])[0] = rslt.getString(110, 1);
               ((String[]) buf[134])[0] = rslt.getString(111, 6);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getString(112, 30);
               ((byte[]) buf[137])[0] = rslt.getByte(113);
               ((byte[]) buf[138])[0] = rslt.getByte(114);
               ((String[]) buf[139])[0] = rslt.getString(115, 4);
               ((short[]) buf[140])[0] = rslt.getShort(116);
               ((java.util.Date[]) buf[141])[0] = rslt.getGXDate(117);
               ((java.util.Date[]) buf[142])[0] = rslt.getGXDate(118);
               ((java.math.BigDecimal[]) buf[143])[0] = rslt.getBigDecimal(119,4);
               ((java.math.BigDecimal[]) buf[144])[0] = rslt.getBigDecimal(120,2);
               ((short[]) buf[145])[0] = rslt.getShort(121);
               ((byte[]) buf[146])[0] = rslt.getByte(122);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((short[]) buf[148])[0] = rslt.getShort(123);
               ((short[]) buf[149])[0] = rslt.getShort(124);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setString(3, (String)parms[2], 26);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 4);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setDate(9, (java.util.Date)parms[8]);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 4);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 5);
               stmt.setDate(15, (java.util.Date)parms[14]);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[16]).shortValue());
               }
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[17], 4);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[18], 2);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[19], 2);
               stmt.setShort(20, ((Number) parms[20]).shortValue());
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[21], 2);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[22], 2);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[23], 4);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[24], 2);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[25], 2);
               stmt.setShort(26, ((Number) parms[26]).shortValue());
               stmt.setShort(27, ((Number) parms[27]).shortValue());
               stmt.setShort(28, ((Number) parms[28]).shortValue());
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(29, ((Number) parms[30]).byteValue());
               }
               stmt.setShort(30, ((Number) parms[31]).shortValue());
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[32], 2);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[33], 4);
               stmt.setDate(33, (java.util.Date)parms[34]);
               stmt.setDate(34, (java.util.Date)parms[35]);
               stmt.setShort(35, ((Number) parms[36]).shortValue());
               stmt.setString(36, (String)parms[37], 4);
               stmt.setByte(37, ((Number) parms[38]).byteValue());
               stmt.setByte(38, ((Number) parms[39]).byteValue());
               stmt.setString(39, (String)parms[40], 30);
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[42], 6);
               }
               stmt.setString(41, (String)parms[43], 1);
               stmt.setByte(42, ((Number) parms[44]).byteValue());
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(43, ((Number) parms[46]).byteValue());
               }
               stmt.setBigDecimal(44, (java.math.BigDecimal)parms[47], 2);
               stmt.setBigDecimal(45, (java.math.BigDecimal)parms[48], 2);
               stmt.setDate(46, (java.util.Date)parms[49]);
               stmt.setShort(47, ((Number) parms[50]).shortValue());
               stmt.setByte(48, ((Number) parms[51]).byteValue());
               stmt.setString(49, (String)parms[52], 1);
               stmt.setShort(50, ((Number) parms[53]).shortValue());
               stmt.setString(51, (String)parms[54], 1);
               stmt.setByte(52, ((Number) parms[55]).byteValue());
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(53, ((Number) parms[57]).longValue());
               }
               stmt.setByte(54, ((Number) parms[58]).byteValue());
               stmt.setString(55, (String)parms[59], 40);
               stmt.setString(56, (String)parms[60], 16);
               stmt.setVarchar(57, (String)parms[61], 1024, false);
               stmt.setBigDecimal(58, (java.math.BigDecimal)parms[62], 5);
               stmt.setBigDecimal(59, (java.math.BigDecimal)parms[63], 3);
               stmt.setBigDecimal(60, (java.math.BigDecimal)parms[64], 3);
               stmt.setString(61, (String)parms[65], 1);
               stmt.setBigDecimal(62, (java.math.BigDecimal)parms[66], 2);
               stmt.setString(63, (String)parms[67], 6);
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(64, ((Number) parms[69]).shortValue());
               }
               stmt.setBigDecimal(65, (java.math.BigDecimal)parms[70], 2);
               stmt.setBigDecimal(66, (java.math.BigDecimal)parms[71], 2);
               stmt.setByte(67, ((Number) parms[72]).byteValue());
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(68, (java.math.BigDecimal)parms[74], 5);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(69, (java.math.BigDecimal)parms[76], 2);
               }
               stmt.setBigDecimal(70, (java.math.BigDecimal)parms[77], 4);
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(71, ((Number) parms[79]).intValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(72, ((Number) parms[81]).byteValue());
               }
               stmt.setByte(73, ((Number) parms[82]).byteValue());
               stmt.setString(74, (String)parms[83], 10);
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(75, ((Number) parms[85]).longValue());
               }
               stmt.setString(76, (String)parms[86], 1);
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(77, ((Number) parms[88]).byteValue());
               }
               stmt.setString(78, (String)parms[89], 2);
               stmt.setString(79, (String)parms[90], 2);
               stmt.setBigDecimal(80, (java.math.BigDecimal)parms[91], 2);
               stmt.setString(81, (String)parms[92], 30);
               stmt.setString(82, (String)parms[93], 1);
               stmt.setDate(83, (java.util.Date)parms[94]);
               stmt.setString(84, (String)parms[95], 1);
               stmt.setDate(85, (java.util.Date)parms[96]);
               stmt.setString(86, (String)parms[97], 1);
               stmt.setString(87, (String)parms[98], 1);
               stmt.setString(88, (String)parms[99], 10);
               stmt.setString(89, (String)parms[100], 26);
               stmt.setString(90, (String)parms[101], 10);
               stmt.setString(91, (String)parms[102], 3);
               stmt.setString(92, (String)parms[103], 20);
               stmt.setString(93, (String)parms[104], 3);
               stmt.setString(94, (String)parms[105], 40);
               stmt.setString(95, (String)parms[106], 1);
               stmt.setString(96, (String)parms[107], 1);
               stmt.setShort(97, ((Number) parms[108]).shortValue());
               stmt.setString(98, (String)parms[109], 40);
               stmt.setString(99, (String)parms[110], 50);
               stmt.setVarchar(100, (String)parms[111], 200, false);
               stmt.setString(101, (String)parms[112], 6);
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 102 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(102, (java.math.BigDecimal)parms[114], 2);
               }
               stmt.setString(103, (String)parms[115], 3);
               stmt.setString(104, (String)parms[116], 1);
               if ( ((Boolean) parms[117]).booleanValue() )
               {
                  stmt.setNull( 105 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(105, ((Number) parms[118]).intValue());
               }
               stmt.setString(106, (String)parms[119], 1);
               stmt.setLong(107, ((Number) parms[120]).longValue());
               stmt.setString(108, (String)parms[121], 1);
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 109 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(109, (String)parms[123], 4);
               }
               stmt.setString(110, (String)parms[124], 20);
               if ( ((Boolean) parms[125]).booleanValue() )
               {
                  stmt.setNull( 111 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(111, ((Number) parms[126]).shortValue());
               }
               if ( ((Boolean) parms[127]).booleanValue() )
               {
                  stmt.setNull( 112 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(112, ((Number) parms[128]).byteValue());
               }
               if ( ((Boolean) parms[129]).booleanValue() )
               {
                  stmt.setNull( 113 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(113, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Boolean) parms[131]).booleanValue() )
               {
                  stmt.setNull( 114 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(114, ((Number) parms[132]).shortValue());
               }
               if ( ((Boolean) parms[133]).booleanValue() )
               {
                  stmt.setNull( 115 , Types.DATE );
               }
               else
               {
                  stmt.setDate(115, (java.util.Date)parms[134]);
               }
               if ( ((Boolean) parms[135]).booleanValue() )
               {
                  stmt.setNull( 116 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(116, (String)parms[136], 200);
               }
               if ( ((Boolean) parms[137]).booleanValue() )
               {
                  stmt.setNull( 117 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(117, (String)parms[138], 200);
               }
               if ( ((Boolean) parms[139]).booleanValue() )
               {
                  stmt.setNull( 118 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(118, (String)parms[140], 1);
               }
               if ( ((Boolean) parms[141]).booleanValue() )
               {
                  stmt.setNull( 119 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(119, ((Number) parms[142]).shortValue());
               }
               if ( ((Boolean) parms[143]).booleanValue() )
               {
                  stmt.setNull( 120 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(120, ((Number) parms[144]).shortValue());
               }
               stmt.setShort(121, ((Number) parms[145]).shortValue());
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 122 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(122, (String)parms[147], 4);
               }
               stmt.setBigDecimal(123, (java.math.BigDecimal)parms[148], 3);
               stmt.setString(124, (String)parms[149], 20);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setString(5, (String)parms[4], 30);
               return;
      }
   }

}

