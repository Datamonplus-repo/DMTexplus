package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class actualizodiahorasalidadocumentoproveedor extends GXProcedure
{
   public actualizodiahorasalidadocumentoproveedor( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( actualizodiahorasalidadocumentoproveedor.class ), "" );
   }

   public actualizodiahorasalidadocumentoproveedor( int remoteHandle ,
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
      actualizodiahorasalidadocumentoproveedor.this.A396EmprCod = aP0;
      actualizodiahorasalidadocumentoproveedor.this.A13418AlbProID = aP1;
      actualizodiahorasalidadocumentoproveedor.this.AV9AlbProsal = aP2;
      actualizodiahorasalidadocumentoproveedor.this.AV10AlbProSys = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P09Z62 */
      pr_default.execute(0, new Object[] {AV10AlbProSys, AV9AlbProsal, A396EmprCod, Integer.valueOf(A13418AlbProID)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRO");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "actualizodiahorasalidadocumentoproveedor");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A13431AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.actualizodiahorasalidadocumentoproveedor__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A13418AlbProID ;
   private String A396EmprCod ;
   private java.util.Date AV9AlbProsal ;
   private java.util.Date AV10AlbProSys ;
   private java.util.Date A13431AlbProSys ;
   private java.util.Date A13429AlbProSal ;
   private IDataStoreProvider pr_default ;
}

final  class actualizodiahorasalidadocumentoproveedor__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P09Z62", "UPDATE TXPCALPRO SET AlbProSys=?, AlbProSal=?  WHERE EmprCod = ? and AlbProID = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRO")
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

