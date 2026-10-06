package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmtkgal extends GXProcedure
{
   public pmtkgal( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmtkgal.class ), "" );
   }

   public pmtkgal( int remoteHandle ,
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
      pmtkgal.this.aP4 = new String[] {""};
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
      pmtkgal.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmtkgal.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pmtkgal.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pmtkgal.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pmtkgal.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Kilos = DecimalUtil.doubleToDec(0) ;
      AV16Metros = DecimalUtil.doubleToDec(0) ;
      AV21NumPiezas = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P015H2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      c27AlbPKilEnt = P015H2_A27AlbPKilEnt[0] ;
      c1270AlbPMtrEnt = P015H2_A1270AlbPMtrEnt[0] ;
      cV21NumPiezas = P015H2_AV21NumPiezas[0] ;
      pr_default.close(0);
      AV15Kilos = AV15Kilos.add(c27AlbPKilEnt) ;
      AV16Metros = AV16Metros.add(c1270AlbPMtrEnt) ;
      AV21NumPiezas = (short)(AV21NumPiezas+cV21NumPiezas*1) ;
      /* End optimized group. */
      /* Optimized UPDATE. */
      /* Using cursor P015H3 */
      int AV21NumPiezas1266Aux;
      AV21NumPiezas1266Aux = AV21NumPiezas ;
      int AV21NumPiezas1265Aux;
      AV21NumPiezas1265Aux = AV21NumPiezas ;
      pr_default.execute(1, new Object[] {Integer.valueOf(AV21NumPiezas1266Aux), Integer.valueOf(AV21NumPiezas1265Aux), AV15Kilos, AV16Metros, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmtkgal.this.A396EmprCod;
      this.aP1[0] = pmtkgal.this.A30AlbProCod;
      this.aP2[0] = pmtkgal.this.A129BarCod;
      this.aP3[0] = pmtkgal.this.A132BarCodReo;
      this.aP4[0] = pmtkgal.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmtkgal");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15Kilos = DecimalUtil.ZERO ;
      AV16Metros = DecimalUtil.ZERO ;
      c27AlbPKilEnt = DecimalUtil.ZERO ;
      c1270AlbPMtrEnt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P015H2_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P015H2_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P015H2_AV21NumPiezas = new short[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmtkgal__default(),
         new Object[] {
             new Object[] {
            P015H2_A27AlbPKilEnt, P015H2_A1270AlbPMtrEnt, P015H2_AV21NumPiezas
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV21NumPiezas ;
   private short cV21NumPiezas ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A1266BarAlbTub ;
   private int A1265BarAlbPie ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV15Kilos ;
   private java.math.BigDecimal AV16Metros ;
   private java.math.BigDecimal c27AlbPKilEnt ;
   private java.math.BigDecimal c1270AlbPMtrEnt ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P015H2_A27AlbPKilEnt ;
   private java.math.BigDecimal[] P015H2_A1270AlbPMtrEnt ;
   private short[] P015H2_AV21NumPiezas ;
}

final  class pmtkgal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P015H2", "SELECT SUM(AlbPKilEnt), SUM(AlbPMtrEnt), COUNT(*) FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P015H3", "UPDATE TXPALBBAR SET BarAlbTub=?, BarAlbPie=?, BarAlbKgmE=?, BarAlbMtrE=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
      }
   }

}

