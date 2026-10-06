package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class produccionresumenturno_dp extends GXProcedure
{
   public produccionresumenturno_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( produccionresumenturno_dp.class ), "" );
   }

   public produccionresumenturno_dp( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtProduccionResumenTurno_SDT> executeUdp( String aP0 ,
                                                                          byte aP1 ,
                                                                          String aP2 ,
                                                                          String aP3 ,
                                                                          java.util.Date aP4 ,
                                                                          java.util.Date aP5 ,
                                                                          int aP6 ,
                                                                          int aP7 )
   {
      produccionresumenturno_dp.this.aP8 = new GXBaseCollection[] {new GXBaseCollection<app.SdtProduccionResumenTurno_SDT>()};
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
                        GXBaseCollection<app.SdtProduccionResumenTurno_SDT>[] aP8 )
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
                             GXBaseCollection<app.SdtProduccionResumenTurno_SDT>[] aP8 )
   {
      produccionresumenturno_dp.this.AV9Emprcod = aP0;
      produccionresumenturno_dp.this.AV12HisEstReo = aP1;
      produccionresumenturno_dp.this.AV8MaqCodInicial = aP2;
      produccionresumenturno_dp.this.AV7MaqCodFinal = aP3;
      produccionresumenturno_dp.this.AV10Hisprodti = aP4;
      produccionresumenturno_dp.this.AV11HisProdtf = aP5;
      produccionresumenturno_dp.this.AV14OperarioFrom = aP6;
      produccionresumenturno_dp.this.AV13OperarioTo = aP7;
      produccionresumenturno_dp.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV14OperarioFrom) ,
                                           Integer.valueOf(AV13OperarioTo) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           A4441HisProDTF ,
                                           AV10Hisprodti ,
                                           AV11HisProdtf ,
                                           Short.valueOf(A656ParCod) ,
                                           AV9Emprcod ,
                                           AV8MaqCodInicial ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           AV7MaqCodFinal } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P00342 */
      pr_default.execute(0, new Object[] {AV9Emprcod, AV8MaqCodInicial, AV10Hisprodti, AV11HisProdtf, AV7MaqCodFinal, Integer.valueOf(AV14OperarioFrom), Integer.valueOf(AV13OperarioTo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk342 = false ;
         A1525HisProKgr = P00342_A1525HisProKgr[0] ;
         A1526HisProMtr = P00342_A1526HisProMtr[0] ;
         A602MaqCod = P00342_A602MaqCod[0] ;
         A396EmprCod = P00342_A396EmprCod[0] ;
         A566HisProTur = P00342_A566HisProTur[0] ;
         A656ParCod = P00342_A656ParCod[0] ;
         n656ParCod = P00342_n656ParCod[0] ;
         A503GruOpeCod = P00342_A503GruOpeCod[0] ;
         A4441HisProDTF = P00342_A4441HisProDTF[0] ;
         n4441HisProDTF = P00342_n4441HisProDTF[0] ;
         A558HisProFec = P00342_A558HisProFec[0] ;
         A561HisProLin = P00342_A561HisProLin[0] ;
         Gxm1produccionresumenturno_sdt = (app.SdtProduccionResumenTurno_SDT)new app.SdtProduccionResumenTurno_SDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1produccionresumenturno_sdt, 0);
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A602MaqCod, GXv_char2) ;
         produccionresumenturno_dp.this.GXt_char1 = GXv_char2[0] ;
         Gxm1produccionresumenturno_sdt.setgxTv_SdtProduccionResumenTurno_SDT_Maqdsc( GXt_char1 );
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P00342_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P00342_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk342 = false ;
            A1525HisProKgr = P00342_A1525HisProKgr[0] ;
            A1526HisProMtr = P00342_A1526HisProMtr[0] ;
            A566HisProTur = P00342_A566HisProTur[0] ;
            A558HisProFec = P00342_A558HisProFec[0] ;
            A561HisProLin = P00342_A561HisProLin[0] ;
            Gxm3produccionresumenturno_sdt_turnos = (app.SdtProduccionResumenTurno_SDT_TurnosItem)new app.SdtProduccionResumenTurno_SDT_TurnosItem(remoteHandle, context);
            Gxm1produccionresumenturno_sdt.getgxTv_SdtProduccionResumenTurno_SDT_Turnos().add(Gxm3produccionresumenturno_sdt_turnos, 0);
            Gxm3produccionresumenturno_sdt_turnos.setgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno( (byte)(((A566HisProTur<=0)||(A566HisProTur>3) ? 4 : A566HisProTur)) );
            AV5Kilos = DecimalUtil.doubleToDec(0) ;
            AV6Metros = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P00342_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P00342_A602MaqCod[0], A602MaqCod) == 0 ) && ( P00342_A566HisProTur[0] == A566HisProTur ) )
            {
               brk342 = false ;
               A1525HisProKgr = P00342_A1525HisProKgr[0] ;
               A1526HisProMtr = P00342_A1526HisProMtr[0] ;
               A558HisProFec = P00342_A558HisProFec[0] ;
               A561HisProLin = P00342_A561HisProLin[0] ;
               AV5Kilos = AV5Kilos.add(A1525HisProKgr) ;
               AV6Metros = AV6Metros.add(A1526HisProMtr) ;
               brk342 = true ;
               pr_default.readNext(0);
            }
            Gxm3produccionresumenturno_sdt_turnos.setgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno( AV5Kilos );
            Gxm3produccionresumenturno_sdt_turnos.setgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno( AV6Metros );
            if ( ! brk342 )
            {
               brk342 = true ;
               pr_default.readNext(0);
            }
         }
         if ( ! brk342 )
         {
            brk342 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP8[0] = produccionresumenturno_dp.this.Gxm2rootcol;
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
      Gxm2rootcol = new GXBaseCollection<app.SdtProduccionResumenTurno_SDT>(app.SdtProduccionResumenTurno_SDT.class, "ProduccionResumenTurno_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      P00342_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00342_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00342_A602MaqCod = new String[] {""} ;
      P00342_A396EmprCod = new String[] {""} ;
      P00342_A566HisProTur = new byte[1] ;
      P00342_A656ParCod = new short[1] ;
      P00342_n656ParCod = new boolean[] {false} ;
      P00342_A503GruOpeCod = new int[1] ;
      P00342_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P00342_n4441HisProDTF = new boolean[] {false} ;
      P00342_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00342_A561HisProLin = new int[1] ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A558HisProFec = GXutil.nullDate() ;
      Gxm1produccionresumenturno_sdt = new app.SdtProduccionResumenTurno_SDT(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      Gxm3produccionresumenturno_sdt_turnos = new app.SdtProduccionResumenTurno_SDT_TurnosItem(remoteHandle, context);
      AV5Kilos = DecimalUtil.ZERO ;
      AV6Metros = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccionresumenturno_dp__default(),
         new Object[] {
             new Object[] {
            P00342_A1525HisProKgr, P00342_A1526HisProMtr, P00342_A602MaqCod, P00342_A396EmprCod, P00342_A566HisProTur, P00342_A656ParCod, P00342_n656ParCod, P00342_A503GruOpeCod, P00342_A4441HisProDTF, P00342_n4441HisProDTF,
            P00342_A558HisProFec, P00342_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12HisEstReo ;
   private byte A566HisProTur ;
   private short A656ParCod ;
   private short Gx_err ;
   private int AV14OperarioFrom ;
   private int AV13OperarioTo ;
   private int A503GruOpeCod ;
   private int A561HisProLin ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV5Kilos ;
   private java.math.BigDecimal AV6Metros ;
   private String AV9Emprcod ;
   private String AV8MaqCodInicial ;
   private String AV7MaqCodFinal ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV10Hisprodti ;
   private java.util.Date AV11HisProdtf ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean brk342 ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private GXBaseCollection<app.SdtProduccionResumenTurno_SDT>[] aP8 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P00342_A1525HisProKgr ;
   private java.math.BigDecimal[] P00342_A1526HisProMtr ;
   private String[] P00342_A602MaqCod ;
   private String[] P00342_A396EmprCod ;
   private byte[] P00342_A566HisProTur ;
   private short[] P00342_A656ParCod ;
   private boolean[] P00342_n656ParCod ;
   private int[] P00342_A503GruOpeCod ;
   private java.util.Date[] P00342_A4441HisProDTF ;
   private boolean[] P00342_n4441HisProDTF ;
   private java.util.Date[] P00342_A558HisProFec ;
   private int[] P00342_A561HisProLin ;
   private GXBaseCollection<app.SdtProduccionResumenTurno_SDT> Gxm2rootcol ;
   private app.SdtProduccionResumenTurno_SDT Gxm1produccionresumenturno_sdt ;
   private app.SdtProduccionResumenTurno_SDT_TurnosItem Gxm3produccionresumenturno_sdt_turnos ;
}

final  class produccionresumenturno_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00342( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV14OperarioFrom ,
                                          int AV13OperarioTo ,
                                          int A503GruOpeCod ,
                                          java.util.Date A4441HisProDTF ,
                                          java.util.Date AV10Hisprodti ,
                                          java.util.Date AV11HisProdtf ,
                                          short A656ParCod ,
                                          String AV9Emprcod ,
                                          String AV8MaqCodInicial ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          String AV7MaqCodFinal )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int3 = new byte[7];
      Object[] GXv_Object4 = new Object[2];
      scmdbuf = "SELECT HisProKgr, HisProMtr, MaqCod, EmprCod, HisProTur, ParCod, GruOpeCod, HisProDTF, HisProFec, HisProLin FROM TXPLHIPRO" ;
      addWhere(sWhereString, "(EmprCod = ? and MaqCod >= ?)");
      addWhere(sWhereString, "(HisProDTF >= ?)");
      addWhere(sWhereString, "(HisProDTF <= ?)");
      addWhere(sWhereString, "(ParCod = 0)");
      addWhere(sWhereString, "(MaqCod <= ?)");
      if ( ! (0==AV14OperarioFrom) )
      {
         addWhere(sWhereString, "(GruOpeCod >= ?)");
      }
      else
      {
         GXv_int3[5] = (byte)(1) ;
      }
      if ( ! (0==AV13OperarioTo) )
      {
         addWhere(sWhereString, "(GruOpeCod <= ?)");
      }
      else
      {
         GXv_int3[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, MaqCod, HisProTur" ;
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
                  return conditional_P00342(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00342", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
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
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[9], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[10], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
      }
   }

}

