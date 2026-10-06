package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class borradodeformulas_1 extends GXProcedure
{
   public borradodeformulas_1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( borradodeformulas_1.class ), "" );
   }

   public borradodeformulas_1( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 ,
                        int aP7 ,
                        int aP8 ,
                        byte aP9 ,
                        byte aP10 ,
                        java.util.Date aP11 ,
                        String aP12 ,
                        String aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             int aP7 ,
                             int aP8 ,
                             byte aP9 ,
                             byte aP10 ,
                             java.util.Date aP11 ,
                             String aP12 ,
                             String aP13 )
   {
      borradodeformulas_1.this.AV10Emprcod = aP0;
      borradodeformulas_1.this.AV8Clicod = aP1;
      borradodeformulas_1.this.AV9CliCod_to = aP2;
      borradodeformulas_1.this.AV15Forser = aP3;
      borradodeformulas_1.this.AV16Forser_to = aP4;
      borradodeformulas_1.this.AV11Forcolnom = aP5;
      borradodeformulas_1.this.AV12Forcolnom_to = aP6;
      borradodeformulas_1.this.AV13Forcolnum = aP7;
      borradodeformulas_1.this.AV14Forcolnum_to = aP8;
      borradodeformulas_1.this.AV20TipColCod = aP9;
      borradodeformulas_1.this.AV21Tipcolcod_to = aP10;
      borradodeformulas_1.this.AV17ForUltUti = aP11;
      borradodeformulas_1.this.AV22Usurcod = aP12;
      borradodeformulas_1.this.AV19Station = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV8Clicod) ,
                                           Integer.valueOf(AV9CliCod_to) ,
                                           AV15Forser ,
                                           AV16Forser_to ,
                                           AV11Forcolnom ,
                                           AV12Forcolnom_to ,
                                           Integer.valueOf(AV13Forcolnum) ,
                                           Integer.valueOf(AV14Forcolnum_to) ,
                                           Byte.valueOf(AV20TipColCod) ,
                                           Byte.valueOf(AV21Tipcolcod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A496ForUltUti ,
                                           AV17ForUltUti ,
                                           A2749ForPro ,
                                           AV10Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09TO2 */
      pr_default.execute(0, new Object[] {AV10Emprcod, AV17ForUltUti, Integer.valueOf(AV8Clicod), Integer.valueOf(AV9CliCod_to), AV15Forser, AV16Forser_to, AV11Forcolnom, AV12Forcolnom_to, Integer.valueOf(AV13Forcolnum), Integer.valueOf(AV14Forcolnum_to), Byte.valueOf(AV20TipColCod), Byte.valueOf(AV21Tipcolcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2749ForPro = P09TO2_A2749ForPro[0] ;
         n2749ForPro = P09TO2_n2749ForPro[0] ;
         A496ForUltUti = P09TO2_A496ForUltUti[0] ;
         n496ForUltUti = P09TO2_n496ForUltUti[0] ;
         A831TipColCod = P09TO2_A831TipColCod[0] ;
         A483ForColNum = P09TO2_A483ForColNum[0] ;
         A482ForColNom = P09TO2_A482ForColNom[0] ;
         A494ForSer = P09TO2_A494ForSer[0] ;
         A252CliCod = P09TO2_A252CliCod[0] ;
         A396EmprCod = P09TO2_A396EmprCod[0] ;
         A486ForNumCol = P09TO2_A486ForNumCol[0] ;
         GXt_int1 = AV33Num_Hdrs ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char4[0] = A494ForSer ;
         GXv_char5[0] = A482ForColNom ;
         GXv_int6[0] = A483ForColNum ;
         GXv_int7[0] = A831TipColCod ;
         GXv_int8[0] = GXt_int1 ;
         new app.formulaciontinte.pkilequi2(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int7, GXv_int8) ;
         borradodeformulas_1.this.A396EmprCod = GXv_char2[0] ;
         borradodeformulas_1.this.A252CliCod = GXv_int3[0] ;
         borradodeformulas_1.this.A494ForSer = GXv_char4[0] ;
         borradodeformulas_1.this.A482ForColNom = GXv_char5[0] ;
         borradodeformulas_1.this.A483ForColNum = GXv_int6[0] ;
         borradodeformulas_1.this.A831TipColCod = GXv_int7[0] ;
         borradodeformulas_1.this.GXt_int1 = GXv_int8[0] ;
         AV33Num_Hdrs = (short)(GXt_int1) ;
         GXt_int1 = AV34Num_HdrsH ;
         GXv_int8[0] = GXt_int1 ;
         new app.formulaciontinte.pkilequi2historico(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod, GXv_int8) ;
         borradodeformulas_1.this.GXt_int1 = GXv_int8[0] ;
         AV34Num_HdrsH = (short)(GXt_int1) ;
         if ( ( AV33Num_Hdrs == 0 ) && ( AV34Num_HdrsH == 0 ) )
         {
            new app.formulaciontinte.borradodeformulas_3(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod, A486ForNumCol, AV19Station, AV22Usurcod) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A496ForUltUti = GXutil.nullDate() ;
      A2749ForPro = "" ;
      A396EmprCod = "" ;
      P09TO2_A2749ForPro = new String[] {""} ;
      P09TO2_n2749ForPro = new boolean[] {false} ;
      P09TO2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P09TO2_n496ForUltUti = new boolean[] {false} ;
      P09TO2_A831TipColCod = new byte[1] ;
      P09TO2_A483ForColNum = new int[1] ;
      P09TO2_A482ForColNom = new String[] {""} ;
      P09TO2_A494ForSer = new String[] {""} ;
      P09TO2_A252CliCod = new int[1] ;
      P09TO2_A396EmprCod = new String[] {""} ;
      P09TO2_A486ForNumCol = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int8 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.borradodeformulas_1__default(),
         new Object[] {
             new Object[] {
            P09TO2_A2749ForPro, P09TO2_n2749ForPro, P09TO2_A496ForUltUti, P09TO2_n496ForUltUti, P09TO2_A831TipColCod, P09TO2_A483ForColNum, P09TO2_A482ForColNom, P09TO2_A494ForSer, P09TO2_A252CliCod, P09TO2_A396EmprCod,
            P09TO2_A486ForNumCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TipColCod ;
   private byte AV21Tipcolcod_to ;
   private byte A831TipColCod ;
   private byte GXv_int7[] ;
   private short AV33Num_Hdrs ;
   private short AV34Num_HdrsH ;
   private short Gx_err ;
   private int AV8Clicod ;
   private int AV9CliCod_to ;
   private int AV13Forcolnum ;
   private int AV14Forcolnum_to ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int GXv_int3[] ;
   private int GXv_int6[] ;
   private int GXt_int1 ;
   private int GXv_int8[] ;
   private String AV10Emprcod ;
   private String AV15Forser ;
   private String AV16Forser_to ;
   private String AV11Forcolnom ;
   private String AV12Forcolnom_to ;
   private String AV22Usurcod ;
   private String AV19Station ;
   private String scmdbuf ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A2749ForPro ;
   private String A396EmprCod ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private java.util.Date AV17ForUltUti ;
   private java.util.Date A496ForUltUti ;
   private boolean n2749ForPro ;
   private boolean n496ForUltUti ;
   private IDataStoreProvider pr_default ;
   private String[] P09TO2_A2749ForPro ;
   private boolean[] P09TO2_n2749ForPro ;
   private java.util.Date[] P09TO2_A496ForUltUti ;
   private boolean[] P09TO2_n496ForUltUti ;
   private byte[] P09TO2_A831TipColCod ;
   private int[] P09TO2_A483ForColNum ;
   private String[] P09TO2_A482ForColNom ;
   private String[] P09TO2_A494ForSer ;
   private int[] P09TO2_A252CliCod ;
   private String[] P09TO2_A396EmprCod ;
   private int[] P09TO2_A486ForNumCol ;
}

final  class borradodeformulas_1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09TO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV8Clicod ,
                                          int AV9CliCod_to ,
                                          String AV15Forser ,
                                          String AV16Forser_to ,
                                          String AV11Forcolnom ,
                                          String AV12Forcolnom_to ,
                                          int AV13Forcolnum ,
                                          int AV14Forcolnum_to ,
                                          byte AV20TipColCod ,
                                          byte AV21Tipcolcod_to ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          java.util.Date A496ForUltUti ,
                                          java.util.Date AV17ForUltUti ,
                                          String A2749ForPro ,
                                          String AV10Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[12];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT ForPro, ForUltUti, TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForNumCol FROM TXPCFORMU" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(ForUltUti <= ?)");
      addWhere(sWhereString, "(Not (ForUltUti = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(ForPro <> 'S')");
      if ( ! (0==AV8Clicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (0==AV9CliCod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15Forser)==0) )
      {
         addWhere(sWhereString, "(ForSer >= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16Forser_to)==0) )
      {
         addWhere(sWhereString, "(ForSer <= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11Forcolnom)==0) )
      {
         addWhere(sWhereString, "(ForColNom >= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(ForColNom <= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV13Forcolnum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! (0==AV14Forcolnum_to) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (0==AV20TipColCod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! (0==AV21Tipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P09TO2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09TO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((int[]) buf[10])[0] = rslt.getInt(9);
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               return;
      }
   }

}

