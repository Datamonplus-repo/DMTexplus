package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmd2100 extends GXProcedure
{
   public pmd2100( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmd2100.class ), "" );
   }

   public pmd2100( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pmd2100.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pmd2100.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmd2100.this.AV8Clicod = aP1[0];
      this.aP1 = aP1;
      pmd2100.this.AV9Artcod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03H92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10045CliAct = P03H92_A10045CliAct[0] ;
         A252CliCod = P03H92_A252CliCod[0] ;
         AV10Clicodd = A252CliCod ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = AV10Clicodd ;
         GXv_char3[0] = AV9Artcod ;
         new app.pmd2101(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3) ;
         pmd2100.this.A396EmprCod = GXv_char1[0] ;
         pmd2100.this.AV10Clicodd = GXv_int2[0] ;
         pmd2100.this.AV9Artcod = GXv_char3[0] ;
         /* Execute user subroutine: 'CREO' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CREO' Routine */
      returnInSub = false ;
      /* Using cursor P03H93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8Clicod), AV9Artcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A3072ArtObsLon = P03H93_A3072ArtObsLon[0] ;
         n3072ArtObsLon = P03H93_n3072ArtObsLon[0] ;
         A1078ArtPrMEst = P03H93_A1078ArtPrMEst[0] ;
         n1078ArtPrMEst = P03H93_n1078ArtPrMEst[0] ;
         A3683ArtFecCre = P03H93_A3683ArtFecCre[0] ;
         n3683ArtFecCre = P03H93_n3683ArtFecCre[0] ;
         A3682ArtAnu = P03H93_A3682ArtAnu[0] ;
         n3682ArtAnu = P03H93_n3682ArtAnu[0] ;
         A3318ArtPreCap = P03H93_A3318ArtPreCap[0] ;
         n3318ArtPreCap = P03H93_n3318ArtPreCap[0] ;
         A3126ArtGraCru2 = P03H93_A3126ArtGraCru2[0] ;
         n3126ArtGraCru2 = P03H93_n3126ArtGraCru2[0] ;
         A3125ArtGraAca2 = P03H93_A3125ArtGraAca2[0] ;
         n3125ArtGraAca2 = P03H93_n3125ArtGraAca2[0] ;
         A3124ArtAncSal3 = P03H93_A3124ArtAncSal3[0] ;
         n3124ArtAncSal3 = P03H93_n3124ArtAncSal3[0] ;
         A3123ArtAncSal2 = P03H93_A3123ArtAncSal2[0] ;
         n3123ArtAncSal2 = P03H93_n3123ArtAncSal2[0] ;
         A3122ArtAncSal1 = P03H93_A3122ArtAncSal1[0] ;
         n3122ArtAncSal1 = P03H93_n3122ArtAncSal1[0] ;
         A3121ArtNumCor = P03H93_A3121ArtNumCor[0] ;
         n3121ArtNumCor = P03H93_n3121ArtNumCor[0] ;
         A2834ArtPle2 = P03H93_A2834ArtPle2[0] ;
         n2834ArtPle2 = P03H93_n2834ArtPle2[0] ;
         A3029ArtCosBase = P03H93_A3029ArtCosBase[0] ;
         n3029ArtCosBase = P03H93_n3029ArtCosBase[0] ;
         A2791ArtFacAbs = P03H93_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = P03H93_n2791ArtFacAbs[0] ;
         A2707NumTexCod = P03H93_A2707NumTexCod[0] ;
         n2707NumTexCod = P03H93_n2707NumTexCod[0] ;
         A2751ArtNumTex2 = P03H93_A2751ArtNumTex2[0] ;
         n2751ArtNumTex2 = P03H93_n2751ArtNumTex2[0] ;
         A2750ArtNumTex1 = P03H93_A2750ArtNumTex1[0] ;
         n2750ArtNumTex1 = P03H93_n2750ArtNumTex1[0] ;
         A1905ArtRdoA = P03H93_A1905ArtRdoA[0] ;
         n1905ArtRdoA = P03H93_n1905ArtRdoA[0] ;
         A1904ArtRdoN = P03H93_A1904ArtRdoN[0] ;
         n1904ArtRdoN = P03H93_n1904ArtRdoN[0] ;
         A1903ArtGraAca = P03H93_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P03H93_n1903ArtGraAca[0] ;
         A1230ArtEncAnh = P03H93_A1230ArtEncAnh[0] ;
         n1230ArtEncAnh = P03H93_n1230ArtEncAnh[0] ;
         A1229ArtEncCom = P03H93_A1229ArtEncCom[0] ;
         n1229ArtEncCom = P03H93_n1229ArtEncCom[0] ;
         A1148ArtPml = P03H93_A1148ArtPml[0] ;
         n1148ArtPml = P03H93_n1148ArtPml[0] ;
         A967ArtNMtr = P03H93_A967ArtNMtr[0] ;
         n967ArtNMtr = P03H93_n967ArtNMtr[0] ;
         A845ULinRec = P03H93_A845ULinRec[0] ;
         n845ULinRec = P03H93_n845ULinRec[0] ;
         A91ArtPreDef = P03H93_A91ArtPreDef[0] ;
         n91ArtPreDef = P03H93_n91ArtPreDef[0] ;
         A93ArtPreMtr = P03H93_A93ArtPreMtr[0] ;
         n93ArtPreMtr = P03H93_n93ArtPreMtr[0] ;
         A92ArtPreKgm = P03H93_A92ArtPreKgm[0] ;
         n92ArtPreKgm = P03H93_n92ArtPreKgm[0] ;
         A90ArtObsFac = P03H93_A90ArtObsFac[0] ;
         n90ArtObsFac = P03H93_n90ArtObsFac[0] ;
         A89ArtObs = P03H93_A89ArtObs[0] ;
         n89ArtObs = P03H93_n89ArtObs[0] ;
         A116ArtUrdP3 = P03H93_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = P03H93_n116ArtUrdP3[0] ;
         A115ArtUrdP2 = P03H93_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = P03H93_n115ArtUrdP2[0] ;
         A114ArtUrdP1 = P03H93_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P03H93_n114ArtUrdP1[0] ;
         A113ArtUrd3 = P03H93_A113ArtUrd3[0] ;
         n113ArtUrd3 = P03H93_n113ArtUrd3[0] ;
         A112ArtUrd2 = P03H93_A112ArtUrd2[0] ;
         n112ArtUrd2 = P03H93_n112ArtUrd2[0] ;
         A111ArtUrd1 = P03H93_A111ArtUrd1[0] ;
         n111ArtUrd1 = P03H93_n111ArtUrd1[0] ;
         A110ArtTraP3 = P03H93_A110ArtTraP3[0] ;
         n110ArtTraP3 = P03H93_n110ArtTraP3[0] ;
         A109ArtTraP2 = P03H93_A109ArtTraP2[0] ;
         n109ArtTraP2 = P03H93_n109ArtTraP2[0] ;
         A108ArtTraP1 = P03H93_A108ArtTraP1[0] ;
         n108ArtTraP1 = P03H93_n108ArtTraP1[0] ;
         A107ArtTra3 = P03H93_A107ArtTra3[0] ;
         n107ArtTra3 = P03H93_n107ArtTra3[0] ;
         A106ArtTra2 = P03H93_A106ArtTra2[0] ;
         n106ArtTra2 = P03H93_n106ArtTra2[0] ;
         A105ArtTra1 = P03H93_A105ArtTra1[0] ;
         n105ArtTra1 = P03H93_n105ArtTra1[0] ;
         A88ArtMer = P03H93_A88ArtMer[0] ;
         n88ArtMer = P03H93_n88ArtMer[0] ;
         A117ArtUrg = P03H93_A117ArtUrg[0] ;
         n117ArtUrg = P03H93_n117ArtUrg[0] ;
         A73ArtEti = P03H93_A73ArtEti[0] ;
         n73ArtEti = P03H93_n73ArtEti[0] ;
         A64ArtAcaQui = P03H93_A64ArtAcaQui[0] ;
         n64ArtAcaQui = P03H93_n64ArtAcaQui[0] ;
         A96ArtSua = P03H93_A96ArtSua[0] ;
         n96ArtSua = P03H93_n96ArtSua[0] ;
         A70ArtEncOri = P03H93_A70ArtEncOri[0] ;
         n70ArtEncOri = P03H93_n70ArtEncOri[0] ;
         A66ArtCorOri = P03H93_A66ArtCorOri[0] ;
         n66ArtCorOri = P03H93_n66ArtCorOri[0] ;
         A100ArtTipLar = P03H93_A100ArtTipLar[0] ;
         n100ArtTipLar = P03H93_n100ArtTipLar[0] ;
         A101ArtTipPle = P03H93_A101ArtTipPle[0] ;
         n101ArtTipPle = P03H93_n101ArtTipPle[0] ;
         A95ArtRen = P03H93_A95ArtRen[0] ;
         n95ArtRen = P03H93_n95ArtRen[0] ;
         A62ArtAcaMax = P03H93_A62ArtAcaMax[0] ;
         n62ArtAcaMax = P03H93_n62ArtAcaMax[0] ;
         A63ArtAcaMin = P03H93_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P03H93_n63ArtAcaMin[0] ;
         A67ArtCruMax = P03H93_A67ArtCruMax[0] ;
         n67ArtCruMax = P03H93_n67ArtCruMax[0] ;
         A68ArtCruMin = P03H93_A68ArtCruMin[0] ;
         n68ArtCruMin = P03H93_n68ArtCruMin[0] ;
         A78ArtGraCru = P03H93_A78ArtGraCru[0] ;
         n78ArtGraCru = P03H93_n78ArtGraCru[0] ;
         A69ArtDsc = P03H93_A69ArtDsc[0] ;
         n69ArtDsc = P03H93_n69ArtDsc[0] ;
         A829TipArtCod = P03H93_A829TipArtCod[0] ;
         A87ArtMat = P03H93_A87ArtMat[0] ;
         n87ArtMat = P03H93_n87ArtMat[0] ;
         A65ArtCod = P03H93_A65ArtCod[0] ;
         A252CliCod = P03H93_A252CliCod[0] ;
         A14295ArtActivo = P03H93_A14295ArtActivo[0] ;
         A14103ArtPrepp = P03H93_A14103ArtPrepp[0] ;
         n14103ArtPrepp = P03H93_n14103ArtPrepp[0] ;
         A14102ArtKgspp = P03H93_A14102ArtKgspp[0] ;
         n14102ArtKgspp = P03H93_n14102ArtKgspp[0] ;
         A14101ArtgrComp = P03H93_A14101ArtgrComp[0] ;
         n14101ArtgrComp = P03H93_n14101ArtgrComp[0] ;
         A14100Artdsc2 = P03H93_A14100Artdsc2[0] ;
         n14100Artdsc2 = P03H93_n14100Artdsc2[0] ;
         A14099ArtRdto4 = P03H93_A14099ArtRdto4[0] ;
         n14099ArtRdto4 = P03H93_n14099ArtRdto4[0] ;
         A12886ArtObsOtra = P03H93_A12886ArtObsOtra[0] ;
         n12886ArtObsOtra = P03H93_n12886ArtObsOtra[0] ;
         A12699ArtEncAnc = P03H93_A12699ArtEncAnc[0] ;
         n12699ArtEncAnc = P03H93_n12699ArtEncAnc[0] ;
         A12698ArtEncLarg = P03H93_A12698ArtEncLarg[0] ;
         n12698ArtEncLarg = P03H93_n12698ArtEncLarg[0] ;
         A12697ArtRdoCru = P03H93_A12697ArtRdoCru[0] ;
         n12697ArtRdoCru = P03H93_n12697ArtRdoCru[0] ;
         A12696ArtElgLar = P03H93_A12696ArtElgLar[0] ;
         n12696ArtElgLar = P03H93_n12696ArtElgLar[0] ;
         A12695ArtElgAnc = P03H93_A12695ArtElgAnc[0] ;
         n12695ArtElgAnc = P03H93_n12695ArtElgAnc[0] ;
         A12366ArtKgMn = P03H93_A12366ArtKgMn[0] ;
         n12366ArtKgMn = P03H93_n12366ArtKgMn[0] ;
         A12365ArtTRabs = P03H93_A12365ArtTRabs[0] ;
         n12365ArtTRabs = P03H93_n12365ArtTRabs[0] ;
         A12364ArtMT = P03H93_A12364ArtMT[0] ;
         n12364ArtMT = P03H93_n12364ArtMT[0] ;
         A12353Mat_ObsG = P03H93_A12353Mat_ObsG[0] ;
         n12353Mat_ObsG = P03H93_n12353Mat_ObsG[0] ;
         A12199ArtPreUnd = P03H93_A12199ArtPreUnd[0] ;
         n12199ArtPreUnd = P03H93_n12199ArtPreUnd[0] ;
         A1581ArtNumTip = P03H93_A1581ArtNumTip[0] ;
         n1581ArtNumTip = P03H93_n1581ArtNumTip[0] ;
         A4115ArtDefEst = P03H93_A4115ArtDefEst[0] ;
         n4115ArtDefEst = P03H93_n4115ArtDefEst[0] ;
         A4114ArtPreEst = P03H93_A4114ArtPreEst[0] ;
         n4114ArtPreEst = P03H93_n4114ArtPreEst[0] ;
         A11627ArtFacUti = P03H93_A11627ArtFacUti[0] ;
         n11627ArtFacUti = P03H93_n11627ArtFacUti[0] ;
         A10834ArtPreObs = P03H93_A10834ArtPreObs[0] ;
         n10834ArtPreObs = P03H93_n10834ArtPreObs[0] ;
         A10833ArtRdoC = P03H93_A10833ArtRdoC[0] ;
         n10833ArtRdoC = P03H93_n10833ArtRdoC[0] ;
         A10832ArtGrm2C = P03H93_A10832ArtGrm2C[0] ;
         n10832ArtGrm2C = P03H93_n10832ArtGrm2C[0] ;
         A10831ArtAncC = P03H93_A10831ArtAncC[0] ;
         n10831ArtAncC = P03H93_n10831ArtAncC[0] ;
         A10805ArtPasad = P03H93_A10805ArtPasad[0] ;
         n10805ArtPasad = P03H93_n10805ArtPasad[0] ;
         A10804ArtHilos = P03H93_A10804ArtHilos[0] ;
         n10804ArtHilos = P03H93_n10804ArtHilos[0] ;
         A10558CapFecA = P03H93_A10558CapFecA[0] ;
         n10558CapFecA = P03H93_n10558CapFecA[0] ;
         A10557CapUsuA = P03H93_A10557CapUsuA[0] ;
         n10557CapUsuA = P03H93_n10557CapUsuA[0] ;
         A10562Mat_FecM = P03H93_A10562Mat_FecM[0] ;
         n10562Mat_FecM = P03H93_n10562Mat_FecM[0] ;
         A10561Mat_UsuM = P03H93_A10561Mat_UsuM[0] ;
         n10561Mat_UsuM = P03H93_n10561Mat_UsuM[0] ;
         A10560CapFecM = P03H93_A10560CapFecM[0] ;
         n10560CapFecM = P03H93_n10560CapFecM[0] ;
         A10559CapUsuM = P03H93_A10559CapUsuM[0] ;
         n10559CapUsuM = P03H93_n10559CapUsuM[0] ;
         A10379Art_Cd = P03H93_A10379Art_Cd[0] ;
         n10379Art_Cd = P03H93_n10379Art_Cd[0] ;
         A10030ArtTh = P03H93_A10030ArtTh[0] ;
         n10030ArtTh = P03H93_n10030ArtTh[0] ;
         A10029ArtPgd = P03H93_A10029ArtPgd[0] ;
         n10029ArtPgd = P03H93_n10029ArtPgd[0] ;
         A10028ArtPlatina = P03H93_A10028ArtPlatina[0] ;
         n10028ArtPlatina = P03H93_n10028ArtPlatina[0] ;
         A10027ArtGalga = P03H93_A10027ArtGalga[0] ;
         n10027ArtGalga = P03H93_n10027ArtGalga[0] ;
         A4980ArtCdb = P03H93_A4980ArtCdb[0] ;
         n4980ArtCdb = P03H93_n4980ArtCdb[0] ;
         A398ArtObsAnc = P03H93_A398ArtObsAnc[0] ;
         n398ArtObsAnc = P03H93_n398ArtObsAnc[0] ;
         A397ArtObsGrm = P03H93_A397ArtObsGrm[0] ;
         n397ArtObsGrm = P03H93_n397ArtObsGrm[0] ;
         A9904ArtAb = P03H93_A9904ArtAb[0] ;
         n9904ArtAb = P03H93_n9904ArtAb[0] ;
         A9903ArtVbn = P03H93_A9903ArtVbn[0] ;
         n9903ArtVbn = P03H93_n9903ArtVbn[0] ;
         A9902ArtVbd = P03H93_A9902ArtVbd[0] ;
         n9902ArtVbd = P03H93_n9902ArtVbd[0] ;
         A9875ArtNProg = P03H93_A9875ArtNProg[0] ;
         n9875ArtNProg = P03H93_n9875ArtNProg[0] ;
         A9801ArtFabsT = P03H93_A9801ArtFabsT[0] ;
         n9801ArtFabsT = P03H93_n9801ArtFabsT[0] ;
         A9730ArtFabsH = P03H93_A9730ArtFabsH[0] ;
         n9730ArtFabsH = P03H93_n9730ArtFabsH[0] ;
         A8862CapKgs10 = P03H93_A8862CapKgs10[0] ;
         n8862CapKgs10 = P03H93_n8862CapKgs10[0] ;
         A8861CapKgs9 = P03H93_A8861CapKgs9[0] ;
         n8861CapKgs9 = P03H93_n8861CapKgs9[0] ;
         A8860CapKgs8 = P03H93_A8860CapKgs8[0] ;
         n8860CapKgs8 = P03H93_n8860CapKgs8[0] ;
         A8859CapKgs7 = P03H93_A8859CapKgs7[0] ;
         n8859CapKgs7 = P03H93_n8859CapKgs7[0] ;
         A8858CapKgs6 = P03H93_A8858CapKgs6[0] ;
         n8858CapKgs6 = P03H93_n8858CapKgs6[0] ;
         A8857CapKgs5 = P03H93_A8857CapKgs5[0] ;
         n8857CapKgs5 = P03H93_n8857CapKgs5[0] ;
         A8856CapKgs4 = P03H93_A8856CapKgs4[0] ;
         n8856CapKgs4 = P03H93_n8856CapKgs4[0] ;
         A8855CapKgs3 = P03H93_A8855CapKgs3[0] ;
         n8855CapKgs3 = P03H93_n8855CapKgs3[0] ;
         A8854CapKgs2 = P03H93_A8854CapKgs2[0] ;
         n8854CapKgs2 = P03H93_n8854CapKgs2[0] ;
         A8853CapKgs1 = P03H93_A8853CapKgs1[0] ;
         n8853CapKgs1 = P03H93_n8853CapKgs1[0] ;
         A7948ArtCla = P03H93_A7948ArtCla[0] ;
         n7948ArtCla = P03H93_n7948ArtCla[0] ;
         A7779ArtBlo = P03H93_A7779ArtBlo[0] ;
         n7779ArtBlo = P03H93_n7779ArtBlo[0] ;
         A7778ArtUnd = P03H93_A7778ArtUnd[0] ;
         n7778ArtUnd = P03H93_n7778ArtUnd[0] ;
         A7777ArtRdtSc = P03H93_A7777ArtRdtSc[0] ;
         n7777ArtRdtSc = P03H93_n7777ArtRdtSc[0] ;
         A7415ArtPmlCru = P03H93_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = P03H93_n7415ArtPmlCru[0] ;
         A7414ArtAncSc = P03H93_A7414ArtAncSc[0] ;
         n7414ArtAncSc = P03H93_n7414ArtAncSc[0] ;
         A7413ArtPmlSc = P03H93_A7413ArtPmlSc[0] ;
         n7413ArtPmlSc = P03H93_n7413ArtPmlSc[0] ;
         A7412Artgrm2Sc = P03H93_A7412Artgrm2Sc[0] ;
         n7412Artgrm2Sc = P03H93_n7412Artgrm2Sc[0] ;
         A7134UltLinFT = P03H93_A7134UltLinFT[0] ;
         n7134UltLinFT = P03H93_n7134UltLinFT[0] ;
         A6953Mat_Maq = P03H93_A6953Mat_Maq[0] ;
         n6953Mat_Maq = P03H93_n6953Mat_Maq[0] ;
         A6952Mat_UltL = P03H93_A6952Mat_UltL[0] ;
         n6952Mat_UltL = P03H93_n6952Mat_UltL[0] ;
         A6660ArtFacTor = P03H93_A6660ArtFacTor[0] ;
         n6660ArtFacTor = P03H93_n6660ArtFacTor[0] ;
         A6462ArtLu = P03H93_A6462ArtLu[0] ;
         n6462ArtLu = P03H93_n6462ArtLu[0] ;
         A6436ArtRdoCru2 = P03H93_A6436ArtRdoCru2[0] ;
         n6436ArtRdoCru2 = P03H93_n6436ArtRdoCru2[0] ;
         A6435ArtRdoCru1 = P03H93_A6435ArtRdoCru1[0] ;
         n6435ArtRdoCru1 = P03H93_n6435ArtRdoCru1[0] ;
         A6108ClaBolCod = P03H93_A6108ClaBolCod[0] ;
         n6108ClaBolCod = P03H93_n6108ClaBolCod[0] ;
         A6106ClaTubCod = P03H93_A6106ClaTubCod[0] ;
         n6106ClaTubCod = P03H93_n6106ClaTubCod[0] ;
         A5741ArtComer = P03H93_A5741ArtComer[0] ;
         n5741ArtComer = P03H93_n5741ArtComer[0] ;
         A5335ArtCodExt = P03H93_A5335ArtCodExt[0] ;
         n5335ArtCodExt = P03H93_n5335ArtCodExt[0] ;
         A4809ArtValMtr = P03H93_A4809ArtValMtr[0] ;
         n4809ArtValMtr = P03H93_n4809ArtValMtr[0] ;
         A4607ArtRb = P03H93_A4607ArtRb[0] ;
         n4607ArtRb = P03H93_n4607ArtRb[0] ;
         A4455ArtAcaFor = P03H93_A4455ArtAcaFor[0] ;
         n4455ArtAcaFor = P03H93_n4455ArtAcaFor[0] ;
         A4454ArtLotKgs = P03H93_A4454ArtLotKgs[0] ;
         n4454ArtLotKgs = P03H93_n4454ArtLotKgs[0] ;
         A4453ArtLotMts = P03H93_A4453ArtLotMts[0] ;
         n4453ArtLotMts = P03H93_n4453ArtLotMts[0] ;
         A4452ArtLotPza = P03H93_A4452ArtLotPza[0] ;
         n4452ArtLotPza = P03H93_n4452ArtLotPza[0] ;
         A4451ArtCruEnr = P03H93_A4451ArtCruEnr[0] ;
         n4451ArtCruEnr = P03H93_n4451ArtCruEnr[0] ;
         A4450ArtCruKgs = P03H93_A4450ArtCruKgs[0] ;
         n4450ArtCruKgs = P03H93_n4450ArtCruKgs[0] ;
         A4449ArtCruMts = P03H93_A4449ArtCruMts[0] ;
         n4449ArtCruMts = P03H93_n4449ArtCruMts[0] ;
         A4448ArtLotMaq = P03H93_A4448ArtLotMaq[0] ;
         n4448ArtLotMaq = P03H93_n4448ArtLotMaq[0] ;
         A4447ArtAcaBak = P03H93_A4447ArtAcaBak[0] ;
         n4447ArtAcaBak = P03H93_n4447ArtAcaBak[0] ;
         A4446ArtAcaMar = P03H93_A4446ArtAcaMar[0] ;
         n4446ArtAcaMar = P03H93_n4446ArtAcaMar[0] ;
         A4445ArtAcaAnh = P03H93_A4445ArtAcaAnh[0] ;
         n4445ArtAcaAnh = P03H93_n4445ArtAcaAnh[0] ;
         A4444ArtPelAnh = P03H93_A4444ArtPelAnh[0] ;
         n4444ArtPelAnh = P03H93_n4444ArtPelAnh[0] ;
         A4352ArtPreUsrM = P03H93_A4352ArtPreUsrM[0] ;
         n4352ArtPreUsrM = P03H93_n4352ArtPreUsrM[0] ;
         A4351ArtPreUlAc = P03H93_A4351ArtPreUlAc[0] ;
         n4351ArtPreUlAc = P03H93_n4351ArtPreUlAc[0] ;
         A4354ArtFecMod = P03H93_A4354ArtFecMod[0] ;
         n4354ArtFecMod = P03H93_n4354ArtFecMod[0] ;
         A4353ArtUsrCod = P03H93_A4353ArtUsrCod[0] ;
         n4353ArtUsrCod = P03H93_n4353ArtUsrCod[0] ;
         A4297ArtPmPPza = P03H93_A4297ArtPmPPza[0] ;
         n4297ArtPmPPza = P03H93_n4297ArtPmPPza[0] ;
         A4295ClasCod = P03H93_A4295ClasCod[0] ;
         n4295ClasCod = P03H93_n4295ClasCod[0] ;
         A1079ULinPre = P03H93_A1079ULinPre[0] ;
         n1079ULinPre = P03H93_n1079ULinPre[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         /*
            INSERT RECORD ON TABLE TXPARTICU

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         A252CliCod = AV10Clicodd ;
         A65ArtCod = AV9Artcod ;
         /* Using cursor P03H94 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Boolean.valueOf(n87ArtMat), A87ArtMat, Short.valueOf(A829TipArtCod), Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n78ArtGraCru), Short.valueOf(A78ArtGraCru), Boolean.valueOf(n68ArtCruMin), Short.valueOf(A68ArtCruMin), Boolean.valueOf(n67ArtCruMax), Short.valueOf(A67ArtCruMax), Boolean.valueOf(n63ArtAcaMin), Short.valueOf(A63ArtAcaMin), Boolean.valueOf(n62ArtAcaMax), Short.valueOf(A62ArtAcaMax), Boolean.valueOf(n95ArtRen), A95ArtRen, Boolean.valueOf(n101ArtTipPle), A101ArtTipPle, Boolean.valueOf(n100ArtTipLar), A100ArtTipLar, Boolean.valueOf(n66ArtCorOri), A66ArtCorOri, Boolean.valueOf(n70ArtEncOri), A70ArtEncOri, Boolean.valueOf(n96ArtSua), A96ArtSua, Boolean.valueOf(n64ArtAcaQui), A64ArtAcaQui, Boolean.valueOf(n73ArtEti), A73ArtEti, Boolean.valueOf(n117ArtUrg), Byte.valueOf(A117ArtUrg), Boolean.valueOf(n88ArtMer), A88ArtMer, Boolean.valueOf(n105ArtTra1), A105ArtTra1, Boolean.valueOf(n106ArtTra2), A106ArtTra2, Boolean.valueOf(n107ArtTra3), A107ArtTra3, Boolean.valueOf(n108ArtTraP1), Short.valueOf(A108ArtTraP1), Boolean.valueOf(n109ArtTraP2), Short.valueOf(A109ArtTraP2), Boolean.valueOf(n110ArtTraP3), Short.valueOf(A110ArtTraP3), Boolean.valueOf(n111ArtUrd1), A111ArtUrd1, Boolean.valueOf(n112ArtUrd2), A112ArtUrd2, Boolean.valueOf(n113ArtUrd3), A113ArtUrd3, Boolean.valueOf(n114ArtUrdP1), Short.valueOf(A114ArtUrdP1), Boolean.valueOf(n115ArtUrdP2), Short.valueOf(A115ArtUrdP2), Boolean.valueOf(n116ArtUrdP3), Short.valueOf(A116ArtUrdP3), Boolean.valueOf(n89ArtObs), A89ArtObs, Boolean.valueOf(n90ArtObsFac), A90ArtObsFac, Boolean.valueOf(n92ArtPreKgm), A92ArtPreKgm, Boolean.valueOf(n93ArtPreMtr), A93ArtPreMtr, Boolean.valueOf(n91ArtPreDef), A91ArtPreDef, Boolean.valueOf(n845ULinRec), Byte.valueOf(A845ULinRec), Boolean.valueOf(n967ArtNMtr), A967ArtNMtr, Boolean.valueOf(n1148ArtPml), Short.valueOf(A1148ArtPml), Boolean.valueOf(n1229ArtEncCom), Short.valueOf(A1229ArtEncCom), Boolean.valueOf(n1230ArtEncAnh), Short.valueOf(A1230ArtEncAnh), Boolean.valueOf(n1903ArtGraAca), Short.valueOf(A1903ArtGraAca), Boolean.valueOf(n1904ArtRdoN), A1904ArtRdoN, Boolean.valueOf(n1905ArtRdoA), A1905ArtRdoA, Boolean.valueOf(n2750ArtNumTex1), Byte.valueOf(A2750ArtNumTex1), Boolean.valueOf(n2751ArtNumTex2), Short.valueOf(A2751ArtNumTex2), Boolean.valueOf(n2707NumTexCod), A2707NumTexCod, Boolean.valueOf(n2791ArtFacAbs), A2791ArtFacAbs, Boolean.valueOf(n3029ArtCosBase), A3029ArtCosBase, Boolean.valueOf(n2834ArtPle2), A2834ArtPle2, Boolean.valueOf(n3072ArtObsLon), A3072ArtObsLon, Boolean.valueOf(n3121ArtNumCor), Short.valueOf(A3121ArtNumCor), Boolean.valueOf(n3122ArtAncSal1), Short.valueOf(A3122ArtAncSal1), Boolean.valueOf(n3123ArtAncSal2), Short.valueOf(A3123ArtAncSal2), Boolean.valueOf(n3124ArtAncSal3), Short.valueOf(A3124ArtAncSal3), Boolean.valueOf(n3125ArtGraAca2), Short.valueOf(A3125ArtGraAca2), Boolean.valueOf(n3126ArtGraCru2), Short.valueOf(A3126ArtGraCru2), Boolean.valueOf(n3318ArtPreCap), A3318ArtPreCap, Boolean.valueOf(n3682ArtAnu), A3682ArtAnu, Boolean.valueOf(n3683ArtFecCre), A3683ArtFecCre, Boolean.valueOf(n1078ArtPrMEst), A1078ArtPrMEst,
         Boolean.valueOf(n1079ULinPre), Byte.valueOf(A1079ULinPre), Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod), Boolean.valueOf(n4297ArtPmPPza), A4297ArtPmPPza, Boolean.valueOf(n4353ArtUsrCod), A4353ArtUsrCod, Boolean.valueOf(n4354ArtFecMod), A4354ArtFecMod, Boolean.valueOf(n4351ArtPreUlAc), A4351ArtPreUlAc, Boolean.valueOf(n4352ArtPreUsrM), A4352ArtPreUsrM, Boolean.valueOf(n4444ArtPelAnh), Short.valueOf(A4444ArtPelAnh), Boolean.valueOf(n4445ArtAcaAnh), Short.valueOf(A4445ArtAcaAnh), Boolean.valueOf(n4446ArtAcaMar), A4446ArtAcaMar, Boolean.valueOf(n4447ArtAcaBak), A4447ArtAcaBak, Boolean.valueOf(n4448ArtLotMaq), A4448ArtLotMaq, Boolean.valueOf(n4449ArtCruMts), A4449ArtCruMts, Boolean.valueOf(n4450ArtCruKgs), A4450ArtCruKgs, Boolean.valueOf(n4451ArtCruEnr), A4451ArtCruEnr, Boolean.valueOf(n4452ArtLotPza), Short.valueOf(A4452ArtLotPza), Boolean.valueOf(n4453ArtLotMts), A4453ArtLotMts, Boolean.valueOf(n4454ArtLotKgs), A4454ArtLotKgs, Boolean.valueOf(n4455ArtAcaFor), Integer.valueOf(A4455ArtAcaFor), Boolean.valueOf(n4607ArtRb), Short.valueOf(A4607ArtRb), Boolean.valueOf(n4809ArtValMtr), A4809ArtValMtr, Boolean.valueOf(n5335ArtCodExt), A5335ArtCodExt, Boolean.valueOf(n5741ArtComer), A5741ArtComer, Boolean.valueOf(n6106ClaTubCod), Short.valueOf(A6106ClaTubCod), Boolean.valueOf(n6108ClaBolCod), Short.valueOf(A6108ClaBolCod), Boolean.valueOf(n6435ArtRdoCru1), A6435ArtRdoCru1, Boolean.valueOf(n6436ArtRdoCru2), A6436ArtRdoCru2, Boolean.valueOf(n6462ArtLu), A6462ArtLu, Boolean.valueOf(n6660ArtFacTor), A6660ArtFacTor, Boolean.valueOf(n6952Mat_UltL), Short.valueOf(A6952Mat_UltL), Boolean.valueOf(n6953Mat_Maq), A6953Mat_Maq, Boolean.valueOf(n7134UltLinFT), Short.valueOf(A7134UltLinFT), Boolean.valueOf(n7412Artgrm2Sc), Short.valueOf(A7412Artgrm2Sc), Boolean.valueOf(n7413ArtPmlSc), Short.valueOf(A7413ArtPmlSc), Boolean.valueOf(n7414ArtAncSc), Short.valueOf(A7414ArtAncSc), Boolean.valueOf(n7415ArtPmlCru), Short.valueOf(A7415ArtPmlCru), Boolean.valueOf(n7777ArtRdtSc), A7777ArtRdtSc, Boolean.valueOf(n7778ArtUnd), A7778ArtUnd, Boolean.valueOf(n7779ArtBlo), A7779ArtBlo, Boolean.valueOf(n7948ArtCla), Byte.valueOf(A7948ArtCla), Boolean.valueOf(n8853CapKgs1), A8853CapKgs1, Boolean.valueOf(n8854CapKgs2), A8854CapKgs2, Boolean.valueOf(n8855CapKgs3), A8855CapKgs3, Boolean.valueOf(n8856CapKgs4), A8856CapKgs4, Boolean.valueOf(n8857CapKgs5), A8857CapKgs5, Boolean.valueOf(n8858CapKgs6), A8858CapKgs6, Boolean.valueOf(n8859CapKgs7), A8859CapKgs7, Boolean.valueOf(n8860CapKgs8), A8860CapKgs8, Boolean.valueOf(n8861CapKgs9), A8861CapKgs9, Boolean.valueOf(n8862CapKgs10), A8862CapKgs10, Boolean.valueOf(n9730ArtFabsH), A9730ArtFabsH, Boolean.valueOf(n9801ArtFabsT), A9801ArtFabsT, Boolean.valueOf(n9875ArtNProg), Byte.valueOf(A9875ArtNProg), Boolean.valueOf(n9902ArtVbd), Short.valueOf(A9902ArtVbd), Boolean.valueOf(n9903ArtVbn), Short.valueOf(A9903ArtVbn), Boolean.valueOf(n9904ArtAb), Short.valueOf(A9904ArtAb), Boolean.valueOf(n397ArtObsGrm), A397ArtObsGrm, Boolean.valueOf(n398ArtObsAnc), A398ArtObsAnc, Boolean.valueOf(n4980ArtCdb), A4980ArtCdb, Boolean.valueOf(n10027ArtGalga), A10027ArtGalga, Boolean.valueOf(n10028ArtPlatina), A10028ArtPlatina, Boolean.valueOf(n10029ArtPgd), A10029ArtPgd, Boolean.valueOf(n10030ArtTh),
         Short.valueOf(A10030ArtTh), Boolean.valueOf(n10379Art_Cd), Short.valueOf(A10379Art_Cd), Boolean.valueOf(n10559CapUsuM), A10559CapUsuM, Boolean.valueOf(n10560CapFecM), A10560CapFecM, Boolean.valueOf(n10561Mat_UsuM), A10561Mat_UsuM, Boolean.valueOf(n10562Mat_FecM), A10562Mat_FecM, Boolean.valueOf(n10557CapUsuA), A10557CapUsuA, Boolean.valueOf(n10558CapFecA), A10558CapFecA, Boolean.valueOf(n10804ArtHilos), Short.valueOf(A10804ArtHilos), Boolean.valueOf(n10805ArtPasad), Short.valueOf(A10805ArtPasad), Boolean.valueOf(n10831ArtAncC), Short.valueOf(A10831ArtAncC), Boolean.valueOf(n10832ArtGrm2C), Short.valueOf(A10832ArtGrm2C), Boolean.valueOf(n10833ArtRdoC), A10833ArtRdoC, Boolean.valueOf(n10834ArtPreObs), A10834ArtPreObs, Boolean.valueOf(n11627ArtFacUti), A11627ArtFacUti, Boolean.valueOf(n4114ArtPreEst), A4114ArtPreEst, Boolean.valueOf(n4115ArtDefEst), A4115ArtDefEst, Boolean.valueOf(n1581ArtNumTip), Integer.valueOf(A1581ArtNumTip), Boolean.valueOf(n12199ArtPreUnd), A12199ArtPreUnd, Boolean.valueOf(n12353Mat_ObsG), A12353Mat_ObsG, Boolean.valueOf(n12364ArtMT), Byte.valueOf(A12364ArtMT), Boolean.valueOf(n12365ArtTRabs), Byte.valueOf(A12365ArtTRabs), Boolean.valueOf(n12366ArtKgMn), A12366ArtKgMn, Boolean.valueOf(n12695ArtElgAnc), A12695ArtElgAnc, Boolean.valueOf(n12696ArtElgLar), A12696ArtElgLar, Boolean.valueOf(n12697ArtRdoCru), A12697ArtRdoCru, Boolean.valueOf(n12698ArtEncLarg), A12698ArtEncLarg, Boolean.valueOf(n12699ArtEncAnc), A12699ArtEncAnc, Boolean.valueOf(n12886ArtObsOtra), A12886ArtObsOtra, Boolean.valueOf(n14099ArtRdto4), A14099ArtRdto4, Boolean.valueOf(n14100Artdsc2), A14100Artdsc2, Boolean.valueOf(n14101ArtgrComp), A14101ArtgrComp, Boolean.valueOf(n14102ArtKgspp), A14102ArtKgspp, Boolean.valueOf(n14103ArtPrepp), A14103ArtPrepp, A14295ArtActivo});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
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
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor P03H95 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV8Clicod), AV9Artcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A65ArtCod = P03H95_A65ArtCod[0] ;
         A252CliCod = P03H95_A252CliCod[0] ;
         A12752Art_Tipo = P03H95_A12752Art_Tipo[0] ;
         n12752Art_Tipo = P03H95_n12752Art_Tipo[0] ;
         A12142ProStFec = P03H95_A12142ProStFec[0] ;
         A12141ProSta = P03H95_A12141ProSta[0] ;
         A11272ProFabs = P03H95_A11272ProFabs[0] ;
         A10556ProFecM = P03H95_A10556ProFecM[0] ;
         A10555ProUserM = P03H95_A10555ProUserM[0] ;
         A10554ProFecA = P03H95_A10554ProFecA[0] ;
         A10553ProUserA = P03H95_A10553ProUserA[0] ;
         A10412ProAct = P03H95_A10412ProAct[0] ;
         A10026DscCFa = P03H95_A10026DscCFa[0] ;
         A9629Art_els = P03H95_A9629Art_els[0] ;
         n9629Art_els = P03H95_n9629Art_els[0] ;
         A9628Art_ets = P03H95_A9628Art_ets[0] ;
         n9628Art_ets = P03H95_n9628Art_ets[0] ;
         A8955Art_Obs = P03H95_A8955Art_Obs[0] ;
         n8955Art_Obs = P03H95_n8955Art_Obs[0] ;
         A8166Art_Und = P03H95_A8166Art_Und[0] ;
         n8166Art_Und = P03H95_n8166Art_Und[0] ;
         A8165Art_Dsc = P03H95_A8165Art_Dsc[0] ;
         n8165Art_Dsc = P03H95_n8165Art_Dsc[0] ;
         A8084Art_RdoP = P03H95_A8084Art_RdoP[0] ;
         n8084Art_RdoP = P03H95_n8084Art_RdoP[0] ;
         A8083Art_AncP = P03H95_A8083Art_AncP[0] ;
         n8083Art_AncP = P03H95_n8083Art_AncP[0] ;
         A8082Art_PmlP = P03H95_A8082Art_PmlP[0] ;
         n8082Art_PmlP = P03H95_n8082Art_PmlP[0] ;
         A8081Art_GrmP = P03H95_A8081Art_GrmP[0] ;
         n8081Art_GrmP = P03H95_n8081Art_GrmP[0] ;
         A8080Art_PmlC = P03H95_A8080Art_PmlC[0] ;
         n8080Art_PmlC = P03H95_n8080Art_PmlC[0] ;
         A8079Art_AncC = P03H95_A8079Art_AncC[0] ;
         n8079Art_AncC = P03H95_n8079Art_AncC[0] ;
         A8078Art_GrmC = P03H95_A8078Art_GrmC[0] ;
         n8078Art_GrmC = P03H95_n8078Art_GrmC[0] ;
         A8077Art_GrmB = P03H95_A8077Art_GrmB[0] ;
         n8077Art_GrmB = P03H95_n8077Art_GrmB[0] ;
         A8076Art_AncB = P03H95_A8076Art_AncB[0] ;
         n8076Art_AncB = P03H95_n8076Art_AncB[0] ;
         A8075Art_Fabs = P03H95_A8075Art_Fabs[0] ;
         n8075Art_Fabs = P03H95_n8075Art_Fabs[0] ;
         A8074Art_Rdpc = P03H95_A8074Art_Rdpc[0] ;
         n8074Art_Rdpc = P03H95_n8074Art_Rdpc[0] ;
         A8073Art_Rdo = P03H95_A8073Art_Rdo[0] ;
         n8073Art_Rdo = P03H95_n8073Art_Rdo[0] ;
         A8072Art_Cor = P03H95_A8072Art_Cor[0] ;
         n8072Art_Cor = P03H95_n8072Art_Cor[0] ;
         A8071Art_Enc = P03H95_A8071Art_Enc[0] ;
         n8071Art_Enc = P03H95_n8071Art_Enc[0] ;
         A8070Art_Elar = P03H95_A8070Art_Elar[0] ;
         n8070Art_Elar = P03H95_n8070Art_Elar[0] ;
         A8069Art_Eanc = P03H95_A8069Art_Eanc[0] ;
         n8069Art_Eanc = P03H95_n8069Art_Eanc[0] ;
         A8068Art_PmlA = P03H95_A8068Art_PmlA[0] ;
         n8068Art_PmlA = P03H95_n8068Art_PmlA[0] ;
         A8067Art_Merma = P03H95_A8067Art_Merma[0] ;
         n8067Art_Merma = P03H95_n8067Art_Merma[0] ;
         A8066Art_AncA = P03H95_A8066Art_AncA[0] ;
         n8066Art_AncA = P03H95_n8066Art_AncA[0] ;
         A8065Art_GrmA = P03H95_A8065Art_GrmA[0] ;
         n8065Art_GrmA = P03H95_n8065Art_GrmA[0] ;
         A758ProCod = P03H95_A758ProCod[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         /*
            INSERT RECORD ON TABLE TXPARTLIN

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W758ProCod = A758ProCod ;
         A252CliCod = AV10Clicodd ;
         A65ArtCod = AV9Artcod ;
         /* Using cursor P03H96 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, Boolean.valueOf(n8065Art_GrmA), Short.valueOf(A8065Art_GrmA), Boolean.valueOf(n8066Art_AncA), Short.valueOf(A8066Art_AncA), Boolean.valueOf(n8067Art_Merma), A8067Art_Merma, Boolean.valueOf(n8068Art_PmlA), Short.valueOf(A8068Art_PmlA), Boolean.valueOf(n8069Art_Eanc), Short.valueOf(A8069Art_Eanc), Boolean.valueOf(n8070Art_Elar), Short.valueOf(A8070Art_Elar), Boolean.valueOf(n8071Art_Enc), A8071Art_Enc, Boolean.valueOf(n8072Art_Cor), A8072Art_Cor, Boolean.valueOf(n8073Art_Rdo), A8073Art_Rdo, Boolean.valueOf(n8074Art_Rdpc), A8074Art_Rdpc, Boolean.valueOf(n8075Art_Fabs), A8075Art_Fabs, Boolean.valueOf(n8076Art_AncB), Short.valueOf(A8076Art_AncB), Boolean.valueOf(n8077Art_GrmB), Short.valueOf(A8077Art_GrmB), Boolean.valueOf(n8078Art_GrmC), Short.valueOf(A8078Art_GrmC), Boolean.valueOf(n8079Art_AncC), Short.valueOf(A8079Art_AncC), Boolean.valueOf(n8080Art_PmlC), Short.valueOf(A8080Art_PmlC), Boolean.valueOf(n8081Art_GrmP), Short.valueOf(A8081Art_GrmP), Boolean.valueOf(n8082Art_PmlP), Short.valueOf(A8082Art_PmlP), Boolean.valueOf(n8083Art_AncP), Short.valueOf(A8083Art_AncP), Boolean.valueOf(n8084Art_RdoP), A8084Art_RdoP, Boolean.valueOf(n8165Art_Dsc), A8165Art_Dsc, Boolean.valueOf(n8166Art_Und), A8166Art_Und, Boolean.valueOf(n8955Art_Obs), A8955Art_Obs, Boolean.valueOf(n9628Art_ets), A9628Art_ets, Boolean.valueOf(n9629Art_els), A9629Art_els, A10026DscCFa, A10412ProAct, A10553ProUserA, A10554ProFecA, A10555ProUserM, A10556ProFecM, A11272ProFabs, Byte.valueOf(A12141ProSta), A12142ProStFec, Boolean.valueOf(n12752Art_Tipo), A12752Art_Tipo});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
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
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         A758ProCod = W758ProCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmd2100.this.A396EmprCod;
      this.aP1[0] = pmd2100.this.AV8Clicod;
      this.aP2[0] = pmd2100.this.AV9Artcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmd2100");
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
      P03H92_A396EmprCod = new String[] {""} ;
      P03H92_A10045CliAct = new String[] {""} ;
      P03H92_A252CliCod = new int[1] ;
      A10045CliAct = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      P03H93_A3072ArtObsLon = new String[] {""} ;
      P03H93_n3072ArtObsLon = new boolean[] {false} ;
      P03H93_A1078ArtPrMEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n1078ArtPrMEst = new boolean[] {false} ;
      P03H93_A3683ArtFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      P03H93_n3683ArtFecCre = new boolean[] {false} ;
      P03H93_A3682ArtAnu = new String[] {""} ;
      P03H93_n3682ArtAnu = new boolean[] {false} ;
      P03H93_A3318ArtPreCap = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n3318ArtPreCap = new boolean[] {false} ;
      P03H93_A3126ArtGraCru2 = new short[1] ;
      P03H93_n3126ArtGraCru2 = new boolean[] {false} ;
      P03H93_A3125ArtGraAca2 = new short[1] ;
      P03H93_n3125ArtGraAca2 = new boolean[] {false} ;
      P03H93_A3124ArtAncSal3 = new short[1] ;
      P03H93_n3124ArtAncSal3 = new boolean[] {false} ;
      P03H93_A3123ArtAncSal2 = new short[1] ;
      P03H93_n3123ArtAncSal2 = new boolean[] {false} ;
      P03H93_A3122ArtAncSal1 = new short[1] ;
      P03H93_n3122ArtAncSal1 = new boolean[] {false} ;
      P03H93_A3121ArtNumCor = new short[1] ;
      P03H93_n3121ArtNumCor = new boolean[] {false} ;
      P03H93_A2834ArtPle2 = new String[] {""} ;
      P03H93_n2834ArtPle2 = new boolean[] {false} ;
      P03H93_A3029ArtCosBase = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n3029ArtCosBase = new boolean[] {false} ;
      P03H93_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n2791ArtFacAbs = new boolean[] {false} ;
      P03H93_A2707NumTexCod = new String[] {""} ;
      P03H93_n2707NumTexCod = new boolean[] {false} ;
      P03H93_A2751ArtNumTex2 = new short[1] ;
      P03H93_n2751ArtNumTex2 = new boolean[] {false} ;
      P03H93_A2750ArtNumTex1 = new byte[1] ;
      P03H93_n2750ArtNumTex1 = new boolean[] {false} ;
      P03H93_A1905ArtRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n1905ArtRdoA = new boolean[] {false} ;
      P03H93_A1904ArtRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n1904ArtRdoN = new boolean[] {false} ;
      P03H93_A1903ArtGraAca = new short[1] ;
      P03H93_n1903ArtGraAca = new boolean[] {false} ;
      P03H93_A1230ArtEncAnh = new short[1] ;
      P03H93_n1230ArtEncAnh = new boolean[] {false} ;
      P03H93_A1229ArtEncCom = new short[1] ;
      P03H93_n1229ArtEncCom = new boolean[] {false} ;
      P03H93_A1148ArtPml = new short[1] ;
      P03H93_n1148ArtPml = new boolean[] {false} ;
      P03H93_A967ArtNMtr = new String[] {""} ;
      P03H93_n967ArtNMtr = new boolean[] {false} ;
      P03H93_A845ULinRec = new byte[1] ;
      P03H93_n845ULinRec = new boolean[] {false} ;
      P03H93_A91ArtPreDef = new String[] {""} ;
      P03H93_n91ArtPreDef = new boolean[] {false} ;
      P03H93_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n93ArtPreMtr = new boolean[] {false} ;
      P03H93_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n92ArtPreKgm = new boolean[] {false} ;
      P03H93_A90ArtObsFac = new String[] {""} ;
      P03H93_n90ArtObsFac = new boolean[] {false} ;
      P03H93_A89ArtObs = new String[] {""} ;
      P03H93_n89ArtObs = new boolean[] {false} ;
      P03H93_A116ArtUrdP3 = new short[1] ;
      P03H93_n116ArtUrdP3 = new boolean[] {false} ;
      P03H93_A115ArtUrdP2 = new short[1] ;
      P03H93_n115ArtUrdP2 = new boolean[] {false} ;
      P03H93_A114ArtUrdP1 = new short[1] ;
      P03H93_n114ArtUrdP1 = new boolean[] {false} ;
      P03H93_A113ArtUrd3 = new String[] {""} ;
      P03H93_n113ArtUrd3 = new boolean[] {false} ;
      P03H93_A112ArtUrd2 = new String[] {""} ;
      P03H93_n112ArtUrd2 = new boolean[] {false} ;
      P03H93_A111ArtUrd1 = new String[] {""} ;
      P03H93_n111ArtUrd1 = new boolean[] {false} ;
      P03H93_A110ArtTraP3 = new short[1] ;
      P03H93_n110ArtTraP3 = new boolean[] {false} ;
      P03H93_A109ArtTraP2 = new short[1] ;
      P03H93_n109ArtTraP2 = new boolean[] {false} ;
      P03H93_A108ArtTraP1 = new short[1] ;
      P03H93_n108ArtTraP1 = new boolean[] {false} ;
      P03H93_A107ArtTra3 = new String[] {""} ;
      P03H93_n107ArtTra3 = new boolean[] {false} ;
      P03H93_A106ArtTra2 = new String[] {""} ;
      P03H93_n106ArtTra2 = new boolean[] {false} ;
      P03H93_A105ArtTra1 = new String[] {""} ;
      P03H93_n105ArtTra1 = new boolean[] {false} ;
      P03H93_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n88ArtMer = new boolean[] {false} ;
      P03H93_A117ArtUrg = new byte[1] ;
      P03H93_n117ArtUrg = new boolean[] {false} ;
      P03H93_A73ArtEti = new String[] {""} ;
      P03H93_n73ArtEti = new boolean[] {false} ;
      P03H93_A64ArtAcaQui = new String[] {""} ;
      P03H93_n64ArtAcaQui = new boolean[] {false} ;
      P03H93_A96ArtSua = new String[] {""} ;
      P03H93_n96ArtSua = new boolean[] {false} ;
      P03H93_A70ArtEncOri = new String[] {""} ;
      P03H93_n70ArtEncOri = new boolean[] {false} ;
      P03H93_A66ArtCorOri = new String[] {""} ;
      P03H93_n66ArtCorOri = new boolean[] {false} ;
      P03H93_A100ArtTipLar = new String[] {""} ;
      P03H93_n100ArtTipLar = new boolean[] {false} ;
      P03H93_A101ArtTipPle = new String[] {""} ;
      P03H93_n101ArtTipPle = new boolean[] {false} ;
      P03H93_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n95ArtRen = new boolean[] {false} ;
      P03H93_A62ArtAcaMax = new short[1] ;
      P03H93_n62ArtAcaMax = new boolean[] {false} ;
      P03H93_A63ArtAcaMin = new short[1] ;
      P03H93_n63ArtAcaMin = new boolean[] {false} ;
      P03H93_A67ArtCruMax = new short[1] ;
      P03H93_n67ArtCruMax = new boolean[] {false} ;
      P03H93_A68ArtCruMin = new short[1] ;
      P03H93_n68ArtCruMin = new boolean[] {false} ;
      P03H93_A78ArtGraCru = new short[1] ;
      P03H93_n78ArtGraCru = new boolean[] {false} ;
      P03H93_A69ArtDsc = new String[] {""} ;
      P03H93_n69ArtDsc = new boolean[] {false} ;
      P03H93_A829TipArtCod = new short[1] ;
      P03H93_A87ArtMat = new String[] {""} ;
      P03H93_n87ArtMat = new boolean[] {false} ;
      P03H93_A396EmprCod = new String[] {""} ;
      P03H93_A65ArtCod = new String[] {""} ;
      P03H93_A252CliCod = new int[1] ;
      P03H93_A14295ArtActivo = new String[] {""} ;
      P03H93_A14103ArtPrepp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n14103ArtPrepp = new boolean[] {false} ;
      P03H93_A14102ArtKgspp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n14102ArtKgspp = new boolean[] {false} ;
      P03H93_A14101ArtgrComp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n14101ArtgrComp = new boolean[] {false} ;
      P03H93_A14100Artdsc2 = new String[] {""} ;
      P03H93_n14100Artdsc2 = new boolean[] {false} ;
      P03H93_A14099ArtRdto4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n14099ArtRdto4 = new boolean[] {false} ;
      P03H93_A12886ArtObsOtra = new String[] {""} ;
      P03H93_n12886ArtObsOtra = new boolean[] {false} ;
      P03H93_A12699ArtEncAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n12699ArtEncAnc = new boolean[] {false} ;
      P03H93_A12698ArtEncLarg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n12698ArtEncLarg = new boolean[] {false} ;
      P03H93_A12697ArtRdoCru = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n12697ArtRdoCru = new boolean[] {false} ;
      P03H93_A12696ArtElgLar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n12696ArtElgLar = new boolean[] {false} ;
      P03H93_A12695ArtElgAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n12695ArtElgAnc = new boolean[] {false} ;
      P03H93_A12366ArtKgMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n12366ArtKgMn = new boolean[] {false} ;
      P03H93_A12365ArtTRabs = new byte[1] ;
      P03H93_n12365ArtTRabs = new boolean[] {false} ;
      P03H93_A12364ArtMT = new byte[1] ;
      P03H93_n12364ArtMT = new boolean[] {false} ;
      P03H93_A12353Mat_ObsG = new String[] {""} ;
      P03H93_n12353Mat_ObsG = new boolean[] {false} ;
      P03H93_A12199ArtPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n12199ArtPreUnd = new boolean[] {false} ;
      P03H93_A1581ArtNumTip = new int[1] ;
      P03H93_n1581ArtNumTip = new boolean[] {false} ;
      P03H93_A4115ArtDefEst = new String[] {""} ;
      P03H93_n4115ArtDefEst = new boolean[] {false} ;
      P03H93_A4114ArtPreEst = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n4114ArtPreEst = new boolean[] {false} ;
      P03H93_A11627ArtFacUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n11627ArtFacUti = new boolean[] {false} ;
      P03H93_A10834ArtPreObs = new String[] {""} ;
      P03H93_n10834ArtPreObs = new boolean[] {false} ;
      P03H93_A10833ArtRdoC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n10833ArtRdoC = new boolean[] {false} ;
      P03H93_A10832ArtGrm2C = new short[1] ;
      P03H93_n10832ArtGrm2C = new boolean[] {false} ;
      P03H93_A10831ArtAncC = new short[1] ;
      P03H93_n10831ArtAncC = new boolean[] {false} ;
      P03H93_A10805ArtPasad = new short[1] ;
      P03H93_n10805ArtPasad = new boolean[] {false} ;
      P03H93_A10804ArtHilos = new short[1] ;
      P03H93_n10804ArtHilos = new boolean[] {false} ;
      P03H93_A10558CapFecA = new java.util.Date[] {GXutil.nullDate()} ;
      P03H93_n10558CapFecA = new boolean[] {false} ;
      P03H93_A10557CapUsuA = new String[] {""} ;
      P03H93_n10557CapUsuA = new boolean[] {false} ;
      P03H93_A10562Mat_FecM = new java.util.Date[] {GXutil.nullDate()} ;
      P03H93_n10562Mat_FecM = new boolean[] {false} ;
      P03H93_A10561Mat_UsuM = new String[] {""} ;
      P03H93_n10561Mat_UsuM = new boolean[] {false} ;
      P03H93_A10560CapFecM = new java.util.Date[] {GXutil.nullDate()} ;
      P03H93_n10560CapFecM = new boolean[] {false} ;
      P03H93_A10559CapUsuM = new String[] {""} ;
      P03H93_n10559CapUsuM = new boolean[] {false} ;
      P03H93_A10379Art_Cd = new short[1] ;
      P03H93_n10379Art_Cd = new boolean[] {false} ;
      P03H93_A10030ArtTh = new short[1] ;
      P03H93_n10030ArtTh = new boolean[] {false} ;
      P03H93_A10029ArtPgd = new String[] {""} ;
      P03H93_n10029ArtPgd = new boolean[] {false} ;
      P03H93_A10028ArtPlatina = new String[] {""} ;
      P03H93_n10028ArtPlatina = new boolean[] {false} ;
      P03H93_A10027ArtGalga = new String[] {""} ;
      P03H93_n10027ArtGalga = new boolean[] {false} ;
      P03H93_A4980ArtCdb = new String[] {""} ;
      P03H93_n4980ArtCdb = new boolean[] {false} ;
      P03H93_A398ArtObsAnc = new String[] {""} ;
      P03H93_n398ArtObsAnc = new boolean[] {false} ;
      P03H93_A397ArtObsGrm = new String[] {""} ;
      P03H93_n397ArtObsGrm = new boolean[] {false} ;
      P03H93_A9904ArtAb = new short[1] ;
      P03H93_n9904ArtAb = new boolean[] {false} ;
      P03H93_A9903ArtVbn = new short[1] ;
      P03H93_n9903ArtVbn = new boolean[] {false} ;
      P03H93_A9902ArtVbd = new short[1] ;
      P03H93_n9902ArtVbd = new boolean[] {false} ;
      P03H93_A9875ArtNProg = new byte[1] ;
      P03H93_n9875ArtNProg = new boolean[] {false} ;
      P03H93_A9801ArtFabsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n9801ArtFabsT = new boolean[] {false} ;
      P03H93_A9730ArtFabsH = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n9730ArtFabsH = new boolean[] {false} ;
      P03H93_A8862CapKgs10 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n8862CapKgs10 = new boolean[] {false} ;
      P03H93_A8861CapKgs9 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n8861CapKgs9 = new boolean[] {false} ;
      P03H93_A8860CapKgs8 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n8860CapKgs8 = new boolean[] {false} ;
      P03H93_A8859CapKgs7 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n8859CapKgs7 = new boolean[] {false} ;
      P03H93_A8858CapKgs6 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n8858CapKgs6 = new boolean[] {false} ;
      P03H93_A8857CapKgs5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n8857CapKgs5 = new boolean[] {false} ;
      P03H93_A8856CapKgs4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n8856CapKgs4 = new boolean[] {false} ;
      P03H93_A8855CapKgs3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n8855CapKgs3 = new boolean[] {false} ;
      P03H93_A8854CapKgs2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n8854CapKgs2 = new boolean[] {false} ;
      P03H93_A8853CapKgs1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n8853CapKgs1 = new boolean[] {false} ;
      P03H93_A7948ArtCla = new byte[1] ;
      P03H93_n7948ArtCla = new boolean[] {false} ;
      P03H93_A7779ArtBlo = new String[] {""} ;
      P03H93_n7779ArtBlo = new boolean[] {false} ;
      P03H93_A7778ArtUnd = new String[] {""} ;
      P03H93_n7778ArtUnd = new boolean[] {false} ;
      P03H93_A7777ArtRdtSc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n7777ArtRdtSc = new boolean[] {false} ;
      P03H93_A7415ArtPmlCru = new short[1] ;
      P03H93_n7415ArtPmlCru = new boolean[] {false} ;
      P03H93_A7414ArtAncSc = new short[1] ;
      P03H93_n7414ArtAncSc = new boolean[] {false} ;
      P03H93_A7413ArtPmlSc = new short[1] ;
      P03H93_n7413ArtPmlSc = new boolean[] {false} ;
      P03H93_A7412Artgrm2Sc = new short[1] ;
      P03H93_n7412Artgrm2Sc = new boolean[] {false} ;
      P03H93_A7134UltLinFT = new short[1] ;
      P03H93_n7134UltLinFT = new boolean[] {false} ;
      P03H93_A6953Mat_Maq = new String[] {""} ;
      P03H93_n6953Mat_Maq = new boolean[] {false} ;
      P03H93_A6952Mat_UltL = new short[1] ;
      P03H93_n6952Mat_UltL = new boolean[] {false} ;
      P03H93_A6660ArtFacTor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n6660ArtFacTor = new boolean[] {false} ;
      P03H93_A6462ArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n6462ArtLu = new boolean[] {false} ;
      P03H93_A6436ArtRdoCru2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n6436ArtRdoCru2 = new boolean[] {false} ;
      P03H93_A6435ArtRdoCru1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n6435ArtRdoCru1 = new boolean[] {false} ;
      P03H93_A6108ClaBolCod = new short[1] ;
      P03H93_n6108ClaBolCod = new boolean[] {false} ;
      P03H93_A6106ClaTubCod = new short[1] ;
      P03H93_n6106ClaTubCod = new boolean[] {false} ;
      P03H93_A5741ArtComer = new String[] {""} ;
      P03H93_n5741ArtComer = new boolean[] {false} ;
      P03H93_A5335ArtCodExt = new String[] {""} ;
      P03H93_n5335ArtCodExt = new boolean[] {false} ;
      P03H93_A4809ArtValMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n4809ArtValMtr = new boolean[] {false} ;
      P03H93_A4607ArtRb = new short[1] ;
      P03H93_n4607ArtRb = new boolean[] {false} ;
      P03H93_A4455ArtAcaFor = new int[1] ;
      P03H93_n4455ArtAcaFor = new boolean[] {false} ;
      P03H93_A4454ArtLotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n4454ArtLotKgs = new boolean[] {false} ;
      P03H93_A4453ArtLotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n4453ArtLotMts = new boolean[] {false} ;
      P03H93_A4452ArtLotPza = new short[1] ;
      P03H93_n4452ArtLotPza = new boolean[] {false} ;
      P03H93_A4451ArtCruEnr = new String[] {""} ;
      P03H93_n4451ArtCruEnr = new boolean[] {false} ;
      P03H93_A4450ArtCruKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n4450ArtCruKgs = new boolean[] {false} ;
      P03H93_A4449ArtCruMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n4449ArtCruMts = new boolean[] {false} ;
      P03H93_A4448ArtLotMaq = new String[] {""} ;
      P03H93_n4448ArtLotMaq = new boolean[] {false} ;
      P03H93_A4447ArtAcaBak = new String[] {""} ;
      P03H93_n4447ArtAcaBak = new boolean[] {false} ;
      P03H93_A4446ArtAcaMar = new String[] {""} ;
      P03H93_n4446ArtAcaMar = new boolean[] {false} ;
      P03H93_A4445ArtAcaAnh = new short[1] ;
      P03H93_n4445ArtAcaAnh = new boolean[] {false} ;
      P03H93_A4444ArtPelAnh = new short[1] ;
      P03H93_n4444ArtPelAnh = new boolean[] {false} ;
      P03H93_A4352ArtPreUsrM = new String[] {""} ;
      P03H93_n4352ArtPreUsrM = new boolean[] {false} ;
      P03H93_A4351ArtPreUlAc = new java.util.Date[] {GXutil.nullDate()} ;
      P03H93_n4351ArtPreUlAc = new boolean[] {false} ;
      P03H93_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P03H93_n4354ArtFecMod = new boolean[] {false} ;
      P03H93_A4353ArtUsrCod = new String[] {""} ;
      P03H93_n4353ArtUsrCod = new boolean[] {false} ;
      P03H93_A4297ArtPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H93_n4297ArtPmPPza = new boolean[] {false} ;
      P03H93_A4295ClasCod = new short[1] ;
      P03H93_n4295ClasCod = new boolean[] {false} ;
      P03H93_A1079ULinPre = new byte[1] ;
      P03H93_n1079ULinPre = new boolean[] {false} ;
      A3072ArtObsLon = "" ;
      A1078ArtPrMEst = DecimalUtil.ZERO ;
      A3683ArtFecCre = GXutil.nullDate() ;
      A3682ArtAnu = "" ;
      A3318ArtPreCap = DecimalUtil.ZERO ;
      A2834ArtPle2 = "" ;
      A3029ArtCosBase = DecimalUtil.ZERO ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      A2707NumTexCod = "" ;
      A1905ArtRdoA = DecimalUtil.ZERO ;
      A1904ArtRdoN = DecimalUtil.ZERO ;
      A967ArtNMtr = "" ;
      A91ArtPreDef = "" ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      A90ArtObsFac = "" ;
      A89ArtObs = "" ;
      A113ArtUrd3 = "" ;
      A112ArtUrd2 = "" ;
      A111ArtUrd1 = "" ;
      A107ArtTra3 = "" ;
      A106ArtTra2 = "" ;
      A105ArtTra1 = "" ;
      A88ArtMer = DecimalUtil.ZERO ;
      A73ArtEti = "" ;
      A64ArtAcaQui = "" ;
      A96ArtSua = "" ;
      A70ArtEncOri = "" ;
      A66ArtCorOri = "" ;
      A100ArtTipLar = "" ;
      A101ArtTipPle = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      A69ArtDsc = "" ;
      A87ArtMat = "" ;
      A65ArtCod = "" ;
      A14295ArtActivo = "" ;
      A14103ArtPrepp = DecimalUtil.ZERO ;
      A14102ArtKgspp = DecimalUtil.ZERO ;
      A14101ArtgrComp = DecimalUtil.ZERO ;
      A14100Artdsc2 = "" ;
      A14099ArtRdto4 = DecimalUtil.ZERO ;
      A12886ArtObsOtra = "" ;
      A12699ArtEncAnc = DecimalUtil.ZERO ;
      A12698ArtEncLarg = DecimalUtil.ZERO ;
      A12697ArtRdoCru = DecimalUtil.ZERO ;
      A12696ArtElgLar = DecimalUtil.ZERO ;
      A12695ArtElgAnc = DecimalUtil.ZERO ;
      A12366ArtKgMn = DecimalUtil.ZERO ;
      A12353Mat_ObsG = "" ;
      A12199ArtPreUnd = DecimalUtil.ZERO ;
      A4115ArtDefEst = "" ;
      A4114ArtPreEst = DecimalUtil.ZERO ;
      A11627ArtFacUti = DecimalUtil.ZERO ;
      A10834ArtPreObs = "" ;
      A10833ArtRdoC = DecimalUtil.ZERO ;
      A10558CapFecA = GXutil.resetTime( GXutil.nullDate() );
      A10557CapUsuA = "" ;
      A10562Mat_FecM = GXutil.resetTime( GXutil.nullDate() );
      A10561Mat_UsuM = "" ;
      A10560CapFecM = GXutil.resetTime( GXutil.nullDate() );
      A10559CapUsuM = "" ;
      A10029ArtPgd = "" ;
      A10028ArtPlatina = "" ;
      A10027ArtGalga = "" ;
      A4980ArtCdb = "" ;
      A398ArtObsAnc = "" ;
      A397ArtObsGrm = "" ;
      A9801ArtFabsT = DecimalUtil.ZERO ;
      A9730ArtFabsH = DecimalUtil.ZERO ;
      A8862CapKgs10 = DecimalUtil.ZERO ;
      A8861CapKgs9 = DecimalUtil.ZERO ;
      A8860CapKgs8 = DecimalUtil.ZERO ;
      A8859CapKgs7 = DecimalUtil.ZERO ;
      A8858CapKgs6 = DecimalUtil.ZERO ;
      A8857CapKgs5 = DecimalUtil.ZERO ;
      A8856CapKgs4 = DecimalUtil.ZERO ;
      A8855CapKgs3 = DecimalUtil.ZERO ;
      A8854CapKgs2 = DecimalUtil.ZERO ;
      A8853CapKgs1 = DecimalUtil.ZERO ;
      A7779ArtBlo = "" ;
      A7778ArtUnd = "" ;
      A7777ArtRdtSc = DecimalUtil.ZERO ;
      A6953Mat_Maq = "" ;
      A6660ArtFacTor = DecimalUtil.ZERO ;
      A6462ArtLu = DecimalUtil.ZERO ;
      A6436ArtRdoCru2 = DecimalUtil.ZERO ;
      A6435ArtRdoCru1 = DecimalUtil.ZERO ;
      A5741ArtComer = "" ;
      A5335ArtCodExt = "" ;
      A4809ArtValMtr = DecimalUtil.ZERO ;
      A4454ArtLotKgs = DecimalUtil.ZERO ;
      A4453ArtLotMts = DecimalUtil.ZERO ;
      A4451ArtCruEnr = "" ;
      A4450ArtCruKgs = DecimalUtil.ZERO ;
      A4449ArtCruMts = DecimalUtil.ZERO ;
      A4448ArtLotMaq = "" ;
      A4447ArtAcaBak = "" ;
      A4446ArtAcaMar = "" ;
      A4352ArtPreUsrM = "" ;
      A4351ArtPreUlAc = GXutil.nullDate() ;
      A4354ArtFecMod = GXutil.nullDate() ;
      A4353ArtUsrCod = "" ;
      A4297ArtPmPPza = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      W65ArtCod = "" ;
      Gx_emsg = "" ;
      P03H95_A396EmprCod = new String[] {""} ;
      P03H95_A65ArtCod = new String[] {""} ;
      P03H95_A252CliCod = new int[1] ;
      P03H95_A12752Art_Tipo = new String[] {""} ;
      P03H95_n12752Art_Tipo = new boolean[] {false} ;
      P03H95_A12142ProStFec = new java.util.Date[] {GXutil.nullDate()} ;
      P03H95_A12141ProSta = new byte[1] ;
      P03H95_A11272ProFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H95_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      P03H95_A10555ProUserM = new String[] {""} ;
      P03H95_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      P03H95_A10553ProUserA = new String[] {""} ;
      P03H95_A10412ProAct = new String[] {""} ;
      P03H95_A10026DscCFa = new String[] {""} ;
      P03H95_A9629Art_els = new String[] {""} ;
      P03H95_n9629Art_els = new boolean[] {false} ;
      P03H95_A9628Art_ets = new String[] {""} ;
      P03H95_n9628Art_ets = new boolean[] {false} ;
      P03H95_A8955Art_Obs = new String[] {""} ;
      P03H95_n8955Art_Obs = new boolean[] {false} ;
      P03H95_A8166Art_Und = new String[] {""} ;
      P03H95_n8166Art_Und = new boolean[] {false} ;
      P03H95_A8165Art_Dsc = new String[] {""} ;
      P03H95_n8165Art_Dsc = new boolean[] {false} ;
      P03H95_A8084Art_RdoP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H95_n8084Art_RdoP = new boolean[] {false} ;
      P03H95_A8083Art_AncP = new short[1] ;
      P03H95_n8083Art_AncP = new boolean[] {false} ;
      P03H95_A8082Art_PmlP = new short[1] ;
      P03H95_n8082Art_PmlP = new boolean[] {false} ;
      P03H95_A8081Art_GrmP = new short[1] ;
      P03H95_n8081Art_GrmP = new boolean[] {false} ;
      P03H95_A8080Art_PmlC = new short[1] ;
      P03H95_n8080Art_PmlC = new boolean[] {false} ;
      P03H95_A8079Art_AncC = new short[1] ;
      P03H95_n8079Art_AncC = new boolean[] {false} ;
      P03H95_A8078Art_GrmC = new short[1] ;
      P03H95_n8078Art_GrmC = new boolean[] {false} ;
      P03H95_A8077Art_GrmB = new short[1] ;
      P03H95_n8077Art_GrmB = new boolean[] {false} ;
      P03H95_A8076Art_AncB = new short[1] ;
      P03H95_n8076Art_AncB = new boolean[] {false} ;
      P03H95_A8075Art_Fabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H95_n8075Art_Fabs = new boolean[] {false} ;
      P03H95_A8074Art_Rdpc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H95_n8074Art_Rdpc = new boolean[] {false} ;
      P03H95_A8073Art_Rdo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H95_n8073Art_Rdo = new boolean[] {false} ;
      P03H95_A8072Art_Cor = new String[] {""} ;
      P03H95_n8072Art_Cor = new boolean[] {false} ;
      P03H95_A8071Art_Enc = new String[] {""} ;
      P03H95_n8071Art_Enc = new boolean[] {false} ;
      P03H95_A8070Art_Elar = new short[1] ;
      P03H95_n8070Art_Elar = new boolean[] {false} ;
      P03H95_A8069Art_Eanc = new short[1] ;
      P03H95_n8069Art_Eanc = new boolean[] {false} ;
      P03H95_A8068Art_PmlA = new short[1] ;
      P03H95_n8068Art_PmlA = new boolean[] {false} ;
      P03H95_A8067Art_Merma = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03H95_n8067Art_Merma = new boolean[] {false} ;
      P03H95_A8066Art_AncA = new short[1] ;
      P03H95_n8066Art_AncA = new boolean[] {false} ;
      P03H95_A8065Art_GrmA = new short[1] ;
      P03H95_n8065Art_GrmA = new boolean[] {false} ;
      P03H95_A758ProCod = new String[] {""} ;
      A12752Art_Tipo = "" ;
      A12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      A11272ProFabs = DecimalUtil.ZERO ;
      A10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      A10555ProUserM = "" ;
      A10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      A10553ProUserA = "" ;
      A10412ProAct = "" ;
      A10026DscCFa = "" ;
      A9629Art_els = "" ;
      A9628Art_ets = "" ;
      A8955Art_Obs = "" ;
      A8166Art_Und = "" ;
      A8165Art_Dsc = "" ;
      A8084Art_RdoP = DecimalUtil.ZERO ;
      A8075Art_Fabs = DecimalUtil.ZERO ;
      A8074Art_Rdpc = DecimalUtil.ZERO ;
      A8073Art_Rdo = DecimalUtil.ZERO ;
      A8072Art_Cor = "" ;
      A8071Art_Enc = "" ;
      A8067Art_Merma = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      W758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmd2100__default(),
         new Object[] {
             new Object[] {
            P03H92_A396EmprCod, P03H92_A10045CliAct, P03H92_A252CliCod
            }
            , new Object[] {
            P03H93_A3072ArtObsLon, P03H93_n3072ArtObsLon, P03H93_A1078ArtPrMEst, P03H93_n1078ArtPrMEst, P03H93_A3683ArtFecCre, P03H93_n3683ArtFecCre, P03H93_A3682ArtAnu, P03H93_n3682ArtAnu, P03H93_A3318ArtPreCap, P03H93_n3318ArtPreCap,
            P03H93_A3126ArtGraCru2, P03H93_n3126ArtGraCru2, P03H93_A3125ArtGraAca2, P03H93_n3125ArtGraAca2, P03H93_A3124ArtAncSal3, P03H93_n3124ArtAncSal3, P03H93_A3123ArtAncSal2, P03H93_n3123ArtAncSal2, P03H93_A3122ArtAncSal1, P03H93_n3122ArtAncSal1,
            P03H93_A3121ArtNumCor, P03H93_n3121ArtNumCor, P03H93_A2834ArtPle2, P03H93_n2834ArtPle2, P03H93_A3029ArtCosBase, P03H93_n3029ArtCosBase, P03H93_A2791ArtFacAbs, P03H93_n2791ArtFacAbs, P03H93_A2707NumTexCod, P03H93_n2707NumTexCod,
            P03H93_A2751ArtNumTex2, P03H93_n2751ArtNumTex2, P03H93_A2750ArtNumTex1, P03H93_n2750ArtNumTex1, P03H93_A1905ArtRdoA, P03H93_n1905ArtRdoA, P03H93_A1904ArtRdoN, P03H93_n1904ArtRdoN, P03H93_A1903ArtGraAca, P03H93_n1903ArtGraAca,
            P03H93_A1230ArtEncAnh, P03H93_n1230ArtEncAnh, P03H93_A1229ArtEncCom, P03H93_n1229ArtEncCom, P03H93_A1148ArtPml, P03H93_n1148ArtPml, P03H93_A967ArtNMtr, P03H93_n967ArtNMtr, P03H93_A845ULinRec, P03H93_n845ULinRec,
            P03H93_A91ArtPreDef, P03H93_n91ArtPreDef, P03H93_A93ArtPreMtr, P03H93_n93ArtPreMtr, P03H93_A92ArtPreKgm, P03H93_n92ArtPreKgm, P03H93_A90ArtObsFac, P03H93_n90ArtObsFac, P03H93_A89ArtObs, P03H93_n89ArtObs,
            P03H93_A116ArtUrdP3, P03H93_n116ArtUrdP3, P03H93_A115ArtUrdP2, P03H93_n115ArtUrdP2, P03H93_A114ArtUrdP1, P03H93_n114ArtUrdP1, P03H93_A113ArtUrd3, P03H93_n113ArtUrd3, P03H93_A112ArtUrd2, P03H93_n112ArtUrd2,
            P03H93_A111ArtUrd1, P03H93_n111ArtUrd1, P03H93_A110ArtTraP3, P03H93_n110ArtTraP3, P03H93_A109ArtTraP2, P03H93_n109ArtTraP2, P03H93_A108ArtTraP1, P03H93_n108ArtTraP1, P03H93_A107ArtTra3, P03H93_n107ArtTra3,
            P03H93_A106ArtTra2, P03H93_n106ArtTra2, P03H93_A105ArtTra1, P03H93_n105ArtTra1, P03H93_A88ArtMer, P03H93_n88ArtMer, P03H93_A117ArtUrg, P03H93_n117ArtUrg, P03H93_A73ArtEti, P03H93_n73ArtEti,
            P03H93_A64ArtAcaQui, P03H93_n64ArtAcaQui, P03H93_A96ArtSua, P03H93_n96ArtSua, P03H93_A70ArtEncOri, P03H93_n70ArtEncOri, P03H93_A66ArtCorOri, P03H93_n66ArtCorOri, P03H93_A100ArtTipLar, P03H93_n100ArtTipLar,
            P03H93_A101ArtTipPle, P03H93_n101ArtTipPle, P03H93_A95ArtRen, P03H93_n95ArtRen, P03H93_A62ArtAcaMax, P03H93_n62ArtAcaMax, P03H93_A63ArtAcaMin, P03H93_n63ArtAcaMin, P03H93_A67ArtCruMax, P03H93_n67ArtCruMax,
            P03H93_A68ArtCruMin, P03H93_n68ArtCruMin, P03H93_A78ArtGraCru, P03H93_n78ArtGraCru, P03H93_A69ArtDsc, P03H93_n69ArtDsc, P03H93_A829TipArtCod, P03H93_A87ArtMat, P03H93_n87ArtMat, P03H93_A396EmprCod,
            P03H93_A65ArtCod, P03H93_A252CliCod, P03H93_A14295ArtActivo, P03H93_A14103ArtPrepp, P03H93_n14103ArtPrepp, P03H93_A14102ArtKgspp, P03H93_n14102ArtKgspp, P03H93_A14101ArtgrComp, P03H93_n14101ArtgrComp, P03H93_A14100Artdsc2,
            P03H93_n14100Artdsc2, P03H93_A14099ArtRdto4, P03H93_n14099ArtRdto4, P03H93_A12886ArtObsOtra, P03H93_n12886ArtObsOtra, P03H93_A12699ArtEncAnc, P03H93_n12699ArtEncAnc, P03H93_A12698ArtEncLarg, P03H93_n12698ArtEncLarg, P03H93_A12697ArtRdoCru,
            P03H93_n12697ArtRdoCru, P03H93_A12696ArtElgLar, P03H93_n12696ArtElgLar, P03H93_A12695ArtElgAnc, P03H93_n12695ArtElgAnc, P03H93_A12366ArtKgMn, P03H93_n12366ArtKgMn, P03H93_A12365ArtTRabs, P03H93_n12365ArtTRabs, P03H93_A12364ArtMT,
            P03H93_n12364ArtMT, P03H93_A12353Mat_ObsG, P03H93_n12353Mat_ObsG, P03H93_A12199ArtPreUnd, P03H93_n12199ArtPreUnd, P03H93_A1581ArtNumTip, P03H93_n1581ArtNumTip, P03H93_A4115ArtDefEst, P03H93_n4115ArtDefEst, P03H93_A4114ArtPreEst,
            P03H93_n4114ArtPreEst, P03H93_A11627ArtFacUti, P03H93_n11627ArtFacUti, P03H93_A10834ArtPreObs, P03H93_n10834ArtPreObs, P03H93_A10833ArtRdoC, P03H93_n10833ArtRdoC, P03H93_A10832ArtGrm2C, P03H93_n10832ArtGrm2C, P03H93_A10831ArtAncC,
            P03H93_n10831ArtAncC, P03H93_A10805ArtPasad, P03H93_n10805ArtPasad, P03H93_A10804ArtHilos, P03H93_n10804ArtHilos, P03H93_A10558CapFecA, P03H93_n10558CapFecA, P03H93_A10557CapUsuA, P03H93_n10557CapUsuA, P03H93_A10562Mat_FecM,
            P03H93_n10562Mat_FecM, P03H93_A10561Mat_UsuM, P03H93_n10561Mat_UsuM, P03H93_A10560CapFecM, P03H93_n10560CapFecM, P03H93_A10559CapUsuM, P03H93_n10559CapUsuM, P03H93_A10379Art_Cd, P03H93_n10379Art_Cd, P03H93_A10030ArtTh,
            P03H93_n10030ArtTh, P03H93_A10029ArtPgd, P03H93_n10029ArtPgd, P03H93_A10028ArtPlatina, P03H93_n10028ArtPlatina, P03H93_A10027ArtGalga, P03H93_n10027ArtGalga, P03H93_A4980ArtCdb, P03H93_n4980ArtCdb, P03H93_A398ArtObsAnc,
            P03H93_n398ArtObsAnc, P03H93_A397ArtObsGrm, P03H93_n397ArtObsGrm, P03H93_A9904ArtAb, P03H93_n9904ArtAb, P03H93_A9903ArtVbn, P03H93_n9903ArtVbn, P03H93_A9902ArtVbd, P03H93_n9902ArtVbd, P03H93_A9875ArtNProg,
            P03H93_n9875ArtNProg, P03H93_A9801ArtFabsT, P03H93_n9801ArtFabsT, P03H93_A9730ArtFabsH, P03H93_n9730ArtFabsH, P03H93_A8862CapKgs10, P03H93_n8862CapKgs10, P03H93_A8861CapKgs9, P03H93_n8861CapKgs9, P03H93_A8860CapKgs8,
            P03H93_n8860CapKgs8, P03H93_A8859CapKgs7, P03H93_n8859CapKgs7, P03H93_A8858CapKgs6, P03H93_n8858CapKgs6, P03H93_A8857CapKgs5, P03H93_n8857CapKgs5, P03H93_A8856CapKgs4, P03H93_n8856CapKgs4, P03H93_A8855CapKgs3,
            P03H93_n8855CapKgs3, P03H93_A8854CapKgs2, P03H93_n8854CapKgs2, P03H93_A8853CapKgs1, P03H93_n8853CapKgs1, P03H93_A7948ArtCla, P03H93_n7948ArtCla, P03H93_A7779ArtBlo, P03H93_n7779ArtBlo, P03H93_A7778ArtUnd,
            P03H93_n7778ArtUnd, P03H93_A7777ArtRdtSc, P03H93_n7777ArtRdtSc, P03H93_A7415ArtPmlCru, P03H93_n7415ArtPmlCru, P03H93_A7414ArtAncSc, P03H93_n7414ArtAncSc, P03H93_A7413ArtPmlSc, P03H93_n7413ArtPmlSc, P03H93_A7412Artgrm2Sc,
            P03H93_n7412Artgrm2Sc, P03H93_A7134UltLinFT, P03H93_n7134UltLinFT, P03H93_A6953Mat_Maq, P03H93_n6953Mat_Maq, P03H93_A6952Mat_UltL, P03H93_n6952Mat_UltL, P03H93_A6660ArtFacTor, P03H93_n6660ArtFacTor, P03H93_A6462ArtLu,
            P03H93_n6462ArtLu, P03H93_A6436ArtRdoCru2, P03H93_n6436ArtRdoCru2, P03H93_A6435ArtRdoCru1, P03H93_n6435ArtRdoCru1, P03H93_A6108ClaBolCod, P03H93_n6108ClaBolCod, P03H93_A6106ClaTubCod, P03H93_n6106ClaTubCod, P03H93_A5741ArtComer,
            P03H93_n5741ArtComer, P03H93_A5335ArtCodExt, P03H93_n5335ArtCodExt, P03H93_A4809ArtValMtr, P03H93_n4809ArtValMtr, P03H93_A4607ArtRb, P03H93_n4607ArtRb, P03H93_A4455ArtAcaFor, P03H93_n4455ArtAcaFor, P03H93_A4454ArtLotKgs,
            P03H93_n4454ArtLotKgs, P03H93_A4453ArtLotMts, P03H93_n4453ArtLotMts, P03H93_A4452ArtLotPza, P03H93_n4452ArtLotPza, P03H93_A4451ArtCruEnr, P03H93_n4451ArtCruEnr, P03H93_A4450ArtCruKgs, P03H93_n4450ArtCruKgs, P03H93_A4449ArtCruMts,
            P03H93_n4449ArtCruMts, P03H93_A4448ArtLotMaq, P03H93_n4448ArtLotMaq, P03H93_A4447ArtAcaBak, P03H93_n4447ArtAcaBak, P03H93_A4446ArtAcaMar, P03H93_n4446ArtAcaMar, P03H93_A4445ArtAcaAnh, P03H93_n4445ArtAcaAnh, P03H93_A4444ArtPelAnh,
            P03H93_n4444ArtPelAnh, P03H93_A4352ArtPreUsrM, P03H93_n4352ArtPreUsrM, P03H93_A4351ArtPreUlAc, P03H93_n4351ArtPreUlAc, P03H93_A4354ArtFecMod, P03H93_n4354ArtFecMod, P03H93_A4353ArtUsrCod, P03H93_n4353ArtUsrCod, P03H93_A4297ArtPmPPza,
            P03H93_n4297ArtPmPPza, P03H93_A4295ClasCod, P03H93_n4295ClasCod, P03H93_A1079ULinPre, P03H93_n1079ULinPre
            }
            , new Object[] {
            }
            , new Object[] {
            P03H95_A396EmprCod, P03H95_A65ArtCod, P03H95_A252CliCod, P03H95_A12752Art_Tipo, P03H95_n12752Art_Tipo, P03H95_A12142ProStFec, P03H95_A12141ProSta, P03H95_A11272ProFabs, P03H95_A10556ProFecM, P03H95_A10555ProUserM,
            P03H95_A10554ProFecA, P03H95_A10553ProUserA, P03H95_A10412ProAct, P03H95_A10026DscCFa, P03H95_A9629Art_els, P03H95_n9629Art_els, P03H95_A9628Art_ets, P03H95_n9628Art_ets, P03H95_A8955Art_Obs, P03H95_n8955Art_Obs,
            P03H95_A8166Art_Und, P03H95_n8166Art_Und, P03H95_A8165Art_Dsc, P03H95_n8165Art_Dsc, P03H95_A8084Art_RdoP, P03H95_n8084Art_RdoP, P03H95_A8083Art_AncP, P03H95_n8083Art_AncP, P03H95_A8082Art_PmlP, P03H95_n8082Art_PmlP,
            P03H95_A8081Art_GrmP, P03H95_n8081Art_GrmP, P03H95_A8080Art_PmlC, P03H95_n8080Art_PmlC, P03H95_A8079Art_AncC, P03H95_n8079Art_AncC, P03H95_A8078Art_GrmC, P03H95_n8078Art_GrmC, P03H95_A8077Art_GrmB, P03H95_n8077Art_GrmB,
            P03H95_A8076Art_AncB, P03H95_n8076Art_AncB, P03H95_A8075Art_Fabs, P03H95_n8075Art_Fabs, P03H95_A8074Art_Rdpc, P03H95_n8074Art_Rdpc, P03H95_A8073Art_Rdo, P03H95_n8073Art_Rdo, P03H95_A8072Art_Cor, P03H95_n8072Art_Cor,
            P03H95_A8071Art_Enc, P03H95_n8071Art_Enc, P03H95_A8070Art_Elar, P03H95_n8070Art_Elar, P03H95_A8069Art_Eanc, P03H95_n8069Art_Eanc, P03H95_A8068Art_PmlA, P03H95_n8068Art_PmlA, P03H95_A8067Art_Merma, P03H95_n8067Art_Merma,
            P03H95_A8066Art_AncA, P03H95_n8066Art_AncA, P03H95_A8065Art_GrmA, P03H95_n8065Art_GrmA, P03H95_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2750ArtNumTex1 ;
   private byte A845ULinRec ;
   private byte A117ArtUrg ;
   private byte A12365ArtTRabs ;
   private byte A12364ArtMT ;
   private byte A9875ArtNProg ;
   private byte A7948ArtCla ;
   private byte A1079ULinPre ;
   private byte A12141ProSta ;
   private short A3126ArtGraCru2 ;
   private short A3125ArtGraAca2 ;
   private short A3124ArtAncSal3 ;
   private short A3123ArtAncSal2 ;
   private short A3122ArtAncSal1 ;
   private short A3121ArtNumCor ;
   private short A2751ArtNumTex2 ;
   private short A1903ArtGraAca ;
   private short A1230ArtEncAnh ;
   private short A1229ArtEncCom ;
   private short A1148ArtPml ;
   private short A116ArtUrdP3 ;
   private short A115ArtUrdP2 ;
   private short A114ArtUrdP1 ;
   private short A110ArtTraP3 ;
   private short A109ArtTraP2 ;
   private short A108ArtTraP1 ;
   private short A62ArtAcaMax ;
   private short A63ArtAcaMin ;
   private short A67ArtCruMax ;
   private short A68ArtCruMin ;
   private short A78ArtGraCru ;
   private short A829TipArtCod ;
   private short A10832ArtGrm2C ;
   private short A10831ArtAncC ;
   private short A10805ArtPasad ;
   private short A10804ArtHilos ;
   private short A10379Art_Cd ;
   private short A10030ArtTh ;
   private short A9904ArtAb ;
   private short A9903ArtVbn ;
   private short A9902ArtVbd ;
   private short A7415ArtPmlCru ;
   private short A7414ArtAncSc ;
   private short A7413ArtPmlSc ;
   private short A7412Artgrm2Sc ;
   private short A7134UltLinFT ;
   private short A6952Mat_UltL ;
   private short A6108ClaBolCod ;
   private short A6106ClaTubCod ;
   private short A4607ArtRb ;
   private short A4452ArtLotPza ;
   private short A4445ArtAcaAnh ;
   private short A4444ArtPelAnh ;
   private short A4295ClasCod ;
   private short Gx_err ;
   private short A8083Art_AncP ;
   private short A8082Art_PmlP ;
   private short A8081Art_GrmP ;
   private short A8080Art_PmlC ;
   private short A8079Art_AncC ;
   private short A8078Art_GrmC ;
   private short A8077Art_GrmB ;
   private short A8076Art_AncB ;
   private short A8070Art_Elar ;
   private short A8069Art_Eanc ;
   private short A8068Art_PmlA ;
   private short A8066Art_AncA ;
   private short A8065Art_GrmA ;
   private int AV8Clicod ;
   private int A252CliCod ;
   private int AV10Clicodd ;
   private int GXv_int2[] ;
   private int A1581ArtNumTip ;
   private int A4455ArtAcaFor ;
   private int W252CliCod ;
   private int GX_INS10 ;
   private int GX_INS11 ;
   private java.math.BigDecimal A1078ArtPrMEst ;
   private java.math.BigDecimal A3318ArtPreCap ;
   private java.math.BigDecimal A3029ArtCosBase ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private java.math.BigDecimal A1905ArtRdoA ;
   private java.math.BigDecimal A1904ArtRdoN ;
   private java.math.BigDecimal A93ArtPreMtr ;
   private java.math.BigDecimal A92ArtPreKgm ;
   private java.math.BigDecimal A88ArtMer ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal A14103ArtPrepp ;
   private java.math.BigDecimal A14102ArtKgspp ;
   private java.math.BigDecimal A14101ArtgrComp ;
   private java.math.BigDecimal A14099ArtRdto4 ;
   private java.math.BigDecimal A12699ArtEncAnc ;
   private java.math.BigDecimal A12698ArtEncLarg ;
   private java.math.BigDecimal A12697ArtRdoCru ;
   private java.math.BigDecimal A12696ArtElgLar ;
   private java.math.BigDecimal A12695ArtElgAnc ;
   private java.math.BigDecimal A12366ArtKgMn ;
   private java.math.BigDecimal A12199ArtPreUnd ;
   private java.math.BigDecimal A4114ArtPreEst ;
   private java.math.BigDecimal A11627ArtFacUti ;
   private java.math.BigDecimal A10833ArtRdoC ;
   private java.math.BigDecimal A9801ArtFabsT ;
   private java.math.BigDecimal A9730ArtFabsH ;
   private java.math.BigDecimal A8862CapKgs10 ;
   private java.math.BigDecimal A8861CapKgs9 ;
   private java.math.BigDecimal A8860CapKgs8 ;
   private java.math.BigDecimal A8859CapKgs7 ;
   private java.math.BigDecimal A8858CapKgs6 ;
   private java.math.BigDecimal A8857CapKgs5 ;
   private java.math.BigDecimal A8856CapKgs4 ;
   private java.math.BigDecimal A8855CapKgs3 ;
   private java.math.BigDecimal A8854CapKgs2 ;
   private java.math.BigDecimal A8853CapKgs1 ;
   private java.math.BigDecimal A7777ArtRdtSc ;
   private java.math.BigDecimal A6660ArtFacTor ;
   private java.math.BigDecimal A6462ArtLu ;
   private java.math.BigDecimal A6436ArtRdoCru2 ;
   private java.math.BigDecimal A6435ArtRdoCru1 ;
   private java.math.BigDecimal A4809ArtValMtr ;
   private java.math.BigDecimal A4454ArtLotKgs ;
   private java.math.BigDecimal A4453ArtLotMts ;
   private java.math.BigDecimal A4450ArtCruKgs ;
   private java.math.BigDecimal A4449ArtCruMts ;
   private java.math.BigDecimal A4297ArtPmPPza ;
   private java.math.BigDecimal A11272ProFabs ;
   private java.math.BigDecimal A8084Art_RdoP ;
   private java.math.BigDecimal A8075Art_Fabs ;
   private java.math.BigDecimal A8074Art_Rdpc ;
   private java.math.BigDecimal A8073Art_Rdo ;
   private java.math.BigDecimal A8067Art_Merma ;
   private String A396EmprCod ;
   private String AV9Artcod ;
   private String scmdbuf ;
   private String A10045CliAct ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String A3682ArtAnu ;
   private String A2834ArtPle2 ;
   private String A2707NumTexCod ;
   private String A967ArtNMtr ;
   private String A91ArtPreDef ;
   private String A90ArtObsFac ;
   private String A89ArtObs ;
   private String A113ArtUrd3 ;
   private String A112ArtUrd2 ;
   private String A111ArtUrd1 ;
   private String A107ArtTra3 ;
   private String A106ArtTra2 ;
   private String A105ArtTra1 ;
   private String A73ArtEti ;
   private String A64ArtAcaQui ;
   private String A96ArtSua ;
   private String A70ArtEncOri ;
   private String A66ArtCorOri ;
   private String A100ArtTipLar ;
   private String A101ArtTipPle ;
   private String A69ArtDsc ;
   private String A87ArtMat ;
   private String A65ArtCod ;
   private String A14295ArtActivo ;
   private String A4115ArtDefEst ;
   private String A10557CapUsuA ;
   private String A10561Mat_UsuM ;
   private String A10559CapUsuM ;
   private String A10029ArtPgd ;
   private String A10028ArtPlatina ;
   private String A10027ArtGalga ;
   private String A4980ArtCdb ;
   private String A398ArtObsAnc ;
   private String A397ArtObsGrm ;
   private String A7779ArtBlo ;
   private String A7778ArtUnd ;
   private String A6953Mat_Maq ;
   private String A5741ArtComer ;
   private String A5335ArtCodExt ;
   private String A4451ArtCruEnr ;
   private String A4448ArtLotMaq ;
   private String A4447ArtAcaBak ;
   private String A4446ArtAcaMar ;
   private String A4352ArtPreUsrM ;
   private String A4353ArtUsrCod ;
   private String W396EmprCod ;
   private String W65ArtCod ;
   private String Gx_emsg ;
   private String A12752Art_Tipo ;
   private String A10555ProUserM ;
   private String A10553ProUserA ;
   private String A10412ProAct ;
   private String A10026DscCFa ;
   private String A9629Art_els ;
   private String A9628Art_ets ;
   private String A8166Art_Und ;
   private String A8165Art_Dsc ;
   private String A8072Art_Cor ;
   private String A8071Art_Enc ;
   private String A758ProCod ;
   private String W758ProCod ;
   private java.util.Date A10558CapFecA ;
   private java.util.Date A10562Mat_FecM ;
   private java.util.Date A10560CapFecM ;
   private java.util.Date A12142ProStFec ;
   private java.util.Date A10556ProFecM ;
   private java.util.Date A10554ProFecA ;
   private java.util.Date A3683ArtFecCre ;
   private java.util.Date A4351ArtPreUlAc ;
   private java.util.Date A4354ArtFecMod ;
   private boolean returnInSub ;
   private boolean n3072ArtObsLon ;
   private boolean n1078ArtPrMEst ;
   private boolean n3683ArtFecCre ;
   private boolean n3682ArtAnu ;
   private boolean n3318ArtPreCap ;
   private boolean n3126ArtGraCru2 ;
   private boolean n3125ArtGraAca2 ;
   private boolean n3124ArtAncSal3 ;
   private boolean n3123ArtAncSal2 ;
   private boolean n3122ArtAncSal1 ;
   private boolean n3121ArtNumCor ;
   private boolean n2834ArtPle2 ;
   private boolean n3029ArtCosBase ;
   private boolean n2791ArtFacAbs ;
   private boolean n2707NumTexCod ;
   private boolean n2751ArtNumTex2 ;
   private boolean n2750ArtNumTex1 ;
   private boolean n1905ArtRdoA ;
   private boolean n1904ArtRdoN ;
   private boolean n1903ArtGraAca ;
   private boolean n1230ArtEncAnh ;
   private boolean n1229ArtEncCom ;
   private boolean n1148ArtPml ;
   private boolean n967ArtNMtr ;
   private boolean n845ULinRec ;
   private boolean n91ArtPreDef ;
   private boolean n93ArtPreMtr ;
   private boolean n92ArtPreKgm ;
   private boolean n90ArtObsFac ;
   private boolean n89ArtObs ;
   private boolean n116ArtUrdP3 ;
   private boolean n115ArtUrdP2 ;
   private boolean n114ArtUrdP1 ;
   private boolean n113ArtUrd3 ;
   private boolean n112ArtUrd2 ;
   private boolean n111ArtUrd1 ;
   private boolean n110ArtTraP3 ;
   private boolean n109ArtTraP2 ;
   private boolean n108ArtTraP1 ;
   private boolean n107ArtTra3 ;
   private boolean n106ArtTra2 ;
   private boolean n105ArtTra1 ;
   private boolean n88ArtMer ;
   private boolean n117ArtUrg ;
   private boolean n73ArtEti ;
   private boolean n64ArtAcaQui ;
   private boolean n96ArtSua ;
   private boolean n70ArtEncOri ;
   private boolean n66ArtCorOri ;
   private boolean n100ArtTipLar ;
   private boolean n101ArtTipPle ;
   private boolean n95ArtRen ;
   private boolean n62ArtAcaMax ;
   private boolean n63ArtAcaMin ;
   private boolean n67ArtCruMax ;
   private boolean n68ArtCruMin ;
   private boolean n78ArtGraCru ;
   private boolean n69ArtDsc ;
   private boolean n87ArtMat ;
   private boolean n14103ArtPrepp ;
   private boolean n14102ArtKgspp ;
   private boolean n14101ArtgrComp ;
   private boolean n14100Artdsc2 ;
   private boolean n14099ArtRdto4 ;
   private boolean n12886ArtObsOtra ;
   private boolean n12699ArtEncAnc ;
   private boolean n12698ArtEncLarg ;
   private boolean n12697ArtRdoCru ;
   private boolean n12696ArtElgLar ;
   private boolean n12695ArtElgAnc ;
   private boolean n12366ArtKgMn ;
   private boolean n12365ArtTRabs ;
   private boolean n12364ArtMT ;
   private boolean n12353Mat_ObsG ;
   private boolean n12199ArtPreUnd ;
   private boolean n1581ArtNumTip ;
   private boolean n4115ArtDefEst ;
   private boolean n4114ArtPreEst ;
   private boolean n11627ArtFacUti ;
   private boolean n10834ArtPreObs ;
   private boolean n10833ArtRdoC ;
   private boolean n10832ArtGrm2C ;
   private boolean n10831ArtAncC ;
   private boolean n10805ArtPasad ;
   private boolean n10804ArtHilos ;
   private boolean n10558CapFecA ;
   private boolean n10557CapUsuA ;
   private boolean n10562Mat_FecM ;
   private boolean n10561Mat_UsuM ;
   private boolean n10560CapFecM ;
   private boolean n10559CapUsuM ;
   private boolean n10379Art_Cd ;
   private boolean n10030ArtTh ;
   private boolean n10029ArtPgd ;
   private boolean n10028ArtPlatina ;
   private boolean n10027ArtGalga ;
   private boolean n4980ArtCdb ;
   private boolean n398ArtObsAnc ;
   private boolean n397ArtObsGrm ;
   private boolean n9904ArtAb ;
   private boolean n9903ArtVbn ;
   private boolean n9902ArtVbd ;
   private boolean n9875ArtNProg ;
   private boolean n9801ArtFabsT ;
   private boolean n9730ArtFabsH ;
   private boolean n8862CapKgs10 ;
   private boolean n8861CapKgs9 ;
   private boolean n8860CapKgs8 ;
   private boolean n8859CapKgs7 ;
   private boolean n8858CapKgs6 ;
   private boolean n8857CapKgs5 ;
   private boolean n8856CapKgs4 ;
   private boolean n8855CapKgs3 ;
   private boolean n8854CapKgs2 ;
   private boolean n8853CapKgs1 ;
   private boolean n7948ArtCla ;
   private boolean n7779ArtBlo ;
   private boolean n7778ArtUnd ;
   private boolean n7777ArtRdtSc ;
   private boolean n7415ArtPmlCru ;
   private boolean n7414ArtAncSc ;
   private boolean n7413ArtPmlSc ;
   private boolean n7412Artgrm2Sc ;
   private boolean n7134UltLinFT ;
   private boolean n6953Mat_Maq ;
   private boolean n6952Mat_UltL ;
   private boolean n6660ArtFacTor ;
   private boolean n6462ArtLu ;
   private boolean n6436ArtRdoCru2 ;
   private boolean n6435ArtRdoCru1 ;
   private boolean n6108ClaBolCod ;
   private boolean n6106ClaTubCod ;
   private boolean n5741ArtComer ;
   private boolean n5335ArtCodExt ;
   private boolean n4809ArtValMtr ;
   private boolean n4607ArtRb ;
   private boolean n4455ArtAcaFor ;
   private boolean n4454ArtLotKgs ;
   private boolean n4453ArtLotMts ;
   private boolean n4452ArtLotPza ;
   private boolean n4451ArtCruEnr ;
   private boolean n4450ArtCruKgs ;
   private boolean n4449ArtCruMts ;
   private boolean n4448ArtLotMaq ;
   private boolean n4447ArtAcaBak ;
   private boolean n4446ArtAcaMar ;
   private boolean n4445ArtAcaAnh ;
   private boolean n4444ArtPelAnh ;
   private boolean n4352ArtPreUsrM ;
   private boolean n4351ArtPreUlAc ;
   private boolean n4354ArtFecMod ;
   private boolean n4353ArtUsrCod ;
   private boolean n4297ArtPmPPza ;
   private boolean n4295ClasCod ;
   private boolean n1079ULinPre ;
   private boolean n12752Art_Tipo ;
   private boolean n9629Art_els ;
   private boolean n9628Art_ets ;
   private boolean n8955Art_Obs ;
   private boolean n8166Art_Und ;
   private boolean n8165Art_Dsc ;
   private boolean n8084Art_RdoP ;
   private boolean n8083Art_AncP ;
   private boolean n8082Art_PmlP ;
   private boolean n8081Art_GrmP ;
   private boolean n8080Art_PmlC ;
   private boolean n8079Art_AncC ;
   private boolean n8078Art_GrmC ;
   private boolean n8077Art_GrmB ;
   private boolean n8076Art_AncB ;
   private boolean n8075Art_Fabs ;
   private boolean n8074Art_Rdpc ;
   private boolean n8073Art_Rdo ;
   private boolean n8072Art_Cor ;
   private boolean n8071Art_Enc ;
   private boolean n8070Art_Elar ;
   private boolean n8069Art_Eanc ;
   private boolean n8068Art_PmlA ;
   private boolean n8067Art_Merma ;
   private boolean n8066Art_AncA ;
   private boolean n8065Art_GrmA ;
   private String A3072ArtObsLon ;
   private String A14100Artdsc2 ;
   private String A12886ArtObsOtra ;
   private String A12353Mat_ObsG ;
   private String A10834ArtPreObs ;
   private String A8955Art_Obs ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03H92_A396EmprCod ;
   private String[] P03H92_A10045CliAct ;
   private int[] P03H92_A252CliCod ;
   private String[] P03H93_A3072ArtObsLon ;
   private boolean[] P03H93_n3072ArtObsLon ;
   private java.math.BigDecimal[] P03H93_A1078ArtPrMEst ;
   private boolean[] P03H93_n1078ArtPrMEst ;
   private java.util.Date[] P03H93_A3683ArtFecCre ;
   private boolean[] P03H93_n3683ArtFecCre ;
   private String[] P03H93_A3682ArtAnu ;
   private boolean[] P03H93_n3682ArtAnu ;
   private java.math.BigDecimal[] P03H93_A3318ArtPreCap ;
   private boolean[] P03H93_n3318ArtPreCap ;
   private short[] P03H93_A3126ArtGraCru2 ;
   private boolean[] P03H93_n3126ArtGraCru2 ;
   private short[] P03H93_A3125ArtGraAca2 ;
   private boolean[] P03H93_n3125ArtGraAca2 ;
   private short[] P03H93_A3124ArtAncSal3 ;
   private boolean[] P03H93_n3124ArtAncSal3 ;
   private short[] P03H93_A3123ArtAncSal2 ;
   private boolean[] P03H93_n3123ArtAncSal2 ;
   private short[] P03H93_A3122ArtAncSal1 ;
   private boolean[] P03H93_n3122ArtAncSal1 ;
   private short[] P03H93_A3121ArtNumCor ;
   private boolean[] P03H93_n3121ArtNumCor ;
   private String[] P03H93_A2834ArtPle2 ;
   private boolean[] P03H93_n2834ArtPle2 ;
   private java.math.BigDecimal[] P03H93_A3029ArtCosBase ;
   private boolean[] P03H93_n3029ArtCosBase ;
   private java.math.BigDecimal[] P03H93_A2791ArtFacAbs ;
   private boolean[] P03H93_n2791ArtFacAbs ;
   private String[] P03H93_A2707NumTexCod ;
   private boolean[] P03H93_n2707NumTexCod ;
   private short[] P03H93_A2751ArtNumTex2 ;
   private boolean[] P03H93_n2751ArtNumTex2 ;
   private byte[] P03H93_A2750ArtNumTex1 ;
   private boolean[] P03H93_n2750ArtNumTex1 ;
   private java.math.BigDecimal[] P03H93_A1905ArtRdoA ;
   private boolean[] P03H93_n1905ArtRdoA ;
   private java.math.BigDecimal[] P03H93_A1904ArtRdoN ;
   private boolean[] P03H93_n1904ArtRdoN ;
   private short[] P03H93_A1903ArtGraAca ;
   private boolean[] P03H93_n1903ArtGraAca ;
   private short[] P03H93_A1230ArtEncAnh ;
   private boolean[] P03H93_n1230ArtEncAnh ;
   private short[] P03H93_A1229ArtEncCom ;
   private boolean[] P03H93_n1229ArtEncCom ;
   private short[] P03H93_A1148ArtPml ;
   private boolean[] P03H93_n1148ArtPml ;
   private String[] P03H93_A967ArtNMtr ;
   private boolean[] P03H93_n967ArtNMtr ;
   private byte[] P03H93_A845ULinRec ;
   private boolean[] P03H93_n845ULinRec ;
   private String[] P03H93_A91ArtPreDef ;
   private boolean[] P03H93_n91ArtPreDef ;
   private java.math.BigDecimal[] P03H93_A93ArtPreMtr ;
   private boolean[] P03H93_n93ArtPreMtr ;
   private java.math.BigDecimal[] P03H93_A92ArtPreKgm ;
   private boolean[] P03H93_n92ArtPreKgm ;
   private String[] P03H93_A90ArtObsFac ;
   private boolean[] P03H93_n90ArtObsFac ;
   private String[] P03H93_A89ArtObs ;
   private boolean[] P03H93_n89ArtObs ;
   private short[] P03H93_A116ArtUrdP3 ;
   private boolean[] P03H93_n116ArtUrdP3 ;
   private short[] P03H93_A115ArtUrdP2 ;
   private boolean[] P03H93_n115ArtUrdP2 ;
   private short[] P03H93_A114ArtUrdP1 ;
   private boolean[] P03H93_n114ArtUrdP1 ;
   private String[] P03H93_A113ArtUrd3 ;
   private boolean[] P03H93_n113ArtUrd3 ;
   private String[] P03H93_A112ArtUrd2 ;
   private boolean[] P03H93_n112ArtUrd2 ;
   private String[] P03H93_A111ArtUrd1 ;
   private boolean[] P03H93_n111ArtUrd1 ;
   private short[] P03H93_A110ArtTraP3 ;
   private boolean[] P03H93_n110ArtTraP3 ;
   private short[] P03H93_A109ArtTraP2 ;
   private boolean[] P03H93_n109ArtTraP2 ;
   private short[] P03H93_A108ArtTraP1 ;
   private boolean[] P03H93_n108ArtTraP1 ;
   private String[] P03H93_A107ArtTra3 ;
   private boolean[] P03H93_n107ArtTra3 ;
   private String[] P03H93_A106ArtTra2 ;
   private boolean[] P03H93_n106ArtTra2 ;
   private String[] P03H93_A105ArtTra1 ;
   private boolean[] P03H93_n105ArtTra1 ;
   private java.math.BigDecimal[] P03H93_A88ArtMer ;
   private boolean[] P03H93_n88ArtMer ;
   private byte[] P03H93_A117ArtUrg ;
   private boolean[] P03H93_n117ArtUrg ;
   private String[] P03H93_A73ArtEti ;
   private boolean[] P03H93_n73ArtEti ;
   private String[] P03H93_A64ArtAcaQui ;
   private boolean[] P03H93_n64ArtAcaQui ;
   private String[] P03H93_A96ArtSua ;
   private boolean[] P03H93_n96ArtSua ;
   private String[] P03H93_A70ArtEncOri ;
   private boolean[] P03H93_n70ArtEncOri ;
   private String[] P03H93_A66ArtCorOri ;
   private boolean[] P03H93_n66ArtCorOri ;
   private String[] P03H93_A100ArtTipLar ;
   private boolean[] P03H93_n100ArtTipLar ;
   private String[] P03H93_A101ArtTipPle ;
   private boolean[] P03H93_n101ArtTipPle ;
   private java.math.BigDecimal[] P03H93_A95ArtRen ;
   private boolean[] P03H93_n95ArtRen ;
   private short[] P03H93_A62ArtAcaMax ;
   private boolean[] P03H93_n62ArtAcaMax ;
   private short[] P03H93_A63ArtAcaMin ;
   private boolean[] P03H93_n63ArtAcaMin ;
   private short[] P03H93_A67ArtCruMax ;
   private boolean[] P03H93_n67ArtCruMax ;
   private short[] P03H93_A68ArtCruMin ;
   private boolean[] P03H93_n68ArtCruMin ;
   private short[] P03H93_A78ArtGraCru ;
   private boolean[] P03H93_n78ArtGraCru ;
   private String[] P03H93_A69ArtDsc ;
   private boolean[] P03H93_n69ArtDsc ;
   private short[] P03H93_A829TipArtCod ;
   private String[] P03H93_A87ArtMat ;
   private boolean[] P03H93_n87ArtMat ;
   private String[] P03H93_A396EmprCod ;
   private String[] P03H93_A65ArtCod ;
   private int[] P03H93_A252CliCod ;
   private String[] P03H93_A14295ArtActivo ;
   private java.math.BigDecimal[] P03H93_A14103ArtPrepp ;
   private boolean[] P03H93_n14103ArtPrepp ;
   private java.math.BigDecimal[] P03H93_A14102ArtKgspp ;
   private boolean[] P03H93_n14102ArtKgspp ;
   private java.math.BigDecimal[] P03H93_A14101ArtgrComp ;
   private boolean[] P03H93_n14101ArtgrComp ;
   private String[] P03H93_A14100Artdsc2 ;
   private boolean[] P03H93_n14100Artdsc2 ;
   private java.math.BigDecimal[] P03H93_A14099ArtRdto4 ;
   private boolean[] P03H93_n14099ArtRdto4 ;
   private String[] P03H93_A12886ArtObsOtra ;
   private boolean[] P03H93_n12886ArtObsOtra ;
   private java.math.BigDecimal[] P03H93_A12699ArtEncAnc ;
   private boolean[] P03H93_n12699ArtEncAnc ;
   private java.math.BigDecimal[] P03H93_A12698ArtEncLarg ;
   private boolean[] P03H93_n12698ArtEncLarg ;
   private java.math.BigDecimal[] P03H93_A12697ArtRdoCru ;
   private boolean[] P03H93_n12697ArtRdoCru ;
   private java.math.BigDecimal[] P03H93_A12696ArtElgLar ;
   private boolean[] P03H93_n12696ArtElgLar ;
   private java.math.BigDecimal[] P03H93_A12695ArtElgAnc ;
   private boolean[] P03H93_n12695ArtElgAnc ;
   private java.math.BigDecimal[] P03H93_A12366ArtKgMn ;
   private boolean[] P03H93_n12366ArtKgMn ;
   private byte[] P03H93_A12365ArtTRabs ;
   private boolean[] P03H93_n12365ArtTRabs ;
   private byte[] P03H93_A12364ArtMT ;
   private boolean[] P03H93_n12364ArtMT ;
   private String[] P03H93_A12353Mat_ObsG ;
   private boolean[] P03H93_n12353Mat_ObsG ;
   private java.math.BigDecimal[] P03H93_A12199ArtPreUnd ;
   private boolean[] P03H93_n12199ArtPreUnd ;
   private int[] P03H93_A1581ArtNumTip ;
   private boolean[] P03H93_n1581ArtNumTip ;
   private String[] P03H93_A4115ArtDefEst ;
   private boolean[] P03H93_n4115ArtDefEst ;
   private java.math.BigDecimal[] P03H93_A4114ArtPreEst ;
   private boolean[] P03H93_n4114ArtPreEst ;
   private java.math.BigDecimal[] P03H93_A11627ArtFacUti ;
   private boolean[] P03H93_n11627ArtFacUti ;
   private String[] P03H93_A10834ArtPreObs ;
   private boolean[] P03H93_n10834ArtPreObs ;
   private java.math.BigDecimal[] P03H93_A10833ArtRdoC ;
   private boolean[] P03H93_n10833ArtRdoC ;
   private short[] P03H93_A10832ArtGrm2C ;
   private boolean[] P03H93_n10832ArtGrm2C ;
   private short[] P03H93_A10831ArtAncC ;
   private boolean[] P03H93_n10831ArtAncC ;
   private short[] P03H93_A10805ArtPasad ;
   private boolean[] P03H93_n10805ArtPasad ;
   private short[] P03H93_A10804ArtHilos ;
   private boolean[] P03H93_n10804ArtHilos ;
   private java.util.Date[] P03H93_A10558CapFecA ;
   private boolean[] P03H93_n10558CapFecA ;
   private String[] P03H93_A10557CapUsuA ;
   private boolean[] P03H93_n10557CapUsuA ;
   private java.util.Date[] P03H93_A10562Mat_FecM ;
   private boolean[] P03H93_n10562Mat_FecM ;
   private String[] P03H93_A10561Mat_UsuM ;
   private boolean[] P03H93_n10561Mat_UsuM ;
   private java.util.Date[] P03H93_A10560CapFecM ;
   private boolean[] P03H93_n10560CapFecM ;
   private String[] P03H93_A10559CapUsuM ;
   private boolean[] P03H93_n10559CapUsuM ;
   private short[] P03H93_A10379Art_Cd ;
   private boolean[] P03H93_n10379Art_Cd ;
   private short[] P03H93_A10030ArtTh ;
   private boolean[] P03H93_n10030ArtTh ;
   private String[] P03H93_A10029ArtPgd ;
   private boolean[] P03H93_n10029ArtPgd ;
   private String[] P03H93_A10028ArtPlatina ;
   private boolean[] P03H93_n10028ArtPlatina ;
   private String[] P03H93_A10027ArtGalga ;
   private boolean[] P03H93_n10027ArtGalga ;
   private String[] P03H93_A4980ArtCdb ;
   private boolean[] P03H93_n4980ArtCdb ;
   private String[] P03H93_A398ArtObsAnc ;
   private boolean[] P03H93_n398ArtObsAnc ;
   private String[] P03H93_A397ArtObsGrm ;
   private boolean[] P03H93_n397ArtObsGrm ;
   private short[] P03H93_A9904ArtAb ;
   private boolean[] P03H93_n9904ArtAb ;
   private short[] P03H93_A9903ArtVbn ;
   private boolean[] P03H93_n9903ArtVbn ;
   private short[] P03H93_A9902ArtVbd ;
   private boolean[] P03H93_n9902ArtVbd ;
   private byte[] P03H93_A9875ArtNProg ;
   private boolean[] P03H93_n9875ArtNProg ;
   private java.math.BigDecimal[] P03H93_A9801ArtFabsT ;
   private boolean[] P03H93_n9801ArtFabsT ;
   private java.math.BigDecimal[] P03H93_A9730ArtFabsH ;
   private boolean[] P03H93_n9730ArtFabsH ;
   private java.math.BigDecimal[] P03H93_A8862CapKgs10 ;
   private boolean[] P03H93_n8862CapKgs10 ;
   private java.math.BigDecimal[] P03H93_A8861CapKgs9 ;
   private boolean[] P03H93_n8861CapKgs9 ;
   private java.math.BigDecimal[] P03H93_A8860CapKgs8 ;
   private boolean[] P03H93_n8860CapKgs8 ;
   private java.math.BigDecimal[] P03H93_A8859CapKgs7 ;
   private boolean[] P03H93_n8859CapKgs7 ;
   private java.math.BigDecimal[] P03H93_A8858CapKgs6 ;
   private boolean[] P03H93_n8858CapKgs6 ;
   private java.math.BigDecimal[] P03H93_A8857CapKgs5 ;
   private boolean[] P03H93_n8857CapKgs5 ;
   private java.math.BigDecimal[] P03H93_A8856CapKgs4 ;
   private boolean[] P03H93_n8856CapKgs4 ;
   private java.math.BigDecimal[] P03H93_A8855CapKgs3 ;
   private boolean[] P03H93_n8855CapKgs3 ;
   private java.math.BigDecimal[] P03H93_A8854CapKgs2 ;
   private boolean[] P03H93_n8854CapKgs2 ;
   private java.math.BigDecimal[] P03H93_A8853CapKgs1 ;
   private boolean[] P03H93_n8853CapKgs1 ;
   private byte[] P03H93_A7948ArtCla ;
   private boolean[] P03H93_n7948ArtCla ;
   private String[] P03H93_A7779ArtBlo ;
   private boolean[] P03H93_n7779ArtBlo ;
   private String[] P03H93_A7778ArtUnd ;
   private boolean[] P03H93_n7778ArtUnd ;
   private java.math.BigDecimal[] P03H93_A7777ArtRdtSc ;
   private boolean[] P03H93_n7777ArtRdtSc ;
   private short[] P03H93_A7415ArtPmlCru ;
   private boolean[] P03H93_n7415ArtPmlCru ;
   private short[] P03H93_A7414ArtAncSc ;
   private boolean[] P03H93_n7414ArtAncSc ;
   private short[] P03H93_A7413ArtPmlSc ;
   private boolean[] P03H93_n7413ArtPmlSc ;
   private short[] P03H93_A7412Artgrm2Sc ;
   private boolean[] P03H93_n7412Artgrm2Sc ;
   private short[] P03H93_A7134UltLinFT ;
   private boolean[] P03H93_n7134UltLinFT ;
   private String[] P03H93_A6953Mat_Maq ;
   private boolean[] P03H93_n6953Mat_Maq ;
   private short[] P03H93_A6952Mat_UltL ;
   private boolean[] P03H93_n6952Mat_UltL ;
   private java.math.BigDecimal[] P03H93_A6660ArtFacTor ;
   private boolean[] P03H93_n6660ArtFacTor ;
   private java.math.BigDecimal[] P03H93_A6462ArtLu ;
   private boolean[] P03H93_n6462ArtLu ;
   private java.math.BigDecimal[] P03H93_A6436ArtRdoCru2 ;
   private boolean[] P03H93_n6436ArtRdoCru2 ;
   private java.math.BigDecimal[] P03H93_A6435ArtRdoCru1 ;
   private boolean[] P03H93_n6435ArtRdoCru1 ;
   private short[] P03H93_A6108ClaBolCod ;
   private boolean[] P03H93_n6108ClaBolCod ;
   private short[] P03H93_A6106ClaTubCod ;
   private boolean[] P03H93_n6106ClaTubCod ;
   private String[] P03H93_A5741ArtComer ;
   private boolean[] P03H93_n5741ArtComer ;
   private String[] P03H93_A5335ArtCodExt ;
   private boolean[] P03H93_n5335ArtCodExt ;
   private java.math.BigDecimal[] P03H93_A4809ArtValMtr ;
   private boolean[] P03H93_n4809ArtValMtr ;
   private short[] P03H93_A4607ArtRb ;
   private boolean[] P03H93_n4607ArtRb ;
   private int[] P03H93_A4455ArtAcaFor ;
   private boolean[] P03H93_n4455ArtAcaFor ;
   private java.math.BigDecimal[] P03H93_A4454ArtLotKgs ;
   private boolean[] P03H93_n4454ArtLotKgs ;
   private java.math.BigDecimal[] P03H93_A4453ArtLotMts ;
   private boolean[] P03H93_n4453ArtLotMts ;
   private short[] P03H93_A4452ArtLotPza ;
   private boolean[] P03H93_n4452ArtLotPza ;
   private String[] P03H93_A4451ArtCruEnr ;
   private boolean[] P03H93_n4451ArtCruEnr ;
   private java.math.BigDecimal[] P03H93_A4450ArtCruKgs ;
   private boolean[] P03H93_n4450ArtCruKgs ;
   private java.math.BigDecimal[] P03H93_A4449ArtCruMts ;
   private boolean[] P03H93_n4449ArtCruMts ;
   private String[] P03H93_A4448ArtLotMaq ;
   private boolean[] P03H93_n4448ArtLotMaq ;
   private String[] P03H93_A4447ArtAcaBak ;
   private boolean[] P03H93_n4447ArtAcaBak ;
   private String[] P03H93_A4446ArtAcaMar ;
   private boolean[] P03H93_n4446ArtAcaMar ;
   private short[] P03H93_A4445ArtAcaAnh ;
   private boolean[] P03H93_n4445ArtAcaAnh ;
   private short[] P03H93_A4444ArtPelAnh ;
   private boolean[] P03H93_n4444ArtPelAnh ;
   private String[] P03H93_A4352ArtPreUsrM ;
   private boolean[] P03H93_n4352ArtPreUsrM ;
   private java.util.Date[] P03H93_A4351ArtPreUlAc ;
   private boolean[] P03H93_n4351ArtPreUlAc ;
   private java.util.Date[] P03H93_A4354ArtFecMod ;
   private boolean[] P03H93_n4354ArtFecMod ;
   private String[] P03H93_A4353ArtUsrCod ;
   private boolean[] P03H93_n4353ArtUsrCod ;
   private java.math.BigDecimal[] P03H93_A4297ArtPmPPza ;
   private boolean[] P03H93_n4297ArtPmPPza ;
   private short[] P03H93_A4295ClasCod ;
   private boolean[] P03H93_n4295ClasCod ;
   private byte[] P03H93_A1079ULinPre ;
   private boolean[] P03H93_n1079ULinPre ;
   private String[] P03H95_A396EmprCod ;
   private String[] P03H95_A65ArtCod ;
   private int[] P03H95_A252CliCod ;
   private String[] P03H95_A12752Art_Tipo ;
   private boolean[] P03H95_n12752Art_Tipo ;
   private java.util.Date[] P03H95_A12142ProStFec ;
   private byte[] P03H95_A12141ProSta ;
   private java.math.BigDecimal[] P03H95_A11272ProFabs ;
   private java.util.Date[] P03H95_A10556ProFecM ;
   private String[] P03H95_A10555ProUserM ;
   private java.util.Date[] P03H95_A10554ProFecA ;
   private String[] P03H95_A10553ProUserA ;
   private String[] P03H95_A10412ProAct ;
   private String[] P03H95_A10026DscCFa ;
   private String[] P03H95_A9629Art_els ;
   private boolean[] P03H95_n9629Art_els ;
   private String[] P03H95_A9628Art_ets ;
   private boolean[] P03H95_n9628Art_ets ;
   private String[] P03H95_A8955Art_Obs ;
   private boolean[] P03H95_n8955Art_Obs ;
   private String[] P03H95_A8166Art_Und ;
   private boolean[] P03H95_n8166Art_Und ;
   private String[] P03H95_A8165Art_Dsc ;
   private boolean[] P03H95_n8165Art_Dsc ;
   private java.math.BigDecimal[] P03H95_A8084Art_RdoP ;
   private boolean[] P03H95_n8084Art_RdoP ;
   private short[] P03H95_A8083Art_AncP ;
   private boolean[] P03H95_n8083Art_AncP ;
   private short[] P03H95_A8082Art_PmlP ;
   private boolean[] P03H95_n8082Art_PmlP ;
   private short[] P03H95_A8081Art_GrmP ;
   private boolean[] P03H95_n8081Art_GrmP ;
   private short[] P03H95_A8080Art_PmlC ;
   private boolean[] P03H95_n8080Art_PmlC ;
   private short[] P03H95_A8079Art_AncC ;
   private boolean[] P03H95_n8079Art_AncC ;
   private short[] P03H95_A8078Art_GrmC ;
   private boolean[] P03H95_n8078Art_GrmC ;
   private short[] P03H95_A8077Art_GrmB ;
   private boolean[] P03H95_n8077Art_GrmB ;
   private short[] P03H95_A8076Art_AncB ;
   private boolean[] P03H95_n8076Art_AncB ;
   private java.math.BigDecimal[] P03H95_A8075Art_Fabs ;
   private boolean[] P03H95_n8075Art_Fabs ;
   private java.math.BigDecimal[] P03H95_A8074Art_Rdpc ;
   private boolean[] P03H95_n8074Art_Rdpc ;
   private java.math.BigDecimal[] P03H95_A8073Art_Rdo ;
   private boolean[] P03H95_n8073Art_Rdo ;
   private String[] P03H95_A8072Art_Cor ;
   private boolean[] P03H95_n8072Art_Cor ;
   private String[] P03H95_A8071Art_Enc ;
   private boolean[] P03H95_n8071Art_Enc ;
   private short[] P03H95_A8070Art_Elar ;
   private boolean[] P03H95_n8070Art_Elar ;
   private short[] P03H95_A8069Art_Eanc ;
   private boolean[] P03H95_n8069Art_Eanc ;
   private short[] P03H95_A8068Art_PmlA ;
   private boolean[] P03H95_n8068Art_PmlA ;
   private java.math.BigDecimal[] P03H95_A8067Art_Merma ;
   private boolean[] P03H95_n8067Art_Merma ;
   private short[] P03H95_A8066Art_AncA ;
   private boolean[] P03H95_n8066Art_AncA ;
   private short[] P03H95_A8065Art_GrmA ;
   private boolean[] P03H95_n8065Art_GrmA ;
   private String[] P03H95_A758ProCod ;
}

final  class pmd2100__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03H92", "SELECT EmprCod, CliAct, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod <> ?) AND (CliAct = 'S') ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03H93", "SELECT ArtObsLon, ArtPrMEst, ArtFecCre, ArtAnu, ArtPreCap, ArtGraCru2, ArtGraAca2, ArtAncSal3, ArtAncSal2, ArtAncSal1, ArtNumCor, ArtPle2, ArtCosBase, ArtFacAbs, NumTexCod, ArtNumTex2, ArtNumTex1, ArtRdoA, ArtRdoN, ArtGraAca, ArtEncAnh, ArtEncCom, ArtPml, ArtNMtr, ULinRec, ArtPreDef, ArtPreMtr, ArtPreKgm, ArtObsFac, ArtObs, ArtUrdP3, ArtUrdP2, ArtUrdP1, ArtUrd3, ArtUrd2, ArtUrd1, ArtTraP3, ArtTraP2, ArtTraP1, ArtTra3, ArtTra2, ArtTra1, ArtMer, ArtUrg, ArtEti, ArtAcaQui, ArtSua, ArtEncOri, ArtCorOri, ArtTipLar, ArtTipPle, ArtRen, ArtAcaMax, ArtAcaMin, ArtCruMax, ArtCruMin, ArtGraCru, ArtDsc, TipArtCod, ArtMat, EmprCod, ArtCod, CliCod, ArtActivo, ArtPrepp, ArtKgspp, ArtgrComp, Artdsc2, ArtRdto4, ArtObsOtra, ArtEncAnc, ArtEncLarg, ArtRdoCru, ArtElgLar, ArtElgAnc, ArtKgMn, ArtTRabs, ArtMT, Mat_ObsG, ArtPreUnd, ArtNumTip, ArtDefEst, ArtPreEst, ArtFacUti, ArtPreObs, ArtRdoC, ArtGrm2C, ArtAncC, ArtPasad, ArtHilos, CapFecA, CapUsuA, Mat_FecM, Mat_UsuM, CapFecM, CapUsuM, Art_Cd, ArtTh, ArtPgd, ArtPlatina, ArtGalga, ArtCdb, ArtObsAnc, ArtObsGrm, ArtAb, ArtVbn, ArtVbd, ArtNProg, ArtFabsT, ArtFabsH, CapKgs10, CapKgs9, CapKgs8, CapKgs7, CapKgs6, CapKgs5, CapKgs4, CapKgs3, CapKgs2, CapKgs1, ArtCla, ArtBlo, ArtUnd, ArtRdtSc, ArtPmlCru, ArtAncSc, ArtPmlSc, Artgrm2Sc, UltLinFT, Mat_Maq, Mat_UltL, ArtFacTor, ArtLu, ArtRdoCru2, ArtRdoCru1, ClaBolCod, ClaTubCod, ArtComer, ArtCodExt, ArtValMtr, ArtRb, ArtAcaFor, ArtLotKgs, ArtLotMts, ArtLotPza, ArtCruEnr, ArtCruKgs, ArtCruMts, ArtLotMaq, ArtAcaBak, ArtAcaMar, ArtAcaAnh, ArtPelAnh, ArtPreUsrM, ArtPreUlAc, ArtFecMod, ArtUsrCod, ArtPmPPza, ClasCod, ULinPre FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03H94", "INSERT INTO TXPARTICU(EmprCod, CliCod, ArtCod, ArtMat, TipArtCod, ArtDsc, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtPreKgm, ArtPreMtr, ArtPreDef, ULinRec, ArtNMtr, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtNumTex1, ArtNumTex2, NumTexCod, ArtFacAbs, ArtCosBase, ArtPle2, ArtObsLon, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtPreCap, ArtAnu, ArtFecCre, ArtPrMEst, ULinPre, ClasCod, ArtPmPPza, ArtUsrCod, ArtFecMod, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtRb, ArtValMtr, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, ArtFacTor, Mat_UltL, Mat_Maq, UltLinFT, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtFabsT, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtMT, ArtTRabs, ArtKgMn, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp, ArtActivo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
         ,new ForEachCursor("P03H95", "SELECT EmprCod, ArtCod, CliCod, Art_Tipo, ProStFec, ProSta, ProFabs, ProFecM, ProUserM, ProFecA, ProUserA, ProAct, DscCFa, Art_els, Art_ets, Art_Obs, Art_Und, Art_Dsc, Art_RdoP, Art_AncP, Art_PmlP, Art_GrmP, Art_PmlC, Art_AncC, Art_GrmC, Art_GrmB, Art_AncB, Art_Fabs, Art_Rdpc, Art_Rdo, Art_Cor, Art_Enc, Art_Elar, Art_Eanc, Art_PmlA, Art_Merma, Art_AncA, Art_GrmA, ProCod FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03H96", "INSERT INTO TXPARTLIN(EmprCod, CliCod, ArtCod, ProCod, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Rdpc, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, DscCFa, ProAct, ProUserA, ProFecA, ProUserM, ProFecM, ProFabs, ProSta, ProStFec, Art_Tipo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTLIN")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(11);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(15, 4);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((byte[]) buf[32])[0] = rslt.getByte(17);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(21);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(22);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(23);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(24, 10);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((byte[]) buf[48])[0] = rslt.getByte(25);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(27,5);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(28,5);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(29, 40);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(30, 60);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(31);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((short[]) buf[62])[0] = rslt.getShort(32);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((short[]) buf[64])[0] = rslt.getShort(33);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(34, 4);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(35, 4);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(36, 4);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((short[]) buf[72])[0] = rslt.getShort(37);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(38);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((short[]) buf[76])[0] = rslt.getShort(39);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(40, 4);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(41, 4);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(42, 4);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[84])[0] = rslt.getBigDecimal(43,2);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((byte[]) buf[86])[0] = rslt.getByte(44);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(45, 1);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(46, 6);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(47, 6);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getString(48, 1);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getString(49, 1);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getString(50, 10);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getString(51, 10);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[102])[0] = rslt.getBigDecimal(52,2);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((short[]) buf[104])[0] = rslt.getShort(53);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((short[]) buf[106])[0] = rslt.getShort(54);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((short[]) buf[108])[0] = rslt.getShort(55);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((short[]) buf[110])[0] = rslt.getShort(56);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((short[]) buf[112])[0] = rslt.getShort(57);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getString(58, 26);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((short[]) buf[116])[0] = rslt.getShort(59);
               ((String[]) buf[117])[0] = rslt.getString(60, 16);
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((String[]) buf[119])[0] = rslt.getString(61, 3);
               ((String[]) buf[120])[0] = rslt.getString(62, 16);
               ((int[]) buf[121])[0] = rslt.getInt(63);
               ((String[]) buf[122])[0] = rslt.getString(64, 1);
               ((java.math.BigDecimal[]) buf[123])[0] = rslt.getBigDecimal(65,2);
               ((boolean[]) buf[124])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[125])[0] = rslt.getBigDecimal(66,2);
               ((boolean[]) buf[126])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[127])[0] = rslt.getBigDecimal(67,2);
               ((boolean[]) buf[128])[0] = rslt.wasNull();
               ((String[]) buf[129])[0] = rslt.getVarchar(68);
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[131])[0] = rslt.getBigDecimal(69,4);
               ((boolean[]) buf[132])[0] = rslt.wasNull();
               ((String[]) buf[133])[0] = rslt.getVarchar(70);
               ((boolean[]) buf[134])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[135])[0] = rslt.getBigDecimal(71,2);
               ((boolean[]) buf[136])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[137])[0] = rslt.getBigDecimal(72,2);
               ((boolean[]) buf[138])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[139])[0] = rslt.getBigDecimal(73,2);
               ((boolean[]) buf[140])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[141])[0] = rslt.getBigDecimal(74,2);
               ((boolean[]) buf[142])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[143])[0] = rslt.getBigDecimal(75,2);
               ((boolean[]) buf[144])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[145])[0] = rslt.getBigDecimal(76,2);
               ((boolean[]) buf[146])[0] = rslt.wasNull();
               ((byte[]) buf[147])[0] = rslt.getByte(77);
               ((boolean[]) buf[148])[0] = rslt.wasNull();
               ((byte[]) buf[149])[0] = rslt.getByte(78);
               ((boolean[]) buf[150])[0] = rslt.wasNull();
               ((String[]) buf[151])[0] = rslt.getVarchar(79);
               ((boolean[]) buf[152])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[153])[0] = rslt.getBigDecimal(80,5);
               ((boolean[]) buf[154])[0] = rslt.wasNull();
               ((int[]) buf[155])[0] = rslt.getInt(81);
               ((boolean[]) buf[156])[0] = rslt.wasNull();
               ((String[]) buf[157])[0] = rslt.getString(82, 1);
               ((boolean[]) buf[158])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[159])[0] = rslt.getBigDecimal(83,2);
               ((boolean[]) buf[160])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[161])[0] = rslt.getBigDecimal(84,2);
               ((boolean[]) buf[162])[0] = rslt.wasNull();
               ((String[]) buf[163])[0] = rslt.getVarchar(85);
               ((boolean[]) buf[164])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[165])[0] = rslt.getBigDecimal(86,2);
               ((boolean[]) buf[166])[0] = rslt.wasNull();
               ((short[]) buf[167])[0] = rslt.getShort(87);
               ((boolean[]) buf[168])[0] = rslt.wasNull();
               ((short[]) buf[169])[0] = rslt.getShort(88);
               ((boolean[]) buf[170])[0] = rslt.wasNull();
               ((short[]) buf[171])[0] = rslt.getShort(89);
               ((boolean[]) buf[172])[0] = rslt.wasNull();
               ((short[]) buf[173])[0] = rslt.getShort(90);
               ((boolean[]) buf[174])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[175])[0] = rslt.getGXDateTime(91);
               ((boolean[]) buf[176])[0] = rslt.wasNull();
               ((String[]) buf[177])[0] = rslt.getString(92, 10);
               ((boolean[]) buf[178])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[179])[0] = rslt.getGXDateTime(93);
               ((boolean[]) buf[180])[0] = rslt.wasNull();
               ((String[]) buf[181])[0] = rslt.getString(94, 10);
               ((boolean[]) buf[182])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[183])[0] = rslt.getGXDateTime(95);
               ((boolean[]) buf[184])[0] = rslt.wasNull();
               ((String[]) buf[185])[0] = rslt.getString(96, 10);
               ((boolean[]) buf[186])[0] = rslt.wasNull();
               ((short[]) buf[187])[0] = rslt.getShort(97);
               ((boolean[]) buf[188])[0] = rslt.wasNull();
               ((short[]) buf[189])[0] = rslt.getShort(98);
               ((boolean[]) buf[190])[0] = rslt.wasNull();
               ((String[]) buf[191])[0] = rslt.getString(99, 10);
               ((boolean[]) buf[192])[0] = rslt.wasNull();
               ((String[]) buf[193])[0] = rslt.getString(100, 10);
               ((boolean[]) buf[194])[0] = rslt.wasNull();
               ((String[]) buf[195])[0] = rslt.getString(101, 10);
               ((boolean[]) buf[196])[0] = rslt.wasNull();
               ((String[]) buf[197])[0] = rslt.getString(102, 20);
               ((boolean[]) buf[198])[0] = rslt.wasNull();
               ((String[]) buf[199])[0] = rslt.getString(103, 20);
               ((boolean[]) buf[200])[0] = rslt.wasNull();
               ((String[]) buf[201])[0] = rslt.getString(104, 20);
               ((boolean[]) buf[202])[0] = rslt.wasNull();
               ((short[]) buf[203])[0] = rslt.getShort(105);
               ((boolean[]) buf[204])[0] = rslt.wasNull();
               ((short[]) buf[205])[0] = rslt.getShort(106);
               ((boolean[]) buf[206])[0] = rslt.wasNull();
               ((short[]) buf[207])[0] = rslt.getShort(107);
               ((boolean[]) buf[208])[0] = rslt.wasNull();
               ((byte[]) buf[209])[0] = rslt.getByte(108);
               ((boolean[]) buf[210])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[211])[0] = rslt.getBigDecimal(109,2);
               ((boolean[]) buf[212])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[213])[0] = rslt.getBigDecimal(110,2);
               ((boolean[]) buf[214])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[215])[0] = rslt.getBigDecimal(111,2);
               ((boolean[]) buf[216])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[217])[0] = rslt.getBigDecimal(112,2);
               ((boolean[]) buf[218])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[219])[0] = rslt.getBigDecimal(113,2);
               ((boolean[]) buf[220])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[221])[0] = rslt.getBigDecimal(114,2);
               ((boolean[]) buf[222])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[223])[0] = rslt.getBigDecimal(115,2);
               ((boolean[]) buf[224])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[225])[0] = rslt.getBigDecimal(116,2);
               ((boolean[]) buf[226])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[227])[0] = rslt.getBigDecimal(117,2);
               ((boolean[]) buf[228])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[229])[0] = rslt.getBigDecimal(118,2);
               ((boolean[]) buf[230])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[231])[0] = rslt.getBigDecimal(119,2);
               ((boolean[]) buf[232])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[233])[0] = rslt.getBigDecimal(120,2);
               ((boolean[]) buf[234])[0] = rslt.wasNull();
               ((byte[]) buf[235])[0] = rslt.getByte(121);
               ((boolean[]) buf[236])[0] = rslt.wasNull();
               ((String[]) buf[237])[0] = rslt.getString(122, 1);
               ((boolean[]) buf[238])[0] = rslt.wasNull();
               ((String[]) buf[239])[0] = rslt.getString(123, 1);
               ((boolean[]) buf[240])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[241])[0] = rslt.getBigDecimal(124,2);
               ((boolean[]) buf[242])[0] = rslt.wasNull();
               ((short[]) buf[243])[0] = rslt.getShort(125);
               ((boolean[]) buf[244])[0] = rslt.wasNull();
               ((short[]) buf[245])[0] = rslt.getShort(126);
               ((boolean[]) buf[246])[0] = rslt.wasNull();
               ((short[]) buf[247])[0] = rslt.getShort(127);
               ((boolean[]) buf[248])[0] = rslt.wasNull();
               ((short[]) buf[249])[0] = rslt.getShort(128);
               ((boolean[]) buf[250])[0] = rslt.wasNull();
               ((short[]) buf[251])[0] = rslt.getShort(129);
               ((boolean[]) buf[252])[0] = rslt.wasNull();
               ((String[]) buf[253])[0] = rslt.getString(130, 20);
               ((boolean[]) buf[254])[0] = rslt.wasNull();
               ((short[]) buf[255])[0] = rslt.getShort(131);
               ((boolean[]) buf[256])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[257])[0] = rslt.getBigDecimal(132,2);
               ((boolean[]) buf[258])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[259])[0] = rslt.getBigDecimal(133,2);
               ((boolean[]) buf[260])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[261])[0] = rslt.getBigDecimal(134,2);
               ((boolean[]) buf[262])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[263])[0] = rslt.getBigDecimal(135,2);
               ((boolean[]) buf[264])[0] = rslt.wasNull();
               ((short[]) buf[265])[0] = rslt.getShort(136);
               ((boolean[]) buf[266])[0] = rslt.wasNull();
               ((short[]) buf[267])[0] = rslt.getShort(137);
               ((boolean[]) buf[268])[0] = rslt.wasNull();
               ((String[]) buf[269])[0] = rslt.getString(138, 16);
               ((boolean[]) buf[270])[0] = rslt.wasNull();
               ((String[]) buf[271])[0] = rslt.getString(139, 3);
               ((boolean[]) buf[272])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[273])[0] = rslt.getBigDecimal(140,5);
               ((boolean[]) buf[274])[0] = rslt.wasNull();
               ((short[]) buf[275])[0] = rslt.getShort(141);
               ((boolean[]) buf[276])[0] = rslt.wasNull();
               ((int[]) buf[277])[0] = rslt.getInt(142);
               ((boolean[]) buf[278])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[279])[0] = rslt.getBigDecimal(143,2);
               ((boolean[]) buf[280])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[281])[0] = rslt.getBigDecimal(144,2);
               ((boolean[]) buf[282])[0] = rslt.wasNull();
               ((short[]) buf[283])[0] = rslt.getShort(145);
               ((boolean[]) buf[284])[0] = rslt.wasNull();
               ((String[]) buf[285])[0] = rslt.getString(146, 1);
               ((boolean[]) buf[286])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[287])[0] = rslt.getBigDecimal(147,2);
               ((boolean[]) buf[288])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[289])[0] = rslt.getBigDecimal(148,2);
               ((boolean[]) buf[290])[0] = rslt.wasNull();
               ((String[]) buf[291])[0] = rslt.getString(149, 6);
               ((boolean[]) buf[292])[0] = rslt.wasNull();
               ((String[]) buf[293])[0] = rslt.getString(150, 1);
               ((boolean[]) buf[294])[0] = rslt.wasNull();
               ((String[]) buf[295])[0] = rslt.getString(151, 1);
               ((boolean[]) buf[296])[0] = rslt.wasNull();
               ((short[]) buf[297])[0] = rslt.getShort(152);
               ((boolean[]) buf[298])[0] = rslt.wasNull();
               ((short[]) buf[299])[0] = rslt.getShort(153);
               ((boolean[]) buf[300])[0] = rslt.wasNull();
               ((String[]) buf[301])[0] = rslt.getString(154, 8);
               ((boolean[]) buf[302])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[303])[0] = rslt.getGXDate(155);
               ((boolean[]) buf[304])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[305])[0] = rslt.getGXDate(156);
               ((boolean[]) buf[306])[0] = rslt.wasNull();
               ((String[]) buf[307])[0] = rslt.getString(157, 8);
               ((boolean[]) buf[308])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[309])[0] = rslt.getBigDecimal(158,2);
               ((boolean[]) buf[310])[0] = rslt.wasNull();
               ((short[]) buf[311])[0] = rslt.getShort(159);
               ((boolean[]) buf[312])[0] = rslt.wasNull();
               ((byte[]) buf[313])[0] = rslt.getByte(160);
               ((boolean[]) buf[314])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 10);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 10);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 30);
               ((String[]) buf[14])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(21);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(22);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(23);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(24);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(25);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(26);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(27);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((short[]) buf[52])[0] = rslt.getShort(33);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((short[]) buf[54])[0] = rslt.getShort(34);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((short[]) buf[56])[0] = rslt.getShort(35);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((short[]) buf[60])[0] = rslt.getShort(37);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((short[]) buf[62])[0] = rslt.getShort(38);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(39, 8);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 16);
               }
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 26);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[21], 10);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 10);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[29], 6);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[31], 6);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[35]).byteValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[39], 4);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[41], 4);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[43], 4);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[45]).shortValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[47]).shortValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[49]).shortValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[51], 4);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[53], 4);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[55], 4);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[59]).shortValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[61]).shortValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[63], 60);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[65], 40);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[67], 5);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[69], 5);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[71], 1);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(39, ((Number) parms[73]).byteValue());
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[75], 10);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(41, ((Number) parms[77]).shortValue());
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(42, ((Number) parms[79]).shortValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(43, ((Number) parms[81]).shortValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(44, ((Number) parms[83]).shortValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(45, (java.math.BigDecimal)parms[85], 2);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(46, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(47, ((Number) parms[89]).byteValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(48, ((Number) parms[91]).shortValue());
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[93], 4);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(50, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(51, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[99], 30);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(53, (String)parms[101]);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(54, ((Number) parms[103]).shortValue());
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(55, ((Number) parms[105]).shortValue());
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(56, ((Number) parms[107]).shortValue());
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(57, ((Number) parms[109]).shortValue());
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(58, ((Number) parms[111]).shortValue());
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(59, ((Number) parms[113]).shortValue());
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(60, (java.math.BigDecimal)parms[115], 2);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[117], 1);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.DATE );
               }
               else
               {
                  stmt.setDate(62, (java.util.Date)parms[119]);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(63, (java.math.BigDecimal)parms[121], 5);
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(64, ((Number) parms[123]).byteValue());
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(65, ((Number) parms[125]).shortValue());
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(66, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(67, (String)parms[129], 8);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.DATE );
               }
               else
               {
                  stmt.setDate(68, (java.util.Date)parms[131]);
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.DATE );
               }
               else
               {
                  stmt.setDate(69, (java.util.Date)parms[133]);
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(70, (String)parms[135], 8);
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(71, ((Number) parms[137]).shortValue());
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(72, ((Number) parms[139]).shortValue());
               }
               if ( ((Boolean) parms[140]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(73, (String)parms[141], 1);
               }
               if ( ((Boolean) parms[142]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[143], 1);
               }
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(75, (String)parms[145], 6);
               }
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(76, (java.math.BigDecimal)parms[147], 2);
               }
               if ( ((Boolean) parms[148]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(77, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(78, (String)parms[151], 1);
               }
               if ( ((Boolean) parms[152]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(79, ((Number) parms[153]).shortValue());
               }
               if ( ((Boolean) parms[154]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(80, (java.math.BigDecimal)parms[155], 2);
               }
               if ( ((Boolean) parms[156]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(81, (java.math.BigDecimal)parms[157], 2);
               }
               if ( ((Boolean) parms[158]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(82, ((Number) parms[159]).intValue());
               }
               if ( ((Boolean) parms[160]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(83, ((Number) parms[161]).shortValue());
               }
               if ( ((Boolean) parms[162]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(84, (java.math.BigDecimal)parms[163], 5);
               }
               if ( ((Boolean) parms[164]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(85, (String)parms[165], 3);
               }
               if ( ((Boolean) parms[166]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(86, (String)parms[167], 16);
               }
               if ( ((Boolean) parms[168]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(87, ((Number) parms[169]).shortValue());
               }
               if ( ((Boolean) parms[170]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(88, ((Number) parms[171]).shortValue());
               }
               if ( ((Boolean) parms[172]).booleanValue() )
               {
                  stmt.setNull( 89 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(89, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Boolean) parms[174]).booleanValue() )
               {
                  stmt.setNull( 90 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(90, (java.math.BigDecimal)parms[175], 2);
               }
               if ( ((Boolean) parms[176]).booleanValue() )
               {
                  stmt.setNull( 91 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(91, (java.math.BigDecimal)parms[177], 2);
               }
               if ( ((Boolean) parms[178]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(92, (java.math.BigDecimal)parms[179], 2);
               }
               if ( ((Boolean) parms[180]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(93, ((Number) parms[181]).shortValue());
               }
               if ( ((Boolean) parms[182]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(94, (String)parms[183], 20);
               }
               if ( ((Boolean) parms[184]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(95, ((Number) parms[185]).shortValue());
               }
               if ( ((Boolean) parms[186]).booleanValue() )
               {
                  stmt.setNull( 96 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(96, ((Number) parms[187]).shortValue());
               }
               if ( ((Boolean) parms[188]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(97, ((Number) parms[189]).shortValue());
               }
               if ( ((Boolean) parms[190]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(98, ((Number) parms[191]).shortValue());
               }
               if ( ((Boolean) parms[192]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(99, ((Number) parms[193]).shortValue());
               }
               if ( ((Boolean) parms[194]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(100, (java.math.BigDecimal)parms[195], 2);
               }
               if ( ((Boolean) parms[196]).booleanValue() )
               {
                  stmt.setNull( 101 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(101, (String)parms[197], 1);
               }
               if ( ((Boolean) parms[198]).booleanValue() )
               {
                  stmt.setNull( 102 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(102, (String)parms[199], 1);
               }
               if ( ((Boolean) parms[200]).booleanValue() )
               {
                  stmt.setNull( 103 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(103, ((Number) parms[201]).byteValue());
               }
               if ( ((Boolean) parms[202]).booleanValue() )
               {
                  stmt.setNull( 104 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(104, (java.math.BigDecimal)parms[203], 2);
               }
               if ( ((Boolean) parms[204]).booleanValue() )
               {
                  stmt.setNull( 105 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(105, (java.math.BigDecimal)parms[205], 2);
               }
               if ( ((Boolean) parms[206]).booleanValue() )
               {
                  stmt.setNull( 106 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(106, (java.math.BigDecimal)parms[207], 2);
               }
               if ( ((Boolean) parms[208]).booleanValue() )
               {
                  stmt.setNull( 107 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(107, (java.math.BigDecimal)parms[209], 2);
               }
               if ( ((Boolean) parms[210]).booleanValue() )
               {
                  stmt.setNull( 108 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(108, (java.math.BigDecimal)parms[211], 2);
               }
               if ( ((Boolean) parms[212]).booleanValue() )
               {
                  stmt.setNull( 109 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(109, (java.math.BigDecimal)parms[213], 2);
               }
               if ( ((Boolean) parms[214]).booleanValue() )
               {
                  stmt.setNull( 110 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(110, (java.math.BigDecimal)parms[215], 2);
               }
               if ( ((Boolean) parms[216]).booleanValue() )
               {
                  stmt.setNull( 111 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(111, (java.math.BigDecimal)parms[217], 2);
               }
               if ( ((Boolean) parms[218]).booleanValue() )
               {
                  stmt.setNull( 112 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(112, (java.math.BigDecimal)parms[219], 2);
               }
               if ( ((Boolean) parms[220]).booleanValue() )
               {
                  stmt.setNull( 113 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(113, (java.math.BigDecimal)parms[221], 2);
               }
               if ( ((Boolean) parms[222]).booleanValue() )
               {
                  stmt.setNull( 114 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(114, (java.math.BigDecimal)parms[223], 2);
               }
               if ( ((Boolean) parms[224]).booleanValue() )
               {
                  stmt.setNull( 115 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(115, (java.math.BigDecimal)parms[225], 2);
               }
               if ( ((Boolean) parms[226]).booleanValue() )
               {
                  stmt.setNull( 116 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(116, ((Number) parms[227]).byteValue());
               }
               if ( ((Boolean) parms[228]).booleanValue() )
               {
                  stmt.setNull( 117 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(117, ((Number) parms[229]).shortValue());
               }
               if ( ((Boolean) parms[230]).booleanValue() )
               {
                  stmt.setNull( 118 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(118, ((Number) parms[231]).shortValue());
               }
               if ( ((Boolean) parms[232]).booleanValue() )
               {
                  stmt.setNull( 119 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(119, ((Number) parms[233]).shortValue());
               }
               if ( ((Boolean) parms[234]).booleanValue() )
               {
                  stmt.setNull( 120 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(120, (String)parms[235], 20);
               }
               if ( ((Boolean) parms[236]).booleanValue() )
               {
                  stmt.setNull( 121 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(121, (String)parms[237], 20);
               }
               if ( ((Boolean) parms[238]).booleanValue() )
               {
                  stmt.setNull( 122 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(122, (String)parms[239], 20);
               }
               if ( ((Boolean) parms[240]).booleanValue() )
               {
                  stmt.setNull( 123 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(123, (String)parms[241], 10);
               }
               if ( ((Boolean) parms[242]).booleanValue() )
               {
                  stmt.setNull( 124 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(124, (String)parms[243], 10);
               }
               if ( ((Boolean) parms[244]).booleanValue() )
               {
                  stmt.setNull( 125 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(125, (String)parms[245], 10);
               }
               if ( ((Boolean) parms[246]).booleanValue() )
               {
                  stmt.setNull( 126 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(126, ((Number) parms[247]).shortValue());
               }
               if ( ((Boolean) parms[248]).booleanValue() )
               {
                  stmt.setNull( 127 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(127, ((Number) parms[249]).shortValue());
               }
               if ( ((Boolean) parms[250]).booleanValue() )
               {
                  stmt.setNull( 128 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(128, (String)parms[251], 10);
               }
               if ( ((Boolean) parms[252]).booleanValue() )
               {
                  stmt.setNull( 129 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(129, (java.util.Date)parms[253], false);
               }
               if ( ((Boolean) parms[254]).booleanValue() )
               {
                  stmt.setNull( 130 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(130, (String)parms[255], 10);
               }
               if ( ((Boolean) parms[256]).booleanValue() )
               {
                  stmt.setNull( 131 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(131, (java.util.Date)parms[257], false);
               }
               if ( ((Boolean) parms[258]).booleanValue() )
               {
                  stmt.setNull( 132 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(132, (String)parms[259], 10);
               }
               if ( ((Boolean) parms[260]).booleanValue() )
               {
                  stmt.setNull( 133 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(133, (java.util.Date)parms[261], false);
               }
               if ( ((Boolean) parms[262]).booleanValue() )
               {
                  stmt.setNull( 134 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(134, ((Number) parms[263]).shortValue());
               }
               if ( ((Boolean) parms[264]).booleanValue() )
               {
                  stmt.setNull( 135 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(135, ((Number) parms[265]).shortValue());
               }
               if ( ((Boolean) parms[266]).booleanValue() )
               {
                  stmt.setNull( 136 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(136, ((Number) parms[267]).shortValue());
               }
               if ( ((Boolean) parms[268]).booleanValue() )
               {
                  stmt.setNull( 137 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(137, ((Number) parms[269]).shortValue());
               }
               if ( ((Boolean) parms[270]).booleanValue() )
               {
                  stmt.setNull( 138 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(138, (java.math.BigDecimal)parms[271], 2);
               }
               if ( ((Boolean) parms[272]).booleanValue() )
               {
                  stmt.setNull( 139 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(139, (String)parms[273], 500);
               }
               if ( ((Boolean) parms[274]).booleanValue() )
               {
                  stmt.setNull( 140 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(140, (java.math.BigDecimal)parms[275], 2);
               }
               if ( ((Boolean) parms[276]).booleanValue() )
               {
                  stmt.setNull( 141 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(141, (java.math.BigDecimal)parms[277], 2);
               }
               if ( ((Boolean) parms[278]).booleanValue() )
               {
                  stmt.setNull( 142 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(142, (String)parms[279], 1);
               }
               if ( ((Boolean) parms[280]).booleanValue() )
               {
                  stmt.setNull( 143 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(143, ((Number) parms[281]).intValue());
               }
               if ( ((Boolean) parms[282]).booleanValue() )
               {
                  stmt.setNull( 144 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(144, (java.math.BigDecimal)parms[283], 5);
               }
               if ( ((Boolean) parms[284]).booleanValue() )
               {
                  stmt.setNull( 145 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(145, (String)parms[285], 200);
               }
               if ( ((Boolean) parms[286]).booleanValue() )
               {
                  stmt.setNull( 146 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(146, ((Number) parms[287]).byteValue());
               }
               if ( ((Boolean) parms[288]).booleanValue() )
               {
                  stmt.setNull( 147 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(147, ((Number) parms[289]).byteValue());
               }
               if ( ((Boolean) parms[290]).booleanValue() )
               {
                  stmt.setNull( 148 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(148, (java.math.BigDecimal)parms[291], 2);
               }
               if ( ((Boolean) parms[292]).booleanValue() )
               {
                  stmt.setNull( 149 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(149, (java.math.BigDecimal)parms[293], 2);
               }
               if ( ((Boolean) parms[294]).booleanValue() )
               {
                  stmt.setNull( 150 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(150, (java.math.BigDecimal)parms[295], 2);
               }
               if ( ((Boolean) parms[296]).booleanValue() )
               {
                  stmt.setNull( 151 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(151, (java.math.BigDecimal)parms[297], 2);
               }
               if ( ((Boolean) parms[298]).booleanValue() )
               {
                  stmt.setNull( 152 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(152, (java.math.BigDecimal)parms[299], 2);
               }
               if ( ((Boolean) parms[300]).booleanValue() )
               {
                  stmt.setNull( 153 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(153, (java.math.BigDecimal)parms[301], 2);
               }
               if ( ((Boolean) parms[302]).booleanValue() )
               {
                  stmt.setNull( 154 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(154, (String)parms[303], 200);
               }
               if ( ((Boolean) parms[304]).booleanValue() )
               {
                  stmt.setNull( 155 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(155, (java.math.BigDecimal)parms[305], 4);
               }
               if ( ((Boolean) parms[306]).booleanValue() )
               {
                  stmt.setNull( 156 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(156, (String)parms[307], 60);
               }
               if ( ((Boolean) parms[308]).booleanValue() )
               {
                  stmt.setNull( 157 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(157, (java.math.BigDecimal)parms[309], 2);
               }
               if ( ((Boolean) parms[310]).booleanValue() )
               {
                  stmt.setNull( 158 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(158, (java.math.BigDecimal)parms[311], 2);
               }
               if ( ((Boolean) parms[312]).booleanValue() )
               {
                  stmt.setNull( 159 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(159, (java.math.BigDecimal)parms[313], 2);
               }
               stmt.setString(160, (String)parms[314], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[33]).shortValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[45], 26);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[47], 1);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[49], 800);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[51], 10);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[53], 10);
               }
               stmt.setString(30, (String)parms[54], 30);
               stmt.setString(31, (String)parms[55], 1);
               stmt.setString(32, (String)parms[56], 10);
               stmt.setDateTime(33, (java.util.Date)parms[57], false);
               stmt.setString(34, (String)parms[58], 10);
               stmt.setDateTime(35, (java.util.Date)parms[59], false);
               stmt.setBigDecimal(36, (java.math.BigDecimal)parms[60], 2);
               stmt.setByte(37, ((Number) parms[61]).byteValue());
               stmt.setDateTime(38, (java.util.Date)parms[62], false);
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[64], 1);
               }
               return;
      }
   }

}

