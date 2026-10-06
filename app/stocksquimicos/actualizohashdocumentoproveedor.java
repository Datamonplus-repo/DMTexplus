package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class actualizohashdocumentoproveedor extends GXProcedure
{
   public actualizohashdocumentoproveedor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( actualizohashdocumentoproveedor.class ), "" );
   }

   public actualizohashdocumentoproveedor( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      actualizohashdocumentoproveedor.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      actualizohashdocumentoproveedor.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      actualizohashdocumentoproveedor.this.AV42FacCod = aP1[0];
      this.aP1 = aP1;
      actualizohashdocumentoproveedor.this.AV43texto = aP2[0];
      this.aP2 = aP2;
      actualizohashdocumentoproveedor.this.AV44Hash = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P099Q2 */
      String AV43texto13434Aux;
      AV43texto13434Aux = AV43texto ;
      pr_default.execute(0, new Object[] {AV44Hash, AV43texto13434Aux, A396EmprCod, Integer.valueOf(AV42FacCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = actualizohashdocumentoproveedor.this.A396EmprCod;
      this.aP1[0] = actualizohashdocumentoproveedor.this.AV42FacCod;
      this.aP2[0] = actualizohashdocumentoproveedor.this.AV43texto;
      this.aP3[0] = actualizohashdocumentoproveedor.this.AV44Hash;
      Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.actualizohashdocumentoproveedor");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A13433AlbProHh = "" ;
      A13434AlbProHhCt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.actualizohashdocumentoproveedor__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV42FacCod ;
   private String A396EmprCod ;
   private String AV43texto ;
   private String AV44Hash ;
   private String A13433AlbProHh ;
   private String A13434AlbProHhCt ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class actualizohashdocumentoproveedor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P099Q2", "UPDATE TXPCALPRO SET AlbProHh=?, AlbProHhCt=?  WHERE EmprCod = ? and AlbProID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRO")
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
               stmt.setVarchar(1, (String)parms[0], 200, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

