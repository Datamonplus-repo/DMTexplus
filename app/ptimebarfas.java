package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptimebarfas extends GXProcedure
{
   public ptimebarfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptimebarfas.class ), "" );
   }

   public ptimebarfas( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           java.util.Date[] aP2 ,
                           java.util.Date[] aP3 )
   {
      ptimebarfas.this.aP4 = new long[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        long[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             long[] aP4 )
   {
      ptimebarfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptimebarfas.this.A603MaqCodBis = aP1[0];
      this.aP1 = aP1;
      ptimebarfas.this.AV9Barfasdti = aP2[0];
      this.aP2 = aP2;
      ptimebarfas.this.AV8Barfasdtf = aP3[0];
      this.aP3 = aP3;
      ptimebarfas.this.AV12Tiempo = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Tiempo = 0 ;
      AV13Barfasmn = " " ;
      /* Using cursor P04W32 */
      pr_default.execute(0, new Object[] {A396EmprCod, A603MaqCodBis, AV9Barfasdti, AV8Barfasdtf, AV9Barfasdti, AV8Barfasdtf});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4443BarFasDTF = P04W32_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P04W32_n4443BarFasDTF[0] ;
         A4442BarFasDTI = P04W32_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P04W32_n4442BarFasDTI[0] ;
         A129BarCod = P04W32_A129BarCod[0] ;
         A132BarCodReo = P04W32_A132BarCodReo[0] ;
         A130BarCodPar = P04W32_A130BarCodPar[0] ;
         A194BarOrdLin = P04W32_A194BarOrdLin[0] ;
         A215BarTieRea = P04W32_A215BarTieRea[0] ;
         A6390BarfasMn = P04W32_A6390BarfasMn[0] ;
         n6390BarfasMn = P04W32_n6390BarfasMn[0] ;
         A758ProCod = P04W32_A758ProCod[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int5[0] = A194BarOrdLin ;
         GXv_decimal6[0] = AV17Tr ;
         GXv_dtime7[0] = AV18dti ;
         GXv_dtime8[0] = AV19dtf ;
         GXv_char9[0] = AV15HisProlot ;
         new app.pcoste05(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_decimal6, GXv_dtime7, GXv_dtime8, GXv_char9) ;
         ptimebarfas.this.A396EmprCod = GXv_char1[0] ;
         ptimebarfas.this.A129BarCod = GXv_int2[0] ;
         ptimebarfas.this.A132BarCodReo = GXv_int3[0] ;
         ptimebarfas.this.A130BarCodPar = GXv_char4[0] ;
         ptimebarfas.this.A194BarOrdLin = GXv_int5[0] ;
         ptimebarfas.this.AV17Tr = GXv_decimal6[0] ;
         ptimebarfas.this.AV18dti = GXv_dtime7[0] ;
         ptimebarfas.this.AV19dtf = GXv_dtime8[0] ;
         ptimebarfas.this.AV15HisProlot = GXv_char9[0] ;
         GXv_char9[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int5[0] = A194BarOrdLin ;
         GXv_int10[0] = AV14Lhipro ;
         new app.pexilhipro(remoteHandle, context).execute( GXv_char9, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_int10) ;
         ptimebarfas.this.A396EmprCod = GXv_char9[0] ;
         ptimebarfas.this.A129BarCod = GXv_int2[0] ;
         ptimebarfas.this.A132BarCodReo = GXv_int3[0] ;
         ptimebarfas.this.A130BarCodPar = GXv_char4[0] ;
         ptimebarfas.this.A194BarOrdLin = GXv_int5[0] ;
         ptimebarfas.this.AV14Lhipro = GXv_int10[0] ;
         if ( AV14Lhipro == 0 )
         {
            GXv_char9[0] = A396EmprCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int10[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_int5[0] = A194BarOrdLin ;
            GXv_decimal6[0] = AV17Tr ;
            GXv_dtime8[0] = AV18dti ;
            GXv_dtime7[0] = AV19dtf ;
            GXv_char1[0] = AV15HisProlot ;
            GXv_int3[0] = AV14Lhipro ;
            new app.pcoste06(remoteHandle, context).execute( GXv_char9, GXv_int2, GXv_int10, GXv_char4, GXv_int5, GXv_decimal6, GXv_dtime8, GXv_dtime7, GXv_char1, GXv_int3) ;
            ptimebarfas.this.A396EmprCod = GXv_char9[0] ;
            ptimebarfas.this.A129BarCod = GXv_int2[0] ;
            ptimebarfas.this.A132BarCodReo = GXv_int10[0] ;
            ptimebarfas.this.A130BarCodPar = GXv_char4[0] ;
            ptimebarfas.this.A194BarOrdLin = GXv_int5[0] ;
            ptimebarfas.this.AV17Tr = GXv_decimal6[0] ;
            ptimebarfas.this.AV18dti = GXv_dtime8[0] ;
            ptimebarfas.this.AV19dtf = GXv_dtime7[0] ;
            ptimebarfas.this.AV15HisProlot = GXv_char1[0] ;
            ptimebarfas.this.AV14Lhipro = GXv_int3[0] ;
         }
         AV16Lot = ((GXutil.strcmp(A6390BarfasMn, " ")!=0) ? A6390BarfasMn : AV15HisProlot) ;
         AV10Min = (byte)(DecimalUtil.decToDouble((A215BarTieRea.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))))).multiply(DecimalUtil.doubleToDec(100)))) ;
         AV11Tiempo_m = (int)((GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))*60)+AV10Min) ;
         if ( ( GXutil.strcmp(AV16Lot, AV13Barfasmn) != 0 ) && ( AV14Lhipro > 0 ) )
         {
            AV12Tiempo = (long)(AV12Tiempo+AV11Tiempo_m) ;
         }
         AV13Barfasmn = AV16Lot ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptimebarfas.this.A396EmprCod;
      this.aP1[0] = ptimebarfas.this.A603MaqCodBis;
      this.aP2[0] = ptimebarfas.this.AV9Barfasdti;
      this.aP3[0] = ptimebarfas.this.AV8Barfasdtf;
      this.aP4[0] = ptimebarfas.this.AV12Tiempo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Barfasmn = "" ;
      scmdbuf = "" ;
      P04W32_A396EmprCod = new String[] {""} ;
      P04W32_A603MaqCodBis = new String[] {""} ;
      P04W32_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P04W32_n4443BarFasDTF = new boolean[] {false} ;
      P04W32_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P04W32_n4442BarFasDTI = new boolean[] {false} ;
      P04W32_A129BarCod = new int[1] ;
      P04W32_A132BarCodReo = new byte[1] ;
      P04W32_A130BarCodPar = new String[] {""} ;
      P04W32_A194BarOrdLin = new short[1] ;
      P04W32_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04W32_A6390BarfasMn = new String[] {""} ;
      P04W32_n6390BarfasMn = new boolean[] {false} ;
      P04W32_A758ProCod = new String[] {""} ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A130BarCodPar = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A6390BarfasMn = "" ;
      A758ProCod = "" ;
      AV17Tr = DecimalUtil.ZERO ;
      AV18dti = GXutil.resetTime( GXutil.nullDate() );
      AV19dtf = GXutil.resetTime( GXutil.nullDate() );
      AV15HisProlot = "" ;
      GXv_char9 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_dtime8 = new java.util.Date[1] ;
      GXv_dtime7 = new java.util.Date[1] ;
      GXv_char1 = new String[1] ;
      GXv_int3 = new byte[1] ;
      AV16Lot = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptimebarfas__default(),
         new Object[] {
             new Object[] {
            P04W32_A396EmprCod, P04W32_A603MaqCodBis, P04W32_A4443BarFasDTF, P04W32_n4443BarFasDTF, P04W32_A4442BarFasDTI, P04W32_n4442BarFasDTI, P04W32_A129BarCod, P04W32_A132BarCodReo, P04W32_A130BarCodPar, P04W32_A194BarOrdLin,
            P04W32_A215BarTieRea, P04W32_A6390BarfasMn, P04W32_n6390BarfasMn, P04W32_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV14Lhipro ;
   private byte GXv_int10[] ;
   private byte GXv_int3[] ;
   private byte AV10Min ;
   private short A194BarOrdLin ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private int AV11Tiempo_m ;
   private long AV12Tiempo ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal AV17Tr ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String A603MaqCodBis ;
   private String AV13Barfasmn ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A6390BarfasMn ;
   private String A758ProCod ;
   private String AV15HisProlot ;
   private String GXv_char9[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String AV16Lot ;
   private java.util.Date AV9Barfasdti ;
   private java.util.Date AV8Barfasdtf ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date AV18dti ;
   private java.util.Date AV19dtf ;
   private java.util.Date GXv_dtime8[] ;
   private java.util.Date GXv_dtime7[] ;
   private boolean n4443BarFasDTF ;
   private boolean n4442BarFasDTI ;
   private boolean n6390BarfasMn ;
   private long[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04W32_A396EmprCod ;
   private String[] P04W32_A603MaqCodBis ;
   private java.util.Date[] P04W32_A4443BarFasDTF ;
   private boolean[] P04W32_n4443BarFasDTF ;
   private java.util.Date[] P04W32_A4442BarFasDTI ;
   private boolean[] P04W32_n4442BarFasDTI ;
   private int[] P04W32_A129BarCod ;
   private byte[] P04W32_A132BarCodReo ;
   private String[] P04W32_A130BarCodPar ;
   private short[] P04W32_A194BarOrdLin ;
   private java.math.BigDecimal[] P04W32_A215BarTieRea ;
   private String[] P04W32_A6390BarfasMn ;
   private boolean[] P04W32_n6390BarfasMn ;
   private String[] P04W32_A758ProCod ;
}

final  class ptimebarfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04W32", "SELECT EmprCod, MaqCodBis, BarFasDTF, BarFasDTI, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarTieRea, BarfasMn, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and MaqCodBis = ?) AND (BarFasDTI >= ?) AND (BarFasDTF <= ?) AND (BarFasDTF >= ?) AND (BarFasDTI <= ?) ORDER BY EmprCod, MaqCodBis, BarfasMn ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[11])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 8);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               return;
      }
   }

}

