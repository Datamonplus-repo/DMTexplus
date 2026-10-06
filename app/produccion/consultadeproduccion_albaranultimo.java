package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_albaranultimo extends GXProcedure
{
   public consultadeproduccion_albaranultimo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_albaranultimo.class ), "" );
   }

   public consultadeproduccion_albaranultimo( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String aP0 ,
                           int aP1 ,
                           byte aP2 ,
                           String aP3 )
   {
      consultadeproduccion_albaranultimo.this.aP4 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        long[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             long[] aP4 )
   {
      consultadeproduccion_albaranultimo.this.A396EmprCod = aP0;
      consultadeproduccion_albaranultimo.this.A129BarCod = aP1;
      consultadeproduccion_albaranultimo.this.A132BarCodReo = aP2;
      consultadeproduccion_albaranultimo.this.A130BarCodPar = aP3;
      consultadeproduccion_albaranultimo.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Albprocod = 0 ;
      /* Using cursor P09DT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P09DT2_A30AlbProCod[0] ;
         AV8Albprocod = A30AlbProCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = consultadeproduccion_albaranultimo.this.AV8Albprocod;
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
      P09DT2_A396EmprCod = new String[] {""} ;
      P09DT2_A129BarCod = new int[1] ;
      P09DT2_A132BarCodReo = new byte[1] ;
      P09DT2_A130BarCodPar = new String[] {""} ;
      P09DT2_A30AlbProCod = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_albaranultimo__default(),
         new Object[] {
             new Object[] {
            P09DT2_A396EmprCod, P09DT2_A129BarCod, P09DT2_A132BarCodReo, P09DT2_A130BarCodPar, P09DT2_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private long AV8Albprocod ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private long[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09DT2_A396EmprCod ;
   private int[] P09DT2_A129BarCod ;
   private byte[] P09DT2_A132BarCodReo ;
   private String[] P09DT2_A130BarCodPar ;
   private long[] P09DT2_A30AlbProCod ;
}

final  class consultadeproduccion_albaranultimo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09DT2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[4])[0] = rslt.getLong(5);
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

