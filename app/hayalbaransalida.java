package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hayalbaransalida extends GXProcedure
{
   public hayalbaransalida( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hayalbaransalida.class ), "" );
   }

   public hayalbaransalida( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           byte aP2 ,
                           String aP3 )
   {
      hayalbaransalida.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             byte[] aP4 )
   {
      hayalbaransalida.this.A396EmprCod = aP0;
      hayalbaransalida.this.A129BarCod = aP1;
      hayalbaransalida.this.A132BarCodReo = aP2;
      hayalbaransalida.this.A130BarCodPar = aP3;
      hayalbaransalida.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8HayAlbaran = (byte)(0) ;
      /* Using cursor P0ART2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1261BarAlbKgmE = P0ART2_A1261BarAlbKgmE[0] ;
         A30AlbProCod = P0ART2_A30AlbProCod[0] ;
         AV8HayAlbaran = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = hayalbaransalida.this.AV8HayAlbaran;
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
      P0ART2_A396EmprCod = new String[] {""} ;
      P0ART2_A129BarCod = new int[1] ;
      P0ART2_A132BarCodReo = new byte[1] ;
      P0ART2_A130BarCodPar = new String[] {""} ;
      P0ART2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ART2_A30AlbProCod = new long[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.hayalbaransalida__default(),
         new Object[] {
             new Object[] {
            P0ART2_A396EmprCod, P0ART2_A129BarCod, P0ART2_A132BarCodReo, P0ART2_A130BarCodPar, P0ART2_A1261BarAlbKgmE, P0ART2_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8HayAlbaran ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ART2_A396EmprCod ;
   private int[] P0ART2_A129BarCod ;
   private byte[] P0ART2_A132BarCodReo ;
   private String[] P0ART2_A130BarCodPar ;
   private java.math.BigDecimal[] P0ART2_A1261BarAlbKgmE ;
   private long[] P0ART2_A30AlbProCod ;
}

final  class hayalbaransalida__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ART2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAlbKgmE, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((long[]) buf[5])[0] = rslt.getLong(6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

