package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppddg15 extends GXProcedure
{
   public ppddg15( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppddg15.class ), "" );
   }

   public ppddg15( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      ppddg15.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      ppddg15.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppddg15.this.A13026PedDGId = aP1[0];
      this.aP1 = aP1;
      ppddg15.this.A758ProCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05PG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         /* Using cursor P05PG3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG4");
         /* Using cursor P05PG4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A13045PedDGFasLi = P05PG4_A13045PedDGFasLi[0] ;
            /* Using cursor P05PG5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG5");
            /* Optimized DELETE. */
            /* Using cursor P05PG6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG8");
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P05PG7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG7");
            /* End optimized DELETE. */
            pr_default.readNext(2);
         }
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppddg15.this.A396EmprCod;
      this.aP1[0] = ppddg15.this.A13026PedDGId;
      this.aP2[0] = ppddg15.this.A758ProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppddg15");
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
      P05PG2_A396EmprCod = new String[] {""} ;
      P05PG2_A13026PedDGId = new int[1] ;
      P05PG2_A758ProCod = new String[] {""} ;
      P05PG4_A396EmprCod = new String[] {""} ;
      P05PG4_A13026PedDGId = new int[1] ;
      P05PG4_A758ProCod = new String[] {""} ;
      P05PG4_A13045PedDGFasLi = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppddg15__default(),
         new Object[] {
             new Object[] {
            P05PG2_A396EmprCod, P05PG2_A13026PedDGId, P05PG2_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05PG4_A396EmprCod, P05PG4_A13026PedDGId, P05PG4_A758ProCod, P05PG4_A13045PedDGFasLi
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

   private short A13045PedDGFasLi ;
   private short Gx_err ;
   private int A13026PedDGId ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String scmdbuf ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05PG2_A396EmprCod ;
   private int[] P05PG2_A13026PedDGId ;
   private String[] P05PG2_A758ProCod ;
   private String[] P05PG4_A396EmprCod ;
   private int[] P05PG4_A13026PedDGId ;
   private String[] P05PG4_A758ProCod ;
   private short[] P05PG4_A13045PedDGFasLi ;
}

final  class ppddg15__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05PG2", "SELECT EmprCod, PedDGId, ProCod FROM TXPPEDDG4 WHERE EmprCod = ? and PedDGId = ? and ProCod = ? ORDER BY EmprCod, PedDGId, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05PG3", "DELETE FROM TXPPEDDG4  WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG4")
         ,new ForEachCursor("P05PG4", "SELECT EmprCod, PedDGId, ProCod, PedDGFasLi FROM TXPPEDDG5 WHERE EmprCod = ? and PedDGId = ? and ProCod = ? ORDER BY EmprCod, PedDGId, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05PG5", "DELETE FROM TXPPEDDG5  WHERE EmprCod = ? AND PedDGId = ? AND ProCod = ? AND PedDGFasLi = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG5")
         ,new UpdateCursor("P05PG6", "DELETE FROM TXPPEDDG8  WHERE EmprCod = ? and PedDGId = ? and ProCod = ? and PedDGFasLi = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG8")
         ,new UpdateCursor("P05PG7", "DELETE FROM TXPPEDDG7  WHERE EmprCod = ? and PedDGId = ? and ProCod = ? and PedDGFasLi = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG7")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
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
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

