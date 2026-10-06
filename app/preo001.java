package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preo001 extends GXProcedure
{
   public preo001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preo001.class ), "" );
   }

   public preo001( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 ,
                           String[] aP6 ,
                           int[] aP7 ,
                           byte[] aP8 ,
                           int[] aP9 ,
                           java.math.BigDecimal[] aP10 ,
                           java.math.BigDecimal[] aP11 ,
                           String[] aP12 ,
                           short[] aP13 ,
                           String[] aP14 ,
                           String[] aP15 ,
                           short[] aP16 ,
                           short[] aP17 ,
                           byte[] aP18 ,
                           byte[] aP19 )
   {
      preo001.this.aP20 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
      return aP20[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        byte[] aP8 ,
                        int[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        String[] aP12 ,
                        short[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        short[] aP16 ,
                        short[] aP17 ,
                        byte[] aP18 ,
                        byte[] aP19 ,
                        byte[] aP20 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 ,
                             int[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             String[] aP12 ,
                             short[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             short[] aP16 ,
                             short[] aP17 ,
                             byte[] aP18 ,
                             byte[] aP19 ,
                             byte[] aP20 )
   {
      preo001.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preo001.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      preo001.this.AV16BarConReo = aP2[0];
      this.aP2 = aP2;
      preo001.this.AV17BarParPan = aP3[0];
      this.aP3 = aP3;
      preo001.this.AV18BarCodOri = aP4[0];
      this.aP4 = aP4;
      preo001.this.AV19BarReoOri = aP5[0];
      this.aP5 = aP5;
      preo001.this.AV20BarParOri = aP6[0];
      this.aP6 = aP6;
      preo001.this.AV21DisCod = aP7[0];
      this.aP7 = aP7;
      preo001.this.AV22Sit2 = aP8[0];
      this.aP8 = aP8;
      preo001.this.AV23BarPieNDes = aP9[0];
      this.aP9 = aP9;
      preo001.this.AV24CosPro = aP10[0];
      this.aP10 = aP10;
      preo001.this.AV25CosAny = aP11[0];
      this.aP11 = aP11;
      preo001.this.AV26BarMaqCod = aP12[0];
      this.aP12 = aP12;
      preo001.this.AV27BarNumAny = aP13[0];
      this.aP13 = aP13;
      preo001.this.AV28BarConPar = aP14[0];
      this.aP14 = aP14;
      preo001.this.AV29DisDes = aP15[0];
      this.aP15 = aP15;
      preo001.this.AV30TipDefCod = aP16[0];
      this.aP16 = aP16;
      preo001.this.AV31TipDefPor = aP17[0];
      this.aP17 = aP17;
      preo001.this.AV32Flag = aP18[0];
      this.aP18 = aP18;
      preo001.this.AV33BarEstReo = aP19[0];
      this.aP19 = aP19;
      preo001.this.AV34BarOpeEsp = aP20[0];
      this.aP20 = aP20;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV43station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      preo001.this.GXt_char1 = GXv_char2[0] ;
      AV43station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV46EmprNom ;
      GXv_char4[0] = AV44UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43station, GXv_char2, GXv_char3, GXv_char4) ;
      preo001.this.A396EmprCod = GXv_char2[0] ;
      preo001.this.AV46EmprNom = GXv_char3[0] ;
      preo001.this.AV44UsurCod = GXv_char4[0] ;
      AV37FlagTn = (byte)(0) ;
      GXv_int5[0] = AV37FlagTn ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VELLUT", ""), GXv_int5) ;
      preo001.this.AV37FlagTn = GXv_int5[0] ;
      AV56F_endutex = (byte)(0) ;
      GXv_int5[0] = AV56F_endutex ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int5) ;
      preo001.this.AV56F_endutex = GXv_int5[0] ;
      AV57F_tinamar = (byte)(0) ;
      GXv_int5[0] = AV57F_tinamar ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int5) ;
      preo001.this.AV57F_tinamar = GXv_int5[0] ;
      AV58F_carvema = (byte)(0) ;
      GXv_int5[0] = AV58F_carvema ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int5) ;
      preo001.this.AV58F_carvema = GXv_int5[0] ;
      AV59FlagInt = (byte)(0) ;
      GXv_int5[0] = AV59FlagInt ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODINT", ""), GXv_int5) ;
      preo001.this.AV59FlagInt = GXv_int5[0] ;
      GXt_int6 = AV62F_fechdr ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FECHDR", ""), GXv_int5) ;
      preo001.this.GXt_int6 = GXv_int5[0] ;
      AV62F_fechdr = GXt_int6 ;
      GXt_int6 = AV65Texfina ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int5) ;
      preo001.this.GXt_int6 = GXv_int5[0] ;
      AV65Texfina = GXt_int6 ;
      GXt_int6 = AV76CtrlUsu ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CRTLOS", ""), GXv_int5) ;
      preo001.this.GXt_int6 = GXv_int5[0] ;
      AV76CtrlUsu = GXt_int6 ;
      GXt_int6 = AV78Orient ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int5) ;
      preo001.this.GXt_int6 = GXv_int5[0] ;
      AV78Orient = GXt_int6 ;
      GXt_int6 = AV80carvitin ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int5) ;
      preo001.this.GXt_int6 = GXv_int5[0] ;
      AV80carvitin = GXt_int6 ;
      /* Using cursor P04QU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCodOri), Byte.valueOf(AV19BarReoOri), AV20BarParOri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1832BarLisInd = P04QU2_A1832BarLisInd[0] ;
         A1652BarSerDsc = P04QU2_A1652BarSerDsc[0] ;
         A1503BarPart = P04QU2_A1503BarPart[0] ;
         A1431BarLocDis = P04QU2_A1431BarLocDis[0] ;
         A1254BarPesBal = P04QU2_A1254BarPesBal[0] ;
         A1235BarNumCli = P04QU2_A1235BarNumCli[0] ;
         A1234BarNomCli = P04QU2_A1234BarNomCli[0] ;
         A1226BarGraCru = P04QU2_A1226BarGraCru[0] ;
         A1224BarEncAnh = P04QU2_A1224BarEncAnh[0] ;
         A1223BarEncCom = P04QU2_A1223BarEncCom[0] ;
         A921BarMatiz = P04QU2_A921BarMatiz[0] ;
         A1003BarFecLan = P04QU2_A1003BarFecLan[0] ;
         n1003BarFecLan = P04QU2_n1003BarFecLan[0] ;
         A905ObsReoULin = P04QU2_A905ObsReoULin[0] ;
         n905ObsReoULin = P04QU2_n905ObsReoULin[0] ;
         A904ObsReoEnt = P04QU2_A904ObsReoEnt[0] ;
         n904ObsReoEnt = P04QU2_n904ObsReoEnt[0] ;
         A864BarPes = P04QU2_A864BarPes[0] ;
         A646NotUltLin = P04QU2_A646NotUltLin[0] ;
         n646NotUltLin = P04QU2_n646NotUltLin[0] ;
         A144BarDisOri = P04QU2_A144BarDisOri[0] ;
         A190BarNumAso = P04QU2_A190BarNumAso[0] ;
         A149BarEstRes = P04QU2_A149BarEstRes[0] ;
         A147BarEstCol = P04QU2_A147BarEstCol[0] ;
         A158BarFecFpr = P04QU2_A158BarFecFpr[0] ;
         A163BarHorCum = P04QU2_A163BarHorCum[0] ;
         A209BarPri = P04QU2_A209BarPri[0] ;
         A145BarEncOri = P04QU2_A145BarEncOri[0] ;
         A139BarCorOri = P04QU2_A139BarCorOri[0] ;
         A214BarSua = P04QU2_A214BarSua[0] ;
         A177BarLar = P04QU2_A177BarLar[0] ;
         A206BarPle = P04QU2_A206BarPle[0] ;
         A126BarAncAca2 = P04QU2_A126BarAncAca2[0] ;
         A125BarAncAca1 = P04QU2_A125BarAncAca1[0] ;
         A128BarAncCru2 = P04QU2_A128BarAncCru2[0] ;
         A127BarAncCru1 = P04QU2_A127BarAncCru1[0] ;
         A234BarUrdP3 = P04QU2_A234BarUrdP3[0] ;
         A231BarUrd3 = P04QU2_A231BarUrd3[0] ;
         A233BarUrdP2 = P04QU2_A233BarUrdP2[0] ;
         A230BarUrd2 = P04QU2_A230BarUrd2[0] ;
         A232BarUrdP1 = P04QU2_A232BarUrdP1[0] ;
         A229BarUrd1 = P04QU2_A229BarUrd1[0] ;
         A226BarTraP3 = P04QU2_A226BarTraP3[0] ;
         A223BarTra3 = P04QU2_A223BarTra3[0] ;
         A225BarTraP2 = P04QU2_A225BarTraP2[0] ;
         A222BarTra2 = P04QU2_A222BarTra2[0] ;
         A224BarTraP1 = P04QU2_A224BarTraP1[0] ;
         A221BarTra1 = P04QU2_A221BarTra1[0] ;
         A211BarRdt = P04QU2_A211BarRdt[0] ;
         A182BarMat = P04QU2_A182BarMat[0] ;
         A142BarDiaP = P04QU2_A142BarDiaP[0] ;
         A235BarUrg = P04QU2_A235BarUrg[0] ;
         A161BarFecSal = P04QU2_A161BarFecSal[0] ;
         A181BarMaqPro = P04QU2_A181BarMaqPro[0] ;
         A157BarFecEnt = P04QU2_A157BarFecEnt[0] ;
         A196BarOrdReo = P04QU2_A196BarOrdReo[0] ;
         A191BarNumPie = P04QU2_A191BarNumPie[0] ;
         A155BarFecCli = P04QU2_A155BarFecCli[0] ;
         A228BarUniMed = P04QU2_A228BarUniMed[0] ;
         A192BarNumUni = P04QU2_A192BarNumUni[0] ;
         A218BarTipCol = P04QU2_A218BarTipCol[0] ;
         A136BarColNum = P04QU2_A136BarColNum[0] ;
         A135BarColNom = P04QU2_A135BarColNom[0] ;
         A217BarTipArt = P04QU2_A217BarTipArt[0] ;
         n217BarTipArt = P04QU2_n217BarTipArt[0] ;
         A212BarSer = P04QU2_A212BarSer[0] ;
         A143BarDisNum = P04QU2_A143BarDisNum[0] ;
         A236BarVolMaq = P04QU2_A236BarVolMaq[0] ;
         A120BarAgrEst = P04QU2_A120BarAgrEst[0] ;
         A4840BarAudMDig = P04QU2_A4840BarAudMDig[0] ;
         n4840BarAudMDig = P04QU2_n4840BarAudMDig[0] ;
         A4838BarAudNPz = P04QU2_A4838BarAudNPz[0] ;
         n4838BarAudNPz = P04QU2_n4838BarAudNPz[0] ;
         A4834BarAudOpe = P04QU2_A4834BarAudOpe[0] ;
         n4834BarAudOpe = P04QU2_n4834BarAudOpe[0] ;
         A4832BarAudFec = P04QU2_A4832BarAudFec[0] ;
         n4832BarAudFec = P04QU2_n4832BarAudFec[0] ;
         A8568EntSecUlt = P04QU2_A8568EntSecUlt[0] ;
         n8568EntSecUlt = P04QU2_n8568EntSecUlt[0] ;
         A8098BarOpeHis = P04QU2_A8098BarOpeHis[0] ;
         A8097BarFecHis = P04QU2_A8097BarFecHis[0] ;
         A7733BarMaqEst = P04QU2_A7733BarMaqEst[0] ;
         A5406BarAntpT = P04QU2_A5406BarAntpT[0] ;
         A5367BarAntp = P04QU2_A5367BarAntp[0] ;
         A5293BarCodBan = P04QU2_A5293BarCodBan[0] ;
         A5057BarFacAbs = P04QU2_A5057BarFacAbs[0] ;
         n5057BarFacAbs = P04QU2_n5057BarFacAbs[0] ;
         A5056BarBp15 = P04QU2_A5056BarBp15[0] ;
         n5056BarBp15 = P04QU2_n5056BarBp15[0] ;
         A5055BarBp14 = P04QU2_A5055BarBp14[0] ;
         n5055BarBp14 = P04QU2_n5055BarBp14[0] ;
         A5054BarBp13 = P04QU2_A5054BarBp13[0] ;
         n5054BarBp13 = P04QU2_n5054BarBp13[0] ;
         A5009BarLoteA = P04QU2_A5009BarLoteA[0] ;
         A4975BarNumReo = P04QU2_A4975BarNumReo[0] ;
         A4908BarMacPro = P04QU2_A4908BarMacPro[0] ;
         A4845BarAudObs = P04QU2_A4845BarAudObs[0] ;
         n4845BarAudObs = P04QU2_n4845BarAudObs[0] ;
         A4836BarAudSup = P04QU2_A4836BarAudSup[0] ;
         A4812BarEncCli = P04QU2_A4812BarEncCli[0] ;
         A4613BarHorReg = P04QU2_A4613BarHorReg[0] ;
         n4613BarHorReg = P04QU2_n4613BarHorReg[0] ;
         A4612BarPzas = P04QU2_A4612BarPzas[0] ;
         n4612BarPzas = P04QU2_n4612BarPzas[0] ;
         A4611BarHorEnt = P04QU2_A4611BarHorEnt[0] ;
         n4611BarHorEnt = P04QU2_n4611BarHorEnt[0] ;
         A4610BarTam = P04QU2_A4610BarTam[0] ;
         A4467BarAcaMar = P04QU2_A4467BarAcaMar[0] ;
         A4466BarAcaAnh = P04QU2_A4466BarAcaAnh[0] ;
         A4465BarAcaBak = P04QU2_A4465BarAcaBak[0] ;
         n4465BarAcaBak = P04QU2_n4465BarAcaBak[0] ;
         A4464BarAcaFor = P04QU2_A4464BarAcaFor[0] ;
         n4464BarAcaFor = P04QU2_n4464BarAcaFor[0] ;
         A4463BarLotMaq = P04QU2_A4463BarLotMaq[0] ;
         n4463BarLotMaq = P04QU2_n4463BarLotMaq[0] ;
         A4462BarLotKgs = P04QU2_A4462BarLotKgs[0] ;
         A4461BarLotMts = P04QU2_A4461BarLotMts[0] ;
         A4460BarLotPza = P04QU2_A4460BarLotPza[0] ;
         n4460BarLotPza = P04QU2_n4460BarLotPza[0] ;
         A4459BarCruEnr = P04QU2_A4459BarCruEnr[0] ;
         A4458BarCruKgs = P04QU2_A4458BarCruKgs[0] ;
         n4458BarCruKgs = P04QU2_n4458BarCruKgs[0] ;
         A4457BarCruMts = P04QU2_A4457BarCruMts[0] ;
         n4457BarCruMts = P04QU2_n4457BarCruMts[0] ;
         A4456BarPelAnh = P04QU2_A4456BarPelAnh[0] ;
         A4400BarSitEst = P04QU2_A4400BarSitEst[0] ;
         A4017BarInci = P04QU2_A4017BarInci[0] ;
         A4016BarTin = P04QU2_A4016BarTin[0] ;
         A4015BarEnv = P04QU2_A4015BarEnv[0] ;
         A2512BarComULin = P04QU2_A2512BarComULin[0] ;
         n2512BarComULin = P04QU2_n2512BarComULin[0] ;
         A1799BarDibInt = P04QU2_A1799BarDibInt[0] ;
         A1798BarDibCli = P04QU2_A1798BarDibCli[0] ;
         A3871BarFecCRe = P04QU2_A3871BarFecCRe[0] ;
         A3870BarFecLRe = P04QU2_A3870BarFecLRe[0] ;
         A3787BarEnvRec = P04QU2_A3787BarEnvRec[0] ;
         n3787BarEnvRec = P04QU2_n3787BarEnvRec[0] ;
         A3746BarNPed = P04QU2_A3746BarNPed[0] ;
         A3745BarFoa = P04QU2_A3745BarFoa[0] ;
         A3313BarNumTon = P04QU2_A3313BarNumTon[0] ;
         A3138BarGraCru2 = P04QU2_A3138BarGraCru2[0] ;
         A3137BarGraAca2 = P04QU2_A3137BarGraAca2[0] ;
         A3136BarAncSal3 = P04QU2_A3136BarAncSal3[0] ;
         A3135BarAncSal2 = P04QU2_A3135BarAncSal2[0] ;
         A3134BarAncSal1 = P04QU2_A3134BarAncSal1[0] ;
         A3133BarNumCor = P04QU2_A3133BarNumCor[0] ;
         A2836BarPle2 = P04QU2_A2836BarPle2[0] ;
         A3030BarPlf = P04QU2_A3030BarPlf[0] ;
         A3006BarCoef = P04QU2_A3006BarCoef[0] ;
         n3006BarCoef = P04QU2_n3006BarCoef[0] ;
         A2829BarProPer = P04QU2_A2829BarProPer[0] ;
         A2828BarMtrLot = P04QU2_A2828BarMtrLot[0] ;
         A2827BarKgsLot = P04QU2_A2827BarKgsLot[0] ;
         A2803UltLinMaq = P04QU2_A2803UltLinMaq[0] ;
         n2803UltLinMaq = P04QU2_n2803UltLinMaq[0] ;
         A2759BarMaqGru = P04QU2_A2759BarMaqGru[0] ;
         A2754BarSitExt = P04QU2_A2754BarSitExt[0] ;
         A2753BarNumTex2 = P04QU2_A2753BarNumTex2[0] ;
         n2753BarNumTex2 = P04QU2_n2753BarNumTex2[0] ;
         A2746BarCodTex = P04QU2_A2746BarCodTex[0] ;
         n2746BarCodTex = P04QU2_n2746BarCodTex[0] ;
         A2487BarConEle = P04QU2_A2487BarConEle[0] ;
         A2488BarConVap = P04QU2_A2488BarConVap[0] ;
         A2486BarConAgu = P04QU2_A2486BarConAgu[0] ;
         A2496BarFecFin = P04QU2_A2496BarFecFin[0] ;
         A2497BarFecIni = P04QU2_A2497BarFecIni[0] ;
         A2500BarRDos2 = P04QU2_A2500BarRDos2[0] ;
         A2499BarRDos1 = P04QU2_A2499BarRDos1[0] ;
         A2498BarPrdPes = P04QU2_A2498BarPrdPes[0] ;
         A2485BarColPes = P04QU2_A2485BarColPes[0] ;
         A1911BarRdoA = P04QU2_A1911BarRdoA[0] ;
         A1910BarRdoN = P04QU2_A1910BarRdoN[0] ;
         A1909BarGraAca = P04QU2_A1909BarGraAca[0] ;
         A2458BarObsVL = P04QU2_A2458BarObsVL[0] ;
         n2458BarObsVL = P04QU2_n2458BarObsVL[0] ;
         A2453BarEntAca = P04QU2_A2453BarEntAca[0] ;
         n2453BarEntAca = P04QU2_n2453BarEntAca[0] ;
         A2452BarCal = P04QU2_A2452BarCal[0] ;
         n2452BarCal = P04QU2_n2452BarCal[0] ;
         A2459BarTemSec = P04QU2_A2459BarTemSec[0] ;
         A2455BarNMont = P04QU2_A2455BarNMont[0] ;
         n2455BarNMont = P04QU2_n2455BarNMont[0] ;
         A2454BarGirar = P04QU2_A2454BarGirar[0] ;
         A2460BarTipAca = P04QU2_A2460BarTipAca[0] ;
         A2450BarKgEnR = P04QU2_A2450BarKgEnR[0] ;
         n2450BarKgEnR = P04QU2_n2450BarKgEnR[0] ;
         A2443BarBulEnR = P04QU2_A2443BarBulEnR[0] ;
         n2443BarBulEnR = P04QU2_n2443BarBulEnR[0] ;
         A2448BarFecEnR = P04QU2_A2448BarFecEnR[0] ;
         n2448BarFecEnR = P04QU2_n2448BarFecEnR[0] ;
         A2446BarEnULin = P04QU2_A2446BarEnULin[0] ;
         n2446BarEnULin = P04QU2_n2446BarEnULin[0] ;
         A2445BarEntEnE = P04QU2_A2445BarEntEnE[0] ;
         A2449BarKgEnE = P04QU2_A2449BarKgEnE[0] ;
         n2449BarKgEnE = P04QU2_n2449BarKgEnE[0] ;
         A2442BarBulEnE = P04QU2_A2442BarBulEnE[0] ;
         n2442BarBulEnE = P04QU2_n2442BarBulEnE[0] ;
         A2447BarFecEnE = P04QU2_A2447BarFecEnE[0] ;
         A2401BarNumPas = P04QU2_A2401BarNumPas[0] ;
         n2401BarNumPas = P04QU2_n2401BarNumPas[0] ;
         A2311BarCliDes = P04QU2_A2311BarCliDes[0] ;
         A2265BarExt = P04QU2_A2265BarExt[0] ;
         n2265BarExt = P04QU2_n2265BarExt[0] ;
         A2010BarTipDis = P04QU2_A2010BarTipDis[0] ;
         A1923BarCodTN = P04QU2_A1923BarCodTN[0] ;
         A1878BarNumTen = P04QU2_A1878BarNumTen[0] ;
         A365DisDes = P04QU2_A365DisDes[0] ;
         A5058BarEnvLaw = P04QU2_A5058BarEnvLaw[0] ;
         A3783BarRecLis = P04QU2_A3783BarRecLis[0] ;
         A3594BarPriTin = P04QU2_A3594BarPriTin[0] ;
         A4837BarAudSupN = P04QU2_A4837BarAudSupN[0] ;
         n4837BarAudSupN = P04QU2_n4837BarAudSupN[0] ;
         A4835BarAudOpeN = P04QU2_A4835BarAudOpeN[0] ;
         n4835BarAudOpeN = P04QU2_n4835BarAudOpeN[0] ;
         A4833BarAudTur = P04QU2_A4833BarAudTur[0] ;
         n4833BarAudTur = P04QU2_n4833BarAudTur[0] ;
         A9790BarItem6 = P04QU2_A9790BarItem6[0] ;
         A9789BarItem5 = P04QU2_A9789BarItem5[0] ;
         A9778BarItem4 = P04QU2_A9778BarItem4[0] ;
         A9777BarItem3 = P04QU2_A9777BarItem3[0] ;
         A9776barItem2 = P04QU2_A9776barItem2[0] ;
         A9775BarItem1 = P04QU2_A9775BarItem1[0] ;
         A6434BarAsi = P04QU2_A6434BarAsi[0] ;
         A5352BarObsAnc = P04QU2_A5352BarObsAnc[0] ;
         A5351BarObsGrm = P04QU2_A5351BarObsGrm[0] ;
         A5291BarTipCor = P04QU2_A5291BarTipCor[0] ;
         A5253BarAcc = P04QU2_A5253BarAcc[0] ;
         A5053BarBp12 = P04QU2_A5053BarBp12[0] ;
         n5053BarBp12 = P04QU2_n5053BarBp12[0] ;
         A5034BarEstTip = P04QU2_A5034BarEstTip[0] ;
         A5033BarCom = P04QU2_A5033BarCom[0] ;
         A5027BarGraCob = P04QU2_A5027BarGraCob[0] ;
         A5026BarTipEst = P04QU2_A5026BarTipEst[0] ;
         A4937BarCtrPdas = P04QU2_A4937BarCtrPdas[0] ;
         n4937BarCtrPdas = P04QU2_n4937BarCtrPdas[0] ;
         A4716BarDishCod = P04QU2_A4716BarDishCod[0] ;
         A4609BarMdlCod = P04QU2_A4609BarMdlCod[0] ;
         A4018BarBot = P04QU2_A4018BarBot[0] ;
         A3744BarPeg = P04QU2_A3744BarPeg[0] ;
         A3595BarMacCod = P04QU2_A3595BarMacCod[0] ;
         A3312BarManCod2 = P04QU2_A3312BarManCod2[0] ;
         A3311BarManCod1 = P04QU2_A3311BarManCod1[0] ;
         A3310BarFac = P04QU2_A3310BarFac[0] ;
         A2830BarIntPer = P04QU2_A2830BarIntPer[0] ;
         A2826BarNumLot = P04QU2_A2826BarNumLot[0] ;
         A2752BarNumTex1 = P04QU2_A2752BarNumTex1[0] ;
         A2400BarManCod = P04QU2_A2400BarManCod[0] ;
         A1499BarNMez = P04QU2_A1499BarNMez[0] ;
         A1500BarNMtr = P04QU2_A1500BarNMtr[0] ;
         A935BarReoPar = P04QU2_A935BarReoPar[0] ;
         A936BarReoReo = P04QU2_A936BarReoReo[0] ;
         A934BarReoCod = P04QU2_A934BarReoCod[0] ;
         A899TipDefPor = P04QU2_A899TipDefPor[0] ;
         n899TipDefPor = P04QU2_n899TipDefPor[0] ;
         A833TipDefCod = P04QU2_A833TipDefCod[0] ;
         n833TipDefCod = P04QU2_n833TipDefCod[0] ;
         A178BarLis = P04QU2_A178BarLis[0] ;
         A169BarKgsFac = P04QU2_A169BarKgsFac[0] ;
         A140BarCosAny = P04QU2_A140BarCosAny[0] ;
         A141BarCosPro = P04QU2_A141BarCosPro[0] ;
         A189BarNumAny = P04QU2_A189BarNumAny[0] ;
         A137BarConPar = P04QU2_A137BarConPar[0] ;
         A138BarConReo = P04QU2_A138BarConReo[0] ;
         A213BarSit = P04QU2_A213BarSit[0] ;
         A146BarEst = P04QU2_A146BarEst[0] ;
         A118BarAcaQui = P04QU2_A118BarAcaQui[0] ;
         A193BarOpeEsp = P04QU2_A193BarOpeEsp[0] ;
         A148BarEstReo = P04QU2_A148BarEstReo[0] ;
         A159BarFecGen = P04QU2_A159BarFecGen[0] ;
         A361DisCod = P04QU2_A361DisCod[0] ;
         A180BarMaqCod = P04QU2_A180BarMaqCod[0] ;
         A130BarCodPar = P04QU2_A130BarCodPar[0] ;
         A132BarCodReo = P04QU2_A132BarCodReo[0] ;
         A129BarCod = P04QU2_A129BarCod[0] ;
         A252CliCod = P04QU2_A252CliCod[0] ;
         n252CliCod = P04QU2_n252CliCod[0] ;
         A14330BarPriorid = P04QU2_A14330BarPriorid[0] ;
         A14329BarCnoEncO = P04QU2_A14329BarCnoEncO[0] ;
         A13908BarIdtx2 = P04QU2_A13908BarIdtx2[0] ;
         n13908BarIdtx2 = P04QU2_n13908BarIdtx2[0] ;
         A13907BarSerDsc2 = P04QU2_A13907BarSerDsc2[0] ;
         n13907BarSerDsc2 = P04QU2_n13907BarSerDsc2[0] ;
         A13769BarRdto4 = P04QU2_A13769BarRdto4[0] ;
         n13769BarRdto4 = P04QU2_n13769BarRdto4[0] ;
         A13234BarRGB = P04QU2_A13234BarRGB[0] ;
         A13092BarDGUltLi = P04QU2_A13092BarDGUltLi[0] ;
         n13092BarDGUltLi = P04QU2_n13092BarDGUltLi[0] ;
         A13077BarLinPrd = P04QU2_A13077BarLinPrd[0] ;
         A13071BarCanalID = P04QU2_A13071BarCanalID[0] ;
         A13070BarLineaID = P04QU2_A13070BarLineaID[0] ;
         A12881BarOEKOTEX = P04QU2_A12881BarOEKOTEX[0] ;
         n12881BarOEKOTEX = P04QU2_n12881BarOEKOTEX[0] ;
         A12811BarLocCol = P04QU2_A12811BarLocCol[0] ;
         A12810BarLocMol = P04QU2_A12810BarLocMol[0] ;
         A12809BarLocTel = P04QU2_A12809BarLocTel[0] ;
         A12774BarProdID = P04QU2_A12774BarProdID[0] ;
         A12767BarTpEstam = P04QU2_A12767BarTpEstam[0] ;
         A12329SubRevID = P04QU2_A12329SubRevID[0] ;
         n12329SubRevID = P04QU2_n12329SubRevID[0] ;
         A11857Nxt_desaID = P04QU2_A11857Nxt_desaID[0] ;
         n11857Nxt_desaID = P04QU2_n11857Nxt_desaID[0] ;
         A11855Nxt_dpoID = P04QU2_A11855Nxt_dpoID[0] ;
         n11855Nxt_dpoID = P04QU2_n11855Nxt_dpoID[0] ;
         A11853Nxt_cpeID = P04QU2_A11853Nxt_cpeID[0] ;
         n11853Nxt_cpeID = P04QU2_n11853Nxt_cpeID[0] ;
         A11852Nxt_ArtCl2 = P04QU2_A11852Nxt_ArtCl2[0] ;
         A11851Nxt_Sta2 = P04QU2_A11851Nxt_Sta2[0] ;
         A11850Nxt_Mdlo2 = P04QU2_A11850Nxt_Mdlo2[0] ;
         A3736BarPieMtl = P04QU2_A3736BarPieMtl[0] ;
         A3735BarPieKgl = P04QU2_A3735BarPieKgl[0] ;
         A3363BarPiePrv = P04QU2_A3363BarPiePrv[0] ;
         A3362BarMtsPrv = P04QU2_A3362BarMtsPrv[0] ;
         A3361BarKgsPrv = P04QU2_A3361BarKgsPrv[0] ;
         A3786BarEnvBar = P04QU2_A3786BarEnvBar[0] ;
         A3785BarUltAny = P04QU2_A3785BarUltAny[0] ;
         A3784BarAnyTie = P04QU2_A3784BarAnyTie[0] ;
         A3780BarKilLam = P04QU2_A3780BarKilLam[0] ;
         A3597BarVolAma = P04QU2_A3597BarVolAma[0] ;
         A3596BarMaqAma = P04QU2_A3596BarMaqAma[0] ;
         A11662BarOrdComp = P04QU2_A11662BarOrdComp[0] ;
         A4844BarAudULin = P04QU2_A4844BarAudULin[0] ;
         n4844BarAudULin = P04QU2_n4844BarAudULin[0] ;
         A4841BarAudMCue = P04QU2_A4841BarAudMCue[0] ;
         n4841BarAudMCue = P04QU2_n4841BarAudMCue[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV38BarFac = A3310BarFac ;
         AV39BarManCod1 = A3311BarManCod1 ;
         AV40BarManCod2 = A3312BarManCod2 ;
         AV41BarManCod = A2400BarManCod ;
         AV66BarAcaqui = A118BarAcaQui ;
         AV61BarFecGen = A159BarFecGen ;
         AV67BarAsi = A6434BarAsi ;
         AV68Baraudtur = A4833BarAudTur ;
         AV69BarBot = A4018BarBot ;
         AV70barctrpdas = A4937BarCtrPdas ;
         AV79Maqcod = A180BarMaqCod ;
         AV71Fecha1 = localUtil.ctod( A1500BarNMtr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         AV72fecha2 = localUtil.ctod( A1499BarNMez, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         AV73Fecha3 = localUtil.ctod( A4609BarMdlCod, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         AV74Fecha4 = localUtil.ctod( A4716BarDishCod, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         AV47BarTipEst = A5026BarTipEst ;
         AV48BarGraCob = A5027BarGraCob ;
         AV49BarDishCod = A4716BarDishCod ;
         AV50BarCom = A5033BarCom ;
         AV51BarEstTip = A5034BarEstTip ;
         AV52BarTipCor = A5291BarTipCor ;
         AV53BarObsAnc = A5352BarObsAnc ;
         AV54BarObsGrm = A5351BarObsGrm ;
         AV55EstReo_2 = A148BarEstReo ;
         AV64Baracc = A5253BarAcc ;
         AV75Baritem1 = A9775BarItem1 ;
         AV82Baritem2 = A9776barItem2 ;
         AV83Baritem3 = A9777BarItem3 ;
         AV84Baritem4 = A9778BarItem4 ;
         AV85Baritem5 = A9789BarItem5 ;
         AV86Baritem6 = A9790BarItem6 ;
         AV81barmaccod = A3595BarMacCod ;
         /*
            INSERT RECORD ON TABLE TXPBARCAD

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W180BarMaqCod = A180BarMaqCod ;
         W180BarMaqCod = A180BarMaqCod ;
         W180BarMaqCod = A180BarMaqCod ;
         W193BarOpeEsp = A193BarOpeEsp ;
         W148BarEstReo = A148BarEstReo ;
         W2752BarNumTex1 = A2752BarNumTex1 ;
         W148BarEstReo = A148BarEstReo ;
         W159BarFecGen = A159BarFecGen ;
         W159BarFecGen = A159BarFecGen ;
         W213BarSit = A213BarSit ;
         W137BarConPar = A137BarConPar ;
         W189BarNumAny = A189BarNumAny ;
         W169BarKgsFac = A169BarKgsFac ;
         W141BarCosPro = A141BarCosPro ;
         W140BarCosAny = A140BarCosAny ;
         W934BarReoCod = A934BarReoCod ;
         W936BarReoReo = A936BarReoReo ;
         W935BarReoPar = A935BarReoPar ;
         W934BarReoCod = A934BarReoCod ;
         W936BarReoReo = A936BarReoReo ;
         W935BarReoPar = A935BarReoPar ;
         W138BarConReo = A138BarConReo ;
         W361DisCod = A361DisCod ;
         W365DisDes = A365DisDes ;
         W833TipDefCod = A833TipDefCod ;
         n833TipDefCod = false ;
         W899TipDefPor = A899TipDefPor ;
         n899TipDefPor = false ;
         W146BarEst = A146BarEst ;
         W180BarMaqCod = A180BarMaqCod ;
         W3310BarFac = A3310BarFac ;
         W2400BarManCod = A2400BarManCod ;
         W3311BarManCod1 = A3311BarManCod1 ;
         W3312BarManCod2 = A3312BarManCod2 ;
         W178BarLis = A178BarLis ;
         W5026BarTipEst = A5026BarTipEst ;
         W5027BarGraCob = A5027BarGraCob ;
         W4716BarDishCod = A4716BarDishCod ;
         W5033BarCom = A5033BarCom ;
         W5034BarEstTip = A5034BarEstTip ;
         W5291BarTipCor = A5291BarTipCor ;
         W5352BarObsAnc = A5352BarObsAnc ;
         W5351BarObsGrm = A5351BarObsGrm ;
         W2830BarIntPer = A2830BarIntPer ;
         W5253BarAcc = A5253BarAcc ;
         W118BarAcaQui = A118BarAcaQui ;
         W5058BarEnvLaw = A5058BarEnvLaw ;
         W6434BarAsi = A6434BarAsi ;
         W4833BarAudTur = A4833BarAudTur ;
         n4833BarAudTur = false ;
         W4018BarBot = A4018BarBot ;
         W4937BarCtrPdas = A4937BarCtrPdas ;
         n4937BarCtrPdas = false ;
         W1500BarNMtr = A1500BarNMtr ;
         W1499BarNMez = A1499BarNMez ;
         W4609BarMdlCod = A4609BarMdlCod ;
         W4716BarDishCod = A4716BarDishCod ;
         W3744BarPeg = A3744BarPeg ;
         W5027BarGraCob = A5027BarGraCob ;
         W5053BarBp12 = A5053BarBp12 ;
         n5053BarBp12 = false ;
         W9775BarItem1 = A9775BarItem1 ;
         W9776barItem2 = A9776barItem2 ;
         W9777BarItem3 = A9777BarItem3 ;
         W9778BarItem4 = A9778BarItem4 ;
         W9789BarItem5 = A9789BarItem5 ;
         W9790BarItem6 = A9790BarItem6 ;
         W4835BarAudOpeN = A4835BarAudOpeN ;
         n4835BarAudOpeN = false ;
         W4837BarAudSupN = A4837BarAudSupN ;
         n4837BarAudSupN = false ;
         W3594BarPriTin = A3594BarPriTin ;
         W3595BarMacCod = A3595BarMacCod ;
         W3783BarRecLis = A3783BarRecLis ;
         W2826BarNumLot = A2826BarNumLot ;
         if ( AV37FlagTn == 1 )
         {
            A129BarCod = AV15BarCod ;
         }
         A132BarCodReo = AV16BarConReo ;
         A130BarCodPar = AV17BarParPan ;
         if ( AV33BarEstReo == 1 )
         {
            if ( ( AV78Orient == 0 ) && ( AV56F_endutex == 0 ) )
            {
               A180BarMaqCod = GXutil.space( (short)(6)) ;
            }
            else
            {
               A180BarMaqCod = AV79Maqcod ;
            }
         }
         else
         {
            A180BarMaqCod = AV26BarMaqCod ;
         }
         A193BarOpeEsp = AV34BarOpeEsp ;
         A148BarEstReo = AV33BarEstReo ;
         if ( ( AV33BarEstReo == 1 ) && ( AV78Orient == 0 ) )
         {
            A2752BarNumTex1 = (byte)(4) ;
         }
         if ( ( AV56F_endutex == 1 ) || ( AV57F_tinamar == 1 ) )
         {
            if ( ( AV55EstReo_2 == 2 ) && ( AV33BarEstReo == 1 ) )
            {
               A148BarEstReo = AV55EstReo_2 ;
            }
         }
         if ( AV62F_fechdr == 1 )
         {
            A159BarFecGen = AV61BarFecGen ;
         }
         else
         {
            A159BarFecGen = Gx_date ;
         }
         A213BarSit = AV22Sit2 ;
         A137BarConPar = AV28BarConPar ;
         A189BarNumAny = AV27BarNumAny ;
         A169BarKgsFac = DecimalUtil.doubleToDec(0) ;
         A141BarCosPro = AV24CosPro ;
         A140BarCosAny = AV25CosAny ;
         if ( AV32Flag == 1 )
         {
            A934BarReoCod = AV18BarCodOri ;
            A936BarReoReo = AV19BarReoOri ;
            A935BarReoPar = AV20BarParOri ;
         }
         else
         {
            A934BarReoCod = 0 ;
            A936BarReoReo = (byte)(0) ;
            A935BarReoPar = "" ;
         }
         A138BarConReo = (byte)(0) ;
         A361DisCod = AV21DisCod ;
         A365DisDes = AV29DisDes ;
         A833TipDefCod = AV30TipDefCod ;
         n833TipDefCod = false ;
         A899TipDefPor = AV31TipDefPor ;
         n899TipDefPor = false ;
         if ( AV36FlagJM == 1 )
         {
            A146BarEst = (byte)(0) ;
            A180BarMaqCod = GXutil.substring( AV26BarMaqCod, 1, 4) ;
         }
         A3310BarFac = AV38BarFac ;
         A2400BarManCod = AV41BarManCod ;
         A3311BarManCod1 = AV39BarManCod1 ;
         A3312BarManCod2 = AV40BarManCod2 ;
         A178BarLis = (byte)(0) ;
         A5026BarTipEst = AV47BarTipEst ;
         A5027BarGraCob = AV48BarGraCob ;
         A4716BarDishCod = AV49BarDishCod ;
         A5033BarCom = AV50BarCom ;
         A5034BarEstTip = AV51BarEstTip ;
         A5291BarTipCor = AV52BarTipCor ;
         A5352BarObsAnc = AV53BarObsAnc ;
         A5351BarObsGrm = AV54BarObsGrm ;
         if ( AV59FlagInt == 1 )
         {
            A2830BarIntPer = AV60BarIntPer ;
         }
         A5253BarAcc = AV64Baracc ;
         A118BarAcaQui = AV66BarAcaqui ;
         if ( AV58F_carvema == 1 )
         {
            A5058BarEnvLaw = GXutil.space( (short)(1)) ;
            A6434BarAsi = (byte)(0) ;
            A4833BarAudTur = (byte)(0) ;
            n4833BarAudTur = false ;
            A4018BarBot = " " ;
            A4937BarCtrPdas = (byte)(0) ;
            n4937BarCtrPdas = false ;
            A1500BarNMtr = " " ;
            A1499BarNMez = " " ;
            A4609BarMdlCod = " " ;
            A4716BarDishCod = " " ;
            A3744BarPeg = GXutil.space( (short)(1)) ;
            A5027BarGraCob = (byte)(0) ;
            A5053BarBp12 = (short)(0) ;
            n5053BarBp12 = false ;
         }
         A9775BarItem1 = AV75Baritem1 ;
         A9776barItem2 = AV82Baritem2 ;
         A9777BarItem3 = AV83Baritem3 ;
         A9778BarItem4 = AV84Baritem4 ;
         A9789BarItem5 = AV85Baritem5 ;
         A9790BarItem6 = AV86Baritem6 ;
         if ( AV76CtrlUsu == 1 )
         {
            AV77Fecha_a = localUtil.dtoc( Gx_date, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            A4835BarAudOpeN = AV44UsurCod + " " + AV77Fecha_a + " " + Gx_time ;
            n4835BarAudOpeN = false ;
            A4837BarAudSupN = " " ;
            n4837BarAudSupN = false ;
         }
         A3594BarPriTin = (byte)(80) ;
         A3595BarMacCod = ((AV80carvitin==1) ? AV81barmaccod : 0) ;
         A3783BarRecLis = (byte)(0) ;
         A2826BarNumLot = 0 ;
         /* Using cursor P04QU3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A120BarAgrEst, A180BarMaqCod, Integer.valueOf(A236BarVolMaq), Integer.valueOf(A361DisCod), A143BarDisNum, A212BarSer, Boolean.valueOf(n217BarTipArt), Short.valueOf(A217BarTipArt), A135BarColNom, Integer.valueOf(A136BarColNum), Byte.valueOf(A218BarTipCol), A159BarFecGen, A192BarNumUni, A228BarUniMed, Byte.valueOf(A148BarEstReo), A155BarFecCli, Short.valueOf(A191BarNumPie), Byte.valueOf(A196BarOrdReo), A157BarFecEnt, A181BarMaqPro, Byte.valueOf(A193BarOpeEsp), A161BarFecSal, Byte.valueOf(A235BarUrg), A142BarDiaP, A182BarMat, A211BarRdt, A221BarTra1, Short.valueOf(A224BarTraP1), A222BarTra2, Short.valueOf(A225BarTraP2), A223BarTra3, Short.valueOf(A226BarTraP3), A229BarUrd1, Short.valueOf(A232BarUrdP1), A230BarUrd2, Short.valueOf(A233BarUrdP2), A231BarUrd3, Short.valueOf(A234BarUrdP3), Short.valueOf(A127BarAncCru1), Short.valueOf(A128BarAncCru2), Short.valueOf(A125BarAncAca1), Short.valueOf(A126BarAncAca2), A206BarPle, A177BarLar, A214BarSua, A118BarAcaQui, A139BarCorOri, A145BarEncOri, Byte.valueOf(A146BarEst), Byte.valueOf(A213BarSit), A209BarPri, Byte.valueOf(A138BarConReo), A137BarConPar, Short.valueOf(A189BarNumAny), A141BarCosPro, A140BarCosAny, A169BarKgsFac, Integer.valueOf(A163BarHorCum), A158BarFecFpr, Byte.valueOf(A147BarEstCol), Byte.valueOf(A149BarEstRes), Byte.valueOf(A190BarNumAso), Integer.valueOf(A144BarDisOri), Byte.valueOf(A178BarLis), Boolean.valueOf(n646NotUltLin), Byte.valueOf(A646NotUltLin), Short.valueOf(A864BarPes), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod), Boolean.valueOf(n899TipDefPor), Short.valueOf(A899TipDefPor), Boolean.valueOf(n904ObsReoEnt), A904ObsReoEnt, Boolean.valueOf(n905ObsReoULin), Byte.valueOf(A905ObsReoULin), Integer.valueOf(A934BarReoCod), Byte.valueOf(A936BarReoReo), A935BarReoPar, Boolean.valueOf(n1003BarFecLan), A1003BarFecLan, Short.valueOf(A921BarMatiz), A1223BarEncCom, A1224BarEncAnh, Short.valueOf(A1226BarGraCru), A1234BarNomCli, Integer.valueOf(A1235BarNumCli), Byte.valueOf(A1254BarPesBal), A1431BarLocDis, A1500BarNMtr, A1499BarNMez, Short.valueOf(A1503BarPart), A1652BarSerDsc, Byte.valueOf(A1832BarLisInd), A1878BarNumTen, Integer.valueOf(A1923BarCodTN), A2010BarTipDis, Boolean.valueOf(n2265BarExt), Byte.valueOf(A2265BarExt), Integer.valueOf(A2311BarCliDes), Short.valueOf(A2400BarManCod), Boolean.valueOf(n2401BarNumPas), Byte.valueOf(A2401BarNumPas), A2447BarFecEnE, Boolean.valueOf(n2442BarBulEnE), Short.valueOf(A2442BarBulEnE), Boolean.valueOf(n2449BarKgEnE), A2449BarKgEnE, A2445BarEntEnE, Boolean.valueOf(n2446BarEnULin), Short.valueOf(A2446BarEnULin), Boolean.valueOf(n2448BarFecEnR), A2448BarFecEnR, Boolean.valueOf(n2443BarBulEnR), Short.valueOf(A2443BarBulEnR), Boolean.valueOf(n2450BarKgEnR), A2450BarKgEnR, A2460BarTipAca, A2454BarGirar,
         Boolean.valueOf(n2455BarNMont), Short.valueOf(A2455BarNMont), Short.valueOf(A2459BarTemSec), Boolean.valueOf(n2452BarCal), A2452BarCal, Boolean.valueOf(n2453BarEntAca), A2453BarEntAca, Boolean.valueOf(n2458BarObsVL), Short.valueOf(A2458BarObsVL), Short.valueOf(A1909BarGraAca), A1910BarRdoN, A1911BarRdoA, A2485BarColPes, A2498BarPrdPes, A2499BarRDos1, A2500BarRDos2, A2497BarFecIni, A2496BarFecFin, Integer.valueOf(A2486BarConAgu), Integer.valueOf(A2488BarConVap), Integer.valueOf(A2487BarConEle), Boolean.valueOf(n2746BarCodTex), A2746BarCodTex, Byte.valueOf(A2752BarNumTex1), Boolean.valueOf(n2753BarNumTex2), Short.valueOf(A2753BarNumTex2), Byte.valueOf(A2754BarSitExt), A2759BarMaqGru, Boolean.valueOf(n2803UltLinMaq), Short.valueOf(A2803UltLinMaq), Integer.valueOf(A2826BarNumLot), A2827BarKgsLot, A2828BarMtrLot, A2829BarProPer, Byte.valueOf(A2830BarIntPer), Boolean.valueOf(n3006BarCoef), A3006BarCoef, A3030BarPlf, A2836BarPle2, Short.valueOf(A3133BarNumCor), Short.valueOf(A3134BarAncSal1), Short.valueOf(A3135BarAncSal2), Short.valueOf(A3136BarAncSal3), Short.valueOf(A3137BarGraAca2), Short.valueOf(A3138BarGraCru2), A3310BarFac, Short.valueOf(A3311BarManCod1), Short.valueOf(A3312BarManCod2), A3313BarNumTon, Integer.valueOf(A3595BarMacCod), A3744BarPeg, A3745BarFoa, A3746BarNPed, Boolean.valueOf(n3787BarEnvRec), A3787BarEnvRec, A3870BarFecLRe, A3871BarFecCRe, A1798BarDibCli, Integer.valueOf(A1799BarDibInt), Boolean.valueOf(n2512BarComULin), Byte.valueOf(A2512BarComULin), Byte.valueOf(A4015BarEnv), A4016BarTin, Byte.valueOf(A4017BarInci), A4018BarBot, Byte.valueOf(A4400BarSitEst), Short.valueOf(A4456BarPelAnh), Boolean.valueOf(n4457BarCruMts), A4457BarCruMts, Boolean.valueOf(n4458BarCruKgs), A4458BarCruKgs, A4459BarCruEnr, Boolean.valueOf(n4460BarLotPza), Short.valueOf(A4460BarLotPza), A4461BarLotMts, A4462BarLotKgs, Boolean.valueOf(n4463BarLotMaq), A4463BarLotMaq, Boolean.valueOf(n4464BarAcaFor), Integer.valueOf(A4464BarAcaFor), Boolean.valueOf(n4465BarAcaBak), A4465BarAcaBak, Short.valueOf(A4466BarAcaAnh), A4467BarAcaMar, A4609BarMdlCod, A4610BarTam, Boolean.valueOf(n4611BarHorEnt), A4611BarHorEnt, Boolean.valueOf(n4612BarPzas), Integer.valueOf(A4612BarPzas), Boolean.valueOf(n4613BarHorReg), A4613BarHorReg, A4716BarDishCod, A4812BarEncCli, Integer.valueOf(A4836BarAudSup), Boolean.valueOf(n4845BarAudObs), A4845BarAudObs, A4908BarMacPro, Boolean.valueOf(n4937BarCtrPdas), Byte.valueOf(A4937BarCtrPdas), Short.valueOf(A4975BarNumReo), A5009BarLoteA, Byte.valueOf(A5026BarTipEst), Byte.valueOf(A5027BarGraCob), A5033BarCom, A5034BarEstTip, Boolean.valueOf(n5053BarBp12), Short.valueOf(A5053BarBp12), Boolean.valueOf(n5054BarBp13), Short.valueOf(A5054BarBp13), Boolean.valueOf(n5055BarBp14), A5055BarBp14, Boolean.valueOf(n5056BarBp15), Short.valueOf(A5056BarBp15), Boolean.valueOf(n5057BarFacAbs), A5057BarFacAbs, A5253BarAcc, A5291BarTipCor, A5293BarCodBan, A5351BarObsGrm, A5352BarObsAnc, A5367BarAntp, A5406BarAntpT, Byte.valueOf(A6434BarAsi), A7733BarMaqEst,
         A8097BarFecHis, Integer.valueOf(A8098BarOpeHis), Boolean.valueOf(n8568EntSecUlt), Integer.valueOf(A8568EntSecUlt), A9775BarItem1, A9776barItem2, A9777BarItem3, A9778BarItem4, A9789BarItem5, A9790BarItem6, Boolean.valueOf(n4832BarAudFec), A4832BarAudFec, Boolean.valueOf(n4833BarAudTur), Byte.valueOf(A4833BarAudTur), Boolean.valueOf(n4834BarAudOpe), Integer.valueOf(A4834BarAudOpe), Boolean.valueOf(n4835BarAudOpeN), A4835BarAudOpeN, Boolean.valueOf(n4837BarAudSupN), A4837BarAudSupN, Boolean.valueOf(n4838BarAudNPz), Short.valueOf(A4838BarAudNPz), Boolean.valueOf(n4840BarAudMDig), A4840BarAudMDig, Boolean.valueOf(n4841BarAudMCue), A4841BarAudMCue, Boolean.valueOf(n4844BarAudULin), Short.valueOf(A4844BarAudULin), A11662BarOrdComp, Byte.valueOf(A3594BarPriTin), A3596BarMaqAma, Integer.valueOf(A3597BarVolAma), A3780BarKilLam, Byte.valueOf(A3783BarRecLis), Short.valueOf(A3784BarAnyTie), Short.valueOf(A3785BarUltAny), A3786BarEnvBar, A3361BarKgsPrv, A3362BarMtsPrv, Short.valueOf(A3363BarPiePrv), A3735BarPieKgl, A3736BarPieMtl, A5058BarEnvLaw, A11850Nxt_Mdlo2, A11851Nxt_Sta2, A11852Nxt_ArtCl2, Boolean.valueOf(n11853Nxt_cpeID), Short.valueOf(A11853Nxt_cpeID), Boolean.valueOf(n11855Nxt_dpoID), Short.valueOf(A11855Nxt_dpoID), Boolean.valueOf(n11857Nxt_desaID), Short.valueOf(A11857Nxt_desaID), Boolean.valueOf(n12329SubRevID), A12329SubRevID, Byte.valueOf(A12767BarTpEstam), A12774BarProdID, A12809BarLocTel, A12810BarLocMol, A12811BarLocCol, Boolean.valueOf(n12881BarOEKOTEX), A12881BarOEKOTEX, Short.valueOf(A13070BarLineaID), Integer.valueOf(A13071BarCanalID), A13077BarLinPrd, Boolean.valueOf(n13092BarDGUltLi), Byte.valueOf(A13092BarDGUltLi), Long.valueOf(A13234BarRGB), Boolean.valueOf(n13769BarRdto4), Short.valueOf(A13769BarRdto4), Boolean.valueOf(n13907BarSerDsc2), A13907BarSerDsc2, Boolean.valueOf(n13908BarIdtx2), A13908BarIdtx2, A14329BarCnoEncO, Byte.valueOf(A14330BarPriorid), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A365DisDes});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
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
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A180BarMaqCod = W180BarMaqCod ;
         A180BarMaqCod = W180BarMaqCod ;
         A180BarMaqCod = W180BarMaqCod ;
         A193BarOpeEsp = W193BarOpeEsp ;
         A148BarEstReo = W148BarEstReo ;
         A2752BarNumTex1 = W2752BarNumTex1 ;
         A148BarEstReo = W148BarEstReo ;
         A159BarFecGen = W159BarFecGen ;
         A159BarFecGen = W159BarFecGen ;
         A213BarSit = W213BarSit ;
         A137BarConPar = W137BarConPar ;
         A189BarNumAny = W189BarNumAny ;
         A169BarKgsFac = W169BarKgsFac ;
         A141BarCosPro = W141BarCosPro ;
         A140BarCosAny = W140BarCosAny ;
         A934BarReoCod = W934BarReoCod ;
         A936BarReoReo = W936BarReoReo ;
         A935BarReoPar = W935BarReoPar ;
         A934BarReoCod = W934BarReoCod ;
         A936BarReoReo = W936BarReoReo ;
         A935BarReoPar = W935BarReoPar ;
         A138BarConReo = W138BarConReo ;
         A361DisCod = W361DisCod ;
         A365DisDes = W365DisDes ;
         A833TipDefCod = W833TipDefCod ;
         n833TipDefCod = false ;
         A899TipDefPor = W899TipDefPor ;
         n899TipDefPor = false ;
         A146BarEst = W146BarEst ;
         A180BarMaqCod = W180BarMaqCod ;
         A3310BarFac = W3310BarFac ;
         A2400BarManCod = W2400BarManCod ;
         A3311BarManCod1 = W3311BarManCod1 ;
         A3312BarManCod2 = W3312BarManCod2 ;
         A178BarLis = W178BarLis ;
         A5026BarTipEst = W5026BarTipEst ;
         A5027BarGraCob = W5027BarGraCob ;
         A4716BarDishCod = W4716BarDishCod ;
         A5033BarCom = W5033BarCom ;
         A5034BarEstTip = W5034BarEstTip ;
         A5291BarTipCor = W5291BarTipCor ;
         A5352BarObsAnc = W5352BarObsAnc ;
         A5351BarObsGrm = W5351BarObsGrm ;
         A2830BarIntPer = W2830BarIntPer ;
         A5253BarAcc = W5253BarAcc ;
         A118BarAcaQui = W118BarAcaQui ;
         A5058BarEnvLaw = W5058BarEnvLaw ;
         A6434BarAsi = W6434BarAsi ;
         A4833BarAudTur = W4833BarAudTur ;
         n4833BarAudTur = false ;
         A4018BarBot = W4018BarBot ;
         A4937BarCtrPdas = W4937BarCtrPdas ;
         n4937BarCtrPdas = false ;
         A1500BarNMtr = W1500BarNMtr ;
         A1499BarNMez = W1499BarNMez ;
         A4609BarMdlCod = W4609BarMdlCod ;
         A4716BarDishCod = W4716BarDishCod ;
         A3744BarPeg = W3744BarPeg ;
         A5027BarGraCob = W5027BarGraCob ;
         A5053BarBp12 = W5053BarBp12 ;
         n5053BarBp12 = false ;
         A9775BarItem1 = W9775BarItem1 ;
         A9776barItem2 = W9776barItem2 ;
         A9777BarItem3 = W9777BarItem3 ;
         A9778BarItem4 = W9778BarItem4 ;
         A9789BarItem5 = W9789BarItem5 ;
         A9790BarItem6 = W9790BarItem6 ;
         A4835BarAudOpeN = W4835BarAudOpeN ;
         n4835BarAudOpeN = false ;
         A4837BarAudSupN = W4837BarAudSupN ;
         n4837BarAudSupN = false ;
         A3594BarPriTin = W3594BarPriTin ;
         A3595BarMacCod = W3595BarMacCod ;
         A3783BarRecLis = W3783BarRecLis ;
         A2826BarNumLot = W2826BarNumLot ;
         /* End Insert */
         if ( AV58F_carvema == 1 )
         {
            /* Using cursor P04QU4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCodOri), Byte.valueOf(AV19BarReoOri), AV20BarParOri});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A130BarCodPar = P04QU4_A130BarCodPar[0] ;
               A132BarCodReo = P04QU4_A132BarCodReo[0] ;
               A129BarCod = P04QU4_A129BarCod[0] ;
               A187BarNotDsc = P04QU4_A187BarNotDsc[0] ;
               A188BarNotLin = P04QU4_A188BarNotLin[0] ;
               W129BarCod = A129BarCod ;
               W132BarCodReo = A132BarCodReo ;
               W130BarCodPar = A130BarCodPar ;
               /*
                  INSERT RECORD ON TABLE TXPBARNOT

               */
               W129BarCod = A129BarCod ;
               W132BarCodReo = A132BarCodReo ;
               W130BarCodPar = A130BarCodPar ;
               W188BarNotLin = A188BarNotLin ;
               W187BarNotDsc = A187BarNotDsc ;
               if ( AV37FlagTn == 1 )
               {
                  A129BarCod = AV15BarCod ;
               }
               A132BarCodReo = AV16BarConReo ;
               A130BarCodPar = AV17BarParPan ;
               /* Using cursor P04QU5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A188BarNotLin), A187BarNotDsc});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
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
               A129BarCod = W129BarCod ;
               A132BarCodReo = W132BarCodReo ;
               A130BarCodPar = W130BarCodPar ;
               A188BarNotLin = W188BarNotLin ;
               A187BarNotDsc = W187BarNotDsc ;
               /* End Insert */
               A129BarCod = W129BarCod ;
               A132BarCodReo = W132BarCodReo ;
               A130BarCodPar = W130BarCodPar ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Using cursor P04QU6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCodOri), Byte.valueOf(AV19BarReoOri), AV20BarParOri});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A130BarCodPar = P04QU6_A130BarCodPar[0] ;
               A132BarCodReo = P04QU6_A132BarCodReo[0] ;
               A129BarCod = P04QU6_A129BarCod[0] ;
               A13905BarTraID = P04QU6_A13905BarTraID[0] ;
               W129BarCod = A129BarCod ;
               W132BarCodReo = A132BarCodReo ;
               W130BarCodPar = A130BarCodPar ;
               /*
                  INSERT RECORD ON TABLE TXPBARTTI

               */
               W129BarCod = A129BarCod ;
               W132BarCodReo = A132BarCodReo ;
               W130BarCodPar = A130BarCodPar ;
               W13905BarTraID = A13905BarTraID ;
               if ( AV37FlagTn == 1 )
               {
                  A129BarCod = AV15BarCod ;
               }
               A132BarCodReo = AV16BarConReo ;
               A130BarCodPar = AV17BarParPan ;
               /* Using cursor P04QU7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A13905BarTraID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTTI");
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
               A129BarCod = W129BarCod ;
               A132BarCodReo = W132BarCodReo ;
               A130BarCodPar = W130BarCodPar ;
               A13905BarTraID = W13905BarTraID ;
               /* End Insert */
               A129BarCod = W129BarCod ;
               A132BarCodReo = W132BarCodReo ;
               A130BarCodPar = W130BarCodPar ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
         }
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preo001.this.A396EmprCod;
      this.aP1[0] = preo001.this.AV15BarCod;
      this.aP2[0] = preo001.this.AV16BarConReo;
      this.aP3[0] = preo001.this.AV17BarParPan;
      this.aP4[0] = preo001.this.AV18BarCodOri;
      this.aP5[0] = preo001.this.AV19BarReoOri;
      this.aP6[0] = preo001.this.AV20BarParOri;
      this.aP7[0] = preo001.this.AV21DisCod;
      this.aP8[0] = preo001.this.AV22Sit2;
      this.aP9[0] = preo001.this.AV23BarPieNDes;
      this.aP10[0] = preo001.this.AV24CosPro;
      this.aP11[0] = preo001.this.AV25CosAny;
      this.aP12[0] = preo001.this.AV26BarMaqCod;
      this.aP13[0] = preo001.this.AV27BarNumAny;
      this.aP14[0] = preo001.this.AV28BarConPar;
      this.aP15[0] = preo001.this.AV29DisDes;
      this.aP16[0] = preo001.this.AV30TipDefCod;
      this.aP17[0] = preo001.this.AV31TipDefPor;
      this.aP18[0] = preo001.this.AV32Flag;
      this.aP19[0] = preo001.this.AV33BarEstReo;
      this.aP20[0] = preo001.this.AV34BarOpeEsp;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV43station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV46EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV44UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new byte[1] ;
      scmdbuf = "" ;
      P04QU2_A1832BarLisInd = new byte[1] ;
      P04QU2_A1652BarSerDsc = new String[] {""} ;
      P04QU2_A1503BarPart = new short[1] ;
      P04QU2_A1431BarLocDis = new String[] {""} ;
      P04QU2_A1254BarPesBal = new byte[1] ;
      P04QU2_A1235BarNumCli = new int[1] ;
      P04QU2_A1234BarNomCli = new String[] {""} ;
      P04QU2_A1226BarGraCru = new short[1] ;
      P04QU2_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A921BarMatiz = new short[1] ;
      P04QU2_A1003BarFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_n1003BarFecLan = new boolean[] {false} ;
      P04QU2_A905ObsReoULin = new byte[1] ;
      P04QU2_n905ObsReoULin = new boolean[] {false} ;
      P04QU2_A904ObsReoEnt = new String[] {""} ;
      P04QU2_n904ObsReoEnt = new boolean[] {false} ;
      P04QU2_A864BarPes = new short[1] ;
      P04QU2_A646NotUltLin = new byte[1] ;
      P04QU2_n646NotUltLin = new boolean[] {false} ;
      P04QU2_A144BarDisOri = new int[1] ;
      P04QU2_A190BarNumAso = new byte[1] ;
      P04QU2_A149BarEstRes = new byte[1] ;
      P04QU2_A147BarEstCol = new byte[1] ;
      P04QU2_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_A163BarHorCum = new int[1] ;
      P04QU2_A209BarPri = new String[] {""} ;
      P04QU2_A145BarEncOri = new String[] {""} ;
      P04QU2_A139BarCorOri = new String[] {""} ;
      P04QU2_A214BarSua = new String[] {""} ;
      P04QU2_A177BarLar = new String[] {""} ;
      P04QU2_A206BarPle = new String[] {""} ;
      P04QU2_A126BarAncAca2 = new short[1] ;
      P04QU2_A125BarAncAca1 = new short[1] ;
      P04QU2_A128BarAncCru2 = new short[1] ;
      P04QU2_A127BarAncCru1 = new short[1] ;
      P04QU2_A234BarUrdP3 = new short[1] ;
      P04QU2_A231BarUrd3 = new String[] {""} ;
      P04QU2_A233BarUrdP2 = new short[1] ;
      P04QU2_A230BarUrd2 = new String[] {""} ;
      P04QU2_A232BarUrdP1 = new short[1] ;
      P04QU2_A229BarUrd1 = new String[] {""} ;
      P04QU2_A226BarTraP3 = new short[1] ;
      P04QU2_A223BarTra3 = new String[] {""} ;
      P04QU2_A225BarTraP2 = new short[1] ;
      P04QU2_A222BarTra2 = new String[] {""} ;
      P04QU2_A224BarTraP1 = new short[1] ;
      P04QU2_A221BarTra1 = new String[] {""} ;
      P04QU2_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A182BarMat = new String[] {""} ;
      P04QU2_A142BarDiaP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A235BarUrg = new byte[1] ;
      P04QU2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_A181BarMaqPro = new String[] {""} ;
      P04QU2_A157BarFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_A196BarOrdReo = new byte[1] ;
      P04QU2_A191BarNumPie = new short[1] ;
      P04QU2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_A228BarUniMed = new String[] {""} ;
      P04QU2_A192BarNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A218BarTipCol = new byte[1] ;
      P04QU2_A136BarColNum = new int[1] ;
      P04QU2_A135BarColNom = new String[] {""} ;
      P04QU2_A217BarTipArt = new short[1] ;
      P04QU2_n217BarTipArt = new boolean[] {false} ;
      P04QU2_A212BarSer = new String[] {""} ;
      P04QU2_A143BarDisNum = new String[] {""} ;
      P04QU2_A236BarVolMaq = new int[1] ;
      P04QU2_A120BarAgrEst = new String[] {""} ;
      P04QU2_A4840BarAudMDig = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_n4840BarAudMDig = new boolean[] {false} ;
      P04QU2_A4838BarAudNPz = new short[1] ;
      P04QU2_n4838BarAudNPz = new boolean[] {false} ;
      P04QU2_A4834BarAudOpe = new int[1] ;
      P04QU2_n4834BarAudOpe = new boolean[] {false} ;
      P04QU2_A4832BarAudFec = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_n4832BarAudFec = new boolean[] {false} ;
      P04QU2_A8568EntSecUlt = new int[1] ;
      P04QU2_n8568EntSecUlt = new boolean[] {false} ;
      P04QU2_A8098BarOpeHis = new int[1] ;
      P04QU2_A8097BarFecHis = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_A7733BarMaqEst = new String[] {""} ;
      P04QU2_A5406BarAntpT = new String[] {""} ;
      P04QU2_A5367BarAntp = new String[] {""} ;
      P04QU2_A5293BarCodBan = new String[] {""} ;
      P04QU2_A5057BarFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_n5057BarFacAbs = new boolean[] {false} ;
      P04QU2_A5056BarBp15 = new short[1] ;
      P04QU2_n5056BarBp15 = new boolean[] {false} ;
      P04QU2_A5055BarBp14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_n5055BarBp14 = new boolean[] {false} ;
      P04QU2_A5054BarBp13 = new short[1] ;
      P04QU2_n5054BarBp13 = new boolean[] {false} ;
      P04QU2_A5009BarLoteA = new String[] {""} ;
      P04QU2_A4975BarNumReo = new short[1] ;
      P04QU2_A4908BarMacPro = new String[] {""} ;
      P04QU2_A4845BarAudObs = new String[] {""} ;
      P04QU2_n4845BarAudObs = new boolean[] {false} ;
      P04QU2_A4836BarAudSup = new int[1] ;
      P04QU2_A4812BarEncCli = new String[] {""} ;
      P04QU2_A4613BarHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_n4613BarHorReg = new boolean[] {false} ;
      P04QU2_A4612BarPzas = new int[1] ;
      P04QU2_n4612BarPzas = new boolean[] {false} ;
      P04QU2_A4611BarHorEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_n4611BarHorEnt = new boolean[] {false} ;
      P04QU2_A4610BarTam = new String[] {""} ;
      P04QU2_A4467BarAcaMar = new String[] {""} ;
      P04QU2_A4466BarAcaAnh = new short[1] ;
      P04QU2_A4465BarAcaBak = new String[] {""} ;
      P04QU2_n4465BarAcaBak = new boolean[] {false} ;
      P04QU2_A4464BarAcaFor = new int[1] ;
      P04QU2_n4464BarAcaFor = new boolean[] {false} ;
      P04QU2_A4463BarLotMaq = new String[] {""} ;
      P04QU2_n4463BarLotMaq = new boolean[] {false} ;
      P04QU2_A4462BarLotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A4461BarLotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A4460BarLotPza = new short[1] ;
      P04QU2_n4460BarLotPza = new boolean[] {false} ;
      P04QU2_A4459BarCruEnr = new String[] {""} ;
      P04QU2_A4458BarCruKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_n4458BarCruKgs = new boolean[] {false} ;
      P04QU2_A4457BarCruMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_n4457BarCruMts = new boolean[] {false} ;
      P04QU2_A4456BarPelAnh = new short[1] ;
      P04QU2_A4400BarSitEst = new byte[1] ;
      P04QU2_A4017BarInci = new byte[1] ;
      P04QU2_A4016BarTin = new String[] {""} ;
      P04QU2_A4015BarEnv = new byte[1] ;
      P04QU2_A2512BarComULin = new byte[1] ;
      P04QU2_n2512BarComULin = new boolean[] {false} ;
      P04QU2_A1799BarDibInt = new int[1] ;
      P04QU2_A1798BarDibCli = new String[] {""} ;
      P04QU2_A3871BarFecCRe = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_A3870BarFecLRe = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_A3787BarEnvRec = new String[] {""} ;
      P04QU2_n3787BarEnvRec = new boolean[] {false} ;
      P04QU2_A3746BarNPed = new String[] {""} ;
      P04QU2_A3745BarFoa = new String[] {""} ;
      P04QU2_A3313BarNumTon = new String[] {""} ;
      P04QU2_A3138BarGraCru2 = new short[1] ;
      P04QU2_A3137BarGraAca2 = new short[1] ;
      P04QU2_A3136BarAncSal3 = new short[1] ;
      P04QU2_A3135BarAncSal2 = new short[1] ;
      P04QU2_A3134BarAncSal1 = new short[1] ;
      P04QU2_A3133BarNumCor = new short[1] ;
      P04QU2_A2836BarPle2 = new String[] {""} ;
      P04QU2_A3030BarPlf = new String[] {""} ;
      P04QU2_A3006BarCoef = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_n3006BarCoef = new boolean[] {false} ;
      P04QU2_A2829BarProPer = new String[] {""} ;
      P04QU2_A2828BarMtrLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A2827BarKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A2803UltLinMaq = new short[1] ;
      P04QU2_n2803UltLinMaq = new boolean[] {false} ;
      P04QU2_A2759BarMaqGru = new String[] {""} ;
      P04QU2_A2754BarSitExt = new byte[1] ;
      P04QU2_A2753BarNumTex2 = new short[1] ;
      P04QU2_n2753BarNumTex2 = new boolean[] {false} ;
      P04QU2_A2746BarCodTex = new String[] {""} ;
      P04QU2_n2746BarCodTex = new boolean[] {false} ;
      P04QU2_A2487BarConEle = new int[1] ;
      P04QU2_A2488BarConVap = new int[1] ;
      P04QU2_A2486BarConAgu = new int[1] ;
      P04QU2_A2496BarFecFin = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_A2497BarFecIni = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_A2500BarRDos2 = new String[] {""} ;
      P04QU2_A2499BarRDos1 = new String[] {""} ;
      P04QU2_A2498BarPrdPes = new String[] {""} ;
      P04QU2_A2485BarColPes = new String[] {""} ;
      P04QU2_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A1910BarRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A1909BarGraAca = new short[1] ;
      P04QU2_A2458BarObsVL = new short[1] ;
      P04QU2_n2458BarObsVL = new boolean[] {false} ;
      P04QU2_A2453BarEntAca = new String[] {""} ;
      P04QU2_n2453BarEntAca = new boolean[] {false} ;
      P04QU2_A2452BarCal = new String[] {""} ;
      P04QU2_n2452BarCal = new boolean[] {false} ;
      P04QU2_A2459BarTemSec = new short[1] ;
      P04QU2_A2455BarNMont = new short[1] ;
      P04QU2_n2455BarNMont = new boolean[] {false} ;
      P04QU2_A2454BarGirar = new String[] {""} ;
      P04QU2_A2460BarTipAca = new String[] {""} ;
      P04QU2_A2450BarKgEnR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_n2450BarKgEnR = new boolean[] {false} ;
      P04QU2_A2443BarBulEnR = new short[1] ;
      P04QU2_n2443BarBulEnR = new boolean[] {false} ;
      P04QU2_A2448BarFecEnR = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_n2448BarFecEnR = new boolean[] {false} ;
      P04QU2_A2446BarEnULin = new short[1] ;
      P04QU2_n2446BarEnULin = new boolean[] {false} ;
      P04QU2_A2445BarEntEnE = new String[] {""} ;
      P04QU2_A2449BarKgEnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_n2449BarKgEnE = new boolean[] {false} ;
      P04QU2_A2442BarBulEnE = new short[1] ;
      P04QU2_n2442BarBulEnE = new boolean[] {false} ;
      P04QU2_A2447BarFecEnE = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_A2401BarNumPas = new byte[1] ;
      P04QU2_n2401BarNumPas = new boolean[] {false} ;
      P04QU2_A2311BarCliDes = new int[1] ;
      P04QU2_A2265BarExt = new byte[1] ;
      P04QU2_n2265BarExt = new boolean[] {false} ;
      P04QU2_A2010BarTipDis = new String[] {""} ;
      P04QU2_A1923BarCodTN = new int[1] ;
      P04QU2_A1878BarNumTen = new String[] {""} ;
      P04QU2_A396EmprCod = new String[] {""} ;
      P04QU2_A365DisDes = new String[] {""} ;
      P04QU2_A5058BarEnvLaw = new String[] {""} ;
      P04QU2_A3783BarRecLis = new byte[1] ;
      P04QU2_A3594BarPriTin = new byte[1] ;
      P04QU2_A4837BarAudSupN = new String[] {""} ;
      P04QU2_n4837BarAudSupN = new boolean[] {false} ;
      P04QU2_A4835BarAudOpeN = new String[] {""} ;
      P04QU2_n4835BarAudOpeN = new boolean[] {false} ;
      P04QU2_A4833BarAudTur = new byte[1] ;
      P04QU2_n4833BarAudTur = new boolean[] {false} ;
      P04QU2_A9790BarItem6 = new String[] {""} ;
      P04QU2_A9789BarItem5 = new String[] {""} ;
      P04QU2_A9778BarItem4 = new String[] {""} ;
      P04QU2_A9777BarItem3 = new String[] {""} ;
      P04QU2_A9776barItem2 = new String[] {""} ;
      P04QU2_A9775BarItem1 = new String[] {""} ;
      P04QU2_A6434BarAsi = new byte[1] ;
      P04QU2_A5352BarObsAnc = new String[] {""} ;
      P04QU2_A5351BarObsGrm = new String[] {""} ;
      P04QU2_A5291BarTipCor = new String[] {""} ;
      P04QU2_A5253BarAcc = new String[] {""} ;
      P04QU2_A5053BarBp12 = new short[1] ;
      P04QU2_n5053BarBp12 = new boolean[] {false} ;
      P04QU2_A5034BarEstTip = new String[] {""} ;
      P04QU2_A5033BarCom = new String[] {""} ;
      P04QU2_A5027BarGraCob = new byte[1] ;
      P04QU2_A5026BarTipEst = new byte[1] ;
      P04QU2_A4937BarCtrPdas = new byte[1] ;
      P04QU2_n4937BarCtrPdas = new boolean[] {false} ;
      P04QU2_A4716BarDishCod = new String[] {""} ;
      P04QU2_A4609BarMdlCod = new String[] {""} ;
      P04QU2_A4018BarBot = new String[] {""} ;
      P04QU2_A3744BarPeg = new String[] {""} ;
      P04QU2_A3595BarMacCod = new int[1] ;
      P04QU2_A3312BarManCod2 = new short[1] ;
      P04QU2_A3311BarManCod1 = new short[1] ;
      P04QU2_A3310BarFac = new String[] {""} ;
      P04QU2_A2830BarIntPer = new byte[1] ;
      P04QU2_A2826BarNumLot = new int[1] ;
      P04QU2_A2752BarNumTex1 = new byte[1] ;
      P04QU2_A2400BarManCod = new short[1] ;
      P04QU2_A1499BarNMez = new String[] {""} ;
      P04QU2_A1500BarNMtr = new String[] {""} ;
      P04QU2_A935BarReoPar = new String[] {""} ;
      P04QU2_A936BarReoReo = new byte[1] ;
      P04QU2_A934BarReoCod = new int[1] ;
      P04QU2_A899TipDefPor = new short[1] ;
      P04QU2_n899TipDefPor = new boolean[] {false} ;
      P04QU2_A833TipDefCod = new short[1] ;
      P04QU2_n833TipDefCod = new boolean[] {false} ;
      P04QU2_A178BarLis = new byte[1] ;
      P04QU2_A169BarKgsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A189BarNumAny = new short[1] ;
      P04QU2_A137BarConPar = new String[] {""} ;
      P04QU2_A138BarConReo = new byte[1] ;
      P04QU2_A213BarSit = new byte[1] ;
      P04QU2_A146BarEst = new byte[1] ;
      P04QU2_A118BarAcaQui = new String[] {""} ;
      P04QU2_A193BarOpeEsp = new byte[1] ;
      P04QU2_A148BarEstReo = new byte[1] ;
      P04QU2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P04QU2_A361DisCod = new int[1] ;
      P04QU2_A180BarMaqCod = new String[] {""} ;
      P04QU2_A130BarCodPar = new String[] {""} ;
      P04QU2_A132BarCodReo = new byte[1] ;
      P04QU2_A129BarCod = new int[1] ;
      P04QU2_A252CliCod = new int[1] ;
      P04QU2_n252CliCod = new boolean[] {false} ;
      P04QU2_A14330BarPriorid = new byte[1] ;
      P04QU2_A14329BarCnoEncO = new String[] {""} ;
      P04QU2_A13908BarIdtx2 = new String[] {""} ;
      P04QU2_n13908BarIdtx2 = new boolean[] {false} ;
      P04QU2_A13907BarSerDsc2 = new String[] {""} ;
      P04QU2_n13907BarSerDsc2 = new boolean[] {false} ;
      P04QU2_A13769BarRdto4 = new short[1] ;
      P04QU2_n13769BarRdto4 = new boolean[] {false} ;
      P04QU2_A13234BarRGB = new long[1] ;
      P04QU2_A13092BarDGUltLi = new byte[1] ;
      P04QU2_n13092BarDGUltLi = new boolean[] {false} ;
      P04QU2_A13077BarLinPrd = new String[] {""} ;
      P04QU2_A13071BarCanalID = new int[1] ;
      P04QU2_A13070BarLineaID = new short[1] ;
      P04QU2_A12881BarOEKOTEX = new String[] {""} ;
      P04QU2_n12881BarOEKOTEX = new boolean[] {false} ;
      P04QU2_A12811BarLocCol = new String[] {""} ;
      P04QU2_A12810BarLocMol = new String[] {""} ;
      P04QU2_A12809BarLocTel = new String[] {""} ;
      P04QU2_A12774BarProdID = new String[] {""} ;
      P04QU2_A12767BarTpEstam = new byte[1] ;
      P04QU2_A12329SubRevID = new String[] {""} ;
      P04QU2_n12329SubRevID = new boolean[] {false} ;
      P04QU2_A11857Nxt_desaID = new short[1] ;
      P04QU2_n11857Nxt_desaID = new boolean[] {false} ;
      P04QU2_A11855Nxt_dpoID = new short[1] ;
      P04QU2_n11855Nxt_dpoID = new boolean[] {false} ;
      P04QU2_A11853Nxt_cpeID = new short[1] ;
      P04QU2_n11853Nxt_cpeID = new boolean[] {false} ;
      P04QU2_A11852Nxt_ArtCl2 = new String[] {""} ;
      P04QU2_A11851Nxt_Sta2 = new String[] {""} ;
      P04QU2_A11850Nxt_Mdlo2 = new String[] {""} ;
      P04QU2_A3736BarPieMtl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A3735BarPieKgl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A3363BarPiePrv = new short[1] ;
      P04QU2_A3362BarMtsPrv = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A3361BarKgsPrv = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A3786BarEnvBar = new String[] {""} ;
      P04QU2_A3785BarUltAny = new short[1] ;
      P04QU2_A3784BarAnyTie = new short[1] ;
      P04QU2_A3780BarKilLam = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_A3597BarVolAma = new int[1] ;
      P04QU2_A3596BarMaqAma = new String[] {""} ;
      P04QU2_A11662BarOrdComp = new String[] {""} ;
      P04QU2_A4844BarAudULin = new short[1] ;
      P04QU2_n4844BarAudULin = new boolean[] {false} ;
      P04QU2_A4841BarAudMCue = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QU2_n4841BarAudMCue = new boolean[] {false} ;
      A1652BarSerDsc = "" ;
      A1431BarLocDis = "" ;
      A1234BarNomCli = "" ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      A1003BarFecLan = GXutil.nullDate() ;
      A904ObsReoEnt = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      A209BarPri = "" ;
      A145BarEncOri = "" ;
      A139BarCorOri = "" ;
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
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A143BarDisNum = "" ;
      A120BarAgrEst = "" ;
      A4840BarAudMDig = DecimalUtil.ZERO ;
      A4832BarAudFec = GXutil.nullDate() ;
      A8097BarFecHis = GXutil.resetTime( GXutil.nullDate() );
      A7733BarMaqEst = "" ;
      A5406BarAntpT = "" ;
      A5367BarAntp = "" ;
      A5293BarCodBan = "" ;
      A5057BarFacAbs = DecimalUtil.ZERO ;
      A5055BarBp14 = DecimalUtil.ZERO ;
      A5009BarLoteA = "" ;
      A4908BarMacPro = "" ;
      A4845BarAudObs = "" ;
      A4812BarEncCli = "" ;
      A4613BarHorReg = GXutil.resetTime( GXutil.nullDate() );
      A4611BarHorEnt = GXutil.resetTime( GXutil.nullDate() );
      A4610BarTam = "" ;
      A4467BarAcaMar = "" ;
      A4465BarAcaBak = "" ;
      A4463BarLotMaq = "" ;
      A4462BarLotKgs = DecimalUtil.ZERO ;
      A4461BarLotMts = DecimalUtil.ZERO ;
      A4459BarCruEnr = "" ;
      A4458BarCruKgs = DecimalUtil.ZERO ;
      A4457BarCruMts = DecimalUtil.ZERO ;
      A4016BarTin = "" ;
      A1798BarDibCli = "" ;
      A3871BarFecCRe = GXutil.nullDate() ;
      A3870BarFecLRe = GXutil.nullDate() ;
      A3787BarEnvRec = "" ;
      A3746BarNPed = "" ;
      A3745BarFoa = "" ;
      A3313BarNumTon = "" ;
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
      A365DisDes = "" ;
      A5058BarEnvLaw = "" ;
      A4837BarAudSupN = "" ;
      A4835BarAudOpeN = "" ;
      A9790BarItem6 = "" ;
      A9789BarItem5 = "" ;
      A9778BarItem4 = "" ;
      A9777BarItem3 = "" ;
      A9776barItem2 = "" ;
      A9775BarItem1 = "" ;
      A5352BarObsAnc = "" ;
      A5351BarObsGrm = "" ;
      A5291BarTipCor = "" ;
      A5253BarAcc = "" ;
      A5034BarEstTip = "" ;
      A5033BarCom = "" ;
      A4716BarDishCod = "" ;
      A4609BarMdlCod = "" ;
      A4018BarBot = "" ;
      A3744BarPeg = "" ;
      A3310BarFac = "" ;
      A1499BarNMez = "" ;
      A1500BarNMtr = "" ;
      A935BarReoPar = "" ;
      A169BarKgsFac = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A137BarConPar = "" ;
      A118BarAcaQui = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A180BarMaqCod = "" ;
      A130BarCodPar = "" ;
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
      A3736BarPieMtl = DecimalUtil.ZERO ;
      A3735BarPieKgl = DecimalUtil.ZERO ;
      A3362BarMtsPrv = DecimalUtil.ZERO ;
      A3361BarKgsPrv = DecimalUtil.ZERO ;
      A3786BarEnvBar = "" ;
      A3780BarKilLam = DecimalUtil.ZERO ;
      A3596BarMaqAma = "" ;
      A11662BarOrdComp = "" ;
      A4841BarAudMCue = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      AV38BarFac = "" ;
      AV66BarAcaqui = "" ;
      AV61BarFecGen = GXutil.nullDate() ;
      AV69BarBot = "" ;
      AV79Maqcod = "" ;
      AV71Fecha1 = GXutil.nullDate() ;
      AV72fecha2 = GXutil.nullDate() ;
      AV73Fecha3 = GXutil.nullDate() ;
      AV74Fecha4 = GXutil.nullDate() ;
      AV49BarDishCod = "" ;
      AV50BarCom = "" ;
      AV51BarEstTip = "" ;
      AV52BarTipCor = "" ;
      AV53BarObsAnc = "" ;
      AV54BarObsGrm = "" ;
      AV64Baracc = "" ;
      AV75Baritem1 = "" ;
      AV82Baritem2 = "" ;
      AV83Baritem3 = "" ;
      AV84Baritem4 = "" ;
      AV85Baritem5 = "" ;
      AV86Baritem6 = "" ;
      W180BarMaqCod = "" ;
      W159BarFecGen = GXutil.nullDate() ;
      W137BarConPar = "" ;
      W169BarKgsFac = DecimalUtil.ZERO ;
      W141BarCosPro = DecimalUtil.ZERO ;
      W140BarCosAny = DecimalUtil.ZERO ;
      W935BarReoPar = "" ;
      W365DisDes = "" ;
      W3310BarFac = "" ;
      W4716BarDishCod = "" ;
      W5033BarCom = "" ;
      W5034BarEstTip = "" ;
      W5291BarTipCor = "" ;
      W5352BarObsAnc = "" ;
      W5351BarObsGrm = "" ;
      W5253BarAcc = "" ;
      W118BarAcaQui = "" ;
      W5058BarEnvLaw = "" ;
      W4018BarBot = "" ;
      W1500BarNMtr = "" ;
      W1499BarNMez = "" ;
      W4609BarMdlCod = "" ;
      W3744BarPeg = "" ;
      W9775BarItem1 = "" ;
      W9776barItem2 = "" ;
      W9777BarItem3 = "" ;
      W9778BarItem4 = "" ;
      W9789BarItem5 = "" ;
      W9790BarItem6 = "" ;
      W4835BarAudOpeN = "" ;
      W4837BarAudSupN = "" ;
      Gx_date = GXutil.nullDate() ;
      AV77Fecha_a = "" ;
      Gx_time = "" ;
      Gx_emsg = "" ;
      P04QU4_A396EmprCod = new String[] {""} ;
      P04QU4_A130BarCodPar = new String[] {""} ;
      P04QU4_A132BarCodReo = new byte[1] ;
      P04QU4_A129BarCod = new int[1] ;
      P04QU4_A187BarNotDsc = new String[] {""} ;
      P04QU4_A188BarNotLin = new byte[1] ;
      A187BarNotDsc = "" ;
      W187BarNotDsc = "" ;
      P04QU6_A396EmprCod = new String[] {""} ;
      P04QU6_A130BarCodPar = new String[] {""} ;
      P04QU6_A132BarCodReo = new byte[1] ;
      P04QU6_A129BarCod = new int[1] ;
      P04QU6_A13905BarTraID = new String[] {""} ;
      A13905BarTraID = "" ;
      W13905BarTraID = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preo001__default(),
         new Object[] {
             new Object[] {
            P04QU2_A1832BarLisInd, P04QU2_A1652BarSerDsc, P04QU2_A1503BarPart, P04QU2_A1431BarLocDis, P04QU2_A1254BarPesBal, P04QU2_A1235BarNumCli, P04QU2_A1234BarNomCli, P04QU2_A1226BarGraCru, P04QU2_A1224BarEncAnh, P04QU2_A1223BarEncCom,
            P04QU2_A921BarMatiz, P04QU2_A1003BarFecLan, P04QU2_n1003BarFecLan, P04QU2_A905ObsReoULin, P04QU2_n905ObsReoULin, P04QU2_A904ObsReoEnt, P04QU2_n904ObsReoEnt, P04QU2_A864BarPes, P04QU2_A646NotUltLin, P04QU2_n646NotUltLin,
            P04QU2_A144BarDisOri, P04QU2_A190BarNumAso, P04QU2_A149BarEstRes, P04QU2_A147BarEstCol, P04QU2_A158BarFecFpr, P04QU2_A163BarHorCum, P04QU2_A209BarPri, P04QU2_A145BarEncOri, P04QU2_A139BarCorOri, P04QU2_A214BarSua,
            P04QU2_A177BarLar, P04QU2_A206BarPle, P04QU2_A126BarAncAca2, P04QU2_A125BarAncAca1, P04QU2_A128BarAncCru2, P04QU2_A127BarAncCru1, P04QU2_A234BarUrdP3, P04QU2_A231BarUrd3, P04QU2_A233BarUrdP2, P04QU2_A230BarUrd2,
            P04QU2_A232BarUrdP1, P04QU2_A229BarUrd1, P04QU2_A226BarTraP3, P04QU2_A223BarTra3, P04QU2_A225BarTraP2, P04QU2_A222BarTra2, P04QU2_A224BarTraP1, P04QU2_A221BarTra1, P04QU2_A211BarRdt, P04QU2_A182BarMat,
            P04QU2_A142BarDiaP, P04QU2_A235BarUrg, P04QU2_A161BarFecSal, P04QU2_A181BarMaqPro, P04QU2_A157BarFecEnt, P04QU2_A196BarOrdReo, P04QU2_A191BarNumPie, P04QU2_A155BarFecCli, P04QU2_A228BarUniMed, P04QU2_A192BarNumUni,
            P04QU2_A218BarTipCol, P04QU2_A136BarColNum, P04QU2_A135BarColNom, P04QU2_A217BarTipArt, P04QU2_n217BarTipArt, P04QU2_A212BarSer, P04QU2_A143BarDisNum, P04QU2_A236BarVolMaq, P04QU2_A120BarAgrEst, P04QU2_A4840BarAudMDig,
            P04QU2_n4840BarAudMDig, P04QU2_A4838BarAudNPz, P04QU2_n4838BarAudNPz, P04QU2_A4834BarAudOpe, P04QU2_n4834BarAudOpe, P04QU2_A4832BarAudFec, P04QU2_n4832BarAudFec, P04QU2_A8568EntSecUlt, P04QU2_n8568EntSecUlt, P04QU2_A8098BarOpeHis,
            P04QU2_A8097BarFecHis, P04QU2_A7733BarMaqEst, P04QU2_A5406BarAntpT, P04QU2_A5367BarAntp, P04QU2_A5293BarCodBan, P04QU2_A5057BarFacAbs, P04QU2_n5057BarFacAbs, P04QU2_A5056BarBp15, P04QU2_n5056BarBp15, P04QU2_A5055BarBp14,
            P04QU2_n5055BarBp14, P04QU2_A5054BarBp13, P04QU2_n5054BarBp13, P04QU2_A5009BarLoteA, P04QU2_A4975BarNumReo, P04QU2_A4908BarMacPro, P04QU2_A4845BarAudObs, P04QU2_n4845BarAudObs, P04QU2_A4836BarAudSup, P04QU2_A4812BarEncCli,
            P04QU2_A4613BarHorReg, P04QU2_n4613BarHorReg, P04QU2_A4612BarPzas, P04QU2_n4612BarPzas, P04QU2_A4611BarHorEnt, P04QU2_n4611BarHorEnt, P04QU2_A4610BarTam, P04QU2_A4467BarAcaMar, P04QU2_A4466BarAcaAnh, P04QU2_A4465BarAcaBak,
            P04QU2_n4465BarAcaBak, P04QU2_A4464BarAcaFor, P04QU2_n4464BarAcaFor, P04QU2_A4463BarLotMaq, P04QU2_n4463BarLotMaq, P04QU2_A4462BarLotKgs, P04QU2_A4461BarLotMts, P04QU2_A4460BarLotPza, P04QU2_n4460BarLotPza, P04QU2_A4459BarCruEnr,
            P04QU2_A4458BarCruKgs, P04QU2_n4458BarCruKgs, P04QU2_A4457BarCruMts, P04QU2_n4457BarCruMts, P04QU2_A4456BarPelAnh, P04QU2_A4400BarSitEst, P04QU2_A4017BarInci, P04QU2_A4016BarTin, P04QU2_A4015BarEnv, P04QU2_A2512BarComULin,
            P04QU2_n2512BarComULin, P04QU2_A1799BarDibInt, P04QU2_A1798BarDibCli, P04QU2_A3871BarFecCRe, P04QU2_A3870BarFecLRe, P04QU2_A3787BarEnvRec, P04QU2_n3787BarEnvRec, P04QU2_A3746BarNPed, P04QU2_A3745BarFoa, P04QU2_A3313BarNumTon,
            P04QU2_A3138BarGraCru2, P04QU2_A3137BarGraAca2, P04QU2_A3136BarAncSal3, P04QU2_A3135BarAncSal2, P04QU2_A3134BarAncSal1, P04QU2_A3133BarNumCor, P04QU2_A2836BarPle2, P04QU2_A3030BarPlf, P04QU2_A3006BarCoef, P04QU2_n3006BarCoef,
            P04QU2_A2829BarProPer, P04QU2_A2828BarMtrLot, P04QU2_A2827BarKgsLot, P04QU2_A2803UltLinMaq, P04QU2_n2803UltLinMaq, P04QU2_A2759BarMaqGru, P04QU2_A2754BarSitExt, P04QU2_A2753BarNumTex2, P04QU2_n2753BarNumTex2, P04QU2_A2746BarCodTex,
            P04QU2_n2746BarCodTex, P04QU2_A2487BarConEle, P04QU2_A2488BarConVap, P04QU2_A2486BarConAgu, P04QU2_A2496BarFecFin, P04QU2_A2497BarFecIni, P04QU2_A2500BarRDos2, P04QU2_A2499BarRDos1, P04QU2_A2498BarPrdPes, P04QU2_A2485BarColPes,
            P04QU2_A1911BarRdoA, P04QU2_A1910BarRdoN, P04QU2_A1909BarGraAca, P04QU2_A2458BarObsVL, P04QU2_n2458BarObsVL, P04QU2_A2453BarEntAca, P04QU2_n2453BarEntAca, P04QU2_A2452BarCal, P04QU2_n2452BarCal, P04QU2_A2459BarTemSec,
            P04QU2_A2455BarNMont, P04QU2_n2455BarNMont, P04QU2_A2454BarGirar, P04QU2_A2460BarTipAca, P04QU2_A2450BarKgEnR, P04QU2_n2450BarKgEnR, P04QU2_A2443BarBulEnR, P04QU2_n2443BarBulEnR, P04QU2_A2448BarFecEnR, P04QU2_n2448BarFecEnR,
            P04QU2_A2446BarEnULin, P04QU2_n2446BarEnULin, P04QU2_A2445BarEntEnE, P04QU2_A2449BarKgEnE, P04QU2_n2449BarKgEnE, P04QU2_A2442BarBulEnE, P04QU2_n2442BarBulEnE, P04QU2_A2447BarFecEnE, P04QU2_A2401BarNumPas, P04QU2_n2401BarNumPas,
            P04QU2_A2311BarCliDes, P04QU2_A2265BarExt, P04QU2_n2265BarExt, P04QU2_A2010BarTipDis, P04QU2_A1923BarCodTN, P04QU2_A1878BarNumTen, P04QU2_A396EmprCod, P04QU2_A365DisDes, P04QU2_A5058BarEnvLaw, P04QU2_A3783BarRecLis,
            P04QU2_A3594BarPriTin, P04QU2_A4837BarAudSupN, P04QU2_n4837BarAudSupN, P04QU2_A4835BarAudOpeN, P04QU2_n4835BarAudOpeN, P04QU2_A4833BarAudTur, P04QU2_n4833BarAudTur, P04QU2_A9790BarItem6, P04QU2_A9789BarItem5, P04QU2_A9778BarItem4,
            P04QU2_A9777BarItem3, P04QU2_A9776barItem2, P04QU2_A9775BarItem1, P04QU2_A6434BarAsi, P04QU2_A5352BarObsAnc, P04QU2_A5351BarObsGrm, P04QU2_A5291BarTipCor, P04QU2_A5253BarAcc, P04QU2_A5053BarBp12, P04QU2_n5053BarBp12,
            P04QU2_A5034BarEstTip, P04QU2_A5033BarCom, P04QU2_A5027BarGraCob, P04QU2_A5026BarTipEst, P04QU2_A4937BarCtrPdas, P04QU2_n4937BarCtrPdas, P04QU2_A4716BarDishCod, P04QU2_A4609BarMdlCod, P04QU2_A4018BarBot, P04QU2_A3744BarPeg,
            P04QU2_A3595BarMacCod, P04QU2_A3312BarManCod2, P04QU2_A3311BarManCod1, P04QU2_A3310BarFac, P04QU2_A2830BarIntPer, P04QU2_A2826BarNumLot, P04QU2_A2752BarNumTex1, P04QU2_A2400BarManCod, P04QU2_A1499BarNMez, P04QU2_A1500BarNMtr,
            P04QU2_A935BarReoPar, P04QU2_A936BarReoReo, P04QU2_A934BarReoCod, P04QU2_A899TipDefPor, P04QU2_n899TipDefPor, P04QU2_A833TipDefCod, P04QU2_n833TipDefCod, P04QU2_A178BarLis, P04QU2_A169BarKgsFac, P04QU2_A140BarCosAny,
            P04QU2_A141BarCosPro, P04QU2_A189BarNumAny, P04QU2_A137BarConPar, P04QU2_A138BarConReo, P04QU2_A213BarSit, P04QU2_A146BarEst, P04QU2_A118BarAcaQui, P04QU2_A193BarOpeEsp, P04QU2_A148BarEstReo, P04QU2_A159BarFecGen,
            P04QU2_A361DisCod, P04QU2_A180BarMaqCod, P04QU2_A130BarCodPar, P04QU2_A132BarCodReo, P04QU2_A129BarCod, P04QU2_A252CliCod, P04QU2_n252CliCod, P04QU2_A14330BarPriorid, P04QU2_A14329BarCnoEncO, P04QU2_A13908BarIdtx2,
            P04QU2_n13908BarIdtx2, P04QU2_A13907BarSerDsc2, P04QU2_n13907BarSerDsc2, P04QU2_A13769BarRdto4, P04QU2_n13769BarRdto4, P04QU2_A13234BarRGB, P04QU2_A13092BarDGUltLi, P04QU2_n13092BarDGUltLi, P04QU2_A13077BarLinPrd, P04QU2_A13071BarCanalID,
            P04QU2_A13070BarLineaID, P04QU2_A12881BarOEKOTEX, P04QU2_n12881BarOEKOTEX, P04QU2_A12811BarLocCol, P04QU2_A12810BarLocMol, P04QU2_A12809BarLocTel, P04QU2_A12774BarProdID, P04QU2_A12767BarTpEstam, P04QU2_A12329SubRevID, P04QU2_n12329SubRevID,
            P04QU2_A11857Nxt_desaID, P04QU2_n11857Nxt_desaID, P04QU2_A11855Nxt_dpoID, P04QU2_n11855Nxt_dpoID, P04QU2_A11853Nxt_cpeID, P04QU2_n11853Nxt_cpeID, P04QU2_A11852Nxt_ArtCl2, P04QU2_A11851Nxt_Sta2, P04QU2_A11850Nxt_Mdlo2, P04QU2_A3736BarPieMtl,
            P04QU2_A3735BarPieKgl, P04QU2_A3363BarPiePrv, P04QU2_A3362BarMtsPrv, P04QU2_A3361BarKgsPrv, P04QU2_A3786BarEnvBar, P04QU2_A3785BarUltAny, P04QU2_A3784BarAnyTie, P04QU2_A3780BarKilLam, P04QU2_A3597BarVolAma, P04QU2_A3596BarMaqAma,
            P04QU2_A11662BarOrdComp, P04QU2_A4844BarAudULin, P04QU2_n4844BarAudULin, P04QU2_A4841BarAudMCue, P04QU2_n4841BarAudMCue
            }
            , new Object[] {
            }
            , new Object[] {
            P04QU4_A396EmprCod, P04QU4_A130BarCodPar, P04QU4_A132BarCodReo, P04QU4_A129BarCod, P04QU4_A187BarNotDsc, P04QU4_A188BarNotLin
            }
            , new Object[] {
            }
            , new Object[] {
            P04QU6_A396EmprCod, P04QU6_A130BarCodPar, P04QU6_A132BarCodReo, P04QU6_A129BarCod, P04QU6_A13905BarTraID
            }
            , new Object[] {
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV16BarConReo ;
   private byte AV19BarReoOri ;
   private byte AV22Sit2 ;
   private byte AV32Flag ;
   private byte AV33BarEstReo ;
   private byte AV34BarOpeEsp ;
   private byte AV37FlagTn ;
   private byte AV56F_endutex ;
   private byte AV57F_tinamar ;
   private byte AV58F_carvema ;
   private byte AV59FlagInt ;
   private byte AV62F_fechdr ;
   private byte AV65Texfina ;
   private byte AV76CtrlUsu ;
   private byte AV78Orient ;
   private byte AV80carvitin ;
   private byte GXt_int6 ;
   private byte GXv_int5[] ;
   private byte A1832BarLisInd ;
   private byte A1254BarPesBal ;
   private byte A905ObsReoULin ;
   private byte A646NotUltLin ;
   private byte A190BarNumAso ;
   private byte A149BarEstRes ;
   private byte A147BarEstCol ;
   private byte A235BarUrg ;
   private byte A196BarOrdReo ;
   private byte A218BarTipCol ;
   private byte A4400BarSitEst ;
   private byte A4017BarInci ;
   private byte A4015BarEnv ;
   private byte A2512BarComULin ;
   private byte A2754BarSitExt ;
   private byte A2401BarNumPas ;
   private byte A2265BarExt ;
   private byte A3783BarRecLis ;
   private byte A3594BarPriTin ;
   private byte A4833BarAudTur ;
   private byte A6434BarAsi ;
   private byte A5027BarGraCob ;
   private byte A5026BarTipEst ;
   private byte A4937BarCtrPdas ;
   private byte A2830BarIntPer ;
   private byte A2752BarNumTex1 ;
   private byte A936BarReoReo ;
   private byte A178BarLis ;
   private byte A138BarConReo ;
   private byte A213BarSit ;
   private byte A146BarEst ;
   private byte A193BarOpeEsp ;
   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private byte A14330BarPriorid ;
   private byte A13092BarDGUltLi ;
   private byte A12767BarTpEstam ;
   private byte W132BarCodReo ;
   private byte AV67BarAsi ;
   private byte AV68Baraudtur ;
   private byte AV70barctrpdas ;
   private byte AV47BarTipEst ;
   private byte AV48BarGraCob ;
   private byte AV55EstReo_2 ;
   private byte W193BarOpeEsp ;
   private byte W148BarEstReo ;
   private byte W2752BarNumTex1 ;
   private byte W213BarSit ;
   private byte W936BarReoReo ;
   private byte W138BarConReo ;
   private byte W146BarEst ;
   private byte W178BarLis ;
   private byte W5026BarTipEst ;
   private byte W5027BarGraCob ;
   private byte W2830BarIntPer ;
   private byte W6434BarAsi ;
   private byte W4833BarAudTur ;
   private byte W4937BarCtrPdas ;
   private byte W3594BarPriTin ;
   private byte W3783BarRecLis ;
   private byte AV36FlagJM ;
   private byte AV60BarIntPer ;
   private byte A188BarNotLin ;
   private byte W188BarNotLin ;
   private short AV27BarNumAny ;
   private short AV30TipDefCod ;
   private short AV31TipDefPor ;
   private short A1503BarPart ;
   private short A1226BarGraCru ;
   private short A921BarMatiz ;
   private short A864BarPes ;
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
   private short A4838BarAudNPz ;
   private short A5056BarBp15 ;
   private short A5054BarBp13 ;
   private short A4975BarNumReo ;
   private short A4466BarAcaAnh ;
   private short A4460BarLotPza ;
   private short A4456BarPelAnh ;
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
   private short A5053BarBp12 ;
   private short A3312BarManCod2 ;
   private short A3311BarManCod1 ;
   private short A2400BarManCod ;
   private short A899TipDefPor ;
   private short A833TipDefCod ;
   private short A189BarNumAny ;
   private short A13769BarRdto4 ;
   private short A13070BarLineaID ;
   private short A11857Nxt_desaID ;
   private short A11855Nxt_dpoID ;
   private short A11853Nxt_cpeID ;
   private short A3363BarPiePrv ;
   private short A3785BarUltAny ;
   private short A3784BarAnyTie ;
   private short A4844BarAudULin ;
   private short AV39BarManCod1 ;
   private short AV40BarManCod2 ;
   private short AV41BarManCod ;
   private short W189BarNumAny ;
   private short W833TipDefCod ;
   private short W899TipDefPor ;
   private short W2400BarManCod ;
   private short W3311BarManCod1 ;
   private short W3312BarManCod2 ;
   private short W5053BarBp12 ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int AV18BarCodOri ;
   private int AV21DisCod ;
   private int AV23BarPieNDes ;
   private int A1235BarNumCli ;
   private int A144BarDisOri ;
   private int A163BarHorCum ;
   private int A136BarColNum ;
   private int A236BarVolMaq ;
   private int A4834BarAudOpe ;
   private int A8568EntSecUlt ;
   private int A8098BarOpeHis ;
   private int A4836BarAudSup ;
   private int A4612BarPzas ;
   private int A4464BarAcaFor ;
   private int A1799BarDibInt ;
   private int A2487BarConEle ;
   private int A2488BarConVap ;
   private int A2486BarConAgu ;
   private int A2311BarCliDes ;
   private int A1923BarCodTN ;
   private int A3595BarMacCod ;
   private int A2826BarNumLot ;
   private int A934BarReoCod ;
   private int A361DisCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A13071BarCanalID ;
   private int A3597BarVolAma ;
   private int W129BarCod ;
   private int AV81barmaccod ;
   private int GX_INS12 ;
   private int W934BarReoCod ;
   private int W361DisCod ;
   private int W3595BarMacCod ;
   private int W2826BarNumLot ;
   private int GX_INS17 ;
   private int GX_INS1877 ;
   private long A13234BarRGB ;
   private java.math.BigDecimal AV24CosPro ;
   private java.math.BigDecimal AV25CosAny ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A142BarDiaP ;
   private java.math.BigDecimal A192BarNumUni ;
   private java.math.BigDecimal A4840BarAudMDig ;
   private java.math.BigDecimal A5057BarFacAbs ;
   private java.math.BigDecimal A5055BarBp14 ;
   private java.math.BigDecimal A4462BarLotKgs ;
   private java.math.BigDecimal A4461BarLotMts ;
   private java.math.BigDecimal A4458BarCruKgs ;
   private java.math.BigDecimal A4457BarCruMts ;
   private java.math.BigDecimal A3006BarCoef ;
   private java.math.BigDecimal A2828BarMtrLot ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal A1911BarRdoA ;
   private java.math.BigDecimal A1910BarRdoN ;
   private java.math.BigDecimal A2450BarKgEnR ;
   private java.math.BigDecimal A2449BarKgEnE ;
   private java.math.BigDecimal A169BarKgsFac ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A3736BarPieMtl ;
   private java.math.BigDecimal A3735BarPieKgl ;
   private java.math.BigDecimal A3362BarMtsPrv ;
   private java.math.BigDecimal A3361BarKgsPrv ;
   private java.math.BigDecimal A3780BarKilLam ;
   private java.math.BigDecimal A4841BarAudMCue ;
   private java.math.BigDecimal W169BarKgsFac ;
   private java.math.BigDecimal W141BarCosPro ;
   private java.math.BigDecimal W140BarCosAny ;
   private String A396EmprCod ;
   private String AV17BarParPan ;
   private String AV20BarParOri ;
   private String AV26BarMaqCod ;
   private String AV28BarConPar ;
   private String AV29DisDes ;
   private String AV43station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV46EmprNom ;
   private String GXv_char3[] ;
   private String AV44UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A1652BarSerDsc ;
   private String A1431BarLocDis ;
   private String A1234BarNomCli ;
   private String A904ObsReoEnt ;
   private String A209BarPri ;
   private String A145BarEncOri ;
   private String A139BarCorOri ;
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
   private String A120BarAgrEst ;
   private String A7733BarMaqEst ;
   private String A5406BarAntpT ;
   private String A5367BarAntp ;
   private String A5293BarCodBan ;
   private String A5009BarLoteA ;
   private String A4908BarMacPro ;
   private String A4812BarEncCli ;
   private String A4610BarTam ;
   private String A4467BarAcaMar ;
   private String A4465BarAcaBak ;
   private String A4463BarLotMaq ;
   private String A4459BarCruEnr ;
   private String A4016BarTin ;
   private String A1798BarDibCli ;
   private String A3787BarEnvRec ;
   private String A3746BarNPed ;
   private String A3745BarFoa ;
   private String A3313BarNumTon ;
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
   private String A365DisDes ;
   private String A5058BarEnvLaw ;
   private String A4837BarAudSupN ;
   private String A4835BarAudOpeN ;
   private String A9790BarItem6 ;
   private String A9789BarItem5 ;
   private String A9778BarItem4 ;
   private String A9777BarItem3 ;
   private String A9776barItem2 ;
   private String A9775BarItem1 ;
   private String A5352BarObsAnc ;
   private String A5351BarObsGrm ;
   private String A5291BarTipCor ;
   private String A5253BarAcc ;
   private String A5034BarEstTip ;
   private String A5033BarCom ;
   private String A4716BarDishCod ;
   private String A4609BarMdlCod ;
   private String A4018BarBot ;
   private String A3744BarPeg ;
   private String A3310BarFac ;
   private String A1499BarNMez ;
   private String A1500BarNMtr ;
   private String A935BarReoPar ;
   private String A137BarConPar ;
   private String A118BarAcaQui ;
   private String A180BarMaqCod ;
   private String A130BarCodPar ;
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
   private String A3786BarEnvBar ;
   private String A3596BarMaqAma ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String AV38BarFac ;
   private String AV66BarAcaqui ;
   private String AV69BarBot ;
   private String AV79Maqcod ;
   private String AV49BarDishCod ;
   private String AV50BarCom ;
   private String AV51BarEstTip ;
   private String AV52BarTipCor ;
   private String AV53BarObsAnc ;
   private String AV54BarObsGrm ;
   private String AV64Baracc ;
   private String AV75Baritem1 ;
   private String AV82Baritem2 ;
   private String AV83Baritem3 ;
   private String AV84Baritem4 ;
   private String AV85Baritem5 ;
   private String AV86Baritem6 ;
   private String W180BarMaqCod ;
   private String W137BarConPar ;
   private String W935BarReoPar ;
   private String W365DisDes ;
   private String W3310BarFac ;
   private String W4716BarDishCod ;
   private String W5033BarCom ;
   private String W5034BarEstTip ;
   private String W5291BarTipCor ;
   private String W5352BarObsAnc ;
   private String W5351BarObsGrm ;
   private String W5253BarAcc ;
   private String W118BarAcaQui ;
   private String W5058BarEnvLaw ;
   private String W4018BarBot ;
   private String W1500BarNMtr ;
   private String W1499BarNMez ;
   private String W4609BarMdlCod ;
   private String W3744BarPeg ;
   private String W9775BarItem1 ;
   private String W9776barItem2 ;
   private String W9777BarItem3 ;
   private String W9778BarItem4 ;
   private String W9789BarItem5 ;
   private String W9790BarItem6 ;
   private String W4835BarAudOpeN ;
   private String W4837BarAudSupN ;
   private String AV77Fecha_a ;
   private String Gx_time ;
   private String Gx_emsg ;
   private String A187BarNotDsc ;
   private String W187BarNotDsc ;
   private String A13905BarTraID ;
   private String W13905BarTraID ;
   private java.util.Date A8097BarFecHis ;
   private java.util.Date A4613BarHorReg ;
   private java.util.Date A4611BarHorEnt ;
   private java.util.Date A1003BarFecLan ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A157BarFecEnt ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A4832BarAudFec ;
   private java.util.Date A3871BarFecCRe ;
   private java.util.Date A3870BarFecLRe ;
   private java.util.Date A2496BarFecFin ;
   private java.util.Date A2497BarFecIni ;
   private java.util.Date A2448BarFecEnR ;
   private java.util.Date A2447BarFecEnE ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV61BarFecGen ;
   private java.util.Date AV71Fecha1 ;
   private java.util.Date AV72fecha2 ;
   private java.util.Date AV73Fecha3 ;
   private java.util.Date AV74Fecha4 ;
   private java.util.Date W159BarFecGen ;
   private java.util.Date Gx_date ;
   private boolean n1003BarFecLan ;
   private boolean n905ObsReoULin ;
   private boolean n904ObsReoEnt ;
   private boolean n646NotUltLin ;
   private boolean n217BarTipArt ;
   private boolean n4840BarAudMDig ;
   private boolean n4838BarAudNPz ;
   private boolean n4834BarAudOpe ;
   private boolean n4832BarAudFec ;
   private boolean n8568EntSecUlt ;
   private boolean n5057BarFacAbs ;
   private boolean n5056BarBp15 ;
   private boolean n5055BarBp14 ;
   private boolean n5054BarBp13 ;
   private boolean n4845BarAudObs ;
   private boolean n4613BarHorReg ;
   private boolean n4612BarPzas ;
   private boolean n4611BarHorEnt ;
   private boolean n4465BarAcaBak ;
   private boolean n4464BarAcaFor ;
   private boolean n4463BarLotMaq ;
   private boolean n4460BarLotPza ;
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
   private boolean n4837BarAudSupN ;
   private boolean n4835BarAudOpeN ;
   private boolean n4833BarAudTur ;
   private boolean n5053BarBp12 ;
   private boolean n4937BarCtrPdas ;
   private boolean n899TipDefPor ;
   private boolean n833TipDefCod ;
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
   private String A4845BarAudObs ;
   private String A14329BarCnoEncO ;
   private String A13907BarSerDsc2 ;
   private String A11662BarOrdComp ;
   private byte[] aP20 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private byte[] aP8 ;
   private int[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private String[] aP12 ;
   private short[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private short[] aP16 ;
   private short[] aP17 ;
   private byte[] aP18 ;
   private byte[] aP19 ;
   private IDataStoreProvider pr_default ;
   private byte[] P04QU2_A1832BarLisInd ;
   private String[] P04QU2_A1652BarSerDsc ;
   private short[] P04QU2_A1503BarPart ;
   private String[] P04QU2_A1431BarLocDis ;
   private byte[] P04QU2_A1254BarPesBal ;
   private int[] P04QU2_A1235BarNumCli ;
   private String[] P04QU2_A1234BarNomCli ;
   private short[] P04QU2_A1226BarGraCru ;
   private java.math.BigDecimal[] P04QU2_A1224BarEncAnh ;
   private java.math.BigDecimal[] P04QU2_A1223BarEncCom ;
   private short[] P04QU2_A921BarMatiz ;
   private java.util.Date[] P04QU2_A1003BarFecLan ;
   private boolean[] P04QU2_n1003BarFecLan ;
   private byte[] P04QU2_A905ObsReoULin ;
   private boolean[] P04QU2_n905ObsReoULin ;
   private String[] P04QU2_A904ObsReoEnt ;
   private boolean[] P04QU2_n904ObsReoEnt ;
   private short[] P04QU2_A864BarPes ;
   private byte[] P04QU2_A646NotUltLin ;
   private boolean[] P04QU2_n646NotUltLin ;
   private int[] P04QU2_A144BarDisOri ;
   private byte[] P04QU2_A190BarNumAso ;
   private byte[] P04QU2_A149BarEstRes ;
   private byte[] P04QU2_A147BarEstCol ;
   private java.util.Date[] P04QU2_A158BarFecFpr ;
   private int[] P04QU2_A163BarHorCum ;
   private String[] P04QU2_A209BarPri ;
   private String[] P04QU2_A145BarEncOri ;
   private String[] P04QU2_A139BarCorOri ;
   private String[] P04QU2_A214BarSua ;
   private String[] P04QU2_A177BarLar ;
   private String[] P04QU2_A206BarPle ;
   private short[] P04QU2_A126BarAncAca2 ;
   private short[] P04QU2_A125BarAncAca1 ;
   private short[] P04QU2_A128BarAncCru2 ;
   private short[] P04QU2_A127BarAncCru1 ;
   private short[] P04QU2_A234BarUrdP3 ;
   private String[] P04QU2_A231BarUrd3 ;
   private short[] P04QU2_A233BarUrdP2 ;
   private String[] P04QU2_A230BarUrd2 ;
   private short[] P04QU2_A232BarUrdP1 ;
   private String[] P04QU2_A229BarUrd1 ;
   private short[] P04QU2_A226BarTraP3 ;
   private String[] P04QU2_A223BarTra3 ;
   private short[] P04QU2_A225BarTraP2 ;
   private String[] P04QU2_A222BarTra2 ;
   private short[] P04QU2_A224BarTraP1 ;
   private String[] P04QU2_A221BarTra1 ;
   private java.math.BigDecimal[] P04QU2_A211BarRdt ;
   private String[] P04QU2_A182BarMat ;
   private java.math.BigDecimal[] P04QU2_A142BarDiaP ;
   private byte[] P04QU2_A235BarUrg ;
   private java.util.Date[] P04QU2_A161BarFecSal ;
   private String[] P04QU2_A181BarMaqPro ;
   private java.util.Date[] P04QU2_A157BarFecEnt ;
   private byte[] P04QU2_A196BarOrdReo ;
   private short[] P04QU2_A191BarNumPie ;
   private java.util.Date[] P04QU2_A155BarFecCli ;
   private String[] P04QU2_A228BarUniMed ;
   private java.math.BigDecimal[] P04QU2_A192BarNumUni ;
   private byte[] P04QU2_A218BarTipCol ;
   private int[] P04QU2_A136BarColNum ;
   private String[] P04QU2_A135BarColNom ;
   private short[] P04QU2_A217BarTipArt ;
   private boolean[] P04QU2_n217BarTipArt ;
   private String[] P04QU2_A212BarSer ;
   private String[] P04QU2_A143BarDisNum ;
   private int[] P04QU2_A236BarVolMaq ;
   private String[] P04QU2_A120BarAgrEst ;
   private java.math.BigDecimal[] P04QU2_A4840BarAudMDig ;
   private boolean[] P04QU2_n4840BarAudMDig ;
   private short[] P04QU2_A4838BarAudNPz ;
   private boolean[] P04QU2_n4838BarAudNPz ;
   private int[] P04QU2_A4834BarAudOpe ;
   private boolean[] P04QU2_n4834BarAudOpe ;
   private java.util.Date[] P04QU2_A4832BarAudFec ;
   private boolean[] P04QU2_n4832BarAudFec ;
   private int[] P04QU2_A8568EntSecUlt ;
   private boolean[] P04QU2_n8568EntSecUlt ;
   private int[] P04QU2_A8098BarOpeHis ;
   private java.util.Date[] P04QU2_A8097BarFecHis ;
   private String[] P04QU2_A7733BarMaqEst ;
   private String[] P04QU2_A5406BarAntpT ;
   private String[] P04QU2_A5367BarAntp ;
   private String[] P04QU2_A5293BarCodBan ;
   private java.math.BigDecimal[] P04QU2_A5057BarFacAbs ;
   private boolean[] P04QU2_n5057BarFacAbs ;
   private short[] P04QU2_A5056BarBp15 ;
   private boolean[] P04QU2_n5056BarBp15 ;
   private java.math.BigDecimal[] P04QU2_A5055BarBp14 ;
   private boolean[] P04QU2_n5055BarBp14 ;
   private short[] P04QU2_A5054BarBp13 ;
   private boolean[] P04QU2_n5054BarBp13 ;
   private String[] P04QU2_A5009BarLoteA ;
   private short[] P04QU2_A4975BarNumReo ;
   private String[] P04QU2_A4908BarMacPro ;
   private String[] P04QU2_A4845BarAudObs ;
   private boolean[] P04QU2_n4845BarAudObs ;
   private int[] P04QU2_A4836BarAudSup ;
   private String[] P04QU2_A4812BarEncCli ;
   private java.util.Date[] P04QU2_A4613BarHorReg ;
   private boolean[] P04QU2_n4613BarHorReg ;
   private int[] P04QU2_A4612BarPzas ;
   private boolean[] P04QU2_n4612BarPzas ;
   private java.util.Date[] P04QU2_A4611BarHorEnt ;
   private boolean[] P04QU2_n4611BarHorEnt ;
   private String[] P04QU2_A4610BarTam ;
   private String[] P04QU2_A4467BarAcaMar ;
   private short[] P04QU2_A4466BarAcaAnh ;
   private String[] P04QU2_A4465BarAcaBak ;
   private boolean[] P04QU2_n4465BarAcaBak ;
   private int[] P04QU2_A4464BarAcaFor ;
   private boolean[] P04QU2_n4464BarAcaFor ;
   private String[] P04QU2_A4463BarLotMaq ;
   private boolean[] P04QU2_n4463BarLotMaq ;
   private java.math.BigDecimal[] P04QU2_A4462BarLotKgs ;
   private java.math.BigDecimal[] P04QU2_A4461BarLotMts ;
   private short[] P04QU2_A4460BarLotPza ;
   private boolean[] P04QU2_n4460BarLotPza ;
   private String[] P04QU2_A4459BarCruEnr ;
   private java.math.BigDecimal[] P04QU2_A4458BarCruKgs ;
   private boolean[] P04QU2_n4458BarCruKgs ;
   private java.math.BigDecimal[] P04QU2_A4457BarCruMts ;
   private boolean[] P04QU2_n4457BarCruMts ;
   private short[] P04QU2_A4456BarPelAnh ;
   private byte[] P04QU2_A4400BarSitEst ;
   private byte[] P04QU2_A4017BarInci ;
   private String[] P04QU2_A4016BarTin ;
   private byte[] P04QU2_A4015BarEnv ;
   private byte[] P04QU2_A2512BarComULin ;
   private boolean[] P04QU2_n2512BarComULin ;
   private int[] P04QU2_A1799BarDibInt ;
   private String[] P04QU2_A1798BarDibCli ;
   private java.util.Date[] P04QU2_A3871BarFecCRe ;
   private java.util.Date[] P04QU2_A3870BarFecLRe ;
   private String[] P04QU2_A3787BarEnvRec ;
   private boolean[] P04QU2_n3787BarEnvRec ;
   private String[] P04QU2_A3746BarNPed ;
   private String[] P04QU2_A3745BarFoa ;
   private String[] P04QU2_A3313BarNumTon ;
   private short[] P04QU2_A3138BarGraCru2 ;
   private short[] P04QU2_A3137BarGraAca2 ;
   private short[] P04QU2_A3136BarAncSal3 ;
   private short[] P04QU2_A3135BarAncSal2 ;
   private short[] P04QU2_A3134BarAncSal1 ;
   private short[] P04QU2_A3133BarNumCor ;
   private String[] P04QU2_A2836BarPle2 ;
   private String[] P04QU2_A3030BarPlf ;
   private java.math.BigDecimal[] P04QU2_A3006BarCoef ;
   private boolean[] P04QU2_n3006BarCoef ;
   private String[] P04QU2_A2829BarProPer ;
   private java.math.BigDecimal[] P04QU2_A2828BarMtrLot ;
   private java.math.BigDecimal[] P04QU2_A2827BarKgsLot ;
   private short[] P04QU2_A2803UltLinMaq ;
   private boolean[] P04QU2_n2803UltLinMaq ;
   private String[] P04QU2_A2759BarMaqGru ;
   private byte[] P04QU2_A2754BarSitExt ;
   private short[] P04QU2_A2753BarNumTex2 ;
   private boolean[] P04QU2_n2753BarNumTex2 ;
   private String[] P04QU2_A2746BarCodTex ;
   private boolean[] P04QU2_n2746BarCodTex ;
   private int[] P04QU2_A2487BarConEle ;
   private int[] P04QU2_A2488BarConVap ;
   private int[] P04QU2_A2486BarConAgu ;
   private java.util.Date[] P04QU2_A2496BarFecFin ;
   private java.util.Date[] P04QU2_A2497BarFecIni ;
   private String[] P04QU2_A2500BarRDos2 ;
   private String[] P04QU2_A2499BarRDos1 ;
   private String[] P04QU2_A2498BarPrdPes ;
   private String[] P04QU2_A2485BarColPes ;
   private java.math.BigDecimal[] P04QU2_A1911BarRdoA ;
   private java.math.BigDecimal[] P04QU2_A1910BarRdoN ;
   private short[] P04QU2_A1909BarGraAca ;
   private short[] P04QU2_A2458BarObsVL ;
   private boolean[] P04QU2_n2458BarObsVL ;
   private String[] P04QU2_A2453BarEntAca ;
   private boolean[] P04QU2_n2453BarEntAca ;
   private String[] P04QU2_A2452BarCal ;
   private boolean[] P04QU2_n2452BarCal ;
   private short[] P04QU2_A2459BarTemSec ;
   private short[] P04QU2_A2455BarNMont ;
   private boolean[] P04QU2_n2455BarNMont ;
   private String[] P04QU2_A2454BarGirar ;
   private String[] P04QU2_A2460BarTipAca ;
   private java.math.BigDecimal[] P04QU2_A2450BarKgEnR ;
   private boolean[] P04QU2_n2450BarKgEnR ;
   private short[] P04QU2_A2443BarBulEnR ;
   private boolean[] P04QU2_n2443BarBulEnR ;
   private java.util.Date[] P04QU2_A2448BarFecEnR ;
   private boolean[] P04QU2_n2448BarFecEnR ;
   private short[] P04QU2_A2446BarEnULin ;
   private boolean[] P04QU2_n2446BarEnULin ;
   private String[] P04QU2_A2445BarEntEnE ;
   private java.math.BigDecimal[] P04QU2_A2449BarKgEnE ;
   private boolean[] P04QU2_n2449BarKgEnE ;
   private short[] P04QU2_A2442BarBulEnE ;
   private boolean[] P04QU2_n2442BarBulEnE ;
   private java.util.Date[] P04QU2_A2447BarFecEnE ;
   private byte[] P04QU2_A2401BarNumPas ;
   private boolean[] P04QU2_n2401BarNumPas ;
   private int[] P04QU2_A2311BarCliDes ;
   private byte[] P04QU2_A2265BarExt ;
   private boolean[] P04QU2_n2265BarExt ;
   private String[] P04QU2_A2010BarTipDis ;
   private int[] P04QU2_A1923BarCodTN ;
   private String[] P04QU2_A1878BarNumTen ;
   private String[] P04QU2_A396EmprCod ;
   private String[] P04QU2_A365DisDes ;
   private String[] P04QU2_A5058BarEnvLaw ;
   private byte[] P04QU2_A3783BarRecLis ;
   private byte[] P04QU2_A3594BarPriTin ;
   private String[] P04QU2_A4837BarAudSupN ;
   private boolean[] P04QU2_n4837BarAudSupN ;
   private String[] P04QU2_A4835BarAudOpeN ;
   private boolean[] P04QU2_n4835BarAudOpeN ;
   private byte[] P04QU2_A4833BarAudTur ;
   private boolean[] P04QU2_n4833BarAudTur ;
   private String[] P04QU2_A9790BarItem6 ;
   private String[] P04QU2_A9789BarItem5 ;
   private String[] P04QU2_A9778BarItem4 ;
   private String[] P04QU2_A9777BarItem3 ;
   private String[] P04QU2_A9776barItem2 ;
   private String[] P04QU2_A9775BarItem1 ;
   private byte[] P04QU2_A6434BarAsi ;
   private String[] P04QU2_A5352BarObsAnc ;
   private String[] P04QU2_A5351BarObsGrm ;
   private String[] P04QU2_A5291BarTipCor ;
   private String[] P04QU2_A5253BarAcc ;
   private short[] P04QU2_A5053BarBp12 ;
   private boolean[] P04QU2_n5053BarBp12 ;
   private String[] P04QU2_A5034BarEstTip ;
   private String[] P04QU2_A5033BarCom ;
   private byte[] P04QU2_A5027BarGraCob ;
   private byte[] P04QU2_A5026BarTipEst ;
   private byte[] P04QU2_A4937BarCtrPdas ;
   private boolean[] P04QU2_n4937BarCtrPdas ;
   private String[] P04QU2_A4716BarDishCod ;
   private String[] P04QU2_A4609BarMdlCod ;
   private String[] P04QU2_A4018BarBot ;
   private String[] P04QU2_A3744BarPeg ;
   private int[] P04QU2_A3595BarMacCod ;
   private short[] P04QU2_A3312BarManCod2 ;
   private short[] P04QU2_A3311BarManCod1 ;
   private String[] P04QU2_A3310BarFac ;
   private byte[] P04QU2_A2830BarIntPer ;
   private int[] P04QU2_A2826BarNumLot ;
   private byte[] P04QU2_A2752BarNumTex1 ;
   private short[] P04QU2_A2400BarManCod ;
   private String[] P04QU2_A1499BarNMez ;
   private String[] P04QU2_A1500BarNMtr ;
   private String[] P04QU2_A935BarReoPar ;
   private byte[] P04QU2_A936BarReoReo ;
   private int[] P04QU2_A934BarReoCod ;
   private short[] P04QU2_A899TipDefPor ;
   private boolean[] P04QU2_n899TipDefPor ;
   private short[] P04QU2_A833TipDefCod ;
   private boolean[] P04QU2_n833TipDefCod ;
   private byte[] P04QU2_A178BarLis ;
   private java.math.BigDecimal[] P04QU2_A169BarKgsFac ;
   private java.math.BigDecimal[] P04QU2_A140BarCosAny ;
   private java.math.BigDecimal[] P04QU2_A141BarCosPro ;
   private short[] P04QU2_A189BarNumAny ;
   private String[] P04QU2_A137BarConPar ;
   private byte[] P04QU2_A138BarConReo ;
   private byte[] P04QU2_A213BarSit ;
   private byte[] P04QU2_A146BarEst ;
   private String[] P04QU2_A118BarAcaQui ;
   private byte[] P04QU2_A193BarOpeEsp ;
   private byte[] P04QU2_A148BarEstReo ;
   private java.util.Date[] P04QU2_A159BarFecGen ;
   private int[] P04QU2_A361DisCod ;
   private String[] P04QU2_A180BarMaqCod ;
   private String[] P04QU2_A130BarCodPar ;
   private byte[] P04QU2_A132BarCodReo ;
   private int[] P04QU2_A129BarCod ;
   private int[] P04QU2_A252CliCod ;
   private boolean[] P04QU2_n252CliCod ;
   private byte[] P04QU2_A14330BarPriorid ;
   private String[] P04QU2_A14329BarCnoEncO ;
   private String[] P04QU2_A13908BarIdtx2 ;
   private boolean[] P04QU2_n13908BarIdtx2 ;
   private String[] P04QU2_A13907BarSerDsc2 ;
   private boolean[] P04QU2_n13907BarSerDsc2 ;
   private short[] P04QU2_A13769BarRdto4 ;
   private boolean[] P04QU2_n13769BarRdto4 ;
   private long[] P04QU2_A13234BarRGB ;
   private byte[] P04QU2_A13092BarDGUltLi ;
   private boolean[] P04QU2_n13092BarDGUltLi ;
   private String[] P04QU2_A13077BarLinPrd ;
   private int[] P04QU2_A13071BarCanalID ;
   private short[] P04QU2_A13070BarLineaID ;
   private String[] P04QU2_A12881BarOEKOTEX ;
   private boolean[] P04QU2_n12881BarOEKOTEX ;
   private String[] P04QU2_A12811BarLocCol ;
   private String[] P04QU2_A12810BarLocMol ;
   private String[] P04QU2_A12809BarLocTel ;
   private String[] P04QU2_A12774BarProdID ;
   private byte[] P04QU2_A12767BarTpEstam ;
   private String[] P04QU2_A12329SubRevID ;
   private boolean[] P04QU2_n12329SubRevID ;
   private short[] P04QU2_A11857Nxt_desaID ;
   private boolean[] P04QU2_n11857Nxt_desaID ;
   private short[] P04QU2_A11855Nxt_dpoID ;
   private boolean[] P04QU2_n11855Nxt_dpoID ;
   private short[] P04QU2_A11853Nxt_cpeID ;
   private boolean[] P04QU2_n11853Nxt_cpeID ;
   private String[] P04QU2_A11852Nxt_ArtCl2 ;
   private String[] P04QU2_A11851Nxt_Sta2 ;
   private String[] P04QU2_A11850Nxt_Mdlo2 ;
   private java.math.BigDecimal[] P04QU2_A3736BarPieMtl ;
   private java.math.BigDecimal[] P04QU2_A3735BarPieKgl ;
   private short[] P04QU2_A3363BarPiePrv ;
   private java.math.BigDecimal[] P04QU2_A3362BarMtsPrv ;
   private java.math.BigDecimal[] P04QU2_A3361BarKgsPrv ;
   private String[] P04QU2_A3786BarEnvBar ;
   private short[] P04QU2_A3785BarUltAny ;
   private short[] P04QU2_A3784BarAnyTie ;
   private java.math.BigDecimal[] P04QU2_A3780BarKilLam ;
   private int[] P04QU2_A3597BarVolAma ;
   private String[] P04QU2_A3596BarMaqAma ;
   private String[] P04QU2_A11662BarOrdComp ;
   private short[] P04QU2_A4844BarAudULin ;
   private boolean[] P04QU2_n4844BarAudULin ;
   private java.math.BigDecimal[] P04QU2_A4841BarAudMCue ;
   private boolean[] P04QU2_n4841BarAudMCue ;
   private String[] P04QU4_A396EmprCod ;
   private String[] P04QU4_A130BarCodPar ;
   private byte[] P04QU4_A132BarCodReo ;
   private int[] P04QU4_A129BarCod ;
   private String[] P04QU4_A187BarNotDsc ;
   private byte[] P04QU4_A188BarNotLin ;
   private String[] P04QU6_A396EmprCod ;
   private String[] P04QU6_A130BarCodPar ;
   private byte[] P04QU6_A132BarCodReo ;
   private int[] P04QU6_A129BarCod ;
   private String[] P04QU6_A13905BarTraID ;
}

final  class preo001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04QU2", "SELECT BarLisInd, BarSerDsc, BarPart, BarLocDis, BarPesBal, BarNumCli, BarNomCli, BarGraCru, BarEncAnh, BarEncCom, BarMatiz, BarFecLan, ObsReoULin, ObsReoEnt, BarPes, NotUltLin, BarDisOri, BarNumAso, BarEstRes, BarEstCol, BarFecFpr, BarHorCum, BarPri, BarEncOri, BarCorOri, BarSua, BarLar, BarPle, BarAncAca2, BarAncAca1, BarAncCru2, BarAncCru1, BarUrdP3, BarUrd3, BarUrdP2, BarUrd2, BarUrdP1, BarUrd1, BarTraP3, BarTra3, BarTraP2, BarTra2, BarTraP1, BarTra1, BarRdt, BarMat, BarDiaP, BarUrg, BarFecSal, BarMaqPro, BarFecEnt, BarOrdReo, BarNumPie, BarFecCli, BarUniMed, BarNumUni, BarTipCol, BarColNum, BarColNom, BarTipArt, BarSer, BarDisNum, BarVolMaq, BarAgrEst, BarAudMDig, BarAudNPz, BarAudOpe, BarAudFec, EntSecUlt, BarOpeHis, BarFecHis, BarMaqEst, BarAntpT, BarAntp, BarCodBan, BarFacAbs, BarBp15, BarBp14, BarBp13, BarLoteA, BarNumReo, BarMacPro, BarAudObs, BarAudSup, BarEncCli, BarHorReg, BarPzas, BarHorEnt, BarTam, BarAcaMar, BarAcaAnh, BarAcaBak, BarAcaFor, BarLotMaq, BarLotKgs, BarLotMts, BarLotPza, BarCruEnr, BarCruKgs, BarCruMts, BarPelAnh, BarSitEst, BarInci, BarTin, BarEnv, BarComULin, BarDibInt, BarDibCli, BarFecCRe, BarFecLRe, BarEnvRec, BarNPed, BarFoa, BarNumTon, BarGraCru2, BarGraAca2, BarAncSal3, BarAncSal2, BarAncSal1, BarNumCor, BarPle2, BarPlf, BarCoef, BarProPer, BarMtrLot, BarKgsLot, UltLinMaq, BarMaqGru, BarSitExt, BarNumTex2, BarCodTex, BarConEle, BarConVap, BarConAgu, BarFecFin, BarFecIni, BarRDos2, BarRDos1, BarPrdPes, BarColPes, BarRdoA, BarRdoN, BarGraAca, BarObsVL, BarEntAca, BarCal, BarTemSec, BarNMont, BarGirar, BarTipAca, BarKgEnR, BarBulEnR, BarFecEnR, BarEnULin, BarEntEnE, BarKgEnE, BarBulEnE, BarFecEnE, BarNumPas, BarCliDes, BarExt, BarTipDis, BarCodTN, BarNumTen, EmprCod, DisDes, BarEnvLaw, BarRecLis, BarPriTin, BarAudSupN, BarAudOpeN, BarAudTur, BarItem6, BarItem5, BarItem4, BarItem3, barItem2, BarItem1, BarAsi, BarObsAnc, BarObsGrm, BarTipCor, BarAcc, BarBp12, BarEstTip, BarCom, BarGraCob, BarTipEst, BarCtrPdas, BarDishCod, BarMdlCod, BarBot, BarPeg, BarMacCod, BarManCod2, BarManCod1, BarFac, BarIntPer, BarNumLot, BarNumTex1, BarManCod, BarNMez, BarNMtr, BarReoPar, BarReoReo, BarReoCod, TipDefPor, TipDefCod, BarLis, BarKgsFac, BarCosAny, BarCosPro, BarNumAny, BarConPar, BarConReo, BarSit, BarEst, BarAcaQui, BarOpeEsp, BarEstReo, BarFecGen, DisCod, BarMaqCod, BarCodPar, BarCodReo, BarCod, CliCod, BarPriorid, BarCnoEncO, BarIdtx2, BarSerDsc2, BarRdto4, BarRGB, BarDGUltLi, BarLinPrd, BarCanalID, BarLineaID, BarOEKOTEX, BarLocCol, BarLocMol, BarLocTel, BarProdID, BarTpEstam, SubRevID, Nxt_desaID, Nxt_dpoID, Nxt_cpeID, Nxt_ArtCl2, Nxt_Sta2, Nxt_Mdlo2, BarPieMtl, BarPieKgl, BarPiePrv, BarMtsPrv, BarKgsPrv, BarEnvBar, BarUltAny, BarAnyTie, BarKilLam, BarVolAma, BarMaqAma, BarOrdComp, BarAudULin, BarAudMCue FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04QU3", "INSERT INTO TXPBARCAD(EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst, BarMaqCod, BarVolMaq, DisCod, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarSit, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, BarMaqGru, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid, CliCod, DisDes) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P04QU4", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarNotDsc, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04QU5", "INSERT INTO TXPBARNOT(EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin, BarNotDsc) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
         ,new ForEachCursor("P04QU6", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarTraID FROM TXPBARTTI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04QU7", "INSERT INTO TXPBARTTI(EmprCod, BarCod, BarCodReo, BarCodPar, BarTraID) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTTI")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 40);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(15);
               ((byte[]) buf[18])[0] = rslt.getByte(16);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((byte[]) buf[21])[0] = rslt.getByte(18);
               ((byte[]) buf[22])[0] = rslt.getByte(19);
               ((byte[]) buf[23])[0] = rslt.getByte(20);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(21);
               ((int[]) buf[25])[0] = rslt.getInt(22);
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               ((String[]) buf[27])[0] = rslt.getString(24, 1);
               ((String[]) buf[28])[0] = rslt.getString(25, 1);
               ((String[]) buf[29])[0] = rslt.getString(26, 6);
               ((String[]) buf[30])[0] = rslt.getString(27, 10);
               ((String[]) buf[31])[0] = rslt.getString(28, 10);
               ((short[]) buf[32])[0] = rslt.getShort(29);
               ((short[]) buf[33])[0] = rslt.getShort(30);
               ((short[]) buf[34])[0] = rslt.getShort(31);
               ((short[]) buf[35])[0] = rslt.getShort(32);
               ((short[]) buf[36])[0] = rslt.getShort(33);
               ((String[]) buf[37])[0] = rslt.getString(34, 4);
               ((short[]) buf[38])[0] = rslt.getShort(35);
               ((String[]) buf[39])[0] = rslt.getString(36, 4);
               ((short[]) buf[40])[0] = rslt.getShort(37);
               ((String[]) buf[41])[0] = rslt.getString(38, 4);
               ((short[]) buf[42])[0] = rslt.getShort(39);
               ((String[]) buf[43])[0] = rslt.getString(40, 4);
               ((short[]) buf[44])[0] = rslt.getShort(41);
               ((String[]) buf[45])[0] = rslt.getString(42, 4);
               ((short[]) buf[46])[0] = rslt.getShort(43);
               ((String[]) buf[47])[0] = rslt.getString(44, 4);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(45,2);
               ((String[]) buf[49])[0] = rslt.getString(46, 16);
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(47,1);
               ((byte[]) buf[51])[0] = rslt.getByte(48);
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDate(49);
               ((String[]) buf[53])[0] = rslt.getString(50, 6);
               ((java.util.Date[]) buf[54])[0] = rslt.getGXDate(51);
               ((byte[]) buf[55])[0] = rslt.getByte(52);
               ((short[]) buf[56])[0] = rslt.getShort(53);
               ((java.util.Date[]) buf[57])[0] = rslt.getGXDate(54);
               ((String[]) buf[58])[0] = rslt.getString(55, 1);
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(56,2);
               ((byte[]) buf[60])[0] = rslt.getByte(57);
               ((int[]) buf[61])[0] = rslt.getInt(58);
               ((String[]) buf[62])[0] = rslt.getString(59, 13);
               ((short[]) buf[63])[0] = rslt.getShort(60);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(61, 16);
               ((String[]) buf[66])[0] = rslt.getString(62, 8);
               ((int[]) buf[67])[0] = rslt.getInt(63);
               ((String[]) buf[68])[0] = rslt.getString(64, 1);
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(65,2);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((short[]) buf[71])[0] = rslt.getShort(66);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((int[]) buf[73])[0] = rslt.getInt(67);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDate(68);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((int[]) buf[77])[0] = rslt.getInt(69);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((int[]) buf[79])[0] = rslt.getInt(70);
               ((java.util.Date[]) buf[80])[0] = rslt.getGXDateTime(71);
               ((String[]) buf[81])[0] = rslt.getString(72, 6);
               ((String[]) buf[82])[0] = rslt.getString(73, 1);
               ((String[]) buf[83])[0] = rslt.getString(74, 1);
               ((String[]) buf[84])[0] = rslt.getString(75, 15);
               ((java.math.BigDecimal[]) buf[85])[0] = rslt.getBigDecimal(76,2);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((short[]) buf[87])[0] = rslt.getShort(77);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[89])[0] = rslt.getBigDecimal(78,3);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((short[]) buf[91])[0] = rslt.getShort(79);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(80, 10);
               ((short[]) buf[94])[0] = rslt.getShort(81);
               ((String[]) buf[95])[0] = rslt.getString(82, 6);
               ((String[]) buf[96])[0] = rslt.getVarchar(83);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((int[]) buf[98])[0] = rslt.getInt(84);
               ((String[]) buf[99])[0] = rslt.getString(85, 20);
               ((java.util.Date[]) buf[100])[0] = GXutil.resetDate(rslt.getGXDateTime(86));
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((int[]) buf[102])[0] = rslt.getInt(87);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[104])[0] = GXutil.resetDate(rslt.getGXDateTime(88));
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(89, 4);
               ((String[]) buf[107])[0] = rslt.getString(90, 1);
               ((short[]) buf[108])[0] = rslt.getShort(91);
               ((String[]) buf[109])[0] = rslt.getString(92, 1);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((int[]) buf[111])[0] = rslt.getInt(93);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getString(94, 6);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[115])[0] = rslt.getBigDecimal(95,2);
               ((java.math.BigDecimal[]) buf[116])[0] = rslt.getBigDecimal(96,2);
               ((short[]) buf[117])[0] = rslt.getShort(97);
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((String[]) buf[119])[0] = rslt.getString(98, 1);
               ((java.math.BigDecimal[]) buf[120])[0] = rslt.getBigDecimal(99,2);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[122])[0] = rslt.getBigDecimal(100,2);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((short[]) buf[124])[0] = rslt.getShort(101);
               ((byte[]) buf[125])[0] = rslt.getByte(102);
               ((byte[]) buf[126])[0] = rslt.getByte(103);
               ((String[]) buf[127])[0] = rslt.getString(104, 1);
               ((byte[]) buf[128])[0] = rslt.getByte(105);
               ((byte[]) buf[129])[0] = rslt.getByte(106);
               ((boolean[]) buf[130])[0] = rslt.wasNull();
               ((int[]) buf[131])[0] = rslt.getInt(107);
               ((String[]) buf[132])[0] = rslt.getString(108, 16);
               ((java.util.Date[]) buf[133])[0] = rslt.getGXDate(109);
               ((java.util.Date[]) buf[134])[0] = rslt.getGXDate(110);
               ((String[]) buf[135])[0] = rslt.getString(111, 1);
               ((boolean[]) buf[136])[0] = rslt.wasNull();
               ((String[]) buf[137])[0] = rslt.getString(112, 20);
               ((String[]) buf[138])[0] = rslt.getString(113, 1);
               ((String[]) buf[139])[0] = rslt.getString(114, 10);
               ((short[]) buf[140])[0] = rslt.getShort(115);
               ((short[]) buf[141])[0] = rslt.getShort(116);
               ((short[]) buf[142])[0] = rslt.getShort(117);
               ((short[]) buf[143])[0] = rslt.getShort(118);
               ((short[]) buf[144])[0] = rslt.getShort(119);
               ((short[]) buf[145])[0] = rslt.getShort(120);
               ((String[]) buf[146])[0] = rslt.getString(121, 30);
               ((String[]) buf[147])[0] = rslt.getString(122, 1);
               ((java.math.BigDecimal[]) buf[148])[0] = rslt.getBigDecimal(123,2);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((String[]) buf[150])[0] = rslt.getString(124, 8);
               ((java.math.BigDecimal[]) buf[151])[0] = rslt.getBigDecimal(125,2);
               ((java.math.BigDecimal[]) buf[152])[0] = rslt.getBigDecimal(126,2);
               ((short[]) buf[153])[0] = rslt.getShort(127);
               ((boolean[]) buf[154])[0] = rslt.wasNull();
               ((String[]) buf[155])[0] = rslt.getString(128, 4);
               ((byte[]) buf[156])[0] = rslt.getByte(129);
               ((short[]) buf[157])[0] = rslt.getShort(130);
               ((boolean[]) buf[158])[0] = rslt.wasNull();
               ((String[]) buf[159])[0] = rslt.getString(131, 4);
               ((boolean[]) buf[160])[0] = rslt.wasNull();
               ((int[]) buf[161])[0] = rslt.getInt(132);
               ((int[]) buf[162])[0] = rslt.getInt(133);
               ((int[]) buf[163])[0] = rslt.getInt(134);
               ((java.util.Date[]) buf[164])[0] = rslt.getGXDate(135);
               ((java.util.Date[]) buf[165])[0] = rslt.getGXDate(136);
               ((String[]) buf[166])[0] = rslt.getString(137, 1);
               ((String[]) buf[167])[0] = rslt.getString(138, 1);
               ((String[]) buf[168])[0] = rslt.getString(139, 1);
               ((String[]) buf[169])[0] = rslt.getString(140, 1);
               ((java.math.BigDecimal[]) buf[170])[0] = rslt.getBigDecimal(141,2);
               ((java.math.BigDecimal[]) buf[171])[0] = rslt.getBigDecimal(142,2);
               ((short[]) buf[172])[0] = rslt.getShort(143);
               ((short[]) buf[173])[0] = rslt.getShort(144);
               ((boolean[]) buf[174])[0] = rslt.wasNull();
               ((String[]) buf[175])[0] = rslt.getString(145, 20);
               ((boolean[]) buf[176])[0] = rslt.wasNull();
               ((String[]) buf[177])[0] = rslt.getString(146, 20);
               ((boolean[]) buf[178])[0] = rslt.wasNull();
               ((short[]) buf[179])[0] = rslt.getShort(147);
               ((short[]) buf[180])[0] = rslt.getShort(148);
               ((boolean[]) buf[181])[0] = rslt.wasNull();
               ((String[]) buf[182])[0] = rslt.getString(149, 20);
               ((String[]) buf[183])[0] = rslt.getString(150, 1);
               ((java.math.BigDecimal[]) buf[184])[0] = rslt.getBigDecimal(151,2);
               ((boolean[]) buf[185])[0] = rslt.wasNull();
               ((short[]) buf[186])[0] = rslt.getShort(152);
               ((boolean[]) buf[187])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[188])[0] = rslt.getGXDate(153);
               ((boolean[]) buf[189])[0] = rslt.wasNull();
               ((short[]) buf[190])[0] = rslt.getShort(154);
               ((boolean[]) buf[191])[0] = rslt.wasNull();
               ((String[]) buf[192])[0] = rslt.getString(155, 30);
               ((java.math.BigDecimal[]) buf[193])[0] = rslt.getBigDecimal(156,2);
               ((boolean[]) buf[194])[0] = rslt.wasNull();
               ((short[]) buf[195])[0] = rslt.getShort(157);
               ((boolean[]) buf[196])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[197])[0] = rslt.getGXDate(158);
               ((byte[]) buf[198])[0] = rslt.getByte(159);
               ((boolean[]) buf[199])[0] = rslt.wasNull();
               ((int[]) buf[200])[0] = rslt.getInt(160);
               ((byte[]) buf[201])[0] = rslt.getByte(161);
               ((boolean[]) buf[202])[0] = rslt.wasNull();
               ((String[]) buf[203])[0] = rslt.getString(162, 1);
               ((int[]) buf[204])[0] = rslt.getInt(163);
               ((String[]) buf[205])[0] = rslt.getString(164, 10);
               ((String[]) buf[206])[0] = rslt.getString(165, 3);
               ((String[]) buf[207])[0] = rslt.getString(166, 1);
               ((String[]) buf[208])[0] = rslt.getString(167, 1);
               ((byte[]) buf[209])[0] = rslt.getByte(168);
               ((byte[]) buf[210])[0] = rslt.getByte(169);
               ((String[]) buf[211])[0] = rslt.getString(170, 30);
               ((boolean[]) buf[212])[0] = rslt.wasNull();
               ((String[]) buf[213])[0] = rslt.getString(171, 30);
               ((boolean[]) buf[214])[0] = rslt.wasNull();
               ((byte[]) buf[215])[0] = rslt.getByte(172);
               ((boolean[]) buf[216])[0] = rslt.wasNull();
               ((String[]) buf[217])[0] = rslt.getString(173, 20);
               ((String[]) buf[218])[0] = rslt.getString(174, 20);
               ((String[]) buf[219])[0] = rslt.getString(175, 20);
               ((String[]) buf[220])[0] = rslt.getString(176, 20);
               ((String[]) buf[221])[0] = rslt.getString(177, 20);
               ((String[]) buf[222])[0] = rslt.getString(178, 20);
               ((byte[]) buf[223])[0] = rslt.getByte(179);
               ((String[]) buf[224])[0] = rslt.getString(180, 20);
               ((String[]) buf[225])[0] = rslt.getString(181, 20);
               ((String[]) buf[226])[0] = rslt.getString(182, 2);
               ((String[]) buf[227])[0] = rslt.getString(183, 1);
               ((short[]) buf[228])[0] = rslt.getShort(184);
               ((boolean[]) buf[229])[0] = rslt.wasNull();
               ((String[]) buf[230])[0] = rslt.getString(185, 1);
               ((String[]) buf[231])[0] = rslt.getString(186, 12);
               ((byte[]) buf[232])[0] = rslt.getByte(187);
               ((byte[]) buf[233])[0] = rslt.getByte(188);
               ((byte[]) buf[234])[0] = rslt.getByte(189);
               ((boolean[]) buf[235])[0] = rslt.wasNull();
               ((String[]) buf[236])[0] = rslt.getString(190, 12);
               ((String[]) buf[237])[0] = rslt.getString(191, 13);
               ((String[]) buf[238])[0] = rslt.getString(192, 1);
               ((String[]) buf[239])[0] = rslt.getString(193, 1);
               ((int[]) buf[240])[0] = rslt.getInt(194);
               ((short[]) buf[241])[0] = rslt.getShort(195);
               ((short[]) buf[242])[0] = rslt.getShort(196);
               ((String[]) buf[243])[0] = rslt.getString(197, 1);
               ((byte[]) buf[244])[0] = rslt.getByte(198);
               ((int[]) buf[245])[0] = rslt.getInt(199);
               ((byte[]) buf[246])[0] = rslt.getByte(200);
               ((short[]) buf[247])[0] = rslt.getShort(201);
               ((String[]) buf[248])[0] = rslt.getString(202, 10);
               ((String[]) buf[249])[0] = rslt.getString(203, 10);
               ((String[]) buf[250])[0] = rslt.getString(204, 1);
               ((byte[]) buf[251])[0] = rslt.getByte(205);
               ((int[]) buf[252])[0] = rslt.getInt(206);
               ((short[]) buf[253])[0] = rslt.getShort(207);
               ((boolean[]) buf[254])[0] = rslt.wasNull();
               ((short[]) buf[255])[0] = rslt.getShort(208);
               ((boolean[]) buf[256])[0] = rslt.wasNull();
               ((byte[]) buf[257])[0] = rslt.getByte(209);
               ((java.math.BigDecimal[]) buf[258])[0] = rslt.getBigDecimal(210,2);
               ((java.math.BigDecimal[]) buf[259])[0] = rslt.getBigDecimal(211,2);
               ((java.math.BigDecimal[]) buf[260])[0] = rslt.getBigDecimal(212,2);
               ((short[]) buf[261])[0] = rslt.getShort(213);
               ((String[]) buf[262])[0] = rslt.getString(214, 1);
               ((byte[]) buf[263])[0] = rslt.getByte(215);
               ((byte[]) buf[264])[0] = rslt.getByte(216);
               ((byte[]) buf[265])[0] = rslt.getByte(217);
               ((String[]) buf[266])[0] = rslt.getString(218, 6);
               ((byte[]) buf[267])[0] = rslt.getByte(219);
               ((byte[]) buf[268])[0] = rslt.getByte(220);
               ((java.util.Date[]) buf[269])[0] = rslt.getGXDate(221);
               ((int[]) buf[270])[0] = rslt.getInt(222);
               ((String[]) buf[271])[0] = rslt.getString(223, 6);
               ((String[]) buf[272])[0] = rslt.getString(224, 1);
               ((byte[]) buf[273])[0] = rslt.getByte(225);
               ((int[]) buf[274])[0] = rslt.getInt(226);
               ((int[]) buf[275])[0] = rslt.getInt(227);
               ((boolean[]) buf[276])[0] = rslt.wasNull();
               ((byte[]) buf[277])[0] = rslt.getByte(228);
               ((String[]) buf[278])[0] = rslt.getVarchar(229);
               ((String[]) buf[279])[0] = rslt.getString(230, 4);
               ((boolean[]) buf[280])[0] = rslt.wasNull();
               ((String[]) buf[281])[0] = rslt.getVarchar(231);
               ((boolean[]) buf[282])[0] = rslt.wasNull();
               ((short[]) buf[283])[0] = rslt.getShort(232);
               ((boolean[]) buf[284])[0] = rslt.wasNull();
               ((long[]) buf[285])[0] = rslt.getLong(233);
               ((byte[]) buf[286])[0] = rslt.getByte(234);
               ((boolean[]) buf[287])[0] = rslt.wasNull();
               ((String[]) buf[288])[0] = rslt.getString(235, 4);
               ((int[]) buf[289])[0] = rslt.getInt(236);
               ((short[]) buf[290])[0] = rslt.getShort(237);
               ((String[]) buf[291])[0] = rslt.getString(238, 1);
               ((boolean[]) buf[292])[0] = rslt.wasNull();
               ((String[]) buf[293])[0] = rslt.getString(239, 10);
               ((String[]) buf[294])[0] = rslt.getString(240, 10);
               ((String[]) buf[295])[0] = rslt.getString(241, 10);
               ((String[]) buf[296])[0] = rslt.getString(242, 6);
               ((byte[]) buf[297])[0] = rslt.getByte(243);
               ((String[]) buf[298])[0] = rslt.getString(244, 10);
               ((boolean[]) buf[299])[0] = rslt.wasNull();
               ((short[]) buf[300])[0] = rslt.getShort(245);
               ((boolean[]) buf[301])[0] = rslt.wasNull();
               ((short[]) buf[302])[0] = rslt.getShort(246);
               ((boolean[]) buf[303])[0] = rslt.wasNull();
               ((short[]) buf[304])[0] = rslt.getShort(247);
               ((boolean[]) buf[305])[0] = rslt.wasNull();
               ((String[]) buf[306])[0] = rslt.getString(248, 30);
               ((String[]) buf[307])[0] = rslt.getString(249, 4);
               ((String[]) buf[308])[0] = rslt.getString(250, 30);
               ((java.math.BigDecimal[]) buf[309])[0] = rslt.getBigDecimal(251,2);
               ((java.math.BigDecimal[]) buf[310])[0] = rslt.getBigDecimal(252,2);
               ((short[]) buf[311])[0] = rslt.getShort(253);
               ((java.math.BigDecimal[]) buf[312])[0] = rslt.getBigDecimal(254,2);
               ((java.math.BigDecimal[]) buf[313])[0] = rslt.getBigDecimal(255,2);
               ((String[]) buf[314])[0] = rslt.getString(256, 1);
               ((short[]) buf[315])[0] = rslt.getShort(257);
               ((short[]) buf[316])[0] = rslt.getShort(258);
               ((java.math.BigDecimal[]) buf[317])[0] = rslt.getBigDecimal(259,2);
               ((int[]) buf[318])[0] = rslt.getInt(260);
               ((String[]) buf[319])[0] = rslt.getString(261, 6);
               ((String[]) buf[320])[0] = rslt.getVarchar(262);
               ((short[]) buf[321])[0] = rslt.getShort(263);
               ((boolean[]) buf[322])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[323])[0] = rslt.getBigDecimal(264,2);
               ((boolean[]) buf[324])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 65);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 4);
               return;
      }
   }

}

