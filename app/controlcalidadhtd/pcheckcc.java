package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcheckcc extends GXProcedure
{
   public pcheckcc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcheckcc.class ), "" );
   }

   public pcheckcc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           short[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 ,
                           String[] aP5 ,
                           int[] aP6 ,
                           byte[] aP7 ,
                           short[] aP8 ,
                           int[] aP9 ,
                           String[] aP10 ,
                           short[] aP11 )
   {
      pcheckcc.this.aP12 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 ,
                        short[] aP8 ,
                        int[] aP9 ,
                        String[] aP10 ,
                        short[] aP11 ,
                        byte[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 ,
                             short[] aP8 ,
                             int[] aP9 ,
                             String[] aP10 ,
                             short[] aP11 ,
                             byte[] aP12 )
   {
      pcheckcc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcheckcc.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcheckcc.this.A9713Tb1_Cod = aP2[0];
      this.aP2 = aP2;
      pcheckcc.this.A11736CCArtCod = aP3[0];
      this.aP3 = aP3;
      pcheckcc.this.A11748TipArtiId = aP4[0];
      this.aP4 = aP4;
      pcheckcc.this.A11737CCColNom = aP5[0];
      this.aP5 = aP5;
      pcheckcc.this.A11738CCColNum = aP6[0];
      this.aP6 = aP6;
      pcheckcc.this.A11749CCCTc = aP7[0];
      this.aP7 = aP7;
      pcheckcc.this.A11750IntId = aP8[0];
      this.aP8 = aP8;
      pcheckcc.this.A4031CCTCod = aP9[0];
      this.aP9 = aP9;
      pcheckcc.this.AV14CCVal = aP10[0];
      this.aP10 = aP10;
      pcheckcc.this.AV11Cctlin = aP11[0];
      this.aP11 = aP11;
      pcheckcc.this.AV12Ok = aP12[0];
      this.aP12 = aP12;
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
      this.aP0[0] = pcheckcc.this.A396EmprCod;
      this.aP1[0] = pcheckcc.this.A252CliCod;
      this.aP2[0] = pcheckcc.this.A9713Tb1_Cod;
      this.aP3[0] = pcheckcc.this.A11736CCArtCod;
      this.aP4[0] = pcheckcc.this.A11748TipArtiId;
      this.aP5[0] = pcheckcc.this.A11737CCColNom;
      this.aP6[0] = pcheckcc.this.A11738CCColNum;
      this.aP7[0] = pcheckcc.this.A11749CCCTc;
      this.aP8[0] = pcheckcc.this.A11750IntId;
      this.aP9[0] = pcheckcc.this.A4031CCTCod;
      this.aP10[0] = pcheckcc.this.AV14CCVal;
      this.aP11[0] = pcheckcc.this.AV11Cctlin;
      this.aP12[0] = pcheckcc.this.AV12Ok;
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

   private byte A11749CCCTc ;
   private byte AV12Ok ;
   private short A9713Tb1_Cod ;
   private short A11748TipArtiId ;
   private short A11750IntId ;
   private short AV11Cctlin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A11738CCColNum ;
   private int A4031CCTCod ;
   private String A396EmprCod ;
   private String A11736CCArtCod ;
   private String A11737CCColNom ;
   private String AV14CCVal ;
   private byte[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private int[] aP6 ;
   private byte[] aP7 ;
   private short[] aP8 ;
   private int[] aP9 ;
   private String[] aP10 ;
   private short[] aP11 ;
}

