package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewse2 extends GXProcedure
{
   public pnewse2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewse2.class ), "" );
   }

   public pnewse2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      pnewse2.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pnewse2.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewse2.this.AV16CliOri = aP1;
      pnewse2.this.AV17CliDes = aP2;
      pnewse2.this.AV18ArtOri = aP3;
      pnewse2.this.AV19ArtDes = aP4[0];
      this.aP4 = aP4;
      pnewse2.this.AV60ArtDscDes = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: 'INICIO' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P00852 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliOri), AV18ArtOri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3072ArtObsLon = P00852_A3072ArtObsLon[0] ;
         n3072ArtObsLon = P00852_n3072ArtObsLon[0] ;
         A65ArtCod = P00852_A65ArtCod[0] ;
         A252CliCod = P00852_A252CliCod[0] ;
         A396EmprCod = P00852_A396EmprCod[0] ;
         A69ArtDsc = P00852_A69ArtDsc[0] ;
         n69ArtDsc = P00852_n69ArtDsc[0] ;
         A87ArtMat = P00852_A87ArtMat[0] ;
         n87ArtMat = P00852_n87ArtMat[0] ;
         A829TipArtCod = P00852_A829TipArtCod[0] ;
         A1148ArtPml = P00852_A1148ArtPml[0] ;
         n1148ArtPml = P00852_n1148ArtPml[0] ;
         A78ArtGraCru = P00852_A78ArtGraCru[0] ;
         n78ArtGraCru = P00852_n78ArtGraCru[0] ;
         A68ArtCruMin = P00852_A68ArtCruMin[0] ;
         n68ArtCruMin = P00852_n68ArtCruMin[0] ;
         A67ArtCruMax = P00852_A67ArtCruMax[0] ;
         n67ArtCruMax = P00852_n67ArtCruMax[0] ;
         A63ArtAcaMin = P00852_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P00852_n63ArtAcaMin[0] ;
         A62ArtAcaMax = P00852_A62ArtAcaMax[0] ;
         n62ArtAcaMax = P00852_n62ArtAcaMax[0] ;
         A95ArtRen = P00852_A95ArtRen[0] ;
         n95ArtRen = P00852_n95ArtRen[0] ;
         A101ArtTipPle = P00852_A101ArtTipPle[0] ;
         n101ArtTipPle = P00852_n101ArtTipPle[0] ;
         A2834ArtPle2 = P00852_A2834ArtPle2[0] ;
         n2834ArtPle2 = P00852_n2834ArtPle2[0] ;
         A100ArtTipLar = P00852_A100ArtTipLar[0] ;
         n100ArtTipLar = P00852_n100ArtTipLar[0] ;
         A66ArtCorOri = P00852_A66ArtCorOri[0] ;
         n66ArtCorOri = P00852_n66ArtCorOri[0] ;
         A70ArtEncOri = P00852_A70ArtEncOri[0] ;
         n70ArtEncOri = P00852_n70ArtEncOri[0] ;
         A96ArtSua = P00852_A96ArtSua[0] ;
         n96ArtSua = P00852_n96ArtSua[0] ;
         A64ArtAcaQui = P00852_A64ArtAcaQui[0] ;
         n64ArtAcaQui = P00852_n64ArtAcaQui[0] ;
         A73ArtEti = P00852_A73ArtEti[0] ;
         n73ArtEti = P00852_n73ArtEti[0] ;
         A117ArtUrg = P00852_A117ArtUrg[0] ;
         n117ArtUrg = P00852_n117ArtUrg[0] ;
         A88ArtMer = P00852_A88ArtMer[0] ;
         n88ArtMer = P00852_n88ArtMer[0] ;
         A105ArtTra1 = P00852_A105ArtTra1[0] ;
         n105ArtTra1 = P00852_n105ArtTra1[0] ;
         A106ArtTra2 = P00852_A106ArtTra2[0] ;
         n106ArtTra2 = P00852_n106ArtTra2[0] ;
         A107ArtTra3 = P00852_A107ArtTra3[0] ;
         n107ArtTra3 = P00852_n107ArtTra3[0] ;
         A108ArtTraP1 = P00852_A108ArtTraP1[0] ;
         n108ArtTraP1 = P00852_n108ArtTraP1[0] ;
         A109ArtTraP2 = P00852_A109ArtTraP2[0] ;
         n109ArtTraP2 = P00852_n109ArtTraP2[0] ;
         A110ArtTraP3 = P00852_A110ArtTraP3[0] ;
         n110ArtTraP3 = P00852_n110ArtTraP3[0] ;
         A111ArtUrd1 = P00852_A111ArtUrd1[0] ;
         n111ArtUrd1 = P00852_n111ArtUrd1[0] ;
         A112ArtUrd2 = P00852_A112ArtUrd2[0] ;
         n112ArtUrd2 = P00852_n112ArtUrd2[0] ;
         A113ArtUrd3 = P00852_A113ArtUrd3[0] ;
         n113ArtUrd3 = P00852_n113ArtUrd3[0] ;
         A114ArtUrdP1 = P00852_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P00852_n114ArtUrdP1[0] ;
         A115ArtUrdP2 = P00852_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = P00852_n115ArtUrdP2[0] ;
         A116ArtUrdP3 = P00852_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = P00852_n116ArtUrdP3[0] ;
         A89ArtObs = P00852_A89ArtObs[0] ;
         n89ArtObs = P00852_n89ArtObs[0] ;
         A90ArtObsFac = P00852_A90ArtObsFac[0] ;
         n90ArtObsFac = P00852_n90ArtObsFac[0] ;
         A1229ArtEncCom = P00852_A1229ArtEncCom[0] ;
         n1229ArtEncCom = P00852_n1229ArtEncCom[0] ;
         A1230ArtEncAnh = P00852_A1230ArtEncAnh[0] ;
         n1230ArtEncAnh = P00852_n1230ArtEncAnh[0] ;
         A5741ArtComer = P00852_A5741ArtComer[0] ;
         n5741ArtComer = P00852_n5741ArtComer[0] ;
         A5335ArtCodExt = P00852_A5335ArtCodExt[0] ;
         n5335ArtCodExt = P00852_n5335ArtCodExt[0] ;
         A1903ArtGraAca = P00852_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P00852_n1903ArtGraAca[0] ;
         A1905ArtRdoA = P00852_A1905ArtRdoA[0] ;
         n1905ArtRdoA = P00852_n1905ArtRdoA[0] ;
         A1904ArtRdoN = P00852_A1904ArtRdoN[0] ;
         n1904ArtRdoN = P00852_n1904ArtRdoN[0] ;
         A3121ArtNumCor = P00852_A3121ArtNumCor[0] ;
         n3121ArtNumCor = P00852_n3121ArtNumCor[0] ;
         A3122ArtAncSal1 = P00852_A3122ArtAncSal1[0] ;
         n3122ArtAncSal1 = P00852_n3122ArtAncSal1[0] ;
         A3123ArtAncSal2 = P00852_A3123ArtAncSal2[0] ;
         n3123ArtAncSal2 = P00852_n3123ArtAncSal2[0] ;
         A3124ArtAncSal3 = P00852_A3124ArtAncSal3[0] ;
         n3124ArtAncSal3 = P00852_n3124ArtAncSal3[0] ;
         A3125ArtGraAca2 = P00852_A3125ArtGraAca2[0] ;
         n3125ArtGraAca2 = P00852_n3125ArtGraAca2[0] ;
         A3126ArtGraCru2 = P00852_A3126ArtGraCru2[0] ;
         n3126ArtGraCru2 = P00852_n3126ArtGraCru2[0] ;
         A4295ClasCod = P00852_A4295ClasCod[0] ;
         n4295ClasCod = P00852_n4295ClasCod[0] ;
         A4297ArtPmPPza = P00852_A4297ArtPmPPza[0] ;
         n4297ArtPmPPza = P00852_n4297ArtPmPPza[0] ;
         A3683ArtFecCre = P00852_A3683ArtFecCre[0] ;
         n3683ArtFecCre = P00852_n3683ArtFecCre[0] ;
         A4353ArtUsrCod = P00852_A4353ArtUsrCod[0] ;
         n4353ArtUsrCod = P00852_n4353ArtUsrCod[0] ;
         A4354ArtFecMod = P00852_A4354ArtFecMod[0] ;
         n4354ArtFecMod = P00852_n4354ArtFecMod[0] ;
         A6106ClaTubCod = P00852_A6106ClaTubCod[0] ;
         n6106ClaTubCod = P00852_n6106ClaTubCod[0] ;
         A6108ClaBolCod = P00852_A6108ClaBolCod[0] ;
         n6108ClaBolCod = P00852_n6108ClaBolCod[0] ;
         A6435ArtRdoCru1 = P00852_A6435ArtRdoCru1[0] ;
         n6435ArtRdoCru1 = P00852_n6435ArtRdoCru1[0] ;
         A6436ArtRdoCru2 = P00852_A6436ArtRdoCru2[0] ;
         n6436ArtRdoCru2 = P00852_n6436ArtRdoCru2[0] ;
         A6462ArtLu = P00852_A6462ArtLu[0] ;
         n6462ArtLu = P00852_n6462ArtLu[0] ;
         A4607ArtRb = P00852_A4607ArtRb[0] ;
         n4607ArtRb = P00852_n4607ArtRb[0] ;
         A4444ArtPelAnh = P00852_A4444ArtPelAnh[0] ;
         n4444ArtPelAnh = P00852_n4444ArtPelAnh[0] ;
         A7412Artgrm2Sc = P00852_A7412Artgrm2Sc[0] ;
         n7412Artgrm2Sc = P00852_n7412Artgrm2Sc[0] ;
         A7413ArtPmlSc = P00852_A7413ArtPmlSc[0] ;
         n7413ArtPmlSc = P00852_n7413ArtPmlSc[0] ;
         A7414ArtAncSc = P00852_A7414ArtAncSc[0] ;
         n7414ArtAncSc = P00852_n7414ArtAncSc[0] ;
         A7415ArtPmlCru = P00852_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = P00852_n7415ArtPmlCru[0] ;
         A7777ArtRdtSc = P00852_A7777ArtRdtSc[0] ;
         n7777ArtRdtSc = P00852_n7777ArtRdtSc[0] ;
         A7778ArtUnd = P00852_A7778ArtUnd[0] ;
         n7778ArtUnd = P00852_n7778ArtUnd[0] ;
         A7779ArtBlo = P00852_A7779ArtBlo[0] ;
         n7779ArtBlo = P00852_n7779ArtBlo[0] ;
         A967ArtNMtr = P00852_A967ArtNMtr[0] ;
         n967ArtNMtr = P00852_n967ArtNMtr[0] ;
         A2707NumTexCod = P00852_A2707NumTexCod[0] ;
         n2707NumTexCod = P00852_n2707NumTexCod[0] ;
         A2750ArtNumTex1 = P00852_A2750ArtNumTex1[0] ;
         n2750ArtNumTex1 = P00852_n2750ArtNumTex1[0] ;
         A2751ArtNumTex2 = P00852_A2751ArtNumTex2[0] ;
         n2751ArtNumTex2 = P00852_n2751ArtNumTex2[0] ;
         A9801ArtFabsT = P00852_A9801ArtFabsT[0] ;
         n9801ArtFabsT = P00852_n9801ArtFabsT[0] ;
         A2791ArtFacAbs = P00852_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = P00852_n2791ArtFacAbs[0] ;
         A9730ArtFabsH = P00852_A9730ArtFabsH[0] ;
         n9730ArtFabsH = P00852_n9730ArtFabsH[0] ;
         A12695ArtElgAnc = P00852_A12695ArtElgAnc[0] ;
         n12695ArtElgAnc = P00852_n12695ArtElgAnc[0] ;
         A12696ArtElgLar = P00852_A12696ArtElgLar[0] ;
         n12696ArtElgLar = P00852_n12696ArtElgLar[0] ;
         A12697ArtRdoCru = P00852_A12697ArtRdoCru[0] ;
         n12697ArtRdoCru = P00852_n12697ArtRdoCru[0] ;
         A12698ArtEncLarg = P00852_A12698ArtEncLarg[0] ;
         n12698ArtEncLarg = P00852_n12698ArtEncLarg[0] ;
         A14100Artdsc2 = P00852_A14100Artdsc2[0] ;
         n14100Artdsc2 = P00852_n14100Artdsc2[0] ;
         A12364ArtMT = P00852_A12364ArtMT[0] ;
         n12364ArtMT = P00852_n12364ArtMT[0] ;
         A14295ArtActivo = P00852_A14295ArtActivo[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         if ( (GXutil.strcmp("", AV60ArtDscDes)==0) )
         {
            AV60ArtDscDes = A69ArtDsc ;
         }
         AV21ArtCod = A65ArtCod ;
         AV22ArtMat = A87ArtMat ;
         AV23TipArtCod = A829TipArtCod ;
         AV55ArtPml = A1148ArtPml ;
         AV25ArtGraCru = A78ArtGraCru ;
         AV26ArtCruMin = A68ArtCruMin ;
         AV27ArtCruMax = A67ArtCruMax ;
         AV28ArtAcaMin = A63ArtAcaMin ;
         AV29ArtAcaMax = A62ArtAcaMax ;
         AV30ArtRen = A95ArtRen ;
         AV31ArtTipPle = A101ArtTipPle ;
         AV71ArtPle2 = A2834ArtPle2 ;
         AV32ArtTipLar = A100ArtTipLar ;
         AV33ArtCorOri = A66ArtCorOri ;
         AV34ArtEncOri = A70ArtEncOri ;
         AV35ArtSua = A96ArtSua ;
         AV36ArtAcaQui = A64ArtAcaQui ;
         AV37ArtEti = A73ArtEti ;
         AV38ArtUrg = A117ArtUrg ;
         AV39ArtMer = A88ArtMer ;
         AV40ArtTra1 = A105ArtTra1 ;
         AV41ArtTra2 = A106ArtTra2 ;
         AV42ArtTra3 = A107ArtTra3 ;
         AV43ArtTraP1 = A108ArtTraP1 ;
         AV44ArtTraP2 = A109ArtTraP2 ;
         AV45ArtTraP3 = A110ArtTraP3 ;
         AV46ArtUrd1 = A111ArtUrd1 ;
         AV47ArtUrd2 = A112ArtUrd2 ;
         AV48ArtUrd3 = A113ArtUrd3 ;
         AV49ArtUrdP1 = A114ArtUrdP1 ;
         AV50ArtUrdP2 = A115ArtUrdP2 ;
         AV51ArtUrdP3 = A116ArtUrdP3 ;
         AV52ArtObs = A89ArtObs ;
         AV58ArtObsLon = A3072ArtObsLon ;
         AV53ArtObsFac = A90ArtObsFac ;
         AV56ArtEncCom = A1229ArtEncCom ;
         AV57ArtEncAnh = A1230ArtEncAnh ;
         AV69ArtComer = A5741ArtComer ;
         AV73ArtCodExt = A5335ArtCodExt ;
         AV74ArtGraAca = A1903ArtGraAca ;
         AV75ArtRdoA = A1905ArtRdoA ;
         AV76ArtRdoN = A1904ArtRdoN ;
         AV103ArtNumCor = A3121ArtNumCor ;
         AV78ArtAncSal1 = A3122ArtAncSal1 ;
         AV79ArtAncSal2 = A3123ArtAncSal2 ;
         AV80ArtAncSal3 = A3124ArtAncSal3 ;
         AV81ArtGraAca2 = A3125ArtGraAca2 ;
         AV82ArtGraCru2 = A3126ArtGraCru2 ;
         AV83ClasCod = A4295ClasCod ;
         AV84ArtPmPPza = A4297ArtPmPPza ;
         AV85ArtFecCre = A3683ArtFecCre ;
         AV86ArtUsrCod = A4353ArtUsrCod ;
         AV87ArtFecMod = A4354ArtFecMod ;
         AV88ClaTubCod = A6106ClaTubCod ;
         AV89ClaBolCod = A6108ClaBolCod ;
         AV90ArtRdoCru1 = A6435ArtRdoCru1 ;
         AV91ArtRdoCru2 = A6436ArtRdoCru2 ;
         AV93ArtLu = A6462ArtLu ;
         AV94ArtRb = A4607ArtRb ;
         AV95ArtPelAnh = A4444ArtPelAnh ;
         AV96Artgrm2Sc = A7412Artgrm2Sc ;
         AV97ArtPmlSc = A7413ArtPmlSc ;
         AV98ArtAncSc = A7414ArtAncSc ;
         AV99ArtPmlCru = A7415ArtPmlCru ;
         AV100ArtRdtSc = A7777ArtRdtSc ;
         AV101ArtUnd = A7778ArtUnd ;
         AV102ArtBlo = A7779ArtBlo ;
         AV92ArtNMtr = A967ArtNMtr ;
         AV104NumTexCod = A2707NumTexCod ;
         AV105ArtNumTex1 = A2750ArtNumTex1 ;
         AV106ArtNumTex2 = A2751ArtNumTex2 ;
         AV121artfabst = A9801ArtFabsT ;
         AV62ArtFacAbs = A2791ArtFacAbs ;
         AV122artfabsh = A9730ArtFabsH ;
         AV121artfabst = A9801ArtFabsT ;
         AV123ArtElgAnc = A12695ArtElgAnc ;
         AV124ArtElgLar = A12696ArtElgLar ;
         AV125ArtRdoCru = A12697ArtRdoCru ;
         AV126ArtEncLarg = A12698ArtEncLarg ;
         AV130Artdsc2 = A14100Artdsc2 ;
         AV131ArtMT = A12364ArtMT ;
         AV132ArtActivo = A14295ArtActivo ;
         System.out.println( httpContext.getMessage( "&ArtActivo  =", "")+AV132ArtActivo );
         /* Using cursor P00853 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A758ProCod = P00853_A758ProCod[0] ;
            A12752Art_Tipo = P00853_A12752Art_Tipo[0] ;
            n12752Art_Tipo = P00853_n12752Art_Tipo[0] ;
            A12142ProStFec = P00853_A12142ProStFec[0] ;
            A12141ProSta = P00853_A12141ProSta[0] ;
            A11272ProFabs = P00853_A11272ProFabs[0] ;
            A10556ProFecM = P00853_A10556ProFecM[0] ;
            A10555ProUserM = P00853_A10555ProUserM[0] ;
            A10554ProFecA = P00853_A10554ProFecA[0] ;
            A10553ProUserA = P00853_A10553ProUserA[0] ;
            A10412ProAct = P00853_A10412ProAct[0] ;
            A10026DscCFa = P00853_A10026DscCFa[0] ;
            A9629Art_els = P00853_A9629Art_els[0] ;
            n9629Art_els = P00853_n9629Art_els[0] ;
            A9628Art_ets = P00853_A9628Art_ets[0] ;
            n9628Art_ets = P00853_n9628Art_ets[0] ;
            A8955Art_Obs = P00853_A8955Art_Obs[0] ;
            n8955Art_Obs = P00853_n8955Art_Obs[0] ;
            A8166Art_Und = P00853_A8166Art_Und[0] ;
            n8166Art_Und = P00853_n8166Art_Und[0] ;
            A8165Art_Dsc = P00853_A8165Art_Dsc[0] ;
            n8165Art_Dsc = P00853_n8165Art_Dsc[0] ;
            A8084Art_RdoP = P00853_A8084Art_RdoP[0] ;
            n8084Art_RdoP = P00853_n8084Art_RdoP[0] ;
            A8083Art_AncP = P00853_A8083Art_AncP[0] ;
            n8083Art_AncP = P00853_n8083Art_AncP[0] ;
            A8082Art_PmlP = P00853_A8082Art_PmlP[0] ;
            n8082Art_PmlP = P00853_n8082Art_PmlP[0] ;
            A8081Art_GrmP = P00853_A8081Art_GrmP[0] ;
            n8081Art_GrmP = P00853_n8081Art_GrmP[0] ;
            A8080Art_PmlC = P00853_A8080Art_PmlC[0] ;
            n8080Art_PmlC = P00853_n8080Art_PmlC[0] ;
            A8079Art_AncC = P00853_A8079Art_AncC[0] ;
            n8079Art_AncC = P00853_n8079Art_AncC[0] ;
            A8078Art_GrmC = P00853_A8078Art_GrmC[0] ;
            n8078Art_GrmC = P00853_n8078Art_GrmC[0] ;
            A8077Art_GrmB = P00853_A8077Art_GrmB[0] ;
            n8077Art_GrmB = P00853_n8077Art_GrmB[0] ;
            A8076Art_AncB = P00853_A8076Art_AncB[0] ;
            n8076Art_AncB = P00853_n8076Art_AncB[0] ;
            A8075Art_Fabs = P00853_A8075Art_Fabs[0] ;
            n8075Art_Fabs = P00853_n8075Art_Fabs[0] ;
            A8074Art_Rdpc = P00853_A8074Art_Rdpc[0] ;
            n8074Art_Rdpc = P00853_n8074Art_Rdpc[0] ;
            A8073Art_Rdo = P00853_A8073Art_Rdo[0] ;
            n8073Art_Rdo = P00853_n8073Art_Rdo[0] ;
            A8072Art_Cor = P00853_A8072Art_Cor[0] ;
            n8072Art_Cor = P00853_n8072Art_Cor[0] ;
            A8071Art_Enc = P00853_A8071Art_Enc[0] ;
            n8071Art_Enc = P00853_n8071Art_Enc[0] ;
            A8070Art_Elar = P00853_A8070Art_Elar[0] ;
            n8070Art_Elar = P00853_n8070Art_Elar[0] ;
            A8069Art_Eanc = P00853_A8069Art_Eanc[0] ;
            n8069Art_Eanc = P00853_n8069Art_Eanc[0] ;
            A8068Art_PmlA = P00853_A8068Art_PmlA[0] ;
            n8068Art_PmlA = P00853_n8068Art_PmlA[0] ;
            A8067Art_Merma = P00853_A8067Art_Merma[0] ;
            n8067Art_Merma = P00853_n8067Art_Merma[0] ;
            A8066Art_AncA = P00853_A8066Art_AncA[0] ;
            n8066Art_AncA = P00853_n8066Art_AncA[0] ;
            A8065Art_GrmA = P00853_A8065Art_GrmA[0] ;
            n8065Art_GrmA = P00853_n8065Art_GrmA[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            AV54ProCod = A758ProCod ;
            if ( (0==AV17CliDes) )
            {
               /* Execute user subroutine: 'PROCESOS' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            else
            {
               /*
                  INSERT RECORD ON TABLE TXPARTLIN

               */
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W65ArtCod = A65ArtCod ;
               W758ProCod = A758ProCod ;
               A396EmprCod = AV15EmprCod ;
               A252CliCod = AV17CliDes ;
               A65ArtCod = AV19ArtDes ;
               A758ProCod = AV54ProCod ;
               /* Using cursor P00854 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, Boolean.valueOf(n8065Art_GrmA), Short.valueOf(A8065Art_GrmA), Boolean.valueOf(n8066Art_AncA), Short.valueOf(A8066Art_AncA), Boolean.valueOf(n8067Art_Merma), A8067Art_Merma, Boolean.valueOf(n8068Art_PmlA), Short.valueOf(A8068Art_PmlA), Boolean.valueOf(n8069Art_Eanc), Short.valueOf(A8069Art_Eanc), Boolean.valueOf(n8070Art_Elar), Short.valueOf(A8070Art_Elar), Boolean.valueOf(n8071Art_Enc), A8071Art_Enc, Boolean.valueOf(n8072Art_Cor), A8072Art_Cor, Boolean.valueOf(n8073Art_Rdo), A8073Art_Rdo, Boolean.valueOf(n8074Art_Rdpc), A8074Art_Rdpc, Boolean.valueOf(n8075Art_Fabs), A8075Art_Fabs, Boolean.valueOf(n8076Art_AncB), Short.valueOf(A8076Art_AncB), Boolean.valueOf(n8077Art_GrmB), Short.valueOf(A8077Art_GrmB), Boolean.valueOf(n8078Art_GrmC), Short.valueOf(A8078Art_GrmC), Boolean.valueOf(n8079Art_AncC), Short.valueOf(A8079Art_AncC), Boolean.valueOf(n8080Art_PmlC), Short.valueOf(A8080Art_PmlC), Boolean.valueOf(n8081Art_GrmP), Short.valueOf(A8081Art_GrmP), Boolean.valueOf(n8082Art_PmlP), Short.valueOf(A8082Art_PmlP), Boolean.valueOf(n8083Art_AncP), Short.valueOf(A8083Art_AncP), Boolean.valueOf(n8084Art_RdoP), A8084Art_RdoP, Boolean.valueOf(n8165Art_Dsc), A8165Art_Dsc, Boolean.valueOf(n8166Art_Und), A8166Art_Und, Boolean.valueOf(n8955Art_Obs), A8955Art_Obs, Boolean.valueOf(n9628Art_ets), A9628Art_ets, Boolean.valueOf(n9629Art_els), A9629Art_els, A10026DscCFa, A10412ProAct, A10553ProUserA, A10554ProFecA, A10555ProUserM, A10556ProFecM, A11272ProFabs, Byte.valueOf(A12141ProSta), A12142ProStFec, Boolean.valueOf(n12752Art_Tipo), A12752Art_Tipo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
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
               A758ProCod = W758ProCod ;
               /* End Insert */
               /* Using cursor P00855 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A457FasCod = P00855_A457FasCod[0] ;
                  A14547ArtFasNPs = P00855_A14547ArtFasNPs[0] ;
                  A14546ArtFasVel = P00855_A14546ArtFasVel[0] ;
                  A14545ArtFasPpp = P00855_A14545ArtFasPpp[0] ;
                  A14544ArtFasPyS = P00855_A14544ArtFasPyS[0] ;
                  A8560ArtFasFac = P00855_A8560ArtFasFac[0] ;
                  A4031CCTCod = P00855_A4031CCTCod[0] ;
                  n4031CCTCod = P00855_n4031CCTCod[0] ;
                  A4896ArtProFac = P00855_A4896ArtProFac[0] ;
                  n4896ArtProFac = P00855_n4896ArtProFac[0] ;
                  A4895ArtProFacT = P00855_A4895ArtProFacT[0] ;
                  n4895ArtProFacT = P00855_n4895ArtProFacT[0] ;
                  A4894ArtProULin = P00855_A4894ArtProULin[0] ;
                  n4894ArtProULin = P00855_n4894ArtProULin[0] ;
                  W396EmprCod = A396EmprCod ;
                  W252CliCod = A252CliCod ;
                  W65ArtCod = A65ArtCod ;
                  W758ProCod = A758ProCod ;
                  AV61FasCod = A457FasCod ;
                  /*
                     INSERT RECORD ON TABLE TXPSERPAU

                  */
                  W396EmprCod = A396EmprCod ;
                  W252CliCod = A252CliCod ;
                  W65ArtCod = A65ArtCod ;
                  W758ProCod = A758ProCod ;
                  W457FasCod = A457FasCod ;
                  A396EmprCod = AV15EmprCod ;
                  A252CliCod = AV17CliDes ;
                  A65ArtCod = AV19ArtDes ;
                  A758ProCod = AV54ProCod ;
                  A457FasCod = AV61FasCod ;
                  /* Using cursor P00856 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Boolean.valueOf(n4894ArtProULin), Short.valueOf(A4894ArtProULin), Boolean.valueOf(n4895ArtProFacT), A4895ArtProFacT, Boolean.valueOf(n4896ArtProFac), A4896ArtProFac, Boolean.valueOf(n4031CCTCod), Integer.valueOf(A4031CCTCod), A8560ArtFasFac, Short.valueOf(A14544ArtFasPyS), Short.valueOf(A14545ArtFasPpp), A14546ArtFasVel, Short.valueOf(A14547ArtFasNPs)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
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
                  A457FasCod = W457FasCod ;
                  /* End Insert */
                  /* Using cursor P00857 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
                  while ( (pr_default.getStatus(5) != 101) )
                  {
                     A1673ParFasObs = P00857_A1673ParFasObs[0] ;
                     A14061ParFasVmn = P00857_A14061ParFasVmn[0] ;
                     A14060ParFasVmx = P00857_A14060ParFasVmx[0] ;
                     A13220ParOrden = P00857_A13220ParOrden[0] ;
                     A12670ParFasVl2 = P00857_A12670ParFasVl2[0] ;
                     A1668ParFasVal = P00857_A1668ParFasVal[0] ;
                     A1664ParFasCod = P00857_A1664ParFasCod[0] ;
                     W396EmprCod = A396EmprCod ;
                     W252CliCod = A252CliCod ;
                     W65ArtCod = A65ArtCod ;
                     AV59ParFasObs = A1673ParFasObs ;
                     /*
                        INSERT RECORD ON TABLE TXPSERPAR

                     */
                     W396EmprCod = A396EmprCod ;
                     W252CliCod = A252CliCod ;
                     W65ArtCod = A65ArtCod ;
                     W1673ParFasObs = A1673ParFasObs ;
                     A396EmprCod = AV15EmprCod ;
                     A252CliCod = AV17CliDes ;
                     A65ArtCod = AV19ArtDes ;
                     A1673ParFasObs = AV59ParFasObs ;
                     /* Using cursor P00858 */
                     pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod), A1668ParFasVal, A1673ParFasObs, A12670ParFasVl2, Short.valueOf(A13220ParOrden), A14060ParFasVmx, A14061ParFasVmn});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAR");
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
                     A252CliCod = W252CliCod ;
                     A65ArtCod = W65ArtCod ;
                     A1673ParFasObs = W1673ParFasObs ;
                     /* End Insert */
                     A396EmprCod = W396EmprCod ;
                     A252CliCod = W252CliCod ;
                     A65ArtCod = W65ArtCod ;
                     pr_default.readNext(5);
                  }
                  pr_default.close(5);
                  A396EmprCod = W396EmprCod ;
                  A252CliCod = W252CliCod ;
                  A65ArtCod = W65ArtCod ;
                  A758ProCod = W758ProCod ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
               /* Execute user subroutine: 'TORIENT' */
               S161 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P00859 */
         pr_default.execute(7, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliOri), AV18ArtOri});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A65ArtCod = P00859_A65ArtCod[0] ;
            A252CliCod = P00859_A252CliCod[0] ;
            A4898ArtProCod = P00859_A4898ArtProCod[0] ;
            A4897ArtProLin = P00859_A4897ArtProLin[0] ;
            A457FasCod = P00859_A457FasCod[0] ;
            A758ProCod = P00859_A758ProCod[0] ;
            A396EmprCod = P00859_A396EmprCod[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            /*
               INSERT RECORD ON TABLE TXPArtFor

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W758ProCod = A758ProCod ;
            W457FasCod = A457FasCod ;
            W4897ArtProLin = A4897ArtProLin ;
            W4898ArtProCod = A4898ArtProCod ;
            A252CliCod = AV17CliDes ;
            A65ArtCod = AV19ArtDes ;
            /* Using cursor P008510 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A4897ArtProLin), A4898ArtProCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPArtFor");
            if ( (pr_default.getStatus(8) == 1) )
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
            A457FasCod = W457FasCod ;
            A4897ArtProLin = W4897ArtProLin ;
            A4898ArtProCod = W4898ArtProCod ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            pr_default.readNext(7);
         }
         pr_default.close(7);
         /* Using cursor P008511 */
         pr_default.execute(9, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliOri), AV18ArtOri});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A6964Mat_obs = P008511_A6964Mat_obs[0] ;
            n6964Mat_obs = P008511_n6964Mat_obs[0] ;
            A65ArtCod = P008511_A65ArtCod[0] ;
            A252CliCod = P008511_A252CliCod[0] ;
            A396EmprCod = P008511_A396EmprCod[0] ;
            A12358Mat_NAlim = P008511_A12358Mat_NAlim[0] ;
            A12357Mat_Color = P008511_A12357Mat_Color[0] ;
            n12357Mat_Color = P008511_n12357Mat_Color[0] ;
            A12356Mat_Dsc = P008511_A12356Mat_Dsc[0] ;
            n12356Mat_Dsc = P008511_n12356Mat_Dsc[0] ;
            A12355Mat_NE = P008511_A12355Mat_NE[0] ;
            n12355Mat_NE = P008511_n12355Mat_NE[0] ;
            A12354Mat_Lu = P008511_A12354Mat_Lu[0] ;
            n12354Mat_Lu = P008511_n12354Mat_Lu[0] ;
            A6963Mat_LM = P008511_A6963Mat_LM[0] ;
            n6963Mat_LM = P008511_n6963Mat_LM[0] ;
            A6962Mat_Porc = P008511_A6962Mat_Porc[0] ;
            n6962Mat_Porc = P008511_n6962Mat_Porc[0] ;
            A6961Mat_Lote = P008511_A6961Mat_Lote[0] ;
            n6961Mat_Lote = P008511_n6961Mat_Lote[0] ;
            A6960Mat_ProvN = P008511_A6960Mat_ProvN[0] ;
            n6960Mat_ProvN = P008511_n6960Mat_ProvN[0] ;
            A6959Mat_NumCol = P008511_A6959Mat_NumCol[0] ;
            n6959Mat_NumCol = P008511_n6959Mat_NumCol[0] ;
            A6958Mat_NomCol = P008511_A6958Mat_NomCol[0] ;
            n6958Mat_NomCol = P008511_n6958Mat_NomCol[0] ;
            A6957Mat_Tors = P008511_A6957Mat_Tors[0] ;
            n6957Mat_Tors = P008511_n6957Mat_Tors[0] ;
            A6956Mat_Mate = P008511_A6956Mat_Mate[0] ;
            n6956Mat_Mate = P008511_n6956Mat_Mate[0] ;
            A6955Mat_Estr = P008511_A6955Mat_Estr[0] ;
            n6955Mat_Estr = P008511_n6955Mat_Estr[0] ;
            A6954Mat_lin = P008511_A6954Mat_lin[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            /*
               INSERT RECORD ON TABLE TXPARTMAT

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W6954Mat_lin = A6954Mat_lin ;
            W6955Mat_Estr = A6955Mat_Estr ;
            n6955Mat_Estr = false ;
            W6956Mat_Mate = A6956Mat_Mate ;
            n6956Mat_Mate = false ;
            W6957Mat_Tors = A6957Mat_Tors ;
            n6957Mat_Tors = false ;
            W6958Mat_NomCol = A6958Mat_NomCol ;
            n6958Mat_NomCol = false ;
            W6959Mat_NumCol = A6959Mat_NumCol ;
            n6959Mat_NumCol = false ;
            W6960Mat_ProvN = A6960Mat_ProvN ;
            n6960Mat_ProvN = false ;
            W6961Mat_Lote = A6961Mat_Lote ;
            n6961Mat_Lote = false ;
            W6962Mat_Porc = A6962Mat_Porc ;
            n6962Mat_Porc = false ;
            W6963Mat_LM = A6963Mat_LM ;
            n6963Mat_LM = false ;
            W6964Mat_obs = A6964Mat_obs ;
            n6964Mat_obs = false ;
            A396EmprCod = AV15EmprCod ;
            A252CliCod = AV17CliDes ;
            A65ArtCod = AV19ArtDes ;
            n6955Mat_Estr = false ;
            n6956Mat_Mate = false ;
            n6957Mat_Tors = false ;
            n6958Mat_NomCol = false ;
            n6959Mat_NumCol = false ;
            n6960Mat_ProvN = false ;
            n6961Mat_Lote = false ;
            n6962Mat_Porc = false ;
            n6963Mat_LM = false ;
            n6964Mat_obs = false ;
            /* Using cursor P008512 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A6954Mat_lin), Boolean.valueOf(n6955Mat_Estr), A6955Mat_Estr, Boolean.valueOf(n6956Mat_Mate), A6956Mat_Mate, Boolean.valueOf(n6957Mat_Tors), A6957Mat_Tors, Boolean.valueOf(n6958Mat_NomCol), A6958Mat_NomCol, Boolean.valueOf(n6959Mat_NumCol), Integer.valueOf(A6959Mat_NumCol), Boolean.valueOf(n6960Mat_ProvN), A6960Mat_ProvN, Boolean.valueOf(n6961Mat_Lote), A6961Mat_Lote, Boolean.valueOf(n6962Mat_Porc), A6962Mat_Porc, Boolean.valueOf(n6963Mat_LM), A6963Mat_LM, Boolean.valueOf(n6964Mat_obs), A6964Mat_obs, Boolean.valueOf(n12354Mat_Lu), A12354Mat_Lu, Boolean.valueOf(n12355Mat_NE), A12355Mat_NE, Boolean.valueOf(n12356Mat_Dsc), A12356Mat_Dsc, Boolean.valueOf(n12357Mat_Color), A12357Mat_Color, A12358Mat_NAlim});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTMAT");
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
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            A6954Mat_lin = W6954Mat_lin ;
            A6955Mat_Estr = W6955Mat_Estr ;
            n6955Mat_Estr = false ;
            A6956Mat_Mate = W6956Mat_Mate ;
            n6956Mat_Mate = false ;
            A6957Mat_Tors = W6957Mat_Tors ;
            n6957Mat_Tors = false ;
            A6958Mat_NomCol = W6958Mat_NomCol ;
            n6958Mat_NomCol = false ;
            A6959Mat_NumCol = W6959Mat_NumCol ;
            n6959Mat_NumCol = false ;
            A6960Mat_ProvN = W6960Mat_ProvN ;
            n6960Mat_ProvN = false ;
            A6961Mat_Lote = W6961Mat_Lote ;
            n6961Mat_Lote = false ;
            A6962Mat_Porc = W6962Mat_Porc ;
            n6962Mat_Porc = false ;
            A6963Mat_LM = W6963Mat_LM ;
            n6963Mat_LM = false ;
            A6964Mat_obs = W6964Mat_obs ;
            n6964Mat_obs = false ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         if ( (0==AV17CliDes) )
         {
            /* Execute user subroutine: 'CLIDES_NULL' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            /* Execute user subroutine: 'CLIDES_NOT_NULL' */
            S151 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( ( AV66Hss == 1 ) || ( AV107Itram == 1 ) || ( AV120Pervaf == 1 ) )
         {
            /* Using cursor P008513 */
            pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
            while ( (pr_default.getStatus(11) != 101) )
            {
               A2931Limite2 = P008513_A2931Limite2[0] ;
               A2932Precio2 = P008513_A2932Precio2[0] ;
               n2932Precio2 = P008513_n2932Precio2[0] ;
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W65ArtCod = A65ArtCod ;
               AV68Limite2 = A2931Limite2 ;
               /*
                  INSERT RECORD ON TABLE TXPRECARB

               */
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W65ArtCod = A65ArtCod ;
               W2931Limite2 = A2931Limite2 ;
               A396EmprCod = AV15EmprCod ;
               A252CliCod = AV17CliDes ;
               A65ArtCod = AV19ArtDes ;
               A2931Limite2 = AV68Limite2 ;
               /* Using cursor P008514 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A2931Limite2), Boolean.valueOf(n2932Precio2), A2932Precio2});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECARB");
               if ( (pr_default.getStatus(12) == 1) )
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
               A2931Limite2 = W2931Limite2 ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A252CliCod = W252CliCod ;
               A65ArtCod = W65ArtCod ;
               pr_default.readNext(11);
            }
            pr_default.close(11);
         }
         if ( ( AV107Itram == 1 ) || ( AV120Pervaf == 1 ) )
         {
            /* Using cursor P008515 */
            pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
            while ( (pr_default.getStatus(13) != 101) )
            {
               A585IntPreDef = P008515_A585IntPreDef[0] ;
               n585IntPreDef = P008515_n585IntPreDef[0] ;
               A587IntPreMtr = P008515_A587IntPreMtr[0] ;
               n587IntPreMtr = P008515_n587IntPreMtr[0] ;
               A586IntPreKgm = P008515_A586IntPreKgm[0] ;
               n586IntPreKgm = P008515_n586IntPreKgm[0] ;
               A583IntCod = P008515_A583IntCod[0] ;
               A831TipColCod = P008515_A831TipColCod[0] ;
               A3616PreFacCod = P008515_A3616PreFacCod[0] ;
               n3616PreFacCod = P008515_n3616PreFacCod[0] ;
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W65ArtCod = A65ArtCod ;
               AV108TipColCod = A831TipColCod ;
               AV109IntCod = A583IntCod ;
               AV110IntPreDef = A585IntPreDef ;
               AV111IntPreKgm = A586IntPreKgm ;
               AV112IntPreMtr = A587IntPreMtr ;
               /*
                  INSERT RECORD ON TABLE TXPPRETIN

               */
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W65ArtCod = A65ArtCod ;
               W831TipColCod = A831TipColCod ;
               W583IntCod = A583IntCod ;
               W585IntPreDef = A585IntPreDef ;
               n585IntPreDef = false ;
               W586IntPreKgm = A586IntPreKgm ;
               n586IntPreKgm = false ;
               W587IntPreMtr = A587IntPreMtr ;
               n587IntPreMtr = false ;
               A396EmprCod = AV15EmprCod ;
               A252CliCod = AV17CliDes ;
               A65ArtCod = AV19ArtDes ;
               A831TipColCod = AV108TipColCod ;
               A583IntCod = AV109IntCod ;
               A585IntPreDef = AV110IntPreDef ;
               n585IntPreDef = false ;
               A586IntPreKgm = AV111IntPreKgm ;
               n586IntPreKgm = false ;
               A587IntPreMtr = AV112IntPreMtr ;
               n587IntPreMtr = false ;
               /* Using cursor P008516 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n586IntPreKgm), A586IntPreKgm, Boolean.valueOf(n587IntPreMtr), A587IntPreMtr, Boolean.valueOf(n585IntPreDef), A585IntPreDef, Boolean.valueOf(n3616PreFacCod), A3616PreFacCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETIN");
               if ( (pr_default.getStatus(14) == 1) )
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
               A831TipColCod = W831TipColCod ;
               A583IntCod = W583IntCod ;
               A585IntPreDef = W585IntPreDef ;
               n585IntPreDef = false ;
               A586IntPreKgm = W586IntPreKgm ;
               n586IntPreKgm = false ;
               A587IntPreMtr = W587IntPreMtr ;
               n587IntPreMtr = false ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A252CliCod = W252CliCod ;
               A65ArtCod = W65ArtCod ;
               pr_default.readNext(13);
            }
            pr_default.close(13);
            /* Using cursor P008517 */
            pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
            while ( (pr_default.getStatus(15) != 101) )
            {
               A3323RecPorInc = P008517_A3323RecPorInc[0] ;
               n3323RecPorInc = P008517_n3323RecPorInc[0] ;
               A2941RecBon = P008517_A2941RecBon[0] ;
               n2941RecBon = P008517_n2941RecBon[0] ;
               A2940Precio4 = P008517_A2940Precio4[0] ;
               n2940Precio4 = P008517_n2940Precio4[0] ;
               A2939Limite4 = P008517_A2939Limite4[0] ;
               A2937RecIntCod = P008517_A2937RecIntCod[0] ;
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W65ArtCod = A65ArtCod ;
               AV113RecIntCod = A2937RecIntCod ;
               AV114Limite4 = A2939Limite4 ;
               AV115Precio4 = A2940Precio4 ;
               AV116RecBon = A2941RecBon ;
               AV117RecPorInc = A3323RecPorInc ;
               /*
                  INSERT RECORD ON TABLE TXPLRBART

               */
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W65ArtCod = A65ArtCod ;
               W2937RecIntCod = A2937RecIntCod ;
               W2939Limite4 = A2939Limite4 ;
               W2940Precio4 = A2940Precio4 ;
               n2940Precio4 = false ;
               W2941RecBon = A2941RecBon ;
               n2941RecBon = false ;
               W3323RecPorInc = A3323RecPorInc ;
               n3323RecPorInc = false ;
               A396EmprCod = AV15EmprCod ;
               A252CliCod = AV17CliDes ;
               A65ArtCod = AV19ArtDes ;
               A2937RecIntCod = AV113RecIntCod ;
               A2939Limite4 = AV114Limite4 ;
               A2940Precio4 = AV115Precio4 ;
               n2940Precio4 = false ;
               A2941RecBon = AV116RecBon ;
               n2941RecBon = false ;
               A3323RecPorInc = AV117RecPorInc ;
               n3323RecPorInc = false ;
               /* Using cursor P008518 */
               pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A2937RecIntCod), Short.valueOf(A2939Limite4), Boolean.valueOf(n2940Precio4), A2940Precio4, Boolean.valueOf(n2941RecBon), A2941RecBon, Boolean.valueOf(n3323RecPorInc), A3323RecPorInc});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRBART");
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
               A396EmprCod = W396EmprCod ;
               A252CliCod = W252CliCod ;
               A65ArtCod = W65ArtCod ;
               A2937RecIntCod = W2937RecIntCod ;
               A2939Limite4 = W2939Limite4 ;
               A2940Precio4 = W2940Precio4 ;
               n2940Precio4 = false ;
               A2941RecBon = W2941RecBon ;
               n2941RecBon = false ;
               A3323RecPorInc = W3323RecPorInc ;
               n3323RecPorInc = false ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A252CliCod = W252CliCod ;
               A65ArtCod = W65ArtCod ;
               pr_default.readNext(15);
            }
            pr_default.close(15);
            /* Using cursor P008519 */
            pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
            while ( (pr_default.getStatus(17) != 101) )
            {
               A3321CliPreKgs = P008519_A3321CliPreKgs[0] ;
               n3321CliPreKgs = P008519_n3321CliPreKgs[0] ;
               A3320CliLimKgs = P008519_A3320CliLimKgs[0] ;
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               AV119CliLimKgs = A3320CliLimKgs ;
               AV118CliPreKgs = A3321CliPreKgs ;
               /*
                  INSERT RECORD ON TABLE TXPPREKIL

               */
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W3320CliLimKgs = A3320CliLimKgs ;
               W3321CliPreKgs = A3321CliPreKgs ;
               n3321CliPreKgs = false ;
               A396EmprCod = AV15EmprCod ;
               A252CliCod = AV17CliDes ;
               A3320CliLimKgs = AV119CliLimKgs ;
               A3321CliPreKgs = AV118CliPreKgs ;
               n3321CliPreKgs = false ;
               /* Using cursor P008520 */
               pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A3320CliLimKgs, Boolean.valueOf(n3321CliPreKgs), A3321CliPreKgs});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREKIL");
               if ( (pr_default.getStatus(18) == 1) )
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
               A3320CliLimKgs = W3320CliLimKgs ;
               A3321CliPreKgs = W3321CliPreKgs ;
               n3321CliPreKgs = false ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A252CliCod = W252CliCod ;
               pr_default.readNext(17);
            }
            pr_default.close(17);
         }
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'INICIO' Routine */
      returnInSub = false ;
      GXv_int1[0] = AV107Itram ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ITRAM", ""), GXv_int1) ;
      pnewse2.this.AV107Itram = GXv_int1[0] ;
      AV70DuSer0 = (byte)(0) ;
      GXv_int1[0] = AV70DuSer0 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "DUSER0", ""), GXv_int1) ;
      pnewse2.this.AV70DuSer0 = GXv_int1[0] ;
      GXv_int1[0] = AV72Moda21 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int1) ;
      pnewse2.this.AV72Moda21 = GXv_int1[0] ;
      GXt_char2 = AV63station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      pnewse2.this.GXt_char2 = GXv_char3[0] ;
      AV63station = GXt_char2 ;
      GXv_char3[0] = AV15EmprCod ;
      GXv_char4[0] = AV64EmprNom ;
      GXv_char5[0] = AV65UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV63station, GXv_char3, GXv_char4, GXv_char5) ;
      pnewse2.this.AV15EmprCod = GXv_char3[0] ;
      pnewse2.this.AV64EmprNom = GXv_char4[0] ;
      pnewse2.this.AV65UsurCod = GXv_char5[0] ;
   }

   public void S121( )
   {
      /* 'PROCESOS' Routine */
      returnInSub = false ;
      /* Using cursor P008521 */
      pr_default.execute(19, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliOri)});
      while ( (pr_default.getStatus(19) != 101) )
      {
         A252CliCod = P008521_A252CliCod[0] ;
         A396EmprCod = P008521_A396EmprCod[0] ;
         A278CliNif = P008521_A278CliNif[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPARTLIN

         */
         W396EmprCod = A396EmprCod ;
         A396EmprCod = AV15EmprCod ;
         A65ArtCod = AV19ArtDes ;
         A758ProCod = AV54ProCod ;
         /* Using cursor P008522 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
         if ( (pr_default.getStatus(20) == 1) )
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
         /* End Insert */
         AV20CliCod = A252CliCod ;
         /* Execute user subroutine: 'PARPROC' */
         S1321 ();
         if ( returnInSub )
         {
            pr_default.close(19);
            returnInSub = true;
            if (true) return;
         }
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(19);
      }
      pr_default.close(19);
   }

   public void S1321( )
   {
      /* 'PARPROC' Routine */
      returnInSub = false ;
      /* Using cursor P008523 */
      pr_default.execute(21, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliOri), AV18ArtOri, AV54ProCod});
      while ( (pr_default.getStatus(21) != 101) )
      {
         A457FasCod = P008523_A457FasCod[0] ;
         A758ProCod = P008523_A758ProCod[0] ;
         A65ArtCod = P008523_A65ArtCod[0] ;
         A252CliCod = P008523_A252CliCod[0] ;
         A396EmprCod = P008523_A396EmprCod[0] ;
         A14547ArtFasNPs = P008523_A14547ArtFasNPs[0] ;
         A14546ArtFasVel = P008523_A14546ArtFasVel[0] ;
         A14545ArtFasPpp = P008523_A14545ArtFasPpp[0] ;
         A14544ArtFasPyS = P008523_A14544ArtFasPyS[0] ;
         A8560ArtFasFac = P008523_A8560ArtFasFac[0] ;
         A4031CCTCod = P008523_A4031CCTCod[0] ;
         n4031CCTCod = P008523_n4031CCTCod[0] ;
         A4896ArtProFac = P008523_A4896ArtProFac[0] ;
         n4896ArtProFac = P008523_n4896ArtProFac[0] ;
         A4895ArtProFacT = P008523_A4895ArtProFacT[0] ;
         n4895ArtProFacT = P008523_n4895ArtProFacT[0] ;
         A4894ArtProULin = P008523_A4894ArtProULin[0] ;
         n4894ArtProULin = P008523_n4894ArtProULin[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W758ProCod = A758ProCod ;
         AV61FasCod = A457FasCod ;
         /*
            INSERT RECORD ON TABLE TXPSERPAU

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W758ProCod = A758ProCod ;
         W457FasCod = A457FasCod ;
         A396EmprCod = AV15EmprCod ;
         A252CliCod = AV20CliCod ;
         A65ArtCod = AV19ArtDes ;
         A758ProCod = AV54ProCod ;
         A457FasCod = AV61FasCod ;
         /* Using cursor P008524 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Boolean.valueOf(n4894ArtProULin), Short.valueOf(A4894ArtProULin), Boolean.valueOf(n4895ArtProFacT), A4895ArtProFacT, Boolean.valueOf(n4896ArtProFac), A4896ArtProFac, Boolean.valueOf(n4031CCTCod), Integer.valueOf(A4031CCTCod), A8560ArtFasFac, Short.valueOf(A14544ArtFasPyS), Short.valueOf(A14545ArtFasPpp), A14546ArtFasVel, Short.valueOf(A14547ArtFasNPs)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
         if ( (pr_default.getStatus(22) == 1) )
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
         A457FasCod = W457FasCod ;
         /* End Insert */
         /* Using cursor P008525 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod});
         while ( (pr_default.getStatus(23) != 101) )
         {
            A1673ParFasObs = P008525_A1673ParFasObs[0] ;
            A14061ParFasVmn = P008525_A14061ParFasVmn[0] ;
            A14060ParFasVmx = P008525_A14060ParFasVmx[0] ;
            A13220ParOrden = P008525_A13220ParOrden[0] ;
            A12670ParFasVl2 = P008525_A12670ParFasVl2[0] ;
            A1668ParFasVal = P008525_A1668ParFasVal[0] ;
            A1664ParFasCod = P008525_A1664ParFasCod[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            AV59ParFasObs = A1673ParFasObs ;
            /*
               INSERT RECORD ON TABLE TXPSERPAR

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W1673ParFasObs = A1673ParFasObs ;
            A396EmprCod = AV15EmprCod ;
            A252CliCod = AV20CliCod ;
            A65ArtCod = AV19ArtDes ;
            A1673ParFasObs = AV59ParFasObs ;
            /* Using cursor P008526 */
            pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Short.valueOf(A1664ParFasCod), A1668ParFasVal, A1673ParFasObs, A12670ParFasVl2, Short.valueOf(A13220ParOrden), A14060ParFasVmx, A14061ParFasVmn});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAR");
            if ( (pr_default.getStatus(24) == 1) )
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
            A1673ParFasObs = W1673ParFasObs ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            pr_default.readNext(23);
         }
         pr_default.close(23);
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         A758ProCod = W758ProCod ;
         pr_default.readNext(21);
      }
      pr_default.close(21);
      /* Using cursor P008527 */
      pr_default.execute(25, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliOri), AV18ArtOri, AV54ProCod});
      while ( (pr_default.getStatus(25) != 101) )
      {
         A758ProCod = P008527_A758ProCod[0] ;
         A65ArtCod = P008527_A65ArtCod[0] ;
         A252CliCod = P008527_A252CliCod[0] ;
         A396EmprCod = P008527_A396EmprCod[0] ;
         A8328ParFasObsm = P008527_A8328ParFasObsm[0] ;
         n8328ParFasObsm = P008527_n8328ParFasObsm[0] ;
         A6988FasDscp = P008527_A6988FasDscp[0] ;
         n6988FasDscp = P008527_n6988FasDscp[0] ;
         A6987FasCodp = P008527_A6987FasCodp[0] ;
         n6987FasCodp = P008527_n6987FasCodp[0] ;
         A6986NumLinPro = P008527_A6986NumLinPro[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W758ProCod = A758ProCod ;
         /*
            INSERT RECORD ON TABLE TXPPARART

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W758ProCod = A758ProCod ;
         W6986NumLinPro = A6986NumLinPro ;
         W6987FasCodp = A6987FasCodp ;
         n6987FasCodp = false ;
         W6988FasDscp = A6988FasDscp ;
         n6988FasDscp = false ;
         A396EmprCod = AV15EmprCod ;
         A252CliCod = AV20CliCod ;
         A65ArtCod = AV19ArtDes ;
         A758ProCod = AV54ProCod ;
         n6987FasCodp = false ;
         n6988FasDscp = false ;
         /* Using cursor P008528 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, Short.valueOf(A6986NumLinPro), Boolean.valueOf(n6987FasCodp), A6987FasCodp, Boolean.valueOf(n6988FasDscp), A6988FasDscp, Boolean.valueOf(n8328ParFasObsm), A8328ParFasObsm});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARART");
         if ( (pr_default.getStatus(26) == 1) )
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
         A6986NumLinPro = W6986NumLinPro ;
         A6987FasCodp = W6987FasCodp ;
         n6987FasCodp = false ;
         A6988FasDscp = W6988FasDscp ;
         n6988FasDscp = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         A758ProCod = W758ProCod ;
         pr_default.readNext(25);
      }
      pr_default.close(25);
      /* Using cursor P008529 */
      pr_default.execute(27, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliOri), AV18ArtOri, AV54ProCod});
      while ( (pr_default.getStatus(27) != 101) )
      {
         A758ProCod = P008529_A758ProCod[0] ;
         A65ArtCod = P008529_A65ArtCod[0] ;
         A252CliCod = P008529_A252CliCod[0] ;
         A396EmprCod = P008529_A396EmprCod[0] ;
         A6990ParFasObsp = P008529_A6990ParFasObsp[0] ;
         n6990ParFasObsp = P008529_n6990ParFasObsp[0] ;
         A6989ParFasValp = P008529_A6989ParFasValp[0] ;
         n6989ParFasValp = P008529_n6989ParFasValp[0] ;
         A1664ParFasCod = P008529_A1664ParFasCod[0] ;
         A6986NumLinPro = P008529_A6986NumLinPro[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W758ProCod = A758ProCod ;
         /*
            INSERT RECORD ON TABLE TXPPARAR1

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W758ProCod = A758ProCod ;
         W6986NumLinPro = A6986NumLinPro ;
         W1664ParFasCod = A1664ParFasCod ;
         W6990ParFasObsp = A6990ParFasObsp ;
         n6990ParFasObsp = false ;
         W6989ParFasValp = A6989ParFasValp ;
         n6989ParFasValp = false ;
         A396EmprCod = AV15EmprCod ;
         A252CliCod = AV20CliCod ;
         A65ArtCod = AV19ArtDes ;
         A758ProCod = AV54ProCod ;
         n6990ParFasObsp = false ;
         n6989ParFasValp = false ;
         /* Using cursor P008530 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, Short.valueOf(A6986NumLinPro), Short.valueOf(A1664ParFasCod), Boolean.valueOf(n6989ParFasValp), A6989ParFasValp, Boolean.valueOf(n6990ParFasObsp), A6990ParFasObsp});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARAR1");
         if ( (pr_default.getStatus(28) == 1) )
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
         A6986NumLinPro = W6986NumLinPro ;
         A1664ParFasCod = W1664ParFasCod ;
         A6990ParFasObsp = W6990ParFasObsp ;
         n6990ParFasObsp = false ;
         A6989ParFasValp = W6989ParFasValp ;
         n6989ParFasValp = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         A758ProCod = W758ProCod ;
         pr_default.readNext(27);
      }
      pr_default.close(27);
   }

   public void S141( )
   {
      /* 'CLIDES_NULL' Routine */
      returnInSub = false ;
      /* Using cursor P008531 */
      pr_default.execute(29, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliOri)});
      while ( (pr_default.getStatus(29) != 101) )
      {
         A252CliCod = P008531_A252CliCod[0] ;
         A396EmprCod = P008531_A396EmprCod[0] ;
         A278CliNif = P008531_A278CliNif[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPARTICU

         */
         W396EmprCod = A396EmprCod ;
         A396EmprCod = AV15EmprCod ;
         A65ArtCod = AV19ArtDes ;
         A87ArtMat = AV22ArtMat ;
         n87ArtMat = false ;
         A829TipArtCod = AV23TipArtCod ;
         A69ArtDsc = AV60ArtDscDes ;
         n69ArtDsc = false ;
         A1148ArtPml = AV55ArtPml ;
         n1148ArtPml = false ;
         A78ArtGraCru = AV25ArtGraCru ;
         n78ArtGraCru = false ;
         A68ArtCruMin = AV26ArtCruMin ;
         n68ArtCruMin = false ;
         A67ArtCruMax = AV27ArtCruMax ;
         n67ArtCruMax = false ;
         A63ArtAcaMin = AV28ArtAcaMin ;
         n63ArtAcaMin = false ;
         A62ArtAcaMax = AV29ArtAcaMax ;
         n62ArtAcaMax = false ;
         A95ArtRen = AV30ArtRen ;
         n95ArtRen = false ;
         A101ArtTipPle = AV31ArtTipPle ;
         n101ArtTipPle = false ;
         A2834ArtPle2 = AV71ArtPle2 ;
         n2834ArtPle2 = false ;
         A100ArtTipLar = AV32ArtTipLar ;
         n100ArtTipLar = false ;
         A66ArtCorOri = AV33ArtCorOri ;
         n66ArtCorOri = false ;
         A70ArtEncOri = AV34ArtEncOri ;
         n70ArtEncOri = false ;
         A96ArtSua = AV35ArtSua ;
         n96ArtSua = false ;
         A64ArtAcaQui = AV36ArtAcaQui ;
         n64ArtAcaQui = false ;
         A73ArtEti = AV37ArtEti ;
         n73ArtEti = false ;
         A117ArtUrg = AV38ArtUrg ;
         n117ArtUrg = false ;
         A88ArtMer = AV39ArtMer ;
         n88ArtMer = false ;
         A105ArtTra1 = AV40ArtTra1 ;
         n105ArtTra1 = false ;
         A106ArtTra2 = AV41ArtTra2 ;
         n106ArtTra2 = false ;
         A107ArtTra3 = AV42ArtTra3 ;
         n107ArtTra3 = false ;
         A108ArtTraP1 = AV43ArtTraP1 ;
         n108ArtTraP1 = false ;
         A109ArtTraP2 = AV44ArtTraP2 ;
         n109ArtTraP2 = false ;
         A110ArtTraP3 = AV45ArtTraP3 ;
         n110ArtTraP3 = false ;
         A111ArtUrd1 = AV46ArtUrd1 ;
         n111ArtUrd1 = false ;
         A112ArtUrd2 = AV47ArtUrd2 ;
         n112ArtUrd2 = false ;
         A113ArtUrd3 = AV48ArtUrd3 ;
         n113ArtUrd3 = false ;
         A114ArtUrdP1 = AV49ArtUrdP1 ;
         n114ArtUrdP1 = false ;
         A115ArtUrdP2 = AV50ArtUrdP2 ;
         n115ArtUrdP2 = false ;
         A116ArtUrdP3 = AV51ArtUrdP3 ;
         n116ArtUrdP3 = false ;
         A89ArtObs = AV52ArtObs ;
         n89ArtObs = false ;
         A3072ArtObsLon = AV58ArtObsLon ;
         n3072ArtObsLon = false ;
         A90ArtObsFac = AV53ArtObsFac ;
         n90ArtObsFac = false ;
         A1229ArtEncCom = AV56ArtEncCom ;
         n1229ArtEncCom = false ;
         A1230ArtEncAnh = AV57ArtEncAnh ;
         n1230ArtEncAnh = false ;
         A2791ArtFacAbs = AV62ArtFacAbs ;
         n2791ArtFacAbs = false ;
         A3683ArtFecCre = Gx_date ;
         n3683ArtFecCre = false ;
         A4353ArtUsrCod = AV65UsurCod ;
         n4353ArtUsrCod = false ;
         A5741ArtComer = AV69ArtComer ;
         n5741ArtComer = false ;
         A5335ArtCodExt = AV73ArtCodExt ;
         n5335ArtCodExt = false ;
         A1903ArtGraAca = AV74ArtGraAca ;
         n1903ArtGraAca = false ;
         A1905ArtRdoA = AV75ArtRdoA ;
         n1905ArtRdoA = false ;
         A1904ArtRdoN = AV76ArtRdoN ;
         n1904ArtRdoN = false ;
         A2791ArtFacAbs = AV62ArtFacAbs ;
         n2791ArtFacAbs = false ;
         A3121ArtNumCor = AV103ArtNumCor ;
         n3121ArtNumCor = false ;
         A3122ArtAncSal1 = AV78ArtAncSal1 ;
         n3122ArtAncSal1 = false ;
         A3123ArtAncSal2 = AV79ArtAncSal2 ;
         n3123ArtAncSal2 = false ;
         A3124ArtAncSal3 = AV80ArtAncSal3 ;
         n3124ArtAncSal3 = false ;
         A3125ArtGraAca2 = AV81ArtGraAca2 ;
         n3125ArtGraAca2 = false ;
         A3126ArtGraCru2 = AV82ArtGraCru2 ;
         n3126ArtGraCru2 = false ;
         A4295ClasCod = AV83ClasCod ;
         n4295ClasCod = false ;
         A4297ArtPmPPza = AV84ArtPmPPza ;
         n4297ArtPmPPza = false ;
         A3683ArtFecCre = AV85ArtFecCre ;
         n3683ArtFecCre = false ;
         A4353ArtUsrCod = AV86ArtUsrCod ;
         n4353ArtUsrCod = false ;
         A4354ArtFecMod = AV87ArtFecMod ;
         n4354ArtFecMod = false ;
         A6106ClaTubCod = AV88ClaTubCod ;
         n6106ClaTubCod = false ;
         A6108ClaBolCod = AV89ClaBolCod ;
         n6108ClaBolCod = false ;
         A6435ArtRdoCru1 = AV90ArtRdoCru1 ;
         n6435ArtRdoCru1 = false ;
         A6436ArtRdoCru2 = AV91ArtRdoCru2 ;
         n6436ArtRdoCru2 = false ;
         A967ArtNMtr = AV92ArtNMtr ;
         n967ArtNMtr = false ;
         A6462ArtLu = AV93ArtLu ;
         n6462ArtLu = false ;
         A4607ArtRb = AV94ArtRb ;
         n4607ArtRb = false ;
         A4444ArtPelAnh = AV95ArtPelAnh ;
         n4444ArtPelAnh = false ;
         A7412Artgrm2Sc = AV96Artgrm2Sc ;
         n7412Artgrm2Sc = false ;
         A7413ArtPmlSc = AV97ArtPmlSc ;
         n7413ArtPmlSc = false ;
         A7414ArtAncSc = AV98ArtAncSc ;
         n7414ArtAncSc = false ;
         A7415ArtPmlCru = AV99ArtPmlCru ;
         n7415ArtPmlCru = false ;
         A7777ArtRdtSc = AV100ArtRdtSc ;
         n7777ArtRdtSc = false ;
         A7778ArtUnd = AV101ArtUnd ;
         n7778ArtUnd = false ;
         A7779ArtBlo = AV102ArtBlo ;
         n7779ArtBlo = false ;
         if ( AV70DuSer0 == 1 )
         {
            A91ArtPreDef = "" ;
            n91ArtPreDef = false ;
            A92ArtPreKgm = DecimalUtil.ZERO ;
            n92ArtPreKgm = false ;
            A93ArtPreMtr = DecimalUtil.ZERO ;
            n93ArtPreMtr = false ;
            A4351ArtPreUlAc = GXutil.nullDate() ;
            n4351ArtPreUlAc = false ;
            A4352ArtPreUsrM = "" ;
            n4352ArtPreUsrM = false ;
         }
         A9801ArtFabsT = AV121artfabst ;
         n9801ArtFabsT = false ;
         A12695ArtElgAnc = AV123ArtElgAnc ;
         n12695ArtElgAnc = false ;
         A12696ArtElgLar = AV124ArtElgLar ;
         n12696ArtElgLar = false ;
         A12697ArtRdoCru = AV125ArtRdoCru ;
         n12697ArtRdoCru = false ;
         A12698ArtEncLarg = AV126ArtEncLarg ;
         n12698ArtEncLarg = false ;
         A12699ArtEncAnc = AV127ArtEncAnc ;
         n12699ArtEncAnc = false ;
         A12364ArtMT = AV131ArtMT ;
         n12364ArtMT = false ;
         A14295ArtActivo = AV132ArtActivo ;
         System.out.println( httpContext.getMessage( "null.ArtActivo  =", "")+A14295ArtActivo );
         /* Using cursor P008532 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Boolean.valueOf(n87ArtMat), A87ArtMat, Short.valueOf(A829TipArtCod), Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n78ArtGraCru), Short.valueOf(A78ArtGraCru), Boolean.valueOf(n68ArtCruMin), Short.valueOf(A68ArtCruMin), Boolean.valueOf(n67ArtCruMax), Short.valueOf(A67ArtCruMax), Boolean.valueOf(n63ArtAcaMin), Short.valueOf(A63ArtAcaMin), Boolean.valueOf(n62ArtAcaMax), Short.valueOf(A62ArtAcaMax), Boolean.valueOf(n95ArtRen), A95ArtRen, Boolean.valueOf(n101ArtTipPle), A101ArtTipPle, Boolean.valueOf(n100ArtTipLar), A100ArtTipLar, Boolean.valueOf(n66ArtCorOri), A66ArtCorOri, Boolean.valueOf(n70ArtEncOri), A70ArtEncOri, Boolean.valueOf(n96ArtSua), A96ArtSua, Boolean.valueOf(n64ArtAcaQui), A64ArtAcaQui, Boolean.valueOf(n73ArtEti), A73ArtEti, Boolean.valueOf(n117ArtUrg), Byte.valueOf(A117ArtUrg), Boolean.valueOf(n88ArtMer), A88ArtMer, Boolean.valueOf(n105ArtTra1), A105ArtTra1, Boolean.valueOf(n106ArtTra2), A106ArtTra2, Boolean.valueOf(n107ArtTra3), A107ArtTra3, Boolean.valueOf(n108ArtTraP1), Short.valueOf(A108ArtTraP1), Boolean.valueOf(n109ArtTraP2), Short.valueOf(A109ArtTraP2), Boolean.valueOf(n110ArtTraP3), Short.valueOf(A110ArtTraP3), Boolean.valueOf(n111ArtUrd1), A111ArtUrd1, Boolean.valueOf(n112ArtUrd2), A112ArtUrd2, Boolean.valueOf(n113ArtUrd3), A113ArtUrd3, Boolean.valueOf(n114ArtUrdP1), Short.valueOf(A114ArtUrdP1), Boolean.valueOf(n115ArtUrdP2), Short.valueOf(A115ArtUrdP2), Boolean.valueOf(n116ArtUrdP3), Short.valueOf(A116ArtUrdP3), Boolean.valueOf(n89ArtObs), A89ArtObs, Boolean.valueOf(n90ArtObsFac), A90ArtObsFac, Boolean.valueOf(n92ArtPreKgm), A92ArtPreKgm, Boolean.valueOf(n93ArtPreMtr), A93ArtPreMtr, Boolean.valueOf(n91ArtPreDef), A91ArtPreDef, Boolean.valueOf(n967ArtNMtr), A967ArtNMtr, Boolean.valueOf(n1148ArtPml), Short.valueOf(A1148ArtPml), Boolean.valueOf(n1229ArtEncCom), Short.valueOf(A1229ArtEncCom), Boolean.valueOf(n1230ArtEncAnh), Short.valueOf(A1230ArtEncAnh), Boolean.valueOf(n1903ArtGraAca), Short.valueOf(A1903ArtGraAca), Boolean.valueOf(n1904ArtRdoN), A1904ArtRdoN, Boolean.valueOf(n1905ArtRdoA), A1905ArtRdoA, Boolean.valueOf(n2791ArtFacAbs), A2791ArtFacAbs, Boolean.valueOf(n2834ArtPle2), A2834ArtPle2, Boolean.valueOf(n3072ArtObsLon), A3072ArtObsLon, Boolean.valueOf(n3121ArtNumCor), Short.valueOf(A3121ArtNumCor), Boolean.valueOf(n3122ArtAncSal1), Short.valueOf(A3122ArtAncSal1), Boolean.valueOf(n3123ArtAncSal2), Short.valueOf(A3123ArtAncSal2), Boolean.valueOf(n3124ArtAncSal3), Short.valueOf(A3124ArtAncSal3), Boolean.valueOf(n3125ArtGraAca2), Short.valueOf(A3125ArtGraAca2), Boolean.valueOf(n3126ArtGraCru2), Short.valueOf(A3126ArtGraCru2), Boolean.valueOf(n3683ArtFecCre), A3683ArtFecCre, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod), Boolean.valueOf(n4297ArtPmPPza), A4297ArtPmPPza, Boolean.valueOf(n4353ArtUsrCod), A4353ArtUsrCod, Boolean.valueOf(n4354ArtFecMod), A4354ArtFecMod, Boolean.valueOf(n4351ArtPreUlAc), A4351ArtPreUlAc, Boolean.valueOf(n4352ArtPreUsrM), A4352ArtPreUsrM, Boolean.valueOf(n4444ArtPelAnh), Short.valueOf(A4444ArtPelAnh), Boolean.valueOf(n4607ArtRb), Short.valueOf(A4607ArtRb),
         Boolean.valueOf(n5335ArtCodExt), A5335ArtCodExt, Boolean.valueOf(n5741ArtComer), A5741ArtComer, Boolean.valueOf(n6106ClaTubCod), Short.valueOf(A6106ClaTubCod), Boolean.valueOf(n6108ClaBolCod), Short.valueOf(A6108ClaBolCod), Boolean.valueOf(n6435ArtRdoCru1), A6435ArtRdoCru1, Boolean.valueOf(n6436ArtRdoCru2), A6436ArtRdoCru2, Boolean.valueOf(n6462ArtLu), A6462ArtLu, Boolean.valueOf(n7412Artgrm2Sc), Short.valueOf(A7412Artgrm2Sc), Boolean.valueOf(n7413ArtPmlSc), Short.valueOf(A7413ArtPmlSc), Boolean.valueOf(n7414ArtAncSc), Short.valueOf(A7414ArtAncSc), Boolean.valueOf(n7415ArtPmlCru), Short.valueOf(A7415ArtPmlCru), Boolean.valueOf(n7777ArtRdtSc), A7777ArtRdtSc, Boolean.valueOf(n7778ArtUnd), A7778ArtUnd, Boolean.valueOf(n7779ArtBlo), A7779ArtBlo, Boolean.valueOf(n9801ArtFabsT), A9801ArtFabsT, Boolean.valueOf(n12364ArtMT), Byte.valueOf(A12364ArtMT), Boolean.valueOf(n12695ArtElgAnc), A12695ArtElgAnc, Boolean.valueOf(n12696ArtElgLar), A12696ArtElgLar, Boolean.valueOf(n12697ArtRdoCru), A12697ArtRdoCru, Boolean.valueOf(n12698ArtEncLarg), A12698ArtEncLarg, Boolean.valueOf(n12699ArtEncAnc), A12699ArtEncAnc, A14295ArtActivo});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
         if ( (pr_default.getStatus(30) == 1) )
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
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(29);
      }
      pr_default.close(29);
      /* Using cursor P008533 */
      pr_default.execute(31, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliOri)});
      while ( (pr_default.getStatus(31) != 101) )
      {
         A6964Mat_obs = P008533_A6964Mat_obs[0] ;
         n6964Mat_obs = P008533_n6964Mat_obs[0] ;
         A65ArtCod = P008533_A65ArtCod[0] ;
         A396EmprCod = P008533_A396EmprCod[0] ;
         A12358Mat_NAlim = P008533_A12358Mat_NAlim[0] ;
         A12357Mat_Color = P008533_A12357Mat_Color[0] ;
         n12357Mat_Color = P008533_n12357Mat_Color[0] ;
         A12356Mat_Dsc = P008533_A12356Mat_Dsc[0] ;
         n12356Mat_Dsc = P008533_n12356Mat_Dsc[0] ;
         A12355Mat_NE = P008533_A12355Mat_NE[0] ;
         n12355Mat_NE = P008533_n12355Mat_NE[0] ;
         A12354Mat_Lu = P008533_A12354Mat_Lu[0] ;
         n12354Mat_Lu = P008533_n12354Mat_Lu[0] ;
         A6963Mat_LM = P008533_A6963Mat_LM[0] ;
         n6963Mat_LM = P008533_n6963Mat_LM[0] ;
         A6962Mat_Porc = P008533_A6962Mat_Porc[0] ;
         n6962Mat_Porc = P008533_n6962Mat_Porc[0] ;
         A6961Mat_Lote = P008533_A6961Mat_Lote[0] ;
         n6961Mat_Lote = P008533_n6961Mat_Lote[0] ;
         A6960Mat_ProvN = P008533_A6960Mat_ProvN[0] ;
         n6960Mat_ProvN = P008533_n6960Mat_ProvN[0] ;
         A6959Mat_NumCol = P008533_A6959Mat_NumCol[0] ;
         n6959Mat_NumCol = P008533_n6959Mat_NumCol[0] ;
         A6958Mat_NomCol = P008533_A6958Mat_NomCol[0] ;
         n6958Mat_NomCol = P008533_n6958Mat_NomCol[0] ;
         A6957Mat_Tors = P008533_A6957Mat_Tors[0] ;
         n6957Mat_Tors = P008533_n6957Mat_Tors[0] ;
         A6956Mat_Mate = P008533_A6956Mat_Mate[0] ;
         n6956Mat_Mate = P008533_n6956Mat_Mate[0] ;
         A6955Mat_Estr = P008533_A6955Mat_Estr[0] ;
         n6955Mat_Estr = P008533_n6955Mat_Estr[0] ;
         A6954Mat_lin = P008533_A6954Mat_lin[0] ;
         A252CliCod = P008533_A252CliCod[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPARTMAT

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W6954Mat_lin = A6954Mat_lin ;
         W6955Mat_Estr = A6955Mat_Estr ;
         n6955Mat_Estr = false ;
         W6956Mat_Mate = A6956Mat_Mate ;
         n6956Mat_Mate = false ;
         W6957Mat_Tors = A6957Mat_Tors ;
         n6957Mat_Tors = false ;
         W6958Mat_NomCol = A6958Mat_NomCol ;
         n6958Mat_NomCol = false ;
         W6959Mat_NumCol = A6959Mat_NumCol ;
         n6959Mat_NumCol = false ;
         W6960Mat_ProvN = A6960Mat_ProvN ;
         n6960Mat_ProvN = false ;
         W6961Mat_Lote = A6961Mat_Lote ;
         n6961Mat_Lote = false ;
         W6962Mat_Porc = A6962Mat_Porc ;
         n6962Mat_Porc = false ;
         W6963Mat_LM = A6963Mat_LM ;
         n6963Mat_LM = false ;
         W6964Mat_obs = A6964Mat_obs ;
         n6964Mat_obs = false ;
         A396EmprCod = AV15EmprCod ;
         A65ArtCod = AV19ArtDes ;
         n6955Mat_Estr = false ;
         n6956Mat_Mate = false ;
         n6957Mat_Tors = false ;
         n6958Mat_NomCol = false ;
         n6959Mat_NumCol = false ;
         n6960Mat_ProvN = false ;
         n6961Mat_Lote = false ;
         n6962Mat_Porc = false ;
         n6963Mat_LM = false ;
         n6964Mat_obs = false ;
         /* Using cursor P008534 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A6954Mat_lin), Boolean.valueOf(n6955Mat_Estr), A6955Mat_Estr, Boolean.valueOf(n6956Mat_Mate), A6956Mat_Mate, Boolean.valueOf(n6957Mat_Tors), A6957Mat_Tors, Boolean.valueOf(n6958Mat_NomCol), A6958Mat_NomCol, Boolean.valueOf(n6959Mat_NumCol), Integer.valueOf(A6959Mat_NumCol), Boolean.valueOf(n6960Mat_ProvN), A6960Mat_ProvN, Boolean.valueOf(n6961Mat_Lote), A6961Mat_Lote, Boolean.valueOf(n6962Mat_Porc), A6962Mat_Porc, Boolean.valueOf(n6963Mat_LM), A6963Mat_LM, Boolean.valueOf(n6964Mat_obs), A6964Mat_obs, Boolean.valueOf(n12354Mat_Lu), A12354Mat_Lu, Boolean.valueOf(n12355Mat_NE), A12355Mat_NE, Boolean.valueOf(n12356Mat_Dsc), A12356Mat_Dsc, Boolean.valueOf(n12357Mat_Color), A12357Mat_Color, A12358Mat_NAlim});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTMAT");
         if ( (pr_default.getStatus(32) == 1) )
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
         A6954Mat_lin = W6954Mat_lin ;
         A6955Mat_Estr = W6955Mat_Estr ;
         n6955Mat_Estr = false ;
         A6956Mat_Mate = W6956Mat_Mate ;
         n6956Mat_Mate = false ;
         A6957Mat_Tors = W6957Mat_Tors ;
         n6957Mat_Tors = false ;
         A6958Mat_NomCol = W6958Mat_NomCol ;
         n6958Mat_NomCol = false ;
         A6959Mat_NumCol = W6959Mat_NumCol ;
         n6959Mat_NumCol = false ;
         A6960Mat_ProvN = W6960Mat_ProvN ;
         n6960Mat_ProvN = false ;
         A6961Mat_Lote = W6961Mat_Lote ;
         n6961Mat_Lote = false ;
         A6962Mat_Porc = W6962Mat_Porc ;
         n6962Mat_Porc = false ;
         A6963Mat_LM = W6963Mat_LM ;
         n6963Mat_LM = false ;
         A6964Mat_obs = W6964Mat_obs ;
         n6964Mat_obs = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(31);
      }
      pr_default.close(31);
   }

   public void S151( )
   {
      /* 'CLIDES_NOT_NULL' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPARTICU

      */
      A396EmprCod = AV15EmprCod ;
      A252CliCod = AV17CliDes ;
      A65ArtCod = AV19ArtDes ;
      A87ArtMat = AV22ArtMat ;
      n87ArtMat = false ;
      A829TipArtCod = AV23TipArtCod ;
      A69ArtDsc = AV60ArtDscDes ;
      n69ArtDsc = false ;
      A1148ArtPml = AV55ArtPml ;
      n1148ArtPml = false ;
      A78ArtGraCru = AV25ArtGraCru ;
      n78ArtGraCru = false ;
      A68ArtCruMin = AV26ArtCruMin ;
      n68ArtCruMin = false ;
      A67ArtCruMax = AV27ArtCruMax ;
      n67ArtCruMax = false ;
      A63ArtAcaMin = AV28ArtAcaMin ;
      n63ArtAcaMin = false ;
      A62ArtAcaMax = AV29ArtAcaMax ;
      n62ArtAcaMax = false ;
      A95ArtRen = AV30ArtRen ;
      n95ArtRen = false ;
      A101ArtTipPle = AV31ArtTipPle ;
      n101ArtTipPle = false ;
      A2834ArtPle2 = AV71ArtPle2 ;
      n2834ArtPle2 = false ;
      A100ArtTipLar = AV32ArtTipLar ;
      n100ArtTipLar = false ;
      A66ArtCorOri = AV33ArtCorOri ;
      n66ArtCorOri = false ;
      A70ArtEncOri = AV34ArtEncOri ;
      n70ArtEncOri = false ;
      A96ArtSua = AV35ArtSua ;
      n96ArtSua = false ;
      A64ArtAcaQui = AV36ArtAcaQui ;
      n64ArtAcaQui = false ;
      A73ArtEti = AV37ArtEti ;
      n73ArtEti = false ;
      A117ArtUrg = AV38ArtUrg ;
      n117ArtUrg = false ;
      A88ArtMer = AV39ArtMer ;
      n88ArtMer = false ;
      A105ArtTra1 = AV40ArtTra1 ;
      n105ArtTra1 = false ;
      A106ArtTra2 = AV41ArtTra2 ;
      n106ArtTra2 = false ;
      A107ArtTra3 = AV42ArtTra3 ;
      n107ArtTra3 = false ;
      A108ArtTraP1 = AV43ArtTraP1 ;
      n108ArtTraP1 = false ;
      A109ArtTraP2 = AV44ArtTraP2 ;
      n109ArtTraP2 = false ;
      A110ArtTraP3 = AV45ArtTraP3 ;
      n110ArtTraP3 = false ;
      A111ArtUrd1 = AV46ArtUrd1 ;
      n111ArtUrd1 = false ;
      A112ArtUrd2 = AV47ArtUrd2 ;
      n112ArtUrd2 = false ;
      A113ArtUrd3 = AV48ArtUrd3 ;
      n113ArtUrd3 = false ;
      A114ArtUrdP1 = AV49ArtUrdP1 ;
      n114ArtUrdP1 = false ;
      A115ArtUrdP2 = AV50ArtUrdP2 ;
      n115ArtUrdP2 = false ;
      A116ArtUrdP3 = AV51ArtUrdP3 ;
      n116ArtUrdP3 = false ;
      A89ArtObs = AV52ArtObs ;
      n89ArtObs = false ;
      A3072ArtObsLon = AV58ArtObsLon ;
      n3072ArtObsLon = false ;
      A90ArtObsFac = AV53ArtObsFac ;
      n90ArtObsFac = false ;
      A1229ArtEncCom = AV56ArtEncCom ;
      n1229ArtEncCom = false ;
      A1230ArtEncAnh = AV57ArtEncAnh ;
      n1230ArtEncAnh = false ;
      A2791ArtFacAbs = AV62ArtFacAbs ;
      n2791ArtFacAbs = false ;
      A3683ArtFecCre = Gx_date ;
      n3683ArtFecCre = false ;
      A4353ArtUsrCod = AV65UsurCod ;
      n4353ArtUsrCod = false ;
      A5741ArtComer = AV69ArtComer ;
      n5741ArtComer = false ;
      A5335ArtCodExt = AV73ArtCodExt ;
      n5335ArtCodExt = false ;
      A1903ArtGraAca = AV74ArtGraAca ;
      n1903ArtGraAca = false ;
      A1905ArtRdoA = AV75ArtRdoA ;
      n1905ArtRdoA = false ;
      A1904ArtRdoN = AV76ArtRdoN ;
      n1904ArtRdoN = false ;
      A3121ArtNumCor = AV103ArtNumCor ;
      n3121ArtNumCor = false ;
      A3122ArtAncSal1 = AV78ArtAncSal1 ;
      n3122ArtAncSal1 = false ;
      A3123ArtAncSal2 = AV79ArtAncSal2 ;
      n3123ArtAncSal2 = false ;
      A3124ArtAncSal3 = AV80ArtAncSal3 ;
      n3124ArtAncSal3 = false ;
      A3125ArtGraAca2 = AV81ArtGraAca2 ;
      n3125ArtGraAca2 = false ;
      A3126ArtGraCru2 = AV82ArtGraCru2 ;
      n3126ArtGraCru2 = false ;
      A4295ClasCod = AV83ClasCod ;
      n4295ClasCod = false ;
      A4297ArtPmPPza = AV84ArtPmPPza ;
      n4297ArtPmPPza = false ;
      A3683ArtFecCre = AV85ArtFecCre ;
      n3683ArtFecCre = false ;
      A4353ArtUsrCod = AV86ArtUsrCod ;
      n4353ArtUsrCod = false ;
      A4354ArtFecMod = AV87ArtFecMod ;
      n4354ArtFecMod = false ;
      A6106ClaTubCod = AV88ClaTubCod ;
      n6106ClaTubCod = false ;
      A6108ClaBolCod = AV89ClaBolCod ;
      n6108ClaBolCod = false ;
      A6435ArtRdoCru1 = AV90ArtRdoCru1 ;
      n6435ArtRdoCru1 = false ;
      A6436ArtRdoCru2 = AV91ArtRdoCru2 ;
      n6436ArtRdoCru2 = false ;
      A967ArtNMtr = AV92ArtNMtr ;
      n967ArtNMtr = false ;
      A6462ArtLu = AV93ArtLu ;
      n6462ArtLu = false ;
      A4607ArtRb = AV94ArtRb ;
      n4607ArtRb = false ;
      A4444ArtPelAnh = AV95ArtPelAnh ;
      n4444ArtPelAnh = false ;
      A7412Artgrm2Sc = AV96Artgrm2Sc ;
      n7412Artgrm2Sc = false ;
      A7413ArtPmlSc = AV97ArtPmlSc ;
      n7413ArtPmlSc = false ;
      A7414ArtAncSc = AV98ArtAncSc ;
      n7414ArtAncSc = false ;
      A7415ArtPmlCru = AV99ArtPmlCru ;
      n7415ArtPmlCru = false ;
      A7777ArtRdtSc = AV100ArtRdtSc ;
      n7777ArtRdtSc = false ;
      A7778ArtUnd = AV101ArtUnd ;
      n7778ArtUnd = false ;
      A7779ArtBlo = AV102ArtBlo ;
      n7779ArtBlo = false ;
      A967ArtNMtr = AV92ArtNMtr ;
      n967ArtNMtr = false ;
      A2707NumTexCod = AV104NumTexCod ;
      n2707NumTexCod = false ;
      A2750ArtNumTex1 = AV105ArtNumTex1 ;
      n2750ArtNumTex1 = false ;
      A2751ArtNumTex2 = AV106ArtNumTex2 ;
      n2751ArtNumTex2 = false ;
      if ( AV70DuSer0 == 1 )
      {
         A91ArtPreDef = " " ;
         n91ArtPreDef = false ;
         A92ArtPreKgm = DecimalUtil.doubleToDec(0) ;
         n92ArtPreKgm = false ;
         A93ArtPreMtr = DecimalUtil.doubleToDec(0) ;
         n93ArtPreMtr = false ;
         A4351ArtPreUlAc = GXutil.nullDate() ;
         n4351ArtPreUlAc = false ;
         A4352ArtPreUsrM = " " ;
         n4352ArtPreUsrM = false ;
      }
      A9801ArtFabsT = AV121artfabst ;
      n9801ArtFabsT = false ;
      A2791ArtFacAbs = AV62ArtFacAbs ;
      n2791ArtFacAbs = false ;
      A9730ArtFabsH = AV122artfabsh ;
      n9730ArtFabsH = false ;
      A12695ArtElgAnc = AV123ArtElgAnc ;
      n12695ArtElgAnc = false ;
      A12696ArtElgLar = AV124ArtElgLar ;
      n12696ArtElgLar = false ;
      A12697ArtRdoCru = AV125ArtRdoCru ;
      n12697ArtRdoCru = false ;
      A12698ArtEncLarg = AV126ArtEncLarg ;
      n12698ArtEncLarg = false ;
      A12699ArtEncAnc = AV127ArtEncAnc ;
      n12699ArtEncAnc = false ;
      A14100Artdsc2 = AV130Artdsc2 ;
      n14100Artdsc2 = false ;
      A12364ArtMT = AV131ArtMT ;
      n12364ArtMT = false ;
      A14295ArtActivo = AV132ArtActivo ;
      System.out.println( httpContext.getMessage( "not null.ArtActivo  =", "")+A14295ArtActivo );
      /* Using cursor P008535 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Boolean.valueOf(n87ArtMat), A87ArtMat, Short.valueOf(A829TipArtCod), Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n78ArtGraCru), Short.valueOf(A78ArtGraCru), Boolean.valueOf(n68ArtCruMin), Short.valueOf(A68ArtCruMin), Boolean.valueOf(n67ArtCruMax), Short.valueOf(A67ArtCruMax), Boolean.valueOf(n63ArtAcaMin), Short.valueOf(A63ArtAcaMin), Boolean.valueOf(n62ArtAcaMax), Short.valueOf(A62ArtAcaMax), Boolean.valueOf(n95ArtRen), A95ArtRen, Boolean.valueOf(n101ArtTipPle), A101ArtTipPle, Boolean.valueOf(n100ArtTipLar), A100ArtTipLar, Boolean.valueOf(n66ArtCorOri), A66ArtCorOri, Boolean.valueOf(n70ArtEncOri), A70ArtEncOri, Boolean.valueOf(n96ArtSua), A96ArtSua, Boolean.valueOf(n64ArtAcaQui), A64ArtAcaQui, Boolean.valueOf(n73ArtEti), A73ArtEti, Boolean.valueOf(n117ArtUrg), Byte.valueOf(A117ArtUrg), Boolean.valueOf(n88ArtMer), A88ArtMer, Boolean.valueOf(n105ArtTra1), A105ArtTra1, Boolean.valueOf(n106ArtTra2), A106ArtTra2, Boolean.valueOf(n107ArtTra3), A107ArtTra3, Boolean.valueOf(n108ArtTraP1), Short.valueOf(A108ArtTraP1), Boolean.valueOf(n109ArtTraP2), Short.valueOf(A109ArtTraP2), Boolean.valueOf(n110ArtTraP3), Short.valueOf(A110ArtTraP3), Boolean.valueOf(n111ArtUrd1), A111ArtUrd1, Boolean.valueOf(n112ArtUrd2), A112ArtUrd2, Boolean.valueOf(n113ArtUrd3), A113ArtUrd3, Boolean.valueOf(n114ArtUrdP1), Short.valueOf(A114ArtUrdP1), Boolean.valueOf(n115ArtUrdP2), Short.valueOf(A115ArtUrdP2), Boolean.valueOf(n116ArtUrdP3), Short.valueOf(A116ArtUrdP3), Boolean.valueOf(n89ArtObs), A89ArtObs, Boolean.valueOf(n90ArtObsFac), A90ArtObsFac, Boolean.valueOf(n92ArtPreKgm), A92ArtPreKgm, Boolean.valueOf(n93ArtPreMtr), A93ArtPreMtr, Boolean.valueOf(n91ArtPreDef), A91ArtPreDef, Boolean.valueOf(n967ArtNMtr), A967ArtNMtr, Boolean.valueOf(n1148ArtPml), Short.valueOf(A1148ArtPml), Boolean.valueOf(n1229ArtEncCom), Short.valueOf(A1229ArtEncCom), Boolean.valueOf(n1230ArtEncAnh), Short.valueOf(A1230ArtEncAnh), Boolean.valueOf(n1903ArtGraAca), Short.valueOf(A1903ArtGraAca), Boolean.valueOf(n1904ArtRdoN), A1904ArtRdoN, Boolean.valueOf(n1905ArtRdoA), A1905ArtRdoA, Boolean.valueOf(n2750ArtNumTex1), Byte.valueOf(A2750ArtNumTex1), Boolean.valueOf(n2751ArtNumTex2), Short.valueOf(A2751ArtNumTex2), Boolean.valueOf(n2707NumTexCod), A2707NumTexCod, Boolean.valueOf(n2791ArtFacAbs), A2791ArtFacAbs, Boolean.valueOf(n2834ArtPle2), A2834ArtPle2, Boolean.valueOf(n3072ArtObsLon), A3072ArtObsLon, Boolean.valueOf(n3121ArtNumCor), Short.valueOf(A3121ArtNumCor), Boolean.valueOf(n3122ArtAncSal1), Short.valueOf(A3122ArtAncSal1), Boolean.valueOf(n3123ArtAncSal2), Short.valueOf(A3123ArtAncSal2), Boolean.valueOf(n3124ArtAncSal3), Short.valueOf(A3124ArtAncSal3), Boolean.valueOf(n3125ArtGraAca2), Short.valueOf(A3125ArtGraAca2), Boolean.valueOf(n3126ArtGraCru2), Short.valueOf(A3126ArtGraCru2), Boolean.valueOf(n3683ArtFecCre), A3683ArtFecCre, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod), Boolean.valueOf(n4297ArtPmPPza), A4297ArtPmPPza, Boolean.valueOf(n4353ArtUsrCod), A4353ArtUsrCod, Boolean.valueOf(n4354ArtFecMod), A4354ArtFecMod, Boolean.valueOf(n4351ArtPreUlAc), A4351ArtPreUlAc,
      Boolean.valueOf(n4352ArtPreUsrM), A4352ArtPreUsrM, Boolean.valueOf(n4444ArtPelAnh), Short.valueOf(A4444ArtPelAnh), Boolean.valueOf(n4607ArtRb), Short.valueOf(A4607ArtRb), Boolean.valueOf(n5335ArtCodExt), A5335ArtCodExt, Boolean.valueOf(n5741ArtComer), A5741ArtComer, Boolean.valueOf(n6106ClaTubCod), Short.valueOf(A6106ClaTubCod), Boolean.valueOf(n6108ClaBolCod), Short.valueOf(A6108ClaBolCod), Boolean.valueOf(n6435ArtRdoCru1), A6435ArtRdoCru1, Boolean.valueOf(n6436ArtRdoCru2), A6436ArtRdoCru2, Boolean.valueOf(n6462ArtLu), A6462ArtLu, Boolean.valueOf(n7412Artgrm2Sc), Short.valueOf(A7412Artgrm2Sc), Boolean.valueOf(n7413ArtPmlSc), Short.valueOf(A7413ArtPmlSc), Boolean.valueOf(n7414ArtAncSc), Short.valueOf(A7414ArtAncSc), Boolean.valueOf(n7415ArtPmlCru), Short.valueOf(A7415ArtPmlCru), Boolean.valueOf(n7777ArtRdtSc), A7777ArtRdtSc, Boolean.valueOf(n7778ArtUnd), A7778ArtUnd, Boolean.valueOf(n7779ArtBlo), A7779ArtBlo, Boolean.valueOf(n9730ArtFabsH), A9730ArtFabsH, Boolean.valueOf(n9801ArtFabsT), A9801ArtFabsT, Boolean.valueOf(n12364ArtMT), Byte.valueOf(A12364ArtMT), Boolean.valueOf(n12695ArtElgAnc), A12695ArtElgAnc, Boolean.valueOf(n12696ArtElgLar), A12696ArtElgLar, Boolean.valueOf(n12697ArtRdoCru), A12697ArtRdoCru, Boolean.valueOf(n12698ArtEncLarg), A12698ArtEncLarg, Boolean.valueOf(n12699ArtEncAnc), A12699ArtEncAnc, Boolean.valueOf(n14100Artdsc2), A14100Artdsc2, A14295ArtActivo});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
      if ( (pr_default.getStatus(33) == 1) )
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
      /* Using cursor P008536 */
      pr_default.execute(34, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliOri), AV18ArtOri});
      while ( (pr_default.getStatus(34) != 101) )
      {
         A6964Mat_obs = P008536_A6964Mat_obs[0] ;
         n6964Mat_obs = P008536_n6964Mat_obs[0] ;
         A65ArtCod = P008536_A65ArtCod[0] ;
         A252CliCod = P008536_A252CliCod[0] ;
         A396EmprCod = P008536_A396EmprCod[0] ;
         A12358Mat_NAlim = P008536_A12358Mat_NAlim[0] ;
         A12357Mat_Color = P008536_A12357Mat_Color[0] ;
         n12357Mat_Color = P008536_n12357Mat_Color[0] ;
         A12356Mat_Dsc = P008536_A12356Mat_Dsc[0] ;
         n12356Mat_Dsc = P008536_n12356Mat_Dsc[0] ;
         A12355Mat_NE = P008536_A12355Mat_NE[0] ;
         n12355Mat_NE = P008536_n12355Mat_NE[0] ;
         A12354Mat_Lu = P008536_A12354Mat_Lu[0] ;
         n12354Mat_Lu = P008536_n12354Mat_Lu[0] ;
         A6963Mat_LM = P008536_A6963Mat_LM[0] ;
         n6963Mat_LM = P008536_n6963Mat_LM[0] ;
         A6962Mat_Porc = P008536_A6962Mat_Porc[0] ;
         n6962Mat_Porc = P008536_n6962Mat_Porc[0] ;
         A6961Mat_Lote = P008536_A6961Mat_Lote[0] ;
         n6961Mat_Lote = P008536_n6961Mat_Lote[0] ;
         A6960Mat_ProvN = P008536_A6960Mat_ProvN[0] ;
         n6960Mat_ProvN = P008536_n6960Mat_ProvN[0] ;
         A6959Mat_NumCol = P008536_A6959Mat_NumCol[0] ;
         n6959Mat_NumCol = P008536_n6959Mat_NumCol[0] ;
         A6958Mat_NomCol = P008536_A6958Mat_NomCol[0] ;
         n6958Mat_NomCol = P008536_n6958Mat_NomCol[0] ;
         A6957Mat_Tors = P008536_A6957Mat_Tors[0] ;
         n6957Mat_Tors = P008536_n6957Mat_Tors[0] ;
         A6956Mat_Mate = P008536_A6956Mat_Mate[0] ;
         n6956Mat_Mate = P008536_n6956Mat_Mate[0] ;
         A6955Mat_Estr = P008536_A6955Mat_Estr[0] ;
         n6955Mat_Estr = P008536_n6955Mat_Estr[0] ;
         A6954Mat_lin = P008536_A6954Mat_lin[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         /*
            INSERT RECORD ON TABLE TXPARTMAT

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W6954Mat_lin = A6954Mat_lin ;
         W6955Mat_Estr = A6955Mat_Estr ;
         n6955Mat_Estr = false ;
         W6956Mat_Mate = A6956Mat_Mate ;
         n6956Mat_Mate = false ;
         W6957Mat_Tors = A6957Mat_Tors ;
         n6957Mat_Tors = false ;
         W6958Mat_NomCol = A6958Mat_NomCol ;
         n6958Mat_NomCol = false ;
         W6959Mat_NumCol = A6959Mat_NumCol ;
         n6959Mat_NumCol = false ;
         W6960Mat_ProvN = A6960Mat_ProvN ;
         n6960Mat_ProvN = false ;
         W6961Mat_Lote = A6961Mat_Lote ;
         n6961Mat_Lote = false ;
         W6962Mat_Porc = A6962Mat_Porc ;
         n6962Mat_Porc = false ;
         W6963Mat_LM = A6963Mat_LM ;
         n6963Mat_LM = false ;
         W6964Mat_obs = A6964Mat_obs ;
         n6964Mat_obs = false ;
         A396EmprCod = AV15EmprCod ;
         A252CliCod = AV17CliDes ;
         A65ArtCod = AV19ArtDes ;
         n6955Mat_Estr = false ;
         n6956Mat_Mate = false ;
         n6957Mat_Tors = false ;
         n6958Mat_NomCol = false ;
         n6959Mat_NumCol = false ;
         n6960Mat_ProvN = false ;
         n6961Mat_Lote = false ;
         n6962Mat_Porc = false ;
         n6963Mat_LM = false ;
         n6964Mat_obs = false ;
         /* Using cursor P008537 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Short.valueOf(A6954Mat_lin), Boolean.valueOf(n6955Mat_Estr), A6955Mat_Estr, Boolean.valueOf(n6956Mat_Mate), A6956Mat_Mate, Boolean.valueOf(n6957Mat_Tors), A6957Mat_Tors, Boolean.valueOf(n6958Mat_NomCol), A6958Mat_NomCol, Boolean.valueOf(n6959Mat_NumCol), Integer.valueOf(A6959Mat_NumCol), Boolean.valueOf(n6960Mat_ProvN), A6960Mat_ProvN, Boolean.valueOf(n6961Mat_Lote), A6961Mat_Lote, Boolean.valueOf(n6962Mat_Porc), A6962Mat_Porc, Boolean.valueOf(n6963Mat_LM), A6963Mat_LM, Boolean.valueOf(n6964Mat_obs), A6964Mat_obs, Boolean.valueOf(n12354Mat_Lu), A12354Mat_Lu, Boolean.valueOf(n12355Mat_NE), A12355Mat_NE, Boolean.valueOf(n12356Mat_Dsc), A12356Mat_Dsc, Boolean.valueOf(n12357Mat_Color), A12357Mat_Color, A12358Mat_NAlim});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTMAT");
         if ( (pr_default.getStatus(35) == 1) )
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
         A6954Mat_lin = W6954Mat_lin ;
         A6955Mat_Estr = W6955Mat_Estr ;
         n6955Mat_Estr = false ;
         A6956Mat_Mate = W6956Mat_Mate ;
         n6956Mat_Mate = false ;
         A6957Mat_Tors = W6957Mat_Tors ;
         n6957Mat_Tors = false ;
         A6958Mat_NomCol = W6958Mat_NomCol ;
         n6958Mat_NomCol = false ;
         A6959Mat_NumCol = W6959Mat_NumCol ;
         n6959Mat_NumCol = false ;
         A6960Mat_ProvN = W6960Mat_ProvN ;
         n6960Mat_ProvN = false ;
         A6961Mat_Lote = W6961Mat_Lote ;
         n6961Mat_Lote = false ;
         A6962Mat_Porc = W6962Mat_Porc ;
         n6962Mat_Porc = false ;
         A6963Mat_LM = W6963Mat_LM ;
         n6963Mat_LM = false ;
         A6964Mat_obs = W6964Mat_obs ;
         n6964Mat_obs = false ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         pr_default.readNext(34);
      }
      pr_default.close(34);
   }

   public void S161( )
   {
      /* 'TORIENT' Routine */
      returnInSub = false ;
      /* Using cursor P008538 */
      pr_default.execute(36, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliOri), AV18ArtOri, AV54ProCod});
      while ( (pr_default.getStatus(36) != 101) )
      {
         A758ProCod = P008538_A758ProCod[0] ;
         A65ArtCod = P008538_A65ArtCod[0] ;
         A252CliCod = P008538_A252CliCod[0] ;
         A396EmprCod = P008538_A396EmprCod[0] ;
         A12647ArtFasFct = P008538_A12647ArtFasFct[0] ;
         n12647ArtFasFct = P008538_n12647ArtFasFct[0] ;
         A9836FasCodM = P008538_A9836FasCodM[0] ;
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W758ProCod = A758ProCod ;
         /*
            INSERT RECORD ON TABLE TXPCAPFMP

         */
         W396EmprCod = A396EmprCod ;
         W252CliCod = A252CliCod ;
         W65ArtCod = A65ArtCod ;
         W758ProCod = A758ProCod ;
         W9836FasCodM = A9836FasCodM ;
         A396EmprCod = AV15EmprCod ;
         A252CliCod = AV17CliDes ;
         A65ArtCod = AV19ArtDes ;
         A758ProCod = AV54ProCod ;
         /* Using cursor P008539 */
         pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, Boolean.valueOf(n12647ArtFasFct), A12647ArtFasFct});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFMP");
         if ( (pr_default.getStatus(37) == 1) )
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
         A9836FasCodM = W9836FasCodM ;
         /* End Insert */
         /* Using cursor P008540 */
         pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM});
         while ( (pr_default.getStatus(38) != 101) )
         {
            A14553CPFMDc2 = P008540_A14553CPFMDc2[0] ;
            A14552CPFMDc = P008540_A14552CPFMDc[0] ;
            A14551CPFMNp = P008540_A14551CPFMNp[0] ;
            A14550CPFMVel = P008540_A14550CPFMVel[0] ;
            A14549CPFMPrep = P008540_A14549CPFMPrep[0] ;
            A14548CPFMPres = P008540_A14548CPFMPres[0] ;
            A9869MaqAncC = P008540_A9869MaqAncC[0] ;
            A9830MaqCodC = P008540_A9830MaqCodC[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W758ProCod = A758ProCod ;
            W9836FasCodM = A9836FasCodM ;
            /*
               INSERT RECORD ON TABLE TXPCAPFM1

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W758ProCod = A758ProCod ;
            W9836FasCodM = A9836FasCodM ;
            W9830MaqCodC = A9830MaqCodC ;
            A396EmprCod = AV15EmprCod ;
            A252CliCod = AV17CliDes ;
            A65ArtCod = AV19ArtDes ;
            A758ProCod = AV54ProCod ;
            /* Using cursor P008541 */
            pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9869MaqAncC), Short.valueOf(A14548CPFMPres), Short.valueOf(A14549CPFMPrep), A14550CPFMVel, Short.valueOf(A14551CPFMNp), A14552CPFMDc, A14553CPFMDc2});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFM1");
            if ( (pr_default.getStatus(39) == 1) )
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
            A9836FasCodM = W9836FasCodM ;
            A9830MaqCodC = W9830MaqCodC ;
            /* End Insert */
            /* Using cursor P008542 */
            pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC});
            while ( (pr_default.getStatus(40) != 101) )
            {
               A14080ParFasPLC = P008542_A14080ParFasPLC[0] ;
               A14077ParFMVal2 = P008542_A14077ParFMVal2[0] ;
               A14076ParFMVMax = P008542_A14076ParFMVMax[0] ;
               A14075ParFMVMin = P008542_A14075ParFMVMin[0] ;
               A12448ParEspIdS = P008542_A12448ParEspIdS[0] ;
               n12448ParEspIdS = P008542_n12448ParEspIdS[0] ;
               A10256Itm_ord2 = P008542_A10256Itm_ord2[0] ;
               A9829ParFMObs = P008542_A9829ParFMObs[0] ;
               A9828ParFMVal = P008542_A9828ParFMVal[0] ;
               A1664ParFasCod = P008542_A1664ParFasCod[0] ;
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W65ArtCod = A65ArtCod ;
               W758ProCod = A758ProCod ;
               W9836FasCodM = A9836FasCodM ;
               W9830MaqCodC = A9830MaqCodC ;
               /*
                  INSERT RECORD ON TABLE TXPCAPFM2

               */
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W65ArtCod = A65ArtCod ;
               W758ProCod = A758ProCod ;
               W9836FasCodM = A9836FasCodM ;
               W9830MaqCodC = A9830MaqCodC ;
               W1664ParFasCod = A1664ParFasCod ;
               W9828ParFMVal = A9828ParFMVal ;
               W9829ParFMObs = A9829ParFMObs ;
               W10256Itm_ord2 = A10256Itm_ord2 ;
               A396EmprCod = AV15EmprCod ;
               A252CliCod = AV17CliDes ;
               A65ArtCod = AV19ArtDes ;
               A758ProCod = AV54ProCod ;
               /* Using cursor P008543 */
               pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A1664ParFasCod), A9828ParFMVal, A9829ParFMObs, Short.valueOf(A10256Itm_ord2), Boolean.valueOf(n12448ParEspIdS), Short.valueOf(A12448ParEspIdS), A14075ParFMVMin, A14076ParFMVMax, A14077ParFMVal2, A14080ParFasPLC});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCAPFM2");
               if ( (pr_default.getStatus(41) == 1) )
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
               A9836FasCodM = W9836FasCodM ;
               A9830MaqCodC = W9830MaqCodC ;
               A1664ParFasCod = W1664ParFasCod ;
               A9828ParFMVal = W9828ParFMVal ;
               A9829ParFMObs = W9829ParFMObs ;
               A10256Itm_ord2 = W10256Itm_ord2 ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A252CliCod = W252CliCod ;
               A65ArtCod = W65ArtCod ;
               A758ProCod = W758ProCod ;
               A9836FasCodM = W9836FasCodM ;
               A9830MaqCodC = W9830MaqCodC ;
               pr_default.readNext(40);
            }
            pr_default.close(40);
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            A758ProCod = W758ProCod ;
            A9836FasCodM = W9836FasCodM ;
            pr_default.readNext(38);
         }
         pr_default.close(38);
         /* Using cursor P008544 */
         pr_default.execute(42, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliOri), AV18ArtOri, AV54ProCod, A9836FasCodM});
         while ( (pr_default.getStatus(42) != 101) )
         {
            A758ProCod = P008544_A758ProCod[0] ;
            A65ArtCod = P008544_A65ArtCod[0] ;
            A252CliCod = P008544_A252CliCod[0] ;
            A396EmprCod = P008544_A396EmprCod[0] ;
            A9864MaqAncA = P008544_A9864MaqAncA[0] ;
            A9830MaqCodC = P008544_A9830MaqCodC[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W758ProCod = A758ProCod ;
            W9836FasCodM = A9836FasCodM ;
            /*
               INSERT RECORD ON TABLE TXPPFSMQA

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W758ProCod = A758ProCod ;
            W9836FasCodM = A9836FasCodM ;
            W9830MaqCodC = A9830MaqCodC ;
            W9864MaqAncA = A9864MaqAncA ;
            A396EmprCod = AV15EmprCod ;
            A252CliCod = AV17CliDes ;
            A65ArtCod = AV19ArtDes ;
            A758ProCod = AV54ProCod ;
            /* Using cursor P008545 */
            pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPFSMQA");
            if ( (pr_default.getStatus(43) == 1) )
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
            A9836FasCodM = W9836FasCodM ;
            A9830MaqCodC = W9830MaqCodC ;
            A9864MaqAncA = W9864MaqAncA ;
            /* End Insert */
            /* Using cursor P008546 */
            pr_default.execute(44, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA)});
            while ( (pr_default.getStatus(44) != 101) )
            {
               A10264Itm_ord4 = P008546_A10264Itm_ord4[0] ;
               n10264Itm_ord4 = P008546_n10264Itm_ord4[0] ;
               A9868ParObsX = P008546_A9868ParObsX[0] ;
               n9868ParObsX = P008546_n9868ParObsX[0] ;
               A9867ParValX = P008546_A9867ParValX[0] ;
               n9867ParValX = P008546_n9867ParValX[0] ;
               A9865Cod_parX = P008546_A9865Cod_parX[0] ;
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W65ArtCod = A65ArtCod ;
               W758ProCod = A758ProCod ;
               W9836FasCodM = A9836FasCodM ;
               W9830MaqCodC = A9830MaqCodC ;
               W9864MaqAncA = A9864MaqAncA ;
               /*
                  INSERT RECORD ON TABLE TXPPFSMAC

               */
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W65ArtCod = A65ArtCod ;
               W758ProCod = A758ProCod ;
               W9836FasCodM = A9836FasCodM ;
               W9830MaqCodC = A9830MaqCodC ;
               W9864MaqAncA = A9864MaqAncA ;
               W9865Cod_parX = A9865Cod_parX ;
               W9867ParValX = A9867ParValX ;
               n9867ParValX = false ;
               W9868ParObsX = A9868ParObsX ;
               n9868ParObsX = false ;
               W10264Itm_ord4 = A10264Itm_ord4 ;
               n10264Itm_ord4 = false ;
               A396EmprCod = AV15EmprCod ;
               A252CliCod = AV17CliDes ;
               A65ArtCod = AV19ArtDes ;
               A758ProCod = AV54ProCod ;
               n9867ParValX = false ;
               n9868ParObsX = false ;
               n10264Itm_ord4 = false ;
               /* Using cursor P008547 */
               pr_default.execute(45, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM, A9830MaqCodC, Short.valueOf(A9864MaqAncA), Short.valueOf(A9865Cod_parX), Boolean.valueOf(n9867ParValX), A9867ParValX, Boolean.valueOf(n9868ParObsX), A9868ParObsX, Boolean.valueOf(n10264Itm_ord4), Short.valueOf(A10264Itm_ord4)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPFSMAC");
               if ( (pr_default.getStatus(45) == 1) )
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
               A9836FasCodM = W9836FasCodM ;
               A9830MaqCodC = W9830MaqCodC ;
               A9864MaqAncA = W9864MaqAncA ;
               A9865Cod_parX = W9865Cod_parX ;
               A9867ParValX = W9867ParValX ;
               n9867ParValX = false ;
               A9868ParObsX = W9868ParObsX ;
               n9868ParObsX = false ;
               A10264Itm_ord4 = W10264Itm_ord4 ;
               n10264Itm_ord4 = false ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A252CliCod = W252CliCod ;
               A65ArtCod = W65ArtCod ;
               A758ProCod = W758ProCod ;
               A9836FasCodM = W9836FasCodM ;
               A9830MaqCodC = W9830MaqCodC ;
               A9864MaqAncA = W9864MaqAncA ;
               pr_default.readNext(44);
            }
            pr_default.close(44);
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            A758ProCod = W758ProCod ;
            A9836FasCodM = W9836FasCodM ;
            pr_default.readNext(42);
         }
         pr_default.close(42);
         A396EmprCod = W396EmprCod ;
         A252CliCod = W252CliCod ;
         A65ArtCod = W65ArtCod ;
         A758ProCod = W758ProCod ;
         pr_default.readNext(36);
      }
      pr_default.close(36);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewse2.this.AV15EmprCod;
      this.aP4[0] = pnewse2.this.AV19ArtDes;
      this.aP5[0] = pnewse2.this.AV60ArtDscDes;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnewse2");
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
      P00852_A3072ArtObsLon = new String[] {""} ;
      P00852_n3072ArtObsLon = new boolean[] {false} ;
      P00852_A65ArtCod = new String[] {""} ;
      P00852_A252CliCod = new int[1] ;
      P00852_A396EmprCod = new String[] {""} ;
      P00852_A69ArtDsc = new String[] {""} ;
      P00852_n69ArtDsc = new boolean[] {false} ;
      P00852_A87ArtMat = new String[] {""} ;
      P00852_n87ArtMat = new boolean[] {false} ;
      P00852_A829TipArtCod = new short[1] ;
      P00852_A1148ArtPml = new short[1] ;
      P00852_n1148ArtPml = new boolean[] {false} ;
      P00852_A78ArtGraCru = new short[1] ;
      P00852_n78ArtGraCru = new boolean[] {false} ;
      P00852_A68ArtCruMin = new short[1] ;
      P00852_n68ArtCruMin = new boolean[] {false} ;
      P00852_A67ArtCruMax = new short[1] ;
      P00852_n67ArtCruMax = new boolean[] {false} ;
      P00852_A63ArtAcaMin = new short[1] ;
      P00852_n63ArtAcaMin = new boolean[] {false} ;
      P00852_A62ArtAcaMax = new short[1] ;
      P00852_n62ArtAcaMax = new boolean[] {false} ;
      P00852_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n95ArtRen = new boolean[] {false} ;
      P00852_A101ArtTipPle = new String[] {""} ;
      P00852_n101ArtTipPle = new boolean[] {false} ;
      P00852_A2834ArtPle2 = new String[] {""} ;
      P00852_n2834ArtPle2 = new boolean[] {false} ;
      P00852_A100ArtTipLar = new String[] {""} ;
      P00852_n100ArtTipLar = new boolean[] {false} ;
      P00852_A66ArtCorOri = new String[] {""} ;
      P00852_n66ArtCorOri = new boolean[] {false} ;
      P00852_A70ArtEncOri = new String[] {""} ;
      P00852_n70ArtEncOri = new boolean[] {false} ;
      P00852_A96ArtSua = new String[] {""} ;
      P00852_n96ArtSua = new boolean[] {false} ;
      P00852_A64ArtAcaQui = new String[] {""} ;
      P00852_n64ArtAcaQui = new boolean[] {false} ;
      P00852_A73ArtEti = new String[] {""} ;
      P00852_n73ArtEti = new boolean[] {false} ;
      P00852_A117ArtUrg = new byte[1] ;
      P00852_n117ArtUrg = new boolean[] {false} ;
      P00852_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n88ArtMer = new boolean[] {false} ;
      P00852_A105ArtTra1 = new String[] {""} ;
      P00852_n105ArtTra1 = new boolean[] {false} ;
      P00852_A106ArtTra2 = new String[] {""} ;
      P00852_n106ArtTra2 = new boolean[] {false} ;
      P00852_A107ArtTra3 = new String[] {""} ;
      P00852_n107ArtTra3 = new boolean[] {false} ;
      P00852_A108ArtTraP1 = new short[1] ;
      P00852_n108ArtTraP1 = new boolean[] {false} ;
      P00852_A109ArtTraP2 = new short[1] ;
      P00852_n109ArtTraP2 = new boolean[] {false} ;
      P00852_A110ArtTraP3 = new short[1] ;
      P00852_n110ArtTraP3 = new boolean[] {false} ;
      P00852_A111ArtUrd1 = new String[] {""} ;
      P00852_n111ArtUrd1 = new boolean[] {false} ;
      P00852_A112ArtUrd2 = new String[] {""} ;
      P00852_n112ArtUrd2 = new boolean[] {false} ;
      P00852_A113ArtUrd3 = new String[] {""} ;
      P00852_n113ArtUrd3 = new boolean[] {false} ;
      P00852_A114ArtUrdP1 = new short[1] ;
      P00852_n114ArtUrdP1 = new boolean[] {false} ;
      P00852_A115ArtUrdP2 = new short[1] ;
      P00852_n115ArtUrdP2 = new boolean[] {false} ;
      P00852_A116ArtUrdP3 = new short[1] ;
      P00852_n116ArtUrdP3 = new boolean[] {false} ;
      P00852_A89ArtObs = new String[] {""} ;
      P00852_n89ArtObs = new boolean[] {false} ;
      P00852_A90ArtObsFac = new String[] {""} ;
      P00852_n90ArtObsFac = new boolean[] {false} ;
      P00852_A1229ArtEncCom = new short[1] ;
      P00852_n1229ArtEncCom = new boolean[] {false} ;
      P00852_A1230ArtEncAnh = new short[1] ;
      P00852_n1230ArtEncAnh = new boolean[] {false} ;
      P00852_A5741ArtComer = new String[] {""} ;
      P00852_n5741ArtComer = new boolean[] {false} ;
      P00852_A5335ArtCodExt = new String[] {""} ;
      P00852_n5335ArtCodExt = new boolean[] {false} ;
      P00852_A1903ArtGraAca = new short[1] ;
      P00852_n1903ArtGraAca = new boolean[] {false} ;
      P00852_A1905ArtRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n1905ArtRdoA = new boolean[] {false} ;
      P00852_A1904ArtRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n1904ArtRdoN = new boolean[] {false} ;
      P00852_A3121ArtNumCor = new short[1] ;
      P00852_n3121ArtNumCor = new boolean[] {false} ;
      P00852_A3122ArtAncSal1 = new short[1] ;
      P00852_n3122ArtAncSal1 = new boolean[] {false} ;
      P00852_A3123ArtAncSal2 = new short[1] ;
      P00852_n3123ArtAncSal2 = new boolean[] {false} ;
      P00852_A3124ArtAncSal3 = new short[1] ;
      P00852_n3124ArtAncSal3 = new boolean[] {false} ;
      P00852_A3125ArtGraAca2 = new short[1] ;
      P00852_n3125ArtGraAca2 = new boolean[] {false} ;
      P00852_A3126ArtGraCru2 = new short[1] ;
      P00852_n3126ArtGraCru2 = new boolean[] {false} ;
      P00852_A4295ClasCod = new short[1] ;
      P00852_n4295ClasCod = new boolean[] {false} ;
      P00852_A4297ArtPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n4297ArtPmPPza = new boolean[] {false} ;
      P00852_A3683ArtFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      P00852_n3683ArtFecCre = new boolean[] {false} ;
      P00852_A4353ArtUsrCod = new String[] {""} ;
      P00852_n4353ArtUsrCod = new boolean[] {false} ;
      P00852_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P00852_n4354ArtFecMod = new boolean[] {false} ;
      P00852_A6106ClaTubCod = new short[1] ;
      P00852_n6106ClaTubCod = new boolean[] {false} ;
      P00852_A6108ClaBolCod = new short[1] ;
      P00852_n6108ClaBolCod = new boolean[] {false} ;
      P00852_A6435ArtRdoCru1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n6435ArtRdoCru1 = new boolean[] {false} ;
      P00852_A6436ArtRdoCru2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n6436ArtRdoCru2 = new boolean[] {false} ;
      P00852_A6462ArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n6462ArtLu = new boolean[] {false} ;
      P00852_A4607ArtRb = new short[1] ;
      P00852_n4607ArtRb = new boolean[] {false} ;
      P00852_A4444ArtPelAnh = new short[1] ;
      P00852_n4444ArtPelAnh = new boolean[] {false} ;
      P00852_A7412Artgrm2Sc = new short[1] ;
      P00852_n7412Artgrm2Sc = new boolean[] {false} ;
      P00852_A7413ArtPmlSc = new short[1] ;
      P00852_n7413ArtPmlSc = new boolean[] {false} ;
      P00852_A7414ArtAncSc = new short[1] ;
      P00852_n7414ArtAncSc = new boolean[] {false} ;
      P00852_A7415ArtPmlCru = new short[1] ;
      P00852_n7415ArtPmlCru = new boolean[] {false} ;
      P00852_A7777ArtRdtSc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n7777ArtRdtSc = new boolean[] {false} ;
      P00852_A7778ArtUnd = new String[] {""} ;
      P00852_n7778ArtUnd = new boolean[] {false} ;
      P00852_A7779ArtBlo = new String[] {""} ;
      P00852_n7779ArtBlo = new boolean[] {false} ;
      P00852_A967ArtNMtr = new String[] {""} ;
      P00852_n967ArtNMtr = new boolean[] {false} ;
      P00852_A2707NumTexCod = new String[] {""} ;
      P00852_n2707NumTexCod = new boolean[] {false} ;
      P00852_A2750ArtNumTex1 = new byte[1] ;
      P00852_n2750ArtNumTex1 = new boolean[] {false} ;
      P00852_A2751ArtNumTex2 = new short[1] ;
      P00852_n2751ArtNumTex2 = new boolean[] {false} ;
      P00852_A9801ArtFabsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n9801ArtFabsT = new boolean[] {false} ;
      P00852_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n2791ArtFacAbs = new boolean[] {false} ;
      P00852_A9730ArtFabsH = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n9730ArtFabsH = new boolean[] {false} ;
      P00852_A12695ArtElgAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n12695ArtElgAnc = new boolean[] {false} ;
      P00852_A12696ArtElgLar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n12696ArtElgLar = new boolean[] {false} ;
      P00852_A12697ArtRdoCru = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n12697ArtRdoCru = new boolean[] {false} ;
      P00852_A12698ArtEncLarg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00852_n12698ArtEncLarg = new boolean[] {false} ;
      P00852_A14100Artdsc2 = new String[] {""} ;
      P00852_n14100Artdsc2 = new boolean[] {false} ;
      P00852_A12364ArtMT = new byte[1] ;
      P00852_n12364ArtMT = new boolean[] {false} ;
      P00852_A14295ArtActivo = new String[] {""} ;
      A3072ArtObsLon = "" ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      A69ArtDsc = "" ;
      A87ArtMat = "" ;
      A95ArtRen = DecimalUtil.ZERO ;
      A101ArtTipPle = "" ;
      A2834ArtPle2 = "" ;
      A100ArtTipLar = "" ;
      A66ArtCorOri = "" ;
      A70ArtEncOri = "" ;
      A96ArtSua = "" ;
      A64ArtAcaQui = "" ;
      A73ArtEti = "" ;
      A88ArtMer = DecimalUtil.ZERO ;
      A105ArtTra1 = "" ;
      A106ArtTra2 = "" ;
      A107ArtTra3 = "" ;
      A111ArtUrd1 = "" ;
      A112ArtUrd2 = "" ;
      A113ArtUrd3 = "" ;
      A89ArtObs = "" ;
      A90ArtObsFac = "" ;
      A5741ArtComer = "" ;
      A5335ArtCodExt = "" ;
      A1905ArtRdoA = DecimalUtil.ZERO ;
      A1904ArtRdoN = DecimalUtil.ZERO ;
      A4297ArtPmPPza = DecimalUtil.ZERO ;
      A3683ArtFecCre = GXutil.nullDate() ;
      A4353ArtUsrCod = "" ;
      A4354ArtFecMod = GXutil.nullDate() ;
      A6435ArtRdoCru1 = DecimalUtil.ZERO ;
      A6436ArtRdoCru2 = DecimalUtil.ZERO ;
      A6462ArtLu = DecimalUtil.ZERO ;
      A7777ArtRdtSc = DecimalUtil.ZERO ;
      A7778ArtUnd = "" ;
      A7779ArtBlo = "" ;
      A967ArtNMtr = "" ;
      A2707NumTexCod = "" ;
      A9801ArtFabsT = DecimalUtil.ZERO ;
      A2791ArtFacAbs = DecimalUtil.ZERO ;
      A9730ArtFabsH = DecimalUtil.ZERO ;
      A12695ArtElgAnc = DecimalUtil.ZERO ;
      A12696ArtElgLar = DecimalUtil.ZERO ;
      A12697ArtRdoCru = DecimalUtil.ZERO ;
      A12698ArtEncLarg = DecimalUtil.ZERO ;
      A14100Artdsc2 = "" ;
      A14295ArtActivo = "" ;
      W396EmprCod = "" ;
      W65ArtCod = "" ;
      AV21ArtCod = "" ;
      AV22ArtMat = "" ;
      AV30ArtRen = DecimalUtil.ZERO ;
      AV31ArtTipPle = "" ;
      AV71ArtPle2 = "" ;
      AV32ArtTipLar = "" ;
      AV33ArtCorOri = "" ;
      AV34ArtEncOri = "" ;
      AV35ArtSua = "" ;
      AV36ArtAcaQui = "" ;
      AV37ArtEti = "" ;
      AV39ArtMer = DecimalUtil.ZERO ;
      AV40ArtTra1 = "" ;
      AV41ArtTra2 = "" ;
      AV42ArtTra3 = "" ;
      AV46ArtUrd1 = "" ;
      AV47ArtUrd2 = "" ;
      AV48ArtUrd3 = "" ;
      AV52ArtObs = "" ;
      AV58ArtObsLon = "" ;
      AV53ArtObsFac = "" ;
      AV69ArtComer = "" ;
      AV73ArtCodExt = "" ;
      AV75ArtRdoA = DecimalUtil.ZERO ;
      AV76ArtRdoN = DecimalUtil.ZERO ;
      AV84ArtPmPPza = DecimalUtil.ZERO ;
      AV85ArtFecCre = GXutil.nullDate() ;
      AV86ArtUsrCod = "" ;
      AV87ArtFecMod = GXutil.nullDate() ;
      AV90ArtRdoCru1 = DecimalUtil.ZERO ;
      AV91ArtRdoCru2 = DecimalUtil.ZERO ;
      AV93ArtLu = DecimalUtil.ZERO ;
      AV100ArtRdtSc = DecimalUtil.ZERO ;
      AV101ArtUnd = "" ;
      AV102ArtBlo = "" ;
      AV92ArtNMtr = "" ;
      AV104NumTexCod = "" ;
      AV121artfabst = DecimalUtil.ZERO ;
      AV62ArtFacAbs = DecimalUtil.ZERO ;
      AV122artfabsh = DecimalUtil.ZERO ;
      AV123ArtElgAnc = DecimalUtil.ZERO ;
      AV124ArtElgLar = DecimalUtil.ZERO ;
      AV125ArtRdoCru = DecimalUtil.ZERO ;
      AV126ArtEncLarg = DecimalUtil.ZERO ;
      AV127ArtEncAnc = DecimalUtil.ZERO ;
      AV130Artdsc2 = "" ;
      AV132ArtActivo = "" ;
      P00853_A396EmprCod = new String[] {""} ;
      P00853_A252CliCod = new int[1] ;
      P00853_A65ArtCod = new String[] {""} ;
      P00853_A758ProCod = new String[] {""} ;
      P00853_A12752Art_Tipo = new String[] {""} ;
      P00853_n12752Art_Tipo = new boolean[] {false} ;
      P00853_A12142ProStFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00853_A12141ProSta = new byte[1] ;
      P00853_A11272ProFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00853_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      P00853_A10555ProUserM = new String[] {""} ;
      P00853_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      P00853_A10553ProUserA = new String[] {""} ;
      P00853_A10412ProAct = new String[] {""} ;
      P00853_A10026DscCFa = new String[] {""} ;
      P00853_A9629Art_els = new String[] {""} ;
      P00853_n9629Art_els = new boolean[] {false} ;
      P00853_A9628Art_ets = new String[] {""} ;
      P00853_n9628Art_ets = new boolean[] {false} ;
      P00853_A8955Art_Obs = new String[] {""} ;
      P00853_n8955Art_Obs = new boolean[] {false} ;
      P00853_A8166Art_Und = new String[] {""} ;
      P00853_n8166Art_Und = new boolean[] {false} ;
      P00853_A8165Art_Dsc = new String[] {""} ;
      P00853_n8165Art_Dsc = new boolean[] {false} ;
      P00853_A8084Art_RdoP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00853_n8084Art_RdoP = new boolean[] {false} ;
      P00853_A8083Art_AncP = new short[1] ;
      P00853_n8083Art_AncP = new boolean[] {false} ;
      P00853_A8082Art_PmlP = new short[1] ;
      P00853_n8082Art_PmlP = new boolean[] {false} ;
      P00853_A8081Art_GrmP = new short[1] ;
      P00853_n8081Art_GrmP = new boolean[] {false} ;
      P00853_A8080Art_PmlC = new short[1] ;
      P00853_n8080Art_PmlC = new boolean[] {false} ;
      P00853_A8079Art_AncC = new short[1] ;
      P00853_n8079Art_AncC = new boolean[] {false} ;
      P00853_A8078Art_GrmC = new short[1] ;
      P00853_n8078Art_GrmC = new boolean[] {false} ;
      P00853_A8077Art_GrmB = new short[1] ;
      P00853_n8077Art_GrmB = new boolean[] {false} ;
      P00853_A8076Art_AncB = new short[1] ;
      P00853_n8076Art_AncB = new boolean[] {false} ;
      P00853_A8075Art_Fabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00853_n8075Art_Fabs = new boolean[] {false} ;
      P00853_A8074Art_Rdpc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00853_n8074Art_Rdpc = new boolean[] {false} ;
      P00853_A8073Art_Rdo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00853_n8073Art_Rdo = new boolean[] {false} ;
      P00853_A8072Art_Cor = new String[] {""} ;
      P00853_n8072Art_Cor = new boolean[] {false} ;
      P00853_A8071Art_Enc = new String[] {""} ;
      P00853_n8071Art_Enc = new boolean[] {false} ;
      P00853_A8070Art_Elar = new short[1] ;
      P00853_n8070Art_Elar = new boolean[] {false} ;
      P00853_A8069Art_Eanc = new short[1] ;
      P00853_n8069Art_Eanc = new boolean[] {false} ;
      P00853_A8068Art_PmlA = new short[1] ;
      P00853_n8068Art_PmlA = new boolean[] {false} ;
      P00853_A8067Art_Merma = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00853_n8067Art_Merma = new boolean[] {false} ;
      P00853_A8066Art_AncA = new short[1] ;
      P00853_n8066Art_AncA = new boolean[] {false} ;
      P00853_A8065Art_GrmA = new short[1] ;
      P00853_n8065Art_GrmA = new boolean[] {false} ;
      A758ProCod = "" ;
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
      AV54ProCod = "" ;
      W758ProCod = "" ;
      Gx_emsg = "" ;
      P00855_A396EmprCod = new String[] {""} ;
      P00855_A252CliCod = new int[1] ;
      P00855_A65ArtCod = new String[] {""} ;
      P00855_A758ProCod = new String[] {""} ;
      P00855_A457FasCod = new String[] {""} ;
      P00855_A14547ArtFasNPs = new short[1] ;
      P00855_A14546ArtFasVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00855_A14545ArtFasPpp = new short[1] ;
      P00855_A14544ArtFasPyS = new short[1] ;
      P00855_A8560ArtFasFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00855_A4031CCTCod = new int[1] ;
      P00855_n4031CCTCod = new boolean[] {false} ;
      P00855_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00855_n4896ArtProFac = new boolean[] {false} ;
      P00855_A4895ArtProFacT = new String[] {""} ;
      P00855_n4895ArtProFacT = new boolean[] {false} ;
      P00855_A4894ArtProULin = new short[1] ;
      P00855_n4894ArtProULin = new boolean[] {false} ;
      A457FasCod = "" ;
      A14546ArtFasVel = DecimalUtil.ZERO ;
      A8560ArtFasFac = DecimalUtil.ZERO ;
      A4896ArtProFac = DecimalUtil.ZERO ;
      A4895ArtProFacT = "" ;
      AV61FasCod = "" ;
      W457FasCod = "" ;
      P00857_A396EmprCod = new String[] {""} ;
      P00857_A252CliCod = new int[1] ;
      P00857_A65ArtCod = new String[] {""} ;
      P00857_A758ProCod = new String[] {""} ;
      P00857_A457FasCod = new String[] {""} ;
      P00857_A1673ParFasObs = new String[] {""} ;
      P00857_A14061ParFasVmn = new String[] {""} ;
      P00857_A14060ParFasVmx = new String[] {""} ;
      P00857_A13220ParOrden = new short[1] ;
      P00857_A12670ParFasVl2 = new String[] {""} ;
      P00857_A1668ParFasVal = new String[] {""} ;
      P00857_A1664ParFasCod = new short[1] ;
      A1673ParFasObs = "" ;
      A14061ParFasVmn = "" ;
      A14060ParFasVmx = "" ;
      A12670ParFasVl2 = "" ;
      A1668ParFasVal = "" ;
      AV59ParFasObs = "" ;
      W1673ParFasObs = "" ;
      P00859_A65ArtCod = new String[] {""} ;
      P00859_A252CliCod = new int[1] ;
      P00859_A4898ArtProCod = new String[] {""} ;
      P00859_A4897ArtProLin = new short[1] ;
      P00859_A457FasCod = new String[] {""} ;
      P00859_A758ProCod = new String[] {""} ;
      P00859_A396EmprCod = new String[] {""} ;
      A4898ArtProCod = "" ;
      W4898ArtProCod = "" ;
      P008511_A6964Mat_obs = new String[] {""} ;
      P008511_n6964Mat_obs = new boolean[] {false} ;
      P008511_A65ArtCod = new String[] {""} ;
      P008511_A252CliCod = new int[1] ;
      P008511_A396EmprCod = new String[] {""} ;
      P008511_A12358Mat_NAlim = new String[] {""} ;
      P008511_A12357Mat_Color = new String[] {""} ;
      P008511_n12357Mat_Color = new boolean[] {false} ;
      P008511_A12356Mat_Dsc = new String[] {""} ;
      P008511_n12356Mat_Dsc = new boolean[] {false} ;
      P008511_A12355Mat_NE = new String[] {""} ;
      P008511_n12355Mat_NE = new boolean[] {false} ;
      P008511_A12354Mat_Lu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008511_n12354Mat_Lu = new boolean[] {false} ;
      P008511_A6963Mat_LM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008511_n6963Mat_LM = new boolean[] {false} ;
      P008511_A6962Mat_Porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008511_n6962Mat_Porc = new boolean[] {false} ;
      P008511_A6961Mat_Lote = new String[] {""} ;
      P008511_n6961Mat_Lote = new boolean[] {false} ;
      P008511_A6960Mat_ProvN = new String[] {""} ;
      P008511_n6960Mat_ProvN = new boolean[] {false} ;
      P008511_A6959Mat_NumCol = new int[1] ;
      P008511_n6959Mat_NumCol = new boolean[] {false} ;
      P008511_A6958Mat_NomCol = new String[] {""} ;
      P008511_n6958Mat_NomCol = new boolean[] {false} ;
      P008511_A6957Mat_Tors = new String[] {""} ;
      P008511_n6957Mat_Tors = new boolean[] {false} ;
      P008511_A6956Mat_Mate = new String[] {""} ;
      P008511_n6956Mat_Mate = new boolean[] {false} ;
      P008511_A6955Mat_Estr = new String[] {""} ;
      P008511_n6955Mat_Estr = new boolean[] {false} ;
      P008511_A6954Mat_lin = new short[1] ;
      A6964Mat_obs = "" ;
      A12358Mat_NAlim = "" ;
      A12357Mat_Color = "" ;
      A12356Mat_Dsc = "" ;
      A12355Mat_NE = "" ;
      A12354Mat_Lu = DecimalUtil.ZERO ;
      A6963Mat_LM = DecimalUtil.ZERO ;
      A6962Mat_Porc = DecimalUtil.ZERO ;
      A6961Mat_Lote = "" ;
      A6960Mat_ProvN = "" ;
      A6958Mat_NomCol = "" ;
      A6957Mat_Tors = "" ;
      A6956Mat_Mate = "" ;
      A6955Mat_Estr = "" ;
      W6955Mat_Estr = "" ;
      W6956Mat_Mate = "" ;
      W6957Mat_Tors = "" ;
      W6958Mat_NomCol = "" ;
      W6960Mat_ProvN = "" ;
      W6961Mat_Lote = "" ;
      W6962Mat_Porc = DecimalUtil.ZERO ;
      W6963Mat_LM = DecimalUtil.ZERO ;
      W6964Mat_obs = "" ;
      P008513_A396EmprCod = new String[] {""} ;
      P008513_A252CliCod = new int[1] ;
      P008513_A65ArtCod = new String[] {""} ;
      P008513_A2931Limite2 = new short[1] ;
      P008513_A2932Precio2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008513_n2932Precio2 = new boolean[] {false} ;
      A2932Precio2 = DecimalUtil.ZERO ;
      P008515_A396EmprCod = new String[] {""} ;
      P008515_A252CliCod = new int[1] ;
      P008515_A65ArtCod = new String[] {""} ;
      P008515_A585IntPreDef = new String[] {""} ;
      P008515_n585IntPreDef = new boolean[] {false} ;
      P008515_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008515_n587IntPreMtr = new boolean[] {false} ;
      P008515_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008515_n586IntPreKgm = new boolean[] {false} ;
      P008515_A583IntCod = new byte[1] ;
      P008515_A831TipColCod = new byte[1] ;
      P008515_A3616PreFacCod = new String[] {""} ;
      P008515_n3616PreFacCod = new boolean[] {false} ;
      A585IntPreDef = "" ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      A3616PreFacCod = "" ;
      AV110IntPreDef = "" ;
      AV111IntPreKgm = DecimalUtil.ZERO ;
      AV112IntPreMtr = DecimalUtil.ZERO ;
      W585IntPreDef = "" ;
      W586IntPreKgm = DecimalUtil.ZERO ;
      W587IntPreMtr = DecimalUtil.ZERO ;
      P008517_A396EmprCod = new String[] {""} ;
      P008517_A252CliCod = new int[1] ;
      P008517_A65ArtCod = new String[] {""} ;
      P008517_A3323RecPorInc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008517_n3323RecPorInc = new boolean[] {false} ;
      P008517_A2941RecBon = new String[] {""} ;
      P008517_n2941RecBon = new boolean[] {false} ;
      P008517_A2940Precio4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008517_n2940Precio4 = new boolean[] {false} ;
      P008517_A2939Limite4 = new short[1] ;
      P008517_A2937RecIntCod = new byte[1] ;
      A3323RecPorInc = DecimalUtil.ZERO ;
      A2941RecBon = "" ;
      A2940Precio4 = DecimalUtil.ZERO ;
      AV115Precio4 = DecimalUtil.ZERO ;
      AV116RecBon = "" ;
      AV117RecPorInc = DecimalUtil.ZERO ;
      W2940Precio4 = DecimalUtil.ZERO ;
      W2941RecBon = "" ;
      W3323RecPorInc = DecimalUtil.ZERO ;
      P008519_A396EmprCod = new String[] {""} ;
      P008519_A252CliCod = new int[1] ;
      P008519_A3321CliPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008519_n3321CliPreKgs = new boolean[] {false} ;
      P008519_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A3321CliPreKgs = DecimalUtil.ZERO ;
      A3320CliLimKgs = DecimalUtil.ZERO ;
      AV119CliLimKgs = DecimalUtil.ZERO ;
      AV118CliPreKgs = DecimalUtil.ZERO ;
      W3320CliLimKgs = DecimalUtil.ZERO ;
      W3321CliPreKgs = DecimalUtil.ZERO ;
      GXv_int1 = new byte[1] ;
      AV63station = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV64EmprNom = "" ;
      GXv_char4 = new String[1] ;
      AV65UsurCod = "" ;
      GXv_char5 = new String[1] ;
      P008521_A252CliCod = new int[1] ;
      P008521_A396EmprCod = new String[] {""} ;
      P008521_A278CliNif = new String[] {""} ;
      A278CliNif = "" ;
      P008523_A457FasCod = new String[] {""} ;
      P008523_A758ProCod = new String[] {""} ;
      P008523_A65ArtCod = new String[] {""} ;
      P008523_A252CliCod = new int[1] ;
      P008523_A396EmprCod = new String[] {""} ;
      P008523_A14547ArtFasNPs = new short[1] ;
      P008523_A14546ArtFasVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008523_A14545ArtFasPpp = new short[1] ;
      P008523_A14544ArtFasPyS = new short[1] ;
      P008523_A8560ArtFasFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008523_A4031CCTCod = new int[1] ;
      P008523_n4031CCTCod = new boolean[] {false} ;
      P008523_A4896ArtProFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008523_n4896ArtProFac = new boolean[] {false} ;
      P008523_A4895ArtProFacT = new String[] {""} ;
      P008523_n4895ArtProFacT = new boolean[] {false} ;
      P008523_A4894ArtProULin = new short[1] ;
      P008523_n4894ArtProULin = new boolean[] {false} ;
      P008525_A396EmprCod = new String[] {""} ;
      P008525_A252CliCod = new int[1] ;
      P008525_A65ArtCod = new String[] {""} ;
      P008525_A758ProCod = new String[] {""} ;
      P008525_A457FasCod = new String[] {""} ;
      P008525_A1673ParFasObs = new String[] {""} ;
      P008525_A14061ParFasVmn = new String[] {""} ;
      P008525_A14060ParFasVmx = new String[] {""} ;
      P008525_A13220ParOrden = new short[1] ;
      P008525_A12670ParFasVl2 = new String[] {""} ;
      P008525_A1668ParFasVal = new String[] {""} ;
      P008525_A1664ParFasCod = new short[1] ;
      P008527_A758ProCod = new String[] {""} ;
      P008527_A65ArtCod = new String[] {""} ;
      P008527_A252CliCod = new int[1] ;
      P008527_A396EmprCod = new String[] {""} ;
      P008527_A8328ParFasObsm = new String[] {""} ;
      P008527_n8328ParFasObsm = new boolean[] {false} ;
      P008527_A6988FasDscp = new String[] {""} ;
      P008527_n6988FasDscp = new boolean[] {false} ;
      P008527_A6987FasCodp = new String[] {""} ;
      P008527_n6987FasCodp = new boolean[] {false} ;
      P008527_A6986NumLinPro = new short[1] ;
      A8328ParFasObsm = "" ;
      A6988FasDscp = "" ;
      A6987FasCodp = "" ;
      W6987FasCodp = "" ;
      W6988FasDscp = "" ;
      P008529_A758ProCod = new String[] {""} ;
      P008529_A65ArtCod = new String[] {""} ;
      P008529_A252CliCod = new int[1] ;
      P008529_A396EmprCod = new String[] {""} ;
      P008529_A6990ParFasObsp = new String[] {""} ;
      P008529_n6990ParFasObsp = new boolean[] {false} ;
      P008529_A6989ParFasValp = new String[] {""} ;
      P008529_n6989ParFasValp = new boolean[] {false} ;
      P008529_A1664ParFasCod = new short[1] ;
      P008529_A6986NumLinPro = new short[1] ;
      A6990ParFasObsp = "" ;
      A6989ParFasValp = "" ;
      W6990ParFasObsp = "" ;
      W6989ParFasValp = "" ;
      P008531_A252CliCod = new int[1] ;
      P008531_A396EmprCod = new String[] {""} ;
      P008531_A278CliNif = new String[] {""} ;
      Gx_date = GXutil.nullDate() ;
      A91ArtPreDef = "" ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      A4351ArtPreUlAc = GXutil.nullDate() ;
      A4352ArtPreUsrM = "" ;
      A12699ArtEncAnc = DecimalUtil.ZERO ;
      P008533_A6964Mat_obs = new String[] {""} ;
      P008533_n6964Mat_obs = new boolean[] {false} ;
      P008533_A65ArtCod = new String[] {""} ;
      P008533_A396EmprCod = new String[] {""} ;
      P008533_A12358Mat_NAlim = new String[] {""} ;
      P008533_A12357Mat_Color = new String[] {""} ;
      P008533_n12357Mat_Color = new boolean[] {false} ;
      P008533_A12356Mat_Dsc = new String[] {""} ;
      P008533_n12356Mat_Dsc = new boolean[] {false} ;
      P008533_A12355Mat_NE = new String[] {""} ;
      P008533_n12355Mat_NE = new boolean[] {false} ;
      P008533_A12354Mat_Lu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008533_n12354Mat_Lu = new boolean[] {false} ;
      P008533_A6963Mat_LM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008533_n6963Mat_LM = new boolean[] {false} ;
      P008533_A6962Mat_Porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008533_n6962Mat_Porc = new boolean[] {false} ;
      P008533_A6961Mat_Lote = new String[] {""} ;
      P008533_n6961Mat_Lote = new boolean[] {false} ;
      P008533_A6960Mat_ProvN = new String[] {""} ;
      P008533_n6960Mat_ProvN = new boolean[] {false} ;
      P008533_A6959Mat_NumCol = new int[1] ;
      P008533_n6959Mat_NumCol = new boolean[] {false} ;
      P008533_A6958Mat_NomCol = new String[] {""} ;
      P008533_n6958Mat_NomCol = new boolean[] {false} ;
      P008533_A6957Mat_Tors = new String[] {""} ;
      P008533_n6957Mat_Tors = new boolean[] {false} ;
      P008533_A6956Mat_Mate = new String[] {""} ;
      P008533_n6956Mat_Mate = new boolean[] {false} ;
      P008533_A6955Mat_Estr = new String[] {""} ;
      P008533_n6955Mat_Estr = new boolean[] {false} ;
      P008533_A6954Mat_lin = new short[1] ;
      P008533_A252CliCod = new int[1] ;
      P008536_A6964Mat_obs = new String[] {""} ;
      P008536_n6964Mat_obs = new boolean[] {false} ;
      P008536_A65ArtCod = new String[] {""} ;
      P008536_A252CliCod = new int[1] ;
      P008536_A396EmprCod = new String[] {""} ;
      P008536_A12358Mat_NAlim = new String[] {""} ;
      P008536_A12357Mat_Color = new String[] {""} ;
      P008536_n12357Mat_Color = new boolean[] {false} ;
      P008536_A12356Mat_Dsc = new String[] {""} ;
      P008536_n12356Mat_Dsc = new boolean[] {false} ;
      P008536_A12355Mat_NE = new String[] {""} ;
      P008536_n12355Mat_NE = new boolean[] {false} ;
      P008536_A12354Mat_Lu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008536_n12354Mat_Lu = new boolean[] {false} ;
      P008536_A6963Mat_LM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008536_n6963Mat_LM = new boolean[] {false} ;
      P008536_A6962Mat_Porc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008536_n6962Mat_Porc = new boolean[] {false} ;
      P008536_A6961Mat_Lote = new String[] {""} ;
      P008536_n6961Mat_Lote = new boolean[] {false} ;
      P008536_A6960Mat_ProvN = new String[] {""} ;
      P008536_n6960Mat_ProvN = new boolean[] {false} ;
      P008536_A6959Mat_NumCol = new int[1] ;
      P008536_n6959Mat_NumCol = new boolean[] {false} ;
      P008536_A6958Mat_NomCol = new String[] {""} ;
      P008536_n6958Mat_NomCol = new boolean[] {false} ;
      P008536_A6957Mat_Tors = new String[] {""} ;
      P008536_n6957Mat_Tors = new boolean[] {false} ;
      P008536_A6956Mat_Mate = new String[] {""} ;
      P008536_n6956Mat_Mate = new boolean[] {false} ;
      P008536_A6955Mat_Estr = new String[] {""} ;
      P008536_n6955Mat_Estr = new boolean[] {false} ;
      P008536_A6954Mat_lin = new short[1] ;
      P008538_A758ProCod = new String[] {""} ;
      P008538_A65ArtCod = new String[] {""} ;
      P008538_A252CliCod = new int[1] ;
      P008538_A396EmprCod = new String[] {""} ;
      P008538_A12647ArtFasFct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008538_n12647ArtFasFct = new boolean[] {false} ;
      P008538_A9836FasCodM = new String[] {""} ;
      A12647ArtFasFct = DecimalUtil.ZERO ;
      A9836FasCodM = "" ;
      W9836FasCodM = "" ;
      P008540_A396EmprCod = new String[] {""} ;
      P008540_A252CliCod = new int[1] ;
      P008540_A65ArtCod = new String[] {""} ;
      P008540_A758ProCod = new String[] {""} ;
      P008540_A9836FasCodM = new String[] {""} ;
      P008540_A14553CPFMDc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008540_A14552CPFMDc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008540_A14551CPFMNp = new short[1] ;
      P008540_A14550CPFMVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008540_A14549CPFMPrep = new short[1] ;
      P008540_A14548CPFMPres = new short[1] ;
      P008540_A9869MaqAncC = new short[1] ;
      P008540_A9830MaqCodC = new String[] {""} ;
      A14553CPFMDc2 = DecimalUtil.ZERO ;
      A14552CPFMDc = DecimalUtil.ZERO ;
      A14550CPFMVel = DecimalUtil.ZERO ;
      A9830MaqCodC = "" ;
      W9830MaqCodC = "" ;
      P008542_A396EmprCod = new String[] {""} ;
      P008542_A252CliCod = new int[1] ;
      P008542_A65ArtCod = new String[] {""} ;
      P008542_A758ProCod = new String[] {""} ;
      P008542_A9836FasCodM = new String[] {""} ;
      P008542_A9830MaqCodC = new String[] {""} ;
      P008542_A14080ParFasPLC = new String[] {""} ;
      P008542_A14077ParFMVal2 = new String[] {""} ;
      P008542_A14076ParFMVMax = new String[] {""} ;
      P008542_A14075ParFMVMin = new String[] {""} ;
      P008542_A12448ParEspIdS = new short[1] ;
      P008542_n12448ParEspIdS = new boolean[] {false} ;
      P008542_A10256Itm_ord2 = new short[1] ;
      P008542_A9829ParFMObs = new String[] {""} ;
      P008542_A9828ParFMVal = new String[] {""} ;
      P008542_A1664ParFasCod = new short[1] ;
      A14080ParFasPLC = "" ;
      A14077ParFMVal2 = "" ;
      A14076ParFMVMax = "" ;
      A14075ParFMVMin = "" ;
      A9829ParFMObs = "" ;
      A9828ParFMVal = "" ;
      W9828ParFMVal = "" ;
      W9829ParFMObs = "" ;
      P008544_A9836FasCodM = new String[] {""} ;
      P008544_A758ProCod = new String[] {""} ;
      P008544_A65ArtCod = new String[] {""} ;
      P008544_A252CliCod = new int[1] ;
      P008544_A396EmprCod = new String[] {""} ;
      P008544_A9864MaqAncA = new short[1] ;
      P008544_A9830MaqCodC = new String[] {""} ;
      P008546_A396EmprCod = new String[] {""} ;
      P008546_A252CliCod = new int[1] ;
      P008546_A65ArtCod = new String[] {""} ;
      P008546_A758ProCod = new String[] {""} ;
      P008546_A9836FasCodM = new String[] {""} ;
      P008546_A9830MaqCodC = new String[] {""} ;
      P008546_A9864MaqAncA = new short[1] ;
      P008546_A10264Itm_ord4 = new short[1] ;
      P008546_n10264Itm_ord4 = new boolean[] {false} ;
      P008546_A9868ParObsX = new String[] {""} ;
      P008546_n9868ParObsX = new boolean[] {false} ;
      P008546_A9867ParValX = new String[] {""} ;
      P008546_n9867ParValX = new boolean[] {false} ;
      P008546_A9865Cod_parX = new short[1] ;
      A9868ParObsX = "" ;
      A9867ParValX = "" ;
      W9867ParValX = "" ;
      W9868ParObsX = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewse2__default(),
         new Object[] {
             new Object[] {
            P00852_A3072ArtObsLon, P00852_n3072ArtObsLon, P00852_A65ArtCod, P00852_A252CliCod, P00852_A396EmprCod, P00852_A69ArtDsc, P00852_n69ArtDsc, P00852_A87ArtMat, P00852_n87ArtMat, P00852_A829TipArtCod,
            P00852_A1148ArtPml, P00852_n1148ArtPml, P00852_A78ArtGraCru, P00852_n78ArtGraCru, P00852_A68ArtCruMin, P00852_n68ArtCruMin, P00852_A67ArtCruMax, P00852_n67ArtCruMax, P00852_A63ArtAcaMin, P00852_n63ArtAcaMin,
            P00852_A62ArtAcaMax, P00852_n62ArtAcaMax, P00852_A95ArtRen, P00852_n95ArtRen, P00852_A101ArtTipPle, P00852_n101ArtTipPle, P00852_A2834ArtPle2, P00852_n2834ArtPle2, P00852_A100ArtTipLar, P00852_n100ArtTipLar,
            P00852_A66ArtCorOri, P00852_n66ArtCorOri, P00852_A70ArtEncOri, P00852_n70ArtEncOri, P00852_A96ArtSua, P00852_n96ArtSua, P00852_A64ArtAcaQui, P00852_n64ArtAcaQui, P00852_A73ArtEti, P00852_n73ArtEti,
            P00852_A117ArtUrg, P00852_n117ArtUrg, P00852_A88ArtMer, P00852_n88ArtMer, P00852_A105ArtTra1, P00852_n105ArtTra1, P00852_A106ArtTra2, P00852_n106ArtTra2, P00852_A107ArtTra3, P00852_n107ArtTra3,
            P00852_A108ArtTraP1, P00852_n108ArtTraP1, P00852_A109ArtTraP2, P00852_n109ArtTraP2, P00852_A110ArtTraP3, P00852_n110ArtTraP3, P00852_A111ArtUrd1, P00852_n111ArtUrd1, P00852_A112ArtUrd2, P00852_n112ArtUrd2,
            P00852_A113ArtUrd3, P00852_n113ArtUrd3, P00852_A114ArtUrdP1, P00852_n114ArtUrdP1, P00852_A115ArtUrdP2, P00852_n115ArtUrdP2, P00852_A116ArtUrdP3, P00852_n116ArtUrdP3, P00852_A89ArtObs, P00852_n89ArtObs,
            P00852_A90ArtObsFac, P00852_n90ArtObsFac, P00852_A1229ArtEncCom, P00852_n1229ArtEncCom, P00852_A1230ArtEncAnh, P00852_n1230ArtEncAnh, P00852_A5741ArtComer, P00852_n5741ArtComer, P00852_A5335ArtCodExt, P00852_n5335ArtCodExt,
            P00852_A1903ArtGraAca, P00852_n1903ArtGraAca, P00852_A1905ArtRdoA, P00852_n1905ArtRdoA, P00852_A1904ArtRdoN, P00852_n1904ArtRdoN, P00852_A3121ArtNumCor, P00852_n3121ArtNumCor, P00852_A3122ArtAncSal1, P00852_n3122ArtAncSal1,
            P00852_A3123ArtAncSal2, P00852_n3123ArtAncSal2, P00852_A3124ArtAncSal3, P00852_n3124ArtAncSal3, P00852_A3125ArtGraAca2, P00852_n3125ArtGraAca2, P00852_A3126ArtGraCru2, P00852_n3126ArtGraCru2, P00852_A4295ClasCod, P00852_n4295ClasCod,
            P00852_A4297ArtPmPPza, P00852_n4297ArtPmPPza, P00852_A3683ArtFecCre, P00852_n3683ArtFecCre, P00852_A4353ArtUsrCod, P00852_n4353ArtUsrCod, P00852_A4354ArtFecMod, P00852_n4354ArtFecMod, P00852_A6106ClaTubCod, P00852_n6106ClaTubCod,
            P00852_A6108ClaBolCod, P00852_n6108ClaBolCod, P00852_A6435ArtRdoCru1, P00852_n6435ArtRdoCru1, P00852_A6436ArtRdoCru2, P00852_n6436ArtRdoCru2, P00852_A6462ArtLu, P00852_n6462ArtLu, P00852_A4607ArtRb, P00852_n4607ArtRb,
            P00852_A4444ArtPelAnh, P00852_n4444ArtPelAnh, P00852_A7412Artgrm2Sc, P00852_n7412Artgrm2Sc, P00852_A7413ArtPmlSc, P00852_n7413ArtPmlSc, P00852_A7414ArtAncSc, P00852_n7414ArtAncSc, P00852_A7415ArtPmlCru, P00852_n7415ArtPmlCru,
            P00852_A7777ArtRdtSc, P00852_n7777ArtRdtSc, P00852_A7778ArtUnd, P00852_n7778ArtUnd, P00852_A7779ArtBlo, P00852_n7779ArtBlo, P00852_A967ArtNMtr, P00852_n967ArtNMtr, P00852_A2707NumTexCod, P00852_n2707NumTexCod,
            P00852_A2750ArtNumTex1, P00852_n2750ArtNumTex1, P00852_A2751ArtNumTex2, P00852_n2751ArtNumTex2, P00852_A9801ArtFabsT, P00852_n9801ArtFabsT, P00852_A2791ArtFacAbs, P00852_n2791ArtFacAbs, P00852_A9730ArtFabsH, P00852_n9730ArtFabsH,
            P00852_A12695ArtElgAnc, P00852_n12695ArtElgAnc, P00852_A12696ArtElgLar, P00852_n12696ArtElgLar, P00852_A12697ArtRdoCru, P00852_n12697ArtRdoCru, P00852_A12698ArtEncLarg, P00852_n12698ArtEncLarg, P00852_A14100Artdsc2, P00852_n14100Artdsc2,
            P00852_A12364ArtMT, P00852_n12364ArtMT, P00852_A14295ArtActivo
            }
            , new Object[] {
            P00853_A396EmprCod, P00853_A252CliCod, P00853_A65ArtCod, P00853_A758ProCod, P00853_A12752Art_Tipo, P00853_n12752Art_Tipo, P00853_A12142ProStFec, P00853_A12141ProSta, P00853_A11272ProFabs, P00853_A10556ProFecM,
            P00853_A10555ProUserM, P00853_A10554ProFecA, P00853_A10553ProUserA, P00853_A10412ProAct, P00853_A10026DscCFa, P00853_A9629Art_els, P00853_n9629Art_els, P00853_A9628Art_ets, P00853_n9628Art_ets, P00853_A8955Art_Obs,
            P00853_n8955Art_Obs, P00853_A8166Art_Und, P00853_n8166Art_Und, P00853_A8165Art_Dsc, P00853_n8165Art_Dsc, P00853_A8084Art_RdoP, P00853_n8084Art_RdoP, P00853_A8083Art_AncP, P00853_n8083Art_AncP, P00853_A8082Art_PmlP,
            P00853_n8082Art_PmlP, P00853_A8081Art_GrmP, P00853_n8081Art_GrmP, P00853_A8080Art_PmlC, P00853_n8080Art_PmlC, P00853_A8079Art_AncC, P00853_n8079Art_AncC, P00853_A8078Art_GrmC, P00853_n8078Art_GrmC, P00853_A8077Art_GrmB,
            P00853_n8077Art_GrmB, P00853_A8076Art_AncB, P00853_n8076Art_AncB, P00853_A8075Art_Fabs, P00853_n8075Art_Fabs, P00853_A8074Art_Rdpc, P00853_n8074Art_Rdpc, P00853_A8073Art_Rdo, P00853_n8073Art_Rdo, P00853_A8072Art_Cor,
            P00853_n8072Art_Cor, P00853_A8071Art_Enc, P00853_n8071Art_Enc, P00853_A8070Art_Elar, P00853_n8070Art_Elar, P00853_A8069Art_Eanc, P00853_n8069Art_Eanc, P00853_A8068Art_PmlA, P00853_n8068Art_PmlA, P00853_A8067Art_Merma,
            P00853_n8067Art_Merma, P00853_A8066Art_AncA, P00853_n8066Art_AncA, P00853_A8065Art_GrmA, P00853_n8065Art_GrmA
            }
            , new Object[] {
            }
            , new Object[] {
            P00855_A396EmprCod, P00855_A252CliCod, P00855_A65ArtCod, P00855_A758ProCod, P00855_A457FasCod, P00855_A14547ArtFasNPs, P00855_A14546ArtFasVel, P00855_A14545ArtFasPpp, P00855_A14544ArtFasPyS, P00855_A8560ArtFasFac,
            P00855_A4031CCTCod, P00855_n4031CCTCod, P00855_A4896ArtProFac, P00855_n4896ArtProFac, P00855_A4895ArtProFacT, P00855_n4895ArtProFacT, P00855_A4894ArtProULin, P00855_n4894ArtProULin
            }
            , new Object[] {
            }
            , new Object[] {
            P00857_A396EmprCod, P00857_A252CliCod, P00857_A65ArtCod, P00857_A758ProCod, P00857_A457FasCod, P00857_A1673ParFasObs, P00857_A14061ParFasVmn, P00857_A14060ParFasVmx, P00857_A13220ParOrden, P00857_A12670ParFasVl2,
            P00857_A1668ParFasVal, P00857_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00859_A65ArtCod, P00859_A252CliCod, P00859_A4898ArtProCod, P00859_A4897ArtProLin, P00859_A457FasCod, P00859_A758ProCod, P00859_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P008511_A6964Mat_obs, P008511_n6964Mat_obs, P008511_A65ArtCod, P008511_A252CliCod, P008511_A396EmprCod, P008511_A12358Mat_NAlim, P008511_A12357Mat_Color, P008511_n12357Mat_Color, P008511_A12356Mat_Dsc, P008511_n12356Mat_Dsc,
            P008511_A12355Mat_NE, P008511_n12355Mat_NE, P008511_A12354Mat_Lu, P008511_n12354Mat_Lu, P008511_A6963Mat_LM, P008511_n6963Mat_LM, P008511_A6962Mat_Porc, P008511_n6962Mat_Porc, P008511_A6961Mat_Lote, P008511_n6961Mat_Lote,
            P008511_A6960Mat_ProvN, P008511_n6960Mat_ProvN, P008511_A6959Mat_NumCol, P008511_n6959Mat_NumCol, P008511_A6958Mat_NomCol, P008511_n6958Mat_NomCol, P008511_A6957Mat_Tors, P008511_n6957Mat_Tors, P008511_A6956Mat_Mate, P008511_n6956Mat_Mate,
            P008511_A6955Mat_Estr, P008511_n6955Mat_Estr, P008511_A6954Mat_lin
            }
            , new Object[] {
            }
            , new Object[] {
            P008513_A396EmprCod, P008513_A252CliCod, P008513_A65ArtCod, P008513_A2931Limite2, P008513_A2932Precio2, P008513_n2932Precio2
            }
            , new Object[] {
            }
            , new Object[] {
            P008515_A396EmprCod, P008515_A252CliCod, P008515_A65ArtCod, P008515_A585IntPreDef, P008515_n585IntPreDef, P008515_A587IntPreMtr, P008515_n587IntPreMtr, P008515_A586IntPreKgm, P008515_n586IntPreKgm, P008515_A583IntCod,
            P008515_A831TipColCod, P008515_A3616PreFacCod, P008515_n3616PreFacCod
            }
            , new Object[] {
            }
            , new Object[] {
            P008517_A396EmprCod, P008517_A252CliCod, P008517_A65ArtCod, P008517_A3323RecPorInc, P008517_n3323RecPorInc, P008517_A2941RecBon, P008517_n2941RecBon, P008517_A2940Precio4, P008517_n2940Precio4, P008517_A2939Limite4,
            P008517_A2937RecIntCod
            }
            , new Object[] {
            }
            , new Object[] {
            P008519_A396EmprCod, P008519_A252CliCod, P008519_A3321CliPreKgs, P008519_n3321CliPreKgs, P008519_A3320CliLimKgs
            }
            , new Object[] {
            }
            , new Object[] {
            P008521_A252CliCod, P008521_A396EmprCod, P008521_A278CliNif
            }
            , new Object[] {
            }
            , new Object[] {
            P008523_A457FasCod, P008523_A758ProCod, P008523_A65ArtCod, P008523_A252CliCod, P008523_A396EmprCod, P008523_A14547ArtFasNPs, P008523_A14546ArtFasVel, P008523_A14545ArtFasPpp, P008523_A14544ArtFasPyS, P008523_A8560ArtFasFac,
            P008523_A4031CCTCod, P008523_n4031CCTCod, P008523_A4896ArtProFac, P008523_n4896ArtProFac, P008523_A4895ArtProFacT, P008523_n4895ArtProFacT, P008523_A4894ArtProULin, P008523_n4894ArtProULin
            }
            , new Object[] {
            }
            , new Object[] {
            P008525_A396EmprCod, P008525_A252CliCod, P008525_A65ArtCod, P008525_A758ProCod, P008525_A457FasCod, P008525_A1673ParFasObs, P008525_A14061ParFasVmn, P008525_A14060ParFasVmx, P008525_A13220ParOrden, P008525_A12670ParFasVl2,
            P008525_A1668ParFasVal, P008525_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P008527_A758ProCod, P008527_A65ArtCod, P008527_A252CliCod, P008527_A396EmprCod, P008527_A8328ParFasObsm, P008527_n8328ParFasObsm, P008527_A6988FasDscp, P008527_n6988FasDscp, P008527_A6987FasCodp, P008527_n6987FasCodp,
            P008527_A6986NumLinPro
            }
            , new Object[] {
            }
            , new Object[] {
            P008529_A758ProCod, P008529_A65ArtCod, P008529_A252CliCod, P008529_A396EmprCod, P008529_A6990ParFasObsp, P008529_n6990ParFasObsp, P008529_A6989ParFasValp, P008529_n6989ParFasValp, P008529_A1664ParFasCod, P008529_A6986NumLinPro
            }
            , new Object[] {
            }
            , new Object[] {
            P008531_A252CliCod, P008531_A396EmprCod, P008531_A278CliNif
            }
            , new Object[] {
            }
            , new Object[] {
            P008533_A6964Mat_obs, P008533_n6964Mat_obs, P008533_A65ArtCod, P008533_A396EmprCod, P008533_A12358Mat_NAlim, P008533_A12357Mat_Color, P008533_n12357Mat_Color, P008533_A12356Mat_Dsc, P008533_n12356Mat_Dsc, P008533_A12355Mat_NE,
            P008533_n12355Mat_NE, P008533_A12354Mat_Lu, P008533_n12354Mat_Lu, P008533_A6963Mat_LM, P008533_n6963Mat_LM, P008533_A6962Mat_Porc, P008533_n6962Mat_Porc, P008533_A6961Mat_Lote, P008533_n6961Mat_Lote, P008533_A6960Mat_ProvN,
            P008533_n6960Mat_ProvN, P008533_A6959Mat_NumCol, P008533_n6959Mat_NumCol, P008533_A6958Mat_NomCol, P008533_n6958Mat_NomCol, P008533_A6957Mat_Tors, P008533_n6957Mat_Tors, P008533_A6956Mat_Mate, P008533_n6956Mat_Mate, P008533_A6955Mat_Estr,
            P008533_n6955Mat_Estr, P008533_A6954Mat_lin, P008533_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P008536_A6964Mat_obs, P008536_n6964Mat_obs, P008536_A65ArtCod, P008536_A252CliCod, P008536_A396EmprCod, P008536_A12358Mat_NAlim, P008536_A12357Mat_Color, P008536_n12357Mat_Color, P008536_A12356Mat_Dsc, P008536_n12356Mat_Dsc,
            P008536_A12355Mat_NE, P008536_n12355Mat_NE, P008536_A12354Mat_Lu, P008536_n12354Mat_Lu, P008536_A6963Mat_LM, P008536_n6963Mat_LM, P008536_A6962Mat_Porc, P008536_n6962Mat_Porc, P008536_A6961Mat_Lote, P008536_n6961Mat_Lote,
            P008536_A6960Mat_ProvN, P008536_n6960Mat_ProvN, P008536_A6959Mat_NumCol, P008536_n6959Mat_NumCol, P008536_A6958Mat_NomCol, P008536_n6958Mat_NomCol, P008536_A6957Mat_Tors, P008536_n6957Mat_Tors, P008536_A6956Mat_Mate, P008536_n6956Mat_Mate,
            P008536_A6955Mat_Estr, P008536_n6955Mat_Estr, P008536_A6954Mat_lin
            }
            , new Object[] {
            }
            , new Object[] {
            P008538_A758ProCod, P008538_A65ArtCod, P008538_A252CliCod, P008538_A396EmprCod, P008538_A12647ArtFasFct, P008538_n12647ArtFasFct, P008538_A9836FasCodM
            }
            , new Object[] {
            }
            , new Object[] {
            P008540_A396EmprCod, P008540_A252CliCod, P008540_A65ArtCod, P008540_A758ProCod, P008540_A9836FasCodM, P008540_A14553CPFMDc2, P008540_A14552CPFMDc, P008540_A14551CPFMNp, P008540_A14550CPFMVel, P008540_A14549CPFMPrep,
            P008540_A14548CPFMPres, P008540_A9869MaqAncC, P008540_A9830MaqCodC
            }
            , new Object[] {
            }
            , new Object[] {
            P008542_A396EmprCod, P008542_A252CliCod, P008542_A65ArtCod, P008542_A758ProCod, P008542_A9836FasCodM, P008542_A9830MaqCodC, P008542_A14080ParFasPLC, P008542_A14077ParFMVal2, P008542_A14076ParFMVMax, P008542_A14075ParFMVMin,
            P008542_A12448ParEspIdS, P008542_n12448ParEspIdS, P008542_A10256Itm_ord2, P008542_A9829ParFMObs, P008542_A9828ParFMVal, P008542_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P008544_A9836FasCodM, P008544_A758ProCod, P008544_A65ArtCod, P008544_A252CliCod, P008544_A396EmprCod, P008544_A9864MaqAncA, P008544_A9830MaqCodC
            }
            , new Object[] {
            }
            , new Object[] {
            P008546_A396EmprCod, P008546_A252CliCod, P008546_A65ArtCod, P008546_A758ProCod, P008546_A9836FasCodM, P008546_A9830MaqCodC, P008546_A9864MaqAncA, P008546_A10264Itm_ord4, P008546_n10264Itm_ord4, P008546_A9868ParObsX,
            P008546_n9868ParObsX, P008546_A9867ParValX, P008546_n9867ParValX, P008546_A9865Cod_parX
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A117ArtUrg ;
   private byte A2750ArtNumTex1 ;
   private byte A12364ArtMT ;
   private byte AV38ArtUrg ;
   private byte AV105ArtNumTex1 ;
   private byte AV131ArtMT ;
   private byte A12141ProSta ;
   private byte AV66Hss ;
   private byte AV107Itram ;
   private byte AV120Pervaf ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte AV108TipColCod ;
   private byte AV109IntCod ;
   private byte W831TipColCod ;
   private byte W583IntCod ;
   private byte A2937RecIntCod ;
   private byte AV113RecIntCod ;
   private byte W2937RecIntCod ;
   private byte AV70DuSer0 ;
   private byte AV72Moda21 ;
   private byte GXv_int1[] ;
   private short A829TipArtCod ;
   private short A1148ArtPml ;
   private short A78ArtGraCru ;
   private short A68ArtCruMin ;
   private short A67ArtCruMax ;
   private short A63ArtAcaMin ;
   private short A62ArtAcaMax ;
   private short A108ArtTraP1 ;
   private short A109ArtTraP2 ;
   private short A110ArtTraP3 ;
   private short A114ArtUrdP1 ;
   private short A115ArtUrdP2 ;
   private short A116ArtUrdP3 ;
   private short A1229ArtEncCom ;
   private short A1230ArtEncAnh ;
   private short A1903ArtGraAca ;
   private short A3121ArtNumCor ;
   private short A3122ArtAncSal1 ;
   private short A3123ArtAncSal2 ;
   private short A3124ArtAncSal3 ;
   private short A3125ArtGraAca2 ;
   private short A3126ArtGraCru2 ;
   private short A4295ClasCod ;
   private short A6106ClaTubCod ;
   private short A6108ClaBolCod ;
   private short A4607ArtRb ;
   private short A4444ArtPelAnh ;
   private short A7412Artgrm2Sc ;
   private short A7413ArtPmlSc ;
   private short A7414ArtAncSc ;
   private short A7415ArtPmlCru ;
   private short A2751ArtNumTex2 ;
   private short AV23TipArtCod ;
   private short AV55ArtPml ;
   private short AV25ArtGraCru ;
   private short AV26ArtCruMin ;
   private short AV27ArtCruMax ;
   private short AV28ArtAcaMin ;
   private short AV29ArtAcaMax ;
   private short AV43ArtTraP1 ;
   private short AV44ArtTraP2 ;
   private short AV45ArtTraP3 ;
   private short AV49ArtUrdP1 ;
   private short AV50ArtUrdP2 ;
   private short AV51ArtUrdP3 ;
   private short AV56ArtEncCom ;
   private short AV57ArtEncAnh ;
   private short AV74ArtGraAca ;
   private short AV103ArtNumCor ;
   private short AV78ArtAncSal1 ;
   private short AV79ArtAncSal2 ;
   private short AV80ArtAncSal3 ;
   private short AV81ArtGraAca2 ;
   private short AV82ArtGraCru2 ;
   private short AV83ClasCod ;
   private short AV88ClaTubCod ;
   private short AV89ClaBolCod ;
   private short AV94ArtRb ;
   private short AV95ArtPelAnh ;
   private short AV96Artgrm2Sc ;
   private short AV97ArtPmlSc ;
   private short AV98ArtAncSc ;
   private short AV99ArtPmlCru ;
   private short AV106ArtNumTex2 ;
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
   private short Gx_err ;
   private short A14547ArtFasNPs ;
   private short A14545ArtFasPpp ;
   private short A14544ArtFasPyS ;
   private short A4894ArtProULin ;
   private short A13220ParOrden ;
   private short A1664ParFasCod ;
   private short A4897ArtProLin ;
   private short W4897ArtProLin ;
   private short A6954Mat_lin ;
   private short W6954Mat_lin ;
   private short A2931Limite2 ;
   private short AV68Limite2 ;
   private short W2931Limite2 ;
   private short A2939Limite4 ;
   private short AV114Limite4 ;
   private short W2939Limite4 ;
   private short A6986NumLinPro ;
   private short W6986NumLinPro ;
   private short W1664ParFasCod ;
   private short A14551CPFMNp ;
   private short A14549CPFMPrep ;
   private short A14548CPFMPres ;
   private short A9869MaqAncC ;
   private short A12448ParEspIdS ;
   private short A10256Itm_ord2 ;
   private short W10256Itm_ord2 ;
   private short A9864MaqAncA ;
   private short W9864MaqAncA ;
   private short A10264Itm_ord4 ;
   private short A9865Cod_parX ;
   private short W9865Cod_parX ;
   private short W10264Itm_ord4 ;
   private int AV16CliOri ;
   private int AV17CliDes ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS11 ;
   private int A4031CCTCod ;
   private int GX_INS476 ;
   private int GX_INS477 ;
   private int GX_INS723 ;
   private int A6959Mat_NumCol ;
   private int GX_INS984 ;
   private int W6959Mat_NumCol ;
   private int GX_INS430 ;
   private int GX_INS84 ;
   private int GX_INS434 ;
   private int GX_INS480 ;
   private int AV20CliCod ;
   private int GX_INS988 ;
   private int GX_INS989 ;
   private int GX_INS10 ;
   private int GX_INS1293 ;
   private int GX_INS1294 ;
   private int GX_INS1295 ;
   private int GX_INS1303 ;
   private int GX_INS1304 ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal A88ArtMer ;
   private java.math.BigDecimal A1905ArtRdoA ;
   private java.math.BigDecimal A1904ArtRdoN ;
   private java.math.BigDecimal A4297ArtPmPPza ;
   private java.math.BigDecimal A6435ArtRdoCru1 ;
   private java.math.BigDecimal A6436ArtRdoCru2 ;
   private java.math.BigDecimal A6462ArtLu ;
   private java.math.BigDecimal A7777ArtRdtSc ;
   private java.math.BigDecimal A9801ArtFabsT ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private java.math.BigDecimal A9730ArtFabsH ;
   private java.math.BigDecimal A12695ArtElgAnc ;
   private java.math.BigDecimal A12696ArtElgLar ;
   private java.math.BigDecimal A12697ArtRdoCru ;
   private java.math.BigDecimal A12698ArtEncLarg ;
   private java.math.BigDecimal AV30ArtRen ;
   private java.math.BigDecimal AV39ArtMer ;
   private java.math.BigDecimal AV75ArtRdoA ;
   private java.math.BigDecimal AV76ArtRdoN ;
   private java.math.BigDecimal AV84ArtPmPPza ;
   private java.math.BigDecimal AV90ArtRdoCru1 ;
   private java.math.BigDecimal AV91ArtRdoCru2 ;
   private java.math.BigDecimal AV93ArtLu ;
   private java.math.BigDecimal AV100ArtRdtSc ;
   private java.math.BigDecimal AV121artfabst ;
   private java.math.BigDecimal AV62ArtFacAbs ;
   private java.math.BigDecimal AV122artfabsh ;
   private java.math.BigDecimal AV123ArtElgAnc ;
   private java.math.BigDecimal AV124ArtElgLar ;
   private java.math.BigDecimal AV125ArtRdoCru ;
   private java.math.BigDecimal AV126ArtEncLarg ;
   private java.math.BigDecimal AV127ArtEncAnc ;
   private java.math.BigDecimal A11272ProFabs ;
   private java.math.BigDecimal A8084Art_RdoP ;
   private java.math.BigDecimal A8075Art_Fabs ;
   private java.math.BigDecimal A8074Art_Rdpc ;
   private java.math.BigDecimal A8073Art_Rdo ;
   private java.math.BigDecimal A8067Art_Merma ;
   private java.math.BigDecimal A14546ArtFasVel ;
   private java.math.BigDecimal A8560ArtFasFac ;
   private java.math.BigDecimal A4896ArtProFac ;
   private java.math.BigDecimal A12354Mat_Lu ;
   private java.math.BigDecimal A6963Mat_LM ;
   private java.math.BigDecimal A6962Mat_Porc ;
   private java.math.BigDecimal W6962Mat_Porc ;
   private java.math.BigDecimal W6963Mat_LM ;
   private java.math.BigDecimal A2932Precio2 ;
   private java.math.BigDecimal A587IntPreMtr ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal AV111IntPreKgm ;
   private java.math.BigDecimal AV112IntPreMtr ;
   private java.math.BigDecimal W586IntPreKgm ;
   private java.math.BigDecimal W587IntPreMtr ;
   private java.math.BigDecimal A3323RecPorInc ;
   private java.math.BigDecimal A2940Precio4 ;
   private java.math.BigDecimal AV115Precio4 ;
   private java.math.BigDecimal AV117RecPorInc ;
   private java.math.BigDecimal W2940Precio4 ;
   private java.math.BigDecimal W3323RecPorInc ;
   private java.math.BigDecimal A3321CliPreKgs ;
   private java.math.BigDecimal A3320CliLimKgs ;
   private java.math.BigDecimal AV119CliLimKgs ;
   private java.math.BigDecimal AV118CliPreKgs ;
   private java.math.BigDecimal W3320CliLimKgs ;
   private java.math.BigDecimal W3321CliPreKgs ;
   private java.math.BigDecimal A92ArtPreKgm ;
   private java.math.BigDecimal A93ArtPreMtr ;
   private java.math.BigDecimal A12699ArtEncAnc ;
   private java.math.BigDecimal A12647ArtFasFct ;
   private java.math.BigDecimal A14553CPFMDc2 ;
   private java.math.BigDecimal A14552CPFMDc ;
   private java.math.BigDecimal A14550CPFMVel ;
   private String AV15EmprCod ;
   private String AV18ArtOri ;
   private String AV19ArtDes ;
   private String AV60ArtDscDes ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String A69ArtDsc ;
   private String A87ArtMat ;
   private String A101ArtTipPle ;
   private String A2834ArtPle2 ;
   private String A100ArtTipLar ;
   private String A66ArtCorOri ;
   private String A70ArtEncOri ;
   private String A96ArtSua ;
   private String A64ArtAcaQui ;
   private String A73ArtEti ;
   private String A105ArtTra1 ;
   private String A106ArtTra2 ;
   private String A107ArtTra3 ;
   private String A111ArtUrd1 ;
   private String A112ArtUrd2 ;
   private String A113ArtUrd3 ;
   private String A89ArtObs ;
   private String A90ArtObsFac ;
   private String A5741ArtComer ;
   private String A5335ArtCodExt ;
   private String A4353ArtUsrCod ;
   private String A7778ArtUnd ;
   private String A7779ArtBlo ;
   private String A967ArtNMtr ;
   private String A2707NumTexCod ;
   private String A14295ArtActivo ;
   private String W396EmprCod ;
   private String W65ArtCod ;
   private String AV21ArtCod ;
   private String AV22ArtMat ;
   private String AV31ArtTipPle ;
   private String AV71ArtPle2 ;
   private String AV32ArtTipLar ;
   private String AV33ArtCorOri ;
   private String AV34ArtEncOri ;
   private String AV35ArtSua ;
   private String AV36ArtAcaQui ;
   private String AV37ArtEti ;
   private String AV40ArtTra1 ;
   private String AV41ArtTra2 ;
   private String AV42ArtTra3 ;
   private String AV46ArtUrd1 ;
   private String AV47ArtUrd2 ;
   private String AV48ArtUrd3 ;
   private String AV52ArtObs ;
   private String AV53ArtObsFac ;
   private String AV69ArtComer ;
   private String AV73ArtCodExt ;
   private String AV86ArtUsrCod ;
   private String AV101ArtUnd ;
   private String AV102ArtBlo ;
   private String AV92ArtNMtr ;
   private String AV104NumTexCod ;
   private String AV132ArtActivo ;
   private String A758ProCod ;
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
   private String AV54ProCod ;
   private String W758ProCod ;
   private String Gx_emsg ;
   private String A457FasCod ;
   private String A4895ArtProFacT ;
   private String AV61FasCod ;
   private String W457FasCod ;
   private String A1673ParFasObs ;
   private String A14061ParFasVmn ;
   private String A14060ParFasVmx ;
   private String A12670ParFasVl2 ;
   private String A1668ParFasVal ;
   private String AV59ParFasObs ;
   private String W1673ParFasObs ;
   private String A4898ArtProCod ;
   private String W4898ArtProCod ;
   private String A12358Mat_NAlim ;
   private String A12357Mat_Color ;
   private String A12355Mat_NE ;
   private String A6961Mat_Lote ;
   private String A6960Mat_ProvN ;
   private String A6958Mat_NomCol ;
   private String A6957Mat_Tors ;
   private String A6956Mat_Mate ;
   private String A6955Mat_Estr ;
   private String W6955Mat_Estr ;
   private String W6956Mat_Mate ;
   private String W6957Mat_Tors ;
   private String W6958Mat_NomCol ;
   private String W6960Mat_ProvN ;
   private String W6961Mat_Lote ;
   private String A585IntPreDef ;
   private String A3616PreFacCod ;
   private String AV110IntPreDef ;
   private String W585IntPreDef ;
   private String A2941RecBon ;
   private String AV116RecBon ;
   private String W2941RecBon ;
   private String AV63station ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV64EmprNom ;
   private String GXv_char4[] ;
   private String AV65UsurCod ;
   private String GXv_char5[] ;
   private String A278CliNif ;
   private String A6988FasDscp ;
   private String A6987FasCodp ;
   private String W6987FasCodp ;
   private String W6988FasDscp ;
   private String A6990ParFasObsp ;
   private String A6989ParFasValp ;
   private String W6990ParFasObsp ;
   private String W6989ParFasValp ;
   private String A91ArtPreDef ;
   private String A4352ArtPreUsrM ;
   private String A9836FasCodM ;
   private String W9836FasCodM ;
   private String A9830MaqCodC ;
   private String W9830MaqCodC ;
   private String A14077ParFMVal2 ;
   private String A14076ParFMVMax ;
   private String A14075ParFMVMin ;
   private String A9828ParFMVal ;
   private String W9828ParFMVal ;
   private String A9867ParValX ;
   private String W9867ParValX ;
   private java.util.Date A12142ProStFec ;
   private java.util.Date A10556ProFecM ;
   private java.util.Date A10554ProFecA ;
   private java.util.Date A3683ArtFecCre ;
   private java.util.Date A4354ArtFecMod ;
   private java.util.Date AV85ArtFecCre ;
   private java.util.Date AV87ArtFecMod ;
   private java.util.Date Gx_date ;
   private java.util.Date A4351ArtPreUlAc ;
   private boolean returnInSub ;
   private boolean n3072ArtObsLon ;
   private boolean n69ArtDsc ;
   private boolean n87ArtMat ;
   private boolean n1148ArtPml ;
   private boolean n78ArtGraCru ;
   private boolean n68ArtCruMin ;
   private boolean n67ArtCruMax ;
   private boolean n63ArtAcaMin ;
   private boolean n62ArtAcaMax ;
   private boolean n95ArtRen ;
   private boolean n101ArtTipPle ;
   private boolean n2834ArtPle2 ;
   private boolean n100ArtTipLar ;
   private boolean n66ArtCorOri ;
   private boolean n70ArtEncOri ;
   private boolean n96ArtSua ;
   private boolean n64ArtAcaQui ;
   private boolean n73ArtEti ;
   private boolean n117ArtUrg ;
   private boolean n88ArtMer ;
   private boolean n105ArtTra1 ;
   private boolean n106ArtTra2 ;
   private boolean n107ArtTra3 ;
   private boolean n108ArtTraP1 ;
   private boolean n109ArtTraP2 ;
   private boolean n110ArtTraP3 ;
   private boolean n111ArtUrd1 ;
   private boolean n112ArtUrd2 ;
   private boolean n113ArtUrd3 ;
   private boolean n114ArtUrdP1 ;
   private boolean n115ArtUrdP2 ;
   private boolean n116ArtUrdP3 ;
   private boolean n89ArtObs ;
   private boolean n90ArtObsFac ;
   private boolean n1229ArtEncCom ;
   private boolean n1230ArtEncAnh ;
   private boolean n5741ArtComer ;
   private boolean n5335ArtCodExt ;
   private boolean n1903ArtGraAca ;
   private boolean n1905ArtRdoA ;
   private boolean n1904ArtRdoN ;
   private boolean n3121ArtNumCor ;
   private boolean n3122ArtAncSal1 ;
   private boolean n3123ArtAncSal2 ;
   private boolean n3124ArtAncSal3 ;
   private boolean n3125ArtGraAca2 ;
   private boolean n3126ArtGraCru2 ;
   private boolean n4295ClasCod ;
   private boolean n4297ArtPmPPza ;
   private boolean n3683ArtFecCre ;
   private boolean n4353ArtUsrCod ;
   private boolean n4354ArtFecMod ;
   private boolean n6106ClaTubCod ;
   private boolean n6108ClaBolCod ;
   private boolean n6435ArtRdoCru1 ;
   private boolean n6436ArtRdoCru2 ;
   private boolean n6462ArtLu ;
   private boolean n4607ArtRb ;
   private boolean n4444ArtPelAnh ;
   private boolean n7412Artgrm2Sc ;
   private boolean n7413ArtPmlSc ;
   private boolean n7414ArtAncSc ;
   private boolean n7415ArtPmlCru ;
   private boolean n7777ArtRdtSc ;
   private boolean n7778ArtUnd ;
   private boolean n7779ArtBlo ;
   private boolean n967ArtNMtr ;
   private boolean n2707NumTexCod ;
   private boolean n2750ArtNumTex1 ;
   private boolean n2751ArtNumTex2 ;
   private boolean n9801ArtFabsT ;
   private boolean n2791ArtFacAbs ;
   private boolean n9730ArtFabsH ;
   private boolean n12695ArtElgAnc ;
   private boolean n12696ArtElgLar ;
   private boolean n12697ArtRdoCru ;
   private boolean n12698ArtEncLarg ;
   private boolean n14100Artdsc2 ;
   private boolean n12364ArtMT ;
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
   private boolean n4031CCTCod ;
   private boolean n4896ArtProFac ;
   private boolean n4895ArtProFacT ;
   private boolean n4894ArtProULin ;
   private boolean n6964Mat_obs ;
   private boolean n12357Mat_Color ;
   private boolean n12356Mat_Dsc ;
   private boolean n12355Mat_NE ;
   private boolean n12354Mat_Lu ;
   private boolean n6963Mat_LM ;
   private boolean n6962Mat_Porc ;
   private boolean n6961Mat_Lote ;
   private boolean n6960Mat_ProvN ;
   private boolean n6959Mat_NumCol ;
   private boolean n6958Mat_NomCol ;
   private boolean n6957Mat_Tors ;
   private boolean n6956Mat_Mate ;
   private boolean n6955Mat_Estr ;
   private boolean n2932Precio2 ;
   private boolean n585IntPreDef ;
   private boolean n587IntPreMtr ;
   private boolean n586IntPreKgm ;
   private boolean n3616PreFacCod ;
   private boolean n3323RecPorInc ;
   private boolean n2941RecBon ;
   private boolean n2940Precio4 ;
   private boolean n3321CliPreKgs ;
   private boolean n8328ParFasObsm ;
   private boolean n6988FasDscp ;
   private boolean n6987FasCodp ;
   private boolean n6990ParFasObsp ;
   private boolean n6989ParFasValp ;
   private boolean n91ArtPreDef ;
   private boolean n92ArtPreKgm ;
   private boolean n93ArtPreMtr ;
   private boolean n4351ArtPreUlAc ;
   private boolean n4352ArtPreUsrM ;
   private boolean n12699ArtEncAnc ;
   private boolean n12647ArtFasFct ;
   private boolean n12448ParEspIdS ;
   private boolean n10264Itm_ord4 ;
   private boolean n9868ParObsX ;
   private boolean n9867ParValX ;
   private String A3072ArtObsLon ;
   private String AV58ArtObsLon ;
   private String A6964Mat_obs ;
   private String W6964Mat_obs ;
   private String A14100Artdsc2 ;
   private String AV130Artdsc2 ;
   private String A8955Art_Obs ;
   private String A12356Mat_Dsc ;
   private String A8328ParFasObsm ;
   private String A14080ParFasPLC ;
   private String A9829ParFMObs ;
   private String W9829ParFMObs ;
   private String A9868ParObsX ;
   private String W9868ParObsX ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00852_A3072ArtObsLon ;
   private boolean[] P00852_n3072ArtObsLon ;
   private String[] P00852_A65ArtCod ;
   private int[] P00852_A252CliCod ;
   private String[] P00852_A396EmprCod ;
   private String[] P00852_A69ArtDsc ;
   private boolean[] P00852_n69ArtDsc ;
   private String[] P00852_A87ArtMat ;
   private boolean[] P00852_n87ArtMat ;
   private short[] P00852_A829TipArtCod ;
   private short[] P00852_A1148ArtPml ;
   private boolean[] P00852_n1148ArtPml ;
   private short[] P00852_A78ArtGraCru ;
   private boolean[] P00852_n78ArtGraCru ;
   private short[] P00852_A68ArtCruMin ;
   private boolean[] P00852_n68ArtCruMin ;
   private short[] P00852_A67ArtCruMax ;
   private boolean[] P00852_n67ArtCruMax ;
   private short[] P00852_A63ArtAcaMin ;
   private boolean[] P00852_n63ArtAcaMin ;
   private short[] P00852_A62ArtAcaMax ;
   private boolean[] P00852_n62ArtAcaMax ;
   private java.math.BigDecimal[] P00852_A95ArtRen ;
   private boolean[] P00852_n95ArtRen ;
   private String[] P00852_A101ArtTipPle ;
   private boolean[] P00852_n101ArtTipPle ;
   private String[] P00852_A2834ArtPle2 ;
   private boolean[] P00852_n2834ArtPle2 ;
   private String[] P00852_A100ArtTipLar ;
   private boolean[] P00852_n100ArtTipLar ;
   private String[] P00852_A66ArtCorOri ;
   private boolean[] P00852_n66ArtCorOri ;
   private String[] P00852_A70ArtEncOri ;
   private boolean[] P00852_n70ArtEncOri ;
   private String[] P00852_A96ArtSua ;
   private boolean[] P00852_n96ArtSua ;
   private String[] P00852_A64ArtAcaQui ;
   private boolean[] P00852_n64ArtAcaQui ;
   private String[] P00852_A73ArtEti ;
   private boolean[] P00852_n73ArtEti ;
   private byte[] P00852_A117ArtUrg ;
   private boolean[] P00852_n117ArtUrg ;
   private java.math.BigDecimal[] P00852_A88ArtMer ;
   private boolean[] P00852_n88ArtMer ;
   private String[] P00852_A105ArtTra1 ;
   private boolean[] P00852_n105ArtTra1 ;
   private String[] P00852_A106ArtTra2 ;
   private boolean[] P00852_n106ArtTra2 ;
   private String[] P00852_A107ArtTra3 ;
   private boolean[] P00852_n107ArtTra3 ;
   private short[] P00852_A108ArtTraP1 ;
   private boolean[] P00852_n108ArtTraP1 ;
   private short[] P00852_A109ArtTraP2 ;
   private boolean[] P00852_n109ArtTraP2 ;
   private short[] P00852_A110ArtTraP3 ;
   private boolean[] P00852_n110ArtTraP3 ;
   private String[] P00852_A111ArtUrd1 ;
   private boolean[] P00852_n111ArtUrd1 ;
   private String[] P00852_A112ArtUrd2 ;
   private boolean[] P00852_n112ArtUrd2 ;
   private String[] P00852_A113ArtUrd3 ;
   private boolean[] P00852_n113ArtUrd3 ;
   private short[] P00852_A114ArtUrdP1 ;
   private boolean[] P00852_n114ArtUrdP1 ;
   private short[] P00852_A115ArtUrdP2 ;
   private boolean[] P00852_n115ArtUrdP2 ;
   private short[] P00852_A116ArtUrdP3 ;
   private boolean[] P00852_n116ArtUrdP3 ;
   private String[] P00852_A89ArtObs ;
   private boolean[] P00852_n89ArtObs ;
   private String[] P00852_A90ArtObsFac ;
   private boolean[] P00852_n90ArtObsFac ;
   private short[] P00852_A1229ArtEncCom ;
   private boolean[] P00852_n1229ArtEncCom ;
   private short[] P00852_A1230ArtEncAnh ;
   private boolean[] P00852_n1230ArtEncAnh ;
   private String[] P00852_A5741ArtComer ;
   private boolean[] P00852_n5741ArtComer ;
   private String[] P00852_A5335ArtCodExt ;
   private boolean[] P00852_n5335ArtCodExt ;
   private short[] P00852_A1903ArtGraAca ;
   private boolean[] P00852_n1903ArtGraAca ;
   private java.math.BigDecimal[] P00852_A1905ArtRdoA ;
   private boolean[] P00852_n1905ArtRdoA ;
   private java.math.BigDecimal[] P00852_A1904ArtRdoN ;
   private boolean[] P00852_n1904ArtRdoN ;
   private short[] P00852_A3121ArtNumCor ;
   private boolean[] P00852_n3121ArtNumCor ;
   private short[] P00852_A3122ArtAncSal1 ;
   private boolean[] P00852_n3122ArtAncSal1 ;
   private short[] P00852_A3123ArtAncSal2 ;
   private boolean[] P00852_n3123ArtAncSal2 ;
   private short[] P00852_A3124ArtAncSal3 ;
   private boolean[] P00852_n3124ArtAncSal3 ;
   private short[] P00852_A3125ArtGraAca2 ;
   private boolean[] P00852_n3125ArtGraAca2 ;
   private short[] P00852_A3126ArtGraCru2 ;
   private boolean[] P00852_n3126ArtGraCru2 ;
   private short[] P00852_A4295ClasCod ;
   private boolean[] P00852_n4295ClasCod ;
   private java.math.BigDecimal[] P00852_A4297ArtPmPPza ;
   private boolean[] P00852_n4297ArtPmPPza ;
   private java.util.Date[] P00852_A3683ArtFecCre ;
   private boolean[] P00852_n3683ArtFecCre ;
   private String[] P00852_A4353ArtUsrCod ;
   private boolean[] P00852_n4353ArtUsrCod ;
   private java.util.Date[] P00852_A4354ArtFecMod ;
   private boolean[] P00852_n4354ArtFecMod ;
   private short[] P00852_A6106ClaTubCod ;
   private boolean[] P00852_n6106ClaTubCod ;
   private short[] P00852_A6108ClaBolCod ;
   private boolean[] P00852_n6108ClaBolCod ;
   private java.math.BigDecimal[] P00852_A6435ArtRdoCru1 ;
   private boolean[] P00852_n6435ArtRdoCru1 ;
   private java.math.BigDecimal[] P00852_A6436ArtRdoCru2 ;
   private boolean[] P00852_n6436ArtRdoCru2 ;
   private java.math.BigDecimal[] P00852_A6462ArtLu ;
   private boolean[] P00852_n6462ArtLu ;
   private short[] P00852_A4607ArtRb ;
   private boolean[] P00852_n4607ArtRb ;
   private short[] P00852_A4444ArtPelAnh ;
   private boolean[] P00852_n4444ArtPelAnh ;
   private short[] P00852_A7412Artgrm2Sc ;
   private boolean[] P00852_n7412Artgrm2Sc ;
   private short[] P00852_A7413ArtPmlSc ;
   private boolean[] P00852_n7413ArtPmlSc ;
   private short[] P00852_A7414ArtAncSc ;
   private boolean[] P00852_n7414ArtAncSc ;
   private short[] P00852_A7415ArtPmlCru ;
   private boolean[] P00852_n7415ArtPmlCru ;
   private java.math.BigDecimal[] P00852_A7777ArtRdtSc ;
   private boolean[] P00852_n7777ArtRdtSc ;
   private String[] P00852_A7778ArtUnd ;
   private boolean[] P00852_n7778ArtUnd ;
   private String[] P00852_A7779ArtBlo ;
   private boolean[] P00852_n7779ArtBlo ;
   private String[] P00852_A967ArtNMtr ;
   private boolean[] P00852_n967ArtNMtr ;
   private String[] P00852_A2707NumTexCod ;
   private boolean[] P00852_n2707NumTexCod ;
   private byte[] P00852_A2750ArtNumTex1 ;
   private boolean[] P00852_n2750ArtNumTex1 ;
   private short[] P00852_A2751ArtNumTex2 ;
   private boolean[] P00852_n2751ArtNumTex2 ;
   private java.math.BigDecimal[] P00852_A9801ArtFabsT ;
   private boolean[] P00852_n9801ArtFabsT ;
   private java.math.BigDecimal[] P00852_A2791ArtFacAbs ;
   private boolean[] P00852_n2791ArtFacAbs ;
   private java.math.BigDecimal[] P00852_A9730ArtFabsH ;
   private boolean[] P00852_n9730ArtFabsH ;
   private java.math.BigDecimal[] P00852_A12695ArtElgAnc ;
   private boolean[] P00852_n12695ArtElgAnc ;
   private java.math.BigDecimal[] P00852_A12696ArtElgLar ;
   private boolean[] P00852_n12696ArtElgLar ;
   private java.math.BigDecimal[] P00852_A12697ArtRdoCru ;
   private boolean[] P00852_n12697ArtRdoCru ;
   private java.math.BigDecimal[] P00852_A12698ArtEncLarg ;
   private boolean[] P00852_n12698ArtEncLarg ;
   private String[] P00852_A14100Artdsc2 ;
   private boolean[] P00852_n14100Artdsc2 ;
   private byte[] P00852_A12364ArtMT ;
   private boolean[] P00852_n12364ArtMT ;
   private String[] P00852_A14295ArtActivo ;
   private String[] P00853_A396EmprCod ;
   private int[] P00853_A252CliCod ;
   private String[] P00853_A65ArtCod ;
   private String[] P00853_A758ProCod ;
   private String[] P00853_A12752Art_Tipo ;
   private boolean[] P00853_n12752Art_Tipo ;
   private java.util.Date[] P00853_A12142ProStFec ;
   private byte[] P00853_A12141ProSta ;
   private java.math.BigDecimal[] P00853_A11272ProFabs ;
   private java.util.Date[] P00853_A10556ProFecM ;
   private String[] P00853_A10555ProUserM ;
   private java.util.Date[] P00853_A10554ProFecA ;
   private String[] P00853_A10553ProUserA ;
   private String[] P00853_A10412ProAct ;
   private String[] P00853_A10026DscCFa ;
   private String[] P00853_A9629Art_els ;
   private boolean[] P00853_n9629Art_els ;
   private String[] P00853_A9628Art_ets ;
   private boolean[] P00853_n9628Art_ets ;
   private String[] P00853_A8955Art_Obs ;
   private boolean[] P00853_n8955Art_Obs ;
   private String[] P00853_A8166Art_Und ;
   private boolean[] P00853_n8166Art_Und ;
   private String[] P00853_A8165Art_Dsc ;
   private boolean[] P00853_n8165Art_Dsc ;
   private java.math.BigDecimal[] P00853_A8084Art_RdoP ;
   private boolean[] P00853_n8084Art_RdoP ;
   private short[] P00853_A8083Art_AncP ;
   private boolean[] P00853_n8083Art_AncP ;
   private short[] P00853_A8082Art_PmlP ;
   private boolean[] P00853_n8082Art_PmlP ;
   private short[] P00853_A8081Art_GrmP ;
   private boolean[] P00853_n8081Art_GrmP ;
   private short[] P00853_A8080Art_PmlC ;
   private boolean[] P00853_n8080Art_PmlC ;
   private short[] P00853_A8079Art_AncC ;
   private boolean[] P00853_n8079Art_AncC ;
   private short[] P00853_A8078Art_GrmC ;
   private boolean[] P00853_n8078Art_GrmC ;
   private short[] P00853_A8077Art_GrmB ;
   private boolean[] P00853_n8077Art_GrmB ;
   private short[] P00853_A8076Art_AncB ;
   private boolean[] P00853_n8076Art_AncB ;
   private java.math.BigDecimal[] P00853_A8075Art_Fabs ;
   private boolean[] P00853_n8075Art_Fabs ;
   private java.math.BigDecimal[] P00853_A8074Art_Rdpc ;
   private boolean[] P00853_n8074Art_Rdpc ;
   private java.math.BigDecimal[] P00853_A8073Art_Rdo ;
   private boolean[] P00853_n8073Art_Rdo ;
   private String[] P00853_A8072Art_Cor ;
   private boolean[] P00853_n8072Art_Cor ;
   private String[] P00853_A8071Art_Enc ;
   private boolean[] P00853_n8071Art_Enc ;
   private short[] P00853_A8070Art_Elar ;
   private boolean[] P00853_n8070Art_Elar ;
   private short[] P00853_A8069Art_Eanc ;
   private boolean[] P00853_n8069Art_Eanc ;
   private short[] P00853_A8068Art_PmlA ;
   private boolean[] P00853_n8068Art_PmlA ;
   private java.math.BigDecimal[] P00853_A8067Art_Merma ;
   private boolean[] P00853_n8067Art_Merma ;
   private short[] P00853_A8066Art_AncA ;
   private boolean[] P00853_n8066Art_AncA ;
   private short[] P00853_A8065Art_GrmA ;
   private boolean[] P00853_n8065Art_GrmA ;
   private String[] P00855_A396EmprCod ;
   private int[] P00855_A252CliCod ;
   private String[] P00855_A65ArtCod ;
   private String[] P00855_A758ProCod ;
   private String[] P00855_A457FasCod ;
   private short[] P00855_A14547ArtFasNPs ;
   private java.math.BigDecimal[] P00855_A14546ArtFasVel ;
   private short[] P00855_A14545ArtFasPpp ;
   private short[] P00855_A14544ArtFasPyS ;
   private java.math.BigDecimal[] P00855_A8560ArtFasFac ;
   private int[] P00855_A4031CCTCod ;
   private boolean[] P00855_n4031CCTCod ;
   private java.math.BigDecimal[] P00855_A4896ArtProFac ;
   private boolean[] P00855_n4896ArtProFac ;
   private String[] P00855_A4895ArtProFacT ;
   private boolean[] P00855_n4895ArtProFacT ;
   private short[] P00855_A4894ArtProULin ;
   private boolean[] P00855_n4894ArtProULin ;
   private String[] P00857_A396EmprCod ;
   private int[] P00857_A252CliCod ;
   private String[] P00857_A65ArtCod ;
   private String[] P00857_A758ProCod ;
   private String[] P00857_A457FasCod ;
   private String[] P00857_A1673ParFasObs ;
   private String[] P00857_A14061ParFasVmn ;
   private String[] P00857_A14060ParFasVmx ;
   private short[] P00857_A13220ParOrden ;
   private String[] P00857_A12670ParFasVl2 ;
   private String[] P00857_A1668ParFasVal ;
   private short[] P00857_A1664ParFasCod ;
   private String[] P00859_A65ArtCod ;
   private int[] P00859_A252CliCod ;
   private String[] P00859_A4898ArtProCod ;
   private short[] P00859_A4897ArtProLin ;
   private String[] P00859_A457FasCod ;
   private String[] P00859_A758ProCod ;
   private String[] P00859_A396EmprCod ;
   private String[] P008511_A6964Mat_obs ;
   private boolean[] P008511_n6964Mat_obs ;
   private String[] P008511_A65ArtCod ;
   private int[] P008511_A252CliCod ;
   private String[] P008511_A396EmprCod ;
   private String[] P008511_A12358Mat_NAlim ;
   private String[] P008511_A12357Mat_Color ;
   private boolean[] P008511_n12357Mat_Color ;
   private String[] P008511_A12356Mat_Dsc ;
   private boolean[] P008511_n12356Mat_Dsc ;
   private String[] P008511_A12355Mat_NE ;
   private boolean[] P008511_n12355Mat_NE ;
   private java.math.BigDecimal[] P008511_A12354Mat_Lu ;
   private boolean[] P008511_n12354Mat_Lu ;
   private java.math.BigDecimal[] P008511_A6963Mat_LM ;
   private boolean[] P008511_n6963Mat_LM ;
   private java.math.BigDecimal[] P008511_A6962Mat_Porc ;
   private boolean[] P008511_n6962Mat_Porc ;
   private String[] P008511_A6961Mat_Lote ;
   private boolean[] P008511_n6961Mat_Lote ;
   private String[] P008511_A6960Mat_ProvN ;
   private boolean[] P008511_n6960Mat_ProvN ;
   private int[] P008511_A6959Mat_NumCol ;
   private boolean[] P008511_n6959Mat_NumCol ;
   private String[] P008511_A6958Mat_NomCol ;
   private boolean[] P008511_n6958Mat_NomCol ;
   private String[] P008511_A6957Mat_Tors ;
   private boolean[] P008511_n6957Mat_Tors ;
   private String[] P008511_A6956Mat_Mate ;
   private boolean[] P008511_n6956Mat_Mate ;
   private String[] P008511_A6955Mat_Estr ;
   private boolean[] P008511_n6955Mat_Estr ;
   private short[] P008511_A6954Mat_lin ;
   private String[] P008513_A396EmprCod ;
   private int[] P008513_A252CliCod ;
   private String[] P008513_A65ArtCod ;
   private short[] P008513_A2931Limite2 ;
   private java.math.BigDecimal[] P008513_A2932Precio2 ;
   private boolean[] P008513_n2932Precio2 ;
   private String[] P008515_A396EmprCod ;
   private int[] P008515_A252CliCod ;
   private String[] P008515_A65ArtCod ;
   private String[] P008515_A585IntPreDef ;
   private boolean[] P008515_n585IntPreDef ;
   private java.math.BigDecimal[] P008515_A587IntPreMtr ;
   private boolean[] P008515_n587IntPreMtr ;
   private java.math.BigDecimal[] P008515_A586IntPreKgm ;
   private boolean[] P008515_n586IntPreKgm ;
   private byte[] P008515_A583IntCod ;
   private byte[] P008515_A831TipColCod ;
   private String[] P008515_A3616PreFacCod ;
   private boolean[] P008515_n3616PreFacCod ;
   private String[] P008517_A396EmprCod ;
   private int[] P008517_A252CliCod ;
   private String[] P008517_A65ArtCod ;
   private java.math.BigDecimal[] P008517_A3323RecPorInc ;
   private boolean[] P008517_n3323RecPorInc ;
   private String[] P008517_A2941RecBon ;
   private boolean[] P008517_n2941RecBon ;
   private java.math.BigDecimal[] P008517_A2940Precio4 ;
   private boolean[] P008517_n2940Precio4 ;
   private short[] P008517_A2939Limite4 ;
   private byte[] P008517_A2937RecIntCod ;
   private String[] P008519_A396EmprCod ;
   private int[] P008519_A252CliCod ;
   private java.math.BigDecimal[] P008519_A3321CliPreKgs ;
   private boolean[] P008519_n3321CliPreKgs ;
   private java.math.BigDecimal[] P008519_A3320CliLimKgs ;
   private int[] P008521_A252CliCod ;
   private String[] P008521_A396EmprCod ;
   private String[] P008521_A278CliNif ;
   private String[] P008523_A457FasCod ;
   private String[] P008523_A758ProCod ;
   private String[] P008523_A65ArtCod ;
   private int[] P008523_A252CliCod ;
   private String[] P008523_A396EmprCod ;
   private short[] P008523_A14547ArtFasNPs ;
   private java.math.BigDecimal[] P008523_A14546ArtFasVel ;
   private short[] P008523_A14545ArtFasPpp ;
   private short[] P008523_A14544ArtFasPyS ;
   private java.math.BigDecimal[] P008523_A8560ArtFasFac ;
   private int[] P008523_A4031CCTCod ;
   private boolean[] P008523_n4031CCTCod ;
   private java.math.BigDecimal[] P008523_A4896ArtProFac ;
   private boolean[] P008523_n4896ArtProFac ;
   private String[] P008523_A4895ArtProFacT ;
   private boolean[] P008523_n4895ArtProFacT ;
   private short[] P008523_A4894ArtProULin ;
   private boolean[] P008523_n4894ArtProULin ;
   private String[] P008525_A396EmprCod ;
   private int[] P008525_A252CliCod ;
   private String[] P008525_A65ArtCod ;
   private String[] P008525_A758ProCod ;
   private String[] P008525_A457FasCod ;
   private String[] P008525_A1673ParFasObs ;
   private String[] P008525_A14061ParFasVmn ;
   private String[] P008525_A14060ParFasVmx ;
   private short[] P008525_A13220ParOrden ;
   private String[] P008525_A12670ParFasVl2 ;
   private String[] P008525_A1668ParFasVal ;
   private short[] P008525_A1664ParFasCod ;
   private String[] P008527_A758ProCod ;
   private String[] P008527_A65ArtCod ;
   private int[] P008527_A252CliCod ;
   private String[] P008527_A396EmprCod ;
   private String[] P008527_A8328ParFasObsm ;
   private boolean[] P008527_n8328ParFasObsm ;
   private String[] P008527_A6988FasDscp ;
   private boolean[] P008527_n6988FasDscp ;
   private String[] P008527_A6987FasCodp ;
   private boolean[] P008527_n6987FasCodp ;
   private short[] P008527_A6986NumLinPro ;
   private String[] P008529_A758ProCod ;
   private String[] P008529_A65ArtCod ;
   private int[] P008529_A252CliCod ;
   private String[] P008529_A396EmprCod ;
   private String[] P008529_A6990ParFasObsp ;
   private boolean[] P008529_n6990ParFasObsp ;
   private String[] P008529_A6989ParFasValp ;
   private boolean[] P008529_n6989ParFasValp ;
   private short[] P008529_A1664ParFasCod ;
   private short[] P008529_A6986NumLinPro ;
   private int[] P008531_A252CliCod ;
   private String[] P008531_A396EmprCod ;
   private String[] P008531_A278CliNif ;
   private String[] P008533_A6964Mat_obs ;
   private boolean[] P008533_n6964Mat_obs ;
   private String[] P008533_A65ArtCod ;
   private String[] P008533_A396EmprCod ;
   private String[] P008533_A12358Mat_NAlim ;
   private String[] P008533_A12357Mat_Color ;
   private boolean[] P008533_n12357Mat_Color ;
   private String[] P008533_A12356Mat_Dsc ;
   private boolean[] P008533_n12356Mat_Dsc ;
   private String[] P008533_A12355Mat_NE ;
   private boolean[] P008533_n12355Mat_NE ;
   private java.math.BigDecimal[] P008533_A12354Mat_Lu ;
   private boolean[] P008533_n12354Mat_Lu ;
   private java.math.BigDecimal[] P008533_A6963Mat_LM ;
   private boolean[] P008533_n6963Mat_LM ;
   private java.math.BigDecimal[] P008533_A6962Mat_Porc ;
   private boolean[] P008533_n6962Mat_Porc ;
   private String[] P008533_A6961Mat_Lote ;
   private boolean[] P008533_n6961Mat_Lote ;
   private String[] P008533_A6960Mat_ProvN ;
   private boolean[] P008533_n6960Mat_ProvN ;
   private int[] P008533_A6959Mat_NumCol ;
   private boolean[] P008533_n6959Mat_NumCol ;
   private String[] P008533_A6958Mat_NomCol ;
   private boolean[] P008533_n6958Mat_NomCol ;
   private String[] P008533_A6957Mat_Tors ;
   private boolean[] P008533_n6957Mat_Tors ;
   private String[] P008533_A6956Mat_Mate ;
   private boolean[] P008533_n6956Mat_Mate ;
   private String[] P008533_A6955Mat_Estr ;
   private boolean[] P008533_n6955Mat_Estr ;
   private short[] P008533_A6954Mat_lin ;
   private int[] P008533_A252CliCod ;
   private String[] P008536_A6964Mat_obs ;
   private boolean[] P008536_n6964Mat_obs ;
   private String[] P008536_A65ArtCod ;
   private int[] P008536_A252CliCod ;
   private String[] P008536_A396EmprCod ;
   private String[] P008536_A12358Mat_NAlim ;
   private String[] P008536_A12357Mat_Color ;
   private boolean[] P008536_n12357Mat_Color ;
   private String[] P008536_A12356Mat_Dsc ;
   private boolean[] P008536_n12356Mat_Dsc ;
   private String[] P008536_A12355Mat_NE ;
   private boolean[] P008536_n12355Mat_NE ;
   private java.math.BigDecimal[] P008536_A12354Mat_Lu ;
   private boolean[] P008536_n12354Mat_Lu ;
   private java.math.BigDecimal[] P008536_A6963Mat_LM ;
   private boolean[] P008536_n6963Mat_LM ;
   private java.math.BigDecimal[] P008536_A6962Mat_Porc ;
   private boolean[] P008536_n6962Mat_Porc ;
   private String[] P008536_A6961Mat_Lote ;
   private boolean[] P008536_n6961Mat_Lote ;
   private String[] P008536_A6960Mat_ProvN ;
   private boolean[] P008536_n6960Mat_ProvN ;
   private int[] P008536_A6959Mat_NumCol ;
   private boolean[] P008536_n6959Mat_NumCol ;
   private String[] P008536_A6958Mat_NomCol ;
   private boolean[] P008536_n6958Mat_NomCol ;
   private String[] P008536_A6957Mat_Tors ;
   private boolean[] P008536_n6957Mat_Tors ;
   private String[] P008536_A6956Mat_Mate ;
   private boolean[] P008536_n6956Mat_Mate ;
   private String[] P008536_A6955Mat_Estr ;
   private boolean[] P008536_n6955Mat_Estr ;
   private short[] P008536_A6954Mat_lin ;
   private String[] P008538_A758ProCod ;
   private String[] P008538_A65ArtCod ;
   private int[] P008538_A252CliCod ;
   private String[] P008538_A396EmprCod ;
   private java.math.BigDecimal[] P008538_A12647ArtFasFct ;
   private boolean[] P008538_n12647ArtFasFct ;
   private String[] P008538_A9836FasCodM ;
   private String[] P008540_A396EmprCod ;
   private int[] P008540_A252CliCod ;
   private String[] P008540_A65ArtCod ;
   private String[] P008540_A758ProCod ;
   private String[] P008540_A9836FasCodM ;
   private java.math.BigDecimal[] P008540_A14553CPFMDc2 ;
   private java.math.BigDecimal[] P008540_A14552CPFMDc ;
   private short[] P008540_A14551CPFMNp ;
   private java.math.BigDecimal[] P008540_A14550CPFMVel ;
   private short[] P008540_A14549CPFMPrep ;
   private short[] P008540_A14548CPFMPres ;
   private short[] P008540_A9869MaqAncC ;
   private String[] P008540_A9830MaqCodC ;
   private String[] P008542_A396EmprCod ;
   private int[] P008542_A252CliCod ;
   private String[] P008542_A65ArtCod ;
   private String[] P008542_A758ProCod ;
   private String[] P008542_A9836FasCodM ;
   private String[] P008542_A9830MaqCodC ;
   private String[] P008542_A14080ParFasPLC ;
   private String[] P008542_A14077ParFMVal2 ;
   private String[] P008542_A14076ParFMVMax ;
   private String[] P008542_A14075ParFMVMin ;
   private short[] P008542_A12448ParEspIdS ;
   private boolean[] P008542_n12448ParEspIdS ;
   private short[] P008542_A10256Itm_ord2 ;
   private String[] P008542_A9829ParFMObs ;
   private String[] P008542_A9828ParFMVal ;
   private short[] P008542_A1664ParFasCod ;
   private String[] P008544_A9836FasCodM ;
   private String[] P008544_A758ProCod ;
   private String[] P008544_A65ArtCod ;
   private int[] P008544_A252CliCod ;
   private String[] P008544_A396EmprCod ;
   private short[] P008544_A9864MaqAncA ;
   private String[] P008544_A9830MaqCodC ;
   private String[] P008546_A396EmprCod ;
   private int[] P008546_A252CliCod ;
   private String[] P008546_A65ArtCod ;
   private String[] P008546_A758ProCod ;
   private String[] P008546_A9836FasCodM ;
   private String[] P008546_A9830MaqCodC ;
   private short[] P008546_A9864MaqAncA ;
   private short[] P008546_A10264Itm_ord4 ;
   private boolean[] P008546_n10264Itm_ord4 ;
   private String[] P008546_A9868ParObsX ;
   private boolean[] P008546_n9868ParObsX ;
   private String[] P008546_A9867ParValX ;
   private boolean[] P008546_n9867ParValX ;
   private short[] P008546_A9865Cod_parX ;
}

final  class pnewse2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00852", "SELECT ArtObsLon, ArtCod, CliCod, EmprCod, ArtDsc, ArtMat, TipArtCod, ArtPml, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtPle2, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtEncCom, ArtEncAnh, ArtComer, ArtCodExt, ArtGraAca, ArtRdoA, ArtRdoN, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ClasCod, ArtPmPPza, ArtFecCre, ArtUsrCod, ArtFecMod, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, ArtRb, ArtPelAnh, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtNMtr, NumTexCod, ArtNumTex1, ArtNumTex2, ArtFabsT, ArtFacAbs, ArtFabsH, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, Artdsc2, ArtMT, ArtActivo FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00853", "SELECT EmprCod, CliCod, ArtCod, ProCod, Art_Tipo, ProStFec, ProSta, ProFabs, ProFecM, ProUserM, ProFecA, ProUserA, ProAct, DscCFa, Art_els, Art_ets, Art_Obs, Art_Und, Art_Dsc, Art_RdoP, Art_AncP, Art_PmlP, Art_GrmP, Art_PmlC, Art_AncC, Art_GrmC, Art_GrmB, Art_AncB, Art_Fabs, Art_Rdpc, Art_Rdo, Art_Cor, Art_Enc, Art_Elar, Art_Eanc, Art_PmlA, Art_Merma, Art_AncA, Art_GrmA FROM TXPARTLIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00854", "INSERT INTO TXPARTLIN(EmprCod, CliCod, ArtCod, ProCod, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Rdpc, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, DscCFa, ProAct, ProUserA, ProFecA, ProUserM, ProFecM, ProFabs, ProSta, ProStFec, Art_Tipo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTLIN")
         ,new ForEachCursor("P00855", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtFasNPs, ArtFasVel, ArtFasPpp, ArtFasPyS, ArtFasFac, CCTCod, ArtProFac, ArtProFacT, ArtProULin FROM TXPSERPAU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00856", "INSERT INTO TXPSERPAU(EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProULin, ArtProFacT, ArtProFac, CCTCod, ArtFasFac, ArtFasPyS, ArtFasPpp, ArtFasVel, ArtFasNPs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPSERPAU")
         ,new ForEachCursor("P00857", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasObs, ParFasVmn, ParFasVmx, ParOrden, ParFasVl2, ParFasVal, ParFasCod FROM TXPSERPAR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00858", "INSERT INTO TXPSERPAR(EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod, ParFasVal, ParFasObs, ParFasVl2, ParOrden, ParFasVmx, ParFasVmn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPSERPAR")
         ,new ForEachCursor("P00859", "SELECT ArtCod, CliCod, ArtProCod, ArtProLin, FasCod, ProCod, EmprCod FROM TXPArtFor WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008510", "INSERT INTO TXPArtFor(EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProLin, ArtProCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPArtFor")
         ,new ForEachCursor("P008511", "SELECT Mat_obs, ArtCod, CliCod, EmprCod, Mat_NAlim, Mat_Color, Mat_Dsc, Mat_NE, Mat_Lu, Mat_LM, Mat_Porc, Mat_Lote, Mat_ProvN, Mat_NumCol, Mat_NomCol, Mat_Tors, Mat_Mate, Mat_Estr, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Mat_lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008512", "INSERT INTO TXPARTMAT(EmprCod, CliCod, ArtCod, Mat_lin, Mat_Estr, Mat_Mate, Mat_Tors, Mat_NomCol, Mat_NumCol, Mat_ProvN, Mat_Lote, Mat_Porc, Mat_LM, Mat_obs, Mat_Lu, Mat_NE, Mat_Dsc, Mat_Color, Mat_NAlim) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTMAT")
         ,new ForEachCursor("P008513", "SELECT EmprCod, CliCod, ArtCod, Limite2, Precio2 FROM TXPRECARB WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Limite2 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008514", "INSERT INTO TXPRECARB(EmprCod, CliCod, ArtCod, Limite2, Precio2) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECARB")
         ,new ForEachCursor("P008515", "SELECT EmprCod, CliCod, ArtCod, IntPreDef, IntPreMtr, IntPreKgm, IntCod, TipColCod, PreFacCod FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008516", "INSERT INTO TXPPRETIN(EmprCod, CliCod, ArtCod, TipColCod, IntCod, IntPreKgm, IntPreMtr, IntPreDef, PreFacCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETIN")
         ,new ForEachCursor("P008517", "SELECT EmprCod, CliCod, ArtCod, RecPorInc, RecBon, Precio4, Limite4, RecIntCod FROM TXPLRBART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, RecIntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008518", "INSERT INTO TXPLRBART(EmprCod, CliCod, ArtCod, RecIntCod, Limite4, Precio4, RecBon, RecPorInc) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRBART")
         ,new ForEachCursor("P008519", "SELECT EmprCod, CliCod, CliPreKgs, CliLimKgs FROM TXPPREKIL WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, CliLimKgs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008520", "INSERT INTO TXPPREKIL(EmprCod, CliCod, CliLimKgs, CliPreKgs) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREKIL")
         ,new ForEachCursor("P008521", "SELECT CliCod, EmprCod, CliNif FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod <> ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008522", "INSERT INTO TXPARTLIN(EmprCod, CliCod, ArtCod, ProCod, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Rdpc, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, DscCFa, ProAct, ProUserA, ProFecA, ProUserM, ProFecM, ProFabs, ProSta, ProStFec, Art_Tipo) VALUES(?, ?, ?, ?, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTLIN")
         ,new ForEachCursor("P008523", "SELECT FasCod, ProCod, ArtCod, CliCod, EmprCod, ArtFasNPs, ArtFasVel, ArtFasPpp, ArtFasPyS, ArtFasFac, CCTCod, ArtProFac, ArtProFacT, ArtProULin FROM TXPSERPAU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008524", "INSERT INTO TXPSERPAU(EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProULin, ArtProFacT, ArtProFac, CCTCod, ArtFasFac, ArtFasPyS, ArtFasPpp, ArtFasVel, ArtFasNPs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPSERPAU")
         ,new ForEachCursor("P008525", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasObs, ParFasVmn, ParFasVmx, ParOrden, ParFasVl2, ParFasVal, ParFasCod FROM TXPSERPAR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008526", "INSERT INTO TXPSERPAR(EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod, ParFasVal, ParFasObs, ParFasVl2, ParOrden, ParFasVmx, ParFasVmn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPSERPAR")
         ,new ForEachCursor("P008527", "SELECT ProCod, ArtCod, CliCod, EmprCod, ParFasObsm, FasDscp, FasCodp, NumLinPro FROM TXPPARART WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, NumLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008528", "INSERT INTO TXPPARART(EmprCod, CliCod, ArtCod, ProCod, NumLinPro, FasCodp, FasDscp, ParFasObsm) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPARART")
         ,new ForEachCursor("P008529", "SELECT ProCod, ArtCod, CliCod, EmprCod, ParFasObsp, ParFasValp, ParFasCod, NumLinPro FROM TXPPARAR1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, NumLinPro, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008530", "INSERT INTO TXPPARAR1(EmprCod, CliCod, ArtCod, ProCod, NumLinPro, ParFasCod, ParFasValp, ParFasObsp) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPARAR1")
         ,new ForEachCursor("P008531", "SELECT CliCod, EmprCod, CliNif FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod <> ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008532", "INSERT INTO TXPARTICU(EmprCod, CliCod, ArtCod, ArtMat, TipArtCod, ArtDsc, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtPreKgm, ArtPreMtr, ArtPreDef, ArtNMtr, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtFacAbs, ArtPle2, ArtObsLon, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtFecCre, ClasCod, ArtPmPPza, ArtUsrCod, ArtFecMod, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtRb, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtFabsT, ArtMT, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, ArtActivo, ULinRec, ArtNumTex1, ArtNumTex2, NumTexCod, ArtCosBase, ArtPreCap, ArtAnu, ArtPrMEst, ULinPre, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtValMtr, ArtFacTor, Mat_UltL, Mat_Maq, UltLinFT, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtFabsH, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtTRabs, ArtKgMn, ArtObsOtra, ArtRdto4, Artdsc2, ArtgrComp, ArtKgspp, ArtPrepp) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, ' ', 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
         ,new ForEachCursor("P008533", "SELECT Mat_obs, ArtCod, EmprCod, Mat_NAlim, Mat_Color, Mat_Dsc, Mat_NE, Mat_Lu, Mat_LM, Mat_Porc, Mat_Lote, Mat_ProvN, Mat_NumCol, Mat_NomCol, Mat_Tors, Mat_Mate, Mat_Estr, Mat_lin, CliCod FROM TXPARTMAT WHERE (EmprCod = ?) AND (CliCod <> ?) ORDER BY EmprCod, CliCod, ArtCod, Mat_lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008534", "INSERT INTO TXPARTMAT(EmprCod, CliCod, ArtCod, Mat_lin, Mat_Estr, Mat_Mate, Mat_Tors, Mat_NomCol, Mat_NumCol, Mat_ProvN, Mat_Lote, Mat_Porc, Mat_LM, Mat_obs, Mat_Lu, Mat_NE, Mat_Dsc, Mat_Color, Mat_NAlim) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTMAT")
         ,new UpdateCursor("P008535", "INSERT INTO TXPARTICU(EmprCod, CliCod, ArtCod, ArtMat, TipArtCod, ArtDsc, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtPreKgm, ArtPreMtr, ArtPreDef, ArtNMtr, ArtPml, ArtEncCom, ArtEncAnh, ArtGraAca, ArtRdoN, ArtRdoA, ArtNumTex1, ArtNumTex2, NumTexCod, ArtFacAbs, ArtPle2, ArtObsLon, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ArtFecCre, ClasCod, ArtPmPPza, ArtUsrCod, ArtFecMod, ArtPreUlAc, ArtPreUsrM, ArtPelAnh, ArtRb, ArtCodExt, ArtComer, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtLu, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtFabsH, ArtFabsT, ArtMT, ArtElgAnc, ArtElgLar, ArtRdoCru, ArtEncLarg, ArtEncAnc, Artdsc2, ArtActivo, ULinRec, ArtCosBase, ArtPreCap, ArtAnu, ArtPrMEst, ULinPre, ArtAcaAnh, ArtAcaMar, ArtAcaBak, ArtLotMaq, ArtCruMts, ArtCruKgs, ArtCruEnr, ArtLotPza, ArtLotMts, ArtLotKgs, ArtAcaFor, ArtValMtr, ArtFacTor, Mat_UltL, Mat_Maq, UltLinFT, ArtCla, CapKgs1, CapKgs2, CapKgs3, CapKgs4, CapKgs5, CapKgs6, CapKgs7, CapKgs8, CapKgs9, CapKgs10, ArtNProg, ArtVbd, ArtVbn, ArtAb, ArtObsGrm, ArtObsAnc, ArtCdb, ArtGalga, ArtPlatina, ArtPgd, ArtTh, Art_Cd, CapUsuM, CapFecM, Mat_UsuM, Mat_FecM, CapUsuA, CapFecA, ArtHilos, ArtPasad, ArtAncC, ArtGrm2C, ArtRdoC, ArtPreObs, ArtFacUti, ArtPreEst, ArtDefEst, ArtNumTip, ArtPreUnd, Mat_ObsG, ArtTRabs, ArtKgMn, ArtObsOtra, ArtRdto4, ArtgrComp, ArtKgspp, ArtPrepp) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
         ,new ForEachCursor("P008536", "SELECT Mat_obs, ArtCod, CliCod, EmprCod, Mat_NAlim, Mat_Color, Mat_Dsc, Mat_NE, Mat_Lu, Mat_LM, Mat_Porc, Mat_Lote, Mat_ProvN, Mat_NumCol, Mat_NomCol, Mat_Tors, Mat_Mate, Mat_Estr, Mat_lin FROM TXPARTMAT WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod, Mat_lin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008537", "INSERT INTO TXPARTMAT(EmprCod, CliCod, ArtCod, Mat_lin, Mat_Estr, Mat_Mate, Mat_Tors, Mat_NomCol, Mat_NumCol, Mat_ProvN, Mat_Lote, Mat_Porc, Mat_LM, Mat_obs, Mat_Lu, Mat_NE, Mat_Dsc, Mat_Color, Mat_NAlim) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTMAT")
         ,new ForEachCursor("P008538", "SELECT ProCod, ArtCod, CliCod, EmprCod, ArtFasFct, FasCodM FROM TXPCAPFMP WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008539", "INSERT INTO TXPCAPFMP(EmprCod, CliCod, ArtCod, ProCod, FasCodM, ArtFasFct) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAPFMP")
         ,new ForEachCursor("P008540", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM, CPFMDc2, CPFMDc, CPFMNp, CPFMVel, CPFMPrep, CPFMPres, MaqAncC, MaqCodC FROM TXPCAPFM1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008541", "INSERT INTO TXPCAPFM1(EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncC, CPFMPres, CPFMPrep, CPFMVel, CPFMNp, CPFMDc, CPFMDc2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAPFM1")
         ,new ForEachCursor("P008542", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, ParFasPLC, ParFMVal2, ParFMVMax, ParFMVMin, ParEspIdS, Itm_ord2, ParFMObs, ParFMVal, ParFasCod FROM TXPCAPFM2 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008543", "INSERT INTO TXPCAPFM2(EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, ParFasCod, ParFMVal, ParFMObs, Itm_ord2, ParEspIdS, ParFMVMin, ParFMVMax, ParFMVal2, ParFasPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCAPFM2")
         ,new ForEachCursor("P008544", "SELECT FasCodM, ProCod, ArtCod, CliCod, EmprCod, MaqAncA, MaqCodC FROM TXPPFSMQA WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008545", "INSERT INTO TXPPFSMQA(EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPFSMQA")
         ,new ForEachCursor("P008546", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA, Itm_ord4, ParObsX, ParValX, Cod_parX FROM TXPPFSMAC WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? and MaqCodC = ? and MaqAncA = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA, Cod_parX ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008547", "INSERT INTO TXPPFSMAC(EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, MaqAncA, Cod_parX, ParValX, ParObsX, Itm_ord4) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPFSMAC")
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 10);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 10);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(21, 6);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((byte[]) buf[40])[0] = rslt.getByte(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 4);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 4);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 4);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((short[]) buf[50])[0] = rslt.getShort(28);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((short[]) buf[52])[0] = rslt.getShort(29);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((short[]) buf[54])[0] = rslt.getShort(30);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(31, 4);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(32, 4);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(33, 4);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((short[]) buf[62])[0] = rslt.getShort(34);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((short[]) buf[64])[0] = rslt.getShort(35);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(37, 60);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(38, 40);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((short[]) buf[72])[0] = rslt.getShort(39);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(40);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(41, 16);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(42, 3);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((short[]) buf[80])[0] = rslt.getShort(43);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(44,2);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[84])[0] = rslt.getBigDecimal(45,2);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((short[]) buf[86])[0] = rslt.getShort(46);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((short[]) buf[88])[0] = rslt.getShort(47);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((short[]) buf[90])[0] = rslt.getShort(48);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((short[]) buf[92])[0] = rslt.getShort(49);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((short[]) buf[94])[0] = rslt.getShort(50);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((short[]) buf[96])[0] = rslt.getShort(51);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((short[]) buf[98])[0] = rslt.getShort(52);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[100])[0] = rslt.getBigDecimal(53,2);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[102])[0] = rslt.getGXDate(54);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getString(55, 8);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[106])[0] = rslt.getGXDate(56);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((short[]) buf[108])[0] = rslt.getShort(57);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((short[]) buf[110])[0] = rslt.getShort(58);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[112])[0] = rslt.getBigDecimal(59,2);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[114])[0] = rslt.getBigDecimal(60,2);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[116])[0] = rslt.getBigDecimal(61,2);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((short[]) buf[118])[0] = rslt.getShort(62);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((short[]) buf[120])[0] = rslt.getShort(63);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((short[]) buf[122])[0] = rslt.getShort(64);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((short[]) buf[124])[0] = rslt.getShort(65);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((short[]) buf[126])[0] = rslt.getShort(66);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((short[]) buf[128])[0] = rslt.getShort(67);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[130])[0] = rslt.getBigDecimal(68,2);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getString(69, 1);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getString(70, 1);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getString(71, 10);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((String[]) buf[138])[0] = rslt.getString(72, 4);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((byte[]) buf[140])[0] = rslt.getByte(73);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((short[]) buf[142])[0] = rslt.getShort(74);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[144])[0] = rslt.getBigDecimal(75,2);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[146])[0] = rslt.getBigDecimal(76,2);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[148])[0] = rslt.getBigDecimal(77,2);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[150])[0] = rslt.getBigDecimal(78,2);
               ((boolean[]) buf[151])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[152])[0] = rslt.getBigDecimal(79,2);
               ((boolean[]) buf[153])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[154])[0] = rslt.getBigDecimal(80,2);
               ((boolean[]) buf[155])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[156])[0] = rslt.getBigDecimal(81,2);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((String[]) buf[158])[0] = rslt.getVarchar(82);
               ((boolean[]) buf[159])[0] = rslt.wasNull();
               ((byte[]) buf[160])[0] = rslt.getByte(83);
               ((boolean[]) buf[161])[0] = rslt.wasNull();
               ((String[]) buf[162])[0] = rslt.getString(84, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 10);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 10);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 30);
               ((String[]) buf[15])[0] = rslt.getString(15, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(17);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(19, 26);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(21);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(22);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(23);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(24);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((short[]) buf[35])[0] = rslt.getShort(25);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(26);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(27);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(28);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(34);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(35);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(36);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(38);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(39);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 40);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(19);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 28);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((short[]) buf[9])[0] = rslt.getShort(8);
               return;
            case 29 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 20);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(18);
               ((int[]) buf[32])[0] = rslt.getInt(19);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 40);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(19);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((String[]) buf[13])[0] = rslt.getVarchar(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 8);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
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
               stmt.setString(3, (String)parms[2], 16);
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
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[12]).intValue());
               }
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               stmt.setShort(11, ((Number) parms[14]).shortValue());
               stmt.setShort(12, ((Number) parms[15]).shortValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[16], 2);
               stmt.setShort(14, ((Number) parms[17]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setString(8, (String)parms[7], 60);
               stmt.setString(9, (String)parms[8], 12);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 12);
               stmt.setString(12, (String)parms[11], 12);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 40);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 13);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 40);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 20);
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
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(14, (String)parms[23]);
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
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[27], 20);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[29], 200);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[31], 30);
               }
               stmt.setString(19, (String)parms[32], 30);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 5);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 5);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 6);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[12]).intValue());
               }
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               stmt.setShort(11, ((Number) parms[14]).shortValue());
               stmt.setShort(12, ((Number) parms[15]).shortValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[16], 2);
               stmt.setShort(14, ((Number) parms[17]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setString(8, (String)parms[7], 60);
               stmt.setString(9, (String)parms[8], 12);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 12);
               stmt.setString(12, (String)parms[11], 12);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 28);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[10], 400);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[9], 60);
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
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
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[73], 10);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(40, ((Number) parms[75]).shortValue());
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
                  stmt.setNull( 44 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(44, (java.math.BigDecimal)parms[83], 2);
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
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[89], 30);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(48, (String)parms[91]);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(49, ((Number) parms[93]).shortValue());
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(50, ((Number) parms[95]).shortValue());
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(51, ((Number) parms[97]).shortValue());
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(52, ((Number) parms[99]).shortValue());
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(53, ((Number) parms[101]).shortValue());
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
                  stmt.setNull( 55 , Types.DATE );
               }
               else
               {
                  stmt.setDate(55, (java.util.Date)parms[105]);
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
                  stmt.setNull( 57 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(57, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(58, (String)parms[111], 8);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.DATE );
               }
               else
               {
                  stmt.setDate(59, (java.util.Date)parms[113]);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.DATE );
               }
               else
               {
                  stmt.setDate(60, (java.util.Date)parms[115]);
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[117], 8);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(62, ((Number) parms[119]).shortValue());
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(63, ((Number) parms[121]).shortValue());
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(64, (String)parms[123], 3);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(65, (String)parms[125], 16);
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(66, ((Number) parms[127]).shortValue());
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(67, ((Number) parms[129]).shortValue());
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(68, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(69, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(70, (java.math.BigDecimal)parms[135], 2);
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
                  stmt.setNull( 73 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(73, ((Number) parms[141]).shortValue());
               }
               if ( ((Boolean) parms[142]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(74, ((Number) parms[143]).shortValue());
               }
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(75, (java.math.BigDecimal)parms[145], 2);
               }
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(76, (String)parms[147], 1);
               }
               if ( ((Boolean) parms[148]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(77, (String)parms[149], 1);
               }
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(78, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Boolean) parms[152]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(79, ((Number) parms[153]).byteValue());
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
                  stmt.setNull( 82 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(82, (java.math.BigDecimal)parms[159], 2);
               }
               if ( ((Boolean) parms[160]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(83, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Boolean) parms[162]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(84, (java.math.BigDecimal)parms[163], 2);
               }
               stmt.setString(85, (String)parms[164], 1);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 40);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 13);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 40);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 20);
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
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(14, (String)parms[23]);
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
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[27], 20);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[29], 200);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[31], 30);
               }
               stmt.setString(19, (String)parms[32], 30);
               return;
            case 33 :
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
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[73], 10);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(40, ((Number) parms[75]).shortValue());
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
                  stmt.setNull( 44 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(44, (java.math.BigDecimal)parms[83], 2);
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
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(46, ((Number) parms[87]).byteValue());
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[89]).shortValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[91], 4);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(49, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[95], 30);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(51, (String)parms[97]);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(52, ((Number) parms[99]).shortValue());
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(53, ((Number) parms[101]).shortValue());
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
                  stmt.setNull( 58 , Types.DATE );
               }
               else
               {
                  stmt.setDate(58, (java.util.Date)parms[111]);
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
                  stmt.setString(61, (String)parms[117], 8);
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
                  stmt.setNull( 63 , Types.DATE );
               }
               else
               {
                  stmt.setDate(63, (java.util.Date)parms[121]);
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(64, (String)parms[123], 8);
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
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(66, ((Number) parms[127]).shortValue());
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(67, (String)parms[129], 3);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(68, (String)parms[131], 16);
               }
               if ( ((Boolean) parms[132]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(69, ((Number) parms[133]).shortValue());
               }
               if ( ((Boolean) parms[134]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(70, ((Number) parms[135]).shortValue());
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(71, (java.math.BigDecimal)parms[137], 2);
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(72, (java.math.BigDecimal)parms[139], 2);
               }
               if ( ((Boolean) parms[140]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(73, (java.math.BigDecimal)parms[141], 2);
               }
               if ( ((Boolean) parms[142]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(74, ((Number) parms[143]).shortValue());
               }
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(75, ((Number) parms[145]).shortValue());
               }
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 76 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(76, ((Number) parms[147]).shortValue());
               }
               if ( ((Boolean) parms[148]).booleanValue() )
               {
                  stmt.setNull( 77 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(77, ((Number) parms[149]).shortValue());
               }
               if ( ((Boolean) parms[150]).booleanValue() )
               {
                  stmt.setNull( 78 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(78, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Boolean) parms[152]).booleanValue() )
               {
                  stmt.setNull( 79 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(79, (String)parms[153], 1);
               }
               if ( ((Boolean) parms[154]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(80, (String)parms[155], 1);
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
                  stmt.setNull( 82 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(82, (java.math.BigDecimal)parms[159], 2);
               }
               if ( ((Boolean) parms[160]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(83, ((Number) parms[161]).byteValue());
               }
               if ( ((Boolean) parms[162]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(84, (java.math.BigDecimal)parms[163], 2);
               }
               if ( ((Boolean) parms[164]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(85, (java.math.BigDecimal)parms[165], 2);
               }
               if ( ((Boolean) parms[166]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(86, (java.math.BigDecimal)parms[167], 2);
               }
               if ( ((Boolean) parms[168]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(87, (java.math.BigDecimal)parms[169], 2);
               }
               if ( ((Boolean) parms[170]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(88, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Boolean) parms[172]).booleanValue() )
               {
                  stmt.setNull( 89 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(89, (String)parms[173], 60);
               }
               stmt.setString(90, (String)parms[174], 1);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 40);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 13);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 40);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 20);
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
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(14, (String)parms[23]);
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
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[27], 20);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[29], 200);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[31], 30);
               }
               stmt.setString(19, (String)parms[32], 30);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 1);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 1);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 8);
               stmt.setVarchar(9, (String)parms[8], 400, false);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[11]).shortValue());
               }
               stmt.setString(12, (String)parms[12], 12);
               stmt.setString(13, (String)parms[13], 12);
               stmt.setString(14, (String)parms[14], 12);
               stmt.setVarchar(15, (String)parms[15], 100, false);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 8);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[11], 400);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[13]).shortValue());
               }
               return;
      }
   }

}

