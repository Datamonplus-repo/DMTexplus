package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class applegad extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      applegad pgm = new applegad (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public applegad( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( applegad.class ), "" );
   }

   public applegad( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Realizando reconstrucción campo Plegado....", "") );
      n2834ArtPle2 = false ;
      /* Optimized UPDATE. */
      cmdBuffer = " LOCK TABLE TXPARTICU IN EXCLUSIVE MODE NOWAIT ";
      ExecuteDirectSQL.execute(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      /* Using cursor P00HR2 */
      pr_default.execute(0);
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
      /* End optimized UPDATE. */
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Reconstrucción realizada", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pplegad.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "applegad");
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.applegad__default(),
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
   private boolean n2834ArtPle2 ;
   private IDataStoreProvider pr_default ;
}

final  class applegad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00HR2", "UPDATE TXPARTICU SET ArtPle2=ArtTipPle || ' / ' || ArtAcaQui || ' / ' || ArtSua ", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
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

