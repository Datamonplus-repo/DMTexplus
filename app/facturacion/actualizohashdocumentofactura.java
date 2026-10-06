package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class actualizohashdocumentofactura extends GXProcedure
{
   public actualizohashdocumentofactura( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( actualizohashdocumentofactura.class ), "" );
   }

   public actualizohashdocumentofactura( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      actualizohashdocumentofactura.this.aP3 = new String[] {""};
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
      actualizohashdocumentofactura.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      actualizohashdocumentofactura.this.AV9FacCod = aP1[0];
      this.aP1 = aP1;
      actualizohashdocumentofactura.this.AV10texto = aP2[0];
      this.aP2 = aP2;
      actualizohashdocumentofactura.this.AV11Hash = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P09YR2 */
      pr_default.execute(0, new Object[] {AV11Hash, AV10texto, AV10texto, A396EmprCod, Integer.valueOf(AV9FacCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = actualizohashdocumentofactura.this.A396EmprCod;
      this.aP1[0] = actualizohashdocumentofactura.this.AV9FacCod;
      this.aP2[0] = actualizohashdocumentofactura.this.AV10texto;
      this.aP3[0] = actualizohashdocumentofactura.this.AV11Hash;
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.actualizohashdocumentofactura");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.actualizohashdocumentofactura__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV9FacCod ;
   private String A396EmprCod ;
   private String AV10texto ;
   private String AV11Hash ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class actualizohashdocumentofactura__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P09YR2", "UPDATE TXPCFAVEN SET FacFirma=SUBSTR(?, 1, 200), FacFirDg=SUBSTR(?, 1, 200), FacObs=RTRIM(LTRIM(?))  WHERE EmprCod = ? and FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
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
               stmt.setString(1, (String)parms[0], 200);
               stmt.setString(2, (String)parms[1], 300);
               stmt.setString(3, (String)parms[2], 300);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

