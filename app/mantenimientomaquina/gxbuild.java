package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class gxbuild extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      gxbuild pgm = new gxbuild (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public gxbuild( )
   {
      super( -1 , new ModelContext( gxbuild.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public gxbuild( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gxbuild.class ), "" );
   }

   public gxbuild( int remoteHandle ,
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
      new app.mantenimientomaquina.agxbuild(remoteHandle, context).execute(  );
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

