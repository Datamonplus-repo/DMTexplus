package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precanp extends GXProcedure
{
   public precanp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precanp.class ), "" );
   }

   public precanp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           byte[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           byte[] aP7 ,
                           short[] aP8 ,
                           java.math.BigDecimal[] aP9 )
   {
      precanp.this.aP10 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 ,
                        short[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        byte[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             short[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             byte[] aP10 )
   {
      precanp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      precanp.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      precanp.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      precanp.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      precanp.this.A2524DisComLin = aP4[0];
      this.aP4 = aP4;
      precanp.this.A1056DisComCod = aP5[0];
      this.aP5 = aP5;
      precanp.this.A1032FonCod = aP6[0];
      this.aP6 = aP6;
      precanp.this.A2124RecMolCod = aP7[0];
      this.aP7 = aP7;
      precanp.this.A2672RecPasLin = aP8[0];
      this.aP8 = aP8;
      precanp.this.AV15RecPasPAn = aP9[0];
      this.aP9 = aP9;
      precanp.this.AV16Signo = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV18Flag1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STKEST", ""), GXv_int1) ;
      precanp.this.AV18Flag1 = GXv_int1[0] ;
      /* Using cursor P01002 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Short.valueOf(A2672RecPasLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2132RecPasCan = P01002_A2132RecPasCan[0] ;
         n2132RecPasCan = P01002_n2132RecPasCan[0] ;
         AV17RecPasCan = A2132RecPasCan ;
         /* Using cursor P01003 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Short.valueOf(A2672RecPasLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Short.valueOf(A2672RecPasLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A719PrdNum = P01003_A719PrdNum[0] ;
            n719PrdNum = P01003_n719PrdNum[0] ;
            A2674RecPasPK = P01003_A2674RecPasPK[0] ;
            n2674RecPasPK = P01003_n2674RecPasPK[0] ;
            A2670RecPasCP = P01003_A2670RecPasCP[0] ;
            n2670RecPasCP = P01003_n2670RecPasCP[0] ;
            A2678RecPasUC = P01003_A2678RecPasUC[0] ;
            n2678RecPasUC = P01003_n2678RecPasUC[0] ;
            A2675RecPasPLi = P01003_A2675RecPasPLi[0] ;
            /* Using cursor P01004 */
            pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
            A685PrdCanRes = P01004_A685PrdCanRes[0] ;
            AV19CantAny = A2674RecPasPK.multiply((AV15RecPasPAn.multiply(DecimalUtil.doubleToDec(AV16Signo)))) ;
            A2670RecPasCP = A2674RecPasPK.multiply((AV17RecPasCan.add((AV15RecPasPAn.multiply(DecimalUtil.doubleToDec(AV16Signo)))))) ;
            n2670RecPasCP = false ;
            if ( AV18Flag1 == 1 )
            {
               if ( GXutil.strcmp(A2678RecPasUC, httpContext.getMessage( "GRS", "")) == 0 )
               {
                  A685PrdCanRes = A685PrdCanRes.add(AV19CantAny.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
               }
               else
               {
                  A685PrdCanRes = A685PrdCanRes.add(AV19CantAny) ;
               }
            }
            /* Using cursor P01005 */
            pr_default.execute(3, new Object[] {A685PrdCanRes, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
            /* Using cursor P01006 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n2670RecPasCP), A2670RecPasCP, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Byte.valueOf(A2124RecMolCod), Short.valueOf(A2672RecPasLin), Short.valueOf(A2675RecPasPLi)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECDEP");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = precanp.this.A396EmprCod;
      this.aP1[0] = precanp.this.A129BarCod;
      this.aP2[0] = precanp.this.A132BarCodReo;
      this.aP3[0] = precanp.this.A130BarCodPar;
      this.aP4[0] = precanp.this.A2524DisComLin;
      this.aP5[0] = precanp.this.A1056DisComCod;
      this.aP6[0] = precanp.this.A1032FonCod;
      this.aP7[0] = precanp.this.A2124RecMolCod;
      this.aP8[0] = precanp.this.A2672RecPasLin;
      this.aP9[0] = precanp.this.AV15RecPasPAn;
      this.aP10[0] = precanp.this.AV16Signo;
      Application.commitDataStores(context, remoteHandle, pr_default, "precanp");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P01002_A396EmprCod = new String[] {""} ;
      P01002_A129BarCod = new int[1] ;
      P01002_A132BarCodReo = new byte[1] ;
      P01002_A130BarCodPar = new String[] {""} ;
      P01002_A2524DisComLin = new byte[1] ;
      P01002_A1056DisComCod = new String[] {""} ;
      P01002_A1032FonCod = new String[] {""} ;
      P01002_A2124RecMolCod = new byte[1] ;
      P01002_A2672RecPasLin = new short[1] ;
      P01002_A2132RecPasCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01002_n2132RecPasCan = new boolean[] {false} ;
      A2132RecPasCan = DecimalUtil.ZERO ;
      AV17RecPasCan = DecimalUtil.ZERO ;
      P01003_A719PrdNum = new String[] {""} ;
      P01003_n719PrdNum = new boolean[] {false} ;
      P01003_A396EmprCod = new String[] {""} ;
      P01003_A129BarCod = new int[1] ;
      P01003_A132BarCodReo = new byte[1] ;
      P01003_A130BarCodPar = new String[] {""} ;
      P01003_A2524DisComLin = new byte[1] ;
      P01003_A1056DisComCod = new String[] {""} ;
      P01003_A1032FonCod = new String[] {""} ;
      P01003_A2124RecMolCod = new byte[1] ;
      P01003_A2672RecPasLin = new short[1] ;
      P01003_A2674RecPasPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01003_n2674RecPasPK = new boolean[] {false} ;
      P01003_A2670RecPasCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01003_n2670RecPasCP = new boolean[] {false} ;
      P01003_A2678RecPasUC = new String[] {""} ;
      P01003_n2678RecPasUC = new boolean[] {false} ;
      P01003_A2675RecPasPLi = new short[1] ;
      A719PrdNum = "" ;
      A2674RecPasPK = DecimalUtil.ZERO ;
      A2670RecPasCP = DecimalUtil.ZERO ;
      A2678RecPasUC = "" ;
      P01004_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      AV19CantAny = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.precanp__default(),
         new Object[] {
             new Object[] {
            P01002_A396EmprCod, P01002_A129BarCod, P01002_A132BarCodReo, P01002_A130BarCodPar, P01002_A2524DisComLin, P01002_A1056DisComCod, P01002_A1032FonCod, P01002_A2124RecMolCod, P01002_A2672RecPasLin, P01002_A2132RecPasCan,
            P01002_n2132RecPasCan
            }
            , new Object[] {
            P01003_A719PrdNum, P01003_n719PrdNum, P01003_A396EmprCod, P01003_A129BarCod, P01003_A132BarCodReo, P01003_A130BarCodPar, P01003_A2524DisComLin, P01003_A1056DisComCod, P01003_A1032FonCod, P01003_A2124RecMolCod,
            P01003_A2672RecPasLin, P01003_A2674RecPasPK, P01003_n2674RecPasPK, P01003_A2670RecPasCP, P01003_n2670RecPasCP, P01003_A2678RecPasUC, P01003_n2678RecPasUC, P01003_A2675RecPasPLi
            }
            , new Object[] {
            P01004_A685PrdCanRes
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
   private byte A2524DisComLin ;
   private byte A2124RecMolCod ;
   private byte AV16Signo ;
   private byte AV18Flag1 ;
   private byte GXv_int1[] ;
   private short A2672RecPasLin ;
   private short A2675RecPasPLi ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal AV15RecPasPAn ;
   private java.math.BigDecimal A2132RecPasCan ;
   private java.math.BigDecimal AV17RecPasCan ;
   private java.math.BigDecimal A2674RecPasPK ;
   private java.math.BigDecimal A2670RecPasCP ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV19CantAny ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A2678RecPasUC ;
   private boolean n2132RecPasCan ;
   private boolean n719PrdNum ;
   private boolean n2674RecPasPK ;
   private boolean n2670RecPasCP ;
   private boolean n2678RecPasUC ;
   private byte[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private byte[] aP7 ;
   private short[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P01002_A396EmprCod ;
   private int[] P01002_A129BarCod ;
   private byte[] P01002_A132BarCodReo ;
   private String[] P01002_A130BarCodPar ;
   private byte[] P01002_A2524DisComLin ;
   private String[] P01002_A1056DisComCod ;
   private String[] P01002_A1032FonCod ;
   private byte[] P01002_A2124RecMolCod ;
   private short[] P01002_A2672RecPasLin ;
   private java.math.BigDecimal[] P01002_A2132RecPasCan ;
   private boolean[] P01002_n2132RecPasCan ;
   private String[] P01003_A719PrdNum ;
   private boolean[] P01003_n719PrdNum ;
   private String[] P01003_A396EmprCod ;
   private int[] P01003_A129BarCod ;
   private byte[] P01003_A132BarCodReo ;
   private String[] P01003_A130BarCodPar ;
   private byte[] P01003_A2524DisComLin ;
   private String[] P01003_A1056DisComCod ;
   private String[] P01003_A1032FonCod ;
   private byte[] P01003_A2124RecMolCod ;
   private short[] P01003_A2672RecPasLin ;
   private java.math.BigDecimal[] P01003_A2674RecPasPK ;
   private boolean[] P01003_n2674RecPasPK ;
   private java.math.BigDecimal[] P01003_A2670RecPasCP ;
   private boolean[] P01003_n2670RecPasCP ;
   private String[] P01003_A2678RecPasUC ;
   private boolean[] P01003_n2678RecPasUC ;
   private short[] P01003_A2675RecPasPLi ;
   private java.math.BigDecimal[] P01004_A685PrdCanRes ;
}

final  class precanp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01002", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasCan FROM TXPRECPAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and RecMolCod = ? and RecPasLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01003", "SELECT PrdNum, EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPK, RecPasCP, RecPasUC, RecPasPLi FROM TXPRECDEP WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ? AND RecPasLin = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and RecMolCod = ? and RecPasLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01004", "SELECT PrdCanRes FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01005", "UPDATE TXPPRODUC SET PrdCanRes=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new UpdateCursor("P01006", "UPDATE TXPRECDEP SET RecPasCP=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND RecMolCod = ? AND RecPasLin = ? AND RecPasPLi = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECDEP")
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
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 12);
               ((String[]) buf[8])[0] = rslt.getString(8, 12);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(14);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 1);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setString(15, (String)parms[14], 12);
               stmt.setString(16, (String)parms[15], 12);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setShort(18, ((Number) parms[17]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 12);
               stmt.setString(8, (String)parms[8], 12);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setShort(10, ((Number) parms[10]).shortValue());
               stmt.setShort(11, ((Number) parms[11]).shortValue());
               return;
      }
   }

}

