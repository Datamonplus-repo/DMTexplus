package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class facturacionmanual_producciones__dp extends GXProcedure
{
   public facturacionmanual_producciones__dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( facturacionmanual_producciones__dp.class ), "" );
   }

   public facturacionmanual_producciones__dp( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem> executeUdp( String aP0 ,
                                                                                                                                       int aP1 ,
                                                                                                                                       String aP2 )
   {
      facturacionmanual_producciones__dp.this.aP3 = new GXBaseCollection[] {new GXBaseCollection<app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem>()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        GXBaseCollection<app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem>[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             GXBaseCollection<app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem>[] aP3 )
   {
      facturacionmanual_producciones__dp.this.AV5Emprcod = aP0;
      facturacionmanual_producciones__dp.this.AV6Clicod = aP1;
      facturacionmanual_producciones__dp.this.AV8Prior = aP2;
      facturacionmanual_producciones__dp.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00363 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV8Prior, Integer.valueOf(AV6Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1243GuiRemCli = P00363_A1243GuiRemCli[0] ;
         A1782AlbProEso = P00363_A1782AlbProEso[0] ;
         A39AlbProPri = P00363_A39AlbProPri[0] ;
         A5140AlbMarca = P00363_A5140AlbMarca[0] ;
         A34AlbProfch = P00363_A34AlbProfch[0] ;
         A33AlbProEst = P00363_A33AlbProEst[0] ;
         A38AlbProPie = P00363_A38AlbProPie[0] ;
         A35AlbProKgs = P00363_A35AlbProKgs[0] ;
         A37AlbProMet = P00363_A37AlbProMet[0] ;
         A30AlbProCod = P00363_A30AlbProCod[0] ;
         A396EmprCod = P00363_A396EmprCod[0] ;
         A38AlbProPie = P00363_A38AlbProPie[0] ;
         A35AlbProKgs = P00363_A35AlbProKgs[0] ;
         A37AlbProMet = P00363_A37AlbProMet[0] ;
         GXt_decimal1 = A14253AlbImporte ;
         GXv_decimal2[0] = GXt_decimal1 ;
         new app.importedocumento(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_decimal2) ;
         facturacionmanual_producciones__dp.this.GXt_decimal1 = GXv_decimal2[0] ;
         A14253AlbImporte = GXt_decimal1 ;
         GXt_int3 = A14251AlbFactura ;
         GXv_int4[0] = GXt_int3 ;
         new app.facturacion.documentofacturable(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int4) ;
         facturacionmanual_producciones__dp.this.GXt_int3 = GXv_int4[0] ;
         A14251AlbFactura = (byte)(GXt_int3) ;
         if ( A14251AlbFactura == 1 )
         {
            GXt_int3 = A14252AlbLineasA ;
            GXv_int4[0] = GXt_int3 ;
            new app.documentotransporteproduccion.haydatosalbbar(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int4) ;
            facturacionmanual_producciones__dp.this.GXt_int3 = GXv_int4[0] ;
            A14252AlbLineasA = GXt_int3 ;
            if ( A14252AlbLineasA > 0 )
            {
               Gxm1facturacionmanual_producciones__sdt = (app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)new app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem(remoteHandle, context);
               Gxm2rootcol.add(Gxm1facturacionmanual_producciones__sdt, 0);
               Gxm1facturacionmanual_producciones__sdt.setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar( false );
               Gxm1facturacionmanual_producciones__sdt.setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod( A30AlbProCod );
               Gxm1facturacionmanual_producciones__sdt.setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch( A34AlbProfch );
               Gxm1facturacionmanual_producciones__sdt.setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest( A33AlbProEst );
               Gxm1facturacionmanual_producciones__sdt.setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie( A38AlbProPie );
               Gxm1facturacionmanual_producciones__sdt.setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs( A35AlbProKgs );
               Gxm1facturacionmanual_producciones__sdt.setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet( A37AlbProMet );
               Gxm1facturacionmanual_producciones__sdt.setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte( A14253AlbImporte );
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = facturacionmanual_producciones__dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem>(app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem.class, "FacturacionManual_Producciones__SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P00363_A1243GuiRemCli = new int[1] ;
      P00363_A1782AlbProEso = new byte[1] ;
      P00363_A39AlbProPri = new String[] {""} ;
      P00363_A5140AlbMarca = new String[] {""} ;
      P00363_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P00363_A33AlbProEst = new byte[1] ;
      P00363_A38AlbProPie = new short[1] ;
      P00363_A35AlbProKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00363_A37AlbProMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00363_A30AlbProCod = new long[1] ;
      P00363_A396EmprCod = new String[] {""} ;
      A39AlbProPri = "" ;
      A5140AlbMarca = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A35AlbProKgs = DecimalUtil.ZERO ;
      A37AlbProMet = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A14253AlbImporte = DecimalUtil.ZERO ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_decimal2 = new java.math.BigDecimal[1] ;
      GXv_int4 = new short[1] ;
      Gxm1facturacionmanual_producciones__sdt = new app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.facturacionmanual_producciones__dp__default(),
         new Object[] {
             new Object[] {
            P00363_A1243GuiRemCli, P00363_A1782AlbProEso, P00363_A39AlbProPri, P00363_A5140AlbMarca, P00363_A34AlbProfch, P00363_A33AlbProEst, P00363_A38AlbProPie, P00363_A35AlbProKgs, P00363_A37AlbProMet, P00363_A30AlbProCod,
            P00363_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1782AlbProEso ;
   private byte A33AlbProEst ;
   private byte A14251AlbFactura ;
   private short A38AlbProPie ;
   private short A14252AlbLineasA ;
   private short GXt_int3 ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int AV6Clicod ;
   private int A1243GuiRemCli ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A35AlbProKgs ;
   private java.math.BigDecimal A37AlbProMet ;
   private java.math.BigDecimal A14253AlbImporte ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal2[] ;
   private String AV5Emprcod ;
   private String AV8Prior ;
   private String scmdbuf ;
   private String A39AlbProPri ;
   private String A5140AlbMarca ;
   private String A396EmprCod ;
   private java.util.Date A34AlbProfch ;
   private GXBaseCollection<app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem>[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P00363_A1243GuiRemCli ;
   private byte[] P00363_A1782AlbProEso ;
   private String[] P00363_A39AlbProPri ;
   private String[] P00363_A5140AlbMarca ;
   private java.util.Date[] P00363_A34AlbProfch ;
   private byte[] P00363_A33AlbProEst ;
   private short[] P00363_A38AlbProPie ;
   private java.math.BigDecimal[] P00363_A35AlbProKgs ;
   private java.math.BigDecimal[] P00363_A37AlbProMet ;
   private long[] P00363_A30AlbProCod ;
   private String[] P00363_A396EmprCod ;
   private GXBaseCollection<app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem> Gxm2rootcol ;
   private app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem Gxm1facturacionmanual_producciones__sdt ;
}

final  class facturacionmanual_producciones__dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00363", "SELECT T1.GuiRemCli, T1.AlbProEso, T1.AlbProPri, T1.AlbMarca, T1.AlbProfch, T1.AlbProEst, COALESCE( T2.AlbProPie, 0) AS AlbProPie, COALESCE( T2.AlbProKgs, 0) AS AlbProKgs, COALESCE( T2.AlbProMet, 0) AS AlbProMet, T1.AlbProCod, T1.EmprCod FROM (TXPCALPRD T1 LEFT JOIN (SELECT SUM(BarAlbPie) AS AlbProPie, EmprCod, AlbProCod, SUM(BarAlbKgmE) AS AlbProKgs, SUM(BarAlbMtrE) AS AlbProMet FROM TXPALBBAR GROUP BY EmprCod, AlbProCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE (T1.EmprCod = ? and T1.AlbProEso = 1) AND (T1.AlbMarca <> 'A') AND (T1.AlbProPri = ?) AND (T1.GuiRemCli = ?) ORDER BY T1.EmprCod, T1.AlbProEso ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((long[]) buf[9])[0] = rslt.getLong(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
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
               stmt.setString(2, (String)parms[1], 1);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

