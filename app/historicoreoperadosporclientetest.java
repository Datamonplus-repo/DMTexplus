package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class historicoreoperadosporclientetest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      historicoreoperadosporclientetest pgm = new historicoreoperadosporclientetest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public historicoreoperadosporclientetest( )
   {
      super( -1 , new ModelContext( historicoreoperadosporclientetest.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public historicoreoperadosporclientetest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoreoperadosporclientetest.class ), "" );
   }

   public historicoreoperadosporclientetest( int remoteHandle ,
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
      new app.ahistoricoreoperadosporclientetest(remoteHandle, context).execute(  );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(historicoreoperadosporclientetest.class);
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

