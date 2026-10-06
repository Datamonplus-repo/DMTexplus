package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrec_alertadp extends GXProcedure
{
   public mrec_alertadp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_alertadp.class ), "" );
   }

   public mrec_alertadp( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT> executeUdp( String aP0 ,
                                                                                java.util.Date aP1 ,
                                                                                java.util.Date aP2 ,
                                                                                GXSimpleCollection<String> aP3 ,
                                                                                GXSimpleCollection<String> aP4 ,
                                                                                GXSimpleCollection<String> aP5 ,
                                                                                GXSimpleCollection<Short> aP6 ,
                                                                                boolean aP7 ,
                                                                                String aP8 ,
                                                                                String aP9 ,
                                                                                java.util.Date aP10 ,
                                                                                String aP11 )
   {
      mrec_alertadp.this.aP12 = new GXBaseCollection[] {new GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        GXSimpleCollection<String> aP3 ,
                        GXSimpleCollection<String> aP4 ,
                        GXSimpleCollection<String> aP5 ,
                        GXSimpleCollection<Short> aP6 ,
                        boolean aP7 ,
                        String aP8 ,
                        String aP9 ,
                        java.util.Date aP10 ,
                        String aP11 ,
                        GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             GXSimpleCollection<String> aP3 ,
                             GXSimpleCollection<String> aP4 ,
                             GXSimpleCollection<String> aP5 ,
                             GXSimpleCollection<Short> aP6 ,
                             boolean aP7 ,
                             String aP8 ,
                             String aP9 ,
                             java.util.Date aP10 ,
                             String aP11 ,
                             GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>[] aP12 )
   {
      mrec_alertadp.this.AV5EmprCod = aP0;
      mrec_alertadp.this.AV12Desde = aP1;
      mrec_alertadp.this.AV14Hasta = aP2;
      mrec_alertadp.this.AV9MaqCodCollection = aP3;
      mrec_alertadp.this.AV6FasCodCollection = aP4;
      mrec_alertadp.this.AV7HdrCollection = aP5;
      mrec_alertadp.this.AV10ParFasCodCollection = aP6;
      mrec_alertadp.this.AV13FueraRango = aP7;
      mrec_alertadp.this.AV11UsurCod = aP8;
      mrec_alertadp.this.AV8Ip = aP9;
      mrec_alertadp.this.AV16Now = aP10;
      mrec_alertadp.this.AV15MTkn = aP11;
      mrec_alertadp.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14724MAleMaqCod ,
                                           AV9MaqCodCollection ,
                                           A14725MAleFasCod ,
                                           AV6FasCodCollection ,
                                           A14736MAleHdr2 ,
                                           AV7HdrCollection ,
                                           Short.valueOf(A14726MAleParCod) ,
                                           AV10ParFasCodCollection ,
                                           Integer.valueOf(AV9MaqCodCollection.size()) ,
                                           Integer.valueOf(AV6FasCodCollection.size()) ,
                                           Integer.valueOf(AV7HdrCollection.size()) ,
                                           Integer.valueOf(AV10ParFasCodCollection.size()) ,
                                           Boolean.valueOf(AV13FueraRango) ,
                                           Boolean.valueOf(A14727MAleEr) ,
                                           A14731MAleReg ,
                                           AV16Now ,
                                           A14732MAleEmprCo ,
                                           AV5EmprCod ,
                                           A14729MAleUsu ,
                                           AV11UsurCod ,
                                           A14730MAleIp ,
                                           AV8Ip ,
                                           A14735MAleTkn ,
                                           AV15MTkn ,
                                           AV12Desde ,
                                           A14678MAleFec ,
                                           AV14Hasta } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      /* Using cursor P00552 */
      pr_default.execute(0, new Object[] {AV12Desde, AV16Now, AV5EmprCod, AV11UsurCod, AV8Ip, AV15MTkn, AV14Hasta});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14735MAleTkn = P00552_A14735MAleTkn[0] ;
         A14731MAleReg = P00552_A14731MAleReg[0] ;
         A14730MAleIp = P00552_A14730MAleIp[0] ;
         A14729MAleUsu = P00552_A14729MAleUsu[0] ;
         A14727MAleEr = P00552_A14727MAleEr[0] ;
         A14726MAleParCod = P00552_A14726MAleParCod[0] ;
         A14736MAleHdr2 = P00552_A14736MAleHdr2[0] ;
         A14725MAleFasCod = P00552_A14725MAleFasCod[0] ;
         A14724MAleMaqCod = P00552_A14724MAleMaqCod[0] ;
         A14678MAleFec = P00552_A14678MAleFec[0] ;
         A14732MAleEmprCo = P00552_A14732MAleEmprCo[0] ;
         A14728MAleVal = P00552_A14728MAleVal[0] ;
         A14734MAleValMax = P00552_A14734MAleValMax[0] ;
         A14733MAleValMin = P00552_A14733MAleValMin[0] ;
         A14677MAleId = P00552_A14677MAleId[0] ;
         Gxm1mrec_alertagraficasdt = (app.ingenieria.SdtMRec_AlertaGraficaSDT)new app.ingenieria.SdtMRec_AlertaGraficaSDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1mrec_alertagraficasdt, 0);
         Gxm1mrec_alertagraficasdt.setgxTv_SdtMRec_AlertaGraficaSDT_Graficafecha( A14678MAleFec );
         Gxm1mrec_alertagraficasdt.setgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1( CommonUtil.decimalVal( A14728MAleVal, ".") );
         Gxm1mrec_alertagraficasdt.setgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2( CommonUtil.decimalVal( A14734MAleValMax, ".") );
         Gxm1mrec_alertagraficasdt.setgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3( CommonUtil.decimalVal( A14733MAleValMin, ".") );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP12[0] = mrec_alertadp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>(app.ingenieria.SdtMRec_AlertaGraficaSDT.class, "MRec_AlertaGraficaSDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A14724MAleMaqCod = "" ;
      A14725MAleFasCod = "" ;
      A14736MAleHdr2 = "" ;
      A14731MAleReg = GXutil.resetTime( GXutil.nullDate() );
      A14732MAleEmprCo = "" ;
      A14729MAleUsu = "" ;
      A14730MAleIp = "" ;
      A14735MAleTkn = "" ;
      A14678MAleFec = GXutil.resetTime( GXutil.nullDate() );
      P00552_A14735MAleTkn = new String[] {""} ;
      P00552_A14731MAleReg = new java.util.Date[] {GXutil.nullDate()} ;
      P00552_A14730MAleIp = new String[] {""} ;
      P00552_A14729MAleUsu = new String[] {""} ;
      P00552_A14727MAleEr = new boolean[] {false} ;
      P00552_A14726MAleParCod = new short[1] ;
      P00552_A14736MAleHdr2 = new String[] {""} ;
      P00552_A14725MAleFasCod = new String[] {""} ;
      P00552_A14724MAleMaqCod = new String[] {""} ;
      P00552_A14678MAleFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00552_A14732MAleEmprCo = new String[] {""} ;
      P00552_A14728MAleVal = new String[] {""} ;
      P00552_A14734MAleValMax = new String[] {""} ;
      P00552_A14733MAleValMin = new String[] {""} ;
      P00552_A14677MAleId = new long[1] ;
      A14728MAleVal = "" ;
      A14734MAleValMax = "" ;
      A14733MAleValMin = "" ;
      Gxm1mrec_alertagraficasdt = new app.ingenieria.SdtMRec_AlertaGraficaSDT(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_alertadp__default(),
         new Object[] {
             new Object[] {
            P00552_A14735MAleTkn, P00552_A14731MAleReg, P00552_A14730MAleIp, P00552_A14729MAleUsu, P00552_A14727MAleEr, P00552_A14726MAleParCod, P00552_A14736MAleHdr2, P00552_A14725MAleFasCod, P00552_A14724MAleMaqCod, P00552_A14678MAleFec,
            P00552_A14732MAleEmprCo, P00552_A14728MAleVal, P00552_A14734MAleValMax, P00552_A14733MAleValMin, P00552_A14677MAleId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A14726MAleParCod ;
   private short Gx_err ;
   private int AV9MaqCodCollection_size ;
   private int AV6FasCodCollection_size ;
   private int AV7HdrCollection_size ;
   private int AV10ParFasCodCollection_size ;
   private long A14677MAleId ;
   private String AV5EmprCod ;
   private String AV11UsurCod ;
   private String scmdbuf ;
   private String A14724MAleMaqCod ;
   private String A14725MAleFasCod ;
   private String A14732MAleEmprCo ;
   private String A14729MAleUsu ;
   private String A14728MAleVal ;
   private String A14734MAleValMax ;
   private String A14733MAleValMin ;
   private java.util.Date AV12Desde ;
   private java.util.Date AV14Hasta ;
   private java.util.Date AV16Now ;
   private java.util.Date A14731MAleReg ;
   private java.util.Date A14678MAleFec ;
   private boolean AV13FueraRango ;
   private boolean A14727MAleEr ;
   private String AV8Ip ;
   private String AV15MTkn ;
   private String A14736MAleHdr2 ;
   private String A14730MAleIp ;
   private String A14735MAleTkn ;
   private GXSimpleCollection<Short> AV10ParFasCodCollection ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P00552_A14735MAleTkn ;
   private java.util.Date[] P00552_A14731MAleReg ;
   private String[] P00552_A14730MAleIp ;
   private String[] P00552_A14729MAleUsu ;
   private boolean[] P00552_A14727MAleEr ;
   private short[] P00552_A14726MAleParCod ;
   private String[] P00552_A14736MAleHdr2 ;
   private String[] P00552_A14725MAleFasCod ;
   private String[] P00552_A14724MAleMaqCod ;
   private java.util.Date[] P00552_A14678MAleFec ;
   private String[] P00552_A14732MAleEmprCo ;
   private String[] P00552_A14728MAleVal ;
   private String[] P00552_A14734MAleValMax ;
   private String[] P00552_A14733MAleValMin ;
   private long[] P00552_A14677MAleId ;
   private GXSimpleCollection<String> AV9MaqCodCollection ;
   private GXSimpleCollection<String> AV6FasCodCollection ;
   private GXSimpleCollection<String> AV7HdrCollection ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT> Gxm2rootcol ;
   private app.ingenieria.SdtMRec_AlertaGraficaSDT Gxm1mrec_alertagraficasdt ;
}

final  class mrec_alertadp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00552( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14724MAleMaqCod ,
                                          GXSimpleCollection<String> AV9MaqCodCollection ,
                                          String A14725MAleFasCod ,
                                          GXSimpleCollection<String> AV6FasCodCollection ,
                                          String A14736MAleHdr2 ,
                                          GXSimpleCollection<String> AV7HdrCollection ,
                                          short A14726MAleParCod ,
                                          GXSimpleCollection<Short> AV10ParFasCodCollection ,
                                          int AV9MaqCodCollection_size ,
                                          int AV6FasCodCollection_size ,
                                          int AV7HdrCollection_size ,
                                          int AV10ParFasCodCollection_size ,
                                          boolean AV13FueraRango ,
                                          boolean A14727MAleEr ,
                                          java.util.Date A14731MAleReg ,
                                          java.util.Date AV16Now ,
                                          String A14732MAleEmprCo ,
                                          String AV5EmprCod ,
                                          String A14729MAleUsu ,
                                          String AV11UsurCod ,
                                          String A14730MAleIp ,
                                          String AV8Ip ,
                                          String A14735MAleTkn ,
                                          String AV15MTkn ,
                                          java.util.Date AV12Desde ,
                                          java.util.Date A14678MAleFec ,
                                          java.util.Date AV14Hasta )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[7];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT MAleTkn, MAleReg, MAleIp, MAleUsu, MAleEr, MAleParCod, MAleHdr2, MAleFasCod, MAleMaqCod, MAleFec, MAleEmprCo, MAleVal, MAleValMax, MAleValMin, MAleId FROM" ;
      scmdbuf += " MAle" ;
      addWhere(sWhereString, "(MAleFec >= ?)");
      addWhere(sWhereString, "(MAleReg >= ?)");
      addWhere(sWhereString, "(MAleEmprCo = ?)");
      addWhere(sWhereString, "(MAleUsu = ?)");
      addWhere(sWhereString, "(MAleIp = ?)");
      addWhere(sWhereString, "(MAleTkn = ?)");
      addWhere(sWhereString, "(MAleFec <= ?)");
      if ( AV9MaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV9MaqCodCollection, "MAleMaqCod IN (", ")")+")");
      }
      if ( AV6FasCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV6FasCodCollection, "MAleFasCod IN (", ")")+")");
      }
      if ( AV7HdrCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV7HdrCollection, "MAleHdr2 IN (", ")")+")");
      }
      if ( AV10ParFasCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV10ParFasCodCollection, "MAleParCod IN (", ")")+")");
      }
      if ( AV13FueraRango )
      {
         addWhere(sWhereString, "(MAleEr = 1)");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MAleFec" ;
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
                  return conditional_P00552(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Boolean) dynConstraints[12]).booleanValue() , ((Boolean) dynConstraints[13]).booleanValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00552", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2, true);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.getBoolean(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10, true);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((String[]) buf[11])[0] = rslt.getString(12, 12);
               ((String[]) buf[12])[0] = rslt.getString(13, 12);
               ((String[]) buf[13])[0] = rslt.getString(14, 12);
               ((long[]) buf[14])[0] = rslt.getLong(15);
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[7], false, true);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[8], false, true);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 256);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false, true);
               }
               return;
      }
   }

}

