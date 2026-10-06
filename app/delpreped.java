package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class delpreped extends GXProcedure
{
   public delpreped( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( delpreped.class ), "" );
   }

   public delpreped( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      delpreped.this.aP1 = new int[] {0};
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
      delpreped.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      delpreped.this.A756PrePrvNum = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P08RL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREPED");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = delpreped.this.A396EmprCod;
      this.aP1[0] = delpreped.this.A756PrePrvNum;
      Application.commitDataStores(context, remoteHandle, pr_default, "delpreped");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.delpreped__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A756PrePrvNum ;
   private String A396EmprCod ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
}

final  class delpreped__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P08RL2", "DELETE FROM TXPPREPED  WHERE (EmprCod = ? and PrePrvNum = ?) AND ((PedCod = 0))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREPED")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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

