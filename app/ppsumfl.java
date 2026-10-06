package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppsumfl extends GXProcedure
{
   public ppsumfl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppsumfl.class ), "" );
   }

   public ppsumfl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           int aP2 ,
                                           int aP3 ,
                                           byte aP4 ,
                                           String aP5 )
   {
      ppsumfl.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        int aP3 ,
                        byte aP4 ,
                        String aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             int aP3 ,
                             byte aP4 ,
                             String aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      ppsumfl.this.A396EmprCod = aP0;
      ppsumfl.this.AV25Sup_Num = aP1;
      ppsumfl.this.AV26Sup_Lnf = aP2;
      ppsumfl.this.AV19barcod = aP3;
      ppsumfl.this.AV20Barcodreo = aP4;
      ppsumfl.this.AV21barcodpar = aP5;
      ppsumfl.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Sup_SVal = DecimalUtil.doubleToDec(0) ;
      AV18Num_b = (short)(0) ;
      /* Using cursor P02VF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV19barcod), Byte.valueOf(AV20Barcodreo), AV21barcodpar, Short.valueOf(AV22barordlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P02VF2_A129BarCod[0] ;
         A132BarCodReo = P02VF2_A132BarCodReo[0] ;
         A130BarCodPar = P02VF2_A130BarCodPar[0] ;
         A4268RecOrdLin = P02VF2_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P02VF2_n4268RecOrdLin[0] ;
         A2804RecLinMaq = P02VF2_A2804RecLinMaq[0] ;
         AV23Val_in = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P02VF3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P02VF3_A719PrdNum[0] ;
            n719PrdNum = P02VF3_n719PrdNum[0] ;
            A764ProForCod = P02VF3_A764ProForCod[0] ;
            A5523ProForTip = P02VF3_A5523ProForTip[0] ;
            A724PrdPreAct = P02VF3_A724PrdPreAct[0] ;
            A686PrdCant = P02VF3_A686PrdCant[0] ;
            A811RecLin = P02VF3_A811RecLin[0] ;
            A1273RecLinPro = P02VF3_A1273RecLinPro[0] ;
            A724PrdPreAct = P02VF3_A724PrdPreAct[0] ;
            A764ProForCod = P02VF3_A764ProForCod[0] ;
            A5523ProForTip = P02VF3_A5523ProForTip[0] ;
            if ( GXutil.strcmp(A5523ProForTip, "*") == 0 )
            {
               AV23Val_in = (A686PrdCant.multiply(A724PrdPreAct)).divide(DecimalUtil.doubleToDec(10), 18, java.math.RoundingMode.DOWN) ;
            }
            else
            {
               AV23Val_in = (A686PrdCant.multiply(A724PrdPreAct)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            }
            AV17Sup_SVal = AV17Sup_SVal.add(AV23Val_in) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P02VF4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV19barcod), Byte.valueOf(AV20Barcodreo), AV21barcodpar, Short.valueOf(AV22barordlin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1933BarCodTin = P02VF4_A1933BarCodTin[0] ;
         n1933BarCodTin = P02VF4_n1933BarCodTin[0] ;
         A1934BarReoTin = P02VF4_A1934BarReoTin[0] ;
         n1934BarReoTin = P02VF4_n1934BarReoTin[0] ;
         A1935BarParTin = P02VF4_A1935BarParTin[0] ;
         n1935BarParTin = P02VF4_n1935BarParTin[0] ;
         A4926BarFaseOrd = P02VF4_A4926BarFaseOrd[0] ;
         n4926BarFaseOrd = P02VF4_n4926BarFaseOrd[0] ;
         A3706BarCosAnc = P02VF4_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P02VF4_n3706BarCosAnc[0] ;
         A3705BarCosCol = P02VF4_A3705BarCosCol[0] ;
         n3705BarCosCol = P02VF4_n3705BarCosCol[0] ;
         A3658BarCosPA = P02VF4_A3658BarCosPA[0] ;
         n3658BarCosPA = P02VF4_n3658BarCosPA[0] ;
         A3657BarCosAA = P02VF4_A3657BarCosAA[0] ;
         n3657BarCosAA = P02VF4_n3657BarCosAA[0] ;
         A3656BarCosAD = P02VF4_A3656BarCosAD[0] ;
         n3656BarCosAD = P02VF4_n3656BarCosAD[0] ;
         A3654BarCosPD = P02VF4_A3654BarCosPD[0] ;
         n3654BarCosPD = P02VF4_n3654BarCosPD[0] ;
         A3646EstTinAny = P02VF4_A3646EstTinAny[0] ;
         A3647EstTinMes = P02VF4_A3647EstTinMes[0] ;
         A3648EstTinDia = P02VF4_A3648EstTinDia[0] ;
         A1929EstTinNr = P02VF4_A1929EstTinNr[0] ;
         AV17Sup_SVal = AV17Sup_SVal.add(((A3654BarCosPD.add(A3656BarCosAD).add(A3657BarCosAA).add(A3658BarCosPA).add(A3705BarCosCol).add(A3706BarCosAnc)))) ;
         AV18Num_b = (short)(AV18Num_b+1) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV24BARPIE = 0 ;
      /* Using cursor P02VF6 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV19barcod), Byte.valueOf(AV20Barcodreo), AV21barcodpar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P02VF6_A130BarCodPar[0] ;
         A132BarCodReo = P02VF6_A132BarCodReo[0] ;
         A129BarCod = P02VF6_A129BarCod[0] ;
         A199BarPie1 = P02VF6_A199BarPie1[0] ;
         A365DisDes = P02VF6_A365DisDes[0] ;
         A898BarPieNDes = P02VF6_A898BarPieNDes[0] ;
         A199BarPie1 = P02VF6_A199BarPie1[0] ;
         A898BarPieNDes = P02VF6_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV24BARPIE = A198BarPie ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( AV24BARPIE > 0 )
      {
         AV17Sup_SVal = AV17Sup_SVal.divide(DecimalUtil.doubleToDec(AV24BARPIE), 18, java.math.RoundingMode.DOWN) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = ppsumfl.this.AV17Sup_SVal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17Sup_SVal = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02VF2_A396EmprCod = new String[] {""} ;
      P02VF2_A129BarCod = new int[1] ;
      P02VF2_A132BarCodReo = new byte[1] ;
      P02VF2_A130BarCodPar = new String[] {""} ;
      P02VF2_A4268RecOrdLin = new short[1] ;
      P02VF2_n4268RecOrdLin = new boolean[] {false} ;
      P02VF2_A2804RecLinMaq = new short[1] ;
      A130BarCodPar = "" ;
      AV23Val_in = DecimalUtil.ZERO ;
      P02VF3_A719PrdNum = new String[] {""} ;
      P02VF3_n719PrdNum = new boolean[] {false} ;
      P02VF3_A764ProForCod = new String[] {""} ;
      P02VF3_A396EmprCod = new String[] {""} ;
      P02VF3_A129BarCod = new int[1] ;
      P02VF3_A132BarCodReo = new byte[1] ;
      P02VF3_A130BarCodPar = new String[] {""} ;
      P02VF3_A2804RecLinMaq = new short[1] ;
      P02VF3_A5523ProForTip = new String[] {""} ;
      P02VF3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VF3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VF3_A811RecLin = new short[1] ;
      P02VF3_A1273RecLinPro = new byte[1] ;
      A719PrdNum = "" ;
      A764ProForCod = "" ;
      A5523ProForTip = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      P02VF4_A396EmprCod = new String[] {""} ;
      P02VF4_A1933BarCodTin = new int[1] ;
      P02VF4_n1933BarCodTin = new boolean[] {false} ;
      P02VF4_A1934BarReoTin = new byte[1] ;
      P02VF4_n1934BarReoTin = new boolean[] {false} ;
      P02VF4_A1935BarParTin = new String[] {""} ;
      P02VF4_n1935BarParTin = new boolean[] {false} ;
      P02VF4_A4926BarFaseOrd = new short[1] ;
      P02VF4_n4926BarFaseOrd = new boolean[] {false} ;
      P02VF4_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VF4_n3706BarCosAnc = new boolean[] {false} ;
      P02VF4_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VF4_n3705BarCosCol = new boolean[] {false} ;
      P02VF4_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VF4_n3658BarCosPA = new boolean[] {false} ;
      P02VF4_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VF4_n3657BarCosAA = new boolean[] {false} ;
      P02VF4_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VF4_n3656BarCosAD = new boolean[] {false} ;
      P02VF4_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VF4_n3654BarCosPD = new boolean[] {false} ;
      P02VF4_A3646EstTinAny = new short[1] ;
      P02VF4_A3647EstTinMes = new byte[1] ;
      P02VF4_A3648EstTinDia = new byte[1] ;
      P02VF4_A1929EstTinNr = new short[1] ;
      A1935BarParTin = "" ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      P02VF6_A396EmprCod = new String[] {""} ;
      P02VF6_A130BarCodPar = new String[] {""} ;
      P02VF6_A132BarCodReo = new byte[1] ;
      P02VF6_A129BarCod = new int[1] ;
      P02VF6_A199BarPie1 = new short[1] ;
      P02VF6_A365DisDes = new String[] {""} ;
      P02VF6_A898BarPieNDes = new int[1] ;
      A365DisDes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppsumfl__default(),
         new Object[] {
             new Object[] {
            P02VF2_A396EmprCod, P02VF2_A129BarCod, P02VF2_A132BarCodReo, P02VF2_A130BarCodPar, P02VF2_A4268RecOrdLin, P02VF2_n4268RecOrdLin, P02VF2_A2804RecLinMaq
            }
            , new Object[] {
            P02VF3_A719PrdNum, P02VF3_n719PrdNum, P02VF3_A764ProForCod, P02VF3_A396EmprCod, P02VF3_A129BarCod, P02VF3_A132BarCodReo, P02VF3_A130BarCodPar, P02VF3_A2804RecLinMaq, P02VF3_A5523ProForTip, P02VF3_A724PrdPreAct,
            P02VF3_A686PrdCant, P02VF3_A811RecLin, P02VF3_A1273RecLinPro
            }
            , new Object[] {
            P02VF4_A396EmprCod, P02VF4_A1933BarCodTin, P02VF4_n1933BarCodTin, P02VF4_A1934BarReoTin, P02VF4_n1934BarReoTin, P02VF4_A1935BarParTin, P02VF4_n1935BarParTin, P02VF4_A4926BarFaseOrd, P02VF4_n4926BarFaseOrd, P02VF4_A3706BarCosAnc,
            P02VF4_n3706BarCosAnc, P02VF4_A3705BarCosCol, P02VF4_n3705BarCosCol, P02VF4_A3658BarCosPA, P02VF4_n3658BarCosPA, P02VF4_A3657BarCosAA, P02VF4_n3657BarCosAA, P02VF4_A3656BarCosAD, P02VF4_n3656BarCosAD, P02VF4_A3654BarCosPD,
            P02VF4_n3654BarCosPD, P02VF4_A3646EstTinAny, P02VF4_A3647EstTinMes, P02VF4_A3648EstTinDia, P02VF4_A1929EstTinNr
            }
            , new Object[] {
            P02VF6_A396EmprCod, P02VF6_A130BarCodPar, P02VF6_A132BarCodReo, P02VF6_A129BarCod, P02VF6_A199BarPie1, P02VF6_A365DisDes, P02VF6_A898BarPieNDes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20Barcodreo ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A1934BarReoTin ;
   private byte A3647EstTinMes ;
   private byte A3648EstTinDia ;
   private short AV18Num_b ;
   private short AV22barordlin ;
   private short A4268RecOrdLin ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short A4926BarFaseOrd ;
   private short A3646EstTinAny ;
   private short A1929EstTinNr ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV25Sup_Num ;
   private int AV26Sup_Lnf ;
   private int AV19barcod ;
   private int A129BarCod ;
   private int A1933BarCodTin ;
   private int AV24BARPIE ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private java.math.BigDecimal AV17Sup_SVal ;
   private java.math.BigDecimal AV23Val_in ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3657BarCosAA ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3654BarCosPD ;
   private String A396EmprCod ;
   private String AV21barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A719PrdNum ;
   private String A764ProForCod ;
   private String A5523ProForTip ;
   private String A1935BarParTin ;
   private String A365DisDes ;
   private boolean n4268RecOrdLin ;
   private boolean n719PrdNum ;
   private boolean n1933BarCodTin ;
   private boolean n1934BarReoTin ;
   private boolean n1935BarParTin ;
   private boolean n4926BarFaseOrd ;
   private boolean n3706BarCosAnc ;
   private boolean n3705BarCosCol ;
   private boolean n3658BarCosPA ;
   private boolean n3657BarCosAA ;
   private boolean n3656BarCosAD ;
   private boolean n3654BarCosPD ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P02VF2_A396EmprCod ;
   private int[] P02VF2_A129BarCod ;
   private byte[] P02VF2_A132BarCodReo ;
   private String[] P02VF2_A130BarCodPar ;
   private short[] P02VF2_A4268RecOrdLin ;
   private boolean[] P02VF2_n4268RecOrdLin ;
   private short[] P02VF2_A2804RecLinMaq ;
   private String[] P02VF3_A719PrdNum ;
   private boolean[] P02VF3_n719PrdNum ;
   private String[] P02VF3_A764ProForCod ;
   private String[] P02VF3_A396EmprCod ;
   private int[] P02VF3_A129BarCod ;
   private byte[] P02VF3_A132BarCodReo ;
   private String[] P02VF3_A130BarCodPar ;
   private short[] P02VF3_A2804RecLinMaq ;
   private String[] P02VF3_A5523ProForTip ;
   private java.math.BigDecimal[] P02VF3_A724PrdPreAct ;
   private java.math.BigDecimal[] P02VF3_A686PrdCant ;
   private short[] P02VF3_A811RecLin ;
   private byte[] P02VF3_A1273RecLinPro ;
   private String[] P02VF4_A396EmprCod ;
   private int[] P02VF4_A1933BarCodTin ;
   private boolean[] P02VF4_n1933BarCodTin ;
   private byte[] P02VF4_A1934BarReoTin ;
   private boolean[] P02VF4_n1934BarReoTin ;
   private String[] P02VF4_A1935BarParTin ;
   private boolean[] P02VF4_n1935BarParTin ;
   private short[] P02VF4_A4926BarFaseOrd ;
   private boolean[] P02VF4_n4926BarFaseOrd ;
   private java.math.BigDecimal[] P02VF4_A3706BarCosAnc ;
   private boolean[] P02VF4_n3706BarCosAnc ;
   private java.math.BigDecimal[] P02VF4_A3705BarCosCol ;
   private boolean[] P02VF4_n3705BarCosCol ;
   private java.math.BigDecimal[] P02VF4_A3658BarCosPA ;
   private boolean[] P02VF4_n3658BarCosPA ;
   private java.math.BigDecimal[] P02VF4_A3657BarCosAA ;
   private boolean[] P02VF4_n3657BarCosAA ;
   private java.math.BigDecimal[] P02VF4_A3656BarCosAD ;
   private boolean[] P02VF4_n3656BarCosAD ;
   private java.math.BigDecimal[] P02VF4_A3654BarCosPD ;
   private boolean[] P02VF4_n3654BarCosPD ;
   private short[] P02VF4_A3646EstTinAny ;
   private byte[] P02VF4_A3647EstTinMes ;
   private byte[] P02VF4_A3648EstTinDia ;
   private short[] P02VF4_A1929EstTinNr ;
   private String[] P02VF6_A396EmprCod ;
   private String[] P02VF6_A130BarCodPar ;
   private byte[] P02VF6_A132BarCodReo ;
   private int[] P02VF6_A129BarCod ;
   private short[] P02VF6_A199BarPie1 ;
   private String[] P02VF6_A365DisDes ;
   private int[] P02VF6_A898BarPieNDes ;
}

final  class ppsumfl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02VF2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecOrdLin, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VF3", "SELECT T1.PrdNum, T3.ProForCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T4.ProForTip, T2.PrdPreAct, T1.PrdCant, T1.RecLin, T1.RecLinPro FROM (((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPCRECET T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq AND T3.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T4 ON T4.EmprCod = T1.EmprCod AND T4.ProForCod = T3.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VF4", "SELECT EmprCod, BarCodTin, BarReoTin, BarParTin, BarFaseOrd, BarCosAnc, BarCosCol, BarCosPA, BarCosAA, BarCosAD, BarCosPD, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? and BarCodTin = ? and BarReoTin = ? and BarParTin = ? and BarFaseOrd = ? ORDER BY EmprCod, BarCodTin, BarReoTin, BarParTin, BarFaseOrd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VF6", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((byte[]) buf[22])[0] = rslt.getByte(13);
               ((byte[]) buf[23])[0] = rslt.getByte(14);
               ((short[]) buf[24])[0] = rslt.getShort(15);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

