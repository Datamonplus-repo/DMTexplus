package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precioporcolor_cliente_dp extends GXProcedure
{
   public precioporcolor_cliente_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precioporcolor_cliente_dp.class ), "" );
   }

   public precioporcolor_cliente_dp( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item> executeUdp( String aP0 ,
                                                                                           int aP1 )
   {
      precioporcolor_cliente_dp.this.aP2 = new GXBaseCollection[] {new GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item>()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item>[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item>[] aP2 )
   {
      precioporcolor_cliente_dp.this.AV5Emprcod = aP0;
      precioporcolor_cliente_dp.this.AV6Clicod = aP1;
      precioporcolor_cliente_dp.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P003H2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P003H2_A396EmprCod[0] ;
         A252CliCod = P003H2_A252CliCod[0] ;
         A4380ForCosForm = P003H2_A4380ForCosForm[0] ;
         n4380ForCosForm = P003H2_n4380ForCosForm[0] ;
         A1191ForNomCli = P003H2_A1191ForNomCli[0] ;
         n1191ForNomCli = P003H2_n1191ForNomCli[0] ;
         A1192ForNumCli = P003H2_A1192ForNumCli[0] ;
         n1192ForNumCli = P003H2_n1192ForNumCli[0] ;
         A492ForPreKgm = P003H2_A492ForPreKgm[0] ;
         n492ForPreKgm = P003H2_n492ForPreKgm[0] ;
         A3585ForPreFec = P003H2_A3585ForPreFec[0] ;
         n3585ForPreFec = P003H2_n3585ForPreFec[0] ;
         A491ForPreDef = P003H2_A491ForPreDef[0] ;
         n491ForPreDef = P003H2_n491ForPreDef[0] ;
         A831TipColCod = P003H2_A831TipColCod[0] ;
         A483ForColNum = P003H2_A483ForColNum[0] ;
         A482ForColNom = P003H2_A482ForColNom[0] ;
         A494ForSer = P003H2_A494ForSer[0] ;
         Gxm1precioporcolor_cliente_sdt = (app.facturacion.SdtPrecioporColor_Cliente_SDT_Item)new app.facturacion.SdtPrecioporColor_Cliente_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1precioporcolor_cliente_sdt, 0);
         GXt_int1 = AV7GrdTipARt ;
         GXv_int2[0] = GXt_int1 ;
         new app.get_grdtipart(remoteHandle, context).execute( AV5Emprcod, A831TipColCod, GXv_int2) ;
         precioporcolor_cliente_dp.this.GXt_int1 = GXv_int2[0] ;
         AV7GrdTipARt = GXt_int1 ;
         GXt_decimal3 = AV8Coste_Ta ;
         GXv_decimal4[0] = GXt_decimal3 ;
         new app.pcosgencopy1(remoteHandle, context).execute( AV5Emprcod, AV7GrdTipARt, A4380ForCosForm, GXv_decimal4) ;
         precioporcolor_cliente_dp.this.GXt_decimal3 = GXv_decimal4[0] ;
         AV8Coste_Ta = GXt_decimal3 ;
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Seleccionar( false );
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser( A494ForSer );
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum( A483ForColNum );
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom( A482ForColNom );
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod( A831TipColCod );
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli( A1191ForNomCli );
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli( A1192ForNumCli );
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm( A492ForPreKgm );
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm( A492ForPreKgm );
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec( A3585ForPreFec );
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef( A491ForPreDef );
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef( A491ForPreDef );
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform( A4380ForCosForm );
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart( AV7GrdTipARt );
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general( AV8Coste_Ta );
         Gxm1precioporcolor_cliente_sdt.setgxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total( (AV8Coste_Ta.add(A4380ForCosForm)) );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = precioporcolor_cliente_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item>(app.facturacion.SdtPrecioporColor_Cliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P003H2_A396EmprCod = new String[] {""} ;
      P003H2_A252CliCod = new int[1] ;
      P003H2_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003H2_n4380ForCosForm = new boolean[] {false} ;
      P003H2_A1191ForNomCli = new String[] {""} ;
      P003H2_n1191ForNomCli = new boolean[] {false} ;
      P003H2_A1192ForNumCli = new int[1] ;
      P003H2_n1192ForNumCli = new boolean[] {false} ;
      P003H2_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003H2_n492ForPreKgm = new boolean[] {false} ;
      P003H2_A3585ForPreFec = new java.util.Date[] {GXutil.nullDate()} ;
      P003H2_n3585ForPreFec = new boolean[] {false} ;
      P003H2_A491ForPreDef = new String[] {""} ;
      P003H2_n491ForPreDef = new boolean[] {false} ;
      P003H2_A831TipColCod = new byte[1] ;
      P003H2_A483ForColNum = new int[1] ;
      P003H2_A482ForColNom = new String[] {""} ;
      P003H2_A494ForSer = new String[] {""} ;
      A396EmprCod = "" ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      A1191ForNomCli = "" ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A3585ForPreFec = GXutil.nullDate() ;
      A491ForPreDef = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      Gxm1precioporcolor_cliente_sdt = new app.facturacion.SdtPrecioporColor_Cliente_SDT_Item(remoteHandle, context);
      GXv_int2 = new short[1] ;
      AV8Coste_Ta = DecimalUtil.ZERO ;
      GXt_decimal3 = DecimalUtil.ZERO ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.precioporcolor_cliente_dp__default(),
         new Object[] {
             new Object[] {
            P003H2_A396EmprCod, P003H2_A252CliCod, P003H2_A4380ForCosForm, P003H2_n4380ForCosForm, P003H2_A1191ForNomCli, P003H2_n1191ForNomCli, P003H2_A1192ForNumCli, P003H2_n1192ForNumCli, P003H2_A492ForPreKgm, P003H2_n492ForPreKgm,
            P003H2_A3585ForPreFec, P003H2_n3585ForPreFec, P003H2_A491ForPreDef, P003H2_n491ForPreDef, P003H2_A831TipColCod, P003H2_A483ForColNum, P003H2_A482ForColNom, P003H2_A494ForSer
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short AV7GrdTipARt ;
   private short GXt_int1 ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int AV6Clicod ;
   private int A252CliCod ;
   private int A1192ForNumCli ;
   private int A483ForColNum ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal A492ForPreKgm ;
   private java.math.BigDecimal AV8Coste_Ta ;
   private java.math.BigDecimal GXt_decimal3 ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String AV5Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A1191ForNomCli ;
   private String A491ForPreDef ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private java.util.Date A3585ForPreFec ;
   private boolean n4380ForCosForm ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean n492ForPreKgm ;
   private boolean n3585ForPreFec ;
   private boolean n491ForPreDef ;
   private GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item>[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P003H2_A396EmprCod ;
   private int[] P003H2_A252CliCod ;
   private java.math.BigDecimal[] P003H2_A4380ForCosForm ;
   private boolean[] P003H2_n4380ForCosForm ;
   private String[] P003H2_A1191ForNomCli ;
   private boolean[] P003H2_n1191ForNomCli ;
   private int[] P003H2_A1192ForNumCli ;
   private boolean[] P003H2_n1192ForNumCli ;
   private java.math.BigDecimal[] P003H2_A492ForPreKgm ;
   private boolean[] P003H2_n492ForPreKgm ;
   private java.util.Date[] P003H2_A3585ForPreFec ;
   private boolean[] P003H2_n3585ForPreFec ;
   private String[] P003H2_A491ForPreDef ;
   private boolean[] P003H2_n491ForPreDef ;
   private byte[] P003H2_A831TipColCod ;
   private int[] P003H2_A483ForColNum ;
   private String[] P003H2_A482ForColNom ;
   private String[] P003H2_A494ForSer ;
   private GXBaseCollection<app.facturacion.SdtPrecioporColor_Cliente_SDT_Item> Gxm2rootcol ;
   private app.facturacion.SdtPrecioporColor_Cliente_SDT_Item Gxm1precioporcolor_cliente_sdt ;
}

final  class precioporcolor_cliente_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003H2", "SELECT EmprCod, CliCod, ForCosForm, ForNomCli, ForNumCli, ForPreKgm, ForPreFec, ForPreDef, TipColCod, ForColNum, ForColNom, ForSer FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((String[]) buf[16])[0] = rslt.getString(11, 13);
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
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

