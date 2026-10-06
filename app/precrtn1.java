package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precrtn1 extends GXProcedure
{
   public precrtn1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precrtn1.class ), "" );
   }

   public precrtn1( int remoteHandle ,
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
                          java.math.BigDecimal[] aP5 )
   {
      precrtn1.this.aP6 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        int[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 )
   {
      precrtn1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      precrtn1.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      precrtn1.this.AV9barcodreo = aP2[0];
      this.aP2 = aP2;
      precrtn1.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      precrtn1.this.AV11Reclinmaq = aP4[0];
      this.aP4 = aP4;
      precrtn1.this.AV13RecTotKgm = aP5[0];
      this.aP5 = aP5;
      precrtn1.this.AV12Recvolprd = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = "030100" ;
      GXv_int3[0] = AV17Valcos ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
      precrtn1.this.A396EmprCod = GXv_char1[0] ;
      precrtn1.this.AV17Valcos = GXv_int3[0] ;
      /* Using cursor P03CP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9barcodreo), AV10Barcodpar, Short.valueOf(AV11Reclinmaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1273RecLinPro = P03CP2_A1273RecLinPro[0] ;
         A2804RecLinMaq = P03CP2_A2804RecLinMaq[0] ;
         A130BarCodPar = P03CP2_A130BarCodPar[0] ;
         A132BarCodReo = P03CP2_A132BarCodReo[0] ;
         A129BarCod = P03CP2_A129BarCod[0] ;
         A4695RecVolPrf = P03CP2_A4695RecVolPrf[0] ;
         A7257RecRb = P03CP2_A7257RecRb[0] ;
         n7257RecRb = P03CP2_n7257RecRb[0] ;
         A4695RecVolPrf = AV12Recvolprd ;
         A7257RecRb = DecimalUtil.doubleToDec(0) ;
         n7257RecRb = false ;
         if ( AV13RecTotKgm.doubleValue() > 0 )
         {
            A7257RecRb = DecimalUtil.doubleToDec(AV12Recvolprd).divide(AV13RecTotKgm, 18, java.math.RoundingMode.DOWN) ;
            n7257RecRb = false ;
         }
         /* Using cursor P03CP3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A490ForPrdUMe = P03CP3_A490ForPrdUMe[0] ;
            n490ForPrdUMe = P03CP3_n490ForPrdUMe[0] ;
            A431FacCon = P03CP3_A431FacCon[0] ;
            A686PrdCant = P03CP3_A686PrdCant[0] ;
            A719PrdNum = P03CP3_A719PrdNum[0] ;
            n719PrdNum = P03CP3_n719PrdNum[0] ;
            A811RecLin = P03CP3_A811RecLin[0] ;
            if ( A490ForPrdUMe == 3 )
            {
               A686PrdCant = AV13RecTotKgm.multiply(A431FacCon).multiply(DecimalUtil.doubleToDec(AV17Valcos)) ;
            }
            if ( ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) )
            {
               A686PrdCant = A431FacCon.multiply(DecimalUtil.doubleToDec(AV12Recvolprd)) ;
            }
            AV18Canteo = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            GXv_char2[0] = A396EmprCod ;
            GXv_char1[0] = A719PrdNum ;
            GXv_decimal4[0] = AV18Canteo ;
            new app.pactres8(remoteHandle, context).execute( GXv_char2, GXv_char1, GXv_decimal4) ;
            precrtn1.this.A396EmprCod = GXv_char2[0] ;
            precrtn1.this.A719PrdNum = GXv_char1[0] ;
            precrtn1.this.AV18Canteo = GXv_decimal4[0] ;
            /* Using cursor P03CP4 */
            pr_default.execute(2, new Object[] {A686PrdCant, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P03CP5 */
         pr_default.execute(3, new Object[] {Integer.valueOf(A4695RecVolPrf), Boolean.valueOf(n7257RecRb), A7257RecRb, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = precrtn1.this.A396EmprCod;
      this.aP1[0] = precrtn1.this.AV8Barcod;
      this.aP2[0] = precrtn1.this.AV9barcodreo;
      this.aP3[0] = precrtn1.this.AV10Barcodpar;
      this.aP4[0] = precrtn1.this.AV11Reclinmaq;
      this.aP5[0] = precrtn1.this.AV13RecTotKgm;
      this.aP6[0] = precrtn1.this.AV12Recvolprd;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int3 = new int[1] ;
      scmdbuf = "" ;
      P03CP2_A396EmprCod = new String[] {""} ;
      P03CP2_A1273RecLinPro = new byte[1] ;
      P03CP2_A2804RecLinMaq = new short[1] ;
      P03CP2_A130BarCodPar = new String[] {""} ;
      P03CP2_A132BarCodReo = new byte[1] ;
      P03CP2_A129BarCod = new int[1] ;
      P03CP2_A4695RecVolPrf = new int[1] ;
      P03CP2_A7257RecRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CP2_n7257RecRb = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A7257RecRb = DecimalUtil.ZERO ;
      P03CP3_A396EmprCod = new String[] {""} ;
      P03CP3_A129BarCod = new int[1] ;
      P03CP3_A132BarCodReo = new byte[1] ;
      P03CP3_A130BarCodPar = new String[] {""} ;
      P03CP3_A2804RecLinMaq = new short[1] ;
      P03CP3_A1273RecLinPro = new byte[1] ;
      P03CP3_A490ForPrdUMe = new byte[1] ;
      P03CP3_n490ForPrdUMe = new boolean[] {false} ;
      P03CP3_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CP3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03CP3_A719PrdNum = new String[] {""} ;
      P03CP3_n719PrdNum = new boolean[] {false} ;
      P03CP3_A811RecLin = new short[1] ;
      A431FacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV18Canteo = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.precrtn1__default(),
         new Object[] {
             new Object[] {
            P03CP2_A396EmprCod, P03CP2_A1273RecLinPro, P03CP2_A2804RecLinMaq, P03CP2_A130BarCodPar, P03CP2_A132BarCodReo, P03CP2_A129BarCod, P03CP2_A4695RecVolPrf, P03CP2_A7257RecRb, P03CP2_n7257RecRb
            }
            , new Object[] {
            P03CP3_A396EmprCod, P03CP3_A129BarCod, P03CP3_A132BarCodReo, P03CP3_A130BarCodPar, P03CP3_A2804RecLinMaq, P03CP3_A1273RecLinPro, P03CP3_A490ForPrdUMe, P03CP3_n490ForPrdUMe, P03CP3_A431FacCon, P03CP3_A686PrdCant,
            P03CP3_A719PrdNum, P03CP3_n719PrdNum, P03CP3_A811RecLin
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

   private byte AV9barcodreo ;
   private byte A1273RecLinPro ;
   private byte A132BarCodReo ;
   private byte A490ForPrdUMe ;
   private short AV11Reclinmaq ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int AV12Recvolprd ;
   private int AV17Valcos ;
   private int GXv_int3[] ;
   private int A129BarCod ;
   private int A4695RecVolPrf ;
   private java.math.BigDecimal AV13RecTotKgm ;
   private java.math.BigDecimal A7257RecRb ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal AV18Canteo ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A719PrdNum ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private boolean n7257RecRb ;
   private boolean n490ForPrdUMe ;
   private boolean n719PrdNum ;
   private int[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P03CP2_A396EmprCod ;
   private byte[] P03CP2_A1273RecLinPro ;
   private short[] P03CP2_A2804RecLinMaq ;
   private String[] P03CP2_A130BarCodPar ;
   private byte[] P03CP2_A132BarCodReo ;
   private int[] P03CP2_A129BarCod ;
   private int[] P03CP2_A4695RecVolPrf ;
   private java.math.BigDecimal[] P03CP2_A7257RecRb ;
   private boolean[] P03CP2_n7257RecRb ;
   private String[] P03CP3_A396EmprCod ;
   private int[] P03CP3_A129BarCod ;
   private byte[] P03CP3_A132BarCodReo ;
   private String[] P03CP3_A130BarCodPar ;
   private short[] P03CP3_A2804RecLinMaq ;
   private byte[] P03CP3_A1273RecLinPro ;
   private byte[] P03CP3_A490ForPrdUMe ;
   private boolean[] P03CP3_n490ForPrdUMe ;
   private java.math.BigDecimal[] P03CP3_A431FacCon ;
   private java.math.BigDecimal[] P03CP3_A686PrdCant ;
   private String[] P03CP3_A719PrdNum ;
   private boolean[] P03CP3_n719PrdNum ;
   private short[] P03CP3_A811RecLin ;
}

final  class precrtn1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03CP2", "SELECT EmprCod, RecLinPro, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecVolPrf, RecRb FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03CP3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ForPrdUMe, FacCon, PrdCant, PrdNum, RecLin FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03CP4", "UPDATE TXPLRECET SET PrdCant=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P03CP5", "UPDATE TXPCRECET SET RecVolPrf=?, RecRb=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
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
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,3);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(11);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               return;
      }
   }

}

