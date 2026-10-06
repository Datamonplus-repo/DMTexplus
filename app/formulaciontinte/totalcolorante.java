package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class totalcolorante extends GXProcedure
{
   public totalcolorante( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( totalcolorante.class ), "" );
   }

   public totalcolorante( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 )
   {
      totalcolorante.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.math.BigDecimal[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      totalcolorante.this.A396EmprCod = aP0;
      totalcolorante.this.A486ForNumCol = aP1;
      totalcolorante.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8ForCanSum = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P0AIZ3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5361ForCanSum = P0AIZ3_A5361ForCanSum[0] ;
         n5361ForCanSum = P0AIZ3_n5361ForCanSum[0] ;
         A5361ForCanSum = P0AIZ3_A5361ForCanSum[0] ;
         n5361ForCanSum = P0AIZ3_n5361ForCanSum[0] ;
         AV8ForCanSum = A5361ForCanSum ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = totalcolorante.this.AV8ForCanSum;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8ForCanSum = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AIZ3_A396EmprCod = new String[] {""} ;
      P0AIZ3_A486ForNumCol = new int[1] ;
      P0AIZ3_A5361ForCanSum = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AIZ3_n5361ForCanSum = new boolean[] {false} ;
      A5361ForCanSum = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.totalcolorante__default(),
         new Object[] {
             new Object[] {
            P0AIZ3_A396EmprCod, P0AIZ3_A486ForNumCol, P0AIZ3_A5361ForCanSum, P0AIZ3_n5361ForCanSum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV8ForCanSum ;
   private java.math.BigDecimal A5361ForCanSum ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n5361ForCanSum ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AIZ3_A396EmprCod ;
   private int[] P0AIZ3_A486ForNumCol ;
   private java.math.BigDecimal[] P0AIZ3_A5361ForCanSum ;
   private boolean[] P0AIZ3_n5361ForCanSum ;
}

final  class totalcolorante__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AIZ3", "SELECT T1.EmprCod, T1.ForNumCol, COALESCE( T2.ForCanSum, 0) AS ForCanSum FROM (TXPCDFORM T1 LEFT JOIN (SELECT SUM(ForCan) AS ForCanSum, EmprCod, ForNumCol FROM TXPLDFORM GROUP BY EmprCod, ForNumCol ) T2 ON T2.EmprCod = T1.EmprCod AND T2.ForNumCol = T1.ForNumCol) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

