package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class historicoreoperadosmaquinatest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      historicoreoperadosmaquinatest pgm = new historicoreoperadosmaquinatest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public historicoreoperadosmaquinatest( )
   {
      super( -1 , new ModelContext( historicoreoperadosmaquinatest.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public historicoreoperadosmaquinatest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoreoperadosmaquinatest.class ), "" );
   }

   public historicoreoperadosmaquinatest( int remoteHandle ,
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
      new app.ahistoricoreoperadosmaquinatest(remoteHandle, context).execute(  );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(historicoreoperadosmaquinatest.class);
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

