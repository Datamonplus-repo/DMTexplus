package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcnore1 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      pcnore1 pgm = new pcnore1 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      byte[] aP2 = new byte[] {0};
      String[] aP3 = new String[] {""};
      int[] aP4 = new int[] {0};
      String[] aP5 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (byte) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
         aP4[0] = (int) GXutil.lval( args[4]);
         aP5[0] = (String) args[5];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   public pcnore1( )
   {
      super( -1 , new ModelContext( pcnore1.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public pcnore1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcnore1.class ), "" );
   }

   public pcnore1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      String[] aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 )
   {
      pcnore1.this.AV2EmprCod = aP0[0];
      this.aP0 = aP0;
      pcnore1.this.AV3Nr_barcod = aP1[0];
      this.aP1 = aP1;
      pcnore1.this.AV4Nr_barreo = aP2[0];
      this.aP2 = aP2;
      pcnore1.this.AV5Nr_barpar = aP3[0];
      this.aP3 = aP3;
      pcnore1.this.AV6HisReoTn = aP4[0];
      this.aP4 = aP4;
      pcnore1.this.AV7ImpCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcnore1.this.AV2EmprCod;
      this.aP1[0] = pcnore1.this.AV3Nr_barcod;
      this.aP2[0] = pcnore1.this.AV4Nr_barreo;
      this.aP3[0] = pcnore1.this.AV5Nr_barpar;
      this.aP4[0] = pcnore1.this.AV6HisReoTn;
      this.aP5[0] = pcnore1.this.AV7ImpCod;
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

   private byte AV4Nr_barreo ;
   private short Gx_err ;
   private int AV3Nr_barcod ;
   private int AV6HisReoTn ;
   private String AV2EmprCod ;
   private String AV5Nr_barpar ;
   private String AV7ImpCod ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
}

