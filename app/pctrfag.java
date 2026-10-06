package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrfag extends GXProcedure
{
   public pctrfag( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrfag.class ), "" );
   }

   public pctrfag( int remoteHandle ,
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
                           short[] aP5 ,
                           byte[] aP6 )
   {
      pctrfag.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        byte[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 )
   {
      pctrfag.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrfag.this.AV13BarCod = aP1[0];
      this.aP1 = aP1;
      pctrfag.this.AV14BarCodReo = aP2[0];
      this.aP2 = aP2;
      pctrfag.this.AV15BarCodPar = aP3[0];
      this.aP3 = aP3;
      pctrfag.this.AV8ProCod = aP4[0];
      this.aP4 = aP4;
      pctrfag.this.AV9BarOrdLin = aP5[0];
      this.aP5 = aP5;
      pctrfag.this.AV16Agrhdf = aP6[0];
      this.aP6 = aP6;
      pctrfag.this.AV17Agrhdfs = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Agrhdf = (byte)(0) ;
      /* Using cursor P02562 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar, AV8ProCod, Short.valueOf(AV9BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P02562_A194BarOrdLin[0] ;
         A758ProCod = P02562_A758ProCod[0] ;
         A130BarCodPar = P02562_A130BarCodPar[0] ;
         A132BarCodReo = P02562_A132BarCodReo[0] ;
         A129BarCod = P02562_A129BarCod[0] ;
         A4946A_Kilos = P02562_A4946A_Kilos[0] ;
         n4946A_Kilos = P02562_n4946A_Kilos[0] ;
         A4940A_Barcod = P02562_A4940A_Barcod[0] ;
         A4941A_BarReo = P02562_A4941A_BarReo[0] ;
         A4942A_BarPar = P02562_A4942A_BarPar[0] ;
         A4943A_ProCod = P02562_A4943A_ProCod[0] ;
         A4944A_BarOrd = P02562_A4944A_BarOrd[0] ;
         AV16Agrhdf = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV17Agrhdfs = (byte)(0) ;
      /* Using cursor P02563 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar, AV8ProCod, Short.valueOf(AV9BarOrdLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4940A_Barcod = P02563_A4940A_Barcod[0] ;
         A4941A_BarReo = P02563_A4941A_BarReo[0] ;
         A4942A_BarPar = P02563_A4942A_BarPar[0] ;
         A4943A_ProCod = P02563_A4943A_ProCod[0] ;
         A4944A_BarOrd = P02563_A4944A_BarOrd[0] ;
         A129BarCod = P02563_A129BarCod[0] ;
         A132BarCodReo = P02563_A132BarCodReo[0] ;
         A130BarCodPar = P02563_A130BarCodPar[0] ;
         A758ProCod = P02563_A758ProCod[0] ;
         A194BarOrdLin = P02563_A194BarOrdLin[0] ;
         AV17Agrhdfs = (byte)(1) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrfag.this.A396EmprCod;
      this.aP1[0] = pctrfag.this.AV13BarCod;
      this.aP2[0] = pctrfag.this.AV14BarCodReo;
      this.aP3[0] = pctrfag.this.AV15BarCodPar;
      this.aP4[0] = pctrfag.this.AV8ProCod;
      this.aP5[0] = pctrfag.this.AV9BarOrdLin;
      this.aP6[0] = pctrfag.this.AV16Agrhdf;
      this.aP7[0] = pctrfag.this.AV17Agrhdfs;
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
      P02562_A396EmprCod = new String[] {""} ;
      P02562_A194BarOrdLin = new short[1] ;
      P02562_A758ProCod = new String[] {""} ;
      P02562_A130BarCodPar = new String[] {""} ;
      P02562_A132BarCodReo = new byte[1] ;
      P02562_A129BarCod = new int[1] ;
      P02562_A4946A_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02562_n4946A_Kilos = new boolean[] {false} ;
      P02562_A4940A_Barcod = new int[1] ;
      P02562_A4941A_BarReo = new byte[1] ;
      P02562_A4942A_BarPar = new String[] {""} ;
      P02562_A4943A_ProCod = new String[] {""} ;
      P02562_A4944A_BarOrd = new short[1] ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A4946A_Kilos = DecimalUtil.ZERO ;
      A4942A_BarPar = "" ;
      A4943A_ProCod = "" ;
      P02563_A396EmprCod = new String[] {""} ;
      P02563_A4940A_Barcod = new int[1] ;
      P02563_A4941A_BarReo = new byte[1] ;
      P02563_A4942A_BarPar = new String[] {""} ;
      P02563_A4943A_ProCod = new String[] {""} ;
      P02563_A4944A_BarOrd = new short[1] ;
      P02563_A129BarCod = new int[1] ;
      P02563_A132BarCodReo = new byte[1] ;
      P02563_A130BarCodPar = new String[] {""} ;
      P02563_A758ProCod = new String[] {""} ;
      P02563_A194BarOrdLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrfag__default(),
         new Object[] {
             new Object[] {
            P02562_A396EmprCod, P02562_A194BarOrdLin, P02562_A758ProCod, P02562_A130BarCodPar, P02562_A132BarCodReo, P02562_A129BarCod, P02562_A4946A_Kilos, P02562_n4946A_Kilos, P02562_A4940A_Barcod, P02562_A4941A_BarReo,
            P02562_A4942A_BarPar, P02562_A4943A_ProCod, P02562_A4944A_BarOrd
            }
            , new Object[] {
            P02563_A396EmprCod, P02563_A4940A_Barcod, P02563_A4941A_BarReo, P02563_A4942A_BarPar, P02563_A4943A_ProCod, P02563_A4944A_BarOrd, P02563_A129BarCod, P02563_A132BarCodReo, P02563_A130BarCodPar, P02563_A758ProCod,
            P02563_A194BarOrdLin
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
   private short AV9BarOrdLin ;
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
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P02562_A396EmprCod ;
   private short[] P02562_A194BarOrdLin ;
   private String[] P02562_A758ProCod ;
   private String[] P02562_A130BarCodPar ;
   private byte[] P02562_A132BarCodReo ;
   private int[] P02562_A129BarCod ;
   private java.math.BigDecimal[] P02562_A4946A_Kilos ;
   private boolean[] P02562_n4946A_Kilos ;
   private int[] P02562_A4940A_Barcod ;
   private byte[] P02562_A4941A_BarReo ;
   private String[] P02562_A4942A_BarPar ;
   private String[] P02562_A4943A_ProCod ;
   private short[] P02562_A4944A_BarOrd ;
   private String[] P02563_A396EmprCod ;
   private int[] P02563_A4940A_Barcod ;
   private byte[] P02563_A4941A_BarReo ;
   private String[] P02563_A4942A_BarPar ;
   private String[] P02563_A4943A_ProCod ;
   private short[] P02563_A4944A_BarOrd ;
   private int[] P02563_A129BarCod ;
   private byte[] P02563_A132BarCodReo ;
   private String[] P02563_A130BarCodPar ;
   private String[] P02563_A758ProCod ;
   private short[] P02563_A194BarOrdLin ;
}

final  class pctrfag__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02562", "SELECT EmprCod, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, A_Kilos, A_Barcod, A_BarReo, A_BarPar, A_ProCod, A_BarOrd FROM TXPAGRHDF WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02563", "SELECT EmprCod, A_Barcod, A_BarReo, A_BarPar, A_ProCod, A_BarOrd, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPAGRHDF WHERE EmprCod = ? and A_Barcod = ? and A_BarReo = ? and A_BarPar = ? and A_ProCod = ? and A_BarOrd = ? ORDER BY EmprCod, A_Barcod, A_BarReo, A_BarPar, A_ProCod, A_BarOrd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

