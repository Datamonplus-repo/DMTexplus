package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class disobsulin extends GXProcedure
{
   public disobsulin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disobsulin.class ), "" );
   }

   public disobsulin( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 )
   {
      disobsulin.this.A396EmprCod = aP0;
      disobsulin.this.A361DisCod = aP1;
      disobsulin.this.AV8DisObsULin = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P0A8B2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV8DisObsULin), A396EmprCod, Integer.valueOf(A361DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "pedidos.disobsulin");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disobsulin__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8DisObsULin ;
   private byte A378DisObsULin ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
}

final  class disobsulin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0A8B2", "UPDATE TXPDISPOS SET DisObsULin=?  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

