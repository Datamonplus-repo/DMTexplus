package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class loadeventssampleproc extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      loadeventssampleproc pgm = new loadeventssampleproc (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      java.util.Date aP0 = GXutil.nullDate();
      java.util.Date aP1 = GXutil.nullDate();
      app.ficherosbasicos.SdtSchedulerEvents[] aP2 = new app.ficherosbasicos.SdtSchedulerEvents[] {new app.ficherosbasicos.SdtSchedulerEvents()};

      try
      {
         aP0 = (java.util.Date) localUtil.ctod( args[0], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP1 = (java.util.Date) localUtil.ctod( args[1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public loadeventssampleproc( )
   {
      super( -1 , new ModelContext( loadeventssampleproc.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public loadeventssampleproc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( loadeventssampleproc.class ), "" );
   }

   public loadeventssampleproc( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.ficherosbasicos.SdtSchedulerEvents executeUdp( java.util.Date aP0 ,
                                                             java.util.Date aP1 )
   {
      app.ficherosbasicos.SdtSchedulerEvents[] aP2 = new app.ficherosbasicos.SdtSchedulerEvents[] {new app.ficherosbasicos.SdtSchedulerEvents()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( java.util.Date aP0 ,
                        java.util.Date aP1 ,
                        app.ficherosbasicos.SdtSchedulerEvents[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( java.util.Date aP0 ,
                             java.util.Date aP1 ,
                             app.ficherosbasicos.SdtSchedulerEvents[] aP2 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.ficherosbasicos.aloadeventssampleproc(remoteHandle, context).execute( aP0, aP1, aP2 );
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

