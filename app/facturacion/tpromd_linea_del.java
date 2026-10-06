package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpromd_linea_del extends GXProcedure
{
   public tpromd_linea_del( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpromd_linea_del.class ), "" );
   }

   public tpromd_linea_del( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        int aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             int aP3 )
   {
      tpromd_linea_del.this.A396EmprCod = aP0;
      tpromd_linea_del.this.A252CliCod = aP1;
      tpromd_linea_del.this.A8391PMDCod = aP2;
      tpromd_linea_del.this.A8393PMDColNum = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P0ANG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(A8393PMDColNum)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tpromd_linea_del");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd_linea_del__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A8391PMDCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A8393PMDColNum ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
}

final  class tpromd_linea_del__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0ANG2", "DELETE FROM TXPProMD1  WHERE EmprCod = ? and CliCod = ? and PMDCod = ? and PMDColNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPProMD1")
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
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

