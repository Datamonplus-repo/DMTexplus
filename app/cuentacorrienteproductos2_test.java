package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class cuentacorrienteproductos2_test extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      cuentacorrienteproductos2_test pgm = new cuentacorrienteproductos2_test (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public cuentacorrienteproductos2_test( )
   {
      super( -1 , new ModelContext( cuentacorrienteproductos2_test.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public cuentacorrienteproductos2_test( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cuentacorrienteproductos2_test.class ), "" );
   }

   public cuentacorrienteproductos2_test( int remoteHandle ,
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
      new app.acuentacorrienteproductos2_test(remoteHandle, context).execute(  );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(cuentacorrienteproductos2_test.class);
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

