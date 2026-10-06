package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preserv2 extends GXProcedure
{
   public preserv2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preserv2.class ), "" );
   }

   public preserv2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      preserv2.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      preserv2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preserv2.this.AV14Prd1 = aP1[0];
      this.aP1 = aP1;
      preserv2.this.AV15Prd2 = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04IN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV14Prd1, AV15Prd2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P04IN2_A719PrdNum[0] ;
         n719PrdNum = P04IN2_n719PrdNum[0] ;
         A707PrdFacCon = P04IN2_A707PrdFacCon[0] ;
         A685PrdCanRes = P04IN2_A685PrdCanRes[0] ;
         AV16PrdNum = A719PrdNum ;
         AV17Prdcanres = DecimalUtil.doubleToDec(0) ;
         AV18prdfaccon = A707PrdFacCon ;
         /* Execute user subroutine: 'TINTE' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'ESTAMPACION' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A685PrdCanRes = AV17Prdcanres ;
         /* Using cursor P04IN3 */
         pr_default.execute(1, new Object[] {A685PrdCanRes, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'TINTE' Routine */
      returnInSub = false ;
      /* Using cursor P04IN4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV16PrdNum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P04IN4_A719PrdNum[0] ;
         n719PrdNum = P04IN4_n719PrdNum[0] ;
         A4024RecMar = P04IN4_A4024RecMar[0] ;
         A686PrdCant = P04IN4_A686PrdCant[0] ;
         A129BarCod = P04IN4_A129BarCod[0] ;
         A132BarCodReo = P04IN4_A132BarCodReo[0] ;
         A130BarCodPar = P04IN4_A130BarCodPar[0] ;
         A2804RecLinMaq = P04IN4_A2804RecLinMaq[0] ;
         A1273RecLinPro = P04IN4_A1273RecLinPro[0] ;
         A811RecLin = P04IN4_A811RecLin[0] ;
         if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 ) && ( A686PrdCant.doubleValue() > 0 ) )
         {
            AV17Prdcanres = AV17Prdcanres.add(((A686PrdCant.multiply(AV18prdfaccon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S121( )
   {
      /* 'ESTAMPACION' Routine */
      returnInSub = false ;
      /* Using cursor P04IN5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV16PrdNum});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A129BarCod = P04IN5_A129BarCod[0] ;
         A132BarCodReo = P04IN5_A132BarCodReo[0] ;
         A130BarCodPar = P04IN5_A130BarCodPar[0] ;
         A4400BarSitEst = P04IN5_A4400BarSitEst[0] ;
         A719PrdNum = P04IN5_A719PrdNum[0] ;
         n719PrdNum = P04IN5_n719PrdNum[0] ;
         A2119RecEstCP = P04IN5_A2119RecEstCP[0] ;
         n2119RecEstCP = P04IN5_n2119RecEstCP[0] ;
         A2524DisComLin = P04IN5_A2524DisComLin[0] ;
         A1056DisComCod = P04IN5_A1056DisComCod[0] ;
         A1032FonCod = P04IN5_A1032FonCod[0] ;
         A2124RecMolCod = P04IN5_A2124RecMolCod[0] ;
         A2126RecMolLin = P04IN5_A2126RecMolLin[0] ;
         A4400BarSitEst = P04IN5_A4400BarSitEst[0] ;
         if ( ( A2119RecEstCP.doubleValue() > 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 ) )
         {
            AV17Prdcanres = AV17Prdcanres.add(((A2119RecEstCP.multiply(AV18prdfaccon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /* Using cursor P04IN6 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV16PrdNum});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A129BarCod = P04IN6_A129BarCod[0] ;
         A132BarCodReo = P04IN6_A132BarCodReo[0] ;
         A130BarCodPar = P04IN6_A130BarCodPar[0] ;
         A4400BarSitEst = P04IN6_A4400BarSitEst[0] ;
         A719PrdNum = P04IN6_A719PrdNum[0] ;
         n719PrdNum = P04IN6_n719PrdNum[0] ;
         A2670RecPasCP = P04IN6_A2670RecPasCP[0] ;
         n2670RecPasCP = P04IN6_n2670RecPasCP[0] ;
         A2524DisComLin = P04IN6_A2524DisComLin[0] ;
         A1056DisComCod = P04IN6_A1056DisComCod[0] ;
         A1032FonCod = P04IN6_A1032FonCod[0] ;
         A2124RecMolCod = P04IN6_A2124RecMolCod[0] ;
         A2672RecPasLin = P04IN6_A2672RecPasLin[0] ;
         A2675RecPasPLi = P04IN6_A2675RecPasPLi[0] ;
         A4400BarSitEst = P04IN6_A4400BarSitEst[0] ;
         if ( ( A2670RecPasCP.doubleValue() > 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 ) )
         {
            AV17Prdcanres = AV17Prdcanres.add(((A2670RecPasCP.multiply(AV18prdfaccon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP0[0] = preserv2.this.A396EmprCod;
      this.aP1[0] = preserv2.this.AV14Prd1;
      this.aP2[0] = preserv2.this.AV15Prd2;
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
      P04IN2_A396EmprCod = new String[] {""} ;
      P04IN2_A719PrdNum = new String[] {""} ;
      P04IN2_n719PrdNum = new boolean[] {false} ;
      P04IN2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04IN2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      AV16PrdNum = "" ;
      AV17Prdcanres = DecimalUtil.ZERO ;
      AV18prdfaccon = DecimalUtil.ZERO ;
      P04IN4_A396EmprCod = new String[] {""} ;
      P04IN4_A719PrdNum = new String[] {""} ;
      P04IN4_n719PrdNum = new boolean[] {false} ;
      P04IN4_A4024RecMar = new byte[1] ;
      P04IN4_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04IN4_A129BarCod = new int[1] ;
      P04IN4_A132BarCodReo = new byte[1] ;
      P04IN4_A130BarCodPar = new String[] {""} ;
      P04IN4_A2804RecLinMaq = new short[1] ;
      P04IN4_A1273RecLinPro = new byte[1] ;
      P04IN4_A811RecLin = new short[1] ;
      A686PrdCant = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      P04IN5_A129BarCod = new int[1] ;
      P04IN5_A132BarCodReo = new byte[1] ;
      P04IN5_A130BarCodPar = new String[] {""} ;
      P04IN5_A396EmprCod = new String[] {""} ;
      P04IN5_A4400BarSitEst = new byte[1] ;
      P04IN5_A719PrdNum = new String[] {""} ;
      P04IN5_n719PrdNum = new boolean[] {false} ;
      P04IN5_A2119RecEstCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04IN5_n2119RecEstCP = new boolean[] {false} ;
      P04IN5_A2524DisComLin = new byte[1] ;
      P04IN5_A1056DisComCod = new String[] {""} ;
      P04IN5_A1032FonCod = new String[] {""} ;
      P04IN5_A2124RecMolCod = new byte[1] ;
      P04IN5_A2126RecMolLin = new byte[1] ;
      A2119RecEstCP = DecimalUtil.ZERO ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      P04IN6_A129BarCod = new int[1] ;
      P04IN6_A132BarCodReo = new byte[1] ;
      P04IN6_A130BarCodPar = new String[] {""} ;
      P04IN6_A396EmprCod = new String[] {""} ;
      P04IN6_A4400BarSitEst = new byte[1] ;
      P04IN6_A719PrdNum = new String[] {""} ;
      P04IN6_n719PrdNum = new boolean[] {false} ;
      P04IN6_A2670RecPasCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04IN6_n2670RecPasCP = new boolean[] {false} ;
      P04IN6_A2524DisComLin = new byte[1] ;
      P04IN6_A1056DisComCod = new String[] {""} ;
      P04IN6_A1032FonCod = new String[] {""} ;
      P04IN6_A2124RecMolCod = new byte[1] ;
      P04IN6_A2672RecPasLin = new short[1] ;
      P04IN6_A2675RecPasPLi = new short[1] ;
      A2670RecPasCP = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preserv2__default(),
         new Object[] {
             new Object[] {
            P04IN2_A396EmprCod, P04IN2_A719PrdNum, P04IN2_A707PrdFacCon, P04IN2_A685PrdCanRes
            }
            , new Object[] {
            }
            , new Object[] {
            P04IN4_A396EmprCod, P04IN4_A719PrdNum, P04IN4_n719PrdNum, P04IN4_A4024RecMar, P04IN4_A686PrdCant, P04IN4_A129BarCod, P04IN4_A132BarCodReo, P04IN4_A130BarCodPar, P04IN4_A2804RecLinMaq, P04IN4_A1273RecLinPro,
            P04IN4_A811RecLin
            }
            , new Object[] {
            P04IN5_A129BarCod, P04IN5_A132BarCodReo, P04IN5_A130BarCodPar, P04IN5_A396EmprCod, P04IN5_A4400BarSitEst, P04IN5_A719PrdNum, P04IN5_n719PrdNum, P04IN5_A2119RecEstCP, P04IN5_n2119RecEstCP, P04IN5_A2524DisComLin,
            P04IN5_A1056DisComCod, P04IN5_A1032FonCod, P04IN5_A2124RecMolCod, P04IN5_A2126RecMolLin
            }
            , new Object[] {
            P04IN6_A129BarCod, P04IN6_A132BarCodReo, P04IN6_A130BarCodPar, P04IN6_A396EmprCod, P04IN6_A4400BarSitEst, P04IN6_A719PrdNum, P04IN6_n719PrdNum, P04IN6_A2670RecPasCP, P04IN6_n2670RecPasCP, P04IN6_A2524DisComLin,
            P04IN6_A1056DisComCod, P04IN6_A1032FonCod, P04IN6_A2124RecMolCod, P04IN6_A2672RecPasLin, P04IN6_A2675RecPasPLi
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4024RecMar ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A4400BarSitEst ;
   private byte A2524DisComLin ;
   private byte A2124RecMolCod ;
   private byte A2126RecMolLin ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short A2672RecPasLin ;
   private short A2675RecPasPLi ;
   private short Gx_err ;
   private int A129BarCod ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV17Prdcanres ;
   private java.math.BigDecimal AV18prdfaccon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A2119RecEstCP ;
   private java.math.BigDecimal A2670RecPasCP ;
   private String A396EmprCod ;
   private String AV14Prd1 ;
   private String AV15Prd2 ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String AV16PrdNum ;
   private String A130BarCodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean n2119RecEstCP ;
   private boolean n2670RecPasCP ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04IN2_A396EmprCod ;
   private String[] P04IN2_A719PrdNum ;
   private boolean[] P04IN2_n719PrdNum ;
   private java.math.BigDecimal[] P04IN2_A707PrdFacCon ;
   private java.math.BigDecimal[] P04IN2_A685PrdCanRes ;
   private String[] P04IN4_A396EmprCod ;
   private String[] P04IN4_A719PrdNum ;
   private boolean[] P04IN4_n719PrdNum ;
   private byte[] P04IN4_A4024RecMar ;
   private java.math.BigDecimal[] P04IN4_A686PrdCant ;
   private int[] P04IN4_A129BarCod ;
   private byte[] P04IN4_A132BarCodReo ;
   private String[] P04IN4_A130BarCodPar ;
   private short[] P04IN4_A2804RecLinMaq ;
   private byte[] P04IN4_A1273RecLinPro ;
   private short[] P04IN4_A811RecLin ;
   private int[] P04IN5_A129BarCod ;
   private byte[] P04IN5_A132BarCodReo ;
   private String[] P04IN5_A130BarCodPar ;
   private String[] P04IN5_A396EmprCod ;
   private byte[] P04IN5_A4400BarSitEst ;
   private String[] P04IN5_A719PrdNum ;
   private boolean[] P04IN5_n719PrdNum ;
   private java.math.BigDecimal[] P04IN5_A2119RecEstCP ;
   private boolean[] P04IN5_n2119RecEstCP ;
   private byte[] P04IN5_A2524DisComLin ;
   private String[] P04IN5_A1056DisComCod ;
   private String[] P04IN5_A1032FonCod ;
   private byte[] P04IN5_A2124RecMolCod ;
   private byte[] P04IN5_A2126RecMolLin ;
   private int[] P04IN6_A129BarCod ;
   private byte[] P04IN6_A132BarCodReo ;
   private String[] P04IN6_A130BarCodPar ;
   private String[] P04IN6_A396EmprCod ;
   private byte[] P04IN6_A4400BarSitEst ;
   private String[] P04IN6_A719PrdNum ;
   private boolean[] P04IN6_n719PrdNum ;
   private java.math.BigDecimal[] P04IN6_A2670RecPasCP ;
   private boolean[] P04IN6_n2670RecPasCP ;
   private byte[] P04IN6_A2524DisComLin ;
   private String[] P04IN6_A1056DisComCod ;
   private String[] P04IN6_A1032FonCod ;
   private byte[] P04IN6_A2124RecMolCod ;
   private short[] P04IN6_A2672RecPasLin ;
   private short[] P04IN6_A2675RecPasPLi ;
}

final  class preserv2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04IN2", "SELECT EmprCod, PrdNum, PrdFacCon, PrdCanRes FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum >= ?) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04IN3", "UPDATE TXPPRODUC SET PrdCanRes=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new ForEachCursor("P04IN4", "SELECT EmprCod, PrdNum, RecMar, PrdCant, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04IN5", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T2.BarSitEst, T1.PrdNum, T1.RecEstCP, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod, T1.RecMolLin FROM (TXPRECPRD T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.PrdNum = ?) AND (T2.BarSitEst <= 4) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04IN6", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T2.BarSitEst, T1.PrdNum, T1.RecPasCP, T1.DisComLin, T1.DisComCod, T1.FonCod, T1.RecMolCod, T1.RecPasLin, T1.RecPasPLi FROM (TXPRECDEP T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.PrdNum = ?) AND (T2.BarSitEst <= 4) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 12);
               ((String[]) buf[11])[0] = rslt.getString(10, 12);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 12);
               ((String[]) buf[11])[0] = rslt.getString(10, 12);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

