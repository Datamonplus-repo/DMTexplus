package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengovaloreslb_lineac extends GXProcedure
{
   public obtengovaloreslb_lineac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengovaloreslb_lineac.class ), "" );
   }

   public obtengovaloreslb_lineac( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 )
   {
      obtengovaloreslb_lineac.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 )
   {
      obtengovaloreslb_lineac.this.AV9EmprCod = aP0;
      obtengovaloreslb_lineac.this.AV13Lb_numero = aP1;
      obtengovaloreslb_lineac.this.AV14lb_opcion = aP2;
      obtengovaloreslb_lineac.this.AV12Lb_lineaC = aP3;
      obtengovaloreslb_lineac.this.aP4 = aP4;
      obtengovaloreslb_lineac.this.aP5 = aP5;
      obtengovaloreslb_lineac.this.aP6 = aP6;
      obtengovaloreslb_lineac.this.aP7 = aP7;
      obtengovaloreslb_lineac.this.aP8 = aP8;
      obtengovaloreslb_lineac.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Prdnum = "" ;
      AV8ForPrdUMe = (byte)(0) ;
      AV10LB_CantC = DecimalUtil.ZERO ;
      AV11lb_fibra = "" ;
      AV15lb_Ptinc = (byte)(0) ;
      AV17ForPrdDsc = "" ;
      /* Using cursor P0AF42 */
      pr_default.execute(0, new Object[] {AV9EmprCod, Integer.valueOf(AV13Lb_numero), AV14lb_opcion, Short.valueOf(AV12Lb_lineaC)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5557Lb_LineaC = P0AF42_A5557Lb_LineaC[0] ;
         A5555Lb_opcion = P0AF42_A5555Lb_opcion[0] ;
         A5532Lb_numero = P0AF42_A5532Lb_numero[0] ;
         A396EmprCod = P0AF42_A396EmprCod[0] ;
         A719PrdNum = P0AF42_A719PrdNum[0] ;
         A490ForPrdUMe = P0AF42_A490ForPrdUMe[0] ;
         A488ForPrdDsc = P0AF42_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AF42_n488ForPrdDsc[0] ;
         A5558LB_CantC = P0AF42_A5558LB_CantC[0] ;
         A14096Lb_fibra = P0AF42_A14096Lb_fibra[0] ;
         A6544Lb_PTinC = P0AF42_A6544Lb_PTinC[0] ;
         A488ForPrdDsc = P0AF42_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AF42_n488ForPrdDsc[0] ;
         AV16Prdnum = A719PrdNum ;
         AV8ForPrdUMe = A490ForPrdUMe ;
         AV17ForPrdDsc = A488ForPrdDsc ;
         AV10LB_CantC = A5558LB_CantC ;
         AV11lb_fibra = A14096Lb_fibra ;
         AV15lb_Ptinc = A6544Lb_PTinC ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = obtengovaloreslb_lineac.this.AV10LB_CantC;
      this.aP5[0] = obtengovaloreslb_lineac.this.AV11lb_fibra;
      this.aP6[0] = obtengovaloreslb_lineac.this.AV15lb_Ptinc;
      this.aP7[0] = obtengovaloreslb_lineac.this.AV16Prdnum;
      this.aP8[0] = obtengovaloreslb_lineac.this.AV8ForPrdUMe;
      this.aP9[0] = obtengovaloreslb_lineac.this.AV17ForPrdDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10LB_CantC = DecimalUtil.ZERO ;
      AV11lb_fibra = "" ;
      AV16Prdnum = "" ;
      AV17ForPrdDsc = "" ;
      scmdbuf = "" ;
      P0AF42_A5557Lb_LineaC = new short[1] ;
      P0AF42_A5555Lb_opcion = new String[] {""} ;
      P0AF42_A5532Lb_numero = new int[1] ;
      P0AF42_A396EmprCod = new String[] {""} ;
      P0AF42_A719PrdNum = new String[] {""} ;
      P0AF42_A490ForPrdUMe = new byte[1] ;
      P0AF42_A488ForPrdDsc = new String[] {""} ;
      P0AF42_n488ForPrdDsc = new boolean[] {false} ;
      P0AF42_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AF42_A14096Lb_fibra = new String[] {""} ;
      P0AF42_A6544Lb_PTinC = new byte[1] ;
      A5555Lb_opcion = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A488ForPrdDsc = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A14096Lb_fibra = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.obtengovaloreslb_lineac__default(),
         new Object[] {
             new Object[] {
            P0AF42_A5557Lb_LineaC, P0AF42_A5555Lb_opcion, P0AF42_A5532Lb_numero, P0AF42_A396EmprCod, P0AF42_A719PrdNum, P0AF42_A490ForPrdUMe, P0AF42_A488ForPrdDsc, P0AF42_n488ForPrdDsc, P0AF42_A5558LB_CantC, P0AF42_A14096Lb_fibra,
            P0AF42_A6544Lb_PTinC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15lb_Ptinc ;
   private byte AV8ForPrdUMe ;
   private byte A490ForPrdUMe ;
   private byte A6544Lb_PTinC ;
   private short AV12Lb_lineaC ;
   private short A5557Lb_LineaC ;
   private short Gx_err ;
   private int AV13Lb_numero ;
   private int A5532Lb_numero ;
   private java.math.BigDecimal AV10LB_CantC ;
   private java.math.BigDecimal A5558LB_CantC ;
   private String AV9EmprCod ;
   private String AV14lb_opcion ;
   private String AV11lb_fibra ;
   private String AV16Prdnum ;
   private String AV17ForPrdDsc ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A488ForPrdDsc ;
   private String A14096Lb_fibra ;
   private boolean n488ForPrdDsc ;
   private String[] aP9 ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private short[] P0AF42_A5557Lb_LineaC ;
   private String[] P0AF42_A5555Lb_opcion ;
   private int[] P0AF42_A5532Lb_numero ;
   private String[] P0AF42_A396EmprCod ;
   private String[] P0AF42_A719PrdNum ;
   private byte[] P0AF42_A490ForPrdUMe ;
   private String[] P0AF42_A488ForPrdDsc ;
   private boolean[] P0AF42_n488ForPrdDsc ;
   private java.math.BigDecimal[] P0AF42_A5558LB_CantC ;
   private String[] P0AF42_A14096Lb_fibra ;
   private byte[] P0AF42_A6544Lb_PTinC ;
}

final  class obtengovaloreslb_lineac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AF42", "SELECT T1.Lb_LineaC, T1.Lb_opcion, T1.Lb_numero, T1.EmprCod, T1.PrdNum, T1.ForPrdUMe, T2.ForPrdDsc, T1.LB_CantC, T1.Lb_fibra, T1.Lb_PTinC FROM (TXPENS003 T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ? and T1.Lb_LineaC = ? ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[9])[0] = rslt.getString(9, 4);
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

