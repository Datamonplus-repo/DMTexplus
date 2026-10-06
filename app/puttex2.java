package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class puttex2 extends GXProcedure
{
   public puttex2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( puttex2.class ), "" );
   }

   public puttex2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           byte[] aP2 ,
                                           short[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 )
   {
      puttex2.this.aP8 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 ,
                        short[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 ,
                             short[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 )
   {
      puttex2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      puttex2.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      puttex2.this.AV25Mes = aP2[0];
      this.aP2 = aP2;
      puttex2.this.AV26Any = aP3[0];
      this.aP3 = aP3;
      puttex2.this.AV20PrdUniCPrm = aP4[0];
      this.aP4 = aP4;
      puttex2.this.AV21PrdUniConM = aP5[0];
      this.aP5 = aP5;
      puttex2.this.AV22PrdValCPrm = aP6[0];
      this.aP6 = aP6;
      puttex2.this.AV23PrdValConM = aP7[0];
      this.aP7 = aP7;
      puttex2.this.AV24PrdKilTin = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P02WE2 */
      pr_default.execute(0, new Object[] {AV24PrdKilTin, AV23PrdValConM, AV22PrdValCPrm, AV21PrdUniConM, AV20PrdUniCPrm, A396EmprCod, A719PrdNum, Short.valueOf(AV26Any), Byte.valueOf(AV25Mes)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = puttex2.this.A396EmprCod;
      this.aP1[0] = puttex2.this.A719PrdNum;
      this.aP2[0] = puttex2.this.AV25Mes;
      this.aP3[0] = puttex2.this.AV26Any;
      this.aP4[0] = puttex2.this.AV20PrdUniCPrm;
      this.aP5[0] = puttex2.this.AV21PrdUniConM;
      this.aP6[0] = puttex2.this.AV22PrdValCPrm;
      this.aP7[0] = puttex2.this.AV23PrdValConM;
      this.aP8[0] = puttex2.this.AV24PrdKilTin;
      Application.commitDataStores(context, remoteHandle, pr_default, "puttex2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.puttex2__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV25Mes ;
   private short AV26Any ;
   private short Gx_err ;
   private java.math.BigDecimal AV20PrdUniCPrm ;
   private java.math.BigDecimal AV21PrdUniConM ;
   private java.math.BigDecimal AV22PrdValCPrm ;
   private java.math.BigDecimal AV23PrdValConM ;
   private java.math.BigDecimal AV24PrdKilTin ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private byte[] aP2 ;
   private short[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
}

final  class puttex2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02WE2", "UPDATE TXPLPRDES SET PrdKilTin=PrdKilTin + ?, PrdValConM=PrdValConM + ?, PrdValCprM=PrdValCprM + ?, PrdUniConM=PrdUniConM + ?, PrdUniCprM=PrdUniCprM + ?  WHERE EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               return;
      }
   }

}

