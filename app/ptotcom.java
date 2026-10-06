package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptotcom extends GXProcedure
{
   public ptotcom( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptotcom.class ), "" );
   }

   public ptotcom( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           short[] aP1 ,
                                           byte[] aP2 )
   {
      ptotcom.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        byte[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             byte[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      ptotcom.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptotcom.this.A779PrvAny = aP1[0];
      this.aP1 = aP1;
      ptotcom.this.AV16Mes = aP2[0];
      this.aP2 = aP2;
      ptotcom.this.AV15TotCom = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15TotCom = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P00452 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A779PrvAny), Byte.valueOf(AV16Mes)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A796PrvNumLin = P00452_A796PrvNumLin[0] ;
         A790PrvEstCm0 = P00452_A790PrvEstCm0[0] ;
         n790PrvEstCm0 = P00452_n790PrvEstCm0[0] ;
         A791PrvEstCm1 = P00452_A791PrvEstCm1[0] ;
         n791PrvEstCm1 = P00452_n791PrvEstCm1[0] ;
         A795PrvNum = P00452_A795PrvNum[0] ;
         AV15TotCom = AV15TotCom.add(A791PrvEstCm1).add(A790PrvEstCm0) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptotcom.this.A396EmprCod;
      this.aP1[0] = ptotcom.this.A779PrvAny;
      this.aP2[0] = ptotcom.this.AV16Mes;
      this.aP3[0] = ptotcom.this.AV15TotCom;
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
      P00452_A396EmprCod = new String[] {""} ;
      P00452_A779PrvAny = new short[1] ;
      P00452_A796PrvNumLin = new byte[1] ;
      P00452_A790PrvEstCm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00452_n790PrvEstCm0 = new boolean[] {false} ;
      P00452_A791PrvEstCm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00452_n791PrvEstCm1 = new boolean[] {false} ;
      P00452_A795PrvNum = new int[1] ;
      A790PrvEstCm0 = DecimalUtil.ZERO ;
      A791PrvEstCm1 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptotcom__default(),
         new Object[] {
             new Object[] {
            P00452_A396EmprCod, P00452_A779PrvAny, P00452_A796PrvNumLin, P00452_A790PrvEstCm0, P00452_n790PrvEstCm0, P00452_A791PrvEstCm1, P00452_n791PrvEstCm1, P00452_A795PrvNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Mes ;
   private byte A796PrvNumLin ;
   private short A779PrvAny ;
   private short Gx_err ;
   private int A795PrvNum ;
   private java.math.BigDecimal AV15TotCom ;
   private java.math.BigDecimal A790PrvEstCm0 ;
   private java.math.BigDecimal A791PrvEstCm1 ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n790PrvEstCm0 ;
   private boolean n791PrvEstCm1 ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00452_A396EmprCod ;
   private short[] P00452_A779PrvAny ;
   private byte[] P00452_A796PrvNumLin ;
   private java.math.BigDecimal[] P00452_A790PrvEstCm0 ;
   private boolean[] P00452_n790PrvEstCm0 ;
   private java.math.BigDecimal[] P00452_A791PrvEstCm1 ;
   private boolean[] P00452_n791PrvEstCm1 ;
   private int[] P00452_A795PrvNum ;
}

final  class ptotcom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00452", "SELECT EmprCod, PrvAny, PrvNumLin, PrvEstCm0, PrvEstCm1, PrvNum FROM TXPLPRVES WHERE (EmprCod = ?) AND (PrvAny = ?) AND (PrvNumLin <= ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

