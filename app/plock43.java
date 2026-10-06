package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock43 extends GXProcedure
{
   public plock43( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock43.class ), "" );
   }

   public plock43( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 )
   {
      plock43.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      plock43.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock43.this.A1013DibCli = aP1[0];
      this.aP1 = aP1;
      plock43.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      plock43.this.A1014DibInt = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05WE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1020DibObs = P05WE2_A1020DibObs[0] ;
         n1020DibObs = P05WE2_n1020DibObs[0] ;
         AV8DibObs = A1020DibObs ;
         A1020DibObs = AV8DibObs ;
         n1020DibObs = false ;
         /* Using cursor P05WE3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n1020DibObs), A1020DibObs, A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCDIBUJ");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock43.this.A396EmprCod;
      this.aP1[0] = plock43.this.A1013DibCli;
      this.aP2[0] = plock43.this.A252CliCod;
      this.aP3[0] = plock43.this.A1014DibInt;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock43");
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
      P05WE2_A396EmprCod = new String[] {""} ;
      P05WE2_A1013DibCli = new String[] {""} ;
      P05WE2_A252CliCod = new int[1] ;
      P05WE2_A1014DibInt = new int[1] ;
      P05WE2_A1020DibObs = new String[] {""} ;
      P05WE2_n1020DibObs = new boolean[] {false} ;
      A1020DibObs = "" ;
      AV8DibObs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock43__default(),
         new Object[] {
             new Object[] {
            P05WE2_A396EmprCod, P05WE2_A1013DibCli, P05WE2_A252CliCod, P05WE2_A1014DibInt, P05WE2_A1020DibObs, P05WE2_n1020DibObs
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
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String scmdbuf ;
   private String A1020DibObs ;
   private String AV8DibObs ;
   private boolean n1020DibObs ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05WE2_A396EmprCod ;
   private String[] P05WE2_A1013DibCli ;
   private int[] P05WE2_A252CliCod ;
   private int[] P05WE2_A1014DibInt ;
   private String[] P05WE2_A1020DibObs ;
   private boolean[] P05WE2_n1020DibObs ;
}

final  class plock43__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05WE2", "SELECT EmprCod, DibCli, CliCod, DibInt, DibObs FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05WE3", "UPDATE TXPCDIBUJ SET DibObs=?  WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCDIBUJ")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               return;
      }
   }

}

