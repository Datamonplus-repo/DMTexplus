package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelipi2 extends GXProcedure
{
   public pelipi2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelipi2.class ), "" );
   }

   public pelipi2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pelipi2.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pelipi2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelipi2.this.AV15AlbProCod = aP1[0];
      this.aP1 = aP1;
      pelipi2.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pelipi2.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pelipi2.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pelipi2.this.AV16BarPieCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00922 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV16BarPieCod, A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV16BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A200BarPieCod = P00922_A200BarPieCod[0] ;
         A30AlbProCod = P00922_A30AlbProCod[0] ;
         A1270AlbPMtrEnt = P00922_A1270AlbPMtrEnt[0] ;
         A27AlbPKilEnt = P00922_A27AlbPKilEnt[0] ;
         /* Using cursor P00923 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A1261BarAlbKgmE = P00923_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P00923_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = P00923_A1265BarAlbPie[0] ;
         /* Optimized DELETE. */
         /* Using cursor P00924 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
         /* End optimized DELETE. */
         AV18MetEnt = A1270AlbPMtrEnt ;
         AV17KilEnt = A27AlbPKilEnt ;
         A1261BarAlbKgmE = A1261BarAlbKgmE.subtract(A27AlbPKilEnt) ;
         A1263BarAlbMtrE = A1263BarAlbMtrE.subtract(A1270AlbPMtrEnt) ;
         A1265BarAlbPie = (int)(A1265BarAlbPie-1) ;
         /* Using cursor P00925 */
         pr_default.execute(3, new Object[] {A1261BarAlbKgmE, A1263BarAlbMtrE, Integer.valueOf(A1265BarAlbPie), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      /* Optimized DELETE. */
      /* Using cursor P00926 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(AV15AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV16BarPieCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
      /* End optimized DELETE. */
      /* Using cursor P00927 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A183BarMetLan = P00927_A183BarMetLan[0] ;
         A170BarKilLan = P00927_A170BarKilLan[0] ;
         A201BarPieEst = P00927_A201BarPieEst[0] ;
         A1271BarPieLzd = P00927_A1271BarPieLzd[0] ;
         A200BarPieCod = P00927_A200BarPieCod[0] ;
         A183BarMetLan = A183BarMetLan.subtract(AV18MetEnt) ;
         A170BarKilLan = A170BarKilLan.subtract(AV17KilEnt) ;
         A201BarPieEst = (byte)(0) ;
         A1271BarPieLzd = (int)(A1271BarPieLzd-1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         /* Using cursor P00928 */
         pr_default.execute(6, new Object[] {A183BarMetLan, A170BarKilLan, Byte.valueOf(A201BarPieEst), Integer.valueOf(A1271BarPieLzd), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         if (true) break;
         /* Using cursor P00929 */
         pr_default.execute(7, new Object[] {A183BarMetLan, A170BarKilLan, Byte.valueOf(A201BarPieEst), Integer.valueOf(A1271BarPieLzd), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /* Optimized UPDATE. */
      /* Using cursor P009210 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV16BarPieCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelipi2.this.A396EmprCod;
      this.aP1[0] = pelipi2.this.AV15AlbProCod;
      this.aP2[0] = pelipi2.this.A129BarCod;
      this.aP3[0] = pelipi2.this.A132BarCodReo;
      this.aP4[0] = pelipi2.this.A130BarCodPar;
      this.aP5[0] = pelipi2.this.AV16BarPieCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelipi2");
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
      P00922_A396EmprCod = new String[] {""} ;
      P00922_A129BarCod = new int[1] ;
      P00922_A132BarCodReo = new byte[1] ;
      P00922_A130BarCodPar = new String[] {""} ;
      P00922_A200BarPieCod = new String[] {""} ;
      P00922_A30AlbProCod = new long[1] ;
      P00922_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00922_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A200BarPieCod = "" ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      P00923_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00923_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00923_A1265BarAlbPie = new int[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV18MetEnt = DecimalUtil.ZERO ;
      AV17KilEnt = DecimalUtil.ZERO ;
      P00927_A396EmprCod = new String[] {""} ;
      P00927_A129BarCod = new int[1] ;
      P00927_A132BarCodReo = new byte[1] ;
      P00927_A130BarCodPar = new String[] {""} ;
      P00927_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00927_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00927_A201BarPieEst = new byte[1] ;
      P00927_A1271BarPieLzd = new int[1] ;
      P00927_A200BarPieCod = new String[] {""} ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelipi2__default(),
         new Object[] {
             new Object[] {
            P00922_A396EmprCod, P00922_A129BarCod, P00922_A132BarCodReo, P00922_A130BarCodPar, P00922_A200BarPieCod, P00922_A30AlbProCod, P00922_A1270AlbPMtrEnt, P00922_A27AlbPKilEnt
            }
            , new Object[] {
            P00923_A1261BarAlbKgmE, P00923_A1263BarAlbMtrE, P00923_A1265BarAlbPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00927_A396EmprCod, P00927_A129BarCod, P00927_A132BarCodReo, P00927_A130BarCodPar, P00927_A183BarMetLan, P00927_A170BarKilLan, P00927_A201BarPieEst, P00927_A1271BarPieLzd, P00927_A200BarPieCod
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
   private byte A201BarPieEst ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int A1271BarPieLzd ;
   private long AV15AlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV18MetEnt ;
   private java.math.BigDecimal AV17KilEnt ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV16BarPieCod ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00922_A396EmprCod ;
   private int[] P00922_A129BarCod ;
   private byte[] P00922_A132BarCodReo ;
   private String[] P00922_A130BarCodPar ;
   private String[] P00922_A200BarPieCod ;
   private long[] P00922_A30AlbProCod ;
   private java.math.BigDecimal[] P00922_A1270AlbPMtrEnt ;
   private java.math.BigDecimal[] P00922_A27AlbPKilEnt ;
   private java.math.BigDecimal[] P00923_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P00923_A1263BarAlbMtrE ;
   private int[] P00923_A1265BarAlbPie ;
   private String[] P00927_A396EmprCod ;
   private int[] P00927_A129BarCod ;
   private byte[] P00927_A132BarCodReo ;
   private String[] P00927_A130BarCodPar ;
   private java.math.BigDecimal[] P00927_A183BarMetLan ;
   private java.math.BigDecimal[] P00927_A170BarKilLan ;
   private byte[] P00927_A201BarPieEst ;
   private int[] P00927_A1271BarPieLzd ;
   private String[] P00927_A200BarPieCod ;
}

final  class pelipi2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00922", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbProCod, AlbPMtrEnt, AlbPKilEnt FROM TXPLALPRD WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00923", "SELECT BarAlbKgmE, BarAlbMtrE, BarAlbPie FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00924", "DELETE FROM TXPLALTRZ  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALTRZ")
         ,new UpdateCursor("P00925", "UPDATE TXPALBBAR SET BarAlbKgmE=?, BarAlbMtrE=?, BarAlbPie=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new UpdateCursor("P00926", "DELETE FROM TXPLALPRD  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new ForEachCursor("P00927", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarMetLan, BarKilLan, BarPieEst, BarPieLzd, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00928", "UPDATE TXPBARPIE SET BarMetLan=?, BarKilLan=?, BarPieEst=?, BarPieLzd=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P00929", "UPDATE TXPBARPIE SET BarMetLan=?, BarKilLan=?, BarPieEst=?, BarPieLzd=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P009210", "UPDATE TXPLMETPI SET MetPieEst=0  WHERE (EmprCod = ?) AND (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) AND (MetPieCod = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
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
               stmt.setString(6, (String)parms[5], 9);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 9);
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
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 9);
               return;
            case 7 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 9);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
      }
   }

}

