package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plalbfas extends GXProcedure
{
   public plalbfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plalbfas.class ), "" );
   }

   public plalbfas( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           long[] aP1 ,
                           int[] aP2 ,
                           byte[] aP3 ,
                           String[] aP4 )
   {
      plalbfas.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      plalbfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plalbfas.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      plalbfas.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      plalbfas.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      plalbfas.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      plalbfas.this.AV29OkAlbFas = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV29OkAlbFas = (byte)(0) ;
      /* Using cursor P00WQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1240GuiFasLin = P00WQ2_A1240GuiFasLin[0] ;
         AV29OkAlbFas = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plalbfas.this.A396EmprCod;
      this.aP1[0] = plalbfas.this.A30AlbProCod;
      this.aP2[0] = plalbfas.this.A129BarCod;
      this.aP3[0] = plalbfas.this.A132BarCodReo;
      this.aP4[0] = plalbfas.this.A130BarCodPar;
      this.aP5[0] = plalbfas.this.AV29OkAlbFas;
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
      P00WQ2_A396EmprCod = new String[] {""} ;
      P00WQ2_A30AlbProCod = new long[1] ;
      P00WQ2_A129BarCod = new int[1] ;
      P00WQ2_A132BarCodReo = new byte[1] ;
      P00WQ2_A130BarCodPar = new String[] {""} ;
      P00WQ2_A1240GuiFasLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plalbfas__default(),
         new Object[] {
             new Object[] {
            P00WQ2_A396EmprCod, P00WQ2_A30AlbProCod, P00WQ2_A129BarCod, P00WQ2_A132BarCodReo, P00WQ2_A130BarCodPar, P00WQ2_A1240GuiFasLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV29OkAlbFas ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00WQ2_A396EmprCod ;
   private long[] P00WQ2_A30AlbProCod ;
   private int[] P00WQ2_A129BarCod ;
   private byte[] P00WQ2_A132BarCodReo ;
   private String[] P00WQ2_A130BarCodPar ;
   private short[] P00WQ2_A1240GuiFasLin ;
}

final  class plalbfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00WQ2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

