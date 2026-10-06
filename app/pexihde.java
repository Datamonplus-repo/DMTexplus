package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexihde extends GXProcedure
{
   public pexihde( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexihde.class ), "" );
   }

   public pexihde( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            int[] aP2 ,
                            byte[] aP3 ,
                            String[] aP4 ,
                            byte[] aP5 ,
                            java.math.BigDecimal[] aP6 ,
                            java.math.BigDecimal[] aP7 ,
                            short[] aP8 ,
                            String[] aP9 ,
                            short[] aP10 ,
                            java.util.Date[] aP11 ,
                            java.math.BigDecimal[] aP12 ,
                            java.math.BigDecimal[] aP13 )
   {
      pexihde.this.aP14 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 ,
                        java.util.Date[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        short[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             java.util.Date[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             short[] aP14 )
   {
      pexihde.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexihde.this.A2253SalExtAlb = aP1[0];
      this.aP1 = aP1;
      pexihde.this.AV15BarCod = aP2[0];
      this.aP2 = aP2;
      pexihde.this.AV16BarCodReo = aP3[0];
      this.aP3 = aP3;
      pexihde.this.AV17BarCodPar = aP4[0];
      this.aP4 = aP4;
      pexihde.this.AV18FlagLin = aP5[0];
      this.aP5 = aP5;
      pexihde.this.AV19Kgs = aP6[0];
      this.aP6 = aP6;
      pexihde.this.AV25Mts = aP7[0];
      this.aP7 = aP7;
      pexihde.this.AV20Conos = aP8[0];
      this.aP8 = aP8;
      pexihde.this.AV21FasCod = aP9[0];
      this.aP9 = aP9;
      pexihde.this.AV22ManCod = aP10[0];
      this.aP10 = aP10;
      pexihde.this.AV27SalExtFec = aP11[0];
      this.aP11 = aP11;
      pexihde.this.AV28Kgs1 = aP12[0];
      this.aP12 = aP12;
      pexihde.this.AV29Mts1 = aP13[0];
      this.aP13 = aP13;
      pexihde.this.AV30Conos1 = aP14[0];
      this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18FlagLin = (byte)(0) ;
      /* Using cursor P00FI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(AV22ManCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2248ManCod = P00FI2_A2248ManCod[0] ;
         A2254SalExtSec = P00FI2_A2254SalExtSec[0] ;
         A2256SalExtFec = P00FI2_A2256SalExtFec[0] ;
         AV27SalExtFec = A2256SalExtFec ;
         /* Using cursor P00FI3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P00FI3_A130BarCodPar[0] ;
            A132BarCodReo = P00FI3_A132BarCodReo[0] ;
            A129BarCod = P00FI3_A129BarCod[0] ;
            A2255SalExtObs1 = P00FI3_A2255SalExtObs1[0] ;
            n2255SalExtObs1 = P00FI3_n2255SalExtObs1[0] ;
            A2840SalExtMtR = P00FI3_A2840SalExtMtR[0] ;
            n2840SalExtMtR = P00FI3_n2840SalExtMtR[0] ;
            A3557SalExtMtE = P00FI3_A3557SalExtMtE[0] ;
            n3557SalExtMtE = P00FI3_n3557SalExtMtE[0] ;
            A2260SalExtKgR = P00FI3_A2260SalExtKgR[0] ;
            n2260SalExtKgR = P00FI3_n2260SalExtKgR[0] ;
            A3555SalExtKgE = P00FI3_A3555SalExtKgE[0] ;
            n3555SalExtKgE = P00FI3_n3555SalExtKgE[0] ;
            A2261SalExtCoR = P00FI3_A2261SalExtCoR[0] ;
            n2261SalExtCoR = P00FI3_n2261SalExtCoR[0] ;
            A3556SalExtCoE = P00FI3_A3556SalExtCoE[0] ;
            n3556SalExtCoE = P00FI3_n3556SalExtCoE[0] ;
            A457FasCod = P00FI3_A457FasCod[0] ;
            n457FasCod = P00FI3_n457FasCod[0] ;
            AV18FlagLin = (byte)(1) ;
            AV25Mts = A3557SalExtMtE.subtract(A2840SalExtMtR) ;
            AV19Kgs = A3555SalExtKgE.subtract(A2260SalExtKgR) ;
            AV20Conos = (short)(A3556SalExtCoE-A2261SalExtCoR) ;
            AV21FasCod = A457FasCod ;
            AV28Kgs1 = AV19Kgs ;
            AV29Mts1 = AV25Mts ;
            AV30Conos1 = AV20Conos ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexihde.this.A396EmprCod;
      this.aP1[0] = pexihde.this.A2253SalExtAlb;
      this.aP2[0] = pexihde.this.AV15BarCod;
      this.aP3[0] = pexihde.this.AV16BarCodReo;
      this.aP4[0] = pexihde.this.AV17BarCodPar;
      this.aP5[0] = pexihde.this.AV18FlagLin;
      this.aP6[0] = pexihde.this.AV19Kgs;
      this.aP7[0] = pexihde.this.AV25Mts;
      this.aP8[0] = pexihde.this.AV20Conos;
      this.aP9[0] = pexihde.this.AV21FasCod;
      this.aP10[0] = pexihde.this.AV22ManCod;
      this.aP11[0] = pexihde.this.AV27SalExtFec;
      this.aP12[0] = pexihde.this.AV28Kgs1;
      this.aP13[0] = pexihde.this.AV29Mts1;
      this.aP14[0] = pexihde.this.AV30Conos1;
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
      P00FI2_A396EmprCod = new String[] {""} ;
      P00FI2_A2253SalExtAlb = new int[1] ;
      P00FI2_A2248ManCod = new short[1] ;
      P00FI2_A2254SalExtSec = new String[] {""} ;
      P00FI2_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      A2254SalExtSec = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      P00FI3_A396EmprCod = new String[] {""} ;
      P00FI3_A2253SalExtAlb = new int[1] ;
      P00FI3_A130BarCodPar = new String[] {""} ;
      P00FI3_A132BarCodReo = new byte[1] ;
      P00FI3_A129BarCod = new int[1] ;
      P00FI3_A2255SalExtObs1 = new String[] {""} ;
      P00FI3_n2255SalExtObs1 = new boolean[] {false} ;
      P00FI3_A2840SalExtMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FI3_n2840SalExtMtR = new boolean[] {false} ;
      P00FI3_A3557SalExtMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FI3_n3557SalExtMtE = new boolean[] {false} ;
      P00FI3_A2260SalExtKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FI3_n2260SalExtKgR = new boolean[] {false} ;
      P00FI3_A3555SalExtKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FI3_n3555SalExtKgE = new boolean[] {false} ;
      P00FI3_A2261SalExtCoR = new short[1] ;
      P00FI3_n2261SalExtCoR = new boolean[] {false} ;
      P00FI3_A3556SalExtCoE = new short[1] ;
      P00FI3_n3556SalExtCoE = new boolean[] {false} ;
      P00FI3_A457FasCod = new String[] {""} ;
      P00FI3_n457FasCod = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A2255SalExtObs1 = "" ;
      A2840SalExtMtR = DecimalUtil.ZERO ;
      A3557SalExtMtE = DecimalUtil.ZERO ;
      A2260SalExtKgR = DecimalUtil.ZERO ;
      A3555SalExtKgE = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexihde__default(),
         new Object[] {
             new Object[] {
            P00FI2_A396EmprCod, P00FI2_A2253SalExtAlb, P00FI2_A2248ManCod, P00FI2_A2254SalExtSec, P00FI2_A2256SalExtFec
            }
            , new Object[] {
            P00FI3_A396EmprCod, P00FI3_A2253SalExtAlb, P00FI3_A130BarCodPar, P00FI3_A132BarCodReo, P00FI3_A129BarCod, P00FI3_A2255SalExtObs1, P00FI3_n2255SalExtObs1, P00FI3_A2840SalExtMtR, P00FI3_n2840SalExtMtR, P00FI3_A3557SalExtMtE,
            P00FI3_n3557SalExtMtE, P00FI3_A2260SalExtKgR, P00FI3_n2260SalExtKgR, P00FI3_A3555SalExtKgE, P00FI3_n3555SalExtKgE, P00FI3_A2261SalExtCoR, P00FI3_n2261SalExtCoR, P00FI3_A3556SalExtCoE, P00FI3_n3556SalExtCoE, P00FI3_A457FasCod,
            P00FI3_n457FasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte AV18FlagLin ;
   private byte A132BarCodReo ;
   private short AV20Conos ;
   private short AV22ManCod ;
   private short AV30Conos1 ;
   private short A2248ManCod ;
   private short A2261SalExtCoR ;
   private short A3556SalExtCoE ;
   private short Gx_err ;
   private int A2253SalExtAlb ;
   private int AV15BarCod ;
   private int A129BarCod ;
   private java.math.BigDecimal AV19Kgs ;
   private java.math.BigDecimal AV25Mts ;
   private java.math.BigDecimal AV28Kgs1 ;
   private java.math.BigDecimal AV29Mts1 ;
   private java.math.BigDecimal A2840SalExtMtR ;
   private java.math.BigDecimal A3557SalExtMtE ;
   private java.math.BigDecimal A2260SalExtKgR ;
   private java.math.BigDecimal A3555SalExtKgE ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String AV21FasCod ;
   private String scmdbuf ;
   private String A2254SalExtSec ;
   private String A130BarCodPar ;
   private String A2255SalExtObs1 ;
   private String A457FasCod ;
   private java.util.Date AV27SalExtFec ;
   private java.util.Date A2256SalExtFec ;
   private boolean n2255SalExtObs1 ;
   private boolean n2840SalExtMtR ;
   private boolean n3557SalExtMtE ;
   private boolean n2260SalExtKgR ;
   private boolean n3555SalExtKgE ;
   private boolean n2261SalExtCoR ;
   private boolean n3556SalExtCoE ;
   private boolean n457FasCod ;
   private short[] aP14 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private short[] aP10 ;
   private java.util.Date[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P00FI2_A396EmprCod ;
   private int[] P00FI2_A2253SalExtAlb ;
   private short[] P00FI2_A2248ManCod ;
   private String[] P00FI2_A2254SalExtSec ;
   private java.util.Date[] P00FI2_A2256SalExtFec ;
   private String[] P00FI3_A396EmprCod ;
   private int[] P00FI3_A2253SalExtAlb ;
   private String[] P00FI3_A130BarCodPar ;
   private byte[] P00FI3_A132BarCodReo ;
   private int[] P00FI3_A129BarCod ;
   private String[] P00FI3_A2255SalExtObs1 ;
   private boolean[] P00FI3_n2255SalExtObs1 ;
   private java.math.BigDecimal[] P00FI3_A2840SalExtMtR ;
   private boolean[] P00FI3_n2840SalExtMtR ;
   private java.math.BigDecimal[] P00FI3_A3557SalExtMtE ;
   private boolean[] P00FI3_n3557SalExtMtE ;
   private java.math.BigDecimal[] P00FI3_A2260SalExtKgR ;
   private boolean[] P00FI3_n2260SalExtKgR ;
   private java.math.BigDecimal[] P00FI3_A3555SalExtKgE ;
   private boolean[] P00FI3_n3555SalExtKgE ;
   private short[] P00FI3_A2261SalExtCoR ;
   private boolean[] P00FI3_n2261SalExtCoR ;
   private short[] P00FI3_A3556SalExtCoE ;
   private boolean[] P00FI3_n3556SalExtCoE ;
   private String[] P00FI3_A457FasCod ;
   private boolean[] P00FI3_n457FasCod ;
}

final  class pexihde__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00FI2", "SELECT EmprCod, SalExtAlb, ManCod, SalExtSec, SalExtFec FROM TXPCEXTSA WHERE (EmprCod = ? and SalExtAlb = ?) AND (ManCod = ?) ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00FI3", "SELECT EmprCod, SalExtAlb, BarCodPar, BarCodReo, BarCod, SalExtObs1, SalExtMtR, SalExtMtE, SalExtKgR, SalExtKgE, SalExtCoR, SalExtCoE, FasCod FROM TXPLEXTSA WHERE EmprCod = ? and SalExtAlb = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

