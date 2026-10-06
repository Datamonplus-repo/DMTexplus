package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rel_hojaderuta extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      rel_hojaderuta pgm = new rel_hojaderuta (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      byte aP1 = 0;
      byte aP2 = 0;
      int aP3 = 0;
      byte aP4 = 0;
      String aP5 = "";
      int aP6 = 0;
      byte aP7 = 0;
      String aP8 = "";
      short aP9 = 0;
      short aP10 = 0;
      String aP11 = "";
      String aP12 = "";
      String aP13 = "";
      String aP14 = "";

      try
      {
         aP0 = (String) args[0];
         aP1 = (byte) GXutil.lval( args[1]);
         aP2 = (byte) GXutil.lval( args[2]);
         aP3 = (int) GXutil.lval( args[3]);
         aP4 = (byte) GXutil.lval( args[4]);
         aP5 = (String) args[5];
         aP6 = (int) GXutil.lval( args[6]);
         aP7 = (byte) GXutil.lval( args[7]);
         aP8 = (String) args[8];
         aP9 = (short) GXutil.lval( args[9]);
         aP10 = (short) GXutil.lval( args[10]);
         aP11 = (String) args[11];
         aP12 = (String) args[12];
         aP13 = (String) args[13];
         aP14 = (String) args[14];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   public rel_hojaderuta( )
   {
      super( -1 , new ModelContext( rel_hojaderuta.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public rel_hojaderuta( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rel_hojaderuta.class ), "" );
   }

   public rel_hojaderuta( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        byte aP2 ,
                        int aP3 ,
                        byte aP4 ,
                        String aP5 ,
                        int aP6 ,
                        byte aP7 ,
                        String aP8 ,
                        short aP9 ,
                        short aP10 ,
                        String aP11 ,
                        String aP12 ,
                        String aP13 ,
                        String aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             byte aP2 ,
                             int aP3 ,
                             byte aP4 ,
                             String aP5 ,
                             int aP6 ,
                             byte aP7 ,
                             String aP8 ,
                             short aP9 ,
                             short aP10 ,
                             String aP11 ,
                             String aP12 ,
                             String aP13 ,
                             String aP14 )
   {
      rel_hojaderuta.this.AV2EmprCod = aP0;
      rel_hojaderuta.this.AV3Barlis = aP1;
      rel_hojaderuta.this.AV4Barlisto = aP2;
      rel_hojaderuta.this.AV5BarCod = aP3;
      rel_hojaderuta.this.AV6BarCodReo = aP4;
      rel_hojaderuta.this.AV7BarCodPar = aP5;
      rel_hojaderuta.this.AV8BarCodto = aP6;
      rel_hojaderuta.this.AV9BarCodReoto = aP7;
      rel_hojaderuta.this.AV10BarCodParto = aP8;
      rel_hojaderuta.this.AV11Cli350 = aP9;
      rel_hojaderuta.this.AV12Copias2 = aP10;
      rel_hojaderuta.this.AV13No_hdr = aP11;
      rel_hojaderuta.this.AV14imp_bol = aP12;
      rel_hojaderuta.this.AV15No_RegQua = aP13;
      rel_hojaderuta.this.AV16No_regcarlam = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
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

   private byte AV3Barlis ;
   private byte AV4Barlisto ;
   private byte AV6BarCodReo ;
   private byte AV9BarCodReoto ;
   private short AV11Cli350 ;
   private short AV12Copias2 ;
   private short Gx_err ;
   private int AV5BarCod ;
   private int AV8BarCodto ;
   private String AV2EmprCod ;
   private String AV7BarCodPar ;
   private String AV10BarCodParto ;
   private String AV13No_hdr ;
   private String AV14imp_bol ;
   private String AV15No_RegQua ;
   private String AV16No_regcarlam ;
}

