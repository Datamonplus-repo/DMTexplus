package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class traspasarpreciofases_dp extends GXProcedure
{
   public traspasarpreciofases_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( traspasarpreciofases_dp.class ), "" );
   }

   public traspasarpreciofases_dp( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.facturacion.SdtTraspasarPrecioFases_SDT_Item> executeUdp( String aP0 ,
                                                                                         int aP1 )
   {
      traspasarpreciofases_dp.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<app.facturacion.SdtTraspasarPrecioFases_SDT_Item>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        GXBaseCollection<app.facturacion.SdtTraspasarPrecioFases_SDT_Item>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             GXBaseCollection<app.facturacion.SdtTraspasarPrecioFases_SDT_Item>[] aP2 )
   {
      traspasarpreciofases_dp.this.AV5emprcod = aP0;
      traspasarpreciofases_dp.this.AV6Clicod = aP1;
      traspasarpreciofases_dp.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004Q2 */
      pr_default.execute(0, new Object[] {AV5emprcod, Integer.valueOf(AV6Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P004Q2_A396EmprCod[0] ;
         A252CliCod = P004Q2_A252CliCod[0] ;
         A14042FasActiva = P004Q2_A14042FasActiva[0] ;
         A457FasCod = P004Q2_A457FasCod[0] ;
         A460FasDsc = P004Q2_A460FasDsc[0] ;
         A466FasPreKgm = P004Q2_A466FasPreKgm[0] ;
         n466FasPreKgm = P004Q2_n466FasPreKgm[0] ;
         A467FasPreMtr = P004Q2_A467FasPreMtr[0] ;
         n467FasPreMtr = P004Q2_n467FasPreMtr[0] ;
         A10882FasPreU = P004Q2_A10882FasPreU[0] ;
         n10882FasPreU = P004Q2_n10882FasPreU[0] ;
         A14042FasActiva = P004Q2_A14042FasActiva[0] ;
         A460FasDsc = P004Q2_A460FasDsc[0] ;
         Gxm1traspasarpreciofases_sdt = (app.facturacion.SdtTraspasarPrecioFases_SDT_Item)new app.facturacion.SdtTraspasarPrecioFases_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1traspasarpreciofases_sdt, 0);
         Gxm1traspasarpreciofases_sdt.setgxTv_SdtTraspasarPrecioFases_SDT_Item_Selected( false );
         Gxm1traspasarpreciofases_sdt.setgxTv_SdtTraspasarPrecioFases_SDT_Item_Clicod( A252CliCod );
         Gxm1traspasarpreciofases_sdt.setgxTv_SdtTraspasarPrecioFases_SDT_Item_Fascod( A457FasCod );
         Gxm1traspasarpreciofases_sdt.setgxTv_SdtTraspasarPrecioFases_SDT_Item_Fasdsc( A460FasDsc );
         Gxm1traspasarpreciofases_sdt.setgxTv_SdtTraspasarPrecioFases_SDT_Item_Fasprekgm( A466FasPreKgm );
         Gxm1traspasarpreciofases_sdt.setgxTv_SdtTraspasarPrecioFases_SDT_Item_Faspremtr( A467FasPreMtr );
         Gxm1traspasarpreciofases_sdt.setgxTv_SdtTraspasarPrecioFases_SDT_Item_Faspreu( A10882FasPreU );
         Gxm1traspasarpreciofases_sdt.setgxTv_SdtTraspasarPrecioFases_SDT_Item_Fasactiva( A14042FasActiva );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = traspasarpreciofases_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.facturacion.SdtTraspasarPrecioFases_SDT_Item>(app.facturacion.SdtTraspasarPrecioFases_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P004Q2_A396EmprCod = new String[] {""} ;
      P004Q2_A252CliCod = new int[1] ;
      P004Q2_A14042FasActiva = new String[] {""} ;
      P004Q2_A457FasCod = new String[] {""} ;
      P004Q2_A460FasDsc = new String[] {""} ;
      P004Q2_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004Q2_n466FasPreKgm = new boolean[] {false} ;
      P004Q2_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004Q2_n467FasPreMtr = new boolean[] {false} ;
      P004Q2_A10882FasPreU = new byte[1] ;
      P004Q2_n10882FasPreU = new boolean[] {false} ;
      A396EmprCod = "" ;
      A14042FasActiva = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      Gxm1traspasarpreciofases_sdt = new app.facturacion.SdtTraspasarPrecioFases_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.traspasarpreciofases_dp__default(),
         new Object[] {
             new Object[] {
            P004Q2_A396EmprCod, P004Q2_A252CliCod, P004Q2_A14042FasActiva, P004Q2_A457FasCod, P004Q2_A460FasDsc, P004Q2_A466FasPreKgm, P004Q2_n466FasPreKgm, P004Q2_A467FasPreMtr, P004Q2_n467FasPreMtr, P004Q2_A10882FasPreU,
            P004Q2_n10882FasPreU
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A10882FasPreU ;
   private short Gx_err ;
   private int AV6Clicod ;
   private int A252CliCod ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private String AV5emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A14042FasActiva ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private boolean n10882FasPreU ;
   private GXBaseCollection<app.facturacion.SdtTraspasarPrecioFases_SDT_Item>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P004Q2_A396EmprCod ;
   private int[] P004Q2_A252CliCod ;
   private String[] P004Q2_A14042FasActiva ;
   private String[] P004Q2_A457FasCod ;
   private String[] P004Q2_A460FasDsc ;
   private java.math.BigDecimal[] P004Q2_A466FasPreKgm ;
   private boolean[] P004Q2_n466FasPreKgm ;
   private java.math.BigDecimal[] P004Q2_A467FasPreMtr ;
   private boolean[] P004Q2_n467FasPreMtr ;
   private byte[] P004Q2_A10882FasPreU ;
   private boolean[] P004Q2_n10882FasPreU ;
   private GXBaseCollection<app.facturacion.SdtTraspasarPrecioFases_SDT_Item> Gxm2rootcol ;
   private app.facturacion.SdtTraspasarPrecioFases_SDT_Item Gxm1traspasarpreciofases_sdt ;
}

final  class traspasarpreciofases_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004Q2", "SELECT T1.EmprCod, T1.CliCod, T2.FasActiva, T1.FasCod, T2.FasDsc, T1.FasPreKgm, T1.FasPreMtr, T1.FasPreU FROM (TXPPREFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.CliCod = ?) AND (T2.FasActiva = 'S') ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

