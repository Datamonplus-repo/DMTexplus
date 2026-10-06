package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_del extends GXProcedure
{
   public documentodetransporteproduccion_del( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_del.class ), "" );
   }

   public documentodetransporteproduccion_del( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        String aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             String aP5 )
   {
      documentodetransporteproduccion_del.this.AV8emprcod = aP0;
      documentodetransporteproduccion_del.this.AV9MetTerCod = aP1;
      documentodetransporteproduccion_del.this.AV10Barcod = aP2;
      documentodetransporteproduccion_del.this.AV11Barcodreo = aP3;
      documentodetransporteproduccion_del.this.AV12barcodpar = aP4;
      documentodetransporteproduccion_del.this.AV13metpiecod = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P0AL02 */
      pr_default.execute(0, new Object[] {AV8emprcod, AV9MetTerCod, Integer.valueOf(AV10Barcod), Byte.valueOf(AV11Barcodreo), AV12barcodpar, AV13metpiecod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.documentodetransporteproduccion_del");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_del__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Barcodreo ;
   private short Gx_err ;
   private int AV10Barcod ;
   private String AV8emprcod ;
   private String AV9MetTerCod ;
   private String AV12barcodpar ;
   private String AV13metpiecod ;
   private IDataStoreProvider pr_default ;
}

final  class documentodetransporteproduccion_del__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AL02", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

