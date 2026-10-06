package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsesc extends GXProcedure
{
   public pinsesc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsesc.class ), "" );
   }

   public pinsesc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           String[] aP2 ,
                                           String[] aP3 ,
                                           int[] aP4 ,
                                           byte[] aP5 )
   {
      pinsesc.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pinsesc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinsesc.this.AV20CliCod = aP1[0];
      this.aP1 = aP1;
      pinsesc.this.AV21ForSer = aP2[0];
      this.aP2 = aP2;
      pinsesc.this.AV22ForColNom = aP3[0];
      this.aP3 = aP3;
      pinsesc.this.AV23ForColNum = aP4[0];
      this.aP4 = aP4;
      pinsesc.this.AV24TipColCod = aP5[0];
      this.aP5 = aP5;
      pinsesc.this.AV37Coste1 = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV36ContVal ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "ESCINC", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      pinsesc.this.A396EmprCod = GXv_char2[0] ;
      pinsesc.this.GXt_int1 = GXv_int4[0] ;
      AV36ContVal = GXt_int1 ;
      AV26EscInc = DecimalUtil.doubleToDec(AV36ContVal/ (double) (100)) ;
      GXt_int1 = AV36ContVal ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "ESCKGM", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int4) ;
      pinsesc.this.A396EmprCod = GXv_char3[0] ;
      pinsesc.this.GXt_int1 = GXv_int4[0] ;
      AV36ContVal = GXt_int1 ;
      AV27EscKgm = DecimalUtil.doubleToDec(AV36ContVal/ (double) (100)) ;
      GXt_int1 = AV36ContVal ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "ESCVOL", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int4) ;
      pinsesc.this.A396EmprCod = GXv_char3[0] ;
      pinsesc.this.GXt_int1 = GXv_int4[0] ;
      AV36ContVal = GXt_int1 ;
      AV28EscVol = (int)(AV36ContVal/ (double) (100)) ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = AV19Station ;
      GXv_decimal5[0] = AV26EscInc ;
      GXv_decimal6[0] = AV27EscKgm ;
      GXv_int4[0] = AV28EscVol ;
      GXv_int7[0] = AV20CliCod ;
      GXv_char8[0] = AV21ForSer ;
      GXv_char9[0] = AV22ForColNom ;
      GXv_int10[0] = AV23ForColNum ;
      GXv_int11[0] = AV24TipColCod ;
      GXv_decimal12[0] = AV33CosAux ;
      GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
      GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
      new app.pcalcos0(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_decimal5, GXv_decimal6, GXv_int4, GXv_int7, GXv_char8, GXv_char9, GXv_int10, GXv_int11, GXv_decimal12, GXv_decimal13, GXv_decimal14) ;
      pinsesc.this.A396EmprCod = GXv_char3[0] ;
      pinsesc.this.AV19Station = GXv_char2[0] ;
      pinsesc.this.AV26EscInc = GXv_decimal5[0] ;
      pinsesc.this.AV27EscKgm = GXv_decimal6[0] ;
      pinsesc.this.AV28EscVol = GXv_int4[0] ;
      pinsesc.this.AV20CliCod = GXv_int7[0] ;
      pinsesc.this.AV21ForSer = GXv_char8[0] ;
      pinsesc.this.AV22ForColNom = GXv_char9[0] ;
      pinsesc.this.AV23ForColNum = GXv_int10[0] ;
      pinsesc.this.AV24TipColCod = GXv_int11[0] ;
      pinsesc.this.AV33CosAux = GXv_decimal12[0] ;
      AV37Coste1 = AV33CosAux ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsesc.this.A396EmprCod;
      this.aP1[0] = pinsesc.this.AV20CliCod;
      this.aP2[0] = pinsesc.this.AV21ForSer;
      this.aP3[0] = pinsesc.this.AV22ForColNom;
      this.aP4[0] = pinsesc.this.AV23ForColNum;
      this.aP5[0] = pinsesc.this.AV24TipColCod;
      this.aP6[0] = pinsesc.this.AV37Coste1;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26EscInc = DecimalUtil.ZERO ;
      AV27EscKgm = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      AV19Station = "" ;
      GXv_char2 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int4 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new byte[1] ;
      AV33CosAux = DecimalUtil.ZERO ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24TipColCod ;
   private byte GXv_int11[] ;
   private short Gx_err ;
   private int AV20CliCod ;
   private int AV23ForColNum ;
   private int AV36ContVal ;
   private int GXt_int1 ;
   private int AV28EscVol ;
   private int GXv_int4[] ;
   private int GXv_int7[] ;
   private int GXv_int10[] ;
   private java.math.BigDecimal AV37Coste1 ;
   private java.math.BigDecimal AV26EscInc ;
   private java.math.BigDecimal AV27EscKgm ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV33CosAux ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private String A396EmprCod ;
   private String AV21ForSer ;
   private String AV22ForColNom ;
   private String GXv_char3[] ;
   private String AV19Station ;
   private String GXv_char2[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
}

