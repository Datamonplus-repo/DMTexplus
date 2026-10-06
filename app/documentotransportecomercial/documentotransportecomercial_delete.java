package app.documentotransportecomercial ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_delete extends GXProcedure
{
   public documentotransportecomercial_delete( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_delete.class ), "" );
   }

   public documentotransportecomercial_delete( int remoteHandle ,
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
      documentotransportecomercial_delete.this.A396EmprCod = aP0;
      documentotransportecomercial_delete.this.A14AlbComCod = aP1;
      documentotransportecomercial_delete.this.A20AlbComLin = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P0AI52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Short.valueOf(A20AlbComLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALCOM");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransportecomercial.documentotransportecomercial_delete");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_delete__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A20AlbComLin ;
   private short Gx_err ;
   private int A14AlbComCod ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
}

final  class documentotransportecomercial_delete__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AI52", "DELETE FROM TXPLALCOM  WHERE EmprCod = ? and AlbComCod = ? and AlbComLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALCOM")
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

