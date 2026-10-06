package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apldotmpart extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apldotmpart pgm = new apldotmpart (-1);
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

   public apldotmpart( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apldotmpart.class ), "" );
   }

   public apldotmpart( int remoteHandle ,
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
      apldotmpart.this.aP15 = new byte[] {0};
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
      apldotmpart.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apldotmpart.this.AV63CliCodi = aP1[0];
      this.aP1 = aP1;
      apldotmpart.this.AV64CliCodf = aP2[0];
      this.aP2 = aP2;
      apldotmpart.this.AV53FchPedi = aP3[0];
      this.aP3 = aP3;
      apldotmpart.this.AV54FchPedf = aP4[0];
      this.aP4 = aP4;
      apldotmpart.this.AV55FchGrbi = aP5[0];
      this.aP5 = aP5;
      apldotmpart.this.AV56FchGrbf = aP6[0];
      this.aP6 = aP6;
      apldotmpart.this.AV57FchEsti = aP7[0];
      this.aP7 = aP7;
      apldotmpart.this.AV58FchEstf = aP8[0];
      this.aP8 = aP8;
      apldotmpart.this.AV59FchTini = aP9[0];
      this.aP9 = aP9;
      apldotmpart.this.AV60FchTinf = aP10[0];
      this.aP10 = aP10;
      apldotmpart.this.AV61FchAcai = aP11[0];
      this.aP11 = aP11;
      apldotmpart.this.AV62FchAcaf = aP12[0];
      this.aP12 = aP12;
      apldotmpart.this.AV71Muestras = aP13[0];
      this.aP13 = aP13;
      apldotmpart.this.AV78BarTipDis = aP14[0];
      this.aP14 = aP14;
      apldotmpart.this.AV81Detalle = aP15[0];
      this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pldotmpart.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apldotmpart.this.A396EmprCod;
      this.aP1[0] = apldotmpart.this.AV63CliCodi;
      this.aP2[0] = apldotmpart.this.AV64CliCodf;
      this.aP3[0] = apldotmpart.this.AV53FchPedi;
      this.aP4[0] = apldotmpart.this.AV54FchPedf;
      this.aP5[0] = apldotmpart.this.AV55FchGrbi;
      this.aP6[0] = apldotmpart.this.AV56FchGrbf;
      this.aP7[0] = apldotmpart.this.AV57FchEsti;
      this.aP8[0] = apldotmpart.this.AV58FchEstf;
      this.aP9[0] = apldotmpart.this.AV59FchTini;
      this.aP10[0] = apldotmpart.this.AV60FchTinf;
      this.aP11[0] = apldotmpart.this.AV61FchAcai;
      this.aP12[0] = apldotmpart.this.AV62FchAcaf;
      this.aP13[0] = apldotmpart.this.AV71Muestras;
      this.aP14[0] = apldotmpart.this.AV78BarTipDis;
      this.aP15[0] = apldotmpart.this.AV81Detalle;
      CloseOpenCursors();
      exitApp();
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

   private byte AV71Muestras ;
   private byte AV81Detalle ;
   private short Gx_err ;
   private int AV63CliCodi ;
   private int AV64CliCodf ;
   private String A396EmprCod ;
   private String AV78BarTipDis ;
   private java.util.Date AV53FchPedi ;
   private java.util.Date AV54FchPedf ;
   private java.util.Date AV55FchGrbi ;
   private java.util.Date AV56FchGrbf ;
   private java.util.Date AV57FchEsti ;
   private java.util.Date AV58FchEstf ;
   private java.util.Date AV59FchTini ;
   private java.util.Date AV60FchTinf ;
   private java.util.Date AV61FchAcai ;
   private java.util.Date AV62FchAcaf ;
   private byte[] aP15 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private java.util.Date[] aP5 ;
   private java.util.Date[] aP6 ;
   private java.util.Date[] aP7 ;
   private java.util.Date[] aP8 ;
   private java.util.Date[] aP9 ;
   private java.util.Date[] aP10 ;
   private java.util.Date[] aP11 ;
   private java.util.Date[] aP12 ;
   private byte[] aP13 ;
   private String[] aP14 ;
}

