package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengodatosordenfase extends GXProcedure
{
   public obtengodatosordenfase( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengodatosordenfase.class ), "" );
   }

   public obtengodatosordenfase( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             java.util.Date[] aP11 ,
                             java.util.Date[] aP12 ,
                             short[] aP13 ,
                             short[] aP14 ,
                             java.math.BigDecimal[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 )
   {
      obtengodatosordenfase.this.aP18 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
      return aP18[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short aP5 ,
                        short[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        java.util.Date[] aP11 ,
                        java.util.Date[] aP12 ,
                        short[] aP13 ,
                        short[] aP14 ,
                        java.math.BigDecimal[] aP15 ,
                        String[] aP16 ,
                        String[] aP17 ,
                        String[] aP18 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             java.util.Date[] aP11 ,
                             java.util.Date[] aP12 ,
                             short[] aP13 ,
                             short[] aP14 ,
                             java.math.BigDecimal[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 )
   {
      obtengodatosordenfase.this.AV13emprcod = aP0;
      obtengodatosordenfase.this.AV12barcod = aP1;
      obtengodatosordenfase.this.AV11barcodreo = aP2;
      obtengodatosordenfase.this.AV10barcodpar = aP3;
      obtengodatosordenfase.this.AV9Procod = aP4;
      obtengodatosordenfase.this.AV8Barordlin = aP5;
      obtengodatosordenfase.this.aP6 = aP6;
      obtengodatosordenfase.this.aP7 = aP7;
      obtengodatosordenfase.this.aP8 = aP8;
      obtengodatosordenfase.this.aP9 = aP9;
      obtengodatosordenfase.this.aP10 = aP10;
      obtengodatosordenfase.this.aP11 = aP11;
      obtengodatosordenfase.this.aP12 = aP12;
      obtengodatosordenfase.this.aP13 = aP13;
      obtengodatosordenfase.this.aP14 = aP14;
      obtengodatosordenfase.this.aP15 = aP15;
      obtengodatosordenfase.this.aP16 = aP16;
      obtengodatosordenfase.this.aP17 = aP17;
      obtengodatosordenfase.this.aP18 = aP18;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14barfas = (short)(0) ;
      AV15Barfactin = "N" ;
      AV16Barfasacab = "N" ;
      AV17BarFascon = "N" ;
      AV27BarFasEst = (byte)(0) ;
      AV18BarFasfor = "N" ;
      AV19Barfecrea = GXutil.nullDate() ;
      AV20Barfecrini = GXutil.nullDate() ;
      AV21Barhorfin = (short)(0) ;
      AV22BarHorIni = (short)(0) ;
      AV23BarTieteo = DecimalUtil.ZERO ;
      AV24Baruni = DecimalUtil.ZERO ;
      AV25MaqCodBis = "" ;
      AV26Fascod = "" ;
      AV28Errmensaje = "" ;
      AV31GXLvl17 = (byte)(0) ;
      /* Using cursor P0AGS2 */
      pr_default.execute(0, new Object[] {AV13emprcod, Integer.valueOf(AV12barcod), Byte.valueOf(AV11barcodreo), AV10barcodpar, AV9Procod, Short.valueOf(AV8Barordlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P0AGS2_A194BarOrdLin[0] ;
         A758ProCod = P0AGS2_A758ProCod[0] ;
         A130BarCodPar = P0AGS2_A130BarCodPar[0] ;
         A132BarCodReo = P0AGS2_A132BarCodReo[0] ;
         A129BarCod = P0AGS2_A129BarCod[0] ;
         A396EmprCod = P0AGS2_A396EmprCod[0] ;
         A150BarFacTin = P0AGS2_A150BarFacTin[0] ;
         A4905BarFasAcab = P0AGS2_A4905BarFasAcab[0] ;
         A152BarFasCon = P0AGS2_A152BarFasCon[0] ;
         A153BarFasEst = P0AGS2_A153BarFasEst[0] ;
         A4287BarFasFor = P0AGS2_A4287BarFasFor[0] ;
         A160BarFecRea = P0AGS2_A160BarFecRea[0] ;
         A3298BarFecRIni = P0AGS2_A3298BarFecRIni[0] ;
         A164BarHorFin = P0AGS2_A164BarHorFin[0] ;
         A165BarHorIni = P0AGS2_A165BarHorIni[0] ;
         A216BarTieTeo = P0AGS2_A216BarTieTeo[0] ;
         A227BarUni = P0AGS2_A227BarUni[0] ;
         A603MaqCodBis = P0AGS2_A603MaqCodBis[0] ;
         A457FasCod = P0AGS2_A457FasCod[0] ;
         AV31GXLvl17 = (byte)(1) ;
         AV14barfas = (short)(1) ;
         AV15Barfactin = A150BarFacTin ;
         AV16Barfasacab = A4905BarFasAcab ;
         AV17BarFascon = A152BarFasCon ;
         AV27BarFasEst = A153BarFasEst ;
         AV18BarFasfor = A4287BarFasFor ;
         AV19Barfecrea = A160BarFecRea ;
         AV20Barfecrini = A3298BarFecRIni ;
         AV21Barhorfin = A164BarHorFin ;
         AV22BarHorIni = A165BarHorIni ;
         AV23BarTieteo = A216BarTieTeo ;
         AV24Baruni = A227BarUni ;
         AV25MaqCodBis = A603MaqCodBis ;
         AV26Fascod = A457FasCod ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int5[0] = A194BarOrdLin ;
         GXv_char6[0] = AV28Errmensaje ;
         new app.pedidosclientesindetalle.pprc275(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_char6) ;
         obtengodatosordenfase.this.A396EmprCod = GXv_char1[0] ;
         obtengodatosordenfase.this.A129BarCod = GXv_int2[0] ;
         obtengodatosordenfase.this.A132BarCodReo = GXv_int3[0] ;
         obtengodatosordenfase.this.A130BarCodPar = GXv_char4[0] ;
         obtengodatosordenfase.this.A194BarOrdLin = GXv_int5[0] ;
         obtengodatosordenfase.this.AV28Errmensaje = GXv_char6[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV31GXLvl17 == 0 )
      {
         System.out.println( httpContext.getMessage( "NO existe BARFAS", "") );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = obtengodatosordenfase.this.AV14barfas;
      this.aP7[0] = obtengodatosordenfase.this.AV17BarFascon;
      this.aP8[0] = obtengodatosordenfase.this.AV15Barfactin;
      this.aP9[0] = obtengodatosordenfase.this.AV16Barfasacab;
      this.aP10[0] = obtengodatosordenfase.this.AV18BarFasfor;
      this.aP11[0] = obtengodatosordenfase.this.AV19Barfecrea;
      this.aP12[0] = obtengodatosordenfase.this.AV20Barfecrini;
      this.aP13[0] = obtengodatosordenfase.this.AV21Barhorfin;
      this.aP14[0] = obtengodatosordenfase.this.AV22BarHorIni;
      this.aP15[0] = obtengodatosordenfase.this.AV24Baruni;
      this.aP16[0] = obtengodatosordenfase.this.AV26Fascod;
      this.aP17[0] = obtengodatosordenfase.this.AV25MaqCodBis;
      this.aP18[0] = obtengodatosordenfase.this.AV28Errmensaje;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17BarFascon = "" ;
      AV15Barfactin = "" ;
      AV16Barfasacab = "" ;
      AV18BarFasfor = "" ;
      AV19Barfecrea = GXutil.nullDate() ;
      AV20Barfecrini = GXutil.nullDate() ;
      AV24Baruni = DecimalUtil.ZERO ;
      AV26Fascod = "" ;
      AV25MaqCodBis = "" ;
      AV28Errmensaje = "" ;
      AV23BarTieteo = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AGS2_A194BarOrdLin = new short[1] ;
      P0AGS2_A758ProCod = new String[] {""} ;
      P0AGS2_A130BarCodPar = new String[] {""} ;
      P0AGS2_A132BarCodReo = new byte[1] ;
      P0AGS2_A129BarCod = new int[1] ;
      P0AGS2_A396EmprCod = new String[] {""} ;
      P0AGS2_A150BarFacTin = new String[] {""} ;
      P0AGS2_A4905BarFasAcab = new String[] {""} ;
      P0AGS2_A152BarFasCon = new String[] {""} ;
      P0AGS2_A153BarFasEst = new byte[1] ;
      P0AGS2_A4287BarFasFor = new String[] {""} ;
      P0AGS2_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGS2_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P0AGS2_A164BarHorFin = new short[1] ;
      P0AGS2_A165BarHorIni = new short[1] ;
      P0AGS2_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGS2_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGS2_A603MaqCodBis = new String[] {""} ;
      P0AGS2_A457FasCod = new String[] {""} ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A150BarFacTin = "" ;
      A4905BarFasAcab = "" ;
      A152BarFasCon = "" ;
      A4287BarFasFor = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A227BarUni = DecimalUtil.ZERO ;
      A603MaqCodBis = "" ;
      A457FasCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_char6 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.obtengodatosordenfase__default(),
         new Object[] {
             new Object[] {
            P0AGS2_A194BarOrdLin, P0AGS2_A758ProCod, P0AGS2_A130BarCodPar, P0AGS2_A132BarCodReo, P0AGS2_A129BarCod, P0AGS2_A396EmprCod, P0AGS2_A150BarFacTin, P0AGS2_A4905BarFasAcab, P0AGS2_A152BarFasCon, P0AGS2_A153BarFasEst,
            P0AGS2_A4287BarFasFor, P0AGS2_A160BarFecRea, P0AGS2_A3298BarFecRIni, P0AGS2_A164BarHorFin, P0AGS2_A165BarHorIni, P0AGS2_A216BarTieTeo, P0AGS2_A227BarUni, P0AGS2_A603MaqCodBis, P0AGS2_A457FasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11barcodreo ;
   private byte AV27BarFasEst ;
   private byte AV31GXLvl17 ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte GXv_int3[] ;
   private short AV8Barordlin ;
   private short AV14barfas ;
   private short AV21Barhorfin ;
   private short AV22BarHorIni ;
   private short A194BarOrdLin ;
   private short A164BarHorFin ;
   private short A165BarHorIni ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV12barcod ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private java.math.BigDecimal AV24Baruni ;
   private java.math.BigDecimal AV23BarTieteo ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A227BarUni ;
   private String AV13emprcod ;
   private String AV10barcodpar ;
   private String AV9Procod ;
   private String AV17BarFascon ;
   private String AV15Barfactin ;
   private String AV16Barfasacab ;
   private String AV18BarFasfor ;
   private String AV26Fascod ;
   private String AV25MaqCodBis ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A150BarFacTin ;
   private String A4905BarFasAcab ;
   private String A152BarFasCon ;
   private String A4287BarFasFor ;
   private String A603MaqCodBis ;
   private String A457FasCod ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char6[] ;
   private java.util.Date AV19Barfecrea ;
   private java.util.Date AV20Barfecrini ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private String AV28Errmensaje ;
   private String[] aP18 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private java.util.Date[] aP11 ;
   private java.util.Date[] aP12 ;
   private short[] aP13 ;
   private short[] aP14 ;
   private java.math.BigDecimal[] aP15 ;
   private String[] aP16 ;
   private String[] aP17 ;
   private IDataStoreProvider pr_default ;
   private short[] P0AGS2_A194BarOrdLin ;
   private String[] P0AGS2_A758ProCod ;
   private String[] P0AGS2_A130BarCodPar ;
   private byte[] P0AGS2_A132BarCodReo ;
   private int[] P0AGS2_A129BarCod ;
   private String[] P0AGS2_A396EmprCod ;
   private String[] P0AGS2_A150BarFacTin ;
   private String[] P0AGS2_A4905BarFasAcab ;
   private String[] P0AGS2_A152BarFasCon ;
   private byte[] P0AGS2_A153BarFasEst ;
   private String[] P0AGS2_A4287BarFasFor ;
   private java.util.Date[] P0AGS2_A160BarFecRea ;
   private java.util.Date[] P0AGS2_A3298BarFecRIni ;
   private short[] P0AGS2_A164BarHorFin ;
   private short[] P0AGS2_A165BarHorIni ;
   private java.math.BigDecimal[] P0AGS2_A216BarTieTeo ;
   private java.math.BigDecimal[] P0AGS2_A227BarUni ;
   private String[] P0AGS2_A603MaqCodBis ;
   private String[] P0AGS2_A457FasCod ;
}

final  class obtengodatosordenfase__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGS2", "SELECT BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarFacTin, BarFasAcab, BarFasCon, BarFasEst, BarFasFor, BarFecRea, BarFecRIni, BarHorFin, BarHorIni, BarTieTeo, BarUni, MaqCodBis, FasCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[17])[0] = rslt.getString(18, 6);
               ((String[]) buf[18])[0] = rslt.getString(19, 8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

