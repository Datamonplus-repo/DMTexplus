package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class puttn00 extends GXProcedure
{
   public puttn00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( puttn00.class ), "" );
   }

   public puttn00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      puttn00.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      puttn00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      puttn00.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      puttn00.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      puttn00.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      puttn00.this.AV56Usurcod = aP4[0];
      this.aP4 = aP4;
      puttn00.this.AV57station = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Puttn00", "") );
      AV58Diahora = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Using cursor P01WB3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4474DisLotKgs = P01WB3_A4474DisLotKgs[0] ;
         A4473DisLotMts = P01WB3_A4473DisLotMts[0] ;
         A4471DisCruEnr = P01WB3_A4471DisCruEnr[0] ;
         A4470DisCruKgs = P01WB3_A4470DisCruKgs[0] ;
         A4469DisCruMts = P01WB3_A4469DisCruMts[0] ;
         A4468DisPelAnh = P01WB3_A4468DisPelAnh[0] ;
         A4348DisUsrCod = P01WB3_A4348DisUsrCod[0] ;
         A4294DisNPzasL = P01WB3_A4294DisNPzasL[0] ;
         n4294DisNPzasL = P01WB3_n4294DisNPzasL[0] ;
         A4293DisNPzas = P01WB3_A4293DisNPzas[0] ;
         n4293DisNPzas = P01WB3_n4293DisNPzas[0] ;
         A4014DisTin = P01WB3_A4014DisTin[0] ;
         A4013DisEnv = P01WB3_A4013DisEnv[0] ;
         n4013DisEnv = P01WB3_n4013DisEnv[0] ;
         A2525DisComULin = P01WB3_A2525DisComULin[0] ;
         n2525DisComULin = P01WB3_n2525DisComULin[0] ;
         A1052DisObs = P01WB3_A1052DisObs[0] ;
         A1051DisNumCol = P01WB3_A1051DisNumCol[0] ;
         n1051DisNumCol = P01WB3_n1051DisNumCol[0] ;
         A1014DibInt = P01WB3_A1014DibInt[0] ;
         n1014DibInt = P01WB3_n1014DibInt[0] ;
         A1013DibCli = P01WB3_A1013DibCli[0] ;
         n1013DibCli = P01WB3_n1013DibCli[0] ;
         A1031EmpesCod = P01WB3_A1031EmpesCod[0] ;
         n1031EmpesCod = P01WB3_n1031EmpesCod[0] ;
         A3841DisArtMer = P01WB3_A3841DisArtMer[0] ;
         A3826RetCod = P01WB3_A3826RetCod[0] ;
         n3826RetCod = P01WB3_n3826RetCod[0] ;
         A3627DisFecLan = P01WB3_A3627DisFecLan[0] ;
         n3627DisFecLan = P01WB3_n3627DisFecLan[0] ;
         A252CliCod = P01WB3_A252CliCod[0] ;
         n252CliCod = P01WB3_n252CliCod[0] ;
         A966PartCod = P01WB3_A966PartCod[0] ;
         n966PartCod = P01WB3_n966PartCod[0] ;
         A1122MaqCodDis = P01WB3_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P01WB3_n1122MaqCodDis[0] ;
         A371DisFecEnt = P01WB3_A371DisFecEnt[0] ;
         A361DisCod = P01WB3_A361DisCod[0] ;
         A166BarKgm = P01WB3_A166BarKgm[0] ;
         A199BarPie1 = P01WB3_A199BarPie1[0] ;
         A365DisDes = P01WB3_A365DisDes[0] ;
         A898BarPieNDes = P01WB3_A898BarPieNDes[0] ;
         A212BarSer = P01WB3_A212BarSer[0] ;
         A159BarFecGen = P01WB3_A159BarFecGen[0] ;
         A218BarTipCol = P01WB3_A218BarTipCol[0] ;
         A1234BarNomCli = P01WB3_A1234BarNomCli[0] ;
         A1235BarNumCli = P01WB3_A1235BarNumCli[0] ;
         A143BarDisNum = P01WB3_A143BarDisNum[0] ;
         A125BarAncAca1 = P01WB3_A125BarAncAca1[0] ;
         A126BarAncAca2 = P01WB3_A126BarAncAca2[0] ;
         A1909BarGraAca = P01WB3_A1909BarGraAca[0] ;
         A3137BarGraAca2 = P01WB3_A3137BarGraAca2[0] ;
         A135BarColNom = P01WB3_A135BarColNom[0] ;
         A136BarColNum = P01WB3_A136BarColNum[0] ;
         A1652BarSerDsc = P01WB3_A1652BarSerDsc[0] ;
         A155BarFecCli = P01WB3_A155BarFecCli[0] ;
         A228BarUniMed = P01WB3_A228BarUniMed[0] ;
         A209BarPri = P01WB3_A209BarPri[0] ;
         A14555DisPrePz = P01WB3_A14555DisPrePz[0] ;
         A13987DisArtDsc2 = P01WB3_A13987DisArtDsc2[0] ;
         A13986DisIdtx2 = P01WB3_A13986DisIdtx2[0] ;
         n13986DisIdtx2 = P01WB3_n13986DisIdtx2[0] ;
         A13768DisTallUlt = P01WB3_A13768DisTallUlt[0] ;
         A13767DisRdto4 = P01WB3_A13767DisRdto4[0] ;
         A13233DisRGB = P01WB3_A13233DisRGB[0] ;
         A13080DisDGUltli = P01WB3_A13080DisDGUltli[0] ;
         A13076DisLinPrd = P01WB3_A13076DisLinPrd[0] ;
         n13076DisLinPrd = P01WB3_n13076DisLinPrd[0] ;
         A13069DisCanalID = P01WB3_A13069DisCanalID[0] ;
         n13069DisCanalID = P01WB3_n13069DisCanalID[0] ;
         A13068DisLineaID = P01WB3_A13068DisLineaID[0] ;
         n13068DisLineaID = P01WB3_n13068DisLineaID[0] ;
         A12880DisOEKOTEX = P01WB3_A12880DisOEKOTEX[0] ;
         n12880DisOEKOTEX = P01WB3_n12880DisOEKOTEX[0] ;
         A12772DisProdID = P01WB3_A12772DisProdID[0] ;
         n12772DisProdID = P01WB3_n12772DisProdID[0] ;
         A12768DisTpEstam = P01WB3_A12768DisTpEstam[0] ;
         A12765DisPriorid = P01WB3_A12765DisPriorid[0] ;
         A12328RevenID = P01WB3_A12328RevenID[0] ;
         n12328RevenID = P01WB3_n12328RevenID[0] ;
         A11864Nxt_artcli = P01WB3_A11864Nxt_artcli[0] ;
         A11863DptoID = P01WB3_A11863DptoID[0] ;
         n11863DptoID = P01WB3_n11863DptoID[0] ;
         A11862DesaID = P01WB3_A11862DesaID[0] ;
         n11862DesaID = P01WB3_n11862DesaID[0] ;
         A11861Nxt_statio = P01WB3_A11861Nxt_statio[0] ;
         A11860CpteId = P01WB3_A11860CpteId[0] ;
         n11860CpteId = P01WB3_n11860CpteId[0] ;
         A11859Nxt_modelo = P01WB3_A11859Nxt_modelo[0] ;
         A11734DisCnoEncO = P01WB3_A11734DisCnoEncO[0] ;
         A11659MarcaId = P01WB3_A11659MarcaId[0] ;
         n11659MarcaId = P01WB3_n11659MarcaId[0] ;
         A11658DisMemo2 = P01WB3_A11658DisMemo2[0] ;
         A11657DisMemo1 = P01WB3_A11657DisMemo1[0] ;
         A3696DisParPar = P01WB3_A3696DisParPar[0] ;
         n3696DisParPar = P01WB3_n3696DisParPar[0] ;
         A3695DisParReo = P01WB3_A3695DisParReo[0] ;
         n3695DisParReo = P01WB3_n3695DisParReo[0] ;
         A3694DisParCod = P01WB3_A3694DisParCod[0] ;
         n3694DisParCod = P01WB3_n3694DisParCod[0] ;
         A7067DisUltNot = P01WB3_A7067DisUltNot[0] ;
         n7067DisUltNot = P01WB3_n7067DisUltNot[0] ;
         A4918DisDibCoDN = P01WB3_A4918DisDibCoDN[0] ;
         n4918DisDibCoDN = P01WB3_n4918DisDibCoDN[0] ;
         A4879DibColColN = P01WB3_A4879DibColColN[0] ;
         n4879DibColColN = P01WB3_n4879DibColColN[0] ;
         A4919DisDibCoCN = P01WB3_A4919DisDibCoCN[0] ;
         n4919DisDibCoCN = P01WB3_n4919DisDibCoCN[0] ;
         A4877DibColCol = P01WB3_A4877DibColCol[0] ;
         n4877DibColCol = P01WB3_n4877DibColCol[0] ;
         A4476DisAcaFor = P01WB3_A4476DisAcaFor[0] ;
         n4476DisAcaFor = P01WB3_n4476DisAcaFor[0] ;
         A4475DisLotMaq = P01WB3_A4475DisLotMaq[0] ;
         n4475DisLotMaq = P01WB3_n4475DisLotMaq[0] ;
         A4472DisLotPza = P01WB3_A4472DisLotPza[0] ;
         n4472DisLotPza = P01WB3_n4472DisLotPza[0] ;
         A4355DisFecPed = P01WB3_A4355DisFecPed[0] ;
         n4355DisFecPed = P01WB3_n4355DisFecPed[0] ;
         A10887Cod_Idtx = P01WB3_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = P01WB3_n10887Cod_Idtx[0] ;
         A9787DisItem6 = P01WB3_A9787DisItem6[0] ;
         A9786DisItem5 = P01WB3_A9786DisItem5[0] ;
         A9774DisItem4 = P01WB3_A9774DisItem4[0] ;
         A9773DisItem3 = P01WB3_A9773DisItem3[0] ;
         A9772DisItem2 = P01WB3_A9772DisItem2[0] ;
         A9771DisItem1 = P01WB3_A9771DisItem1[0] ;
         A8887DisFchT = P01WB3_A8887DisFchT[0] ;
         n8887DisFchT = P01WB3_n8887DisFchT[0] ;
         A8886DisDest = P01WB3_A8886DisDest[0] ;
         A8885DisFEnt = P01WB3_A8885DisFEnt[0] ;
         n8885DisFEnt = P01WB3_n8885DisFEnt[0] ;
         A7739DisExp = P01WB3_A7739DisExp[0] ;
         A7738DisMaqEst = P01WB3_A7738DisMaqEst[0] ;
         A7523DisRec = P01WB3_A7523DisRec[0] ;
         A7516DisGraTam = P01WB3_A7516DisGraTam[0] ;
         n7516DisGraTam = P01WB3_n7516DisGraTam[0] ;
         A7515DisDesCol = P01WB3_A7515DisDesCol[0] ;
         n7515DisDesCol = P01WB3_n7515DisDesCol[0] ;
         A7514DisOrdGra = P01WB3_A7514DisOrdGra[0] ;
         A7513DisOrdSep = P01WB3_A7513DisOrdSep[0] ;
         A7512DisFacGra = P01WB3_A7512DisFacGra[0] ;
         n7512DisFacGra = P01WB3_n7512DisFacGra[0] ;
         A7511DisFacSep = P01WB3_A7511DisFacSep[0] ;
         n7511DisFacSep = P01WB3_n7511DisFacSep[0] ;
         A7510DisDto = P01WB3_A7510DisDto[0] ;
         n7510DisDto = P01WB3_n7510DisDto[0] ;
         A6548DisRbMaq = P01WB3_A6548DisRbMaq[0] ;
         A6547DisVolMaq = P01WB3_A6547DisVolMaq[0] ;
         A5405DisAntpT = P01WB3_A5405DisAntpT[0] ;
         A5366DisAntp = P01WB3_A5366DisAntp[0] ;
         A5350DisObsAnc = P01WB3_A5350DisObsAnc[0] ;
         A5349DisObsGrm = P01WB3_A5349DisObsGrm[0] ;
         A5290DisTipCor = P01WB3_A5290DisTipCor[0] ;
         A5252DisAcc = P01WB3_A5252DisAcc[0] ;
         A5032DisEstTip = P01WB3_A5032DisEstTip[0] ;
         A5031DisCom = P01WB3_A5031DisCom[0] ;
         n5031DisCom = P01WB3_n5031DisCom[0] ;
         A5025DisGraCob = P01WB3_A5025DisGraCob[0] ;
         A5024DisTipEst = P01WB3_A5024DisTipEst[0] ;
         A4876DibColDib = P01WB3_A4876DibColDib[0] ;
         n4876DibColDib = P01WB3_n4876DibColDib[0] ;
         A4813DisEncCli = P01WB3_A4813DisEncCli[0] ;
         A4785DisNroCor = P01WB3_A4785DisNroCor[0] ;
         A4720DisDishCod = P01WB3_A4720DisDishCod[0] ;
         A4617DisHorReg = P01WB3_A4617DisHorReg[0] ;
         n4617DisHorReg = P01WB3_n4617DisHorReg[0] ;
         A4616DisHorEnt = P01WB3_A4616DisHorEnt[0] ;
         n4616DisHorEnt = P01WB3_n4616DisHorEnt[0] ;
         A4615DisTam = P01WB3_A4615DisTam[0] ;
         A4614DisMdlCod = P01WB3_A4614DisMdlCod[0] ;
         A4479DisAcaMar = P01WB3_A4479DisAcaMar[0] ;
         A4478DisAcaAnh = P01WB3_A4478DisAcaAnh[0] ;
         A4477DisAcaBak = P01WB3_A4477DisAcaBak[0] ;
         A4474DisLotKgs = P01WB3_A4474DisLotKgs[0] ;
         A4473DisLotMts = P01WB3_A4473DisLotMts[0] ;
         A4471DisCruEnr = P01WB3_A4471DisCruEnr[0] ;
         A4470DisCruKgs = P01WB3_A4470DisCruKgs[0] ;
         A4469DisCruMts = P01WB3_A4469DisCruMts[0] ;
         A4468DisPelAnh = P01WB3_A4468DisPelAnh[0] ;
         A4348DisUsrCod = P01WB3_A4348DisUsrCod[0] ;
         A4294DisNPzasL = P01WB3_A4294DisNPzasL[0] ;
         n4294DisNPzasL = P01WB3_n4294DisNPzasL[0] ;
         A4293DisNPzas = P01WB3_A4293DisNPzas[0] ;
         n4293DisNPzas = P01WB3_n4293DisNPzas[0] ;
         A4014DisTin = P01WB3_A4014DisTin[0] ;
         A4013DisEnv = P01WB3_A4013DisEnv[0] ;
         n4013DisEnv = P01WB3_n4013DisEnv[0] ;
         A2525DisComULin = P01WB3_A2525DisComULin[0] ;
         n2525DisComULin = P01WB3_n2525DisComULin[0] ;
         A1052DisObs = P01WB3_A1052DisObs[0] ;
         A1051DisNumCol = P01WB3_A1051DisNumCol[0] ;
         n1051DisNumCol = P01WB3_n1051DisNumCol[0] ;
         A1014DibInt = P01WB3_A1014DibInt[0] ;
         n1014DibInt = P01WB3_n1014DibInt[0] ;
         A1013DibCli = P01WB3_A1013DibCli[0] ;
         n1013DibCli = P01WB3_n1013DibCli[0] ;
         A1031EmpesCod = P01WB3_A1031EmpesCod[0] ;
         n1031EmpesCod = P01WB3_n1031EmpesCod[0] ;
         A3841DisArtMer = P01WB3_A3841DisArtMer[0] ;
         A3826RetCod = P01WB3_A3826RetCod[0] ;
         n3826RetCod = P01WB3_n3826RetCod[0] ;
         A3627DisFecLan = P01WB3_A3627DisFecLan[0] ;
         n3627DisFecLan = P01WB3_n3627DisFecLan[0] ;
         A966PartCod = P01WB3_A966PartCod[0] ;
         n966PartCod = P01WB3_n966PartCod[0] ;
         A1122MaqCodDis = P01WB3_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P01WB3_n1122MaqCodDis[0] ;
         A371DisFecEnt = P01WB3_A371DisFecEnt[0] ;
         A14555DisPrePz = P01WB3_A14555DisPrePz[0] ;
         A13987DisArtDsc2 = P01WB3_A13987DisArtDsc2[0] ;
         A13986DisIdtx2 = P01WB3_A13986DisIdtx2[0] ;
         n13986DisIdtx2 = P01WB3_n13986DisIdtx2[0] ;
         A13768DisTallUlt = P01WB3_A13768DisTallUlt[0] ;
         A13767DisRdto4 = P01WB3_A13767DisRdto4[0] ;
         A13233DisRGB = P01WB3_A13233DisRGB[0] ;
         A13080DisDGUltli = P01WB3_A13080DisDGUltli[0] ;
         A13076DisLinPrd = P01WB3_A13076DisLinPrd[0] ;
         n13076DisLinPrd = P01WB3_n13076DisLinPrd[0] ;
         A13069DisCanalID = P01WB3_A13069DisCanalID[0] ;
         n13069DisCanalID = P01WB3_n13069DisCanalID[0] ;
         A13068DisLineaID = P01WB3_A13068DisLineaID[0] ;
         n13068DisLineaID = P01WB3_n13068DisLineaID[0] ;
         A12880DisOEKOTEX = P01WB3_A12880DisOEKOTEX[0] ;
         n12880DisOEKOTEX = P01WB3_n12880DisOEKOTEX[0] ;
         A12772DisProdID = P01WB3_A12772DisProdID[0] ;
         n12772DisProdID = P01WB3_n12772DisProdID[0] ;
         A12768DisTpEstam = P01WB3_A12768DisTpEstam[0] ;
         A12765DisPriorid = P01WB3_A12765DisPriorid[0] ;
         A12328RevenID = P01WB3_A12328RevenID[0] ;
         n12328RevenID = P01WB3_n12328RevenID[0] ;
         A11864Nxt_artcli = P01WB3_A11864Nxt_artcli[0] ;
         A11863DptoID = P01WB3_A11863DptoID[0] ;
         n11863DptoID = P01WB3_n11863DptoID[0] ;
         A11862DesaID = P01WB3_A11862DesaID[0] ;
         n11862DesaID = P01WB3_n11862DesaID[0] ;
         A11861Nxt_statio = P01WB3_A11861Nxt_statio[0] ;
         A11860CpteId = P01WB3_A11860CpteId[0] ;
         n11860CpteId = P01WB3_n11860CpteId[0] ;
         A11859Nxt_modelo = P01WB3_A11859Nxt_modelo[0] ;
         A11734DisCnoEncO = P01WB3_A11734DisCnoEncO[0] ;
         A11659MarcaId = P01WB3_A11659MarcaId[0] ;
         n11659MarcaId = P01WB3_n11659MarcaId[0] ;
         A11658DisMemo2 = P01WB3_A11658DisMemo2[0] ;
         A11657DisMemo1 = P01WB3_A11657DisMemo1[0] ;
         A3696DisParPar = P01WB3_A3696DisParPar[0] ;
         n3696DisParPar = P01WB3_n3696DisParPar[0] ;
         A3695DisParReo = P01WB3_A3695DisParReo[0] ;
         n3695DisParReo = P01WB3_n3695DisParReo[0] ;
         A3694DisParCod = P01WB3_A3694DisParCod[0] ;
         n3694DisParCod = P01WB3_n3694DisParCod[0] ;
         A7067DisUltNot = P01WB3_A7067DisUltNot[0] ;
         n7067DisUltNot = P01WB3_n7067DisUltNot[0] ;
         A4918DisDibCoDN = P01WB3_A4918DisDibCoDN[0] ;
         n4918DisDibCoDN = P01WB3_n4918DisDibCoDN[0] ;
         A4879DibColColN = P01WB3_A4879DibColColN[0] ;
         n4879DibColColN = P01WB3_n4879DibColColN[0] ;
         A4919DisDibCoCN = P01WB3_A4919DisDibCoCN[0] ;
         n4919DisDibCoCN = P01WB3_n4919DisDibCoCN[0] ;
         A4877DibColCol = P01WB3_A4877DibColCol[0] ;
         n4877DibColCol = P01WB3_n4877DibColCol[0] ;
         A4476DisAcaFor = P01WB3_A4476DisAcaFor[0] ;
         n4476DisAcaFor = P01WB3_n4476DisAcaFor[0] ;
         A4475DisLotMaq = P01WB3_A4475DisLotMaq[0] ;
         n4475DisLotMaq = P01WB3_n4475DisLotMaq[0] ;
         A4472DisLotPza = P01WB3_A4472DisLotPza[0] ;
         n4472DisLotPza = P01WB3_n4472DisLotPza[0] ;
         A4355DisFecPed = P01WB3_A4355DisFecPed[0] ;
         n4355DisFecPed = P01WB3_n4355DisFecPed[0] ;
         A10887Cod_Idtx = P01WB3_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = P01WB3_n10887Cod_Idtx[0] ;
         A9787DisItem6 = P01WB3_A9787DisItem6[0] ;
         A9786DisItem5 = P01WB3_A9786DisItem5[0] ;
         A9774DisItem4 = P01WB3_A9774DisItem4[0] ;
         A9773DisItem3 = P01WB3_A9773DisItem3[0] ;
         A9772DisItem2 = P01WB3_A9772DisItem2[0] ;
         A9771DisItem1 = P01WB3_A9771DisItem1[0] ;
         A8887DisFchT = P01WB3_A8887DisFchT[0] ;
         n8887DisFchT = P01WB3_n8887DisFchT[0] ;
         A8886DisDest = P01WB3_A8886DisDest[0] ;
         A8885DisFEnt = P01WB3_A8885DisFEnt[0] ;
         n8885DisFEnt = P01WB3_n8885DisFEnt[0] ;
         A7739DisExp = P01WB3_A7739DisExp[0] ;
         A7738DisMaqEst = P01WB3_A7738DisMaqEst[0] ;
         A7523DisRec = P01WB3_A7523DisRec[0] ;
         A7516DisGraTam = P01WB3_A7516DisGraTam[0] ;
         n7516DisGraTam = P01WB3_n7516DisGraTam[0] ;
         A7515DisDesCol = P01WB3_A7515DisDesCol[0] ;
         n7515DisDesCol = P01WB3_n7515DisDesCol[0] ;
         A7514DisOrdGra = P01WB3_A7514DisOrdGra[0] ;
         A7513DisOrdSep = P01WB3_A7513DisOrdSep[0] ;
         A7512DisFacGra = P01WB3_A7512DisFacGra[0] ;
         n7512DisFacGra = P01WB3_n7512DisFacGra[0] ;
         A7511DisFacSep = P01WB3_A7511DisFacSep[0] ;
         n7511DisFacSep = P01WB3_n7511DisFacSep[0] ;
         A7510DisDto = P01WB3_A7510DisDto[0] ;
         n7510DisDto = P01WB3_n7510DisDto[0] ;
         A6548DisRbMaq = P01WB3_A6548DisRbMaq[0] ;
         A6547DisVolMaq = P01WB3_A6547DisVolMaq[0] ;
         A5405DisAntpT = P01WB3_A5405DisAntpT[0] ;
         A5366DisAntp = P01WB3_A5366DisAntp[0] ;
         A5350DisObsAnc = P01WB3_A5350DisObsAnc[0] ;
         A5349DisObsGrm = P01WB3_A5349DisObsGrm[0] ;
         A5290DisTipCor = P01WB3_A5290DisTipCor[0] ;
         A5252DisAcc = P01WB3_A5252DisAcc[0] ;
         A5032DisEstTip = P01WB3_A5032DisEstTip[0] ;
         A5031DisCom = P01WB3_A5031DisCom[0] ;
         n5031DisCom = P01WB3_n5031DisCom[0] ;
         A5025DisGraCob = P01WB3_A5025DisGraCob[0] ;
         A5024DisTipEst = P01WB3_A5024DisTipEst[0] ;
         A4876DibColDib = P01WB3_A4876DibColDib[0] ;
         n4876DibColDib = P01WB3_n4876DibColDib[0] ;
         A4813DisEncCli = P01WB3_A4813DisEncCli[0] ;
         A4785DisNroCor = P01WB3_A4785DisNroCor[0] ;
         A4720DisDishCod = P01WB3_A4720DisDishCod[0] ;
         A4617DisHorReg = P01WB3_A4617DisHorReg[0] ;
         n4617DisHorReg = P01WB3_n4617DisHorReg[0] ;
         A4616DisHorEnt = P01WB3_A4616DisHorEnt[0] ;
         n4616DisHorEnt = P01WB3_n4616DisHorEnt[0] ;
         A4615DisTam = P01WB3_A4615DisTam[0] ;
         A4614DisMdlCod = P01WB3_A4614DisMdlCod[0] ;
         A4479DisAcaMar = P01WB3_A4479DisAcaMar[0] ;
         A4478DisAcaAnh = P01WB3_A4478DisAcaAnh[0] ;
         A4477DisAcaBak = P01WB3_A4477DisAcaBak[0] ;
         A166BarKgm = P01WB3_A166BarKgm[0] ;
         A199BarPie1 = P01WB3_A199BarPie1[0] ;
         A898BarPieNDes = P01WB3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         W396EmprCod = A396EmprCod ;
         AV28BarCod = A129BarCod ;
         AV60Barcodreo = A132BarCodReo ;
         AV55Disdes = A365DisDes ;
         /*
            INSERT RECORD ON TABLE TXPDISPOS

         */
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         W252CliCod = A252CliCod ;
         n252CliCod = false ;
         W757PriCod = A757PriCod ;
         W335DisArtCod = A335DisArtCod ;
         W375DisNumUni = A375DisNumUni ;
         W374DisNumPie = A374DisNumPie ;
         W392DisUniMed = A392DisUniMed ;
         W369DisFec = A369DisFec ;
         W390DisTipCol = A390DisTipCol ;
         n390DisTipCol = false ;
         W1195DisNomCli = A1195DisNomCli ;
         W1196DisNumCli = A1196DisNumCli ;
         W360DisCliNum = A360DisCliNum ;
         W367DisEst = A367DisEst ;
         W334DisArtAnh = A334DisArtAnh ;
         W1231DisArtAn1 = A1231DisArtAn1 ;
         W1906DisGraAca = A1906DisGraAca ;
         W3131DisGraAca2 = A3131DisGraAca2 ;
         W378DisObsULin = A378DisObsULin ;
         W365DisDes = A365DisDes ;
         W362DisColNom = A362DisColNom ;
         n362DisColNom = false ;
         W342DisArtPes = A342DisArtPes ;
         W363DisColNum = A363DisColNum ;
         n363DisColNum = false ;
         W390DisTipCol = A390DisTipCol ;
         n390DisTipCol = false ;
         W337DisArtDsc = A337DisArtDsc ;
         W366DisEnt = A366DisEnt ;
         W378DisObsULin = A378DisObsULin ;
         W340DisArtMat = A340DisArtMat ;
         W339DisArtLar = A339DisArtLar ;
         W351DisArtSua = A351DisArtSua ;
         W333DisArtAca = A333DisArtAca ;
         W343DisArtPle = A343DisArtPle ;
         W352DisArtTip = A352DisArtTip ;
         W338DisArtEnc = A338DisArtEnc ;
         W336DisArtCor = A336DisArtCor ;
         W341DisArtOpe = A341DisArtOpe ;
         W353DisArtTr1 = A353DisArtTr1 ;
         W344DisArtPt1 = A344DisArtPt1 ;
         W354DisArtTr2 = A354DisArtTr2 ;
         W345DisArtPt2 = A345DisArtPt2 ;
         W355DisArtTr3 = A355DisArtTr3 ;
         W346DisArtPt3 = A346DisArtPt3 ;
         W350DisArtRdt = A350DisArtRdt ;
         W359DisArtUrg = A359DisArtUrg ;
         W356DisArtUr1 = A356DisArtUr1 ;
         W347DisArtPu1 = A347DisArtPu1 ;
         W357DisArtUr2 = A357DisArtUr2 ;
         W348DisArtPu2 = A348DisArtPu2 ;
         W358DisArtUr3 = A358DisArtUr3 ;
         W349DisArtPu3 = A349DisArtPu3 ;
         n349DisArtPu3 = false ;
         W388DisPreKgm = A388DisPreKgm ;
         W389DisPreMtr = A389DisPreMtr ;
         W383DisPieLan = A383DisPieLan ;
         W372DisKgmLan = A372DisKgmLan ;
         W373DisMtrLan = A373DisMtrLan ;
         W998DisNMtr = A998DisNMtr ;
         W999DisNMez = A999DisNMez ;
         W1002DisNumTen = A1002DisNumTen ;
         n1002DisNumTen = false ;
         W1157TipConCod = A1157TipConCod ;
         n1157TipConCod = false ;
         W1197DisEncCom = A1197DisEncCom ;
         W1198DisEncAnh = A1198DisEncAnh ;
         W1225DisGraCru = A1225DisGraCru ;
         W1231DisArtAn1 = A1231DisArtAn1 ;
         W1232DisArtAcb = A1232DisArtAcb ;
         W1233DisArtAc2 = A1233DisArtAc2 ;
         W1430DisLoc = A1430DisLoc ;
         W1502DisPart = A1502DisPart ;
         W1907DisRdoN = A1907DisRdoN ;
         W1908DisRdoA = A1908DisRdoA ;
         W1968DisRes = A1968DisRes ;
         n1968DisRes = false ;
         W2267DisNumBas = A2267DisNumBas ;
         n2267DisNumBas = false ;
         W2310DisCliDes = A2310DisCliDes ;
         W2402DisManCod = A2402DisManCod ;
         W2403DisOpeAnt = A2403DisOpeAnt ;
         n2403DisOpeAnt = false ;
         W2742DisCodTex = A2742DisCodTex ;
         n2742DisCodTex = false ;
         W2743DisNumTex1 = A2743DisNumTex1 ;
         W2744DisNumTex2 = A2744DisNumTex2 ;
         n2744DisNumTex2 = false ;
         W2831DisNumLot = A2831DisNumLot ;
         W2832DisKgsLot = A2832DisKgsLot ;
         W2833DisMtrLot = A2833DisMtrLot ;
         W2926DisPla = A2926DisPla ;
         W2835DisPle2 = A2835DisPle2 ;
         W3127DisNumCor = A3127DisNumCor ;
         W3128DisAncSal1 = A3128DisAncSal1 ;
         W3129DisAncSal2 = A3129DisAncSal2 ;
         W3130DisAncSal3 = A3130DisAncSal3 ;
         W3132DisGraCru2 = A3132DisGraCru2 ;
         W3306DisFac = A3306DisFac ;
         W3307DisManCod1 = A3307DisManCod1 ;
         W3308DisManCod2 = A3308DisManCod2 ;
         W3309DisNumTon = A3309DisNumTon ;
         W2009DisTipDis = A2009DisTipDis ;
         n2009DisTipDis = false ;
         W370DisFecCli = A370DisFecCli ;
         W392DisUniMed = A392DisUniMed ;
         W757PriCod = A757PriCod ;
         W11661DisOrdComp = A11661DisOrdComp ;
         n252CliCod = false ;
         A757PriCod = "1" ;
         A335DisArtCod = A212BarSer ;
         A375DisNumUni = A166BarKgm ;
         A374DisNumPie = (short)(A198BarPie) ;
         A392DisUniMed = httpContext.getMessage( "K", "") ;
         A369DisFec = A159BarFecGen ;
         A390DisTipCol = A218BarTipCol ;
         n390DisTipCol = false ;
         A1195DisNomCli = A1234BarNomCli ;
         A1196DisNumCli = A1235BarNumCli ;
         A360DisCliNum = A143BarDisNum ;
         A367DisEst = (byte)(3) ;
         A334DisArtAnh = A125BarAncAca1 ;
         A1231DisArtAn1 = A126BarAncAca2 ;
         A1906DisGraAca = A1909BarGraAca ;
         A3131DisGraAca2 = A3137BarGraAca2 ;
         A378DisObsULin = (byte)(0) ;
         A365DisDes = AV55Disdes ;
         A362DisColNom = A135BarColNom ;
         n362DisColNom = false ;
         A342DisArtPes = (short)(0) ;
         A363DisColNum = A136BarColNum ;
         n363DisColNum = false ;
         A390DisTipCol = A218BarTipCol ;
         n390DisTipCol = false ;
         A337DisArtDsc = A1652BarSerDsc ;
         A366DisEnt = " " ;
         A378DisObsULin = (byte)(0) ;
         A340DisArtMat = " " ;
         A339DisArtLar = " " ;
         A351DisArtSua = " " ;
         A333DisArtAca = " " ;
         A343DisArtPle = " " ;
         A352DisArtTip = (short)(0) ;
         A338DisArtEnc = " " ;
         A336DisArtCor = " " ;
         A341DisArtOpe = " " ;
         A353DisArtTr1 = " " ;
         A344DisArtPt1 = (short)(0) ;
         A354DisArtTr2 = " " ;
         A345DisArtPt2 = (short)(0) ;
         A355DisArtTr3 = " " ;
         A346DisArtPt3 = (short)(0) ;
         A350DisArtRdt = DecimalUtil.doubleToDec(0) ;
         A359DisArtUrg = (byte)(0) ;
         A356DisArtUr1 = " " ;
         A347DisArtPu1 = (short)(0) ;
         A357DisArtUr2 = " " ;
         A348DisArtPu2 = (short)(0) ;
         A358DisArtUr3 = " " ;
         A349DisArtPu3 = (short)(0) ;
         n349DisArtPu3 = false ;
         A388DisPreKgm = DecimalUtil.doubleToDec(0) ;
         A389DisPreMtr = DecimalUtil.doubleToDec(0) ;
         A383DisPieLan = (short)(0) ;
         A372DisKgmLan = (short)(0) ;
         A373DisMtrLan = (short)(0) ;
         A998DisNMtr = " " ;
         A999DisNMez = " " ;
         A1002DisNumTen = " " ;
         n1002DisNumTen = false ;
         A1157TipConCod = (short)(0) ;
         n1157TipConCod = false ;
         A1197DisEncCom = DecimalUtil.doubleToDec(0) ;
         A1198DisEncAnh = DecimalUtil.doubleToDec(0) ;
         A1225DisGraCru = (short)(0) ;
         A1231DisArtAn1 = (short)(0) ;
         A1232DisArtAcb = (short)(0) ;
         A1233DisArtAc2 = (short)(0) ;
         A1430DisLoc = " " ;
         A1502DisPart = (short)(0) ;
         A1907DisRdoN = DecimalUtil.doubleToDec(0) ;
         A1908DisRdoA = DecimalUtil.doubleToDec(0) ;
         A1968DisRes = " " ;
         n1968DisRes = false ;
         A2267DisNumBas = (short)(0) ;
         n2267DisNumBas = false ;
         A2310DisCliDes = 0 ;
         A2402DisManCod = (short)(0) ;
         A2403DisOpeAnt = 0 ;
         n2403DisOpeAnt = false ;
         A2742DisCodTex = " " ;
         n2742DisCodTex = false ;
         A2743DisNumTex1 = (byte)(0) ;
         A2744DisNumTex2 = (short)(0) ;
         n2744DisNumTex2 = false ;
         A2831DisNumLot = 0 ;
         A2832DisKgsLot = DecimalUtil.doubleToDec(0) ;
         A2833DisMtrLot = DecimalUtil.doubleToDec(0) ;
         A2926DisPla = " " ;
         A2835DisPle2 = " " ;
         A3127DisNumCor = (short)(0) ;
         A3128DisAncSal1 = (short)(0) ;
         A3129DisAncSal2 = (short)(0) ;
         A3130DisAncSal3 = (short)(0) ;
         A3132DisGraCru2 = (short)(0) ;
         A3306DisFac = " " ;
         A3307DisManCod1 = (short)(0) ;
         A3308DisManCod2 = (short)(0) ;
         A3309DisNumTon = " " ;
         A2009DisTipDis = httpContext.getMessage( "R", "") ;
         n2009DisTipDis = false ;
         A370DisFecCli = A155BarFecCli ;
         A392DisUniMed = A228BarUniMed ;
         A757PriCod = A209BarPri ;
         A11661DisOrdComp = httpContext.getMessage( "Registro creado f(BARCAD)", "") + " " + localUtil.ttoc( AV58Diahora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         /* Using cursor P01WB4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A365DisDes, A335DisArtCod, Short.valueOf(A374DisNumPie), A375DisNumUni, A392DisUniMed, Short.valueOf(A342DisArtPes), A757PriCod, A360DisCliNum, A370DisFecCli, A369DisFec, A371DisFecEnt, Boolean.valueOf(n362DisColNom), A362DisColNom, Boolean.valueOf(n363DisColNum), Integer.valueOf(A363DisColNum), Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol), A337DisArtDsc, A366DisEnt, Byte.valueOf(A378DisObsULin), A340DisArtMat, A339DisArtLar, A351DisArtSua, A333DisArtAca, A343DisArtPle, Short.valueOf(A352DisArtTip), A338DisArtEnc, A336DisArtCor, A341DisArtOpe, A353DisArtTr1, Short.valueOf(A344DisArtPt1), A354DisArtTr2, Short.valueOf(A345DisArtPt2), A355DisArtTr3, Short.valueOf(A346DisArtPt3), A350DisArtRdt, Byte.valueOf(A359DisArtUrg), A356DisArtUr1, Short.valueOf(A347DisArtPu1), A357DisArtUr2, Short.valueOf(A348DisArtPu2), A358DisArtUr3, Boolean.valueOf(n349DisArtPu3), Short.valueOf(A349DisArtPu3), Short.valueOf(A334DisArtAnh), Byte.valueOf(A367DisEst), A388DisPreKgm, A389DisPreMtr, Short.valueOf(A383DisPieLan), Short.valueOf(A372DisKgmLan), Short.valueOf(A373DisMtrLan), A998DisNMtr, A999DisNMez, Boolean.valueOf(n1002DisNumTen), A1002DisNumTen, Boolean.valueOf(n1122MaqCodDis), A1122MaqCodDis, Boolean.valueOf(n966PartCod), A966PartCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1157TipConCod), Short.valueOf(A1157TipConCod), A1195DisNomCli, Integer.valueOf(A1196DisNumCli), A1197DisEncCom, A1198DisEncAnh, Short.valueOf(A1225DisGraCru), Short.valueOf(A1231DisArtAn1), Short.valueOf(A1232DisArtAcb), Short.valueOf(A1233DisArtAc2), A1430DisLoc, Short.valueOf(A1502DisPart), Short.valueOf(A1906DisGraAca), A1907DisRdoN, A1908DisRdoA, Boolean.valueOf(n1968DisRes), A1968DisRes, Boolean.valueOf(n2009DisTipDis), A2009DisTipDis, Boolean.valueOf(n2267DisNumBas), Short.valueOf(A2267DisNumBas), Integer.valueOf(A2310DisCliDes), Short.valueOf(A2402DisManCod), Boolean.valueOf(n2403DisOpeAnt), Integer.valueOf(A2403DisOpeAnt), Boolean.valueOf(n2742DisCodTex), A2742DisCodTex, Byte.valueOf(A2743DisNumTex1), Boolean.valueOf(n2744DisNumTex2), Short.valueOf(A2744DisNumTex2), Integer.valueOf(A2831DisNumLot), A2832DisKgsLot, A2833DisMtrLot, A2926DisPla, A2835DisPle2, Short.valueOf(A3127DisNumCor), Short.valueOf(A3128DisAncSal1), Short.valueOf(A3129DisAncSal2), Short.valueOf(A3130DisAncSal3), Short.valueOf(A3131DisGraAca2), Short.valueOf(A3132DisGraCru2), A3306DisFac, Short.valueOf(A3307DisManCod1), Short.valueOf(A3308DisManCod2), A3309DisNumTon, Boolean.valueOf(n3627DisFecLan), A3627DisFecLan, Boolean.valueOf(n3826RetCod), A3826RetCod, A3841DisArtMer, Boolean.valueOf(n1031EmpesCod), A1031EmpesCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), Boolean.valueOf(n1051DisNumCol), Short.valueOf(A1051DisNumCol), A1052DisObs,
         Boolean.valueOf(n2525DisComULin), Byte.valueOf(A2525DisComULin), Boolean.valueOf(n4013DisEnv), Byte.valueOf(A4013DisEnv), A4014DisTin, Boolean.valueOf(n4293DisNPzas), Integer.valueOf(A4293DisNPzas), Boolean.valueOf(n4294DisNPzasL), Integer.valueOf(A4294DisNPzasL), A4348DisUsrCod, Short.valueOf(A4468DisPelAnh), A4469DisCruMts, A4470DisCruKgs, A4471DisCruEnr, A4473DisLotMts, A4474DisLotKgs, A4477DisAcaBak, Short.valueOf(A4478DisAcaAnh), A4479DisAcaMar, A4614DisMdlCod, A4615DisTam, Boolean.valueOf(n4616DisHorEnt), A4616DisHorEnt, Boolean.valueOf(n4617DisHorReg), A4617DisHorReg, A4720DisDishCod, Integer.valueOf(A4785DisNroCor), A4813DisEncCli, Boolean.valueOf(n4876DibColDib), A4876DibColDib, Byte.valueOf(A5024DisTipEst), Byte.valueOf(A5025DisGraCob), Boolean.valueOf(n5031DisCom), A5031DisCom, A5032DisEstTip, A5252DisAcc, A5290DisTipCor, A5349DisObsGrm, A5350DisObsAnc, A5366DisAntp, A5405DisAntpT, Integer.valueOf(A6547DisVolMaq), A6548DisRbMaq, Boolean.valueOf(n7510DisDto), A7510DisDto, Boolean.valueOf(n7511DisFacSep), Byte.valueOf(A7511DisFacSep), Boolean.valueOf(n7512DisFacGra), Byte.valueOf(A7512DisFacGra), Byte.valueOf(A7513DisOrdSep), Byte.valueOf(A7514DisOrdGra), Boolean.valueOf(n7515DisDesCol), Byte.valueOf(A7515DisDesCol), Boolean.valueOf(n7516DisGraTam), A7516DisGraTam, A7523DisRec, A7738DisMaqEst, A7739DisExp, Boolean.valueOf(n8885DisFEnt), A8885DisFEnt, A8886DisDest, Boolean.valueOf(n8887DisFchT), A8887DisFchT, A9771DisItem1, A9772DisItem2, A9773DisItem3, A9774DisItem4, A9786DisItem5, A9787DisItem6, Boolean.valueOf(n10887Cod_Idtx), A10887Cod_Idtx, Boolean.valueOf(n4355DisFecPed), A4355DisFecPed, Boolean.valueOf(n4472DisLotPza), Short.valueOf(A4472DisLotPza), Boolean.valueOf(n4475DisLotMaq), A4475DisLotMaq, Boolean.valueOf(n4476DisAcaFor), Integer.valueOf(A4476DisAcaFor), Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4919DisDibCoCN), Integer.valueOf(A4919DisDibCoCN), Boolean.valueOf(n4879DibColColN), Integer.valueOf(A4879DibColColN), Boolean.valueOf(n4918DisDibCoDN), Integer.valueOf(A4918DisDibCoDN), Boolean.valueOf(n7067DisUltNot), Byte.valueOf(A7067DisUltNot), Boolean.valueOf(n3694DisParCod), Integer.valueOf(A3694DisParCod), Boolean.valueOf(n3695DisParReo), Byte.valueOf(A3695DisParReo), Boolean.valueOf(n3696DisParPar), A3696DisParPar, A11657DisMemo1, A11658DisMemo2, Boolean.valueOf(n11659MarcaId), A11659MarcaId, A11661DisOrdComp, A11734DisCnoEncO, A11859Nxt_modelo, Boolean.valueOf(n11860CpteId), Short.valueOf(A11860CpteId), A11861Nxt_statio, Boolean.valueOf(n11862DesaID), Short.valueOf(A11862DesaID), Boolean.valueOf(n11863DptoID), Short.valueOf(A11863DptoID), A11864Nxt_artcli, Boolean.valueOf(n12328RevenID), A12328RevenID, Byte.valueOf(A12765DisPriorid), Byte.valueOf(A12768DisTpEstam), Boolean.valueOf(n12772DisProdID), A12772DisProdID, Boolean.valueOf(n12880DisOEKOTEX), A12880DisOEKOTEX, Boolean.valueOf(n13068DisLineaID), Short.valueOf(A13068DisLineaID), Boolean.valueOf(n13069DisCanalID), Integer.valueOf(A13069DisCanalID), Boolean.valueOf(n13076DisLinPrd), A13076DisLinPrd, Byte.valueOf(A13080DisDGUltli),
         Long.valueOf(A13233DisRGB), A13767DisRdto4, Short.valueOf(A13768DisTallUlt), Boolean.valueOf(n13986DisIdtx2), A13986DisIdtx2, A13987DisArtDsc2, A14555DisPrePz});
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
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         A252CliCod = W252CliCod ;
         n252CliCod = false ;
         A757PriCod = W757PriCod ;
         A335DisArtCod = W335DisArtCod ;
         A375DisNumUni = W375DisNumUni ;
         A374DisNumPie = W374DisNumPie ;
         A392DisUniMed = W392DisUniMed ;
         A369DisFec = W369DisFec ;
         A390DisTipCol = W390DisTipCol ;
         n390DisTipCol = false ;
         A1195DisNomCli = W1195DisNomCli ;
         A1196DisNumCli = W1196DisNumCli ;
         A360DisCliNum = W360DisCliNum ;
         A367DisEst = W367DisEst ;
         A334DisArtAnh = W334DisArtAnh ;
         A1231DisArtAn1 = W1231DisArtAn1 ;
         A1906DisGraAca = W1906DisGraAca ;
         A3131DisGraAca2 = W3131DisGraAca2 ;
         A378DisObsULin = W378DisObsULin ;
         A365DisDes = W365DisDes ;
         A362DisColNom = W362DisColNom ;
         n362DisColNom = false ;
         A342DisArtPes = W342DisArtPes ;
         A363DisColNum = W363DisColNum ;
         n363DisColNum = false ;
         A390DisTipCol = W390DisTipCol ;
         n390DisTipCol = false ;
         A337DisArtDsc = W337DisArtDsc ;
         A366DisEnt = W366DisEnt ;
         A378DisObsULin = W378DisObsULin ;
         A340DisArtMat = W340DisArtMat ;
         A339DisArtLar = W339DisArtLar ;
         A351DisArtSua = W351DisArtSua ;
         A333DisArtAca = W333DisArtAca ;
         A343DisArtPle = W343DisArtPle ;
         A352DisArtTip = W352DisArtTip ;
         A338DisArtEnc = W338DisArtEnc ;
         A336DisArtCor = W336DisArtCor ;
         A341DisArtOpe = W341DisArtOpe ;
         A353DisArtTr1 = W353DisArtTr1 ;
         A344DisArtPt1 = W344DisArtPt1 ;
         A354DisArtTr2 = W354DisArtTr2 ;
         A345DisArtPt2 = W345DisArtPt2 ;
         A355DisArtTr3 = W355DisArtTr3 ;
         A346DisArtPt3 = W346DisArtPt3 ;
         A350DisArtRdt = W350DisArtRdt ;
         A359DisArtUrg = W359DisArtUrg ;
         A356DisArtUr1 = W356DisArtUr1 ;
         A347DisArtPu1 = W347DisArtPu1 ;
         A357DisArtUr2 = W357DisArtUr2 ;
         A348DisArtPu2 = W348DisArtPu2 ;
         A358DisArtUr3 = W358DisArtUr3 ;
         A349DisArtPu3 = W349DisArtPu3 ;
         n349DisArtPu3 = false ;
         A388DisPreKgm = W388DisPreKgm ;
         A389DisPreMtr = W389DisPreMtr ;
         A383DisPieLan = W383DisPieLan ;
         A372DisKgmLan = W372DisKgmLan ;
         A373DisMtrLan = W373DisMtrLan ;
         A998DisNMtr = W998DisNMtr ;
         A999DisNMez = W999DisNMez ;
         A1002DisNumTen = W1002DisNumTen ;
         n1002DisNumTen = false ;
         A1157TipConCod = W1157TipConCod ;
         n1157TipConCod = false ;
         A1197DisEncCom = W1197DisEncCom ;
         A1198DisEncAnh = W1198DisEncAnh ;
         A1225DisGraCru = W1225DisGraCru ;
         A1231DisArtAn1 = W1231DisArtAn1 ;
         A1232DisArtAcb = W1232DisArtAcb ;
         A1233DisArtAc2 = W1233DisArtAc2 ;
         A1430DisLoc = W1430DisLoc ;
         A1502DisPart = W1502DisPart ;
         A1907DisRdoN = W1907DisRdoN ;
         A1908DisRdoA = W1908DisRdoA ;
         A1968DisRes = W1968DisRes ;
         n1968DisRes = false ;
         A2267DisNumBas = W2267DisNumBas ;
         n2267DisNumBas = false ;
         A2310DisCliDes = W2310DisCliDes ;
         A2402DisManCod = W2402DisManCod ;
         A2403DisOpeAnt = W2403DisOpeAnt ;
         n2403DisOpeAnt = false ;
         A2742DisCodTex = W2742DisCodTex ;
         n2742DisCodTex = false ;
         A2743DisNumTex1 = W2743DisNumTex1 ;
         A2744DisNumTex2 = W2744DisNumTex2 ;
         n2744DisNumTex2 = false ;
         A2831DisNumLot = W2831DisNumLot ;
         A2832DisKgsLot = W2832DisKgsLot ;
         A2833DisMtrLot = W2833DisMtrLot ;
         A2926DisPla = W2926DisPla ;
         A2835DisPle2 = W2835DisPle2 ;
         A3127DisNumCor = W3127DisNumCor ;
         A3128DisAncSal1 = W3128DisAncSal1 ;
         A3129DisAncSal2 = W3129DisAncSal2 ;
         A3130DisAncSal3 = W3130DisAncSal3 ;
         A3132DisGraCru2 = W3132DisGraCru2 ;
         A3306DisFac = W3306DisFac ;
         A3307DisManCod1 = W3307DisManCod1 ;
         A3308DisManCod2 = W3308DisManCod2 ;
         A3309DisNumTon = W3309DisNumTon ;
         A2009DisTipDis = W2009DisTipDis ;
         n2009DisTipDis = false ;
         A370DisFecCli = W370DisFecCli ;
         A392DisUniMed = W392DisUniMed ;
         A757PriCod = W757PriCod ;
         A11661DisOrdComp = W11661DisOrdComp ;
         /* End Insert */
         AV59Inc_obs = httpContext.getMessage( "Registro creado en DISPOS f(BARCAD)", "") ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV65Pgmname, AV56Usurcod, AV57station, AV59Inc_obs, AV28BarCod, AV60Barcodreo, AV61Barcodpar) ;
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "FinPuttn00", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = puttn00.this.A396EmprCod;
      this.aP1[0] = puttn00.this.A129BarCod;
      this.aP2[0] = puttn00.this.A132BarCodReo;
      this.aP3[0] = puttn00.this.A130BarCodPar;
      this.aP4[0] = puttn00.this.AV56Usurcod;
      this.aP5[0] = puttn00.this.AV57station;
      Application.commitDataStores(context, remoteHandle, pr_default, "puttn00");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV58Diahora = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P01WB3_A4474DisLotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WB3_A4473DisLotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WB3_A4471DisCruEnr = new String[] {""} ;
      P01WB3_A4470DisCruKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WB3_A4469DisCruMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WB3_A4468DisPelAnh = new short[1] ;
      P01WB3_A4348DisUsrCod = new String[] {""} ;
      P01WB3_A4294DisNPzasL = new int[1] ;
      P01WB3_n4294DisNPzasL = new boolean[] {false} ;
      P01WB3_A4293DisNPzas = new int[1] ;
      P01WB3_n4293DisNPzas = new boolean[] {false} ;
      P01WB3_A4014DisTin = new String[] {""} ;
      P01WB3_A4013DisEnv = new byte[1] ;
      P01WB3_n4013DisEnv = new boolean[] {false} ;
      P01WB3_A2525DisComULin = new byte[1] ;
      P01WB3_n2525DisComULin = new boolean[] {false} ;
      P01WB3_A1052DisObs = new String[] {""} ;
      P01WB3_A1051DisNumCol = new short[1] ;
      P01WB3_n1051DisNumCol = new boolean[] {false} ;
      P01WB3_A1014DibInt = new int[1] ;
      P01WB3_n1014DibInt = new boolean[] {false} ;
      P01WB3_A1013DibCli = new String[] {""} ;
      P01WB3_n1013DibCli = new boolean[] {false} ;
      P01WB3_A1031EmpesCod = new String[] {""} ;
      P01WB3_n1031EmpesCod = new boolean[] {false} ;
      P01WB3_A3841DisArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WB3_A3826RetCod = new String[] {""} ;
      P01WB3_n3826RetCod = new boolean[] {false} ;
      P01WB3_A3627DisFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P01WB3_n3627DisFecLan = new boolean[] {false} ;
      P01WB3_A252CliCod = new int[1] ;
      P01WB3_n252CliCod = new boolean[] {false} ;
      P01WB3_A966PartCod = new String[] {""} ;
      P01WB3_n966PartCod = new boolean[] {false} ;
      P01WB3_A1122MaqCodDis = new String[] {""} ;
      P01WB3_n1122MaqCodDis = new boolean[] {false} ;
      P01WB3_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P01WB3_A361DisCod = new int[1] ;
      P01WB3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WB3_A199BarPie1 = new short[1] ;
      P01WB3_A365DisDes = new String[] {""} ;
      P01WB3_A898BarPieNDes = new int[1] ;
      P01WB3_A396EmprCod = new String[] {""} ;
      P01WB3_A129BarCod = new int[1] ;
      P01WB3_A132BarCodReo = new byte[1] ;
      P01WB3_A130BarCodPar = new String[] {""} ;
      P01WB3_A212BarSer = new String[] {""} ;
      P01WB3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P01WB3_A218BarTipCol = new byte[1] ;
      P01WB3_A1234BarNomCli = new String[] {""} ;
      P01WB3_A1235BarNumCli = new int[1] ;
      P01WB3_A143BarDisNum = new String[] {""} ;
      P01WB3_A125BarAncAca1 = new short[1] ;
      P01WB3_A126BarAncAca2 = new short[1] ;
      P01WB3_A1909BarGraAca = new short[1] ;
      P01WB3_A3137BarGraAca2 = new short[1] ;
      P01WB3_A135BarColNom = new String[] {""} ;
      P01WB3_A136BarColNum = new int[1] ;
      P01WB3_A1652BarSerDsc = new String[] {""} ;
      P01WB3_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P01WB3_A228BarUniMed = new String[] {""} ;
      P01WB3_A209BarPri = new String[] {""} ;
      P01WB3_A14555DisPrePz = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WB3_A13987DisArtDsc2 = new String[] {""} ;
      P01WB3_A13986DisIdtx2 = new String[] {""} ;
      P01WB3_n13986DisIdtx2 = new boolean[] {false} ;
      P01WB3_A13768DisTallUlt = new short[1] ;
      P01WB3_A13767DisRdto4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WB3_A13233DisRGB = new long[1] ;
      P01WB3_A13080DisDGUltli = new byte[1] ;
      P01WB3_A13076DisLinPrd = new String[] {""} ;
      P01WB3_n13076DisLinPrd = new boolean[] {false} ;
      P01WB3_A13069DisCanalID = new int[1] ;
      P01WB3_n13069DisCanalID = new boolean[] {false} ;
      P01WB3_A13068DisLineaID = new short[1] ;
      P01WB3_n13068DisLineaID = new boolean[] {false} ;
      P01WB3_A12880DisOEKOTEX = new String[] {""} ;
      P01WB3_n12880DisOEKOTEX = new boolean[] {false} ;
      P01WB3_A12772DisProdID = new String[] {""} ;
      P01WB3_n12772DisProdID = new boolean[] {false} ;
      P01WB3_A12768DisTpEstam = new byte[1] ;
      P01WB3_A12765DisPriorid = new byte[1] ;
      P01WB3_A12328RevenID = new String[] {""} ;
      P01WB3_n12328RevenID = new boolean[] {false} ;
      P01WB3_A11864Nxt_artcli = new String[] {""} ;
      P01WB3_A11863DptoID = new short[1] ;
      P01WB3_n11863DptoID = new boolean[] {false} ;
      P01WB3_A11862DesaID = new short[1] ;
      P01WB3_n11862DesaID = new boolean[] {false} ;
      P01WB3_A11861Nxt_statio = new String[] {""} ;
      P01WB3_A11860CpteId = new short[1] ;
      P01WB3_n11860CpteId = new boolean[] {false} ;
      P01WB3_A11859Nxt_modelo = new String[] {""} ;
      P01WB3_A11734DisCnoEncO = new String[] {""} ;
      P01WB3_A11659MarcaId = new String[] {""} ;
      P01WB3_n11659MarcaId = new boolean[] {false} ;
      P01WB3_A11658DisMemo2 = new String[] {""} ;
      P01WB3_A11657DisMemo1 = new String[] {""} ;
      P01WB3_A3696DisParPar = new String[] {""} ;
      P01WB3_n3696DisParPar = new boolean[] {false} ;
      P01WB3_A3695DisParReo = new byte[1] ;
      P01WB3_n3695DisParReo = new boolean[] {false} ;
      P01WB3_A3694DisParCod = new int[1] ;
      P01WB3_n3694DisParCod = new boolean[] {false} ;
      P01WB3_A7067DisUltNot = new byte[1] ;
      P01WB3_n7067DisUltNot = new boolean[] {false} ;
      P01WB3_A4918DisDibCoDN = new int[1] ;
      P01WB3_n4918DisDibCoDN = new boolean[] {false} ;
      P01WB3_A4879DibColColN = new int[1] ;
      P01WB3_n4879DibColColN = new boolean[] {false} ;
      P01WB3_A4919DisDibCoCN = new int[1] ;
      P01WB3_n4919DisDibCoCN = new boolean[] {false} ;
      P01WB3_A4877DibColCol = new String[] {""} ;
      P01WB3_n4877DibColCol = new boolean[] {false} ;
      P01WB3_A4476DisAcaFor = new int[1] ;
      P01WB3_n4476DisAcaFor = new boolean[] {false} ;
      P01WB3_A4475DisLotMaq = new String[] {""} ;
      P01WB3_n4475DisLotMaq = new boolean[] {false} ;
      P01WB3_A4472DisLotPza = new short[1] ;
      P01WB3_n4472DisLotPza = new boolean[] {false} ;
      P01WB3_A4355DisFecPed = new java.util.Date[] {GXutil.nullDate()} ;
      P01WB3_n4355DisFecPed = new boolean[] {false} ;
      P01WB3_A10887Cod_Idtx = new String[] {""} ;
      P01WB3_n10887Cod_Idtx = new boolean[] {false} ;
      P01WB3_A9787DisItem6 = new String[] {""} ;
      P01WB3_A9786DisItem5 = new String[] {""} ;
      P01WB3_A9774DisItem4 = new String[] {""} ;
      P01WB3_A9773DisItem3 = new String[] {""} ;
      P01WB3_A9772DisItem2 = new String[] {""} ;
      P01WB3_A9771DisItem1 = new String[] {""} ;
      P01WB3_A8887DisFchT = new java.util.Date[] {GXutil.nullDate()} ;
      P01WB3_n8887DisFchT = new boolean[] {false} ;
      P01WB3_A8886DisDest = new String[] {""} ;
      P01WB3_A8885DisFEnt = new String[] {""} ;
      P01WB3_n8885DisFEnt = new boolean[] {false} ;
      P01WB3_A7739DisExp = new String[] {""} ;
      P01WB3_A7738DisMaqEst = new String[] {""} ;
      P01WB3_A7523DisRec = new String[] {""} ;
      P01WB3_A7516DisGraTam = new String[] {""} ;
      P01WB3_n7516DisGraTam = new boolean[] {false} ;
      P01WB3_A7515DisDesCol = new byte[1] ;
      P01WB3_n7515DisDesCol = new boolean[] {false} ;
      P01WB3_A7514DisOrdGra = new byte[1] ;
      P01WB3_A7513DisOrdSep = new byte[1] ;
      P01WB3_A7512DisFacGra = new byte[1] ;
      P01WB3_n7512DisFacGra = new boolean[] {false} ;
      P01WB3_A7511DisFacSep = new byte[1] ;
      P01WB3_n7511DisFacSep = new boolean[] {false} ;
      P01WB3_A7510DisDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WB3_n7510DisDto = new boolean[] {false} ;
      P01WB3_A6548DisRbMaq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01WB3_A6547DisVolMaq = new int[1] ;
      P01WB3_A5405DisAntpT = new String[] {""} ;
      P01WB3_A5366DisAntp = new String[] {""} ;
      P01WB3_A5350DisObsAnc = new String[] {""} ;
      P01WB3_A5349DisObsGrm = new String[] {""} ;
      P01WB3_A5290DisTipCor = new String[] {""} ;
      P01WB3_A5252DisAcc = new String[] {""} ;
      P01WB3_A5032DisEstTip = new String[] {""} ;
      P01WB3_A5031DisCom = new String[] {""} ;
      P01WB3_n5031DisCom = new boolean[] {false} ;
      P01WB3_A5025DisGraCob = new byte[1] ;
      P01WB3_A5024DisTipEst = new byte[1] ;
      P01WB3_A4876DibColDib = new String[] {""} ;
      P01WB3_n4876DibColDib = new boolean[] {false} ;
      P01WB3_A4813DisEncCli = new String[] {""} ;
      P01WB3_A4785DisNroCor = new int[1] ;
      P01WB3_A4720DisDishCod = new String[] {""} ;
      P01WB3_A4617DisHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      P01WB3_n4617DisHorReg = new boolean[] {false} ;
      P01WB3_A4616DisHorEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P01WB3_n4616DisHorEnt = new boolean[] {false} ;
      P01WB3_A4615DisTam = new String[] {""} ;
      P01WB3_A4614DisMdlCod = new String[] {""} ;
      P01WB3_A4479DisAcaMar = new String[] {""} ;
      P01WB3_A4478DisAcaAnh = new short[1] ;
      P01WB3_A4477DisAcaBak = new String[] {""} ;
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
      A966PartCod = "" ;
      A1122MaqCodDis = "" ;
      A371DisFecEnt = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A212BarSer = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A1234BarNomCli = "" ;
      A143BarDisNum = "" ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A228BarUniMed = "" ;
      A209BarPri = "" ;
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
      W396EmprCod = "" ;
      AV61Barcodpar = "" ;
      AV55Disdes = "" ;
      W757PriCod = "" ;
      A757PriCod = "" ;
      W335DisArtCod = "" ;
      A335DisArtCod = "" ;
      W375DisNumUni = DecimalUtil.ZERO ;
      A375DisNumUni = DecimalUtil.ZERO ;
      W392DisUniMed = "" ;
      A392DisUniMed = "" ;
      W369DisFec = GXutil.nullDate() ;
      A369DisFec = GXutil.nullDate() ;
      W1195DisNomCli = "" ;
      A1195DisNomCli = "" ;
      W360DisCliNum = "" ;
      A360DisCliNum = "" ;
      W365DisDes = "" ;
      W362DisColNom = "" ;
      A362DisColNom = "" ;
      W337DisArtDsc = "" ;
      A337DisArtDsc = "" ;
      W366DisEnt = "" ;
      A366DisEnt = "" ;
      W340DisArtMat = "" ;
      A340DisArtMat = "" ;
      W339DisArtLar = "" ;
      A339DisArtLar = "" ;
      W351DisArtSua = "" ;
      A351DisArtSua = "" ;
      W333DisArtAca = "" ;
      A333DisArtAca = "" ;
      W343DisArtPle = "" ;
      A343DisArtPle = "" ;
      W338DisArtEnc = "" ;
      A338DisArtEnc = "" ;
      W336DisArtCor = "" ;
      A336DisArtCor = "" ;
      W341DisArtOpe = "" ;
      A341DisArtOpe = "" ;
      W353DisArtTr1 = "" ;
      A353DisArtTr1 = "" ;
      W354DisArtTr2 = "" ;
      A354DisArtTr2 = "" ;
      W355DisArtTr3 = "" ;
      A355DisArtTr3 = "" ;
      W350DisArtRdt = DecimalUtil.ZERO ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      W356DisArtUr1 = "" ;
      A356DisArtUr1 = "" ;
      W357DisArtUr2 = "" ;
      A357DisArtUr2 = "" ;
      W358DisArtUr3 = "" ;
      A358DisArtUr3 = "" ;
      W388DisPreKgm = DecimalUtil.ZERO ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      W389DisPreMtr = DecimalUtil.ZERO ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      W998DisNMtr = "" ;
      A998DisNMtr = "" ;
      W999DisNMez = "" ;
      A999DisNMez = "" ;
      W1002DisNumTen = "" ;
      A1002DisNumTen = "" ;
      W1197DisEncCom = DecimalUtil.ZERO ;
      A1197DisEncCom = DecimalUtil.ZERO ;
      W1198DisEncAnh = DecimalUtil.ZERO ;
      A1198DisEncAnh = DecimalUtil.ZERO ;
      W1430DisLoc = "" ;
      A1430DisLoc = "" ;
      W1907DisRdoN = DecimalUtil.ZERO ;
      A1907DisRdoN = DecimalUtil.ZERO ;
      W1908DisRdoA = DecimalUtil.ZERO ;
      A1908DisRdoA = DecimalUtil.ZERO ;
      W1968DisRes = "" ;
      A1968DisRes = "" ;
      W2742DisCodTex = "" ;
      A2742DisCodTex = "" ;
      W2832DisKgsLot = DecimalUtil.ZERO ;
      A2832DisKgsLot = DecimalUtil.ZERO ;
      W2833DisMtrLot = DecimalUtil.ZERO ;
      A2833DisMtrLot = DecimalUtil.ZERO ;
      W2926DisPla = "" ;
      A2926DisPla = "" ;
      W2835DisPle2 = "" ;
      A2835DisPle2 = "" ;
      W3306DisFac = "" ;
      A3306DisFac = "" ;
      W3309DisNumTon = "" ;
      A3309DisNumTon = "" ;
      W2009DisTipDis = "" ;
      A2009DisTipDis = "" ;
      W370DisFecCli = GXutil.nullDate() ;
      A370DisFecCli = GXutil.nullDate() ;
      W11661DisOrdComp = "" ;
      A11661DisOrdComp = "" ;
      Gx_emsg = "" ;
      AV59Inc_obs = "" ;
      AV65Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.puttn00__default(),
         new Object[] {
             new Object[] {
            P01WB3_A4474DisLotKgs, P01WB3_A4473DisLotMts, P01WB3_A4471DisCruEnr, P01WB3_A4470DisCruKgs, P01WB3_A4469DisCruMts, P01WB3_A4468DisPelAnh, P01WB3_A4348DisUsrCod, P01WB3_A4294DisNPzasL, P01WB3_n4294DisNPzasL, P01WB3_A4293DisNPzas,
            P01WB3_n4293DisNPzas, P01WB3_A4014DisTin, P01WB3_A4013DisEnv, P01WB3_n4013DisEnv, P01WB3_A2525DisComULin, P01WB3_n2525DisComULin, P01WB3_A1052DisObs, P01WB3_A1051DisNumCol, P01WB3_n1051DisNumCol, P01WB3_A1014DibInt,
            P01WB3_n1014DibInt, P01WB3_A1013DibCli, P01WB3_n1013DibCli, P01WB3_A1031EmpesCod, P01WB3_n1031EmpesCod, P01WB3_A3841DisArtMer, P01WB3_A3826RetCod, P01WB3_n3826RetCod, P01WB3_A3627DisFecLan, P01WB3_n3627DisFecLan,
            P01WB3_A252CliCod, P01WB3_n252CliCod, P01WB3_A966PartCod, P01WB3_n966PartCod, P01WB3_A1122MaqCodDis, P01WB3_n1122MaqCodDis, P01WB3_A371DisFecEnt, P01WB3_A361DisCod, P01WB3_A166BarKgm, P01WB3_A199BarPie1,
            P01WB3_A365DisDes, P01WB3_A898BarPieNDes, P01WB3_A396EmprCod, P01WB3_A129BarCod, P01WB3_A132BarCodReo, P01WB3_A130BarCodPar, P01WB3_A212BarSer, P01WB3_A159BarFecGen, P01WB3_A218BarTipCol, P01WB3_A1234BarNomCli,
            P01WB3_A1235BarNumCli, P01WB3_A143BarDisNum, P01WB3_A125BarAncAca1, P01WB3_A126BarAncAca2, P01WB3_A1909BarGraAca, P01WB3_A3137BarGraAca2, P01WB3_A135BarColNom, P01WB3_A136BarColNum, P01WB3_A1652BarSerDsc, P01WB3_A155BarFecCli,
            P01WB3_A228BarUniMed, P01WB3_A209BarPri, P01WB3_A14555DisPrePz, P01WB3_A13987DisArtDsc2, P01WB3_A13986DisIdtx2, P01WB3_n13986DisIdtx2, P01WB3_A13768DisTallUlt, P01WB3_A13767DisRdto4, P01WB3_A13233DisRGB, P01WB3_A13080DisDGUltli,
            P01WB3_A13076DisLinPrd, P01WB3_n13076DisLinPrd, P01WB3_A13069DisCanalID, P01WB3_n13069DisCanalID, P01WB3_A13068DisLineaID, P01WB3_n13068DisLineaID, P01WB3_A12880DisOEKOTEX, P01WB3_n12880DisOEKOTEX, P01WB3_A12772DisProdID, P01WB3_n12772DisProdID,
            P01WB3_A12768DisTpEstam, P01WB3_A12765DisPriorid, P01WB3_A12328RevenID, P01WB3_n12328RevenID, P01WB3_A11864Nxt_artcli, P01WB3_A11863DptoID, P01WB3_n11863DptoID, P01WB3_A11862DesaID, P01WB3_n11862DesaID, P01WB3_A11861Nxt_statio,
            P01WB3_A11860CpteId, P01WB3_n11860CpteId, P01WB3_A11859Nxt_modelo, P01WB3_A11734DisCnoEncO, P01WB3_A11659MarcaId, P01WB3_n11659MarcaId, P01WB3_A11658DisMemo2, P01WB3_A11657DisMemo1, P01WB3_A3696DisParPar, P01WB3_n3696DisParPar,
            P01WB3_A3695DisParReo, P01WB3_n3695DisParReo, P01WB3_A3694DisParCod, P01WB3_n3694DisParCod, P01WB3_A7067DisUltNot, P01WB3_n7067DisUltNot, P01WB3_A4918DisDibCoDN, P01WB3_n4918DisDibCoDN, P01WB3_A4879DibColColN, P01WB3_n4879DibColColN,
            P01WB3_A4919DisDibCoCN, P01WB3_n4919DisDibCoCN, P01WB3_A4877DibColCol, P01WB3_n4877DibColCol, P01WB3_A4476DisAcaFor, P01WB3_n4476DisAcaFor, P01WB3_A4475DisLotMaq, P01WB3_n4475DisLotMaq, P01WB3_A4472DisLotPza, P01WB3_n4472DisLotPza,
            P01WB3_A4355DisFecPed, P01WB3_n4355DisFecPed, P01WB3_A10887Cod_Idtx, P01WB3_n10887Cod_Idtx, P01WB3_A9787DisItem6, P01WB3_A9786DisItem5, P01WB3_A9774DisItem4, P01WB3_A9773DisItem3, P01WB3_A9772DisItem2, P01WB3_A9771DisItem1,
            P01WB3_A8887DisFchT, P01WB3_n8887DisFchT, P01WB3_A8886DisDest, P01WB3_A8885DisFEnt, P01WB3_n8885DisFEnt, P01WB3_A7739DisExp, P01WB3_A7738DisMaqEst, P01WB3_A7523DisRec, P01WB3_A7516DisGraTam, P01WB3_n7516DisGraTam,
            P01WB3_A7515DisDesCol, P01WB3_n7515DisDesCol, P01WB3_A7514DisOrdGra, P01WB3_A7513DisOrdSep, P01WB3_A7512DisFacGra, P01WB3_n7512DisFacGra, P01WB3_A7511DisFacSep, P01WB3_n7511DisFacSep, P01WB3_A7510DisDto, P01WB3_n7510DisDto,
            P01WB3_A6548DisRbMaq, P01WB3_A6547DisVolMaq, P01WB3_A5405DisAntpT, P01WB3_A5366DisAntp, P01WB3_A5350DisObsAnc, P01WB3_A5349DisObsGrm, P01WB3_A5290DisTipCor, P01WB3_A5252DisAcc, P01WB3_A5032DisEstTip, P01WB3_A5031DisCom,
            P01WB3_n5031DisCom, P01WB3_A5025DisGraCob, P01WB3_A5024DisTipEst, P01WB3_A4876DibColDib, P01WB3_n4876DibColDib, P01WB3_A4813DisEncCli, P01WB3_A4785DisNroCor, P01WB3_A4720DisDishCod, P01WB3_A4617DisHorReg, P01WB3_n4617DisHorReg,
            P01WB3_A4616DisHorEnt, P01WB3_n4616DisHorEnt, P01WB3_A4615DisTam, P01WB3_A4614DisMdlCod, P01WB3_A4479DisAcaMar, P01WB3_A4478DisAcaAnh, P01WB3_A4477DisAcaBak
            }
            , new Object[] {
            }
         }
      );
      AV65Pgmname = "PUTTN00" ;
      /* GeneXus formulas. */
      AV65Pgmname = "PUTTN00" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A4013DisEnv ;
   private byte A2525DisComULin ;
   private byte A218BarTipCol ;
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
   private byte AV60Barcodreo ;
   private byte W390DisTipCol ;
   private byte A390DisTipCol ;
   private byte W367DisEst ;
   private byte A367DisEst ;
   private byte W378DisObsULin ;
   private byte A378DisObsULin ;
   private byte W359DisArtUrg ;
   private byte A359DisArtUrg ;
   private byte W2743DisNumTex1 ;
   private byte A2743DisNumTex1 ;
   private short A4468DisPelAnh ;
   private short A1051DisNumCol ;
   private short A199BarPie1 ;
   private short A125BarAncAca1 ;
   private short A126BarAncAca2 ;
   private short A1909BarGraAca ;
   private short A3137BarGraAca2 ;
   private short A13768DisTallUlt ;
   private short A13068DisLineaID ;
   private short A11863DptoID ;
   private short A11862DesaID ;
   private short A11860CpteId ;
   private short A4472DisLotPza ;
   private short A4478DisAcaAnh ;
   private short W374DisNumPie ;
   private short A374DisNumPie ;
   private short W334DisArtAnh ;
   private short A334DisArtAnh ;
   private short W1231DisArtAn1 ;
   private short A1231DisArtAn1 ;
   private short W1906DisGraAca ;
   private short A1906DisGraAca ;
   private short W3131DisGraAca2 ;
   private short A3131DisGraAca2 ;
   private short W342DisArtPes ;
   private short A342DisArtPes ;
   private short W352DisArtTip ;
   private short A352DisArtTip ;
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
   private short W383DisPieLan ;
   private short A383DisPieLan ;
   private short W372DisKgmLan ;
   private short A372DisKgmLan ;
   private short W373DisMtrLan ;
   private short A373DisMtrLan ;
   private short W1157TipConCod ;
   private short A1157TipConCod ;
   private short W1225DisGraCru ;
   private short A1225DisGraCru ;
   private short W1232DisArtAcb ;
   private short A1232DisArtAcb ;
   private short W1233DisArtAc2 ;
   private short A1233DisArtAc2 ;
   private short W1502DisPart ;
   private short A1502DisPart ;
   private short W2267DisNumBas ;
   private short A2267DisNumBas ;
   private short W2402DisManCod ;
   private short A2402DisManCod ;
   private short W2744DisNumTex2 ;
   private short A2744DisNumTex2 ;
   private short W3127DisNumCor ;
   private short A3127DisNumCor ;
   private short W3128DisAncSal1 ;
   private short A3128DisAncSal1 ;
   private short W3129DisAncSal2 ;
   private short A3129DisAncSal2 ;
   private short W3130DisAncSal3 ;
   private short A3130DisAncSal3 ;
   private short W3132DisGraCru2 ;
   private short A3132DisGraCru2 ;
   private short W3307DisManCod1 ;
   private short A3307DisManCod1 ;
   private short W3308DisManCod2 ;
   private short A3308DisManCod2 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A4294DisNPzasL ;
   private int A4293DisNPzas ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A898BarPieNDes ;
   private int A1235BarNumCli ;
   private int A136BarColNum ;
   private int A13069DisCanalID ;
   private int A3694DisParCod ;
   private int A4918DisDibCoDN ;
   private int A4879DibColColN ;
   private int A4919DisDibCoCN ;
   private int A4476DisAcaFor ;
   private int A6547DisVolMaq ;
   private int A4785DisNroCor ;
   private int A198BarPie ;
   private int AV28BarCod ;
   private int GX_INS34 ;
   private int W361DisCod ;
   private int W252CliCod ;
   private int W1196DisNumCli ;
   private int A1196DisNumCli ;
   private int W363DisColNum ;
   private int A363DisColNum ;
   private int W2310DisCliDes ;
   private int A2310DisCliDes ;
   private int W2403DisOpeAnt ;
   private int A2403DisOpeAnt ;
   private int W2831DisNumLot ;
   private int A2831DisNumLot ;
   private long A13233DisRGB ;
   private java.math.BigDecimal A4474DisLotKgs ;
   private java.math.BigDecimal A4473DisLotMts ;
   private java.math.BigDecimal A4470DisCruKgs ;
   private java.math.BigDecimal A4469DisCruMts ;
   private java.math.BigDecimal A3841DisArtMer ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A14555DisPrePz ;
   private java.math.BigDecimal A13767DisRdto4 ;
   private java.math.BigDecimal A7510DisDto ;
   private java.math.BigDecimal A6548DisRbMaq ;
   private java.math.BigDecimal W375DisNumUni ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal W350DisArtRdt ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal W388DisPreKgm ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal W389DisPreMtr ;
   private java.math.BigDecimal A389DisPreMtr ;
   private java.math.BigDecimal W1197DisEncCom ;
   private java.math.BigDecimal A1197DisEncCom ;
   private java.math.BigDecimal W1198DisEncAnh ;
   private java.math.BigDecimal A1198DisEncAnh ;
   private java.math.BigDecimal W1907DisRdoN ;
   private java.math.BigDecimal A1907DisRdoN ;
   private java.math.BigDecimal W1908DisRdoA ;
   private java.math.BigDecimal A1908DisRdoA ;
   private java.math.BigDecimal W2832DisKgsLot ;
   private java.math.BigDecimal A2832DisKgsLot ;
   private java.math.BigDecimal W2833DisMtrLot ;
   private java.math.BigDecimal A2833DisMtrLot ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV56Usurcod ;
   private String AV57station ;
   private String scmdbuf ;
   private String A4471DisCruEnr ;
   private String A4348DisUsrCod ;
   private String A4014DisTin ;
   private String A1052DisObs ;
   private String A1013DibCli ;
   private String A1031EmpesCod ;
   private String A3826RetCod ;
   private String A966PartCod ;
   private String A1122MaqCodDis ;
   private String A365DisDes ;
   private String A212BarSer ;
   private String A1234BarNomCli ;
   private String A143BarDisNum ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A228BarUniMed ;
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
   private String W396EmprCod ;
   private String AV61Barcodpar ;
   private String AV55Disdes ;
   private String W757PriCod ;
   private String A757PriCod ;
   private String W335DisArtCod ;
   private String A335DisArtCod ;
   private String W392DisUniMed ;
   private String A392DisUniMed ;
   private String W1195DisNomCli ;
   private String A1195DisNomCli ;
   private String W360DisCliNum ;
   private String A360DisCliNum ;
   private String W365DisDes ;
   private String W362DisColNom ;
   private String A362DisColNom ;
   private String W337DisArtDsc ;
   private String A337DisArtDsc ;
   private String W366DisEnt ;
   private String A366DisEnt ;
   private String W340DisArtMat ;
   private String A340DisArtMat ;
   private String W339DisArtLar ;
   private String A339DisArtLar ;
   private String W351DisArtSua ;
   private String A351DisArtSua ;
   private String W333DisArtAca ;
   private String A333DisArtAca ;
   private String W343DisArtPle ;
   private String A343DisArtPle ;
   private String W338DisArtEnc ;
   private String A338DisArtEnc ;
   private String W336DisArtCor ;
   private String A336DisArtCor ;
   private String W341DisArtOpe ;
   private String A341DisArtOpe ;
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
   private String W998DisNMtr ;
   private String A998DisNMtr ;
   private String W999DisNMez ;
   private String A999DisNMez ;
   private String W1002DisNumTen ;
   private String A1002DisNumTen ;
   private String W1430DisLoc ;
   private String A1430DisLoc ;
   private String W1968DisRes ;
   private String A1968DisRes ;
   private String W2742DisCodTex ;
   private String A2742DisCodTex ;
   private String W2926DisPla ;
   private String A2926DisPla ;
   private String W2835DisPle2 ;
   private String A2835DisPle2 ;
   private String W3306DisFac ;
   private String A3306DisFac ;
   private String W3309DisNumTon ;
   private String A3309DisNumTon ;
   private String W2009DisTipDis ;
   private String A2009DisTipDis ;
   private String Gx_emsg ;
   private String AV65Pgmname ;
   private java.util.Date AV58Diahora ;
   private java.util.Date A4617DisHorReg ;
   private java.util.Date A4616DisHorEnt ;
   private java.util.Date A3627DisFecLan ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A4355DisFecPed ;
   private java.util.Date A8887DisFchT ;
   private java.util.Date W369DisFec ;
   private java.util.Date A369DisFec ;
   private java.util.Date W370DisFecCli ;
   private java.util.Date A370DisFecCli ;
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
   private boolean n252CliCod ;
   private boolean n966PartCod ;
   private boolean n1122MaqCodDis ;
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
   private boolean n390DisTipCol ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n349DisArtPu3 ;
   private boolean n1002DisNumTen ;
   private boolean n1157TipConCod ;
   private boolean n1968DisRes ;
   private boolean n2267DisNumBas ;
   private boolean n2403DisOpeAnt ;
   private boolean n2742DisCodTex ;
   private boolean n2744DisNumTex2 ;
   private boolean n2009DisTipDis ;
   private String A13987DisArtDsc2 ;
   private String A11734DisCnoEncO ;
   private String A11658DisMemo2 ;
   private String A11657DisMemo1 ;
   private String W11661DisOrdComp ;
   private String A11661DisOrdComp ;
   private String AV59Inc_obs ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P01WB3_A4474DisLotKgs ;
   private java.math.BigDecimal[] P01WB3_A4473DisLotMts ;
   private String[] P01WB3_A4471DisCruEnr ;
   private java.math.BigDecimal[] P01WB3_A4470DisCruKgs ;
   private java.math.BigDecimal[] P01WB3_A4469DisCruMts ;
   private short[] P01WB3_A4468DisPelAnh ;
   private String[] P01WB3_A4348DisUsrCod ;
   private int[] P01WB3_A4294DisNPzasL ;
   private boolean[] P01WB3_n4294DisNPzasL ;
   private int[] P01WB3_A4293DisNPzas ;
   private boolean[] P01WB3_n4293DisNPzas ;
   private String[] P01WB3_A4014DisTin ;
   private byte[] P01WB3_A4013DisEnv ;
   private boolean[] P01WB3_n4013DisEnv ;
   private byte[] P01WB3_A2525DisComULin ;
   private boolean[] P01WB3_n2525DisComULin ;
   private String[] P01WB3_A1052DisObs ;
   private short[] P01WB3_A1051DisNumCol ;
   private boolean[] P01WB3_n1051DisNumCol ;
   private int[] P01WB3_A1014DibInt ;
   private boolean[] P01WB3_n1014DibInt ;
   private String[] P01WB3_A1013DibCli ;
   private boolean[] P01WB3_n1013DibCli ;
   private String[] P01WB3_A1031EmpesCod ;
   private boolean[] P01WB3_n1031EmpesCod ;
   private java.math.BigDecimal[] P01WB3_A3841DisArtMer ;
   private String[] P01WB3_A3826RetCod ;
   private boolean[] P01WB3_n3826RetCod ;
   private java.util.Date[] P01WB3_A3627DisFecLan ;
   private boolean[] P01WB3_n3627DisFecLan ;
   private int[] P01WB3_A252CliCod ;
   private boolean[] P01WB3_n252CliCod ;
   private String[] P01WB3_A966PartCod ;
   private boolean[] P01WB3_n966PartCod ;
   private String[] P01WB3_A1122MaqCodDis ;
   private boolean[] P01WB3_n1122MaqCodDis ;
   private java.util.Date[] P01WB3_A371DisFecEnt ;
   private int[] P01WB3_A361DisCod ;
   private java.math.BigDecimal[] P01WB3_A166BarKgm ;
   private short[] P01WB3_A199BarPie1 ;
   private String[] P01WB3_A365DisDes ;
   private int[] P01WB3_A898BarPieNDes ;
   private String[] P01WB3_A396EmprCod ;
   private int[] P01WB3_A129BarCod ;
   private byte[] P01WB3_A132BarCodReo ;
   private String[] P01WB3_A130BarCodPar ;
   private String[] P01WB3_A212BarSer ;
   private java.util.Date[] P01WB3_A159BarFecGen ;
   private byte[] P01WB3_A218BarTipCol ;
   private String[] P01WB3_A1234BarNomCli ;
   private int[] P01WB3_A1235BarNumCli ;
   private String[] P01WB3_A143BarDisNum ;
   private short[] P01WB3_A125BarAncAca1 ;
   private short[] P01WB3_A126BarAncAca2 ;
   private short[] P01WB3_A1909BarGraAca ;
   private short[] P01WB3_A3137BarGraAca2 ;
   private String[] P01WB3_A135BarColNom ;
   private int[] P01WB3_A136BarColNum ;
   private String[] P01WB3_A1652BarSerDsc ;
   private java.util.Date[] P01WB3_A155BarFecCli ;
   private String[] P01WB3_A228BarUniMed ;
   private String[] P01WB3_A209BarPri ;
   private java.math.BigDecimal[] P01WB3_A14555DisPrePz ;
   private String[] P01WB3_A13987DisArtDsc2 ;
   private String[] P01WB3_A13986DisIdtx2 ;
   private boolean[] P01WB3_n13986DisIdtx2 ;
   private short[] P01WB3_A13768DisTallUlt ;
   private java.math.BigDecimal[] P01WB3_A13767DisRdto4 ;
   private long[] P01WB3_A13233DisRGB ;
   private byte[] P01WB3_A13080DisDGUltli ;
   private String[] P01WB3_A13076DisLinPrd ;
   private boolean[] P01WB3_n13076DisLinPrd ;
   private int[] P01WB3_A13069DisCanalID ;
   private boolean[] P01WB3_n13069DisCanalID ;
   private short[] P01WB3_A13068DisLineaID ;
   private boolean[] P01WB3_n13068DisLineaID ;
   private String[] P01WB3_A12880DisOEKOTEX ;
   private boolean[] P01WB3_n12880DisOEKOTEX ;
   private String[] P01WB3_A12772DisProdID ;
   private boolean[] P01WB3_n12772DisProdID ;
   private byte[] P01WB3_A12768DisTpEstam ;
   private byte[] P01WB3_A12765DisPriorid ;
   private String[] P01WB3_A12328RevenID ;
   private boolean[] P01WB3_n12328RevenID ;
   private String[] P01WB3_A11864Nxt_artcli ;
   private short[] P01WB3_A11863DptoID ;
   private boolean[] P01WB3_n11863DptoID ;
   private short[] P01WB3_A11862DesaID ;
   private boolean[] P01WB3_n11862DesaID ;
   private String[] P01WB3_A11861Nxt_statio ;
   private short[] P01WB3_A11860CpteId ;
   private boolean[] P01WB3_n11860CpteId ;
   private String[] P01WB3_A11859Nxt_modelo ;
   private String[] P01WB3_A11734DisCnoEncO ;
   private String[] P01WB3_A11659MarcaId ;
   private boolean[] P01WB3_n11659MarcaId ;
   private String[] P01WB3_A11658DisMemo2 ;
   private String[] P01WB3_A11657DisMemo1 ;
   private String[] P01WB3_A3696DisParPar ;
   private boolean[] P01WB3_n3696DisParPar ;
   private byte[] P01WB3_A3695DisParReo ;
   private boolean[] P01WB3_n3695DisParReo ;
   private int[] P01WB3_A3694DisParCod ;
   private boolean[] P01WB3_n3694DisParCod ;
   private byte[] P01WB3_A7067DisUltNot ;
   private boolean[] P01WB3_n7067DisUltNot ;
   private int[] P01WB3_A4918DisDibCoDN ;
   private boolean[] P01WB3_n4918DisDibCoDN ;
   private int[] P01WB3_A4879DibColColN ;
   private boolean[] P01WB3_n4879DibColColN ;
   private int[] P01WB3_A4919DisDibCoCN ;
   private boolean[] P01WB3_n4919DisDibCoCN ;
   private String[] P01WB3_A4877DibColCol ;
   private boolean[] P01WB3_n4877DibColCol ;
   private int[] P01WB3_A4476DisAcaFor ;
   private boolean[] P01WB3_n4476DisAcaFor ;
   private String[] P01WB3_A4475DisLotMaq ;
   private boolean[] P01WB3_n4475DisLotMaq ;
   private short[] P01WB3_A4472DisLotPza ;
   private boolean[] P01WB3_n4472DisLotPza ;
   private java.util.Date[] P01WB3_A4355DisFecPed ;
   private boolean[] P01WB3_n4355DisFecPed ;
   private String[] P01WB3_A10887Cod_Idtx ;
   private boolean[] P01WB3_n10887Cod_Idtx ;
   private String[] P01WB3_A9787DisItem6 ;
   private String[] P01WB3_A9786DisItem5 ;
   private String[] P01WB3_A9774DisItem4 ;
   private String[] P01WB3_A9773DisItem3 ;
   private String[] P01WB3_A9772DisItem2 ;
   private String[] P01WB3_A9771DisItem1 ;
   private java.util.Date[] P01WB3_A8887DisFchT ;
   private boolean[] P01WB3_n8887DisFchT ;
   private String[] P01WB3_A8886DisDest ;
   private String[] P01WB3_A8885DisFEnt ;
   private boolean[] P01WB3_n8885DisFEnt ;
   private String[] P01WB3_A7739DisExp ;
   private String[] P01WB3_A7738DisMaqEst ;
   private String[] P01WB3_A7523DisRec ;
   private String[] P01WB3_A7516DisGraTam ;
   private boolean[] P01WB3_n7516DisGraTam ;
   private byte[] P01WB3_A7515DisDesCol ;
   private boolean[] P01WB3_n7515DisDesCol ;
   private byte[] P01WB3_A7514DisOrdGra ;
   private byte[] P01WB3_A7513DisOrdSep ;
   private byte[] P01WB3_A7512DisFacGra ;
   private boolean[] P01WB3_n7512DisFacGra ;
   private byte[] P01WB3_A7511DisFacSep ;
   private boolean[] P01WB3_n7511DisFacSep ;
   private java.math.BigDecimal[] P01WB3_A7510DisDto ;
   private boolean[] P01WB3_n7510DisDto ;
   private java.math.BigDecimal[] P01WB3_A6548DisRbMaq ;
   private int[] P01WB3_A6547DisVolMaq ;
   private String[] P01WB3_A5405DisAntpT ;
   private String[] P01WB3_A5366DisAntp ;
   private String[] P01WB3_A5350DisObsAnc ;
   private String[] P01WB3_A5349DisObsGrm ;
   private String[] P01WB3_A5290DisTipCor ;
   private String[] P01WB3_A5252DisAcc ;
   private String[] P01WB3_A5032DisEstTip ;
   private String[] P01WB3_A5031DisCom ;
   private boolean[] P01WB3_n5031DisCom ;
   private byte[] P01WB3_A5025DisGraCob ;
   private byte[] P01WB3_A5024DisTipEst ;
   private String[] P01WB3_A4876DibColDib ;
   private boolean[] P01WB3_n4876DibColDib ;
   private String[] P01WB3_A4813DisEncCli ;
   private int[] P01WB3_A4785DisNroCor ;
   private String[] P01WB3_A4720DisDishCod ;
   private java.util.Date[] P01WB3_A4617DisHorReg ;
   private boolean[] P01WB3_n4617DisHorReg ;
   private java.util.Date[] P01WB3_A4616DisHorEnt ;
   private boolean[] P01WB3_n4616DisHorEnt ;
   private String[] P01WB3_A4615DisTam ;
   private String[] P01WB3_A4614DisMdlCod ;
   private String[] P01WB3_A4479DisAcaMar ;
   private short[] P01WB3_A4478DisAcaAnh ;
   private String[] P01WB3_A4477DisAcaBak ;
}

