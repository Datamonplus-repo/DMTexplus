package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rccaud extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      rccaud pgm = new rccaud (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      int[] aP2 = new int[] {0};
      byte[] aP3 = new byte[] {0};
      byte[] aP4 = new byte[] {0};
      String[] aP5 = new String[] {""};
      String[] aP6 = new String[] {""};
      int[] aP7 = new int[] {0};
      int[] aP8 = new int[] {0};
      int[] aP9 = new int[] {0};
      int[] aP10 = new int[] {0};
      java.util.Date[] aP11 = new java.util.Date[] {GXutil.nullDate()};
      java.util.Date[] aP12 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP13 = new String[] {""};
      byte[] aP14 = new byte[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (int) GXutil.lval( args[2]);
         aP3[0] = (byte) GXutil.lval( args[3]);
         aP4[0] = (byte) GXutil.lval( args[4]);
         aP5[0] = (String) args[5];
         aP6[0] = (String) args[6];
         aP7[0] = (int) GXutil.lval( args[7]);
         aP8[0] = (int) GXutil.lval( args[8]);
         aP9[0] = (int) GXutil.lval( args[9]);
         aP10[0] = (int) GXutil.lval( args[10]);
         aP11[0] = (java.util.Date) localUtil.ctod( args[11], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP12[0] = (java.util.Date) localUtil.ctod( args[12], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP13[0] = (String) args[13];
         aP14[0] = (byte) GXutil.lval( args[14]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   public rccaud( )
   {
      super( -1 , new ModelContext( rccaud.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public rccaud( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rccaud.class ), "" );
   }

   public rccaud( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           int[] aP2 ,
                           byte[] aP3 ,
                           byte[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           int[] aP7 ,
                           int[] aP8 ,
                           int[] aP9 ,
                           int[] aP10 ,
                           java.util.Date[] aP11 ,
                           java.util.Date[] aP12 ,
                           String[] aP13 )
   {
      byte[] aP14 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        int[] aP8 ,
                        int[] aP9 ,
                        int[] aP10 ,
                        java.util.Date[] aP11 ,
                        java.util.Date[] aP12 ,
                        String[] aP13 ,
                        byte[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             int[] aP10 ,
                             java.util.Date[] aP11 ,
                             java.util.Date[] aP12 ,
                             String[] aP13 ,
                             byte[] aP14 )
   {
      rccaud.this.AV2EmprCod = aP0[0];
      this.aP0 = aP0;
      rccaud.this.AV3BarIni = aP1[0];
      this.aP1 = aP1;
      rccaud.this.AV4BarFin = aP2[0];
      this.aP2 = aP2;
      rccaud.this.AV5ReoIni = aP3[0];
      this.aP3 = aP3;
      rccaud.this.AV6ReoFin = aP4[0];
      this.aP4 = aP4;
      rccaud.this.AV7ParIni = aP5[0];
      this.aP5 = aP5;
      rccaud.this.AV8ParFin = aP6[0];
      this.aP6 = aP6;
      rccaud.this.AV9CliIni = aP7[0];
      this.aP7 = aP7;
      rccaud.this.AV10CliFin = aP8[0];
      this.aP8 = aP8;
      rccaud.this.AV11CCTIni = aP9[0];
      this.aP9 = aP9;
      rccaud.this.AV12CCTFin = aP10[0];
      this.aP10 = aP10;
      rccaud.this.AV13FchIni = aP11[0];
      this.aP11 = aP11;
      rccaud.this.AV14FchFin = aP12[0];
      this.aP12 = aP12;
      rccaud.this.AV15Det = aP13[0];
      this.aP13 = aP13;
      rccaud.this.AV16Real = aP14[0];
      this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP0[0] = rccaud.this.AV2EmprCod;
      this.aP1[0] = rccaud.this.AV3BarIni;
      this.aP2[0] = rccaud.this.AV4BarFin;
      this.aP3[0] = rccaud.this.AV5ReoIni;
      this.aP4[0] = rccaud.this.AV6ReoFin;
      this.aP5[0] = rccaud.this.AV7ParIni;
      this.aP6[0] = rccaud.this.AV8ParFin;
      this.aP7[0] = rccaud.this.AV9CliIni;
      this.aP8[0] = rccaud.this.AV10CliFin;
      this.aP9[0] = rccaud.this.AV11CCTIni;
      this.aP10[0] = rccaud.this.AV12CCTFin;
      this.aP11[0] = rccaud.this.AV13FchIni;
      this.aP12[0] = rccaud.this.AV14FchFin;
      this.aP13[0] = rccaud.this.AV15Det;
      this.aP14[0] = rccaud.this.AV16Real;
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

   private byte AV5ReoIni ;
   private byte AV6ReoFin ;
   private byte AV16Real ;
   private short Gx_err ;
   private int AV3BarIni ;
   private int AV4BarFin ;
   private int AV9CliIni ;
   private int AV10CliFin ;
   private int AV11CCTIni ;
   private int AV12CCTFin ;
   private String AV2EmprCod ;
   private String AV7ParIni ;
   private String AV8ParFin ;
   private String AV15Det ;
   private java.util.Date AV13FchIni ;
   private java.util.Date AV14FchFin ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private int[] aP8 ;
   private int[] aP9 ;
   private int[] aP10 ;
   private java.util.Date[] aP11 ;
   private java.util.Date[] aP12 ;
   private String[] aP13 ;
   private byte[] aP14 ;
}

