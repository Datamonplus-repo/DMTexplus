package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pvolcals extends GXProcedure
{
   public pvolcals( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pvolcals.class ), "" );
   }

   public pvolcals( int remoteHandle ,
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
      pvolcals.this.aP13 = new String[] {""};
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
      pvolcals.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pvolcals.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pvolcals.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pvolcals.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pvolcals.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pvolcals.this.AV34ProForCod = aP5[0];
      this.aP5 = aP5;
      pvolcals.this.AV35recTotKgs = aP6[0];
      this.aP6 = aP6;
      pvolcals.this.AV29BarOrdLin = aP7[0];
      this.aP7 = aP7;
      pvolcals.this.AV30FasCod = aP8[0];
      this.aP8 = aP8;
      pvolcals.this.AV31RecTiempo = aP9[0];
      this.aP9 = aP9;
      pvolcals.this.AV32recNroPrg = aP10[0];
      this.aP10 = aP10;
      pvolcals.this.AV33RecVolPrf = aP11[0];
      this.aP11 = aP11;
      pvolcals.this.AV52Vol_old = aP12[0];
      this.aP12 = aP12;
      pvolcals.this.AV53ForCod_old = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV55Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV56EmprNom ;
      GXv_char3[0] = AV57Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV55Station, GXv_char1, GXv_char2, GXv_char3) ;
      pvolcals.this.A396EmprCod = GXv_char1[0] ;
      pvolcals.this.AV56EmprNom = GXv_char2[0] ;
      pvolcals.this.AV57Usurcod = GXv_char3[0] ;
      GXt_int4 = AV51F_pizarro ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIZARR", ""), GXv_int5) ;
      pvolcals.this.GXt_int4 = GXv_int5[0] ;
      AV51F_pizarro = GXt_int4 ;
      /* Using cursor P03232 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV29BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P03232_A194BarOrdLin[0] ;
         A150BarFacTin = P03232_A150BarFacTin[0] ;
         A217BarTipArt = P03232_A217BarTipArt[0] ;
         n217BarTipArt = P03232_n217BarTipArt[0] ;
         A5369BarFasGral = P03232_A5369BarFasGral[0] ;
         n5369BarFasGral = P03232_n5369BarFasGral[0] ;
         A758ProCod = P03232_A758ProCod[0] ;
         A217BarTipArt = P03232_A217BarTipArt[0] ;
         n217BarTipArt = P03232_n217BarTipArt[0] ;
         AV44BarFacTin = A150BarFacTin ;
         AV43BarTipArt = A217BarTipArt ;
         AV45FaseGral = A5369BarFasGral ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P03233 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2805RecVolPrd = P03233_A2805RecVolPrd[0] ;
         A602MaqCod = P03233_A602MaqCod[0] ;
         AV46MaqCod = A602MaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Execute user subroutine: 'MAQTAR' */
      S131 ();
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
            /* Using cursor P03234 */
            pr_default.execute(2, new Object[] {A396EmprCod, AV34ProForCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A764ProForCod = P03234_A764ProForCod[0] ;
               A4705ProForPau = P03234_A4705ProForPau[0] ;
               A2392ProNumPro = P03234_A2392ProNumPro[0] ;
               A4706ProForRb = P03234_A4706ProForRb[0] ;
               AV31RecTiempo = A4705ProForPau ;
               AV32recNroPrg = A2392ProNumPro ;
               if ( A4706ProForRb > 0 )
               {
                  AV33RecVolPrf = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(A4706ProForRb).multiply(AV35recTotKgs))) ;
               }
               /* Execute user subroutine: 'PROFOC' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
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
            pr_default.close(2);
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
            AV32recNroPrg = 0 ;
            AV31RecTiempo = (short)(0) ;
            AV33RecVolPrf = 0 ;
            /* Using cursor P03235 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV29BarOrdLin)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A194BarOrdLin = P03235_A194BarOrdLin[0] ;
               A7940Dtb_ForRb = P03235_A7940Dtb_ForRb[0] ;
               n7940Dtb_ForRb = P03235_n7940Dtb_ForRb[0] ;
               A7938Dtb_Fortie = P03235_A7938Dtb_Fortie[0] ;
               n7938Dtb_Fortie = P03235_n7938Dtb_Fortie[0] ;
               A7934Dtb_Ordl = P03235_A7934Dtb_Ordl[0] ;
               A758ProCod = P03235_A758ProCod[0] ;
               AV31RecTiempo = (short)(0) ;
               AV32recNroPrg = 0 ;
               AV33RecVolPrf = 0 ;
               if ( A7940Dtb_ForRb.doubleValue() > 0 )
               {
                  AV33RecVolPrf = (int)(DecimalUtil.decToDouble(A7940Dtb_ForRb.multiply(AV35recTotKgs))) ;
               }
               AV31RecTiempo = A7938Dtb_Fortie ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
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
      /* Using cursor P03236 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV46MaqCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A602MaqCod = P03236_A602MaqCod[0] ;
         A625MaqVolMin = P03236_A625MaqVolMin[0] ;
         n625MaqVolMin = P03236_n625MaqVolMin[0] ;
         A623MaqVolMax = P03236_A623MaqVolMax[0] ;
         n623MaqVolMax = P03236_n623MaqVolMax[0] ;
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
      /* 'PROFOC' Routine */
      returnInSub = false ;
      AV36ProFoPgc = (short)(0) ;
      AV37ProFoTmc = (short)(0) ;
      AV54ProFoRb = (short)(0) ;
      AV38Cont_c = (short)(0) ;
      /* Using cursor P03237 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV34ProForCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A764ProForCod = P03237_A764ProForCod[0] ;
         A5194ProFoCla = P03237_A5194ProFoCla[0] ;
         n5194ProFoCla = P03237_n5194ProFoCla[0] ;
         A5192ProFoPgC = P03237_A5192ProFoPgC[0] ;
         n5192ProFoPgC = P03237_n5192ProFoPgC[0] ;
         A5193ProFoTmC = P03237_A5193ProFoTmC[0] ;
         n5193ProFoTmC = P03237_n5193ProFoTmC[0] ;
         A5951ProFoRb = P03237_A5951ProFoRb[0] ;
         n5951ProFoRb = P03237_n5951ProFoRb[0] ;
         A5191ProForLC = P03237_A5191ProForLC[0] ;
         AV39Flag_ctrl = (byte)(0) ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = " " ;
         GXv_char1[0] = A5194ProFoCla ;
         GXv_int5[0] = AV39Flag_ctrl ;
         GXv_int6[0] = A129BarCod ;
         GXv_int7[0] = A132BarCodReo ;
         GXv_char8[0] = A130BarCodPar ;
         GXv_decimal9[0] = AV35recTotKgs ;
         GXv_char10[0] = " " ;
         GXv_char11[0] = AV40Accion ;
         GXv_int12[0] = A2804RecLinMaq ;
         GXv_int13[0] = (byte)(0) ;
         GXv_char14[0] = AV44BarFacTin ;
         GXv_char15[0] = "" ;
         new app.pclaespl(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_char1, GXv_int5, GXv_int6, GXv_int7, GXv_char8, GXv_decimal9, GXv_char10, GXv_char11, GXv_int12, GXv_int13, GXv_char14, GXv_char15) ;
         pvolcals.this.A396EmprCod = GXv_char3[0] ;
         pvolcals.this.A5194ProFoCla = GXv_char1[0] ;
         pvolcals.this.AV39Flag_ctrl = GXv_int5[0] ;
         pvolcals.this.A129BarCod = GXv_int6[0] ;
         pvolcals.this.A132BarCodReo = GXv_int7[0] ;
         pvolcals.this.A130BarCodPar = GXv_char8[0] ;
         pvolcals.this.AV35recTotKgs = GXv_decimal9[0] ;
         pvolcals.this.AV40Accion = GXv_char11[0] ;
         pvolcals.this.A2804RecLinMaq = GXv_int12[0] ;
         pvolcals.this.AV44BarFacTin = GXv_char14[0] ;
         if ( ( AV39Flag_ctrl == 1 ) || (GXutil.strcmp("", A5194ProFoCla)==0) )
         {
            AV36ProFoPgc = A5192ProFoPgC ;
            AV37ProFoTmc = A5193ProFoTmC ;
            AV54ProFoRb = A5951ProFoRb ;
            AV38Cont_c = (short)(AV38Cont_c+1) ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S131( )
   {
      /* 'MAQTAR' Routine */
      returnInSub = false ;
      AV42MaqTipArtr = (short)(0) ;
      /* Using cursor P03238 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(AV43BarTipArt)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A4686MaqTipArt = P03238_A4686MaqTipArt[0] ;
         A5195MaqTipArtR = P03238_A5195MaqTipArtR[0] ;
         n5195MaqTipArtR = P03238_n5195MaqTipArtR[0] ;
         AV42MaqTipArtr = A5195MaqTipArtR ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pvolcals.this.A396EmprCod;
      this.aP1[0] = pvolcals.this.A129BarCod;
      this.aP2[0] = pvolcals.this.A132BarCodReo;
      this.aP3[0] = pvolcals.this.A130BarCodPar;
      this.aP4[0] = pvolcals.this.A2804RecLinMaq;
      this.aP5[0] = pvolcals.this.AV34ProForCod;
      this.aP6[0] = pvolcals.this.AV35recTotKgs;
      this.aP7[0] = pvolcals.this.AV29BarOrdLin;
      this.aP8[0] = pvolcals.this.AV30FasCod;
      this.aP9[0] = pvolcals.this.AV31RecTiempo;
      this.aP10[0] = pvolcals.this.AV32recNroPrg;
      this.aP11[0] = pvolcals.this.AV33RecVolPrf;
      this.aP12[0] = pvolcals.this.AV52Vol_old;
      this.aP13[0] = pvolcals.this.AV53ForCod_old;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV55Station = "" ;
      AV56EmprNom = "" ;
      AV57Usurcod = "" ;
      scmdbuf = "" ;
      P03232_A396EmprCod = new String[] {""} ;
      P03232_A129BarCod = new int[1] ;
      P03232_A132BarCodReo = new byte[1] ;
      P03232_A130BarCodPar = new String[] {""} ;
      P03232_A194BarOrdLin = new short[1] ;
      P03232_A150BarFacTin = new String[] {""} ;
      P03232_A217BarTipArt = new short[1] ;
      P03232_n217BarTipArt = new boolean[] {false} ;
      P03232_A5369BarFasGral = new String[] {""} ;
      P03232_n5369BarFasGral = new boolean[] {false} ;
      P03232_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A5369BarFasGral = "" ;
      A758ProCod = "" ;
      AV44BarFacTin = "" ;
      AV45FaseGral = "" ;
      P03233_A396EmprCod = new String[] {""} ;
      P03233_A129BarCod = new int[1] ;
      P03233_A132BarCodReo = new byte[1] ;
      P03233_A130BarCodPar = new String[] {""} ;
      P03233_A2804RecLinMaq = new short[1] ;
      P03233_A2805RecVolPrd = new int[1] ;
      P03233_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      AV46MaqCod = "" ;
      P03234_A396EmprCod = new String[] {""} ;
      P03234_A764ProForCod = new String[] {""} ;
      P03234_A4705ProForPau = new short[1] ;
      P03234_A2392ProNumPro = new int[1] ;
      P03234_A4706ProForRb = new short[1] ;
      A764ProForCod = "" ;
      P03235_A396EmprCod = new String[] {""} ;
      P03235_A129BarCod = new int[1] ;
      P03235_A132BarCodReo = new byte[1] ;
      P03235_A130BarCodPar = new String[] {""} ;
      P03235_A194BarOrdLin = new short[1] ;
      P03235_A7940Dtb_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03235_n7940Dtb_ForRb = new boolean[] {false} ;
      P03235_A7938Dtb_Fortie = new short[1] ;
      P03235_n7938Dtb_Fortie = new boolean[] {false} ;
      P03235_A7934Dtb_Ordl = new short[1] ;
      P03235_A758ProCod = new String[] {""} ;
      A7940Dtb_ForRb = DecimalUtil.ZERO ;
      P03236_A396EmprCod = new String[] {""} ;
      P03236_A602MaqCod = new String[] {""} ;
      P03236_A625MaqVolMin = new int[1] ;
      P03236_n625MaqVolMin = new boolean[] {false} ;
      P03236_A623MaqVolMax = new int[1] ;
      P03236_n623MaqVolMax = new boolean[] {false} ;
      AV50Texto_i = "" ;
      P03237_A396EmprCod = new String[] {""} ;
      P03237_A764ProForCod = new String[] {""} ;
      P03237_A5194ProFoCla = new String[] {""} ;
      P03237_n5194ProFoCla = new boolean[] {false} ;
      P03237_A5192ProFoPgC = new short[1] ;
      P03237_n5192ProFoPgC = new boolean[] {false} ;
      P03237_A5193ProFoTmC = new short[1] ;
      P03237_n5193ProFoTmC = new boolean[] {false} ;
      P03237_A5951ProFoRb = new short[1] ;
      P03237_n5951ProFoRb = new boolean[] {false} ;
      P03237_A5191ProForLC = new short[1] ;
      A5194ProFoCla = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char8 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char10 = new String[1] ;
      AV40Accion = "" ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new short[1] ;
      GXv_int13 = new byte[1] ;
      GXv_char14 = new String[1] ;
      GXv_char15 = new String[1] ;
      P03238_A396EmprCod = new String[] {""} ;
      P03238_A4686MaqTipArt = new short[1] ;
      P03238_A5195MaqTipArtR = new short[1] ;
      P03238_n5195MaqTipArtR = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pvolcals__default(),
         new Object[] {
             new Object[] {
            P03232_A396EmprCod, P03232_A129BarCod, P03232_A132BarCodReo, P03232_A130BarCodPar, P03232_A194BarOrdLin, P03232_A150BarFacTin, P03232_A217BarTipArt, P03232_n217BarTipArt, P03232_A5369BarFasGral, P03232_n5369BarFasGral,
            P03232_A758ProCod
            }
            , new Object[] {
            P03233_A396EmprCod, P03233_A129BarCod, P03233_A132BarCodReo, P03233_A130BarCodPar, P03233_A2804RecLinMaq, P03233_A2805RecVolPrd, P03233_A602MaqCod
            }
            , new Object[] {
            P03234_A396EmprCod, P03234_A764ProForCod, P03234_A4705ProForPau, P03234_A2392ProNumPro, P03234_A4706ProForRb
            }
            , new Object[] {
            P03235_A396EmprCod, P03235_A129BarCod, P03235_A132BarCodReo, P03235_A130BarCodPar, P03235_A194BarOrdLin, P03235_A7940Dtb_ForRb, P03235_n7940Dtb_ForRb, P03235_A7938Dtb_Fortie, P03235_n7938Dtb_Fortie, P03235_A7934Dtb_Ordl,
            P03235_A758ProCod
            }
            , new Object[] {
            P03236_A396EmprCod, P03236_A602MaqCod, P03236_A625MaqVolMin, P03236_n625MaqVolMin, P03236_A623MaqVolMax, P03236_n623MaqVolMax
            }
            , new Object[] {
            P03237_A396EmprCod, P03237_A764ProForCod, P03237_A5194ProFoCla, P03237_n5194ProFoCla, P03237_A5192ProFoPgC, P03237_n5192ProFoPgC, P03237_A5193ProFoTmC, P03237_n5193ProFoTmC, P03237_A5951ProFoRb, P03237_n5951ProFoRb,
            P03237_A5191ProForLC
            }
            , new Object[] {
            P03238_A396EmprCod, P03238_A4686MaqTipArt, P03238_A5195MaqTipArtR, P03238_n5195MaqTipArtR
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV51F_pizarro ;
   private byte GXt_int4 ;
   private byte AV39Flag_ctrl ;
   private byte GXv_int5[] ;
   private byte GXv_int7[] ;
   private byte GXv_int13[] ;
   private short A2804RecLinMaq ;
   private short AV29BarOrdLin ;
   private short AV31RecTiempo ;
   private short A194BarOrdLin ;
   private short A217BarTipArt ;
   private short AV43BarTipArt ;
   private short A4705ProForPau ;
   private short A4706ProForRb ;
   private short AV38Cont_c ;
   private short AV37ProFoTmc ;
   private short AV36ProFoPgc ;
   private short AV42MaqTipArtr ;
   private short A7938Dtb_Fortie ;
   private short A7934Dtb_Ordl ;
   private short AV54ProFoRb ;
   private short A5192ProFoPgC ;
   private short A5193ProFoTmC ;
   private short A5951ProFoRb ;
   private short A5191ProForLC ;
   private short GXv_int12[] ;
   private short A4686MaqTipArt ;
   private short A5195MaqTipArtR ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV32recNroPrg ;
   private int AV33RecVolPrf ;
   private int AV52Vol_old ;
   private int A2805RecVolPrd ;
   private int A2392ProNumPro ;
   private int AV48VolMax ;
   private int AV47VolMin ;
   private int A625MaqVolMin ;
   private int A623MaqVolMax ;
   private int AV49Volumen_c ;
   private int GXv_int6[] ;
   private java.math.BigDecimal AV35recTotKgs ;
   private java.math.BigDecimal A7940Dtb_ForRb ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV34ProForCod ;
   private String AV30FasCod ;
   private String AV53ForCod_old ;
   private String AV55Station ;
   private String AV56EmprNom ;
   private String AV57Usurcod ;
   private String scmdbuf ;
   private String A150BarFacTin ;
   private String A5369BarFasGral ;
   private String A758ProCod ;
   private String AV44BarFacTin ;
   private String AV45FaseGral ;
   private String A602MaqCod ;
   private String AV46MaqCod ;
   private String A764ProForCod ;
   private String A5194ProFoCla ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char8[] ;
   private String GXv_char10[] ;
   private String AV40Accion ;
   private String GXv_char11[] ;
   private String GXv_char14[] ;
   private String GXv_char15[] ;
   private boolean n217BarTipArt ;
   private boolean n5369BarFasGral ;
   private boolean returnInSub ;
   private boolean n7940Dtb_ForRb ;
   private boolean n7938Dtb_Fortie ;
   private boolean n625MaqVolMin ;
   private boolean n623MaqVolMax ;
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
   private String[] P03232_A396EmprCod ;
   private int[] P03232_A129BarCod ;
   private byte[] P03232_A132BarCodReo ;
   private String[] P03232_A130BarCodPar ;
   private short[] P03232_A194BarOrdLin ;
   private String[] P03232_A150BarFacTin ;
   private short[] P03232_A217BarTipArt ;
   private boolean[] P03232_n217BarTipArt ;
   private String[] P03232_A5369BarFasGral ;
   private boolean[] P03232_n5369BarFasGral ;
   private String[] P03232_A758ProCod ;
   private String[] P03233_A396EmprCod ;
   private int[] P03233_A129BarCod ;
   private byte[] P03233_A132BarCodReo ;
   private String[] P03233_A130BarCodPar ;
   private short[] P03233_A2804RecLinMaq ;
   private int[] P03233_A2805RecVolPrd ;
   private String[] P03233_A602MaqCod ;
   private String[] P03234_A396EmprCod ;
   private String[] P03234_A764ProForCod ;
   private short[] P03234_A4705ProForPau ;
   private int[] P03234_A2392ProNumPro ;
   private short[] P03234_A4706ProForRb ;
   private String[] P03235_A396EmprCod ;
   private int[] P03235_A129BarCod ;
   private byte[] P03235_A132BarCodReo ;
   private String[] P03235_A130BarCodPar ;
   private short[] P03235_A194BarOrdLin ;
   private java.math.BigDecimal[] P03235_A7940Dtb_ForRb ;
   private boolean[] P03235_n7940Dtb_ForRb ;
   private short[] P03235_A7938Dtb_Fortie ;
   private boolean[] P03235_n7938Dtb_Fortie ;
   private short[] P03235_A7934Dtb_Ordl ;
   private String[] P03235_A758ProCod ;
   private String[] P03236_A396EmprCod ;
   private String[] P03236_A602MaqCod ;
   private int[] P03236_A625MaqVolMin ;
   private boolean[] P03236_n625MaqVolMin ;
   private int[] P03236_A623MaqVolMax ;
   private boolean[] P03236_n623MaqVolMax ;
   private String[] P03237_A396EmprCod ;
   private String[] P03237_A764ProForCod ;
   private String[] P03237_A5194ProFoCla ;
   private boolean[] P03237_n5194ProFoCla ;
   private short[] P03237_A5192ProFoPgC ;
   private boolean[] P03237_n5192ProFoPgC ;
   private short[] P03237_A5193ProFoTmC ;
   private boolean[] P03237_n5193ProFoTmC ;
   private short[] P03237_A5951ProFoRb ;
   private boolean[] P03237_n5951ProFoRb ;
   private short[] P03237_A5191ProForLC ;
   private String[] P03238_A396EmprCod ;
   private short[] P03238_A4686MaqTipArt ;
   private short[] P03238_A5195MaqTipArtR ;
   private boolean[] P03238_n5195MaqTipArtR ;
}

final  class pvolcals__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03232", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.BarFacTin, T2.BarTipArt, T1.BarFasGral, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03233", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecVolPrd, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03234", "SELECT EmprCod, ProForCod, ProForPau, ProNumPro, ProForRb FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03235", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, Dtb_ForRb, Dtb_Fortie, Dtb_Ordl, ProCod FROM TXPDT005 WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, Dtb_Ordl ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03236", "SELECT EmprCod, MaqCod, MaqVolMin, MaqVolMax FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03237", "SELECT EmprCod, ProForCod, ProFoCla, ProFoPgC, ProFoTmC, ProFoRb, ProForLC FROM TXPPROFOC WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03238", "SELECT EmprCod, MaqTipArt, MaqTipArtR FROM TXPMAQTAR WHERE EmprCod = ? and MaqTipArt = ? ORDER BY EmprCod, MaqTipArt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
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
            case 6 :
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
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

