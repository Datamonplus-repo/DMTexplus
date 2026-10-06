package app.ingenieria ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mrec_analisisdp_v2 extends GXProcedure
{
   public mrec_analisisdp_v2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_analisisdp_v2.class ), "" );
   }

   public mrec_analisisdp_v2( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT> executeUdp( String aP0 ,
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
                                                                                byte aP12 )
   {
      mrec_analisisdp_v2.this.aP13 = new GXBaseCollection[] {new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
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
                        byte aP12 ,
                        GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT>[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
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
                             byte aP12 ,
                             GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT>[] aP13 )
   {
      mrec_analisisdp_v2.this.AV6EmprCod = aP0;
      mrec_analisisdp_v2.this.AV5Desde = aP1;
      mrec_analisisdp_v2.this.AV9Hasta = aP2;
      mrec_analisisdp_v2.this.AV12MaqCodCollection = aP3;
      mrec_analisisdp_v2.this.AV7FasCodCollection = aP4;
      mrec_analisisdp_v2.this.AV10HdrCollection = aP5;
      mrec_analisisdp_v2.this.AV14ParFasCodCollection = aP6;
      mrec_analisisdp_v2.this.AV8FueraRango = aP7;
      mrec_analisisdp_v2.this.AV15UsurCod = aP8;
      mrec_analisisdp_v2.this.AV11Ip = aP9;
      mrec_analisisdp_v2.this.AV16Now = aP10;
      mrec_analisisdp_v2.this.AV17MTkn = aP11;
      mrec_analisisdp_v2.this.AV18Espacios = aP12;
      mrec_analisisdp_v2.this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV12MaqCodCollection ,
                                           A14719MRPrFasCod ,
                                           AV7FasCodCollection ,
                                           A14755MRPrHdr ,
                                           AV10HdrCollection ,
                                           A14754MRPrHdr2 ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           AV14ParFasCodCollection ,
                                           Integer.valueOf(AV12MaqCodCollection.size()) ,
                                           Integer.valueOf(AV7FasCodCollection.size()) ,
                                           Integer.valueOf(AV10HdrCollection.size()) ,
                                           Byte.valueOf(AV18Espacios) ,
                                           Integer.valueOf(AV14ParFasCodCollection.size()) ,
                                           Boolean.valueOf(AV8FueraRango) ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14753MRPrReg ,
                                           AV16Now ,
                                           A396EmprCod ,
                                           AV6EmprCod ,
                                           A14751MRPrUsu ,
                                           AV15UsurCod ,
                                           A14752MRPrIp ,
                                           AV11Ip ,
                                           A14756MRPrTkn ,
                                           AV17MTkn ,
                                           AV5Desde ,
                                           A14682MRPrFec ,
                                           AV9Hasta } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      /* Using cursor P005C2 */
      pr_default.execute(0, new Object[] {AV5Desde, AV16Now, AV6EmprCod, AV15UsurCod, AV11Ip, AV17MTkn, AV9Hasta});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14756MRPrTkn = P005C2_A14756MRPrTkn[0] ;
         A14753MRPrReg = P005C2_A14753MRPrReg[0] ;
         A14752MRPrIp = P005C2_A14752MRPrIp[0] ;
         A14751MRPrUsu = P005C2_A14751MRPrUsu[0] ;
         A14722MRPrEr = P005C2_A14722MRPrEr[0] ;
         A14750MRPrParCod = P005C2_A14750MRPrParCod[0] ;
         A14754MRPrHdr2 = P005C2_A14754MRPrHdr2[0] ;
         A14755MRPrHdr = P005C2_A14755MRPrHdr[0] ;
         A14719MRPrFasCod = P005C2_A14719MRPrFasCod[0] ;
         A14720MRPrMaqCod = P005C2_A14720MRPrMaqCod[0] ;
         A14682MRPrFec = P005C2_A14682MRPrFec[0] ;
         A396EmprCod = P005C2_A396EmprCod[0] ;
         A14723MRPrParId = P005C2_A14723MRPrParId[0] ;
         A14758MRPrParDsc = P005C2_A14758MRPrParDsc[0] ;
         A14721MRPrVal = P005C2_A14721MRPrVal[0] ;
         A14681MRPrId = P005C2_A14681MRPrId[0] ;
         Gxm1mrec_analisislineasdt = (app.ingenieria.SdtMRec_AnalisisLineaSDT)new app.ingenieria.SdtMRec_AnalisisLineaSDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1mrec_analisislineasdt, 0);
         Gxm1mrec_analisislineasdt.setgxTv_SdtMRec_AnalisisLineaSDT_Mrprfec( A14682MRPrFec );
         Gxm1mrec_analisislineasdt.setgxTv_SdtMRec_AnalisisLineaSDT_Mrprparid( A14723MRPrParId );
         Gxm1mrec_analisislineasdt.setgxTv_SdtMRec_AnalisisLineaSDT_Mrprpardsc( A14758MRPrParDsc );
         Gxm1mrec_analisislineasdt.setgxTv_SdtMRec_AnalisisLineaSDT_Mrprval( A14721MRPrVal );
         Gxm1mrec_analisislineasdt.setgxTv_SdtMRec_AnalisisLineaSDT_Mrprer( A14722MRPrEr );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP13[0] = mrec_analisisdp_v2.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT>(app.ingenieria.SdtMRec_AnalisisLineaSDT.class, "MRec_AnalisisLineaSDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A14720MRPrMaqCod = "" ;
      A14719MRPrFasCod = "" ;
      A14755MRPrHdr = "" ;
      A14754MRPrHdr2 = "" ;
      A14753MRPrReg = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A14751MRPrUsu = "" ;
      A14752MRPrIp = "" ;
      A14756MRPrTkn = "" ;
      A14682MRPrFec = GXutil.resetTime( GXutil.nullDate() );
      P005C2_A14756MRPrTkn = new String[] {""} ;
      P005C2_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P005C2_A14752MRPrIp = new String[] {""} ;
      P005C2_A14751MRPrUsu = new String[] {""} ;
      P005C2_A14722MRPrEr = new boolean[] {false} ;
      P005C2_A14750MRPrParCod = new short[1] ;
      P005C2_A14754MRPrHdr2 = new String[] {""} ;
      P005C2_A14755MRPrHdr = new String[] {""} ;
      P005C2_A14719MRPrFasCod = new String[] {""} ;
      P005C2_A14720MRPrMaqCod = new String[] {""} ;
      P005C2_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P005C2_A396EmprCod = new String[] {""} ;
      P005C2_A14723MRPrParId = new long[1] ;
      P005C2_A14758MRPrParDsc = new String[] {""} ;
      P005C2_A14721MRPrVal = new String[] {""} ;
      P005C2_A14681MRPrId = new long[1] ;
      A14758MRPrParDsc = "" ;
      A14721MRPrVal = "" ;
      Gxm1mrec_analisislineasdt = new app.ingenieria.SdtMRec_AnalisisLineaSDT(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec_analisisdp_v2__default(),
         new Object[] {
             new Object[] {
            P005C2_A14756MRPrTkn, P005C2_A14753MRPrReg, P005C2_A14752MRPrIp, P005C2_A14751MRPrUsu, P005C2_A14722MRPrEr, P005C2_A14750MRPrParCod, P005C2_A14754MRPrHdr2, P005C2_A14755MRPrHdr, P005C2_A14719MRPrFasCod, P005C2_A14720MRPrMaqCod,
            P005C2_A14682MRPrFec, P005C2_A396EmprCod, P005C2_A14723MRPrParId, P005C2_A14758MRPrParDsc, P005C2_A14721MRPrVal, P005C2_A14681MRPrId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18Espacios ;
   private short A14750MRPrParCod ;
   private short Gx_err ;
   private int AV12MaqCodCollection_size ;
   private int AV7FasCodCollection_size ;
   private int AV10HdrCollection_size ;
   private int AV14ParFasCodCollection_size ;
   private long A14723MRPrParId ;
   private long A14681MRPrId ;
   private String AV6EmprCod ;
   private String AV15UsurCod ;
   private String scmdbuf ;
   private String A14720MRPrMaqCod ;
   private String A14719MRPrFasCod ;
   private String A14755MRPrHdr ;
   private String A396EmprCod ;
   private String A14751MRPrUsu ;
   private String A14721MRPrVal ;
   private java.util.Date AV5Desde ;
   private java.util.Date AV9Hasta ;
   private java.util.Date AV16Now ;
   private java.util.Date A14753MRPrReg ;
   private java.util.Date A14682MRPrFec ;
   private boolean AV8FueraRango ;
   private boolean A14722MRPrEr ;
   private String AV11Ip ;
   private String AV17MTkn ;
   private String A14754MRPrHdr2 ;
   private String A14752MRPrIp ;
   private String A14756MRPrTkn ;
   private String A14758MRPrParDsc ;
   private GXSimpleCollection<Short> AV14ParFasCodCollection ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT>[] aP13 ;
   private IDataStoreProvider pr_default ;
   private String[] P005C2_A14756MRPrTkn ;
   private java.util.Date[] P005C2_A14753MRPrReg ;
   private String[] P005C2_A14752MRPrIp ;
   private String[] P005C2_A14751MRPrUsu ;
   private boolean[] P005C2_A14722MRPrEr ;
   private short[] P005C2_A14750MRPrParCod ;
   private String[] P005C2_A14754MRPrHdr2 ;
   private String[] P005C2_A14755MRPrHdr ;
   private String[] P005C2_A14719MRPrFasCod ;
   private String[] P005C2_A14720MRPrMaqCod ;
   private java.util.Date[] P005C2_A14682MRPrFec ;
   private String[] P005C2_A396EmprCod ;
   private long[] P005C2_A14723MRPrParId ;
   private String[] P005C2_A14758MRPrParDsc ;
   private String[] P005C2_A14721MRPrVal ;
   private long[] P005C2_A14681MRPrId ;
   private GXSimpleCollection<String> AV12MaqCodCollection ;
   private GXSimpleCollection<String> AV7FasCodCollection ;
   private GXSimpleCollection<String> AV10HdrCollection ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AnalisisLineaSDT> Gxm2rootcol ;
   private app.ingenieria.SdtMRec_AnalisisLineaSDT Gxm1mrec_analisislineasdt ;
}

final  class mrec_analisisdp_v2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P005C2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14720MRPrMaqCod ,
                                          GXSimpleCollection<String> AV12MaqCodCollection ,
                                          String A14719MRPrFasCod ,
                                          GXSimpleCollection<String> AV7FasCodCollection ,
                                          String A14755MRPrHdr ,
                                          GXSimpleCollection<String> AV10HdrCollection ,
                                          String A14754MRPrHdr2 ,
                                          short A14750MRPrParCod ,
                                          GXSimpleCollection<Short> AV14ParFasCodCollection ,
                                          int AV12MaqCodCollection_size ,
                                          int AV7FasCodCollection_size ,
                                          int AV10HdrCollection_size ,
                                          byte AV18Espacios ,
                                          int AV14ParFasCodCollection_size ,
                                          boolean AV8FueraRango ,
                                          boolean A14722MRPrEr ,
                                          java.util.Date A14753MRPrReg ,
                                          java.util.Date AV16Now ,
                                          String A396EmprCod ,
                                          String AV6EmprCod ,
                                          String A14751MRPrUsu ,
                                          String AV15UsurCod ,
                                          String A14752MRPrIp ,
                                          String AV11Ip ,
                                          String A14756MRPrTkn ,
                                          String AV17MTkn ,
                                          java.util.Date AV5Desde ,
                                          java.util.Date A14682MRPrFec ,
                                          java.util.Date AV9Hasta )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[7];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT MRPrTkn, MRPrReg, MRPrIp, MRPrUsu, MRPrEr, MRPrParCod, MRPrHdr2, MRPrHdr, MRPrFasCod, MRPrMaqCod, MRPrFec, EmprCod, MRPrParId, MRPrParDsc, MRPrVal, MRPrId" ;
      scmdbuf += " FROM MRPr" ;
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      if ( AV12MaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV12MaqCodCollection, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV7FasCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV7FasCodCollection, "MRPrFasCod IN (", ")")+")");
      }
      if ( ( AV10HdrCollection_size > 0 ) && ( AV18Espacios == 1 ) )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV10HdrCollection, "MRPrHdr IN (", ")")+")");
      }
      if ( ( AV10HdrCollection_size > 0 ) && ( AV18Espacios == 2 ) )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV10HdrCollection, "MRPrHdr2 IN (", ")")+")");
      }
      if ( AV14ParFasCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV14ParFasCodCollection, "MRPrParCod IN (", ")")+")");
      }
      if ( AV8FueraRango )
      {
         addWhere(sWhereString, "(MRPrEr = 1)");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MRPrFec" ;
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
                  return conditional_P005C2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).intValue() , ((Boolean) dynConstraints[14]).booleanValue() , ((Boolean) dynConstraints[15]).booleanValue() , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005C2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[7])[0] = rslt.getString(8, 10);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((long[]) buf[12])[0] = rslt.getLong(13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 12);
               ((long[]) buf[15])[0] = rslt.getLong(16);
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[7], false);
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               return;
      }
   }

}

