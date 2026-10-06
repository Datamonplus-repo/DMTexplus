package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpclientesdefectosmaquinastest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      dpclientesdefectosmaquinastest pgm = new dpclientesdefectosmaquinastest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public dpclientesdefectosmaquinastest( )
   {
      super( -1 , new ModelContext( dpclientesdefectosmaquinastest.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public dpclientesdefectosmaquinastest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpclientesdefectosmaquinastest.class ), "" );
   }

   public dpclientesdefectosmaquinastest( int remoteHandle ,
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
      new app.adpclientesdefectosmaquinastest(remoteHandle, context).execute(  );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dpclientesdefectosmaquinastest.class);
      return new app.GXcfg();
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

