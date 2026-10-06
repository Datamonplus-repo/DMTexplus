package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pponkil extends GXProcedure
{
   public pponkil( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pponkil.class ), "" );
   }

   public pponkil( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 ,
                                           byte aP2 ,
                                           String aP3 )
   {
      pponkil.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pponkil.this.A396EmprCod = aP0;
      pponkil.this.AV15barcod = aP1;
      pponkil.this.AV16barcodreo = aP2;
      pponkil.this.AV17barcodpar = aP3;
      pponkil.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV18kilos = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P00EN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15barcod), Byte.valueOf(AV16barcodreo), AV17barcodpar});
      c203BarPieKil = P00EN2_A203BarPieKil[0] ;
      pr_default.close(0);
      AV18kilos = AV18kilos.add(c203BarPieKil) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pponkil.this.AV18kilos;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18kilos = DecimalUtil.ZERO ;
      c203BarPieKil = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P00EN2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pponkil__default(),
         new Object[] {
             new Object[] {
            P00EN2_A203BarPieKil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16barcodreo ;
   private short Gx_err ;
   private int AV15barcod ;
   private java.math.BigDecimal AV18kilos ;
   private java.math.BigDecimal c203BarPieKil ;
   private String A396EmprCod ;
   private String AV17barcodpar ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P00EN2_A203BarPieKil ;
}

final  class pponkil__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00EN2", "SELECT SUM(BarPieKil) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

