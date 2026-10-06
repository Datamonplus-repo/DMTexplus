package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpenmd_del extends GXProcedure
{
   public tpenmd_del( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpenmd_del.class ), "" );
   }

   public tpenmd_del( int remoteHandle ,
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
      tpenmd_del.this.A396EmprCod = aP0;
      tpenmd_del.this.A252CliCod = aP1;
      tpenmd_del.this.A8403PMDLin = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P0AMT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8403PMDLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPenMD");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tpenmd_del");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd_del__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A8403PMDLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
}

final  class tpenmd_del__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AMT2", "DELETE FROM TXPPenMD  WHERE EmprCod = ? and CliCod = ? and PMDLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPenMD")
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

