package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pwork01 extends GXProcedure
{
   public pwork01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pwork01.class ), "" );
   }

   public pwork01( int remoteHandle ,
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
      pwork01.this.aP12 = new int[] {0};
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
      pwork01.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pwork01.this.AV18ManCod = aP1[0];
      this.aP1 = aP1;
      pwork01.this.AV12SalExtAlb = aP2[0];
      this.aP2 = aP2;
      pwork01.this.AV13SalExNln = aP3[0];
      this.aP3 = aP3;
      pwork01.this.AV17SalExtFec = aP4[0];
      this.aP4 = aP4;
      pwork01.this.AV8Barcod = aP5[0];
      this.aP5 = aP5;
      pwork01.this.AV9barcodreo = aP6[0];
      this.aP6 = aP6;
      pwork01.this.AV10barcodpar = aP7[0];
      this.aP7 = aP7;
      pwork01.this.AV22Barordlin = aP8[0];
      this.aP8 = aP8;
      pwork01.this.AV11Fascod = aP9[0];
      this.aP9 = aP9;
      pwork01.this.AV19SalExKgE = aP10[0];
      this.aP10 = aP10;
      pwork01.this.AV20SalExMtE = aP11[0];
      this.aP11 = aP11;
      pwork01.this.AV21SalExCoE = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_int2[0] = AV8Barcod ;
      GXv_int3[0] = AV9barcodreo ;
      GXv_char4[0] = AV10barcodpar ;
      GXv_decimal5[0] = AV14BarKgm ;
      GXv_decimal6[0] = AV16BarMtr ;
      GXv_int7[0] = AV15Barpie ;
      new app.trabajosexternos.pwork02(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_decimal5, GXv_decimal6, GXv_int7) ;
      pwork01.this.A396EmprCod = GXv_char1[0] ;
      pwork01.this.AV8Barcod = GXv_int2[0] ;
      pwork01.this.AV9barcodreo = GXv_int3[0] ;
      pwork01.this.AV10barcodpar = GXv_char4[0] ;
      pwork01.this.AV14BarKgm = GXv_decimal5[0] ;
      pwork01.this.AV16BarMtr = GXv_decimal6[0] ;
      pwork01.this.AV15Barpie = GXv_int7[0] ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = AV8Barcod ;
      GXv_int3[0] = AV9barcodreo ;
      GXv_char1[0] = AV10barcodpar ;
      GXv_int8[0] = AV22Barordlin ;
      GXv_char9[0] = AV11Fascod ;
      GXv_date10[0] = AV17SalExtFec ;
      GXv_int11[0] = (byte)(1) ;
      GXv_int2[0] = AV12SalExtAlb ;
      new app.trabajosexternos.phdrexw(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int3, GXv_char1, GXv_int8, GXv_char9, GXv_date10, GXv_int11, GXv_int2) ;
      pwork01.this.A396EmprCod = GXv_char4[0] ;
      pwork01.this.AV8Barcod = GXv_int7[0] ;
      pwork01.this.AV9barcodreo = GXv_int3[0] ;
      pwork01.this.AV10barcodpar = GXv_char1[0] ;
      pwork01.this.AV22Barordlin = GXv_int8[0] ;
      pwork01.this.AV11Fascod = GXv_char9[0] ;
      pwork01.this.AV17SalExtFec = GXv_date10[0] ;
      pwork01.this.AV12SalExtAlb = GXv_int2[0] ;
      GXv_char9[0] = A396EmprCod ;
      GXv_int8[0] = AV18ManCod ;
      GXv_char4[0] = AV11Fascod ;
      GXv_char1[0] = httpContext.getMessage( "E", "") ;
      GXv_int7[0] = AV12SalExtAlb ;
      GXv_decimal6[0] = AV19SalExKgE ;
      GXv_decimal5[0] = AV20SalExMtE ;
      GXv_int12[0] = (short)(AV21SalExCoE) ;
      GXv_date10[0] = AV17SalExtFec ;
      GXv_int2[0] = AV8Barcod ;
      GXv_int11[0] = AV9barcodreo ;
      GXv_char13[0] = AV10barcodpar ;
      GXv_int14[0] = AV13SalExNln ;
      new app.trabajosexternos.pamvexhd(remoteHandle, context).execute( GXv_char9, GXv_int8, GXv_char4, GXv_char1, GXv_int7, GXv_decimal6, GXv_decimal5, GXv_int12, GXv_date10, GXv_int2, GXv_int11, GXv_char13, GXv_int14) ;
      pwork01.this.A396EmprCod = GXv_char9[0] ;
      pwork01.this.AV18ManCod = GXv_int8[0] ;
      pwork01.this.AV11Fascod = GXv_char4[0] ;
      pwork01.this.AV12SalExtAlb = GXv_int7[0] ;
      pwork01.this.AV19SalExKgE = GXv_decimal6[0] ;
      pwork01.this.AV20SalExMtE = GXv_decimal5[0] ;
      pwork01.this.AV21SalExCoE = GXv_int12[0] ;
      pwork01.this.AV17SalExtFec = GXv_date10[0] ;
      pwork01.this.AV8Barcod = GXv_int2[0] ;
      pwork01.this.AV9barcodreo = GXv_int11[0] ;
      pwork01.this.AV10barcodpar = GXv_char13[0] ;
      pwork01.this.AV13SalExNln = GXv_int14[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pwork01.this.A396EmprCod;
      this.aP1[0] = pwork01.this.AV18ManCod;
      this.aP2[0] = pwork01.this.AV12SalExtAlb;
      this.aP3[0] = pwork01.this.AV13SalExNln;
      this.aP4[0] = pwork01.this.AV17SalExtFec;
      this.aP5[0] = pwork01.this.AV8Barcod;
      this.aP6[0] = pwork01.this.AV9barcodreo;
      this.aP7[0] = pwork01.this.AV10barcodpar;
      this.aP8[0] = pwork01.this.AV22Barordlin;
      this.aP9[0] = pwork01.this.AV11Fascod;
      this.aP10[0] = pwork01.this.AV19SalExKgE;
      this.aP11[0] = pwork01.this.AV20SalExMtE;
      this.aP12[0] = pwork01.this.AV21SalExCoE;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14BarKgm = DecimalUtil.ZERO ;
      AV16BarMtr = DecimalUtil.ZERO ;
      GXv_int3 = new byte[1] ;
      GXv_char9 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_int12 = new short[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_int2 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char13 = new String[1] ;
      GXv_int14 = new short[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9barcodreo ;
   private byte GXv_int3[] ;
   private byte GXv_int11[] ;
   private short AV18ManCod ;
   private short AV13SalExNln ;
   private short AV22Barordlin ;
   private short GXv_int8[] ;
   private short GXv_int12[] ;
   private short GXv_int14[] ;
   private short Gx_err ;
   private int AV12SalExtAlb ;
   private int AV8Barcod ;
   private int AV21SalExCoE ;
   private int AV15Barpie ;
   private int GXv_int7[] ;
   private int GXv_int2[] ;
   private java.math.BigDecimal AV19SalExKgE ;
   private java.math.BigDecimal AV20SalExMtE ;
   private java.math.BigDecimal AV14BarKgm ;
   private java.math.BigDecimal AV16BarMtr ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String A396EmprCod ;
   private String AV10barcodpar ;
   private String AV11Fascod ;
   private String GXv_char9[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String GXv_char13[] ;
   private java.util.Date AV17SalExtFec ;
   private java.util.Date GXv_date10[] ;
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