final  class puttn00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01WB3", "SELECT T2.DisLotKgs, T2.DisLotMts, T2.DisCruEnr, T2.DisCruKgs, T2.DisCruMts, T2.DisPelAnh, T2.DisUsrCod, T2.DisNPzasL, T2.DisNPzas, T2.DisTin, T2.DisEnv, T2.DisComULin, T2.DisObs, T2.DisNumCol, T2.DibInt, T2.DibCli, T2.EmpesCod, T2.DisArtMer, T2.RetCod, T2.DisFecLan, T1.CliCod, T2.PartCod, T2.MaqCodDis, T2.DisFecEnt, T1.DisCod, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarSer, T1.BarFecGen, T1.BarTipCol, T1.BarNomCli, T1.BarNumCli, T1.BarDisNum, T1.BarAncAca1, T1.BarAncAca2, T1.BarGraAca, T1.BarGraAca2, T1.BarColNom, T1.BarColNum, T1.BarSerDsc, T1.BarFecCli, T1.BarUniMed, T1.BarPri, T2.DisPrePz, T2.DisArtDsc2, T2.DisIdtx2, T2.DisTallUlt, T2.DisRdto4, T2.DisRGB, T2.DisDGUltli, T2.DisLinPrd, T2.DisCanalID, T2.DisLineaID, T2.DisOEKOTEX, T2.DisProdID, T2.DisTpEstam, T2.DisPriorid, T2.RevenID, T2.Nxt_artcli, T2.DptoID, T2.DesaID, T2.Nxt_statio, T2.CpteId, T2.Nxt_modelo, T2.DisCnoEncO, T2.MarcaId, T2.DisMemo2, T2.DisMemo1, T2.DisParPar, T2.DisParReo, T2.DisParCod, T2.DisUltNot, T2.DisDibCoDN, T2.DibColColN, T2.DisDibCoCN, T2.DibColCol, T2.DisAcaFor, T2.DisLotMaq, T2.DisLotPza, T2.DisFecPed, T2.Cod_Idtx, T2.DisItem6, T2.DisItem5, T2.DisItem4, T2.DisItem3, T2.DisItem2, T2.DisItem1, T2.DisFchT, T2.DisDest, T2.DisFEnt, T2.DisExp, T2.DisMaqEst, T2.DisRec, T2.DisGraTam, T2.DisDesCol, T2.DisOrdGra, T2.DisOrdSep, T2.DisFacGra, T2.DisFacSep, T2.DisDto, T2.DisRbMaq, T2.DisVolMaq, T2.DisAntpT, T2.DisAntp, T2.DisObsAnc, T2.DisObsGrm, T2.DisTipCor, T2.DisAcc, T2.DisEstTip, T2.DisCom, T2.DisGraCob, T2.DisTipEst, T2.DibColDib, T2.DisEncCli, T2.DisNroCor, T2.DisDishCod, T2.DisHorReg, T2.DisHorEnt, T2.DisTam, T2.DisMdlCod, T2.DisAcaMar, T2.DisAcaAnh, T2.DisAcaBak FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WB4", "INSERT INTO TXPDISPOS(EmprCod, DisCod, DisDes, DisArtCod, DisNumPie, DisNumUni, DisUniMed, DisArtPes, PriCod, DisCliNum, DisFecCli, DisFec, DisFecEnt, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisEnt, DisObsULin, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, CliCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((short[]) buf[17])[0] = rslt.getShort(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(18,2);
               ((String[]) buf[26])[0] = rslt.getString(19, 4);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(21);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(23, 6);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDate(24);
               ((int[]) buf[37])[0] = rslt.getInt(25);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(26,2);
               ((short[]) buf[39])[0] = rslt.getShort(27);
               ((String[]) buf[40])[0] = rslt.getString(28, 1);
               ((int[]) buf[41])[0] = rslt.getInt(29);
               ((String[]) buf[42])[0] = rslt.getString(30, 3);
               ((int[]) buf[43])[0] = rslt.getInt(31);
               ((byte[]) buf[44])[0] = rslt.getByte(32);
               ((String[]) buf[45])[0] = rslt.getString(33, 1);
               ((String[]) buf[46])[0] = rslt.getString(34, 16);
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDate(35);
               ((byte[]) buf[48])[0] = rslt.getByte(36);
               ((String[]) buf[49])[0] = rslt.getString(37, 13);
               ((int[]) buf[50])[0] = rslt.getInt(38);
               ((String[]) buf[51])[0] = rslt.getString(39, 8);
               ((short[]) buf[52])[0] = rslt.getShort(40);
               ((short[]) buf[53])[0] = rslt.getShort(41);
               ((short[]) buf[54])[0] = rslt.getShort(42);
               ((short[]) buf[55])[0] = rslt.getShort(43);
               ((String[]) buf[56])[0] = rslt.getString(44, 13);
               ((int[]) buf[57])[0] = rslt.getInt(45);
               ((String[]) buf[58])[0] = rslt.getString(46, 26);
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(47);
               ((String[]) buf[60])[0] = rslt.getString(48, 1);
               ((String[]) buf[61])[0] = rslt.getString(49, 1);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(50,2);
               ((String[]) buf[63])[0] = rslt.getVarchar(51);
               ((String[]) buf[64])[0] = rslt.getString(52, 4);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(53);
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(54,40);
               ((long[]) buf[68])[0] = rslt.getLong(55);
               ((byte[]) buf[69])[0] = rslt.getByte(56);
               ((String[]) buf[70])[0] = rslt.getString(57, 4);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((int[]) buf[72])[0] = rslt.getInt(58);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(59);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(60, 1);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(61, 6);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((byte[]) buf[80])[0] = rslt.getByte(62);
               ((byte[]) buf[81])[0] = rslt.getByte(63);
               ((String[]) buf[82])[0] = rslt.getString(64, 10);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(65, 30);
               ((short[]) buf[85])[0] = rslt.getShort(66);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((short[]) buf[87])[0] = rslt.getShort(67);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(68, 4);
               ((short[]) buf[90])[0] = rslt.getShort(69);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(70, 30);
               ((String[]) buf[93])[0] = rslt.getVarchar(71);
               ((String[]) buf[94])[0] = rslt.getString(72, 6);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getVarchar(73);
               ((String[]) buf[97])[0] = rslt.getVarchar(74);
               ((String[]) buf[98])[0] = rslt.getString(75, 1);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((byte[]) buf[100])[0] = rslt.getByte(76);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((int[]) buf[102])[0] = rslt.getInt(77);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((byte[]) buf[104])[0] = rslt.getByte(78);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((int[]) buf[106])[0] = rslt.getInt(79);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((int[]) buf[108])[0] = rslt.getInt(80);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((int[]) buf[110])[0] = rslt.getInt(81);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getString(82, 12);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((int[]) buf[114])[0] = rslt.getInt(83);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getString(84, 6);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((short[]) buf[118])[0] = rslt.getShort(85);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[120])[0] = rslt.getGXDate(86);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getString(87, 4);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getString(88, 20);
               ((String[]) buf[125])[0] = rslt.getString(89, 20);
               ((String[]) buf[126])[0] = rslt.getString(90, 20);
               ((String[]) buf[127])[0] = rslt.getString(91, 20);
               ((String[]) buf[128])[0] = rslt.getString(92, 20);
               ((String[]) buf[129])[0] = rslt.getString(93, 20);
               ((java.util.Date[]) buf[130])[0] = rslt.getGXDate(94);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getString(95, 30);
               ((String[]) buf[133])[0] = rslt.getString(96, 30);
               ((boolean[]) buf[134])[0] = rslt.wasNull();
               ((String[]) buf[135])[0] = rslt.getString(97, 1);
               ((String[]) buf[136])[0] = rslt.getString(98, 6);
               ((String[]) buf[137])[0] = rslt.getString(99, 30);
               ((String[]) buf[138])[0] = rslt.getString(100, 1);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((byte[]) buf[140])[0] = rslt.getByte(101);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((byte[]) buf[142])[0] = rslt.getByte(102);
               ((byte[]) buf[143])[0] = rslt.getByte(103);
               ((byte[]) buf[144])[0] = rslt.getByte(104);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((byte[]) buf[146])[0] = rslt.getByte(105);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[148])[0] = rslt.getBigDecimal(106,2);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[150])[0] = rslt.getBigDecimal(107,2);
               ((int[]) buf[151])[0] = rslt.getInt(108);
               ((String[]) buf[152])[0] = rslt.getString(109, 1);
               ((String[]) buf[153])[0] = rslt.getString(110, 1);
               ((String[]) buf[154])[0] = rslt.getString(111, 20);
               ((String[]) buf[155])[0] = rslt.getString(112, 20);
               ((String[]) buf[156])[0] = rslt.getString(113, 2);
               ((String[]) buf[157])[0] = rslt.getString(114, 1);
               ((String[]) buf[158])[0] = rslt.getString(115, 1);
               ((String[]) buf[159])[0] = rslt.getString(116, 12);
               ((boolean[]) buf[160])[0] = rslt.wasNull();
               ((byte[]) buf[161])[0] = rslt.getByte(117);
               ((byte[]) buf[162])[0] = rslt.getByte(118);
               ((String[]) buf[163])[0] = rslt.getString(119, 30);
               ((boolean[]) buf[164])[0] = rslt.wasNull();
               ((String[]) buf[165])[0] = rslt.getString(120, 20);
               ((int[]) buf[166])[0] = rslt.getInt(121);
               ((String[]) buf[167])[0] = rslt.getString(122, 12);
               ((java.util.Date[]) buf[168])[0] = GXutil.resetDate(rslt.getGXDateTime(123));
               ((boolean[]) buf[169])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[170])[0] = GXutil.resetDate(rslt.getGXDateTime(124));
               ((boolean[]) buf[171])[0] = rslt.wasNull();
               ((String[]) buf[172])[0] = rslt.getString(125, 4);
               ((String[]) buf[173])[0] = rslt.getString(126, 13);
               ((String[]) buf[174])[0] = rslt.getString(127, 1);
               ((short[]) buf[175])[0] = rslt.getShort(128);
               ((String[]) buf[176])[0] = rslt.getString(129, 1);
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
      }
   }

}

