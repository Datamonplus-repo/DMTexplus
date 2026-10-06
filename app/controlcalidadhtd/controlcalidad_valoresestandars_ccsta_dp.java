package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_valoresestandars_ccsta_dp extends GXProcedure
{
   public controlcalidad_valoresestandars_ccsta_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_valoresestandars_ccsta_dp.class ), "" );
   }

   public controlcalidad_valoresestandars_ccsta_dp( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item> executeUdp( String aP0 ,
                                                                                                                int aP1 ,
                                                                                                                String aP2 ,
                                                                                                                String aP3 ,
                                                                                                                int aP4 ,
                                                                                                                int aP5 ,
                                                                                                                short aP6 )
   {
      controlcalidad_valoresestandars_ccsta_dp.this.aP7 = new GXBaseCollection[] {new GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        int aP5 ,
                        short aP6 ,
                        GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item>[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             int aP5 ,
                             short aP6 ,
                             GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item>[] aP7 )
   {
      controlcalidad_valoresestandars_ccsta_dp.this.A396EmprCod = aP0;
      controlcalidad_valoresestandars_ccsta_dp.this.A252CliCod = aP1;
      controlcalidad_valoresestandars_ccsta_dp.this.AV5CCArtCod = aP2;
      controlcalidad_valoresestandars_ccsta_dp.this.AV6CCFColNom = aP3;
      controlcalidad_valoresestandars_ccsta_dp.this.AV7CCFColNum = aP4;
      controlcalidad_valoresestandars_ccsta_dp.this.A4031CCTCod = aP5;
      controlcalidad_valoresestandars_ccsta_dp.this.A4034CCTLin = aP6;
      controlcalidad_valoresestandars_ccsta_dp.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Integer.valueOf(AV7CCFColNum), AV6CCFColNom, AV5CCArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11522CCVCod = P004V2_A11522CCVCod[0] ;
         A65ArtCod = P004V2_A65ArtCod[0] ;
         A4058CCFColNom = P004V2_A4058CCFColNom[0] ;
         A4059CCFColNum = P004V2_A4059CCFColNum[0] ;
         A4043CCTLinDsc = P004V2_A4043CCTLinDsc[0] ;
         A11530CCSAuto = P004V2_A11530CCSAuto[0] ;
         A11532CCSVTol = P004V2_A11532CCSVTol[0] ;
         A11482CCSMin = P004V2_A11482CCSMin[0] ;
         n11482CCSMin = P004V2_n11482CCSMin[0] ;
         A11483CCSMax = P004V2_A11483CCSMax[0] ;
         n11483CCSMax = P004V2_n11483CCSMax[0] ;
         A11529CCVDsc = P004V2_A11529CCVDsc[0] ;
         n11529CCVDsc = P004V2_n11529CCVDsc[0] ;
         A11522CCVCod = P004V2_A11522CCVCod[0] ;
         A4043CCTLinDsc = P004V2_A4043CCTLinDsc[0] ;
         A11529CCVDsc = P004V2_A11529CCVDsc[0] ;
         n11529CCVDsc = P004V2_n11529CCVDsc[0] ;
         Gxm1controlcalidad_valoresestandars_ccsta_sdt = (app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item)new app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1controlcalidad_valoresestandars_ccsta_sdt, 0);
         Gxm1controlcalidad_valoresestandars_ccsta_sdt.setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlin( A4034CCTLin );
         Gxm1controlcalidad_valoresestandars_ccsta_sdt.setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Cctlindsc( A4043CCTLinDsc );
         Gxm1controlcalidad_valoresestandars_ccsta_sdt.setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsauto( A11530CCSAuto );
         Gxm1controlcalidad_valoresestandars_ccsta_sdt.setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsvtol( A11532CCSVTol );
         Gxm1controlcalidad_valoresestandars_ccsta_sdt.setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmin( A11482CCSMin );
         Gxm1controlcalidad_valoresestandars_ccsta_sdt.setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccsmax( A11483CCSMax );
         Gxm1controlcalidad_valoresestandars_ccsta_sdt.setgxTv_SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item_Ccvdsc( A11529CCVDsc );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP7[0] = controlcalidad_valoresestandars_ccsta_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item>(app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P004V2_A11522CCVCod = new String[] {""} ;
      P004V2_A396EmprCod = new String[] {""} ;
      P004V2_A252CliCod = new int[1] ;
      P004V2_A4031CCTCod = new int[1] ;
      P004V2_A4034CCTLin = new short[1] ;
      P004V2_A65ArtCod = new String[] {""} ;
      P004V2_A4058CCFColNom = new String[] {""} ;
      P004V2_A4059CCFColNum = new int[1] ;
      P004V2_A4043CCTLinDsc = new String[] {""} ;
      P004V2_A11530CCSAuto = new byte[1] ;
      P004V2_A11532CCSVTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004V2_A11482CCSMin = new String[] {""} ;
      P004V2_n11482CCSMin = new boolean[] {false} ;
      P004V2_A11483CCSMax = new String[] {""} ;
      P004V2_n11483CCSMax = new boolean[] {false} ;
      P004V2_A11529CCVDsc = new String[] {""} ;
      P004V2_n11529CCVDsc = new boolean[] {false} ;
      A11522CCVCod = "" ;
      A65ArtCod = "" ;
      A4058CCFColNom = "" ;
      A4043CCTLinDsc = "" ;
      A11532CCSVTol = DecimalUtil.ZERO ;
      A11482CCSMin = "" ;
      A11483CCSMax = "" ;
      A11529CCVDsc = "" ;
      Gxm1controlcalidad_valoresestandars_ccsta_sdt = new app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_valoresestandars_ccsta_dp__default(),
         new Object[] {
             new Object[] {
            P004V2_A11522CCVCod, P004V2_A396EmprCod, P004V2_A252CliCod, P004V2_A4031CCTCod, P004V2_A4034CCTLin, P004V2_A65ArtCod, P004V2_A4058CCFColNom, P004V2_A4059CCFColNum, P004V2_A4043CCTLinDsc, P004V2_A11530CCSAuto,
            P004V2_A11532CCSVTol, P004V2_A11482CCSMin, P004V2_n11482CCSMin, P004V2_A11483CCSMax, P004V2_n11483CCSMax, P004V2_A11529CCVDsc, P004V2_n11529CCVDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11530CCSAuto ;
   private short A4034CCTLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV7CCFColNum ;
   private int A4031CCTCod ;
   private int A4059CCFColNum ;
   private java.math.BigDecimal A11532CCSVTol ;
   private String A396EmprCod ;
   private String AV5CCArtCod ;
   private String AV6CCFColNom ;
   private String scmdbuf ;
   private String A11522CCVCod ;
   private String A65ArtCod ;
   private String A4058CCFColNom ;
   private String A4043CCTLinDsc ;
   private String A11482CCSMin ;
   private String A11483CCSMax ;
   private String A11529CCVDsc ;
   private boolean n11482CCSMin ;
   private boolean n11483CCSMax ;
   private boolean n11529CCVDsc ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item>[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P004V2_A11522CCVCod ;
   private String[] P004V2_A396EmprCod ;
   private int[] P004V2_A252CliCod ;
   private int[] P004V2_A4031CCTCod ;
   private short[] P004V2_A4034CCTLin ;
   private String[] P004V2_A65ArtCod ;
   private String[] P004V2_A4058CCFColNom ;
   private int[] P004V2_A4059CCFColNum ;
   private String[] P004V2_A4043CCTLinDsc ;
   private byte[] P004V2_A11530CCSAuto ;
   private java.math.BigDecimal[] P004V2_A11532CCSVTol ;
   private String[] P004V2_A11482CCSMin ;
   private boolean[] P004V2_n11482CCSMin ;
   private String[] P004V2_A11483CCSMax ;
   private boolean[] P004V2_n11483CCSMax ;
   private String[] P004V2_A11529CCVDsc ;
   private boolean[] P004V2_n11529CCVDsc ;
   private GXBaseCollection<app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item> Gxm2rootcol ;
   private app.controlcalidadhtd.SdtControlCalidad_ValoresEstandars_CCsta_SDT_Item Gxm1controlcalidad_valoresestandars_ccsta_sdt ;
}

final  class controlcalidad_valoresestandars_ccsta_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004V2", "SELECT T2.CCVCod, T1.EmprCod, T1.CliCod, T1.CCTCod, T1.CCTLin, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T2.CCTLinDsc, T1.CCSAuto, T1.CCSVTol, T1.CCSMin, T1.CCSMax, T3.CCVDsc FROM ((TXPCCSta T1 INNER JOIN TXPCCDef1 T2 ON T2.EmprCod = T1.EmprCod AND T2.CCTCod = T1.CCTCod AND T2.CCTLin = T1.CCTLin) LEFT JOIN TXPCCVar T3 ON T3.EmprCod = T1.EmprCod AND T3.CCVCod = T2.CCVCod) WHERE (T1.EmprCod = ? and T1.CliCod = ?) AND (T1.CCTCod = ?) AND (T1.CCTLin = ?) AND (T1.CCFColNum = ? or (T1.CCFColNum = 0)) AND (T1.CCFColNom = ? or (rtrim(T1.CCFColNom) IS NULL AND NOT(T1.CCFColNom IS NULL))) AND (T1.ArtCod = ? or (rtrim(T1.ArtCod) IS NULL AND NOT(T1.ArtCod IS NULL))) ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.CCFColNom, T1.CCFColNum, T1.CCTCod, T1.CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 13);
               stmt.setString(7, (String)parms[6], 16);
               return;
      }
   }

}

