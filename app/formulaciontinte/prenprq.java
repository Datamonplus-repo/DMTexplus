package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prenprq extends GXProcedure
{
   public prenprq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prenprq.class ), "" );
   }

   public prenprq( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      prenprq.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      prenprq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prenprq.this.AV16Proforcod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV20Lavanderia ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int2) ;
      prenprq.this.GXt_int1 = GXv_int2[0] ;
      AV20Lavanderia = GXt_int1 ;
      AV19Proforlin = (short)(0) ;
      /* Using cursor P02EQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV16Proforcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A773ProForUli = P02EQ2_A773ProForUli[0] ;
         A764ProForCod = P02EQ2_A764ProForCod[0] ;
         A13936ProForRs = P02EQ2_A13936ProForRs[0] ;
         A13133ProForAct = P02EQ2_A13133ProForAct[0] ;
         A12109ProNh2o = P02EQ2_A12109ProNh2o[0] ;
         n12109ProNh2o = P02EQ2_n12109ProNh2o[0] ;
         A3589ProForMer = P02EQ2_A3589ProForMer[0] ;
         A10547ProH2O = P02EQ2_A10547ProH2O[0] ;
         A10120ProforVl = P02EQ2_A10120ProforVl[0] ;
         A8528ProForCos = P02EQ2_A8528ProForCos[0] ;
         A8527ProForAbs = P02EQ2_A8527ProForAbs[0] ;
         A6877ProForPhn = P02EQ2_A6877ProForPhn[0] ;
         n6877ProForPhn = P02EQ2_n6877ProForPhn[0] ;
         A6876ProForPhx = P02EQ2_A6876ProForPhx[0] ;
         n6876ProForPhx = P02EQ2_n6876ProForPhx[0] ;
         A6610ProForCol = P02EQ2_A6610ProForCol[0] ;
         n6610ProForCol = P02EQ2_n6610ProForCol[0] ;
         A6061ProForLab = P02EQ2_A6061ProForLab[0] ;
         A6018ProForFab = P02EQ2_A6018ProForFab[0] ;
         n6018ProForFab = P02EQ2_n6018ProForFab[0] ;
         A5523ProForTip = P02EQ2_A5523ProForTip[0] ;
         A5436IntCodF2 = P02EQ2_A5436IntCodF2[0] ;
         n5436IntCodF2 = P02EQ2_n5436IntCodF2[0] ;
         A5465ProForFac = P02EQ2_A5465ProForFac[0] ;
         n5465ProForFac = P02EQ2_n5465ProForFac[0] ;
         A5190ProFoLCU = P02EQ2_A5190ProFoLCU[0] ;
         n5190ProFoLCU = P02EQ2_n5190ProFoLCU[0] ;
         A4865ProForDCi = P02EQ2_A4865ProForDCi[0] ;
         A4864ProForCCi = P02EQ2_A4864ProForCCi[0] ;
         A4715ProForDsc2 = P02EQ2_A4715ProForDsc2[0] ;
         A4706ProForRb = P02EQ2_A4706ProForRb[0] ;
         A4705ProForPau = P02EQ2_A4705ProForPau[0] ;
         A4586ProForObs = P02EQ2_A4586ProForObs[0] ;
         n4586ProForObs = P02EQ2_n4586ProForObs[0] ;
         A3005ProRev = P02EQ2_A3005ProRev[0] ;
         A2393ProNumRec = P02EQ2_A2393ProNumRec[0] ;
         A2392ProNumPro = P02EQ2_A2392ProNumPro[0] ;
         A674PorForFul = P02EQ2_A674PorForFul[0] ;
         A769ProForMat = P02EQ2_A769ProForMat[0] ;
         A772ProForTmx = P02EQ2_A772ProForTmx[0] ;
         A771ProForTie = P02EQ2_A771ProForTie[0] ;
         A766ProForDsc = P02EQ2_A766ProForDsc[0] ;
         W396EmprCod = A396EmprCod ;
         W764ProForCod = A764ProForCod ;
         AV15ProDes = "@" ;
         /*
            INSERT RECORD ON TABLE TXPCPROFO

         */
         W396EmprCod = A396EmprCod ;
         W764ProForCod = A764ProForCod ;
         W766ProForDsc = A766ProForDsc ;
         W771ProForTie = A771ProForTie ;
         W772ProForTmx = A772ProForTmx ;
         W769ProForMat = A769ProForMat ;
         W674PorForFul = A674PorForFul ;
         W773ProForUli = A773ProForUli ;
         W2392ProNumPro = A2392ProNumPro ;
         W2393ProNumRec = A2393ProNumRec ;
         W3005ProRev = A3005ProRev ;
         W3589ProForMer = A3589ProForMer ;
         W4705ProForPau = A4705ProForPau ;
         W4715ProForDsc2 = A4715ProForDsc2 ;
         W4706ProForRb = A4706ProForRb ;
         W4586ProForObs = A4586ProForObs ;
         n4586ProForObs = false ;
         W4865ProForDCi = A4865ProForDCi ;
         W4864ProForCCi = A4864ProForCCi ;
         W5190ProFoLCU = A5190ProFoLCU ;
         n5190ProFoLCU = false ;
         W5465ProForFac = A5465ProForFac ;
         n5465ProForFac = false ;
         W5523ProForTip = A5523ProForTip ;
         W5436IntCodF2 = A5436IntCodF2 ;
         n5436IntCodF2 = false ;
         W6018ProForFab = A6018ProForFab ;
         n6018ProForFab = false ;
         W6061ProForLab = A6061ProForLab ;
         A764ProForCod = AV15ProDes ;
         A773ProForUli = (short)(0) ;
         n4586ProForObs = false ;
         n5190ProFoLCU = false ;
         n5465ProForFac = false ;
         n5436IntCodF2 = false ;
         n6018ProForFab = false ;
         /* Using cursor P02EQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A764ProForCod, A766ProForDsc, Short.valueOf(A771ProForTie), Short.valueOf(A772ProForTmx), A769ProForMat, A674PorForFul, Short.valueOf(A773ProForUli), Integer.valueOf(A2392ProNumPro), Integer.valueOf(A2393ProNumRec), A3005ProRev, Boolean.valueOf(n4586ProForObs), A4586ProForObs, Short.valueOf(A4705ProForPau), Short.valueOf(A4706ProForRb), A4715ProForDsc2, A4864ProForCCi, A4865ProForDCi, Boolean.valueOf(n5190ProFoLCU), Short.valueOf(A5190ProFoLCU), Boolean.valueOf(n5465ProForFac), A5465ProForFac, Boolean.valueOf(n5436IntCodF2), Short.valueOf(A5436IntCodF2), A5523ProForTip, Boolean.valueOf(n6018ProForFab), A6018ProForFab, A6061ProForLab, Boolean.valueOf(n6610ProForCol), A6610ProForCol, Boolean.valueOf(n6876ProForPhx), A6876ProForPhx, Boolean.valueOf(n6877ProForPhn), A6877ProForPhn, A8527ProForAbs, A8528ProForCos, Integer.valueOf(A10120ProforVl), Short.valueOf(A10547ProH2O), A3589ProForMer, Boolean.valueOf(n12109ProNh2o), Short.valueOf(A12109ProNh2o), A13133ProForAct, A13936ProForRs});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
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
         A764ProForCod = W764ProForCod ;
         A766ProForDsc = W766ProForDsc ;
         A771ProForTie = W771ProForTie ;
         A772ProForTmx = W772ProForTmx ;
         A769ProForMat = W769ProForMat ;
         A674PorForFul = W674PorForFul ;
         A773ProForUli = W773ProForUli ;
         A2392ProNumPro = W2392ProNumPro ;
         A2393ProNumRec = W2393ProNumRec ;
         A3005ProRev = W3005ProRev ;
         A3589ProForMer = W3589ProForMer ;
         A4705ProForPau = W4705ProForPau ;
         A4715ProForDsc2 = W4715ProForDsc2 ;
         A4706ProForRb = W4706ProForRb ;
         A4586ProForObs = W4586ProForObs ;
         n4586ProForObs = false ;
         A4865ProForDCi = W4865ProForDCi ;
         A4864ProForCCi = W4864ProForCCi ;
         A5190ProFoLCU = W5190ProFoLCU ;
         n5190ProFoLCU = false ;
         A5465ProForFac = W5465ProForFac ;
         n5465ProForFac = false ;
         A5523ProForTip = W5523ProForTip ;
         A5436IntCodF2 = W5436IntCodF2 ;
         n5436IntCodF2 = false ;
         A6018ProForFab = W6018ProForFab ;
         n6018ProForFab = false ;
         A6061ProForLab = W6061ProForLab ;
         /* End Insert */
         /* Using cursor P02EQ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A767ProForLin = P02EQ4_A767ProForLin[0] ;
            A13111ProForDe2 = P02EQ4_A13111ProForDe2[0] ;
            A13178ProForFT = P02EQ4_A13178ProForFT[0] ;
            A765ProForDes = P02EQ4_A765ProForDes[0] ;
            A6062ProForCPo = P02EQ4_A6062ProForCPo[0] ;
            A5358ProForClv = P02EQ4_A5358ProForClv[0] ;
            A3379ProForTnq = P02EQ4_A3379ProForTnq[0] ;
            A1645ProForNro = P02EQ4_A1645ProForNro[0] ;
            A763ProForCla = P02EQ4_A763ProForCla[0] ;
            A762ProForCan = P02EQ4_A762ProForCan[0] ;
            A490ForPrdUMe = P02EQ4_A490ForPrdUMe[0] ;
            A770ProForPrd = P02EQ4_A770ProForPrd[0] ;
            W396EmprCod = A396EmprCod ;
            W764ProForCod = A764ProForCod ;
            if ( AV20Lavanderia == 0 )
            {
               AV19Proforlin = (short)(AV19Proforlin+100) ;
            }
            else
            {
               AV19Proforlin = (short)(AV19Proforlin+10) ;
            }
            /*
               INSERT RECORD ON TABLE TXPLPROFO

            */
            W396EmprCod = A396EmprCod ;
            W764ProForCod = A764ProForCod ;
            W767ProForLin = A767ProForLin ;
            W770ProForPrd = A770ProForPrd ;
            W765ProForDes = A765ProForDes ;
            W490ForPrdUMe = A490ForPrdUMe ;
            W762ProForCan = A762ProForCan ;
            W1645ProForNro = A1645ProForNro ;
            W3379ProForTnq = A3379ProForTnq ;
            W5358ProForClv = A5358ProForClv ;
            W6062ProForCPo = A6062ProForCPo ;
            A764ProForCod = AV15ProDes ;
            A767ProForLin = AV19Proforlin ;
            /* Using cursor P02EQ5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin), A770ProForPrd, Byte.valueOf(A490ForPrdUMe), A762ProForCan, A763ProForCla, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A5358ProForClv, A6062ProForCPo, A765ProForDes, A13178ProForFT, A13111ProForDe2});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
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
            A396EmprCod = W396EmprCod ;
            A764ProForCod = W764ProForCod ;
            A767ProForLin = W767ProForLin ;
            A770ProForPrd = W770ProForPrd ;
            A765ProForDes = W765ProForDes ;
            A490ForPrdUMe = W490ForPrdUMe ;
            A762ProForCan = W762ProForCan ;
            A1645ProForNro = W1645ProForNro ;
            A3379ProForTnq = W3379ProForTnq ;
            A5358ProForClv = W5358ProForClv ;
            A6062ProForCPo = W6062ProForCPo ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A764ProForCod = W764ProForCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         A396EmprCod = W396EmprCod ;
         A764ProForCod = W764ProForCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02EQ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV16Proforcod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A764ProForCod = P02EQ6_A764ProForCod[0] ;
         /* Optimized DELETE. */
         /* Using cursor P02EQ7 */
         pr_default.execute(5, new Object[] {A396EmprCod, A764ProForCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
         /* End optimized DELETE. */
         /* Using cursor P02EQ8 */
         pr_default.execute(6, new Object[] {A396EmprCod, A764ProForCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.prenprq");
      /* Using cursor P02EQ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV15ProDes});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A773ProForUli = P02EQ9_A773ProForUli[0] ;
         A764ProForCod = P02EQ9_A764ProForCod[0] ;
         A13936ProForRs = P02EQ9_A13936ProForRs[0] ;
         A13133ProForAct = P02EQ9_A13133ProForAct[0] ;
         A12109ProNh2o = P02EQ9_A12109ProNh2o[0] ;
         n12109ProNh2o = P02EQ9_n12109ProNh2o[0] ;
         A3589ProForMer = P02EQ9_A3589ProForMer[0] ;
         A10547ProH2O = P02EQ9_A10547ProH2O[0] ;
         A10120ProforVl = P02EQ9_A10120ProforVl[0] ;
         A8528ProForCos = P02EQ9_A8528ProForCos[0] ;
         A8527ProForAbs = P02EQ9_A8527ProForAbs[0] ;
         A6877ProForPhn = P02EQ9_A6877ProForPhn[0] ;
         n6877ProForPhn = P02EQ9_n6877ProForPhn[0] ;
         A6876ProForPhx = P02EQ9_A6876ProForPhx[0] ;
         n6876ProForPhx = P02EQ9_n6876ProForPhx[0] ;
         A6610ProForCol = P02EQ9_A6610ProForCol[0] ;
         n6610ProForCol = P02EQ9_n6610ProForCol[0] ;
         A6061ProForLab = P02EQ9_A6061ProForLab[0] ;
         A6018ProForFab = P02EQ9_A6018ProForFab[0] ;
         n6018ProForFab = P02EQ9_n6018ProForFab[0] ;
         A5523ProForTip = P02EQ9_A5523ProForTip[0] ;
         A5436IntCodF2 = P02EQ9_A5436IntCodF2[0] ;
         n5436IntCodF2 = P02EQ9_n5436IntCodF2[0] ;
         A5465ProForFac = P02EQ9_A5465ProForFac[0] ;
         n5465ProForFac = P02EQ9_n5465ProForFac[0] ;
         A5190ProFoLCU = P02EQ9_A5190ProFoLCU[0] ;
         n5190ProFoLCU = P02EQ9_n5190ProFoLCU[0] ;
         A4865ProForDCi = P02EQ9_A4865ProForDCi[0] ;
         A4864ProForCCi = P02EQ9_A4864ProForCCi[0] ;
         A4715ProForDsc2 = P02EQ9_A4715ProForDsc2[0] ;
         A4706ProForRb = P02EQ9_A4706ProForRb[0] ;
         A4705ProForPau = P02EQ9_A4705ProForPau[0] ;
         A4586ProForObs = P02EQ9_A4586ProForObs[0] ;
         n4586ProForObs = P02EQ9_n4586ProForObs[0] ;
         A3005ProRev = P02EQ9_A3005ProRev[0] ;
         A2393ProNumRec = P02EQ9_A2393ProNumRec[0] ;
         A2392ProNumPro = P02EQ9_A2392ProNumPro[0] ;
         A674PorForFul = P02EQ9_A674PorForFul[0] ;
         A769ProForMat = P02EQ9_A769ProForMat[0] ;
         A772ProForTmx = P02EQ9_A772ProForTmx[0] ;
         A771ProForTie = P02EQ9_A771ProForTie[0] ;
         A766ProForDsc = P02EQ9_A766ProForDsc[0] ;
         W396EmprCod = A396EmprCod ;
         W764ProForCod = A764ProForCod ;
         /*
            INSERT RECORD ON TABLE TXPCPROFO

         */
         W396EmprCod = A396EmprCod ;
         W764ProForCod = A764ProForCod ;
         W766ProForDsc = A766ProForDsc ;
         W771ProForTie = A771ProForTie ;
         W772ProForTmx = A772ProForTmx ;
         W769ProForMat = A769ProForMat ;
         W674PorForFul = A674PorForFul ;
         W773ProForUli = A773ProForUli ;
         W2392ProNumPro = A2392ProNumPro ;
         W2393ProNumRec = A2393ProNumRec ;
         W3005ProRev = A3005ProRev ;
         W3589ProForMer = A3589ProForMer ;
         W4705ProForPau = A4705ProForPau ;
         W4715ProForDsc2 = A4715ProForDsc2 ;
         W4706ProForRb = A4706ProForRb ;
         W4586ProForObs = A4586ProForObs ;
         n4586ProForObs = false ;
         W4865ProForDCi = A4865ProForDCi ;
         W4864ProForCCi = A4864ProForCCi ;
         W5190ProFoLCU = A5190ProFoLCU ;
         n5190ProFoLCU = false ;
         W5465ProForFac = A5465ProForFac ;
         n5465ProForFac = false ;
         W5523ProForTip = A5523ProForTip ;
         W5436IntCodF2 = A5436IntCodF2 ;
         n5436IntCodF2 = false ;
         W6018ProForFab = A6018ProForFab ;
         n6018ProForFab = false ;
         W6061ProForLab = A6061ProForLab ;
         A764ProForCod = AV16Proforcod ;
         A773ProForUli = AV19Proforlin ;
         n4586ProForObs = false ;
         n5190ProFoLCU = false ;
         n5465ProForFac = false ;
         n5436IntCodF2 = false ;
         n6018ProForFab = false ;
         /* Using cursor P02EQ10 */
         pr_default.execute(8, new Object[] {A396EmprCod, A764ProForCod, A766ProForDsc, Short.valueOf(A771ProForTie), Short.valueOf(A772ProForTmx), A769ProForMat, A674PorForFul, Short.valueOf(A773ProForUli), Integer.valueOf(A2392ProNumPro), Integer.valueOf(A2393ProNumRec), A3005ProRev, Boolean.valueOf(n4586ProForObs), A4586ProForObs, Short.valueOf(A4705ProForPau), Short.valueOf(A4706ProForRb), A4715ProForDsc2, A4864ProForCCi, A4865ProForDCi, Boolean.valueOf(n5190ProFoLCU), Short.valueOf(A5190ProFoLCU), Boolean.valueOf(n5465ProForFac), A5465ProForFac, Boolean.valueOf(n5436IntCodF2), Short.valueOf(A5436IntCodF2), A5523ProForTip, Boolean.valueOf(n6018ProForFab), A6018ProForFab, A6061ProForLab, Boolean.valueOf(n6610ProForCol), A6610ProForCol, Boolean.valueOf(n6876ProForPhx), A6876ProForPhx, Boolean.valueOf(n6877ProForPhn), A6877ProForPhn, A8527ProForAbs, A8528ProForCos, Integer.valueOf(A10120ProforVl), Short.valueOf(A10547ProH2O), A3589ProForMer, Boolean.valueOf(n12109ProNh2o), Short.valueOf(A12109ProNh2o), A13133ProForAct, A13936ProForRs});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
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
         A764ProForCod = W764ProForCod ;
         A766ProForDsc = W766ProForDsc ;
         A771ProForTie = W771ProForTie ;
         A772ProForTmx = W772ProForTmx ;
         A769ProForMat = W769ProForMat ;
         A674PorForFul = W674PorForFul ;
         A773ProForUli = W773ProForUli ;
         A2392ProNumPro = W2392ProNumPro ;
         A2393ProNumRec = W2393ProNumRec ;
         A3005ProRev = W3005ProRev ;
         A3589ProForMer = W3589ProForMer ;
         A4705ProForPau = W4705ProForPau ;
         A4715ProForDsc2 = W4715ProForDsc2 ;
         A4706ProForRb = W4706ProForRb ;
         A4586ProForObs = W4586ProForObs ;
         n4586ProForObs = false ;
         A4865ProForDCi = W4865ProForDCi ;
         A4864ProForCCi = W4864ProForCCi ;
         A5190ProFoLCU = W5190ProFoLCU ;
         n5190ProFoLCU = false ;
         A5465ProForFac = W5465ProForFac ;
         n5465ProForFac = false ;
         A5523ProForTip = W5523ProForTip ;
         A5436IntCodF2 = W5436IntCodF2 ;
         n5436IntCodF2 = false ;
         A6018ProForFab = W6018ProForFab ;
         n6018ProForFab = false ;
         A6061ProForLab = W6061ProForLab ;
         /* End Insert */
         /* Using cursor P02EQ11 */
         pr_default.execute(9, new Object[] {A396EmprCod, A764ProForCod});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A13111ProForDe2 = P02EQ11_A13111ProForDe2[0] ;
            A13178ProForFT = P02EQ11_A13178ProForFT[0] ;
            A765ProForDes = P02EQ11_A765ProForDes[0] ;
            A6062ProForCPo = P02EQ11_A6062ProForCPo[0] ;
            A5358ProForClv = P02EQ11_A5358ProForClv[0] ;
            A3379ProForTnq = P02EQ11_A3379ProForTnq[0] ;
            A1645ProForNro = P02EQ11_A1645ProForNro[0] ;
            A763ProForCla = P02EQ11_A763ProForCla[0] ;
            A762ProForCan = P02EQ11_A762ProForCan[0] ;
            A490ForPrdUMe = P02EQ11_A490ForPrdUMe[0] ;
            A770ProForPrd = P02EQ11_A770ProForPrd[0] ;
            A767ProForLin = P02EQ11_A767ProForLin[0] ;
            W396EmprCod = A396EmprCod ;
            W764ProForCod = A764ProForCod ;
            /*
               INSERT RECORD ON TABLE TXPLPROFO

            */
            W396EmprCod = A396EmprCod ;
            W764ProForCod = A764ProForCod ;
            W767ProForLin = A767ProForLin ;
            W770ProForPrd = A770ProForPrd ;
            W765ProForDes = A765ProForDes ;
            W490ForPrdUMe = A490ForPrdUMe ;
            W762ProForCan = A762ProForCan ;
            W1645ProForNro = A1645ProForNro ;
            W3379ProForTnq = A3379ProForTnq ;
            W5358ProForClv = A5358ProForClv ;
            W6062ProForCPo = A6062ProForCPo ;
            A764ProForCod = AV16Proforcod ;
            /* Using cursor P02EQ12 */
            pr_default.execute(10, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin), A770ProForPrd, Byte.valueOf(A490ForPrdUMe), A762ProForCan, A763ProForCla, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A5358ProForClv, A6062ProForCPo, A765ProForDes, A13178ProForFT, A13111ProForDe2});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
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
            A764ProForCod = W764ProForCod ;
            A767ProForLin = W767ProForLin ;
            A770ProForPrd = W770ProForPrd ;
            A765ProForDes = W765ProForDes ;
            A490ForPrdUMe = W490ForPrdUMe ;
            A762ProForCan = W762ProForCan ;
            A1645ProForNro = W1645ProForNro ;
            A3379ProForTnq = W3379ProForTnq ;
            A5358ProForClv = W5358ProForClv ;
            A6062ProForCPo = W6062ProForCPo ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            A764ProForCod = W764ProForCod ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         A396EmprCod = W396EmprCod ;
         A764ProForCod = W764ProForCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.prenprq");
      /* Using cursor P02EQ13 */
      pr_default.execute(11, new Object[] {A396EmprCod, AV15ProDes});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A764ProForCod = P02EQ13_A764ProForCod[0] ;
         /* Optimized DELETE. */
         /* Using cursor P02EQ14 */
         pr_default.execute(12, new Object[] {A396EmprCod, A764ProForCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
         /* End optimized DELETE. */
         /* Using cursor P02EQ15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A764ProForCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prenprq.this.A396EmprCod;
      this.aP1[0] = prenprq.this.AV16Proforcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.prenprq");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P02EQ2_A396EmprCod = new String[] {""} ;
      P02EQ2_A773ProForUli = new short[1] ;
      P02EQ2_A764ProForCod = new String[] {""} ;
      P02EQ2_A13936ProForRs = new String[] {""} ;
      P02EQ2_A13133ProForAct = new String[] {""} ;
      P02EQ2_A12109ProNh2o = new short[1] ;
      P02EQ2_n12109ProNh2o = new boolean[] {false} ;
      P02EQ2_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EQ2_A10547ProH2O = new short[1] ;
      P02EQ2_A10120ProforVl = new int[1] ;
      P02EQ2_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EQ2_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EQ2_A6877ProForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EQ2_n6877ProForPhn = new boolean[] {false} ;
      P02EQ2_A6876ProForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EQ2_n6876ProForPhx = new boolean[] {false} ;
      P02EQ2_A6610ProForCol = new String[] {""} ;
      P02EQ2_n6610ProForCol = new boolean[] {false} ;
      P02EQ2_A6061ProForLab = new String[] {""} ;
      P02EQ2_A6018ProForFab = new String[] {""} ;
      P02EQ2_n6018ProForFab = new boolean[] {false} ;
      P02EQ2_A5523ProForTip = new String[] {""} ;
      P02EQ2_A5436IntCodF2 = new short[1] ;
      P02EQ2_n5436IntCodF2 = new boolean[] {false} ;
      P02EQ2_A5465ProForFac = new String[] {""} ;
      P02EQ2_n5465ProForFac = new boolean[] {false} ;
      P02EQ2_A5190ProFoLCU = new short[1] ;
      P02EQ2_n5190ProFoLCU = new boolean[] {false} ;
      P02EQ2_A4865ProForDCi = new String[] {""} ;
      P02EQ2_A4864ProForCCi = new String[] {""} ;
      P02EQ2_A4715ProForDsc2 = new String[] {""} ;
      P02EQ2_A4706ProForRb = new short[1] ;
      P02EQ2_A4705ProForPau = new short[1] ;
      P02EQ2_A4586ProForObs = new String[] {""} ;
      P02EQ2_n4586ProForObs = new boolean[] {false} ;
      P02EQ2_A3005ProRev = new String[] {""} ;
      P02EQ2_A2393ProNumRec = new int[1] ;
      P02EQ2_A2392ProNumPro = new int[1] ;
      P02EQ2_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      P02EQ2_A769ProForMat = new String[] {""} ;
      P02EQ2_A772ProForTmx = new short[1] ;
      P02EQ2_A771ProForTie = new short[1] ;
      P02EQ2_A766ProForDsc = new String[] {""} ;
      A764ProForCod = "" ;
      A13936ProForRs = "" ;
      A13133ProForAct = "" ;
      A3589ProForMer = DecimalUtil.ZERO ;
      A8528ProForCos = DecimalUtil.ZERO ;
      A8527ProForAbs = DecimalUtil.ZERO ;
      A6877ProForPhn = DecimalUtil.ZERO ;
      A6876ProForPhx = DecimalUtil.ZERO ;
      A6610ProForCol = "" ;
      A6061ProForLab = "" ;
      A6018ProForFab = "" ;
      A5523ProForTip = "" ;
      A5465ProForFac = "" ;
      A4865ProForDCi = "" ;
      A4864ProForCCi = "" ;
      A4715ProForDsc2 = "" ;
      A4586ProForObs = "" ;
      A3005ProRev = "" ;
      A674PorForFul = GXutil.nullDate() ;
      A769ProForMat = "" ;
      A766ProForDsc = "" ;
      W396EmprCod = "" ;
      W764ProForCod = "" ;
      AV15ProDes = "" ;
      W766ProForDsc = "" ;
      W769ProForMat = "" ;
      W674PorForFul = GXutil.nullDate() ;
      W3005ProRev = "" ;
      W3589ProForMer = DecimalUtil.ZERO ;
      W4715ProForDsc2 = "" ;
      W4586ProForObs = "" ;
      W4865ProForDCi = "" ;
      W4864ProForCCi = "" ;
      W5465ProForFac = "" ;
      W5523ProForTip = "" ;
      W6018ProForFab = "" ;
      W6061ProForLab = "" ;
      Gx_emsg = "" ;
      P02EQ4_A396EmprCod = new String[] {""} ;
      P02EQ4_A764ProForCod = new String[] {""} ;
      P02EQ4_A767ProForLin = new short[1] ;
      P02EQ4_A13111ProForDe2 = new String[] {""} ;
      P02EQ4_A13178ProForFT = new String[] {""} ;
      P02EQ4_A765ProForDes = new String[] {""} ;
      P02EQ4_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EQ4_A5358ProForClv = new String[] {""} ;
      P02EQ4_A3379ProForTnq = new byte[1] ;
      P02EQ4_A1645ProForNro = new byte[1] ;
      P02EQ4_A763ProForCla = new String[] {""} ;
      P02EQ4_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EQ4_A490ForPrdUMe = new byte[1] ;
      P02EQ4_A770ProForPrd = new String[] {""} ;
      A13111ProForDe2 = "" ;
      A13178ProForFT = "" ;
      A765ProForDes = "" ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      A5358ProForClv = "" ;
      A763ProForCla = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A770ProForPrd = "" ;
      W770ProForPrd = "" ;
      W765ProForDes = "" ;
      W762ProForCan = DecimalUtil.ZERO ;
      W5358ProForClv = "" ;
      W6062ProForCPo = DecimalUtil.ZERO ;
      P02EQ6_A396EmprCod = new String[] {""} ;
      P02EQ6_A764ProForCod = new String[] {""} ;
      P02EQ9_A396EmprCod = new String[] {""} ;
      P02EQ9_A773ProForUli = new short[1] ;
      P02EQ9_A764ProForCod = new String[] {""} ;
      P02EQ9_A13936ProForRs = new String[] {""} ;
      P02EQ9_A13133ProForAct = new String[] {""} ;
      P02EQ9_A12109ProNh2o = new short[1] ;
      P02EQ9_n12109ProNh2o = new boolean[] {false} ;
      P02EQ9_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EQ9_A10547ProH2O = new short[1] ;
      P02EQ9_A10120ProforVl = new int[1] ;
      P02EQ9_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EQ9_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EQ9_A6877ProForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EQ9_n6877ProForPhn = new boolean[] {false} ;
      P02EQ9_A6876ProForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EQ9_n6876ProForPhx = new boolean[] {false} ;
      P02EQ9_A6610ProForCol = new String[] {""} ;
      P02EQ9_n6610ProForCol = new boolean[] {false} ;
      P02EQ9_A6061ProForLab = new String[] {""} ;
      P02EQ9_A6018ProForFab = new String[] {""} ;
      P02EQ9_n6018ProForFab = new boolean[] {false} ;
      P02EQ9_A5523ProForTip = new String[] {""} ;
      P02EQ9_A5436IntCodF2 = new short[1] ;
      P02EQ9_n5436IntCodF2 = new boolean[] {false} ;
      P02EQ9_A5465ProForFac = new String[] {""} ;
      P02EQ9_n5465ProForFac = new boolean[] {false} ;
      P02EQ9_A5190ProFoLCU = new short[1] ;
      P02EQ9_n5190ProFoLCU = new boolean[] {false} ;
      P02EQ9_A4865ProForDCi = new String[] {""} ;
      P02EQ9_A4864ProForCCi = new String[] {""} ;
      P02EQ9_A4715ProForDsc2 = new String[] {""} ;
      P02EQ9_A4706ProForRb = new short[1] ;
      P02EQ9_A4705ProForPau = new short[1] ;
      P02EQ9_A4586ProForObs = new String[] {""} ;
      P02EQ9_n4586ProForObs = new boolean[] {false} ;
      P02EQ9_A3005ProRev = new String[] {""} ;
      P02EQ9_A2393ProNumRec = new int[1] ;
      P02EQ9_A2392ProNumPro = new int[1] ;
      P02EQ9_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      P02EQ9_A769ProForMat = new String[] {""} ;
      P02EQ9_A772ProForTmx = new short[1] ;
      P02EQ9_A771ProForTie = new short[1] ;
      P02EQ9_A766ProForDsc = new String[] {""} ;
      P02EQ11_A396EmprCod = new String[] {""} ;
      P02EQ11_A764ProForCod = new String[] {""} ;
      P02EQ11_A13111ProForDe2 = new String[] {""} ;
      P02EQ11_A13178ProForFT = new String[] {""} ;
      P02EQ11_A765ProForDes = new String[] {""} ;
      P02EQ11_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EQ11_A5358ProForClv = new String[] {""} ;
      P02EQ11_A3379ProForTnq = new byte[1] ;
      P02EQ11_A1645ProForNro = new byte[1] ;
      P02EQ11_A763ProForCla = new String[] {""} ;
      P02EQ11_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EQ11_A490ForPrdUMe = new byte[1] ;
      P02EQ11_A770ProForPrd = new String[] {""} ;
      P02EQ11_A767ProForLin = new short[1] ;
      P02EQ13_A396EmprCod = new String[] {""} ;
      P02EQ13_A764ProForCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.prenprq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.prenprq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.prenprq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.prenprq__default(),
         new Object[] {
             new Object[] {
            P02EQ2_A396EmprCod, P02EQ2_A773ProForUli, P02EQ2_A764ProForCod, P02EQ2_A13936ProForRs, P02EQ2_A13133ProForAct, P02EQ2_A12109ProNh2o, P02EQ2_n12109ProNh2o, P02EQ2_A3589ProForMer, P02EQ2_A10547ProH2O, P02EQ2_A10120ProforVl,
            P02EQ2_A8528ProForCos, P02EQ2_A8527ProForAbs, P02EQ2_A6877ProForPhn, P02EQ2_n6877ProForPhn, P02EQ2_A6876ProForPhx, P02EQ2_n6876ProForPhx, P02EQ2_A6610ProForCol, P02EQ2_n6610ProForCol, P02EQ2_A6061ProForLab, P02EQ2_A6018ProForFab,
            P02EQ2_n6018ProForFab, P02EQ2_A5523ProForTip, P02EQ2_A5436IntCodF2, P02EQ2_n5436IntCodF2, P02EQ2_A5465ProForFac, P02EQ2_n5465ProForFac, P02EQ2_A5190ProFoLCU, P02EQ2_n5190ProFoLCU, P02EQ2_A4865ProForDCi, P02EQ2_A4864ProForCCi,
            P02EQ2_A4715ProForDsc2, P02EQ2_A4706ProForRb, P02EQ2_A4705ProForPau, P02EQ2_A4586ProForObs, P02EQ2_n4586ProForObs, P02EQ2_A3005ProRev, P02EQ2_A2393ProNumRec, P02EQ2_A2392ProNumPro, P02EQ2_A674PorForFul, P02EQ2_A769ProForMat,
            P02EQ2_A772ProForTmx, P02EQ2_A771ProForTie, P02EQ2_A766ProForDsc
            }
            , new Object[] {
            }
            , new Object[] {
            P02EQ4_A396EmprCod, P02EQ4_A764ProForCod, P02EQ4_A767ProForLin, P02EQ4_A13111ProForDe2, P02EQ4_A13178ProForFT, P02EQ4_A765ProForDes, P02EQ4_A6062ProForCPo, P02EQ4_A5358ProForClv, P02EQ4_A3379ProForTnq, P02EQ4_A1645ProForNro,
            P02EQ4_A763ProForCla, P02EQ4_A762ProForCan, P02EQ4_A490ForPrdUMe, P02EQ4_A770ProForPrd
            }
            , new Object[] {
            }
            , new Object[] {
            P02EQ6_A396EmprCod, P02EQ6_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02EQ9_A396EmprCod, P02EQ9_A773ProForUli, P02EQ9_A764ProForCod, P02EQ9_A13936ProForRs, P02EQ9_A13133ProForAct, P02EQ9_A12109ProNh2o, P02EQ9_n12109ProNh2o, P02EQ9_A3589ProForMer, P02EQ9_A10547ProH2O, P02EQ9_A10120ProforVl,
            P02EQ9_A8528ProForCos, P02EQ9_A8527ProForAbs, P02EQ9_A6877ProForPhn, P02EQ9_n6877ProForPhn, P02EQ9_A6876ProForPhx, P02EQ9_n6876ProForPhx, P02EQ9_A6610ProForCol, P02EQ9_n6610ProForCol, P02EQ9_A6061ProForLab, P02EQ9_A6018ProForFab,
            P02EQ9_n6018ProForFab, P02EQ9_A5523ProForTip, P02EQ9_A5436IntCodF2, P02EQ9_n5436IntCodF2, P02EQ9_A5465ProForFac, P02EQ9_n5465ProForFac, P02EQ9_A5190ProFoLCU, P02EQ9_n5190ProFoLCU, P02EQ9_A4865ProForDCi, P02EQ9_A4864ProForCCi,
            P02EQ9_A4715ProForDsc2, P02EQ9_A4706ProForRb, P02EQ9_A4705ProForPau, P02EQ9_A4586ProForObs, P02EQ9_n4586ProForObs, P02EQ9_A3005ProRev, P02EQ9_A2393ProNumRec, P02EQ9_A2392ProNumPro, P02EQ9_A674PorForFul, P02EQ9_A769ProForMat,
            P02EQ9_A772ProForTmx, P02EQ9_A771ProForTie, P02EQ9_A766ProForDsc
            }
            , new Object[] {
            }
            , new Object[] {
            P02EQ11_A396EmprCod, P02EQ11_A764ProForCod, P02EQ11_A13111ProForDe2, P02EQ11_A13178ProForFT, P02EQ11_A765ProForDes, P02EQ11_A6062ProForCPo, P02EQ11_A5358ProForClv, P02EQ11_A3379ProForTnq, P02EQ11_A1645ProForNro, P02EQ11_A763ProForCla,
            P02EQ11_A762ProForCan, P02EQ11_A490ForPrdUMe, P02EQ11_A770ProForPrd, P02EQ11_A767ProForLin
            }
            , new Object[] {
            }
            , new Object[] {
            P02EQ13_A396EmprCod, P02EQ13_A764ProForCod
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

   private byte AV20Lavanderia ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A3379ProForTnq ;
   private byte A1645ProForNro ;
   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private byte W1645ProForNro ;
   private byte W3379ProForTnq ;
   private short AV19Proforlin ;
   private short A773ProForUli ;
   private short A12109ProNh2o ;
   private short A10547ProH2O ;
   private short A5436IntCodF2 ;
   private short A5190ProFoLCU ;
   private short A4706ProForRb ;
   private short A4705ProForPau ;
   private short A772ProForTmx ;
   private short A771ProForTie ;
   private short W771ProForTie ;
   private short W772ProForTmx ;
   private short W773ProForUli ;
   private short W4705ProForPau ;
   private short W4706ProForRb ;
   private short W5190ProFoLCU ;
   private short W5436IntCodF2 ;
   private short Gx_err ;
   private short A767ProForLin ;
   private short W767ProForLin ;
   private int A10120ProforVl ;
   private int A2393ProNumRec ;
   private int A2392ProNumPro ;
   private int GX_INS89 ;
   private int W2392ProNumPro ;
   private int W2393ProNumRec ;
   private int GX_INS90 ;
   private java.math.BigDecimal A3589ProForMer ;
   private java.math.BigDecimal A8528ProForCos ;
   private java.math.BigDecimal A8527ProForAbs ;
   private java.math.BigDecimal A6877ProForPhn ;
   private java.math.BigDecimal A6876ProForPhx ;
   private java.math.BigDecimal W3589ProForMer ;
   private java.math.BigDecimal A6062ProForCPo ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal W762ProForCan ;
   private java.math.BigDecimal W6062ProForCPo ;
   private String A396EmprCod ;
   private String AV16Proforcod ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String A13936ProForRs ;
   private String A13133ProForAct ;
   private String A6610ProForCol ;
   private String A6061ProForLab ;
   private String A6018ProForFab ;
   private String A5523ProForTip ;
   private String A5465ProForFac ;
   private String A4865ProForDCi ;
   private String A4864ProForCCi ;
   private String A4715ProForDsc2 ;
   private String A3005ProRev ;
   private String A769ProForMat ;
   private String A766ProForDsc ;
   private String W396EmprCod ;
   private String W764ProForCod ;
   private String AV15ProDes ;
   private String W766ProForDsc ;
   private String W769ProForMat ;
   private String W3005ProRev ;
   private String W4715ProForDsc2 ;
   private String W4865ProForDCi ;
   private String W4864ProForCCi ;
   private String W5465ProForFac ;
   private String W5523ProForTip ;
   private String W6018ProForFab ;
   private String W6061ProForLab ;
   private String Gx_emsg ;
   private String A13111ProForDe2 ;
   private String A13178ProForFT ;
   private String A765ProForDes ;
   private String A5358ProForClv ;
   private String A763ProForCla ;
   private String A770ProForPrd ;
   private String W770ProForPrd ;
   private String W765ProForDes ;
   private String W5358ProForClv ;
   private java.util.Date A674PorForFul ;
   private java.util.Date W674PorForFul ;
   private boolean n12109ProNh2o ;
   private boolean n6877ProForPhn ;
   private boolean n6876ProForPhx ;
   private boolean n6610ProForCol ;
   private boolean n6018ProForFab ;
   private boolean n5436IntCodF2 ;
   private boolean n5465ProForFac ;
   private boolean n5190ProFoLCU ;
   private boolean n4586ProForObs ;
   private String A4586ProForObs ;
   private String W4586ProForObs ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02EQ2_A396EmprCod ;
   private short[] P02EQ2_A773ProForUli ;
   private String[] P02EQ2_A764ProForCod ;
   private String[] P02EQ2_A13936ProForRs ;
   private String[] P02EQ2_A13133ProForAct ;
   private short[] P02EQ2_A12109ProNh2o ;
   private boolean[] P02EQ2_n12109ProNh2o ;
   private java.math.BigDecimal[] P02EQ2_A3589ProForMer ;
   private short[] P02EQ2_A10547ProH2O ;
   private int[] P02EQ2_A10120ProforVl ;
   private java.math.BigDecimal[] P02EQ2_A8528ProForCos ;
   private java.math.BigDecimal[] P02EQ2_A8527ProForAbs ;
   private java.math.BigDecimal[] P02EQ2_A6877ProForPhn ;
   private boolean[] P02EQ2_n6877ProForPhn ;
   private java.math.BigDecimal[] P02EQ2_A6876ProForPhx ;
   private boolean[] P02EQ2_n6876ProForPhx ;
   private String[] P02EQ2_A6610ProForCol ;
   private boolean[] P02EQ2_n6610ProForCol ;
   private String[] P02EQ2_A6061ProForLab ;
   private String[] P02EQ2_A6018ProForFab ;
   private boolean[] P02EQ2_n6018ProForFab ;
   private String[] P02EQ2_A5523ProForTip ;
   private short[] P02EQ2_A5436IntCodF2 ;
   private boolean[] P02EQ2_n5436IntCodF2 ;
   private String[] P02EQ2_A5465ProForFac ;
   private boolean[] P02EQ2_n5465ProForFac ;
   private short[] P02EQ2_A5190ProFoLCU ;
   private boolean[] P02EQ2_n5190ProFoLCU ;
   private String[] P02EQ2_A4865ProForDCi ;
   private String[] P02EQ2_A4864ProForCCi ;
   private String[] P02EQ2_A4715ProForDsc2 ;
   private short[] P02EQ2_A4706ProForRb ;
   private short[] P02EQ2_A4705ProForPau ;
   private String[] P02EQ2_A4586ProForObs ;
   private boolean[] P02EQ2_n4586ProForObs ;
   private String[] P02EQ2_A3005ProRev ;
   private int[] P02EQ2_A2393ProNumRec ;
   private int[] P02EQ2_A2392ProNumPro ;
   private java.util.Date[] P02EQ2_A674PorForFul ;
   private String[] P02EQ2_A769ProForMat ;
   private short[] P02EQ2_A772ProForTmx ;
   private short[] P02EQ2_A771ProForTie ;
   private String[] P02EQ2_A766ProForDsc ;
   private String[] P02EQ4_A396EmprCod ;
   private String[] P02EQ4_A764ProForCod ;
   private short[] P02EQ4_A767ProForLin ;
   private String[] P02EQ4_A13111ProForDe2 ;
   private String[] P02EQ4_A13178ProForFT ;
   private String[] P02EQ4_A765ProForDes ;
   private java.math.BigDecimal[] P02EQ4_A6062ProForCPo ;
   private String[] P02EQ4_A5358ProForClv ;
   private byte[] P02EQ4_A3379ProForTnq ;
   private byte[] P02EQ4_A1645ProForNro ;
   private String[] P02EQ4_A763ProForCla ;
   private java.math.BigDecimal[] P02EQ4_A762ProForCan ;
   private byte[] P02EQ4_A490ForPrdUMe ;
   private String[] P02EQ4_A770ProForPrd ;
   private String[] P02EQ6_A396EmprCod ;
   private String[] P02EQ6_A764ProForCod ;
   private String[] P02EQ9_A396EmprCod ;
   private short[] P02EQ9_A773ProForUli ;
   private String[] P02EQ9_A764ProForCod ;
   private String[] P02EQ9_A13936ProForRs ;
   private String[] P02EQ9_A13133ProForAct ;
   private short[] P02EQ9_A12109ProNh2o ;
   private boolean[] P02EQ9_n12109ProNh2o ;
   private java.math.BigDecimal[] P02EQ9_A3589ProForMer ;
   private short[] P02EQ9_A10547ProH2O ;
   private int[] P02EQ9_A10120ProforVl ;
   private java.math.BigDecimal[] P02EQ9_A8528ProForCos ;
   private java.math.BigDecimal[] P02EQ9_A8527ProForAbs ;
   private java.math.BigDecimal[] P02EQ9_A6877ProForPhn ;
   private boolean[] P02EQ9_n6877ProForPhn ;
   private java.math.BigDecimal[] P02EQ9_A6876ProForPhx ;
   private boolean[] P02EQ9_n6876ProForPhx ;
   private String[] P02EQ9_A6610ProForCol ;
   private boolean[] P02EQ9_n6610ProForCol ;
   private String[] P02EQ9_A6061ProForLab ;
   private String[] P02EQ9_A6018ProForFab ;
   private boolean[] P02EQ9_n6018ProForFab ;
   private String[] P02EQ9_A5523ProForTip ;
   private short[] P02EQ9_A5436IntCodF2 ;
   private boolean[] P02EQ9_n5436IntCodF2 ;
   private String[] P02EQ9_A5465ProForFac ;
   private boolean[] P02EQ9_n5465ProForFac ;
   private short[] P02EQ9_A5190ProFoLCU ;
   private boolean[] P02EQ9_n5190ProFoLCU ;
   private String[] P02EQ9_A4865ProForDCi ;
   private String[] P02EQ9_A4864ProForCCi ;
   private String[] P02EQ9_A4715ProForDsc2 ;
   private short[] P02EQ9_A4706ProForRb ;
   private short[] P02EQ9_A4705ProForPau ;
   private String[] P02EQ9_A4586ProForObs ;
   private boolean[] P02EQ9_n4586ProForObs ;
   private String[] P02EQ9_A3005ProRev ;
   private int[] P02EQ9_A2393ProNumRec ;
   private int[] P02EQ9_A2392ProNumPro ;
   private java.util.Date[] P02EQ9_A674PorForFul ;
   private String[] P02EQ9_A769ProForMat ;
   private short[] P02EQ9_A772ProForTmx ;
   private short[] P02EQ9_A771ProForTie ;
   private String[] P02EQ9_A766ProForDsc ;
   private String[] P02EQ11_A396EmprCod ;
   private String[] P02EQ11_A764ProForCod ;
   private String[] P02EQ11_A13111ProForDe2 ;
   private String[] P02EQ11_A13178ProForFT ;
   private String[] P02EQ11_A765ProForDes ;
   private java.math.BigDecimal[] P02EQ11_A6062ProForCPo ;
   private String[] P02EQ11_A5358ProForClv ;
   private byte[] P02EQ11_A3379ProForTnq ;
   private byte[] P02EQ11_A1645ProForNro ;
   private String[] P02EQ11_A763ProForCla ;
   private java.math.BigDecimal[] P02EQ11_A762ProForCan ;
   private byte[] P02EQ11_A490ForPrdUMe ;
   private String[] P02EQ11_A770ProForPrd ;
   private short[] P02EQ11_A767ProForLin ;
   private String[] P02EQ13_A396EmprCod ;
   private String[] P02EQ13_A764ProForCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class prenprq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class prenprq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class prenprq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class prenprq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02EQ2", "SELECT EmprCod, ProForUli, ProForCod, ProForRs, ProForAct, ProNh2o, ProForMer, ProH2O, ProforVl, ProForCos, ProForAbs, ProForPhn, ProForPhx, ProForCol, ProForLab, ProForFab, ProForTip, IntCodF2, ProForFac, ProFoLCU, ProForDCi, ProForCCi, ProForDsc2, ProForRb, ProForPau, ProForObs, ProRev, ProNumRec, ProNumPro, PorForFul, ProForMat, ProForTmx, ProForTie, ProForDsc FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02EQ3", "INSERT INTO TXPCPROFO(EmprCod, ProForCod, ProForDsc, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForObs, ProForPau, ProForRb, ProForDsc2, ProForCCi, ProForDCi, ProFoLCU, ProForFac, IntCodF2, ProForTip, ProForFab, ProForLab, ProForCol, ProForPhx, ProForPhn, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProNh2o, ProForAct, ProForRs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPROFO")
         ,new ForEachCursor("P02EQ4", "SELECT EmprCod, ProForCod, ProForLin, ProForDe2, ProForFT, ProForDes, ProForCPo, ProForClv, ProForTnq, ProForNro, ProForCla, ProForCan, ForPrdUMe, ProForPrd FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02EQ5", "INSERT INTO TXPLPROFO(EmprCod, ProForCod, ProForLin, ProForPrd, ForPrdUMe, ProForCan, ProForCla, ProForNro, ProForTnq, ProForClv, ProForCPo, ProForDes, ProForFT, ProForDe2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
         ,new ForEachCursor("P02EQ6", "SELECT EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02EQ7", "DELETE FROM TXPLPROFO  WHERE EmprCod = ? and ProForCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
         ,new UpdateCursor("P02EQ8", "DELETE FROM TXPCPROFO  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPROFO")
         ,new ForEachCursor("P02EQ9", "SELECT EmprCod, ProForUli, ProForCod, ProForRs, ProForAct, ProNh2o, ProForMer, ProH2O, ProforVl, ProForCos, ProForAbs, ProForPhn, ProForPhx, ProForCol, ProForLab, ProForFab, ProForTip, IntCodF2, ProForFac, ProFoLCU, ProForDCi, ProForCCi, ProForDsc2, ProForRb, ProForPau, ProForObs, ProRev, ProNumRec, ProNumPro, PorForFul, ProForMat, ProForTmx, ProForTie, ProForDsc FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02EQ10", "INSERT INTO TXPCPROFO(EmprCod, ProForCod, ProForDsc, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForObs, ProForPau, ProForRb, ProForDsc2, ProForCCi, ProForDCi, ProFoLCU, ProForFac, IntCodF2, ProForTip, ProForFab, ProForLab, ProForCol, ProForPhx, ProForPhn, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProNh2o, ProForAct, ProForRs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPROFO")
         ,new ForEachCursor("P02EQ11", "SELECT EmprCod, ProForCod, ProForDe2, ProForFT, ProForDes, ProForCPo, ProForClv, ProForTnq, ProForNro, ProForCla, ProForCan, ForPrdUMe, ProForPrd, ProForLin FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02EQ12", "INSERT INTO TXPLPROFO(EmprCod, ProForCod, ProForLin, ProForPrd, ForPrdUMe, ProForCan, ProForCla, ProForNro, ProForTnq, ProForClv, ProForCPo, ProForDes, ProForFT, ProForDe2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
         ,new ForEachCursor("P02EQ13", "SELECT EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02EQ14", "DELETE FROM TXPLPROFO  WHERE EmprCod = ? and ProForCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
         ,new UpdateCursor("P02EQ15", "DELETE FROM TXPCPROFO  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPROFO")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 6);
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(21, 16);
               ((String[]) buf[29])[0] = rslt.getString(22, 10);
               ((String[]) buf[30])[0] = rslt.getString(23, 40);
               ((short[]) buf[31])[0] = rslt.getShort(24);
               ((short[]) buf[32])[0] = rslt.getShort(25);
               ((String[]) buf[33])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(27, 1);
               ((int[]) buf[36])[0] = rslt.getInt(28);
               ((int[]) buf[37])[0] = rslt.getInt(29);
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDate(30);
               ((String[]) buf[39])[0] = rslt.getString(31, 16);
               ((short[]) buf[40])[0] = rslt.getShort(32);
               ((short[]) buf[41])[0] = rslt.getShort(33);
               ((String[]) buf[42])[0] = rslt.getString(34, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 6);
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((short[]) buf[22])[0] = rslt.getShort(18);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(20);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(21, 16);
               ((String[]) buf[29])[0] = rslt.getString(22, 10);
               ((String[]) buf[30])[0] = rslt.getString(23, 40);
               ((short[]) buf[31])[0] = rslt.getShort(24);
               ((short[]) buf[32])[0] = rslt.getShort(25);
               ((String[]) buf[33])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(27, 1);
               ((int[]) buf[36])[0] = rslt.getInt(28);
               ((int[]) buf[37])[0] = rslt.getInt(29);
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDate(30);
               ((String[]) buf[39])[0] = rslt.getString(31, 16);
               ((short[]) buf[40])[0] = rslt.getShort(32);
               ((short[]) buf[41])[0] = rslt.getShort(33);
               ((String[]) buf[42])[0] = rslt.getString(34, 30);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 6);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 30);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 1);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[12], 300);
               }
               stmt.setShort(13, ((Number) parms[13]).shortValue());
               stmt.setShort(14, ((Number) parms[14]).shortValue());
               stmt.setString(15, (String)parms[15], 40);
               stmt.setString(16, (String)parms[16], 10);
               stmt.setString(17, (String)parms[17], 16);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[23]).shortValue());
               }
               stmt.setString(21, (String)parms[24], 1);
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[26], 1);
               }
               stmt.setString(23, (String)parms[27], 6);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[33], 2);
               }
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[34], 2);
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[35], 4);
               stmt.setInt(29, ((Number) parms[36]).intValue());
               stmt.setShort(30, ((Number) parms[37]).shortValue());
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[38], 2);
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[40]).shortValue());
               }
               stmt.setString(33, (String)parms[41], 1);
               stmt.setString(34, (String)parms[42], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 30);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setString(12, (String)parms[11], 26);
               stmt.setString(13, (String)parms[12], 6);
               stmt.setString(14, (String)parms[13], 40);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 30);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 1);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[12], 300);
               }
               stmt.setShort(13, ((Number) parms[13]).shortValue());
               stmt.setShort(14, ((Number) parms[14]).shortValue());
               stmt.setString(15, (String)parms[15], 40);
               stmt.setString(16, (String)parms[16], 10);
               stmt.setString(17, (String)parms[17], 16);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[23]).shortValue());
               }
               stmt.setString(21, (String)parms[24], 1);
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[26], 1);
               }
               stmt.setString(23, (String)parms[27], 6);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[33], 2);
               }
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[34], 2);
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[35], 4);
               stmt.setInt(29, ((Number) parms[36]).intValue());
               stmt.setShort(30, ((Number) parms[37]).shortValue());
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[38], 2);
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[40]).shortValue());
               }
               stmt.setString(33, (String)parms[41], 1);
               stmt.setString(34, (String)parms[42], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 30);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setString(12, (String)parms[11], 26);
               stmt.setString(13, (String)parms[12], 6);
               stmt.setString(14, (String)parms[13], 40);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

