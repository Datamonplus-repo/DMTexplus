package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plock13 extends GXProcedure
{
   public plock13( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plock13.class ), "" );
   }

   public plock13( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      plock13.this.aP1 = new int[] {0};
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
      plock13.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plock13.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04A42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10418FacAran = P04A42_A10418FacAran[0] ;
         AV11FacAran = A10418FacAran ;
         A10418FacAran = AV11FacAran ;
         /* Using cursor P04A43 */
         pr_default.execute(1, new Object[] {A10418FacAran, A396EmprCod, Integer.valueOf(A430FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plock13.this.A396EmprCod;
      this.aP1[0] = plock13.this.A430FacCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "plock13");
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
      P04A42_A396EmprCod = new String[] {""} ;
      P04A42_A430FacCod = new int[1] ;
      P04A42_A10418FacAran = new String[] {""} ;
      A10418FacAran = "" ;
      AV11FacAran = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plock13__default(),
         new Object[] {
             new Object[] {
            P04A42_A396EmprCod, P04A42_A430FacCod, P04A42_A10418FacAran
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A430FacCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A10418FacAran ;
   private String AV11FacAran ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P04A42_A396EmprCod ;
   private int[] P04A42_A430FacCod ;
   private String[] P04A42_A10418FacAran ;
}

final  class plock13__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04A42", "SELECT EmprCod, FacCod, FacAran FROM TXPCFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04A43", "UPDATE TXPCFAVEN SET FacAran=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
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
               stmt.setString(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

