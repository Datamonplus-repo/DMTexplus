package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pduppro extends GXProcedure
{
   public pduppro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pduppro.class ), "" );
   }

   public pduppro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        byte aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             byte aP3 )
   {
      pduppro.this.AV18EmprCod = aP0;
      pduppro.this.AV17ProOri = aP1;
      pduppro.this.AV15ProDes = aP2;
      pduppro.this.AV16Eliminar = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00502 */
      pr_default.execute(0, new Object[] {AV18EmprCod, AV15ProDes, Byte.valueOf(AV16Eliminar)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P00502_A764ProForCod[0] ;
         A396EmprCod = P00502_A396EmprCod[0] ;
         /* Optimized DELETE. */
         /* Using cursor P00503 */
         pr_default.execute(1, new Object[] {A396EmprCod, A764ProForCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
         /* End optimized DELETE. */
         /* Using cursor P00504 */
         pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00505 */
      pr_default.execute(3, new Object[] {AV18EmprCod, AV17ProOri});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A764ProForCod = P00505_A764ProForCod[0] ;
         A13936ProForRs = P00505_A13936ProForRs[0] ;
         A13133ProForAct = P00505_A13133ProForAct[0] ;
         A12109ProNh2o = P00505_A12109ProNh2o[0] ;
         n12109ProNh2o = P00505_n12109ProNh2o[0] ;
         A3589ProForMer = P00505_A3589ProForMer[0] ;
         A10547ProH2O = P00505_A10547ProH2O[0] ;
         A10120ProforVl = P00505_A10120ProforVl[0] ;
         A8528ProForCos = P00505_A8528ProForCos[0] ;
         A8527ProForAbs = P00505_A8527ProForAbs[0] ;
         A6877ProForPhn = P00505_A6877ProForPhn[0] ;
         n6877ProForPhn = P00505_n6877ProForPhn[0] ;
         A6876ProForPhx = P00505_A6876ProForPhx[0] ;
         n6876ProForPhx = P00505_n6876ProForPhx[0] ;
         A6610ProForCol = P00505_A6610ProForCol[0] ;
         n6610ProForCol = P00505_n6610ProForCol[0] ;
         A6061ProForLab = P00505_A6061ProForLab[0] ;
         A6018ProForFab = P00505_A6018ProForFab[0] ;
         n6018ProForFab = P00505_n6018ProForFab[0] ;
         A5523ProForTip = P00505_A5523ProForTip[0] ;
         A5436IntCodF2 = P00505_A5436IntCodF2[0] ;
         n5436IntCodF2 = P00505_n5436IntCodF2[0] ;
         A5465ProForFac = P00505_A5465ProForFac[0] ;
         n5465ProForFac = P00505_n5465ProForFac[0] ;
         A5190ProFoLCU = P00505_A5190ProFoLCU[0] ;
         n5190ProFoLCU = P00505_n5190ProFoLCU[0] ;
         A4865ProForDCi = P00505_A4865ProForDCi[0] ;
         A4864ProForCCi = P00505_A4864ProForCCi[0] ;
         A4715ProForDsc2 = P00505_A4715ProForDsc2[0] ;
         A4706ProForRb = P00505_A4706ProForRb[0] ;
         A4705ProForPau = P00505_A4705ProForPau[0] ;
         A4586ProForObs = P00505_A4586ProForObs[0] ;
         n4586ProForObs = P00505_n4586ProForObs[0] ;
         A3005ProRev = P00505_A3005ProRev[0] ;
         A2393ProNumRec = P00505_A2393ProNumRec[0] ;
         A2392ProNumPro = P00505_A2392ProNumPro[0] ;
         A773ProForUli = P00505_A773ProForUli[0] ;
         A674PorForFul = P00505_A674PorForFul[0] ;
         A769ProForMat = P00505_A769ProForMat[0] ;
         A772ProForTmx = P00505_A772ProForTmx[0] ;
         A771ProForTie = P00505_A771ProForTie[0] ;
         A766ProForDsc = P00505_A766ProForDsc[0] ;
         A396EmprCod = P00505_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W764ProForCod = A764ProForCod ;
         /*
            INSERT RECORD ON TABLE TXPCPROFO

         */
         W396EmprCod = A396EmprCod ;
         W764ProForCod = A764ProForCod ;
         A764ProForCod = AV15ProDes ;
         /* Using cursor P00506 */
         pr_default.execute(4, new Object[] {A396EmprCod, A764ProForCod, A766ProForDsc, Short.valueOf(A771ProForTie), Short.valueOf(A772ProForTmx), A769ProForMat, A674PorForFul, Short.valueOf(A773ProForUli), Integer.valueOf(A2392ProNumPro), Integer.valueOf(A2393ProNumRec), A3005ProRev, Boolean.valueOf(n4586ProForObs), A4586ProForObs, Short.valueOf(A4705ProForPau), Short.valueOf(A4706ProForRb), A4715ProForDsc2, A4864ProForCCi, A4865ProForDCi, Boolean.valueOf(n5190ProFoLCU), Short.valueOf(A5190ProFoLCU), Boolean.valueOf(n5465ProForFac), A5465ProForFac, Boolean.valueOf(n5436IntCodF2), Short.valueOf(A5436IntCodF2), A5523ProForTip, Boolean.valueOf(n6018ProForFab), A6018ProForFab, A6061ProForLab, Boolean.valueOf(n6610ProForCol), A6610ProForCol, Boolean.valueOf(n6876ProForPhx), A6876ProForPhx, Boolean.valueOf(n6877ProForPhn), A6877ProForPhn, A8527ProForAbs, A8528ProForCos, Integer.valueOf(A10120ProforVl), Short.valueOf(A10547ProH2O), A3589ProForMer, Boolean.valueOf(n12109ProNh2o), Short.valueOf(A12109ProNh2o), A13133ProForAct, A13936ProForRs});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
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
         A764ProForCod = W764ProForCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A764ProForCod = W764ProForCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      /* Using cursor P00507 */
      pr_default.execute(5, new Object[] {AV18EmprCod, AV17ProOri});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A764ProForCod = P00507_A764ProForCod[0] ;
         A13111ProForDe2 = P00507_A13111ProForDe2[0] ;
         A13178ProForFT = P00507_A13178ProForFT[0] ;
         A765ProForDes = P00507_A765ProForDes[0] ;
         A6062ProForCPo = P00507_A6062ProForCPo[0] ;
         A5358ProForClv = P00507_A5358ProForClv[0] ;
         A3379ProForTnq = P00507_A3379ProForTnq[0] ;
         A1645ProForNro = P00507_A1645ProForNro[0] ;
         A763ProForCla = P00507_A763ProForCla[0] ;
         A762ProForCan = P00507_A762ProForCan[0] ;
         A490ForPrdUMe = P00507_A490ForPrdUMe[0] ;
         A770ProForPrd = P00507_A770ProForPrd[0] ;
         A767ProForLin = P00507_A767ProForLin[0] ;
         A396EmprCod = P00507_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W764ProForCod = A764ProForCod ;
         /*
            INSERT RECORD ON TABLE TXPLPROFO

         */
         W396EmprCod = A396EmprCod ;
         W764ProForCod = A764ProForCod ;
         W767ProForLin = A767ProForLin ;
         A764ProForCod = AV15ProDes ;
         /* Using cursor P00508 */
         pr_default.execute(6, new Object[] {A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin), A770ProForPrd, Byte.valueOf(A490ForPrdUMe), A762ProForCan, A763ProForCla, Byte.valueOf(A1645ProForNro), Byte.valueOf(A3379ProForTnq), A5358ProForClv, A6062ProForCPo, A765ProForDes, A13178ProForFT, A13111ProForDe2});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
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
         A764ProForCod = W764ProForCod ;
         A767ProForLin = W767ProForLin ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A764ProForCod = W764ProForCod ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pduppro");
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
      P00502_A764ProForCod = new String[] {""} ;
      P00502_A396EmprCod = new String[] {""} ;
      A764ProForCod = "" ;
      A396EmprCod = "" ;
      P00505_A764ProForCod = new String[] {""} ;
      P00505_A13936ProForRs = new String[] {""} ;
      P00505_A13133ProForAct = new String[] {""} ;
      P00505_A12109ProNh2o = new short[1] ;
      P00505_n12109ProNh2o = new boolean[] {false} ;
      P00505_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00505_A10547ProH2O = new short[1] ;
      P00505_A10120ProforVl = new int[1] ;
      P00505_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00505_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00505_A6877ProForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00505_n6877ProForPhn = new boolean[] {false} ;
      P00505_A6876ProForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00505_n6876ProForPhx = new boolean[] {false} ;
      P00505_A6610ProForCol = new String[] {""} ;
      P00505_n6610ProForCol = new boolean[] {false} ;
      P00505_A6061ProForLab = new String[] {""} ;
      P00505_A6018ProForFab = new String[] {""} ;
      P00505_n6018ProForFab = new boolean[] {false} ;
      P00505_A5523ProForTip = new String[] {""} ;
      P00505_A5436IntCodF2 = new short[1] ;
      P00505_n5436IntCodF2 = new boolean[] {false} ;
      P00505_A5465ProForFac = new String[] {""} ;
      P00505_n5465ProForFac = new boolean[] {false} ;
      P00505_A5190ProFoLCU = new short[1] ;
      P00505_n5190ProFoLCU = new boolean[] {false} ;
      P00505_A4865ProForDCi = new String[] {""} ;
      P00505_A4864ProForCCi = new String[] {""} ;
      P00505_A4715ProForDsc2 = new String[] {""} ;
      P00505_A4706ProForRb = new short[1] ;
      P00505_A4705ProForPau = new short[1] ;
      P00505_A4586ProForObs = new String[] {""} ;
      P00505_n4586ProForObs = new boolean[] {false} ;
      P00505_A3005ProRev = new String[] {""} ;
      P00505_A2393ProNumRec = new int[1] ;
      P00505_A2392ProNumPro = new int[1] ;
      P00505_A773ProForUli = new short[1] ;
      P00505_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      P00505_A769ProForMat = new String[] {""} ;
      P00505_A772ProForTmx = new short[1] ;
      P00505_A771ProForTie = new short[1] ;
      P00505_A766ProForDsc = new String[] {""} ;
      P00505_A396EmprCod = new String[] {""} ;
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
      Gx_emsg = "" ;
      P00507_A764ProForCod = new String[] {""} ;
      P00507_A13111ProForDe2 = new String[] {""} ;
      P00507_A13178ProForFT = new String[] {""} ;
      P00507_A765ProForDes = new String[] {""} ;
      P00507_A6062ProForCPo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00507_A5358ProForClv = new String[] {""} ;
      P00507_A3379ProForTnq = new byte[1] ;
      P00507_A1645ProForNro = new byte[1] ;
      P00507_A763ProForCla = new String[] {""} ;
      P00507_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00507_A490ForPrdUMe = new byte[1] ;
      P00507_A770ProForPrd = new String[] {""} ;
      P00507_A767ProForLin = new short[1] ;
      P00507_A396EmprCod = new String[] {""} ;
      A13111ProForDe2 = "" ;
      A13178ProForFT = "" ;
      A765ProForDes = "" ;
      A6062ProForCPo = DecimalUtil.ZERO ;
      A5358ProForClv = "" ;
      A763ProForCla = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A770ProForPrd = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pduppro__default(),
         new Object[] {
             new Object[] {
            P00502_A764ProForCod, P00502_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00505_A764ProForCod, P00505_A13936ProForRs, P00505_A13133ProForAct, P00505_A12109ProNh2o, P00505_n12109ProNh2o, P00505_A3589ProForMer, P00505_A10547ProH2O, P00505_A10120ProforVl, P00505_A8528ProForCos, P00505_A8527ProForAbs,
            P00505_A6877ProForPhn, P00505_n6877ProForPhn, P00505_A6876ProForPhx, P00505_n6876ProForPhx, P00505_A6610ProForCol, P00505_n6610ProForCol, P00505_A6061ProForLab, P00505_A6018ProForFab, P00505_n6018ProForFab, P00505_A5523ProForTip,
            P00505_A5436IntCodF2, P00505_n5436IntCodF2, P00505_A5465ProForFac, P00505_n5465ProForFac, P00505_A5190ProFoLCU, P00505_n5190ProFoLCU, P00505_A4865ProForDCi, P00505_A4864ProForCCi, P00505_A4715ProForDsc2, P00505_A4706ProForRb,
            P00505_A4705ProForPau, P00505_A4586ProForObs, P00505_n4586ProForObs, P00505_A3005ProRev, P00505_A2393ProNumRec, P00505_A2392ProNumPro, P00505_A773ProForUli, P00505_A674PorForFul, P00505_A769ProForMat, P00505_A772ProForTmx,
            P00505_A771ProForTie, P00505_A766ProForDsc, P00505_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P00507_A764ProForCod, P00507_A13111ProForDe2, P00507_A13178ProForFT, P00507_A765ProForDes, P00507_A6062ProForCPo, P00507_A5358ProForClv, P00507_A3379ProForTnq, P00507_A1645ProForNro, P00507_A763ProForCla, P00507_A762ProForCan,
            P00507_A490ForPrdUMe, P00507_A770ProForPrd, P00507_A767ProForLin, P00507_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Eliminar ;
   private byte A3379ProForTnq ;
   private byte A1645ProForNro ;
   private byte A490ForPrdUMe ;
   private short A12109ProNh2o ;
   private short A10547ProH2O ;
   private short A5436IntCodF2 ;
   private short A5190ProFoLCU ;
   private short A4706ProForRb ;
   private short A4705ProForPau ;
   private short A773ProForUli ;
   private short A772ProForTmx ;
   private short A771ProForTie ;
   private short Gx_err ;
   private short A767ProForLin ;
   private short W767ProForLin ;
   private int A10120ProforVl ;
   private int A2393ProNumRec ;
   private int A2392ProNumPro ;
   private int GX_INS89 ;
   private int GX_INS90 ;
   private java.math.BigDecimal A3589ProForMer ;
   private java.math.BigDecimal A8528ProForCos ;
   private java.math.BigDecimal A8527ProForAbs ;
   private java.math.BigDecimal A6877ProForPhn ;
   private java.math.BigDecimal A6876ProForPhx ;
   private java.math.BigDecimal A6062ProForCPo ;
   private java.math.BigDecimal A762ProForCan ;
   private String AV18EmprCod ;
   private String AV17ProOri ;
   private String AV15ProDes ;
   private String scmdbuf ;
   private String A764ProForCod ;
   private String A396EmprCod ;
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
   private String Gx_emsg ;
   private String A13111ProForDe2 ;
   private String A13178ProForFT ;
   private String A765ProForDes ;
   private String A5358ProForClv ;
   private String A763ProForCla ;
   private String A770ProForPrd ;
   private java.util.Date A674PorForFul ;
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
   private IDataStoreProvider pr_default ;
   private String[] P00502_A764ProForCod ;
   private String[] P00502_A396EmprCod ;
   private String[] P00505_A764ProForCod ;
   private String[] P00505_A13936ProForRs ;
   private String[] P00505_A13133ProForAct ;
   private short[] P00505_A12109ProNh2o ;
   private boolean[] P00505_n12109ProNh2o ;
   private java.math.BigDecimal[] P00505_A3589ProForMer ;
   private short[] P00505_A10547ProH2O ;
   private int[] P00505_A10120ProforVl ;
   private java.math.BigDecimal[] P00505_A8528ProForCos ;
   private java.math.BigDecimal[] P00505_A8527ProForAbs ;
   private java.math.BigDecimal[] P00505_A6877ProForPhn ;
   private boolean[] P00505_n6877ProForPhn ;
   private java.math.BigDecimal[] P00505_A6876ProForPhx ;
   private boolean[] P00505_n6876ProForPhx ;
   private String[] P00505_A6610ProForCol ;
   private boolean[] P00505_n6610ProForCol ;
   private String[] P00505_A6061ProForLab ;
   private String[] P00505_A6018ProForFab ;
   private boolean[] P00505_n6018ProForFab ;
   private String[] P00505_A5523ProForTip ;
   private short[] P00505_A5436IntCodF2 ;
   private boolean[] P00505_n5436IntCodF2 ;
   private String[] P00505_A5465ProForFac ;
   private boolean[] P00505_n5465ProForFac ;
   private short[] P00505_A5190ProFoLCU ;
   private boolean[] P00505_n5190ProFoLCU ;
   private String[] P00505_A4865ProForDCi ;
   private String[] P00505_A4864ProForCCi ;
   private String[] P00505_A4715ProForDsc2 ;
   private short[] P00505_A4706ProForRb ;
   private short[] P00505_A4705ProForPau ;
   private String[] P00505_A4586ProForObs ;
   private boolean[] P00505_n4586ProForObs ;
   private String[] P00505_A3005ProRev ;
   private int[] P00505_A2393ProNumRec ;
   private int[] P00505_A2392ProNumPro ;
   private short[] P00505_A773ProForUli ;
   private java.util.Date[] P00505_A674PorForFul ;
   private String[] P00505_A769ProForMat ;
   private short[] P00505_A772ProForTmx ;
   private short[] P00505_A771ProForTie ;
   private String[] P00505_A766ProForDsc ;
   private String[] P00505_A396EmprCod ;
   private String[] P00507_A764ProForCod ;
   private String[] P00507_A13111ProForDe2 ;
   private String[] P00507_A13178ProForFT ;
   private String[] P00507_A765ProForDes ;
   private java.math.BigDecimal[] P00507_A6062ProForCPo ;
   private String[] P00507_A5358ProForClv ;
   private byte[] P00507_A3379ProForTnq ;
   private byte[] P00507_A1645ProForNro ;
   private String[] P00507_A763ProForCla ;
   private java.math.BigDecimal[] P00507_A762ProForCan ;
   private byte[] P00507_A490ForPrdUMe ;
   private String[] P00507_A770ProForPrd ;
   private short[] P00507_A767ProForLin ;
   private String[] P00507_A396EmprCod ;
}

final  class pduppro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00502", "SELECT ProForCod, EmprCod FROM TXPCPROFO WHERE (EmprCod = ? and ProForCod = ?) AND (? = 1) ORDER BY EmprCod, ProForCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00503", "DELETE FROM TXPLPROFO  WHERE EmprCod = ? and ProForCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
         ,new UpdateCursor("P00504", "DELETE FROM TXPCPROFO  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPROFO")
         ,new ForEachCursor("P00505", "SELECT ProForCod, ProForRs, ProForAct, ProNh2o, ProForMer, ProH2O, ProforVl, ProForCos, ProForAbs, ProForPhn, ProForPhx, ProForCol, ProForLab, ProForFab, ProForTip, IntCodF2, ProForFac, ProFoLCU, ProForDCi, ProForCCi, ProForDsc2, ProForRb, ProForPau, ProForObs, ProRev, ProNumRec, ProNumPro, ProForUli, PorForFul, ProForMat, ProForTmx, ProForTie, ProForDsc, EmprCod FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00506", "INSERT INTO TXPCPROFO(EmprCod, ProForCod, ProForDsc, ProForTie, ProForTmx, ProForMat, PorForFul, ProForUli, ProNumPro, ProNumRec, ProRev, ProForObs, ProForPau, ProForRb, ProForDsc2, ProForCCi, ProForDCi, ProFoLCU, ProForFac, IntCodF2, ProForTip, ProForFab, ProForLab, ProForCol, ProForPhx, ProForPhn, ProForAbs, ProForCos, ProforVl, ProH2O, ProForMer, ProNh2o, ProForAct, ProForRs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPROFO")
         ,new ForEachCursor("P00507", "SELECT ProForCod, ProForDe2, ProForFT, ProForDes, ProForCPo, ProForClv, ProForTnq, ProForNro, ProForCla, ProForCan, ForPrdUMe, ProForPrd, ProForLin, EmprCod FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00508", "INSERT INTO TXPLPROFO(EmprCod, ProForCod, ProForLin, ProForPrd, ForPrdUMe, ProForCan, ProForCla, ProForNro, ProForTnq, ProForClv, ProForCPo, ProForDes, ProForFT, ProForDe2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 6);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 1);
               ((short[]) buf[20])[0] = rslt.getShort(16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(18);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(19, 16);
               ((String[]) buf[27])[0] = rslt.getString(20, 10);
               ((String[]) buf[28])[0] = rslt.getString(21, 40);
               ((short[]) buf[29])[0] = rslt.getShort(22);
               ((short[]) buf[30])[0] = rslt.getShort(23);
               ((String[]) buf[31])[0] = rslt.getVarchar(24);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(25, 1);
               ((int[]) buf[34])[0] = rslt.getInt(26);
               ((int[]) buf[35])[0] = rslt.getInt(27);
               ((short[]) buf[36])[0] = rslt.getShort(28);
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDate(29);
               ((String[]) buf[38])[0] = rslt.getString(30, 16);
               ((short[]) buf[39])[0] = rslt.getShort(31);
               ((short[]) buf[40])[0] = rslt.getShort(32);
               ((String[]) buf[41])[0] = rslt.getString(33, 30);
               ((String[]) buf[42])[0] = rslt.getString(34, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 6);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
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
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
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
      }
   }

}

