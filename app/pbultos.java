package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbultos extends GXProcedure
{
   public pbultos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbultos.class ), "" );
   }

   public pbultos( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            long[] aP1 ,
                            int[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 )
   {
      pbultos.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pbultos.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbultos.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pbultos.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pbultos.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pbultos.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pbultos.this.AV8Bultos = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Bultos = (short)(0) ;
      /* Using cursor P00W42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1458BarAlbBul = P00W42_A1458BarAlbBul[0] ;
         AV8Bultos = A1458BarAlbBul ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbultos.this.A396EmprCod;
      this.aP1[0] = pbultos.this.A30AlbProCod;
      this.aP2[0] = pbultos.this.A129BarCod;
      this.aP3[0] = pbultos.this.A132BarCodReo;
      this.aP4[0] = pbultos.this.A130BarCodPar;
      this.aP5[0] = pbultos.this.AV8Bultos;
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
      P00W42_A396EmprCod = new String[] {""} ;
      P00W42_A30AlbProCod = new long[1] ;
      P00W42_A129BarCod = new int[1] ;
      P00W42_A132BarCodReo = new byte[1] ;
      P00W42_A130BarCodPar = new String[] {""} ;
      P00W42_A1458BarAlbBul = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbultos__default(),
         new Object[] {
             new Object[] {
            P00W42_A396EmprCod, P00W42_A30AlbProCod, P00W42_A129BarCod, P00W42_A132BarCodReo, P00W42_A130BarCodPar, P00W42_A1458BarAlbBul
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV8Bultos ;
   private short A1458BarAlbBul ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private short[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00W42_A396EmprCod ;
   private long[] P00W42_A30AlbProCod ;
   private int[] P00W42_A129BarCod ;
   private byte[] P00W42_A132BarCodReo ;
   private String[] P00W42_A130BarCodPar ;
   private short[] P00W42_A1458BarAlbBul ;
}

final  class pbultos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00W42", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarAlbBul FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

