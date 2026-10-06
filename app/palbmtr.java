package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbmtr extends GXProcedure
{
   public palbmtr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbmtr.class ), "" );
   }

   public palbmtr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          long[] aP1 ,
                          int[] aP2 ,
                          byte[] aP3 ,
                          String[] aP4 ,
                          byte[] aP5 ,
                          String[] aP6 ,
                          String[] aP7 ,
                          java.math.BigDecimal[] aP8 ,
                          short[] aP9 ,
                          java.math.BigDecimal[] aP10 ,
                          java.math.BigDecimal[] aP11 )
   {
      palbmtr.this.aP12 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        short[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        int[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             short[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             int[] aP12 )
   {
      palbmtr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbmtr.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      palbmtr.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      palbmtr.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      palbmtr.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      palbmtr.this.AV13DisComLin = aP5[0];
      this.aP5 = aP5;
      palbmtr.this.AV14DisComCod = aP6[0];
      this.aP6 = aP6;
      palbmtr.this.AV15FonCod = aP7[0];
      this.aP7 = aP7;
      palbmtr.this.AV9AlbEComM = aP8[0];
      this.aP8 = aP8;
      palbmtr.this.AV10AlbEComP = aP9[0];
      this.aP9 = aP9;
      palbmtr.this.AV12BarAlbKgmE = aP10[0];
      this.aP10 = aP10;
      palbmtr.this.AV8BarAlbMtrE = aP11[0];
      this.aP11 = aP11;
      palbmtr.this.AV11BarAlbPie = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01F82 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1265BarAlbPie = P01F82_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P01F82_A1263BarAlbMtrE[0] ;
         A864BarPes = P01F82_A864BarPes[0] ;
         A1261BarAlbKgmE = P01F82_A1261BarAlbKgmE[0] ;
         A864BarPes = P01F82_A864BarPes[0] ;
         AV8BarAlbMtrE = DecimalUtil.doubleToDec(0) ;
         AV11BarAlbPie = 0 ;
         /* Using cursor P01F83 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1032FonCod = P01F83_A1032FonCod[0] ;
            A1056DisComCod = P01F83_A1056DisComCod[0] ;
            A2524DisComLin = P01F83_A2524DisComLin[0] ;
            A1533AlbEComM = P01F83_A1533AlbEComM[0] ;
            n1533AlbEComM = P01F83_n1533AlbEComM[0] ;
            A1534AlbEComP = P01F83_A1534AlbEComP[0] ;
            n1534AlbEComP = P01F83_n1534AlbEComP[0] ;
            O1540BarComMLan = A1540BarComMLan ;
            O1544BarComPLan = A1544BarComPLan ;
            AV9AlbEComM = DecimalUtil.doubleToDec(0) ;
            AV10AlbEComP = (short)(0) ;
            /* Using cursor P01F84 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A4434DisComNTr = P01F84_A4434DisComNTr[0] ;
               n4434DisComNTr = P01F84_n4434DisComNTr[0] ;
               A4435DisComMts = P01F84_A4435DisComMts[0] ;
               n4435DisComMts = P01F84_n4435DisComMts[0] ;
               A4433DisComTro = P01F84_A4433DisComTro[0] ;
               AV9AlbEComM = AV9AlbEComM.add((A4435DisComMts.multiply(DecimalUtil.doubleToDec(A4434DisComNTr)))) ;
               AV10AlbEComP = (short)(AV10AlbEComP+A4434DisComNTr) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            A1533AlbEComM = AV9AlbEComM ;
            n1533AlbEComM = false ;
            A1534AlbEComP = AV10AlbEComP ;
            n1534AlbEComP = false ;
            A1540BarComMLan = AV9AlbEComM ;
            A1544BarComPLan = AV10AlbEComP ;
            AV8BarAlbMtrE = AV8BarAlbMtrE.add(AV9AlbEComM) ;
            AV11BarAlbPie = (int)(AV11BarAlbPie+AV10AlbEComP) ;
            AV9AlbEComM = DecimalUtil.doubleToDec(0) ;
            AV10AlbEComP = (short)(0) ;
            /* Using cursor P01F85 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(AV13DisComLin), Byte.valueOf(AV13DisComLin), AV14DisComCod, AV14DisComCod, AV15FonCod, AV15FonCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A4434DisComNTr = P01F85_A4434DisComNTr[0] ;
               n4434DisComNTr = P01F85_n4434DisComNTr[0] ;
               A4435DisComMts = P01F85_A4435DisComMts[0] ;
               n4435DisComMts = P01F85_n4435DisComMts[0] ;
               A4433DisComTro = P01F85_A4433DisComTro[0] ;
               AV9AlbEComM = AV9AlbEComM.add((A4435DisComMts.multiply(DecimalUtil.doubleToDec(A4434DisComNTr)))) ;
               AV10AlbEComP = (short)(AV10AlbEComP+A4434DisComNTr) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Using cursor P01F86 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n1533AlbEComM), A1533AlbEComM, Boolean.valueOf(n1534AlbEComP), Short.valueOf(A1534AlbEComP), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A1265BarAlbPie = AV11BarAlbPie ;
         A1263BarAlbMtrE = AV8BarAlbMtrE ;
         AV12BarAlbKgmE = AV8BarAlbMtrE.multiply(DecimalUtil.doubleToDec(A864BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         A1261BarAlbKgmE = AV12BarAlbKgmE ;
         /* Using cursor P01F87 */
         pr_default.execute(5, new Object[] {Integer.valueOf(A1265BarAlbPie), A1263BarAlbMtrE, A1261BarAlbKgmE, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbmtr.this.A396EmprCod;
      this.aP1[0] = palbmtr.this.A30AlbProCod;
      this.aP2[0] = palbmtr.this.A129BarCod;
      this.aP3[0] = palbmtr.this.A132BarCodReo;
      this.aP4[0] = palbmtr.this.A130BarCodPar;
      this.aP5[0] = palbmtr.this.AV13DisComLin;
      this.aP6[0] = palbmtr.this.AV14DisComCod;
      this.aP7[0] = palbmtr.this.AV15FonCod;
      this.aP8[0] = palbmtr.this.AV9AlbEComM;
      this.aP9[0] = palbmtr.this.AV10AlbEComP;
      this.aP10[0] = palbmtr.this.AV12BarAlbKgmE;
      this.aP11[0] = palbmtr.this.AV8BarAlbMtrE;
      this.aP12[0] = palbmtr.this.AV11BarAlbPie;
      Application.commitDataStores(context, remoteHandle, pr_default, "palbmtr");
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
      P01F82_A396EmprCod = new String[] {""} ;
      P01F82_A30AlbProCod = new long[1] ;
      P01F82_A129BarCod = new int[1] ;
      P01F82_A132BarCodReo = new byte[1] ;
      P01F82_A130BarCodPar = new String[] {""} ;
      P01F82_A1265BarAlbPie = new int[1] ;
      P01F82_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01F82_A864BarPes = new short[1] ;
      P01F82_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P01F83_A396EmprCod = new String[] {""} ;
      P01F83_A30AlbProCod = new long[1] ;
      P01F83_A129BarCod = new int[1] ;
      P01F83_A132BarCodReo = new byte[1] ;
      P01F83_A130BarCodPar = new String[] {""} ;
      P01F83_A1032FonCod = new String[] {""} ;
      P01F83_A1056DisComCod = new String[] {""} ;
      P01F83_A2524DisComLin = new byte[1] ;
      P01F83_A1533AlbEComM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01F83_n1533AlbEComM = new boolean[] {false} ;
      P01F83_A1534AlbEComP = new short[1] ;
      P01F83_n1534AlbEComP = new boolean[] {false} ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      A1533AlbEComM = DecimalUtil.ZERO ;
      O1540BarComMLan = DecimalUtil.ZERO ;
      A1540BarComMLan = DecimalUtil.ZERO ;
      P01F84_A396EmprCod = new String[] {""} ;
      P01F84_A30AlbProCod = new long[1] ;
      P01F84_A129BarCod = new int[1] ;
      P01F84_A132BarCodReo = new byte[1] ;
      P01F84_A130BarCodPar = new String[] {""} ;
      P01F84_A2524DisComLin = new byte[1] ;
      P01F84_A1056DisComCod = new String[] {""} ;
      P01F84_A1032FonCod = new String[] {""} ;
      P01F84_A4434DisComNTr = new short[1] ;
      P01F84_n4434DisComNTr = new boolean[] {false} ;
      P01F84_A4435DisComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01F84_n4435DisComMts = new boolean[] {false} ;
      P01F84_A4433DisComTro = new short[1] ;
      A4435DisComMts = DecimalUtil.ZERO ;
      P01F85_A396EmprCod = new String[] {""} ;
      P01F85_A30AlbProCod = new long[1] ;
      P01F85_A129BarCod = new int[1] ;
      P01F85_A132BarCodReo = new byte[1] ;
      P01F85_A130BarCodPar = new String[] {""} ;
      P01F85_A2524DisComLin = new byte[1] ;
      P01F85_A1056DisComCod = new String[] {""} ;
      P01F85_A1032FonCod = new String[] {""} ;
      P01F85_A4434DisComNTr = new short[1] ;
      P01F85_n4434DisComNTr = new boolean[] {false} ;
      P01F85_A4435DisComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01F85_n4435DisComMts = new boolean[] {false} ;
      P01F85_A4433DisComTro = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbmtr__default(),
         new Object[] {
             new Object[] {
            P01F82_A396EmprCod, P01F82_A30AlbProCod, P01F82_A129BarCod, P01F82_A132BarCodReo, P01F82_A130BarCodPar, P01F82_A1265BarAlbPie, P01F82_A1263BarAlbMtrE, P01F82_A864BarPes, P01F82_A1261BarAlbKgmE
            }
            , new Object[] {
            P01F83_A396EmprCod, P01F83_A30AlbProCod, P01F83_A129BarCod, P01F83_A132BarCodReo, P01F83_A130BarCodPar, P01F83_A1032FonCod, P01F83_A1056DisComCod, P01F83_A2524DisComLin, P01F83_A1533AlbEComM, P01F83_n1533AlbEComM,
            P01F83_A1534AlbEComP, P01F83_n1534AlbEComP
            }
            , new Object[] {
            P01F84_A396EmprCod, P01F84_A30AlbProCod, P01F84_A129BarCod, P01F84_A132BarCodReo, P01F84_A130BarCodPar, P01F84_A2524DisComLin, P01F84_A1056DisComCod, P01F84_A1032FonCod, P01F84_A4434DisComNTr, P01F84_n4434DisComNTr,
            P01F84_A4435DisComMts, P01F84_n4435DisComMts, P01F84_A4433DisComTro
            }
            , new Object[] {
            P01F85_A396EmprCod, P01F85_A30AlbProCod, P01F85_A129BarCod, P01F85_A132BarCodReo, P01F85_A130BarCodPar, P01F85_A2524DisComLin, P01F85_A1056DisComCod, P01F85_A1032FonCod, P01F85_A4434DisComNTr, P01F85_n4434DisComNTr,
            P01F85_A4435DisComMts, P01F85_n4435DisComMts, P01F85_A4433DisComTro
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
   private byte AV13DisComLin ;
   private byte A2524DisComLin ;
   private short AV10AlbEComP ;
   private short A864BarPes ;
   private short A1534AlbEComP ;
   private short O1544BarComPLan ;
   private short A1544BarComPLan ;
   private short A4434DisComNTr ;
   private short A4433DisComTro ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV11BarAlbPie ;
   private int A1265BarAlbPie ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV9AlbEComM ;
   private java.math.BigDecimal AV12BarAlbKgmE ;
   private java.math.BigDecimal AV8BarAlbMtrE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1533AlbEComM ;
   private java.math.BigDecimal O1540BarComMLan ;
   private java.math.BigDecimal A1540BarComMLan ;
   private java.math.BigDecimal A4435DisComMts ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV14DisComCod ;
   private String AV15FonCod ;
   private String scmdbuf ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private boolean n1533AlbEComM ;
   private boolean n1534AlbEComP ;
   private boolean n4434DisComNTr ;
   private boolean n4435DisComMts ;
   private int[] aP12 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private short[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P01F82_A396EmprCod ;
   private long[] P01F82_A30AlbProCod ;
   private int[] P01F82_A129BarCod ;
   private byte[] P01F82_A132BarCodReo ;
   private String[] P01F82_A130BarCodPar ;
   private int[] P01F82_A1265BarAlbPie ;
   private java.math.BigDecimal[] P01F82_A1263BarAlbMtrE ;
   private short[] P01F82_A864BarPes ;
   private java.math.BigDecimal[] P01F82_A1261BarAlbKgmE ;
   private String[] P01F83_A396EmprCod ;
   private long[] P01F83_A30AlbProCod ;
   private int[] P01F83_A129BarCod ;
   private byte[] P01F83_A132BarCodReo ;
   private String[] P01F83_A130BarCodPar ;
   private String[] P01F83_A1032FonCod ;
   private String[] P01F83_A1056DisComCod ;
   private byte[] P01F83_A2524DisComLin ;
   private java.math.BigDecimal[] P01F83_A1533AlbEComM ;
   private boolean[] P01F83_n1533AlbEComM ;
   private short[] P01F83_A1534AlbEComP ;
   private boolean[] P01F83_n1534AlbEComP ;
   private String[] P01F84_A396EmprCod ;
   private long[] P01F84_A30AlbProCod ;
   private int[] P01F84_A129BarCod ;
   private byte[] P01F84_A132BarCodReo ;
   private String[] P01F84_A130BarCodPar ;
   private byte[] P01F84_A2524DisComLin ;
   private String[] P01F84_A1056DisComCod ;
   private String[] P01F84_A1032FonCod ;
   private short[] P01F84_A4434DisComNTr ;
   private boolean[] P01F84_n4434DisComNTr ;
   private java.math.BigDecimal[] P01F84_A4435DisComMts ;
   private boolean[] P01F84_n4435DisComMts ;
   private short[] P01F84_A4433DisComTro ;
   private String[] P01F85_A396EmprCod ;
   private long[] P01F85_A30AlbProCod ;
   private int[] P01F85_A129BarCod ;
   private byte[] P01F85_A132BarCodReo ;
   private String[] P01F85_A130BarCodPar ;
   private byte[] P01F85_A2524DisComLin ;
   private String[] P01F85_A1056DisComCod ;
   private String[] P01F85_A1032FonCod ;
   private short[] P01F85_A4434DisComNTr ;
   private boolean[] P01F85_n4434DisComNTr ;
   private java.math.BigDecimal[] P01F85_A4435DisComMts ;
   private boolean[] P01F85_n4435DisComMts ;
   private short[] P01F85_A4433DisComTro ;
}

final  class palbmtr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01F82", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbPie, T1.BarAlbMtrE, T3.BarPes, T1.BarAlbKgmE FROM ((TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01F83", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FonCod, DisComCod, DisComLin, AlbEComM, AlbEComP FROM TXPALBEST WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01F84", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComNTr, DisComMts, DisComTro FROM TXPALBTET WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01F85", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComNTr, DisComMts, DisComTro FROM TXPALBTET WHERE (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ?) AND (? = ?) AND (? = ?) AND (? = ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01F86", "UPDATE TXPALBEST SET AlbEComM=?, AlbEComP=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBEST")
         ,new UpdateCursor("P01F87", "UPDATE TXPALBBAR SET BarAlbPie=?, BarAlbMtrE=?, BarAlbKgmE=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 12);
               stmt.setString(12, (String)parms[11], 12);
               stmt.setString(13, (String)parms[12], 12);
               stmt.setString(14, (String)parms[13], 12);
               return;
            case 4 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setLong(4, ((Number) parms[5]).longValue());
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               stmt.setString(7, (String)parms[8], 1);
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               stmt.setString(9, (String)parms[10], 12);
               stmt.setString(10, (String)parms[11], 12);
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
      }
   }

}

