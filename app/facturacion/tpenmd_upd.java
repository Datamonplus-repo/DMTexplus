package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpenmd_upd extends GXProcedure
{
   public tpenmd_upd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpenmd_upd.class ), "" );
   }

   public tpenmd_upd( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.math.BigDecimal aP2 ,
                        java.math.BigDecimal aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.math.BigDecimal aP2 ,
                             java.math.BigDecimal aP3 )
   {
      tpenmd_upd.this.A396EmprCod = aP0;
      tpenmd_upd.this.A252CliCod = aP1;
      tpenmd_upd.this.AV8PMDPreLim = aP2;
      tpenmd_upd.this.AV9PMDPreMin = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n8401PMDPreMin = false ;
      n8400PMDPreLim = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0AMQ2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n8401PMDPreMin), AV9PMDPreMin, Boolean.valueOf(n8400PMDPreLim), AV8PMDPreLim, A396EmprCod, Integer.valueOf(A252CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tpenmd_upd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A8401PMDPreMin = DecimalUtil.ZERO ;
      A8400PMDPreLim = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpenmd_upd__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV8PMDPreLim ;
   private java.math.BigDecimal AV9PMDPreMin ;
   private java.math.BigDecimal A8401PMDPreMin ;
   private java.math.BigDecimal A8400PMDPreLim ;
   private String A396EmprCod ;
   private boolean n8401PMDPreMin ;
   private boolean n8400PMDPreLim ;
   private IDataStoreProvider pr_default ;
}

final  class tpenmd_upd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AMQ2", "UPDATE TXPCLIENT SET PMDPreMin=?, PMDPreLim=?  WHERE EmprCod = ? and CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
      }
   }

}

