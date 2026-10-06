package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkgltib extends GXProcedure
{
   public pkgltib( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkgltib.class ), "" );
   }

   public pkgltib( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            java.util.Date[] aP1 ,
                            int[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 ,
                            short[] aP5 )
   {
      pkgltib.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 )
   {
      pkgltib.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkgltib.this.AV8Fecha = aP1[0];
      this.aP1 = aP1;
      pkgltib.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pkgltib.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pkgltib.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pkgltib.this.AV15LanBroDia = aP5[0];
      this.aP5 = aP5;
      pkgltib.this.AV16MaxConLan = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00OV3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A146BarEst = P00OV3_A146BarEst[0] ;
         A1003BarFecLan = P00OV3_A1003BarFecLan[0] ;
         n1003BarFecLan = P00OV3_n1003BarFecLan[0] ;
         A2010BarTipDis = P00OV3_A2010BarTipDis[0] ;
         A180BarMaqCod = P00OV3_A180BarMaqCod[0] ;
         A159BarFecGen = P00OV3_A159BarFecGen[0] ;
         A2447BarFecEnE = P00OV3_A2447BarFecEnE[0] ;
         A142BarDiaP = P00OV3_A142BarDiaP[0] ;
         A212BarSer = P00OV3_A212BarSer[0] ;
         A158BarFecFpr = P00OV3_A158BarFecFpr[0] ;
         A2442BarBulEnE = P00OV3_A2442BarBulEnE[0] ;
         n2442BarBulEnE = P00OV3_n2442BarBulEnE[0] ;
         A166BarKgm = P00OV3_A166BarKgm[0] ;
         A199BarPie1 = P00OV3_A199BarPie1[0] ;
         A365DisDes = P00OV3_A365DisDes[0] ;
         A898BarPieNDes = P00OV3_A898BarPieNDes[0] ;
         A166BarKgm = P00OV3_A166BarKgm[0] ;
         A199BarPie1 = P00OV3_A199BarPie1[0] ;
         A898BarPieNDes = P00OV3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A1003BarFecLan)) || ( A146BarEst == 1 ) )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_date2[0] = AV8Fecha ;
            GXv_decimal3[0] = A166BarKgm ;
            GXv_int4[0] = (short)(A198BarPie) ;
            GXv_char5[0] = A2010BarTipDis ;
            GXv_char6[0] = A180BarMaqCod ;
            GXv_int7[0] = A129BarCod ;
            GXv_int8[0] = A132BarCodReo ;
            GXv_char9[0] = A130BarCodPar ;
            new app.pnewkgl(remoteHandle, context).execute( GXv_char1, GXv_date2, GXv_decimal3, GXv_int4, GXv_char5, GXv_char6, GXv_int7, GXv_int8, GXv_char9) ;
            pkgltib.this.A396EmprCod = GXv_char1[0] ;
            pkgltib.this.AV8Fecha = GXv_date2[0] ;
            pkgltib.this.A166BarKgm = GXv_decimal3[0] ;
            pkgltib.this.A198BarPie = GXv_int4[0] ;
            pkgltib.this.A2010BarTipDis = GXv_char5[0] ;
            pkgltib.this.A180BarMaqCod = GXv_char6[0] ;
            pkgltib.this.A129BarCod = GXv_int7[0] ;
            pkgltib.this.A132BarCodReo = GXv_int8[0] ;
            pkgltib.this.A130BarCodPar = GXv_char9[0] ;
            if ( ! (0==AV15LanBroDia) && ( A898BarPieNDes >= AV16MaxConLan ) )
            {
               AV11Totdias = AV15LanBroDia ;
               AV13FecCC = A159BarFecGen ;
               A2447BarFecEnE = A159BarFecGen ;
            }
            else
            {
               AV11Totdias = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( A142BarDiaP, 0))) ;
               if ( GXutil.strcmp(GXutil.substring( A212BarSer, 1, 2), httpContext.getMessage( "CT", "")) == 0 )
               {
                  AV11Totdias = (short)(AV11Totdias-3) ;
               }
               AV13FecCC = AV8Fecha ;
               A2447BarFecEnE = AV8Fecha ;
            }
            AV12NDias = (short)(0) ;
            if ( AV11Totdias < 0 )
            {
               AV11Totdias = (short)(0) ;
            }
            while ( AV12NDias != AV11Totdias )
            {
               GXv_char9[0] = A396EmprCod ;
               GXv_date2[0] = AV13FecCC ;
               GXv_date10[0] = AV14FecCompCli ;
               new app.pfeclan(remoteHandle, context).execute( GXv_char9, GXv_date2, GXv_date10) ;
               pkgltib.this.A396EmprCod = GXv_char9[0] ;
               pkgltib.this.AV13FecCC = GXv_date2[0] ;
               pkgltib.this.AV14FecCompCli = GXv_date10[0] ;
               AV12NDias = (short)(AV12NDias+1) ;
               AV13FecCC = AV14FecCompCli ;
            }
            A158BarFecFpr = AV14FecCompCli ;
            A1003BarFecLan = AV8Fecha ;
            n1003BarFecLan = false ;
            A146BarEst = (byte)(0) ;
            A2442BarBulEnE = AV11Totdias ;
            n2442BarBulEnE = false ;
         }
         /* Using cursor P00OV4 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A146BarEst), Boolean.valueOf(n1003BarFecLan), A1003BarFecLan, A2447BarFecEnE, A158BarFecFpr, Boolean.valueOf(n2442BarBulEnE), Short.valueOf(A2442BarBulEnE), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkgltib.this.A396EmprCod;
      this.aP1[0] = pkgltib.this.AV8Fecha;
      this.aP2[0] = pkgltib.this.A129BarCod;
      this.aP3[0] = pkgltib.this.A132BarCodReo;
      this.aP4[0] = pkgltib.this.A130BarCodPar;
      this.aP5[0] = pkgltib.this.AV15LanBroDia;
      this.aP6[0] = pkgltib.this.AV16MaxConLan;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkgltib");
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
      P00OV3_A396EmprCod = new String[] {""} ;
      P00OV3_A129BarCod = new int[1] ;
      P00OV3_A132BarCodReo = new byte[1] ;
      P00OV3_A130BarCodPar = new String[] {""} ;
      P00OV3_A146BarEst = new byte[1] ;
      P00OV3_A1003BarFecLan = new java.util.Date[] {GXutil.nullDate()} ;
      P00OV3_n1003BarFecLan = new boolean[] {false} ;
      P00OV3_A2010BarTipDis = new String[] {""} ;
      P00OV3_A180BarMaqCod = new String[] {""} ;
      P00OV3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P00OV3_A2447BarFecEnE = new java.util.Date[] {GXutil.nullDate()} ;
      P00OV3_A142BarDiaP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OV3_A212BarSer = new String[] {""} ;
      P00OV3_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P00OV3_A2442BarBulEnE = new short[1] ;
      P00OV3_n2442BarBulEnE = new boolean[] {false} ;
      P00OV3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00OV3_A199BarPie1 = new short[1] ;
      P00OV3_A365DisDes = new String[] {""} ;
      P00OV3_A898BarPieNDes = new int[1] ;
      A1003BarFecLan = GXutil.nullDate() ;
      A2010BarTipDis = "" ;
      A180BarMaqCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A2447BarFecEnE = GXutil.nullDate() ;
      A142BarDiaP = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      GXv_char1 = new String[1] ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      GXv_int4 = new short[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new byte[1] ;
      AV13FecCC = GXutil.nullDate() ;
      GXv_char9 = new String[1] ;
      GXv_date2 = new java.util.Date[1] ;
      AV14FecCompCli = GXutil.nullDate() ;
      GXv_date10 = new java.util.Date[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkgltib__default(),
         new Object[] {
             new Object[] {
            P00OV3_A396EmprCod, P00OV3_A129BarCod, P00OV3_A132BarCodReo, P00OV3_A130BarCodPar, P00OV3_A146BarEst, P00OV3_A1003BarFecLan, P00OV3_n1003BarFecLan, P00OV3_A2010BarTipDis, P00OV3_A180BarMaqCod, P00OV3_A159BarFecGen,
            P00OV3_A2447BarFecEnE, P00OV3_A142BarDiaP, P00OV3_A212BarSer, P00OV3_A158BarFecFpr, P00OV3_A2442BarBulEnE, P00OV3_n2442BarBulEnE, P00OV3_A166BarKgm, P00OV3_A199BarPie1, P00OV3_A365DisDes, P00OV3_A898BarPieNDes
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A146BarEst ;
   private byte GXv_int8[] ;
   private short AV15LanBroDia ;
   private short AV16MaxConLan ;
   private short A2442BarBulEnE ;
   private short A199BarPie1 ;
   private short GXv_int4[] ;
   private short AV11Totdias ;
   private short AV12NDias ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int GXv_int7[] ;
   private java.math.BigDecimal A142BarDiaP ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A2010BarTipDis ;
   private String A180BarMaqCod ;
   private String A212BarSer ;
   private String A365DisDes ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String GXv_char9[] ;
   private java.util.Date AV8Fecha ;
   private java.util.Date A1003BarFecLan ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A2447BarFecEnE ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date AV13FecCC ;
   private java.util.Date GXv_date2[] ;
   private java.util.Date AV14FecCompCli ;
   private java.util.Date GXv_date10[] ;
   private boolean n1003BarFecLan ;
   private boolean n2442BarBulEnE ;
   private short[] aP6 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00OV3_A396EmprCod ;
   private int[] P00OV3_A129BarCod ;
   private byte[] P00OV3_A132BarCodReo ;
   private String[] P00OV3_A130BarCodPar ;
   private byte[] P00OV3_A146BarEst ;
   private java.util.Date[] P00OV3_A1003BarFecLan ;
   private boolean[] P00OV3_n1003BarFecLan ;
   private String[] P00OV3_A2010BarTipDis ;
   private String[] P00OV3_A180BarMaqCod ;
   private java.util.Date[] P00OV3_A159BarFecGen ;
   private java.util.Date[] P00OV3_A2447BarFecEnE ;
   private java.math.BigDecimal[] P00OV3_A142BarDiaP ;
   private String[] P00OV3_A212BarSer ;
   private java.util.Date[] P00OV3_A158BarFecFpr ;
   private short[] P00OV3_A2442BarBulEnE ;
   private boolean[] P00OV3_n2442BarBulEnE ;
   private java.math.BigDecimal[] P00OV3_A166BarKgm ;
   private short[] P00OV3_A199BarPie1 ;
   private String[] P00OV3_A365DisDes ;
   private int[] P00OV3_A898BarPieNDes ;
}

final  class pkgltib__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00OV3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarEst, T1.BarFecLan, T1.BarTipDis, T1.BarMaqCod, T1.BarFecGen, T1.BarFecEnE, T1.BarDiaP, T1.BarSer, T1.BarFecFpr, T1.BarBulEnE, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00OV4", "UPDATE TXPBARCAD SET BarEst=?, BarFecLan=?, BarFecEnE=?, BarFecFpr=?, BarBulEnE=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,1);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((int[]) buf[19])[0] = rslt.getInt(18);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[2]);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setDate(4, (java.util.Date)parms[4]);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               stmt.setString(6, (String)parms[7], 3);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               stmt.setString(9, (String)parms[10], 1);
               return;
      }
   }

}

