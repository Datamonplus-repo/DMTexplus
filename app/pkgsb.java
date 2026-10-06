package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkgsb extends GXProcedure
{
   public pkgsb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkgsb.class ), "" );
   }

   public pkgsb( int remoteHandle ,
                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           long[] aP1 ,
                                           int[] aP2 ,
                                           byte[] aP3 ,
                                           String[] aP4 )
   {
      pkgsb.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pkgsb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkgsb.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pkgsb.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pkgsb.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pkgsb.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pkgsb.this.AV8KgsB = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8KgsB = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P00WC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2026BarAlbPbr = P00WC2_A2026BarAlbPbr[0] ;
         n2026BarAlbPbr = P00WC2_n2026BarAlbPbr[0] ;
         AV8KgsB = A2026BarAlbPbr ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkgsb.this.A396EmprCod;
      this.aP1[0] = pkgsb.this.A30AlbProCod;
      this.aP2[0] = pkgsb.this.A129BarCod;
      this.aP3[0] = pkgsb.this.A132BarCodReo;
      this.aP4[0] = pkgsb.this.A130BarCodPar;
      this.aP5[0] = pkgsb.this.AV8KgsB;
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
      P00WC2_A396EmprCod = new String[] {""} ;
      P00WC2_A30AlbProCod = new long[1] ;
      P00WC2_A129BarCod = new int[1] ;
      P00WC2_A132BarCodReo = new byte[1] ;
      P00WC2_A130BarCodPar = new String[] {""} ;
      P00WC2_A2026BarAlbPbr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WC2_n2026BarAlbPbr = new boolean[] {false} ;
      A2026BarAlbPbr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkgsb__default(),
         new Object[] {
             new Object[] {
            P00WC2_A396EmprCod, P00WC2_A30AlbProCod, P00WC2_A129BarCod, P00WC2_A132BarCodReo, P00WC2_A130BarCodPar, P00WC2_A2026BarAlbPbr, P00WC2_n2026BarAlbPbr
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
   private java.math.BigDecimal AV8KgsB ;
   private java.math.BigDecimal A2026BarAlbPbr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private boolean n2026BarAlbPbr ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00WC2_A396EmprCod ;
   private long[] P00WC2_A30AlbProCod ;
   private int[] P00WC2_A129BarCod ;
   private byte[] P00WC2_A132BarCodReo ;
   private String[] P00WC2_A130BarCodPar ;
   private java.math.BigDecimal[] P00WC2_A2026BarAlbPbr ;
   private boolean[] P00WC2_n2026BarAlbPbr ;
}

final  class pkgsb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00WC2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarAlbPbr FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
      }
   }

}

