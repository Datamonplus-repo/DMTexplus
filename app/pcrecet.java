package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcrecet extends GXProcedure
{
   public pcrecet( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcrecet.class ), "" );
   }

   public pcrecet( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           short[] aP4 ,
                                           String[] aP5 ,
                                           short[] aP6 )
   {
      pcrecet.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      pcrecet.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcrecet.this.AV44BarCod = aP1[0];
      this.aP1 = aP1;
      pcrecet.this.AV45BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcrecet.this.AV46barCodPar = aP3[0];
      this.aP3 = aP3;
      pcrecet.this.AV47RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pcrecet.this.AV49Procod = aP5[0];
      this.aP5 = aP5;
      pcrecet.this.AV50barOrdLin = aP6[0];
      this.aP6 = aP6;
      pcrecet.this.AV37Kgs_for = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV80Dt0051 = (byte)(0) ;
      /* Using cursor P01RI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46barCodPar, AV49Procod, Short.valueOf(AV50barOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P01RI2_A194BarOrdLin[0] ;
         A758ProCod = P01RI2_A758ProCod[0] ;
         A130BarCodPar = P01RI2_A130BarCodPar[0] ;
         A132BarCodReo = P01RI2_A132BarCodReo[0] ;
         A129BarCod = P01RI2_A129BarCod[0] ;
         A7944Dtb_ForLin = P01RI2_A7944Dtb_ForLin[0] ;
         A7934Dtb_Ordl = P01RI2_A7934Dtb_Ordl[0] ;
         AV80Dt0051 = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV80Dt0051 == 1 )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = AV44BarCod ;
         GXv_int3[0] = AV45BarCodReo ;
         GXv_char4[0] = AV46barCodPar ;
         GXv_int5[0] = AV47RecLinMaq ;
         GXv_char6[0] = AV49Procod ;
         GXv_int7[0] = AV50barOrdLin ;
         GXv_decimal8[0] = AV37Kgs_for ;
         new app.pcrecets(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_int7, GXv_decimal8) ;
         pcrecet.this.A396EmprCod = GXv_char1[0] ;
         pcrecet.this.AV44BarCod = GXv_int2[0] ;
         pcrecet.this.AV45BarCodReo = GXv_int3[0] ;
         pcrecet.this.AV46barCodPar = GXv_char4[0] ;
         pcrecet.this.AV47RecLinMaq = GXv_int5[0] ;
         pcrecet.this.AV49Procod = GXv_char6[0] ;
         pcrecet.this.AV50barOrdLin = GXv_int7[0] ;
         pcrecet.this.AV37Kgs_for = GXv_decimal8[0] ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_int9 = AV65Pizarro ;
      GXv_int3[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIZARR", ""), GXv_int3) ;
      pcrecet.this.GXt_int9 = GXv_int3[0] ;
      AV65Pizarro = GXt_int9 ;
      GXt_int9 = AV73Ibatex ;
      GXv_int3[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IBATEX", ""), GXv_int3) ;
      pcrecet.this.GXt_int9 = GXv_int3[0] ;
      AV73Ibatex = GXt_int9 ;
      /* Using cursor P01RI3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46barCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P01RI3_A130BarCodPar[0] ;
         A132BarCodReo = P01RI3_A132BarCodReo[0] ;
         A129BarCod = P01RI3_A129BarCod[0] ;
         A217BarTipArt = P01RI3_A217BarTipArt[0] ;
         n217BarTipArt = P01RI3_n217BarTipArt[0] ;
         A2010BarTipDis = P01RI3_A2010BarTipDis[0] ;
         AV60BarTipArt = A217BarTipArt ;
         /* Execute user subroutine: 'MAQTAR' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV66BarTipDis = A2010BarTipDis ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor P01RI4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46barCodPar, AV49Procod, Short.valueOf(AV50barOrdLin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A194BarOrdLin = P01RI4_A194BarOrdLin[0] ;
         A758ProCod = P01RI4_A758ProCod[0] ;
         A130BarCodPar = P01RI4_A130BarCodPar[0] ;
         A132BarCodReo = P01RI4_A132BarCodReo[0] ;
         A129BarCod = P01RI4_A129BarCod[0] ;
         A4287BarFasFor = P01RI4_A4287BarFasFor[0] ;
         A4637BarFasCara = P01RI4_A4637BarFasCara[0] ;
         A150BarFacTin = P01RI4_A150BarFacTin[0] ;
         A5369BarFasGral = P01RI4_A5369BarFasGral[0] ;
         n5369BarFasGral = P01RI4_n5369BarFasGral[0] ;
         A457FasCod = P01RI4_A457FasCod[0] ;
         A6012BarFasTip = P01RI4_A6012BarFasTip[0] ;
         n6012BarFasTip = P01RI4_n6012BarFasTip[0] ;
         AV78BarFasfor = A4287BarFasFor ;
         AV77BarFascara = A4637BarFasCara ;
         AV51BarFactin = A150BarFacTin ;
         AV67BARFASGRAL = A5369BarFasGral ;
         AV69FasCod = A457FasCod ;
         AV72BarFasTip = A6012BarFasTip ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( ( AV65Pizarro == 0 ) || ( ( GXutil.strcmp(AV66BarTipDis, httpContext.getMessage( "L", "")) == 0 ) && ( AV65Pizarro == 1 ) ) || ( ( AV73Ibatex == 1 ) && ( GXutil.strcmp(AV72BarFasTip, httpContext.getMessage( "L", "")) == 0 ) ) || ( ( GXutil.strcmp(AV66BarTipDis, httpContext.getMessage( "T", "")) == 0 ) && ( AV65Pizarro == 1 ) && ( GXutil.strcmp(AV77BarFascara, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV78BarFasfor, httpContext.getMessage( "S", "")) == 0 ) ) || ( ( GXutil.strcmp(AV66BarTipDis, httpContext.getMessage( "T", "")) == 0 ) && ( AV73Ibatex == 1 ) && ( GXutil.strcmp(AV77BarFascara, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV78BarFasfor, httpContext.getMessage( "S", "")) == 0 ) ) )
      {
         /* Using cursor P01RI5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46barCodPar, Short.valueOf(AV47RecLinMaq)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A2804RecLinMaq = P01RI5_A2804RecLinMaq[0] ;
            A130BarCodPar = P01RI5_A130BarCodPar[0] ;
            A132BarCodReo = P01RI5_A132BarCodReo[0] ;
            A129BarCod = P01RI5_A129BarCod[0] ;
            A602MaqCod = P01RI5_A602MaqCod[0] ;
            AV52MaqCod = A602MaqCod ;
            /* Execute user subroutine: 'MAQUIN' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P01RI6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A764ProForCod = P01RI6_A764ProForCod[0] ;
               A4696RecTiempo = P01RI6_A4696RecTiempo[0] ;
               n4696RecTiempo = P01RI6_n4696RecTiempo[0] ;
               A4697RecNroPrg = P01RI6_A4697RecNroPrg[0] ;
               A1273RecLinPro = P01RI6_A1273RecLinPro[0] ;
               AV38ProFoPgc = (short)(0) ;
               AV39ProFoTmc = (short)(0) ;
               AV48ProFoRb = (short)(0) ;
               AV40Cont_c = (short)(0) ;
               AV43ProForCod = A764ProForCod ;
               /* Execute user subroutine: 'PROFOC' */
               S1614 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  pr_default.close(3);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( ( AV41Flag_ctrl == 1 ) || ( AV40Cont_c > 0 ) )
               {
                  A4696RecTiempo = AV39ProFoTmc ;
                  n4696RecTiempo = false ;
                  A4697RecNroPrg = AV38ProFoPgc ;
               }
               if ( ( GXutil.strcmp(AV66BarTipDis, httpContext.getMessage( "L", "")) == 0 ) && ( AV65Pizarro == 1 ) && ( AV38ProFoPgc == 0 ) )
               {
                  AV38ProFoPgc = (short)(A4697RecNroPrg) ;
               }
               if ( ( GXutil.strcmp(GXutil.trim( AV74MaqTinTip), httpContext.getMessage( "C", "")) == 0 ) && ( AV65Pizarro == 1 ) )
               {
                  /* Execute user subroutine: 'PROMUE' */
                  S121 ();
                  if ( returnInSub )
                  {
                     pr_default.close(4);
                     pr_default.close(3);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  if ( ( AV76PROMUE == 1 ) && ( AV75NUMPROM > 0 ) )
                  {
                     A4697RecNroPrg = AV75NUMPROM ;
                  }
               }
               /* Using cursor P01RI7 */
               pr_default.execute(5, new Object[] {Boolean.valueOf(n4696RecTiempo), Short.valueOf(A4696RecTiempo), Integer.valueOf(A4697RecNroPrg), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P01RI8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46barCodPar, Short.valueOf(AV47RecLinMaq)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A2804RecLinMaq = P01RI8_A2804RecLinMaq[0] ;
         A130BarCodPar = P01RI8_A130BarCodPar[0] ;
         A132BarCodReo = P01RI8_A132BarCodReo[0] ;
         A129BarCod = P01RI8_A129BarCod[0] ;
         A602MaqCod = P01RI8_A602MaqCod[0] ;
         AV52MaqCod = A602MaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
      /* Execute user subroutine: 'MAQUIN' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV55i = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV57Tab_p[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV56Tab_vol[GX_I-1] = 0 ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV58Tab_rb[GX_I-1] = (short)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV70Tab_lin[GX_I-1] = (byte)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV62F_error = (byte)(0) ;
      /* Using cursor P01RI9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46barCodPar, Short.valueOf(AV47RecLinMaq)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A2804RecLinMaq = P01RI9_A2804RecLinMaq[0] ;
         A130BarCodPar = P01RI9_A130BarCodPar[0] ;
         A132BarCodReo = P01RI9_A132BarCodReo[0] ;
         A129BarCod = P01RI9_A129BarCod[0] ;
         A764ProForCod = P01RI9_A764ProForCod[0] ;
         A4695RecVolPrf = P01RI9_A4695RecVolPrf[0] ;
         A1273RecLinPro = P01RI9_A1273RecLinPro[0] ;
         AV43ProForCod = A764ProForCod ;
         AV64RecVolPrf = A4695RecVolPrf ;
         AV70Tab_lin[AV55i-1] = A1273RecLinPro ;
         AV57Tab_p[AV55i-1] = A764ProForCod ;
         /* Execute user subroutine: 'PROFOC' */
         S1614 ();
         if ( returnInSub )
         {
            pr_default.close(7);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( AV41Flag_ctrl == 1 ) || ( AV40Cont_c > 0 ) )
         {
            if ( AV48ProFoRb > 0 )
            {
               AV64RecVolPrf = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV48ProFoRb).multiply(AV37Kgs_for))) ;
            }
         }
         if ( GXutil.strcmp(AV51BarFactin, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Execute user subroutine: 'CPROFO' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(7);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV68Rb_f > 0 )
            {
               AV59Rb = AV68Rb_f ;
            }
            if ( ( AV68Rb_f == 0 ) && ( AV48ProFoRb > 0 ) )
            {
               AV59Rb = AV48ProFoRb ;
            }
            if ( ( AV61Rb_art > 0 ) && ( AV68Rb_f == 0 ) && ( AV48ProFoRb == 0 ) )
            {
               AV59Rb = AV61Rb_art ;
            }
         }
         else
         {
            if ( GXutil.strcmp(AV67BARFASGRAL, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Execute user subroutine: 'FASQUI' */
               S151 ();
               if ( returnInSub )
               {
                  pr_default.close(7);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            else
            {
               /* Execute user subroutine: 'FASPR1' */
               S171 ();
               if ( returnInSub )
               {
                  pr_default.close(7);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
         }
         if ( AV59Rb == 0 )
         {
            if ( AV61Rb_art > 0 )
            {
               AV59Rb = AV61Rb_art ;
            }
         }
         AV64RecVolPrf = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV59Rb).multiply(AV37Kgs_for))) ;
         AV58Tab_rb[AV55i-1] = AV59Rb ;
         if ( ( AV64RecVolPrf > AV54VolMx ) || ( AV64RecVolPrf < AV53VolMin ) )
         {
            AV56Tab_vol[AV55i-1] = AV64RecVolPrf ;
            AV62F_error = (byte)(1) ;
         }
         else
         {
            AV56Tab_vol[AV55i-1] = AV64RecVolPrf ;
         }
         AV55i = (short)(AV55i+1) ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
      if ( AV62F_error > 0 )
      {
         if ( AV65Pizarro == 1 )
         {
            AV55i = (short)(1) ;
            while ( ! (0==AV70Tab_lin[AV55i-1]) )
            {
               if ( AV56Tab_vol[AV55i-1] > AV54VolMx )
               {
                  AV56Tab_vol[AV55i-1] = AV54VolMx ;
               }
               else
               {
                  if ( AV56Tab_vol[AV55i-1] < AV53VolMin )
                  {
                     AV56Tab_vol[AV55i-1] = AV53VolMin ;
                  }
               }
               AV55i = (short)(AV55i+1) ;
            }
         }
         else
         {
            AV63Abandonar = (byte)(0) ;
            while ( AV63Abandonar == 0 )
            {
            }
         }
      }
      AV55i = (short)(1) ;
      while ( ! (0==AV70Tab_lin[AV55i-1]) )
      {
         AV71RecLinPro = AV70Tab_lin[AV55i-1] ;
         /* Using cursor P01RI10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46barCodPar, Short.valueOf(AV47RecLinMaq), Byte.valueOf(AV71RecLinPro)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A1273RecLinPro = P01RI10_A1273RecLinPro[0] ;
            A2804RecLinMaq = P01RI10_A2804RecLinMaq[0] ;
            A130BarCodPar = P01RI10_A130BarCodPar[0] ;
            A132BarCodReo = P01RI10_A132BarCodReo[0] ;
            A129BarCod = P01RI10_A129BarCod[0] ;
            A4695RecVolPrf = P01RI10_A4695RecVolPrf[0] ;
            A764ProForCod = P01RI10_A764ProForCod[0] ;
            A4696RecTiempo = P01RI10_A4696RecTiempo[0] ;
            n4696RecTiempo = P01RI10_n4696RecTiempo[0] ;
            A4697RecNroPrg = P01RI10_A4697RecNroPrg[0] ;
            A4695RecVolPrf = AV56Tab_vol[AV55i-1] ;
            AV43ProForCod = A764ProForCod ;
            /* Execute user subroutine: 'PROFOC' */
            S1614 ();
            if ( returnInSub )
            {
               pr_default.close(8);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( ( AV41Flag_ctrl == 1 ) || ( AV40Cont_c > 0 ) )
            {
               A4696RecTiempo = AV39ProFoTmc ;
               n4696RecTiempo = false ;
               A4697RecNroPrg = AV38ProFoPgc ;
            }
            else
            {
               AV38ProFoPgc = (short)(A4697RecNroPrg) ;
            }
            if ( ( GXutil.strcmp(GXutil.trim( AV74MaqTinTip), httpContext.getMessage( "A", "")) == 0 ) && ( AV73Ibatex == 1 ) )
            {
               /* Execute user subroutine: 'PROMUE' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(8);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( ( AV76PROMUE == 1 ) && ( AV75NUMPROM > 0 ) )
               {
                  A4697RecNroPrg = AV75NUMPROM ;
               }
            }
            if ( ( GXutil.strcmp(GXutil.trim( AV74MaqTinTip), httpContext.getMessage( "C", "")) == 0 ) && ( AV65Pizarro == 1 ) )
            {
               /* Execute user subroutine: 'PROMUE' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(8);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( ( AV76PROMUE == 1 ) && ( AV75NUMPROM > 0 ) )
               {
                  A4697RecNroPrg = AV75NUMPROM ;
               }
            }
            /* Using cursor P01RI11 */
            pr_default.execute(9, new Object[] {Integer.valueOf(A4695RecVolPrf), Boolean.valueOf(n4696RecTiempo), Short.valueOf(A4696RecTiempo), Integer.valueOf(A4697RecNroPrg), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
         AV55i = (short)(AV55i+1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV53VolMin = 0 ;
      AV54VolMx = 0 ;
      AV74MaqTinTip = GXutil.space( (short)(2)) ;
      /* Using cursor P01RI12 */
      pr_default.execute(10, new Object[] {A396EmprCod, AV52MaqCod});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A602MaqCod = P01RI12_A602MaqCod[0] ;
         A625MaqVolMin = P01RI12_A625MaqVolMin[0] ;
         n625MaqVolMin = P01RI12_n625MaqVolMin[0] ;
         A623MaqVolMax = P01RI12_A623MaqVolMax[0] ;
         n623MaqVolMax = P01RI12_n623MaqVolMax[0] ;
         A619MaqTinTip = P01RI12_A619MaqTinTip[0] ;
         n619MaqTinTip = P01RI12_n619MaqTinTip[0] ;
         AV53VolMin = A625MaqVolMin ;
         AV54VolMx = A623MaqVolMax ;
         AV74MaqTinTip = A619MaqTinTip ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S121( )
   {
      /* 'PROMUE' Routine */
      returnInSub = false ;
      AV75NUMPROM = (short)(0) ;
      AV76PROMUE = (byte)(0) ;
      /* Using cursor P01RI13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Short.valueOf(AV38ProFoPgc), AV52MaqCod});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A6873NMaqCod = P01RI13_A6873NMaqCod[0] ;
         n6873NMaqCod = P01RI13_n6873NMaqCod[0] ;
         A6040NumProg = P01RI13_A6040NumProg[0] ;
         A6041NumProM = P01RI13_A6041NumProM[0] ;
         n6041NumProM = P01RI13_n6041NumProM[0] ;
         AV75NUMPROM = A6041NumProM ;
         AV76PROMUE = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S131( )
   {
      /* 'MAQTAR' Routine */
      returnInSub = false ;
      AV61Rb_art = (short)(0) ;
      /* Using cursor P01RI14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(AV60BarTipArt)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A4686MaqTipArt = P01RI14_A4686MaqTipArt[0] ;
         A5195MaqTipArtR = P01RI14_A5195MaqTipArtR[0] ;
         n5195MaqTipArtR = P01RI14_n5195MaqTipArtR[0] ;
         AV61Rb_art = A5195MaqTipArtR ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S141( )
   {
      /* 'CPROFO' Routine */
      returnInSub = false ;
      AV68Rb_f = (short)(0) ;
      /* Using cursor P01RI15 */
      pr_default.execute(13, new Object[] {A396EmprCod, AV43ProForCod});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A764ProForCod = P01RI15_A764ProForCod[0] ;
         A4706ProForRb = P01RI15_A4706ProForRb[0] ;
         AV68Rb_f = A4706ProForRb ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void S151( )
   {
      /* 'FASQUI' Routine */
      returnInSub = false ;
      AV59Rb = (short)(0) ;
      /* Using cursor P01RI16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV44BarCod), Byte.valueOf(AV45BarCodReo), AV46barCodPar, AV49Procod, Short.valueOf(AV50barOrdLin)});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A194BarOrdLin = P01RI16_A194BarOrdLin[0] ;
         A758ProCod = P01RI16_A758ProCod[0] ;
         A130BarCodPar = P01RI16_A130BarCodPar[0] ;
         A132BarCodReo = P01RI16_A132BarCodReo[0] ;
         A129BarCod = P01RI16_A129BarCod[0] ;
         A764ProForCod = P01RI16_A764ProForCod[0] ;
         A5375FasQuiRb = P01RI16_A5375FasQuiRb[0] ;
         A4706ProForRb = P01RI16_A4706ProForRb[0] ;
         A5371FasQuiLin = P01RI16_A5371FasQuiLin[0] ;
         A4706ProForRb = P01RI16_A4706ProForRb[0] ;
         if ( GXutil.strcmp(A764ProForCod, AV43ProForCod) == 0 )
         {
            if ( A5375FasQuiRb > 0 )
            {
               AV59Rb = A5375FasQuiRb ;
            }
            if ( ( A4706ProForRb > 0 ) && ( A5375FasQuiRb == 0 ) )
            {
               AV59Rb = A4706ProForRb ;
            }
            if ( ( AV48ProFoRb > 0 ) && ( A4706ProForRb == 0 ) && ( A5375FasQuiRb == 0 ) )
            {
               AV59Rb = AV48ProFoRb ;
            }
            if ( ( AV61Rb_art > 0 ) && ( A5375FasQuiRb == 0 ) && ( A4706ProForRb == 0 ) && ( AV48ProFoRb == 0 ) )
            {
               AV59Rb = AV61Rb_art ;
            }
            AV43ProForCod = A764ProForCod ;
            /* Execute user subroutine: 'PROFOC' */
            S1614 ();
            if ( returnInSub )
            {
               pr_default.close(14);
               pr_default.close(14);
               returnInSub = true;
               if (true) return;
            }
            if ( ( AV41Flag_ctrl == 1 ) || ( AV40Cont_c > 0 ) )
            {
               AV59Rb = AV48ProFoRb ;
            }
         }
         pr_default.readNext(14);
      }
      pr_default.close(14);
   }

   public void S171( )
   {
      /* 'FASPR1' Routine */
      returnInSub = false ;
      AV59Rb = (short)(0) ;
      /* Using cursor P01RI17 */
      pr_default.execute(15, new Object[] {A396EmprCod, AV69FasCod});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A457FasCod = P01RI17_A457FasCod[0] ;
         A764ProForCod = P01RI17_A764ProForCod[0] ;
         A4653FasForRb = P01RI17_A4653FasForRb[0] ;
         n4653FasForRb = P01RI17_n4653FasForRb[0] ;
         A4706ProForRb = P01RI17_A4706ProForRb[0] ;
         A4650FasForLin = P01RI17_A4650FasForLin[0] ;
         A4706ProForRb = P01RI17_A4706ProForRb[0] ;
         if ( GXutil.strcmp(AV43ProForCod, A764ProForCod) == 0 )
         {
            if ( A4653FasForRb > 0 )
            {
               AV59Rb = A4653FasForRb ;
            }
            if ( ( A4706ProForRb > 0 ) && ( A4653FasForRb == 0 ) )
            {
               AV59Rb = A4706ProForRb ;
            }
            if ( ( AV48ProFoRb > 0 ) && ( A4706ProForRb == 0 ) && ( A4653FasForRb == 0 ) )
            {
               AV59Rb = AV48ProFoRb ;
            }
            if ( ( AV61Rb_art > 0 ) && ( A4653FasForRb == 0 ) && ( A4706ProForRb == 0 ) && ( AV48ProFoRb == 0 ) )
            {
               AV59Rb = AV61Rb_art ;
            }
            AV43ProForCod = A764ProForCod ;
            /* Execute user subroutine: 'PROFOC' */
            S1614 ();
            if ( returnInSub )
            {
               pr_default.close(15);
               pr_default.close(15);
               returnInSub = true;
               if (true) return;
            }
            if ( ( AV41Flag_ctrl == 1 ) || ( AV40Cont_c > 0 ) )
            {
               AV59Rb = AV48ProFoRb ;
            }
         }
         pr_default.readNext(15);
      }
      pr_default.close(15);
   }

   public void S1614( )
   {
      /* 'PROFOC' Routine */
      returnInSub = false ;
      AV41Flag_ctrl = (byte)(0) ;
      AV40Cont_c = (short)(0) ;
      AV38ProFoPgc = (short)(0) ;
      AV39ProFoTmc = (short)(0) ;
      AV48ProFoRb = (short)(0) ;
      /* Using cursor P01RI18 */
      pr_default.execute(16, new Object[] {A396EmprCod, AV43ProForCod});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A764ProForCod = P01RI18_A764ProForCod[0] ;
         A5194ProFoCla = P01RI18_A5194ProFoCla[0] ;
         n5194ProFoCla = P01RI18_n5194ProFoCla[0] ;
         A5192ProFoPgC = P01RI18_A5192ProFoPgC[0] ;
         n5192ProFoPgC = P01RI18_n5192ProFoPgC[0] ;
         A5193ProFoTmC = P01RI18_A5193ProFoTmC[0] ;
         n5193ProFoTmC = P01RI18_n5193ProFoTmC[0] ;
         A5951ProFoRb = P01RI18_A5951ProFoRb[0] ;
         n5951ProFoRb = P01RI18_n5951ProFoRb[0] ;
         A5191ProForLC = P01RI18_A5191ProForLC[0] ;
         AV41Flag_ctrl = (byte)(0) ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char4[0] = " " ;
         GXv_char1[0] = A5194ProFoCla ;
         GXv_int3[0] = AV41Flag_ctrl ;
         GXv_int2[0] = AV44BarCod ;
         GXv_int10[0] = AV45BarCodReo ;
         GXv_char11[0] = AV46barCodPar ;
         GXv_decimal8[0] = AV37Kgs_for ;
         GXv_char12[0] = " " ;
         GXv_char13[0] = AV42Accion ;
         GXv_int7[0] = AV47RecLinMaq ;
         GXv_int14[0] = (byte)(0) ;
         GXv_char15[0] = AV51BarFactin ;
         GXv_char16[0] = "" ;
         new app.pclaespl(remoteHandle, context).execute( GXv_char6, GXv_char4, GXv_char1, GXv_int3, GXv_int2, GXv_int10, GXv_char11, GXv_decimal8, GXv_char12, GXv_char13, GXv_int7, GXv_int14, GXv_char15, GXv_char16) ;
         pcrecet.this.A396EmprCod = GXv_char6[0] ;
         pcrecet.this.A5194ProFoCla = GXv_char1[0] ;
         pcrecet.this.AV41Flag_ctrl = GXv_int3[0] ;
         pcrecet.this.AV44BarCod = GXv_int2[0] ;
         pcrecet.this.AV45BarCodReo = GXv_int10[0] ;
         pcrecet.this.AV46barCodPar = GXv_char11[0] ;
         pcrecet.this.AV37Kgs_for = GXv_decimal8[0] ;
         pcrecet.this.AV42Accion = GXv_char13[0] ;
         pcrecet.this.AV47RecLinMaq = GXv_int7[0] ;
         pcrecet.this.AV51BarFactin = GXv_char15[0] ;
         if ( ( AV41Flag_ctrl == 1 ) || (GXutil.strcmp("", A5194ProFoCla)==0) )
         {
            AV38ProFoPgc = A5192ProFoPgC ;
            AV39ProFoTmc = A5193ProFoTmC ;
            AV48ProFoRb = A5951ProFoRb ;
            AV40Cont_c = (short)(AV40Cont_c+1) ;
         }
         pr_default.readNext(16);
      }
      pr_default.close(16);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcrecet.this.A396EmprCod;
      this.aP1[0] = pcrecet.this.AV44BarCod;
      this.aP2[0] = pcrecet.this.AV45BarCodReo;
      this.aP3[0] = pcrecet.this.AV46barCodPar;
      this.aP4[0] = pcrecet.this.AV47RecLinMaq;
      this.aP5[0] = pcrecet.this.AV49Procod;
      this.aP6[0] = pcrecet.this.AV50barOrdLin;
      this.aP7[0] = pcrecet.this.AV37Kgs_for;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcrecet");
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
      P01RI2_A396EmprCod = new String[] {""} ;
      P01RI2_A194BarOrdLin = new short[1] ;
      P01RI2_A758ProCod = new String[] {""} ;
      P01RI2_A130BarCodPar = new String[] {""} ;
      P01RI2_A132BarCodReo = new byte[1] ;
      P01RI2_A129BarCod = new int[1] ;
      P01RI2_A7944Dtb_ForLin = new short[1] ;
      P01RI2_A7934Dtb_Ordl = new short[1] ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      GXv_int5 = new short[1] ;
      P01RI3_A396EmprCod = new String[] {""} ;
      P01RI3_A130BarCodPar = new String[] {""} ;
      P01RI3_A132BarCodReo = new byte[1] ;
      P01RI3_A129BarCod = new int[1] ;
      P01RI3_A217BarTipArt = new short[1] ;
      P01RI3_n217BarTipArt = new boolean[] {false} ;
      P01RI3_A2010BarTipDis = new String[] {""} ;
      A2010BarTipDis = "" ;
      AV66BarTipDis = "" ;
      P01RI4_A396EmprCod = new String[] {""} ;
      P01RI4_A194BarOrdLin = new short[1] ;
      P01RI4_A758ProCod = new String[] {""} ;
      P01RI4_A130BarCodPar = new String[] {""} ;
      P01RI4_A132BarCodReo = new byte[1] ;
      P01RI4_A129BarCod = new int[1] ;
      P01RI4_A4287BarFasFor = new String[] {""} ;
      P01RI4_A4637BarFasCara = new String[] {""} ;
      P01RI4_A150BarFacTin = new String[] {""} ;
      P01RI4_A5369BarFasGral = new String[] {""} ;
      P01RI4_n5369BarFasGral = new boolean[] {false} ;
      P01RI4_A457FasCod = new String[] {""} ;
      P01RI4_A6012BarFasTip = new String[] {""} ;
      P01RI4_n6012BarFasTip = new boolean[] {false} ;
      A4287BarFasFor = "" ;
      A4637BarFasCara = "" ;
      A150BarFacTin = "" ;
      A5369BarFasGral = "" ;
      A457FasCod = "" ;
      A6012BarFasTip = "" ;
      AV78BarFasfor = "" ;
      AV77BarFascara = "" ;
      AV51BarFactin = "" ;
      AV67BARFASGRAL = "" ;
      AV69FasCod = "" ;
      AV72BarFasTip = "" ;
      P01RI5_A396EmprCod = new String[] {""} ;
      P01RI5_A2804RecLinMaq = new short[1] ;
      P01RI5_A130BarCodPar = new String[] {""} ;
      P01RI5_A132BarCodReo = new byte[1] ;
      P01RI5_A129BarCod = new int[1] ;
      P01RI5_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      AV52MaqCod = "" ;
      P01RI6_A396EmprCod = new String[] {""} ;
      P01RI6_A129BarCod = new int[1] ;
      P01RI6_A132BarCodReo = new byte[1] ;
      P01RI6_A130BarCodPar = new String[] {""} ;
      P01RI6_A2804RecLinMaq = new short[1] ;
      P01RI6_A764ProForCod = new String[] {""} ;
      P01RI6_A4696RecTiempo = new short[1] ;
      P01RI6_n4696RecTiempo = new boolean[] {false} ;
      P01RI6_A4697RecNroPrg = new int[1] ;
      P01RI6_A1273RecLinPro = new byte[1] ;
      A764ProForCod = "" ;
      AV43ProForCod = "" ;
      AV74MaqTinTip = "" ;
      P01RI8_A396EmprCod = new String[] {""} ;
      P01RI8_A2804RecLinMaq = new short[1] ;
      P01RI8_A130BarCodPar = new String[] {""} ;
      P01RI8_A132BarCodReo = new byte[1] ;
      P01RI8_A129BarCod = new int[1] ;
      P01RI8_A602MaqCod = new String[] {""} ;
      AV57Tab_p = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV57Tab_p[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV56Tab_vol = new int[100] ;
      AV58Tab_rb = new short[100] ;
      AV70Tab_lin = new byte[100] ;
      P01RI9_A396EmprCod = new String[] {""} ;
      P01RI9_A2804RecLinMaq = new short[1] ;
      P01RI9_A130BarCodPar = new String[] {""} ;
      P01RI9_A132BarCodReo = new byte[1] ;
      P01RI9_A129BarCod = new int[1] ;
      P01RI9_A764ProForCod = new String[] {""} ;
      P01RI9_A4695RecVolPrf = new int[1] ;
      P01RI9_A1273RecLinPro = new byte[1] ;
      P01RI10_A396EmprCod = new String[] {""} ;
      P01RI10_A1273RecLinPro = new byte[1] ;
      P01RI10_A2804RecLinMaq = new short[1] ;
      P01RI10_A130BarCodPar = new String[] {""} ;
      P01RI10_A132BarCodReo = new byte[1] ;
      P01RI10_A129BarCod = new int[1] ;
      P01RI10_A4695RecVolPrf = new int[1] ;
      P01RI10_A764ProForCod = new String[] {""} ;
      P01RI10_A4696RecTiempo = new short[1] ;
      P01RI10_n4696RecTiempo = new boolean[] {false} ;
      P01RI10_A4697RecNroPrg = new int[1] ;
      P01RI12_A396EmprCod = new String[] {""} ;
      P01RI12_A602MaqCod = new String[] {""} ;
      P01RI12_A625MaqVolMin = new int[1] ;
      P01RI12_n625MaqVolMin = new boolean[] {false} ;
      P01RI12_A623MaqVolMax = new int[1] ;
      P01RI12_n623MaqVolMax = new boolean[] {false} ;
      P01RI12_A619MaqTinTip = new String[] {""} ;
      P01RI12_n619MaqTinTip = new boolean[] {false} ;
      A619MaqTinTip = "" ;
      P01RI13_A396EmprCod = new String[] {""} ;
      P01RI13_A6873NMaqCod = new String[] {""} ;
      P01RI13_n6873NMaqCod = new boolean[] {false} ;
      P01RI13_A6040NumProg = new short[1] ;
      P01RI13_A6041NumProM = new short[1] ;
      P01RI13_n6041NumProM = new boolean[] {false} ;
      A6873NMaqCod = "" ;
      P01RI14_A396EmprCod = new String[] {""} ;
      P01RI14_A4686MaqTipArt = new short[1] ;
      P01RI14_A5195MaqTipArtR = new short[1] ;
      P01RI14_n5195MaqTipArtR = new boolean[] {false} ;
      P01RI15_A396EmprCod = new String[] {""} ;
      P01RI15_A764ProForCod = new String[] {""} ;
      P01RI15_A4706ProForRb = new short[1] ;
      P01RI16_A396EmprCod = new String[] {""} ;
      P01RI16_A194BarOrdLin = new short[1] ;
      P01RI16_A758ProCod = new String[] {""} ;
      P01RI16_A130BarCodPar = new String[] {""} ;
      P01RI16_A132BarCodReo = new byte[1] ;
      P01RI16_A129BarCod = new int[1] ;
      P01RI16_A764ProForCod = new String[] {""} ;
      P01RI16_A5375FasQuiRb = new short[1] ;
      P01RI16_A4706ProForRb = new short[1] ;
      P01RI16_A5371FasQuiLin = new short[1] ;
      P01RI17_A396EmprCod = new String[] {""} ;
      P01RI17_A457FasCod = new String[] {""} ;
      P01RI17_A764ProForCod = new String[] {""} ;
      P01RI17_A4653FasForRb = new short[1] ;
      P01RI17_n4653FasForRb = new boolean[] {false} ;
      P01RI17_A4706ProForRb = new short[1] ;
      P01RI17_A4650FasForLin = new short[1] ;
      P01RI18_A396EmprCod = new String[] {""} ;
      P01RI18_A764ProForCod = new String[] {""} ;
      P01RI18_A5194ProFoCla = new String[] {""} ;
      P01RI18_n5194ProFoCla = new boolean[] {false} ;
      P01RI18_A5192ProFoPgC = new short[1] ;
      P01RI18_n5192ProFoPgC = new boolean[] {false} ;
      P01RI18_A5193ProFoTmC = new short[1] ;
      P01RI18_n5193ProFoTmC = new boolean[] {false} ;
      P01RI18_A5951ProFoRb = new short[1] ;
      P01RI18_n5951ProFoRb = new boolean[] {false} ;
      P01RI18_A5191ProForLC = new short[1] ;
      A5194ProFoCla = "" ;
      GXv_char6 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_int2 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char12 = new String[1] ;
      AV42Accion = "" ;
      GXv_char13 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_int14 = new byte[1] ;
      GXv_char15 = new String[1] ;
      GXv_char16 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcrecet__default(),
         new Object[] {
             new Object[] {
            P01RI2_A396EmprCod, P01RI2_A194BarOrdLin, P01RI2_A758ProCod, P01RI2_A130BarCodPar, P01RI2_A132BarCodReo, P01RI2_A129BarCod, P01RI2_A7944Dtb_ForLin, P01RI2_A7934Dtb_Ordl
            }
            , new Object[] {
            P01RI3_A396EmprCod, P01RI3_A130BarCodPar, P01RI3_A132BarCodReo, P01RI3_A129BarCod, P01RI3_A217BarTipArt, P01RI3_n217BarTipArt, P01RI3_A2010BarTipDis
            }
            , new Object[] {
            P01RI4_A396EmprCod, P01RI4_A194BarOrdLin, P01RI4_A758ProCod, P01RI4_A130BarCodPar, P01RI4_A132BarCodReo, P01RI4_A129BarCod, P01RI4_A4287BarFasFor, P01RI4_A4637BarFasCara, P01RI4_A150BarFacTin, P01RI4_A5369BarFasGral,
            P01RI4_n5369BarFasGral, P01RI4_A457FasCod, P01RI4_A6012BarFasTip, P01RI4_n6012BarFasTip
            }
            , new Object[] {
            P01RI5_A396EmprCod, P01RI5_A2804RecLinMaq, P01RI5_A130BarCodPar, P01RI5_A132BarCodReo, P01RI5_A129BarCod, P01RI5_A602MaqCod
            }
            , new Object[] {
            P01RI6_A396EmprCod, P01RI6_A129BarCod, P01RI6_A132BarCodReo, P01RI6_A130BarCodPar, P01RI6_A2804RecLinMaq, P01RI6_A764ProForCod, P01RI6_A4696RecTiempo, P01RI6_n4696RecTiempo, P01RI6_A4697RecNroPrg, P01RI6_A1273RecLinPro
            }
            , new Object[] {
            }
            , new Object[] {
            P01RI8_A396EmprCod, P01RI8_A2804RecLinMaq, P01RI8_A130BarCodPar, P01RI8_A132BarCodReo, P01RI8_A129BarCod, P01RI8_A602MaqCod
            }
            , new Object[] {
            P01RI9_A396EmprCod, P01RI9_A2804RecLinMaq, P01RI9_A130BarCodPar, P01RI9_A132BarCodReo, P01RI9_A129BarCod, P01RI9_A764ProForCod, P01RI9_A4695RecVolPrf, P01RI9_A1273RecLinPro
            }
            , new Object[] {
            P01RI10_A396EmprCod, P01RI10_A1273RecLinPro, P01RI10_A2804RecLinMaq, P01RI10_A130BarCodPar, P01RI10_A132BarCodReo, P01RI10_A129BarCod, P01RI10_A4695RecVolPrf, P01RI10_A764ProForCod, P01RI10_A4696RecTiempo, P01RI10_n4696RecTiempo,
            P01RI10_A4697RecNroPrg
            }
            , new Object[] {
            }
            , new Object[] {
            P01RI12_A396EmprCod, P01RI12_A602MaqCod, P01RI12_A625MaqVolMin, P01RI12_n625MaqVolMin, P01RI12_A623MaqVolMax, P01RI12_n623MaqVolMax, P01RI12_A619MaqTinTip, P01RI12_n619MaqTinTip
            }
            , new Object[] {
            P01RI13_A396EmprCod, P01RI13_A6873NMaqCod, P01RI13_n6873NMaqCod, P01RI13_A6040NumProg, P01RI13_A6041NumProM, P01RI13_n6041NumProM
            }
            , new Object[] {
            P01RI14_A396EmprCod, P01RI14_A4686MaqTipArt, P01RI14_A5195MaqTipArtR, P01RI14_n5195MaqTipArtR
            }
            , new Object[] {
            P01RI15_A396EmprCod, P01RI15_A764ProForCod, P01RI15_A4706ProForRb
            }
            , new Object[] {
            P01RI16_A396EmprCod, P01RI16_A194BarOrdLin, P01RI16_A758ProCod, P01RI16_A130BarCodPar, P01RI16_A132BarCodReo, P01RI16_A129BarCod, P01RI16_A764ProForCod, P01RI16_A5375FasQuiRb, P01RI16_A4706ProForRb, P01RI16_A5371FasQuiLin
            }
            , new Object[] {
            P01RI17_A396EmprCod, P01RI17_A457FasCod, P01RI17_A764ProForCod, P01RI17_A4653FasForRb, P01RI17_n4653FasForRb, P01RI17_A4706ProForRb, P01RI17_A4650FasForLin
            }
            , new Object[] {
            P01RI18_A396EmprCod, P01RI18_A764ProForCod, P01RI18_A5194ProFoCla, P01RI18_n5194ProFoCla, P01RI18_A5192ProFoPgC, P01RI18_n5192ProFoPgC, P01RI18_A5193ProFoTmC, P01RI18_n5193ProFoTmC, P01RI18_A5951ProFoRb, P01RI18_n5951ProFoRb,
            P01RI18_A5191ProForLC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV45BarCodReo ;
   private byte AV80Dt0051 ;
   private byte A132BarCodReo ;
   private byte AV65Pizarro ;
   private byte AV73Ibatex ;
   private byte GXt_int9 ;
   private byte A1273RecLinPro ;
   private byte AV41Flag_ctrl ;
   private byte AV76PROMUE ;
   private byte AV70Tab_lin[] ;
   private byte AV62F_error ;
   private byte AV63Abandonar ;
   private byte AV71RecLinPro ;
   private byte GXv_int3[] ;
   private byte GXv_int10[] ;
   private byte GXv_int14[] ;
   private short AV47RecLinMaq ;
   private short AV50barOrdLin ;
   private short A194BarOrdLin ;
   private short A7944Dtb_ForLin ;
   private short A7934Dtb_Ordl ;
   private short GXv_int5[] ;
   private short A217BarTipArt ;
   private short AV60BarTipArt ;
   private short A2804RecLinMaq ;
   private short A4696RecTiempo ;
   private short AV38ProFoPgc ;
   private short AV39ProFoTmc ;
   private short AV48ProFoRb ;
   private short AV40Cont_c ;
   private short AV75NUMPROM ;
   private short AV55i ;
   private short AV58Tab_rb[] ;
   private short AV68Rb_f ;
   private short AV59Rb ;
   private short AV61Rb_art ;
   private short A6040NumProg ;
   private short A6041NumProM ;
   private short A4686MaqTipArt ;
   private short A5195MaqTipArtR ;
   private short A4706ProForRb ;
   private short A5375FasQuiRb ;
   private short A5371FasQuiLin ;
   private short A4653FasForRb ;
   private short A4650FasForLin ;
   private short A5192ProFoPgC ;
   private short A5193ProFoTmC ;
   private short A5951ProFoRb ;
   private short A5191ProForLC ;
   private short GXv_int7[] ;
   private short Gx_err ;
   private int AV44BarCod ;
   private int A129BarCod ;
   private int A4697RecNroPrg ;
   private int GX_I ;
   private int AV56Tab_vol[] ;
   private int A4695RecVolPrf ;
   private int AV64RecVolPrf ;
   private int AV54VolMx ;
   private int AV53VolMin ;
   private int A625MaqVolMin ;
   private int A623MaqVolMax ;
   private int GXv_int2[] ;
   private java.math.BigDecimal AV37Kgs_for ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String AV46barCodPar ;
   private String AV49Procod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A2010BarTipDis ;
   private String AV66BarTipDis ;
   private String A4287BarFasFor ;
   private String A4637BarFasCara ;
   private String A150BarFacTin ;
   private String A5369BarFasGral ;
   private String A457FasCod ;
   private String A6012BarFasTip ;
   private String AV78BarFasfor ;
   private String AV77BarFascara ;
   private String AV51BarFactin ;
   private String AV67BARFASGRAL ;
   private String AV69FasCod ;
   private String AV72BarFasTip ;
   private String A602MaqCod ;
   private String AV52MaqCod ;
   private String A764ProForCod ;
   private String AV43ProForCod ;
   private String AV74MaqTinTip ;
   private String AV57Tab_p[] ;
   private String A619MaqTinTip ;
   private String A6873NMaqCod ;
   private String A5194ProFoCla ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private String GXv_char1[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String AV42Accion ;
   private String GXv_char13[] ;
   private String GXv_char15[] ;
   private String GXv_char16[] ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private boolean n5369BarFasGral ;
   private boolean n6012BarFasTip ;
   private boolean n4696RecTiempo ;
   private boolean n625MaqVolMin ;
   private boolean n623MaqVolMax ;
   private boolean n619MaqTinTip ;
   private boolean n6873NMaqCod ;
   private boolean n6041NumProM ;
   private boolean n5195MaqTipArtR ;
   private boolean n4653FasForRb ;
   private boolean n5194ProFoCla ;
   private boolean n5192ProFoPgC ;
   private boolean n5193ProFoTmC ;
   private boolean n5951ProFoRb ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01RI2_A396EmprCod ;
   private short[] P01RI2_A194BarOrdLin ;
   private String[] P01RI2_A758ProCod ;
   private String[] P01RI2_A130BarCodPar ;
   private byte[] P01RI2_A132BarCodReo ;
   private int[] P01RI2_A129BarCod ;
   private short[] P01RI2_A7944Dtb_ForLin ;
   private short[] P01RI2_A7934Dtb_Ordl ;
   private String[] P01RI3_A396EmprCod ;
   private String[] P01RI3_A130BarCodPar ;
   private byte[] P01RI3_A132BarCodReo ;
   private int[] P01RI3_A129BarCod ;
   private short[] P01RI3_A217BarTipArt ;
   private boolean[] P01RI3_n217BarTipArt ;
   private String[] P01RI3_A2010BarTipDis ;
   private String[] P01RI4_A396EmprCod ;
   private short[] P01RI4_A194BarOrdLin ;
   private String[] P01RI4_A758ProCod ;
   private String[] P01RI4_A130BarCodPar ;
   private byte[] P01RI4_A132BarCodReo ;
   private int[] P01RI4_A129BarCod ;
   private String[] P01RI4_A4287BarFasFor ;
   private String[] P01RI4_A4637BarFasCara ;
   private String[] P01RI4_A150BarFacTin ;
   private String[] P01RI4_A5369BarFasGral ;
   private boolean[] P01RI4_n5369BarFasGral ;
   private String[] P01RI4_A457FasCod ;
   private String[] P01RI4_A6012BarFasTip ;
   private boolean[] P01RI4_n6012BarFasTip ;
   private String[] P01RI5_A396EmprCod ;
   private short[] P01RI5_A2804RecLinMaq ;
   private String[] P01RI5_A130BarCodPar ;
   private byte[] P01RI5_A132BarCodReo ;
   private int[] P01RI5_A129BarCod ;
   private String[] P01RI5_A602MaqCod ;
   private String[] P01RI6_A396EmprCod ;
   private int[] P01RI6_A129BarCod ;
   private byte[] P01RI6_A132BarCodReo ;
   private String[] P01RI6_A130BarCodPar ;
   private short[] P01RI6_A2804RecLinMaq ;
   private String[] P01RI6_A764ProForCod ;
   private short[] P01RI6_A4696RecTiempo ;
   private boolean[] P01RI6_n4696RecTiempo ;
   private int[] P01RI6_A4697RecNroPrg ;
   private byte[] P01RI6_A1273RecLinPro ;
   private String[] P01RI8_A396EmprCod ;
   private short[] P01RI8_A2804RecLinMaq ;
   private String[] P01RI8_A130BarCodPar ;
   private byte[] P01RI8_A132BarCodReo ;
   private int[] P01RI8_A129BarCod ;
   private String[] P01RI8_A602MaqCod ;
   private String[] P01RI9_A396EmprCod ;
   private short[] P01RI9_A2804RecLinMaq ;
   private String[] P01RI9_A130BarCodPar ;
   private byte[] P01RI9_A132BarCodReo ;
   private int[] P01RI9_A129BarCod ;
   private String[] P01RI9_A764ProForCod ;
   private int[] P01RI9_A4695RecVolPrf ;
   private byte[] P01RI9_A1273RecLinPro ;
   private String[] P01RI10_A396EmprCod ;
   private byte[] P01RI10_A1273RecLinPro ;
   private short[] P01RI10_A2804RecLinMaq ;
   private String[] P01RI10_A130BarCodPar ;
   private byte[] P01RI10_A132BarCodReo ;
   private int[] P01RI10_A129BarCod ;
   private int[] P01RI10_A4695RecVolPrf ;
   private String[] P01RI10_A764ProForCod ;
   private short[] P01RI10_A4696RecTiempo ;
   private boolean[] P01RI10_n4696RecTiempo ;
   private int[] P01RI10_A4697RecNroPrg ;
   private String[] P01RI12_A396EmprCod ;
   private String[] P01RI12_A602MaqCod ;
   private int[] P01RI12_A625MaqVolMin ;
   private boolean[] P01RI12_n625MaqVolMin ;
   private int[] P01RI12_A623MaqVolMax ;
   private boolean[] P01RI12_n623MaqVolMax ;
   private String[] P01RI12_A619MaqTinTip ;
   private boolean[] P01RI12_n619MaqTinTip ;
   private String[] P01RI13_A396EmprCod ;
   private String[] P01RI13_A6873NMaqCod ;
   private boolean[] P01RI13_n6873NMaqCod ;
   private short[] P01RI13_A6040NumProg ;
   private short[] P01RI13_A6041NumProM ;
   private boolean[] P01RI13_n6041NumProM ;
   private String[] P01RI14_A396EmprCod ;
   private short[] P01RI14_A4686MaqTipArt ;
   private short[] P01RI14_A5195MaqTipArtR ;
   private boolean[] P01RI14_n5195MaqTipArtR ;
   private String[] P01RI15_A396EmprCod ;
   private String[] P01RI15_A764ProForCod ;
   private short[] P01RI15_A4706ProForRb ;
   private String[] P01RI16_A396EmprCod ;
   private short[] P01RI16_A194BarOrdLin ;
   private String[] P01RI16_A758ProCod ;
   private String[] P01RI16_A130BarCodPar ;
   private byte[] P01RI16_A132BarCodReo ;
   private int[] P01RI16_A129BarCod ;
   private String[] P01RI16_A764ProForCod ;
   private short[] P01RI16_A5375FasQuiRb ;
   private short[] P01RI16_A4706ProForRb ;
   private short[] P01RI16_A5371FasQuiLin ;
   private String[] P01RI17_A396EmprCod ;
   private String[] P01RI17_A457FasCod ;
   private String[] P01RI17_A764ProForCod ;
   private short[] P01RI17_A4653FasForRb ;
   private boolean[] P01RI17_n4653FasForRb ;
   private short[] P01RI17_A4706ProForRb ;
   private short[] P01RI17_A4650FasForLin ;
   private String[] P01RI18_A396EmprCod ;
   private String[] P01RI18_A764ProForCod ;
   private String[] P01RI18_A5194ProFoCla ;
   private boolean[] P01RI18_n5194ProFoCla ;
   private short[] P01RI18_A5192ProFoPgC ;
   private boolean[] P01RI18_n5192ProFoPgC ;
   private short[] P01RI18_A5193ProFoTmC ;
   private boolean[] P01RI18_n5193ProFoTmC ;
   private short[] P01RI18_A5951ProFoRb ;
   private boolean[] P01RI18_n5951ProFoRb ;
   private short[] P01RI18_A5191ProForLC ;
}

final  class pcrecet__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01RI2", "SELECT EmprCod, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, Dtb_ForLin, Dtb_Ordl FROM TXPDT0051 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl, Dtb_ForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01RI3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarTipArt, BarTipDis FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01RI4", "SELECT EmprCod, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, BarFasFor, BarFasCara, BarFacTin, BarFasGral, FasCod, BarFasTip FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01RI5", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01RI6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, ProForCod, RecTiempo, RecNroPrg, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01RI7", "UPDATE TXPCRECET SET RecTiempo=?, RecNroPrg=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new ForEachCursor("P01RI8", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01RI9", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, ProForCod, RecVolPrf, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01RI10", "SELECT EmprCod, RecLinPro, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecVolPrf, ProForCod, RecTiempo, RecNroPrg FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01RI11", "UPDATE TXPCRECET SET RecVolPrf=?, RecTiempo=?, RecNroPrg=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new ForEachCursor("P01RI12", "SELECT EmprCod, MaqCod, MaqVolMin, MaqVolMax, MaqTinTip FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01RI13", "SELECT EmprCod, NMaqCod, NumProg, NumProM FROM TXPPROMUE WHERE (EmprCod = ? and NumProg = ?) AND (? like (rtrim(NMaqCod) || '%')) ORDER BY EmprCod, NumProg ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01RI14", "SELECT EmprCod, MaqTipArt, MaqTipArtR FROM TXPMAQTAR WHERE EmprCod = ? and MaqTipArt = ? ORDER BY EmprCod, MaqTipArt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01RI15", "SELECT EmprCod, ProForCod, ProForRb FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01RI16", "SELECT T1.EmprCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.ProForCod, T1.FasQuiRb, T2.ProForRb, T1.FasQuiLin FROM (TXPFASQUI T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.FasQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01RI17", "SELECT T1.EmprCod, T1.FasCod, T1.ProForCod, T1.FasForRb, T2.ProForRb, T1.FasForLin FROM (TXPFASPR1 T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.FasCod, T1.FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01RI18", "SELECT EmprCod, ProForCod, ProFoCla, ProFoPgC, ProFoTmC, ProFoRb, ProForLC FROM TXPPROFOC WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 16 :
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 1);
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

