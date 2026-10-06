package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmsolanu extends GXProcedure
{
   public pmsolanu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmsolanu.class ), "" );
   }

   public pmsolanu( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pmsolanu.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pmsolanu.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmsolanu.this.A9428SMCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03MS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9428SMCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9522SMEst = P03MS2_A9522SMEst[0] ;
         n9522SMEst = P03MS2_n9522SMEst[0] ;
         A9522SMEst = httpContext.getMessage( "A", "") ;
         n9522SMEst = false ;
         /* Using cursor P03MS3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n9522SMEst), A9522SMEst, A396EmprCod, Integer.valueOf(A9428SMCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMSOLIC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmsolanu.this.A396EmprCod;
      this.aP1[0] = pmsolanu.this.A9428SMCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmsolanu");
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
      P03MS2_A396EmprCod = new String[] {""} ;
      P03MS2_A9428SMCod = new int[1] ;
      P03MS2_A9522SMEst = new String[] {""} ;
      P03MS2_n9522SMEst = new boolean[] {false} ;
      A9522SMEst = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmsolanu__default(),
         new Object[] {
             new Object[] {
            P03MS2_A396EmprCod, P03MS2_A9428SMCod, P03MS2_A9522SMEst, P03MS2_n9522SMEst
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A9428SMCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A9522SMEst ;
   private boolean n9522SMEst ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03MS2_A396EmprCod ;
   private int[] P03MS2_A9428SMCod ;
   private String[] P03MS2_A9522SMEst ;
   private boolean[] P03MS2_n9522SMEst ;
}

final  class pmsolanu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03MS2", "SELECT EmprCod, SMCod, SMEst FROM TXPMSOLIC WHERE EmprCod = ? and SMCod = ? ORDER BY EmprCod, SMCod  FOR UPDATE OF SMEst NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P03MS3", "UPDATE TXPMSOLIC SET SMEst=?  WHERE EmprCod = ? AND SMCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMSOLIC")
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

