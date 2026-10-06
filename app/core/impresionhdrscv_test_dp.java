package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class impresionhdrscv_test_dp extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      impresionhdrscv_test_dp pgm = new impresionhdrscv_test_dp (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public impresionhdrscv_test_dp( )
   {
      super( -1 , new ModelContext( impresionhdrscv_test_dp.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public impresionhdrscv_test_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresionhdrscv_test_dp.class ), "" );
   }

   public impresionhdrscv_test_dp( int remoteHandle ,
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
      new app.core.aimpresionhdrscv_test_dp(remoteHandle, context).execute(  );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(impresionhdrscv_test_dp.class);
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

