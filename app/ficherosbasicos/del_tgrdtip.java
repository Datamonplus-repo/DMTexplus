package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class del_tgrdtip extends GXProcedure
{
   public del_tgrdtip( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( del_tgrdtip.class ), "" );
   }

   public del_tgrdtip( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        short aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             short aP2 )
   {
      del_tgrdtip.this.A396EmprCod = aP0;
      del_tgrdtip.this.A4364GrdTipArt = aP1;
      del_tgrdtip.this.AV8TipArtCod = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P0AMJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(AV8TipArtCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTI1");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.del_tgrdtip");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.del_tgrdtip__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4364GrdTipArt ;
   private short AV8TipArtCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
}

final  class del_tgrdtip__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AMJ2", "DELETE FROM TXPGRDTI1  WHERE EmprCod = ? and GrdTipArt = ? and TipArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPGRDTI1")
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

