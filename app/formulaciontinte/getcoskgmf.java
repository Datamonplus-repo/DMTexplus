package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getcoskgmf extends GXProcedure
{
   public getcoskgmf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getcoskgmf.class ), "" );
   }

   public getcoskgmf( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           int aP1 )
   {
      getcoskgmf.this.aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      getcoskgmf.this.A396EmprCod = aP0;
      getcoskgmf.this.A486ForNumCol = aP1;
      getcoskgmf.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8CosKgmF = DecimalUtil.ZERO ;
      /* Using cursor P0AE43 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A486ForNumCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5166CosKgmF = P0AE43_A5166CosKgmF[0] ;
         n5166CosKgmF = P0AE43_n5166CosKgmF[0] ;
         A5166CosKgmF = P0AE43_A5166CosKgmF[0] ;
         n5166CosKgmF = P0AE43_n5166CosKgmF[0] ;
         AV8CosKgmF = A5166CosKgmF ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = getcoskgmf.this.AV8CosKgmF;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8CosKgmF = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AE43_A396EmprCod = new String[] {""} ;
      P0AE43_A486ForNumCol = new int[1] ;
      P0AE43_A5166CosKgmF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AE43_n5166CosKgmF = new boolean[] {false} ;
      A5166CosKgmF = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.getcoskgmf__default(),
         new Object[] {
             new Object[] {
            P0AE43_A396EmprCod, P0AE43_A486ForNumCol, P0AE43_A5166CosKgmF, P0AE43_n5166CosKgmF
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV8CosKgmF ;
   private java.math.BigDecimal A5166CosKgmF ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n5166CosKgmF ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AE43_A396EmprCod ;
   private int[] P0AE43_A486ForNumCol ;
   private java.math.BigDecimal[] P0AE43_A5166CosKgmF ;
   private boolean[] P0AE43_n5166CosKgmF ;
}

final  class getcoskgmf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AE43", "SELECT T1.EmprCod, T1.ForNumCol, COALESCE( T2.CosKgmF, 0) AS CosKgmF FROM (TXPCDFORM T1 LEFT JOIN (SELECT SUM(( CAST(T5.ContNum * CAST(T3.ForCan AS NUMERIC(21,10)) / 1000 AS NUMERIC(25,10))) * CAST(T4.PrdPreAct * CAST(T4.PrdFacCon AS NUMERIC(24,10)) AS NUMERIC(27,10))) AS CosKgmF, T3.EmprCod, T3.ForNumCol FROM ((TXPLDFORM T3 INNER JOIN TXPPRODUC T4 ON T4.EmprCod = T3.EmprCod AND T4.PrdNum = T3.PrdNum) INNER JOIN TXPCDFORM T5 ON T5.EmprCod = T3.EmprCod AND T5.ForNumCol = T3.ForNumCol) GROUP BY T3.EmprCod, T3.ForNumCol ) T2 ON T2.EmprCod = T1.EmprCod AND T2.ForNumCol = T1.ForNumCol) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

