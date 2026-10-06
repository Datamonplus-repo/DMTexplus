package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class popenfas extends GXProcedure
{
   public popenfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( popenfas.class ), "" );
   }

   public popenfas( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 )
   {
      popenfas.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      popenfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      popenfas.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      popenfas.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      popenfas.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      popenfas.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      popenfas.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      popenfas.this.AV8NewOrdlin = aP6[0];
      this.aP6 = aP6;
      popenfas.this.AV9Usurcod = aP7[0];
      this.aP7 = aP7;
      popenfas.this.AV11Station = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02CR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6173BarFasSec = P02CR2_A6173BarFasSec[0] ;
         n6173BarFasSec = P02CR2_n6173BarFasSec[0] ;
         A6012BarFasTip = P02CR2_A6012BarFasTip[0] ;
         n6012BarFasTip = P02CR2_n6012BarFasTip[0] ;
         A5048BarFasUsu = P02CR2_A5048BarFasUsu[0] ;
         n5048BarFasUsu = P02CR2_n5048BarFasUsu[0] ;
         A5047BarFasFPl = P02CR2_A5047BarFasFPl[0] ;
         n5047BarFasFPl = P02CR2_n5047BarFasFPl[0] ;
         A4443BarFasDTF = P02CR2_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P02CR2_n4443BarFasDTF[0] ;
         A4442BarFasDTI = P02CR2_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P02CR2_n4442BarFasDTI[0] ;
         A4638BarUltNlot = P02CR2_A4638BarUltNlot[0] ;
         n4638BarUltNlot = P02CR2_n4638BarUltNlot[0] ;
         A4022BarNumBot = P02CR2_A4022BarNumBot[0] ;
         A4021BarFasBot = P02CR2_A4021BarFasBot[0] ;
         A3838BarFasMtr = P02CR2_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P02CR2_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P02CR2_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P02CR2_n3837BarFasKgm[0] ;
         A179BarLoc = P02CR2_A179BarLoc[0] ;
         A3298BarFecRIni = P02CR2_A3298BarFecRIni[0] ;
         A215BarTieRea = P02CR2_A215BarTieRea[0] ;
         A164BarHorFin = P02CR2_A164BarHorFin[0] ;
         A165BarHorIni = P02CR2_A165BarHorIni[0] ;
         A227BarUni = P02CR2_A227BarUni[0] ;
         A160BarFecRea = P02CR2_A160BarFecRea[0] ;
         A153BarFasEst = P02CR2_A153BarFasEst[0] ;
         A12466SolAfLnUl = P02CR2_A12466SolAfLnUl[0] ;
         n12466SolAfLnUl = P02CR2_n12466SolAfLnUl[0] ;
         A12465SolLzLnUl = P02CR2_A12465SolLzLnUl[0] ;
         n12465SolLzLnUl = P02CR2_n12465SolLzLnUl[0] ;
         A12464SolPlLnUl = P02CR2_A12464SolPlLnUl[0] ;
         n12464SolPlLnUl = P02CR2_n12464SolPlLnUl[0] ;
         A12463SolSAlLnUl = P02CR2_A12463SolSAlLnUl[0] ;
         n12463SolSAlLnUl = P02CR2_n12463SolSAlLnUl[0] ;
         A12462SolSAcLnUl = P02CR2_A12462SolSAcLnUl[0] ;
         n12462SolSAcLnUl = P02CR2_n12462SolSAcLnUl[0] ;
         A12461SolFrLnUl = P02CR2_A12461SolFrLnUl[0] ;
         n12461SolFrLnUl = P02CR2_n12461SolFrLnUl[0] ;
         A12460SolAgLnUl = P02CR2_A12460SolAgLnUl[0] ;
         n12460SolAgLnUl = P02CR2_n12460SolAgLnUl[0] ;
         A12459SolLvLnUl = P02CR2_A12459SolLvLnUl[0] ;
         n12459SolLvLnUl = P02CR2_n12459SolLvLnUl[0] ;
         A12458TsSolObs = P02CR2_A12458TsSolObs[0] ;
         n12458TsSolObs = P02CR2_n12458TsSolObs[0] ;
         A12457TsSolRFec = P02CR2_A12457TsSolRFec[0] ;
         n12457TsSolRFec = P02CR2_n12457TsSolRFec[0] ;
         A12456TsSolRLcq = P02CR2_A12456TsSolRLcq[0] ;
         n12456TsSolRLcq = P02CR2_n12456TsSolRLcq[0] ;
         A12455TsSolTFec = P02CR2_A12455TsSolTFec[0] ;
         n12455TsSolTFec = P02CR2_n12455TsSolTFec[0] ;
         A12454TsSolTLcq = P02CR2_A12454TsSolTLcq[0] ;
         n12454TsSolTLcq = P02CR2_n12454TsSolTLcq[0] ;
         A12379BarFasBlq = P02CR2_A12379BarFasBlq[0] ;
         n12379BarFasBlq = P02CR2_n12379BarFasBlq[0] ;
         A12360BarFasTOb = P02CR2_A12360BarFasTOb[0] ;
         n12360BarFasTOb = P02CR2_n12360BarFasTOb[0] ;
         A12359BarFasObs = P02CR2_A12359BarFasObs[0] ;
         n12359BarFasObs = P02CR2_n12359BarFasObs[0] ;
         A2327BarFasSer = P02CR2_A2327BarFasSer[0] ;
         n2327BarFasSer = P02CR2_n2327BarFasSer[0] ;
         A3836BarFasPri = P02CR2_A3836BarFasPri[0] ;
         A10032BarObsB = P02CR2_A10032BarObsB[0] ;
         n10032BarObsB = P02CR2_n10032BarObsB[0] ;
         A9842BarObsF = P02CR2_A9842BarObsF[0] ;
         n9842BarObsF = P02CR2_n9842BarObsF[0] ;
         A8938BarfasPri2 = P02CR2_A8938BarfasPri2[0] ;
         n8938BarfasPri2 = P02CR2_n8938BarfasPri2[0] ;
         A8594BarHdrO = P02CR2_A8594BarHdrO[0] ;
         n8594BarHdrO = P02CR2_n8594BarHdrO[0] ;
         A7933Dtb_UOrd = P02CR2_A7933Dtb_UOrd[0] ;
         n7933Dtb_UOrd = P02CR2_n7933Dtb_UOrd[0] ;
         A7914BarfasRb = P02CR2_A7914BarfasRb[0] ;
         n7914BarfasRb = P02CR2_n7914BarfasRb[0] ;
         A7913BarfasUnpL = P02CR2_A7913BarfasUnpL[0] ;
         n7913BarfasUnpL = P02CR2_n7913BarfasUnpL[0] ;
         A7912Barfastpp = P02CR2_A7912Barfastpp[0] ;
         n7912Barfastpp = P02CR2_n7912Barfastpp[0] ;
         A6555BarFasNPl = P02CR2_A6555BarFasNPl[0] ;
         A6430BarTieAut = P02CR2_A6430BarTieAut[0] ;
         A6392BarHdMn = P02CR2_A6392BarHdMn[0] ;
         n6392BarHdMn = P02CR2_n6392BarHdMn[0] ;
         A6391BarfasOP = P02CR2_A6391BarfasOP[0] ;
         n6391BarfasOP = P02CR2_n6391BarfasOP[0] ;
         A6390BarfasMn = P02CR2_A6390BarfasMn[0] ;
         n6390BarfasMn = P02CR2_n6390BarfasMn[0] ;
         A5999BarFasCR = P02CR2_A5999BarFasCR[0] ;
         A5896BarMaqPlan = P02CR2_A5896BarMaqPlan[0] ;
         n5896BarMaqPlan = P02CR2_n5896BarMaqPlan[0] ;
         A5720BarFasMtT = P02CR2_A5720BarFasMtT[0] ;
         n5720BarFasMtT = P02CR2_n5720BarFasMtT[0] ;
         A5719BarFasKgT = P02CR2_A5719BarFasKgT[0] ;
         n5719BarFasKgT = P02CR2_n5719BarFasKgT[0] ;
         A5372FasQuiUl = P02CR2_A5372FasQuiUl[0] ;
         n5372FasQuiUl = P02CR2_n5372FasQuiUl[0] ;
         A5369BarFasGral = P02CR2_A5369BarFasGral[0] ;
         n5369BarFasGral = P02CR2_n5369BarFasGral[0] ;
         A5046BarFasPrp = P02CR2_A5046BarFasPrp[0] ;
         n5046BarFasPrp = P02CR2_n5046BarFasPrp[0] ;
         A5045BarFasAgr = P02CR2_A5045BarFasAgr[0] ;
         n5045BarFasAgr = P02CR2_n5045BarFasAgr[0] ;
         A457FasCod = P02CR2_A457FasCod[0] ;
         A4974BarFasPPr = P02CR2_A4974BarFasPPr[0] ;
         n4974BarFasPPr = P02CR2_n4974BarFasPPr[0] ;
         A4973BarFasKPr = P02CR2_A4973BarFasKPr[0] ;
         n4973BarFasKPr = P02CR2_n4973BarFasKPr[0] ;
         A4938BarFasInc = P02CR2_A4938BarFasInc[0] ;
         n4938BarFasInc = P02CR2_n4938BarFasInc[0] ;
         A4905BarFasAcab = P02CR2_A4905BarFasAcab[0] ;
         A4637BarFasCara = P02CR2_A4637BarFasCara[0] ;
         A4636BarFasPzas = P02CR2_A4636BarFasPzas[0] ;
         n4636BarFasPzas = P02CR2_n4636BarFasPzas[0] ;
         A4288BarNPzas = P02CR2_A4288BarNPzas[0] ;
         A4301BarFasCoP = P02CR2_A4301BarFasCoP[0] ;
         A4287BarFasFor = P02CR2_A4287BarFasFor[0] ;
         A216BarTieTeo = P02CR2_A216BarTieTeo[0] ;
         A162BarFecTeo = P02CR2_A162BarFecTeo[0] ;
         A150BarFacTin = P02CR2_A150BarFacTin[0] ;
         A603MaqCodBis = P02CR2_A603MaqCodBis[0] ;
         A152BarFasCon = P02CR2_A152BarFasCon[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W758ProCod = A758ProCod ;
         W194BarOrdLin = A194BarOrdLin ;
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
         W603MaqCodBis = A603MaqCodBis ;
         W150BarFacTin = A150BarFacTin ;
         W152BarFasCon = A152BarFasCon ;
         W4287BarFasFor = A4287BarFasFor ;
         W4637BarFasCara = A4637BarFasCara ;
         W4301BarFasCoP = A4301BarFasCoP ;
         W4905BarFasAcab = A4905BarFasAcab ;
         W4638BarUltNlot = A4638BarUltNlot ;
         n4638BarUltNlot = false ;
         W4021BarFasBot = A4021BarFasBot ;
         W4022BarNumBot = A4022BarNumBot ;
         W5369BarFasGral = A5369BarFasGral ;
         n5369BarFasGral = false ;
         W5047BarFasFPl = A5047BarFasFPl ;
         n5047BarFasFPl = false ;
         W5048BarFasUsu = A5048BarFasUsu ;
         n5048BarFasUsu = false ;
         W179BarLoc = A179BarLoc ;
         W3836BarFasPri = A3836BarFasPri ;
         W5896BarMaqPlan = A5896BarMaqPlan ;
         n5896BarMaqPlan = false ;
         W160BarFecRea = A160BarFecRea ;
         W227BarUni = A227BarUni ;
         W165BarHorIni = A165BarHorIni ;
         W164BarHorFin = A164BarHorFin ;
         W215BarTieRea = A215BarTieRea ;
         W3298BarFecRIni = A3298BarFecRIni ;
         W3837BarFasKgm = A3837BarFasKgm ;
         n3837BarFasKgm = false ;
         W3838BarFasMtr = A3838BarFasMtr ;
         n3838BarFasMtr = false ;
         W4442BarFasDTI = A4442BarFasDTI ;
         n4442BarFasDTI = false ;
         W4443BarFasDTF = A4443BarFasDTF ;
         n4443BarFasDTF = false ;
         W153BarFasEst = A153BarFasEst ;
         W6173BarFasSec = A6173BarFasSec ;
         n6173BarFasSec = false ;
         W6390BarfasMn = A6390BarfasMn ;
         n6390BarfasMn = false ;
         W6391BarfasOP = A6391BarfasOP ;
         n6391BarfasOP = false ;
         W6392BarHdMn = A6392BarHdMn ;
         n6392BarHdMn = false ;
         W6430BarTieAut = A6430BarTieAut ;
         W6555BarFasNPl = A6555BarFasNPl ;
         W7914BarfasRb = A7914BarfasRb ;
         n7914BarfasRb = false ;
         W7913BarfasUnpL = A7913BarfasUnpL ;
         n7913BarfasUnpL = false ;
         W7912Barfastpp = A7912Barfastpp ;
         n7912Barfastpp = false ;
         W7933Dtb_UOrd = A7933Dtb_UOrd ;
         n7933Dtb_UOrd = false ;
         W6012BarFasTip = A6012BarFasTip ;
         n6012BarFasTip = false ;
         A194BarOrdLin = AV8NewOrdlin ;
         A4638BarUltNlot = 0 ;
         n4638BarUltNlot = false ;
         A4021BarFasBot = GXutil.space( (short)(1)) ;
         A4022BarNumBot = 0 ;
         n5369BarFasGral = false ;
         A5047BarFasFPl = GXutil.nullDate() ;
         n5047BarFasFPl = false ;
         A5048BarFasUsu = AV9Usurcod ;
         n5048BarFasUsu = false ;
         A179BarLoc = "" ;
         n5896BarMaqPlan = false ;
         A160BarFecRea = GXutil.nullDate() ;
         A227BarUni = DecimalUtil.doubleToDec(0) ;
         A165BarHorIni = (short)(0) ;
         A164BarHorFin = (short)(0) ;
         A215BarTieRea = DecimalUtil.doubleToDec(0) ;
         A3298BarFecRIni = GXutil.nullDate() ;
         A3837BarFasKgm = DecimalUtil.doubleToDec(0) ;
         n3837BarFasKgm = false ;
         A3838BarFasMtr = DecimalUtil.doubleToDec(0) ;
         n3838BarFasMtr = false ;
         A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
         n4442BarFasDTI = false ;
         A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
         n4443BarFasDTF = false ;
         A153BarFasEst = (byte)(0) ;
         A6173BarFasSec = "XX" ;
         n6173BarFasSec = false ;
         n6390BarfasMn = false ;
         n6391BarfasOP = false ;
         n6392BarHdMn = false ;
         n7914BarfasRb = false ;
         n7913BarfasUnpL = false ;
         n7912Barfastpp = false ;
         n7933Dtb_UOrd = false ;
         A6012BarFasTip = " " ;
         n6012BarFasTip = false ;
         /* Using cursor P02CR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A152BarFasCon, Byte.valueOf(A153BarFasEst), A603MaqCodBis, A150BarFacTin, A162BarFecTeo, A160BarFecRea, A216BarTieTeo, A227BarUni, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), A215BarTieRea, A3298BarFecRIni, A179BarLoc, Boolean.valueOf(n3837BarFasKgm), A3837BarFasKgm, Boolean.valueOf(n3838BarFasMtr), A3838BarFasMtr, A4021BarFasBot, Integer.valueOf(A4022BarNumBot), A4287BarFasFor, A4301BarFasCoP, Integer.valueOf(A4288BarNPzas), Boolean.valueOf(n4636BarFasPzas), Integer.valueOf(A4636BarFasPzas), A4637BarFasCara, Boolean.valueOf(n4638BarUltNlot), Integer.valueOf(A4638BarUltNlot), A4905BarFasAcab, Boolean.valueOf(n4938BarFasInc), Byte.valueOf(A4938BarFasInc), Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, Boolean.valueOf(n4973BarFasKPr), A4973BarFasKPr, Boolean.valueOf(n4974BarFasPPr), Short.valueOf(A4974BarFasPPr), A457FasCod, Boolean.valueOf(n5045BarFasAgr), A5045BarFasAgr, Boolean.valueOf(n5046BarFasPrp), A5046BarFasPrp, Boolean.valueOf(n5047BarFasFPl), A5047BarFasFPl, Boolean.valueOf(n5048BarFasUsu), A5048BarFasUsu, Boolean.valueOf(n5369BarFasGral), A5369BarFasGral, Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), Boolean.valueOf(n5719BarFasKgT), A5719BarFasKgT, Boolean.valueOf(n5720BarFasMtT), A5720BarFasMtT, Boolean.valueOf(n5896BarMaqPlan), A5896BarMaqPlan, A5999BarFasCR, Boolean.valueOf(n6012BarFasTip), A6012BarFasTip, Boolean.valueOf(n6173BarFasSec), A6173BarFasSec, Boolean.valueOf(n6390BarfasMn), A6390BarfasMn, Boolean.valueOf(n6391BarfasOP), Short.valueOf(A6391BarfasOP), Boolean.valueOf(n6392BarHdMn), A6392BarHdMn, Short.valueOf(A6430BarTieAut), Byte.valueOf(A6555BarFasNPl), Boolean.valueOf(n7912Barfastpp), A7912Barfastpp, Boolean.valueOf(n7913BarfasUnpL), A7913BarfasUnpL, Boolean.valueOf(n7914BarfasRb), A7914BarfasRb, Boolean.valueOf(n7933Dtb_UOrd), Short.valueOf(A7933Dtb_UOrd), Boolean.valueOf(n8594BarHdrO), A8594BarHdrO, Boolean.valueOf(n8938BarfasPri2), Short.valueOf(A8938BarfasPri2), Boolean.valueOf(n9842BarObsF), A9842BarObsF, Boolean.valueOf(n10032BarObsB), A10032BarObsB, Byte.valueOf(A3836BarFasPri), Boolean.valueOf(n2327BarFasSer), A2327BarFasSer, Boolean.valueOf(n12359BarFasObs), A12359BarFasObs, Boolean.valueOf(n12360BarFasTOb), A12360BarFasTOb, Boolean.valueOf(n12379BarFasBlq), Byte.valueOf(A12379BarFasBlq), Boolean.valueOf(n12454TsSolTLcq), Integer.valueOf(A12454TsSolTLcq), Boolean.valueOf(n12455TsSolTFec), A12455TsSolTFec, Boolean.valueOf(n12456TsSolRLcq), Integer.valueOf(A12456TsSolRLcq), Boolean.valueOf(n12457TsSolRFec), A12457TsSolRFec, Boolean.valueOf(n12458TsSolObs), A12458TsSolObs, Boolean.valueOf(n12459SolLvLnUl), Short.valueOf(A12459SolLvLnUl), Boolean.valueOf(n12460SolAgLnUl), Short.valueOf(A12460SolAgLnUl), Boolean.valueOf(n12461SolFrLnUl), Short.valueOf(A12461SolFrLnUl), Boolean.valueOf(n12462SolSAcLnUl), Short.valueOf(A12462SolSAcLnUl), Boolean.valueOf(n12463SolSAlLnUl), Short.valueOf(A12463SolSAlLnUl), Boolean.valueOf(n12464SolPlLnUl),
         Short.valueOf(A12464SolPlLnUl), Boolean.valueOf(n12465SolLzLnUl), Short.valueOf(A12465SolLzLnUl), Boolean.valueOf(n12466SolAfLnUl), Short.valueOf(A12466SolAfLnUl)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
         A758ProCod = W758ProCod ;
         A194BarOrdLin = W194BarOrdLin ;
         A457FasCod = W457FasCod ;
         A603MaqCodBis = W603MaqCodBis ;
         A150BarFacTin = W150BarFacTin ;
         A152BarFasCon = W152BarFasCon ;
         A4287BarFasFor = W4287BarFasFor ;
         A4637BarFasCara = W4637BarFasCara ;
         A4301BarFasCoP = W4301BarFasCoP ;
         A4905BarFasAcab = W4905BarFasAcab ;
         A4638BarUltNlot = W4638BarUltNlot ;
         n4638BarUltNlot = false ;
         A4021BarFasBot = W4021BarFasBot ;
         A4022BarNumBot = W4022BarNumBot ;
         A5369BarFasGral = W5369BarFasGral ;
         n5369BarFasGral = false ;
         A5047BarFasFPl = W5047BarFasFPl ;
         n5047BarFasFPl = false ;
         A5048BarFasUsu = W5048BarFasUsu ;
         n5048BarFasUsu = false ;
         A179BarLoc = W179BarLoc ;
         A3836BarFasPri = W3836BarFasPri ;
         A5896BarMaqPlan = W5896BarMaqPlan ;
         n5896BarMaqPlan = false ;
         A160BarFecRea = W160BarFecRea ;
         A227BarUni = W227BarUni ;
         A165BarHorIni = W165BarHorIni ;
         A164BarHorFin = W164BarHorFin ;
         A215BarTieRea = W215BarTieRea ;
         A3298BarFecRIni = W3298BarFecRIni ;
         A3837BarFasKgm = W3837BarFasKgm ;
         n3837BarFasKgm = false ;
         A3838BarFasMtr = W3838BarFasMtr ;
         n3838BarFasMtr = false ;
         A4442BarFasDTI = W4442BarFasDTI ;
         n4442BarFasDTI = false ;
         A4443BarFasDTF = W4443BarFasDTF ;
         n4443BarFasDTF = false ;
         A153BarFasEst = W153BarFasEst ;
         A6173BarFasSec = W6173BarFasSec ;
         n6173BarFasSec = false ;
         A6390BarfasMn = W6390BarfasMn ;
         n6390BarfasMn = false ;
         A6391BarfasOP = W6391BarfasOP ;
         n6391BarfasOP = false ;
         A6392BarHdMn = W6392BarHdMn ;
         n6392BarHdMn = false ;
         A6430BarTieAut = W6430BarTieAut ;
         A6555BarFasNPl = W6555BarFasNPl ;
         A7914BarfasRb = W7914BarfasRb ;
         n7914BarfasRb = false ;
         A7913BarfasUnpL = W7913BarfasUnpL ;
         n7913BarfasUnpL = false ;
         A7912Barfastpp = W7912Barfastpp ;
         n7912Barfastpp = false ;
         A7933Dtb_UOrd = W7933Dtb_UOrd ;
         n7933Dtb_UOrd = false ;
         A6012BarFasTip = W6012BarFasTip ;
         n6012BarFasTip = false ;
         /* End Insert */
         AV10Inc_obs = httpContext.getMessage( "Registro Creado en BARFAS ,Open Barfas", "") ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV15Pgmname, AV9Usurcod, AV11Station, AV10Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A758ProCod = W758ProCod ;
         A194BarOrdLin = W194BarOrdLin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = popenfas.this.A396EmprCod;
      this.aP1[0] = popenfas.this.A129BarCod;
      this.aP2[0] = popenfas.this.A132BarCodReo;
      this.aP3[0] = popenfas.this.A130BarCodPar;
      this.aP4[0] = popenfas.this.A758ProCod;
      this.aP5[0] = popenfas.this.A194BarOrdLin;
      this.aP6[0] = popenfas.this.AV8NewOrdlin;
      this.aP7[0] = popenfas.this.AV9Usurcod;
      this.aP8[0] = popenfas.this.AV11Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "popenfas");
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
      P02CR2_A396EmprCod = new String[] {""} ;
      P02CR2_A129BarCod = new int[1] ;
      P02CR2_A132BarCodReo = new byte[1] ;
      P02CR2_A130BarCodPar = new String[] {""} ;
      P02CR2_A758ProCod = new String[] {""} ;
      P02CR2_A194BarOrdLin = new short[1] ;
      P02CR2_A6173BarFasSec = new String[] {""} ;
      P02CR2_n6173BarFasSec = new boolean[] {false} ;
      P02CR2_A6012BarFasTip = new String[] {""} ;
      P02CR2_n6012BarFasTip = new boolean[] {false} ;
      P02CR2_A5048BarFasUsu = new String[] {""} ;
      P02CR2_n5048BarFasUsu = new boolean[] {false} ;
      P02CR2_A5047BarFasFPl = new java.util.Date[] {GXutil.nullDate()} ;
      P02CR2_n5047BarFasFPl = new boolean[] {false} ;
      P02CR2_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P02CR2_n4443BarFasDTF = new boolean[] {false} ;
      P02CR2_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P02CR2_n4442BarFasDTI = new boolean[] {false} ;
      P02CR2_A4638BarUltNlot = new int[1] ;
      P02CR2_n4638BarUltNlot = new boolean[] {false} ;
      P02CR2_A4022BarNumBot = new int[1] ;
      P02CR2_A4021BarFasBot = new String[] {""} ;
      P02CR2_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CR2_n3838BarFasMtr = new boolean[] {false} ;
      P02CR2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CR2_n3837BarFasKgm = new boolean[] {false} ;
      P02CR2_A179BarLoc = new String[] {""} ;
      P02CR2_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P02CR2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CR2_A164BarHorFin = new short[1] ;
      P02CR2_A165BarHorIni = new short[1] ;
      P02CR2_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CR2_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P02CR2_A153BarFasEst = new byte[1] ;
      P02CR2_A12466SolAfLnUl = new short[1] ;
      P02CR2_n12466SolAfLnUl = new boolean[] {false} ;
      P02CR2_A12465SolLzLnUl = new short[1] ;
      P02CR2_n12465SolLzLnUl = new boolean[] {false} ;
      P02CR2_A12464SolPlLnUl = new short[1] ;
      P02CR2_n12464SolPlLnUl = new boolean[] {false} ;
      P02CR2_A12463SolSAlLnUl = new short[1] ;
      P02CR2_n12463SolSAlLnUl = new boolean[] {false} ;
      P02CR2_A12462SolSAcLnUl = new short[1] ;
      P02CR2_n12462SolSAcLnUl = new boolean[] {false} ;
      P02CR2_A12461SolFrLnUl = new short[1] ;
      P02CR2_n12461SolFrLnUl = new boolean[] {false} ;
      P02CR2_A12460SolAgLnUl = new short[1] ;
      P02CR2_n12460SolAgLnUl = new boolean[] {false} ;
      P02CR2_A12459SolLvLnUl = new short[1] ;
      P02CR2_n12459SolLvLnUl = new boolean[] {false} ;
      P02CR2_A12458TsSolObs = new String[] {""} ;
      P02CR2_n12458TsSolObs = new boolean[] {false} ;
      P02CR2_A12457TsSolRFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02CR2_n12457TsSolRFec = new boolean[] {false} ;
      P02CR2_A12456TsSolRLcq = new int[1] ;
      P02CR2_n12456TsSolRLcq = new boolean[] {false} ;
      P02CR2_A12455TsSolTFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02CR2_n12455TsSolTFec = new boolean[] {false} ;
      P02CR2_A12454TsSolTLcq = new int[1] ;
      P02CR2_n12454TsSolTLcq = new boolean[] {false} ;
      P02CR2_A12379BarFasBlq = new byte[1] ;
      P02CR2_n12379BarFasBlq = new boolean[] {false} ;
      P02CR2_A12360BarFasTOb = new String[] {""} ;
      P02CR2_n12360BarFasTOb = new boolean[] {false} ;
      P02CR2_A12359BarFasObs = new String[] {""} ;
      P02CR2_n12359BarFasObs = new boolean[] {false} ;
      P02CR2_A2327BarFasSer = new String[] {""} ;
      P02CR2_n2327BarFasSer = new boolean[] {false} ;
      P02CR2_A3836BarFasPri = new byte[1] ;
      P02CR2_A10032BarObsB = new String[] {""} ;
      P02CR2_n10032BarObsB = new boolean[] {false} ;
      P02CR2_A9842BarObsF = new String[] {""} ;
      P02CR2_n9842BarObsF = new boolean[] {false} ;
      P02CR2_A8938BarfasPri2 = new short[1] ;
      P02CR2_n8938BarfasPri2 = new boolean[] {false} ;
      P02CR2_A8594BarHdrO = new String[] {""} ;
      P02CR2_n8594BarHdrO = new boolean[] {false} ;
      P02CR2_A7933Dtb_UOrd = new short[1] ;
      P02CR2_n7933Dtb_UOrd = new boolean[] {false} ;
      P02CR2_A7914BarfasRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CR2_n7914BarfasRb = new boolean[] {false} ;
      P02CR2_A7913BarfasUnpL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CR2_n7913BarfasUnpL = new boolean[] {false} ;
      P02CR2_A7912Barfastpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CR2_n7912Barfastpp = new boolean[] {false} ;
      P02CR2_A6555BarFasNPl = new byte[1] ;
      P02CR2_A6430BarTieAut = new short[1] ;
      P02CR2_A6392BarHdMn = new String[] {""} ;
      P02CR2_n6392BarHdMn = new boolean[] {false} ;
      P02CR2_A6391BarfasOP = new short[1] ;
      P02CR2_n6391BarfasOP = new boolean[] {false} ;
      P02CR2_A6390BarfasMn = new String[] {""} ;
      P02CR2_n6390BarfasMn = new boolean[] {false} ;
      P02CR2_A5999BarFasCR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CR2_A5896BarMaqPlan = new String[] {""} ;
      P02CR2_n5896BarMaqPlan = new boolean[] {false} ;
      P02CR2_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CR2_n5720BarFasMtT = new boolean[] {false} ;
      P02CR2_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CR2_n5719BarFasKgT = new boolean[] {false} ;
      P02CR2_A5372FasQuiUl = new short[1] ;
      P02CR2_n5372FasQuiUl = new boolean[] {false} ;
      P02CR2_A5369BarFasGral = new String[] {""} ;
      P02CR2_n5369BarFasGral = new boolean[] {false} ;
      P02CR2_A5046BarFasPrp = new String[] {""} ;
      P02CR2_n5046BarFasPrp = new boolean[] {false} ;
      P02CR2_A5045BarFasAgr = new String[] {""} ;
      P02CR2_n5045BarFasAgr = new boolean[] {false} ;
      P02CR2_A457FasCod = new String[] {""} ;
      P02CR2_A4974BarFasPPr = new short[1] ;
      P02CR2_n4974BarFasPPr = new boolean[] {false} ;
      P02CR2_A4973BarFasKPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CR2_n4973BarFasKPr = new boolean[] {false} ;
      P02CR2_A4938BarFasInc = new byte[1] ;
      P02CR2_n4938BarFasInc = new boolean[] {false} ;
      P02CR2_A4905BarFasAcab = new String[] {""} ;
      P02CR2_A4637BarFasCara = new String[] {""} ;
      P02CR2_A4636BarFasPzas = new int[1] ;
      P02CR2_n4636BarFasPzas = new boolean[] {false} ;
      P02CR2_A4288BarNPzas = new int[1] ;
      P02CR2_A4301BarFasCoP = new String[] {""} ;
      P02CR2_A4287BarFasFor = new String[] {""} ;
      P02CR2_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CR2_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      P02CR2_A150BarFacTin = new String[] {""} ;
      P02CR2_A603MaqCodBis = new String[] {""} ;
      P02CR2_A152BarFasCon = new String[] {""} ;
      A6173BarFasSec = "" ;
      A6012BarFasTip = "" ;
      A5048BarFasUsu = "" ;
      A5047BarFasFPl = GXutil.nullDate() ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4021BarFasBot = "" ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A179BarLoc = "" ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A227BarUni = DecimalUtil.ZERO ;
      A160BarFecRea = GXutil.nullDate() ;
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
      A5999BarFasCR = DecimalUtil.ZERO ;
      A5896BarMaqPlan = "" ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A5369BarFasGral = "" ;
      A5046BarFasPrp = "" ;
      A5045BarFasAgr = "" ;
      A457FasCod = "" ;
      A4973BarFasKPr = DecimalUtil.ZERO ;
      A4905BarFasAcab = "" ;
      A4637BarFasCara = "" ;
      A4301BarFasCoP = "" ;
      A4287BarFasFor = "" ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A162BarFecTeo = GXutil.nullDate() ;
      A150BarFacTin = "" ;
      A603MaqCodBis = "" ;
      A152BarFasCon = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      W758ProCod = "" ;
      W457FasCod = "" ;
      W603MaqCodBis = "" ;
      W150BarFacTin = "" ;
      W152BarFasCon = "" ;
      W4287BarFasFor = "" ;
      W4637BarFasCara = "" ;
      W4301BarFasCoP = "" ;
      W4905BarFasAcab = "" ;
      W4021BarFasBot = "" ;
      W5369BarFasGral = "" ;
      W5047BarFasFPl = GXutil.nullDate() ;
      W5048BarFasUsu = "" ;
      W179BarLoc = "" ;
      W5896BarMaqPlan = "" ;
      W160BarFecRea = GXutil.nullDate() ;
      W227BarUni = DecimalUtil.ZERO ;
      W215BarTieRea = DecimalUtil.ZERO ;
      W3298BarFecRIni = GXutil.nullDate() ;
      W3837BarFasKgm = DecimalUtil.ZERO ;
      W3838BarFasMtr = DecimalUtil.ZERO ;
      W4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      W4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      W6173BarFasSec = "" ;
      W6390BarfasMn = "" ;
      W6392BarHdMn = "" ;
      W7914BarfasRb = DecimalUtil.ZERO ;
      W7913BarfasUnpL = DecimalUtil.ZERO ;
      W7912Barfastpp = DecimalUtil.ZERO ;
      W6012BarFasTip = "" ;
      Gx_emsg = "" ;
      AV10Inc_obs = "" ;
      AV15Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.popenfas__default(),
         new Object[] {
             new Object[] {
            P02CR2_A396EmprCod, P02CR2_A129BarCod, P02CR2_A132BarCodReo, P02CR2_A130BarCodPar, P02CR2_A758ProCod, P02CR2_A194BarOrdLin, P02CR2_A6173BarFasSec, P02CR2_n6173BarFasSec, P02CR2_A6012BarFasTip, P02CR2_n6012BarFasTip,
            P02CR2_A5048BarFasUsu, P02CR2_n5048BarFasUsu, P02CR2_A5047BarFasFPl, P02CR2_n5047BarFasFPl, P02CR2_A4443BarFasDTF, P02CR2_n4443BarFasDTF, P02CR2_A4442BarFasDTI, P02CR2_n4442BarFasDTI, P02CR2_A4638BarUltNlot, P02CR2_n4638BarUltNlot,
            P02CR2_A4022BarNumBot, P02CR2_A4021BarFasBot, P02CR2_A3838BarFasMtr, P02CR2_n3838BarFasMtr, P02CR2_A3837BarFasKgm, P02CR2_n3837BarFasKgm, P02CR2_A179BarLoc, P02CR2_A3298BarFecRIni, P02CR2_A215BarTieRea, P02CR2_A164BarHorFin,
            P02CR2_A165BarHorIni, P02CR2_A227BarUni, P02CR2_A160BarFecRea, P02CR2_A153BarFasEst, P02CR2_A12466SolAfLnUl, P02CR2_n12466SolAfLnUl, P02CR2_A12465SolLzLnUl, P02CR2_n12465SolLzLnUl, P02CR2_A12464SolPlLnUl, P02CR2_n12464SolPlLnUl,
            P02CR2_A12463SolSAlLnUl, P02CR2_n12463SolSAlLnUl, P02CR2_A12462SolSAcLnUl, P02CR2_n12462SolSAcLnUl, P02CR2_A12461SolFrLnUl, P02CR2_n12461SolFrLnUl, P02CR2_A12460SolAgLnUl, P02CR2_n12460SolAgLnUl, P02CR2_A12459SolLvLnUl, P02CR2_n12459SolLvLnUl,
            P02CR2_A12458TsSolObs, P02CR2_n12458TsSolObs, P02CR2_A12457TsSolRFec, P02CR2_n12457TsSolRFec, P02CR2_A12456TsSolRLcq, P02CR2_n12456TsSolRLcq, P02CR2_A12455TsSolTFec, P02CR2_n12455TsSolTFec, P02CR2_A12454TsSolTLcq, P02CR2_n12454TsSolTLcq,
            P02CR2_A12379BarFasBlq, P02CR2_n12379BarFasBlq, P02CR2_A12360BarFasTOb, P02CR2_n12360BarFasTOb, P02CR2_A12359BarFasObs, P02CR2_n12359BarFasObs, P02CR2_A2327BarFasSer, P02CR2_n2327BarFasSer, P02CR2_A3836BarFasPri, P02CR2_A10032BarObsB,
            P02CR2_n10032BarObsB, P02CR2_A9842BarObsF, P02CR2_n9842BarObsF, P02CR2_A8938BarfasPri2, P02CR2_n8938BarfasPri2, P02CR2_A8594BarHdrO, P02CR2_n8594BarHdrO, P02CR2_A7933Dtb_UOrd, P02CR2_n7933Dtb_UOrd, P02CR2_A7914BarfasRb,
            P02CR2_n7914BarfasRb, P02CR2_A7913BarfasUnpL, P02CR2_n7913BarfasUnpL, P02CR2_A7912Barfastpp, P02CR2_n7912Barfastpp, P02CR2_A6555BarFasNPl, P02CR2_A6430BarTieAut, P02CR2_A6392BarHdMn, P02CR2_n6392BarHdMn, P02CR2_A6391BarfasOP,
            P02CR2_n6391BarfasOP, P02CR2_A6390BarfasMn, P02CR2_n6390BarfasMn, P02CR2_A5999BarFasCR, P02CR2_A5896BarMaqPlan, P02CR2_n5896BarMaqPlan, P02CR2_A5720BarFasMtT, P02CR2_n5720BarFasMtT, P02CR2_A5719BarFasKgT, P02CR2_n5719BarFasKgT,
            P02CR2_A5372FasQuiUl, P02CR2_n5372FasQuiUl, P02CR2_A5369BarFasGral, P02CR2_n5369BarFasGral, P02CR2_A5046BarFasPrp, P02CR2_n5046BarFasPrp, P02CR2_A5045BarFasAgr, P02CR2_n5045BarFasAgr, P02CR2_A457FasCod, P02CR2_A4974BarFasPPr,
            P02CR2_n4974BarFasPPr, P02CR2_A4973BarFasKPr, P02CR2_n4973BarFasKPr, P02CR2_A4938BarFasInc, P02CR2_n4938BarFasInc, P02CR2_A4905BarFasAcab, P02CR2_A4637BarFasCara, P02CR2_A4636BarFasPzas, P02CR2_n4636BarFasPzas, P02CR2_A4288BarNPzas,
            P02CR2_A4301BarFasCoP, P02CR2_A4287BarFasFor, P02CR2_A216BarTieTeo, P02CR2_A162BarFecTeo, P02CR2_A150BarFacTin, P02CR2_A603MaqCodBis, P02CR2_A152BarFasCon
            }
            , new Object[] {
            }
         }
      );
      AV15Pgmname = "POPENFAS" ;
      /* GeneXus formulas. */
      AV15Pgmname = "POPENFAS" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte A12379BarFasBlq ;
   private byte A3836BarFasPri ;
   private byte A6555BarFasNPl ;
   private byte A4938BarFasInc ;
   private byte W132BarCodReo ;
   private byte W3836BarFasPri ;
   private byte W153BarFasEst ;
   private byte W6555BarFasNPl ;
   private short A194BarOrdLin ;
   private short AV8NewOrdlin ;
   private short A164BarHorFin ;
   private short A165BarHorIni ;
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
   private short W194BarOrdLin ;
   private short W165BarHorIni ;
   private short W164BarHorFin ;
   private short W6391BarfasOP ;
   private short W6430BarTieAut ;
   private short W7933Dtb_UOrd ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A4638BarUltNlot ;
   private int A4022BarNumBot ;
   private int A12456TsSolRLcq ;
   private int A12454TsSolTLcq ;
   private int A4636BarFasPzas ;
   private int A4288BarNPzas ;
   private int W129BarCod ;
   private int GX_INS15 ;
   private int W4638BarUltNlot ;
   private int W4022BarNumBot ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A7914BarfasRb ;
   private java.math.BigDecimal A7913BarfasUnpL ;
   private java.math.BigDecimal A7912Barfastpp ;
   private java.math.BigDecimal A5999BarFasCR ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A4973BarFasKPr ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal W227BarUni ;
   private java.math.BigDecimal W215BarTieRea ;
   private java.math.BigDecimal W3837BarFasKgm ;
   private java.math.BigDecimal W3838BarFasMtr ;
   private java.math.BigDecimal W7914BarfasRb ;
   private java.math.BigDecimal W7913BarfasUnpL ;
   private java.math.BigDecimal W7912Barfastpp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV9Usurcod ;
   private String AV11Station ;
   private String scmdbuf ;
   private String A6173BarFasSec ;
   private String A6012BarFasTip ;
   private String A5048BarFasUsu ;
   private String A4021BarFasBot ;
   private String A179BarLoc ;
   private String A12360BarFasTOb ;
   private String A2327BarFasSer ;
   private String A8594BarHdrO ;
   private String A6392BarHdMn ;
   private String A6390BarfasMn ;
   private String A5896BarMaqPlan ;
   private String A5369BarFasGral ;
   private String A5046BarFasPrp ;
   private String A5045BarFasAgr ;
   private String A457FasCod ;
   private String A4905BarFasAcab ;
   private String A4637BarFasCara ;
   private String A4301BarFasCoP ;
   private String A4287BarFasFor ;
   private String A150BarFacTin ;
   private String A603MaqCodBis ;
   private String A152BarFasCon ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W758ProCod ;
   private String W457FasCod ;
   private String W603MaqCodBis ;
   private String W150BarFacTin ;
   private String W152BarFasCon ;
   private String W4287BarFasFor ;
   private String W4637BarFasCara ;
   private String W4301BarFasCoP ;
   private String W4905BarFasAcab ;
   private String W4021BarFasBot ;
   private String W5369BarFasGral ;
   private String W5048BarFasUsu ;
   private String W179BarLoc ;
   private String W5896BarMaqPlan ;
   private String W6173BarFasSec ;
   private String W6390BarfasMn ;
   private String W6392BarHdMn ;
   private String W6012BarFasTip ;
   private String Gx_emsg ;
   private String AV15Pgmname ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A12457TsSolRFec ;
   private java.util.Date A12455TsSolTFec ;
   private java.util.Date W4442BarFasDTI ;
   private java.util.Date W4443BarFasDTF ;
   private java.util.Date A5047BarFasFPl ;
   private java.util.Date A3298BarFecRIni ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date W5047BarFasFPl ;
   private java.util.Date W160BarFecRea ;
   private java.util.Date W3298BarFecRIni ;
   private boolean n6173BarFasSec ;
   private boolean n6012BarFasTip ;
   private boolean n5048BarFasUsu ;
   private boolean n5047BarFasFPl ;
   private boolean n4443BarFasDTF ;
   private boolean n4442BarFasDTI ;
   private boolean n4638BarUltNlot ;
   private boolean n3838BarFasMtr ;
   private boolean n3837BarFasKgm ;
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
   private boolean n5896BarMaqPlan ;
   private boolean n5720BarFasMtT ;
   private boolean n5719BarFasKgT ;
   private boolean n5372FasQuiUl ;
   private boolean n5369BarFasGral ;
   private boolean n5046BarFasPrp ;
   private boolean n5045BarFasAgr ;
   private boolean n4974BarFasPPr ;
   private boolean n4973BarFasKPr ;
   private boolean n4938BarFasInc ;
   private boolean n4636BarFasPzas ;
   private String A12458TsSolObs ;
   private String A12359BarFasObs ;
   private String A10032BarObsB ;
   private String A9842BarObsF ;
   private String AV10Inc_obs ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P02CR2_A396EmprCod ;
   private int[] P02CR2_A129BarCod ;
   private byte[] P02CR2_A132BarCodReo ;
   private String[] P02CR2_A130BarCodPar ;
   private String[] P02CR2_A758ProCod ;
   private short[] P02CR2_A194BarOrdLin ;
   private String[] P02CR2_A6173BarFasSec ;
   private boolean[] P02CR2_n6173BarFasSec ;
   private String[] P02CR2_A6012BarFasTip ;
   private boolean[] P02CR2_n6012BarFasTip ;
   private String[] P02CR2_A5048BarFasUsu ;
   private boolean[] P02CR2_n5048BarFasUsu ;
   private java.util.Date[] P02CR2_A5047BarFasFPl ;
   private boolean[] P02CR2_n5047BarFasFPl ;
   private java.util.Date[] P02CR2_A4443BarFasDTF ;
   private boolean[] P02CR2_n4443BarFasDTF ;
   private java.util.Date[] P02CR2_A4442BarFasDTI ;
   private boolean[] P02CR2_n4442BarFasDTI ;
   private int[] P02CR2_A4638BarUltNlot ;
   private boolean[] P02CR2_n4638BarUltNlot ;
   private int[] P02CR2_A4022BarNumBot ;
   private String[] P02CR2_A4021BarFasBot ;
   private java.math.BigDecimal[] P02CR2_A3838BarFasMtr ;
   private boolean[] P02CR2_n3838BarFasMtr ;
   private java.math.BigDecimal[] P02CR2_A3837BarFasKgm ;
   private boolean[] P02CR2_n3837BarFasKgm ;
   private String[] P02CR2_A179BarLoc ;
   private java.util.Date[] P02CR2_A3298BarFecRIni ;
   private java.math.BigDecimal[] P02CR2_A215BarTieRea ;
   private short[] P02CR2_A164BarHorFin ;
   private short[] P02CR2_A165BarHorIni ;
   private java.math.BigDecimal[] P02CR2_A227BarUni ;
   private java.util.Date[] P02CR2_A160BarFecRea ;
   private byte[] P02CR2_A153BarFasEst ;
   private short[] P02CR2_A12466SolAfLnUl ;
   private boolean[] P02CR2_n12466SolAfLnUl ;
   private short[] P02CR2_A12465SolLzLnUl ;
   private boolean[] P02CR2_n12465SolLzLnUl ;
   private short[] P02CR2_A12464SolPlLnUl ;
   private boolean[] P02CR2_n12464SolPlLnUl ;
   private short[] P02CR2_A12463SolSAlLnUl ;
   private boolean[] P02CR2_n12463SolSAlLnUl ;
   private short[] P02CR2_A12462SolSAcLnUl ;
   private boolean[] P02CR2_n12462SolSAcLnUl ;
   private short[] P02CR2_A12461SolFrLnUl ;
   private boolean[] P02CR2_n12461SolFrLnUl ;
   private short[] P02CR2_A12460SolAgLnUl ;
   private boolean[] P02CR2_n12460SolAgLnUl ;
   private short[] P02CR2_A12459SolLvLnUl ;
   private boolean[] P02CR2_n12459SolLvLnUl ;
   private String[] P02CR2_A12458TsSolObs ;
   private boolean[] P02CR2_n12458TsSolObs ;
   private java.util.Date[] P02CR2_A12457TsSolRFec ;
   private boolean[] P02CR2_n12457TsSolRFec ;
   private int[] P02CR2_A12456TsSolRLcq ;
   private boolean[] P02CR2_n12456TsSolRLcq ;
   private java.util.Date[] P02CR2_A12455TsSolTFec ;
   private boolean[] P02CR2_n12455TsSolTFec ;
   private int[] P02CR2_A12454TsSolTLcq ;
   private boolean[] P02CR2_n12454TsSolTLcq ;
   private byte[] P02CR2_A12379BarFasBlq ;
   private boolean[] P02CR2_n12379BarFasBlq ;
   private String[] P02CR2_A12360BarFasTOb ;
   private boolean[] P02CR2_n12360BarFasTOb ;
   private String[] P02CR2_A12359BarFasObs ;
   private boolean[] P02CR2_n12359BarFasObs ;
   private String[] P02CR2_A2327BarFasSer ;
   private boolean[] P02CR2_n2327BarFasSer ;
   private byte[] P02CR2_A3836BarFasPri ;
   private String[] P02CR2_A10032BarObsB ;
   private boolean[] P02CR2_n10032BarObsB ;
   private String[] P02CR2_A9842BarObsF ;
   private boolean[] P02CR2_n9842BarObsF ;
   private short[] P02CR2_A8938BarfasPri2 ;
   private boolean[] P02CR2_n8938BarfasPri2 ;
   private String[] P02CR2_A8594BarHdrO ;
   private boolean[] P02CR2_n8594BarHdrO ;
   private short[] P02CR2_A7933Dtb_UOrd ;
   private boolean[] P02CR2_n7933Dtb_UOrd ;
   private java.math.BigDecimal[] P02CR2_A7914BarfasRb ;
   private boolean[] P02CR2_n7914BarfasRb ;
   private java.math.BigDecimal[] P02CR2_A7913BarfasUnpL ;
   private boolean[] P02CR2_n7913BarfasUnpL ;
   private java.math.BigDecimal[] P02CR2_A7912Barfastpp ;
   private boolean[] P02CR2_n7912Barfastpp ;
   private byte[] P02CR2_A6555BarFasNPl ;
   private short[] P02CR2_A6430BarTieAut ;
   private String[] P02CR2_A6392BarHdMn ;
   private boolean[] P02CR2_n6392BarHdMn ;
   private short[] P02CR2_A6391BarfasOP ;
   private boolean[] P02CR2_n6391BarfasOP ;
   private String[] P02CR2_A6390BarfasMn ;
   private boolean[] P02CR2_n6390BarfasMn ;
   private java.math.BigDecimal[] P02CR2_A5999BarFasCR ;
   private String[] P02CR2_A5896BarMaqPlan ;
   private boolean[] P02CR2_n5896BarMaqPlan ;
   private java.math.BigDecimal[] P02CR2_A5720BarFasMtT ;
   private boolean[] P02CR2_n5720BarFasMtT ;
   private java.math.BigDecimal[] P02CR2_A5719BarFasKgT ;
   private boolean[] P02CR2_n5719BarFasKgT ;
   private short[] P02CR2_A5372FasQuiUl ;
   private boolean[] P02CR2_n5372FasQuiUl ;
   private String[] P02CR2_A5369BarFasGral ;
   private boolean[] P02CR2_n5369BarFasGral ;
   private String[] P02CR2_A5046BarFasPrp ;
   private boolean[] P02CR2_n5046BarFasPrp ;
   private String[] P02CR2_A5045BarFasAgr ;
   private boolean[] P02CR2_n5045BarFasAgr ;
   private String[] P02CR2_A457FasCod ;
   private short[] P02CR2_A4974BarFasPPr ;
   private boolean[] P02CR2_n4974BarFasPPr ;
   private java.math.BigDecimal[] P02CR2_A4973BarFasKPr ;
   private boolean[] P02CR2_n4973BarFasKPr ;
   private byte[] P02CR2_A4938BarFasInc ;
   private boolean[] P02CR2_n4938BarFasInc ;
   private String[] P02CR2_A4905BarFasAcab ;
   private String[] P02CR2_A4637BarFasCara ;
   private int[] P02CR2_A4636BarFasPzas ;
   private boolean[] P02CR2_n4636BarFasPzas ;
   private int[] P02CR2_A4288BarNPzas ;
   private String[] P02CR2_A4301BarFasCoP ;
   private String[] P02CR2_A4287BarFasFor ;
   private java.math.BigDecimal[] P02CR2_A216BarTieTeo ;
   private java.util.Date[] P02CR2_A162BarFecTeo ;
   private String[] P02CR2_A150BarFacTin ;
   private String[] P02CR2_A603MaqCodBis ;
   private String[] P02CR2_A152BarFasCon ;
}

