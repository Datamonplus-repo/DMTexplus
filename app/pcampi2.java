package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcampi2 extends GXProcedure
{
   public pcampi2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcampi2.class ), "" );
   }

   public pcampi2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pcampi2.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 )
   {
      pcampi2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcampi2.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pcampi2.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pcampi2.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pcampi2.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pcampi2.this.AV15Kilos = aP5[0];
      this.aP5 = aP5;
      pcampi2.this.AV16KilAnt = aP6[0];
      this.aP6 = aP6;
      pcampi2.this.AV17Modo = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P008K3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1269BarAlbPza = P008K3_A1269BarAlbPza[0] ;
         n1269BarAlbPza = P008K3_n1269BarAlbPza[0] ;
         A1269BarAlbPza = P008K3_A1269BarAlbPza[0] ;
         n1269BarAlbPza = P008K3_n1269BarAlbPza[0] ;
         AV18Piezas = A1269BarAlbPza ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P008K4 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A27AlbPKilEnt = P008K4_A27AlbPKilEnt[0] ;
         A200BarPieCod = P008K4_A200BarPieCod[0] ;
         if ( P008K4_A30AlbProCod[0] == A30AlbProCod )
         {
            /* Using cursor P008K5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            A365DisDes = P008K5_A365DisDes[0] ;
            /* Using cursor P008K6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            A170BarKilLan = P008K6_A170BarKilLan[0] ;
            if ( GXutil.strcmp(AV17Modo, httpContext.getMessage( "DEL", "")) == 0 )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  A170BarKilLan = A170BarKilLan.subtract((AV15Kilos.divide(DecimalUtil.doubleToDec(AV18Piezas), 18, java.math.RoundingMode.DOWN))) ;
               }
               else
               {
                  A170BarKilLan = A170BarKilLan.subtract(AV15Kilos) ;
               }
            }
            if ( GXutil.strcmp(AV17Modo, httpContext.getMessage( "UPD", "")) == 0 )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  A170BarKilLan = A170BarKilLan.subtract((AV16KilAnt.divide(DecimalUtil.doubleToDec(AV18Piezas), 18, java.math.RoundingMode.DOWN))).add((AV15Kilos.divide(DecimalUtil.doubleToDec(AV18Piezas), 18, java.math.RoundingMode.DOWN))) ;
               }
               else
               {
                  A170BarKilLan = A170BarKilLan.subtract(AV16KilAnt).add(AV15Kilos) ;
               }
            }
            if ( ( GXutil.strcmp(AV17Modo, httpContext.getMessage( "INS", "")) == 0 ) && ( ( DecimalUtil.compareTo(AV15Kilos, AV16KilAnt) != 0 ) ) )
            {
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  A170BarKilLan = (AV15Kilos.divide(DecimalUtil.doubleToDec(AV18Piezas), 18, java.math.RoundingMode.DOWN)) ;
               }
               else
               {
                  A170BarKilLan = AV15Kilos ;
               }
            }
            /* Using cursor P008K7 */
            pr_default.execute(4, new Object[] {A170BarKilLan, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      pr_default.close(2);
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcampi2.this.A396EmprCod;
      this.aP1[0] = pcampi2.this.A30AlbProCod;
      this.aP2[0] = pcampi2.this.A129BarCod;
      this.aP3[0] = pcampi2.this.A132BarCodReo;
      this.aP4[0] = pcampi2.this.A130BarCodPar;
      this.aP5[0] = pcampi2.this.AV15Kilos;
      this.aP6[0] = pcampi2.this.AV16KilAnt;
      this.aP7[0] = pcampi2.this.AV17Modo;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcampi2");
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
      P008K3_A396EmprCod = new String[] {""} ;
      P008K3_A30AlbProCod = new long[1] ;
      P008K3_A129BarCod = new int[1] ;
      P008K3_A132BarCodReo = new byte[1] ;
      P008K3_A130BarCodPar = new String[] {""} ;
      P008K3_A1269BarAlbPza = new short[1] ;
      P008K3_n1269BarAlbPza = new boolean[] {false} ;
      P008K4_A396EmprCod = new String[] {""} ;
      P008K4_A30AlbProCod = new long[1] ;
      P008K4_A129BarCod = new int[1] ;
      P008K4_A132BarCodReo = new byte[1] ;
      P008K4_A130BarCodPar = new String[] {""} ;
      P008K4_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008K4_A200BarPieCod = new String[] {""} ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      P008K5_A365DisDes = new String[] {""} ;
      A365DisDes = "" ;
      P008K6_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A170BarKilLan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcampi2__default(),
         new Object[] {
             new Object[] {
            P008K3_A396EmprCod, P008K3_A30AlbProCod, P008K3_A129BarCod, P008K3_A132BarCodReo, P008K3_A130BarCodPar, P008K3_A1269BarAlbPza, P008K3_n1269BarAlbPza
            }
            , new Object[] {
            P008K4_A396EmprCod, P008K4_A30AlbProCod, P008K4_A129BarCod, P008K4_A132BarCodReo, P008K4_A130BarCodPar, P008K4_A27AlbPKilEnt, P008K4_A200BarPieCod
            }
            , new Object[] {
            P008K5_A365DisDes
            }
            , new Object[] {
            P008K6_A170BarKilLan
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1269BarAlbPza ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV18Piezas ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV15Kilos ;
   private java.math.BigDecimal AV16KilAnt ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A170BarKilLan ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV17Modo ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String A365DisDes ;
   private boolean n1269BarAlbPza ;
   private String[] aP7 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P008K3_A396EmprCod ;
   private long[] P008K3_A30AlbProCod ;
   private int[] P008K3_A129BarCod ;
   private byte[] P008K3_A132BarCodReo ;
   private String[] P008K3_A130BarCodPar ;
   private short[] P008K3_A1269BarAlbPza ;
   private boolean[] P008K3_n1269BarAlbPza ;
   private String[] P008K4_A396EmprCod ;
   private long[] P008K4_A30AlbProCod ;
   private int[] P008K4_A129BarCod ;
   private byte[] P008K4_A132BarCodReo ;
   private String[] P008K4_A130BarCodPar ;
   private java.math.BigDecimal[] P008K4_A27AlbPKilEnt ;
   private String[] P008K4_A200BarPieCod ;
   private String[] P008K5_A365DisDes ;
   private java.math.BigDecimal[] P008K6_A170BarKilLan ;
}

final  class pcampi2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008K3", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T2.BarAlbPza, 0) AS BarAlbPza FROM (TXPALBBAR T1 LEFT JOIN (SELECT COUNT(*) AS BarAlbPza, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALPRD GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008K4", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPKilEnt, BarPieCod FROM TXPLALPRD WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND ((EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (AlbProCod = ?)) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P008K5", "SELECT DisDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P008K6", "SELECT BarKilLan FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008K7", "UPDATE TXPBARPIE SET BarKilLan=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setLong(9, ((Number) parms[8]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

