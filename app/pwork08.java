package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pwork08 extends GXProcedure
{
   public pwork08( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pwork08.class ), "" );
   }

   public pwork08( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        java.util.Date aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             java.util.Date aP2 )
   {
      pwork08.this.AV8EmprCod = aP0;
      pwork08.this.AV9Mancod = aP1;
      pwork08.this.AV11RpExHdFe = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV13WorkEstadoFase ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "WORKST", ""), GXv_int2) ;
      pwork08.this.GXt_int1 = GXv_int2[0] ;
      AV13WorkEstadoFase = GXt_int1 ;
      /* Using cursor P091K2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Short.valueOf(AV9Mancod), AV11RpExHdFe});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2711RpExHdFe = P091K2_A2711RpExHdFe[0] ;
         A2248ManCod = P091K2_A2248ManCod[0] ;
         A396EmprCod = P091K2_A396EmprCod[0] ;
         /* Using cursor P091K3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2713RpExHdLi = P091K3_A2713RpExHdLi[0] ;
            A2714RpExHdAlb = P091K3_A2714RpExHdAlb[0] ;
            n2714RpExHdAlb = P091K3_n2714RpExHdAlb[0] ;
            A2847RpExHdMts = P091K3_A2847RpExHdMts[0] ;
            n2847RpExHdMts = P091K3_n2847RpExHdMts[0] ;
            A2715RpExHdKgs = P091K3_A2715RpExHdKgs[0] ;
            n2715RpExHdKgs = P091K3_n2715RpExHdKgs[0] ;
            A2716RpExHdCns = P091K3_A2716RpExHdCns[0] ;
            n2716RpExHdCns = P091K3_n2716RpExHdCns[0] ;
            A129BarCod = P091K3_A129BarCod[0] ;
            n129BarCod = P091K3_n129BarCod[0] ;
            A132BarCodReo = P091K3_A132BarCodReo[0] ;
            n132BarCodReo = P091K3_n132BarCodReo[0] ;
            A130BarCodPar = P091K3_A130BarCodPar[0] ;
            n130BarCodPar = P091K3_n130BarCodPar[0] ;
            A6262RpExSalLn = P091K3_A6262RpExSalLn[0] ;
            n6262RpExSalLn = P091K3_n6262RpExSalLn[0] ;
            AV12FasCod = "" ;
            AV14BarCod = A129BarCod ;
            AV15BarCodReo = A132BarCodReo ;
            AV16BarCodPar = A130BarCodPar ;
            AV17RpExSalLn = A6262RpExSalLn ;
            /* Using cursor P091K4 */
            pr_default.execute(2, new Object[] {AV8EmprCod, Boolean.valueOf(n2714RpExHdAlb), Integer.valueOf(A2714RpExHdAlb), Integer.valueOf(AV14BarCod), Byte.valueOf(AV15BarCodReo), AV16BarCodPar, Short.valueOf(AV17RpExSalLn)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2253SalExtAlb = P091K4_A2253SalExtAlb[0] ;
               A6248SalExNln = P091K4_A6248SalExNln[0] ;
               A130BarCodPar = P091K4_A130BarCodPar[0] ;
               n130BarCodPar = P091K4_n130BarCodPar[0] ;
               A132BarCodReo = P091K4_A132BarCodReo[0] ;
               n132BarCodReo = P091K4_n132BarCodReo[0] ;
               A129BarCod = P091K4_A129BarCod[0] ;
               n129BarCod = P091K4_n129BarCod[0] ;
               A396EmprCod = P091K4_A396EmprCod[0] ;
               A6558FasCodn = P091K4_A6558FasCodn[0] ;
               A654OrdLin = P091K4_A654OrdLin[0] ;
               A6255SalExMtR = P091K4_A6255SalExMtR[0] ;
               A6251SalExKgR = P091K4_A6251SalExKgR[0] ;
               A6252SalExCoR = P091K4_A6252SalExCoR[0] ;
               A6253SalExEsB = P091K4_A6253SalExEsB[0] ;
               AV12FasCod = A6558FasCodn ;
               AV18BarOrdlin = A654OrdLin ;
               /* Execute user subroutine: 'BARFAS' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
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
               /* Using cursor P091K5 */
               pr_default.execute(3, new Object[] {A6255SalExMtR, A6251SalExKgR, Integer.valueOf(A6252SalExCoR), Byte.valueOf(A6253SalExEsB), A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Optimized DELETE. */
            /* Using cursor P091K6 */
            pr_default.execute(4, new Object[] {AV8EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2713RpExHdLi), Short.valueOf(AV9Mancod), AV12FasCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVH");
            /* End optimized DELETE. */
            /* Using cursor P091K7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLREXHD");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P091K8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCREXHD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      /* Using cursor P091K9 */
      pr_default.execute(7, new Object[] {AV8EmprCod, Integer.valueOf(AV14BarCod), Byte.valueOf(AV15BarCodReo), AV16BarCodPar});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A130BarCodPar = P091K9_A130BarCodPar[0] ;
         n130BarCodPar = P091K9_n130BarCodPar[0] ;
         A132BarCodReo = P091K9_A132BarCodReo[0] ;
         n132BarCodReo = P091K9_n132BarCodReo[0] ;
         A129BarCod = P091K9_A129BarCod[0] ;
         n129BarCod = P091K9_n129BarCod[0] ;
         A396EmprCod = P091K9_A396EmprCod[0] ;
         A2265BarExt = P091K9_A2265BarExt[0] ;
         n2265BarExt = P091K9_n2265BarExt[0] ;
         n4443BarFasDTF = false ;
         /* Optimized UPDATE. */
         /* Using cursor P091K10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(AV18BarOrdlin), AV12FasCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         /* End optimized UPDATE. */
         A2265BarExt = (byte)(1) ;
         n2265BarExt = false ;
         /* Using cursor P091K11 */
         pr_default.execute(9, new Object[] {Boolean.valueOf(n2265BarExt), Byte.valueOf(A2265BarExt), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pwork08");
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
      P091K2_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P091K2_A2248ManCod = new short[1] ;
      P091K2_A396EmprCod = new String[] {""} ;
      A2711RpExHdFe = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P091K3_A396EmprCod = new String[] {""} ;
      P091K3_A2248ManCod = new short[1] ;
      P091K3_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P091K3_A2713RpExHdLi = new short[1] ;
      P091K3_A2714RpExHdAlb = new int[1] ;
      P091K3_n2714RpExHdAlb = new boolean[] {false} ;
      P091K3_A2847RpExHdMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091K3_n2847RpExHdMts = new boolean[] {false} ;
      P091K3_A2715RpExHdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091K3_n2715RpExHdKgs = new boolean[] {false} ;
      P091K3_A2716RpExHdCns = new short[1] ;
      P091K3_n2716RpExHdCns = new boolean[] {false} ;
      P091K3_A129BarCod = new int[1] ;
      P091K3_n129BarCod = new boolean[] {false} ;
      P091K3_A132BarCodReo = new byte[1] ;
      P091K3_n132BarCodReo = new boolean[] {false} ;
      P091K3_A130BarCodPar = new String[] {""} ;
      P091K3_n130BarCodPar = new boolean[] {false} ;
      P091K3_A6262RpExSalLn = new short[1] ;
      P091K3_n6262RpExSalLn = new boolean[] {false} ;
      A2847RpExHdMts = DecimalUtil.ZERO ;
      A2715RpExHdKgs = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      AV12FasCod = "" ;
      AV16BarCodPar = "" ;
      P091K4_A2253SalExtAlb = new int[1] ;
      P091K4_A6248SalExNln = new short[1] ;
      P091K4_A130BarCodPar = new String[] {""} ;
      P091K4_n130BarCodPar = new boolean[] {false} ;
      P091K4_A132BarCodReo = new byte[1] ;
      P091K4_n132BarCodReo = new boolean[] {false} ;
      P091K4_A129BarCod = new int[1] ;
      P091K4_n129BarCod = new boolean[] {false} ;
      P091K4_A396EmprCod = new String[] {""} ;
      P091K4_A6558FasCodn = new String[] {""} ;
      P091K4_A654OrdLin = new short[1] ;
      P091K4_A6255SalExMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091K4_A6251SalExKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091K4_A6252SalExCoR = new int[1] ;
      P091K4_A6253SalExEsB = new byte[1] ;
      A6558FasCodn = "" ;
      A6255SalExMtR = DecimalUtil.ZERO ;
      A6251SalExKgR = DecimalUtil.ZERO ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      P091K9_A130BarCodPar = new String[] {""} ;
      P091K9_n130BarCodPar = new boolean[] {false} ;
      P091K9_A132BarCodReo = new byte[1] ;
      P091K9_n132BarCodReo = new boolean[] {false} ;
      P091K9_A129BarCod = new int[1] ;
      P091K9_n129BarCod = new boolean[] {false} ;
      P091K9_A396EmprCod = new String[] {""} ;
      P091K9_A2265BarExt = new byte[1] ;
      P091K9_n2265BarExt = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pwork08__default(),
         new Object[] {
             new Object[] {
            P091K2_A2711RpExHdFe, P091K2_A2248ManCod, P091K2_A396EmprCod
            }
            , new Object[] {
            P091K3_A396EmprCod, P091K3_A2248ManCod, P091K3_A2711RpExHdFe, P091K3_A2713RpExHdLi, P091K3_A2714RpExHdAlb, P091K3_n2714RpExHdAlb, P091K3_A2847RpExHdMts, P091K3_n2847RpExHdMts, P091K3_A2715RpExHdKgs, P091K3_n2715RpExHdKgs,
            P091K3_A2716RpExHdCns, P091K3_n2716RpExHdCns, P091K3_A129BarCod, P091K3_A132BarCodReo, P091K3_A130BarCodPar, P091K3_A6262RpExSalLn, P091K3_n6262RpExSalLn
            }
            , new Object[] {
            P091K4_A2253SalExtAlb, P091K4_A6248SalExNln, P091K4_A130BarCodPar, P091K4_A132BarCodReo, P091K4_A129BarCod, P091K4_A396EmprCod, P091K4_A6558FasCodn, P091K4_A654OrdLin, P091K4_A6255SalExMtR, P091K4_A6251SalExKgR,
            P091K4_A6252SalExCoR, P091K4_A6253SalExEsB
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P091K9_A130BarCodPar, P091K9_A132BarCodReo, P091K9_A129BarCod, P091K9_A396EmprCod, P091K9_A2265BarExt, P091K9_n2265BarExt
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

   private byte AV13WorkEstadoFase ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte AV15BarCodReo ;
   private byte A6253SalExEsB ;
   private byte A2265BarExt ;
   private short AV9Mancod ;
   private short A2248ManCod ;
   private short A2713RpExHdLi ;
   private short A2716RpExHdCns ;
   private short A6262RpExSalLn ;
   private short AV17RpExSalLn ;
   private short A6248SalExNln ;
   private short A654OrdLin ;
   private short AV18BarOrdlin ;
   private short Gx_err ;
   private int A2714RpExHdAlb ;
   private int A129BarCod ;
   private int AV14BarCod ;
   private int A2253SalExtAlb ;
   private int A6252SalExCoR ;
   private java.math.BigDecimal A2847RpExHdMts ;
   private java.math.BigDecimal A2715RpExHdKgs ;
   private java.math.BigDecimal A6255SalExMtR ;
   private java.math.BigDecimal A6251SalExKgR ;
   private String AV8EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV12FasCod ;
   private String AV16BarCodPar ;
   private String A6558FasCodn ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV11RpExHdFe ;
   private java.util.Date A2711RpExHdFe ;
   private boolean n2714RpExHdAlb ;
   private boolean n2847RpExHdMts ;
   private boolean n2715RpExHdKgs ;
   private boolean n2716RpExHdCns ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n6262RpExSalLn ;
   private boolean returnInSub ;
   private boolean n2265BarExt ;
   private boolean n4443BarFasDTF ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P091K2_A2711RpExHdFe ;
   private short[] P091K2_A2248ManCod ;
   private String[] P091K2_A396EmprCod ;
   private String[] P091K3_A396EmprCod ;
   private short[] P091K3_A2248ManCod ;
   private java.util.Date[] P091K3_A2711RpExHdFe ;
   private short[] P091K3_A2713RpExHdLi ;
   private int[] P091K3_A2714RpExHdAlb ;
   private boolean[] P091K3_n2714RpExHdAlb ;
   private java.math.BigDecimal[] P091K3_A2847RpExHdMts ;
   private boolean[] P091K3_n2847RpExHdMts ;
   private java.math.BigDecimal[] P091K3_A2715RpExHdKgs ;
   private boolean[] P091K3_n2715RpExHdKgs ;
   private short[] P091K3_A2716RpExHdCns ;
   private boolean[] P091K3_n2716RpExHdCns ;
   private int[] P091K3_A129BarCod ;
   private boolean[] P091K3_n129BarCod ;
   private byte[] P091K3_A132BarCodReo ;
   private boolean[] P091K3_n132BarCodReo ;
   private String[] P091K3_A130BarCodPar ;
   private boolean[] P091K3_n130BarCodPar ;
   private short[] P091K3_A6262RpExSalLn ;
   private boolean[] P091K3_n6262RpExSalLn ;
   private int[] P091K4_A2253SalExtAlb ;
   private short[] P091K4_A6248SalExNln ;
   private String[] P091K4_A130BarCodPar ;
   private boolean[] P091K4_n130BarCodPar ;
   private byte[] P091K4_A132BarCodReo ;
   private boolean[] P091K4_n132BarCodReo ;
   private int[] P091K4_A129BarCod ;
   private boolean[] P091K4_n129BarCod ;
   private String[] P091K4_A396EmprCod ;
   private String[] P091K4_A6558FasCodn ;
   private short[] P091K4_A654OrdLin ;
   private java.math.BigDecimal[] P091K4_A6255SalExMtR ;
   private java.math.BigDecimal[] P091K4_A6251SalExKgR ;
   private int[] P091K4_A6252SalExCoR ;
   private byte[] P091K4_A6253SalExEsB ;
   private String[] P091K9_A130BarCodPar ;
   private boolean[] P091K9_n130BarCodPar ;
   private byte[] P091K9_A132BarCodReo ;
   private boolean[] P091K9_n132BarCodReo ;
   private int[] P091K9_A129BarCod ;
   private boolean[] P091K9_n129BarCod ;
   private String[] P091K9_A396EmprCod ;
   private byte[] P091K9_A2265BarExt ;
   private boolean[] P091K9_n2265BarExt ;
}

final  class pwork08__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P091K2", "SELECT RpExHdFe, ManCod, EmprCod FROM TXPCREXHD WHERE EmprCod = ? and ManCod = ? and RpExHdFe = ? ORDER BY EmprCod, ManCod, RpExHdFe ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P091K3", "SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi, RpExHdAlb, RpExHdMts, RpExHdKgs, RpExHdCns, BarCod, BarCodReo, BarCodPar, RpExSalLn FROM TXPLREXHD WHERE EmprCod = ? and ManCod = ? and RpExHdFe = ? ORDER BY EmprCod, ManCod, RpExHdFe ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P091K4", "SELECT SalExtAlb, SalExNln, BarCodPar, BarCodReo, BarCod, EmprCod, FasCodn, OrdLin, SalExMtR, SalExKgR, SalExCoR, SalExEsB FROM TXPEXHDPZ WHERE (EmprCod = ? and SalExtAlb = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (SalExNln = ?) ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P091K5", "UPDATE TXPEXHDPZ SET SalExMtR=?, SalExKgR=?, SalExCoR=?, SalExEsB=?  WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEXHDPZ")
         ,new UpdateCursor("P091K6", "DELETE FROM TXPLEXMVH  WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (ExHdrExL = ?) AND (ManCod = ?) AND (ExHdrFas = ?) AND (ExHdrTip = 'R')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVH")
         ,new UpdateCursor("P091K7", "DELETE FROM TXPLREXHD  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? AND RpExHdLi = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLREXHD")
         ,new UpdateCursor("P091K8", "DELETE FROM TXPCREXHD  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCREXHD")
         ,new ForEachCursor("P091K9", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarExt FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P091K10", "UPDATE TXPBARFAS SET BarFasDTF=TO_DATE('0001-01-01', 'YYYY-MM-DD'), BarFasEst=1  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? and FasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P091K11", "UPDATE TXPBARCAD SET BarExt=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
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
               stmt.setString(6, (String)parms[8], 8);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 1);
               }
               return;
      }
   }

}

