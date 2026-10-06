package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadoprecios_dp extends GXProcedure
{
   public listadoprecios_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadoprecios_dp.class ), "" );
   }

   public listadoprecios_dp( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.facturacion.SdtListadoPrecios_SDT_ListadoPrecios_SDTItem> executeUdp( String aP0 ,
                                                                                                     int aP1 ,
                                                                                                     int aP2 ,
                                                                                                     String aP3 ,
                                                                                                     String aP4 )
   {
      listadoprecios_dp.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.facturacion.SdtListadoPrecios_SDT_ListadoPrecios_SDTItem>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String aP4 ,
                        GXBaseCollection<app.facturacion.SdtListadoPrecios_SDT_ListadoPrecios_SDTItem>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 ,
                             GXBaseCollection<app.facturacion.SdtListadoPrecios_SDT_ListadoPrecios_SDTItem>[] aP5 )
   {
      listadoprecios_dp.this.AV5emprcod = aP0;
      listadoprecios_dp.this.AV6Clicodfrom = aP1;
      listadoprecios_dp.this.AV7Clicodto = aP2;
      listadoprecios_dp.this.AV8Artcodfrom = aP3;
      listadoprecios_dp.this.AV9Artcodto = aP4;
      listadoprecios_dp.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P004R2 */
      pr_default.execute(0, new Object[] {AV5emprcod, Integer.valueOf(AV6Clicodfrom), AV8Artcodfrom, AV9Artcodto, Integer.valueOf(AV7Clicodto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P004R2_A396EmprCod[0] ;
         A252CliCod = P004R2_A252CliCod[0] ;
         A65ArtCod = P004R2_A65ArtCod[0] ;
         A14295ArtActivo = P004R2_A14295ArtActivo[0] ;
         A587IntPreMtr = P004R2_A587IntPreMtr[0] ;
         n587IntPreMtr = P004R2_n587IntPreMtr[0] ;
         A586IntPreKgm = P004R2_A586IntPreKgm[0] ;
         n586IntPreKgm = P004R2_n586IntPreKgm[0] ;
         A279CliNom = P004R2_A279CliNom[0] ;
         A69ArtDsc = P004R2_A69ArtDsc[0] ;
         n69ArtDsc = P004R2_n69ArtDsc[0] ;
         A92ArtPreKgm = P004R2_A92ArtPreKgm[0] ;
         n92ArtPreKgm = P004R2_n92ArtPreKgm[0] ;
         A93ArtPreMtr = P004R2_A93ArtPreMtr[0] ;
         n93ArtPreMtr = P004R2_n93ArtPreMtr[0] ;
         A832TipColDsc = P004R2_A832TipColDsc[0] ;
         n832TipColDsc = P004R2_n832TipColDsc[0] ;
         A584IntDsc = P004R2_A584IntDsc[0] ;
         n584IntDsc = P004R2_n584IntDsc[0] ;
         A583IntCod = P004R2_A583IntCod[0] ;
         A831TipColCod = P004R2_A831TipColCod[0] ;
         A279CliNom = P004R2_A279CliNom[0] ;
         A14295ArtActivo = P004R2_A14295ArtActivo[0] ;
         A69ArtDsc = P004R2_A69ArtDsc[0] ;
         n69ArtDsc = P004R2_n69ArtDsc[0] ;
         A92ArtPreKgm = P004R2_A92ArtPreKgm[0] ;
         n92ArtPreKgm = P004R2_n92ArtPreKgm[0] ;
         A93ArtPreMtr = P004R2_A93ArtPreMtr[0] ;
         n93ArtPreMtr = P004R2_n93ArtPreMtr[0] ;
         A584IntDsc = P004R2_A584IntDsc[0] ;
         n584IntDsc = P004R2_n584IntDsc[0] ;
         A832TipColDsc = P004R2_A832TipColDsc[0] ;
         n832TipColDsc = P004R2_n832TipColDsc[0] ;
         Gxm1listadoprecios_sdt = (app.facturacion.SdtListadoPrecios_SDT_ListadoPrecios_SDTItem)new app.facturacion.SdtListadoPrecios_SDT_ListadoPrecios_SDTItem(remoteHandle, context);
         Gxm2rootcol.add(Gxm1listadoprecios_sdt, 0);
         Gxm1listadoprecios_sdt.setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clicod( A252CliCod );
         Gxm1listadoprecios_sdt.setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Clinom( A279CliNom );
         Gxm1listadoprecios_sdt.setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artcod( A65ArtCod );
         Gxm1listadoprecios_sdt.setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artdsc( A69ArtDsc );
         Gxm1listadoprecios_sdt.setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artprekgm( A92ArtPreKgm );
         Gxm1listadoprecios_sdt.setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Artpremtr( A93ArtPreMtr );
         Gxm1listadoprecios_sdt.setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcolcod( A831TipColCod );
         Gxm1listadoprecios_sdt.setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Tipcoldsc( A832TipColDsc );
         Gxm1listadoprecios_sdt.setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intcod( A583IntCod );
         Gxm1listadoprecios_sdt.setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intdsc( A584IntDsc );
         Gxm1listadoprecios_sdt.setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intprekgm( A586IntPreKgm );
         Gxm1listadoprecios_sdt.setgxTv_SdtListadoPrecios_SDT_ListadoPrecios_SDTItem_Intpremtr( A587IntPreMtr );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = listadoprecios_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.facturacion.SdtListadoPrecios_SDT_ListadoPrecios_SDTItem>(app.facturacion.SdtListadoPrecios_SDT_ListadoPrecios_SDTItem.class, "ListadoPrecios_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P004R2_A396EmprCod = new String[] {""} ;
      P004R2_A252CliCod = new int[1] ;
      P004R2_A65ArtCod = new String[] {""} ;
      P004R2_A14295ArtActivo = new String[] {""} ;
      P004R2_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004R2_n587IntPreMtr = new boolean[] {false} ;
      P004R2_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004R2_n586IntPreKgm = new boolean[] {false} ;
      P004R2_A279CliNom = new String[] {""} ;
      P004R2_A69ArtDsc = new String[] {""} ;
      P004R2_n69ArtDsc = new boolean[] {false} ;
      P004R2_A92ArtPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004R2_n92ArtPreKgm = new boolean[] {false} ;
      P004R2_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004R2_n93ArtPreMtr = new boolean[] {false} ;
      P004R2_A832TipColDsc = new String[] {""} ;
      P004R2_n832TipColDsc = new boolean[] {false} ;
      P004R2_A584IntDsc = new String[] {""} ;
      P004R2_n584IntDsc = new boolean[] {false} ;
      P004R2_A583IntCod = new byte[1] ;
      P004R2_A831TipColCod = new byte[1] ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A14295ArtActivo = "" ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A69ArtDsc = "" ;
      A92ArtPreKgm = DecimalUtil.ZERO ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      A832TipColDsc = "" ;
      A584IntDsc = "" ;
      Gxm1listadoprecios_sdt = new app.facturacion.SdtListadoPrecios_SDT_ListadoPrecios_SDTItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.listadoprecios_dp__default(),
         new Object[] {
             new Object[] {
            P004R2_A396EmprCod, P004R2_A252CliCod, P004R2_A65ArtCod, P004R2_A14295ArtActivo, P004R2_A587IntPreMtr, P004R2_n587IntPreMtr, P004R2_A586IntPreKgm, P004R2_n586IntPreKgm, P004R2_A279CliNom, P004R2_A69ArtDsc,
            P004R2_n69ArtDsc, P004R2_A92ArtPreKgm, P004R2_n92ArtPreKgm, P004R2_A93ArtPreMtr, P004R2_n93ArtPreMtr, P004R2_A832TipColDsc, P004R2_n832TipColDsc, P004R2_A584IntDsc, P004R2_n584IntDsc, P004R2_A583IntCod,
            P004R2_A831TipColCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A583IntCod ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV6Clicodfrom ;
   private int AV7Clicodto ;
   private int A252CliCod ;
   private java.math.BigDecimal A587IntPreMtr ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal A92ArtPreKgm ;
   private java.math.BigDecimal A93ArtPreMtr ;
   private String AV5emprcod ;
   private String AV8Artcodfrom ;
   private String AV9Artcodto ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A14295ArtActivo ;
   private String A279CliNom ;
   private String A69ArtDsc ;
   private String A832TipColDsc ;
   private String A584IntDsc ;
   private boolean n587IntPreMtr ;
   private boolean n586IntPreKgm ;
   private boolean n69ArtDsc ;
   private boolean n92ArtPreKgm ;
   private boolean n93ArtPreMtr ;
   private boolean n832TipColDsc ;
   private boolean n584IntDsc ;
   private GXBaseCollection<app.facturacion.SdtListadoPrecios_SDT_ListadoPrecios_SDTItem>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P004R2_A396EmprCod ;
   private int[] P004R2_A252CliCod ;
   private String[] P004R2_A65ArtCod ;
   private String[] P004R2_A14295ArtActivo ;
   private java.math.BigDecimal[] P004R2_A587IntPreMtr ;
   private boolean[] P004R2_n587IntPreMtr ;
   private java.math.BigDecimal[] P004R2_A586IntPreKgm ;
   private boolean[] P004R2_n586IntPreKgm ;
   private String[] P004R2_A279CliNom ;
   private String[] P004R2_A69ArtDsc ;
   private boolean[] P004R2_n69ArtDsc ;
   private java.math.BigDecimal[] P004R2_A92ArtPreKgm ;
   private boolean[] P004R2_n92ArtPreKgm ;
   private java.math.BigDecimal[] P004R2_A93ArtPreMtr ;
   private boolean[] P004R2_n93ArtPreMtr ;
   private String[] P004R2_A832TipColDsc ;
   private boolean[] P004R2_n832TipColDsc ;
   private String[] P004R2_A584IntDsc ;
   private boolean[] P004R2_n584IntDsc ;
   private byte[] P004R2_A583IntCod ;
   private byte[] P004R2_A831TipColCod ;
   private GXBaseCollection<app.facturacion.SdtListadoPrecios_SDT_ListadoPrecios_SDTItem> Gxm2rootcol ;
   private app.facturacion.SdtListadoPrecios_SDT_ListadoPrecios_SDTItem Gxm1listadoprecios_sdt ;
}

final  class listadoprecios_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004R2", "SELECT T1.EmprCod, T1.CliCod, T1.ArtCod, T3.ArtActivo, T1.IntPreMtr, T1.IntPreKgm, T2.CliNom, T3.ArtDsc, T3.ArtPreKgm, T3.ArtPreMtr, T5.TipColDsc, T4.IntDsc, T1.IntCod, T1.TipColCod FROM ((((TXPPRETIN T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPARTICU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ArtCod = T1.ArtCod) INNER JOIN TXPINTENS T4 ON T4.EmprCod = T1.EmprCod AND T4.IntCod = T1.IntCod) INNER JOIN TXPTIPCOL T5 ON T5.EmprCod = T1.EmprCod AND T5.TipColCod = T1.TipColCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ? and T1.ArtCod >= ?) AND (T1.IntPreKgm > 0 or T1.IntPreMtr > 0) AND (T1.ArtCod <= ?) AND (T3.ArtActivo = 'S') AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.TipColCod, T1.IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(13);
               ((byte[]) buf[20])[0] = rslt.getByte(14);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

