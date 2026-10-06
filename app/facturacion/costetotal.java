package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class costetotal extends GXProcedure
{
   public costetotal( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( costetotal.class ), "" );
   }

   public costetotal( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           short aP1 ,
                                           java.math.BigDecimal aP2 )
   {
      costetotal.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        java.math.BigDecimal aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             java.math.BigDecimal aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      costetotal.this.AV11EmprCod = aP0;
      costetotal.this.AV8GrdTipArt = aP1;
      costetotal.this.AV9Coste_Cor = aP2;
      costetotal.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Coste_Tart = DecimalUtil.ZERO ;
      /* Using cursor P0A2N2 */
      pr_default.execute(0, new Object[] {AV11EmprCod, Short.valueOf(AV8GrdTipArt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4364GrdTipArt = P0A2N2_A4364GrdTipArt[0] ;
         A396EmprCod = P0A2N2_A396EmprCod[0] ;
         A4377GrdTipCos = P0A2N2_A4377GrdTipCos[0] ;
         A4376GrdTipVal = P0A2N2_A4376GrdTipVal[0] ;
         if ( DecimalUtil.compareTo(AV9Coste_Cor, A4376GrdTipVal) < 0 )
         {
            AV10Coste_Tart = A4377GrdTipCos ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = costetotal.this.AV10Coste_Tart;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Coste_Tart = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0A2N2_A4364GrdTipArt = new short[1] ;
      P0A2N2_A396EmprCod = new String[] {""} ;
      P0A2N2_A4377GrdTipCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A2N2_A4376GrdTipVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      A4377GrdTipCos = DecimalUtil.ZERO ;
      A4376GrdTipVal = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.costetotal__default(),
         new Object[] {
             new Object[] {
            P0A2N2_A4364GrdTipArt, P0A2N2_A396EmprCod, P0A2N2_A4377GrdTipCos, P0A2N2_A4376GrdTipVal
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8GrdTipArt ;
   private short A4364GrdTipArt ;
   private short Gx_err ;
   private java.math.BigDecimal AV9Coste_Cor ;
   private java.math.BigDecimal AV10Coste_Tart ;
   private java.math.BigDecimal A4377GrdTipCos ;
   private java.math.BigDecimal A4376GrdTipVal ;
   private String AV11EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P0A2N2_A4364GrdTipArt ;
   private String[] P0A2N2_A396EmprCod ;
   private java.math.BigDecimal[] P0A2N2_A4377GrdTipCos ;
   private java.math.BigDecimal[] P0A2N2_A4376GrdTipVal ;
}

final  class costetotal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A2N2", "SELECT GrdTipArt, EmprCod, GrdTipCos, GrdTipVal FROM TXPGRDTAR WHERE EmprCod = ? and GrdTipArt = ? ORDER BY EmprCod, GrdTipArt, GrdTipVal ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
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
               return;
      }
   }

}

