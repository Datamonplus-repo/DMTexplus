package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradaensayolaboratorio_productos_dp extends GXProcedure
{
   public entradaensayolaboratorio_productos_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayolaboratorio_productos_dp.class ), "" );
   }

   public entradaensayolaboratorio_productos_dp( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item> executeUdp( String aP0 ,
                                                                                                              String aP1 )
   {
      entradaensayolaboratorio_productos_dp.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        GXBaseCollection<app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             GXBaseCollection<app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item>[] aP2 )
   {
      entradaensayolaboratorio_productos_dp.this.AV5Emprcod = aP0;
      entradaensayolaboratorio_productos_dp.this.AV6Lb_CodGru = aP1;
      entradaensayolaboratorio_productos_dp.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004J2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV6Lb_CodGru});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P004J2_A396EmprCod[0] ;
         A5612Lb_CodGru = P004J2_A5612Lb_CodGru[0] ;
         A856ValCod = P004J2_A856ValCod[0] ;
         A5615Lb_LinGru = P004J2_A5615Lb_LinGru[0] ;
         A719PrdNum = P004J2_A719PrdNum[0] ;
         A718PrdNom = P004J2_A718PrdNom[0] ;
         A857ValDsc = P004J2_A857ValDsc[0] ;
         n857ValDsc = P004J2_n857ValDsc[0] ;
         A856ValCod = P004J2_A856ValCod[0] ;
         A718PrdNom = P004J2_A718PrdNom[0] ;
         A857ValDsc = P004J2_A857ValDsc[0] ;
         n857ValDsc = P004J2_n857ValDsc[0] ;
         Gxm1entradaensayolaboratorio_productos_sdt = (app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)new app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1entradaensayolaboratorio_productos_sdt, 0);
         Gxm1entradaensayolaboratorio_productos_sdt.setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar( ((A856ValCod<3) ? true : false) );
         Gxm1entradaensayolaboratorio_productos_sdt.setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru( A5615Lb_LinGru );
         Gxm1entradaensayolaboratorio_productos_sdt.setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum( A719PrdNum );
         Gxm1entradaensayolaboratorio_productos_sdt.setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom( A718PrdNom );
         Gxm1entradaensayolaboratorio_productos_sdt.setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod( A856ValCod );
         Gxm1entradaensayolaboratorio_productos_sdt.setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc( A857ValDsc );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = entradaensayolaboratorio_productos_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item>(app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P004J2_A396EmprCod = new String[] {""} ;
      P004J2_A5612Lb_CodGru = new String[] {""} ;
      P004J2_A856ValCod = new byte[1] ;
      P004J2_A5615Lb_LinGru = new short[1] ;
      P004J2_A719PrdNum = new String[] {""} ;
      P004J2_A718PrdNom = new String[] {""} ;
      P004J2_A857ValDsc = new String[] {""} ;
      P004J2_n857ValDsc = new boolean[] {false} ;
      A396EmprCod = "" ;
      A5612Lb_CodGru = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A857ValDsc = "" ;
      Gxm1entradaensayolaboratorio_productos_sdt = new app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratorio_productos_dp__default(),
         new Object[] {
             new Object[] {
            P004J2_A396EmprCod, P004J2_A5612Lb_CodGru, P004J2_A856ValCod, P004J2_A5615Lb_LinGru, P004J2_A719PrdNum, P004J2_A718PrdNom, P004J2_A857ValDsc, P004J2_n857ValDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short A5615Lb_LinGru ;
   private short Gx_err ;
   private String AV5Emprcod ;
   private String AV6Lb_CodGru ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5612Lb_CodGru ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A857ValDsc ;
   private boolean n857ValDsc ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P004J2_A396EmprCod ;
   private String[] P004J2_A5612Lb_CodGru ;
   private byte[] P004J2_A856ValCod ;
   private short[] P004J2_A5615Lb_LinGru ;
   private String[] P004J2_A719PrdNum ;
   private String[] P004J2_A718PrdNom ;
   private String[] P004J2_A857ValDsc ;
   private boolean[] P004J2_n857ValDsc ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item> Gxm2rootcol ;
   private app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item Gxm1entradaensayolaboratorio_productos_sdt ;
}

final  class entradaensayolaboratorio_productos_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004J2", "SELECT T1.EmprCod, T1.Lb_CodGru, T2.ValCod, T1.Lb_LinGru, T1.PrdNum, T2.PrdNom, T3.ValDsc FROM ((TXPENSPR1 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod = T2.ValCod) WHERE T1.EmprCod = ? and T1.Lb_CodGru = ? ORDER BY T1.EmprCod, T1.Lb_CodGru ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 2);
               return;
      }
   }

}

