package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmetpiectr extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      pmetpiectr pgm = new pmetpiectr (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public pmetpiectr( )
   {
      super( -1 , new ModelContext( pmetpiectr.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public pmetpiectr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmetpiectr.class ), "" );
   }

   public pmetpiectr( int remoteHandle ,
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
      new app.apmetpiectr(remoteHandle, context).execute(  );
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
}

