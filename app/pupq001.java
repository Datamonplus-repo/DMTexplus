package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupq001 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      pupq001 pgm = new pupq001 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      String[] aP1 = new String[] {""};
      String[] aP2 = new String[] {""};
      String[] aP3 = new String[] {""};
      String[] aP4 = new String[] {""};
      java.math.BigDecimal[] aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      String[] aP6 = new String[] {""};
      String[] aP7 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (String) args[1];
         aP2[0] = (String) args[2];
         aP3[0] = (String) args[3];
         aP4[0] = (String) args[4];
         aP5[0] = (java.math.BigDecimal) DecimalUtil.stringToDec( args[5]);
         aP6[0] = (String) args[6];
         aP7[0] = (String) args[7];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   public pupq001( )
   {
      super( -1 , new ModelContext( pupq001.class ), "" );
      Application.init(app.GXcfg.class);
   }

   public pupq001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupq001.class ), "" );
   }

   public pupq001( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 )
   {
      String[] aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pupq001.this.AV2Emprcod = aP0[0];
      this.aP0 = aP0;
      pupq001.this.AV3Prdnum1 = aP1[0];
      this.aP1 = aP1;
      pupq001.this.AV4Prdnum2 = aP2[0];
      this.aP2 = aP2;
      pupq001.this.AV5Siacumular = aP3[0];
      this.aP3 = aP3;
      pupq001.this.AV6ActDatos = aP4[0];
      this.aP4 = aP4;
      pupq001.this.AV7CantCierre = aP5[0];
      this.aP5 = aP5;
      pupq001.this.aP6 = aP6;
      pupq001.this.AV9PgmnameOut = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pupq001.this.AV2Emprcod;
      this.aP1[0] = pupq001.this.AV3Prdnum1;
      this.aP2[0] = pupq001.this.AV4Prdnum2;
      this.aP3[0] = pupq001.this.AV5Siacumular;
      this.aP4[0] = pupq001.this.AV6ActDatos;
      this.aP5[0] = pupq001.this.AV7CantCierre;
      this.aP6[0] = pupq001.this.AV8File;
      this.aP7[0] = pupq001.this.AV9PgmnameOut;
      CloseOpenCursors();
      Application.cleanup(context, this, remoteHandle);
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8File = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV7CantCierre ;
   private String AV2Emprcod ;
   private String AV3Prdnum1 ;
   private String AV4Prdnum2 ;
   private String AV5Siacumular ;
   private String AV6ActDatos ;
   private String AV9PgmnameOut ;
   private String AV8File ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
}

