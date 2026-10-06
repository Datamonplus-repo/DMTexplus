package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phrecencid extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      phrecencid pgm = new phrecencid (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public phrecencid( )
   {
      super( -1 , new ModelContext( phrecencid.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public phrecencid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phrecencid.class ), "" );
   }

   public phrecencid( int remoteHandle ,
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
      new app.aphrecencid(remoteHandle, context).execute(  );
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

