package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class facturamoda21_cline extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      facturamoda21_cline pgm = new facturamoda21_cline (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      String[] aP1 = new String[] {""};
      int[] aP2 = new int[] {0};
      String[] aP3 = new String[] {""};
      java.math.BigDecimal[] aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      String[] aP5 = new String[] {""};
      String[] aP6 = new String[] {""};
      byte[] aP7 = new byte[] {0};
      byte[] aP8 = new byte[] {0};
      byte[] aP9 = new byte[] {0};

      try
      {
         aP0 = (String) args[0];
         aP1[0] = (String) args[1];
         aP2[0] = (int) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
         aP4[0] = (java.math.BigDecimal) DecimalUtil.stringToDec( args[4]);
         aP5[0] = (String) args[5];
         aP6[0] = (String) args[6];
         aP7[0] = (byte) GXutil.lval( args[7]);
         aP8[0] = (byte) GXutil.lval( args[8]);
         aP9[0] = (byte) GXutil.lval( args[9]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   public facturamoda21_cline( )
   {
      super( -1 , new ModelContext( facturamoda21_cline.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public facturamoda21_cline( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( facturamoda21_cline.class ), "" );
   }

   public facturamoda21_cline( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           String[] aP1 ,
                           int[] aP2 ,
                           String[] aP3 ,
                           java.math.BigDecimal[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           byte[] aP7 ,
                           byte[] aP8 )
   {
      byte[] aP9 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 ,
                        byte[] aP8 ,
                        byte[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             byte[] aP8 ,
                             byte[] aP9 )
   {
      facturamoda21_cline.this.AV2ReportInPut = aP0;
      facturamoda21_cline.this.AV3EmprCod = aP1[0];
      this.aP1 = aP1;
      facturamoda21_cline.this.AV4FacCod = aP2[0];
      this.aP2 = aP2;
      facturamoda21_cline.this.AV5ImpCod = aP3[0];
      this.aP3 = aP3;
      facturamoda21_cline.this.AV6ValEuro = aP4[0];
      this.aP4 = aP4;
      facturamoda21_cline.this.AV7TextoCopia = aP5[0];
      this.aP5 = aP5;
      facturamoda21_cline.this.Gx_out = aP6[0];
      this.aP6 = aP6;
      facturamoda21_cline.this.AV9F_header = aP7[0];
      this.aP7 = aP7;
      facturamoda21_cline.this.AV10Agr_Fases = aP8[0];
      this.aP8 = aP8;
      facturamoda21_cline.this.AV11VerSumTot = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      new app.facturamoda21(remoteHandle, context).execute( aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9 );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = facturamoda21_cline.this.AV3EmprCod;
      this.aP2[0] = facturamoda21_cline.this.AV4FacCod;
      this.aP3[0] = facturamoda21_cline.this.AV5ImpCod;
      this.aP4[0] = facturamoda21_cline.this.AV6ValEuro;
      this.aP5[0] = facturamoda21_cline.this.AV7TextoCopia;
      this.aP6[0] = facturamoda21_cline.this.Gx_out;
      this.aP7[0] = facturamoda21_cline.this.AV9F_header;
      this.aP8[0] = facturamoda21_cline.this.AV10Agr_Fases;
      this.aP9[0] = facturamoda21_cline.this.AV11VerSumTot;
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

   private byte AV9F_header ;
   private byte AV10Agr_Fases ;
   private byte AV11VerSumTot ;
   private short Gx_err ;
   private int AV4FacCod ;
   private java.math.BigDecimal AV6ValEuro ;
   private String AV3EmprCod ;
   private String AV5ImpCod ;
   private String AV7TextoCopia ;
   private String Gx_out ;
   private String AV2ReportInPut ;
   private String[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private byte[] aP7 ;
   private byte[] aP8 ;
   private byte[] aP9 ;
}

