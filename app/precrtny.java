package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precrtny extends GXProcedure
{
   public precrtny( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precrtny.class ), "" );
   }

   public precrtny( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      precrtny.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      precrtny.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      precrtny.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      precrtny.this.AV9barcodreo = aP2[0];
      this.aP2 = aP2;
      precrtny.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      precrtny.this.AV11Reclinmaq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV17Carvema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
      precrtny.this.GXt_int1 = GXv_int2[0] ;
      AV17Carvema = GXt_int1 ;
      /* Using cursor P03CO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9barcodreo), AV10Barcodpar, Short.valueOf(AV11Reclinmaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1273RecLinPro = P03CO2_A1273RecLinPro[0] ;
         A2804RecLinMaq = P03CO2_A2804RecLinMaq[0] ;
         A130BarCodPar = P03CO2_A130BarCodPar[0] ;
         A132BarCodReo = P03CO2_A132BarCodReo[0] ;
         A129BarCod = P03CO2_A129BarCod[0] ;
         /* Using cursor P03CO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A856ValCod = P03CO3_A856ValCod[0] ;
            A718PrdNom = P03CO3_A718PrdNom[0] ;
            A719PrdNum = P03CO3_A719PrdNum[0] ;
            n719PrdNum = P03CO3_n719PrdNum[0] ;
            A686PrdCant = P03CO3_A686PrdCant[0] ;
            A811RecLin = P03CO3_A811RecLin[0] ;
            A856ValCod = P03CO3_A856ValCod[0] ;
            A718PrdNom = P03CO3_A718PrdNom[0] ;
            if ( ( A856ValCod == 3 ) && ( AV17Carvema == 1 ) )
            {
               Gx_msg = httpContext.getMessage( "Atenção. Foi identificado um produto =", "") + A719PrdNum + " " + A718PrdNom + GXutil.newLine( ) + httpContext.getMessage( "como SUPRIMIDO. El sistema continua ¡¡¡", "") ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A686PrdCant)==0) )
            {
               if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 )
               {
                  GXv_char3[0] = A396EmprCod ;
                  GXv_char4[0] = A719PrdNum ;
                  GXv_decimal5[0] = A686PrdCant ;
                  new app.pactres9(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_decimal5) ;
                  precrtny.this.A396EmprCod = GXv_char3[0] ;
                  precrtny.this.A719PrdNum = GXv_char4[0] ;
                  precrtny.this.A686PrdCant = GXv_decimal5[0] ;
               }
               else
               {
                  AV14PrdNum = A719PrdNum ;
                  AV15Prdcant = A686PrdCant ;
                  /* Execute user subroutine: 'COMPUESTOS' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(1);
                     pr_default.close(1);
                     pr_default.close(0);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPUESTOS' Routine */
      returnInSub = false ;
      /* Using cursor P03CO4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV14PrdNum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A688PrdComCod = P03CO4_A688PrdComCod[0] ;
         A690PrdComFN = P03CO4_A690PrdComFN[0] ;
         A719PrdNum = P03CO4_A719PrdNum[0] ;
         n719PrdNum = P03CO4_n719PrdNum[0] ;
         AV16Cantidad = AV15Prdcant.multiply(A690PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_decimal5[0] = AV16Cantidad ;
         new app.pactres9(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal5) ;
         precrtny.this.A396EmprCod = GXv_char4[0] ;
         precrtny.this.A719PrdNum = GXv_char3[0] ;
         precrtny.this.AV16Cantidad = GXv_decimal5[0] ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = precrtny.this.A396EmprCod;
      this.aP1[0] = precrtny.this.AV8Barcod;
      this.aP2[0] = precrtny.this.AV9barcodreo;
      this.aP3[0] = precrtny.this.AV10Barcodpar;
      this.aP4[0] = precrtny.this.AV11Reclinmaq;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P03CO2_A396EmprCod = new String[] {""} ;
      P03CO2_A1273RecLinPro = new byte[1] ;
      P03CO2_A2804RecLinMaq = new short[1] ;
      P03CO2_A130BarCodPar = new String[] {""} ;
      P03CO2_A132BarCodReo = new byte[1] ;
      P03CO2_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      P03CO3_A396EmprCod = new String[] {""} ;
      P03CO3_A129BarCod = new int[1] ;
      P03CO3_A132BarCodReo = new byte[1] ;
      P03CO3_A130BarCodPar = new String[] {""} ;
      P03CO3_A2804RecLinMaq = new short[1] ;
      P03CO3_A1273RecLinPro = new byte[1] ;
      P03CO3_A856ValCod = new byte[1] ;
      P03CO3_A718PrdNom = new String[] {""} ;
      P03CO3_A719PrdNum = new String[] {""} ;
      P03CO3_n719PrdNum = new boolean[] {false} ;
      P03CO3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CO3_A811RecLin = new short[1] ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV14PrdNum = "" ;
      AV15Prdcant = DecimalUtil.ZERO ;
      P03CO4_A396EmprCod = new String[] {""} ;
      P03CO4_A688PrdComCod = new String[] {""} ;
      P03CO4_A690PrdComFN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CO4_A719PrdNum = new String[] {""} ;
      P03CO4_n719PrdNum = new boolean[] {false} ;
      A688PrdComCod = "" ;
      A690PrdComFN = DecimalUtil.ZERO ;
      AV16Cantidad = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.precrtny__default(),
         new Object[] {
             new Object[] {
            P03CO2_A396EmprCod, P03CO2_A1273RecLinPro, P03CO2_A2804RecLinMaq, P03CO2_A130BarCodPar, P03CO2_A132BarCodReo, P03CO2_A129BarCod
            }
            , new Object[] {
            P03CO3_A396EmprCod, P03CO3_A129BarCod, P03CO3_A132BarCodReo, P03CO3_A130BarCodPar, P03CO3_A2804RecLinMaq, P03CO3_A1273RecLinPro, P03CO3_A856ValCod, P03CO3_A718PrdNom, P03CO3_A719PrdNum, P03CO3_n719PrdNum,
            P03CO3_A686PrdCant, P03CO3_A811RecLin
            }
            , new Object[] {
            P03CO4_A396EmprCod, P03CO4_A688PrdComCod, P03CO4_A690PrdComFN, P03CO4_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9barcodreo ;
   private byte AV17Carvema ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A1273RecLinPro ;
   private byte A132BarCodReo ;
   private byte A856ValCod ;
   private short AV11Reclinmaq ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int A129BarCod ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal AV15Prdcant ;
   private java.math.BigDecimal A690PrdComFN ;
   private java.math.BigDecimal AV16Cantidad ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String Gx_msg ;
   private String AV14PrdNum ;
   private String A688PrdComCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03CO2_A396EmprCod ;
   private byte[] P03CO2_A1273RecLinPro ;
   private short[] P03CO2_A2804RecLinMaq ;
   private String[] P03CO2_A130BarCodPar ;
   private byte[] P03CO2_A132BarCodReo ;
   private int[] P03CO2_A129BarCod ;
   private String[] P03CO3_A396EmprCod ;
   private int[] P03CO3_A129BarCod ;
   private byte[] P03CO3_A132BarCodReo ;
   private String[] P03CO3_A130BarCodPar ;
   private short[] P03CO3_A2804RecLinMaq ;
   private byte[] P03CO3_A1273RecLinPro ;
   private byte[] P03CO3_A856ValCod ;
   private String[] P03CO3_A718PrdNom ;
   private String[] P03CO3_A719PrdNum ;
   private boolean[] P03CO3_n719PrdNum ;
   private java.math.BigDecimal[] P03CO3_A686PrdCant ;
   private short[] P03CO3_A811RecLin ;
   private String[] P03CO4_A396EmprCod ;
   private String[] P03CO4_A688PrdComCod ;
   private java.math.BigDecimal[] P03CO4_A690PrdComFN ;
   private String[] P03CO4_A719PrdNum ;
   private boolean[] P03CO4_n719PrdNum ;
}

final  class precrtny__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03CO2", "SELECT EmprCod, RecLinPro, RecLinMaq, BarCodPar, BarCodReo, BarCod FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03CO3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T2.ValCod, T2.PrdNom, T1.PrdNum, T1.PrdCant, T1.RecLin FROM (TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? and T1.RecLinPro = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03CO4", "SELECT EmprCod, PrdComCod, PrdComFN, PrdNum FROM TXPLPRDCO WHERE EmprCod = ? and PrdComCod = ? ORDER BY EmprCod, PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

