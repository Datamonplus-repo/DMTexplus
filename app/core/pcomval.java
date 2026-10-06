package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcomval extends GXProcedure
{
   public pcomval( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcomval.class ), "" );
   }

   public pcomval( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           java.math.BigDecimal aP1 ,
                                           java.math.BigDecimal aP2 )
   {
      pcomval.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        java.math.BigDecimal aP1 ,
                        java.math.BigDecimal aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             java.math.BigDecimal aP1 ,
                             java.math.BigDecimal aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pcomval.this.AV11EmprCod = aP0;
      pcomval.this.AV8PrdPrec = aP1;
      pcomval.this.AV9PrdComFN = aP2;
      pcomval.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P011X2 */
      pr_default.execute(0, new Object[] {AV11EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P011X2_A396EmprCod[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV10Valor = GXutil.roundDecimal( AV8PrdPrec.multiply(AV9PrdComFN).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pcomval.this.AV10Valor;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Valor = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P011X2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.pcomval__default(),
         new Object[] {
             new Object[] {
            P011X2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.math.BigDecimal AV8PrdPrec ;
   private java.math.BigDecimal AV9PrdComFN ;
   private java.math.BigDecimal AV10Valor ;
   private String AV11EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P011X2_A396EmprCod ;
}

final  class pcomval__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P011X2", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
      }
   }

}

