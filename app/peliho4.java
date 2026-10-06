package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peliho4 extends GXProcedure
{
   public peliho4( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peliho4.class ), "" );
   }

   public peliho4( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      peliho4.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      peliho4.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      peliho4.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      peliho4.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      peliho4.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      peliho4.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00WA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3392AlbColNom = P00WA2_A3392AlbColNom[0] ;
         /* Using cursor P00WA3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Using cursor P00WA4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A200BarPieCod = P00WA4_A200BarPieCod[0] ;
            A1270AlbPMtrEnt = P00WA4_A1270AlbPMtrEnt[0] ;
            /* Using cursor P00WA5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
            /* Using cursor P00WA6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A42AlbPTroCod = P00WA6_A42AlbPTroCod[0] ;
               A43AlbPTroMet = P00WA6_A43AlbPTroMet[0] ;
               GXv_char1[0] = A396EmprCod ;
               GXv_int2[0] = A129BarCod ;
               GXv_int3[0] = A132BarCodReo ;
               GXv_char4[0] = A130BarCodPar ;
               GXv_char5[0] = A200BarPieCod ;
               GXv_int6[0] = A42AlbPTroCod ;
               GXv_int7[0] = A30AlbProCod ;
               GXv_decimal8[0] = A43AlbPTroMet ;
               new app.pelitrz(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int7, GXv_decimal8) ;
               peliho4.this.A396EmprCod = GXv_char1[0] ;
               peliho4.this.A129BarCod = GXv_int2[0] ;
               peliho4.this.A132BarCodReo = GXv_int3[0] ;
               peliho4.this.A130BarCodPar = GXv_char4[0] ;
               peliho4.this.A200BarPieCod = GXv_char5[0] ;
               peliho4.this.A42AlbPTroCod = GXv_int6[0] ;
               peliho4.this.A30AlbProCod = GXv_int7[0] ;
               peliho4.this.A43AlbPTroMet = GXv_decimal8[0] ;
               pr_default.readNext(4);
            }
            pr_default.close(4);
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00WA7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A213BarSit = P00WA7_A213BarSit[0] ;
         if ( A213BarSit == 9 )
         {
            A213BarSit = (byte)(6) ;
         }
         /* Using cursor P00WA8 */
         pr_default.execute(6, new Object[] {Byte.valueOf(A213BarSit), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = peliho4.this.A396EmprCod;
      this.aP1[0] = peliho4.this.A30AlbProCod;
      this.aP2[0] = peliho4.this.A129BarCod;
      this.aP3[0] = peliho4.this.A132BarCodReo;
      this.aP4[0] = peliho4.this.A130BarCodPar;
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
      P00WA2_A396EmprCod = new String[] {""} ;
      P00WA2_A30AlbProCod = new long[1] ;
      P00WA2_A129BarCod = new int[1] ;
      P00WA2_A132BarCodReo = new byte[1] ;
      P00WA2_A130BarCodPar = new String[] {""} ;
      P00WA2_A3392AlbColNom = new String[] {""} ;
      A3392AlbColNom = "" ;
      P00WA4_A396EmprCod = new String[] {""} ;
      P00WA4_A30AlbProCod = new long[1] ;
      P00WA4_A129BarCod = new int[1] ;
      P00WA4_A132BarCodReo = new byte[1] ;
      P00WA4_A130BarCodPar = new String[] {""} ;
      P00WA4_A200BarPieCod = new String[] {""} ;
      P00WA4_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A200BarPieCod = "" ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      P00WA6_A396EmprCod = new String[] {""} ;
      P00WA6_A30AlbProCod = new long[1] ;
      P00WA6_A129BarCod = new int[1] ;
      P00WA6_A132BarCodReo = new byte[1] ;
      P00WA6_A130BarCodPar = new String[] {""} ;
      P00WA6_A200BarPieCod = new String[] {""} ;
      P00WA6_A42AlbPTroCod = new short[1] ;
      P00WA6_A43AlbPTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A43AlbPTroMet = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_int7 = new long[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      P00WA7_A396EmprCod = new String[] {""} ;
      P00WA7_A129BarCod = new int[1] ;
      P00WA7_A132BarCodReo = new byte[1] ;
      P00WA7_A130BarCodPar = new String[] {""} ;
      P00WA7_A213BarSit = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.peliho4__default(),
         new Object[] {
             new Object[] {
            P00WA2_A396EmprCod, P00WA2_A30AlbProCod, P00WA2_A129BarCod, P00WA2_A132BarCodReo, P00WA2_A130BarCodPar, P00WA2_A3392AlbColNom
            }
            , new Object[] {
            }
            , new Object[] {
            P00WA4_A396EmprCod, P00WA4_A30AlbProCod, P00WA4_A129BarCod, P00WA4_A132BarCodReo, P00WA4_A130BarCodPar, P00WA4_A200BarPieCod, P00WA4_A1270AlbPMtrEnt
            }
            , new Object[] {
            }
            , new Object[] {
            P00WA6_A396EmprCod, P00WA6_A30AlbProCod, P00WA6_A129BarCod, P00WA6_A132BarCodReo, P00WA6_A130BarCodPar, P00WA6_A200BarPieCod, P00WA6_A42AlbPTroCod, P00WA6_A43AlbPTroMet
            }
            , new Object[] {
            P00WA7_A396EmprCod, P00WA7_A129BarCod, P00WA7_A132BarCodReo, P00WA7_A130BarCodPar, P00WA7_A213BarSit
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private byte A213BarSit ;
   private short A42AlbPTroCod ;
   private short GXv_int6[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private long A30AlbProCod ;
   private long GXv_int7[] ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal A43AlbPTroMet ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A3392AlbColNom ;
   private String A200BarPieCod ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00WA2_A396EmprCod ;
   private long[] P00WA2_A30AlbProCod ;
   private int[] P00WA2_A129BarCod ;
   private byte[] P00WA2_A132BarCodReo ;
   private String[] P00WA2_A130BarCodPar ;
   private String[] P00WA2_A3392AlbColNom ;
   private String[] P00WA4_A396EmprCod ;
   private long[] P00WA4_A30AlbProCod ;
   private int[] P00WA4_A129BarCod ;
   private byte[] P00WA4_A132BarCodReo ;
   private String[] P00WA4_A130BarCodPar ;
   private String[] P00WA4_A200BarPieCod ;
   private java.math.BigDecimal[] P00WA4_A1270AlbPMtrEnt ;
   private String[] P00WA6_A396EmprCod ;
   private long[] P00WA6_A30AlbProCod ;
   private int[] P00WA6_A129BarCod ;
   private byte[] P00WA6_A132BarCodReo ;
   private String[] P00WA6_A130BarCodPar ;
   private String[] P00WA6_A200BarPieCod ;
   private short[] P00WA6_A42AlbPTroCod ;
   private java.math.BigDecimal[] P00WA6_A43AlbPTroMet ;
   private String[] P00WA7_A396EmprCod ;
   private int[] P00WA7_A129BarCod ;
   private byte[] P00WA7_A132BarCodReo ;
   private String[] P00WA7_A130BarCodPar ;
   private byte[] P00WA7_A213BarSit ;
}

final  class peliho4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00WA2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbColNom FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00WA3", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P00WA4", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPMtrEnt FROM TXPLALPRD WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00WA5", "DELETE FROM TXPLALPRD  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALPRD")
         ,new ForEachCursor("P00WA6", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod, AlbPTroMet FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00WA7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00WA8", "UPDATE TXPBARCAD SET BarSit=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
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
      }
   }

}

