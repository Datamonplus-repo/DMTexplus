package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpalbrecconversion extends GXProcedure
{
   public txpalbrecconversion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpalbrecconversion.class ), "" );
   }

   public txpalbrecconversion( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor TXPALBRECC2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14525AlbRLot2 = TXPALBRECC2_A14525AlbRLot2[0] ;
         A13243AlbRRTrans = TXPALBRECC2_A13243AlbRRTrans[0] ;
         n13243AlbRRTrans = TXPALBRECC2_n13243AlbRRTrans[0] ;
         A13242AlbRRLong = TXPALBRECC2_A13242AlbRRLong[0] ;
         n13242AlbRRLong = TXPALBRECC2_n13242AlbRRLong[0] ;
         A13241AlbRPh = TXPALBRECC2_A13241AlbRPh[0] ;
         n13241AlbRPh = TXPALBRECC2_n13241AlbRPh[0] ;
         A12879AlbOEKOTEX = TXPALBRECC2_A12879AlbOEKOTEX[0] ;
         A11361Cod_mta = TXPALBRECC2_A11361Cod_mta[0] ;
         n11361Cod_mta = TXPALBRECC2_n11361Cod_mta[0] ;
         A10761AlbUltP = TXPALBRECC2_A10761AlbUltP[0] ;
         n10761AlbUltP = TXPALBRECC2_n10761AlbUltP[0] ;
         A10358AlbTurno = TXPALBRECC2_A10358AlbTurno[0] ;
         A317AlbStLot = TXPALBRECC2_A317AlbStLot[0] ;
         A9794AlbOStj = TXPALBRECC2_A9794AlbOStj[0] ;
         A9793AlbPdaC = TXPALBRECC2_A9793AlbPdaC[0] ;
         A9749Emp_Item1 = TXPALBRECC2_A9749Emp_Item1[0] ;
         n9749Emp_Item1 = TXPALBRECC2_n9749Emp_Item1[0] ;
         A8835Bod_UltPz = TXPALBRECC2_A8835Bod_UltPz[0] ;
         n8835Bod_UltPz = TXPALBRECC2_n8835Bod_UltPz[0] ;
         A8036AlbDmt = TXPALBRECC2_A8036AlbDmt[0] ;
         A8035AlbMaqTej = TXPALBRECC2_A8035AlbMaqTej[0] ;
         A8034AlbGalga = TXPALBRECC2_A8034AlbGalga[0] ;
         A8033AlbDndCr = TXPALBRECC2_A8033AlbDndCr[0] ;
         A8032AlbAncCr = TXPALBRECC2_A8032AlbAncCr[0] ;
         A8031AlbDndC = TXPALBRECC2_A8031AlbDndC[0] ;
         A8030AlbAncC = TXPALBRECC2_A8030AlbAncC[0] ;
         A8029AlbNumM = TXPALBRECC2_A8029AlbNumM[0] ;
         A8028AlbNumB = TXPALBRECC2_A8028AlbNumB[0] ;
         A8027AlbHdri = TXPALBRECC2_A8027AlbHdri[0] ;
         A8026AlbOC = TXPALBRECC2_A8026AlbOC[0] ;
         A8025AlbOpsC = TXPALBRECC2_A8025AlbOpsC[0] ;
         A8024AlbOpsT = TXPALBRECC2_A8024AlbOpsT[0] ;
         A8023AlbColor = TXPALBRECC2_A8023AlbColor[0] ;
         A7501AlbRecSec = TXPALBRECC2_A7501AlbRecSec[0] ;
         n7501AlbRecSec = TXPALBRECC2_n7501AlbRecSec[0] ;
         A7114MatC_ULin = TXPALBRECC2_A7114MatC_ULin[0] ;
         n7114MatC_ULin = TXPALBRECC2_n7114MatC_ULin[0] ;
         A4792AlmCod = TXPALBRECC2_A4792AlmCod[0] ;
         n4792AlmCod = TXPALBRECC2_n4792AlmCod[0] ;
         A6523AlbRUdas = TXPALBRECC2_A6523AlbRUdas[0] ;
         A6488AlbDocPrv = TXPALBRECC2_A6488AlbDocPrv[0] ;
         A6471AlbRUniB = TXPALBRECC2_A6471AlbRUniB[0] ;
         A6470AlbRTara = TXPALBRECC2_A6470AlbRTara[0] ;
         A6465AlbRLu = TXPALBRECC2_A6465AlbRLu[0] ;
         A6464AlbRTelar = TXPALBRECC2_A6464AlbRTelar[0] ;
         A6463AlbRLote = TXPALBRECC2_A6463AlbRLote[0] ;
         A6263AlbRTartC = TXPALBRECC2_A6263AlbRTartC[0] ;
         n6263AlbRTartC = TXPALBRECC2_n6263AlbRTartC[0] ;
         A6184AlbrCfop = TXPALBRECC2_A6184AlbrCfop[0] ;
         A6183AlbrFeNf = TXPALBRECC2_A6183AlbrFeNf[0] ;
         A6182AlbrNF = TXPALBRECC2_A6182AlbrNF[0] ;
         A6181AlbrPieC = TXPALBRECC2_A6181AlbrPieC[0] ;
         A6180AlbrUniC = TXPALBRECC2_A6180AlbrUniC[0] ;
         A6179AlbrHor = TXPALBRECC2_A6179AlbrHor[0] ;
         A6178AlbrUsu = TXPALBRECC2_A6178AlbrUsu[0] ;
         A5806AlbREnt2 = TXPALBRECC2_A5806AlbREnt2[0] ;
         A5745AlbRRep = TXPALBRECC2_A5745AlbRRep[0] ;
         A5744AlbRAju = TXPALBRECC2_A5744AlbRAju[0] ;
         A5743AlbRPre = TXPALBRECC2_A5743AlbRPre[0] ;
         A4922AlbPml = TXPALBRECC2_A4922AlbPml[0] ;
         A4921AlbRAnc = TXPALBRECC2_A4921AlbRAnc[0] ;
         A4920AlbRGrm2 = TXPALBRECC2_A4920AlbRGrm2[0] ;
         A4295ClasCod = TXPALBRECC2_A4295ClasCod[0] ;
         n4295ClasCod = TXPALBRECC2_n4295ClasCod[0] ;
         A4606AlbRHEn = TXPALBRECC2_A4606AlbRHEn[0] ;
         n4606AlbRHEn = TXPALBRECC2_n4606AlbRHEn[0] ;
         A4605AlbRPieLot = TXPALBRECC2_A4605AlbRPieLot[0] ;
         n4605AlbRPieLot = TXPALBRECC2_n4605AlbRPieLot[0] ;
         A4604AlbRUniLot = TXPALBRECC2_A4604AlbRUniLot[0] ;
         n4604AlbRUniLot = TXPALBRECC2_n4604AlbRUniLot[0] ;
         A4602AlbRMdlCod = TXPALBRECC2_A4602AlbRMdlCod[0] ;
         A4601AlbRTam = TXPALBRECC2_A4601AlbRTam[0] ;
         A4290AlbPmPPza = TXPALBRECC2_A4290AlbPmPPza[0] ;
         A3613AlbRefDsc = TXPALBRECC2_A3613AlbRefDsc[0] ;
         A3360AlbRImp = TXPALBRECC2_A3360AlbRImp[0] ;
         A3359AlbRDisCli = TXPALBRECC2_A3359AlbRDisCli[0] ;
         A2183HisEmpULin = TXPALBRECC2_A2183HisEmpULin[0] ;
         n2183HisEmpULin = TXPALBRECC2_n2183HisEmpULin[0] ;
         A1301AlbRUlin = TXPALBRECC2_A1301AlbRUlin[0] ;
         A970ProceCod = TXPALBRECC2_A970ProceCod[0] ;
         n970ProceCod = TXPALBRECC2_n970ProceCod[0] ;
         A1291AlbRDes = TXPALBRECC2_A1291AlbRDes[0] ;
         A1222AlbNumEti = TXPALBRECC2_A1222AlbNumEti[0] ;
         A1211TipEntCod = TXPALBRECC2_A1211TipEntCod[0] ;
         n1211TipEntCod = TXPALBRECC2_n1211TipEntCod[0] ;
         A47AlbREst = TXPALBRECC2_A47AlbREst[0] ;
         A48AlbRFecUlt = TXPALBRECC2_A48AlbRFecUlt[0] ;
         A59AlbRUniReb = TXPALBRECC2_A59AlbRUniReb[0] ;
         A60AlbRUniUti = TXPALBRECC2_A60AlbRUniUti[0] ;
         A53AlbRPieReb = TXPALBRECC2_A53AlbRPieReb[0] ;
         A54AlbRPieUti = TXPALBRECC2_A54AlbRPieUti[0] ;
         A55AlbRReo = TXPALBRECC2_A55AlbRReo[0] ;
         A58AlbRUniEnt = TXPALBRECC2_A58AlbRUniEnt[0] ;
         A49AlbRFen = TXPALBRECC2_A49AlbRFen[0] ;
         A50AlbRLoc = TXPALBRECC2_A50AlbRLoc[0] ;
         A56AlbRUni = TXPALBRECC2_A56AlbRUni[0] ;
         A52AlbRPieEnt = TXPALBRECC2_A52AlbRPieEnt[0] ;
         A46AlbREnt = TXPALBRECC2_A46AlbREnt[0] ;
         A840TrnCod = TXPALBRECC2_A840TrnCod[0] ;
         n840TrnCod = TXPALBRECC2_n840TrnCod[0] ;
         A45AlbRef = TXPALBRECC2_A45AlbRef[0] ;
         A252CliCod = TXPALBRECC2_A252CliCod[0] ;
         A44AlbRecCod = TXPALBRECC2_A44AlbRecCod[0] ;
         A396EmprCod = TXPALBRECC2_A396EmprCod[0] ;
         /*
            INSERT RECORD ON TABLE GXA0007

         */
         AV2EmprCod = A396EmprCod ;
         AV3AlbRecCod = A44AlbRecCod ;
         AV4CliCod = A252CliCod ;
         AV5AlbRef = A45AlbRef ;
         if ( TXPALBRECC2_n840TrnCod[0] )
         {
            AV6TrnCod = (short)(0) ;
            nV6TrnCod = false ;
            nV6TrnCod = true ;
         }
         else
         {
            AV6TrnCod = A840TrnCod ;
            nV6TrnCod = false ;
         }
         AV7AlbREnt = A46AlbREnt ;
         AV8AlbRPieEnt = A52AlbRPieEnt ;
         AV9AlbRUni = A56AlbRUni ;
         AV10AlbRLoc = A50AlbRLoc ;
         AV11AlbRFen = A49AlbRFen ;
         AV12AlbRUniEnt = A58AlbRUniEnt ;
         AV13AlbRReo = A55AlbRReo ;
         AV14AlbRPieUti = A54AlbRPieUti ;
         AV15AlbRPieReb = A53AlbRPieReb ;
         AV16AlbRUniUti = A60AlbRUniUti ;
         AV17AlbRUniReb = A59AlbRUniReb ;
         AV18AlbRFecUlt = A48AlbRFecUlt ;
         AV19AlbREst = A47AlbREst ;
         if ( TXPALBRECC2_n1211TipEntCod[0] )
         {
            AV20TipEntCod = (short)(0) ;
            nV20TipEntCod = false ;
            nV20TipEntCod = true ;
         }
         else
         {
            AV20TipEntCod = A1211TipEntCod ;
            nV20TipEntCod = false ;
         }
         AV21AlbNumEti = A1222AlbNumEti ;
         AV22AlbRDes = A1291AlbRDes ;
         if ( TXPALBRECC2_n970ProceCod[0] )
         {
            AV23ProceCod = (short)(0) ;
            nV23ProceCod = false ;
            nV23ProceCod = true ;
         }
         else
         {
            AV23ProceCod = A970ProceCod ;
            nV23ProceCod = false ;
         }
         AV24AlbRUlin = A1301AlbRUlin ;
         if ( TXPALBRECC2_n2183HisEmpULin[0] )
         {
            AV25HisEmpULin = (short)(0) ;
            nV25HisEmpULin = false ;
            nV25HisEmpULin = true ;
         }
         else
         {
            AV25HisEmpULin = A2183HisEmpULin ;
            nV25HisEmpULin = false ;
         }
         AV26AlbRDisCli = A3359AlbRDisCli ;
         AV27AlbRImp = A3360AlbRImp ;
         AV28AlbRefDsc = A3613AlbRefDsc ;
         AV29AlbPmPPza = A4290AlbPmPPza ;
         AV30AlbRTam = A4601AlbRTam ;
         AV31AlbRMdlCod = A4602AlbRMdlCod ;
         if ( TXPALBRECC2_n4604AlbRUniLot[0] )
         {
            AV32AlbRUniLot = DecimalUtil.ZERO ;
            nV32AlbRUniLot = false ;
            nV32AlbRUniLot = true ;
         }
         else
         {
            AV32AlbRUniLot = A4604AlbRUniLot ;
            nV32AlbRUniLot = false ;
         }
         if ( TXPALBRECC2_n4605AlbRPieLot[0] )
         {
            AV33AlbRPieLot = 0 ;
            nV33AlbRPieLot = false ;
            nV33AlbRPieLot = true ;
         }
         else
         {
            AV33AlbRPieLot = A4605AlbRPieLot ;
            nV33AlbRPieLot = false ;
         }
         if ( TXPALBRECC2_n4606AlbRHEn[0] )
         {
            AV34AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
            nV34AlbRHEn = false ;
            nV34AlbRHEn = true ;
         }
         else
         {
            AV34AlbRHEn = A4606AlbRHEn ;
            nV34AlbRHEn = false ;
         }
         if ( TXPALBRECC2_n4295ClasCod[0] )
         {
            AV35ClasCod = (short)(0) ;
            nV35ClasCod = false ;
            nV35ClasCod = true ;
         }
         else
         {
            AV35ClasCod = A4295ClasCod ;
            nV35ClasCod = false ;
         }
         AV36AlbRGrm2 = A4920AlbRGrm2 ;
         AV37AlbRAnc = A4921AlbRAnc ;
         AV38AlbPml = A4922AlbPml ;
         AV39AlbRPre = A5743AlbRPre ;
         AV40AlbRAju = A5744AlbRAju ;
         AV41AlbRRep = A5745AlbRRep ;
         AV42AlbREnt2 = A5806AlbREnt2 ;
         AV43AlbrUsu = A6178AlbrUsu ;
         AV44AlbrHor = A6179AlbrHor ;
         AV45AlbrUniC = A6180AlbrUniC ;
         AV46AlbrPieC = A6181AlbrPieC ;
         AV47AlbrNF = A6182AlbrNF ;
         AV48AlbrFeNf = A6183AlbrFeNf ;
         AV49AlbrCfop = A6184AlbrCfop ;
         if ( TXPALBRECC2_n6263AlbRTartC[0] )
         {
            AV50AlbRTartC = (short)(0) ;
            nV50AlbRTartC = false ;
            nV50AlbRTartC = true ;
         }
         else
         {
            AV50AlbRTartC = A6263AlbRTartC ;
            nV50AlbRTartC = false ;
         }
         AV51AlbRLote = A6463AlbRLote ;
         AV52AlbRTelar = A6464AlbRTelar ;
         AV53AlbRLu = A6465AlbRLu ;
         AV54AlbRTara = A6470AlbRTara ;
         AV55AlbRUniB = A6471AlbRUniB ;
         AV56AlbDocPrv = A6488AlbDocPrv ;
         AV57AlbRUdas = A6523AlbRUdas ;
         if ( TXPALBRECC2_n4792AlmCod[0] )
         {
            AV58AlmCod = (byte)(0) ;
            nV58AlmCod = false ;
            nV58AlmCod = true ;
         }
         else
         {
            AV58AlmCod = A4792AlmCod ;
            nV58AlmCod = false ;
         }
         if ( TXPALBRECC2_n7114MatC_ULin[0] )
         {
            AV59MatC_ULin = (short)(0) ;
            nV59MatC_ULin = false ;
            nV59MatC_ULin = true ;
         }
         else
         {
            AV59MatC_ULin = A7114MatC_ULin ;
            nV59MatC_ULin = false ;
         }
         if ( TXPALBRECC2_n7501AlbRecSec[0] )
         {
            AV60AlbRecSec = (short)(0) ;
            nV60AlbRecSec = false ;
            nV60AlbRecSec = true ;
         }
         else
         {
            AV60AlbRecSec = A7501AlbRecSec ;
            nV60AlbRecSec = false ;
         }
         AV61AlbColor = A8023AlbColor ;
         AV62AlbOpsT = A8024AlbOpsT ;
         AV63AlbOpsC = A8025AlbOpsC ;
         AV64AlbOC = A8026AlbOC ;
         AV65AlbHdri = A8027AlbHdri ;
         AV66AlbNumB = A8028AlbNumB ;
         AV67AlbNumM = A8029AlbNumM ;
         AV68AlbAncC = A8030AlbAncC ;
         AV69AlbDndC = A8031AlbDndC ;
         AV70AlbAncCr = A8032AlbAncCr ;
         AV71AlbDndCr = A8033AlbDndCr ;
         AV72AlbGalga = A8034AlbGalga ;
         AV73AlbMaqTej = A8035AlbMaqTej ;
         AV74AlbDmt = A8036AlbDmt ;
         if ( TXPALBRECC2_n8835Bod_UltPz[0] )
         {
            AV75Bod_UltPz = "" ;
            nV75Bod_UltPz = false ;
            nV75Bod_UltPz = true ;
         }
         else
         {
            AV75Bod_UltPz = A8835Bod_UltPz ;
            nV75Bod_UltPz = false ;
         }
         if ( TXPALBRECC2_n9749Emp_Item1[0] )
         {
            AV76Emp_Item1 = " " ;
         }
         else
         {
            AV76Emp_Item1 = A9749Emp_Item1 ;
         }
         AV77AlbPdaC = A9793AlbPdaC ;
         AV78AlbOStj = A9794AlbOStj ;
         AV79AlbStLot = A317AlbStLot ;
         AV80AlbTurno = A10358AlbTurno ;
         if ( TXPALBRECC2_n10761AlbUltP[0] )
         {
            AV81AlbUltP = (short)(0) ;
            nV81AlbUltP = false ;
            nV81AlbUltP = true ;
         }
         else
         {
            AV81AlbUltP = A10761AlbUltP ;
            nV81AlbUltP = false ;
         }
         if ( TXPALBRECC2_n11361Cod_mta[0] )
         {
            AV82Cod_mta = (short)(0) ;
            nV82Cod_mta = false ;
            nV82Cod_mta = true ;
         }
         else
         {
            AV82Cod_mta = A11361Cod_mta ;
            nV82Cod_mta = false ;
         }
         AV83AlbOEKOTEX = A12879AlbOEKOTEX ;
         if ( TXPALBRECC2_n13241AlbRPh[0] )
         {
            AV84AlbRPh = DecimalUtil.ZERO ;
            nV84AlbRPh = false ;
            nV84AlbRPh = true ;
         }
         else
         {
            AV84AlbRPh = A13241AlbRPh ;
            nV84AlbRPh = false ;
         }
         if ( TXPALBRECC2_n13242AlbRRLong[0] )
         {
            AV85AlbRRLong = DecimalUtil.ZERO ;
            nV85AlbRRLong = false ;
            nV85AlbRRLong = true ;
         }
         else
         {
            AV85AlbRRLong = A13242AlbRRLong ;
            nV85AlbRRLong = false ;
         }
         if ( TXPALBRECC2_n13243AlbRRTrans[0] )
         {
            AV86AlbRRTrans = DecimalUtil.ZERO ;
            nV86AlbRRTrans = false ;
            nV86AlbRRTrans = true ;
         }
         else
         {
            AV86AlbRRTrans = A13243AlbRRTrans ;
            nV86AlbRRTrans = false ;
         }
         AV87AlbRLot2 = A14525AlbRLot2 ;
         /* Using cursor TXPALBRECC3 */
         pr_default.execute(1, new Object[] {AV2EmprCod, Integer.valueOf(AV3AlbRecCod), Integer.valueOf(AV4CliCod), AV5AlbRef, Boolean.valueOf(nV6TrnCod), Short.valueOf(AV6TrnCod), AV7AlbREnt, Integer.valueOf(AV8AlbRPieEnt), AV9AlbRUni, AV10AlbRLoc, AV11AlbRFen, AV12AlbRUniEnt, AV13AlbRReo, Integer.valueOf(AV14AlbRPieUti), Integer.valueOf(AV15AlbRPieReb), AV16AlbRUniUti, AV17AlbRUniReb, AV18AlbRFecUlt, Byte.valueOf(AV19AlbREst), Boolean.valueOf(nV20TipEntCod), Short.valueOf(AV20TipEntCod), Short.valueOf(AV21AlbNumEti), AV22AlbRDes, Boolean.valueOf(nV23ProceCod), Short.valueOf(AV23ProceCod), Byte.valueOf(AV24AlbRUlin), Boolean.valueOf(nV25HisEmpULin), Short.valueOf(AV25HisEmpULin), AV26AlbRDisCli, AV27AlbRImp, AV28AlbRefDsc, AV29AlbPmPPza, AV30AlbRTam, AV31AlbRMdlCod, Boolean.valueOf(nV32AlbRUniLot), AV32AlbRUniLot, Boolean.valueOf(nV33AlbRPieLot), Integer.valueOf(AV33AlbRPieLot), Boolean.valueOf(nV34AlbRHEn), AV34AlbRHEn, Boolean.valueOf(nV35ClasCod), Short.valueOf(AV35ClasCod), Short.valueOf(AV36AlbRGrm2), Short.valueOf(AV37AlbRAnc), Short.valueOf(AV38AlbPml), AV39AlbRPre, AV40AlbRAju, Byte.valueOf(AV41AlbRRep), AV42AlbREnt2, AV43AlbrUsu, AV44AlbrHor, AV45AlbrUniC, Integer.valueOf(AV46AlbrPieC), AV47AlbrNF, AV48AlbrFeNf, AV49AlbrCfop, Boolean.valueOf(nV50AlbRTartC), Short.valueOf(AV50AlbRTartC), AV51AlbRLote, AV52AlbRTelar, AV53AlbRLu, AV54AlbRTara, AV55AlbRUniB, AV56AlbDocPrv, AV57AlbRUdas, Boolean.valueOf(nV58AlmCod), Byte.valueOf(AV58AlmCod), Boolean.valueOf(nV59MatC_ULin), Short.valueOf(AV59MatC_ULin), Boolean.valueOf(nV60AlbRecSec), Short.valueOf(AV60AlbRecSec), AV61AlbColor, AV62AlbOpsT, AV63AlbOpsC, AV64AlbOC, AV65AlbHdri, AV66AlbNumB, AV67AlbNumM, AV68AlbAncC, Short.valueOf(AV69AlbDndC), AV70AlbAncCr, Short.valueOf(AV71AlbDndCr), Short.valueOf(AV72AlbGalga), AV73AlbMaqTej, Short.valueOf(AV74AlbDmt), Boolean.valueOf(nV75Bod_UltPz), AV75Bod_UltPz, AV76Emp_Item1, AV77AlbPdaC, AV78AlbOStj, Byte.valueOf(AV79AlbStLot), Byte.valueOf(AV80AlbTurno), Boolean.valueOf(nV81AlbUltP), Short.valueOf(AV81AlbUltP), Boolean.valueOf(nV82Cod_mta), Short.valueOf(AV82Cod_mta), AV83AlbOEKOTEX, Boolean.valueOf(nV84AlbRPh), AV84AlbRPh, Boolean.valueOf(nV85AlbRRLong), AV85AlbRRLong, Boolean.valueOf(nV86AlbRRTrans), AV86AlbRRTrans, AV87AlbRLot2});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("GXA0007");
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txpalbrecconversion");
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
      TXPALBRECC2_A14525AlbRLot2 = new String[] {""} ;
      TXPALBRECC2_A13243AlbRRTrans = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_n13243AlbRRTrans = new boolean[] {false} ;
      TXPALBRECC2_A13242AlbRRLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_n13242AlbRRLong = new boolean[] {false} ;
      TXPALBRECC2_A13241AlbRPh = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_n13241AlbRPh = new boolean[] {false} ;
      TXPALBRECC2_A12879AlbOEKOTEX = new String[] {""} ;
      TXPALBRECC2_A11361Cod_mta = new short[1] ;
      TXPALBRECC2_n11361Cod_mta = new boolean[] {false} ;
      TXPALBRECC2_A10761AlbUltP = new short[1] ;
      TXPALBRECC2_n10761AlbUltP = new boolean[] {false} ;
      TXPALBRECC2_A10358AlbTurno = new byte[1] ;
      TXPALBRECC2_A317AlbStLot = new byte[1] ;
      TXPALBRECC2_A9794AlbOStj = new String[] {""} ;
      TXPALBRECC2_A9793AlbPdaC = new String[] {""} ;
      TXPALBRECC2_A9749Emp_Item1 = new String[] {""} ;
      TXPALBRECC2_n9749Emp_Item1 = new boolean[] {false} ;
      TXPALBRECC2_A8835Bod_UltPz = new String[] {""} ;
      TXPALBRECC2_n8835Bod_UltPz = new boolean[] {false} ;
      TXPALBRECC2_A8036AlbDmt = new short[1] ;
      TXPALBRECC2_A8035AlbMaqTej = new String[] {""} ;
      TXPALBRECC2_A8034AlbGalga = new short[1] ;
      TXPALBRECC2_A8033AlbDndCr = new short[1] ;
      TXPALBRECC2_A8032AlbAncCr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_A8031AlbDndC = new short[1] ;
      TXPALBRECC2_A8030AlbAncC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_A8029AlbNumM = new String[] {""} ;
      TXPALBRECC2_A8028AlbNumB = new String[] {""} ;
      TXPALBRECC2_A8027AlbHdri = new String[] {""} ;
      TXPALBRECC2_A8026AlbOC = new String[] {""} ;
      TXPALBRECC2_A8025AlbOpsC = new String[] {""} ;
      TXPALBRECC2_A8024AlbOpsT = new String[] {""} ;
      TXPALBRECC2_A8023AlbColor = new String[] {""} ;
      TXPALBRECC2_A7501AlbRecSec = new short[1] ;
      TXPALBRECC2_n7501AlbRecSec = new boolean[] {false} ;
      TXPALBRECC2_A7114MatC_ULin = new short[1] ;
      TXPALBRECC2_n7114MatC_ULin = new boolean[] {false} ;
      TXPALBRECC2_A4792AlmCod = new byte[1] ;
      TXPALBRECC2_n4792AlmCod = new boolean[] {false} ;
      TXPALBRECC2_A6523AlbRUdas = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_A6488AlbDocPrv = new String[] {""} ;
      TXPALBRECC2_A6471AlbRUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_A6464AlbRTelar = new String[] {""} ;
      TXPALBRECC2_A6463AlbRLote = new String[] {""} ;
      TXPALBRECC2_A6263AlbRTartC = new short[1] ;
      TXPALBRECC2_n6263AlbRTartC = new boolean[] {false} ;
      TXPALBRECC2_A6184AlbrCfop = new String[] {""} ;
      TXPALBRECC2_A6183AlbrFeNf = new java.util.Date[] {GXutil.nullDate()} ;
      TXPALBRECC2_A6182AlbrNF = new String[] {""} ;
      TXPALBRECC2_A6181AlbrPieC = new int[1] ;
      TXPALBRECC2_A6180AlbrUniC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      TXPALBRECC2_A6178AlbrUsu = new String[] {""} ;
      TXPALBRECC2_A5806AlbREnt2 = new String[] {""} ;
      TXPALBRECC2_A5745AlbRRep = new byte[1] ;
      TXPALBRECC2_A5744AlbRAju = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_A5743AlbRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_A4922AlbPml = new short[1] ;
      TXPALBRECC2_A4921AlbRAnc = new short[1] ;
      TXPALBRECC2_A4920AlbRGrm2 = new short[1] ;
      TXPALBRECC2_A4295ClasCod = new short[1] ;
      TXPALBRECC2_n4295ClasCod = new boolean[] {false} ;
      TXPALBRECC2_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      TXPALBRECC2_n4606AlbRHEn = new boolean[] {false} ;
      TXPALBRECC2_A4605AlbRPieLot = new int[1] ;
      TXPALBRECC2_n4605AlbRPieLot = new boolean[] {false} ;
      TXPALBRECC2_A4604AlbRUniLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_n4604AlbRUniLot = new boolean[] {false} ;
      TXPALBRECC2_A4602AlbRMdlCod = new String[] {""} ;
      TXPALBRECC2_A4601AlbRTam = new String[] {""} ;
      TXPALBRECC2_A4290AlbPmPPza = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_A3613AlbRefDsc = new String[] {""} ;
      TXPALBRECC2_A3360AlbRImp = new String[] {""} ;
      TXPALBRECC2_A3359AlbRDisCli = new String[] {""} ;
      TXPALBRECC2_A2183HisEmpULin = new short[1] ;
      TXPALBRECC2_n2183HisEmpULin = new boolean[] {false} ;
      TXPALBRECC2_A1301AlbRUlin = new byte[1] ;
      TXPALBRECC2_A970ProceCod = new short[1] ;
      TXPALBRECC2_n970ProceCod = new boolean[] {false} ;
      TXPALBRECC2_A1291AlbRDes = new String[] {""} ;
      TXPALBRECC2_A1222AlbNumEti = new short[1] ;
      TXPALBRECC2_A1211TipEntCod = new short[1] ;
      TXPALBRECC2_n1211TipEntCod = new boolean[] {false} ;
      TXPALBRECC2_A47AlbREst = new byte[1] ;
      TXPALBRECC2_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      TXPALBRECC2_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_A53AlbRPieReb = new int[1] ;
      TXPALBRECC2_A54AlbRPieUti = new int[1] ;
      TXPALBRECC2_A55AlbRReo = new String[] {""} ;
      TXPALBRECC2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      TXPALBRECC2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      TXPALBRECC2_A50AlbRLoc = new String[] {""} ;
      TXPALBRECC2_A56AlbRUni = new String[] {""} ;
      TXPALBRECC2_A52AlbRPieEnt = new int[1] ;
      TXPALBRECC2_A46AlbREnt = new String[] {""} ;
      TXPALBRECC2_A840TrnCod = new short[1] ;
      TXPALBRECC2_n840TrnCod = new boolean[] {false} ;
      TXPALBRECC2_A45AlbRef = new String[] {""} ;
      TXPALBRECC2_A252CliCod = new int[1] ;
      TXPALBRECC2_A44AlbRecCod = new int[1] ;
      TXPALBRECC2_A396EmprCod = new String[] {""} ;
      A14525AlbRLot2 = "" ;
      A13243AlbRRTrans = DecimalUtil.ZERO ;
      A13242AlbRRLong = DecimalUtil.ZERO ;
      A13241AlbRPh = DecimalUtil.ZERO ;
      A12879AlbOEKOTEX = "" ;
      A9794AlbOStj = "" ;
      A9793AlbPdaC = "" ;
      A9749Emp_Item1 = "" ;
      A8835Bod_UltPz = "" ;
      A8035AlbMaqTej = "" ;
      A8032AlbAncCr = DecimalUtil.ZERO ;
      A8030AlbAncC = DecimalUtil.ZERO ;
      A8029AlbNumM = "" ;
      A8028AlbNumB = "" ;
      A8027AlbHdri = "" ;
      A8026AlbOC = "" ;
      A8025AlbOpsC = "" ;
      A8024AlbOpsT = "" ;
      A8023AlbColor = "" ;
      A6523AlbRUdas = DecimalUtil.ZERO ;
      A6488AlbDocPrv = "" ;
      A6471AlbRUniB = DecimalUtil.ZERO ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A6464AlbRTelar = "" ;
      A6463AlbRLote = "" ;
      A6184AlbrCfop = "" ;
      A6183AlbrFeNf = GXutil.nullDate() ;
      A6182AlbrNF = "" ;
      A6180AlbrUniC = DecimalUtil.ZERO ;
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      A6178AlbrUsu = "" ;
      A5806AlbREnt2 = "" ;
      A5744AlbRAju = DecimalUtil.ZERO ;
      A5743AlbRPre = DecimalUtil.ZERO ;
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      A4604AlbRUniLot = DecimalUtil.ZERO ;
      A4602AlbRMdlCod = "" ;
      A4601AlbRTam = "" ;
      A4290AlbPmPPza = DecimalUtil.ZERO ;
      A3613AlbRefDsc = "" ;
      A3360AlbRImp = "" ;
      A3359AlbRDisCli = "" ;
      A1291AlbRDes = "" ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      A59AlbRUniReb = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A55AlbRReo = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A49AlbRFen = GXutil.nullDate() ;
      A50AlbRLoc = "" ;
      A56AlbRUni = "" ;
      A46AlbREnt = "" ;
      A45AlbRef = "" ;
      A396EmprCod = "" ;
      AV2EmprCod = "" ;
      AV5AlbRef = "" ;
      AV7AlbREnt = "" ;
      AV9AlbRUni = "" ;
      AV10AlbRLoc = "" ;
      AV11AlbRFen = GXutil.nullDate() ;
      AV12AlbRUniEnt = DecimalUtil.ZERO ;
      AV13AlbRReo = "" ;
      AV16AlbRUniUti = DecimalUtil.ZERO ;
      AV17AlbRUniReb = DecimalUtil.ZERO ;
      AV18AlbRFecUlt = GXutil.nullDate() ;
      AV22AlbRDes = "" ;
      AV26AlbRDisCli = "" ;
      AV27AlbRImp = "" ;
      AV28AlbRefDsc = "" ;
      AV29AlbPmPPza = DecimalUtil.ZERO ;
      AV30AlbRTam = "" ;
      AV31AlbRMdlCod = "" ;
      AV32AlbRUniLot = DecimalUtil.ZERO ;
      AV34AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      AV39AlbRPre = DecimalUtil.ZERO ;
      AV40AlbRAju = DecimalUtil.ZERO ;
      AV42AlbREnt2 = "" ;
      AV43AlbrUsu = "" ;
      AV44AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      AV45AlbrUniC = DecimalUtil.ZERO ;
      AV47AlbrNF = "" ;
      AV48AlbrFeNf = GXutil.nullDate() ;
      AV49AlbrCfop = "" ;
      AV51AlbRLote = "" ;
      AV52AlbRTelar = "" ;
      AV53AlbRLu = DecimalUtil.ZERO ;
      AV54AlbRTara = DecimalUtil.ZERO ;
      AV55AlbRUniB = DecimalUtil.ZERO ;
      AV56AlbDocPrv = "" ;
      AV57AlbRUdas = DecimalUtil.ZERO ;
      AV61AlbColor = "" ;
      AV62AlbOpsT = "" ;
      AV63AlbOpsC = "" ;
      AV64AlbOC = "" ;
      AV65AlbHdri = "" ;
      AV66AlbNumB = "" ;
      AV67AlbNumM = "" ;
      AV68AlbAncC = DecimalUtil.ZERO ;
      AV70AlbAncCr = DecimalUtil.ZERO ;
      AV73AlbMaqTej = "" ;
      AV75Bod_UltPz = "" ;
      AV76Emp_Item1 = "" ;
      AV77AlbPdaC = "" ;
      AV78AlbOStj = "" ;
      AV83AlbOEKOTEX = "" ;
      AV84AlbRPh = DecimalUtil.ZERO ;
      AV85AlbRRLong = DecimalUtil.ZERO ;
      AV86AlbRRTrans = DecimalUtil.ZERO ;
      AV87AlbRLot2 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpalbrecconversion__default(),
         new Object[] {
             new Object[] {
            TXPALBRECC2_A14525AlbRLot2, TXPALBRECC2_A13243AlbRRTrans, TXPALBRECC2_n13243AlbRRTrans, TXPALBRECC2_A13242AlbRRLong, TXPALBRECC2_n13242AlbRRLong, TXPALBRECC2_A13241AlbRPh, TXPALBRECC2_n13241AlbRPh, TXPALBRECC2_A12879AlbOEKOTEX, TXPALBRECC2_A11361Cod_mta, TXPALBRECC2_n11361Cod_mta,
            TXPALBRECC2_A10761AlbUltP, TXPALBRECC2_n10761AlbUltP, TXPALBRECC2_A10358AlbTurno, TXPALBRECC2_A317AlbStLot, TXPALBRECC2_A9794AlbOStj, TXPALBRECC2_A9793AlbPdaC, TXPALBRECC2_A9749Emp_Item1, TXPALBRECC2_n9749Emp_Item1, TXPALBRECC2_A8835Bod_UltPz, TXPALBRECC2_n8835Bod_UltPz,
            TXPALBRECC2_A8036AlbDmt, TXPALBRECC2_A8035AlbMaqTej, TXPALBRECC2_A8034AlbGalga, TXPALBRECC2_A8033AlbDndCr, TXPALBRECC2_A8032AlbAncCr, TXPALBRECC2_A8031AlbDndC, TXPALBRECC2_A8030AlbAncC, TXPALBRECC2_A8029AlbNumM, TXPALBRECC2_A8028AlbNumB, TXPALBRECC2_A8027AlbHdri,
            TXPALBRECC2_A8026AlbOC, TXPALBRECC2_A8025AlbOpsC, TXPALBRECC2_A8024AlbOpsT, TXPALBRECC2_A8023AlbColor, TXPALBRECC2_A7501AlbRecSec, TXPALBRECC2_n7501AlbRecSec, TXPALBRECC2_A7114MatC_ULin, TXPALBRECC2_n7114MatC_ULin, TXPALBRECC2_A4792AlmCod, TXPALBRECC2_n4792AlmCod,
            TXPALBRECC2_A6523AlbRUdas, TXPALBRECC2_A6488AlbDocPrv, TXPALBRECC2_A6471AlbRUniB, TXPALBRECC2_A6470AlbRTara, TXPALBRECC2_A6465AlbRLu, TXPALBRECC2_A6464AlbRTelar, TXPALBRECC2_A6463AlbRLote, TXPALBRECC2_A6263AlbRTartC, TXPALBRECC2_n6263AlbRTartC, TXPALBRECC2_A6184AlbrCfop,
            TXPALBRECC2_A6183AlbrFeNf, TXPALBRECC2_A6182AlbrNF, TXPALBRECC2_A6181AlbrPieC, TXPALBRECC2_A6180AlbrUniC, TXPALBRECC2_A6179AlbrHor, TXPALBRECC2_A6178AlbrUsu, TXPALBRECC2_A5806AlbREnt2, TXPALBRECC2_A5745AlbRRep, TXPALBRECC2_A5744AlbRAju, TXPALBRECC2_A5743AlbRPre,
            TXPALBRECC2_A4922AlbPml, TXPALBRECC2_A4921AlbRAnc, TXPALBRECC2_A4920AlbRGrm2, TXPALBRECC2_A4295ClasCod, TXPALBRECC2_n4295ClasCod, TXPALBRECC2_A4606AlbRHEn, TXPALBRECC2_n4606AlbRHEn, TXPALBRECC2_A4605AlbRPieLot, TXPALBRECC2_n4605AlbRPieLot, TXPALBRECC2_A4604AlbRUniLot,
            TXPALBRECC2_n4604AlbRUniLot, TXPALBRECC2_A4602AlbRMdlCod, TXPALBRECC2_A4601AlbRTam, TXPALBRECC2_A4290AlbPmPPza, TXPALBRECC2_A3613AlbRefDsc, TXPALBRECC2_A3360AlbRImp, TXPALBRECC2_A3359AlbRDisCli, TXPALBRECC2_A2183HisEmpULin, TXPALBRECC2_n2183HisEmpULin, TXPALBRECC2_A1301AlbRUlin,
            TXPALBRECC2_A970ProceCod, TXPALBRECC2_n970ProceCod, TXPALBRECC2_A1291AlbRDes, TXPALBRECC2_A1222AlbNumEti, TXPALBRECC2_A1211TipEntCod, TXPALBRECC2_n1211TipEntCod, TXPALBRECC2_A47AlbREst, TXPALBRECC2_A48AlbRFecUlt, TXPALBRECC2_A59AlbRUniReb, TXPALBRECC2_A60AlbRUniUti,
            TXPALBRECC2_A53AlbRPieReb, TXPALBRECC2_A54AlbRPieUti, TXPALBRECC2_A55AlbRReo, TXPALBRECC2_A58AlbRUniEnt, TXPALBRECC2_A49AlbRFen, TXPALBRECC2_A50AlbRLoc, TXPALBRECC2_A56AlbRUni, TXPALBRECC2_A52AlbRPieEnt, TXPALBRECC2_A46AlbREnt, TXPALBRECC2_A840TrnCod,
            TXPALBRECC2_n840TrnCod, TXPALBRECC2_A45AlbRef, TXPALBRECC2_A252CliCod, TXPALBRECC2_A44AlbRecCod, TXPALBRECC2_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10358AlbTurno ;
   private byte A317AlbStLot ;
   private byte A4792AlmCod ;
   private byte A5745AlbRRep ;
   private byte A1301AlbRUlin ;
   private byte A47AlbREst ;
   private byte AV19AlbREst ;
   private byte AV24AlbRUlin ;
   private byte AV41AlbRRep ;
   private byte AV58AlmCod ;
   private byte AV79AlbStLot ;
   private byte AV80AlbTurno ;
   private short A11361Cod_mta ;
   private short A10761AlbUltP ;
   private short A8036AlbDmt ;
   private short A8034AlbGalga ;
   private short A8033AlbDndCr ;
   private short A8031AlbDndC ;
   private short A7501AlbRecSec ;
   private short A7114MatC_ULin ;
   private short A6263AlbRTartC ;
   private short A4922AlbPml ;
   private short A4921AlbRAnc ;
   private short A4920AlbRGrm2 ;
   private short A4295ClasCod ;
   private short A2183HisEmpULin ;
   private short A970ProceCod ;
   private short A1222AlbNumEti ;
   private short A1211TipEntCod ;
   private short A840TrnCod ;
   private short AV6TrnCod ;
   private short AV20TipEntCod ;
   private short AV21AlbNumEti ;
   private short AV23ProceCod ;
   private short AV25HisEmpULin ;
   private short AV35ClasCod ;
   private short AV36AlbRGrm2 ;
   private short AV37AlbRAnc ;
   private short AV38AlbPml ;
   private short AV50AlbRTartC ;
   private short AV59MatC_ULin ;
   private short AV60AlbRecSec ;
   private short AV69AlbDndC ;
   private short AV71AlbDndCr ;
   private short AV72AlbGalga ;
   private short AV74AlbDmt ;
   private short AV81AlbUltP ;
   private short AV82Cod_mta ;
   private short Gx_err ;
   private int A6181AlbrPieC ;
   private int A4605AlbRPieLot ;
   private int A53AlbRPieReb ;
   private int A54AlbRPieUti ;
   private int A52AlbRPieEnt ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private int GIGXA0007 ;
   private int AV3AlbRecCod ;
   private int AV4CliCod ;
   private int AV8AlbRPieEnt ;
   private int AV14AlbRPieUti ;
   private int AV15AlbRPieReb ;
   private int AV33AlbRPieLot ;
   private int AV46AlbrPieC ;
   private java.math.BigDecimal A13243AlbRRTrans ;
   private java.math.BigDecimal A13242AlbRRLong ;
   private java.math.BigDecimal A13241AlbRPh ;
   private java.math.BigDecimal A8032AlbAncCr ;
   private java.math.BigDecimal A8030AlbAncC ;
   private java.math.BigDecimal A6523AlbRUdas ;
   private java.math.BigDecimal A6471AlbRUniB ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6180AlbrUniC ;
   private java.math.BigDecimal A5744AlbRAju ;
   private java.math.BigDecimal A5743AlbRPre ;
   private java.math.BigDecimal A4604AlbRUniLot ;
   private java.math.BigDecimal A4290AlbPmPPza ;
   private java.math.BigDecimal A59AlbRUniReb ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV12AlbRUniEnt ;
   private java.math.BigDecimal AV16AlbRUniUti ;
   private java.math.BigDecimal AV17AlbRUniReb ;
   private java.math.BigDecimal AV29AlbPmPPza ;
   private java.math.BigDecimal AV32AlbRUniLot ;
   private java.math.BigDecimal AV39AlbRPre ;
   private java.math.BigDecimal AV40AlbRAju ;
   private java.math.BigDecimal AV45AlbrUniC ;
   private java.math.BigDecimal AV53AlbRLu ;
   private java.math.BigDecimal AV54AlbRTara ;
   private java.math.BigDecimal AV55AlbRUniB ;
   private java.math.BigDecimal AV57AlbRUdas ;
   private java.math.BigDecimal AV68AlbAncC ;
   private java.math.BigDecimal AV70AlbAncCr ;
   private java.math.BigDecimal AV84AlbRPh ;
   private java.math.BigDecimal AV85AlbRRLong ;
   private java.math.BigDecimal AV86AlbRRTrans ;
   private String scmdbuf ;
   private String A12879AlbOEKOTEX ;
   private String A9794AlbOStj ;
   private String A9793AlbPdaC ;
   private String A9749Emp_Item1 ;
   private String A8835Bod_UltPz ;
   private String A8035AlbMaqTej ;
   private String A8029AlbNumM ;
   private String A8028AlbNumB ;
   private String A8027AlbHdri ;
   private String A8026AlbOC ;
   private String A8025AlbOpsC ;
   private String A8024AlbOpsT ;
   private String A8023AlbColor ;
   private String A6488AlbDocPrv ;
   private String A6464AlbRTelar ;
   private String A6463AlbRLote ;
   private String A6184AlbrCfop ;
   private String A6182AlbrNF ;
   private String A6178AlbrUsu ;
   private String A5806AlbREnt2 ;
   private String A4602AlbRMdlCod ;
   private String A4601AlbRTam ;
   private String A3613AlbRefDsc ;
   private String A3360AlbRImp ;
   private String A3359AlbRDisCli ;
   private String A1291AlbRDes ;
   private String A55AlbRReo ;
   private String A50AlbRLoc ;
   private String A56AlbRUni ;
   private String A46AlbREnt ;
   private String A45AlbRef ;
   private String A396EmprCod ;
   private String AV2EmprCod ;
   private String AV5AlbRef ;
   private String AV7AlbREnt ;
   private String AV9AlbRUni ;
   private String AV10AlbRLoc ;
   private String AV13AlbRReo ;
   private String AV22AlbRDes ;
   private String AV26AlbRDisCli ;
   private String AV27AlbRImp ;
   private String AV28AlbRefDsc ;
   private String AV30AlbRTam ;
   private String AV31AlbRMdlCod ;
   private String AV42AlbREnt2 ;
   private String AV43AlbrUsu ;
   private String AV47AlbrNF ;
   private String AV49AlbrCfop ;
   private String AV51AlbRLote ;
   private String AV52AlbRTelar ;
   private String AV56AlbDocPrv ;
   private String AV61AlbColor ;
   private String AV62AlbOpsT ;
   private String AV63AlbOpsC ;
   private String AV64AlbOC ;
   private String AV65AlbHdri ;
   private String AV66AlbNumB ;
   private String AV67AlbNumM ;
   private String AV73AlbMaqTej ;
   private String AV75Bod_UltPz ;
   private String AV76Emp_Item1 ;
   private String AV77AlbPdaC ;
   private String AV78AlbOStj ;
   private String AV83AlbOEKOTEX ;
   private String Gx_emsg ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date AV34AlbRHEn ;
   private java.util.Date AV44AlbrHor ;
   private java.util.Date A6183AlbrFeNf ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV11AlbRFen ;
   private java.util.Date AV18AlbRFecUlt ;
   private java.util.Date AV48AlbrFeNf ;
   private boolean n13243AlbRRTrans ;
   private boolean n13242AlbRRLong ;
   private boolean n13241AlbRPh ;
   private boolean n11361Cod_mta ;
   private boolean n10761AlbUltP ;
   private boolean n9749Emp_Item1 ;
   private boolean n8835Bod_UltPz ;
   private boolean n7501AlbRecSec ;
   private boolean n7114MatC_ULin ;
   private boolean n4792AlmCod ;
   private boolean n6263AlbRTartC ;
   private boolean n4295ClasCod ;
   private boolean n4606AlbRHEn ;
   private boolean n4605AlbRPieLot ;
   private boolean n4604AlbRUniLot ;
   private boolean n2183HisEmpULin ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean n840TrnCod ;
   private boolean nV6TrnCod ;
   private boolean nV20TipEntCod ;
   private boolean nV23ProceCod ;
   private boolean nV25HisEmpULin ;
   private boolean nV32AlbRUniLot ;
   private boolean nV33AlbRPieLot ;
   private boolean nV34AlbRHEn ;
   private boolean nV35ClasCod ;
   private boolean nV50AlbRTartC ;
   private boolean nV58AlmCod ;
   private boolean nV59MatC_ULin ;
   private boolean nV60AlbRecSec ;
   private boolean nV75Bod_UltPz ;
   private boolean nV81AlbUltP ;
   private boolean nV82Cod_mta ;
   private boolean nV84AlbRPh ;
   private boolean nV85AlbRRLong ;
   private boolean nV86AlbRRTrans ;
   private String A14525AlbRLot2 ;
   private String AV87AlbRLot2 ;
   private IDataStoreProvider pr_default ;
   private String[] TXPALBRECC2_A14525AlbRLot2 ;
   private java.math.BigDecimal[] TXPALBRECC2_A13243AlbRRTrans ;
   private boolean[] TXPALBRECC2_n13243AlbRRTrans ;
   private java.math.BigDecimal[] TXPALBRECC2_A13242AlbRRLong ;
   private boolean[] TXPALBRECC2_n13242AlbRRLong ;
   private java.math.BigDecimal[] TXPALBRECC2_A13241AlbRPh ;
   private boolean[] TXPALBRECC2_n13241AlbRPh ;
   private String[] TXPALBRECC2_A12879AlbOEKOTEX ;
   private short[] TXPALBRECC2_A11361Cod_mta ;
   private boolean[] TXPALBRECC2_n11361Cod_mta ;
   private short[] TXPALBRECC2_A10761AlbUltP ;
   private boolean[] TXPALBRECC2_n10761AlbUltP ;
   private byte[] TXPALBRECC2_A10358AlbTurno ;
   private byte[] TXPALBRECC2_A317AlbStLot ;
   private String[] TXPALBRECC2_A9794AlbOStj ;
   private String[] TXPALBRECC2_A9793AlbPdaC ;
   private String[] TXPALBRECC2_A9749Emp_Item1 ;
   private boolean[] TXPALBRECC2_n9749Emp_Item1 ;
   private String[] TXPALBRECC2_A8835Bod_UltPz ;
   private boolean[] TXPALBRECC2_n8835Bod_UltPz ;
   private short[] TXPALBRECC2_A8036AlbDmt ;
   private String[] TXPALBRECC2_A8035AlbMaqTej ;
   private short[] TXPALBRECC2_A8034AlbGalga ;
   private short[] TXPALBRECC2_A8033AlbDndCr ;
   private java.math.BigDecimal[] TXPALBRECC2_A8032AlbAncCr ;
   private short[] TXPALBRECC2_A8031AlbDndC ;
   private java.math.BigDecimal[] TXPALBRECC2_A8030AlbAncC ;
   private String[] TXPALBRECC2_A8029AlbNumM ;
   private String[] TXPALBRECC2_A8028AlbNumB ;
   private String[] TXPALBRECC2_A8027AlbHdri ;
   private String[] TXPALBRECC2_A8026AlbOC ;
   private String[] TXPALBRECC2_A8025AlbOpsC ;
   private String[] TXPALBRECC2_A8024AlbOpsT ;
   private String[] TXPALBRECC2_A8023AlbColor ;
   private short[] TXPALBRECC2_A7501AlbRecSec ;
   private boolean[] TXPALBRECC2_n7501AlbRecSec ;
   private short[] TXPALBRECC2_A7114MatC_ULin ;
   private boolean[] TXPALBRECC2_n7114MatC_ULin ;
   private byte[] TXPALBRECC2_A4792AlmCod ;
   private boolean[] TXPALBRECC2_n4792AlmCod ;
   private java.math.BigDecimal[] TXPALBRECC2_A6523AlbRUdas ;
   private String[] TXPALBRECC2_A6488AlbDocPrv ;
   private java.math.BigDecimal[] TXPALBRECC2_A6471AlbRUniB ;
   private java.math.BigDecimal[] TXPALBRECC2_A6470AlbRTara ;
   private java.math.BigDecimal[] TXPALBRECC2_A6465AlbRLu ;
   private String[] TXPALBRECC2_A6464AlbRTelar ;
   private String[] TXPALBRECC2_A6463AlbRLote ;
   private short[] TXPALBRECC2_A6263AlbRTartC ;
   private boolean[] TXPALBRECC2_n6263AlbRTartC ;
   private String[] TXPALBRECC2_A6184AlbrCfop ;
   private java.util.Date[] TXPALBRECC2_A6183AlbrFeNf ;
   private String[] TXPALBRECC2_A6182AlbrNF ;
   private int[] TXPALBRECC2_A6181AlbrPieC ;
   private java.math.BigDecimal[] TXPALBRECC2_A6180AlbrUniC ;
   private java.util.Date[] TXPALBRECC2_A6179AlbrHor ;
   private String[] TXPALBRECC2_A6178AlbrUsu ;
   private String[] TXPALBRECC2_A5806AlbREnt2 ;
   private byte[] TXPALBRECC2_A5745AlbRRep ;
   private java.math.BigDecimal[] TXPALBRECC2_A5744AlbRAju ;
   private java.math.BigDecimal[] TXPALBRECC2_A5743AlbRPre ;
   private short[] TXPALBRECC2_A4922AlbPml ;
   private short[] TXPALBRECC2_A4921AlbRAnc ;
   private short[] TXPALBRECC2_A4920AlbRGrm2 ;
   private short[] TXPALBRECC2_A4295ClasCod ;
   private boolean[] TXPALBRECC2_n4295ClasCod ;
   private java.util.Date[] TXPALBRECC2_A4606AlbRHEn ;
   private boolean[] TXPALBRECC2_n4606AlbRHEn ;
   private int[] TXPALBRECC2_A4605AlbRPieLot ;
   private boolean[] TXPALBRECC2_n4605AlbRPieLot ;
   private java.math.BigDecimal[] TXPALBRECC2_A4604AlbRUniLot ;
   private boolean[] TXPALBRECC2_n4604AlbRUniLot ;
   private String[] TXPALBRECC2_A4602AlbRMdlCod ;
   private String[] TXPALBRECC2_A4601AlbRTam ;
   private java.math.BigDecimal[] TXPALBRECC2_A4290AlbPmPPza ;
   private String[] TXPALBRECC2_A3613AlbRefDsc ;
   private String[] TXPALBRECC2_A3360AlbRImp ;
   private String[] TXPALBRECC2_A3359AlbRDisCli ;
   private short[] TXPALBRECC2_A2183HisEmpULin ;
   private boolean[] TXPALBRECC2_n2183HisEmpULin ;
   private byte[] TXPALBRECC2_A1301AlbRUlin ;
   private short[] TXPALBRECC2_A970ProceCod ;
   private boolean[] TXPALBRECC2_n970ProceCod ;
   private String[] TXPALBRECC2_A1291AlbRDes ;
   private short[] TXPALBRECC2_A1222AlbNumEti ;
   private short[] TXPALBRECC2_A1211TipEntCod ;
   private boolean[] TXPALBRECC2_n1211TipEntCod ;
   private byte[] TXPALBRECC2_A47AlbREst ;
   private java.util.Date[] TXPALBRECC2_A48AlbRFecUlt ;
   private java.math.BigDecimal[] TXPALBRECC2_A59AlbRUniReb ;
   private java.math.BigDecimal[] TXPALBRECC2_A60AlbRUniUti ;
   private int[] TXPALBRECC2_A53AlbRPieReb ;
   private int[] TXPALBRECC2_A54AlbRPieUti ;
   private String[] TXPALBRECC2_A55AlbRReo ;
   private java.math.BigDecimal[] TXPALBRECC2_A58AlbRUniEnt ;
   private java.util.Date[] TXPALBRECC2_A49AlbRFen ;
   private String[] TXPALBRECC2_A50AlbRLoc ;
   private String[] TXPALBRECC2_A56AlbRUni ;
   private int[] TXPALBRECC2_A52AlbRPieEnt ;
   private String[] TXPALBRECC2_A46AlbREnt ;
   private short[] TXPALBRECC2_A840TrnCod ;
   private boolean[] TXPALBRECC2_n840TrnCod ;
   private String[] TXPALBRECC2_A45AlbRef ;
   private int[] TXPALBRECC2_A252CliCod ;
   private int[] TXPALBRECC2_A44AlbRecCod ;
   private String[] TXPALBRECC2_A396EmprCod ;
}

final  class txpalbrecconversion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("TXPALBRECC2", "SELECT AlbRLot2, AlbRRTrans, AlbRRLong, AlbRPh, AlbOEKOTEX, Cod_mta, AlbUltP, AlbTurno, AlbStLot, AlbOStj, AlbPdaC, Emp_Item1, Bod_UltPz, AlbDmt, AlbMaqTej, AlbGalga, AlbDndCr, AlbAncCr, AlbDndC, AlbAncC, AlbNumM, AlbNumB, AlbHdri, AlbOC, AlbOpsC, AlbOpsT, AlbColor, AlbRecSec, MatC_ULin, AlmCod, AlbRUdas, AlbDocPrv, AlbRUniB, AlbRTara, AlbRLu, AlbRTelar, AlbRLote, AlbRTartC, AlbrCfop, AlbrFeNf, AlbrNF, AlbrPieC, AlbrUniC, AlbrHor, AlbrUsu, AlbREnt2, AlbRRep, AlbRAju, AlbRPre, AlbPml, AlbRAnc, AlbRGrm2, ClasCod, AlbRHEn, AlbRPieLot, AlbRUniLot, AlbRMdlCod, AlbRTam, AlbPmPPza, AlbRefDsc, AlbRImp, AlbRDisCli, HisEmpULin, AlbRUlin, ProceCod, AlbRDes, AlbNumEti, TipEntCod, AlbREst, AlbRFecUlt, AlbRUniReb, AlbRUniUti, AlbRPieReb, AlbRPieUti, AlbRReo, AlbRUniEnt, AlbRFen, AlbRLoc, AlbRUni, AlbRPieEnt, AlbREnt, TrnCod, AlbRef, CliCod, AlbRecCod, EmprCod FROM TXPALBREC ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("TXPALBRECC3", "INSERT INTO GXA0007(EmprCod, AlbRecCod, CliCod, AlbRef, TrnCod, AlbREnt, AlbRPieEnt, AlbRUni, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRReo, AlbRPieUti, AlbRPieReb, AlbRUniUti, AlbRUniReb, AlbRFecUlt, AlbREst, TipEntCod, AlbNumEti, AlbRDes, ProceCod, AlbRUlin, HisEmpULin, AlbRDisCli, AlbRImp, AlbRefDsc, AlbPmPPza, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, AlbRHEn, ClasCod, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRTartC, AlbRLote, AlbRTelar, AlbRLu, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlmCod, MatC_ULin, AlbRecSec, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, Bod_UltPz, Emp_Item1, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, AlbUltP, Cod_mta, AlbOEKOTEX, AlbRPh, AlbRRLong, AlbRRTrans, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "GXA0007")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((byte[]) buf[13])[0] = rslt.getByte(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 20);
               ((String[]) buf[15])[0] = rslt.getString(11, 20);
               ((String[]) buf[16])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(14);
               ((String[]) buf[21])[0] = rslt.getString(15, 12);
               ((short[]) buf[22])[0] = rslt.getShort(16);
               ((short[]) buf[23])[0] = rslt.getShort(17);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(18,2);
               ((short[]) buf[25])[0] = rslt.getShort(19);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[27])[0] = rslt.getString(21, 10);
               ((String[]) buf[28])[0] = rslt.getString(22, 20);
               ((String[]) buf[29])[0] = rslt.getString(23, 20);
               ((String[]) buf[30])[0] = rslt.getString(24, 12);
               ((String[]) buf[31])[0] = rslt.getString(25, 30);
               ((String[]) buf[32])[0] = rslt.getString(26, 30);
               ((String[]) buf[33])[0] = rslt.getString(27, 40);
               ((short[]) buf[34])[0] = rslt.getShort(28);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(29);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((byte[]) buf[38])[0] = rslt.getByte(30);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(31,2);
               ((String[]) buf[41])[0] = rslt.getString(32, 10);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(33,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(35,2);
               ((String[]) buf[45])[0] = rslt.getString(36, 20);
               ((String[]) buf[46])[0] = rslt.getString(37, 20);
               ((short[]) buf[47])[0] = rslt.getShort(38);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(39, 5);
               ((java.util.Date[]) buf[50])[0] = rslt.getGXDate(40);
               ((String[]) buf[51])[0] = rslt.getString(41, 1);
               ((int[]) buf[52])[0] = rslt.getInt(42);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(43,2);
               ((java.util.Date[]) buf[54])[0] = GXutil.resetDate(rslt.getGXDateTime(44));
               ((String[]) buf[55])[0] = rslt.getString(45, 10);
               ((String[]) buf[56])[0] = rslt.getString(46, 20);
               ((byte[]) buf[57])[0] = rslt.getByte(47);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(48,2);
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(49,5);
               ((short[]) buf[60])[0] = rslt.getShort(50);
               ((short[]) buf[61])[0] = rslt.getShort(51);
               ((short[]) buf[62])[0] = rslt.getShort(52);
               ((short[]) buf[63])[0] = rslt.getShort(53);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[65])[0] = rslt.getGXDateTime(54);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((int[]) buf[67])[0] = rslt.getInt(55);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(56,2);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(57, 13);
               ((String[]) buf[72])[0] = rslt.getString(58, 4);
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(59,3);
               ((String[]) buf[74])[0] = rslt.getString(60, 26);
               ((String[]) buf[75])[0] = rslt.getString(61, 1);
               ((String[]) buf[76])[0] = rslt.getString(62, 20);
               ((short[]) buf[77])[0] = rslt.getShort(63);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((byte[]) buf[79])[0] = rslt.getByte(64);
               ((short[]) buf[80])[0] = rslt.getShort(65);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(66, 20);
               ((short[]) buf[83])[0] = rslt.getShort(67);
               ((short[]) buf[84])[0] = rslt.getShort(68);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((byte[]) buf[86])[0] = rslt.getByte(69);
               ((java.util.Date[]) buf[87])[0] = rslt.getGXDate(70);
               ((java.math.BigDecimal[]) buf[88])[0] = rslt.getBigDecimal(71,2);
               ((java.math.BigDecimal[]) buf[89])[0] = rslt.getBigDecimal(72,2);
               ((int[]) buf[90])[0] = rslt.getInt(73);
               ((int[]) buf[91])[0] = rslt.getInt(74);
               ((String[]) buf[92])[0] = rslt.getString(75, 2);
               ((java.math.BigDecimal[]) buf[93])[0] = rslt.getBigDecimal(76,2);
               ((java.util.Date[]) buf[94])[0] = rslt.getGXDate(77);
               ((String[]) buf[95])[0] = rslt.getString(78, 10);
               ((String[]) buf[96])[0] = rslt.getString(79, 1);
               ((int[]) buf[97])[0] = rslt.getInt(80);
               ((String[]) buf[98])[0] = rslt.getString(81, 8);
               ((short[]) buf[99])[0] = rslt.getShort(82);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(83, 16);
               ((int[]) buf[102])[0] = rslt.getInt(84);
               ((int[]) buf[103])[0] = rslt.getInt(85);
               ((String[]) buf[104])[0] = rslt.getString(86, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               stmt.setString(6, (String)parms[6], 8);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setString(8, (String)parms[8], 1);
               stmt.setString(9, (String)parms[9], 10);
               stmt.setDate(10, (java.util.Date)parms[10]);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               stmt.setString(12, (String)parms[12], 2);
               stmt.setInt(13, ((Number) parms[13]).intValue());
               stmt.setInt(14, ((Number) parms[14]).intValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 2);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[16], 2);
               stmt.setDate(17, (java.util.Date)parms[17]);
               stmt.setByte(18, ((Number) parms[18]).byteValue());
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[20]).shortValue());
               }
               stmt.setShort(20, ((Number) parms[21]).shortValue());
               stmt.setString(21, (String)parms[22], 20);
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[24]).shortValue());
               }
               stmt.setByte(23, ((Number) parms[25]).byteValue());
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(24, ((Number) parms[27]).shortValue());
               }
               stmt.setString(25, (String)parms[28], 20);
               stmt.setString(26, (String)parms[29], 1);
               stmt.setString(27, (String)parms[30], 26);
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[31], 3);
               stmt.setString(29, (String)parms[32], 4);
               stmt.setString(30, (String)parms[33], 13);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(32, ((Number) parms[37]).intValue());
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
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[41]).shortValue());
               }
               stmt.setShort(35, ((Number) parms[42]).shortValue());
               stmt.setShort(36, ((Number) parms[43]).shortValue());
               stmt.setShort(37, ((Number) parms[44]).shortValue());
               stmt.setBigDecimal(38, (java.math.BigDecimal)parms[45], 5);
               stmt.setBigDecimal(39, (java.math.BigDecimal)parms[46], 2);
               stmt.setByte(40, ((Number) parms[47]).byteValue());
               stmt.setString(41, (String)parms[48], 20);
               stmt.setString(42, (String)parms[49], 10);
               stmt.setDateTime(43, (java.util.Date)parms[50], true);
               stmt.setBigDecimal(44, (java.math.BigDecimal)parms[51], 2);
               stmt.setInt(45, ((Number) parms[52]).intValue());
               stmt.setString(46, (String)parms[53], 1);
               stmt.setDate(47, (java.util.Date)parms[54]);
               stmt.setString(48, (String)parms[55], 5);
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(49, ((Number) parms[57]).shortValue());
               }
               stmt.setString(50, (String)parms[58], 20);
               stmt.setString(51, (String)parms[59], 20);
               stmt.setBigDecimal(52, (java.math.BigDecimal)parms[60], 2);
               stmt.setBigDecimal(53, (java.math.BigDecimal)parms[61], 2);
               stmt.setBigDecimal(54, (java.math.BigDecimal)parms[62], 2);
               stmt.setString(55, (String)parms[63], 10);
               stmt.setBigDecimal(56, (java.math.BigDecimal)parms[64], 2);
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(57, ((Number) parms[66]).byteValue());
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(58, ((Number) parms[68]).shortValue());
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(59, ((Number) parms[70]).shortValue());
               }
               stmt.setString(60, (String)parms[71], 40);
               stmt.setString(61, (String)parms[72], 30);
               stmt.setString(62, (String)parms[73], 30);
               stmt.setString(63, (String)parms[74], 12);
               stmt.setString(64, (String)parms[75], 20);
               stmt.setString(65, (String)parms[76], 20);
               stmt.setString(66, (String)parms[77], 10);
               stmt.setBigDecimal(67, (java.math.BigDecimal)parms[78], 2);
               stmt.setShort(68, ((Number) parms[79]).shortValue());
               stmt.setBigDecimal(69, (java.math.BigDecimal)parms[80], 2);
               stmt.setShort(70, ((Number) parms[81]).shortValue());
               stmt.setShort(71, ((Number) parms[82]).shortValue());
               stmt.setString(72, (String)parms[83], 12);
               stmt.setShort(73, ((Number) parms[84]).shortValue());
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 74 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(74, (String)parms[86], 1);
               }
               stmt.setString(75, (String)parms[87], 1);
               stmt.setString(76, (String)parms[88], 20);
               stmt.setString(77, (String)parms[89], 20);
               stmt.setByte(78, ((Number) parms[90]).byteValue());
               stmt.setByte(79, ((Number) parms[91]).byteValue());
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 80 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(80, ((Number) parms[93]).shortValue());
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 81 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(81, ((Number) parms[95]).shortValue());
               }
               stmt.setString(82, (String)parms[96], 1);
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 83 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(83, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(84, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(85, (java.math.BigDecimal)parms[102], 2);
               }
               stmt.setVarchar(86, (String)parms[103], 60, false);
               return;
      }
   }

}

