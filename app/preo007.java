package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preo007 extends GXProcedure
{
   public preo007( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preo007.class ), "" );
   }

   public preo007( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      preo007.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 )
   {
      preo007.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preo007.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      preo007.this.AV15DisDesCod = aP2[0];
      this.aP2 = aP2;
      preo007.this.AV16Reop = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV29Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      preo007.this.GXt_char1 = GXv_char2[0] ;
      AV29Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV30EmprNom ;
      GXv_char4[0] = AV28UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char2, GXv_char3, GXv_char4) ;
      preo007.this.A396EmprCod = GXv_char2[0] ;
      preo007.this.AV30EmprNom = GXv_char3[0] ;
      preo007.this.AV28UsurCod = GXv_char4[0] ;
      GXv_int5[0] = AV31FlagJBP ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBURGO", ""), GXv_int5) ;
      preo007.this.AV31FlagJBP = GXv_int5[0] ;
      AV32Gassol = (byte)(0) ;
      GXv_int5[0] = AV32Gassol ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GASSOL", ""), GXv_int5) ;
      preo007.this.AV32Gassol = GXv_int5[0] ;
      /* Using cursor P04R52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1013DibCli = P04R52_A1013DibCli[0] ;
         n1013DibCli = P04R52_n1013DibCli[0] ;
         A1031EmpesCod = P04R52_A1031EmpesCod[0] ;
         n1031EmpesCod = P04R52_n1031EmpesCod[0] ;
         A3841DisArtMer = P04R52_A3841DisArtMer[0] ;
         A3826RetCod = P04R52_A3826RetCod[0] ;
         n3826RetCod = P04R52_n3826RetCod[0] ;
         A3627DisFecLan = P04R52_A3627DisFecLan[0] ;
         n3627DisFecLan = P04R52_n3627DisFecLan[0] ;
         A3309DisNumTon = P04R52_A3309DisNumTon[0] ;
         A3308DisManCod2 = P04R52_A3308DisManCod2[0] ;
         A3307DisManCod1 = P04R52_A3307DisManCod1[0] ;
         A3306DisFac = P04R52_A3306DisFac[0] ;
         A3132DisGraCru2 = P04R52_A3132DisGraCru2[0] ;
         A3131DisGraAca2 = P04R52_A3131DisGraAca2[0] ;
         A3130DisAncSal3 = P04R52_A3130DisAncSal3[0] ;
         A3129DisAncSal2 = P04R52_A3129DisAncSal2[0] ;
         A3128DisAncSal1 = P04R52_A3128DisAncSal1[0] ;
         A3127DisNumCor = P04R52_A3127DisNumCor[0] ;
         A2835DisPle2 = P04R52_A2835DisPle2[0] ;
         A2926DisPla = P04R52_A2926DisPla[0] ;
         A2833DisMtrLot = P04R52_A2833DisMtrLot[0] ;
         A2832DisKgsLot = P04R52_A2832DisKgsLot[0] ;
         A2831DisNumLot = P04R52_A2831DisNumLot[0] ;
         A2744DisNumTex2 = P04R52_A2744DisNumTex2[0] ;
         n2744DisNumTex2 = P04R52_n2744DisNumTex2[0] ;
         A2743DisNumTex1 = P04R52_A2743DisNumTex1[0] ;
         A2742DisCodTex = P04R52_A2742DisCodTex[0] ;
         n2742DisCodTex = P04R52_n2742DisCodTex[0] ;
         A2403DisOpeAnt = P04R52_A2403DisOpeAnt[0] ;
         n2403DisOpeAnt = P04R52_n2403DisOpeAnt[0] ;
         A2402DisManCod = P04R52_A2402DisManCod[0] ;
         A2310DisCliDes = P04R52_A2310DisCliDes[0] ;
         A2267DisNumBas = P04R52_A2267DisNumBas[0] ;
         n2267DisNumBas = P04R52_n2267DisNumBas[0] ;
         A2009DisTipDis = P04R52_A2009DisTipDis[0] ;
         n2009DisTipDis = P04R52_n2009DisTipDis[0] ;
         A1968DisRes = P04R52_A1968DisRes[0] ;
         n1968DisRes = P04R52_n1968DisRes[0] ;
         A1908DisRdoA = P04R52_A1908DisRdoA[0] ;
         A1907DisRdoN = P04R52_A1907DisRdoN[0] ;
         A1906DisGraAca = P04R52_A1906DisGraAca[0] ;
         A1502DisPart = P04R52_A1502DisPart[0] ;
         A1430DisLoc = P04R52_A1430DisLoc[0] ;
         A1233DisArtAc2 = P04R52_A1233DisArtAc2[0] ;
         A1232DisArtAcb = P04R52_A1232DisArtAcb[0] ;
         A1231DisArtAn1 = P04R52_A1231DisArtAn1[0] ;
         A1225DisGraCru = P04R52_A1225DisGraCru[0] ;
         A1198DisEncAnh = P04R52_A1198DisEncAnh[0] ;
         A1197DisEncCom = P04R52_A1197DisEncCom[0] ;
         A1196DisNumCli = P04R52_A1196DisNumCli[0] ;
         A1195DisNomCli = P04R52_A1195DisNomCli[0] ;
         A1157TipConCod = P04R52_A1157TipConCod[0] ;
         n1157TipConCod = P04R52_n1157TipConCod[0] ;
         A252CliCod = P04R52_A252CliCod[0] ;
         A966PartCod = P04R52_A966PartCod[0] ;
         n966PartCod = P04R52_n966PartCod[0] ;
         A1122MaqCodDis = P04R52_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P04R52_n1122MaqCodDis[0] ;
         A1002DisNumTen = P04R52_A1002DisNumTen[0] ;
         n1002DisNumTen = P04R52_n1002DisNumTen[0] ;
         A999DisNMez = P04R52_A999DisNMez[0] ;
         A998DisNMtr = P04R52_A998DisNMtr[0] ;
         A373DisMtrLan = P04R52_A373DisMtrLan[0] ;
         A372DisKgmLan = P04R52_A372DisKgmLan[0] ;
         A383DisPieLan = P04R52_A383DisPieLan[0] ;
         A367DisEst = P04R52_A367DisEst[0] ;
         A334DisArtAnh = P04R52_A334DisArtAnh[0] ;
         A349DisArtPu3 = P04R52_A349DisArtPu3[0] ;
         n349DisArtPu3 = P04R52_n349DisArtPu3[0] ;
         A358DisArtUr3 = P04R52_A358DisArtUr3[0] ;
         A348DisArtPu2 = P04R52_A348DisArtPu2[0] ;
         A357DisArtUr2 = P04R52_A357DisArtUr2[0] ;
         A347DisArtPu1 = P04R52_A347DisArtPu1[0] ;
         A356DisArtUr1 = P04R52_A356DisArtUr1[0] ;
         A359DisArtUrg = P04R52_A359DisArtUrg[0] ;
         A350DisArtRdt = P04R52_A350DisArtRdt[0] ;
         A346DisArtPt3 = P04R52_A346DisArtPt3[0] ;
         A355DisArtTr3 = P04R52_A355DisArtTr3[0] ;
         A345DisArtPt2 = P04R52_A345DisArtPt2[0] ;
         A354DisArtTr2 = P04R52_A354DisArtTr2[0] ;
         A344DisArtPt1 = P04R52_A344DisArtPt1[0] ;
         A353DisArtTr1 = P04R52_A353DisArtTr1[0] ;
         A341DisArtOpe = P04R52_A341DisArtOpe[0] ;
         A336DisArtCor = P04R52_A336DisArtCor[0] ;
         A338DisArtEnc = P04R52_A338DisArtEnc[0] ;
         A352DisArtTip = P04R52_A352DisArtTip[0] ;
         A343DisArtPle = P04R52_A343DisArtPle[0] ;
         A333DisArtAca = P04R52_A333DisArtAca[0] ;
         A351DisArtSua = P04R52_A351DisArtSua[0] ;
         A339DisArtLar = P04R52_A339DisArtLar[0] ;
         A340DisArtMat = P04R52_A340DisArtMat[0] ;
         A378DisObsULin = P04R52_A378DisObsULin[0] ;
         A366DisEnt = P04R52_A366DisEnt[0] ;
         A337DisArtDsc = P04R52_A337DisArtDsc[0] ;
         A390DisTipCol = P04R52_A390DisTipCol[0] ;
         n390DisTipCol = P04R52_n390DisTipCol[0] ;
         A363DisColNum = P04R52_A363DisColNum[0] ;
         n363DisColNum = P04R52_n363DisColNum[0] ;
         A362DisColNom = P04R52_A362DisColNom[0] ;
         n362DisColNom = P04R52_n362DisColNom[0] ;
         A371DisFecEnt = P04R52_A371DisFecEnt[0] ;
         A369DisFec = P04R52_A369DisFec[0] ;
         A370DisFecCli = P04R52_A370DisFecCli[0] ;
         A360DisCliNum = P04R52_A360DisCliNum[0] ;
         A757PriCod = P04R52_A757PriCod[0] ;
         A342DisArtPes = P04R52_A342DisArtPes[0] ;
         A392DisUniMed = P04R52_A392DisUniMed[0] ;
         A375DisNumUni = P04R52_A375DisNumUni[0] ;
         A374DisNumPie = P04R52_A374DisNumPie[0] ;
         A335DisArtCod = P04R52_A335DisArtCod[0] ;
         A365DisDes = P04R52_A365DisDes[0] ;
         A11658DisMemo2 = P04R52_A11658DisMemo2[0] ;
         A4348DisUsrCod = P04R52_A4348DisUsrCod[0] ;
         A389DisPreMtr = P04R52_A389DisPreMtr[0] ;
         A388DisPreKgm = P04R52_A388DisPreKgm[0] ;
         A14555DisPrePz = P04R52_A14555DisPrePz[0] ;
         A13987DisArtDsc2 = P04R52_A13987DisArtDsc2[0] ;
         A13986DisIdtx2 = P04R52_A13986DisIdtx2[0] ;
         n13986DisIdtx2 = P04R52_n13986DisIdtx2[0] ;
         A13768DisTallUlt = P04R52_A13768DisTallUlt[0] ;
         A13767DisRdto4 = P04R52_A13767DisRdto4[0] ;
         A13233DisRGB = P04R52_A13233DisRGB[0] ;
         A13080DisDGUltli = P04R52_A13080DisDGUltli[0] ;
         A13076DisLinPrd = P04R52_A13076DisLinPrd[0] ;
         n13076DisLinPrd = P04R52_n13076DisLinPrd[0] ;
         A13069DisCanalID = P04R52_A13069DisCanalID[0] ;
         n13069DisCanalID = P04R52_n13069DisCanalID[0] ;
         A13068DisLineaID = P04R52_A13068DisLineaID[0] ;
         n13068DisLineaID = P04R52_n13068DisLineaID[0] ;
         A12880DisOEKOTEX = P04R52_A12880DisOEKOTEX[0] ;
         n12880DisOEKOTEX = P04R52_n12880DisOEKOTEX[0] ;
         A12772DisProdID = P04R52_A12772DisProdID[0] ;
         n12772DisProdID = P04R52_n12772DisProdID[0] ;
         A12768DisTpEstam = P04R52_A12768DisTpEstam[0] ;
         A12765DisPriorid = P04R52_A12765DisPriorid[0] ;
         A12328RevenID = P04R52_A12328RevenID[0] ;
         n12328RevenID = P04R52_n12328RevenID[0] ;
         A11864Nxt_artcli = P04R52_A11864Nxt_artcli[0] ;
         A11863DptoID = P04R52_A11863DptoID[0] ;
         n11863DptoID = P04R52_n11863DptoID[0] ;
         A11862DesaID = P04R52_A11862DesaID[0] ;
         n11862DesaID = P04R52_n11862DesaID[0] ;
         A11861Nxt_statio = P04R52_A11861Nxt_statio[0] ;
         A11860CpteId = P04R52_A11860CpteId[0] ;
         n11860CpteId = P04R52_n11860CpteId[0] ;
         A11859Nxt_modelo = P04R52_A11859Nxt_modelo[0] ;
         A11734DisCnoEncO = P04R52_A11734DisCnoEncO[0] ;
         A11661DisOrdComp = P04R52_A11661DisOrdComp[0] ;
         A11659MarcaId = P04R52_A11659MarcaId[0] ;
         n11659MarcaId = P04R52_n11659MarcaId[0] ;
         A11657DisMemo1 = P04R52_A11657DisMemo1[0] ;
         A3696DisParPar = P04R52_A3696DisParPar[0] ;
         n3696DisParPar = P04R52_n3696DisParPar[0] ;
         A3695DisParReo = P04R52_A3695DisParReo[0] ;
         n3695DisParReo = P04R52_n3695DisParReo[0] ;
         A3694DisParCod = P04R52_A3694DisParCod[0] ;
         n3694DisParCod = P04R52_n3694DisParCod[0] ;
         A7067DisUltNot = P04R52_A7067DisUltNot[0] ;
         n7067DisUltNot = P04R52_n7067DisUltNot[0] ;
         A4918DisDibCoDN = P04R52_A4918DisDibCoDN[0] ;
         n4918DisDibCoDN = P04R52_n4918DisDibCoDN[0] ;
         A4879DibColColN = P04R52_A4879DibColColN[0] ;
         n4879DibColColN = P04R52_n4879DibColColN[0] ;
         A4919DisDibCoCN = P04R52_A4919DisDibCoCN[0] ;
         n4919DisDibCoCN = P04R52_n4919DisDibCoCN[0] ;
         A4877DibColCol = P04R52_A4877DibColCol[0] ;
         n4877DibColCol = P04R52_n4877DibColCol[0] ;
         A4476DisAcaFor = P04R52_A4476DisAcaFor[0] ;
         n4476DisAcaFor = P04R52_n4476DisAcaFor[0] ;
         A4475DisLotMaq = P04R52_A4475DisLotMaq[0] ;
         n4475DisLotMaq = P04R52_n4475DisLotMaq[0] ;
         A4472DisLotPza = P04R52_A4472DisLotPza[0] ;
         n4472DisLotPza = P04R52_n4472DisLotPza[0] ;
         A4355DisFecPed = P04R52_A4355DisFecPed[0] ;
         n4355DisFecPed = P04R52_n4355DisFecPed[0] ;
         A10887Cod_Idtx = P04R52_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = P04R52_n10887Cod_Idtx[0] ;
         A9787DisItem6 = P04R52_A9787DisItem6[0] ;
         A9786DisItem5 = P04R52_A9786DisItem5[0] ;
         A9774DisItem4 = P04R52_A9774DisItem4[0] ;
         A9773DisItem3 = P04R52_A9773DisItem3[0] ;
         A9772DisItem2 = P04R52_A9772DisItem2[0] ;
         A9771DisItem1 = P04R52_A9771DisItem1[0] ;
         A8887DisFchT = P04R52_A8887DisFchT[0] ;
         n8887DisFchT = P04R52_n8887DisFchT[0] ;
         A8886DisDest = P04R52_A8886DisDest[0] ;
         A8885DisFEnt = P04R52_A8885DisFEnt[0] ;
         n8885DisFEnt = P04R52_n8885DisFEnt[0] ;
         A7739DisExp = P04R52_A7739DisExp[0] ;
         A7738DisMaqEst = P04R52_A7738DisMaqEst[0] ;
         A7523DisRec = P04R52_A7523DisRec[0] ;
         A7516DisGraTam = P04R52_A7516DisGraTam[0] ;
         n7516DisGraTam = P04R52_n7516DisGraTam[0] ;
         A7515DisDesCol = P04R52_A7515DisDesCol[0] ;
         n7515DisDesCol = P04R52_n7515DisDesCol[0] ;
         A7514DisOrdGra = P04R52_A7514DisOrdGra[0] ;
         A7513DisOrdSep = P04R52_A7513DisOrdSep[0] ;
         A7512DisFacGra = P04R52_A7512DisFacGra[0] ;
         n7512DisFacGra = P04R52_n7512DisFacGra[0] ;
         A7511DisFacSep = P04R52_A7511DisFacSep[0] ;
         n7511DisFacSep = P04R52_n7511DisFacSep[0] ;
         A7510DisDto = P04R52_A7510DisDto[0] ;
         n7510DisDto = P04R52_n7510DisDto[0] ;
         A6548DisRbMaq = P04R52_A6548DisRbMaq[0] ;
         A6547DisVolMaq = P04R52_A6547DisVolMaq[0] ;
         A5405DisAntpT = P04R52_A5405DisAntpT[0] ;
         A5366DisAntp = P04R52_A5366DisAntp[0] ;
         A5350DisObsAnc = P04R52_A5350DisObsAnc[0] ;
         A5349DisObsGrm = P04R52_A5349DisObsGrm[0] ;
         A5290DisTipCor = P04R52_A5290DisTipCor[0] ;
         A5252DisAcc = P04R52_A5252DisAcc[0] ;
         A5032DisEstTip = P04R52_A5032DisEstTip[0] ;
         A5031DisCom = P04R52_A5031DisCom[0] ;
         n5031DisCom = P04R52_n5031DisCom[0] ;
         A5025DisGraCob = P04R52_A5025DisGraCob[0] ;
         A5024DisTipEst = P04R52_A5024DisTipEst[0] ;
         A4876DibColDib = P04R52_A4876DibColDib[0] ;
         n4876DibColDib = P04R52_n4876DibColDib[0] ;
         A4813DisEncCli = P04R52_A4813DisEncCli[0] ;
         A4785DisNroCor = P04R52_A4785DisNroCor[0] ;
         A4720DisDishCod = P04R52_A4720DisDishCod[0] ;
         A4617DisHorReg = P04R52_A4617DisHorReg[0] ;
         n4617DisHorReg = P04R52_n4617DisHorReg[0] ;
         A4616DisHorEnt = P04R52_A4616DisHorEnt[0] ;
         n4616DisHorEnt = P04R52_n4616DisHorEnt[0] ;
         A4615DisTam = P04R52_A4615DisTam[0] ;
         A4614DisMdlCod = P04R52_A4614DisMdlCod[0] ;
         A4479DisAcaMar = P04R52_A4479DisAcaMar[0] ;
         A4478DisAcaAnh = P04R52_A4478DisAcaAnh[0] ;
         A4477DisAcaBak = P04R52_A4477DisAcaBak[0] ;
         A4474DisLotKgs = P04R52_A4474DisLotKgs[0] ;
         A4473DisLotMts = P04R52_A4473DisLotMts[0] ;
         A4471DisCruEnr = P04R52_A4471DisCruEnr[0] ;
         A4470DisCruKgs = P04R52_A4470DisCruKgs[0] ;
         A4469DisCruMts = P04R52_A4469DisCruMts[0] ;
         A4468DisPelAnh = P04R52_A4468DisPelAnh[0] ;
         A4294DisNPzasL = P04R52_A4294DisNPzasL[0] ;
         n4294DisNPzasL = P04R52_n4294DisNPzasL[0] ;
         A4293DisNPzas = P04R52_A4293DisNPzas[0] ;
         n4293DisNPzas = P04R52_n4293DisNPzas[0] ;
         A4014DisTin = P04R52_A4014DisTin[0] ;
         A4013DisEnv = P04R52_A4013DisEnv[0] ;
         n4013DisEnv = P04R52_n4013DisEnv[0] ;
         A2525DisComULin = P04R52_A2525DisComULin[0] ;
         n2525DisComULin = P04R52_n2525DisComULin[0] ;
         A1052DisObs = P04R52_A1052DisObs[0] ;
         A1051DisNumCol = P04R52_A1051DisNumCol[0] ;
         n1051DisNumCol = P04R52_n1051DisNumCol[0] ;
         A1014DibInt = P04R52_A1014DibInt[0] ;
         n1014DibInt = P04R52_n1014DibInt[0] ;
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         AV36Disprekgm = A388DisPreKgm ;
         AV37DisPremtr = A389DisPreMtr ;
         AV38Dismemo2 = A11658DisMemo2 ;
         /*
            INSERT RECORD ON TABLE TXPDISPOS

         */
         W361DisCod = A361DisCod ;
         W4348DisUsrCod = A4348DisUsrCod ;
         W388DisPreKgm = A388DisPreKgm ;
         W389DisPreMtr = A389DisPreMtr ;
         W11658DisMemo2 = A11658DisMemo2 ;
         A361DisCod = AV15DisDesCod ;
         if ( AV32Gassol == 0 )
         {
            A4348DisUsrCod = AV28UsurCod ;
         }
         A388DisPreKgm = AV36Disprekgm ;
         A389DisPreMtr = AV37DisPremtr ;
         A11658DisMemo2 = AV38Dismemo2 ;
         /* Using cursor P04R53 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A365DisDes, A335DisArtCod, Short.valueOf(A374DisNumPie), A375DisNumUni, A392DisUniMed, Short.valueOf(A342DisArtPes), A757PriCod, A360DisCliNum, A370DisFecCli, A369DisFec, A371DisFecEnt, Boolean.valueOf(n362DisColNom), A362DisColNom, Boolean.valueOf(n363DisColNum), Integer.valueOf(A363DisColNum), Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol), A337DisArtDsc, A366DisEnt, Byte.valueOf(A378DisObsULin), A340DisArtMat, A339DisArtLar, A351DisArtSua, A333DisArtAca, A343DisArtPle, Short.valueOf(A352DisArtTip), A338DisArtEnc, A336DisArtCor, A341DisArtOpe, A353DisArtTr1, Short.valueOf(A344DisArtPt1), A354DisArtTr2, Short.valueOf(A345DisArtPt2), A355DisArtTr3, Short.valueOf(A346DisArtPt3), A350DisArtRdt, Byte.valueOf(A359DisArtUrg), A356DisArtUr1, Short.valueOf(A347DisArtPu1), A357DisArtUr2, Short.valueOf(A348DisArtPu2), A358DisArtUr3, Boolean.valueOf(n349DisArtPu3), Short.valueOf(A349DisArtPu3), Short.valueOf(A334DisArtAnh), Byte.valueOf(A367DisEst), A388DisPreKgm, A389DisPreMtr, Short.valueOf(A383DisPieLan), Short.valueOf(A372DisKgmLan), Short.valueOf(A373DisMtrLan), A998DisNMtr, A999DisNMez, Boolean.valueOf(n1002DisNumTen), A1002DisNumTen, Boolean.valueOf(n1122MaqCodDis), A1122MaqCodDis, Boolean.valueOf(n966PartCod), A966PartCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n1157TipConCod), Short.valueOf(A1157TipConCod), A1195DisNomCli, Integer.valueOf(A1196DisNumCli), A1197DisEncCom, A1198DisEncAnh, Short.valueOf(A1225DisGraCru), Short.valueOf(A1231DisArtAn1), Short.valueOf(A1232DisArtAcb), Short.valueOf(A1233DisArtAc2), A1430DisLoc, Short.valueOf(A1502DisPart), Short.valueOf(A1906DisGraAca), A1907DisRdoN, A1908DisRdoA, Boolean.valueOf(n1968DisRes), A1968DisRes, Boolean.valueOf(n2009DisTipDis), A2009DisTipDis, Boolean.valueOf(n2267DisNumBas), Short.valueOf(A2267DisNumBas), Integer.valueOf(A2310DisCliDes), Short.valueOf(A2402DisManCod), Boolean.valueOf(n2403DisOpeAnt), Integer.valueOf(A2403DisOpeAnt), Boolean.valueOf(n2742DisCodTex), A2742DisCodTex, Byte.valueOf(A2743DisNumTex1), Boolean.valueOf(n2744DisNumTex2), Short.valueOf(A2744DisNumTex2), Integer.valueOf(A2831DisNumLot), A2832DisKgsLot, A2833DisMtrLot, A2926DisPla, A2835DisPle2, Short.valueOf(A3127DisNumCor), Short.valueOf(A3128DisAncSal1), Short.valueOf(A3129DisAncSal2), Short.valueOf(A3130DisAncSal3), Short.valueOf(A3131DisGraAca2), Short.valueOf(A3132DisGraCru2), A3306DisFac, Short.valueOf(A3307DisManCod1), Short.valueOf(A3308DisManCod2), A3309DisNumTon, Boolean.valueOf(n3627DisFecLan), A3627DisFecLan, Boolean.valueOf(n3826RetCod), A3826RetCod, A3841DisArtMer, Boolean.valueOf(n1031EmpesCod), A1031EmpesCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Boolean.valueOf(n1051DisNumCol), Short.valueOf(A1051DisNumCol), A1052DisObs, Boolean.valueOf(n2525DisComULin),
         Byte.valueOf(A2525DisComULin), Boolean.valueOf(n4013DisEnv), Byte.valueOf(A4013DisEnv), A4014DisTin, Boolean.valueOf(n4293DisNPzas), Integer.valueOf(A4293DisNPzas), Boolean.valueOf(n4294DisNPzasL), Integer.valueOf(A4294DisNPzasL), A4348DisUsrCod, Short.valueOf(A4468DisPelAnh), A4469DisCruMts, A4470DisCruKgs, A4471DisCruEnr, A4473DisLotMts, A4474DisLotKgs, A4477DisAcaBak, Short.valueOf(A4478DisAcaAnh), A4479DisAcaMar, A4614DisMdlCod, A4615DisTam, Boolean.valueOf(n4616DisHorEnt), A4616DisHorEnt, Boolean.valueOf(n4617DisHorReg), A4617DisHorReg, A4720DisDishCod, Integer.valueOf(A4785DisNroCor), A4813DisEncCli, Boolean.valueOf(n4876DibColDib), A4876DibColDib, Byte.valueOf(A5024DisTipEst), Byte.valueOf(A5025DisGraCob), Boolean.valueOf(n5031DisCom), A5031DisCom, A5032DisEstTip, A5252DisAcc, A5290DisTipCor, A5349DisObsGrm, A5350DisObsAnc, A5366DisAntp, A5405DisAntpT, Integer.valueOf(A6547DisVolMaq), A6548DisRbMaq, Boolean.valueOf(n7510DisDto), A7510DisDto, Boolean.valueOf(n7511DisFacSep), Byte.valueOf(A7511DisFacSep), Boolean.valueOf(n7512DisFacGra), Byte.valueOf(A7512DisFacGra), Byte.valueOf(A7513DisOrdSep), Byte.valueOf(A7514DisOrdGra), Boolean.valueOf(n7515DisDesCol), Byte.valueOf(A7515DisDesCol), Boolean.valueOf(n7516DisGraTam), A7516DisGraTam, A7523DisRec, A7738DisMaqEst, A7739DisExp, Boolean.valueOf(n8885DisFEnt), A8885DisFEnt, A8886DisDest, Boolean.valueOf(n8887DisFchT), A8887DisFchT, A9771DisItem1, A9772DisItem2, A9773DisItem3, A9774DisItem4, A9786DisItem5, A9787DisItem6, Boolean.valueOf(n10887Cod_Idtx), A10887Cod_Idtx, Boolean.valueOf(n4355DisFecPed), A4355DisFecPed, Boolean.valueOf(n4472DisLotPza), Short.valueOf(A4472DisLotPza), Boolean.valueOf(n4475DisLotMaq), A4475DisLotMaq, Boolean.valueOf(n4476DisAcaFor), Integer.valueOf(A4476DisAcaFor), Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4919DisDibCoCN), Integer.valueOf(A4919DisDibCoCN), Boolean.valueOf(n4879DibColColN), Integer.valueOf(A4879DibColColN), Boolean.valueOf(n4918DisDibCoDN), Integer.valueOf(A4918DisDibCoDN), Boolean.valueOf(n7067DisUltNot), Byte.valueOf(A7067DisUltNot), Boolean.valueOf(n3694DisParCod), Integer.valueOf(A3694DisParCod), Boolean.valueOf(n3695DisParReo), Byte.valueOf(A3695DisParReo), Boolean.valueOf(n3696DisParPar), A3696DisParPar, A11657DisMemo1, A11658DisMemo2, Boolean.valueOf(n11659MarcaId), A11659MarcaId, A11661DisOrdComp, A11734DisCnoEncO, A11859Nxt_modelo, Boolean.valueOf(n11860CpteId), Short.valueOf(A11860CpteId), A11861Nxt_statio, Boolean.valueOf(n11862DesaID), Short.valueOf(A11862DesaID), Boolean.valueOf(n11863DptoID), Short.valueOf(A11863DptoID), A11864Nxt_artcli, Boolean.valueOf(n12328RevenID), A12328RevenID, Byte.valueOf(A12765DisPriorid), Byte.valueOf(A12768DisTpEstam), Boolean.valueOf(n12772DisProdID), A12772DisProdID, Boolean.valueOf(n12880DisOEKOTEX), A12880DisOEKOTEX, Boolean.valueOf(n13068DisLineaID), Short.valueOf(A13068DisLineaID), Boolean.valueOf(n13069DisCanalID), Integer.valueOf(A13069DisCanalID), Boolean.valueOf(n13076DisLinPrd), A13076DisLinPrd, Byte.valueOf(A13080DisDGUltli), Long.valueOf(A13233DisRGB),
         A13767DisRdto4, Short.valueOf(A13768DisTallUlt), Boolean.valueOf(n13986DisIdtx2), A13986DisIdtx2, A13987DisArtDsc2, A14555DisPrePz});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
         A361DisCod = W361DisCod ;
         A4348DisUsrCod = W4348DisUsrCod ;
         A388DisPreKgm = W388DisPreKgm ;
         A389DisPreMtr = W389DisPreMtr ;
         A11658DisMemo2 = W11658DisMemo2 ;
         /* End Insert */
         /* Using cursor P04R54 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A377DisObsTxt = P04R54_A377DisObsTxt[0] ;
            A376DisObsLin = P04R54_A376DisObsLin[0] ;
            W361DisCod = A361DisCod ;
            AV17DisObsLin = A376DisObsLin ;
            AV18DisObsTxt = A377DisObsTxt ;
            /*
               INSERT RECORD ON TABLE TXPOBSERV

            */
            W361DisCod = A361DisCod ;
            W376DisObsLin = A376DisObsLin ;
            W377DisObsTxt = A377DisObsTxt ;
            A361DisCod = AV15DisDesCod ;
            A376DisObsLin = AV17DisObsLin ;
            A377DisObsTxt = AV18DisObsTxt ;
            /* Using cursor P04R55 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
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
            A361DisCod = W361DisCod ;
            A376DisObsLin = W376DisObsLin ;
            A377DisObsTxt = W377DisObsTxt ;
            /* End Insert */
            A361DisCod = W361DisCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Using cursor P04R56 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A846UltFasLin = P04R56_A846UltFasLin[0] ;
            A758ProCod = P04R56_A758ProCod[0] ;
            A12144ProStsFec = P04R56_A12144ProStsFec[0] ;
            n12144ProStsFec = P04R56_n12144ProStsFec[0] ;
            A12143ProSts = P04R56_A12143ProSts[0] ;
            n12143ProSts = P04R56_n12143ProSts[0] ;
            A5334DisFasApr = P04R56_A5334DisFasApr[0] ;
            n5334DisFasApr = P04R56_n5334DisFasApr[0] ;
            W361DisCod = A361DisCod ;
            AV19ProCod = A758ProCod ;
            AV20UltFasLin = A846UltFasLin ;
            /*
               INSERT RECORD ON TABLE TXPDISLIN

            */
            W361DisCod = A361DisCod ;
            W758ProCod = A758ProCod ;
            W846UltFasLin = A846UltFasLin ;
            A361DisCod = AV15DisDesCod ;
            A758ProCod = AV19ProCod ;
            A846UltFasLin = AV20UltFasLin ;
            /* Using cursor P04R57 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A846UltFasLin), Boolean.valueOf(n5334DisFasApr), A5334DisFasApr, Boolean.valueOf(n12143ProSts), Byte.valueOf(A12143ProSts), Boolean.valueOf(n12144ProStsFec), A12144ProStsFec});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
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
            A361DisCod = W361DisCod ;
            A758ProCod = W758ProCod ;
            A846UltFasLin = W846UltFasLin ;
            /* End Insert */
            /* Using cursor P04R58 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A457FasCod = P04R58_A457FasCod[0] ;
               A368DisFasLin = P04R58_A368DisFasLin[0] ;
               A7744FasPreObl = P04R58_A7744FasPreObl[0] ;
               n7744FasPreObl = P04R58_n7744FasPreObl[0] ;
               A5307DisNumPas = P04R58_A5307DisNumPas[0] ;
               n5307DisNumPas = P04R58_n5307DisNumPas[0] ;
               A5306DisVelPro = P04R58_A5306DisVelPro[0] ;
               n5306DisVelPro = P04R58_n5306DisVelPro[0] ;
               A5305DisPrePie = P04R58_A5305DisPrePie[0] ;
               n5305DisPrePie = P04R58_n5305DisPrePie[0] ;
               A5304DisPreSal = P04R58_A5304DisPreSal[0] ;
               n5304DisPreSal = P04R58_n5304DisPreSal[0] ;
               A9841DisFasObs = P04R58_A9841DisFasObs[0] ;
               A7918Dta_UOrd = P04R58_A7918Dta_UOrd[0] ;
               n7918Dta_UOrd = P04R58_n7918Dta_UOrd[0] ;
               A7917DisfasRb = P04R58_A7917DisfasRb[0] ;
               n7917DisfasRb = P04R58_n7917DisfasRb[0] ;
               A7916DisFasUpL = P04R58_A7916DisFasUpL[0] ;
               n7916DisFasUpL = P04R58_n7916DisFasUpL[0] ;
               A7915Disfastpp = P04R58_A7915Disfastpp[0] ;
               n7915Disfastpp = P04R58_n7915Disfastpp[0] ;
               A7747DisFasAut = P04R58_A7747DisFasAut[0] ;
               n7747DisFasAut = P04R58_n7747DisFasAut[0] ;
               A7743DisFasRec = P04R58_A7743DisFasRec[0] ;
               n7743DisFasRec = P04R58_n7743DisFasRec[0] ;
               A7742DisFasDto = P04R58_A7742DisFasDto[0] ;
               n7742DisFasDto = P04R58_n7742DisFasDto[0] ;
               A7741DisFasUni = P04R58_A7741DisFasUni[0] ;
               n7741DisFasUni = P04R58_n7741DisFasUni[0] ;
               A7740DisFasPre = P04R58_A7740DisFasPre[0] ;
               n7740DisFasPre = P04R58_n7740DisFasPre[0] ;
               A5376DisQuiUl = P04R58_A5376DisQuiUl[0] ;
               A3793DisMaqPru = P04R58_A3793DisMaqPru[0] ;
               n3793DisMaqPru = P04R58_n3793DisMaqPru[0] ;
               A3697FasApr = P04R58_A3697FasApr[0] ;
               W361DisCod = A361DisCod ;
               W758ProCod = A758ProCod ;
               AV19ProCod = A758ProCod ;
               AV21DisFasLin = A368DisFasLin ;
               AV22FasCod = A457FasCod ;
               /*
                  INSERT RECORD ON TABLE TXPDISFAS

               */
               W361DisCod = A361DisCod ;
               W758ProCod = A758ProCod ;
               W368DisFasLin = A368DisFasLin ;
               W457FasCod = A457FasCod ;
               A361DisCod = AV15DisDesCod ;
               A758ProCod = AV19ProCod ;
               A368DisFasLin = AV21DisFasLin ;
               A457FasCod = AV22FasCod ;
               /* Using cursor P04R59 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A457FasCod, A3697FasApr, Boolean.valueOf(n3793DisMaqPru), A3793DisMaqPru, Short.valueOf(A5376DisQuiUl), Boolean.valueOf(n7740DisFasPre), A7740DisFasPre, Boolean.valueOf(n7741DisFasUni), A7741DisFasUni, Boolean.valueOf(n7742DisFasDto), A7742DisFasDto, Boolean.valueOf(n7743DisFasRec), A7743DisFasRec, Boolean.valueOf(n7747DisFasAut), Byte.valueOf(A7747DisFasAut), Boolean.valueOf(n7915Disfastpp), A7915Disfastpp, Boolean.valueOf(n7916DisFasUpL), A7916DisFasUpL, Boolean.valueOf(n7917DisfasRb), A7917DisfasRb, Boolean.valueOf(n7918Dta_UOrd), Short.valueOf(A7918Dta_UOrd), A9841DisFasObs, Boolean.valueOf(n5304DisPreSal), Short.valueOf(A5304DisPreSal), Boolean.valueOf(n5305DisPrePie), Short.valueOf(A5305DisPrePie), Boolean.valueOf(n5306DisVelPro), A5306DisVelPro, Boolean.valueOf(n5307DisNumPas), Short.valueOf(A5307DisNumPas), Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
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
               A361DisCod = W361DisCod ;
               A758ProCod = W758ProCod ;
               A368DisFasLin = W368DisFasLin ;
               A457FasCod = W457FasCod ;
               /* End Insert */
               A361DisCod = W361DisCod ;
               A758ProCod = W758ProCod ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            A361DisCod = W361DisCod ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         /* Using cursor P04R510 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A13215DisNormNC = P04R510_A13215DisNormNC[0] ;
            A13214DisNormSt = P04R510_A13214DisNormSt[0] ;
            A13213DisNormID = P04R510_A13213DisNormID[0] ;
            W396EmprCod = A396EmprCod ;
            W361DisCod = A361DisCod ;
            /*
               INSERT RECORD ON TABLE TXPDISNOR

            */
            W396EmprCod = A396EmprCod ;
            W361DisCod = A361DisCod ;
            W13213DisNormID = A13213DisNormID ;
            A361DisCod = AV15DisDesCod ;
            /* Using cursor P04R511 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID, A13214DisNormSt, A13215DisNormNC});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISNOR");
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
            A396EmprCod = W396EmprCod ;
            A361DisCod = W361DisCod ;
            A13213DisNormID = W13213DisNormID ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A361DisCod = W361DisCod ;
            pr_default.readNext(8);
         }
         pr_default.close(8);
         /* Using cursor P04R512 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A13376DisTraID = P04R512_A13376DisTraID[0] ;
            W396EmprCod = A396EmprCod ;
            W361DisCod = A361DisCod ;
            /*
               INSERT RECORD ON TABLE TXPDISATI

            */
            W396EmprCod = A396EmprCod ;
            W361DisCod = A361DisCod ;
            W13376DisTraID = A13376DisTraID ;
            A361DisCod = AV15DisDesCod ;
            /* Using cursor P04R513 */
            pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13376DisTraID});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISATI");
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
            A396EmprCod = W396EmprCod ;
            A361DisCod = W361DisCod ;
            A13376DisTraID = W13376DisTraID ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A361DisCod = W361DisCod ;
            pr_default.readNext(10);
         }
         pr_default.close(10);
         if ( GXutil.strcmp(AV16Reop, httpContext.getMessage( "T", "")) == 0 )
         {
            /* Using cursor P04R514 */
            pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(12) != 101) )
            {
               A631Metros = P04R514_A631Metros[0] ;
               A595Kilos = P04R514_A595Kilos[0] ;
               A673Piezas = P04R514_A673Piezas[0] ;
               A3701PiezasUti = P04R514_A3701PiezasUti[0] ;
               n3701PiezasUti = P04R514_n3701PiezasUti[0] ;
               A3700MetrosUti = P04R514_A3700MetrosUti[0] ;
               n3700MetrosUti = P04R514_n3700MetrosUti[0] ;
               A3699KilosUti = P04R514_A3699KilosUti[0] ;
               n3699KilosUti = P04R514_n3699KilosUti[0] ;
               A44AlbRecCod = P04R514_A44AlbRecCod[0] ;
               O375DisNumUni = A375DisNumUni ;
               O374DisNumPie = A374DisNumPie ;
               W361DisCod = A361DisCod ;
               AV25Piezas = A673Piezas ;
               AV26Kilos = A595Kilos ;
               AV27Metros = A631Metros ;
               /*
                  INSERT RECORD ON TABLE TXPDISALB

               */
               W361DisCod = A361DisCod ;
               W673Piezas = A673Piezas ;
               W595Kilos = A595Kilos ;
               W631Metros = A631Metros ;
               A361DisCod = AV15DisDesCod ;
               A673Piezas = AV25Piezas ;
               A595Kilos = AV26Kilos ;
               A631Metros = AV27Metros ;
               /* Using cursor P04R515 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A673Piezas), A595Kilos, A631Metros, Boolean.valueOf(n3699KilosUti), A3699KilosUti, Boolean.valueOf(n3700MetrosUti), A3700MetrosUti, Boolean.valueOf(n3701PiezasUti), Short.valueOf(A3701PiezasUti)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
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
               A361DisCod = W361DisCod ;
               A673Piezas = W673Piezas ;
               A595Kilos = W595Kilos ;
               A631Metros = W631Metros ;
               /* End Insert */
               /* Using cursor P04R516 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
               if ( GXutil.strcmp(A392DisUniMed, httpContext.getMessage( "K", "")) == 0 )
               {
                  A375DisNumUni = A375DisNumUni.subtract(AV26Kilos) ;
               }
               else
               {
                  A375DisNumUni = A375DisNumUni.subtract(AV27Metros) ;
               }
               A374DisNumPie = (short)(A374DisNumPie-AV25Piezas) ;
               A361DisCod = W361DisCod ;
               pr_default.readNext(12);
            }
            pr_default.close(12);
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Using cursor P04R517 */
               pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
               while ( (pr_default.getStatus(15) != 101) )
               {
                  A384DisPieMet = P04R517_A384DisPieMet[0] ;
                  A382DisPieKil = P04R517_A382DisPieKil[0] ;
                  A9983DisPiePda = P04R517_A9983DisPiePda[0] ;
                  n9983DisPiePda = P04R517_n9983DisPiePda[0] ;
                  A9845DisPieAncc = P04R517_A9845DisPieAncc[0] ;
                  n9845DisPieAncc = P04R517_n9845DisPieAncc[0] ;
                  A8839DisPieCodB = P04R517_A8839DisPieCodB[0] ;
                  n8839DisPieCodB = P04R517_n8839DisPieCodB[0] ;
                  A6490DisPieIdPz = P04R517_A6490DisPieIdPz[0] ;
                  n6490DisPieIdPz = P04R517_n6490DisPieIdPz[0] ;
                  A5099DisPieEst = P04R517_A5099DisPieEst[0] ;
                  A2185DisPieAnc = P04R517_A2185DisPieAnc[0] ;
                  A2184DisPieLoc = P04R517_A2184DisPieLoc[0] ;
                  A380DisPieCod = P04R517_A380DisPieCod[0] ;
                  A44AlbRecCod = P04R517_A44AlbRecCod[0] ;
                  W361DisCod = A361DisCod ;
                  AV23DisPieKil = A382DisPieKil ;
                  AV24DisPieMet = A384DisPieMet ;
                  /*
                     INSERT RECORD ON TABLE TXPDISALD

                  */
                  W361DisCod = A361DisCod ;
                  W382DisPieKil = A382DisPieKil ;
                  W384DisPieMet = A384DisPieMet ;
                  A361DisCod = AV15DisDesCod ;
                  A382DisPieKil = AV23DisPieKil ;
                  A384DisPieMet = AV24DisPieMet ;
                  /* Using cursor P04R518 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod, A382DisPieKil, A384DisPieMet, A2184DisPieLoc, Short.valueOf(A2185DisPieAnc), Byte.valueOf(A5099DisPieEst), Boolean.valueOf(n6490DisPieIdPz), A6490DisPieIdPz, Boolean.valueOf(n8839DisPieCodB), A8839DisPieCodB, Boolean.valueOf(n9845DisPieAncc), Short.valueOf(A9845DisPieAncc), Boolean.valueOf(n9983DisPiePda), A9983DisPiePda});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
                  if ( (pr_default.getStatus(16) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  A361DisCod = W361DisCod ;
                  A382DisPieKil = W382DisPieKil ;
                  A384DisPieMet = W384DisPieMet ;
                  /* End Insert */
                  /* Using cursor P04R519 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
                  A361DisCod = W361DisCod ;
                  pr_default.readNext(15);
               }
               pr_default.close(15);
            }
         }
         /* Using cursor P04R520 */
         pr_default.execute(18, new Object[] {A375DisNumUni, Short.valueOf(A374DisNumPie), A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preo007.this.A396EmprCod;
      this.aP1[0] = preo007.this.A361DisCod;
      this.aP2[0] = preo007.this.AV15DisDesCod;
      this.aP3[0] = preo007.this.AV16Reop;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV30EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV28UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new byte[1] ;
      scmdbuf = "" ;
      P04R52_A1013DibCli = new String[] {""} ;
      P04R52_n1013DibCli = new boolean[] {false} ;
      P04R52_A1031EmpesCod = new String[] {""} ;
      P04R52_n1031EmpesCod = new boolean[] {false} ;
      P04R52_A3841DisArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A3826RetCod = new String[] {""} ;
      P04R52_n3826RetCod = new boolean[] {false} ;
      P04R52_A3627DisFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P04R52_n3627DisFecLan = new boolean[] {false} ;
      P04R52_A3309DisNumTon = new String[] {""} ;
      P04R52_A3308DisManCod2 = new short[1] ;
      P04R52_A3307DisManCod1 = new short[1] ;
      P04R52_A3306DisFac = new String[] {""} ;
      P04R52_A3132DisGraCru2 = new short[1] ;
      P04R52_A3131DisGraAca2 = new short[1] ;
      P04R52_A3130DisAncSal3 = new short[1] ;
      P04R52_A3129DisAncSal2 = new short[1] ;
      P04R52_A3128DisAncSal1 = new short[1] ;
      P04R52_A3127DisNumCor = new short[1] ;
      P04R52_A2835DisPle2 = new String[] {""} ;
      P04R52_A2926DisPla = new String[] {""} ;
      P04R52_A2833DisMtrLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A2832DisKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A2831DisNumLot = new int[1] ;
      P04R52_A2744DisNumTex2 = new short[1] ;
      P04R52_n2744DisNumTex2 = new boolean[] {false} ;
      P04R52_A2743DisNumTex1 = new byte[1] ;
      P04R52_A2742DisCodTex = new String[] {""} ;
      P04R52_n2742DisCodTex = new boolean[] {false} ;
      P04R52_A2403DisOpeAnt = new int[1] ;
      P04R52_n2403DisOpeAnt = new boolean[] {false} ;
      P04R52_A2402DisManCod = new short[1] ;
      P04R52_A2310DisCliDes = new int[1] ;
      P04R52_A2267DisNumBas = new short[1] ;
      P04R52_n2267DisNumBas = new boolean[] {false} ;
      P04R52_A2009DisTipDis = new String[] {""} ;
      P04R52_n2009DisTipDis = new boolean[] {false} ;
      P04R52_A1968DisRes = new String[] {""} ;
      P04R52_n1968DisRes = new boolean[] {false} ;
      P04R52_A1908DisRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A1907DisRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A1906DisGraAca = new short[1] ;
      P04R52_A1502DisPart = new short[1] ;
      P04R52_A1430DisLoc = new String[] {""} ;
      P04R52_A1233DisArtAc2 = new short[1] ;
      P04R52_A1232DisArtAcb = new short[1] ;
      P04R52_A1231DisArtAn1 = new short[1] ;
      P04R52_A1225DisGraCru = new short[1] ;
      P04R52_A1198DisEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A1197DisEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A1196DisNumCli = new int[1] ;
      P04R52_A1195DisNomCli = new String[] {""} ;
      P04R52_A1157TipConCod = new short[1] ;
      P04R52_n1157TipConCod = new boolean[] {false} ;
      P04R52_A252CliCod = new int[1] ;
      P04R52_A966PartCod = new String[] {""} ;
      P04R52_n966PartCod = new boolean[] {false} ;
      P04R52_A1122MaqCodDis = new String[] {""} ;
      P04R52_n1122MaqCodDis = new boolean[] {false} ;
      P04R52_A1002DisNumTen = new String[] {""} ;
      P04R52_n1002DisNumTen = new boolean[] {false} ;
      P04R52_A999DisNMez = new String[] {""} ;
      P04R52_A998DisNMtr = new String[] {""} ;
      P04R52_A373DisMtrLan = new short[1] ;
      P04R52_A372DisKgmLan = new short[1] ;
      P04R52_A383DisPieLan = new short[1] ;
      P04R52_A367DisEst = new byte[1] ;
      P04R52_A334DisArtAnh = new short[1] ;
      P04R52_A349DisArtPu3 = new short[1] ;
      P04R52_n349DisArtPu3 = new boolean[] {false} ;
      P04R52_A358DisArtUr3 = new String[] {""} ;
      P04R52_A348DisArtPu2 = new short[1] ;
      P04R52_A357DisArtUr2 = new String[] {""} ;
      P04R52_A347DisArtPu1 = new short[1] ;
      P04R52_A356DisArtUr1 = new String[] {""} ;
      P04R52_A359DisArtUrg = new byte[1] ;
      P04R52_A350DisArtRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A346DisArtPt3 = new short[1] ;
      P04R52_A355DisArtTr3 = new String[] {""} ;
      P04R52_A345DisArtPt2 = new short[1] ;
      P04R52_A354DisArtTr2 = new String[] {""} ;
      P04R52_A344DisArtPt1 = new short[1] ;
      P04R52_A353DisArtTr1 = new String[] {""} ;
      P04R52_A341DisArtOpe = new String[] {""} ;
      P04R52_A336DisArtCor = new String[] {""} ;
      P04R52_A338DisArtEnc = new String[] {""} ;
      P04R52_A352DisArtTip = new short[1] ;
      P04R52_A343DisArtPle = new String[] {""} ;
      P04R52_A333DisArtAca = new String[] {""} ;
      P04R52_A351DisArtSua = new String[] {""} ;
      P04R52_A339DisArtLar = new String[] {""} ;
      P04R52_A340DisArtMat = new String[] {""} ;
      P04R52_A378DisObsULin = new byte[1] ;
      P04R52_A366DisEnt = new String[] {""} ;
      P04R52_A337DisArtDsc = new String[] {""} ;
      P04R52_A390DisTipCol = new byte[1] ;
      P04R52_n390DisTipCol = new boolean[] {false} ;
      P04R52_A363DisColNum = new int[1] ;
      P04R52_n363DisColNum = new boolean[] {false} ;
      P04R52_A362DisColNom = new String[] {""} ;
      P04R52_n362DisColNom = new boolean[] {false} ;
      P04R52_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P04R52_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04R52_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P04R52_A360DisCliNum = new String[] {""} ;
      P04R52_A757PriCod = new String[] {""} ;
      P04R52_A342DisArtPes = new short[1] ;
      P04R52_A392DisUniMed = new String[] {""} ;
      P04R52_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A374DisNumPie = new short[1] ;
      P04R52_A335DisArtCod = new String[] {""} ;
      P04R52_A365DisDes = new String[] {""} ;
      P04R52_A396EmprCod = new String[] {""} ;
      P04R52_A361DisCod = new int[1] ;
      P04R52_A11658DisMemo2 = new String[] {""} ;
      P04R52_A4348DisUsrCod = new String[] {""} ;
      P04R52_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A14555DisPrePz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A13987DisArtDsc2 = new String[] {""} ;
      P04R52_A13986DisIdtx2 = new String[] {""} ;
      P04R52_n13986DisIdtx2 = new boolean[] {false} ;
      P04R52_A13768DisTallUlt = new short[1] ;
      P04R52_A13767DisRdto4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A13233DisRGB = new long[1] ;
      P04R52_A13080DisDGUltli = new byte[1] ;
      P04R52_A13076DisLinPrd = new String[] {""} ;
      P04R52_n13076DisLinPrd = new boolean[] {false} ;
      P04R52_A13069DisCanalID = new int[1] ;
      P04R52_n13069DisCanalID = new boolean[] {false} ;
      P04R52_A13068DisLineaID = new short[1] ;
      P04R52_n13068DisLineaID = new boolean[] {false} ;
      P04R52_A12880DisOEKOTEX = new String[] {""} ;
      P04R52_n12880DisOEKOTEX = new boolean[] {false} ;
      P04R52_A12772DisProdID = new String[] {""} ;
      P04R52_n12772DisProdID = new boolean[] {false} ;
      P04R52_A12768DisTpEstam = new byte[1] ;
      P04R52_A12765DisPriorid = new byte[1] ;
      P04R52_A12328RevenID = new String[] {""} ;
      P04R52_n12328RevenID = new boolean[] {false} ;
      P04R52_A11864Nxt_artcli = new String[] {""} ;
      P04R52_A11863DptoID = new short[1] ;
      P04R52_n11863DptoID = new boolean[] {false} ;
      P04R52_A11862DesaID = new short[1] ;
      P04R52_n11862DesaID = new boolean[] {false} ;
      P04R52_A11861Nxt_statio = new String[] {""} ;
      P04R52_A11860CpteId = new short[1] ;
      P04R52_n11860CpteId = new boolean[] {false} ;
      P04R52_A11859Nxt_modelo = new String[] {""} ;
      P04R52_A11734DisCnoEncO = new String[] {""} ;
      P04R52_A11661DisOrdComp = new String[] {""} ;
      P04R52_A11659MarcaId = new String[] {""} ;
      P04R52_n11659MarcaId = new boolean[] {false} ;
      P04R52_A11657DisMemo1 = new String[] {""} ;
      P04R52_A3696DisParPar = new String[] {""} ;
      P04R52_n3696DisParPar = new boolean[] {false} ;
      P04R52_A3695DisParReo = new byte[1] ;
      P04R52_n3695DisParReo = new boolean[] {false} ;
      P04R52_A3694DisParCod = new int[1] ;
      P04R52_n3694DisParCod = new boolean[] {false} ;
      P04R52_A7067DisUltNot = new byte[1] ;
      P04R52_n7067DisUltNot = new boolean[] {false} ;
      P04R52_A4918DisDibCoDN = new int[1] ;
      P04R52_n4918DisDibCoDN = new boolean[] {false} ;
      P04R52_A4879DibColColN = new int[1] ;
      P04R52_n4879DibColColN = new boolean[] {false} ;
      P04R52_A4919DisDibCoCN = new int[1] ;
      P04R52_n4919DisDibCoCN = new boolean[] {false} ;
      P04R52_A4877DibColCol = new String[] {""} ;
      P04R52_n4877DibColCol = new boolean[] {false} ;
      P04R52_A4476DisAcaFor = new int[1] ;
      P04R52_n4476DisAcaFor = new boolean[] {false} ;
      P04R52_A4475DisLotMaq = new String[] {""} ;
      P04R52_n4475DisLotMaq = new boolean[] {false} ;
      P04R52_A4472DisLotPza = new short[1] ;
      P04R52_n4472DisLotPza = new boolean[] {false} ;
      P04R52_A4355DisFecPed = new java.util.Date[] {GXutil.nullDate()} ;
      P04R52_n4355DisFecPed = new boolean[] {false} ;
      P04R52_A10887Cod_Idtx = new String[] {""} ;
      P04R52_n10887Cod_Idtx = new boolean[] {false} ;
      P04R52_A9787DisItem6 = new String[] {""} ;
      P04R52_A9786DisItem5 = new String[] {""} ;
      P04R52_A9774DisItem4 = new String[] {""} ;
      P04R52_A9773DisItem3 = new String[] {""} ;
      P04R52_A9772DisItem2 = new String[] {""} ;
      P04R52_A9771DisItem1 = new String[] {""} ;
      P04R52_A8887DisFchT = new java.util.Date[] {GXutil.nullDate()} ;
      P04R52_n8887DisFchT = new boolean[] {false} ;
      P04R52_A8886DisDest = new String[] {""} ;
      P04R52_A8885DisFEnt = new String[] {""} ;
      P04R52_n8885DisFEnt = new boolean[] {false} ;
      P04R52_A7739DisExp = new String[] {""} ;
      P04R52_A7738DisMaqEst = new String[] {""} ;
      P04R52_A7523DisRec = new String[] {""} ;
      P04R52_A7516DisGraTam = new String[] {""} ;
      P04R52_n7516DisGraTam = new boolean[] {false} ;
      P04R52_A7515DisDesCol = new byte[1] ;
      P04R52_n7515DisDesCol = new boolean[] {false} ;
      P04R52_A7514DisOrdGra = new byte[1] ;
      P04R52_A7513DisOrdSep = new byte[1] ;
      P04R52_A7512DisFacGra = new byte[1] ;
      P04R52_n7512DisFacGra = new boolean[] {false} ;
      P04R52_A7511DisFacSep = new byte[1] ;
      P04R52_n7511DisFacSep = new boolean[] {false} ;
      P04R52_A7510DisDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_n7510DisDto = new boolean[] {false} ;
      P04R52_A6548DisRbMaq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A6547DisVolMaq = new int[1] ;
      P04R52_A5405DisAntpT = new String[] {""} ;
      P04R52_A5366DisAntp = new String[] {""} ;
      P04R52_A5350DisObsAnc = new String[] {""} ;
      P04R52_A5349DisObsGrm = new String[] {""} ;
      P04R52_A5290DisTipCor = new String[] {""} ;
      P04R52_A5252DisAcc = new String[] {""} ;
      P04R52_A5032DisEstTip = new String[] {""} ;
      P04R52_A5031DisCom = new String[] {""} ;
      P04R52_n5031DisCom = new boolean[] {false} ;
      P04R52_A5025DisGraCob = new byte[1] ;
      P04R52_A5024DisTipEst = new byte[1] ;
      P04R52_A4876DibColDib = new String[] {""} ;
      P04R52_n4876DibColDib = new boolean[] {false} ;
      P04R52_A4813DisEncCli = new String[] {""} ;
      P04R52_A4785DisNroCor = new int[1] ;
      P04R52_A4720DisDishCod = new String[] {""} ;
      P04R52_A4617DisHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      P04R52_n4617DisHorReg = new boolean[] {false} ;
      P04R52_A4616DisHorEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P04R52_n4616DisHorEnt = new boolean[] {false} ;
      P04R52_A4615DisTam = new String[] {""} ;
      P04R52_A4614DisMdlCod = new String[] {""} ;
      P04R52_A4479DisAcaMar = new String[] {""} ;
      P04R52_A4478DisAcaAnh = new short[1] ;
      P04R52_A4477DisAcaBak = new String[] {""} ;
      P04R52_A4474DisLotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A4473DisLotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A4471DisCruEnr = new String[] {""} ;
      P04R52_A4470DisCruKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A4469DisCruMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R52_A4468DisPelAnh = new short[1] ;
      P04R52_A4294DisNPzasL = new int[1] ;
      P04R52_n4294DisNPzasL = new boolean[] {false} ;
      P04R52_A4293DisNPzas = new int[1] ;
      P04R52_n4293DisNPzas = new boolean[] {false} ;
      P04R52_A4014DisTin = new String[] {""} ;
      P04R52_A4013DisEnv = new byte[1] ;
      P04R52_n4013DisEnv = new boolean[] {false} ;
      P04R52_A2525DisComULin = new byte[1] ;
      P04R52_n2525DisComULin = new boolean[] {false} ;
      P04R52_A1052DisObs = new String[] {""} ;
      P04R52_A1051DisNumCol = new short[1] ;
      P04R52_n1051DisNumCol = new boolean[] {false} ;
      P04R52_A1014DibInt = new int[1] ;
      P04R52_n1014DibInt = new boolean[] {false} ;
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
      A1198DisEncAnh = DecimalUtil.ZERO ;
      A1197DisEncCom = DecimalUtil.ZERO ;
      A1195DisNomCli = "" ;
      A966PartCod = "" ;
      A1122MaqCodDis = "" ;
      A1002DisNumTen = "" ;
      A999DisNMez = "" ;
      A998DisNMtr = "" ;
      A358DisArtUr3 = "" ;
      A357DisArtUr2 = "" ;
      A356DisArtUr1 = "" ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A355DisArtTr3 = "" ;
      A354DisArtTr2 = "" ;
      A353DisArtTr1 = "" ;
      A341DisArtOpe = "" ;
      A336DisArtCor = "" ;
      A338DisArtEnc = "" ;
      A343DisArtPle = "" ;
      A333DisArtAca = "" ;
      A351DisArtSua = "" ;
      A339DisArtLar = "" ;
      A340DisArtMat = "" ;
      A366DisEnt = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A371DisFecEnt = GXutil.nullDate() ;
      A369DisFec = GXutil.nullDate() ;
      A370DisFecCli = GXutil.nullDate() ;
      A360DisCliNum = "" ;
      A757PriCod = "" ;
      A392DisUniMed = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A335DisArtCod = "" ;
      A365DisDes = "" ;
      A11658DisMemo2 = "" ;
      A4348DisUsrCod = "" ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      A388DisPreKgm = DecimalUtil.ZERO ;
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
      A4014DisTin = "" ;
      A1052DisObs = "" ;
      W396EmprCod = "" ;
      AV36Disprekgm = DecimalUtil.ZERO ;
      AV37DisPremtr = DecimalUtil.ZERO ;
      AV38Dismemo2 = "" ;
      W4348DisUsrCod = "" ;
      W388DisPreKgm = DecimalUtil.ZERO ;
      W389DisPreMtr = DecimalUtil.ZERO ;
      W11658DisMemo2 = "" ;
      Gx_emsg = "" ;
      P04R54_A396EmprCod = new String[] {""} ;
      P04R54_A361DisCod = new int[1] ;
      P04R54_A377DisObsTxt = new String[] {""} ;
      P04R54_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV18DisObsTxt = "" ;
      W377DisObsTxt = "" ;
      P04R56_A396EmprCod = new String[] {""} ;
      P04R56_A361DisCod = new int[1] ;
      P04R56_A846UltFasLin = new short[1] ;
      P04R56_A758ProCod = new String[] {""} ;
      P04R56_A12144ProStsFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04R56_n12144ProStsFec = new boolean[] {false} ;
      P04R56_A12143ProSts = new byte[1] ;
      P04R56_n12143ProSts = new boolean[] {false} ;
      P04R56_A5334DisFasApr = new String[] {""} ;
      P04R56_n5334DisFasApr = new boolean[] {false} ;
      A758ProCod = "" ;
      A12144ProStsFec = GXutil.resetTime( GXutil.nullDate() );
      A5334DisFasApr = "" ;
      AV19ProCod = "" ;
      W758ProCod = "" ;
      P04R58_A396EmprCod = new String[] {""} ;
      P04R58_A361DisCod = new int[1] ;
      P04R58_A758ProCod = new String[] {""} ;
      P04R58_A457FasCod = new String[] {""} ;
      P04R58_A368DisFasLin = new short[1] ;
      P04R58_A7744FasPreObl = new byte[1] ;
      P04R58_n7744FasPreObl = new boolean[] {false} ;
      P04R58_A5307DisNumPas = new short[1] ;
      P04R58_n5307DisNumPas = new boolean[] {false} ;
      P04R58_A5306DisVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R58_n5306DisVelPro = new boolean[] {false} ;
      P04R58_A5305DisPrePie = new short[1] ;
      P04R58_n5305DisPrePie = new boolean[] {false} ;
      P04R58_A5304DisPreSal = new short[1] ;
      P04R58_n5304DisPreSal = new boolean[] {false} ;
      P04R58_A9841DisFasObs = new String[] {""} ;
      P04R58_A7918Dta_UOrd = new short[1] ;
      P04R58_n7918Dta_UOrd = new boolean[] {false} ;
      P04R58_A7917DisfasRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R58_n7917DisfasRb = new boolean[] {false} ;
      P04R58_A7916DisFasUpL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R58_n7916DisFasUpL = new boolean[] {false} ;
      P04R58_A7915Disfastpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R58_n7915Disfastpp = new boolean[] {false} ;
      P04R58_A7747DisFasAut = new byte[1] ;
      P04R58_n7747DisFasAut = new boolean[] {false} ;
      P04R58_A7743DisFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R58_n7743DisFasRec = new boolean[] {false} ;
      P04R58_A7742DisFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R58_n7742DisFasDto = new boolean[] {false} ;
      P04R58_A7741DisFasUni = new String[] {""} ;
      P04R58_n7741DisFasUni = new boolean[] {false} ;
      P04R58_A7740DisFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R58_n7740DisFasPre = new boolean[] {false} ;
      P04R58_A5376DisQuiUl = new short[1] ;
      P04R58_A3793DisMaqPru = new String[] {""} ;
      P04R58_n3793DisMaqPru = new boolean[] {false} ;
      P04R58_A3697FasApr = new String[] {""} ;
      A457FasCod = "" ;
      A5306DisVelPro = DecimalUtil.ZERO ;
      A9841DisFasObs = "" ;
      A7917DisfasRb = DecimalUtil.ZERO ;
      A7916DisFasUpL = DecimalUtil.ZERO ;
      A7915Disfastpp = DecimalUtil.ZERO ;
      A7743DisFasRec = DecimalUtil.ZERO ;
      A7742DisFasDto = DecimalUtil.ZERO ;
      A7741DisFasUni = "" ;
      A7740DisFasPre = DecimalUtil.ZERO ;
      A3793DisMaqPru = "" ;
      A3697FasApr = "" ;
      AV22FasCod = "" ;
      W457FasCod = "" ;
      P04R510_A396EmprCod = new String[] {""} ;
      P04R510_A361DisCod = new int[1] ;
      P04R510_A13215DisNormNC = new String[] {""} ;
      P04R510_A13214DisNormSt = new String[] {""} ;
      P04R510_A13213DisNormID = new String[] {""} ;
      A13215DisNormNC = "" ;
      A13214DisNormSt = "" ;
      A13213DisNormID = "" ;
      W13213DisNormID = "" ;
      P04R512_A396EmprCod = new String[] {""} ;
      P04R512_A361DisCod = new int[1] ;
      P04R512_A13376DisTraID = new String[] {""} ;
      A13376DisTraID = "" ;
      W13376DisTraID = "" ;
      P04R514_A396EmprCod = new String[] {""} ;
      P04R514_A361DisCod = new int[1] ;
      P04R514_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R514_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R514_A673Piezas = new int[1] ;
      P04R514_A3701PiezasUti = new short[1] ;
      P04R514_n3701PiezasUti = new boolean[] {false} ;
      P04R514_A3700MetrosUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R514_n3700MetrosUti = new boolean[] {false} ;
      P04R514_A3699KilosUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R514_n3699KilosUti = new boolean[] {false} ;
      P04R514_A44AlbRecCod = new int[1] ;
      A631Metros = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      A3700MetrosUti = DecimalUtil.ZERO ;
      A3699KilosUti = DecimalUtil.ZERO ;
      O375DisNumUni = DecimalUtil.ZERO ;
      AV26Kilos = DecimalUtil.ZERO ;
      AV27Metros = DecimalUtil.ZERO ;
      W595Kilos = DecimalUtil.ZERO ;
      W631Metros = DecimalUtil.ZERO ;
      P04R517_A396EmprCod = new String[] {""} ;
      P04R517_A361DisCod = new int[1] ;
      P04R517_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R517_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R517_A9983DisPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04R517_n9983DisPiePda = new boolean[] {false} ;
      P04R517_A9845DisPieAncc = new short[1] ;
      P04R517_n9845DisPieAncc = new boolean[] {false} ;
      P04R517_A8839DisPieCodB = new String[] {""} ;
      P04R517_n8839DisPieCodB = new boolean[] {false} ;
      P04R517_A6490DisPieIdPz = new String[] {""} ;
      P04R517_n6490DisPieIdPz = new boolean[] {false} ;
      P04R517_A5099DisPieEst = new byte[1] ;
      P04R517_A2185DisPieAnc = new short[1] ;
      P04R517_A2184DisPieLoc = new String[] {""} ;
      P04R517_A380DisPieCod = new String[] {""} ;
      P04R517_A44AlbRecCod = new int[1] ;
      A384DisPieMet = DecimalUtil.ZERO ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A9983DisPiePda = DecimalUtil.ZERO ;
      A8839DisPieCodB = "" ;
      A6490DisPieIdPz = "" ;
      A2184DisPieLoc = "" ;
      A380DisPieCod = "" ;
      AV23DisPieKil = DecimalUtil.ZERO ;
      AV24DisPieMet = DecimalUtil.ZERO ;
      W382DisPieKil = DecimalUtil.ZERO ;
      W384DisPieMet = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preo007__default(),
         new Object[] {
             new Object[] {
            P04R52_A1013DibCli, P04R52_n1013DibCli, P04R52_A1031EmpesCod, P04R52_n1031EmpesCod, P04R52_A3841DisArtMer, P04R52_A3826RetCod, P04R52_n3826RetCod, P04R52_A3627DisFecLan, P04R52_n3627DisFecLan, P04R52_A3309DisNumTon,
            P04R52_A3308DisManCod2, P04R52_A3307DisManCod1, P04R52_A3306DisFac, P04R52_A3132DisGraCru2, P04R52_A3131DisGraAca2, P04R52_A3130DisAncSal3, P04R52_A3129DisAncSal2, P04R52_A3128DisAncSal1, P04R52_A3127DisNumCor, P04R52_A2835DisPle2,
            P04R52_A2926DisPla, P04R52_A2833DisMtrLot, P04R52_A2832DisKgsLot, P04R52_A2831DisNumLot, P04R52_A2744DisNumTex2, P04R52_n2744DisNumTex2, P04R52_A2743DisNumTex1, P04R52_A2742DisCodTex, P04R52_n2742DisCodTex, P04R52_A2403DisOpeAnt,
            P04R52_n2403DisOpeAnt, P04R52_A2402DisManCod, P04R52_A2310DisCliDes, P04R52_A2267DisNumBas, P04R52_n2267DisNumBas, P04R52_A2009DisTipDis, P04R52_n2009DisTipDis, P04R52_A1968DisRes, P04R52_n1968DisRes, P04R52_A1908DisRdoA,
            P04R52_A1907DisRdoN, P04R52_A1906DisGraAca, P04R52_A1502DisPart, P04R52_A1430DisLoc, P04R52_A1233DisArtAc2, P04R52_A1232DisArtAcb, P04R52_A1231DisArtAn1, P04R52_A1225DisGraCru, P04R52_A1198DisEncAnh, P04R52_A1197DisEncCom,
            P04R52_A1196DisNumCli, P04R52_A1195DisNomCli, P04R52_A1157TipConCod, P04R52_n1157TipConCod, P04R52_A252CliCod, P04R52_A966PartCod, P04R52_n966PartCod, P04R52_A1122MaqCodDis, P04R52_n1122MaqCodDis, P04R52_A1002DisNumTen,
            P04R52_n1002DisNumTen, P04R52_A999DisNMez, P04R52_A998DisNMtr, P04R52_A373DisMtrLan, P04R52_A372DisKgmLan, P04R52_A383DisPieLan, P04R52_A367DisEst, P04R52_A334DisArtAnh, P04R52_A349DisArtPu3, P04R52_n349DisArtPu3,
            P04R52_A358DisArtUr3, P04R52_A348DisArtPu2, P04R52_A357DisArtUr2, P04R52_A347DisArtPu1, P04R52_A356DisArtUr1, P04R52_A359DisArtUrg, P04R52_A350DisArtRdt, P04R52_A346DisArtPt3, P04R52_A355DisArtTr3, P04R52_A345DisArtPt2,
            P04R52_A354DisArtTr2, P04R52_A344DisArtPt1, P04R52_A353DisArtTr1, P04R52_A341DisArtOpe, P04R52_A336DisArtCor, P04R52_A338DisArtEnc, P04R52_A352DisArtTip, P04R52_A343DisArtPle, P04R52_A333DisArtAca, P04R52_A351DisArtSua,
            P04R52_A339DisArtLar, P04R52_A340DisArtMat, P04R52_A378DisObsULin, P04R52_A366DisEnt, P04R52_A337DisArtDsc, P04R52_A390DisTipCol, P04R52_n390DisTipCol, P04R52_A363DisColNum, P04R52_n363DisColNum, P04R52_A362DisColNom,
            P04R52_n362DisColNom, P04R52_A371DisFecEnt, P04R52_A369DisFec, P04R52_A370DisFecCli, P04R52_A360DisCliNum, P04R52_A757PriCod, P04R52_A342DisArtPes, P04R52_A392DisUniMed, P04R52_A375DisNumUni, P04R52_A374DisNumPie,
            P04R52_A335DisArtCod, P04R52_A365DisDes, P04R52_A396EmprCod, P04R52_A361DisCod, P04R52_A11658DisMemo2, P04R52_A4348DisUsrCod, P04R52_A389DisPreMtr, P04R52_A388DisPreKgm, P04R52_A14555DisPrePz, P04R52_A13987DisArtDsc2,
            P04R52_A13986DisIdtx2, P04R52_n13986DisIdtx2, P04R52_A13768DisTallUlt, P04R52_A13767DisRdto4, P04R52_A13233DisRGB, P04R52_A13080DisDGUltli, P04R52_A13076DisLinPrd, P04R52_n13076DisLinPrd, P04R52_A13069DisCanalID, P04R52_n13069DisCanalID,
            P04R52_A13068DisLineaID, P04R52_n13068DisLineaID, P04R52_A12880DisOEKOTEX, P04R52_n12880DisOEKOTEX, P04R52_A12772DisProdID, P04R52_n12772DisProdID, P04R52_A12768DisTpEstam, P04R52_A12765DisPriorid, P04R52_A12328RevenID, P04R52_n12328RevenID,
            P04R52_A11864Nxt_artcli, P04R52_A11863DptoID, P04R52_n11863DptoID, P04R52_A11862DesaID, P04R52_n11862DesaID, P04R52_A11861Nxt_statio, P04R52_A11860CpteId, P04R52_n11860CpteId, P04R52_A11859Nxt_modelo, P04R52_A11734DisCnoEncO,
            P04R52_A11661DisOrdComp, P04R52_A11659MarcaId, P04R52_n11659MarcaId, P04R52_A11657DisMemo1, P04R52_A3696DisParPar, P04R52_n3696DisParPar, P04R52_A3695DisParReo, P04R52_n3695DisParReo, P04R52_A3694DisParCod, P04R52_n3694DisParCod,
            P04R52_A7067DisUltNot, P04R52_n7067DisUltNot, P04R52_A4918DisDibCoDN, P04R52_n4918DisDibCoDN, P04R52_A4879DibColColN, P04R52_n4879DibColColN, P04R52_A4919DisDibCoCN, P04R52_n4919DisDibCoCN, P04R52_A4877DibColCol, P04R52_n4877DibColCol,
            P04R52_A4476DisAcaFor, P04R52_n4476DisAcaFor, P04R52_A4475DisLotMaq, P04R52_n4475DisLotMaq, P04R52_A4472DisLotPza, P04R52_n4472DisLotPza, P04R52_A4355DisFecPed, P04R52_n4355DisFecPed, P04R52_A10887Cod_Idtx, P04R52_n10887Cod_Idtx,
            P04R52_A9787DisItem6, P04R52_A9786DisItem5, P04R52_A9774DisItem4, P04R52_A9773DisItem3, P04R52_A9772DisItem2, P04R52_A9771DisItem1, P04R52_A8887DisFchT, P04R52_n8887DisFchT, P04R52_A8886DisDest, P04R52_A8885DisFEnt,
            P04R52_n8885DisFEnt, P04R52_A7739DisExp, P04R52_A7738DisMaqEst, P04R52_A7523DisRec, P04R52_A7516DisGraTam, P04R52_n7516DisGraTam, P04R52_A7515DisDesCol, P04R52_n7515DisDesCol, P04R52_A7514DisOrdGra, P04R52_A7513DisOrdSep,
            P04R52_A7512DisFacGra, P04R52_n7512DisFacGra, P04R52_A7511DisFacSep, P04R52_n7511DisFacSep, P04R52_A7510DisDto, P04R52_n7510DisDto, P04R52_A6548DisRbMaq, P04R52_A6547DisVolMaq, P04R52_A5405DisAntpT, P04R52_A5366DisAntp,
            P04R52_A5350DisObsAnc, P04R52_A5349DisObsGrm, P04R52_A5290DisTipCor, P04R52_A5252DisAcc, P04R52_A5032DisEstTip, P04R52_A5031DisCom, P04R52_n5031DisCom, P04R52_A5025DisGraCob, P04R52_A5024DisTipEst, P04R52_A4876DibColDib,
            P04R52_n4876DibColDib, P04R52_A4813DisEncCli, P04R52_A4785DisNroCor, P04R52_A4720DisDishCod, P04R52_A4617DisHorReg, P04R52_n4617DisHorReg, P04R52_A4616DisHorEnt, P04R52_n4616DisHorEnt, P04R52_A4615DisTam, P04R52_A4614DisMdlCod,
            P04R52_A4479DisAcaMar, P04R52_A4478DisAcaAnh, P04R52_A4477DisAcaBak, P04R52_A4474DisLotKgs, P04R52_A4473DisLotMts, P04R52_A4471DisCruEnr, P04R52_A4470DisCruKgs, P04R52_A4469DisCruMts, P04R52_A4468DisPelAnh, P04R52_A4294DisNPzasL,
            P04R52_n4294DisNPzasL, P04R52_A4293DisNPzas, P04R52_n4293DisNPzas, P04R52_A4014DisTin, P04R52_A4013DisEnv, P04R52_n4013DisEnv, P04R52_A2525DisComULin, P04R52_n2525DisComULin, P04R52_A1052DisObs, P04R52_A1051DisNumCol,
            P04R52_n1051DisNumCol, P04R52_A1014DibInt, P04R52_n1014DibInt
            }
            , new Object[] {
            }
            , new Object[] {
            P04R54_A396EmprCod, P04R54_A361DisCod, P04R54_A377DisObsTxt, P04R54_A376DisObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            P04R56_A396EmprCod, P04R56_A361DisCod, P04R56_A846UltFasLin, P04R56_A758ProCod, P04R56_A12144ProStsFec, P04R56_n12144ProStsFec, P04R56_A12143ProSts, P04R56_n12143ProSts, P04R56_A5334DisFasApr, P04R56_n5334DisFasApr
            }
            , new Object[] {
            }
            , new Object[] {
            P04R58_A396EmprCod, P04R58_A361DisCod, P04R58_A758ProCod, P04R58_A457FasCod, P04R58_A368DisFasLin, P04R58_A7744FasPreObl, P04R58_n7744FasPreObl, P04R58_A5307DisNumPas, P04R58_n5307DisNumPas, P04R58_A5306DisVelPro,
            P04R58_n5306DisVelPro, P04R58_A5305DisPrePie, P04R58_n5305DisPrePie, P04R58_A5304DisPreSal, P04R58_n5304DisPreSal, P04R58_A9841DisFasObs, P04R58_A7918Dta_UOrd, P04R58_n7918Dta_UOrd, P04R58_A7917DisfasRb, P04R58_n7917DisfasRb,
            P04R58_A7916DisFasUpL, P04R58_n7916DisFasUpL, P04R58_A7915Disfastpp, P04R58_n7915Disfastpp, P04R58_A7747DisFasAut, P04R58_n7747DisFasAut, P04R58_A7743DisFasRec, P04R58_n7743DisFasRec, P04R58_A7742DisFasDto, P04R58_n7742DisFasDto,
            P04R58_A7741DisFasUni, P04R58_n7741DisFasUni, P04R58_A7740DisFasPre, P04R58_n7740DisFasPre, P04R58_A5376DisQuiUl, P04R58_A3793DisMaqPru, P04R58_n3793DisMaqPru, P04R58_A3697FasApr
            }
            , new Object[] {
            }
            , new Object[] {
            P04R510_A396EmprCod, P04R510_A361DisCod, P04R510_A13215DisNormNC, P04R510_A13214DisNormSt, P04R510_A13213DisNormID
            }
            , new Object[] {
            }
            , new Object[] {
            P04R512_A396EmprCod, P04R512_A361DisCod, P04R512_A13376DisTraID
            }
            , new Object[] {
            }
            , new Object[] {
            P04R514_A396EmprCod, P04R514_A361DisCod, P04R514_A631Metros, P04R514_A595Kilos, P04R514_A673Piezas, P04R514_A3701PiezasUti, P04R514_n3701PiezasUti, P04R514_A3700MetrosUti, P04R514_n3700MetrosUti, P04R514_A3699KilosUti,
            P04R514_n3699KilosUti, P04R514_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04R517_A396EmprCod, P04R517_A361DisCod, P04R517_A384DisPieMet, P04R517_A382DisPieKil, P04R517_A9983DisPiePda, P04R517_n9983DisPiePda, P04R517_A9845DisPieAncc, P04R517_n9845DisPieAncc, P04R517_A8839DisPieCodB, P04R517_n8839DisPieCodB,
            P04R517_A6490DisPieIdPz, P04R517_n6490DisPieIdPz, P04R517_A5099DisPieEst, P04R517_A2185DisPieAnc, P04R517_A2184DisPieLoc, P04R517_A380DisPieCod, P04R517_A44AlbRecCod
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

   private byte AV31FlagJBP ;
   private byte AV32Gassol ;
   private byte GXv_int5[] ;
   private byte A2743DisNumTex1 ;
   private byte A367DisEst ;
   private byte A359DisArtUrg ;
   private byte A378DisObsULin ;
   private byte A390DisTipCol ;
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
   private byte A376DisObsLin ;
   private byte AV17DisObsLin ;
   private byte W376DisObsLin ;
   private byte A12143ProSts ;
   private byte A7744FasPreObl ;
   private byte A7747DisFasAut ;
   private byte A5099DisPieEst ;
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
   private short A1233DisArtAc2 ;
   private short A1232DisArtAcb ;
   private short A1231DisArtAn1 ;
   private short A1225DisGraCru ;
   private short A1157TipConCod ;
   private short A373DisMtrLan ;
   private short A372DisKgmLan ;
   private short A383DisPieLan ;
   private short A334DisArtAnh ;
   private short A349DisArtPu3 ;
   private short A348DisArtPu2 ;
   private short A347DisArtPu1 ;
   private short A346DisArtPt3 ;
   private short A345DisArtPt2 ;
   private short A344DisArtPt1 ;
   private short A352DisArtTip ;
   private short A342DisArtPes ;
   private short A374DisNumPie ;
   private short A13768DisTallUlt ;
   private short A13068DisLineaID ;
   private short A11863DptoID ;
   private short A11862DesaID ;
   private short A11860CpteId ;
   private short A4472DisLotPza ;
   private short A4478DisAcaAnh ;
   private short A4468DisPelAnh ;
   private short A1051DisNumCol ;
   private short Gx_err ;
   private short A846UltFasLin ;
   private short AV20UltFasLin ;
   private short W846UltFasLin ;
   private short A368DisFasLin ;
   private short A5307DisNumPas ;
   private short A5305DisPrePie ;
   private short A5304DisPreSal ;
   private short A7918Dta_UOrd ;
   private short A5376DisQuiUl ;
   private short AV21DisFasLin ;
   private short W368DisFasLin ;
   private short A3701PiezasUti ;
   private short O374DisNumPie ;
   private short A9845DisPieAncc ;
   private short A2185DisPieAnc ;
   private int A361DisCod ;
   private int AV15DisDesCod ;
   private int A2831DisNumLot ;
   private int A2403DisOpeAnt ;
   private int A2310DisCliDes ;
   private int A1196DisNumCli ;
   private int A252CliCod ;
   private int A363DisColNum ;
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
   private int W361DisCod ;
   private int GX_INS34 ;
   private int GX_INS40 ;
   private int GX_INS38 ;
   private int GX_INS39 ;
   private int GX_INS1812 ;
   private int GX_INS1832 ;
   private int A673Piezas ;
   private int A44AlbRecCod ;
   private int AV25Piezas ;
   private int GX_INS35 ;
   private int W673Piezas ;
   private int GX_INS36 ;
   private long A13233DisRGB ;
   private java.math.BigDecimal A3841DisArtMer ;
   private java.math.BigDecimal A2833DisMtrLot ;
   private java.math.BigDecimal A2832DisKgsLot ;
   private java.math.BigDecimal A1908DisRdoA ;
   private java.math.BigDecimal A1907DisRdoN ;
   private java.math.BigDecimal A1198DisEncAnh ;
   private java.math.BigDecimal A1197DisEncCom ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A389DisPreMtr ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A14555DisPrePz ;
   private java.math.BigDecimal A13767DisRdto4 ;
   private java.math.BigDecimal A7510DisDto ;
   private java.math.BigDecimal A6548DisRbMaq ;
   private java.math.BigDecimal A4474DisLotKgs ;
   private java.math.BigDecimal A4473DisLotMts ;
   private java.math.BigDecimal A4470DisCruKgs ;
   private java.math.BigDecimal A4469DisCruMts ;
   private java.math.BigDecimal AV36Disprekgm ;
   private java.math.BigDecimal AV37DisPremtr ;
   private java.math.BigDecimal W388DisPreKgm ;
   private java.math.BigDecimal W389DisPreMtr ;
   private java.math.BigDecimal A5306DisVelPro ;
   private java.math.BigDecimal A7917DisfasRb ;
   private java.math.BigDecimal A7916DisFasUpL ;
   private java.math.BigDecimal A7915Disfastpp ;
   private java.math.BigDecimal A7743DisFasRec ;
   private java.math.BigDecimal A7742DisFasDto ;
   private java.math.BigDecimal A7740DisFasPre ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A3700MetrosUti ;
   private java.math.BigDecimal A3699KilosUti ;
   private java.math.BigDecimal O375DisNumUni ;
   private java.math.BigDecimal AV26Kilos ;
   private java.math.BigDecimal AV27Metros ;
   private java.math.BigDecimal W595Kilos ;
   private java.math.BigDecimal W631Metros ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A9983DisPiePda ;
   private java.math.BigDecimal AV23DisPieKil ;
   private java.math.BigDecimal AV24DisPieMet ;
   private java.math.BigDecimal W382DisPieKil ;
   private java.math.BigDecimal W384DisPieMet ;
   private String A396EmprCod ;
   private String AV16Reop ;
   private String AV29Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV30EmprNom ;
   private String GXv_char3[] ;
   private String AV28UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
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
   private String A1195DisNomCli ;
   private String A966PartCod ;
   private String A1122MaqCodDis ;
   private String A1002DisNumTen ;
   private String A999DisNMez ;
   private String A998DisNMtr ;
   private String A358DisArtUr3 ;
   private String A357DisArtUr2 ;
   private String A356DisArtUr1 ;
   private String A355DisArtTr3 ;
   private String A354DisArtTr2 ;
   private String A353DisArtTr1 ;
   private String A341DisArtOpe ;
   private String A336DisArtCor ;
   private String A338DisArtEnc ;
   private String A343DisArtPle ;
   private String A333DisArtAca ;
   private String A351DisArtSua ;
   private String A339DisArtLar ;
   private String A340DisArtMat ;
   private String A366DisEnt ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A360DisCliNum ;
   private String A757PriCod ;
   private String A392DisUniMed ;
   private String A335DisArtCod ;
   private String A365DisDes ;
   private String A4348DisUsrCod ;
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
   private String A4014DisTin ;
   private String A1052DisObs ;
   private String W396EmprCod ;
   private String W4348DisUsrCod ;
   private String Gx_emsg ;
   private String A377DisObsTxt ;
   private String AV18DisObsTxt ;
   private String W377DisObsTxt ;
   private String A758ProCod ;
   private String A5334DisFasApr ;
   private String AV19ProCod ;
   private String W758ProCod ;
   private String A457FasCod ;
   private String A7741DisFasUni ;
   private String A3793DisMaqPru ;
   private String A3697FasApr ;
   private String AV22FasCod ;
   private String W457FasCod ;
   private String A13215DisNormNC ;
   private String A13214DisNormSt ;
   private String A13213DisNormID ;
   private String W13213DisNormID ;
   private String A13376DisTraID ;
   private String W13376DisTraID ;
   private String A8839DisPieCodB ;
   private String A6490DisPieIdPz ;
   private String A2184DisPieLoc ;
   private String A380DisPieCod ;
   private java.util.Date A4617DisHorReg ;
   private java.util.Date A4616DisHorEnt ;
   private java.util.Date A12144ProStsFec ;
   private java.util.Date A3627DisFecLan ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date A369DisFec ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A4355DisFecPed ;
   private java.util.Date A8887DisFchT ;
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
   private boolean n349DisArtPu3 ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
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
   private boolean n12144ProStsFec ;
   private boolean n12143ProSts ;
   private boolean n5334DisFasApr ;
   private boolean n7744FasPreObl ;
   private boolean n5307DisNumPas ;
   private boolean n5306DisVelPro ;
   private boolean n5305DisPrePie ;
   private boolean n5304DisPreSal ;
   private boolean n7918Dta_UOrd ;
   private boolean n7917DisfasRb ;
   private boolean n7916DisFasUpL ;
   private boolean n7915Disfastpp ;
   private boolean n7747DisFasAut ;
   private boolean n7743DisFasRec ;
   private boolean n7742DisFasDto ;
   private boolean n7741DisFasUni ;
   private boolean n7740DisFasPre ;
   private boolean n3793DisMaqPru ;
   private boolean n3701PiezasUti ;
   private boolean n3700MetrosUti ;
   private boolean n3699KilosUti ;
   private boolean n9983DisPiePda ;
   private boolean n9845DisPieAncc ;
   private boolean n8839DisPieCodB ;
   private boolean n6490DisPieIdPz ;
   private String A11658DisMemo2 ;
   private String A13987DisArtDsc2 ;
   private String A11734DisCnoEncO ;
   private String A11661DisOrdComp ;
   private String A11657DisMemo1 ;
   private String AV38Dismemo2 ;
   private String W11658DisMemo2 ;
   private String A9841DisFasObs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04R52_A1013DibCli ;
   private boolean[] P04R52_n1013DibCli ;
   private String[] P04R52_A1031EmpesCod ;
   private boolean[] P04R52_n1031EmpesCod ;
   private java.math.BigDecimal[] P04R52_A3841DisArtMer ;
   private String[] P04R52_A3826RetCod ;
   private boolean[] P04R52_n3826RetCod ;
   private java.util.Date[] P04R52_A3627DisFecLan ;
   private boolean[] P04R52_n3627DisFecLan ;
   private String[] P04R52_A3309DisNumTon ;
   private short[] P04R52_A3308DisManCod2 ;
   private short[] P04R52_A3307DisManCod1 ;
   private String[] P04R52_A3306DisFac ;
   private short[] P04R52_A3132DisGraCru2 ;
   private short[] P04R52_A3131DisGraAca2 ;
   private short[] P04R52_A3130DisAncSal3 ;
   private short[] P04R52_A3129DisAncSal2 ;
   private short[] P04R52_A3128DisAncSal1 ;
   private short[] P04R52_A3127DisNumCor ;
   private String[] P04R52_A2835DisPle2 ;
   private String[] P04R52_A2926DisPla ;
   private java.math.BigDecimal[] P04R52_A2833DisMtrLot ;
   private java.math.BigDecimal[] P04R52_A2832DisKgsLot ;
   private int[] P04R52_A2831DisNumLot ;
   private short[] P04R52_A2744DisNumTex2 ;
   private boolean[] P04R52_n2744DisNumTex2 ;
   private byte[] P04R52_A2743DisNumTex1 ;
   private String[] P04R52_A2742DisCodTex ;
   private boolean[] P04R52_n2742DisCodTex ;
   private int[] P04R52_A2403DisOpeAnt ;
   private boolean[] P04R52_n2403DisOpeAnt ;
   private short[] P04R52_A2402DisManCod ;
   private int[] P04R52_A2310DisCliDes ;
   private short[] P04R52_A2267DisNumBas ;
   private boolean[] P04R52_n2267DisNumBas ;
   private String[] P04R52_A2009DisTipDis ;
   private boolean[] P04R52_n2009DisTipDis ;
   private String[] P04R52_A1968DisRes ;
   private boolean[] P04R52_n1968DisRes ;
   private java.math.BigDecimal[] P04R52_A1908DisRdoA ;
   private java.math.BigDecimal[] P04R52_A1907DisRdoN ;
   private short[] P04R52_A1906DisGraAca ;
   private short[] P04R52_A1502DisPart ;
   private String[] P04R52_A1430DisLoc ;
   private short[] P04R52_A1233DisArtAc2 ;
   private short[] P04R52_A1232DisArtAcb ;
   private short[] P04R52_A1231DisArtAn1 ;
   private short[] P04R52_A1225DisGraCru ;
   private java.math.BigDecimal[] P04R52_A1198DisEncAnh ;
   private java.math.BigDecimal[] P04R52_A1197DisEncCom ;
   private int[] P04R52_A1196DisNumCli ;
   private String[] P04R52_A1195DisNomCli ;
   private short[] P04R52_A1157TipConCod ;
   private boolean[] P04R52_n1157TipConCod ;
   private int[] P04R52_A252CliCod ;
   private String[] P04R52_A966PartCod ;
   private boolean[] P04R52_n966PartCod ;
   private String[] P04R52_A1122MaqCodDis ;
   private boolean[] P04R52_n1122MaqCodDis ;
   private String[] P04R52_A1002DisNumTen ;
   private boolean[] P04R52_n1002DisNumTen ;
   private String[] P04R52_A999DisNMez ;
   private String[] P04R52_A998DisNMtr ;
   private short[] P04R52_A373DisMtrLan ;
   private short[] P04R52_A372DisKgmLan ;
   private short[] P04R52_A383DisPieLan ;
   private byte[] P04R52_A367DisEst ;
   private short[] P04R52_A334DisArtAnh ;
   private short[] P04R52_A349DisArtPu3 ;
   private boolean[] P04R52_n349DisArtPu3 ;
   private String[] P04R52_A358DisArtUr3 ;
   private short[] P04R52_A348DisArtPu2 ;
   private String[] P04R52_A357DisArtUr2 ;
   private short[] P04R52_A347DisArtPu1 ;
   private String[] P04R52_A356DisArtUr1 ;
   private byte[] P04R52_A359DisArtUrg ;
   private java.math.BigDecimal[] P04R52_A350DisArtRdt ;
   private short[] P04R52_A346DisArtPt3 ;
   private String[] P04R52_A355DisArtTr3 ;
   private short[] P04R52_A345DisArtPt2 ;
   private String[] P04R52_A354DisArtTr2 ;
   private short[] P04R52_A344DisArtPt1 ;
   private String[] P04R52_A353DisArtTr1 ;
   private String[] P04R52_A341DisArtOpe ;
   private String[] P04R52_A336DisArtCor ;
   private String[] P04R52_A338DisArtEnc ;
   private short[] P04R52_A352DisArtTip ;
   private String[] P04R52_A343DisArtPle ;
   private String[] P04R52_A333DisArtAca ;
   private String[] P04R52_A351DisArtSua ;
   private String[] P04R52_A339DisArtLar ;
   private String[] P04R52_A340DisArtMat ;
   private byte[] P04R52_A378DisObsULin ;
   private String[] P04R52_A366DisEnt ;
   private String[] P04R52_A337DisArtDsc ;
   private byte[] P04R52_A390DisTipCol ;
   private boolean[] P04R52_n390DisTipCol ;
   private int[] P04R52_A363DisColNum ;
   private boolean[] P04R52_n363DisColNum ;
   private String[] P04R52_A362DisColNom ;
   private boolean[] P04R52_n362DisColNom ;
   private java.util.Date[] P04R52_A371DisFecEnt ;
   private java.util.Date[] P04R52_A369DisFec ;
   private java.util.Date[] P04R52_A370DisFecCli ;
   private String[] P04R52_A360DisCliNum ;
   private String[] P04R52_A757PriCod ;
   private short[] P04R52_A342DisArtPes ;
   private String[] P04R52_A392DisUniMed ;
   private java.math.BigDecimal[] P04R52_A375DisNumUni ;
   private short[] P04R52_A374DisNumPie ;
   private String[] P04R52_A335DisArtCod ;
   private String[] P04R52_A365DisDes ;
   private String[] P04R52_A396EmprCod ;
   private int[] P04R52_A361DisCod ;
   private String[] P04R52_A11658DisMemo2 ;
   private String[] P04R52_A4348DisUsrCod ;
   private java.math.BigDecimal[] P04R52_A389DisPreMtr ;
   private java.math.BigDecimal[] P04R52_A388DisPreKgm ;
   private java.math.BigDecimal[] P04R52_A14555DisPrePz ;
   private String[] P04R52_A13987DisArtDsc2 ;
   private String[] P04R52_A13986DisIdtx2 ;
   private boolean[] P04R52_n13986DisIdtx2 ;
   private short[] P04R52_A13768DisTallUlt ;
   private java.math.BigDecimal[] P04R52_A13767DisRdto4 ;
   private long[] P04R52_A13233DisRGB ;
   private byte[] P04R52_A13080DisDGUltli ;
   private String[] P04R52_A13076DisLinPrd ;
   private boolean[] P04R52_n13076DisLinPrd ;
   private int[] P04R52_A13069DisCanalID ;
   private boolean[] P04R52_n13069DisCanalID ;
   private short[] P04R52_A13068DisLineaID ;
   private boolean[] P04R52_n13068DisLineaID ;
   private String[] P04R52_A12880DisOEKOTEX ;
   private boolean[] P04R52_n12880DisOEKOTEX ;
   private String[] P04R52_A12772DisProdID ;
   private boolean[] P04R52_n12772DisProdID ;
   private byte[] P04R52_A12768DisTpEstam ;
   private byte[] P04R52_A12765DisPriorid ;
   private String[] P04R52_A12328RevenID ;
   private boolean[] P04R52_n12328RevenID ;
   private String[] P04R52_A11864Nxt_artcli ;
   private short[] P04R52_A11863DptoID ;
   private boolean[] P04R52_n11863DptoID ;
   private short[] P04R52_A11862DesaID ;
   private boolean[] P04R52_n11862DesaID ;
   private String[] P04R52_A11861Nxt_statio ;
   private short[] P04R52_A11860CpteId ;
   private boolean[] P04R52_n11860CpteId ;
   private String[] P04R52_A11859Nxt_modelo ;
   private String[] P04R52_A11734DisCnoEncO ;
   private String[] P04R52_A11661DisOrdComp ;
   private String[] P04R52_A11659MarcaId ;
   private boolean[] P04R52_n11659MarcaId ;
   private String[] P04R52_A11657DisMemo1 ;
   private String[] P04R52_A3696DisParPar ;
   private boolean[] P04R52_n3696DisParPar ;
   private byte[] P04R52_A3695DisParReo ;
   private boolean[] P04R52_n3695DisParReo ;
   private int[] P04R52_A3694DisParCod ;
   private boolean[] P04R52_n3694DisParCod ;
   private byte[] P04R52_A7067DisUltNot ;
   private boolean[] P04R52_n7067DisUltNot ;
   private int[] P04R52_A4918DisDibCoDN ;
   private boolean[] P04R52_n4918DisDibCoDN ;
   private int[] P04R52_A4879DibColColN ;
   private boolean[] P04R52_n4879DibColColN ;
   private int[] P04R52_A4919DisDibCoCN ;
   private boolean[] P04R52_n4919DisDibCoCN ;
   private String[] P04R52_A4877DibColCol ;
   private boolean[] P04R52_n4877DibColCol ;
   private int[] P04R52_A4476DisAcaFor ;
   private boolean[] P04R52_n4476DisAcaFor ;
   private String[] P04R52_A4475DisLotMaq ;
   private boolean[] P04R52_n4475DisLotMaq ;
   private short[] P04R52_A4472DisLotPza ;
   private boolean[] P04R52_n4472DisLotPza ;
   private java.util.Date[] P04R52_A4355DisFecPed ;
   private boolean[] P04R52_n4355DisFecPed ;
   private String[] P04R52_A10887Cod_Idtx ;
   private boolean[] P04R52_n10887Cod_Idtx ;
   private String[] P04R52_A9787DisItem6 ;
   private String[] P04R52_A9786DisItem5 ;
   private String[] P04R52_A9774DisItem4 ;
   private String[] P04R52_A9773DisItem3 ;
   private String[] P04R52_A9772DisItem2 ;
   private String[] P04R52_A9771DisItem1 ;
   private java.util.Date[] P04R52_A8887DisFchT ;
   private boolean[] P04R52_n8887DisFchT ;
   private String[] P04R52_A8886DisDest ;
   private String[] P04R52_A8885DisFEnt ;
   private boolean[] P04R52_n8885DisFEnt ;
   private String[] P04R52_A7739DisExp ;
   private String[] P04R52_A7738DisMaqEst ;
   private String[] P04R52_A7523DisRec ;
   private String[] P04R52_A7516DisGraTam ;
   private boolean[] P04R52_n7516DisGraTam ;
   private byte[] P04R52_A7515DisDesCol ;
   private boolean[] P04R52_n7515DisDesCol ;
   private byte[] P04R52_A7514DisOrdGra ;
   private byte[] P04R52_A7513DisOrdSep ;
   private byte[] P04R52_A7512DisFacGra ;
   private boolean[] P04R52_n7512DisFacGra ;
   private byte[] P04R52_A7511DisFacSep ;
   private boolean[] P04R52_n7511DisFacSep ;
   private java.math.BigDecimal[] P04R52_A7510DisDto ;
   private boolean[] P04R52_n7510DisDto ;
   private java.math.BigDecimal[] P04R52_A6548DisRbMaq ;
   private int[] P04R52_A6547DisVolMaq ;
   private String[] P04R52_A5405DisAntpT ;
   private String[] P04R52_A5366DisAntp ;
   private String[] P04R52_A5350DisObsAnc ;
   private String[] P04R52_A5349DisObsGrm ;
   private String[] P04R52_A5290DisTipCor ;
   private String[] P04R52_A5252DisAcc ;
   private String[] P04R52_A5032DisEstTip ;
   private String[] P04R52_A5031DisCom ;
   private boolean[] P04R52_n5031DisCom ;
   private byte[] P04R52_A5025DisGraCob ;
   private byte[] P04R52_A5024DisTipEst ;
   private String[] P04R52_A4876DibColDib ;
   private boolean[] P04R52_n4876DibColDib ;
   private String[] P04R52_A4813DisEncCli ;
   private int[] P04R52_A4785DisNroCor ;
   private String[] P04R52_A4720DisDishCod ;
   private java.util.Date[] P04R52_A4617DisHorReg ;
   private boolean[] P04R52_n4617DisHorReg ;
   private java.util.Date[] P04R52_A4616DisHorEnt ;
   private boolean[] P04R52_n4616DisHorEnt ;
   private String[] P04R52_A4615DisTam ;
   private String[] P04R52_A4614DisMdlCod ;
   private String[] P04R52_A4479DisAcaMar ;
   private short[] P04R52_A4478DisAcaAnh ;
   private String[] P04R52_A4477DisAcaBak ;
   private java.math.BigDecimal[] P04R52_A4474DisLotKgs ;
   private java.math.BigDecimal[] P04R52_A4473DisLotMts ;
   private String[] P04R52_A4471DisCruEnr ;
   private java.math.BigDecimal[] P04R52_A4470DisCruKgs ;
   private java.math.BigDecimal[] P04R52_A4469DisCruMts ;
   private short[] P04R52_A4468DisPelAnh ;
   private int[] P04R52_A4294DisNPzasL ;
   private boolean[] P04R52_n4294DisNPzasL ;
   private int[] P04R52_A4293DisNPzas ;
   private boolean[] P04R52_n4293DisNPzas ;
   private String[] P04R52_A4014DisTin ;
   private byte[] P04R52_A4013DisEnv ;
   private boolean[] P04R52_n4013DisEnv ;
   private byte[] P04R52_A2525DisComULin ;
   private boolean[] P04R52_n2525DisComULin ;
   private String[] P04R52_A1052DisObs ;
   private short[] P04R52_A1051DisNumCol ;
   private boolean[] P04R52_n1051DisNumCol ;
   private int[] P04R52_A1014DibInt ;
   private boolean[] P04R52_n1014DibInt ;
   private String[] P04R54_A396EmprCod ;
   private int[] P04R54_A361DisCod ;
   private String[] P04R54_A377DisObsTxt ;
   private byte[] P04R54_A376DisObsLin ;
   private String[] P04R56_A396EmprCod ;
   private int[] P04R56_A361DisCod ;
   private short[] P04R56_A846UltFasLin ;
   private String[] P04R56_A758ProCod ;
   private java.util.Date[] P04R56_A12144ProStsFec ;
   private boolean[] P04R56_n12144ProStsFec ;
   private byte[] P04R56_A12143ProSts ;
   private boolean[] P04R56_n12143ProSts ;
   private String[] P04R56_A5334DisFasApr ;
   private boolean[] P04R56_n5334DisFasApr ;
   private String[] P04R58_A396EmprCod ;
   private int[] P04R58_A361DisCod ;
   private String[] P04R58_A758ProCod ;
   private String[] P04R58_A457FasCod ;
   private short[] P04R58_A368DisFasLin ;
   private byte[] P04R58_A7744FasPreObl ;
   private boolean[] P04R58_n7744FasPreObl ;
   private short[] P04R58_A5307DisNumPas ;
   private boolean[] P04R58_n5307DisNumPas ;
   private java.math.BigDecimal[] P04R58_A5306DisVelPro ;
   private boolean[] P04R58_n5306DisVelPro ;
   private short[] P04R58_A5305DisPrePie ;
   private boolean[] P04R58_n5305DisPrePie ;
   private short[] P04R58_A5304DisPreSal ;
   private boolean[] P04R58_n5304DisPreSal ;
   private String[] P04R58_A9841DisFasObs ;
   private short[] P04R58_A7918Dta_UOrd ;
   private boolean[] P04R58_n7918Dta_UOrd ;
   private java.math.BigDecimal[] P04R58_A7917DisfasRb ;
   private boolean[] P04R58_n7917DisfasRb ;
   private java.math.BigDecimal[] P04R58_A7916DisFasUpL ;
   private boolean[] P04R58_n7916DisFasUpL ;
   private java.math.BigDecimal[] P04R58_A7915Disfastpp ;
   private boolean[] P04R58_n7915Disfastpp ;
   private byte[] P04R58_A7747DisFasAut ;
   private boolean[] P04R58_n7747DisFasAut ;
   private java.math.BigDecimal[] P04R58_A7743DisFasRec ;
   private boolean[] P04R58_n7743DisFasRec ;
   private java.math.BigDecimal[] P04R58_A7742DisFasDto ;
   private boolean[] P04R58_n7742DisFasDto ;
   private String[] P04R58_A7741DisFasUni ;
   private boolean[] P04R58_n7741DisFasUni ;
   private java.math.BigDecimal[] P04R58_A7740DisFasPre ;
   private boolean[] P04R58_n7740DisFasPre ;
   private short[] P04R58_A5376DisQuiUl ;
   private String[] P04R58_A3793DisMaqPru ;
   private boolean[] P04R58_n3793DisMaqPru ;
   private String[] P04R58_A3697FasApr ;
   private String[] P04R510_A396EmprCod ;
   private int[] P04R510_A361DisCod ;
   private String[] P04R510_A13215DisNormNC ;
   private String[] P04R510_A13214DisNormSt ;
   private String[] P04R510_A13213DisNormID ;
   private String[] P04R512_A396EmprCod ;
   private int[] P04R512_A361DisCod ;
   private String[] P04R512_A13376DisTraID ;
   private String[] P04R514_A396EmprCod ;
   private int[] P04R514_A361DisCod ;
   private java.math.BigDecimal[] P04R514_A631Metros ;
   private java.math.BigDecimal[] P04R514_A595Kilos ;
   private int[] P04R514_A673Piezas ;
   private short[] P04R514_A3701PiezasUti ;
   private boolean[] P04R514_n3701PiezasUti ;
   private java.math.BigDecimal[] P04R514_A3700MetrosUti ;
   private boolean[] P04R514_n3700MetrosUti ;
   private java.math.BigDecimal[] P04R514_A3699KilosUti ;
   private boolean[] P04R514_n3699KilosUti ;
   private int[] P04R514_A44AlbRecCod ;
   private String[] P04R517_A396EmprCod ;
   private int[] P04R517_A361DisCod ;
   private java.math.BigDecimal[] P04R517_A384DisPieMet ;
   private java.math.BigDecimal[] P04R517_A382DisPieKil ;
   private java.math.BigDecimal[] P04R517_A9983DisPiePda ;
   private boolean[] P04R517_n9983DisPiePda ;
   private short[] P04R517_A9845DisPieAncc ;
   private boolean[] P04R517_n9845DisPieAncc ;
   private String[] P04R517_A8839DisPieCodB ;
   private boolean[] P04R517_n8839DisPieCodB ;
   private String[] P04R517_A6490DisPieIdPz ;
   private boolean[] P04R517_n6490DisPieIdPz ;
   private byte[] P04R517_A5099DisPieEst ;
   private short[] P04R517_A2185DisPieAnc ;
   private String[] P04R517_A2184DisPieLoc ;
   private String[] P04R517_A380DisPieCod ;
   private int[] P04R517_A44AlbRecCod ;
}

final  class preo007__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04R52", "SELECT DibCli, EmpesCod, DisArtMer, RetCod, DisFecLan, DisNumTon, DisManCod2, DisManCod1, DisFac, DisGraCru2, DisGraAca2, DisAncSal3, DisAncSal2, DisAncSal1, DisNumCor, DisPle2, DisPla, DisMtrLot, DisKgsLot, DisNumLot, DisNumTex2, DisNumTex1, DisCodTex, DisOpeAnt, DisManCod, DisCliDes, DisNumBas, DisTipDis, DisRes, DisRdoA, DisRdoN, DisGraAca, DisPart, DisLoc, DisArtAc2, DisArtAcb, DisArtAn1, DisGraCru, DisEncAnh, DisEncCom, DisNumCli, DisNomCli, TipConCod, CliCod, PartCod, MaqCodDis, DisNumTen, DisNMez, DisNMtr, DisMtrLan, DisKgmLan, DisPieLan, DisEst, DisArtAnh, DisArtPu3, DisArtUr3, DisArtPu2, DisArtUr2, DisArtPu1, DisArtUr1, DisArtUrg, DisArtRdt, DisArtPt3, DisArtTr3, DisArtPt2, DisArtTr2, DisArtPt1, DisArtTr1, DisArtOpe, DisArtCor, DisArtEnc, DisArtTip, DisArtPle, DisArtAca, DisArtSua, DisArtLar, DisArtMat, DisObsULin, DisEnt, DisArtDsc, DisTipCol, DisColNum, DisColNom, DisFecEnt, DisFec, DisFecCli, DisCliNum, PriCod, DisArtPes, DisUniMed, DisNumUni, DisNumPie, DisArtCod, DisDes, EmprCod, DisCod, DisMemo2, DisUsrCod, DisPreMtr, DisPreKgm, DisPrePz, DisArtDsc2, DisIdtx2, DisTallUlt, DisRdto4, DisRGB, DisDGUltli, DisLinPrd, DisCanalID, DisLineaID, DisOEKOTEX, DisProdID, DisTpEstam, DisPriorid, RevenID, Nxt_artcli, DptoID, DesaID, Nxt_statio, CpteId, Nxt_modelo, DisCnoEncO, DisOrdComp, MarcaId, DisMemo1, DisParPar, DisParReo, DisParCod, DisUltNot, DisDibCoDN, DibColColN, DisDibCoCN, DibColCol, DisAcaFor, DisLotMaq, DisLotPza, DisFecPed, Cod_Idtx, DisItem6, DisItem5, DisItem4, DisItem3, DisItem2, DisItem1, DisFchT, DisDest, DisFEnt, DisExp, DisMaqEst, DisRec, DisGraTam, DisDesCol, DisOrdGra, DisOrdSep, DisFacGra, DisFacSep, DisDto, DisRbMaq, DisVolMaq, DisAntpT, DisAntp, DisObsAnc, DisObsGrm, DisTipCor, DisAcc, DisEstTip, DisCom, DisGraCob, DisTipEst, DibColDib, DisEncCli, DisNroCor, DisDishCod, DisHorReg, DisHorEnt, DisTam, DisMdlCod, DisAcaMar, DisAcaAnh, DisAcaBak, DisLotKgs, DisLotMts, DisCruEnr, DisCruKgs, DisCruMts, DisPelAnh, DisNPzasL, DisNPzas, DisTin, DisEnv, DisComULin, DisObs, DisNumCol, DibInt FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04R53", "INSERT INTO TXPDISPOS(EmprCod, DisCod, DisDes, DisArtCod, DisNumPie, DisNumUni, DisUniMed, DisArtPes, PriCod, DisCliNum, DisFecCli, DisFec, DisFecEnt, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisEnt, DisObsULin, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, CliCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P04R54", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04R55", "INSERT INTO TXPOBSERV(EmprCod, DisCod, DisObsLin, DisObsTxt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new ForEachCursor("P04R56", "SELECT EmprCod, DisCod, UltFasLin, ProCod, ProStsFec, ProSts, DisFasApr FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04R57", "INSERT INTO TXPDISLIN(EmprCod, DisCod, ProCod, UltFasLin, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new ForEachCursor("P04R58", "SELECT EmprCod, DisCod, ProCod, FasCod, DisFasLin, FasPreObl, DisNumPas, DisVelPro, DisPrePie, DisPreSal, DisFasObs, Dta_UOrd, DisfasRb, DisFasUpL, Disfastpp, DisFasAut, DisFasRec, DisFasDto, DisFasUni, DisFasPre, DisQuiUl, DisMaqPru, FasApr FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04R59", "INSERT INTO TXPDISFAS(EmprCod, DisCod, ProCod, DisFasLin, FasCod, FasApr, DisMaqPru, DisQuiUl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas, FasPreObl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new ForEachCursor("P04R510", "SELECT EmprCod, DisCod, DisNormNC, DisNormSt, DisNormID FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04R511", "INSERT INTO TXPDISNOR(EmprCod, DisCod, DisNormID, DisNormSt, DisNormNC) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISNOR")
         ,new ForEachCursor("P04R512", "SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisTraID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04R513", "INSERT INTO TXPDISATI(EmprCod, DisCod, DisTraID) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISATI")
         ,new ForEachCursor("P04R514", "SELECT EmprCod, DisCod, Metros, Kilos, Piezas, PiezasUti, MetrosUti, KilosUti, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04R515", "INSERT INTO TXPDISALB(EmprCod, DisCod, AlbRecCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P04R516", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P04R517", "SELECT EmprCod, DisCod, DisPieMet, DisPieKil, DisPiePda, DisPieAncc, DisPieCodB, DisPieIdPz, DisPieEst, DisPieAnc, DisPieLoc, DisPieCod, AlbRecCod FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod, DisPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04R518", "INSERT INTO TXPDISALD(EmprCod, DisCod, AlbRecCod, DisPieCod, DisPieKil, DisPieMet, DisPieLoc, DisPieAnc, DisPieEst, DisPieIdPz, DisPieCodB, DisPieAncc, DisPiePda) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P04R519", "DELETE FROM TXPDISALD  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P04R520", "UPDATE TXPDISPOS SET DisNumUni=?, DisNumPie=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[5])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((short[]) buf[16])[0] = rslt.getShort(13);
               ((short[]) buf[17])[0] = rslt.getShort(14);
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((String[]) buf[20])[0] = rslt.getString(17, 1);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((int[]) buf[23])[0] = rslt.getInt(20);
               ((short[]) buf[24])[0] = rslt.getShort(21);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(22);
               ((String[]) buf[27])[0] = rslt.getString(23, 4);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(25);
               ((int[]) buf[32])[0] = rslt.getInt(26);
               ((short[]) buf[33])[0] = rslt.getShort(27);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(30,2);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(31,2);
               ((short[]) buf[41])[0] = rslt.getShort(32);
               ((short[]) buf[42])[0] = rslt.getShort(33);
               ((String[]) buf[43])[0] = rslt.getString(34, 10);
               ((short[]) buf[44])[0] = rslt.getShort(35);
               ((short[]) buf[45])[0] = rslt.getShort(36);
               ((short[]) buf[46])[0] = rslt.getShort(37);
               ((short[]) buf[47])[0] = rslt.getShort(38);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(39,2);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(40,2);
               ((int[]) buf[50])[0] = rslt.getInt(41);
               ((String[]) buf[51])[0] = rslt.getString(42, 13);
               ((short[]) buf[52])[0] = rslt.getShort(43);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((int[]) buf[54])[0] = rslt.getInt(44);
               ((String[]) buf[55])[0] = rslt.getString(45, 16);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(46, 6);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(47, 10);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(48, 10);
               ((String[]) buf[62])[0] = rslt.getString(49, 10);
               ((short[]) buf[63])[0] = rslt.getShort(50);
               ((short[]) buf[64])[0] = rslt.getShort(51);
               ((short[]) buf[65])[0] = rslt.getShort(52);
               ((byte[]) buf[66])[0] = rslt.getByte(53);
               ((short[]) buf[67])[0] = rslt.getShort(54);
               ((short[]) buf[68])[0] = rslt.getShort(55);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(56, 4);
               ((short[]) buf[71])[0] = rslt.getShort(57);
               ((String[]) buf[72])[0] = rslt.getString(58, 4);
               ((short[]) buf[73])[0] = rslt.getShort(59);
               ((String[]) buf[74])[0] = rslt.getString(60, 4);
               ((byte[]) buf[75])[0] = rslt.getByte(61);
               ((java.math.BigDecimal[]) buf[76])[0] = rslt.getBigDecimal(62,2);
               ((short[]) buf[77])[0] = rslt.getShort(63);
               ((String[]) buf[78])[0] = rslt.getString(64, 4);
               ((short[]) buf[79])[0] = rslt.getShort(65);
               ((String[]) buf[80])[0] = rslt.getString(66, 4);
               ((short[]) buf[81])[0] = rslt.getShort(67);
               ((String[]) buf[82])[0] = rslt.getString(68, 4);
               ((String[]) buf[83])[0] = rslt.getString(69, 2);
               ((String[]) buf[84])[0] = rslt.getString(70, 1);
               ((String[]) buf[85])[0] = rslt.getString(71, 1);
               ((short[]) buf[86])[0] = rslt.getShort(72);
               ((String[]) buf[87])[0] = rslt.getString(73, 10);
               ((String[]) buf[88])[0] = rslt.getString(74, 6);
               ((String[]) buf[89])[0] = rslt.getString(75, 6);
               ((String[]) buf[90])[0] = rslt.getString(76, 10);
               ((String[]) buf[91])[0] = rslt.getString(77, 16);
               ((byte[]) buf[92])[0] = rslt.getByte(78);
               ((String[]) buf[93])[0] = rslt.getString(79, 40);
               ((String[]) buf[94])[0] = rslt.getString(80, 26);
               ((byte[]) buf[95])[0] = rslt.getByte(81);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((int[]) buf[97])[0] = rslt.getInt(82);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((String[]) buf[99])[0] = rslt.getString(83, 13);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[101])[0] = rslt.getGXDate(84);
               ((java.util.Date[]) buf[102])[0] = rslt.getGXDate(85);
               ((java.util.Date[]) buf[103])[0] = rslt.getGXDate(86);
               ((String[]) buf[104])[0] = rslt.getString(87, 8);
               ((String[]) buf[105])[0] = rslt.getString(88, 1);
               ((short[]) buf[106])[0] = rslt.getShort(89);
               ((String[]) buf[107])[0] = rslt.getString(90, 1);
               ((java.math.BigDecimal[]) buf[108])[0] = rslt.getBigDecimal(91,2);
               ((short[]) buf[109])[0] = rslt.getShort(92);
               ((String[]) buf[110])[0] = rslt.getString(93, 16);
               ((String[]) buf[111])[0] = rslt.getString(94, 1);
               ((String[]) buf[112])[0] = rslt.getString(95, 3);
               ((int[]) buf[113])[0] = rslt.getInt(96);
               ((String[]) buf[114])[0] = rslt.getVarchar(97);
               ((String[]) buf[115])[0] = rslt.getString(98, 8);
               ((java.math.BigDecimal[]) buf[116])[0] = rslt.getBigDecimal(99,2);
               ((java.math.BigDecimal[]) buf[117])[0] = rslt.getBigDecimal(100,2);
               ((java.math.BigDecimal[]) buf[118])[0] = rslt.getBigDecimal(101,2);
               ((String[]) buf[119])[0] = rslt.getVarchar(102);
               ((String[]) buf[120])[0] = rslt.getString(103, 4);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((short[]) buf[122])[0] = rslt.getShort(104);
               ((java.math.BigDecimal[]) buf[123])[0] = rslt.getBigDecimal(105,40);
               ((long[]) buf[124])[0] = rslt.getLong(106);
               ((byte[]) buf[125])[0] = rslt.getByte(107);
               ((String[]) buf[126])[0] = rslt.getString(108, 4);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((int[]) buf[128])[0] = rslt.getInt(109);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((short[]) buf[130])[0] = rslt.getShort(110);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getString(111, 1);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getString(112, 6);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((byte[]) buf[136])[0] = rslt.getByte(113);
               ((byte[]) buf[137])[0] = rslt.getByte(114);
               ((String[]) buf[138])[0] = rslt.getString(115, 10);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((String[]) buf[140])[0] = rslt.getString(116, 30);
               ((short[]) buf[141])[0] = rslt.getShort(117);
               ((boolean[]) buf[142])[0] = rslt.wasNull();
               ((short[]) buf[143])[0] = rslt.getShort(118);
               ((boolean[]) buf[144])[0] = rslt.wasNull();
               ((String[]) buf[145])[0] = rslt.getString(119, 4);
               ((short[]) buf[146])[0] = rslt.getShort(120);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((String[]) buf[148])[0] = rslt.getString(121, 30);
               ((String[]) buf[149])[0] = rslt.getVarchar(122);
               ((String[]) buf[150])[0] = rslt.getVarchar(123);
               ((String[]) buf[151])[0] = rslt.getString(124, 6);
               ((boolean[]) buf[152])[0] = rslt.wasNull();
               ((String[]) buf[153])[0] = rslt.getVarchar(125);
               ((String[]) buf[154])[0] = rslt.getString(126, 1);
               ((boolean[]) buf[155])[0] = rslt.wasNull();
               ((byte[]) buf[156])[0] = rslt.getByte(127);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((int[]) buf[158])[0] = rslt.getInt(128);
               ((boolean[]) buf[159])[0] = rslt.wasNull();
               ((byte[]) buf[160])[0] = rslt.getByte(129);
               ((boolean[]) buf[161])[0] = rslt.wasNull();
               ((int[]) buf[162])[0] = rslt.getInt(130);
               ((boolean[]) buf[163])[0] = rslt.wasNull();
               ((int[]) buf[164])[0] = rslt.getInt(131);
               ((boolean[]) buf[165])[0] = rslt.wasNull();
               ((int[]) buf[166])[0] = rslt.getInt(132);
               ((boolean[]) buf[167])[0] = rslt.wasNull();
               ((String[]) buf[168])[0] = rslt.getString(133, 12);
               ((boolean[]) buf[169])[0] = rslt.wasNull();
               ((int[]) buf[170])[0] = rslt.getInt(134);
               ((boolean[]) buf[171])[0] = rslt.wasNull();
               ((String[]) buf[172])[0] = rslt.getString(135, 6);
               ((boolean[]) buf[173])[0] = rslt.wasNull();
               ((short[]) buf[174])[0] = rslt.getShort(136);
               ((boolean[]) buf[175])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[176])[0] = rslt.getGXDate(137);
               ((boolean[]) buf[177])[0] = rslt.wasNull();
               ((String[]) buf[178])[0] = rslt.getString(138, 4);
               ((boolean[]) buf[179])[0] = rslt.wasNull();
               ((String[]) buf[180])[0] = rslt.getString(139, 20);
               ((String[]) buf[181])[0] = rslt.getString(140, 20);
               ((String[]) buf[182])[0] = rslt.getString(141, 20);
               ((String[]) buf[183])[0] = rslt.getString(142, 20);
               ((String[]) buf[184])[0] = rslt.getString(143, 20);
               ((String[]) buf[185])[0] = rslt.getString(144, 20);
               ((java.util.Date[]) buf[186])[0] = rslt.getGXDate(145);
               ((boolean[]) buf[187])[0] = rslt.wasNull();
               ((String[]) buf[188])[0] = rslt.getString(146, 30);
               ((String[]) buf[189])[0] = rslt.getString(147, 30);
               ((boolean[]) buf[190])[0] = rslt.wasNull();
               ((String[]) buf[191])[0] = rslt.getString(148, 1);
               ((String[]) buf[192])[0] = rslt.getString(149, 6);
               ((String[]) buf[193])[0] = rslt.getString(150, 30);
               ((String[]) buf[194])[0] = rslt.getString(151, 1);
               ((boolean[]) buf[195])[0] = rslt.wasNull();
               ((byte[]) buf[196])[0] = rslt.getByte(152);
               ((boolean[]) buf[197])[0] = rslt.wasNull();
               ((byte[]) buf[198])[0] = rslt.getByte(153);
               ((byte[]) buf[199])[0] = rslt.getByte(154);
               ((byte[]) buf[200])[0] = rslt.getByte(155);
               ((boolean[]) buf[201])[0] = rslt.wasNull();
               ((byte[]) buf[202])[0] = rslt.getByte(156);
               ((boolean[]) buf[203])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[204])[0] = rslt.getBigDecimal(157,2);
               ((boolean[]) buf[205])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[206])[0] = rslt.getBigDecimal(158,2);
               ((int[]) buf[207])[0] = rslt.getInt(159);
               ((String[]) buf[208])[0] = rslt.getString(160, 1);
               ((String[]) buf[209])[0] = rslt.getString(161, 1);
               ((String[]) buf[210])[0] = rslt.getString(162, 20);
               ((String[]) buf[211])[0] = rslt.getString(163, 20);
               ((String[]) buf[212])[0] = rslt.getString(164, 2);
               ((String[]) buf[213])[0] = rslt.getString(165, 1);
               ((String[]) buf[214])[0] = rslt.getString(166, 1);
               ((String[]) buf[215])[0] = rslt.getString(167, 12);
               ((boolean[]) buf[216])[0] = rslt.wasNull();
               ((byte[]) buf[217])[0] = rslt.getByte(168);
               ((byte[]) buf[218])[0] = rslt.getByte(169);
               ((String[]) buf[219])[0] = rslt.getString(170, 30);
               ((boolean[]) buf[220])[0] = rslt.wasNull();
               ((String[]) buf[221])[0] = rslt.getString(171, 20);
               ((int[]) buf[222])[0] = rslt.getInt(172);
               ((String[]) buf[223])[0] = rslt.getString(173, 12);
               ((java.util.Date[]) buf[224])[0] = GXutil.resetDate(rslt.getGXDateTime(174));
               ((boolean[]) buf[225])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[226])[0] = GXutil.resetDate(rslt.getGXDateTime(175));
               ((boolean[]) buf[227])[0] = rslt.wasNull();
               ((String[]) buf[228])[0] = rslt.getString(176, 4);
               ((String[]) buf[229])[0] = rslt.getString(177, 13);
               ((String[]) buf[230])[0] = rslt.getString(178, 1);
               ((short[]) buf[231])[0] = rslt.getShort(179);
               ((String[]) buf[232])[0] = rslt.getString(180, 1);
               ((java.math.BigDecimal[]) buf[233])[0] = rslt.getBigDecimal(181,2);
               ((java.math.BigDecimal[]) buf[234])[0] = rslt.getBigDecimal(182,2);
               ((String[]) buf[235])[0] = rslt.getString(183, 1);
               ((java.math.BigDecimal[]) buf[236])[0] = rslt.getBigDecimal(184,2);
               ((java.math.BigDecimal[]) buf[237])[0] = rslt.getBigDecimal(185,2);
               ((short[]) buf[238])[0] = rslt.getShort(186);
               ((int[]) buf[239])[0] = rslt.getInt(187);
               ((boolean[]) buf[240])[0] = rslt.wasNull();
               ((int[]) buf[241])[0] = rslt.getInt(188);
               ((boolean[]) buf[242])[0] = rslt.wasNull();
               ((String[]) buf[243])[0] = rslt.getString(189, 1);
               ((byte[]) buf[244])[0] = rslt.getByte(190);
               ((boolean[]) buf[245])[0] = rslt.wasNull();
               ((byte[]) buf[246])[0] = rslt.getByte(191);
               ((boolean[]) buf[247])[0] = rslt.wasNull();
               ((String[]) buf[248])[0] = rslt.getString(192, 30);
               ((short[]) buf[249])[0] = rslt.getShort(193);
               ((boolean[]) buf[250])[0] = rslt.wasNull();
               ((int[]) buf[251])[0] = rslt.getInt(194);
               ((boolean[]) buf[252])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(11);
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(21);
               ((String[]) buf[35])[0] = rslt.getString(22, 6);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 15);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 10);
               ((String[]) buf[15])[0] = rslt.getString(12, 9);
               ((int[]) buf[16])[0] = rslt.getInt(13);
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
               return;
            case 1 :
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
               stmt.setInt(55, ((Number) parms[61]).intValue());
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(56, ((Number) parms[63]).shortValue());
               }
               stmt.setString(57, (String)parms[64], 13);
               stmt.setInt(58, ((Number) parms[65]).intValue());
               stmt.setBigDecimal(59, (java.math.BigDecimal)parms[66], 2);
               stmt.setBigDecimal(60, (java.math.BigDecimal)parms[67], 2);
               stmt.setShort(61, ((Number) parms[68]).shortValue());
               stmt.setShort(62, ((Number) parms[69]).shortValue());
               stmt.setShort(63, ((Number) parms[70]).shortValue());
               stmt.setShort(64, ((Number) parms[71]).shortValue());
               stmt.setString(65, (String)parms[72], 10);
               stmt.setShort(66, ((Number) parms[73]).shortValue());
               stmt.setShort(67, ((Number) parms[74]).shortValue());
               stmt.setBigDecimal(68, (java.math.BigDecimal)parms[75], 2);
               stmt.setBigDecimal(69, (java.math.BigDecimal)parms[76], 2);
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(70, (String)parms[78], 1);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(71, (String)parms[80], 1);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(72, ((Number) parms[82]).shortValue());
               }
               stmt.setInt(73, ((Number) parms[83]).intValue());
               stmt.setShort(74, ((Number) parms[84]).shortValue());
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(75, ((Number) parms[86]).intValue());
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(76, (String)parms[88], 4);
               }
               stmt.setByte(77, ((Number) parms[89]).byteValue());
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(78, ((Number) parms[91]).shortValue());
               }
               stmt.setInt(79, ((Number) parms[92]).intValue());
               stmt.setBigDecimal(80, (java.math.BigDecimal)parms[93], 2);
               stmt.setBigDecimal(81, (java.math.BigDecimal)parms[94], 2);
               stmt.setString(82, (String)parms[95], 1);
               stmt.setString(83, (String)parms[96], 30);
               stmt.setShort(84, ((Number) parms[97]).shortValue());
               stmt.setShort(85, ((Number) parms[98]).shortValue());
               stmt.setShort(86, ((Number) parms[99]).shortValue());
               stmt.setShort(87, ((Number) parms[100]).shortValue());
               stmt.setShort(88, ((Number) parms[101]).shortValue());
               stmt.setShort(89, ((Number) parms[102]).shortValue());
               stmt.setString(90, (String)parms[103], 1);
               stmt.setShort(91, ((Number) parms[104]).shortValue());
               stmt.setShort(92, ((Number) parms[105]).shortValue());
               stmt.setString(93, (String)parms[106], 10);
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.DATE );
               }
               else
               {
                  stmt.setDate(94, (java.util.Date)parms[108]);
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(95, (String)parms[110], 4);
               }
               stmt.setBigDecimal(96, (java.math.BigDecimal)parms[111], 2);
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(97, (String)parms[113], 16);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(98, (String)parms[115], 16);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(99, ((Number) parms[117]).intValue());
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(100, ((Number) parms[119]).shortValue());
               }
               stmt.setString(101, (String)parms[120], 30);
               if ( ((Boolean) parms[121]).booleanValue() )
               {
                  stmt.setNull( 102 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(102, ((Number) parms[122]).byteValue());
               }
               if ( ((Boolean) parms[123]).booleanValue() )
               {
                  stmt.setNull( 103 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(103, ((Number) parms[124]).byteValue());
               }
               stmt.setString(104, (String)parms[125], 1);
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 105 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(105, ((Number) parms[127]).intValue());
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 106 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(106, ((Number) parms[129]).intValue());
               }
               stmt.setString(107, (String)parms[130], 8);
               stmt.setShort(108, ((Number) parms[131]).shortValue());
               stmt.setBigDecimal(109, (java.math.BigDecimal)parms[132], 2);
               stmt.setBigDecimal(110, (java.math.BigDecimal)parms[133], 2);
               stmt.setString(111, (String)parms[134], 1);
               stmt.setBigDecimal(112, (java.math.BigDecimal)parms[135], 2);
               stmt.setBigDecimal(113, (java.math.BigDecimal)parms[136], 2);
               stmt.setString(114, (String)parms[137], 1);
               stmt.setShort(115, ((Number) parms[138]).shortValue());
               stmt.setString(116, (String)parms[139], 1);
               stmt.setString(117, (String)parms[140], 13);
               stmt.setString(118, (String)parms[141], 4);
               if ( ((Boolean) parms[142]).booleanValue() )
               {
                  stmt.setNull( 119 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(119, (java.util.Date)parms[143], true);
               }
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 120 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(120, (java.util.Date)parms[145], true);
               }
               stmt.setString(121, (String)parms[146], 12);
               stmt.setInt(122, ((Number) parms[147]).intValue());
               stmt.setString(123, (String)parms[148], 20);
               if ( ((Boolean) parms[149]).booleanValue() )
               {
                  stmt.setNull( 124 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(124, (String)parms[150], 30);
               }
               stmt.setByte(125, ((Number) parms[151]).byteValue());
               stmt.setByte(126, ((Number) parms[152]).byteValue());
               if ( ((Boolean) parms[153]).booleanValue() )
               {
                  stmt.setNull( 127 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(127, (String)parms[154], 12);
               }
               stmt.setString(128, (String)parms[155], 1);
               stmt.setString(129, (String)parms[156], 1);
               stmt.setString(130, (String)parms[157], 2);
               stmt.setString(131, (String)parms[158], 20);
               stmt.setString(132, (String)parms[159], 20);
               stmt.setString(133, (String)parms[160], 1);
               stmt.setString(134, (String)parms[161], 1);
               stmt.setInt(135, ((Number) parms[162]).intValue());
               stmt.setBigDecimal(136, (java.math.BigDecimal)parms[163], 2);
               if ( ((Boolean) parms[164]).booleanValue() )
               {
                  stmt.setNull( 137 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(137, (java.math.BigDecimal)parms[165], 2);
               }
               if ( ((Boolean) parms[166]).booleanValue() )
               {
                  stmt.setNull( 138 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(138, ((Number) parms[167]).byteValue());
               }
               if ( ((Boolean) parms[168]).booleanValue() )
               {
                  stmt.setNull( 139 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(139, ((Number) parms[169]).byteValue());
               }
               stmt.setByte(140, ((Number) parms[170]).byteValue());
               stmt.setByte(141, ((Number) parms[171]).byteValue());
               if ( ((Boolean) parms[172]).booleanValue() )
               {
                  stmt.setNull( 142 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(142, ((Number) parms[173]).byteValue());
               }
               if ( ((Boolean) parms[174]).booleanValue() )
               {
                  stmt.setNull( 143 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(143, (String)parms[175], 1);
               }
               stmt.setString(144, (String)parms[176], 30);
               stmt.setString(145, (String)parms[177], 6);
               stmt.setString(146, (String)parms[178], 1);
               if ( ((Boolean) parms[179]).booleanValue() )
               {
                  stmt.setNull( 147 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(147, (String)parms[180], 30);
               }
               stmt.setString(148, (String)parms[181], 30);
               if ( ((Boolean) parms[182]).booleanValue() )
               {
                  stmt.setNull( 149 , Types.DATE );
               }
               else
               {
                  stmt.setDate(149, (java.util.Date)parms[183]);
               }
               stmt.setString(150, (String)parms[184], 20);
               stmt.setString(151, (String)parms[185], 20);
               stmt.setString(152, (String)parms[186], 20);
               stmt.setString(153, (String)parms[187], 20);
               stmt.setString(154, (String)parms[188], 20);
               stmt.setString(155, (String)parms[189], 20);
               if ( ((Boolean) parms[190]).booleanValue() )
               {
                  stmt.setNull( 156 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(156, (String)parms[191], 4);
               }
               if ( ((Boolean) parms[192]).booleanValue() )
               {
                  stmt.setNull( 157 , Types.DATE );
               }
               else
               {
                  stmt.setDate(157, (java.util.Date)parms[193]);
               }
               if ( ((Boolean) parms[194]).booleanValue() )
               {
                  stmt.setNull( 158 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(158, ((Number) parms[195]).shortValue());
               }
               if ( ((Boolean) parms[196]).booleanValue() )
               {
                  stmt.setNull( 159 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(159, (String)parms[197], 6);
               }
               if ( ((Boolean) parms[198]).booleanValue() )
               {
                  stmt.setNull( 160 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(160, ((Number) parms[199]).intValue());
               }
               if ( ((Boolean) parms[200]).booleanValue() )
               {
                  stmt.setNull( 161 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(161, (String)parms[201], 12);
               }
               if ( ((Boolean) parms[202]).booleanValue() )
               {
                  stmt.setNull( 162 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(162, ((Number) parms[203]).intValue());
               }
               if ( ((Boolean) parms[204]).booleanValue() )
               {
                  stmt.setNull( 163 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(163, ((Number) parms[205]).intValue());
               }
               if ( ((Boolean) parms[206]).booleanValue() )
               {
                  stmt.setNull( 164 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(164, ((Number) parms[207]).intValue());
               }
               if ( ((Boolean) parms[208]).booleanValue() )
               {
                  stmt.setNull( 165 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(165, ((Number) parms[209]).byteValue());
               }
               if ( ((Boolean) parms[210]).booleanValue() )
               {
                  stmt.setNull( 166 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(166, ((Number) parms[211]).intValue());
               }
               if ( ((Boolean) parms[212]).booleanValue() )
               {
                  stmt.setNull( 167 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(167, ((Number) parms[213]).byteValue());
               }
               if ( ((Boolean) parms[214]).booleanValue() )
               {
                  stmt.setNull( 168 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(168, (String)parms[215], 1);
               }
               stmt.setVarchar(169, (String)parms[216], 2000, false);
               stmt.setVarchar(170, (String)parms[217], 2000, false);
               if ( ((Boolean) parms[218]).booleanValue() )
               {
                  stmt.setNull( 171 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(171, (String)parms[219], 6);
               }
               stmt.setVarchar(172, (String)parms[220], 200, false);
               stmt.setVarchar(173, (String)parms[221], 600, false);
               stmt.setString(174, (String)parms[222], 30);
               if ( ((Boolean) parms[223]).booleanValue() )
               {
                  stmt.setNull( 175 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(175, ((Number) parms[224]).shortValue());
               }
               stmt.setString(176, (String)parms[225], 4);
               if ( ((Boolean) parms[226]).booleanValue() )
               {
                  stmt.setNull( 177 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(177, ((Number) parms[227]).shortValue());
               }
               if ( ((Boolean) parms[228]).booleanValue() )
               {
                  stmt.setNull( 178 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(178, ((Number) parms[229]).shortValue());
               }
               stmt.setString(179, (String)parms[230], 30);
               if ( ((Boolean) parms[231]).booleanValue() )
               {
                  stmt.setNull( 180 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(180, (String)parms[232], 10);
               }
               stmt.setByte(181, ((Number) parms[233]).byteValue());
               stmt.setByte(182, ((Number) parms[234]).byteValue());
               if ( ((Boolean) parms[235]).booleanValue() )
               {
                  stmt.setNull( 183 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(183, (String)parms[236], 6);
               }
               if ( ((Boolean) parms[237]).booleanValue() )
               {
                  stmt.setNull( 184 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(184, (String)parms[238], 1);
               }
               if ( ((Boolean) parms[239]).booleanValue() )
               {
                  stmt.setNull( 185 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(185, ((Number) parms[240]).shortValue());
               }
               if ( ((Boolean) parms[241]).booleanValue() )
               {
                  stmt.setNull( 186 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(186, ((Number) parms[242]).intValue());
               }
               if ( ((Boolean) parms[243]).booleanValue() )
               {
                  stmt.setNull( 187 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(187, (String)parms[244], 4);
               }
               stmt.setByte(188, ((Number) parms[245]).byteValue());
               stmt.setLong(189, ((Number) parms[246]).longValue());
               stmt.setBigDecimal(190, (java.math.BigDecimal)parms[247], 40);
               stmt.setShort(191, ((Number) parms[248]).shortValue());
               if ( ((Boolean) parms[249]).booleanValue() )
               {
                  stmt.setNull( 192 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(192, (String)parms[250], 4);
               }
               stmt.setVarchar(193, (String)parms[251], 60, false);
               stmt.setBigDecimal(194, (java.math.BigDecimal)parms[252], 2);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 1);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[16], 2);
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
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[26]).shortValue());
               }
               stmt.setVarchar(18, (String)parms[27], 3000, false);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[37]).byteValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[11]).shortValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[10], 15);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[12], 20);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[16], 2);
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 18 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

