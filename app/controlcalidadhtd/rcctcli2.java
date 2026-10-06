package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rcctcli2 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      rcctcli2 pgm = new rcctcli2 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      int[] aP2 = new int[] {0};
      String[] aP3 = new String[] {""};
      String[] aP4 = new String[] {""};
      String[] aP5 = new String[] {""};
      String[] aP6 = new String[] {""};
      int[] aP7 = new int[] {0};
      int[] aP8 = new int[] {0};
      int[] aP9 = new int[] {0};
      String[] aP10 = new String[] {""};
      String[] aP11 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (int) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
         aP4[0] = (String) args[4];
         aP5[0] = (String) args[5];
         aP6[0] = (String) args[6];
         aP7[0] = (int) GXutil.lval( args[7]);
         aP8[0] = (int) GXutil.lval( args[8]);
         aP9[0] = (int) GXutil.lval( args[9]);
         aP10[0] = (String) args[10];
         aP11[0] = (String) args[11];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   public rcctcli2( )
   {
      super( -1 , new ModelContext( rcctcli2.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public rcctcli2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rcctcli2.class ), "" );
   }

   public rcctcli2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 )
   {
      String[] aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        int[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      rcctcli2.this.AV2EmprCod = aP0[0];
      this.aP0 = aP0;
      rcctcli2.this.AV3CliIni = aP1[0];
      this.aP1 = aP1;
      rcctcli2.this.AV4CliFin = aP2[0];
      this.aP2 = aP2;
      rcctcli2.this.AV5ArtIni = aP3[0];
      this.aP3 = aP3;
      rcctcli2.this.AV6ArtFin = aP4[0];
      this.aP4 = aP4;
      rcctcli2.this.AV7ColNomIni = aP5[0];
      this.aP5 = aP5;
      rcctcli2.this.AV8ColNomFin = aP6[0];
      this.aP6 = aP6;
      rcctcli2.this.AV9ColNumIni = aP7[0];
      this.aP7 = aP7;
      rcctcli2.this.AV10ColNumFin = aP8[0];
      this.aP8 = aP8;
      rcctcli2.this.AV11CCtcodi = aP9[0];
      this.aP9 = aP9;
      rcctcli2.this.AV12Cctdsc = aP10[0];
      this.aP10 = aP10;
      rcctcli2.this.AV13Op = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP0[0] = rcctcli2.this.AV2EmprCod;
      this.aP1[0] = rcctcli2.this.AV3CliIni;
      this.aP2[0] = rcctcli2.this.AV4CliFin;
      this.aP3[0] = rcctcli2.this.AV5ArtIni;
      this.aP4[0] = rcctcli2.this.AV6ArtFin;
      this.aP5[0] = rcctcli2.this.AV7ColNomIni;
      this.aP6[0] = rcctcli2.this.AV8ColNomFin;
      this.aP7[0] = rcctcli2.this.AV9ColNumIni;
      this.aP8[0] = rcctcli2.this.AV10ColNumFin;
      this.aP9[0] = rcctcli2.this.AV11CCtcodi;
      this.aP10[0] = rcctcli2.this.AV12Cctdsc;
      this.aP11[0] = rcctcli2.this.AV13Op;
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
   private int AV3CliIni ;
   private int AV4CliFin ;
   private int AV9ColNumIni ;
   private int AV10ColNumFin ;
   private int AV11CCtcodi ;
   private String AV2EmprCod ;
   private String AV5ArtIni ;
   private String AV6ArtFin ;
   private String AV7ColNomIni ;
   private String AV8ColNomFin ;
   private String AV12Cctdsc ;
   private String AV13Op ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private int[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
}

