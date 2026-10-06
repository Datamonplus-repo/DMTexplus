package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pensrgb extends GXProcedure
{
   public pensrgb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pensrgb.class ), "" );
   }

   public pensrgb( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           int[] aP1 )
   {
      pensrgb.this.aP2 = new long[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        long[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             long[] aP2 )
   {
      pensrgb.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pensrgb.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pensrgb.this.AV8Selected = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P01WG2 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV8Selected), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pensrgb.this.A396EmprCod;
      this.aP1[0] = pensrgb.this.A5532Lb_numero;
      this.aP2[0] = pensrgb.this.AV8Selected;
      Application.commitDataStores(context, remoteHandle, pr_default, "pensrgb");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pensrgb__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A5532Lb_numero ;
   private long AV8Selected ;
   private long A5599Lb_RGB ;
   private String A396EmprCod ;
   private long[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class pensrgb__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01WG2", "UPDATE TXPENS001 SET Lb_RGB=?  WHERE EmprCod = ? and Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

