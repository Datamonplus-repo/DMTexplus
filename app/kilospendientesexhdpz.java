package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class kilospendientesexhdpz extends GXProcedure
{
   public kilospendientesexhdpz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( kilospendientesexhdpz.class ), "" );
   }

   public kilospendientesexhdpz( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           int[] aP2 ,
                                           byte[] aP3 ,
                                           String[] aP4 ,
                                           short[] aP5 ,
                                           short[] aP6 ,
                                           byte[] aP7 )
   {
      kilospendientesexhdpz.this.aP8 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        short[] aP6 ,
                        byte[] aP7 ,
                        java.math.BigDecimal[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 ,
                             byte[] aP7 ,
                             java.math.BigDecimal[] aP8 )
   {
      kilospendientesexhdpz.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      kilospendientesexhdpz.this.A2253SalExtAlb = aP1[0];
      this.aP1 = aP1;
      kilospendientesexhdpz.this.AV8BarCod = aP2[0];
      this.aP2 = aP2;
      kilospendientesexhdpz.this.AV9BarCodReo = aP3[0];
      this.aP3 = aP3;
      kilospendientesexhdpz.this.AV10BarCodPar = aP4[0];
      this.aP4 = aP4;
      kilospendientesexhdpz.this.AV15ManCod = aP5[0];
      this.aP5 = aP5;
      kilospendientesexhdpz.this.AV20SalExnln = aP6[0];
      this.aP6 = aP6;
      kilospendientesexhdpz.this.AV11FlagLin = aP7[0];
      this.aP7 = aP7;
      kilospendientesexhdpz.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11FlagLin = (byte)(0) ;
      AV12Kgs = DecimalUtil.ZERO ;
      /* Using cursor P091M2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(AV15ManCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2248ManCod = P091M2_A2248ManCod[0] ;
         A2254SalExtSec = P091M2_A2254SalExtSec[0] ;
         /* Using cursor P091M3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb), Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV20SalExnln)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6248SalExNln = P091M3_A6248SalExNln[0] ;
            A130BarCodPar = P091M3_A130BarCodPar[0] ;
            A132BarCodReo = P091M3_A132BarCodReo[0] ;
            A129BarCod = P091M3_A129BarCod[0] ;
            A6249SalExObs = P091M3_A6249SalExObs[0] ;
            A6251SalExKgR = P091M3_A6251SalExKgR[0] ;
            A6256SalExKgE = P091M3_A6256SalExKgE[0] ;
            AV11FlagLin = (byte)(1) ;
            AV12Kgs = (((A6256SalExKgE.subtract(A6251SalExKgR)).doubleValue()<0) ? DecimalUtil.doubleToDec(0) : (A6256SalExKgE.subtract(A6251SalExKgR))) ;
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
      this.aP0[0] = kilospendientesexhdpz.this.A396EmprCod;
      this.aP1[0] = kilospendientesexhdpz.this.A2253SalExtAlb;
      this.aP2[0] = kilospendientesexhdpz.this.AV8BarCod;
      this.aP3[0] = kilospendientesexhdpz.this.AV9BarCodReo;
      this.aP4[0] = kilospendientesexhdpz.this.AV10BarCodPar;
      this.aP5[0] = kilospendientesexhdpz.this.AV15ManCod;
      this.aP6[0] = kilospendientesexhdpz.this.AV20SalExnln;
      this.aP7[0] = kilospendientesexhdpz.this.AV11FlagLin;
      this.aP8[0] = kilospendientesexhdpz.this.AV12Kgs;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Kgs = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P091M2_A396EmprCod = new String[] {""} ;
      P091M2_A2253SalExtAlb = new int[1] ;
      P091M2_A2248ManCod = new short[1] ;
      P091M2_A2254SalExtSec = new String[] {""} ;
      A2254SalExtSec = "" ;
      P091M3_A396EmprCod = new String[] {""} ;
      P091M3_A2253SalExtAlb = new int[1] ;
      P091M3_A6248SalExNln = new short[1] ;
      P091M3_A130BarCodPar = new String[] {""} ;
      P091M3_A132BarCodReo = new byte[1] ;
      P091M3_A129BarCod = new int[1] ;
      P091M3_A6249SalExObs = new String[] {""} ;
      P091M3_A6251SalExKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P091M3_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A6249SalExObs = "" ;
      A6251SalExKgR = DecimalUtil.ZERO ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.kilospendientesexhdpz__default(),
         new Object[] {
             new Object[] {
            P091M2_A396EmprCod, P091M2_A2253SalExtAlb, P091M2_A2248ManCod, P091M2_A2254SalExtSec
            }
            , new Object[] {
            P091M3_A396EmprCod, P091M3_A2253SalExtAlb, P091M3_A6248SalExNln, P091M3_A130BarCodPar, P091M3_A132BarCodReo, P091M3_A129BarCod, P091M3_A6249SalExObs, P091M3_A6251SalExKgR, P091M3_A6256SalExKgE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private byte AV11FlagLin ;
   private byte A132BarCodReo ;
   private short AV15ManCod ;
   private short AV20SalExnln ;
   private short A2248ManCod ;
   private short A6248SalExNln ;
   private short Gx_err ;
   private int A2253SalExtAlb ;
   private int AV8BarCod ;
   private int A129BarCod ;
   private java.math.BigDecimal AV12Kgs ;
   private java.math.BigDecimal A6251SalExKgR ;
   private java.math.BigDecimal A6256SalExKgE ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String scmdbuf ;
   private String A2254SalExtSec ;
   private String A130BarCodPar ;
   private String A6249SalExObs ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private short[] aP6 ;
   private byte[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P091M2_A396EmprCod ;
   private int[] P091M2_A2253SalExtAlb ;
   private short[] P091M2_A2248ManCod ;
   private String[] P091M2_A2254SalExtSec ;
   private String[] P091M3_A396EmprCod ;
   private int[] P091M3_A2253SalExtAlb ;
   private short[] P091M3_A6248SalExNln ;
   private String[] P091M3_A130BarCodPar ;
   private byte[] P091M3_A132BarCodReo ;
   private int[] P091M3_A129BarCod ;
   private String[] P091M3_A6249SalExObs ;
   private java.math.BigDecimal[] P091M3_A6251SalExKgR ;
   private java.math.BigDecimal[] P091M3_A6256SalExKgE ;
}

final  class kilospendientesexhdpz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P091M2", "SELECT EmprCod, SalExtAlb, ManCod, SalExtSec FROM TXPCEXTSA WHERE (EmprCod = ? and SalExtAlb = ?) AND (ManCod = ?) ORDER BY EmprCod, SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P091M3", "SELECT EmprCod, SalExtAlb, SalExNln, BarCodPar, BarCodReo, BarCod, SalExObs, SalExKgR, SalExKgE FROM TXPEXHDPZ WHERE (EmprCod = ? and SalExtAlb = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (SalExNln = ?) ORDER BY EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

