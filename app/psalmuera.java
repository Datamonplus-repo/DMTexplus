package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psalmuera extends GXProcedure
{
   public psalmuera( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psalmuera.class ), "" );
   }

   public psalmuera( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           int[] aP2 ,
                                           byte[] aP3 ,
                                           String[] aP4 ,
                                           short[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           int[] aP7 ,
                                           short[] aP8 ,
                                           int[] aP9 )
   {
      psalmuera.this.aP10 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        int[] aP7 ,
                        short[] aP8 ,
                        int[] aP9 ,
                        java.math.BigDecimal[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             int[] aP7 ,
                             short[] aP8 ,
                             int[] aP9 ,
                             java.math.BigDecimal[] aP10 )
   {
      psalmuera.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psalmuera.this.AV24PrdNum = aP1[0];
      this.aP1 = aP1;
      psalmuera.this.AV25BarCod = aP2[0];
      this.aP2 = aP2;
      psalmuera.this.AV26BarCodReo = aP3[0];
      this.aP3 = aP3;
      psalmuera.this.AV27BarCodPar = aP4[0];
      this.aP4 = aP4;
      psalmuera.this.AV28RecLinMaq = aP5[0];
      this.aP5 = aP5;
      psalmuera.this.AV29CanRec = aP6[0];
      this.aP6 = aP6;
      psalmuera.this.AV35Volumen = aP7[0];
      this.aP7 = aP7;
      psalmuera.this.AV36RecSalMP = aP8[0];
      this.aP8 = aP8;
      psalmuera.this.AV39RecSalVol = aP9[0];
      this.aP9 = aP9;
      psalmuera.this.AV42Tot_kg = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV40V_k1 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "K1    ", ""), GXv_int1) ;
      psalmuera.this.AV40V_k1 = GXv_int1[0] ;
      GXv_int1[0] = AV41V_k2 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "K2    ", ""), GXv_int1) ;
      psalmuera.this.AV41V_k2 = GXv_int1[0] ;
      GXt_int2 = AV43Valor_sm ;
      GXv_int1[0] = GXt_int2 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SALMUE", ""), GXv_int1) ;
      psalmuera.this.GXt_int2 = GXv_int1[0] ;
      AV43Valor_sm = GXt_int2 ;
      AV30Prdnum_sm = (byte)(0) ;
      AV34PrdConcS = DecimalUtil.doubleToDec(0) ;
      AV33PrdDensS = DecimalUtil.doubleToDec(0) ;
      AV36RecSalMP = (short)(0) ;
      AV39RecSalVol = 0 ;
      AV46Manual = GXutil.space( (short)(4)) ;
      /* Using cursor P01QM2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV24PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P01QM2_A719PrdNum[0] ;
         A5418PrdSalM = P01QM2_A5418PrdSalM[0] ;
         A5416PrdDensS = P01QM2_A5416PrdDensS[0] ;
         A5417PrdConcS = P01QM2_A5417PrdConcS[0] ;
         A703PrdDscTec = P01QM2_A703PrdDscTec[0] ;
         if ( GXutil.strcmp(A5418PrdSalM, httpContext.getMessage( "S", "")) == 0 )
         {
            AV30Prdnum_sm = (byte)(1) ;
            AV33PrdDensS = A5416PrdDensS ;
            AV34PrdConcS = A5417PrdConcS ;
         }
         AV46Manual = A703PrdDscTec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P01QM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV25BarCod), Byte.valueOf(AV26BarCodReo), AV27BarCodPar, Short.valueOf(AV28RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2804RecLinMaq = P01QM3_A2804RecLinMaq[0] ;
         A130BarCodPar = P01QM3_A130BarCodPar[0] ;
         A132BarCodReo = P01QM3_A132BarCodReo[0] ;
         A129BarCod = P01QM3_A129BarCod[0] ;
         A602MaqCod = P01QM3_A602MaqCod[0] ;
         AV32MaqCod = A602MaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV31Sal_muera = (byte)(0) ;
      AV45Maqdosifp = "" ;
      AV44MaqDteCol = 0 ;
      AV47MAQTINTIP = "" ;
      /* Using cursor P01QM4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV32MaqCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A602MaqCod = P01QM4_A602MaqCod[0] ;
         A5419MaqSalM = P01QM4_A5419MaqSalM[0] ;
         n5419MaqSalM = P01QM4_n5419MaqSalM[0] ;
         A5421MaqSalMKf = P01QM4_A5421MaqSalMKf[0] ;
         n5421MaqSalMKf = P01QM4_n5421MaqSalMKf[0] ;
         A5420MaqSalMKi = P01QM4_A5420MaqSalMKi[0] ;
         n5420MaqSalMKi = P01QM4_n5420MaqSalMKi[0] ;
         A5950MaqDteCol = P01QM4_A5950MaqDteCol[0] ;
         n5950MaqDteCol = P01QM4_n5950MaqDteCol[0] ;
         A5949MaqDosifP = P01QM4_A5949MaqDosifP[0] ;
         n5949MaqDosifP = P01QM4_n5949MaqDosifP[0] ;
         A619MaqTinTip = P01QM4_A619MaqTinTip[0] ;
         n619MaqTinTip = P01QM4_n619MaqTinTip[0] ;
         if ( ( DecimalUtil.compareTo(AV29CanRec, A5420MaqSalMKi) >= 0 ) && ( DecimalUtil.compareTo(AV29CanRec, A5421MaqSalMKf) <= 0 ) && ( GXutil.strcmp(A5419MaqSalM, httpContext.getMessage( "S", "")) == 0 ) )
         {
            AV31Sal_muera = (byte)(1) ;
         }
         AV44MaqDteCol = A5950MaqDteCol ;
         AV45Maqdosifp = A5949MaqDosifP ;
         AV47MAQTINTIP = A619MaqTinTip ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV30Prdnum_sm == 1 )
      {
         if ( ( AV31Sal_muera == 1 ) && ( AV43Valor_sm == 1 ) )
         {
            AV37Volumen_c = 0 ;
            if ( AV34PrdConcS.doubleValue() > 0 )
            {
               AV37Volumen_c = (int)(DecimalUtil.decToDouble((AV29CanRec.multiply(DecimalUtil.doubleToDec(1000))).divide(AV34PrdConcS, 18, java.math.RoundingMode.DOWN))) ;
            }
            AV36RecSalMP = (short)(0) ;
            if ( AV35Volumen > 0 )
            {
               AV36RecSalMP = (short)((AV37Volumen_c*100)/ (double) (AV35Volumen)) ;
            }
            AV39RecSalVol = AV44MaqDteCol ;
         }
         else
         {
            if ( GXutil.strcmp(GXutil.trim( AV47MAQTINTIP), httpContext.getMessage( "A", "")) == 0 )
            {
               AV39RecSalVol = 0 ;
            }
            else
            {
               if ( AV29CanRec.doubleValue() < AV40V_k1 )
               {
                  AV39RecSalVol = (int)(AV40V_k1+AV41V_k2) ;
               }
               else
               {
                  AV39RecSalVol = (int)(DecimalUtil.decToDouble(AV29CanRec.add(DecimalUtil.doubleToDec(AV41V_k2)))) ;
               }
            }
            if ( GXutil.strcmp(AV45Maqdosifp, httpContext.getMessage( "N", "")) == 0 )
            {
               AV39RecSalVol = AV44MaqDteCol ;
            }
            else
            {
               AV39RecSalVol = (int)(AV39RecSalVol+AV44MaqDteCol) ;
            }
         }
      }
      if ( ( AV44MaqDteCol > 0 ) && ( GXutil.strcmp(GXutil.trim( AV46Manual), httpContext.getMessage( "N", "")) == 0 ) && ( AV30Prdnum_sm == 0 ) )
      {
         AV39RecSalVol = AV44MaqDteCol ;
      }
      if ( ( GXutil.strcmp(GXutil.trim( AV46Manual), httpContext.getMessage( "S", "")) == 0 ) && ( AV30Prdnum_sm == 0 ) )
      {
         if ( GXutil.strcmp(GXutil.trim( AV47MAQTINTIP), httpContext.getMessage( "A", "")) == 0 )
         {
            AV39RecSalVol = 0 ;
         }
         else
         {
            if ( AV29CanRec.doubleValue() < AV40V_k1 )
            {
               AV39RecSalVol = (int)(AV40V_k1+AV41V_k2) ;
            }
            else
            {
               AV39RecSalVol = (int)(DecimalUtil.decToDouble(AV29CanRec.add(DecimalUtil.doubleToDec(AV41V_k2)))) ;
            }
         }
         if ( GXutil.strcmp(AV45Maqdosifp, httpContext.getMessage( "N", "")) == 0 )
         {
            AV39RecSalVol = AV44MaqDteCol ;
         }
         else
         {
            AV39RecSalVol = (int)(AV39RecSalVol+AV44MaqDteCol) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psalmuera.this.A396EmprCod;
      this.aP1[0] = psalmuera.this.AV24PrdNum;
      this.aP2[0] = psalmuera.this.AV25BarCod;
      this.aP3[0] = psalmuera.this.AV26BarCodReo;
      this.aP4[0] = psalmuera.this.AV27BarCodPar;
      this.aP5[0] = psalmuera.this.AV28RecLinMaq;
      this.aP6[0] = psalmuera.this.AV29CanRec;
      this.aP7[0] = psalmuera.this.AV35Volumen;
      this.aP8[0] = psalmuera.this.AV36RecSalMP;
      this.aP9[0] = psalmuera.this.AV39RecSalVol;
      this.aP10[0] = psalmuera.this.AV42Tot_kg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new int[1] ;
      AV34PrdConcS = DecimalUtil.ZERO ;
      AV33PrdDensS = DecimalUtil.ZERO ;
      AV46Manual = "" ;
      scmdbuf = "" ;
      P01QM2_A396EmprCod = new String[] {""} ;
      P01QM2_A719PrdNum = new String[] {""} ;
      P01QM2_A5418PrdSalM = new String[] {""} ;
      P01QM2_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QM2_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QM2_A703PrdDscTec = new String[] {""} ;
      A719PrdNum = "" ;
      A5418PrdSalM = "" ;
      A5416PrdDensS = DecimalUtil.ZERO ;
      A5417PrdConcS = DecimalUtil.ZERO ;
      A703PrdDscTec = "" ;
      P01QM3_A396EmprCod = new String[] {""} ;
      P01QM3_A2804RecLinMaq = new short[1] ;
      P01QM3_A130BarCodPar = new String[] {""} ;
      P01QM3_A132BarCodReo = new byte[1] ;
      P01QM3_A129BarCod = new int[1] ;
      P01QM3_A602MaqCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A602MaqCod = "" ;
      AV32MaqCod = "" ;
      AV45Maqdosifp = "" ;
      AV47MAQTINTIP = "" ;
      P01QM4_A396EmprCod = new String[] {""} ;
      P01QM4_A602MaqCod = new String[] {""} ;
      P01QM4_A5419MaqSalM = new String[] {""} ;
      P01QM4_n5419MaqSalM = new boolean[] {false} ;
      P01QM4_A5421MaqSalMKf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QM4_n5421MaqSalMKf = new boolean[] {false} ;
      P01QM4_A5420MaqSalMKi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01QM4_n5420MaqSalMKi = new boolean[] {false} ;
      P01QM4_A5950MaqDteCol = new int[1] ;
      P01QM4_n5950MaqDteCol = new boolean[] {false} ;
      P01QM4_A5949MaqDosifP = new String[] {""} ;
      P01QM4_n5949MaqDosifP = new boolean[] {false} ;
      P01QM4_A619MaqTinTip = new String[] {""} ;
      P01QM4_n619MaqTinTip = new boolean[] {false} ;
      A5419MaqSalM = "" ;
      A5421MaqSalMKf = DecimalUtil.ZERO ;
      A5420MaqSalMKi = DecimalUtil.ZERO ;
      A5949MaqDosifP = "" ;
      A619MaqTinTip = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psalmuera__default(),
         new Object[] {
             new Object[] {
            P01QM2_A396EmprCod, P01QM2_A719PrdNum, P01QM2_A5418PrdSalM, P01QM2_A5416PrdDensS, P01QM2_A5417PrdConcS, P01QM2_A703PrdDscTec
            }
            , new Object[] {
            P01QM3_A396EmprCod, P01QM3_A2804RecLinMaq, P01QM3_A130BarCodPar, P01QM3_A132BarCodReo, P01QM3_A129BarCod, P01QM3_A602MaqCod
            }
            , new Object[] {
            P01QM4_A396EmprCod, P01QM4_A602MaqCod, P01QM4_A5419MaqSalM, P01QM4_n5419MaqSalM, P01QM4_A5421MaqSalMKf, P01QM4_n5421MaqSalMKf, P01QM4_A5420MaqSalMKi, P01QM4_n5420MaqSalMKi, P01QM4_A5950MaqDteCol, P01QM4_n5950MaqDteCol,
            P01QM4_A5949MaqDosifP, P01QM4_n5949MaqDosifP, P01QM4_A619MaqTinTip, P01QM4_n619MaqTinTip
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26BarCodReo ;
   private byte AV30Prdnum_sm ;
   private byte A132BarCodReo ;
   private byte AV31Sal_muera ;
   private short AV28RecLinMaq ;
   private short AV36RecSalMP ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV25BarCod ;
   private int AV35Volumen ;
   private int AV39RecSalVol ;
   private int AV40V_k1 ;
   private int AV41V_k2 ;
   private int AV43Valor_sm ;
   private int GXt_int2 ;
   private int GXv_int1[] ;
   private int A129BarCod ;
   private int AV44MaqDteCol ;
   private int A5950MaqDteCol ;
   private int AV37Volumen_c ;
   private java.math.BigDecimal AV29CanRec ;
   private java.math.BigDecimal AV42Tot_kg ;
   private java.math.BigDecimal AV34PrdConcS ;
   private java.math.BigDecimal AV33PrdDensS ;
   private java.math.BigDecimal A5416PrdDensS ;
   private java.math.BigDecimal A5417PrdConcS ;
   private java.math.BigDecimal A5421MaqSalMKf ;
   private java.math.BigDecimal A5420MaqSalMKi ;
   private String A396EmprCod ;
   private String AV24PrdNum ;
   private String AV27BarCodPar ;
   private String AV46Manual ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A5418PrdSalM ;
   private String A703PrdDscTec ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private String AV32MaqCod ;
   private String AV45Maqdosifp ;
   private String AV47MAQTINTIP ;
   private String A5419MaqSalM ;
   private String A5949MaqDosifP ;
   private String A619MaqTinTip ;
   private boolean n5419MaqSalM ;
   private boolean n5421MaqSalMKf ;
   private boolean n5420MaqSalMKi ;
   private boolean n5950MaqDteCol ;
   private boolean n5949MaqDosifP ;
   private boolean n619MaqTinTip ;
   private java.math.BigDecimal[] aP10 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private int[] aP7 ;
   private short[] aP8 ;
   private int[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P01QM2_A396EmprCod ;
   private String[] P01QM2_A719PrdNum ;
   private String[] P01QM2_A5418PrdSalM ;
   private java.math.BigDecimal[] P01QM2_A5416PrdDensS ;
   private java.math.BigDecimal[] P01QM2_A5417PrdConcS ;
   private String[] P01QM2_A703PrdDscTec ;
   private String[] P01QM3_A396EmprCod ;
   private short[] P01QM3_A2804RecLinMaq ;
   private String[] P01QM3_A130BarCodPar ;
   private byte[] P01QM3_A132BarCodReo ;
   private int[] P01QM3_A129BarCod ;
   private String[] P01QM3_A602MaqCod ;
   private String[] P01QM4_A396EmprCod ;
   private String[] P01QM4_A602MaqCod ;
   private String[] P01QM4_A5419MaqSalM ;
   private boolean[] P01QM4_n5419MaqSalM ;
   private java.math.BigDecimal[] P01QM4_A5421MaqSalMKf ;
   private boolean[] P01QM4_n5421MaqSalMKf ;
   private java.math.BigDecimal[] P01QM4_A5420MaqSalMKi ;
   private boolean[] P01QM4_n5420MaqSalMKi ;
   private int[] P01QM4_A5950MaqDteCol ;
   private boolean[] P01QM4_n5950MaqDteCol ;
   private String[] P01QM4_A5949MaqDosifP ;
   private boolean[] P01QM4_n5949MaqDosifP ;
   private String[] P01QM4_A619MaqTinTip ;
   private boolean[] P01QM4_n619MaqTinTip ;
}

final  class psalmuera__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01QM2", "SELECT EmprCod, PrdNum, PrdSalM, PrdDensS, PrdConcS, PrdDscTec FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01QM3", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01QM4", "SELECT EmprCod, MaqCod, MaqSalM, MaqSalMKf, MaqSalMKi, MaqDteCol, MaqDosifP, MaqTinTip FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

