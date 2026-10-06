package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkgmtpr extends GXProcedure
{
   public pkgmtpr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkgmtpr.class ), "" );
   }

   public pkgmtpr( int remoteHandle ,
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
      pkgmtpr.this.aP4 = new String[] {""};
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
      pkgmtpr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkgmtpr.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pkgmtpr.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pkgmtpr.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pkgmtpr.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00A23 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1261BarAlbKgmE = P00A23_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P00A23_A1263BarAlbMtrE[0] ;
         A1380AlbBarKil = P00A23_A1380AlbBarKil[0] ;
         A1381AlbBarMet = P00A23_A1381AlbBarMet[0] ;
         A1380AlbBarKil = P00A23_A1380AlbBarKil[0] ;
         A1381AlbBarMet = P00A23_A1381AlbBarMet[0] ;
         AV15Kilos = A1380AlbBarKil ;
         AV16Metros = A1381AlbBarMet ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV15Kilos)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV16Metros)==0) )
         {
            AV15Kilos = A1261BarAlbKgmE ;
            AV16Metros = A1263BarAlbMtrE ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      n1472PrdMtr = false ;
      n1471PrdKgm = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00A24 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n1472PrdMtr), AV16Metros, Boolean.valueOf(n1471PrdKgm), AV15Kilos, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPRD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkgmtpr.this.A396EmprCod;
      this.aP1[0] = pkgmtpr.this.A30AlbProCod;
      this.aP2[0] = pkgmtpr.this.A129BarCod;
      this.aP3[0] = pkgmtpr.this.A132BarCodReo;
      this.aP4[0] = pkgmtpr.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkgmtpr");
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
      P00A23_A396EmprCod = new String[] {""} ;
      P00A23_A30AlbProCod = new long[1] ;
      P00A23_A129BarCod = new int[1] ;
      P00A23_A132BarCodReo = new byte[1] ;
      P00A23_A130BarCodPar = new String[] {""} ;
      P00A23_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A23_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A23_A1380AlbBarKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00A23_A1381AlbBarMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1380AlbBarKil = DecimalUtil.ZERO ;
      A1381AlbBarMet = DecimalUtil.ZERO ;
      AV15Kilos = DecimalUtil.ZERO ;
      AV16Metros = DecimalUtil.ZERO ;
      A1472PrdMtr = DecimalUtil.ZERO ;
      A1471PrdKgm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkgmtpr__default(),
         new Object[] {
             new Object[] {
            P00A23_A396EmprCod, P00A23_A30AlbProCod, P00A23_A129BarCod, P00A23_A132BarCodReo, P00A23_A130BarCodPar, P00A23_A1261BarAlbKgmE, P00A23_A1263BarAlbMtrE, P00A23_A1380AlbBarKil, P00A23_A1381AlbBarMet
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
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1380AlbBarKil ;
   private java.math.BigDecimal A1381AlbBarMet ;
   private java.math.BigDecimal AV15Kilos ;
   private java.math.BigDecimal AV16Metros ;
   private java.math.BigDecimal A1472PrdMtr ;
   private java.math.BigDecimal A1471PrdKgm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private boolean n1472PrdMtr ;
   private boolean n1471PrdKgm ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00A23_A396EmprCod ;
   private long[] P00A23_A30AlbProCod ;
   private int[] P00A23_A129BarCod ;
   private byte[] P00A23_A132BarCodReo ;
   private String[] P00A23_A130BarCodPar ;
   private java.math.BigDecimal[] P00A23_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P00A23_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P00A23_A1380AlbBarKil ;
   private java.math.BigDecimal[] P00A23_A1381AlbBarMet ;
}

final  class pkgmtpr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00A23", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbKgmE, T1.BarAlbMtrE, COALESCE( T2.AlbBarKil, 0) AS AlbBarKil, COALESCE( T2.AlbBarMet, 0) AS AlbBarMet FROM (TXPALBBAR T1 LEFT JOIN (SELECT SUM(AlbPKilEnt) AS AlbBarKil, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, SUM(AlbPMtrEnt) AS AlbBarMet FROM TXPLALPRD GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00A24", "UPDATE TXPALBPRD SET PrdMtr=?, PrdKgm=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBPRD")
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
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
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
               stmt.setString(3, (String)parms[4], 3);
               stmt.setLong(4, ((Number) parms[5]).longValue());
               stmt.setInt(5, ((Number) parms[6]).intValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               stmt.setString(7, (String)parms[8], 1);
               return;
      }
   }

}

