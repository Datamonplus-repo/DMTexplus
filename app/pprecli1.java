package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprecli1 extends GXProcedure
{
   public pprecli1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprecli1.class ), "" );
   }

   public pprecli1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            java.math.BigDecimal aP1 ,
                            short aP2 ,
                            String aP3 ,
                            int aP4 ,
                            java.math.BigDecimal[] aP5 ,
                            java.math.BigDecimal[] aP6 ,
                            java.math.BigDecimal[] aP7 ,
                            java.math.BigDecimal[] aP8 ,
                            java.math.BigDecimal[] aP9 ,
                            java.math.BigDecimal[] aP10 ,
                            java.math.BigDecimal[] aP11 ,
                            java.math.BigDecimal[] aP12 )
   {
      pprecli1.this.aP13 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String aP0 ,
                        java.math.BigDecimal aP1 ,
                        short aP2 ,
                        String aP3 ,
                        int aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        short[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String aP0 ,
                             java.math.BigDecimal aP1 ,
                             short aP2 ,
                             String aP3 ,
                             int aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             short[] aP13 )
   {
      pprecli1.this.A396EmprCod = aP0;
      pprecli1.this.AV19ForCosForm = aP1;
      pprecli1.this.AV8GrdTipArt = aP2;
      pprecli1.this.AV9CliTipo = aP3;
      pprecli1.this.AV10ForNumCol = aP4;
      pprecli1.this.aP5 = aP5;
      pprecli1.this.aP6 = aP6;
      pprecli1.this.aP7 = aP7;
      pprecli1.this.aP8 = aP8;
      pprecli1.this.aP9 = aP9;
      pprecli1.this.aP10 = aP10;
      pprecli1.this.aP11 = aP11;
      pprecli1.this.aP12 = aP12;
      pprecli1.this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Pcm = DecimalUtil.doubleToDec(0) ;
      AV14COSTE_MCA = DecimalUtil.doubleToDec(0) ;
      AV13COSTE_MSA = DecimalUtil.doubleToDec(0) ;
      AV12FACTOR_IN = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01Y92 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5650Coste_mca = P01Y92_A5650Coste_mca[0] ;
         n5650Coste_mca = P01Y92_n5650Coste_mca[0] ;
         A5651Coste_msa = P01Y92_A5651Coste_msa[0] ;
         n5651Coste_msa = P01Y92_n5651Coste_msa[0] ;
         A5652Factor_in = P01Y92_A5652Factor_in[0] ;
         n5652Factor_in = P01Y92_n5652Factor_in[0] ;
         AV14COSTE_MCA = A5650Coste_mca ;
         AV13COSTE_MSA = A5651Coste_msa ;
         AV12FACTOR_IN = A5652Factor_in ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV15ForCan = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P01Y93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV10ForNumCol)});
      c481ForCan = P01Y93_A481ForCan[0] ;
      pr_default.close(1);
      AV15ForCan = AV15ForCan.add(c481ForCan) ;
      /* End optimized group. */
      AV16MGEN_VAL = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01Y94 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV9CliTipo, Short.valueOf(AV8GrdTipArt)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A4364GrdTipArt = P01Y94_A4364GrdTipArt[0] ;
         A5654Mgen_com = P01Y94_A5654Mgen_com[0] ;
         A5655Mgen_val = P01Y94_A5655Mgen_val[0] ;
         n5655Mgen_val = P01Y94_n5655Mgen_val[0] ;
         AV16MGEN_VAL = A5655Mgen_val ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      AV17TIFI_T = (short)(0) ;
      AV18TIFI_F = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01Y95 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(AV8GrdTipArt)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A4364GrdTipArt = P01Y95_A4364GrdTipArt[0] ;
         A5659Tifi_vf = P01Y95_A5659Tifi_vf[0] ;
         n5659Tifi_vf = P01Y95_n5659Tifi_vf[0] ;
         A5658Tifi_vi = P01Y95_A5658Tifi_vi[0] ;
         n5658Tifi_vi = P01Y95_n5658Tifi_vi[0] ;
         A5660Tifi_t = P01Y95_A5660Tifi_t[0] ;
         n5660Tifi_t = P01Y95_n5660Tifi_t[0] ;
         A5661Tifi_f = P01Y95_A5661Tifi_f[0] ;
         n5661Tifi_f = P01Y95_n5661Tifi_f[0] ;
         A5657Tifi_l = P01Y95_A5657Tifi_l[0] ;
         if ( ( DecimalUtil.compareTo(AV15ForCan, A5658Tifi_vi) >= 0 ) && ( DecimalUtil.compareTo(AV15ForCan, A5659Tifi_vf) <= 0 ) )
         {
            AV17TIFI_T = A5660Tifi_t ;
            AV18TIFI_F = A5661Tifi_f ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV11Pcm = (AV19ForCosForm.add((AV13COSTE_MSA.multiply(DecimalUtil.doubleToDec(AV17TIFI_T)).multiply(AV18TIFI_F))).add((AV14COSTE_MCA.subtract(AV13COSTE_MSA)).multiply(AV18TIFI_F).multiply(DecimalUtil.doubleToDec(AV17TIFI_T)))).multiply(AV16MGEN_VAL) ;
      AV20Pv = DecimalUtil.doubleToDec(0) ;
      AV21Pc = AV19ForCosForm.add((AV14COSTE_MCA.multiply(DecimalUtil.doubleToDec(AV17TIFI_T)))) ;
      if ( DecimalUtil.doubleToDec(1).subtract((AV16MGEN_VAL.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).doubleValue() > 0 )
      {
         if ( DecimalUtil.compareTo(GXutil.roundDecimal( AV21Pc.divide((DecimalUtil.doubleToDec(1).subtract((AV16MGEN_VAL.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)))), 18, java.math.RoundingMode.DOWN), 2), DecimalUtil.stringToDec("999999.999")) > 0 )
         {
            AV20Pv = DecimalUtil.stringToDec("999999.999") ;
         }
         else
         {
            AV20Pv = GXutil.roundDecimal( AV21Pc.divide((DecimalUtil.doubleToDec(1).subtract((AV16MGEN_VAL.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)))), 18, java.math.RoundingMode.DOWN), 2) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = pprecli1.this.AV11Pcm;
      this.aP6[0] = pprecli1.this.AV15ForCan;
      this.aP7[0] = pprecli1.this.AV14COSTE_MCA;
      this.aP8[0] = pprecli1.this.AV13COSTE_MSA;
      this.aP9[0] = pprecli1.this.AV12FACTOR_IN;
      this.aP10[0] = pprecli1.this.AV16MGEN_VAL;
      this.aP11[0] = pprecli1.this.AV18TIFI_F;
      this.aP12[0] = pprecli1.this.AV20Pv;
      this.aP13[0] = pprecli1.this.AV17TIFI_T;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Pcm = DecimalUtil.ZERO ;
      AV15ForCan = DecimalUtil.ZERO ;
      AV14COSTE_MCA = DecimalUtil.ZERO ;
      AV13COSTE_MSA = DecimalUtil.ZERO ;
      AV12FACTOR_IN = DecimalUtil.ZERO ;
      AV16MGEN_VAL = DecimalUtil.ZERO ;
      AV18TIFI_F = DecimalUtil.ZERO ;
      AV20Pv = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01Y92_A396EmprCod = new String[] {""} ;
      P01Y92_A5650Coste_mca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01Y92_n5650Coste_mca = new boolean[] {false} ;
      P01Y92_A5651Coste_msa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01Y92_n5651Coste_msa = new boolean[] {false} ;
      P01Y92_A5652Factor_in = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01Y92_n5652Factor_in = new boolean[] {false} ;
      A5650Coste_mca = DecimalUtil.ZERO ;
      A5651Coste_msa = DecimalUtil.ZERO ;
      A5652Factor_in = DecimalUtil.ZERO ;
      c481ForCan = DecimalUtil.ZERO ;
      P01Y93_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01Y94_A396EmprCod = new String[] {""} ;
      P01Y94_A4364GrdTipArt = new short[1] ;
      P01Y94_A5654Mgen_com = new String[] {""} ;
      P01Y94_A5655Mgen_val = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01Y94_n5655Mgen_val = new boolean[] {false} ;
      A5654Mgen_com = "" ;
      A5655Mgen_val = DecimalUtil.ZERO ;
      P01Y95_A396EmprCod = new String[] {""} ;
      P01Y95_A4364GrdTipArt = new short[1] ;
      P01Y95_A5659Tifi_vf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01Y95_n5659Tifi_vf = new boolean[] {false} ;
      P01Y95_A5658Tifi_vi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01Y95_n5658Tifi_vi = new boolean[] {false} ;
      P01Y95_A5660Tifi_t = new short[1] ;
      P01Y95_n5660Tifi_t = new boolean[] {false} ;
      P01Y95_A5661Tifi_f = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01Y95_n5661Tifi_f = new boolean[] {false} ;
      P01Y95_A5657Tifi_l = new short[1] ;
      A5659Tifi_vf = DecimalUtil.ZERO ;
      A5658Tifi_vi = DecimalUtil.ZERO ;
      A5661Tifi_f = DecimalUtil.ZERO ;
      AV21Pc = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprecli1__default(),
         new Object[] {
             new Object[] {
            P01Y92_A396EmprCod, P01Y92_A5650Coste_mca, P01Y92_n5650Coste_mca, P01Y92_A5651Coste_msa, P01Y92_n5651Coste_msa, P01Y92_A5652Factor_in, P01Y92_n5652Factor_in
            }
            , new Object[] {
            P01Y93_A481ForCan
            }
            , new Object[] {
            P01Y94_A396EmprCod, P01Y94_A4364GrdTipArt, P01Y94_A5654Mgen_com, P01Y94_A5655Mgen_val, P01Y94_n5655Mgen_val
            }
            , new Object[] {
            P01Y95_A396EmprCod, P01Y95_A4364GrdTipArt, P01Y95_A5659Tifi_vf, P01Y95_n5659Tifi_vf, P01Y95_A5658Tifi_vi, P01Y95_n5658Tifi_vi, P01Y95_A5660Tifi_t, P01Y95_n5660Tifi_t, P01Y95_A5661Tifi_f, P01Y95_n5661Tifi_f,
            P01Y95_A5657Tifi_l
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8GrdTipArt ;
   private short AV17TIFI_T ;
   private short A4364GrdTipArt ;
   private short A5660Tifi_t ;
   private short A5657Tifi_l ;
   private short Gx_err ;
   private int AV10ForNumCol ;
   private java.math.BigDecimal AV19ForCosForm ;
   private java.math.BigDecimal AV11Pcm ;
   private java.math.BigDecimal AV15ForCan ;
   private java.math.BigDecimal AV14COSTE_MCA ;
   private java.math.BigDecimal AV13COSTE_MSA ;
   private java.math.BigDecimal AV12FACTOR_IN ;
   private java.math.BigDecimal AV16MGEN_VAL ;
   private java.math.BigDecimal AV18TIFI_F ;
   private java.math.BigDecimal AV20Pv ;
   private java.math.BigDecimal A5650Coste_mca ;
   private java.math.BigDecimal A5651Coste_msa ;
   private java.math.BigDecimal A5652Factor_in ;
   private java.math.BigDecimal c481ForCan ;
   private java.math.BigDecimal A5655Mgen_val ;
   private java.math.BigDecimal A5659Tifi_vf ;
   private java.math.BigDecimal A5658Tifi_vi ;
   private java.math.BigDecimal A5661Tifi_f ;
   private java.math.BigDecimal AV21Pc ;
   private String A396EmprCod ;
   private String AV9CliTipo ;
   private String scmdbuf ;
   private String A5654Mgen_com ;
   private boolean n5650Coste_mca ;
   private boolean n5651Coste_msa ;
   private boolean n5652Factor_in ;
   private boolean n5655Mgen_val ;
   private boolean n5659Tifi_vf ;
   private boolean n5658Tifi_vi ;
   private boolean n5660Tifi_t ;
   private boolean n5661Tifi_f ;
   private short[] aP13 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P01Y92_A396EmprCod ;
   private java.math.BigDecimal[] P01Y92_A5650Coste_mca ;
   private boolean[] P01Y92_n5650Coste_mca ;
   private java.math.BigDecimal[] P01Y92_A5651Coste_msa ;
   private boolean[] P01Y92_n5651Coste_msa ;
   private java.math.BigDecimal[] P01Y92_A5652Factor_in ;
   private boolean[] P01Y92_n5652Factor_in ;
   private java.math.BigDecimal[] P01Y93_A481ForCan ;
   private String[] P01Y94_A396EmprCod ;
   private short[] P01Y94_A4364GrdTipArt ;
   private String[] P01Y94_A5654Mgen_com ;
   private java.math.BigDecimal[] P01Y94_A5655Mgen_val ;
   private boolean[] P01Y94_n5655Mgen_val ;
   private String[] P01Y95_A396EmprCod ;
   private short[] P01Y95_A4364GrdTipArt ;
   private java.math.BigDecimal[] P01Y95_A5659Tifi_vf ;
   private boolean[] P01Y95_n5659Tifi_vf ;
   private java.math.BigDecimal[] P01Y95_A5658Tifi_vi ;
   private boolean[] P01Y95_n5658Tifi_vi ;
   private short[] P01Y95_A5660Tifi_t ;
   private boolean[] P01Y95_n5660Tifi_t ;
   private java.math.BigDecimal[] P01Y95_A5661Tifi_f ;
   private boolean[] P01Y95_n5661Tifi_f ;
   private short[] P01Y95_A5657Tifi_l ;
}

final  class pprecli1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01Y92", "SELECT EmprCod, Coste_mca, Coste_msa, Factor_in FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01Y93", "SELECT SUM(ForCan) FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01Y94", "SELECT EmprCod, GrdTipArt, Mgen_com, Mgen_val FROM TXPLMARCO WHERE EmprCod = ? and Mgen_com = ? and GrdTipArt = ? ORDER BY EmprCod, Mgen_com, GrdTipArt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01Y95", "SELECT EmprCod, GrdTipArt, Tifi_vf, Tifi_vi, Tifi_t, Tifi_f, Tifi_l FROM TXPTIxFI WHERE EmprCod = ? and GrdTipArt = ? ORDER BY EmprCod, GrdTipArt, Tifi_l ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,8);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

