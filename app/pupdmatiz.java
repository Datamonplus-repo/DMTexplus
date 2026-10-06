package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupdmatiz extends GXProcedure
{
   public pupdmatiz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupdmatiz.class ), "" );
   }

   public pupdmatiz( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          short[] aP1 ,
                          int[] aP2 )
   {
      pupdmatiz.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      pupdmatiz.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pupdmatiz.this.A626MatCod = aP1[0];
      this.aP1 = aP1;
      pupdmatiz.this.AV8MatConta = aP2[0];
      this.aP2 = aP2;
      pupdmatiz.this.AV9Lb_colnum = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Lb_colnum = AV8MatConta ;
      n6456MatConta = false ;
      /* Optimized UPDATE. */
      /* Using cursor P04L02 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n6456MatConta), Integer.valueOf(AV8MatConta), A396EmprCod, Short.valueOf(A626MatCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMATICE");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pupdmatiz.this.A396EmprCod;
      this.aP1[0] = pupdmatiz.this.A626MatCod;
      this.aP2[0] = pupdmatiz.this.AV8MatConta;
      this.aP3[0] = pupdmatiz.this.AV9Lb_colnum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pupdmatiz");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pupdmatiz__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A626MatCod ;
   private short Gx_err ;
   private int AV8MatConta ;
   private int AV9Lb_colnum ;
   private int A6456MatConta ;
   private String A396EmprCod ;
   private boolean n6456MatConta ;
   private int[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class pupdmatiz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P04L02", "UPDATE TXPMATICE SET MatConta=?  WHERE EmprCod = ? and MatCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMATICE")
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
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

