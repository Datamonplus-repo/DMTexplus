package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class eliminaciondeformulastinte_dp extends GXProcedure
{
   public eliminaciondeformulastinte_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( eliminaciondeformulastinte_dp.class ), "" );
   }

   public eliminaciondeformulastinte_dp( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT> executeUdp( String aP0 ,
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
                                                                                               short aP12 )
   {
      eliminaciondeformulastinte_dp.this.aP13 = new GXBaseCollection[] {new GXBaseCollection<app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
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
                        short aP12 ,
                        GXBaseCollection<app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT>[] aP13 )
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
                             short aP12 ,
                             GXBaseCollection<app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT>[] aP13 )
   {
      eliminaciondeformulastinte_dp.this.AV5Emprcod = aP0;
      eliminaciondeformulastinte_dp.this.AV7CliCod = aP1;
      eliminaciondeformulastinte_dp.this.AV12CliCod_to = aP2;
      eliminaciondeformulastinte_dp.this.AV8Forser = aP3;
      eliminaciondeformulastinte_dp.this.AV15Forser_to = aP4;
      eliminaciondeformulastinte_dp.this.AV9Forcolnom = aP5;
      eliminaciondeformulastinte_dp.this.AV13Forcolnom_to = aP6;
      eliminaciondeformulastinte_dp.this.AV10Forcolnum = aP7;
      eliminaciondeformulastinte_dp.this.AV14Forcolnum_to = aP8;
      eliminaciondeformulastinte_dp.this.AV11Tipcolcod = aP9;
      eliminaciondeformulastinte_dp.this.AV16TipColCod_to = aP10;
      eliminaciondeformulastinte_dp.this.AV6ForUltUti = aP11;
      eliminaciondeformulastinte_dp.this.AV19FlagFecn = aP12;
      eliminaciondeformulastinte_dp.this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV16TipColCod_to) ,
                                           Byte.valueOf(AV11Tipcolcod) ,
                                           Integer.valueOf(AV14Forcolnum_to) ,
                                           Integer.valueOf(AV10Forcolnum) ,
                                           AV13Forcolnom_to ,
                                           AV9Forcolnom ,
                                           AV15Forser_to ,
                                           AV8Forser ,
                                           Integer.valueOf(AV12CliCod_to) ,
                                           Integer.valueOf(AV7CliCod) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           Integer.valueOf(A483ForColNum) ,
                                           A482ForColNom ,
                                           A494ForSer ,
                                           Integer.valueOf(A252CliCod) ,
                                           A396EmprCod ,
                                           A496ForUltUti ,
                                           AV6ForUltUti ,
                                           A2749ForPro ,
                                           AV5Emprcod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      /* Using cursor P00312 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV6ForUltUti, Byte.valueOf(AV16TipColCod_to), Byte.valueOf(AV11Tipcolcod), Integer.valueOf(AV14Forcolnum_to), Integer.valueOf(AV10Forcolnum), AV13Forcolnom_to, AV9Forcolnom, AV15Forser_to, AV8Forser, Integer.valueOf(AV12CliCod_to), Integer.valueOf(AV7CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A496ForUltUti = P00312_A496ForUltUti[0] ;
         n496ForUltUti = P00312_n496ForUltUti[0] ;
         A2749ForPro = P00312_A2749ForPro[0] ;
         n2749ForPro = P00312_n2749ForPro[0] ;
         A396EmprCod = P00312_A396EmprCod[0] ;
         A252CliCod = P00312_A252CliCod[0] ;
         A494ForSer = P00312_A494ForSer[0] ;
         A482ForColNom = P00312_A482ForColNom[0] ;
         A483ForColNum = P00312_A483ForColNum[0] ;
         A831TipColCod = P00312_A831TipColCod[0] ;
         A279CliNom = P00312_A279CliNom[0] ;
         A5742ForSerDsc = P00312_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P00312_n5742ForSerDsc[0] ;
         A486ForNumCol = P00312_A486ForNumCol[0] ;
         A279CliNom = P00312_A279CliNom[0] ;
         if ( new app.formulaciontinte.pkilequi2historico(remoteHandle, context).executeUdp( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod) == 0 )
         {
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A252CliCod ;
            GXv_char3[0] = A494ForSer ;
            GXv_char4[0] = A482ForColNom ;
            GXv_int5[0] = A483ForColNum ;
            GXv_int6[0] = A831TipColCod ;
            if ( new app.formulaciontinte.pkilequi2(remoteHandle, context).executeUdp( GXv_char1, GXv_int2, GXv_char3, GXv_char4, GXv_int5, GXv_int6) == 0 )
            {
               Gxm1eliminaciondeformulastinte_sdt = (app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)new app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT(remoteHandle, context);
               Gxm2rootcol.add(Gxm1eliminaciondeformulastinte_sdt, 0);
               Gxm1eliminaciondeformulastinte_sdt.setgxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod( A252CliCod );
               Gxm1eliminaciondeformulastinte_sdt.setgxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom( A279CliNom );
               Gxm1eliminaciondeformulastinte_sdt.setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forser( A494ForSer );
               Gxm1eliminaciondeformulastinte_sdt.setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc( A5742ForSerDsc );
               Gxm1eliminaciondeformulastinte_sdt.setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom( A482ForColNom );
               Gxm1eliminaciondeformulastinte_sdt.setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum( A483ForColNum );
               Gxm1eliminaciondeformulastinte_sdt.setgxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod( A831TipColCod );
               Gxm1eliminaciondeformulastinte_sdt.setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti( A496ForUltUti );
               Gxm1eliminaciondeformulastinte_sdt.setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro( A2749ForPro );
               Gxm1eliminaciondeformulastinte_sdt.setgxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol( A486ForNumCol );
               Gxm1eliminaciondeformulastinte_sdt.setgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod( 0 );
               Gxm1eliminaciondeformulastinte_sdt.setgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist( 0 );
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP13[0] = eliminaciondeformulastinte_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT>(app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT.class, "EliminaciondeFormulasTinte_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      A496ForUltUti = GXutil.nullDate() ;
      A2749ForPro = "" ;
      P00312_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P00312_n496ForUltUti = new boolean[] {false} ;
      P00312_A2749ForPro = new String[] {""} ;
      P00312_n2749ForPro = new boolean[] {false} ;
      P00312_A396EmprCod = new String[] {""} ;
      P00312_A252CliCod = new int[1] ;
      P00312_A494ForSer = new String[] {""} ;
      P00312_A482ForColNom = new String[] {""} ;
      P00312_A483ForColNum = new int[1] ;
      P00312_A831TipColCod = new byte[1] ;
      P00312_A279CliNom = new String[] {""} ;
      P00312_A5742ForSerDsc = new String[] {""} ;
      P00312_n5742ForSerDsc = new boolean[] {false} ;
      P00312_A486ForNumCol = new int[1] ;
      A279CliNom = "" ;
      A5742ForSerDsc = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      Gxm1eliminaciondeformulastinte_sdt = new app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.eliminaciondeformulastinte_dp__default(),
         new Object[] {
             new Object[] {
            P00312_A496ForUltUti, P00312_n496ForUltUti, P00312_A2749ForPro, P00312_n2749ForPro, P00312_A396EmprCod, P00312_A252CliCod, P00312_A494ForSer, P00312_A482ForColNom, P00312_A483ForColNum, P00312_A831TipColCod,
            P00312_A279CliNom, P00312_A5742ForSerDsc, P00312_n5742ForSerDsc, P00312_A486ForNumCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Tipcolcod ;
   private byte AV16TipColCod_to ;
   private byte A831TipColCod ;
   private byte GXv_int6[] ;
   private short AV19FlagFecn ;
   private short Gx_err ;
   private int AV7CliCod ;
   private int AV12CliCod_to ;
   private int AV10Forcolnum ;
   private int AV14Forcolnum_to ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private int GXv_int2[] ;
   private int GXv_int5[] ;
   private String AV5Emprcod ;
   private String AV8Forser ;
   private String AV15Forser_to ;
   private String AV9Forcolnom ;
   private String AV13Forcolnom_to ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private String A2749ForPro ;
   private String A279CliNom ;
   private String A5742ForSerDsc ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private java.util.Date AV6ForUltUti ;
   private java.util.Date A496ForUltUti ;
   private boolean n496ForUltUti ;
   private boolean n2749ForPro ;
   private boolean n5742ForSerDsc ;
   private GXBaseCollection<app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT>[] aP13 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P00312_A496ForUltUti ;
   private boolean[] P00312_n496ForUltUti ;
   private String[] P00312_A2749ForPro ;
   private boolean[] P00312_n2749ForPro ;
   private String[] P00312_A396EmprCod ;
   private int[] P00312_A252CliCod ;
   private String[] P00312_A494ForSer ;
   private String[] P00312_A482ForColNom ;
   private int[] P00312_A483ForColNum ;
   private byte[] P00312_A831TipColCod ;
   private String[] P00312_A279CliNom ;
   private String[] P00312_A5742ForSerDsc ;
   private boolean[] P00312_n5742ForSerDsc ;
   private int[] P00312_A486ForNumCol ;
   private GXBaseCollection<app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT> Gxm2rootcol ;
   private app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT Gxm1eliminaciondeformulastinte_sdt ;
}

final  class eliminaciondeformulastinte_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00312( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV16TipColCod_to ,
                                          byte AV11Tipcolcod ,
                                          int AV14Forcolnum_to ,
                                          int AV10Forcolnum ,
                                          String AV13Forcolnom_to ,
                                          String AV9Forcolnom ,
                                          String AV15Forser_to ,
                                          String AV8Forser ,
                                          int AV12CliCod_to ,
                                          int AV7CliCod ,
                                          byte A831TipColCod ,
                                          int A483ForColNum ,
                                          String A482ForColNom ,
                                          String A494ForSer ,
                                          int A252CliCod ,
                                          String A396EmprCod ,
                                          java.util.Date A496ForUltUti ,
                                          java.util.Date AV6ForUltUti ,
                                          String A2749ForPro ,
                                          String AV5Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[12];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.ForUltUti, T1.ForPro, T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T2.CliNom, T1.ForSerDsc, T1.ForNumCol FROM (TXPCFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForUltUti <= ? or (T1.ForUltUti = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.ForPro = 'N')");
      if ( ! (0==AV16TipColCod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      if ( ! (0==AV11Tipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( ! (0==AV14Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( ! (0==AV10Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int7[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int7[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV8Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int7[9] = (byte)(1) ;
      }
      if ( ! (0==AV12CliCod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int7[10] = (byte)(1) ;
      }
      if ( ! (0==AV7CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int7[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
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
                  return conditional_P00312(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00312", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 13);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[15]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
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
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               return;
      }
   }

}

