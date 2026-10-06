package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpinformeproduccionresumentipoarticulo extends GXProcedure
{
   public dpinformeproduccionresumentipoarticulo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpinformeproduccionresumentipoarticulo.class ), "" );
   }

   public dpinformeproduccionresumentipoarticulo( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.produccion.SdtSDTInformeProduccionResumenTipoArticulo executeUdp( String aP0 ,
                                                                                byte aP1 ,
                                                                                String aP2 ,
                                                                                String aP3 ,
                                                                                java.util.Date aP4 ,
                                                                                java.util.Date aP5 ,
                                                                                short aP6 ,
                                                                                short aP7 )
   {
      dpinformeproduccionresumentipoarticulo.this.aP8 = new app.produccion.SdtSDTInformeProduccionResumenTipoArticulo[] {new app.produccion.SdtSDTInformeProduccionResumenTipoArticulo()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        String aP2 ,
                        String aP3 ,
                        java.util.Date aP4 ,
                        java.util.Date aP5 ,
                        short aP6 ,
                        short aP7 ,
                        app.produccion.SdtSDTInformeProduccionResumenTipoArticulo[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             String aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             short aP6 ,
                             short aP7 ,
                             app.produccion.SdtSDTInformeProduccionResumenTipoArticulo[] aP8 )
   {
      dpinformeproduccionresumentipoarticulo.this.AV10Emprcod = aP0;
      dpinformeproduccionresumentipoarticulo.this.AV5HisEstReo = aP1;
      dpinformeproduccionresumentipoarticulo.this.AV9MaqCod_From = aP2;
      dpinformeproduccionresumentipoarticulo.this.AV8MaqCod_To = aP3;
      dpinformeproduccionresumentipoarticulo.this.AV6DateTime_From = aP4;
      dpinformeproduccionresumentipoarticulo.this.AV7DateTime_To = aP5;
      dpinformeproduccionresumentipoarticulo.this.AV15OperarioFrom = aP6;
      dpinformeproduccionresumentipoarticulo.this.AV16OperarioTo = aP7;
      dpinformeproduccionresumentipoarticulo.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV5HisEstReo) ,
                                           AV8MaqCod_To ,
                                           AV9MaqCod_From ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           A602MaqCod ,
                                           A4441HisProDTF ,
                                           AV7DateTime_To ,
                                           AV6DateTime_From ,
                                           Short.valueOf(A656ParCod) ,
                                           AV10Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P003C2 */
      pr_default.execute(0, new Object[] {AV10Emprcod, AV7DateTime_To, AV6DateTime_From, Byte.valueOf(AV5HisEstReo), AV8MaqCod_To, AV9MaqCod_From});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk3C2 = false ;
         A656ParCod = P003C2_A656ParCod[0] ;
         n656ParCod = P003C2_n656ParCod[0] ;
         A396EmprCod = P003C2_A396EmprCod[0] ;
         A2247HisProTip = P003C2_A2247HisProTip[0] ;
         A1525HisProKgr = P003C2_A1525HisProKgr[0] ;
         A1526HisProMtr = P003C2_A1526HisProMtr[0] ;
         A602MaqCod = P003C2_A602MaqCod[0] ;
         A4441HisProDTF = P003C2_A4441HisProDTF[0] ;
         n4441HisProDTF = P003C2_n4441HisProDTF[0] ;
         A3612HisProReo = P003C2_A3612HisProReo[0] ;
         A558HisProFec = P003C2_A558HisProFec[0] ;
         A561HisProLin = P003C2_A561HisProLin[0] ;
         Gxm1sdtinformeproduccionresumentipoarticulo_articulo = (app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem)new app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem(remoteHandle, context);
         Gxm2sdtinformeproduccionresumentipoarticulo.getgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Articulo().add(Gxm1sdtinformeproduccionresumentipoarticulo_articulo, 0);
         Gxm1sdtinformeproduccionresumentipoarticulo_articulo.setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Emprcod( A396EmprCod );
         Gxm1sdtinformeproduccionresumentipoarticulo_articulo.setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Maqcod( A602MaqCod );
         Gxm1sdtinformeproduccionresumentipoarticulo_articulo.setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprodtf( A4441HisProDTF );
         Gxm1sdtinformeproduccionresumentipoarticulo_articulo.setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Parcod( A656ParCod );
         Gxm1sdtinformeproduccionresumentipoarticulo_articulo.setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisproreo( A3612HisProReo );
         AV11HisProKgr = DecimalUtil.ZERO ;
         AV12HisProMtr = DecimalUtil.ZERO ;
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A2247HisProTip, GXv_char2) ;
         dpinformeproduccionresumentipoarticulo.this.GXt_char1 = GXv_char2[0] ;
         Gxm1sdtinformeproduccionresumentipoarticulo_articulo.setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Tipartdsc( GXt_char1 );
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P003C2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P003C2_A2247HisProTip[0] == A2247HisProTip ) )
         {
            brk3C2 = false ;
            A1525HisProKgr = P003C2_A1525HisProKgr[0] ;
            A1526HisProMtr = P003C2_A1526HisProMtr[0] ;
            A602MaqCod = P003C2_A602MaqCod[0] ;
            A558HisProFec = P003C2_A558HisProFec[0] ;
            A561HisProLin = P003C2_A561HisProLin[0] ;
            AV11HisProKgr = AV11HisProKgr.add(A1525HisProKgr) ;
            AV12HisProMtr = AV12HisProMtr.add(A1526HisProMtr) ;
            brk3C2 = true ;
            pr_default.readNext(0);
         }
         Gxm1sdtinformeproduccionresumentipoarticulo_articulo.setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprotip( A2247HisProTip );
         Gxm1sdtinformeproduccionresumentipoarticulo_articulo.setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hisprokgr( AV11HisProKgr );
         Gxm1sdtinformeproduccionresumentipoarticulo_articulo.setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Hispromtr( AV12HisProMtr );
         AV13TotalKilo = AV13TotalKilo.add(AV11HisProKgr) ;
         AV14TotalMetro = AV14TotalMetro.add(AV12HisProMtr) ;
         Gxm1sdtinformeproduccionresumentipoarticulo_articulo.setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Porkilo( DecimalUtil.doubleToDec(0) );
         Gxm1sdtinformeproduccionresumentipoarticulo_articulo.setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem_Pormetro( DecimalUtil.doubleToDec(0) );
         if ( ! brk3C2 )
         {
            brk3C2 = true ;
            pr_default.readNext(0);
         }
      }
      Gxm2sdtinformeproduccionresumentipoarticulo.setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalkg( AV13TotalKilo );
      Gxm2sdtinformeproduccionresumentipoarticulo.setgxTv_SdtSDTInformeProduccionResumenTipoArticulo_Totalmt( AV14TotalMetro );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = dpinformeproduccionresumentipoarticulo.this.Gxm2sdtinformeproduccionresumentipoarticulo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(0);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2sdtinformeproduccionresumentipoarticulo = new app.produccion.SdtSDTInformeProduccionResumenTipoArticulo(remoteHandle, context);
      scmdbuf = "" ;
      A602MaqCod = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      P003C2_A656ParCod = new short[1] ;
      P003C2_n656ParCod = new boolean[] {false} ;
      P003C2_A396EmprCod = new String[] {""} ;
      P003C2_A2247HisProTip = new short[1] ;
      P003C2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003C2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003C2_A602MaqCod = new String[] {""} ;
      P003C2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P003C2_n4441HisProDTF = new boolean[] {false} ;
      P003C2_A3612HisProReo = new byte[1] ;
      P003C2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P003C2_A561HisProLin = new int[1] ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A558HisProFec = GXutil.nullDate() ;
      Gxm1sdtinformeproduccionresumentipoarticulo_articulo = new app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem(remoteHandle, context);
      AV11HisProKgr = DecimalUtil.ZERO ;
      AV12HisProMtr = DecimalUtil.ZERO ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV13TotalKilo = DecimalUtil.ZERO ;
      AV14TotalMetro = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.dpinformeproduccionresumentipoarticulo__default(),
         new Object[] {
             new Object[] {
            P003C2_A656ParCod, P003C2_n656ParCod, P003C2_A396EmprCod, P003C2_A2247HisProTip, P003C2_A1525HisProKgr, P003C2_A1526HisProMtr, P003C2_A602MaqCod, P003C2_A4441HisProDTF, P003C2_n4441HisProDTF, P003C2_A3612HisProReo,
            P003C2_A558HisProFec, P003C2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV5HisEstReo ;
   private byte A3612HisProReo ;
   private short AV15OperarioFrom ;
   private short AV16OperarioTo ;
   private short A656ParCod ;
   private short A2247HisProTip ;
   private short Gx_err ;
   private int A561HisProLin ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV11HisProKgr ;
   private java.math.BigDecimal AV12HisProMtr ;
   private java.math.BigDecimal AV13TotalKilo ;
   private java.math.BigDecimal AV14TotalMetro ;
   private String AV10Emprcod ;
   private String AV9MaqCod_From ;
   private String AV8MaqCod_To ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV6DateTime_From ;
   private java.util.Date AV7DateTime_To ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean brk3C2 ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private app.produccion.SdtSDTInformeProduccionResumenTipoArticulo[] aP8 ;
   private IDataStoreProvider pr_default ;
   private short[] P003C2_A656ParCod ;
   private boolean[] P003C2_n656ParCod ;
   private String[] P003C2_A396EmprCod ;
   private short[] P003C2_A2247HisProTip ;
   private java.math.BigDecimal[] P003C2_A1525HisProKgr ;
   private java.math.BigDecimal[] P003C2_A1526HisProMtr ;
   private String[] P003C2_A602MaqCod ;
   private java.util.Date[] P003C2_A4441HisProDTF ;
   private boolean[] P003C2_n4441HisProDTF ;
   private byte[] P003C2_A3612HisProReo ;
   private java.util.Date[] P003C2_A558HisProFec ;
   private int[] P003C2_A561HisProLin ;
   private app.produccion.SdtSDTInformeProduccionResumenTipoArticulo Gxm2sdtinformeproduccionresumentipoarticulo ;
   private app.produccion.SdtSDTInformeProduccionResumenTipoArticulo_ArticuloItem Gxm1sdtinformeproduccionresumentipoarticulo_articulo ;
}

final  class dpinformeproduccionresumentipoarticulo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003C2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV5HisEstReo ,
                                          String AV8MaqCod_To ,
                                          String AV9MaqCod_From ,
                                          byte A3612HisProReo ,
                                          String A602MaqCod ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV7DateTime_To ,
                                          java.util.Date AV6DateTime_From ,
                                          short A656ParCod ,
                                          String AV10Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[6];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT ParCod, EmprCod, HisProTip, HisProKgr, HisProMtr, MaqCod, HisProDTF, HisProReo, HisProFec, HisProLin FROM TXPLHIPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HisProDTF <= ?)");
      addWhere(sWhereString, "(HisProDTF >= ?)");
      addWhere(sWhereString, "(ParCod = 0)");
      if ( ! ( AV5HisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(HisProReo = ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8MaqCod_To)==0) )
      {
         addWhere(sWhereString, "(MaqCod <= ?)");
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9MaqCod_From)==0) )
      {
         addWhere(sWhereString, "(MaqCod >= ?)");
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, HisProTip" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
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
                  return conditional_P003C2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003C2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[7], false);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               return;
      }
   }

}

