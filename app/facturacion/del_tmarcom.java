package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class del_tmarcom extends GXProcedure
{
   public del_tmarcom( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( del_tmarcom.class ), "" );
   }

   public del_tmarcom( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short aP2 )
   {
      del_tmarcom.this.A396EmprCod = aP0;
      del_tmarcom.this.A5654Mgen_com = aP1;
      del_tmarcom.this.A4364GrdTipArt = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P0AMD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A5654Mgen_com, Short.valueOf(A4364GrdTipArt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMARCO");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.del_tmarcom");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.del_tmarcom__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4364GrdTipArt ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A5654Mgen_com ;
   private IDataStoreProvider pr_default ;
}

final  class del_tmarcom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AMD2", "DELETE FROM TXPLMARCO  WHERE EmprCod = ? and Mgen_com = ? and GrdTipArt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMARCO")
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
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

