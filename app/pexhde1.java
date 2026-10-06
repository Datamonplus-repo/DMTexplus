package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexhde1 extends GXProcedure
{
   public pexhde1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexhde1.class ), "" );
   }

   public pexhde1( int remoteHandle ,
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
                            short[] aP11 )
   {
      pexhde1.this.aP12 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
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
                        short[] aP11 ,
                        short[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
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
                             short[] aP11 ,
                             short[] aP12 )
   {
      pexhde1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexhde1.this.A2253SalExtAlb = aP1[0];
      this.aP1 = aP1;
      pexhde1.this.AV15BarCod = aP2[0];
      this.aP2 = aP2;
      pexhde1.this.AV16BarCodReo = aP3[0];
      this.aP3 = aP3;
      pexhde1.this.AV17BarCodPar = aP4[0];
      this.aP4 = aP4;
      pexhde1.this.aP5 = aP5;
      pexhde1.this.aP6 = aP6;
      pexhde1.this.aP7 = aP7;
      pexhde1.this.aP8 = aP8;
      pexhde1.this.aP9 = aP9;
      pexhde1.this.AV22ManCod = aP10[0];
      this.aP10 = aP10;
      pexhde1.this.AV27SalExnln = aP11[0];
      this.aP11 = aP11;
      pexhde1.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18FlagLin = (byte)(0) ;
      /* Using cursor P02CN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(AV22ManCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2248ManCod = P02CN2_A2248ManCod[0] ;
         A2254SalExtSec = P02CN2_A2254SalExtSec[0] ;
         /* Using cursor P02CN3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar, Short.valueOf(AV27SalExnln)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6248SalExNln = P02CN3_A6248SalExNln[0] ;
            A130BarCodPar = P02CN3_A130BarCodPar[0] ;
            A132BarCodReo = P02CN3_A132BarCodReo[0] ;
            A129BarCod = P02CN3_A129BarCod[0] ;
            A6249SalExObs = P02CN3_A6249SalExObs[0] ;
            A6255SalExMtR = P02CN3_A6255SalExMtR[0] ;
            A6258SalExMtE = P02CN3_A6258SalExMtE[0] ;
            A6251SalExKgR = P02CN3_A6251SalExKgR[0] ;
            A6256SalExKgE = P02CN3_A6256SalExKgE[0] ;
            A6252SalExCoR = P02CN3_A6252SalExCoR[0] ;
            A6257SalExCoE = P02CN3_A6257SalExCoE[0] ;
            A6558FasCodn = P02CN3_A6558FasCodn[0] ;
            A654OrdLin = P02CN3_A654OrdLin[0] ;
            AV18FlagLin = (byte)(1) ;
            AV25Mts = A6258SalExMtE.subtract(A6255SalExMtR) ;
            AV19Kgs = A6256SalExKgE.subtract(A6251SalExKgR) ;
            AV20Conos = (short)(A6257SalExCoE-A6252SalExCoR) ;
            AV21FasCod = A6558FasCodn ;
            AV28OrdLin = A654OrdLin ;
            pr_default.readNext(1);
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
      this.aP0[0] = pexhde1.this.A396EmprCod;
      this.aP1[0] = pexhde1.this.A2253SalExtAlb;
      this.aP2[0] = pexhde1.this.AV15BarCod;
      this.aP3[0] = pexhde1.this.AV16BarCodReo;
      this.aP4[0] = pexhde1.this.AV17BarCodPar;
      this.aP5[0] = pexhde1.this.AV18FlagLin;
      this.aP6[0] = pexhde1.this.AV19Kgs;
      this.aP7[0] = pexhde1.this.AV25Mts;
      this.aP8[0] = pexhde1.this.AV20Conos;
      this.aP9[0] = pexhde1.this.AV21FasCod;
      this.aP10[0] = pexhde1.this.AV22ManCod;
      this.aP11[0] = pexhde1.this.AV27SalExnln;
      this.aP12[0] = pexhde1.this.AV28OrdLin;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19Kgs = DecimalUtil.ZERO ;
      AV25Mts = DecimalUtil.ZERO ;
      AV21FasCod = "" ;
      scmdbuf = "" ;
      P02CN2_A396EmprCod = new String[] {""} ;
      P02CN2_A2253SalExtAlb = new int[1] ;
      P02CN2_A2248ManCod = new short[1] ;
      P02CN2_A2254SalExtSec = new String[] {""} ;
      A2254SalExtSec = "" ;
      P02CN3_A396EmprCod = new String[] {""} ;
      P02CN3_A2253SalExtAlb = new int[1] ;
      P02CN3_A6248SalExNln = new short[1] ;
      P02CN3_A130BarCodPar = new String[] {""} ;
      P02CN3_A132BarCodReo = new byte[1] ;
      P02CN3_A129BarCod = new int[1] ;
      P02CN3_A6249SalExObs = new String[] {""} ;
      P02CN3_A6255SalExMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CN3_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CN3_A6251SalExKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CN3_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02CN3_A6252SalExCoR = new int[1] ;
      P02CN3_A6257SalExCoE = new int[1] ;
      P02CN3_A6558FasCodn = new String[] {""} ;
      P02CN3_A654OrdLin = new short[1] ;
      A130BarCodPar = "" ;
      A6249SalExObs = "" ;
      A6255SalExMtR = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      A6251SalExKgR = DecimalUtil.ZERO ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6558FasCodn = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexhde1__default(),
         new Object[] {
             new Object[] {
            P02CN2_A396EmprCod, P02CN2_A2253SalExtAlb, P02CN2_A2248ManCod, P02CN2_A2254SalExtSec
            }
            , new Object[] {
            P02CN3_A396EmprCod, P02CN3_A2253SalExtAlb, P02CN3_A6248SalExNln, P02CN3_A130BarCodPar, P02CN3_A132BarCodReo, P02CN3_A129BarCod, P02CN3_A6249SalExObs, P02CN3_A6255SalExMtR, P02CN3_A6258SalExMtE, P02CN3_A6251SalExKgR,
            P02CN3_A6256SalExKgE, P02CN3_A6252SalExCoR, P02CN3_A6257SalExCoE, P02CN3_A6558FasCodn, P02CN3_A654OrdLin
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
   private short AV27SalExnln ;
   private short AV28OrdLin ;
   private short A2248ManCod ;
   private short A6248SalExNln ;
   private short A654OrdLin ;
   private short Gx_err ;
   private int A2253SalExtAlb ;
   private int AV15BarCod ;
   private int A129BarCod ;
   private int A6252SalExCoR ;
   private int A6257SalExCoE ;
   private java.math.BigDecimal AV19Kgs ;
   private java.math.BigDecimal AV25Mts ;
   private java.math.BigDecimal A6255SalExMtR ;
   private java.math.BigDecimal A6258SalExMtE ;
   private java.math.BigDecimal A6251SalExKgR ;
   private java.math.BigDecimal A6256SalExKgE ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String AV21FasCod ;
   private String scmdbuf ;
   private String A2254SalExtSec ;
   private String A130BarCodPar ;
   private String A6249SalExObs ;
   private String A6558FasCodn ;
   private short[] aP12 ;
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
   private short[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P02CN2_A396EmprCod ;
   private int[] P02CN2_A2253SalExtAlb ;
   private short[] P02CN2_A2248ManCod ;
   private String[] P02CN2_A2254SalExtSec ;
   private String[] P02CN3_A396EmprCod ;
   private int[] P02CN3_A2253SalExtAlb ;
   private short[] P02CN3_A6248SalExNln ;
   private String[] P02CN3_A130BarCodPar ;
   private byte[] P02CN3_A132BarCodReo ;
   private int[] P02CN3_A129BarCod ;
   private String[] P02CN3_A6249SalExObs ;
   private java.math.BigDecimal[] P02CN3_A6255SalExMtR ;
   private java.math.BigDecimal[] P02CN3_A6258SalExMtE ;
   private java.math.BigDecimal[] P02CN3_A6251SalExKgR ;
   private java.math.BigDecimal[] P02CN3_A6256SalExKgE ;
   private int[] P02CN3_A6252SalExCoR ;
   private int[] P02CN3_A6257SalExCoE ;
   private String[] P02CN3_A6558FasCodn ;
   private short[] P02CN3_A654OrdLin ;
}

final  class pexhde1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02CN2", "SELECT EmprCod, SalExtAlb, ManCod, SalExtSec FROM TXPCEXTSA WHERE (EmprCod = ? and SalExtAlb = ?) AND (ManCod = ?) ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02CN3", "SELECT EmprCod, SalExtAlb, SalExNln, BarCodPar, BarCodReo, BarCod, SalExObs, SalExMtR, SalExMtE, SalExKgR, SalExKgE, SalExCoR, SalExCoE, FasCodn, OrdLin FROM TXPEXHDPZ WHERE (EmprCod = ? and SalExtAlb = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (SalExNln = ?) ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 8);
               ((short[]) buf[14])[0] = rslt.getShort(15);
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

