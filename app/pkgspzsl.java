package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkgspzsl extends GXProcedure
{
   public pkgspzsl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkgspzsl.class ), "" );
   }

   public pkgspzsl( int remoteHandle ,
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
                          int[] aP8 )
   {
      pkgspzsl.this.aP9 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        int[] aP8 ,
                        int[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 )
   {
      pkgspzsl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkgspzsl.this.AV30Barcod = aP1[0];
      this.aP1 = aP1;
      pkgspzsl.this.AV31Barcodreo = aP2[0];
      this.aP2 = aP2;
      pkgspzsl.this.AV32Barcodpar = aP3[0];
      this.aP3 = aP3;
      pkgspzsl.this.AV15Metros = aP4[0];
      this.aP4 = aP4;
      pkgspzsl.this.AV16Metros2 = aP5[0];
      this.aP5 = aP5;
      pkgspzsl.this.AV17BarKgm = aP6[0];
      this.aP6 = aP6;
      pkgspzsl.this.AV18BarKgm2 = aP7[0];
      this.aP7 = aP7;
      pkgspzsl.this.AV19PzasLan = aP8[0];
      this.aP8 = aP8;
      pkgspzsl.this.AV20PzasLan2 = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Metros = DecimalUtil.ZERO ;
      AV17BarKgm = DecimalUtil.ZERO ;
      AV19PzasLan = 0 ;
      AV33Kgm_r = DecimalUtil.doubleToDec(0) ;
      AV34Pzs_r = 0 ;
      AV35Num_r = 0 ;
      /* Using cursor P04EV3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV30Barcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P04EV3_A213BarSit[0] ;
         A148BarEstReo = P04EV3_A148BarEstReo[0] ;
         A129BarCod = P04EV3_A129BarCod[0] ;
         A130BarCodPar = P04EV3_A130BarCodPar[0] ;
         A132BarCodReo = P04EV3_A132BarCodReo[0] ;
         A166BarKgm = P04EV3_A166BarKgm[0] ;
         A199BarPie1 = P04EV3_A199BarPie1[0] ;
         A365DisDes = P04EV3_A365DisDes[0] ;
         A898BarPieNDes = P04EV3_A898BarPieNDes[0] ;
         A166BarKgm = P04EV3_A166BarKgm[0] ;
         A199BarPie1 = P04EV3_A199BarPie1[0] ;
         A898BarPieNDes = P04EV3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV33Kgm_r = AV33Kgm_r.add(A166BarKgm) ;
         AV34Pzs_r = (int)(AV34Pzs_r+A198BarPie) ;
         AV35Num_r = (int)(AV35Num_r+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV35Num_r > 0 )
      {
         Gx_msg = httpContext.getMessage( "Atencion. El sistema ha detectado que la OP", "") + GXutil.newLine( ) + httpContext.getMessage( "a despachar, tiene REPROCESOS INTERNOS activos", "") + GXutil.newLine( ) + httpContext.getMessage( "Los Kgs a descontar seran ", "") + GXutil.str( AV33Kgm_r, 9, 2) + GXutil.newLine( ) + httpContext.getMessage( "y las Unidades a descontar seran ", "") + GXutil.str( AV34Pzs_r, 6, 0) + GXutil.newLine( ) ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      AV22BarKgm1 = DecimalUtil.doubleToDec(0) ;
      AV23PzasLan1 = 0 ;
      AV20PzasLan2 = 0 ;
      AV18BarKgm2 = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P04EV4 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV30Barcod), Byte.valueOf(AV31Barcodreo), AV32Barcodpar});
      c203BarPieKil = P04EV4_A203BarPieKil[0] ;
      c1501BarPiePie = P04EV4_A1501BarPiePie[0] ;
      c1271BarPieLzd = P04EV4_A1271BarPieLzd[0] ;
      c170BarKilLan = P04EV4_A170BarKilLan[0] ;
      pr_default.close(1);
      AV22BarKgm1 = AV22BarKgm1.add(c203BarPieKil) ;
      AV23PzasLan1 = (int)(AV23PzasLan1+c1501BarPiePie) ;
      AV20PzasLan2 = (int)(AV20PzasLan2+c1271BarPieLzd) ;
      AV18BarKgm2 = AV18BarKgm2.add(c170BarKilLan) ;
      /* End optimized group. */
      AV19PzasLan = (int)(AV23PzasLan1-AV20PzasLan2) ;
      AV17BarKgm = AV22BarKgm1.subtract(AV18BarKgm2) ;
      AV28Su_und = 0 ;
      /* Optimized group. */
      /* Using cursor P04EV5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV30Barcod), Byte.valueOf(AV31Barcodreo), AV32Barcodpar});
      c7563Su_Und = P04EV5_A7563Su_Und[0] ;
      n7563Su_Und = P04EV5_n7563Su_Und[0] ;
      pr_default.close(2);
      AV28Su_und = (int)(AV28Su_und+c7563Su_Und) ;
      /* End optimized group. */
      AV19PzasLan = (int)(AV19PzasLan-AV28Su_und) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkgspzsl.this.A396EmprCod;
      this.aP1[0] = pkgspzsl.this.AV30Barcod;
      this.aP2[0] = pkgspzsl.this.AV31Barcodreo;
      this.aP3[0] = pkgspzsl.this.AV32Barcodpar;
      this.aP4[0] = pkgspzsl.this.AV15Metros;
      this.aP5[0] = pkgspzsl.this.AV16Metros2;
      this.aP6[0] = pkgspzsl.this.AV17BarKgm;
      this.aP7[0] = pkgspzsl.this.AV18BarKgm2;
      this.aP8[0] = pkgspzsl.this.AV19PzasLan;
      this.aP9[0] = pkgspzsl.this.AV20PzasLan2;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33Kgm_r = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P04EV3_A396EmprCod = new String[] {""} ;
      P04EV3_A213BarSit = new byte[1] ;
      P04EV3_A148BarEstReo = new byte[1] ;
      P04EV3_A129BarCod = new int[1] ;
      P04EV3_A130BarCodPar = new String[] {""} ;
      P04EV3_A132BarCodReo = new byte[1] ;
      P04EV3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04EV3_A199BarPie1 = new short[1] ;
      P04EV3_A365DisDes = new String[] {""} ;
      P04EV3_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      Gx_msg = "" ;
      AV22BarKgm1 = DecimalUtil.ZERO ;
      c203BarPieKil = DecimalUtil.ZERO ;
      c170BarKilLan = DecimalUtil.ZERO ;
      P04EV4_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04EV4_A1501BarPiePie = new int[1] ;
      P04EV4_A1271BarPieLzd = new int[1] ;
      P04EV4_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04EV5_A7563Su_Und = new int[1] ;
      P04EV5_n7563Su_Und = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkgspzsl__default(),
         new Object[] {
             new Object[] {
            P04EV3_A396EmprCod, P04EV3_A213BarSit, P04EV3_A148BarEstReo, P04EV3_A129BarCod, P04EV3_A130BarCodPar, P04EV3_A132BarCodReo, P04EV3_A166BarKgm, P04EV3_A199BarPie1, P04EV3_A365DisDes, P04EV3_A898BarPieNDes
            }
            , new Object[] {
            P04EV4_A203BarPieKil, P04EV4_A1501BarPiePie, P04EV4_A1271BarPieLzd, P04EV4_A170BarKilLan
            }
            , new Object[] {
            P04EV5_A7563Su_Und, P04EV5_n7563Su_Und
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV31Barcodreo ;
   private byte A213BarSit ;
   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV30Barcod ;
   private int AV19PzasLan ;
   private int AV20PzasLan2 ;
   private int AV34Pzs_r ;
   private int AV35Num_r ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV23PzasLan1 ;
   private int c1501BarPiePie ;
   private int c1271BarPieLzd ;
   private int AV28Su_und ;
   private int c7563Su_Und ;
   private java.math.BigDecimal AV15Metros ;
   private java.math.BigDecimal AV16Metros2 ;
   private java.math.BigDecimal AV17BarKgm ;
   private java.math.BigDecimal AV18BarKgm2 ;
   private java.math.BigDecimal AV33Kgm_r ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV22BarKgm1 ;
   private java.math.BigDecimal c203BarPieKil ;
   private java.math.BigDecimal c170BarKilLan ;
   private String A396EmprCod ;
   private String AV32Barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String Gx_msg ;
   private boolean n7563Su_Und ;
   private int[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private int[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P04EV3_A396EmprCod ;
   private byte[] P04EV3_A213BarSit ;
   private byte[] P04EV3_A148BarEstReo ;
   private int[] P04EV3_A129BarCod ;
   private String[] P04EV3_A130BarCodPar ;
   private byte[] P04EV3_A132BarCodReo ;
   private java.math.BigDecimal[] P04EV3_A166BarKgm ;
   private short[] P04EV3_A199BarPie1 ;
   private String[] P04EV3_A365DisDes ;
   private int[] P04EV3_A898BarPieNDes ;
   private java.math.BigDecimal[] P04EV4_A203BarPieKil ;
   private int[] P04EV4_A1501BarPiePie ;
   private int[] P04EV4_A1271BarPieLzd ;
   private java.math.BigDecimal[] P04EV4_A170BarKilLan ;
   private int[] P04EV5_A7563Su_Und ;
   private boolean[] P04EV5_n7563Su_Und ;
}

final  class pkgspzsl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04EV3", "SELECT T1.EmprCod, T1.BarSit, T1.BarEstReo, T1.BarCod, T1.BarCodPar, T1.BarCodReo, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.BarCod = ?) AND (T1.BarSit < 9) AND (T1.BarEstReo = 1) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04EV4", "SELECT SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, SUM(BarPieLzd), SUM(BarKilLan) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04EV5", "SELECT SUM(Su_Und) FROM TXPSU0001 WHERE EmprCod = ? and Su_Barcod = ? and Su_Barreo = ? and Su_Barpar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

