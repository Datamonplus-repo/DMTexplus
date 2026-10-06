package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prelan1 extends GXProcedure
{
   public prelan1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prelan1.class ), "" );
   }

   public prelan1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            short[] aP4 ,
                            String[] aP5 ,
                            short[] aP6 ,
                            String[] aP7 ,
                            java.math.BigDecimal[] aP8 )
   {
      prelan1.this.aP9 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        short[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             short[] aP9 )
   {
      prelan1.this.AV35EmprCod = aP0[0];
      this.aP0 = aP0;
      prelan1.this.AV23BarCod = aP1[0];
      this.aP1 = aP1;
      prelan1.this.AV24BarCodReo = aP2[0];
      this.aP2 = aP2;
      prelan1.this.AV25BarCodPar = aP3[0];
      this.aP3 = aP3;
      prelan1.this.AV26RecLinMaq = aP4[0];
      this.aP4 = aP4;
      prelan1.this.AV36Recal = aP5[0];
      this.aP5 = aP5;
      prelan1.this.AV33RecOrdLin = aP6[0];
      this.aP6 = aP6;
      prelan1.this.AV34ProCod = aP7[0];
      this.aP7 = aP7;
      prelan1.this.AV32Kgs_for = aP8[0];
      this.aP8 = aP8;
      prelan1.this.AV31Tot_rgtos = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02EM2 */
      pr_default.execute(0, new Object[] {AV35EmprCod, Integer.valueOf(AV23BarCod), Byte.valueOf(AV24BarCodReo), AV25BarCodPar, Short.valueOf(AV26RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P02EM2_A2804RecLinMaq[0] ;
         A130BarCodPar = P02EM2_A130BarCodPar[0] ;
         A132BarCodReo = P02EM2_A132BarCodReo[0] ;
         A129BarCod = P02EM2_A129BarCod[0] ;
         A396EmprCod = P02EM2_A396EmprCod[0] ;
         A4268RecOrdLin = P02EM2_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P02EM2_n4268RecOrdLin[0] ;
         AV33RecOrdLin = A4268RecOrdLin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02EM3 */
      pr_default.execute(1, new Object[] {AV35EmprCod, Integer.valueOf(AV23BarCod), Byte.valueOf(AV24BarCodReo), AV25BarCodPar, Short.valueOf(AV33RecOrdLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A194BarOrdLin = P02EM3_A194BarOrdLin[0] ;
         A130BarCodPar = P02EM3_A130BarCodPar[0] ;
         A132BarCodReo = P02EM3_A132BarCodReo[0] ;
         A129BarCod = P02EM3_A129BarCod[0] ;
         A396EmprCod = P02EM3_A396EmprCod[0] ;
         A758ProCod = P02EM3_A758ProCod[0] ;
         AV34ProCod = A758ProCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P02EM5 */
      pr_default.execute(2, new Object[] {AV35EmprCod, Integer.valueOf(AV23BarCod), Byte.valueOf(AV24BarCodReo), AV25BarCodPar, Short.valueOf(AV26RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2804RecLinMaq = P02EM5_A2804RecLinMaq[0] ;
         A130BarCodPar = P02EM5_A130BarCodPar[0] ;
         A132BarCodReo = P02EM5_A132BarCodReo[0] ;
         A129BarCod = P02EM5_A129BarCod[0] ;
         A396EmprCod = P02EM5_A396EmprCod[0] ;
         A2805RecVolPrd = P02EM5_A2805RecVolPrd[0] ;
         A4271RecFagKgs = P02EM5_A4271RecFagKgs[0] ;
         n4271RecFagKgs = P02EM5_n4271RecFagKgs[0] ;
         A4259RecTotKgs = P02EM5_A4259RecTotKgs[0] ;
         A4271RecFagKgs = P02EM5_A4271RecFagKgs[0] ;
         n4271RecFagKgs = P02EM5_n4271RecFagKgs[0] ;
         A4316RecMaqKgs = A4259RecTotKgs.add(A4271RecFagKgs) ;
         AV32Kgs_for = A4316RecMaqKgs ;
         AV31Tot_rgtos = (short)(AV31Tot_rgtos+1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prelan1.this.AV35EmprCod;
      this.aP1[0] = prelan1.this.AV23BarCod;
      this.aP2[0] = prelan1.this.AV24BarCodReo;
      this.aP3[0] = prelan1.this.AV25BarCodPar;
      this.aP4[0] = prelan1.this.AV26RecLinMaq;
      this.aP5[0] = prelan1.this.AV36Recal;
      this.aP6[0] = prelan1.this.AV33RecOrdLin;
      this.aP7[0] = prelan1.this.AV34ProCod;
      this.aP8[0] = prelan1.this.AV32Kgs_for;
      this.aP9[0] = prelan1.this.AV31Tot_rgtos;
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
      P02EM2_A2804RecLinMaq = new short[1] ;
      P02EM2_A130BarCodPar = new String[] {""} ;
      P02EM2_A132BarCodReo = new byte[1] ;
      P02EM2_A129BarCod = new int[1] ;
      P02EM2_A396EmprCod = new String[] {""} ;
      P02EM2_A4268RecOrdLin = new short[1] ;
      P02EM2_n4268RecOrdLin = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P02EM3_A194BarOrdLin = new short[1] ;
      P02EM3_A130BarCodPar = new String[] {""} ;
      P02EM3_A132BarCodReo = new byte[1] ;
      P02EM3_A129BarCod = new int[1] ;
      P02EM3_A396EmprCod = new String[] {""} ;
      P02EM3_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      P02EM5_A2804RecLinMaq = new short[1] ;
      P02EM5_A130BarCodPar = new String[] {""} ;
      P02EM5_A132BarCodReo = new byte[1] ;
      P02EM5_A129BarCod = new int[1] ;
      P02EM5_A396EmprCod = new String[] {""} ;
      P02EM5_A2805RecVolPrd = new int[1] ;
      P02EM5_A4271RecFagKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02EM5_n4271RecFagKgs = new boolean[] {false} ;
      P02EM5_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4271RecFagKgs = DecimalUtil.ZERO ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4316RecMaqKgs = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prelan1__default(),
         new Object[] {
             new Object[] {
            P02EM2_A2804RecLinMaq, P02EM2_A130BarCodPar, P02EM2_A132BarCodReo, P02EM2_A129BarCod, P02EM2_A396EmprCod, P02EM2_A4268RecOrdLin, P02EM2_n4268RecOrdLin
            }
            , new Object[] {
            P02EM3_A194BarOrdLin, P02EM3_A130BarCodPar, P02EM3_A132BarCodReo, P02EM3_A129BarCod, P02EM3_A396EmprCod, P02EM3_A758ProCod
            }
            , new Object[] {
            P02EM5_A2804RecLinMaq, P02EM5_A130BarCodPar, P02EM5_A132BarCodReo, P02EM5_A129BarCod, P02EM5_A396EmprCod, P02EM5_A2805RecVolPrd, P02EM5_A4271RecFagKgs, P02EM5_n4271RecFagKgs, P02EM5_A4259RecTotKgs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24BarCodReo ;
   private byte A132BarCodReo ;
   private short AV26RecLinMaq ;
   private short AV33RecOrdLin ;
   private short AV31Tot_rgtos ;
   private short A2804RecLinMaq ;
   private short A4268RecOrdLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV23BarCod ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private java.math.BigDecimal AV32Kgs_for ;
   private java.math.BigDecimal A4271RecFagKgs ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4316RecMaqKgs ;
   private String AV35EmprCod ;
   private String AV25BarCodPar ;
   private String AV36Recal ;
   private String AV34ProCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private boolean n4268RecOrdLin ;
   private boolean n4271RecFagKgs ;
   private short[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private IDataStoreProvider pr_default ;
   private short[] P02EM2_A2804RecLinMaq ;
   private String[] P02EM2_A130BarCodPar ;
   private byte[] P02EM2_A132BarCodReo ;
   private int[] P02EM2_A129BarCod ;
   private String[] P02EM2_A396EmprCod ;
   private short[] P02EM2_A4268RecOrdLin ;
   private boolean[] P02EM2_n4268RecOrdLin ;
   private short[] P02EM3_A194BarOrdLin ;
   private String[] P02EM3_A130BarCodPar ;
   private byte[] P02EM3_A132BarCodReo ;
   private int[] P02EM3_A129BarCod ;
   private String[] P02EM3_A396EmprCod ;
   private String[] P02EM3_A758ProCod ;
   private short[] P02EM5_A2804RecLinMaq ;
   private String[] P02EM5_A130BarCodPar ;
   private byte[] P02EM5_A132BarCodReo ;
   private int[] P02EM5_A129BarCod ;
   private String[] P02EM5_A396EmprCod ;
   private int[] P02EM5_A2805RecVolPrd ;
   private java.math.BigDecimal[] P02EM5_A4271RecFagKgs ;
   private boolean[] P02EM5_n4271RecFagKgs ;
   private java.math.BigDecimal[] P02EM5_A4259RecTotKgs ;
}

final  class prelan1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02EM2", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, RecOrdLin FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02EM3", "SELECT BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02EM5", "SELECT T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.RecVolPrd, COALESCE( T2.RecFagKgs, 0) AS RecFagKgs, T1.RecTotKgs FROM (TXPRECMAQ T1 LEFT JOIN (SELECT SUM(RecAgrKgs) AS RecFagKgs, EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECFAG GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.RecLinMaq = T1.RecLinMaq) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

