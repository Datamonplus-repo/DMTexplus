package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacmod5 extends GXProcedure
{
   public pfacmod5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacmod5.class ), "" );
   }

   public pfacmod5( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           long[] aP2 ,
                                           int[] aP3 ,
                                           byte[] aP4 ,
                                           String[] aP5 ,
                                           String[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           java.math.BigDecimal[] aP8 ,
                                           java.math.BigDecimal[] aP9 ,
                                           String[] AV18Tab_dsc ,
                                           java.math.BigDecimal[] AV20Tab_imp ,
                                           java.math.BigDecimal[] AV21Tab_Mts ,
                                           java.math.BigDecimal[] AV19Tab_prec ,
                                           byte[] aP14 ,
                                           java.math.BigDecimal[] AV26Tab_Bon ,
                                           java.math.BigDecimal[] AV27Tab_Rec ,
                                           java.math.BigDecimal[] aP17 )
   {
      pfacmod5.this.aP18 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, AV18Tab_dsc, AV20Tab_imp, AV21Tab_Mts, AV19Tab_prec, aP14, AV26Tab_Bon, AV27Tab_Rec, aP17, aP18);
      return aP18[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        long[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        String[] AV18Tab_dsc ,
                        java.math.BigDecimal[] AV20Tab_imp ,
                        java.math.BigDecimal[] AV21Tab_Mts ,
                        java.math.BigDecimal[] AV19Tab_prec ,
                        byte[] aP14 ,
                        java.math.BigDecimal[] AV26Tab_Bon ,
                        java.math.BigDecimal[] AV27Tab_Rec ,
                        java.math.BigDecimal[] aP17 ,
                        java.math.BigDecimal[] aP18 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, AV18Tab_dsc, AV20Tab_imp, AV21Tab_Mts, AV19Tab_prec, aP14, AV26Tab_Bon, AV27Tab_Rec, aP17, aP18);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             long[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] AV18Tab_dsc ,
                             java.math.BigDecimal[] AV20Tab_imp ,
                             java.math.BigDecimal[] AV21Tab_Mts ,
                             java.math.BigDecimal[] AV19Tab_prec ,
                             byte[] aP14 ,
                             java.math.BigDecimal[] AV26Tab_Bon ,
                             java.math.BigDecimal[] AV27Tab_Rec ,
                             java.math.BigDecimal[] aP17 ,
                             java.math.BigDecimal[] aP18 )
   {
      pfacmod5.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacmod5.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      pfacmod5.this.A427FacAlbCod = aP2[0];
      this.aP2 = aP2;
      pfacmod5.this.A1294FacBarCod = aP3[0];
      this.aP3 = aP3;
      pfacmod5.this.A1295FacBarReo = aP4[0];
      this.aP4 = aP4;
      pfacmod5.this.A1296FacBarPar = aP5[0];
      this.aP5 = aP5;
      pfacmod5.this.AV8FasesDsc = aP6[0];
      this.aP6 = aP6;
      pfacmod5.this.AV22FacPreMts = aP7[0];
      this.aP7 = aP7;
      pfacmod5.this.AV12FacMts = aP8[0];
      this.aP8 = aP8;
      pfacmod5.this.AV11ImpFase = aP9[0];
      this.aP9 = aP9;
      pfacmod5.this.AV18Tab_dsc = AV18Tab_dsc;
      pfacmod5.this.AV20Tab_imp = AV20Tab_imp;
      pfacmod5.this.AV21Tab_Mts = AV21Tab_Mts;
      pfacmod5.this.AV19Tab_prec = AV19Tab_prec;
      pfacmod5.this.AV16i = aP14[0];
      this.aP14 = aP14;
      pfacmod5.this.AV26Tab_Bon = AV26Tab_Bon;
      pfacmod5.this.AV27Tab_Rec = AV27Tab_Rec;
      pfacmod5.this.AV28FacBonLi = aP17[0];
      this.aP17 = aP17;
      pfacmod5.this.AV29FacRec = aP18[0];
      this.aP18 = aP18;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FasesDsc = "" ;
      AV22FacPreMts = DecimalUtil.doubleToDec(0) ;
      AV10FlagFases = (byte)(0) ;
      AV11ImpFase = DecimalUtil.doubleToDec(0) ;
      AV12FacMts = DecimalUtil.doubleToDec(0) ;
      AV28FacBonLi = DecimalUtil.doubleToDec(0) ;
      AV29FacRec = DecimalUtil.doubleToDec(0) ;
      AV14Cont_f = (short)(0) ;
      AV37Dif_Imp = (byte)(0) ;
      /* Using cursor P039T2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A427FacAlbCod), Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, Integer.valueOf(A430FacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3397FacFasCod = P039T2_A3397FacFasCod[0] ;
         A449FacPreMts = P039T2_A449FacPreMts[0] ;
         A446FacLin = P039T2_A446FacLin[0] ;
         AV32FacAlbCod = A427FacAlbCod ;
         AV33FacBarCod = A1294FacBarCod ;
         AV34FacBarReo = A1295FacBarReo ;
         AV35FacBarPar = A1296FacBarPar ;
         AV36FasCod = A3397FacFasCod ;
         /* Execute user subroutine: 'ALBFAS' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( A449FacPreMts.doubleValue() > 0 ) || ( ( A449FacPreMts.doubleValue() == 0 ) && ( AV31MtMin == 1 ) ) )
         {
            AV14Cont_f = (short)(AV14Cont_f+1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV15Num_c = (short)(0) ;
      if ( AV14Cont_f > 0 )
      {
         AV15Num_c = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(65/ (double) (AV14Cont_f)), 0))) ;
      }
      AV16i = (byte)(0) ;
      AV17Last_Mts = DecimalUtil.doubleToDec(0) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV18Tab_dsc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV20Tab_imp[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV21Tab_Mts[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV19Tab_prec[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV26Tab_Bon[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV27Tab_Rec[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV24DscFases = "" ;
      AV25TotLin = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P039T3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A427FacAlbCod), Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, Integer.valueOf(A430FacCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A3397FacFasCod = P039T3_A3397FacFasCod[0] ;
         A449FacPreMts = P039T3_A449FacPreMts[0] ;
         A432FacDsc = P039T3_A432FacDsc[0] ;
         A5050FacBonLi = P039T3_A5050FacBonLi[0] ;
         A451FacRec = P039T3_A451FacRec[0] ;
         A447FacMts = P039T3_A447FacMts[0] ;
         A446FacLin = P039T3_A446FacLin[0] ;
         AV32FacAlbCod = A427FacAlbCod ;
         AV33FacBarCod = A1294FacBarCod ;
         AV34FacBarReo = A1295FacBarReo ;
         AV35FacBarPar = A1296FacBarPar ;
         AV36FasCod = A3397FacFasCod ;
         /* Execute user subroutine: 'ALBFAS' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( A449FacPreMts.doubleValue() > 0 ) || ( ( A449FacPreMts.doubleValue() == 0 ) && ( AV31MtMin == 1 ) ) )
         {
            AV13FasDsc = GXutil.trim( GXutil.substring( A432FacDsc, 1, AV15Num_c)) ;
            if ( ( DecimalUtil.compareTo(AV17Last_Mts, A447FacMts) != 0 ) && ( AV17Last_Mts.doubleValue() > 0 ) )
            {
               /* Execute user subroutine: 'ASIGNO_TAB' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV22FacPreMts = DecimalUtil.doubleToDec(0) ;
               AV38ImpFase2 = DecimalUtil.doubleToDec(0) ;
               if ( AV37Dif_Imp == 1 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
            if ( AV10FlagFases == 0 )
            {
               AV10FlagFases = (byte)(1) ;
               AV8FasesDsc = GXutil.trim( AV13FasDsc) ;
               AV24DscFases = GXutil.trim( AV13FasDsc) ;
            }
            else
            {
               AV8FasesDsc = GXutil.concat( AV8FasesDsc, AV13FasDsc, "+") ;
               AV24DscFases = GXutil.concat( AV24DscFases, AV13FasDsc, "+") ;
            }
            if ( A5050FacBonLi.doubleValue() != 0 )
            {
               AV28FacBonLi = A5050FacBonLi ;
            }
            if ( A451FacRec.doubleValue() != 0 )
            {
               AV29FacRec = A451FacRec ;
            }
            AV40FacPreKgsA = (A447FacMts.multiply(A449FacPreMts).multiply(AV29FacRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)).subtract((A447FacMts.multiply(A449FacPreMts).multiply(AV28FacBonLi).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
            AV39TotLin2 = (A447FacMts.multiply(A449FacPreMts)).add((AV40FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
            AV38ImpFase2 = AV38ImpFase2.add((GXutil.roundDecimal( AV39TotLin2, 2))) ;
            AV12FacMts = A447FacMts ;
            AV22FacPreMts = AV22FacPreMts.add(A449FacPreMts) ;
            AV17Last_Mts = A447FacMts ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Execute user subroutine: 'ASIGNO_TAB' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV37Dif_Imp == 1 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A430FacCod ;
         GXv_int3[0] = A427FacAlbCod ;
         GXv_int4[0] = A1294FacBarCod ;
         GXv_int5[0] = A1295FacBarReo ;
         GXv_char6[0] = A1296FacBarPar ;
         GXv_char7[0] = AV8FasesDsc ;
         GXv_decimal8[0] = AV22FacPreMts ;
         GXv_decimal9[0] = AV12FacMts ;
         GXv_decimal10[0] = AV11ImpFase ;
         GXv_int11[0] = AV16i ;
         GXv_decimal12[0] = AV28FacBonLi ;
         GXv_decimal13[0] = AV29FacRec ;
         new app.pfacmod6(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_int5, GXv_char6, GXv_char7, GXv_decimal8, GXv_decimal9, GXv_decimal10, AV18Tab_dsc, AV20Tab_imp, AV21Tab_Mts, AV19Tab_prec, GXv_int11, AV26Tab_Bon, AV27Tab_Rec, GXv_decimal12, GXv_decimal13) ;
         pfacmod5.this.A396EmprCod = GXv_char1[0] ;
         pfacmod5.this.A430FacCod = GXv_int2[0] ;
         pfacmod5.this.A427FacAlbCod = GXv_int3[0] ;
         pfacmod5.this.A1294FacBarCod = GXv_int4[0] ;
         pfacmod5.this.A1295FacBarReo = GXv_int5[0] ;
         pfacmod5.this.A1296FacBarPar = GXv_char6[0] ;
         pfacmod5.this.AV8FasesDsc = GXv_char7[0] ;
         pfacmod5.this.AV22FacPreMts = GXv_decimal8[0] ;
         pfacmod5.this.AV12FacMts = GXv_decimal9[0] ;
         pfacmod5.this.AV11ImpFase = GXv_decimal10[0] ;
         pfacmod5.this.AV16i = GXv_int11[0] ;
         pfacmod5.this.AV28FacBonLi = GXv_decimal12[0] ;
         pfacmod5.this.AV29FacRec = GXv_decimal13[0] ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ASIGNO_TAB' Routine */
      returnInSub = false ;
      AV40FacPreKgsA = (AV12FacMts.multiply(AV22FacPreMts).multiply(AV29FacRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)).subtract((AV12FacMts.multiply(AV22FacPreMts).multiply(AV28FacBonLi).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
      AV25TotLin = (AV12FacMts.multiply(AV22FacPreMts)).add((AV40FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
      AV11ImpFase = GXutil.roundDecimal( AV25TotLin, 2) ;
      AV16i = (byte)(AV16i+1) ;
      AV18Tab_dsc[AV16i-1] = AV24DscFases ;
      AV20Tab_imp[AV16i-1] = AV11ImpFase ;
      AV21Tab_Mts[AV16i-1] = AV12FacMts ;
      AV19Tab_prec[AV16i-1] = AV22FacPreMts ;
      AV26Tab_Bon[AV16i-1] = AV28FacBonLi ;
      AV27Tab_Rec[AV16i-1] = AV29FacRec ;
      AV10FlagFases = (byte)(0) ;
      AV24DscFases = "" ;
      if ( DecimalUtil.compareTo(AV11ImpFase, AV38ImpFase2) != 0 )
      {
         AV37Dif_Imp = (byte)(1) ;
      }
   }

   public void S121( )
   {
      /* 'ALBFAS' Routine */
      returnInSub = false ;
      AV31MtMin = (byte)(0) ;
      /* Using cursor P039T4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(AV32FacAlbCod), Integer.valueOf(AV33FacBarCod), Byte.valueOf(AV34FacBarReo), AV35FacBarPar, AV36FasCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P039T4_A457FasCod[0] ;
         A130BarCodPar = P039T4_A130BarCodPar[0] ;
         A132BarCodReo = P039T4_A132BarCodReo[0] ;
         A129BarCod = P039T4_A129BarCod[0] ;
         A30AlbProCod = P039T4_A30AlbProCod[0] ;
         A8195GuiFasPBM = P039T4_A8195GuiFasPBM[0] ;
         n8195GuiFasPBM = P039T4_n8195GuiFasPBM[0] ;
         A1242GuiFasPMt = P039T4_A1242GuiFasPMt[0] ;
         A1240GuiFasLin = P039T4_A1240GuiFasLin[0] ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1242GuiFasPMt)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A8195GuiFasPBM)==0) )
         {
            AV31MtMin = (byte)(1) ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacmod5.this.A396EmprCod;
      this.aP1[0] = pfacmod5.this.A430FacCod;
      this.aP2[0] = pfacmod5.this.A427FacAlbCod;
      this.aP3[0] = pfacmod5.this.A1294FacBarCod;
      this.aP4[0] = pfacmod5.this.A1295FacBarReo;
      this.aP5[0] = pfacmod5.this.A1296FacBarPar;
      this.aP6[0] = pfacmod5.this.AV8FasesDsc;
      this.aP7[0] = pfacmod5.this.AV22FacPreMts;
      this.aP8[0] = pfacmod5.this.AV12FacMts;
      this.aP9[0] = pfacmod5.this.AV11ImpFase;
      this.aP14[0] = pfacmod5.this.AV16i;
      this.aP17[0] = pfacmod5.this.AV28FacBonLi;
      this.aP18[0] = pfacmod5.this.AV29FacRec;
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
      P039T2_A396EmprCod = new String[] {""} ;
      P039T2_A430FacCod = new int[1] ;
      P039T2_A427FacAlbCod = new long[1] ;
      P039T2_A1294FacBarCod = new int[1] ;
      P039T2_A1295FacBarReo = new byte[1] ;
      P039T2_A1296FacBarPar = new String[] {""} ;
      P039T2_A3397FacFasCod = new String[] {""} ;
      P039T2_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039T2_A446FacLin = new int[1] ;
      A3397FacFasCod = "" ;
      A449FacPreMts = DecimalUtil.ZERO ;
      AV35FacBarPar = "" ;
      AV36FasCod = "" ;
      AV17Last_Mts = DecimalUtil.ZERO ;
      AV24DscFases = "" ;
      AV25TotLin = DecimalUtil.ZERO ;
      P039T3_A396EmprCod = new String[] {""} ;
      P039T3_A430FacCod = new int[1] ;
      P039T3_A427FacAlbCod = new long[1] ;
      P039T3_A1294FacBarCod = new int[1] ;
      P039T3_A1295FacBarReo = new byte[1] ;
      P039T3_A1296FacBarPar = new String[] {""} ;
      P039T3_A3397FacFasCod = new String[] {""} ;
      P039T3_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039T3_A432FacDsc = new String[] {""} ;
      P039T3_A5050FacBonLi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039T3_A451FacRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039T3_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039T3_A446FacLin = new int[1] ;
      A432FacDsc = "" ;
      A5050FacBonLi = DecimalUtil.ZERO ;
      A451FacRec = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      AV13FasDsc = "" ;
      AV38ImpFase2 = DecimalUtil.ZERO ;
      AV40FacPreKgsA = DecimalUtil.ZERO ;
      AV39TotLin2 = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new long[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char6 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int11 = new byte[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      P039T4_A396EmprCod = new String[] {""} ;
      P039T4_A457FasCod = new String[] {""} ;
      P039T4_A130BarCodPar = new String[] {""} ;
      P039T4_A132BarCodReo = new byte[1] ;
      P039T4_A129BarCod = new int[1] ;
      P039T4_A30AlbProCod = new long[1] ;
      P039T4_A8195GuiFasPBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039T4_n8195GuiFasPBM = new boolean[] {false} ;
      P039T4_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039T4_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A130BarCodPar = "" ;
      A8195GuiFasPBM = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfacmod5__default(),
         new Object[] {
             new Object[] {
            P039T2_A396EmprCod, P039T2_A430FacCod, P039T2_A427FacAlbCod, P039T2_A1294FacBarCod, P039T2_A1295FacBarReo, P039T2_A1296FacBarPar, P039T2_A3397FacFasCod, P039T2_A449FacPreMts, P039T2_A446FacLin
            }
            , new Object[] {
            P039T3_A396EmprCod, P039T3_A430FacCod, P039T3_A427FacAlbCod, P039T3_A1294FacBarCod, P039T3_A1295FacBarReo, P039T3_A1296FacBarPar, P039T3_A3397FacFasCod, P039T3_A449FacPreMts, P039T3_A432FacDsc, P039T3_A5050FacBonLi,
            P039T3_A451FacRec, P039T3_A447FacMts, P039T3_A446FacLin
            }
            , new Object[] {
            P039T4_A396EmprCod, P039T4_A457FasCod, P039T4_A130BarCodPar, P039T4_A132BarCodReo, P039T4_A129BarCod, P039T4_A30AlbProCod, P039T4_A8195GuiFasPBM, P039T4_n8195GuiFasPBM, P039T4_A1242GuiFasPMt, P039T4_A1240GuiFasLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1295FacBarReo ;
   private byte AV16i ;
   private byte AV10FlagFases ;
   private byte AV37Dif_Imp ;
   private byte AV34FacBarReo ;
   private byte AV31MtMin ;
   private byte GXv_int5[] ;
   private byte GXv_int11[] ;
   private byte A132BarCodReo ;
   private short AV14Cont_f ;
   private short AV15Num_c ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A430FacCod ;
   private int A1294FacBarCod ;
   private int A446FacLin ;
   private int AV33FacBarCod ;
   private int GX_I ;
   private int GXv_int2[] ;
   private int GXv_int4[] ;
   private int A129BarCod ;
   private long A427FacAlbCod ;
   private long AV32FacAlbCod ;
   private long GXv_int3[] ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV22FacPreMts ;
   private java.math.BigDecimal AV12FacMts ;
   private java.math.BigDecimal AV11ImpFase ;
   private java.math.BigDecimal AV20Tab_imp[] ;
   private java.math.BigDecimal AV21Tab_Mts[] ;
   private java.math.BigDecimal AV19Tab_prec[] ;
   private java.math.BigDecimal AV26Tab_Bon[] ;
   private java.math.BigDecimal AV27Tab_Rec[] ;
   private java.math.BigDecimal AV28FacBonLi ;
   private java.math.BigDecimal AV29FacRec ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal AV17Last_Mts ;
   private java.math.BigDecimal AV25TotLin ;
   private java.math.BigDecimal A5050FacBonLi ;
   private java.math.BigDecimal A451FacRec ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal AV38ImpFase2 ;
   private java.math.BigDecimal AV40FacPreKgsA ;
   private java.math.BigDecimal AV39TotLin2 ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal A8195GuiFasPBM ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private String A396EmprCod ;
   private String A1296FacBarPar ;
   private String AV8FasesDsc ;
   private String AV18Tab_dsc[] ;
   private String scmdbuf ;
   private String A3397FacFasCod ;
   private String AV35FacBarPar ;
   private String AV36FasCod ;
   private String AV24DscFases ;
   private String A432FacDsc ;
   private String AV13FasDsc ;
   private String GXv_char1[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean n8195GuiFasPBM ;
   private java.math.BigDecimal[] aP18 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private long[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private byte[] aP14 ;
   private java.math.BigDecimal[] aP17 ;
   private IDataStoreProvider pr_default ;
   private String[] P039T2_A396EmprCod ;
   private int[] P039T2_A430FacCod ;
   private long[] P039T2_A427FacAlbCod ;
   private int[] P039T2_A1294FacBarCod ;
   private byte[] P039T2_A1295FacBarReo ;
   private String[] P039T2_A1296FacBarPar ;
   private String[] P039T2_A3397FacFasCod ;
   private java.math.BigDecimal[] P039T2_A449FacPreMts ;
   private int[] P039T2_A446FacLin ;
   private String[] P039T3_A396EmprCod ;
   private int[] P039T3_A430FacCod ;
   private long[] P039T3_A427FacAlbCod ;
   private int[] P039T3_A1294FacBarCod ;
   private byte[] P039T3_A1295FacBarReo ;
   private String[] P039T3_A1296FacBarPar ;
   private String[] P039T3_A3397FacFasCod ;
   private java.math.BigDecimal[] P039T3_A449FacPreMts ;
   private String[] P039T3_A432FacDsc ;
   private java.math.BigDecimal[] P039T3_A5050FacBonLi ;
   private java.math.BigDecimal[] P039T3_A451FacRec ;
   private java.math.BigDecimal[] P039T3_A447FacMts ;
   private int[] P039T3_A446FacLin ;
   private String[] P039T4_A396EmprCod ;
   private String[] P039T4_A457FasCod ;
   private String[] P039T4_A130BarCodPar ;
   private byte[] P039T4_A132BarCodReo ;
   private int[] P039T4_A129BarCod ;
   private long[] P039T4_A30AlbProCod ;
   private java.math.BigDecimal[] P039T4_A8195GuiFasPBM ;
   private boolean[] P039T4_n8195GuiFasPBM ;
   private java.math.BigDecimal[] P039T4_A1242GuiFasPMt ;
   private short[] P039T4_A1240GuiFasLin ;
}

final  class pfacmod5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P039T2", "SELECT EmprCod, FacCod, FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacFasCod, FacPreMts, FacLin FROM TXPLFAVEN WHERE (EmprCod = ? and FacAlbCod = ? and FacBarCod = ? and FacBarReo = ? and FacBarPar = ?) AND (FacCod = ?) AND (Not (rtrim(FacFasCod) IS NULL AND NOT(FacFasCod IS NULL))) ORDER BY EmprCod, FacAlbCod, FacBarCod, FacBarReo, FacBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P039T3", "SELECT EmprCod, FacCod, FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacFasCod, FacPreMts, FacDsc, FacBonLi, FacRec, FacMts, FacLin FROM TXPLFAVEN WHERE (EmprCod = ? and FacAlbCod = ? and FacBarCod = ? and FacBarReo = ? and FacBarPar = ?) AND (FacCod = ?) AND (Not (rtrim(FacFasCod) IS NULL AND NOT(FacFasCod IS NULL))) ORDER BY EmprCod, FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacMts ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P039T4", "SELECT EmprCod, FasCod, BarCodPar, BarCodReo, BarCod, AlbProCod, GuiFasPBM, GuiFasPMt, GuiFasLin FROM TXPALBFAS WHERE (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((short[]) buf[9])[0] = rslt.getShort(9);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               return;
      }
   }

}

