package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pstm009 extends GXProcedure
{
   public pstm009( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pstm009.class ), "" );
   }

   public pstm009( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           int[] aP2 ,
                                           long[] aP3 ,
                                           java.util.Date[] aP4 ,
                                           String[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           java.math.BigDecimal[] aP8 )
   {
      pstm009.this.aP9 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        long[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             long[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 )
   {
      pstm009.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pstm009.this.AV8PrdNum = aP1[0];
      this.aP1 = aP1;
      pstm009.this.AV17PrvNum = aP2[0];
      this.aP2 = aP2;
      pstm009.this.AV13NLinea = aP3[0];
      this.aP3 = aP3;
      pstm009.this.AV9FechaMov = aP4[0];
      this.aP4 = aP4;
      pstm009.this.AV10Albara = aP5[0];
      this.aP5 = aP5;
      pstm009.this.AV11NewCant = aP6[0];
      this.aP6 = aP6;
      pstm009.this.AV14OldCant = aP7[0];
      this.aP7 = aP7;
      pstm009.this.AV12NewPrecio = aP8[0];
      this.aP8 = aP8;
      pstm009.this.AV16OldPrec = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00X72 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8PrdNum, Long.valueOf(AV13NLinea)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3342CCStkLin = P00X72_A3342CCStkLin[0] ;
         A719PrdNum = P00X72_A719PrdNum[0] ;
         A3344CCStkCanS = P00X72_A3344CCStkCanS[0] ;
         A3349CCStkPre = P00X72_A3349CCStkPre[0] ;
         if ( AV11NewCant.doubleValue() == 0 )
         {
            /* Using cursor P00X73 */
            pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
         }
         else
         {
            A3344CCStkCanS = A3344CCStkCanS.subtract(AV14OldCant).add(AV11NewCant) ;
            A3349CCStkPre = AV12NewPrecio ;
         }
         /* Using cursor P00X74 */
         pr_default.execute(2, new Object[] {A3344CCStkCanS, A3349CCStkPre, A396EmprCod, A719PrdNum, Long.valueOf(A3342CCStkLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSTKS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00X75 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV8PrdNum});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A719PrdNum = P00X75_A719PrdNum[0] ;
         A704PrdExiAlm = P00X75_A704PrdExiAlm[0] ;
         A726PrdPreMed = P00X75_A726PrdPreMed[0] ;
         AV15OldExiAlm = A704PrdExiAlm ;
         A704PrdExiAlm = A704PrdExiAlm.add(AV14OldCant).subtract(AV11NewCant) ;
         AV24SumaValor = GXutil.roundDecimal( ((A726PrdPreMed.multiply(AV15OldExiAlm)).add((AV14OldCant.multiply(AV16OldPrec)))).subtract((AV12NewPrecio.multiply(AV11NewCant))), 2) ;
         A726PrdPreMed = ((A704PrdExiAlm.doubleValue()>0) ? GXutil.truncDecimal( (AV24SumaValor.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN)), 3) : DecimalUtil.doubleToDec(0)) ;
         /* Using cursor P00X76 */
         pr_default.execute(4, new Object[] {A704PrdExiAlm, A726PrdPreMed, A396EmprCod, A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      /* Optimized UPDATE. */
      /* Using cursor P00X77 */
      pr_default.execute(5, new Object[] {AV16OldPrec, AV14OldCant, AV12NewPrecio, AV11NewCant, AV14OldCant, AV11NewCant, A396EmprCod, AV8PrdNum, AV9FechaMov, AV9FechaMov});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
      /* End optimized UPDATE. */
      n791PrvEstCm1 = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00X78 */
      pr_default.execute(6, new Object[] {AV16OldPrec, AV14OldCant, AV12NewPrecio, AV11NewCant, A396EmprCod, Integer.valueOf(AV17PrvNum), AV9FechaMov, AV9FechaMov});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRVES");
      /* End optimized UPDATE. */
      AV19Difer = AV11NewCant.subtract(AV14OldCant) ;
      if ( AV19Difer.doubleValue() < 0 )
      {
         AV20Unidades = AV19Difer.negate() ;
      }
      else
      {
         AV20Unidades = AV19Difer ;
      }
      AV21Unid = AV20Unidades ;
      AV22OkEntAlm = (byte)(0) ;
      /* Using cursor P00X79 */
      pr_default.execute(7, new Object[] {AV8PrdNum, A396EmprCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A719PrdNum = P00X79_A719PrdNum[0] ;
         A411EntCon = P00X79_A411EntCon[0] ;
         A419EntUniRem = P00X79_A419EntUniRem[0] ;
         A415EntFecEnt = P00X79_A415EntFecEnt[0] ;
         A597LinEnt = P00X79_A597LinEnt[0] ;
         AV22OkEntAlm = (byte)(1) ;
         if ( AV19Difer.doubleValue() < 0 )
         {
            A419EntUniRem = A419EntUniRem.add(AV20Unidades) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            /* Using cursor P00X710 */
            pr_default.execute(8, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
            if (true) break;
         }
         else
         {
            if ( AV20Unidades.doubleValue() > 0 )
            {
               AV20Unidades = AV20Unidades.subtract(A419EntUniRem) ;
               if ( AV20Unidades.doubleValue() >= 0 )
               {
                  A419EntUniRem = DecimalUtil.doubleToDec(0) ;
                  A411EntCon = (byte)(1) ;
                  AV21Unid = AV20Unidades ;
               }
               else
               {
                  A419EntUniRem = A419EntUniRem.subtract(AV21Unid) ;
               }
            }
         }
         /* Using cursor P00X711 */
         pr_default.execute(9, new Object[] {Byte.valueOf(A411EntCon), A419EntUniRem, A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
         pr_default.readNext(7);
      }
      pr_default.close(7);
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV8PrdNum ;
      new app.pstm017(remoteHandle, context).execute( GXv_char1, GXv_char2) ;
      pstm009.this.A396EmprCod = GXv_char1[0] ;
      pstm009.this.AV8PrdNum = GXv_char2[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pstm009.this.A396EmprCod;
      this.aP1[0] = pstm009.this.AV8PrdNum;
      this.aP2[0] = pstm009.this.AV17PrvNum;
      this.aP3[0] = pstm009.this.AV13NLinea;
      this.aP4[0] = pstm009.this.AV9FechaMov;
      this.aP5[0] = pstm009.this.AV10Albara;
      this.aP6[0] = pstm009.this.AV11NewCant;
      this.aP7[0] = pstm009.this.AV14OldCant;
      this.aP8[0] = pstm009.this.AV12NewPrecio;
      this.aP9[0] = pstm009.this.AV16OldPrec;
      Application.commitDataStores(context, remoteHandle, pr_default, "pstm009");
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
      P00X72_A396EmprCod = new String[] {""} ;
      P00X72_A3342CCStkLin = new long[1] ;
      P00X72_A719PrdNum = new String[] {""} ;
      P00X72_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00X72_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      P00X75_A396EmprCod = new String[] {""} ;
      P00X75_A719PrdNum = new String[] {""} ;
      P00X75_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00X75_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      AV15OldExiAlm = DecimalUtil.ZERO ;
      AV24SumaValor = DecimalUtil.ZERO ;
      AV19Difer = DecimalUtil.ZERO ;
      AV20Unidades = DecimalUtil.ZERO ;
      AV21Unid = DecimalUtil.ZERO ;
      P00X79_A396EmprCod = new String[] {""} ;
      P00X79_A719PrdNum = new String[] {""} ;
      P00X79_A411EntCon = new byte[1] ;
      P00X79_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00X79_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P00X79_A597LinEnt = new short[1] ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A415EntFecEnt = GXutil.nullDate() ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pstm009__default(),
         new Object[] {
             new Object[] {
            P00X72_A396EmprCod, P00X72_A3342CCStkLin, P00X72_A719PrdNum, P00X72_A3344CCStkCanS, P00X72_A3349CCStkPre
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00X75_A396EmprCod, P00X75_A719PrdNum, P00X75_A704PrdExiAlm, P00X75_A726PrdPreMed
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00X79_A396EmprCod, P00X79_A719PrdNum, P00X79_A411EntCon, P00X79_A419EntUniRem, P00X79_A415EntFecEnt, P00X79_A597LinEnt
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

   private byte AV22OkEntAlm ;
   private byte A411EntCon ;
   private short A597LinEnt ;
   private short Gx_err ;
   private int AV17PrvNum ;
   private long AV13NLinea ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal AV11NewCant ;
   private java.math.BigDecimal AV14OldCant ;
   private java.math.BigDecimal AV12NewPrecio ;
   private java.math.BigDecimal AV16OldPrec ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal AV15OldExiAlm ;
   private java.math.BigDecimal AV24SumaValor ;
   private java.math.BigDecimal AV19Difer ;
   private java.math.BigDecimal AV20Unidades ;
   private java.math.BigDecimal AV21Unid ;
   private java.math.BigDecimal A419EntUniRem ;
   private String A396EmprCod ;
   private String AV8PrdNum ;
   private String AV10Albara ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private java.util.Date AV9FechaMov ;
   private java.util.Date A415EntFecEnt ;
   private boolean n791PrvEstCm1 ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private long[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P00X72_A396EmprCod ;
   private long[] P00X72_A3342CCStkLin ;
   private String[] P00X72_A719PrdNum ;
   private java.math.BigDecimal[] P00X72_A3344CCStkCanS ;
   private java.math.BigDecimal[] P00X72_A3349CCStkPre ;
   private String[] P00X75_A396EmprCod ;
   private String[] P00X75_A719PrdNum ;
   private java.math.BigDecimal[] P00X75_A704PrdExiAlm ;
   private java.math.BigDecimal[] P00X75_A726PrdPreMed ;
   private String[] P00X79_A396EmprCod ;
   private String[] P00X79_A719PrdNum ;
   private byte[] P00X79_A411EntCon ;
   private java.math.BigDecimal[] P00X79_A419EntUniRem ;
   private java.util.Date[] P00X79_A415EntFecEnt ;
   private short[] P00X79_A597LinEnt ;
}

final  class pstm009__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00X72", "SELECT EmprCod, CCStkLin, PrdNum, CCStkCanS, CCStkPre FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkLin = ? ORDER BY EmprCod, PrdNum, CCStkLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00X73", "DELETE FROM TXPCCSTKS  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
         ,new UpdateCursor("P00X74", "UPDATE TXPCCSTKS SET CCStkCanS=?, CCStkPre=?  WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSTKS")
         ,new ForEachCursor("P00X75", "SELECT EmprCod, PrdNum, PrdExiAlm, PrdPreMed FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00X76", "UPDATE TXPPRODUC SET PrdExiAlm=?, PrdPreMed=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRODUC")
         ,new UpdateCursor("P00X77", "UPDATE TXPLPRDES SET PrdValCprM=PrdValCprM + ROUND(( ? * CAST(? AS NUMERIC(24,10))) - ( ? * CAST(? AS NUMERIC(24,10))), 2), PrdUniCprM=PrdUniCprM + ? - ?  WHERE (EmprCod = ? and PrdNum = ?) AND (PrdAny = EXTRACT(YEAR FROM ?) and PrdNumMes = EXTRACT(MONTH FROM ?))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
         ,new UpdateCursor("P00X78", "UPDATE TXPLPRVES SET PrvEstCm1=PrvEstCm1 + ROUND(( ? * CAST(? AS NUMERIC(24,10))) - ( ? * CAST(? AS NUMERIC(24,10))), 2)  WHERE (EmprCod = ? and PrvNum = ?) AND (PrvAny = EXTRACT(YEAR FROM ?) and PrvNumLin = EXTRACT(MONTH FROM ?))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRVES")
         ,new ForEachCursor("P00X79", "SELECT EmprCod, PrdNum, EntCon, EntUniRem, EntFecEnt, LinEnt FROM TXPENTALM WHERE (PrdNum = ?) AND (EmprCod = ?) AND (EntCon = 0) ORDER BY PrdNum, LinEnt, EntFecEnt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00X710", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
         ,new UpdateCursor("P00X711", "UPDATE TXPENTALM SET EntCon=?, EntUniRem=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTALM")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 4);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 4);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setDate(9, (java.util.Date)parms[8]);
               stmt.setDate(10, (java.util.Date)parms[9]);
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setDate(8, (java.util.Date)parms[7]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

