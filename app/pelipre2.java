package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelipre2 extends GXProcedure
{
   public pelipre2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelipre2.class ), "" );
   }

   public pelipre2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pelipre2.this.aP2 = new String[] {""};
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
      pelipre2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelipre2.this.A756PrePrvNum = aP1[0];
      this.aP1 = aP1;
      pelipre2.this.A719PrdNum = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P01FF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A756PrePrvNum), A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPREPED");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelipre2.this.A396EmprCod;
      this.aP1[0] = pelipre2.this.A756PrePrvNum;
      this.aP2[0] = pelipre2.this.A719PrdNum;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelipre2__default(),
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
   private String A719PrdNum ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class pelipre2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01FF2", "DELETE FROM TXPPREPED  WHERE EmprCod = ? and PrePrvNum = ? and PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPREPED")
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
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

