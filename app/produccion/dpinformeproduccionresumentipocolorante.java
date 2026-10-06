package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpinformeproduccionresumentipocolorante extends GXProcedure
{
   public dpinformeproduccionresumentipocolorante( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpinformeproduccionresumentipocolorante.class ), "" );
   }

   public dpinformeproduccionresumentipocolorante( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.produccion.SdtSDTInformeProduccionResumenTipoColorante executeUdp( String aP0 ,
                                                                                 byte aP1 ,
                                                                                 String aP2 ,
                                                                                 String aP3 ,
                                                                                 java.util.Date aP4 ,
                                                                                 java.util.Date aP5 ,
                                                                                 int aP6 ,
                                                                                 int aP7 )
   {
      dpinformeproduccionresumentipocolorante.this.aP8 = new app.produccion.SdtSDTInformeProduccionResumenTipoColorante[] {new app.produccion.SdtSDTInformeProduccionResumenTipoColorante()};
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
                        app.produccion.SdtSDTInformeProduccionResumenTipoColorante[] aP8 )
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
                             app.produccion.SdtSDTInformeProduccionResumenTipoColorante[] aP8 )
   {
      dpinformeproduccionresumentipocolorante.this.AV7Emprcod = aP0;
      dpinformeproduccionresumentipocolorante.this.AV8HisEstReo = aP1;
      dpinformeproduccionresumentipocolorante.this.AV9MaqCod_From = aP2;
      dpinformeproduccionresumentipocolorante.this.AV10MaqCod_To = aP3;
      dpinformeproduccionresumentipocolorante.this.AV11DateTime_From = aP4;
      dpinformeproduccionresumentipocolorante.this.AV12DateTime_To = aP5;
      dpinformeproduccionresumentipocolorante.this.AV14OperarioFrom = aP6;
      dpinformeproduccionresumentipocolorante.this.AV13OperarioTo = aP7;
      dpinformeproduccionresumentipocolorante.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV13OperarioTo) ,
                                           Integer.valueOf(AV14OperarioFrom) ,
                                           Byte.valueOf(AV8HisEstReo) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           A4441HisProDTF ,
                                           AV12DateTime_To ,
                                           AV11DateTime_From ,
                                           A602MaqCod ,
                                           AV10MaqCod_To ,
                                           AV9MaqCod_From ,
                                           Short.valueOf(A656ParCod) ,
                                           AV7Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P003E2 */
      pr_default.execute(0, new Object[] {AV7Emprcod, AV12DateTime_To, AV11DateTime_From, AV10MaqCod_To, AV9MaqCod_From, Integer.valueOf(AV13OperarioTo), Integer.valueOf(AV14OperarioFrom), Byte.valueOf(AV8HisEstReo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk3E2 = false ;
         A656ParCod = P003E2_A656ParCod[0] ;
         n656ParCod = P003E2_n656ParCod[0] ;
         A396EmprCod = P003E2_A396EmprCod[0] ;
         A3611HisProTc = P003E2_A3611HisProTc[0] ;
         A1525HisProKgr = P003E2_A1525HisProKgr[0] ;
         A1526HisProMtr = P003E2_A1526HisProMtr[0] ;
         A602MaqCod = P003E2_A602MaqCod[0] ;
         A4441HisProDTF = P003E2_A4441HisProDTF[0] ;
         n4441HisProDTF = P003E2_n4441HisProDTF[0] ;
         A3612HisProReo = P003E2_A3612HisProReo[0] ;
         A503GruOpeCod = P003E2_A503GruOpeCod[0] ;
         A558HisProFec = P003E2_A558HisProFec[0] ;
         A561HisProLin = P003E2_A561HisProLin[0] ;
         Gxm1sdtinformeproduccionresumentipocolorante_tipocorante = (app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item)new app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item(remoteHandle, context);
         Gxm2sdtinformeproduccionresumentipocolorante.getgxTv_SdtSDTInformeProduccionResumenTipoColorante_Tipocorante().add(Gxm1sdtinformeproduccionresumentipocolorante_tipocorante, 0);
         Gxm1sdtinformeproduccionresumentipocolorante_tipocorante.setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Emprcod( A396EmprCod );
         Gxm1sdtinformeproduccionresumentipocolorante_tipocorante.setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Maqcod( A602MaqCod );
         Gxm1sdtinformeproduccionresumentipocolorante_tipocorante.setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprodtf( A4441HisProDTF );
         Gxm1sdtinformeproduccionresumentipocolorante_tipocorante.setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Parcod( A656ParCod );
         Gxm1sdtinformeproduccionresumentipocolorante_tipocorante.setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisproreo( A3612HisProReo );
         GXt_char1 = "" ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A3611HisProTc ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfcoldsc(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
         dpinformeproduccionresumentipocolorante.this.A396EmprCod = GXv_char2[0] ;
         dpinformeproduccionresumentipocolorante.this.A3611HisProTc = GXv_int3[0] ;
         dpinformeproduccionresumentipocolorante.this.GXt_char1 = GXv_char4[0] ;
         Gxm1sdtinformeproduccionresumentipocolorante_tipocorante.setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Tipcoldsc( GXt_char1 );
         AV5HisProKgr = DecimalUtil.ZERO ;
         AV6HisProMtr = DecimalUtil.ZERO ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P003E2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P003E2_A3611HisProTc[0] == A3611HisProTc ) )
         {
            brk3E2 = false ;
            A1525HisProKgr = P003E2_A1525HisProKgr[0] ;
            A1526HisProMtr = P003E2_A1526HisProMtr[0] ;
            A602MaqCod = P003E2_A602MaqCod[0] ;
            A558HisProFec = P003E2_A558HisProFec[0] ;
            A561HisProLin = P003E2_A561HisProLin[0] ;
            AV5HisProKgr = AV5HisProKgr.add(A1525HisProKgr) ;
            AV6HisProMtr = AV6HisProMtr.add(A1526HisProMtr) ;
            brk3E2 = true ;
            pr_default.readNext(0);
         }
         Gxm1sdtinformeproduccionresumentipocolorante_tipocorante.setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hisprokgr( AV5HisProKgr );
         Gxm1sdtinformeproduccionresumentipocolorante_tipocorante.setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Hispromtr( AV6HisProMtr );
         Gxm1sdtinformeproduccionresumentipocolorante_tipocorante.setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Porkilo( DecimalUtil.doubleToDec(0) );
         Gxm1sdtinformeproduccionresumentipocolorante_tipocorante.setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Item_Pormetro( DecimalUtil.doubleToDec(0) );
         if ( ! brk3E2 )
         {
            brk3E2 = true ;
            pr_default.readNext(0);
         }
      }
      Gxm2sdtinformeproduccionresumentipocolorante.setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalkg( AV5HisProKgr.add(AV5HisProKgr) );
      Gxm2sdtinformeproduccionresumentipocolorante.setgxTv_SdtSDTInformeProduccionResumenTipoColorante_Totalmt( AV6HisProMtr.add(AV6HisProMtr) );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = dpinformeproduccionresumentipocolorante.this.Gxm2sdtinformeproduccionresumentipocolorante;
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
      Gxm2sdtinformeproduccionresumentipocolorante = new app.produccion.SdtSDTInformeProduccionResumenTipoColorante(remoteHandle, context);
      scmdbuf = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      P003E2_A656ParCod = new short[1] ;
      P003E2_n656ParCod = new boolean[] {false} ;
      P003E2_A396EmprCod = new String[] {""} ;
      P003E2_A3611HisProTc = new byte[1] ;
      P003E2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003E2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003E2_A602MaqCod = new String[] {""} ;
      P003E2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P003E2_n4441HisProDTF = new boolean[] {false} ;
      P003E2_A3612HisProReo = new byte[1] ;
      P003E2_A503GruOpeCod = new int[1] ;
      P003E2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P003E2_A561HisProLin = new int[1] ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A558HisProFec = GXutil.nullDate() ;
      Gxm1sdtinformeproduccionresumentipocolorante_tipocorante = new app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      AV5HisProKgr = DecimalUtil.ZERO ;
      AV6HisProMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.dpinformeproduccionresumentipocolorante__default(),
         new Object[] {
             new Object[] {
            P003E2_A656ParCod, P003E2_n656ParCod, P003E2_A396EmprCod, P003E2_A3611HisProTc, P003E2_A1525HisProKgr, P003E2_A1526HisProMtr, P003E2_A602MaqCod, P003E2_A4441HisProDTF, P003E2_n4441HisProDTF, P003E2_A3612HisProReo,
            P003E2_A503GruOpeCod, P003E2_A558HisProFec, P003E2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8HisEstReo ;
   private byte A3612HisProReo ;
   private byte A3611HisProTc ;
   private byte GXv_int3[] ;
   private short A656ParCod ;
   private short Gx_err ;
   private int AV14OperarioFrom ;
   private int AV13OperarioTo ;
   private int A503GruOpeCod ;
   private int A561HisProLin ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV5HisProKgr ;
   private java.math.BigDecimal AV6HisProMtr ;
   private String AV7Emprcod ;
   private String AV9MaqCod_From ;
   private String AV10MaqCod_To ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private java.util.Date AV11DateTime_From ;
   private java.util.Date AV12DateTime_To ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean brk3E2 ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private app.produccion.SdtSDTInformeProduccionResumenTipoColorante[] aP8 ;
   private IDataStoreProvider pr_default ;
   private short[] P003E2_A656ParCod ;
   private boolean[] P003E2_n656ParCod ;
   private String[] P003E2_A396EmprCod ;
   private byte[] P003E2_A3611HisProTc ;
   private java.math.BigDecimal[] P003E2_A1525HisProKgr ;
   private java.math.BigDecimal[] P003E2_A1526HisProMtr ;
   private String[] P003E2_A602MaqCod ;
   private java.util.Date[] P003E2_A4441HisProDTF ;
   private boolean[] P003E2_n4441HisProDTF ;
   private byte[] P003E2_A3612HisProReo ;
   private int[] P003E2_A503GruOpeCod ;
   private java.util.Date[] P003E2_A558HisProFec ;
   private int[] P003E2_A561HisProLin ;
   private app.produccion.SdtSDTInformeProduccionResumenTipoColorante Gxm2sdtinformeproduccionresumentipocolorante ;
   private app.produccion.SdtSDTInformeProduccionResumenTipoColorante_Item Gxm1sdtinformeproduccionresumentipocolorante_tipocorante ;
}

final  class dpinformeproduccionresumentipocolorante__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003E2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV13OperarioTo ,
                                          int AV14OperarioFrom ,
                                          byte AV8HisEstReo ,
                                          int A503GruOpeCod ,
                                          byte A3612HisProReo ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV12DateTime_To ,
                                          java.util.Date AV11DateTime_From ,
                                          String A602MaqCod ,
                                          String AV10MaqCod_To ,
                                          String AV9MaqCod_From ,
                                          short A656ParCod ,
                                          String AV7Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[8];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT ParCod, EmprCod, HisProTc, HisProKgr, HisProMtr, MaqCod, HisProDTF, HisProReo, GruOpeCod, HisProFec, HisProLin FROM TXPLHIPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HisProDTF <= ?)");
      addWhere(sWhereString, "(HisProDTF >= ?)");
      addWhere(sWhereString, "(MaqCod <= ?)");
      addWhere(sWhereString, "(MaqCod >= ?)");
      addWhere(sWhereString, "(ParCod = 0)");
      if ( ! (0==AV13OperarioTo) )
      {
         addWhere(sWhereString, "(GruOpeCod <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (0==AV14OperarioFrom) )
      {
         addWhere(sWhereString, "(GruOpeCod >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! ( AV8HisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(HisProReo = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, HisProTc" ;
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
                  return conditional_P003E2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003E2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
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
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[9], false);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[10], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[15]).byteValue());
               }
               return;
      }
   }

}

