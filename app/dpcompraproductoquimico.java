package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpcompraproductoquimico extends GXProcedure
{
   public dpcompraproductoquimico( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpcompraproductoquimico.class ), "" );
   }

   public dpcompraproductoquimico( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item> executeUdp( String aP0 ,
                                                                             int aP1 ,
                                                                             String aP2 ,
                                                                             String aP3 )
   {
      dpcompraproductoquimico.this.aP4 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item>()};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item>[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item>[] aP4 )
   {
      dpcompraproductoquimico.this.AV5Emprcod = aP0;
      dpcompraproductoquimico.this.AV6PrvNum = aP1;
      dpcompraproductoquimico.this.AV7PrdNum = aP2;
      dpcompraproductoquimico.this.AV8PrdNom = aP3;
      dpcompraproductoquimico.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV8PrdNom ,
                                           AV7PrdNum ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           Byte.valueOf(A856ValCod) ,
                                           Integer.valueOf(A6158PrdPrv) ,
                                           Integer.valueOf(AV6PrvNum) ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV8PrdNom = GXutil.padr( GXutil.rtrim( AV8PrdNom), 26, "%") ;
      lV7PrdNum = GXutil.padr( GXutil.rtrim( AV7PrdNum), 6, "%") ;
      /* Using cursor P00332 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6PrvNum), lV8PrdNom, lV7PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P00332_A396EmprCod[0] ;
         A6158PrdPrv = P00332_A6158PrdPrv[0] ;
         A718PrdNom = P00332_A718PrdNom[0] ;
         A719PrdNum = P00332_A719PrdNum[0] ;
         A856ValCod = P00332_A856ValCod[0] ;
         A704PrdExiAlm = P00332_A704PrdExiAlm[0] ;
         A684PrdCanPen = P00332_A684PrdCanPen[0] ;
         A724PrdPreAct = P00332_A724PrdPreAct[0] ;
         A857ValDsc = P00332_A857ValDsc[0] ;
         n857ValDsc = P00332_n857ValDsc[0] ;
         A685PrdCanRes = P00332_A685PrdCanRes[0] ;
         A718PrdNom = P00332_A718PrdNom[0] ;
         A856ValCod = P00332_A856ValCod[0] ;
         A704PrdExiAlm = P00332_A704PrdExiAlm[0] ;
         A684PrdCanPen = P00332_A684PrdCanPen[0] ;
         A724PrdPreAct = P00332_A724PrdPreAct[0] ;
         A685PrdCanRes = P00332_A685PrdCanRes[0] ;
         A857ValDsc = P00332_A857ValDsc[0] ;
         n857ValDsc = P00332_n857ValDsc[0] ;
         Gxm1sdtcompraproductoquimico = (app.SdtSDTCompraProductoQuimico_Item)new app.SdtSDTCompraProductoQuimico_Item(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtcompraproductoquimico, 0);
         Gxm1sdtcompraproductoquimico.setgxTv_SdtSDTCompraProductoQuimico_Item_Prdnum( GXutil.trim( A719PrdNum) );
         Gxm1sdtcompraproductoquimico.setgxTv_SdtSDTCompraProductoQuimico_Item_Prdnom( GXutil.trim( A718PrdNom) );
         Gxm1sdtcompraproductoquimico.setgxTv_SdtSDTCompraProductoQuimico_Item_Prdexialm( A704PrdExiAlm );
         Gxm1sdtcompraproductoquimico.setgxTv_SdtSDTCompraProductoQuimico_Item_Prdcanpen( A684PrdCanPen );
         Gxm1sdtcompraproductoquimico.setgxTv_SdtSDTCompraProductoQuimico_Item_Prdpreact( A724PrdPreAct );
         Gxm1sdtcompraproductoquimico.setgxTv_SdtSDTCompraProductoQuimico_Item_Valdsc( GXutil.trim( A857ValDsc) );
         Gxm1sdtcompraproductoquimico.setgxTv_SdtSDTCompraProductoQuimico_Item_Disponible( (A704PrdExiAlm.subtract(A685PrdCanRes)) );
         Gxm1sdtcompraproductoquimico.setgxTv_SdtSDTCompraProductoQuimico_Item_Cantidad( DecimalUtil.doubleToDec(0) );
         Gxm1sdtcompraproductoquimico.setgxTv_SdtSDTCompraProductoQuimico_Item_Valor( DecimalUtil.doubleToDec(0) );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = dpcompraproductoquimico.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item>(app.SdtSDTCompraProductoQuimico_Item.class, "Item", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      lV8PrdNom = "" ;
      lV7PrdNum = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      P00332_A396EmprCod = new String[] {""} ;
      P00332_A6158PrdPrv = new int[1] ;
      P00332_A718PrdNom = new String[] {""} ;
      P00332_A719PrdNum = new String[] {""} ;
      P00332_A856ValCod = new byte[1] ;
      P00332_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00332_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00332_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00332_A857ValDsc = new String[] {""} ;
      P00332_n857ValDsc = new boolean[] {false} ;
      P00332_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      Gxm1sdtcompraproductoquimico = new app.SdtSDTCompraProductoQuimico_Item(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpcompraproductoquimico__default(),
         new Object[] {
             new Object[] {
            P00332_A396EmprCod, P00332_A6158PrdPrv, P00332_A718PrdNom, P00332_A719PrdNum, P00332_A856ValCod, P00332_A704PrdExiAlm, P00332_A684PrdCanPen, P00332_A724PrdPreAct, P00332_A857ValDsc, P00332_n857ValDsc,
            P00332_A685PrdCanRes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short Gx_err ;
   private int AV6PrvNum ;
   private int A6158PrdPrv ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A685PrdCanRes ;
   private String AV5Emprcod ;
   private String AV7PrdNum ;
   private String AV8PrdNom ;
   private String scmdbuf ;
   private String lV8PrdNom ;
   private String lV7PrdNum ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A857ValDsc ;
   private boolean n857ValDsc ;
   private GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item>[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00332_A396EmprCod ;
   private int[] P00332_A6158PrdPrv ;
   private String[] P00332_A718PrdNom ;
   private String[] P00332_A719PrdNum ;
   private byte[] P00332_A856ValCod ;
   private java.math.BigDecimal[] P00332_A704PrdExiAlm ;
   private java.math.BigDecimal[] P00332_A684PrdCanPen ;
   private java.math.BigDecimal[] P00332_A724PrdPreAct ;
   private String[] P00332_A857ValDsc ;
   private boolean[] P00332_n857ValDsc ;
   private java.math.BigDecimal[] P00332_A685PrdCanRes ;
   private GXBaseCollection<app.SdtSDTCompraProductoQuimico_Item> Gxm2rootcol ;
   private app.SdtSDTCompraProductoQuimico_Item Gxm1sdtcompraproductoquimico ;
}

final  class dpcompraproductoquimico__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00332( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV8PrdNom ,
                                          String AV7PrdNum ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          byte A856ValCod ,
                                          int A6158PrdPrv ,
                                          int AV6PrvNum ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[4];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdPrv, T2.PrdNom, T1.PrdNum, T2.ValCod, T2.PrdExiAlm, T2.PrdCanPen, T2.PrdPreAct, T3.ValDsc, T2.PrdCanRes FROM ((TXPPROPRV T1 INNER JOIN TXPPRODUC" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod = T2.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(LENGTH(RTRIM(RTRIM(LTRIM(T1.PrdNum)))) >= 5)");
      addWhere(sWhereString, "(T2.ValCod = 1)");
      addWhere(sWhereString, "(T1.PrdPrv = ?)");
      if ( ! (GXutil.strcmp("", AV8PrdNom)==0) )
      {
         addWhere(sWhereString, "(LOWER(T2.PrdNom) like '%' || LOWER(?))");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV7PrdNum)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum like '%' || ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdPrv" ;
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
                  return conditional_P00332(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00332", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
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
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 6);
               }
               return;
      }
   }

}

