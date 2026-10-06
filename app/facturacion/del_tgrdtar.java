package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class del_tgrdtar extends GXProcedure
{
   public del_tgrdtar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( del_tgrdtar.class ), "" );
   }

   public del_tgrdtar( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        java.math.BigDecimal aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             java.math.BigDecimal aP2 )
   {
      del_tgrdtar.this.A396EmprCod = aP0;
      del_tgrdtar.this.A4364GrdTipArt = aP1;
      del_tgrdtar.this.A4376GrdTipVal = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P0AME2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), A4376GrdTipVal});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTAR");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.del_tgrdtar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.del_tgrdtar__default(),
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
   private java.math.BigDecimal A4376GrdTipVal ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
}

final  class del_tgrdtar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AME2", "DELETE FROM TXPGRDTAR  WHERE EmprCod = ? and GrdTipArt = ? and GrdTipVal = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPGRDTAR")
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
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               return;
      }
   }

}

