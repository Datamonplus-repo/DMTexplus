package app.aeat ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class aeatreportarfacturacli extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aeatreportarfacturacli pgm = new aeatreportarfacturacli (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      int aP0 = 0;

      try
      {
         aP0 = (int) GXutil.lval( args[0]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0);
   }

   public aeatreportarfacturacli( )
   {
      super( -1 , new ModelContext( aeatreportarfacturacli.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public aeatreportarfacturacli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aeatreportarfacturacli.class ), "" );
   }

   public aeatreportarfacturacli( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( int aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( int aP0 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.aeat.aaeatreportarfacturacli(remoteHandle, context).execute( aP0 );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(aeatreportarfacturacli.class);
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

