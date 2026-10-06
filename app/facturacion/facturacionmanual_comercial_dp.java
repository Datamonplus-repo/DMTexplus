package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class facturacionmanual_comercial_dp extends GXProcedure
{
   public facturacionmanual_comercial_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( facturacionmanual_comercial_dp.class ), "" );
   }

   public facturacionmanual_comercial_dp( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem> executeUdp( String aP0 ,
                                                                                                                                     int aP1 ,
                                                                                                                                     String aP2 )
   {
      facturacionmanual_comercial_dp.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        GXBaseCollection<app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             GXBaseCollection<app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem>[] aP3 )
   {
      facturacionmanual_comercial_dp.this.AV5Emprcod = aP0;
      facturacionmanual_comercial_dp.this.AV6Clicod = aP1;
      facturacionmanual_comercial_dp.this.AV7Prior = aP2;
      facturacionmanual_comercial_dp.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00373 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6Clicod), AV7Prior});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P00373_A252CliCod[0] ;
         A1783AlbComEso = P00373_A1783AlbComEso[0] ;
         A22AlbComPri = P00373_A22AlbComPri[0] ;
         A10738AlbComSt = P00373_A10738AlbComSt[0] ;
         A17AlbComFch = P00373_A17AlbComFch[0] ;
         A18AlbComImp = P00373_A18AlbComImp[0] ;
         n18AlbComImp = P00373_n18AlbComImp[0] ;
         A14AlbComCod = P00373_A14AlbComCod[0] ;
         A396EmprCod = P00373_A396EmprCod[0] ;
         A18AlbComImp = P00373_A18AlbComImp[0] ;
         n18AlbComImp = P00373_n18AlbComImp[0] ;
         GXt_int1 = A14254AlbLineasL ;
         GXv_int2[0] = GXt_int1 ;
         new app.haydatoslalcom(remoteHandle, context).execute( A396EmprCod, A14AlbComCod, GXv_int2) ;
         facturacionmanual_comercial_dp.this.GXt_int1 = GXv_int2[0] ;
         A14254AlbLineasL = (byte)(GXt_int1) ;
         if ( A14254AlbLineasL > 0 )
         {
            Gxm1facturacionmanual_comerciales__sdt = (app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem)new app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem(remoteHandle, context);
            Gxm2rootcol.add(Gxm1facturacionmanual_comerciales__sdt, 0);
            Gxm1facturacionmanual_comerciales__sdt.setgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Seleccionar( false );
            Gxm1facturacionmanual_comerciales__sdt.setgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomcod( A14AlbComCod );
            Gxm1facturacionmanual_comerciales__sdt.setgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch( A17AlbComFch );
            Gxm1facturacionmanual_comerciales__sdt.setgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp( A18AlbComImp );
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = facturacionmanual_comercial_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem>(app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem.class, "FacturacionManual_Comerciales__SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00373_A252CliCod = new int[1] ;
      P00373_A1783AlbComEso = new byte[1] ;
      P00373_A22AlbComPri = new String[] {""} ;
      P00373_A10738AlbComSt = new String[] {""} ;
      P00373_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P00373_A18AlbComImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00373_n18AlbComImp = new boolean[] {false} ;
      P00373_A14AlbComCod = new int[1] ;
      P00373_A396EmprCod = new String[] {""} ;
      A22AlbComPri = "" ;
      A10738AlbComSt = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A18AlbComImp = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      GXv_int2 = new short[1] ;
      Gxm1facturacionmanual_comerciales__sdt = new app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.facturacionmanual_comercial_dp__default(),
         new Object[] {
             new Object[] {
            P00373_A252CliCod, P00373_A1783AlbComEso, P00373_A22AlbComPri, P00373_A10738AlbComSt, P00373_A17AlbComFch, P00373_A18AlbComImp, P00373_n18AlbComImp, P00373_A14AlbComCod, P00373_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1783AlbComEso ;
   private byte A14254AlbLineasL ;
   private short GXt_int1 ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int AV6Clicod ;
   private int A252CliCod ;
   private int A14AlbComCod ;
   private java.math.BigDecimal A18AlbComImp ;
   private String AV5Emprcod ;
   private String AV7Prior ;
   private String scmdbuf ;
   private String A22AlbComPri ;
   private String A10738AlbComSt ;
   private String A396EmprCod ;
   private java.util.Date A17AlbComFch ;
   private boolean n18AlbComImp ;
   private GXBaseCollection<app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P00373_A252CliCod ;
   private byte[] P00373_A1783AlbComEso ;
   private String[] P00373_A22AlbComPri ;
   private String[] P00373_A10738AlbComSt ;
   private java.util.Date[] P00373_A17AlbComFch ;
   private java.math.BigDecimal[] P00373_A18AlbComImp ;
   private boolean[] P00373_n18AlbComImp ;
   private int[] P00373_A14AlbComCod ;
   private String[] P00373_A396EmprCod ;
   private GXBaseCollection<app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem> Gxm2rootcol ;
   private app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem Gxm1facturacionmanual_comerciales__sdt ;
}

final  class facturacionmanual_comercial_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00373", "SELECT T1.CliCod, T1.AlbComEso, T1.AlbComPri, T1.AlbComSt, T1.AlbComFch, COALESCE( T2.AlbComImp, 0) AS AlbComImp, T1.AlbComCod, T1.EmprCod FROM (TXPCALCOM T1 LEFT JOIN (SELECT SUM(ROUND(( AlbComPre * CAST(AlbComCnt AS NUMERIC(23,10))), 2)) AS AlbComImp, EmprCod, AlbComCod FROM TXPLALCOM GROUP BY EmprCod, AlbComCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbComCod = T1.AlbComCod) WHERE (T1.EmprCod = ? and T1.CliCod = ?) AND (T1.AlbComSt <> 'A') AND (T1.AlbComPri = ?) AND (T1.AlbComEso = 1) ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

