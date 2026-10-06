package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrpag extends GXProcedure
{
   public pctrpag( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrpag.class ), "" );
   }

   public pctrpag( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           byte[] aP5 )
   {
      pctrpag.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 )
   {
      pctrpag.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrpag.this.AV13BarCod = aP1[0];
      this.aP1 = aP1;
      pctrpag.this.AV14BarCodReo = aP2[0];
      this.aP2 = aP2;
      pctrpag.this.AV15BarCodPar = aP3[0];
      this.aP3 = aP3;
      pctrpag.this.AV8ProCod = aP4[0];
      this.aP4 = aP4;
      pctrpag.this.AV16Agrhdf = aP5[0];
      this.aP5 = aP5;
      pctrpag.this.AV17Agrhdfs = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Agrhdf = (byte)(0) ;
      /* Using cursor P02572 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar, AV8ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A758ProCod = P02572_A758ProCod[0] ;
         A130BarCodPar = P02572_A130BarCodPar[0] ;
         A132BarCodReo = P02572_A132BarCodReo[0] ;
         A129BarCod = P02572_A129BarCod[0] ;
         A4946A_Kilos = P02572_A4946A_Kilos[0] ;
         n4946A_Kilos = P02572_n4946A_Kilos[0] ;
         A194BarOrdLin = P02572_A194BarOrdLin[0] ;
         A4940A_Barcod = P02572_A4940A_Barcod[0] ;
         A4941A_BarReo = P02572_A4941A_BarReo[0] ;
         A4942A_BarPar = P02572_A4942A_BarPar[0] ;
         A4943A_ProCod = P02572_A4943A_ProCod[0] ;
         A4944A_BarOrd = P02572_A4944A_BarOrd[0] ;
         AV16Agrhdf = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV17Agrhdfs = (byte)(0) ;
      /* Using cursor P02573 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar, AV8ProCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4940A_Barcod = P02573_A4940A_Barcod[0] ;
         A4941A_BarReo = P02573_A4941A_BarReo[0] ;
         A4942A_BarPar = P02573_A4942A_BarPar[0] ;
         A4943A_ProCod = P02573_A4943A_ProCod[0] ;
         A4944A_BarOrd = P02573_A4944A_BarOrd[0] ;
         A129BarCod = P02573_A129BarCod[0] ;
         A132BarCodReo = P02573_A132BarCodReo[0] ;
         A130BarCodPar = P02573_A130BarCodPar[0] ;
         A758ProCod = P02573_A758ProCod[0] ;
         A194BarOrdLin = P02573_A194BarOrdLin[0] ;
         AV17Agrhdfs = (byte)(1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrpag.this.A396EmprCod;
      this.aP1[0] = pctrpag.this.AV13BarCod;
      this.aP2[0] = pctrpag.this.AV14BarCodReo;
      this.aP3[0] = pctrpag.this.AV15BarCodPar;
      this.aP4[0] = pctrpag.this.AV8ProCod;
      this.aP5[0] = pctrpag.this.AV16Agrhdf;
      this.aP6[0] = pctrpag.this.AV17Agrhdfs;
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
      P02572_A396EmprCod = new String[] {""} ;
      P02572_A758ProCod = new String[] {""} ;
      P02572_A130BarCodPar = new String[] {""} ;
      P02572_A132BarCodReo = new byte[1] ;
      P02572_A129BarCod = new int[1] ;
      P02572_A4946A_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02572_n4946A_Kilos = new boolean[] {false} ;
      P02572_A194BarOrdLin = new short[1] ;
      P02572_A4940A_Barcod = new int[1] ;
      P02572_A4941A_BarReo = new byte[1] ;
      P02572_A4942A_BarPar = new String[] {""} ;
      P02572_A4943A_ProCod = new String[] {""} ;
      P02572_A4944A_BarOrd = new short[1] ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A4946A_Kilos = DecimalUtil.ZERO ;
      A4942A_BarPar = "" ;
      A4943A_ProCod = "" ;
      P02573_A396EmprCod = new String[] {""} ;
      P02573_A4940A_Barcod = new int[1] ;
      P02573_A4941A_BarReo = new byte[1] ;
      P02573_A4942A_BarPar = new String[] {""} ;
      P02573_A4943A_ProCod = new String[] {""} ;
      P02573_A4944A_BarOrd = new short[1] ;
      P02573_A129BarCod = new int[1] ;
      P02573_A132BarCodReo = new byte[1] ;
      P02573_A130BarCodPar = new String[] {""} ;
      P02573_A758ProCod = new String[] {""} ;
      P02573_A194BarOrdLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrpag__default(),
         new Object[] {
             new Object[] {
            P02572_A396EmprCod, P02572_A758ProCod, P02572_A130BarCodPar, P02572_A132BarCodReo, P02572_A129BarCod, P02572_A4946A_Kilos, P02572_n4946A_Kilos, P02572_A194BarOrdLin, P02572_A4940A_Barcod, P02572_A4941A_BarReo,
            P02572_A4942A_BarPar, P02572_A4943A_ProCod, P02572_A4944A_BarOrd
            }
            , new Object[] {
            P02573_A396EmprCod, P02573_A4940A_Barcod, P02573_A4941A_BarReo, P02573_A4942A_BarPar, P02573_A4943A_ProCod, P02573_A4944A_BarOrd, P02573_A129BarCod, P02573_A132BarCodReo, P02573_A130BarCodPar, P02573_A758ProCod,
            P02573_A194BarOrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14BarCodReo ;
   private byte AV16Agrhdf ;
   private byte AV17Agrhdfs ;
   private byte A132BarCodReo ;
   private byte A4941A_BarReo ;
   private short A194BarOrdLin ;
   private short A4944A_BarOrd ;
   private short Gx_err ;
   private int AV13BarCod ;
   private int A129BarCod ;
   private int A4940A_Barcod ;
   private java.math.BigDecimal A4946A_Kilos ;
   private String A396EmprCod ;
   private String AV15BarCodPar ;
   private String AV8ProCod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A4942A_BarPar ;
   private String A4943A_ProCod ;
   private boolean n4946A_Kilos ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02572_A396EmprCod ;
   private String[] P02572_A758ProCod ;
   private String[] P02572_A130BarCodPar ;
   private byte[] P02572_A132BarCodReo ;
   private int[] P02572_A129BarCod ;
   private java.math.BigDecimal[] P02572_A4946A_Kilos ;
   private boolean[] P02572_n4946A_Kilos ;
   private short[] P02572_A194BarOrdLin ;
   private int[] P02572_A4940A_Barcod ;
   private byte[] P02572_A4941A_BarReo ;
   private String[] P02572_A4942A_BarPar ;
   private String[] P02572_A4943A_ProCod ;
   private short[] P02572_A4944A_BarOrd ;
   private String[] P02573_A396EmprCod ;
   private int[] P02573_A4940A_Barcod ;
   private byte[] P02573_A4941A_BarReo ;
   private String[] P02573_A4942A_BarPar ;
   private String[] P02573_A4943A_ProCod ;
   private short[] P02573_A4944A_BarOrd ;
   private int[] P02573_A129BarCod ;
   private byte[] P02573_A132BarCodReo ;
   private String[] P02573_A130BarCodPar ;
   private String[] P02573_A758ProCod ;
   private short[] P02573_A194BarOrdLin ;
}

final  class pctrpag__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02572", "SELECT EmprCod, ProCod, BarCodPar, BarCodReo, BarCod, A_Kilos, BarOrdLin, A_Barcod, A_BarReo, A_BarPar, A_ProCod, A_BarOrd FROM TXPAGRHDF WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02573", "SELECT EmprCod, A_Barcod, A_BarReo, A_BarPar, A_ProCod, A_BarOrd, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPAGRHDF WHERE EmprCod = ? and A_Barcod = ? and A_BarReo = ? and A_BarPar = ? and A_ProCod = ? ORDER BY EmprCod, A_Barcod, A_BarReo, A_BarPar, A_ProCod, A_BarOrd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((short[]) buf[10])[0] = rslt.getShort(11);
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
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

