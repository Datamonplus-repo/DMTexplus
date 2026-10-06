package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeproduccionresumentipoarticulototales_pr extends GXProcedure
{
   public informeproduccionresumentipoarticulototales_pr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumentipoarticulototales_pr.class ), "" );
   }

   public informeproduccionresumentipoarticulototales_pr( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           byte aP1 ,
                                           String aP2 ,
                                           String aP3 ,
                                           java.util.Date aP4 ,
                                           java.util.Date aP5 ,
                                           java.math.BigDecimal[] aP6 )
   {
      informeproduccionresumentipoarticulototales_pr.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        String aP2 ,
                        String aP3 ,
                        java.util.Date aP4 ,
                        java.util.Date aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             String aP2 ,
                             String aP3 ,
                             java.util.Date aP4 ,
                             java.util.Date aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      informeproduccionresumentipoarticulototales_pr.this.AV8EmprCod = aP0;
      informeproduccionresumentipoarticulototales_pr.this.AV13HisEstReo = aP1;
      informeproduccionresumentipoarticulototales_pr.this.AV9MaqCod_From = aP2;
      informeproduccionresumentipoarticulototales_pr.this.AV10MaqCod_To = aP3;
      informeproduccionresumentipoarticulototales_pr.this.AV11DateTime_From = aP4;
      informeproduccionresumentipoarticulototales_pr.this.AV12DateTime_To = aP5;
      informeproduccionresumentipoarticulototales_pr.this.aP6 = aP6;
      informeproduccionresumentipoarticulototales_pr.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14TTotk = DecimalUtil.doubleToDec(0) ;
      AV15TTotMt = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV13HisEstReo) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           AV11DateTime_From ,
                                           AV12DateTime_To ,
                                           AV10MaqCod_To } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0A9Q2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, AV9MaqCod_From, AV11DateTime_From, AV12DateTime_To, AV10MaqCod_To, Byte.valueOf(AV13HisEstReo)});
      c1525HisProKgr = P0A9Q2_A1525HisProKgr[0] ;
      c1526HisProMtr = P0A9Q2_A1526HisProMtr[0] ;
      pr_default.close(0);
      AV14TTotk = AV14TTotk.add(c1525HisProKgr) ;
      AV15TTotMt = AV15TTotMt.add(c1526HisProMtr) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = informeproduccionresumentipoarticulototales_pr.this.AV14TTotk;
      this.aP7[0] = informeproduccionresumentipoarticulototales_pr.this.AV15TTotMt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14TTotk = DecimalUtil.ZERO ;
      AV15TTotMt = DecimalUtil.ZERO ;
      c1525HisProKgr = DecimalUtil.ZERO ;
      c1526HisProMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0A9Q2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A9Q2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionresumentipoarticulototales_pr__default(),
         new Object[] {
             new Object[] {
            P0A9Q2_A1525HisProKgr, P0A9Q2_A1526HisProMtr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13HisEstReo ;
   private byte A3612HisProReo ;
   private short Gx_err ;
   private java.math.BigDecimal AV14TTotk ;
   private java.math.BigDecimal AV15TTotMt ;
   private java.math.BigDecimal c1525HisProKgr ;
   private java.math.BigDecimal c1526HisProMtr ;
   private String AV8EmprCod ;
   private String AV9MaqCod_From ;
   private String AV10MaqCod_To ;
   private String scmdbuf ;
   private java.util.Date AV11DateTime_From ;
   private java.util.Date AV12DateTime_To ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P0A9Q2_A1525HisProKgr ;
   private java.math.BigDecimal[] P0A9Q2_A1526HisProMtr ;
}

final  class informeproduccionresumentipoarticulototales_pr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A9Q2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV13HisEstReo ,
                                          byte A3612HisProReo ,
                                          java.util.Date AV11DateTime_From ,
                                          java.util.Date AV12DateTime_To ,
                                          String AV10MaqCod_To )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[6];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT SUM(HisProKgr), SUM(HisProMtr) FROM TXPLHIPRO" ;
      addWhere(sWhereString, "(EmprCod = ? and MaqCod >= ?)");
      addWhere(sWhereString, "(HisProDTF >= ?)");
      addWhere(sWhereString, "(HisProDTF <= ?)");
      addWhere(sWhereString, "(ParCod = 0)");
      addWhere(sWhereString, "(MaqCod <= ?)");
      if ( ! ( AV13HisEstReo == 9 ) )
      {
         addWhere(sWhereString, "(HisProReo = ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
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
                  return conditional_P0A9Q2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A9Q2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
                  stmt.setString(sIdx, (String)parms[7], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[9], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               return;
      }
   }

}

