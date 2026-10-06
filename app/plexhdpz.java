package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plexhdpz extends GXProcedure
{
   public plexhdpz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plexhdpz.class ), "" );
   }

   public plexhdpz( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 )
   {
      plexhdpz.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      plexhdpz.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plexhdpz.this.AV16SalExtAlb = aP1[0];
      this.aP1 = aP1;
      plexhdpz.this.AV17SalExNln = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02CO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16SalExtAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2253SalExtAlb = P02CO2_A2253SalExtAlb[0] ;
         A6247SalExUln = P02CO2_A6247SalExUln[0] ;
         if ( ( A6247SalExUln + 5 ) <= 9999 )
         {
            A6247SalExUln = (short)(A6247SalExUln+5) ;
            AV17SalExNln = A6247SalExUln ;
         }
         else
         {
            AV17SalExNln = (short)(9999) ;
         }
         /* Using cursor P02CO3 */
         pr_default.execute(1, new Object[] {Short.valueOf(A6247SalExUln), A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plexhdpz.this.A396EmprCod;
      this.aP1[0] = plexhdpz.this.AV16SalExtAlb;
      this.aP2[0] = plexhdpz.this.AV17SalExNln;
      Application.commitDataStores(context, remoteHandle, pr_default, "plexhdpz");
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
      P02CO2_A396EmprCod = new String[] {""} ;
      P02CO2_A2253SalExtAlb = new int[1] ;
      P02CO2_A6247SalExUln = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plexhdpz__default(),
         new Object[] {
             new Object[] {
            P02CO2_A396EmprCod, P02CO2_A2253SalExtAlb, P02CO2_A6247SalExUln
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV17SalExNln ;
   private short A6247SalExUln ;
   private short Gx_err ;
   private int AV16SalExtAlb ;
   private int A2253SalExtAlb ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private short[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02CO2_A396EmprCod ;
   private int[] P02CO2_A2253SalExtAlb ;
   private short[] P02CO2_A6247SalExUln ;
}

final  class plexhdpz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02CO2", "SELECT EmprCod, SalExtAlb, SalExUln FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb = ? ORDER BY EmprCod, SalExtAlb ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02CO3", "UPDATE TXPCEXTSA SET SalExUln=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEXTSA")
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
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

