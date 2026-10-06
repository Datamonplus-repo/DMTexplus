package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informealmacentejidocrudodistribuciontest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      informealmacentejidocrudodistribuciontest pgm = new informealmacentejidocrudodistribuciontest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public informealmacentejidocrudodistribuciontest( )
   {
      super( -1 , new ModelContext( informealmacentejidocrudodistribuciontest.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public informealmacentejidocrudodistribuciontest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informealmacentejidocrudodistribuciontest.class ), "" );
   }

   public informealmacentejidocrudodistribuciontest( int remoteHandle ,
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
      new app.ainformealmacentejidocrudodistribuciontest(remoteHandle, context).execute(  );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(informealmacentejidocrudodistribuciontest.class);
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

