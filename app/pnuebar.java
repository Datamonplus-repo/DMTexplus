package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnuebar extends GXProcedure
{
   public pnuebar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnuebar.class ), "" );
   }

   public pnuebar( int remoteHandle ,
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
      pnuebar.this.aP20 = new byte[] {0};
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
      pnuebar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnuebar.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      pnuebar.this.AV16BarConReo = aP2[0];
      this.aP2 = aP2;
      pnuebar.this.AV17BarParPan = aP3[0];
      this.aP3 = aP3;
      pnuebar.this.AV18BarCodOri = aP4[0];
      this.aP4 = aP4;
      pnuebar.this.AV19BarReoOri = aP5[0];
      this.aP5 = aP5;
      pnuebar.this.AV20BarParOri = aP6[0];
      this.aP6 = aP6;
      pnuebar.this.AV21DisCod = aP7[0];
      this.aP7 = aP7;
      pnuebar.this.AV22Sit2 = aP8[0];
      this.aP8 = aP8;
      pnuebar.this.AV23BarPieNDes = aP9[0];
      this.aP9 = aP9;
      pnuebar.this.AV24CosPro = aP10[0];
      this.aP10 = aP10;
      pnuebar.this.AV25CosAny = aP11[0];
      this.aP11 = aP11;
      pnuebar.this.AV26BarMaqCod = aP12[0];
      this.aP12 = aP12;
      pnuebar.this.AV27BarNumAny = aP13[0];
      this.aP13 = aP13;
      pnuebar.this.AV28BarConPar = aP14[0];
      this.aP14 = aP14;
      pnuebar.this.AV29DisDes = aP15[0];
      this.aP15 = aP15;
      pnuebar.this.AV30TipDefCod = aP16[0];
      this.aP16 = aP16;
      pnuebar.this.AV31TipDefPor = aP17[0];
      this.aP17 = aP17;
      pnuebar.this.AV32Flag = aP18[0];
      this.aP18 = aP18;
      pnuebar.this.AV33BarEstReo = aP19[0];
      this.aP19 = aP19;
      pnuebar.this.AV34BarOpeEsp = aP20[0];
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
      pnuebar.this.GXt_char1 = GXv_char2[0] ;
      AV43station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV46EmprNom ;
      GXv_char4[0] = AV44UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43station, GXv_char2, GXv_char3, GXv_char4) ;
      pnuebar.this.A396EmprCod = GXv_char2[0] ;
      pnuebar.this.AV46EmprNom = GXv_char3[0] ;
      pnuebar.this.AV44UsurCod = GXv_char4[0] ;
      AV36FlagJM = (byte)(0) ;
      GXv_int5[0] = AV36FlagJM ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JMOLTO", ""), GXv_int5) ;
      pnuebar.this.AV36FlagJM = GXv_int5[0] ;
      AV37FlagTn = (byte)(0) ;
      GXv_int5[0] = AV37FlagTn ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VELLUT", ""), GXv_int5) ;
      pnuebar.this.AV37FlagTn = GXv_int5[0] ;
      AV42JBP = (byte)(0) ;
      GXv_int5[0] = AV42JBP ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBURGO", ""), GXv_int5) ;
      pnuebar.this.AV42JBP = GXv_int5[0] ;
      AV56F_endutex = (byte)(0) ;
      GXv_int5[0] = AV56F_endutex ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int5) ;
      pnuebar.this.AV56F_endutex = GXv_int5[0] ;
      AV57F_tinamar = (byte)(0) ;
      GXv_int5[0] = AV57F_tinamar ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int5) ;
      pnuebar.this.AV57F_tinamar = GXv_int5[0] ;
      AV58F_carvema = (byte)(0) ;
      GXv_int5[0] = AV58F_carvema ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int5) ;
      pnuebar.this.AV58F_carvema = GXv_int5[0] ;
      AV59FlagInt = (byte)(0) ;
      GXv_int5[0] = AV59FlagInt ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODINT", ""), GXv_int5) ;
      pnuebar.this.AV59FlagInt = GXv_int5[0] ;
      GXt_int6 = AV62F_fechdr ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FECHDR", ""), GXv_int5) ;
      pnuebar.this.GXt_int6 = GXv_int5[0] ;
      AV62F_fechdr = GXt_int6 ;
      GXt_int6 = AV63Induyco ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INDUYC", ""), GXv_int5) ;
      pnuebar.this.GXt_int6 = GXv_int5[0] ;
      AV63Induyco = GXt_int6 ;
      GXt_int6 = AV65Texfina ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int5) ;
      pnuebar.this.GXt_int6 = GXv_int5[0] ;
      AV65Texfina = GXt_int6 ;
      GXt_int6 = AV76CtrlUsu ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CRTLOS", ""), GXv_int5) ;
      pnuebar.this.GXt_int6 = GXv_int5[0] ;
      AV76CtrlUsu = GXt_int6 ;
      GXt_int6 = AV78Orient ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int5) ;
      pnuebar.this.GXt_int6 = GXv_int5[0] ;
      AV78Orient = GXt_int6 ;
      GXt_int6 = AV80Bros ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS", ""), GXv_int5) ;
      pnuebar.this.GXt_int6 = GXv_int5[0] ;
      AV80Bros = GXt_int6 ;
      GXt_int6 = AV81WorkNotas ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "WWNOTA", ""), GXv_int5) ;
      pnuebar.this.GXt_int6 = GXv_int5[0] ;
      AV81WorkNotas = GXt_int6 ;
      GXt_int6 = AV82Tintutex ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int5) ;
      pnuebar.this.GXt_int6 = GXv_int5[0] ;
      AV82Tintutex = GXt_int6 ;
      GXt_int6 = AV84carvitin ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int5) ;
      pnuebar.this.GXt_int6 = GXv_int5[0] ;
      AV84carvitin = GXt_int6 ;
      /* Using cursor P009I2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCodOri), Byte.valueOf(AV19BarReoOri), AV20BarParOri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1878BarNumTen = P009I2_A1878BarNumTen[0] ;
         A1832BarLisInd = P009I2_A1832BarLisInd[0] ;
         A1652BarSerDsc = P009I2_A1652BarSerDsc[0] ;
         A1503BarPart = P009I2_A1503BarPart[0] ;
         A1431BarLocDis = P009I2_A1431BarLocDis[0] ;
         A1254BarPesBal = P009I2_A1254BarPesBal[0] ;
         A1235BarNumCli = P009I2_A1235BarNumCli[0] ;
         A1234BarNomCli = P009I2_A1234BarNomCli[0] ;
         A1226BarGraCru = P009I2_A1226BarGraCru[0] ;
         A1224BarEncAnh = P009I2_A1224BarEncAnh[0] ;
         A1223BarEncCom = P009I2_A1223BarEncCom[0] ;
         A921BarMatiz = P009I2_A921BarMatiz[0] ;
         A1003BarFecLan = P009I2_A1003BarFecLan[0] ;
         n1003BarFecLan = P009I2_n1003BarFecLan[0] ;
         A905ObsReoULin = P009I2_A905ObsReoULin[0] ;
         n905ObsReoULin = P009I2_n905ObsReoULin[0] ;
         A904ObsReoEnt = P009I2_A904ObsReoEnt[0] ;
         n904ObsReoEnt = P009I2_n904ObsReoEnt[0] ;
         A864BarPes = P009I2_A864BarPes[0] ;
         A646NotUltLin = P009I2_A646NotUltLin[0] ;
         n646NotUltLin = P009I2_n646NotUltLin[0] ;
         A144BarDisOri = P009I2_A144BarDisOri[0] ;
         A190BarNumAso = P009I2_A190BarNumAso[0] ;
         A149BarEstRes = P009I2_A149BarEstRes[0] ;
         A147BarEstCol = P009I2_A147BarEstCol[0] ;
         A158BarFecFpr = P009I2_A158BarFecFpr[0] ;
         A163BarHorCum = P009I2_A163BarHorCum[0] ;
         A209BarPri = P009I2_A209BarPri[0] ;
         A145BarEncOri = P009I2_A145BarEncOri[0] ;
         A139BarCorOri = P009I2_A139BarCorOri[0] ;
         A214BarSua = P009I2_A214BarSua[0] ;
         A177BarLar = P009I2_A177BarLar[0] ;
         A206BarPle = P009I2_A206BarPle[0] ;
         A126BarAncAca2 = P009I2_A126BarAncAca2[0] ;
         A125BarAncAca1 = P009I2_A125BarAncAca1[0] ;
         A128BarAncCru2 = P009I2_A128BarAncCru2[0] ;
         A127BarAncCru1 = P009I2_A127BarAncCru1[0] ;
         A234BarUrdP3 = P009I2_A234BarUrdP3[0] ;
         A231BarUrd3 = P009I2_A231BarUrd3[0] ;
         A233BarUrdP2 = P009I2_A233BarUrdP2[0] ;
         A230BarUrd2 = P009I2_A230BarUrd2[0] ;
         A232BarUrdP1 = P009I2_A232BarUrdP1[0] ;
         A229BarUrd1 = P009I2_A229BarUrd1[0] ;
         A226BarTraP3 = P009I2_A226BarTraP3[0] ;
         A223BarTra3 = P009I2_A223BarTra3[0] ;
         A225BarTraP2 = P009I2_A225BarTraP2[0] ;
         A222BarTra2 = P009I2_A222BarTra2[0] ;
         A224BarTraP1 = P009I2_A224BarTraP1[0] ;
         A221BarTra1 = P009I2_A221BarTra1[0] ;
         A211BarRdt = P009I2_A211BarRdt[0] ;
         A182BarMat = P009I2_A182BarMat[0] ;
         A142BarDiaP = P009I2_A142BarDiaP[0] ;
         A235BarUrg = P009I2_A235BarUrg[0] ;
         A161BarFecSal = P009I2_A161BarFecSal[0] ;
         A181BarMaqPro = P009I2_A181BarMaqPro[0] ;
         A157BarFecEnt = P009I2_A157BarFecEnt[0] ;
         A196BarOrdReo = P009I2_A196BarOrdReo[0] ;
         A191BarNumPie = P009I2_A191BarNumPie[0] ;
         A155BarFecCli = P009I2_A155BarFecCli[0] ;
         A228BarUniMed = P009I2_A228BarUniMed[0] ;
         A192BarNumUni = P009I2_A192BarNumUni[0] ;
         A218BarTipCol = P009I2_A218BarTipCol[0] ;
         A136BarColNum = P009I2_A136BarColNum[0] ;
         A135BarColNom = P009I2_A135BarColNom[0] ;
         A217BarTipArt = P009I2_A217BarTipArt[0] ;
         n217BarTipArt = P009I2_n217BarTipArt[0] ;
         A212BarSer = P009I2_A212BarSer[0] ;
         A143BarDisNum = P009I2_A143BarDisNum[0] ;
         A236BarVolMaq = P009I2_A236BarVolMaq[0] ;
         A4841BarAudMCue = P009I2_A4841BarAudMCue[0] ;
         n4841BarAudMCue = P009I2_n4841BarAudMCue[0] ;
         A4840BarAudMDig = P009I2_A4840BarAudMDig[0] ;
         n4840BarAudMDig = P009I2_n4840BarAudMDig[0] ;
         A4838BarAudNPz = P009I2_A4838BarAudNPz[0] ;
         n4838BarAudNPz = P009I2_n4838BarAudNPz[0] ;
         A4834BarAudOpe = P009I2_A4834BarAudOpe[0] ;
         n4834BarAudOpe = P009I2_n4834BarAudOpe[0] ;
         A4832BarAudFec = P009I2_A4832BarAudFec[0] ;
         n4832BarAudFec = P009I2_n4832BarAudFec[0] ;
         A8568EntSecUlt = P009I2_A8568EntSecUlt[0] ;
         n8568EntSecUlt = P009I2_n8568EntSecUlt[0] ;
         A8098BarOpeHis = P009I2_A8098BarOpeHis[0] ;
         A8097BarFecHis = P009I2_A8097BarFecHis[0] ;
         A7733BarMaqEst = P009I2_A7733BarMaqEst[0] ;
         A5406BarAntpT = P009I2_A5406BarAntpT[0] ;
         A5367BarAntp = P009I2_A5367BarAntp[0] ;
         A5293BarCodBan = P009I2_A5293BarCodBan[0] ;
         A5057BarFacAbs = P009I2_A5057BarFacAbs[0] ;
         n5057BarFacAbs = P009I2_n5057BarFacAbs[0] ;
         A5056BarBp15 = P009I2_A5056BarBp15[0] ;
         n5056BarBp15 = P009I2_n5056BarBp15[0] ;
         A5055BarBp14 = P009I2_A5055BarBp14[0] ;
         n5055BarBp14 = P009I2_n5055BarBp14[0] ;
         A5054BarBp13 = P009I2_A5054BarBp13[0] ;
         n5054BarBp13 = P009I2_n5054BarBp13[0] ;
         A5009BarLoteA = P009I2_A5009BarLoteA[0] ;
         A4975BarNumReo = P009I2_A4975BarNumReo[0] ;
         A4908BarMacPro = P009I2_A4908BarMacPro[0] ;
         A4845BarAudObs = P009I2_A4845BarAudObs[0] ;
         n4845BarAudObs = P009I2_n4845BarAudObs[0] ;
         A4836BarAudSup = P009I2_A4836BarAudSup[0] ;
         A4812BarEncCli = P009I2_A4812BarEncCli[0] ;
         A4613BarHorReg = P009I2_A4613BarHorReg[0] ;
         n4613BarHorReg = P009I2_n4613BarHorReg[0] ;
         A4612BarPzas = P009I2_A4612BarPzas[0] ;
         n4612BarPzas = P009I2_n4612BarPzas[0] ;
         A4611BarHorEnt = P009I2_A4611BarHorEnt[0] ;
         n4611BarHorEnt = P009I2_n4611BarHorEnt[0] ;
         A4610BarTam = P009I2_A4610BarTam[0] ;
         A4467BarAcaMar = P009I2_A4467BarAcaMar[0] ;
         A4466BarAcaAnh = P009I2_A4466BarAcaAnh[0] ;
         A4465BarAcaBak = P009I2_A4465BarAcaBak[0] ;
         n4465BarAcaBak = P009I2_n4465BarAcaBak[0] ;
         A4464BarAcaFor = P009I2_A4464BarAcaFor[0] ;
         n4464BarAcaFor = P009I2_n4464BarAcaFor[0] ;
         A4463BarLotMaq = P009I2_A4463BarLotMaq[0] ;
         n4463BarLotMaq = P009I2_n4463BarLotMaq[0] ;
         A4462BarLotKgs = P009I2_A4462BarLotKgs[0] ;
         A4461BarLotMts = P009I2_A4461BarLotMts[0] ;
         A4460BarLotPza = P009I2_A4460BarLotPza[0] ;
         n4460BarLotPza = P009I2_n4460BarLotPza[0] ;
         A4459BarCruEnr = P009I2_A4459BarCruEnr[0] ;
         A4458BarCruKgs = P009I2_A4458BarCruKgs[0] ;
         n4458BarCruKgs = P009I2_n4458BarCruKgs[0] ;
         A4457BarCruMts = P009I2_A4457BarCruMts[0] ;
         n4457BarCruMts = P009I2_n4457BarCruMts[0] ;
         A4456BarPelAnh = P009I2_A4456BarPelAnh[0] ;
         A4400BarSitEst = P009I2_A4400BarSitEst[0] ;
         A4017BarInci = P009I2_A4017BarInci[0] ;
         A4016BarTin = P009I2_A4016BarTin[0] ;
         A4015BarEnv = P009I2_A4015BarEnv[0] ;
         A2512BarComULin = P009I2_A2512BarComULin[0] ;
         n2512BarComULin = P009I2_n2512BarComULin[0] ;
         A1799BarDibInt = P009I2_A1799BarDibInt[0] ;
         A1798BarDibCli = P009I2_A1798BarDibCli[0] ;
         A3871BarFecCRe = P009I2_A3871BarFecCRe[0] ;
         A3870BarFecLRe = P009I2_A3870BarFecLRe[0] ;
         A3787BarEnvRec = P009I2_A3787BarEnvRec[0] ;
         n3787BarEnvRec = P009I2_n3787BarEnvRec[0] ;
         A3746BarNPed = P009I2_A3746BarNPed[0] ;
         A3745BarFoa = P009I2_A3745BarFoa[0] ;
         A3313BarNumTon = P009I2_A3313BarNumTon[0] ;
         A3138BarGraCru2 = P009I2_A3138BarGraCru2[0] ;
         A3137BarGraAca2 = P009I2_A3137BarGraAca2[0] ;
         A3136BarAncSal3 = P009I2_A3136BarAncSal3[0] ;
         A3135BarAncSal2 = P009I2_A3135BarAncSal2[0] ;
         A3134BarAncSal1 = P009I2_A3134BarAncSal1[0] ;
         A3133BarNumCor = P009I2_A3133BarNumCor[0] ;
         A2836BarPle2 = P009I2_A2836BarPle2[0] ;
         A3030BarPlf = P009I2_A3030BarPlf[0] ;
         A3006BarCoef = P009I2_A3006BarCoef[0] ;
         n3006BarCoef = P009I2_n3006BarCoef[0] ;
         A2829BarProPer = P009I2_A2829BarProPer[0] ;
         A2828BarMtrLot = P009I2_A2828BarMtrLot[0] ;
         A2827BarKgsLot = P009I2_A2827BarKgsLot[0] ;
         A2803UltLinMaq = P009I2_A2803UltLinMaq[0] ;
         n2803UltLinMaq = P009I2_n2803UltLinMaq[0] ;
         A2759BarMaqGru = P009I2_A2759BarMaqGru[0] ;
         A2754BarSitExt = P009I2_A2754BarSitExt[0] ;
         A2753BarNumTex2 = P009I2_A2753BarNumTex2[0] ;
         n2753BarNumTex2 = P009I2_n2753BarNumTex2[0] ;
         A2746BarCodTex = P009I2_A2746BarCodTex[0] ;
         n2746BarCodTex = P009I2_n2746BarCodTex[0] ;
         A2487BarConEle = P009I2_A2487BarConEle[0] ;
         A2488BarConVap = P009I2_A2488BarConVap[0] ;
         A2486BarConAgu = P009I2_A2486BarConAgu[0] ;
         A2496BarFecFin = P009I2_A2496BarFecFin[0] ;
         A2497BarFecIni = P009I2_A2497BarFecIni[0] ;
         A2500BarRDos2 = P009I2_A2500BarRDos2[0] ;
         A2499BarRDos1 = P009I2_A2499BarRDos1[0] ;
         A2498BarPrdPes = P009I2_A2498BarPrdPes[0] ;
         A2485BarColPes = P009I2_A2485BarColPes[0] ;
         A1911BarRdoA = P009I2_A1911BarRdoA[0] ;
         A1910BarRdoN = P009I2_A1910BarRdoN[0] ;
         A1909BarGraAca = P009I2_A1909BarGraAca[0] ;
         A2458BarObsVL = P009I2_A2458BarObsVL[0] ;
         n2458BarObsVL = P009I2_n2458BarObsVL[0] ;
         A2453BarEntAca = P009I2_A2453BarEntAca[0] ;
         n2453BarEntAca = P009I2_n2453BarEntAca[0] ;
         A2452BarCal = P009I2_A2452BarCal[0] ;
         n2452BarCal = P009I2_n2452BarCal[0] ;
         A2459BarTemSec = P009I2_A2459BarTemSec[0] ;
         A2455BarNMont = P009I2_A2455BarNMont[0] ;
         n2455BarNMont = P009I2_n2455BarNMont[0] ;
         A2454BarGirar = P009I2_A2454BarGirar[0] ;
         A2460BarTipAca = P009I2_A2460BarTipAca[0] ;
         A2450BarKgEnR = P009I2_A2450BarKgEnR[0] ;
         n2450BarKgEnR = P009I2_n2450BarKgEnR[0] ;
         A2443BarBulEnR = P009I2_A2443BarBulEnR[0] ;
         n2443BarBulEnR = P009I2_n2443BarBulEnR[0] ;
         A2448BarFecEnR = P009I2_A2448BarFecEnR[0] ;
         n2448BarFecEnR = P009I2_n2448BarFecEnR[0] ;
         A2446BarEnULin = P009I2_A2446BarEnULin[0] ;
         n2446BarEnULin = P009I2_n2446BarEnULin[0] ;
         A2445BarEntEnE = P009I2_A2445BarEntEnE[0] ;
         A2449BarKgEnE = P009I2_A2449BarKgEnE[0] ;
         n2449BarKgEnE = P009I2_n2449BarKgEnE[0] ;
         A2442BarBulEnE = P009I2_A2442BarBulEnE[0] ;
         n2442BarBulEnE = P009I2_n2442BarBulEnE[0] ;
         A2447BarFecEnE = P009I2_A2447BarFecEnE[0] ;
         A2401BarNumPas = P009I2_A2401BarNumPas[0] ;
         n2401BarNumPas = P009I2_n2401BarNumPas[0] ;
         A2311BarCliDes = P009I2_A2311BarCliDes[0] ;
         A2265BarExt = P009I2_A2265BarExt[0] ;
         n2265BarExt = P009I2_n2265BarExt[0] ;
         A2010BarTipDis = P009I2_A2010BarTipDis[0] ;
         A1923BarCodTN = P009I2_A1923BarCodTN[0] ;
         A365DisDes = P009I2_A365DisDes[0] ;
         A5058BarEnvLaw = P009I2_A5058BarEnvLaw[0] ;
         A3594BarPriTin = P009I2_A3594BarPriTin[0] ;
         A4837BarAudSupN = P009I2_A4837BarAudSupN[0] ;
         n4837BarAudSupN = P009I2_n4837BarAudSupN[0] ;
         A4835BarAudOpeN = P009I2_A4835BarAudOpeN[0] ;
         n4835BarAudOpeN = P009I2_n4835BarAudOpeN[0] ;
         A4833BarAudTur = P009I2_A4833BarAudTur[0] ;
         n4833BarAudTur = P009I2_n4833BarAudTur[0] ;
         A9790BarItem6 = P009I2_A9790BarItem6[0] ;
         A9789BarItem5 = P009I2_A9789BarItem5[0] ;
         A9778BarItem4 = P009I2_A9778BarItem4[0] ;
         A9777BarItem3 = P009I2_A9777BarItem3[0] ;
         A9776barItem2 = P009I2_A9776barItem2[0] ;
         A9775BarItem1 = P009I2_A9775BarItem1[0] ;
         A6434BarAsi = P009I2_A6434BarAsi[0] ;
         A5352BarObsAnc = P009I2_A5352BarObsAnc[0] ;
         A5351BarObsGrm = P009I2_A5351BarObsGrm[0] ;
         A5291BarTipCor = P009I2_A5291BarTipCor[0] ;
         A5253BarAcc = P009I2_A5253BarAcc[0] ;
         A5053BarBp12 = P009I2_A5053BarBp12[0] ;
         n5053BarBp12 = P009I2_n5053BarBp12[0] ;
         A5034BarEstTip = P009I2_A5034BarEstTip[0] ;
         A5033BarCom = P009I2_A5033BarCom[0] ;
         A5027BarGraCob = P009I2_A5027BarGraCob[0] ;
         A5026BarTipEst = P009I2_A5026BarTipEst[0] ;
         A4937BarCtrPdas = P009I2_A4937BarCtrPdas[0] ;
         n4937BarCtrPdas = P009I2_n4937BarCtrPdas[0] ;
         A4716BarDishCod = P009I2_A4716BarDishCod[0] ;
         A4609BarMdlCod = P009I2_A4609BarMdlCod[0] ;
         A4018BarBot = P009I2_A4018BarBot[0] ;
         A3744BarPeg = P009I2_A3744BarPeg[0] ;
         A3595BarMacCod = P009I2_A3595BarMacCod[0] ;
         A3312BarManCod2 = P009I2_A3312BarManCod2[0] ;
         A3311BarManCod1 = P009I2_A3311BarManCod1[0] ;
         A3310BarFac = P009I2_A3310BarFac[0] ;
         A2830BarIntPer = P009I2_A2830BarIntPer[0] ;
         A2826BarNumLot = P009I2_A2826BarNumLot[0] ;
         A2752BarNumTex1 = P009I2_A2752BarNumTex1[0] ;
         A2400BarManCod = P009I2_A2400BarManCod[0] ;
         A1499BarNMez = P009I2_A1499BarNMez[0] ;
         A1500BarNMtr = P009I2_A1500BarNMtr[0] ;
         A935BarReoPar = P009I2_A935BarReoPar[0] ;
         A936BarReoReo = P009I2_A936BarReoReo[0] ;
         A934BarReoCod = P009I2_A934BarReoCod[0] ;
         A899TipDefPor = P009I2_A899TipDefPor[0] ;
         n899TipDefPor = P009I2_n899TipDefPor[0] ;
         A833TipDefCod = P009I2_A833TipDefCod[0] ;
         n833TipDefCod = P009I2_n833TipDefCod[0] ;
         A178BarLis = P009I2_A178BarLis[0] ;
         A169BarKgsFac = P009I2_A169BarKgsFac[0] ;
         A140BarCosAny = P009I2_A140BarCosAny[0] ;
         A141BarCosPro = P009I2_A141BarCosPro[0] ;
         A189BarNumAny = P009I2_A189BarNumAny[0] ;
         A137BarConPar = P009I2_A137BarConPar[0] ;
         A138BarConReo = P009I2_A138BarConReo[0] ;
         A213BarSit = P009I2_A213BarSit[0] ;
         A146BarEst = P009I2_A146BarEst[0] ;
         A118BarAcaQui = P009I2_A118BarAcaQui[0] ;
         A193BarOpeEsp = P009I2_A193BarOpeEsp[0] ;
         A148BarEstReo = P009I2_A148BarEstReo[0] ;
         A159BarFecGen = P009I2_A159BarFecGen[0] ;
         A361DisCod = P009I2_A361DisCod[0] ;
         A180BarMaqCod = P009I2_A180BarMaqCod[0] ;
         A120BarAgrEst = P009I2_A120BarAgrEst[0] ;
         A130BarCodPar = P009I2_A130BarCodPar[0] ;
         A132BarCodReo = P009I2_A132BarCodReo[0] ;
         A129BarCod = P009I2_A129BarCod[0] ;
         A252CliCod = P009I2_A252CliCod[0] ;
         n252CliCod = P009I2_n252CliCod[0] ;
         A14330BarPriorid = P009I2_A14330BarPriorid[0] ;
         A14329BarCnoEncO = P009I2_A14329BarCnoEncO[0] ;
         A13908BarIdtx2 = P009I2_A13908BarIdtx2[0] ;
         n13908BarIdtx2 = P009I2_n13908BarIdtx2[0] ;
         A13907BarSerDsc2 = P009I2_A13907BarSerDsc2[0] ;
         n13907BarSerDsc2 = P009I2_n13907BarSerDsc2[0] ;
         A13769BarRdto4 = P009I2_A13769BarRdto4[0] ;
         n13769BarRdto4 = P009I2_n13769BarRdto4[0] ;
         A13234BarRGB = P009I2_A13234BarRGB[0] ;
         A13092BarDGUltLi = P009I2_A13092BarDGUltLi[0] ;
         n13092BarDGUltLi = P009I2_n13092BarDGUltLi[0] ;
         A13077BarLinPrd = P009I2_A13077BarLinPrd[0] ;
         A13071BarCanalID = P009I2_A13071BarCanalID[0] ;
         A13070BarLineaID = P009I2_A13070BarLineaID[0] ;
         A12881BarOEKOTEX = P009I2_A12881BarOEKOTEX[0] ;
         n12881BarOEKOTEX = P009I2_n12881BarOEKOTEX[0] ;
         A12811BarLocCol = P009I2_A12811BarLocCol[0] ;
         A12810BarLocMol = P009I2_A12810BarLocMol[0] ;
         A12809BarLocTel = P009I2_A12809BarLocTel[0] ;
         A12774BarProdID = P009I2_A12774BarProdID[0] ;
         A12767BarTpEstam = P009I2_A12767BarTpEstam[0] ;
         A12329SubRevID = P009I2_A12329SubRevID[0] ;
         n12329SubRevID = P009I2_n12329SubRevID[0] ;
         A11857Nxt_desaID = P009I2_A11857Nxt_desaID[0] ;
         n11857Nxt_desaID = P009I2_n11857Nxt_desaID[0] ;
         A11855Nxt_dpoID = P009I2_A11855Nxt_dpoID[0] ;
         n11855Nxt_dpoID = P009I2_n11855Nxt_dpoID[0] ;
         A11853Nxt_cpeID = P009I2_A11853Nxt_cpeID[0] ;
         n11853Nxt_cpeID = P009I2_n11853Nxt_cpeID[0] ;
         A11852Nxt_ArtCl2 = P009I2_A11852Nxt_ArtCl2[0] ;
         A11851Nxt_Sta2 = P009I2_A11851Nxt_Sta2[0] ;
         A11850Nxt_Mdlo2 = P009I2_A11850Nxt_Mdlo2[0] ;
         A3736BarPieMtl = P009I2_A3736BarPieMtl[0] ;
         A3735BarPieKgl = P009I2_A3735BarPieKgl[0] ;
         A3363BarPiePrv = P009I2_A3363BarPiePrv[0] ;
         A3362BarMtsPrv = P009I2_A3362BarMtsPrv[0] ;
         A3361BarKgsPrv = P009I2_A3361BarKgsPrv[0] ;
         A3786BarEnvBar = P009I2_A3786BarEnvBar[0] ;
         A3785BarUltAny = P009I2_A3785BarUltAny[0] ;
         A3784BarAnyTie = P009I2_A3784BarAnyTie[0] ;
         A3783BarRecLis = P009I2_A3783BarRecLis[0] ;
         A3780BarKilLam = P009I2_A3780BarKilLam[0] ;
         A3597BarVolAma = P009I2_A3597BarVolAma[0] ;
         A3596BarMaqAma = P009I2_A3596BarMaqAma[0] ;
         A11662BarOrdComp = P009I2_A11662BarOrdComp[0] ;
         A4844BarAudULin = P009I2_A4844BarAudULin[0] ;
         n4844BarAudULin = P009I2_n4844BarAudULin[0] ;
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
         if ( AV59FlagInt == 1 )
         {
            AV60BarIntPer = A2830BarIntPer ;
         }
         AV64Baracc = A5253BarAcc ;
         AV75Baritem1 = A9775BarItem1 ;
         AV86Baritem2 = A9776barItem2 ;
         AV87Baritem3 = A9777BarItem3 ;
         AV88Baritem4 = A9778BarItem4 ;
         AV89Baritem5 = A9789BarItem5 ;
         AV90Baritem6 = A9790BarItem6 ;
         AV83BarMaccod = A3595BarMacCod ;
         /*
            INSERT RECORD ON TABLE TXPBARCAD

         */
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
         W4835BarAudOpeN = A4835BarAudOpeN ;
         n4835BarAudOpeN = false ;
         W120BarAgrEst = A120BarAgrEst ;
         W4835BarAudOpeN = A4835BarAudOpeN ;
         n4835BarAudOpeN = false ;
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
         W5034BarEstTip = A5034BarEstTip ;
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
         if ( AV42JBP == 1 )
         {
            A4835BarAudOpeN = AV44UsurCod ;
            n4835BarAudOpeN = false ;
            A120BarAgrEst = httpContext.getMessage( "N", "") ;
         }
         if ( AV63Induyco == 1 )
         {
            A4835BarAudOpeN = AV44UsurCod ;
            n4835BarAudOpeN = false ;
         }
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
            A5034BarEstTip = "*" ;
            A5053BarBp12 = (short)(0) ;
            n5053BarBp12 = false ;
         }
         A9775BarItem1 = AV75Baritem1 ;
         A9776barItem2 = AV86Baritem2 ;
         A9777BarItem3 = AV87Baritem3 ;
         A9778BarItem4 = AV88Baritem4 ;
         A9789BarItem5 = AV89Baritem5 ;
         A9790BarItem6 = AV90Baritem6 ;
         if ( AV76CtrlUsu == 1 )
         {
            AV77Fecha_a = localUtil.dtoc( Gx_date, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            A4835BarAudOpeN = AV44UsurCod + " " + AV77Fecha_a + " " + Gx_time ;
            n4835BarAudOpeN = false ;
            A4837BarAudSupN = " " ;
            n4837BarAudSupN = false ;
         }
         A3594BarPriTin = (byte)(((AV82Tintutex==0) ? 80 : 99)) ;
         A3595BarMacCod = ((AV84carvitin==1) ? AV83BarMaccod : 0) ;
         A2826BarNumLot = ((AV84carvitin==1) ? AV85Barnumlot : 0) ;
         /* Using cursor P009I3 */
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
         A4835BarAudOpeN = W4835BarAudOpeN ;
         n4835BarAudOpeN = false ;
         A120BarAgrEst = W120BarAgrEst ;
         A4835BarAudOpeN = W4835BarAudOpeN ;
         n4835BarAudOpeN = false ;
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
         A5034BarEstTip = W5034BarEstTip ;
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
         A2826BarNumLot = W2826BarNumLot ;
         /* End Insert */
         if ( ( AV58F_carvema == 1 ) || ( AV81WorkNotas == 1 ) )
         {
            /* Using cursor P009I4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCodOri), Byte.valueOf(AV19BarReoOri), AV20BarParOri});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A130BarCodPar = P009I4_A130BarCodPar[0] ;
               A132BarCodReo = P009I4_A132BarCodReo[0] ;
               A129BarCod = P009I4_A129BarCod[0] ;
               A187BarNotDsc = P009I4_A187BarNotDsc[0] ;
               A188BarNotLin = P009I4_A188BarNotLin[0] ;
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
               /* Using cursor P009I5 */
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
         }
         if ( AV80Bros == 1 )
         {
            /* Using cursor P009I6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCodOri), Byte.valueOf(AV19BarReoOri), AV20BarParOri});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A11108Nof_Pp = P009I6_A11108Nof_Pp[0] ;
               n11108Nof_Pp = P009I6_n11108Nof_Pp[0] ;
               A11107Nof_Mcot = P009I6_A11107Nof_Mcot[0] ;
               n11107Nof_Mcot = P009I6_n11107Nof_Mcot[0] ;
               A11106Nof_Pd = P009I6_A11106Nof_Pd[0] ;
               n11106Nof_Pd = P009I6_n11106Nof_Pd[0] ;
               A11105Nof_p = P009I6_A11105Nof_p[0] ;
               A11104Nof_r = P009I6_A11104Nof_r[0] ;
               A11103Nof_Hdr = P009I6_A11103Nof_Hdr[0] ;
               A11710Nof_enc = P009I6_A11710Nof_enc[0] ;
               n11710Nof_enc = P009I6_n11710Nof_enc[0] ;
               A11709Nof_nc = P009I6_A11709Nof_nc[0] ;
               n11709Nof_nc = P009I6_n11709Nof_nc[0] ;
               A11428Nof_obs11 = P009I6_A11428Nof_obs11[0] ;
               n11428Nof_obs11 = P009I6_n11428Nof_obs11[0] ;
               A11427Nof_obs10 = P009I6_A11427Nof_obs10[0] ;
               n11427Nof_obs10 = P009I6_n11427Nof_obs10[0] ;
               A11426Nof_obs9 = P009I6_A11426Nof_obs9[0] ;
               n11426Nof_obs9 = P009I6_n11426Nof_obs9[0] ;
               A11425Nof_obs8 = P009I6_A11425Nof_obs8[0] ;
               n11425Nof_obs8 = P009I6_n11425Nof_obs8[0] ;
               A11424Nof_obs7 = P009I6_A11424Nof_obs7[0] ;
               n11424Nof_obs7 = P009I6_n11424Nof_obs7[0] ;
               A11423Nof_obs6 = P009I6_A11423Nof_obs6[0] ;
               n11423Nof_obs6 = P009I6_n11423Nof_obs6[0] ;
               A11422Nof_obs5 = P009I6_A11422Nof_obs5[0] ;
               n11422Nof_obs5 = P009I6_n11422Nof_obs5[0] ;
               A11421Nof_obs4 = P009I6_A11421Nof_obs4[0] ;
               n11421Nof_obs4 = P009I6_n11421Nof_obs4[0] ;
               A11420Nof_obs3 = P009I6_A11420Nof_obs3[0] ;
               n11420Nof_obs3 = P009I6_n11420Nof_obs3[0] ;
               A11419Nof_obs2 = P009I6_A11419Nof_obs2[0] ;
               n11419Nof_obs2 = P009I6_n11419Nof_obs2[0] ;
               A11418Nof_obs1 = P009I6_A11418Nof_obs1[0] ;
               n11418Nof_obs1 = P009I6_n11418Nof_obs1[0] ;
               A11406Nof_oekote = P009I6_A11406Nof_oekote[0] ;
               n11406Nof_oekote = P009I6_n11406Nof_oekote[0] ;
               A11405Nof_humeda = P009I6_A11405Nof_humeda[0] ;
               n11405Nof_humeda = P009I6_n11405Nof_humeda[0] ;
               A11404Nof_termom = P009I6_A11404Nof_termom[0] ;
               n11404Nof_termom = P009I6_n11404Nof_termom[0] ;
               A11403Nof_aguam = P009I6_A11403Nof_aguam[0] ;
               n11403Nof_aguam = P009I6_n11403Nof_aguam[0] ;
               A11402Nof_cloro = P009I6_A11402Nof_cloro[0] ;
               n11402Nof_cloro = P009I6_n11402Nof_cloro[0] ;
               A11401Nof_sudor = P009I6_A11401Nof_sudor[0] ;
               n11401Nof_sudor = P009I6_n11401Nof_sudor[0] ;
               A11400Nof_luz = P009I6_A11400Nof_luz[0] ;
               n11400Nof_luz = P009I6_n11400Nof_luz[0] ;
               A11399Nof_lavado = P009I6_A11399Nof_lavado[0] ;
               n11399Nof_lavado = P009I6_n11399Nof_lavado[0] ;
               A11398Nof_imp11 = P009I6_A11398Nof_imp11[0] ;
               n11398Nof_imp11 = P009I6_n11398Nof_imp11[0] ;
               A11397Nof_imp10 = P009I6_A11397Nof_imp10[0] ;
               n11397Nof_imp10 = P009I6_n11397Nof_imp10[0] ;
               A11396Nof_imp9 = P009I6_A11396Nof_imp9[0] ;
               n11396Nof_imp9 = P009I6_n11396Nof_imp9[0] ;
               A11395Nof_imp8 = P009I6_A11395Nof_imp8[0] ;
               n11395Nof_imp8 = P009I6_n11395Nof_imp8[0] ;
               A11394Nof_imp7 = P009I6_A11394Nof_imp7[0] ;
               n11394Nof_imp7 = P009I6_n11394Nof_imp7[0] ;
               A11393Nof_imp6 = P009I6_A11393Nof_imp6[0] ;
               n11393Nof_imp6 = P009I6_n11393Nof_imp6[0] ;
               A11392Nof_imp5 = P009I6_A11392Nof_imp5[0] ;
               n11392Nof_imp5 = P009I6_n11392Nof_imp5[0] ;
               A11391Nof_imp4 = P009I6_A11391Nof_imp4[0] ;
               n11391Nof_imp4 = P009I6_n11391Nof_imp4[0] ;
               A11390Nof_imp3 = P009I6_A11390Nof_imp3[0] ;
               n11390Nof_imp3 = P009I6_n11390Nof_imp3[0] ;
               A11389Nof_imp2 = P009I6_A11389Nof_imp2[0] ;
               n11389Nof_imp2 = P009I6_n11389Nof_imp2[0] ;
               A11388Nof_imp1 = P009I6_A11388Nof_imp1[0] ;
               n11388Nof_imp1 = P009I6_n11388Nof_imp1[0] ;
               A11171Nof_c12 = P009I6_A11171Nof_c12[0] ;
               n11171Nof_c12 = P009I6_n11171Nof_c12[0] ;
               A11170Nof_c11 = P009I6_A11170Nof_c11[0] ;
               n11170Nof_c11 = P009I6_n11170Nof_c11[0] ;
               A11169Nof_Lbtp = P009I6_A11169Nof_Lbtp[0] ;
               n11169Nof_Lbtp = P009I6_n11169Nof_Lbtp[0] ;
               A11168Nof_Lbta = P009I6_A11168Nof_Lbta[0] ;
               n11168Nof_Lbta = P009I6_n11168Nof_Lbta[0] ;
               A11167Nof_stk = P009I6_A11167Nof_stk[0] ;
               n11167Nof_stk = P009I6_n11167Nof_stk[0] ;
               A11166Nof_c10 = P009I6_A11166Nof_c10[0] ;
               n11166Nof_c10 = P009I6_n11166Nof_c10[0] ;
               A11165Nof_sa6 = P009I6_A11165Nof_sa6[0] ;
               n11165Nof_sa6 = P009I6_n11165Nof_sa6[0] ;
               A11164Nof_sa5 = P009I6_A11164Nof_sa5[0] ;
               n11164Nof_sa5 = P009I6_n11164Nof_sa5[0] ;
               A11163Nof_sa4 = P009I6_A11163Nof_sa4[0] ;
               n11163Nof_sa4 = P009I6_n11163Nof_sa4[0] ;
               A11162Nof_sa3 = P009I6_A11162Nof_sa3[0] ;
               n11162Nof_sa3 = P009I6_n11162Nof_sa3[0] ;
               A11161Nof_sa2 = P009I6_A11161Nof_sa2[0] ;
               n11161Nof_sa2 = P009I6_n11161Nof_sa2[0] ;
               A11160Nof_sa1 = P009I6_A11160Nof_sa1[0] ;
               n11160Nof_sa1 = P009I6_n11160Nof_sa1[0] ;
               A11159Nof_c9 = P009I6_A11159Nof_c9[0] ;
               n11159Nof_c9 = P009I6_n11159Nof_c9[0] ;
               A11158Nof_ep10 = P009I6_A11158Nof_ep10[0] ;
               n11158Nof_ep10 = P009I6_n11158Nof_ep10[0] ;
               A11157Nof_ep9 = P009I6_A11157Nof_ep9[0] ;
               n11157Nof_ep9 = P009I6_n11157Nof_ep9[0] ;
               A11156Nof_ep8 = P009I6_A11156Nof_ep8[0] ;
               n11156Nof_ep8 = P009I6_n11156Nof_ep8[0] ;
               A11155Nof_ep7 = P009I6_A11155Nof_ep7[0] ;
               n11155Nof_ep7 = P009I6_n11155Nof_ep7[0] ;
               A11154Nof_ep6 = P009I6_A11154Nof_ep6[0] ;
               n11154Nof_ep6 = P009I6_n11154Nof_ep6[0] ;
               A11153Nof_ep5 = P009I6_A11153Nof_ep5[0] ;
               n11153Nof_ep5 = P009I6_n11153Nof_ep5[0] ;
               A11152Nof_ep4 = P009I6_A11152Nof_ep4[0] ;
               n11152Nof_ep4 = P009I6_n11152Nof_ep4[0] ;
               A11151Nof_ep3 = P009I6_A11151Nof_ep3[0] ;
               n11151Nof_ep3 = P009I6_n11151Nof_ep3[0] ;
               A11150Nof_ep2 = P009I6_A11150Nof_ep2[0] ;
               n11150Nof_ep2 = P009I6_n11150Nof_ep2[0] ;
               A11149Nof_ep1 = P009I6_A11149Nof_ep1[0] ;
               n11149Nof_ep1 = P009I6_n11149Nof_ep1[0] ;
               A11148Nof_c8 = P009I6_A11148Nof_c8[0] ;
               n11148Nof_c8 = P009I6_n11148Nof_c8[0] ;
               A11147Nof_rb3 = P009I6_A11147Nof_rb3[0] ;
               n11147Nof_rb3 = P009I6_n11147Nof_rb3[0] ;
               A11146Nof_rb1 = P009I6_A11146Nof_rb1[0] ;
               n11146Nof_rb1 = P009I6_n11146Nof_rb1[0] ;
               A11145Nof_rboc = P009I6_A11145Nof_rboc[0] ;
               n11145Nof_rboc = P009I6_n11145Nof_rboc[0] ;
               A11144Nof_rbp = P009I6_A11144Nof_rbp[0] ;
               n11144Nof_rbp = P009I6_n11144Nof_rbp[0] ;
               A11143Nof_rbe = P009I6_A11143Nof_rbe[0] ;
               n11143Nof_rbe = P009I6_n11143Nof_rbe[0] ;
               A11142Nof_rbi = P009I6_A11142Nof_rbi[0] ;
               n11142Nof_rbi = P009I6_n11142Nof_rbi[0] ;
               A11141Nof_rb = P009I6_A11141Nof_rb[0] ;
               n11141Nof_rb = P009I6_n11141Nof_rb[0] ;
               A11140Nof_c7 = P009I6_A11140Nof_c7[0] ;
               n11140Nof_c7 = P009I6_n11140Nof_c7[0] ;
               A11139Nof_ccmc6 = P009I6_A11139Nof_ccmc6[0] ;
               n11139Nof_ccmc6 = P009I6_n11139Nof_ccmc6[0] ;
               A11138Nof_ccmc5 = P009I6_A11138Nof_ccmc5[0] ;
               n11138Nof_ccmc5 = P009I6_n11138Nof_ccmc5[0] ;
               A11137Nof_ccmc4 = P009I6_A11137Nof_ccmc4[0] ;
               n11137Nof_ccmc4 = P009I6_n11137Nof_ccmc4[0] ;
               A11136Nof_ccmc3 = P009I6_A11136Nof_ccmc3[0] ;
               n11136Nof_ccmc3 = P009I6_n11136Nof_ccmc3[0] ;
               A11135Nof_ccmc2 = P009I6_A11135Nof_ccmc2[0] ;
               n11135Nof_ccmc2 = P009I6_n11135Nof_ccmc2[0] ;
               A11134Nof_ccmc1 = P009I6_A11134Nof_ccmc1[0] ;
               n11134Nof_ccmc1 = P009I6_n11134Nof_ccmc1[0] ;
               A11133Nof_ccec = P009I6_A11133Nof_ccec[0] ;
               n11133Nof_ccec = P009I6_n11133Nof_ccec[0] ;
               A11132Nof_cccc = P009I6_A11132Nof_cccc[0] ;
               n11132Nof_cccc = P009I6_n11132Nof_cccc[0] ;
               A11131Nof_cctq = P009I6_A11131Nof_cctq[0] ;
               n11131Nof_cctq = P009I6_n11131Nof_cctq[0] ;
               A11130Nof_ccpc = P009I6_A11130Nof_ccpc[0] ;
               n11130Nof_ccpc = P009I6_n11130Nof_ccpc[0] ;
               A11129Nof_cct = P009I6_A11129Nof_cct[0] ;
               n11129Nof_cct = P009I6_n11129Nof_cct[0] ;
               A11128Nof_ccp = P009I6_A11128Nof_ccp[0] ;
               n11128Nof_ccp = P009I6_n11128Nof_ccp[0] ;
               A11127Nof_cctet = P009I6_A11127Nof_cctet[0] ;
               n11127Nof_cctet = P009I6_n11127Nof_cctet[0] ;
               A11126Nof_ccttp = P009I6_A11126Nof_ccttp[0] ;
               n11126Nof_ccttp = P009I6_n11126Nof_ccttp[0] ;
               A11125Nof_cctse = P009I6_A11125Nof_cctse[0] ;
               n11125Nof_cctse = P009I6_n11125Nof_cctse[0] ;
               A11124Nof_c6 = P009I6_A11124Nof_c6[0] ;
               n11124Nof_c6 = P009I6_n11124Nof_c6[0] ;
               A11123Nof_scc = P009I6_A11123Nof_scc[0] ;
               n11123Nof_scc = P009I6_n11123Nof_scc[0] ;
               A11122Nof_scs = P009I6_A11122Nof_scs[0] ;
               n11122Nof_scs = P009I6_n11122Nof_scs[0] ;
               A11121Nof_c5 = P009I6_A11121Nof_c5[0] ;
               n11121Nof_c5 = P009I6_n11121Nof_c5[0] ;
               A11120Nof_ct = P009I6_A11120Nof_ct[0] ;
               n11120Nof_ct = P009I6_n11120Nof_ct[0] ;
               A11119Nof_c4 = P009I6_A11119Nof_c4[0] ;
               n11119Nof_c4 = P009I6_n11119Nof_c4[0] ;
               A11118Nof_tnc = P009I6_A11118Nof_tnc[0] ;
               n11118Nof_tnc = P009I6_n11118Nof_tnc[0] ;
               A11117Nof_tns = P009I6_A11117Nof_tns[0] ;
               n11117Nof_tns = P009I6_n11117Nof_tns[0] ;
               A11116Nof_c3 = P009I6_A11116Nof_c3[0] ;
               n11116Nof_c3 = P009I6_n11116Nof_c3[0] ;
               A11115Nof_Bov = P009I6_A11115Nof_Bov[0] ;
               n11115Nof_Bov = P009I6_n11115Nof_Bov[0] ;
               A11114Nof_boe = P009I6_A11114Nof_boe[0] ;
               n11114Nof_boe = P009I6_n11114Nof_boe[0] ;
               A11113Nof_bob = P009I6_A11113Nof_bob[0] ;
               n11113Nof_bob = P009I6_n11113Nof_bob[0] ;
               A11112Nof_bo = P009I6_A11112Nof_bo[0] ;
               n11112Nof_bo = P009I6_n11112Nof_bo[0] ;
               A11111Nof_c2 = P009I6_A11111Nof_c2[0] ;
               n11111Nof_c2 = P009I6_n11111Nof_c2[0] ;
               A11110Nof_c1 = P009I6_A11110Nof_c1[0] ;
               n11110Nof_c1 = P009I6_n11110Nof_c1[0] ;
               A840TrnCod = P009I6_A840TrnCod[0] ;
               n840TrnCod = P009I6_n840TrnCod[0] ;
               A11109Nof_Ag = P009I6_A11109Nof_Ag[0] ;
               n11109Nof_Ag = P009I6_n11109Nof_Ag[0] ;
               W396EmprCod = A396EmprCod ;
               W11103Nof_Hdr = A11103Nof_Hdr ;
               W11104Nof_r = A11104Nof_r ;
               W11105Nof_p = A11105Nof_p ;
               /*
                  INSERT RECORD ON TABLE TXPNOFART

               */
               W396EmprCod = A396EmprCod ;
               W11103Nof_Hdr = A11103Nof_Hdr ;
               W11104Nof_r = A11104Nof_r ;
               W11105Nof_p = A11105Nof_p ;
               A11103Nof_Hdr = AV15BarCod ;
               A11104Nof_r = AV16BarConReo ;
               A11105Nof_p = AV17BarParPan ;
               /* Using cursor P009I7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A11103Nof_Hdr), Byte.valueOf(A11104Nof_r), A11105Nof_p, Boolean.valueOf(n11106Nof_Pd), A11106Nof_Pd, Boolean.valueOf(n11107Nof_Mcot), A11107Nof_Mcot, Boolean.valueOf(n11108Nof_Pp), A11108Nof_Pp, Boolean.valueOf(n11109Nof_Ag), A11109Nof_Ag, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n11110Nof_c1), A11110Nof_c1, Boolean.valueOf(n11111Nof_c2), A11111Nof_c2, Boolean.valueOf(n11112Nof_bo), A11112Nof_bo, Boolean.valueOf(n11113Nof_bob), A11113Nof_bob, Boolean.valueOf(n11114Nof_boe), A11114Nof_boe, Boolean.valueOf(n11115Nof_Bov), A11115Nof_Bov, Boolean.valueOf(n11116Nof_c3), A11116Nof_c3, Boolean.valueOf(n11117Nof_tns), A11117Nof_tns, Boolean.valueOf(n11118Nof_tnc), A11118Nof_tnc, Boolean.valueOf(n11119Nof_c4), A11119Nof_c4, Boolean.valueOf(n11120Nof_ct), A11120Nof_ct, Boolean.valueOf(n11121Nof_c5), A11121Nof_c5, Boolean.valueOf(n11122Nof_scs), A11122Nof_scs, Boolean.valueOf(n11123Nof_scc), A11123Nof_scc, Boolean.valueOf(n11124Nof_c6), A11124Nof_c6, Boolean.valueOf(n11125Nof_cctse), A11125Nof_cctse, Boolean.valueOf(n11126Nof_ccttp), A11126Nof_ccttp, Boolean.valueOf(n11127Nof_cctet), A11127Nof_cctet, Boolean.valueOf(n11128Nof_ccp), Byte.valueOf(A11128Nof_ccp), Boolean.valueOf(n11129Nof_cct), Byte.valueOf(A11129Nof_cct), Boolean.valueOf(n11130Nof_ccpc), A11130Nof_ccpc, Boolean.valueOf(n11131Nof_cctq), A11131Nof_cctq, Boolean.valueOf(n11132Nof_cccc), A11132Nof_cccc, Boolean.valueOf(n11133Nof_ccec), A11133Nof_ccec, Boolean.valueOf(n11134Nof_ccmc1), A11134Nof_ccmc1, Boolean.valueOf(n11135Nof_ccmc2), A11135Nof_ccmc2, Boolean.valueOf(n11136Nof_ccmc3), A11136Nof_ccmc3, Boolean.valueOf(n11137Nof_ccmc4), A11137Nof_ccmc4, Boolean.valueOf(n11138Nof_ccmc5), A11138Nof_ccmc5, Boolean.valueOf(n11139Nof_ccmc6), A11139Nof_ccmc6, Boolean.valueOf(n11140Nof_c7), A11140Nof_c7, Boolean.valueOf(n11141Nof_rb), A11141Nof_rb, Boolean.valueOf(n11142Nof_rbi), A11142Nof_rbi, Boolean.valueOf(n11143Nof_rbe), A11143Nof_rbe, Boolean.valueOf(n11144Nof_rbp), A11144Nof_rbp, Boolean.valueOf(n11145Nof_rboc), Short.valueOf(A11145Nof_rboc), Boolean.valueOf(n11146Nof_rb1), A11146Nof_rb1, Boolean.valueOf(n11147Nof_rb3), A11147Nof_rb3, Boolean.valueOf(n11148Nof_c8), A11148Nof_c8, Boolean.valueOf(n11149Nof_ep1), A11149Nof_ep1, Boolean.valueOf(n11150Nof_ep2), A11150Nof_ep2, Boolean.valueOf(n11151Nof_ep3), A11151Nof_ep3, Boolean.valueOf(n11152Nof_ep4), A11152Nof_ep4, Boolean.valueOf(n11153Nof_ep5), A11153Nof_ep5, Boolean.valueOf(n11154Nof_ep6), A11154Nof_ep6, Boolean.valueOf(n11155Nof_ep7), A11155Nof_ep7, Boolean.valueOf(n11156Nof_ep8), A11156Nof_ep8, Boolean.valueOf(n11157Nof_ep9), A11157Nof_ep9, Boolean.valueOf(n11158Nof_ep10), A11158Nof_ep10, Boolean.valueOf(n11159Nof_c9), A11159Nof_c9, Boolean.valueOf(n11160Nof_sa1), A11160Nof_sa1, Boolean.valueOf(n11161Nof_sa2), A11161Nof_sa2, Boolean.valueOf(n11162Nof_sa3), A11162Nof_sa3, Boolean.valueOf(n11163Nof_sa4), A11163Nof_sa4,
               Boolean.valueOf(n11164Nof_sa5), A11164Nof_sa5, Boolean.valueOf(n11165Nof_sa6), A11165Nof_sa6, Boolean.valueOf(n11166Nof_c10), A11166Nof_c10, Boolean.valueOf(n11167Nof_stk), A11167Nof_stk, Boolean.valueOf(n11168Nof_Lbta), A11168Nof_Lbta, Boolean.valueOf(n11169Nof_Lbtp), Short.valueOf(A11169Nof_Lbtp), Boolean.valueOf(n11170Nof_c11), A11170Nof_c11, Boolean.valueOf(n11171Nof_c12), A11171Nof_c12, Boolean.valueOf(n11388Nof_imp1), A11388Nof_imp1, Boolean.valueOf(n11389Nof_imp2), A11389Nof_imp2, Boolean.valueOf(n11390Nof_imp3), A11390Nof_imp3, Boolean.valueOf(n11391Nof_imp4), A11391Nof_imp4, Boolean.valueOf(n11392Nof_imp5), A11392Nof_imp5, Boolean.valueOf(n11393Nof_imp6), A11393Nof_imp6, Boolean.valueOf(n11394Nof_imp7), A11394Nof_imp7, Boolean.valueOf(n11395Nof_imp8), A11395Nof_imp8, Boolean.valueOf(n11396Nof_imp9), A11396Nof_imp9, Boolean.valueOf(n11397Nof_imp10), A11397Nof_imp10, Boolean.valueOf(n11398Nof_imp11), A11398Nof_imp11, Boolean.valueOf(n11399Nof_lavado), A11399Nof_lavado, Boolean.valueOf(n11400Nof_luz), A11400Nof_luz, Boolean.valueOf(n11401Nof_sudor), A11401Nof_sudor, Boolean.valueOf(n11402Nof_cloro), A11402Nof_cloro, Boolean.valueOf(n11403Nof_aguam), A11403Nof_aguam, Boolean.valueOf(n11404Nof_termom), A11404Nof_termom, Boolean.valueOf(n11405Nof_humeda), A11405Nof_humeda, Boolean.valueOf(n11406Nof_oekote), A11406Nof_oekote, Boolean.valueOf(n11418Nof_obs1), A11418Nof_obs1, Boolean.valueOf(n11419Nof_obs2), A11419Nof_obs2, Boolean.valueOf(n11420Nof_obs3), A11420Nof_obs3, Boolean.valueOf(n11421Nof_obs4), A11421Nof_obs4, Boolean.valueOf(n11422Nof_obs5), A11422Nof_obs5, Boolean.valueOf(n11423Nof_obs6), A11423Nof_obs6, Boolean.valueOf(n11424Nof_obs7), A11424Nof_obs7, Boolean.valueOf(n11425Nof_obs8), A11425Nof_obs8, Boolean.valueOf(n11426Nof_obs9), A11426Nof_obs9, Boolean.valueOf(n11427Nof_obs10), A11427Nof_obs10, Boolean.valueOf(n11428Nof_obs11), A11428Nof_obs11, Boolean.valueOf(n11709Nof_nc), Byte.valueOf(A11709Nof_nc), Boolean.valueOf(n11710Nof_enc), A11710Nof_enc});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNOFART");
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
               A396EmprCod = W396EmprCod ;
               A11103Nof_Hdr = W11103Nof_Hdr ;
               A11104Nof_r = W11104Nof_r ;
               A11105Nof_p = W11105Nof_p ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A11103Nof_Hdr = W11103Nof_Hdr ;
               A11104Nof_r = W11104Nof_r ;
               A11105Nof_p = W11105Nof_p ;
               /* Exiting from a For First loop. */
               if (true) break;
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
      this.aP0[0] = pnuebar.this.A396EmprCod;
      this.aP1[0] = pnuebar.this.AV15BarCod;
      this.aP2[0] = pnuebar.this.AV16BarConReo;
      this.aP3[0] = pnuebar.this.AV17BarParPan;
      this.aP4[0] = pnuebar.this.AV18BarCodOri;
      this.aP5[0] = pnuebar.this.AV19BarReoOri;
      this.aP6[0] = pnuebar.this.AV20BarParOri;
      this.aP7[0] = pnuebar.this.AV21DisCod;
      this.aP8[0] = pnuebar.this.AV22Sit2;
      this.aP9[0] = pnuebar.this.AV23BarPieNDes;
      this.aP10[0] = pnuebar.this.AV24CosPro;
      this.aP11[0] = pnuebar.this.AV25CosAny;
      this.aP12[0] = pnuebar.this.AV26BarMaqCod;
      this.aP13[0] = pnuebar.this.AV27BarNumAny;
      this.aP14[0] = pnuebar.this.AV28BarConPar;
      this.aP15[0] = pnuebar.this.AV29DisDes;
      this.aP16[0] = pnuebar.this.AV30TipDefCod;
      this.aP17[0] = pnuebar.this.AV31TipDefPor;
      this.aP18[0] = pnuebar.this.AV32Flag;
      this.aP19[0] = pnuebar.this.AV33BarEstReo;
      this.aP20[0] = pnuebar.this.AV34BarOpeEsp;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnuebar");
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
      P009I2_A1878BarNumTen = new String[] {""} ;
      P009I2_A1832BarLisInd = new byte[1] ;
      P009I2_A1652BarSerDsc = new String[] {""} ;
      P009I2_A1503BarPart = new short[1] ;
      P009I2_A1431BarLocDis = new String[] {""} ;
      P009I2_A1254BarPesBal = new byte[1] ;
      P009I2_A1235BarNumCli = new int[1] ;
      P009I2_A1234BarNomCli = new String[] {""} ;
      P009I2_A1226BarGraCru = new short[1] ;
      P009I2_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A921BarMatiz = new short[1] ;
      P009I2_A1003BarFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_n1003BarFecLan = new boolean[] {false} ;
      P009I2_A905ObsReoULin = new byte[1] ;
      P009I2_n905ObsReoULin = new boolean[] {false} ;
      P009I2_A904ObsReoEnt = new String[] {""} ;
      P009I2_n904ObsReoEnt = new boolean[] {false} ;
      P009I2_A864BarPes = new short[1] ;
      P009I2_A646NotUltLin = new byte[1] ;
      P009I2_n646NotUltLin = new boolean[] {false} ;
      P009I2_A144BarDisOri = new int[1] ;
      P009I2_A190BarNumAso = new byte[1] ;
      P009I2_A149BarEstRes = new byte[1] ;
      P009I2_A147BarEstCol = new byte[1] ;
      P009I2_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_A163BarHorCum = new int[1] ;
      P009I2_A209BarPri = new String[] {""} ;
      P009I2_A145BarEncOri = new String[] {""} ;
      P009I2_A139BarCorOri = new String[] {""} ;
      P009I2_A214BarSua = new String[] {""} ;
      P009I2_A177BarLar = new String[] {""} ;
      P009I2_A206BarPle = new String[] {""} ;
      P009I2_A126BarAncAca2 = new short[1] ;
      P009I2_A125BarAncAca1 = new short[1] ;
      P009I2_A128BarAncCru2 = new short[1] ;
      P009I2_A127BarAncCru1 = new short[1] ;
      P009I2_A234BarUrdP3 = new short[1] ;
      P009I2_A231BarUrd3 = new String[] {""} ;
      P009I2_A233BarUrdP2 = new short[1] ;
      P009I2_A230BarUrd2 = new String[] {""} ;
      P009I2_A232BarUrdP1 = new short[1] ;
      P009I2_A229BarUrd1 = new String[] {""} ;
      P009I2_A226BarTraP3 = new short[1] ;
      P009I2_A223BarTra3 = new String[] {""} ;
      P009I2_A225BarTraP2 = new short[1] ;
      P009I2_A222BarTra2 = new String[] {""} ;
      P009I2_A224BarTraP1 = new short[1] ;
      P009I2_A221BarTra1 = new String[] {""} ;
      P009I2_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A182BarMat = new String[] {""} ;
      P009I2_A142BarDiaP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A235BarUrg = new byte[1] ;
      P009I2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_A181BarMaqPro = new String[] {""} ;
      P009I2_A157BarFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_A196BarOrdReo = new byte[1] ;
      P009I2_A191BarNumPie = new short[1] ;
      P009I2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_A228BarUniMed = new String[] {""} ;
      P009I2_A192BarNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A218BarTipCol = new byte[1] ;
      P009I2_A136BarColNum = new int[1] ;
      P009I2_A135BarColNom = new String[] {""} ;
      P009I2_A217BarTipArt = new short[1] ;
      P009I2_n217BarTipArt = new boolean[] {false} ;
      P009I2_A212BarSer = new String[] {""} ;
      P009I2_A143BarDisNum = new String[] {""} ;
      P009I2_A236BarVolMaq = new int[1] ;
      P009I2_A4841BarAudMCue = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_n4841BarAudMCue = new boolean[] {false} ;
      P009I2_A4840BarAudMDig = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_n4840BarAudMDig = new boolean[] {false} ;
      P009I2_A4838BarAudNPz = new short[1] ;
      P009I2_n4838BarAudNPz = new boolean[] {false} ;
      P009I2_A4834BarAudOpe = new int[1] ;
      P009I2_n4834BarAudOpe = new boolean[] {false} ;
      P009I2_A4832BarAudFec = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_n4832BarAudFec = new boolean[] {false} ;
      P009I2_A8568EntSecUlt = new int[1] ;
      P009I2_n8568EntSecUlt = new boolean[] {false} ;
      P009I2_A8098BarOpeHis = new int[1] ;
      P009I2_A8097BarFecHis = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_A7733BarMaqEst = new String[] {""} ;
      P009I2_A5406BarAntpT = new String[] {""} ;
      P009I2_A5367BarAntp = new String[] {""} ;
      P009I2_A5293BarCodBan = new String[] {""} ;
      P009I2_A5057BarFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_n5057BarFacAbs = new boolean[] {false} ;
      P009I2_A5056BarBp15 = new short[1] ;
      P009I2_n5056BarBp15 = new boolean[] {false} ;
      P009I2_A5055BarBp14 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_n5055BarBp14 = new boolean[] {false} ;
      P009I2_A5054BarBp13 = new short[1] ;
      P009I2_n5054BarBp13 = new boolean[] {false} ;
      P009I2_A5009BarLoteA = new String[] {""} ;
      P009I2_A4975BarNumReo = new short[1] ;
      P009I2_A4908BarMacPro = new String[] {""} ;
      P009I2_A4845BarAudObs = new String[] {""} ;
      P009I2_n4845BarAudObs = new boolean[] {false} ;
      P009I2_A4836BarAudSup = new int[1] ;
      P009I2_A4812BarEncCli = new String[] {""} ;
      P009I2_A4613BarHorReg = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_n4613BarHorReg = new boolean[] {false} ;
      P009I2_A4612BarPzas = new int[1] ;
      P009I2_n4612BarPzas = new boolean[] {false} ;
      P009I2_A4611BarHorEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_n4611BarHorEnt = new boolean[] {false} ;
      P009I2_A4610BarTam = new String[] {""} ;
      P009I2_A4467BarAcaMar = new String[] {""} ;
      P009I2_A4466BarAcaAnh = new short[1] ;
      P009I2_A4465BarAcaBak = new String[] {""} ;
      P009I2_n4465BarAcaBak = new boolean[] {false} ;
      P009I2_A4464BarAcaFor = new int[1] ;
      P009I2_n4464BarAcaFor = new boolean[] {false} ;
      P009I2_A4463BarLotMaq = new String[] {""} ;
      P009I2_n4463BarLotMaq = new boolean[] {false} ;
      P009I2_A4462BarLotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A4461BarLotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A4460BarLotPza = new short[1] ;
      P009I2_n4460BarLotPza = new boolean[] {false} ;
      P009I2_A4459BarCruEnr = new String[] {""} ;
      P009I2_A4458BarCruKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_n4458BarCruKgs = new boolean[] {false} ;
      P009I2_A4457BarCruMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_n4457BarCruMts = new boolean[] {false} ;
      P009I2_A4456BarPelAnh = new short[1] ;
      P009I2_A4400BarSitEst = new byte[1] ;
      P009I2_A4017BarInci = new byte[1] ;
      P009I2_A4016BarTin = new String[] {""} ;
      P009I2_A4015BarEnv = new byte[1] ;
      P009I2_A2512BarComULin = new byte[1] ;
      P009I2_n2512BarComULin = new boolean[] {false} ;
      P009I2_A1799BarDibInt = new int[1] ;
      P009I2_A1798BarDibCli = new String[] {""} ;
      P009I2_A3871BarFecCRe = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_A3870BarFecLRe = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_A3787BarEnvRec = new String[] {""} ;
      P009I2_n3787BarEnvRec = new boolean[] {false} ;
      P009I2_A3746BarNPed = new String[] {""} ;
      P009I2_A3745BarFoa = new String[] {""} ;
      P009I2_A3313BarNumTon = new String[] {""} ;
      P009I2_A3138BarGraCru2 = new short[1] ;
      P009I2_A3137BarGraAca2 = new short[1] ;
      P009I2_A3136BarAncSal3 = new short[1] ;
      P009I2_A3135BarAncSal2 = new short[1] ;
      P009I2_A3134BarAncSal1 = new short[1] ;
      P009I2_A3133BarNumCor = new short[1] ;
      P009I2_A2836BarPle2 = new String[] {""} ;
      P009I2_A3030BarPlf = new String[] {""} ;
      P009I2_A3006BarCoef = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_n3006BarCoef = new boolean[] {false} ;
      P009I2_A2829BarProPer = new String[] {""} ;
      P009I2_A2828BarMtrLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A2827BarKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A2803UltLinMaq = new short[1] ;
      P009I2_n2803UltLinMaq = new boolean[] {false} ;
      P009I2_A2759BarMaqGru = new String[] {""} ;
      P009I2_A2754BarSitExt = new byte[1] ;
      P009I2_A2753BarNumTex2 = new short[1] ;
      P009I2_n2753BarNumTex2 = new boolean[] {false} ;
      P009I2_A2746BarCodTex = new String[] {""} ;
      P009I2_n2746BarCodTex = new boolean[] {false} ;
      P009I2_A2487BarConEle = new int[1] ;
      P009I2_A2488BarConVap = new int[1] ;
      P009I2_A2486BarConAgu = new int[1] ;
      P009I2_A2496BarFecFin = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_A2497BarFecIni = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_A2500BarRDos2 = new String[] {""} ;
      P009I2_A2499BarRDos1 = new String[] {""} ;
      P009I2_A2498BarPrdPes = new String[] {""} ;
      P009I2_A2485BarColPes = new String[] {""} ;
      P009I2_A1911BarRdoA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A1910BarRdoN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A1909BarGraAca = new short[1] ;
      P009I2_A2458BarObsVL = new short[1] ;
      P009I2_n2458BarObsVL = new boolean[] {false} ;
      P009I2_A2453BarEntAca = new String[] {""} ;
      P009I2_n2453BarEntAca = new boolean[] {false} ;
      P009I2_A2452BarCal = new String[] {""} ;
      P009I2_n2452BarCal = new boolean[] {false} ;
      P009I2_A2459BarTemSec = new short[1] ;
      P009I2_A2455BarNMont = new short[1] ;
      P009I2_n2455BarNMont = new boolean[] {false} ;
      P009I2_A2454BarGirar = new String[] {""} ;
      P009I2_A2460BarTipAca = new String[] {""} ;
      P009I2_A2450BarKgEnR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_n2450BarKgEnR = new boolean[] {false} ;
      P009I2_A2443BarBulEnR = new short[1] ;
      P009I2_n2443BarBulEnR = new boolean[] {false} ;
      P009I2_A2448BarFecEnR = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_n2448BarFecEnR = new boolean[] {false} ;
      P009I2_A2446BarEnULin = new short[1] ;
      P009I2_n2446BarEnULin = new boolean[] {false} ;
      P009I2_A2445BarEntEnE = new String[] {""} ;
      P009I2_A2449BarKgEnE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_n2449BarKgEnE = new boolean[] {false} ;
      P009I2_A2442BarBulEnE = new short[1] ;
      P009I2_n2442BarBulEnE = new boolean[] {false} ;
      P009I2_A2447BarFecEnE = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_A2401BarNumPas = new byte[1] ;
      P009I2_n2401BarNumPas = new boolean[] {false} ;
      P009I2_A2311BarCliDes = new int[1] ;
      P009I2_A2265BarExt = new byte[1] ;
      P009I2_n2265BarExt = new boolean[] {false} ;
      P009I2_A2010BarTipDis = new String[] {""} ;
      P009I2_A1923BarCodTN = new int[1] ;
      P009I2_A396EmprCod = new String[] {""} ;
      P009I2_A365DisDes = new String[] {""} ;
      P009I2_A5058BarEnvLaw = new String[] {""} ;
      P009I2_A3594BarPriTin = new byte[1] ;
      P009I2_A4837BarAudSupN = new String[] {""} ;
      P009I2_n4837BarAudSupN = new boolean[] {false} ;
      P009I2_A4835BarAudOpeN = new String[] {""} ;
      P009I2_n4835BarAudOpeN = new boolean[] {false} ;
      P009I2_A4833BarAudTur = new byte[1] ;
      P009I2_n4833BarAudTur = new boolean[] {false} ;
      P009I2_A9790BarItem6 = new String[] {""} ;
      P009I2_A9789BarItem5 = new String[] {""} ;
      P009I2_A9778BarItem4 = new String[] {""} ;
      P009I2_A9777BarItem3 = new String[] {""} ;
      P009I2_A9776barItem2 = new String[] {""} ;
      P009I2_A9775BarItem1 = new String[] {""} ;
      P009I2_A6434BarAsi = new byte[1] ;
      P009I2_A5352BarObsAnc = new String[] {""} ;
      P009I2_A5351BarObsGrm = new String[] {""} ;
      P009I2_A5291BarTipCor = new String[] {""} ;
      P009I2_A5253BarAcc = new String[] {""} ;
      P009I2_A5053BarBp12 = new short[1] ;
      P009I2_n5053BarBp12 = new boolean[] {false} ;
      P009I2_A5034BarEstTip = new String[] {""} ;
      P009I2_A5033BarCom = new String[] {""} ;
      P009I2_A5027BarGraCob = new byte[1] ;
      P009I2_A5026BarTipEst = new byte[1] ;
      P009I2_A4937BarCtrPdas = new byte[1] ;
      P009I2_n4937BarCtrPdas = new boolean[] {false} ;
      P009I2_A4716BarDishCod = new String[] {""} ;
      P009I2_A4609BarMdlCod = new String[] {""} ;
      P009I2_A4018BarBot = new String[] {""} ;
      P009I2_A3744BarPeg = new String[] {""} ;
      P009I2_A3595BarMacCod = new int[1] ;
      P009I2_A3312BarManCod2 = new short[1] ;
      P009I2_A3311BarManCod1 = new short[1] ;
      P009I2_A3310BarFac = new String[] {""} ;
      P009I2_A2830BarIntPer = new byte[1] ;
      P009I2_A2826BarNumLot = new int[1] ;
      P009I2_A2752BarNumTex1 = new byte[1] ;
      P009I2_A2400BarManCod = new short[1] ;
      P009I2_A1499BarNMez = new String[] {""} ;
      P009I2_A1500BarNMtr = new String[] {""} ;
      P009I2_A935BarReoPar = new String[] {""} ;
      P009I2_A936BarReoReo = new byte[1] ;
      P009I2_A934BarReoCod = new int[1] ;
      P009I2_A899TipDefPor = new short[1] ;
      P009I2_n899TipDefPor = new boolean[] {false} ;
      P009I2_A833TipDefCod = new short[1] ;
      P009I2_n833TipDefCod = new boolean[] {false} ;
      P009I2_A178BarLis = new byte[1] ;
      P009I2_A169BarKgsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A189BarNumAny = new short[1] ;
      P009I2_A137BarConPar = new String[] {""} ;
      P009I2_A138BarConReo = new byte[1] ;
      P009I2_A213BarSit = new byte[1] ;
      P009I2_A146BarEst = new byte[1] ;
      P009I2_A118BarAcaQui = new String[] {""} ;
      P009I2_A193BarOpeEsp = new byte[1] ;
      P009I2_A148BarEstReo = new byte[1] ;
      P009I2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P009I2_A361DisCod = new int[1] ;
      P009I2_A180BarMaqCod = new String[] {""} ;
      P009I2_A120BarAgrEst = new String[] {""} ;
      P009I2_A130BarCodPar = new String[] {""} ;
      P009I2_A132BarCodReo = new byte[1] ;
      P009I2_A129BarCod = new int[1] ;
      P009I2_A252CliCod = new int[1] ;
      P009I2_n252CliCod = new boolean[] {false} ;
      P009I2_A14330BarPriorid = new byte[1] ;
      P009I2_A14329BarCnoEncO = new String[] {""} ;
      P009I2_A13908BarIdtx2 = new String[] {""} ;
      P009I2_n13908BarIdtx2 = new boolean[] {false} ;
      P009I2_A13907BarSerDsc2 = new String[] {""} ;
      P009I2_n13907BarSerDsc2 = new boolean[] {false} ;
      P009I2_A13769BarRdto4 = new short[1] ;
      P009I2_n13769BarRdto4 = new boolean[] {false} ;
      P009I2_A13234BarRGB = new long[1] ;
      P009I2_A13092BarDGUltLi = new byte[1] ;
      P009I2_n13092BarDGUltLi = new boolean[] {false} ;
      P009I2_A13077BarLinPrd = new String[] {""} ;
      P009I2_A13071BarCanalID = new int[1] ;
      P009I2_A13070BarLineaID = new short[1] ;
      P009I2_A12881BarOEKOTEX = new String[] {""} ;
      P009I2_n12881BarOEKOTEX = new boolean[] {false} ;
      P009I2_A12811BarLocCol = new String[] {""} ;
      P009I2_A12810BarLocMol = new String[] {""} ;
      P009I2_A12809BarLocTel = new String[] {""} ;
      P009I2_A12774BarProdID = new String[] {""} ;
      P009I2_A12767BarTpEstam = new byte[1] ;
      P009I2_A12329SubRevID = new String[] {""} ;
      P009I2_n12329SubRevID = new boolean[] {false} ;
      P009I2_A11857Nxt_desaID = new short[1] ;
      P009I2_n11857Nxt_desaID = new boolean[] {false} ;
      P009I2_A11855Nxt_dpoID = new short[1] ;
      P009I2_n11855Nxt_dpoID = new boolean[] {false} ;
      P009I2_A11853Nxt_cpeID = new short[1] ;
      P009I2_n11853Nxt_cpeID = new boolean[] {false} ;
      P009I2_A11852Nxt_ArtCl2 = new String[] {""} ;
      P009I2_A11851Nxt_Sta2 = new String[] {""} ;
      P009I2_A11850Nxt_Mdlo2 = new String[] {""} ;
      P009I2_A3736BarPieMtl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A3735BarPieKgl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A3363BarPiePrv = new short[1] ;
      P009I2_A3362BarMtsPrv = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A3361BarKgsPrv = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A3786BarEnvBar = new String[] {""} ;
      P009I2_A3785BarUltAny = new short[1] ;
      P009I2_A3784BarAnyTie = new short[1] ;
      P009I2_A3783BarRecLis = new byte[1] ;
      P009I2_A3780BarKilLam = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I2_A3597BarVolAma = new int[1] ;
      P009I2_A3596BarMaqAma = new String[] {""} ;
      P009I2_A11662BarOrdComp = new String[] {""} ;
      P009I2_A4844BarAudULin = new short[1] ;
      P009I2_n4844BarAudULin = new boolean[] {false} ;
      A1878BarNumTen = "" ;
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
      A4841BarAudMCue = DecimalUtil.ZERO ;
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
      A120BarAgrEst = "" ;
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
      AV86Baritem2 = "" ;
      AV87Baritem3 = "" ;
      AV88Baritem4 = "" ;
      AV89Baritem5 = "" ;
      AV90Baritem6 = "" ;
      W180BarMaqCod = "" ;
      W159BarFecGen = GXutil.nullDate() ;
      W137BarConPar = "" ;
      W169BarKgsFac = DecimalUtil.ZERO ;
      W141BarCosPro = DecimalUtil.ZERO ;
      W140BarCosAny = DecimalUtil.ZERO ;
      W935BarReoPar = "" ;
      W365DisDes = "" ;
      W3310BarFac = "" ;
      W4835BarAudOpeN = "" ;
      W120BarAgrEst = "" ;
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
      W4837BarAudSupN = "" ;
      Gx_date = GXutil.nullDate() ;
      AV77Fecha_a = "" ;
      Gx_time = "" ;
      Gx_emsg = "" ;
      P009I4_A396EmprCod = new String[] {""} ;
      P009I4_A130BarCodPar = new String[] {""} ;
      P009I4_A132BarCodReo = new byte[1] ;
      P009I4_A129BarCod = new int[1] ;
      P009I4_A187BarNotDsc = new String[] {""} ;
      P009I4_A188BarNotLin = new byte[1] ;
      A187BarNotDsc = "" ;
      W187BarNotDsc = "" ;
      P009I6_A11108Nof_Pp = new String[] {""} ;
      P009I6_n11108Nof_Pp = new boolean[] {false} ;
      P009I6_A11107Nof_Mcot = new String[] {""} ;
      P009I6_n11107Nof_Mcot = new boolean[] {false} ;
      P009I6_A11106Nof_Pd = new String[] {""} ;
      P009I6_n11106Nof_Pd = new boolean[] {false} ;
      P009I6_A396EmprCod = new String[] {""} ;
      P009I6_A11105Nof_p = new String[] {""} ;
      P009I6_A11104Nof_r = new byte[1] ;
      P009I6_A11103Nof_Hdr = new int[1] ;
      P009I6_A11710Nof_enc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I6_n11710Nof_enc = new boolean[] {false} ;
      P009I6_A11709Nof_nc = new byte[1] ;
      P009I6_n11709Nof_nc = new boolean[] {false} ;
      P009I6_A11428Nof_obs11 = new String[] {""} ;
      P009I6_n11428Nof_obs11 = new boolean[] {false} ;
      P009I6_A11427Nof_obs10 = new String[] {""} ;
      P009I6_n11427Nof_obs10 = new boolean[] {false} ;
      P009I6_A11426Nof_obs9 = new String[] {""} ;
      P009I6_n11426Nof_obs9 = new boolean[] {false} ;
      P009I6_A11425Nof_obs8 = new String[] {""} ;
      P009I6_n11425Nof_obs8 = new boolean[] {false} ;
      P009I6_A11424Nof_obs7 = new String[] {""} ;
      P009I6_n11424Nof_obs7 = new boolean[] {false} ;
      P009I6_A11423Nof_obs6 = new String[] {""} ;
      P009I6_n11423Nof_obs6 = new boolean[] {false} ;
      P009I6_A11422Nof_obs5 = new String[] {""} ;
      P009I6_n11422Nof_obs5 = new boolean[] {false} ;
      P009I6_A11421Nof_obs4 = new String[] {""} ;
      P009I6_n11421Nof_obs4 = new boolean[] {false} ;
      P009I6_A11420Nof_obs3 = new String[] {""} ;
      P009I6_n11420Nof_obs3 = new boolean[] {false} ;
      P009I6_A11419Nof_obs2 = new String[] {""} ;
      P009I6_n11419Nof_obs2 = new boolean[] {false} ;
      P009I6_A11418Nof_obs1 = new String[] {""} ;
      P009I6_n11418Nof_obs1 = new boolean[] {false} ;
      P009I6_A11406Nof_oekote = new String[] {""} ;
      P009I6_n11406Nof_oekote = new boolean[] {false} ;
      P009I6_A11405Nof_humeda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P009I6_n11405Nof_humeda = new boolean[] {false} ;
      P009I6_A11404Nof_termom = new String[] {""} ;
      P009I6_n11404Nof_termom = new boolean[] {false} ;
      P009I6_A11403Nof_aguam = new String[] {""} ;
      P009I6_n11403Nof_aguam = new boolean[] {false} ;
      P009I6_A11402Nof_cloro = new String[] {""} ;
      P009I6_n11402Nof_cloro = new boolean[] {false} ;
      P009I6_A11401Nof_sudor = new String[] {""} ;
      P009I6_n11401Nof_sudor = new boolean[] {false} ;
      P009I6_A11400Nof_luz = new String[] {""} ;
      P009I6_n11400Nof_luz = new boolean[] {false} ;
      P009I6_A11399Nof_lavado = new String[] {""} ;
      P009I6_n11399Nof_lavado = new boolean[] {false} ;
      P009I6_A11398Nof_imp11 = new String[] {""} ;
      P009I6_n11398Nof_imp11 = new boolean[] {false} ;
      P009I6_A11397Nof_imp10 = new String[] {""} ;
      P009I6_n11397Nof_imp10 = new boolean[] {false} ;
      P009I6_A11396Nof_imp9 = new String[] {""} ;
      P009I6_n11396Nof_imp9 = new boolean[] {false} ;
      P009I6_A11395Nof_imp8 = new String[] {""} ;
      P009I6_n11395Nof_imp8 = new boolean[] {false} ;
      P009I6_A11394Nof_imp7 = new String[] {""} ;
      P009I6_n11394Nof_imp7 = new boolean[] {false} ;
      P009I6_A11393Nof_imp6 = new String[] {""} ;
      P009I6_n11393Nof_imp6 = new boolean[] {false} ;
      P009I6_A11392Nof_imp5 = new String[] {""} ;
      P009I6_n11392Nof_imp5 = new boolean[] {false} ;
      P009I6_A11391Nof_imp4 = new String[] {""} ;
      P009I6_n11391Nof_imp4 = new boolean[] {false} ;
      P009I6_A11390Nof_imp3 = new String[] {""} ;
      P009I6_n11390Nof_imp3 = new boolean[] {false} ;
      P009I6_A11389Nof_imp2 = new String[] {""} ;
      P009I6_n11389Nof_imp2 = new boolean[] {false} ;
      P009I6_A11388Nof_imp1 = new String[] {""} ;
      P009I6_n11388Nof_imp1 = new boolean[] {false} ;
      P009I6_A11171Nof_c12 = new String[] {""} ;
      P009I6_n11171Nof_c12 = new boolean[] {false} ;
      P009I6_A11170Nof_c11 = new String[] {""} ;
      P009I6_n11170Nof_c11 = new boolean[] {false} ;
      P009I6_A11169Nof_Lbtp = new short[1] ;
      P009I6_n11169Nof_Lbtp = new boolean[] {false} ;
      P009I6_A11168Nof_Lbta = new String[] {""} ;
      P009I6_n11168Nof_Lbta = new boolean[] {false} ;
      P009I6_A11167Nof_stk = new String[] {""} ;
      P009I6_n11167Nof_stk = new boolean[] {false} ;
      P009I6_A11166Nof_c10 = new String[] {""} ;
      P009I6_n11166Nof_c10 = new boolean[] {false} ;
      P009I6_A11165Nof_sa6 = new String[] {""} ;
      P009I6_n11165Nof_sa6 = new boolean[] {false} ;
      P009I6_A11164Nof_sa5 = new String[] {""} ;
      P009I6_n11164Nof_sa5 = new boolean[] {false} ;
      P009I6_A11163Nof_sa4 = new String[] {""} ;
      P009I6_n11163Nof_sa4 = new boolean[] {false} ;
      P009I6_A11162Nof_sa3 = new String[] {""} ;
      P009I6_n11162Nof_sa3 = new boolean[] {false} ;
      P009I6_A11161Nof_sa2 = new String[] {""} ;
      P009I6_n11161Nof_sa2 = new boolean[] {false} ;
      P009I6_A11160Nof_sa1 = new String[] {""} ;
      P009I6_n11160Nof_sa1 = new boolean[] {false} ;
      P009I6_A11159Nof_c9 = new String[] {""} ;
      P009I6_n11159Nof_c9 = new boolean[] {false} ;
      P009I6_A11158Nof_ep10 = new String[] {""} ;
      P009I6_n11158Nof_ep10 = new boolean[] {false} ;
      P009I6_A11157Nof_ep9 = new String[] {""} ;
      P009I6_n11157Nof_ep9 = new boolean[] {false} ;
      P009I6_A11156Nof_ep8 = new String[] {""} ;
      P009I6_n11156Nof_ep8 = new boolean[] {false} ;
      P009I6_A11155Nof_ep7 = new String[] {""} ;
      P009I6_n11155Nof_ep7 = new boolean[] {false} ;
      P009I6_A11154Nof_ep6 = new String[] {""} ;
      P009I6_n11154Nof_ep6 = new boolean[] {false} ;
      P009I6_A11153Nof_ep5 = new String[] {""} ;
      P009I6_n11153Nof_ep5 = new boolean[] {false} ;
      P009I6_A11152Nof_ep4 = new String[] {""} ;
      P009I6_n11152Nof_ep4 = new boolean[] {false} ;
      P009I6_A11151Nof_ep3 = new String[] {""} ;
      P009I6_n11151Nof_ep3 = new boolean[] {false} ;
      P009I6_A11150Nof_ep2 = new String[] {""} ;
      P009I6_n11150Nof_ep2 = new boolean[] {false} ;
      P009I6_A11149Nof_ep1 = new String[] {""} ;
      P009I6_n11149Nof_ep1 = new boolean[] {false} ;
      P009I6_A11148Nof_c8 = new String[] {""} ;
      P009I6_n11148Nof_c8 = new boolean[] {false} ;
      P009I6_A11147Nof_rb3 = new String[] {""} ;
      P009I6_n11147Nof_rb3 = new boolean[] {false} ;
      P009I6_A11146Nof_rb1 = new String[] {""} ;
      P009I6_n11146Nof_rb1 = new boolean[] {false} ;
      P009I6_A11145Nof_rboc = new short[1] ;
      P009I6_n11145Nof_rboc = new boolean[] {false} ;
      P009I6_A11144Nof_rbp = new String[] {""} ;
      P009I6_n11144Nof_rbp = new boolean[] {false} ;
      P009I6_A11143Nof_rbe = new String[] {""} ;
      P009I6_n11143Nof_rbe = new boolean[] {false} ;
      P009I6_A11142Nof_rbi = new String[] {""} ;
      P009I6_n11142Nof_rbi = new boolean[] {false} ;
      P009I6_A11141Nof_rb = new String[] {""} ;
      P009I6_n11141Nof_rb = new boolean[] {false} ;
      P009I6_A11140Nof_c7 = new String[] {""} ;
      P009I6_n11140Nof_c7 = new boolean[] {false} ;
      P009I6_A11139Nof_ccmc6 = new String[] {""} ;
      P009I6_n11139Nof_ccmc6 = new boolean[] {false} ;
      P009I6_A11138Nof_ccmc5 = new String[] {""} ;
      P009I6_n11138Nof_ccmc5 = new boolean[] {false} ;
      P009I6_A11137Nof_ccmc4 = new String[] {""} ;
      P009I6_n11137Nof_ccmc4 = new boolean[] {false} ;
      P009I6_A11136Nof_ccmc3 = new String[] {""} ;
      P009I6_n11136Nof_ccmc3 = new boolean[] {false} ;
      P009I6_A11135Nof_ccmc2 = new String[] {""} ;
      P009I6_n11135Nof_ccmc2 = new boolean[] {false} ;
      P009I6_A11134Nof_ccmc1 = new String[] {""} ;
      P009I6_n11134Nof_ccmc1 = new boolean[] {false} ;
      P009I6_A11133Nof_ccec = new String[] {""} ;
      P009I6_n11133Nof_ccec = new boolean[] {false} ;
      P009I6_A11132Nof_cccc = new String[] {""} ;
      P009I6_n11132Nof_cccc = new boolean[] {false} ;
      P009I6_A11131Nof_cctq = new String[] {""} ;
      P009I6_n11131Nof_cctq = new boolean[] {false} ;
      P009I6_A11130Nof_ccpc = new String[] {""} ;
      P009I6_n11130Nof_ccpc = new boolean[] {false} ;
      P009I6_A11129Nof_cct = new byte[1] ;
      P009I6_n11129Nof_cct = new boolean[] {false} ;
      P009I6_A11128Nof_ccp = new byte[1] ;
      P009I6_n11128Nof_ccp = new boolean[] {false} ;
      P009I6_A11127Nof_cctet = new String[] {""} ;
      P009I6_n11127Nof_cctet = new boolean[] {false} ;
      P009I6_A11126Nof_ccttp = new String[] {""} ;
      P009I6_n11126Nof_ccttp = new boolean[] {false} ;
      P009I6_A11125Nof_cctse = new String[] {""} ;
      P009I6_n11125Nof_cctse = new boolean[] {false} ;
      P009I6_A11124Nof_c6 = new String[] {""} ;
      P009I6_n11124Nof_c6 = new boolean[] {false} ;
      P009I6_A11123Nof_scc = new String[] {""} ;
      P009I6_n11123Nof_scc = new boolean[] {false} ;
      P009I6_A11122Nof_scs = new String[] {""} ;
      P009I6_n11122Nof_scs = new boolean[] {false} ;
      P009I6_A11121Nof_c5 = new String[] {""} ;
      P009I6_n11121Nof_c5 = new boolean[] {false} ;
      P009I6_A11120Nof_ct = new String[] {""} ;
      P009I6_n11120Nof_ct = new boolean[] {false} ;
      P009I6_A11119Nof_c4 = new String[] {""} ;
      P009I6_n11119Nof_c4 = new boolean[] {false} ;
      P009I6_A11118Nof_tnc = new String[] {""} ;
      P009I6_n11118Nof_tnc = new boolean[] {false} ;
      P009I6_A11117Nof_tns = new String[] {""} ;
      P009I6_n11117Nof_tns = new boolean[] {false} ;
      P009I6_A11116Nof_c3 = new String[] {""} ;
      P009I6_n11116Nof_c3 = new boolean[] {false} ;
      P009I6_A11115Nof_Bov = new String[] {""} ;
      P009I6_n11115Nof_Bov = new boolean[] {false} ;
      P009I6_A11114Nof_boe = new String[] {""} ;
      P009I6_n11114Nof_boe = new boolean[] {false} ;
      P009I6_A11113Nof_bob = new String[] {""} ;
      P009I6_n11113Nof_bob = new boolean[] {false} ;
      P009I6_A11112Nof_bo = new String[] {""} ;
      P009I6_n11112Nof_bo = new boolean[] {false} ;
      P009I6_A11111Nof_c2 = new String[] {""} ;
      P009I6_n11111Nof_c2 = new boolean[] {false} ;
      P009I6_A11110Nof_c1 = new String[] {""} ;
      P009I6_n11110Nof_c1 = new boolean[] {false} ;
      P009I6_A840TrnCod = new short[1] ;
      P009I6_n840TrnCod = new boolean[] {false} ;
      P009I6_A11109Nof_Ag = new String[] {""} ;
      P009I6_n11109Nof_Ag = new boolean[] {false} ;
      A11108Nof_Pp = "" ;
      A11107Nof_Mcot = "" ;
      A11106Nof_Pd = "" ;
      A11105Nof_p = "" ;
      A11710Nof_enc = DecimalUtil.ZERO ;
      A11428Nof_obs11 = "" ;
      A11427Nof_obs10 = "" ;
      A11426Nof_obs9 = "" ;
      A11425Nof_obs8 = "" ;
      A11424Nof_obs7 = "" ;
      A11423Nof_obs6 = "" ;
      A11422Nof_obs5 = "" ;
      A11421Nof_obs4 = "" ;
      A11420Nof_obs3 = "" ;
      A11419Nof_obs2 = "" ;
      A11418Nof_obs1 = "" ;
      A11406Nof_oekote = "" ;
      A11405Nof_humeda = DecimalUtil.ZERO ;
      A11404Nof_termom = "" ;
      A11403Nof_aguam = "" ;
      A11402Nof_cloro = "" ;
      A11401Nof_sudor = "" ;
      A11400Nof_luz = "" ;
      A11399Nof_lavado = "" ;
      A11398Nof_imp11 = "" ;
      A11397Nof_imp10 = "" ;
      A11396Nof_imp9 = "" ;
      A11395Nof_imp8 = "" ;
      A11394Nof_imp7 = "" ;
      A11393Nof_imp6 = "" ;
      A11392Nof_imp5 = "" ;
      A11391Nof_imp4 = "" ;
      A11390Nof_imp3 = "" ;
      A11389Nof_imp2 = "" ;
      A11388Nof_imp1 = "" ;
      A11171Nof_c12 = "" ;
      A11170Nof_c11 = "" ;
      A11168Nof_Lbta = "" ;
      A11167Nof_stk = "" ;
      A11166Nof_c10 = "" ;
      A11165Nof_sa6 = "" ;
      A11164Nof_sa5 = "" ;
      A11163Nof_sa4 = "" ;
      A11162Nof_sa3 = "" ;
      A11161Nof_sa2 = "" ;
      A11160Nof_sa1 = "" ;
      A11159Nof_c9 = "" ;
      A11158Nof_ep10 = "" ;
      A11157Nof_ep9 = "" ;
      A11156Nof_ep8 = "" ;
      A11155Nof_ep7 = "" ;
      A11154Nof_ep6 = "" ;
      A11153Nof_ep5 = "" ;
      A11152Nof_ep4 = "" ;
      A11151Nof_ep3 = "" ;
      A11150Nof_ep2 = "" ;
      A11149Nof_ep1 = "" ;
      A11148Nof_c8 = "" ;
      A11147Nof_rb3 = "" ;
      A11146Nof_rb1 = "" ;
      A11144Nof_rbp = "" ;
      A11143Nof_rbe = "" ;
      A11142Nof_rbi = "" ;
      A11141Nof_rb = "" ;
      A11140Nof_c7 = "" ;
      A11139Nof_ccmc6 = "" ;
      A11138Nof_ccmc5 = "" ;
      A11137Nof_ccmc4 = "" ;
      A11136Nof_ccmc3 = "" ;
      A11135Nof_ccmc2 = "" ;
      A11134Nof_ccmc1 = "" ;
      A11133Nof_ccec = "" ;
      A11132Nof_cccc = "" ;
      A11131Nof_cctq = "" ;
      A11130Nof_ccpc = "" ;
      A11127Nof_cctet = "" ;
      A11126Nof_ccttp = "" ;
      A11125Nof_cctse = "" ;
      A11124Nof_c6 = "" ;
      A11123Nof_scc = "" ;
      A11122Nof_scs = "" ;
      A11121Nof_c5 = "" ;
      A11120Nof_ct = "" ;
      A11119Nof_c4 = "" ;
      A11118Nof_tnc = "" ;
      A11117Nof_tns = "" ;
      A11116Nof_c3 = "" ;
      A11115Nof_Bov = "" ;
      A11114Nof_boe = "" ;
      A11113Nof_bob = "" ;
      A11112Nof_bo = "" ;
      A11111Nof_c2 = "" ;
      A11110Nof_c1 = "" ;
      A11109Nof_Ag = "" ;
      W11105Nof_p = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnuebar__default(),
         new Object[] {
             new Object[] {
            P009I2_A1878BarNumTen, P009I2_A1832BarLisInd, P009I2_A1652BarSerDsc, P009I2_A1503BarPart, P009I2_A1431BarLocDis, P009I2_A1254BarPesBal, P009I2_A1235BarNumCli, P009I2_A1234BarNomCli, P009I2_A1226BarGraCru, P009I2_A1224BarEncAnh,
            P009I2_A1223BarEncCom, P009I2_A921BarMatiz, P009I2_A1003BarFecLan, P009I2_n1003BarFecLan, P009I2_A905ObsReoULin, P009I2_n905ObsReoULin, P009I2_A904ObsReoEnt, P009I2_n904ObsReoEnt, P009I2_A864BarPes, P009I2_A646NotUltLin,
            P009I2_n646NotUltLin, P009I2_A144BarDisOri, P009I2_A190BarNumAso, P009I2_A149BarEstRes, P009I2_A147BarEstCol, P009I2_A158BarFecFpr, P009I2_A163BarHorCum, P009I2_A209BarPri, P009I2_A145BarEncOri, P009I2_A139BarCorOri,
            P009I2_A214BarSua, P009I2_A177BarLar, P009I2_A206BarPle, P009I2_A126BarAncAca2, P009I2_A125BarAncAca1, P009I2_A128BarAncCru2, P009I2_A127BarAncCru1, P009I2_A234BarUrdP3, P009I2_A231BarUrd3, P009I2_A233BarUrdP2,
            P009I2_A230BarUrd2, P009I2_A232BarUrdP1, P009I2_A229BarUrd1, P009I2_A226BarTraP3, P009I2_A223BarTra3, P009I2_A225BarTraP2, P009I2_A222BarTra2, P009I2_A224BarTraP1, P009I2_A221BarTra1, P009I2_A211BarRdt,
            P009I2_A182BarMat, P009I2_A142BarDiaP, P009I2_A235BarUrg, P009I2_A161BarFecSal, P009I2_A181BarMaqPro, P009I2_A157BarFecEnt, P009I2_A196BarOrdReo, P009I2_A191BarNumPie, P009I2_A155BarFecCli, P009I2_A228BarUniMed,
            P009I2_A192BarNumUni, P009I2_A218BarTipCol, P009I2_A136BarColNum, P009I2_A135BarColNom, P009I2_A217BarTipArt, P009I2_n217BarTipArt, P009I2_A212BarSer, P009I2_A143BarDisNum, P009I2_A236BarVolMaq, P009I2_A4841BarAudMCue,
            P009I2_n4841BarAudMCue, P009I2_A4840BarAudMDig, P009I2_n4840BarAudMDig, P009I2_A4838BarAudNPz, P009I2_n4838BarAudNPz, P009I2_A4834BarAudOpe, P009I2_n4834BarAudOpe, P009I2_A4832BarAudFec, P009I2_n4832BarAudFec, P009I2_A8568EntSecUlt,
            P009I2_n8568EntSecUlt, P009I2_A8098BarOpeHis, P009I2_A8097BarFecHis, P009I2_A7733BarMaqEst, P009I2_A5406BarAntpT, P009I2_A5367BarAntp, P009I2_A5293BarCodBan, P009I2_A5057BarFacAbs, P009I2_n5057BarFacAbs, P009I2_A5056BarBp15,
            P009I2_n5056BarBp15, P009I2_A5055BarBp14, P009I2_n5055BarBp14, P009I2_A5054BarBp13, P009I2_n5054BarBp13, P009I2_A5009BarLoteA, P009I2_A4975BarNumReo, P009I2_A4908BarMacPro, P009I2_A4845BarAudObs, P009I2_n4845BarAudObs,
            P009I2_A4836BarAudSup, P009I2_A4812BarEncCli, P009I2_A4613BarHorReg, P009I2_n4613BarHorReg, P009I2_A4612BarPzas, P009I2_n4612BarPzas, P009I2_A4611BarHorEnt, P009I2_n4611BarHorEnt, P009I2_A4610BarTam, P009I2_A4467BarAcaMar,
            P009I2_A4466BarAcaAnh, P009I2_A4465BarAcaBak, P009I2_n4465BarAcaBak, P009I2_A4464BarAcaFor, P009I2_n4464BarAcaFor, P009I2_A4463BarLotMaq, P009I2_n4463BarLotMaq, P009I2_A4462BarLotKgs, P009I2_A4461BarLotMts, P009I2_A4460BarLotPza,
            P009I2_n4460BarLotPza, P009I2_A4459BarCruEnr, P009I2_A4458BarCruKgs, P009I2_n4458BarCruKgs, P009I2_A4457BarCruMts, P009I2_n4457BarCruMts, P009I2_A4456BarPelAnh, P009I2_A4400BarSitEst, P009I2_A4017BarInci, P009I2_A4016BarTin,
            P009I2_A4015BarEnv, P009I2_A2512BarComULin, P009I2_n2512BarComULin, P009I2_A1799BarDibInt, P009I2_A1798BarDibCli, P009I2_A3871BarFecCRe, P009I2_A3870BarFecLRe, P009I2_A3787BarEnvRec, P009I2_n3787BarEnvRec, P009I2_A3746BarNPed,
            P009I2_A3745BarFoa, P009I2_A3313BarNumTon, P009I2_A3138BarGraCru2, P009I2_A3137BarGraAca2, P009I2_A3136BarAncSal3, P009I2_A3135BarAncSal2, P009I2_A3134BarAncSal1, P009I2_A3133BarNumCor, P009I2_A2836BarPle2, P009I2_A3030BarPlf,
            P009I2_A3006BarCoef, P009I2_n3006BarCoef, P009I2_A2829BarProPer, P009I2_A2828BarMtrLot, P009I2_A2827BarKgsLot, P009I2_A2803UltLinMaq, P009I2_n2803UltLinMaq, P009I2_A2759BarMaqGru, P009I2_A2754BarSitExt, P009I2_A2753BarNumTex2,
            P009I2_n2753BarNumTex2, P009I2_A2746BarCodTex, P009I2_n2746BarCodTex, P009I2_A2487BarConEle, P009I2_A2488BarConVap, P009I2_A2486BarConAgu, P009I2_A2496BarFecFin, P009I2_A2497BarFecIni, P009I2_A2500BarRDos2, P009I2_A2499BarRDos1,
            P009I2_A2498BarPrdPes, P009I2_A2485BarColPes, P009I2_A1911BarRdoA, P009I2_A1910BarRdoN, P009I2_A1909BarGraAca, P009I2_A2458BarObsVL, P009I2_n2458BarObsVL, P009I2_A2453BarEntAca, P009I2_n2453BarEntAca, P009I2_A2452BarCal,
            P009I2_n2452BarCal, P009I2_A2459BarTemSec, P009I2_A2455BarNMont, P009I2_n2455BarNMont, P009I2_A2454BarGirar, P009I2_A2460BarTipAca, P009I2_A2450BarKgEnR, P009I2_n2450BarKgEnR, P009I2_A2443BarBulEnR, P009I2_n2443BarBulEnR,
            P009I2_A2448BarFecEnR, P009I2_n2448BarFecEnR, P009I2_A2446BarEnULin, P009I2_n2446BarEnULin, P009I2_A2445BarEntEnE, P009I2_A2449BarKgEnE, P009I2_n2449BarKgEnE, P009I2_A2442BarBulEnE, P009I2_n2442BarBulEnE, P009I2_A2447BarFecEnE,
            P009I2_A2401BarNumPas, P009I2_n2401BarNumPas, P009I2_A2311BarCliDes, P009I2_A2265BarExt, P009I2_n2265BarExt, P009I2_A2010BarTipDis, P009I2_A1923BarCodTN, P009I2_A396EmprCod, P009I2_A365DisDes, P009I2_A5058BarEnvLaw,
            P009I2_A3594BarPriTin, P009I2_A4837BarAudSupN, P009I2_n4837BarAudSupN, P009I2_A4835BarAudOpeN, P009I2_n4835BarAudOpeN, P009I2_A4833BarAudTur, P009I2_n4833BarAudTur, P009I2_A9790BarItem6, P009I2_A9789BarItem5, P009I2_A9778BarItem4,
            P009I2_A9777BarItem3, P009I2_A9776barItem2, P009I2_A9775BarItem1, P009I2_A6434BarAsi, P009I2_A5352BarObsAnc, P009I2_A5351BarObsGrm, P009I2_A5291BarTipCor, P009I2_A5253BarAcc, P009I2_A5053BarBp12, P009I2_n5053BarBp12,
            P009I2_A5034BarEstTip, P009I2_A5033BarCom, P009I2_A5027BarGraCob, P009I2_A5026BarTipEst, P009I2_A4937BarCtrPdas, P009I2_n4937BarCtrPdas, P009I2_A4716BarDishCod, P009I2_A4609BarMdlCod, P009I2_A4018BarBot, P009I2_A3744BarPeg,
            P009I2_A3595BarMacCod, P009I2_A3312BarManCod2, P009I2_A3311BarManCod1, P009I2_A3310BarFac, P009I2_A2830BarIntPer, P009I2_A2826BarNumLot, P009I2_A2752BarNumTex1, P009I2_A2400BarManCod, P009I2_A1499BarNMez, P009I2_A1500BarNMtr,
            P009I2_A935BarReoPar, P009I2_A936BarReoReo, P009I2_A934BarReoCod, P009I2_A899TipDefPor, P009I2_n899TipDefPor, P009I2_A833TipDefCod, P009I2_n833TipDefCod, P009I2_A178BarLis, P009I2_A169BarKgsFac, P009I2_A140BarCosAny,
            P009I2_A141BarCosPro, P009I2_A189BarNumAny, P009I2_A137BarConPar, P009I2_A138BarConReo, P009I2_A213BarSit, P009I2_A146BarEst, P009I2_A118BarAcaQui, P009I2_A193BarOpeEsp, P009I2_A148BarEstReo, P009I2_A159BarFecGen,
            P009I2_A361DisCod, P009I2_A180BarMaqCod, P009I2_A120BarAgrEst, P009I2_A130BarCodPar, P009I2_A132BarCodReo, P009I2_A129BarCod, P009I2_A252CliCod, P009I2_n252CliCod, P009I2_A14330BarPriorid, P009I2_A14329BarCnoEncO,
            P009I2_A13908BarIdtx2, P009I2_n13908BarIdtx2, P009I2_A13907BarSerDsc2, P009I2_n13907BarSerDsc2, P009I2_A13769BarRdto4, P009I2_n13769BarRdto4, P009I2_A13234BarRGB, P009I2_A13092BarDGUltLi, P009I2_n13092BarDGUltLi, P009I2_A13077BarLinPrd,
            P009I2_A13071BarCanalID, P009I2_A13070BarLineaID, P009I2_A12881BarOEKOTEX, P009I2_n12881BarOEKOTEX, P009I2_A12811BarLocCol, P009I2_A12810BarLocMol, P009I2_A12809BarLocTel, P009I2_A12774BarProdID, P009I2_A12767BarTpEstam, P009I2_A12329SubRevID,
            P009I2_n12329SubRevID, P009I2_A11857Nxt_desaID, P009I2_n11857Nxt_desaID, P009I2_A11855Nxt_dpoID, P009I2_n11855Nxt_dpoID, P009I2_A11853Nxt_cpeID, P009I2_n11853Nxt_cpeID, P009I2_A11852Nxt_ArtCl2, P009I2_A11851Nxt_Sta2, P009I2_A11850Nxt_Mdlo2,
            P009I2_A3736BarPieMtl, P009I2_A3735BarPieKgl, P009I2_A3363BarPiePrv, P009I2_A3362BarMtsPrv, P009I2_A3361BarKgsPrv, P009I2_A3786BarEnvBar, P009I2_A3785BarUltAny, P009I2_A3784BarAnyTie, P009I2_A3783BarRecLis, P009I2_A3780BarKilLam,
            P009I2_A3597BarVolAma, P009I2_A3596BarMaqAma, P009I2_A11662BarOrdComp, P009I2_A4844BarAudULin, P009I2_n4844BarAudULin
            }
            , new Object[] {
            }
            , new Object[] {
            P009I4_A396EmprCod, P009I4_A130BarCodPar, P009I4_A132BarCodReo, P009I4_A129BarCod, P009I4_A187BarNotDsc, P009I4_A188BarNotLin
            }
            , new Object[] {
            }
            , new Object[] {
            P009I6_A11108Nof_Pp, P009I6_n11108Nof_Pp, P009I6_A11107Nof_Mcot, P009I6_n11107Nof_Mcot, P009I6_A11106Nof_Pd, P009I6_n11106Nof_Pd, P009I6_A396EmprCod, P009I6_A11105Nof_p, P009I6_A11104Nof_r, P009I6_A11103Nof_Hdr,
            P009I6_A11710Nof_enc, P009I6_n11710Nof_enc, P009I6_A11709Nof_nc, P009I6_n11709Nof_nc, P009I6_A11428Nof_obs11, P009I6_n11428Nof_obs11, P009I6_A11427Nof_obs10, P009I6_n11427Nof_obs10, P009I6_A11426Nof_obs9, P009I6_n11426Nof_obs9,
            P009I6_A11425Nof_obs8, P009I6_n11425Nof_obs8, P009I6_A11424Nof_obs7, P009I6_n11424Nof_obs7, P009I6_A11423Nof_obs6, P009I6_n11423Nof_obs6, P009I6_A11422Nof_obs5, P009I6_n11422Nof_obs5, P009I6_A11421Nof_obs4, P009I6_n11421Nof_obs4,
            P009I6_A11420Nof_obs3, P009I6_n11420Nof_obs3, P009I6_A11419Nof_obs2, P009I6_n11419Nof_obs2, P009I6_A11418Nof_obs1, P009I6_n11418Nof_obs1, P009I6_A11406Nof_oekote, P009I6_n11406Nof_oekote, P009I6_A11405Nof_humeda, P009I6_n11405Nof_humeda,
            P009I6_A11404Nof_termom, P009I6_n11404Nof_termom, P009I6_A11403Nof_aguam, P009I6_n11403Nof_aguam, P009I6_A11402Nof_cloro, P009I6_n11402Nof_cloro, P009I6_A11401Nof_sudor, P009I6_n11401Nof_sudor, P009I6_A11400Nof_luz, P009I6_n11400Nof_luz,
            P009I6_A11399Nof_lavado, P009I6_n11399Nof_lavado, P009I6_A11398Nof_imp11, P009I6_n11398Nof_imp11, P009I6_A11397Nof_imp10, P009I6_n11397Nof_imp10, P009I6_A11396Nof_imp9, P009I6_n11396Nof_imp9, P009I6_A11395Nof_imp8, P009I6_n11395Nof_imp8,
            P009I6_A11394Nof_imp7, P009I6_n11394Nof_imp7, P009I6_A11393Nof_imp6, P009I6_n11393Nof_imp6, P009I6_A11392Nof_imp5, P009I6_n11392Nof_imp5, P009I6_A11391Nof_imp4, P009I6_n11391Nof_imp4, P009I6_A11390Nof_imp3, P009I6_n11390Nof_imp3,
            P009I6_A11389Nof_imp2, P009I6_n11389Nof_imp2, P009I6_A11388Nof_imp1, P009I6_n11388Nof_imp1, P009I6_A11171Nof_c12, P009I6_n11171Nof_c12, P009I6_A11170Nof_c11, P009I6_n11170Nof_c11, P009I6_A11169Nof_Lbtp, P009I6_n11169Nof_Lbtp,
            P009I6_A11168Nof_Lbta, P009I6_n11168Nof_Lbta, P009I6_A11167Nof_stk, P009I6_n11167Nof_stk, P009I6_A11166Nof_c10, P009I6_n11166Nof_c10, P009I6_A11165Nof_sa6, P009I6_n11165Nof_sa6, P009I6_A11164Nof_sa5, P009I6_n11164Nof_sa5,
            P009I6_A11163Nof_sa4, P009I6_n11163Nof_sa4, P009I6_A11162Nof_sa3, P009I6_n11162Nof_sa3, P009I6_A11161Nof_sa2, P009I6_n11161Nof_sa2, P009I6_A11160Nof_sa1, P009I6_n11160Nof_sa1, P009I6_A11159Nof_c9, P009I6_n11159Nof_c9,
            P009I6_A11158Nof_ep10, P009I6_n11158Nof_ep10, P009I6_A11157Nof_ep9, P009I6_n11157Nof_ep9, P009I6_A11156Nof_ep8, P009I6_n11156Nof_ep8, P009I6_A11155Nof_ep7, P009I6_n11155Nof_ep7, P009I6_A11154Nof_ep6, P009I6_n11154Nof_ep6,
            P009I6_A11153Nof_ep5, P009I6_n11153Nof_ep5, P009I6_A11152Nof_ep4, P009I6_n11152Nof_ep4, P009I6_A11151Nof_ep3, P009I6_n11151Nof_ep3, P009I6_A11150Nof_ep2, P009I6_n11150Nof_ep2, P009I6_A11149Nof_ep1, P009I6_n11149Nof_ep1,
            P009I6_A11148Nof_c8, P009I6_n11148Nof_c8, P009I6_A11147Nof_rb3, P009I6_n11147Nof_rb3, P009I6_A11146Nof_rb1, P009I6_n11146Nof_rb1, P009I6_A11145Nof_rboc, P009I6_n11145Nof_rboc, P009I6_A11144Nof_rbp, P009I6_n11144Nof_rbp,
            P009I6_A11143Nof_rbe, P009I6_n11143Nof_rbe, P009I6_A11142Nof_rbi, P009I6_n11142Nof_rbi, P009I6_A11141Nof_rb, P009I6_n11141Nof_rb, P009I6_A11140Nof_c7, P009I6_n11140Nof_c7, P009I6_A11139Nof_ccmc6, P009I6_n11139Nof_ccmc6,
            P009I6_A11138Nof_ccmc5, P009I6_n11138Nof_ccmc5, P009I6_A11137Nof_ccmc4, P009I6_n11137Nof_ccmc4, P009I6_A11136Nof_ccmc3, P009I6_n11136Nof_ccmc3, P009I6_A11135Nof_ccmc2, P009I6_n11135Nof_ccmc2, P009I6_A11134Nof_ccmc1, P009I6_n11134Nof_ccmc1,
            P009I6_A11133Nof_ccec, P009I6_n11133Nof_ccec, P009I6_A11132Nof_cccc, P009I6_n11132Nof_cccc, P009I6_A11131Nof_cctq, P009I6_n11131Nof_cctq, P009I6_A11130Nof_ccpc, P009I6_n11130Nof_ccpc, P009I6_A11129Nof_cct, P009I6_n11129Nof_cct,
            P009I6_A11128Nof_ccp, P009I6_n11128Nof_ccp, P009I6_A11127Nof_cctet, P009I6_n11127Nof_cctet, P009I6_A11126Nof_ccttp, P009I6_n11126Nof_ccttp, P009I6_A11125Nof_cctse, P009I6_n11125Nof_cctse, P009I6_A11124Nof_c6, P009I6_n11124Nof_c6,
            P009I6_A11123Nof_scc, P009I6_n11123Nof_scc, P009I6_A11122Nof_scs, P009I6_n11122Nof_scs, P009I6_A11121Nof_c5, P009I6_n11121Nof_c5, P009I6_A11120Nof_ct, P009I6_n11120Nof_ct, P009I6_A11119Nof_c4, P009I6_n11119Nof_c4,
            P009I6_A11118Nof_tnc, P009I6_n11118Nof_tnc, P009I6_A11117Nof_tns, P009I6_n11117Nof_tns, P009I6_A11116Nof_c3, P009I6_n11116Nof_c3, P009I6_A11115Nof_Bov, P009I6_n11115Nof_Bov, P009I6_A11114Nof_boe, P009I6_n11114Nof_boe,
            P009I6_A11113Nof_bob, P009I6_n11113Nof_bob, P009I6_A11112Nof_bo, P009I6_n11112Nof_bo, P009I6_A11111Nof_c2, P009I6_n11111Nof_c2, P009I6_A11110Nof_c1, P009I6_n11110Nof_c1, P009I6_A840TrnCod, P009I6_n840TrnCod,
            P009I6_A11109Nof_Ag, P009I6_n11109Nof_Ag
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
   private byte AV36FlagJM ;
   private byte AV37FlagTn ;
   private byte AV42JBP ;
   private byte AV56F_endutex ;
   private byte AV57F_tinamar ;
   private byte AV58F_carvema ;
   private byte AV59FlagInt ;
   private byte AV62F_fechdr ;
   private byte AV63Induyco ;
   private byte AV65Texfina ;
   private byte AV76CtrlUsu ;
   private byte AV78Orient ;
   private byte AV80Bros ;
   private byte AV81WorkNotas ;
   private byte AV82Tintutex ;
   private byte AV84carvitin ;
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
   private byte A3783BarRecLis ;
   private byte W132BarCodReo ;
   private byte AV67BarAsi ;
   private byte AV68Baraudtur ;
   private byte AV70barctrpdas ;
   private byte AV47BarTipEst ;
   private byte AV48BarGraCob ;
   private byte AV55EstReo_2 ;
   private byte AV60BarIntPer ;
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
   private byte A188BarNotLin ;
   private byte W188BarNotLin ;
   private byte A11104Nof_r ;
   private byte A11709Nof_nc ;
   private byte A11129Nof_cct ;
   private byte A11128Nof_ccp ;
   private byte W11104Nof_r ;
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
   private short A11169Nof_Lbtp ;
   private short A11145Nof_rboc ;
   private short A840TrnCod ;
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
   private int AV83BarMaccod ;
   private int GX_INS12 ;
   private int W934BarReoCod ;
   private int W361DisCod ;
   private int W3595BarMacCod ;
   private int W2826BarNumLot ;
   private int AV85Barnumlot ;
   private int GX_INS17 ;
   private int A11103Nof_Hdr ;
   private int W11103Nof_Hdr ;
   private int GX_INS1483 ;
   private long A13234BarRGB ;
   private java.math.BigDecimal AV24CosPro ;
   private java.math.BigDecimal AV25CosAny ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A142BarDiaP ;
   private java.math.BigDecimal A192BarNumUni ;
   private java.math.BigDecimal A4841BarAudMCue ;
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
   private java.math.BigDecimal W169BarKgsFac ;
   private java.math.BigDecimal W141BarCosPro ;
   private java.math.BigDecimal W140BarCosAny ;
   private java.math.BigDecimal A11710Nof_enc ;
   private java.math.BigDecimal A11405Nof_humeda ;
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
   private String A1878BarNumTen ;
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
   private String A120BarAgrEst ;
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
   private String AV86Baritem2 ;
   private String AV87Baritem3 ;
   private String AV88Baritem4 ;
   private String AV89Baritem5 ;
   private String AV90Baritem6 ;
   private String W180BarMaqCod ;
   private String W137BarConPar ;
   private String W935BarReoPar ;
   private String W365DisDes ;
   private String W3310BarFac ;
   private String W4835BarAudOpeN ;
   private String W120BarAgrEst ;
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
   private String W4837BarAudSupN ;
   private String AV77Fecha_a ;
   private String Gx_time ;
   private String Gx_emsg ;
   private String A187BarNotDsc ;
   private String W187BarNotDsc ;
   private String A11108Nof_Pp ;
   private String A11107Nof_Mcot ;
   private String A11106Nof_Pd ;
   private String A11105Nof_p ;
   private String A11428Nof_obs11 ;
   private String A11427Nof_obs10 ;
   private String A11426Nof_obs9 ;
   private String A11425Nof_obs8 ;
   private String A11424Nof_obs7 ;
   private String A11423Nof_obs6 ;
   private String A11422Nof_obs5 ;
   private String A11421Nof_obs4 ;
   private String A11420Nof_obs3 ;
   private String A11419Nof_obs2 ;
   private String A11418Nof_obs1 ;
   private String A11406Nof_oekote ;
   private String A11404Nof_termom ;
   private String A11403Nof_aguam ;
   private String A11402Nof_cloro ;
   private String A11401Nof_sudor ;
   private String A11400Nof_luz ;
   private String A11399Nof_lavado ;
   private String A11398Nof_imp11 ;
   private String A11397Nof_imp10 ;
   private String A11396Nof_imp9 ;
   private String A11395Nof_imp8 ;
   private String A11394Nof_imp7 ;
   private String A11393Nof_imp6 ;
   private String A11392Nof_imp5 ;
   private String A11391Nof_imp4 ;
   private String A11390Nof_imp3 ;
   private String A11389Nof_imp2 ;
   private String A11388Nof_imp1 ;
   private String A11168Nof_Lbta ;
   private String A11167Nof_stk ;
   private String A11165Nof_sa6 ;
   private String A11164Nof_sa5 ;
   private String A11163Nof_sa4 ;
   private String A11162Nof_sa3 ;
   private String A11161Nof_sa2 ;
   private String A11160Nof_sa1 ;
   private String A11158Nof_ep10 ;
   private String A11157Nof_ep9 ;
   private String A11156Nof_ep8 ;
   private String A11155Nof_ep7 ;
   private String A11154Nof_ep6 ;
   private String A11153Nof_ep5 ;
   private String A11152Nof_ep4 ;
   private String A11151Nof_ep3 ;
   private String A11150Nof_ep2 ;
   private String A11149Nof_ep1 ;
   private String A11147Nof_rb3 ;
   private String A11146Nof_rb1 ;
   private String A11144Nof_rbp ;
   private String A11143Nof_rbe ;
   private String A11142Nof_rbi ;
   private String A11141Nof_rb ;
   private String A11139Nof_ccmc6 ;
   private String A11138Nof_ccmc5 ;
   private String A11137Nof_ccmc4 ;
   private String A11136Nof_ccmc3 ;
   private String A11135Nof_ccmc2 ;
   private String A11134Nof_ccmc1 ;
   private String A11133Nof_ccec ;
   private String A11132Nof_cccc ;
   private String A11131Nof_cctq ;
   private String A11130Nof_ccpc ;
   private String A11127Nof_cctet ;
   private String A11126Nof_ccttp ;
   private String A11125Nof_cctse ;
   private String A11123Nof_scc ;
   private String A11122Nof_scs ;
   private String A11120Nof_ct ;
   private String A11118Nof_tnc ;
   private String A11117Nof_tns ;
   private String A11115Nof_Bov ;
   private String A11114Nof_boe ;
   private String A11113Nof_bob ;
   private String A11112Nof_bo ;
   private String A11109Nof_Ag ;
   private String W11105Nof_p ;
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
   private boolean n4841BarAudMCue ;
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
   private boolean n11108Nof_Pp ;
   private boolean n11107Nof_Mcot ;
   private boolean n11106Nof_Pd ;
   private boolean n11710Nof_enc ;
   private boolean n11709Nof_nc ;
   private boolean n11428Nof_obs11 ;
   private boolean n11427Nof_obs10 ;
   private boolean n11426Nof_obs9 ;
   private boolean n11425Nof_obs8 ;
   private boolean n11424Nof_obs7 ;
   private boolean n11423Nof_obs6 ;
   private boolean n11422Nof_obs5 ;
   private boolean n11421Nof_obs4 ;
   private boolean n11420Nof_obs3 ;
   private boolean n11419Nof_obs2 ;
   private boolean n11418Nof_obs1 ;
   private boolean n11406Nof_oekote ;
   private boolean n11405Nof_humeda ;
   private boolean n11404Nof_termom ;
   private boolean n11403Nof_aguam ;
   private boolean n11402Nof_cloro ;
   private boolean n11401Nof_sudor ;
   private boolean n11400Nof_luz ;
   private boolean n11399Nof_lavado ;
   private boolean n11398Nof_imp11 ;
   private boolean n11397Nof_imp10 ;
   private boolean n11396Nof_imp9 ;
   private boolean n11395Nof_imp8 ;
   private boolean n11394Nof_imp7 ;
   private boolean n11393Nof_imp6 ;
   private boolean n11392Nof_imp5 ;
   private boolean n11391Nof_imp4 ;
   private boolean n11390Nof_imp3 ;
   private boolean n11389Nof_imp2 ;
   private boolean n11388Nof_imp1 ;
   private boolean n11171Nof_c12 ;
   private boolean n11170Nof_c11 ;
   private boolean n11169Nof_Lbtp ;
   private boolean n11168Nof_Lbta ;
   private boolean n11167Nof_stk ;
   private boolean n11166Nof_c10 ;
   private boolean n11165Nof_sa6 ;
   private boolean n11164Nof_sa5 ;
   private boolean n11163Nof_sa4 ;
   private boolean n11162Nof_sa3 ;
   private boolean n11161Nof_sa2 ;
   private boolean n11160Nof_sa1 ;
   private boolean n11159Nof_c9 ;
   private boolean n11158Nof_ep10 ;
   private boolean n11157Nof_ep9 ;
   private boolean n11156Nof_ep8 ;
   private boolean n11155Nof_ep7 ;
   private boolean n11154Nof_ep6 ;
   private boolean n11153Nof_ep5 ;
   private boolean n11152Nof_ep4 ;
   private boolean n11151Nof_ep3 ;
   private boolean n11150Nof_ep2 ;
   private boolean n11149Nof_ep1 ;
   private boolean n11148Nof_c8 ;
   private boolean n11147Nof_rb3 ;
   private boolean n11146Nof_rb1 ;
   private boolean n11145Nof_rboc ;
   private boolean n11144Nof_rbp ;
   private boolean n11143Nof_rbe ;
   private boolean n11142Nof_rbi ;
   private boolean n11141Nof_rb ;
   private boolean n11140Nof_c7 ;
   private boolean n11139Nof_ccmc6 ;
   private boolean n11138Nof_ccmc5 ;
   private boolean n11137Nof_ccmc4 ;
   private boolean n11136Nof_ccmc3 ;
   private boolean n11135Nof_ccmc2 ;
   private boolean n11134Nof_ccmc1 ;
   private boolean n11133Nof_ccec ;
   private boolean n11132Nof_cccc ;
   private boolean n11131Nof_cctq ;
   private boolean n11130Nof_ccpc ;
   private boolean n11129Nof_cct ;
   private boolean n11128Nof_ccp ;
   private boolean n11127Nof_cctet ;
   private boolean n11126Nof_ccttp ;
   private boolean n11125Nof_cctse ;
   private boolean n11124Nof_c6 ;
   private boolean n11123Nof_scc ;
   private boolean n11122Nof_scs ;
   private boolean n11121Nof_c5 ;
   private boolean n11120Nof_ct ;
   private boolean n11119Nof_c4 ;
   private boolean n11118Nof_tnc ;
   private boolean n11117Nof_tns ;
   private boolean n11116Nof_c3 ;
   private boolean n11115Nof_Bov ;
   private boolean n11114Nof_boe ;
   private boolean n11113Nof_bob ;
   private boolean n11112Nof_bo ;
   private boolean n11111Nof_c2 ;
   private boolean n11110Nof_c1 ;
   private boolean n840TrnCod ;
   private boolean n11109Nof_Ag ;
   private String A4845BarAudObs ;
   private String A14329BarCnoEncO ;
   private String A13907BarSerDsc2 ;
   private String A11662BarOrdComp ;
   private String A11171Nof_c12 ;
   private String A11170Nof_c11 ;
   private String A11166Nof_c10 ;
   private String A11159Nof_c9 ;
   private String A11148Nof_c8 ;
   private String A11140Nof_c7 ;
   private String A11124Nof_c6 ;
   private String A11121Nof_c5 ;
   private String A11119Nof_c4 ;
   private String A11116Nof_c3 ;
   private String A11111Nof_c2 ;
   private String A11110Nof_c1 ;
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
   private String[] P009I2_A1878BarNumTen ;
   private byte[] P009I2_A1832BarLisInd ;
   private String[] P009I2_A1652BarSerDsc ;
   private short[] P009I2_A1503BarPart ;
   private String[] P009I2_A1431BarLocDis ;
   private byte[] P009I2_A1254BarPesBal ;
   private int[] P009I2_A1235BarNumCli ;
   private String[] P009I2_A1234BarNomCli ;
   private short[] P009I2_A1226BarGraCru ;
   private java.math.BigDecimal[] P009I2_A1224BarEncAnh ;
   private java.math.BigDecimal[] P009I2_A1223BarEncCom ;
   private short[] P009I2_A921BarMatiz ;
   private java.util.Date[] P009I2_A1003BarFecLan ;
   private boolean[] P009I2_n1003BarFecLan ;
   private byte[] P009I2_A905ObsReoULin ;
   private boolean[] P009I2_n905ObsReoULin ;
   private String[] P009I2_A904ObsReoEnt ;
   private boolean[] P009I2_n904ObsReoEnt ;
   private short[] P009I2_A864BarPes ;
   private byte[] P009I2_A646NotUltLin ;
   private boolean[] P009I2_n646NotUltLin ;
   private int[] P009I2_A144BarDisOri ;
   private byte[] P009I2_A190BarNumAso ;
   private byte[] P009I2_A149BarEstRes ;
   private byte[] P009I2_A147BarEstCol ;
   private java.util.Date[] P009I2_A158BarFecFpr ;
   private int[] P009I2_A163BarHorCum ;
   private String[] P009I2_A209BarPri ;
   private String[] P009I2_A145BarEncOri ;
   private String[] P009I2_A139BarCorOri ;
   private String[] P009I2_A214BarSua ;
   private String[] P009I2_A177BarLar ;
   private String[] P009I2_A206BarPle ;
   private short[] P009I2_A126BarAncAca2 ;
   private short[] P009I2_A125BarAncAca1 ;
   private short[] P009I2_A128BarAncCru2 ;
   private short[] P009I2_A127BarAncCru1 ;
   private short[] P009I2_A234BarUrdP3 ;
   private String[] P009I2_A231BarUrd3 ;
   private short[] P009I2_A233BarUrdP2 ;
   private String[] P009I2_A230BarUrd2 ;
   private short[] P009I2_A232BarUrdP1 ;
   private String[] P009I2_A229BarUrd1 ;
   private short[] P009I2_A226BarTraP3 ;
   private String[] P009I2_A223BarTra3 ;
   private short[] P009I2_A225BarTraP2 ;
   private String[] P009I2_A222BarTra2 ;
   private short[] P009I2_A224BarTraP1 ;
   private String[] P009I2_A221BarTra1 ;
   private java.math.BigDecimal[] P009I2_A211BarRdt ;
   private String[] P009I2_A182BarMat ;
   private java.math.BigDecimal[] P009I2_A142BarDiaP ;
   private byte[] P009I2_A235BarUrg ;
   private java.util.Date[] P009I2_A161BarFecSal ;
   private String[] P009I2_A181BarMaqPro ;
   private java.util.Date[] P009I2_A157BarFecEnt ;
   private byte[] P009I2_A196BarOrdReo ;
   private short[] P009I2_A191BarNumPie ;
   private java.util.Date[] P009I2_A155BarFecCli ;
   private String[] P009I2_A228BarUniMed ;
   private java.math.BigDecimal[] P009I2_A192BarNumUni ;
   private byte[] P009I2_A218BarTipCol ;
   private int[] P009I2_A136BarColNum ;
   private String[] P009I2_A135BarColNom ;
   private short[] P009I2_A217BarTipArt ;
   private boolean[] P009I2_n217BarTipArt ;
   private String[] P009I2_A212BarSer ;
   private String[] P009I2_A143BarDisNum ;
   private int[] P009I2_A236BarVolMaq ;
   private java.math.BigDecimal[] P009I2_A4841BarAudMCue ;
   private boolean[] P009I2_n4841BarAudMCue ;
   private java.math.BigDecimal[] P009I2_A4840BarAudMDig ;
   private boolean[] P009I2_n4840BarAudMDig ;
   private short[] P009I2_A4838BarAudNPz ;
   private boolean[] P009I2_n4838BarAudNPz ;
   private int[] P009I2_A4834BarAudOpe ;
   private boolean[] P009I2_n4834BarAudOpe ;
   private java.util.Date[] P009I2_A4832BarAudFec ;
   private boolean[] P009I2_n4832BarAudFec ;
   private int[] P009I2_A8568EntSecUlt ;
   private boolean[] P009I2_n8568EntSecUlt ;
   private int[] P009I2_A8098BarOpeHis ;
   private java.util.Date[] P009I2_A8097BarFecHis ;
   private String[] P009I2_A7733BarMaqEst ;
   private String[] P009I2_A5406BarAntpT ;
   private String[] P009I2_A5367BarAntp ;
   private String[] P009I2_A5293BarCodBan ;
   private java.math.BigDecimal[] P009I2_A5057BarFacAbs ;
   private boolean[] P009I2_n5057BarFacAbs ;
   private short[] P009I2_A5056BarBp15 ;
   private boolean[] P009I2_n5056BarBp15 ;
   private java.math.BigDecimal[] P009I2_A5055BarBp14 ;
   private boolean[] P009I2_n5055BarBp14 ;
   private short[] P009I2_A5054BarBp13 ;
   private boolean[] P009I2_n5054BarBp13 ;
   private String[] P009I2_A5009BarLoteA ;
   private short[] P009I2_A4975BarNumReo ;
   private String[] P009I2_A4908BarMacPro ;
   private String[] P009I2_A4845BarAudObs ;
   private boolean[] P009I2_n4845BarAudObs ;
   private int[] P009I2_A4836BarAudSup ;
   private String[] P009I2_A4812BarEncCli ;
   private java.util.Date[] P009I2_A4613BarHorReg ;
   private boolean[] P009I2_n4613BarHorReg ;
   private int[] P009I2_A4612BarPzas ;
   private boolean[] P009I2_n4612BarPzas ;
   private java.util.Date[] P009I2_A4611BarHorEnt ;
   private boolean[] P009I2_n4611BarHorEnt ;
   private String[] P009I2_A4610BarTam ;
   private String[] P009I2_A4467BarAcaMar ;
   private short[] P009I2_A4466BarAcaAnh ;
   private String[] P009I2_A4465BarAcaBak ;
   private boolean[] P009I2_n4465BarAcaBak ;
   private int[] P009I2_A4464BarAcaFor ;
   private boolean[] P009I2_n4464BarAcaFor ;
   private String[] P009I2_A4463BarLotMaq ;
   private boolean[] P009I2_n4463BarLotMaq ;
   private java.math.BigDecimal[] P009I2_A4462BarLotKgs ;
   private java.math.BigDecimal[] P009I2_A4461BarLotMts ;
   private short[] P009I2_A4460BarLotPza ;
   private boolean[] P009I2_n4460BarLotPza ;
   private String[] P009I2_A4459BarCruEnr ;
   private java.math.BigDecimal[] P009I2_A4458BarCruKgs ;
   private boolean[] P009I2_n4458BarCruKgs ;
   private java.math.BigDecimal[] P009I2_A4457BarCruMts ;
   private boolean[] P009I2_n4457BarCruMts ;
   private short[] P009I2_A4456BarPelAnh ;
   private byte[] P009I2_A4400BarSitEst ;
   private byte[] P009I2_A4017BarInci ;
   private String[] P009I2_A4016BarTin ;
   private byte[] P009I2_A4015BarEnv ;
   private byte[] P009I2_A2512BarComULin ;
   private boolean[] P009I2_n2512BarComULin ;
   private int[] P009I2_A1799BarDibInt ;
   private String[] P009I2_A1798BarDibCli ;
   private java.util.Date[] P009I2_A3871BarFecCRe ;
   private java.util.Date[] P009I2_A3870BarFecLRe ;
   private String[] P009I2_A3787BarEnvRec ;
   private boolean[] P009I2_n3787BarEnvRec ;
   private String[] P009I2_A3746BarNPed ;
   private String[] P009I2_A3745BarFoa ;
   private String[] P009I2_A3313BarNumTon ;
   private short[] P009I2_A3138BarGraCru2 ;
   private short[] P009I2_A3137BarGraAca2 ;
   private short[] P009I2_A3136BarAncSal3 ;
   private short[] P009I2_A3135BarAncSal2 ;
   private short[] P009I2_A3134BarAncSal1 ;
   private short[] P009I2_A3133BarNumCor ;
   private String[] P009I2_A2836BarPle2 ;
   private String[] P009I2_A3030BarPlf ;
   private java.math.BigDecimal[] P009I2_A3006BarCoef ;
   private boolean[] P009I2_n3006BarCoef ;
   private String[] P009I2_A2829BarProPer ;
   private java.math.BigDecimal[] P009I2_A2828BarMtrLot ;
   private java.math.BigDecimal[] P009I2_A2827BarKgsLot ;
   private short[] P009I2_A2803UltLinMaq ;
   private boolean[] P009I2_n2803UltLinMaq ;
   private String[] P009I2_A2759BarMaqGru ;
   private byte[] P009I2_A2754BarSitExt ;
   private short[] P009I2_A2753BarNumTex2 ;
   private boolean[] P009I2_n2753BarNumTex2 ;
   private String[] P009I2_A2746BarCodTex ;
   private boolean[] P009I2_n2746BarCodTex ;
   private int[] P009I2_A2487BarConEle ;
   private int[] P009I2_A2488BarConVap ;
   private int[] P009I2_A2486BarConAgu ;
   private java.util.Date[] P009I2_A2496BarFecFin ;
   private java.util.Date[] P009I2_A2497BarFecIni ;
   private String[] P009I2_A2500BarRDos2 ;
   private String[] P009I2_A2499BarRDos1 ;
   private String[] P009I2_A2498BarPrdPes ;
   private String[] P009I2_A2485BarColPes ;
   private java.math.BigDecimal[] P009I2_A1911BarRdoA ;
   private java.math.BigDecimal[] P009I2_A1910BarRdoN ;
   private short[] P009I2_A1909BarGraAca ;
   private short[] P009I2_A2458BarObsVL ;
   private boolean[] P009I2_n2458BarObsVL ;
   private String[] P009I2_A2453BarEntAca ;
   private boolean[] P009I2_n2453BarEntAca ;
   private String[] P009I2_A2452BarCal ;
   private boolean[] P009I2_n2452BarCal ;
   private short[] P009I2_A2459BarTemSec ;
   private short[] P009I2_A2455BarNMont ;
   private boolean[] P009I2_n2455BarNMont ;
   private String[] P009I2_A2454BarGirar ;
   private String[] P009I2_A2460BarTipAca ;
   private java.math.BigDecimal[] P009I2_A2450BarKgEnR ;
   private boolean[] P009I2_n2450BarKgEnR ;
   private short[] P009I2_A2443BarBulEnR ;
   private boolean[] P009I2_n2443BarBulEnR ;
   private java.util.Date[] P009I2_A2448BarFecEnR ;
   private boolean[] P009I2_n2448BarFecEnR ;
   private short[] P009I2_A2446BarEnULin ;
   private boolean[] P009I2_n2446BarEnULin ;
   private String[] P009I2_A2445BarEntEnE ;
   private java.math.BigDecimal[] P009I2_A2449BarKgEnE ;
   private boolean[] P009I2_n2449BarKgEnE ;
   private short[] P009I2_A2442BarBulEnE ;
   private boolean[] P009I2_n2442BarBulEnE ;
   private java.util.Date[] P009I2_A2447BarFecEnE ;
   private byte[] P009I2_A2401BarNumPas ;
   private boolean[] P009I2_n2401BarNumPas ;
   private int[] P009I2_A2311BarCliDes ;
   private byte[] P009I2_A2265BarExt ;
   private boolean[] P009I2_n2265BarExt ;
   private String[] P009I2_A2010BarTipDis ;
   private int[] P009I2_A1923BarCodTN ;
   private String[] P009I2_A396EmprCod ;
   private String[] P009I2_A365DisDes ;
   private String[] P009I2_A5058BarEnvLaw ;
   private byte[] P009I2_A3594BarPriTin ;
   private String[] P009I2_A4837BarAudSupN ;
   private boolean[] P009I2_n4837BarAudSupN ;
   private String[] P009I2_A4835BarAudOpeN ;
   private boolean[] P009I2_n4835BarAudOpeN ;
   private byte[] P009I2_A4833BarAudTur ;
   private boolean[] P009I2_n4833BarAudTur ;
   private String[] P009I2_A9790BarItem6 ;
   private String[] P009I2_A9789BarItem5 ;
   private String[] P009I2_A9778BarItem4 ;
   private String[] P009I2_A9777BarItem3 ;
   private String[] P009I2_A9776barItem2 ;
   private String[] P009I2_A9775BarItem1 ;
   private byte[] P009I2_A6434BarAsi ;
   private String[] P009I2_A5352BarObsAnc ;
   private String[] P009I2_A5351BarObsGrm ;
   private String[] P009I2_A5291BarTipCor ;
   private String[] P009I2_A5253BarAcc ;
   private short[] P009I2_A5053BarBp12 ;
   private boolean[] P009I2_n5053BarBp12 ;
   private String[] P009I2_A5034BarEstTip ;
   private String[] P009I2_A5033BarCom ;
   private byte[] P009I2_A5027BarGraCob ;
   private byte[] P009I2_A5026BarTipEst ;
   private byte[] P009I2_A4937BarCtrPdas ;
   private boolean[] P009I2_n4937BarCtrPdas ;
   private String[] P009I2_A4716BarDishCod ;
   private String[] P009I2_A4609BarMdlCod ;
   private String[] P009I2_A4018BarBot ;
   private String[] P009I2_A3744BarPeg ;
   private int[] P009I2_A3595BarMacCod ;
   private short[] P009I2_A3312BarManCod2 ;
   private short[] P009I2_A3311BarManCod1 ;
   private String[] P009I2_A3310BarFac ;
   private byte[] P009I2_A2830BarIntPer ;
   private int[] P009I2_A2826BarNumLot ;
   private byte[] P009I2_A2752BarNumTex1 ;
   private short[] P009I2_A2400BarManCod ;
   private String[] P009I2_A1499BarNMez ;
   private String[] P009I2_A1500BarNMtr ;
   private String[] P009I2_A935BarReoPar ;
   private byte[] P009I2_A936BarReoReo ;
   private int[] P009I2_A934BarReoCod ;
   private short[] P009I2_A899TipDefPor ;
   private boolean[] P009I2_n899TipDefPor ;
   private short[] P009I2_A833TipDefCod ;
   private boolean[] P009I2_n833TipDefCod ;
   private byte[] P009I2_A178BarLis ;
   private java.math.BigDecimal[] P009I2_A169BarKgsFac ;
   private java.math.BigDecimal[] P009I2_A140BarCosAny ;
   private java.math.BigDecimal[] P009I2_A141BarCosPro ;
   private short[] P009I2_A189BarNumAny ;
   private String[] P009I2_A137BarConPar ;
   private byte[] P009I2_A138BarConReo ;
   private byte[] P009I2_A213BarSit ;
   private byte[] P009I2_A146BarEst ;
   private String[] P009I2_A118BarAcaQui ;
   private byte[] P009I2_A193BarOpeEsp ;
   private byte[] P009I2_A148BarEstReo ;
   private java.util.Date[] P009I2_A159BarFecGen ;
   private int[] P009I2_A361DisCod ;
   private String[] P009I2_A180BarMaqCod ;
   private String[] P009I2_A120BarAgrEst ;
   private String[] P009I2_A130BarCodPar ;
   private byte[] P009I2_A132BarCodReo ;
   private int[] P009I2_A129BarCod ;
   private int[] P009I2_A252CliCod ;
   private boolean[] P009I2_n252CliCod ;
   private byte[] P009I2_A14330BarPriorid ;
   private String[] P009I2_A14329BarCnoEncO ;
   private String[] P009I2_A13908BarIdtx2 ;
   private boolean[] P009I2_n13908BarIdtx2 ;
   private String[] P009I2_A13907BarSerDsc2 ;
   private boolean[] P009I2_n13907BarSerDsc2 ;
   private short[] P009I2_A13769BarRdto4 ;
   private boolean[] P009I2_n13769BarRdto4 ;
   private long[] P009I2_A13234BarRGB ;
   private byte[] P009I2_A13092BarDGUltLi ;
   private boolean[] P009I2_n13092BarDGUltLi ;
   private String[] P009I2_A13077BarLinPrd ;
   private int[] P009I2_A13071BarCanalID ;
   private short[] P009I2_A13070BarLineaID ;
   private String[] P009I2_A12881BarOEKOTEX ;
   private boolean[] P009I2_n12881BarOEKOTEX ;
   private String[] P009I2_A12811BarLocCol ;
   private String[] P009I2_A12810BarLocMol ;
   private String[] P009I2_A12809BarLocTel ;
   private String[] P009I2_A12774BarProdID ;
   private byte[] P009I2_A12767BarTpEstam ;
   private String[] P009I2_A12329SubRevID ;
   private boolean[] P009I2_n12329SubRevID ;
   private short[] P009I2_A11857Nxt_desaID ;
   private boolean[] P009I2_n11857Nxt_desaID ;
   private short[] P009I2_A11855Nxt_dpoID ;
   private boolean[] P009I2_n11855Nxt_dpoID ;
   private short[] P009I2_A11853Nxt_cpeID ;
   private boolean[] P009I2_n11853Nxt_cpeID ;
   private String[] P009I2_A11852Nxt_ArtCl2 ;
   private String[] P009I2_A11851Nxt_Sta2 ;
   private String[] P009I2_A11850Nxt_Mdlo2 ;
   private java.math.BigDecimal[] P009I2_A3736BarPieMtl ;
   private java.math.BigDecimal[] P009I2_A3735BarPieKgl ;
   private short[] P009I2_A3363BarPiePrv ;
   private java.math.BigDecimal[] P009I2_A3362BarMtsPrv ;
   private java.math.BigDecimal[] P009I2_A3361BarKgsPrv ;
   private String[] P009I2_A3786BarEnvBar ;
   private short[] P009I2_A3785BarUltAny ;
   private short[] P009I2_A3784BarAnyTie ;
   private byte[] P009I2_A3783BarRecLis ;
   private java.math.BigDecimal[] P009I2_A3780BarKilLam ;
   private int[] P009I2_A3597BarVolAma ;
   private String[] P009I2_A3596BarMaqAma ;
   private String[] P009I2_A11662BarOrdComp ;
   private short[] P009I2_A4844BarAudULin ;
   private boolean[] P009I2_n4844BarAudULin ;
   private String[] P009I4_A396EmprCod ;
   private String[] P009I4_A130BarCodPar ;
   private byte[] P009I4_A132BarCodReo ;
   private int[] P009I4_A129BarCod ;
   private String[] P009I4_A187BarNotDsc ;
   private byte[] P009I4_A188BarNotLin ;
   private String[] P009I6_A11108Nof_Pp ;
   private boolean[] P009I6_n11108Nof_Pp ;
   private String[] P009I6_A11107Nof_Mcot ;
   private boolean[] P009I6_n11107Nof_Mcot ;
   private String[] P009I6_A11106Nof_Pd ;
   private boolean[] P009I6_n11106Nof_Pd ;
   private String[] P009I6_A396EmprCod ;
   private String[] P009I6_A11105Nof_p ;
   private byte[] P009I6_A11104Nof_r ;
   private int[] P009I6_A11103Nof_Hdr ;
   private java.math.BigDecimal[] P009I6_A11710Nof_enc ;
   private boolean[] P009I6_n11710Nof_enc ;
   private byte[] P009I6_A11709Nof_nc ;
   private boolean[] P009I6_n11709Nof_nc ;
   private String[] P009I6_A11428Nof_obs11 ;
   private boolean[] P009I6_n11428Nof_obs11 ;
   private String[] P009I6_A11427Nof_obs10 ;
   private boolean[] P009I6_n11427Nof_obs10 ;
   private String[] P009I6_A11426Nof_obs9 ;
   private boolean[] P009I6_n11426Nof_obs9 ;
   private String[] P009I6_A11425Nof_obs8 ;
   private boolean[] P009I6_n11425Nof_obs8 ;
   private String[] P009I6_A11424Nof_obs7 ;
   private boolean[] P009I6_n11424Nof_obs7 ;
   private String[] P009I6_A11423Nof_obs6 ;
   private boolean[] P009I6_n11423Nof_obs6 ;
   private String[] P009I6_A11422Nof_obs5 ;
   private boolean[] P009I6_n11422Nof_obs5 ;
   private String[] P009I6_A11421Nof_obs4 ;
   private boolean[] P009I6_n11421Nof_obs4 ;
   private String[] P009I6_A11420Nof_obs3 ;
   private boolean[] P009I6_n11420Nof_obs3 ;
   private String[] P009I6_A11419Nof_obs2 ;
   private boolean[] P009I6_n11419Nof_obs2 ;
   private String[] P009I6_A11418Nof_obs1 ;
   private boolean[] P009I6_n11418Nof_obs1 ;
   private String[] P009I6_A11406Nof_oekote ;
   private boolean[] P009I6_n11406Nof_oekote ;
   private java.math.BigDecimal[] P009I6_A11405Nof_humeda ;
   private boolean[] P009I6_n11405Nof_humeda ;
   private String[] P009I6_A11404Nof_termom ;
   private boolean[] P009I6_n11404Nof_termom ;
   private String[] P009I6_A11403Nof_aguam ;
   private boolean[] P009I6_n11403Nof_aguam ;
   private String[] P009I6_A11402Nof_cloro ;
   private boolean[] P009I6_n11402Nof_cloro ;
   private String[] P009I6_A11401Nof_sudor ;
   private boolean[] P009I6_n11401Nof_sudor ;
   private String[] P009I6_A11400Nof_luz ;
   private boolean[] P009I6_n11400Nof_luz ;
   private String[] P009I6_A11399Nof_lavado ;
   private boolean[] P009I6_n11399Nof_lavado ;
   private String[] P009I6_A11398Nof_imp11 ;
   private boolean[] P009I6_n11398Nof_imp11 ;
   private String[] P009I6_A11397Nof_imp10 ;
   private boolean[] P009I6_n11397Nof_imp10 ;
   private String[] P009I6_A11396Nof_imp9 ;
   private boolean[] P009I6_n11396Nof_imp9 ;
   private String[] P009I6_A11395Nof_imp8 ;
   private boolean[] P009I6_n11395Nof_imp8 ;
   private String[] P009I6_A11394Nof_imp7 ;
   private boolean[] P009I6_n11394Nof_imp7 ;
   private String[] P009I6_A11393Nof_imp6 ;
   private boolean[] P009I6_n11393Nof_imp6 ;
   private String[] P009I6_A11392Nof_imp5 ;
   private boolean[] P009I6_n11392Nof_imp5 ;
   private String[] P009I6_A11391Nof_imp4 ;
   private boolean[] P009I6_n11391Nof_imp4 ;
   private String[] P009I6_A11390Nof_imp3 ;
   private boolean[] P009I6_n11390Nof_imp3 ;
   private String[] P009I6_A11389Nof_imp2 ;
   private boolean[] P009I6_n11389Nof_imp2 ;
   private String[] P009I6_A11388Nof_imp1 ;
   private boolean[] P009I6_n11388Nof_imp1 ;
   private String[] P009I6_A11171Nof_c12 ;
   private boolean[] P009I6_n11171Nof_c12 ;
   private String[] P009I6_A11170Nof_c11 ;
   private boolean[] P009I6_n11170Nof_c11 ;
   private short[] P009I6_A11169Nof_Lbtp ;
   private boolean[] P009I6_n11169Nof_Lbtp ;
   private String[] P009I6_A11168Nof_Lbta ;
   private boolean[] P009I6_n11168Nof_Lbta ;
   private String[] P009I6_A11167Nof_stk ;
   private boolean[] P009I6_n11167Nof_stk ;
   private String[] P009I6_A11166Nof_c10 ;
   private boolean[] P009I6_n11166Nof_c10 ;
   private String[] P009I6_A11165Nof_sa6 ;
   private boolean[] P009I6_n11165Nof_sa6 ;
   private String[] P009I6_A11164Nof_sa5 ;
   private boolean[] P009I6_n11164Nof_sa5 ;
   private String[] P009I6_A11163Nof_sa4 ;
   private boolean[] P009I6_n11163Nof_sa4 ;
   private String[] P009I6_A11162Nof_sa3 ;
   private boolean[] P009I6_n11162Nof_sa3 ;
   private String[] P009I6_A11161Nof_sa2 ;
   private boolean[] P009I6_n11161Nof_sa2 ;
   private String[] P009I6_A11160Nof_sa1 ;
   private boolean[] P009I6_n11160Nof_sa1 ;
   private String[] P009I6_A11159Nof_c9 ;
   private boolean[] P009I6_n11159Nof_c9 ;
   private String[] P009I6_A11158Nof_ep10 ;
   private boolean[] P009I6_n11158Nof_ep10 ;
   private String[] P009I6_A11157Nof_ep9 ;
   private boolean[] P009I6_n11157Nof_ep9 ;
   private String[] P009I6_A11156Nof_ep8 ;
   private boolean[] P009I6_n11156Nof_ep8 ;
   private String[] P009I6_A11155Nof_ep7 ;
   private boolean[] P009I6_n11155Nof_ep7 ;
   private String[] P009I6_A11154Nof_ep6 ;
   private boolean[] P009I6_n11154Nof_ep6 ;
   private String[] P009I6_A11153Nof_ep5 ;
   private boolean[] P009I6_n11153Nof_ep5 ;
   private String[] P009I6_A11152Nof_ep4 ;
   private boolean[] P009I6_n11152Nof_ep4 ;
   private String[] P009I6_A11151Nof_ep3 ;
   private boolean[] P009I6_n11151Nof_ep3 ;
   private String[] P009I6_A11150Nof_ep2 ;
   private boolean[] P009I6_n11150Nof_ep2 ;
   private String[] P009I6_A11149Nof_ep1 ;
   private boolean[] P009I6_n11149Nof_ep1 ;
   private String[] P009I6_A11148Nof_c8 ;
   private boolean[] P009I6_n11148Nof_c8 ;
   private String[] P009I6_A11147Nof_rb3 ;
   private boolean[] P009I6_n11147Nof_rb3 ;
   private String[] P009I6_A11146Nof_rb1 ;
   private boolean[] P009I6_n11146Nof_rb1 ;
   private short[] P009I6_A11145Nof_rboc ;
   private boolean[] P009I6_n11145Nof_rboc ;
   private String[] P009I6_A11144Nof_rbp ;
   private boolean[] P009I6_n11144Nof_rbp ;
   private String[] P009I6_A11143Nof_rbe ;
   private boolean[] P009I6_n11143Nof_rbe ;
   private String[] P009I6_A11142Nof_rbi ;
   private boolean[] P009I6_n11142Nof_rbi ;
   private String[] P009I6_A11141Nof_rb ;
   private boolean[] P009I6_n11141Nof_rb ;
   private String[] P009I6_A11140Nof_c7 ;
   private boolean[] P009I6_n11140Nof_c7 ;
   private String[] P009I6_A11139Nof_ccmc6 ;
   private boolean[] P009I6_n11139Nof_ccmc6 ;
   private String[] P009I6_A11138Nof_ccmc5 ;
   private boolean[] P009I6_n11138Nof_ccmc5 ;
   private String[] P009I6_A11137Nof_ccmc4 ;
   private boolean[] P009I6_n11137Nof_ccmc4 ;
   private String[] P009I6_A11136Nof_ccmc3 ;
   private boolean[] P009I6_n11136Nof_ccmc3 ;
   private String[] P009I6_A11135Nof_ccmc2 ;
   private boolean[] P009I6_n11135Nof_ccmc2 ;
   private String[] P009I6_A11134Nof_ccmc1 ;
   private boolean[] P009I6_n11134Nof_ccmc1 ;
   private String[] P009I6_A11133Nof_ccec ;
   private boolean[] P009I6_n11133Nof_ccec ;
   private String[] P009I6_A11132Nof_cccc ;
   private boolean[] P009I6_n11132Nof_cccc ;
   private String[] P009I6_A11131Nof_cctq ;
   private boolean[] P009I6_n11131Nof_cctq ;
   private String[] P009I6_A11130Nof_ccpc ;
   private boolean[] P009I6_n11130Nof_ccpc ;
   private byte[] P009I6_A11129Nof_cct ;
   private boolean[] P009I6_n11129Nof_cct ;
   private byte[] P009I6_A11128Nof_ccp ;
   private boolean[] P009I6_n11128Nof_ccp ;
   private String[] P009I6_A11127Nof_cctet ;
   private boolean[] P009I6_n11127Nof_cctet ;
   private String[] P009I6_A11126Nof_ccttp ;
   private boolean[] P009I6_n11126Nof_ccttp ;
   private String[] P009I6_A11125Nof_cctse ;
   private boolean[] P009I6_n11125Nof_cctse ;
   private String[] P009I6_A11124Nof_c6 ;
   private boolean[] P009I6_n11124Nof_c6 ;
   private String[] P009I6_A11123Nof_scc ;
   private boolean[] P009I6_n11123Nof_scc ;
   private String[] P009I6_A11122Nof_scs ;
   private boolean[] P009I6_n11122Nof_scs ;
   private String[] P009I6_A11121Nof_c5 ;
   private boolean[] P009I6_n11121Nof_c5 ;
   private String[] P009I6_A11120Nof_ct ;
   private boolean[] P009I6_n11120Nof_ct ;
   private String[] P009I6_A11119Nof_c4 ;
   private boolean[] P009I6_n11119Nof_c4 ;
   private String[] P009I6_A11118Nof_tnc ;
   private boolean[] P009I6_n11118Nof_tnc ;
   private String[] P009I6_A11117Nof_tns ;
   private boolean[] P009I6_n11117Nof_tns ;
   private String[] P009I6_A11116Nof_c3 ;
   private boolean[] P009I6_n11116Nof_c3 ;
   private String[] P009I6_A11115Nof_Bov ;
   private boolean[] P009I6_n11115Nof_Bov ;
   private String[] P009I6_A11114Nof_boe ;
   private boolean[] P009I6_n11114Nof_boe ;
   private String[] P009I6_A11113Nof_bob ;
   private boolean[] P009I6_n11113Nof_bob ;
   private String[] P009I6_A11112Nof_bo ;
   private boolean[] P009I6_n11112Nof_bo ;
   private String[] P009I6_A11111Nof_c2 ;
   private boolean[] P009I6_n11111Nof_c2 ;
   private String[] P009I6_A11110Nof_c1 ;
   private boolean[] P009I6_n11110Nof_c1 ;
   private short[] P009I6_A840TrnCod ;
   private boolean[] P009I6_n840TrnCod ;
   private String[] P009I6_A11109Nof_Ag ;
   private boolean[] P009I6_n11109Nof_Ag ;
}

final  class pnuebar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P009I2", "SELECT BarNumTen, BarLisInd, BarSerDsc, BarPart, BarLocDis, BarPesBal, BarNumCli, BarNomCli, BarGraCru, BarEncAnh, BarEncCom, BarMatiz, BarFecLan, ObsReoULin, ObsReoEnt, BarPes, NotUltLin, BarDisOri, BarNumAso, BarEstRes, BarEstCol, BarFecFpr, BarHorCum, BarPri, BarEncOri, BarCorOri, BarSua, BarLar, BarPle, BarAncAca2, BarAncAca1, BarAncCru2, BarAncCru1, BarUrdP3, BarUrd3, BarUrdP2, BarUrd2, BarUrdP1, BarUrd1, BarTraP3, BarTra3, BarTraP2, BarTra2, BarTraP1, BarTra1, BarRdt, BarMat, BarDiaP, BarUrg, BarFecSal, BarMaqPro, BarFecEnt, BarOrdReo, BarNumPie, BarFecCli, BarUniMed, BarNumUni, BarTipCol, BarColNum, BarColNom, BarTipArt, BarSer, BarDisNum, BarVolMaq, BarAudMCue, BarAudMDig, BarAudNPz, BarAudOpe, BarAudFec, EntSecUlt, BarOpeHis, BarFecHis, BarMaqEst, BarAntpT, BarAntp, BarCodBan, BarFacAbs, BarBp15, BarBp14, BarBp13, BarLoteA, BarNumReo, BarMacPro, BarAudObs, BarAudSup, BarEncCli, BarHorReg, BarPzas, BarHorEnt, BarTam, BarAcaMar, BarAcaAnh, BarAcaBak, BarAcaFor, BarLotMaq, BarLotKgs, BarLotMts, BarLotPza, BarCruEnr, BarCruKgs, BarCruMts, BarPelAnh, BarSitEst, BarInci, BarTin, BarEnv, BarComULin, BarDibInt, BarDibCli, BarFecCRe, BarFecLRe, BarEnvRec, BarNPed, BarFoa, BarNumTon, BarGraCru2, BarGraAca2, BarAncSal3, BarAncSal2, BarAncSal1, BarNumCor, BarPle2, BarPlf, BarCoef, BarProPer, BarMtrLot, BarKgsLot, UltLinMaq, BarMaqGru, BarSitExt, BarNumTex2, BarCodTex, BarConEle, BarConVap, BarConAgu, BarFecFin, BarFecIni, BarRDos2, BarRDos1, BarPrdPes, BarColPes, BarRdoA, BarRdoN, BarGraAca, BarObsVL, BarEntAca, BarCal, BarTemSec, BarNMont, BarGirar, BarTipAca, BarKgEnR, BarBulEnR, BarFecEnR, BarEnULin, BarEntEnE, BarKgEnE, BarBulEnE, BarFecEnE, BarNumPas, BarCliDes, BarExt, BarTipDis, BarCodTN, EmprCod, DisDes, BarEnvLaw, BarPriTin, BarAudSupN, BarAudOpeN, BarAudTur, BarItem6, BarItem5, BarItem4, BarItem3, barItem2, BarItem1, BarAsi, BarObsAnc, BarObsGrm, BarTipCor, BarAcc, BarBp12, BarEstTip, BarCom, BarGraCob, BarTipEst, BarCtrPdas, BarDishCod, BarMdlCod, BarBot, BarPeg, BarMacCod, BarManCod2, BarManCod1, BarFac, BarIntPer, BarNumLot, BarNumTex1, BarManCod, BarNMez, BarNMtr, BarReoPar, BarReoReo, BarReoCod, TipDefPor, TipDefCod, BarLis, BarKgsFac, BarCosAny, BarCosPro, BarNumAny, BarConPar, BarConReo, BarSit, BarEst, BarAcaQui, BarOpeEsp, BarEstReo, BarFecGen, DisCod, BarMaqCod, BarAgrEst, BarCodPar, BarCodReo, BarCod, CliCod, BarPriorid, BarCnoEncO, BarIdtx2, BarSerDsc2, BarRdto4, BarRGB, BarDGUltLi, BarLinPrd, BarCanalID, BarLineaID, BarOEKOTEX, BarLocCol, BarLocMol, BarLocTel, BarProdID, BarTpEstam, SubRevID, Nxt_desaID, Nxt_dpoID, Nxt_cpeID, Nxt_ArtCl2, Nxt_Sta2, Nxt_Mdlo2, BarPieMtl, BarPieKgl, BarPiePrv, BarMtsPrv, BarKgsPrv, BarEnvBar, BarUltAny, BarAnyTie, BarRecLis, BarKilLam, BarVolAma, BarMaqAma, BarOrdComp, BarAudULin FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P009I3", "INSERT INTO TXPBARCAD(EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst, BarMaqCod, BarVolMaq, DisCod, BarDisNum, BarSer, BarTipArt, BarColNom, BarColNum, BarTipCol, BarFecGen, BarNumUni, BarUniMed, BarEstReo, BarFecCli, BarNumPie, BarOrdReo, BarFecEnt, BarMaqPro, BarOpeEsp, BarFecSal, BarUrg, BarDiaP, BarMat, BarRdt, BarTra1, BarTraP1, BarTra2, BarTraP2, BarTra3, BarTraP3, BarUrd1, BarUrdP1, BarUrd2, BarUrdP2, BarUrd3, BarUrdP3, BarAncCru1, BarAncCru2, BarAncAca1, BarAncAca2, BarPle, BarLar, BarSua, BarAcaQui, BarCorOri, BarEncOri, BarEst, BarSit, BarPri, BarConReo, BarConPar, BarNumAny, BarCosPro, BarCosAny, BarKgsFac, BarHorCum, BarFecFpr, BarEstCol, BarEstRes, BarNumAso, BarDisOri, BarLis, NotUltLin, BarPes, TipDefCod, TipDefPor, ObsReoEnt, ObsReoULin, BarReoCod, BarReoReo, BarReoPar, BarFecLan, BarMatiz, BarEncCom, BarEncAnh, BarGraCru, BarNomCli, BarNumCli, BarPesBal, BarLocDis, BarNMtr, BarNMez, BarPart, BarSerDsc, BarLisInd, BarNumTen, BarCodTN, BarTipDis, BarExt, BarCliDes, BarManCod, BarNumPas, BarFecEnE, BarBulEnE, BarKgEnE, BarEntEnE, BarEnULin, BarFecEnR, BarBulEnR, BarKgEnR, BarTipAca, BarGirar, BarNMont, BarTemSec, BarCal, BarEntAca, BarObsVL, BarGraAca, BarRdoN, BarRdoA, BarColPes, BarPrdPes, BarRDos1, BarRDos2, BarFecIni, BarFecFin, BarConAgu, BarConVap, BarConEle, BarCodTex, BarNumTex1, BarNumTex2, BarSitExt, BarMaqGru, UltLinMaq, BarNumLot, BarKgsLot, BarMtrLot, BarProPer, BarIntPer, BarCoef, BarPlf, BarPle2, BarNumCor, BarAncSal1, BarAncSal2, BarAncSal3, BarGraAca2, BarGraCru2, BarFac, BarManCod1, BarManCod2, BarNumTon, BarMacCod, BarPeg, BarFoa, BarNPed, BarEnvRec, BarFecLRe, BarFecCRe, BarDibCli, BarDibInt, BarComULin, BarEnv, BarTin, BarInci, BarBot, BarSitEst, BarPelAnh, BarCruMts, BarCruKgs, BarCruEnr, BarLotPza, BarLotMts, BarLotKgs, BarLotMaq, BarAcaFor, BarAcaBak, BarAcaAnh, BarAcaMar, BarMdlCod, BarTam, BarHorEnt, BarPzas, BarHorReg, BarDishCod, BarEncCli, BarAudSup, BarAudObs, BarMacPro, BarCtrPdas, BarNumReo, BarLoteA, BarTipEst, BarGraCob, BarCom, BarEstTip, BarBp12, BarBp13, BarBp14, BarBp15, BarFacAbs, BarAcc, BarTipCor, BarCodBan, BarObsGrm, BarObsAnc, BarAntp, BarAntpT, BarAsi, BarMaqEst, BarFecHis, BarOpeHis, EntSecUlt, BarItem1, barItem2, BarItem3, BarItem4, BarItem5, BarItem6, BarAudFec, BarAudTur, BarAudOpe, BarAudOpeN, BarAudSupN, BarAudNPz, BarAudMDig, BarAudMCue, BarAudULin, BarOrdComp, BarPriTin, BarMaqAma, BarVolAma, BarKilLam, BarRecLis, BarAnyTie, BarUltAny, BarEnvBar, BarKgsPrv, BarMtsPrv, BarPiePrv, BarPieKgl, BarPieMtl, BarEnvLaw, Nxt_Mdlo2, Nxt_Sta2, Nxt_ArtCl2, Nxt_cpeID, Nxt_dpoID, Nxt_desaID, SubRevID, BarTpEstam, BarProdID, BarLocTel, BarLocMol, BarLocCol, BarOEKOTEX, BarLineaID, BarCanalID, BarLinPrd, BarDGUltLi, BarRGB, BarRdto4, BarSerDsc2, BarIdtx2, BarCnoEncO, BarPriorid, CliCod, DisDes) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P009I4", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarNotDsc, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P009I5", "INSERT INTO TXPBARNOT(EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin, BarNotDsc) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
         ,new ForEachCursor("P009I6", "SELECT Nof_Pp, Nof_Mcot, Nof_Pd, EmprCod, Nof_p, Nof_r, Nof_Hdr, Nof_enc, Nof_nc, Nof_obs11, Nof_obs10, Nof_obs9, Nof_obs8, Nof_obs7, Nof_obs6, Nof_obs5, Nof_obs4, Nof_obs3, Nof_obs2, Nof_obs1, Nof_oekote, Nof_humeda, Nof_termom, Nof_aguam, Nof_cloro, Nof_sudor, Nof_luz, Nof_lavado, Nof_imp11, Nof_imp10, Nof_imp9, Nof_imp8, Nof_imp7, Nof_imp6, Nof_imp5, Nof_imp4, Nof_imp3, Nof_imp2, Nof_imp1, Nof_c12, Nof_c11, Nof_Lbtp, Nof_Lbta, Nof_stk, Nof_c10, Nof_sa6, Nof_sa5, Nof_sa4, Nof_sa3, Nof_sa2, Nof_sa1, Nof_c9, Nof_ep10, Nof_ep9, Nof_ep8, Nof_ep7, Nof_ep6, Nof_ep5, Nof_ep4, Nof_ep3, Nof_ep2, Nof_ep1, Nof_c8, Nof_rb3, Nof_rb1, Nof_rboc, Nof_rbp, Nof_rbe, Nof_rbi, Nof_rb, Nof_c7, Nof_ccmc6, Nof_ccmc5, Nof_ccmc4, Nof_ccmc3, Nof_ccmc2, Nof_ccmc1, Nof_ccec, Nof_cccc, Nof_cctq, Nof_ccpc, Nof_cct, Nof_ccp, Nof_cctet, Nof_ccttp, Nof_cctse, Nof_c6, Nof_scc, Nof_scs, Nof_c5, Nof_ct, Nof_c4, Nof_tnc, Nof_tns, Nof_c3, Nof_Bov, Nof_boe, Nof_bob, Nof_bo, Nof_c2, Nof_c1, TrnCod, Nof_Ag FROM TXPNOFART WHERE EmprCod = ? and Nof_Hdr = ? and Nof_r = ? and Nof_p = ? ORDER BY EmprCod, Nof_Hdr, Nof_r, Nof_p ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P009I7", "INSERT INTO TXPNOFART(EmprCod, Nof_Hdr, Nof_r, Nof_p, Nof_Pd, Nof_Mcot, Nof_Pp, Nof_Ag, TrnCod, Nof_c1, Nof_c2, Nof_bo, Nof_bob, Nof_boe, Nof_Bov, Nof_c3, Nof_tns, Nof_tnc, Nof_c4, Nof_ct, Nof_c5, Nof_scs, Nof_scc, Nof_c6, Nof_cctse, Nof_ccttp, Nof_cctet, Nof_ccp, Nof_cct, Nof_ccpc, Nof_cctq, Nof_cccc, Nof_ccec, Nof_ccmc1, Nof_ccmc2, Nof_ccmc3, Nof_ccmc4, Nof_ccmc5, Nof_ccmc6, Nof_c7, Nof_rb, Nof_rbi, Nof_rbe, Nof_rbp, Nof_rboc, Nof_rb1, Nof_rb3, Nof_c8, Nof_ep1, Nof_ep2, Nof_ep3, Nof_ep4, Nof_ep5, Nof_ep6, Nof_ep7, Nof_ep8, Nof_ep9, Nof_ep10, Nof_c9, Nof_sa1, Nof_sa2, Nof_sa3, Nof_sa4, Nof_sa5, Nof_sa6, Nof_c10, Nof_stk, Nof_Lbta, Nof_Lbtp, Nof_c11, Nof_c12, Nof_imp1, Nof_imp2, Nof_imp3, Nof_imp4, Nof_imp5, Nof_imp6, Nof_imp7, Nof_imp8, Nof_imp9, Nof_imp10, Nof_imp11, Nof_lavado, Nof_luz, Nof_sudor, Nof_cloro, Nof_aguam, Nof_termom, Nof_humeda, Nof_oekote, Nof_obs1, Nof_obs2, Nof_obs3, Nof_obs4, Nof_obs5, Nof_obs6, Nof_obs7, Nof_obs8, Nof_obs9, Nof_obs10, Nof_obs11, Nof_nc, Nof_enc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPNOFART")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 40);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(16);
               ((byte[]) buf[19])[0] = rslt.getByte(17);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((byte[]) buf[22])[0] = rslt.getByte(19);
               ((byte[]) buf[23])[0] = rslt.getByte(20);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(22);
               ((int[]) buf[26])[0] = rslt.getInt(23);
               ((String[]) buf[27])[0] = rslt.getString(24, 1);
               ((String[]) buf[28])[0] = rslt.getString(25, 1);
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((String[]) buf[30])[0] = rslt.getString(27, 6);
               ((String[]) buf[31])[0] = rslt.getString(28, 10);
               ((String[]) buf[32])[0] = rslt.getString(29, 10);
               ((short[]) buf[33])[0] = rslt.getShort(30);
               ((short[]) buf[34])[0] = rslt.getShort(31);
               ((short[]) buf[35])[0] = rslt.getShort(32);
               ((short[]) buf[36])[0] = rslt.getShort(33);
               ((short[]) buf[37])[0] = rslt.getShort(34);
               ((String[]) buf[38])[0] = rslt.getString(35, 4);
               ((short[]) buf[39])[0] = rslt.getShort(36);
               ((String[]) buf[40])[0] = rslt.getString(37, 4);
               ((short[]) buf[41])[0] = rslt.getShort(38);
               ((String[]) buf[42])[0] = rslt.getString(39, 4);
               ((short[]) buf[43])[0] = rslt.getShort(40);
               ((String[]) buf[44])[0] = rslt.getString(41, 4);
               ((short[]) buf[45])[0] = rslt.getShort(42);
               ((String[]) buf[46])[0] = rslt.getString(43, 4);
               ((short[]) buf[47])[0] = rslt.getShort(44);
               ((String[]) buf[48])[0] = rslt.getString(45, 4);
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(46,2);
               ((String[]) buf[50])[0] = rslt.getString(47, 16);
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(48,1);
               ((byte[]) buf[52])[0] = rslt.getByte(49);
               ((java.util.Date[]) buf[53])[0] = rslt.getGXDate(50);
               ((String[]) buf[54])[0] = rslt.getString(51, 6);
               ((java.util.Date[]) buf[55])[0] = rslt.getGXDate(52);
               ((byte[]) buf[56])[0] = rslt.getByte(53);
               ((short[]) buf[57])[0] = rslt.getShort(54);
               ((java.util.Date[]) buf[58])[0] = rslt.getGXDate(55);
               ((String[]) buf[59])[0] = rslt.getString(56, 1);
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(57,2);
               ((byte[]) buf[61])[0] = rslt.getByte(58);
               ((int[]) buf[62])[0] = rslt.getInt(59);
               ((String[]) buf[63])[0] = rslt.getString(60, 13);
               ((short[]) buf[64])[0] = rslt.getShort(61);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(62, 16);
               ((String[]) buf[67])[0] = rslt.getString(63, 8);
               ((int[]) buf[68])[0] = rslt.getInt(64);
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(65,2);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(66,2);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((short[]) buf[73])[0] = rslt.getShort(67);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((int[]) buf[75])[0] = rslt.getInt(68);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[77])[0] = rslt.getGXDate(69);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((int[]) buf[79])[0] = rslt.getInt(70);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((int[]) buf[81])[0] = rslt.getInt(71);
               ((java.util.Date[]) buf[82])[0] = rslt.getGXDateTime(72);
               ((String[]) buf[83])[0] = rslt.getString(73, 6);
               ((String[]) buf[84])[0] = rslt.getString(74, 1);
               ((String[]) buf[85])[0] = rslt.getString(75, 1);
               ((String[]) buf[86])[0] = rslt.getString(76, 15);
               ((java.math.BigDecimal[]) buf[87])[0] = rslt.getBigDecimal(77,2);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((short[]) buf[89])[0] = rslt.getShort(78);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[91])[0] = rslt.getBigDecimal(79,3);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((short[]) buf[93])[0] = rslt.getShort(80);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((String[]) buf[95])[0] = rslt.getString(81, 10);
               ((short[]) buf[96])[0] = rslt.getShort(82);
               ((String[]) buf[97])[0] = rslt.getString(83, 6);
               ((String[]) buf[98])[0] = rslt.getVarchar(84);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((int[]) buf[100])[0] = rslt.getInt(85);
               ((String[]) buf[101])[0] = rslt.getString(86, 20);
               ((java.util.Date[]) buf[102])[0] = GXutil.resetDate(rslt.getGXDateTime(87));
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((int[]) buf[104])[0] = rslt.getInt(88);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[106])[0] = GXutil.resetDate(rslt.getGXDateTime(89));
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getString(90, 4);
               ((String[]) buf[109])[0] = rslt.getString(91, 1);
               ((short[]) buf[110])[0] = rslt.getShort(92);
               ((String[]) buf[111])[0] = rslt.getString(93, 1);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((int[]) buf[113])[0] = rslt.getInt(94);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((String[]) buf[115])[0] = rslt.getString(95, 6);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[117])[0] = rslt.getBigDecimal(96,2);
               ((java.math.BigDecimal[]) buf[118])[0] = rslt.getBigDecimal(97,2);
               ((short[]) buf[119])[0] = rslt.getShort(98);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((String[]) buf[121])[0] = rslt.getString(99, 1);
               ((java.math.BigDecimal[]) buf[122])[0] = rslt.getBigDecimal(100,2);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[124])[0] = rslt.getBigDecimal(101,2);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((short[]) buf[126])[0] = rslt.getShort(102);
               ((byte[]) buf[127])[0] = rslt.getByte(103);
               ((byte[]) buf[128])[0] = rslt.getByte(104);
               ((String[]) buf[129])[0] = rslt.getString(105, 1);
               ((byte[]) buf[130])[0] = rslt.getByte(106);
               ((byte[]) buf[131])[0] = rslt.getByte(107);
               ((boolean[]) buf[132])[0] = rslt.wasNull();
               ((int[]) buf[133])[0] = rslt.getInt(108);
               ((String[]) buf[134])[0] = rslt.getString(109, 16);
               ((java.util.Date[]) buf[135])[0] = rslt.getGXDate(110);
               ((java.util.Date[]) buf[136])[0] = rslt.getGXDate(111);
               ((String[]) buf[137])[0] = rslt.getString(112, 1);
               ((boolean[]) buf[138])[0] = rslt.wasNull();
               ((String[]) buf[139])[0] = rslt.getString(113, 20);
               ((String[]) buf[140])[0] = rslt.getString(114, 1);
               ((String[]) buf[141])[0] = rslt.getString(115, 10);
               ((short[]) buf[142])[0] = rslt.getShort(116);
               ((short[]) buf[143])[0] = rslt.getShort(117);
               ((short[]) buf[144])[0] = rslt.getShort(118);
               ((short[]) buf[145])[0] = rslt.getShort(119);
               ((short[]) buf[146])[0] = rslt.getShort(120);
               ((short[]) buf[147])[0] = rslt.getShort(121);
               ((String[]) buf[148])[0] = rslt.getString(122, 30);
               ((String[]) buf[149])[0] = rslt.getString(123, 1);
               ((java.math.BigDecimal[]) buf[150])[0] = rslt.getBigDecimal(124,2);
               ((boolean[]) buf[151])[0] = rslt.wasNull();
               ((String[]) buf[152])[0] = rslt.getString(125, 8);
               ((java.math.BigDecimal[]) buf[153])[0] = rslt.getBigDecimal(126,2);
               ((java.math.BigDecimal[]) buf[154])[0] = rslt.getBigDecimal(127,2);
               ((short[]) buf[155])[0] = rslt.getShort(128);
               ((boolean[]) buf[156])[0] = rslt.wasNull();
               ((String[]) buf[157])[0] = rslt.getString(129, 4);
               ((byte[]) buf[158])[0] = rslt.getByte(130);
               ((short[]) buf[159])[0] = rslt.getShort(131);
               ((boolean[]) buf[160])[0] = rslt.wasNull();
               ((String[]) buf[161])[0] = rslt.getString(132, 4);
               ((boolean[]) buf[162])[0] = rslt.wasNull();
               ((int[]) buf[163])[0] = rslt.getInt(133);
               ((int[]) buf[164])[0] = rslt.getInt(134);
               ((int[]) buf[165])[0] = rslt.getInt(135);
               ((java.util.Date[]) buf[166])[0] = rslt.getGXDate(136);
               ((java.util.Date[]) buf[167])[0] = rslt.getGXDate(137);
               ((String[]) buf[168])[0] = rslt.getString(138, 1);
               ((String[]) buf[169])[0] = rslt.getString(139, 1);
               ((String[]) buf[170])[0] = rslt.getString(140, 1);
               ((String[]) buf[171])[0] = rslt.getString(141, 1);
               ((java.math.BigDecimal[]) buf[172])[0] = rslt.getBigDecimal(142,2);
               ((java.math.BigDecimal[]) buf[173])[0] = rslt.getBigDecimal(143,2);
               ((short[]) buf[174])[0] = rslt.getShort(144);
               ((short[]) buf[175])[0] = rslt.getShort(145);
               ((boolean[]) buf[176])[0] = rslt.wasNull();
               ((String[]) buf[177])[0] = rslt.getString(146, 20);
               ((boolean[]) buf[178])[0] = rslt.wasNull();
               ((String[]) buf[179])[0] = rslt.getString(147, 20);
               ((boolean[]) buf[180])[0] = rslt.wasNull();
               ((short[]) buf[181])[0] = rslt.getShort(148);
               ((short[]) buf[182])[0] = rslt.getShort(149);
               ((boolean[]) buf[183])[0] = rslt.wasNull();
               ((String[]) buf[184])[0] = rslt.getString(150, 20);
               ((String[]) buf[185])[0] = rslt.getString(151, 1);
               ((java.math.BigDecimal[]) buf[186])[0] = rslt.getBigDecimal(152,2);
               ((boolean[]) buf[187])[0] = rslt.wasNull();
               ((short[]) buf[188])[0] = rslt.getShort(153);
               ((boolean[]) buf[189])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[190])[0] = rslt.getGXDate(154);
               ((boolean[]) buf[191])[0] = rslt.wasNull();
               ((short[]) buf[192])[0] = rslt.getShort(155);
               ((boolean[]) buf[193])[0] = rslt.wasNull();
               ((String[]) buf[194])[0] = rslt.getString(156, 30);
               ((java.math.BigDecimal[]) buf[195])[0] = rslt.getBigDecimal(157,2);
               ((boolean[]) buf[196])[0] = rslt.wasNull();
               ((short[]) buf[197])[0] = rslt.getShort(158);
               ((boolean[]) buf[198])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[199])[0] = rslt.getGXDate(159);
               ((byte[]) buf[200])[0] = rslt.getByte(160);
               ((boolean[]) buf[201])[0] = rslt.wasNull();
               ((int[]) buf[202])[0] = rslt.getInt(161);
               ((byte[]) buf[203])[0] = rslt.getByte(162);
               ((boolean[]) buf[204])[0] = rslt.wasNull();
               ((String[]) buf[205])[0] = rslt.getString(163, 1);
               ((int[]) buf[206])[0] = rslt.getInt(164);
               ((String[]) buf[207])[0] = rslt.getString(165, 3);
               ((String[]) buf[208])[0] = rslt.getString(166, 1);
               ((String[]) buf[209])[0] = rslt.getString(167, 1);
               ((byte[]) buf[210])[0] = rslt.getByte(168);
               ((String[]) buf[211])[0] = rslt.getString(169, 30);
               ((boolean[]) buf[212])[0] = rslt.wasNull();
               ((String[]) buf[213])[0] = rslt.getString(170, 30);
               ((boolean[]) buf[214])[0] = rslt.wasNull();
               ((byte[]) buf[215])[0] = rslt.getByte(171);
               ((boolean[]) buf[216])[0] = rslt.wasNull();
               ((String[]) buf[217])[0] = rslt.getString(172, 20);
               ((String[]) buf[218])[0] = rslt.getString(173, 20);
               ((String[]) buf[219])[0] = rslt.getString(174, 20);
               ((String[]) buf[220])[0] = rslt.getString(175, 20);
               ((String[]) buf[221])[0] = rslt.getString(176, 20);
               ((String[]) buf[222])[0] = rslt.getString(177, 20);
               ((byte[]) buf[223])[0] = rslt.getByte(178);
               ((String[]) buf[224])[0] = rslt.getString(179, 20);
               ((String[]) buf[225])[0] = rslt.getString(180, 20);
               ((String[]) buf[226])[0] = rslt.getString(181, 2);
               ((String[]) buf[227])[0] = rslt.getString(182, 1);
               ((short[]) buf[228])[0] = rslt.getShort(183);
               ((boolean[]) buf[229])[0] = rslt.wasNull();
               ((String[]) buf[230])[0] = rslt.getString(184, 1);
               ((String[]) buf[231])[0] = rslt.getString(185, 12);
               ((byte[]) buf[232])[0] = rslt.getByte(186);
               ((byte[]) buf[233])[0] = rslt.getByte(187);
               ((byte[]) buf[234])[0] = rslt.getByte(188);
               ((boolean[]) buf[235])[0] = rslt.wasNull();
               ((String[]) buf[236])[0] = rslt.getString(189, 12);
               ((String[]) buf[237])[0] = rslt.getString(190, 13);
               ((String[]) buf[238])[0] = rslt.getString(191, 1);
               ((String[]) buf[239])[0] = rslt.getString(192, 1);
               ((int[]) buf[240])[0] = rslt.getInt(193);
               ((short[]) buf[241])[0] = rslt.getShort(194);
               ((short[]) buf[242])[0] = rslt.getShort(195);
               ((String[]) buf[243])[0] = rslt.getString(196, 1);
               ((byte[]) buf[244])[0] = rslt.getByte(197);
               ((int[]) buf[245])[0] = rslt.getInt(198);
               ((byte[]) buf[246])[0] = rslt.getByte(199);
               ((short[]) buf[247])[0] = rslt.getShort(200);
               ((String[]) buf[248])[0] = rslt.getString(201, 10);
               ((String[]) buf[249])[0] = rslt.getString(202, 10);
               ((String[]) buf[250])[0] = rslt.getString(203, 1);
               ((byte[]) buf[251])[0] = rslt.getByte(204);
               ((int[]) buf[252])[0] = rslt.getInt(205);
               ((short[]) buf[253])[0] = rslt.getShort(206);
               ((boolean[]) buf[254])[0] = rslt.wasNull();
               ((short[]) buf[255])[0] = rslt.getShort(207);
               ((boolean[]) buf[256])[0] = rslt.wasNull();
               ((byte[]) buf[257])[0] = rslt.getByte(208);
               ((java.math.BigDecimal[]) buf[258])[0] = rslt.getBigDecimal(209,2);
               ((java.math.BigDecimal[]) buf[259])[0] = rslt.getBigDecimal(210,2);
               ((java.math.BigDecimal[]) buf[260])[0] = rslt.getBigDecimal(211,2);
               ((short[]) buf[261])[0] = rslt.getShort(212);
               ((String[]) buf[262])[0] = rslt.getString(213, 1);
               ((byte[]) buf[263])[0] = rslt.getByte(214);
               ((byte[]) buf[264])[0] = rslt.getByte(215);
               ((byte[]) buf[265])[0] = rslt.getByte(216);
               ((String[]) buf[266])[0] = rslt.getString(217, 6);
               ((byte[]) buf[267])[0] = rslt.getByte(218);
               ((byte[]) buf[268])[0] = rslt.getByte(219);
               ((java.util.Date[]) buf[269])[0] = rslt.getGXDate(220);
               ((int[]) buf[270])[0] = rslt.getInt(221);
               ((String[]) buf[271])[0] = rslt.getString(222, 6);
               ((String[]) buf[272])[0] = rslt.getString(223, 1);
               ((String[]) buf[273])[0] = rslt.getString(224, 1);
               ((byte[]) buf[274])[0] = rslt.getByte(225);
               ((int[]) buf[275])[0] = rslt.getInt(226);
               ((int[]) buf[276])[0] = rslt.getInt(227);
               ((boolean[]) buf[277])[0] = rslt.wasNull();
               ((byte[]) buf[278])[0] = rslt.getByte(228);
               ((String[]) buf[279])[0] = rslt.getVarchar(229);
               ((String[]) buf[280])[0] = rslt.getString(230, 4);
               ((boolean[]) buf[281])[0] = rslt.wasNull();
               ((String[]) buf[282])[0] = rslt.getVarchar(231);
               ((boolean[]) buf[283])[0] = rslt.wasNull();
               ((short[]) buf[284])[0] = rslt.getShort(232);
               ((boolean[]) buf[285])[0] = rslt.wasNull();
               ((long[]) buf[286])[0] = rslt.getLong(233);
               ((byte[]) buf[287])[0] = rslt.getByte(234);
               ((boolean[]) buf[288])[0] = rslt.wasNull();
               ((String[]) buf[289])[0] = rslt.getString(235, 4);
               ((int[]) buf[290])[0] = rslt.getInt(236);
               ((short[]) buf[291])[0] = rslt.getShort(237);
               ((String[]) buf[292])[0] = rslt.getString(238, 1);
               ((boolean[]) buf[293])[0] = rslt.wasNull();
               ((String[]) buf[294])[0] = rslt.getString(239, 10);
               ((String[]) buf[295])[0] = rslt.getString(240, 10);
               ((String[]) buf[296])[0] = rslt.getString(241, 10);
               ((String[]) buf[297])[0] = rslt.getString(242, 6);
               ((byte[]) buf[298])[0] = rslt.getByte(243);
               ((String[]) buf[299])[0] = rslt.getString(244, 10);
               ((boolean[]) buf[300])[0] = rslt.wasNull();
               ((short[]) buf[301])[0] = rslt.getShort(245);
               ((boolean[]) buf[302])[0] = rslt.wasNull();
               ((short[]) buf[303])[0] = rslt.getShort(246);
               ((boolean[]) buf[304])[0] = rslt.wasNull();
               ((short[]) buf[305])[0] = rslt.getShort(247);
               ((boolean[]) buf[306])[0] = rslt.wasNull();
               ((String[]) buf[307])[0] = rslt.getString(248, 30);
               ((String[]) buf[308])[0] = rslt.getString(249, 4);
               ((String[]) buf[309])[0] = rslt.getString(250, 30);
               ((java.math.BigDecimal[]) buf[310])[0] = rslt.getBigDecimal(251,2);
               ((java.math.BigDecimal[]) buf[311])[0] = rslt.getBigDecimal(252,2);
               ((short[]) buf[312])[0] = rslt.getShort(253);
               ((java.math.BigDecimal[]) buf[313])[0] = rslt.getBigDecimal(254,2);
               ((java.math.BigDecimal[]) buf[314])[0] = rslt.getBigDecimal(255,2);
               ((String[]) buf[315])[0] = rslt.getString(256, 1);
               ((short[]) buf[316])[0] = rslt.getShort(257);
               ((short[]) buf[317])[0] = rslt.getShort(258);
               ((byte[]) buf[318])[0] = rslt.getByte(259);
               ((java.math.BigDecimal[]) buf[319])[0] = rslt.getBigDecimal(260,2);
               ((int[]) buf[320])[0] = rslt.getInt(261);
               ((String[]) buf[321])[0] = rslt.getString(262, 6);
               ((String[]) buf[322])[0] = rslt.getVarchar(263);
               ((short[]) buf[323])[0] = rslt.getShort(264);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(23, 10);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 10);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 10);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 10);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 10);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(28, 10);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(29, 1);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(36, 1);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(37, 1);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getVarchar(40);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((short[]) buf[78])[0] = rslt.getShort(42);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(43, 40);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(44, 1);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(48, 1);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((String[]) buf[92])[0] = rslt.getString(49, 1);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getString(50, 1);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((String[]) buf[96])[0] = rslt.getString(51, 1);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getString(53, 1);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getString(54, 1);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getString(55, 1);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(56, 1);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getString(57, 1);
               ((boolean[]) buf[109])[0] = rslt.wasNull();
               ((String[]) buf[110])[0] = rslt.getString(58, 1);
               ((boolean[]) buf[111])[0] = rslt.wasNull();
               ((String[]) buf[112])[0] = rslt.getString(59, 1);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((String[]) buf[114])[0] = rslt.getString(60, 1);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((String[]) buf[116])[0] = rslt.getString(61, 1);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(62, 1);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((String[]) buf[120])[0] = rslt.getVarchar(63);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getString(64, 1);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((String[]) buf[124])[0] = rslt.getString(65, 1);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               ((short[]) buf[126])[0] = rslt.getShort(66);
               ((boolean[]) buf[127])[0] = rslt.wasNull();
               ((String[]) buf[128])[0] = rslt.getString(67, 1);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getString(68, 1);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getString(69, 1);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getString(70, 1);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((String[]) buf[136])[0] = rslt.getVarchar(71);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((String[]) buf[138])[0] = rslt.getString(72, 1);
               ((boolean[]) buf[139])[0] = rslt.wasNull();
               ((String[]) buf[140])[0] = rslt.getString(73, 1);
               ((boolean[]) buf[141])[0] = rslt.wasNull();
               ((String[]) buf[142])[0] = rslt.getString(74, 1);
               ((boolean[]) buf[143])[0] = rslt.wasNull();
               ((String[]) buf[144])[0] = rslt.getString(75, 1);
               ((boolean[]) buf[145])[0] = rslt.wasNull();
               ((String[]) buf[146])[0] = rslt.getString(76, 1);
               ((boolean[]) buf[147])[0] = rslt.wasNull();
               ((String[]) buf[148])[0] = rslt.getString(77, 1);
               ((boolean[]) buf[149])[0] = rslt.wasNull();
               ((String[]) buf[150])[0] = rslt.getString(78, 1);
               ((boolean[]) buf[151])[0] = rslt.wasNull();
               ((String[]) buf[152])[0] = rslt.getString(79, 1);
               ((boolean[]) buf[153])[0] = rslt.wasNull();
               ((String[]) buf[154])[0] = rslt.getString(80, 1);
               ((boolean[]) buf[155])[0] = rslt.wasNull();
               ((String[]) buf[156])[0] = rslt.getString(81, 1);
               ((boolean[]) buf[157])[0] = rslt.wasNull();
               ((byte[]) buf[158])[0] = rslt.getByte(82);
               ((boolean[]) buf[159])[0] = rslt.wasNull();
               ((byte[]) buf[160])[0] = rslt.getByte(83);
               ((boolean[]) buf[161])[0] = rslt.wasNull();
               ((String[]) buf[162])[0] = rslt.getString(84, 1);
               ((boolean[]) buf[163])[0] = rslt.wasNull();
               ((String[]) buf[164])[0] = rslt.getString(85, 1);
               ((boolean[]) buf[165])[0] = rslt.wasNull();
               ((String[]) buf[166])[0] = rslt.getString(86, 1);
               ((boolean[]) buf[167])[0] = rslt.wasNull();
               ((String[]) buf[168])[0] = rslt.getVarchar(87);
               ((boolean[]) buf[169])[0] = rslt.wasNull();
               ((String[]) buf[170])[0] = rslt.getString(88, 1);
               ((boolean[]) buf[171])[0] = rslt.wasNull();
               ((String[]) buf[172])[0] = rslt.getString(89, 1);
               ((boolean[]) buf[173])[0] = rslt.wasNull();
               ((String[]) buf[174])[0] = rslt.getVarchar(90);
               ((boolean[]) buf[175])[0] = rslt.wasNull();
               ((String[]) buf[176])[0] = rslt.getString(91, 1);
               ((boolean[]) buf[177])[0] = rslt.wasNull();
               ((String[]) buf[178])[0] = rslt.getVarchar(92);
               ((boolean[]) buf[179])[0] = rslt.wasNull();
               ((String[]) buf[180])[0] = rslt.getString(93, 1);
               ((boolean[]) buf[181])[0] = rslt.wasNull();
               ((String[]) buf[182])[0] = rslt.getString(94, 1);
               ((boolean[]) buf[183])[0] = rslt.wasNull();
               ((String[]) buf[184])[0] = rslt.getVarchar(95);
               ((boolean[]) buf[185])[0] = rslt.wasNull();
               ((String[]) buf[186])[0] = rslt.getString(96, 1);
               ((boolean[]) buf[187])[0] = rslt.wasNull();
               ((String[]) buf[188])[0] = rslt.getString(97, 1);
               ((boolean[]) buf[189])[0] = rslt.wasNull();
               ((String[]) buf[190])[0] = rslt.getString(98, 1);
               ((boolean[]) buf[191])[0] = rslt.wasNull();
               ((String[]) buf[192])[0] = rslt.getString(99, 1);
               ((boolean[]) buf[193])[0] = rslt.wasNull();
               ((String[]) buf[194])[0] = rslt.getVarchar(100);
               ((boolean[]) buf[195])[0] = rslt.wasNull();
               ((String[]) buf[196])[0] = rslt.getVarchar(101);
               ((boolean[]) buf[197])[0] = rslt.wasNull();
               ((short[]) buf[198])[0] = rslt.getShort(102);
               ((boolean[]) buf[199])[0] = rslt.wasNull();
               ((String[]) buf[200])[0] = rslt.getString(103, 1);
               ((boolean[]) buf[201])[0] = rslt.wasNull();
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[11], 1);
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
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 200);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 200);
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
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 1);
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
                  stmt.setVarchar(16, (String)parms[27], 200);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[33], 200);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[37], 200);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[43], 200);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[45], 1);
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
                  stmt.setString(27, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(28, ((Number) parms[51]).byteValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(29, ((Number) parms[53]).byteValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[55], 1);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[57], 1);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[59], 1);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[61], 1);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[63], 1);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[65], 1);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[67], 1);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[69], 1);
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
                  stmt.setString(39, (String)parms[73], 1);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[75], 200);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[77], 1);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[79], 1);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[81], 1);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[83], 1);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(45, ((Number) parms[85]).shortValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[87], 1);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[89], 1);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(48, (String)parms[91], 200);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[93], 1);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[95], 1);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[97], 1);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[99], 1);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[101], 1);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[103], 1);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[105], 1);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[107], 1);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[109], 1);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(58, (String)parms[111], 1);
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(59, (String)parms[113], 200);
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(60, (String)parms[115], 1);
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
                  stmt.setNull( 62 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(62, (String)parms[119], 1);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(63, (String)parms[121], 1);
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(64, (String)parms[123], 1);
               }
               if ( ((Boolean) parms[124]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(65, (String)parms[125], 1);
               }
               if ( ((Boolean) parms[126]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(66, (String)parms[127], 200);
               }
               if ( ((Boolean) parms[128]).booleanValue() )
               {
                  stmt.setNull( 67 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(67, (String)parms[129], 1);
               }
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(68, (String)parms[131], 40);
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
                  stmt.setNull( 70 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(70, (String)parms[135], 200);
               }
               if ( ((Boolean) parms[136]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(71, (String)parms[137], 200);
               }
               if ( ((Boolean) parms[138]).booleanValue() )
               {
                  stmt.setNull( 72 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(72, (String)parms[139], 1);
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
                  stmt.setString(75, (String)parms[145], 1);
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
                  stmt.setNull( 78 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(78, (String)parms[151], 1);
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
                  stmt.setNull( 81 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(81, (String)parms[157], 1);
               }
               if ( ((Boolean) parms[158]).booleanValue() )
               {
                  stmt.setNull( 82 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(82, (String)parms[159], 1);
               }
               if ( ((Boolean) parms[160]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(83, (String)parms[161], 10);
               }
               if ( ((Boolean) parms[162]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(84, (String)parms[163], 10);
               }
               if ( ((Boolean) parms[164]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(85, (String)parms[165], 10);
               }
               if ( ((Boolean) parms[166]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(86, (String)parms[167], 10);
               }
               if ( ((Boolean) parms[168]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(87, (String)parms[169], 10);
               }
               if ( ((Boolean) parms[170]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(88, (String)parms[171], 10);
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
                  stmt.setNull( 90 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(90, (String)parms[175], 1);
               }
               if ( ((Boolean) parms[176]).booleanValue() )
               {
                  stmt.setNull( 91 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(91, (String)parms[177], 1);
               }
               if ( ((Boolean) parms[178]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(92, (String)parms[179], 1);
               }
               if ( ((Boolean) parms[180]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(93, (String)parms[181], 1);
               }
               if ( ((Boolean) parms[182]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(94, (String)parms[183], 1);
               }
               if ( ((Boolean) parms[184]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(95, (String)parms[185], 1);
               }
               if ( ((Boolean) parms[186]).booleanValue() )
               {
                  stmt.setNull( 96 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(96, (String)parms[187], 1);
               }
               if ( ((Boolean) parms[188]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(97, (String)parms[189], 1);
               }
               if ( ((Boolean) parms[190]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(98, (String)parms[191], 1);
               }
               if ( ((Boolean) parms[192]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(99, (String)parms[193], 1);
               }
               if ( ((Boolean) parms[194]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(100, (String)parms[195], 1);
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
                  stmt.setNull( 102 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(102, ((Number) parms[199]).byteValue());
               }
               if ( ((Boolean) parms[200]).booleanValue() )
               {
                  stmt.setNull( 103 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(103, (java.math.BigDecimal)parms[201], 2);
               }
               return;
      }
   }

}

