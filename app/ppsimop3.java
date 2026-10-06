package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppsimop3 extends GXProcedure
{
   public ppsimop3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppsimop3.class ), "" );
   }

   public ppsimop3( int remoteHandle ,
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
      ppsimop3.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
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
      ppsimop3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppsimop3.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      ppsimop3.this.AV9barcodreo = aP2[0];
      this.aP2 = aP2;
      ppsimop3.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      ppsimop3.this.AV11barpie = aP4[0];
      this.aP4 = aP4;
      ppsimop3.this.AV12Tipartprod = aP5[0];
      this.aP5 = aP5;
      ppsimop3.this.AV15Barfecclip = aP6[0];
      this.aP6 = aP6;
      ppsimop3.this.AV16Sum_dias = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV40Jordada ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "JORNAD", "") ;
      GXv_int4[0] = GXt_int1 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      ppsimop3.this.A396EmprCod = GXv_char2[0] ;
      ppsimop3.this.GXt_int1 = GXv_int4[0] ;
      AV40Jordada = (short)(GXt_int1) ;
      AV26BarFeccli = AV15Barfecclip ;
      AV41Resto = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02VE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P02VE2_A457FasCod[0] ;
         A130BarCodPar = P02VE2_A130BarCodPar[0] ;
         A132BarCodReo = P02VE2_A132BarCodReo[0] ;
         A129BarCod = P02VE2_A129BarCod[0] ;
         A7912Barfastpp = P02VE2_A7912Barfastpp[0] ;
         n7912Barfastpp = P02VE2_n7912Barfastpp[0] ;
         A6879FasTpp = P02VE2_A6879FasTpp[0] ;
         n6879FasTpp = P02VE2_n6879FasTpp[0] ;
         A603MaqCodBis = P02VE2_A603MaqCodBis[0] ;
         A7071Tip_CodFas = P02VE2_A7071Tip_CodFas[0] ;
         n7071Tip_CodFas = P02VE2_n7071Tip_CodFas[0] ;
         A194BarOrdLin = P02VE2_A194BarOrdLin[0] ;
         A758ProCod = P02VE2_A758ProCod[0] ;
         A6879FasTpp = P02VE2_A6879FasTpp[0] ;
         n6879FasTpp = P02VE2_n6879FasTpp[0] ;
         A7071Tip_CodFas = P02VE2_A7071Tip_CodFas[0] ;
         n7071Tip_CodFas = P02VE2_n7071Tip_CodFas[0] ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A7912Barfastpp)==0) )
         {
            AV44Barfastpp = A7912Barfastpp ;
         }
         else
         {
            AV44Barfastpp = A6879FasTpp ;
         }
         AV17Maqcod = A603MaqCodBis ;
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
         AV21Tip_codfas = A7071Tip_CodFas ;
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
         AV22Min_r = DecimalUtil.doubleToDec(0) ;
         if ( AV12Tipartprod.doubleValue() > 0 )
         {
            AV22Min_r = AV44Barfastpp.multiply(DecimalUtil.doubleToDec(AV11barpie)).divide((AV12Tipartprod), 18, java.math.RoundingMode.DOWN) ;
         }
         AV23Dias = DecimalUtil.doubleToDec(0) ;
         if ( (AV20NUM_OPE.multiply(DecimalUtil.doubleToDec(AV40Jordada))).doubleValue() > 0 )
         {
            AV23Dias = AV22Min_r.divide((AV20NUM_OPE.multiply(DecimalUtil.doubleToDec(AV40Jordada))), 18, java.math.RoundingMode.DOWN) ;
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
         AV24resto_p = AV41Resto ;
         AV16Sum_dias = AV16Sum_dias.add(AV23Dias) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      /* Using cursor P02VE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV17Maqcod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A602MaqCod = P02VE3_A602MaqCod[0] ;
         A615MaqMinPro = P02VE3_A615MaqMinPro[0] ;
         n615MaqMinPro = P02VE3_n615MaqMinPro[0] ;
         A612MaqHorPro = P02VE3_A612MaqHorPro[0] ;
         n612MaqHorPro = P02VE3_n612MaqHorPro[0] ;
         AV18HorasProd = GXutil.concat( GXutil.str( A612MaqHorPro, 2, 0), GXutil.str( A615MaqMinPro, 2, 0), ".") ;
         AV19Horpro = CommonUtil.decimalVal( AV18HorasProd, ".") ;
         if ( AV19Horpro.doubleValue() == 0 )
         {
            AV19Horpro = DecimalUtil.stringToDec("24.00") ;
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
      AV20NUM_OPE = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02VE4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(AV21Tip_codfas)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A7071Tip_CodFas = P02VE4_A7071Tip_CodFas[0] ;
         n7071Tip_CodFas = P02VE4_n7071Tip_CodFas[0] ;
         A7075Max_Uni = P02VE4_A7075Max_Uni[0] ;
         n7075Max_Uni = P02VE4_n7075Max_Uni[0] ;
         A7076Min_Uni = P02VE4_A7076Min_Uni[0] ;
         n7076Min_Uni = P02VE4_n7076Min_Uni[0] ;
         A7077Num_ope = P02VE4_A7077Num_ope[0] ;
         n7077Num_ope = P02VE4_n7077Num_ope[0] ;
         A7074Lin_nop = P02VE4_A7074Lin_nop[0] ;
         if ( ( AV11barpie >= A7076Min_Uni ) && ( AV11barpie <= A7075Max_Uni ) )
         {
            AV20NUM_OPE = A7077Num_ope ;
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
      AV27Dias_d = AV23Dias.add(AV41Resto) ;
      AV28Dias_e = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV27Dias_d))) ;
      if ( AV29Flag == 0 )
      {
         AV25Fecteo = GXutil.dadd(AV26BarFeccli,+(AV28Dias_e.intValue())) ;
         AV41Resto = AV27Dias_d.subtract(AV28Dias_e) ;
         AV26BarFeccli = AV25Fecteo ;
      }
      else
      {
         while ( AV27Dias_d.doubleValue() >= 1 )
         {
            AV31Dia = (byte)(AV31Dia+1) ;
            AV26BarFeccli = GXutil.dadd(AV26BarFeccli,+(1)) ;
            if ( AV30mes != GXutil.month( AV26BarFeccli) )
            {
               /* Execute user subroutine: 'CALENDARIO' */
               S141 ();
               if (returnInSub) return;
            }
            AV43Ndia = (byte)(AV31Dia*2) ;
            AV37Horas = (byte)(GXutil.lval( GXutil.substring( AV34HornPro, AV43Ndia, 2))) ;
            AV33Tot = DecimalUtil.doubleToDec(AV37Horas).divide(AV19Horpro, 18, java.math.RoundingMode.DOWN) ;
            if ( AV33Tot.doubleValue() > 1 )
            {
               AV33Tot = DecimalUtil.doubleToDec(1) ;
            }
            AV27Dias_d = AV27Dias_d.subtract((DecimalUtil.doubleToDec(1).subtract(AV33Tot))) ;
         }
         /* Execute user subroutine: 'FESTIVOS' */
         S151 ();
         if (returnInSub) return;
         AV26BarFeccli = AV35FPDf ;
         AV25Fecteo = AV26BarFeccli ;
         AV41Resto = AV27Dias_d ;
         AV26BarFeccli = AV25Fecteo ;
      }
   }

   public void S141( )
   {
      /* 'CALENDARIO' Routine */
      returnInSub = false ;
      AV32Anyo = (short)(GXutil.year( AV26BarFeccli)) ;
      AV30mes = (byte)(GXutil.month( AV26BarFeccli)) ;
      AV31Dia = (byte)(GXutil.day( AV26BarFeccli)) ;
      AV29Flag = (byte)(0) ;
      /* Using cursor P02VE5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV17Maqcod, Short.valueOf(AV32Anyo), Byte.valueOf(AV30mes)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A614MaqMes = P02VE5_A614MaqMes[0] ;
         A599MaqAny = P02VE5_A599MaqAny[0] ;
         A602MaqCod = P02VE5_A602MaqCod[0] ;
         A610MaqHNPMes = P02VE5_A610MaqHNPMes[0] ;
         n610MaqHNPMes = P02VE5_n610MaqHNPMes[0] ;
         AV29Flag = (byte)(1) ;
         AV34HornPro = A610MaqHNPMes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S151( )
   {
      /* 'FESTIVOS' Routine */
      returnInSub = false ;
      AV35FPDf = AV26BarFeccli ;
      AV37Horas = (byte)(1) ;
      AV36FlagCal = (byte)(1) ;
      while ( ( AV37Horas != 0 ) && ( AV36FlagCal == 1 ) )
      {
         AV31Dia = (byte)(GXutil.day( AV35FPDf)) ;
         AV30mes = (byte)(GXutil.month( AV35FPDf)) ;
         AV32Anyo = (short)(GXutil.year( AV35FPDf)) ;
         AV36FlagCal = (byte)(0) ;
         AV37Horas = (byte)(0) ;
         /* Using cursor P02VE6 */
         pr_default.execute(4, new Object[] {A396EmprCod, AV17Maqcod, Short.valueOf(AV32Anyo), Byte.valueOf(AV30mes)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A614MaqMes = P02VE6_A614MaqMes[0] ;
            A599MaqAny = P02VE6_A599MaqAny[0] ;
            A602MaqCod = P02VE6_A602MaqCod[0] ;
            A610MaqHNPMes = P02VE6_A610MaqHNPMes[0] ;
            n610MaqHNPMes = P02VE6_n610MaqHNPMes[0] ;
            AV36FlagCal = (byte)(1) ;
            AV38Inicio = (byte)((AV31Dia*2)) ;
            AV39HorCar = GXutil.substring( A610MaqHNPMes, AV38Inicio, 2) ;
            AV37Horas = (byte)(GXutil.lval( AV39HorCar)) ;
            if ( AV37Horas != 0 )
            {
               AV35FPDf = GXutil.dadd(AV35FPDf,+(1)) ;
            }
            if ( AV37Horas == 0 )
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
      this.aP0[0] = ppsimop3.this.A396EmprCod;
      this.aP1[0] = ppsimop3.this.AV8Barcod;
      this.aP2[0] = ppsimop3.this.AV9barcodreo;
      this.aP3[0] = ppsimop3.this.AV10Barcodpar;
      this.aP4[0] = ppsimop3.this.AV11barpie;
      this.aP5[0] = ppsimop3.this.AV12Tipartprod;
      this.aP6[0] = ppsimop3.this.AV15Barfecclip;
      this.aP7[0] = ppsimop3.this.AV16Sum_dias;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      AV26BarFeccli = GXutil.nullDate() ;
      AV41Resto = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02VE2_A457FasCod = new String[] {""} ;
      P02VE2_A396EmprCod = new String[] {""} ;
      P02VE2_A130BarCodPar = new String[] {""} ;
      P02VE2_A132BarCodReo = new byte[1] ;
      P02VE2_A129BarCod = new int[1] ;
      P02VE2_A7912Barfastpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VE2_n7912Barfastpp = new boolean[] {false} ;
      P02VE2_A6879FasTpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VE2_n6879FasTpp = new boolean[] {false} ;
      P02VE2_A603MaqCodBis = new String[] {""} ;
      P02VE2_A7071Tip_CodFas = new short[1] ;
      P02VE2_n7071Tip_CodFas = new boolean[] {false} ;
      P02VE2_A194BarOrdLin = new short[1] ;
      P02VE2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A130BarCodPar = "" ;
      A7912Barfastpp = DecimalUtil.ZERO ;
      A6879FasTpp = DecimalUtil.ZERO ;
      A603MaqCodBis = "" ;
      A758ProCod = "" ;
      AV44Barfastpp = DecimalUtil.ZERO ;
      AV17Maqcod = "" ;
      AV22Min_r = DecimalUtil.ZERO ;
      AV23Dias = DecimalUtil.ZERO ;
      AV20NUM_OPE = DecimalUtil.ZERO ;
      AV24resto_p = DecimalUtil.ZERO ;
      P02VE3_A396EmprCod = new String[] {""} ;
      P02VE3_A602MaqCod = new String[] {""} ;
      P02VE3_A615MaqMinPro = new byte[1] ;
      P02VE3_n615MaqMinPro = new boolean[] {false} ;
      P02VE3_A612MaqHorPro = new byte[1] ;
      P02VE3_n612MaqHorPro = new boolean[] {false} ;
      A602MaqCod = "" ;
      AV18HorasProd = "" ;
      AV19Horpro = DecimalUtil.ZERO ;
      P02VE4_A396EmprCod = new String[] {""} ;
      P02VE4_A7071Tip_CodFas = new short[1] ;
      P02VE4_n7071Tip_CodFas = new boolean[] {false} ;
      P02VE4_A7075Max_Uni = new short[1] ;
      P02VE4_n7075Max_Uni = new boolean[] {false} ;
      P02VE4_A7076Min_Uni = new short[1] ;
      P02VE4_n7076Min_Uni = new boolean[] {false} ;
      P02VE4_A7077Num_ope = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02VE4_n7077Num_ope = new boolean[] {false} ;
      P02VE4_A7074Lin_nop = new short[1] ;
      A7077Num_ope = DecimalUtil.ZERO ;
      AV27Dias_d = DecimalUtil.ZERO ;
      AV28Dias_e = DecimalUtil.ZERO ;
      AV25Fecteo = GXutil.nullDate() ;
      AV34HornPro = "" ;
      AV33Tot = DecimalUtil.ZERO ;
      AV35FPDf = GXutil.nullDate() ;
      P02VE5_A396EmprCod = new String[] {""} ;
      P02VE5_A614MaqMes = new byte[1] ;
      P02VE5_A599MaqAny = new short[1] ;
      P02VE5_A602MaqCod = new String[] {""} ;
      P02VE5_A610MaqHNPMes = new String[] {""} ;
      P02VE5_n610MaqHNPMes = new boolean[] {false} ;
      A610MaqHNPMes = "" ;
      P02VE6_A396EmprCod = new String[] {""} ;
      P02VE6_A614MaqMes = new byte[1] ;
      P02VE6_A599MaqAny = new short[1] ;
      P02VE6_A602MaqCod = new String[] {""} ;
      P02VE6_A610MaqHNPMes = new String[] {""} ;
      P02VE6_n610MaqHNPMes = new boolean[] {false} ;
      AV39HorCar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppsimop3__default(),
         new Object[] {
             new Object[] {
            P02VE2_A457FasCod, P02VE2_A396EmprCod, P02VE2_A130BarCodPar, P02VE2_A132BarCodReo, P02VE2_A129BarCod, P02VE2_A7912Barfastpp, P02VE2_n7912Barfastpp, P02VE2_A6879FasTpp, P02VE2_n6879FasTpp, P02VE2_A603MaqCodBis,
            P02VE2_A7071Tip_CodFas, P02VE2_n7071Tip_CodFas, P02VE2_A194BarOrdLin, P02VE2_A758ProCod
            }
            , new Object[] {
            P02VE3_A396EmprCod, P02VE3_A602MaqCod, P02VE3_A615MaqMinPro, P02VE3_n615MaqMinPro, P02VE3_A612MaqHorPro, P02VE3_n612MaqHorPro
            }
            , new Object[] {
            P02VE4_A396EmprCod, P02VE4_A7071Tip_CodFas, P02VE4_A7075Max_Uni, P02VE4_n7075Max_Uni, P02VE4_A7076Min_Uni, P02VE4_n7076Min_Uni, P02VE4_A7077Num_ope, P02VE4_n7077Num_ope, P02VE4_A7074Lin_nop
            }
            , new Object[] {
            P02VE5_A396EmprCod, P02VE5_A614MaqMes, P02VE5_A599MaqAny, P02VE5_A602MaqCod, P02VE5_A610MaqHNPMes, P02VE5_n610MaqHNPMes
            }
            , new Object[] {
            P02VE6_A396EmprCod, P02VE6_A614MaqMes, P02VE6_A599MaqAny, P02VE6_A602MaqCod, P02VE6_A610MaqHNPMes, P02VE6_n610MaqHNPMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9barcodreo ;
   private byte A132BarCodReo ;
   private byte A615MaqMinPro ;
   private byte A612MaqHorPro ;
   private byte AV29Flag ;
   private byte AV31Dia ;
   private byte AV30mes ;
   private byte AV43Ndia ;
   private byte AV37Horas ;
   private byte A614MaqMes ;
   private byte AV36FlagCal ;
   private byte AV38Inicio ;
   private short AV40Jordada ;
   private short A7071Tip_CodFas ;
   private short A194BarOrdLin ;
   private short AV21Tip_codfas ;
   private short A7075Max_Uni ;
   private short A7076Min_Uni ;
   private short A7074Lin_nop ;
   private short AV32Anyo ;
   private short A599MaqAny ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int AV11barpie ;
   private int GXt_int1 ;
   private int GXv_int4[] ;
   private int A129BarCod ;
   private java.math.BigDecimal AV12Tipartprod ;
   private java.math.BigDecimal AV16Sum_dias ;
   private java.math.BigDecimal AV41Resto ;
   private java.math.BigDecimal A7912Barfastpp ;
   private java.math.BigDecimal A6879FasTpp ;
   private java.math.BigDecimal AV44Barfastpp ;
   private java.math.BigDecimal AV22Min_r ;
   private java.math.BigDecimal AV23Dias ;
   private java.math.BigDecimal AV20NUM_OPE ;
   private java.math.BigDecimal AV24resto_p ;
   private java.math.BigDecimal AV19Horpro ;
   private java.math.BigDecimal A7077Num_ope ;
   private java.math.BigDecimal AV27Dias_d ;
   private java.math.BigDecimal AV28Dias_e ;
   private java.math.BigDecimal AV33Tot ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private String AV17Maqcod ;
   private String A602MaqCod ;
   private String AV18HorasProd ;
   private String AV39HorCar ;
   private java.util.Date AV15Barfecclip ;
   private java.util.Date AV26BarFeccli ;
   private java.util.Date AV25Fecteo ;
   private java.util.Date AV35FPDf ;
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
   private String AV34HornPro ;
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
   private String[] P02VE2_A457FasCod ;
   private String[] P02VE2_A396EmprCod ;
   private String[] P02VE2_A130BarCodPar ;
   private byte[] P02VE2_A132BarCodReo ;
   private int[] P02VE2_A129BarCod ;
   private java.math.BigDecimal[] P02VE2_A7912Barfastpp ;
   private boolean[] P02VE2_n7912Barfastpp ;
   private java.math.BigDecimal[] P02VE2_A6879FasTpp ;
   private boolean[] P02VE2_n6879FasTpp ;
   private String[] P02VE2_A603MaqCodBis ;
   private short[] P02VE2_A7071Tip_CodFas ;
   private boolean[] P02VE2_n7071Tip_CodFas ;
   private short[] P02VE2_A194BarOrdLin ;
   private String[] P02VE2_A758ProCod ;
   private String[] P02VE3_A396EmprCod ;
   private String[] P02VE3_A602MaqCod ;
   private byte[] P02VE3_A615MaqMinPro ;
   private boolean[] P02VE3_n615MaqMinPro ;
   private byte[] P02VE3_A612MaqHorPro ;
   private boolean[] P02VE3_n612MaqHorPro ;
   private String[] P02VE4_A396EmprCod ;
   private short[] P02VE4_A7071Tip_CodFas ;
   private boolean[] P02VE4_n7071Tip_CodFas ;
   private short[] P02VE4_A7075Max_Uni ;
   private boolean[] P02VE4_n7075Max_Uni ;
   private short[] P02VE4_A7076Min_Uni ;
   private boolean[] P02VE4_n7076Min_Uni ;
   private java.math.BigDecimal[] P02VE4_A7077Num_ope ;
   private boolean[] P02VE4_n7077Num_ope ;
   private short[] P02VE4_A7074Lin_nop ;
   private String[] P02VE5_A396EmprCod ;
   private byte[] P02VE5_A614MaqMes ;
   private short[] P02VE5_A599MaqAny ;
   private String[] P02VE5_A602MaqCod ;
   private String[] P02VE5_A610MaqHNPMes ;
   private boolean[] P02VE5_n610MaqHNPMes ;
   private String[] P02VE6_A396EmprCod ;
   private byte[] P02VE6_A614MaqMes ;
   private short[] P02VE6_A599MaqAny ;
   private String[] P02VE6_A602MaqCod ;
   private String[] P02VE6_A610MaqHNPMes ;
   private boolean[] P02VE6_n610MaqHNPMes ;
}

final  class ppsimop3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02VE2", "SELECT T1.FasCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Barfastpp, T2.FasTpp, T1.MaqCodBis, T2.Tip_CodFas, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VE3", "SELECT EmprCod, MaqCod, MaqMinPro, MaqHorPro FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02VE4", "SELECT EmprCod, Tip_CodFas, Max_Uni, Min_Uni, Num_ope, Lin_nop FROM TXPNUMOPE WHERE EmprCod = ? and Tip_CodFas = ? ORDER BY EmprCod, Tip_CodFas, Lin_nop ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02VE5", "SELECT EmprCod, MaqMes, MaqAny, MaqCod, MaqHNPMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02VE6", "SELECT EmprCod, MaqMes, MaqAny, MaqCod, MaqHNPMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

