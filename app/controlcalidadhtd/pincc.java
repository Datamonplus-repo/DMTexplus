package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pincc extends GXProcedure
{
   public pincc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pincc.class ), "" );
   }

   public pincc( int remoteHandle ,
                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           short[] aP5 ,
                           int[] aP6 ,
                           String[] aP7 ,
                           short[] aP8 )
   {
      pincc.this.aP9 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        byte[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             byte[] aP9 )
   {
      pincc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pincc.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pincc.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pincc.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pincc.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pincc.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      pincc.this.A4031CCTCod = aP6[0];
      this.aP6 = aP6;
      pincc.this.AV14CCVal = aP7[0];
      this.aP7 = aP7;
      pincc.this.AV11Cctlin = aP8[0];
      this.aP8 = aP8;
      pincc.this.AV12Ok = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pincc.this.A396EmprCod;
      this.aP1[0] = pincc.this.A129BarCod;
      this.aP2[0] = pincc.this.A132BarCodReo;
      this.aP3[0] = pincc.this.A130BarCodPar;
      this.aP4[0] = pincc.this.A758ProCod;
      this.aP5[0] = pincc.this.A194BarOrdLin;
      this.aP6[0] = pincc.this.A4031CCTCod;
      this.aP7[0] = pincc.this.AV14CCVal;
      this.aP8[0] = pincc.this.AV11Cctlin;
      this.aP9[0] = pincc.this.AV12Ok;
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

   private byte A132BarCodReo ;
   private byte AV12Ok ;
   private short A194BarOrdLin ;
   private short AV11Cctlin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A4031CCTCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV14CCVal ;
   private byte[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private int[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
}

