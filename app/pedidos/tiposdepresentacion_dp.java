package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tiposdepresentacion_dp extends GXProcedure
{
   public tiposdepresentacion_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tiposdepresentacion_dp.class ), "" );
   }

   public tiposdepresentacion_dp( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.pedidos.SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem> executeUdp( )
   {
      tiposdepresentacion_dp.this.aP0 = new GXBaseCollection[] {new GXBaseCollection<app.pedidos.SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem>()};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( GXBaseCollection<app.pedidos.SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem>[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GXBaseCollection<app.pedidos.SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem>[] aP0 )
   {
      tiposdepresentacion_dp.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00392 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1962TipPreCod = P00392_A1962TipPreCod[0] ;
         A1963TipPreDsc = P00392_A1963TipPreDsc[0] ;
         A396EmprCod = P00392_A396EmprCod[0] ;
         Gxm1tiposdepresentacion_sdt = (app.pedidos.SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem)new app.pedidos.SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1tiposdepresentacion_sdt, 0);
         Gxm1tiposdepresentacion_sdt.setgxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Seleccion( false );
         Gxm1tiposdepresentacion_sdt.setgxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tipprecod( A1962TipPreCod );
         Gxm1tiposdepresentacion_sdt.setgxTv_SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem_Tippredsc( A1963TipPreDsc );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = tiposdepresentacion_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.pedidos.SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem>(app.pedidos.SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem.class, "TiposdePresentacion_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00392_A1962TipPreCod = new short[1] ;
      P00392_A1963TipPreDsc = new String[] {""} ;
      P00392_A396EmprCod = new String[] {""} ;
      A1963TipPreDsc = "" ;
      A396EmprCod = "" ;
      Gxm1tiposdepresentacion_sdt = new app.pedidos.SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.tiposdepresentacion_dp__default(),
         new Object[] {
             new Object[] {
            P00392_A1962TipPreCod, P00392_A1963TipPreDsc, P00392_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A1962TipPreCod ;
   private short Gx_err ;
   private String scmdbuf ;
   private String A1963TipPreDsc ;
   private String A396EmprCod ;
   private GXBaseCollection<app.pedidos.SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem>[] aP0 ;
   private IDataStoreProvider pr_default ;
   private short[] P00392_A1962TipPreCod ;
   private String[] P00392_A1963TipPreDsc ;
   private String[] P00392_A396EmprCod ;
   private GXBaseCollection<app.pedidos.SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem> Gxm2rootcol ;
   private app.pedidos.SdtTiposdePresentacion_SDT_TiposdePresentacion_SDTItem Gxm1tiposdepresentacion_sdt ;
}

final  class tiposdepresentacion_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00392", "SELECT TipPreCod, TipPreDsc, EmprCod FROM TXPTIPPRE ORDER BY EmprCod, TipPreCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

