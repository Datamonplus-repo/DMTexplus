package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvolcal extends GXProcedure
{
   public pvolcal( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvolcal.class ), "" );
   }

   public pvolcal( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             int[] aP10 ,
                             int[] aP11 ,
                             int[] aP12 )
   {
      pvolcal.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 ,
                        int[] aP10 ,
                        int[] aP11 ,
                        int[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             int[] aP10 ,
                             int[] aP11 ,
                             int[] aP12 ,
                             String[] aP13 )
   {
      pvolcal.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pvolcal.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pvolcal.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pvolcal.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pvolcal.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pvolcal.this.AV34ProForCod = aP5[0];
      this.aP5 = aP5;
      pvolcal.this.AV35recTotKgs = aP6[0];
      this.aP6 = aP6;
      pvolcal.this.AV29BarOrdLin = aP7[0];
      this.aP7 = aP7;
      pvolcal.this.AV30FasCod = aP8[0];
      this.aP8 = aP8;
      pvolcal.this.AV31RecTiempo = aP9[0];
      this.aP9 = aP9;
      pvolcal.this.AV32recNroPrg = aP10[0];
      this.aP10 = aP10;
      pvolcal.this.AV33RecVolPrf = aP11[0];
      this.aP11 = aP11;
      pvolcal.this.AV52Vol_old = aP12[0];
      this.aP12 = aP12;
      pvolcal.this.AV53ForCod_old = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV59Dt0051 = (byte)(0) ;
      /* Using cursor P01PB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV29BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P01PB2_A194BarOrdLin[0] ;
         A7944Dtb_ForLin = P01PB2_A7944Dtb_ForLin[0] ;
         A7934Dtb_Ordl = P01PB2_A7934Dtb_Ordl[0] ;
         A758ProCod = P01PB2_A758ProCod[0] ;
         AV59Dt0051 = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV59Dt0051 == 1 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int5[0] = A2804RecLinMaq ;
         GXv_char6[0] = AV34ProForCod ;
         GXv_decimal7[0] = AV35recTotKgs ;
         GXv_int8[0] = AV29BarOrdLin ;
         GXv_char9[0] = AV30FasCod ;
         GXv_int10[0] = AV31RecTiempo ;
         GXv_int11[0] = AV32recNroPrg ;
         GXv_int12[0] = AV33RecVolPrf ;
         GXv_int13[0] = AV52Vol_old ;
         GXv_char14[0] = AV53ForCod_old ;
         new app.pvolcals(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_decimal7, GXv_int8, GXv_char9, GXv_int10, GXv_int11, GXv_int12, GXv_int13, GXv_char14) ;
         pvolcal.this.A396EmprCod = GXv_char1[0] ;
         pvolcal.this.A129BarCod = GXv_int2[0] ;
         pvolcal.this.A132BarCodReo = GXv_int3[0] ;
         pvolcal.this.A130BarCodPar = GXv_char4[0] ;
         pvolcal.this.A2804RecLinMaq = GXv_int5[0] ;
         pvolcal.this.AV34ProForCod = GXv_char6[0] ;
         pvolcal.this.AV35recTotKgs = GXv_decimal7[0] ;
         pvolcal.this.AV29BarOrdLin = GXv_int8[0] ;
         pvolcal.this.AV30FasCod = GXv_char9[0] ;
         pvolcal.this.AV31RecTiempo = GXv_int10[0] ;
         pvolcal.this.AV32recNroPrg = GXv_int11[0] ;
         pvolcal.this.AV33RecVolPrf = GXv_int12[0] ;
         pvolcal.this.AV52Vol_old = GXv_int13[0] ;
         pvolcal.this.AV53ForCod_old = GXv_char14[0] ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV55Station = context.getWorkstationId( remoteHandle) ;
      GXv_char14[0] = A396EmprCod ;
      GXv_char9[0] = AV56EmprNom ;
      GXv_char6[0] = AV57Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV55Station, GXv_char14, GXv_char9, GXv_char6) ;
      pvolcal.this.A396EmprCod = GXv_char14[0] ;
      pvolcal.this.AV56EmprNom = GXv_char9[0] ;
      pvolcal.this.AV57Usurcod = GXv_char6[0] ;
      GXt_int15 = AV51F_pizarro ;
      GXv_int3[0] = GXt_int15 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIZARR", ""), GXv_int3) ;
      pvolcal.this.GXt_int15 = GXv_int3[0] ;
      AV51F_pizarro = GXt_int15 ;
      /* Using cursor P01PB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV29BarOrdLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A194BarOrdLin = P01PB3_A194BarOrdLin[0] ;
         A150BarFacTin = P01PB3_A150BarFacTin[0] ;
         A217BarTipArt = P01PB3_A217BarTipArt[0] ;
         n217BarTipArt = P01PB3_n217BarTipArt[0] ;
         A5369BarFasGral = P01PB3_A5369BarFasGral[0] ;
         n5369BarFasGral = P01PB3_n5369BarFasGral[0] ;
         A758ProCod = P01PB3_A758ProCod[0] ;
         A217BarTipArt = P01PB3_A217BarTipArt[0] ;
         n217BarTipArt = P01PB3_n217BarTipArt[0] ;
         AV44BarFacTin = A150BarFacTin ;
         AV43BarTipArt = A217BarTipArt ;
         AV45FaseGral = A5369BarFasGral ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P01PB4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2805RecVolPrd = P01PB4_A2805RecVolPrd[0] ;
         A602MaqCod = P01PB4_A602MaqCod[0] ;
         AV46MaqCod = A602MaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Execute user subroutine: 'MAQTAR' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV34ProForCod, AV53ForCod_old) != 0 )
      {
         if ( GXutil.strcmp(AV44BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Using cursor P01PB5 */
            pr_default.execute(3, new Object[] {A396EmprCod, AV34ProForCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A764ProForCod = P01PB5_A764ProForCod[0] ;
               A4705ProForPau = P01PB5_A4705ProForPau[0] ;
               A2392ProNumPro = P01PB5_A2392ProNumPro[0] ;
               A4706ProForRb = P01PB5_A4706ProForRb[0] ;
               AV31RecTiempo = A4705ProForPau ;
               AV32recNroPrg = A2392ProNumPro ;
               if ( A4706ProForRb > 0 )
               {
                  AV33RecVolPrf = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(A4706ProForRb).multiply(AV35recTotKgs))) ;
               }
               /* Execute user subroutine: 'PROFOC' */
               S137 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( ( AV39Flag_ctrl == 1 ) || ( AV38Cont_c > 0 ) )
               {
                  AV31RecTiempo = AV37ProFoTmc ;
                  AV32recNroPrg = AV36ProFoPgc ;
               }
               if ( ( AV42MaqTipArtr > 0 ) && ( A4706ProForRb == 0 ) )
               {
                  AV33RecVolPrf = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV42MaqTipArtr).multiply(AV35recTotKgs))) ;
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
            /* Execute user subroutine: 'CTRL_MAQUINA' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         else
         {
            if ( GXutil.strcmp(AV45FaseGral, httpContext.getMessage( "N", "")) == 0 )
            {
               /* Execute user subroutine: 'FASPR1' */
               S141 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( ( AV32recNroPrg == 0 ) && ( AV31RecTiempo == 0 ) )
               {
                  /* Execute user subroutine: 'CPROFO' */
                  S121 ();
                  if ( returnInSub )
                  {
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
            }
            else
            {
               /* Execute user subroutine: 'CPROFO' */
               S121 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
      }
      else
      {
         if ( AV52Vol_old != AV33RecVolPrf )
         {
            /* Execute user subroutine: 'CTRL_MAQUINA' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CTRL_MAQUINA' Routine */
      returnInSub = false ;
      AV48VolMax = 0 ;
      AV47VolMin = 0 ;
      /* Using cursor P01PB6 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV46MaqCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A602MaqCod = P01PB6_A602MaqCod[0] ;
         A625MaqVolMin = P01PB6_A625MaqVolMin[0] ;
         n625MaqVolMin = P01PB6_n625MaqVolMin[0] ;
         A623MaqVolMax = P01PB6_A623MaqVolMax[0] ;
         n623MaqVolMax = P01PB6_n623MaqVolMax[0] ;
         AV47VolMin = A625MaqVolMin ;
         AV48VolMax = A623MaqVolMax ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( ( AV33RecVolPrf > AV48VolMax ) || ( AV33RecVolPrf < AV47VolMin ) )
      {
         AV49Volumen_c = AV33RecVolPrf ;
         AV50Texto_i = httpContext.getMessage( "Atençao, el volume calculado ", "") + GXutil.str( AV49Volumen_c, 5, 0) + GXutil.newLine( ) + httpContext.getMessage( "i ultrapasa el volume definido para la maquina", "") + GXutil.newLine( ) + httpContext.getMessage( "Vol. Max ", "") + GXutil.str( AV48VolMax, 5, 0) + " " + httpContext.getMessage( "Vol. Min ", "") + GXutil.str( AV47VolMin, 5, 0) + GXutil.newLine( ) + httpContext.getMessage( "S= Respeitar a Volume calculado; N= Utilizar Capacidades definidas p/maquina ", "") + GXutil.newLine( ) ;
         if ( AV51F_pizarro == 1 )
         {
            if ( AV33RecVolPrf > AV48VolMax )
            {
               AV33RecVolPrf = AV48VolMax ;
            }
            else
            {
               if ( AV33RecVolPrf < AV47VolMin )
               {
                  AV33RecVolPrf = AV47VolMin ;
               }
            }
         }
      }
   }

   public void S121( )
   {
      /* 'CPROFO' Routine */
      returnInSub = false ;
      AV32recNroPrg = 0 ;
      AV31RecTiempo = (short)(0) ;
      AV33RecVolPrf = 0 ;
      /* Using cursor P01PB7 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV34ProForCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A764ProForCod = P01PB7_A764ProForCod[0] ;
         A4705ProForPau = P01PB7_A4705ProForPau[0] ;
         A2392ProNumPro = P01PB7_A2392ProNumPro[0] ;
         A4706ProForRb = P01PB7_A4706ProForRb[0] ;
         AV31RecTiempo = A4705ProForPau ;
         AV32recNroPrg = A2392ProNumPro ;
         if ( A4706ProForRb > 0 )
         {
            AV33RecVolPrf = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(A4706ProForRb).multiply(AV35recTotKgs))) ;
         }
         if ( ( AV42MaqTipArtr > 0 ) && ( A4706ProForRb == 0 ) )
         {
            AV33RecVolPrf = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV42MaqTipArtr).multiply(AV35recTotKgs))) ;
         }
         /* Execute user subroutine: 'PROFOC' */
         S137 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         if ( ( AV39Flag_ctrl == 1 ) || ( AV38Cont_c > 0 ) )
         {
            AV31RecTiempo = AV37ProFoTmc ;
            AV32recNroPrg = AV36ProFoPgc ;
            if ( AV54ProFoRb > 0 )
            {
               AV33RecVolPrf = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV54ProFoRb).multiply(AV35recTotKgs))) ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S141( )
   {
      /* 'FASPR1' Routine */
      returnInSub = false ;
      AV41F_faspr1 = (byte)(0) ;
      AV32recNroPrg = 0 ;
      AV31RecTiempo = (short)(0) ;
      AV33RecVolPrf = 0 ;
      /* Using cursor P01PB8 */
      pr_default.execute(6, new Object[] {A396EmprCod, AV30FasCod, AV34ProForCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A764ProForCod = P01PB8_A764ProForCod[0] ;
         A457FasCod = P01PB8_A457FasCod[0] ;
         A4653FasForRb = P01PB8_A4653FasForRb[0] ;
         n4653FasForRb = P01PB8_n4653FasForRb[0] ;
         A4706ProForRb = P01PB8_A4706ProForRb[0] ;
         A4652FasForTPau = P01PB8_A4652FasForTPau[0] ;
         n4652FasForTPau = P01PB8_n4652FasForTPau[0] ;
         A4705ProForPau = P01PB8_A4705ProForPau[0] ;
         A4651FasForNPro = P01PB8_A4651FasForNPro[0] ;
         n4651FasForNPro = P01PB8_n4651FasForNPro[0] ;
         A2392ProNumPro = P01PB8_A2392ProNumPro[0] ;
         A4650FasForLin = P01PB8_A4650FasForLin[0] ;
         A4706ProForRb = P01PB8_A4706ProForRb[0] ;
         A4705ProForPau = P01PB8_A4705ProForPau[0] ;
         A2392ProNumPro = P01PB8_A2392ProNumPro[0] ;
         AV41F_faspr1 = (byte)(1) ;
         if ( A4653FasForRb > 0 )
         {
            AV33RecVolPrf = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(A4653FasForRb).multiply(AV35recTotKgs))) ;
         }
         else
         {
            if ( A4706ProForRb > 0 )
            {
               AV33RecVolPrf = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(A4706ProForRb).multiply(AV35recTotKgs))) ;
            }
            if ( ( AV42MaqTipArtr > 0 ) && ( A4706ProForRb == 0 ) )
            {
               AV33RecVolPrf = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV42MaqTipArtr).multiply(AV35recTotKgs))) ;
            }
         }
         if ( ! (0==A4652FasForTPau) )
         {
            AV31RecTiempo = A4652FasForTPau ;
         }
         else
         {
            AV31RecTiempo = A4705ProForPau ;
         }
         if ( ! (0==A4651FasForNPro) )
         {
            AV32recNroPrg = A4651FasForNPro ;
         }
         else
         {
            AV32recNroPrg = A2392ProNumPro ;
         }
         AV34ProForCod = A764ProForCod ;
         /* Execute user subroutine: 'PROFOC' */
         S137 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            pr_default.close(6);
            returnInSub = true;
            if (true) return;
         }
         if ( ( AV39Flag_ctrl == 1 ) || ( AV38Cont_c > 0 ) )
         {
            AV31RecTiempo = AV37ProFoTmc ;
            AV32recNroPrg = AV36ProFoPgc ;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void S137( )
   {
      /* 'PROFOC' Routine */
      returnInSub = false ;
      AV36ProFoPgc = (short)(0) ;
      AV37ProFoTmc = (short)(0) ;
      AV54ProFoRb = (short)(0) ;
      AV38Cont_c = (short)(0) ;
      /* Using cursor P01PB9 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV34ProForCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A764ProForCod = P01PB9_A764ProForCod[0] ;
         A5194ProFoCla = P01PB9_A5194ProFoCla[0] ;
         n5194ProFoCla = P01PB9_n5194ProFoCla[0] ;
         A5192ProFoPgC = P01PB9_A5192ProFoPgC[0] ;
         n5192ProFoPgC = P01PB9_n5192ProFoPgC[0] ;
         A5193ProFoTmC = P01PB9_A5193ProFoTmC[0] ;
         n5193ProFoTmC = P01PB9_n5193ProFoTmC[0] ;
         A5951ProFoRb = P01PB9_A5951ProFoRb[0] ;
         n5951ProFoRb = P01PB9_n5951ProFoRb[0] ;
         A5191ProForLC = P01PB9_A5191ProForLC[0] ;
         AV39Flag_ctrl = (byte)(0) ;
         GXv_char14[0] = A396EmprCod ;
         GXv_char9[0] = " " ;
         GXv_char6[0] = A5194ProFoCla ;
         GXv_int3[0] = AV39Flag_ctrl ;
         GXv_int13[0] = A129BarCod ;
         GXv_int16[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_decimal7[0] = AV35recTotKgs ;
         GXv_char1[0] = " " ;
         GXv_char17[0] = AV40Accion ;
         GXv_int10[0] = A2804RecLinMaq ;
         GXv_int18[0] = (byte)(0) ;
         GXv_char19[0] = AV44BarFacTin ;
         GXv_char20[0] = "" ;
         new app.pclaespl(remoteHandle, context).execute( GXv_char14, GXv_char9, GXv_char6, GXv_int3, GXv_int13, GXv_int16, GXv_char4, GXv_decimal7, GXv_char1, GXv_char17, GXv_int10, GXv_int18, GXv_char19, GXv_char20) ;
         pvolcal.this.A396EmprCod = GXv_char14[0] ;
         pvolcal.this.A5194ProFoCla = GXv_char6[0] ;
         pvolcal.this.AV39Flag_ctrl = GXv_int3[0] ;
         pvolcal.this.A129BarCod = GXv_int13[0] ;
         pvolcal.this.A132BarCodReo = GXv_int16[0] ;
         pvolcal.this.A130BarCodPar = GXv_char4[0] ;
         pvolcal.this.AV35recTotKgs = GXv_decimal7[0] ;
         pvolcal.this.AV40Accion = GXv_char17[0] ;
         pvolcal.this.A2804RecLinMaq = GXv_int10[0] ;
         pvolcal.this.AV44BarFacTin = GXv_char19[0] ;
         if ( ( AV39Flag_ctrl == 1 ) || (GXutil.strcmp("", A5194ProFoCla)==0) )
         {
            AV36ProFoPgc = A5192ProFoPgC ;
            AV37ProFoTmc = A5193ProFoTmC ;
            AV54ProFoRb = A5951ProFoRb ;
            AV38Cont_c = (short)(AV38Cont_c+1) ;
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S151( )
   {
      /* 'MAQTAR' Routine */
      returnInSub = false ;
      AV42MaqTipArtr = (short)(0) ;
      /* Using cursor P01PB10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(AV43BarTipArt)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A4686MaqTipArt = P01PB10_A4686MaqTipArt[0] ;
         A5195MaqTipArtR = P01PB10_A5195MaqTipArtR[0] ;
         n5195MaqTipArtR = P01PB10_n5195MaqTipArtR[0] ;
         AV42MaqTipArtr = A5195MaqTipArtR ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvolcal.this.A396EmprCod;
      this.aP1[0] = pvolcal.this.A129BarCod;
      this.aP2[0] = pvolcal.this.A132BarCodReo;
      this.aP3[0] = pvolcal.this.A130BarCodPar;
      this.aP4[0] = pvolcal.this.A2804RecLinMaq;
      this.aP5[0] = pvolcal.this.AV34ProForCod;
      this.aP6[0] = pvolcal.this.AV35recTotKgs;
      this.aP7[0] = pvolcal.this.AV29BarOrdLin;
      this.aP8[0] = pvolcal.this.AV30FasCod;
      this.aP9[0] = pvolcal.this.AV31RecTiempo;
      this.aP10[0] = pvolcal.this.AV32recNroPrg;
      this.aP11[0] = pvolcal.this.AV33RecVolPrf;
      this.aP12[0] = pvolcal.this.AV52Vol_old;
      this.aP13[0] = pvolcal.this.AV53ForCod_old;
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
      P01PB2_A396EmprCod = new String[] {""} ;
      P01PB2_A129BarCod = new int[1] ;
      P01PB2_A132BarCodReo = new byte[1] ;
      P01PB2_A130BarCodPar = new String[] {""} ;
      P01PB2_A194BarOrdLin = new short[1] ;
      P01PB2_A7944Dtb_ForLin = new short[1] ;
      P01PB2_A7934Dtb_Ordl = new short[1] ;
      P01PB2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      GXv_int2 = new int[1] ;
      GXv_int5 = new short[1] ;
      GXv_int8 = new short[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new int[1] ;
      AV55Station = "" ;
      AV56EmprNom = "" ;
      AV57Usurcod = "" ;
      P01PB3_A396EmprCod = new String[] {""} ;
      P01PB3_A129BarCod = new int[1] ;
      P01PB3_A132BarCodReo = new byte[1] ;
      P01PB3_A130BarCodPar = new String[] {""} ;
      P01PB3_A194BarOrdLin = new short[1] ;
      P01PB3_A150BarFacTin = new String[] {""} ;
      P01PB3_A217BarTipArt = new short[1] ;
      P01PB3_n217BarTipArt = new boolean[] {false} ;
      P01PB3_A5369BarFasGral = new String[] {""} ;
      P01PB3_n5369BarFasGral = new boolean[] {false} ;
      P01PB3_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A5369BarFasGral = "" ;
      AV44BarFacTin = "" ;
      AV45FaseGral = "" ;
      P01PB4_A396EmprCod = new String[] {""} ;
      P01PB4_A129BarCod = new int[1] ;
      P01PB4_A132BarCodReo = new byte[1] ;
      P01PB4_A130BarCodPar = new String[] {""} ;
      P01PB4_A2804RecLinMaq = new short[1] ;
      P01PB4_A2805RecVolPrd = new int[1] ;
      P01PB4_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      AV46MaqCod = "" ;
      P01PB5_A396EmprCod = new String[] {""} ;
      P01PB5_A764ProForCod = new String[] {""} ;
      P01PB5_A4705ProForPau = new short[1] ;
      P01PB5_A2392ProNumPro = new int[1] ;
      P01PB5_A4706ProForRb = new short[1] ;
      A764ProForCod = "" ;
      P01PB6_A396EmprCod = new String[] {""} ;
      P01PB6_A602MaqCod = new String[] {""} ;
      P01PB6_A625MaqVolMin = new int[1] ;
      P01PB6_n625MaqVolMin = new boolean[] {false} ;
      P01PB6_A623MaqVolMax = new int[1] ;
      P01PB6_n623MaqVolMax = new boolean[] {false} ;
      AV50Texto_i = "" ;
      P01PB7_A396EmprCod = new String[] {""} ;
      P01PB7_A764ProForCod = new String[] {""} ;
      P01PB7_A4705ProForPau = new short[1] ;
      P01PB7_A2392ProNumPro = new int[1] ;
      P01PB7_A4706ProForRb = new short[1] ;
      P01PB8_A396EmprCod = new String[] {""} ;
      P01PB8_A764ProForCod = new String[] {""} ;
      P01PB8_A457FasCod = new String[] {""} ;
      P01PB8_A4653FasForRb = new short[1] ;
      P01PB8_n4653FasForRb = new boolean[] {false} ;
      P01PB8_A4706ProForRb = new short[1] ;
      P01PB8_A4652FasForTPau = new short[1] ;
      P01PB8_n4652FasForTPau = new boolean[] {false} ;
      P01PB8_A4705ProForPau = new short[1] ;
      P01PB8_A4651FasForNPro = new short[1] ;
      P01PB8_n4651FasForNPro = new boolean[] {false} ;
      P01PB8_A2392ProNumPro = new int[1] ;
      P01PB8_A4650FasForLin = new short[1] ;
      A457FasCod = "" ;
      P01PB9_A396EmprCod = new String[] {""} ;
      P01PB9_A764ProForCod = new String[] {""} ;
      P01PB9_A5194ProFoCla = new String[] {""} ;
      P01PB9_n5194ProFoCla = new boolean[] {false} ;
      P01PB9_A5192ProFoPgC = new short[1] ;
      P01PB9_n5192ProFoPgC = new boolean[] {false} ;
      P01PB9_A5193ProFoTmC = new short[1] ;
      P01PB9_n5193ProFoTmC = new boolean[] {false} ;
      P01PB9_A5951ProFoRb = new short[1] ;
      P01PB9_n5951ProFoRb = new boolean[] {false} ;
      P01PB9_A5191ProForLC = new short[1] ;
      A5194ProFoCla = "" ;
      GXv_char14 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_int13 = new int[1] ;
      GXv_int16 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      AV40Accion = "" ;
      GXv_char17 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_int18 = new byte[1] ;
      GXv_char19 = new String[1] ;
      GXv_char20 = new String[1] ;
      P01PB10_A396EmprCod = new String[] {""} ;
      P01PB10_A4686MaqTipArt = new short[1] ;
      P01PB10_A5195MaqTipArtR = new short[1] ;
      P01PB10_n5195MaqTipArtR = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvolcal__default(),
         new Object[] {
             new Object[] {
            P01PB2_A396EmprCod, P01PB2_A129BarCod, P01PB2_A132BarCodReo, P01PB2_A130BarCodPar, P01PB2_A194BarOrdLin, P01PB2_A7944Dtb_ForLin, P01PB2_A7934Dtb_Ordl, P01PB2_A758ProCod
            }
            , new Object[] {
            P01PB3_A396EmprCod, P01PB3_A129BarCod, P01PB3_A132BarCodReo, P01PB3_A130BarCodPar, P01PB3_A194BarOrdLin, P01PB3_A150BarFacTin, P01PB3_A217BarTipArt, P01PB3_n217BarTipArt, P01PB3_A5369BarFasGral, P01PB3_n5369BarFasGral,
            P01PB3_A758ProCod
            }
            , new Object[] {
            P01PB4_A396EmprCod, P01PB4_A129BarCod, P01PB4_A132BarCodReo, P01PB4_A130BarCodPar, P01PB4_A2804RecLinMaq, P01PB4_A2805RecVolPrd, P01PB4_A602MaqCod
            }
            , new Object[] {
            P01PB5_A396EmprCod, P01PB5_A764ProForCod, P01PB5_A4705ProForPau, P01PB5_A2392ProNumPro, P01PB5_A4706ProForRb
            }
            , new Object[] {
            P01PB6_A396EmprCod, P01PB6_A602MaqCod, P01PB6_A625MaqVolMin, P01PB6_n625MaqVolMin, P01PB6_A623MaqVolMax, P01PB6_n623MaqVolMax
            }
            , new Object[] {
            P01PB7_A396EmprCod, P01PB7_A764ProForCod, P01PB7_A4705ProForPau, P01PB7_A2392ProNumPro, P01PB7_A4706ProForRb
            }
            , new Object[] {
            P01PB8_A396EmprCod, P01PB8_A764ProForCod, P01PB8_A457FasCod, P01PB8_A4653FasForRb, P01PB8_n4653FasForRb, P01PB8_A4706ProForRb, P01PB8_A4652FasForTPau, P01PB8_n4652FasForTPau, P01PB8_A4705ProForPau, P01PB8_A4651FasForNPro,
            P01PB8_n4651FasForNPro, P01PB8_A2392ProNumPro, P01PB8_A4650FasForLin
            }
            , new Object[] {
            P01PB9_A396EmprCod, P01PB9_A764ProForCod, P01PB9_A5194ProFoCla, P01PB9_n5194ProFoCla, P01PB9_A5192ProFoPgC, P01PB9_n5192ProFoPgC, P01PB9_A5193ProFoTmC, P01PB9_n5193ProFoTmC, P01PB9_A5951ProFoRb, P01PB9_n5951ProFoRb,
            P01PB9_A5191ProForLC
            }
            , new Object[] {
            P01PB10_A396EmprCod, P01PB10_A4686MaqTipArt, P01PB10_A5195MaqTipArtR, P01PB10_n5195MaqTipArtR
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV59Dt0051 ;
   private byte AV51F_pizarro ;
   private byte GXt_int15 ;
   private byte AV39Flag_ctrl ;
   private byte AV41F_faspr1 ;
   private byte GXv_int3[] ;
   private byte GXv_int16[] ;
   private byte GXv_int18[] ;
   private short A2804RecLinMaq ;
   private short AV29BarOrdLin ;
   private short AV31RecTiempo ;
   private short A194BarOrdLin ;
   private short A7944Dtb_ForLin ;
   private short A7934Dtb_Ordl ;
   private short GXv_int5[] ;
   private short GXv_int8[] ;
   private short A217BarTipArt ;
   private short AV43BarTipArt ;
   private short A4705ProForPau ;
   private short A4706ProForRb ;
   private short AV38Cont_c ;
   private short AV37ProFoTmc ;
   private short AV36ProFoPgc ;
   private short AV42MaqTipArtr ;
   private short AV54ProFoRb ;
   private short A4653FasForRb ;
   private short A4652FasForTPau ;
   private short A4651FasForNPro ;
   private short A4650FasForLin ;
   private short A5192ProFoPgC ;
   private short A5193ProFoTmC ;
   private short A5951ProFoRb ;
   private short A5191ProForLC ;
   private short GXv_int10[] ;
   private short A4686MaqTipArt ;
   private short A5195MaqTipArtR ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV32recNroPrg ;
   private int AV33RecVolPrf ;
   private int AV52Vol_old ;
   private int GXv_int2[] ;
   private int GXv_int11[] ;
   private int GXv_int12[] ;
   private int A2805RecVolPrd ;
   private int A2392ProNumPro ;
   private int AV48VolMax ;
   private int AV47VolMin ;
   private int A625MaqVolMin ;
   private int A623MaqVolMax ;
   private int AV49Volumen_c ;
   private int GXv_int13[] ;
   private java.math.BigDecimal AV35recTotKgs ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV34ProForCod ;
   private String AV30FasCod ;
   private String AV53ForCod_old ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String AV55Station ;
   private String AV56EmprNom ;
   private String AV57Usurcod ;
   private String A150BarFacTin ;
   private String A5369BarFasGral ;
   private String AV44BarFacTin ;
   private String AV45FaseGral ;
   private String A602MaqCod ;
   private String AV46MaqCod ;
   private String A764ProForCod ;
   private String A457FasCod ;
   private String A5194ProFoCla ;
   private String GXv_char14[] ;
   private String GXv_char9[] ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String AV40Accion ;
   private String GXv_char17[] ;
   private String GXv_char19[] ;
   private String GXv_char20[] ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private boolean n5369BarFasGral ;
   private boolean n625MaqVolMin ;
   private boolean n623MaqVolMax ;
   private boolean n4653FasForRb ;
   private boolean n4652FasForTPau ;
   private boolean n4651FasForNPro ;
   private boolean n5194ProFoCla ;
   private boolean n5192ProFoPgC ;
   private boolean n5193ProFoTmC ;
   private boolean n5951ProFoRb ;
   private boolean n5195MaqTipArtR ;
   private String AV50Texto_i ;
   private String[] aP13 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private short[] aP9 ;
   private int[] aP10 ;
   private int[] aP11 ;
   private int[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P01PB2_A396EmprCod ;
   private int[] P01PB2_A129BarCod ;
   private byte[] P01PB2_A132BarCodReo ;
   private String[] P01PB2_A130BarCodPar ;
   private short[] P01PB2_A194BarOrdLin ;
   private short[] P01PB2_A7944Dtb_ForLin ;
   private short[] P01PB2_A7934Dtb_Ordl ;
   private String[] P01PB2_A758ProCod ;
   private String[] P01PB3_A396EmprCod ;
   private int[] P01PB3_A129BarCod ;
   private byte[] P01PB3_A132BarCodReo ;
   private String[] P01PB3_A130BarCodPar ;
   private short[] P01PB3_A194BarOrdLin ;
   private String[] P01PB3_A150BarFacTin ;
   private short[] P01PB3_A217BarTipArt ;
   private boolean[] P01PB3_n217BarTipArt ;
   private String[] P01PB3_A5369BarFasGral ;
   private boolean[] P01PB3_n5369BarFasGral ;
   private String[] P01PB3_A758ProCod ;
   private String[] P01PB4_A396EmprCod ;
   private int[] P01PB4_A129BarCod ;
   private byte[] P01PB4_A132BarCodReo ;
   private String[] P01PB4_A130BarCodPar ;
   private short[] P01PB4_A2804RecLinMaq ;
   private int[] P01PB4_A2805RecVolPrd ;
   private String[] P01PB4_A602MaqCod ;
   private String[] P01PB5_A396EmprCod ;
   private String[] P01PB5_A764ProForCod ;
   private short[] P01PB5_A4705ProForPau ;
   private int[] P01PB5_A2392ProNumPro ;
   private short[] P01PB5_A4706ProForRb ;
   private String[] P01PB6_A396EmprCod ;
   private String[] P01PB6_A602MaqCod ;
   private int[] P01PB6_A625MaqVolMin ;
   private boolean[] P01PB6_n625MaqVolMin ;
   private int[] P01PB6_A623MaqVolMax ;
   private boolean[] P01PB6_n623MaqVolMax ;
   private String[] P01PB7_A396EmprCod ;
   private String[] P01PB7_A764ProForCod ;
   private short[] P01PB7_A4705ProForPau ;
   private int[] P01PB7_A2392ProNumPro ;
   private short[] P01PB7_A4706ProForRb ;
   private String[] P01PB8_A396EmprCod ;
   private String[] P01PB8_A764ProForCod ;
   private String[] P01PB8_A457FasCod ;
   private short[] P01PB8_A4653FasForRb ;
   private boolean[] P01PB8_n4653FasForRb ;
   private short[] P01PB8_A4706ProForRb ;
   private short[] P01PB8_A4652FasForTPau ;
   private boolean[] P01PB8_n4652FasForTPau ;
   private short[] P01PB8_A4705ProForPau ;
   private short[] P01PB8_A4651FasForNPro ;
   private boolean[] P01PB8_n4651FasForNPro ;
   private int[] P01PB8_A2392ProNumPro ;
   private short[] P01PB8_A4650FasForLin ;
   private String[] P01PB9_A396EmprCod ;
   private String[] P01PB9_A764ProForCod ;
   private String[] P01PB9_A5194ProFoCla ;
   private boolean[] P01PB9_n5194ProFoCla ;
   private short[] P01PB9_A5192ProFoPgC ;
   private boolean[] P01PB9_n5192ProFoPgC ;
   private short[] P01PB9_A5193ProFoTmC ;
   private boolean[] P01PB9_n5193ProFoTmC ;
   private short[] P01PB9_A5951ProFoRb ;
   private boolean[] P01PB9_n5951ProFoRb ;
   private short[] P01PB9_A5191ProForLC ;
   private String[] P01PB10_A396EmprCod ;
   private short[] P01PB10_A4686MaqTipArt ;
   private short[] P01PB10_A5195MaqTipArtR ;
   private boolean[] P01PB10_n5195MaqTipArtR ;
}

final  class pvolcal__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01PB2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, Dtb_ForLin, Dtb_Ordl, ProCod FROM TXPDT0051 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, Dtb_Ordl, Dtb_ForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01PB3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.BarFacTin, T2.BarTipArt, T1.BarFasGral, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01PB4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecVolPrd, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01PB5", "SELECT EmprCod, ProForCod, ProForPau, ProNumPro, ProForRb FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01PB6", "SELECT EmprCod, MaqCod, MaqVolMin, MaqVolMax FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01PB7", "SELECT EmprCod, ProForCod, ProForPau, ProNumPro, ProForRb FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01PB8", "SELECT T1.EmprCod, T1.ProForCod, T1.FasCod, T1.FasForRb, T2.ProForRb, T1.FasForTPau, T2.ProForPau, T1.FasForNPro, T2.ProNumPro, T1.FasForLin FROM (TXPFASPR1 T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE (T1.EmprCod = ? and T1.FasCod = ?) AND (T1.ProForCod = ?) ORDER BY T1.EmprCod, T1.FasCod, T1.FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01PB9", "SELECT EmprCod, ProForCod, ProFoCla, ProFoPgC, ProFoTmC, ProFoRb, ProForLC FROM TXPPROFOC WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01PB10", "SELECT EmprCod, MaqTipArt, MaqTipArtR FROM TXPMAQTAR WHERE EmprCod = ? and MaqTipArt = ? ORDER BY EmprCod, MaqTipArt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

