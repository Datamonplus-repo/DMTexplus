package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class actualizodiahorasalidaalbarancomercial extends GXProcedure
{
   public actualizodiahorasalidaalbarancomercial( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( actualizodiahorasalidaalbarancomercial.class ), "" );
   }

   public actualizodiahorasalidaalbarancomercial( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.util.Date aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.util.Date aP2 )
   {
      actualizodiahorasalidaalbarancomercial.this.A396EmprCod = aP0;
      actualizodiahorasalidaalbarancomercial.this.A14AlbComCod = aP1;
      actualizodiahorasalidaalbarancomercial.this.AV9AlbComHor = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P09Z52 */
      pr_default.execute(0, new Object[] {AV9AlbComHor, A396EmprCod, Integer.valueOf(A14AlbComCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "actualizodiahorasalidaalbarancomercial");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.actualizodiahorasalidaalbarancomercial__default(),
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
   private java.util.Date AV9AlbComHor ;
   private java.util.Date A4829AlbComHor ;
   private IDataStoreProvider pr_default ;
}

final  class actualizodiahorasalidaalbarancomercial__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P09Z52", "UPDATE TXPCALCOM SET AlbComHor=?  WHERE EmprCod = ? and AlbComCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALCOM")
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
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