final  class popenfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02CR2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasSec, BarFasTip, BarFasUsu, BarFasFPl, BarFasDTF, BarFasDTI, BarUltNlot, BarNumBot, BarFasBot, BarFasMtr, BarFasKgm, BarLoc, BarFecRIni, BarTieRea, BarHorFin, BarHorIni, BarUni, BarFecRea, BarFasEst, SolAfLnUl, SolLzLnUl, SolPlLnUl, SolSAlLnUl, SolSAcLnUl, SolFrLnUl, SolAgLnUl, SolLvLnUl, TsSolObs, TsSolRFec, TsSolRLcq, TsSolTFec, TsSolTLcq, BarFasBlq, BarFasTOb, BarFasObs, BarFasSer, BarFasPri, BarObsB, BarObsF, BarfasPri2, BarHdrO, Dtb_UOrd, BarfasRb, BarfasUnpL, Barfastpp, BarFasNPl, BarTieAut, BarHdMn, BarfasOP, BarfasMn, BarFasCR, BarMaqPlan, BarFasMtT, BarFasKgT, FasQuiUl, BarFasGral, BarFasPrp, BarFasAgr, FasCod, BarFasPPr, BarFasKPr, BarFasInc, BarFasAcab, BarFasCara, BarFasPzas, BarNPzas, BarFasCoP, BarFasFor, BarTieTeo, BarFecTeo, BarFacTin, MaqCodBis, BarFasCon FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02CR3", "INSERT INTO TXPBARFAS(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, BarFasEst, MaqCodBis, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarLoc, BarFasKgm, BarFasMtr, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarNPzas, BarFasPzas, BarFasCara, BarUltNlot, BarFasAcab, BarFasInc, BarFasDTI, BarFasDTF, BarFasKPr, BarFasPPr, FasCod, BarFasAgr, BarFasPrp, BarFasFPl, BarFasUsu, BarFasGral, FasQuiUl, BarFasKgT, BarFasMtT, BarMaqPlan, BarFasCR, BarFasTip, BarFasSec, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasPri, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((String[]) buf[21])[0] = rslt.getString(15, 1);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 10);
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(19);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(20,2);
               ((short[]) buf[29])[0] = rslt.getShort(21);
               ((short[]) buf[30])[0] = rslt.getShort(22);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(23,2);
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(24);
               ((byte[]) buf[33])[0] = rslt.getByte(25);
               ((short[]) buf[34])[0] = rslt.getShort(26);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(27);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((short[]) buf[38])[0] = rslt.getShort(28);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((short[]) buf[40])[0] = rslt.getShort(29);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((short[]) buf[42])[0] = rslt.getShort(30);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((short[]) buf[44])[0] = rslt.getShort(31);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((short[]) buf[46])[0] = rslt.getShort(32);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(33);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getVarchar(34);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDateTime(35);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((int[]) buf[54])[0] = rslt.getInt(36);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDateTime(37);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((int[]) buf[58])[0] = rslt.getInt(38);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((byte[]) buf[60])[0] = rslt.getByte(39);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getVarchar(41);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(42, 16);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((byte[]) buf[68])[0] = rslt.getByte(43);
               ((String[]) buf[69])[0] = rslt.getVarchar(44);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(45);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((short[]) buf[73])[0] = rslt.getShort(46);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(47, 11);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((short[]) buf[77])[0] = rslt.getShort(48);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[79])[0] = rslt.getBigDecimal(49,2);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(50,2);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(51,2);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((byte[]) buf[85])[0] = rslt.getByte(52);
               ((short[]) buf[86])[0] = rslt.getShort(53);
               ((String[]) buf[87])[0] = rslt.getString(54, 10);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((short[]) buf[89])[0] = rslt.getShort(55);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(56, 10);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[93])[0] = rslt.getBigDecimal(57,5);
               ((String[]) buf[94])[0] = rslt.getString(58, 6);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[96])[0] = rslt.getBigDecimal(59,2);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[98])[0] = rslt.getBigDecimal(60,2);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((short[]) buf[100])[0] = rslt.getShort(61);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getString(62, 1);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getString(63, 1);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(64, 1);
               ((boolean[]) buf[107])[0] = rslt.wasNull();
               ((String[]) buf[108])[0] = rslt.getString(65, 8);
               ((short[]) buf[109])[0] = rslt.getShort(66);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[111])[0] = rslt.getBigDecimal(67,2);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((byte[]) buf[113])[0] = rslt.getByte(68);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((String[]) buf[115])[0] = rslt.getString(69, 1);
               ((String[]) buf[116])[0] = rslt.getString(70, 1);
               ((int[]) buf[117])[0] = rslt.getInt(71);
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((int[]) buf[119])[0] = rslt.getInt(72);
               ((String[]) buf[120])[0] = rslt.getString(73, 1);
               ((String[]) buf[121])[0] = rslt.getString(74, 1);
               ((java.math.BigDecimal[]) buf[122])[0] = rslt.getBigDecimal(75,2);
               ((java.util.Date[]) buf[123])[0] = rslt.getGXDate(76);
               ((String[]) buf[124])[0] = rslt.getString(77, 1);
               ((String[]) buf[125])[0] = rslt.getString(78, 6);
               ((String[]) buf[126])[0] = rslt.getString(79, 1);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
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
      }
   }

}

