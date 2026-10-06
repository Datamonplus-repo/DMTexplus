package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class upd_exhdpz extends GXProcedure
{
   public upd_exhdpz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( upd_exhdpz.class ), "" );
   }

   public upd_exhdpz( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        java.math.BigDecimal aP3 ,
                        int aP4 ,
                        java.math.BigDecimal aP5 ,
                        java.math.BigDecimal aP6 ,
                        int aP7 ,
                        java.math.BigDecimal aP8 ,
                        String aP9 ,
                        String aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             java.math.BigDecimal aP3 ,
                             int aP4 ,
                             java.math.BigDecimal aP5 ,
                             java.math.BigDecimal aP6 ,
                             int aP7 ,
                             java.math.BigDecimal aP8 ,
                             String aP9 ,
                             String aP10 )
   {
      upd_exhdpz.this.A396EmprCod = aP0;
      upd_exhdpz.this.A2253SalExtAlb = aP1;
      upd_exhdpz.this.A6248SalExNln = aP2;
      upd_exhdpz.this.AV8SalExKgE = aP3;
      upd_exhdpz.this.AV9SalExCoE = aP4;
      upd_exhdpz.this.AV10SalExMtE = aP5;
      upd_exhdpz.this.AV11SalExKgEold = aP6;
      upd_exhdpz.this.AV12SalExCoEold = aP7;
      upd_exhdpz.this.AV13SalExMtEold = aP8;
      upd_exhdpz.this.AV14SalExObs = aP9;
      upd_exhdpz.this.AV15FasDscMn = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P0AHJ2 */
      pr_default.execute(0, new Object[] {AV15FasDscMn, AV14SalExObs, Integer.valueOf(AV12SalExCoEold), Integer.valueOf(AV9SalExCoE), AV13SalExMtEold, AV10SalExMtE, AV11SalExKgEold, AV8SalExKgE, A396EmprCod, Integer.valueOf(A2253SalExtAlb), Short.valueOf(A6248SalExNln)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "upd_exhdpz");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A14410FasDscMn = "" ;
      A6249SalExObs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.upd_exhdpz__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A6248SalExNln ;
   private short Gx_err ;
   private int A2253SalExtAlb ;
   private int AV9SalExCoE ;
   private int AV12SalExCoEold ;
   private java.math.BigDecimal AV8SalExKgE ;
   private java.math.BigDecimal AV10SalExMtE ;
   private java.math.BigDecimal AV11SalExKgEold ;
   private java.math.BigDecimal AV13SalExMtEold ;
   private String A396EmprCod ;
   private String AV14SalExObs ;
   private String AV15FasDscMn ;
   private String A14410FasDscMn ;
   private String A6249SalExObs ;
   private IDataStoreProvider pr_default ;
}

final  class upd_exhdpz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AHJ2", "UPDATE TXPEXHDPZ SET FasDscMn=?, SalExObs=?, SalExCoE=SalExCoE - ? + ?, SalExMtE=SalExMtE - ? + ?, SalExKgE=SalExKgE - ? + ?  WHERE EmprCod = ? and SalExtAlb = ? and SalExNln = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEXHDPZ")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
      }
   }

}

