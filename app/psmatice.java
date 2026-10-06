package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psmatice extends GXProcedure
{
   public psmatice( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psmatice.class ), "" );
   }

   public psmatice( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          short[] aP1 )
   {
      psmatice.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             int[] aP2 )
   {
      psmatice.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psmatice.this.A626MatCod = aP1[0];
      this.aP1 = aP1;
      psmatice.this.AV8MatConta = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n6456MatConta = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02HF2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n6456MatConta), Integer.valueOf(AV8MatConta), A396EmprCod, Short.valueOf(A626MatCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMATICE");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psmatice.this.A396EmprCod;
      this.aP1[0] = psmatice.this.A626MatCod;
      this.aP2[0] = psmatice.this.AV8MatConta;
      Application.commitDataStores(context, remoteHandle, pr_default, "psmatice");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psmatice__default(),
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
   private int A6456MatConta ;
   private String A396EmprCod ;
   private boolean n6456MatConta ;
   private int[] aP2 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class psmatice__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02HF2", "UPDATE TXPMATICE SET MatConta=?  WHERE EmprCod = ? and MatCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMATICE")
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

