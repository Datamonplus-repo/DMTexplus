package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasagr extends GXProcedure
{
   public pfasagr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasagr.class ), "" );
   }

   public pfasagr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 ,
                           int[] aP5 ,
                           short[] aP6 ,
                           java.math.BigDecimal[] aP7 )
   {
      pfasagr.this.aP8 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        int[] aP5 ,
                        short[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        byte[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             int[] aP5 ,
                             short[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 )
   {
      pfasagr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasagr.this.AV9BarCod = aP1[0];
      this.aP1 = aP1;
      pfasagr.this.AV8BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfasagr.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfasagr.this.AV10BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pfasagr.this.AV12BarFasLOt = aP5[0];
      this.aP5 = aP5;
      pfasagr.this.AV15BarFasNprd = aP6[0];
      this.aP6 = aP6;
      pfasagr.this.AV16BarFasKgs = aP7[0];
      this.aP7 = aP7;
      pfasagr.this.AV11FlagCtrl = aP8[0];
      this.aP8 = aP8;
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
      this.aP0[0] = pfasagr.this.A396EmprCod;
      this.aP1[0] = pfasagr.this.AV9BarCod;
      this.aP2[0] = pfasagr.this.AV8BarCodReo;
      this.aP3[0] = pfasagr.this.AV17BarCodPar;
      this.aP4[0] = pfasagr.this.AV10BarOrdLin;
      this.aP5[0] = pfasagr.this.AV12BarFasLOt;
      this.aP6[0] = pfasagr.this.AV15BarFasNprd;
      this.aP7[0] = pfasagr.this.AV16BarFasKgs;
      this.aP8[0] = pfasagr.this.AV11FlagCtrl;
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

   private byte AV8BarCodReo ;
   private byte AV11FlagCtrl ;
   private short AV10BarOrdLin ;
   private short AV15BarFasNprd ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int AV12BarFasLOt ;
   private java.math.BigDecimal AV16BarFasKgs ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private byte[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private int[] aP5 ;
   private short[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
}

