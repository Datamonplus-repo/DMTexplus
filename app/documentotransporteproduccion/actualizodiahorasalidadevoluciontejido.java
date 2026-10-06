package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class actualizodiahorasalidadevoluciontejido extends GXProcedure
{
   public actualizodiahorasalidadevoluciontejido( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( actualizodiahorasalidadevoluciontejido.class ), "" );
   }

   public actualizodiahorasalidadevoluciontejido( int remoteHandle ,
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
      actualizodiahorasalidadevoluciontejido.this.A396EmprCod = aP0;
      actualizodiahorasalidadevoluciontejido.this.A11669DevCruId = aP1;
      actualizodiahorasalidadevoluciontejido.this.AV11DevCruSal = aP2;
      actualizodiahorasalidadevoluciontejido.this.AV12DevCruDtSys = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized UPDATE. */
      /* Using cursor P0AIB2 */
      pr_default.execute(0, new Object[] {AV12DevCruDtSys, AV11DevCruSal, A396EmprCod, Integer.valueOf(A11669DevCruId)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.actualizodiahorasalidadevoluciontejido");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.actualizodiahorasalidadevoluciontejido__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A11669DevCruId ;
   private String A396EmprCod ;
   private java.util.Date AV11DevCruSal ;
   private java.util.Date AV12DevCruDtSys ;
   private java.util.Date A11676DevCruDtSy ;
   private java.util.Date A11673DevCruSal ;
   private IDataStoreProvider pr_default ;
}

final  class actualizodiahorasalidadevoluciontejido__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AIB2", "UPDATE TXPDEVCRU SET DevCruDtSy=?, DevCruSal=?  WHERE EmprCod = ? and DevCruId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDEVCRU")
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

