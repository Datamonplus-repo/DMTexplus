package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprequl extends GXProcedure
{
   public pprequl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprequl.class ), "" );
   }

   public pprequl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pprequl.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pprequl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprequl.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pprequl.this.A5452P_ForCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01RK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /* Optimized DELETE. */
         /* Using cursor P01RK3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREQP");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P01RK4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMinAcs");
         /* End optimized DELETE. */
         /* Using cursor P01RK5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5452P_ForCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREQL");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprequl.this.A396EmprCod;
      this.aP1[0] = pprequl.this.A252CliCod;
      this.aP2[0] = pprequl.this.A5452P_ForCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprequl");
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
      P01RK2_A396EmprCod = new String[] {""} ;
      P01RK2_A252CliCod = new int[1] ;
      P01RK2_A5452P_ForCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprequl__default(),
         new Object[] {
             new Object[] {
            P01RK2_A396EmprCod, P01RK2_A252CliCod, P01RK2_A5452P_ForCod
            }
            , new Object[] {
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

   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A5452P_ForCod ;
   private String scmdbuf ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01RK2_A396EmprCod ;
   private int[] P01RK2_A252CliCod ;
   private String[] P01RK2_A5452P_ForCod ;
}

final  class pprequl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01RK2", "SELECT EmprCod, CliCod, P_ForCod FROM TXPPREQL WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? ORDER BY EmprCod, CliCod, P_ForCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01RK3", "DELETE FROM TXPPREQP  WHERE EmprCod = ? and CliCod = ? and P_ForCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREQP")
         ,new UpdateCursor("P01RK4", "DELETE FROM TXPMinAcs  WHERE EmprCod = ? and CliCod = ? and P_ForCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMinAcs")
         ,new UpdateCursor("P01RK5", "DELETE FROM TXPPREQL  WHERE EmprCod = ? AND CliCod = ? AND P_ForCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREQL")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

