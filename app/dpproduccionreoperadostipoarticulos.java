package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpproduccionreoperadostipoarticulos extends GXProcedure
{
   public dpproduccionreoperadostipoarticulos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpproduccionreoperadostipoarticulos.class ), "" );
   }

   public dpproduccionreoperadostipoarticulos( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTResumenTipoArticulo> executeUdp( String aP0 ,
                                                                      String aP1 ,
                                                                      String aP2 ,
                                                                      java.util.Date aP3 ,
                                                                      java.util.Date aP4 ,
                                                                      byte aP5 )
   {
      dpproduccionreoperadostipoarticulos.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTResumenTipoArticulo>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        byte aP5 ,
                        GXBaseCollection<app.SdtSDTResumenTipoArticulo>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             byte aP5 ,
                             GXBaseCollection<app.SdtSDTResumenTipoArticulo>[] aP6 )
   {
      dpproduccionreoperadostipoarticulos.this.AV6Emprcod = aP0;
      dpproduccionreoperadostipoarticulos.this.AV11MaqCodInicial = aP1;
      dpproduccionreoperadostipoarticulos.this.AV10MaqCodFinal = aP2;
      dpproduccionreoperadostipoarticulos.this.AV9Hisprodti = aP3;
      dpproduccionreoperadostipoarticulos.this.AV8HisProdtf = aP4;
      dpproduccionreoperadostipoarticulos.this.AV5HisProReo = aP5;
      dpproduccionreoperadostipoarticulos.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV11MaqCodInicial ,
                                           AV10MaqCodFinal ,
                                           AV9Hisprodti ,
                                           AV8HisProdtf ,
                                           Byte.valueOf(AV5HisProReo) ,
                                           A602MaqCod ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Short.valueOf(A656ParCod) ,
                                           AV6Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P001L2 */
      pr_default.execute(0, new Object[] {AV6Emprcod, AV11MaqCodInicial, AV10MaqCodFinal, AV9Hisprodti, AV8HisProdtf, Byte.valueOf(AV5HisProReo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1L2 = false ;
         A129BarCod = P001L2_A129BarCod[0] ;
         A132BarCodReo = P001L2_A132BarCodReo[0] ;
         A130BarCodPar = P001L2_A130BarCodPar[0] ;
         A361DisCod = P001L2_A361DisCod[0] ;
         A966PartCod = P001L2_A966PartCod[0] ;
         n966PartCod = P001L2_n966PartCod[0] ;
         A252CliCod = P001L2_A252CliCod[0] ;
         n252CliCod = P001L2_n252CliCod[0] ;
         A829TipArtCod = P001L2_A829TipArtCod[0] ;
         n829TipArtCod = P001L2_n829TipArtCod[0] ;
         A396EmprCod = P001L2_A396EmprCod[0] ;
         A2247HisProTip = P001L2_A2247HisProTip[0] ;
         A1525HisProKgr = P001L2_A1525HisProKgr[0] ;
         A1526HisProMtr = P001L2_A1526HisProMtr[0] ;
         A656ParCod = P001L2_A656ParCod[0] ;
         n656ParCod = P001L2_n656ParCod[0] ;
         A3612HisProReo = P001L2_A3612HisProReo[0] ;
         A4441HisProDTF = P001L2_A4441HisProDTF[0] ;
         n4441HisProDTF = P001L2_n4441HisProDTF[0] ;
         A4440HisProDTI = P001L2_A4440HisProDTI[0] ;
         n4440HisProDTI = P001L2_n4440HisProDTI[0] ;
         A602MaqCod = P001L2_A602MaqCod[0] ;
         A830TipArtDsc = P001L2_A830TipArtDsc[0] ;
         n830TipArtDsc = P001L2_n830TipArtDsc[0] ;
         A558HisProFec = P001L2_A558HisProFec[0] ;
         A561HisProLin = P001L2_A561HisProLin[0] ;
         A361DisCod = P001L2_A361DisCod[0] ;
         A252CliCod = P001L2_A252CliCod[0] ;
         n252CliCod = P001L2_n252CliCod[0] ;
         A966PartCod = P001L2_A966PartCod[0] ;
         n966PartCod = P001L2_n966PartCod[0] ;
         A829TipArtCod = P001L2_A829TipArtCod[0] ;
         n829TipArtCod = P001L2_n829TipArtCod[0] ;
         A830TipArtDsc = P001L2_A830TipArtDsc[0] ;
         n830TipArtDsc = P001L2_n830TipArtDsc[0] ;
         Gxm1sdtresumentipoarticulo = (app.SdtSDTResumenTipoArticulo)new app.SdtSDTResumenTipoArticulo(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtresumentipoarticulo, 0);
         Gxm1sdtresumentipoarticulo.setgxTv_SdtSDTResumenTipoArticulo_Hisprotip( A2247HisProTip );
         Gxm1sdtresumentipoarticulo.setgxTv_SdtSDTResumenTipoArticulo_Tipartdsc( GXutil.trim( A830TipArtDsc) );
         AV13HisProKgr = DecimalUtil.ZERO ;
         AV14HisProMtr = DecimalUtil.ZERO ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001L2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P001L2_A2247HisProTip[0] == A2247HisProTip ) )
         {
            brk1L2 = false ;
            A1525HisProKgr = P001L2_A1525HisProKgr[0] ;
            A1526HisProMtr = P001L2_A1526HisProMtr[0] ;
            A602MaqCod = P001L2_A602MaqCod[0] ;
            A558HisProFec = P001L2_A558HisProFec[0] ;
            A561HisProLin = P001L2_A561HisProLin[0] ;
            AV13HisProKgr = AV13HisProKgr.add(A1525HisProKgr) ;
            AV14HisProMtr = AV14HisProMtr.add(A1526HisProMtr) ;
            brk1L2 = true ;
            pr_default.readNext(0);
         }
         Gxm1sdtresumentipoarticulo.setgxTv_SdtSDTResumenTipoArticulo_Kilosproduccion( AV13HisProKgr );
         Gxm1sdtresumentipoarticulo.setgxTv_SdtSDTResumenTipoArticulo_Metrosproduccion( AV14HisProMtr );
         if ( ! brk1L2 )
         {
            brk1L2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = dpproduccionreoperadostipoarticulos.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTResumenTipoArticulo>(app.SdtSDTResumenTipoArticulo.class, "SDTResumenTipoArticulo", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A602MaqCod = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      P001L2_A129BarCod = new int[1] ;
      P001L2_A132BarCodReo = new byte[1] ;
      P001L2_A130BarCodPar = new String[] {""} ;
      P001L2_A361DisCod = new int[1] ;
      P001L2_A966PartCod = new String[] {""} ;
      P001L2_n966PartCod = new boolean[] {false} ;
      P001L2_A252CliCod = new int[1] ;
      P001L2_n252CliCod = new boolean[] {false} ;
      P001L2_A829TipArtCod = new short[1] ;
      P001L2_n829TipArtCod = new boolean[] {false} ;
      P001L2_A396EmprCod = new String[] {""} ;
      P001L2_A2247HisProTip = new short[1] ;
      P001L2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001L2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001L2_A656ParCod = new short[1] ;
      P001L2_n656ParCod = new boolean[] {false} ;
      P001L2_A3612HisProReo = new byte[1] ;
      P001L2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P001L2_n4441HisProDTF = new boolean[] {false} ;
      P001L2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P001L2_n4440HisProDTI = new boolean[] {false} ;
      P001L2_A602MaqCod = new String[] {""} ;
      P001L2_A830TipArtDsc = new String[] {""} ;
      P001L2_n830TipArtDsc = new boolean[] {false} ;
      P001L2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P001L2_A561HisProLin = new int[1] ;
      A130BarCodPar = "" ;
      A966PartCod = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A830TipArtDsc = "" ;
      A558HisProFec = GXutil.nullDate() ;
      Gxm1sdtresumentipoarticulo = new app.SdtSDTResumenTipoArticulo(remoteHandle, context);
      AV13HisProKgr = DecimalUtil.ZERO ;
      AV14HisProMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpproduccionreoperadostipoarticulos__default(),
         new Object[] {
             new Object[] {
            P001L2_A129BarCod, P001L2_A132BarCodReo, P001L2_A130BarCodPar, P001L2_A361DisCod, P001L2_A966PartCod, P001L2_n966PartCod, P001L2_A252CliCod, P001L2_n252CliCod, P001L2_A829TipArtCod, P001L2_n829TipArtCod,
            P001L2_A396EmprCod, P001L2_A2247HisProTip, P001L2_A1525HisProKgr, P001L2_A1526HisProMtr, P001L2_A656ParCod, P001L2_n656ParCod, P001L2_A3612HisProReo, P001L2_A4441HisProDTF, P001L2_n4441HisProDTF, P001L2_A4440HisProDTI,
            P001L2_n4440HisProDTI, P001L2_A602MaqCod, P001L2_A830TipArtDsc, P001L2_n830TipArtDsc, P001L2_A558HisProFec, P001L2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV5HisProReo ;
   private byte A3612HisProReo ;
   private byte A132BarCodReo ;
   private short A656ParCod ;
   private short A829TipArtCod ;
   private short A2247HisProTip ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A561HisProLin ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV13HisProKgr ;
   private java.math.BigDecimal AV14HisProMtr ;
   private String AV6Emprcod ;
   private String AV11MaqCodInicial ;
   private String AV10MaqCodFinal ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A966PartCod ;
   private String A830TipArtDsc ;
   private java.util.Date AV9Hisprodti ;
   private java.util.Date AV8HisProdtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean brk1L2 ;
   private boolean n966PartCod ;
   private boolean n252CliCod ;
   private boolean n829TipArtCod ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean n830TipArtDsc ;
   private GXBaseCollection<app.SdtSDTResumenTipoArticulo>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private int[] P001L2_A129BarCod ;
   private byte[] P001L2_A132BarCodReo ;
   private String[] P001L2_A130BarCodPar ;
   private int[] P001L2_A361DisCod ;
   private String[] P001L2_A966PartCod ;
   private boolean[] P001L2_n966PartCod ;
   private int[] P001L2_A252CliCod ;
   private boolean[] P001L2_n252CliCod ;
   private short[] P001L2_A829TipArtCod ;
   private boolean[] P001L2_n829TipArtCod ;
   private String[] P001L2_A396EmprCod ;
   private short[] P001L2_A2247HisProTip ;
   private java.math.BigDecimal[] P001L2_A1525HisProKgr ;
   private java.math.BigDecimal[] P001L2_A1526HisProMtr ;
   private short[] P001L2_A656ParCod ;
   private boolean[] P001L2_n656ParCod ;
   private byte[] P001L2_A3612HisProReo ;
   private java.util.Date[] P001L2_A4441HisProDTF ;
   private boolean[] P001L2_n4441HisProDTF ;
   private java.util.Date[] P001L2_A4440HisProDTI ;
   private boolean[] P001L2_n4440HisProDTI ;
   private String[] P001L2_A602MaqCod ;
   private String[] P001L2_A830TipArtDsc ;
   private boolean[] P001L2_n830TipArtDsc ;
   private java.util.Date[] P001L2_A558HisProFec ;
   private int[] P001L2_A561HisProLin ;
   private GXBaseCollection<app.SdtSDTResumenTipoArticulo> Gxm2rootcol ;
   private app.SdtSDTResumenTipoArticulo Gxm1sdtresumentipoarticulo ;
}

final  class dpproduccionreoperadostipoarticulos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P001L2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV11MaqCodInicial ,
                                          String AV10MaqCodFinal ,
                                          java.util.Date AV9Hisprodti ,
                                          java.util.Date AV8HisProdtf ,
                                          byte AV5HisProReo ,
                                          String A602MaqCod ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          byte A3612HisProReo ,
                                          short A656ParCod ,
                                          String AV6Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[6];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.DisCod, T3.PartCod, T2.CliCod, T4.TipArtCod, T1.EmprCod, T1.HisProTip, T1.HisProKgr, T1.HisProMtr, T1.ParCod, T1.HisProReo," ;
      scmdbuf += " T1.HisProDTF, T1.HisProDTI, T1.MaqCod, T5.TipArtDsc, T1.HisProFec, T1.HisProLin FROM ((((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod" ;
      scmdbuf += " = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = T1.EmprCod AND T3.DisCod = T2.DisCod) LEFT JOIN" ;
      scmdbuf += " TXPCPARTI T4 ON T4.EmprCod = T1.EmprCod AND T4.PartCod = T3.PartCod AND T4.CliCod = T2.CliCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod" ;
      scmdbuf += " = T4.TipArtCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((T1.ParCod = 0))");
      if ( ! (GXutil.strcmp("", AV11MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int1[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int1[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV9Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int1[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV8HisProdtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! ( AV5HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.HisProTip" ;
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
                  return conditional_P001L2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001L2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(13);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 6);
               ((String[]) buf[22])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(18);
               ((int[]) buf[25])[0] = rslt.getInt(19);
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
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[9], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[10], false);
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

