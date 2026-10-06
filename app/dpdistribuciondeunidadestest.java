package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpdistribuciondeunidadestest extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      dpdistribuciondeunidadestest pgm = new dpdistribuciondeunidadestest (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      int[] aP2 = new int[] {0};
      java.util.Date[] aP3 = new java.util.Date[] {GXutil.nullDate()};
      java.util.Date[] aP4 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP5 = new String[] {""};
      String[] aP6 = new String[] {""};
      byte[] aP7 = new byte[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (int) GXutil.lval( args[2]);
         aP3[0] = (java.util.Date) localUtil.ctod( args[3], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP4[0] = (java.util.Date) localUtil.ctod( args[4], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP5[0] = (String) args[5];
         aP6[0] = (String) args[6];
         aP7[0] = (byte) GXutil.lval( args[7]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   public dpdistribuciondeunidadestest( )
   {
      super( -1 , new ModelContext( dpdistribuciondeunidadestest.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public dpdistribuciondeunidadestest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpdistribuciondeunidadestest.class ), "" );
   }

   public dpdistribuciondeunidadestest( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           int[] aP2 ,
                           java.util.Date[] aP3 ,
                           java.util.Date[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 )
   {
      byte[] aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.adpdistribuciondeunidadestest(remoteHandle, context).execute( aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7 );
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(dpdistribuciondeunidadestest.class);
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

