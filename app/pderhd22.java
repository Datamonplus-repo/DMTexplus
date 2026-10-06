package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pderhd22 extends GXProcedure
{
   public pderhd22( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pderhd22.class ), "" );
   }

   public pderhd22( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     short[] aP1 )
   {
      pderhd22.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             java.util.Date[] aP2 )
   {
      pderhd22.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pderhd22.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pderhd22.this.AV17RpExHdFe = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02CK2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17RpExHdFe});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2711RpExHdFe = P02CK2_A2711RpExHdFe[0] ;
         A2248ManCod = P02CK2_A2248ManCod[0] ;
         A396EmprCod = P02CK2_A396EmprCod[0] ;
         /* Using cursor P02CK3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2713RpExHdLi = P02CK3_A2713RpExHdLi[0] ;
            A2714RpExHdAlb = P02CK3_A2714RpExHdAlb[0] ;
            n2714RpExHdAlb = P02CK3_n2714RpExHdAlb[0] ;
            A2847RpExHdMts = P02CK3_A2847RpExHdMts[0] ;
            n2847RpExHdMts = P02CK3_n2847RpExHdMts[0] ;
            A2715RpExHdKgs = P02CK3_A2715RpExHdKgs[0] ;
            n2715RpExHdKgs = P02CK3_n2715RpExHdKgs[0] ;
            A2716RpExHdCns = P02CK3_A2716RpExHdCns[0] ;
            n2716RpExHdCns = P02CK3_n2716RpExHdCns[0] ;
            A129BarCod = P02CK3_A129BarCod[0] ;
            n129BarCod = P02CK3_n129BarCod[0] ;
            A132BarCodReo = P02CK3_A132BarCodReo[0] ;
            n132BarCodReo = P02CK3_n132BarCodReo[0] ;
            A130BarCodPar = P02CK3_A130BarCodPar[0] ;
            n130BarCodPar = P02CK3_n130BarCodPar[0] ;
            A6262RpExSalLn = P02CK3_A6262RpExSalLn[0] ;
            n6262RpExSalLn = P02CK3_n6262RpExSalLn[0] ;
            AV19FasCod = "" ;
            AV20BarCod = A129BarCod ;
            AV21BarCodReo = A132BarCodReo ;
            AV22BarCodPar = A130BarCodPar ;
            AV23RpExSalLn = A6262RpExSalLn ;
            /* Using cursor P02CK4 */
            pr_default.execute(2, new Object[] {AV15EmprCod, Boolean.valueOf(n2714RpExHdAlb), Integer.valueOf(A2714RpExHdAlb), Integer.valueOf(AV20BarCod), Byte.valueOf(AV21BarCodReo), AV22BarCodPar, Short.valueOf(AV23RpExSalLn)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2253SalExtAlb = P02CK4_A2253SalExtAlb[0] ;
               A6248SalExNln = P02CK4_A6248SalExNln[0] ;
               A130BarCodPar = P02CK4_A130BarCodPar[0] ;
               n130BarCodPar = P02CK4_n130BarCodPar[0] ;
               A132BarCodReo = P02CK4_A132BarCodReo[0] ;
               n132BarCodReo = P02CK4_n132BarCodReo[0] ;
               A129BarCod = P02CK4_A129BarCod[0] ;
               n129BarCod = P02CK4_n129BarCod[0] ;
               A396EmprCod = P02CK4_A396EmprCod[0] ;
               A6558FasCodn = P02CK4_A6558FasCodn[0] ;
               A6255SalExMtR = P02CK4_A6255SalExMtR[0] ;
               A6251SalExKgR = P02CK4_A6251SalExKgR[0] ;
               A6252SalExCoR = P02CK4_A6252SalExCoR[0] ;
               A6253SalExEsB = P02CK4_A6253SalExEsB[0] ;
               AV19FasCod = A6558FasCodn ;
               A6255SalExMtR = A6255SalExMtR.subtract(A2847RpExHdMts) ;
               A6255SalExMtR = ((A6255SalExMtR.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : A6255SalExMtR) ;
               A6251SalExKgR = A6251SalExKgR.subtract(A2715RpExHdKgs) ;
               A6251SalExKgR = ((A6251SalExKgR.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : A6251SalExKgR) ;
               A6252SalExCoR = (int)(A6252SalExCoR-A2716RpExHdCns) ;
               A6252SalExCoR = ((A6252SalExCoR<0) ? 0 : A6252SalExCoR) ;
               if ( (0==A6252SalExCoR) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6251SalExKgR)==0) )
               {
                  A6253SalExEsB = (byte)(1) ;
               }
               /* Using cursor P02CK5 */
               pr_default.execute(3, new Object[] {A6255SalExMtR, A6251SalExKgR, Integer.valueOf(A6252SalExCoR), Byte.valueOf(A6253SalExEsB), A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Using cursor P02CK6 */
            pr_default.execute(4, new Object[] {AV15EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2713RpExHdLi), Short.valueOf(AV16ManCod), AV19FasCod});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A2704ExHdrExL = P02CK6_A2704ExHdrExL[0] ;
               n2704ExHdrExL = P02CK6_n2704ExHdrExL[0] ;
               A2693ExHdrTip = P02CK6_A2693ExHdrTip[0] ;
               n2693ExHdrTip = P02CK6_n2693ExHdrTip[0] ;
               A2689ExHdrFas = P02CK6_A2689ExHdrFas[0] ;
               A2248ManCod = P02CK6_A2248ManCod[0] ;
               A396EmprCod = P02CK6_A396EmprCod[0] ;
               A2692ExHdrLin = P02CK6_A2692ExHdrLin[0] ;
               if ( GXutil.strcmp(A2693ExHdrTip, httpContext.getMessage( "R", "")) == 0 )
               {
                  /* Using cursor P02CK7 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, Integer.valueOf(A2692ExHdrLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVH");
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Using cursor P02CK8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLREXHD");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P02CK9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCREXHD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pderhd22.this.AV15EmprCod;
      this.aP1[0] = pderhd22.this.AV16ManCod;
      this.aP2[0] = pderhd22.this.AV17RpExHdFe;
      Application.commitDataStores(context, remoteHandle, pr_default, "pderhd22");
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
      P02CK2_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P02CK2_A2248ManCod = new short[1] ;
      P02CK2_A396EmprCod = new String[] {""} ;
      A2711RpExHdFe = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P02CK3_A396EmprCod = new String[] {""} ;
      P02CK3_A2248ManCod = new short[1] ;
      P02CK3_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P02CK3_A2713RpExHdLi = new short[1] ;
      P02CK3_A2714RpExHdAlb = new int[1] ;
      P02CK3_n2714RpExHdAlb = new boolean[] {false} ;
      P02CK3_A2847RpExHdMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CK3_n2847RpExHdMts = new boolean[] {false} ;
      P02CK3_A2715RpExHdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CK3_n2715RpExHdKgs = new boolean[] {false} ;
      P02CK3_A2716RpExHdCns = new short[1] ;
      P02CK3_n2716RpExHdCns = new boolean[] {false} ;
      P02CK3_A129BarCod = new int[1] ;
      P02CK3_n129BarCod = new boolean[] {false} ;
      P02CK3_A132BarCodReo = new byte[1] ;
      P02CK3_n132BarCodReo = new boolean[] {false} ;
      P02CK3_A130BarCodPar = new String[] {""} ;
      P02CK3_n130BarCodPar = new boolean[] {false} ;
      P02CK3_A6262RpExSalLn = new short[1] ;
      P02CK3_n6262RpExSalLn = new boolean[] {false} ;
      A2847RpExHdMts = DecimalUtil.ZERO ;
      A2715RpExHdKgs = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      AV19FasCod = "" ;
      AV22BarCodPar = "" ;
      P02CK4_A2253SalExtAlb = new int[1] ;
      P02CK4_A6248SalExNln = new short[1] ;
      P02CK4_A130BarCodPar = new String[] {""} ;
      P02CK4_n130BarCodPar = new boolean[] {false} ;
      P02CK4_A132BarCodReo = new byte[1] ;
      P02CK4_n132BarCodReo = new boolean[] {false} ;
      P02CK4_A129BarCod = new int[1] ;
      P02CK4_n129BarCod = new boolean[] {false} ;
      P02CK4_A396EmprCod = new String[] {""} ;
      P02CK4_A6558FasCodn = new String[] {""} ;
      P02CK4_A6255SalExMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CK4_A6251SalExKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CK4_A6252SalExCoR = new int[1] ;
      P02CK4_A6253SalExEsB = new byte[1] ;
      A6558FasCodn = "" ;
      A6255SalExMtR = DecimalUtil.ZERO ;
      A6251SalExKgR = DecimalUtil.ZERO ;
      P02CK6_A129BarCod = new int[1] ;
      P02CK6_n129BarCod = new boolean[] {false} ;
      P02CK6_A132BarCodReo = new byte[1] ;
      P02CK6_n132BarCodReo = new boolean[] {false} ;
      P02CK6_A130BarCodPar = new String[] {""} ;
      P02CK6_n130BarCodPar = new boolean[] {false} ;
      P02CK6_A2704ExHdrExL = new short[1] ;
      P02CK6_n2704ExHdrExL = new boolean[] {false} ;
      P02CK6_A2693ExHdrTip = new String[] {""} ;
      P02CK6_n2693ExHdrTip = new boolean[] {false} ;
      P02CK6_A2689ExHdrFas = new String[] {""} ;
      P02CK6_A2248ManCod = new short[1] ;
      P02CK6_A396EmprCod = new String[] {""} ;
      P02CK6_A2692ExHdrLin = new int[1] ;
      A2693ExHdrTip = "" ;
      A2689ExHdrFas = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pderhd22__default(),
         new Object[] {
             new Object[] {
            P02CK2_A2711RpExHdFe, P02CK2_A2248ManCod, P02CK2_A396EmprCod
            }
            , new Object[] {
            P02CK3_A396EmprCod, P02CK3_A2248ManCod, P02CK3_A2711RpExHdFe, P02CK3_A2713RpExHdLi, P02CK3_A2714RpExHdAlb, P02CK3_n2714RpExHdAlb, P02CK3_A2847RpExHdMts, P02CK3_n2847RpExHdMts, P02CK3_A2715RpExHdKgs, P02CK3_n2715RpExHdKgs,
            P02CK3_A2716RpExHdCns, P02CK3_n2716RpExHdCns, P02CK3_A129BarCod, P02CK3_A132BarCodReo, P02CK3_A130BarCodPar, P02CK3_A6262RpExSalLn, P02CK3_n6262RpExSalLn
            }
            , new Object[] {
            P02CK4_A2253SalExtAlb, P02CK4_A6248SalExNln, P02CK4_A130BarCodPar, P02CK4_A132BarCodReo, P02CK4_A129BarCod, P02CK4_A396EmprCod, P02CK4_A6558FasCodn, P02CK4_A6255SalExMtR, P02CK4_A6251SalExKgR, P02CK4_A6252SalExCoR,
            P02CK4_A6253SalExEsB
            }
            , new Object[] {
            }
            , new Object[] {
            P02CK6_A129BarCod, P02CK6_n129BarCod, P02CK6_A132BarCodReo, P02CK6_n132BarCodReo, P02CK6_A130BarCodPar, P02CK6_n130BarCodPar, P02CK6_A2704ExHdrExL, P02CK6_n2704ExHdrExL, P02CK6_A2693ExHdrTip, P02CK6_n2693ExHdrTip,
            P02CK6_A2689ExHdrFas, P02CK6_A2248ManCod, P02CK6_A396EmprCod, P02CK6_A2692ExHdrLin
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

   private byte A132BarCodReo ;
   private byte AV21BarCodReo ;
   private byte A6253SalExEsB ;
   private short AV16ManCod ;
   private short A2248ManCod ;
   private short A2713RpExHdLi ;
   private short A2716RpExHdCns ;
   private short A6262RpExSalLn ;
   private short AV23RpExSalLn ;
   private short A6248SalExNln ;
   private short A2704ExHdrExL ;
   private short Gx_err ;
   private int A2714RpExHdAlb ;
   private int A129BarCod ;
   private int AV20BarCod ;
   private int A2253SalExtAlb ;
   private int A6252SalExCoR ;
   private int A2692ExHdrLin ;
   private java.math.BigDecimal A2847RpExHdMts ;
   private java.math.BigDecimal A2715RpExHdKgs ;
   private java.math.BigDecimal A6255SalExMtR ;
   private java.math.BigDecimal A6251SalExKgR ;
   private String AV15EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV19FasCod ;
   private String AV22BarCodPar ;
   private String A6558FasCodn ;
   private String A2693ExHdrTip ;
   private String A2689ExHdrFas ;
   private java.util.Date AV17RpExHdFe ;
   private java.util.Date A2711RpExHdFe ;
   private boolean n2714RpExHdAlb ;
   private boolean n2847RpExHdMts ;
   private boolean n2715RpExHdKgs ;
   private boolean n2716RpExHdCns ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n6262RpExSalLn ;
   private boolean n2704ExHdrExL ;
   private boolean n2693ExHdrTip ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P02CK2_A2711RpExHdFe ;
   private short[] P02CK2_A2248ManCod ;
   private String[] P02CK2_A396EmprCod ;
   private String[] P02CK3_A396EmprCod ;
   private short[] P02CK3_A2248ManCod ;
   private java.util.Date[] P02CK3_A2711RpExHdFe ;
   private short[] P02CK3_A2713RpExHdLi ;
   private int[] P02CK3_A2714RpExHdAlb ;
   private boolean[] P02CK3_n2714RpExHdAlb ;
   private java.math.BigDecimal[] P02CK3_A2847RpExHdMts ;
   private boolean[] P02CK3_n2847RpExHdMts ;
   private java.math.BigDecimal[] P02CK3_A2715RpExHdKgs ;
   private boolean[] P02CK3_n2715RpExHdKgs ;
   private short[] P02CK3_A2716RpExHdCns ;
   private boolean[] P02CK3_n2716RpExHdCns ;
   private int[] P02CK3_A129BarCod ;
   private boolean[] P02CK3_n129BarCod ;
   private byte[] P02CK3_A132BarCodReo ;
   private boolean[] P02CK3_n132BarCodReo ;
   private String[] P02CK3_A130BarCodPar ;
   private boolean[] P02CK3_n130BarCodPar ;
   private short[] P02CK3_A6262RpExSalLn ;
   private boolean[] P02CK3_n6262RpExSalLn ;
   private int[] P02CK4_A2253SalExtAlb ;
   private short[] P02CK4_A6248SalExNln ;
   private String[] P02CK4_A130BarCodPar ;
   private boolean[] P02CK4_n130BarCodPar ;
   private byte[] P02CK4_A132BarCodReo ;
   private boolean[] P02CK4_n132BarCodReo ;
   private int[] P02CK4_A129BarCod ;
   private boolean[] P02CK4_n129BarCod ;
   private String[] P02CK4_A396EmprCod ;
   private String[] P02CK4_A6558FasCodn ;
   private java.math.BigDecimal[] P02CK4_A6255SalExMtR ;
   private java.math.BigDecimal[] P02CK4_A6251SalExKgR ;
   private int[] P02CK4_A6252SalExCoR ;
   private byte[] P02CK4_A6253SalExEsB ;
   private int[] P02CK6_A129BarCod ;
   private boolean[] P02CK6_n129BarCod ;
   private byte[] P02CK6_A132BarCodReo ;
   private boolean[] P02CK6_n132BarCodReo ;
   private String[] P02CK6_A130BarCodPar ;
   private boolean[] P02CK6_n130BarCodPar ;
   private short[] P02CK6_A2704ExHdrExL ;
   private boolean[] P02CK6_n2704ExHdrExL ;
   private String[] P02CK6_A2693ExHdrTip ;
   private boolean[] P02CK6_n2693ExHdrTip ;
   private String[] P02CK6_A2689ExHdrFas ;
   private short[] P02CK6_A2248ManCod ;
   private String[] P02CK6_A396EmprCod ;
   private int[] P02CK6_A2692ExHdrLin ;
}

final  class pderhd22__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02CK2", "SELECT RpExHdFe, ManCod, EmprCod FROM TXPCREXHD WHERE EmprCod = ? and ManCod = ? and RpExHdFe = ? ORDER BY EmprCod, ManCod, RpExHdFe ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02CK3", "SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi, RpExHdAlb, RpExHdMts, RpExHdKgs, RpExHdCns, BarCod, BarCodReo, BarCodPar, RpExSalLn FROM TXPLREXHD WHERE EmprCod = ? and ManCod = ? and RpExHdFe = ? ORDER BY EmprCod, ManCod, RpExHdFe ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02CK4", "SELECT SalExtAlb, SalExNln, BarCodPar, BarCodReo, BarCod, EmprCod, FasCodn, SalExMtR, SalExKgR, SalExCoR, SalExEsB FROM TXPEXHDPZ WHERE (EmprCod = ? and SalExtAlb = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (SalExNln = ?) ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02CK5", "UPDATE TXPEXHDPZ SET SalExMtR=?, SalExKgR=?, SalExCoR=?, SalExEsB=?  WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEXHDPZ")
         ,new ForEachCursor("P02CK6", "SELECT BarCod, BarCodReo, BarCodPar, ExHdrExL, ExHdrTip, ExHdrFas, ManCod, EmprCod, ExHdrLin FROM TXPLEXMVH WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (ExHdrExL = ?) AND (ManCod = ?) AND (ExHdrFas = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02CK7", "DELETE FROM TXPLEXMVH  WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ? AND ExHdrLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVH")
         ,new UpdateCursor("P02CK8", "DELETE FROM TXPLREXHD  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? AND RpExHdLi = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLREXHD")
         ,new UpdateCursor("P02CK9", "DELETE FROM TXPCREXHD  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCREXHD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(9);
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 1);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 8);
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((int[]) buf[13])[0] = rslt.getInt(9);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               stmt.setString(7, (String)parms[9], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
      }
   }

}

