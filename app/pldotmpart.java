package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pldotmpart extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      pldotmpart pgm = new pldotmpart (-1);
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
      java.util.Date[] aP5 = new java.util.Date[] {GXutil.nullDate()};
      java.util.Date[] aP6 = new java.util.Date[] {GXutil.nullDate()};
      java.util.Date[] aP7 = new java.util.Date[] {GXutil.nullDate()};
      java.util.Date[] aP8 = new java.util.Date[] {GXutil.nullDate()};
      java.util.Date[] aP9 = new java.util.Date[] {GXutil.nullDate()};
      java.util.Date[] aP10 = new java.util.Date[] {GXutil.nullDate()};
      java.util.Date[] aP11 = new java.util.Date[] {GXutil.nullDate()};
      java.util.Date[] aP12 = new java.util.Date[] {GXutil.nullDate()};
      byte[] aP13 = new byte[] {0};
      String[] aP14 = new String[] {""};
      byte[] aP15 = new byte[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (int) GXutil.lval( args[2]);
         aP3[0] = (java.util.Date) localUtil.ctod( args[3], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP4[0] = (java.util.Date) localUtil.ctod( args[4], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP5[0] = (java.util.Date) localUtil.ctod( args[5], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP6[0] = (java.util.Date) localUtil.ctod( args[6], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP7[0] = (java.util.Date) localUtil.ctod( args[7], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP8[0] = (java.util.Date) localUtil.ctod( args[8], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP9[0] = (java.util.Date) localUtil.ctod( args[9], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP10[0] = (java.util.Date) localUtil.ctod( args[10], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP11[0] = (java.util.Date) localUtil.ctod( args[11], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP12[0] = (java.util.Date) localUtil.ctod( args[12], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP13[0] = (byte) GXutil.lval( args[13]);
         aP14[0] = (String) args[14];
         aP15[0] = (byte) GXutil.lval( args[15]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   public pldotmpart( )
   {
      super( -1 , new ModelContext( pldotmpart.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public pldotmpart( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pldotmpart.class ), "" );
   }

   public pldotmpart( int remoteHandle ,
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
                           java.util.Date[] aP5 ,
                           java.util.Date[] aP6 ,
                           java.util.Date[] aP7 ,
                           java.util.Date[] aP8 ,
                           java.util.Date[] aP9 ,
                           java.util.Date[] aP10 ,
                           java.util.Date[] aP11 ,
                           java.util.Date[] aP12 ,
                           byte[] aP13 ,
                           String[] aP14 )
   {
      byte[] aP15 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        java.util.Date[] aP5 ,
                        java.util.Date[] aP6 ,
                        java.util.Date[] aP7 ,
                        java.util.Date[] aP8 ,
                        java.util.Date[] aP9 ,
                        java.util.Date[] aP10 ,
                        java.util.Date[] aP11 ,
                        java.util.Date[] aP12 ,
                        byte[] aP13 ,
                        String[] aP14 ,
                        byte[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.util.Date[] aP5 ,
                             java.util.Date[] aP6 ,
                             java.util.Date[] aP7 ,
                             java.util.Date[] aP8 ,
                             java.util.Date[] aP9 ,
                             java.util.Date[] aP10 ,
                             java.util.Date[] aP11 ,
                             java.util.Date[] aP12 ,
                             byte[] aP13 ,
                             String[] aP14 ,
                             byte[] aP15 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.apldotmpart(remoteHandle, context).execute( aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15 );
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

