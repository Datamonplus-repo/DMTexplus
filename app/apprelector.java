package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apprelector extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apprelector pgm = new apprelector (-1);
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
      String[] aP5 = new String[] {""};
      String[] aP6 = new String[] {""};
      String[] aP7 = new String[] {""};
      String[] aP8 = new String[] {""};
      String[] aP9 = new String[] {""};
      String[] aP10 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (String) args[1];
         aP2[0] = (String) args[2];
         aP3[0] = (String) args[3];
         aP4[0] = (String) args[4];
         aP5[0] = (String) args[5];
         aP6[0] = (String) args[6];
         aP7[0] = (String) args[7];
         aP8[0] = (String) args[8];
         aP9[0] = (String) args[9];
         aP10[0] = (String) args[10];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   public apprelector( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apprelector.class ), "" );
   }

   public apprelector( int remoteHandle ,
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
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      apprelector.this.aP10 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      apprelector.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      apprelector.this.AV9OpeCodalfa = aP1[0];
      this.aP1 = aP1;
      apprelector.this.AV10MaqCod = aP2[0];
      this.aP2 = aP2;
      apprelector.this.AV11Barcadaalfa = aP3[0];
      this.aP3 = aP3;
      apprelector.this.AV12BarCodReoalfa = aP4[0];
      this.aP4 = aP4;
      apprelector.this.AV13BarCodPar = aP5[0];
      this.aP5 = aP5;
      apprelector.this.AV14ParCodalfa = aP6[0];
      this.aP6 = aP6;
      apprelector.this.AV15FlagPaalfa = aP7[0];
      this.aP7 = aP7;
      apprelector.this.AV16Mensa = aP8[0];
      this.aP8 = aP8;
      apprelector.this.AV17Inicio = aP9[0];
      this.aP9 = aP9;
      apprelector.this.AV18Fin = aP10[0];
      this.aP10 = aP10;
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
      GXutil.refClasses(pprelector.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apprelector.this.AV8EmprCod;
      this.aP1[0] = apprelector.this.AV9OpeCodalfa;
      this.aP2[0] = apprelector.this.AV10MaqCod;
      this.aP3[0] = apprelector.this.AV11Barcadaalfa;
      this.aP4[0] = apprelector.this.AV12BarCodReoalfa;
      this.aP5[0] = apprelector.this.AV13BarCodPar;
      this.aP6[0] = apprelector.this.AV14ParCodalfa;
      this.aP7[0] = apprelector.this.AV15FlagPaalfa;
      this.aP8[0] = apprelector.this.AV16Mensa;
      this.aP9[0] = apprelector.this.AV17Inicio;
      this.aP10[0] = apprelector.this.AV18Fin;
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

   private short Gx_err ;
   private String AV8EmprCod ;
   private String AV9OpeCodalfa ;
   private String AV10MaqCod ;
   private String AV11Barcadaalfa ;
   private String AV12BarCodReoalfa ;
   private String AV13BarCodPar ;
   private String AV14ParCodalfa ;
   private String AV15FlagPaalfa ;
   private String AV16Mensa ;
   private String AV17Inicio ;
   private String AV18Fin ;
   private String[] aP10 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
}

