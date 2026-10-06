package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppsimop1 extends GXProcedure
{
   public ppsimop1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppsimop1.class ), "" );
   }

   public ppsimop1( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           int[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.util.Date[] aP6 )
   {
      ppsimop1.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.util.Date[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.util.Date[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      ppsimop1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppsimop1.this.AV45Barcod = aP1[0];
      this.aP1 = aP1;
      ppsimop1.this.AV46barcodreo = aP2[0];
      this.aP2 = aP2;
      ppsimop1.this.AV47Barcodpar = aP3[0];
      this.aP3 = aP3;
      ppsimop1.this.AV48barpie = aP4[0];
      this.aP4 = aP4;
      ppsimop1.this.AV49Tipartprod = aP5[0];
      this.aP5 = aP5;
      ppsimop1.this.AV52Barfecclip = aP6[0];
      this.aP6 = aP6;
      ppsimop1.this.AV53Sum_dias = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV77Jordada ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "JORNAD", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      ppsimop1.this.A396EmprCod = GXv_char2[0] ;
      ppsimop1.this.GXt_int1 = GXv_int4[0] ;
      AV77Jordada = (short)(GXt_int1) ;
      AV63BarFeccli = AV52Barfecclip ;
      AV78Resto = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02VD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV45Barcod), Byte.valueOf(AV46barcodreo), AV47Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P02VD2_A457FasCod[0] ;
         A130BarCodPar = P02VD2_A130BarCodPar[0] ;
         A132BarCodReo = P02VD2_A132BarCodReo[0] ;
         A129BarCod = P02VD2_A129BarCod[0] ;
         A7912Barfastpp = P02VD2_A7912Barfastpp[0] ;
         n7912Barfastpp = P02VD2_n7912Barfastpp[0] ;
         A6879FasTpp = P02VD2_A6879FasTpp[0] ;
         n6879FasTpp = P02VD2_n6879FasTpp[0] ;
         A603MaqCodBis = P02VD2_A603MaqCodBis[0] ;
         A7071Tip_CodFas = P02VD2_A7071Tip_CodFas[0] ;
         n7071Tip_CodFas = P02VD2_n7071Tip_CodFas[0] ;
         A194BarOrdLin = P02VD2_A194BarOrdLin[0] ;
         A758ProCod = P02VD2_A758ProCod[0] ;
         A6879FasTpp = P02VD2_A6879FasTpp[0] ;
         n6879FasTpp = P02VD2_n6879FasTpp[0] ;
         A7071Tip_CodFas = P02VD2_A7071Tip_CodFas[0] ;
         n7071Tip_CodFas = P02VD2_n7071Tip_CodFas[0] ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A7912Barfastpp)==0) )
         {
            AV81Barfastpp = A7912Barfastpp ;
         }
         else
         {
            AV81Barfastpp = A6879FasTpp ;
         }
         AV54Maqcod = A603MaqCodBis ;
         /* Execute user subroutine: 'MAQUIN' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV58Tip_codfas = A7071Tip_CodFas ;
         /* Execute user subroutine: 'NUMOPE' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV59Min_r = DecimalUtil.doubleToDec(0) ;
         if ( AV49Tipartprod.doubleValue() > 0 )
         {
            AV59Min_r = AV81Barfastpp.multiply(DecimalUtil.doubleToDec(AV48barpie)).divide((AV49Tipartprod), 18, java.math.RoundingMode.DOWN) ;
         }
         AV60Dias = DecimalUtil.doubleToDec(0) ;
         if ( (AV57NUM_OPE.multiply(DecimalUtil.doubleToDec(AV77Jordada))).doubleValue() > 0 )
         {
            AV60Dias = AV59Min_r.divide((AV57NUM_OPE.multiply(DecimalUtil.doubleToDec(AV77Jordada))), 18, java.math.RoundingMode.DOWN) ;
         }
         /* Execute user subroutine: 'CFECHA' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV61resto_p = AV78Resto ;
         AV53Sum_dias = AV53Sum_dias.add(AV60Dias) ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = AV45Barcod ;
         GXv_int5[0] = AV46barcodreo ;
         GXv_char2[0] = AV47Barcodpar ;
         GXv_char6[0] = A758ProCod ;
         GXv_int7[0] = A194BarOrdLin ;
         GXv_date8[0] = AV62Fecteo ;
         new app.psimop0(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_char6, GXv_int7, GXv_date8) ;
         ppsimop1.this.A396EmprCod = GXv_char3[0] ;
         ppsimop1.this.AV45Barcod = GXv_int4[0] ;
         ppsimop1.this.AV46barcodreo = GXv_int5[0] ;
         ppsimop1.this.AV47Barcodpar = GXv_char2[0] ;
         ppsimop1.this.A758ProCod = GXv_char6[0] ;
         ppsimop1.this.A194BarOrdLin = GXv_int7[0] ;
         ppsimop1.this.AV62Fecteo = GXv_date8[0] ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      /* Using cursor P02VD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV54Maqcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A602MaqCod = P02VD3_A602MaqCod[0] ;
         A615MaqMinPro = P02VD3_A615MaqMinPro[0] ;
         n615MaqMinPro = P02VD3_n615MaqMinPro[0] ;
         A612MaqHorPro = P02VD3_A612MaqHorPro[0] ;
         n612MaqHorPro = P02VD3_n612MaqHorPro[0] ;
         AV55HorasProd = GXutil.concat( GXutil.str( A612MaqHorPro, 2, 0), GXutil.str( A615MaqMinPro, 2, 0), ".") ;
         AV56Horpro = CommonUtil.decimalVal( AV55HorasProd, ".") ;
         if ( AV56Horpro.doubleValue() == 0 )
         {
            AV56Horpro = DecimalUtil.stringToDec("24.00") ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'NUMOPE' Routine */
      returnInSub = false ;
      AV57NUM_OPE = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02VD4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(AV58Tip_codfas)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A7071Tip_CodFas = P02VD4_A7071Tip_CodFas[0] ;
         n7071Tip_CodFas = P02VD4_n7071Tip_CodFas[0] ;
         A7075Max_Uni = P02VD4_A7075Max_Uni[0] ;
         n7075Max_Uni = P02VD4_n7075Max_Uni[0] ;
         A7076Min_Uni = P02VD4_A7076Min_Uni[0] ;
         n7076Min_Uni = P02VD4_n7076Min_Uni[0] ;
         A7077Num_ope = P02VD4_A7077Num_ope[0] ;
         n7077Num_ope = P02VD4_n7077Num_ope[0] ;
         A7074Lin_nop = P02VD4_A7074Lin_nop[0] ;
         if ( ( AV48barpie >= A7076Min_Uni ) && ( AV48barpie <= A7075Max_Uni ) )
         {
            AV57NUM_OPE = A7077Num_ope ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'CFECHA' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CALENDARIO' */
      S141 ();
      if (returnInSub) return;
      AV64Dias_d = AV60Dias.add(AV78Resto) ;
      AV65Dias_e = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV64Dias_d))) ;
      if ( AV66Flag == 0 )
      {
         AV62Fecteo = GXutil.dadd(AV63BarFeccli,+(AV65Dias_e.intValue())) ;
         AV78Resto = AV64Dias_d.subtract(AV65Dias_e) ;
         AV63BarFeccli = AV62Fecteo ;
      }
      else
      {
         while ( AV64Dias_d.doubleValue() >= 1 )
         {
            AV68Dia = (byte)(AV68Dia+1) ;
            AV63BarFeccli = GXutil.dadd(AV63BarFeccli,+(1)) ;
            if ( AV67mes != GXutil.month( AV63BarFeccli) )
            {
               /* Execute user subroutine: 'CALENDARIO' */
               S141 ();
               if (returnInSub) return;
            }
            AV80Ndia = (byte)(AV68Dia*2) ;
            AV74Horas = (byte)(GXutil.lval( GXutil.substring( AV71HornPro, AV80Ndia, 2))) ;
            AV70Tot = DecimalUtil.doubleToDec(AV74Horas).divide(AV56Horpro, 18, java.math.RoundingMode.DOWN) ;
            if ( AV70Tot.doubleValue() > 1 )
            {
               AV70Tot = DecimalUtil.doubleToDec(1) ;
            }
            AV64Dias_d = AV64Dias_d.subtract((DecimalUtil.doubleToDec(1).subtract(AV70Tot))) ;
         }
         /* Execute user subroutine: 'FESTIVOS' */
         S151 ();
         if (returnInSub) return;
         AV63BarFeccli = AV72FPDf ;
         AV62Fecteo = AV63BarFeccli ;
         AV78Resto = AV64Dias_d ;
         AV63BarFeccli = AV62Fecteo ;
      }
   }

   public void S141( )
   {
      /* 'CALENDARIO' Routine */
      returnInSub = false ;
      AV69Anyo = (short)(GXutil.year( AV63BarFeccli)) ;
      AV67mes = (byte)(GXutil.month( AV63BarFeccli)) ;
      AV68Dia = (byte)(GXutil.day( AV63BarFeccli)) ;
      AV66Flag = (byte)(0) ;
      /* Using cursor P02VD5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV54Maqcod, Short.valueOf(AV69Anyo), Byte.valueOf(AV67mes)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A614MaqMes = P02VD5_A614MaqMes[0] ;
         A599MaqAny = P02VD5_A599MaqAny[0] ;
         A602MaqCod = P02VD5_A602MaqCod[0] ;
         A610MaqHNPMes = P02VD5_A610MaqHNPMes[0] ;
         n610MaqHNPMes = P02VD5_n610MaqHNPMes[0] ;
         AV66Flag = (byte)(1) ;
         AV71HornPro = A610MaqHNPMes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S151( )
   {
      /* 'FESTIVOS' Routine */
      returnInSub = false ;
      AV72FPDf = AV63BarFeccli ;
      AV74Horas = (byte)(1) ;
      AV73FlagCal = (byte)(1) ;
      while ( ( AV74Horas != 0 ) && ( AV73FlagCal == 1 ) )
      {
         AV68Dia = (byte)(GXutil.day( AV72FPDf)) ;
         AV67mes = (byte)(GXutil.month( AV72FPDf)) ;
         AV69Anyo = (short)(GXutil.year( AV72FPDf)) ;
         AV73FlagCal = (byte)(0) ;
         AV74Horas = (byte)(0) ;
         /* Using cursor P02VD6 */
         pr_default.execute(4, new Object[] {A396EmprCod, AV54Maqcod, Short.valueOf(AV69Anyo), Byte.valueOf(AV67mes)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A614MaqMes = P02VD6_A614MaqMes[0] ;
            A599MaqAny = P02VD6_A599MaqAny[0] ;
            A602MaqCod = P02VD6_A602MaqCod[0] ;
            A610MaqHNPMes = P02VD6_A610MaqHNPMes[0] ;
            n610MaqHNPMes = P02VD6_n610MaqHNPMes[0] ;
            AV73FlagCal = (byte)(1) ;
            AV75Inicio = (byte)((AV68Dia*2)) ;
            AV76HorCar = GXutil.substring( A610MaqHNPMes, AV75Inicio, 2) ;
            AV74Horas = (byte)(GXutil.lval( AV76HorCar)) ;
            if ( AV74Horas != 0 )
            {
               AV72FPDf = GXutil.dadd(AV72FPDf,+(1)) ;
            }
            if ( AV74Horas == 0 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppsimop1.this.A396EmprCod;
      this.aP1[0] = ppsimop1.this.AV45Barcod;
      this.aP2[0] = ppsimop1.this.AV46barcodreo;
      this.aP3[0] = ppsimop1.this.AV47Barcodpar;
      this.aP4[0] = ppsimop1.this.AV48barpie;
      this.aP5[0] = ppsimop1.this.AV49Tipartprod;
      this.aP6[0] = ppsimop1.this.AV52Barfecclip;
      this.aP7[0] = ppsimop1.this.AV53Sum_dias;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV63BarFeccli = GXutil.nullDate() ;
      AV78Resto = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02VD2_A457FasCod = new String[] {""} ;
      P02VD2_A396EmprCod = new String[] {""} ;
      P02VD2_A130BarCodPar = new String[] {""} ;
      P02VD2_A132BarCodReo = new byte[1] ;
      P02VD2_A129BarCod = new int[1] ;
      P02VD2_A7912Barfastpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VD2_n7912Barfastpp = new boolean[] {false} ;
      P02VD2_A6879FasTpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VD2_n6879FasTpp = new boolean[] {false} ;
      P02VD2_A603MaqCodBis = new String[] {""} ;
      P02VD2_A7071Tip_CodFas = new short[1] ;
      P02VD2_n7071Tip_CodFas = new boolean[] {false} ;
      P02VD2_A194BarOrdLin = new short[1] ;
      P02VD2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A130BarCodPar = "" ;
      A7912Barfastpp = DecimalUtil.ZERO ;
      A6879FasTpp = DecimalUtil.ZERO ;
      A603MaqCodBis = "" ;
      A758ProCod = "" ;
      AV81Barfastpp = DecimalUtil.ZERO ;
      AV54Maqcod = "" ;
      AV59Min_r = DecimalUtil.ZERO ;
      AV60Dias = DecimalUtil.ZERO ;
      AV57NUM_OPE = DecimalUtil.ZERO ;
      AV61resto_p = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new short[1] ;
      AV62Fecteo = GXutil.nullDate() ;
      GXv_date8 = new java.util.Date[1] ;
      P02VD3_A396EmprCod = new String[] {""} ;
      P02VD3_A602MaqCod = new String[] {""} ;
      P02VD3_A615MaqMinPro = new byte[1] ;
      P02VD3_n615MaqMinPro = new boolean[] {false} ;
      P02VD3_A612MaqHorPro = new byte[1] ;
      P02VD3_n612MaqHorPro = new boolean[] {false} ;
      A602MaqCod = "" ;
      AV55HorasProd = "" ;
      AV56Horpro = DecimalUtil.ZERO ;
      P02VD4_A396EmprCod = new String[] {""} ;
      P02VD4_A7071Tip_CodFas = new short[1] ;
      P02VD4_n7071Tip_CodFas = new boolean[] {false} ;
      P02VD4_A7075Max_Uni = new short[1] ;
      P02VD4_n7075Max_Uni = new boolean[] {false} ;
      P02VD4_A7076Min_Uni = new short[1] ;
      P02VD4_n7076Min_Uni = new boolean[] {false} ;
      P02VD4_A7077Num_ope = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VD4_n7077Num_ope = new boolean[] {false} ;
      P02VD4_A7074Lin_nop = new short[1] ;
      A7077Num_ope = DecimalUtil.ZERO ;
      AV64Dias_d = DecimalUtil.ZERO ;
      AV65Dias_e = DecimalUtil.ZERO ;
      AV71HornPro = "" ;
      AV70Tot = DecimalUtil.ZERO ;
      AV72FPDf = GXutil.nullDate() ;
      P02VD5_A396EmprCod = new String[] {""} ;
      P02VD5_A614MaqMes = new byte[1] ;
      P02VD5_A599MaqAny = new short[1] ;
      P02VD5_A602MaqCod = new String[] {""} ;
      P02VD5_A610MaqHNPMes = new String[] {""} ;
      P02VD5_n610MaqHNPMes = new boolean[] {false} ;
      A610MaqHNPMes = "" ;
      P02VD6_A396EmprCod = new String[] {""} ;
      P02VD6_A614MaqMes = new byte[1] ;
      P02VD6_A599MaqAny = new short[1] ;
      P02VD6_A602MaqCod = new String[] {""} ;
      P02VD6_A610MaqHNPMes = new String[] {""} ;
      P02VD6_n610MaqHNPMes = new boolean[] {false} ;
      AV76HorCar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppsimop1__default(),
         new Object[] {
             new Object[] {
            P02VD2_A457FasCod, P02VD2_A396EmprCod, P02VD2_A130BarCodPar, P02VD2_A132BarCodReo, P02VD2_A129BarCod, P02VD2_A7912Barfastpp, P02VD2_n7912Barfastpp, P02VD2_A6879FasTpp, P02VD2_n6879FasTpp, P02VD2_A603MaqCodBis,
            P02VD2_A7071Tip_CodFas, P02VD2_n7071Tip_CodFas, P02VD2_A194BarOrdLin, P02VD2_A758ProCod
            }
            , new Object[] {
            P02VD3_A396EmprCod, P02VD3_A602MaqCod, P02VD3_A615MaqMinPro, P02VD3_n615MaqMinPro, P02VD3_A612MaqHorPro, P02VD3_n612MaqHorPro
            }
            , new Object[] {
            P02VD4_A396EmprCod, P02VD4_A7071Tip_CodFas, P02VD4_A7075Max_Uni, P02VD4_n7075Max_Uni, P02VD4_A7076Min_Uni, P02VD4_n7076Min_Uni, P02VD4_A7077Num_ope, P02VD4_n7077Num_ope, P02VD4_A7074Lin_nop
            }
            , new Object[] {
            P02VD5_A396EmprCod, P02VD5_A614MaqMes, P02VD5_A599MaqAny, P02VD5_A602MaqCod, P02VD5_A610MaqHNPMes, P02VD5_n610MaqHNPMes
            }
            , new Object[] {
            P02VD6_A396EmprCod, P02VD6_A614MaqMes, P02VD6_A599MaqAny, P02VD6_A602MaqCod, P02VD6_A610MaqHNPMes, P02VD6_n610MaqHNPMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV46barcodreo ;
   private byte A132BarCodReo ;
   private byte GXv_int5[] ;
   private byte A615MaqMinPro ;
   private byte A612MaqHorPro ;
   private byte AV66Flag ;
   private byte AV68Dia ;
   private byte AV67mes ;
   private byte AV80Ndia ;
   private byte AV74Horas ;
   private byte A614MaqMes ;
   private byte AV73FlagCal ;
   private byte AV75Inicio ;
   private short AV77Jordada ;
   private short A7071Tip_CodFas ;
   private short A194BarOrdLin ;
   private short AV58Tip_codfas ;
   private short GXv_int7[] ;
   private short A7075Max_Uni ;
   private short A7076Min_Uni ;
   private short A7074Lin_nop ;
   private short AV69Anyo ;
   private short A599MaqAny ;
   private short Gx_err ;
   private int AV45Barcod ;
   private int AV48barpie ;
   private int GXt_int1 ;
   private int A129BarCod ;
   private int GXv_int4[] ;
   private java.math.BigDecimal AV49Tipartprod ;
   private java.math.BigDecimal AV53Sum_dias ;
   private java.math.BigDecimal AV78Resto ;
   private java.math.BigDecimal A7912Barfastpp ;
   private java.math.BigDecimal A6879FasTpp ;
   private java.math.BigDecimal AV81Barfastpp ;
   private java.math.BigDecimal AV59Min_r ;
   private java.math.BigDecimal AV60Dias ;
   private java.math.BigDecimal AV57NUM_OPE ;
   private java.math.BigDecimal AV61resto_p ;
   private java.math.BigDecimal AV56Horpro ;
   private java.math.BigDecimal A7077Num_ope ;
   private java.math.BigDecimal AV64Dias_d ;
   private java.math.BigDecimal AV65Dias_e ;
   private java.math.BigDecimal AV70Tot ;
   private String A396EmprCod ;
   private String AV47Barcodpar ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private String AV54Maqcod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char6[] ;
   private String A602MaqCod ;
   private String AV55HorasProd ;
   private String AV76HorCar ;
   private java.util.Date AV52Barfecclip ;
   private java.util.Date AV63BarFeccli ;
   private java.util.Date AV62Fecteo ;
   private java.util.Date GXv_date8[] ;
   private java.util.Date AV72FPDf ;
   private boolean n7912Barfastpp ;
   private boolean n6879FasTpp ;
   private boolean n7071Tip_CodFas ;
   private boolean returnInSub ;
   private boolean n615MaqMinPro ;
   private boolean n612MaqHorPro ;
   private boolean n7075Max_Uni ;
   private boolean n7076Min_Uni ;
   private boolean n7077Num_ope ;
   private boolean n610MaqHNPMes ;
   private String AV71HornPro ;
   private String A610MaqHNPMes ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.util.Date[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P02VD2_A457FasCod ;
   private String[] P02VD2_A396EmprCod ;
   private String[] P02VD2_A130BarCodPar ;
   private byte[] P02VD2_A132BarCodReo ;
   private int[] P02VD2_A129BarCod ;
   private java.math.BigDecimal[] P02VD2_A7912Barfastpp ;
   private boolean[] P02VD2_n7912Barfastpp ;
   private java.math.BigDecimal[] P02VD2_A6879FasTpp ;
   private boolean[] P02VD2_n6879FasTpp ;
   private String[] P02VD2_A603MaqCodBis ;
   private short[] P02VD2_A7071Tip_CodFas ;
   private boolean[] P02VD2_n7071Tip_CodFas ;
   private short[] P02VD2_A194BarOrdLin ;
   private String[] P02VD2_A758ProCod ;
   private String[] P02VD3_A396EmprCod ;
   private String[] P02VD3_A602MaqCod ;
   private byte[] P02VD3_A615MaqMinPro ;
   private boolean[] P02VD3_n615MaqMinPro ;
   private byte[] P02VD3_A612MaqHorPro ;
   private boolean[] P02VD3_n612MaqHorPro ;
   private String[] P02VD4_A396EmprCod ;
   private short[] P02VD4_A7071Tip_CodFas ;
   private boolean[] P02VD4_n7071Tip_CodFas ;
   private short[] P02VD4_A7075Max_Uni ;
   private boolean[] P02VD4_n7075Max_Uni ;
   private short[] P02VD4_A7076Min_Uni ;
   private boolean[] P02VD4_n7076Min_Uni ;
   private java.math.BigDecimal[] P02VD4_A7077Num_ope ;
   private boolean[] P02VD4_n7077Num_ope ;
   private short[] P02VD4_A7074Lin_nop ;
   private String[] P02VD5_A396EmprCod ;
   private byte[] P02VD5_A614MaqMes ;
   private short[] P02VD5_A599MaqAny ;
   private String[] P02VD5_A602MaqCod ;
   private String[] P02VD5_A610MaqHNPMes ;
   private boolean[] P02VD5_n610MaqHNPMes ;
   private String[] P02VD6_A396EmprCod ;
   private byte[] P02VD6_A614MaqMes ;
   private short[] P02VD6_A599MaqAny ;
   private String[] P02VD6_A602MaqCod ;
   private String[] P02VD6_A610MaqHNPMes ;
   private boolean[] P02VD6_n610MaqHNPMes ;
}

final  class ppsimop1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02VD2", "SELECT T1.FasCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Barfastpp, T2.FasTpp, T1.MaqCodBis, T2.Tip_CodFas, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VD3", "SELECT EmprCod, MaqCod, MaqMinPro, MaqHorPro FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02VD4", "SELECT EmprCod, Tip_CodFas, Max_Uni, Min_Uni, Num_ope, Lin_nop FROM TXPNUMOPE WHERE EmprCod = ? and Tip_CodFas = ? ORDER BY EmprCod, Tip_CodFas, Lin_nop ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VD5", "SELECT EmprCod, MaqMes, MaqAny, MaqCod, MaqHNPMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02VD6", "SELECT EmprCod, MaqMes, MaqAny, MaqCod, MaqHNPMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 6);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

