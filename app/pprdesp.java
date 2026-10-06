package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprdesp extends GXProcedure
{
   public pprdesp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprdesp.class ), "" );
   }

   public pprdesp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           short[] aP2 ,
                           String[] aP3 ,
                           java.math.BigDecimal[] aP4 )
   {
      pprdesp.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             byte[] aP5 )
   {
      pprdesp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprdesp.this.A486ForNumCol = aP1[0];
      this.aP1 = aP1;
      pprdesp.this.AV15NumOrd = aP2[0];
      this.aP2 = aP2;
      pprdesp.this.AV16Producto = aP3[0];
      this.aP3 = aP3;
      pprdesp.this.AV17ForPrdCan = aP4[0];
      this.aP4 = aP4;
      pprdesp.this.AV18ForPrdUme = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00202 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(AV15NumOrd)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A489ForPrdNor = P00202_A489ForPrdNor[0] ;
         A719PrdNum = P00202_A719PrdNum[0] ;
         A487ForPrdCan = P00202_A487ForPrdCan[0] ;
         A490ForPrdUMe = P00202_A490ForPrdUMe[0] ;
         A715PrdLin = P00202_A715PrdLin[0] ;
         AV16Producto = A719PrdNum ;
         AV17ForPrdCan = A487ForPrdCan ;
         AV18ForPrdUme = A490ForPrdUMe ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprdesp.this.A396EmprCod;
      this.aP1[0] = pprdesp.this.A486ForNumCol;
      this.aP2[0] = pprdesp.this.AV15NumOrd;
      this.aP3[0] = pprdesp.this.AV16Producto;
      this.aP4[0] = pprdesp.this.AV17ForPrdCan;
      this.aP5[0] = pprdesp.this.AV18ForPrdUme;
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
      P00202_A396EmprCod = new String[] {""} ;
      P00202_A486ForNumCol = new int[1] ;
      P00202_A489ForPrdNor = new short[1] ;
      P00202_A719PrdNum = new String[] {""} ;
      P00202_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00202_A490ForPrdUMe = new byte[1] ;
      P00202_A715PrdLin = new short[1] ;
      A719PrdNum = "" ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprdesp__default(),
         new Object[] {
             new Object[] {
            P00202_A396EmprCod, P00202_A486ForNumCol, P00202_A489ForPrdNor, P00202_A719PrdNum, P00202_A487ForPrdCan, P00202_A490ForPrdUMe, P00202_A715PrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18ForPrdUme ;
   private byte A490ForPrdUMe ;
   private short AV15NumOrd ;
   private short A489ForPrdNor ;
   private short A715PrdLin ;
   private short Gx_err ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV17ForPrdCan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private String A396EmprCod ;
   private String AV16Producto ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00202_A396EmprCod ;
   private int[] P00202_A486ForNumCol ;
   private short[] P00202_A489ForPrdNor ;
   private String[] P00202_A719PrdNum ;
   private java.math.BigDecimal[] P00202_A487ForPrdCan ;
   private byte[] P00202_A490ForPrdUMe ;
   private short[] P00202_A715PrdLin ;
}

final  class pprdesp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00202", "SELECT EmprCod, ForNumCol, ForPrdNor, PrdNum, ForPrdCan, ForPrdUMe, PrdLin FROM TXPLPRFOR WHERE (EmprCod = ? and ForNumCol = ?) AND (ForPrdNor = ?) ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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

