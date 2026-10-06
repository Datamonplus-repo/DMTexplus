package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class txpalbtetloadredundancy extends GXProcedure
{
   public txpalbtetloadredundancy( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txpalbtetloadredundancy.class ), "" );
   }

   public txpalbtetloadredundancy( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Loading redundancy in table TXPALBTET ...", "") );
      /* Optimized UPDATE. */
      cmdBuffer = " LOCK TABLE TXPALBTET IN EXCLUSIVE MODE NOWAIT ";
      ExecuteDirectSQL.execute(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      /* Using cursor TXPALBTETL2 */
      pr_default.execute(0);
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTET");
      /* End optimized UPDATE. */
      System.out.println( "" );
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "txpalbtetloadredundancy");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      cmdBuffer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txpalbtetloadredundancy__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String cmdBuffer ;
   private IDataStoreProvider pr_default ;
}

final  class txpalbtetloadredundancy__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("TXPALBTETL2", "UPDATE TXPALBTET SET DisComTMT=DisComNTr * CAST(DisComMts AS NUMERIC(19,10)) ", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBTET")
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
      }
   }

}

