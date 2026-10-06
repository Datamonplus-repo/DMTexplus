package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock06 extends GXProcedure
{
   public plock06( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock06.class ), "" );
   }

   public plock06( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      plock06.this.aP1 = new int[] {0};
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
      plock06.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock06.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P045D2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6618Lb_PedCod = P045D2_A6618Lb_PedCod[0] ;
         AV9Lb_PedCod = A6618Lb_PedCod ;
         A6618Lb_PedCod = AV9Lb_PedCod ;
         /* Using cursor P045D3 */
         pr_default.execute(1, new Object[] {A6618Lb_PedCod, A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock06.this.A396EmprCod;
      this.aP1[0] = plock06.this.A5532Lb_numero;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock06");
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
      P045D2_A396EmprCod = new String[] {""} ;
      P045D2_A5532Lb_numero = new int[1] ;
      P045D2_A6618Lb_PedCod = new String[] {""} ;
      A6618Lb_PedCod = "" ;
      AV9Lb_PedCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock06__default(),
         new Object[] {
             new Object[] {
            P045D2_A396EmprCod, P045D2_A5532Lb_numero, P045D2_A6618Lb_PedCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A6618Lb_PedCod ;
   private String AV9Lb_PedCod ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P045D2_A396EmprCod ;
   private int[] P045D2_A5532Lb_numero ;
   private String[] P045D2_A6618Lb_PedCod ;
}

final  class plock06__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P045D2", "SELECT EmprCod, Lb_numero, Lb_PedCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P045D3", "UPDATE TXPENS001 SET Lb_PedCod=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
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
               stmt.setString(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

