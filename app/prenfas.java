package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prenfas extends GXProcedure
{
   public prenfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prenfas.class ), "" );
   }

   public prenfas( int remoteHandle ,
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
      prenfas.this.aP5 = new String[] {""};
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
      prenfas.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      prenfas.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      prenfas.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      prenfas.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      prenfas.this.AV19ProCod = aP4[0];
      this.aP4 = aP4;
      prenfas.this.AV20Modo = aP5[0];
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
      if ( ! (0==AV36Contador) )
      {
         if ( AV122NoRenumero == 0 )
         {
            Gx_msg = httpContext.getMessage( "Ini Prenfas. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
            System.out.println( Gx_msg );
            AV21FasLin = (short)(0) ;
            /* Using cursor P000K2 */
            pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A396EmprCod = P000K2_A396EmprCod[0] ;
               A129BarCod = P000K2_A129BarCod[0] ;
               A132BarCodReo = P000K2_A132BarCodReo[0] ;
               A130BarCodPar = P000K2_A130BarCodPar[0] ;
               A758ProCod = P000K2_A758ProCod[0] ;
               A761ProFasLin = P000K2_A761ProFasLin[0] ;
               n761ProFasLin = P000K2_n761ProFasLin[0] ;
               AV35UltLin = (short)(0) ;
               AV69Procodi = A758ProCod ;
               Gx_msg = httpContext.getMessage( "Read Barfas. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
               System.out.println( Gx_msg );
               /* Using cursor P000K3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A194BarOrdLin = P000K3_A194BarOrdLin[0] ;
                  A457FasCod = P000K3_A457FasCod[0] ;
                  n457FasCod = P000K3_n457FasCod[0] ;
                  A153BarFasEst = P000K3_A153BarFasEst[0] ;
                  A162BarFecTeo = P000K3_A162BarFecTeo[0] ;
                  A160BarFecRea = P000K3_A160BarFecRea[0] ;
                  A216BarTieTeo = P000K3_A216BarTieTeo[0] ;
                  A227BarUni = P000K3_A227BarUni[0] ;
                  A179BarLoc = P000K3_A179BarLoc[0] ;
                  A165BarHorIni = P000K3_A165BarHorIni[0] ;
                  A164BarHorFin = P000K3_A164BarHorFin[0] ;
                  A215BarTieRea = P000K3_A215BarTieRea[0] ;
                  A603MaqCodBis = P000K3_A603MaqCodBis[0] ;
                  A152BarFasCon = P000K3_A152BarFasCon[0] ;
                  A150BarFacTin = P000K3_A150BarFacTin[0] ;
                  A3298BarFecRIni = P000K3_A3298BarFecRIni[0] ;
                  A4287BarFasFor = P000K3_A4287BarFasFor[0] ;
                  A4637BarFasCara = P000K3_A4637BarFasCara[0] ;
                  A4022BarNumBot = P000K3_A4022BarNumBot[0] ;
                  A5369BarFasGral = P000K3_A5369BarFasGral[0] ;
                  n5369BarFasGral = P000K3_n5369BarFasGral[0] ;
                  A4301BarFasCoP = P000K3_A4301BarFasCoP[0] ;
                  A5896BarMaqPlan = P000K3_A5896BarMaqPlan[0] ;
                  n5896BarMaqPlan = P000K3_n5896BarMaqPlan[0] ;
                  A4905BarFasAcab = P000K3_A4905BarFasAcab[0] ;
                  A3837BarFasKgm = P000K3_A3837BarFasKgm[0] ;
                  n3837BarFasKgm = P000K3_n3837BarFasKgm[0] ;
                  A3838BarFasMtr = P000K3_A3838BarFasMtr[0] ;
                  n3838BarFasMtr = P000K3_n3838BarFasMtr[0] ;
                  A5719BarFasKgT = P000K3_A5719BarFasKgT[0] ;
                  n5719BarFasKgT = P000K3_n5719BarFasKgT[0] ;
                  A5720BarFasMtT = P000K3_A5720BarFasMtT[0] ;
                  n5720BarFasMtT = P000K3_n5720BarFasMtT[0] ;
                  A6390BarfasMn = P000K3_A6390BarfasMn[0] ;
                  n6390BarfasMn = P000K3_n6390BarfasMn[0] ;
                  A6391BarfasOP = P000K3_A6391BarfasOP[0] ;
                  n6391BarfasOP = P000K3_n6391BarfasOP[0] ;
                  A6392BarHdMn = P000K3_A6392BarHdMn[0] ;
                  n6392BarHdMn = P000K3_n6392BarHdMn[0] ;
                  A6173BarFasSec = P000K3_A6173BarFasSec[0] ;
                  n6173BarFasSec = P000K3_n6173BarFasSec[0] ;
                  A7914BarfasRb = P000K3_A7914BarfasRb[0] ;
                  n7914BarfasRb = P000K3_n7914BarfasRb[0] ;
                  A7933Dtb_UOrd = P000K3_A7933Dtb_UOrd[0] ;
                  n7933Dtb_UOrd = P000K3_n7933Dtb_UOrd[0] ;
                  A7913BarfasUnpL = P000K3_A7913BarfasUnpL[0] ;
                  n7913BarfasUnpL = P000K3_n7913BarfasUnpL[0] ;
                  A7912Barfastpp = P000K3_A7912Barfastpp[0] ;
                  n7912Barfastpp = P000K3_n7912Barfastpp[0] ;
                  A6555BarFasNPl = P000K3_A6555BarFasNPl[0] ;
                  A6430BarTieAut = P000K3_A6430BarTieAut[0] ;
                  A5999BarFasCR = P000K3_A5999BarFasCR[0] ;
                  A5372FasQuiUl = P000K3_A5372FasQuiUl[0] ;
                  n5372FasQuiUl = P000K3_n5372FasQuiUl[0] ;
                  A5048BarFasUsu = P000K3_A5048BarFasUsu[0] ;
                  n5048BarFasUsu = P000K3_n5048BarFasUsu[0] ;
                  A5047BarFasFPl = P000K3_A5047BarFasFPl[0] ;
                  n5047BarFasFPl = P000K3_n5047BarFasFPl[0] ;
                  A5046BarFasPrp = P000K3_A5046BarFasPrp[0] ;
                  n5046BarFasPrp = P000K3_n5046BarFasPrp[0] ;
                  A5045BarFasAgr = P000K3_A5045BarFasAgr[0] ;
                  n5045BarFasAgr = P000K3_n5045BarFasAgr[0] ;
                  A4974BarFasPPr = P000K3_A4974BarFasPPr[0] ;
                  n4974BarFasPPr = P000K3_n4974BarFasPPr[0] ;
                  A4973BarFasKPr = P000K3_A4973BarFasKPr[0] ;
                  n4973BarFasKPr = P000K3_n4973BarFasKPr[0] ;
                  A4443BarFasDTF = P000K3_A4443BarFasDTF[0] ;
                  n4443BarFasDTF = P000K3_n4443BarFasDTF[0] ;
                  A4442BarFasDTI = P000K3_A4442BarFasDTI[0] ;
                  n4442BarFasDTI = P000K3_n4442BarFasDTI[0] ;
                  A4938BarFasInc = P000K3_A4938BarFasInc[0] ;
                  n4938BarFasInc = P000K3_n4938BarFasInc[0] ;
                  A8594BarHdrO = P000K3_A8594BarHdrO[0] ;
                  n8594BarHdrO = P000K3_n8594BarHdrO[0] ;
                  A8938BarfasPri2 = P000K3_A8938BarfasPri2[0] ;
                  n8938BarfasPri2 = P000K3_n8938BarfasPri2[0] ;
                  A9842BarObsF = P000K3_A9842BarObsF[0] ;
                  n9842BarObsF = P000K3_n9842BarObsF[0] ;
                  A6012BarFasTip = P000K3_A6012BarFasTip[0] ;
                  n6012BarFasTip = P000K3_n6012BarFasTip[0] ;
                  A10032BarObsB = P000K3_A10032BarObsB[0] ;
                  n10032BarObsB = P000K3_n10032BarObsB[0] ;
                  AV21FasLin = (short)(AV21FasLin+100) ;
                  AV22FasCod = A457FasCod ;
                  AV23BarFasEst = A153BarFasEst ;
                  AV24BarFecTeo = A162BarFecTeo ;
                  AV25BarFecRea = A160BarFecRea ;
                  AV26BarTieTeo = A216BarTieTeo ;
                  AV27BarUni = A227BarUni ;
                  AV28BarLoc = A179BarLoc ;
                  AV29BarHorIni = A165BarHorIni ;
                  AV30BarHorFin = A164BarHorFin ;
                  AV31BarTieRea = A215BarTieRea ;
                  AV32MaqCodBis = A603MaqCodBis ;
                  AV33BarFasCon = A152BarFasCon ;
                  AV34BarFacTin = A150BarFacTin ;
                  AV38BarFecRIni = A3298BarFecRIni ;
                  AV40BarFasFor = A4287BarFasFor ;
                  AV42BarFasCara = A4637BarFasCara ;
                  AV43BarNumBot = A4022BarNumBot ;
                  AV44BarFasGral = A5369BarFasGral ;
                  AV46BarFasCop = A4301BarFasCoP ;
                  AV47BarMaqPlan = A5896BarMaqPlan ;
                  AV48BarFasAcab = A4905BarFasAcab ;
                  AV49BARFASKGM = A3837BarFasKgm ;
                  AV50BARFASMTR = A3838BarFasMtr ;
                  AV51BARFASKGT = A5719BarFasKgT ;
                  AV52BARFASMTT = A5720BarFasMtT ;
                  AV53BarfasMn = A6390BarfasMn ;
                  AV54Barfasop = A6391BarfasOP ;
                  AV55BarHdmn = A6392BarHdMn ;
                  AV70BarFasSec = A6173BarFasSec ;
                  AV71Barfasrb = A7914BarfasRb ;
                  AV103Dtb_UOrd = A7933Dtb_UOrd ;
                  AV88BarfasUnpL = A7913BarfasUnpL ;
                  AV89Barfastpp = A7912Barfastpp ;
                  AV90Barfasnpl = A6555BarFasNPl ;
                  AV91Bartieaut = A6430BarTieAut ;
                  AV92barfascr = A5999BarFasCR ;
                  AV93fasquiul = A5372FasQuiUl ;
                  AV94barfasusu = A5048BarFasUsu ;
                  AV95barfasfpl = A5047BarFasFPl ;
                  AV96barfasprp = A5046BarFasPrp ;
                  AV97barfasagr = A5045BarFasAgr ;
                  AV98barfasppr = A4974BarFasPPr ;
                  AV99barfaskpr = A4973BarFasKPr ;
                  AV100barfasdtf = A4443BarFasDTF ;
                  AV101barfasdti = A4442BarFasDTI ;
                  AV102barfasinc = A4938BarFasInc ;
                  AV104BarHdrO = A8594BarHdrO ;
                  AV105Barfaspri2 = A8938BarfasPri2 ;
                  AV109Barobsf = A9842BarObsF ;
                  AV108Barfastip = A6012BarFasTip ;
                  AV120BarObsb = A10032BarObsB ;
                  Gx_msg = httpContext.getMessage( "New Renfas ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
                  System.out.println( Gx_msg );
                  /*
                     INSERT RECORD ON TABLE TXPRENFAS

                  */
                  W457FasCod = A457FasCod ;
                  n457FasCod = false ;
                  A1654RenTerCod = AV37Termcod ;
                  A308CodPro = AV69Procodi ;
                  A654OrdLin = AV21FasLin ;
                  A457FasCod = AV22FasCod ;
                  n457FasCod = false ;
                  A816RenFasEst = AV23BarFasEst ;
                  n816RenFasEst = false ;
                  A822RenMaqCod = AV32MaqCodBis ;
                  n822RenMaqCod = false ;
                  A818RenFecTeo = AV24BarFecTeo ;
                  n818RenFecTeo = false ;
                  A817RenFecRea = AV25BarFecRea ;
                  n817RenFecRea = false ;
                  A824RenTieTeo = AV26BarTieTeo ;
                  n824RenTieTeo = false ;
                  A825RenUni = AV27BarUni ;
                  n825RenUni = false ;
                  A821RenLoc = AV28BarLoc ;
                  n821RenLoc = false ;
                  A820RenHorIni = AV29BarHorIni ;
                  n820RenHorIni = false ;
                  A819RenHorFin = AV30BarHorFin ;
                  n819RenHorFin = false ;
                  A823RenTieRea = AV31BarTieRea ;
                  n823RenTieRea = false ;
                  A815RenFasCon = AV33BarFasCon ;
                  n815RenFasCon = false ;
                  A814RenFacTin = AV34BarFacTin ;
                  n814RenFacTin = false ;
                  A3297RenFecRIni = AV38BarFecRIni ;
                  n3297RenFecRIni = false ;
                  A4593RenOrdLin = A194BarOrdLin ;
                  n4593RenOrdLin = false ;
                  A4739RenFasFor = AV40BarFasFor ;
                  n4739RenFasFor = false ;
                  A4904RenFasAcab = AV48BarFasAcab ;
                  n4904RenFasAcab = false ;
                  A4743RenFasCara = AV42BarFasCara ;
                  n4743RenFasCara = false ;
                  A4738RenNumBot = AV43BarNumBot ;
                  n4738RenNumBot = false ;
                  A5370RenFasGral = AV44BarFasGral ;
                  n5370RenFasGral = false ;
                  A4741RenFasCop = AV46BarFasCop ;
                  n4741RenFasCop = false ;
                  A5897RenMaqPlan = AV47BarMaqPlan ;
                  n5897RenMaqPlan = false ;
                  A4735RenFasKgm = AV49BARFASKGM ;
                  n4735RenFasKgm = false ;
                  A4736RenFasMtr = AV50BARFASMTR ;
                  n4736RenFasMtr = false ;
                  A5992RenFasKgT = AV51BARFASKGT ;
                  n5992RenFasKgT = false ;
                  A5993RenFasMtT = AV52BARFASMTT ;
                  n5993RenFasMtT = false ;
                  A6394RenfasOP = AV54Barfasop ;
                  n6394RenfasOP = false ;
                  A6393RenFasMn = AV53BarfasMn ;
                  n6393RenFasMn = false ;
                  A6395RenHdMn = AV55BarHdmn ;
                  n6395RenHdMn = false ;
                  A6172RenFasSec = AV70BarFasSec ;
                  n6172RenFasSec = false ;
                  A8472RenfasRb = AV71Barfasrb ;
                  n8472RenfasRb = false ;
                  A8505Renuord = AV103Dtb_UOrd ;
                  n8505Renuord = false ;
                  A8504Renfasunpl = AV88BarfasUnpL ;
                  n8504Renfasunpl = false ;
                  A8503Renfastpp = AV89Barfastpp ;
                  n8503Renfastpp = false ;
                  A8502Renfasnpl = AV90Barfasnpl ;
                  n8502Renfasnpl = false ;
                  A8501Rentieaut = AV91Bartieaut ;
                  n8501Rentieaut = false ;
                  A8500Renfascr = AV92barfascr ;
                  n8500Renfascr = false ;
                  A8499Renquiul = AV93fasquiul ;
                  n8499Renquiul = false ;
                  A8498Renfasusu = AV94barfasusu ;
                  n8498Renfasusu = false ;
                  A8497Renfasfpl = AV95barfasfpl ;
                  n8497Renfasfpl = false ;
                  A8496Renfasprp = AV96barfasprp ;
                  n8496Renfasprp = false ;
                  A8495Renfasagr = AV97barfasagr ;
                  n8495Renfasagr = false ;
                  A8494RenfasPpr = AV98barfasppr ;
                  n8494RenfasPpr = false ;
                  A8493Renfaskpr = AV99barfaskpr ;
                  n8493Renfaskpr = false ;
                  A8492Renfasdtf = AV100barfasdtf ;
                  n8492Renfasdtf = false ;
                  A8491Renfasdti = AV101barfasdti ;
                  n8491Renfasdti = false ;
                  A8490Renfasinc = AV102barfasinc ;
                  n8490Renfasinc = false ;
                  A8595RenHdrO = AV104BarHdrO ;
                  n8595RenHdrO = false ;
                  A8939Renfaspri2 = AV105Barfaspri2 ;
                  n8939Renfaspri2 = false ;
                  A6013RenFasTip = AV108Barfastip ;
                  n6013RenFasTip = false ;
                  A9856RenObsF = AV109Barobsf ;
                  n9856RenObsF = false ;
                  A10130RenObsB = AV120BarObsb ;
                  n10130RenObsB = false ;
                  /* Using cursor P000K4 */
                  pr_default.execute(2, new Object[] {A1654RenTerCod, A308CodPro, Short.valueOf(A654OrdLin), Boolean.valueOf(n457FasCod), A457FasCod, Boolean.valueOf(n816RenFasEst), Byte.valueOf(A816RenFasEst), Boolean.valueOf(n818RenFecTeo), A818RenFecTeo, Boolean.valueOf(n817RenFecRea), A817RenFecRea, Boolean.valueOf(n824RenTieTeo), A824RenTieTeo, Boolean.valueOf(n825RenUni), A825RenUni, Boolean.valueOf(n821RenLoc), A821RenLoc, Boolean.valueOf(n820RenHorIni), Short.valueOf(A820RenHorIni), Boolean.valueOf(n819RenHorFin), Short.valueOf(A819RenHorFin), Boolean.valueOf(n823RenTieRea), A823RenTieRea, Boolean.valueOf(n822RenMaqCod), A822RenMaqCod, Boolean.valueOf(n815RenFasCon), A815RenFasCon, Boolean.valueOf(n814RenFacTin), A814RenFacTin, Boolean.valueOf(n3297RenFecRIni), A3297RenFecRIni, Boolean.valueOf(n4593RenOrdLin), Short.valueOf(A4593RenOrdLin), Boolean.valueOf(n4735RenFasKgm), A4735RenFasKgm, Boolean.valueOf(n4736RenFasMtr), A4736RenFasMtr, Boolean.valueOf(n4738RenNumBot), Integer.valueOf(A4738RenNumBot), Boolean.valueOf(n4739RenFasFor), A4739RenFasFor, Boolean.valueOf(n4741RenFasCop), A4741RenFasCop, Boolean.valueOf(n4743RenFasCara), A4743RenFasCara, Boolean.valueOf(n4904RenFasAcab), A4904RenFasAcab, Boolean.valueOf(n5370RenFasGral), A5370RenFasGral, Boolean.valueOf(n5897RenMaqPlan), A5897RenMaqPlan, Boolean.valueOf(n5992RenFasKgT), A5992RenFasKgT, Boolean.valueOf(n5993RenFasMtT), A5993RenFasMtT, Boolean.valueOf(n6013RenFasTip), A6013RenFasTip, Boolean.valueOf(n6172RenFasSec), A6172RenFasSec, Boolean.valueOf(n6393RenFasMn), A6393RenFasMn, Boolean.valueOf(n6394RenfasOP), Short.valueOf(A6394RenfasOP), Boolean.valueOf(n6395RenHdMn), A6395RenHdMn, Boolean.valueOf(n8472RenfasRb), A8472RenfasRb, Boolean.valueOf(n8490Renfasinc), Byte.valueOf(A8490Renfasinc), Boolean.valueOf(n8491Renfasdti), A8491Renfasdti, Boolean.valueOf(n8492Renfasdtf), A8492Renfasdtf, Boolean.valueOf(n8493Renfaskpr), A8493Renfaskpr, Boolean.valueOf(n8494RenfasPpr), Short.valueOf(A8494RenfasPpr), Boolean.valueOf(n8495Renfasagr), A8495Renfasagr, Boolean.valueOf(n8496Renfasprp), A8496Renfasprp, Boolean.valueOf(n8497Renfasfpl), A8497Renfasfpl, Boolean.valueOf(n8498Renfasusu), A8498Renfasusu, Boolean.valueOf(n8499Renquiul), Short.valueOf(A8499Renquiul), Boolean.valueOf(n8500Renfascr), A8500Renfascr, Boolean.valueOf(n8501Rentieaut), Short.valueOf(A8501Rentieaut), Boolean.valueOf(n8502Renfasnpl), Byte.valueOf(A8502Renfasnpl), Boolean.valueOf(n8503Renfastpp), A8503Renfastpp, Boolean.valueOf(n8504Renfasunpl), A8504Renfasunpl, Boolean.valueOf(n8505Renuord), Short.valueOf(A8505Renuord), Boolean.valueOf(n8595RenHdrO), A8595RenHdrO, Boolean.valueOf(n8939Renfaspri2), Short.valueOf(A8939Renfaspri2), Boolean.valueOf(n9856RenObsF), A9856RenObsF, Boolean.valueOf(n10130RenObsB), A10130RenObsB});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRENFAS");
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
                  A457FasCod = W457FasCod ;
                  n457FasCod = false ;
                  /* End Insert */
                  Gx_msg = httpContext.getMessage( "Fin Prenfas. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
                  System.out.println( Gx_msg );
                  Gx_msg = httpContext.getMessage( "Go Pelipi3. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
                  System.out.println( Gx_msg );
                  GXv_char1[0] = A396EmprCod ;
                  GXv_int2[0] = A129BarCod ;
                  GXv_int3[0] = A132BarCodReo ;
                  GXv_char4[0] = A130BarCodPar ;
                  GXv_char5[0] = A758ProCod ;
                  GXv_int6[0] = A194BarOrdLin ;
                  new app.pelipi3(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_int6) ;
                  prenfas.this.A396EmprCod = GXv_char1[0] ;
                  prenfas.this.A129BarCod = GXv_int2[0] ;
                  prenfas.this.A132BarCodReo = GXv_int3[0] ;
                  prenfas.this.A130BarCodPar = GXv_char4[0] ;
                  prenfas.this.A758ProCod = GXv_char5[0] ;
                  prenfas.this.A194BarOrdLin = GXv_int6[0] ;
                  Gx_msg = httpContext.getMessage( "Ret Pelipi3. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
                  System.out.println( Gx_msg );
                  AV35UltLin = AV21FasLin ;
                  /* Using cursor P000K5 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  Gx_msg = httpContext.getMessage( "Delete Barfas. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
                  System.out.println( Gx_msg );
                  pr_default.readNext(1);
               }
               pr_default.close(1);
               A761ProFasLin = AV35UltLin ;
               n761ProFasLin = false ;
               /* Using cursor P000K6 */
               pr_default.execute(4, new Object[] {Boolean.valueOf(n761ProFasLin), Short.valueOf(A761ProFasLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
               pr_default.readNext(0);
            }
            pr_default.close(0);
            Gx_msg = httpContext.getMessage( "Read Lhipro. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
            System.out.println( Gx_msg );
            /* Using cursor P000K7 */
            pr_default.execute(5, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A194BarOrdLin = P000K7_A194BarOrdLin[0] ;
               A130BarCodPar = P000K7_A130BarCodPar[0] ;
               A132BarCodReo = P000K7_A132BarCodReo[0] ;
               A129BarCod = P000K7_A129BarCod[0] ;
               A396EmprCod = P000K7_A396EmprCod[0] ;
               A558HisProFec = P000K7_A558HisProFec[0] ;
               A602MaqCod = P000K7_A602MaqCod[0] ;
               A561HisProLin = P000K7_A561HisProLin[0] ;
               AV41BarOrdLIn = A194BarOrdLin ;
               /* Using cursor P000K8 */
               pr_default.execute(6, new Object[] {AV37Termcod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A129BarCod), Integer.valueOf(AV16BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(AV17BarCodReo), A130BarCodPar, AV18BarCodPar});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A4593RenOrdLin = P000K8_A4593RenOrdLin[0] ;
                  n4593RenOrdLin = P000K8_n4593RenOrdLin[0] ;
                  A1654RenTerCod = P000K8_A1654RenTerCod[0] ;
                  A654OrdLin = P000K8_A654OrdLin[0] ;
                  A308CodPro = P000K8_A308CodPro[0] ;
                  AV41BarOrdLIn = A654OrdLin ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               A194BarOrdLin = AV41BarOrdLIn ;
               /* Using cursor P000K9 */
               pr_default.execute(7, new Object[] {Short.valueOf(A194BarOrdLin), A396EmprCod, A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
               pr_default.readNext(5);
            }
            pr_default.close(5);
            Gx_msg = httpContext.getMessage( "Read Recmaq. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
            System.out.println( Gx_msg );
            /* Using cursor P000K10 */
            pr_default.execute(8, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A4268RecOrdLin = P000K10_A4268RecOrdLin[0] ;
               n4268RecOrdLin = P000K10_n4268RecOrdLin[0] ;
               A6039RecAcab = P000K10_A6039RecAcab[0] ;
               n6039RecAcab = P000K10_n6039RecAcab[0] ;
               A130BarCodPar = P000K10_A130BarCodPar[0] ;
               A132BarCodReo = P000K10_A132BarCodReo[0] ;
               A129BarCod = P000K10_A129BarCod[0] ;
               A396EmprCod = P000K10_A396EmprCod[0] ;
               A2804RecLinMaq = P000K10_A2804RecLinMaq[0] ;
               if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV41BarOrdLIn = A4268RecOrdLin ;
                  /* Using cursor P000K11 */
                  pr_default.execute(9, new Object[] {AV37Termcod, Boolean.valueOf(n4268RecOrdLin), Short.valueOf(A4268RecOrdLin), Integer.valueOf(A129BarCod), Integer.valueOf(AV16BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(AV17BarCodReo), A130BarCodPar, AV18BarCodPar});
                  while ( (pr_default.getStatus(9) != 101) )
                  {
                     A4593RenOrdLin = P000K11_A4593RenOrdLin[0] ;
                     n4593RenOrdLin = P000K11_n4593RenOrdLin[0] ;
                     A1654RenTerCod = P000K11_A1654RenTerCod[0] ;
                     A654OrdLin = P000K11_A654OrdLin[0] ;
                     A308CodPro = P000K11_A308CodPro[0] ;
                     AV41BarOrdLIn = A654OrdLin ;
                     pr_default.readNext(9);
                  }
                  pr_default.close(9);
                  A4268RecOrdLin = AV41BarOrdLIn ;
                  n4268RecOrdLin = false ;
                  /* Using cursor P000K12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n4268RecOrdLin), Short.valueOf(A4268RecOrdLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
               }
               pr_default.readNext(8);
            }
            pr_default.close(8);
            Application.commitDataStores(context, remoteHandle, pr_default, "prenfas");
            Gx_msg = httpContext.getMessage( "Read Renfas. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
            System.out.println( Gx_msg );
            /* Using cursor P000K13 */
            pr_default.execute(11, new Object[] {AV37Termcod});
            while ( (pr_default.getStatus(11) != 101) )
            {
               A4593RenOrdLin = P000K13_A4593RenOrdLin[0] ;
               n4593RenOrdLin = P000K13_n4593RenOrdLin[0] ;
               A308CodPro = P000K13_A308CodPro[0] ;
               A654OrdLin = P000K13_A654OrdLin[0] ;
               A816RenFasEst = P000K13_A816RenFasEst[0] ;
               n816RenFasEst = P000K13_n816RenFasEst[0] ;
               A818RenFecTeo = P000K13_A818RenFecTeo[0] ;
               n818RenFecTeo = P000K13_n818RenFecTeo[0] ;
               A817RenFecRea = P000K13_A817RenFecRea[0] ;
               n817RenFecRea = P000K13_n817RenFecRea[0] ;
               A824RenTieTeo = P000K13_A824RenTieTeo[0] ;
               n824RenTieTeo = P000K13_n824RenTieTeo[0] ;
               A825RenUni = P000K13_A825RenUni[0] ;
               n825RenUni = P000K13_n825RenUni[0] ;
               A821RenLoc = P000K13_A821RenLoc[0] ;
               n821RenLoc = P000K13_n821RenLoc[0] ;
               A820RenHorIni = P000K13_A820RenHorIni[0] ;
               n820RenHorIni = P000K13_n820RenHorIni[0] ;
               A819RenHorFin = P000K13_A819RenHorFin[0] ;
               n819RenHorFin = P000K13_n819RenHorFin[0] ;
               A823RenTieRea = P000K13_A823RenTieRea[0] ;
               n823RenTieRea = P000K13_n823RenTieRea[0] ;
               A822RenMaqCod = P000K13_A822RenMaqCod[0] ;
               n822RenMaqCod = P000K13_n822RenMaqCod[0] ;
               A815RenFasCon = P000K13_A815RenFasCon[0] ;
               n815RenFasCon = P000K13_n815RenFasCon[0] ;
               A814RenFacTin = P000K13_A814RenFacTin[0] ;
               n814RenFacTin = P000K13_n814RenFacTin[0] ;
               A3297RenFecRIni = P000K13_A3297RenFecRIni[0] ;
               n3297RenFecRIni = P000K13_n3297RenFecRIni[0] ;
               A4739RenFasFor = P000K13_A4739RenFasFor[0] ;
               n4739RenFasFor = P000K13_n4739RenFasFor[0] ;
               A4904RenFasAcab = P000K13_A4904RenFasAcab[0] ;
               n4904RenFasAcab = P000K13_n4904RenFasAcab[0] ;
               A4743RenFasCara = P000K13_A4743RenFasCara[0] ;
               n4743RenFasCara = P000K13_n4743RenFasCara[0] ;
               A4738RenNumBot = P000K13_A4738RenNumBot[0] ;
               n4738RenNumBot = P000K13_n4738RenNumBot[0] ;
               A5370RenFasGral = P000K13_A5370RenFasGral[0] ;
               n5370RenFasGral = P000K13_n5370RenFasGral[0] ;
               A4741RenFasCop = P000K13_A4741RenFasCop[0] ;
               n4741RenFasCop = P000K13_n4741RenFasCop[0] ;
               A5897RenMaqPlan = P000K13_A5897RenMaqPlan[0] ;
               n5897RenMaqPlan = P000K13_n5897RenMaqPlan[0] ;
               A4735RenFasKgm = P000K13_A4735RenFasKgm[0] ;
               n4735RenFasKgm = P000K13_n4735RenFasKgm[0] ;
               A4736RenFasMtr = P000K13_A4736RenFasMtr[0] ;
               n4736RenFasMtr = P000K13_n4736RenFasMtr[0] ;
               A5992RenFasKgT = P000K13_A5992RenFasKgT[0] ;
               n5992RenFasKgT = P000K13_n5992RenFasKgT[0] ;
               A5993RenFasMtT = P000K13_A5993RenFasMtT[0] ;
               n5993RenFasMtT = P000K13_n5993RenFasMtT[0] ;
               A6394RenfasOP = P000K13_A6394RenfasOP[0] ;
               n6394RenfasOP = P000K13_n6394RenfasOP[0] ;
               A6393RenFasMn = P000K13_A6393RenFasMn[0] ;
               n6393RenFasMn = P000K13_n6393RenFasMn[0] ;
               A6395RenHdMn = P000K13_A6395RenHdMn[0] ;
               n6395RenHdMn = P000K13_n6395RenHdMn[0] ;
               A6172RenFasSec = P000K13_A6172RenFasSec[0] ;
               n6172RenFasSec = P000K13_n6172RenFasSec[0] ;
               A8472RenfasRb = P000K13_A8472RenfasRb[0] ;
               n8472RenfasRb = P000K13_n8472RenfasRb[0] ;
               A8505Renuord = P000K13_A8505Renuord[0] ;
               n8505Renuord = P000K13_n8505Renuord[0] ;
               A8504Renfasunpl = P000K13_A8504Renfasunpl[0] ;
               n8504Renfasunpl = P000K13_n8504Renfasunpl[0] ;
               A8503Renfastpp = P000K13_A8503Renfastpp[0] ;
               n8503Renfastpp = P000K13_n8503Renfastpp[0] ;
               A8502Renfasnpl = P000K13_A8502Renfasnpl[0] ;
               n8502Renfasnpl = P000K13_n8502Renfasnpl[0] ;
               A8501Rentieaut = P000K13_A8501Rentieaut[0] ;
               n8501Rentieaut = P000K13_n8501Rentieaut[0] ;
               A8500Renfascr = P000K13_A8500Renfascr[0] ;
               n8500Renfascr = P000K13_n8500Renfascr[0] ;
               A8499Renquiul = P000K13_A8499Renquiul[0] ;
               n8499Renquiul = P000K13_n8499Renquiul[0] ;
               A8498Renfasusu = P000K13_A8498Renfasusu[0] ;
               n8498Renfasusu = P000K13_n8498Renfasusu[0] ;
               A8497Renfasfpl = P000K13_A8497Renfasfpl[0] ;
               n8497Renfasfpl = P000K13_n8497Renfasfpl[0] ;
               A8496Renfasprp = P000K13_A8496Renfasprp[0] ;
               n8496Renfasprp = P000K13_n8496Renfasprp[0] ;
               A8495Renfasagr = P000K13_A8495Renfasagr[0] ;
               n8495Renfasagr = P000K13_n8495Renfasagr[0] ;
               A8494RenfasPpr = P000K13_A8494RenfasPpr[0] ;
               n8494RenfasPpr = P000K13_n8494RenfasPpr[0] ;
               A8493Renfaskpr = P000K13_A8493Renfaskpr[0] ;
               n8493Renfaskpr = P000K13_n8493Renfaskpr[0] ;
               A8492Renfasdtf = P000K13_A8492Renfasdtf[0] ;
               n8492Renfasdtf = P000K13_n8492Renfasdtf[0] ;
               A8491Renfasdti = P000K13_A8491Renfasdti[0] ;
               n8491Renfasdti = P000K13_n8491Renfasdti[0] ;
               A8490Renfasinc = P000K13_A8490Renfasinc[0] ;
               n8490Renfasinc = P000K13_n8490Renfasinc[0] ;
               A8595RenHdrO = P000K13_A8595RenHdrO[0] ;
               n8595RenHdrO = P000K13_n8595RenHdrO[0] ;
               A8939Renfaspri2 = P000K13_A8939Renfaspri2[0] ;
               n8939Renfaspri2 = P000K13_n8939Renfaspri2[0] ;
               A6013RenFasTip = P000K13_A6013RenFasTip[0] ;
               n6013RenFasTip = P000K13_n6013RenFasTip[0] ;
               A9856RenObsF = P000K13_A9856RenObsF[0] ;
               n9856RenObsF = P000K13_n9856RenObsF[0] ;
               A10130RenObsB = P000K13_A10130RenObsB[0] ;
               n10130RenObsB = P000K13_n10130RenObsB[0] ;
               A457FasCod = P000K13_A457FasCod[0] ;
               n457FasCod = P000K13_n457FasCod[0] ;
               A1654RenTerCod = P000K13_A1654RenTerCod[0] ;
               Gx_msg = httpContext.getMessage( "New Barfas. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
               System.out.println( Gx_msg );
               /*
                  INSERT RECORD ON TABLE TXPBARFAS

               */
               A396EmprCod = AV15EmprCod ;
               A129BarCod = AV16BarCod ;
               A132BarCodReo = AV17BarCodReo ;
               A130BarCodPar = AV18BarCodPar ;
               A758ProCod = A308CodPro ;
               A194BarOrdLin = A654OrdLin ;
               A153BarFasEst = A816RenFasEst ;
               A162BarFecTeo = A818RenFecTeo ;
               A160BarFecRea = A817RenFecRea ;
               A216BarTieTeo = A824RenTieTeo ;
               A227BarUni = A825RenUni ;
               A179BarLoc = A821RenLoc ;
               A165BarHorIni = A820RenHorIni ;
               A164BarHorFin = A819RenHorFin ;
               A215BarTieRea = A823RenTieRea ;
               A603MaqCodBis = A822RenMaqCod ;
               A152BarFasCon = A815RenFasCon ;
               A150BarFacTin = A814RenFacTin ;
               A3298BarFecRIni = A3297RenFecRIni ;
               A4287BarFasFor = A4739RenFasFor ;
               A4905BarFasAcab = A4904RenFasAcab ;
               A4637BarFasCara = A4743RenFasCara ;
               A4022BarNumBot = A4738RenNumBot ;
               A5369BarFasGral = A5370RenFasGral ;
               n5369BarFasGral = false ;
               A4301BarFasCoP = A4741RenFasCop ;
               A5896BarMaqPlan = A5897RenMaqPlan ;
               n5896BarMaqPlan = false ;
               A3837BarFasKgm = A4735RenFasKgm ;
               n3837BarFasKgm = false ;
               A3838BarFasMtr = A4736RenFasMtr ;
               n3838BarFasMtr = false ;
               A5719BarFasKgT = A5992RenFasKgT ;
               n5719BarFasKgT = false ;
               A5720BarFasMtT = A5993RenFasMtT ;
               n5720BarFasMtT = false ;
               A6391BarfasOP = A6394RenfasOP ;
               n6391BarfasOP = false ;
               A6390BarfasMn = A6393RenFasMn ;
               n6390BarfasMn = false ;
               A6392BarHdMn = A6395RenHdMn ;
               n6392BarHdMn = false ;
               A6173BarFasSec = A6172RenFasSec ;
               n6173BarFasSec = false ;
               A7914BarfasRb = A8472RenfasRb ;
               n7914BarfasRb = false ;
               A7933Dtb_UOrd = A8505Renuord ;
               n7933Dtb_UOrd = false ;
               A7913BarfasUnpL = A8504Renfasunpl ;
               n7913BarfasUnpL = false ;
               A7912Barfastpp = A8503Renfastpp ;
               n7912Barfastpp = false ;
               A6555BarFasNPl = A8502Renfasnpl ;
               A6430BarTieAut = A8501Rentieaut ;
               A5999BarFasCR = A8500Renfascr ;
               A5372FasQuiUl = A8499Renquiul ;
               n5372FasQuiUl = false ;
               A5048BarFasUsu = A8498Renfasusu ;
               n5048BarFasUsu = false ;
               A5047BarFasFPl = A8497Renfasfpl ;
               n5047BarFasFPl = false ;
               A5046BarFasPrp = A8496Renfasprp ;
               n5046BarFasPrp = false ;
               A5045BarFasAgr = A8495Renfasagr ;
               n5045BarFasAgr = false ;
               A4974BarFasPPr = A8494RenfasPpr ;
               n4974BarFasPPr = false ;
               A4973BarFasKPr = A8493Renfaskpr ;
               n4973BarFasKPr = false ;
               A4443BarFasDTF = A8492Renfasdtf ;
               n4443BarFasDTF = false ;
               A4442BarFasDTI = A8491Renfasdti ;
               n4442BarFasDTI = false ;
               A4938BarFasInc = A8490Renfasinc ;
               n4938BarFasInc = false ;
               A8594BarHdrO = A8595RenHdrO ;
               n8594BarHdrO = false ;
               A8938BarfasPri2 = A8939Renfaspri2 ;
               n8938BarfasPri2 = false ;
               A6012BarFasTip = A6013RenFasTip ;
               n6012BarFasTip = false ;
               A9842BarObsF = A9856RenObsF ;
               n9842BarObsF = false ;
               A10032BarObsB = A10130RenObsB ;
               n10032BarObsB = false ;
               /* Using cursor P000K14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A152BarFasCon, Byte.valueOf(A153BarFasEst), A603MaqCodBis, A150BarFacTin, A162BarFecTeo, A160BarFecRea, A216BarTieTeo, A227BarUni, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), A215BarTieRea, A3298BarFecRIni, A179BarLoc, Boolean.valueOf(n3837BarFasKgm), A3837BarFasKgm, Boolean.valueOf(n3838BarFasMtr), A3838BarFasMtr, Integer.valueOf(A4022BarNumBot), A4287BarFasFor, A4301BarFasCoP, A4637BarFasCara, A4905BarFasAcab, Boolean.valueOf(n4938BarFasInc), Byte.valueOf(A4938BarFasInc), Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, Boolean.valueOf(n4973BarFasKPr), A4973BarFasKPr, Boolean.valueOf(n4974BarFasPPr), Short.valueOf(A4974BarFasPPr), Boolean.valueOf(n457FasCod), A457FasCod, Boolean.valueOf(n5045BarFasAgr), A5045BarFasAgr, Boolean.valueOf(n5046BarFasPrp), A5046BarFasPrp, Boolean.valueOf(n5047BarFasFPl), A5047BarFasFPl, Boolean.valueOf(n5048BarFasUsu), A5048BarFasUsu, Boolean.valueOf(n5369BarFasGral), A5369BarFasGral, Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), Boolean.valueOf(n5719BarFasKgT), A5719BarFasKgT, Boolean.valueOf(n5720BarFasMtT), A5720BarFasMtT, Boolean.valueOf(n5896BarMaqPlan), A5896BarMaqPlan, A5999BarFasCR, Boolean.valueOf(n6012BarFasTip), A6012BarFasTip, Boolean.valueOf(n6173BarFasSec), A6173BarFasSec, Boolean.valueOf(n6390BarfasMn), A6390BarfasMn, Boolean.valueOf(n6391BarfasOP), Short.valueOf(A6391BarfasOP), Boolean.valueOf(n6392BarHdMn), A6392BarHdMn, Short.valueOf(A6430BarTieAut), Byte.valueOf(A6555BarFasNPl), Boolean.valueOf(n7912Barfastpp), A7912Barfastpp, Boolean.valueOf(n7913BarfasUnpL), A7913BarfasUnpL, Boolean.valueOf(n7914BarfasRb), A7914BarfasRb, Boolean.valueOf(n7933Dtb_UOrd), Short.valueOf(A7933Dtb_UOrd), Boolean.valueOf(n8594BarHdrO), A8594BarHdrO, Boolean.valueOf(n8938BarfasPri2), Short.valueOf(A8938BarfasPri2), Boolean.valueOf(n9842BarObsF), A9842BarObsF, Boolean.valueOf(n10032BarObsB), A10032BarObsB});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
               /* End Insert */
               GXv_char5[0] = AV15EmprCod ;
               GXv_int2[0] = AV16BarCod ;
               GXv_int3[0] = AV17BarCodReo ;
               GXv_char4[0] = AV18BarCodPar ;
               GXv_char1[0] = A308CodPro ;
               GXv_int6[0] = A654OrdLin ;
               GXv_int7[0] = A4593RenOrdLin ;
               new app.pfas000(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_int3, GXv_char4, GXv_char1, GXv_int6, GXv_int7) ;
               prenfas.this.AV15EmprCod = GXv_char5[0] ;
               prenfas.this.AV16BarCod = GXv_int2[0] ;
               prenfas.this.AV17BarCodReo = GXv_int3[0] ;
               prenfas.this.AV18BarCodPar = GXv_char4[0] ;
               prenfas.this.A308CodPro = GXv_char1[0] ;
               prenfas.this.A654OrdLin = GXv_int6[0] ;
               prenfas.this.A4593RenOrdLin = GXv_int7[0] ;
               /* Using cursor P000K15 */
               pr_default.execute(13, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, A308CodPro, Boolean.valueOf(n4593RenOrdLin), Short.valueOf(A4593RenOrdLin)});
               while ( (pr_default.getStatus(13) != 101) )
               {
                  A758ProCod = P000K15_A758ProCod[0] ;
                  A194BarOrdLin = P000K15_A194BarOrdLin[0] ;
                  A130BarCodPar = P000K15_A130BarCodPar[0] ;
                  A132BarCodReo = P000K15_A132BarCodReo[0] ;
                  A129BarCod = P000K15_A129BarCod[0] ;
                  A396EmprCod = P000K15_A396EmprCod[0] ;
                  A14277FasQuiFabs = P000K15_A14277FasQuiFabs[0] ;
                  A12125FasQuiAI = P000K15_A12125FasQuiAI[0] ;
                  A12124FasQuiAs = P000K15_A12124FasQuiAs[0] ;
                  A11506FasQuiAv = P000K15_A11506FasQuiAv[0] ;
                  A9722FasQuiVel = P000K15_A9722FasQuiVel[0] ;
                  A6665FasQuiObs = P000K15_A6665FasQuiObs[0] ;
                  A6664FasQuiGrm = P000K15_A6664FasQuiGrm[0] ;
                  A6663FasQuiAnc = P000K15_A6663FasQuiAnc[0] ;
                  A6602FasStPl = P000K15_A6602FasStPl[0] ;
                  A6601FasOrdPl = P000K15_A6601FasOrdPl[0] ;
                  A6600FasFecPl = P000K15_A6600FasFecPl[0] ;
                  A6599FasMaqPl = P000K15_A6599FasMaqPl[0] ;
                  A5375FasQuiRb = P000K15_A5375FasQuiRb[0] ;
                  A5374FasQuiTp = P000K15_A5374FasQuiTp[0] ;
                  A5373FasQuiNp = P000K15_A5373FasQuiNp[0] ;
                  A764ProForCod = P000K15_A764ProForCod[0] ;
                  A5371FasQuiLin = P000K15_A5371FasQuiLin[0] ;
                  W396EmprCod = A396EmprCod ;
                  W129BarCod = A129BarCod ;
                  W132BarCodReo = A132BarCodReo ;
                  W130BarCodPar = A130BarCodPar ;
                  W758ProCod = A758ProCod ;
                  W194BarOrdLin = A194BarOrdLin ;
                  Gx_msg = httpContext.getMessage( "Read Fasqui. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar + " " + A308CodPro + " " + GXutil.str( A4593RenOrdLin, 4, 0) ;
                  System.out.println( Gx_msg );
                  /*
                     INSERT RECORD ON TABLE TXPFASQUI

                  */
                  W396EmprCod = A396EmprCod ;
                  W129BarCod = A129BarCod ;
                  W132BarCodReo = A132BarCodReo ;
                  W130BarCodPar = A130BarCodPar ;
                  W758ProCod = A758ProCod ;
                  W194BarOrdLin = A194BarOrdLin ;
                  W5371FasQuiLin = A5371FasQuiLin ;
                  W764ProForCod = A764ProForCod ;
                  W5373FasQuiNp = A5373FasQuiNp ;
                  W5374FasQuiTp = A5374FasQuiTp ;
                  W5375FasQuiRb = A5375FasQuiRb ;
                  W6599FasMaqPl = A6599FasMaqPl ;
                  W6600FasFecPl = A6600FasFecPl ;
                  W6601FasOrdPl = A6601FasOrdPl ;
                  W6602FasStPl = A6602FasStPl ;
                  W6665FasQuiObs = A6665FasQuiObs ;
                  W6664FasQuiGrm = A6664FasQuiGrm ;
                  W6663FasQuiAnc = A6663FasQuiAnc ;
                  W9722FasQuiVel = A9722FasQuiVel ;
                  W11506FasQuiAv = A11506FasQuiAv ;
                  W12124FasQuiAs = A12124FasQuiAs ;
                  W12125FasQuiAI = A12125FasQuiAI ;
                  A396EmprCod = AV15EmprCod ;
                  A129BarCod = AV16BarCod ;
                  A132BarCodReo = AV17BarCodReo ;
                  A130BarCodPar = AV18BarCodPar ;
                  A758ProCod = A308CodPro ;
                  A194BarOrdLin = A654OrdLin ;
                  Gx_msg = httpContext.getMessage( "New Fasqui. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar + " " + A308CodPro + httpContext.getMessage( " Orden New=", "") + GXutil.str( A654OrdLin, 4, 0) ;
                  System.out.println( Gx_msg );
                  /* Using cursor P000K16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin), A764ProForCod, Short.valueOf(A5373FasQuiNp), Short.valueOf(A5374FasQuiTp), Short.valueOf(A5375FasQuiRb), A6599FasMaqPl, A6600FasFecPl, Byte.valueOf(A6601FasOrdPl), Byte.valueOf(A6602FasStPl), Short.valueOf(A6663FasQuiAnc), Short.valueOf(A6664FasQuiGrm), A6665FasQuiObs, A9722FasQuiVel, A11506FasQuiAv, A12124FasQuiAs, A12125FasQuiAI, A14277FasQuiFabs});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
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
                  A129BarCod = W129BarCod ;
                  A132BarCodReo = W132BarCodReo ;
                  A130BarCodPar = W130BarCodPar ;
                  A758ProCod = W758ProCod ;
                  A194BarOrdLin = W194BarOrdLin ;
                  A5371FasQuiLin = W5371FasQuiLin ;
                  A764ProForCod = W764ProForCod ;
                  A5373FasQuiNp = W5373FasQuiNp ;
                  A5374FasQuiTp = W5374FasQuiTp ;
                  A5375FasQuiRb = W5375FasQuiRb ;
                  A6599FasMaqPl = W6599FasMaqPl ;
                  A6600FasFecPl = W6600FasFecPl ;
                  A6601FasOrdPl = W6601FasOrdPl ;
                  A6602FasStPl = W6602FasStPl ;
                  A6665FasQuiObs = W6665FasQuiObs ;
                  A6664FasQuiGrm = W6664FasQuiGrm ;
                  A6663FasQuiAnc = W6663FasQuiAnc ;
                  A9722FasQuiVel = W9722FasQuiVel ;
                  A11506FasQuiAv = W11506FasQuiAv ;
                  A12124FasQuiAs = W12124FasQuiAs ;
                  A12125FasQuiAI = W12125FasQuiAI ;
                  /* End Insert */
                  if ( ( GXutil.strcmp(A758ProCod, A308CodPro) == 0 ) && ( A194BarOrdLin == A654OrdLin ) )
                  {
                     Gx_msg = httpContext.getMessage( "No tengo que hacer nada", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar + " " + A308CodPro + " " + GXutil.str( A4593RenOrdLin, 4, 0) ;
                     System.out.println( Gx_msg );
                  }
                  else
                  {
                     AV110Inc_obs = httpContext.getMessage( "PRENFAS.Eliminacion FASQUI", "") + GXutil.newLine( ) ;
                     AV110Inc_obs += httpContext.getMessage( "Procod=", "") + GXutil.trim( A758ProCod) + GXutil.newLine( ) ;
                     AV110Inc_obs += httpContext.getMessage( "Orden =", "") + GXutil.str( A194BarOrdLin, 4, 0) + GXutil.newLine( ) ;
                     AV110Inc_obs += httpContext.getMessage( "Linea =", "") + GXutil.str( A5371FasQuiLin, 4, 0) + GXutil.newLine( ) ;
                     /* Using cursor P000K17 */
                     pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
                     Gx_msg = httpContext.getMessage( "delete Fasqui. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar + " " + A308CodPro + " " + GXutil.str( A4593RenOrdLin, 4, 0) ;
                     System.out.println( Gx_msg );
                  }
                  Gx_msg = httpContext.getMessage( "Fin Next Fasqui. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar + " " + A308CodPro + " " + GXutil.str( A4593RenOrdLin, 4, 0) ;
                  System.out.println( Gx_msg );
                  A396EmprCod = W396EmprCod ;
                  A129BarCod = W129BarCod ;
                  A132BarCodReo = W132BarCodReo ;
                  A130BarCodPar = W130BarCodPar ;
                  A758ProCod = W758ProCod ;
                  A194BarOrdLin = W194BarOrdLin ;
                  pr_default.readNext(13);
               }
               pr_default.close(13);
               /* Using cursor P000K18 */
               pr_default.execute(16, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, A308CodPro, Boolean.valueOf(n4593RenOrdLin), Short.valueOf(A4593RenOrdLin)});
               while ( (pr_default.getStatus(16) != 101) )
               {
                  A758ProCod = P000K18_A758ProCod[0] ;
                  A194BarOrdLin = P000K18_A194BarOrdLin[0] ;
                  A130BarCodPar = P000K18_A130BarCodPar[0] ;
                  A132BarCodReo = P000K18_A132BarCodReo[0] ;
                  A129BarCod = P000K18_A129BarCod[0] ;
                  A396EmprCod = P000K18_A396EmprCod[0] ;
                  A11628CCobs2 = P000K18_A11628CCobs2[0] ;
                  n11628CCobs2 = P000K18_n11628CCobs2[0] ;
                  A11474CCOkUsu = P000K18_A11474CCOkUsu[0] ;
                  A11473CCOkFch = P000K18_A11473CCOkFch[0] ;
                  A11472CCOk = P000K18_A11472CCOk[0] ;
                  A11293CcUltn = P000K18_A11293CcUltn[0] ;
                  n11293CcUltn = P000K18_n11293CcUltn[0] ;
                  A7691CCFchUti = P000K18_A7691CCFchUti[0] ;
                  n7691CCFchUti = P000K18_n7691CCFchUti[0] ;
                  A4405CcDisp = P000K18_A4405CcDisp[0] ;
                  n4405CcDisp = P000K18_n4405CcDisp[0] ;
                  A3281CcObs = P000K18_A3281CcObs[0] ;
                  n3281CcObs = P000K18_n3281CcObs[0] ;
                  A4033CCFch = P000K18_A4033CCFch[0] ;
                  n4033CCFch = P000K18_n4033CCFch[0] ;
                  A4032CCOpeCod = P000K18_A4032CCOpeCod[0] ;
                  n4032CCOpeCod = P000K18_n4032CCOpeCod[0] ;
                  A4031CCTCod = P000K18_A4031CCTCod[0] ;
                  W396EmprCod = A396EmprCod ;
                  W129BarCod = A129BarCod ;
                  W132BarCodReo = A132BarCodReo ;
                  W130BarCodPar = A130BarCodPar ;
                  W758ProCod = A758ProCod ;
                  W194BarOrdLin = A194BarOrdLin ;
                  Gx_msg = httpContext.getMessage( "New CC. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
                  System.out.println( Gx_msg );
                  /*
                     INSERT RECORD ON TABLE TXPCC

                  */
                  W396EmprCod = A396EmprCod ;
                  W129BarCod = A129BarCod ;
                  W132BarCodReo = A132BarCodReo ;
                  W130BarCodPar = A130BarCodPar ;
                  W758ProCod = A758ProCod ;
                  W194BarOrdLin = A194BarOrdLin ;
                  W4031CCTCod = A4031CCTCod ;
                  A396EmprCod = AV15EmprCod ;
                  A129BarCod = AV16BarCod ;
                  A132BarCodReo = AV17BarCodReo ;
                  A130BarCodPar = AV18BarCodPar ;
                  A758ProCod = A308CodPro ;
                  A194BarOrdLin = A654OrdLin ;
                  /* Using cursor P000K19 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Boolean.valueOf(n4032CCOpeCod), Integer.valueOf(A4032CCOpeCod), Boolean.valueOf(n4033CCFch), A4033CCFch, Boolean.valueOf(n3281CcObs), A3281CcObs, Boolean.valueOf(n4405CcDisp), A4405CcDisp, Boolean.valueOf(n7691CCFchUti), A7691CCFchUti, Boolean.valueOf(n11293CcUltn), Short.valueOf(A11293CcUltn), Byte.valueOf(A11472CCOk), A11473CCOkFch, A11474CCOkUsu, Boolean.valueOf(n11628CCobs2), A11628CCobs2});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
                  if ( (pr_default.getStatus(17) == 1) )
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
                  A4031CCTCod = W4031CCTCod ;
                  /* End Insert */
                  /* Using cursor P000K20 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  while ( (pr_default.getStatus(18) != 101) )
                  {
                     A11294CcLn = P000K20_A11294CcLn[0] ;
                     W396EmprCod = A396EmprCod ;
                     W129BarCod = A129BarCod ;
                     W132BarCodReo = A132BarCodReo ;
                     W130BarCodPar = A130BarCodPar ;
                     W758ProCod = A758ProCod ;
                     W194BarOrdLin = A194BarOrdLin ;
                     W4031CCTCod = A4031CCTCod ;
                     Gx_msg = httpContext.getMessage( "New CCn. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
                     System.out.println( Gx_msg );
                     /*
                        INSERT RECORD ON TABLE TXPCCn

                     */
                     W396EmprCod = A396EmprCod ;
                     W129BarCod = A129BarCod ;
                     W132BarCodReo = A132BarCodReo ;
                     W130BarCodPar = A130BarCodPar ;
                     W758ProCod = A758ProCod ;
                     W194BarOrdLin = A194BarOrdLin ;
                     W4031CCTCod = A4031CCTCod ;
                     W11294CcLn = A11294CcLn ;
                     A396EmprCod = AV15EmprCod ;
                     A129BarCod = AV16BarCod ;
                     A132BarCodReo = AV17BarCodReo ;
                     A130BarCodPar = AV18BarCodPar ;
                     A758ProCod = A308CodPro ;
                     A194BarOrdLin = A654OrdLin ;
                     /* Using cursor P000K21 */
                     pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCn");
                     if ( (pr_default.getStatus(19) == 1) )
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
                     A4031CCTCod = W4031CCTCod ;
                     A11294CcLn = W11294CcLn ;
                     /* End Insert */
                     Gx_msg = httpContext.getMessage( "New CCnT. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
                     System.out.println( Gx_msg );
                     /* Using cursor P000K22 */
                     pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
                     while ( (pr_default.getStatus(20) != 101) )
                     {
                        A11298CcLnOp = P000K22_A11298CcLnOp[0] ;
                        n11298CcLnOp = P000K22_n11298CcLnOp[0] ;
                        A11297CcLnFc = P000K22_A11297CcLnFc[0] ;
                        n11297CcLnFc = P000K22_n11297CcLnFc[0] ;
                        A11296CcLnV = P000K22_A11296CcLnV[0] ;
                        n11296CcLnV = P000K22_n11296CcLnV[0] ;
                        A11295CcLnT = P000K22_A11295CcLnT[0] ;
                        W396EmprCod = A396EmprCod ;
                        W129BarCod = A129BarCod ;
                        W132BarCodReo = A132BarCodReo ;
                        W130BarCodPar = A130BarCodPar ;
                        W758ProCod = A758ProCod ;
                        W194BarOrdLin = A194BarOrdLin ;
                        W4031CCTCod = A4031CCTCod ;
                        W11294CcLn = A11294CcLn ;
                        /*
                           INSERT RECORD ON TABLE TXPCCnT

                        */
                        W396EmprCod = A396EmprCod ;
                        W129BarCod = A129BarCod ;
                        W132BarCodReo = A132BarCodReo ;
                        W130BarCodPar = A130BarCodPar ;
                        W758ProCod = A758ProCod ;
                        W194BarOrdLin = A194BarOrdLin ;
                        W4031CCTCod = A4031CCTCod ;
                        W11294CcLn = A11294CcLn ;
                        W11295CcLnT = A11295CcLnT ;
                        A396EmprCod = AV15EmprCod ;
                        A129BarCod = AV16BarCod ;
                        A132BarCodReo = AV17BarCodReo ;
                        A130BarCodPar = AV18BarCodPar ;
                        A758ProCod = A308CodPro ;
                        A194BarOrdLin = A654OrdLin ;
                        /* Using cursor P000K23 */
                        pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT), Boolean.valueOf(n11296CcLnV), A11296CcLnV, Boolean.valueOf(n11297CcLnFc), A11297CcLnFc, Boolean.valueOf(n11298CcLnOp), Integer.valueOf(A11298CcLnOp)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCnT");
                        if ( (pr_default.getStatus(21) == 1) )
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
                        A4031CCTCod = W4031CCTCod ;
                        A11294CcLn = W11294CcLn ;
                        A11295CcLnT = W11295CcLnT ;
                        /* End Insert */
                        /* Using cursor P000K24 */
                        pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn), Short.valueOf(A11295CcLnT)});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCnT");
                        A396EmprCod = W396EmprCod ;
                        A129BarCod = W129BarCod ;
                        A132BarCodReo = W132BarCodReo ;
                        A130BarCodPar = W130BarCodPar ;
                        A758ProCod = W758ProCod ;
                        A194BarOrdLin = W194BarOrdLin ;
                        A4031CCTCod = W4031CCTCod ;
                        A11294CcLn = W11294CcLn ;
                        pr_default.readNext(20);
                     }
                     pr_default.close(20);
                     /* Using cursor P000K25 */
                     pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A11294CcLn)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCn");
                     A396EmprCod = W396EmprCod ;
                     A129BarCod = W129BarCod ;
                     A132BarCodReo = W132BarCodReo ;
                     A130BarCodPar = W130BarCodPar ;
                     A758ProCod = W758ProCod ;
                     A194BarOrdLin = W194BarOrdLin ;
                     A4031CCTCod = W4031CCTCod ;
                     pr_default.readNext(18);
                  }
                  pr_default.close(18);
                  Gx_msg = httpContext.getMessage( "New CC1. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
                  System.out.println( Gx_msg );
                  /* Using cursor P000K26 */
                  pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  while ( (pr_default.getStatus(24) != 101) )
                  {
                     A14489CCEspecif2 = P000K26_A14489CCEspecif2[0] ;
                     A13252CCEspecif = P000K26_A13252CCEspecif[0] ;
                     A13251CCMetodo = P000K26_A13251CCMetodo[0] ;
                     A12751CCOkDsc = P000K26_A12751CCOkDsc[0] ;
                     A12750CCOkLin = P000K26_A12750CCOkLin[0] ;
                     A4035CCVal = P000K26_A4035CCVal[0] ;
                     A4034CCTLin = P000K26_A4034CCTLin[0] ;
                     W396EmprCod = A396EmprCod ;
                     W129BarCod = A129BarCod ;
                     W132BarCodReo = A132BarCodReo ;
                     W130BarCodPar = A130BarCodPar ;
                     W758ProCod = A758ProCod ;
                     W194BarOrdLin = A194BarOrdLin ;
                     W4031CCTCod = A4031CCTCod ;
                     /*
                        INSERT RECORD ON TABLE TXPCC1

                     */
                     W396EmprCod = A396EmprCod ;
                     W129BarCod = A129BarCod ;
                     W132BarCodReo = A132BarCodReo ;
                     W130BarCodPar = A130BarCodPar ;
                     W758ProCod = A758ProCod ;
                     W194BarOrdLin = A194BarOrdLin ;
                     W4031CCTCod = A4031CCTCod ;
                     W4034CCTLin = A4034CCTLin ;
                     A396EmprCod = AV15EmprCod ;
                     A129BarCod = AV16BarCod ;
                     A132BarCodReo = AV17BarCodReo ;
                     A130BarCodPar = AV18BarCodPar ;
                     A758ProCod = A308CodPro ;
                     A194BarOrdLin = A654OrdLin ;
                     /* Using cursor P000K27 */
                     pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), A4035CCVal, Byte.valueOf(A12750CCOkLin), A12751CCOkDsc, A13251CCMetodo, A13252CCEspecif, A14489CCEspecif2});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
                     if ( (pr_default.getStatus(25) == 1) )
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
                     A4031CCTCod = W4031CCTCod ;
                     A4034CCTLin = W4034CCTLin ;
                     /* End Insert */
                     /* Using cursor P000K28 */
                     pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC1");
                     A396EmprCod = W396EmprCod ;
                     A129BarCod = W129BarCod ;
                     A132BarCodReo = W132BarCodReo ;
                     A130BarCodPar = W130BarCodPar ;
                     A758ProCod = W758ProCod ;
                     A194BarOrdLin = W194BarOrdLin ;
                     A4031CCTCod = W4031CCTCod ;
                     pr_default.readNext(24);
                  }
                  pr_default.close(24);
                  /* Using cursor P000K29 */
                  pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCC");
                  A396EmprCod = W396EmprCod ;
                  A129BarCod = W129BarCod ;
                  A132BarCodReo = W132BarCodReo ;
                  A130BarCodPar = W130BarCodPar ;
                  A758ProCod = W758ProCod ;
                  A194BarOrdLin = W194BarOrdLin ;
                  pr_default.readNext(16);
               }
               pr_default.close(16);
               /* Using cursor P000K30 */
               pr_default.execute(28, new Object[] {A1654RenTerCod, A308CodPro, Short.valueOf(A654OrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRENFAS");
               pr_default.readNext(11);
            }
            pr_default.close(11);
            Gx_msg = httpContext.getMessage( "Go Precfas. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
            System.out.println( Gx_msg );
            GXv_char5[0] = AV15EmprCod ;
            GXv_int2[0] = AV16BarCod ;
            GXv_int3[0] = AV17BarCodReo ;
            GXv_char4[0] = AV18BarCodPar ;
            new app.precfas(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_int3, GXv_char4) ;
            prenfas.this.AV15EmprCod = GXv_char5[0] ;
            prenfas.this.AV16BarCod = GXv_int2[0] ;
            prenfas.this.AV17BarCodReo = GXv_int3[0] ;
            prenfas.this.AV18BarCodPar = GXv_char4[0] ;
            Gx_msg = httpContext.getMessage( "Ret Precfas. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
            System.out.println( Gx_msg );
            Gx_msg = httpContext.getMessage( "Fin Prenfas. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
            System.out.println( Gx_msg );
         }
      }
      else
      {
         Gx_msg = httpContext.getMessage( "Go Prenfas3. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
         System.out.println( Gx_msg );
         GXv_char5[0] = AV15EmprCod ;
         GXv_int2[0] = AV16BarCod ;
         GXv_int3[0] = AV17BarCodReo ;
         GXv_char4[0] = AV18BarCodPar ;
         GXv_char1[0] = AV39ExisParFas ;
         GXv_int8[0] = AV67FasMin ;
         GXv_char9[0] = AV112Usurcod ;
         GXv_char10[0] = AV114Station ;
         new app.prenfas3(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_int3, GXv_char4, GXv_char1, GXv_int8, GXv_char9, GXv_char10) ;
         prenfas.this.AV15EmprCod = GXv_char5[0] ;
         prenfas.this.AV16BarCod = GXv_int2[0] ;
         prenfas.this.AV17BarCodReo = GXv_int3[0] ;
         prenfas.this.AV18BarCodPar = GXv_char4[0] ;
         prenfas.this.AV39ExisParFas = GXv_char1[0] ;
         prenfas.this.AV67FasMin = GXv_int8[0] ;
         prenfas.this.AV112Usurcod = GXv_char9[0] ;
         prenfas.this.AV114Station = GXv_char10[0] ;
         Gx_msg = httpContext.getMessage( "Ret Prenfas3. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
         System.out.println( Gx_msg );
      }
      Gx_msg = httpContext.getMessage( "Go Prenfas4. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
      System.out.println( Gx_msg );
      GXv_char10[0] = AV15EmprCod ;
      GXv_int2[0] = AV16BarCod ;
      GXv_int8[0] = AV17BarCodReo ;
      GXv_char9[0] = AV18BarCodPar ;
      GXv_char5[0] = AV39ExisParFas ;
      GXv_int3[0] = AV67FasMin ;
      GXv_char4[0] = AV39ExisParFas ;
      new app.prenfas4(remoteHandle, context).execute( GXv_char10, GXv_int2, GXv_int8, GXv_char9, GXv_char5, GXv_int3, GXv_char4) ;
      prenfas.this.AV15EmprCod = GXv_char10[0] ;
      prenfas.this.AV16BarCod = GXv_int2[0] ;
      prenfas.this.AV17BarCodReo = GXv_int8[0] ;
      prenfas.this.AV18BarCodPar = GXv_char9[0] ;
      prenfas.this.AV39ExisParFas = GXv_char5[0] ;
      prenfas.this.AV67FasMin = GXv_int3[0] ;
      prenfas.this.AV39ExisParFas = GXv_char4[0] ;
      Gx_msg = httpContext.getMessage( "Ret Prenfas4. ", "") + httpContext.getMessage( "Hdr= ", "") + GXutil.str( AV16BarCod, 8, 0) + GXutil.str( AV17BarCodReo, 1, 0) + AV18BarCodPar ;
      System.out.println( Gx_msg );
      cleanup();
   }

   public void S111( )
   {
      /* 'INICIO' Routine */
      returnInSub = false ;
      GXt_char11 = AV114Station ;
      GXv_char10[0] = GXt_char11 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char10) ;
      prenfas.this.GXt_char11 = GXv_char10[0] ;
      AV114Station = GXt_char11 ;
      GXt_char11 = AV37Termcod ;
      GXv_char10[0] = GXt_char11 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char10) ;
      prenfas.this.GXt_char11 = GXv_char10[0] ;
      AV37Termcod = GXt_char11 ;
      GXv_char10[0] = AV15EmprCod ;
      GXv_char9[0] = AV111Emprnom ;
      GXv_char5[0] = AV112Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV114Station, GXv_char10, GXv_char9, GXv_char5) ;
      prenfas.this.AV15EmprCod = GXv_char10[0] ;
      prenfas.this.AV111Emprnom = GXv_char9[0] ;
      prenfas.this.AV112Usurcod = GXv_char5[0] ;
      GXt_int12 = AV67FasMin ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FASMIN", ""), GXv_int8) ;
      prenfas.this.GXt_int12 = GXv_int8[0] ;
      AV67FasMin = GXt_int12 ;
      GXt_int12 = AV68Carvema ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int8) ;
      prenfas.this.GXt_int12 = GXv_int8[0] ;
      AV68Carvema = GXt_int12 ;
      GXt_int12 = AV122NoRenumero ;
      GXv_int8[0] = GXt_int12 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "NORENF", ""), GXv_int8) ;
      prenfas.this.GXt_int12 = GXv_int8[0] ;
      AV122NoRenumero = GXt_int12 ;
      System.out.println( httpContext.getMessage( "Procesando...", "") );
      AV36Contador = (byte)(0) ;
      if ( GXutil.strcmp(AV20Modo, httpContext.getMessage( "DEL", "")) == 0 )
      {
         GXv_char10[0] = AV15EmprCod ;
         GXv_int2[0] = AV16BarCod ;
         GXv_int8[0] = AV17BarCodReo ;
         GXv_char9[0] = AV18BarCodPar ;
         GXv_char5[0] = AV19ProCod ;
         GXv_char4[0] = AV20Modo ;
         new app.prenfas1(remoteHandle, context).execute( GXv_char10, GXv_int2, GXv_int8, GXv_char9, GXv_char5, GXv_char4) ;
         prenfas.this.AV15EmprCod = GXv_char10[0] ;
         prenfas.this.AV16BarCod = GXv_int2[0] ;
         prenfas.this.AV17BarCodReo = GXv_int8[0] ;
         prenfas.this.AV18BarCodPar = GXv_char9[0] ;
         prenfas.this.AV19ProCod = GXv_char5[0] ;
         prenfas.this.AV20Modo = GXv_char4[0] ;
      }
      GXv_char10[0] = AV15EmprCod ;
      GXv_int2[0] = AV16BarCod ;
      GXv_int8[0] = AV17BarCodReo ;
      GXv_char9[0] = AV18BarCodPar ;
      GXv_char5[0] = AV19ProCod ;
      GXv_int3[0] = AV36Contador ;
      GXv_char4[0] = AV39ExisParFas ;
      GXv_char1[0] = AV113Fasqui ;
      new app.prenfas2(remoteHandle, context).execute( GXv_char10, GXv_int2, GXv_int8, GXv_char9, GXv_char5, GXv_int3, GXv_char4, GXv_char1) ;
      prenfas.this.AV15EmprCod = GXv_char10[0] ;
      prenfas.this.AV16BarCod = GXv_int2[0] ;
      prenfas.this.AV17BarCodReo = GXv_int8[0] ;
      prenfas.this.AV18BarCodPar = GXv_char9[0] ;
      prenfas.this.AV19ProCod = GXv_char5[0] ;
      prenfas.this.AV36Contador = GXv_int3[0] ;
      prenfas.this.AV39ExisParFas = GXv_char4[0] ;
      prenfas.this.AV113Fasqui = GXv_char1[0] ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = prenfas.this.AV15EmprCod;
      this.aP1[0] = prenfas.this.AV16BarCod;
      this.aP2[0] = prenfas.this.AV17BarCodReo;
      this.aP3[0] = prenfas.this.AV18BarCodPar;
      this.aP4[0] = prenfas.this.AV19ProCod;
      this.aP5[0] = prenfas.this.AV20Modo;
      Application.commitDataStores(context, remoteHandle, pr_default, "prenfas");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P000K2_A396EmprCod = new String[] {""} ;
      P000K2_A129BarCod = new int[1] ;
      P000K2_A132BarCodReo = new byte[1] ;
      P000K2_A130BarCodPar = new String[] {""} ;
      P000K2_A758ProCod = new String[] {""} ;
      P000K2_A761ProFasLin = new short[1] ;
      P000K2_n761ProFasLin = new boolean[] {false} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      AV69Procodi = "" ;
      P000K3_A396EmprCod = new String[] {""} ;
      P000K3_A129BarCod = new int[1] ;
      P000K3_A132BarCodReo = new byte[1] ;
      P000K3_A130BarCodPar = new String[] {""} ;
      P000K3_A758ProCod = new String[] {""} ;
      P000K3_A194BarOrdLin = new short[1] ;
      P000K3_A457FasCod = new String[] {""} ;
      P000K3_n457FasCod = new boolean[] {false} ;
      P000K3_A153BarFasEst = new byte[1] ;
      P000K3_A162BarFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      P000K3_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P000K3_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K3_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K3_A179BarLoc = new String[] {""} ;
      P000K3_A165BarHorIni = new short[1] ;
      P000K3_A164BarHorFin = new short[1] ;
      P000K3_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K3_A603MaqCodBis = new String[] {""} ;
      P000K3_A152BarFasCon = new String[] {""} ;
      P000K3_A150BarFacTin = new String[] {""} ;
      P000K3_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P000K3_A4287BarFasFor = new String[] {""} ;
      P000K3_A4637BarFasCara = new String[] {""} ;
      P000K3_A4022BarNumBot = new int[1] ;
      P000K3_A5369BarFasGral = new String[] {""} ;
      P000K3_n5369BarFasGral = new boolean[] {false} ;
      P000K3_A4301BarFasCoP = new String[] {""} ;
      P000K3_A5896BarMaqPlan = new String[] {""} ;
      P000K3_n5896BarMaqPlan = new boolean[] {false} ;
      P000K3_A4905BarFasAcab = new String[] {""} ;
      P000K3_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K3_n3837BarFasKgm = new boolean[] {false} ;
      P000K3_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K3_n3838BarFasMtr = new boolean[] {false} ;
      P000K3_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K3_n5719BarFasKgT = new boolean[] {false} ;
      P000K3_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K3_n5720BarFasMtT = new boolean[] {false} ;
      P000K3_A6390BarfasMn = new String[] {""} ;
      P000K3_n6390BarfasMn = new boolean[] {false} ;
      P000K3_A6391BarfasOP = new short[1] ;
      P000K3_n6391BarfasOP = new boolean[] {false} ;
      P000K3_A6392BarHdMn = new String[] {""} ;
      P000K3_n6392BarHdMn = new boolean[] {false} ;
      P000K3_A6173BarFasSec = new String[] {""} ;
      P000K3_n6173BarFasSec = new boolean[] {false} ;
      P000K3_A7914BarfasRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K3_n7914BarfasRb = new boolean[] {false} ;
      P000K3_A7933Dtb_UOrd = new short[1] ;
      P000K3_n7933Dtb_UOrd = new boolean[] {false} ;
      P000K3_A7913BarfasUnpL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K3_n7913BarfasUnpL = new boolean[] {false} ;
      P000K3_A7912Barfastpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K3_n7912Barfastpp = new boolean[] {false} ;
      P000K3_A6555BarFasNPl = new byte[1] ;
      P000K3_A6430BarTieAut = new short[1] ;
      P000K3_A5999BarFasCR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K3_A5372FasQuiUl = new short[1] ;
      P000K3_n5372FasQuiUl = new boolean[] {false} ;
      P000K3_A5048BarFasUsu = new String[] {""} ;
      P000K3_n5048BarFasUsu = new boolean[] {false} ;
      P000K3_A5047BarFasFPl = new java.util.Date[] {GXutil.nullDate()} ;
      P000K3_n5047BarFasFPl = new boolean[] {false} ;
      P000K3_A5046BarFasPrp = new String[] {""} ;
      P000K3_n5046BarFasPrp = new boolean[] {false} ;
      P000K3_A5045BarFasAgr = new String[] {""} ;
      P000K3_n5045BarFasAgr = new boolean[] {false} ;
      P000K3_A4974BarFasPPr = new short[1] ;
      P000K3_n4974BarFasPPr = new boolean[] {false} ;
      P000K3_A4973BarFasKPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K3_n4973BarFasKPr = new boolean[] {false} ;
      P000K3_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P000K3_n4443BarFasDTF = new boolean[] {false} ;
      P000K3_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P000K3_n4442BarFasDTI = new boolean[] {false} ;
      P000K3_A4938BarFasInc = new byte[1] ;
      P000K3_n4938BarFasInc = new boolean[] {false} ;
      P000K3_A8594BarHdrO = new String[] {""} ;
      P000K3_n8594BarHdrO = new boolean[] {false} ;
      P000K3_A8938BarfasPri2 = new short[1] ;
      P000K3_n8938BarfasPri2 = new boolean[] {false} ;
      P000K3_A9842BarObsF = new String[] {""} ;
      P000K3_n9842BarObsF = new boolean[] {false} ;
      P000K3_A6012BarFasTip = new String[] {""} ;
      P000K3_n6012BarFasTip = new boolean[] {false} ;
      P000K3_A10032BarObsB = new String[] {""} ;
      P000K3_n10032BarObsB = new boolean[] {false} ;
      A457FasCod = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      A160BarFecRea = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A227BarUni = DecimalUtil.ZERO ;
      A179BarLoc = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A603MaqCodBis = "" ;
      A152BarFasCon = "" ;
      A150BarFacTin = "" ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A4287BarFasFor = "" ;
      A4637BarFasCara = "" ;
      A5369BarFasGral = "" ;
      A4301BarFasCoP = "" ;
      A5896BarMaqPlan = "" ;
      A4905BarFasAcab = "" ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A6390BarfasMn = "" ;
      A6392BarHdMn = "" ;
      A6173BarFasSec = "" ;
      A7914BarfasRb = DecimalUtil.ZERO ;
      A7913BarfasUnpL = DecimalUtil.ZERO ;
      A7912Barfastpp = DecimalUtil.ZERO ;
      A5999BarFasCR = DecimalUtil.ZERO ;
      A5048BarFasUsu = "" ;
      A5047BarFasFPl = GXutil.nullDate() ;
      A5046BarFasPrp = "" ;
      A5045BarFasAgr = "" ;
      A4973BarFasKPr = DecimalUtil.ZERO ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A8594BarHdrO = "" ;
      A9842BarObsF = "" ;
      A6012BarFasTip = "" ;
      A10032BarObsB = "" ;
      AV22FasCod = "" ;
      AV24BarFecTeo = GXutil.nullDate() ;
      AV25BarFecRea = GXutil.nullDate() ;
      AV26BarTieTeo = DecimalUtil.ZERO ;
      AV27BarUni = DecimalUtil.ZERO ;
      AV28BarLoc = "" ;
      AV31BarTieRea = DecimalUtil.ZERO ;
      AV32MaqCodBis = "" ;
      AV33BarFasCon = "" ;
      AV34BarFacTin = "" ;
      AV38BarFecRIni = GXutil.nullDate() ;
      AV40BarFasFor = "" ;
      AV42BarFasCara = "" ;
      AV44BarFasGral = "" ;
      AV46BarFasCop = "" ;
      AV47BarMaqPlan = "" ;
      AV48BarFasAcab = "" ;
      AV49BARFASKGM = DecimalUtil.ZERO ;
      AV50BARFASMTR = DecimalUtil.ZERO ;
      AV51BARFASKGT = DecimalUtil.ZERO ;
      AV52BARFASMTT = DecimalUtil.ZERO ;
      AV53BarfasMn = "" ;
      AV55BarHdmn = "" ;
      AV70BarFasSec = "" ;
      AV71Barfasrb = DecimalUtil.ZERO ;
      AV88BarfasUnpL = DecimalUtil.ZERO ;
      AV89Barfastpp = DecimalUtil.ZERO ;
      AV92barfascr = DecimalUtil.ZERO ;
      AV94barfasusu = "" ;
      AV95barfasfpl = GXutil.nullDate() ;
      AV96barfasprp = "" ;
      AV97barfasagr = "" ;
      AV99barfaskpr = DecimalUtil.ZERO ;
      AV100barfasdtf = GXutil.resetTime( GXutil.nullDate() );
      AV101barfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV104BarHdrO = "" ;
      AV109Barobsf = "" ;
      AV108Barfastip = "" ;
      AV120BarObsb = "" ;
      W457FasCod = "" ;
      A1654RenTerCod = "" ;
      AV37Termcod = "" ;
      A308CodPro = "" ;
      A822RenMaqCod = "" ;
      A818RenFecTeo = GXutil.nullDate() ;
      A817RenFecRea = GXutil.nullDate() ;
      A824RenTieTeo = DecimalUtil.ZERO ;
      A825RenUni = DecimalUtil.ZERO ;
      A821RenLoc = "" ;
      A823RenTieRea = DecimalUtil.ZERO ;
      A815RenFasCon = "" ;
      A814RenFacTin = "" ;
      A3297RenFecRIni = GXutil.nullDate() ;
      A4739RenFasFor = "" ;
      A4904RenFasAcab = "" ;
      A4743RenFasCara = "" ;
      A5370RenFasGral = "" ;
      A4741RenFasCop = "" ;
      A5897RenMaqPlan = "" ;
      A4735RenFasKgm = DecimalUtil.ZERO ;
      A4736RenFasMtr = DecimalUtil.ZERO ;
      A5992RenFasKgT = DecimalUtil.ZERO ;
      A5993RenFasMtT = DecimalUtil.ZERO ;
      A6393RenFasMn = "" ;
      A6395RenHdMn = "" ;
      A6172RenFasSec = "" ;
      A8472RenfasRb = DecimalUtil.ZERO ;
      A8504Renfasunpl = DecimalUtil.ZERO ;
      A8503Renfastpp = DecimalUtil.ZERO ;
      A8500Renfascr = DecimalUtil.ZERO ;
      A8498Renfasusu = "" ;
      A8497Renfasfpl = GXutil.nullDate() ;
      A8496Renfasprp = "" ;
      A8495Renfasagr = "" ;
      A8493Renfaskpr = DecimalUtil.ZERO ;
      A8492Renfasdtf = GXutil.resetTime( GXutil.nullDate() );
      A8491Renfasdti = GXutil.resetTime( GXutil.nullDate() );
      A8595RenHdrO = "" ;
      A6013RenFasTip = "" ;
      A9856RenObsF = "" ;
      A10130RenObsB = "" ;
      Gx_emsg = "" ;
      P000K7_A194BarOrdLin = new short[1] ;
      P000K7_A130BarCodPar = new String[] {""} ;
      P000K7_A132BarCodReo = new byte[1] ;
      P000K7_A129BarCod = new int[1] ;
      P000K7_A396EmprCod = new String[] {""} ;
      P000K7_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P000K7_A602MaqCod = new String[] {""} ;
      P000K7_A561HisProLin = new int[1] ;
      A558HisProFec = GXutil.nullDate() ;
      A602MaqCod = "" ;
      P000K8_A4593RenOrdLin = new short[1] ;
      P000K8_n4593RenOrdLin = new boolean[] {false} ;
      P000K8_A1654RenTerCod = new String[] {""} ;
      P000K8_A654OrdLin = new short[1] ;
      P000K8_A308CodPro = new String[] {""} ;
      P000K10_A4268RecOrdLin = new short[1] ;
      P000K10_n4268RecOrdLin = new boolean[] {false} ;
      P000K10_A6039RecAcab = new String[] {""} ;
      P000K10_n6039RecAcab = new boolean[] {false} ;
      P000K10_A130BarCodPar = new String[] {""} ;
      P000K10_A132BarCodReo = new byte[1] ;
      P000K10_A129BarCod = new int[1] ;
      P000K10_A396EmprCod = new String[] {""} ;
      P000K10_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      P000K11_A4593RenOrdLin = new short[1] ;
      P000K11_n4593RenOrdLin = new boolean[] {false} ;
      P000K11_A1654RenTerCod = new String[] {""} ;
      P000K11_A654OrdLin = new short[1] ;
      P000K11_A308CodPro = new String[] {""} ;
      P000K13_A4593RenOrdLin = new short[1] ;
      P000K13_n4593RenOrdLin = new boolean[] {false} ;
      P000K13_A308CodPro = new String[] {""} ;
      P000K13_A654OrdLin = new short[1] ;
      P000K13_A816RenFasEst = new byte[1] ;
      P000K13_n816RenFasEst = new boolean[] {false} ;
      P000K13_A818RenFecTeo = new java.util.Date[] {GXutil.nullDate()} ;
      P000K13_n818RenFecTeo = new boolean[] {false} ;
      P000K13_A817RenFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P000K13_n817RenFecRea = new boolean[] {false} ;
      P000K13_A824RenTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K13_n824RenTieTeo = new boolean[] {false} ;
      P000K13_A825RenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K13_n825RenUni = new boolean[] {false} ;
      P000K13_A821RenLoc = new String[] {""} ;
      P000K13_n821RenLoc = new boolean[] {false} ;
      P000K13_A820RenHorIni = new short[1] ;
      P000K13_n820RenHorIni = new boolean[] {false} ;
      P000K13_A819RenHorFin = new short[1] ;
      P000K13_n819RenHorFin = new boolean[] {false} ;
      P000K13_A823RenTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K13_n823RenTieRea = new boolean[] {false} ;
      P000K13_A822RenMaqCod = new String[] {""} ;
      P000K13_n822RenMaqCod = new boolean[] {false} ;
      P000K13_A815RenFasCon = new String[] {""} ;
      P000K13_n815RenFasCon = new boolean[] {false} ;
      P000K13_A814RenFacTin = new String[] {""} ;
      P000K13_n814RenFacTin = new boolean[] {false} ;
      P000K13_A3297RenFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P000K13_n3297RenFecRIni = new boolean[] {false} ;
      P000K13_A4739RenFasFor = new String[] {""} ;
      P000K13_n4739RenFasFor = new boolean[] {false} ;
      P000K13_A4904RenFasAcab = new String[] {""} ;
      P000K13_n4904RenFasAcab = new boolean[] {false} ;
      P000K13_A4743RenFasCara = new String[] {""} ;
      P000K13_n4743RenFasCara = new boolean[] {false} ;
      P000K13_A4738RenNumBot = new int[1] ;
      P000K13_n4738RenNumBot = new boolean[] {false} ;
      P000K13_A5370RenFasGral = new String[] {""} ;
      P000K13_n5370RenFasGral = new boolean[] {false} ;
      P000K13_A4741RenFasCop = new String[] {""} ;
      P000K13_n4741RenFasCop = new boolean[] {false} ;
      P000K13_A5897RenMaqPlan = new String[] {""} ;
      P000K13_n5897RenMaqPlan = new boolean[] {false} ;
      P000K13_A4735RenFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K13_n4735RenFasKgm = new boolean[] {false} ;
      P000K13_A4736RenFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K13_n4736RenFasMtr = new boolean[] {false} ;
      P000K13_A5992RenFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K13_n5992RenFasKgT = new boolean[] {false} ;
      P000K13_A5993RenFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K13_n5993RenFasMtT = new boolean[] {false} ;
      P000K13_A6394RenfasOP = new short[1] ;
      P000K13_n6394RenfasOP = new boolean[] {false} ;
      P000K13_A6393RenFasMn = new String[] {""} ;
      P000K13_n6393RenFasMn = new boolean[] {false} ;
      P000K13_A6395RenHdMn = new String[] {""} ;
      P000K13_n6395RenHdMn = new boolean[] {false} ;
      P000K13_A6172RenFasSec = new String[] {""} ;
      P000K13_n6172RenFasSec = new boolean[] {false} ;
      P000K13_A8472RenfasRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K13_n8472RenfasRb = new boolean[] {false} ;
      P000K13_A8505Renuord = new short[1] ;
      P000K13_n8505Renuord = new boolean[] {false} ;
      P000K13_A8504Renfasunpl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K13_n8504Renfasunpl = new boolean[] {false} ;
      P000K13_A8503Renfastpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K13_n8503Renfastpp = new boolean[] {false} ;
      P000K13_A8502Renfasnpl = new byte[1] ;
      P000K13_n8502Renfasnpl = new boolean[] {false} ;
      P000K13_A8501Rentieaut = new short[1] ;
      P000K13_n8501Rentieaut = new boolean[] {false} ;
      P000K13_A8500Renfascr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K13_n8500Renfascr = new boolean[] {false} ;
      P000K13_A8499Renquiul = new short[1] ;
      P000K13_n8499Renquiul = new boolean[] {false} ;
      P000K13_A8498Renfasusu = new String[] {""} ;
      P000K13_n8498Renfasusu = new boolean[] {false} ;
      P000K13_A8497Renfasfpl = new java.util.Date[] {GXutil.nullDate()} ;
      P000K13_n8497Renfasfpl = new boolean[] {false} ;
      P000K13_A8496Renfasprp = new String[] {""} ;
      P000K13_n8496Renfasprp = new boolean[] {false} ;
      P000K13_A8495Renfasagr = new String[] {""} ;
      P000K13_n8495Renfasagr = new boolean[] {false} ;
      P000K13_A8494RenfasPpr = new short[1] ;
      P000K13_n8494RenfasPpr = new boolean[] {false} ;
      P000K13_A8493Renfaskpr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K13_n8493Renfaskpr = new boolean[] {false} ;
      P000K13_A8492Renfasdtf = new java.util.Date[] {GXutil.nullDate()} ;
      P000K13_n8492Renfasdtf = new boolean[] {false} ;
      P000K13_A8491Renfasdti = new java.util.Date[] {GXutil.nullDate()} ;
      P000K13_n8491Renfasdti = new boolean[] {false} ;
      P000K13_A8490Renfasinc = new byte[1] ;
      P000K13_n8490Renfasinc = new boolean[] {false} ;
      P000K13_A8595RenHdrO = new String[] {""} ;
      P000K13_n8595RenHdrO = new boolean[] {false} ;
      P000K13_A8939Renfaspri2 = new short[1] ;
      P000K13_n8939Renfaspri2 = new boolean[] {false} ;
      P000K13_A6013RenFasTip = new String[] {""} ;
      P000K13_n6013RenFasTip = new boolean[] {false} ;
      P000K13_A9856RenObsF = new String[] {""} ;
      P000K13_n9856RenObsF = new boolean[] {false} ;
      P000K13_A10130RenObsB = new String[] {""} ;
      P000K13_n10130RenObsB = new boolean[] {false} ;
      P000K13_A457FasCod = new String[] {""} ;
      P000K13_n457FasCod = new boolean[] {false} ;
      P000K13_A1654RenTerCod = new String[] {""} ;
      GXv_int6 = new short[1] ;
      GXv_int7 = new short[1] ;
      P000K15_A758ProCod = new String[] {""} ;
      P000K15_A194BarOrdLin = new short[1] ;
      P000K15_A130BarCodPar = new String[] {""} ;
      P000K15_A132BarCodReo = new byte[1] ;
      P000K15_A129BarCod = new int[1] ;
      P000K15_A396EmprCod = new String[] {""} ;
      P000K15_A14277FasQuiFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K15_A12125FasQuiAI = new String[] {""} ;
      P000K15_A12124FasQuiAs = new String[] {""} ;
      P000K15_A11506FasQuiAv = new String[] {""} ;
      P000K15_A9722FasQuiVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000K15_A6665FasQuiObs = new String[] {""} ;
      P000K15_A6664FasQuiGrm = new short[1] ;
      P000K15_A6663FasQuiAnc = new short[1] ;
      P000K15_A6602FasStPl = new byte[1] ;
      P000K15_A6601FasOrdPl = new byte[1] ;
      P000K15_A6600FasFecPl = new java.util.Date[] {GXutil.nullDate()} ;
      P000K15_A6599FasMaqPl = new String[] {""} ;
      P000K15_A5375FasQuiRb = new short[1] ;
      P000K15_A5374FasQuiTp = new short[1] ;
      P000K15_A5373FasQuiNp = new short[1] ;
      P000K15_A764ProForCod = new String[] {""} ;
      P000K15_A5371FasQuiLin = new short[1] ;
      A14277FasQuiFabs = DecimalUtil.ZERO ;
      A12125FasQuiAI = "" ;
      A12124FasQuiAs = "" ;
      A11506FasQuiAv = "" ;
      A9722FasQuiVel = DecimalUtil.ZERO ;
      A6665FasQuiObs = "" ;
      A6600FasFecPl = GXutil.nullDate() ;
      A6599FasMaqPl = "" ;
      A764ProForCod = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      W758ProCod = "" ;
      W764ProForCod = "" ;
      W6599FasMaqPl = "" ;
      W6600FasFecPl = GXutil.nullDate() ;
      W6665FasQuiObs = "" ;
      W9722FasQuiVel = DecimalUtil.ZERO ;
      W11506FasQuiAv = "" ;
      W12124FasQuiAs = "" ;
      W12125FasQuiAI = "" ;
      AV110Inc_obs = "" ;
      P000K18_A758ProCod = new String[] {""} ;
      P000K18_A194BarOrdLin = new short[1] ;
      P000K18_A130BarCodPar = new String[] {""} ;
      P000K18_A132BarCodReo = new byte[1] ;
      P000K18_A129BarCod = new int[1] ;
      P000K18_A396EmprCod = new String[] {""} ;
      P000K18_A11628CCobs2 = new String[] {""} ;
      P000K18_n11628CCobs2 = new boolean[] {false} ;
      P000K18_A11474CCOkUsu = new String[] {""} ;
      P000K18_A11473CCOkFch = new java.util.Date[] {GXutil.nullDate()} ;
      P000K18_A11472CCOk = new byte[1] ;
      P000K18_A11293CcUltn = new short[1] ;
      P000K18_n11293CcUltn = new boolean[] {false} ;
      P000K18_A7691CCFchUti = new java.util.Date[] {GXutil.nullDate()} ;
      P000K18_n7691CCFchUti = new boolean[] {false} ;
      P000K18_A4405CcDisp = new String[] {""} ;
      P000K18_n4405CcDisp = new boolean[] {false} ;
      P000K18_A3281CcObs = new String[] {""} ;
      P000K18_n3281CcObs = new boolean[] {false} ;
      P000K18_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      P000K18_n4033CCFch = new boolean[] {false} ;
      P000K18_A4032CCOpeCod = new int[1] ;
      P000K18_n4032CCOpeCod = new boolean[] {false} ;
      P000K18_A4031CCTCod = new int[1] ;
      A11628CCobs2 = "" ;
      A11474CCOkUsu = "" ;
      A11473CCOkFch = GXutil.resetTime( GXutil.nullDate() );
      A7691CCFchUti = GXutil.nullDate() ;
      A4405CcDisp = "" ;
      A3281CcObs = "" ;
      A4033CCFch = GXutil.nullDate() ;
      P000K20_A396EmprCod = new String[] {""} ;
      P000K20_A129BarCod = new int[1] ;
      P000K20_A132BarCodReo = new byte[1] ;
      P000K20_A130BarCodPar = new String[] {""} ;
      P000K20_A758ProCod = new String[] {""} ;
      P000K20_A194BarOrdLin = new short[1] ;
      P000K20_A4031CCTCod = new int[1] ;
      P000K20_A11294CcLn = new short[1] ;
      P000K22_A396EmprCod = new String[] {""} ;
      P000K22_A129BarCod = new int[1] ;
      P000K22_A132BarCodReo = new byte[1] ;
      P000K22_A130BarCodPar = new String[] {""} ;
      P000K22_A758ProCod = new String[] {""} ;
      P000K22_A194BarOrdLin = new short[1] ;
      P000K22_A4031CCTCod = new int[1] ;
      P000K22_A11294CcLn = new short[1] ;
      P000K22_A11298CcLnOp = new int[1] ;
      P000K22_n11298CcLnOp = new boolean[] {false} ;
      P000K22_A11297CcLnFc = new java.util.Date[] {GXutil.nullDate()} ;
      P000K22_n11297CcLnFc = new boolean[] {false} ;
      P000K22_A11296CcLnV = new String[] {""} ;
      P000K22_n11296CcLnV = new boolean[] {false} ;
      P000K22_A11295CcLnT = new short[1] ;
      A11297CcLnFc = GXutil.nullDate() ;
      A11296CcLnV = "" ;
      P000K26_A396EmprCod = new String[] {""} ;
      P000K26_A129BarCod = new int[1] ;
      P000K26_A132BarCodReo = new byte[1] ;
      P000K26_A130BarCodPar = new String[] {""} ;
      P000K26_A758ProCod = new String[] {""} ;
      P000K26_A194BarOrdLin = new short[1] ;
      P000K26_A4031CCTCod = new int[1] ;
      P000K26_A14489CCEspecif2 = new String[] {""} ;
      P000K26_A13252CCEspecif = new String[] {""} ;
      P000K26_A13251CCMetodo = new String[] {""} ;
      P000K26_A12751CCOkDsc = new String[] {""} ;
      P000K26_A12750CCOkLin = new byte[1] ;
      P000K26_A4035CCVal = new String[] {""} ;
      P000K26_A4034CCTLin = new short[1] ;
      A14489CCEspecif2 = "" ;
      A13252CCEspecif = "" ;
      A13251CCMetodo = "" ;
      A12751CCOkDsc = "" ;
      A4035CCVal = "" ;
      AV39ExisParFas = "" ;
      AV112Usurcod = "" ;
      AV114Station = "" ;
      GXt_char11 = "" ;
      AV111Emprnom = "" ;
      GXv_char10 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char9 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      AV113Fasqui = "" ;
      GXv_char1 = new String[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.prenfas__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.prenfas__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.prenfas__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prenfas__default(),
         new Object[] {
             new Object[] {
            P000K2_A396EmprCod, P000K2_A129BarCod, P000K2_A132BarCodReo, P000K2_A130BarCodPar, P000K2_A758ProCod, P000K2_A761ProFasLin, P000K2_n761ProFasLin
            }
            , new Object[] {
            P000K3_A396EmprCod, P000K3_A129BarCod, P000K3_A132BarCodReo, P000K3_A130BarCodPar, P000K3_A758ProCod, P000K3_A194BarOrdLin, P000K3_A457FasCod, P000K3_A153BarFasEst, P000K3_A162BarFecTeo, P000K3_A160BarFecRea,
            P000K3_A216BarTieTeo, P000K3_A227BarUni, P000K3_A179BarLoc, P000K3_A165BarHorIni, P000K3_A164BarHorFin, P000K3_A215BarTieRea, P000K3_A603MaqCodBis, P000K3_A152BarFasCon, P000K3_A150BarFacTin, P000K3_A3298BarFecRIni,
            P000K3_A4287BarFasFor, P000K3_A4637BarFasCara, P000K3_A4022BarNumBot, P000K3_A5369BarFasGral, P000K3_n5369BarFasGral, P000K3_A4301BarFasCoP, P000K3_A5896BarMaqPlan, P000K3_n5896BarMaqPlan, P000K3_A4905BarFasAcab, P000K3_A3837BarFasKgm,
            P000K3_n3837BarFasKgm, P000K3_A3838BarFasMtr, P000K3_n3838BarFasMtr, P000K3_A5719BarFasKgT, P000K3_n5719BarFasKgT, P000K3_A5720BarFasMtT, P000K3_n5720BarFasMtT, P000K3_A6390BarfasMn, P000K3_n6390BarfasMn, P000K3_A6391BarfasOP,
            P000K3_n6391BarfasOP, P000K3_A6392BarHdMn, P000K3_n6392BarHdMn, P000K3_A6173BarFasSec, P000K3_n6173BarFasSec, P000K3_A7914BarfasRb, P000K3_n7914BarfasRb, P000K3_A7933Dtb_UOrd, P000K3_n7933Dtb_UOrd, P000K3_A7913BarfasUnpL,
            P000K3_n7913BarfasUnpL, P000K3_A7912Barfastpp, P000K3_n7912Barfastpp, P000K3_A6555BarFasNPl, P000K3_A6430BarTieAut, P000K3_A5999BarFasCR, P000K3_A5372FasQuiUl, P000K3_n5372FasQuiUl, P000K3_A5048BarFasUsu, P000K3_n5048BarFasUsu,
            P000K3_A5047BarFasFPl, P000K3_n5047BarFasFPl, P000K3_A5046BarFasPrp, P000K3_n5046BarFasPrp, P000K3_A5045BarFasAgr, P000K3_n5045BarFasAgr, P000K3_A4974BarFasPPr, P000K3_n4974BarFasPPr, P000K3_A4973BarFasKPr, P000K3_n4973BarFasKPr,
            P000K3_A4443BarFasDTF, P000K3_n4443BarFasDTF, P000K3_A4442BarFasDTI, P000K3_n4442BarFasDTI, P000K3_A4938BarFasInc, P000K3_n4938BarFasInc, P000K3_A8594BarHdrO, P000K3_n8594BarHdrO, P000K3_A8938BarfasPri2, P000K3_n8938BarfasPri2,
            P000K3_A9842BarObsF, P000K3_n9842BarObsF, P000K3_A6012BarFasTip, P000K3_n6012BarFasTip, P000K3_A10032BarObsB, P000K3_n10032BarObsB
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P000K7_A194BarOrdLin, P000K7_A130BarCodPar, P000K7_A132BarCodReo, P000K7_A129BarCod, P000K7_A396EmprCod, P000K7_A558HisProFec, P000K7_A602MaqCod, P000K7_A561HisProLin
            }
            , new Object[] {
            P000K8_A4593RenOrdLin, P000K8_n4593RenOrdLin, P000K8_A1654RenTerCod, P000K8_A654OrdLin, P000K8_A308CodPro
            }
            , new Object[] {
            }
            , new Object[] {
            P000K10_A4268RecOrdLin, P000K10_n4268RecOrdLin, P000K10_A6039RecAcab, P000K10_n6039RecAcab, P000K10_A130BarCodPar, P000K10_A132BarCodReo, P000K10_A129BarCod, P000K10_A396EmprCod, P000K10_A2804RecLinMaq
            }
            , new Object[] {
            P000K11_A4593RenOrdLin, P000K11_n4593RenOrdLin, P000K11_A1654RenTerCod, P000K11_A654OrdLin, P000K11_A308CodPro
            }
            , new Object[] {
            }
            , new Object[] {
            P000K13_A4593RenOrdLin, P000K13_n4593RenOrdLin, P000K13_A308CodPro, P000K13_A654OrdLin, P000K13_A816RenFasEst, P000K13_n816RenFasEst, P000K13_A818RenFecTeo, P000K13_n818RenFecTeo, P000K13_A817RenFecRea, P000K13_n817RenFecRea,
            P000K13_A824RenTieTeo, P000K13_n824RenTieTeo, P000K13_A825RenUni, P000K13_n825RenUni, P000K13_A821RenLoc, P000K13_n821RenLoc, P000K13_A820RenHorIni, P000K13_n820RenHorIni, P000K13_A819RenHorFin, P000K13_n819RenHorFin,
            P000K13_A823RenTieRea, P000K13_n823RenTieRea, P000K13_A822RenMaqCod, P000K13_n822RenMaqCod, P000K13_A815RenFasCon, P000K13_n815RenFasCon, P000K13_A814RenFacTin, P000K13_n814RenFacTin, P000K13_A3297RenFecRIni, P000K13_n3297RenFecRIni,
            P000K13_A4739RenFasFor, P000K13_n4739RenFasFor, P000K13_A4904RenFasAcab, P000K13_n4904RenFasAcab, P000K13_A4743RenFasCara, P000K13_n4743RenFasCara, P000K13_A4738RenNumBot, P000K13_n4738RenNumBot, P000K13_A5370RenFasGral, P000K13_n5370RenFasGral,
            P000K13_A4741RenFasCop, P000K13_n4741RenFasCop, P000K13_A5897RenMaqPlan, P000K13_n5897RenMaqPlan, P000K13_A4735RenFasKgm, P000K13_n4735RenFasKgm, P000K13_A4736RenFasMtr, P000K13_n4736RenFasMtr, P000K13_A5992RenFasKgT, P000K13_n5992RenFasKgT,
            P000K13_A5993RenFasMtT, P000K13_n5993RenFasMtT, P000K13_A6394RenfasOP, P000K13_n6394RenfasOP, P000K13_A6393RenFasMn, P000K13_n6393RenFasMn, P000K13_A6395RenHdMn, P000K13_n6395RenHdMn, P000K13_A6172RenFasSec, P000K13_n6172RenFasSec,
            P000K13_A8472RenfasRb, P000K13_n8472RenfasRb, P000K13_A8505Renuord, P000K13_n8505Renuord, P000K13_A8504Renfasunpl, P000K13_n8504Renfasunpl, P000K13_A8503Renfastpp, P000K13_n8503Renfastpp, P000K13_A8502Renfasnpl, P000K13_n8502Renfasnpl,
            P000K13_A8501Rentieaut, P000K13_n8501Rentieaut, P000K13_A8500Renfascr, P000K13_n8500Renfascr, P000K13_A8499Renquiul, P000K13_n8499Renquiul, P000K13_A8498Renfasusu, P000K13_n8498Renfasusu, P000K13_A8497Renfasfpl, P000K13_n8497Renfasfpl,
            P000K13_A8496Renfasprp, P000K13_n8496Renfasprp, P000K13_A8495Renfasagr, P000K13_n8495Renfasagr, P000K13_A8494RenfasPpr, P000K13_n8494RenfasPpr, P000K13_A8493Renfaskpr, P000K13_n8493Renfaskpr, P000K13_A8492Renfasdtf, P000K13_n8492Renfasdtf,
            P000K13_A8491Renfasdti, P000K13_n8491Renfasdti, P000K13_A8490Renfasinc, P000K13_n8490Renfasinc, P000K13_A8595RenHdrO, P000K13_n8595RenHdrO, P000K13_A8939Renfaspri2, P000K13_n8939Renfaspri2, P000K13_A6013RenFasTip, P000K13_n6013RenFasTip,
            P000K13_A9856RenObsF, P000K13_n9856RenObsF, P000K13_A10130RenObsB, P000K13_n10130RenObsB, P000K13_A457FasCod, P000K13_n457FasCod, P000K13_A1654RenTerCod
            }
            , new Object[] {
            }
            , new Object[] {
            P000K15_A758ProCod, P000K15_A194BarOrdLin, P000K15_A130BarCodPar, P000K15_A132BarCodReo, P000K15_A129BarCod, P000K15_A396EmprCod, P000K15_A14277FasQuiFabs, P000K15_A12125FasQuiAI, P000K15_A12124FasQuiAs, P000K15_A11506FasQuiAv,
            P000K15_A9722FasQuiVel, P000K15_A6665FasQuiObs, P000K15_A6664FasQuiGrm, P000K15_A6663FasQuiAnc, P000K15_A6602FasStPl, P000K15_A6601FasOrdPl, P000K15_A6600FasFecPl, P000K15_A6599FasMaqPl, P000K15_A5375FasQuiRb, P000K15_A5374FasQuiTp,
            P000K15_A5373FasQuiNp, P000K15_A764ProForCod, P000K15_A5371FasQuiLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P000K18_A758ProCod, P000K18_A194BarOrdLin, P000K18_A130BarCodPar, P000K18_A132BarCodReo, P000K18_A129BarCod, P000K18_A396EmprCod, P000K18_A11628CCobs2, P000K18_n11628CCobs2, P000K18_A11474CCOkUsu, P000K18_A11473CCOkFch,
            P000K18_A11472CCOk, P000K18_A11293CcUltn, P000K18_n11293CcUltn, P000K18_A7691CCFchUti, P000K18_n7691CCFchUti, P000K18_A4405CcDisp, P000K18_n4405CcDisp, P000K18_A3281CcObs, P000K18_n3281CcObs, P000K18_A4033CCFch,
            P000K18_n4033CCFch, P000K18_A4032CCOpeCod, P000K18_n4032CCOpeCod, P000K18_A4031CCTCod
            }
            , new Object[] {
            }
            , new Object[] {
            P000K20_A396EmprCod, P000K20_A129BarCod, P000K20_A132BarCodReo, P000K20_A130BarCodPar, P000K20_A758ProCod, P000K20_A194BarOrdLin, P000K20_A4031CCTCod, P000K20_A11294CcLn
            }
            , new Object[] {
            }
            , new Object[] {
            P000K22_A396EmprCod, P000K22_A129BarCod, P000K22_A132BarCodReo, P000K22_A130BarCodPar, P000K22_A758ProCod, P000K22_A194BarOrdLin, P000K22_A4031CCTCod, P000K22_A11294CcLn, P000K22_A11298CcLnOp, P000K22_n11298CcLnOp,
            P000K22_A11297CcLnFc, P000K22_n11297CcLnFc, P000K22_A11296CcLnV, P000K22_n11296CcLnV, P000K22_A11295CcLnT
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P000K26_A396EmprCod, P000K26_A129BarCod, P000K26_A132BarCodReo, P000K26_A130BarCodPar, P000K26_A758ProCod, P000K26_A194BarOrdLin, P000K26_A4031CCTCod, P000K26_A14489CCEspecif2, P000K26_A13252CCEspecif, P000K26_A13251CCMetodo,
            P000K26_A12751CCOkDsc, P000K26_A12750CCOkLin, P000K26_A4035CCVal, P000K26_A4034CCTLin
            }
            , new Object[] {
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

   private byte AV17BarCodReo ;
   private byte AV36Contador ;
   private byte AV122NoRenumero ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte A6555BarFasNPl ;
   private byte A4938BarFasInc ;
   private byte AV23BarFasEst ;
   private byte AV90Barfasnpl ;
   private byte AV102barfasinc ;
   private byte A816RenFasEst ;
   private byte A8502Renfasnpl ;
   private byte A8490Renfasinc ;
   private byte A6602FasStPl ;
   private byte A6601FasOrdPl ;
   private byte W132BarCodReo ;
   private byte W6601FasOrdPl ;
   private byte W6602FasStPl ;
   private byte A11472CCOk ;
   private byte A12750CCOkLin ;
   private byte AV67FasMin ;
   private byte AV68Carvema ;
   private byte GXt_int12 ;
   private byte GXv_int8[] ;
   private byte GXv_int3[] ;
   private short AV21FasLin ;
   private short A761ProFasLin ;
   private short AV35UltLin ;
   private short A194BarOrdLin ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short A6391BarfasOP ;
   private short A7933Dtb_UOrd ;
   private short A6430BarTieAut ;
   private short A5372FasQuiUl ;
   private short A4974BarFasPPr ;
   private short A8938BarfasPri2 ;
   private short AV29BarHorIni ;
   private short AV30BarHorFin ;
   private short AV54Barfasop ;
   private short AV103Dtb_UOrd ;
   private short AV91Bartieaut ;
   private short AV93fasquiul ;
   private short AV98barfasppr ;
   private short AV105Barfaspri2 ;
   private short A654OrdLin ;
   private short A820RenHorIni ;
   private short A819RenHorFin ;
   private short A4593RenOrdLin ;
   private short A6394RenfasOP ;
   private short A8505Renuord ;
   private short A8501Rentieaut ;
   private short A8499Renquiul ;
   private short A8494RenfasPpr ;
   private short A8939Renfaspri2 ;
   private short Gx_err ;
   private short AV41BarOrdLIn ;
   private short A4268RecOrdLin ;
   private short A2804RecLinMaq ;
   private short GXv_int6[] ;
   private short GXv_int7[] ;
   private short A6664FasQuiGrm ;
   private short A6663FasQuiAnc ;
   private short A5375FasQuiRb ;
   private short A5374FasQuiTp ;
   private short A5373FasQuiNp ;
   private short A5371FasQuiLin ;
   private short W194BarOrdLin ;
   private short W5371FasQuiLin ;
   private short W5373FasQuiNp ;
   private short W5374FasQuiTp ;
   private short W5375FasQuiRb ;
   private short W6664FasQuiGrm ;
   private short W6663FasQuiAnc ;
   private short A11293CcUltn ;
   private short A11294CcLn ;
   private short W11294CcLn ;
   private short A11295CcLnT ;
   private short W11295CcLnT ;
   private short A4034CCTLin ;
   private short W4034CCTLin ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A4022BarNumBot ;
   private int AV43BarNumBot ;
   private int GX_INS227 ;
   private int A4738RenNumBot ;
   private int A561HisProLin ;
   private int GX_INS15 ;
   private int W129BarCod ;
   private int GX_INS779 ;
   private int A4032CCOpeCod ;
   private int A4031CCTCod ;
   private int GX_INS619 ;
   private int W4031CCTCod ;
   private int GX_INS1508 ;
   private int A11298CcLnOp ;
   private int GX_INS1509 ;
   private int GX_INS620 ;
   private int GXv_int2[] ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A7914BarfasRb ;
   private java.math.BigDecimal A7913BarfasUnpL ;
   private java.math.BigDecimal A7912Barfastpp ;
   private java.math.BigDecimal A5999BarFasCR ;
   private java.math.BigDecimal A4973BarFasKPr ;
   private java.math.BigDecimal AV26BarTieTeo ;
   private java.math.BigDecimal AV27BarUni ;
   private java.math.BigDecimal AV31BarTieRea ;
   private java.math.BigDecimal AV49BARFASKGM ;
   private java.math.BigDecimal AV50BARFASMTR ;
   private java.math.BigDecimal AV51BARFASKGT ;
   private java.math.BigDecimal AV52BARFASMTT ;
   private java.math.BigDecimal AV71Barfasrb ;
   private java.math.BigDecimal AV88BarfasUnpL ;
   private java.math.BigDecimal AV89Barfastpp ;
   private java.math.BigDecimal AV92barfascr ;
   private java.math.BigDecimal AV99barfaskpr ;
   private java.math.BigDecimal A824RenTieTeo ;
   private java.math.BigDecimal A825RenUni ;
   private java.math.BigDecimal A823RenTieRea ;
   private java.math.BigDecimal A4735RenFasKgm ;
   private java.math.BigDecimal A4736RenFasMtr ;
   private java.math.BigDecimal A5992RenFasKgT ;
   private java.math.BigDecimal A5993RenFasMtT ;
   private java.math.BigDecimal A8472RenfasRb ;
   private java.math.BigDecimal A8504Renfasunpl ;
   private java.math.BigDecimal A8503Renfastpp ;
   private java.math.BigDecimal A8500Renfascr ;
   private java.math.BigDecimal A8493Renfaskpr ;
   private java.math.BigDecimal A14277FasQuiFabs ;
   private java.math.BigDecimal A9722FasQuiVel ;
   private java.math.BigDecimal W9722FasQuiVel ;
   private String AV15EmprCod ;
   private String AV18BarCodPar ;
   private String AV19ProCod ;
   private String AV20Modo ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV69Procodi ;
   private String A457FasCod ;
   private String A179BarLoc ;
   private String A603MaqCodBis ;
   private String A152BarFasCon ;
   private String A150BarFacTin ;
   private String A4287BarFasFor ;
   private String A4637BarFasCara ;
   private String A5369BarFasGral ;
   private String A4301BarFasCoP ;
   private String A5896BarMaqPlan ;
   private String A4905BarFasAcab ;
   private String A6390BarfasMn ;
   private String A6392BarHdMn ;
   private String A6173BarFasSec ;
   private String A5048BarFasUsu ;
   private String A5046BarFasPrp ;
   private String A5045BarFasAgr ;
   private String A8594BarHdrO ;
   private String A6012BarFasTip ;
   private String AV22FasCod ;
   private String AV28BarLoc ;
   private String AV32MaqCodBis ;
   private String AV33BarFasCon ;
   private String AV34BarFacTin ;
   private String AV40BarFasFor ;
   private String AV42BarFasCara ;
   private String AV44BarFasGral ;
   private String AV46BarFasCop ;
   private String AV47BarMaqPlan ;
   private String AV48BarFasAcab ;
   private String AV53BarfasMn ;
   private String AV55BarHdmn ;
   private String AV70BarFasSec ;
   private String AV94barfasusu ;
   private String AV96barfasprp ;
   private String AV97barfasagr ;
   private String AV104BarHdrO ;
   private String AV108Barfastip ;
   private String W457FasCod ;
   private String A1654RenTerCod ;
   private String AV37Termcod ;
   private String A308CodPro ;
   private String A822RenMaqCod ;
   private String A821RenLoc ;
   private String A815RenFasCon ;
   private String A814RenFacTin ;
   private String A4739RenFasFor ;
   private String A4904RenFasAcab ;
   private String A4743RenFasCara ;
   private String A5370RenFasGral ;
   private String A4741RenFasCop ;
   private String A5897RenMaqPlan ;
   private String A6393RenFasMn ;
   private String A6395RenHdMn ;
   private String A6172RenFasSec ;
   private String A8498Renfasusu ;
   private String A8496Renfasprp ;
   private String A8495Renfasagr ;
   private String A8595RenHdrO ;
   private String A6013RenFasTip ;
   private String Gx_emsg ;
   private String A602MaqCod ;
   private String A6039RecAcab ;
   private String A12125FasQuiAI ;
   private String A12124FasQuiAs ;
   private String A11506FasQuiAv ;
   private String A6599FasMaqPl ;
   private String A764ProForCod ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W758ProCod ;
   private String W764ProForCod ;
   private String W6599FasMaqPl ;
   private String W11506FasQuiAv ;
   private String W12124FasQuiAs ;
   private String W12125FasQuiAI ;
   private String A11474CCOkUsu ;
   private String A4405CcDisp ;
   private String A11296CcLnV ;
   private String A13252CCEspecif ;
   private String A13251CCMetodo ;
   private String A4035CCVal ;
   private String AV39ExisParFas ;
   private String AV112Usurcod ;
   private String AV114Station ;
   private String GXt_char11 ;
   private String AV111Emprnom ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String AV113Fasqui ;
   private String GXv_char1[] ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date AV100barfasdtf ;
   private java.util.Date AV101barfasdti ;
   private java.util.Date A8492Renfasdtf ;
   private java.util.Date A8491Renfasdti ;
   private java.util.Date A11473CCOkFch ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private java.util.Date A5047BarFasFPl ;
   private java.util.Date AV24BarFecTeo ;
   private java.util.Date AV25BarFecRea ;
   private java.util.Date AV38BarFecRIni ;
   private java.util.Date AV95barfasfpl ;
   private java.util.Date A818RenFecTeo ;
   private java.util.Date A817RenFecRea ;
   private java.util.Date A3297RenFecRIni ;
   private java.util.Date A8497Renfasfpl ;
   private java.util.Date A558HisProFec ;
   private java.util.Date A6600FasFecPl ;
   private java.util.Date W6600FasFecPl ;
   private java.util.Date A7691CCFchUti ;
   private java.util.Date A4033CCFch ;
   private java.util.Date A11297CcLnFc ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private boolean n457FasCod ;
   private boolean n5369BarFasGral ;
   private boolean n5896BarMaqPlan ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean n5719BarFasKgT ;
   private boolean n5720BarFasMtT ;
   private boolean n6390BarfasMn ;
   private boolean n6391BarfasOP ;
   private boolean n6392BarHdMn ;
   private boolean n6173BarFasSec ;
   private boolean n7914BarfasRb ;
   private boolean n7933Dtb_UOrd ;
   private boolean n7913BarfasUnpL ;
   private boolean n7912Barfastpp ;
   private boolean n5372FasQuiUl ;
   private boolean n5048BarFasUsu ;
   private boolean n5047BarFasFPl ;
   private boolean n5046BarFasPrp ;
   private boolean n5045BarFasAgr ;
   private boolean n4974BarFasPPr ;
   private boolean n4973BarFasKPr ;
   private boolean n4443BarFasDTF ;
   private boolean n4442BarFasDTI ;
   private boolean n4938BarFasInc ;
   private boolean n8594BarHdrO ;
   private boolean n8938BarfasPri2 ;
   private boolean n9842BarObsF ;
   private boolean n6012BarFasTip ;
   private boolean n10032BarObsB ;
   private boolean n816RenFasEst ;
   private boolean n822RenMaqCod ;
   private boolean n818RenFecTeo ;
   private boolean n817RenFecRea ;
   private boolean n824RenTieTeo ;
   private boolean n825RenUni ;
   private boolean n821RenLoc ;
   private boolean n820RenHorIni ;
   private boolean n819RenHorFin ;
   private boolean n823RenTieRea ;
   private boolean n815RenFasCon ;
   private boolean n814RenFacTin ;
   private boolean n3297RenFecRIni ;
   private boolean n4593RenOrdLin ;
   private boolean n4739RenFasFor ;
   private boolean n4904RenFasAcab ;
   private boolean n4743RenFasCara ;
   private boolean n4738RenNumBot ;
   private boolean n5370RenFasGral ;
   private boolean n4741RenFasCop ;
   private boolean n5897RenMaqPlan ;
   private boolean n4735RenFasKgm ;
   private boolean n4736RenFasMtr ;
   private boolean n5992RenFasKgT ;
   private boolean n5993RenFasMtT ;
   private boolean n6394RenfasOP ;
   private boolean n6393RenFasMn ;
   private boolean n6395RenHdMn ;
   private boolean n6172RenFasSec ;
   private boolean n8472RenfasRb ;
   private boolean n8505Renuord ;
   private boolean n8504Renfasunpl ;
   private boolean n8503Renfastpp ;
   private boolean n8502Renfasnpl ;
   private boolean n8501Rentieaut ;
   private boolean n8500Renfascr ;
   private boolean n8499Renquiul ;
   private boolean n8498Renfasusu ;
   private boolean n8497Renfasfpl ;
   private boolean n8496Renfasprp ;
   private boolean n8495Renfasagr ;
   private boolean n8494RenfasPpr ;
   private boolean n8493Renfaskpr ;
   private boolean n8492Renfasdtf ;
   private boolean n8491Renfasdti ;
   private boolean n8490Renfasinc ;
   private boolean n8595RenHdrO ;
   private boolean n8939Renfaspri2 ;
   private boolean n6013RenFasTip ;
   private boolean n9856RenObsF ;
   private boolean n10130RenObsB ;
   private boolean n4268RecOrdLin ;
   private boolean n6039RecAcab ;
   private boolean n11628CCobs2 ;
   private boolean n11293CcUltn ;
   private boolean n7691CCFchUti ;
   private boolean n4405CcDisp ;
   private boolean n3281CcObs ;
   private boolean n4033CCFch ;
   private boolean n4032CCOpeCod ;
   private boolean n11298CcLnOp ;
   private boolean n11297CcLnFc ;
   private boolean n11296CcLnV ;
   private String A9842BarObsF ;
   private String A10032BarObsB ;
   private String AV109Barobsf ;
   private String AV120BarObsb ;
   private String A9856RenObsF ;
   private String A10130RenObsB ;
   private String A6665FasQuiObs ;
   private String W6665FasQuiObs ;
   private String AV110Inc_obs ;
   private String A11628CCobs2 ;
   private String A3281CcObs ;
   private String A14489CCEspecif2 ;
   private String A12751CCOkDsc ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P000K2_A396EmprCod ;
   private int[] P000K2_A129BarCod ;
   private byte[] P000K2_A132BarCodReo ;
   private String[] P000K2_A130BarCodPar ;
   private String[] P000K2_A758ProCod ;
   private short[] P000K2_A761ProFasLin ;
   private boolean[] P000K2_n761ProFasLin ;
   private String[] P000K3_A396EmprCod ;
   private int[] P000K3_A129BarCod ;
   private byte[] P000K3_A132BarCodReo ;
   private String[] P000K3_A130BarCodPar ;
   private String[] P000K3_A758ProCod ;
   private short[] P000K3_A194BarOrdLin ;
   private String[] P000K3_A457FasCod ;
   private boolean[] P000K3_n457FasCod ;
   private byte[] P000K3_A153BarFasEst ;
   private java.util.Date[] P000K3_A162BarFecTeo ;
   private java.util.Date[] P000K3_A160BarFecRea ;
   private java.math.BigDecimal[] P000K3_A216BarTieTeo ;
   private java.math.BigDecimal[] P000K3_A227BarUni ;
   private String[] P000K3_A179BarLoc ;
   private short[] P000K3_A165BarHorIni ;
   private short[] P000K3_A164BarHorFin ;
   private java.math.BigDecimal[] P000K3_A215BarTieRea ;
   private String[] P000K3_A603MaqCodBis ;
   private String[] P000K3_A152BarFasCon ;
   private String[] P000K3_A150BarFacTin ;
   private java.util.Date[] P000K3_A3298BarFecRIni ;
   private String[] P000K3_A4287BarFasFor ;
   private String[] P000K3_A4637BarFasCara ;
   private int[] P000K3_A4022BarNumBot ;
   private String[] P000K3_A5369BarFasGral ;
   private boolean[] P000K3_n5369BarFasGral ;
   private String[] P000K3_A4301BarFasCoP ;
   private String[] P000K3_A5896BarMaqPlan ;
   private boolean[] P000K3_n5896BarMaqPlan ;
   private String[] P000K3_A4905BarFasAcab ;
   private java.math.BigDecimal[] P000K3_A3837BarFasKgm ;
   private boolean[] P000K3_n3837BarFasKgm ;
   private java.math.BigDecimal[] P000K3_A3838BarFasMtr ;
   private boolean[] P000K3_n3838BarFasMtr ;
   private java.math.BigDecimal[] P000K3_A5719BarFasKgT ;
   private boolean[] P000K3_n5719BarFasKgT ;
   private java.math.BigDecimal[] P000K3_A5720BarFasMtT ;
   private boolean[] P000K3_n5720BarFasMtT ;
   private String[] P000K3_A6390BarfasMn ;
   private boolean[] P000K3_n6390BarfasMn ;
   private short[] P000K3_A6391BarfasOP ;
   private boolean[] P000K3_n6391BarfasOP ;
   private String[] P000K3_A6392BarHdMn ;
   private boolean[] P000K3_n6392BarHdMn ;
   private String[] P000K3_A6173BarFasSec ;
   private boolean[] P000K3_n6173BarFasSec ;
   private java.math.BigDecimal[] P000K3_A7914BarfasRb ;
   private boolean[] P000K3_n7914BarfasRb ;
   private short[] P000K3_A7933Dtb_UOrd ;
   private boolean[] P000K3_n7933Dtb_UOrd ;
   private java.math.BigDecimal[] P000K3_A7913BarfasUnpL ;
   private boolean[] P000K3_n7913BarfasUnpL ;
   private java.math.BigDecimal[] P000K3_A7912Barfastpp ;
   private boolean[] P000K3_n7912Barfastpp ;
   private byte[] P000K3_A6555BarFasNPl ;
   private short[] P000K3_A6430BarTieAut ;
   private java.math.BigDecimal[] P000K3_A5999BarFasCR ;
   private short[] P000K3_A5372FasQuiUl ;
   private boolean[] P000K3_n5372FasQuiUl ;
   private String[] P000K3_A5048BarFasUsu ;
   private boolean[] P000K3_n5048BarFasUsu ;
   private java.util.Date[] P000K3_A5047BarFasFPl ;
   private boolean[] P000K3_n5047BarFasFPl ;
   private String[] P000K3_A5046BarFasPrp ;
   private boolean[] P000K3_n5046BarFasPrp ;
   private String[] P000K3_A5045BarFasAgr ;
   private boolean[] P000K3_n5045BarFasAgr ;
   private short[] P000K3_A4974BarFasPPr ;
   private boolean[] P000K3_n4974BarFasPPr ;
   private java.math.BigDecimal[] P000K3_A4973BarFasKPr ;
   private boolean[] P000K3_n4973BarFasKPr ;
   private java.util.Date[] P000K3_A4443BarFasDTF ;
   private boolean[] P000K3_n4443BarFasDTF ;
   private java.util.Date[] P000K3_A4442BarFasDTI ;
   private boolean[] P000K3_n4442BarFasDTI ;
   private byte[] P000K3_A4938BarFasInc ;
   private boolean[] P000K3_n4938BarFasInc ;
   private String[] P000K3_A8594BarHdrO ;
   private boolean[] P000K3_n8594BarHdrO ;
   private short[] P000K3_A8938BarfasPri2 ;
   private boolean[] P000K3_n8938BarfasPri2 ;
   private String[] P000K3_A9842BarObsF ;
   private boolean[] P000K3_n9842BarObsF ;
   private String[] P000K3_A6012BarFasTip ;
   private boolean[] P000K3_n6012BarFasTip ;
   private String[] P000K3_A10032BarObsB ;
   private boolean[] P000K3_n10032BarObsB ;
   private short[] P000K7_A194BarOrdLin ;
   private String[] P000K7_A130BarCodPar ;
   private byte[] P000K7_A132BarCodReo ;
   private int[] P000K7_A129BarCod ;
   private String[] P000K7_A396EmprCod ;
   private java.util.Date[] P000K7_A558HisProFec ;
   private String[] P000K7_A602MaqCod ;
   private int[] P000K7_A561HisProLin ;
   private short[] P000K8_A4593RenOrdLin ;
   private boolean[] P000K8_n4593RenOrdLin ;
   private String[] P000K8_A1654RenTerCod ;
   private short[] P000K8_A654OrdLin ;
   private String[] P000K8_A308CodPro ;
   private short[] P000K10_A4268RecOrdLin ;
   private boolean[] P000K10_n4268RecOrdLin ;
   private String[] P000K10_A6039RecAcab ;
   private boolean[] P000K10_n6039RecAcab ;
   private String[] P000K10_A130BarCodPar ;
   private byte[] P000K10_A132BarCodReo ;
   private int[] P000K10_A129BarCod ;
   private String[] P000K10_A396EmprCod ;
   private short[] P000K10_A2804RecLinMaq ;
   private short[] P000K11_A4593RenOrdLin ;
   private boolean[] P000K11_n4593RenOrdLin ;
   private String[] P000K11_A1654RenTerCod ;
   private short[] P000K11_A654OrdLin ;
   private String[] P000K11_A308CodPro ;
   private short[] P000K13_A4593RenOrdLin ;
   private boolean[] P000K13_n4593RenOrdLin ;
   private String[] P000K13_A308CodPro ;
   private short[] P000K13_A654OrdLin ;
   private byte[] P000K13_A816RenFasEst ;
   private boolean[] P000K13_n816RenFasEst ;
   private java.util.Date[] P000K13_A818RenFecTeo ;
   private boolean[] P000K13_n818RenFecTeo ;
   private java.util.Date[] P000K13_A817RenFecRea ;
   private boolean[] P000K13_n817RenFecRea ;
   private java.math.BigDecimal[] P000K13_A824RenTieTeo ;
   private boolean[] P000K13_n824RenTieTeo ;
   private java.math.BigDecimal[] P000K13_A825RenUni ;
   private boolean[] P000K13_n825RenUni ;
   private String[] P000K13_A821RenLoc ;
   private boolean[] P000K13_n821RenLoc ;
   private short[] P000K13_A820RenHorIni ;
   private boolean[] P000K13_n820RenHorIni ;
   private short[] P000K13_A819RenHorFin ;
   private boolean[] P000K13_n819RenHorFin ;
   private java.math.BigDecimal[] P000K13_A823RenTieRea ;
   private boolean[] P000K13_n823RenTieRea ;
   private String[] P000K13_A822RenMaqCod ;
   private boolean[] P000K13_n822RenMaqCod ;
   private String[] P000K13_A815RenFasCon ;
   private boolean[] P000K13_n815RenFasCon ;
   private String[] P000K13_A814RenFacTin ;
   private boolean[] P000K13_n814RenFacTin ;
   private java.util.Date[] P000K13_A3297RenFecRIni ;
   private boolean[] P000K13_n3297RenFecRIni ;
   private String[] P000K13_A4739RenFasFor ;
   private boolean[] P000K13_n4739RenFasFor ;
   private String[] P000K13_A4904RenFasAcab ;
   private boolean[] P000K13_n4904RenFasAcab ;
   private String[] P000K13_A4743RenFasCara ;
   private boolean[] P000K13_n4743RenFasCara ;
   private int[] P000K13_A4738RenNumBot ;
   private boolean[] P000K13_n4738RenNumBot ;
   private String[] P000K13_A5370RenFasGral ;
   private boolean[] P000K13_n5370RenFasGral ;
   private String[] P000K13_A4741RenFasCop ;
   private boolean[] P000K13_n4741RenFasCop ;
   private String[] P000K13_A5897RenMaqPlan ;
   private boolean[] P000K13_n5897RenMaqPlan ;
   private java.math.BigDecimal[] P000K13_A4735RenFasKgm ;
   private boolean[] P000K13_n4735RenFasKgm ;
   private java.math.BigDecimal[] P000K13_A4736RenFasMtr ;
   private boolean[] P000K13_n4736RenFasMtr ;
   private java.math.BigDecimal[] P000K13_A5992RenFasKgT ;
   private boolean[] P000K13_n5992RenFasKgT ;
   private java.math.BigDecimal[] P000K13_A5993RenFasMtT ;
   private boolean[] P000K13_n5993RenFasMtT ;
   private short[] P000K13_A6394RenfasOP ;
   private boolean[] P000K13_n6394RenfasOP ;
   private String[] P000K13_A6393RenFasMn ;
   private boolean[] P000K13_n6393RenFasMn ;
   private String[] P000K13_A6395RenHdMn ;
   private boolean[] P000K13_n6395RenHdMn ;
   private String[] P000K13_A6172RenFasSec ;
   private boolean[] P000K13_n6172RenFasSec ;
   private java.math.BigDecimal[] P000K13_A8472RenfasRb ;
   private boolean[] P000K13_n8472RenfasRb ;
   private short[] P000K13_A8505Renuord ;
   private boolean[] P000K13_n8505Renuord ;
   private java.math.BigDecimal[] P000K13_A8504Renfasunpl ;
   private boolean[] P000K13_n8504Renfasunpl ;
   private java.math.BigDecimal[] P000K13_A8503Renfastpp ;
   private boolean[] P000K13_n8503Renfastpp ;
   private byte[] P000K13_A8502Renfasnpl ;
   private boolean[] P000K13_n8502Renfasnpl ;
   private short[] P000K13_A8501Rentieaut ;
   private boolean[] P000K13_n8501Rentieaut ;
   private java.math.BigDecimal[] P000K13_A8500Renfascr ;
   private boolean[] P000K13_n8500Renfascr ;
   private short[] P000K13_A8499Renquiul ;
   private boolean[] P000K13_n8499Renquiul ;
   private String[] P000K13_A8498Renfasusu ;
   private boolean[] P000K13_n8498Renfasusu ;
   private java.util.Date[] P000K13_A8497Renfasfpl ;
   private boolean[] P000K13_n8497Renfasfpl ;
   private String[] P000K13_A8496Renfasprp ;
   private boolean[] P000K13_n8496Renfasprp ;
   private String[] P000K13_A8495Renfasagr ;
   private boolean[] P000K13_n8495Renfasagr ;
   private short[] P000K13_A8494RenfasPpr ;
   private boolean[] P000K13_n8494RenfasPpr ;
   private java.math.BigDecimal[] P000K13_A8493Renfaskpr ;
   private boolean[] P000K13_n8493Renfaskpr ;
   private java.util.Date[] P000K13_A8492Renfasdtf ;
   private boolean[] P000K13_n8492Renfasdtf ;
   private java.util.Date[] P000K13_A8491Renfasdti ;
   private boolean[] P000K13_n8491Renfasdti ;
   private byte[] P000K13_A8490Renfasinc ;
   private boolean[] P000K13_n8490Renfasinc ;
   private String[] P000K13_A8595RenHdrO ;
   private boolean[] P000K13_n8595RenHdrO ;
   private short[] P000K13_A8939Renfaspri2 ;
   private boolean[] P000K13_n8939Renfaspri2 ;
   private String[] P000K13_A6013RenFasTip ;
   private boolean[] P000K13_n6013RenFasTip ;
   private String[] P000K13_A9856RenObsF ;
   private boolean[] P000K13_n9856RenObsF ;
   private String[] P000K13_A10130RenObsB ;
   private boolean[] P000K13_n10130RenObsB ;
   private String[] P000K13_A457FasCod ;
   private boolean[] P000K13_n457FasCod ;
   private String[] P000K13_A1654RenTerCod ;
   private String[] P000K15_A758ProCod ;
   private short[] P000K15_A194BarOrdLin ;
   private String[] P000K15_A130BarCodPar ;
   private byte[] P000K15_A132BarCodReo ;
   private int[] P000K15_A129BarCod ;
   private String[] P000K15_A396EmprCod ;
   private java.math.BigDecimal[] P000K15_A14277FasQuiFabs ;
   private String[] P000K15_A12125FasQuiAI ;
   private String[] P000K15_A12124FasQuiAs ;
   private String[] P000K15_A11506FasQuiAv ;
   private java.math.BigDecimal[] P000K15_A9722FasQuiVel ;
   private String[] P000K15_A6665FasQuiObs ;
   private short[] P000K15_A6664FasQuiGrm ;
   private short[] P000K15_A6663FasQuiAnc ;
   private byte[] P000K15_A6602FasStPl ;
   private byte[] P000K15_A6601FasOrdPl ;
   private java.util.Date[] P000K15_A6600FasFecPl ;
   private String[] P000K15_A6599FasMaqPl ;
   private short[] P000K15_A5375FasQuiRb ;
   private short[] P000K15_A5374FasQuiTp ;
   private short[] P000K15_A5373FasQuiNp ;
   private String[] P000K15_A764ProForCod ;
   private short[] P000K15_A5371FasQuiLin ;
   private String[] P000K18_A758ProCod ;
   private short[] P000K18_A194BarOrdLin ;
   private String[] P000K18_A130BarCodPar ;
   private byte[] P000K18_A132BarCodReo ;
   private int[] P000K18_A129BarCod ;
   private String[] P000K18_A396EmprCod ;
   private String[] P000K18_A11628CCobs2 ;
   private boolean[] P000K18_n11628CCobs2 ;
   private String[] P000K18_A11474CCOkUsu ;
   private java.util.Date[] P000K18_A11473CCOkFch ;
   private byte[] P000K18_A11472CCOk ;
   private short[] P000K18_A11293CcUltn ;
   private boolean[] P000K18_n11293CcUltn ;
   private java.util.Date[] P000K18_A7691CCFchUti ;
   private boolean[] P000K18_n7691CCFchUti ;
   private String[] P000K18_A4405CcDisp ;
   private boolean[] P000K18_n4405CcDisp ;
   private String[] P000K18_A3281CcObs ;
   private boolean[] P000K18_n3281CcObs ;
   private java.util.Date[] P000K18_A4033CCFch ;
   private boolean[] P000K18_n4033CCFch ;
   private int[] P000K18_A4032CCOpeCod ;
   private boolean[] P000K18_n4032CCOpeCod ;
   private int[] P000K18_A4031CCTCod ;
   private String[] P000K20_A396EmprCod ;
   private int[] P000K20_A129BarCod ;
   private byte[] P000K20_A132BarCodReo ;
   private String[] P000K20_A130BarCodPar ;
   private String[] P000K20_A758ProCod ;
   private short[] P000K20_A194BarOrdLin ;
   private int[] P000K20_A4031CCTCod ;
   private short[] P000K20_A11294CcLn ;
   private String[] P000K22_A396EmprCod ;
   private int[] P000K22_A129BarCod ;
   private byte[] P000K22_A132BarCodReo ;
   private String[] P000K22_A130BarCodPar ;
   private String[] P000K22_A758ProCod ;
   private short[] P000K22_A194BarOrdLin ;
   private int[] P000K22_A4031CCTCod ;
   private short[] P000K22_A11294CcLn ;
   private int[] P000K22_A11298CcLnOp ;
   private boolean[] P000K22_n11298CcLnOp ;
   private java.util.Date[] P000K22_A11297CcLnFc ;
   private boolean[] P000K22_n11297CcLnFc ;
   private String[] P000K22_A11296CcLnV ;
   private boolean[] P000K22_n11296CcLnV ;
   private short[] P000K22_A11295CcLnT ;
   private String[] P000K26_A396EmprCod ;
   private int[] P000K26_A129BarCod ;
   private byte[] P000K26_A132BarCodReo ;
   private String[] P000K26_A130BarCodPar ;
   private String[] P000K26_A758ProCod ;
   private short[] P000K26_A194BarOrdLin ;
   private int[] P000K26_A4031CCTCod ;
   private String[] P000K26_A14489CCEspecif2 ;
   private String[] P000K26_A13252CCEspecif ;
   private String[] P000K26_A13251CCMetodo ;
   private String[] P000K26_A12751CCOkDsc ;
   private byte[] P000K26_A12750CCOkLin ;
   private String[] P000K26_A4035CCVal ;
   private short[] P000K26_A4034CCTLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class prenfas__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class prenfas__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class prenfas__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class prenfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000K2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000K3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasCod, BarFasEst, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarLoc, BarHorIni, BarHorFin, BarTieRea, MaqCodBis, BarFasCon, BarFacTin, BarFecRIni, BarFasFor, BarFasCara, BarNumBot, BarFasGral, BarFasCoP, BarMaqPlan, BarFasAcab, BarFasKgm, BarFasMtr, BarFasKgT, BarFasMtT, BarfasMn, BarfasOP, BarHdMn, BarFasSec, BarfasRb, Dtb_UOrd, BarfasUnpL, Barfastpp, BarFasNPl, BarTieAut, BarFasCR, FasQuiUl, BarFasUsu, BarFasFPl, BarFasPrp, BarFasAgr, BarFasPPr, BarFasKPr, BarFasDTF, BarFasDTI, BarFasInc, BarHdrO, BarfasPri2, BarObsF, BarFasTip, BarObsB FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000K4", "INSERT INTO TXPRENFAS(RenTerCod, CodPro, OrdLin, FasCod, RenFasEst, RenFecTeo, RenFecRea, RenTieTeo, RenUni, RenLoc, RenHorIni, RenHorFin, RenTieRea, RenMaqCod, RenFasCon, RenFacTin, RenFecRIni, RenOrdLin, RenFasKgm, RenFasMtr, RenNumBot, RenFasFor, RenFasCop, RenFasCara, RenFasAcab, RenFasGral, RenMaqPlan, RenFasKgT, RenFasMtT, RenFasTip, RenFasSec, RenFasMn, RenfasOP, RenHdMn, RenfasRb, Renfasinc, Renfasdti, Renfasdtf, Renfaskpr, RenfasPpr, Renfasagr, Renfasprp, Renfasfpl, Renfasusu, Renquiul, Renfascr, Rentieaut, Renfasnpl, Renfastpp, Renfasunpl, Renuord, RenHdrO, Renfaspri2, RenObsF, RenObsB, RenFasPri, RenFasBot, RenFasPzas, RenBarUltL) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRENFAS")
         ,new UpdateCursor("P000K5", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P000K6", "UPDATE TXPBARPRO SET ProFasLin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
         ,new ForEachCursor("P000K7", "SELECT BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, HisProFec, MaqCod, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000K8", "SELECT RenOrdLin, RenTerCod, OrdLin, CodPro FROM TXPRENFAS WHERE (RenTerCod = ?) AND (RenOrdLin = ?) AND (? = ?) AND (? = ?) AND (? = ?) ORDER BY RenTerCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000K9", "UPDATE TXPLHIPRO SET BarOrdLin=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLHIPRO")
         ,new ForEachCursor("P000K10", "SELECT RecOrdLin, RecAcab, BarCodPar, BarCodReo, BarCod, EmprCod, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P000K11", "SELECT RenOrdLin, RenTerCod, OrdLin, CodPro FROM TXPRENFAS WHERE (RenTerCod = ?) AND (RenOrdLin = ?) AND (? = ?) AND (? = ?) AND (? = ?) ORDER BY RenTerCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000K12", "UPDATE TXPRECMAQ SET RecOrdLin=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new ForEachCursor("P000K13", "SELECT RenOrdLin, CodPro, OrdLin, RenFasEst, RenFecTeo, RenFecRea, RenTieTeo, RenUni, RenLoc, RenHorIni, RenHorFin, RenTieRea, RenMaqCod, RenFasCon, RenFacTin, RenFecRIni, RenFasFor, RenFasAcab, RenFasCara, RenNumBot, RenFasGral, RenFasCop, RenMaqPlan, RenFasKgm, RenFasMtr, RenFasKgT, RenFasMtT, RenfasOP, RenFasMn, RenHdMn, RenFasSec, RenfasRb, Renuord, Renfasunpl, Renfastpp, Renfasnpl, Rentieaut, Renfascr, Renquiul, Renfasusu, Renfasfpl, Renfasprp, Renfasagr, RenfasPpr, Renfaskpr, Renfasdtf, Renfasdti, Renfasinc, RenHdrO, Renfaspri2, RenFasTip, RenObsF, RenObsB, FasCod, RenTerCod FROM TXPRENFAS WHERE RenTerCod = ? ORDER BY RenTerCod, CodPro, OrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000K14", "INSERT INTO TXPBARFAS(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, BarFasEst, MaqCodBis, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarLoc, BarFasKgm, BarFasMtr, BarNumBot, BarFasFor, BarFasCoP, BarFasCara, BarFasAcab, BarFasInc, BarFasDTI, BarFasDTF, BarFasKPr, BarFasPPr, FasCod, BarFasAgr, BarFasPrp, BarFasFPl, BarFasUsu, BarFasGral, FasQuiUl, BarFasKgT, BarFasMtT, BarMaqPlan, BarFasCR, BarFasTip, BarFasSec, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasBot, BarNPzas, BarFasPzas, BarUltNlot, BarFasPri, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P000K15", "SELECT ProCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, FasQuiFabs, FasQuiAI, FasQuiAs, FasQuiAv, FasQuiVel, FasQuiObs, FasQuiGrm, FasQuiAnc, FasStPl, FasOrdPl, FasFecPl, FasMaqPl, FasQuiRb, FasQuiTp, FasQuiNp, ProForCod, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000K16", "INSERT INTO TXPFASQUI(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin, ProForCod, FasQuiNp, FasQuiTp, FasQuiRb, FasMaqPl, FasFecPl, FasOrdPl, FasStPl, FasQuiAnc, FasQuiGrm, FasQuiObs, FasQuiVel, FasQuiAv, FasQuiAs, FasQuiAI, FasQuiFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new UpdateCursor("P000K17", "DELETE FROM TXPFASQUI  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new ForEachCursor("P000K18", "SELECT ProCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, CCobs2, CCOkUsu, CCOkFch, CCOk, CcUltn, CCFchUti, CcDisp, CcObs, CCFch, CCOpeCod, CCTCod FROM TXPCC WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000K19", "INSERT INTO TXPCC(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCOpeCod, CCFch, CcObs, CcDisp, CCFchUti, CcUltn, CCOk, CCOkFch, CCOkUsu, CCobs2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC")
         ,new ForEachCursor("P000K20", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn FROM TXPCCn WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000K21", "INSERT INTO TXPCCn(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCn")
         ,new ForEachCursor("P000K22", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn, CcLnOp, CcLnFc, CcLnV, CcLnT FROM TXPCCnT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? and CcLn = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn, CcLnT ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000K23", "INSERT INTO TXPCCnT(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CcLn, CcLnT, CcLnV, CcLnFc, CcLnOp) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCnT")
         ,new UpdateCursor("P000K24", "DELETE FROM TXPCCnT  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ? AND CcLnT = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCnT")
         ,new UpdateCursor("P000K25", "DELETE FROM TXPCCn  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CcLn = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCn")
         ,new ForEachCursor("P000K26", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCEspecif2, CCEspecif, CCMetodo, CCOkDsc, CCOkLin, CCVal, CCTLin FROM TXPCC1 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and CCTCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000K27", "INSERT INTO TXPCC1(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod, CCTLin, CCVal, CCOkLin, CCOkDsc, CCMetodo, CCEspecif, CCEspecif2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC1")
         ,new UpdateCursor("P000K28", "DELETE FROM TXPCC1  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC1")
         ,new UpdateCursor("P000K29", "DELETE FROM TXPCC  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND CCTCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCC")
         ,new UpdateCursor("P000K30", "DELETE FROM TXPRENFAS  WHERE RenTerCod = ? AND CodPro = ? AND OrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRENFAS")
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
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
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
               ((String[]) buf[20])[0] = rslt.getString(21, 1);
               ((String[]) buf[21])[0] = rslt.getString(22, 1);
               ((int[]) buf[22])[0] = rslt.getInt(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(25, 1);
               ((String[]) buf[26])[0] = rslt.getString(26, 6);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(27, 1);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(32, 10);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(33);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(34, 10);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(35, 2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(37);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(40);
               ((short[]) buf[54])[0] = rslt.getShort(41);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(42,5);
               ((short[]) buf[56])[0] = rslt.getShort(43);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(44, 8);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[60])[0] = rslt.getGXDate(45);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(47, 1);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((short[]) buf[66])[0] = rslt.getShort(48);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(49,2);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[70])[0] = rslt.getGXDateTime(50);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[72])[0] = rslt.getGXDateTime(51);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((byte[]) buf[74])[0] = rslt.getByte(52);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(53, 11);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((short[]) buf[78])[0] = rslt.getShort(54);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getVarchar(55);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(56, 1);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getVarchar(57);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((int[]) buf[36])[0] = rslt.getInt(20);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 6);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((short[]) buf[52])[0] = rslt.getShort(28);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(29, 10);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(30, 10);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(31, 2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((short[]) buf[62])[0] = rslt.getShort(33);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[64])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(35,2);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((byte[]) buf[68])[0] = rslt.getByte(36);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((short[]) buf[70])[0] = rslt.getShort(37);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(38,5);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((short[]) buf[74])[0] = rslt.getShort(39);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(40, 8);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[78])[0] = rslt.getGXDate(41);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((String[]) buf[80])[0] = rslt.getString(42, 1);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(43, 1);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((short[]) buf[84])[0] = rslt.getShort(44);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(45,2);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[88])[0] = rslt.getGXDateTime(46);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[90])[0] = rslt.getGXDateTime(47);
               ((boolean[]) buf[91])[0] = rslt.wasNull();
               ((byte[]) buf[92])[0] = rslt.getByte(48);
               ((boolean[]) buf[93])[0] = rslt.wasNull();
               ((String[]) buf[94])[0] = rslt.getString(49, 11);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((short[]) buf[96])[0] = rslt.getShort(50);
               ((boolean[]) buf[97])[0] = rslt.wasNull();
               ((String[]) buf[98])[0] = rslt.getString(51, 1);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               ((String[]) buf[100])[0] = rslt.getVarchar(52);
               ((boolean[]) buf[101])[0] = rslt.wasNull();
               ((String[]) buf[102])[0] = rslt.getVarchar(53);
               ((boolean[]) buf[103])[0] = rslt.wasNull();
               ((String[]) buf[104])[0] = rslt.getString(54, 8);
               ((boolean[]) buf[105])[0] = rslt.wasNull();
               ((String[]) buf[106])[0] = rslt.getString(55, 10);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,1);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((short[]) buf[18])[0] = rslt.getShort(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((short[]) buf[20])[0] = rslt.getShort(21);
               ((String[]) buf[21])[0] = rslt.getString(22, 6);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 10);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(17);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(12);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 40);
               ((short[]) buf[13])[0] = rslt.getShort(14);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 8);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[16], 10);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[24], 6);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DATE );
               }
               else
               {
                  stmt.setDate(17, (java.util.Date)parms[30]);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(21, ((Number) parms[38]).intValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[40], 1);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[42], 1);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[44], 1);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[46], 1);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[48], 1);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[50], 6);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[56], 1);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[58], 2);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[60], 10);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[62]).shortValue());
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[64], 10);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(36, ((Number) parms[68]).byteValue());
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(37, (java.util.Date)parms[70], false);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(38, (java.util.Date)parms[72], false);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(39, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(40, ((Number) parms[76]).shortValue());
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[78], 1);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[80], 1);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.DATE );
               }
               else
               {
                  stmt.setDate(43, (java.util.Date)parms[82]);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[84], 8);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(45, ((Number) parms[86]).shortValue());
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(46, (java.math.BigDecimal)parms[88], 5);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[90]).shortValue());
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(48, ((Number) parms[92]).byteValue());
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(49, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(50, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(51, ((Number) parms[98]).shortValue());
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[100], 11);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(53, ((Number) parms[102]).shortValue());
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(54, (String)parms[104], 3000);
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(55, (String)parms[106], 3000);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 10);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 1);
               stmt.setString(8, (String)parms[8], 1);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 12 :
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
               stmt.setInt(22, ((Number) parms[23]).intValue());
               stmt.setString(23, (String)parms[24], 1);
               stmt.setString(24, (String)parms[25], 1);
               stmt.setString(25, (String)parms[26], 1);
               stmt.setString(26, (String)parms[27], 1);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[29]).byteValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(28, (java.util.Date)parms[31], false);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(29, (java.util.Date)parms[33], false);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[39], 8);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DATE );
               }
               else
               {
                  stmt.setDate(35, (java.util.Date)parms[45]);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[47], 8);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(38, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(39, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(40, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[57], 6);
               }
               stmt.setBigDecimal(42, (java.math.BigDecimal)parms[58], 5);
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[60], 1);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[62], 2);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[64], 10);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(46, ((Number) parms[66]).shortValue());
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[68], 10);
               }
               stmt.setShort(48, ((Number) parms[69]).shortValue());
               stmt.setByte(49, ((Number) parms[70]).byteValue());
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(50, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(51, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(52, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(53, ((Number) parms[78]).shortValue());
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[80], 11);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(55, ((Number) parms[82]).shortValue());
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(56, (String)parms[84], 3000);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(57, (String)parms[86], 3000);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setString(12, (String)parms[11], 6);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setVarchar(18, (String)parms[17], 400, false);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 1);
               stmt.setString(20, (String)parms[19], 4);
               stmt.setString(21, (String)parms[20], 3);
               stmt.setString(22, (String)parms[21], 3);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 2);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[10]);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[12], 400);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DATE );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[16]);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[18]).shortValue());
               }
               stmt.setByte(14, ((Number) parms[19]).byteValue());
               stmt.setDateTime(15, (java.util.Date)parms[20], false);
               stmt.setString(16, (String)parms[21], 10);
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[23], 300);
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[10], 40);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[14]).intValue());
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 40);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setVarchar(11, (String)parms[10], 200, false);
               stmt.setString(12, (String)parms[11], 30);
               stmt.setString(13, (String)parms[12], 30);
               stmt.setVarchar(14, (String)parms[13], 300, false);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

