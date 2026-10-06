package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class upq_cuentacorriente_dp_test extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      upq_cuentacorriente_dp_test pgm = new upq_cuentacorriente_dp_test (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public upq_cuentacorriente_dp_test( )
   {
      super( -1 , new ModelContext( upq_cuentacorriente_dp_test.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public upq_cuentacorriente_dp_test( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( upq_cuentacorriente_dp_test.class ), "" );
   }

   public upq_cuentacorriente_dp_test( int remoteHandle ,
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
      new app.stocksquimicos.aupq_cuentacorriente_dp_test(remoteHandle, context).execute(  );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(upq_cuentacorriente_dp_test.class);
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

