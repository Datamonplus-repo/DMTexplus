package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ultimalineaalbfas extends GXProcedure
{
   public ultimalineaalbfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ultimalineaalbfas.class ), "" );
   }

   public ultimalineaalbfas( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            long aP1 ,
                            int aP2 ,
                            byte aP3 ,
                            String aP4 )
   {
      ultimalineaalbfas.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             short[] aP5 )
   {
      ultimalineaalbfas.this.A396EmprCod = aP0;
      ultimalineaalbfas.this.A30AlbProCod = aP1;
      ultimalineaalbfas.this.A129BarCod = aP2;
      ultimalineaalbfas.this.A132BarCodReo = aP3;
      ultimalineaalbfas.this.A130BarCodPar = aP4;
      ultimalineaalbfas.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8GuiFasLin = (short)(0) ;
      /* Using cursor P0AH92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1240GuiFasLin = P0AH92_A1240GuiFasLin[0] ;
         AV8GuiFasLin = A1240GuiFasLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV8GuiFasLin = (short)(AV8GuiFasLin+10) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = ultimalineaalbfas.this.AV8GuiFasLin;
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
      P0AH92_A396EmprCod = new String[] {""} ;
      P0AH92_A30AlbProCod = new long[1] ;
      P0AH92_A129BarCod = new int[1] ;
      P0AH92_A132BarCodReo = new byte[1] ;
      P0AH92_A130BarCodPar = new String[] {""} ;
      P0AH92_A1240GuiFasLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.ultimalineaalbfas__default(),
         new Object[] {
             new Object[] {
            P0AH92_A396EmprCod, P0AH92_A30AlbProCod, P0AH92_A129BarCod, P0AH92_A132BarCodReo, P0AH92_A130BarCodPar, P0AH92_A1240GuiFasLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV8GuiFasLin ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AH92_A396EmprCod ;
   private long[] P0AH92_A30AlbProCod ;
   private int[] P0AH92_A129BarCod ;
   private byte[] P0AH92_A132BarCodReo ;
   private String[] P0AH92_A130BarCodPar ;
   private short[] P0AH92_A1240GuiFasLin ;
}

final  class ultimalineaalbfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AH92", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

