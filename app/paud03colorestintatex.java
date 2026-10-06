package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class paud03colorestintatex extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      paud03colorestintatex pgm = new paud03colorestintatex (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public paud03colorestintatex( )
   {
      super( -1 , new ModelContext( paud03colorestintatex.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public paud03colorestintatex( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( paud03colorestintatex.class ), "" );
   }

   public paud03colorestintatex( int remoteHandle ,
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
      new app.apaud03colorestintatex(remoteHandle, context).execute(  );
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

