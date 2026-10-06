package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock03 extends GXProcedure
{
   public plock03( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock03.class ), "" );
   }

   public plock03( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      plock03.this.aP1 = new int[] {0};
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
      plock03.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock03.this.A44AlbRecCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P045A2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A50AlbRLoc = P045A2_A50AlbRLoc[0] ;
         AV8AlbRLoc = A50AlbRLoc ;
         A50AlbRLoc = AV8AlbRLoc ;
         /* Using cursor P045A3 */
         pr_default.execute(1, new Object[] {A50AlbRLoc, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock03.this.A396EmprCod;
      this.aP1[0] = plock03.this.A44AlbRecCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock03");
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
      P045A2_A396EmprCod = new String[] {""} ;
      P045A2_A44AlbRecCod = new int[1] ;
      P045A2_A50AlbRLoc = new String[] {""} ;
      A50AlbRLoc = "" ;
      AV8AlbRLoc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock03__default(),
         new Object[] {
             new Object[] {
            P045A2_A396EmprCod, P045A2_A44AlbRecCod, P045A2_A50AlbRLoc
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A50AlbRLoc ;
   private String AV8AlbRLoc ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P045A2_A396EmprCod ;
   private int[] P045A2_A44AlbRecCod ;
   private String[] P045A2_A50AlbRLoc ;
}

final  class plock03__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P045A2", "SELECT EmprCod, AlbRecCod, AlbRLoc FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P045A3", "UPDATE TXPALBREC SET AlbRLoc=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
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
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

