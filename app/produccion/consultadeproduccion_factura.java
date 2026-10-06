package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultadeproduccion_factura extends GXProcedure
{
   public consultadeproduccion_factura( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadeproduccion_factura.class ), "" );
   }

   public consultadeproduccion_factura( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String aP0 ,
                          int aP1 ,
                          byte aP2 ,
                          String aP3 )
   {
      consultadeproduccion_factura.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int[] aP4 )
   {
      consultadeproduccion_factura.this.A396EmprCod = aP0;
      consultadeproduccion_factura.this.A129BarCod = aP1;
      consultadeproduccion_factura.this.A132BarCodReo = aP2;
      consultadeproduccion_factura.this.A130BarCodPar = aP3;
      consultadeproduccion_factura.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Faccod = 0 ;
      /* Using cursor P09DY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P09DY2_A30AlbProCod[0] ;
         AV8Albprocod = A30AlbProCod ;
         /* Using cursor P09DY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A427FacAlbCod = P09DY3_A427FacAlbCod[0] ;
            A430FacCod = P09DY3_A430FacCod[0] ;
            A446FacLin = P09DY3_A446FacLin[0] ;
            AV9Faccod = A430FacCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = consultadeproduccion_factura.this.AV9Faccod;
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
      P09DY2_A396EmprCod = new String[] {""} ;
      P09DY2_A129BarCod = new int[1] ;
      P09DY2_A132BarCodReo = new byte[1] ;
      P09DY2_A130BarCodPar = new String[] {""} ;
      P09DY2_A30AlbProCod = new long[1] ;
      P09DY3_A396EmprCod = new String[] {""} ;
      P09DY3_A427FacAlbCod = new long[1] ;
      P09DY3_A430FacCod = new int[1] ;
      P09DY3_A446FacLin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_factura__default(),
         new Object[] {
             new Object[] {
            P09DY2_A396EmprCod, P09DY2_A129BarCod, P09DY2_A132BarCodReo, P09DY2_A130BarCodPar, P09DY2_A30AlbProCod
            }
            , new Object[] {
            P09DY3_A396EmprCod, P09DY3_A427FacAlbCod, P09DY3_A430FacCod, P09DY3_A446FacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV9Faccod ;
   private int A430FacCod ;
   private int A446FacLin ;
   private long A30AlbProCod ;
   private long AV8Albprocod ;
   private long A427FacAlbCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09DY2_A396EmprCod ;
   private int[] P09DY2_A129BarCod ;
   private byte[] P09DY2_A132BarCodReo ;
   private String[] P09DY2_A130BarCodPar ;
   private long[] P09DY2_A30AlbProCod ;
   private String[] P09DY3_A396EmprCod ;
   private long[] P09DY3_A427FacAlbCod ;
   private int[] P09DY3_A430FacCod ;
   private int[] P09DY3_A446FacLin ;
}

final  class consultadeproduccion_factura__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09DY2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09DY3", "SELECT EmprCod, FacAlbCod, FacCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacAlbCod = ? ORDER BY EmprCod, FacAlbCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

