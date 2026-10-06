package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devoluciontejido_get_atcud extends GXProcedure
{
   public devoluciontejido_get_atcud( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_get_atcud.class ), "" );
   }

   public devoluciontejido_get_atcud( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      devoluciontejido_get_atcud.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      devoluciontejido_get_atcud.this.A396EmprCod = aP0;
      devoluciontejido_get_atcud.this.A11669DevCruId = aP1;
      devoluciontejido_get_atcud.this.aP2 = aP2;
      devoluciontejido_get_atcud.this.aP3 = aP3;
      devoluciontejido_get_atcud.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8DevCruATCUD = "" ;
      AV9DevCruSerAT = "" ;
      AV10DevCruTipAT = "" ;
      /* Using cursor P0AKN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13983DevCruATCU = P0AKN2_A13983DevCruATCU[0] ;
         A13984DevCruSerA = P0AKN2_A13984DevCruSerA[0] ;
         A13985DevCruTipA = P0AKN2_A13985DevCruTipA[0] ;
         AV8DevCruATCUD = A13983DevCruATCU ;
         AV9DevCruSerAT = A13984DevCruSerA ;
         AV10DevCruTipAT = A13985DevCruTipA ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = devoluciontejido_get_atcud.this.AV8DevCruATCUD;
      this.aP3[0] = devoluciontejido_get_atcud.this.AV9DevCruSerAT;
      this.aP4[0] = devoluciontejido_get_atcud.this.AV10DevCruTipAT;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8DevCruATCUD = "" ;
      AV9DevCruSerAT = "" ;
      AV10DevCruTipAT = "" ;
      scmdbuf = "" ;
      P0AKN2_A396EmprCod = new String[] {""} ;
      P0AKN2_A11669DevCruId = new int[1] ;
      P0AKN2_A13983DevCruATCU = new String[] {""} ;
      P0AKN2_A13984DevCruSerA = new String[] {""} ;
      P0AKN2_A13985DevCruTipA = new String[] {""} ;
      A13983DevCruATCU = "" ;
      A13984DevCruSerA = "" ;
      A13985DevCruTipA = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_get_atcud__default(),
         new Object[] {
             new Object[] {
            P0AKN2_A396EmprCod, P0AKN2_A11669DevCruId, P0AKN2_A13983DevCruATCU, P0AKN2_A13984DevCruSerA, P0AKN2_A13985DevCruTipA
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A11669DevCruId ;
   private String A396EmprCod ;
   private String AV8DevCruATCUD ;
   private String AV9DevCruSerAT ;
   private String AV10DevCruTipAT ;
   private String scmdbuf ;
   private String A13983DevCruATCU ;
   private String A13984DevCruSerA ;
   private String A13985DevCruTipA ;
   private String[] aP4 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AKN2_A396EmprCod ;
   private int[] P0AKN2_A11669DevCruId ;
   private String[] P0AKN2_A13983DevCruATCU ;
   private String[] P0AKN2_A13984DevCruSerA ;
   private String[] P0AKN2_A13985DevCruTipA ;
}

final  class devoluciontejido_get_atcud__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKN2", "SELECT EmprCod, DevCruId, DevCruATCU, DevCruSerA, DevCruTipA FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
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

