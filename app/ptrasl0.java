package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptrasl0 extends GXProcedure
{
   public ptrasl0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptrasl0.class ), "" );
   }

   public ptrasl0( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           byte[] aP2 )
   {
      ptrasl0.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      ptrasl0.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptrasl0.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      ptrasl0.this.A8908CC_AlmCod = aP2[0];
      this.aP2 = aP2;
      ptrasl0.this.AV9CC_exiscc = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03NF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, Byte.valueOf(A8908CC_AlmCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8918CC_ExisCC = P03NF2_A8918CC_ExisCC[0] ;
         n8918CC_ExisCC = P03NF2_n8918CC_ExisCC[0] ;
         AV9CC_exiscc = A8918CC_ExisCC ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptrasl0.this.A396EmprCod;
      this.aP1[0] = ptrasl0.this.A719PrdNum;
      this.aP2[0] = ptrasl0.this.A8908CC_AlmCod;
      this.aP3[0] = ptrasl0.this.AV9CC_exiscc;
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
      P03NF2_A396EmprCod = new String[] {""} ;
      P03NF2_A719PrdNum = new String[] {""} ;
      P03NF2_A8908CC_AlmCod = new byte[1] ;
      P03NF2_A8918CC_ExisCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03NF2_n8918CC_ExisCC = new boolean[] {false} ;
      A8918CC_ExisCC = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptrasl0__default(),
         new Object[] {
             new Object[] {
            P03NF2_A396EmprCod, P03NF2_A719PrdNum, P03NF2_A8908CC_AlmCod, P03NF2_A8918CC_ExisCC, P03NF2_n8918CC_ExisCC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A8908CC_AlmCod ;
   private short Gx_err ;
   private java.math.BigDecimal AV9CC_exiscc ;
   private java.math.BigDecimal A8918CC_ExisCC ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String scmdbuf ;
   private boolean n8918CC_ExisCC ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P03NF2_A396EmprCod ;
   private String[] P03NF2_A719PrdNum ;
   private byte[] P03NF2_A8908CC_AlmCod ;
   private java.math.BigDecimal[] P03NF2_A8918CC_ExisCC ;
   private boolean[] P03NF2_n8918CC_ExisCC ;
}

final  class ptrasl0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03NF2", "SELECT EmprCod, PrdNum, CC_AlmCod, CC_ExisCC FROM TXPPRDALM WHERE EmprCod = ? and PrdNum = ? and CC_AlmCod = ? ORDER BY EmprCod, PrdNum, CC_AlmCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

