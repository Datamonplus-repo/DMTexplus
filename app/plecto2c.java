package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plecto2c extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      plecto2c pgm = new plecto2c (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      String[] aP1 = new String[] {""};
      java.math.BigDecimal[] aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      String[] aP3 = new String[] {""};
      String[] aP4 = new String[] {""};
      String[] aP5 = new String[] {""};
      String[] aP6 = new String[] {""};
      String[] aP7 = new String[] {""};
      String[] aP8 = new String[] {""};
      String[] aP9 = new String[] {""};
      String[] aP10 = new String[] {""};
      String[] aP11 = new String[] {""};
      String[] aP12 = new String[] {""};
      String[] aP13 = new String[] {""};
      String[] aP14 = new String[] {""};
      String[] aP15 = new String[] {""};
      String[] aP16 = new String[] {""};
      String[] aP17 = new String[] {""};
      String[] aP18 = new String[] {""};
      byte[] aP19 = new byte[] {0};
      byte[] aP20 = new byte[] {0};
      byte[] aP21 = new byte[] {0};
      byte[] aP22 = new byte[] {0};
      byte[] aP23 = new byte[] {0};
      byte[] aP24 = new byte[] {0};
      int[] aP25 = new int[] {0};
      int[] aP26 = new int[] {0};
      java.util.Date[] aP27 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP28 = new String[] {""};
      java.util.Date[] aP29 = new java.util.Date[] {GXutil.nullDate()};
      java.util.Date[] aP30 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP31 = new String[] {""};
      String[] aP32 = new String[] {""};
      int[] aP33 = new int[] {0};
      byte[] aP34 = new byte[] {0};
      String[] aP35 = new String[] {""};
      byte[] aP36 = new byte[] {0};
      byte[] aP37 = new byte[] {0};
      int[] aP38 = new int[] {0};
      short[] aP39 = new short[] {0};
      String[] aP40 = new String[] {""};
      short[] aP41 = new short[] {0};
      java.util.Date[] aP42 = new java.util.Date[] {GXutil.nullDate()};
      byte[] aP43 = new byte[] {0};
      String[] aP44 = new String[] {""};
      String[] aP45 = new String[] {""};
      String[] aP46 = new String[] {""};
      String[] aP47 = new String[] {""};
      String[] aP48 = new String[] {""};
      String[] aP49 = new String[] {""};
      byte[] aP50 = new byte[] {0};
      int[] aP51 = new int[] {0};
      byte[] aP52 = new byte[] {0};
      String[] aP53 = new String[] {""};
      String[] aP54 = new String[] {""};
      byte[] aP55 = new byte[] {0};
      int[] aP56 = new int[] {0};
      byte[] aP57 = new byte[] {0};
      String[] aP58 = new String[] {""};
      String[] aP59 = new String[] {""};
      byte[] aP60 = new byte[] {0};
      String[] aP61 = new String[] {""};
      String[] aP62 = new String[] {""};
      byte[] aP63 = new byte[] {0};
      byte[] aP64 = new byte[] {0};
      String[] aP65 = new String[] {""};
      short[] aP66 = new short[] {0};
      byte[] aP67 = new byte[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (String) args[1];
         aP2[0] = (java.math.BigDecimal) DecimalUtil.stringToDec( args[2]);
         aP3[0] = (String) args[3];
         aP4[0] = (String) args[4];
         aP5[0] = (String) args[5];
         aP6[0] = (String) args[6];
         aP7[0] = (String) args[7];
         aP8[0] = (String) args[8];
         aP9[0] = (String) args[9];
         aP10[0] = (String) args[10];
         aP11[0] = (String) args[11];
         aP12[0] = (String) args[12];
         aP13[0] = (String) args[13];
         aP14[0] = (String) args[14];
         aP15[0] = (String) args[15];
         aP16[0] = (String) args[16];
         aP17[0] = (String) args[17];
         aP18[0] = (String) args[18];
         aP19[0] = (byte) GXutil.lval( args[19]);
         aP20[0] = (byte) GXutil.lval( args[20]);
         aP21[0] = (byte) GXutil.lval( args[21]);
         aP22[0] = (byte) GXutil.lval( args[22]);
         aP23[0] = (byte) GXutil.lval( args[23]);
         aP24[0] = (byte) GXutil.lval( args[24]);
         aP25[0] = (int) GXutil.lval( args[25]);
         aP26[0] = (int) GXutil.lval( args[26]);
         aP27[0] = (java.util.Date) localUtil.ctot( args[27], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP28[0] = (String) args[28];
         aP29[0] = (java.util.Date) localUtil.ctod( args[29], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP30[0] = (java.util.Date) localUtil.ctod( args[30], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP31[0] = (String) args[31];
         aP32[0] = (String) args[32];
         aP33[0] = (int) GXutil.lval( args[33]);
         aP34[0] = (byte) GXutil.lval( args[34]);
         aP35[0] = (String) args[35];
         aP36[0] = (byte) GXutil.lval( args[36]);
         aP37[0] = (byte) GXutil.lval( args[37]);
         aP38[0] = (int) GXutil.lval( args[38]);
         aP39[0] = (short) GXutil.lval( args[39]);
         aP40[0] = (String) args[40];
         aP41[0] = (short) GXutil.lval( args[41]);
         aP42[0] = (java.util.Date) localUtil.ctod( args[42], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP43[0] = (byte) GXutil.lval( args[43]);
         aP44[0] = (String) args[44];
         aP45[0] = (String) args[45];
         aP46[0] = (String) args[46];
         aP47[0] = (String) args[47];
         aP48[0] = (String) args[48];
         aP49[0] = (String) args[49];
         aP50[0] = (byte) GXutil.lval( args[50]);
         aP51[0] = (int) GXutil.lval( args[51]);
         aP52[0] = (byte) GXutil.lval( args[52]);
         aP53[0] = (String) args[53];
         aP54[0] = (String) args[54];
         aP55[0] = (byte) GXutil.lval( args[55]);
         aP56[0] = (int) GXutil.lval( args[56]);
         aP57[0] = (byte) GXutil.lval( args[57]);
         aP58[0] = (String) args[58];
         aP59[0] = (String) args[59];
         aP60[0] = (byte) GXutil.lval( args[60]);
         aP61[0] = (String) args[61];
         aP62[0] = (String) args[62];
         aP63[0] = (byte) GXutil.lval( args[63]);
         aP64[0] = (byte) GXutil.lval( args[64]);
         aP65[0] = (String) args[65];
         aP66[0] = (short) GXutil.lval( args[66]);
         aP67[0] = (byte) GXutil.lval( args[67]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53, aP54, aP55, aP56, aP57, aP58, aP59, aP60, aP61, aP62, aP63, aP64, aP65, aP66, aP67);
   }

   public plecto2c( )
   {
      super( -1 , new ModelContext( plecto2c.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public plecto2c( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plecto2c.class ), "" );
   }

   public plecto2c( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           java.math.BigDecimal[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           String[] aP7 ,
                           String[] aP8 ,
                           String[] aP9 ,
                           String[] aP10 ,
                           String[] aP11 ,
                           String[] aP12 ,
                           String[] aP13 ,
                           String[] aP14 ,
                           String[] aP15 ,
                           String[] aP16 ,
                           String[] aP17 ,
                           String[] aP18 ,
                           byte[] aP19 ,
                           byte[] aP20 ,
                           byte[] aP21 ,
                           byte[] aP22 ,
                           byte[] aP23 ,
                           byte[] aP24 ,
                           int[] aP25 ,
                           int[] aP26 ,
                           java.util.Date[] aP27 ,
                           String[] aP28 ,
                           java.util.Date[] aP29 ,
                           java.util.Date[] aP30 ,
                           String[] aP31 ,
                           String[] aP32 ,
                           int[] aP33 ,
                           byte[] aP34 ,
                           String[] aP35 ,
                           byte[] aP36 ,
                           byte[] aP37 ,
                           int[] aP38 ,
                           short[] aP39 ,
                           String[] aP40 ,
                           short[] aP41 ,
                           java.util.Date[] aP42 ,
                           byte[] aP43 ,
                           String[] aP44 ,
                           String[] aP45 ,
                           String[] aP46 ,
                           String[] aP47 ,
                           String[] aP48 ,
                           String[] aP49 ,
                           byte[] aP50 ,
                           int[] aP51 ,
                           byte[] aP52 ,
                           String[] aP53 ,
                           String[] aP54 ,
                           byte[] aP55 ,
                           int[] aP56 ,
                           byte[] aP57 ,
                           String[] aP58 ,
                           String[] aP59 ,
                           byte[] aP60 ,
                           String[] aP61 ,
                           String[] aP62 ,
                           byte[] aP63 ,
                           byte[] aP64 ,
                           String[] aP65 ,
                           short[] aP66 )
   {
      byte[] aP67 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53, aP54, aP55, aP56, aP57, aP58, aP59, aP60, aP61, aP62, aP63, aP64, aP65, aP66, aP67);
      return aP67[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 ,
                        String[] aP17 ,
                        String[] aP18 ,
                        byte[] aP19 ,
                        byte[] aP20 ,
                        byte[] aP21 ,
                        byte[] aP22 ,
                        byte[] aP23 ,
                        byte[] aP24 ,
                        int[] aP25 ,
                        int[] aP26 ,
                        java.util.Date[] aP27 ,
                        String[] aP28 ,
                        java.util.Date[] aP29 ,
                        java.util.Date[] aP30 ,
                        String[] aP31 ,
                        String[] aP32 ,
                        int[] aP33 ,
                        byte[] aP34 ,
                        String[] aP35 ,
                        byte[] aP36 ,
                        byte[] aP37 ,
                        int[] aP38 ,
                        short[] aP39 ,
                        String[] aP40 ,
                        short[] aP41 ,
                        java.util.Date[] aP42 ,
                        byte[] aP43 ,
                        String[] aP44 ,
                        String[] aP45 ,
                        String[] aP46 ,
                        String[] aP47 ,
                        String[] aP48 ,
                        String[] aP49 ,
                        byte[] aP50 ,
                        int[] aP51 ,
                        byte[] aP52 ,
                        String[] aP53 ,
                        String[] aP54 ,
                        byte[] aP55 ,
                        int[] aP56 ,
                        byte[] aP57 ,
                        String[] aP58 ,
                        String[] aP59 ,
                        byte[] aP60 ,
                        String[] aP61 ,
                        String[] aP62 ,
                        byte[] aP63 ,
                        byte[] aP64 ,
                        String[] aP65 ,
                        short[] aP66 ,
                        byte[] aP67 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53, aP54, aP55, aP56, aP57, aP58, aP59, aP60, aP61, aP62, aP63, aP64, aP65, aP66, aP67);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             byte[] aP19 ,
                             byte[] aP20 ,
                             byte[] aP21 ,
                             byte[] aP22 ,
                             byte[] aP23 ,
                             byte[] aP24 ,
                             int[] aP25 ,
                             int[] aP26 ,
                             java.util.Date[] aP27 ,
                             String[] aP28 ,
                             java.util.Date[] aP29 ,
                             java.util.Date[] aP30 ,
                             String[] aP31 ,
                             String[] aP32 ,
                             int[] aP33 ,
                             byte[] aP34 ,
                             String[] aP35 ,
                             byte[] aP36 ,
                             byte[] aP37 ,
                             int[] aP38 ,
                             short[] aP39 ,
                             String[] aP40 ,
                             short[] aP41 ,
                             java.util.Date[] aP42 ,
                             byte[] aP43 ,
                             String[] aP44 ,
                             String[] aP45 ,
                             String[] aP46 ,
                             String[] aP47 ,
                             String[] aP48 ,
                             String[] aP49 ,
                             byte[] aP50 ,
                             int[] aP51 ,
                             byte[] aP52 ,
                             String[] aP53 ,
                             String[] aP54 ,
                             byte[] aP55 ,
                             int[] aP56 ,
                             byte[] aP57 ,
                             String[] aP58 ,
                             String[] aP59 ,
                             byte[] aP60 ,
                             String[] aP61 ,
                             String[] aP62 ,
                             byte[] aP63 ,
                             byte[] aP64 ,
                             String[] aP65 ,
                             short[] aP66 ,
                             byte[] aP67 )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.aplecto2c(remoteHandle, context).execute( aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53, aP54, aP55, aP56, aP57, aP58, aP59, aP60, aP61, aP62, aP63, aP64, aP65, aP66, aP67 );
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

