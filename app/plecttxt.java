package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plecttxt extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      plecttxt pgm = new plecttxt (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public plecttxt( )
   {
      super( -1 , new ModelContext( plecttxt.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public plecttxt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plecttxt.class ), "" );
   }

   public plecttxt( int remoteHandle ,
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
      new app.aplecttxt(remoteHandle, context).execute(  );
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

