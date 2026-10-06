package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class devoluciontejido_atcud extends GXProcedure
{
   public devoluciontejido_atcud( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_atcud.class ), "" );
   }

   public devoluciontejido_atcud( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             int aP1 )
   {
      devoluciontejido_atcud.this.A396EmprCod = aP0;
      devoluciontejido_atcud.this.A11669DevCruId = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AKM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13983DevCruATCU = P0AKM2_A13983DevCruATCU[0] ;
         A13984DevCruSerA = P0AKM2_A13984DevCruSerA[0] ;
         A13985DevCruTipA = P0AKM2_A13985DevCruTipA[0] ;
         GXv_char1[0] = AV8DevCruATCUD ;
         GXv_char2[0] = AV9DevCruSerAT ;
         GXv_char3[0] = AV10DevCruTipAT ;
         new app.patcud(remoteHandle, context).execute( A396EmprCod, "022400", GXv_char1, GXv_char2, GXv_char3, GXutil.trim( AV14Pgmname)+"."+GXutil.trim( AV15Pgmdesc)) ;
         devoluciontejido_atcud.this.AV8DevCruATCUD = GXv_char1[0] ;
         devoluciontejido_atcud.this.AV9DevCruSerAT = GXv_char2[0] ;
         devoluciontejido_atcud.this.AV10DevCruTipAT = GXv_char3[0] ;
         A13983DevCruATCU = AV8DevCruATCUD ;
         A13984DevCruSerA = AV9DevCruSerAT ;
         A13985DevCruTipA = AV10DevCruTipAT ;
         /* Using cursor P0AKM3 */
         pr_default.execute(1, new Object[] {A13983DevCruATCU, A13984DevCruSerA, A13985DevCruTipA, A396EmprCod, Integer.valueOf(A11669DevCruId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "almacensindetalle.devoluciontejido_atcud");
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
      P0AKM2_A396EmprCod = new String[] {""} ;
      P0AKM2_A11669DevCruId = new int[1] ;
      P0AKM2_A13983DevCruATCU = new String[] {""} ;
      P0AKM2_A13984DevCruSerA = new String[] {""} ;
      P0AKM2_A13985DevCruTipA = new String[] {""} ;
      A13983DevCruATCU = "" ;
      A13984DevCruSerA = "" ;
      A13985DevCruTipA = "" ;
      AV8DevCruATCUD = "" ;
      GXv_char1 = new String[1] ;
      AV9DevCruSerAT = "" ;
      GXv_char2 = new String[1] ;
      AV10DevCruTipAT = "" ;
      GXv_char3 = new String[1] ;
      AV14Pgmname = "" ;
      AV15Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_atcud__default(),
         new Object[] {
             new Object[] {
            P0AKM2_A396EmprCod, P0AKM2_A11669DevCruId, P0AKM2_A13983DevCruATCU, P0AKM2_A13984DevCruSerA, P0AKM2_A13985DevCruTipA
            }
            , new Object[] {
            }
         }
      );
      AV15Pgmdesc = httpContext.getMessage( "Devolucion Tejido_ATCUD", "") ;
      AV14Pgmname = "AlmacenSinDetalle.DevolucionTejido_ATCUD" ;
      /* GeneXus formulas. */
      AV15Pgmdesc = httpContext.getMessage( "Devolucion Tejido_ATCUD", "") ;
      AV14Pgmname = "AlmacenSinDetalle.DevolucionTejido_ATCUD" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A11669DevCruId ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A13983DevCruATCU ;
   private String A13984DevCruSerA ;
   private String A13985DevCruTipA ;
   private String AV8DevCruATCUD ;
   private String GXv_char1[] ;
   private String AV9DevCruSerAT ;
   private String GXv_char2[] ;
   private String AV10DevCruTipAT ;
   private String GXv_char3[] ;
   private String AV14Pgmname ;
   private String AV15Pgmdesc ;
   private IDataStoreProvider pr_default ;
   private String[] P0AKM2_A396EmprCod ;
   private int[] P0AKM2_A11669DevCruId ;
   private String[] P0AKM2_A13983DevCruATCU ;
   private String[] P0AKM2_A13984DevCruSerA ;
   private String[] P0AKM2_A13985DevCruTipA ;
}

final  class devoluciontejido_atcud__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKM2", "SELECT EmprCod, DevCruId, DevCruATCU, DevCruSerA, DevCruTipA FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AKM3", "UPDATE TXPDEVCRU SET DevCruATCU=?, DevCruSerA=?, DevCruTipA=?  WHERE EmprCod = ? AND DevCruId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVCRU")
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
            case 1 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

