package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpromd_del extends GXProcedure
{
   public tpromd_del( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpromd_del.class ), "" );
   }

   public tpromd_del( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 )
   {
      tpromd_del.this.A396EmprCod = aP0;
      tpromd_del.this.A252CliCod = aP1;
      tpromd_del.this.A8391PMDCod = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AMY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /* Using cursor P0AMY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD");
         /* Optimized DELETE. */
         /* Using cursor P0AMY4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPProMD1");
         /* End optimized DELETE. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tpromd_del");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P0AMY2_A396EmprCod = new String[] {""} ;
      P0AMY2_A252CliCod = new int[1] ;
      P0AMY2_A8391PMDCod = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd_del__default(),
         new Object[] {
             new Object[] {
            P0AMY2_A396EmprCod, P0AMY2_A252CliCod, P0AMY2_A8391PMDCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A8391PMDCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private IDataStoreProvider pr_default ;
   private String[] P0AMY2_A396EmprCod ;
   private int[] P0AMY2_A252CliCod ;
   private short[] P0AMY2_A8391PMDCod ;
}

final  class tpromd_del__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AMY2", "SELECT EmprCod, CliCod, PMDCod FROM TXPProMD WHERE EmprCod = ? and CliCod = ? and PMDCod = ? ORDER BY EmprCod, CliCod, PMDCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AMY3", "DELETE FROM TXPProMD  WHERE EmprCod = ? AND CliCod = ? AND PMDCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPProMD")
         ,new UpdateCursor("P0AMY4", "DELETE FROM TXPProMD1  WHERE EmprCod = ? and CliCod = ? and PMDCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPProMD1")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

