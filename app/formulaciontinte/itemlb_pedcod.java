package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class itemlb_pedcod extends GXProcedure
{
   public itemlb_pedcod( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( itemlb_pedcod.class ), "" );
   }

   public itemlb_pedcod( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 )
   {
      itemlb_pedcod.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String[] aP2 )
   {
      itemlb_pedcod.this.A396EmprCod = aP0;
      itemlb_pedcod.this.A5532Lb_numero = aP1;
      itemlb_pedcod.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Lb_PedCod = "" ;
      /* Using cursor P0AT22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6618Lb_PedCod = P0AT22_A6618Lb_PedCod[0] ;
         AV8Lb_PedCod = A6618Lb_PedCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = itemlb_pedcod.this.AV8Lb_PedCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Lb_PedCod = "" ;
      scmdbuf = "" ;
      P0AT22_A396EmprCod = new String[] {""} ;
      P0AT22_A5532Lb_numero = new int[1] ;
      P0AT22_A6618Lb_PedCod = new String[] {""} ;
      A6618Lb_PedCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.itemlb_pedcod__default(),
         new Object[] {
             new Object[] {
            P0AT22_A396EmprCod, P0AT22_A5532Lb_numero, P0AT22_A6618Lb_PedCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String AV8Lb_PedCod ;
   private String scmdbuf ;
   private String A6618Lb_PedCod ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AT22_A396EmprCod ;
   private int[] P0AT22_A5532Lb_numero ;
   private String[] P0AT22_A6618Lb_PedCod ;
}

final  class itemlb_pedcod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AT22", "SELECT EmprCod, Lb_numero, Lb_PedCod FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
      }
   }

}

