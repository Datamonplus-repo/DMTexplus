package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ensayosproductos_lb_ultlp extends GXProcedure
{
   public ensayosproductos_lb_ultlp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ensayosproductos_lb_ultlp.class ), "" );
   }

   public ensayosproductos_lb_ultlp( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 )
   {
      ensayosproductos_lb_ultlp.this.A396EmprCod = aP0;
      ensayosproductos_lb_ultlp.this.A5532Lb_numero = aP1;
      ensayosproductos_lb_ultlp.this.A5555Lb_opcion = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Lb_UltLC = (short)(0) ;
      /* Using cursor P0AEW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5560Lb_LineaPr = P0AEW2_A5560Lb_LineaPr[0] ;
         AV14Lb_UltLC = A5560Lb_LineaPr ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Optimized UPDATE. */
      /* Using cursor P0AEW3 */
      pr_default.execute(1, new Object[] {Short.valueOf(AV14Lb_UltLC), A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.ensayosproductos_lb_ultlp");
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
      P0AEW2_A396EmprCod = new String[] {""} ;
      P0AEW2_A5532Lb_numero = new int[1] ;
      P0AEW2_A5555Lb_opcion = new String[] {""} ;
      P0AEW2_A5560Lb_LineaPr = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.ensayosproductos_lb_ultlp__default(),
         new Object[] {
             new Object[] {
            P0AEW2_A396EmprCod, P0AEW2_A5532Lb_numero, P0AEW2_A5555Lb_opcion, P0AEW2_A5560Lb_LineaPr
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14Lb_UltLC ;
   private short A5560Lb_LineaPr ;
   private short A5559Lb_UltlP ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String scmdbuf ;
   private IDataStoreProvider pr_default ;
   private String[] P0AEW2_A396EmprCod ;
   private int[] P0AEW2_A5532Lb_numero ;
   private String[] P0AEW2_A5555Lb_opcion ;
   private short[] P0AEW2_A5560Lb_LineaPr ;
}

final  class ensayosproductos_lb_ultlp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AEW2", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AEW3", "UPDATE TXPENS002 SET Lb_UltlP=?  WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

