package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpproduccionreoperadosgrupooperarios extends GXProcedure
{
   public dpproduccionreoperadosgrupooperarios( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpproduccionreoperadosgrupooperarios.class ), "" );
   }

   public dpproduccionreoperadosgrupooperarios( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTResumenGrupoOperario> executeUdp( String aP0 ,
                                                                       String aP1 ,
                                                                       String aP2 ,
                                                                       java.util.Date aP3 ,
                                                                       java.util.Date aP4 ,
                                                                       byte aP5 )
   {
      dpproduccionreoperadosgrupooperarios.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTResumenGrupoOperario>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        byte aP5 ,
                        GXBaseCollection<app.SdtSDTResumenGrupoOperario>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             byte aP5 ,
                             GXBaseCollection<app.SdtSDTResumenGrupoOperario>[] aP6 )
   {
      dpproduccionreoperadosgrupooperarios.this.AV6Emprcod = aP0;
      dpproduccionreoperadosgrupooperarios.this.AV11MaqCodInicial = aP1;
      dpproduccionreoperadosgrupooperarios.this.AV10MaqCodFinal = aP2;
      dpproduccionreoperadosgrupooperarios.this.AV9Hisprodti = aP3;
      dpproduccionreoperadosgrupooperarios.this.AV8HisProdtf = aP4;
      dpproduccionreoperadosgrupooperarios.this.AV5HisProReo = aP5;
      dpproduccionreoperadosgrupooperarios.this.aP6 = aP6;
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
      /* Using cursor P001M2 */
      pr_default.execute(0, new Object[] {AV6Emprcod, AV11MaqCodInicial, AV10MaqCodFinal, AV9Hisprodti, AV8HisProdtf, Byte.valueOf(AV5HisProReo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1M2 = false ;
         A503GruOpeCod = P001M2_A503GruOpeCod[0] ;
         A396EmprCod = P001M2_A396EmprCod[0] ;
         A1525HisProKgr = P001M2_A1525HisProKgr[0] ;
         A1526HisProMtr = P001M2_A1526HisProMtr[0] ;
         A656ParCod = P001M2_A656ParCod[0] ;
         n656ParCod = P001M2_n656ParCod[0] ;
         A3612HisProReo = P001M2_A3612HisProReo[0] ;
         A4441HisProDTF = P001M2_A4441HisProDTF[0] ;
         n4441HisProDTF = P001M2_n4441HisProDTF[0] ;
         A4440HisProDTI = P001M2_A4440HisProDTI[0] ;
         n4440HisProDTI = P001M2_n4440HisProDTI[0] ;
         A602MaqCod = P001M2_A602MaqCod[0] ;
         A558HisProFec = P001M2_A558HisProFec[0] ;
         A561HisProLin = P001M2_A561HisProLin[0] ;
         Gxm1sdtresumengrupooperario = (app.SdtSDTResumenGrupoOperario)new app.SdtSDTResumenGrupoOperario(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtresumengrupooperario, 0);
         Gxm1sdtresumengrupooperario.setgxTv_SdtSDTResumenGrupoOperario_Gruopecod( A503GruOpeCod );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char2) ;
         dpproduccionreoperadosgrupooperarios.this.GXt_char1 = GXv_char2[0] ;
         Gxm1sdtresumengrupooperario.setgxTv_SdtSDTResumenGrupoOperario_Openom( GXt_char1 );
         AV13HisProKgr = DecimalUtil.ZERO ;
         AV14HisProMtr = DecimalUtil.ZERO ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001M2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P001M2_A503GruOpeCod[0] == A503GruOpeCod ) )
         {
            brk1M2 = false ;
            A1525HisProKgr = P001M2_A1525HisProKgr[0] ;
            A1526HisProMtr = P001M2_A1526HisProMtr[0] ;
            A602MaqCod = P001M2_A602MaqCod[0] ;
            A558HisProFec = P001M2_A558HisProFec[0] ;
            A561HisProLin = P001M2_A561HisProLin[0] ;
            AV13HisProKgr = AV13HisProKgr.add(A1525HisProKgr) ;
            AV14HisProMtr = AV14HisProMtr.add(A1526HisProMtr) ;
            brk1M2 = true ;
            pr_default.readNext(0);
         }
         Gxm1sdtresumengrupooperario.setgxTv_SdtSDTResumenGrupoOperario_Kilosproduccion( AV13HisProKgr );
         Gxm1sdtresumengrupooperario.setgxTv_SdtSDTResumenGrupoOperario_Metrosproduccion( AV14HisProMtr );
         if ( ! brk1M2 )
         {
            brk1M2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = dpproduccionreoperadosgrupooperarios.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTResumenGrupoOperario>(app.SdtSDTResumenGrupoOperario.class, "SDTResumenGrupoOperario", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A602MaqCod = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      P001M2_A503GruOpeCod = new int[1] ;
      P001M2_A396EmprCod = new String[] {""} ;
      P001M2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001M2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001M2_A656ParCod = new short[1] ;
      P001M2_n656ParCod = new boolean[] {false} ;
      P001M2_A3612HisProReo = new byte[1] ;
      P001M2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P001M2_n4441HisProDTF = new boolean[] {false} ;
      P001M2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P001M2_n4440HisProDTI = new boolean[] {false} ;
      P001M2_A602MaqCod = new String[] {""} ;
      P001M2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P001M2_A561HisProLin = new int[1] ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A558HisProFec = GXutil.nullDate() ;
      Gxm1sdtresumengrupooperario = new app.SdtSDTResumenGrupoOperario(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV13HisProKgr = DecimalUtil.ZERO ;
      AV14HisProMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpproduccionreoperadosgrupooperarios__default(),
         new Object[] {
             new Object[] {
            P001M2_A503GruOpeCod, P001M2_A396EmprCod, P001M2_A1525HisProKgr, P001M2_A1526HisProMtr, P001M2_A656ParCod, P001M2_n656ParCod, P001M2_A3612HisProReo, P001M2_A4441HisProDTF, P001M2_n4441HisProDTF, P001M2_A4440HisProDTI,
            P001M2_n4440HisProDTI, P001M2_A602MaqCod, P001M2_A558HisProFec, P001M2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV5HisProReo ;
   private byte A3612HisProReo ;
   private short A656ParCod ;
   private short Gx_err ;
   private int A503GruOpeCod ;
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
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV9Hisprodti ;
   private java.util.Date AV8HisProdtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean brk1M2 ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private GXBaseCollection<app.SdtSDTResumenGrupoOperario>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private int[] P001M2_A503GruOpeCod ;
   private String[] P001M2_A396EmprCod ;
   private java.math.BigDecimal[] P001M2_A1525HisProKgr ;
   private java.math.BigDecimal[] P001M2_A1526HisProMtr ;
   private short[] P001M2_A656ParCod ;
   private boolean[] P001M2_n656ParCod ;
   private byte[] P001M2_A3612HisProReo ;
   private java.util.Date[] P001M2_A4441HisProDTF ;
   private boolean[] P001M2_n4441HisProDTF ;
   private java.util.Date[] P001M2_A4440HisProDTI ;
   private boolean[] P001M2_n4440HisProDTI ;
   private String[] P001M2_A602MaqCod ;
   private java.util.Date[] P001M2_A558HisProFec ;
   private int[] P001M2_A561HisProLin ;
   private GXBaseCollection<app.SdtSDTResumenGrupoOperario> Gxm2rootcol ;
   private app.SdtSDTResumenGrupoOperario Gxm1sdtresumengrupooperario ;
}

final  class dpproduccionreoperadosgrupooperarios__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P001M2( ModelContext context ,
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
      byte[] GXv_int3 = new byte[6];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT GruOpeCod, EmprCod, HisProKgr, HisProMtr, ParCod, HisProReo, HisProDTF, HisProDTI, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "((ParCod = 0))");
      if ( ! (GXutil.strcmp("", AV11MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(MaqCod >= ?)");
      }
      else
      {
         GXv_int3[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(MaqCod <= ?)");
      }
      else
      {
         GXv_int3[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV9Hisprodti) )
      {
         addWhere(sWhereString, "(HisProDTI >= ?)");
      }
      else
      {
         GXv_int3[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV8HisProdtf) )
      {
         addWhere(sWhereString, "(HisProDTF <= ?)");
      }
      else
      {
         GXv_int3[4] = (byte)(1) ;
      }
      if ( ! ( AV5HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(HisProReo = ?)");
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, GruOpeCod" ;
      GXv_Object4[0] = scmdbuf ;
      GXv_Object4[1] = GXv_int3 ;
      return GXv_Object4 ;
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
                  return conditional_P001M2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).shortValue() , (String)dynConstraints[10] , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001M2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 6);
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

