package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclientc extends GXProcedure
{
   public pclientc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclientc.class ), "" );
   }

   public pclientc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pclientc.this.aP2 = new String[] {""};
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
      pclientc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclientc.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pclientc.this.AV8Clictrl = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P03GX2 */
      pr_default.execute(0, new Object[] {AV8Clictrl, A396EmprCod, Integer.valueOf(A252CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclientc.this.A396EmprCod;
      this.aP1[0] = pclientc.this.A252CliCod;
      this.aP2[0] = pclientc.this.AV8Clictrl;
      Application.commitDataStores(context, remoteHandle, pr_default, "pclientc");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A1901CliCtrl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclientc__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV8Clictrl ;
   private String A1901CliCtrl ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class pclientc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03GX2", "UPDATE TXPCLIENT SET CliCtrl=?  WHERE EmprCod = ? and CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIENT")
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
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

