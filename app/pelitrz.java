package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelitrz extends GXProcedure
{
   public pelitrz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelitrz.class ), "" );
   }

   public pelitrz( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 ,
                                           short[] aP5 ,
                                           long[] aP6 )
   {
      pelitrz.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        long[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             long[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      pelitrz.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelitrz.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pelitrz.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pelitrz.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pelitrz.this.A200BarPieCod = aP4[0];
      this.aP4 = aP4;
      pelitrz.this.A3858BarTroCod = aP5[0];
      this.aP5 = aP5;
      pelitrz.this.A30AlbProCod = aP6[0];
      this.aP6 = aP6;
      pelitrz.this.AV8Metros = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P00WB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
      /* End optimized DELETE. */
      n3864BarTroEst = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00WB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A3858BarTroCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARTRO");
      /* End optimized UPDATE. */
      /* Using cursor P00WB4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1270AlbPMtrEnt = P00WB4_A1270AlbPMtrEnt[0] ;
         A228BarUniMed = P00WB4_A228BarUniMed[0] ;
         A864BarPes = P00WB4_A864BarPes[0] ;
         A27AlbPKilEnt = P00WB4_A27AlbPKilEnt[0] ;
         A228BarUniMed = P00WB4_A228BarUniMed[0] ;
         A864BarPes = P00WB4_A864BarPes[0] ;
         A1270AlbPMtrEnt = A1270AlbPMtrEnt.subtract(AV8Metros) ;
         if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 )
         {
         }
         else
         {
            A27AlbPKilEnt = A1270AlbPMtrEnt.multiply(DecimalUtil.doubleToDec(A864BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         if ( A1270AlbPMtrEnt.doubleValue() <= 0 )
         {
            A27AlbPKilEnt = DecimalUtil.doubleToDec(0) ;
         }
         /* Using cursor P00WB5 */
         pr_default.execute(3, new Object[] {A1270AlbPMtrEnt, A27AlbPKilEnt, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor P00WB6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A183BarMetLan = P00WB6_A183BarMetLan[0] ;
         A170BarKilLan = P00WB6_A170BarKilLan[0] ;
         A201BarPieEst = P00WB6_A201BarPieEst[0] ;
         /* Using cursor P00WB7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A228BarUniMed = P00WB7_A228BarUniMed[0] ;
         A864BarPes = P00WB7_A864BarPes[0] ;
         A213BarSit = P00WB7_A213BarSit[0] ;
         A183BarMetLan = A183BarMetLan.subtract(AV8Metros) ;
         if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 )
         {
         }
         else
         {
            A170BarKilLan = A183BarMetLan.multiply(DecimalUtil.doubleToDec(A864BarPes)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         if ( A183BarMetLan.doubleValue() <= 0 )
         {
            A170BarKilLan = DecimalUtil.doubleToDec(0) ;
         }
         if ( A201BarPieEst == 1 )
         {
            A201BarPieEst = (byte)(0) ;
            if ( A213BarSit == 9 )
            {
               A213BarSit = (byte)(6) ;
            }
         }
         /* Using cursor P00WB8 */
         pr_default.execute(6, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Using cursor P00WB9 */
         pr_default.execute(7, new Object[] {A183BarMetLan, A170BarKilLan, Byte.valueOf(A201BarPieEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      pr_default.close(5);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelitrz.this.A396EmprCod;
      this.aP1[0] = pelitrz.this.A129BarCod;
      this.aP2[0] = pelitrz.this.A132BarCodReo;
      this.aP3[0] = pelitrz.this.A130BarCodPar;
      this.aP4[0] = pelitrz.this.A200BarPieCod;
      this.aP5[0] = pelitrz.this.A3858BarTroCod;
      this.aP6[0] = pelitrz.this.A30AlbProCod;
      this.aP7[0] = pelitrz.this.AV8Metros;
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
      P00WB4_A396EmprCod = new String[] {""} ;
      P00WB4_A30AlbProCod = new long[1] ;
      P00WB4_A129BarCod = new int[1] ;
      P00WB4_A132BarCodReo = new byte[1] ;
      P00WB4_A130BarCodPar = new String[] {""} ;
      P00WB4_A200BarPieCod = new String[] {""} ;
      P00WB4_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WB4_A228BarUniMed = new String[] {""} ;
      P00WB4_A864BarPes = new short[1] ;
      P00WB4_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      P00WB6_A396EmprCod = new String[] {""} ;
      P00WB6_A129BarCod = new int[1] ;
      P00WB6_A132BarCodReo = new byte[1] ;
      P00WB6_A130BarCodPar = new String[] {""} ;
      P00WB6_A200BarPieCod = new String[] {""} ;
      P00WB6_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WB6_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WB6_A201BarPieEst = new byte[1] ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      P00WB7_A228BarUniMed = new String[] {""} ;
      P00WB7_A864BarPes = new short[1] ;
      P00WB7_A213BarSit = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelitrz__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00WB4_A396EmprCod, P00WB4_A30AlbProCod, P00WB4_A129BarCod, P00WB4_A132BarCodReo, P00WB4_A130BarCodPar, P00WB4_A200BarPieCod, P00WB4_A1270AlbPMtrEnt, P00WB4_A228BarUniMed, P00WB4_A864BarPes, P00WB4_A27AlbPKilEnt
            }
            , new Object[] {
            }
            , new Object[] {
            P00WB6_A396EmprCod, P00WB6_A129BarCod, P00WB6_A132BarCodReo, P00WB6_A130BarCodPar, P00WB6_A200BarPieCod, P00WB6_A183BarMetLan, P00WB6_A170BarKilLan, P00WB6_A201BarPieEst
            }
            , new Object[] {
            P00WB7_A228BarUniMed, P00WB7_A864BarPes, P00WB7_A213BarSit
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A201BarPieEst ;
   private byte A213BarSit ;
   private short A3858BarTroCod ;
   private short A864BarPes ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV8Metros ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String scmdbuf ;
   private String A228BarUniMed ;
   private boolean n3864BarTroEst ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private long[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00WB4_A396EmprCod ;
   private long[] P00WB4_A30AlbProCod ;
   private int[] P00WB4_A129BarCod ;
   private byte[] P00WB4_A132BarCodReo ;
   private String[] P00WB4_A130BarCodPar ;
   private String[] P00WB4_A200BarPieCod ;
   private java.math.BigDecimal[] P00WB4_A1270AlbPMtrEnt ;
   private String[] P00WB4_A228BarUniMed ;
   private short[] P00WB4_A864BarPes ;
   private java.math.BigDecimal[] P00WB4_A27AlbPKilEnt ;
   private String[] P00WB6_A396EmprCod ;
   private int[] P00WB6_A129BarCod ;
   private byte[] P00WB6_A132BarCodReo ;
   private String[] P00WB6_A130BarCodPar ;
   private String[] P00WB6_A200BarPieCod ;
   private java.math.BigDecimal[] P00WB6_A183BarMetLan ;
   private java.math.BigDecimal[] P00WB6_A170BarKilLan ;
   private byte[] P00WB6_A201BarPieEst ;
   private String[] P00WB7_A228BarUniMed ;
   private short[] P00WB7_A864BarPes ;
   private byte[] P00WB7_A213BarSit ;
}

final  class pelitrz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00WB2", "DELETE FROM TXPLALTRZ  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and AlbPTroCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALTRZ")
         ,new UpdateCursor("P00WB3", "UPDATE TXPBARTRO SET BarTroEst=0  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and BarTroCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARTRO")
         ,new ForEachCursor("P00WB4", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.AlbPMtrEnt, T3.BarUniMed, T3.BarPes, T1.AlbPKilEnt FROM ((TXPLALPRD T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarPieCod = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00WB5", "UPDATE TXPLALPRD SET AlbPMtrEnt=?, AlbPKilEnt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new ForEachCursor("P00WB6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarMetLan, BarKilLan, BarPieEst FROM TXPBARPIE WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00WB7", "SELECT BarUniMed, BarPes, BarSit FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00WB8", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P00WB9", "UPDATE TXPBARPIE SET BarMetLan=?, BarKilLan=?, BarPieEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 9);
               return;
      }
   }

}

