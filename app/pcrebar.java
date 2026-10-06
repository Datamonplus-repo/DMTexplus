package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcrebar extends GXProcedure
{
   public pcrebar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcrebar.class ), "" );
   }

   public pcrebar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pcrebar.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pcrebar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcrebar.this.AV16BarCodI = aP1[0];
      this.aP1 = aP1;
      pcrebar.this.AV17BarCodRI = aP2[0];
      this.aP2 = aP2;
      pcrebar.this.AV18BarCodPI = aP3[0];
      this.aP3 = aP3;
      pcrebar.this.AV19BarCod = aP4[0];
      this.aP4 = aP4;
      pcrebar.this.AV20BarCodReo = aP5[0];
      this.aP5 = aP5;
      pcrebar.this.AV15BarParPan = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV144station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pcrebar.this.GXt_char1 = GXv_char2[0] ;
      AV144station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV142EmprNom ;
      GXv_char4[0] = AV143UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV144station, GXv_char2, GXv_char3, GXv_char4) ;
      pcrebar.this.A396EmprCod = GXv_char2[0] ;
      pcrebar.this.AV142EmprNom = GXv_char3[0] ;
      pcrebar.this.AV143UsurCod = GXv_char4[0] ;
      AV120Tintto = (byte)(0) ;
      GXv_int5[0] = AV120Tintto ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTTO", ""), GXv_int5) ;
      pcrebar.this.AV120Tintto = GXv_int5[0] ;
      AV110FlagJbp = (byte)(0) ;
      GXv_int5[0] = AV110FlagJbp ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBP", ""), GXv_int5) ;
      pcrebar.this.AV110FlagJbp = GXv_int5[0] ;
      AV113PlusUltra = (byte)(0) ;
      GXv_int5[0] = AV113PlusUltra ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AEPU", ""), GXv_int5) ;
      pcrebar.this.AV113PlusUltra = GXv_int5[0] ;
      AV117Refugio = (byte)(0) ;
      GXv_int5[0] = AV117Refugio ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REFUGI", ""), GXv_int5) ;
      pcrebar.this.AV117Refugio = GXv_int5[0] ;
      AV114FlagjBM = (byte)(0) ;
      GXv_int5[0] = AV114FlagjBM ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBMAR", ""), GXv_int5) ;
      pcrebar.this.AV114FlagjBM = GXv_int5[0] ;
      AV119F_carvema = (byte)(0) ;
      GXv_int5[0] = AV119F_carvema ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int5) ;
      pcrebar.this.AV119F_carvema = GXv_int5[0] ;
      GXv_int5[0] = AV116FlagDivsif ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DIVSIF", ""), GXv_int5) ;
      pcrebar.this.AV116FlagDivsif = GXv_int5[0] ;
      GXt_int6 = AV133Texfina ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int5) ;
      pcrebar.this.GXt_int6 = GXv_int5[0] ;
      AV133Texfina = GXt_int6 ;
      GXt_int6 = AV140WorkNotas ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "WWNOTA", ""), GXv_int5) ;
      pcrebar.this.GXt_int6 = GXv_int5[0] ;
      AV140WorkNotas = GXt_int6 ;
      AV141Inc_obs = "" ;
      /* Using cursor P002R3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCodI), Byte.valueOf(AV17BarCodRI), AV18BarCodPI});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P002R3_A130BarCodPar[0] ;
         A132BarCodReo = P002R3_A132BarCodReo[0] ;
         A129BarCod = P002R3_A129BarCod[0] ;
         A361DisCod = P002R3_A361DisCod[0] ;
         A365DisDes = P002R3_A365DisDes[0] ;
         A143BarDisNum = P002R3_A143BarDisNum[0] ;
         A212BarSer = P002R3_A212BarSer[0] ;
         A217BarTipArt = P002R3_A217BarTipArt[0] ;
         n217BarTipArt = P002R3_n217BarTipArt[0] ;
         A135BarColNom = P002R3_A135BarColNom[0] ;
         A136BarColNum = P002R3_A136BarColNum[0] ;
         A218BarTipCol = P002R3_A218BarTipCol[0] ;
         A159BarFecGen = P002R3_A159BarFecGen[0] ;
         A228BarUniMed = P002R3_A228BarUniMed[0] ;
         A155BarFecCli = P002R3_A155BarFecCli[0] ;
         A157BarFecEnt = P002R3_A157BarFecEnt[0] ;
         A180BarMaqCod = P002R3_A180BarMaqCod[0] ;
         A193BarOpeEsp = P002R3_A193BarOpeEsp[0] ;
         A235BarUrg = P002R3_A235BarUrg[0] ;
         A182BarMat = P002R3_A182BarMat[0] ;
         A211BarRdt = P002R3_A211BarRdt[0] ;
         A221BarTra1 = P002R3_A221BarTra1[0] ;
         A224BarTraP1 = P002R3_A224BarTraP1[0] ;
         A222BarTra2 = P002R3_A222BarTra2[0] ;
         A225BarTraP2 = P002R3_A225BarTraP2[0] ;
         A223BarTra3 = P002R3_A223BarTra3[0] ;
         A226BarTraP3 = P002R3_A226BarTraP3[0] ;
         A229BarUrd1 = P002R3_A229BarUrd1[0] ;
         A232BarUrdP1 = P002R3_A232BarUrdP1[0] ;
         A230BarUrd2 = P002R3_A230BarUrd2[0] ;
         A233BarUrdP2 = P002R3_A233BarUrdP2[0] ;
         A231BarUrd3 = P002R3_A231BarUrd3[0] ;
         A234BarUrdP3 = P002R3_A234BarUrdP3[0] ;
         A127BarAncCru1 = P002R3_A127BarAncCru1[0] ;
         A128BarAncCru2 = P002R3_A128BarAncCru2[0] ;
         A125BarAncAca1 = P002R3_A125BarAncAca1[0] ;
         A126BarAncAca2 = P002R3_A126BarAncAca2[0] ;
         A206BarPle = P002R3_A206BarPle[0] ;
         A177BarLar = P002R3_A177BarLar[0] ;
         A214BarSua = P002R3_A214BarSua[0] ;
         A118BarAcaQui = P002R3_A118BarAcaQui[0] ;
         A139BarCorOri = P002R3_A139BarCorOri[0] ;
         A145BarEncOri = P002R3_A145BarEncOri[0] ;
         A213BarSit = P002R3_A213BarSit[0] ;
         A146BarEst = P002R3_A146BarEst[0] ;
         A147BarEstCol = P002R3_A147BarEstCol[0] ;
         A209BarPri = P002R3_A209BarPri[0] ;
         A138BarConReo = P002R3_A138BarConReo[0] ;
         A137BarConPar = P002R3_A137BarConPar[0] ;
         A189BarNumAny = P002R3_A189BarNumAny[0] ;
         A141BarCosPro = P002R3_A141BarCosPro[0] ;
         A140BarCosAny = P002R3_A140BarCosAny[0] ;
         A169BarKgsFac = P002R3_A169BarKgsFac[0] ;
         A148BarEstReo = P002R3_A148BarEstReo[0] ;
         A196BarOrdReo = P002R3_A196BarOrdReo[0] ;
         A158BarFecFpr = P002R3_A158BarFecFpr[0] ;
         A120BarAgrEst = P002R3_A120BarAgrEst[0] ;
         A864BarPes = P002R3_A864BarPes[0] ;
         A833TipDefCod = P002R3_A833TipDefCod[0] ;
         n833TipDefCod = P002R3_n833TipDefCod[0] ;
         A899TipDefPor = P002R3_A899TipDefPor[0] ;
         n899TipDefPor = P002R3_n899TipDefPor[0] ;
         A904ObsReoEnt = P002R3_A904ObsReoEnt[0] ;
         n904ObsReoEnt = P002R3_n904ObsReoEnt[0] ;
         A905ObsReoULin = P002R3_A905ObsReoULin[0] ;
         n905ObsReoULin = P002R3_n905ObsReoULin[0] ;
         A921BarMatiz = P002R3_A921BarMatiz[0] ;
         A1226BarGraCru = P002R3_A1226BarGraCru[0] ;
         A1234BarNomCli = P002R3_A1234BarNomCli[0] ;
         A1235BarNumCli = P002R3_A1235BarNumCli[0] ;
         A1223BarEncCom = P002R3_A1223BarEncCom[0] ;
         A1224BarEncAnh = P002R3_A1224BarEncAnh[0] ;
         A1254BarPesBal = P002R3_A1254BarPesBal[0] ;
         A1431BarLocDis = P002R3_A1431BarLocDis[0] ;
         A898BarPieNDes = P002R3_A898BarPieNDes[0] ;
         n898BarPieNDes = P002R3_n898BarPieNDes[0] ;
         A898BarPieNDes = P002R3_A898BarPieNDes[0] ;
         n898BarPieNDes = P002R3_n898BarPieNDes[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV22EmprCod = A396EmprCod ;
         AV23DisCod = A361DisCod ;
         AV24DisDes = A365DisDes ;
         AV25BarDisNum = A143BarDisNum ;
         AV26BarSer = A212BarSer ;
         AV27BarTipArt = A217BarTipArt ;
         AV28BarColNom = A135BarColNom ;
         AV29BarColNum = A136BarColNum ;
         AV30BarTipCol = A218BarTipCol ;
         AV31BarFecGen = A159BarFecGen ;
         AV32BarUniMed = A228BarUniMed ;
         AV33BarFecCli = A155BarFecCli ;
         AV34BarFecEnt = A157BarFecEnt ;
         AV35BarMaqCod = A180BarMaqCod ;
         AV36BarOpeEsp = A193BarOpeEsp ;
         AV37BarUrg = A235BarUrg ;
         AV38BarMat = A182BarMat ;
         AV39BarRdt = A211BarRdt ;
         AV40BarTra1 = A221BarTra1 ;
         AV41BarTraP1 = A224BarTraP1 ;
         AV42BarTra2 = A222BarTra2 ;
         AV43BarTraP2 = A225BarTraP2 ;
         AV44BarTra3 = A223BarTra3 ;
         AV45BarTraP3 = A226BarTraP3 ;
         AV46BarUrd1 = A229BarUrd1 ;
         AV47BarUrdP1 = A232BarUrdP1 ;
         AV48BarUrd2 = A230BarUrd2 ;
         AV49BarUrdP2 = A233BarUrdP2 ;
         AV50BarUrd3 = A231BarUrd3 ;
         AV51BarUrdP3 = A234BarUrdP3 ;
         AV52BarAncCru1 = A127BarAncCru1 ;
         AV53BarAncCru2 = A128BarAncCru2 ;
         AV54BarAncAca1 = A125BarAncAca1 ;
         AV55BarAncAca2 = A126BarAncAca2 ;
         AV56BarPle = A206BarPle ;
         AV57BarLar = A177BarLar ;
         AV58BarSua = A214BarSua ;
         AV59BarAcaQui = A118BarAcaQui ;
         AV60BarCorOri = A139BarCorOri ;
         AV61BarEncOri = A145BarEncOri ;
         AV62BarSit = A213BarSit ;
         AV63BarEst = A146BarEst ;
         AV64BarEstCol = A147BarEstCol ;
         AV65BarPri = A209BarPri ;
         AV66BarConReo = A138BarConReo ;
         AV67BarConPar = A137BarConPar ;
         AV68BarNumAny = A189BarNumAny ;
         AV69BarCosPro = A141BarCosPro ;
         AV70BarCosAny = A140BarCosAny ;
         AV71BarKgsFac = A169BarKgsFac ;
         AV72BarEstReo = A148BarEstReo ;
         AV73BarOrdReo = A196BarOrdReo ;
         AV74BarFecFpr = A158BarFecFpr ;
         if ( AV114FlagjBM == 0 )
         {
            AV75BarAgrEst = A120BarAgrEst ;
         }
         else
         {
            AV75BarAgrEst = httpContext.getMessage( "N", "") ;
         }
         AV76BarPes = A864BarPes ;
         AV77TipDefCod = A833TipDefCod ;
         AV78TipDefPor = A899TipDefPor ;
         AV79ObsReoEnt = A904ObsReoEnt ;
         AV80ObsReoULin = A905ObsReoULin ;
         AV81BarMatiz = A921BarMatiz ;
         AV82BarGraCru = A1226BarGraCru ;
         AV83BarNomCli = A1234BarNomCli ;
         AV84BarNumCli = A1235BarNumCli ;
         AV85BarEncCom = A1223BarEncCom ;
         AV86BarEncAnh = A1224BarEncAnh ;
         AV87BarPesBal = A1254BarPesBal ;
         AV105BarLocDis = A1431BarLocDis ;
         AV106BarPieNDes = A898BarPieNDes ;
         AV136BarHdro = GXutil.str( AV16BarCodI, 8, 0) + "-" + GXutil.str( AV17BarCodRI, 1, 0) + AV18BarCodPI ;
         GXv_char4[0] = AV22EmprCod ;
         GXv_int7[0] = AV19BarCod ;
         GXv_int5[0] = AV20BarCodReo ;
         GXv_char3[0] = AV15BarParPan ;
         GXv_int8[0] = A129BarCod ;
         GXv_int9[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_int10[0] = AV23DisCod ;
         GXv_int11[0] = AV62BarSit ;
         GXv_int12[0] = 0 ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char15[0] = AV35BarMaqCod ;
         GXv_int16[0] = AV68BarNumAny ;
         GXv_char17[0] = " " ;
         GXv_char18[0] = AV24DisDes ;
         GXv_int19[0] = (short)(0) ;
         GXv_int20[0] = (short)(0) ;
         GXv_int21[0] = (byte)(1) ;
         GXv_int22[0] = AV72BarEstReo ;
         GXv_int23[0] = AV36BarOpeEsp ;
         new app.pnuebar(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int5, GXv_char3, GXv_int8, GXv_int9, GXv_char2, GXv_int10, GXv_int11, GXv_int12, GXv_decimal13, GXv_decimal14, GXv_char15, GXv_int16, GXv_char17, GXv_char18, GXv_int19, GXv_int20, GXv_int21, GXv_int22, GXv_int23) ;
         pcrebar.this.AV22EmprCod = GXv_char4[0] ;
         pcrebar.this.AV19BarCod = GXv_int7[0] ;
         pcrebar.this.AV20BarCodReo = GXv_int5[0] ;
         pcrebar.this.AV15BarParPan = GXv_char3[0] ;
         pcrebar.this.A129BarCod = GXv_int8[0] ;
         pcrebar.this.A132BarCodReo = GXv_int9[0] ;
         pcrebar.this.A130BarCodPar = GXv_char2[0] ;
         pcrebar.this.AV23DisCod = GXv_int10[0] ;
         pcrebar.this.AV62BarSit = GXv_int11[0] ;
         pcrebar.this.AV35BarMaqCod = GXv_char15[0] ;
         pcrebar.this.AV68BarNumAny = GXv_int16[0] ;
         pcrebar.this.AV24DisDes = GXv_char18[0] ;
         pcrebar.this.AV72BarEstReo = GXv_int22[0] ;
         pcrebar.this.AV36BarOpeEsp = GXv_int23[0] ;
         /*
            INSERT RECORD ON TABLE TXPDISBAR

         */
         A1146DisDisCod = A361DisCod ;
         A1139DisBarCod = AV19BarCod ;
         A1140DisBarReo = AV20BarCodReo ;
         A1141DisBarPar = AV15BarParPan ;
         /* Using cursor P002R4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1146DisDisCod), Integer.valueOf(A1139DisBarCod), Byte.valueOf(A1140DisBarReo), A1141DisBarPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISBAR");
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
         /* End Insert */
         /* Using cursor P002R5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A758ProCod = P002R5_A758ProCod[0] ;
            A761ProFasLin = P002R5_A761ProFasLin[0] ;
            n761ProFasLin = P002R5_n761ProFasLin[0] ;
            AV88ProCod = A758ProCod ;
            AV89ProFasLin = A761ProFasLin ;
            GXv_char18[0] = AV22EmprCod ;
            GXv_int12[0] = AV19BarCod ;
            GXv_int23[0] = AV20BarCodReo ;
            GXv_char17[0] = AV15BarParPan ;
            GXv_char15[0] = AV88ProCod ;
            GXv_int20[0] = AV89ProFasLin ;
            new app.pnuepro(remoteHandle, context).execute( GXv_char18, GXv_int12, GXv_int23, GXv_char17, GXv_char15, GXv_int20) ;
            pcrebar.this.AV22EmprCod = GXv_char18[0] ;
            pcrebar.this.AV19BarCod = GXv_int12[0] ;
            pcrebar.this.AV20BarCodReo = GXv_int23[0] ;
            pcrebar.this.AV15BarParPan = GXv_char17[0] ;
            pcrebar.this.AV88ProCod = GXv_char15[0] ;
            pcrebar.this.AV89ProFasLin = GXv_int20[0] ;
            if ( ( AV110FlagJbp == 1 ) || ( AV120Tintto == 1 ) )
            {
               /* Using cursor P002R6 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A194BarOrdLin = P002R6_A194BarOrdLin[0] ;
                  A457FasCod = P002R6_A457FasCod[0] ;
                  A162BarFecTeo = P002R6_A162BarFecTeo[0] ;
                  A216BarTieTeo = P002R6_A216BarTieTeo[0] ;
                  A179BarLoc = P002R6_A179BarLoc[0] ;
                  A603MaqCodBis = P002R6_A603MaqCodBis[0] ;
                  A150BarFacTin = P002R6_A150BarFacTin[0] ;
                  A152BarFasCon = P002R6_A152BarFasCon[0] ;
                  A3298BarFecRIni = P002R6_A3298BarFecRIni[0] ;
                  A4022BarNumBot = P002R6_A4022BarNumBot[0] ;
                  A5719BarFasKgT = P002R6_A5719BarFasKgT[0] ;
                  n5719BarFasKgT = P002R6_n5719BarFasKgT[0] ;
                  A5720BarFasMtT = P002R6_A5720BarFasMtT[0] ;
                  n5720BarFasMtT = P002R6_n5720BarFasMtT[0] ;
                  A3837BarFasKgm = P002R6_A3837BarFasKgm[0] ;
                  n3837BarFasKgm = P002R6_n3837BarFasKgm[0] ;
                  A3838BarFasMtr = P002R6_A3838BarFasMtr[0] ;
                  n3838BarFasMtr = P002R6_n3838BarFasMtr[0] ;
                  A4301BarFasCoP = P002R6_A4301BarFasCoP[0] ;
                  A4905BarFasAcab = P002R6_A4905BarFasAcab[0] ;
                  A5047BarFasFPl = P002R6_A5047BarFasFPl[0] ;
                  n5047BarFasFPl = P002R6_n5047BarFasFPl[0] ;
                  A5048BarFasUsu = P002R6_A5048BarFasUsu[0] ;
                  n5048BarFasUsu = P002R6_n5048BarFasUsu[0] ;
                  A5369BarFasGral = P002R6_A5369BarFasGral[0] ;
                  n5369BarFasGral = P002R6_n5369BarFasGral[0] ;
                  A5896BarMaqPlan = P002R6_A5896BarMaqPlan[0] ;
                  n5896BarMaqPlan = P002R6_n5896BarMaqPlan[0] ;
                  A4287BarFasFor = P002R6_A4287BarFasFor[0] ;
                  A4442BarFasDTI = P002R6_A4442BarFasDTI[0] ;
                  n4442BarFasDTI = P002R6_n4442BarFasDTI[0] ;
                  A4443BarFasDTF = P002R6_A4443BarFasDTF[0] ;
                  n4443BarFasDTF = P002R6_n4443BarFasDTF[0] ;
                  A9842BarObsF = P002R6_A9842BarObsF[0] ;
                  n9842BarObsF = P002R6_n9842BarObsF[0] ;
                  A10032BarObsB = P002R6_A10032BarObsB[0] ;
                  n10032BarObsB = P002R6_n10032BarObsB[0] ;
                  AV90BarOrdLin = A194BarOrdLin ;
                  AV91FasCod = A457FasCod ;
                  AV92BarFasEst = (byte)(0) ;
                  AV93BarFecTeo = A162BarFecTeo ;
                  AV94BarFecRea = GXutil.nullDate() ;
                  AV95BarTieTeo = A216BarTieTeo ;
                  AV96BarUni = DecimalUtil.ZERO ;
                  AV97BarLoc = A179BarLoc ;
                  AV98BarHorIni = (short)(0) ;
                  AV99BarHorFin = (short)(0) ;
                  AV100BarTieRea = DecimalUtil.ZERO ;
                  if ( AV110FlagJbp == 1 )
                  {
                     AV101MaqCodBis = "" ;
                  }
                  else
                  {
                     AV101MaqCodBis = A603MaqCodBis ;
                  }
                  AV107BarFacTin = A150BarFacTin ;
                  AV108BarFasCon = A152BarFasCon ;
                  AV109BarFecRIni = A3298BarFecRIni ;
                  AV118BarNumBot = A4022BarNumBot ;
                  AV122BarFasKgt = A5719BarFasKgT ;
                  AV123BarFasMtt = A5720BarFasMtT ;
                  AV124BarFasKgm = A3837BarFasKgm ;
                  AV125BarFasMtr = A3838BarFasMtr ;
                  AV126BarFasCop = A4301BarFasCoP ;
                  AV127BarFasAcab = A4905BarFasAcab ;
                  AV128barFasFpl = A5047BarFasFPl ;
                  AV129Barfasusu = A5048BarFasUsu ;
                  AV130BarFasGral = A5369BarFasGral ;
                  AV131BarMaqPlan = A5896BarMaqPlan ;
                  AV132Barfasfor = A4287BarFasFor ;
                  AV134Barfasdti = A4442BarFasDTI ;
                  AV135Barfasdtf = A4443BarFasDTF ;
                  AV137BarObsF = A9842BarObsF ;
                  AV138BarObsB = A10032BarObsB ;
                  GXv_char18[0] = AV22EmprCod ;
                  GXv_int12[0] = AV19BarCod ;
                  GXv_int23[0] = AV20BarCodReo ;
                  GXv_char17[0] = AV15BarParPan ;
                  GXv_char15[0] = AV88ProCod ;
                  GXv_int20[0] = AV90BarOrdLin ;
                  GXv_char4[0] = AV91FasCod ;
                  GXv_int22[0] = AV92BarFasEst ;
                  GXv_date24[0] = AV93BarFecTeo ;
                  GXv_date25[0] = AV94BarFecRea ;
                  GXv_date26[0] = AV109BarFecRIni ;
                  GXv_decimal14[0] = AV95BarTieTeo ;
                  GXv_decimal13[0] = AV96BarUni ;
                  GXv_char3[0] = AV97BarLoc ;
                  GXv_int19[0] = AV98BarHorIni ;
                  GXv_int16[0] = AV99BarHorFin ;
                  GXv_decimal27[0] = AV100BarTieRea ;
                  GXv_char2[0] = AV101MaqCodBis ;
                  GXv_char28[0] = AV108BarFasCon ;
                  GXv_char29[0] = AV107BarFacTin ;
                  GXv_int10[0] = AV118BarNumBot ;
                  GXv_decimal30[0] = AV124BarFasKgm ;
                  GXv_decimal31[0] = AV122BarFasKgt ;
                  GXv_decimal32[0] = AV125BarFasMtr ;
                  GXv_decimal33[0] = AV123BarFasMtt ;
                  GXv_char34[0] = AV126BarFasCop ;
                  GXv_char35[0] = AV127BarFasAcab ;
                  GXv_date36[0] = AV128barFasFpl ;
                  GXv_char37[0] = AV129Barfasusu ;
                  GXv_char38[0] = AV130BarFasGral ;
                  GXv_char39[0] = AV131BarMaqPlan ;
                  GXv_char40[0] = AV132Barfasfor ;
                  GXv_dtime41[0] = AV134Barfasdti ;
                  GXv_dtime42[0] = AV135Barfasdtf ;
                  GXv_char43[0] = AV136BarHdro ;
                  GXv_char44[0] = AV137BarObsF ;
                  GXv_char45[0] = AV138BarObsB ;
                  new app.pnewfas(remoteHandle, context).execute( GXv_char18, GXv_int12, GXv_int23, GXv_char17, GXv_char15, GXv_int20, GXv_char4, GXv_int22, GXv_date24, GXv_date25, GXv_date26, GXv_decimal14, GXv_decimal13, GXv_char3, GXv_int19, GXv_int16, GXv_decimal27, GXv_char2, GXv_char28, GXv_char29, GXv_int10, GXv_decimal30, GXv_decimal31, GXv_decimal32, GXv_decimal33, GXv_char34, GXv_char35, GXv_date36, GXv_char37, GXv_char38, GXv_char39, GXv_char40, GXv_dtime41, GXv_dtime42, GXv_char43, GXv_char44, GXv_char45) ;
                  pcrebar.this.AV22EmprCod = GXv_char18[0] ;
                  pcrebar.this.AV19BarCod = GXv_int12[0] ;
                  pcrebar.this.AV20BarCodReo = GXv_int23[0] ;
                  pcrebar.this.AV15BarParPan = GXv_char17[0] ;
                  pcrebar.this.AV88ProCod = GXv_char15[0] ;
                  pcrebar.this.AV90BarOrdLin = GXv_int20[0] ;
                  pcrebar.this.AV91FasCod = GXv_char4[0] ;
                  pcrebar.this.AV92BarFasEst = GXv_int22[0] ;
                  pcrebar.this.AV93BarFecTeo = GXv_date24[0] ;
                  pcrebar.this.AV94BarFecRea = GXv_date25[0] ;
                  pcrebar.this.AV109BarFecRIni = GXv_date26[0] ;
                  pcrebar.this.AV95BarTieTeo = GXv_decimal14[0] ;
                  pcrebar.this.AV96BarUni = GXv_decimal13[0] ;
                  pcrebar.this.AV97BarLoc = GXv_char3[0] ;
                  pcrebar.this.AV98BarHorIni = GXv_int19[0] ;
                  pcrebar.this.AV99BarHorFin = GXv_int16[0] ;
                  pcrebar.this.AV100BarTieRea = GXv_decimal27[0] ;
                  pcrebar.this.AV101MaqCodBis = GXv_char2[0] ;
                  pcrebar.this.AV108BarFasCon = GXv_char28[0] ;
                  pcrebar.this.AV107BarFacTin = GXv_char29[0] ;
                  pcrebar.this.AV118BarNumBot = GXv_int10[0] ;
                  pcrebar.this.AV124BarFasKgm = GXv_decimal30[0] ;
                  pcrebar.this.AV122BarFasKgt = GXv_decimal31[0] ;
                  pcrebar.this.AV125BarFasMtr = GXv_decimal32[0] ;
                  pcrebar.this.AV123BarFasMtt = GXv_decimal33[0] ;
                  pcrebar.this.AV126BarFasCop = GXv_char34[0] ;
                  pcrebar.this.AV127BarFasAcab = GXv_char35[0] ;
                  pcrebar.this.AV128barFasFpl = GXv_date36[0] ;
                  pcrebar.this.AV129Barfasusu = GXv_char37[0] ;
                  pcrebar.this.AV130BarFasGral = GXv_char38[0] ;
                  pcrebar.this.AV131BarMaqPlan = GXv_char39[0] ;
                  pcrebar.this.AV132Barfasfor = GXv_char40[0] ;
                  pcrebar.this.AV134Barfasdti = GXv_dtime41[0] ;
                  pcrebar.this.AV135Barfasdtf = GXv_dtime42[0] ;
                  pcrebar.this.AV136BarHdro = GXv_char43[0] ;
                  pcrebar.this.AV137BarObsF = GXv_char44[0] ;
                  pcrebar.this.AV138BarObsB = GXv_char45[0] ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
            }
            else if ( AV116FlagDivsif == 1 )
            {
               /* Using cursor P002R7 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A194BarOrdLin = P002R7_A194BarOrdLin[0] ;
                  A457FasCod = P002R7_A457FasCod[0] ;
                  A153BarFasEst = P002R7_A153BarFasEst[0] ;
                  A162BarFecTeo = P002R7_A162BarFecTeo[0] ;
                  A160BarFecRea = P002R7_A160BarFecRea[0] ;
                  A216BarTieTeo = P002R7_A216BarTieTeo[0] ;
                  A227BarUni = P002R7_A227BarUni[0] ;
                  A179BarLoc = P002R7_A179BarLoc[0] ;
                  A165BarHorIni = P002R7_A165BarHorIni[0] ;
                  A164BarHorFin = P002R7_A164BarHorFin[0] ;
                  A215BarTieRea = P002R7_A215BarTieRea[0] ;
                  A603MaqCodBis = P002R7_A603MaqCodBis[0] ;
                  A150BarFacTin = P002R7_A150BarFacTin[0] ;
                  A152BarFasCon = P002R7_A152BarFasCon[0] ;
                  A3298BarFecRIni = P002R7_A3298BarFecRIni[0] ;
                  A4022BarNumBot = P002R7_A4022BarNumBot[0] ;
                  A5719BarFasKgT = P002R7_A5719BarFasKgT[0] ;
                  n5719BarFasKgT = P002R7_n5719BarFasKgT[0] ;
                  A5720BarFasMtT = P002R7_A5720BarFasMtT[0] ;
                  n5720BarFasMtT = P002R7_n5720BarFasMtT[0] ;
                  A3837BarFasKgm = P002R7_A3837BarFasKgm[0] ;
                  n3837BarFasKgm = P002R7_n3837BarFasKgm[0] ;
                  A3838BarFasMtr = P002R7_A3838BarFasMtr[0] ;
                  n3838BarFasMtr = P002R7_n3838BarFasMtr[0] ;
                  A4301BarFasCoP = P002R7_A4301BarFasCoP[0] ;
                  A4905BarFasAcab = P002R7_A4905BarFasAcab[0] ;
                  A5047BarFasFPl = P002R7_A5047BarFasFPl[0] ;
                  n5047BarFasFPl = P002R7_n5047BarFasFPl[0] ;
                  A5048BarFasUsu = P002R7_A5048BarFasUsu[0] ;
                  n5048BarFasUsu = P002R7_n5048BarFasUsu[0] ;
                  A5369BarFasGral = P002R7_A5369BarFasGral[0] ;
                  n5369BarFasGral = P002R7_n5369BarFasGral[0] ;
                  A5896BarMaqPlan = P002R7_A5896BarMaqPlan[0] ;
                  n5896BarMaqPlan = P002R7_n5896BarMaqPlan[0] ;
                  A4287BarFasFor = P002R7_A4287BarFasFor[0] ;
                  A4442BarFasDTI = P002R7_A4442BarFasDTI[0] ;
                  n4442BarFasDTI = P002R7_n4442BarFasDTI[0] ;
                  A4443BarFasDTF = P002R7_A4443BarFasDTF[0] ;
                  n4443BarFasDTF = P002R7_n4443BarFasDTF[0] ;
                  A9842BarObsF = P002R7_A9842BarObsF[0] ;
                  n9842BarObsF = P002R7_n9842BarObsF[0] ;
                  A10032BarObsB = P002R7_A10032BarObsB[0] ;
                  n10032BarObsB = P002R7_n10032BarObsB[0] ;
                  AV90BarOrdLin = A194BarOrdLin ;
                  AV91FasCod = A457FasCod ;
                  AV92BarFasEst = A153BarFasEst ;
                  AV93BarFecTeo = A162BarFecTeo ;
                  AV94BarFecRea = A160BarFecRea ;
                  AV95BarTieTeo = A216BarTieTeo ;
                  AV96BarUni = A227BarUni ;
                  AV97BarLoc = A179BarLoc ;
                  AV98BarHorIni = A165BarHorIni ;
                  AV99BarHorFin = A164BarHorFin ;
                  AV100BarTieRea = A215BarTieRea ;
                  AV101MaqCodBis = A603MaqCodBis ;
                  AV107BarFacTin = A150BarFacTin ;
                  AV108BarFasCon = A152BarFasCon ;
                  AV109BarFecRIni = A3298BarFecRIni ;
                  AV118BarNumBot = A4022BarNumBot ;
                  AV122BarFasKgt = A5719BarFasKgT ;
                  AV123BarFasMtt = A5720BarFasMtT ;
                  AV124BarFasKgm = A3837BarFasKgm ;
                  AV125BarFasMtr = A3838BarFasMtr ;
                  AV126BarFasCop = A4301BarFasCoP ;
                  AV127BarFasAcab = A4905BarFasAcab ;
                  AV128barFasFpl = A5047BarFasFPl ;
                  AV129Barfasusu = A5048BarFasUsu ;
                  AV130BarFasGral = A5369BarFasGral ;
                  AV131BarMaqPlan = A5896BarMaqPlan ;
                  AV132Barfasfor = A4287BarFasFor ;
                  AV134Barfasdti = A4442BarFasDTI ;
                  AV135Barfasdtf = A4443BarFasDTF ;
                  AV137BarObsF = A9842BarObsF ;
                  AV138BarObsB = A10032BarObsB ;
                  GXv_char45[0] = AV22EmprCod ;
                  GXv_int12[0] = AV19BarCod ;
                  GXv_int23[0] = AV20BarCodReo ;
                  GXv_char44[0] = AV15BarParPan ;
                  GXv_char43[0] = AV88ProCod ;
                  GXv_int20[0] = AV90BarOrdLin ;
                  GXv_char40[0] = AV91FasCod ;
                  GXv_int22[0] = AV92BarFasEst ;
                  GXv_date36[0] = AV93BarFecTeo ;
                  GXv_date26[0] = AV94BarFecRea ;
                  GXv_date25[0] = AV109BarFecRIni ;
                  GXv_decimal33[0] = AV95BarTieTeo ;
                  GXv_decimal32[0] = AV96BarUni ;
                  GXv_char39[0] = AV97BarLoc ;
                  GXv_int19[0] = AV98BarHorIni ;
                  GXv_int16[0] = AV99BarHorFin ;
                  GXv_decimal31[0] = AV100BarTieRea ;
                  GXv_char38[0] = AV101MaqCodBis ;
                  GXv_char37[0] = AV108BarFasCon ;
                  GXv_char35[0] = AV107BarFacTin ;
                  GXv_int10[0] = AV118BarNumBot ;
                  GXv_decimal30[0] = AV124BarFasKgm ;
                  GXv_decimal27[0] = AV122BarFasKgt ;
                  GXv_decimal14[0] = AV125BarFasMtr ;
                  GXv_decimal13[0] = AV123BarFasMtt ;
                  GXv_char34[0] = AV126BarFasCop ;
                  GXv_char29[0] = AV127BarFasAcab ;
                  GXv_date24[0] = AV128barFasFpl ;
                  GXv_char28[0] = AV129Barfasusu ;
                  GXv_char18[0] = AV130BarFasGral ;
                  GXv_char17[0] = AV131BarMaqPlan ;
                  GXv_char15[0] = AV132Barfasfor ;
                  GXv_dtime42[0] = AV134Barfasdti ;
                  GXv_dtime41[0] = AV135Barfasdtf ;
                  GXv_char4[0] = AV136BarHdro ;
                  GXv_char3[0] = AV137BarObsF ;
                  GXv_char2[0] = AV138BarObsB ;
                  new app.pnewfas(remoteHandle, context).execute( GXv_char45, GXv_int12, GXv_int23, GXv_char44, GXv_char43, GXv_int20, GXv_char40, GXv_int22, GXv_date36, GXv_date26, GXv_date25, GXv_decimal33, GXv_decimal32, GXv_char39, GXv_int19, GXv_int16, GXv_decimal31, GXv_char38, GXv_char37, GXv_char35, GXv_int10, GXv_decimal30, GXv_decimal27, GXv_decimal14, GXv_decimal13, GXv_char34, GXv_char29, GXv_date24, GXv_char28, GXv_char18, GXv_char17, GXv_char15, GXv_dtime42, GXv_dtime41, GXv_char4, GXv_char3, GXv_char2) ;
                  pcrebar.this.AV22EmprCod = GXv_char45[0] ;
                  pcrebar.this.AV19BarCod = GXv_int12[0] ;
                  pcrebar.this.AV20BarCodReo = GXv_int23[0] ;
                  pcrebar.this.AV15BarParPan = GXv_char44[0] ;
                  pcrebar.this.AV88ProCod = GXv_char43[0] ;
                  pcrebar.this.AV90BarOrdLin = GXv_int20[0] ;
                  pcrebar.this.AV91FasCod = GXv_char40[0] ;
                  pcrebar.this.AV92BarFasEst = GXv_int22[0] ;
                  pcrebar.this.AV93BarFecTeo = GXv_date36[0] ;
                  pcrebar.this.AV94BarFecRea = GXv_date26[0] ;
                  pcrebar.this.AV109BarFecRIni = GXv_date25[0] ;
                  pcrebar.this.AV95BarTieTeo = GXv_decimal33[0] ;
                  pcrebar.this.AV96BarUni = GXv_decimal32[0] ;
                  pcrebar.this.AV97BarLoc = GXv_char39[0] ;
                  pcrebar.this.AV98BarHorIni = GXv_int19[0] ;
                  pcrebar.this.AV99BarHorFin = GXv_int16[0] ;
                  pcrebar.this.AV100BarTieRea = GXv_decimal31[0] ;
                  pcrebar.this.AV101MaqCodBis = GXv_char38[0] ;
                  pcrebar.this.AV108BarFasCon = GXv_char37[0] ;
                  pcrebar.this.AV107BarFacTin = GXv_char35[0] ;
                  pcrebar.this.AV118BarNumBot = GXv_int10[0] ;
                  pcrebar.this.AV124BarFasKgm = GXv_decimal30[0] ;
                  pcrebar.this.AV122BarFasKgt = GXv_decimal27[0] ;
                  pcrebar.this.AV125BarFasMtr = GXv_decimal14[0] ;
                  pcrebar.this.AV123BarFasMtt = GXv_decimal13[0] ;
                  pcrebar.this.AV126BarFasCop = GXv_char34[0] ;
                  pcrebar.this.AV127BarFasAcab = GXv_char29[0] ;
                  pcrebar.this.AV128barFasFpl = GXv_date24[0] ;
                  pcrebar.this.AV129Barfasusu = GXv_char28[0] ;
                  pcrebar.this.AV130BarFasGral = GXv_char18[0] ;
                  pcrebar.this.AV131BarMaqPlan = GXv_char17[0] ;
                  pcrebar.this.AV132Barfasfor = GXv_char15[0] ;
                  pcrebar.this.AV134Barfasdti = GXv_dtime42[0] ;
                  pcrebar.this.AV135Barfasdtf = GXv_dtime41[0] ;
                  pcrebar.this.AV136BarHdro = GXv_char4[0] ;
                  pcrebar.this.AV137BarObsF = GXv_char3[0] ;
                  pcrebar.this.AV138BarObsB = GXv_char2[0] ;
                  /* Using cursor P002R8 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  while ( (pr_default.getStatus(5) != 101) )
                  {
                     A1664ParFasCod = P002R8_A1664ParFasCod[0] ;
                     AV121ParFasCod = A1664ParFasCod ;
                     GXv_char45[0] = AV22EmprCod ;
                     GXv_int12[0] = AV16BarCodI ;
                     GXv_int23[0] = AV17BarCodRI ;
                     GXv_char44[0] = AV18BarCodPI ;
                     GXv_char43[0] = AV88ProCod ;
                     GXv_int20[0] = AV90BarOrdLin ;
                     GXv_int19[0] = AV121ParFasCod ;
                     GXv_int10[0] = AV19BarCod ;
                     GXv_int22[0] = AV20BarCodReo ;
                     GXv_char40[0] = AV15BarParPan ;
                     new app.pbarparn(remoteHandle, context).execute( GXv_char45, GXv_int12, GXv_int23, GXv_char44, GXv_char43, GXv_int20, GXv_int19, GXv_int10, GXv_int22, GXv_char40) ;
                     pcrebar.this.AV22EmprCod = GXv_char45[0] ;
                     pcrebar.this.AV16BarCodI = GXv_int12[0] ;
                     pcrebar.this.AV17BarCodRI = GXv_int23[0] ;
                     pcrebar.this.AV18BarCodPI = GXv_char44[0] ;
                     pcrebar.this.AV88ProCod = GXv_char43[0] ;
                     pcrebar.this.AV90BarOrdLin = GXv_int20[0] ;
                     pcrebar.this.AV121ParFasCod = GXv_int19[0] ;
                     pcrebar.this.AV19BarCod = GXv_int10[0] ;
                     pcrebar.this.AV20BarCodReo = GXv_int22[0] ;
                     pcrebar.this.AV15BarParPan = GXv_char40[0] ;
                     pr_default.readNext(5);
                  }
                  pr_default.close(5);
                  pr_default.readNext(4);
               }
               pr_default.close(4);
            }
            else
            {
               /* Using cursor P002R9 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A194BarOrdLin = P002R9_A194BarOrdLin[0] ;
                  A153BarFasEst = P002R9_A153BarFasEst[0] ;
                  A457FasCod = P002R9_A457FasCod[0] ;
                  A162BarFecTeo = P002R9_A162BarFecTeo[0] ;
                  A160BarFecRea = P002R9_A160BarFecRea[0] ;
                  A216BarTieTeo = P002R9_A216BarTieTeo[0] ;
                  A227BarUni = P002R9_A227BarUni[0] ;
                  A179BarLoc = P002R9_A179BarLoc[0] ;
                  A165BarHorIni = P002R9_A165BarHorIni[0] ;
                  A164BarHorFin = P002R9_A164BarHorFin[0] ;
                  A215BarTieRea = P002R9_A215BarTieRea[0] ;
                  A603MaqCodBis = P002R9_A603MaqCodBis[0] ;
                  A150BarFacTin = P002R9_A150BarFacTin[0] ;
                  A152BarFasCon = P002R9_A152BarFasCon[0] ;
                  A3298BarFecRIni = P002R9_A3298BarFecRIni[0] ;
                  A4022BarNumBot = P002R9_A4022BarNumBot[0] ;
                  A5719BarFasKgT = P002R9_A5719BarFasKgT[0] ;
                  n5719BarFasKgT = P002R9_n5719BarFasKgT[0] ;
                  A5720BarFasMtT = P002R9_A5720BarFasMtT[0] ;
                  n5720BarFasMtT = P002R9_n5720BarFasMtT[0] ;
                  A3837BarFasKgm = P002R9_A3837BarFasKgm[0] ;
                  n3837BarFasKgm = P002R9_n3837BarFasKgm[0] ;
                  A3838BarFasMtr = P002R9_A3838BarFasMtr[0] ;
                  n3838BarFasMtr = P002R9_n3838BarFasMtr[0] ;
                  A4301BarFasCoP = P002R9_A4301BarFasCoP[0] ;
                  A4905BarFasAcab = P002R9_A4905BarFasAcab[0] ;
                  A5047BarFasFPl = P002R9_A5047BarFasFPl[0] ;
                  n5047BarFasFPl = P002R9_n5047BarFasFPl[0] ;
                  A5048BarFasUsu = P002R9_A5048BarFasUsu[0] ;
                  n5048BarFasUsu = P002R9_n5048BarFasUsu[0] ;
                  A5369BarFasGral = P002R9_A5369BarFasGral[0] ;
                  n5369BarFasGral = P002R9_n5369BarFasGral[0] ;
                  A5896BarMaqPlan = P002R9_A5896BarMaqPlan[0] ;
                  n5896BarMaqPlan = P002R9_n5896BarMaqPlan[0] ;
                  A4287BarFasFor = P002R9_A4287BarFasFor[0] ;
                  A4442BarFasDTI = P002R9_A4442BarFasDTI[0] ;
                  n4442BarFasDTI = P002R9_n4442BarFasDTI[0] ;
                  A4443BarFasDTF = P002R9_A4443BarFasDTF[0] ;
                  n4443BarFasDTF = P002R9_n4443BarFasDTF[0] ;
                  A9842BarObsF = P002R9_A9842BarObsF[0] ;
                  n9842BarObsF = P002R9_n9842BarObsF[0] ;
                  A10032BarObsB = P002R9_A10032BarObsB[0] ;
                  n10032BarObsB = P002R9_n10032BarObsB[0] ;
                  AV90BarOrdLin = A194BarOrdLin ;
                  AV91FasCod = A457FasCod ;
                  AV92BarFasEst = A153BarFasEst ;
                  AV93BarFecTeo = A162BarFecTeo ;
                  AV94BarFecRea = A160BarFecRea ;
                  AV95BarTieTeo = A216BarTieTeo ;
                  AV96BarUni = A227BarUni ;
                  AV97BarLoc = A179BarLoc ;
                  AV98BarHorIni = A165BarHorIni ;
                  AV99BarHorFin = A164BarHorFin ;
                  AV100BarTieRea = A215BarTieRea ;
                  AV101MaqCodBis = A603MaqCodBis ;
                  AV107BarFacTin = A150BarFacTin ;
                  AV108BarFasCon = A152BarFasCon ;
                  AV109BarFecRIni = A3298BarFecRIni ;
                  AV118BarNumBot = A4022BarNumBot ;
                  AV122BarFasKgt = A5719BarFasKgT ;
                  AV123BarFasMtt = A5720BarFasMtT ;
                  AV124BarFasKgm = A3837BarFasKgm ;
                  AV125BarFasMtr = A3838BarFasMtr ;
                  AV126BarFasCop = A4301BarFasCoP ;
                  AV127BarFasAcab = A4905BarFasAcab ;
                  AV128barFasFpl = A5047BarFasFPl ;
                  AV129Barfasusu = A5048BarFasUsu ;
                  AV130BarFasGral = A5369BarFasGral ;
                  AV131BarMaqPlan = A5896BarMaqPlan ;
                  AV132Barfasfor = A4287BarFasFor ;
                  AV134Barfasdti = A4442BarFasDTI ;
                  AV135Barfasdtf = A4443BarFasDTF ;
                  AV137BarObsF = A9842BarObsF ;
                  AV138BarObsB = A10032BarObsB ;
                  GXv_char45[0] = AV22EmprCod ;
                  GXv_int12[0] = AV19BarCod ;
                  GXv_int23[0] = AV20BarCodReo ;
                  GXv_char44[0] = AV15BarParPan ;
                  GXv_char43[0] = AV88ProCod ;
                  GXv_int20[0] = AV90BarOrdLin ;
                  GXv_char40[0] = AV91FasCod ;
                  GXv_int22[0] = AV92BarFasEst ;
                  GXv_date36[0] = AV93BarFecTeo ;
                  GXv_date26[0] = AV94BarFecRea ;
                  GXv_date25[0] = AV109BarFecRIni ;
                  GXv_decimal33[0] = AV95BarTieTeo ;
                  GXv_decimal32[0] = AV96BarUni ;
                  GXv_char39[0] = AV97BarLoc ;
                  GXv_int19[0] = AV98BarHorIni ;
                  GXv_int16[0] = AV99BarHorFin ;
                  GXv_decimal31[0] = AV100BarTieRea ;
                  GXv_char38[0] = AV101MaqCodBis ;
                  GXv_char37[0] = AV108BarFasCon ;
                  GXv_char35[0] = AV107BarFacTin ;
                  GXv_int10[0] = AV118BarNumBot ;
                  GXv_decimal30[0] = AV124BarFasKgm ;
                  GXv_decimal27[0] = AV122BarFasKgt ;
                  GXv_decimal14[0] = AV125BarFasMtr ;
                  GXv_decimal13[0] = AV123BarFasMtt ;
                  GXv_char34[0] = AV126BarFasCop ;
                  GXv_char29[0] = AV127BarFasAcab ;
                  GXv_date24[0] = AV128barFasFpl ;
                  GXv_char28[0] = AV129Barfasusu ;
                  GXv_char18[0] = AV130BarFasGral ;
                  GXv_char17[0] = AV131BarMaqPlan ;
                  GXv_char15[0] = AV132Barfasfor ;
                  GXv_dtime42[0] = AV134Barfasdti ;
                  GXv_dtime41[0] = AV135Barfasdtf ;
                  GXv_char4[0] = AV136BarHdro ;
                  GXv_char3[0] = AV137BarObsF ;
                  GXv_char2[0] = AV138BarObsB ;
                  new app.pnewfas(remoteHandle, context).execute( GXv_char45, GXv_int12, GXv_int23, GXv_char44, GXv_char43, GXv_int20, GXv_char40, GXv_int22, GXv_date36, GXv_date26, GXv_date25, GXv_decimal33, GXv_decimal32, GXv_char39, GXv_int19, GXv_int16, GXv_decimal31, GXv_char38, GXv_char37, GXv_char35, GXv_int10, GXv_decimal30, GXv_decimal27, GXv_decimal14, GXv_decimal13, GXv_char34, GXv_char29, GXv_date24, GXv_char28, GXv_char18, GXv_char17, GXv_char15, GXv_dtime42, GXv_dtime41, GXv_char4, GXv_char3, GXv_char2) ;
                  pcrebar.this.AV22EmprCod = GXv_char45[0] ;
                  pcrebar.this.AV19BarCod = GXv_int12[0] ;
                  pcrebar.this.AV20BarCodReo = GXv_int23[0] ;
                  pcrebar.this.AV15BarParPan = GXv_char44[0] ;
                  pcrebar.this.AV88ProCod = GXv_char43[0] ;
                  pcrebar.this.AV90BarOrdLin = GXv_int20[0] ;
                  pcrebar.this.AV91FasCod = GXv_char40[0] ;
                  pcrebar.this.AV92BarFasEst = GXv_int22[0] ;
                  pcrebar.this.AV93BarFecTeo = GXv_date36[0] ;
                  pcrebar.this.AV94BarFecRea = GXv_date26[0] ;
                  pcrebar.this.AV109BarFecRIni = GXv_date25[0] ;
                  pcrebar.this.AV95BarTieTeo = GXv_decimal33[0] ;
                  pcrebar.this.AV96BarUni = GXv_decimal32[0] ;
                  pcrebar.this.AV97BarLoc = GXv_char39[0] ;
                  pcrebar.this.AV98BarHorIni = GXv_int19[0] ;
                  pcrebar.this.AV99BarHorFin = GXv_int16[0] ;
                  pcrebar.this.AV100BarTieRea = GXv_decimal31[0] ;
                  pcrebar.this.AV101MaqCodBis = GXv_char38[0] ;
                  pcrebar.this.AV108BarFasCon = GXv_char37[0] ;
                  pcrebar.this.AV107BarFacTin = GXv_char35[0] ;
                  pcrebar.this.AV118BarNumBot = GXv_int10[0] ;
                  pcrebar.this.AV124BarFasKgm = GXv_decimal30[0] ;
                  pcrebar.this.AV122BarFasKgt = GXv_decimal27[0] ;
                  pcrebar.this.AV125BarFasMtr = GXv_decimal14[0] ;
                  pcrebar.this.AV123BarFasMtt = GXv_decimal13[0] ;
                  pcrebar.this.AV126BarFasCop = GXv_char34[0] ;
                  pcrebar.this.AV127BarFasAcab = GXv_char29[0] ;
                  pcrebar.this.AV128barFasFpl = GXv_date24[0] ;
                  pcrebar.this.AV129Barfasusu = GXv_char28[0] ;
                  pcrebar.this.AV130BarFasGral = GXv_char18[0] ;
                  pcrebar.this.AV131BarMaqPlan = GXv_char17[0] ;
                  pcrebar.this.AV132Barfasfor = GXv_char15[0] ;
                  pcrebar.this.AV134Barfasdti = GXv_dtime42[0] ;
                  pcrebar.this.AV135Barfasdtf = GXv_dtime41[0] ;
                  pcrebar.this.AV136BarHdro = GXv_char4[0] ;
                  pcrebar.this.AV137BarObsF = GXv_char3[0] ;
                  pcrebar.this.AV138BarObsB = GXv_char2[0] ;
                  /* Using cursor P002R10 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  while ( (pr_default.getStatus(7) != 101) )
                  {
                     A1664ParFasCod = P002R10_A1664ParFasCod[0] ;
                     AV121ParFasCod = A1664ParFasCod ;
                     GXv_char45[0] = AV22EmprCod ;
                     GXv_int12[0] = AV16BarCodI ;
                     GXv_int23[0] = AV17BarCodRI ;
                     GXv_char44[0] = AV18BarCodPI ;
                     GXv_char43[0] = AV88ProCod ;
                     GXv_int20[0] = AV90BarOrdLin ;
                     GXv_int19[0] = AV121ParFasCod ;
                     GXv_int10[0] = AV19BarCod ;
                     GXv_int22[0] = AV20BarCodReo ;
                     GXv_char40[0] = AV15BarParPan ;
                     new app.pbarparn(remoteHandle, context).execute( GXv_char45, GXv_int12, GXv_int23, GXv_char44, GXv_char43, GXv_int20, GXv_int19, GXv_int10, GXv_int22, GXv_char40) ;
                     pcrebar.this.AV22EmprCod = GXv_char45[0] ;
                     pcrebar.this.AV16BarCodI = GXv_int12[0] ;
                     pcrebar.this.AV17BarCodRI = GXv_int23[0] ;
                     pcrebar.this.AV18BarCodPI = GXv_char44[0] ;
                     pcrebar.this.AV88ProCod = GXv_char43[0] ;
                     pcrebar.this.AV90BarOrdLin = GXv_int20[0] ;
                     pcrebar.this.AV121ParFasCod = GXv_int19[0] ;
                     pcrebar.this.AV19BarCod = GXv_int10[0] ;
                     pcrebar.this.AV20BarCodReo = GXv_int22[0] ;
                     pcrebar.this.AV15BarParPan = GXv_char40[0] ;
                     pr_default.readNext(7);
                  }
                  pr_default.close(7);
                  /* Using cursor P002R11 */
                  pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  while ( (pr_default.getStatus(8) != 101) )
                  {
                     A10781BarFasNb = P002R11_A10781BarFasNb[0] ;
                     AV139BarFasNb = A10781BarFasNb ;
                     GXv_char45[0] = AV22EmprCod ;
                     GXv_int12[0] = AV16BarCodI ;
                     GXv_int23[0] = AV17BarCodRI ;
                     GXv_char44[0] = AV18BarCodPI ;
                     GXv_char43[0] = AV88ProCod ;
                     GXv_int20[0] = AV90BarOrdLin ;
                     GXv_int10[0] = AV139BarFasNb ;
                     GXv_int8[0] = AV19BarCod ;
                     GXv_int22[0] = AV20BarCodReo ;
                     GXv_char40[0] = AV15BarParPan ;
                     new app.pfasbotnew(remoteHandle, context).execute( GXv_char45, GXv_int12, GXv_int23, GXv_char44, GXv_char43, GXv_int20, GXv_int10, GXv_int8, GXv_int22, GXv_char40) ;
                     pcrebar.this.AV22EmprCod = GXv_char45[0] ;
                     pcrebar.this.AV16BarCodI = GXv_int12[0] ;
                     pcrebar.this.AV17BarCodRI = GXv_int23[0] ;
                     pcrebar.this.AV18BarCodPI = GXv_char44[0] ;
                     pcrebar.this.AV88ProCod = GXv_char43[0] ;
                     pcrebar.this.AV90BarOrdLin = GXv_int20[0] ;
                     pcrebar.this.AV139BarFasNb = GXv_int10[0] ;
                     pcrebar.this.AV19BarCod = GXv_int8[0] ;
                     pcrebar.this.AV20BarCodReo = GXv_int22[0] ;
                     pcrebar.this.AV15BarParPan = GXv_char40[0] ;
                     pr_default.readNext(8);
                  }
                  pr_default.close(8);
                  pr_default.readNext(6);
               }
               pr_default.close(6);
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( ( AV119F_carvema == 1 ) || ( AV140WorkNotas == 1 ) )
         {
            /* Using cursor P002R12 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A187BarNotDsc = P002R12_A187BarNotDsc[0] ;
               A188BarNotLin = P002R12_A188BarNotLin[0] ;
               W396EmprCod = A396EmprCod ;
               W129BarCod = A129BarCod ;
               W132BarCodReo = A132BarCodReo ;
               W130BarCodPar = A130BarCodPar ;
               /*
                  INSERT RECORD ON TABLE TXPBARNOT

               */
               W396EmprCod = A396EmprCod ;
               W129BarCod = A129BarCod ;
               W132BarCodReo = A132BarCodReo ;
               W130BarCodPar = A130BarCodPar ;
               W188BarNotLin = A188BarNotLin ;
               W187BarNotDsc = A187BarNotDsc ;
               A396EmprCod = AV22EmprCod ;
               A129BarCod = AV19BarCod ;
               A132BarCodReo = AV20BarCodReo ;
               A130BarCodPar = AV15BarParPan ;
               /* Using cursor P002R13 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A188BarNotLin), A187BarNotDsc});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
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
               A188BarNotLin = W188BarNotLin ;
               A187BarNotDsc = W187BarNotDsc ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A129BarCod = W129BarCod ;
               A132BarCodReo = W132BarCodReo ;
               A130BarCodPar = W130BarCodPar ;
               pr_default.readNext(9);
            }
            pr_default.close(9);
         }
         if ( AV133Texfina == 1 )
         {
            /* Using cursor P002R14 */
            pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCodI), Byte.valueOf(AV17BarCodRI), AV18BarCodPI});
            while ( (pr_default.getStatus(11) != 101) )
            {
               A6967Mat_Hdp = P002R14_A6967Mat_Hdp[0] ;
               A6966Mat_Hdr = P002R14_A6966Mat_Hdr[0] ;
               A6965Mat_Hd = P002R14_A6965Mat_Hd[0] ;
               A7397Mat_FecIng = P002R14_A7397Mat_FecIng[0] ;
               n7397Mat_FecIng = P002R14_n7397Mat_FecIng[0] ;
               A7396Mat_HdKPr = P002R14_A7396Mat_HdKPr[0] ;
               n7396Mat_HdKPr = P002R14_n7396Mat_HdKPr[0] ;
               A6971Mat_Pzas = P002R14_A6971Mat_Pzas[0] ;
               n6971Mat_Pzas = P002R14_n6971Mat_Pzas[0] ;
               A6970Mat_HdGuia = P002R14_A6970Mat_HdGuia[0] ;
               n6970Mat_HdGuia = P002R14_n6970Mat_HdGuia[0] ;
               A6969Mat_HdKgs = P002R14_A6969Mat_HdKgs[0] ;
               n6969Mat_HdKgs = P002R14_n6969Mat_HdKgs[0] ;
               A6968Mat_HdUl = P002R14_A6968Mat_HdUl[0] ;
               n6968Mat_HdUl = P002R14_n6968Mat_HdUl[0] ;
               W396EmprCod = A396EmprCod ;
               W6965Mat_Hd = A6965Mat_Hd ;
               W6966Mat_Hdr = A6966Mat_Hdr ;
               W6967Mat_Hdp = A6967Mat_Hdp ;
               /*
                  INSERT RECORD ON TABLE TXPHDRMAT

               */
               W396EmprCod = A396EmprCod ;
               W6965Mat_Hd = A6965Mat_Hd ;
               W6966Mat_Hdr = A6966Mat_Hdr ;
               W6967Mat_Hdp = A6967Mat_Hdp ;
               A396EmprCod = AV22EmprCod ;
               A6965Mat_Hd = AV19BarCod ;
               A6966Mat_Hdr = AV20BarCodReo ;
               A6967Mat_Hdp = AV15BarParPan ;
               /* Using cursor P002R15 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, Boolean.valueOf(n6968Mat_HdUl), Short.valueOf(A6968Mat_HdUl), Boolean.valueOf(n6969Mat_HdKgs), A6969Mat_HdKgs, Boolean.valueOf(n6970Mat_HdGuia), A6970Mat_HdGuia, Boolean.valueOf(n6971Mat_Pzas), Integer.valueOf(A6971Mat_Pzas), Boolean.valueOf(n7396Mat_HdKPr), A7396Mat_HdKPr, Boolean.valueOf(n7397Mat_FecIng), A7397Mat_FecIng});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMAT");
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
               A6965Mat_Hd = W6965Mat_Hd ;
               A6966Mat_Hdr = W6966Mat_Hdr ;
               A6967Mat_Hdp = W6967Mat_Hdp ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A6965Mat_Hd = W6965Mat_Hd ;
               A6966Mat_Hdr = W6966Mat_Hdr ;
               A6967Mat_Hdp = W6967Mat_Hdp ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(11);
            /* Using cursor P002R16 */
            pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCodI), Byte.valueOf(AV17BarCodRI), AV18BarCodPI});
            while ( (pr_default.getStatus(13) != 101) )
            {
               A6981Mat_HdObs = P002R16_A6981Mat_HdObs[0] ;
               n6981Mat_HdObs = P002R16_n6981Mat_HdObs[0] ;
               A6967Mat_Hdp = P002R16_A6967Mat_Hdp[0] ;
               A6966Mat_Hdr = P002R16_A6966Mat_Hdr[0] ;
               A6965Mat_Hd = P002R16_A6965Mat_Hd[0] ;
               A7238Mat_RecM = P002R16_A7238Mat_RecM[0] ;
               n7238Mat_RecM = P002R16_n7238Mat_RecM[0] ;
               A7108Mat_TraInt = P002R16_A7108Mat_TraInt[0] ;
               n7108Mat_TraInt = P002R16_n7108Mat_TraInt[0] ;
               A7107Mat_CliRm = P002R16_A7107Mat_CliRm[0] ;
               n7107Mat_CliRm = P002R16_n7107Mat_CliRm[0] ;
               A7106Mat_MaqTej = P002R16_A7106Mat_MaqTej[0] ;
               n7106Mat_MaqTej = P002R16_n7106Mat_MaqTej[0] ;
               A6980Mat_HdLm = P002R16_A6980Mat_HdLm[0] ;
               n6980Mat_HdLm = P002R16_n6980Mat_HdLm[0] ;
               A6979Mat_HdPorc = P002R16_A6979Mat_HdPorc[0] ;
               n6979Mat_HdPorc = P002R16_n6979Mat_HdPorc[0] ;
               A6978Mat_HdLote = P002R16_A6978Mat_HdLote[0] ;
               n6978Mat_HdLote = P002R16_n6978Mat_HdLote[0] ;
               A6977Mat_HdProv = P002R16_A6977Mat_HdProv[0] ;
               n6977Mat_HdProv = P002R16_n6977Mat_HdProv[0] ;
               A6976Mat_HdNomc = P002R16_A6976Mat_HdNomc[0] ;
               n6976Mat_HdNomc = P002R16_n6976Mat_HdNomc[0] ;
               A6975Mat_HdTor = P002R16_A6975Mat_HdTor[0] ;
               n6975Mat_HdTor = P002R16_n6975Mat_HdTor[0] ;
               A6974Mat_HdMat = P002R16_A6974Mat_HdMat[0] ;
               n6974Mat_HdMat = P002R16_n6974Mat_HdMat[0] ;
               A6973Mat_HdEst = P002R16_A6973Mat_HdEst[0] ;
               n6973Mat_HdEst = P002R16_n6973Mat_HdEst[0] ;
               A6972Mat_HdLin = P002R16_A6972Mat_HdLin[0] ;
               W396EmprCod = A396EmprCod ;
               W6965Mat_Hd = A6965Mat_Hd ;
               W6966Mat_Hdr = A6966Mat_Hdr ;
               W6967Mat_Hdp = A6967Mat_Hdp ;
               /*
                  INSERT RECORD ON TABLE TXPHDRMA1

               */
               W396EmprCod = A396EmprCod ;
               W6965Mat_Hd = A6965Mat_Hd ;
               W6966Mat_Hdr = A6966Mat_Hdr ;
               W6967Mat_Hdp = A6967Mat_Hdp ;
               W6972Mat_HdLin = A6972Mat_HdLin ;
               A396EmprCod = AV22EmprCod ;
               A6965Mat_Hd = AV19BarCod ;
               A6966Mat_Hdr = AV20BarCodReo ;
               A6967Mat_Hdp = AV15BarParPan ;
               /* Using cursor P002R17 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, Short.valueOf(A6972Mat_HdLin), Boolean.valueOf(n6973Mat_HdEst), A6973Mat_HdEst, Boolean.valueOf(n6974Mat_HdMat), A6974Mat_HdMat, Boolean.valueOf(n6975Mat_HdTor), A6975Mat_HdTor, Boolean.valueOf(n6976Mat_HdNomc), A6976Mat_HdNomc, Boolean.valueOf(n6977Mat_HdProv), A6977Mat_HdProv, Boolean.valueOf(n6978Mat_HdLote), A6978Mat_HdLote, Boolean.valueOf(n6979Mat_HdPorc), A6979Mat_HdPorc, Boolean.valueOf(n6980Mat_HdLm), A6980Mat_HdLm, Boolean.valueOf(n6981Mat_HdObs), A6981Mat_HdObs, Boolean.valueOf(n7106Mat_MaqTej), A7106Mat_MaqTej, Boolean.valueOf(n7107Mat_CliRm), A7107Mat_CliRm, Boolean.valueOf(n7108Mat_TraInt), Long.valueOf(A7108Mat_TraInt), Boolean.valueOf(n7238Mat_RecM), Integer.valueOf(A7238Mat_RecM)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMA1");
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
               A6965Mat_Hd = W6965Mat_Hd ;
               A6966Mat_Hdr = W6966Mat_Hdr ;
               A6967Mat_Hdp = W6967Mat_Hdp ;
               A6972Mat_HdLin = W6972Mat_HdLin ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A6965Mat_Hd = W6965Mat_Hd ;
               A6966Mat_Hdr = W6966Mat_Hdr ;
               A6967Mat_Hdp = W6967Mat_Hdp ;
               pr_default.readNext(13);
            }
            pr_default.close(13);
            /* Using cursor P002R18 */
            pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCodI), Byte.valueOf(AV17BarCodRI), AV18BarCodPI});
            while ( (pr_default.getStatus(15) != 101) )
            {
               A6967Mat_Hdp = P002R18_A6967Mat_Hdp[0] ;
               A6966Mat_Hdr = P002R18_A6966Mat_Hdr[0] ;
               A6965Mat_Hd = P002R18_A6965Mat_Hd[0] ;
               A7239Mat_RecT = P002R18_A7239Mat_RecT[0] ;
               n7239Mat_RecT = P002R18_n7239Mat_RecT[0] ;
               A8049Mat_HdKgTl = P002R18_A8049Mat_HdKgTl[0] ;
               n8049Mat_HdKgTl = P002R18_n8049Mat_HdKgTl[0] ;
               A7008Mat_HdUnTl = P002R18_A7008Mat_HdUnTl[0] ;
               n7008Mat_HdUnTl = P002R18_n7008Mat_HdUnTl[0] ;
               A7007Mat_HdTl = P002R18_A7007Mat_HdTl[0] ;
               W396EmprCod = A396EmprCod ;
               W6965Mat_Hd = A6965Mat_Hd ;
               W6966Mat_Hdr = A6966Mat_Hdr ;
               W6967Mat_Hdp = A6967Mat_Hdp ;
               /*
                  INSERT RECORD ON TABLE TXPHDRTAL

               */
               W396EmprCod = A396EmprCod ;
               W6965Mat_Hd = A6965Mat_Hd ;
               W6966Mat_Hdr = A6966Mat_Hdr ;
               W6967Mat_Hdp = A6967Mat_Hdp ;
               W7007Mat_HdTl = A7007Mat_HdTl ;
               A396EmprCod = AV22EmprCod ;
               A6965Mat_Hd = AV19BarCod ;
               A6966Mat_Hdr = AV20BarCodReo ;
               A6967Mat_Hdp = AV15BarParPan ;
               /* Using cursor P002R19 */
               pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A6965Mat_Hd), Byte.valueOf(A6966Mat_Hdr), A6967Mat_Hdp, A7007Mat_HdTl, Boolean.valueOf(n7008Mat_HdUnTl), Integer.valueOf(A7008Mat_HdUnTl), Boolean.valueOf(n8049Mat_HdKgTl), A8049Mat_HdKgTl, Boolean.valueOf(n7239Mat_RecT), Integer.valueOf(A7239Mat_RecT)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRTAL");
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
               A6965Mat_Hd = W6965Mat_Hd ;
               A6966Mat_Hdr = W6966Mat_Hdr ;
               A6967Mat_Hdp = W6967Mat_Hdp ;
               A7007Mat_HdTl = W7007Mat_HdTl ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A6965Mat_Hd = W6965Mat_Hd ;
               A6966Mat_Hdr = W6966Mat_Hdr ;
               A6967Mat_Hdp = W6967Mat_Hdp ;
               pr_default.readNext(15);
            }
            pr_default.close(15);
         }
         AV141Inc_obs = httpContext.getMessage( "Se ha creado la Hdr ", "") + GXutil.trim( GXutil.str( AV19BarCod, 8, 0)) + "-" + GXutil.str( AV20BarCodReo, 1, 0) + AV15BarParPan + GXutil.newLine( ) ;
         AV141Inc_obs += httpContext.getMessage( "a partir de la Hdr ", "") + GXutil.trim( GXutil.str( AV16BarCodI, 8, 0)) + "-" + GXutil.str( AV17BarCodRI, 1, 0) + AV18BarCodPI + GXutil.newLine( ) ;
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV141Inc_obs, " ") != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV159Pgmname, AV143UsurCod, AV144station, AV141Inc_obs, AV16BarCodI, AV17BarCodRI, AV18BarCodPI) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcrebar.this.A396EmprCod;
      this.aP1[0] = pcrebar.this.AV16BarCodI;
      this.aP2[0] = pcrebar.this.AV17BarCodRI;
      this.aP3[0] = pcrebar.this.AV18BarCodPI;
      this.aP4[0] = pcrebar.this.AV19BarCod;
      this.aP5[0] = pcrebar.this.AV20BarCodReo;
      this.aP6[0] = pcrebar.this.AV15BarParPan;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcrebar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV144station = "" ;
      GXt_char1 = "" ;
      AV142EmprNom = "" ;
      AV143UsurCod = "" ;
      AV141Inc_obs = "" ;
      scmdbuf = "" ;
      P002R3_A396EmprCod = new String[] {""} ;
      P002R3_A130BarCodPar = new String[] {""} ;
      P002R3_A132BarCodReo = new byte[1] ;
      P002R3_A129BarCod = new int[1] ;
      P002R3_A361DisCod = new int[1] ;
      P002R3_A365DisDes = new String[] {""} ;
      P002R3_A143BarDisNum = new String[] {""} ;
      P002R3_A212BarSer = new String[] {""} ;
      P002R3_A217BarTipArt = new short[1] ;
      P002R3_n217BarTipArt = new boolean[] {false} ;
      P002R3_A135BarColNom = new String[] {""} ;
      P002R3_A136BarColNum = new int[1] ;
      P002R3_A218BarTipCol = new byte[1] ;
      P002R3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P002R3_A228BarUniMed = new String[] {""} ;
      P002R3_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P002R3_A157BarFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P002R3_A180BarMaqCod = new String[] {""} ;
      P002R3_A193BarOpeEsp = new byte[1] ;
      P002R3_A235BarUrg = new byte[1] ;
      P002R3_A182BarMat = new String[] {""} ;
      P002R3_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R3_A221BarTra1 = new String[] {""} ;
      P002R3_A224BarTraP1 = new short[1] ;
      P002R3_A222BarTra2 = new String[] {""} ;
      P002R3_A225BarTraP2 = new short[1] ;
      P002R3_A223BarTra3 = new String[] {""} ;
      P002R3_A226BarTraP3 = new short[1] ;
      P002R3_A229BarUrd1 = new String[] {""} ;
      P002R3_A232BarUrdP1 = new short[1] ;
      P002R3_A230BarUrd2 = new String[] {""} ;
      P002R3_A233BarUrdP2 = new short[1] ;
      P002R3_A231BarUrd3 = new String[] {""} ;
      P002R3_A234BarUrdP3 = new short[1] ;
      P002R3_A127BarAncCru1 = new short[1] ;
      P002R3_A128BarAncCru2 = new short[1] ;
      P002R3_A125BarAncAca1 = new short[1] ;
      P002R3_A126BarAncAca2 = new short[1] ;
      P002R3_A206BarPle = new String[] {""} ;
      P002R3_A177BarLar = new String[] {""} ;
      P002R3_A214BarSua = new String[] {""} ;
      P002R3_A118BarAcaQui = new String[] {""} ;
      P002R3_A139BarCorOri = new String[] {""} ;
      P002R3_A145BarEncOri = new String[] {""} ;
      P002R3_A213BarSit = new byte[1] ;
      P002R3_A146BarEst = new byte[1] ;
      P002R3_A147BarEstCol = new byte[1] ;
      P002R3_A209BarPri = new String[] {""} ;
      P002R3_A138BarConReo = new byte[1] ;
      P002R3_A137BarConPar = new String[] {""} ;
      P002R3_A189BarNumAny = new short[1] ;
      P002R3_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R3_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R3_A169BarKgsFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R3_A148BarEstReo = new byte[1] ;
      P002R3_A196BarOrdReo = new byte[1] ;
      P002R3_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P002R3_A120BarAgrEst = new String[] {""} ;
      P002R3_A864BarPes = new short[1] ;
      P002R3_A833TipDefCod = new short[1] ;
      P002R3_n833TipDefCod = new boolean[] {false} ;
      P002R3_A899TipDefPor = new short[1] ;
      P002R3_n899TipDefPor = new boolean[] {false} ;
      P002R3_A904ObsReoEnt = new String[] {""} ;
      P002R3_n904ObsReoEnt = new boolean[] {false} ;
      P002R3_A905ObsReoULin = new byte[1] ;
      P002R3_n905ObsReoULin = new boolean[] {false} ;
      P002R3_A921BarMatiz = new short[1] ;
      P002R3_A1226BarGraCru = new short[1] ;
      P002R3_A1234BarNomCli = new String[] {""} ;
      P002R3_A1235BarNumCli = new int[1] ;
      P002R3_A1223BarEncCom = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R3_A1224BarEncAnh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R3_A1254BarPesBal = new byte[1] ;
      P002R3_A1431BarLocDis = new String[] {""} ;
      P002R3_A898BarPieNDes = new int[1] ;
      P002R3_n898BarPieNDes = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A365DisDes = "" ;
      A143BarDisNum = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A228BarUniMed = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A157BarFecEnt = GXutil.nullDate() ;
      A180BarMaqCod = "" ;
      A182BarMat = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A229BarUrd1 = "" ;
      A230BarUrd2 = "" ;
      A231BarUrd3 = "" ;
      A206BarPle = "" ;
      A177BarLar = "" ;
      A214BarSua = "" ;
      A118BarAcaQui = "" ;
      A139BarCorOri = "" ;
      A145BarEncOri = "" ;
      A209BarPri = "" ;
      A137BarConPar = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A169BarKgsFac = DecimalUtil.ZERO ;
      A158BarFecFpr = GXutil.nullDate() ;
      A120BarAgrEst = "" ;
      A904ObsReoEnt = "" ;
      A1234BarNomCli = "" ;
      A1223BarEncCom = DecimalUtil.ZERO ;
      A1224BarEncAnh = DecimalUtil.ZERO ;
      A1431BarLocDis = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      AV22EmprCod = "" ;
      AV24DisDes = "" ;
      AV25BarDisNum = "" ;
      AV26BarSer = "" ;
      AV28BarColNom = "" ;
      AV31BarFecGen = GXutil.nullDate() ;
      AV32BarUniMed = "" ;
      AV33BarFecCli = GXutil.nullDate() ;
      AV34BarFecEnt = GXutil.nullDate() ;
      AV35BarMaqCod = "" ;
      AV38BarMat = "" ;
      AV39BarRdt = DecimalUtil.ZERO ;
      AV40BarTra1 = "" ;
      AV42BarTra2 = "" ;
      AV44BarTra3 = "" ;
      AV46BarUrd1 = "" ;
      AV48BarUrd2 = "" ;
      AV50BarUrd3 = "" ;
      AV56BarPle = "" ;
      AV57BarLar = "" ;
      AV58BarSua = "" ;
      AV59BarAcaQui = "" ;
      AV60BarCorOri = "" ;
      AV61BarEncOri = "" ;
      AV65BarPri = "" ;
      AV67BarConPar = "" ;
      AV69BarCosPro = DecimalUtil.ZERO ;
      AV70BarCosAny = DecimalUtil.ZERO ;
      AV71BarKgsFac = DecimalUtil.ZERO ;
      AV74BarFecFpr = GXutil.nullDate() ;
      AV75BarAgrEst = "" ;
      AV79ObsReoEnt = "" ;
      AV83BarNomCli = "" ;
      AV85BarEncCom = DecimalUtil.ZERO ;
      AV86BarEncAnh = DecimalUtil.ZERO ;
      AV105BarLocDis = "" ;
      AV136BarHdro = "" ;
      GXv_int7 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int11 = new byte[1] ;
      GXv_int21 = new byte[1] ;
      A1141DisBarPar = "" ;
      Gx_emsg = "" ;
      P002R5_A396EmprCod = new String[] {""} ;
      P002R5_A129BarCod = new int[1] ;
      P002R5_A132BarCodReo = new byte[1] ;
      P002R5_A130BarCodPar = new String[] {""} ;
      P002R5_A758ProCod = new String[] {""} ;
      P002R5_A761ProFasLin = new short[1] ;
      P002R5_n761ProFasLin = new boolean[] {false} ;
      A758ProCod = "" ;
      AV88ProCod = "" ;
      P002R6_A396EmprCod = new String[] {""} ;
      P002R6_A129BarCod = new int[1] ;
      P002R6_A132BarCodReo = new byte[1] ;
      P002R6_A130BarCodPar = new String[] {""} ;
      P002R6_A758ProCod = new String[] {""} ;
      P002R6_A194BarOrdLin = new short[1] ;
      P002R6_A457FasCod = new String[] {""} ;
      P002R6_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      P002R6_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R6_A179BarLoc = new String[] {""} ;
      P002R6_A603MaqCodBis = new String[] {""} ;
      P002R6_A150BarFacTin = new String[] {""} ;
      P002R6_A152BarFasCon = new String[] {""} ;
      P002R6_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P002R6_A4022BarNumBot = new int[1] ;
      P002R6_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R6_n5719BarFasKgT = new boolean[] {false} ;
      P002R6_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R6_n5720BarFasMtT = new boolean[] {false} ;
      P002R6_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R6_n3837BarFasKgm = new boolean[] {false} ;
      P002R6_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R6_n3838BarFasMtr = new boolean[] {false} ;
      P002R6_A4301BarFasCoP = new String[] {""} ;
      P002R6_A4905BarFasAcab = new String[] {""} ;
      P002R6_A5047BarFasFPl = new java.util.Date[] {GXutil.nullDate()} ;
      P002R6_n5047BarFasFPl = new boolean[] {false} ;
      P002R6_A5048BarFasUsu = new String[] {""} ;
      P002R6_n5048BarFasUsu = new boolean[] {false} ;
      P002R6_A5369BarFasGral = new String[] {""} ;
      P002R6_n5369BarFasGral = new boolean[] {false} ;
      P002R6_A5896BarMaqPlan = new String[] {""} ;
      P002R6_n5896BarMaqPlan = new boolean[] {false} ;
      P002R6_A4287BarFasFor = new String[] {""} ;
      P002R6_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P002R6_n4442BarFasDTI = new boolean[] {false} ;
      P002R6_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P002R6_n4443BarFasDTF = new boolean[] {false} ;
      P002R6_A9842BarObsF = new String[] {""} ;
      P002R6_n9842BarObsF = new boolean[] {false} ;
      P002R6_A10032BarObsB = new String[] {""} ;
      P002R6_n10032BarObsB = new boolean[] {false} ;
      A457FasCod = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A179BarLoc = "" ;
      A603MaqCodBis = "" ;
      A150BarFacTin = "" ;
      A152BarFasCon = "" ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A4301BarFasCoP = "" ;
      A4905BarFasAcab = "" ;
      A5047BarFasFPl = GXutil.nullDate() ;
      A5048BarFasUsu = "" ;
      A5369BarFasGral = "" ;
      A5896BarMaqPlan = "" ;
      A4287BarFasFor = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A9842BarObsF = "" ;
      A10032BarObsB = "" ;
      AV91FasCod = "" ;
      AV93BarFecTeo = GXutil.nullDate() ;
      AV94BarFecRea = GXutil.nullDate() ;
      AV95BarTieTeo = DecimalUtil.ZERO ;
      AV96BarUni = DecimalUtil.ZERO ;
      A227BarUni = DecimalUtil.ZERO ;
      AV97BarLoc = "" ;
      AV100BarTieRea = DecimalUtil.ZERO ;
      A215BarTieRea = DecimalUtil.ZERO ;
      AV101MaqCodBis = "" ;
      AV107BarFacTin = "" ;
      AV108BarFasCon = "" ;
      AV109BarFecRIni = GXutil.nullDate() ;
      AV122BarFasKgt = DecimalUtil.ZERO ;
      AV123BarFasMtt = DecimalUtil.ZERO ;
      AV124BarFasKgm = DecimalUtil.ZERO ;
      AV125BarFasMtr = DecimalUtil.ZERO ;
      AV126BarFasCop = "" ;
      AV127BarFasAcab = "" ;
      AV128barFasFpl = GXutil.nullDate() ;
      AV129Barfasusu = "" ;
      AV130BarFasGral = "" ;
      AV131BarMaqPlan = "" ;
      AV132Barfasfor = "" ;
      AV134Barfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV135Barfasdtf = GXutil.resetTime( GXutil.nullDate() );
      AV137BarObsF = "" ;
      AV138BarObsB = "" ;
      P002R7_A396EmprCod = new String[] {""} ;
      P002R7_A129BarCod = new int[1] ;
      P002R7_A132BarCodReo = new byte[1] ;
      P002R7_A130BarCodPar = new String[] {""} ;
      P002R7_A758ProCod = new String[] {""} ;
      P002R7_A194BarOrdLin = new short[1] ;
      P002R7_A457FasCod = new String[] {""} ;
      P002R7_A153BarFasEst = new byte[1] ;
      P002R7_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      P002R7_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P002R7_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R7_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R7_A179BarLoc = new String[] {""} ;
      P002R7_A165BarHorIni = new short[1] ;
      P002R7_A164BarHorFin = new short[1] ;
      P002R7_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R7_A603MaqCodBis = new String[] {""} ;
      P002R7_A150BarFacTin = new String[] {""} ;
      P002R7_A152BarFasCon = new String[] {""} ;
      P002R7_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P002R7_A4022BarNumBot = new int[1] ;
      P002R7_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R7_n5719BarFasKgT = new boolean[] {false} ;
      P002R7_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R7_n5720BarFasMtT = new boolean[] {false} ;
      P002R7_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R7_n3837BarFasKgm = new boolean[] {false} ;
      P002R7_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R7_n3838BarFasMtr = new boolean[] {false} ;
      P002R7_A4301BarFasCoP = new String[] {""} ;
      P002R7_A4905BarFasAcab = new String[] {""} ;
      P002R7_A5047BarFasFPl = new java.util.Date[] {GXutil.nullDate()} ;
      P002R7_n5047BarFasFPl = new boolean[] {false} ;
      P002R7_A5048BarFasUsu = new String[] {""} ;
      P002R7_n5048BarFasUsu = new boolean[] {false} ;
      P002R7_A5369BarFasGral = new String[] {""} ;
      P002R7_n5369BarFasGral = new boolean[] {false} ;
      P002R7_A5896BarMaqPlan = new String[] {""} ;
      P002R7_n5896BarMaqPlan = new boolean[] {false} ;
      P002R7_A4287BarFasFor = new String[] {""} ;
      P002R7_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P002R7_n4442BarFasDTI = new boolean[] {false} ;
      P002R7_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P002R7_n4443BarFasDTF = new boolean[] {false} ;
      P002R7_A9842BarObsF = new String[] {""} ;
      P002R7_n9842BarObsF = new boolean[] {false} ;
      P002R7_A10032BarObsB = new String[] {""} ;
      P002R7_n10032BarObsB = new boolean[] {false} ;
      A160BarFecRea = GXutil.nullDate() ;
      P002R8_A396EmprCod = new String[] {""} ;
      P002R8_A129BarCod = new int[1] ;
      P002R8_A132BarCodReo = new byte[1] ;
      P002R8_A130BarCodPar = new String[] {""} ;
      P002R8_A758ProCod = new String[] {""} ;
      P002R8_A194BarOrdLin = new short[1] ;
      P002R8_A1664ParFasCod = new short[1] ;
      P002R9_A396EmprCod = new String[] {""} ;
      P002R9_A129BarCod = new int[1] ;
      P002R9_A132BarCodReo = new byte[1] ;
      P002R9_A130BarCodPar = new String[] {""} ;
      P002R9_A758ProCod = new String[] {""} ;
      P002R9_A194BarOrdLin = new short[1] ;
      P002R9_A153BarFasEst = new byte[1] ;
      P002R9_A457FasCod = new String[] {""} ;
      P002R9_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      P002R9_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P002R9_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R9_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R9_A179BarLoc = new String[] {""} ;
      P002R9_A165BarHorIni = new short[1] ;
      P002R9_A164BarHorFin = new short[1] ;
      P002R9_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R9_A603MaqCodBis = new String[] {""} ;
      P002R9_A150BarFacTin = new String[] {""} ;
      P002R9_A152BarFasCon = new String[] {""} ;
      P002R9_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P002R9_A4022BarNumBot = new int[1] ;
      P002R9_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R9_n5719BarFasKgT = new boolean[] {false} ;
      P002R9_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R9_n5720BarFasMtT = new boolean[] {false} ;
      P002R9_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R9_n3837BarFasKgm = new boolean[] {false} ;
      P002R9_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R9_n3838BarFasMtr = new boolean[] {false} ;
      P002R9_A4301BarFasCoP = new String[] {""} ;
      P002R9_A4905BarFasAcab = new String[] {""} ;
      P002R9_A5047BarFasFPl = new java.util.Date[] {GXutil.nullDate()} ;
      P002R9_n5047BarFasFPl = new boolean[] {false} ;
      P002R9_A5048BarFasUsu = new String[] {""} ;
      P002R9_n5048BarFasUsu = new boolean[] {false} ;
      P002R9_A5369BarFasGral = new String[] {""} ;
      P002R9_n5369BarFasGral = new boolean[] {false} ;
      P002R9_A5896BarMaqPlan = new String[] {""} ;
      P002R9_n5896BarMaqPlan = new boolean[] {false} ;
      P002R9_A4287BarFasFor = new String[] {""} ;
      P002R9_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P002R9_n4442BarFasDTI = new boolean[] {false} ;
      P002R9_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P002R9_n4443BarFasDTF = new boolean[] {false} ;
      P002R9_A9842BarObsF = new String[] {""} ;
      P002R9_n9842BarObsF = new boolean[] {false} ;
      P002R9_A10032BarObsB = new String[] {""} ;
      P002R9_n10032BarObsB = new boolean[] {false} ;
      GXv_date36 = new java.util.Date[1] ;
      GXv_date26 = new java.util.Date[1] ;
      GXv_date25 = new java.util.Date[1] ;
      GXv_decimal33 = new java.math.BigDecimal[1] ;
      GXv_decimal32 = new java.math.BigDecimal[1] ;
      GXv_char39 = new String[1] ;
      GXv_int16 = new short[1] ;
      GXv_decimal31 = new java.math.BigDecimal[1] ;
      GXv_char38 = new String[1] ;
      GXv_char37 = new String[1] ;
      GXv_char35 = new String[1] ;
      GXv_decimal30 = new java.math.BigDecimal[1] ;
      GXv_decimal27 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_char34 = new String[1] ;
      GXv_char29 = new String[1] ;
      GXv_date24 = new java.util.Date[1] ;
      GXv_char28 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_dtime42 = new java.util.Date[1] ;
      GXv_dtime41 = new java.util.Date[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      P002R10_A396EmprCod = new String[] {""} ;
      P002R10_A129BarCod = new int[1] ;
      P002R10_A132BarCodReo = new byte[1] ;
      P002R10_A130BarCodPar = new String[] {""} ;
      P002R10_A758ProCod = new String[] {""} ;
      P002R10_A194BarOrdLin = new short[1] ;
      P002R10_A1664ParFasCod = new short[1] ;
      GXv_int19 = new short[1] ;
      P002R11_A396EmprCod = new String[] {""} ;
      P002R11_A129BarCod = new int[1] ;
      P002R11_A132BarCodReo = new byte[1] ;
      P002R11_A130BarCodPar = new String[] {""} ;
      P002R11_A758ProCod = new String[] {""} ;
      P002R11_A194BarOrdLin = new short[1] ;
      P002R11_A10781BarFasNb = new int[1] ;
      GXv_char45 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int23 = new byte[1] ;
      GXv_char44 = new String[1] ;
      GXv_char43 = new String[1] ;
      GXv_int20 = new short[1] ;
      GXv_int10 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int22 = new byte[1] ;
      GXv_char40 = new String[1] ;
      P002R12_A396EmprCod = new String[] {""} ;
      P002R12_A129BarCod = new int[1] ;
      P002R12_A132BarCodReo = new byte[1] ;
      P002R12_A130BarCodPar = new String[] {""} ;
      P002R12_A187BarNotDsc = new String[] {""} ;
      P002R12_A188BarNotLin = new byte[1] ;
      A187BarNotDsc = "" ;
      W187BarNotDsc = "" ;
      P002R14_A396EmprCod = new String[] {""} ;
      P002R14_A6967Mat_Hdp = new String[] {""} ;
      P002R14_A6966Mat_Hdr = new byte[1] ;
      P002R14_A6965Mat_Hd = new int[1] ;
      P002R14_A7397Mat_FecIng = new java.util.Date[] {GXutil.nullDate()} ;
      P002R14_n7397Mat_FecIng = new boolean[] {false} ;
      P002R14_A7396Mat_HdKPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R14_n7396Mat_HdKPr = new boolean[] {false} ;
      P002R14_A6971Mat_Pzas = new int[1] ;
      P002R14_n6971Mat_Pzas = new boolean[] {false} ;
      P002R14_A6970Mat_HdGuia = new String[] {""} ;
      P002R14_n6970Mat_HdGuia = new boolean[] {false} ;
      P002R14_A6969Mat_HdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R14_n6969Mat_HdKgs = new boolean[] {false} ;
      P002R14_A6968Mat_HdUl = new short[1] ;
      P002R14_n6968Mat_HdUl = new boolean[] {false} ;
      A6967Mat_Hdp = "" ;
      A7397Mat_FecIng = GXutil.nullDate() ;
      A7396Mat_HdKPr = DecimalUtil.ZERO ;
      A6970Mat_HdGuia = "" ;
      A6969Mat_HdKgs = DecimalUtil.ZERO ;
      W6967Mat_Hdp = "" ;
      P002R16_A6981Mat_HdObs = new String[] {""} ;
      P002R16_n6981Mat_HdObs = new boolean[] {false} ;
      P002R16_A396EmprCod = new String[] {""} ;
      P002R16_A6967Mat_Hdp = new String[] {""} ;
      P002R16_A6966Mat_Hdr = new byte[1] ;
      P002R16_A6965Mat_Hd = new int[1] ;
      P002R16_A7238Mat_RecM = new int[1] ;
      P002R16_n7238Mat_RecM = new boolean[] {false} ;
      P002R16_A7108Mat_TraInt = new long[1] ;
      P002R16_n7108Mat_TraInt = new boolean[] {false} ;
      P002R16_A7107Mat_CliRm = new String[] {""} ;
      P002R16_n7107Mat_CliRm = new boolean[] {false} ;
      P002R16_A7106Mat_MaqTej = new String[] {""} ;
      P002R16_n7106Mat_MaqTej = new boolean[] {false} ;
      P002R16_A6980Mat_HdLm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R16_n6980Mat_HdLm = new boolean[] {false} ;
      P002R16_A6979Mat_HdPorc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R16_n6979Mat_HdPorc = new boolean[] {false} ;
      P002R16_A6978Mat_HdLote = new String[] {""} ;
      P002R16_n6978Mat_HdLote = new boolean[] {false} ;
      P002R16_A6977Mat_HdProv = new String[] {""} ;
      P002R16_n6977Mat_HdProv = new boolean[] {false} ;
      P002R16_A6976Mat_HdNomc = new String[] {""} ;
      P002R16_n6976Mat_HdNomc = new boolean[] {false} ;
      P002R16_A6975Mat_HdTor = new String[] {""} ;
      P002R16_n6975Mat_HdTor = new boolean[] {false} ;
      P002R16_A6974Mat_HdMat = new String[] {""} ;
      P002R16_n6974Mat_HdMat = new boolean[] {false} ;
      P002R16_A6973Mat_HdEst = new String[] {""} ;
      P002R16_n6973Mat_HdEst = new boolean[] {false} ;
      P002R16_A6972Mat_HdLin = new short[1] ;
      A6981Mat_HdObs = "" ;
      A7107Mat_CliRm = "" ;
      A7106Mat_MaqTej = "" ;
      A6980Mat_HdLm = DecimalUtil.ZERO ;
      A6979Mat_HdPorc = DecimalUtil.ZERO ;
      A6978Mat_HdLote = "" ;
      A6977Mat_HdProv = "" ;
      A6976Mat_HdNomc = "" ;
      A6975Mat_HdTor = "" ;
      A6974Mat_HdMat = "" ;
      A6973Mat_HdEst = "" ;
      P002R18_A396EmprCod = new String[] {""} ;
      P002R18_A6967Mat_Hdp = new String[] {""} ;
      P002R18_A6966Mat_Hdr = new byte[1] ;
      P002R18_A6965Mat_Hd = new int[1] ;
      P002R18_A7239Mat_RecT = new int[1] ;
      P002R18_n7239Mat_RecT = new boolean[] {false} ;
      P002R18_A8049Mat_HdKgTl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002R18_n8049Mat_HdKgTl = new boolean[] {false} ;
      P002R18_A7008Mat_HdUnTl = new int[1] ;
      P002R18_n7008Mat_HdUnTl = new boolean[] {false} ;
      P002R18_A7007Mat_HdTl = new String[] {""} ;
      A8049Mat_HdKgTl = DecimalUtil.ZERO ;
      A7007Mat_HdTl = "" ;
      W7007Mat_HdTl = "" ;
      AV159Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcrebar__default(),
         new Object[] {
             new Object[] {
            P002R3_A396EmprCod, P002R3_A130BarCodPar, P002R3_A132BarCodReo, P002R3_A129BarCod, P002R3_A361DisCod, P002R3_A365DisDes, P002R3_A143BarDisNum, P002R3_A212BarSer, P002R3_A217BarTipArt, P002R3_n217BarTipArt,
            P002R3_A135BarColNom, P002R3_A136BarColNum, P002R3_A218BarTipCol, P002R3_A159BarFecGen, P002R3_A228BarUniMed, P002R3_A155BarFecCli, P002R3_A157BarFecEnt, P002R3_A180BarMaqCod, P002R3_A193BarOpeEsp, P002R3_A235BarUrg,
            P002R3_A182BarMat, P002R3_A211BarRdt, P002R3_A221BarTra1, P002R3_A224BarTraP1, P002R3_A222BarTra2, P002R3_A225BarTraP2, P002R3_A223BarTra3, P002R3_A226BarTraP3, P002R3_A229BarUrd1, P002R3_A232BarUrdP1,
            P002R3_A230BarUrd2, P002R3_A233BarUrdP2, P002R3_A231BarUrd3, P002R3_A234BarUrdP3, P002R3_A127BarAncCru1, P002R3_A128BarAncCru2, P002R3_A125BarAncAca1, P002R3_A126BarAncAca2, P002R3_A206BarPle, P002R3_A177BarLar,
            P002R3_A214BarSua, P002R3_A118BarAcaQui, P002R3_A139BarCorOri, P002R3_A145BarEncOri, P002R3_A213BarSit, P002R3_A146BarEst, P002R3_A147BarEstCol, P002R3_A209BarPri, P002R3_A138BarConReo, P002R3_A137BarConPar,
            P002R3_A189BarNumAny, P002R3_A141BarCosPro, P002R3_A140BarCosAny, P002R3_A169BarKgsFac, P002R3_A148BarEstReo, P002R3_A196BarOrdReo, P002R3_A158BarFecFpr, P002R3_A120BarAgrEst, P002R3_A864BarPes, P002R3_A833TipDefCod,
            P002R3_n833TipDefCod, P002R3_A899TipDefPor, P002R3_n899TipDefPor, P002R3_A904ObsReoEnt, P002R3_n904ObsReoEnt, P002R3_A905ObsReoULin, P002R3_n905ObsReoULin, P002R3_A921BarMatiz, P002R3_A1226BarGraCru, P002R3_A1234BarNomCli,
            P002R3_A1235BarNumCli, P002R3_A1223BarEncCom, P002R3_A1224BarEncAnh, P002R3_A1254BarPesBal, P002R3_A1431BarLocDis, P002R3_A898BarPieNDes, P002R3_n898BarPieNDes
            }
            , new Object[] {
            }
            , new Object[] {
            P002R5_A396EmprCod, P002R5_A129BarCod, P002R5_A132BarCodReo, P002R5_A130BarCodPar, P002R5_A758ProCod, P002R5_A761ProFasLin, P002R5_n761ProFasLin
            }
            , new Object[] {
            P002R6_A396EmprCod, P002R6_A129BarCod, P002R6_A132BarCodReo, P002R6_A130BarCodPar, P002R6_A758ProCod, P002R6_A194BarOrdLin, P002R6_A457FasCod, P002R6_A162BarFecTeo, P002R6_A216BarTieTeo, P002R6_A179BarLoc,
            P002R6_A603MaqCodBis, P002R6_A150BarFacTin, P002R6_A152BarFasCon, P002R6_A3298BarFecRIni, P002R6_A4022BarNumBot, P002R6_A5719BarFasKgT, P002R6_n5719BarFasKgT, P002R6_A5720BarFasMtT, P002R6_n5720BarFasMtT, P002R6_A3837BarFasKgm,
            P002R6_n3837BarFasKgm, P002R6_A3838BarFasMtr, P002R6_n3838BarFasMtr, P002R6_A4301BarFasCoP, P002R6_A4905BarFasAcab, P002R6_A5047BarFasFPl, P002R6_n5047BarFasFPl, P002R6_A5048BarFasUsu, P002R6_n5048BarFasUsu, P002R6_A5369BarFasGral,
            P002R6_n5369BarFasGral, P002R6_A5896BarMaqPlan, P002R6_n5896BarMaqPlan, P002R6_A4287BarFasFor, P002R6_A4442BarFasDTI, P002R6_n4442BarFasDTI, P002R6_A4443BarFasDTF, P002R6_n4443BarFasDTF, P002R6_A9842BarObsF, P002R6_n9842BarObsF,
            P002R6_A10032BarObsB, P002R6_n10032BarObsB
            }
            , new Object[] {
            P002R7_A396EmprCod, P002R7_A129BarCod, P002R7_A132BarCodReo, P002R7_A130BarCodPar, P002R7_A758ProCod, P002R7_A194BarOrdLin, P002R7_A457FasCod, P002R7_A153BarFasEst, P002R7_A162BarFecTeo, P002R7_A160BarFecRea,
            P002R7_A216BarTieTeo, P002R7_A227BarUni, P002R7_A179BarLoc, P002R7_A165BarHorIni, P002R7_A164BarHorFin, P002R7_A215BarTieRea, P002R7_A603MaqCodBis, P002R7_A150BarFacTin, P002R7_A152BarFasCon, P002R7_A3298BarFecRIni,
            P002R7_A4022BarNumBot, P002R7_A5719BarFasKgT, P002R7_n5719BarFasKgT, P002R7_A5720BarFasMtT, P002R7_n5720BarFasMtT, P002R7_A3837BarFasKgm, P002R7_n3837BarFasKgm, P002R7_A3838BarFasMtr, P002R7_n3838BarFasMtr, P002R7_A4301BarFasCoP,
            P002R7_A4905BarFasAcab, P002R7_A5047BarFasFPl, P002R7_n5047BarFasFPl, P002R7_A5048BarFasUsu, P002R7_n5048BarFasUsu, P002R7_A5369BarFasGral, P002R7_n5369BarFasGral, P002R7_A5896BarMaqPlan, P002R7_n5896BarMaqPlan, P002R7_A4287BarFasFor,
            P002R7_A4442BarFasDTI, P002R7_n4442BarFasDTI, P002R7_A4443BarFasDTF, P002R7_n4443BarFasDTF, P002R7_A9842BarObsF, P002R7_n9842BarObsF, P002R7_A10032BarObsB, P002R7_n10032BarObsB
            }
            , new Object[] {
            P002R8_A396EmprCod, P002R8_A129BarCod, P002R8_A132BarCodReo, P002R8_A130BarCodPar, P002R8_A758ProCod, P002R8_A194BarOrdLin, P002R8_A1664ParFasCod
            }
            , new Object[] {
            P002R9_A396EmprCod, P002R9_A129BarCod, P002R9_A132BarCodReo, P002R9_A130BarCodPar, P002R9_A758ProCod, P002R9_A194BarOrdLin, P002R9_A153BarFasEst, P002R9_A457FasCod, P002R9_A162BarFecTeo, P002R9_A160BarFecRea,
            P002R9_A216BarTieTeo, P002R9_A227BarUni, P002R9_A179BarLoc, P002R9_A165BarHorIni, P002R9_A164BarHorFin, P002R9_A215BarTieRea, P002R9_A603MaqCodBis, P002R9_A150BarFacTin, P002R9_A152BarFasCon, P002R9_A3298BarFecRIni,
            P002R9_A4022BarNumBot, P002R9_A5719BarFasKgT, P002R9_n5719BarFasKgT, P002R9_A5720BarFasMtT, P002R9_n5720BarFasMtT, P002R9_A3837BarFasKgm, P002R9_n3837BarFasKgm, P002R9_A3838BarFasMtr, P002R9_n3838BarFasMtr, P002R9_A4301BarFasCoP,
            P002R9_A4905BarFasAcab, P002R9_A5047BarFasFPl, P002R9_n5047BarFasFPl, P002R9_A5048BarFasUsu, P002R9_n5048BarFasUsu, P002R9_A5369BarFasGral, P002R9_n5369BarFasGral, P002R9_A5896BarMaqPlan, P002R9_n5896BarMaqPlan, P002R9_A4287BarFasFor,
            P002R9_A4442BarFasDTI, P002R9_n4442BarFasDTI, P002R9_A4443BarFasDTF, P002R9_n4443BarFasDTF, P002R9_A9842BarObsF, P002R9_n9842BarObsF, P002R9_A10032BarObsB, P002R9_n10032BarObsB
            }
            , new Object[] {
            P002R10_A396EmprCod, P002R10_A129BarCod, P002R10_A132BarCodReo, P002R10_A130BarCodPar, P002R10_A758ProCod, P002R10_A194BarOrdLin, P002R10_A1664ParFasCod
            }
            , new Object[] {
            P002R11_A396EmprCod, P002R11_A129BarCod, P002R11_A132BarCodReo, P002R11_A130BarCodPar, P002R11_A758ProCod, P002R11_A194BarOrdLin, P002R11_A10781BarFasNb
            }
            , new Object[] {
            P002R12_A396EmprCod, P002R12_A129BarCod, P002R12_A132BarCodReo, P002R12_A130BarCodPar, P002R12_A187BarNotDsc, P002R12_A188BarNotLin
            }
            , new Object[] {
            }
            , new Object[] {
            P002R14_A396EmprCod, P002R14_A6967Mat_Hdp, P002R14_A6966Mat_Hdr, P002R14_A6965Mat_Hd, P002R14_A7397Mat_FecIng, P002R14_n7397Mat_FecIng, P002R14_A7396Mat_HdKPr, P002R14_n7396Mat_HdKPr, P002R14_A6971Mat_Pzas, P002R14_n6971Mat_Pzas,
            P002R14_A6970Mat_HdGuia, P002R14_n6970Mat_HdGuia, P002R14_A6969Mat_HdKgs, P002R14_n6969Mat_HdKgs, P002R14_A6968Mat_HdUl, P002R14_n6968Mat_HdUl
            }
            , new Object[] {
            }
            , new Object[] {
            P002R16_A6981Mat_HdObs, P002R16_n6981Mat_HdObs, P002R16_A396EmprCod, P002R16_A6967Mat_Hdp, P002R16_A6966Mat_Hdr, P002R16_A6965Mat_Hd, P002R16_A7238Mat_RecM, P002R16_n7238Mat_RecM, P002R16_A7108Mat_TraInt, P002R16_n7108Mat_TraInt,
            P002R16_A7107Mat_CliRm, P002R16_n7107Mat_CliRm, P002R16_A7106Mat_MaqTej, P002R16_n7106Mat_MaqTej, P002R16_A6980Mat_HdLm, P002R16_n6980Mat_HdLm, P002R16_A6979Mat_HdPorc, P002R16_n6979Mat_HdPorc, P002R16_A6978Mat_HdLote, P002R16_n6978Mat_HdLote,
            P002R16_A6977Mat_HdProv, P002R16_n6977Mat_HdProv, P002R16_A6976Mat_HdNomc, P002R16_n6976Mat_HdNomc, P002R16_A6975Mat_HdTor, P002R16_n6975Mat_HdTor, P002R16_A6974Mat_HdMat, P002R16_n6974Mat_HdMat, P002R16_A6973Mat_HdEst, P002R16_n6973Mat_HdEst,
            P002R16_A6972Mat_HdLin
            }
            , new Object[] {
            }
            , new Object[] {
            P002R18_A396EmprCod, P002R18_A6967Mat_Hdp, P002R18_A6966Mat_Hdr, P002R18_A6965Mat_Hd, P002R18_A7239Mat_RecT, P002R18_n7239Mat_RecT, P002R18_A8049Mat_HdKgTl, P002R18_n8049Mat_HdKgTl, P002R18_A7008Mat_HdUnTl, P002R18_n7008Mat_HdUnTl,
            P002R18_A7007Mat_HdTl
            }
            , new Object[] {
            }
         }
      );
      AV159Pgmname = "PCREBAR" ;
      /* GeneXus formulas. */
      AV159Pgmname = "PCREBAR" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodRI ;
   private byte AV20BarCodReo ;
   private byte AV120Tintto ;
   private byte AV110FlagJbp ;
   private byte AV113PlusUltra ;
   private byte AV117Refugio ;
   private byte AV114FlagjBM ;
   private byte AV119F_carvema ;
   private byte AV116FlagDivsif ;
   private byte AV133Texfina ;
   private byte AV140WorkNotas ;
   private byte GXt_int6 ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A193BarOpeEsp ;
   private byte A235BarUrg ;
   private byte A213BarSit ;
   private byte A146BarEst ;
   private byte A147BarEstCol ;
   private byte A138BarConReo ;
   private byte A148BarEstReo ;
   private byte A196BarOrdReo ;
   private byte A905ObsReoULin ;
   private byte A1254BarPesBal ;
   private byte W132BarCodReo ;
   private byte AV30BarTipCol ;
   private byte AV36BarOpeEsp ;
   private byte AV37BarUrg ;
   private byte AV62BarSit ;
   private byte AV63BarEst ;
   private byte AV64BarEstCol ;
   private byte AV66BarConReo ;
   private byte AV72BarEstReo ;
   private byte AV73BarOrdReo ;
   private byte AV80ObsReoULin ;
   private byte AV87BarPesBal ;
   private byte GXv_int5[] ;
   private byte GXv_int9[] ;
   private byte GXv_int11[] ;
   private byte GXv_int21[] ;
   private byte A1140DisBarReo ;
   private byte AV92BarFasEst ;
   private byte A153BarFasEst ;
   private byte GXv_int23[] ;
   private byte GXv_int22[] ;
   private byte A188BarNotLin ;
   private byte W188BarNotLin ;
   private byte A6966Mat_Hdr ;
   private byte W6966Mat_Hdr ;
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
   private short A189BarNumAny ;
   private short A864BarPes ;
   private short A833TipDefCod ;
   private short A899TipDefPor ;
   private short A921BarMatiz ;
   private short A1226BarGraCru ;
   private short AV27BarTipArt ;
   private short AV41BarTraP1 ;
   private short AV43BarTraP2 ;
   private short AV45BarTraP3 ;
   private short AV47BarUrdP1 ;
   private short AV49BarUrdP2 ;
   private short AV51BarUrdP3 ;
   private short AV52BarAncCru1 ;
   private short AV53BarAncCru2 ;
   private short AV54BarAncAca1 ;
   private short AV55BarAncAca2 ;
   private short AV68BarNumAny ;
   private short AV76BarPes ;
   private short AV77TipDefCod ;
   private short AV78TipDefPor ;
   private short AV81BarMatiz ;
   private short AV82BarGraCru ;
   private short Gx_err ;
   private short A761ProFasLin ;
   private short AV89ProFasLin ;
   private short A194BarOrdLin ;
   private short AV90BarOrdLin ;
   private short AV98BarHorIni ;
   private short A165BarHorIni ;
   private short AV99BarHorFin ;
   private short A164BarHorFin ;
   private short A1664ParFasCod ;
   private short AV121ParFasCod ;
   private short GXv_int16[] ;
   private short GXv_int19[] ;
   private short GXv_int20[] ;
   private short A6968Mat_HdUl ;
   private short A6972Mat_HdLin ;
   private short W6972Mat_HdLin ;
   private int AV16BarCodI ;
   private int AV19BarCod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A898BarPieNDes ;
   private int W129BarCod ;
   private int AV23DisCod ;
   private int AV29BarColNum ;
   private int AV84BarNumCli ;
   private int AV106BarPieNDes ;
   private int GXv_int7[] ;
   private int GX_INS153 ;
   private int A1146DisDisCod ;
   private int A1139DisBarCod ;
   private int A4022BarNumBot ;
   private int AV118BarNumBot ;
   private int A10781BarFasNb ;
   private int AV139BarFasNb ;
   private int GXv_int12[] ;
   private int GXv_int10[] ;
   private int GXv_int8[] ;
   private int GX_INS17 ;
   private int A6965Mat_Hd ;
   private int A6971Mat_Pzas ;
   private int W6965Mat_Hd ;
   private int GX_INS985 ;
   private int A7238Mat_RecM ;
   private int GX_INS986 ;
   private int A7239Mat_RecT ;
   private int A7008Mat_HdUnTl ;
   private int GX_INS1132 ;
   private long A7108Mat_TraInt ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A169BarKgsFac ;
   private java.math.BigDecimal A1223BarEncCom ;
   private java.math.BigDecimal A1224BarEncAnh ;
   private java.math.BigDecimal AV39BarRdt ;
   private java.math.BigDecimal AV69BarCosPro ;
   private java.math.BigDecimal AV70BarCosAny ;
   private java.math.BigDecimal AV71BarKgsFac ;
   private java.math.BigDecimal AV85BarEncCom ;
   private java.math.BigDecimal AV86BarEncAnh ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal AV95BarTieTeo ;
   private java.math.BigDecimal AV96BarUni ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal AV100BarTieRea ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal AV122BarFasKgt ;
   private java.math.BigDecimal AV123BarFasMtt ;
   private java.math.BigDecimal AV124BarFasKgm ;
   private java.math.BigDecimal AV125BarFasMtr ;
   private java.math.BigDecimal GXv_decimal33[] ;
   private java.math.BigDecimal GXv_decimal32[] ;
   private java.math.BigDecimal GXv_decimal31[] ;
   private java.math.BigDecimal GXv_decimal30[] ;
   private java.math.BigDecimal GXv_decimal27[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal A7396Mat_HdKPr ;
   private java.math.BigDecimal A6969Mat_HdKgs ;
   private java.math.BigDecimal A6980Mat_HdLm ;
   private java.math.BigDecimal A6979Mat_HdPorc ;
   private java.math.BigDecimal A8049Mat_HdKgTl ;
   private String A396EmprCod ;
   private String AV18BarCodPI ;
   private String AV15BarParPan ;
   private String AV144station ;
   private String GXt_char1 ;
   private String AV142EmprNom ;
   private String AV143UsurCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String A143BarDisNum ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A228BarUniMed ;
   private String A180BarMaqCod ;
   private String A182BarMat ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A229BarUrd1 ;
   private String A230BarUrd2 ;
   private String A231BarUrd3 ;
   private String A206BarPle ;
   private String A177BarLar ;
   private String A214BarSua ;
   private String A118BarAcaQui ;
   private String A139BarCorOri ;
   private String A145BarEncOri ;
   private String A209BarPri ;
   private String A137BarConPar ;
   private String A120BarAgrEst ;
   private String A904ObsReoEnt ;
   private String A1234BarNomCli ;
   private String A1431BarLocDis ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String AV22EmprCod ;
   private String AV24DisDes ;
   private String AV25BarDisNum ;
   private String AV26BarSer ;
   private String AV28BarColNom ;
   private String AV32BarUniMed ;
   private String AV35BarMaqCod ;
   private String AV38BarMat ;
   private String AV40BarTra1 ;
   private String AV42BarTra2 ;
   private String AV44BarTra3 ;
   private String AV46BarUrd1 ;
   private String AV48BarUrd2 ;
   private String AV50BarUrd3 ;
   private String AV56BarPle ;
   private String AV57BarLar ;
   private String AV58BarSua ;
   private String AV59BarAcaQui ;
   private String AV60BarCorOri ;
   private String AV61BarEncOri ;
   private String AV65BarPri ;
   private String AV67BarConPar ;
   private String AV75BarAgrEst ;
   private String AV79ObsReoEnt ;
   private String AV83BarNomCli ;
   private String AV105BarLocDis ;
   private String AV136BarHdro ;
   private String A1141DisBarPar ;
   private String Gx_emsg ;
   private String A758ProCod ;
   private String AV88ProCod ;
   private String A457FasCod ;
   private String A179BarLoc ;
   private String A603MaqCodBis ;
   private String A150BarFacTin ;
   private String A152BarFasCon ;
   private String A4301BarFasCoP ;
   private String A4905BarFasAcab ;
   private String A5048BarFasUsu ;
   private String A5369BarFasGral ;
   private String A5896BarMaqPlan ;
   private String A4287BarFasFor ;
   private String AV91FasCod ;
   private String AV97BarLoc ;
   private String AV101MaqCodBis ;
   private String AV107BarFacTin ;
   private String AV108BarFasCon ;
   private String AV126BarFasCop ;
   private String AV127BarFasAcab ;
   private String AV129Barfasusu ;
   private String AV130BarFasGral ;
   private String AV131BarMaqPlan ;
   private String AV132Barfasfor ;
   private String GXv_char39[] ;
   private String GXv_char38[] ;
   private String GXv_char37[] ;
   private String GXv_char35[] ;
   private String GXv_char34[] ;
   private String GXv_char29[] ;
   private String GXv_char28[] ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String GXv_char15[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char45[] ;
   private String GXv_char44[] ;
   private String GXv_char43[] ;
   private String GXv_char40[] ;
   private String A187BarNotDsc ;
   private String W187BarNotDsc ;
   private String A6967Mat_Hdp ;
   private String A6970Mat_HdGuia ;
   private String W6967Mat_Hdp ;
   private String A7107Mat_CliRm ;
   private String A7106Mat_MaqTej ;
   private String A6978Mat_HdLote ;
   private String A6977Mat_HdProv ;
   private String A6976Mat_HdNomc ;
   private String A6975Mat_HdTor ;
   private String A6974Mat_HdMat ;
   private String A6973Mat_HdEst ;
   private String A7007Mat_HdTl ;
   private String W7007Mat_HdTl ;
   private String AV159Pgmname ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV134Barfasdti ;
   private java.util.Date AV135Barfasdtf ;
   private java.util.Date GXv_dtime42[] ;
   private java.util.Date GXv_dtime41[] ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A157BarFecEnt ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date AV31BarFecGen ;
   private java.util.Date AV33BarFecCli ;
   private java.util.Date AV34BarFecEnt ;
   private java.util.Date AV74BarFecFpr ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date A3298BarFecRIni ;
   private java.util.Date A5047BarFasFPl ;
   private java.util.Date AV93BarFecTeo ;
   private java.util.Date AV94BarFecRea ;
   private java.util.Date AV109BarFecRIni ;
   private java.util.Date AV128barFasFpl ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date GXv_date36[] ;
   private java.util.Date GXv_date26[] ;
   private java.util.Date GXv_date25[] ;
   private java.util.Date GXv_date24[] ;
   private java.util.Date A7397Mat_FecIng ;
   private boolean n217BarTipArt ;
   private boolean n833TipDefCod ;
   private boolean n899TipDefPor ;
   private boolean n904ObsReoEnt ;
   private boolean n905ObsReoULin ;
   private boolean n898BarPieNDes ;
   private boolean n761ProFasLin ;
   private boolean n5719BarFasKgT ;
   private boolean n5720BarFasMtT ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean n5047BarFasFPl ;
   private boolean n5048BarFasUsu ;
   private boolean n5369BarFasGral ;
   private boolean n5896BarMaqPlan ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n9842BarObsF ;
   private boolean n10032BarObsB ;
   private boolean n7397Mat_FecIng ;
   private boolean n7396Mat_HdKPr ;
   private boolean n6971Mat_Pzas ;
   private boolean n6970Mat_HdGuia ;
   private boolean n6969Mat_HdKgs ;
   private boolean n6968Mat_HdUl ;
   private boolean n6981Mat_HdObs ;
   private boolean n7238Mat_RecM ;
   private boolean n7108Mat_TraInt ;
   private boolean n7107Mat_CliRm ;
   private boolean n7106Mat_MaqTej ;
   private boolean n6980Mat_HdLm ;
   private boolean n6979Mat_HdPorc ;
   private boolean n6978Mat_HdLote ;
   private boolean n6977Mat_HdProv ;
   private boolean n6976Mat_HdNomc ;
   private boolean n6975Mat_HdTor ;
   private boolean n6974Mat_HdMat ;
   private boolean n6973Mat_HdEst ;
   private boolean n7239Mat_RecT ;
   private boolean n8049Mat_HdKgTl ;
   private boolean n7008Mat_HdUnTl ;
   private String A6981Mat_HdObs ;
   private String AV141Inc_obs ;
   private String A9842BarObsF ;
   private String A10032BarObsB ;
   private String AV137BarObsF ;
   private String AV138BarObsB ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P002R3_A396EmprCod ;
   private String[] P002R3_A130BarCodPar ;
   private byte[] P002R3_A132BarCodReo ;
   private int[] P002R3_A129BarCod ;
   private int[] P002R3_A361DisCod ;
   private String[] P002R3_A365DisDes ;
   private String[] P002R3_A143BarDisNum ;
   private String[] P002R3_A212BarSer ;
   private short[] P002R3_A217BarTipArt ;
   private boolean[] P002R3_n217BarTipArt ;
   private String[] P002R3_A135BarColNom ;
   private int[] P002R3_A136BarColNum ;
   private byte[] P002R3_A218BarTipCol ;
   private java.util.Date[] P002R3_A159BarFecGen ;
   private String[] P002R3_A228BarUniMed ;
   private java.util.Date[] P002R3_A155BarFecCli ;
   private java.util.Date[] P002R3_A157BarFecEnt ;
   private String[] P002R3_A180BarMaqCod ;
   private byte[] P002R3_A193BarOpeEsp ;
   private byte[] P002R3_A235BarUrg ;
   private String[] P002R3_A182BarMat ;
   private java.math.BigDecimal[] P002R3_A211BarRdt ;
   private String[] P002R3_A221BarTra1 ;
   private short[] P002R3_A224BarTraP1 ;
   private String[] P002R3_A222BarTra2 ;
   private short[] P002R3_A225BarTraP2 ;
   private String[] P002R3_A223BarTra3 ;
   private short[] P002R3_A226BarTraP3 ;
   private String[] P002R3_A229BarUrd1 ;
   private short[] P002R3_A232BarUrdP1 ;
   private String[] P002R3_A230BarUrd2 ;
   private short[] P002R3_A233BarUrdP2 ;
   private String[] P002R3_A231BarUrd3 ;
   private short[] P002R3_A234BarUrdP3 ;
   private short[] P002R3_A127BarAncCru1 ;
   private short[] P002R3_A128BarAncCru2 ;
   private short[] P002R3_A125BarAncAca1 ;
   private short[] P002R3_A126BarAncAca2 ;
   private String[] P002R3_A206BarPle ;
   private String[] P002R3_A177BarLar ;
   private String[] P002R3_A214BarSua ;
   private String[] P002R3_A118BarAcaQui ;
   private String[] P002R3_A139BarCorOri ;
   private String[] P002R3_A145BarEncOri ;
   private byte[] P002R3_A213BarSit ;
   private byte[] P002R3_A146BarEst ;
   private byte[] P002R3_A147BarEstCol ;
   private String[] P002R3_A209BarPri ;
   private byte[] P002R3_A138BarConReo ;
   private String[] P002R3_A137BarConPar ;
   private short[] P002R3_A189BarNumAny ;
   private java.math.BigDecimal[] P002R3_A141BarCosPro ;
   private java.math.BigDecimal[] P002R3_A140BarCosAny ;
   private java.math.BigDecimal[] P002R3_A169BarKgsFac ;
   private byte[] P002R3_A148BarEstReo ;
   private byte[] P002R3_A196BarOrdReo ;
   private java.util.Date[] P002R3_A158BarFecFpr ;
   private String[] P002R3_A120BarAgrEst ;
   private short[] P002R3_A864BarPes ;
   private short[] P002R3_A833TipDefCod ;
   private boolean[] P002R3_n833TipDefCod ;
   private short[] P002R3_A899TipDefPor ;
   private boolean[] P002R3_n899TipDefPor ;
   private String[] P002R3_A904ObsReoEnt ;
   private boolean[] P002R3_n904ObsReoEnt ;
   private byte[] P002R3_A905ObsReoULin ;
   private boolean[] P002R3_n905ObsReoULin ;
   private short[] P002R3_A921BarMatiz ;
   private short[] P002R3_A1226BarGraCru ;
   private String[] P002R3_A1234BarNomCli ;
   private int[] P002R3_A1235BarNumCli ;
   private java.math.BigDecimal[] P002R3_A1223BarEncCom ;
   private java.math.BigDecimal[] P002R3_A1224BarEncAnh ;
   private byte[] P002R3_A1254BarPesBal ;
   private String[] P002R3_A1431BarLocDis ;
   private int[] P002R3_A898BarPieNDes ;
   private boolean[] P002R3_n898BarPieNDes ;
   private String[] P002R5_A396EmprCod ;
   private int[] P002R5_A129BarCod ;
   private byte[] P002R5_A132BarCodReo ;
   private String[] P002R5_A130BarCodPar ;
   private String[] P002R5_A758ProCod ;
   private short[] P002R5_A761ProFasLin ;
   private boolean[] P002R5_n761ProFasLin ;
   private String[] P002R6_A396EmprCod ;
   private int[] P002R6_A129BarCod ;
   private byte[] P002R6_A132BarCodReo ;
   private String[] P002R6_A130BarCodPar ;
   private String[] P002R6_A758ProCod ;
   private short[] P002R6_A194BarOrdLin ;
   private String[] P002R6_A457FasCod ;
   private java.util.Date[] P002R6_A162BarFecTeo ;
   private java.math.BigDecimal[] P002R6_A216BarTieTeo ;
   private String[] P002R6_A179BarLoc ;
   private String[] P002R6_A603MaqCodBis ;
   private String[] P002R6_A150BarFacTin ;
   private String[] P002R6_A152BarFasCon ;
   private java.util.Date[] P002R6_A3298BarFecRIni ;
   private int[] P002R6_A4022BarNumBot ;
   private java.math.BigDecimal[] P002R6_A5719BarFasKgT ;
   private boolean[] P002R6_n5719BarFasKgT ;
   private java.math.BigDecimal[] P002R6_A5720BarFasMtT ;
   private boolean[] P002R6_n5720BarFasMtT ;
   private java.math.BigDecimal[] P002R6_A3837BarFasKgm ;
   private boolean[] P002R6_n3837BarFasKgm ;
   private java.math.BigDecimal[] P002R6_A3838BarFasMtr ;
   private boolean[] P002R6_n3838BarFasMtr ;
   private String[] P002R6_A4301BarFasCoP ;
   private String[] P002R6_A4905BarFasAcab ;
   private java.util.Date[] P002R6_A5047BarFasFPl ;
   private boolean[] P002R6_n5047BarFasFPl ;
   private String[] P002R6_A5048BarFasUsu ;
   private boolean[] P002R6_n5048BarFasUsu ;
   private String[] P002R6_A5369BarFasGral ;
   private boolean[] P002R6_n5369BarFasGral ;
   private String[] P002R6_A5896BarMaqPlan ;
   private boolean[] P002R6_n5896BarMaqPlan ;
   private String[] P002R6_A4287BarFasFor ;
   private java.util.Date[] P002R6_A4442BarFasDTI ;
   private boolean[] P002R6_n4442BarFasDTI ;
   private java.util.Date[] P002R6_A4443BarFasDTF ;
   private boolean[] P002R6_n4443BarFasDTF ;
   private String[] P002R6_A9842BarObsF ;
   private boolean[] P002R6_n9842BarObsF ;
   private String[] P002R6_A10032BarObsB ;
   private boolean[] P002R6_n10032BarObsB ;
   private String[] P002R7_A396EmprCod ;
   private int[] P002R7_A129BarCod ;
   private byte[] P002R7_A132BarCodReo ;
   private String[] P002R7_A130BarCodPar ;
   private String[] P002R7_A758ProCod ;
   private short[] P002R7_A194BarOrdLin ;
   private String[] P002R7_A457FasCod ;
   private byte[] P002R7_A153BarFasEst ;
   private java.util.Date[] P002R7_A162BarFecTeo ;
   private java.util.Date[] P002R7_A160BarFecRea ;
   private java.math.BigDecimal[] P002R7_A216BarTieTeo ;
   private java.math.BigDecimal[] P002R7_A227BarUni ;
   private String[] P002R7_A179BarLoc ;
   private short[] P002R7_A165BarHorIni ;
   private short[] P002R7_A164BarHorFin ;
   private java.math.BigDecimal[] P002R7_A215BarTieRea ;
   private String[] P002R7_A603MaqCodBis ;
   private String[] P002R7_A150BarFacTin ;
   private String[] P002R7_A152BarFasCon ;
   private java.util.Date[] P002R7_A3298BarFecRIni ;
   private int[] P002R7_A4022BarNumBot ;
   private java.math.BigDecimal[] P002R7_A5719BarFasKgT ;
   private boolean[] P002R7_n5719BarFasKgT ;
   private java.math.BigDecimal[] P002R7_A5720BarFasMtT ;
   private boolean[] P002R7_n5720BarFasMtT ;
   private java.math.BigDecimal[] P002R7_A3837BarFasKgm ;
   private boolean[] P002R7_n3837BarFasKgm ;
   private java.math.BigDecimal[] P002R7_A3838BarFasMtr ;
   private boolean[] P002R7_n3838BarFasMtr ;
   private String[] P002R7_A4301BarFasCoP ;
   private String[] P002R7_A4905BarFasAcab ;
   private java.util.Date[] P002R7_A5047BarFasFPl ;
   private boolean[] P002R7_n5047BarFasFPl ;
   private String[] P002R7_A5048BarFasUsu ;
   private boolean[] P002R7_n5048BarFasUsu ;
   private String[] P002R7_A5369BarFasGral ;
   private boolean[] P002R7_n5369BarFasGral ;
   private String[] P002R7_A5896BarMaqPlan ;
   private boolean[] P002R7_n5896BarMaqPlan ;
   private String[] P002R7_A4287BarFasFor ;
   private java.util.Date[] P002R7_A4442BarFasDTI ;
   private boolean[] P002R7_n4442BarFasDTI ;
   private java.util.Date[] P002R7_A4443BarFasDTF ;
   private boolean[] P002R7_n4443BarFasDTF ;
   private String[] P002R7_A9842BarObsF ;
   private boolean[] P002R7_n9842BarObsF ;
   private String[] P002R7_A10032BarObsB ;
   private boolean[] P002R7_n10032BarObsB ;
   private String[] P002R8_A396EmprCod ;
   private int[] P002R8_A129BarCod ;
   private byte[] P002R8_A132BarCodReo ;
   private String[] P002R8_A130BarCodPar ;
   private String[] P002R8_A758ProCod ;
   private short[] P002R8_A194BarOrdLin ;
   private short[] P002R8_A1664ParFasCod ;
   private String[] P002R9_A396EmprCod ;
   private int[] P002R9_A129BarCod ;
   private byte[] P002R9_A132BarCodReo ;
   private String[] P002R9_A130BarCodPar ;
   private String[] P002R9_A758ProCod ;
   private short[] P002R9_A194BarOrdLin ;
   private byte[] P002R9_A153BarFasEst ;
   private String[] P002R9_A457FasCod ;
   private java.util.Date[] P002R9_A162BarFecTeo ;
   private java.util.Date[] P002R9_A160BarFecRea ;
   private java.math.BigDecimal[] P002R9_A216BarTieTeo ;
   private java.math.BigDecimal[] P002R9_A227BarUni ;
   private String[] P002R9_A179BarLoc ;
   private short[] P002R9_A165BarHorIni ;
   private short[] P002R9_A164BarHorFin ;
   private java.math.BigDecimal[] P002R9_A215BarTieRea ;
   private String[] P002R9_A603MaqCodBis ;
   private String[] P002R9_A150BarFacTin ;
   private String[] P002R9_A152BarFasCon ;
   private java.util.Date[] P002R9_A3298BarFecRIni ;
   private int[] P002R9_A4022BarNumBot ;
   private java.math.BigDecimal[] P002R9_A5719BarFasKgT ;
   private boolean[] P002R9_n5719BarFasKgT ;
   private java.math.BigDecimal[] P002R9_A5720BarFasMtT ;
   private boolean[] P002R9_n5720BarFasMtT ;
   private java.math.BigDecimal[] P002R9_A3837BarFasKgm ;
   private boolean[] P002R9_n3837BarFasKgm ;
   private java.math.BigDecimal[] P002R9_A3838BarFasMtr ;
   private boolean[] P002R9_n3838BarFasMtr ;
   private String[] P002R9_A4301BarFasCoP ;
   private String[] P002R9_A4905BarFasAcab ;
   private java.util.Date[] P002R9_A5047BarFasFPl ;
   private boolean[] P002R9_n5047BarFasFPl ;
   private String[] P002R9_A5048BarFasUsu ;
   private boolean[] P002R9_n5048BarFasUsu ;
   private String[] P002R9_A5369BarFasGral ;
   private boolean[] P002R9_n5369BarFasGral ;
   private String[] P002R9_A5896BarMaqPlan ;
   private boolean[] P002R9_n5896BarMaqPlan ;
   private String[] P002R9_A4287BarFasFor ;
   private java.util.Date[] P002R9_A4442BarFasDTI ;
   private boolean[] P002R9_n4442BarFasDTI ;
   private java.util.Date[] P002R9_A4443BarFasDTF ;
   private boolean[] P002R9_n4443BarFasDTF ;
   private String[] P002R9_A9842BarObsF ;
   private boolean[] P002R9_n9842BarObsF ;
   private String[] P002R9_A10032BarObsB ;
   private boolean[] P002R9_n10032BarObsB ;
   private String[] P002R10_A396EmprCod ;
   private int[] P002R10_A129BarCod ;
   private byte[] P002R10_A132BarCodReo ;
   private String[] P002R10_A130BarCodPar ;
   private String[] P002R10_A758ProCod ;
   private short[] P002R10_A194BarOrdLin ;
   private short[] P002R10_A1664ParFasCod ;
   private String[] P002R11_A396EmprCod ;
   private int[] P002R11_A129BarCod ;
   private byte[] P002R11_A132BarCodReo ;
   private String[] P002R11_A130BarCodPar ;
   private String[] P002R11_A758ProCod ;
   private short[] P002R11_A194BarOrdLin ;
   private int[] P002R11_A10781BarFasNb ;
   private String[] P002R12_A396EmprCod ;
   private int[] P002R12_A129BarCod ;
   private byte[] P002R12_A132BarCodReo ;
   private String[] P002R12_A130BarCodPar ;
   private String[] P002R12_A187BarNotDsc ;
   private byte[] P002R12_A188BarNotLin ;
   private String[] P002R14_A396EmprCod ;
   private String[] P002R14_A6967Mat_Hdp ;
   private byte[] P002R14_A6966Mat_Hdr ;
   private int[] P002R14_A6965Mat_Hd ;
   private java.util.Date[] P002R14_A7397Mat_FecIng ;
   private boolean[] P002R14_n7397Mat_FecIng ;
   private java.math.BigDecimal[] P002R14_A7396Mat_HdKPr ;
   private boolean[] P002R14_n7396Mat_HdKPr ;
   private int[] P002R14_A6971Mat_Pzas ;
   private boolean[] P002R14_n6971Mat_Pzas ;
   private String[] P002R14_A6970Mat_HdGuia ;
   private boolean[] P002R14_n6970Mat_HdGuia ;
   private java.math.BigDecimal[] P002R14_A6969Mat_HdKgs ;
   private boolean[] P002R14_n6969Mat_HdKgs ;
   private short[] P002R14_A6968Mat_HdUl ;
   private boolean[] P002R14_n6968Mat_HdUl ;
   private String[] P002R16_A6981Mat_HdObs ;
   private boolean[] P002R16_n6981Mat_HdObs ;
   private String[] P002R16_A396EmprCod ;
   private String[] P002R16_A6967Mat_Hdp ;
   private byte[] P002R16_A6966Mat_Hdr ;
   private int[] P002R16_A6965Mat_Hd ;
   private int[] P002R16_A7238Mat_RecM ;
   private boolean[] P002R16_n7238Mat_RecM ;
   private long[] P002R16_A7108Mat_TraInt ;
   private boolean[] P002R16_n7108Mat_TraInt ;
   private String[] P002R16_A7107Mat_CliRm ;
   private boolean[] P002R16_n7107Mat_CliRm ;
   private String[] P002R16_A7106Mat_MaqTej ;
   private boolean[] P002R16_n7106Mat_MaqTej ;
   private java.math.BigDecimal[] P002R16_A6980Mat_HdLm ;
   private boolean[] P002R16_n6980Mat_HdLm ;
   private java.math.BigDecimal[] P002R16_A6979Mat_HdPorc ;
   private boolean[] P002R16_n6979Mat_HdPorc ;
   private String[] P002R16_A6978Mat_HdLote ;
   private boolean[] P002R16_n6978Mat_HdLote ;
   private String[] P002R16_A6977Mat_HdProv ;
   private boolean[] P002R16_n6977Mat_HdProv ;
   private String[] P002R16_A6976Mat_HdNomc ;
   private boolean[] P002R16_n6976Mat_HdNomc ;
   private String[] P002R16_A6975Mat_HdTor ;
   private boolean[] P002R16_n6975Mat_HdTor ;
   private String[] P002R16_A6974Mat_HdMat ;
   private boolean[] P002R16_n6974Mat_HdMat ;
   private String[] P002R16_A6973Mat_HdEst ;
   private boolean[] P002R16_n6973Mat_HdEst ;
   private short[] P002R16_A6972Mat_HdLin ;
   private String[] P002R18_A396EmprCod ;
   private String[] P002R18_A6967Mat_Hdp ;
   private byte[] P002R18_A6966Mat_Hdr ;
   private int[] P002R18_A6965Mat_Hd ;
   private int[] P002R18_A7239Mat_RecT ;
   private boolean[] P002R18_n7239Mat_RecT ;
   private java.math.BigDecimal[] P002R18_A8049Mat_HdKgTl ;
   private boolean[] P002R18_n8049Mat_HdKgTl ;
   private int[] P002R18_A7008Mat_HdUnTl ;
   private boolean[] P002R18_n7008Mat_HdUnTl ;
   private String[] P002R18_A7007Mat_HdTl ;
}

final  class pcrebar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002R3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.DisCod, T1.DisDes, T1.BarDisNum, T1.BarSer, T1.BarTipArt, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarFecGen, T1.BarUniMed, T1.BarFecCli, T1.BarFecEnt, T1.BarMaqCod, T1.BarOpeEsp, T1.BarUrg, T1.BarMat, T1.BarRdt, T1.BarTra1, T1.BarTraP1, T1.BarTra2, T1.BarTraP2, T1.BarTra3, T1.BarTraP3, T1.BarUrd1, T1.BarUrdP1, T1.BarUrd2, T1.BarUrdP2, T1.BarUrd3, T1.BarUrdP3, T1.BarAncCru1, T1.BarAncCru2, T1.BarAncAca1, T1.BarAncAca2, T1.BarPle, T1.BarLar, T1.BarSua, T1.BarAcaQui, T1.BarCorOri, T1.BarEncOri, T1.BarSit, T1.BarEst, T1.BarEstCol, T1.BarPri, T1.BarConReo, T1.BarConPar, T1.BarNumAny, T1.BarCosPro, T1.BarCosAny, T1.BarKgsFac, T1.BarEstReo, T1.BarOrdReo, T1.BarFecFpr, T1.BarAgrEst, T1.BarPes, T1.TipDefCod, T1.TipDefPor, T1.ObsReoEnt, T1.ObsReoULin, T1.BarMatiz, T1.BarGraCru, T1.BarNomCli, T1.BarNumCli, T1.BarEncCom, T1.BarEncAnh, T1.BarPesBal, T1.BarLocDis, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P002R4", "INSERT INTO TXPDISBAR(EmprCod, DisDisCod, DisBarCod, DisBarReo, DisBarPar, DisNumPda) VALUES(?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISBAR")
         ,new ForEachCursor("P002R5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002R6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasCod, BarFecTeo, BarTieTeo, BarLoc, MaqCodBis, BarFacTin, BarFasCon, BarFecRIni, BarNumBot, BarFasKgT, BarFasMtT, BarFasKgm, BarFasMtr, BarFasCoP, BarFasAcab, BarFasFPl, BarFasUsu, BarFasGral, BarMaqPlan, BarFasFor, BarFasDTI, BarFasDTF, BarObsF, BarObsB FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002R7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasCod, BarFasEst, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, MaqCodBis, BarFacTin, BarFasCon, BarFecRIni, BarNumBot, BarFasKgT, BarFasMtT, BarFasKgm, BarFasMtr, BarFasCoP, BarFasAcab, BarFasFPl, BarFasUsu, BarFasGral, BarMaqPlan, BarFasFor, BarFasDTI, BarFasDTF, BarObsF, BarObsB FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002R8", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002R9", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasEst, FasCod, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, MaqCodBis, BarFacTin, BarFasCon, BarFecRIni, BarNumBot, BarFasKgT, BarFasMtT, BarFasKgm, BarFasMtr, BarFasCoP, BarFasAcab, BarFasFPl, BarFasUsu, BarFasGral, BarMaqPlan, BarFasFor, BarFasDTI, BarFasDTF, BarObsF, BarObsB FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ?) AND (BarFasEst = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002R10", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002R11", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb FROM TXPFASBOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002R12", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotDsc, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002R13", "INSERT INTO TXPBARNOT(EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin, BarNotDsc) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
         ,new ForEachCursor("P002R14", "SELECT EmprCod, Mat_Hdp, Mat_Hdr, Mat_Hd, Mat_FecIng, Mat_HdKPr, Mat_Pzas, Mat_HdGuia, Mat_HdKgs, Mat_HdUl FROM TXPHDRMAT WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P002R15", "INSERT INTO TXPHDRMAT(EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdUl, Mat_HdKgs, Mat_HdGuia, Mat_Pzas, Mat_HdKPr, Mat_FecIng) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRMAT")
         ,new ForEachCursor("P002R16", "SELECT Mat_HdObs, EmprCod, Mat_Hdp, Mat_Hdr, Mat_Hd, Mat_RecM, Mat_TraInt, Mat_CliRm, Mat_MaqTej, Mat_HdLm, Mat_HdPorc, Mat_HdLote, Mat_HdProv, Mat_HdNomc, Mat_HdTor, Mat_HdMat, Mat_HdEst, Mat_HdLin FROM TXPHDRMA1 WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002R17", "INSERT INTO TXPHDRMA1(EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdLin, Mat_HdEst, Mat_HdMat, Mat_HdTor, Mat_HdNomc, Mat_HdProv, Mat_HdLote, Mat_HdPorc, Mat_HdLm, Mat_HdObs, Mat_MaqTej, Mat_CliRm, Mat_TraInt, Mat_RecM) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRMA1")
         ,new ForEachCursor("P002R18", "SELECT EmprCod, Mat_Hdp, Mat_Hdr, Mat_Hd, Mat_RecT, Mat_HdKgTl, Mat_HdUnTl, Mat_HdTl FROM TXPHDRTAL WHERE EmprCod = ? and Mat_Hd = ? and Mat_Hdr = ? and Mat_Hdp = ? ORDER BY EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdTl ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002R19", "INSERT INTO TXPHDRTAL(EmprCod, Mat_Hd, Mat_Hdr, Mat_Hdp, Mat_HdTl, Mat_HdUnTl, Mat_HdKgTl, Mat_RecT) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRTAL")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 6);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((byte[]) buf[19])[0] = rslt.getByte(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 16);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((String[]) buf[22])[0] = rslt.getString(22, 4);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 4);
               ((short[]) buf[25])[0] = rslt.getShort(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 4);
               ((short[]) buf[27])[0] = rslt.getShort(27);
               ((String[]) buf[28])[0] = rslt.getString(28, 4);
               ((short[]) buf[29])[0] = rslt.getShort(29);
               ((String[]) buf[30])[0] = rslt.getString(30, 4);
               ((short[]) buf[31])[0] = rslt.getShort(31);
               ((String[]) buf[32])[0] = rslt.getString(32, 4);
               ((short[]) buf[33])[0] = rslt.getShort(33);
               ((short[]) buf[34])[0] = rslt.getShort(34);
               ((short[]) buf[35])[0] = rslt.getShort(35);
               ((short[]) buf[36])[0] = rslt.getShort(36);
               ((short[]) buf[37])[0] = rslt.getShort(37);
               ((String[]) buf[38])[0] = rslt.getString(38, 10);
               ((String[]) buf[39])[0] = rslt.getString(39, 10);
               ((String[]) buf[40])[0] = rslt.getString(40, 6);
               ((String[]) buf[41])[0] = rslt.getString(41, 6);
               ((String[]) buf[42])[0] = rslt.getString(42, 1);
               ((String[]) buf[43])[0] = rslt.getString(43, 1);
               ((byte[]) buf[44])[0] = rslt.getByte(44);
               ((byte[]) buf[45])[0] = rslt.getByte(45);
               ((byte[]) buf[46])[0] = rslt.getByte(46);
               ((String[]) buf[47])[0] = rslt.getString(47, 1);
               ((byte[]) buf[48])[0] = rslt.getByte(48);
               ((String[]) buf[49])[0] = rslt.getString(49, 1);
               ((short[]) buf[50])[0] = rslt.getShort(50);
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(51,2);
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(52,2);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(53,2);
               ((byte[]) buf[54])[0] = rslt.getByte(54);
               ((byte[]) buf[55])[0] = rslt.getByte(55);
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDate(56);
               ((String[]) buf[57])[0] = rslt.getString(57, 1);
               ((short[]) buf[58])[0] = rslt.getShort(58);
               ((short[]) buf[59])[0] = rslt.getShort(59);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(60);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(61, 40);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((byte[]) buf[65])[0] = rslt.getByte(62);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((short[]) buf[67])[0] = rslt.getShort(63);
               ((short[]) buf[68])[0] = rslt.getShort(64);
               ((String[]) buf[69])[0] = rslt.getString(65, 13);
               ((int[]) buf[70])[0] = rslt.getInt(66);
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(67,2);
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(68,2);
               ((byte[]) buf[73])[0] = rslt.getByte(69);
               ((String[]) buf[74])[0] = rslt.getString(70, 10);
               ((int[]) buf[75])[0] = rslt.getInt(71);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(20, 1);
               ((String[]) buf[24])[0] = rslt.getString(21, 1);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(22);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(25, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(26, 1);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDateTime(27);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(28);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(29);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(30);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 6);
               ((String[]) buf[17])[0] = rslt.getString(18, 1);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(20);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((String[]) buf[30])[0] = rslt.getString(27, 1);
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(28);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(29, 8);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(31, 6);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(32, 1);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(33);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDateTime(34);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(35);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 6);
               ((String[]) buf[17])[0] = rslt.getString(18, 1);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(20);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(26, 1);
               ((String[]) buf[30])[0] = rslt.getString(27, 1);
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(28);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(29, 8);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(31, 6);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(32, 1);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDateTime(33);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[42])[0] = rslt.getGXDateTime(34);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(35);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(36);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 20);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(18);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 4);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 65);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[15]);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 20);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 40);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 13);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 40);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[16], 20);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(14, (String)parms[22]);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[24], 20);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[26], 30);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(17, ((Number) parms[28]).longValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[30]).intValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 4);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[10]).intValue());
               }
               return;
      }
   }

}

