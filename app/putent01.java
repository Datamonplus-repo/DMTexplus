package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class putent01 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      putent01 pgm = new putent01 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      java.util.Date[] aP1 = new java.util.Date[] {GXutil.nullDate()};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (java.util.Date) localUtil.ctod( args[1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1);
   }

   public putent01( )
   {
      super( -1 , new ModelContext( putent01.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public putent01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( putent01.class ), "" );
   }

   public putent01( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 )
   {
      java.util.Date[] aP1 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.aputent01(remoteHandle, context).execute( aP0, aP1 );
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

