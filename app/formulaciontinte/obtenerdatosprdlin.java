package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtenerdatosprdlin extends GXProcedure
{
   public obtenerdatosprdlin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtenerdatosprdlin.class ), "" );
   }

   public obtenerdatosprdlin( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            short aP2 ,
                            String[] aP3 ,
                            byte[] aP4 ,
                            String[] aP5 ,
                            java.math.BigDecimal[] aP6 )
   {
      obtenerdatosprdlin.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 )
   {
      obtenerdatosprdlin.this.A396EmprCod = aP0;
      obtenerdatosprdlin.this.A486ForNumCol = aP1;
      obtenerdatosprdlin.this.A715PrdLin = aP2;
      obtenerdatosprdlin.this.aP3 = aP3;
      obtenerdatosprdlin.this.aP4 = aP4;
      obtenerdatosprdlin.this.aP5 = aP5;
      obtenerdatosprdlin.this.aP6 = aP6;
      obtenerdatosprdlin.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13ForPrdCan = DecimalUtil.ZERO ;
      AV12ForPrdDsc = "" ;
      AV9ForPrdNor = (short)(0) ;
      AV11ForPrdUMe = (byte)(0) ;
      AV10PrdNum = "" ;
      /* Using cursor P0AFZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A487ForPrdCan = P0AFZ2_A487ForPrdCan[0] ;
         A488ForPrdDsc = P0AFZ2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AFZ2_n488ForPrdDsc[0] ;
         A489ForPrdNor = P0AFZ2_A489ForPrdNor[0] ;
         A490ForPrdUMe = P0AFZ2_A490ForPrdUMe[0] ;
         A719PrdNum = P0AFZ2_A719PrdNum[0] ;
         A488ForPrdDsc = P0AFZ2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AFZ2_n488ForPrdDsc[0] ;
         AV13ForPrdCan = A487ForPrdCan ;
         AV12ForPrdDsc = A488ForPrdDsc ;
         AV9ForPrdNor = A489ForPrdNor ;
         AV11ForPrdUMe = A490ForPrdUMe ;
         AV10PrdNum = A719PrdNum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = obtenerdatosprdlin.this.AV10PrdNum;
      this.aP4[0] = obtenerdatosprdlin.this.AV11ForPrdUMe;
      this.aP5[0] = obtenerdatosprdlin.this.AV12ForPrdDsc;
      this.aP6[0] = obtenerdatosprdlin.this.AV13ForPrdCan;
      this.aP7[0] = obtenerdatosprdlin.this.AV9ForPrdNor;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10PrdNum = "" ;
      AV12ForPrdDsc = "" ;
      AV13ForPrdCan = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AFZ2_A396EmprCod = new String[] {""} ;
      P0AFZ2_A486ForNumCol = new int[1] ;
      P0AFZ2_A715PrdLin = new short[1] ;
      P0AFZ2_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFZ2_A488ForPrdDsc = new String[] {""} ;
      P0AFZ2_n488ForPrdDsc = new boolean[] {false} ;
      P0AFZ2_A489ForPrdNor = new short[1] ;
      P0AFZ2_A490ForPrdUMe = new byte[1] ;
      P0AFZ2_A719PrdNum = new String[] {""} ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A719PrdNum = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.obtenerdatosprdlin__default(),
         new Object[] {
             new Object[] {
            P0AFZ2_A396EmprCod, P0AFZ2_A486ForNumCol, P0AFZ2_A715PrdLin, P0AFZ2_A487ForPrdCan, P0AFZ2_A488ForPrdDsc, P0AFZ2_n488ForPrdDsc, P0AFZ2_A489ForPrdNor, P0AFZ2_A490ForPrdUMe, P0AFZ2_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11ForPrdUMe ;
   private byte A490ForPrdUMe ;
   private short A715PrdLin ;
   private short AV9ForPrdNor ;
   private short A489ForPrdNor ;
   private short Gx_err ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV13ForPrdCan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private String A396EmprCod ;
   private String AV10PrdNum ;
   private String AV12ForPrdDsc ;
   private String scmdbuf ;
   private String A488ForPrdDsc ;
   private String A719PrdNum ;
   private boolean n488ForPrdDsc ;
   private short[] aP7 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AFZ2_A396EmprCod ;
   private int[] P0AFZ2_A486ForNumCol ;
   private short[] P0AFZ2_A715PrdLin ;
   private java.math.BigDecimal[] P0AFZ2_A487ForPrdCan ;
   private String[] P0AFZ2_A488ForPrdDsc ;
   private boolean[] P0AFZ2_n488ForPrdDsc ;
   private short[] P0AFZ2_A489ForPrdNor ;
   private byte[] P0AFZ2_A490ForPrdUMe ;
   private String[] P0AFZ2_A719PrdNum ;
}

final  class obtenerdatosprdlin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AFZ2", "SELECT T1.EmprCod, T1.ForNumCol, T1.PrdLin, T1.ForPrdCan, T2.ForPrdDsc, T1.ForPrdNor, T1.ForPrdUMe, T1.PrdNum FROM (TXPLPRFOR T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ForNumCol = ? and T1.PrdLin = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.PrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
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
      }
   }

}

