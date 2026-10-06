package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeproduccionresumenturno_prc extends GXProcedure
{
   public informeproduccionresumenturno_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumenturno_prc.class ), "" );
   }

   public informeproduccionresumenturno_prc( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             byte aP1 ,
                             String aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             int aP6 ,
                             int aP7 )
   {
      informeproduccionresumenturno_prc.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        String aP2 ,
                        String aP3 ,
                        java.util.Date aP4 ,
                        java.util.Date aP5 ,
                        int aP6 ,
                        int aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             String aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             int aP6 ,
                             int aP7 ,
                             String[] aP8 )
   {
      informeproduccionresumenturno_prc.this.AV8Emprcod = aP0;
      informeproduccionresumenturno_prc.this.AV9HisEstReo = aP1;
      informeproduccionresumenturno_prc.this.AV10MaqCod1 = aP2;
      informeproduccionresumenturno_prc.this.AV11MaqCod2 = aP3;
      informeproduccionresumenturno_prc.this.AV12HisProFec1 = aP4;
      informeproduccionresumenturno_prc.this.AV13HisProFec2 = aP5;
      informeproduccionresumenturno_prc.this.AV14OperarioFrom = aP6;
      informeproduccionresumenturno_prc.this.AV15OperarioTo = aP7;
      informeproduccionresumenturno_prc.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21InformeProduccionResumenTurno_SDT.clear();
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV14OperarioFrom) ,
                                           Integer.valueOf(AV15OperarioTo) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           A4441HisProDTF ,
                                           AV12HisProFec1 ,
                                           AV13HisProFec2 ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Byte.valueOf(AV9HisEstReo) ,
                                           Short.valueOf(A656ParCod) ,
                                           AV8Emprcod ,
                                           AV10MaqCod1 ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           AV11MaqCod2 } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0ASY2 */
      pr_default.execute(0, new Object[] {AV8Emprcod, AV10MaqCod1, AV12HisProFec1, AV13HisProFec2, Byte.valueOf(AV9HisEstReo), Byte.valueOf(AV9HisEstReo), AV11MaqCod2, Integer.valueOf(AV14OperarioFrom), Integer.valueOf(AV15OperarioTo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkASY2 = false ;
         A602MaqCod = P0ASY2_A602MaqCod[0] ;
         A396EmprCod = P0ASY2_A396EmprCod[0] ;
         A1525HisProKgr = P0ASY2_A1525HisProKgr[0] ;
         A566HisProTur = P0ASY2_A566HisProTur[0] ;
         A503GruOpeCod = P0ASY2_A503GruOpeCod[0] ;
         A3612HisProReo = P0ASY2_A3612HisProReo[0] ;
         A656ParCod = P0ASY2_A656ParCod[0] ;
         n656ParCod = P0ASY2_n656ParCod[0] ;
         A4441HisProDTF = P0ASY2_A4441HisProDTF[0] ;
         n4441HisProDTF = P0ASY2_n4441HisProDTF[0] ;
         A606MaqDsc = P0ASY2_A606MaqDsc[0] ;
         n606MaqDsc = P0ASY2_n606MaqDsc[0] ;
         A558HisProFec = P0ASY2_A558HisProFec[0] ;
         A561HisProLin = P0ASY2_A561HisProLin[0] ;
         A606MaqDsc = P0ASY2_A606MaqDsc[0] ;
         n606MaqDsc = P0ASY2_n606MaqDsc[0] ;
         AV17kilos1 = DecimalUtil.ZERO ;
         AV18kilos2 = DecimalUtil.ZERO ;
         AV19kilos3 = DecimalUtil.ZERO ;
         AV20kilos4 = DecimalUtil.ZERO ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ASY2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0ASY2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brkASY2 = false ;
            A1525HisProKgr = P0ASY2_A1525HisProKgr[0] ;
            A566HisProTur = P0ASY2_A566HisProTur[0] ;
            A558HisProFec = P0ASY2_A558HisProFec[0] ;
            A561HisProLin = P0ASY2_A561HisProLin[0] ;
            AV16HisProtur = (byte)(((A566HisProTur<=0)||(A566HisProTur>3) ? 4 : A566HisProTur)) ;
            if ( AV16HisProtur == 1 )
            {
               AV17kilos1 = AV17kilos1.add(A1525HisProKgr) ;
            }
            else if ( AV16HisProtur == 2 )
            {
               AV18kilos2 = AV18kilos2.add(A1525HisProKgr) ;
            }
            else if ( AV16HisProtur == 3 )
            {
               AV19kilos3 = AV19kilos3.add(A1525HisProKgr) ;
            }
            else if ( AV16HisProtur == 4 )
            {
               AV20kilos4 = AV20kilos4.add(A1525HisProKgr) ;
            }
            else
            {
            }
            brkASY2 = true ;
            pr_default.readNext(0);
         }
         AV22InformeProduccionResumenTurno_SDT_item = (app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)new app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem(remoteHandle, context);
         AV22InformeProduccionResumenTurno_SDT_item.setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqcod( A602MaqCod );
         AV22InformeProduccionResumenTurno_SDT_item.setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqdsc( A606MaqDsc );
         AV22InformeProduccionResumenTurno_SDT_item.setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1( AV17kilos1 );
         AV22InformeProduccionResumenTurno_SDT_item.setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2( AV18kilos2 );
         AV22InformeProduccionResumenTurno_SDT_item.setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3( AV19kilos3 );
         AV22InformeProduccionResumenTurno_SDT_item.setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4( AV20kilos4 );
         AV21InformeProduccionResumenTurno_SDT.add(AV22InformeProduccionResumenTurno_SDT_item, 0);
         if ( ! brkASY2 )
         {
            brkASY2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV25InformeProduccionResumenTurno_SDTjson = AV21InformeProduccionResumenTurno_SDT.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = informeproduccionresumenturno_prc.this.AV25InformeProduccionResumenTurno_SDTjson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25InformeProduccionResumenTurno_SDTjson = "" ;
      AV21InformeProduccionResumenTurno_SDT = new GXBaseCollection<app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem>(app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem.class, "InformeProduccionResumenTurno_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      P0ASY2_A602MaqCod = new String[] {""} ;
      P0ASY2_A396EmprCod = new String[] {""} ;
      P0ASY2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ASY2_A566HisProTur = new byte[1] ;
      P0ASY2_A503GruOpeCod = new int[1] ;
      P0ASY2_A3612HisProReo = new byte[1] ;
      P0ASY2_A656ParCod = new short[1] ;
      P0ASY2_n656ParCod = new boolean[] {false} ;
      P0ASY2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0ASY2_n4441HisProDTF = new boolean[] {false} ;
      P0ASY2_A606MaqDsc = new String[] {""} ;
      P0ASY2_n606MaqDsc = new boolean[] {false} ;
      P0ASY2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0ASY2_A561HisProLin = new int[1] ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      A558HisProFec = GXutil.nullDate() ;
      AV17kilos1 = DecimalUtil.ZERO ;
      AV18kilos2 = DecimalUtil.ZERO ;
      AV19kilos3 = DecimalUtil.ZERO ;
      AV20kilos4 = DecimalUtil.ZERO ;
      AV22InformeProduccionResumenTurno_SDT_item = new app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionresumenturno_prc__default(),
         new Object[] {
             new Object[] {
            P0ASY2_A602MaqCod, P0ASY2_A396EmprCod, P0ASY2_A1525HisProKgr, P0ASY2_A566HisProTur, P0ASY2_A503GruOpeCod, P0ASY2_A3612HisProReo, P0ASY2_A656ParCod, P0ASY2_n656ParCod, P0ASY2_A4441HisProDTF, P0ASY2_n4441HisProDTF,
            P0ASY2_A606MaqDsc, P0ASY2_n606MaqDsc, P0ASY2_A558HisProFec, P0ASY2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9HisEstReo ;
   private byte A3612HisProReo ;
   private byte A566HisProTur ;
   private byte AV16HisProtur ;
   private short A656ParCod ;
   private short Gx_err ;
   private int AV14OperarioFrom ;
   private int AV15OperarioTo ;
   private int A503GruOpeCod ;
   private int A561HisProLin ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal AV17kilos1 ;
   private java.math.BigDecimal AV18kilos2 ;
   private java.math.BigDecimal AV19kilos3 ;
   private java.math.BigDecimal AV20kilos4 ;
   private String AV8Emprcod ;
   private String AV10MaqCod1 ;
   private String AV11MaqCod2 ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private java.util.Date AV12HisProFec1 ;
   private java.util.Date AV13HisProFec2 ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean brkASY2 ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean n606MaqDsc ;
   private String AV25InformeProduccionResumenTurno_SDTjson ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ASY2_A602MaqCod ;
   private String[] P0ASY2_A396EmprCod ;
   private java.math.BigDecimal[] P0ASY2_A1525HisProKgr ;
   private byte[] P0ASY2_A566HisProTur ;
   private int[] P0ASY2_A503GruOpeCod ;
   private byte[] P0ASY2_A3612HisProReo ;
   private short[] P0ASY2_A656ParCod ;
   private boolean[] P0ASY2_n656ParCod ;
   private java.util.Date[] P0ASY2_A4441HisProDTF ;
   private boolean[] P0ASY2_n4441HisProDTF ;
   private String[] P0ASY2_A606MaqDsc ;
   private boolean[] P0ASY2_n606MaqDsc ;
   private java.util.Date[] P0ASY2_A558HisProFec ;
   private int[] P0ASY2_A561HisProLin ;
   private GXBaseCollection<app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem> AV21InformeProduccionResumenTurno_SDT ;
   private app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem AV22InformeProduccionResumenTurno_SDT_item ;
}

final  class informeproduccionresumenturno_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ASY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV14OperarioFrom ,
                                          int AV15OperarioTo ,
                                          int A503GruOpeCod ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV12HisProFec1 ,
                                          java.util.Date AV13HisProFec2 ,
                                          byte A3612HisProReo ,
                                          byte AV9HisEstReo ,
                                          short A656ParCod ,
                                          String AV8Emprcod ,
                                          String AV10MaqCod1 ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          String AV11MaqCod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[9];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT T1.MaqCod, T1.EmprCod, T1.HisProKgr, T1.HisProTur, T1.GruOpeCod, T1.HisProReo, T1.ParCod, T1.HisProDTF, T2.MaqDsc, T1.HisProFec, T1.HisProLin FROM (TXPLHIPRO" ;
      scmdbuf += " T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      addWhere(sWhereString, "(T1.HisProReo = ? or ? = 9)");
      addWhere(sWhereString, "(T1.ParCod = 0)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( ! (0==AV14OperarioFrom) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int1[7] = (byte)(1) ;
      }
      if ( ! (0==AV15OperarioTo) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int1[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProTur" ;
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
                  return conditional_P0ASY2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ASY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((int[]) buf[13])[0] = rslt.getInt(11);
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
      }
   }

}

