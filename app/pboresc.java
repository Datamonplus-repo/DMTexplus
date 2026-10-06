package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pboresc extends GXProcedure
{
   public pboresc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pboresc.class ), "" );
   }

   public pboresc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pboresc.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pboresc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pboresc.this.A910Workstat = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P005C2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A910Workstat});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /* Using cursor P005C3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A910Workstat});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESCAN");
         /* Optimized DELETE. */
         /* Using cursor P005C4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A910Workstat});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESCAN");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P005C5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A910Workstat});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
         /* End optimized DELETE. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pboresc.this.A396EmprCod;
      this.aP1[0] = pboresc.this.A910Workstat;
      Application.commitDataStores(context, remoteHandle, pr_default, "pboresc");
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
      P005C2_A396EmprCod = new String[] {""} ;
      P005C2_A910Workstat = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pboresc__default(),
         new Object[] {
             new Object[] {
            P005C2_A396EmprCod, P005C2_A910Workstat
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
   private String A396EmprCod ;
   private String A910Workstat ;
   private String scmdbuf ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P005C2_A396EmprCod ;
   private String[] P005C2_A910Workstat ;
}

final  class pboresc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005C2", "SELECT EmprCod, Workstat FROM TXPCESCAN WHERE EmprCod = ? and Workstat = ? ORDER BY EmprCod, Workstat ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P005C3", "DELETE FROM TXPCESCAN  WHERE EmprCod = ? AND Workstat = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCESCAN")
         ,new UpdateCursor("P005C4", "DELETE FROM TXPLESCAN  WHERE EmprCod = ? and Workstat = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLESCAN")
         ,new UpdateCursor("P005C5", "DELETE FROM TXPESCMAN  WHERE EmprCod = ? and Workstat = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESCMAN")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
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
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
      }
   }

}

