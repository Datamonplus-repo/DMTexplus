package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengodatoscollin extends GXProcedure
{
   public obtengodatoscollin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengodatoscollin.class ), "" );
   }

   public obtengodatoscollin( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             byte[] aP5 )
   {
      obtengodatoscollin.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      obtengodatoscollin.this.A396EmprCod = aP0;
      obtengodatoscollin.this.A486ForNumCol = aP1;
      obtengodatoscollin.this.A309ColLin = aP2;
      obtengodatoscollin.this.aP3 = aP3;
      obtengodatoscollin.this.aP4 = aP4;
      obtengodatoscollin.this.aP5 = aP5;
      obtengodatoscollin.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10forcan = DecimalUtil.ZERO ;
      AV9Prdnum = "" ;
      AV12ForPrdDsc = "" ;
      AV11ForPrdUMe = (byte)(0) ;
      /* Using cursor P0AFW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P0AFW2_A719PrdNum[0] ;
         A481ForCan = P0AFW2_A481ForCan[0] ;
         A488ForPrdDsc = P0AFW2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AFW2_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0AFW2_A490ForPrdUMe[0] ;
         A488ForPrdDsc = P0AFW2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AFW2_n488ForPrdDsc[0] ;
         AV9Prdnum = A719PrdNum ;
         AV10forcan = A481ForCan ;
         AV12ForPrdDsc = A488ForPrdDsc ;
         AV11ForPrdUMe = A490ForPrdUMe ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = obtengodatoscollin.this.AV9Prdnum;
      this.aP4[0] = obtengodatoscollin.this.AV10forcan;
      this.aP5[0] = obtengodatoscollin.this.AV11ForPrdUMe;
      this.aP6[0] = obtengodatoscollin.this.AV12ForPrdDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Prdnum = "" ;
      AV10forcan = DecimalUtil.ZERO ;
      AV12ForPrdDsc = "" ;
      scmdbuf = "" ;
      P0AFW2_A396EmprCod = new String[] {""} ;
      P0AFW2_A486ForNumCol = new int[1] ;
      P0AFW2_A309ColLin = new short[1] ;
      P0AFW2_A719PrdNum = new String[] {""} ;
      P0AFW2_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFW2_A488ForPrdDsc = new String[] {""} ;
      P0AFW2_n488ForPrdDsc = new boolean[] {false} ;
      P0AFW2_A490ForPrdUMe = new byte[1] ;
      A719PrdNum = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.obtengodatoscollin__default(),
         new Object[] {
             new Object[] {
            P0AFW2_A396EmprCod, P0AFW2_A486ForNumCol, P0AFW2_A309ColLin, P0AFW2_A719PrdNum, P0AFW2_A481ForCan, P0AFW2_A488ForPrdDsc, P0AFW2_n488ForPrdDsc, P0AFW2_A490ForPrdUMe
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11ForPrdUMe ;
   private byte A490ForPrdUMe ;
   private short A309ColLin ;
   private short Gx_err ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV10forcan ;
   private java.math.BigDecimal A481ForCan ;
   private String A396EmprCod ;
   private String AV9Prdnum ;
   private String AV12ForPrdDsc ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A488ForPrdDsc ;
   private boolean n488ForPrdDsc ;
   private String[] aP6 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AFW2_A396EmprCod ;
   private int[] P0AFW2_A486ForNumCol ;
   private short[] P0AFW2_A309ColLin ;
   private String[] P0AFW2_A719PrdNum ;
   private java.math.BigDecimal[] P0AFW2_A481ForCan ;
   private String[] P0AFW2_A488ForPrdDsc ;
   private boolean[] P0AFW2_n488ForPrdDsc ;
   private byte[] P0AFW2_A490ForPrdUMe ;
}

final  class obtengodatoscollin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AFW2", "SELECT T1.EmprCod, T1.ForNumCol, T1.ColLin, T1.PrdNum, T1.ForCan, T2.ForPrdDsc, T1.ForPrdUMe FROM (TXPLDFORM T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ForNumCol = ? and T1.ColLin = ? ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
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

