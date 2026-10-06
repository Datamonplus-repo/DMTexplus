package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkilfa3 extends GXProcedure
{
   public pkilfa3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkilfa3.class ), "" );
   }

   public pkilfa3( int remoteHandle ,
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
      pkilfa3.this.aP4 = new String[] {""};
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
      pkilfa3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkilfa3.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pkilfa3.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pkilfa3.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pkilfa3.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00913 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1380AlbBarKil = P00913_A1380AlbBarKil[0] ;
         A1381AlbBarMet = P00913_A1381AlbBarMet[0] ;
         A1380AlbBarKil = P00913_A1380AlbBarKil[0] ;
         A1381AlbBarMet = P00913_A1381AlbBarMet[0] ;
         AV15Kilos = A1380AlbBarKil ;
         AV16Metros = A1381AlbBarMet ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P00914 */
      pr_default.execute(1, new Object[] {AV16Metros, AV15Kilos, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkilfa3.this.A396EmprCod;
      this.aP1[0] = pkilfa3.this.A30AlbProCod;
      this.aP2[0] = pkilfa3.this.A129BarCod;
      this.aP3[0] = pkilfa3.this.A132BarCodReo;
      this.aP4[0] = pkilfa3.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkilfa3");
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
      P00913_A396EmprCod = new String[] {""} ;
      P00913_A30AlbProCod = new long[1] ;
      P00913_A129BarCod = new int[1] ;
      P00913_A132BarCodReo = new byte[1] ;
      P00913_A130BarCodPar = new String[] {""} ;
      P00913_A1380AlbBarKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00913_A1381AlbBarMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1380AlbBarKil = DecimalUtil.ZERO ;
      A1381AlbBarMet = DecimalUtil.ZERO ;
      AV15Kilos = DecimalUtil.ZERO ;
      AV16Metros = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkilfa3__default(),
         new Object[] {
             new Object[] {
            P00913_A396EmprCod, P00913_A30AlbProCod, P00913_A129BarCod, P00913_A132BarCodReo, P00913_A130BarCodPar, P00913_A1380AlbBarKil, P00913_A1381AlbBarMet
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1380AlbBarKil ;
   private java.math.BigDecimal A1381AlbBarMet ;
   private java.math.BigDecimal AV15Kilos ;
   private java.math.BigDecimal AV16Metros ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00913_A396EmprCod ;
   private long[] P00913_A30AlbProCod ;
   private int[] P00913_A129BarCod ;
   private byte[] P00913_A132BarCodReo ;
   private String[] P00913_A130BarCodPar ;
   private java.math.BigDecimal[] P00913_A1380AlbBarKil ;
   private java.math.BigDecimal[] P00913_A1381AlbBarMet ;
}

final  class pkilfa3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00913", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T2.AlbBarKil, 0) AS AlbBarKil, COALESCE( T2.AlbBarMet, 0) AS AlbBarMet FROM (TXPALBBAR T1 LEFT JOIN (SELECT SUM(AlbPKilEnt) AS AlbBarKil, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, SUM(AlbPMtrEnt) AS AlbBarMet FROM TXPLALPRD GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00914", "UPDATE TXPALBFAS SET FasMtr=?, FasKgm=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

