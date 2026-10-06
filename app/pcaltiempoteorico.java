package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcaltiempoteorico extends GXProcedure
{
   public pcaltiempoteorico( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcaltiempoteorico.class ), "" );
   }

   public pcaltiempoteorico( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 )
   {
      pcaltiempoteorico.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pcaltiempoteorico.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcaltiempoteorico.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcaltiempoteorico.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcaltiempoteorico.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcaltiempoteorico.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pcaltiempoteorico.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05GB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A120BarAgrEst = P05GB2_A120BarAgrEst[0] ;
         A150BarFacTin = P05GB2_A150BarFacTin[0] ;
         A457FasCod = P05GB2_A457FasCod[0] ;
         A603MaqCodBis = P05GB2_A603MaqCodBis[0] ;
         A252CliCod = P05GB2_A252CliCod[0] ;
         n252CliCod = P05GB2_n252CliCod[0] ;
         A212BarSer = P05GB2_A212BarSer[0] ;
         A120BarAgrEst = P05GB2_A120BarAgrEst[0] ;
         A252CliCod = P05GB2_A252CliCod[0] ;
         n252CliCod = P05GB2_n252CliCod[0] ;
         A212BarSer = P05GB2_A212BarSer[0] ;
         AV34barCod = A129BarCod ;
         AV35BarCodReo = A132BarCodReo ;
         AV36barCodPar = A130BarCodPar ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV34barCod, AV35BarCodReo, AV36barCodPar) ;
         }
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = AV34barCod ;
            GXv_int3[0] = AV35BarCodReo ;
            GXv_char4[0] = AV36barCodPar ;
            GXv_char5[0] = A457FasCod ;
            GXv_date6[0] = AV28FecTeo ;
            GXv_decimal7[0] = AV29TieTeo ;
            GXv_decimal8[0] = AV30Decalaje ;
            GXv_decimal9[0] = AV32Resto ;
            GXv_char10[0] = AV31T_c ;
            GXv_char11[0] = A758ProCod ;
            GXv_char12[0] = A603MaqCodBis ;
            GXv_int13[0] = A252CliCod ;
            GXv_char14[0] = A212BarSer ;
            GXv_int15[0] = 0 ;
            GXv_int16[0] = (byte)(0) ;
            new app.ppla001(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_date6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_char10, GXv_char11, GXv_char12, GXv_int13, GXv_char14, GXv_int15, GXv_int16) ;
            pcaltiempoteorico.this.A396EmprCod = GXv_char1[0] ;
            pcaltiempoteorico.this.AV34barCod = GXv_int2[0] ;
            pcaltiempoteorico.this.AV35BarCodReo = GXv_int3[0] ;
            pcaltiempoteorico.this.AV36barCodPar = GXv_char4[0] ;
            pcaltiempoteorico.this.A457FasCod = GXv_char5[0] ;
            pcaltiempoteorico.this.AV28FecTeo = GXv_date6[0] ;
            pcaltiempoteorico.this.AV29TieTeo = GXv_decimal7[0] ;
            pcaltiempoteorico.this.AV30Decalaje = GXv_decimal8[0] ;
            pcaltiempoteorico.this.AV32Resto = GXv_decimal9[0] ;
            pcaltiempoteorico.this.AV31T_c = GXv_char10[0] ;
            pcaltiempoteorico.this.A758ProCod = GXv_char11[0] ;
            pcaltiempoteorico.this.A603MaqCodBis = GXv_char12[0] ;
            pcaltiempoteorico.this.A252CliCod = GXv_int13[0] ;
            pcaltiempoteorico.this.A212BarSer = GXv_char14[0] ;
         }
         else
         {
            GXv_char14[0] = A396EmprCod ;
            GXv_int13[0] = A129BarCod ;
            GXv_int16[0] = A132BarCodReo ;
            GXv_char12[0] = A130BarCodPar ;
            GXv_char11[0] = A457FasCod ;
            GXv_date6[0] = AV28FecTeo ;
            GXv_decimal9[0] = AV29TieTeo ;
            GXv_decimal8[0] = AV30Decalaje ;
            GXv_decimal7[0] = AV32Resto ;
            GXv_char10[0] = AV31T_c ;
            GXv_char5[0] = A758ProCod ;
            GXv_char4[0] = A603MaqCodBis ;
            GXv_int2[0] = A252CliCod ;
            GXv_char1[0] = A212BarSer ;
            GXv_int15[0] = 0 ;
            GXv_int3[0] = (byte)(0) ;
            new app.ppla001(remoteHandle, context).execute( GXv_char14, GXv_int13, GXv_int16, GXv_char12, GXv_char11, GXv_date6, GXv_decimal9, GXv_decimal8, GXv_decimal7, GXv_char10, GXv_char5, GXv_char4, GXv_int2, GXv_char1, GXv_int15, GXv_int3) ;
            pcaltiempoteorico.this.A396EmprCod = GXv_char14[0] ;
            pcaltiempoteorico.this.A129BarCod = GXv_int13[0] ;
            pcaltiempoteorico.this.A132BarCodReo = GXv_int16[0] ;
            pcaltiempoteorico.this.A130BarCodPar = GXv_char12[0] ;
            pcaltiempoteorico.this.A457FasCod = GXv_char11[0] ;
            pcaltiempoteorico.this.AV28FecTeo = GXv_date6[0] ;
            pcaltiempoteorico.this.AV29TieTeo = GXv_decimal9[0] ;
            pcaltiempoteorico.this.AV30Decalaje = GXv_decimal8[0] ;
            pcaltiempoteorico.this.AV32Resto = GXv_decimal7[0] ;
            pcaltiempoteorico.this.AV31T_c = GXv_char10[0] ;
            pcaltiempoteorico.this.A758ProCod = GXv_char5[0] ;
            pcaltiempoteorico.this.A603MaqCodBis = GXv_char4[0] ;
            pcaltiempoteorico.this.A252CliCod = GXv_int2[0] ;
            pcaltiempoteorico.this.A212BarSer = GXv_char1[0] ;
         }
         System.out.println( Gx_msg );
         GXv_char14[0] = A396EmprCod ;
         GXv_int13[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char12[0] = A130BarCodPar ;
         GXv_char11[0] = A758ProCod ;
         GXv_int17[0] = A194BarOrdLin ;
         GXv_date6[0] = AV28FecTeo ;
         GXv_decimal9[0] = AV29TieTeo ;
         new app.ppla003(remoteHandle, context).execute( GXv_char14, GXv_int13, GXv_int16, GXv_char12, GXv_char11, GXv_int17, GXv_date6, GXv_decimal9) ;
         pcaltiempoteorico.this.A396EmprCod = GXv_char14[0] ;
         pcaltiempoteorico.this.A129BarCod = GXv_int13[0] ;
         pcaltiempoteorico.this.A132BarCodReo = GXv_int16[0] ;
         pcaltiempoteorico.this.A130BarCodPar = GXv_char12[0] ;
         pcaltiempoteorico.this.A758ProCod = GXv_char11[0] ;
         pcaltiempoteorico.this.A194BarOrdLin = GXv_int17[0] ;
         pcaltiempoteorico.this.AV28FecTeo = GXv_date6[0] ;
         pcaltiempoteorico.this.AV29TieTeo = GXv_decimal9[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcaltiempoteorico.this.A396EmprCod;
      this.aP1[0] = pcaltiempoteorico.this.A129BarCod;
      this.aP2[0] = pcaltiempoteorico.this.A132BarCodReo;
      this.aP3[0] = pcaltiempoteorico.this.A130BarCodPar;
      this.aP4[0] = pcaltiempoteorico.this.A758ProCod;
      this.aP5[0] = pcaltiempoteorico.this.A194BarOrdLin;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P05GB2_A396EmprCod = new String[] {""} ;
      P05GB2_A129BarCod = new int[1] ;
      P05GB2_A132BarCodReo = new byte[1] ;
      P05GB2_A130BarCodPar = new String[] {""} ;
      P05GB2_A758ProCod = new String[] {""} ;
      P05GB2_A194BarOrdLin = new short[1] ;
      P05GB2_A120BarAgrEst = new String[] {""} ;
      P05GB2_A150BarFacTin = new String[] {""} ;
      P05GB2_A457FasCod = new String[] {""} ;
      P05GB2_A603MaqCodBis = new String[] {""} ;
      P05GB2_A252CliCod = new int[1] ;
      P05GB2_n252CliCod = new boolean[] {false} ;
      P05GB2_A212BarSer = new String[] {""} ;
      A120BarAgrEst = "" ;
      A150BarFacTin = "" ;
      A457FasCod = "" ;
      A603MaqCodBis = "" ;
      A212BarSer = "" ;
      AV36barCodPar = "" ;
      AV28FecTeo = GXutil.nullDate() ;
      AV29TieTeo = DecimalUtil.ZERO ;
      AV30Decalaje = DecimalUtil.ZERO ;
      AV32Resto = DecimalUtil.ZERO ;
      AV31T_c = "" ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char10 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_int15 = new long[1] ;
      GXv_int3 = new byte[1] ;
      Gx_msg = "" ;
      GXv_char14 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int16 = new byte[1] ;
      GXv_char12 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int17 = new short[1] ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcaltiempoteorico__default(),
         new Object[] {
             new Object[] {
            P05GB2_A396EmprCod, P05GB2_A129BarCod, P05GB2_A132BarCodReo, P05GB2_A130BarCodPar, P05GB2_A758ProCod, P05GB2_A194BarOrdLin, P05GB2_A120BarAgrEst, P05GB2_A150BarFacTin, P05GB2_A457FasCod, P05GB2_A603MaqCodBis,
            P05GB2_A252CliCod, P05GB2_n252CliCod, P05GB2_A212BarSer
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV35BarCodReo ;
   private byte GXv_int3[] ;
   private byte GXv_int16[] ;
   private short A194BarOrdLin ;
   private short GXv_int17[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV34barCod ;
   private int GXv_int2[] ;
   private int GXv_int13[] ;
   private long GXv_int15[] ;
   private java.math.BigDecimal AV29TieTeo ;
   private java.math.BigDecimal AV30Decalaje ;
   private java.math.BigDecimal AV32Resto ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String A150BarFacTin ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A212BarSer ;
   private String AV36barCodPar ;
   private String AV31T_c ;
   private String GXv_char10[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String Gx_msg ;
   private String GXv_char14[] ;
   private String GXv_char12[] ;
   private String GXv_char11[] ;
   private java.util.Date AV28FecTeo ;
   private java.util.Date GXv_date6[] ;
   private boolean n252CliCod ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05GB2_A396EmprCod ;
   private int[] P05GB2_A129BarCod ;
   private byte[] P05GB2_A132BarCodReo ;
   private String[] P05GB2_A130BarCodPar ;
   private String[] P05GB2_A758ProCod ;
   private short[] P05GB2_A194BarOrdLin ;
   private String[] P05GB2_A120BarAgrEst ;
   private String[] P05GB2_A150BarFacTin ;
   private String[] P05GB2_A457FasCod ;
   private String[] P05GB2_A603MaqCodBis ;
   private int[] P05GB2_A252CliCod ;
   private boolean[] P05GB2_n252CliCod ;
   private String[] P05GB2_A212BarSer ;
}

final  class pcaltiempoteorico__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05GB2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T2.BarAgrEst, T1.BarFacTin, T1.FasCod, T1.MaqCodBis, T2.CliCod, T2.BarSer FROM (TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
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

