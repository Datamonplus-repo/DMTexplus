package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodmac extends GXProcedure
{
   public pmodmac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodmac.class ), "" );
   }

   public pmodmac( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pmodmac.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pmodmac.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodmac.this.A1202MacDisCod = aP1[0];
      this.aP1 = aP1;
      pmodmac.this.AV15BarCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P007X2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV15BarCod), A396EmprCod, Integer.valueOf(A1202MacDisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodmac.this.A396EmprCod;
      this.aP1[0] = pmodmac.this.A1202MacDisCod;
      this.aP2[0] = pmodmac.this.AV15BarCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodmac");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodmac__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A1202MacDisCod ;
   private int AV15BarCod ;
   private int A1203MacBarCod ;
   private String A396EmprCod ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class pmodmac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P007X2", "UPDATE TXPLMACRO SET MacBarPar=' ', MacBarReo=0, MacBarCod=?  WHERE EmprCod = ? and MacDisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMACRO")
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

