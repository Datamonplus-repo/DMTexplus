package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class del_albfas extends GXProcedure
{
   public del_albfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( del_albfas.class ), "" );
   }

   public del_albfas( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        short aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             short aP5 )
   {
      del_albfas.this.AV8emprcod = aP0;
      del_albfas.this.AV9albprocod = aP1;
      del_albfas.this.AV10barcod = aP2;
      del_albfas.this.AV11barcodreo = aP3;
      del_albfas.this.AV12barcodpar = aP4;
      del_albfas.this.AV13Guifaslin = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P0AHF2 */
      pr_default.execute(0, new Object[] {AV8emprcod, Long.valueOf(AV9albprocod), Integer.valueOf(AV10barcod), Byte.valueOf(AV11barcodreo), AV12barcodpar, Short.valueOf(AV13Guifaslin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
      /* End optimized DELETE. */
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.del_albfas");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.del_albfas__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11barcodreo ;
   private short AV13Guifaslin ;
   private short Gx_err ;
   private int AV10barcod ;
   private long AV9albprocod ;
   private String AV8emprcod ;
   private String AV12barcodpar ;
   private IDataStoreProvider pr_default ;
}

final  class del_albfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AHF2", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

