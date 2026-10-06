package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalfpd extends GXProcedure
{
   public pcalfpd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalfpd.class ), "" );
   }

   public pcalfpd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pcalfpd.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pcalfpd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcalfpd.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcalfpd.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcalfpd.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV16Despacho ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "DDESPA", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      pcalfpd.this.A396EmprCod = GXv_char2[0] ;
      pcalfpd.this.GXt_int1 = GXv_int4[0] ;
      AV16Despacho = GXt_int1 ;
      GXt_int1 = AV17Transp ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "DTRANS", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int4) ;
      pcalfpd.this.A396EmprCod = GXv_char3[0] ;
      pcalfpd.this.GXt_int1 = GXv_int4[0] ;
      AV17Transp = GXt_int1 ;
      AV20Barpie_n = 100 ;
      /* Using cursor P02T63 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A155BarFecCli = P02T63_A155BarFecCli[0] ;
         A217BarTipArt = P02T63_A217BarTipArt[0] ;
         n217BarTipArt = P02T63_n217BarTipArt[0] ;
         A158BarFecFpr = P02T63_A158BarFecFpr[0] ;
         A199BarPie1 = P02T63_A199BarPie1[0] ;
         A365DisDes = P02T63_A365DisDes[0] ;
         A898BarPieNDes = P02T63_A898BarPieNDes[0] ;
         A199BarPie1 = P02T63_A199BarPie1[0] ;
         A898BarPieNDes = P02T63_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV19barFecCli = A155BarFecCli ;
         AV11barTipArt = A217BarTipArt ;
         AV21FDefinicio = A155BarFecCli ;
         /* Execute user subroutine: 'TIPART' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV19barFecCli = A155BarFecCli ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_int6[0] = A198BarPie ;
         GXv_decimal7[0] = AV12TipArtProd ;
         GXv_date8[0] = AV19barFecCli ;
         GXv_decimal9[0] = AV13Sum_diasp ;
         new app.ppsimop1(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_int6, GXv_decimal7, GXv_date8, GXv_decimal9) ;
         pcalfpd.this.A396EmprCod = GXv_char3[0] ;
         pcalfpd.this.A129BarCod = GXv_int4[0] ;
         pcalfpd.this.A132BarCodReo = GXv_int5[0] ;
         pcalfpd.this.A130BarCodPar = GXv_char2[0] ;
         pcalfpd.this.A198BarPie = GXv_int6[0] ;
         pcalfpd.this.AV12TipArtProd = GXv_decimal7[0] ;
         pcalfpd.this.AV19barFecCli = GXv_date8[0] ;
         pcalfpd.this.AV13Sum_diasp = GXv_decimal9[0] ;
         AV19barFecCli = A155BarFecCli ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int6[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char2[0] = A130BarCodPar ;
         GXv_int4[0] = AV20Barpie_n ;
         GXv_decimal9[0] = AV12TipArtProd ;
         GXv_date8[0] = AV19barFecCli ;
         GXv_decimal7[0] = AV14Sum_dias ;
         new app.ppsimop3(remoteHandle, context).execute( GXv_char3, GXv_int6, GXv_int5, GXv_char2, GXv_int4, GXv_decimal9, GXv_date8, GXv_decimal7) ;
         pcalfpd.this.A396EmprCod = GXv_char3[0] ;
         pcalfpd.this.A129BarCod = GXv_int6[0] ;
         pcalfpd.this.A132BarCodReo = GXv_int5[0] ;
         pcalfpd.this.A130BarCodPar = GXv_char2[0] ;
         pcalfpd.this.AV20Barpie_n = GXv_int4[0] ;
         pcalfpd.this.AV12TipArtProd = GXv_decimal9[0] ;
         pcalfpd.this.AV19barFecCli = GXv_date8[0] ;
         pcalfpd.this.AV14Sum_dias = GXv_decimal7[0] ;
         AV15Sum_diast = AV14Sum_dias.add(AV13Sum_diasp).add(DecimalUtil.doubleToDec(AV16Despacho)).add(DecimalUtil.doubleToDec(AV17Transp)) ;
         AV18Sum_diafdp = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV15Sum_diast))+1) ;
         GXv_char3[0] = A396EmprCod ;
         GXv_date8[0] = AV21FDefinicio ;
         GXv_int10[0] = (short)(DecimalUtil.decToDouble(AV18Sum_diafdp)) ;
         GXv_date11[0] = AV22bARfECeNT ;
         new app.pfpddt(remoteHandle, context).execute( GXv_char3, GXv_date8, GXv_int10, GXv_date11) ;
         pcalfpd.this.A396EmprCod = GXv_char3[0] ;
         pcalfpd.this.AV21FDefinicio = GXv_date8[0] ;
         pcalfpd.this.AV18Sum_diafdp = DecimalUtil.doubleToDec(GXv_int10[0]) ;
         pcalfpd.this.AV22bARfECeNT = GXv_date11[0] ;
         A158BarFecFpr = AV22bARfECeNT ;
         /* Using cursor P02T64 */
         pr_default.execute(1, new Object[] {A158BarFecFpr, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV12TipArtProd = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02T65 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(AV11barTipArt)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A829TipArtCod = P02T65_A829TipArtCod[0] ;
         A7078TipArtProd = P02T65_A7078TipArtProd[0] ;
         n7078TipArtProd = P02T65_n7078TipArtProd[0] ;
         AV12TipArtProd = A7078TipArtProd ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalfpd.this.A396EmprCod;
      this.aP1[0] = pcalfpd.this.A129BarCod;
      this.aP2[0] = pcalfpd.this.A132BarCodReo;
      this.aP3[0] = pcalfpd.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcalfpd");
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
      P02T63_A396EmprCod = new String[] {""} ;
      P02T63_A129BarCod = new int[1] ;
      P02T63_A132BarCodReo = new byte[1] ;
      P02T63_A130BarCodPar = new String[] {""} ;
      P02T63_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P02T63_A217BarTipArt = new short[1] ;
      P02T63_n217BarTipArt = new boolean[] {false} ;
      P02T63_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P02T63_A199BarPie1 = new short[1] ;
      P02T63_A365DisDes = new String[] {""} ;
      P02T63_A898BarPieNDes = new int[1] ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A365DisDes = "" ;
      AV19barFecCli = GXutil.nullDate() ;
      AV21FDefinicio = GXutil.nullDate() ;
      AV12TipArtProd = DecimalUtil.ZERO ;
      AV13Sum_diasp = DecimalUtil.ZERO ;
      GXv_int6 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV14Sum_dias = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV15Sum_diast = DecimalUtil.ZERO ;
      AV18Sum_diafdp = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_int10 = new short[1] ;
      AV22bARfECeNT = GXutil.nullDate() ;
      GXv_date11 = new java.util.Date[1] ;
      P02T65_A396EmprCod = new String[] {""} ;
      P02T65_A829TipArtCod = new short[1] ;
      P02T65_A7078TipArtProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02T65_n7078TipArtProd = new boolean[] {false} ;
      A7078TipArtProd = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcalfpd__default(),
         new Object[] {
             new Object[] {
            P02T63_A396EmprCod, P02T63_A129BarCod, P02T63_A132BarCodReo, P02T63_A130BarCodPar, P02T63_A155BarFecCli, P02T63_A217BarTipArt, P02T63_n217BarTipArt, P02T63_A158BarFecFpr, P02T63_A199BarPie1, P02T63_A365DisDes,
            P02T63_A898BarPieNDes
            }
            , new Object[] {
            }
            , new Object[] {
            P02T65_A396EmprCod, P02T65_A829TipArtCod, P02T65_A7078TipArtProd, P02T65_n7078TipArtProd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int5[] ;
   private short A217BarTipArt ;
   private short A199BarPie1 ;
   private short AV11barTipArt ;
   private short GXv_int10[] ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV16Despacho ;
   private int AV17Transp ;
   private int GXt_int1 ;
   private int AV20Barpie_n ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int GXv_int6[] ;
   private int GXv_int4[] ;
   private java.math.BigDecimal AV12TipArtProd ;
   private java.math.BigDecimal AV13Sum_diasp ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV14Sum_dias ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV15Sum_diast ;
   private java.math.BigDecimal AV18Sum_diafdp ;
   private java.math.BigDecimal A7078TipArtProd ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A365DisDes ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date AV19barFecCli ;
   private java.util.Date AV21FDefinicio ;
   private java.util.Date GXv_date8[] ;
   private java.util.Date AV22bARfECeNT ;
   private java.util.Date GXv_date11[] ;
   private boolean n217BarTipArt ;
   private boolean returnInSub ;
   private boolean n7078TipArtProd ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02T63_A396EmprCod ;
   private int[] P02T63_A129BarCod ;
   private byte[] P02T63_A132BarCodReo ;
   private String[] P02T63_A130BarCodPar ;
   private java.util.Date[] P02T63_A155BarFecCli ;
   private short[] P02T63_A217BarTipArt ;
   private boolean[] P02T63_n217BarTipArt ;
   private java.util.Date[] P02T63_A158BarFecFpr ;
   private short[] P02T63_A199BarPie1 ;
   private String[] P02T63_A365DisDes ;
   private int[] P02T63_A898BarPieNDes ;
   private String[] P02T65_A396EmprCod ;
   private short[] P02T65_A829TipArtCod ;
   private java.math.BigDecimal[] P02T65_A7078TipArtProd ;
   private boolean[] P02T65_n7078TipArtProd ;
}

final  class pcalfpd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02T63", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFecCli, T1.BarTipArt, T1.BarFecFpr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02T64", "UPDATE TXPBARCAD SET BarFecFpr=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P02T65", "SELECT EmprCod, TipArtCod, TipArtProd FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
            case 1 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

