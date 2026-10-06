package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupdalbbar extends GXProcedure
{
   public pupdalbbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupdalbbar.class ), "" );
   }

   public pupdalbbar( int remoteHandle ,
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
      pupdalbbar.this.aP4 = new String[] {""};
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
      pupdalbbar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pupdalbbar.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pupdalbbar.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pupdalbbar.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pupdalbbar.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8BarAlbKgme = DecimalUtil.doubleToDec(0) ;
      AV9BarALbMtre = DecimalUtil.doubleToDec(0) ;
      AV10BarALbPie = 0 ;
      /* Using cursor P05E12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1261BarAlbKgmE = P05E12_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P05E12_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = P05E12_A1265BarAlbPie[0] ;
         /* Optimized group. */
         /* Using cursor P05E13 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         c27AlbPKilEnt = P05E13_A27AlbPKilEnt[0] ;
         c1270AlbPMtrEnt = P05E13_A1270AlbPMtrEnt[0] ;
         cV10BarALbPie = P05E13_AV10BarALbPie[0] ;
         pr_default.close(1);
         AV8BarAlbKgme = AV8BarAlbKgme.add(c27AlbPKilEnt) ;
         AV9BarALbMtre = AV9BarALbMtre.add(c1270AlbPMtrEnt) ;
         AV10BarALbPie = (int)(AV10BarALbPie+cV10BarALbPie*1) ;
         /* End optimized group. */
         A1261BarAlbKgmE = AV8BarAlbKgme ;
         A1263BarAlbMtrE = AV9BarALbMtre ;
         A1265BarAlbPie = AV10BarALbPie ;
         /* Using cursor P05E14 */
         pr_default.execute(2, new Object[] {A1261BarAlbKgmE, A1263BarAlbMtrE, Integer.valueOf(A1265BarAlbPie), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pupdalbbar.this.A396EmprCod;
      this.aP1[0] = pupdalbbar.this.A30AlbProCod;
      this.aP2[0] = pupdalbbar.this.A129BarCod;
      this.aP3[0] = pupdalbbar.this.A132BarCodReo;
      this.aP4[0] = pupdalbbar.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pupdalbbar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8BarAlbKgme = DecimalUtil.ZERO ;
      AV9BarALbMtre = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05E12_A396EmprCod = new String[] {""} ;
      P05E12_A30AlbProCod = new long[1] ;
      P05E12_A129BarCod = new int[1] ;
      P05E12_A132BarCodReo = new byte[1] ;
      P05E12_A130BarCodPar = new String[] {""} ;
      P05E12_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05E12_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05E12_A1265BarAlbPie = new int[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      c27AlbPKilEnt = DecimalUtil.ZERO ;
      c1270AlbPMtrEnt = DecimalUtil.ZERO ;
      P05E13_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05E13_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05E13_AV10BarALbPie = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pupdalbbar__default(),
         new Object[] {
             new Object[] {
            P05E12_A396EmprCod, P05E12_A30AlbProCod, P05E12_A129BarCod, P05E12_A132BarCodReo, P05E12_A130BarCodPar, P05E12_A1261BarAlbKgmE, P05E12_A1263BarAlbMtrE, P05E12_A1265BarAlbPie
            }
            , new Object[] {
            P05E13_A27AlbPKilEnt, P05E13_A1270AlbPMtrEnt, P05E13_AV10BarALbPie
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
   private int AV10BarALbPie ;
   private int A1265BarAlbPie ;
   private int cV10BarALbPie ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV8BarAlbKgme ;
   private java.math.BigDecimal AV9BarALbMtre ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal c27AlbPKilEnt ;
   private java.math.BigDecimal c1270AlbPMtrEnt ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05E12_A396EmprCod ;
   private long[] P05E12_A30AlbProCod ;
   private int[] P05E12_A129BarCod ;
   private byte[] P05E12_A132BarCodReo ;
   private String[] P05E12_A130BarCodPar ;
   private java.math.BigDecimal[] P05E12_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P05E12_A1263BarAlbMtrE ;
   private int[] P05E12_A1265BarAlbPie ;
   private java.math.BigDecimal[] P05E13_A27AlbPKilEnt ;
   private java.math.BigDecimal[] P05E13_A1270AlbPMtrEnt ;
   private int[] P05E13_AV10BarALbPie ;
}

final  class pupdalbbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05E12", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarAlbKgmE, BarAlbMtrE, BarAlbPie FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05E13", "SELECT SUM(AlbPKilEnt), SUM(AlbPMtrEnt), COUNT(*) FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05E14", "UPDATE TXPALBBAR SET BarAlbKgmE=?, BarAlbMtrE=?, BarAlbPie=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
      }
   }

}

