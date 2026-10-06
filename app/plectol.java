package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plectol extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      plectol pgm = new plectol (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      String[] aP2 = new String[] {""};
      int[] aP3 = new int[] {0};
      byte[] aP4 = new byte[] {0};
      String[] aP5 = new String[] {""};
      short[] aP6 = new short[] {0};
      byte[] aP7 = new byte[] {0};
      String[] aP8 = new String[] {""};
      String[] aP9 = new String[] {""};
      String[] aP10 = new String[] {""};
      int[] aP11 = new int[] {0};
      byte[] aP12 = new byte[] {0};
      String[] aP13 = new String[] {""};
      short[] aP14 = new short[] {0};
      String[] aP15 = new String[] {""};
      short[] aP16 = new short[] {0};
      short[] aP17 = new short[] {0};
      String[] aP18 = new String[] {""};
      String[] aP19 = new String[] {""};
      String[] aP20 = new String[] {""};
      byte[] aP21 = new byte[] {0};
      java.util.Date[] aP22 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP23 = new String[] {""};
      byte[] aP24 = new byte[] {0};
      String[] aP25 = new String[] {""};
      String[] aP26 = new String[] {""};
      java.util.Date[] aP27 = new java.util.Date[] {GXutil.nullDate()};
      java.util.Date[] aP28 = new java.util.Date[] {GXutil.nullDate()};
      short[] aP29 = new short[] {0};
      short[] aP30 = new short[] {0};
      String[] aP31 = new String[] {""};
      byte[] aP32 = new byte[] {0};
      String[] aP33 = new String[] {""};
      String[] aP34 = new String[] {""};
      String[] aP35 = new String[] {""};
      byte[] aP36 = new byte[] {0};
      java.util.Date[] aP37 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP38 = new String[] {""};
      String[] aP39 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (String) args[2];
         aP3[0] = (int) GXutil.lval( args[3]);
         aP4[0] = (byte) GXutil.lval( args[4]);
         aP5[0] = (String) args[5];
         aP6[0] = (short) GXutil.lval( args[6]);
         aP7[0] = (byte) GXutil.lval( args[7]);
         aP8[0] = (String) args[8];
         aP9[0] = (String) args[9];
         aP10[0] = (String) args[10];
         aP11[0] = (int) GXutil.lval( args[11]);
         aP12[0] = (byte) GXutil.lval( args[12]);
         aP13[0] = (String) args[13];
         aP14[0] = (short) GXutil.lval( args[14]);
         aP15[0] = (String) args[15];
         aP16[0] = (short) GXutil.lval( args[16]);
         aP17[0] = (short) GXutil.lval( args[17]);
         aP18[0] = (String) args[18];
         aP19[0] = (String) args[19];
         aP20[0] = (String) args[20];
         aP21[0] = (byte) GXutil.lval( args[21]);
         aP22[0] = (java.util.Date) localUtil.ctod( args[22], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP23[0] = (String) args[23];
         aP24[0] = (byte) GXutil.lval( args[24]);
         aP25[0] = (String) args[25];
         aP26[0] = (String) args[26];
         aP27[0] = (java.util.Date) localUtil.ctot( args[27], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP28[0] = (java.util.Date) localUtil.ctot( args[28], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP29[0] = (short) GXutil.lval( args[29]);
         aP30[0] = (short) GXutil.lval( args[30]);
         aP31[0] = (String) args[31];
         aP32[0] = (byte) GXutil.lval( args[32]);
         aP33[0] = (String) args[33];
         aP34[0] = (String) args[34];
         aP35[0] = (String) args[35];
         aP36[0] = (byte) GXutil.lval( args[36]);
         aP37[0] = (java.util.Date) localUtil.ctod( args[37], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP38[0] = (String) args[38];
         aP39[0] = (String) args[39];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39);
   }

   public plectol( )
   {
      super( -1 , new ModelContext( plectol.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public plectol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plectol.class ), "" );
   }

   public plectol( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             byte[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             String[] aP15 ,
                             short[] aP16 ,
                             short[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             String[] aP20 ,
                             byte[] aP21 ,
                             java.util.Date[] aP22 ,
                             String[] aP23 ,
                             byte[] aP24 ,
                             String[] aP25 ,
                             String[] aP26 ,
                             java.util.Date[] aP27 ,
                             java.util.Date[] aP28 ,
                             short[] aP29 ,
                             short[] aP30 ,
                             String[] aP31 ,
                             byte[] aP32 ,
                             String[] aP33 ,
                             String[] aP34 ,
                             String[] aP35 ,
                             byte[] aP36 ,
                             java.util.Date[] aP37 ,
                             String[] aP38 )
   {
      String[] aP39 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39);
      return aP39[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        int[] aP11 ,
                        byte[] aP12 ,
                        String[] aP13 ,
                        short[] aP14 ,
                        String[] aP15 ,
                        short[] aP16 ,
                        short[] aP17 ,
                        String[] aP18 ,
                        String[] aP19 ,
                        String[] aP20 ,
                        byte[] aP21 ,
                        java.util.Date[] aP22 ,
                        String[] aP23 ,
                        byte[] aP24 ,
                        String[] aP25 ,
                        String[] aP26 ,
                        java.util.Date[] aP27 ,
                        java.util.Date[] aP28 ,
                        short[] aP29 ,
                        short[] aP30 ,
                        String[] aP31 ,
                        byte[] aP32 ,
                        String[] aP33 ,
                        String[] aP34 ,
                        String[] aP35 ,
                        byte[] aP36 ,
                        java.util.Date[] aP37 ,
                        String[] aP38 ,
                        String[] aP39 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             byte[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             String[] aP15 ,
                             short[] aP16 ,
                             short[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             String[] aP20 ,
                             byte[] aP21 ,
                             java.util.Date[] aP22 ,
                             String[] aP23 ,
                             byte[] aP24 ,
                             String[] aP25 ,
                             String[] aP26 ,
                             java.util.Date[] aP27 ,
                             java.util.Date[] aP28 ,
                             short[] aP29 ,
                             short[] aP30 ,
                             String[] aP31 ,
                             byte[] aP32 ,
                             String[] aP33 ,
                             String[] aP34 ,
                             String[] aP35 ,
                             byte[] aP36 ,
                             java.util.Date[] aP37 ,
                             String[] aP38 ,
                             String[] aP39 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.aplectol(remoteHandle, context).execute( aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39 );
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

