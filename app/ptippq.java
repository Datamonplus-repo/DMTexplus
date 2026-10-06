package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptippq extends GXProcedure
{
   public ptippq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptippq.class ), "" );
   }

   public ptippq( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          short[] aP4 ,
                          byte[] aP5 ,
                          String[] aP6 ,
                          short[] aP7 ,
                          String[] aP8 ,
                          java.math.BigDecimal[] aP9 )
   {
      ptippq.this.aP10 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        int[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             int[] aP10 )
   {
      ptippq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptippq.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ptippq.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ptippq.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      ptippq.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      ptippq.this.A1273RecLinPro = aP5[0];
      this.aP5 = aP5;
      ptippq.this.AV8Proforfab = aP6[0];
      this.aP6 = aP6;
      ptippq.this.AV9RecOrdlin = aP7[0];
      this.aP7 = aP7;
      ptippq.this.AV10RecmaqFas = aP8[0];
      this.aP8 = aP8;
      ptippq.this.AV12FASUNPLT = aP9[0];
      this.aP9 = aP9;
      ptippq.this.AV13RecTotprd = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Proforfab = "" ;
      /* Using cursor P038D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4268RecOrdLin = P038D2_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P038D2_n4268RecOrdLin[0] ;
         A4258RecMaqFas = P038D2_A4258RecMaqFas[0] ;
         n4258RecMaqFas = P038D2_n4258RecMaqFas[0] ;
         A4261RecTotPrd = P038D2_A4261RecTotPrd[0] ;
         n4261RecTotPrd = P038D2_n4261RecTotPrd[0] ;
         AV9RecOrdlin = A4268RecOrdLin ;
         AV10RecmaqFas = A4258RecMaqFas ;
         AV13RecTotprd = A4261RecTotPrd ;
         /* Using cursor P038D3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A764ProForCod = P038D3_A764ProForCod[0] ;
            A6018ProForFab = P038D3_A6018ProForFab[0] ;
            n6018ProForFab = P038D3_n6018ProForFab[0] ;
            A6018ProForFab = P038D3_A6018ProForFab[0] ;
            n6018ProForFab = P038D3_n6018ProForFab[0] ;
            AV8Proforfab = A6018ProForFab ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV11BarfasUnpL = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P038D4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV9RecOrdlin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A194BarOrdLin = P038D4_A194BarOrdLin[0] ;
         A7913BarfasUnpL = P038D4_A7913BarfasUnpL[0] ;
         n7913BarfasUnpL = P038D4_n7913BarfasUnpL[0] ;
         A758ProCod = P038D4_A758ProCod[0] ;
         AV11BarfasUnpL = A7913BarfasUnpL ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV12FASUNPLT = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P038D5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV10RecmaqFas});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A457FasCod = P038D5_A457FasCod[0] ;
         A6881FasUnpLt = P038D5_A6881FasUnpLt[0] ;
         n6881FasUnpLt = P038D5_n6881FasUnpLt[0] ;
         AV12FASUNPLT = A6881FasUnpLt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV11BarfasUnpL)==0) )
      {
         AV12FASUNPLT = AV11BarfasUnpL ;
      }
      if ( AV12FASUNPLT.doubleValue() == 0 )
      {
         AV12FASUNPLT = DecimalUtil.doubleToDec(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptippq.this.A396EmprCod;
      this.aP1[0] = ptippq.this.A129BarCod;
      this.aP2[0] = ptippq.this.A132BarCodReo;
      this.aP3[0] = ptippq.this.A130BarCodPar;
      this.aP4[0] = ptippq.this.A2804RecLinMaq;
      this.aP5[0] = ptippq.this.A1273RecLinPro;
      this.aP6[0] = ptippq.this.AV8Proforfab;
      this.aP7[0] = ptippq.this.AV9RecOrdlin;
      this.aP8[0] = ptippq.this.AV10RecmaqFas;
      this.aP9[0] = ptippq.this.AV12FASUNPLT;
      this.aP10[0] = ptippq.this.AV13RecTotprd;
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
      P038D2_A396EmprCod = new String[] {""} ;
      P038D2_A129BarCod = new int[1] ;
      P038D2_A132BarCodReo = new byte[1] ;
      P038D2_A130BarCodPar = new String[] {""} ;
      P038D2_A2804RecLinMaq = new short[1] ;
      P038D2_A4268RecOrdLin = new short[1] ;
      P038D2_n4268RecOrdLin = new boolean[] {false} ;
      P038D2_A4258RecMaqFas = new String[] {""} ;
      P038D2_n4258RecMaqFas = new boolean[] {false} ;
      P038D2_A4261RecTotPrd = new int[1] ;
      P038D2_n4261RecTotPrd = new boolean[] {false} ;
      A4258RecMaqFas = "" ;
      P038D3_A764ProForCod = new String[] {""} ;
      P038D3_A396EmprCod = new String[] {""} ;
      P038D3_A129BarCod = new int[1] ;
      P038D3_A132BarCodReo = new byte[1] ;
      P038D3_A130BarCodPar = new String[] {""} ;
      P038D3_A2804RecLinMaq = new short[1] ;
      P038D3_A1273RecLinPro = new byte[1] ;
      P038D3_A6018ProForFab = new String[] {""} ;
      P038D3_n6018ProForFab = new boolean[] {false} ;
      A764ProForCod = "" ;
      A6018ProForFab = "" ;
      AV11BarfasUnpL = DecimalUtil.ZERO ;
      P038D4_A396EmprCod = new String[] {""} ;
      P038D4_A129BarCod = new int[1] ;
      P038D4_A132BarCodReo = new byte[1] ;
      P038D4_A130BarCodPar = new String[] {""} ;
      P038D4_A194BarOrdLin = new short[1] ;
      P038D4_A7913BarfasUnpL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P038D4_n7913BarfasUnpL = new boolean[] {false} ;
      P038D4_A758ProCod = new String[] {""} ;
      A7913BarfasUnpL = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      P038D5_A396EmprCod = new String[] {""} ;
      P038D5_A457FasCod = new String[] {""} ;
      P038D5_A6881FasUnpLt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P038D5_n6881FasUnpLt = new boolean[] {false} ;
      A457FasCod = "" ;
      A6881FasUnpLt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptippq__default(),
         new Object[] {
             new Object[] {
            P038D2_A396EmprCod, P038D2_A129BarCod, P038D2_A132BarCodReo, P038D2_A130BarCodPar, P038D2_A2804RecLinMaq, P038D2_A4268RecOrdLin, P038D2_n4268RecOrdLin, P038D2_A4258RecMaqFas, P038D2_n4258RecMaqFas, P038D2_A4261RecTotPrd,
            P038D2_n4261RecTotPrd
            }
            , new Object[] {
            P038D3_A764ProForCod, P038D3_A396EmprCod, P038D3_A129BarCod, P038D3_A132BarCodReo, P038D3_A130BarCodPar, P038D3_A2804RecLinMaq, P038D3_A1273RecLinPro, P038D3_A6018ProForFab, P038D3_n6018ProForFab
            }
            , new Object[] {
            P038D4_A396EmprCod, P038D4_A129BarCod, P038D4_A132BarCodReo, P038D4_A130BarCodPar, P038D4_A194BarOrdLin, P038D4_A7913BarfasUnpL, P038D4_n7913BarfasUnpL, P038D4_A758ProCod
            }
            , new Object[] {
            P038D5_A396EmprCod, P038D5_A457FasCod, P038D5_A6881FasUnpLt, P038D5_n6881FasUnpLt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short A2804RecLinMaq ;
   private short AV9RecOrdlin ;
   private short A4268RecOrdLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV13RecTotprd ;
   private int A4261RecTotPrd ;
   private java.math.BigDecimal AV12FASUNPLT ;
   private java.math.BigDecimal AV11BarfasUnpL ;
   private java.math.BigDecimal A7913BarfasUnpL ;
   private java.math.BigDecimal A6881FasUnpLt ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Proforfab ;
   private String AV10RecmaqFas ;
   private String scmdbuf ;
   private String A4258RecMaqFas ;
   private String A764ProForCod ;
   private String A6018ProForFab ;
   private String A758ProCod ;
   private String A457FasCod ;
   private boolean n4268RecOrdLin ;
   private boolean n4258RecMaqFas ;
   private boolean n4261RecTotPrd ;
   private boolean n6018ProForFab ;
   private boolean n7913BarfasUnpL ;
   private boolean n6881FasUnpLt ;
   private int[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P038D2_A396EmprCod ;
   private int[] P038D2_A129BarCod ;
   private byte[] P038D2_A132BarCodReo ;
   private String[] P038D2_A130BarCodPar ;
   private short[] P038D2_A2804RecLinMaq ;
   private short[] P038D2_A4268RecOrdLin ;
   private boolean[] P038D2_n4268RecOrdLin ;
   private String[] P038D2_A4258RecMaqFas ;
   private boolean[] P038D2_n4258RecMaqFas ;
   private int[] P038D2_A4261RecTotPrd ;
   private boolean[] P038D2_n4261RecTotPrd ;
   private String[] P038D3_A764ProForCod ;
   private String[] P038D3_A396EmprCod ;
   private int[] P038D3_A129BarCod ;
   private byte[] P038D3_A132BarCodReo ;
   private String[] P038D3_A130BarCodPar ;
   private short[] P038D3_A2804RecLinMaq ;
   private byte[] P038D3_A1273RecLinPro ;
   private String[] P038D3_A6018ProForFab ;
   private boolean[] P038D3_n6018ProForFab ;
   private String[] P038D4_A396EmprCod ;
   private int[] P038D4_A129BarCod ;
   private byte[] P038D4_A132BarCodReo ;
   private String[] P038D4_A130BarCodPar ;
   private short[] P038D4_A194BarOrdLin ;
   private java.math.BigDecimal[] P038D4_A7913BarfasUnpL ;
   private boolean[] P038D4_n7913BarfasUnpL ;
   private String[] P038D4_A758ProCod ;
   private String[] P038D5_A396EmprCod ;
   private String[] P038D5_A457FasCod ;
   private java.math.BigDecimal[] P038D5_A6881FasUnpLt ;
   private boolean[] P038D5_n6881FasUnpLt ;
}

final  class ptippq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P038D2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecOrdLin, RecMaqFas, RecTotPrd FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P038D3", "SELECT T1.ProForCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T2.ProForFab FROM (TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P038D4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarfasUnpL, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P038D5", "SELECT EmprCod, FasCod, FasUnpLt FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

