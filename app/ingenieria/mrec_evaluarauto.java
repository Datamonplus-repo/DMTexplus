package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrec_evaluarauto extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      mrec_evaluarauto pgm = new mrec_evaluarauto (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public mrec_evaluarauto( )
   {
      super( -1 , new ModelContext( mrec_evaluarauto.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public mrec_evaluarauto( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_evaluarauto.class ), "" );
   }

   public mrec_evaluarauto( int remoteHandle ,
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

