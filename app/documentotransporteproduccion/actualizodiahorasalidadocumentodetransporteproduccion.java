package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class actualizodiahorasalidadocumentodetransporteproduccion extends GXProcedure
{
   public actualizodiahorasalidadocumentodetransporteproduccion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( actualizodiahorasalidadocumentodetransporteproduccion.class ), "" );
   }

   public actualizodiahorasalidadocumentodetransporteproduccion( int remoteHandle ,
                                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        java.util.Date aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             java.util.Date aP2 )
   {
      actualizodiahorasalidadocumentodetransporteproduccion.this.A396EmprCod = aP0;
      actualizodiahorasalidadocumentodetransporteproduccion.this.A30AlbProCod = aP1;
      actualizodiahorasalidadocumentodetransporteproduccion.this.AV8AlbProsal = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10FecSal = GXutil.resetTime(localUtil.ctot( localUtil.ttoc( AV8AlbProsal, 8, 0, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      AV9ALbHorsal = localUtil.ttoc( AV8AlbProsal, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      /* Optimized UPDATE. */
      /* Using cursor P0A742 */
      pr_default.execute(0, new Object[] {AV9ALbHorsal, AV10FecSal, A396EmprCod, Long.valueOf(A30AlbProCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.actualizodiahorasalidadocumentodetransporteproduccion");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10FecSal = GXutil.nullDate() ;
      AV9ALbHorsal = "" ;
      A3865AlbHorSal = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.actualizodiahorasalidadocumentodetransporteproduccion__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV9ALbHorsal ;
   private String A3865AlbHorSal ;
   private java.util.Date AV8AlbProsal ;
   private java.util.Date AV10FecSal ;
   private java.util.Date A4023AlbFecSal ;
   private IDataStoreProvider pr_default ;
}

final  class actualizodiahorasalidadocumentodetransporteproduccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0A742", "UPDATE TXPCALPRD SET AlbHorSal=?, AlbFecSal=?  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
      }
   }

}

