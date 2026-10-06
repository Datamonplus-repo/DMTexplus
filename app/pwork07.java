package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pwork07 extends GXProcedure
{
   public pwork07( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pwork07.class ), "" );
   }

   public pwork07( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            short[] aP1 ,
                            java.util.Date[] aP2 )
   {
      pwork07.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        java.util.Date[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             java.util.Date[] aP2 ,
                             short[] aP3 )
   {
      pwork07.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      pwork07.this.AV9ManCod = aP1[0];
      this.aP1 = aP1;
      pwork07.this.AV10RpExHdFe = aP2[0];
      this.aP2 = aP2;
      pwork07.this.AV11RpExHdLi = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P091J2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Short.valueOf(AV9ManCod), AV10RpExHdFe, Short.valueOf(AV11RpExHdLi)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2714RpExHdAlb = P091J2_A2714RpExHdAlb[0] ;
         n2714RpExHdAlb = P091J2_n2714RpExHdAlb[0] ;
         A2847RpExHdMts = P091J2_A2847RpExHdMts[0] ;
         n2847RpExHdMts = P091J2_n2847RpExHdMts[0] ;
         A2715RpExHdKgs = P091J2_A2715RpExHdKgs[0] ;
         n2715RpExHdKgs = P091J2_n2715RpExHdKgs[0] ;
         A2716RpExHdCns = P091J2_A2716RpExHdCns[0] ;
         n2716RpExHdCns = P091J2_n2716RpExHdCns[0] ;
         A2713RpExHdLi = P091J2_A2713RpExHdLi[0] ;
         A2711RpExHdFe = P091J2_A2711RpExHdFe[0] ;
         A2248ManCod = P091J2_A2248ManCod[0] ;
         A396EmprCod = P091J2_A396EmprCod[0] ;
         A129BarCod = P091J2_A129BarCod[0] ;
         n129BarCod = P091J2_n129BarCod[0] ;
         A132BarCodReo = P091J2_A132BarCodReo[0] ;
         n132BarCodReo = P091J2_n132BarCodReo[0] ;
         A130BarCodPar = P091J2_A130BarCodPar[0] ;
         n130BarCodPar = P091J2_n130BarCodPar[0] ;
         A6262RpExSalLn = P091J2_A6262RpExSalLn[0] ;
         n6262RpExSalLn = P091J2_n6262RpExSalLn[0] ;
         AV13BarCod = A129BarCod ;
         AV14BarCodReo = A132BarCodReo ;
         AV15BarCodPar = A130BarCodPar ;
         AV16RpExSalLn = A6262RpExSalLn ;
         AV17FasCod = "" ;
         /* Using cursor P091J3 */
         pr_default.execute(1, new Object[] {AV8EmprCod, Boolean.valueOf(n2714RpExHdAlb), Integer.valueOf(A2714RpExHdAlb), Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar, Short.valueOf(AV16RpExSalLn)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2253SalExtAlb = P091J3_A2253SalExtAlb[0] ;
            A6248SalExNln = P091J3_A6248SalExNln[0] ;
            A130BarCodPar = P091J3_A130BarCodPar[0] ;
            n130BarCodPar = P091J3_n130BarCodPar[0] ;
            A132BarCodReo = P091J3_A132BarCodReo[0] ;
            n132BarCodReo = P091J3_n132BarCodReo[0] ;
            A129BarCod = P091J3_A129BarCod[0] ;
            n129BarCod = P091J3_n129BarCod[0] ;
            A396EmprCod = P091J3_A396EmprCod[0] ;
            A6558FasCodn = P091J3_A6558FasCodn[0] ;
            A654OrdLin = P091J3_A654OrdLin[0] ;
            A6255SalExMtR = P091J3_A6255SalExMtR[0] ;
            A6251SalExKgR = P091J3_A6251SalExKgR[0] ;
            A6252SalExCoR = P091J3_A6252SalExCoR[0] ;
            A6253SalExEsB = P091J3_A6253SalExEsB[0] ;
            AV17FasCod = A6558FasCodn ;
            AV18BarOrdlin = A654OrdLin ;
            /* Execute user subroutine: 'BARFAS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            A6255SalExMtR = A6255SalExMtR.subtract(A2847RpExHdMts) ;
            A6251SalExKgR = A6251SalExKgR.subtract(A2715RpExHdKgs) ;
            A6252SalExCoR = (int)(A6252SalExCoR-A2716RpExHdCns) ;
            if ( (0==A6252SalExCoR) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6251SalExKgR)==0) )
            {
               A6253SalExEsB = (byte)(1) ;
            }
            /* Using cursor P091J4 */
            pr_default.execute(2, new Object[] {A6255SalExMtR, A6251SalExKgR, Integer.valueOf(A6252SalExCoR), Byte.valueOf(A6253SalExEsB), A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Optimized DELETE. */
         /* Using cursor P091J5 */
         pr_default.execute(3, new Object[] {AV8EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(AV9ManCod), AV17FasCod, Short.valueOf(AV11RpExHdLi)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVH");
         /* End optimized DELETE. */
         /* Using cursor P091J6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLREXHD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV12Flag = (short)(0) ;
      /* Using cursor P091J7 */
      pr_default.execute(5, new Object[] {AV8EmprCod, Short.valueOf(AV9ManCod), AV10RpExHdFe});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A2711RpExHdFe = P091J7_A2711RpExHdFe[0] ;
         A2248ManCod = P091J7_A2248ManCod[0] ;
         A396EmprCod = P091J7_A396EmprCod[0] ;
         A2712RpExHdUl = P091J7_A2712RpExHdUl[0] ;
         n2712RpExHdUl = P091J7_n2712RpExHdUl[0] ;
         /* Using cursor P091J8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A2713RpExHdLi = P091J8_A2713RpExHdLi[0] ;
            AV12Flag = (short)(1) ;
            pr_default.readNext(6);
         }
         pr_default.close(6);
         if ( (0==AV12Flag) )
         {
            /* Using cursor P091J9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCREXHD");
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      /* Using cursor P091J10 */
      pr_default.execute(8, new Object[] {AV8EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A130BarCodPar = P091J10_A130BarCodPar[0] ;
         n130BarCodPar = P091J10_n130BarCodPar[0] ;
         A132BarCodReo = P091J10_A132BarCodReo[0] ;
         n132BarCodReo = P091J10_n132BarCodReo[0] ;
         A129BarCod = P091J10_A129BarCod[0] ;
         n129BarCod = P091J10_n129BarCod[0] ;
         A396EmprCod = P091J10_A396EmprCod[0] ;
         A2265BarExt = P091J10_A2265BarExt[0] ;
         n2265BarExt = P091J10_n2265BarExt[0] ;
         n4443BarFasDTF = false ;
         /* Optimized UPDATE. */
         /* Using cursor P091J11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(AV18BarOrdlin), AV17FasCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         /* End optimized UPDATE. */
         A2265BarExt = (byte)(1) ;
         n2265BarExt = false ;
         /* Using cursor P091J12 */
         pr_default.execute(10, new Object[] {Boolean.valueOf(n2265BarExt), Byte.valueOf(A2265BarExt), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pwork07.this.AV8EmprCod;
      this.aP1[0] = pwork07.this.AV9ManCod;
      this.aP2[0] = pwork07.this.AV10RpExHdFe;
      this.aP3[0] = pwork07.this.AV11RpExHdLi;
      Application.commitDataStores(context, remoteHandle, pr_default, "pwork07");
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
      P091J2_A2714RpExHdAlb = new int[1] ;
      P091J2_n2714RpExHdAlb = new boolean[] {false} ;
      P091J2_A2847RpExHdMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091J2_n2847RpExHdMts = new boolean[] {false} ;
      P091J2_A2715RpExHdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091J2_n2715RpExHdKgs = new boolean[] {false} ;
      P091J2_A2716RpExHdCns = new short[1] ;
      P091J2_n2716RpExHdCns = new boolean[] {false} ;
      P091J2_A2713RpExHdLi = new short[1] ;
      P091J2_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P091J2_A2248ManCod = new short[1] ;
      P091J2_A396EmprCod = new String[] {""} ;
      P091J2_A129BarCod = new int[1] ;
      P091J2_n129BarCod = new boolean[] {false} ;
      P091J2_A132BarCodReo = new byte[1] ;
      P091J2_n132BarCodReo = new boolean[] {false} ;
      P091J2_A130BarCodPar = new String[] {""} ;
      P091J2_n130BarCodPar = new boolean[] {false} ;
      P091J2_A6262RpExSalLn = new short[1] ;
      P091J2_n6262RpExSalLn = new boolean[] {false} ;
      A2847RpExHdMts = DecimalUtil.ZERO ;
      A2715RpExHdKgs = DecimalUtil.ZERO ;
      A2711RpExHdFe = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV15BarCodPar = "" ;
      AV17FasCod = "" ;
      P091J3_A2253SalExtAlb = new int[1] ;
      P091J3_A6248SalExNln = new short[1] ;
      P091J3_A130BarCodPar = new String[] {""} ;
      P091J3_n130BarCodPar = new boolean[] {false} ;
      P091J3_A132BarCodReo = new byte[1] ;
      P091J3_n132BarCodReo = new boolean[] {false} ;
      P091J3_A129BarCod = new int[1] ;
      P091J3_n129BarCod = new boolean[] {false} ;
      P091J3_A396EmprCod = new String[] {""} ;
      P091J3_A6558FasCodn = new String[] {""} ;
      P091J3_A654OrdLin = new short[1] ;
      P091J3_A6255SalExMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091J3_A6251SalExKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091J3_A6252SalExCoR = new int[1] ;
      P091J3_A6253SalExEsB = new byte[1] ;
      A6558FasCodn = "" ;
      A6255SalExMtR = DecimalUtil.ZERO ;
      A6251SalExKgR = DecimalUtil.ZERO ;
      P091J7_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P091J7_A2248ManCod = new short[1] ;
      P091J7_A396EmprCod = new String[] {""} ;
      P091J7_A2712RpExHdUl = new short[1] ;
      P091J7_n2712RpExHdUl = new boolean[] {false} ;
      P091J8_A396EmprCod = new String[] {""} ;
      P091J8_A2248ManCod = new short[1] ;
      P091J8_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P091J8_A2713RpExHdLi = new short[1] ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      P091J10_A130BarCodPar = new String[] {""} ;
      P091J10_n130BarCodPar = new boolean[] {false} ;
      P091J10_A132BarCodReo = new byte[1] ;
      P091J10_n132BarCodReo = new boolean[] {false} ;
      P091J10_A129BarCod = new int[1] ;
      P091J10_n129BarCod = new boolean[] {false} ;
      P091J10_A396EmprCod = new String[] {""} ;
      P091J10_A2265BarExt = new byte[1] ;
      P091J10_n2265BarExt = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pwork07__default(),
         new Object[] {
             new Object[] {
            P091J2_A2714RpExHdAlb, P091J2_n2714RpExHdAlb, P091J2_A2847RpExHdMts, P091J2_n2847RpExHdMts, P091J2_A2715RpExHdKgs, P091J2_n2715RpExHdKgs, P091J2_A2716RpExHdCns, P091J2_n2716RpExHdCns, P091J2_A2713RpExHdLi, P091J2_A2711RpExHdFe,
            P091J2_A2248ManCod, P091J2_A396EmprCod, P091J2_A129BarCod, P091J2_A132BarCodReo, P091J2_A130BarCodPar, P091J2_A6262RpExSalLn, P091J2_n6262RpExSalLn
            }
            , new Object[] {
            P091J3_A2253SalExtAlb, P091J3_A6248SalExNln, P091J3_A130BarCodPar, P091J3_A132BarCodReo, P091J3_A129BarCod, P091J3_A396EmprCod, P091J3_A6558FasCodn, P091J3_A654OrdLin, P091J3_A6255SalExMtR, P091J3_A6251SalExKgR,
            P091J3_A6252SalExCoR, P091J3_A6253SalExEsB
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P091J7_A2711RpExHdFe, P091J7_A2248ManCod, P091J7_A396EmprCod, P091J7_A2712RpExHdUl, P091J7_n2712RpExHdUl
            }
            , new Object[] {
            P091J8_A396EmprCod, P091J8_A2248ManCod, P091J8_A2711RpExHdFe, P091J8_A2713RpExHdLi
            }
            , new Object[] {
            }
            , new Object[] {
            P091J10_A130BarCodPar, P091J10_A132BarCodReo, P091J10_A129BarCod, P091J10_A396EmprCod, P091J10_A2265BarExt, P091J10_n2265BarExt
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
   private byte AV14BarCodReo ;
   private byte A6253SalExEsB ;
   private byte A2265BarExt ;
   private short AV9ManCod ;
   private short AV11RpExHdLi ;
   private short A2716RpExHdCns ;
   private short A2713RpExHdLi ;
   private short A2248ManCod ;
   private short A6262RpExSalLn ;
   private short AV16RpExSalLn ;
   private short A6248SalExNln ;
   private short A654OrdLin ;
   private short AV18BarOrdlin ;
   private short AV12Flag ;
   private short A2712RpExHdUl ;
   private short Gx_err ;
   private int A2714RpExHdAlb ;
   private int A129BarCod ;
   private int AV13BarCod ;
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
   private String AV15BarCodPar ;
   private String AV17FasCod ;
   private String A6558FasCodn ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV10RpExHdFe ;
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
   private boolean n2712RpExHdUl ;
   private boolean n2265BarExt ;
   private boolean n4443BarFasDTF ;
   private short[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P091J2_A2714RpExHdAlb ;
   private boolean[] P091J2_n2714RpExHdAlb ;
   private java.math.BigDecimal[] P091J2_A2847RpExHdMts ;
   private boolean[] P091J2_n2847RpExHdMts ;
   private java.math.BigDecimal[] P091J2_A2715RpExHdKgs ;
   private boolean[] P091J2_n2715RpExHdKgs ;
   private short[] P091J2_A2716RpExHdCns ;
   private boolean[] P091J2_n2716RpExHdCns ;
   private short[] P091J2_A2713RpExHdLi ;
   private java.util.Date[] P091J2_A2711RpExHdFe ;
   private short[] P091J2_A2248ManCod ;
   private String[] P091J2_A396EmprCod ;
   private int[] P091J2_A129BarCod ;
   private boolean[] P091J2_n129BarCod ;
   private byte[] P091J2_A132BarCodReo ;
   private boolean[] P091J2_n132BarCodReo ;
   private String[] P091J2_A130BarCodPar ;
   private boolean[] P091J2_n130BarCodPar ;
   private short[] P091J2_A6262RpExSalLn ;
   private boolean[] P091J2_n6262RpExSalLn ;
   private int[] P091J3_A2253SalExtAlb ;
   private short[] P091J3_A6248SalExNln ;
   private String[] P091J3_A130BarCodPar ;
   private boolean[] P091J3_n130BarCodPar ;
   private byte[] P091J3_A132BarCodReo ;
   private boolean[] P091J3_n132BarCodReo ;
   private int[] P091J3_A129BarCod ;
   private boolean[] P091J3_n129BarCod ;
   private String[] P091J3_A396EmprCod ;
   private String[] P091J3_A6558FasCodn ;
   private short[] P091J3_A654OrdLin ;
   private java.math.BigDecimal[] P091J3_A6255SalExMtR ;
   private java.math.BigDecimal[] P091J3_A6251SalExKgR ;
   private int[] P091J3_A6252SalExCoR ;
   private byte[] P091J3_A6253SalExEsB ;
   private java.util.Date[] P091J7_A2711RpExHdFe ;
   private short[] P091J7_A2248ManCod ;
   private String[] P091J7_A396EmprCod ;
   private short[] P091J7_A2712RpExHdUl ;
   private boolean[] P091J7_n2712RpExHdUl ;
   private String[] P091J8_A396EmprCod ;
   private short[] P091J8_A2248ManCod ;
   private java.util.Date[] P091J8_A2711RpExHdFe ;
   private short[] P091J8_A2713RpExHdLi ;
   private String[] P091J10_A130BarCodPar ;
   private boolean[] P091J10_n130BarCodPar ;
   private byte[] P091J10_A132BarCodReo ;
   private boolean[] P091J10_n132BarCodReo ;
   private int[] P091J10_A129BarCod ;
   private boolean[] P091J10_n129BarCod ;
   private String[] P091J10_A396EmprCod ;
   private byte[] P091J10_A2265BarExt ;
   private boolean[] P091J10_n2265BarExt ;
}

final  class pwork07__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P091J2", "SELECT RpExHdAlb, RpExHdMts, RpExHdKgs, RpExHdCns, RpExHdLi, RpExHdFe, ManCod, EmprCod, BarCod, BarCodReo, BarCodPar, RpExSalLn FROM TXPLREXHD WHERE EmprCod = ? and ManCod = ? and RpExHdFe = ? and RpExHdLi = ? ORDER BY EmprCod, ManCod, RpExHdFe, RpExHdLi ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P091J3", "SELECT SalExtAlb, SalExNln, BarCodPar, BarCodReo, BarCod, EmprCod, FasCodn, OrdLin, SalExMtR, SalExKgR, SalExCoR, SalExEsB FROM TXPEXHDPZ WHERE (EmprCod = ? and SalExtAlb = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (SalExNln = ?) ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P091J4", "UPDATE TXPEXHDPZ SET SalExMtR=?, SalExKgR=?, SalExCoR=?, SalExEsB=?  WHERE EmprCod = ? AND SalExtAlb = ? AND SalExNln = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEXHDPZ")
         ,new UpdateCursor("P091J5", "DELETE FROM TXPLEXMVH  WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (ManCod = ?) AND (ExHdrFas = ?) AND (ExHdrTip = 'R') AND (ExHdrExL = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVH")
         ,new UpdateCursor("P091J6", "DELETE FROM TXPLREXHD  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? AND RpExHdLi = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLREXHD")
         ,new ForEachCursor("P091J7", "SELECT RpExHdFe, ManCod, EmprCod, RpExHdUl FROM TXPCREXHD WHERE EmprCod = ? and ManCod = ? and RpExHdFe = ? ORDER BY EmprCod, ManCod, RpExHdFe ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P091J8", "SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi FROM TXPLREXHD WHERE EmprCod = ? and ManCod = ? and RpExHdFe = ? ORDER BY EmprCod, ManCod, RpExHdFe ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P091J9", "DELETE FROM TXPCREXHD  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCREXHD")
         ,new ForEachCursor("P091J10", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarExt FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P091J11", "UPDATE TXPBARFAS SET BarFasDTF=TO_DATE('0001-01-01', 'YYYY-MM-DD'), BarFasEst=1  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? and FasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P091J12", "UPDATE TXPBARCAD SET BarExt=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               ((int[]) buf[12])[0] = rslt.getInt(9);
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((String[]) buf[14])[0] = rslt.getString(11, 1);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
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
            case 5 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 8 :
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
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
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
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 3 :
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
               stmt.setShort(7, ((Number) parms[9]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
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
            case 10 :
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

