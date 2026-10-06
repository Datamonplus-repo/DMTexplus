package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppreciotubo extends GXProcedure
{
   public ppreciotubo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppreciotubo.class ), "" );
   }

   public ppreciotubo( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           short aP1 )
   {
      ppreciotubo.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      ppreciotubo.this.A396EmprCod = aP0;
      ppreciotubo.this.A1206TubCod = aP1;
      ppreciotubo.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TubPre = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P050E2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A1206TubCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1208TubPre = P050E2_A1208TubPre[0] ;
         n1208TubPre = P050E2_n1208TubPre[0] ;
         AV8TubPre = A1208TubPre ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = ppreciotubo.this.AV8TubPre;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8TubPre = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P050E2_A396EmprCod = new String[] {""} ;
      P050E2_A1206TubCod = new short[1] ;
      P050E2_A1208TubPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P050E2_n1208TubPre = new boolean[] {false} ;
      A1208TubPre = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppreciotubo__default(),
         new Object[] {
             new Object[] {
            P050E2_A396EmprCod, P050E2_A1206TubCod, P050E2_A1208TubPre, P050E2_n1208TubPre
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A1206TubCod ;
   private short Gx_err ;
   private java.math.BigDecimal AV8TubPre ;
   private java.math.BigDecimal A1208TubPre ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n1208TubPre ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P050E2_A396EmprCod ;
   private short[] P050E2_A1206TubCod ;
   private java.math.BigDecimal[] P050E2_A1208TubPre ;
   private boolean[] P050E2_n1208TubPre ;
}

final  class ppreciotubo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P050E2", "SELECT EmprCod, TubCod, TubPre FROM TXPTUBOS WHERE EmprCod = ? and TubCod = ? ORDER BY EmprCod, TubCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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

