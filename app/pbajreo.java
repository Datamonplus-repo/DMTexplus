package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbajreo extends GXProcedure
{
   public pbajreo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbajreo.class ), "" );
   }

   public pbajreo( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      pbajreo.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pbajreo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbajreo.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      pbajreo.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbajreo.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbajreo.this.AV18TipDefCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P00692 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar, Short.valueOf(AV18TipDefCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
      /* End optimized DELETE. */
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV15BarCod ;
      GXv_int3[0] = AV16BarCodReo ;
      GXv_char4[0] = AV19NewPar ;
      new app.pnumpar(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4) ;
      pbajreo.this.A396EmprCod = GXv_char1[0] ;
      pbajreo.this.AV15BarCod = GXv_int2[0] ;
      pbajreo.this.AV16BarCodReo = GXv_int3[0] ;
      pbajreo.this.AV19NewPar = GXv_char4[0] ;
      /* Using cursor P00693 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A144BarDisOri = P00693_A144BarDisOri[0] ;
         A190BarNumAso = P00693_A190BarNumAso[0] ;
         A149BarEstRes = P00693_A149BarEstRes[0] ;
         A147BarEstCol = P00693_A147BarEstCol[0] ;
         A158BarFecFpr = P00693_A158BarFecFpr[0] ;
         A163BarHorCum = P00693_A163BarHorCum[0] ;
         A169BarKgsFac = P00693_A169BarKgsFac[0] ;
         A140BarCosAny = P00693_A140BarCosAny[0] ;
         A141BarCosPro = P00693_A141BarCosPro[0] ;
         A189BarNumAny = P00693_A189BarNumAny[0] ;
         A137BarConPar = P00693_A137BarConPar[0] ;
         A138BarConReo = P00693_A138BarConReo[0] ;
         A209BarPri = P00693_A209BarPri[0] ;
         A213BarSit = P00693_A213BarSit[0] ;
         A146BarEst = P00693_A146BarEst[0] ;
         A145BarEncOri = P00693_A145BarEncOri[0] ;
         A139BarCorOri = P00693_A139BarCorOri[0] ;
         A118BarAcaQui = P00693_A118BarAcaQui[0] ;
         A214BarSua = P00693_A214BarSua[0] ;
         A177BarLar = P00693_A177BarLar[0] ;
         A206BarPle = P00693_A206BarPle[0] ;
         A126BarAncAca2 = P00693_A126BarAncAca2[0] ;
         A125BarAncAca1 = P00693_A125BarAncAca1[0] ;
         A128BarAncCru2 = P00693_A128BarAncCru2[0] ;
         A127BarAncCru1 = P00693_A127BarAncCru1[0] ;
         A234BarUrdP3 = P00693_A234BarUrdP3[0] ;
         A231BarUrd3 = P00693_A231BarUrd3[0] ;
         A233BarUrdP2 = P00693_A233BarUrdP2[0] ;
         A230BarUrd2 = P00693_A230BarUrd2[0] ;
         A232BarUrdP1 = P00693_A232BarUrdP1[0] ;
         A229BarUrd1 = P00693_A229BarUrd1[0] ;
         A226BarTraP3 = P00693_A226BarTraP3[0] ;
         A223BarTra3 = P00693_A223BarTra3[0] ;
         A225BarTraP2 = P00693_A225BarTraP2[0] ;
         A222BarTra2 = P00693_A222BarTra2[0] ;
         A224BarTraP1 = P00693_A224BarTraP1[0] ;
         A221BarTra1 = P00693_A221BarTra1[0] ;
         A211BarRdt = P00693_A211BarRdt[0] ;
         A182BarMat = P00693_A182BarMat[0] ;
         A142BarDiaP = P00693_A142BarDiaP[0] ;
         A235BarUrg = P00693_A235BarUrg[0] ;
         A161BarFecSal = P00693_A161BarFecSal[0] ;
         A193BarOpeEsp = P00693_A193BarOpeEsp[0] ;
         A181BarMaqPro = P00693_A181BarMaqPro[0] ;
         A157BarFecEnt = P00693_A157BarFecEnt[0] ;
         A196BarOrdReo = P00693_A196BarOrdReo[0] ;
         A191BarNumPie = P00693_A191BarNumPie[0] ;
         A155BarFecCli = P00693_A155BarFecCli[0] ;
         A148BarEstReo = P00693_A148BarEstReo[0] ;
         A228BarUniMed = P00693_A228BarUniMed[0] ;
         A192BarNumUni = P00693_A192BarNumUni[0] ;
         A159BarFecGen = P00693_A159BarFecGen[0] ;
         A218BarTipCol = P00693_A218BarTipCol[0] ;
         A136BarColNum = P00693_A136BarColNum[0] ;
         A135BarColNom = P00693_A135BarColNom[0] ;
         A217BarTipArt = P00693_A217BarTipArt[0] ;
         n217BarTipArt = P00693_n217BarTipArt[0] ;
         A212BarSer = P00693_A212BarSer[0] ;
         A143BarDisNum = P00693_A143BarDisNum[0] ;
         A361DisCod = P00693_A361DisCod[0] ;
         A236BarVolMaq = P00693_A236BarVolMaq[0] ;
         A180BarMaqCod = P00693_A180BarMaqCod[0] ;
         A120BarAgrEst = P00693_A120BarAgrEst[0] ;
         A132BarCodReo = P00693_A132BarCodReo[0] ;
         A129BarCod = P00693_A129BarCod[0] ;
         A4458BarCruKgs = P00693_A4458BarCruKgs[0] ;
         n4458BarCruKgs = P00693_n4458BarCruKgs[0] ;
         A4457BarCruMts = P00693_A4457BarCruMts[0] ;
         n4457BarCruMts = P00693_n4457BarCruMts[0] ;
         A4456BarPelAnh = P00693_A4456BarPelAnh[0] ;
         A4400BarSitEst = P00693_A4400BarSitEst[0] ;
         A4018BarBot = P00693_A4018BarBot[0] ;
         A4017BarInci = P00693_A4017BarInci[0] ;
         A4016BarTin = P00693_A4016BarTin[0] ;
         A4015BarEnv = P00693_A4015BarEnv[0] ;
         A2512BarComULin = P00693_A2512BarComULin[0] ;
         n2512BarComULin = P00693_n2512BarComULin[0] ;
         A1799BarDibInt = P00693_A1799BarDibInt[0] ;
         A1798BarDibCli = P00693_A1798BarDibCli[0] ;
         A3871BarFecCRe = P00693_A3871BarFecCRe[0] ;
         A3870BarFecLRe = P00693_A3870BarFecLRe[0] ;
         A3787BarEnvRec = P00693_A3787BarEnvRec[0] ;
         n3787BarEnvRec = P00693_n3787BarEnvRec[0] ;
         A3746BarNPed = P00693_A3746BarNPed[0] ;
         A3745BarFoa = P00693_A3745BarFoa[0] ;
         A3744BarPeg = P00693_A3744BarPeg[0] ;
         A3595BarMacCod = P00693_A3595BarMacCod[0] ;
         A3313BarNumTon = P00693_A3313BarNumTon[0] ;
         A3312BarManCod2 = P00693_A3312BarManCod2[0] ;
         A3311BarManCod1 = P00693_A3311BarManCod1[0] ;
         A3310BarFac = P00693_A3310BarFac[0] ;
         A3138BarGraCru2 = P00693_A3138BarGraCru2[0] ;
         A3137BarGraAca2 = P00693_A3137BarGraAca2[0] ;
         A3136BarAncSal3 = P00693_A3136BarAncSal3[0] ;
         A3135BarAncSal2 = P00693_A3135BarAncSal2[0] ;
         A3134BarAncSal1 = P00693_A3134BarAncSal1[0] ;
         A3133BarNumCor = P00693_A3133BarNumCor[0] ;
         A2836BarPle2 = P00693_A2836BarPle2[0] ;
         A3030BarPlf = P00693_A3030BarPlf[0] ;
         A3006BarCoef = P00693_A3006BarCoef[0] ;
         n3006BarCoef = P00693_n3006BarCoef[0] ;
         A2830BarIntPer = P00693_A2830BarIntPer[0] ;
         A2829BarProPer = P00693_A2829BarProPer[0] ;
         A2828BarMtrLot = P00693_A2828BarMtrLot[0] ;
         A2827BarKgsLot = P00693_A2827BarKgsLot[0] ;
         A2826BarNumLot = P00693_A2826BarNumLot[0] ;
         A2803UltLinMaq = P00693_A2803UltLinMaq[0] ;
         n2803UltLinMaq = P00693_n2803UltLinMaq[0] ;
         A2759BarMaqGru = P00693_A2759BarMaqGru[0] ;
         A2754BarSitExt = P00693_A2754BarSitExt[0] ;
         A2753BarNumTex2 = P00693_A2753BarNumTex2[0] ;
         n2753BarNumTex2 = P00693_n2753BarNumTex2[0] ;
         A2752BarNumTex1 = P00693_A2752BarNumTex1[0] ;
         A2746BarCodTex = P00693_A2746BarCodTex[0] ;
         n2746BarCodTex = P00693_n2746BarCodTex[0] ;
         A2487BarConEle = P00693_A2487BarConEle[0] ;
         A2488BarConVap = P00693_A2488BarConVap[0] ;
         A2486BarConAgu = P00693_A2486BarConAgu[0] ;
         A2496BarFecFin = P00693_A2496BarFecFin[0] ;
         A2497BarFecIni = P00693_A2497BarFecIni[0] ;
         A2500BarRDos2 = P00693_A2500BarRDos2[0] ;
         A2499BarRDos1 = P00693_A2499BarRDos1[0] ;
         A2498BarPrdPes = P00693_A2498BarPrdPes[0] ;
         A2485BarColPes = P00693_A2485BarColPes[0] ;
         A1911BarRdoA = P00693_A1911BarRdoA[0] ;
         A1910BarRdoN = P00693_A1910BarRdoN[0] ;
         A1909BarGraAca = P00693_A1909BarGraAca[0] ;
         A2458BarObsVL = P00693_A2458BarObsVL[0] ;
         n2458BarObsVL = P00693_n2458BarObsVL[0] ;
         A2453BarEntAca = P00693_A2453BarEntAca[0] ;
         n2453BarEntAca = P00693_n2453BarEntAca[0] ;
         A2452BarCal = P00693_A2452BarCal[0] ;
         n2452BarCal = P00693_n2452BarCal[0] ;
         A2459BarTemSec = P00693_A2459BarTemSec[0] ;
         A2455BarNMont = P00693_A2455BarNMont[0] ;
         n2455BarNMont = P00693_n2455BarNMont[0] ;
         A2454BarGirar = P00693_A2454BarGirar[0] ;
         A2460BarTipAca = P00693_A2460BarTipAca[0] ;
         A2450BarKgEnR = P00693_A2450BarKgEnR[0] ;
         n2450BarKgEnR = P00693_n2450BarKgEnR[0] ;
         A2443BarBulEnR = P00693_A2443BarBulEnR[0] ;
         n2443BarBulEnR = P00693_n2443BarBulEnR[0] ;
         A2448BarFecEnR = P00693_A2448BarFecEnR[0] ;
         n2448BarFecEnR = P00693_n2448BarFecEnR[0] ;
         A2446BarEnULin = P00693_A2446BarEnULin[0] ;
         n2446BarEnULin = P00693_n2446BarEnULin[0] ;
         A2445BarEntEnE = P00693_A2445BarEntEnE[0] ;
         A2449BarKgEnE = P00693_A2449BarKgEnE[0] ;
         n2449BarKgEnE = P00693_n2449BarKgEnE[0] ;
         A2442BarBulEnE = P00693_A2442BarBulEnE[0] ;
         n2442BarBulEnE = P00693_n2442BarBulEnE[0] ;
         A2447BarFecEnE = P00693_A2447BarFecEnE[0] ;
         A2401BarNumPas = P00693_A2401BarNumPas[0] ;
         n2401BarNumPas = P00693_n2401BarNumPas[0] ;
         A2400BarManCod = P00693_A2400BarManCod[0] ;
         A2311BarCliDes = P00693_A2311BarCliDes[0] ;
         A2265BarExt = P00693_A2265BarExt[0] ;
         n2265BarExt = P00693_n2265BarExt[0] ;
         A2010BarTipDis = P00693_A2010BarTipDis[0] ;
         A1923BarCodTN = P00693_A1923BarCodTN[0] ;
         A1878BarNumTen = P00693_A1878BarNumTen[0] ;
         A1832BarLisInd = P00693_A1832BarLisInd[0] ;
         A1652BarSerDsc = P00693_A1652BarSerDsc[0] ;
         A1503BarPart = P00693_A1503BarPart[0] ;
         A1499BarNMez = P00693_A1499BarNMez[0] ;
         A1500BarNMtr = P00693_A1500BarNMtr[0] ;
         A1431BarLocDis = P00693_A1431BarLocDis[0] ;
         A1254BarPesBal = P00693_A1254BarPesBal[0] ;
         A1235BarNumCli = P00693_A1235BarNumCli[0] ;
         A1234BarNomCli = P00693_A1234BarNomCli[0] ;
         A1226BarGraCru = P00693_A1226BarGraCru[0] ;
         A1224BarEncAnh = P00693_A1224BarEncAnh[0] ;
         A1223BarEncCom = P00693_A1223BarEncCom[0] ;
         A921BarMatiz = P00693_A921BarMatiz[0] ;
         A1003BarFecLan = P00693_A1003BarFecLan[0] ;
         n1003BarFecLan = P00693_n1003BarFecLan[0] ;
         A935BarReoPar = P00693_A935BarReoPar[0] ;
         A936BarReoReo = P00693_A936BarReoReo[0] ;
         A934BarReoCod = P00693_A934BarReoCod[0] ;
         A905ObsReoULin = P00693_A905ObsReoULin[0] ;
         n905ObsReoULin = P00693_n905ObsReoULin[0] ;
         A904ObsReoEnt = P00693_A904ObsReoEnt[0] ;
         n904ObsReoEnt = P00693_n904ObsReoEnt[0] ;
         A899TipDefPor = P00693_A899TipDefPor[0] ;
         n899TipDefPor = P00693_n899TipDefPor[0] ;
         A833TipDefCod = P00693_A833TipDefCod[0] ;
         n833TipDefCod = P00693_n833TipDefCod[0] ;
         A864BarPes = P00693_A864BarPes[0] ;
         A646NotUltLin = P00693_A646NotUltLin[0] ;
         n646NotUltLin = P00693_n646NotUltLin[0] ;
         A178BarLis = P00693_A178BarLis[0] ;
         A130BarCodPar = P00693_A130BarCodPar[0] ;
         A365DisDes = P00693_A365DisDes[0] ;
         A252CliCod = P00693_A252CliCod[0] ;
         n252CliCod = P00693_n252CliCod[0] ;
         A14330BarPriorid = P00693_A14330BarPriorid[0] ;
         A14329BarCnoEncO = P00693_A14329BarCnoEncO[0] ;
         A13908BarIdtx2 = P00693_A13908BarIdtx2[0] ;
         n13908BarIdtx2 = P00693_n13908BarIdtx2[0] ;
         A13907BarSerDsc2 = P00693_A13907BarSerDsc2[0] ;
         n13907BarSerDsc2 = P00693_n13907BarSerDsc2[0] ;
         A13769BarRdto4 = P00693_A13769BarRdto4[0] ;
         n13769BarRdto4 = P00693_n13769BarRdto4[0] ;
         A13234BarRGB = P00693_A13234BarRGB[0] ;
         A13092BarDGUltLi = P00693_A13092BarDGUltLi[0] ;
         n13092BarDGUltLi = P00693_n13092BarDGUltLi[0] ;
         A13077BarLinPrd = P00693_A13077BarLinPrd[0] ;
         A13071BarCanalID = P00693_A13071BarCanalID[0] ;
         A13070BarLineaID = P00693_A13070BarLineaID[0] ;
         A12881BarOEKOTEX = P00693_A12881BarOEKOTEX[0] ;
         n12881BarOEKOTEX = P00693_n12881BarOEKOTEX[0] ;
         A12811BarLocCol = P00693_A12811BarLocCol[0] ;
         A12810BarLocMol = P00693_A12810BarLocMol[0] ;
         A12809BarLocTel = P00693_A12809BarLocTel[0] ;
         A12774BarProdID = P00693_A12774BarProdID[0] ;
         A12767BarTpEstam = P00693_A12767BarTpEstam[0] ;
         A12329SubRevID = P00693_A12329SubRevID[0] ;
         n12329SubRevID = P00693_n12329SubRevID[0] ;
         A11857Nxt_desaID = P00693_A11857Nxt_desaID[0] ;
         n11857Nxt_desaID = P00693_n11857Nxt_desaID[0] ;
         A11855Nxt_dpoID = P00693_A11855Nxt_dpoID[0] ;
         n11855Nxt_dpoID = P00693_n11855Nxt_dpoID[0] ;
         A11853Nxt_cpeID = P00693_A11853Nxt_cpeID[0] ;
         n11853Nxt_cpeID = P00693_n11853Nxt_cpeID[0] ;
         A11852Nxt_ArtCl2 = P00693_A11852Nxt_ArtCl2[0] ;
         A11851Nxt_Sta2 = P00693_A11851Nxt_Sta2[0] ;
         A11850Nxt_Mdlo2 = P00693_A11850Nxt_Mdlo2[0] ;
         A5058BarEnvLaw = P00693_A5058BarEnvLaw[0] ;
         A3736BarPieMtl = P00693_A3736BarPieMtl[0] ;
         A3735BarPieKgl = P00693_A3735BarPieKgl[0] ;
         A3363BarPiePrv = P00693_A3363BarPiePrv[0] ;
         A3362BarMtsPrv = P00693_A3362BarMtsPrv[0] ;
         A3361BarKgsPrv = P00693_A3361BarKgsPrv[0] ;
         A3786BarEnvBar = P00693_A3786BarEnvBar[0] ;
         A3785BarUltAny = P00693_A3785BarUltAny[0] ;
         A3784BarAnyTie = P00693_A3784BarAnyTie[0] ;
         A3783BarRecLis = P00693_A3783BarRecLis[0] ;
         A3780BarKilLam = P00693_A3780BarKilLam[0] ;
         A3597BarVolAma = P00693_A3597BarVolAma[0] ;
         A3596BarMaqAma = P00693_A3596BarMaqAma[0] ;
         A3594BarPriTin = P00693_A3594BarPriTin[0] ;
         A11662BarOrdComp = P00693_A11662BarOrdComp[0] ;
         A4844BarAudULin = P00693_A4844BarAudULin[0] ;
         n4844BarAudULin = P00693_n4844BarAudULin[0] ;
         A4841BarAudMCue = P00693_A4841BarAudMCue[0] ;
         n4841BarAudMCue = P00693_n4841BarAudMCue[0] ;
         A4840BarAudMDig = P00693_A4840BarAudMDig[0] ;
         n4840BarAudMDig = P00693_n4840BarAudMDig[0] ;
         A4838BarAudNPz = P00693_A4838BarAudNPz[0] ;
         n4838BarAudNPz = P00693_n4838BarAudNPz[0] ;
         A4837BarAudSupN = P00693_A4837BarAudSupN[0] ;
         n4837BarAudSupN = P00693_n4837BarAudSupN[0] ;
         A4835BarAudOpeN = P00693_A4835BarAudOpeN[0] ;
         n4835BarAudOpeN = P00693_n4835BarAudOpeN[0] ;
         A4834BarAudOpe = P00693_A4834BarAudOpe[0] ;
         n4834BarAudOpe = P00693_n4834BarAudOpe[0] ;
         A4833BarAudTur = P00693_A4833BarAudTur[0] ;
         n4833BarAudTur = P00693_n4833BarAudTur[0] ;
         A4832BarAudFec = P00693_A4832BarAudFec[0] ;
         n4832BarAudFec = P00693_n4832BarAudFec[0] ;
         A9790BarItem6 = P00693_A9790BarItem6[0] ;
         A9789BarItem5 = P00693_A9789BarItem5[0] ;
         A9778BarItem4 = P00693_A9778BarItem4[0] ;
         A9777BarItem3 = P00693_A9777BarItem3[0] ;
         A9776barItem2 = P00693_A9776barItem2[0] ;
         A9775BarItem1 = P00693_A9775BarItem1[0] ;
         A8568EntSecUlt = P00693_A8568EntSecUlt[0] ;
         n8568EntSecUlt = P00693_n8568EntSecUlt[0] ;
         A8098BarOpeHis = P00693_A8098BarOpeHis[0] ;
         A8097BarFecHis = P00693_A8097BarFecHis[0] ;
         A7733BarMaqEst = P00693_A7733BarMaqEst[0] ;
         A6434BarAsi = P00693_A6434BarAsi[0] ;
         A5406BarAntpT = P00693_A5406BarAntpT[0] ;
         A5367BarAntp = P00693_A5367BarAntp[0] ;
         A5352BarObsAnc = P00693_A5352BarObsAnc[0] ;
         A5351BarObsGrm = P00693_A5351BarObsGrm[0] ;
         A5293BarCodBan = P00693_A5293BarCodBan[0] ;
         A5291BarTipCor = P00693_A5291BarTipCor[0] ;
         A5253BarAcc = P00693_A5253BarAcc[0] ;
         A5057BarFacAbs = P00693_A5057BarFacAbs[0] ;
         n5057BarFacAbs = P00693_n5057BarFacAbs[0] ;
         A5056BarBp15 = P00693_A5056BarBp15[0] ;
         n5056BarBp15 = P00693_n5056BarBp15[0] ;
         A5055BarBp14 = P00693_A5055BarBp14[0] ;
         n5055BarBp14 = P00693_n5055BarBp14[0] ;
         A5054BarBp13 = P00693_A5054BarBp13[0] ;
         n5054BarBp13 = P00693_n5054BarBp13[0] ;
         A5053BarBp12 = P00693_A5053BarBp12[0] ;
         n5053BarBp12 = P00693_n5053BarBp12[0] ;
         A5034BarEstTip = P00693_A5034BarEstTip[0] ;
         A5033BarCom = P00693_A5033BarCom[0] ;
         A5027BarGraCob = P00693_A5027BarGraCob[0] ;
         A5026BarTipEst = P00693_A5026BarTipEst[0] ;
         A5009BarLoteA = P00693_A5009BarLoteA[0] ;
         A4975BarNumReo = P00693_A4975BarNumReo[0] ;
         A4937BarCtrPdas = P00693_A4937BarCtrPdas[0] ;
         n4937BarCtrPdas = P00693_n4937BarCtrPdas[0] ;
         A4908BarMacPro = P00693_A4908BarMacPro[0] ;
         A4845BarAudObs = P00693_A4845BarAudObs[0] ;
         n4845BarAudObs = P00693_n4845BarAudObs[0] ;
         A4836BarAudSup = P00693_A4836BarAudSup[0] ;
         A4812BarEncCli = P00693_A4812BarEncCli[0] ;
         A4716BarDishCod = P00693_A4716BarDishCod[0] ;
         A4613BarHorReg = P00693_A4613BarHorReg[0] ;
         n4613BarHorReg = P00693_n4613BarHorReg[0] ;
         A4612BarPzas = P00693_A4612BarPzas[0] ;
         n4612BarPzas = P00693_n4612BarPzas[0] ;
         A4611BarHorEnt = P00693_A4611BarHorEnt[0] ;
         n4611BarHorEnt = P00693_n4611BarHorEnt[0] ;
         A4610BarTam = P00693_A4610BarTam[0] ;
         A4609BarMdlCod = P00693_A4609BarMdlCod[0] ;
         A4467BarAcaMar = P00693_A4467BarAcaMar[0] ;
         A4466BarAcaAnh = P00693_A4466BarAcaAnh[0] ;
         A4465BarAcaBak = P00693_A4465BarAcaBak[0] ;
         n4465BarAcaBak = P00693_n4465BarAcaBak[0] ;
         A4464BarAcaFor = P00693_A4464BarAcaFor[0] ;
         n4464BarAcaFor = P00693_n4464BarAcaFor[0] ;
         A4463BarLotMaq = P00693_A4463BarLotMaq[0] ;
         n4463BarLotMaq = P00693_n4463BarLotMaq[0] ;
         A4462BarLotKgs = P00693_A4462BarLotKgs[0] ;
         A4461BarLotMts = P00693_A4461BarLotMts[0] ;
         A4460BarLotPza = P00693_A4460BarLotPza[0] ;
         n4460BarLotPza = P00693_n4460BarLotPza[0] ;
         A4459BarCruEnr = P00693_A4459BarCruEnr[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         /*
            INSERT RECORD ON TABLE TXPBARCAD

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W361DisCod = A361DisCod ;
         W365DisDes = A365DisDes ;
         W252CliCod = A252CliCod ;
         n252CliCod = false ;
         W143BarDisNum = A143BarDisNum ;
         W212BarSer = A212BarSer ;
         W217BarTipArt = A217BarTipArt ;
         n217BarTipArt = false ;
         W135BarColNom = A135BarColNom ;
         W136BarColNum = A136BarColNum ;
         W218BarTipCol = A218BarTipCol ;
         W159BarFecGen = A159BarFecGen ;
         W192BarNumUni = A192BarNumUni ;
         W228BarUniMed = A228BarUniMed ;
         W155BarFecCli = A155BarFecCli ;
         W191BarNumPie = A191BarNumPie ;
         W157BarFecEnt = A157BarFecEnt ;
         W180BarMaqCod = A180BarMaqCod ;
         W193BarOpeEsp = A193BarOpeEsp ;
         W235BarUrg = A235BarUrg ;
         W182BarMat = A182BarMat ;
         W211BarRdt = A211BarRdt ;
         W221BarTra1 = A221BarTra1 ;
         W224BarTraP1 = A224BarTraP1 ;
         W222BarTra2 = A222BarTra2 ;
         W225BarTraP2 = A225BarTraP2 ;
         W223BarTra3 = A223BarTra3 ;
         W226BarTraP3 = A226BarTraP3 ;
         W229BarUrd1 = A229BarUrd1 ;
         W232BarUrdP1 = A232BarUrdP1 ;
         W230BarUrd2 = A230BarUrd2 ;
         W233BarUrdP2 = A233BarUrdP2 ;
         W231BarUrd3 = A231BarUrd3 ;
         W234BarUrdP3 = A234BarUrdP3 ;
         W127BarAncCru1 = A127BarAncCru1 ;
         W128BarAncCru2 = A128BarAncCru2 ;
         W125BarAncAca1 = A125BarAncAca1 ;
         W126BarAncAca2 = A126BarAncAca2 ;
         W206BarPle = A206BarPle ;
         W177BarLar = A177BarLar ;
         W214BarSua = A214BarSua ;
         W118BarAcaQui = A118BarAcaQui ;
         W139BarCorOri = A139BarCorOri ;
         W145BarEncOri = A145BarEncOri ;
         W146BarEst = A146BarEst ;
         W213BarSit = A213BarSit ;
         W147BarEstCol = A147BarEstCol ;
         W209BarPri = A209BarPri ;
         W138BarConReo = A138BarConReo ;
         W137BarConPar = A137BarConPar ;
         W189BarNumAny = A189BarNumAny ;
         W141BarCosPro = A141BarCosPro ;
         W140BarCosAny = A140BarCosAny ;
         W169BarKgsFac = A169BarKgsFac ;
         W148BarEstReo = A148BarEstReo ;
         W196BarOrdReo = A196BarOrdReo ;
         W158BarFecFpr = A158BarFecFpr ;
         W120BarAgrEst = A120BarAgrEst ;
         W864BarPes = A864BarPes ;
         W833TipDefCod = A833TipDefCod ;
         n833TipDefCod = false ;
         W899TipDefPor = A899TipDefPor ;
         n899TipDefPor = false ;
         W904ObsReoEnt = A904ObsReoEnt ;
         n904ObsReoEnt = false ;
         W905ObsReoULin = A905ObsReoULin ;
         n905ObsReoULin = false ;
         A130BarCodPar = AV19NewPar ;
         n252CliCod = false ;
         n217BarTipArt = false ;
         n833TipDefCod = false ;
         n899TipDefPor = false ;
         n904ObsReoEnt = false ;
         n905ObsReoULin = false ;
         /* Using cursor P00694 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A120BarAgrEst, A180BarMaqCod, Integer.valueOf(A236BarVolMaq), Integer.valueOf(A361DisCod), A143BarDisNum, A212BarSer, Boolean.valueOf(n217BarTipArt), Short.valueOf(A217BarTipArt), A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), A159BarFecGen, A192BarNumUni, A228BarUniMed, Byte.valueOf(A148BarEstReo), A155BarFecCli, Short.valueOf(A191BarNumPie), Byte.valueOf(A196BarOrdReo), A157BarFecEnt, A181BarMaqPro, Byte.valueOf(A193BarOpeEsp), A161BarFecSal, Byte.valueOf(A235BarUrg), A142BarDiaP, A182BarMat, A211BarRdt, A221BarTra1, Short.valueOf(A224BarTraP1), A222BarTra2, Short.valueOf(A225BarTraP2), A223BarTra3, Short.valueOf(A226BarTraP3), A229BarUrd1, Short.valueOf(A232BarUrdP1), A230BarUrd2, Short.valueOf(A233BarUrdP2), A231BarUrd3, Short.valueOf(A234BarUrdP3), Short.valueOf(A127BarAncCru1), Short.valueOf(A128BarAncCru2), Short.valueOf(A125BarAncAca1), Short.valueOf(A126BarAncAca2), A206BarPle, A177BarLar, A214BarSua, A118BarAcaQui, A139BarCorOri, A145BarEncOri, Byte.valueOf(A146BarEst), Byte.valueOf(A213BarSit), A209BarPri, Byte.valueOf(A138BarConReo), A137BarConPar, Short.valueOf(A189BarNumAny), A141BarCosPro, A140BarCosAny, A169BarKgsFac, Integer.valueOf(A163BarHorCum), A158BarFecFpr, Byte.valueOf(A147BarEstCol), Byte.valueOf(A149BarEstRes), Byte.valueOf(A190BarNumAso), Integer.valueOf(A144BarDisOri), Byte.valueOf(A178BarLis), Boolean.valueOf(n646NotUltLin), Byte.valueOf(A646NotUltLin), Short.valueOf(A864BarPes), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), Boolean.valueOf(n899TipDefPor), Short.valueOf(A899TipDefPor), Boolean.valueOf(n904ObsReoEnt), A904ObsReoEnt, Boolean.valueOf(n905ObsReoULin), Byte.valueOf(A905ObsReoULin), Integer.valueOf(A934BarReoCod), Byte.valueOf(A936BarReoReo), A935BarReoPar, Boolean.valueOf(n1003BarFecLan), A1003BarFecLan, Short.valueOf(A921BarMatiz), A1223BarEncCom, A1224BarEncAnh, Short.valueOf(A1226BarGraCru), A1234BarNomCli, Integer.valueOf(A1235BarNumCli), Byte.valueOf(A1254BarPesBal), A1431BarLocDis, A1500BarNMtr, A1499BarNMez, Short.valueOf(A1503BarPart), A1652BarSerDsc, Byte.valueOf(A1832BarLisInd), A1878BarNumTen, Integer.valueOf(A1923BarCodTN), A2010BarTipDis, Boolean.valueOf(n2265BarExt), Byte.valueOf(A2265BarExt), Integer.valueOf(A2311BarCliDes), Short.valueOf(A2400BarManCod), Boolean.valueOf(n2401BarNumPas), Byte.valueOf(A2401BarNumPas), A2447BarFecEnE, Boolean.valueOf(n2442BarBulEnE), Short.valueOf(A2442BarBulEnE), Boolean.valueOf(n2449BarKgEnE), A2449BarKgEnE, A2445BarEntEnE, Boolean.valueOf(n2446BarEnULin), Short.valueOf(A2446BarEnULin), Boolean.valueOf(n2448BarFecEnR), A2448BarFecEnR, Boolean.valueOf(n2443BarBulEnR), Short.valueOf(A2443BarBulEnR), Boolean.valueOf(n2450BarKgEnR), A2450BarKgEnR, A2460BarTipAca, A2454BarGirar,
         Boolean.valueOf(n2455BarNMont), Short.valueOf(A2455BarNMont), Short.valueOf(A2459BarTemSec), Boolean.valueOf(n2452BarCal), A2452BarCal, Boolean.valueOf(n2453BarEntAca), A2453BarEntAca, Boolean.valueOf(n2458BarObsVL), Short.valueOf(A2458BarObsVL), Short.valueOf(A1909BarGraAca), A1910BarRdoN, A1911BarRdoA, A2485BarColPes, A2498BarPrdPes, A2499BarRDos1, A2500BarRDos2, A2497BarFecIni, A2496BarFecFin, Integer.valueOf(A2486BarConAgu), Integer.valueOf(A2488BarConVap), Integer.valueOf(A2487BarConEle), Boolean.valueOf(n2746BarCodTex), A2746BarCodTex, Byte.valueOf(A2752BarNumTex1), Boolean.valueOf(n2753BarNumTex2), Short.valueOf(A2753BarNumTex2), Byte.valueOf(A2754BarSitExt), A2759BarMaqGru, Boolean.valueOf(n2803UltLinMaq), Short.valueOf(A2803UltLinMaq), Integer.valueOf(A2826BarNumLot), A2827BarKgsLot, A2828BarMtrLot, A2829BarProPer, Byte.valueOf(A2830BarIntPer), Boolean.valueOf(n3006BarCoef), A3006BarCoef, A3030BarPlf, A2836BarPle2, Short.valueOf(A3133BarNumCor), Short.valueOf(A3134BarAncSal1), Short.valueOf(A3135BarAncSal2), Short.valueOf(A3136BarAncSal3), Short.valueOf(A3137BarGraAca2), Short.valueOf(A3138BarGraCru2), A3310BarFac, Short.valueOf(A3311BarManCod1), Short.valueOf(A3312BarManCod2), A3313BarNumTon, Integer.valueOf(A3595BarMacCod), A3744BarPeg, A3745BarFoa, A3746BarNPed, Boolean.valueOf(n3787BarEnvRec), A3787BarEnvRec, A3870BarFecLRe, A3871BarFecCRe, A1798BarDibCli, Integer.valueOf(A1799BarDibInt), Boolean.valueOf(n2512BarComULin), Byte.valueOf(A2512BarComULin), Byte.valueOf(A4015BarEnv), A4016BarTin, Byte.valueOf(A4017BarInci), A4018BarBot, Byte.valueOf(A4400BarSitEst), Short.valueOf(A4456BarPelAnh), Boolean.valueOf(n4457BarCruMts), A4457BarCruMts, Boolean.valueOf(n4458BarCruKgs), A4458BarCruKgs, A4459BarCruEnr, Boolean.valueOf(n4460BarLotPza), Short.valueOf(A4460BarLotPza), A4461BarLotMts, A4462BarLotKgs, Boolean.valueOf(n4463BarLotMaq), A4463BarLotMaq, Boolean.valueOf(n4464BarAcaFor), Integer.valueOf(A4464BarAcaFor), Boolean.valueOf(n4465BarAcaBak), A4465BarAcaBak, Short.valueOf(A4466BarAcaAnh), A4467BarAcaMar, A4609BarMdlCod, A4610BarTam, Boolean.valueOf(n4611BarHorEnt), A4611BarHorEnt, Boolean.valueOf(n4612BarPzas), Integer.valueOf(A4612BarPzas), Boolean.valueOf(n4613BarHorReg), A4613BarHorReg, A4716BarDishCod, A4812BarEncCli, Integer.valueOf(A4836BarAudSup), Boolean.valueOf(n4845BarAudObs), A4845BarAudObs, A4908BarMacPro, Boolean.valueOf(n4937BarCtrPdas), Byte.valueOf(A4937BarCtrPdas), Short.valueOf(A4975BarNumReo), A5009BarLoteA, Byte.valueOf(A5026BarTipEst), Byte.valueOf(A5027BarGraCob), A5033BarCom, A5034BarEstTip, Boolean.valueOf(n5053BarBp12), Short.valueOf(A5053BarBp12), Boolean.valueOf(n5054BarBp13), Short.valueOf(A5054BarBp13), Boolean.valueOf(n5055BarBp14), A5055BarBp14, Boolean.valueOf(n5056BarBp15), Short.valueOf(A5056BarBp15), Boolean.valueOf(n5057BarFacAbs), A5057BarFacAbs, A5253BarAcc, A5291BarTipCor, A5293BarCodBan, A5351BarObsGrm, A5352BarObsAnc, A5367BarAntp, A5406BarAntpT, Byte.valueOf(A6434BarAsi), A7733BarMaqEst,
         A8097BarFecHis, Integer.valueOf(A8098BarOpeHis), Boolean.valueOf(n8568EntSecUlt), Integer.valueOf(A8568EntSecUlt), A9775BarItem1, A9776barItem2, A9777BarItem3, A9778BarItem4, A9789BarItem5, A9790BarItem6, Boolean.valueOf(n4832BarAudFec), A4832BarAudFec, Boolean.valueOf(n4833BarAudTur), Byte.valueOf(A4833BarAudTur), Boolean.valueOf(n4834BarAudOpe), Integer.valueOf(A4834BarAudOpe), Boolean.valueOf(n4835BarAudOpeN), A4835BarAudOpeN, Boolean.valueOf(n4837BarAudSupN), A4837BarAudSupN, Boolean.valueOf(n4838BarAudNPz), Short.valueOf(A4838BarAudNPz), Boolean.valueOf(n4840BarAudMDig), A4840BarAudMDig, Boolean.valueOf(n4841BarAudMCue), A4841BarAudMCue, Boolean.valueOf(n4844BarAudULin), Short.valueOf(A4844BarAudULin), A11662BarOrdComp, Byte.valueOf(A3594BarPriTin), A3596BarMaqAma, Integer.valueOf(A3597BarVolAma), A3780BarKilLam, Byte.valueOf(A3783BarRecLis), Short.valueOf(A3784BarAnyTie), Short.valueOf(A3785BarUltAny), A3786BarEnvBar, A3361BarKgsPrv, A3362BarMtsPrv, Short.valueOf(A3363BarPiePrv), A3735BarPieKgl, A3736BarPieMtl, A5058BarEnvLaw, A11850Nxt_Mdlo2, A11851Nxt_Sta2, A11852Nxt_ArtCl2, Boolean.valueOf(n11853Nxt_cpeID), Short.valueOf(A11853Nxt_cpeID), Boolean.valueOf(n11855Nxt_dpoID), Short.valueOf(A11855Nxt_dpoID), Boolean.valueOf(n11857Nxt_desaID), Short.valueOf(A11857Nxt_desaID), Boolean.valueOf(n12329SubRevID), A12329SubRevID, Byte.valueOf(A12767BarTpEstam), A12774BarProdID, A12809BarLocTel, A12810BarLocMol, A12811BarLocCol, Boolean.valueOf(n12881BarOEKOTEX), A12881BarOEKOTEX, Short.valueOf(A13070BarLineaID), Integer.valueOf(A13071BarCanalID), A13077BarLinPrd, Boolean.valueOf(n13092BarDGUltLi), Byte.valueOf(A13092BarDGUltLi), Long.valueOf(A13234BarRGB), Boolean.valueOf(n13769BarRdto4), Short.valueOf(A13769BarRdto4), Boolean.valueOf(n13907BarSerDsc2), A13907BarSerDsc2, Boolean.valueOf(n13908BarIdtx2), A13908BarIdtx2, A14329BarCnoEncO, Byte.valueOf(A14330BarPriorid), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
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
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A361DisCod = W361DisCod ;
         A365DisDes = W365DisDes ;
         A252CliCod = W252CliCod ;
         n252CliCod = false ;
         A143BarDisNum = W143BarDisNum ;
         A212BarSer = W212BarSer ;
         A217BarTipArt = W217BarTipArt ;
         n217BarTipArt = false ;
         A135BarColNom = W135BarColNom ;
         A136BarColNum = W136BarColNum ;
         A218BarTipCol = W218BarTipCol ;
         A159BarFecGen = W159BarFecGen ;
         A192BarNumUni = W192BarNumUni ;
         A228BarUniMed = W228BarUniMed ;
         A155BarFecCli = W155BarFecCli ;
         A191BarNumPie = W191BarNumPie ;
         A157BarFecEnt = W157BarFecEnt ;
         A180BarMaqCod = W180BarMaqCod ;
         A193BarOpeEsp = W193BarOpeEsp ;
         A235BarUrg = W235BarUrg ;
         A182BarMat = W182BarMat ;
         A211BarRdt = W211BarRdt ;
         A221BarTra1 = W221BarTra1 ;
         A224BarTraP1 = W224BarTraP1 ;
         A222BarTra2 = W222BarTra2 ;
         A225BarTraP2 = W225BarTraP2 ;
         A223BarTra3 = W223BarTra3 ;
         A226BarTraP3 = W226BarTraP3 ;
         A229BarUrd1 = W229BarUrd1 ;
         A232BarUrdP1 = W232BarUrdP1 ;
         A230BarUrd2 = W230BarUrd2 ;
         A233BarUrdP2 = W233BarUrdP2 ;
         A231BarUrd3 = W231BarUrd3 ;
         A234BarUrdP3 = W234BarUrdP3 ;
         A127BarAncCru1 = W127BarAncCru1 ;
         A128BarAncCru2 = W128BarAncCru2 ;
         A125BarAncAca1 = W125BarAncAca1 ;
         A126BarAncAca2 = W126BarAncAca2 ;
         A206BarPle = W206BarPle ;
         A177BarLar = W177BarLar ;
         A214BarSua = W214BarSua ;
         A118BarAcaQui = W118BarAcaQui ;
         A139BarCorOri = W139BarCorOri ;
         A145BarEncOri = W145BarEncOri ;
         A146BarEst = W146BarEst ;
         A213BarSit = W213BarSit ;
         A147BarEstCol = W147BarEstCol ;
         A209BarPri = W209BarPri ;
         A138BarConReo = W138BarConReo ;
         A137BarConPar = W137BarConPar ;
         A189BarNumAny = W189BarNumAny ;
         A141BarCosPro = W141BarCosPro ;
         A140BarCosAny = W140BarCosAny ;
         A169BarKgsFac = W169BarKgsFac ;
         A148BarEstReo = W148BarEstReo ;
         A196BarOrdReo = W196BarOrdReo ;
         A158BarFecFpr = W158BarFecFpr ;
         A120BarAgrEst = W120BarAgrEst ;
         A864BarPes = W864BarPes ;
         A833TipDefCod = W833TipDefCod ;
         n833TipDefCod = false ;
         A899TipDefPor = W899TipDefPor ;
         n899TipDefPor = false ;
         A904ObsReoEnt = W904ObsReoEnt ;
         n904ObsReoEnt = false ;
         A905ObsReoULin = W905ObsReoULin ;
         n905ObsReoULin = false ;
         /* End Insert */
         /* Using cursor P00695 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A761ProFasLin = P00695_A761ProFasLin[0] ;
            n761ProFasLin = P00695_n761ProFasLin[0] ;
            A758ProCod = P00695_A758ProCod[0] ;
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            /*
               INSERT RECORD ON TABLE TXPBARPRO

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W758ProCod = A758ProCod ;
            W761ProFasLin = A761ProFasLin ;
            n761ProFasLin = false ;
            A130BarCodPar = AV19NewPar ;
            n761ProFasLin = false ;
            /* Using cursor P00696 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Boolean.valueOf(n761ProFasLin), Short.valueOf(A761ProFasLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
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
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A758ProCod = W758ProCod ;
            A761ProFasLin = W761ProFasLin ;
            n761ProFasLin = false ;
            /* End Insert */
            /* Using cursor P00697 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A12466SolAfLnUl = P00697_A12466SolAfLnUl[0] ;
               n12466SolAfLnUl = P00697_n12466SolAfLnUl[0] ;
               A12465SolLzLnUl = P00697_A12465SolLzLnUl[0] ;
               n12465SolLzLnUl = P00697_n12465SolLzLnUl[0] ;
               A12464SolPlLnUl = P00697_A12464SolPlLnUl[0] ;
               n12464SolPlLnUl = P00697_n12464SolPlLnUl[0] ;
               A12463SolSAlLnUl = P00697_A12463SolSAlLnUl[0] ;
               n12463SolSAlLnUl = P00697_n12463SolSAlLnUl[0] ;
               A12462SolSAcLnUl = P00697_A12462SolSAcLnUl[0] ;
               n12462SolSAcLnUl = P00697_n12462SolSAcLnUl[0] ;
               A12461SolFrLnUl = P00697_A12461SolFrLnUl[0] ;
               n12461SolFrLnUl = P00697_n12461SolFrLnUl[0] ;
               A12460SolAgLnUl = P00697_A12460SolAgLnUl[0] ;
               n12460SolAgLnUl = P00697_n12460SolAgLnUl[0] ;
               A12459SolLvLnUl = P00697_A12459SolLvLnUl[0] ;
               n12459SolLvLnUl = P00697_n12459SolLvLnUl[0] ;
               A12458TsSolObs = P00697_A12458TsSolObs[0] ;
               n12458TsSolObs = P00697_n12458TsSolObs[0] ;
               A12457TsSolRFec = P00697_A12457TsSolRFec[0] ;
               n12457TsSolRFec = P00697_n12457TsSolRFec[0] ;
               A12456TsSolRLcq = P00697_A12456TsSolRLcq[0] ;
               n12456TsSolRLcq = P00697_n12456TsSolRLcq[0] ;
               A12455TsSolTFec = P00697_A12455TsSolTFec[0] ;
               n12455TsSolTFec = P00697_n12455TsSolTFec[0] ;
               A12454TsSolTLcq = P00697_A12454TsSolTLcq[0] ;
               n12454TsSolTLcq = P00697_n12454TsSolTLcq[0] ;
               A12379BarFasBlq = P00697_A12379BarFasBlq[0] ;
               n12379BarFasBlq = P00697_n12379BarFasBlq[0] ;
               A12360BarFasTOb = P00697_A12360BarFasTOb[0] ;
               n12360BarFasTOb = P00697_n12360BarFasTOb[0] ;
               A12359BarFasObs = P00697_A12359BarFasObs[0] ;
               n12359BarFasObs = P00697_n12359BarFasObs[0] ;
               A2327BarFasSer = P00697_A2327BarFasSer[0] ;
               n2327BarFasSer = P00697_n2327BarFasSer[0] ;
               A3836BarFasPri = P00697_A3836BarFasPri[0] ;
               A10032BarObsB = P00697_A10032BarObsB[0] ;
               n10032BarObsB = P00697_n10032BarObsB[0] ;
               A9842BarObsF = P00697_A9842BarObsF[0] ;
               n9842BarObsF = P00697_n9842BarObsF[0] ;
               A8938BarfasPri2 = P00697_A8938BarfasPri2[0] ;
               n8938BarfasPri2 = P00697_n8938BarfasPri2[0] ;
               A8594BarHdrO = P00697_A8594BarHdrO[0] ;
               n8594BarHdrO = P00697_n8594BarHdrO[0] ;
               A7933Dtb_UOrd = P00697_A7933Dtb_UOrd[0] ;
               n7933Dtb_UOrd = P00697_n7933Dtb_UOrd[0] ;
               A7914BarfasRb = P00697_A7914BarfasRb[0] ;
               n7914BarfasRb = P00697_n7914BarfasRb[0] ;
               A7913BarfasUnpL = P00697_A7913BarfasUnpL[0] ;
               n7913BarfasUnpL = P00697_n7913BarfasUnpL[0] ;
               A7912Barfastpp = P00697_A7912Barfastpp[0] ;
               n7912Barfastpp = P00697_n7912Barfastpp[0] ;
               A6555BarFasNPl = P00697_A6555BarFasNPl[0] ;
               A6430BarTieAut = P00697_A6430BarTieAut[0] ;
               A6392BarHdMn = P00697_A6392BarHdMn[0] ;
               n6392BarHdMn = P00697_n6392BarHdMn[0] ;
               A6391BarfasOP = P00697_A6391BarfasOP[0] ;
               n6391BarfasOP = P00697_n6391BarfasOP[0] ;
               A6390BarfasMn = P00697_A6390BarfasMn[0] ;
               n6390BarfasMn = P00697_n6390BarfasMn[0] ;
               A6173BarFasSec = P00697_A6173BarFasSec[0] ;
               n6173BarFasSec = P00697_n6173BarFasSec[0] ;
               A6012BarFasTip = P00697_A6012BarFasTip[0] ;
               n6012BarFasTip = P00697_n6012BarFasTip[0] ;
               A5999BarFasCR = P00697_A5999BarFasCR[0] ;
               A5896BarMaqPlan = P00697_A5896BarMaqPlan[0] ;
               n5896BarMaqPlan = P00697_n5896BarMaqPlan[0] ;
               A5720BarFasMtT = P00697_A5720BarFasMtT[0] ;
               n5720BarFasMtT = P00697_n5720BarFasMtT[0] ;
               A5719BarFasKgT = P00697_A5719BarFasKgT[0] ;
               n5719BarFasKgT = P00697_n5719BarFasKgT[0] ;
               A5372FasQuiUl = P00697_A5372FasQuiUl[0] ;
               n5372FasQuiUl = P00697_n5372FasQuiUl[0] ;
               A5369BarFasGral = P00697_A5369BarFasGral[0] ;
               n5369BarFasGral = P00697_n5369BarFasGral[0] ;
               A5048BarFasUsu = P00697_A5048BarFasUsu[0] ;
               n5048BarFasUsu = P00697_n5048BarFasUsu[0] ;
               A5047BarFasFPl = P00697_A5047BarFasFPl[0] ;
               n5047BarFasFPl = P00697_n5047BarFasFPl[0] ;
               A5046BarFasPrp = P00697_A5046BarFasPrp[0] ;
               n5046BarFasPrp = P00697_n5046BarFasPrp[0] ;
               A5045BarFasAgr = P00697_A5045BarFasAgr[0] ;
               n5045BarFasAgr = P00697_n5045BarFasAgr[0] ;
               A457FasCod = P00697_A457FasCod[0] ;
               A4974BarFasPPr = P00697_A4974BarFasPPr[0] ;
               n4974BarFasPPr = P00697_n4974BarFasPPr[0] ;
               A4973BarFasKPr = P00697_A4973BarFasKPr[0] ;
               n4973BarFasKPr = P00697_n4973BarFasKPr[0] ;
               A4443BarFasDTF = P00697_A4443BarFasDTF[0] ;
               n4443BarFasDTF = P00697_n4443BarFasDTF[0] ;
               A4442BarFasDTI = P00697_A4442BarFasDTI[0] ;
               n4442BarFasDTI = P00697_n4442BarFasDTI[0] ;
               A4938BarFasInc = P00697_A4938BarFasInc[0] ;
               n4938BarFasInc = P00697_n4938BarFasInc[0] ;
               A4905BarFasAcab = P00697_A4905BarFasAcab[0] ;
               A4638BarUltNlot = P00697_A4638BarUltNlot[0] ;
               n4638BarUltNlot = P00697_n4638BarUltNlot[0] ;
               A4637BarFasCara = P00697_A4637BarFasCara[0] ;
               A4636BarFasPzas = P00697_A4636BarFasPzas[0] ;
               n4636BarFasPzas = P00697_n4636BarFasPzas[0] ;
               A4288BarNPzas = P00697_A4288BarNPzas[0] ;
               A4301BarFasCoP = P00697_A4301BarFasCoP[0] ;
               A4287BarFasFor = P00697_A4287BarFasFor[0] ;
               A4022BarNumBot = P00697_A4022BarNumBot[0] ;
               A4021BarFasBot = P00697_A4021BarFasBot[0] ;
               A3838BarFasMtr = P00697_A3838BarFasMtr[0] ;
               n3838BarFasMtr = P00697_n3838BarFasMtr[0] ;
               A3837BarFasKgm = P00697_A3837BarFasKgm[0] ;
               n3837BarFasKgm = P00697_n3837BarFasKgm[0] ;
               A179BarLoc = P00697_A179BarLoc[0] ;
               A3298BarFecRIni = P00697_A3298BarFecRIni[0] ;
               A215BarTieRea = P00697_A215BarTieRea[0] ;
               A164BarHorFin = P00697_A164BarHorFin[0] ;
               A165BarHorIni = P00697_A165BarHorIni[0] ;
               A227BarUni = P00697_A227BarUni[0] ;
               A216BarTieTeo = P00697_A216BarTieTeo[0] ;
               A160BarFecRea = P00697_A160BarFecRea[0] ;
               A162BarFecTeo = P00697_A162BarFecTeo[0] ;
               A150BarFacTin = P00697_A150BarFacTin[0] ;
               A603MaqCodBis = P00697_A603MaqCodBis[0] ;
               A153BarFasEst = P00697_A153BarFasEst[0] ;
               A152BarFasCon = P00697_A152BarFasCon[0] ;
               A194BarOrdLin = P00697_A194BarOrdLin[0] ;
               W396EmprCod = A396EmprCod ;
               W129BarCod = A129BarCod ;
               W132BarCodReo = A132BarCodReo ;
               W130BarCodPar = A130BarCodPar ;
               W758ProCod = A758ProCod ;
               /*
                  INSERT RECORD ON TABLE TXPBARFAS

               */
               W396EmprCod = A396EmprCod ;
               W129BarCod = A129BarCod ;
               W132BarCodReo = A132BarCodReo ;
               W130BarCodPar = A130BarCodPar ;
               W758ProCod = A758ProCod ;
               W194BarOrdLin = A194BarOrdLin ;
               W457FasCod = A457FasCod ;
               W153BarFasEst = A153BarFasEst ;
               W162BarFecTeo = A162BarFecTeo ;
               W160BarFecRea = A160BarFecRea ;
               W3298BarFecRIni = A3298BarFecRIni ;
               W216BarTieTeo = A216BarTieTeo ;
               W227BarUni = A227BarUni ;
               W179BarLoc = A179BarLoc ;
               W165BarHorIni = A165BarHorIni ;
               W164BarHorFin = A164BarHorFin ;
               W215BarTieRea = A215BarTieRea ;
               W603MaqCodBis = A603MaqCodBis ;
               A130BarCodPar = AV19NewPar ;
               /* Using cursor P00698 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A152BarFasCon, Byte.valueOf(A153BarFasEst), A603MaqCodBis, A150BarFacTin, A162BarFecTeo, A160BarFecRea, A216BarTieTeo, A227BarUni, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), A215BarTieRea, A3298BarFecRIni, A179BarLoc, Boolean.valueOf(n3837BarFasKgm), A3837BarFasKgm, Boolean.valueOf(n3838BarFasMtr), A3838BarFasMtr, A4021BarFasBot, Integer.valueOf(A4022BarNumBot), A4287BarFasFor, A4301BarFasCoP, Integer.valueOf(A4288BarNPzas), Boolean.valueOf(n4636BarFasPzas), Integer.valueOf(A4636BarFasPzas), A4637BarFasCara, Boolean.valueOf(n4638BarUltNlot), Integer.valueOf(A4638BarUltNlot), A4905BarFasAcab, Boolean.valueOf(n4938BarFasInc), Byte.valueOf(A4938BarFasInc), Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, Boolean.valueOf(n4973BarFasKPr), A4973BarFasKPr, Boolean.valueOf(n4974BarFasPPr), Short.valueOf(A4974BarFasPPr), A457FasCod, Boolean.valueOf(n5045BarFasAgr), A5045BarFasAgr, Boolean.valueOf(n5046BarFasPrp), A5046BarFasPrp, Boolean.valueOf(n5047BarFasFPl), A5047BarFasFPl, Boolean.valueOf(n5048BarFasUsu), A5048BarFasUsu, Boolean.valueOf(n5369BarFasGral), A5369BarFasGral, Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), Boolean.valueOf(n5719BarFasKgT), A5719BarFasKgT, Boolean.valueOf(n5720BarFasMtT), A5720BarFasMtT, Boolean.valueOf(n5896BarMaqPlan), A5896BarMaqPlan, A5999BarFasCR, Boolean.valueOf(n6012BarFasTip), A6012BarFasTip, Boolean.valueOf(n6173BarFasSec), A6173BarFasSec, Boolean.valueOf(n6390BarfasMn), A6390BarfasMn, Boolean.valueOf(n6391BarfasOP), Short.valueOf(A6391BarfasOP), Boolean.valueOf(n6392BarHdMn), A6392BarHdMn, Short.valueOf(A6430BarTieAut), Byte.valueOf(A6555BarFasNPl), Boolean.valueOf(n7912Barfastpp), A7912Barfastpp, Boolean.valueOf(n7913BarfasUnpL), A7913BarfasUnpL, Boolean.valueOf(n7914BarfasRb), A7914BarfasRb, Boolean.valueOf(n7933Dtb_UOrd), Short.valueOf(A7933Dtb_UOrd), Boolean.valueOf(n8594BarHdrO), A8594BarHdrO, Boolean.valueOf(n8938BarfasPri2), Short.valueOf(A8938BarfasPri2), Boolean.valueOf(n9842BarObsF), A9842BarObsF, Boolean.valueOf(n10032BarObsB), A10032BarObsB, Byte.valueOf(A3836BarFasPri), Boolean.valueOf(n2327BarFasSer), A2327BarFasSer, Boolean.valueOf(n12359BarFasObs), A12359BarFasObs, Boolean.valueOf(n12360BarFasTOb), A12360BarFasTOb, Boolean.valueOf(n12379BarFasBlq), Byte.valueOf(A12379BarFasBlq), Boolean.valueOf(n12454TsSolTLcq), Integer.valueOf(A12454TsSolTLcq), Boolean.valueOf(n12455TsSolTFec), A12455TsSolTFec, Boolean.valueOf(n12456TsSolRLcq), Integer.valueOf(A12456TsSolRLcq), Boolean.valueOf(n12457TsSolRFec), A12457TsSolRFec, Boolean.valueOf(n12458TsSolObs), A12458TsSolObs, Boolean.valueOf(n12459SolLvLnUl), Short.valueOf(A12459SolLvLnUl), Boolean.valueOf(n12460SolAgLnUl), Short.valueOf(A12460SolAgLnUl), Boolean.valueOf(n12461SolFrLnUl), Short.valueOf(A12461SolFrLnUl), Boolean.valueOf(n12462SolSAcLnUl), Short.valueOf(A12462SolSAcLnUl), Boolean.valueOf(n12463SolSAlLnUl), Short.valueOf(A12463SolSAlLnUl), Boolean.valueOf(n12464SolPlLnUl),
               Short.valueOf(A12464SolPlLnUl), Boolean.valueOf(n12465SolLzLnUl), Short.valueOf(A12465SolLzLnUl), Boolean.valueOf(n12466SolAfLnUl), Short.valueOf(A12466SolAfLnUl)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
               A396EmprCod = W396EmprCod ;
               A129BarCod = W129BarCod ;
               A132BarCodReo = W132BarCodReo ;
               A130BarCodPar = W130BarCodPar ;
               A758ProCod = W758ProCod ;
               A194BarOrdLin = W194BarOrdLin ;
               A457FasCod = W457FasCod ;
               A153BarFasEst = W153BarFasEst ;
               A162BarFecTeo = W162BarFecTeo ;
               A160BarFecRea = W160BarFecRea ;
               A3298BarFecRIni = W3298BarFecRIni ;
               A216BarTieTeo = W216BarTieTeo ;
               A227BarUni = W227BarUni ;
               A179BarLoc = W179BarLoc ;
               A165BarHorIni = W165BarHorIni ;
               A164BarHorFin = W164BarHorFin ;
               A215BarTieRea = W215BarTieRea ;
               A603MaqCodBis = W603MaqCodBis ;
               /* End Insert */
               /* Using cursor P00699 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
               A396EmprCod = W396EmprCod ;
               A129BarCod = W129BarCod ;
               A132BarCodReo = W132BarCodReo ;
               A130BarCodPar = W130BarCodPar ;
               A758ProCod = W758ProCod ;
               pr_default.readNext(5);
            }
            pr_default.close(5);
            /* Using cursor P006910 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         /* Using cursor P006911 */
         pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A13988BarPieVtx = P006911_A13988BarPieVtx[0] ;
            A13519BarPieMq = P006911_A13519BarPieMq[0] ;
            n13519BarPieMq = P006911_n13519BarPieMq[0] ;
            A13518BarPieTurn = P006911_A13518BarPieTurn[0] ;
            n13518BarPieTurn = P006911_n13518BarPieTurn[0] ;
            A13109BarPieST = P006911_A13109BarPieST[0] ;
            n13109BarPieST = P006911_n13109BarPieST[0] ;
            A13108BarPieLote = P006911_A13108BarPieLote[0] ;
            n13108BarPieLote = P006911_n13108BarPieLote[0] ;
            A13107BarPieEmp = P006911_A13107BarPieEmp[0] ;
            n13107BarPieEmp = P006911_n13107BarPieEmp[0] ;
            A13004BarPieDest = P006911_A13004BarPieDest[0] ;
            n13004BarPieDest = P006911_n13004BarPieDest[0] ;
            A12992BarPieOpe = P006911_A12992BarPieOpe[0] ;
            n12992BarPieOpe = P006911_n12992BarPieOpe[0] ;
            A12936BarPieSecu = P006911_A12936BarPieSecu[0] ;
            n12936BarPieSecu = P006911_n12936BarPieSecu[0] ;
            A12935BarPieTono = P006911_A12935BarPieTono[0] ;
            n12935BarPieTono = P006911_n12935BarPieTono[0] ;
            A12928BarPieEncC = P006911_A12928BarPieEncC[0] ;
            n12928BarPieEncC = P006911_n12928BarPieEncC[0] ;
            A12927BarPieCoCN = P006911_A12927BarPieCoCN[0] ;
            n12927BarPieCoCN = P006911_n12927BarPieCoCN[0] ;
            A12926BarPieCoCI = P006911_A12926BarPieCoCI[0] ;
            n12926BarPieCoCI = P006911_n12926BarPieCoCI[0] ;
            A12925BarPieCliN = P006911_A12925BarPieCliN[0] ;
            n12925BarPieCliN = P006911_n12925BarPieCliN[0] ;
            A12924BarPieCliI = P006911_A12924BarPieCliI[0] ;
            n12924BarPieCliI = P006911_n12924BarPieCliI[0] ;
            A12923BarPieArtD = P006911_A12923BarPieArtD[0] ;
            n12923BarPieArtD = P006911_n12923BarPieArtD[0] ;
            A12922BarPieArtI = P006911_A12922BarPieArtI[0] ;
            n12922BarPieArtI = P006911_n12922BarPieArtI[0] ;
            A12921BarPieColN = P006911_A12921BarPieColN[0] ;
            n12921BarPieColN = P006911_n12921BarPieColN[0] ;
            A12920BarPieColD = P006911_A12920BarPieColD[0] ;
            n12920BarPieColD = P006911_n12920BarPieColD[0] ;
            A12912BarPieUltD = P006911_A12912BarPieUltD[0] ;
            n12912BarPieUltD = P006911_n12912BarPieUltD[0] ;
            A12911BarPieFep = P006911_A12911BarPieFep[0] ;
            n12911BarPieFep = P006911_n12911BarPieFep[0] ;
            A12780BarPieUsu = P006911_A12780BarPieUsu[0] ;
            n12780BarPieUsu = P006911_n12780BarPieUsu[0] ;
            A12779BarPieFdv = P006911_A12779BarPieFdv[0] ;
            n12779BarPieFdv = P006911_n12779BarPieFdv[0] ;
            A12113BarPieCLd = P006911_A12113BarPieCLd[0] ;
            n12113BarPieCLd = P006911_n12113BarPieCLd[0] ;
            A1642BarPieOrd = P006911_A1642BarPieOrd[0] ;
            n1642BarPieOrd = P006911_n1642BarPieOrd[0] ;
            A6473BarUniB = P006911_A6473BarUniB[0] ;
            n6473BarUniB = P006911_n6473BarUniB[0] ;
            A6472BarTara = P006911_A6472BarTara[0] ;
            n6472BarTara = P006911_n6472BarTara[0] ;
            A1919BarPieObs = P006911_A1919BarPieObs[0] ;
            n1919BarPieObs = P006911_n1919BarPieObs[0] ;
            A9984BarPiePda = P006911_A9984BarPiePda[0] ;
            n9984BarPiePda = P006911_n9984BarPiePda[0] ;
            A9846BarPieAncc = P006911_A9846BarPieAncc[0] ;
            n9846BarPieAncc = P006911_n9846BarPieAncc[0] ;
            A9800BarNPes = P006911_A9800BarNPes[0] ;
            n9800BarNPes = P006911_n9800BarNPes[0] ;
            A9799BarPz2 = P006911_A9799BarPz2[0] ;
            n9799BarPz2 = P006911_n9799BarPz2[0] ;
            A9798BarPz1 = P006911_A9798BarPz1[0] ;
            n9798BarPz1 = P006911_n9798BarPz1[0] ;
            A9796BarPieK2 = P006911_A9796BarPieK2[0] ;
            n9796BarPieK2 = P006911_n9796BarPieK2[0] ;
            A9795BarPieK1 = P006911_A9795BarPieK1[0] ;
            n9795BarPieK1 = P006911_n9795BarPieK1[0] ;
            A8907PzaB80 = P006911_A8907PzaB80[0] ;
            n8907PzaB80 = P006911_n8907PzaB80[0] ;
            A8838CodBarPz = P006911_A8838CodBarPz[0] ;
            n8838CodBarPz = P006911_n8838CodBarPz[0] ;
            A8707BapieObs = P006911_A8707BapieObs[0] ;
            n8707BapieObs = P006911_n8707BapieObs[0] ;
            A6489BarPieIdPz = P006911_A6489BarPieIdPz[0] ;
            n6489BarPieIdPz = P006911_n6489BarPieIdPz[0] ;
            A6116BarPieImp = P006911_A6116BarPieImp[0] ;
            n6116BarPieImp = P006911_n6116BarPieImp[0] ;
            A3277BarPieAut = P006911_A3277BarPieAut[0] ;
            n3277BarPieAut = P006911_n3277BarPieAut[0] ;
            A3276BarMtsAut = P006911_A3276BarMtsAut[0] ;
            n3276BarMtsAut = P006911_n3276BarMtsAut[0] ;
            A3275BarKgsAut = P006911_A3275BarKgsAut[0] ;
            n3275BarKgsAut = P006911_n3275BarKgsAut[0] ;
            A2186BarPieLoc = P006911_A2186BarPieLoc[0] ;
            n2186BarPieLoc = P006911_n2186BarPieLoc[0] ;
            A1691BarPieAnc = P006911_A1691BarPieAnc[0] ;
            n1691BarPieAnc = P006911_n1691BarPieAnc[0] ;
            A1501BarPiePie = P006911_A1501BarPiePie[0] ;
            A1271BarPieLzd = P006911_A1271BarPieLzd[0] ;
            A908PieOriCod = P006911_A908PieOriCod[0] ;
            A197BarPConTro = P006911_A197BarPConTro[0] ;
            A183BarMetLan = P006911_A183BarMetLan[0] ;
            A170BarKilLan = P006911_A170BarKilLan[0] ;
            A201BarPieEst = P006911_A201BarPieEst[0] ;
            A205BarPieMet = P006911_A205BarPieMet[0] ;
            A203BarPieKil = P006911_A203BarPieKil[0] ;
            A44AlbRecCod = P006911_A44AlbRecCod[0] ;
            A200BarPieCod = P006911_A200BarPieCod[0] ;
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            /*
               INSERT RECORD ON TABLE TXPBARPIE

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W200BarPieCod = A200BarPieCod ;
            W44AlbRecCod = A44AlbRecCod ;
            W203BarPieKil = A203BarPieKil ;
            W205BarPieMet = A205BarPieMet ;
            W201BarPieEst = A201BarPieEst ;
            W170BarKilLan = A170BarKilLan ;
            W183BarMetLan = A183BarMetLan ;
            W197BarPConTro = A197BarPConTro ;
            A130BarCodPar = AV19NewPar ;
            /* Using cursor P006912 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3277BarPieAut), Short.valueOf(A3277BarPieAut), Boolean.valueOf(n6116BarPieImp), A6116BarPieImp, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz, Boolean.valueOf(n8707BapieObs), A8707BapieObs, Boolean.valueOf(n8838CodBarPz), A8838CodBarPz, Boolean.valueOf(n8907PzaB80), A8907PzaB80, Boolean.valueOf(n9795BarPieK1), A9795BarPieK1, Boolean.valueOf(n9796BarPieK2), A9796BarPieK2, Boolean.valueOf(n9798BarPz1), Integer.valueOf(A9798BarPz1), Boolean.valueOf(n9799BarPz2), Integer.valueOf(A9799BarPz2), Boolean.valueOf(n9800BarNPes), Byte.valueOf(A9800BarNPes), Boolean.valueOf(n9846BarPieAncc), Short.valueOf(A9846BarPieAncc), Boolean.valueOf(n9984BarPiePda), A9984BarPiePda, Boolean.valueOf(n1919BarPieObs), A1919BarPieObs, Boolean.valueOf(n6472BarTara), A6472BarTara, Boolean.valueOf(n6473BarUniB), A6473BarUniB, Boolean.valueOf(n1642BarPieOrd), Integer.valueOf(A1642BarPieOrd), Boolean.valueOf(n12113BarPieCLd), Byte.valueOf(A12113BarPieCLd), Boolean.valueOf(n12779BarPieFdv), A12779BarPieFdv, Boolean.valueOf(n12780BarPieUsu), A12780BarPieUsu, Boolean.valueOf(n12911BarPieFep), A12911BarPieFep, Boolean.valueOf(n12912BarPieUltD), Short.valueOf(A12912BarPieUltD), Boolean.valueOf(n12920BarPieColD), A12920BarPieColD, Boolean.valueOf(n12921BarPieColN), Integer.valueOf(A12921BarPieColN), Boolean.valueOf(n12922BarPieArtI), A12922BarPieArtI, Boolean.valueOf(n12923BarPieArtD), A12923BarPieArtD, Boolean.valueOf(n12924BarPieCliI), Integer.valueOf(A12924BarPieCliI), Boolean.valueOf(n12925BarPieCliN), A12925BarPieCliN, Boolean.valueOf(n12926BarPieCoCI), A12926BarPieCoCI, Boolean.valueOf(n12927BarPieCoCN), Integer.valueOf(A12927BarPieCoCN), Boolean.valueOf(n12928BarPieEncC), A12928BarPieEncC, Boolean.valueOf(n12935BarPieTono), A12935BarPieTono, Boolean.valueOf(n12936BarPieSecu), A12936BarPieSecu, Boolean.valueOf(n12992BarPieOpe), Integer.valueOf(A12992BarPieOpe), Boolean.valueOf(n13004BarPieDest), Byte.valueOf(A13004BarPieDest), Boolean.valueOf(n13107BarPieEmp), Short.valueOf(A13107BarPieEmp), Boolean.valueOf(n13108BarPieLote), A13108BarPieLote, Boolean.valueOf(n13109BarPieST), A13109BarPieST, Boolean.valueOf(n13518BarPieTurn), Byte.valueOf(A13518BarPieTurn), Boolean.valueOf(n13519BarPieMq), A13519BarPieMq, A13988BarPieVtx});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
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
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A200BarPieCod = W200BarPieCod ;
            A44AlbRecCod = W44AlbRecCod ;
            A203BarPieKil = W203BarPieKil ;
            A205BarPieMet = W205BarPieMet ;
            A201BarPieEst = W201BarPieEst ;
            A170BarKilLan = W170BarKilLan ;
            A183BarMetLan = W183BarMetLan ;
            A197BarPConTro = W197BarPConTro ;
            /* End Insert */
            /* Using cursor P006913 */
            pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         /* Using cursor P006914 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbajreo.this.A396EmprCod;
      this.aP1[0] = pbajreo.this.AV15BarCod;
      this.aP2[0] = pbajreo.this.AV16BarCodReo;
      this.aP3[0] = pbajreo.this.AV17BarCodPar;
      this.aP4[0] = pbajreo.this.AV18TipDefCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbajreo");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      AV19NewPar = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P00693_A144BarDisOri = new int[1] ;
      P00693_A190BarNumAso = new byte[1] ;
      P00693_A149BarEstRes = new byte[1] ;
      P00693_A147BarEstCol = new byte[1] ;
      P00693_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_A163BarHorCum = new int[1] ;
      P00693_A169BarKgsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A189BarNumAny = new short[1] ;
      P00693_A137BarConPar = new String[] {""} ;
      P00693_A138BarConReo = new byte[1] ;
      P00693_A209BarPri = new String[] {""} ;
      P00693_A213BarSit = new byte[1] ;
      P00693_A146BarEst = new byte[1] ;
      P00693_A145BarEncOri = new String[] {""} ;
      P00693_A139BarCorOri = new String[] {""} ;
      P00693_A118BarAcaQui = new String[] {""} ;
      P00693_A214BarSua = new String[] {""} ;
      P00693_A177BarLar = new String[] {""} ;
      P00693_A206BarPle = new String[] {""} ;
      P00693_A126BarAncAca2 = new short[1] ;
      P00693_A125BarAncAca1 = new short[1] ;
      P00693_A128BarAncCru2 = new short[1] ;
      P00693_A127BarAncCru1 = new short[1] ;
      P00693_A234BarUrdP3 = new short[1] ;
      P00693_A231BarUrd3 = new String[] {""} ;
      P00693_A233BarUrdP2 = new short[1] ;
      P00693_A230BarUrd2 = new String[] {""} ;
      P00693_A232BarUrdP1 = new short[1] ;
      P00693_A229BarUrd1 = new String[] {""} ;
      P00693_A226BarTraP3 = new short[1] ;
      P00693_A223BarTra3 = new String[] {""} ;
      P00693_A225BarTraP2 = new short[1] ;
      P00693_A222BarTra2 = new String[] {""} ;
      P00693_A224BarTraP1 = new short[1] ;
      P00693_A221BarTra1 = new String[] {""} ;
      P00693_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A182BarMat = new String[] {""} ;
      P00693_A142BarDiaP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A235BarUrg = new byte[1] ;
      P00693_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_A193BarOpeEsp = new byte[1] ;
      P00693_A181BarMaqPro = new String[] {""} ;
      P00693_A157BarFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_A196BarOrdReo = new byte[1] ;
      P00693_A191BarNumPie = new short[1] ;
      P00693_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_A148BarEstReo = new byte[1] ;
      P00693_A228BarUniMed = new String[] {""} ;
      P00693_A192BarNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_A218BarTipCol = new byte[1] ;
      P00693_A136BarColNum = new int[1] ;
      P00693_A135BarColNom = new String[] {""} ;
      P00693_A217BarTipArt = new short[1] ;
      P00693_n217BarTipArt = new boolean[] {false} ;
      P00693_A212BarSer = new String[] {""} ;
      P00693_A143BarDisNum = new String[] {""} ;
      P00693_A361DisCod = new int[1] ;
      P00693_A236BarVolMaq = new int[1] ;
      P00693_A180BarMaqCod = new String[] {""} ;
      P00693_A120BarAgrEst = new String[] {""} ;
      P00693_A132BarCodReo = new byte[1] ;
      P00693_A129BarCod = new int[1] ;
      P00693_A4458BarCruKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_n4458BarCruKgs = new boolean[] {false} ;
      P00693_A4457BarCruMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_n4457BarCruMts = new boolean[] {false} ;
      P00693_A4456BarPelAnh = new short[1] ;
      P00693_A4400BarSitEst = new byte[1] ;
      P00693_A4018BarBot = new String[] {""} ;
      P00693_A4017BarInci = new byte[1] ;
      P00693_A4016BarTin = new String[] {""} ;
      P00693_A4015BarEnv = new byte[1] ;
      P00693_A2512BarComULin = new byte[1] ;
      P00693_n2512BarComULin = new boolean[] {false} ;
      P00693_A1799BarDibInt = new int[1] ;
      P00693_A1798BarDibCli = new String[] {""} ;
      P00693_A3871BarFecCRe = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_A3870BarFecLRe = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_A3787BarEnvRec = new String[] {""} ;
      P00693_n3787BarEnvRec = new boolean[] {false} ;
      P00693_A3746BarNPed = new String[] {""} ;
      P00693_A3745BarFoa = new String[] {""} ;
      P00693_A3744BarPeg = new String[] {""} ;
      P00693_A3595BarMacCod = new int[1] ;
      P00693_A3313BarNumTon = new String[] {""} ;
      P00693_A3312BarManCod2 = new short[1] ;
      P00693_A3311BarManCod1 = new short[1] ;
      P00693_A3310BarFac = new String[] {""} ;
      P00693_A3138BarGraCru2 = new short[1] ;
      P00693_A3137BarGraAca2 = new short[1] ;
      P00693_A3136BarAncSal3 = new short[1] ;
      P00693_A3135BarAncSal2 = new short[1] ;
      P00693_A3134BarAncSal1 = new short[1] ;
      P00693_A3133BarNumCor = new short[1] ;
      P00693_A2836BarPle2 = new String[] {""} ;
      P00693_A3030BarPlf = new String[] {""} ;
      P00693_A3006BarCoef = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_n3006BarCoef = new boolean[] {false} ;
      P00693_A2830BarIntPer = new byte[1] ;
      P00693_A2829BarProPer = new String[] {""} ;
      P00693_A2828BarMtrLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A2827BarKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A2826BarNumLot = new int[1] ;
      P00693_A2803UltLinMaq = new short[1] ;
      P00693_n2803UltLinMaq = new boolean[] {false} ;
      P00693_A2759BarMaqGru = new String[] {""} ;
      P00693_A2754BarSitExt = new byte[1] ;
      P00693_A2753BarNumTex2 = new short[1] ;
      P00693_n2753BarNumTex2 = new boolean[] {false} ;
      P00693_A2752BarNumTex1 = new byte[1] ;
      P00693_A2746BarCodTex = new String[] {""} ;
      P00693_n2746BarCodTex = new boolean[] {false} ;
      P00693_A2487BarConEle = new int[1] ;
      P00693_A2488BarConVap = new int[1] ;
      P00693_A2486BarConAgu = new int[1] ;
      P00693_A2496BarFecFin = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_A2497BarFecIni = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_A2500BarRDos2 = new String[] {""} ;
      P00693_A2499BarRDos1 = new String[] {""} ;
      P00693_A2498BarPrdPes = new String[] {""} ;
      P00693_A2485BarColPes = new String[] {""} ;
      P00693_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A1910BarRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A1909BarGraAca = new short[1] ;
      P00693_A2458BarObsVL = new short[1] ;
      P00693_n2458BarObsVL = new boolean[] {false} ;
      P00693_A2453BarEntAca = new String[] {""} ;
      P00693_n2453BarEntAca = new boolean[] {false} ;
      P00693_A2452BarCal = new String[] {""} ;
      P00693_n2452BarCal = new boolean[] {false} ;
      P00693_A2459BarTemSec = new short[1] ;
      P00693_A2455BarNMont = new short[1] ;
      P00693_n2455BarNMont = new boolean[] {false} ;
      P00693_A2454BarGirar = new String[] {""} ;
      P00693_A2460BarTipAca = new String[] {""} ;
      P00693_A2450BarKgEnR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_n2450BarKgEnR = new boolean[] {false} ;
      P00693_A2443BarBulEnR = new short[1] ;
      P00693_n2443BarBulEnR = new boolean[] {false} ;
      P00693_A2448BarFecEnR = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_n2448BarFecEnR = new boolean[] {false} ;
      P00693_A2446BarEnULin = new short[1] ;
      P00693_n2446BarEnULin = new boolean[] {false} ;
      P00693_A2445BarEntEnE = new String[] {""} ;
      P00693_A2449BarKgEnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_n2449BarKgEnE = new boolean[] {false} ;
      P00693_A2442BarBulEnE = new short[1] ;
      P00693_n2442BarBulEnE = new boolean[] {false} ;
      P00693_A2447BarFecEnE = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_A2401BarNumPas = new byte[1] ;
      P00693_n2401BarNumPas = new boolean[] {false} ;
      P00693_A2400BarManCod = new short[1] ;
      P00693_A2311BarCliDes = new int[1] ;
      P00693_A2265BarExt = new byte[1] ;
      P00693_n2265BarExt = new boolean[] {false} ;
      P00693_A2010BarTipDis = new String[] {""} ;
      P00693_A1923BarCodTN = new int[1] ;
      P00693_A1878BarNumTen = new String[] {""} ;
      P00693_A1832BarLisInd = new byte[1] ;
      P00693_A1652BarSerDsc = new String[] {""} ;
      P00693_A1503BarPart = new short[1] ;
      P00693_A1499BarNMez = new String[] {""} ;
      P00693_A1500BarNMtr = new String[] {""} ;
      P00693_A1431BarLocDis = new String[] {""} ;
      P00693_A1254BarPesBal = new byte[1] ;
      P00693_A1235BarNumCli = new int[1] ;
      P00693_A1234BarNomCli = new String[] {""} ;
      P00693_A1226BarGraCru = new short[1] ;
      P00693_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A921BarMatiz = new short[1] ;
      P00693_A1003BarFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_n1003BarFecLan = new boolean[] {false} ;
      P00693_A935BarReoPar = new String[] {""} ;
      P00693_A936BarReoReo = new byte[1] ;
      P00693_A934BarReoCod = new int[1] ;
      P00693_A905ObsReoULin = new byte[1] ;
      P00693_n905ObsReoULin = new boolean[] {false} ;
      P00693_A904ObsReoEnt = new String[] {""} ;
      P00693_n904ObsReoEnt = new boolean[] {false} ;
      P00693_A899TipDefPor = new short[1] ;
      P00693_n899TipDefPor = new boolean[] {false} ;
      P00693_A833TipDefCod = new short[1] ;
      P00693_n833TipDefCod = new boolean[] {false} ;
      P00693_A864BarPes = new short[1] ;
      P00693_A646NotUltLin = new byte[1] ;
      P00693_n646NotUltLin = new boolean[] {false} ;
      P00693_A178BarLis = new byte[1] ;
      P00693_A396EmprCod = new String[] {""} ;
      P00693_A130BarCodPar = new String[] {""} ;
      P00693_A365DisDes = new String[] {""} ;
      P00693_A252CliCod = new int[1] ;
      P00693_n252CliCod = new boolean[] {false} ;
      P00693_A14330BarPriorid = new byte[1] ;
      P00693_A14329BarCnoEncO = new String[] {""} ;
      P00693_A13908BarIdtx2 = new String[] {""} ;
      P00693_n13908BarIdtx2 = new boolean[] {false} ;
      P00693_A13907BarSerDsc2 = new String[] {""} ;
      P00693_n13907BarSerDsc2 = new boolean[] {false} ;
      P00693_A13769BarRdto4 = new short[1] ;
      P00693_n13769BarRdto4 = new boolean[] {false} ;
      P00693_A13234BarRGB = new long[1] ;
      P00693_A13092BarDGUltLi = new byte[1] ;
      P00693_n13092BarDGUltLi = new boolean[] {false} ;
      P00693_A13077BarLinPrd = new String[] {""} ;
      P00693_A13071BarCanalID = new int[1] ;
      P00693_A13070BarLineaID = new short[1] ;
      P00693_A12881BarOEKOTEX = new String[] {""} ;
      P00693_n12881BarOEKOTEX = new boolean[] {false} ;
      P00693_A12811BarLocCol = new String[] {""} ;
      P00693_A12810BarLocMol = new String[] {""} ;
      P00693_A12809BarLocTel = new String[] {""} ;
      P00693_A12774BarProdID = new String[] {""} ;
      P00693_A12767BarTpEstam = new byte[1] ;
      P00693_A12329SubRevID = new String[] {""} ;
      P00693_n12329SubRevID = new boolean[] {false} ;
      P00693_A11857Nxt_desaID = new short[1] ;
      P00693_n11857Nxt_desaID = new boolean[] {false} ;
      P00693_A11855Nxt_dpoID = new short[1] ;
      P00693_n11855Nxt_dpoID = new boolean[] {false} ;
      P00693_A11853Nxt_cpeID = new short[1] ;
      P00693_n11853Nxt_cpeID = new boolean[] {false} ;
      P00693_A11852Nxt_ArtCl2 = new String[] {""} ;
      P00693_A11851Nxt_Sta2 = new String[] {""} ;
      P00693_A11850Nxt_Mdlo2 = new String[] {""} ;
      P00693_A5058BarEnvLaw = new String[] {""} ;
      P00693_A3736BarPieMtl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A3735BarPieKgl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A3363BarPiePrv = new short[1] ;
      P00693_A3362BarMtsPrv = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A3361BarKgsPrv = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A3786BarEnvBar = new String[] {""} ;
      P00693_A3785BarUltAny = new short[1] ;
      P00693_A3784BarAnyTie = new short[1] ;
      P00693_A3783BarRecLis = new byte[1] ;
      P00693_A3780BarKilLam = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A3597BarVolAma = new int[1] ;
      P00693_A3596BarMaqAma = new String[] {""} ;
      P00693_A3594BarPriTin = new byte[1] ;
      P00693_A11662BarOrdComp = new String[] {""} ;
      P00693_A4844BarAudULin = new short[1] ;
      P00693_n4844BarAudULin = new boolean[] {false} ;
      P00693_A4841BarAudMCue = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_n4841BarAudMCue = new boolean[] {false} ;
      P00693_A4840BarAudMDig = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_n4840BarAudMDig = new boolean[] {false} ;
      P00693_A4838BarAudNPz = new short[1] ;
      P00693_n4838BarAudNPz = new boolean[] {false} ;
      P00693_A4837BarAudSupN = new String[] {""} ;
      P00693_n4837BarAudSupN = new boolean[] {false} ;
      P00693_A4835BarAudOpeN = new String[] {""} ;
      P00693_n4835BarAudOpeN = new boolean[] {false} ;
      P00693_A4834BarAudOpe = new int[1] ;
      P00693_n4834BarAudOpe = new boolean[] {false} ;
      P00693_A4833BarAudTur = new byte[1] ;
      P00693_n4833BarAudTur = new boolean[] {false} ;
      P00693_A4832BarAudFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_n4832BarAudFec = new boolean[] {false} ;
      P00693_A9790BarItem6 = new String[] {""} ;
      P00693_A9789BarItem5 = new String[] {""} ;
      P00693_A9778BarItem4 = new String[] {""} ;
      P00693_A9777BarItem3 = new String[] {""} ;
      P00693_A9776barItem2 = new String[] {""} ;
      P00693_A9775BarItem1 = new String[] {""} ;
      P00693_A8568EntSecUlt = new int[1] ;
      P00693_n8568EntSecUlt = new boolean[] {false} ;
      P00693_A8098BarOpeHis = new int[1] ;
      P00693_A8097BarFecHis = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_A7733BarMaqEst = new String[] {""} ;
      P00693_A6434BarAsi = new byte[1] ;
      P00693_A5406BarAntpT = new String[] {""} ;
      P00693_A5367BarAntp = new String[] {""} ;
      P00693_A5352BarObsAnc = new String[] {""} ;
      P00693_A5351BarObsGrm = new String[] {""} ;
      P00693_A5293BarCodBan = new String[] {""} ;
      P00693_A5291BarTipCor = new String[] {""} ;
      P00693_A5253BarAcc = new String[] {""} ;
      P00693_A5057BarFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_n5057BarFacAbs = new boolean[] {false} ;
      P00693_A5056BarBp15 = new short[1] ;
      P00693_n5056BarBp15 = new boolean[] {false} ;
      P00693_A5055BarBp14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_n5055BarBp14 = new boolean[] {false} ;
      P00693_A5054BarBp13 = new short[1] ;
      P00693_n5054BarBp13 = new boolean[] {false} ;
      P00693_A5053BarBp12 = new short[1] ;
      P00693_n5053BarBp12 = new boolean[] {false} ;
      P00693_A5034BarEstTip = new String[] {""} ;
      P00693_A5033BarCom = new String[] {""} ;
      P00693_A5027BarGraCob = new byte[1] ;
      P00693_A5026BarTipEst = new byte[1] ;
      P00693_A5009BarLoteA = new String[] {""} ;
      P00693_A4975BarNumReo = new short[1] ;
      P00693_A4937BarCtrPdas = new byte[1] ;
      P00693_n4937BarCtrPdas = new boolean[] {false} ;
      P00693_A4908BarMacPro = new String[] {""} ;
      P00693_A4845BarAudObs = new String[] {""} ;
      P00693_n4845BarAudObs = new boolean[] {false} ;
      P00693_A4836BarAudSup = new int[1] ;
      P00693_A4812BarEncCli = new String[] {""} ;
      P00693_A4716BarDishCod = new String[] {""} ;
      P00693_A4613BarHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_n4613BarHorReg = new boolean[] {false} ;
      P00693_A4612BarPzas = new int[1] ;
      P00693_n4612BarPzas = new boolean[] {false} ;
      P00693_A4611BarHorEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P00693_n4611BarHorEnt = new boolean[] {false} ;
      P00693_A4610BarTam = new String[] {""} ;
      P00693_A4609BarMdlCod = new String[] {""} ;
      P00693_A4467BarAcaMar = new String[] {""} ;
      P00693_A4466BarAcaAnh = new short[1] ;
      P00693_A4465BarAcaBak = new String[] {""} ;
      P00693_n4465BarAcaBak = new boolean[] {false} ;
      P00693_A4464BarAcaFor = new int[1] ;
      P00693_n4464BarAcaFor = new boolean[] {false} ;
      P00693_A4463BarLotMaq = new String[] {""} ;
      P00693_n4463BarLotMaq = new boolean[] {false} ;
      P00693_A4462BarLotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A4461BarLotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00693_A4460BarLotPza = new short[1] ;
      P00693_n4460BarLotPza = new boolean[] {false} ;
      P00693_A4459BarCruEnr = new String[] {""} ;
      A158BarFecFpr = GXutil.nullDate() ;
      A169BarKgsFac = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A137BarConPar = "" ;
      A209BarPri = "" ;
      A145BarEncOri = "" ;
      A139BarCorOri = "" ;
      A118BarAcaQui = "" ;
      A214BarSua = "" ;
      A177BarLar = "" ;
      A206BarPle = "" ;
      A231BarUrd3 = "" ;
      A230BarUrd2 = "" ;
      A229BarUrd1 = "" ;
      A223BarTra3 = "" ;
      A222BarTra2 = "" ;
      A221BarTra1 = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      A182BarMat = "" ;
      A142BarDiaP = DecimalUtil.ZERO ;
      A161BarFecSal = GXutil.nullDate() ;
      A181BarMaqPro = "" ;
      A157BarFecEnt = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A228BarUniMed = "" ;
      A192BarNumUni = DecimalUtil.ZERO ;
      A159BarFecGen = GXutil.nullDate() ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A143BarDisNum = "" ;
      A180BarMaqCod = "" ;
      A120BarAgrEst = "" ;
      A4458BarCruKgs = DecimalUtil.ZERO ;
      A4457BarCruMts = DecimalUtil.ZERO ;
      A4018BarBot = "" ;
      A4016BarTin = "" ;
      A1798BarDibCli = "" ;
      A3871BarFecCRe = GXutil.nullDate() ;
      A3870BarFecLRe = GXutil.nullDate() ;
      A3787BarEnvRec = "" ;
      A3746BarNPed = "" ;
      A3745BarFoa = "" ;
      A3744BarPeg = "" ;
      A3313BarNumTon = "" ;
      A3310BarFac = "" ;
      A2836BarPle2 = "" ;
      A3030BarPlf = "" ;
      A3006BarCoef = DecimalUtil.ZERO ;
      A2829BarProPer = "" ;
      A2828BarMtrLot = DecimalUtil.ZERO ;
      A2827BarKgsLot = DecimalUtil.ZERO ;
      A2759BarMaqGru = "" ;
      A2746BarCodTex = "" ;
      A2496BarFecFin = GXutil.nullDate() ;
      A2497BarFecIni = GXutil.nullDate() ;
      A2500BarRDos2 = "" ;
      A2499BarRDos1 = "" ;
      A2498BarPrdPes = "" ;
      A2485BarColPes = "" ;
      A1911BarRdoA = DecimalUtil.ZERO ;
      A1910BarRdoN = DecimalUtil.ZERO ;
      A2453BarEntAca = "" ;
      A2452BarCal = "" ;
      A2454BarGirar = "" ;
      A2460BarTipAca = "" ;
      A2450BarKgEnR = DecimalUtil.ZERO ;
      A2448BarFecEnR = GXutil.nullDate() ;
      A2445BarEntEnE = "" ;
      A2449BarKgEnE = DecimalUtil.ZERO ;
      A2447BarFecEnE = GXutil.nullDate() ;
      A2010BarTipDis = "" ;
      A1878BarNumTen = "" ;
      A1652BarSerDsc = "" ;
      A1499BarNMez = "" ;
      A1500BarNMtr = "" ;
      A1431BarLocDis = "" ;
      A1234BarNomCli = "" ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      A1003BarFecLan = GXutil.nullDate() ;
      A935BarReoPar = "" ;
      A904ObsReoEnt = "" ;
      A130BarCodPar = "" ;
      A365DisDes = "" ;
      A14329BarCnoEncO = "" ;
      A13908BarIdtx2 = "" ;
      A13907BarSerDsc2 = "" ;
      A13077BarLinPrd = "" ;
      A12881BarOEKOTEX = "" ;
      A12811BarLocCol = "" ;
      A12810BarLocMol = "" ;
      A12809BarLocTel = "" ;
      A12774BarProdID = "" ;
      A12329SubRevID = "" ;
      A11852Nxt_ArtCl2 = "" ;
      A11851Nxt_Sta2 = "" ;
      A11850Nxt_Mdlo2 = "" ;
      A5058BarEnvLaw = "" ;
      A3736BarPieMtl = DecimalUtil.ZERO ;
      A3735BarPieKgl = DecimalUtil.ZERO ;
      A3362BarMtsPrv = DecimalUtil.ZERO ;
      A3361BarKgsPrv = DecimalUtil.ZERO ;
      A3786BarEnvBar = "" ;
      A3780BarKilLam = DecimalUtil.ZERO ;
      A3596BarMaqAma = "" ;
      A11662BarOrdComp = "" ;
      A4841BarAudMCue = DecimalUtil.ZERO ;
      A4840BarAudMDig = DecimalUtil.ZERO ;
      A4837BarAudSupN = "" ;
      A4835BarAudOpeN = "" ;
      A4832BarAudFec = GXutil.nullDate() ;
      A9790BarItem6 = "" ;
      A9789BarItem5 = "" ;
      A9778BarItem4 = "" ;
      A9777BarItem3 = "" ;
      A9776barItem2 = "" ;
      A9775BarItem1 = "" ;
      A8097BarFecHis = GXutil.resetTime( GXutil.nullDate() );
      A7733BarMaqEst = "" ;
      A5406BarAntpT = "" ;
      A5367BarAntp = "" ;
      A5352BarObsAnc = "" ;
      A5351BarObsGrm = "" ;
      A5293BarCodBan = "" ;
      A5291BarTipCor = "" ;
      A5253BarAcc = "" ;
      A5057BarFacAbs = DecimalUtil.ZERO ;
      A5055BarBp14 = DecimalUtil.ZERO ;
      A5034BarEstTip = "" ;
      A5033BarCom = "" ;
      A5009BarLoteA = "" ;
      A4908BarMacPro = "" ;
      A4845BarAudObs = "" ;
      A4812BarEncCli = "" ;
      A4716BarDishCod = "" ;
      A4613BarHorReg = GXutil.resetTime( GXutil.nullDate() );
      A4611BarHorEnt = GXutil.resetTime( GXutil.nullDate() );
      A4610BarTam = "" ;
      A4609BarMdlCod = "" ;
      A4467BarAcaMar = "" ;
      A4465BarAcaBak = "" ;
      A4463BarLotMaq = "" ;
      A4462BarLotKgs = DecimalUtil.ZERO ;
      A4461BarLotMts = DecimalUtil.ZERO ;
      A4459BarCruEnr = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      W365DisDes = "" ;
      W143BarDisNum = "" ;
      W212BarSer = "" ;
      W135BarColNom = "" ;
      W159BarFecGen = GXutil.nullDate() ;
      W192BarNumUni = DecimalUtil.ZERO ;
      W228BarUniMed = "" ;
      W155BarFecCli = GXutil.nullDate() ;
      W157BarFecEnt = GXutil.nullDate() ;
      W180BarMaqCod = "" ;
      W182BarMat = "" ;
      W211BarRdt = DecimalUtil.ZERO ;
      W221BarTra1 = "" ;
      W222BarTra2 = "" ;
      W223BarTra3 = "" ;
      W229BarUrd1 = "" ;
      W230BarUrd2 = "" ;
      W231BarUrd3 = "" ;
      W206BarPle = "" ;
      W177BarLar = "" ;
      W214BarSua = "" ;
      W118BarAcaQui = "" ;
      W139BarCorOri = "" ;
      W145BarEncOri = "" ;
      W209BarPri = "" ;
      W137BarConPar = "" ;
      W141BarCosPro = DecimalUtil.ZERO ;
      W140BarCosAny = DecimalUtil.ZERO ;
      W169BarKgsFac = DecimalUtil.ZERO ;
      W158BarFecFpr = GXutil.nullDate() ;
      W120BarAgrEst = "" ;
      W904ObsReoEnt = "" ;
      Gx_emsg = "" ;
      P00695_A396EmprCod = new String[] {""} ;
      P00695_A129BarCod = new int[1] ;
      P00695_A132BarCodReo = new byte[1] ;
      P00695_A130BarCodPar = new String[] {""} ;
      P00695_A761ProFasLin = new short[1] ;
      P00695_n761ProFasLin = new boolean[] {false} ;
      P00695_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      W758ProCod = "" ;
      P00697_A396EmprCod = new String[] {""} ;
      P00697_A129BarCod = new int[1] ;
      P00697_A132BarCodReo = new byte[1] ;
      P00697_A130BarCodPar = new String[] {""} ;
      P00697_A758ProCod = new String[] {""} ;
      P00697_A12466SolAfLnUl = new short[1] ;
      P00697_n12466SolAfLnUl = new boolean[] {false} ;
      P00697_A12465SolLzLnUl = new short[1] ;
      P00697_n12465SolLzLnUl = new boolean[] {false} ;
      P00697_A12464SolPlLnUl = new short[1] ;
      P00697_n12464SolPlLnUl = new boolean[] {false} ;
      P00697_A12463SolSAlLnUl = new short[1] ;
      P00697_n12463SolSAlLnUl = new boolean[] {false} ;
      P00697_A12462SolSAcLnUl = new short[1] ;
      P00697_n12462SolSAcLnUl = new boolean[] {false} ;
      P00697_A12461SolFrLnUl = new short[1] ;
      P00697_n12461SolFrLnUl = new boolean[] {false} ;
      P00697_A12460SolAgLnUl = new short[1] ;
      P00697_n12460SolAgLnUl = new boolean[] {false} ;
      P00697_A12459SolLvLnUl = new short[1] ;
      P00697_n12459SolLvLnUl = new boolean[] {false} ;
      P00697_A12458TsSolObs = new String[] {""} ;
      P00697_n12458TsSolObs = new boolean[] {false} ;
      P00697_A12457TsSolRFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00697_n12457TsSolRFec = new boolean[] {false} ;
      P00697_A12456TsSolRLcq = new int[1] ;
      P00697_n12456TsSolRLcq = new boolean[] {false} ;
      P00697_A12455TsSolTFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00697_n12455TsSolTFec = new boolean[] {false} ;
      P00697_A12454TsSolTLcq = new int[1] ;
      P00697_n12454TsSolTLcq = new boolean[] {false} ;
      P00697_A12379BarFasBlq = new byte[1] ;
      P00697_n12379BarFasBlq = new boolean[] {false} ;
      P00697_A12360BarFasTOb = new String[] {""} ;
      P00697_n12360BarFasTOb = new boolean[] {false} ;
      P00697_A12359BarFasObs = new String[] {""} ;
      P00697_n12359BarFasObs = new boolean[] {false} ;
      P00697_A2327BarFasSer = new String[] {""} ;
      P00697_n2327BarFasSer = new boolean[] {false} ;
      P00697_A3836BarFasPri = new byte[1] ;
      P00697_A10032BarObsB = new String[] {""} ;
      P00697_n10032BarObsB = new boolean[] {false} ;
      P00697_A9842BarObsF = new String[] {""} ;
      P00697_n9842BarObsF = new boolean[] {false} ;
      P00697_A8938BarfasPri2 = new short[1] ;
      P00697_n8938BarfasPri2 = new boolean[] {false} ;
      P00697_A8594BarHdrO = new String[] {""} ;
      P00697_n8594BarHdrO = new boolean[] {false} ;
      P00697_A7933Dtb_UOrd = new short[1] ;
      P00697_n7933Dtb_UOrd = new boolean[] {false} ;
      P00697_A7914BarfasRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00697_n7914BarfasRb = new boolean[] {false} ;
      P00697_A7913BarfasUnpL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00697_n7913BarfasUnpL = new boolean[] {false} ;
      P00697_A7912Barfastpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00697_n7912Barfastpp = new boolean[] {false} ;
      P00697_A6555BarFasNPl = new byte[1] ;
      P00697_A6430BarTieAut = new short[1] ;
      P00697_A6392BarHdMn = new String[] {""} ;
      P00697_n6392BarHdMn = new boolean[] {false} ;
      P00697_A6391BarfasOP = new short[1] ;
      P00697_n6391BarfasOP = new boolean[] {false} ;
      P00697_A6390BarfasMn = new String[] {""} ;
      P00697_n6390BarfasMn = new boolean[] {false} ;
      P00697_A6173BarFasSec = new String[] {""} ;
      P00697_n6173BarFasSec = new boolean[] {false} ;
      P00697_A6012BarFasTip = new String[] {""} ;
      P00697_n6012BarFasTip = new boolean[] {false} ;
      P00697_A5999BarFasCR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00697_A5896BarMaqPlan = new String[] {""} ;
      P00697_n5896BarMaqPlan = new boolean[] {false} ;
      P00697_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00697_n5720BarFasMtT = new boolean[] {false} ;
      P00697_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00697_n5719BarFasKgT = new boolean[] {false} ;
      P00697_A5372FasQuiUl = new short[1] ;
      P00697_n5372FasQuiUl = new boolean[] {false} ;
      P00697_A5369BarFasGral = new String[] {""} ;
      P00697_n5369BarFasGral = new boolean[] {false} ;
      P00697_A5048BarFasUsu = new String[] {""} ;
      P00697_n5048BarFasUsu = new boolean[] {false} ;
      P00697_A5047BarFasFPl = new java.util.Date[] {GXutil.nullDate()} ;
      P00697_n5047BarFasFPl = new boolean[] {false} ;
      P00697_A5046BarFasPrp = new String[] {""} ;
      P00697_n5046BarFasPrp = new boolean[] {false} ;
      P00697_A5045BarFasAgr = new String[] {""} ;
      P00697_n5045BarFasAgr = new boolean[] {false} ;
      P00697_A457FasCod = new String[] {""} ;
      P00697_A4974BarFasPPr = new short[1] ;
      P00697_n4974BarFasPPr = new boolean[] {false} ;
      P00697_A4973BarFasKPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00697_n4973BarFasKPr = new boolean[] {false} ;
      P00697_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P00697_n4443BarFasDTF = new boolean[] {false} ;
      P00697_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P00697_n4442BarFasDTI = new boolean[] {false} ;
      P00697_A4938BarFasInc = new byte[1] ;
      P00697_n4938BarFasInc = new boolean[] {false} ;
      P00697_A4905BarFasAcab = new String[] {""} ;
      P00697_A4638BarUltNlot = new int[1] ;
      P00697_n4638BarUltNlot = new boolean[] {false} ;
      P00697_A4637BarFasCara = new String[] {""} ;
      P00697_A4636BarFasPzas = new int[1] ;
      P00697_n4636BarFasPzas = new boolean[] {false} ;
      P00697_A4288BarNPzas = new int[1] ;
      P00697_A4301BarFasCoP = new String[] {""} ;
      P00697_A4287BarFasFor = new String[] {""} ;
      P00697_A4022BarNumBot = new int[1] ;
      P00697_A4021BarFasBot = new String[] {""} ;
      P00697_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00697_n3838BarFasMtr = new boolean[] {false} ;
      P00697_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00697_n3837BarFasKgm = new boolean[] {false} ;
      P00697_A179BarLoc = new String[] {""} ;
      P00697_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P00697_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00697_A164BarHorFin = new short[1] ;
      P00697_A165BarHorIni = new short[1] ;
      P00697_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00697_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00697_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P00697_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      P00697_A150BarFacTin = new String[] {""} ;
      P00697_A603MaqCodBis = new String[] {""} ;
      P00697_A153BarFasEst = new byte[1] ;
      P00697_A152BarFasCon = new String[] {""} ;
      P00697_A194BarOrdLin = new short[1] ;
      A12458TsSolObs = "" ;
      A12457TsSolRFec = GXutil.resetTime( GXutil.nullDate() );
      A12455TsSolTFec = GXutil.resetTime( GXutil.nullDate() );
      A12360BarFasTOb = "" ;
      A12359BarFasObs = "" ;
      A2327BarFasSer = "" ;
      A10032BarObsB = "" ;
      A9842BarObsF = "" ;
      A8594BarHdrO = "" ;
      A7914BarfasRb = DecimalUtil.ZERO ;
      A7913BarfasUnpL = DecimalUtil.ZERO ;
      A7912Barfastpp = DecimalUtil.ZERO ;
      A6392BarHdMn = "" ;
      A6390BarfasMn = "" ;
      A6173BarFasSec = "" ;
      A6012BarFasTip = "" ;
      A5999BarFasCR = DecimalUtil.ZERO ;
      A5896BarMaqPlan = "" ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A5369BarFasGral = "" ;
      A5048BarFasUsu = "" ;
      A5047BarFasFPl = GXutil.nullDate() ;
      A5046BarFasPrp = "" ;
      A5045BarFasAgr = "" ;
      A457FasCod = "" ;
      A4973BarFasKPr = DecimalUtil.ZERO ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4905BarFasAcab = "" ;
      A4637BarFasCara = "" ;
      A4301BarFasCoP = "" ;
      A4287BarFasFor = "" ;
      A4021BarFasBot = "" ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A179BarLoc = "" ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A227BarUni = DecimalUtil.ZERO ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A160BarFecRea = GXutil.nullDate() ;
      A162BarFecTeo = GXutil.nullDate() ;
      A150BarFacTin = "" ;
      A603MaqCodBis = "" ;
      A152BarFasCon = "" ;
      W457FasCod = "" ;
      W162BarFecTeo = GXutil.nullDate() ;
      W160BarFecRea = GXutil.nullDate() ;
      W3298BarFecRIni = GXutil.nullDate() ;
      W216BarTieTeo = DecimalUtil.ZERO ;
      W227BarUni = DecimalUtil.ZERO ;
      W179BarLoc = "" ;
      W215BarTieRea = DecimalUtil.ZERO ;
      W603MaqCodBis = "" ;
      P006911_A396EmprCod = new String[] {""} ;
      P006911_A129BarCod = new int[1] ;
      P006911_A132BarCodReo = new byte[1] ;
      P006911_A130BarCodPar = new String[] {""} ;
      P006911_A13988BarPieVtx = new String[] {""} ;
      P006911_A13519BarPieMq = new String[] {""} ;
      P006911_n13519BarPieMq = new boolean[] {false} ;
      P006911_A13518BarPieTurn = new byte[1] ;
      P006911_n13518BarPieTurn = new boolean[] {false} ;
      P006911_A13109BarPieST = new String[] {""} ;
      P006911_n13109BarPieST = new boolean[] {false} ;
      P006911_A13108BarPieLote = new String[] {""} ;
      P006911_n13108BarPieLote = new boolean[] {false} ;
      P006911_A13107BarPieEmp = new short[1] ;
      P006911_n13107BarPieEmp = new boolean[] {false} ;
      P006911_A13004BarPieDest = new byte[1] ;
      P006911_n13004BarPieDest = new boolean[] {false} ;
      P006911_A12992BarPieOpe = new int[1] ;
      P006911_n12992BarPieOpe = new boolean[] {false} ;
      P006911_A12936BarPieSecu = new String[] {""} ;
      P006911_n12936BarPieSecu = new boolean[] {false} ;
      P006911_A12935BarPieTono = new String[] {""} ;
      P006911_n12935BarPieTono = new boolean[] {false} ;
      P006911_A12928BarPieEncC = new String[] {""} ;
      P006911_n12928BarPieEncC = new boolean[] {false} ;
      P006911_A12927BarPieCoCN = new int[1] ;
      P006911_n12927BarPieCoCN = new boolean[] {false} ;
      P006911_A12926BarPieCoCI = new String[] {""} ;
      P006911_n12926BarPieCoCI = new boolean[] {false} ;
      P006911_A12925BarPieCliN = new String[] {""} ;
      P006911_n12925BarPieCliN = new boolean[] {false} ;
      P006911_A12924BarPieCliI = new int[1] ;
      P006911_n12924BarPieCliI = new boolean[] {false} ;
      P006911_A12923BarPieArtD = new String[] {""} ;
      P006911_n12923BarPieArtD = new boolean[] {false} ;
      P006911_A12922BarPieArtI = new String[] {""} ;
      P006911_n12922BarPieArtI = new boolean[] {false} ;
      P006911_A12921BarPieColN = new int[1] ;
      P006911_n12921BarPieColN = new boolean[] {false} ;
      P006911_A12920BarPieColD = new String[] {""} ;
      P006911_n12920BarPieColD = new boolean[] {false} ;
      P006911_A12912BarPieUltD = new short[1] ;
      P006911_n12912BarPieUltD = new boolean[] {false} ;
      P006911_A12911BarPieFep = new java.util.Date[] {GXutil.nullDate()} ;
      P006911_n12911BarPieFep = new boolean[] {false} ;
      P006911_A12780BarPieUsu = new String[] {""} ;
      P006911_n12780BarPieUsu = new boolean[] {false} ;
      P006911_A12779BarPieFdv = new java.util.Date[] {GXutil.nullDate()} ;
      P006911_n12779BarPieFdv = new boolean[] {false} ;
      P006911_A12113BarPieCLd = new byte[1] ;
      P006911_n12113BarPieCLd = new boolean[] {false} ;
      P006911_A1642BarPieOrd = new int[1] ;
      P006911_n1642BarPieOrd = new boolean[] {false} ;
      P006911_A6473BarUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006911_n6473BarUniB = new boolean[] {false} ;
      P006911_A6472BarTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006911_n6472BarTara = new boolean[] {false} ;
      P006911_A1919BarPieObs = new String[] {""} ;
      P006911_n1919BarPieObs = new boolean[] {false} ;
      P006911_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006911_n9984BarPiePda = new boolean[] {false} ;
      P006911_A9846BarPieAncc = new short[1] ;
      P006911_n9846BarPieAncc = new boolean[] {false} ;
      P006911_A9800BarNPes = new byte[1] ;
      P006911_n9800BarNPes = new boolean[] {false} ;
      P006911_A9799BarPz2 = new int[1] ;
      P006911_n9799BarPz2 = new boolean[] {false} ;
      P006911_A9798BarPz1 = new int[1] ;
      P006911_n9798BarPz1 = new boolean[] {false} ;
      P006911_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006911_n9796BarPieK2 = new boolean[] {false} ;
      P006911_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006911_n9795BarPieK1 = new boolean[] {false} ;
      P006911_A8907PzaB80 = new String[] {""} ;
      P006911_n8907PzaB80 = new boolean[] {false} ;
      P006911_A8838CodBarPz = new String[] {""} ;
      P006911_n8838CodBarPz = new boolean[] {false} ;
      P006911_A8707BapieObs = new String[] {""} ;
      P006911_n8707BapieObs = new boolean[] {false} ;
      P006911_A6489BarPieIdPz = new String[] {""} ;
      P006911_n6489BarPieIdPz = new boolean[] {false} ;
      P006911_A6116BarPieImp = new String[] {""} ;
      P006911_n6116BarPieImp = new boolean[] {false} ;
      P006911_A3277BarPieAut = new short[1] ;
      P006911_n3277BarPieAut = new boolean[] {false} ;
      P006911_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006911_n3276BarMtsAut = new boolean[] {false} ;
      P006911_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006911_n3275BarKgsAut = new boolean[] {false} ;
      P006911_A2186BarPieLoc = new String[] {""} ;
      P006911_n2186BarPieLoc = new boolean[] {false} ;
      P006911_A1691BarPieAnc = new short[1] ;
      P006911_n1691BarPieAnc = new boolean[] {false} ;
      P006911_A1501BarPiePie = new int[1] ;
      P006911_A1271BarPieLzd = new int[1] ;
      P006911_A908PieOriCod = new String[] {""} ;
      P006911_A197BarPConTro = new short[1] ;
      P006911_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006911_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006911_A201BarPieEst = new byte[1] ;
      P006911_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006911_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006911_A44AlbRecCod = new int[1] ;
      P006911_A200BarPieCod = new String[] {""} ;
      A13988BarPieVtx = "" ;
      A13519BarPieMq = "" ;
      A13109BarPieST = "" ;
      A13108BarPieLote = "" ;
      A12936BarPieSecu = "" ;
      A12935BarPieTono = "" ;
      A12928BarPieEncC = "" ;
      A12926BarPieCoCI = "" ;
      A12925BarPieCliN = "" ;
      A12923BarPieArtD = "" ;
      A12922BarPieArtI = "" ;
      A12920BarPieColD = "" ;
      A12911BarPieFep = GXutil.nullDate() ;
      A12780BarPieUsu = "" ;
      A12779BarPieFdv = GXutil.nullDate() ;
      A6473BarUniB = DecimalUtil.ZERO ;
      A6472BarTara = DecimalUtil.ZERO ;
      A1919BarPieObs = "" ;
      A9984BarPiePda = DecimalUtil.ZERO ;
      A9796BarPieK2 = DecimalUtil.ZERO ;
      A9795BarPieK1 = DecimalUtil.ZERO ;
      A8907PzaB80 = "" ;
      A8838CodBarPz = "" ;
      A8707BapieObs = "" ;
      A6489BarPieIdPz = "" ;
      A6116BarPieImp = "" ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      A908PieOriCod = "" ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      W200BarPieCod = "" ;
      W203BarPieKil = DecimalUtil.ZERO ;
      W205BarPieMet = DecimalUtil.ZERO ;
      W170BarKilLan = DecimalUtil.ZERO ;
      W183BarMetLan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbajreo__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P00693_A144BarDisOri, P00693_A190BarNumAso, P00693_A149BarEstRes, P00693_A147BarEstCol, P00693_A158BarFecFpr, P00693_A163BarHorCum, P00693_A169BarKgsFac, P00693_A140BarCosAny, P00693_A141BarCosPro, P00693_A189BarNumAny,
            P00693_A137BarConPar, P00693_A138BarConReo, P00693_A209BarPri, P00693_A213BarSit, P00693_A146BarEst, P00693_A145BarEncOri, P00693_A139BarCorOri, P00693_A118BarAcaQui, P00693_A214BarSua, P00693_A177BarLar,
            P00693_A206BarPle, P00693_A126BarAncAca2, P00693_A125BarAncAca1, P00693_A128BarAncCru2, P00693_A127BarAncCru1, P00693_A234BarUrdP3, P00693_A231BarUrd3, P00693_A233BarUrdP2, P00693_A230BarUrd2, P00693_A232BarUrdP1,
            P00693_A229BarUrd1, P00693_A226BarTraP3, P00693_A223BarTra3, P00693_A225BarTraP2, P00693_A222BarTra2, P00693_A224BarTraP1, P00693_A221BarTra1, P00693_A211BarRdt, P00693_A182BarMat, P00693_A142BarDiaP,
            P00693_A235BarUrg, P00693_A161BarFecSal, P00693_A193BarOpeEsp, P00693_A181BarMaqPro, P00693_A157BarFecEnt, P00693_A196BarOrdReo, P00693_A191BarNumPie, P00693_A155BarFecCli, P00693_A148BarEstReo, P00693_A228BarUniMed,
            P00693_A192BarNumUni, P00693_A159BarFecGen, P00693_A218BarTipCol, P00693_A136BarColNum, P00693_A135BarColNom, P00693_A217BarTipArt, P00693_n217BarTipArt, P00693_A212BarSer, P00693_A143BarDisNum, P00693_A361DisCod,
            P00693_A236BarVolMaq, P00693_A180BarMaqCod, P00693_A120BarAgrEst, P00693_A132BarCodReo, P00693_A129BarCod, P00693_A4458BarCruKgs, P00693_n4458BarCruKgs, P00693_A4457BarCruMts, P00693_n4457BarCruMts, P00693_A4456BarPelAnh,
            P00693_A4400BarSitEst, P00693_A4018BarBot, P00693_A4017BarInci, P00693_A4016BarTin, P00693_A4015BarEnv, P00693_A2512BarComULin, P00693_n2512BarComULin, P00693_A1799BarDibInt, P00693_A1798BarDibCli, P00693_A3871BarFecCRe,
            P00693_A3870BarFecLRe, P00693_A3787BarEnvRec, P00693_n3787BarEnvRec, P00693_A3746BarNPed, P00693_A3745BarFoa, P00693_A3744BarPeg, P00693_A3595BarMacCod, P00693_A3313BarNumTon, P00693_A3312BarManCod2, P00693_A3311BarManCod1,
            P00693_A3310BarFac, P00693_A3138BarGraCru2, P00693_A3137BarGraAca2, P00693_A3136BarAncSal3, P00693_A3135BarAncSal2, P00693_A3134BarAncSal1, P00693_A3133BarNumCor, P00693_A2836BarPle2, P00693_A3030BarPlf, P00693_A3006BarCoef,
            P00693_n3006BarCoef, P00693_A2830BarIntPer, P00693_A2829BarProPer, P00693_A2828BarMtrLot, P00693_A2827BarKgsLot, P00693_A2826BarNumLot, P00693_A2803UltLinMaq, P00693_n2803UltLinMaq, P00693_A2759BarMaqGru, P00693_A2754BarSitExt,
            P00693_A2753BarNumTex2, P00693_n2753BarNumTex2, P00693_A2752BarNumTex1, P00693_A2746BarCodTex, P00693_n2746BarCodTex, P00693_A2487BarConEle, P00693_A2488BarConVap, P00693_A2486BarConAgu, P00693_A2496BarFecFin, P00693_A2497BarFecIni,
            P00693_A2500BarRDos2, P00693_A2499BarRDos1, P00693_A2498BarPrdPes, P00693_A2485BarColPes, P00693_A1911BarRdoA, P00693_A1910BarRdoN, P00693_A1909BarGraAca, P00693_A2458BarObsVL, P00693_n2458BarObsVL, P00693_A2453BarEntAca,
            P00693_n2453BarEntAca, P00693_A2452BarCal, P00693_n2452BarCal, P00693_A2459BarTemSec, P00693_A2455BarNMont, P00693_n2455BarNMont, P00693_A2454BarGirar, P00693_A2460BarTipAca, P00693_A2450BarKgEnR, P00693_n2450BarKgEnR,
            P00693_A2443BarBulEnR, P00693_n2443BarBulEnR, P00693_A2448BarFecEnR, P00693_n2448BarFecEnR, P00693_A2446BarEnULin, P00693_n2446BarEnULin, P00693_A2445BarEntEnE, P00693_A2449BarKgEnE, P00693_n2449BarKgEnE, P00693_A2442BarBulEnE,
            P00693_n2442BarBulEnE, P00693_A2447BarFecEnE, P00693_A2401BarNumPas, P00693_n2401BarNumPas, P00693_A2400BarManCod, P00693_A2311BarCliDes, P00693_A2265BarExt, P00693_n2265BarExt, P00693_A2010BarTipDis, P00693_A1923BarCodTN,
            P00693_A1878BarNumTen, P00693_A1832BarLisInd, P00693_A1652BarSerDsc, P00693_A1503BarPart, P00693_A1499BarNMez, P00693_A1500BarNMtr, P00693_A1431BarLocDis, P00693_A1254BarPesBal, P00693_A1235BarNumCli, P00693_A1234BarNomCli,
            P00693_A1226BarGraCru, P00693_A1224BarEncAnh, P00693_A1223BarEncCom, P00693_A921BarMatiz, P00693_A1003BarFecLan, P00693_n1003BarFecLan, P00693_A935BarReoPar, P00693_A936BarReoReo, P00693_A934BarReoCod, P00693_A905ObsReoULin,
            P00693_n905ObsReoULin, P00693_A904ObsReoEnt, P00693_n904ObsReoEnt, P00693_A899TipDefPor, P00693_n899TipDefPor, P00693_A833TipDefCod, P00693_n833TipDefCod, P00693_A864BarPes, P00693_A646NotUltLin, P00693_n646NotUltLin,
            P00693_A178BarLis, P00693_A396EmprCod, P00693_A130BarCodPar, P00693_A365DisDes, P00693_A252CliCod, P00693_n252CliCod, P00693_A14330BarPriorid, P00693_A14329BarCnoEncO, P00693_A13908BarIdtx2, P00693_n13908BarIdtx2,
            P00693_A13907BarSerDsc2, P00693_n13907BarSerDsc2, P00693_A13769BarRdto4, P00693_n13769BarRdto4, P00693_A13234BarRGB, P00693_A13092BarDGUltLi, P00693_n13092BarDGUltLi, P00693_A13077BarLinPrd, P00693_A13071BarCanalID, P00693_A13070BarLineaID,
            P00693_A12881BarOEKOTEX, P00693_n12881BarOEKOTEX, P00693_A12811BarLocCol, P00693_A12810BarLocMol, P00693_A12809BarLocTel, P00693_A12774BarProdID, P00693_A12767BarTpEstam, P00693_A12329SubRevID, P00693_n12329SubRevID, P00693_A11857Nxt_desaID,
            P00693_n11857Nxt_desaID, P00693_A11855Nxt_dpoID, P00693_n11855Nxt_dpoID, P00693_A11853Nxt_cpeID, P00693_n11853Nxt_cpeID, P00693_A11852Nxt_ArtCl2, P00693_A11851Nxt_Sta2, P00693_A11850Nxt_Mdlo2, P00693_A5058BarEnvLaw, P00693_A3736BarPieMtl,
            P00693_A3735BarPieKgl, P00693_A3363BarPiePrv, P00693_A3362BarMtsPrv, P00693_A3361BarKgsPrv, P00693_A3786BarEnvBar, P00693_A3785BarUltAny, P00693_A3784BarAnyTie, P00693_A3783BarRecLis, P00693_A3780BarKilLam, P00693_A3597BarVolAma,
            P00693_A3596BarMaqAma, P00693_A3594BarPriTin, P00693_A11662BarOrdComp, P00693_A4844BarAudULin, P00693_n4844BarAudULin, P00693_A4841BarAudMCue, P00693_n4841BarAudMCue, P00693_A4840BarAudMDig, P00693_n4840BarAudMDig, P00693_A4838BarAudNPz,
            P00693_n4838BarAudNPz, P00693_A4837BarAudSupN, P00693_n4837BarAudSupN, P00693_A4835BarAudOpeN, P00693_n4835BarAudOpeN, P00693_A4834BarAudOpe, P00693_n4834BarAudOpe, P00693_A4833BarAudTur, P00693_n4833BarAudTur, P00693_A4832BarAudFec,
            P00693_n4832BarAudFec, P00693_A9790BarItem6, P00693_A9789BarItem5, P00693_A9778BarItem4, P00693_A9777BarItem3, P00693_A9776barItem2, P00693_A9775BarItem1, P00693_A8568EntSecUlt, P00693_n8568EntSecUlt, P00693_A8098BarOpeHis,
            P00693_A8097BarFecHis, P00693_A7733BarMaqEst, P00693_A6434BarAsi, P00693_A5406BarAntpT, P00693_A5367BarAntp, P00693_A5352BarObsAnc, P00693_A5351BarObsGrm, P00693_A5293BarCodBan, P00693_A5291BarTipCor, P00693_A5253BarAcc,
            P00693_A5057BarFacAbs, P00693_n5057BarFacAbs, P00693_A5056BarBp15, P00693_n5056BarBp15, P00693_A5055BarBp14, P00693_n5055BarBp14, P00693_A5054BarBp13, P00693_n5054BarBp13, P00693_A5053BarBp12, P00693_n5053BarBp12,
            P00693_A5034BarEstTip, P00693_A5033BarCom, P00693_A5027BarGraCob, P00693_A5026BarTipEst, P00693_A5009BarLoteA, P00693_A4975BarNumReo, P00693_A4937BarCtrPdas, P00693_n4937BarCtrPdas, P00693_A4908BarMacPro, P00693_A4845BarAudObs,
            P00693_n4845BarAudObs, P00693_A4836BarAudSup, P00693_A4812BarEncCli, P00693_A4716BarDishCod, P00693_A4613BarHorReg, P00693_n4613BarHorReg, P00693_A4612BarPzas, P00693_n4612BarPzas, P00693_A4611BarHorEnt, P00693_n4611BarHorEnt,
            P00693_A4610BarTam, P00693_A4609BarMdlCod, P00693_A4467BarAcaMar, P00693_A4466BarAcaAnh, P00693_A4465BarAcaBak, P00693_n4465BarAcaBak, P00693_A4464BarAcaFor, P00693_n4464BarAcaFor, P00693_A4463BarLotMaq, P00693_n4463BarLotMaq,
            P00693_A4462BarLotKgs, P00693_A4461BarLotMts, P00693_A4460BarLotPza, P00693_n4460BarLotPza, P00693_A4459BarCruEnr
            }
            , new Object[] {
            }
            , new Object[] {
            P00695_A396EmprCod, P00695_A129BarCod, P00695_A132BarCodReo, P00695_A130BarCodPar, P00695_A761ProFasLin, P00695_n761ProFasLin, P00695_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00697_A396EmprCod, P00697_A129BarCod, P00697_A132BarCodReo, P00697_A130BarCodPar, P00697_A758ProCod, P00697_A12466SolAfLnUl, P00697_n12466SolAfLnUl, P00697_A12465SolLzLnUl, P00697_n12465SolLzLnUl, P00697_A12464SolPlLnUl,
            P00697_n12464SolPlLnUl, P00697_A12463SolSAlLnUl, P00697_n12463SolSAlLnUl, P00697_A12462SolSAcLnUl, P00697_n12462SolSAcLnUl, P00697_A12461SolFrLnUl, P00697_n12461SolFrLnUl, P00697_A12460SolAgLnUl, P00697_n12460SolAgLnUl, P00697_A12459SolLvLnUl,
            P00697_n12459SolLvLnUl, P00697_A12458TsSolObs, P00697_n12458TsSolObs, P00697_A12457TsSolRFec, P00697_n12457TsSolRFec, P00697_A12456TsSolRLcq, P00697_n12456TsSolRLcq, P00697_A12455TsSolTFec, P00697_n12455TsSolTFec, P00697_A12454TsSolTLcq,
            P00697_n12454TsSolTLcq, P00697_A12379BarFasBlq, P00697_n12379BarFasBlq, P00697_A12360BarFasTOb, P00697_n12360BarFasTOb, P00697_A12359BarFasObs, P00697_n12359BarFasObs, P00697_A2327BarFasSer, P00697_n2327BarFasSer, P00697_A3836BarFasPri,
            P00697_A10032BarObsB, P00697_n10032BarObsB, P00697_A9842BarObsF, P00697_n9842BarObsF, P00697_A8938BarfasPri2, P00697_n8938BarfasPri2, P00697_A8594BarHdrO, P00697_n8594BarHdrO, P00697_A7933Dtb_UOrd, P00697_n7933Dtb_UOrd,
            P00697_A7914BarfasRb, P00697_n7914BarfasRb, P00697_A7913BarfasUnpL, P00697_n7913BarfasUnpL, P00697_A7912Barfastpp, P00697_n7912Barfastpp, P00697_A6555BarFasNPl, P00697_A6430BarTieAut, P00697_A6392BarHdMn, P00697_n6392BarHdMn,
            P00697_A6391BarfasOP, P00697_n6391BarfasOP, P00697_A6390BarfasMn, P00697_n6390BarfasMn, P00697_A6173BarFasSec, P00697_n6173BarFasSec, P00697_A6012BarFasTip, P00697_n6012BarFasTip, P00697_A5999BarFasCR, P00697_A5896BarMaqPlan,
            P00697_n5896BarMaqPlan, P00697_A5720BarFasMtT, P00697_n5720BarFasMtT, P00697_A5719BarFasKgT, P00697_n5719BarFasKgT, P00697_A5372FasQuiUl, P00697_n5372FasQuiUl, P00697_A5369BarFasGral, P00697_n5369BarFasGral, P00697_A5048BarFasUsu,
            P00697_n5048BarFasUsu, P00697_A5047BarFasFPl, P00697_n5047BarFasFPl, P00697_A5046BarFasPrp, P00697_n5046BarFasPrp, P00697_A5045BarFasAgr, P00697_n5045BarFasAgr, P00697_A457FasCod, P00697_A4974BarFasPPr, P00697_n4974BarFasPPr,
            P00697_A4973BarFasKPr, P00697_n4973BarFasKPr, P00697_A4443BarFasDTF, P00697_n4443BarFasDTF, P00697_A4442BarFasDTI, P00697_n4442BarFasDTI, P00697_A4938BarFasInc, P00697_n4938BarFasInc, P00697_A4905BarFasAcab, P00697_A4638BarUltNlot,
            P00697_n4638BarUltNlot, P00697_A4637BarFasCara, P00697_A4636BarFasPzas, P00697_n4636BarFasPzas, P00697_A4288BarNPzas, P00697_A4301BarFasCoP, P00697_A4287BarFasFor, P00697_A4022BarNumBot, P00697_A4021BarFasBot, P00697_A3838BarFasMtr,
            P00697_n3838BarFasMtr, P00697_A3837BarFasKgm, P00697_n3837BarFasKgm, P00697_A179BarLoc, P00697_A3298BarFecRIni, P00697_A215BarTieRea, P00697_A164BarHorFin, P00697_A165BarHorIni, P00697_A227BarUni, P00697_A216BarTieTeo,
            P00697_A160BarFecRea, P00697_A162BarFecTeo, P00697_A150BarFacTin, P00697_A603MaqCodBis, P00697_A153BarFasEst, P00697_A152BarFasCon, P00697_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P006911_A396EmprCod, P006911_A129BarCod, P006911_A132BarCodReo, P006911_A130BarCodPar, P006911_A13988BarPieVtx, P006911_A13519BarPieMq, P006911_n13519BarPieMq, P006911_A13518BarPieTurn, P006911_n13518BarPieTurn, P006911_A13109BarPieST,
            P006911_n13109BarPieST, P006911_A13108BarPieLote, P006911_n13108BarPieLote, P006911_A13107BarPieEmp, P006911_n13107BarPieEmp, P006911_A13004BarPieDest, P006911_n13004BarPieDest, P006911_A12992BarPieOpe, P006911_n12992BarPieOpe, P006911_A12936BarPieSecu,
            P006911_n12936BarPieSecu, P006911_A12935BarPieTono, P006911_n12935BarPieTono, P006911_A12928BarPieEncC, P006911_n12928BarPieEncC, P006911_A12927BarPieCoCN, P006911_n12927BarPieCoCN, P006911_A12926BarPieCoCI, P006911_n12926BarPieCoCI, P006911_A12925BarPieCliN,
            P006911_n12925BarPieCliN, P006911_A12924BarPieCliI, P006911_n12924BarPieCliI, P006911_A12923BarPieArtD, P006911_n12923BarPieArtD, P006911_A12922BarPieArtI, P006911_n12922BarPieArtI, P006911_A12921BarPieColN, P006911_n12921BarPieColN, P006911_A12920BarPieColD,
            P006911_n12920BarPieColD, P006911_A12912BarPieUltD, P006911_n12912BarPieUltD, P006911_A12911BarPieFep, P006911_n12911BarPieFep, P006911_A12780BarPieUsu, P006911_n12780BarPieUsu, P006911_A12779BarPieFdv, P006911_n12779BarPieFdv, P006911_A12113BarPieCLd,
            P006911_n12113BarPieCLd, P006911_A1642BarPieOrd, P006911_n1642BarPieOrd, P006911_A6473BarUniB, P006911_n6473BarUniB, P006911_A6472BarTara, P006911_n6472BarTara, P006911_A1919BarPieObs, P006911_n1919BarPieObs, P006911_A9984BarPiePda,
            P006911_n9984BarPiePda, P006911_A9846BarPieAncc, P006911_n9846BarPieAncc, P006911_A9800BarNPes, P006911_n9800BarNPes, P006911_A9799BarPz2, P006911_n9799BarPz2, P006911_A9798BarPz1, P006911_n9798BarPz1, P006911_A9796BarPieK2,
            P006911_n9796BarPieK2, P006911_A9795BarPieK1, P006911_n9795BarPieK1, P006911_A8907PzaB80, P006911_n8907PzaB80, P006911_A8838CodBarPz, P006911_n8838CodBarPz, P006911_A8707BapieObs, P006911_n8707BapieObs, P006911_A6489BarPieIdPz,
            P006911_n6489BarPieIdPz, P006911_A6116BarPieImp, P006911_n6116BarPieImp, P006911_A3277BarPieAut, P006911_n3277BarPieAut, P006911_A3276BarMtsAut, P006911_n3276BarMtsAut, P006911_A3275BarKgsAut, P006911_n3275BarKgsAut, P006911_A2186BarPieLoc,
            P006911_n2186BarPieLoc, P006911_A1691BarPieAnc, P006911_n1691BarPieAnc, P006911_A1501BarPiePie, P006911_A1271BarPieLzd, P006911_A908PieOriCod, P006911_A197BarPConTro, P006911_A183BarMetLan, P006911_A170BarKilLan, P006911_A201BarPieEst,
            P006911_A205BarPieMet, P006911_A203BarPieKil, P006911_A44AlbRecCod, P006911_A200BarPieCod
            }
            , new Object[] {
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

   private byte AV16BarCodReo ;
   private byte GXv_int3[] ;
   private byte A190BarNumAso ;
   private byte A149BarEstRes ;
   private byte A147BarEstCol ;
   private byte A138BarConReo ;
   private byte A213BarSit ;
   private byte A146BarEst ;
   private byte A235BarUrg ;
   private byte A193BarOpeEsp ;
   private byte A196BarOrdReo ;
   private byte A148BarEstReo ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte A4400BarSitEst ;
   private byte A4017BarInci ;
   private byte A4015BarEnv ;
   private byte A2512BarComULin ;
   private byte A2830BarIntPer ;
   private byte A2754BarSitExt ;
   private byte A2752BarNumTex1 ;
   private byte A2401BarNumPas ;
   private byte A2265BarExt ;
   private byte A1832BarLisInd ;
   private byte A1254BarPesBal ;
   private byte A936BarReoReo ;
   private byte A905ObsReoULin ;
   private byte A646NotUltLin ;
   private byte A178BarLis ;
   private byte A14330BarPriorid ;
   private byte A13092BarDGUltLi ;
   private byte A12767BarTpEstam ;
   private byte A3783BarRecLis ;
   private byte A3594BarPriTin ;
   private byte A4833BarAudTur ;
   private byte A6434BarAsi ;
   private byte A5027BarGraCob ;
   private byte A5026BarTipEst ;
   private byte A4937BarCtrPdas ;
   private byte W132BarCodReo ;
   private byte W218BarTipCol ;
   private byte W193BarOpeEsp ;
   private byte W235BarUrg ;
   private byte W146BarEst ;
   private byte W213BarSit ;
   private byte W147BarEstCol ;
   private byte W138BarConReo ;
   private byte W148BarEstReo ;
   private byte W196BarOrdReo ;
   private byte W905ObsReoULin ;
   private byte A12379BarFasBlq ;
   private byte A3836BarFasPri ;
   private byte A6555BarFasNPl ;
   private byte A4938BarFasInc ;
   private byte A153BarFasEst ;
   private byte W153BarFasEst ;
   private byte A13518BarPieTurn ;
   private byte A13004BarPieDest ;
   private byte A12113BarPieCLd ;
   private byte A9800BarNPes ;
   private byte A201BarPieEst ;
   private byte W201BarPieEst ;
   private short AV18TipDefCod ;
   private short A189BarNumAny ;
   private short A126BarAncAca2 ;
   private short A125BarAncAca1 ;
   private short A128BarAncCru2 ;
   private short A127BarAncCru1 ;
   private short A234BarUrdP3 ;
   private short A233BarUrdP2 ;
   private short A232BarUrdP1 ;
   private short A226BarTraP3 ;
   private short A225BarTraP2 ;
   private short A224BarTraP1 ;
   private short A191BarNumPie ;
   private short A217BarTipArt ;
   private short A4456BarPelAnh ;
   private short A3312BarManCod2 ;
   private short A3311BarManCod1 ;
   private short A3138BarGraCru2 ;
   private short A3137BarGraAca2 ;
   private short A3136BarAncSal3 ;
   private short A3135BarAncSal2 ;
   private short A3134BarAncSal1 ;
   private short A3133BarNumCor ;
   private short A2803UltLinMaq ;
   private short A2753BarNumTex2 ;
   private short A1909BarGraAca ;
   private short A2458BarObsVL ;
   private short A2459BarTemSec ;
   private short A2455BarNMont ;
   private short A2443BarBulEnR ;
   private short A2446BarEnULin ;
   private short A2442BarBulEnE ;
   private short A2400BarManCod ;
   private short A1503BarPart ;
   private short A1226BarGraCru ;
   private short A921BarMatiz ;
   private short A899TipDefPor ;
   private short A833TipDefCod ;
   private short A864BarPes ;
   private short A13769BarRdto4 ;
   private short A13070BarLineaID ;
   private short A11857Nxt_desaID ;
   private short A11855Nxt_dpoID ;
   private short A11853Nxt_cpeID ;
   private short A3363BarPiePrv ;
   private short A3785BarUltAny ;
   private short A3784BarAnyTie ;
   private short A4844BarAudULin ;
   private short A4838BarAudNPz ;
   private short A5056BarBp15 ;
   private short A5054BarBp13 ;
   private short A5053BarBp12 ;
   private short A4975BarNumReo ;
   private short A4466BarAcaAnh ;
   private short A4460BarLotPza ;
   private short W217BarTipArt ;
   private short W191BarNumPie ;
   private short W224BarTraP1 ;
   private short W225BarTraP2 ;
   private short W226BarTraP3 ;
   private short W232BarUrdP1 ;
   private short W233BarUrdP2 ;
   private short W234BarUrdP3 ;
   private short W127BarAncCru1 ;
   private short W128BarAncCru2 ;
   private short W125BarAncAca1 ;
   private short W126BarAncAca2 ;
   private short W189BarNumAny ;
   private short W864BarPes ;
   private short W833TipDefCod ;
   private short W899TipDefPor ;
   private short Gx_err ;
   private short A761ProFasLin ;
   private short W761ProFasLin ;
   private short A12466SolAfLnUl ;
   private short A12465SolLzLnUl ;
   private short A12464SolPlLnUl ;
   private short A12463SolSAlLnUl ;
   private short A12462SolSAcLnUl ;
   private short A12461SolFrLnUl ;
   private short A12460SolAgLnUl ;
   private short A12459SolLvLnUl ;
   private short A8938BarfasPri2 ;
   private short A7933Dtb_UOrd ;
   private short A6430BarTieAut ;
   private short A6391BarfasOP ;
   private short A5372FasQuiUl ;
   private short A4974BarFasPPr ;
   private short A164BarHorFin ;
   private short A165BarHorIni ;
   private short A194BarOrdLin ;
   private short W194BarOrdLin ;
   private short W165BarHorIni ;
   private short W164BarHorFin ;
   private short A13107BarPieEmp ;
   private short A12912BarPieUltD ;
   private short A9846BarPieAncc ;
   private short A3277BarPieAut ;
   private short A1691BarPieAnc ;
   private short A197BarPConTro ;
   private short W197BarPConTro ;
   private int AV15BarCod ;
   private int GXv_int2[] ;
   private int A144BarDisOri ;
   private int A163BarHorCum ;
   private int A136BarColNum ;
   private int A361DisCod ;
   private int A236BarVolMaq ;
   private int A129BarCod ;
   private int A1799BarDibInt ;
   private int A3595BarMacCod ;
   private int A2826BarNumLot ;
   private int A2487BarConEle ;
   private int A2488BarConVap ;
   private int A2486BarConAgu ;
   private int A2311BarCliDes ;
   private int A1923BarCodTN ;
   private int A1235BarNumCli ;
   private int A934BarReoCod ;
   private int A252CliCod ;
   private int A13071BarCanalID ;
   private int A3597BarVolAma ;
   private int A4834BarAudOpe ;
   private int A8568EntSecUlt ;
   private int A8098BarOpeHis ;
   private int A4836BarAudSup ;
   private int A4612BarPzas ;
   private int A4464BarAcaFor ;
   private int W129BarCod ;
   private int GX_INS12 ;
   private int W361DisCod ;
   private int W252CliCod ;
   private int W136BarColNum ;
   private int GX_INS14 ;
   private int A12456TsSolRLcq ;
   private int A12454TsSolTLcq ;
   private int A4638BarUltNlot ;
   private int A4636BarFasPzas ;
   private int A4288BarNPzas ;
   private int A4022BarNumBot ;
   private int GX_INS15 ;
   private int A12992BarPieOpe ;
   private int A12927BarPieCoCN ;
   private int A12924BarPieCliI ;
   private int A12921BarPieColN ;
   private int A1642BarPieOrd ;
   private int A9799BarPz2 ;
   private int A9798BarPz1 ;
   private int A1501BarPiePie ;
   private int A1271BarPieLzd ;
   private int A44AlbRecCod ;
   private int GX_INS18 ;
   private int W44AlbRecCod ;
   private long A13234BarRGB ;
   private java.math.BigDecimal A169BarKgsFac ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A142BarDiaP ;
   private java.math.BigDecimal A192BarNumUni ;
   private java.math.BigDecimal A4458BarCruKgs ;
   private java.math.BigDecimal A4457BarCruMts ;
   private java.math.BigDecimal A3006BarCoef ;
   private java.math.BigDecimal A2828BarMtrLot ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal A1911BarRdoA ;
   private java.math.BigDecimal A1910BarRdoN ;
   private java.math.BigDecimal A2450BarKgEnR ;
   private java.math.BigDecimal A2449BarKgEnE ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A3736BarPieMtl ;
   private java.math.BigDecimal A3735BarPieKgl ;
   private java.math.BigDecimal A3362BarMtsPrv ;
   private java.math.BigDecimal A3361BarKgsPrv ;
   private java.math.BigDecimal A3780BarKilLam ;
   private java.math.BigDecimal A4841BarAudMCue ;
   private java.math.BigDecimal A4840BarAudMDig ;
   private java.math.BigDecimal A5057BarFacAbs ;
   private java.math.BigDecimal A5055BarBp14 ;
   private java.math.BigDecimal A4462BarLotKgs ;
   private java.math.BigDecimal A4461BarLotMts ;
   private java.math.BigDecimal W192BarNumUni ;
   private java.math.BigDecimal W211BarRdt ;
   private java.math.BigDecimal W141BarCosPro ;
   private java.math.BigDecimal W140BarCosAny ;
   private java.math.BigDecimal W169BarKgsFac ;
   private java.math.BigDecimal A7914BarfasRb ;
   private java.math.BigDecimal A7913BarfasUnpL ;
   private java.math.BigDecimal A7912Barfastpp ;
   private java.math.BigDecimal A5999BarFasCR ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A4973BarFasKPr ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal W216BarTieTeo ;
   private java.math.BigDecimal W227BarUni ;
   private java.math.BigDecimal W215BarTieRea ;
   private java.math.BigDecimal A6473BarUniB ;
   private java.math.BigDecimal A6472BarTara ;
   private java.math.BigDecimal A9984BarPiePda ;
   private java.math.BigDecimal A9796BarPieK2 ;
   private java.math.BigDecimal A9795BarPieK1 ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal W203BarPieKil ;
   private java.math.BigDecimal W205BarPieMet ;
   private java.math.BigDecimal W170BarKilLan ;
   private java.math.BigDecimal W183BarMetLan ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String GXv_char1[] ;
   private String AV19NewPar ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A137BarConPar ;
   private String A209BarPri ;
   private String A145BarEncOri ;
   private String A139BarCorOri ;
   private String A118BarAcaQui ;
   private String A214BarSua ;
   private String A177BarLar ;
   private String A206BarPle ;
   private String A231BarUrd3 ;
   private String A230BarUrd2 ;
   private String A229BarUrd1 ;
   private String A223BarTra3 ;
   private String A222BarTra2 ;
   private String A221BarTra1 ;
   private String A182BarMat ;
   private String A181BarMaqPro ;
   private String A228BarUniMed ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A143BarDisNum ;
   private String A180BarMaqCod ;
   private String A120BarAgrEst ;
   private String A4018BarBot ;
   private String A4016BarTin ;
   private String A1798BarDibCli ;
   private String A3787BarEnvRec ;
   private String A3746BarNPed ;
   private String A3745BarFoa ;
   private String A3744BarPeg ;
   private String A3313BarNumTon ;
   private String A3310BarFac ;
   private String A2836BarPle2 ;
   private String A3030BarPlf ;
   private String A2829BarProPer ;
   private String A2759BarMaqGru ;
   private String A2746BarCodTex ;
   private String A2500BarRDos2 ;
   private String A2499BarRDos1 ;
   private String A2498BarPrdPes ;
   private String A2485BarColPes ;
   private String A2453BarEntAca ;
   private String A2452BarCal ;
   private String A2454BarGirar ;
   private String A2460BarTipAca ;
   private String A2445BarEntEnE ;
   private String A2010BarTipDis ;
   private String A1878BarNumTen ;
   private String A1652BarSerDsc ;
   private String A1499BarNMez ;
   private String A1500BarNMtr ;
   private String A1431BarLocDis ;
   private String A1234BarNomCli ;
   private String A935BarReoPar ;
   private String A904ObsReoEnt ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String A13908BarIdtx2 ;
   private String A13077BarLinPrd ;
   private String A12881BarOEKOTEX ;
   private String A12811BarLocCol ;
   private String A12810BarLocMol ;
   private String A12809BarLocTel ;
   private String A12774BarProdID ;
   private String A12329SubRevID ;
   private String A11852Nxt_ArtCl2 ;
   private String A11851Nxt_Sta2 ;
   private String A11850Nxt_Mdlo2 ;
   private String A5058BarEnvLaw ;
   private String A3786BarEnvBar ;
   private String A3596BarMaqAma ;
   private String A4837BarAudSupN ;
   private String A4835BarAudOpeN ;
   private String A9790BarItem6 ;
   private String A9789BarItem5 ;
   private String A9778BarItem4 ;
   private String A9777BarItem3 ;
   private String A9776barItem2 ;
   private String A9775BarItem1 ;
   private String A7733BarMaqEst ;
   private String A5406BarAntpT ;
   private String A5367BarAntp ;
   private String A5352BarObsAnc ;
   private String A5351BarObsGrm ;
   private String A5293BarCodBan ;
   private String A5291BarTipCor ;
   private String A5253BarAcc ;
   private String A5034BarEstTip ;
   private String A5033BarCom ;
   private String A5009BarLoteA ;
   private String A4908BarMacPro ;
   private String A4812BarEncCli ;
   private String A4716BarDishCod ;
   private String A4610BarTam ;
   private String A4609BarMdlCod ;
   private String A4467BarAcaMar ;
   private String A4465BarAcaBak ;
   private String A4463BarLotMaq ;
   private String A4459BarCruEnr ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W365DisDes ;
   private String W143BarDisNum ;
   private String W212BarSer ;
   private String W135BarColNom ;
   private String W228BarUniMed ;
   private String W180BarMaqCod ;
   private String W182BarMat ;
   private String W221BarTra1 ;
   private String W222BarTra2 ;
   private String W223BarTra3 ;
   private String W229BarUrd1 ;
   private String W230BarUrd2 ;
   private String W231BarUrd3 ;
   private String W206BarPle ;
   private String W177BarLar ;
   private String W214BarSua ;
   private String W118BarAcaQui ;
   private String W139BarCorOri ;
   private String W145BarEncOri ;
   private String W209BarPri ;
   private String W137BarConPar ;
   private String W120BarAgrEst ;
   private String W904ObsReoEnt ;
   private String Gx_emsg ;
   private String A758ProCod ;
   private String W758ProCod ;
   private String A12360BarFasTOb ;
   private String A2327BarFasSer ;
   private String A8594BarHdrO ;
   private String A6392BarHdMn ;
   private String A6390BarfasMn ;
   private String A6173BarFasSec ;
   private String A6012BarFasTip ;
   private String A5896BarMaqPlan ;
   private String A5369BarFasGral ;
   private String A5048BarFasUsu ;
   private String A5046BarFasPrp ;
   private String A5045BarFasAgr ;
   private String A457FasCod ;
   private String A4905BarFasAcab ;
   private String A4637BarFasCara ;
   private String A4301BarFasCoP ;
   private String A4287BarFasFor ;
   private String A4021BarFasBot ;
   private String A179BarLoc ;
   private String A150BarFacTin ;
   private String A603MaqCodBis ;
   private String A152BarFasCon ;
   private String W457FasCod ;
   private String W179BarLoc ;
   private String W603MaqCodBis ;
   private String A13988BarPieVtx ;
   private String A13519BarPieMq ;
   private String A13109BarPieST ;
   private String A13108BarPieLote ;
   private String A12936BarPieSecu ;
   private String A12935BarPieTono ;
   private String A12928BarPieEncC ;
   private String A12926BarPieCoCI ;
   private String A12925BarPieCliN ;
   private String A12923BarPieArtD ;
   private String A12922BarPieArtI ;
   private String A12920BarPieColD ;
   private String A12780BarPieUsu ;
   private String A1919BarPieObs ;
   private String A8907PzaB80 ;
   private String A8838CodBarPz ;
   private String A8707BapieObs ;
   private String A6489BarPieIdPz ;
   private String A6116BarPieImp ;
   private String A2186BarPieLoc ;
   private String A908PieOriCod ;
   private String A200BarPieCod ;
   private String W200BarPieCod ;
   private java.util.Date A8097BarFecHis ;
   private java.util.Date A4613BarHorReg ;
   private java.util.Date A4611BarHorEnt ;
   private java.util.Date A12457TsSolRFec ;
   private java.util.Date A12455TsSolTFec ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A157BarFecEnt ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A3871BarFecCRe ;
   private java.util.Date A3870BarFecLRe ;
   private java.util.Date A2496BarFecFin ;
   private java.util.Date A2497BarFecIni ;
   private java.util.Date A2448BarFecEnR ;
   private java.util.Date A2447BarFecEnE ;
   private java.util.Date A1003BarFecLan ;
   private java.util.Date A4832BarAudFec ;
   private java.util.Date W159BarFecGen ;
   private java.util.Date W155BarFecCli ;
   private java.util.Date W157BarFecEnt ;
   private java.util.Date W158BarFecFpr ;
   private java.util.Date A5047BarFasFPl ;
   private java.util.Date A3298BarFecRIni ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date W162BarFecTeo ;
   private java.util.Date W160BarFecRea ;
   private java.util.Date W3298BarFecRIni ;
   private java.util.Date A12911BarPieFep ;
   private java.util.Date A12779BarPieFdv ;
   private boolean n217BarTipArt ;
   private boolean n4458BarCruKgs ;
   private boolean n4457BarCruMts ;
   private boolean n2512BarComULin ;
   private boolean n3787BarEnvRec ;
   private boolean n3006BarCoef ;
   private boolean n2803UltLinMaq ;
   private boolean n2753BarNumTex2 ;
   private boolean n2746BarCodTex ;
   private boolean n2458BarObsVL ;
   private boolean n2453BarEntAca ;
   private boolean n2452BarCal ;
   private boolean n2455BarNMont ;
   private boolean n2450BarKgEnR ;
   private boolean n2443BarBulEnR ;
   private boolean n2448BarFecEnR ;
   private boolean n2446BarEnULin ;
   private boolean n2449BarKgEnE ;
   private boolean n2442BarBulEnE ;
   private boolean n2401BarNumPas ;
   private boolean n2265BarExt ;
   private boolean n1003BarFecLan ;
   private boolean n905ObsReoULin ;
   private boolean n904ObsReoEnt ;
   private boolean n899TipDefPor ;
   private boolean n833TipDefCod ;
   private boolean n646NotUltLin ;
   private boolean n252CliCod ;
   private boolean n13908BarIdtx2 ;
   private boolean n13907BarSerDsc2 ;
   private boolean n13769BarRdto4 ;
   private boolean n13092BarDGUltLi ;
   private boolean n12881BarOEKOTEX ;
   private boolean n12329SubRevID ;
   private boolean n11857Nxt_desaID ;
   private boolean n11855Nxt_dpoID ;
   private boolean n11853Nxt_cpeID ;
   private boolean n4844BarAudULin ;
   private boolean n4841BarAudMCue ;
   private boolean n4840BarAudMDig ;
   private boolean n4838BarAudNPz ;
   private boolean n4837BarAudSupN ;
   private boolean n4835BarAudOpeN ;
   private boolean n4834BarAudOpe ;
   private boolean n4833BarAudTur ;
   private boolean n4832BarAudFec ;
   private boolean n8568EntSecUlt ;
   private boolean n5057BarFacAbs ;
   private boolean n5056BarBp15 ;
   private boolean n5055BarBp14 ;
   private boolean n5054BarBp13 ;
   private boolean n5053BarBp12 ;
   private boolean n4937BarCtrPdas ;
   private boolean n4845BarAudObs ;
   private boolean n4613BarHorReg ;
   private boolean n4612BarPzas ;
   private boolean n4611BarHorEnt ;
   private boolean n4465BarAcaBak ;
   private boolean n4464BarAcaFor ;
   private boolean n4463BarLotMaq ;
   private boolean n4460BarLotPza ;
   private boolean n761ProFasLin ;
   private boolean n12466SolAfLnUl ;
   private boolean n12465SolLzLnUl ;
   private boolean n12464SolPlLnUl ;
   private boolean n12463SolSAlLnUl ;
   private boolean n12462SolSAcLnUl ;
   private boolean n12461SolFrLnUl ;
   private boolean n12460SolAgLnUl ;
   private boolean n12459SolLvLnUl ;
   private boolean n12458TsSolObs ;
   private boolean n12457TsSolRFec ;
   private boolean n12456TsSolRLcq ;
   private boolean n12455TsSolTFec ;
   private boolean n12454TsSolTLcq ;
   private boolean n12379BarFasBlq ;
   private boolean n12360BarFasTOb ;
   private boolean n12359BarFasObs ;
   private boolean n2327BarFasSer ;
   private boolean n10032BarObsB ;
   private boolean n9842BarObsF ;
   private boolean n8938BarfasPri2 ;
   private boolean n8594BarHdrO ;
   private boolean n7933Dtb_UOrd ;
   private boolean n7914BarfasRb ;
   private boolean n7913BarfasUnpL ;
   private boolean n7912Barfastpp ;
   private boolean n6392BarHdMn ;
   private boolean n6391BarfasOP ;
   private boolean n6390BarfasMn ;
   private boolean n6173BarFasSec ;
   private boolean n6012BarFasTip ;
   private boolean n5896BarMaqPlan ;
   private boolean n5720BarFasMtT ;
   private boolean n5719BarFasKgT ;
   private boolean n5372FasQuiUl ;
   private boolean n5369BarFasGral ;
   private boolean n5048BarFasUsu ;
   private boolean n5047BarFasFPl ;
   private boolean n5046BarFasPrp ;
   private boolean n5045BarFasAgr ;
   private boolean n4974BarFasPPr ;
   private boolean n4973BarFasKPr ;
   private boolean n4443BarFasDTF ;
   private boolean n4442BarFasDTI ;
   private boolean n4938BarFasInc ;
   private boolean n4638BarUltNlot ;
   private boolean n4636BarFasPzas ;
   private boolean n3838BarFasMtr ;
   private boolean n3837BarFasKgm ;
   private boolean n13519BarPieMq ;
   private boolean n13518BarPieTurn ;
   private boolean n13109BarPieST ;
   private boolean n13108BarPieLote ;
   private boolean n13107BarPieEmp ;
   private boolean n13004BarPieDest ;
   private boolean n12992BarPieOpe ;
   private boolean n12936BarPieSecu ;
   private boolean n12935BarPieTono ;
   private boolean n12928BarPieEncC ;
   private boolean n12927BarPieCoCN ;
   private boolean n12926BarPieCoCI ;
   private boolean n12925BarPieCliN ;
   private boolean n12924BarPieCliI ;
   private boolean n12923BarPieArtD ;
   private boolean n12922BarPieArtI ;
   private boolean n12921BarPieColN ;
   private boolean n12920BarPieColD ;
   private boolean n12912BarPieUltD ;
   private boolean n12911BarPieFep ;
   private boolean n12780BarPieUsu ;
   private boolean n12779BarPieFdv ;
   private boolean n12113BarPieCLd ;
   private boolean n1642BarPieOrd ;
   private boolean n6473BarUniB ;
   private boolean n6472BarTara ;
   private boolean n1919BarPieObs ;
   private boolean n9984BarPiePda ;
   private boolean n9846BarPieAncc ;
   private boolean n9800BarNPes ;
   private boolean n9799BarPz2 ;
   private boolean n9798BarPz1 ;
   private boolean n9796BarPieK2 ;
   private boolean n9795BarPieK1 ;
   private boolean n8907PzaB80 ;
   private boolean n8838CodBarPz ;
   private boolean n8707BapieObs ;
   private boolean n6489BarPieIdPz ;
   private boolean n6116BarPieImp ;
   private boolean n3277BarPieAut ;
   private boolean n3276BarMtsAut ;
   private boolean n3275BarKgsAut ;
   private boolean n2186BarPieLoc ;
   private boolean n1691BarPieAnc ;
   private String A14329BarCnoEncO ;
   private String A13907BarSerDsc2 ;
   private String A11662BarOrdComp ;
   private String A4845BarAudObs ;
   private String A12458TsSolObs ;
   private String A12359BarFasObs ;
   private String A10032BarObsB ;
   private String A9842BarObsF ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P00693_A144BarDisOri ;
   private byte[] P00693_A190BarNumAso ;
   private byte[] P00693_A149BarEstRes ;
   private byte[] P00693_A147BarEstCol ;
   private java.util.Date[] P00693_A158BarFecFpr ;
   private int[] P00693_A163BarHorCum ;
   private java.math.BigDecimal[] P00693_A169BarKgsFac ;
   private java.math.BigDecimal[] P00693_A140BarCosAny ;
   private java.math.BigDecimal[] P00693_A141BarCosPro ;
   private short[] P00693_A189BarNumAny ;
   private String[] P00693_A137BarConPar ;
   private byte[] P00693_A138BarConReo ;
   private String[] P00693_A209BarPri ;
   private byte[] P00693_A213BarSit ;
   private byte[] P00693_A146BarEst ;
   private String[] P00693_A145BarEncOri ;
   private String[] P00693_A139BarCorOri ;
   private String[] P00693_A118BarAcaQui ;
   private String[] P00693_A214BarSua ;
   private String[] P00693_A177BarLar ;
   private String[] P00693_A206BarPle ;
   private short[] P00693_A126BarAncAca2 ;
   private short[] P00693_A125BarAncAca1 ;
   private short[] P00693_A128BarAncCru2 ;
   private short[] P00693_A127BarAncCru1 ;
   private short[] P00693_A234BarUrdP3 ;
   private String[] P00693_A231BarUrd3 ;
   private short[] P00693_A233BarUrdP2 ;
   private String[] P00693_A230BarUrd2 ;
   private short[] P00693_A232BarUrdP1 ;
   private String[] P00693_A229BarUrd1 ;
   private short[] P00693_A226BarTraP3 ;
   private String[] P00693_A223BarTra3 ;
   private short[] P00693_A225BarTraP2 ;
   private String[] P00693_A222BarTra2 ;
   private short[] P00693_A224BarTraP1 ;
   private String[] P00693_A221BarTra1 ;
   private java.math.BigDecimal[] P00693_A211BarRdt ;
   private String[] P00693_A182BarMat ;
   private java.math.BigDecimal[] P00693_A142BarDiaP ;
   private byte[] P00693_A235BarUrg ;
   private java.util.Date[] P00693_A161BarFecSal ;
   private byte[] P00693_A193BarOpeEsp ;
   private String[] P00693_A181BarMaqPro ;
   private java.util.Date[] P00693_A157BarFecEnt ;
   private byte[] P00693_A196BarOrdReo ;
   private short[] P00693_A191BarNumPie ;
   private java.util.Date[] P00693_A155BarFecCli ;
   private byte[] P00693_A148BarEstReo ;
   private String[] P00693_A228BarUniMed ;
   private java.math.BigDecimal[] P00693_A192BarNumUni ;
   private java.util.Date[] P00693_A159BarFecGen ;
   private byte[] P00693_A218BarTipCol ;
   private int[] P00693_A136BarColNum ;
   private String[] P00693_A135BarColNom ;
   private short[] P00693_A217BarTipArt ;
   private boolean[] P00693_n217BarTipArt ;
   private String[] P00693_A212BarSer ;
   private String[] P00693_A143BarDisNum ;
   private int[] P00693_A361DisCod ;
   private int[] P00693_A236BarVolMaq ;
   private String[] P00693_A180BarMaqCod ;
   private String[] P00693_A120BarAgrEst ;
   private byte[] P00693_A132BarCodReo ;
   private int[] P00693_A129BarCod ;
   private java.math.BigDecimal[] P00693_A4458BarCruKgs ;
   private boolean[] P00693_n4458BarCruKgs ;
   private java.math.BigDecimal[] P00693_A4457BarCruMts ;
   private boolean[] P00693_n4457BarCruMts ;
   private short[] P00693_A4456BarPelAnh ;
   private byte[] P00693_A4400BarSitEst ;
   private String[] P00693_A4018BarBot ;
   private byte[] P00693_A4017BarInci ;
   private String[] P00693_A4016BarTin ;
   private byte[] P00693_A4015BarEnv ;
   private byte[] P00693_A2512BarComULin ;
   private boolean[] P00693_n2512BarComULin ;
   private int[] P00693_A1799BarDibInt ;
   private String[] P00693_A1798BarDibCli ;
   private java.util.Date[] P00693_A3871BarFecCRe ;
   private java.util.Date[] P00693_A3870BarFecLRe ;
   private String[] P00693_A3787BarEnvRec ;
   private boolean[] P00693_n3787BarEnvRec ;
   private String[] P00693_A3746BarNPed ;
   private String[] P00693_A3745BarFoa ;
   private String[] P00693_A3744BarPeg ;
   private int[] P00693_A3595BarMacCod ;
   private String[] P00693_A3313BarNumTon ;
   private short[] P00693_A3312BarManCod2 ;
   private short[] P00693_A3311BarManCod1 ;
   private String[] P00693_A3310BarFac ;
   private short[] P00693_A3138BarGraCru2 ;
   private short[] P00693_A3137BarGraAca2 ;
   private short[] P00693_A3136BarAncSal3 ;
   private short[] P00693_A3135BarAncSal2 ;
   private short[] P00693_A3134BarAncSal1 ;
   private short[] P00693_A3133BarNumCor ;
   private String[] P00693_A2836BarPle2 ;
   private String[] P00693_A3030BarPlf ;
   private java.math.BigDecimal[] P00693_A3006BarCoef ;
   private boolean[] P00693_n3006BarCoef ;
   private byte[] P00693_A2830BarIntPer ;
   private String[] P00693_A2829BarProPer ;
   private java.math.BigDecimal[] P00693_A2828BarMtrLot ;
   private java.math.BigDecimal[] P00693_A2827BarKgsLot ;
   private int[] P00693_A2826BarNumLot ;
   private short[] P00693_A2803UltLinMaq ;
   private boolean[] P00693_n2803UltLinMaq ;
   private String[] P00693_A2759BarMaqGru ;
   private byte[] P00693_A2754BarSitExt ;
   private short[] P00693_A2753BarNumTex2 ;
   private boolean[] P00693_n2753BarNumTex2 ;
   private byte[] P00693_A2752BarNumTex1 ;
   private String[] P00693_A2746BarCodTex ;
   private boolean[] P00693_n2746BarCodTex ;
   private int[] P00693_A2487BarConEle ;
   private int[] P00693_A2488BarConVap ;
   private int[] P00693_A2486BarConAgu ;
   private java.util.Date[] P00693_A2496BarFecFin ;
   private java.util.Date[] P00693_A2497BarFecIni ;
   private String[] P00693_A2500BarRDos2 ;
   private String[] P00693_A2499BarRDos1 ;
   private String[] P00693_A2498BarPrdPes ;
   private String[] P00693_A2485BarColPes ;
   private java.math.BigDecimal[] P00693_A1911BarRdoA ;
   private java.math.BigDecimal[] P00693_A1910BarRdoN ;
   private short[] P00693_A1909BarGraAca ;
   private short[] P00693_A2458BarObsVL ;
   private boolean[] P00693_n2458BarObsVL ;
   private String[] P00693_A2453BarEntAca ;
   private boolean[] P00693_n2453BarEntAca ;
   private String[] P00693_A2452BarCal ;
   private boolean[] P00693_n2452BarCal ;
   private short[] P00693_A2459BarTemSec ;
   private short[] P00693_A2455BarNMont ;
   private boolean[] P00693_n2455BarNMont ;
   private String[] P00693_A2454BarGirar ;
   private String[] P00693_A2460BarTipAca ;
   private java.math.BigDecimal[] P00693_A2450BarKgEnR ;
   private boolean[] P00693_n2450BarKgEnR ;
   private short[] P00693_A2443BarBulEnR ;
   private boolean[] P00693_n2443BarBulEnR ;
   private java.util.Date[] P00693_A2448BarFecEnR ;
   private boolean[] P00693_n2448BarFecEnR ;
   private short[] P00693_A2446BarEnULin ;
   private boolean[] P00693_n2446BarEnULin ;
   private String[] P00693_A2445BarEntEnE ;
   private java.math.BigDecimal[] P00693_A2449BarKgEnE ;
   private boolean[] P00693_n2449BarKgEnE ;
   private short[] P00693_A2442BarBulEnE ;
   private boolean[] P00693_n2442BarBulEnE ;
   private java.util.Date[] P00693_A2447BarFecEnE ;
   private byte[] P00693_A2401BarNumPas ;
   private boolean[] P00693_n2401BarNumPas ;
   private short[] P00693_A2400BarManCod ;
   private int[] P00693_A2311BarCliDes ;
   private byte[] P00693_A2265BarExt ;
   private boolean[] P00693_n2265BarExt ;
   private String[] P00693_A2010BarTipDis ;
   private int[] P00693_A1923BarCodTN ;
   private String[] P00693_A1878BarNumTen ;
   private byte[] P00693_A1832BarLisInd ;
   private String[] P00693_A1652BarSerDsc ;
   private short[] P00693_A1503BarPart ;
   private String[] P00693_A1499BarNMez ;
   private String[] P00693_A1500BarNMtr ;
   private String[] P00693_A1431BarLocDis ;
   private byte[] P00693_A1254BarPesBal ;
   private int[] P00693_A1235BarNumCli ;
   private String[] P00693_A1234BarNomCli ;
   private short[] P00693_A1226BarGraCru ;
   private java.math.BigDecimal[] P00693_A1224BarEncAnh ;
   private java.math.BigDecimal[] P00693_A1223BarEncCom ;
   private short[] P00693_A921BarMatiz ;
   private java.util.Date[] P00693_A1003BarFecLan ;
   private boolean[] P00693_n1003BarFecLan ;
   private String[] P00693_A935BarReoPar ;
   private byte[] P00693_A936BarReoReo ;
   private int[] P00693_A934BarReoCod ;
   private byte[] P00693_A905ObsReoULin ;
   private boolean[] P00693_n905ObsReoULin ;
   private String[] P00693_A904ObsReoEnt ;
   private boolean[] P00693_n904ObsReoEnt ;
   private short[] P00693_A899TipDefPor ;
   private boolean[] P00693_n899TipDefPor ;
   private short[] P00693_A833TipDefCod ;
   private boolean[] P00693_n833TipDefCod ;
   private short[] P00693_A864BarPes ;
   private byte[] P00693_A646NotUltLin ;
   private boolean[] P00693_n646NotUltLin ;
   private byte[] P00693_A178BarLis ;
   private String[] P00693_A396EmprCod ;
   private String[] P00693_A130BarCodPar ;
   private String[] P00693_A365DisDes ;
   private int[] P00693_A252CliCod ;
   private boolean[] P00693_n252CliCod ;
   private byte[] P00693_A14330BarPriorid ;
   private String[] P00693_A14329BarCnoEncO ;
   private String[] P00693_A13908BarIdtx2 ;
   private boolean[] P00693_n13908BarIdtx2 ;
   private String[] P00693_A13907BarSerDsc2 ;
   private boolean[] P00693_n13907BarSerDsc2 ;
   private short[] P00693_A13769BarRdto4 ;
   private boolean[] P00693_n13769BarRdto4 ;
   private long[] P00693_A13234BarRGB ;
   private byte[] P00693_A13092BarDGUltLi ;
   private boolean[] P00693_n13092BarDGUltLi ;
   private String[] P00693_A13077BarLinPrd ;
   private int[] P00693_A13071BarCanalID ;
   private short[] P00693_A13070BarLineaID ;
   private String[] P00693_A12881BarOEKOTEX ;
   private boolean[] P00693_n12881BarOEKOTEX ;
   private String[] P00693_A12811BarLocCol ;
   private String[] P00693_A12810BarLocMol ;
   private String[] P00693_A12809BarLocTel ;
   private String[] P00693_A12774BarProdID ;
   private byte[] P00693_A12767BarTpEstam ;
   private String[] P00693_A12329SubRevID ;
   private boolean[] P00693_n12329SubRevID ;
   private short[] P00693_A11857Nxt_desaID ;
   private boolean[] P00693_n11857Nxt_desaID ;
   private short[] P00693_A11855Nxt_dpoID ;
   private boolean[] P00693_n11855Nxt_dpoID ;
   private short[] P00693_A11853Nxt_cpeID ;
   private boolean[] P00693_n11853Nxt_cpeID ;
   private String[] P00693_A11852Nxt_ArtCl2 ;
   private String[] P00693_A11851Nxt_Sta2 ;
   private String[] P00693_A11850Nxt_Mdlo2 ;
   private String[] P00693_A5058BarEnvLaw ;
   private java.math.BigDecimal[] P00693_A3736BarPieMtl ;
   private java.math.BigDecimal[] P00693_A3735BarPieKgl ;
   private short[] P00693_A3363BarPiePrv ;
   private java.math.BigDecimal[] P00693_A3362BarMtsPrv ;
   private java.math.BigDecimal[] P00693_A3361BarKgsPrv ;
   private String[] P00693_A3786BarEnvBar ;
   private short[] P00693_A3785BarUltAny ;
   private short[] P00693_A3784BarAnyTie ;
   private byte[] P00693_A3783BarRecLis ;
   private java.math.BigDecimal[] P00693_A3780BarKilLam ;
   private int[] P00693_A3597BarVolAma ;
   private String[] P00693_A3596BarMaqAma ;
   private byte[] P00693_A3594BarPriTin ;
   private String[] P00693_A11662BarOrdComp ;
   private short[] P00693_A4844BarAudULin ;
   private boolean[] P00693_n4844BarAudULin ;
   private java.math.BigDecimal[] P00693_A4841BarAudMCue ;
   private boolean[] P00693_n4841BarAudMCue ;
   private java.math.BigDecimal[] P00693_A4840BarAudMDig ;
   private boolean[] P00693_n4840BarAudMDig ;
   private short[] P00693_A4838BarAudNPz ;
   private boolean[] P00693_n4838BarAudNPz ;
   private String[] P00693_A4837BarAudSupN ;
   private boolean[] P00693_n4837BarAudSupN ;
   private String[] P00693_A4835BarAudOpeN ;
   private boolean[] P00693_n4835BarAudOpeN ;
   private int[] P00693_A4834BarAudOpe ;
   private boolean[] P00693_n4834BarAudOpe ;
   private byte[] P00693_A4833BarAudTur ;
   private boolean[] P00693_n4833BarAudTur ;
   private java.util.Date[] P00693_A4832BarAudFec ;
   private boolean[] P00693_n4832BarAudFec ;
   private String[] P00693_A9790BarItem6 ;
   private String[] P00693_A9789BarItem5 ;
   private String[] P00693_A9778BarItem4 ;
   private String[] P00693_A9777BarItem3 ;
   private String[] P00693_A9776barItem2 ;
   private String[] P00693_A9775BarItem1 ;
   private int[] P00693_A8568EntSecUlt ;
   private boolean[] P00693_n8568EntSecUlt ;
   private int[] P00693_A8098BarOpeHis ;
   private java.util.Date[] P00693_A8097BarFecHis ;
   private String[] P00693_A7733BarMaqEst ;
   private byte[] P00693_A6434BarAsi ;
   private String[] P00693_A5406BarAntpT ;
   private String[] P00693_A5367BarAntp ;
   private String[] P00693_A5352BarObsAnc ;
   private String[] P00693_A5351BarObsGrm ;
   private String[] P00693_A5293BarCodBan ;
   private String[] P00693_A5291BarTipCor ;
   private String[] P00693_A5253BarAcc ;
   private java.math.BigDecimal[] P00693_A5057BarFacAbs ;
   private boolean[] P00693_n5057BarFacAbs ;
   private short[] P00693_A5056BarBp15 ;
   private boolean[] P00693_n5056BarBp15 ;
   private java.math.BigDecimal[] P00693_A5055BarBp14 ;
   private boolean[] P00693_n5055BarBp14 ;
   private short[] P00693_A5054BarBp13 ;
   private boolean[] P00693_n5054BarBp13 ;
   private short[] P00693_A5053BarBp12 ;
   private boolean[] P00693_n5053BarBp12 ;
   private String[] P00693_A5034BarEstTip ;
   private String[] P00693_A5033BarCom ;
   private byte[] P00693_A5027BarGraCob ;
   private byte[] P00693_A5026BarTipEst ;
   private String[] P00693_A5009BarLoteA ;
   private short[] P00693_A4975BarNumReo ;
   private byte[] P00693_A4937BarCtrPdas ;
   private boolean[] P00693_n4937BarCtrPdas ;
   private String[] P00693_A4908BarMacPro ;
   private String[] P00693_A4845BarAudObs ;
   private boolean[] P00693_n4845BarAudObs ;
   private int[] P00693_A4836BarAudSup ;
   private String[] P00693_A4812BarEncCli ;
   private String[] P00693_A4716BarDishCod ;
   private java.util.Date[] P00693_A4613BarHorReg ;
   private boolean[] P00693_n4613BarHorReg ;
   private int[] P00693_A4612BarPzas ;
   private boolean[] P00693_n4612BarPzas ;
   private java.util.Date[] P00693_A4611BarHorEnt ;
   private boolean[] P00693_n4611BarHorEnt ;
   private String[] P00693_A4610BarTam ;
   private String[] P00693_A4609BarMdlCod ;
   private String[] P00693_A4467BarAcaMar ;
   private short[] P00693_A4466BarAcaAnh ;
   private String[] P00693_A4465BarAcaBak ;
   private boolean[] P00693_n4465BarAcaBak ;
   private int[] P00693_A4464BarAcaFor ;
   private boolean[] P00693_n4464BarAcaFor ;
   private String[] P00693_A4463BarLotMaq ;
   private boolean[] P00693_n4463BarLotMaq ;
   private java.math.BigDecimal[] P00693_A4462BarLotKgs ;
   private java.math.BigDecimal[] P00693_A4461BarLotMts ;
   private short[] P00693_A4460BarLotPza ;
   private boolean[] P00693_n4460BarLotPza ;
   private String[] P00693_A4459BarCruEnr ;
   private String[] P00695_A396EmprCod ;
   private int[] P00695_A129BarCod ;
   private byte[] P00695_A132BarCodReo ;
   private String[] P00695_A130BarCodPar ;
   private short[] P00695_A761ProFasLin ;
   private boolean[] P00695_n761ProFasLin ;
   private String[] P00695_A758ProCod ;
   private String[] P00697_A396EmprCod ;
   private int[] P00697_A129BarCod ;
   private byte[] P00697_A132BarCodReo ;
   private String[] P00697_A130BarCodPar ;
   private String[] P00697_A758ProCod ;
   private short[] P00697_A12466SolAfLnUl ;
   private boolean[] P00697_n12466SolAfLnUl ;
   private short[] P00697_A12465SolLzLnUl ;
   private boolean[] P00697_n12465SolLzLnUl ;
   private short[] P00697_A12464SolPlLnUl ;
   private boolean[] P00697_n12464SolPlLnUl ;
   private short[] P00697_A12463SolSAlLnUl ;
   private boolean[] P00697_n12463SolSAlLnUl ;
   private short[] P00697_A12462SolSAcLnUl ;
   private boolean[] P00697_n12462SolSAcLnUl ;
   private short[] P00697_A12461SolFrLnUl ;
   private boolean[] P00697_n12461SolFrLnUl ;
   private short[] P00697_A12460SolAgLnUl ;
   private boolean[] P00697_n12460SolAgLnUl ;
   private short[] P00697_A12459SolLvLnUl ;
   private boolean[] P00697_n12459SolLvLnUl ;
   private String[] P00697_A12458TsSolObs ;
   private boolean[] P00697_n12458TsSolObs ;
   private java.util.Date[] P00697_A12457TsSolRFec ;
   private boolean[] P00697_n12457TsSolRFec ;
   private int[] P00697_A12456TsSolRLcq ;
   private boolean[] P00697_n12456TsSolRLcq ;
   private java.util.Date[] P00697_A12455TsSolTFec ;
   private boolean[] P00697_n12455TsSolTFec ;
   private int[] P00697_A12454TsSolTLcq ;
   private boolean[] P00697_n12454TsSolTLcq ;
   private byte[] P00697_A12379BarFasBlq ;
   private boolean[] P00697_n12379BarFasBlq ;
   private String[] P00697_A12360BarFasTOb ;
   private boolean[] P00697_n12360BarFasTOb ;
   private String[] P00697_A12359BarFasObs ;
   private boolean[] P00697_n12359BarFasObs ;
   private String[] P00697_A2327BarFasSer ;
   private boolean[] P00697_n2327BarFasSer ;
   private byte[] P00697_A3836BarFasPri ;
   private String[] P00697_A10032BarObsB ;
   private boolean[] P00697_n10032BarObsB ;
   private String[] P00697_A9842BarObsF ;
   private boolean[] P00697_n9842BarObsF ;
   private short[] P00697_A8938BarfasPri2 ;
   private boolean[] P00697_n8938BarfasPri2 ;
   private String[] P00697_A8594BarHdrO ;
   private boolean[] P00697_n8594BarHdrO ;
   private short[] P00697_A7933Dtb_UOrd ;
   private boolean[] P00697_n7933Dtb_UOrd ;
   private java.math.BigDecimal[] P00697_A7914BarfasRb ;
   private boolean[] P00697_n7914BarfasRb ;
   private java.math.BigDecimal[] P00697_A7913BarfasUnpL ;
   private boolean[] P00697_n7913BarfasUnpL ;
   private java.math.BigDecimal[] P00697_A7912Barfastpp ;
   private boolean[] P00697_n7912Barfastpp ;
   private byte[] P00697_A6555BarFasNPl ;
   private short[] P00697_A6430BarTieAut ;
   private String[] P00697_A6392BarHdMn ;
   private boolean[] P00697_n6392BarHdMn ;
   private short[] P00697_A6391BarfasOP ;
   private boolean[] P00697_n6391BarfasOP ;
   private String[] P00697_A6390BarfasMn ;
   private boolean[] P00697_n6390BarfasMn ;
   private String[] P00697_A6173BarFasSec ;
   private boolean[] P00697_n6173BarFasSec ;
   private String[] P00697_A6012BarFasTip ;
   private boolean[] P00697_n6012BarFasTip ;
   private java.math.BigDecimal[] P00697_A5999BarFasCR ;
   private String[] P00697_A5896BarMaqPlan ;
   private boolean[] P00697_n5896BarMaqPlan ;
   private java.math.BigDecimal[] P00697_A5720BarFasMtT ;
   private boolean[] P00697_n5720BarFasMtT ;
   private java.math.BigDecimal[] P00697_A5719BarFasKgT ;
   private boolean[] P00697_n5719BarFasKgT ;
   private short[] P00697_A5372FasQuiUl ;
   private boolean[] P00697_n5372FasQuiUl ;
   private String[] P00697_A5369BarFasGral ;
   private boolean[] P00697_n5369BarFasGral ;
   private String[] P00697_A5048BarFasUsu ;
   private boolean[] P00697_n5048BarFasUsu ;
   private java.util.Date[] P00697_A5047BarFasFPl ;
   private boolean[] P00697_n5047BarFasFPl ;
   private String[] P00697_A5046BarFasPrp ;
   private boolean[] P00697_n5046BarFasPrp ;
   private String[] P00697_A5045BarFasAgr ;
   private boolean[] P00697_n5045BarFasAgr ;
   private String[] P00697_A457FasCod ;
   private short[] P00697_A4974BarFasPPr ;
   private boolean[] P00697_n4974BarFasPPr ;
   private java.math.BigDecimal[] P00697_A4973BarFasKPr ;
   private boolean[] P00697_n4973BarFasKPr ;
   private java.util.Date[] P00697_A4443BarFasDTF ;
   private boolean[] P00697_n4443BarFasDTF ;
   private java.util.Date[] P00697_A4442BarFasDTI ;
   private boolean[] P00697_n4442BarFasDTI ;
   private byte[] P00697_A4938BarFasInc ;
   private boolean[] P00697_n4938BarFasInc ;
   private String[] P00697_A4905BarFasAcab ;
   private int[] P00697_A4638BarUltNlot ;
   private boolean[] P00697_n4638BarUltNlot ;
   private String[] P00697_A4637BarFasCara ;
   private int[] P00697_A4636BarFasPzas ;
   private boolean[] P00697_n4636BarFasPzas ;
   private int[] P00697_A4288BarNPzas ;
   private String[] P00697_A4301BarFasCoP ;
   private String[] P00697_A4287BarFasFor ;
   private int[] P00697_A4022BarNumBot ;
   private String[] P00697_A4021BarFasBot ;
   private java.math.BigDecimal[] P00697_A3838BarFasMtr ;
   private boolean[] P00697_n3838BarFasMtr ;
   private java.math.BigDecimal[] P00697_A3837BarFasKgm ;
   private boolean[] P00697_n3837BarFasKgm ;
   private String[] P00697_A179BarLoc ;
   private java.util.Date[] P00697_A3298BarFecRIni ;
   private java.math.BigDecimal[] P00697_A215BarTieRea ;
   private short[] P00697_A164BarHorFin ;
   private short[] P00697_A165BarHorIni ;
   private java.math.BigDecimal[] P00697_A227BarUni ;
   private java.math.BigDecimal[] P00697_A216BarTieTeo ;
   private java.util.Date[] P00697_A160BarFecRea ;
   private java.util.Date[] P00697_A162BarFecTeo ;
   private String[] P00697_A150BarFacTin ;
   private String[] P00697_A603MaqCodBis ;
   private byte[] P00697_A153BarFasEst ;
   private String[] P00697_A152BarFasCon ;
   private short[] P00697_A194BarOrdLin ;
   private String[] P006911_A396EmprCod ;
   private int[] P006911_A129BarCod ;
   private byte[] P006911_A132BarCodReo ;
   private String[] P006911_A130BarCodPar ;
   private String[] P006911_A13988BarPieVtx ;
   private String[] P006911_A13519BarPieMq ;
   private boolean[] P006911_n13519BarPieMq ;
   private byte[] P006911_A13518BarPieTurn ;
   private boolean[] P006911_n13518BarPieTurn ;
   private String[] P006911_A13109BarPieST ;
   private boolean[] P006911_n13109BarPieST ;
   private String[] P006911_A13108BarPieLote ;
   private boolean[] P006911_n13108BarPieLote ;
   private short[] P006911_A13107BarPieEmp ;
   private boolean[] P006911_n13107BarPieEmp ;
   private byte[] P006911_A13004BarPieDest ;
   private boolean[] P006911_n13004BarPieDest ;
   private int[] P006911_A12992BarPieOpe ;
   private boolean[] P006911_n12992BarPieOpe ;
   private String[] P006911_A12936BarPieSecu ;
   private boolean[] P006911_n12936BarPieSecu ;
   private String[] P006911_A12935BarPieTono ;
   private boolean[] P006911_n12935BarPieTono ;
   private String[] P006911_A12928BarPieEncC ;
   private boolean[] P006911_n12928BarPieEncC ;
   private int[] P006911_A12927BarPieCoCN ;
   private boolean[] P006911_n12927BarPieCoCN ;
   private String[] P006911_A12926BarPieCoCI ;
   private boolean[] P006911_n12926BarPieCoCI ;
   private String[] P006911_A12925BarPieCliN ;
   private boolean[] P006911_n12925BarPieCliN ;
   private int[] P006911_A12924BarPieCliI ;
   private boolean[] P006911_n12924BarPieCliI ;
   private String[] P006911_A12923BarPieArtD ;
   private boolean[] P006911_n12923BarPieArtD ;
   private String[] P006911_A12922BarPieArtI ;
   private boolean[] P006911_n12922BarPieArtI ;
   private int[] P006911_A12921BarPieColN ;
   private boolean[] P006911_n12921BarPieColN ;
   private String[] P006911_A12920BarPieColD ;
   private boolean[] P006911_n12920BarPieColD ;
   private short[] P006911_A12912BarPieUltD ;
   private boolean[] P006911_n12912BarPieUltD ;
   private java.util.Date[] P006911_A12911BarPieFep ;
   private boolean[] P006911_n12911BarPieFep ;
   private String[] P006911_A12780BarPieUsu ;
   private boolean[] P006911_n12780BarPieUsu ;
   private java.util.Date[] P006911_A12779BarPieFdv ;
   private boolean[] P006911_n12779BarPieFdv ;
   private byte[] P006911_A12113BarPieCLd ;
   private boolean[] P006911_n12113BarPieCLd ;
   private int[] P006911_A1642BarPieOrd ;
   private boolean[] P006911_n1642BarPieOrd ;
   private java.math.BigDecimal[] P006911_A6473BarUniB ;
   private boolean[] P006911_n6473BarUniB ;
   private java.math.BigDecimal[] P006911_A6472BarTara ;
   private boolean[] P006911_n6472BarTara ;
   private String[] P006911_A1919BarPieObs ;
   private boolean[] P006911_n1919BarPieObs ;
   private java.math.BigDecimal[] P006911_A9984BarPiePda ;
   private boolean[] P006911_n9984BarPiePda ;
   private short[] P006911_A9846BarPieAncc ;
   private boolean[] P006911_n9846BarPieAncc ;
   private byte[] P006911_A9800BarNPes ;
   private boolean[] P006911_n9800BarNPes ;
   private int[] P006911_A9799BarPz2 ;
   private boolean[] P006911_n9799BarPz2 ;
   private int[] P006911_A9798BarPz1 ;
   private boolean[] P006911_n9798BarPz1 ;
   private java.math.BigDecimal[] P006911_A9796BarPieK2 ;
   private boolean[] P006911_n9796BarPieK2 ;
   private java.math.BigDecimal[] P006911_A9795BarPieK1 ;
   private boolean[] P006911_n9795BarPieK1 ;
   private String[] P006911_A8907PzaB80 ;
   private boolean[] P006911_n8907PzaB80 ;
   private String[] P006911_A8838CodBarPz ;
   private boolean[] P006911_n8838CodBarPz ;
   private String[] P006911_A8707BapieObs ;
   private boolean[] P006911_n8707BapieObs ;
   private String[] P006911_A6489BarPieIdPz ;
   private boolean[] P006911_n6489BarPieIdPz ;
   private String[] P006911_A6116BarPieImp ;
   private boolean[] P006911_n6116BarPieImp ;
   private short[] P006911_A3277BarPieAut ;
   private boolean[] P006911_n3277BarPieAut ;
   private java.math.BigDecimal[] P006911_A3276BarMtsAut ;
   private boolean[] P006911_n3276BarMtsAut ;
   private java.math.BigDecimal[] P006911_A3275BarKgsAut ;
   private boolean[] P006911_n3275BarKgsAut ;
   private String[] P006911_A2186BarPieLoc ;
   private boolean[] P006911_n2186BarPieLoc ;
   private short[] P006911_A1691BarPieAnc ;
   private boolean[] P006911_n1691BarPieAnc ;
   private int[] P006911_A1501BarPiePie ;
   private int[] P006911_A1271BarPieLzd ;
   private String[] P006911_A908PieOriCod ;
   private short[] P006911_A197BarPConTro ;
   private java.math.BigDecimal[] P006911_A183BarMetLan ;
   private java.math.BigDecimal[] P006911_A170BarKilLan ;
   private byte[] P006911_A201BarPieEst ;
   private java.math.BigDecimal[] P006911_A205BarPieMet ;
   private java.math.BigDecimal[] P006911_A203BarPieKil ;
   private int[] P006911_A44AlbRecCod ;
   private String[] P006911_A200BarPieCod ;
}

final  class pbajreo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00692", "DELETE FROM TXPHISREO  WHERE EmprCod = ? and HisBarCod = ? and HisCodReo = ? and HisCodPar = ? and TipDefCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
         ,new ForEachCursor("P00693", "SELECT BarDisOri, BarNumAso, BarEstRes, BarEstCol, BarFecFpr, BarHorCum, BarKgsFac, BarCosAny, BarCosPro, BarNumAny, BarConPar, BarConReo, BarPri, BarSit, BarEst, BarEncOri, BarCorOri, BarAcaQui, BarSua, BarLar, BarPle, BarAncAca2, BarAncAca1, BarAncCru2, BarAncCru1, BarUrdP3, BarUrd3, BarUrdP2, BarUrd2, BarUrdP1, BarUrd1, BarTraP3, BarTra3, BarTraP2, BarTra2, BarTraP1, BarTra1, BarRdt, BarMat, BarDiaP, BarUrg, BarFecSal, BarOpeEsp, BarMaqPro, BarFecEnt, BarOrdReo, BarNumPie, BarFecCli, BarEstReo, BarUniMed, BarNumUni, BarFecGen, BarTipCol, BarColNum, BarColNom, BarTipArt, BarSer, BarDisNum, DisCod, BarVolMaq, BarMaqCod, BarAgrEst, BarCodReo, BarCod, BarCruKgs, BarCruMts, BarPelAnh, BarSitEst, BarBot, BarInci, BarTin, BarEnv, BarComULin, BarDibInt, BarDibCli, BarFecCRe, BarFecLRe, BarEnvRec, BarNPed, BarFoa, BarPeg, BarMacCod, BarNumTon, BarManCod2, BarManCod1, BarFac, BarGraCru2, BarGraAca2, BarAncSal3, BarAncSal2, BarAncSal1, BarNumCor, BarPle2, BarPlf, BarCoef, BarIntPer, BarProPer, BarMtrLot, BarKgsLot, BarNumLot, UltLinMaq, BarMaqGru, BarSitExt, BarNumTex2, BarNumTex1, BarCodTex, BarConEle, BarConVap, BarConAgu, BarFecFin, BarFecIni, BarRDos2, BarRDos1, BarPrdPes, BarColPes, BarRdoA, BarRdoN, BarGraAca, BarObsVL, BarEntAca, BarCal, BarTemSec, BarNMont, BarGirar, BarTipAca, BarKgEnR, BarBulEnR, BarFecEnR, BarEnULin, BarEntEnE, BarKgEnE, BarBulEnE, BarFecEnE, BarNumPas, BarManCod, BarCliDes, BarExt, BarTipDis, BarCodTN, BarNumTen, BarLisInd, BarSerDsc, BarPart, BarNMez, BarNMtr, BarLocDis, BarPesBal, BarNumCli, BarNomCli, BarGraCru, BarEncAnh, BarEncCom, BarMatiz, BarFecLan, BarReoPar, BarReoReo, BarReoCod, ObsReoULin, ObsReoEnt, TipDefPor, TipDefCod, BarPes, NotUltLin, BarLis, EmprCod, BarCodPar, DisDes, CliCod, BarPriorid, BarCnoEncO, BarIdtx2, BarSerDsc2, BarRdto4, BarRGB, BarDGUltLi, BarLinPrd, BarCanalID, BarLineaID, BarOEKOTEX, BarLocCol, BarLocMol, BarLocTel, BarProdID, BarTpEstam, SubRevID, Nxt_desaID, Nxt_dpoID, Nxt_cpeID, Nxt_ArtCl2, Nxt_Sta2, Nxt_Mdlo2, BarEnvLaw, BarPieMtl, BarPieKgl, BarPiePrv, BarMtsPrv, BarKgsPrv, BarEnvBar, BarUltAny, BarAnyTie, BarRecLis, BarKilLam, BarVolAma, BarMaqAma, BarPriTin, BarOrdComp, BarAudULin, BarAudMCue, BarAudMDig, BarAudNPz, BarAudSupN, BarAudOpeN, BarAudOpe, BarAudTur, BarAudFec, BarItem6, BarItem5, BarItem4, BarItem3, barItem2, BarItem1, EntSecUlt, BarOpeHis, BarFecHis, BarMaqEst, BarAsi, BarAntpT, BarAntp, BarObsAnc, BarObsGrm, BarCodBan, BarTipCor, BarAcc, BarFacAbs, BarBp15, BarBp14, BarBp13, BarBp12, BarEstTip, BarCom, BarGraCob, BarTipEst, BarLoteA, BarNumReo, BarCtrPdas, BarMacPro, BarAudObs, BarAudSup, BarEncCli, BarDishCod, BarHorReg, BarPzas, BarHorEnt, BarTam, BarMdlCod, BarAcaMar, BarAcaAnh, BarAcaBak, BarAcaFor, BarLotMaq, BarLotKgs, BarLotMts, BarLotPza, BarCruEnr FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00694", "INSERT INTO TXPBARCAD(EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst, BarMaqCod, BarVolMaq, DisCod, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarSit, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, BarMaqGru, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid, CliCod, DisDes) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P00695", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00696", "INSERT INTO TXPBARPRO(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
         ,new ForEachCursor("P00697", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, SolAfLnUl, SolLzLnUl, SolPlLnUl, SolSAlLnUl, SolSAcLnUl, SolFrLnUl, SolAgLnUl, SolLvLnUl, TsSolObs, TsSolRFec, TsSolRLcq, TsSolTFec, TsSolTLcq, BarFasBlq, BarFasTOb, BarFasObs, BarFasSer, BarFasPri, BarObsB, BarObsF, BarfasPri2, BarHdrO, Dtb_UOrd, BarfasRb, BarfasUnpL, Barfastpp, BarFasNPl, BarTieAut, BarHdMn, BarfasOP, BarfasMn, BarFasSec, BarFasTip, BarFasCR, BarMaqPlan, BarFasMtT, BarFasKgT, FasQuiUl, BarFasGral, BarFasUsu, BarFasFPl, BarFasPrp, BarFasAgr, FasCod, BarFasPPr, BarFasKPr, BarFasDTF, BarFasDTI, BarFasInc, BarFasAcab, BarUltNlot, BarFasCara, BarFasPzas, BarNPzas, BarFasCoP, BarFasFor, BarNumBot, BarFasBot, BarFasMtr, BarFasKgm, BarLoc, BarFecRIni, BarTieRea, BarHorFin, BarHorIni, BarUni, BarTieTeo, BarFecRea, BarFecTeo, BarFacTin, MaqCodBis, BarFasEst, BarFasCon, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00698", "INSERT INTO TXPBARFAS(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, BarFasEst, MaqCodBis, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarLoc, BarFasKgm, BarFasMtr, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarNPzas, BarFasPzas, BarFasCara, BarUltNlot, BarFasAcab, BarFasInc, BarFasDTI, BarFasDTF, BarFasKPr, BarFasPPr, FasCod, BarFasAgr, BarFasPrp, BarFasFPl, BarFasUsu, BarFasGral, FasQuiUl, BarFasKgT, BarFasMtT, BarMaqPlan, BarFasCR, BarFasTip, BarFasSec, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasPri, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P00699", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P006910", "DELETE FROM TXPBARPRO  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
         ,new ForEachCursor("P006911", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieVtx, BarPieMq, BarPieTurn, BarPieST, BarPieLote, BarPieEmp, BarPieDest, BarPieOpe, BarPieSecu, BarPieTono, BarPieEncC, BarPieCoCN, BarPieCoCI, BarPieCliN, BarPieCliI, BarPieArtD, BarPieArtI, BarPieColN, BarPieColD, BarPieUltD, BarPieFep, BarPieUsu, BarPieFdv, BarPieCLd, BarPieOrd, BarUniB, BarTara, BarPieObs, BarPiePda, BarPieAncc, BarNPes, BarPz2, BarPz1, BarPieK2, BarPieK1, PzaB80, CodBarPz, BapieObs, BarPieIdPz, BarPieImp, BarPieAut, BarMtsAut, BarKgsAut, BarPieLoc, BarPieAnc, BarPiePie, BarPieLzd, PieOriCod, BarPConTro, BarMetLan, BarKilLan, BarPieEst, BarPieMet, BarPieKil, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P006912", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P006913", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P006914", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((String[]) buf[19])[0] = rslt.getString(20, 10);
               ((String[]) buf[20])[0] = rslt.getString(21, 10);
               ((short[]) buf[21])[0] = rslt.getShort(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((short[]) buf[24])[0] = rslt.getShort(25);
               ((short[]) buf[25])[0] = rslt.getShort(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 4);
               ((short[]) buf[27])[0] = rslt.getShort(28);
               ((String[]) buf[28])[0] = rslt.getString(29, 4);
               ((short[]) buf[29])[0] = rslt.getShort(30);
               ((String[]) buf[30])[0] = rslt.getString(31, 4);
               ((short[]) buf[31])[0] = rslt.getShort(32);
               ((String[]) buf[32])[0] = rslt.getString(33, 4);
               ((short[]) buf[33])[0] = rslt.getShort(34);
               ((String[]) buf[34])[0] = rslt.getString(35, 4);
               ((short[]) buf[35])[0] = rslt.getShort(36);
               ((String[]) buf[36])[0] = rslt.getString(37, 4);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(38,2);
               ((String[]) buf[38])[0] = rslt.getString(39, 16);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(40,1);
               ((byte[]) buf[40])[0] = rslt.getByte(41);
               ((java.util.Date[]) buf[41])[0] = rslt.getGXDate(42);
               ((byte[]) buf[42])[0] = rslt.getByte(43);
               ((String[]) buf[43])[0] = rslt.getString(44, 6);
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDate(45);
               ((byte[]) buf[45])[0] = rslt.getByte(46);
               ((short[]) buf[46])[0] = rslt.getShort(47);
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDate(48);
               ((byte[]) buf[48])[0] = rslt.getByte(49);
               ((String[]) buf[49])[0] = rslt.getString(50, 1);
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(51,2);
               ((java.util.Date[]) buf[51])[0] = rslt.getGXDate(52);
               ((byte[]) buf[52])[0] = rslt.getByte(53);
               ((int[]) buf[53])[0] = rslt.getInt(54);
               ((String[]) buf[54])[0] = rslt.getString(55, 13);
               ((short[]) buf[55])[0] = rslt.getShort(56);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(57, 16);
               ((String[]) buf[58])[0] = rslt.getString(58, 8);
               ((int[]) buf[59])[0] = rslt.getInt(59);
               ((int[]) buf[60])[0] = rslt.getInt(60);
               ((String[]) buf[61])[0] = rslt.getString(61, 6);
               ((String[]) buf[62])[0] = rslt.getString(62, 1);
               ((byte[]) buf[63])[0] = rslt.getByte(63);
               ((int[]) buf[64])[0] = rslt.getInt(64);
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(65,2);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(66,2);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((short[]) buf[69])[0] = rslt.getShort(67);
               ((byte[]) buf[70])[0] = rslt.getByte(68);
               ((String[]) buf[71])[0] = rslt.getString(69, 1);
               ((byte[]) buf[72])[0] = rslt.getByte(70);
               ((String[]) buf[73])[0] = rslt.getString(71, 1);
               ((byte[]) buf[74])[0] = rslt.getByte(72);
               ((byte[]) buf[75])[0] = rslt.getByte(73);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((int[]) buf[77])[0] = rslt.getInt(74);
               ((String[]) buf[78])[0] = rslt.getString(75, 16);
               ((java.util.Date[]) buf[79])[0] = rslt.getGXDate(76);
               ((java.util.Date[]) buf[80])[0] = rslt.getGXDate(77);
               ((String[]) buf[81])[0] = rslt.getString(78, 1);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(79, 20);
               ((String[]) buf[84])[0] = rslt.getString(80, 1);
               ((String[]) buf[85])[0] = rslt.getString(81, 1);
               ((int[]) buf[86])[0] = rslt.getInt(82);
               ((String[]) buf[87])[0] = rslt.getString(83, 10);
               ((short[]) buf[88])[0] = rslt.getShort(84);
               ((short[]) buf[89])[0] = rslt.getShort(85);
               ((String[]) buf[90])[0] = rslt.getString(86, 1);
               ((short[]) buf[91])[0] = rslt.getShort(87);
               ((short[]) buf[92])[0] = rslt.getShort(88);
               ((short[]) buf[93])[0] = rslt.getShort(89);
               ((short[]) buf[94])[0] = rslt.getShort(90);
               ((short[]) buf[95])[0] = rslt.getShort(91);
               ((short[]) buf[96])[0] = rslt.getShort(92);
               ((String[]) buf[97])[0] = rslt.getString(93, 30);
               ((String[]) buf[98])[0] = rslt.getString(94, 1);
               ((java.math.BigDecimal[]) buf[99])[0] = rslt.getBigDecimal(95,2);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((byte[]) buf[101])[0] = rslt.getByte(96);
               ((String[]) buf[102])[0] = rslt.getString(97, 8);
               ((java.math.BigDecimal[]) buf[103])[0] = rslt.getBigDecimal(98,2);
               ((java.math.BigDecimal[]) buf[104])[0] = rslt.getBigDecimal(99,2);
               ((int[]) buf[105])[0] = rslt.getInt(100);
               ((short[]) buf[106])[0] = rslt.getShort(101);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getString(102, 4);
               ((byte[]) buf[109])[0] = rslt.getByte(103);
               ((short[]) buf[110])[0] = rslt.getShort(104);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((byte[]) buf[112])[0] = rslt.getByte(105);
               ((String[]) buf[113])[0] = rslt.getString(106, 4);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((int[]) buf[115])[0] = rslt.getInt(107);
               ((int[]) buf[116])[0] = rslt.getInt(108);
               ((int[]) buf[117])[0] = rslt.getInt(109);
               ((java.util.Date[]) buf[118])[0] = rslt.getGXDate(110);
               ((java.util.Date[]) buf[119])[0] = rslt.getGXDate(111);
               ((String[]) buf[120])[0] = rslt.getString(112, 1);
               ((String[]) buf[121])[0] = rslt.getString(113, 1);
               ((String[]) buf[122])[0] = rslt.getString(114, 1);
               ((String[]) buf[123])[0] = rslt.getString(115, 1);
               ((java.math.BigDecimal[]) buf[124])[0] = rslt.getBigDecimal(116,2);
               ((java.math.BigDecimal[]) buf[125])[0] = rslt.getBigDecimal(117,2);
               ((short[]) buf[126])[0] = rslt.getShort(118);
               ((short[]) buf[127])[0] = rslt.getShort(119);
               ((boolean[]) buf[128])[0] = rslt.wasNull();
               ((String[]) buf[129])[0] = rslt.getString(120, 20);
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((String[]) buf[131])[0] = rslt.getString(121, 20);
               ((boolean[]) buf[132])[0] = rslt.wasNull();
               ((short[]) buf[133])[0] = rslt.getShort(122);
               ((short[]) buf[134])[0] = rslt.getShort(123);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getString(124, 20);
               ((String[]) buf[137])[0] = rslt.getString(125, 1);
               ((java.math.BigDecimal[]) buf[138])[0] = rslt.getBigDecimal(126,2);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((short[]) buf[140])[0] = rslt.getShort(127);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[142])[0] = rslt.getGXDate(128);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((short[]) buf[144])[0] = rslt.getShort(129);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((String[]) buf[146])[0] = rslt.getString(130, 30);
               ((java.math.BigDecimal[]) buf[147])[0] = rslt.getBigDecimal(131,2);
               ((boolean[]) buf[148])[0] = rslt.wasNull();
               ((short[]) buf[149])[0] = rslt.getShort(132);
               ((boolean[]) buf[150])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[151])[0] = rslt.getGXDate(133);
               ((byte[]) buf[152])[0] = rslt.getByte(134);
               ((boolean[]) buf[153])[0] = rslt.wasNull();
               ((short[]) buf[154])[0] = rslt.getShort(135);
               ((int[]) buf[155])[0] = rslt.getInt(136);
               ((byte[]) buf[156])[0] = rslt.getByte(137);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((String[]) buf[158])[0] = rslt.getString(138, 1);
               ((int[]) buf[159])[0] = rslt.getInt(139);
               ((String[]) buf[160])[0] = rslt.getString(140, 10);
               ((byte[]) buf[161])[0] = rslt.getByte(141);
               ((String[]) buf[162])[0] = rslt.getString(142, 26);
               ((short[]) buf[163])[0] = rslt.getShort(143);
               ((String[]) buf[164])[0] = rslt.getString(144, 10);
               ((String[]) buf[165])[0] = rslt.getString(145, 10);
               ((String[]) buf[166])[0] = rslt.getString(146, 10);
               ((byte[]) buf[167])[0] = rslt.getByte(147);
               ((int[]) buf[168])[0] = rslt.getInt(148);
               ((String[]) buf[169])[0] = rslt.getString(149, 13);
               ((short[]) buf[170])[0] = rslt.getShort(150);
               ((java.math.BigDecimal[]) buf[171])[0] = rslt.getBigDecimal(151,2);
               ((java.math.BigDecimal[]) buf[172])[0] = rslt.getBigDecimal(152,2);
               ((short[]) buf[173])[0] = rslt.getShort(153);
               ((java.util.Date[]) buf[174])[0] = rslt.getGXDate(154);
               ((boolean[]) buf[175])[0] = rslt.wasNull();
               ((String[]) buf[176])[0] = rslt.getString(155, 1);
               ((byte[]) buf[177])[0] = rslt.getByte(156);
               ((int[]) buf[178])[0] = rslt.getInt(157);
               ((byte[]) buf[179])[0] = rslt.getByte(158);
               ((boolean[]) buf[180])[0] = rslt.wasNull();
               ((String[]) buf[181])[0] = rslt.getString(159, 40);
               ((boolean[]) buf[182])[0] = rslt.wasNull();
               ((short[]) buf[183])[0] = rslt.getShort(160);
               ((boolean[]) buf[184])[0] = rslt.wasNull();
               ((short[]) buf[185])[0] = rslt.getShort(161);
               ((boolean[]) buf[186])[0] = rslt.wasNull();
               ((short[]) buf[187])[0] = rslt.getShort(162);
               ((byte[]) buf[188])[0] = rslt.getByte(163);
               ((boolean[]) buf[189])[0] = rslt.wasNull();
               ((byte[]) buf[190])[0] = rslt.getByte(164);
               ((String[]) buf[191])[0] = rslt.getString(165, 3);
               ((String[]) buf[192])[0] = rslt.getString(166, 1);
               ((String[]) buf[193])[0] = rslt.getString(167, 1);
               ((int[]) buf[194])[0] = rslt.getInt(168);
               ((boolean[]) buf[195])[0] = rslt.wasNull();
               ((byte[]) buf[196])[0] = rslt.getByte(169);
               ((String[]) buf[197])[0] = rslt.getVarchar(170);
               ((String[]) buf[198])[0] = rslt.getString(171, 4);
               ((boolean[]) buf[199])[0] = rslt.wasNull();
               ((String[]) buf[200])[0] = rslt.getVarchar(172);
               ((boolean[]) buf[201])[0] = rslt.wasNull();
               ((short[]) buf[202])[0] = rslt.getShort(173);
               ((boolean[]) buf[203])[0] = rslt.wasNull();
               ((long[]) buf[204])[0] = rslt.getLong(174);
               ((byte[]) buf[205])[0] = rslt.getByte(175);
               ((boolean[]) buf[206])[0] = rslt.wasNull();
               ((String[]) buf[207])[0] = rslt.getString(176, 4);
               ((int[]) buf[208])[0] = rslt.getInt(177);
               ((short[]) buf[209])[0] = rslt.getShort(178);
               ((String[]) buf[210])[0] = rslt.getString(179, 1);
               ((boolean[]) buf[211])[0] = rslt.wasNull();
               ((String[]) buf[212])[0] = rslt.getString(180, 10);
               ((String[]) buf[213])[0] = rslt.getString(181, 10);
               ((String[]) buf[214])[0] = rslt.getString(182, 10);
               ((String[]) buf[215])[0] = rslt.getString(183, 6);
               ((byte[]) buf[216])[0] = rslt.getByte(184);
               ((String[]) buf[217])[0] = rslt.getString(185, 10);
               ((boolean[]) buf[218])[0] = rslt.wasNull();
               ((short[]) buf[219])[0] = rslt.getShort(186);
               ((boolean[]) buf[220])[0] = rslt.wasNull();
               ((short[]) buf[221])[0] = rslt.getShort(187);
               ((boolean[]) buf[222])[0] = rslt.wasNull();
               ((short[]) buf[223])[0] = rslt.getShort(188);
               ((boolean[]) buf[224])[0] = rslt.wasNull();
               ((String[]) buf[225])[0] = rslt.getString(189, 30);
               ((String[]) buf[226])[0] = rslt.getString(190, 4);
               ((String[]) buf[227])[0] = rslt.getString(191, 30);
               ((String[]) buf[228])[0] = rslt.getString(192, 1);
               ((java.math.BigDecimal[]) buf[229])[0] = rslt.getBigDecimal(193,2);
               ((java.math.BigDecimal[]) buf[230])[0] = rslt.getBigDecimal(194,2);
               ((short[]) buf[231])[0] = rslt.getShort(195);
               ((java.math.BigDecimal[]) buf[232])[0] = rslt.getBigDecimal(196,2);
               ((java.math.BigDecimal[]) buf[233])[0] = rslt.getBigDecimal(197,2);
               ((String[]) buf[234])[0] = rslt.getString(198, 1);
               ((short[]) buf[235])[0] = rslt.getShort(199);
               ((short[]) buf[236])[0] = rslt.getShort(200);
               ((byte[]) buf[237])[0] = rslt.getByte(201);
               ((java.math.BigDecimal[]) buf[238])[0] = rslt.getBigDecimal(202,2);
               ((int[]) buf[239])[0] = rslt.getInt(203);
               ((String[]) buf[240])[0] = rslt.getString(204, 6);
               ((byte[]) buf[241])[0] = rslt.getByte(205);
               ((String[]) buf[242])[0] = rslt.getVarchar(206);
               ((short[]) buf[243])[0] = rslt.getShort(207);
               ((boolean[]) buf[244])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[245])[0] = rslt.getBigDecimal(208,2);
               ((boolean[]) buf[246])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[247])[0] = rslt.getBigDecimal(209,2);
               ((boolean[]) buf[248])[0] = rslt.wasNull();
               ((short[]) buf[249])[0] = rslt.getShort(210);
               ((boolean[]) buf[250])[0] = rslt.wasNull();
               ((String[]) buf[251])[0] = rslt.getString(211, 30);
               ((boolean[]) buf[252])[0] = rslt.wasNull();
               ((String[]) buf[253])[0] = rslt.getString(212, 30);
               ((boolean[]) buf[254])[0] = rslt.wasNull();
               ((int[]) buf[255])[0] = rslt.getInt(213);
               ((boolean[]) buf[256])[0] = rslt.wasNull();
               ((byte[]) buf[257])[0] = rslt.getByte(214);
               ((boolean[]) buf[258])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[259])[0] = rslt.getGXDate(215);
               ((boolean[]) buf[260])[0] = rslt.wasNull();
               ((String[]) buf[261])[0] = rslt.getString(216, 20);
               ((String[]) buf[262])[0] = rslt.getString(217, 20);
               ((String[]) buf[263])[0] = rslt.getString(218, 20);
               ((String[]) buf[264])[0] = rslt.getString(219, 20);
               ((String[]) buf[265])[0] = rslt.getString(220, 20);
               ((String[]) buf[266])[0] = rslt.getString(221, 20);
               ((int[]) buf[267])[0] = rslt.getInt(222);
               ((boolean[]) buf[268])[0] = rslt.wasNull();
               ((int[]) buf[269])[0] = rslt.getInt(223);
               ((java.util.Date[]) buf[270])[0] = rslt.getGXDateTime(224);
               ((String[]) buf[271])[0] = rslt.getString(225, 6);
               ((byte[]) buf[272])[0] = rslt.getByte(226);
               ((String[]) buf[273])[0] = rslt.getString(227, 1);
               ((String[]) buf[274])[0] = rslt.getString(228, 1);
               ((String[]) buf[275])[0] = rslt.getString(229, 20);
               ((String[]) buf[276])[0] = rslt.getString(230, 20);
               ((String[]) buf[277])[0] = rslt.getString(231, 15);
               ((String[]) buf[278])[0] = rslt.getString(232, 2);
               ((String[]) buf[279])[0] = rslt.getString(233, 1);
               ((java.math.BigDecimal[]) buf[280])[0] = rslt.getBigDecimal(234,2);
               ((boolean[]) buf[281])[0] = rslt.wasNull();
               ((short[]) buf[282])[0] = rslt.getShort(235);
               ((boolean[]) buf[283])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[284])[0] = rslt.getBigDecimal(236,3);
               ((boolean[]) buf[285])[0] = rslt.wasNull();
               ((short[]) buf[286])[0] = rslt.getShort(237);
               ((boolean[]) buf[287])[0] = rslt.wasNull();
               ((short[]) buf[288])[0] = rslt.getShort(238);
               ((boolean[]) buf[289])[0] = rslt.wasNull();
               ((String[]) buf[290])[0] = rslt.getString(239, 1);
               ((String[]) buf[291])[0] = rslt.getString(240, 12);
               ((byte[]) buf[292])[0] = rslt.getByte(241);
               ((byte[]) buf[293])[0] = rslt.getByte(242);
               ((String[]) buf[294])[0] = rslt.getString(243, 10);
               ((short[]) buf[295])[0] = rslt.getShort(244);
               ((byte[]) buf[296])[0] = rslt.getByte(245);
               ((boolean[]) buf[297])[0] = rslt.wasNull();
               ((String[]) buf[298])[0] = rslt.getString(246, 6);
               ((String[]) buf[299])[0] = rslt.getVarchar(247);
               ((boolean[]) buf[300])[0] = rslt.wasNull();
               ((int[]) buf[301])[0] = rslt.getInt(248);
               ((String[]) buf[302])[0] = rslt.getString(249, 20);
               ((String[]) buf[303])[0] = rslt.getString(250, 12);
               ((java.util.Date[]) buf[304])[0] = GXutil.resetDate(rslt.getGXDateTime(251));
               ((boolean[]) buf[305])[0] = rslt.wasNull();
               ((int[]) buf[306])[0] = rslt.getInt(252);
               ((boolean[]) buf[307])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[308])[0] = GXutil.resetDate(rslt.getGXDateTime(253));
               ((boolean[]) buf[309])[0] = rslt.wasNull();
               ((String[]) buf[310])[0] = rslt.getString(254, 4);
               ((String[]) buf[311])[0] = rslt.getString(255, 13);
               ((String[]) buf[312])[0] = rslt.getString(256, 1);
               ((short[]) buf[313])[0] = rslt.getShort(257);
               ((String[]) buf[314])[0] = rslt.getString(258, 1);
               ((boolean[]) buf[315])[0] = rslt.wasNull();
               ((int[]) buf[316])[0] = rslt.getInt(259);
               ((boolean[]) buf[317])[0] = rslt.wasNull();
               ((String[]) buf[318])[0] = rslt.getString(260, 6);
               ((boolean[]) buf[319])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[320])[0] = rslt.getBigDecimal(261,2);
               ((java.math.BigDecimal[]) buf[321])[0] = rslt.getBigDecimal(262,2);
               ((short[]) buf[322])[0] = rslt.getShort(263);
               ((boolean[]) buf[323])[0] = rslt.wasNull();
               ((String[]) buf[324])[0] = rslt.getString(264, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDateTime(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(18);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(19);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(23);
               ((String[]) buf[40])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(25);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(26);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(27, 11);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(28);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((byte[]) buf[56])[0] = rslt.getByte(32);
               ((short[]) buf[57])[0] = rslt.getShort(33);
               ((String[]) buf[58])[0] = rslt.getString(34, 10);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(35);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(36, 10);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(37, 2);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(39,5);
               ((String[]) buf[69])[0] = rslt.getString(40, 6);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(41,2);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(42,2);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((short[]) buf[75])[0] = rslt.getShort(43);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(44, 1);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(45, 8);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[81])[0] = rslt.getGXDate(46);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(48, 1);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(49, 8);
               ((short[]) buf[88])[0] = rslt.getShort(50);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[90])[0] = rslt.getBigDecimal(51,2);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[92])[0] = rslt.getGXDateTime(52);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[94])[0] = rslt.getGXDateTime(53);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((byte[]) buf[96])[0] = rslt.getByte(54);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getString(55, 1);
               ((int[]) buf[99])[0] = rslt.getInt(56);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(57, 1);
               ((int[]) buf[102])[0] = rslt.getInt(58);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((int[]) buf[104])[0] = rslt.getInt(59);
               ((String[]) buf[105])[0] = rslt.getString(60, 1);
               ((String[]) buf[106])[0] = rslt.getString(61, 1);
               ((int[]) buf[107])[0] = rslt.getInt(62);
               ((String[]) buf[108])[0] = rslt.getString(63, 1);
               ((java.math.BigDecimal[]) buf[109])[0] = rslt.getBigDecimal(64,2);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[111])[0] = rslt.getBigDecimal(65,2);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getString(66, 10);
               ((java.util.Date[]) buf[114])[0] = rslt.getGXDate(67);
               ((java.math.BigDecimal[]) buf[115])[0] = rslt.getBigDecimal(68,2);
               ((short[]) buf[116])[0] = rslt.getShort(69);
               ((short[]) buf[117])[0] = rslt.getShort(70);
               ((java.math.BigDecimal[]) buf[118])[0] = rslt.getBigDecimal(71,2);
               ((java.math.BigDecimal[]) buf[119])[0] = rslt.getBigDecimal(72,2);
               ((java.util.Date[]) buf[120])[0] = rslt.getGXDate(73);
               ((java.util.Date[]) buf[121])[0] = rslt.getGXDate(74);
               ((String[]) buf[122])[0] = rslt.getString(75, 1);
               ((String[]) buf[123])[0] = rslt.getString(76, 6);
               ((byte[]) buf[124])[0] = rslt.getByte(77);
               ((String[]) buf[125])[0] = rslt.getString(78, 1);
               ((short[]) buf[126])[0] = rslt.getShort(79);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 13);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 60);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(19);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(20, 26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(21, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(23, 13);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(24);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDate(25);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(26, 10);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDate(27);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(28);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(29);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(32, 60);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(34);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((byte[]) buf[63])[0] = rslt.getByte(35);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((int[]) buf[65])[0] = rslt.getInt(36);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((int[]) buf[67])[0] = rslt.getInt(37);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(40, 9);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(41, 20);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(42, 40);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(43, 15);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(44, 1);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(45);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[85])[0] = rslt.getBigDecimal(46,2);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[87])[0] = rslt.getBigDecimal(47,2);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(48, 10);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((short[]) buf[91])[0] = rslt.getShort(49);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((int[]) buf[93])[0] = rslt.getInt(50);
               ((int[]) buf[94])[0] = rslt.getInt(51);
               ((String[]) buf[95])[0] = rslt.getString(52, 9);
               ((short[]) buf[96])[0] = rslt.getShort(53);
               ((java.math.BigDecimal[]) buf[97])[0] = rslt.getBigDecimal(54,2);
               ((java.math.BigDecimal[]) buf[98])[0] = rslt.getBigDecimal(55,2);
               ((byte[]) buf[99])[0] = rslt.getByte(56);
               ((java.math.BigDecimal[]) buf[100])[0] = rslt.getBigDecimal(57,2);
               ((java.math.BigDecimal[]) buf[101])[0] = rslt.getBigDecimal(58,2);
               ((int[]) buf[102])[0] = rslt.getInt(59);
               ((String[]) buf[103])[0] = rslt.getString(60, 9);
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
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 8);
               stmt.setString(10, (String)parms[9], 16);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[11]).shortValue());
               }
               stmt.setString(12, (String)parms[12], 13);
               stmt.setInt(13, ((Number) parms[13]).intValue());
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               stmt.setDate(15, (java.util.Date)parms[15]);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[16], 2);
               stmt.setString(17, (String)parms[17], 1);
               stmt.setByte(18, ((Number) parms[18]).byteValue());
               stmt.setDate(19, (java.util.Date)parms[19]);
               stmt.setShort(20, ((Number) parms[20]).shortValue());
               stmt.setByte(21, ((Number) parms[21]).byteValue());
               stmt.setDate(22, (java.util.Date)parms[22]);
               stmt.setString(23, (String)parms[23], 6);
               stmt.setByte(24, ((Number) parms[24]).byteValue());
               stmt.setDate(25, (java.util.Date)parms[25]);
               stmt.setByte(26, ((Number) parms[26]).byteValue());
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[27], 1);
               stmt.setString(28, (String)parms[28], 16);
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[29], 2);
               stmt.setString(30, (String)parms[30], 4);
               stmt.setShort(31, ((Number) parms[31]).shortValue());
               stmt.setString(32, (String)parms[32], 4);
               stmt.setShort(33, ((Number) parms[33]).shortValue());
               stmt.setString(34, (String)parms[34], 4);
               stmt.setShort(35, ((Number) parms[35]).shortValue());
               stmt.setString(36, (String)parms[36], 4);
               stmt.setShort(37, ((Number) parms[37]).shortValue());
               stmt.setString(38, (String)parms[38], 4);
               stmt.setShort(39, ((Number) parms[39]).shortValue());
               stmt.setString(40, (String)parms[40], 4);
               stmt.setShort(41, ((Number) parms[41]).shortValue());
               stmt.setShort(42, ((Number) parms[42]).shortValue());
               stmt.setShort(43, ((Number) parms[43]).shortValue());
               stmt.setShort(44, ((Number) parms[44]).shortValue());
               stmt.setShort(45, ((Number) parms[45]).shortValue());
               stmt.setString(46, (String)parms[46], 10);
               stmt.setString(47, (String)parms[47], 10);
               stmt.setString(48, (String)parms[48], 6);
               stmt.setString(49, (String)parms[49], 6);
               stmt.setString(50, (String)parms[50], 1);
               stmt.setString(51, (String)parms[51], 1);
               stmt.setByte(52, ((Number) parms[52]).byteValue());
               stmt.setByte(53, ((Number) parms[53]).byteValue());
               stmt.setString(54, (String)parms[54], 1);
               stmt.setByte(55, ((Number) parms[55]).byteValue());
               stmt.setString(56, (String)parms[56], 1);
               stmt.setShort(57, ((Number) parms[57]).shortValue());
               stmt.setBigDecimal(58, (java.math.BigDecimal)parms[58], 2);
               stmt.setBigDecimal(59, (java.math.BigDecimal)parms[59], 2);
               stmt.setBigDecimal(60, (java.math.BigDecimal)parms[60], 2);
               stmt.setInt(61, ((Number) parms[61]).intValue());
               stmt.setDate(62, (java.util.Date)parms[62]);
               stmt.setByte(63, ((Number) parms[63]).byteValue());
               stmt.setByte(64, ((Number) parms[64]).byteValue());
               stmt.setByte(65, ((Number) parms[65]).byteValue());
               stmt.setInt(66, ((Number) parms[66]).intValue());
               stmt.setByte(67, ((Number) parms[67]).byteValue());
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(68, ((Number) parms[69]).byteValue());
               }
               stmt.setShort(69, ((Number) parms[70]).shortValue());
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(70, ((Number) parms[72]).shortValue());
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(71, ((Number) parms[74]).shortValue());
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(72, (String)parms[76], 40);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(73, ((Number) parms[78]).byteValue());
               }
               stmt.setInt(74, ((Number) parms[79]).intValue());
               stmt.setByte(75, ((Number) parms[80]).byteValue());
               stmt.setString(76, (String)parms[81], 1);
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.DATE );
               }
               else
               {
                  stmt.setDate(77, (java.util.Date)parms[83]);
               }
               stmt.setShort(78, ((Number) parms[84]).shortValue());
               stmt.setBigDecimal(79, (java.math.BigDecimal)parms[85], 2);
               stmt.setBigDecimal(80, (java.math.BigDecimal)parms[86], 2);
               stmt.setShort(81, ((Number) parms[87]).shortValue());
               stmt.setString(82, (String)parms[88], 13);
               stmt.setInt(83, ((Number) parms[89]).intValue());
               stmt.setByte(84, ((Number) parms[90]).byteValue());
               stmt.setString(85, (String)parms[91], 10);
               stmt.setString(86, (String)parms[92], 10);
               stmt.setString(87, (String)parms[93], 10);
               stmt.setShort(88, ((Number) parms[94]).shortValue());
               stmt.setString(89, (String)parms[95], 26);
               stmt.setByte(90, ((Number) parms[96]).byteValue());
               stmt.setString(91, (String)parms[97], 10);
               stmt.setInt(92, ((Number) parms[98]).intValue());
               stmt.setString(93, (String)parms[99], 1);
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(94, ((Number) parms[101]).byteValue());
               }
               stmt.setInt(95, ((Number) parms[102]).intValue());
               stmt.setShort(96, ((Number) parms[103]).shortValue());
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(97, ((Number) parms[105]).byteValue());
               }
               stmt.setDate(98, (java.util.Date)parms[106]);
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(99, ((Number) parms[108]).shortValue());
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(100, (java.math.BigDecimal)parms[110], 2);
               }
               stmt.setString(101, (String)parms[111], 30);
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 102 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(102, ((Number) parms[113]).shortValue());
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 103 , Types.DATE );
               }
               else
               {
                  stmt.setDate(103, (java.util.Date)parms[115]);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 104 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(104, ((Number) parms[117]).shortValue());
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 105 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(105, (java.math.BigDecimal)parms[119], 2);
               }
               stmt.setString(106, (String)parms[120], 1);
               stmt.setString(107, (String)parms[121], 20);
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 108 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(108, ((Number) parms[123]).shortValue());
               }
               stmt.setShort(109, ((Number) parms[124]).shortValue());
               if ( ((Boolean) parms[125]).booleanValue() )
               {
                  stmt.setNull( 110 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(110, (String)parms[126], 20);
               }
               if ( ((Boolean) parms[127]).booleanValue() )
               {
                  stmt.setNull( 111 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(111, (String)parms[128], 20);
               }
               if ( ((Boolean) parms[129]).booleanValue() )
               {
                  stmt.setNull( 112 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(112, ((Number) parms[130]).shortValue());
               }
               stmt.setShort(113, ((Number) parms[131]).shortValue());
               stmt.setBigDecimal(114, (java.math.BigDecimal)parms[132], 2);
               stmt.setBigDecimal(115, (java.math.BigDecimal)parms[133], 2);
               stmt.setString(116, (String)parms[134], 1);
               stmt.setString(117, (String)parms[135], 1);
               stmt.setString(118, (String)parms[136], 1);
               stmt.setString(119, (String)parms[137], 1);
               stmt.setDate(120, (java.util.Date)parms[138]);
               stmt.setDate(121, (java.util.Date)parms[139]);
               stmt.setInt(122, ((Number) parms[140]).intValue());
               stmt.setInt(123, ((Number) parms[141]).intValue());
               stmt.setInt(124, ((Number) parms[142]).intValue());
               if ( ((Boolean) parms[143]).booleanValue() )
               {
                  stmt.setNull( 125 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(125, (String)parms[144], 4);
               }
               stmt.setByte(126, ((Number) parms[145]).byteValue());
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 127 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(127, ((Number) parms[147]).shortValue());
               }
               stmt.setByte(128, ((Number) parms[148]).byteValue());
               stmt.setString(129, (String)parms[149], 4);
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 130 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(130, ((Number) parms[151]).shortValue());
               }
               stmt.setInt(131, ((Number) parms[152]).intValue());
               stmt.setBigDecimal(132, (java.math.BigDecimal)parms[153], 2);
               stmt.setBigDecimal(133, (java.math.BigDecimal)parms[154], 2);
               stmt.setString(134, (String)parms[155], 8);
               stmt.setByte(135, ((Number) parms[156]).byteValue());
               if ( ((Boolean) parms[157]).booleanValue() )
               {
                  stmt.setNull( 136 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(136, (java.math.BigDecimal)parms[158], 2);
               }
               stmt.setString(137, (String)parms[159], 1);
               stmt.setString(138, (String)parms[160], 30);
               stmt.setShort(139, ((Number) parms[161]).shortValue());
               stmt.setShort(140, ((Number) parms[162]).shortValue());
               stmt.setShort(141, ((Number) parms[163]).shortValue());
               stmt.setShort(142, ((Number) parms[164]).shortValue());
               stmt.setShort(143, ((Number) parms[165]).shortValue());
               stmt.setShort(144, ((Number) parms[166]).shortValue());
               stmt.setString(145, (String)parms[167], 1);
               stmt.setShort(146, ((Number) parms[168]).shortValue());
               stmt.setShort(147, ((Number) parms[169]).shortValue());
               stmt.setString(148, (String)parms[170], 10);
               stmt.setInt(149, ((Number) parms[171]).intValue());
               stmt.setString(150, (String)parms[172], 1);
               stmt.setString(151, (String)parms[173], 1);
               stmt.setString(152, (String)parms[174], 20);
               if ( ((Boolean) parms[175]).booleanValue() )
               {
                  stmt.setNull( 153 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(153, (String)parms[176], 1);
               }
               stmt.setDate(154, (java.util.Date)parms[177]);
               stmt.setDate(155, (java.util.Date)parms[178]);
               stmt.setString(156, (String)parms[179], 16);
               stmt.setInt(157, ((Number) parms[180]).intValue());
               if ( ((Boolean) parms[181]).booleanValue() )
               {
                  stmt.setNull( 158 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(158, ((Number) parms[182]).byteValue());
               }
               stmt.setByte(159, ((Number) parms[183]).byteValue());
               stmt.setString(160, (String)parms[184], 1);
               stmt.setByte(161, ((Number) parms[185]).byteValue());
               stmt.setString(162, (String)parms[186], 1);
               stmt.setByte(163, ((Number) parms[187]).byteValue());
               stmt.setShort(164, ((Number) parms[188]).shortValue());
               if ( ((Boolean) parms[189]).booleanValue() )
               {
                  stmt.setNull( 165 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(165, (java.math.BigDecimal)parms[190], 2);
               }
               if ( ((Boolean) parms[191]).booleanValue() )
               {
                  stmt.setNull( 166 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(166, (java.math.BigDecimal)parms[192], 2);
               }
               stmt.setString(167, (String)parms[193], 1);
               if ( ((Boolean) parms[194]).booleanValue() )
               {
                  stmt.setNull( 168 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(168, ((Number) parms[195]).shortValue());
               }
               stmt.setBigDecimal(169, (java.math.BigDecimal)parms[196], 2);
               stmt.setBigDecimal(170, (java.math.BigDecimal)parms[197], 2);
               if ( ((Boolean) parms[198]).booleanValue() )
               {
                  stmt.setNull( 171 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(171, (String)parms[199], 6);
               }
               if ( ((Boolean) parms[200]).booleanValue() )
               {
                  stmt.setNull( 172 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(172, ((Number) parms[201]).intValue());
               }
               if ( ((Boolean) parms[202]).booleanValue() )
               {
                  stmt.setNull( 173 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(173, (String)parms[203], 1);
               }
               stmt.setShort(174, ((Number) parms[204]).shortValue());
               stmt.setString(175, (String)parms[205], 1);
               stmt.setString(176, (String)parms[206], 13);
               stmt.setString(177, (String)parms[207], 4);
               if ( ((Boolean) parms[208]).booleanValue() )
               {
                  stmt.setNull( 178 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(178, (java.util.Date)parms[209], true);
               }
               if ( ((Boolean) parms[210]).booleanValue() )
               {
                  stmt.setNull( 179 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(179, ((Number) parms[211]).intValue());
               }
               if ( ((Boolean) parms[212]).booleanValue() )
               {
                  stmt.setNull( 180 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(180, (java.util.Date)parms[213], true);
               }
               stmt.setString(181, (String)parms[214], 12);
               stmt.setString(182, (String)parms[215], 20);
               stmt.setInt(183, ((Number) parms[216]).intValue());
               if ( ((Boolean) parms[217]).booleanValue() )
               {
                  stmt.setNull( 184 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(184, (String)parms[218], 400);
               }
               stmt.setString(185, (String)parms[219], 6);
               if ( ((Boolean) parms[220]).booleanValue() )
               {
                  stmt.setNull( 186 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(186, ((Number) parms[221]).byteValue());
               }
               stmt.setShort(187, ((Number) parms[222]).shortValue());
               stmt.setString(188, (String)parms[223], 10);
               stmt.setByte(189, ((Number) parms[224]).byteValue());
               stmt.setByte(190, ((Number) parms[225]).byteValue());
               stmt.setString(191, (String)parms[226], 12);
               stmt.setString(192, (String)parms[227], 1);
               if ( ((Boolean) parms[228]).booleanValue() )
               {
                  stmt.setNull( 193 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(193, ((Number) parms[229]).shortValue());
               }
               if ( ((Boolean) parms[230]).booleanValue() )
               {
                  stmt.setNull( 194 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(194, ((Number) parms[231]).shortValue());
               }
               if ( ((Boolean) parms[232]).booleanValue() )
               {
                  stmt.setNull( 195 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(195, (java.math.BigDecimal)parms[233], 3);
               }
               if ( ((Boolean) parms[234]).booleanValue() )
               {
                  stmt.setNull( 196 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(196, ((Number) parms[235]).shortValue());
               }
               if ( ((Boolean) parms[236]).booleanValue() )
               {
                  stmt.setNull( 197 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(197, (java.math.BigDecimal)parms[237], 2);
               }
               stmt.setString(198, (String)parms[238], 1);
               stmt.setString(199, (String)parms[239], 2);
               stmt.setString(200, (String)parms[240], 15);
               stmt.setString(201, (String)parms[241], 20);
               stmt.setString(202, (String)parms[242], 20);
               stmt.setString(203, (String)parms[243], 1);
               stmt.setString(204, (String)parms[244], 1);
               stmt.setByte(205, ((Number) parms[245]).byteValue());
               stmt.setString(206, (String)parms[246], 6);
               stmt.setDateTime(207, (java.util.Date)parms[247], false);
               stmt.setInt(208, ((Number) parms[248]).intValue());
               if ( ((Boolean) parms[249]).booleanValue() )
               {
                  stmt.setNull( 209 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(209, ((Number) parms[250]).intValue());
               }
               stmt.setString(210, (String)parms[251], 20);
               stmt.setString(211, (String)parms[252], 20);
               stmt.setString(212, (String)parms[253], 20);
               stmt.setString(213, (String)parms[254], 20);
               stmt.setString(214, (String)parms[255], 20);
               stmt.setString(215, (String)parms[256], 20);
               if ( ((Boolean) parms[257]).booleanValue() )
               {
                  stmt.setNull( 216 , Types.DATE );
               }
               else
               {
                  stmt.setDate(216, (java.util.Date)parms[258]);
               }
               if ( ((Boolean) parms[259]).booleanValue() )
               {
                  stmt.setNull( 217 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(217, ((Number) parms[260]).byteValue());
               }
               if ( ((Boolean) parms[261]).booleanValue() )
               {
                  stmt.setNull( 218 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(218, ((Number) parms[262]).intValue());
               }
               if ( ((Boolean) parms[263]).booleanValue() )
               {
                  stmt.setNull( 219 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(219, (String)parms[264], 30);
               }
               if ( ((Boolean) parms[265]).booleanValue() )
               {
                  stmt.setNull( 220 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(220, (String)parms[266], 30);
               }
               if ( ((Boolean) parms[267]).booleanValue() )
               {
                  stmt.setNull( 221 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(221, ((Number) parms[268]).shortValue());
               }
               if ( ((Boolean) parms[269]).booleanValue() )
               {
                  stmt.setNull( 222 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(222, (java.math.BigDecimal)parms[270], 2);
               }
               if ( ((Boolean) parms[271]).booleanValue() )
               {
                  stmt.setNull( 223 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(223, (java.math.BigDecimal)parms[272], 2);
               }
               if ( ((Boolean) parms[273]).booleanValue() )
               {
                  stmt.setNull( 224 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(224, ((Number) parms[274]).shortValue());
               }
               stmt.setVarchar(225, (String)parms[275], 200, false);
               stmt.setByte(226, ((Number) parms[276]).byteValue());
               stmt.setString(227, (String)parms[277], 6);
               stmt.setInt(228, ((Number) parms[278]).intValue());
               stmt.setBigDecimal(229, (java.math.BigDecimal)parms[279], 2);
               stmt.setByte(230, ((Number) parms[280]).byteValue());
               stmt.setShort(231, ((Number) parms[281]).shortValue());
               stmt.setShort(232, ((Number) parms[282]).shortValue());
               stmt.setString(233, (String)parms[283], 1);
               stmt.setBigDecimal(234, (java.math.BigDecimal)parms[284], 2);
               stmt.setBigDecimal(235, (java.math.BigDecimal)parms[285], 2);
               stmt.setShort(236, ((Number) parms[286]).shortValue());
               stmt.setBigDecimal(237, (java.math.BigDecimal)parms[287], 2);
               stmt.setBigDecimal(238, (java.math.BigDecimal)parms[288], 2);
               stmt.setString(239, (String)parms[289], 1);
               stmt.setString(240, (String)parms[290], 30);
               stmt.setString(241, (String)parms[291], 4);
               stmt.setString(242, (String)parms[292], 30);
               if ( ((Boolean) parms[293]).booleanValue() )
               {
                  stmt.setNull( 243 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(243, ((Number) parms[294]).shortValue());
               }
               if ( ((Boolean) parms[295]).booleanValue() )
               {
                  stmt.setNull( 244 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(244, ((Number) parms[296]).shortValue());
               }
               if ( ((Boolean) parms[297]).booleanValue() )
               {
                  stmt.setNull( 245 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(245, ((Number) parms[298]).shortValue());
               }
               if ( ((Boolean) parms[299]).booleanValue() )
               {
                  stmt.setNull( 246 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(246, (String)parms[300], 10);
               }
               stmt.setByte(247, ((Number) parms[301]).byteValue());
               stmt.setString(248, (String)parms[302], 6);
               stmt.setString(249, (String)parms[303], 10);
               stmt.setString(250, (String)parms[304], 10);
               stmt.setString(251, (String)parms[305], 10);
               if ( ((Boolean) parms[306]).booleanValue() )
               {
                  stmt.setNull( 252 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(252, (String)parms[307], 1);
               }
               stmt.setShort(253, ((Number) parms[308]).shortValue());
               stmt.setInt(254, ((Number) parms[309]).intValue());
               stmt.setString(255, (String)parms[310], 4);
               if ( ((Boolean) parms[311]).booleanValue() )
               {
                  stmt.setNull( 256 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(256, ((Number) parms[312]).byteValue());
               }
               stmt.setLong(257, ((Number) parms[313]).longValue());
               if ( ((Boolean) parms[314]).booleanValue() )
               {
                  stmt.setNull( 258 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(258, ((Number) parms[315]).shortValue());
               }
               if ( ((Boolean) parms[316]).booleanValue() )
               {
                  stmt.setNull( 259 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(259, (String)parms[317], 60);
               }
               if ( ((Boolean) parms[318]).booleanValue() )
               {
                  stmt.setNull( 260 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(260, (String)parms[319], 4);
               }
               stmt.setVarchar(261, (String)parms[320], 600, false);
               stmt.setByte(262, ((Number) parms[321]).byteValue());
               if ( ((Boolean) parms[322]).booleanValue() )
               {
                  stmt.setNull( 263 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(263, ((Number) parms[323]).intValue());
               }
               stmt.setString(264, (String)parms[324], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 6);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setDate(18, (java.util.Date)parms[17]);
               stmt.setString(19, (String)parms[18], 10);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[22], 2);
               }
               stmt.setString(22, (String)parms[23], 1);
               stmt.setInt(23, ((Number) parms[24]).intValue());
               stmt.setString(24, (String)parms[25], 1);
               stmt.setString(25, (String)parms[26], 1);
               stmt.setInt(26, ((Number) parms[27]).intValue());
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[29]).intValue());
               }
               stmt.setString(28, (String)parms[30], 1);
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[32]).intValue());
               }
               stmt.setString(30, (String)parms[33], 1);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(31, ((Number) parms[35]).byteValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(32, (java.util.Date)parms[37], false);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(33, (java.util.Date)parms[39], false);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[43]).shortValue());
               }
               stmt.setString(36, (String)parms[44], 8);
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[46], 1);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[48], 1);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DATE );
               }
               else
               {
                  stmt.setDate(39, (java.util.Date)parms[50]);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[52], 8);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[54], 1);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(42, ((Number) parms[56]).shortValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(43, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(44, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[62], 6);
               }
               stmt.setBigDecimal(46, (java.math.BigDecimal)parms[63], 5);
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[65], 1);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[67], 2);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[69], 10);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(50, ((Number) parms[71]).shortValue());
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[73], 10);
               }
               stmt.setShort(52, ((Number) parms[74]).shortValue());
               stmt.setByte(53, ((Number) parms[75]).byteValue());
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(54, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(55, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(56, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(57, ((Number) parms[83]).shortValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(58, (String)parms[85], 11);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(59, ((Number) parms[87]).shortValue());
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(60, (String)parms[89], 3000);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(61, (String)parms[91], 3000);
               }
               stmt.setByte(62, ((Number) parms[92]).byteValue());
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(63, (String)parms[94], 16);
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(64, (String)parms[96], 250);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(65, (String)parms[98], 1);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(66, ((Number) parms[100]).byteValue());
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(67, ((Number) parms[102]).intValue());
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(68, (java.util.Date)parms[104], false);
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(69, ((Number) parms[106]).intValue());
               }
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(70, (java.util.Date)parms[108], false);
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(71, (String)parms[110], 300);
               }
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(72, ((Number) parms[112]).shortValue());
               }
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(73, ((Number) parms[114]).shortValue());
               }
               if ( ((Boolean) parms[115]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(74, ((Number) parms[116]).shortValue());
               }
               if ( ((Boolean) parms[117]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(75, ((Number) parms[118]).shortValue());
               }
               if ( ((Boolean) parms[119]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(76, ((Number) parms[120]).shortValue());
               }
               if ( ((Boolean) parms[121]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(77, ((Number) parms[122]).shortValue());
               }
               if ( ((Boolean) parms[123]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(78, ((Number) parms[124]).shortValue());
               }
               if ( ((Boolean) parms[125]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(79, ((Number) parms[126]).shortValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 9);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[18], 10);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[28], 15);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[30], 40);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[32], 20);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[34], 9);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(28, ((Number) parms[40]).intValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(30, ((Number) parms[44]).byteValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[46]).shortValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[50], 60);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(36, ((Number) parms[56]).intValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(37, ((Number) parms[58]).byteValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DATE );
               }
               else
               {
                  stmt.setDate(38, (java.util.Date)parms[60]);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[62], 10);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DATE );
               }
               else
               {
                  stmt.setDate(40, (java.util.Date)parms[64]);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(41, ((Number) parms[66]).shortValue());
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[68], 13);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(43, ((Number) parms[70]).intValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[72], 16);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[74], 26);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(46, ((Number) parms[76]).intValue());
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[78], 60);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[80], 13);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(49, ((Number) parms[82]).intValue());
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[84], 20);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[86], 10);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[88], 10);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(53, ((Number) parms[90]).intValue());
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(54, ((Number) parms[92]).byteValue());
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(55, ((Number) parms[94]).shortValue());
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[96], 20);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[98], 20);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(58, ((Number) parms[100]).byteValue());
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[102], 6);
               }
               stmt.setString(60, (String)parms[103], 20);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

