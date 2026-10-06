package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlproductossinmovimientos_dp extends GXProcedure
{
   public controlproductossinmovimientos_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlproductossinmovimientos_dp.class ), "" );
   }

   public controlproductossinmovimientos_dp( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtControlProductossinMovimientos_SDT> executeUdp( String aP0 ,
                                                                                  String aP1 ,
                                                                                  String aP2 ,
                                                                                  int aP3 ,
                                                                                  int aP4 ,
                                                                                  short aP5 )
   {
      controlproductossinmovimientos_dp.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.SdtControlProductossinMovimientos_SDT>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        int aP4 ,
                        short aP5 ,
                        GXBaseCollection<app.SdtControlProductossinMovimientos_SDT>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             int aP4 ,
                             short aP5 ,
                             GXBaseCollection<app.SdtControlProductossinMovimientos_SDT>[] aP6 )
   {
      controlproductossinmovimientos_dp.this.AV7Emprcod = aP0;
      controlproductossinmovimientos_dp.this.AV8Prdnum = aP1;
      controlproductossinmovimientos_dp.this.AV9Prdnum_to = aP2;
      controlproductossinmovimientos_dp.this.AV10PrvNum = aP3;
      controlproductossinmovimientos_dp.this.AV11Prvnum_to = aP4;
      controlproductossinmovimientos_dp.this.AV14Dias = aP5;
      controlproductossinmovimientos_dp.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P002K2 */
      pr_default.execute(0, new Object[] {AV7Emprcod, Integer.valueOf(AV10PrvNum), AV8Prdnum, AV9Prdnum_to, Integer.valueOf(AV11Prvnum_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A795PrvNum = P002K2_A795PrvNum[0] ;
         A704PrdExiAlm = P002K2_A704PrdExiAlm[0] ;
         A718PrdNom = P002K2_A718PrdNom[0] ;
         A724PrdPreAct = P002K2_A724PrdPreAct[0] ;
         A719PrdNum = P002K2_A719PrdNum[0] ;
         A396EmprCod = P002K2_A396EmprCod[0] ;
         GXt_int1 = A13873PrdUltMovC ;
         GXv_int2[0] = GXt_int1 ;
         new app.core.ultimalineamovcc(remoteHandle, context).execute( A396EmprCod, A719PrdNum, GXv_int2) ;
         controlproductossinmovimientos_dp.this.GXt_int1 = GXv_int2[0] ;
         A13873PrdUltMovC = GXt_int1 ;
         A13874PrdTipMovU = getPrdTipMovU0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
         GXt_date3 = A13872PrdFecUltM ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char5[0] = A719PrdNum ;
         GXv_date6[0] = GXt_date3 ;
         new app.core.ultimafechamovcc(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_date6) ;
         controlproductossinmovimientos_dp.this.A396EmprCod = GXv_char4[0] ;
         controlproductossinmovimientos_dp.this.A719PrdNum = GXv_char5[0] ;
         controlproductossinmovimientos_dp.this.GXt_date3 = GXv_date6[0] ;
         A13872PrdFecUltM = GXt_date3 ;
         GXt_int7 = A13871PrdDiasIna ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_int8[0] = GXt_int7 ;
         new app.core.ultimomovimiento(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int8) ;
         controlproductossinmovimientos_dp.this.A396EmprCod = GXv_char5[0] ;
         controlproductossinmovimientos_dp.this.A719PrdNum = GXv_char4[0] ;
         controlproductossinmovimientos_dp.this.GXt_int7 = GXv_int8[0] ;
         A13871PrdDiasIna = GXt_int7 ;
         if ( ( A13871PrdDiasIna >= AV14Dias ) || (0==AV14Dias) )
         {
            Gxm1controlproductossinmovimientos_sdt = (app.SdtControlProductossinMovimientos_SDT)new app.SdtControlProductossinMovimientos_SDT(remoteHandle, context);
            Gxm2rootcol.add(Gxm1controlproductossinmovimientos_sdt, 0);
            Gxm1controlproductossinmovimientos_sdt.setgxTv_SdtControlProductossinMovimientos_SDT_Prdnum( A719PrdNum );
            Gxm1controlproductossinmovimientos_sdt.setgxTv_SdtControlProductossinMovimientos_SDT_Prdnom( A718PrdNom );
            Gxm1controlproductossinmovimientos_sdt.setgxTv_SdtControlProductossinMovimientos_SDT_Prdexialm( A704PrdExiAlm );
            Gxm1controlproductossinmovimientos_sdt.setgxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov( A13872PrdFecUltM );
            Gxm1controlproductossinmovimientos_sdt.setgxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult( A13874PrdTipMovU );
            Gxm1controlproductossinmovimientos_sdt.setgxTv_SdtControlProductossinMovimientos_SDT_Prddiasinactivo( A13871PrdDiasIna );
            Gxm1controlproductossinmovimientos_sdt.setgxTv_SdtControlProductossinMovimientos_SDT_Prdpreact( A724PrdPreAct );
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = controlproductossinmovimientos_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public String getPrdTipMovU0( String E396EmprCod ,
                                 String E719PrdNum ,
                                 long E13873PrdUltMovC )
   {
      X3345TipMovCc = " " ;
      Gx_first = true ;
      /* Using cursor P002K3 */
      pr_default.execute(1, new Object[] {E396EmprCod, E719PrdNum, Long.valueOf(E13873PrdUltMovC)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E719PrdNum, E719PrdNum) == 0 ) && ( P002K3_A3342CCStkLin[0] == E13873PrdUltMovC ) && ( GXutil.strcmp(P002K3_A3345TipMovCc[0], httpContext.getMessage( "SR", "")) != 0 ) )
         {
            X3345TipMovCc = P002K3_A3345TipMovCc[0] ;
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      return X3345TipMovCc ;
   }

   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtControlProductossinMovimientos_SDT>(app.SdtControlProductossinMovimientos_SDT.class, "ControlProductossinMovimientos_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P002K2_A795PrvNum = new int[1] ;
      P002K2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002K2_A718PrdNom = new String[] {""} ;
      P002K2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002K2_A719PrdNum = new String[] {""} ;
      P002K2_A396EmprCod = new String[] {""} ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      GXv_int2 = new long[1] ;
      A13874PrdTipMovU = "" ;
      A13872PrdFecUltM = GXutil.nullDate() ;
      GXt_date3 = GXutil.nullDate() ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new short[1] ;
      Gxm1controlproductossinmovimientos_sdt = new app.SdtControlProductossinMovimientos_SDT(remoteHandle, context);
      X3345TipMovCc = "" ;
      E396EmprCod = "" ;
      E719PrdNum = "" ;
      P002K3_A396EmprCod = new String[] {""} ;
      P002K3_A719PrdNum = new String[] {""} ;
      P002K3_A3342CCStkLin = new long[1] ;
      P002K3_A3345TipMovCc = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlproductossinmovimientos_dp__default(),
         new Object[] {
             new Object[] {
            P002K2_A795PrvNum, P002K2_A704PrdExiAlm, P002K2_A718PrdNom, P002K2_A724PrdPreAct, P002K2_A719PrdNum, P002K2_A396EmprCod
            }
            , new Object[] {
            P002K3_A396EmprCod, P002K3_A719PrdNum, P002K3_A3342CCStkLin, P002K3_A3345TipMovCc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14Dias ;
   private short A13871PrdDiasIna ;
   private short GXt_int7 ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int AV10PrvNum ;
   private int AV11Prvnum_to ;
   private int A795PrvNum ;
   private long A13873PrdUltMovC ;
   private long GXt_int1 ;
   private long GXv_int2[] ;
   private long E13873PrdUltMovC ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A724PrdPreAct ;
   private String AV7Emprcod ;
   private String AV8Prdnum ;
   private String AV9Prdnum_to ;
   private String scmdbuf ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A13874PrdTipMovU ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String X3345TipMovCc ;
   private String E396EmprCod ;
   private String E719PrdNum ;
   private java.util.Date A13872PrdFecUltM ;
   private java.util.Date GXt_date3 ;
   private java.util.Date GXv_date6[] ;
   private boolean Gx_first ;
   private GXBaseCollection<app.SdtControlProductossinMovimientos_SDT>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private int[] P002K2_A795PrvNum ;
   private java.math.BigDecimal[] P002K2_A704PrdExiAlm ;
   private String[] P002K2_A718PrdNom ;
   private java.math.BigDecimal[] P002K2_A724PrdPreAct ;
   private String[] P002K2_A719PrdNum ;
   private String[] P002K2_A396EmprCod ;
   private String[] P002K3_A396EmprCod ;
   private String[] P002K3_A719PrdNum ;
   private long[] P002K3_A3342CCStkLin ;
   private String[] P002K3_A3345TipMovCc ;
   private GXBaseCollection<app.SdtControlProductossinMovimientos_SDT> Gxm2rootcol ;
   private app.SdtControlProductossinMovimientos_SDT Gxm1controlproductossinmovimientos_sdt ;
}

final  class controlproductossinmovimientos_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002K2", "SELECT PrvNum, PrdExiAlm, PrdNom, PrdPreAct, PrdNum, EmprCod FROM TXPPRODUC WHERE (EmprCod = ? and PrvNum >= ? and PrdNum >= ?) AND (PrdExiAlm > 0) AND (PrdNum <= ?) AND (PrvNum <= ?) ORDER BY EmprCod, PrvNum, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002K3", "SELECT EmprCod, PrdNum, CCStkLin, TipMovCc FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

