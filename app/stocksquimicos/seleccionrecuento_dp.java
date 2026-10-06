package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class seleccionrecuento_dp extends GXProcedure
{
   public seleccionrecuento_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seleccionrecuento_dp.class ), "" );
   }

   public seleccionrecuento_dp( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.stocksquimicos.SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem> executeUdp( String aP0 )
   {
      seleccionrecuento_dp.this.aP1 = new GXBaseCollection[] {new GXBaseCollection<app.stocksquimicos.SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem>()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GXBaseCollection<app.stocksquimicos.SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem>[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GXBaseCollection<app.stocksquimicos.SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem>[] aP1 )
   {
      seleccionrecuento_dp.this.AV5EmprCod = aP0;
      seleccionrecuento_dp.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P002P2 */
      pr_default.execute(0, new Object[] {AV5EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P002P2_A396EmprCod[0] ;
         A810RecFec = P002P2_A810RecFec[0] ;
         Gxm1seleccionrecuento_sdt = (app.stocksquimicos.SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem)new app.stocksquimicos.SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1seleccionrecuento_sdt, 0);
         Gxm1seleccionrecuento_sdt.setgxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec( A810RecFec );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = seleccionrecuento_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.stocksquimicos.SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem>(app.stocksquimicos.SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem.class, "SeleccionRecuento_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P002P2_A396EmprCod = new String[] {""} ;
      P002P2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A810RecFec = GXutil.nullDate() ;
      Gxm1seleccionrecuento_sdt = new app.stocksquimicos.SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.seleccionrecuento_dp__default(),
         new Object[] {
             new Object[] {
            P002P2_A396EmprCod, P002P2_A810RecFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV5EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private java.util.Date A810RecFec ;
   private GXBaseCollection<app.stocksquimicos.SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem>[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P002P2_A396EmprCod ;
   private java.util.Date[] P002P2_A810RecFec ;
   private GXBaseCollection<app.stocksquimicos.SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem> Gxm2rootcol ;
   private app.stocksquimicos.SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem Gxm1seleccionrecuento_sdt ;
}

final  class seleccionrecuento_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002P2", "SELECT DISTINCT EmprCod, RecFec FROM TXPRECUEN WHERE EmprCod = ? ORDER BY EmprCod, RecFec DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

