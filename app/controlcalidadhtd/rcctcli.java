package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rcctcli extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      rcctcli pgm = new rcctcli (-1);
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
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   public rcctcli( )
   {
      super( -1 , new ModelContext( rcctcli.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public rcctcli( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rcctcli.class ), "" );
   }

   public rcctcli( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          int[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          String[] aP5 ,
                          String[] aP6 ,
                          int[] aP7 )
   {
      int[] aP8 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 ,
                        int[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 ,
                             int[] aP8 )
   {
      rcctcli.this.AV2EmprCod = aP0[0];
      this.aP0 = aP0;
      rcctcli.this.AV3CliIni = aP1[0];
      this.aP1 = aP1;
      rcctcli.this.AV4CliFin = aP2[0];
      this.aP2 = aP2;
      rcctcli.this.AV5ArtIni = aP3[0];
      this.aP3 = aP3;
      rcctcli.this.AV6ArtFin = aP4[0];
      this.aP4 = aP4;
      rcctcli.this.AV7ColNomIni = aP5[0];
      this.aP5 = aP5;
      rcctcli.this.AV8ColNomFin = aP6[0];
      this.aP6 = aP6;
      rcctcli.this.AV9ColNumIni = aP7[0];
      this.aP7 = aP7;
      rcctcli.this.AV10ColNumFin = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP0[0] = rcctcli.this.AV2EmprCod;
      this.aP1[0] = rcctcli.this.AV3CliIni;
      this.aP2[0] = rcctcli.this.AV4CliFin;
      this.aP3[0] = rcctcli.this.AV5ArtIni;
      this.aP4[0] = rcctcli.this.AV6ArtFin;
      this.aP5[0] = rcctcli.this.AV7ColNomIni;
      this.aP6[0] = rcctcli.this.AV8ColNomFin;
      this.aP7[0] = rcctcli.this.AV9ColNumIni;
      this.aP8[0] = rcctcli.this.AV10ColNumFin;
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
   private String AV2EmprCod ;
   private String AV5ArtIni ;
   private String AV6ArtFin ;
   private String AV7ColNomIni ;
   private String AV8ColNomFin ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private int[] aP7 ;
   private int[] aP8 ;
}

