package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class determinarmultiempresa extends GXProcedure
{
   public determinarmultiempresa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( determinarmultiempresa.class ), "" );
   }

   public determinarmultiempresa( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( )
   {
      determinarmultiempresa.this.aP0 = new boolean[] {false};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( boolean[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( boolean[] aP0 )
   {
      determinarmultiempresa.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Cantidad = DecimalUtil.ZERO ;
      /* Optimized group. */
      /* Using cursor P07WI2 */
      pr_default.execute(0);
      cV10Cantidad = P07WI2_AV10Cantidad[0] ;
      pr_default.close(0);
      AV10Cantidad = AV10Cantidad.add(cV10Cantidad.multiply(DecimalUtil.doubleToDec(1))) ;
      /* End optimized group. */
      AV9ExistenVarias = ((AV10Cantidad.doubleValue()>1) ? true : false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = determinarmultiempresa.this.AV9ExistenVarias;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Cantidad = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P07WI2_AV10Cantidad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      cV10Cantidad = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.determinarmultiempresa__default(),
         new Object[] {
             new Object[] {
            P07WI2_AV10Cantidad
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV10Cantidad ;
   private java.math.BigDecimal cV10Cantidad ;
   private String scmdbuf ;
   private boolean AV9ExistenVarias ;
   private boolean[] aP0 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P07WI2_AV10Cantidad ;
}

final  class determinarmultiempresa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07WI2", "SELECT COUNT(*) FROM TXPEMPRES ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
      }
   }

}

