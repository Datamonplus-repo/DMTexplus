package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class potifhistorico extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      potifhistorico pgm = new potifhistorico (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public potifhistorico( )
   {
      super( -1 , new ModelContext( potifhistorico.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public potifhistorico( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( potifhistorico.class ), "" );
   }

   public potifhistorico( int remoteHandle ,
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
      new app.apotifhistorico(remoteHandle, context).execute(  );
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

