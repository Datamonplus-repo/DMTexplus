package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrfe2 extends GXProcedure
{
   public phdrfe2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrfe2.class ), "" );
   }

   public phdrfe2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     String[] aP3 )
   {
      phdrfe2.this.aP4 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.util.Date[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.util.Date[] aP4 )
   {
      phdrfe2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrfe2.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      phdrfe2.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      phdrfe2.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      phdrfe2.this.AV22BarFecFpr = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P01NM2 */
      pr_default.execute(0, new Object[] {AV22BarFecFpr, A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrfe2.this.A396EmprCod;
      this.aP1[0] = phdrfe2.this.AV15BarCod;
      this.aP2[0] = phdrfe2.this.AV16BarCodReo;
      this.aP3[0] = phdrfe2.this.AV17BarCodPar;
      this.aP4[0] = phdrfe2.this.AV22BarFecFpr;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdrfe2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A158BarFecFpr = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrfe2__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private short Gx_err ;
   private int AV15BarCod ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private java.util.Date AV22BarFecFpr ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class phdrfe2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01NM2", "UPDATE TXPBARCAD SET BarFecFpr=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

