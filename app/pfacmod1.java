package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfacmod1 extends GXProcedure
{
   public pfacmod1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacmod1.class ), "" );
   }

   public pfacmod1( int remoteHandle ,
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
                                           java.math.BigDecimal[] AV21Tab_kgs ,
                                           java.math.BigDecimal[] AV19Tab_prec ,
                                           byte[] aP14 ,
                                           java.math.BigDecimal[] AV28Tab_Bon ,
                                           java.math.BigDecimal[] AV29Tab_Rec ,
                                           java.math.BigDecimal[] aP17 )
   {
      pfacmod1.this.aP18 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, AV18Tab_dsc, AV20Tab_imp, AV21Tab_kgs, AV19Tab_prec, aP14, AV28Tab_Bon, AV29Tab_Rec, aP17, aP18);
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
                        java.math.BigDecimal[] AV21Tab_kgs ,
                        java.math.BigDecimal[] AV19Tab_prec ,
                        byte[] aP14 ,
                        java.math.BigDecimal[] AV28Tab_Bon ,
                        java.math.BigDecimal[] AV29Tab_Rec ,
                        java.math.BigDecimal[] aP17 ,
                        java.math.BigDecimal[] aP18 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, AV18Tab_dsc, AV20Tab_imp, AV21Tab_kgs, AV19Tab_prec, aP14, AV28Tab_Bon, AV29Tab_Rec, aP17, aP18);
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
                             java.math.BigDecimal[] AV21Tab_kgs ,
                             java.math.BigDecimal[] AV19Tab_prec ,
                             byte[] aP14 ,
                             java.math.BigDecimal[] AV28Tab_Bon ,
                             java.math.BigDecimal[] AV29Tab_Rec ,
                             java.math.BigDecimal[] aP17 ,
                             java.math.BigDecimal[] aP18 )
   {
      pfacmod1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacmod1.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      pfacmod1.this.A427FacAlbCod = aP2[0];
      this.aP2 = aP2;
      pfacmod1.this.A1294FacBarCod = aP3[0];
      this.aP3 = aP3;
      pfacmod1.this.A1295FacBarReo = aP4[0];
      this.aP4 = aP4;
      pfacmod1.this.A1296FacBarPar = aP5[0];
      this.aP5 = aP5;
      pfacmod1.this.AV8FasesDsc = aP6[0];
      this.aP6 = aP6;
      pfacmod1.this.AV22FacPreKgs = aP7[0];
      this.aP7 = aP7;
      pfacmod1.this.AV12FacKgs = aP8[0];
      this.aP8 = aP8;
      pfacmod1.this.AV11ImpFase = aP9[0];
      this.aP9 = aP9;
      pfacmod1.this.AV18Tab_dsc = AV18Tab_dsc;
      pfacmod1.this.AV20Tab_imp = AV20Tab_imp;
      pfacmod1.this.AV21Tab_kgs = AV21Tab_kgs;
      pfacmod1.this.AV19Tab_prec = AV19Tab_prec;
      pfacmod1.this.AV16i = aP14[0];
      this.aP14 = aP14;
      pfacmod1.this.AV28Tab_Bon = AV28Tab_Bon;
      pfacmod1.this.AV29Tab_Rec = AV29Tab_Rec;
      pfacmod1.this.AV26FacBonLi = aP17[0];
      this.aP17 = aP17;
      pfacmod1.this.AV27FacRec = aP18[0];
      this.aP18 = aP18;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FasesDsc = "" ;
      AV22FacPreKgs = DecimalUtil.doubleToDec(0) ;
      AV10FlagFases = (byte)(0) ;
      AV11ImpFase = DecimalUtil.doubleToDec(0) ;
      AV12FacKgs = DecimalUtil.doubleToDec(0) ;
      AV26FacBonLi = DecimalUtil.doubleToDec(0) ;
      AV27FacRec = DecimalUtil.doubleToDec(0) ;
      AV14Cont_f = (short)(0) ;
      AV39Dif_Imp = (byte)(0) ;
      /* Using cursor P039S2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A427FacAlbCod), Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, Integer.valueOf(A430FacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3397FacFasCod = P039S2_A3397FacFasCod[0] ;
         A444FacKgs = P039S2_A444FacKgs[0] ;
         A446FacLin = P039S2_A446FacLin[0] ;
         AV34FacAlbCod = A427FacAlbCod ;
         AV35FacBarCod = A1294FacBarCod ;
         AV36FacBarReo = A1295FacBarReo ;
         AV37FacBarPar = A1296FacBarPar ;
         AV33FasCod = A3397FacFasCod ;
         /* Execute user subroutine: 'ALBFAS' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( A444FacKgs.doubleValue() > 0 ) || ( ( A444FacKgs.doubleValue() == 0 ) && ( AV32KgMin == 1 ) ) )
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
      AV17Last_Kgs = DecimalUtil.doubleToDec(0) ;
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
         AV21Tab_kgs[GX_I-1] = DecimalUtil.doubleToDec(0) ;
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
         AV28Tab_Bon[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV29Tab_Rec[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV24DscFases = "" ;
      AV25TotLin = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P039S3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A427FacAlbCod), Integer.valueOf(A1294FacBarCod), Byte.valueOf(A1295FacBarReo), A1296FacBarPar, Integer.valueOf(A430FacCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A3397FacFasCod = P039S3_A3397FacFasCod[0] ;
         A432FacDsc = P039S3_A432FacDsc[0] ;
         A5050FacBonLi = P039S3_A5050FacBonLi[0] ;
         A451FacRec = P039S3_A451FacRec[0] ;
         A448FacPreKgs = P039S3_A448FacPreKgs[0] ;
         A444FacKgs = P039S3_A444FacKgs[0] ;
         A446FacLin = P039S3_A446FacLin[0] ;
         AV34FacAlbCod = A427FacAlbCod ;
         AV35FacBarCod = A1294FacBarCod ;
         AV36FacBarReo = A1295FacBarReo ;
         AV37FacBarPar = A1296FacBarPar ;
         AV33FasCod = A3397FacFasCod ;
         /* Execute user subroutine: 'ALBFAS' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( A444FacKgs.doubleValue() > 0 ) || ( GXutil.strcmp(A3397FacFasCod, "618     ") == 0 ) || ( ( A444FacKgs.doubleValue() == 0 ) && ( AV32KgMin == 1 ) ) )
         {
            AV13FasDsc = GXutil.trim( GXutil.substring( A432FacDsc, 1, AV15Num_c)) ;
            if ( ( DecimalUtil.compareTo(AV17Last_Kgs, A444FacKgs) != 0 ) && ( AV17Last_Kgs.doubleValue() > 0 ) )
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
               AV22FacPreKgs = DecimalUtil.doubleToDec(0) ;
               AV38ImpFase2 = DecimalUtil.doubleToDec(0) ;
               if ( AV39Dif_Imp == 1 )
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
               AV26FacBonLi = A5050FacBonLi ;
            }
            if ( A451FacRec.doubleValue() != 0 )
            {
               AV27FacRec = A451FacRec ;
            }
            AV41FacPreKgsA = (A444FacKgs.multiply(A448FacPreKgs).multiply(AV27FacRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)).subtract((A444FacKgs.multiply(A448FacPreKgs).multiply(AV26FacBonLi).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
            AV31TotLin2 = (A444FacKgs.multiply(A448FacPreKgs)).add((AV41FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
            AV38ImpFase2 = AV38ImpFase2.add((GXutil.roundDecimal( AV31TotLin2, 2))) ;
            AV12FacKgs = A444FacKgs ;
            AV22FacPreKgs = AV22FacPreKgs.add(A448FacPreKgs) ;
            AV17Last_Kgs = A444FacKgs ;
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
      if ( AV39Dif_Imp == 1 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A430FacCod ;
         GXv_int3[0] = A427FacAlbCod ;
         GXv_int4[0] = A1294FacBarCod ;
         GXv_int5[0] = A1295FacBarReo ;
         GXv_char6[0] = A1296FacBarPar ;
         GXv_char7[0] = AV8FasesDsc ;
         GXv_decimal8[0] = AV22FacPreKgs ;
         GXv_decimal9[0] = AV12FacKgs ;
         GXv_decimal10[0] = AV11ImpFase ;
         GXv_int11[0] = AV16i ;
         GXv_decimal12[0] = AV26FacBonLi ;
         GXv_decimal13[0] = AV27FacRec ;
         new app.pfacmod4(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_int4, GXv_int5, GXv_char6, GXv_char7, GXv_decimal8, GXv_decimal9, GXv_decimal10, AV18Tab_dsc, AV20Tab_imp, AV21Tab_kgs, AV19Tab_prec, GXv_int11, AV28Tab_Bon, AV29Tab_Rec, GXv_decimal12, GXv_decimal13) ;
         pfacmod1.this.A396EmprCod = GXv_char1[0] ;
         pfacmod1.this.A430FacCod = GXv_int2[0] ;
         pfacmod1.this.A427FacAlbCod = GXv_int3[0] ;
         pfacmod1.this.A1294FacBarCod = GXv_int4[0] ;
         pfacmod1.this.A1295FacBarReo = GXv_int5[0] ;
         pfacmod1.this.A1296FacBarPar = GXv_char6[0] ;
         pfacmod1.this.AV8FasesDsc = GXv_char7[0] ;
         pfacmod1.this.AV22FacPreKgs = GXv_decimal8[0] ;
         pfacmod1.this.AV12FacKgs = GXv_decimal9[0] ;
         pfacmod1.this.AV11ImpFase = GXv_decimal10[0] ;
         pfacmod1.this.AV16i = GXv_int11[0] ;
         pfacmod1.this.AV26FacBonLi = GXv_decimal12[0] ;
         pfacmod1.this.AV27FacRec = GXv_decimal13[0] ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ASIGNO_TAB' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A3397FacFasCod, "618     ") == 0 )
      {
         AV25TotLin = AV12FacKgs.multiply(AV22FacPreKgs) ;
         AV11ImpFase = GXutil.roundDecimal( AV25TotLin, 2) ;
         AV38ImpFase2 = AV11ImpFase ;
      }
      else
      {
         AV41FacPreKgsA = (AV12FacKgs.multiply(AV22FacPreKgs).multiply(AV27FacRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN)).subtract((AV12FacKgs.multiply(AV22FacPreKgs).multiply(AV26FacBonLi).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
         AV25TotLin = (AV12FacKgs.multiply(AV22FacPreKgs)).add((AV41FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
         AV11ImpFase = GXutil.roundDecimal( AV25TotLin, 2) ;
      }
      AV16i = (byte)(AV16i+1) ;
      AV18Tab_dsc[AV16i-1] = AV24DscFases ;
      AV20Tab_imp[AV16i-1] = AV11ImpFase ;
      AV21Tab_kgs[AV16i-1] = AV12FacKgs ;
      AV19Tab_prec[AV16i-1] = AV22FacPreKgs ;
      AV28Tab_Bon[AV16i-1] = AV26FacBonLi ;
      AV29Tab_Rec[AV16i-1] = AV27FacRec ;
      AV10FlagFases = (byte)(0) ;
      AV24DscFases = "" ;
      if ( DecimalUtil.compareTo(AV11ImpFase, AV38ImpFase2) != 0 )
      {
         AV39Dif_Imp = (byte)(1) ;
      }
   }

   public void S121( )
   {
      /* 'ALBFAS' Routine */
      returnInSub = false ;
      AV32KgMin = (byte)(0) ;
      /* Using cursor P039S4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(AV34FacAlbCod), Integer.valueOf(AV35FacBarCod), Byte.valueOf(AV36FacBarReo), AV37FacBarPar, AV33FasCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P039S4_A457FasCod[0] ;
         A130BarCodPar = P039S4_A130BarCodPar[0] ;
         A132BarCodReo = P039S4_A132BarCodReo[0] ;
         A129BarCod = P039S4_A129BarCod[0] ;
         A30AlbProCod = P039S4_A30AlbProCod[0] ;
         A8194GuiFasPBK = P039S4_A8194GuiFasPBK[0] ;
         n8194GuiFasPBK = P039S4_n8194GuiFasPBK[0] ;
         A1275FasKgm = P039S4_A1275FasKgm[0] ;
         A1240GuiFasLin = P039S4_A1240GuiFasLin[0] ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1275FasKgm)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A8194GuiFasPBK)==0) )
         {
            AV32KgMin = (byte)(1) ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacmod1.this.A396EmprCod;
      this.aP1[0] = pfacmod1.this.A430FacCod;
      this.aP2[0] = pfacmod1.this.A427FacAlbCod;
      this.aP3[0] = pfacmod1.this.A1294FacBarCod;
      this.aP4[0] = pfacmod1.this.A1295FacBarReo;
      this.aP5[0] = pfacmod1.this.A1296FacBarPar;
      this.aP6[0] = pfacmod1.this.AV8FasesDsc;
      this.aP7[0] = pfacmod1.this.AV22FacPreKgs;
      this.aP8[0] = pfacmod1.this.AV12FacKgs;
      this.aP9[0] = pfacmod1.this.AV11ImpFase;
      this.aP14[0] = pfacmod1.this.AV16i;
      this.aP17[0] = pfacmod1.this.AV26FacBonLi;
      this.aP18[0] = pfacmod1.this.AV27FacRec;
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
      P039S2_A396EmprCod = new String[] {""} ;
      P039S2_A430FacCod = new int[1] ;
      P039S2_A427FacAlbCod = new long[1] ;
      P039S2_A1294FacBarCod = new int[1] ;
      P039S2_A1295FacBarReo = new byte[1] ;
      P039S2_A1296FacBarPar = new String[] {""} ;
      P039S2_A3397FacFasCod = new String[] {""} ;
      P039S2_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039S2_A446FacLin = new int[1] ;
      A3397FacFasCod = "" ;
      A444FacKgs = DecimalUtil.ZERO ;
      AV37FacBarPar = "" ;
      AV33FasCod = "" ;
      AV17Last_Kgs = DecimalUtil.ZERO ;
      AV24DscFases = "" ;
      AV25TotLin = DecimalUtil.ZERO ;
      P039S3_A396EmprCod = new String[] {""} ;
      P039S3_A430FacCod = new int[1] ;
      P039S3_A427FacAlbCod = new long[1] ;
      P039S3_A1294FacBarCod = new int[1] ;
      P039S3_A1295FacBarReo = new byte[1] ;
      P039S3_A1296FacBarPar = new String[] {""} ;
      P039S3_A3397FacFasCod = new String[] {""} ;
      P039S3_A432FacDsc = new String[] {""} ;
      P039S3_A5050FacBonLi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039S3_A451FacRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039S3_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039S3_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039S3_A446FacLin = new int[1] ;
      A432FacDsc = "" ;
      A5050FacBonLi = DecimalUtil.ZERO ;
      A451FacRec = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      AV13FasDsc = "" ;
      AV38ImpFase2 = DecimalUtil.ZERO ;
      AV41FacPreKgsA = DecimalUtil.ZERO ;
      AV31TotLin2 = DecimalUtil.ZERO ;
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
      P039S4_A396EmprCod = new String[] {""} ;
      P039S4_A457FasCod = new String[] {""} ;
      P039S4_A130BarCodPar = new String[] {""} ;
      P039S4_A132BarCodReo = new byte[1] ;
      P039S4_A129BarCod = new int[1] ;
      P039S4_A30AlbProCod = new long[1] ;
      P039S4_A8194GuiFasPBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039S4_n8194GuiFasPBK = new boolean[] {false} ;
      P039S4_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P039S4_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A130BarCodPar = "" ;
      A8194GuiFasPBK = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfacmod1__default(),
         new Object[] {
             new Object[] {
            P039S2_A396EmprCod, P039S2_A430FacCod, P039S2_A427FacAlbCod, P039S2_A1294FacBarCod, P039S2_A1295FacBarReo, P039S2_A1296FacBarPar, P039S2_A3397FacFasCod, P039S2_A444FacKgs, P039S2_A446FacLin
            }
            , new Object[] {
            P039S3_A396EmprCod, P039S3_A430FacCod, P039S3_A427FacAlbCod, P039S3_A1294FacBarCod, P039S3_A1295FacBarReo, P039S3_A1296FacBarPar, P039S3_A3397FacFasCod, P039S3_A432FacDsc, P039S3_A5050FacBonLi, P039S3_A451FacRec,
            P039S3_A448FacPreKgs, P039S3_A444FacKgs, P039S3_A446FacLin
            }
            , new Object[] {
            P039S4_A396EmprCod, P039S4_A457FasCod, P039S4_A130BarCodPar, P039S4_A132BarCodReo, P039S4_A129BarCod, P039S4_A30AlbProCod, P039S4_A8194GuiFasPBK, P039S4_n8194GuiFasPBK, P039S4_A1275FasKgm, P039S4_A1240GuiFasLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1295FacBarReo ;
   private byte AV16i ;
   private byte AV10FlagFases ;
   private byte AV39Dif_Imp ;
   private byte AV36FacBarReo ;
   private byte AV32KgMin ;
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
   private int AV35FacBarCod ;
   private int GX_I ;
   private int GXv_int2[] ;
   private int GXv_int4[] ;
   private int A129BarCod ;
   private long A427FacAlbCod ;
   private long AV34FacAlbCod ;
   private long GXv_int3[] ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV22FacPreKgs ;
   private java.math.BigDecimal AV12FacKgs ;
   private java.math.BigDecimal AV11ImpFase ;
   private java.math.BigDecimal AV20Tab_imp[] ;
   private java.math.BigDecimal AV21Tab_kgs[] ;
   private java.math.BigDecimal AV19Tab_prec[] ;
   private java.math.BigDecimal AV28Tab_Bon[] ;
   private java.math.BigDecimal AV29Tab_Rec[] ;
   private java.math.BigDecimal AV26FacBonLi ;
   private java.math.BigDecimal AV27FacRec ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal AV17Last_Kgs ;
   private java.math.BigDecimal AV25TotLin ;
   private java.math.BigDecimal A5050FacBonLi ;
   private java.math.BigDecimal A451FacRec ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal AV38ImpFase2 ;
   private java.math.BigDecimal AV41FacPreKgsA ;
   private java.math.BigDecimal AV31TotLin2 ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal A8194GuiFasPBK ;
   private java.math.BigDecimal A1275FasKgm ;
   private String A396EmprCod ;
   private String A1296FacBarPar ;
   private String AV8FasesDsc ;
   private String AV18Tab_dsc[] ;
   private String scmdbuf ;
   private String A3397FacFasCod ;
   private String AV37FacBarPar ;
   private String AV33FasCod ;
   private String AV24DscFases ;
   private String A432FacDsc ;
   private String AV13FasDsc ;
   private String GXv_char1[] ;
   private String GXv_char6[] ;
   private String GXv_char7[] ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean n8194GuiFasPBK ;
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
   private String[] P039S2_A396EmprCod ;
   private int[] P039S2_A430FacCod ;
   private long[] P039S2_A427FacAlbCod ;
   private int[] P039S2_A1294FacBarCod ;
   private byte[] P039S2_A1295FacBarReo ;
   private String[] P039S2_A1296FacBarPar ;
   private String[] P039S2_A3397FacFasCod ;
   private java.math.BigDecimal[] P039S2_A444FacKgs ;
   private int[] P039S2_A446FacLin ;
   private String[] P039S3_A396EmprCod ;
   private int[] P039S3_A430FacCod ;
   private long[] P039S3_A427FacAlbCod ;
   private int[] P039S3_A1294FacBarCod ;
   private byte[] P039S3_A1295FacBarReo ;
   private String[] P039S3_A1296FacBarPar ;
   private String[] P039S3_A3397FacFasCod ;
   private String[] P039S3_A432FacDsc ;
   private java.math.BigDecimal[] P039S3_A5050FacBonLi ;
   private java.math.BigDecimal[] P039S3_A451FacRec ;
   private java.math.BigDecimal[] P039S3_A448FacPreKgs ;
   private java.math.BigDecimal[] P039S3_A444FacKgs ;
   private int[] P039S3_A446FacLin ;
   private String[] P039S4_A396EmprCod ;
   private String[] P039S4_A457FasCod ;
   private String[] P039S4_A130BarCodPar ;
   private byte[] P039S4_A132BarCodReo ;
   private int[] P039S4_A129BarCod ;
   private long[] P039S4_A30AlbProCod ;
   private java.math.BigDecimal[] P039S4_A8194GuiFasPBK ;
   private boolean[] P039S4_n8194GuiFasPBK ;
   private java.math.BigDecimal[] P039S4_A1275FasKgm ;
   private short[] P039S4_A1240GuiFasLin ;
}

final  class pfacmod1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P039S2", "SELECT EmprCod, FacCod, FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacFasCod, FacKgs, FacLin FROM TXPLFAVEN WHERE (EmprCod = ? and FacAlbCod = ? and FacBarCod = ? and FacBarReo = ? and FacBarPar = ?) AND (FacCod = ?) AND (Not (rtrim(FacFasCod) IS NULL AND NOT(FacFasCod IS NULL))) ORDER BY EmprCod, FacAlbCod, FacBarCod, FacBarReo, FacBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P039S3", "SELECT EmprCod, FacCod, FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacFasCod, FacDsc, FacBonLi, FacRec, FacPreKgs, FacKgs, FacLin FROM TXPLFAVEN WHERE (EmprCod = ? and FacAlbCod = ? and FacBarCod = ? and FacBarReo = ? and FacBarPar = ?) AND (FacCod = ?) AND (Not (rtrim(FacFasCod) IS NULL AND NOT(FacFasCod IS NULL))) ORDER BY EmprCod, FacAlbCod, FacBarCod, FacBarReo, FacBarPar, FacKgs ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P039S4", "SELECT EmprCod, FasCod, BarCodPar, BarCodReo, BarCod, AlbProCod, GuiFasPBK, FasKgm, GuiFasLin FROM TXPALBFAS WHERE (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
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
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
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
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
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

