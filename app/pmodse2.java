package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodse2 extends GXProcedure
{
   public pmodse2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodse2.class ), "" );
   }

   public pmodse2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 )
   {
      pmodse2.this.AV15EmprCod = aP0;
      pmodse2.this.AV16CliOri = aP1;
      pmodse2.this.AV17CliDes = aP2;
      pmodse2.this.AV18ArtOri = aP3;
      pmodse2.this.AV19ArtDes = aP4;
      pmodse2.this.AV60ArtDscDes = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV70DuSer0 = (byte)(0) ;
      GXv_int1[0] = AV70DuSer0 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "DUSER0", ""), GXv_int1) ;
      pmodse2.this.AV70DuSer0 = GXv_int1[0] ;
      GXv_int1[0] = AV72Moda21 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int1) ;
      pmodse2.this.AV72Moda21 = GXv_int1[0] ;
      GXv_char2[0] = AV106AuxEmprCod ;
      GXv_char3[0] = AV107AuxEmprNom ;
      GXv_char4[0] = AV65UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV63station, GXv_char2, GXv_char3, GXv_char4) ;
      pmodse2.this.AV106AuxEmprCod = GXv_char2[0] ;
      pmodse2.this.AV107AuxEmprNom = GXv_char3[0] ;
      pmodse2.this.AV65UsurCod = GXv_char4[0] ;
      /* Using cursor P031B2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16CliOri), AV18ArtOri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3072ArtObsLon = P031B2_A3072ArtObsLon[0] ;
         n3072ArtObsLon = P031B2_n3072ArtObsLon[0] ;
         A65ArtCod = P031B2_A65ArtCod[0] ;
         A252CliCod = P031B2_A252CliCod[0] ;
         A396EmprCod = P031B2_A396EmprCod[0] ;
         A69ArtDsc = P031B2_A69ArtDsc[0] ;
         n69ArtDsc = P031B2_n69ArtDsc[0] ;
         A87ArtMat = P031B2_A87ArtMat[0] ;
         n87ArtMat = P031B2_n87ArtMat[0] ;
         A829TipArtCod = P031B2_A829TipArtCod[0] ;
         A1148ArtPml = P031B2_A1148ArtPml[0] ;
         n1148ArtPml = P031B2_n1148ArtPml[0] ;
         A78ArtGraCru = P031B2_A78ArtGraCru[0] ;
         n78ArtGraCru = P031B2_n78ArtGraCru[0] ;
         A68ArtCruMin = P031B2_A68ArtCruMin[0] ;
         n68ArtCruMin = P031B2_n68ArtCruMin[0] ;
         A67ArtCruMax = P031B2_A67ArtCruMax[0] ;
         n67ArtCruMax = P031B2_n67ArtCruMax[0] ;
         A63ArtAcaMin = P031B2_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P031B2_n63ArtAcaMin[0] ;
         A62ArtAcaMax = P031B2_A62ArtAcaMax[0] ;
         n62ArtAcaMax = P031B2_n62ArtAcaMax[0] ;
         A95ArtRen = P031B2_A95ArtRen[0] ;
         n95ArtRen = P031B2_n95ArtRen[0] ;
         A101ArtTipPle = P031B2_A101ArtTipPle[0] ;
         n101ArtTipPle = P031B2_n101ArtTipPle[0] ;
         A2834ArtPle2 = P031B2_A2834ArtPle2[0] ;
         n2834ArtPle2 = P031B2_n2834ArtPle2[0] ;
         A100ArtTipLar = P031B2_A100ArtTipLar[0] ;
         n100ArtTipLar = P031B2_n100ArtTipLar[0] ;
         A66ArtCorOri = P031B2_A66ArtCorOri[0] ;
         n66ArtCorOri = P031B2_n66ArtCorOri[0] ;
         A70ArtEncOri = P031B2_A70ArtEncOri[0] ;
         n70ArtEncOri = P031B2_n70ArtEncOri[0] ;
         A96ArtSua = P031B2_A96ArtSua[0] ;
         n96ArtSua = P031B2_n96ArtSua[0] ;
         A64ArtAcaQui = P031B2_A64ArtAcaQui[0] ;
         n64ArtAcaQui = P031B2_n64ArtAcaQui[0] ;
         A73ArtEti = P031B2_A73ArtEti[0] ;
         n73ArtEti = P031B2_n73ArtEti[0] ;
         A117ArtUrg = P031B2_A117ArtUrg[0] ;
         n117ArtUrg = P031B2_n117ArtUrg[0] ;
         A88ArtMer = P031B2_A88ArtMer[0] ;
         n88ArtMer = P031B2_n88ArtMer[0] ;
         A105ArtTra1 = P031B2_A105ArtTra1[0] ;
         n105ArtTra1 = P031B2_n105ArtTra1[0] ;
         A106ArtTra2 = P031B2_A106ArtTra2[0] ;
         n106ArtTra2 = P031B2_n106ArtTra2[0] ;
         A107ArtTra3 = P031B2_A107ArtTra3[0] ;
         n107ArtTra3 = P031B2_n107ArtTra3[0] ;
         A108ArtTraP1 = P031B2_A108ArtTraP1[0] ;
         n108ArtTraP1 = P031B2_n108ArtTraP1[0] ;
         A109ArtTraP2 = P031B2_A109ArtTraP2[0] ;
         n109ArtTraP2 = P031B2_n109ArtTraP2[0] ;
         A110ArtTraP3 = P031B2_A110ArtTraP3[0] ;
         n110ArtTraP3 = P031B2_n110ArtTraP3[0] ;
         A111ArtUrd1 = P031B2_A111ArtUrd1[0] ;
         n111ArtUrd1 = P031B2_n111ArtUrd1[0] ;
         A112ArtUrd2 = P031B2_A112ArtUrd2[0] ;
         n112ArtUrd2 = P031B2_n112ArtUrd2[0] ;
         A113ArtUrd3 = P031B2_A113ArtUrd3[0] ;
         n113ArtUrd3 = P031B2_n113ArtUrd3[0] ;
         A114ArtUrdP1 = P031B2_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P031B2_n114ArtUrdP1[0] ;
         A115ArtUrdP2 = P031B2_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = P031B2_n115ArtUrdP2[0] ;
         A116ArtUrdP3 = P031B2_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = P031B2_n116ArtUrdP3[0] ;
         A89ArtObs = P031B2_A89ArtObs[0] ;
         n89ArtObs = P031B2_n89ArtObs[0] ;
         A90ArtObsFac = P031B2_A90ArtObsFac[0] ;
         n90ArtObsFac = P031B2_n90ArtObsFac[0] ;
         A1229ArtEncCom = P031B2_A1229ArtEncCom[0] ;
         n1229ArtEncCom = P031B2_n1229ArtEncCom[0] ;
         A1230ArtEncAnh = P031B2_A1230ArtEncAnh[0] ;
         n1230ArtEncAnh = P031B2_n1230ArtEncAnh[0] ;
         A2791ArtFacAbs = P031B2_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = P031B2_n2791ArtFacAbs[0] ;
         A5741ArtComer = P031B2_A5741ArtComer[0] ;
         n5741ArtComer = P031B2_n5741ArtComer[0] ;
         A5335ArtCodExt = P031B2_A5335ArtCodExt[0] ;
         n5335ArtCodExt = P031B2_n5335ArtCodExt[0] ;
         A1903ArtGraAca = P031B2_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P031B2_n1903ArtGraAca[0] ;
         A1905ArtRdoA = P031B2_A1905ArtRdoA[0] ;
         n1905ArtRdoA = P031B2_n1905ArtRdoA[0] ;
         A1904ArtRdoN = P031B2_A1904ArtRdoN[0] ;
         n1904ArtRdoN = P031B2_n1904ArtRdoN[0] ;
         A3121ArtNumCor = P031B2_A3121ArtNumCor[0] ;
         n3121ArtNumCor = P031B2_n3121ArtNumCor[0] ;
         A3122ArtAncSal1 = P031B2_A3122ArtAncSal1[0] ;
         n3122ArtAncSal1 = P031B2_n3122ArtAncSal1[0] ;
         A3123ArtAncSal2 = P031B2_A3123ArtAncSal2[0] ;
         n3123ArtAncSal2 = P031B2_n3123ArtAncSal2[0] ;
         A3124ArtAncSal3 = P031B2_A3124ArtAncSal3[0] ;
         n3124ArtAncSal3 = P031B2_n3124ArtAncSal3[0] ;
         A3125ArtGraAca2 = P031B2_A3125ArtGraAca2[0] ;
         n3125ArtGraAca2 = P031B2_n3125ArtGraAca2[0] ;
         A3126ArtGraCru2 = P031B2_A3126ArtGraCru2[0] ;
         n3126ArtGraCru2 = P031B2_n3126ArtGraCru2[0] ;
         A4295ClasCod = P031B2_A4295ClasCod[0] ;
         n4295ClasCod = P031B2_n4295ClasCod[0] ;
         A4297ArtPmPPza = P031B2_A4297ArtPmPPza[0] ;
         n4297ArtPmPPza = P031B2_n4297ArtPmPPza[0] ;
         A3683ArtFecCre = P031B2_A3683ArtFecCre[0] ;
         n3683ArtFecCre = P031B2_n3683ArtFecCre[0] ;
         A4353ArtUsrCod = P031B2_A4353ArtUsrCod[0] ;
         n4353ArtUsrCod = P031B2_n4353ArtUsrCod[0] ;
         A4354ArtFecMod = P031B2_A4354ArtFecMod[0] ;
         n4354ArtFecMod = P031B2_n4354ArtFecMod[0] ;
         A6106ClaTubCod = P031B2_A6106ClaTubCod[0] ;
         n6106ClaTubCod = P031B2_n6106ClaTubCod[0] ;
         A6108ClaBolCod = P031B2_A6108ClaBolCod[0] ;
         n6108ClaBolCod = P031B2_n6108ClaBolCod[0] ;
         A6435ArtRdoCru1 = P031B2_A6435ArtRdoCru1[0] ;
         n6435ArtRdoCru1 = P031B2_n6435ArtRdoCru1[0] ;
         A6436ArtRdoCru2 = P031B2_A6436ArtRdoCru2[0] ;
         n6436ArtRdoCru2 = P031B2_n6436ArtRdoCru2[0] ;
         A967ArtNMtr = P031B2_A967ArtNMtr[0] ;
         n967ArtNMtr = P031B2_n967ArtNMtr[0] ;
         A6462ArtLu = P031B2_A6462ArtLu[0] ;
         n6462ArtLu = P031B2_n6462ArtLu[0] ;
         A4607ArtRb = P031B2_A4607ArtRb[0] ;
         n4607ArtRb = P031B2_n4607ArtRb[0] ;
         A4444ArtPelAnh = P031B2_A4444ArtPelAnh[0] ;
         n4444ArtPelAnh = P031B2_n4444ArtPelAnh[0] ;
         A7412Artgrm2Sc = P031B2_A7412Artgrm2Sc[0] ;
         n7412Artgrm2Sc = P031B2_n7412Artgrm2Sc[0] ;
         A7413ArtPmlSc = P031B2_A7413ArtPmlSc[0] ;
         n7413ArtPmlSc = P031B2_n7413ArtPmlSc[0] ;
         A7414ArtAncSc = P031B2_A7414ArtAncSc[0] ;
         n7414ArtAncSc = P031B2_n7414ArtAncSc[0] ;
         A7415ArtPmlCru = P031B2_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = P031B2_n7415ArtPmlCru[0] ;
         A7777ArtRdtSc = P031B2_A7777ArtRdtSc[0] ;
         n7777ArtRdtSc = P031B2_n7777ArtRdtSc[0] ;
         A7778ArtUnd = P031B2_A7778ArtUnd[0] ;
         n7778ArtUnd = P031B2_n7778ArtUnd[0] ;
         A7779ArtBlo = P031B2_A7779ArtBlo[0] ;
         n7779ArtBlo = P031B2_n7779ArtBlo[0] ;
         A9801ArtFabsT = P031B2_A9801ArtFabsT[0] ;
         n9801ArtFabsT = P031B2_n9801ArtFabsT[0] ;
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
         AV62ArtFacAbs = A2791ArtFacAbs ;
         AV69ArtComer = A5741ArtComer ;
         AV73ArtCodExt = A5335ArtCodExt ;
         AV74ArtGraAca = A1903ArtGraAca ;
         AV75ArtRdoA = A1905ArtRdoA ;
         AV76ArtRdoN = A1904ArtRdoN ;
         AV78ArtNumCor = A3121ArtNumCor ;
         AV79ArtAncSal1 = A3122ArtAncSal1 ;
         AV80ArtAncSal2 = A3123ArtAncSal2 ;
         AV81ArtAncSal3 = A3124ArtAncSal3 ;
         AV104ArtGraAca2 = A3125ArtGraAca2 ;
         AV83ArtGraCru2 = A3126ArtGraCru2 ;
         AV84ClasCod = A4295ClasCod ;
         AV85ArtPmPPza = A4297ArtPmPPza ;
         AV86ArtFecCre = A3683ArtFecCre ;
         AV87ArtUsrCod = A4353ArtUsrCod ;
         AV88ArtFecMod = A4354ArtFecMod ;
         AV89ClaTubCod = A6106ClaTubCod ;
         AV90ClaBolCod = A6108ClaBolCod ;
         AV91ArtRdoCru1 = A6435ArtRdoCru1 ;
         AV92ArtRdoCru2 = A6436ArtRdoCru2 ;
         AV93ArtNMtr = A967ArtNMtr ;
         AV94ArtLu = A6462ArtLu ;
         AV95ArtRb = A4607ArtRb ;
         AV96ArtPelAnh = A4444ArtPelAnh ;
         AV97Artgrm2Sc = A7412Artgrm2Sc ;
         AV98ArtPmlSc = A7413ArtPmlSc ;
         AV99ArtAncSc = A7414ArtAncSc ;
         AV100ArtPmlCru = A7415ArtPmlCru ;
         AV101ArtRdtSc = A7777ArtRdtSc ;
         AV102ArtUnd = A7778ArtUnd ;
         AV103ArtBlo = A7779ArtBlo ;
         AV105Artfabst = A9801ArtFabsT ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P031B3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV17CliDes), AV19ArtDes});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A3072ArtObsLon = P031B3_A3072ArtObsLon[0] ;
         n3072ArtObsLon = P031B3_n3072ArtObsLon[0] ;
         A65ArtCod = P031B3_A65ArtCod[0] ;
         A252CliCod = P031B3_A252CliCod[0] ;
         A396EmprCod = P031B3_A396EmprCod[0] ;
         A87ArtMat = P031B3_A87ArtMat[0] ;
         n87ArtMat = P031B3_n87ArtMat[0] ;
         A829TipArtCod = P031B3_A829TipArtCod[0] ;
         A69ArtDsc = P031B3_A69ArtDsc[0] ;
         n69ArtDsc = P031B3_n69ArtDsc[0] ;
         A1148ArtPml = P031B3_A1148ArtPml[0] ;
         n1148ArtPml = P031B3_n1148ArtPml[0] ;
         A78ArtGraCru = P031B3_A78ArtGraCru[0] ;
         n78ArtGraCru = P031B3_n78ArtGraCru[0] ;
         A68ArtCruMin = P031B3_A68ArtCruMin[0] ;
         n68ArtCruMin = P031B3_n68ArtCruMin[0] ;
         A67ArtCruMax = P031B3_A67ArtCruMax[0] ;
         n67ArtCruMax = P031B3_n67ArtCruMax[0] ;
         A63ArtAcaMin = P031B3_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P031B3_n63ArtAcaMin[0] ;
         A62ArtAcaMax = P031B3_A62ArtAcaMax[0] ;
         n62ArtAcaMax = P031B3_n62ArtAcaMax[0] ;
         A95ArtRen = P031B3_A95ArtRen[0] ;
         n95ArtRen = P031B3_n95ArtRen[0] ;
         A101ArtTipPle = P031B3_A101ArtTipPle[0] ;
         n101ArtTipPle = P031B3_n101ArtTipPle[0] ;
         A2834ArtPle2 = P031B3_A2834ArtPle2[0] ;
         n2834ArtPle2 = P031B3_n2834ArtPle2[0] ;
         A100ArtTipLar = P031B3_A100ArtTipLar[0] ;
         n100ArtTipLar = P031B3_n100ArtTipLar[0] ;
         A66ArtCorOri = P031B3_A66ArtCorOri[0] ;
         n66ArtCorOri = P031B3_n66ArtCorOri[0] ;
         A70ArtEncOri = P031B3_A70ArtEncOri[0] ;
         n70ArtEncOri = P031B3_n70ArtEncOri[0] ;
         A96ArtSua = P031B3_A96ArtSua[0] ;
         n96ArtSua = P031B3_n96ArtSua[0] ;
         A64ArtAcaQui = P031B3_A64ArtAcaQui[0] ;
         n64ArtAcaQui = P031B3_n64ArtAcaQui[0] ;
         A73ArtEti = P031B3_A73ArtEti[0] ;
         n73ArtEti = P031B3_n73ArtEti[0] ;
         A117ArtUrg = P031B3_A117ArtUrg[0] ;
         n117ArtUrg = P031B3_n117ArtUrg[0] ;
         A88ArtMer = P031B3_A88ArtMer[0] ;
         n88ArtMer = P031B3_n88ArtMer[0] ;
         A105ArtTra1 = P031B3_A105ArtTra1[0] ;
         n105ArtTra1 = P031B3_n105ArtTra1[0] ;
         A106ArtTra2 = P031B3_A106ArtTra2[0] ;
         n106ArtTra2 = P031B3_n106ArtTra2[0] ;
         A107ArtTra3 = P031B3_A107ArtTra3[0] ;
         n107ArtTra3 = P031B3_n107ArtTra3[0] ;
         A108ArtTraP1 = P031B3_A108ArtTraP1[0] ;
         n108ArtTraP1 = P031B3_n108ArtTraP1[0] ;
         A109ArtTraP2 = P031B3_A109ArtTraP2[0] ;
         n109ArtTraP2 = P031B3_n109ArtTraP2[0] ;
         A110ArtTraP3 = P031B3_A110ArtTraP3[0] ;
         n110ArtTraP3 = P031B3_n110ArtTraP3[0] ;
         A111ArtUrd1 = P031B3_A111ArtUrd1[0] ;
         n111ArtUrd1 = P031B3_n111ArtUrd1[0] ;
         A112ArtUrd2 = P031B3_A112ArtUrd2[0] ;
         n112ArtUrd2 = P031B3_n112ArtUrd2[0] ;
         A113ArtUrd3 = P031B3_A113ArtUrd3[0] ;
         n113ArtUrd3 = P031B3_n113ArtUrd3[0] ;
         A114ArtUrdP1 = P031B3_A114ArtUrdP1[0] ;
         n114ArtUrdP1 = P031B3_n114ArtUrdP1[0] ;
         A115ArtUrdP2 = P031B3_A115ArtUrdP2[0] ;
         n115ArtUrdP2 = P031B3_n115ArtUrdP2[0] ;
         A116ArtUrdP3 = P031B3_A116ArtUrdP3[0] ;
         n116ArtUrdP3 = P031B3_n116ArtUrdP3[0] ;
         A89ArtObs = P031B3_A89ArtObs[0] ;
         n89ArtObs = P031B3_n89ArtObs[0] ;
         A90ArtObsFac = P031B3_A90ArtObsFac[0] ;
         n90ArtObsFac = P031B3_n90ArtObsFac[0] ;
         A1229ArtEncCom = P031B3_A1229ArtEncCom[0] ;
         n1229ArtEncCom = P031B3_n1229ArtEncCom[0] ;
         A1230ArtEncAnh = P031B3_A1230ArtEncAnh[0] ;
         n1230ArtEncAnh = P031B3_n1230ArtEncAnh[0] ;
         A2791ArtFacAbs = P031B3_A2791ArtFacAbs[0] ;
         n2791ArtFacAbs = P031B3_n2791ArtFacAbs[0] ;
         A3683ArtFecCre = P031B3_A3683ArtFecCre[0] ;
         n3683ArtFecCre = P031B3_n3683ArtFecCre[0] ;
         A4353ArtUsrCod = P031B3_A4353ArtUsrCod[0] ;
         n4353ArtUsrCod = P031B3_n4353ArtUsrCod[0] ;
         A5741ArtComer = P031B3_A5741ArtComer[0] ;
         n5741ArtComer = P031B3_n5741ArtComer[0] ;
         A5335ArtCodExt = P031B3_A5335ArtCodExt[0] ;
         n5335ArtCodExt = P031B3_n5335ArtCodExt[0] ;
         A1903ArtGraAca = P031B3_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P031B3_n1903ArtGraAca[0] ;
         A1905ArtRdoA = P031B3_A1905ArtRdoA[0] ;
         n1905ArtRdoA = P031B3_n1905ArtRdoA[0] ;
         A1904ArtRdoN = P031B3_A1904ArtRdoN[0] ;
         n1904ArtRdoN = P031B3_n1904ArtRdoN[0] ;
         A3121ArtNumCor = P031B3_A3121ArtNumCor[0] ;
         n3121ArtNumCor = P031B3_n3121ArtNumCor[0] ;
         A3122ArtAncSal1 = P031B3_A3122ArtAncSal1[0] ;
         n3122ArtAncSal1 = P031B3_n3122ArtAncSal1[0] ;
         A3123ArtAncSal2 = P031B3_A3123ArtAncSal2[0] ;
         n3123ArtAncSal2 = P031B3_n3123ArtAncSal2[0] ;
         A3124ArtAncSal3 = P031B3_A3124ArtAncSal3[0] ;
         n3124ArtAncSal3 = P031B3_n3124ArtAncSal3[0] ;
         A3125ArtGraAca2 = P031B3_A3125ArtGraAca2[0] ;
         n3125ArtGraAca2 = P031B3_n3125ArtGraAca2[0] ;
         A3126ArtGraCru2 = P031B3_A3126ArtGraCru2[0] ;
         n3126ArtGraCru2 = P031B3_n3126ArtGraCru2[0] ;
         A4295ClasCod = P031B3_A4295ClasCod[0] ;
         n4295ClasCod = P031B3_n4295ClasCod[0] ;
         A4297ArtPmPPza = P031B3_A4297ArtPmPPza[0] ;
         n4297ArtPmPPza = P031B3_n4297ArtPmPPza[0] ;
         A4354ArtFecMod = P031B3_A4354ArtFecMod[0] ;
         n4354ArtFecMod = P031B3_n4354ArtFecMod[0] ;
         A6106ClaTubCod = P031B3_A6106ClaTubCod[0] ;
         n6106ClaTubCod = P031B3_n6106ClaTubCod[0] ;
         A6108ClaBolCod = P031B3_A6108ClaBolCod[0] ;
         n6108ClaBolCod = P031B3_n6108ClaBolCod[0] ;
         A6435ArtRdoCru1 = P031B3_A6435ArtRdoCru1[0] ;
         n6435ArtRdoCru1 = P031B3_n6435ArtRdoCru1[0] ;
         A6436ArtRdoCru2 = P031B3_A6436ArtRdoCru2[0] ;
         n6436ArtRdoCru2 = P031B3_n6436ArtRdoCru2[0] ;
         A967ArtNMtr = P031B3_A967ArtNMtr[0] ;
         n967ArtNMtr = P031B3_n967ArtNMtr[0] ;
         A6462ArtLu = P031B3_A6462ArtLu[0] ;
         n6462ArtLu = P031B3_n6462ArtLu[0] ;
         A4607ArtRb = P031B3_A4607ArtRb[0] ;
         n4607ArtRb = P031B3_n4607ArtRb[0] ;
         A4444ArtPelAnh = P031B3_A4444ArtPelAnh[0] ;
         n4444ArtPelAnh = P031B3_n4444ArtPelAnh[0] ;
         A7412Artgrm2Sc = P031B3_A7412Artgrm2Sc[0] ;
         n7412Artgrm2Sc = P031B3_n7412Artgrm2Sc[0] ;
         A7413ArtPmlSc = P031B3_A7413ArtPmlSc[0] ;
         n7413ArtPmlSc = P031B3_n7413ArtPmlSc[0] ;
         A7414ArtAncSc = P031B3_A7414ArtAncSc[0] ;
         n7414ArtAncSc = P031B3_n7414ArtAncSc[0] ;
         A7415ArtPmlCru = P031B3_A7415ArtPmlCru[0] ;
         n7415ArtPmlCru = P031B3_n7415ArtPmlCru[0] ;
         A7777ArtRdtSc = P031B3_A7777ArtRdtSc[0] ;
         n7777ArtRdtSc = P031B3_n7777ArtRdtSc[0] ;
         A7778ArtUnd = P031B3_A7778ArtUnd[0] ;
         n7778ArtUnd = P031B3_n7778ArtUnd[0] ;
         A7779ArtBlo = P031B3_A7779ArtBlo[0] ;
         n7779ArtBlo = P031B3_n7779ArtBlo[0] ;
         A91ArtPreDef = P031B3_A91ArtPreDef[0] ;
         n91ArtPreDef = P031B3_n91ArtPreDef[0] ;
         A92ArtPreKgm = P031B3_A92ArtPreKgm[0] ;
         n92ArtPreKgm = P031B3_n92ArtPreKgm[0] ;
         A93ArtPreMtr = P031B3_A93ArtPreMtr[0] ;
         n93ArtPreMtr = P031B3_n93ArtPreMtr[0] ;
         A4351ArtPreUlAc = P031B3_A4351ArtPreUlAc[0] ;
         n4351ArtPreUlAc = P031B3_n4351ArtPreUlAc[0] ;
         A4352ArtPreUsrM = P031B3_A4352ArtPreUsrM[0] ;
         n4352ArtPreUsrM = P031B3_n4352ArtPreUsrM[0] ;
         A9801ArtFabsT = P031B3_A9801ArtFabsT[0] ;
         n9801ArtFabsT = P031B3_n9801ArtFabsT[0] ;
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
         A3121ArtNumCor = AV78ArtNumCor ;
         n3121ArtNumCor = false ;
         A3122ArtAncSal1 = AV79ArtAncSal1 ;
         n3122ArtAncSal1 = false ;
         A3123ArtAncSal2 = AV80ArtAncSal2 ;
         n3123ArtAncSal2 = false ;
         A3124ArtAncSal3 = AV81ArtAncSal3 ;
         n3124ArtAncSal3 = false ;
         A3125ArtGraAca2 = AV104ArtGraAca2 ;
         n3125ArtGraAca2 = false ;
         A3126ArtGraCru2 = AV83ArtGraCru2 ;
         n3126ArtGraCru2 = false ;
         A4295ClasCod = AV84ClasCod ;
         n4295ClasCod = false ;
         A4297ArtPmPPza = AV85ArtPmPPza ;
         n4297ArtPmPPza = false ;
         A3683ArtFecCre = AV86ArtFecCre ;
         n3683ArtFecCre = false ;
         A4353ArtUsrCod = AV87ArtUsrCod ;
         n4353ArtUsrCod = false ;
         A4354ArtFecMod = AV88ArtFecMod ;
         n4354ArtFecMod = false ;
         A6106ClaTubCod = AV89ClaTubCod ;
         n6106ClaTubCod = false ;
         A6108ClaBolCod = AV90ClaBolCod ;
         n6108ClaBolCod = false ;
         A6435ArtRdoCru1 = AV91ArtRdoCru1 ;
         n6435ArtRdoCru1 = false ;
         A6436ArtRdoCru2 = AV92ArtRdoCru2 ;
         n6436ArtRdoCru2 = false ;
         A967ArtNMtr = AV93ArtNMtr ;
         n967ArtNMtr = false ;
         A6462ArtLu = AV94ArtLu ;
         n6462ArtLu = false ;
         A4607ArtRb = AV95ArtRb ;
         n4607ArtRb = false ;
         A4444ArtPelAnh = AV96ArtPelAnh ;
         n4444ArtPelAnh = false ;
         A7412Artgrm2Sc = AV97Artgrm2Sc ;
         n7412Artgrm2Sc = false ;
         A7413ArtPmlSc = AV98ArtPmlSc ;
         n7413ArtPmlSc = false ;
         A7414ArtAncSc = AV99ArtAncSc ;
         n7414ArtAncSc = false ;
         A7415ArtPmlCru = AV100ArtPmlCru ;
         n7415ArtPmlCru = false ;
         A7777ArtRdtSc = AV101ArtRdtSc ;
         n7777ArtRdtSc = false ;
         A7778ArtUnd = AV102ArtUnd ;
         n7778ArtUnd = false ;
         A7779ArtBlo = AV103ArtBlo ;
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
         A9801ArtFabsT = AV105Artfabst ;
         n9801ArtFabsT = false ;
         /* Using cursor P031B4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n87ArtMat), A87ArtMat, Short.valueOf(A829TipArtCod), Boolean.valueOf(n69ArtDsc), A69ArtDsc, Boolean.valueOf(n1148ArtPml), Short.valueOf(A1148ArtPml), Boolean.valueOf(n78ArtGraCru), Short.valueOf(A78ArtGraCru), Boolean.valueOf(n68ArtCruMin), Short.valueOf(A68ArtCruMin), Boolean.valueOf(n67ArtCruMax), Short.valueOf(A67ArtCruMax), Boolean.valueOf(n63ArtAcaMin), Short.valueOf(A63ArtAcaMin), Boolean.valueOf(n62ArtAcaMax), Short.valueOf(A62ArtAcaMax), Boolean.valueOf(n95ArtRen), A95ArtRen, Boolean.valueOf(n101ArtTipPle), A101ArtTipPle, Boolean.valueOf(n2834ArtPle2), A2834ArtPle2, Boolean.valueOf(n100ArtTipLar), A100ArtTipLar, Boolean.valueOf(n66ArtCorOri), A66ArtCorOri, Boolean.valueOf(n70ArtEncOri), A70ArtEncOri, Boolean.valueOf(n96ArtSua), A96ArtSua, Boolean.valueOf(n64ArtAcaQui), A64ArtAcaQui, Boolean.valueOf(n73ArtEti), A73ArtEti, Boolean.valueOf(n117ArtUrg), Byte.valueOf(A117ArtUrg), Boolean.valueOf(n88ArtMer), A88ArtMer, Boolean.valueOf(n105ArtTra1), A105ArtTra1, Boolean.valueOf(n106ArtTra2), A106ArtTra2, Boolean.valueOf(n107ArtTra3), A107ArtTra3, Boolean.valueOf(n108ArtTraP1), Short.valueOf(A108ArtTraP1), Boolean.valueOf(n109ArtTraP2), Short.valueOf(A109ArtTraP2), Boolean.valueOf(n110ArtTraP3), Short.valueOf(A110ArtTraP3), Boolean.valueOf(n111ArtUrd1), A111ArtUrd1, Boolean.valueOf(n112ArtUrd2), A112ArtUrd2, Boolean.valueOf(n113ArtUrd3), A113ArtUrd3, Boolean.valueOf(n114ArtUrdP1), Short.valueOf(A114ArtUrdP1), Boolean.valueOf(n115ArtUrdP2), Short.valueOf(A115ArtUrdP2), Boolean.valueOf(n116ArtUrdP3), Short.valueOf(A116ArtUrdP3), Boolean.valueOf(n89ArtObs), A89ArtObs, Boolean.valueOf(n3072ArtObsLon), A3072ArtObsLon, Boolean.valueOf(n90ArtObsFac), A90ArtObsFac, Boolean.valueOf(n1229ArtEncCom), Short.valueOf(A1229ArtEncCom), Boolean.valueOf(n1230ArtEncAnh), Short.valueOf(A1230ArtEncAnh), Boolean.valueOf(n2791ArtFacAbs), A2791ArtFacAbs, Boolean.valueOf(n3683ArtFecCre), A3683ArtFecCre, Boolean.valueOf(n4353ArtUsrCod), A4353ArtUsrCod, Boolean.valueOf(n5741ArtComer), A5741ArtComer, Boolean.valueOf(n5335ArtCodExt), A5335ArtCodExt, Boolean.valueOf(n1903ArtGraAca), Short.valueOf(A1903ArtGraAca), Boolean.valueOf(n1905ArtRdoA), A1905ArtRdoA, Boolean.valueOf(n1904ArtRdoN), A1904ArtRdoN, Boolean.valueOf(n3121ArtNumCor), Short.valueOf(A3121ArtNumCor), Boolean.valueOf(n3122ArtAncSal1), Short.valueOf(A3122ArtAncSal1), Boolean.valueOf(n3123ArtAncSal2), Short.valueOf(A3123ArtAncSal2), Boolean.valueOf(n3124ArtAncSal3), Short.valueOf(A3124ArtAncSal3), Boolean.valueOf(n3125ArtGraAca2), Short.valueOf(A3125ArtGraAca2), Boolean.valueOf(n3126ArtGraCru2), Short.valueOf(A3126ArtGraCru2), Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod), Boolean.valueOf(n4297ArtPmPPza), A4297ArtPmPPza, Boolean.valueOf(n4354ArtFecMod), A4354ArtFecMod, Boolean.valueOf(n6106ClaTubCod), Short.valueOf(A6106ClaTubCod), Boolean.valueOf(n6108ClaBolCod), Short.valueOf(A6108ClaBolCod), Boolean.valueOf(n6435ArtRdoCru1), A6435ArtRdoCru1, Boolean.valueOf(n6436ArtRdoCru2), A6436ArtRdoCru2, Boolean.valueOf(n967ArtNMtr), A967ArtNMtr, Boolean.valueOf(n6462ArtLu), A6462ArtLu, Boolean.valueOf(n4607ArtRb), Short.valueOf(A4607ArtRb), Boolean.valueOf(n4444ArtPelAnh),
         Short.valueOf(A4444ArtPelAnh), Boolean.valueOf(n7412Artgrm2Sc), Short.valueOf(A7412Artgrm2Sc), Boolean.valueOf(n7413ArtPmlSc), Short.valueOf(A7413ArtPmlSc), Boolean.valueOf(n7414ArtAncSc), Short.valueOf(A7414ArtAncSc), Boolean.valueOf(n7415ArtPmlCru), Short.valueOf(A7415ArtPmlCru), Boolean.valueOf(n7777ArtRdtSc), A7777ArtRdtSc, Boolean.valueOf(n7778ArtUnd), A7778ArtUnd, Boolean.valueOf(n7779ArtBlo), A7779ArtBlo, Boolean.valueOf(n91ArtPreDef), A91ArtPreDef, Boolean.valueOf(n92ArtPreKgm), A92ArtPreKgm, Boolean.valueOf(n93ArtPreMtr), A93ArtPreMtr, Boolean.valueOf(n4351ArtPreUlAc), A4351ArtPreUlAc, Boolean.valueOf(n4352ArtPreUsrM), A4352ArtPreUsrM, Boolean.valueOf(n9801ArtFabsT), A9801ArtFabsT, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      AV63station = "" ;
      AV106AuxEmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV107AuxEmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV65UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P031B2_A3072ArtObsLon = new String[] {""} ;
      P031B2_n3072ArtObsLon = new boolean[] {false} ;
      P031B2_A65ArtCod = new String[] {""} ;
      P031B2_A252CliCod = new int[1] ;
      P031B2_A396EmprCod = new String[] {""} ;
      P031B2_A69ArtDsc = new String[] {""} ;
      P031B2_n69ArtDsc = new boolean[] {false} ;
      P031B2_A87ArtMat = new String[] {""} ;
      P031B2_n87ArtMat = new boolean[] {false} ;
      P031B2_A829TipArtCod = new short[1] ;
      P031B2_A1148ArtPml = new short[1] ;
      P031B2_n1148ArtPml = new boolean[] {false} ;
      P031B2_A78ArtGraCru = new short[1] ;
      P031B2_n78ArtGraCru = new boolean[] {false} ;
      P031B2_A68ArtCruMin = new short[1] ;
      P031B2_n68ArtCruMin = new boolean[] {false} ;
      P031B2_A67ArtCruMax = new short[1] ;
      P031B2_n67ArtCruMax = new boolean[] {false} ;
      P031B2_A63ArtAcaMin = new short[1] ;
      P031B2_n63ArtAcaMin = new boolean[] {false} ;
      P031B2_A62ArtAcaMax = new short[1] ;
      P031B2_n62ArtAcaMax = new boolean[] {false} ;
      P031B2_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B2_n95ArtRen = new boolean[] {false} ;
      P031B2_A101ArtTipPle = new String[] {""} ;
      P031B2_n101ArtTipPle = new boolean[] {false} ;
      P031B2_A2834ArtPle2 = new String[] {""} ;
      P031B2_n2834ArtPle2 = new boolean[] {false} ;
      P031B2_A100ArtTipLar = new String[] {""} ;
      P031B2_n100ArtTipLar = new boolean[] {false} ;
      P031B2_A66ArtCorOri = new String[] {""} ;
      P031B2_n66ArtCorOri = new boolean[] {false} ;
      P031B2_A70ArtEncOri = new String[] {""} ;
      P031B2_n70ArtEncOri = new boolean[] {false} ;
      P031B2_A96ArtSua = new String[] {""} ;
      P031B2_n96ArtSua = new boolean[] {false} ;
      P031B2_A64ArtAcaQui = new String[] {""} ;
      P031B2_n64ArtAcaQui = new boolean[] {false} ;
      P031B2_A73ArtEti = new String[] {""} ;
      P031B2_n73ArtEti = new boolean[] {false} ;
      P031B2_A117ArtUrg = new byte[1] ;
      P031B2_n117ArtUrg = new boolean[] {false} ;
      P031B2_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B2_n88ArtMer = new boolean[] {false} ;
      P031B2_A105ArtTra1 = new String[] {""} ;
      P031B2_n105ArtTra1 = new boolean[] {false} ;
      P031B2_A106ArtTra2 = new String[] {""} ;
      P031B2_n106ArtTra2 = new boolean[] {false} ;
      P031B2_A107ArtTra3 = new String[] {""} ;
      P031B2_n107ArtTra3 = new boolean[] {false} ;
      P031B2_A108ArtTraP1 = new short[1] ;
      P031B2_n108ArtTraP1 = new boolean[] {false} ;
      P031B2_A109ArtTraP2 = new short[1] ;
      P031B2_n109ArtTraP2 = new boolean[] {false} ;
      P031B2_A110ArtTraP3 = new short[1] ;
      P031B2_n110ArtTraP3 = new boolean[] {false} ;
      P031B2_A111ArtUrd1 = new String[] {""} ;
      P031B2_n111ArtUrd1 = new boolean[] {false} ;
      P031B2_A112ArtUrd2 = new String[] {""} ;
      P031B2_n112ArtUrd2 = new boolean[] {false} ;
      P031B2_A113ArtUrd3 = new String[] {""} ;
      P031B2_n113ArtUrd3 = new boolean[] {false} ;
      P031B2_A114ArtUrdP1 = new short[1] ;
      P031B2_n114ArtUrdP1 = new boolean[] {false} ;
      P031B2_A115ArtUrdP2 = new short[1] ;
      P031B2_n115ArtUrdP2 = new boolean[] {false} ;
      P031B2_A116ArtUrdP3 = new short[1] ;
      P031B2_n116ArtUrdP3 = new boolean[] {false} ;
      P031B2_A89ArtObs = new String[] {""} ;
      P031B2_n89ArtObs = new boolean[] {false} ;
      P031B2_A90ArtObsFac = new String[] {""} ;
      P031B2_n90ArtObsFac = new boolean[] {false} ;
      P031B2_A1229ArtEncCom = new short[1] ;
      P031B2_n1229ArtEncCom = new boolean[] {false} ;
      P031B2_A1230ArtEncAnh = new short[1] ;
      P031B2_n1230ArtEncAnh = new boolean[] {false} ;
      P031B2_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B2_n2791ArtFacAbs = new boolean[] {false} ;
      P031B2_A5741ArtComer = new String[] {""} ;
      P031B2_n5741ArtComer = new boolean[] {false} ;
      P031B2_A5335ArtCodExt = new String[] {""} ;
      P031B2_n5335ArtCodExt = new boolean[] {false} ;
      P031B2_A1903ArtGraAca = new short[1] ;
      P031B2_n1903ArtGraAca = new boolean[] {false} ;
      P031B2_A1905ArtRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B2_n1905ArtRdoA = new boolean[] {false} ;
      P031B2_A1904ArtRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B2_n1904ArtRdoN = new boolean[] {false} ;
      P031B2_A3121ArtNumCor = new short[1] ;
      P031B2_n3121ArtNumCor = new boolean[] {false} ;
      P031B2_A3122ArtAncSal1 = new short[1] ;
      P031B2_n3122ArtAncSal1 = new boolean[] {false} ;
      P031B2_A3123ArtAncSal2 = new short[1] ;
      P031B2_n3123ArtAncSal2 = new boolean[] {false} ;
      P031B2_A3124ArtAncSal3 = new short[1] ;
      P031B2_n3124ArtAncSal3 = new boolean[] {false} ;
      P031B2_A3125ArtGraAca2 = new short[1] ;
      P031B2_n3125ArtGraAca2 = new boolean[] {false} ;
      P031B2_A3126ArtGraCru2 = new short[1] ;
      P031B2_n3126ArtGraCru2 = new boolean[] {false} ;
      P031B2_A4295ClasCod = new short[1] ;
      P031B2_n4295ClasCod = new boolean[] {false} ;
      P031B2_A4297ArtPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B2_n4297ArtPmPPza = new boolean[] {false} ;
      P031B2_A3683ArtFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      P031B2_n3683ArtFecCre = new boolean[] {false} ;
      P031B2_A4353ArtUsrCod = new String[] {""} ;
      P031B2_n4353ArtUsrCod = new boolean[] {false} ;
      P031B2_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P031B2_n4354ArtFecMod = new boolean[] {false} ;
      P031B2_A6106ClaTubCod = new short[1] ;
      P031B2_n6106ClaTubCod = new boolean[] {false} ;
      P031B2_A6108ClaBolCod = new short[1] ;
      P031B2_n6108ClaBolCod = new boolean[] {false} ;
      P031B2_A6435ArtRdoCru1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B2_n6435ArtRdoCru1 = new boolean[] {false} ;
      P031B2_A6436ArtRdoCru2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B2_n6436ArtRdoCru2 = new boolean[] {false} ;
      P031B2_A967ArtNMtr = new String[] {""} ;
      P031B2_n967ArtNMtr = new boolean[] {false} ;
      P031B2_A6462ArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B2_n6462ArtLu = new boolean[] {false} ;
      P031B2_A4607ArtRb = new short[1] ;
      P031B2_n4607ArtRb = new boolean[] {false} ;
      P031B2_A4444ArtPelAnh = new short[1] ;
      P031B2_n4444ArtPelAnh = new boolean[] {false} ;
      P031B2_A7412Artgrm2Sc = new short[1] ;
      P031B2_n7412Artgrm2Sc = new boolean[] {false} ;
      P031B2_A7413ArtPmlSc = new short[1] ;
      P031B2_n7413ArtPmlSc = new boolean[] {false} ;
      P031B2_A7414ArtAncSc = new short[1] ;
      P031B2_n7414ArtAncSc = new boolean[] {false} ;
      P031B2_A7415ArtPmlCru = new short[1] ;
      P031B2_n7415ArtPmlCru = new boolean[] {false} ;
      P031B2_A7777ArtRdtSc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B2_n7777ArtRdtSc = new boolean[] {false} ;
      P031B2_A7778ArtUnd = new String[] {""} ;
      P031B2_n7778ArtUnd = new boolean[] {false} ;
      P031B2_A7779ArtBlo = new String[] {""} ;
      P031B2_n7779ArtBlo = new boolean[] {false} ;
      P031B2_A9801ArtFabsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B2_n9801ArtFabsT = new boolean[] {false} ;
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
      A2791ArtFacAbs = DecimalUtil.ZERO ;
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
      A967ArtNMtr = "" ;
      A6462ArtLu = DecimalUtil.ZERO ;
      A7777ArtRdtSc = DecimalUtil.ZERO ;
      A7778ArtUnd = "" ;
      A7779ArtBlo = "" ;
      A9801ArtFabsT = DecimalUtil.ZERO ;
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
      AV62ArtFacAbs = DecimalUtil.ZERO ;
      AV69ArtComer = "" ;
      AV73ArtCodExt = "" ;
      AV75ArtRdoA = DecimalUtil.ZERO ;
      AV76ArtRdoN = DecimalUtil.ZERO ;
      AV85ArtPmPPza = DecimalUtil.ZERO ;
      AV86ArtFecCre = GXutil.nullDate() ;
      AV87ArtUsrCod = "" ;
      AV88ArtFecMod = GXutil.nullDate() ;
      AV91ArtRdoCru1 = DecimalUtil.ZERO ;
      AV92ArtRdoCru2 = DecimalUtil.ZERO ;
      AV93ArtNMtr = "" ;
      AV94ArtLu = DecimalUtil.ZERO ;
      AV101ArtRdtSc = DecimalUtil.ZERO ;
      AV102ArtUnd = "" ;
      AV103ArtBlo = "" ;
      AV105Artfabst = DecimalUtil.ZERO ;
      P031B3_A3072ArtObsLon = new String[] {""} ;
      P031B3_n3072ArtObsLon = new boolean[] {false} ;
      P031B3_A65ArtCod = new String[] {""} ;
      P031B3_A252CliCod = new int[1] ;
      P031B3_A396EmprCod = new String[] {""} ;
      P031B3_A87ArtMat = new String[] {""} ;
      P031B3_n87ArtMat = new boolean[] {false} ;
      P031B3_A829TipArtCod = new short[1] ;
      P031B3_A69ArtDsc = new String[] {""} ;
      P031B3_n69ArtDsc = new boolean[] {false} ;
      P031B3_A1148ArtPml = new short[1] ;
      P031B3_n1148ArtPml = new boolean[] {false} ;
      P031B3_A78ArtGraCru = new short[1] ;
      P031B3_n78ArtGraCru = new boolean[] {false} ;
      P031B3_A68ArtCruMin = new short[1] ;
      P031B3_n68ArtCruMin = new boolean[] {false} ;
      P031B3_A67ArtCruMax = new short[1] ;
      P031B3_n67ArtCruMax = new boolean[] {false} ;
      P031B3_A63ArtAcaMin = new short[1] ;
      P031B3_n63ArtAcaMin = new boolean[] {false} ;
      P031B3_A62ArtAcaMax = new short[1] ;
      P031B3_n62ArtAcaMax = new boolean[] {false} ;
      P031B3_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B3_n95ArtRen = new boolean[] {false} ;
      P031B3_A101ArtTipPle = new String[] {""} ;
      P031B3_n101ArtTipPle = new boolean[] {false} ;
      P031B3_A2834ArtPle2 = new String[] {""} ;
      P031B3_n2834ArtPle2 = new boolean[] {false} ;
      P031B3_A100ArtTipLar = new String[] {""} ;
      P031B3_n100ArtTipLar = new boolean[] {false} ;
      P031B3_A66ArtCorOri = new String[] {""} ;
      P031B3_n66ArtCorOri = new boolean[] {false} ;
      P031B3_A70ArtEncOri = new String[] {""} ;
      P031B3_n70ArtEncOri = new boolean[] {false} ;
      P031B3_A96ArtSua = new String[] {""} ;
      P031B3_n96ArtSua = new boolean[] {false} ;
      P031B3_A64ArtAcaQui = new String[] {""} ;
      P031B3_n64ArtAcaQui = new boolean[] {false} ;
      P031B3_A73ArtEti = new String[] {""} ;
      P031B3_n73ArtEti = new boolean[] {false} ;
      P031B3_A117ArtUrg = new byte[1] ;
      P031B3_n117ArtUrg = new boolean[] {false} ;
      P031B3_A88ArtMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B3_n88ArtMer = new boolean[] {false} ;
      P031B3_A105ArtTra1 = new String[] {""} ;
      P031B3_n105ArtTra1 = new boolean[] {false} ;
      P031B3_A106ArtTra2 = new String[] {""} ;
      P031B3_n106ArtTra2 = new boolean[] {false} ;
      P031B3_A107ArtTra3 = new String[] {""} ;
      P031B3_n107ArtTra3 = new boolean[] {false} ;
      P031B3_A108ArtTraP1 = new short[1] ;
      P031B3_n108ArtTraP1 = new boolean[] {false} ;
      P031B3_A109ArtTraP2 = new short[1] ;
      P031B3_n109ArtTraP2 = new boolean[] {false} ;
      P031B3_A110ArtTraP3 = new short[1] ;
      P031B3_n110ArtTraP3 = new boolean[] {false} ;
      P031B3_A111ArtUrd1 = new String[] {""} ;
      P031B3_n111ArtUrd1 = new boolean[] {false} ;
      P031B3_A112ArtUrd2 = new String[] {""} ;
      P031B3_n112ArtUrd2 = new boolean[] {false} ;
      P031B3_A113ArtUrd3 = new String[] {""} ;
      P031B3_n113ArtUrd3 = new boolean[] {false} ;
      P031B3_A114ArtUrdP1 = new short[1] ;
      P031B3_n114ArtUrdP1 = new boolean[] {false} ;
      P031B3_A115ArtUrdP2 = new short[1] ;
      P031B3_n115ArtUrdP2 = new boolean[] {false} ;
      P031B3_A116ArtUrdP3 = new short[1] ;
      P031B3_n116ArtUrdP3 = new boolean[] {false} ;
      P031B3_A89ArtObs = new String[] {""} ;
      P031B3_n89ArtObs = new boolean[] {false} ;
      P031B3_A90ArtObsFac = new String[] {""} ;
      P031B3_n90ArtObsFac = new boolean[] {false} ;
      P031B3_A1229ArtEncCom = new short[1] ;
      P031B3_n1229ArtEncCom = new boolean[] {false} ;
      P031B3_A1230ArtEncAnh = new short[1] ;
      P031B3_n1230ArtEncAnh = new boolean[] {false} ;
      P031B3_A2791ArtFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B3_n2791ArtFacAbs = new boolean[] {false} ;
      P031B3_A3683ArtFecCre = new java.util.Date[] {GXutil.nullDate()} ;
      P031B3_n3683ArtFecCre = new boolean[] {false} ;
      P031B3_A4353ArtUsrCod = new String[] {""} ;
      P031B3_n4353ArtUsrCod = new boolean[] {false} ;
      P031B3_A5741ArtComer = new String[] {""} ;
      P031B3_n5741ArtComer = new boolean[] {false} ;
      P031B3_A5335ArtCodExt = new String[] {""} ;
      P031B3_n5335ArtCodExt = new boolean[] {false} ;
      P031B3_A1903ArtGraAca = new short[1] ;
      P031B3_n1903ArtGraAca = new boolean[] {false} ;
      P031B3_A1905ArtRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B3_n1905ArtRdoA = new boolean[] {false} ;
      P031B3_A1904ArtRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B3_n1904ArtRdoN = new boolean[] {false} ;
      P031B3_A3121ArtNumCor = new short[1] ;
      P031B3_n3121ArtNumCor = new boolean[] {false} ;
      P031B3_A3122ArtAncSal1 = new short[1] ;
      P031B3_n3122ArtAncSal1 = new boolean[] {false} ;
      P031B3_A3123ArtAncSal2 = new short[1] ;
      P031B3_n3123ArtAncSal2 = new boolean[] {false} ;
      P031B3_A3124ArtAncSal3 = new short[1] ;
      P031B3_n3124ArtAncSal3 = new boolean[] {false} ;
      P031B3_A3125ArtGraAca2 = new short[1] ;
      P031B3_n3125ArtGraAca2 = new boolean[] {false} ;
      P031B3_A3126ArtGraCru2 = new short[1] ;
      P031B3_n3126ArtGraCru2 = new boolean[] {false} ;
      P031B3_A4295ClasCod = new short[1] ;
      P031B3_n4295ClasCod = new boolean[] {false} ;
      P031B3_A4297ArtPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B3_n4297ArtPmPPza = new boolean[] {false} ;
      P031B3_A4354ArtFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P031B3_n4354ArtFecMod = new boolean[] {false} ;
      P031B3_A6106ClaTubCod = new short[1] ;
      P031B3_n6106ClaTubCod = new boolean[] {false} ;
      P031B3_A6108ClaBolCod = new short[1] ;
      P031B3_n6108ClaBolCod = new boolean[] {false} ;
      P031B3_A6435ArtRdoCru1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B3_n6435ArtRdoCru1 = new boolean[] {false} ;
      P031B3_A6436ArtRdoCru2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B3_n6436ArtRdoCru2 = new boolean[] {false} ;
      P031B3_A967ArtNMtr = new String[] {""} ;
      P031B3_n967ArtNMtr = new boolean[] {false} ;
      P031B3_A6462ArtLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B3_n6462ArtLu = new boolean[] {false} ;
      P031B3_A4607ArtRb = new short[1] ;
      P031B3_n4607ArtRb = new boolean[] {false} ;
      P031B3_A4444ArtPelAnh = new short[1] ;
      P031B3_n4444ArtPelAnh = new boolean[] {false} ;
      P031B3_A7412Artgrm2Sc = new short[1] ;
      P031B3_n7412Artgrm2Sc = new boolean[] {false} ;
      P031B3_A7413ArtPmlSc = new short[1] ;
      P031B3_n7413ArtPmlSc = new boolean[] {false} ;
      P031B3_A7414ArtAncSc = new short[1] ;
      P031B3_n7414ArtAncSc = new boolean[] {false} ;
      P031B3_A7415ArtPmlCru = new short[1] ;
      P031B3_n7415ArtPmlCru = new boolean[] {false} ;
      P031B3_A7777ArtRdtSc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B3_n7777ArtRdtSc = new boolean[] {false} ;
      P031B3_A7778ArtUnd = new String[] {""} ;
      P031B3_n7778ArtUnd = new boolean[] {false} ;
      P031B3_A7779ArtBlo = new String[] {""} ;
      P031B3_n7779ArtBlo = new boolean[] {false} ;
      P031B3_A91ArtPreDef = new String[] {""} ;
      P031B3_n91ArtPreDef = new boolean[] {false} ;
      P031B3_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B3_n92ArtPreKgm = new boolean[] {false} ;
      P031B3_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B3_n93ArtPreMtr = new boolean[] {false} ;
      P031B3_A4351ArtPreUlAc = new java.util.Date[] {GXutil.nullDate()} ;
      P031B3_n4351ArtPreUlAc = new boolean[] {false} ;
      P031B3_A4352ArtPreUsrM = new String[] {""} ;
      P031B3_n4352ArtPreUsrM = new boolean[] {false} ;
      P031B3_A9801ArtFabsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031B3_n9801ArtFabsT = new boolean[] {false} ;
      A91ArtPreDef = "" ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      A4351ArtPreUlAc = GXutil.nullDate() ;
      A4352ArtPreUsrM = "" ;
      Gx_date = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodse2__default(),
         new Object[] {
             new Object[] {
            P031B2_A3072ArtObsLon, P031B2_n3072ArtObsLon, P031B2_A65ArtCod, P031B2_A252CliCod, P031B2_A396EmprCod, P031B2_A69ArtDsc, P031B2_n69ArtDsc, P031B2_A87ArtMat, P031B2_n87ArtMat, P031B2_A829TipArtCod,
            P031B2_A1148ArtPml, P031B2_n1148ArtPml, P031B2_A78ArtGraCru, P031B2_n78ArtGraCru, P031B2_A68ArtCruMin, P031B2_n68ArtCruMin, P031B2_A67ArtCruMax, P031B2_n67ArtCruMax, P031B2_A63ArtAcaMin, P031B2_n63ArtAcaMin,
            P031B2_A62ArtAcaMax, P031B2_n62ArtAcaMax, P031B2_A95ArtRen, P031B2_n95ArtRen, P031B2_A101ArtTipPle, P031B2_n101ArtTipPle, P031B2_A2834ArtPle2, P031B2_n2834ArtPle2, P031B2_A100ArtTipLar, P031B2_n100ArtTipLar,
            P031B2_A66ArtCorOri, P031B2_n66ArtCorOri, P031B2_A70ArtEncOri, P031B2_n70ArtEncOri, P031B2_A96ArtSua, P031B2_n96ArtSua, P031B2_A64ArtAcaQui, P031B2_n64ArtAcaQui, P031B2_A73ArtEti, P031B2_n73ArtEti,
            P031B2_A117ArtUrg, P031B2_n117ArtUrg, P031B2_A88ArtMer, P031B2_n88ArtMer, P031B2_A105ArtTra1, P031B2_n105ArtTra1, P031B2_A106ArtTra2, P031B2_n106ArtTra2, P031B2_A107ArtTra3, P031B2_n107ArtTra3,
            P031B2_A108ArtTraP1, P031B2_n108ArtTraP1, P031B2_A109ArtTraP2, P031B2_n109ArtTraP2, P031B2_A110ArtTraP3, P031B2_n110ArtTraP3, P031B2_A111ArtUrd1, P031B2_n111ArtUrd1, P031B2_A112ArtUrd2, P031B2_n112ArtUrd2,
            P031B2_A113ArtUrd3, P031B2_n113ArtUrd3, P031B2_A114ArtUrdP1, P031B2_n114ArtUrdP1, P031B2_A115ArtUrdP2, P031B2_n115ArtUrdP2, P031B2_A116ArtUrdP3, P031B2_n116ArtUrdP3, P031B2_A89ArtObs, P031B2_n89ArtObs,
            P031B2_A90ArtObsFac, P031B2_n90ArtObsFac, P031B2_A1229ArtEncCom, P031B2_n1229ArtEncCom, P031B2_A1230ArtEncAnh, P031B2_n1230ArtEncAnh, P031B2_A2791ArtFacAbs, P031B2_n2791ArtFacAbs, P031B2_A5741ArtComer, P031B2_n5741ArtComer,
            P031B2_A5335ArtCodExt, P031B2_n5335ArtCodExt, P031B2_A1903ArtGraAca, P031B2_n1903ArtGraAca, P031B2_A1905ArtRdoA, P031B2_n1905ArtRdoA, P031B2_A1904ArtRdoN, P031B2_n1904ArtRdoN, P031B2_A3121ArtNumCor, P031B2_n3121ArtNumCor,
            P031B2_A3122ArtAncSal1, P031B2_n3122ArtAncSal1, P031B2_A3123ArtAncSal2, P031B2_n3123ArtAncSal2, P031B2_A3124ArtAncSal3, P031B2_n3124ArtAncSal3, P031B2_A3125ArtGraAca2, P031B2_n3125ArtGraAca2, P031B2_A3126ArtGraCru2, P031B2_n3126ArtGraCru2,
            P031B2_A4295ClasCod, P031B2_n4295ClasCod, P031B2_A4297ArtPmPPza, P031B2_n4297ArtPmPPza, P031B2_A3683ArtFecCre, P031B2_n3683ArtFecCre, P031B2_A4353ArtUsrCod, P031B2_n4353ArtUsrCod, P031B2_A4354ArtFecMod, P031B2_n4354ArtFecMod,
            P031B2_A6106ClaTubCod, P031B2_n6106ClaTubCod, P031B2_A6108ClaBolCod, P031B2_n6108ClaBolCod, P031B2_A6435ArtRdoCru1, P031B2_n6435ArtRdoCru1, P031B2_A6436ArtRdoCru2, P031B2_n6436ArtRdoCru2, P031B2_A967ArtNMtr, P031B2_n967ArtNMtr,
            P031B2_A6462ArtLu, P031B2_n6462ArtLu, P031B2_A4607ArtRb, P031B2_n4607ArtRb, P031B2_A4444ArtPelAnh, P031B2_n4444ArtPelAnh, P031B2_A7412Artgrm2Sc, P031B2_n7412Artgrm2Sc, P031B2_A7413ArtPmlSc, P031B2_n7413ArtPmlSc,
            P031B2_A7414ArtAncSc, P031B2_n7414ArtAncSc, P031B2_A7415ArtPmlCru, P031B2_n7415ArtPmlCru, P031B2_A7777ArtRdtSc, P031B2_n7777ArtRdtSc, P031B2_A7778ArtUnd, P031B2_n7778ArtUnd, P031B2_A7779ArtBlo, P031B2_n7779ArtBlo,
            P031B2_A9801ArtFabsT, P031B2_n9801ArtFabsT
            }
            , new Object[] {
            P031B3_A3072ArtObsLon, P031B3_n3072ArtObsLon, P031B3_A65ArtCod, P031B3_A252CliCod, P031B3_A396EmprCod, P031B3_A87ArtMat, P031B3_n87ArtMat, P031B3_A829TipArtCod, P031B3_A69ArtDsc, P031B3_n69ArtDsc,
            P031B3_A1148ArtPml, P031B3_n1148ArtPml, P031B3_A78ArtGraCru, P031B3_n78ArtGraCru, P031B3_A68ArtCruMin, P031B3_n68ArtCruMin, P031B3_A67ArtCruMax, P031B3_n67ArtCruMax, P031B3_A63ArtAcaMin, P031B3_n63ArtAcaMin,
            P031B3_A62ArtAcaMax, P031B3_n62ArtAcaMax, P031B3_A95ArtRen, P031B3_n95ArtRen, P031B3_A101ArtTipPle, P031B3_n101ArtTipPle, P031B3_A2834ArtPle2, P031B3_n2834ArtPle2, P031B3_A100ArtTipLar, P031B3_n100ArtTipLar,
            P031B3_A66ArtCorOri, P031B3_n66ArtCorOri, P031B3_A70ArtEncOri, P031B3_n70ArtEncOri, P031B3_A96ArtSua, P031B3_n96ArtSua, P031B3_A64ArtAcaQui, P031B3_n64ArtAcaQui, P031B3_A73ArtEti, P031B3_n73ArtEti,
            P031B3_A117ArtUrg, P031B3_n117ArtUrg, P031B3_A88ArtMer, P031B3_n88ArtMer, P031B3_A105ArtTra1, P031B3_n105ArtTra1, P031B3_A106ArtTra2, P031B3_n106ArtTra2, P031B3_A107ArtTra3, P031B3_n107ArtTra3,
            P031B3_A108ArtTraP1, P031B3_n108ArtTraP1, P031B3_A109ArtTraP2, P031B3_n109ArtTraP2, P031B3_A110ArtTraP3, P031B3_n110ArtTraP3, P031B3_A111ArtUrd1, P031B3_n111ArtUrd1, P031B3_A112ArtUrd2, P031B3_n112ArtUrd2,
            P031B3_A113ArtUrd3, P031B3_n113ArtUrd3, P031B3_A114ArtUrdP1, P031B3_n114ArtUrdP1, P031B3_A115ArtUrdP2, P031B3_n115ArtUrdP2, P031B3_A116ArtUrdP3, P031B3_n116ArtUrdP3, P031B3_A89ArtObs, P031B3_n89ArtObs,
            P031B3_A90ArtObsFac, P031B3_n90ArtObsFac, P031B3_A1229ArtEncCom, P031B3_n1229ArtEncCom, P031B3_A1230ArtEncAnh, P031B3_n1230ArtEncAnh, P031B3_A2791ArtFacAbs, P031B3_n2791ArtFacAbs, P031B3_A3683ArtFecCre, P031B3_n3683ArtFecCre,
            P031B3_A4353ArtUsrCod, P031B3_n4353ArtUsrCod, P031B3_A5741ArtComer, P031B3_n5741ArtComer, P031B3_A5335ArtCodExt, P031B3_n5335ArtCodExt, P031B3_A1903ArtGraAca, P031B3_n1903ArtGraAca, P031B3_A1905ArtRdoA, P031B3_n1905ArtRdoA,
            P031B3_A1904ArtRdoN, P031B3_n1904ArtRdoN, P031B3_A3121ArtNumCor, P031B3_n3121ArtNumCor, P031B3_A3122ArtAncSal1, P031B3_n3122ArtAncSal1, P031B3_A3123ArtAncSal2, P031B3_n3123ArtAncSal2, P031B3_A3124ArtAncSal3, P031B3_n3124ArtAncSal3,
            P031B3_A3125ArtGraAca2, P031B3_n3125ArtGraAca2, P031B3_A3126ArtGraCru2, P031B3_n3126ArtGraCru2, P031B3_A4295ClasCod, P031B3_n4295ClasCod, P031B3_A4297ArtPmPPza, P031B3_n4297ArtPmPPza, P031B3_A4354ArtFecMod, P031B3_n4354ArtFecMod,
            P031B3_A6106ClaTubCod, P031B3_n6106ClaTubCod, P031B3_A6108ClaBolCod, P031B3_n6108ClaBolCod, P031B3_A6435ArtRdoCru1, P031B3_n6435ArtRdoCru1, P031B3_A6436ArtRdoCru2, P031B3_n6436ArtRdoCru2, P031B3_A967ArtNMtr, P031B3_n967ArtNMtr,
            P031B3_A6462ArtLu, P031B3_n6462ArtLu, P031B3_A4607ArtRb, P031B3_n4607ArtRb, P031B3_A4444ArtPelAnh, P031B3_n4444ArtPelAnh, P031B3_A7412Artgrm2Sc, P031B3_n7412Artgrm2Sc, P031B3_A7413ArtPmlSc, P031B3_n7413ArtPmlSc,
            P031B3_A7414ArtAncSc, P031B3_n7414ArtAncSc, P031B3_A7415ArtPmlCru, P031B3_n7415ArtPmlCru, P031B3_A7777ArtRdtSc, P031B3_n7777ArtRdtSc, P031B3_A7778ArtUnd, P031B3_n7778ArtUnd, P031B3_A7779ArtBlo, P031B3_n7779ArtBlo,
            P031B3_A91ArtPreDef, P031B3_n91ArtPreDef, P031B3_A92ArtPreKgm, P031B3_n92ArtPreKgm, P031B3_A93ArtPreMtr, P031B3_n93ArtPreMtr, P031B3_A4351ArtPreUlAc, P031B3_n4351ArtPreUlAc, P031B3_A4352ArtPreUsrM, P031B3_n4352ArtPreUsrM,
            P031B3_A9801ArtFabsT, P031B3_n9801ArtFabsT
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

   private byte AV70DuSer0 ;
   private byte AV72Moda21 ;
   private byte GXv_int1[] ;
   private byte A117ArtUrg ;
   private byte AV38ArtUrg ;
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
   private short AV78ArtNumCor ;
   private short AV79ArtAncSal1 ;
   private short AV80ArtAncSal2 ;
   private short AV81ArtAncSal3 ;
   private short AV104ArtGraAca2 ;
   private short AV83ArtGraCru2 ;
   private short AV84ClasCod ;
   private short AV89ClaTubCod ;
   private short AV90ClaBolCod ;
   private short AV95ArtRb ;
   private short AV96ArtPelAnh ;
   private short AV97Artgrm2Sc ;
   private short AV98ArtPmlSc ;
   private short AV99ArtAncSc ;
   private short AV100ArtPmlCru ;
   private short Gx_err ;
   private int AV16CliOri ;
   private int AV17CliDes ;
   private int A252CliCod ;
   private java.math.BigDecimal A95ArtRen ;
   private java.math.BigDecimal A88ArtMer ;
   private java.math.BigDecimal A2791ArtFacAbs ;
   private java.math.BigDecimal A1905ArtRdoA ;
   private java.math.BigDecimal A1904ArtRdoN ;
   private java.math.BigDecimal A4297ArtPmPPza ;
   private java.math.BigDecimal A6435ArtRdoCru1 ;
   private java.math.BigDecimal A6436ArtRdoCru2 ;
   private java.math.BigDecimal A6462ArtLu ;
   private java.math.BigDecimal A7777ArtRdtSc ;
   private java.math.BigDecimal A9801ArtFabsT ;
   private java.math.BigDecimal AV30ArtRen ;
   private java.math.BigDecimal AV39ArtMer ;
   private java.math.BigDecimal AV62ArtFacAbs ;
   private java.math.BigDecimal AV75ArtRdoA ;
   private java.math.BigDecimal AV76ArtRdoN ;
   private java.math.BigDecimal AV85ArtPmPPza ;
   private java.math.BigDecimal AV91ArtRdoCru1 ;
   private java.math.BigDecimal AV92ArtRdoCru2 ;
   private java.math.BigDecimal AV94ArtLu ;
   private java.math.BigDecimal AV101ArtRdtSc ;
   private java.math.BigDecimal AV105Artfabst ;
   private java.math.BigDecimal A92ArtPreKgm ;
   private java.math.BigDecimal A93ArtPreMtr ;
   private String AV15EmprCod ;
   private String AV18ArtOri ;
   private String AV19ArtDes ;
   private String AV60ArtDscDes ;
   private String AV63station ;
   private String AV106AuxEmprCod ;
   private String GXv_char2[] ;
   private String AV107AuxEmprNom ;
   private String GXv_char3[] ;
   private String AV65UsurCod ;
   private String GXv_char4[] ;
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
   private String A967ArtNMtr ;
   private String A7778ArtUnd ;
   private String A7779ArtBlo ;
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
   private String AV87ArtUsrCod ;
   private String AV93ArtNMtr ;
   private String AV102ArtUnd ;
   private String AV103ArtBlo ;
   private String A91ArtPreDef ;
   private String A4352ArtPreUsrM ;
   private java.util.Date A3683ArtFecCre ;
   private java.util.Date A4354ArtFecMod ;
   private java.util.Date AV86ArtFecCre ;
   private java.util.Date AV88ArtFecMod ;
   private java.util.Date A4351ArtPreUlAc ;
   private java.util.Date Gx_date ;
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
   private boolean n2791ArtFacAbs ;
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
   private boolean n967ArtNMtr ;
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
   private boolean n9801ArtFabsT ;
   private boolean n91ArtPreDef ;
   private boolean n92ArtPreKgm ;
   private boolean n93ArtPreMtr ;
   private boolean n4351ArtPreUlAc ;
   private boolean n4352ArtPreUsrM ;
   private String A3072ArtObsLon ;
   private String AV58ArtObsLon ;
   private IDataStoreProvider pr_default ;
   private String[] P031B2_A3072ArtObsLon ;
   private boolean[] P031B2_n3072ArtObsLon ;
   private String[] P031B2_A65ArtCod ;
   private int[] P031B2_A252CliCod ;
   private String[] P031B2_A396EmprCod ;
   private String[] P031B2_A69ArtDsc ;
   private boolean[] P031B2_n69ArtDsc ;
   private String[] P031B2_A87ArtMat ;
   private boolean[] P031B2_n87ArtMat ;
   private short[] P031B2_A829TipArtCod ;
   private short[] P031B2_A1148ArtPml ;
   private boolean[] P031B2_n1148ArtPml ;
   private short[] P031B2_A78ArtGraCru ;
   private boolean[] P031B2_n78ArtGraCru ;
   private short[] P031B2_A68ArtCruMin ;
   private boolean[] P031B2_n68ArtCruMin ;
   private short[] P031B2_A67ArtCruMax ;
   private boolean[] P031B2_n67ArtCruMax ;
   private short[] P031B2_A63ArtAcaMin ;
   private boolean[] P031B2_n63ArtAcaMin ;
   private short[] P031B2_A62ArtAcaMax ;
   private boolean[] P031B2_n62ArtAcaMax ;
   private java.math.BigDecimal[] P031B2_A95ArtRen ;
   private boolean[] P031B2_n95ArtRen ;
   private String[] P031B2_A101ArtTipPle ;
   private boolean[] P031B2_n101ArtTipPle ;
   private String[] P031B2_A2834ArtPle2 ;
   private boolean[] P031B2_n2834ArtPle2 ;
   private String[] P031B2_A100ArtTipLar ;
   private boolean[] P031B2_n100ArtTipLar ;
   private String[] P031B2_A66ArtCorOri ;
   private boolean[] P031B2_n66ArtCorOri ;
   private String[] P031B2_A70ArtEncOri ;
   private boolean[] P031B2_n70ArtEncOri ;
   private String[] P031B2_A96ArtSua ;
   private boolean[] P031B2_n96ArtSua ;
   private String[] P031B2_A64ArtAcaQui ;
   private boolean[] P031B2_n64ArtAcaQui ;
   private String[] P031B2_A73ArtEti ;
   private boolean[] P031B2_n73ArtEti ;
   private byte[] P031B2_A117ArtUrg ;
   private boolean[] P031B2_n117ArtUrg ;
   private java.math.BigDecimal[] P031B2_A88ArtMer ;
   private boolean[] P031B2_n88ArtMer ;
   private String[] P031B2_A105ArtTra1 ;
   private boolean[] P031B2_n105ArtTra1 ;
   private String[] P031B2_A106ArtTra2 ;
   private boolean[] P031B2_n106ArtTra2 ;
   private String[] P031B2_A107ArtTra3 ;
   private boolean[] P031B2_n107ArtTra3 ;
   private short[] P031B2_A108ArtTraP1 ;
   private boolean[] P031B2_n108ArtTraP1 ;
   private short[] P031B2_A109ArtTraP2 ;
   private boolean[] P031B2_n109ArtTraP2 ;
   private short[] P031B2_A110ArtTraP3 ;
   private boolean[] P031B2_n110ArtTraP3 ;
   private String[] P031B2_A111ArtUrd1 ;
   private boolean[] P031B2_n111ArtUrd1 ;
   private String[] P031B2_A112ArtUrd2 ;
   private boolean[] P031B2_n112ArtUrd2 ;
   private String[] P031B2_A113ArtUrd3 ;
   private boolean[] P031B2_n113ArtUrd3 ;
   private short[] P031B2_A114ArtUrdP1 ;
   private boolean[] P031B2_n114ArtUrdP1 ;
   private short[] P031B2_A115ArtUrdP2 ;
   private boolean[] P031B2_n115ArtUrdP2 ;
   private short[] P031B2_A116ArtUrdP3 ;
   private boolean[] P031B2_n116ArtUrdP3 ;
   private String[] P031B2_A89ArtObs ;
   private boolean[] P031B2_n89ArtObs ;
   private String[] P031B2_A90ArtObsFac ;
   private boolean[] P031B2_n90ArtObsFac ;
   private short[] P031B2_A1229ArtEncCom ;
   private boolean[] P031B2_n1229ArtEncCom ;
   private short[] P031B2_A1230ArtEncAnh ;
   private boolean[] P031B2_n1230ArtEncAnh ;
   private java.math.BigDecimal[] P031B2_A2791ArtFacAbs ;
   private boolean[] P031B2_n2791ArtFacAbs ;
   private String[] P031B2_A5741ArtComer ;
   private boolean[] P031B2_n5741ArtComer ;
   private String[] P031B2_A5335ArtCodExt ;
   private boolean[] P031B2_n5335ArtCodExt ;
   private short[] P031B2_A1903ArtGraAca ;
   private boolean[] P031B2_n1903ArtGraAca ;
   private java.math.BigDecimal[] P031B2_A1905ArtRdoA ;
   private boolean[] P031B2_n1905ArtRdoA ;
   private java.math.BigDecimal[] P031B2_A1904ArtRdoN ;
   private boolean[] P031B2_n1904ArtRdoN ;
   private short[] P031B2_A3121ArtNumCor ;
   private boolean[] P031B2_n3121ArtNumCor ;
   private short[] P031B2_A3122ArtAncSal1 ;
   private boolean[] P031B2_n3122ArtAncSal1 ;
   private short[] P031B2_A3123ArtAncSal2 ;
   private boolean[] P031B2_n3123ArtAncSal2 ;
   private short[] P031B2_A3124ArtAncSal3 ;
   private boolean[] P031B2_n3124ArtAncSal3 ;
   private short[] P031B2_A3125ArtGraAca2 ;
   private boolean[] P031B2_n3125ArtGraAca2 ;
   private short[] P031B2_A3126ArtGraCru2 ;
   private boolean[] P031B2_n3126ArtGraCru2 ;
   private short[] P031B2_A4295ClasCod ;
   private boolean[] P031B2_n4295ClasCod ;
   private java.math.BigDecimal[] P031B2_A4297ArtPmPPza ;
   private boolean[] P031B2_n4297ArtPmPPza ;
   private java.util.Date[] P031B2_A3683ArtFecCre ;
   private boolean[] P031B2_n3683ArtFecCre ;
   private String[] P031B2_A4353ArtUsrCod ;
   private boolean[] P031B2_n4353ArtUsrCod ;
   private java.util.Date[] P031B2_A4354ArtFecMod ;
   private boolean[] P031B2_n4354ArtFecMod ;
   private short[] P031B2_A6106ClaTubCod ;
   private boolean[] P031B2_n6106ClaTubCod ;
   private short[] P031B2_A6108ClaBolCod ;
   private boolean[] P031B2_n6108ClaBolCod ;
   private java.math.BigDecimal[] P031B2_A6435ArtRdoCru1 ;
   private boolean[] P031B2_n6435ArtRdoCru1 ;
   private java.math.BigDecimal[] P031B2_A6436ArtRdoCru2 ;
   private boolean[] P031B2_n6436ArtRdoCru2 ;
   private String[] P031B2_A967ArtNMtr ;
   private boolean[] P031B2_n967ArtNMtr ;
   private java.math.BigDecimal[] P031B2_A6462ArtLu ;
   private boolean[] P031B2_n6462ArtLu ;
   private short[] P031B2_A4607ArtRb ;
   private boolean[] P031B2_n4607ArtRb ;
   private short[] P031B2_A4444ArtPelAnh ;
   private boolean[] P031B2_n4444ArtPelAnh ;
   private short[] P031B2_A7412Artgrm2Sc ;
   private boolean[] P031B2_n7412Artgrm2Sc ;
   private short[] P031B2_A7413ArtPmlSc ;
   private boolean[] P031B2_n7413ArtPmlSc ;
   private short[] P031B2_A7414ArtAncSc ;
   private boolean[] P031B2_n7414ArtAncSc ;
   private short[] P031B2_A7415ArtPmlCru ;
   private boolean[] P031B2_n7415ArtPmlCru ;
   private java.math.BigDecimal[] P031B2_A7777ArtRdtSc ;
   private boolean[] P031B2_n7777ArtRdtSc ;
   private String[] P031B2_A7778ArtUnd ;
   private boolean[] P031B2_n7778ArtUnd ;
   private String[] P031B2_A7779ArtBlo ;
   private boolean[] P031B2_n7779ArtBlo ;
   private java.math.BigDecimal[] P031B2_A9801ArtFabsT ;
   private boolean[] P031B2_n9801ArtFabsT ;
   private String[] P031B3_A3072ArtObsLon ;
   private boolean[] P031B3_n3072ArtObsLon ;
   private String[] P031B3_A65ArtCod ;
   private int[] P031B3_A252CliCod ;
   private String[] P031B3_A396EmprCod ;
   private String[] P031B3_A87ArtMat ;
   private boolean[] P031B3_n87ArtMat ;
   private short[] P031B3_A829TipArtCod ;
   private String[] P031B3_A69ArtDsc ;
   private boolean[] P031B3_n69ArtDsc ;
   private short[] P031B3_A1148ArtPml ;
   private boolean[] P031B3_n1148ArtPml ;
   private short[] P031B3_A78ArtGraCru ;
   private boolean[] P031B3_n78ArtGraCru ;
   private short[] P031B3_A68ArtCruMin ;
   private boolean[] P031B3_n68ArtCruMin ;
   private short[] P031B3_A67ArtCruMax ;
   private boolean[] P031B3_n67ArtCruMax ;
   private short[] P031B3_A63ArtAcaMin ;
   private boolean[] P031B3_n63ArtAcaMin ;
   private short[] P031B3_A62ArtAcaMax ;
   private boolean[] P031B3_n62ArtAcaMax ;
   private java.math.BigDecimal[] P031B3_A95ArtRen ;
   private boolean[] P031B3_n95ArtRen ;
   private String[] P031B3_A101ArtTipPle ;
   private boolean[] P031B3_n101ArtTipPle ;
   private String[] P031B3_A2834ArtPle2 ;
   private boolean[] P031B3_n2834ArtPle2 ;
   private String[] P031B3_A100ArtTipLar ;
   private boolean[] P031B3_n100ArtTipLar ;
   private String[] P031B3_A66ArtCorOri ;
   private boolean[] P031B3_n66ArtCorOri ;
   private String[] P031B3_A70ArtEncOri ;
   private boolean[] P031B3_n70ArtEncOri ;
   private String[] P031B3_A96ArtSua ;
   private boolean[] P031B3_n96ArtSua ;
   private String[] P031B3_A64ArtAcaQui ;
   private boolean[] P031B3_n64ArtAcaQui ;
   private String[] P031B3_A73ArtEti ;
   private boolean[] P031B3_n73ArtEti ;
   private byte[] P031B3_A117ArtUrg ;
   private boolean[] P031B3_n117ArtUrg ;
   private java.math.BigDecimal[] P031B3_A88ArtMer ;
   private boolean[] P031B3_n88ArtMer ;
   private String[] P031B3_A105ArtTra1 ;
   private boolean[] P031B3_n105ArtTra1 ;
   private String[] P031B3_A106ArtTra2 ;
   private boolean[] P031B3_n106ArtTra2 ;
   private String[] P031B3_A107ArtTra3 ;
   private boolean[] P031B3_n107ArtTra3 ;
   private short[] P031B3_A108ArtTraP1 ;
   private boolean[] P031B3_n108ArtTraP1 ;
   private short[] P031B3_A109ArtTraP2 ;
   private boolean[] P031B3_n109ArtTraP2 ;
   private short[] P031B3_A110ArtTraP3 ;
   private boolean[] P031B3_n110ArtTraP3 ;
   private String[] P031B3_A111ArtUrd1 ;
   private boolean[] P031B3_n111ArtUrd1 ;
   private String[] P031B3_A112ArtUrd2 ;
   private boolean[] P031B3_n112ArtUrd2 ;
   private String[] P031B3_A113ArtUrd3 ;
   private boolean[] P031B3_n113ArtUrd3 ;
   private short[] P031B3_A114ArtUrdP1 ;
   private boolean[] P031B3_n114ArtUrdP1 ;
   private short[] P031B3_A115ArtUrdP2 ;
   private boolean[] P031B3_n115ArtUrdP2 ;
   private short[] P031B3_A116ArtUrdP3 ;
   private boolean[] P031B3_n116ArtUrdP3 ;
   private String[] P031B3_A89ArtObs ;
   private boolean[] P031B3_n89ArtObs ;
   private String[] P031B3_A90ArtObsFac ;
   private boolean[] P031B3_n90ArtObsFac ;
   private short[] P031B3_A1229ArtEncCom ;
   private boolean[] P031B3_n1229ArtEncCom ;
   private short[] P031B3_A1230ArtEncAnh ;
   private boolean[] P031B3_n1230ArtEncAnh ;
   private java.math.BigDecimal[] P031B3_A2791ArtFacAbs ;
   private boolean[] P031B3_n2791ArtFacAbs ;
   private java.util.Date[] P031B3_A3683ArtFecCre ;
   private boolean[] P031B3_n3683ArtFecCre ;
   private String[] P031B3_A4353ArtUsrCod ;
   private boolean[] P031B3_n4353ArtUsrCod ;
   private String[] P031B3_A5741ArtComer ;
   private boolean[] P031B3_n5741ArtComer ;
   private String[] P031B3_A5335ArtCodExt ;
   private boolean[] P031B3_n5335ArtCodExt ;
   private short[] P031B3_A1903ArtGraAca ;
   private boolean[] P031B3_n1903ArtGraAca ;
   private java.math.BigDecimal[] P031B3_A1905ArtRdoA ;
   private boolean[] P031B3_n1905ArtRdoA ;
   private java.math.BigDecimal[] P031B3_A1904ArtRdoN ;
   private boolean[] P031B3_n1904ArtRdoN ;
   private short[] P031B3_A3121ArtNumCor ;
   private boolean[] P031B3_n3121ArtNumCor ;
   private short[] P031B3_A3122ArtAncSal1 ;
   private boolean[] P031B3_n3122ArtAncSal1 ;
   private short[] P031B3_A3123ArtAncSal2 ;
   private boolean[] P031B3_n3123ArtAncSal2 ;
   private short[] P031B3_A3124ArtAncSal3 ;
   private boolean[] P031B3_n3124ArtAncSal3 ;
   private short[] P031B3_A3125ArtGraAca2 ;
   private boolean[] P031B3_n3125ArtGraAca2 ;
   private short[] P031B3_A3126ArtGraCru2 ;
   private boolean[] P031B3_n3126ArtGraCru2 ;
   private short[] P031B3_A4295ClasCod ;
   private boolean[] P031B3_n4295ClasCod ;
   private java.math.BigDecimal[] P031B3_A4297ArtPmPPza ;
   private boolean[] P031B3_n4297ArtPmPPza ;
   private java.util.Date[] P031B3_A4354ArtFecMod ;
   private boolean[] P031B3_n4354ArtFecMod ;
   private short[] P031B3_A6106ClaTubCod ;
   private boolean[] P031B3_n6106ClaTubCod ;
   private short[] P031B3_A6108ClaBolCod ;
   private boolean[] P031B3_n6108ClaBolCod ;
   private java.math.BigDecimal[] P031B3_A6435ArtRdoCru1 ;
   private boolean[] P031B3_n6435ArtRdoCru1 ;
   private java.math.BigDecimal[] P031B3_A6436ArtRdoCru2 ;
   private boolean[] P031B3_n6436ArtRdoCru2 ;
   private String[] P031B3_A967ArtNMtr ;
   private boolean[] P031B3_n967ArtNMtr ;
   private java.math.BigDecimal[] P031B3_A6462ArtLu ;
   private boolean[] P031B3_n6462ArtLu ;
   private short[] P031B3_A4607ArtRb ;
   private boolean[] P031B3_n4607ArtRb ;
   private short[] P031B3_A4444ArtPelAnh ;
   private boolean[] P031B3_n4444ArtPelAnh ;
   private short[] P031B3_A7412Artgrm2Sc ;
   private boolean[] P031B3_n7412Artgrm2Sc ;
   private short[] P031B3_A7413ArtPmlSc ;
   private boolean[] P031B3_n7413ArtPmlSc ;
   private short[] P031B3_A7414ArtAncSc ;
   private boolean[] P031B3_n7414ArtAncSc ;
   private short[] P031B3_A7415ArtPmlCru ;
   private boolean[] P031B3_n7415ArtPmlCru ;
   private java.math.BigDecimal[] P031B3_A7777ArtRdtSc ;
   private boolean[] P031B3_n7777ArtRdtSc ;
   private String[] P031B3_A7778ArtUnd ;
   private boolean[] P031B3_n7778ArtUnd ;
   private String[] P031B3_A7779ArtBlo ;
   private boolean[] P031B3_n7779ArtBlo ;
   private String[] P031B3_A91ArtPreDef ;
   private boolean[] P031B3_n91ArtPreDef ;
   private java.math.BigDecimal[] P031B3_A92ArtPreKgm ;
   private boolean[] P031B3_n92ArtPreKgm ;
   private java.math.BigDecimal[] P031B3_A93ArtPreMtr ;
   private boolean[] P031B3_n93ArtPreMtr ;
   private java.util.Date[] P031B3_A4351ArtPreUlAc ;
   private boolean[] P031B3_n4351ArtPreUlAc ;
   private String[] P031B3_A4352ArtPreUsrM ;
   private boolean[] P031B3_n4352ArtPreUsrM ;
   private java.math.BigDecimal[] P031B3_A9801ArtFabsT ;
   private boolean[] P031B3_n9801ArtFabsT ;
}

final  class pmodse2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P031B2", "SELECT ArtObsLon, ArtCod, CliCod, EmprCod, ArtDsc, ArtMat, TipArtCod, ArtPml, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtPle2, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtEncCom, ArtEncAnh, ArtFacAbs, ArtComer, ArtCodExt, ArtGraAca, ArtRdoA, ArtRdoN, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ClasCod, ArtPmPPza, ArtFecCre, ArtUsrCod, ArtFecMod, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtNMtr, ArtLu, ArtRb, ArtPelAnh, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtFabsT FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P031B3", "SELECT ArtObsLon, ArtCod, CliCod, EmprCod, ArtMat, TipArtCod, ArtDsc, ArtPml, ArtGraCru, ArtCruMin, ArtCruMax, ArtAcaMin, ArtAcaMax, ArtRen, ArtTipPle, ArtPle2, ArtTipLar, ArtCorOri, ArtEncOri, ArtSua, ArtAcaQui, ArtEti, ArtUrg, ArtMer, ArtTra1, ArtTra2, ArtTra3, ArtTraP1, ArtTraP2, ArtTraP3, ArtUrd1, ArtUrd2, ArtUrd3, ArtUrdP1, ArtUrdP2, ArtUrdP3, ArtObs, ArtObsFac, ArtEncCom, ArtEncAnh, ArtFacAbs, ArtFecCre, ArtUsrCod, ArtComer, ArtCodExt, ArtGraAca, ArtRdoA, ArtRdoN, ArtNumCor, ArtAncSal1, ArtAncSal2, ArtAncSal3, ArtGraAca2, ArtGraCru2, ClasCod, ArtPmPPza, ArtFecMod, ClaTubCod, ClaBolCod, ArtRdoCru1, ArtRdoCru2, ArtNMtr, ArtLu, ArtRb, ArtPelAnh, Artgrm2Sc, ArtPmlSc, ArtAncSc, ArtPmlCru, ArtRdtSc, ArtUnd, ArtBlo, ArtPreDef, ArtPreKgm, ArtPreMtr, ArtPreUlAc, ArtPreUsrM, ArtFabsT FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P031B4", "UPDATE TXPARTICU SET ArtMat=?, TipArtCod=?, ArtDsc=?, ArtPml=?, ArtGraCru=?, ArtCruMin=?, ArtCruMax=?, ArtAcaMin=?, ArtAcaMax=?, ArtRen=?, ArtTipPle=?, ArtPle2=?, ArtTipLar=?, ArtCorOri=?, ArtEncOri=?, ArtSua=?, ArtAcaQui=?, ArtEti=?, ArtUrg=?, ArtMer=?, ArtTra1=?, ArtTra2=?, ArtTra3=?, ArtTraP1=?, ArtTraP2=?, ArtTraP3=?, ArtUrd1=?, ArtUrd2=?, ArtUrd3=?, ArtUrdP1=?, ArtUrdP2=?, ArtUrdP3=?, ArtObs=?, ArtObsLon=?, ArtObsFac=?, ArtEncCom=?, ArtEncAnh=?, ArtFacAbs=?, ArtFecCre=?, ArtUsrCod=?, ArtComer=?, ArtCodExt=?, ArtGraAca=?, ArtRdoA=?, ArtRdoN=?, ArtNumCor=?, ArtAncSal1=?, ArtAncSal2=?, ArtAncSal3=?, ArtGraAca2=?, ArtGraCru2=?, ClasCod=?, ArtPmPPza=?, ArtFecMod=?, ClaTubCod=?, ClaBolCod=?, ArtRdoCru1=?, ArtRdoCru2=?, ArtNMtr=?, ArtLu=?, ArtRb=?, ArtPelAnh=?, Artgrm2Sc=?, ArtPmlSc=?, ArtAncSc=?, ArtPmlCru=?, ArtRdtSc=?, ArtUnd=?, ArtBlo=?, ArtPreDef=?, ArtPreKgm=?, ArtPreMtr=?, ArtPreUlAc=?, ArtPreUsrM=?, ArtFabsT=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
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
               ((java.math.BigDecimal[]) buf[76])[0] = rslt.getBigDecimal(41,2);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(42, 16);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(43, 3);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((short[]) buf[82])[0] = rslt.getShort(44);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[84])[0] = rslt.getBigDecimal(45,2);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(46,2);
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
               ((short[]) buf[100])[0] = rslt.getShort(53);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[102])[0] = rslt.getBigDecimal(54,2);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[104])[0] = rslt.getGXDate(55);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(56, 8);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[108])[0] = rslt.getGXDate(57);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((short[]) buf[110])[0] = rslt.getShort(58);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((short[]) buf[112])[0] = rslt.getShort(59);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[114])[0] = rslt.getBigDecimal(60,2);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[116])[0] = rslt.getBigDecimal(61,2);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(62, 10);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[120])[0] = rslt.getBigDecimal(63,2);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((short[]) buf[122])[0] = rslt.getShort(64);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((short[]) buf[124])[0] = rslt.getShort(65);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((short[]) buf[126])[0] = rslt.getShort(66);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((short[]) buf[128])[0] = rslt.getShort(67);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((short[]) buf[130])[0] = rslt.getShort(68);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((short[]) buf[132])[0] = rslt.getShort(69);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[134])[0] = rslt.getBigDecimal(70,2);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getString(71, 1);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((String[]) buf[138])[0] = rslt.getString(72, 1);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[140])[0] = rslt.getBigDecimal(73,2);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               ((java.math.BigDecimal[]) buf[76])[0] = rslt.getBigDecimal(41,2);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[78])[0] = rslt.getGXDate(42);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(43, 8);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(44, 16);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(45, 3);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((short[]) buf[86])[0] = rslt.getShort(46);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[88])[0] = rslt.getBigDecimal(47,2);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[90])[0] = rslt.getBigDecimal(48,2);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((short[]) buf[92])[0] = rslt.getShort(49);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((short[]) buf[94])[0] = rslt.getShort(50);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((short[]) buf[96])[0] = rslt.getShort(51);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((short[]) buf[98])[0] = rslt.getShort(52);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((short[]) buf[100])[0] = rslt.getShort(53);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((short[]) buf[102])[0] = rslt.getShort(54);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((short[]) buf[104])[0] = rslt.getShort(55);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[106])[0] = rslt.getBigDecimal(56,2);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[108])[0] = rslt.getGXDate(57);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((short[]) buf[110])[0] = rslt.getShort(58);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((short[]) buf[112])[0] = rslt.getShort(59);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[114])[0] = rslt.getBigDecimal(60,2);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[116])[0] = rslt.getBigDecimal(61,2);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(62, 10);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[120])[0] = rslt.getBigDecimal(63,2);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((short[]) buf[122])[0] = rslt.getShort(64);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((short[]) buf[124])[0] = rslt.getShort(65);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((short[]) buf[126])[0] = rslt.getShort(66);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((short[]) buf[128])[0] = rslt.getShort(67);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((short[]) buf[130])[0] = rslt.getShort(68);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((short[]) buf[132])[0] = rslt.getShort(69);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[134])[0] = rslt.getBigDecimal(70,2);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getString(71, 1);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((String[]) buf[138])[0] = rslt.getString(72, 1);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((String[]) buf[140])[0] = rslt.getString(73, 1);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[142])[0] = rslt.getBigDecimal(74,5);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[144])[0] = rslt.getBigDecimal(75,5);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[146])[0] = rslt.getGXDate(76);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((String[]) buf[148])[0] = rslt.getString(77, 8);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[150])[0] = rslt.getBigDecimal(78,2);
               ((boolean[]) buf[151])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 26);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 10);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 30);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 10);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[30], 6);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 6);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[36]).byteValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 4);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[42], 4);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 4);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[46]).shortValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[48]).shortValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[50]).shortValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[52], 4);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[54], 4);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[56], 4);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[58]).shortValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[60]).shortValue());
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[62]).shortValue());
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[64], 60);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(34, (String)parms[66]);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[68], 40);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[70]).shortValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[72]).shortValue());
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DATE );
               }
               else
               {
                  stmt.setDate(39, (java.util.Date)parms[76]);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[78], 8);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[80], 16);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[82], 3);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(43, ((Number) parms[84]).shortValue());
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(44, (java.math.BigDecimal)parms[86], 2);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(45, (java.math.BigDecimal)parms[88], 2);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(46, ((Number) parms[90]).shortValue());
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[92]).shortValue());
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(48, ((Number) parms[94]).shortValue());
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(49, ((Number) parms[96]).shortValue());
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(50, ((Number) parms[98]).shortValue());
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(51, ((Number) parms[100]).shortValue());
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(52, ((Number) parms[102]).shortValue());
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(53, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.DATE );
               }
               else
               {
                  stmt.setDate(54, (java.util.Date)parms[106]);
               }
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(55, ((Number) parms[108]).shortValue());
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(56, ((Number) parms[110]).shortValue());
               }
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(57, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(58, (java.math.BigDecimal)parms[114], 2);
               }
               if ( ((Boolean) parms[115]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[116], 10);
               }
               if ( ((Boolean) parms[117]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(60, (java.math.BigDecimal)parms[118], 2);
               }
               if ( ((Boolean) parms[119]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(61, ((Number) parms[120]).shortValue());
               }
               if ( ((Boolean) parms[121]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(62, ((Number) parms[122]).shortValue());
               }
               if ( ((Boolean) parms[123]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(63, ((Number) parms[124]).shortValue());
               }
               if ( ((Boolean) parms[125]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(64, ((Number) parms[126]).shortValue());
               }
               if ( ((Boolean) parms[127]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(65, ((Number) parms[128]).shortValue());
               }
               if ( ((Boolean) parms[129]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(66, ((Number) parms[130]).shortValue());
               }
               if ( ((Boolean) parms[131]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(67, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Boolean) parms[133]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(68, (String)parms[134], 1);
               }
               if ( ((Boolean) parms[135]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(69, (String)parms[136], 1);
               }
               if ( ((Boolean) parms[137]).booleanValue() )
               {
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(70, (String)parms[138], 1);
               }
               if ( ((Boolean) parms[139]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(71, (java.math.BigDecimal)parms[140], 5);
               }
               if ( ((Boolean) parms[141]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(72, (java.math.BigDecimal)parms[142], 5);
               }
               if ( ((Boolean) parms[143]).booleanValue() )
               {
                  stmt.setNull( 73 , Types.DATE );
               }
               else
               {
                  stmt.setDate(73, (java.util.Date)parms[144]);
               }
               if ( ((Boolean) parms[145]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[146], 8);
               }
               if ( ((Boolean) parms[147]).booleanValue() )
               {
                  stmt.setNull( 75 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(75, (java.math.BigDecimal)parms[148], 2);
               }
               stmt.setString(76, (String)parms[149], 3);
               stmt.setInt(77, ((Number) parms[150]).intValue());
               stmt.setString(78, (String)parms[151], 16);
               return;
      }
   }

}

