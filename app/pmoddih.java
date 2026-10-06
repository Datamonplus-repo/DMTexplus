package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmoddih extends GXProcedure
{
   public pmoddih( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmoddih.class ), "" );
   }

   public pmoddih( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pmoddih.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pmoddih.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmoddih.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pmoddih.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmoddih.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV38Ok = httpContext.getMessage( "N", "") ;
      /* Using cursor P006L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P006L2_A252CliCod[0] ;
         n252CliCod = P006L2_n252CliCod[0] ;
         A361DisCod = P006L2_A361DisCod[0] ;
         A218BarTipCol = P006L2_A218BarTipCol[0] ;
         A135BarColNom = P006L2_A135BarColNom[0] ;
         A136BarColNum = P006L2_A136BarColNum[0] ;
         A212BarSer = P006L2_A212BarSer[0] ;
         A1652BarSerDsc = P006L2_A1652BarSerDsc[0] ;
         A217BarTipArt = P006L2_A217BarTipArt[0] ;
         n217BarTipArt = P006L2_n217BarTipArt[0] ;
         A213BarSit = P006L2_A213BarSit[0] ;
         A365DisDes = P006L2_A365DisDes[0] ;
         A129BarCod = P006L2_A129BarCod[0] ;
         A132BarCodReo = P006L2_A132BarCodReo[0] ;
         A130BarCodPar = P006L2_A130BarCodPar[0] ;
         A143BarDisNum = P006L2_A143BarDisNum[0] ;
         A228BarUniMed = P006L2_A228BarUniMed[0] ;
         A155BarFecCli = P006L2_A155BarFecCli[0] ;
         A235BarUrg = P006L2_A235BarUrg[0] ;
         A182BarMat = P006L2_A182BarMat[0] ;
         A211BarRdt = P006L2_A211BarRdt[0] ;
         A221BarTra1 = P006L2_A221BarTra1[0] ;
         A224BarTraP1 = P006L2_A224BarTraP1[0] ;
         A222BarTra2 = P006L2_A222BarTra2[0] ;
         A225BarTraP2 = P006L2_A225BarTraP2[0] ;
         A223BarTra3 = P006L2_A223BarTra3[0] ;
         A226BarTraP3 = P006L2_A226BarTraP3[0] ;
         A229BarUrd1 = P006L2_A229BarUrd1[0] ;
         A232BarUrdP1 = P006L2_A232BarUrdP1[0] ;
         A230BarUrd2 = P006L2_A230BarUrd2[0] ;
         A233BarUrdP2 = P006L2_A233BarUrdP2[0] ;
         A231BarUrd3 = P006L2_A231BarUrd3[0] ;
         A234BarUrdP3 = P006L2_A234BarUrdP3[0] ;
         A127BarAncCru1 = P006L2_A127BarAncCru1[0] ;
         A128BarAncCru2 = P006L2_A128BarAncCru2[0] ;
         A125BarAncAca1 = P006L2_A125BarAncAca1[0] ;
         A126BarAncAca2 = P006L2_A126BarAncAca2[0] ;
         A1226BarGraCru = P006L2_A1226BarGraCru[0] ;
         A1223BarEncCom = P006L2_A1223BarEncCom[0] ;
         A1224BarEncAnh = P006L2_A1224BarEncAnh[0] ;
         A1234BarNomCli = P006L2_A1234BarNomCli[0] ;
         A1235BarNumCli = P006L2_A1235BarNumCli[0] ;
         A206BarPle = P006L2_A206BarPle[0] ;
         A177BarLar = P006L2_A177BarLar[0] ;
         A214BarSua = P006L2_A214BarSua[0] ;
         A118BarAcaQui = P006L2_A118BarAcaQui[0] ;
         A139BarCorOri = P006L2_A139BarCorOri[0] ;
         A145BarEncOri = P006L2_A145BarEncOri[0] ;
         A209BarPri = P006L2_A209BarPri[0] ;
         A158BarFecFpr = P006L2_A158BarFecFpr[0] ;
         A864BarPes = P006L2_A864BarPes[0] ;
         /* Using cursor P006L3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A14555DisPrePz = P006L3_A14555DisPrePz[0] ;
         A13987DisArtDsc2 = P006L3_A13987DisArtDsc2[0] ;
         A13986DisIdtx2 = P006L3_A13986DisIdtx2[0] ;
         n13986DisIdtx2 = P006L3_n13986DisIdtx2[0] ;
         A13768DisTallUlt = P006L3_A13768DisTallUlt[0] ;
         A13767DisRdto4 = P006L3_A13767DisRdto4[0] ;
         A13233DisRGB = P006L3_A13233DisRGB[0] ;
         A13080DisDGUltli = P006L3_A13080DisDGUltli[0] ;
         A13076DisLinPrd = P006L3_A13076DisLinPrd[0] ;
         n13076DisLinPrd = P006L3_n13076DisLinPrd[0] ;
         A13069DisCanalID = P006L3_A13069DisCanalID[0] ;
         n13069DisCanalID = P006L3_n13069DisCanalID[0] ;
         A13068DisLineaID = P006L3_A13068DisLineaID[0] ;
         n13068DisLineaID = P006L3_n13068DisLineaID[0] ;
         A12880DisOEKOTEX = P006L3_A12880DisOEKOTEX[0] ;
         n12880DisOEKOTEX = P006L3_n12880DisOEKOTEX[0] ;
         A12772DisProdID = P006L3_A12772DisProdID[0] ;
         n12772DisProdID = P006L3_n12772DisProdID[0] ;
         A12768DisTpEstam = P006L3_A12768DisTpEstam[0] ;
         A12765DisPriorid = P006L3_A12765DisPriorid[0] ;
         A12328RevenID = P006L3_A12328RevenID[0] ;
         n12328RevenID = P006L3_n12328RevenID[0] ;
         A11864Nxt_artcli = P006L3_A11864Nxt_artcli[0] ;
         A11863DptoID = P006L3_A11863DptoID[0] ;
         n11863DptoID = P006L3_n11863DptoID[0] ;
         A11862DesaID = P006L3_A11862DesaID[0] ;
         n11862DesaID = P006L3_n11862DesaID[0] ;
         A11861Nxt_statio = P006L3_A11861Nxt_statio[0] ;
         A11860CpteId = P006L3_A11860CpteId[0] ;
         n11860CpteId = P006L3_n11860CpteId[0] ;
         A11859Nxt_modelo = P006L3_A11859Nxt_modelo[0] ;
         A11734DisCnoEncO = P006L3_A11734DisCnoEncO[0] ;
         A11661DisOrdComp = P006L3_A11661DisOrdComp[0] ;
         A11659MarcaId = P006L3_A11659MarcaId[0] ;
         n11659MarcaId = P006L3_n11659MarcaId[0] ;
         A11658DisMemo2 = P006L3_A11658DisMemo2[0] ;
         A11657DisMemo1 = P006L3_A11657DisMemo1[0] ;
         A3696DisParPar = P006L3_A3696DisParPar[0] ;
         n3696DisParPar = P006L3_n3696DisParPar[0] ;
         A3695DisParReo = P006L3_A3695DisParReo[0] ;
         n3695DisParReo = P006L3_n3695DisParReo[0] ;
         A3694DisParCod = P006L3_A3694DisParCod[0] ;
         n3694DisParCod = P006L3_n3694DisParCod[0] ;
         A7067DisUltNot = P006L3_A7067DisUltNot[0] ;
         n7067DisUltNot = P006L3_n7067DisUltNot[0] ;
         A4918DisDibCoDN = P006L3_A4918DisDibCoDN[0] ;
         n4918DisDibCoDN = P006L3_n4918DisDibCoDN[0] ;
         A4879DibColColN = P006L3_A4879DibColColN[0] ;
         n4879DibColColN = P006L3_n4879DibColColN[0] ;
         A4919DisDibCoCN = P006L3_A4919DisDibCoCN[0] ;
         n4919DisDibCoCN = P006L3_n4919DisDibCoCN[0] ;
         A4877DibColCol = P006L3_A4877DibColCol[0] ;
         n4877DibColCol = P006L3_n4877DibColCol[0] ;
         A4476DisAcaFor = P006L3_A4476DisAcaFor[0] ;
         n4476DisAcaFor = P006L3_n4476DisAcaFor[0] ;
         A4475DisLotMaq = P006L3_A4475DisLotMaq[0] ;
         n4475DisLotMaq = P006L3_n4475DisLotMaq[0] ;
         A4472DisLotPza = P006L3_A4472DisLotPza[0] ;
         n4472DisLotPza = P006L3_n4472DisLotPza[0] ;
         A4355DisFecPed = P006L3_A4355DisFecPed[0] ;
         n4355DisFecPed = P006L3_n4355DisFecPed[0] ;
         A10887Cod_Idtx = P006L3_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = P006L3_n10887Cod_Idtx[0] ;
         A9787DisItem6 = P006L3_A9787DisItem6[0] ;
         A9786DisItem5 = P006L3_A9786DisItem5[0] ;
         A9774DisItem4 = P006L3_A9774DisItem4[0] ;
         A9773DisItem3 = P006L3_A9773DisItem3[0] ;
         A9772DisItem2 = P006L3_A9772DisItem2[0] ;
         A9771DisItem1 = P006L3_A9771DisItem1[0] ;
         A8887DisFchT = P006L3_A8887DisFchT[0] ;
         n8887DisFchT = P006L3_n8887DisFchT[0] ;
         A8886DisDest = P006L3_A8886DisDest[0] ;
         A8885DisFEnt = P006L3_A8885DisFEnt[0] ;
         n8885DisFEnt = P006L3_n8885DisFEnt[0] ;
         A7739DisExp = P006L3_A7739DisExp[0] ;
         A7738DisMaqEst = P006L3_A7738DisMaqEst[0] ;
         A7523DisRec = P006L3_A7523DisRec[0] ;
         A7516DisGraTam = P006L3_A7516DisGraTam[0] ;
         n7516DisGraTam = P006L3_n7516DisGraTam[0] ;
         A7515DisDesCol = P006L3_A7515DisDesCol[0] ;
         n7515DisDesCol = P006L3_n7515DisDesCol[0] ;
         A7514DisOrdGra = P006L3_A7514DisOrdGra[0] ;
         A7513DisOrdSep = P006L3_A7513DisOrdSep[0] ;
         A7512DisFacGra = P006L3_A7512DisFacGra[0] ;
         n7512DisFacGra = P006L3_n7512DisFacGra[0] ;
         A7511DisFacSep = P006L3_A7511DisFacSep[0] ;
         n7511DisFacSep = P006L3_n7511DisFacSep[0] ;
         A7510DisDto = P006L3_A7510DisDto[0] ;
         n7510DisDto = P006L3_n7510DisDto[0] ;
         A6548DisRbMaq = P006L3_A6548DisRbMaq[0] ;
         A6547DisVolMaq = P006L3_A6547DisVolMaq[0] ;
         A5405DisAntpT = P006L3_A5405DisAntpT[0] ;
         A5366DisAntp = P006L3_A5366DisAntp[0] ;
         A5350DisObsAnc = P006L3_A5350DisObsAnc[0] ;
         A5349DisObsGrm = P006L3_A5349DisObsGrm[0] ;
         A5290DisTipCor = P006L3_A5290DisTipCor[0] ;
         A5252DisAcc = P006L3_A5252DisAcc[0] ;
         A5032DisEstTip = P006L3_A5032DisEstTip[0] ;
         A5031DisCom = P006L3_A5031DisCom[0] ;
         n5031DisCom = P006L3_n5031DisCom[0] ;
         A5025DisGraCob = P006L3_A5025DisGraCob[0] ;
         A5024DisTipEst = P006L3_A5024DisTipEst[0] ;
         A4876DibColDib = P006L3_A4876DibColDib[0] ;
         n4876DibColDib = P006L3_n4876DibColDib[0] ;
         A4813DisEncCli = P006L3_A4813DisEncCli[0] ;
         A4785DisNroCor = P006L3_A4785DisNroCor[0] ;
         A4720DisDishCod = P006L3_A4720DisDishCod[0] ;
         A4617DisHorReg = P006L3_A4617DisHorReg[0] ;
         n4617DisHorReg = P006L3_n4617DisHorReg[0] ;
         A4616DisHorEnt = P006L3_A4616DisHorEnt[0] ;
         n4616DisHorEnt = P006L3_n4616DisHorEnt[0] ;
         A4615DisTam = P006L3_A4615DisTam[0] ;
         A4614DisMdlCod = P006L3_A4614DisMdlCod[0] ;
         A4479DisAcaMar = P006L3_A4479DisAcaMar[0] ;
         A4478DisAcaAnh = P006L3_A4478DisAcaAnh[0] ;
         A4477DisAcaBak = P006L3_A4477DisAcaBak[0] ;
         A4474DisLotKgs = P006L3_A4474DisLotKgs[0] ;
         A4473DisLotMts = P006L3_A4473DisLotMts[0] ;
         A4471DisCruEnr = P006L3_A4471DisCruEnr[0] ;
         A4470DisCruKgs = P006L3_A4470DisCruKgs[0] ;
         A4469DisCruMts = P006L3_A4469DisCruMts[0] ;
         A4468DisPelAnh = P006L3_A4468DisPelAnh[0] ;
         A4348DisUsrCod = P006L3_A4348DisUsrCod[0] ;
         A4294DisNPzasL = P006L3_A4294DisNPzasL[0] ;
         n4294DisNPzasL = P006L3_n4294DisNPzasL[0] ;
         A4293DisNPzas = P006L3_A4293DisNPzas[0] ;
         n4293DisNPzas = P006L3_n4293DisNPzas[0] ;
         A4014DisTin = P006L3_A4014DisTin[0] ;
         A4013DisEnv = P006L3_A4013DisEnv[0] ;
         n4013DisEnv = P006L3_n4013DisEnv[0] ;
         A2525DisComULin = P006L3_A2525DisComULin[0] ;
         n2525DisComULin = P006L3_n2525DisComULin[0] ;
         A1052DisObs = P006L3_A1052DisObs[0] ;
         A1051DisNumCol = P006L3_A1051DisNumCol[0] ;
         n1051DisNumCol = P006L3_n1051DisNumCol[0] ;
         A1014DibInt = P006L3_A1014DibInt[0] ;
         n1014DibInt = P006L3_n1014DibInt[0] ;
         A1013DibCli = P006L3_A1013DibCli[0] ;
         n1013DibCli = P006L3_n1013DibCli[0] ;
         A1031EmpesCod = P006L3_A1031EmpesCod[0] ;
         n1031EmpesCod = P006L3_n1031EmpesCod[0] ;
         A3841DisArtMer = P006L3_A3841DisArtMer[0] ;
         A3826RetCod = P006L3_A3826RetCod[0] ;
         n3826RetCod = P006L3_n3826RetCod[0] ;
         A3627DisFecLan = P006L3_A3627DisFecLan[0] ;
         n3627DisFecLan = P006L3_n3627DisFecLan[0] ;
         A3309DisNumTon = P006L3_A3309DisNumTon[0] ;
         A3308DisManCod2 = P006L3_A3308DisManCod2[0] ;
         A3307DisManCod1 = P006L3_A3307DisManCod1[0] ;
         A3306DisFac = P006L3_A3306DisFac[0] ;
         A3132DisGraCru2 = P006L3_A3132DisGraCru2[0] ;
         A3131DisGraAca2 = P006L3_A3131DisGraAca2[0] ;
         A3130DisAncSal3 = P006L3_A3130DisAncSal3[0] ;
         A3129DisAncSal2 = P006L3_A3129DisAncSal2[0] ;
         A3128DisAncSal1 = P006L3_A3128DisAncSal1[0] ;
         A3127DisNumCor = P006L3_A3127DisNumCor[0] ;
         A2835DisPle2 = P006L3_A2835DisPle2[0] ;
         A2926DisPla = P006L3_A2926DisPla[0] ;
         A2833DisMtrLot = P006L3_A2833DisMtrLot[0] ;
         A2832DisKgsLot = P006L3_A2832DisKgsLot[0] ;
         A2831DisNumLot = P006L3_A2831DisNumLot[0] ;
         A2744DisNumTex2 = P006L3_A2744DisNumTex2[0] ;
         n2744DisNumTex2 = P006L3_n2744DisNumTex2[0] ;
         A2743DisNumTex1 = P006L3_A2743DisNumTex1[0] ;
         A2742DisCodTex = P006L3_A2742DisCodTex[0] ;
         n2742DisCodTex = P006L3_n2742DisCodTex[0] ;
         A2403DisOpeAnt = P006L3_A2403DisOpeAnt[0] ;
         n2403DisOpeAnt = P006L3_n2403DisOpeAnt[0] ;
         A2402DisManCod = P006L3_A2402DisManCod[0] ;
         A2310DisCliDes = P006L3_A2310DisCliDes[0] ;
         A2267DisNumBas = P006L3_A2267DisNumBas[0] ;
         n2267DisNumBas = P006L3_n2267DisNumBas[0] ;
         A2009DisTipDis = P006L3_A2009DisTipDis[0] ;
         n2009DisTipDis = P006L3_n2009DisTipDis[0] ;
         A1968DisRes = P006L3_A1968DisRes[0] ;
         n1968DisRes = P006L3_n1968DisRes[0] ;
         A1908DisRdoA = P006L3_A1908DisRdoA[0] ;
         A1907DisRdoN = P006L3_A1907DisRdoN[0] ;
         A1906DisGraAca = P006L3_A1906DisGraAca[0] ;
         A1502DisPart = P006L3_A1502DisPart[0] ;
         A1430DisLoc = P006L3_A1430DisLoc[0] ;
         A1157TipConCod = P006L3_A1157TipConCod[0] ;
         n1157TipConCod = P006L3_n1157TipConCod[0] ;
         A966PartCod = P006L3_A966PartCod[0] ;
         n966PartCod = P006L3_n966PartCod[0] ;
         A1122MaqCodDis = P006L3_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P006L3_n1122MaqCodDis[0] ;
         A1002DisNumTen = P006L3_A1002DisNumTen[0] ;
         n1002DisNumTen = P006L3_n1002DisNumTen[0] ;
         A999DisNMez = P006L3_A999DisNMez[0] ;
         A998DisNMtr = P006L3_A998DisNMtr[0] ;
         A373DisMtrLan = P006L3_A373DisMtrLan[0] ;
         A372DisKgmLan = P006L3_A372DisKgmLan[0] ;
         A383DisPieLan = P006L3_A383DisPieLan[0] ;
         A389DisPreMtr = P006L3_A389DisPreMtr[0] ;
         A388DisPreKgm = P006L3_A388DisPreKgm[0] ;
         A367DisEst = P006L3_A367DisEst[0] ;
         A369DisFec = P006L3_A369DisFec[0] ;
         A375DisNumUni = P006L3_A375DisNumUni[0] ;
         A374DisNumPie = P006L3_A374DisNumPie[0] ;
         A362DisColNom = P006L3_A362DisColNom[0] ;
         n362DisColNom = P006L3_n362DisColNom[0] ;
         A363DisColNum = P006L3_A363DisColNum[0] ;
         n363DisColNum = P006L3_n363DisColNum[0] ;
         /* Using cursor P006L5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A166BarKgm = P006L5_A166BarKgm[0] ;
            A199BarPie1 = P006L5_A199BarPie1[0] ;
            A898BarPieNDes = P006L5_A898BarPieNDes[0] ;
         }
         else
         {
            A166BarKgm = DecimalUtil.doubleToDec(0) ;
            A898BarPieNDes = 0 ;
            A199BarPie1 = (short)(0) ;
         }
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         W396EmprCod = A396EmprCod ;
         AV35CliCod = A252CliCod ;
         AV27DisCod = A361DisCod ;
         AV29BarTipCol = A218BarTipCol ;
         AV30BarColNom = A135BarColNom ;
         AV31BarColNum = A136BarColNum ;
         AV32BarSer = A212BarSer ;
         AV40BarSerDsc = A1652BarSerDsc ;
         AV33BarTipArt = A217BarTipArt ;
         AV39BarDisNum = A143BarDisNum ;
         AV45BarSit = A213BarSit ;
         /* Execute user subroutine: 'BUSDIS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(1);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'BUSCOL' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(1);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'BUSART' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(1);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV25Contador = (short)(0) ;
         /* Optimized group. */
         /* Using cursor P006L6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         cV25Contador = P006L6_AV25Contador[0] ;
         pr_default.close(3);
         AV25Contador = (short)(AV25Contador+cV25Contador*1) ;
         /* End optimized group. */
         if ( AV25Contador > 1 )
         {
            AV41DisNumUni0 = A375DisNumUni ;
            AV42DisNumPieO = A374DisNumPie ;
            A375DisNumUni = A375DisNumUni.subtract(A166BarKgm) ;
            A374DisNumPie = (short)(A374DisNumPie-A198BarPie) ;
            AV43DisNumPie = A374DisNumPie ;
            AV44DisNumUni = A375DisNumUni ;
            /* Execute user subroutine: 'DISPORIG' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            GXv_char1[0] = A396EmprCod ;
            GXv_char2[0] = A966PartCod ;
            GXv_int3[0] = A252CliCod ;
            GXv_int4[0] = AV27DisCod ;
            GXv_int5[0] = AV43DisNumPie ;
            GXv_decimal6[0] = AV44DisNumUni ;
            GXv_int7[0] = AV42DisNumPieO ;
            GXv_decimal8[0] = AV41DisNumUni0 ;
            GXv_char9[0] = httpContext.getMessage( "B", "") ;
            GXv_char10[0] = A362DisColNom ;
            GXv_int11[0] = A363DisColNum ;
            GXv_date12[0] = A369DisFec ;
            new app.pmodpar(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_int4, GXv_int5, GXv_decimal6, GXv_int7, GXv_decimal8, GXv_char9, GXv_char10, GXv_int11, GXv_date12) ;
            pmoddih.this.A396EmprCod = GXv_char1[0] ;
            pmoddih.this.A966PartCod = GXv_char2[0] ;
            pmoddih.this.A252CliCod = GXv_int3[0] ;
            pmoddih.this.AV27DisCod = GXv_int4[0] ;
            pmoddih.this.AV43DisNumPie = GXv_int5[0] ;
            pmoddih.this.AV44DisNumUni = GXv_decimal6[0] ;
            pmoddih.this.AV42DisNumPieO = GXv_int7[0] ;
            pmoddih.this.AV41DisNumUni0 = GXv_decimal8[0] ;
            pmoddih.this.A362DisColNom = GXv_char10[0] ;
            pmoddih.this.A363DisColNum = GXv_int11[0] ;
            pmoddih.this.A369DisFec = GXv_date12[0] ;
            if ( GXutil.strcmp(A209BarPri, "0") == 0 )
            {
               GXv_int11[0] = AV15ContVal ;
               new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "020200", GXv_int11) ;
               pmoddih.this.AV15ContVal = GXv_int11[0] ;
            }
            if ( GXutil.strcmp(A209BarPri, "1") == 0 )
            {
               GXv_int11[0] = AV15ContVal ;
               new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "021200", GXv_int11) ;
               pmoddih.this.AV15ContVal = GXv_int11[0] ;
            }
            /*
               INSERT RECORD ON TABLE TXPDISPOS

            */
            W396EmprCod = A396EmprCod ;
            W361DisCod = A361DisCod ;
            W360DisCliNum = A360DisCliNum ;
            W335DisArtCod = A335DisArtCod ;
            W337DisArtDsc = A337DisArtDsc ;
            W352DisArtTip = A352DisArtTip ;
            W362DisColNom = A362DisColNom ;
            n362DisColNom = false ;
            W363DisColNum = A363DisColNum ;
            n363DisColNum = false ;
            W390DisTipCol = A390DisTipCol ;
            n390DisTipCol = false ;
            W375DisNumUni = A375DisNumUni ;
            W374DisNumPie = A374DisNumPie ;
            W392DisUniMed = A392DisUniMed ;
            W370DisFecCli = A370DisFecCli ;
            W341DisArtOpe = A341DisArtOpe ;
            W359DisArtUrg = A359DisArtUrg ;
            W340DisArtMat = A340DisArtMat ;
            W350DisArtRdt = A350DisArtRdt ;
            W353DisArtTr1 = A353DisArtTr1 ;
            W344DisArtPt1 = A344DisArtPt1 ;
            W354DisArtTr2 = A354DisArtTr2 ;
            W345DisArtPt2 = A345DisArtPt2 ;
            W355DisArtTr3 = A355DisArtTr3 ;
            W346DisArtPt3 = A346DisArtPt3 ;
            W356DisArtUr1 = A356DisArtUr1 ;
            W347DisArtPu1 = A347DisArtPu1 ;
            W357DisArtUr2 = A357DisArtUr2 ;
            W348DisArtPu2 = A348DisArtPu2 ;
            W358DisArtUr3 = A358DisArtUr3 ;
            W349DisArtPu3 = A349DisArtPu3 ;
            n349DisArtPu3 = false ;
            W334DisArtAnh = A334DisArtAnh ;
            W1231DisArtAn1 = A1231DisArtAn1 ;
            W1232DisArtAcb = A1232DisArtAcb ;
            W1233DisArtAc2 = A1233DisArtAc2 ;
            W1225DisGraCru = A1225DisGraCru ;
            W1197DisEncCom = A1197DisEncCom ;
            W1198DisEncAnh = A1198DisEncAnh ;
            W1195DisNomCli = A1195DisNomCli ;
            W1196DisNumCli = A1196DisNumCli ;
            W343DisArtPle = A343DisArtPle ;
            W339DisArtLar = A339DisArtLar ;
            W351DisArtSua = A351DisArtSua ;
            W333DisArtAca = A333DisArtAca ;
            W336DisArtCor = A336DisArtCor ;
            W338DisArtEnc = A338DisArtEnc ;
            W757PriCod = A757PriCod ;
            W370DisFecCli = A370DisFecCli ;
            W342DisArtPes = A342DisArtPes ;
            W371DisFecEnt = A371DisFecEnt ;
            W366DisEnt = A366DisEnt ;
            W378DisObsULin = A378DisObsULin ;
            A361DisCod = AV15ContVal ;
            A360DisCliNum = A143BarDisNum ;
            A335DisArtCod = AV32BarSer ;
            A337DisArtDsc = AV40BarSerDsc ;
            A352DisArtTip = AV33BarTipArt ;
            A362DisColNom = AV30BarColNom ;
            n362DisColNom = false ;
            A363DisColNum = AV31BarColNum ;
            n363DisColNum = false ;
            A390DisTipCol = AV29BarTipCol ;
            n390DisTipCol = false ;
            A375DisNumUni = A166BarKgm ;
            A374DisNumPie = (short)(A198BarPie) ;
            A392DisUniMed = A228BarUniMed ;
            A370DisFecCli = A155BarFecCli ;
            A341DisArtOpe = AV26DisArtOpe ;
            A359DisArtUrg = A235BarUrg ;
            A340DisArtMat = A182BarMat ;
            A350DisArtRdt = A211BarRdt ;
            A353DisArtTr1 = A221BarTra1 ;
            A344DisArtPt1 = A224BarTraP1 ;
            A354DisArtTr2 = A222BarTra2 ;
            A345DisArtPt2 = A225BarTraP2 ;
            A355DisArtTr3 = A223BarTra3 ;
            A346DisArtPt3 = A226BarTraP3 ;
            A356DisArtUr1 = A229BarUrd1 ;
            A347DisArtPu1 = A232BarUrdP1 ;
            A357DisArtUr2 = A230BarUrd2 ;
            A348DisArtPu2 = A233BarUrdP2 ;
            A358DisArtUr3 = A231BarUrd3 ;
            A349DisArtPu3 = A234BarUrdP3 ;
            n349DisArtPu3 = false ;
            A334DisArtAnh = A127BarAncCru1 ;
            A1231DisArtAn1 = A128BarAncCru2 ;
            A1232DisArtAcb = A125BarAncAca1 ;
            A1233DisArtAc2 = A126BarAncAca2 ;
            A1225DisGraCru = A1226BarGraCru ;
            A1197DisEncCom = A1223BarEncCom ;
            A1198DisEncAnh = A1224BarEncAnh ;
            A1195DisNomCli = A1234BarNomCli ;
            A1196DisNumCli = A1235BarNumCli ;
            A343DisArtPle = A206BarPle ;
            A339DisArtLar = A177BarLar ;
            A351DisArtSua = A214BarSua ;
            A333DisArtAca = A118BarAcaQui ;
            A336DisArtCor = A139BarCorOri ;
            A338DisArtEnc = A145BarEncOri ;
            A757PriCod = A209BarPri ;
            A370DisFecCli = A158BarFecFpr ;
            A342DisArtPes = A864BarPes ;
            A371DisFecEnt = A158BarFecFpr ;
            A366DisEnt = AV20DisEnt ;
            A378DisObsULin = AV21DisObsULin ;
            /* Using cursor P006L7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A365DisDes, A335DisArtCod, Short.valueOf(A374DisNumPie), A375DisNumUni, A392DisUniMed, Short.valueOf(A342DisArtPes), A757PriCod, A360DisCliNum, A370DisFecCli, A369DisFec, A371DisFecEnt, Boolean.valueOf(n362DisColNom), A362DisColNom, Boolean.valueOf(n363DisColNum), Integer.valueOf(A363DisColNum), Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol), A337DisArtDsc, A366DisEnt, Byte.valueOf(A378DisObsULin), A340DisArtMat, A339DisArtLar, A351DisArtSua, A333DisArtAca, A343DisArtPle, Short.valueOf(A352DisArtTip), A338DisArtEnc, A336DisArtCor, A341DisArtOpe, A353DisArtTr1, Short.valueOf(A344DisArtPt1), A354DisArtTr2, Short.valueOf(A345DisArtPt2), A355DisArtTr3, Short.valueOf(A346DisArtPt3), A350DisArtRdt, Byte.valueOf(A359DisArtUrg), A356DisArtUr1, Short.valueOf(A347DisArtPu1), A357DisArtUr2, Short.valueOf(A348DisArtPu2), A358DisArtUr3, Boolean.valueOf(n349DisArtPu3), Short.valueOf(A349DisArtPu3), Short.valueOf(A334DisArtAnh), Byte.valueOf(A367DisEst), A388DisPreKgm, A389DisPreMtr, Short.valueOf(A383DisPieLan), Short.valueOf(A372DisKgmLan), Short.valueOf(A373DisMtrLan), A998DisNMtr, A999DisNMez, Boolean.valueOf(n1002DisNumTen), A1002DisNumTen, Boolean.valueOf(n1122MaqCodDis), A1122MaqCodDis, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1157TipConCod), Short.valueOf(A1157TipConCod), A1195DisNomCli, Integer.valueOf(A1196DisNumCli), A1197DisEncCom, A1198DisEncAnh, Short.valueOf(A1225DisGraCru), Short.valueOf(A1231DisArtAn1), Short.valueOf(A1232DisArtAcb), Short.valueOf(A1233DisArtAc2), A1430DisLoc, Short.valueOf(A1502DisPart), Short.valueOf(A1906DisGraAca), A1907DisRdoN, A1908DisRdoA, Boolean.valueOf(n1968DisRes), A1968DisRes, Boolean.valueOf(n2009DisTipDis), A2009DisTipDis, Boolean.valueOf(n2267DisNumBas), Short.valueOf(A2267DisNumBas), Integer.valueOf(A2310DisCliDes), Short.valueOf(A2402DisManCod), Boolean.valueOf(n2403DisOpeAnt), Integer.valueOf(A2403DisOpeAnt), Boolean.valueOf(n2742DisCodTex), A2742DisCodTex, Byte.valueOf(A2743DisNumTex1), Boolean.valueOf(n2744DisNumTex2), Short.valueOf(A2744DisNumTex2), Integer.valueOf(A2831DisNumLot), A2832DisKgsLot, A2833DisMtrLot, A2926DisPla, A2835DisPle2, Short.valueOf(A3127DisNumCor), Short.valueOf(A3128DisAncSal1), Short.valueOf(A3129DisAncSal2), Short.valueOf(A3130DisAncSal3), Short.valueOf(A3131DisGraAca2), Short.valueOf(A3132DisGraCru2), A3306DisFac, Short.valueOf(A3307DisManCod1), Short.valueOf(A3308DisManCod2), A3309DisNumTon, Boolean.valueOf(n3627DisFecLan), A3627DisFecLan, Boolean.valueOf(n3826RetCod), A3826RetCod, A3841DisArtMer, Boolean.valueOf(n1031EmpesCod), A1031EmpesCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Boolean.valueOf(n1051DisNumCol), Short.valueOf(A1051DisNumCol), A1052DisObs,
            Boolean.valueOf(n2525DisComULin), Byte.valueOf(A2525DisComULin), Boolean.valueOf(n4013DisEnv), Byte.valueOf(A4013DisEnv), A4014DisTin, Boolean.valueOf(n4293DisNPzas), Integer.valueOf(A4293DisNPzas), Boolean.valueOf(n4294DisNPzasL), Integer.valueOf(A4294DisNPzasL), A4348DisUsrCod, Short.valueOf(A4468DisPelAnh), A4469DisCruMts, A4470DisCruKgs, A4471DisCruEnr, A4473DisLotMts, A4474DisLotKgs, A4477DisAcaBak, Short.valueOf(A4478DisAcaAnh), A4479DisAcaMar, A4614DisMdlCod, A4615DisTam, Boolean.valueOf(n4616DisHorEnt), A4616DisHorEnt, Boolean.valueOf(n4617DisHorReg), A4617DisHorReg, A4720DisDishCod, Integer.valueOf(A4785DisNroCor), A4813DisEncCli, Boolean.valueOf(n4876DibColDib), A4876DibColDib, Byte.valueOf(A5024DisTipEst), Byte.valueOf(A5025DisGraCob), Boolean.valueOf(n5031DisCom), A5031DisCom, A5032DisEstTip, A5252DisAcc, A5290DisTipCor, A5349DisObsGrm, A5350DisObsAnc, A5366DisAntp, A5405DisAntpT, Integer.valueOf(A6547DisVolMaq), A6548DisRbMaq, Boolean.valueOf(n7510DisDto), A7510DisDto, Boolean.valueOf(n7511DisFacSep), Byte.valueOf(A7511DisFacSep), Boolean.valueOf(n7512DisFacGra), Byte.valueOf(A7512DisFacGra), Byte.valueOf(A7513DisOrdSep), Byte.valueOf(A7514DisOrdGra), Boolean.valueOf(n7515DisDesCol), Byte.valueOf(A7515DisDesCol), Boolean.valueOf(n7516DisGraTam), A7516DisGraTam, A7523DisRec, A7738DisMaqEst, A7739DisExp, Boolean.valueOf(n8885DisFEnt), A8885DisFEnt, A8886DisDest, Boolean.valueOf(n8887DisFchT), A8887DisFchT, A9771DisItem1, A9772DisItem2, A9773DisItem3, A9774DisItem4, A9786DisItem5, A9787DisItem6, Boolean.valueOf(n10887Cod_Idtx), A10887Cod_Idtx, Boolean.valueOf(n4355DisFecPed), A4355DisFecPed, Boolean.valueOf(n4472DisLotPza), Short.valueOf(A4472DisLotPza), Boolean.valueOf(n4475DisLotMaq), A4475DisLotMaq, Boolean.valueOf(n4476DisAcaFor), Integer.valueOf(A4476DisAcaFor), Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4919DisDibCoCN), Integer.valueOf(A4919DisDibCoCN), Boolean.valueOf(n4879DibColColN), Integer.valueOf(A4879DibColColN), Boolean.valueOf(n4918DisDibCoDN), Integer.valueOf(A4918DisDibCoDN), Boolean.valueOf(n7067DisUltNot), Byte.valueOf(A7067DisUltNot), Boolean.valueOf(n3694DisParCod), Integer.valueOf(A3694DisParCod), Boolean.valueOf(n3695DisParReo), Byte.valueOf(A3695DisParReo), Boolean.valueOf(n3696DisParPar), A3696DisParPar, A11657DisMemo1, A11658DisMemo2, Boolean.valueOf(n11659MarcaId), A11659MarcaId, A11661DisOrdComp, A11734DisCnoEncO, A11859Nxt_modelo, Boolean.valueOf(n11860CpteId), Short.valueOf(A11860CpteId), A11861Nxt_statio, Boolean.valueOf(n11862DesaID), Short.valueOf(A11862DesaID), Boolean.valueOf(n11863DptoID), Short.valueOf(A11863DptoID), A11864Nxt_artcli, Boolean.valueOf(n12328RevenID), A12328RevenID, Byte.valueOf(A12765DisPriorid), Byte.valueOf(A12768DisTpEstam), Boolean.valueOf(n12772DisProdID), A12772DisProdID, Boolean.valueOf(n12880DisOEKOTEX), A12880DisOEKOTEX, Boolean.valueOf(n13068DisLineaID), Short.valueOf(A13068DisLineaID), Boolean.valueOf(n13069DisCanalID), Integer.valueOf(A13069DisCanalID), Boolean.valueOf(n13076DisLinPrd), A13076DisLinPrd, Byte.valueOf(A13080DisDGUltli),
            Long.valueOf(A13233DisRGB), A13767DisRdto4, Short.valueOf(A13768DisTallUlt), Boolean.valueOf(n13986DisIdtx2), A13986DisIdtx2, A13987DisArtDsc2, A14555DisPrePz});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
            A361DisCod = W361DisCod ;
            A360DisCliNum = W360DisCliNum ;
            A335DisArtCod = W335DisArtCod ;
            A337DisArtDsc = W337DisArtDsc ;
            A352DisArtTip = W352DisArtTip ;
            A362DisColNom = W362DisColNom ;
            n362DisColNom = false ;
            A363DisColNum = W363DisColNum ;
            n363DisColNum = false ;
            A390DisTipCol = W390DisTipCol ;
            n390DisTipCol = false ;
            A375DisNumUni = W375DisNumUni ;
            A374DisNumPie = W374DisNumPie ;
            A392DisUniMed = W392DisUniMed ;
            A370DisFecCli = W370DisFecCli ;
            A341DisArtOpe = W341DisArtOpe ;
            A359DisArtUrg = W359DisArtUrg ;
            A340DisArtMat = W340DisArtMat ;
            A350DisArtRdt = W350DisArtRdt ;
            A353DisArtTr1 = W353DisArtTr1 ;
            A344DisArtPt1 = W344DisArtPt1 ;
            A354DisArtTr2 = W354DisArtTr2 ;
            A345DisArtPt2 = W345DisArtPt2 ;
            A355DisArtTr3 = W355DisArtTr3 ;
            A346DisArtPt3 = W346DisArtPt3 ;
            A356DisArtUr1 = W356DisArtUr1 ;
            A347DisArtPu1 = W347DisArtPu1 ;
            A357DisArtUr2 = W357DisArtUr2 ;
            A348DisArtPu2 = W348DisArtPu2 ;
            A358DisArtUr3 = W358DisArtUr3 ;
            A349DisArtPu3 = W349DisArtPu3 ;
            n349DisArtPu3 = false ;
            A334DisArtAnh = W334DisArtAnh ;
            A1231DisArtAn1 = W1231DisArtAn1 ;
            A1232DisArtAcb = W1232DisArtAcb ;
            A1233DisArtAc2 = W1233DisArtAc2 ;
            A1225DisGraCru = W1225DisGraCru ;
            A1197DisEncCom = W1197DisEncCom ;
            A1198DisEncAnh = W1198DisEncAnh ;
            A1195DisNomCli = W1195DisNomCli ;
            A1196DisNumCli = W1196DisNumCli ;
            A343DisArtPle = W343DisArtPle ;
            A339DisArtLar = W339DisArtLar ;
            A351DisArtSua = W351DisArtSua ;
            A333DisArtAca = W333DisArtAca ;
            A336DisArtCor = W336DisArtCor ;
            A338DisArtEnc = W338DisArtEnc ;
            A757PriCod = W757PriCod ;
            A370DisFecCli = W370DisFecCli ;
            A342DisArtPes = W342DisArtPes ;
            A371DisFecEnt = W371DisFecEnt ;
            A366DisEnt = W366DisEnt ;
            A378DisObsULin = W378DisObsULin ;
            /* End Insert */
            GXv_char10[0] = A396EmprCod ;
            GXv_char9[0] = A966PartCod ;
            GXv_int11[0] = A252CliCod ;
            GXv_int4[0] = AV15ContVal ;
            GXv_int7[0] = (short)(A198BarPie) ;
            GXv_decimal8[0] = A166BarKgm ;
            GXv_char2[0] = httpContext.getMessage( "B", "") ;
            GXv_char1[0] = AV30BarColNom ;
            GXv_int3[0] = AV31BarColNum ;
            GXv_date12[0] = A369DisFec ;
            new app.pmovpar(remoteHandle, context).execute( GXv_char10, GXv_char9, GXv_int11, GXv_int4, GXv_int7, GXv_decimal8, GXv_char2, GXv_char1, GXv_int3, GXv_date12) ;
            pmoddih.this.A396EmprCod = GXv_char10[0] ;
            pmoddih.this.A966PartCod = GXv_char9[0] ;
            pmoddih.this.A252CliCod = GXv_int11[0] ;
            pmoddih.this.AV15ContVal = GXv_int4[0] ;
            pmoddih.this.A198BarPie = GXv_int7[0] ;
            pmoddih.this.A166BarKgm = GXv_decimal8[0] ;
            pmoddih.this.AV30BarColNom = GXv_char1[0] ;
            pmoddih.this.AV31BarColNum = GXv_int3[0] ;
            pmoddih.this.A369DisFec = GXv_date12[0] ;
            /*
               INSERT RECORD ON TABLE TXPDISBAR

            */
            A1146DisDisCod = AV15ContVal ;
            A1139DisBarCod = A129BarCod ;
            A1140DisBarReo = A132BarCodReo ;
            A1141DisBarPar = A130BarCodPar ;
            /* Using cursor P006L8 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A1146DisDisCod), Integer.valueOf(A1139DisBarCod), Byte.valueOf(A1140DisBarReo), A1141DisBarPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISBAR");
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
            GXv_char10[0] = A396EmprCod ;
            GXv_int11[0] = A252CliCod ;
            GXv_char9[0] = A212BarSer ;
            GXv_char2[0] = A135BarColNom ;
            GXv_int4[0] = A136BarColNum ;
            GXv_int13[0] = A218BarTipCol ;
            GXv_int7[0] = AV34Matiz ;
            new app.pbuscmat(remoteHandle, context).execute( GXv_char10, GXv_int11, GXv_char9, GXv_char2, GXv_int4, GXv_int13, GXv_int7) ;
            pmoddih.this.A396EmprCod = GXv_char10[0] ;
            pmoddih.this.A252CliCod = GXv_int11[0] ;
            pmoddih.this.A212BarSer = GXv_char9[0] ;
            pmoddih.this.A135BarColNom = GXv_char2[0] ;
            pmoddih.this.A136BarColNum = GXv_int4[0] ;
            pmoddih.this.A218BarTipCol = GXv_int13[0] ;
            pmoddih.this.AV34Matiz = GXv_int7[0] ;
            GXv_char10[0] = A396EmprCod ;
            GXv_int11[0] = AV15ContVal ;
            GXv_char9[0] = A212BarSer ;
            GXv_int4[0] = A252CliCod ;
            new app.pbuspro(remoteHandle, context).execute( GXv_char10, GXv_int11, GXv_char9, GXv_int4) ;
            pmoddih.this.A396EmprCod = GXv_char10[0] ;
            pmoddih.this.AV15ContVal = GXv_int11[0] ;
            pmoddih.this.A212BarSer = GXv_char9[0] ;
            pmoddih.this.A252CliCod = GXv_int4[0] ;
            GXv_char10[0] = A396EmprCod ;
            GXv_int11[0] = A361DisCod ;
            GXv_int4[0] = AV15ContVal ;
            new app.pdefobs(remoteHandle, context).execute( GXv_char10, GXv_int11, GXv_int4) ;
            pmoddih.this.A396EmprCod = GXv_char10[0] ;
            pmoddih.this.A361DisCod = GXv_int11[0] ;
            pmoddih.this.AV15ContVal = GXv_int4[0] ;
            /* Optimized DELETE. */
            /* Using cursor P006L9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV27DisCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISBAR");
            /* End optimized DELETE. */
         }
         /* Using cursor P006L10 */
         pr_default.execute(7, new Object[] {A375DisNumUni, Short.valueOf(A374DisNumPie), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      if ( AV25Contador == 1 )
      {
         n363DisColNum = false ;
         n362DisColNom = false ;
         n390DisTipCol = false ;
         /* Optimized UPDATE. */
         /* Using cursor P006L11 */
         pr_default.execute(8, new Object[] {AV39BarDisNum, Short.valueOf(AV33BarTipArt), AV40BarSerDsc, AV32BarSer, Boolean.valueOf(n363DisColNum), Integer.valueOf(AV31BarColNum), Boolean.valueOf(n362DisColNom), AV30BarColNom, Boolean.valueOf(n390DisTipCol), Byte.valueOf(AV29BarTipCol), A396EmprCod, Integer.valueOf(AV27DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* End optimized UPDATE. */
         if ( (0==AV36FlagCol) )
         {
            if ( AV45BarSit == 1 )
            {
               AV45BarSit = (byte)(2) ;
               /* Execute user subroutine: 'MODIFBARCAD' */
               S151 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         else
         {
            if ( AV45BarSit == 2 )
            {
               AV45BarSit = (byte)(1) ;
               /* Execute user subroutine: 'MODIFBARCAD' */
               S151 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
      }
      else
      {
         /* Optimized UPDATE. */
         /* Using cursor P006L12 */
         pr_default.execute(9, new Object[] {Short.valueOf(AV34Matiz), Integer.valueOf(AV15ContVal), A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSDIS' Routine */
      returnInSub = false ;
      /* Using cursor P006L13 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV27DisCod)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A361DisCod = P006L13_A361DisCod[0] ;
         A366DisEnt = P006L13_A366DisEnt[0] ;
         A378DisObsULin = P006L13_A378DisObsULin[0] ;
         A365DisDes = P006L13_A365DisDes[0] ;
         A341DisArtOpe = P006L13_A341DisArtOpe[0] ;
         AV20DisEnt = A366DisEnt ;
         AV21DisObsULin = A378DisObsULin ;
         AV19DisDes = A365DisDes ;
         AV26DisArtOpe = A341DisArtOpe ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S121( )
   {
      /* 'BUSCOL' Routine */
      returnInSub = false ;
      AV36FlagCol = (byte)(0) ;
      /* Using cursor P006L14 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV35CliCod), AV32BarSer, AV30BarColNom, Integer.valueOf(AV31BarColNum), Byte.valueOf(AV29BarTipCol)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A831TipColCod = P006L14_A831TipColCod[0] ;
         A483ForColNum = P006L14_A483ForColNum[0] ;
         A482ForColNom = P006L14_A482ForColNom[0] ;
         A494ForSer = P006L14_A494ForSer[0] ;
         A252CliCod = P006L14_A252CliCod[0] ;
         n252CliCod = P006L14_n252CliCod[0] ;
         AV36FlagCol = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
      if ( (0==AV36FlagCol) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe color", ""));
         AV38Ok = httpContext.getMessage( "C", "") ;
      }
   }

   public void S131( )
   {
      /* 'BUSART' Routine */
      returnInSub = false ;
      AV37FlagTArt = (byte)(0) ;
      /* Using cursor P006L15 */
      pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(AV33BarTipArt)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A829TipArtCod = P006L15_A829TipArtCod[0] ;
         AV37FlagTArt = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
      if ( (0==AV37FlagTArt) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Tipo de Articulo inexistente", ""));
         AV38Ok = httpContext.getMessage( "A", "") ;
      }
   }

   public void S141( )
   {
      /* 'DISPORIG' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P006L16 */
      pr_default.execute(13, new Object[] {AV44DisNumUni, Short.valueOf(AV43DisNumPie), A396EmprCod, Integer.valueOf(AV27DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* End optimized UPDATE. */
   }

   public void S151( )
   {
      /* 'MODIFBARCAD' Routine */
      returnInSub = false ;
      /* Optimized UPDATE. */
      /* Using cursor P006L17 */
      pr_default.execute(14, new Object[] {Byte.valueOf(AV45BarSit), A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmoddih.this.A396EmprCod;
      this.aP1[0] = pmoddih.this.AV16BarCod;
      this.aP2[0] = pmoddih.this.AV17BarCodReo;
      this.aP3[0] = pmoddih.this.AV18BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmoddih");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV38Ok = "" ;
      scmdbuf = "" ;
      P006L2_A252CliCod = new int[1] ;
      P006L2_n252CliCod = new boolean[] {false} ;
      P006L2_A361DisCod = new int[1] ;
      P006L2_A218BarTipCol = new byte[1] ;
      P006L2_A135BarColNom = new String[] {""} ;
      P006L2_A136BarColNum = new int[1] ;
      P006L2_A212BarSer = new String[] {""} ;
      P006L2_A1652BarSerDsc = new String[] {""} ;
      P006L2_A217BarTipArt = new short[1] ;
      P006L2_n217BarTipArt = new boolean[] {false} ;
      P006L2_A213BarSit = new byte[1] ;
      P006L2_A365DisDes = new String[] {""} ;
      P006L2_A396EmprCod = new String[] {""} ;
      P006L2_A129BarCod = new int[1] ;
      P006L2_A132BarCodReo = new byte[1] ;
      P006L2_A130BarCodPar = new String[] {""} ;
      P006L2_A143BarDisNum = new String[] {""} ;
      P006L2_A228BarUniMed = new String[] {""} ;
      P006L2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P006L2_A235BarUrg = new byte[1] ;
      P006L2_A182BarMat = new String[] {""} ;
      P006L2_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L2_A221BarTra1 = new String[] {""} ;
      P006L2_A224BarTraP1 = new short[1] ;
      P006L2_A222BarTra2 = new String[] {""} ;
      P006L2_A225BarTraP2 = new short[1] ;
      P006L2_A223BarTra3 = new String[] {""} ;
      P006L2_A226BarTraP3 = new short[1] ;
      P006L2_A229BarUrd1 = new String[] {""} ;
      P006L2_A232BarUrdP1 = new short[1] ;
      P006L2_A230BarUrd2 = new String[] {""} ;
      P006L2_A233BarUrdP2 = new short[1] ;
      P006L2_A231BarUrd3 = new String[] {""} ;
      P006L2_A234BarUrdP3 = new short[1] ;
      P006L2_A127BarAncCru1 = new short[1] ;
      P006L2_A128BarAncCru2 = new short[1] ;
      P006L2_A125BarAncAca1 = new short[1] ;
      P006L2_A126BarAncAca2 = new short[1] ;
      P006L2_A1226BarGraCru = new short[1] ;
      P006L2_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L2_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L2_A1234BarNomCli = new String[] {""} ;
      P006L2_A1235BarNumCli = new int[1] ;
      P006L2_A206BarPle = new String[] {""} ;
      P006L2_A177BarLar = new String[] {""} ;
      P006L2_A214BarSua = new String[] {""} ;
      P006L2_A118BarAcaQui = new String[] {""} ;
      P006L2_A139BarCorOri = new String[] {""} ;
      P006L2_A145BarEncOri = new String[] {""} ;
      P006L2_A209BarPri = new String[] {""} ;
      P006L2_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P006L2_A864BarPes = new short[1] ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A365DisDes = "" ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A228BarUniMed = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A182BarMat = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A229BarUrd1 = "" ;
      A230BarUrd2 = "" ;
      A231BarUrd3 = "" ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A206BarPle = "" ;
      A177BarLar = "" ;
      A214BarSua = "" ;
      A118BarAcaQui = "" ;
      A139BarCorOri = "" ;
      A145BarEncOri = "" ;
      A209BarPri = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      P006L3_A14555DisPrePz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_A13987DisArtDsc2 = new String[] {""} ;
      P006L3_A13986DisIdtx2 = new String[] {""} ;
      P006L3_n13986DisIdtx2 = new boolean[] {false} ;
      P006L3_A13768DisTallUlt = new short[1] ;
      P006L3_A13767DisRdto4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_A13233DisRGB = new long[1] ;
      P006L3_A13080DisDGUltli = new byte[1] ;
      P006L3_A13076DisLinPrd = new String[] {""} ;
      P006L3_n13076DisLinPrd = new boolean[] {false} ;
      P006L3_A13069DisCanalID = new int[1] ;
      P006L3_n13069DisCanalID = new boolean[] {false} ;
      P006L3_A13068DisLineaID = new short[1] ;
      P006L3_n13068DisLineaID = new boolean[] {false} ;
      P006L3_A12880DisOEKOTEX = new String[] {""} ;
      P006L3_n12880DisOEKOTEX = new boolean[] {false} ;
      P006L3_A12772DisProdID = new String[] {""} ;
      P006L3_n12772DisProdID = new boolean[] {false} ;
      P006L3_A12768DisTpEstam = new byte[1] ;
      P006L3_A12765DisPriorid = new byte[1] ;
      P006L3_A12328RevenID = new String[] {""} ;
      P006L3_n12328RevenID = new boolean[] {false} ;
      P006L3_A11864Nxt_artcli = new String[] {""} ;
      P006L3_A11863DptoID = new short[1] ;
      P006L3_n11863DptoID = new boolean[] {false} ;
      P006L3_A11862DesaID = new short[1] ;
      P006L3_n11862DesaID = new boolean[] {false} ;
      P006L3_A11861Nxt_statio = new String[] {""} ;
      P006L3_A11860CpteId = new short[1] ;
      P006L3_n11860CpteId = new boolean[] {false} ;
      P006L3_A11859Nxt_modelo = new String[] {""} ;
      P006L3_A11734DisCnoEncO = new String[] {""} ;
      P006L3_A11661DisOrdComp = new String[] {""} ;
      P006L3_A11659MarcaId = new String[] {""} ;
      P006L3_n11659MarcaId = new boolean[] {false} ;
      P006L3_A11658DisMemo2 = new String[] {""} ;
      P006L3_A11657DisMemo1 = new String[] {""} ;
      P006L3_A3696DisParPar = new String[] {""} ;
      P006L3_n3696DisParPar = new boolean[] {false} ;
      P006L3_A3695DisParReo = new byte[1] ;
      P006L3_n3695DisParReo = new boolean[] {false} ;
      P006L3_A3694DisParCod = new int[1] ;
      P006L3_n3694DisParCod = new boolean[] {false} ;
      P006L3_A7067DisUltNot = new byte[1] ;
      P006L3_n7067DisUltNot = new boolean[] {false} ;
      P006L3_A4918DisDibCoDN = new int[1] ;
      P006L3_n4918DisDibCoDN = new boolean[] {false} ;
      P006L3_A4879DibColColN = new int[1] ;
      P006L3_n4879DibColColN = new boolean[] {false} ;
      P006L3_A4919DisDibCoCN = new int[1] ;
      P006L3_n4919DisDibCoCN = new boolean[] {false} ;
      P006L3_A4877DibColCol = new String[] {""} ;
      P006L3_n4877DibColCol = new boolean[] {false} ;
      P006L3_A4476DisAcaFor = new int[1] ;
      P006L3_n4476DisAcaFor = new boolean[] {false} ;
      P006L3_A4475DisLotMaq = new String[] {""} ;
      P006L3_n4475DisLotMaq = new boolean[] {false} ;
      P006L3_A4472DisLotPza = new short[1] ;
      P006L3_n4472DisLotPza = new boolean[] {false} ;
      P006L3_A4355DisFecPed = new java.util.Date[] {GXutil.nullDate()} ;
      P006L3_n4355DisFecPed = new boolean[] {false} ;
      P006L3_A10887Cod_Idtx = new String[] {""} ;
      P006L3_n10887Cod_Idtx = new boolean[] {false} ;
      P006L3_A9787DisItem6 = new String[] {""} ;
      P006L3_A9786DisItem5 = new String[] {""} ;
      P006L3_A9774DisItem4 = new String[] {""} ;
      P006L3_A9773DisItem3 = new String[] {""} ;
      P006L3_A9772DisItem2 = new String[] {""} ;
      P006L3_A9771DisItem1 = new String[] {""} ;
      P006L3_A8887DisFchT = new java.util.Date[] {GXutil.nullDate()} ;
      P006L3_n8887DisFchT = new boolean[] {false} ;
      P006L3_A8886DisDest = new String[] {""} ;
      P006L3_A8885DisFEnt = new String[] {""} ;
      P006L3_n8885DisFEnt = new boolean[] {false} ;
      P006L3_A7739DisExp = new String[] {""} ;
      P006L3_A7738DisMaqEst = new String[] {""} ;
      P006L3_A7523DisRec = new String[] {""} ;
      P006L3_A7516DisGraTam = new String[] {""} ;
      P006L3_n7516DisGraTam = new boolean[] {false} ;
      P006L3_A7515DisDesCol = new byte[1] ;
      P006L3_n7515DisDesCol = new boolean[] {false} ;
      P006L3_A7514DisOrdGra = new byte[1] ;
      P006L3_A7513DisOrdSep = new byte[1] ;
      P006L3_A7512DisFacGra = new byte[1] ;
      P006L3_n7512DisFacGra = new boolean[] {false} ;
      P006L3_A7511DisFacSep = new byte[1] ;
      P006L3_n7511DisFacSep = new boolean[] {false} ;
      P006L3_A7510DisDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_n7510DisDto = new boolean[] {false} ;
      P006L3_A6548DisRbMaq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_A6547DisVolMaq = new int[1] ;
      P006L3_A5405DisAntpT = new String[] {""} ;
      P006L3_A5366DisAntp = new String[] {""} ;
      P006L3_A5350DisObsAnc = new String[] {""} ;
      P006L3_A5349DisObsGrm = new String[] {""} ;
      P006L3_A5290DisTipCor = new String[] {""} ;
      P006L3_A5252DisAcc = new String[] {""} ;
      P006L3_A5032DisEstTip = new String[] {""} ;
      P006L3_A5031DisCom = new String[] {""} ;
      P006L3_n5031DisCom = new boolean[] {false} ;
      P006L3_A5025DisGraCob = new byte[1] ;
      P006L3_A5024DisTipEst = new byte[1] ;
      P006L3_A4876DibColDib = new String[] {""} ;
      P006L3_n4876DibColDib = new boolean[] {false} ;
      P006L3_A4813DisEncCli = new String[] {""} ;
      P006L3_A4785DisNroCor = new int[1] ;
      P006L3_A4720DisDishCod = new String[] {""} ;
      P006L3_A4617DisHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      P006L3_n4617DisHorReg = new boolean[] {false} ;
      P006L3_A4616DisHorEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P006L3_n4616DisHorEnt = new boolean[] {false} ;
      P006L3_A4615DisTam = new String[] {""} ;
      P006L3_A4614DisMdlCod = new String[] {""} ;
      P006L3_A4479DisAcaMar = new String[] {""} ;
      P006L3_A4478DisAcaAnh = new short[1] ;
      P006L3_A4477DisAcaBak = new String[] {""} ;
      P006L3_A4474DisLotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_A4473DisLotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_A4471DisCruEnr = new String[] {""} ;
      P006L3_A4470DisCruKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_A4469DisCruMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_A4468DisPelAnh = new short[1] ;
      P006L3_A4348DisUsrCod = new String[] {""} ;
      P006L3_A4294DisNPzasL = new int[1] ;
      P006L3_n4294DisNPzasL = new boolean[] {false} ;
      P006L3_A4293DisNPzas = new int[1] ;
      P006L3_n4293DisNPzas = new boolean[] {false} ;
      P006L3_A4014DisTin = new String[] {""} ;
      P006L3_A4013DisEnv = new byte[1] ;
      P006L3_n4013DisEnv = new boolean[] {false} ;
      P006L3_A2525DisComULin = new byte[1] ;
      P006L3_n2525DisComULin = new boolean[] {false} ;
      P006L3_A1052DisObs = new String[] {""} ;
      P006L3_A1051DisNumCol = new short[1] ;
      P006L3_n1051DisNumCol = new boolean[] {false} ;
      P006L3_A1014DibInt = new int[1] ;
      P006L3_n1014DibInt = new boolean[] {false} ;
      P006L3_A1013DibCli = new String[] {""} ;
      P006L3_n1013DibCli = new boolean[] {false} ;
      P006L3_A1031EmpesCod = new String[] {""} ;
      P006L3_n1031EmpesCod = new boolean[] {false} ;
      P006L3_A3841DisArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_A3826RetCod = new String[] {""} ;
      P006L3_n3826RetCod = new boolean[] {false} ;
      P006L3_A3627DisFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P006L3_n3627DisFecLan = new boolean[] {false} ;
      P006L3_A3309DisNumTon = new String[] {""} ;
      P006L3_A3308DisManCod2 = new short[1] ;
      P006L3_A3307DisManCod1 = new short[1] ;
      P006L3_A3306DisFac = new String[] {""} ;
      P006L3_A3132DisGraCru2 = new short[1] ;
      P006L3_A3131DisGraAca2 = new short[1] ;
      P006L3_A3130DisAncSal3 = new short[1] ;
      P006L3_A3129DisAncSal2 = new short[1] ;
      P006L3_A3128DisAncSal1 = new short[1] ;
      P006L3_A3127DisNumCor = new short[1] ;
      P006L3_A2835DisPle2 = new String[] {""} ;
      P006L3_A2926DisPla = new String[] {""} ;
      P006L3_A2833DisMtrLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_A2832DisKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_A2831DisNumLot = new int[1] ;
      P006L3_A2744DisNumTex2 = new short[1] ;
      P006L3_n2744DisNumTex2 = new boolean[] {false} ;
      P006L3_A2743DisNumTex1 = new byte[1] ;
      P006L3_A2742DisCodTex = new String[] {""} ;
      P006L3_n2742DisCodTex = new boolean[] {false} ;
      P006L3_A2403DisOpeAnt = new int[1] ;
      P006L3_n2403DisOpeAnt = new boolean[] {false} ;
      P006L3_A2402DisManCod = new short[1] ;
      P006L3_A2310DisCliDes = new int[1] ;
      P006L3_A2267DisNumBas = new short[1] ;
      P006L3_n2267DisNumBas = new boolean[] {false} ;
      P006L3_A2009DisTipDis = new String[] {""} ;
      P006L3_n2009DisTipDis = new boolean[] {false} ;
      P006L3_A1968DisRes = new String[] {""} ;
      P006L3_n1968DisRes = new boolean[] {false} ;
      P006L3_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_A1907DisRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_A1906DisGraAca = new short[1] ;
      P006L3_A1502DisPart = new short[1] ;
      P006L3_A1430DisLoc = new String[] {""} ;
      P006L3_A1157TipConCod = new short[1] ;
      P006L3_n1157TipConCod = new boolean[] {false} ;
      P006L3_A966PartCod = new String[] {""} ;
      P006L3_n966PartCod = new boolean[] {false} ;
      P006L3_A1122MaqCodDis = new String[] {""} ;
      P006L3_n1122MaqCodDis = new boolean[] {false} ;
      P006L3_A1002DisNumTen = new String[] {""} ;
      P006L3_n1002DisNumTen = new boolean[] {false} ;
      P006L3_A999DisNMez = new String[] {""} ;
      P006L3_A998DisNMtr = new String[] {""} ;
      P006L3_A373DisMtrLan = new short[1] ;
      P006L3_A372DisKgmLan = new short[1] ;
      P006L3_A383DisPieLan = new short[1] ;
      P006L3_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_A367DisEst = new byte[1] ;
      P006L3_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P006L3_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L3_A374DisNumPie = new short[1] ;
      P006L3_A362DisColNom = new String[] {""} ;
      P006L3_n362DisColNom = new boolean[] {false} ;
      P006L3_A363DisColNum = new int[1] ;
      P006L3_n363DisColNum = new boolean[] {false} ;
      A14555DisPrePz = DecimalUtil.ZERO ;
      A13987DisArtDsc2 = "" ;
      A13986DisIdtx2 = "" ;
      A13767DisRdto4 = DecimalUtil.ZERO ;
      A13076DisLinPrd = "" ;
      A12880DisOEKOTEX = "" ;
      A12772DisProdID = "" ;
      A12328RevenID = "" ;
      A11864Nxt_artcli = "" ;
      A11861Nxt_statio = "" ;
      A11859Nxt_modelo = "" ;
      A11734DisCnoEncO = "" ;
      A11661DisOrdComp = "" ;
      A11659MarcaId = "" ;
      A11658DisMemo2 = "" ;
      A11657DisMemo1 = "" ;
      A3696DisParPar = "" ;
      A4877DibColCol = "" ;
      A4475DisLotMaq = "" ;
      A4355DisFecPed = GXutil.nullDate() ;
      A10887Cod_Idtx = "" ;
      A9787DisItem6 = "" ;
      A9786DisItem5 = "" ;
      A9774DisItem4 = "" ;
      A9773DisItem3 = "" ;
      A9772DisItem2 = "" ;
      A9771DisItem1 = "" ;
      A8887DisFchT = GXutil.nullDate() ;
      A8886DisDest = "" ;
      A8885DisFEnt = "" ;
      A7739DisExp = "" ;
      A7738DisMaqEst = "" ;
      A7523DisRec = "" ;
      A7516DisGraTam = "" ;
      A7510DisDto = DecimalUtil.ZERO ;
      A6548DisRbMaq = DecimalUtil.ZERO ;
      A5405DisAntpT = "" ;
      A5366DisAntp = "" ;
      A5350DisObsAnc = "" ;
      A5349DisObsGrm = "" ;
      A5290DisTipCor = "" ;
      A5252DisAcc = "" ;
      A5032DisEstTip = "" ;
      A5031DisCom = "" ;
      A4876DibColDib = "" ;
      A4813DisEncCli = "" ;
      A4720DisDishCod = "" ;
      A4617DisHorReg = GXutil.resetTime( GXutil.nullDate() );
      A4616DisHorEnt = GXutil.resetTime( GXutil.nullDate() );
      A4615DisTam = "" ;
      A4614DisMdlCod = "" ;
      A4479DisAcaMar = "" ;
      A4477DisAcaBak = "" ;
      A4474DisLotKgs = DecimalUtil.ZERO ;
      A4473DisLotMts = DecimalUtil.ZERO ;
      A4471DisCruEnr = "" ;
      A4470DisCruKgs = DecimalUtil.ZERO ;
      A4469DisCruMts = DecimalUtil.ZERO ;
      A4348DisUsrCod = "" ;
      A4014DisTin = "" ;
      A1052DisObs = "" ;
      A1013DibCli = "" ;
      A1031EmpesCod = "" ;
      A3841DisArtMer = DecimalUtil.ZERO ;
      A3826RetCod = "" ;
      A3627DisFecLan = GXutil.nullDate() ;
      A3309DisNumTon = "" ;
      A3306DisFac = "" ;
      A2835DisPle2 = "" ;
      A2926DisPla = "" ;
      A2833DisMtrLot = DecimalUtil.ZERO ;
      A2832DisKgsLot = DecimalUtil.ZERO ;
      A2742DisCodTex = "" ;
      A2009DisTipDis = "" ;
      A1968DisRes = "" ;
      A1908DisRdoA = DecimalUtil.ZERO ;
      A1907DisRdoN = DecimalUtil.ZERO ;
      A1430DisLoc = "" ;
      A966PartCod = "" ;
      A1122MaqCodDis = "" ;
      A1002DisNumTen = "" ;
      A999DisNMez = "" ;
      A998DisNMtr = "" ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      A369DisFec = GXutil.nullDate() ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A362DisColNom = "" ;
      P006L5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P006L5_A199BarPie1 = new short[1] ;
      P006L5_A898BarPieNDes = new int[1] ;
      A166BarKgm = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      AV30BarColNom = "" ;
      AV32BarSer = "" ;
      AV40BarSerDsc = "" ;
      AV39BarDisNum = "" ;
      P006L6_AV25Contador = new short[1] ;
      AV41DisNumUni0 = DecimalUtil.ZERO ;
      AV44DisNumUni = DecimalUtil.ZERO ;
      GXv_int5 = new short[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      W360DisCliNum = "" ;
      A360DisCliNum = "" ;
      W335DisArtCod = "" ;
      A335DisArtCod = "" ;
      W337DisArtDsc = "" ;
      A337DisArtDsc = "" ;
      W362DisColNom = "" ;
      W375DisNumUni = DecimalUtil.ZERO ;
      W392DisUniMed = "" ;
      A392DisUniMed = "" ;
      W370DisFecCli = GXutil.nullDate() ;
      A370DisFecCli = GXutil.nullDate() ;
      W341DisArtOpe = "" ;
      A341DisArtOpe = "" ;
      W340DisArtMat = "" ;
      A340DisArtMat = "" ;
      W350DisArtRdt = DecimalUtil.ZERO ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      W353DisArtTr1 = "" ;
      A353DisArtTr1 = "" ;
      W354DisArtTr2 = "" ;
      A354DisArtTr2 = "" ;
      W355DisArtTr3 = "" ;
      A355DisArtTr3 = "" ;
      W356DisArtUr1 = "" ;
      A356DisArtUr1 = "" ;
      W357DisArtUr2 = "" ;
      A357DisArtUr2 = "" ;
      W358DisArtUr3 = "" ;
      A358DisArtUr3 = "" ;
      W1197DisEncCom = DecimalUtil.ZERO ;
      A1197DisEncCom = DecimalUtil.ZERO ;
      W1198DisEncAnh = DecimalUtil.ZERO ;
      A1198DisEncAnh = DecimalUtil.ZERO ;
      W1195DisNomCli = "" ;
      A1195DisNomCli = "" ;
      W343DisArtPle = "" ;
      A343DisArtPle = "" ;
      W339DisArtLar = "" ;
      A339DisArtLar = "" ;
      W351DisArtSua = "" ;
      A351DisArtSua = "" ;
      W333DisArtAca = "" ;
      A333DisArtAca = "" ;
      W336DisArtCor = "" ;
      A336DisArtCor = "" ;
      W338DisArtEnc = "" ;
      A338DisArtEnc = "" ;
      W757PriCod = "" ;
      A757PriCod = "" ;
      W371DisFecEnt = GXutil.nullDate() ;
      A371DisFecEnt = GXutil.nullDate() ;
      W366DisEnt = "" ;
      A366DisEnt = "" ;
      AV26DisArtOpe = "" ;
      AV20DisEnt = "" ;
      Gx_emsg = "" ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_date12 = new java.util.Date[1] ;
      A1141DisBarPar = "" ;
      GXv_char2 = new String[1] ;
      GXv_int13 = new byte[1] ;
      GXv_int7 = new short[1] ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int4 = new int[1] ;
      P006L13_A396EmprCod = new String[] {""} ;
      P006L13_A361DisCod = new int[1] ;
      P006L13_A366DisEnt = new String[] {""} ;
      P006L13_A378DisObsULin = new byte[1] ;
      P006L13_A365DisDes = new String[] {""} ;
      P006L13_A341DisArtOpe = new String[] {""} ;
      AV19DisDes = "" ;
      P006L14_A396EmprCod = new String[] {""} ;
      P006L14_A831TipColCod = new byte[1] ;
      P006L14_A483ForColNum = new int[1] ;
      P006L14_A482ForColNom = new String[] {""} ;
      P006L14_A494ForSer = new String[] {""} ;
      P006L14_A252CliCod = new int[1] ;
      P006L14_n252CliCod = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P006L15_A396EmprCod = new String[] {""} ;
      P006L15_A829TipArtCod = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmoddih__default(),
         new Object[] {
             new Object[] {
            P006L2_A252CliCod, P006L2_n252CliCod, P006L2_A361DisCod, P006L2_A218BarTipCol, P006L2_A135BarColNom, P006L2_A136BarColNum, P006L2_A212BarSer, P006L2_A1652BarSerDsc, P006L2_A217BarTipArt, P006L2_n217BarTipArt,
            P006L2_A213BarSit, P006L2_A365DisDes, P006L2_A396EmprCod, P006L2_A129BarCod, P006L2_A132BarCodReo, P006L2_A130BarCodPar, P006L2_A143BarDisNum, P006L2_A228BarUniMed, P006L2_A155BarFecCli, P006L2_A235BarUrg,
            P006L2_A182BarMat, P006L2_A211BarRdt, P006L2_A221BarTra1, P006L2_A224BarTraP1, P006L2_A222BarTra2, P006L2_A225BarTraP2, P006L2_A223BarTra3, P006L2_A226BarTraP3, P006L2_A229BarUrd1, P006L2_A232BarUrdP1,
            P006L2_A230BarUrd2, P006L2_A233BarUrdP2, P006L2_A231BarUrd3, P006L2_A234BarUrdP3, P006L2_A127BarAncCru1, P006L2_A128BarAncCru2, P006L2_A125BarAncAca1, P006L2_A126BarAncAca2, P006L2_A1226BarGraCru, P006L2_A1223BarEncCom,
            P006L2_A1224BarEncAnh, P006L2_A1234BarNomCli, P006L2_A1235BarNumCli, P006L2_A206BarPle, P006L2_A177BarLar, P006L2_A214BarSua, P006L2_A118BarAcaQui, P006L2_A139BarCorOri, P006L2_A145BarEncOri, P006L2_A209BarPri,
            P006L2_A158BarFecFpr, P006L2_A864BarPes
            }
            , new Object[] {
            P006L3_A14555DisPrePz, P006L3_A13987DisArtDsc2, P006L3_A13986DisIdtx2, P006L3_n13986DisIdtx2, P006L3_A13768DisTallUlt, P006L3_A13767DisRdto4, P006L3_A13233DisRGB, P006L3_A13080DisDGUltli, P006L3_A13076DisLinPrd, P006L3_n13076DisLinPrd,
            P006L3_A13069DisCanalID, P006L3_n13069DisCanalID, P006L3_A13068DisLineaID, P006L3_n13068DisLineaID, P006L3_A12880DisOEKOTEX, P006L3_n12880DisOEKOTEX, P006L3_A12772DisProdID, P006L3_n12772DisProdID, P006L3_A12768DisTpEstam, P006L3_A12765DisPriorid,
            P006L3_A12328RevenID, P006L3_n12328RevenID, P006L3_A11864Nxt_artcli, P006L3_A11863DptoID, P006L3_n11863DptoID, P006L3_A11862DesaID, P006L3_n11862DesaID, P006L3_A11861Nxt_statio, P006L3_A11860CpteId, P006L3_n11860CpteId,
            P006L3_A11859Nxt_modelo, P006L3_A11734DisCnoEncO, P006L3_A11661DisOrdComp, P006L3_A11659MarcaId, P006L3_n11659MarcaId, P006L3_A11658DisMemo2, P006L3_A11657DisMemo1, P006L3_A3696DisParPar, P006L3_n3696DisParPar, P006L3_A3695DisParReo,
            P006L3_n3695DisParReo, P006L3_A3694DisParCod, P006L3_n3694DisParCod, P006L3_A7067DisUltNot, P006L3_n7067DisUltNot, P006L3_A4918DisDibCoDN, P006L3_n4918DisDibCoDN, P006L3_A4879DibColColN, P006L3_n4879DibColColN, P006L3_A4919DisDibCoCN,
            P006L3_n4919DisDibCoCN, P006L3_A4877DibColCol, P006L3_n4877DibColCol, P006L3_A4476DisAcaFor, P006L3_n4476DisAcaFor, P006L3_A4475DisLotMaq, P006L3_n4475DisLotMaq, P006L3_A4472DisLotPza, P006L3_n4472DisLotPza, P006L3_A4355DisFecPed,
            P006L3_n4355DisFecPed, P006L3_A10887Cod_Idtx, P006L3_n10887Cod_Idtx, P006L3_A9787DisItem6, P006L3_A9786DisItem5, P006L3_A9774DisItem4, P006L3_A9773DisItem3, P006L3_A9772DisItem2, P006L3_A9771DisItem1, P006L3_A8887DisFchT,
            P006L3_n8887DisFchT, P006L3_A8886DisDest, P006L3_A8885DisFEnt, P006L3_n8885DisFEnt, P006L3_A7739DisExp, P006L3_A7738DisMaqEst, P006L3_A7523DisRec, P006L3_A7516DisGraTam, P006L3_n7516DisGraTam, P006L3_A7515DisDesCol,
            P006L3_n7515DisDesCol, P006L3_A7514DisOrdGra, P006L3_A7513DisOrdSep, P006L3_A7512DisFacGra, P006L3_n7512DisFacGra, P006L3_A7511DisFacSep, P006L3_n7511DisFacSep, P006L3_A7510DisDto, P006L3_n7510DisDto, P006L3_A6548DisRbMaq,
            P006L3_A6547DisVolMaq, P006L3_A5405DisAntpT, P006L3_A5366DisAntp, P006L3_A5350DisObsAnc, P006L3_A5349DisObsGrm, P006L3_A5290DisTipCor, P006L3_A5252DisAcc, P006L3_A5032DisEstTip, P006L3_A5031DisCom, P006L3_n5031DisCom,
            P006L3_A5025DisGraCob, P006L3_A5024DisTipEst, P006L3_A4876DibColDib, P006L3_n4876DibColDib, P006L3_A4813DisEncCli, P006L3_A4785DisNroCor, P006L3_A4720DisDishCod, P006L3_A4617DisHorReg, P006L3_n4617DisHorReg, P006L3_A4616DisHorEnt,
            P006L3_n4616DisHorEnt, P006L3_A4615DisTam, P006L3_A4614DisMdlCod, P006L3_A4479DisAcaMar, P006L3_A4478DisAcaAnh, P006L3_A4477DisAcaBak, P006L3_A4474DisLotKgs, P006L3_A4473DisLotMts, P006L3_A4471DisCruEnr, P006L3_A4470DisCruKgs,
            P006L3_A4469DisCruMts, P006L3_A4468DisPelAnh, P006L3_A4348DisUsrCod, P006L3_A4294DisNPzasL, P006L3_n4294DisNPzasL, P006L3_A4293DisNPzas, P006L3_n4293DisNPzas, P006L3_A4014DisTin, P006L3_A4013DisEnv, P006L3_n4013DisEnv,
            P006L3_A2525DisComULin, P006L3_n2525DisComULin, P006L3_A1052DisObs, P006L3_A1051DisNumCol, P006L3_n1051DisNumCol, P006L3_A1014DibInt, P006L3_n1014DibInt, P006L3_A1013DibCli, P006L3_n1013DibCli, P006L3_A1031EmpesCod,
            P006L3_n1031EmpesCod, P006L3_A3841DisArtMer, P006L3_A3826RetCod, P006L3_n3826RetCod, P006L3_A3627DisFecLan, P006L3_n3627DisFecLan, P006L3_A3309DisNumTon, P006L3_A3308DisManCod2, P006L3_A3307DisManCod1, P006L3_A3306DisFac,
            P006L3_A3132DisGraCru2, P006L3_A3131DisGraAca2, P006L3_A3130DisAncSal3, P006L3_A3129DisAncSal2, P006L3_A3128DisAncSal1, P006L3_A3127DisNumCor, P006L3_A2835DisPle2, P006L3_A2926DisPla, P006L3_A2833DisMtrLot, P006L3_A2832DisKgsLot,
            P006L3_A2831DisNumLot, P006L3_A2744DisNumTex2, P006L3_n2744DisNumTex2, P006L3_A2743DisNumTex1, P006L3_A2742DisCodTex, P006L3_n2742DisCodTex, P006L3_A2403DisOpeAnt, P006L3_n2403DisOpeAnt, P006L3_A2402DisManCod, P006L3_A2310DisCliDes,
            P006L3_A2267DisNumBas, P006L3_n2267DisNumBas, P006L3_A2009DisTipDis, P006L3_n2009DisTipDis, P006L3_A1968DisRes, P006L3_n1968DisRes, P006L3_A1908DisRdoA, P006L3_A1907DisRdoN, P006L3_A1906DisGraAca, P006L3_A1502DisPart,
            P006L3_A1430DisLoc, P006L3_A1157TipConCod, P006L3_n1157TipConCod, P006L3_A966PartCod, P006L3_n966PartCod, P006L3_A1122MaqCodDis, P006L3_n1122MaqCodDis, P006L3_A1002DisNumTen, P006L3_n1002DisNumTen, P006L3_A999DisNMez,
            P006L3_A998DisNMtr, P006L3_A373DisMtrLan, P006L3_A372DisKgmLan, P006L3_A383DisPieLan, P006L3_A389DisPreMtr, P006L3_A388DisPreKgm, P006L3_A367DisEst, P006L3_A369DisFec, P006L3_A375DisNumUni, P006L3_A374DisNumPie,
            P006L3_A362DisColNom, P006L3_n362DisColNom, P006L3_A363DisColNum, P006L3_n363DisColNum
            }
            , new Object[] {
            P006L5_A166BarKgm, P006L5_A199BarPie1, P006L5_A898BarPieNDes
            }
            , new Object[] {
            P006L6_AV25Contador
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P006L13_A396EmprCod, P006L13_A361DisCod, P006L13_A366DisEnt, P006L13_A378DisObsULin, P006L13_A365DisDes, P006L13_A341DisArtOpe
            }
            , new Object[] {
            P006L14_A396EmprCod, P006L14_A831TipColCod, P006L14_A483ForColNum, P006L14_A482ForColNom, P006L14_A494ForSer, P006L14_A252CliCod
            }
            , new Object[] {
            P006L15_A396EmprCod, P006L15_A829TipArtCod
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

   private byte AV17BarCodReo ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte A235BarUrg ;
   private byte A13080DisDGUltli ;
   private byte A12768DisTpEstam ;
   private byte A12765DisPriorid ;
   private byte A3695DisParReo ;
   private byte A7067DisUltNot ;
   private byte A7515DisDesCol ;
   private byte A7514DisOrdGra ;
   private byte A7513DisOrdSep ;
   private byte A7512DisFacGra ;
   private byte A7511DisFacSep ;
   private byte A5025DisGraCob ;
   private byte A5024DisTipEst ;
   private byte A4013DisEnv ;
   private byte A2525DisComULin ;
   private byte A2743DisNumTex1 ;
   private byte A367DisEst ;
   private byte AV29BarTipCol ;
   private byte AV45BarSit ;
   private byte W390DisTipCol ;
   private byte A390DisTipCol ;
   private byte W359DisArtUrg ;
   private byte A359DisArtUrg ;
   private byte W378DisObsULin ;
   private byte A378DisObsULin ;
   private byte AV21DisObsULin ;
   private byte A1140DisBarReo ;
   private byte GXv_int13[] ;
   private byte AV36FlagCol ;
   private byte A831TipColCod ;
   private byte AV37FlagTArt ;
   private short A217BarTipArt ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A232BarUrdP1 ;
   private short A233BarUrdP2 ;
   private short A234BarUrdP3 ;
   private short A127BarAncCru1 ;
   private short A128BarAncCru2 ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short A1226BarGraCru ;
   private short A864BarPes ;
   private short A13768DisTallUlt ;
   private short A13068DisLineaID ;
   private short A11863DptoID ;
   private short A11862DesaID ;
   private short A11860CpteId ;
   private short A4472DisLotPza ;
   private short A4478DisAcaAnh ;
   private short A4468DisPelAnh ;
   private short A1051DisNumCol ;
   private short A3308DisManCod2 ;
   private short A3307DisManCod1 ;
   private short A3132DisGraCru2 ;
   private short A3131DisGraAca2 ;
   private short A3130DisAncSal3 ;
   private short A3129DisAncSal2 ;
   private short A3128DisAncSal1 ;
   private short A3127DisNumCor ;
   private short A2744DisNumTex2 ;
   private short A2402DisManCod ;
   private short A2267DisNumBas ;
   private short A1906DisGraAca ;
   private short A1502DisPart ;
   private short A1157TipConCod ;
   private short A373DisMtrLan ;
   private short A372DisKgmLan ;
   private short A383DisPieLan ;
   private short A374DisNumPie ;
   private short A199BarPie1 ;
   private short AV33BarTipArt ;
   private short AV25Contador ;
   private short cV25Contador ;
   private short AV42DisNumPieO ;
   private short AV43DisNumPie ;
   private short GXv_int5[] ;
   private short W352DisArtTip ;
   private short A352DisArtTip ;
   private short W374DisNumPie ;
   private short W344DisArtPt1 ;
   private short A344DisArtPt1 ;
   private short W345DisArtPt2 ;
   private short A345DisArtPt2 ;
   private short W346DisArtPt3 ;
   private short A346DisArtPt3 ;
   private short W347DisArtPu1 ;
   private short A347DisArtPu1 ;
   private short W348DisArtPu2 ;
   private short A348DisArtPu2 ;
   private short W349DisArtPu3 ;
   private short A349DisArtPu3 ;
   private short W334DisArtAnh ;
   private short A334DisArtAnh ;
   private short W1231DisArtAn1 ;
   private short A1231DisArtAn1 ;
   private short W1232DisArtAcb ;
   private short A1232DisArtAcb ;
   private short W1233DisArtAc2 ;
   private short A1233DisArtAc2 ;
   private short W1225DisGraCru ;
   private short A1225DisGraCru ;
   private short W342DisArtPes ;
   private short A342DisArtPes ;
   private short Gx_err ;
   private short AV34Matiz ;
   private short GXv_int7[] ;
   private short A921BarMatiz ;
   private short A829TipArtCod ;
   private int AV16BarCod ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A1235BarNumCli ;
   private int A13069DisCanalID ;
   private int A3694DisParCod ;
   private int A4918DisDibCoDN ;
   private int A4879DibColColN ;
   private int A4919DisDibCoCN ;
   private int A4476DisAcaFor ;
   private int A6547DisVolMaq ;
   private int A4785DisNroCor ;
   private int A4294DisNPzasL ;
   private int A4293DisNPzas ;
   private int A1014DibInt ;
   private int A2831DisNumLot ;
   private int A2403DisOpeAnt ;
   private int A2310DisCliDes ;
   private int A363DisColNum ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV35CliCod ;
   private int AV27DisCod ;
   private int AV31BarColNum ;
   private int AV15ContVal ;
   private int GX_INS34 ;
   private int W361DisCod ;
   private int W363DisColNum ;
   private int W1196DisNumCli ;
   private int A1196DisNumCli ;
   private int GXv_int3[] ;
   private int GX_INS153 ;
   private int A1146DisDisCod ;
   private int A1139DisBarCod ;
   private int GXv_int11[] ;
   private int GXv_int4[] ;
   private int A483ForColNum ;
   private long A13233DisRGB ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A14555DisPrePz ;
   private java.math.BigDecimal A13767DisRdto4 ;
   private java.math.BigDecimal A7510DisDto ;
   private java.math.BigDecimal A6548DisRbMaq ;
   private java.math.BigDecimal A4474DisLotKgs ;
   private java.math.BigDecimal A4473DisLotMts ;
   private java.math.BigDecimal A4470DisCruKgs ;
   private java.math.BigDecimal A4469DisCruMts ;
   private java.math.BigDecimal A3841DisArtMer ;
   private java.math.BigDecimal A2833DisMtrLot ;
   private java.math.BigDecimal A2832DisKgsLot ;
   private java.math.BigDecimal A1908DisRdoA ;
   private java.math.BigDecimal A1907DisRdoN ;
   private java.math.BigDecimal A389DisPreMtr ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV41DisNumUni0 ;
   private java.math.BigDecimal AV44DisNumUni ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal W375DisNumUni ;
   private java.math.BigDecimal W350DisArtRdt ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal W1197DisEncCom ;
   private java.math.BigDecimal A1197DisEncCom ;
   private java.math.BigDecimal W1198DisEncAnh ;
   private java.math.BigDecimal A1198DisEncAnh ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String AV18BarCodPar ;
   private String AV38Ok ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A365DisDes ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A228BarUniMed ;
   private String A182BarMat ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A229BarUrd1 ;
   private String A230BarUrd2 ;
   private String A231BarUrd3 ;
   private String A1234BarNomCli ;
   private String A206BarPle ;
   private String A177BarLar ;
   private String A214BarSua ;
   private String A118BarAcaQui ;
   private String A139BarCorOri ;
   private String A145BarEncOri ;
   private String A209BarPri ;
   private String A13986DisIdtx2 ;
   private String A13076DisLinPrd ;
   private String A12880DisOEKOTEX ;
   private String A12772DisProdID ;
   private String A12328RevenID ;
   private String A11864Nxt_artcli ;
   private String A11861Nxt_statio ;
   private String A11859Nxt_modelo ;
   private String A11659MarcaId ;
   private String A3696DisParPar ;
   private String A4877DibColCol ;
   private String A4475DisLotMaq ;
   private String A10887Cod_Idtx ;
   private String A9787DisItem6 ;
   private String A9786DisItem5 ;
   private String A9774DisItem4 ;
   private String A9773DisItem3 ;
   private String A9772DisItem2 ;
   private String A9771DisItem1 ;
   private String A8886DisDest ;
   private String A8885DisFEnt ;
   private String A7739DisExp ;
   private String A7738DisMaqEst ;
   private String A7523DisRec ;
   private String A7516DisGraTam ;
   private String A5405DisAntpT ;
   private String A5366DisAntp ;
   private String A5350DisObsAnc ;
   private String A5349DisObsGrm ;
   private String A5290DisTipCor ;
   private String A5252DisAcc ;
   private String A5032DisEstTip ;
   private String A5031DisCom ;
   private String A4876DibColDib ;
   private String A4813DisEncCli ;
   private String A4720DisDishCod ;
   private String A4615DisTam ;
   private String A4614DisMdlCod ;
   private String A4479DisAcaMar ;
   private String A4477DisAcaBak ;
   private String A4471DisCruEnr ;
   private String A4348DisUsrCod ;
   private String A4014DisTin ;
   private String A1052DisObs ;
   private String A1013DibCli ;
   private String A1031EmpesCod ;
   private String A3826RetCod ;
   private String A3309DisNumTon ;
   private String A3306DisFac ;
   private String A2835DisPle2 ;
   private String A2926DisPla ;
   private String A2742DisCodTex ;
   private String A2009DisTipDis ;
   private String A1968DisRes ;
   private String A1430DisLoc ;
   private String A966PartCod ;
   private String A1122MaqCodDis ;
   private String A1002DisNumTen ;
   private String A999DisNMez ;
   private String A998DisNMtr ;
   private String A362DisColNom ;
   private String W396EmprCod ;
   private String AV30BarColNom ;
   private String AV32BarSer ;
   private String AV40BarSerDsc ;
   private String AV39BarDisNum ;
   private String W360DisCliNum ;
   private String A360DisCliNum ;
   private String W335DisArtCod ;
   private String A335DisArtCod ;
   private String W337DisArtDsc ;
   private String A337DisArtDsc ;
   private String W362DisColNom ;
   private String W392DisUniMed ;
   private String A392DisUniMed ;
   private String W341DisArtOpe ;
   private String A341DisArtOpe ;
   private String W340DisArtMat ;
   private String A340DisArtMat ;
   private String W353DisArtTr1 ;
   private String A353DisArtTr1 ;
   private String W354DisArtTr2 ;
   private String A354DisArtTr2 ;
   private String W355DisArtTr3 ;
   private String A355DisArtTr3 ;
   private String W356DisArtUr1 ;
   private String A356DisArtUr1 ;
   private String W357DisArtUr2 ;
   private String A357DisArtUr2 ;
   private String W358DisArtUr3 ;
   private String A358DisArtUr3 ;
   private String W1195DisNomCli ;
   private String A1195DisNomCli ;
   private String W343DisArtPle ;
   private String A343DisArtPle ;
   private String W339DisArtLar ;
   private String A339DisArtLar ;
   private String W351DisArtSua ;
   private String A351DisArtSua ;
   private String W333DisArtAca ;
   private String A333DisArtAca ;
   private String W336DisArtCor ;
   private String A336DisArtCor ;
   private String W338DisArtEnc ;
   private String A338DisArtEnc ;
   private String W757PriCod ;
   private String A757PriCod ;
   private String W366DisEnt ;
   private String A366DisEnt ;
   private String AV26DisArtOpe ;
   private String AV20DisEnt ;
   private String Gx_emsg ;
   private String GXv_char1[] ;
   private String A1141DisBarPar ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String AV19DisDes ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private java.util.Date A4617DisHorReg ;
   private java.util.Date A4616DisHorEnt ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A4355DisFecPed ;
   private java.util.Date A8887DisFchT ;
   private java.util.Date A3627DisFecLan ;
   private java.util.Date A369DisFec ;
   private java.util.Date W370DisFecCli ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date W371DisFecEnt ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date GXv_date12[] ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n13986DisIdtx2 ;
   private boolean n13076DisLinPrd ;
   private boolean n13069DisCanalID ;
   private boolean n13068DisLineaID ;
   private boolean n12880DisOEKOTEX ;
   private boolean n12772DisProdID ;
   private boolean n12328RevenID ;
   private boolean n11863DptoID ;
   private boolean n11862DesaID ;
   private boolean n11860CpteId ;
   private boolean n11659MarcaId ;
   private boolean n3696DisParPar ;
   private boolean n3695DisParReo ;
   private boolean n3694DisParCod ;
   private boolean n7067DisUltNot ;
   private boolean n4918DisDibCoDN ;
   private boolean n4879DibColColN ;
   private boolean n4919DisDibCoCN ;
   private boolean n4877DibColCol ;
   private boolean n4476DisAcaFor ;
   private boolean n4475DisLotMaq ;
   private boolean n4472DisLotPza ;
   private boolean n4355DisFecPed ;
   private boolean n10887Cod_Idtx ;
   private boolean n8887DisFchT ;
   private boolean n8885DisFEnt ;
   private boolean n7516DisGraTam ;
   private boolean n7515DisDesCol ;
   private boolean n7512DisFacGra ;
   private boolean n7511DisFacSep ;
   private boolean n7510DisDto ;
   private boolean n5031DisCom ;
   private boolean n4876DibColDib ;
   private boolean n4617DisHorReg ;
   private boolean n4616DisHorEnt ;
   private boolean n4294DisNPzasL ;
   private boolean n4293DisNPzas ;
   private boolean n4013DisEnv ;
   private boolean n2525DisComULin ;
   private boolean n1051DisNumCol ;
   private boolean n1014DibInt ;
   private boolean n1013DibCli ;
   private boolean n1031EmpesCod ;
   private boolean n3826RetCod ;
   private boolean n3627DisFecLan ;
   private boolean n2744DisNumTex2 ;
   private boolean n2742DisCodTex ;
   private boolean n2403DisOpeAnt ;
   private boolean n2267DisNumBas ;
   private boolean n2009DisTipDis ;
   private boolean n1968DisRes ;
   private boolean n1157TipConCod ;
   private boolean n966PartCod ;
   private boolean n1122MaqCodDis ;
   private boolean n1002DisNumTen ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean returnInSub ;
   private boolean n390DisTipCol ;
   private boolean n349DisArtPu3 ;
   private String A13987DisArtDsc2 ;
   private String A11734DisCnoEncO ;
   private String A11661DisOrdComp ;
   private String A11658DisMemo2 ;
   private String A11657DisMemo1 ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P006L2_A252CliCod ;
   private boolean[] P006L2_n252CliCod ;
   private int[] P006L2_A361DisCod ;
   private byte[] P006L2_A218BarTipCol ;
   private String[] P006L2_A135BarColNom ;
   private int[] P006L2_A136BarColNum ;
   private String[] P006L2_A212BarSer ;
   private String[] P006L2_A1652BarSerDsc ;
   private short[] P006L2_A217BarTipArt ;
   private boolean[] P006L2_n217BarTipArt ;
   private byte[] P006L2_A213BarSit ;
   private String[] P006L2_A365DisDes ;
   private String[] P006L2_A396EmprCod ;
   private int[] P006L2_A129BarCod ;
   private byte[] P006L2_A132BarCodReo ;
   private String[] P006L2_A130BarCodPar ;
   private String[] P006L2_A143BarDisNum ;
   private String[] P006L2_A228BarUniMed ;
   private java.util.Date[] P006L2_A155BarFecCli ;
   private byte[] P006L2_A235BarUrg ;
   private String[] P006L2_A182BarMat ;
   private java.math.BigDecimal[] P006L2_A211BarRdt ;
   private String[] P006L2_A221BarTra1 ;
   private short[] P006L2_A224BarTraP1 ;
   private String[] P006L2_A222BarTra2 ;
   private short[] P006L2_A225BarTraP2 ;
   private String[] P006L2_A223BarTra3 ;
   private short[] P006L2_A226BarTraP3 ;
   private String[] P006L2_A229BarUrd1 ;
   private short[] P006L2_A232BarUrdP1 ;
   private String[] P006L2_A230BarUrd2 ;
   private short[] P006L2_A233BarUrdP2 ;
   private String[] P006L2_A231BarUrd3 ;
   private short[] P006L2_A234BarUrdP3 ;
   private short[] P006L2_A127BarAncCru1 ;
   private short[] P006L2_A128BarAncCru2 ;
   private short[] P006L2_A125BarAncAca1 ;
   private short[] P006L2_A126BarAncAca2 ;
   private short[] P006L2_A1226BarGraCru ;
   private java.math.BigDecimal[] P006L2_A1223BarEncCom ;
   private java.math.BigDecimal[] P006L2_A1224BarEncAnh ;
   private String[] P006L2_A1234BarNomCli ;
   private int[] P006L2_A1235BarNumCli ;
   private String[] P006L2_A206BarPle ;
   private String[] P006L2_A177BarLar ;
   private String[] P006L2_A214BarSua ;
   private String[] P006L2_A118BarAcaQui ;
   private String[] P006L2_A139BarCorOri ;
   private String[] P006L2_A145BarEncOri ;
   private String[] P006L2_A209BarPri ;
   private java.util.Date[] P006L2_A158BarFecFpr ;
   private short[] P006L2_A864BarPes ;
   private java.math.BigDecimal[] P006L3_A14555DisPrePz ;
   private String[] P006L3_A13987DisArtDsc2 ;
   private String[] P006L3_A13986DisIdtx2 ;
   private boolean[] P006L3_n13986DisIdtx2 ;
   private short[] P006L3_A13768DisTallUlt ;
   private java.math.BigDecimal[] P006L3_A13767DisRdto4 ;
   private long[] P006L3_A13233DisRGB ;
   private byte[] P006L3_A13080DisDGUltli ;
   private String[] P006L3_A13076DisLinPrd ;
   private boolean[] P006L3_n13076DisLinPrd ;
   private int[] P006L3_A13069DisCanalID ;
   private boolean[] P006L3_n13069DisCanalID ;
   private short[] P006L3_A13068DisLineaID ;
   private boolean[] P006L3_n13068DisLineaID ;
   private String[] P006L3_A12880DisOEKOTEX ;
   private boolean[] P006L3_n12880DisOEKOTEX ;
   private String[] P006L3_A12772DisProdID ;
   private boolean[] P006L3_n12772DisProdID ;
   private byte[] P006L3_A12768DisTpEstam ;
   private byte[] P006L3_A12765DisPriorid ;
   private String[] P006L3_A12328RevenID ;
   private boolean[] P006L3_n12328RevenID ;
   private String[] P006L3_A11864Nxt_artcli ;
   private short[] P006L3_A11863DptoID ;
   private boolean[] P006L3_n11863DptoID ;
   private short[] P006L3_A11862DesaID ;
   private boolean[] P006L3_n11862DesaID ;
   private String[] P006L3_A11861Nxt_statio ;
   private short[] P006L3_A11860CpteId ;
   private boolean[] P006L3_n11860CpteId ;
   private String[] P006L3_A11859Nxt_modelo ;
   private String[] P006L3_A11734DisCnoEncO ;
   private String[] P006L3_A11661DisOrdComp ;
   private String[] P006L3_A11659MarcaId ;
   private boolean[] P006L3_n11659MarcaId ;
   private String[] P006L3_A11658DisMemo2 ;
   private String[] P006L3_A11657DisMemo1 ;
   private String[] P006L3_A3696DisParPar ;
   private boolean[] P006L3_n3696DisParPar ;
   private byte[] P006L3_A3695DisParReo ;
   private boolean[] P006L3_n3695DisParReo ;
   private int[] P006L3_A3694DisParCod ;
   private boolean[] P006L3_n3694DisParCod ;
   private byte[] P006L3_A7067DisUltNot ;
   private boolean[] P006L3_n7067DisUltNot ;
   private int[] P006L3_A4918DisDibCoDN ;
   private boolean[] P006L3_n4918DisDibCoDN ;
   private int[] P006L3_A4879DibColColN ;
   private boolean[] P006L3_n4879DibColColN ;
   private int[] P006L3_A4919DisDibCoCN ;
   private boolean[] P006L3_n4919DisDibCoCN ;
   private String[] P006L3_A4877DibColCol ;
   private boolean[] P006L3_n4877DibColCol ;
   private int[] P006L3_A4476DisAcaFor ;
   private boolean[] P006L3_n4476DisAcaFor ;
   private String[] P006L3_A4475DisLotMaq ;
   private boolean[] P006L3_n4475DisLotMaq ;
   private short[] P006L3_A4472DisLotPza ;
   private boolean[] P006L3_n4472DisLotPza ;
   private java.util.Date[] P006L3_A4355DisFecPed ;
   private boolean[] P006L3_n4355DisFecPed ;
   private String[] P006L3_A10887Cod_Idtx ;
   private boolean[] P006L3_n10887Cod_Idtx ;
   private String[] P006L3_A9787DisItem6 ;
   private String[] P006L3_A9786DisItem5 ;
   private String[] P006L3_A9774DisItem4 ;
   private String[] P006L3_A9773DisItem3 ;
   private String[] P006L3_A9772DisItem2 ;
   private String[] P006L3_A9771DisItem1 ;
   private java.util.Date[] P006L3_A8887DisFchT ;
   private boolean[] P006L3_n8887DisFchT ;
   private String[] P006L3_A8886DisDest ;
   private String[] P006L3_A8885DisFEnt ;
   private boolean[] P006L3_n8885DisFEnt ;
   private String[] P006L3_A7739DisExp ;
   private String[] P006L3_A7738DisMaqEst ;
   private String[] P006L3_A7523DisRec ;
   private String[] P006L3_A7516DisGraTam ;
   private boolean[] P006L3_n7516DisGraTam ;
   private byte[] P006L3_A7515DisDesCol ;
   private boolean[] P006L3_n7515DisDesCol ;
   private byte[] P006L3_A7514DisOrdGra ;
   private byte[] P006L3_A7513DisOrdSep ;
   private byte[] P006L3_A7512DisFacGra ;
   private boolean[] P006L3_n7512DisFacGra ;
   private byte[] P006L3_A7511DisFacSep ;
   private boolean[] P006L3_n7511DisFacSep ;
   private java.math.BigDecimal[] P006L3_A7510DisDto ;
   private boolean[] P006L3_n7510DisDto ;
   private java.math.BigDecimal[] P006L3_A6548DisRbMaq ;
   private int[] P006L3_A6547DisVolMaq ;
   private String[] P006L3_A5405DisAntpT ;
   private String[] P006L3_A5366DisAntp ;
   private String[] P006L3_A5350DisObsAnc ;
   private String[] P006L3_A5349DisObsGrm ;
   private String[] P006L3_A5290DisTipCor ;
   private String[] P006L3_A5252DisAcc ;
   private String[] P006L3_A5032DisEstTip ;
   private String[] P006L3_A5031DisCom ;
   private boolean[] P006L3_n5031DisCom ;
   private byte[] P006L3_A5025DisGraCob ;
   private byte[] P006L3_A5024DisTipEst ;
   private String[] P006L3_A4876DibColDib ;
   private boolean[] P006L3_n4876DibColDib ;
   private String[] P006L3_A4813DisEncCli ;
   private int[] P006L3_A4785DisNroCor ;
   private String[] P006L3_A4720DisDishCod ;
   private java.util.Date[] P006L3_A4617DisHorReg ;
   private boolean[] P006L3_n4617DisHorReg ;
   private java.util.Date[] P006L3_A4616DisHorEnt ;
   private boolean[] P006L3_n4616DisHorEnt ;
   private String[] P006L3_A4615DisTam ;
   private String[] P006L3_A4614DisMdlCod ;
   private String[] P006L3_A4479DisAcaMar ;
   private short[] P006L3_A4478DisAcaAnh ;
   private String[] P006L3_A4477DisAcaBak ;
   private java.math.BigDecimal[] P006L3_A4474DisLotKgs ;
   private java.math.BigDecimal[] P006L3_A4473DisLotMts ;
   private String[] P006L3_A4471DisCruEnr ;
   private java.math.BigDecimal[] P006L3_A4470DisCruKgs ;
   private java.math.BigDecimal[] P006L3_A4469DisCruMts ;
   private short[] P006L3_A4468DisPelAnh ;
   private String[] P006L3_A4348DisUsrCod ;
   private int[] P006L3_A4294DisNPzasL ;
   private boolean[] P006L3_n4294DisNPzasL ;
   private int[] P006L3_A4293DisNPzas ;
   private boolean[] P006L3_n4293DisNPzas ;
   private String[] P006L3_A4014DisTin ;
   private byte[] P006L3_A4013DisEnv ;
   private boolean[] P006L3_n4013DisEnv ;
   private byte[] P006L3_A2525DisComULin ;
   private boolean[] P006L3_n2525DisComULin ;
   private String[] P006L3_A1052DisObs ;
   private short[] P006L3_A1051DisNumCol ;
   private boolean[] P006L3_n1051DisNumCol ;
   private int[] P006L3_A1014DibInt ;
   private boolean[] P006L3_n1014DibInt ;
   private String[] P006L3_A1013DibCli ;
   private boolean[] P006L3_n1013DibCli ;
   private String[] P006L3_A1031EmpesCod ;
   private boolean[] P006L3_n1031EmpesCod ;
   private java.math.BigDecimal[] P006L3_A3841DisArtMer ;
   private String[] P006L3_A3826RetCod ;
   private boolean[] P006L3_n3826RetCod ;
   private java.util.Date[] P006L3_A3627DisFecLan ;
   private boolean[] P006L3_n3627DisFecLan ;
   private String[] P006L3_A3309DisNumTon ;
   private short[] P006L3_A3308DisManCod2 ;
   private short[] P006L3_A3307DisManCod1 ;
   private String[] P006L3_A3306DisFac ;
   private short[] P006L3_A3132DisGraCru2 ;
   private short[] P006L3_A3131DisGraAca2 ;
   private short[] P006L3_A3130DisAncSal3 ;
   private short[] P006L3_A3129DisAncSal2 ;
   private short[] P006L3_A3128DisAncSal1 ;
   private short[] P006L3_A3127DisNumCor ;
   private String[] P006L3_A2835DisPle2 ;
   private String[] P006L3_A2926DisPla ;
   private java.math.BigDecimal[] P006L3_A2833DisMtrLot ;
   private java.math.BigDecimal[] P006L3_A2832DisKgsLot ;
   private int[] P006L3_A2831DisNumLot ;
   private short[] P006L3_A2744DisNumTex2 ;
   private boolean[] P006L3_n2744DisNumTex2 ;
   private byte[] P006L3_A2743DisNumTex1 ;
   private String[] P006L3_A2742DisCodTex ;
   private boolean[] P006L3_n2742DisCodTex ;
   private int[] P006L3_A2403DisOpeAnt ;
   private boolean[] P006L3_n2403DisOpeAnt ;
   private short[] P006L3_A2402DisManCod ;
   private int[] P006L3_A2310DisCliDes ;
   private short[] P006L3_A2267DisNumBas ;
   private boolean[] P006L3_n2267DisNumBas ;
   private String[] P006L3_A2009DisTipDis ;
   private boolean[] P006L3_n2009DisTipDis ;
   private String[] P006L3_A1968DisRes ;
   private boolean[] P006L3_n1968DisRes ;
   private java.math.BigDecimal[] P006L3_A1908DisRdoA ;
   private java.math.BigDecimal[] P006L3_A1907DisRdoN ;
   private short[] P006L3_A1906DisGraAca ;
   private short[] P006L3_A1502DisPart ;
   private String[] P006L3_A1430DisLoc ;
   private short[] P006L3_A1157TipConCod ;
   private boolean[] P006L3_n1157TipConCod ;
   private String[] P006L3_A966PartCod ;
   private boolean[] P006L3_n966PartCod ;
   private String[] P006L3_A1122MaqCodDis ;
   private boolean[] P006L3_n1122MaqCodDis ;
   private String[] P006L3_A1002DisNumTen ;
   private boolean[] P006L3_n1002DisNumTen ;
   private String[] P006L3_A999DisNMez ;
   private String[] P006L3_A998DisNMtr ;
   private short[] P006L3_A373DisMtrLan ;
   private short[] P006L3_A372DisKgmLan ;
   private short[] P006L3_A383DisPieLan ;
   private java.math.BigDecimal[] P006L3_A389DisPreMtr ;
   private java.math.BigDecimal[] P006L3_A388DisPreKgm ;
   private byte[] P006L3_A367DisEst ;
   private java.util.Date[] P006L3_A369DisFec ;
   private java.math.BigDecimal[] P006L3_A375DisNumUni ;
   private short[] P006L3_A374DisNumPie ;
   private String[] P006L3_A362DisColNom ;
   private boolean[] P006L3_n362DisColNom ;
   private int[] P006L3_A363DisColNum ;
   private boolean[] P006L3_n363DisColNum ;
   private java.math.BigDecimal[] P006L5_A166BarKgm ;
   private short[] P006L5_A199BarPie1 ;
   private int[] P006L5_A898BarPieNDes ;
   private short[] P006L6_AV25Contador ;
   private String[] P006L13_A396EmprCod ;
   private int[] P006L13_A361DisCod ;
   private String[] P006L13_A366DisEnt ;
   private byte[] P006L13_A378DisObsULin ;
   private String[] P006L13_A365DisDes ;
   private String[] P006L13_A341DisArtOpe ;
   private String[] P006L14_A396EmprCod ;
   private byte[] P006L14_A831TipColCod ;
   private int[] P006L14_A483ForColNum ;
   private String[] P006L14_A482ForColNom ;
   private String[] P006L14_A494ForSer ;
   private int[] P006L14_A252CliCod ;
   private boolean[] P006L14_n252CliCod ;
   private String[] P006L15_A396EmprCod ;
   private short[] P006L15_A829TipArtCod ;
}

final  class pmoddih__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006L2", "SELECT CliCod, DisCod, BarTipCol, BarColNom, BarColNum, BarSer, BarSerDsc, BarTipArt, BarSit, DisDes, EmprCod, BarCod, BarCodReo, BarCodPar, BarDisNum, BarUniMed, BarFecCli, BarUrg, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarGraCru, BarEncCom, BarEncAnh, BarNomCli, BarNumCli, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarPri, BarFecFpr, BarPes FROM TXPBARCAD WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006L3", "SELECT DisPrePz, DisArtDsc2, DisIdtx2, DisTallUlt, DisRdto4, DisRGB, DisDGUltli, DisLinPrd, DisCanalID, DisLineaID, DisOEKOTEX, DisProdID, DisTpEstam, DisPriorid, RevenID, Nxt_artcli, DptoID, DesaID, Nxt_statio, CpteId, Nxt_modelo, DisCnoEncO, DisOrdComp, MarcaId, DisMemo2, DisMemo1, DisParPar, DisParReo, DisParCod, DisUltNot, DisDibCoDN, DibColColN, DisDibCoCN, DibColCol, DisAcaFor, DisLotMaq, DisLotPza, DisFecPed, Cod_Idtx, DisItem6, DisItem5, DisItem4, DisItem3, DisItem2, DisItem1, DisFchT, DisDest, DisFEnt, DisExp, DisMaqEst, DisRec, DisGraTam, DisDesCol, DisOrdGra, DisOrdSep, DisFacGra, DisFacSep, DisDto, DisRbMaq, DisVolMaq, DisAntpT, DisAntp, DisObsAnc, DisObsGrm, DisTipCor, DisAcc, DisEstTip, DisCom, DisGraCob, DisTipEst, DibColDib, DisEncCli, DisNroCor, DisDishCod, DisHorReg, DisHorEnt, DisTam, DisMdlCod, DisAcaMar, DisAcaAnh, DisAcaBak, DisLotKgs, DisLotMts, DisCruEnr, DisCruKgs, DisCruMts, DisPelAnh, DisUsrCod, DisNPzasL, DisNPzas, DisTin, DisEnv, DisComULin, DisObs, DisNumCol, DibInt, DibCli, EmpesCod, DisArtMer, RetCod, DisFecLan, DisNumTon, DisManCod2, DisManCod1, DisFac, DisGraCru2, DisGraAca2, DisAncSal3, DisAncSal2, DisAncSal1, DisNumCor, DisPle2, DisPla, DisMtrLot, DisKgsLot, DisNumLot, DisNumTex2, DisNumTex1, DisCodTex, DisOpeAnt, DisManCod, DisCliDes, DisNumBas, DisTipDis, DisRes, DisRdoA, DisRdoN, DisGraAca, DisPart, DisLoc, TipConCod, PartCod, MaqCodDis, DisNumTen, DisNMez, DisNMtr, DisMtrLan, DisKgmLan, DisPieLan, DisPreMtr, DisPreKgm, DisEst, DisFec, DisNumUni, DisNumPie, DisColNom, DisColNum FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006L5", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm, COALESCE( T1.BarPie1, 0) AS BarPie1, COALESCE( T1.BarPieNDes, 0) AS BarPieNDes FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006L6", "SELECT COUNT(*) FROM TXPDISBAR WHERE EmprCod = ? and DisDisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P006L7", "INSERT INTO TXPDISPOS(EmprCod, DisCod, DisDes, DisArtCod, DisNumPie, DisNumUni, DisUniMed, DisArtPes, PriCod, DisCliNum, DisFecCli, DisFec, DisFecEnt, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisEnt, DisObsULin, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, CliCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P006L8", "INSERT INTO TXPDISBAR(EmprCod, DisDisCod, DisBarCod, DisBarReo, DisBarPar, DisNumPda) VALUES(?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISBAR")
         ,new UpdateCursor("P006L9", "DELETE FROM TXPDISBAR  WHERE EmprCod = ? and DisDisCod = ? and DisBarCod = ? and DisBarReo = ? and DisBarPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISBAR")
         ,new UpdateCursor("P006L10", "UPDATE TXPDISPOS SET DisNumUni=?, DisNumPie=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P006L11", "UPDATE TXPDISPOS SET DisCliNum=?, DisArtTip=?, DisArtDsc=?, DisArtCod=?, DisColNum=?, DisColNom=?, DisTipCol=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P006L12", "UPDATE TXPBARCAD SET BarMatiz=?, DisCod=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P006L13", "SELECT EmprCod, DisCod, DisEnt, DisObsULin, DisDes, DisArtOpe FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006L14", "SELECT * FROM (SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P006L15", "SELECT * FROM (SELECT EmprCod, TipArtCod FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P006L16", "UPDATE TXPDISPOS SET DisNumUni=?, DisNumPie=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P006L17", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((String[]) buf[16])[0] = rslt.getString(15, 8);
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(17);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 16);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[22])[0] = rslt.getString(21, 4);
               ((short[]) buf[23])[0] = rslt.getShort(22);
               ((String[]) buf[24])[0] = rslt.getString(23, 4);
               ((short[]) buf[25])[0] = rslt.getShort(24);
               ((String[]) buf[26])[0] = rslt.getString(25, 4);
               ((short[]) buf[27])[0] = rslt.getShort(26);
               ((String[]) buf[28])[0] = rslt.getString(27, 4);
               ((short[]) buf[29])[0] = rslt.getShort(28);
               ((String[]) buf[30])[0] = rslt.getString(29, 4);
               ((short[]) buf[31])[0] = rslt.getShort(30);
               ((String[]) buf[32])[0] = rslt.getString(31, 4);
               ((short[]) buf[33])[0] = rslt.getShort(32);
               ((short[]) buf[34])[0] = rslt.getShort(33);
               ((short[]) buf[35])[0] = rslt.getShort(34);
               ((short[]) buf[36])[0] = rslt.getShort(35);
               ((short[]) buf[37])[0] = rslt.getShort(36);
               ((short[]) buf[38])[0] = rslt.getShort(37);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(38,2);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(39,2);
               ((String[]) buf[41])[0] = rslt.getString(40, 13);
               ((int[]) buf[42])[0] = rslt.getInt(41);
               ((String[]) buf[43])[0] = rslt.getString(42, 10);
               ((String[]) buf[44])[0] = rslt.getString(43, 10);
               ((String[]) buf[45])[0] = rslt.getString(44, 6);
               ((String[]) buf[46])[0] = rslt.getString(45, 6);
               ((String[]) buf[47])[0] = rslt.getString(46, 1);
               ((String[]) buf[48])[0] = rslt.getString(47, 1);
               ((String[]) buf[49])[0] = rslt.getString(48, 1);
               ((java.util.Date[]) buf[50])[0] = rslt.getGXDate(49);
               ((short[]) buf[51])[0] = rslt.getShort(50);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,40);
               ((long[]) buf[6])[0] = rslt.getLong(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(13);
               ((byte[]) buf[19])[0] = rslt.getByte(14);
               ((String[]) buf[20])[0] = rslt.getString(15, 10);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(16, 30);
               ((short[]) buf[23])[0] = rslt.getShort(17);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(19, 4);
               ((short[]) buf[28])[0] = rslt.getShort(20);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(21, 30);
               ((String[]) buf[31])[0] = rslt.getVarchar(22);
               ((String[]) buf[32])[0] = rslt.getVarchar(23);
               ((String[]) buf[33])[0] = rslt.getString(24, 6);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(25);
               ((String[]) buf[36])[0] = rslt.getVarchar(26);
               ((String[]) buf[37])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((byte[]) buf[39])[0] = rslt.getByte(28);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(29);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((byte[]) buf[43])[0] = rslt.getByte(30);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((int[]) buf[45])[0] = rslt.getInt(31);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(32);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(33);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(34, 12);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((int[]) buf[53])[0] = rslt.getInt(35);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(36, 6);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(37);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(38);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(39, 4);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(40, 20);
               ((String[]) buf[64])[0] = rslt.getString(41, 20);
               ((String[]) buf[65])[0] = rslt.getString(42, 20);
               ((String[]) buf[66])[0] = rslt.getString(43, 20);
               ((String[]) buf[67])[0] = rslt.getString(44, 20);
               ((String[]) buf[68])[0] = rslt.getString(45, 20);
               ((java.util.Date[]) buf[69])[0] = rslt.getGXDate(46);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(47, 30);
               ((String[]) buf[72])[0] = rslt.getString(48, 30);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(49, 1);
               ((String[]) buf[75])[0] = rslt.getString(50, 6);
               ((String[]) buf[76])[0] = rslt.getString(51, 30);
               ((String[]) buf[77])[0] = rslt.getString(52, 1);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((byte[]) buf[79])[0] = rslt.getByte(53);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((byte[]) buf[81])[0] = rslt.getByte(54);
               ((byte[]) buf[82])[0] = rslt.getByte(55);
               ((byte[]) buf[83])[0] = rslt.getByte(56);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((byte[]) buf[85])[0] = rslt.getByte(57);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[87])[0] = rslt.getBigDecimal(58,2);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[89])[0] = rslt.getBigDecimal(59,2);
               ((int[]) buf[90])[0] = rslt.getInt(60);
               ((String[]) buf[91])[0] = rslt.getString(61, 1);
               ((String[]) buf[92])[0] = rslt.getString(62, 1);
               ((String[]) buf[93])[0] = rslt.getString(63, 20);
               ((String[]) buf[94])[0] = rslt.getString(64, 20);
               ((String[]) buf[95])[0] = rslt.getString(65, 2);
               ((String[]) buf[96])[0] = rslt.getString(66, 1);
               ((String[]) buf[97])[0] = rslt.getString(67, 1);
               ((String[]) buf[98])[0] = rslt.getString(68, 12);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((byte[]) buf[100])[0] = rslt.getByte(69);
               ((byte[]) buf[101])[0] = rslt.getByte(70);
               ((String[]) buf[102])[0] = rslt.getString(71, 30);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getString(72, 20);
               ((int[]) buf[105])[0] = rslt.getInt(73);
               ((String[]) buf[106])[0] = rslt.getString(74, 12);
               ((java.util.Date[]) buf[107])[0] = GXutil.resetDate(rslt.getGXDateTime(75));
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[109])[0] = GXutil.resetDate(rslt.getGXDateTime(76));
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getString(77, 4);
               ((String[]) buf[112])[0] = rslt.getString(78, 13);
               ((String[]) buf[113])[0] = rslt.getString(79, 1);
               ((short[]) buf[114])[0] = rslt.getShort(80);
               ((String[]) buf[115])[0] = rslt.getString(81, 1);
               ((java.math.BigDecimal[]) buf[116])[0] = rslt.getBigDecimal(82,2);
               ((java.math.BigDecimal[]) buf[117])[0] = rslt.getBigDecimal(83,2);
               ((String[]) buf[118])[0] = rslt.getString(84, 1);
               ((java.math.BigDecimal[]) buf[119])[0] = rslt.getBigDecimal(85,2);
               ((java.math.BigDecimal[]) buf[120])[0] = rslt.getBigDecimal(86,2);
               ((short[]) buf[121])[0] = rslt.getShort(87);
               ((String[]) buf[122])[0] = rslt.getString(88, 8);
               ((int[]) buf[123])[0] = rslt.getInt(89);
               ((boolean[]) buf[124])[0] = rslt.wasNull();
               ((int[]) buf[125])[0] = rslt.getInt(90);
               ((boolean[]) buf[126])[0] = rslt.wasNull();
               ((String[]) buf[127])[0] = rslt.getString(91, 1);
               ((byte[]) buf[128])[0] = rslt.getByte(92);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((byte[]) buf[130])[0] = rslt.getByte(93);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getString(94, 30);
               ((short[]) buf[133])[0] = rslt.getShort(95);
               ((boolean[]) buf[134])[0] = rslt.wasNull();
               ((int[]) buf[135])[0] = rslt.getInt(96);
               ((boolean[]) buf[136])[0] = rslt.wasNull();
               ((String[]) buf[137])[0] = rslt.getString(97, 16);
               ((boolean[]) buf[138])[0] = rslt.wasNull();
               ((String[]) buf[139])[0] = rslt.getString(98, 16);
               ((boolean[]) buf[140])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[141])[0] = rslt.getBigDecimal(99,2);
               ((String[]) buf[142])[0] = rslt.getString(100, 4);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[144])[0] = rslt.getGXDate(101);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((String[]) buf[146])[0] = rslt.getString(102, 10);
               ((short[]) buf[147])[0] = rslt.getShort(103);
               ((short[]) buf[148])[0] = rslt.getShort(104);
               ((String[]) buf[149])[0] = rslt.getString(105, 1);
               ((short[]) buf[150])[0] = rslt.getShort(106);
               ((short[]) buf[151])[0] = rslt.getShort(107);
               ((short[]) buf[152])[0] = rslt.getShort(108);
               ((short[]) buf[153])[0] = rslt.getShort(109);
               ((short[]) buf[154])[0] = rslt.getShort(110);
               ((short[]) buf[155])[0] = rslt.getShort(111);
               ((String[]) buf[156])[0] = rslt.getString(112, 30);
               ((String[]) buf[157])[0] = rslt.getString(113, 1);
               ((java.math.BigDecimal[]) buf[158])[0] = rslt.getBigDecimal(114,2);
               ((java.math.BigDecimal[]) buf[159])[0] = rslt.getBigDecimal(115,2);
               ((int[]) buf[160])[0] = rslt.getInt(116);
               ((short[]) buf[161])[0] = rslt.getShort(117);
               ((boolean[]) buf[162])[0] = rslt.wasNull();
               ((byte[]) buf[163])[0] = rslt.getByte(118);
               ((String[]) buf[164])[0] = rslt.getString(119, 4);
               ((boolean[]) buf[165])[0] = rslt.wasNull();
               ((int[]) buf[166])[0] = rslt.getInt(120);
               ((boolean[]) buf[167])[0] = rslt.wasNull();
               ((short[]) buf[168])[0] = rslt.getShort(121);
               ((int[]) buf[169])[0] = rslt.getInt(122);
               ((short[]) buf[170])[0] = rslt.getShort(123);
               ((boolean[]) buf[171])[0] = rslt.wasNull();
               ((String[]) buf[172])[0] = rslt.getString(124, 1);
               ((boolean[]) buf[173])[0] = rslt.wasNull();
               ((String[]) buf[174])[0] = rslt.getString(125, 1);
               ((boolean[]) buf[175])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[176])[0] = rslt.getBigDecimal(126,2);
               ((java.math.BigDecimal[]) buf[177])[0] = rslt.getBigDecimal(127,2);
               ((short[]) buf[178])[0] = rslt.getShort(128);
               ((short[]) buf[179])[0] = rslt.getShort(129);
               ((String[]) buf[180])[0] = rslt.getString(130, 10);
               ((short[]) buf[181])[0] = rslt.getShort(131);
               ((boolean[]) buf[182])[0] = rslt.wasNull();
               ((String[]) buf[183])[0] = rslt.getString(132, 16);
               ((boolean[]) buf[184])[0] = rslt.wasNull();
               ((String[]) buf[185])[0] = rslt.getString(133, 6);
               ((boolean[]) buf[186])[0] = rslt.wasNull();
               ((String[]) buf[187])[0] = rslt.getString(134, 10);
               ((boolean[]) buf[188])[0] = rslt.wasNull();
               ((String[]) buf[189])[0] = rslt.getString(135, 10);
               ((String[]) buf[190])[0] = rslt.getString(136, 10);
               ((short[]) buf[191])[0] = rslt.getShort(137);
               ((short[]) buf[192])[0] = rslt.getShort(138);
               ((short[]) buf[193])[0] = rslt.getShort(139);
               ((java.math.BigDecimal[]) buf[194])[0] = rslt.getBigDecimal(140,2);
               ((java.math.BigDecimal[]) buf[195])[0] = rslt.getBigDecimal(141,2);
               ((byte[]) buf[196])[0] = rslt.getByte(142);
               ((java.util.Date[]) buf[197])[0] = rslt.getGXDate(143);
               ((java.math.BigDecimal[]) buf[198])[0] = rslt.getBigDecimal(144,2);
               ((short[]) buf[199])[0] = rslt.getShort(145);
               ((String[]) buf[200])[0] = rslt.getString(146, 13);
               ((boolean[]) buf[201])[0] = rslt.wasNull();
               ((int[]) buf[202])[0] = rslt.getInt(147);
               ((boolean[]) buf[203])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 8);
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setDate(13, (java.util.Date)parms[12]);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[14], 13);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[18]).byteValue());
               }
               stmt.setString(17, (String)parms[19], 26);
               stmt.setString(18, (String)parms[20], 40);
               stmt.setByte(19, ((Number) parms[21]).byteValue());
               stmt.setString(20, (String)parms[22], 16);
               stmt.setString(21, (String)parms[23], 10);
               stmt.setString(22, (String)parms[24], 6);
               stmt.setString(23, (String)parms[25], 6);
               stmt.setString(24, (String)parms[26], 10);
               stmt.setShort(25, ((Number) parms[27]).shortValue());
               stmt.setString(26, (String)parms[28], 1);
               stmt.setString(27, (String)parms[29], 1);
               stmt.setString(28, (String)parms[30], 2);
               stmt.setString(29, (String)parms[31], 4);
               stmt.setShort(30, ((Number) parms[32]).shortValue());
               stmt.setString(31, (String)parms[33], 4);
               stmt.setShort(32, ((Number) parms[34]).shortValue());
               stmt.setString(33, (String)parms[35], 4);
               stmt.setShort(34, ((Number) parms[36]).shortValue());
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[37], 2);
               stmt.setByte(36, ((Number) parms[38]).byteValue());
               stmt.setString(37, (String)parms[39], 4);
               stmt.setShort(38, ((Number) parms[40]).shortValue());
               stmt.setString(39, (String)parms[41], 4);
               stmt.setShort(40, ((Number) parms[42]).shortValue());
               stmt.setString(41, (String)parms[43], 4);
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(42, ((Number) parms[45]).shortValue());
               }
               stmt.setShort(43, ((Number) parms[46]).shortValue());
               stmt.setByte(44, ((Number) parms[47]).byteValue());
               stmt.setBigDecimal(45, (java.math.BigDecimal)parms[48], 2);
               stmt.setBigDecimal(46, (java.math.BigDecimal)parms[49], 2);
               stmt.setShort(47, ((Number) parms[50]).shortValue());
               stmt.setShort(48, ((Number) parms[51]).shortValue());
               stmt.setShort(49, ((Number) parms[52]).shortValue());
               stmt.setString(50, (String)parms[53], 10);
               stmt.setString(51, (String)parms[54], 10);
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[56], 10);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[58], 6);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[60], 16);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(55, ((Number) parms[62]).intValue());
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(56, ((Number) parms[64]).shortValue());
               }
               stmt.setString(57, (String)parms[65], 13);
               stmt.setInt(58, ((Number) parms[66]).intValue());
               stmt.setBigDecimal(59, (java.math.BigDecimal)parms[67], 2);
               stmt.setBigDecimal(60, (java.math.BigDecimal)parms[68], 2);
               stmt.setShort(61, ((Number) parms[69]).shortValue());
               stmt.setShort(62, ((Number) parms[70]).shortValue());
               stmt.setShort(63, ((Number) parms[71]).shortValue());
               stmt.setShort(64, ((Number) parms[72]).shortValue());
               stmt.setString(65, (String)parms[73], 10);
               stmt.setShort(66, ((Number) parms[74]).shortValue());
               stmt.setShort(67, ((Number) parms[75]).shortValue());
               stmt.setBigDecimal(68, (java.math.BigDecimal)parms[76], 2);
               stmt.setBigDecimal(69, (java.math.BigDecimal)parms[77], 2);
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(70, (String)parms[79], 1);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(71, (String)parms[81], 1);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(72, ((Number) parms[83]).shortValue());
               }
               stmt.setInt(73, ((Number) parms[84]).intValue());
               stmt.setShort(74, ((Number) parms[85]).shortValue());
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(75, ((Number) parms[87]).intValue());
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(76, (String)parms[89], 4);
               }
               stmt.setByte(77, ((Number) parms[90]).byteValue());
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(78, ((Number) parms[92]).shortValue());
               }
               stmt.setInt(79, ((Number) parms[93]).intValue());
               stmt.setBigDecimal(80, (java.math.BigDecimal)parms[94], 2);
               stmt.setBigDecimal(81, (java.math.BigDecimal)parms[95], 2);
               stmt.setString(82, (String)parms[96], 1);
               stmt.setString(83, (String)parms[97], 30);
               stmt.setShort(84, ((Number) parms[98]).shortValue());
               stmt.setShort(85, ((Number) parms[99]).shortValue());
               stmt.setShort(86, ((Number) parms[100]).shortValue());
               stmt.setShort(87, ((Number) parms[101]).shortValue());
               stmt.setShort(88, ((Number) parms[102]).shortValue());
               stmt.setShort(89, ((Number) parms[103]).shortValue());
               stmt.setString(90, (String)parms[104], 1);
               stmt.setShort(91, ((Number) parms[105]).shortValue());
               stmt.setShort(92, ((Number) parms[106]).shortValue());
               stmt.setString(93, (String)parms[107], 10);
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.DATE );
               }
               else
               {
                  stmt.setDate(94, (java.util.Date)parms[109]);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(95, (String)parms[111], 4);
               }
               stmt.setBigDecimal(96, (java.math.BigDecimal)parms[112], 2);
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(97, (String)parms[114], 16);
               }
               if ( ((Boolean) parms[115]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(98, (String)parms[116], 16);
               }
               if ( ((Boolean) parms[117]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(99, ((Number) parms[118]).intValue());
               }
               if ( ((Boolean) parms[119]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(100, ((Number) parms[120]).shortValue());
               }
               stmt.setString(101, (String)parms[121], 30);
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 102 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(102, ((Number) parms[123]).byteValue());
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 103 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(103, ((Number) parms[125]).byteValue());
               }
               stmt.setString(104, (String)parms[126], 1);
               if ( ((Boolean) parms[127]).booleanValue() )
               {
                  stmt.setNull( 105 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(105, ((Number) parms[128]).intValue());
               }
               if ( ((Boolean) parms[129]).booleanValue() )
               {
                  stmt.setNull( 106 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(106, ((Number) parms[130]).intValue());
               }
               stmt.setString(107, (String)parms[131], 8);
               stmt.setShort(108, ((Number) parms[132]).shortValue());
               stmt.setBigDecimal(109, (java.math.BigDecimal)parms[133], 2);
               stmt.setBigDecimal(110, (java.math.BigDecimal)parms[134], 2);
               stmt.setString(111, (String)parms[135], 1);
               stmt.setBigDecimal(112, (java.math.BigDecimal)parms[136], 2);
               stmt.setBigDecimal(113, (java.math.BigDecimal)parms[137], 2);
               stmt.setString(114, (String)parms[138], 1);
               stmt.setShort(115, ((Number) parms[139]).shortValue());
               stmt.setString(116, (String)parms[140], 1);
               stmt.setString(117, (String)parms[141], 13);
               stmt.setString(118, (String)parms[142], 4);
               if ( ((Boolean) parms[143]).booleanValue() )
               {
                  stmt.setNull( 119 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(119, (java.util.Date)parms[144], true);
               }
               if ( ((Boolean) parms[145]).booleanValue() )
               {
                  stmt.setNull( 120 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(120, (java.util.Date)parms[146], true);
               }
               stmt.setString(121, (String)parms[147], 12);
               stmt.setInt(122, ((Number) parms[148]).intValue());
               stmt.setString(123, (String)parms[149], 20);
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 124 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(124, (String)parms[151], 30);
               }
               stmt.setByte(125, ((Number) parms[152]).byteValue());
               stmt.setByte(126, ((Number) parms[153]).byteValue());
               if ( ((Boolean) parms[154]).booleanValue() )
               {
                  stmt.setNull( 127 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(127, (String)parms[155], 12);
               }
               stmt.setString(128, (String)parms[156], 1);
               stmt.setString(129, (String)parms[157], 1);
               stmt.setString(130, (String)parms[158], 2);
               stmt.setString(131, (String)parms[159], 20);
               stmt.setString(132, (String)parms[160], 20);
               stmt.setString(133, (String)parms[161], 1);
               stmt.setString(134, (String)parms[162], 1);
               stmt.setInt(135, ((Number) parms[163]).intValue());
               stmt.setBigDecimal(136, (java.math.BigDecimal)parms[164], 2);
               if ( ((Boolean) parms[165]).booleanValue() )
               {
                  stmt.setNull( 137 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(137, (java.math.BigDecimal)parms[166], 2);
               }
               if ( ((Boolean) parms[167]).booleanValue() )
               {
                  stmt.setNull( 138 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(138, ((Number) parms[168]).byteValue());
               }
               if ( ((Boolean) parms[169]).booleanValue() )
               {
                  stmt.setNull( 139 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(139, ((Number) parms[170]).byteValue());
               }
               stmt.setByte(140, ((Number) parms[171]).byteValue());
               stmt.setByte(141, ((Number) parms[172]).byteValue());
               if ( ((Boolean) parms[173]).booleanValue() )
               {
                  stmt.setNull( 142 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(142, ((Number) parms[174]).byteValue());
               }
               if ( ((Boolean) parms[175]).booleanValue() )
               {
                  stmt.setNull( 143 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(143, (String)parms[176], 1);
               }
               stmt.setString(144, (String)parms[177], 30);
               stmt.setString(145, (String)parms[178], 6);
               stmt.setString(146, (String)parms[179], 1);
               if ( ((Boolean) parms[180]).booleanValue() )
               {
                  stmt.setNull( 147 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(147, (String)parms[181], 30);
               }
               stmt.setString(148, (String)parms[182], 30);
               if ( ((Boolean) parms[183]).booleanValue() )
               {
                  stmt.setNull( 149 , Types.DATE );
               }
               else
               {
                  stmt.setDate(149, (java.util.Date)parms[184]);
               }
               stmt.setString(150, (String)parms[185], 20);
               stmt.setString(151, (String)parms[186], 20);
               stmt.setString(152, (String)parms[187], 20);
               stmt.setString(153, (String)parms[188], 20);
               stmt.setString(154, (String)parms[189], 20);
               stmt.setString(155, (String)parms[190], 20);
               if ( ((Boolean) parms[191]).booleanValue() )
               {
                  stmt.setNull( 156 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(156, (String)parms[192], 4);
               }
               if ( ((Boolean) parms[193]).booleanValue() )
               {
                  stmt.setNull( 157 , Types.DATE );
               }
               else
               {
                  stmt.setDate(157, (java.util.Date)parms[194]);
               }
               if ( ((Boolean) parms[195]).booleanValue() )
               {
                  stmt.setNull( 158 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(158, ((Number) parms[196]).shortValue());
               }
               if ( ((Boolean) parms[197]).booleanValue() )
               {
                  stmt.setNull( 159 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(159, (String)parms[198], 6);
               }
               if ( ((Boolean) parms[199]).booleanValue() )
               {
                  stmt.setNull( 160 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(160, ((Number) parms[200]).intValue());
               }
               if ( ((Boolean) parms[201]).booleanValue() )
               {
                  stmt.setNull( 161 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(161, (String)parms[202], 12);
               }
               if ( ((Boolean) parms[203]).booleanValue() )
               {
                  stmt.setNull( 162 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(162, ((Number) parms[204]).intValue());
               }
               if ( ((Boolean) parms[205]).booleanValue() )
               {
                  stmt.setNull( 163 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(163, ((Number) parms[206]).intValue());
               }
               if ( ((Boolean) parms[207]).booleanValue() )
               {
                  stmt.setNull( 164 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(164, ((Number) parms[208]).intValue());
               }
               if ( ((Boolean) parms[209]).booleanValue() )
               {
                  stmt.setNull( 165 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(165, ((Number) parms[210]).byteValue());
               }
               if ( ((Boolean) parms[211]).booleanValue() )
               {
                  stmt.setNull( 166 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(166, ((Number) parms[212]).intValue());
               }
               if ( ((Boolean) parms[213]).booleanValue() )
               {
                  stmt.setNull( 167 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(167, ((Number) parms[214]).byteValue());
               }
               if ( ((Boolean) parms[215]).booleanValue() )
               {
                  stmt.setNull( 168 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(168, (String)parms[216], 1);
               }
               stmt.setVarchar(169, (String)parms[217], 2000, false);
               stmt.setVarchar(170, (String)parms[218], 2000, false);
               if ( ((Boolean) parms[219]).booleanValue() )
               {
                  stmt.setNull( 171 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(171, (String)parms[220], 6);
               }
               stmt.setVarchar(172, (String)parms[221], 200, false);
               stmt.setVarchar(173, (String)parms[222], 600, false);
               stmt.setString(174, (String)parms[223], 30);
               if ( ((Boolean) parms[224]).booleanValue() )
               {
                  stmt.setNull( 175 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(175, ((Number) parms[225]).shortValue());
               }
               stmt.setString(176, (String)parms[226], 4);
               if ( ((Boolean) parms[227]).booleanValue() )
               {
                  stmt.setNull( 177 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(177, ((Number) parms[228]).shortValue());
               }
               if ( ((Boolean) parms[229]).booleanValue() )
               {
                  stmt.setNull( 178 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(178, ((Number) parms[230]).shortValue());
               }
               stmt.setString(179, (String)parms[231], 30);
               if ( ((Boolean) parms[232]).booleanValue() )
               {
                  stmt.setNull( 180 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(180, (String)parms[233], 10);
               }
               stmt.setByte(181, ((Number) parms[234]).byteValue());
               stmt.setByte(182, ((Number) parms[235]).byteValue());
               if ( ((Boolean) parms[236]).booleanValue() )
               {
                  stmt.setNull( 183 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(183, (String)parms[237], 6);
               }
               if ( ((Boolean) parms[238]).booleanValue() )
               {
                  stmt.setNull( 184 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(184, (String)parms[239], 1);
               }
               if ( ((Boolean) parms[240]).booleanValue() )
               {
                  stmt.setNull( 185 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(185, ((Number) parms[241]).shortValue());
               }
               if ( ((Boolean) parms[242]).booleanValue() )
               {
                  stmt.setNull( 186 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(186, ((Number) parms[243]).intValue());
               }
               if ( ((Boolean) parms[244]).booleanValue() )
               {
                  stmt.setNull( 187 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(187, (String)parms[245], 4);
               }
               stmt.setByte(188, ((Number) parms[246]).byteValue());
               stmt.setLong(189, ((Number) parms[247]).longValue());
               stmt.setBigDecimal(190, (java.math.BigDecimal)parms[248], 40);
               stmt.setShort(191, ((Number) parms[249]).shortValue());
               if ( ((Boolean) parms[250]).booleanValue() )
               {
                  stmt.setNull( 192 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(192, (String)parms[251], 4);
               }
               stmt.setVarchar(193, (String)parms[252], 60, false);
               stmt.setBigDecimal(194, (java.math.BigDecimal)parms[253], 2);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 26);
               stmt.setString(4, (String)parms[3], 16);
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
                  stmt.setString(6, (String)parms[7], 13);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[9]).byteValue());
               }
               stmt.setString(8, (String)parms[10], 3);
               stmt.setInt(9, ((Number) parms[11]).intValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 14 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

