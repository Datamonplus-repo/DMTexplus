package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengovaloreslb_lb_lineapr extends GXProcedure
{
   public obtengovaloreslb_lb_lineapr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengovaloreslb_lb_lineapr.class ), "" );
   }

   public obtengovaloreslb_lb_lineapr( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int aP1 ,
                           String aP2 ,
                           short aP3 ,
                           String[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           short[] aP6 ,
                           byte[] aP7 ,
                           String[] aP8 )
   {
      obtengovaloreslb_lb_lineapr.this.aP9 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 ,
                        byte[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             byte[] aP9 )
   {
      obtengovaloreslb_lb_lineapr.this.AV9EmprCod = aP0;
      obtengovaloreslb_lb_lineapr.this.AV13Lb_numero = aP1;
      obtengovaloreslb_lb_lineapr.this.AV14lb_opcion = aP2;
      obtengovaloreslb_lb_lineapr.this.AV20Lb_LineaPr = aP3;
      obtengovaloreslb_lb_lineapr.this.aP4 = aP4;
      obtengovaloreslb_lb_lineapr.this.aP5 = aP5;
      obtengovaloreslb_lb_lineapr.this.aP6 = aP6;
      obtengovaloreslb_lb_lineapr.this.aP7 = aP7;
      obtengovaloreslb_lb_lineapr.this.aP8 = aP8;
      obtengovaloreslb_lb_lineapr.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Prdnum = "" ;
      AV8ForPrdUMe = (byte)(0) ;
      AV17ForPrdDsc = "" ;
      AV19LB_CantP = DecimalUtil.ZERO ;
      AV18Lb_orden = (short)(0) ;
      AV21Lb_PTinP = (byte)(0) ;
      /* Using cursor P0AF62 */
      pr_default.execute(0, new Object[] {AV9EmprCod, Integer.valueOf(AV13Lb_numero), AV14lb_opcion, Short.valueOf(AV20Lb_LineaPr)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5560Lb_LineaPr = P0AF62_A5560Lb_LineaPr[0] ;
         A5555Lb_opcion = P0AF62_A5555Lb_opcion[0] ;
         A5532Lb_numero = P0AF62_A5532Lb_numero[0] ;
         A396EmprCod = P0AF62_A396EmprCod[0] ;
         A719PrdNum = P0AF62_A719PrdNum[0] ;
         A490ForPrdUMe = P0AF62_A490ForPrdUMe[0] ;
         A488ForPrdDsc = P0AF62_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AF62_n488ForPrdDsc[0] ;
         A5561LB_CantP = P0AF62_A5561LB_CantP[0] ;
         A5562Lb_orden = P0AF62_A5562Lb_orden[0] ;
         A6545Lb_PTinP = P0AF62_A6545Lb_PTinP[0] ;
         A488ForPrdDsc = P0AF62_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AF62_n488ForPrdDsc[0] ;
         AV16Prdnum = A719PrdNum ;
         AV8ForPrdUMe = A490ForPrdUMe ;
         AV17ForPrdDsc = A488ForPrdDsc ;
         AV19LB_CantP = A5561LB_CantP ;
         AV18Lb_orden = A5562Lb_orden ;
         AV21Lb_PTinP = A6545Lb_PTinP ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = obtengovaloreslb_lb_lineapr.this.AV16Prdnum;
      this.aP5[0] = obtengovaloreslb_lb_lineapr.this.AV19LB_CantP;
      this.aP6[0] = obtengovaloreslb_lb_lineapr.this.AV18Lb_orden;
      this.aP7[0] = obtengovaloreslb_lb_lineapr.this.AV8ForPrdUMe;
      this.aP8[0] = obtengovaloreslb_lb_lineapr.this.AV17ForPrdDsc;
      this.aP9[0] = obtengovaloreslb_lb_lineapr.this.AV21Lb_PTinP;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Prdnum = "" ;
      AV19LB_CantP = DecimalUtil.ZERO ;
      AV17ForPrdDsc = "" ;
      scmdbuf = "" ;
      P0AF62_A5560Lb_LineaPr = new short[1] ;
      P0AF62_A5555Lb_opcion = new String[] {""} ;
      P0AF62_A5532Lb_numero = new int[1] ;
      P0AF62_A396EmprCod = new String[] {""} ;
      P0AF62_A719PrdNum = new String[] {""} ;
      P0AF62_A490ForPrdUMe = new byte[1] ;
      P0AF62_A488ForPrdDsc = new String[] {""} ;
      P0AF62_n488ForPrdDsc = new boolean[] {false} ;
      P0AF62_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AF62_A5562Lb_orden = new short[1] ;
      P0AF62_A6545Lb_PTinP = new byte[1] ;
      A5555Lb_opcion = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A488ForPrdDsc = "" ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.obtengovaloreslb_lb_lineapr__default(),
         new Object[] {
             new Object[] {
            P0AF62_A5560Lb_LineaPr, P0AF62_A5555Lb_opcion, P0AF62_A5532Lb_numero, P0AF62_A396EmprCod, P0AF62_A719PrdNum, P0AF62_A490ForPrdUMe, P0AF62_A488ForPrdDsc, P0AF62_n488ForPrdDsc, P0AF62_A5561LB_CantP, P0AF62_A5562Lb_orden,
            P0AF62_A6545Lb_PTinP
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8ForPrdUMe ;
   private byte AV21Lb_PTinP ;
   private byte A490ForPrdUMe ;
   private byte A6545Lb_PTinP ;
   private short AV20Lb_LineaPr ;
   private short AV18Lb_orden ;
   private short A5560Lb_LineaPr ;
   private short A5562Lb_orden ;
   private short Gx_err ;
   private int AV13Lb_numero ;
   private int A5532Lb_numero ;
   private java.math.BigDecimal AV19LB_CantP ;
   private java.math.BigDecimal A5561LB_CantP ;
   private String AV9EmprCod ;
   private String AV14lb_opcion ;
   private String AV16Prdnum ;
   private String AV17ForPrdDsc ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A488ForPrdDsc ;
   private boolean n488ForPrdDsc ;
   private byte[] aP9 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private short[] aP6 ;
   private byte[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private short[] P0AF62_A5560Lb_LineaPr ;
   private String[] P0AF62_A5555Lb_opcion ;
   private int[] P0AF62_A5532Lb_numero ;
   private String[] P0AF62_A396EmprCod ;
   private String[] P0AF62_A719PrdNum ;
   private byte[] P0AF62_A490ForPrdUMe ;
   private String[] P0AF62_A488ForPrdDsc ;
   private boolean[] P0AF62_n488ForPrdDsc ;
   private java.math.BigDecimal[] P0AF62_A5561LB_CantP ;
   private short[] P0AF62_A5562Lb_orden ;
   private byte[] P0AF62_A6545Lb_PTinP ;
}

final  class obtengovaloreslb_lb_lineapr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AF62", "SELECT T1.Lb_LineaPr, T1.Lb_opcion, T1.Lb_numero, T1.EmprCod, T1.PrdNum, T1.ForPrdUMe, T2.ForPrdDsc, T1.LB_CantP, T1.Lb_orden, T1.Lb_PTinP FROM (TXPENS004 T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? and T1.Lb_LineaPr = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
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
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

