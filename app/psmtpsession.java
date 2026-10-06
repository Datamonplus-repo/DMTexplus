package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psmtpsession extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      psmtpsession pgm = new psmtpsession (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public psmtpsession( )
   {
      super( -1 , new ModelContext( psmtpsession.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public psmtpsession( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psmtpsession.class ), "" );
   }

   public psmtpsession( int remoteHandle ,
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
      new app.apsmtpsession(remoteHandle, context).execute(  );
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

