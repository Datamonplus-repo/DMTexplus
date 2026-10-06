package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class amrec_analisisdetallegraficadp extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      amrec_analisisdetallegraficadp pgm = new amrec_analisisdetallegraficadp (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      java.util.Date aP1 = GXutil.nullDate();
      java.util.Date aP2 = GXutil.nullDate();
      GXSimpleCollection<String> aP3 = new GXSimpleCollection<String>(String.class, "internal", "");
      GXSimpleCollection<String> aP4 = new GXSimpleCollection<String>(String.class, "internal", "");
      GXSimpleCollection<String> aP5 = new GXSimpleCollection<String>(String.class, "internal", "");
      GXSimpleCollection<Short> aP6 = new GXSimpleCollection<Short>(Short.class, "internal", "");
      boolean aP7 = false;
      String aP8 = "";
      String aP9 = "";
      java.util.Date aP10 = GXutil.nullDate();
      String aP11 = "";
      @SuppressWarnings("unchecked")
      GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>[] aP12 = new GXBaseCollection[] {new GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>()};

      try
      {
         aP0 = (String) args[0];
         aP1 = (java.util.Date) localUtil.ctot( args[1], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP2 = (java.util.Date) localUtil.ctot( args[2], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP7 = (boolean) GXutil.boolval( args[7]);
         aP8 = (String) args[8];
         aP9 = (String) args[9];
         aP10 = (java.util.Date) localUtil.ctot( args[10], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP11 = (String) args[11];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   public amrec_analisisdetallegraficadp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( amrec_analisisdetallegraficadp.class ), "" );
   }

   public amrec_analisisdetallegraficadp( int remoteHandle ,
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
      amrec_analisisdetallegraficadp.this.aP12 = new GXBaseCollection[] {new GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>()};
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
      amrec_analisisdetallegraficadp.this.AV5EmprCod = aP0;
      amrec_analisisdetallegraficadp.this.AV12Desde = aP1;
      amrec_analisisdetallegraficadp.this.AV14Hasta = aP2;
      amrec_analisisdetallegraficadp.this.AV9MaqCodCollection = aP3;
      amrec_analisisdetallegraficadp.this.AV6FasCodCollection = aP4;
      amrec_analisisdetallegraficadp.this.AV7HdrCollection = aP5;
      amrec_analisisdetallegraficadp.this.AV10ParFasCodCollection = aP6;
      amrec_analisisdetallegraficadp.this.AV13FueraRango = aP7;
      amrec_analisisdetallegraficadp.this.AV11UsurCod = aP8;
      amrec_analisisdetallegraficadp.this.AV8Ip = aP9;
      amrec_analisisdetallegraficadp.this.AV16Now = aP10;
      amrec_analisisdetallegraficadp.this.AV15MTkn = aP11;
      amrec_analisisdetallegraficadp.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14720MRPrMaqCod ,
                                           AV9MaqCodCollection ,
                                           A14719MRPrFasCod ,
                                           AV6FasCodCollection ,
                                           A14754MRPrHdr2 ,
                                           AV7HdrCollection ,
                                           Short.valueOf(A14750MRPrParCod) ,
                                           AV10ParFasCodCollection ,
                                           Integer.valueOf(AV9MaqCodCollection.size()) ,
                                           Integer.valueOf(AV6FasCodCollection.size()) ,
                                           Integer.valueOf(AV7HdrCollection.size()) ,
                                           Integer.valueOf(AV10ParFasCodCollection.size()) ,
                                           Boolean.valueOf(AV13FueraRango) ,
                                           Boolean.valueOf(A14722MRPrEr) ,
                                           A14753MRPrReg ,
                                           AV16Now ,
                                           A396EmprCod ,
                                           AV5EmprCod ,
                                           A14751MRPrUsu ,
                                           AV11UsurCod ,
                                           A14752MRPrIp ,
                                           AV8Ip ,
                                           A14756MRPrTkn ,
                                           AV15MTkn ,
                                           AV12Desde ,
                                           A14682MRPrFec ,
                                           AV14Hasta } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      /* Using cursor P00572 */
      pr_default.execute(0, new Object[] {AV12Desde, AV16Now, AV5EmprCod, AV11UsurCod, AV8Ip, AV15MTkn, AV14Hasta});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14756MRPrTkn = P00572_A14756MRPrTkn[0] ;
         A14753MRPrReg = P00572_A14753MRPrReg[0] ;
         A14752MRPrIp = P00572_A14752MRPrIp[0] ;
         A14751MRPrUsu = P00572_A14751MRPrUsu[0] ;
         A14722MRPrEr = P00572_A14722MRPrEr[0] ;
         A14750MRPrParCod = P00572_A14750MRPrParCod[0] ;
         A14754MRPrHdr2 = P00572_A14754MRPrHdr2[0] ;
         A14719MRPrFasCod = P00572_A14719MRPrFasCod[0] ;
         A14720MRPrMaqCod = P00572_A14720MRPrMaqCod[0] ;
         A14682MRPrFec = P00572_A14682MRPrFec[0] ;
         A396EmprCod = P00572_A396EmprCod[0] ;
         A14721MRPrVal = P00572_A14721MRPrVal[0] ;
         A14764MRPrValMin = P00572_A14764MRPrValMin[0] ;
         A14765MRPrValMax = P00572_A14765MRPrValMax[0] ;
         A14681MRPrId = P00572_A14681MRPrId[0] ;
         Gxm1mrec_alertagraficasdt = (app.ingenieria.SdtMRec_AlertaGraficaSDT)new app.ingenieria.SdtMRec_AlertaGraficaSDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1mrec_alertagraficasdt, 0);
         Gxm1mrec_alertagraficasdt.setgxTv_SdtMRec_AlertaGraficaSDT_Graficafecha( A14682MRPrFec );
         Gxm1mrec_alertagraficasdt.setgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_1( CommonUtil.decimalVal( A14721MRPrVal, ".") );
         Gxm1mrec_alertagraficasdt.setgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_2( CommonUtil.decimalVal( A14764MRPrValMin, ".") );
         Gxm1mrec_alertagraficasdt.setgxTv_SdtMRec_AlertaGraficaSDT_Mprecplc_3( CommonUtil.decimalVal( A14765MRPrValMax, ".") );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(mrec_analisisdetallegraficadp.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP12[0] = amrec_analisisdetallegraficadp.this.Gxm2rootcol;
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
      A14720MRPrMaqCod = "" ;
      A14719MRPrFasCod = "" ;
      A14754MRPrHdr2 = "" ;
      A14753MRPrReg = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A14751MRPrUsu = "" ;
      A14752MRPrIp = "" ;
      A14756MRPrTkn = "" ;
      A14682MRPrFec = GXutil.resetTime( GXutil.nullDate() );
      P00572_A14756MRPrTkn = new String[] {""} ;
      P00572_A14753MRPrReg = new java.util.Date[] {GXutil.nullDate()} ;
      P00572_A14752MRPrIp = new String[] {""} ;
      P00572_A14751MRPrUsu = new String[] {""} ;
      P00572_A14722MRPrEr = new boolean[] {false} ;
      P00572_A14750MRPrParCod = new short[1] ;
      P00572_A14754MRPrHdr2 = new String[] {""} ;
      P00572_A14719MRPrFasCod = new String[] {""} ;
      P00572_A14720MRPrMaqCod = new String[] {""} ;
      P00572_A14682MRPrFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00572_A396EmprCod = new String[] {""} ;
      P00572_A14721MRPrVal = new String[] {""} ;
      P00572_A14764MRPrValMin = new String[] {""} ;
      P00572_A14765MRPrValMax = new String[] {""} ;
      P00572_A14681MRPrId = new long[1] ;
      A14721MRPrVal = "" ;
      A14764MRPrValMin = "" ;
      A14765MRPrValMax = "" ;
      Gxm1mrec_alertagraficasdt = new app.ingenieria.SdtMRec_AlertaGraficaSDT(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.amrec_analisisdetallegraficadp__default(),
         new Object[] {
             new Object[] {
            P00572_A14756MRPrTkn, P00572_A14753MRPrReg, P00572_A14752MRPrIp, P00572_A14751MRPrUsu, P00572_A14722MRPrEr, P00572_A14750MRPrParCod, P00572_A14754MRPrHdr2, P00572_A14719MRPrFasCod, P00572_A14720MRPrMaqCod, P00572_A14682MRPrFec,
            P00572_A396EmprCod, P00572_A14721MRPrVal, P00572_A14764MRPrValMin, P00572_A14765MRPrValMax, P00572_A14681MRPrId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A14750MRPrParCod ;
   private short Gx_err ;
   private int AV9MaqCodCollection_size ;
   private int AV6FasCodCollection_size ;
   private int AV7HdrCollection_size ;
   private int AV10ParFasCodCollection_size ;
   private long A14681MRPrId ;
   private String AV5EmprCod ;
   private String AV11UsurCod ;
   private String scmdbuf ;
   private String A14720MRPrMaqCod ;
   private String A14719MRPrFasCod ;
   private String A396EmprCod ;
   private String A14751MRPrUsu ;
   private String A14721MRPrVal ;
   private String A14764MRPrValMin ;
   private String A14765MRPrValMax ;
   private java.util.Date AV12Desde ;
   private java.util.Date AV14Hasta ;
   private java.util.Date AV16Now ;
   private java.util.Date A14753MRPrReg ;
   private java.util.Date A14682MRPrFec ;
   private boolean AV13FueraRango ;
   private boolean A14722MRPrEr ;
   private String AV8Ip ;
   private String AV15MTkn ;
   private String A14754MRPrHdr2 ;
   private String A14752MRPrIp ;
   private String A14756MRPrTkn ;
   private GXSimpleCollection<Short> AV10ParFasCodCollection ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT>[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P00572_A14756MRPrTkn ;
   private java.util.Date[] P00572_A14753MRPrReg ;
   private String[] P00572_A14752MRPrIp ;
   private String[] P00572_A14751MRPrUsu ;
   private boolean[] P00572_A14722MRPrEr ;
   private short[] P00572_A14750MRPrParCod ;
   private String[] P00572_A14754MRPrHdr2 ;
   private String[] P00572_A14719MRPrFasCod ;
   private String[] P00572_A14720MRPrMaqCod ;
   private java.util.Date[] P00572_A14682MRPrFec ;
   private String[] P00572_A396EmprCod ;
   private String[] P00572_A14721MRPrVal ;
   private String[] P00572_A14764MRPrValMin ;
   private String[] P00572_A14765MRPrValMax ;
   private long[] P00572_A14681MRPrId ;
   private GXSimpleCollection<String> AV9MaqCodCollection ;
   private GXSimpleCollection<String> AV6FasCodCollection ;
   private GXSimpleCollection<String> AV7HdrCollection ;
   private GXBaseCollection<app.ingenieria.SdtMRec_AlertaGraficaSDT> Gxm2rootcol ;
   private app.ingenieria.SdtMRec_AlertaGraficaSDT Gxm1mrec_alertagraficasdt ;
}

final  class amrec_analisisdetallegraficadp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00572( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14720MRPrMaqCod ,
                                          GXSimpleCollection<String> AV9MaqCodCollection ,
                                          String A14719MRPrFasCod ,
                                          GXSimpleCollection<String> AV6FasCodCollection ,
                                          String A14754MRPrHdr2 ,
                                          GXSimpleCollection<String> AV7HdrCollection ,
                                          short A14750MRPrParCod ,
                                          GXSimpleCollection<Short> AV10ParFasCodCollection ,
                                          int AV9MaqCodCollection_size ,
                                          int AV6FasCodCollection_size ,
                                          int AV7HdrCollection_size ,
                                          int AV10ParFasCodCollection_size ,
                                          boolean AV13FueraRango ,
                                          boolean A14722MRPrEr ,
                                          java.util.Date A14753MRPrReg ,
                                          java.util.Date AV16Now ,
                                          String A396EmprCod ,
                                          String AV5EmprCod ,
                                          String A14751MRPrUsu ,
                                          String AV11UsurCod ,
                                          String A14752MRPrIp ,
                                          String AV8Ip ,
                                          String A14756MRPrTkn ,
                                          String AV15MTkn ,
                                          java.util.Date AV12Desde ,
                                          java.util.Date A14682MRPrFec ,
                                          java.util.Date AV14Hasta )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[7];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT MRPrTkn, MRPrReg, MRPrIp, MRPrUsu, MRPrEr, MRPrParCod, MRPrHdr2, MRPrFasCod, MRPrMaqCod, MRPrFec, EmprCod, MRPrVal, MRPrValMin, MRPrValMax, MRPrId FROM MRPr" ;
      addWhere(sWhereString, "(MRPrFec >= ?)");
      addWhere(sWhereString, "(MRPrReg >= ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(MRPrUsu = ?)");
      addWhere(sWhereString, "(MRPrIp = ?)");
      addWhere(sWhereString, "(MRPrTkn = ?)");
      addWhere(sWhereString, "(MRPrFec <= ?)");
      if ( AV9MaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV9MaqCodCollection, "MRPrMaqCod IN (", ")")+")");
      }
      if ( AV6FasCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV6FasCodCollection, "MRPrFasCod IN (", ")")+")");
      }
      if ( AV7HdrCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV7HdrCollection, "MRPrHdr2 IN (", ")")+")");
      }
      if ( AV10ParFasCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV10ParFasCodCollection, "MRPrParCod IN (", ")")+")");
      }
      if ( AV13FueraRango )
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
                  return conditional_P00572(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (GXSimpleCollection<Short>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Boolean) dynConstraints[12]).booleanValue() , ((Boolean) dynConstraints[13]).booleanValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00572", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
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

