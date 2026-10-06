package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc33 extends GXProcedure
{
   public pprc33( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc33.class ), "" );
   }

   public pprc33( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          java.math.BigDecimal[] aP4 ,
                          java.math.BigDecimal[] aP5 ,
                          java.math.BigDecimal[] aP6 ,
                          java.math.BigDecimal[] aP7 ,
                          java.math.BigDecimal[] aP8 ,
                          java.math.BigDecimal[] aP9 ,
                          java.math.BigDecimal[] aP10 ,
                          java.math.BigDecimal[] aP11 )
   {
      pprc33.this.aP12 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        int[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             int[] aP12 )
   {
      pprc33.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc33.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      pprc33.this.AV9Barcodreo = aP2[0];
      this.aP2 = aP2;
      pprc33.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      pprc33.this.AV11Costefab = aP4[0];
      this.aP4 = aP4;
      pprc33.this.AV18Coste_p = aP5[0];
      this.aP5 = aP5;
      pprc33.this.AV13mAgua = aP6[0];
      this.aP6 = aP6;
      pprc33.this.AV14menergia = aP7[0];
      this.aP7 = aP7;
      pprc33.this.AV15mgas = aP8[0];
      this.aP8 = aP8;
      pprc33.this.AV16mmod = aP9[0];
      this.aP9 = aP9;
      pprc33.this.AV17mmoi = aP10[0];
      this.aP10 = aP10;
      pprc33.this.AV19kgsHdr = aP11[0];
      this.aP11 = aP11;
      pprc33.this.AV20pzsHdr = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05CY3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P05CY3_A130BarCodPar[0] ;
         A132BarCodReo = P05CY3_A132BarCodReo[0] ;
         A129BarCod = P05CY3_A129BarCod[0] ;
         A228BarUniMed = P05CY3_A228BarUniMed[0] ;
         A140BarCosAny = P05CY3_A140BarCosAny[0] ;
         A141BarCosPro = P05CY3_A141BarCosPro[0] ;
         A166BarKgm = P05CY3_A166BarKgm[0] ;
         A184BarMtr = P05CY3_A184BarMtr[0] ;
         A199BarPie1 = P05CY3_A199BarPie1[0] ;
         A365DisDes = P05CY3_A365DisDes[0] ;
         A898BarPieNDes = P05CY3_A898BarPieNDes[0] ;
         A166BarKgm = P05CY3_A166BarKgm[0] ;
         A184BarMtr = P05CY3_A184BarMtr[0] ;
         A199BarPie1 = P05CY3_A199BarPie1[0] ;
         A898BarPieNDes = P05CY3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char5[0] = A228BarUniMed ;
         GXv_decimal6[0] = A166BarKgm ;
         GXv_decimal7[0] = A184BarMtr ;
         GXv_decimal8[0] = AV11Costefab ;
         GXv_decimal9[0] = AV12CosteTeo ;
         GXv_decimal10[0] = AV13mAgua ;
         GXv_decimal11[0] = AV14menergia ;
         GXv_decimal12[0] = AV15mgas ;
         GXv_decimal13[0] = AV16mmod ;
         GXv_decimal14[0] = AV17mmoi ;
         GXv_int15[0] = (byte)(0) ;
         new app.puti006(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_int15) ;
         pprc33.this.A396EmprCod = GXv_char1[0] ;
         pprc33.this.A129BarCod = GXv_int2[0] ;
         pprc33.this.A132BarCodReo = GXv_int3[0] ;
         pprc33.this.A130BarCodPar = GXv_char4[0] ;
         pprc33.this.A228BarUniMed = GXv_char5[0] ;
         pprc33.this.A166BarKgm = GXv_decimal6[0] ;
         pprc33.this.A184BarMtr = GXv_decimal7[0] ;
         pprc33.this.AV11Costefab = GXv_decimal8[0] ;
         pprc33.this.AV12CosteTeo = GXv_decimal9[0] ;
         pprc33.this.AV13mAgua = GXv_decimal10[0] ;
         pprc33.this.AV14menergia = GXv_decimal11[0] ;
         pprc33.this.AV15mgas = GXv_decimal12[0] ;
         pprc33.this.AV16mmod = GXv_decimal13[0] ;
         pprc33.this.AV17mmoi = GXv_decimal14[0] ;
         AV18Coste_p = A141BarCosPro.add(A140BarCosAny) ;
         AV19kgsHdr = A166BarKgm ;
         AV20pzsHdr = A198BarPie ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc33.this.A396EmprCod;
      this.aP1[0] = pprc33.this.AV8Barcod;
      this.aP2[0] = pprc33.this.AV9Barcodreo;
      this.aP3[0] = pprc33.this.AV10Barcodpar;
      this.aP4[0] = pprc33.this.AV11Costefab;
      this.aP5[0] = pprc33.this.AV18Coste_p;
      this.aP6[0] = pprc33.this.AV13mAgua;
      this.aP7[0] = pprc33.this.AV14menergia;
      this.aP8[0] = pprc33.this.AV15mgas;
      this.aP9[0] = pprc33.this.AV16mmod;
      this.aP10[0] = pprc33.this.AV17mmoi;
      this.aP11[0] = pprc33.this.AV19kgsHdr;
      this.aP12[0] = pprc33.this.AV20pzsHdr;
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
      P05CY3_A396EmprCod = new String[] {""} ;
      P05CY3_A130BarCodPar = new String[] {""} ;
      P05CY3_A132BarCodReo = new byte[1] ;
      P05CY3_A129BarCod = new int[1] ;
      P05CY3_A228BarUniMed = new String[] {""} ;
      P05CY3_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05CY3_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05CY3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05CY3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05CY3_A199BarPie1 = new short[1] ;
      P05CY3_A365DisDes = new String[] {""} ;
      P05CY3_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A228BarUniMed = "" ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV12CosteTeo = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int15 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc33__default(),
         new Object[] {
             new Object[] {
            P05CY3_A396EmprCod, P05CY3_A130BarCodPar, P05CY3_A132BarCodReo, P05CY3_A129BarCod, P05CY3_A228BarUniMed, P05CY3_A140BarCosAny, P05CY3_A141BarCosPro, P05CY3_A166BarKgm, P05CY3_A184BarMtr, P05CY3_A199BarPie1,
            P05CY3_A365DisDes, P05CY3_A898BarPieNDes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Barcodreo ;
   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private byte GXv_int15[] ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int AV20pzsHdr ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int GXv_int2[] ;
   private java.math.BigDecimal AV11Costefab ;
   private java.math.BigDecimal AV18Coste_p ;
   private java.math.BigDecimal AV13mAgua ;
   private java.math.BigDecimal AV14menergia ;
   private java.math.BigDecimal AV15mgas ;
   private java.math.BigDecimal AV16mmod ;
   private java.math.BigDecimal AV17mmoi ;
   private java.math.BigDecimal AV19kgsHdr ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV12CosteTeo ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A228BarUniMed ;
   private String A365DisDes ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private int[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P05CY3_A396EmprCod ;
   private String[] P05CY3_A130BarCodPar ;
   private byte[] P05CY3_A132BarCodReo ;
   private int[] P05CY3_A129BarCod ;
   private String[] P05CY3_A228BarUniMed ;
   private java.math.BigDecimal[] P05CY3_A140BarCosAny ;
   private java.math.BigDecimal[] P05CY3_A141BarCosPro ;
   private java.math.BigDecimal[] P05CY3_A166BarKgm ;
   private java.math.BigDecimal[] P05CY3_A184BarMtr ;
   private short[] P05CY3_A199BarPie1 ;
   private String[] P05CY3_A365DisDes ;
   private int[] P05CY3_A898BarPieNDes ;
}

final  class pprc33__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05CY3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarUniMed, T1.BarCosAny, T1.BarCosPro, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((int[]) buf[11])[0] = rslt.getInt(12);
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
               return;
      }
   }

}

