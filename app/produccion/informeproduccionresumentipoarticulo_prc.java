package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeproduccionresumentipoarticulo_prc extends GXProcedure
{
   public informeproduccionresumentipoarticulo_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumentipoarticulo_prc.class ), "" );
   }

   public informeproduccionresumentipoarticulo_prc( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             String aP4 ,
                             int aP5 ,
                             int aP6 ,
                             byte aP7 )
   {
      informeproduccionresumentipoarticulo_prc.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        String aP3 ,
                        String aP4 ,
                        int aP5 ,
                        int aP6 ,
                        byte aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             String aP3 ,
                             String aP4 ,
                             int aP5 ,
                             int aP6 ,
                             byte aP7 ,
                             String[] aP8 )
   {
      informeproduccionresumentipoarticulo_prc.this.AV8EmprCod = aP0;
      informeproduccionresumentipoarticulo_prc.this.AV12HisProdtF = aP1;
      informeproduccionresumentipoarticulo_prc.this.AV11HisProdti = aP2;
      informeproduccionresumentipoarticulo_prc.this.AV9Maqcod1 = aP3;
      informeproduccionresumentipoarticulo_prc.this.AV10Maqcod2 = aP4;
      informeproduccionresumentipoarticulo_prc.this.AV25Poper = aP5;
      informeproduccionresumentipoarticulo_prc.this.AV27Uoper = aP6;
      informeproduccionresumentipoarticulo_prc.this.AV13HisEstReo = aP7;
      informeproduccionresumentipoarticulo_prc.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22TTotk = DecimalUtil.doubleToDec(0) ;
      AV23TTotMt = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV25Poper) ,
                                           Integer.valueOf(AV27Uoper) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           AV11HisProdti ,
                                           AV12HisProdtF ,
                                           AV10Maqcod2 } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0AU22 */
      pr_default.execute(0, new Object[] {AV8EmprCod, AV9Maqcod1, AV11HisProdti, AV12HisProdtF, Byte.valueOf(AV13HisEstReo), Byte.valueOf(AV13HisEstReo), AV10Maqcod2, Integer.valueOf(AV25Poper), Integer.valueOf(AV27Uoper)});
      c1525HisProKgr = P0AU22_A1525HisProKgr[0] ;
      c1526HisProMtr = P0AU22_A1526HisProMtr[0] ;
      pr_default.close(0);
      AV22TTotk = AV22TTotk.add(c1525HisProKgr) ;
      AV23TTotMt = AV23TTotMt.add(c1526HisProMtr) ;
      /* End optimized group. */
      AV20InformeProduccionResumenTipoArticulo_SDT.clear();
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV25Poper) ,
                                           Integer.valueOf(AV27Uoper) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           A602MaqCod ,
                                           AV9Maqcod1 ,
                                           AV10Maqcod2 ,
                                           A4441HisProDTF ,
                                           AV11HisProdti ,
                                           AV12HisProdtF ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Byte.valueOf(AV13HisEstReo) ,
                                           Short.valueOf(A656ParCod) ,
                                           AV8EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0AU23 */
      pr_default.execute(1, new Object[] {AV8EmprCod, AV9Maqcod1, AV10Maqcod2, AV11HisProdti, AV12HisProdtF, Byte.valueOf(AV13HisEstReo), Byte.valueOf(AV13HisEstReo), Integer.valueOf(AV25Poper), Integer.valueOf(AV27Uoper)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAU23 = false ;
         A396EmprCod = P0AU23_A396EmprCod[0] ;
         A656ParCod = P0AU23_A656ParCod[0] ;
         n656ParCod = P0AU23_n656ParCod[0] ;
         A2247HisProTip = P0AU23_A2247HisProTip[0] ;
         A1525HisProKgr = P0AU23_A1525HisProKgr[0] ;
         A1526HisProMtr = P0AU23_A1526HisProMtr[0] ;
         A3612HisProReo = P0AU23_A3612HisProReo[0] ;
         A503GruOpeCod = P0AU23_A503GruOpeCod[0] ;
         A4441HisProDTF = P0AU23_A4441HisProDTF[0] ;
         n4441HisProDTF = P0AU23_n4441HisProDTF[0] ;
         A602MaqCod = P0AU23_A602MaqCod[0] ;
         A558HisProFec = P0AU23_A558HisProFec[0] ;
         A561HisProLin = P0AU23_A561HisProLin[0] ;
         AV14KgsTart = DecimalUtil.doubleToDec(0) ;
         AV15MtsTart = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AU23_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AU23_A2247HisProTip[0] == A2247HisProTip ) )
         {
            brkAU23 = false ;
            A1525HisProKgr = P0AU23_A1525HisProKgr[0] ;
            A1526HisProMtr = P0AU23_A1526HisProMtr[0] ;
            A602MaqCod = P0AU23_A602MaqCod[0] ;
            A558HisProFec = P0AU23_A558HisProFec[0] ;
            A561HisProLin = P0AU23_A561HisProLin[0] ;
            AV14KgsTart = AV14KgsTart.add(A1525HisProKgr) ;
            AV15MtsTart = AV15MtsTart.add(A1526HisProMtr) ;
            brkAU23 = true ;
            pr_default.readNext(1);
         }
         AV16Hisprotip = A2247HisProTip ;
         GXt_char1 = AV17TipArtDsc ;
         GXv_char2[0] = GXt_char1 ;
         new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A2247HisProTip, GXv_char2) ;
         informeproduccionresumentipoarticulo_prc.this.GXt_char1 = GXv_char2[0] ;
         AV17TipArtDsc = GXt_char1 ;
         AV18Por2k = ((AV22TTotk.doubleValue()>0) ? (AV14KgsTart.divide(AV22TTotk, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV19Por2m = ((AV23TTotMt.doubleValue()>0) ? (AV15MtsTart.divide(AV23TTotMt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         AV21InformeProduccionResumenTipoArticulo_SDTItem = (app.produccion.SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem)new app.produccion.SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem(remoteHandle, context);
         AV21InformeProduccionResumenTipoArticulo_SDTItem.setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartcod( A2247HisProTip );
         AV21InformeProduccionResumenTipoArticulo_SDTItem.setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Tipartdsc( AV17TipArtDsc );
         AV21InformeProduccionResumenTipoArticulo_SDTItem.setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Kilos( AV14KgsTart );
         AV21InformeProduccionResumenTipoArticulo_SDTItem.setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Porkilos( AV18Por2k );
         AV21InformeProduccionResumenTipoArticulo_SDTItem.setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Metros( AV15MtsTart );
         AV21InformeProduccionResumenTipoArticulo_SDTItem.setgxTv_SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem_Pormetros( AV19Por2m );
         AV20InformeProduccionResumenTipoArticulo_SDT.add(AV21InformeProduccionResumenTipoArticulo_SDTItem, 0);
         if ( ! brkAU23 )
         {
            brkAU23 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
      AV24InformeProduccionResumenTipoArticulo_SDTJson = AV20InformeProduccionResumenTipoArticulo_SDT.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = informeproduccionresumentipoarticulo_prc.this.AV24InformeProduccionResumenTipoArticulo_SDTJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24InformeProduccionResumenTipoArticulo_SDTJson = "" ;
      AV22TTotk = DecimalUtil.ZERO ;
      AV23TTotMt = DecimalUtil.ZERO ;
      c1525HisProKgr = DecimalUtil.ZERO ;
      c1526HisProMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0AU22_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AU22_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV20InformeProduccionResumenTipoArticulo_SDT = new GXBaseCollection<app.produccion.SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem>(app.produccion.SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem.class, "InformeProduccionResumenTipoArticulo_SDTItem", "TexplusNET", remoteHandle);
      A602MaqCod = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      P0AU23_A396EmprCod = new String[] {""} ;
      P0AU23_A656ParCod = new short[1] ;
      P0AU23_n656ParCod = new boolean[] {false} ;
      P0AU23_A2247HisProTip = new short[1] ;
      P0AU23_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AU23_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AU23_A3612HisProReo = new byte[1] ;
      P0AU23_A503GruOpeCod = new int[1] ;
      P0AU23_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AU23_n4441HisProDTF = new boolean[] {false} ;
      P0AU23_A602MaqCod = new String[] {""} ;
      P0AU23_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0AU23_A561HisProLin = new int[1] ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A558HisProFec = GXutil.nullDate() ;
      AV14KgsTart = DecimalUtil.ZERO ;
      AV15MtsTart = DecimalUtil.ZERO ;
      AV17TipArtDsc = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV18Por2k = DecimalUtil.ZERO ;
      AV19Por2m = DecimalUtil.ZERO ;
      AV21InformeProduccionResumenTipoArticulo_SDTItem = new app.produccion.SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionresumentipoarticulo_prc__default(),
         new Object[] {
             new Object[] {
            P0AU22_A1525HisProKgr, P0AU22_A1526HisProMtr
            }
            , new Object[] {
            P0AU23_A396EmprCod, P0AU23_A656ParCod, P0AU23_n656ParCod, P0AU23_A2247HisProTip, P0AU23_A1525HisProKgr, P0AU23_A1526HisProMtr, P0AU23_A3612HisProReo, P0AU23_A503GruOpeCod, P0AU23_A4441HisProDTF, P0AU23_n4441HisProDTF,
            P0AU23_A602MaqCod, P0AU23_A558HisProFec, P0AU23_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13HisEstReo ;
   private byte A3612HisProReo ;
   private short A656ParCod ;
   private short A2247HisProTip ;
   private short AV16Hisprotip ;
   private short Gx_err ;
   private int AV25Poper ;
   private int AV27Uoper ;
   private int A503GruOpeCod ;
   private int A561HisProLin ;
   private java.math.BigDecimal AV22TTotk ;
   private java.math.BigDecimal AV23TTotMt ;
   private java.math.BigDecimal c1525HisProKgr ;
   private java.math.BigDecimal c1526HisProMtr ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV14KgsTart ;
   private java.math.BigDecimal AV15MtsTart ;
   private java.math.BigDecimal AV18Por2k ;
   private java.math.BigDecimal AV19Por2m ;
   private String AV8EmprCod ;
   private String AV9Maqcod1 ;
   private String AV10Maqcod2 ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String AV17TipArtDsc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV12HisProdtF ;
   private java.util.Date AV11HisProdti ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean brkAU23 ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private String AV24InformeProduccionResumenTipoArticulo_SDTJson ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P0AU22_A1525HisProKgr ;
   private java.math.BigDecimal[] P0AU22_A1526HisProMtr ;
   private String[] P0AU23_A396EmprCod ;
   private short[] P0AU23_A656ParCod ;
   private boolean[] P0AU23_n656ParCod ;
   private short[] P0AU23_A2247HisProTip ;
   private java.math.BigDecimal[] P0AU23_A1525HisProKgr ;
   private java.math.BigDecimal[] P0AU23_A1526HisProMtr ;
   private byte[] P0AU23_A3612HisProReo ;
   private int[] P0AU23_A503GruOpeCod ;
   private java.util.Date[] P0AU23_A4441HisProDTF ;
   private boolean[] P0AU23_n4441HisProDTF ;
   private String[] P0AU23_A602MaqCod ;
   private java.util.Date[] P0AU23_A558HisProFec ;
   private int[] P0AU23_A561HisProLin ;
   private GXBaseCollection<app.produccion.SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem> AV20InformeProduccionResumenTipoArticulo_SDT ;
   private app.produccion.SdtInformeProduccionResumenTipoArticulo_SDT_InformeProduccionResumenTipoArticulo_SDTItem AV21InformeProduccionResumenTipoArticulo_SDTItem ;
}

final  class informeproduccionresumentipoarticulo_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AU22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV25Poper ,
                                          int AV27Uoper ,
                                          int A503GruOpeCod ,
                                          java.util.Date AV11HisProdti ,
                                          java.util.Date AV12HisProdtF ,
                                          String AV10Maqcod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[9];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT SUM(HisProKgr), SUM(HisProMtr) FROM TXPLHIPRO" ;
      addWhere(sWhereString, "(EmprCod = ? and MaqCod >= ?)");
      addWhere(sWhereString, "(HisProDTF >= ?)");
      addWhere(sWhereString, "(HisProDTF <= ?)");
      addWhere(sWhereString, "(HisProReo = ? or ? = 9)");
      addWhere(sWhereString, "(ParCod = 0)");
      addWhere(sWhereString, "(MaqCod <= ?)");
      if ( ! (0==AV25Poper) )
      {
         addWhere(sWhereString, "(GruOpeCod >= ?)");
      }
      else
      {
         GXv_int3[7] = (byte)(1) ;
      }
      if ( ! (0==AV27Uoper) )
      {
         addWhere(sWhereString, "(GruOpeCod <= ?)");
      }
      else
      {
         GXv_int3[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
   }

   protected Object[] conditional_P0AU23( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV25Poper ,
                                          int AV27Uoper ,
                                          int A503GruOpeCod ,
                                          String A602MaqCod ,
                                          String AV9Maqcod1 ,
                                          String AV10Maqcod2 ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV11HisProdti ,
                                          java.util.Date AV12HisProdtF ,
                                          byte A3612HisProReo ,
                                          byte AV13HisEstReo ,
                                          short A656ParCod ,
                                          String AV8EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[9];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, ParCod, HisProTip, HisProKgr, HisProMtr, HisProReo, GruOpeCod, HisProDTF, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MaqCod >= ?)");
      addWhere(sWhereString, "(MaqCod <= ?)");
      addWhere(sWhereString, "(HisProDTF >= ?)");
      addWhere(sWhereString, "(HisProDTF <= ?)");
      addWhere(sWhereString, "(HisProReo = ? or ? = 9)");
      addWhere(sWhereString, "(ParCod = 0)");
      if ( ! (0==AV25Poper) )
      {
         addWhere(sWhereString, "(GruOpeCod >= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV27Uoper) )
      {
         addWhere(sWhereString, "(GruOpeCod <= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, HisProTip" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
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
                  return conditional_P0AU22(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] );
            case 1 :
                  return conditional_P0AU23(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AU22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AU23", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[11], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[12], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[13]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[12], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[15]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               return;
      }
   }

}

