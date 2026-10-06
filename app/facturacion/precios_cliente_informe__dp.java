package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precios_cliente_informe__dp extends GXProcedure
{
   public precios_cliente_informe__dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precios_cliente_informe__dp.class ), "" );
   }

   public precios_cliente_informe__dp( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.facturacion.SdtPrecios_cliente_Informe_SDT_Item> executeUdp( String aP0 ,
                                                                                            int aP1 ,
                                                                                            String aP2 ,
                                                                                            String aP3 ,
                                                                                            int aP4 ,
                                                                                            int aP5 )
   {
      precios_cliente_informe__dp.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.facturacion.SdtPrecios_cliente_Informe_SDT_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        int aP5 ,
                        GXBaseCollection<app.facturacion.SdtPrecios_cliente_Informe_SDT_Item>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             int aP5 ,
                             GXBaseCollection<app.facturacion.SdtPrecios_cliente_Informe_SDT_Item>[] aP6 )
   {
      precios_cliente_informe__dp.this.AV5Emprcod = aP0;
      precios_cliente_informe__dp.this.AV6Clicod = aP1;
      precios_cliente_informe__dp.this.AV8Fortonalfrom = aP2;
      precios_cliente_informe__dp.this.AV9Fortonalto = aP3;
      precios_cliente_informe__dp.this.AV7Forcolnumfrom = aP4;
      precios_cliente_informe__dp.this.AV10Forcolnumto = aP5;
      precios_cliente_informe__dp.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV9Fortonalto ,
                                           AV8Fortonalfrom ,
                                           Integer.valueOf(AV10Forcolnumto) ,
                                           Integer.valueOf(AV7Forcolnumfrom) ,
                                           A995ForTonal ,
                                           Integer.valueOf(A483ForColNum) ,
                                           A492ForPreKgm ,
                                           AV5Emprcod ,
                                           Integer.valueOf(AV6Clicod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      /* Using cursor P003S2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6Clicod), AV9Fortonalto, AV8Fortonalfrom, Integer.valueOf(AV10Forcolnumto), Integer.valueOf(AV7Forcolnumfrom)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4384ForTipArt = P003S2_A4384ForTipArt[0] ;
         n4384ForTipArt = P003S2_n4384ForTipArt[0] ;
         A396EmprCod = P003S2_A396EmprCod[0] ;
         A252CliCod = P003S2_A252CliCod[0] ;
         A483ForColNum = P003S2_A483ForColNum[0] ;
         A995ForTonal = P003S2_A995ForTonal[0] ;
         n995ForTonal = P003S2_n995ForTonal[0] ;
         A492ForPreKgm = P003S2_A492ForPreKgm[0] ;
         n492ForPreKgm = P003S2_n492ForPreKgm[0] ;
         A5742ForSerDsc = P003S2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P003S2_n5742ForSerDsc[0] ;
         A1191ForNomCli = P003S2_A1191ForNomCli[0] ;
         n1191ForNomCli = P003S2_n1191ForNomCli[0] ;
         A482ForColNom = P003S2_A482ForColNom[0] ;
         A13929ForTipArtD = P003S2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P003S2_n13929ForTipArtD[0] ;
         A494ForSer = P003S2_A494ForSer[0] ;
         A831TipColCod = P003S2_A831TipColCod[0] ;
         A13929ForTipArtD = P003S2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P003S2_n13929ForTipArtD[0] ;
         Gxm1precios_cliente_informe_sdt = (app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)new app.facturacion.SdtPrecios_cliente_Informe_SDT_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1precios_cliente_informe_sdt, 0);
         Gxm1precios_cliente_informe_sdt.setgxTv_SdtPrecios_cliente_Informe_SDT_Item_Fortonal( A995ForTonal );
         Gxm1precios_cliente_informe_sdt.setgxTv_SdtPrecios_cliente_Informe_SDT_Item_Artdsc( A5742ForSerDsc );
         Gxm1precios_cliente_informe_sdt.setgxTv_SdtPrecios_cliente_Informe_SDT_Item_Tipartdsc( A13929ForTipArtD );
         Gxm1precios_cliente_informe_sdt.setgxTv_SdtPrecios_cliente_Informe_SDT_Item_Fornomcli( A1191ForNomCli );
         Gxm1precios_cliente_informe_sdt.setgxTv_SdtPrecios_cliente_Informe_SDT_Item_Forcolnom( A482ForColNom );
         Gxm1precios_cliente_informe_sdt.setgxTv_SdtPrecios_cliente_Informe_SDT_Item_Forcolnum( A483ForColNum );
         Gxm1precios_cliente_informe_sdt.setgxTv_SdtPrecios_cliente_Informe_SDT_Item_Forprekgm( A492ForPreKgm );
         Gxm1precios_cliente_informe_sdt.setgxTv_SdtPrecios_cliente_Informe_SDT_Item_Obs( " " );
         Gxm1precios_cliente_informe_sdt.setgxTv_SdtPrecios_cliente_Informe_SDT_Item_Seleccionar( false );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = precios_cliente_informe__dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.facturacion.SdtPrecios_cliente_Informe_SDT_Item>(app.facturacion.SdtPrecios_cliente_Informe_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A995ForTonal = "" ;
      A492ForPreKgm = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P003S2_A829TipArtCod = new short[1] ;
      P003S2_A4384ForTipArt = new short[1] ;
      P003S2_n4384ForTipArt = new boolean[] {false} ;
      P003S2_A396EmprCod = new String[] {""} ;
      P003S2_A252CliCod = new int[1] ;
      P003S2_A483ForColNum = new int[1] ;
      P003S2_A995ForTonal = new String[] {""} ;
      P003S2_n995ForTonal = new boolean[] {false} ;
      P003S2_A492ForPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003S2_n492ForPreKgm = new boolean[] {false} ;
      P003S2_A5742ForSerDsc = new String[] {""} ;
      P003S2_n5742ForSerDsc = new boolean[] {false} ;
      P003S2_A1191ForNomCli = new String[] {""} ;
      P003S2_n1191ForNomCli = new boolean[] {false} ;
      P003S2_A482ForColNom = new String[] {""} ;
      P003S2_A13929ForTipArtD = new String[] {""} ;
      P003S2_n13929ForTipArtD = new boolean[] {false} ;
      P003S2_A494ForSer = new String[] {""} ;
      P003S2_A831TipColCod = new byte[1] ;
      A5742ForSerDsc = "" ;
      A1191ForNomCli = "" ;
      A482ForColNom = "" ;
      A13929ForTipArtD = "" ;
      A494ForSer = "" ;
      Gxm1precios_cliente_informe_sdt = new app.facturacion.SdtPrecios_cliente_Informe_SDT_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.precios_cliente_informe__dp__default(),
         new Object[] {
             new Object[] {
            P003S2_A829TipArtCod, P003S2_A4384ForTipArt, P003S2_n4384ForTipArt, P003S2_A396EmprCod, P003S2_A252CliCod, P003S2_A483ForColNum, P003S2_A995ForTonal, P003S2_n995ForTonal, P003S2_A492ForPreKgm, P003S2_n492ForPreKgm,
            P003S2_A5742ForSerDsc, P003S2_n5742ForSerDsc, P003S2_A1191ForNomCli, P003S2_n1191ForNomCli, P003S2_A482ForColNom, P003S2_A13929ForTipArtD, P003S2_n13929ForTipArtD, P003S2_A494ForSer, P003S2_A831TipColCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short A4384ForTipArt ;
   private short Gx_err ;
   private int AV6Clicod ;
   private int AV7Forcolnumfrom ;
   private int AV10Forcolnumto ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private java.math.BigDecimal A492ForPreKgm ;
   private String AV5Emprcod ;
   private String AV8Fortonalfrom ;
   private String AV9Fortonalto ;
   private String scmdbuf ;
   private String A995ForTonal ;
   private String A396EmprCod ;
   private String A5742ForSerDsc ;
   private String A1191ForNomCli ;
   private String A482ForColNom ;
   private String A13929ForTipArtD ;
   private String A494ForSer ;
   private boolean n4384ForTipArt ;
   private boolean n995ForTonal ;
   private boolean n492ForPreKgm ;
   private boolean n5742ForSerDsc ;
   private boolean n1191ForNomCli ;
   private boolean n13929ForTipArtD ;
   private GXBaseCollection<app.facturacion.SdtPrecios_cliente_Informe_SDT_Item>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private short[] P003S2_A829TipArtCod ;
   private short[] P003S2_A4384ForTipArt ;
   private boolean[] P003S2_n4384ForTipArt ;
   private String[] P003S2_A396EmprCod ;
   private int[] P003S2_A252CliCod ;
   private int[] P003S2_A483ForColNum ;
   private String[] P003S2_A995ForTonal ;
   private boolean[] P003S2_n995ForTonal ;
   private java.math.BigDecimal[] P003S2_A492ForPreKgm ;
   private boolean[] P003S2_n492ForPreKgm ;
   private String[] P003S2_A5742ForSerDsc ;
   private boolean[] P003S2_n5742ForSerDsc ;
   private String[] P003S2_A1191ForNomCli ;
   private boolean[] P003S2_n1191ForNomCli ;
   private String[] P003S2_A482ForColNom ;
   private String[] P003S2_A13929ForTipArtD ;
   private boolean[] P003S2_n13929ForTipArtD ;
   private String[] P003S2_A494ForSer ;
   private byte[] P003S2_A831TipColCod ;
   private GXBaseCollection<app.facturacion.SdtPrecios_cliente_Informe_SDT_Item> Gxm2rootcol ;
   private app.facturacion.SdtPrecios_cliente_Informe_SDT_Item Gxm1precios_cliente_informe_sdt ;
}

final  class precios_cliente_informe__dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003S2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV9Fortonalto ,
                                          String AV8Fortonalfrom ,
                                          int AV10Forcolnumto ,
                                          int AV7Forcolnumfrom ,
                                          String A995ForTonal ,
                                          int A483ForColNum ,
                                          java.math.BigDecimal A492ForPreKgm ,
                                          String AV5Emprcod ,
                                          int AV6Clicod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[6];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT T2.TipArtCod, T1.ForTipArt, T1.EmprCod, T1.CliCod, T1.ForColNum, T1.ForTonal, T1.ForPreKgm, T1.ForSerDsc, T1.ForNomCli, T1.ForColNom, COALESCE( T2.TipArtDsc," ;
      scmdbuf += " ' ') AS ForTipArtD, T1.ForSer, T1.TipColCod FROM (TXPCFORMU T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.ForTipArt)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.ForPreKgm > 0)");
      if ( ! (GXutil.strcmp("", AV9Fortonalto)==0) )
      {
         addWhere(sWhereString, "(T1.ForTonal <= ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8Fortonalfrom)==0) )
      {
         addWhere(sWhereString, "(T1.ForTonal >= ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! (0==AV10Forcolnumto) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV7Forcolnumfrom) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P003S2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003S2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 13);
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((byte[]) buf[18])[0] = rslt.getByte(13);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
      }
   }

}

