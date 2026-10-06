package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccdef1_del extends GXProcedure
{
   public controlcalidad_ccdef1_del( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccdef1_del.class ), "" );
   }

   public controlcalidad_ccdef1_del( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 )
   {
      controlcalidad_ccdef1_del.this.A396EmprCod = aP0;
      controlcalidad_ccdef1_del.this.A4031CCTCod = aP1;
      controlcalidad_ccdef1_del.this.A4034CCTLin = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AQE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4044CCTLinTpoD = P0AQE2_A4044CCTLinTpoD[0] ;
         /* Optimized DELETE. */
         /* Using cursor P0AQE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef2");
         /* End optimized DELETE. */
         /* Using cursor P0AQE4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef1");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad_ccdef1_del");
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
      P0AQE2_A396EmprCod = new String[] {""} ;
      P0AQE2_A4031CCTCod = new int[1] ;
      P0AQE2_A4034CCTLin = new short[1] ;
      P0AQE2_A4044CCTLinTpoD = new String[] {""} ;
      A4044CCTLinTpoD = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef1_del__default(),
         new Object[] {
             new Object[] {
            P0AQE2_A396EmprCod, P0AQE2_A4031CCTCod, P0AQE2_A4034CCTLin, P0AQE2_A4044CCTLinTpoD
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

   private short A4034CCTLin ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A4044CCTLinTpoD ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQE2_A396EmprCod ;
   private int[] P0AQE2_A4031CCTCod ;
   private short[] P0AQE2_A4034CCTLin ;
   private String[] P0AQE2_A4044CCTLinTpoD ;
}

final  class controlcalidad_ccdef1_del__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQE2", "SELECT EmprCod, CCTCod, CCTLin, CCTLinTpoD FROM TXPCCDef1 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AQE3", "DELETE FROM TXPCCDef2  WHERE EmprCod = ? and CCTCod = ? and CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef2")
         ,new UpdateCursor("P0AQE4", "DELETE FROM TXPCCDef1  WHERE EmprCod = ? AND CCTCod = ? AND CCTLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCDef1")
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

