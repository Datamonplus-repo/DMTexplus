package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class actualizodiahorasalidadocumentotransportecomercial extends GXProcedure
{
   public actualizodiahorasalidadocumentotransportecomercial( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( actualizodiahorasalidadocumentotransportecomercial.class ), "" );
   }

   public actualizodiahorasalidadocumentotransportecomercial( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 )
   {
      actualizodiahorasalidadocumentotransportecomercial.this.A396EmprCod = aP0;
      actualizodiahorasalidadocumentotransportecomercial.this.A14AlbComCod = aP1;
      actualizodiahorasalidadocumentotransportecomercial.this.AV8AlbProsal = aP2;
      actualizodiahorasalidadocumentotransportecomercial.this.AV11AlbComFs = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P0AHV2 */
      pr_default.execute(0, new Object[] {AV11AlbComFs, AV8AlbProsal, A396EmprCod, Integer.valueOf(A14AlbComCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.actualizodiahorasalidadocumentotransportecomercial");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.actualizodiahorasalidadocumentotransportecomercial__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A14AlbComCod ;
   private String A396EmprCod ;
   private java.util.Date AV8AlbProsal ;
   private java.util.Date AV11AlbComFs ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date A4829AlbComHor ;
   private IDataStoreProvider pr_default ;
}

final  class actualizodiahorasalidadocumentotransportecomercial__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AHV2", "UPDATE TXPCALCOM SET AlbComFs=?, AlbComHor=?  WHERE EmprCod = ? and AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
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
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

