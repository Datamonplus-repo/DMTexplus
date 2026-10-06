package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class updemprtrn extends GXProcedure
{
   public updemprtrn( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( updemprtrn.class ), "" );
   }

   public updemprtrn( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             int aP1 )
   {
      updemprtrn.this.A396EmprCod = aP0;
      updemprtrn.this.A323DevGenCod = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n410EmprTrn = false ;
      /* Optimized UPDATE. */
      /* Using cursor P086M2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "updemprtrn");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.updemprtrn__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A323DevGenCod ;
   private String A396EmprCod ;
   private boolean n410EmprTrn ;
   private IDataStoreProvider pr_default ;
}

final  class updemprtrn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P086M2", "UPDATE TXPDEVGEN SET EmprTrn=EmprCod  WHERE EmprCod = ? and DevGenCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVGEN")
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
               return;
      }
   }

}

