package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pderhd2 extends GXProcedure
{
   public pderhd2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pderhd2.class ), "" );
   }

   public pderhd2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     short[] aP1 )
   {
      pderhd2.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
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
      pderhd2.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pderhd2.this.AV16ManCod = aP1[0];
      this.aP1 = aP1;
      pderhd2.this.AV17RpExHdFe = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00FG2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Short.valueOf(AV16ManCod), AV17RpExHdFe});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2711RpExHdFe = P00FG2_A2711RpExHdFe[0] ;
         A2248ManCod = P00FG2_A2248ManCod[0] ;
         A396EmprCod = P00FG2_A396EmprCod[0] ;
         /* Using cursor P00FG3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2713RpExHdLi = P00FG3_A2713RpExHdLi[0] ;
            A2714RpExHdAlb = P00FG3_A2714RpExHdAlb[0] ;
            n2714RpExHdAlb = P00FG3_n2714RpExHdAlb[0] ;
            A2847RpExHdMts = P00FG3_A2847RpExHdMts[0] ;
            n2847RpExHdMts = P00FG3_n2847RpExHdMts[0] ;
            A2715RpExHdKgs = P00FG3_A2715RpExHdKgs[0] ;
            n2715RpExHdKgs = P00FG3_n2715RpExHdKgs[0] ;
            A2716RpExHdCns = P00FG3_A2716RpExHdCns[0] ;
            n2716RpExHdCns = P00FG3_n2716RpExHdCns[0] ;
            A129BarCod = P00FG3_A129BarCod[0] ;
            n129BarCod = P00FG3_n129BarCod[0] ;
            A132BarCodReo = P00FG3_A132BarCodReo[0] ;
            n132BarCodReo = P00FG3_n132BarCodReo[0] ;
            A130BarCodPar = P00FG3_A130BarCodPar[0] ;
            n130BarCodPar = P00FG3_n130BarCodPar[0] ;
            AV20BarCod = A129BarCod ;
            AV21BarCodReo = A132BarCodReo ;
            AV22BarCodPar = A130BarCodPar ;
            AV19FasCod = "" ;
            /* Using cursor P00FG4 */
            pr_default.execute(2, new Object[] {AV15EmprCod, Boolean.valueOf(n2714RpExHdAlb), Integer.valueOf(A2714RpExHdAlb), Integer.valueOf(AV20BarCod), Byte.valueOf(AV21BarCodReo), AV22BarCodPar});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2253SalExtAlb = P00FG4_A2253SalExtAlb[0] ;
               A130BarCodPar = P00FG4_A130BarCodPar[0] ;
               n130BarCodPar = P00FG4_n130BarCodPar[0] ;
               A132BarCodReo = P00FG4_A132BarCodReo[0] ;
               n132BarCodReo = P00FG4_n132BarCodReo[0] ;
               A129BarCod = P00FG4_A129BarCod[0] ;
               n129BarCod = P00FG4_n129BarCod[0] ;
               A396EmprCod = P00FG4_A396EmprCod[0] ;
               A2255SalExtObs1 = P00FG4_A2255SalExtObs1[0] ;
               n2255SalExtObs1 = P00FG4_n2255SalExtObs1[0] ;
               A457FasCod = P00FG4_A457FasCod[0] ;
               n457FasCod = P00FG4_n457FasCod[0] ;
               A2840SalExtMtR = P00FG4_A2840SalExtMtR[0] ;
               n2840SalExtMtR = P00FG4_n2840SalExtMtR[0] ;
               A2260SalExtKgR = P00FG4_A2260SalExtKgR[0] ;
               n2260SalExtKgR = P00FG4_n2260SalExtKgR[0] ;
               A2261SalExtCoR = P00FG4_A2261SalExtCoR[0] ;
               n2261SalExtCoR = P00FG4_n2261SalExtCoR[0] ;
               A2262SalExtEsB = P00FG4_A2262SalExtEsB[0] ;
               n2262SalExtEsB = P00FG4_n2262SalExtEsB[0] ;
               AV19FasCod = A457FasCod ;
               A2840SalExtMtR = A2840SalExtMtR.subtract(A2847RpExHdMts) ;
               n2840SalExtMtR = false ;
               A2840SalExtMtR = ((A2840SalExtMtR.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : A2840SalExtMtR) ;
               n2840SalExtMtR = false ;
               A2260SalExtKgR = A2260SalExtKgR.subtract(A2715RpExHdKgs) ;
               n2260SalExtKgR = false ;
               A2260SalExtKgR = ((A2260SalExtKgR.doubleValue()<0) ? DecimalUtil.doubleToDec(0) : A2260SalExtKgR) ;
               n2260SalExtKgR = false ;
               A2261SalExtCoR = (short)(A2261SalExtCoR-A2716RpExHdCns) ;
               n2261SalExtCoR = false ;
               A2261SalExtCoR = (short)(((A2261SalExtCoR<0) ? 0 : A2261SalExtCoR)) ;
               n2261SalExtCoR = false ;
               A2262SalExtEsB = (byte)(((0==A2261SalExtCoR)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, A2260SalExtKgR)==0) ? 1 : A2262SalExtEsB)) ;
               n2262SalExtEsB = false ;
               /* Using cursor P00FG5 */
               pr_default.execute(3, new Object[] {Boolean.valueOf(n2840SalExtMtR), A2840SalExtMtR, Boolean.valueOf(n2260SalExtKgR), A2260SalExtKgR, Boolean.valueOf(n2261SalExtCoR), Short.valueOf(A2261SalExtCoR), Boolean.valueOf(n2262SalExtEsB), Byte.valueOf(A2262SalExtEsB), A396EmprCod, Integer.valueOf(A2253SalExtAlb), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXTSA");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
            /* Using cursor P00FG6 */
            pr_default.execute(4, new Object[] {AV15EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2713RpExHdLi), Short.valueOf(AV16ManCod), AV19FasCod});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A2704ExHdrExL = P00FG6_A2704ExHdrExL[0] ;
               n2704ExHdrExL = P00FG6_n2704ExHdrExL[0] ;
               A2693ExHdrTip = P00FG6_A2693ExHdrTip[0] ;
               n2693ExHdrTip = P00FG6_n2693ExHdrTip[0] ;
               A2689ExHdrFas = P00FG6_A2689ExHdrFas[0] ;
               A2248ManCod = P00FG6_A2248ManCod[0] ;
               A396EmprCod = P00FG6_A396EmprCod[0] ;
               A2692ExHdrLin = P00FG6_A2692ExHdrLin[0] ;
               if ( GXutil.strcmp(A2693ExHdrTip, httpContext.getMessage( "R", "")) == 0 )
               {
                  /* Using cursor P00FG7 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2689ExHdrFas, Integer.valueOf(A2692ExHdrLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEXMVH");
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Using cursor P00FG8 */
            pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod), A2711RpExHdFe, Short.valueOf(A2713RpExHdLi)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLREXHD");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P00FG9 */
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
      this.aP0[0] = pderhd2.this.AV15EmprCod;
      this.aP1[0] = pderhd2.this.AV16ManCod;
      this.aP2[0] = pderhd2.this.AV17RpExHdFe;
      Application.commitDataStores(context, remoteHandle, pr_default, "pderhd2");
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
      P00FG2_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P00FG2_A2248ManCod = new short[1] ;
      P00FG2_A396EmprCod = new String[] {""} ;
      A2711RpExHdFe = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P00FG3_A396EmprCod = new String[] {""} ;
      P00FG3_A2248ManCod = new short[1] ;
      P00FG3_A2711RpExHdFe = new java.util.Date[] {GXutil.nullDate()} ;
      P00FG3_A2713RpExHdLi = new short[1] ;
      P00FG3_A2714RpExHdAlb = new int[1] ;
      P00FG3_n2714RpExHdAlb = new boolean[] {false} ;
      P00FG3_A2847RpExHdMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FG3_n2847RpExHdMts = new boolean[] {false} ;
      P00FG3_A2715RpExHdKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FG3_n2715RpExHdKgs = new boolean[] {false} ;
      P00FG3_A2716RpExHdCns = new short[1] ;
      P00FG3_n2716RpExHdCns = new boolean[] {false} ;
      P00FG3_A129BarCod = new int[1] ;
      P00FG3_n129BarCod = new boolean[] {false} ;
      P00FG3_A132BarCodReo = new byte[1] ;
      P00FG3_n132BarCodReo = new boolean[] {false} ;
      P00FG3_A130BarCodPar = new String[] {""} ;
      P00FG3_n130BarCodPar = new boolean[] {false} ;
      A2847RpExHdMts = DecimalUtil.ZERO ;
      A2715RpExHdKgs = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      AV22BarCodPar = "" ;
      AV19FasCod = "" ;
      P00FG4_A2253SalExtAlb = new int[1] ;
      P00FG4_A130BarCodPar = new String[] {""} ;
      P00FG4_n130BarCodPar = new boolean[] {false} ;
      P00FG4_A132BarCodReo = new byte[1] ;
      P00FG4_n132BarCodReo = new boolean[] {false} ;
      P00FG4_A129BarCod = new int[1] ;
      P00FG4_n129BarCod = new boolean[] {false} ;
      P00FG4_A396EmprCod = new String[] {""} ;
      P00FG4_A2255SalExtObs1 = new String[] {""} ;
      P00FG4_n2255SalExtObs1 = new boolean[] {false} ;
      P00FG4_A457FasCod = new String[] {""} ;
      P00FG4_n457FasCod = new boolean[] {false} ;
      P00FG4_A2840SalExtMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FG4_n2840SalExtMtR = new boolean[] {false} ;
      P00FG4_A2260SalExtKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FG4_n2260SalExtKgR = new boolean[] {false} ;
      P00FG4_A2261SalExtCoR = new short[1] ;
      P00FG4_n2261SalExtCoR = new boolean[] {false} ;
      P00FG4_A2262SalExtEsB = new byte[1] ;
      P00FG4_n2262SalExtEsB = new boolean[] {false} ;
      A2255SalExtObs1 = "" ;
      A457FasCod = "" ;
      A2840SalExtMtR = DecimalUtil.ZERO ;
      A2260SalExtKgR = DecimalUtil.ZERO ;
      P00FG6_A129BarCod = new int[1] ;
      P00FG6_n129BarCod = new boolean[] {false} ;
      P00FG6_A132BarCodReo = new byte[1] ;
      P00FG6_n132BarCodReo = new boolean[] {false} ;
      P00FG6_A130BarCodPar = new String[] {""} ;
      P00FG6_n130BarCodPar = new boolean[] {false} ;
      P00FG6_A2704ExHdrExL = new short[1] ;
      P00FG6_n2704ExHdrExL = new boolean[] {false} ;
      P00FG6_A2693ExHdrTip = new String[] {""} ;
      P00FG6_n2693ExHdrTip = new boolean[] {false} ;
      P00FG6_A2689ExHdrFas = new String[] {""} ;
      P00FG6_A2248ManCod = new short[1] ;
      P00FG6_A396EmprCod = new String[] {""} ;
      P00FG6_A2692ExHdrLin = new int[1] ;
      A2693ExHdrTip = "" ;
      A2689ExHdrFas = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pderhd2__default(),
         new Object[] {
             new Object[] {
            P00FG2_A2711RpExHdFe, P00FG2_A2248ManCod, P00FG2_A396EmprCod
            }
            , new Object[] {
            P00FG3_A396EmprCod, P00FG3_A2248ManCod, P00FG3_A2711RpExHdFe, P00FG3_A2713RpExHdLi, P00FG3_A2714RpExHdAlb, P00FG3_n2714RpExHdAlb, P00FG3_A2847RpExHdMts, P00FG3_n2847RpExHdMts, P00FG3_A2715RpExHdKgs, P00FG3_n2715RpExHdKgs,
            P00FG3_A2716RpExHdCns, P00FG3_n2716RpExHdCns, P00FG3_A129BarCod, P00FG3_A132BarCodReo, P00FG3_A130BarCodPar
            }
            , new Object[] {
            P00FG4_A2253SalExtAlb, P00FG4_A130BarCodPar, P00FG4_A132BarCodReo, P00FG4_A129BarCod, P00FG4_A396EmprCod, P00FG4_A2255SalExtObs1, P00FG4_n2255SalExtObs1, P00FG4_A457FasCod, P00FG4_n457FasCod, P00FG4_A2840SalExtMtR,
            P00FG4_n2840SalExtMtR, P00FG4_A2260SalExtKgR, P00FG4_n2260SalExtKgR, P00FG4_A2261SalExtCoR, P00FG4_n2261SalExtCoR, P00FG4_A2262SalExtEsB, P00FG4_n2262SalExtEsB
            }
            , new Object[] {
            }
            , new Object[] {
            P00FG6_A129BarCod, P00FG6_n129BarCod, P00FG6_A132BarCodReo, P00FG6_n132BarCodReo, P00FG6_A130BarCodPar, P00FG6_n130BarCodPar, P00FG6_A2704ExHdrExL, P00FG6_n2704ExHdrExL, P00FG6_A2693ExHdrTip, P00FG6_n2693ExHdrTip,
            P00FG6_A2689ExHdrFas, P00FG6_A2248ManCod, P00FG6_A396EmprCod, P00FG6_A2692ExHdrLin
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
   private byte A2262SalExtEsB ;
   private short AV16ManCod ;
   private short A2248ManCod ;
   private short A2713RpExHdLi ;
   private short A2716RpExHdCns ;
   private short A2261SalExtCoR ;
   private short A2704ExHdrExL ;
   private short Gx_err ;
   private int A2714RpExHdAlb ;
   private int A129BarCod ;
   private int AV20BarCod ;
   private int A2253SalExtAlb ;
   private int A2692ExHdrLin ;
   private java.math.BigDecimal A2847RpExHdMts ;
   private java.math.BigDecimal A2715RpExHdKgs ;
   private java.math.BigDecimal A2840SalExtMtR ;
   private java.math.BigDecimal A2260SalExtKgR ;
   private String AV15EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV22BarCodPar ;
   private String AV19FasCod ;
   private String A2255SalExtObs1 ;
   private String A457FasCod ;
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
   private boolean n2255SalExtObs1 ;
   private boolean n457FasCod ;
   private boolean n2840SalExtMtR ;
   private boolean n2260SalExtKgR ;
   private boolean n2261SalExtCoR ;
   private boolean n2262SalExtEsB ;
   private boolean n2704ExHdrExL ;
   private boolean n2693ExHdrTip ;
   private java.util.Date[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P00FG2_A2711RpExHdFe ;
   private short[] P00FG2_A2248ManCod ;
   private String[] P00FG2_A396EmprCod ;
   private String[] P00FG3_A396EmprCod ;
   private short[] P00FG3_A2248ManCod ;
   private java.util.Date[] P00FG3_A2711RpExHdFe ;
   private short[] P00FG3_A2713RpExHdLi ;
   private int[] P00FG3_A2714RpExHdAlb ;
   private boolean[] P00FG3_n2714RpExHdAlb ;
   private java.math.BigDecimal[] P00FG3_A2847RpExHdMts ;
   private boolean[] P00FG3_n2847RpExHdMts ;
   private java.math.BigDecimal[] P00FG3_A2715RpExHdKgs ;
   private boolean[] P00FG3_n2715RpExHdKgs ;
   private short[] P00FG3_A2716RpExHdCns ;
   private boolean[] P00FG3_n2716RpExHdCns ;
   private int[] P00FG3_A129BarCod ;
   private boolean[] P00FG3_n129BarCod ;
   private byte[] P00FG3_A132BarCodReo ;
   private boolean[] P00FG3_n132BarCodReo ;
   private String[] P00FG3_A130BarCodPar ;
   private boolean[] P00FG3_n130BarCodPar ;
   private int[] P00FG4_A2253SalExtAlb ;
   private String[] P00FG4_A130BarCodPar ;
   private boolean[] P00FG4_n130BarCodPar ;
   private byte[] P00FG4_A132BarCodReo ;
   private boolean[] P00FG4_n132BarCodReo ;
   private int[] P00FG4_A129BarCod ;
   private boolean[] P00FG4_n129BarCod ;
   private String[] P00FG4_A396EmprCod ;
   private String[] P00FG4_A2255SalExtObs1 ;
   private boolean[] P00FG4_n2255SalExtObs1 ;
   private String[] P00FG4_A457FasCod ;
   private boolean[] P00FG4_n457FasCod ;
   private java.math.BigDecimal[] P00FG4_A2840SalExtMtR ;
   private boolean[] P00FG4_n2840SalExtMtR ;
   private java.math.BigDecimal[] P00FG4_A2260SalExtKgR ;
   private boolean[] P00FG4_n2260SalExtKgR ;
   private short[] P00FG4_A2261SalExtCoR ;
   private boolean[] P00FG4_n2261SalExtCoR ;
   private byte[] P00FG4_A2262SalExtEsB ;
   private boolean[] P00FG4_n2262SalExtEsB ;
   private int[] P00FG6_A129BarCod ;
   private boolean[] P00FG6_n129BarCod ;
   private byte[] P00FG6_A132BarCodReo ;
   private boolean[] P00FG6_n132BarCodReo ;
   private String[] P00FG6_A130BarCodPar ;
   private boolean[] P00FG6_n130BarCodPar ;
   private short[] P00FG6_A2704ExHdrExL ;
   private boolean[] P00FG6_n2704ExHdrExL ;
   private String[] P00FG6_A2693ExHdrTip ;
   private boolean[] P00FG6_n2693ExHdrTip ;
   private String[] P00FG6_A2689ExHdrFas ;
   private short[] P00FG6_A2248ManCod ;
   private String[] P00FG6_A396EmprCod ;
   private int[] P00FG6_A2692ExHdrLin ;
}

final  class pderhd2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00FG2", "SELECT RpExHdFe, ManCod, EmprCod FROM TXPCREXHD WHERE EmprCod = ? and ManCod = ? and RpExHdFe = ? ORDER BY EmprCod, ManCod, RpExHdFe ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00FG3", "SELECT EmprCod, ManCod, RpExHdFe, RpExHdLi, RpExHdAlb, RpExHdMts, RpExHdKgs, RpExHdCns, BarCod, BarCodReo, BarCodPar FROM TXPLREXHD WHERE EmprCod = ? and ManCod = ? and RpExHdFe = ? ORDER BY EmprCod, ManCod, RpExHdFe ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00FG4", "SELECT SalExtAlb, BarCodPar, BarCodReo, BarCod, EmprCod, SalExtObs1, FasCod, SalExtMtR, SalExtKgR, SalExtCoR, SalExtEsB FROM TXPLEXTSA WHERE EmprCod = ? and SalExtAlb = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00FG5", "UPDATE TXPLEXTSA SET SalExtMtR=?, SalExtKgR=?, SalExtCoR=?, SalExtEsB=?  WHERE EmprCod = ? AND SalExtAlb = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXTSA")
         ,new ForEachCursor("P00FG6", "SELECT BarCod, BarCodReo, BarCodPar, ExHdrExL, ExHdrTip, ExHdrFas, ManCod, EmprCod, ExHdrLin FROM TXPLEXMVH WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (ExHdrExL = ?) AND (ManCod = ?) AND (ExHdrFas = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00FG7", "DELETE FROM TXPLEXMVH  WHERE EmprCod = ? AND ManCod = ? AND ExHdrFas = ? AND ExHdrLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEXMVH")
         ,new UpdateCursor("P00FG8", "DELETE FROM TXPLREXHD  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ? AND RpExHdLi = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLREXHD")
         ,new UpdateCursor("P00FG9", "DELETE FROM TXPCREXHD  WHERE EmprCod = ? AND ManCod = ? AND RpExHdFe = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCREXHD")
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
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
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
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[15], 1);
               }
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

