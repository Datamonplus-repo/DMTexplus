package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pwork11 extends GXProcedure
{
   public pwork11( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pwork11.class ), "" );
   }

   public pwork11( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          short[] aP1 ,
                          int[] aP2 ,
                          short[] aP3 ,
                          java.util.Date[] aP4 ,
                          int[] aP5 ,
                          byte[] aP6 ,
                          String[] aP7 ,
                          short[] aP8 ,
                          String[] aP9 ,
                          java.math.BigDecimal[] aP10 ,
                          java.math.BigDecimal[] aP11 )
   {
      pwork11.this.aP12 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        int[] aP2 ,
                        short[] aP3 ,
                        java.util.Date[] aP4 ,
                        int[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        int[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             int[] aP2 ,
                             short[] aP3 ,
                             java.util.Date[] aP4 ,
                             int[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             int[] aP12 )
   {
      pwork11.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pwork11.this.AV8Mancod = aP1[0];
      this.aP1 = aP1;
      pwork11.this.AV9SalExtAlb = aP2[0];
      this.aP2 = aP2;
      pwork11.this.AV10SalExNln = aP3[0];
      this.aP3 = aP3;
      pwork11.this.AV11SalExtFec = aP4[0];
      this.aP4 = aP4;
      pwork11.this.AV12Barcod = aP5[0];
      this.aP5 = aP5;
      pwork11.this.AV13barcodreo = aP6[0];
      this.aP6 = aP6;
      pwork11.this.AV14barcodpar = aP7[0];
      this.aP7 = aP7;
      pwork11.this.AV15BarOrdlin = aP8[0];
      this.aP8 = aP8;
      pwork11.this.AV16Fascod = aP9[0];
      this.aP9 = aP9;
      pwork11.this.AV17SalExKgE = aP10[0];
      this.aP10 = aP10;
      pwork11.this.AV18SalExMtE = aP11[0];
      this.aP11 = aP11;
      pwork11.this.AV19SalExCoE = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV12Barcod ;
      GXv_int3[0] = AV13barcodreo ;
      GXv_char4[0] = AV14barcodpar ;
      GXv_int5[0] = AV15BarOrdlin ;
      GXv_char6[0] = AV16Fascod ;
      GXv_date7[0] = AV11SalExtFec ;
      GXv_int8[0] = (byte)(1) ;
      GXv_int9[0] = AV9SalExtAlb ;
      new app.trabajosexternos.phdrexwcopy1(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_date7, GXv_int8, GXv_int9) ;
      pwork11.this.A396EmprCod = GXv_char1[0] ;
      pwork11.this.AV12Barcod = GXv_int2[0] ;
      pwork11.this.AV13barcodreo = GXv_int3[0] ;
      pwork11.this.AV14barcodpar = GXv_char4[0] ;
      pwork11.this.AV15BarOrdlin = GXv_int5[0] ;
      pwork11.this.AV16Fascod = GXv_char6[0] ;
      pwork11.this.AV11SalExtFec = GXv_date7[0] ;
      pwork11.this.AV9SalExtAlb = GXv_int9[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pwork11.this.A396EmprCod;
      this.aP1[0] = pwork11.this.AV8Mancod;
      this.aP2[0] = pwork11.this.AV9SalExtAlb;
      this.aP3[0] = pwork11.this.AV10SalExNln;
      this.aP4[0] = pwork11.this.AV11SalExtFec;
      this.aP5[0] = pwork11.this.AV12Barcod;
      this.aP6[0] = pwork11.this.AV13barcodreo;
      this.aP7[0] = pwork11.this.AV14barcodpar;
      this.aP8[0] = pwork11.this.AV15BarOrdlin;
      this.aP9[0] = pwork11.this.AV16Fascod;
      this.aP10[0] = pwork11.this.AV17SalExKgE;
      this.aP11[0] = pwork11.this.AV18SalExMtE;
      this.aP12[0] = pwork11.this.AV19SalExCoE;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_char6 = new String[1] ;
      GXv_date7 = new java.util.Date[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int9 = new int[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13barcodreo ;
   private byte GXv_int3[] ;
   private byte GXv_int8[] ;
   private short AV8Mancod ;
   private short AV10SalExNln ;
   private short AV15BarOrdlin ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV9SalExtAlb ;
   private int AV12Barcod ;
   private int AV19SalExCoE ;
   private int GXv_int2[] ;
   private int GXv_int9[] ;
   private java.math.BigDecimal AV17SalExKgE ;
   private java.math.BigDecimal AV18SalExMtE ;
   private String A396EmprCod ;
   private String AV14barcodpar ;
   private String AV16Fascod ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private java.util.Date AV11SalExtFec ;
   private java.util.Date GXv_date7[] ;
   private int[] aP12 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private int[] aP2 ;
   private short[] aP3 ;
   private java.util.Date[] aP4 ;
   private int[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
}

