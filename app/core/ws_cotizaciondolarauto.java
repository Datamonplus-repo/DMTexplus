package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ws_cotizaciondolarauto extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      ws_cotizaciondolarauto pgm = new ws_cotizaciondolarauto (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public ws_cotizaciondolarauto( )
   {
      super( -1 , new ModelContext( ws_cotizaciondolarauto.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public ws_cotizaciondolarauto( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ws_cotizaciondolarauto.class ), "" );
   }

   public ws_cotizaciondolarauto( int remoteHandle ,
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

