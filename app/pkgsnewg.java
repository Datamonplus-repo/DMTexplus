package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkgsnewg extends GXProcedure
{
   public pkgsnewg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkgsnewg.class ), "" );
   }

   public pkgsnewg( int remoteHandle ,
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
      pkgsnewg.this.aP4 = new String[] {""};
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
      pkgsnewg.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkgsnewg.this.AV12Albprocod = aP1[0];
      this.aP1 = aP1;
      pkgsnewg.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pkgsnewg.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pkgsnewg.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8AlbHdRKgR = DecimalUtil.doubleToDec(0) ;
      AV9AlbHdRPzR = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P02LR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV12Albprocod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      c6625AlbHdRKgR = P02LR2_A6625AlbHdRKgR[0] ;
      n6625AlbHdRKgR = P02LR2_n6625AlbHdRKgR[0] ;
      c6626AlbHdRPzR = P02LR2_A6626AlbHdRPzR[0] ;
      n6626AlbHdRPzR = P02LR2_n6626AlbHdRPzR[0] ;
      pr_default.close(0);
      AV8AlbHdRKgR = AV8AlbHdRKgR.add(c6625AlbHdRKgR) ;
      AV9AlbHdRPzR = (short)(AV9AlbHdRPzR+c6626AlbHdRPzR) ;
      /* End optimized group. */
      /* Using cursor P02LR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(AV12Albprocod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A30AlbProCod = P02LR3_A30AlbProCod[0] ;
         A1261BarAlbKgmE = P02LR3_A1261BarAlbKgmE[0] ;
         A1265BarAlbPie = P02LR3_A1265BarAlbPie[0] ;
         A1261BarAlbKgmE = AV8AlbHdRKgR ;
         A1265BarAlbPie = AV9AlbHdRPzR ;
         /* Optimized UPDATE. */
         /* Using cursor P02LR4 */
         pr_default.execute(2, new Object[] {AV8AlbHdRKgR, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
         /* End optimized UPDATE. */
         /* Using cursor P02LR5 */
         pr_default.execute(3, new Object[] {A1261BarAlbKgmE, Integer.valueOf(A1265BarAlbPie), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV10Baralbkgme = DecimalUtil.doubleToDec(0) ;
      AV11Baralbpie = 0 ;
      /* Optimized group. */
      /* Using cursor P02LR6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      c1261BarAlbKgmE = P02LR6_A1261BarAlbKgmE[0] ;
      c1265BarAlbPie = P02LR6_A1265BarAlbPie[0] ;
      pr_default.close(4);
      AV10Baralbkgme = AV10Baralbkgme.add(c1261BarAlbKgmE) ;
      AV11Baralbpie = (int)(AV11Baralbpie+c1265BarAlbPie) ;
      /* End optimized group. */
      /* Optimized UPDATE. */
      /* Using cursor P02LR7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(AV11Baralbpie), AV10Baralbkgme, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkgsnewg.this.A396EmprCod;
      this.aP1[0] = pkgsnewg.this.AV12Albprocod;
      this.aP2[0] = pkgsnewg.this.A129BarCod;
      this.aP3[0] = pkgsnewg.this.A132BarCodReo;
      this.aP4[0] = pkgsnewg.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkgsnewg");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8AlbHdRKgR = DecimalUtil.ZERO ;
      c6625AlbHdRKgR = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02LR2_A6625AlbHdRKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LR2_n6625AlbHdRKgR = new boolean[] {false} ;
      P02LR2_A6626AlbHdRPzR = new short[1] ;
      P02LR2_n6626AlbHdRPzR = new boolean[] {false} ;
      P02LR3_A396EmprCod = new String[] {""} ;
      P02LR3_A129BarCod = new int[1] ;
      P02LR3_A132BarCodReo = new byte[1] ;
      P02LR3_A130BarCodPar = new String[] {""} ;
      P02LR3_A30AlbProCod = new long[1] ;
      P02LR3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LR3_A1265BarAlbPie = new int[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      AV10Baralbkgme = DecimalUtil.ZERO ;
      c1261BarAlbKgmE = DecimalUtil.ZERO ;
      P02LR6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02LR6_A1265BarAlbPie = new int[1] ;
      A170BarKilLan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkgsnewg__default(),
         new Object[] {
             new Object[] {
            P02LR2_A6625AlbHdRKgR, P02LR2_n6625AlbHdRKgR, P02LR2_A6626AlbHdRPzR, P02LR2_n6626AlbHdRPzR
            }
            , new Object[] {
            P02LR3_A396EmprCod, P02LR3_A129BarCod, P02LR3_A132BarCodReo, P02LR3_A130BarCodPar, P02LR3_A30AlbProCod, P02LR3_A1261BarAlbKgmE, P02LR3_A1265BarAlbPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02LR6_A1261BarAlbKgmE, P02LR6_A1265BarAlbPie
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV9AlbHdRPzR ;
   private short c6626AlbHdRPzR ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int AV11Baralbpie ;
   private int c1265BarAlbPie ;
   private int A1271BarPieLzd ;
   private long AV12Albprocod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV8AlbHdRKgR ;
   private java.math.BigDecimal c6625AlbHdRKgR ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal AV10Baralbkgme ;
   private java.math.BigDecimal c1261BarAlbKgmE ;
   private java.math.BigDecimal A170BarKilLan ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private boolean n6625AlbHdRKgR ;
   private boolean n6626AlbHdRPzR ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P02LR2_A6625AlbHdRKgR ;
   private boolean[] P02LR2_n6625AlbHdRKgR ;
   private short[] P02LR2_A6626AlbHdRPzR ;
   private boolean[] P02LR2_n6626AlbHdRPzR ;
   private String[] P02LR3_A396EmprCod ;
   private int[] P02LR3_A129BarCod ;
   private byte[] P02LR3_A132BarCodReo ;
   private String[] P02LR3_A130BarCodPar ;
   private long[] P02LR3_A30AlbProCod ;
   private java.math.BigDecimal[] P02LR3_A1261BarAlbKgmE ;
   private int[] P02LR3_A1265BarAlbPie ;
   private java.math.BigDecimal[] P02LR6_A1261BarAlbKgmE ;
   private int[] P02LR6_A1265BarAlbPie ;
}

final  class pkgsnewg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02LR2", "SELECT SUM(AlbHdRKgR), SUM(AlbHdRPzR) FROM TXPALBREP WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02LR3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, BarAlbKgmE, BarAlbPie FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02LR4", "UPDATE TXPALBFAS SET FasMtr=0, FasKgm=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P02LR5", "UPDATE TXPALBBAR SET BarAlbKgmE=?, BarAlbPie=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P02LR6", "SELECT SUM(BarAlbKgmE), SUM(BarAlbPie) FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02LR7", "UPDATE TXPBARPIE SET BarPieLzd=?, BarKilLan=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

