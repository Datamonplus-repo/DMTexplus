package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precioporarticulo__prc extends GXProcedure
{
   public precioporarticulo__prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precioporarticulo__prc.class ), "" );
   }

   public precioporarticulo__prc( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        java.math.BigDecimal aP3 ,
                        java.math.BigDecimal aP4 ,
                        String aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             java.math.BigDecimal aP3 ,
                             java.math.BigDecimal aP4 ,
                             String aP5 )
   {
      precioporarticulo__prc.this.A396EmprCod = aP0;
      precioporarticulo__prc.this.A252CliCod = aP1;
      precioporarticulo__prc.this.A65ArtCod = aP2;
      precioporarticulo__prc.this.AV8Artprekgm = aP3;
      precioporarticulo__prc.this.AV9Artpremtr = aP4;
      precioporarticulo__prc.this.AV10ArtPreDef = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n91ArtPreDef = false ;
      n93ArtPreMtr = false ;
      n92ArtPreKgm = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0A432 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n91ArtPreDef), AV10ArtPreDef, Boolean.valueOf(n93ArtPreMtr), AV9Artpremtr, Boolean.valueOf(n92ArtPreKgm), AV8Artprekgm, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTICU");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.precioporarticulo__prc");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A91ArtPreDef = "" ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.precioporarticulo__prc__default(),
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
   private java.math.BigDecimal AV8Artprekgm ;
   private java.math.BigDecimal AV9Artpremtr ;
   private java.math.BigDecimal A93ArtPreMtr ;
   private java.math.BigDecimal A92ArtPreKgm ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV10ArtPreDef ;
   private String A91ArtPreDef ;
   private boolean n91ArtPreDef ;
   private boolean n93ArtPreMtr ;
   private boolean n92ArtPreKgm ;
   private IDataStoreProvider pr_default ;
}

final  class precioporarticulo__prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0A432", "UPDATE TXPARTICU SET ArtPreDef=?, ArtPreMtr=?, ArtPreKgm=?  WHERE EmprCod = ? and CliCod = ? and ArtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTICU")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setString(6, (String)parms[8], 16);
               return;
      }
   }

}

