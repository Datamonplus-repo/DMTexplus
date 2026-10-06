package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ctrlhdrguia extends GXProcedure
{
   public ctrlhdrguia( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ctrlhdrguia.class ), "" );
   }

   public ctrlhdrguia( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 )
   {
      ctrlhdrguia.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             String[] aP5 )
   {
      ctrlhdrguia.this.AV8Emprcod = aP0;
      ctrlhdrguia.this.AV9albprocod = aP1;
      ctrlhdrguia.this.AV10barcod = aP2;
      ctrlhdrguia.this.AV11Barcodreo = aP3;
      ctrlhdrguia.this.AV12barcodpar = aP4;
      ctrlhdrguia.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Mensaje = "" ;
      /* Using cursor P0ACJ2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Long.valueOf(AV9albprocod), Integer.valueOf(AV10barcod), Byte.valueOf(AV11Barcodreo), AV12barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0ACJ2_A130BarCodPar[0] ;
         A132BarCodReo = P0ACJ2_A132BarCodReo[0] ;
         A129BarCod = P0ACJ2_A129BarCod[0] ;
         A30AlbProCod = P0ACJ2_A30AlbProCod[0] ;
         A396EmprCod = P0ACJ2_A396EmprCod[0] ;
         AV13Mensaje = httpContext.getMessage( "Atencion. Esta HDR ya fue ingresada.", "") + GXutil.newLine( ) ;
         AV13Mensaje += httpContext.getMessage( "Como estas en modo INSERT, debes de hacer la accion de modificar", "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = ctrlhdrguia.this.AV13Mensaje;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Mensaje = "" ;
      scmdbuf = "" ;
      P0ACJ2_A130BarCodPar = new String[] {""} ;
      P0ACJ2_A132BarCodReo = new byte[1] ;
      P0ACJ2_A129BarCod = new int[1] ;
      P0ACJ2_A30AlbProCod = new long[1] ;
      P0ACJ2_A396EmprCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ctrlhdrguia__default(),
         new Object[] {
             new Object[] {
            P0ACJ2_A130BarCodPar, P0ACJ2_A132BarCodReo, P0ACJ2_A129BarCod, P0ACJ2_A30AlbProCod, P0ACJ2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Barcodreo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV10barcod ;
   private int A129BarCod ;
   private long AV9albprocod ;
   private long A30AlbProCod ;
   private String AV8Emprcod ;
   private String AV12barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String AV13Mensaje ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ACJ2_A130BarCodPar ;
   private byte[] P0ACJ2_A132BarCodReo ;
   private int[] P0ACJ2_A129BarCod ;
   private long[] P0ACJ2_A30AlbProCod ;
   private String[] P0ACJ2_A396EmprCod ;
}

final  class ctrlhdrguia__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ACJ2", "SELECT BarCodPar, BarCodReo, BarCod, AlbProCod, EmprCod FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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

