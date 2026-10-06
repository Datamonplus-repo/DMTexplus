package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpproduccionmaquinasturnostest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      dpproduccionmaquinasturnostest pgm = new dpproduccionmaquinasturnostest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public dpproduccionmaquinasturnostest( )
   {
      super( -1 , new ModelContext( dpproduccionmaquinasturnostest.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public dpproduccionmaquinasturnostest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpproduccionmaquinasturnostest.class ), "" );
   }

   public dpproduccionmaquinasturnostest( int remoteHandle ,
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
      new app.adpproduccionmaquinasturnostest(remoteHandle, context).execute(  );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dpproduccionmaquinasturnostest.class);
      return new app.GXcfg();
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

