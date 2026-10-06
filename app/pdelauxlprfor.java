package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelauxlprfor extends GXProcedure
{
   public pdelauxlprfor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelauxlprfor.class ), "" );
   }

   public pdelauxlprfor( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      pdelauxlprfor.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pdelauxlprfor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelauxlprfor.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pdelauxlprfor.this.A5555Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pdelauxlprfor.this.AV9Nfibra = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P060C2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6545Lb_PTinP = P060C2_A6545Lb_PTinP[0] ;
         A5560Lb_LineaPr = P060C2_A5560Lb_LineaPr[0] ;
         if ( A6545Lb_PTinP == AV9Nfibra )
         {
            /* Using cursor P060C3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5560Lb_LineaPr)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS004");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelauxlprfor.this.A396EmprCod;
      this.aP1[0] = pdelauxlprfor.this.A5532Lb_numero;
      this.aP2[0] = pdelauxlprfor.this.A5555Lb_opcion;
      this.aP3[0] = pdelauxlprfor.this.AV9Nfibra;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelauxlprfor");
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
      P060C2_A396EmprCod = new String[] {""} ;
      P060C2_A5532Lb_numero = new int[1] ;
      P060C2_A5555Lb_opcion = new String[] {""} ;
      P060C2_A6545Lb_PTinP = new byte[1] ;
      P060C2_A5560Lb_LineaPr = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelauxlprfor__default(),
         new Object[] {
             new Object[] {
            P060C2_A396EmprCod, P060C2_A5532Lb_numero, P060C2_A5555Lb_opcion, P060C2_A6545Lb_PTinP, P060C2_A5560Lb_LineaPr
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Nfibra ;
   private byte A6545Lb_PTinP ;
   private short A5560Lb_LineaPr ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String scmdbuf ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P060C2_A396EmprCod ;
   private int[] P060C2_A5532Lb_numero ;
   private String[] P060C2_A5555Lb_opcion ;
   private byte[] P060C2_A6545Lb_PTinP ;
   private short[] P060C2_A5560Lb_LineaPr ;
}

final  class pdelauxlprfor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P060C2", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_PTinP, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P060C3", "DELETE FROM TXPENS004  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaPr = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS004")
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

