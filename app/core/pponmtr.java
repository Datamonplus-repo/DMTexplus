package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pponmtr extends GXProcedure
{
   public pponmtr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pponmtr.class ), "" );
   }

   public pponmtr( int remoteHandle ,
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
      pponmtr.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      pponmtr.this.A396EmprCod = aP0;
      pponmtr.this.AV16barcod = aP1;
      pponmtr.this.AV17barcodreo = aP2;
      pponmtr.this.AV18barcodpar = aP3;
      pponmtr.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Metros = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P00LU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16barcod), Byte.valueOf(AV17barcodreo), AV18barcodpar});
      c205BarPieMet = P00LU2_A205BarPieMet[0] ;
      pr_default.close(0);
      AV15Metros = AV15Metros.add(c205BarPieMet) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = pponmtr.this.AV19kilos;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV19kilos = DecimalUtil.ZERO ;
      AV15Metros = DecimalUtil.ZERO ;
      c205BarPieMet = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P00LU2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.pponmtr__default(),
         new Object[] {
             new Object[] {
            P00LU2_A205BarPieMet
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17barcodreo ;
   private short Gx_err ;
   private int AV16barcod ;
   private java.math.BigDecimal AV19kilos ;
   private java.math.BigDecimal AV15Metros ;
   private java.math.BigDecimal c205BarPieMet ;
   private String A396EmprCod ;
   private String AV18barcodpar ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P00LU2_A205BarPieMet ;
}

final  class pponmtr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00LU2", "SELECT SUM(BarPieMet) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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

