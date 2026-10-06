package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacclicod extends GXProcedure
{
   public pfacclicod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacclicod.class ), "" );
   }

   public pfacclicod( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pfacclicod.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pfacclicod.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacclicod.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P045Q2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P045Q2_A252CliCod[0] ;
         AV8Clicod = A252CliCod ;
         /* Optimized UPDATE. */
         /* Using cursor P045Q3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(AV8Clicod), A396EmprCod, Integer.valueOf(A430FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFAVEN");
         /* End optimized UPDATE. */
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacclicod.this.A396EmprCod;
      this.aP1[0] = pfacclicod.this.A430FacCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.pfacclicod");
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
      P045Q2_A396EmprCod = new String[] {""} ;
      P045Q2_A430FacCod = new int[1] ;
      P045Q2_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.pfacclicod__default(),
         new Object[] {
             new Object[] {
            P045Q2_A396EmprCod, P045Q2_A430FacCod, P045Q2_A252CliCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int AV8Clicod ;
   private int A3883FacCliCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P045Q2_A396EmprCod ;
   private int[] P045Q2_A430FacCod ;
   private int[] P045Q2_A252CliCod ;
}

final  class pfacclicod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P045Q2", "SELECT EmprCod, FacCod, CliCod FROM TXPCFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P045Q3", "UPDATE TXPLFAVEN SET FacCliCod=?  WHERE EmprCod = ? and FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFAVEN")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

