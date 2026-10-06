package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pjln010 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      pjln010 pgm = new pjln010 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public pjln010( )
   {
      super( -1 , new ModelContext( pjln010.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public pjln010( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pjln010.class ), "" );
   }

   public pjln010( int remoteHandle ,
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
      new app.apjln010(remoteHandle, context).execute(  );
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

