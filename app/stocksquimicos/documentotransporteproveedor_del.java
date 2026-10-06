package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_del extends GXProcedure
{
   public documentotransporteproveedor_del( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_del.class ), "" );
   }

   public documentotransporteproveedor_del( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 )
   {
      documentotransporteproveedor_del.this.AV10emprcod = aP0;
      documentotransporteproveedor_del.this.AV8AlbProID = aP1;
      documentotransporteproveedor_del.this.AV9AlbProLinea = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P0AIJ2 */
      pr_default.execute(0, new Object[] {AV10emprcod, Integer.valueOf(AV8AlbProID), Short.valueOf(AV9AlbProLinea)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRO");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.documentotransporteproveedor_del");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_del__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9AlbProLinea ;
   private short Gx_err ;
   private int AV8AlbProID ;
   private String AV10emprcod ;
   private IDataStoreProvider pr_default ;
}

final  class documentotransporteproveedor_del__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AIJ2", "DELETE FROM TXPLALPRO  WHERE EmprCod = ? and AlbProID = ? and AlbProLine = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRO")
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

