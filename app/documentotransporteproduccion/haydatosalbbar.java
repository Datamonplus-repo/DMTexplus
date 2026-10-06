package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class haydatosalbbar extends GXProcedure
{
   public haydatosalbbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( haydatosalbbar.class ), "" );
   }

   public haydatosalbbar( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            long aP1 )
   {
      haydatosalbbar.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             short[] aP2 )
   {
      haydatosalbbar.this.A396EmprCod = aP0;
      haydatosalbbar.this.A30AlbProCod = aP1;
      haydatosalbbar.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8DatosAlbbar = (short)(0) ;
      /* Using cursor P09ZZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3391AlbSer = P09ZZ2_A3391AlbSer[0] ;
         A129BarCod = P09ZZ2_A129BarCod[0] ;
         A132BarCodReo = P09ZZ2_A132BarCodReo[0] ;
         A130BarCodPar = P09ZZ2_A130BarCodPar[0] ;
         AV8DatosAlbbar = (short)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = haydatosalbbar.this.AV8DatosAlbbar;
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
      P09ZZ2_A396EmprCod = new String[] {""} ;
      P09ZZ2_A30AlbProCod = new long[1] ;
      P09ZZ2_A3391AlbSer = new String[] {""} ;
      P09ZZ2_A129BarCod = new int[1] ;
      P09ZZ2_A132BarCodReo = new byte[1] ;
      P09ZZ2_A130BarCodPar = new String[] {""} ;
      A3391AlbSer = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.haydatosalbbar__default(),
         new Object[] {
             new Object[] {
            P09ZZ2_A396EmprCod, P09ZZ2_A30AlbProCod, P09ZZ2_A3391AlbSer, P09ZZ2_A129BarCod, P09ZZ2_A132BarCodReo, P09ZZ2_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV8DatosAlbbar ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A3391AlbSer ;
   private String A130BarCodPar ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P09ZZ2_A396EmprCod ;
   private long[] P09ZZ2_A30AlbProCod ;
   private String[] P09ZZ2_A3391AlbSer ;
   private int[] P09ZZ2_A129BarCod ;
   private byte[] P09ZZ2_A132BarCodReo ;
   private String[] P09ZZ2_A130BarCodPar ;
}

final  class haydatosalbbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ZZ2", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbSer, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               return;
      }
   }

}

