package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class potifauditoria extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      potifauditoria pgm = new potifauditoria (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public potifauditoria( )
   {
      super( -1 , new ModelContext( potifauditoria.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public potifauditoria( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( potifauditoria.class ), "" );
   }

   public potifauditoria( int remoteHandle ,
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
      new app.apotifauditoria(remoteHandle, context).execute(  );
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

