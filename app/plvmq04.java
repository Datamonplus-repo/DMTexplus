package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plvmq04 extends GXProcedure
{
   public plvmq04( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plvmq04.class ), "" );
   }

   public plvmq04( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      plvmq04.this.aP2 = new String[] {""};
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
      plvmq04.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plvmq04.this.A12673LavMqId = aP1[0];
      this.aP1 = aP1;
      plvmq04.this.AV8usurcod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n12676LavMqFcUp = false ;
      n12677LavMqUsUp = false ;
      /* Optimized UPDATE. */
      /* Using cursor P05EA2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n12677LavMqUsUp), AV8usurcod, A396EmprCod, Integer.valueOf(A12673LavMqId)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLAVMQ0");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plvmq04.this.A396EmprCod;
      this.aP1[0] = plvmq04.this.A12673LavMqId;
      this.aP2[0] = plvmq04.this.AV8usurcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "plvmq04");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A12677LavMqUsUp = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plvmq04__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A12673LavMqId ;
   private String A396EmprCod ;
   private String AV8usurcod ;
   private String A12677LavMqUsUp ;
   private boolean n12676LavMqFcUp ;
   private boolean n12677LavMqUsUp ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class plvmq04__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P05EA2", "UPDATE TXPLAVMQ0 SET LavMqFcUp=(SYSDATE), LavMqUsUp=?  WHERE EmprCod = ? and LavMqId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLAVMQ0")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

