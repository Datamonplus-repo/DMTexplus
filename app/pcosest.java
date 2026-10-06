package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcosest extends GXProcedure
{
   public pcosest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcosest.class ), "" );
   }

   public pcosest( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pcosest.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pcosest.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcosest.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pcosest.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pcosest.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pcosest.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00YL3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3915EmpNumDec = P00YL3_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00YL3_n3915EmpNumDec[0] ;
         A1538BarCMtr = P00YL3_A1538BarCMtr[0] ;
         n1538BarCMtr = P00YL3_n1538BarCMtr[0] ;
         A3915EmpNumDec = P00YL3_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00YL3_n3915EmpNumDec[0] ;
         A1538BarCMtr = P00YL3_A1538BarCMtr[0] ;
         n1538BarCMtr = P00YL3_n1538BarCMtr[0] ;
         AV18BarCod = A129BarCod ;
         AV19BarCodReo = A132BarCodReo ;
         AV20BarCodPar = A130BarCodPar ;
         AV21EmpCod = A396EmprCod ;
         AV26GasOpeR = DecimalUtil.doubleToDec(0) ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal5[0] = AV26GasOpeR ;
         new app.pgasopr(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_decimal5) ;
         pcosest.this.A396EmprCod = GXv_char1[0] ;
         pcosest.this.A129BarCod = GXv_int2[0] ;
         pcosest.this.A132BarCodReo = GXv_int3[0] ;
         pcosest.this.A130BarCodPar = GXv_char4[0] ;
         pcosest.this.AV26GasOpeR = GXv_decimal5[0] ;
         AV27MetrosT = A1538BarCMtr ;
         /* Using cursor P00YL4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1032FonCod = P00YL4_A1032FonCod[0] ;
            A1056DisComCod = P00YL4_A1056DisComCod[0] ;
            A2524DisComLin = P00YL4_A2524DisComLin[0] ;
            A1534AlbEComP = P00YL4_A1534AlbEComP[0] ;
            n1534AlbEComP = P00YL4_n1534AlbEComP[0] ;
            A1533AlbEComM = P00YL4_A1533AlbEComM[0] ;
            n1533AlbEComM = P00YL4_n1533AlbEComM[0] ;
            O2513BarGasAca = A2513BarGasAca ;
            O2072BarMtrRep = A2072BarMtrRep ;
            O2514BarGasEmp = A2514BarGasEmp ;
            O2516BarGasOpe = A2516BarGasOpe ;
            AV22BarComMtr = A1541BarComMtr ;
            AV15BarGasAca = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P00YL5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2651OperPreAlb = P00YL5_A2651OperPreAlb[0] ;
               n2651OperPreAlb = P00YL5_n2651OperPreAlb[0] ;
               A2102OperCod = P00YL5_A2102OperCod[0] ;
               A1761ExtCod = P00YL5_A1761ExtCod[0] ;
               if ( A3915EmpNumDec == 0 )
               {
                  AV15BarGasAca = (A1540BarComMLan.multiply(A2651OperPreAlb)) ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     AV15BarGasAca = GXutil.roundDecimal( A1540BarComMLan.multiply(A2651OperPreAlb), 2) ;
                  }
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            A2513BarGasAca = GXutil.roundDecimal( AV15BarGasAca, 0) ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2072BarMtrRep)==0) )
            {
               A2072BarMtrRep = A1533AlbEComM ;
            }
            AV16BarGasEmp = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P00YL6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A2652OperPreEAl = P00YL6_A2652OperPreEAl[0] ;
               n2652OperPreEAl = P00YL6_n2652OperPreEAl[0] ;
               A2102OperCod = P00YL6_A2102OperCod[0] ;
               A2666ProceCodA = P00YL6_A2666ProceCodA[0] ;
               if ( A3915EmpNumDec == 0 )
               {
                  AV16BarGasEmp = (A1541BarComMtr.multiply(A2652OperPreEAl)) ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     AV16BarGasEmp = GXutil.roundDecimal( A1541BarComMtr.multiply(A2652OperPreEAl), 2) ;
                  }
               }
               pr_default.readNext(3);
            }
            pr_default.close(3);
            if ( A3915EmpNumDec == 0 )
            {
               A2514BarGasEmp = GXutil.roundDecimal( AV16BarGasEmp, 0) ;
            }
            else
            {
               if ( A3915EmpNumDec == 2 )
               {
                  A2514BarGasEmp = GXutil.roundDecimal( AV16BarGasEmp, 2) ;
               }
            }
            AV25HisProCod = GXutil.ltrim( GXutil.str( A2524DisComLin, 2, 0)) ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int3[0] = A132BarCodReo ;
            GXv_char1[0] = A130BarCodPar ;
            GXv_char6[0] = AV25HisProCod ;
            GXv_decimal5[0] = AV17GasOpe ;
            new app.pgasope(remoteHandle, context).execute( GXv_char4, GXv_int2, GXv_int3, GXv_char1, GXv_char6, GXv_decimal5) ;
            pcosest.this.A396EmprCod = GXv_char4[0] ;
            pcosest.this.A129BarCod = GXv_int2[0] ;
            pcosest.this.A132BarCodReo = GXv_int3[0] ;
            pcosest.this.A130BarCodPar = GXv_char1[0] ;
            pcosest.this.AV25HisProCod = GXv_char6[0] ;
            pcosest.this.AV17GasOpe = GXv_decimal5[0] ;
            if ( AV22BarComMtr.doubleValue() > 0 )
            {
               if ( A3915EmpNumDec == 0 )
               {
                  A2516BarGasOpe = GXutil.roundDecimal( AV17GasOpe, 0).add(GXutil.roundDecimal( (AV26GasOpeR.divide(AV27MetrosT, 18, java.math.RoundingMode.DOWN).multiply(AV22BarComMtr)), 0)) ;
               }
               else
               {
                  if ( A3915EmpNumDec == 2 )
                  {
                     A2516BarGasOpe = GXutil.roundDecimal( AV17GasOpe, 2).add(GXutil.roundDecimal( (AV26GasOpeR.divide(AV27MetrosT, 18, java.math.RoundingMode.DOWN).multiply(AV22BarComMtr)), 2)) ;
                  }
               }
            }
            else
            {
               A2516BarGasOpe = GXutil.roundDecimal( AV17GasOpe, 2) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcosest.this.A396EmprCod;
      this.aP1[0] = pcosest.this.A30AlbProCod;
      this.aP2[0] = pcosest.this.A129BarCod;
      this.aP3[0] = pcosest.this.A132BarCodReo;
      this.aP4[0] = pcosest.this.A130BarCodPar;
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
      P00YL3_A396EmprCod = new String[] {""} ;
      P00YL3_A30AlbProCod = new long[1] ;
      P00YL3_A129BarCod = new int[1] ;
      P00YL3_A132BarCodReo = new byte[1] ;
      P00YL3_A130BarCodPar = new String[] {""} ;
      P00YL3_A3915EmpNumDec = new byte[1] ;
      P00YL3_n3915EmpNumDec = new boolean[] {false} ;
      P00YL3_A1538BarCMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YL3_n1538BarCMtr = new boolean[] {false} ;
      A1538BarCMtr = DecimalUtil.ZERO ;
      AV20BarCodPar = "" ;
      AV21EmpCod = "" ;
      AV26GasOpeR = DecimalUtil.ZERO ;
      AV27MetrosT = DecimalUtil.ZERO ;
      P00YL4_A396EmprCod = new String[] {""} ;
      P00YL4_A30AlbProCod = new long[1] ;
      P00YL4_A129BarCod = new int[1] ;
      P00YL4_A132BarCodReo = new byte[1] ;
      P00YL4_A130BarCodPar = new String[] {""} ;
      P00YL4_A1032FonCod = new String[] {""} ;
      P00YL4_A1056DisComCod = new String[] {""} ;
      P00YL4_A2524DisComLin = new byte[1] ;
      P00YL4_A1534AlbEComP = new short[1] ;
      P00YL4_n1534AlbEComP = new boolean[] {false} ;
      P00YL4_A1533AlbEComM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YL4_n1533AlbEComM = new boolean[] {false} ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      A1533AlbEComM = DecimalUtil.ZERO ;
      O2513BarGasAca = DecimalUtil.ZERO ;
      A2513BarGasAca = DecimalUtil.ZERO ;
      O2072BarMtrRep = DecimalUtil.ZERO ;
      A2072BarMtrRep = DecimalUtil.ZERO ;
      O2514BarGasEmp = DecimalUtil.ZERO ;
      A2514BarGasEmp = DecimalUtil.ZERO ;
      O2516BarGasOpe = DecimalUtil.ZERO ;
      A2516BarGasOpe = DecimalUtil.ZERO ;
      AV22BarComMtr = DecimalUtil.ZERO ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      AV15BarGasAca = DecimalUtil.ZERO ;
      P00YL5_A396EmprCod = new String[] {""} ;
      P00YL5_A30AlbProCod = new long[1] ;
      P00YL5_A129BarCod = new int[1] ;
      P00YL5_A132BarCodReo = new byte[1] ;
      P00YL5_A130BarCodPar = new String[] {""} ;
      P00YL5_A2524DisComLin = new byte[1] ;
      P00YL5_A1056DisComCod = new String[] {""} ;
      P00YL5_A1032FonCod = new String[] {""} ;
      P00YL5_A2651OperPreAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YL5_n2651OperPreAlb = new boolean[] {false} ;
      P00YL5_A2102OperCod = new String[] {""} ;
      P00YL5_A1761ExtCod = new short[1] ;
      A2651OperPreAlb = DecimalUtil.ZERO ;
      A2102OperCod = "" ;
      A1540BarComMLan = DecimalUtil.ZERO ;
      AV16BarGasEmp = DecimalUtil.ZERO ;
      P00YL6_A396EmprCod = new String[] {""} ;
      P00YL6_A30AlbProCod = new long[1] ;
      P00YL6_A129BarCod = new int[1] ;
      P00YL6_A132BarCodReo = new byte[1] ;
      P00YL6_A130BarCodPar = new String[] {""} ;
      P00YL6_A2524DisComLin = new byte[1] ;
      P00YL6_A1056DisComCod = new String[] {""} ;
      P00YL6_A1032FonCod = new String[] {""} ;
      P00YL6_A2652OperPreEAl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YL6_n2652OperPreEAl = new boolean[] {false} ;
      P00YL6_A2102OperCod = new String[] {""} ;
      P00YL6_A2666ProceCodA = new short[1] ;
      A2652OperPreEAl = DecimalUtil.ZERO ;
      AV25HisProCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char1 = new String[1] ;
      GXv_char6 = new String[1] ;
      AV17GasOpe = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcosest__default(),
         new Object[] {
             new Object[] {
            P00YL3_A396EmprCod, P00YL3_A30AlbProCod, P00YL3_A129BarCod, P00YL3_A132BarCodReo, P00YL3_A130BarCodPar, P00YL3_A3915EmpNumDec, P00YL3_n3915EmpNumDec, P00YL3_A1538BarCMtr, P00YL3_n1538BarCMtr
            }
            , new Object[] {
            P00YL4_A396EmprCod, P00YL4_A30AlbProCod, P00YL4_A129BarCod, P00YL4_A132BarCodReo, P00YL4_A130BarCodPar, P00YL4_A1032FonCod, P00YL4_A1056DisComCod, P00YL4_A2524DisComLin, P00YL4_A1534AlbEComP, P00YL4_n1534AlbEComP,
            P00YL4_A1533AlbEComM, P00YL4_n1533AlbEComM
            }
            , new Object[] {
            P00YL5_A396EmprCod, P00YL5_A30AlbProCod, P00YL5_A129BarCod, P00YL5_A132BarCodReo, P00YL5_A130BarCodPar, P00YL5_A2524DisComLin, P00YL5_A1056DisComCod, P00YL5_A1032FonCod, P00YL5_A2651OperPreAlb, P00YL5_n2651OperPreAlb,
            P00YL5_A2102OperCod, P00YL5_A1761ExtCod
            }
            , new Object[] {
            P00YL6_A396EmprCod, P00YL6_A30AlbProCod, P00YL6_A129BarCod, P00YL6_A132BarCodReo, P00YL6_A130BarCodPar, P00YL6_A2524DisComLin, P00YL6_A1056DisComCod, P00YL6_A1032FonCod, P00YL6_A2652OperPreEAl, P00YL6_n2652OperPreEAl,
            P00YL6_A2102OperCod, P00YL6_A2666ProceCodA
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A3915EmpNumDec ;
   private byte AV19BarCodReo ;
   private byte A2524DisComLin ;
   private byte GXv_int3[] ;
   private short A1534AlbEComP ;
   private short A1761ExtCod ;
   private short A2666ProceCodA ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV18BarCod ;
   private int GXv_int2[] ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1538BarCMtr ;
   private java.math.BigDecimal AV26GasOpeR ;
   private java.math.BigDecimal AV27MetrosT ;
   private java.math.BigDecimal A1533AlbEComM ;
   private java.math.BigDecimal O2513BarGasAca ;
   private java.math.BigDecimal A2513BarGasAca ;
   private java.math.BigDecimal O2072BarMtrRep ;
   private java.math.BigDecimal A2072BarMtrRep ;
   private java.math.BigDecimal O2514BarGasEmp ;
   private java.math.BigDecimal A2514BarGasEmp ;
   private java.math.BigDecimal O2516BarGasOpe ;
   private java.math.BigDecimal A2516BarGasOpe ;
   private java.math.BigDecimal AV22BarComMtr ;
   private java.math.BigDecimal A1541BarComMtr ;
   private java.math.BigDecimal AV15BarGasAca ;
   private java.math.BigDecimal A2651OperPreAlb ;
   private java.math.BigDecimal A1540BarComMLan ;
   private java.math.BigDecimal AV16BarGasEmp ;
   private java.math.BigDecimal A2652OperPreEAl ;
   private java.math.BigDecimal AV17GasOpe ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String AV20BarCodPar ;
   private String AV21EmpCod ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private String A2102OperCod ;
   private String AV25HisProCod ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String GXv_char6[] ;
   private boolean n3915EmpNumDec ;
   private boolean n1538BarCMtr ;
   private boolean n1534AlbEComP ;
   private boolean n1533AlbEComM ;
   private boolean n2651OperPreAlb ;
   private boolean n2652OperPreEAl ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00YL3_A396EmprCod ;
   private long[] P00YL3_A30AlbProCod ;
   private int[] P00YL3_A129BarCod ;
   private byte[] P00YL3_A132BarCodReo ;
   private String[] P00YL3_A130BarCodPar ;
   private byte[] P00YL3_A3915EmpNumDec ;
   private boolean[] P00YL3_n3915EmpNumDec ;
   private java.math.BigDecimal[] P00YL3_A1538BarCMtr ;
   private boolean[] P00YL3_n1538BarCMtr ;
   private String[] P00YL4_A396EmprCod ;
   private long[] P00YL4_A30AlbProCod ;
   private int[] P00YL4_A129BarCod ;
   private byte[] P00YL4_A132BarCodReo ;
   private String[] P00YL4_A130BarCodPar ;
   private String[] P00YL4_A1032FonCod ;
   private String[] P00YL4_A1056DisComCod ;
   private byte[] P00YL4_A2524DisComLin ;
   private short[] P00YL4_A1534AlbEComP ;
   private boolean[] P00YL4_n1534AlbEComP ;
   private java.math.BigDecimal[] P00YL4_A1533AlbEComM ;
   private boolean[] P00YL4_n1533AlbEComM ;
   private String[] P00YL5_A396EmprCod ;
   private long[] P00YL5_A30AlbProCod ;
   private int[] P00YL5_A129BarCod ;
   private byte[] P00YL5_A132BarCodReo ;
   private String[] P00YL5_A130BarCodPar ;
   private byte[] P00YL5_A2524DisComLin ;
   private String[] P00YL5_A1056DisComCod ;
   private String[] P00YL5_A1032FonCod ;
   private java.math.BigDecimal[] P00YL5_A2651OperPreAlb ;
   private boolean[] P00YL5_n2651OperPreAlb ;
   private String[] P00YL5_A2102OperCod ;
   private short[] P00YL5_A1761ExtCod ;
   private String[] P00YL6_A396EmprCod ;
   private long[] P00YL6_A30AlbProCod ;
   private int[] P00YL6_A129BarCod ;
   private byte[] P00YL6_A132BarCodReo ;
   private String[] P00YL6_A130BarCodPar ;
   private byte[] P00YL6_A2524DisComLin ;
   private String[] P00YL6_A1056DisComCod ;
   private String[] P00YL6_A1032FonCod ;
   private java.math.BigDecimal[] P00YL6_A2652OperPreEAl ;
   private boolean[] P00YL6_n2652OperPreEAl ;
   private String[] P00YL6_A2102OperCod ;
   private short[] P00YL6_A2666ProceCodA ;
}

final  class pcosest__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00YL3", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.EmpNumDec, COALESCE( T3.BarCMtr, 0) AS BarCMtr FROM ((TXPALBBAR T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT SUM(BarComMtr) AS BarCMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCOM GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YL4", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FonCod, DisComCod, DisComLin, AlbEComP, AlbEComM FROM TXPALBEST WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YL5", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, OperPreAlb, OperCod, ExtCod FROM TXPALBETO WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ExtCod, OperCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00YL6", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, OperPreEAl, OperCod, ProceCodA FROM TXPALBOPE WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ProceCodA, OperCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
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
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               ((short[]) buf[11])[0] = rslt.getShort(11);
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
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               ((short[]) buf[11])[0] = rslt.getShort(11);
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
               return;
      }
   }

}

