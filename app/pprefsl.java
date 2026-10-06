package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprefsl extends GXProcedure
{
   public pprefsl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprefsl.class ), "" );
   }

   public pprefsl( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pprefsl.this.aP2 = new String[] {""};
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
      pprefsl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprefsl.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pprefsl.this.A457FasCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01RJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A467FasPreMtr = P01RJ2_A467FasPreMtr[0] ;
         n467FasPreMtr = P01RJ2_n467FasPreMtr[0] ;
         AV8FasCod = A457FasCod ;
         /* Using cursor P01RJ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV8FasCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5428FasPreCod = P01RJ3_A5428FasPreCod[0] ;
            /* Optimized DELETE. */
            /* Using cursor P01RJ4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5428FasPreCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFS1");
            /* End optimized DELETE. */
            /* Using cursor P01RJ5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A5428FasPreCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFSP");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Using cursor P01RJ6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREFAS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprefsl.this.A396EmprCod;
      this.aP1[0] = pprefsl.this.A252CliCod;
      this.aP2[0] = pprefsl.this.A457FasCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprefsl");
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
      P01RJ2_A396EmprCod = new String[] {""} ;
      P01RJ2_A252CliCod = new int[1] ;
      P01RJ2_A457FasCod = new String[] {""} ;
      P01RJ2_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01RJ2_n467FasPreMtr = new boolean[] {false} ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      AV8FasCod = "" ;
      P01RJ3_A396EmprCod = new String[] {""} ;
      P01RJ3_A252CliCod = new int[1] ;
      P01RJ3_A5428FasPreCod = new String[] {""} ;
      A5428FasPreCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprefsl__default(),
         new Object[] {
             new Object[] {
            P01RJ2_A396EmprCod, P01RJ2_A252CliCod, P01RJ2_A457FasCod, P01RJ2_A467FasPreMtr, P01RJ2_n467FasPreMtr
            }
            , new Object[] {
            P01RJ3_A396EmprCod, P01RJ3_A252CliCod, P01RJ3_A5428FasPreCod
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

   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal A467FasPreMtr ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String scmdbuf ;
   private String AV8FasCod ;
   private String A5428FasPreCod ;
   private boolean n467FasPreMtr ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01RJ2_A396EmprCod ;
   private int[] P01RJ2_A252CliCod ;
   private String[] P01RJ2_A457FasCod ;
   private java.math.BigDecimal[] P01RJ2_A467FasPreMtr ;
   private boolean[] P01RJ2_n467FasPreMtr ;
   private String[] P01RJ3_A396EmprCod ;
   private int[] P01RJ3_A252CliCod ;
   private String[] P01RJ3_A5428FasPreCod ;
}

final  class pprefsl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01RJ2", "SELECT EmprCod, CliCod, FasCod, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01RJ3", "SELECT EmprCod, CliCod, FasPreCod FROM TXPPREFSP WHERE EmprCod = ? and CliCod = ? and FasPreCod = ? ORDER BY EmprCod, CliCod, FasPreCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01RJ4", "DELETE FROM TXPPREFS1  WHERE EmprCod = ? and CliCod = ? and FasPreCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREFS1")
         ,new UpdateCursor("P01RJ5", "DELETE FROM TXPPREFSP  WHERE EmprCod = ? AND CliCod = ? AND FasPreCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREFSP")
         ,new UpdateCursor("P01RJ6", "DELETE FROM TXPPREFAS  WHERE EmprCod = ? AND CliCod = ? AND FasCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREFAS")
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
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
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

