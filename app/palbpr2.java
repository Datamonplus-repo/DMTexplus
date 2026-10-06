package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbpr2 extends GXProcedure
{
   public palbpr2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbpr2.class ), "" );
   }

   public palbpr2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 )
   {
      palbpr2.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 )
   {
      palbpr2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbpr2.this.AV8AlbProCod = aP1[0];
      this.aP1 = aP1;
      palbpr2.this.AV9BarCod = aP2[0];
      this.aP2 = aP2;
      palbpr2.this.AV10BarCodReo = aP3[0];
      this.aP3 = aP3;
      palbpr2.this.AV11BarCodPar = aP4[0];
      this.aP4 = aP4;
      palbpr2.this.AV12BarPieCod = aP5[0];
      this.aP5 = aP5;
      palbpr2.this.AV14AlbPTroMet = aP6[0];
      this.aP6 = aP6;
      palbpr2.this.AV19AlbPTroKil = aP7[0];
      this.aP7 = aP7;
      palbpr2.this.AV13AlbPTroMtO = aP8[0];
      this.aP8 = aP8;
      palbpr2.this.AV15Modo = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00HM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV8AlbProCod), Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar, AV12BarPieCod, A396EmprCod, Long.valueOf(AV8AlbProCod), Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar, AV12BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A200BarPieCod = P00HM2_A200BarPieCod[0] ;
         A130BarCodPar = P00HM2_A130BarCodPar[0] ;
         A132BarCodReo = P00HM2_A132BarCodReo[0] ;
         A129BarCod = P00HM2_A129BarCod[0] ;
         A30AlbProCod = P00HM2_A30AlbProCod[0] ;
         A3117AlbPreAnc = P00HM2_A3117AlbPreAnc[0] ;
         n3117AlbPreAnc = P00HM2_n3117AlbPreAnc[0] ;
         /* Using cursor P00HM3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         A197BarPConTro = P00HM3_A197BarPConTro[0] ;
         /* Using cursor P00HM5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A912AlbPMetEnt = P00HM5_A912AlbPMetEnt[0] ;
            n912AlbPMetEnt = P00HM5_n912AlbPMetEnt[0] ;
         }
         else
         {
            A912AlbPMetEnt = DecimalUtil.doubleToDec(0) ;
            n912AlbPMetEnt = false ;
         }
         if ( GXutil.strcmp(AV15Modo, httpContext.getMessage( "INS", "")) == 0 )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A30AlbProCod ;
            GXv_int3[0] = A129BarCod ;
            GXv_int4[0] = A132BarCodReo ;
            GXv_char5[0] = A130BarCodPar ;
            GXv_decimal6[0] = A912AlbPMetEnt ;
            new app.pkilfa2(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_char5, GXv_decimal6) ;
            palbpr2.this.A396EmprCod = GXv_char1[0] ;
            palbpr2.this.A30AlbProCod = GXv_int2[0] ;
            palbpr2.this.A129BarCod = GXv_int3[0] ;
            palbpr2.this.A132BarCodReo = GXv_int4[0] ;
            palbpr2.this.A130BarCodPar = GXv_char5[0] ;
            palbpr2.this.A912AlbPMetEnt = GXv_decimal6[0] ;
            A197BarPConTro = (short)(1) ;
         }
         AV18BarPieAnc = A3117AlbPreAnc ;
         /* Using cursor P00HM6 */
         pr_default.execute(3, new Object[] {Short.valueOf(A197BarPConTro), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      /*
         INSERT RECORD ON TABLE TXPLALTRZ

      */
      A30AlbProCod = AV8AlbProCod ;
      A129BarCod = AV9BarCod ;
      A132BarCodReo = AV10BarCodReo ;
      A130BarCodPar = AV11BarCodPar ;
      A200BarPieCod = AV12BarPieCod ;
      A42AlbPTroCod = (short)(1) ;
      A43AlbPTroMet = AV14AlbPTroMet ;
      A5303AlbPTroKil = AV19AlbPTroKil ;
      A3118AlbPTroAnc = AV18BarPieAnc ;
      /* Using cursor P00HM7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod), A43AlbPTroMet, Short.valueOf(A3118AlbPTroAnc), A5303AlbPTroKil});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
      if ( (pr_default.getStatus(4) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Optimized UPDATE. */
         /* Using cursor P00HM8 */
         pr_default.execute(5, new Object[] {AV14AlbPTroMet, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbpr2.this.A396EmprCod;
      this.aP1[0] = palbpr2.this.AV8AlbProCod;
      this.aP2[0] = palbpr2.this.AV9BarCod;
      this.aP3[0] = palbpr2.this.AV10BarCodReo;
      this.aP4[0] = palbpr2.this.AV11BarCodPar;
      this.aP5[0] = palbpr2.this.AV12BarPieCod;
      this.aP6[0] = palbpr2.this.AV14AlbPTroMet;
      this.aP7[0] = palbpr2.this.AV19AlbPTroKil;
      this.aP8[0] = palbpr2.this.AV13AlbPTroMtO;
      this.aP9[0] = palbpr2.this.AV15Modo;
      Application.commitDataStores(context, remoteHandle, pr_default, "palbpr2");
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
      P00HM2_A396EmprCod = new String[] {""} ;
      P00HM2_A200BarPieCod = new String[] {""} ;
      P00HM2_A130BarCodPar = new String[] {""} ;
      P00HM2_A132BarCodReo = new byte[1] ;
      P00HM2_A129BarCod = new int[1] ;
      P00HM2_A30AlbProCod = new long[1] ;
      P00HM2_A3117AlbPreAnc = new short[1] ;
      P00HM2_n3117AlbPreAnc = new boolean[] {false} ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      P00HM3_A197BarPConTro = new short[1] ;
      P00HM5_A912AlbPMetEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00HM5_n912AlbPMetEnt = new boolean[] {false} ;
      A912AlbPMetEnt = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new long[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      A43AlbPTroMet = DecimalUtil.ZERO ;
      A5303AlbPTroKil = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbpr2__default(),
         new Object[] {
             new Object[] {
            P00HM2_A396EmprCod, P00HM2_A200BarPieCod, P00HM2_A130BarCodPar, P00HM2_A132BarCodReo, P00HM2_A129BarCod, P00HM2_A30AlbProCod, P00HM2_A3117AlbPreAnc, P00HM2_n3117AlbPreAnc
            }
            , new Object[] {
            P00HM3_A197BarPConTro
            }
            , new Object[] {
            P00HM5_A912AlbPMetEnt, P00HM5_n912AlbPMetEnt
            }
            , new Object[] {
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

   private byte AV10BarCodReo ;
   private byte A132BarCodReo ;
   private byte GXv_int4[] ;
   private short A3117AlbPreAnc ;
   private short A197BarPConTro ;
   private short AV18BarPieAnc ;
   private short A42AlbPTroCod ;
   private short A3118AlbPTroAnc ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int A129BarCod ;
   private int GXv_int3[] ;
   private int GX_INS198 ;
   private long AV8AlbProCod ;
   private long A30AlbProCod ;
   private long GXv_int2[] ;
   private java.math.BigDecimal AV14AlbPTroMet ;
   private java.math.BigDecimal AV19AlbPTroKil ;
   private java.math.BigDecimal AV13AlbPTroMtO ;
   private java.math.BigDecimal A912AlbPMetEnt ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal A43AlbPTroMet ;
   private java.math.BigDecimal A5303AlbPTroKil ;
   private String A396EmprCod ;
   private String AV11BarCodPar ;
   private String AV12BarPieCod ;
   private String AV15Modo ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private String Gx_emsg ;
   private boolean n3117AlbPreAnc ;
   private boolean n912AlbPMetEnt ;
   private String[] aP9 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P00HM2_A396EmprCod ;
   private String[] P00HM2_A200BarPieCod ;
   private String[] P00HM2_A130BarCodPar ;
   private byte[] P00HM2_A132BarCodReo ;
   private int[] P00HM2_A129BarCod ;
   private long[] P00HM2_A30AlbProCod ;
   private short[] P00HM2_A3117AlbPreAnc ;
   private boolean[] P00HM2_n3117AlbPreAnc ;
   private short[] P00HM3_A197BarPConTro ;
   private java.math.BigDecimal[] P00HM5_A912AlbPMetEnt ;
   private boolean[] P00HM5_n912AlbPMetEnt ;
}

final  class palbpr2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00HM2", "SELECT EmprCod, BarPieCod, BarCodPar, BarCodReo, BarCod, AlbProCod, AlbPreAnc FROM TXPLALPRD WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00HM3", "SELECT BarPConTro FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00HM5", "SELECT COALESCE( T1.AlbPMetEnt, 0) AS AlbPMetEnt FROM (SELECT SUM(AlbPTroMet) AS AlbPMetEnt, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALTRZ GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.BarPieCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00HM6", "UPDATE TXPBARPIE SET BarPConTro=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P00HM7", "INSERT INTO TXPLALTRZ(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod, AlbPTroMet, AlbPTroAnc, AlbPTroKil, AlbTar, AlbPTroTrn, AlbPTroFEn, AlbPTroCar, AlbPTroEst) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALTRZ")
         ,new UpdateCursor("P00HM8", "UPDATE TXPLALTRZ SET AlbPTroMet=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and AlbPTroCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALTRZ")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
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
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

