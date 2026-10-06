package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmordcie extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      pmordcie pgm = new pmordcie (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      int aP1 = 0;

      try
      {
         aP0 = (String) args[0];
         aP1 = (int) GXutil.lval( args[1]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1);
   }

   public pmordcie( )
   {
      super( -1 , new ModelContext( pmordcie.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public pmordcie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmordcie.class ), "" );
   }

   public pmordcie( int remoteHandle ,
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
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.mantenimientomaquina.apmordcie(remoteHandle, context).execute( aP0, aP1 );
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

