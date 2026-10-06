package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmunprocesos extends GXProcedure
{
   public pmunprocesos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmunprocesos.class ), "" );
   }

   public pmunprocesos( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           short[] aP4 ,
                           String[] aP5 ,
                           short[] aP6 ,
                           java.math.BigDecimal[] aP7 ,
                           int[] aP8 )
   {
      pmunprocesos.this.aP9 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        int[] aP8 ,
                        byte[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             byte[] aP9 )
   {
      pmunprocesos.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmunprocesos.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pmunprocesos.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmunprocesos.this.AV18BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmunprocesos.this.AV33RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pmunprocesos.this.AV35ProCod = aP5[0];
      this.aP5 = aP5;
      pmunprocesos.this.AV34BarOrdLin = aP6[0];
      this.aP6 = aP6;
      pmunprocesos.this.AV42Kgs_for = aP7[0];
      this.aP7 = aP7;
      pmunprocesos.this.AV62Volumen_i = aP8[0];
      this.aP8 = aP8;
      pmunprocesos.this.AV79Opi = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV76F_Reccol ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RECCOL", ""), GXv_int2) ;
      pmunprocesos.this.GXt_int1 = GXv_int2[0] ;
      AV76F_Reccol = GXt_int1 ;
      GXt_int1 = AV94Suprema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int2) ;
      pmunprocesos.this.GXt_int1 = GXv_int2[0] ;
      AV94Suprema = GXt_int1 ;
      /* Using cursor P04Y32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, AV35ProCod, Short.valueOf(AV34BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A194BarOrdLin = P04Y32_A194BarOrdLin[0] ;
         A758ProCod = P04Y32_A758ProCod[0] ;
         A130BarCodPar = P04Y32_A130BarCodPar[0] ;
         n130BarCodPar = P04Y32_n130BarCodPar[0] ;
         A132BarCodReo = P04Y32_A132BarCodReo[0] ;
         n132BarCodReo = P04Y32_n132BarCodReo[0] ;
         A129BarCod = P04Y32_A129BarCod[0] ;
         n129BarCod = P04Y32_n129BarCod[0] ;
         A4287BarFasFor = P04Y32_A4287BarFasFor[0] ;
         A150BarFacTin = P04Y32_A150BarFacTin[0] ;
         A4637BarFasCara = P04Y32_A4637BarFasCara[0] ;
         A457FasCod = P04Y32_A457FasCod[0] ;
         A5369BarFasGral = P04Y32_A5369BarFasGral[0] ;
         n5369BarFasGral = P04Y32_n5369BarFasGral[0] ;
         A3030BarPlf = P04Y32_A3030BarPlf[0] ;
         A3030BarPlf = P04Y32_A3030BarPlf[0] ;
         AV36BarFasFor = A4287BarFasFor ;
         AV37BarFacTin = A150BarFacTin ;
         AV58Manual = A4637BarFasCara ;
         AV41FasCod = A457FasCod ;
         AV59BarFasGral = A5369BarFasGral ;
         AV77M = A3030BarPlf ;
         AV92BarFasCara = A4637BarFasCara ;
         AV95Dt001 = (byte)(0) ;
         /* Using cursor P04Y33 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, Short.valueOf(AV34BarOrdLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A7891Dt_Ordl = P04Y33_A7891Dt_Ordl[0] ;
            A7870Dt_Orden = P04Y33_A7870Dt_Orden[0] ;
            A7869Dt_Opp = P04Y33_A7869Dt_Opp[0] ;
            A7868Dt_Opr = P04Y33_A7868Dt_Opr[0] ;
            A7867Dt_Op = P04Y33_A7867Dt_Op[0] ;
            /* Using cursor P04Y34 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A7886Dt_ForLin = P04Y34_A7886Dt_ForLin[0] ;
               AV95Dt001 = (byte)(1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV43Vol_for = AV62Volumen_i ;
      AV45VolMin = 0 ;
      /* Using cursor P04Y35 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, Short.valueOf(AV33RecLinMaq)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2804RecLinMaq = P04Y35_A2804RecLinMaq[0] ;
         A130BarCodPar = P04Y35_A130BarCodPar[0] ;
         n130BarCodPar = P04Y35_n130BarCodPar[0] ;
         A132BarCodReo = P04Y35_A132BarCodReo[0] ;
         n132BarCodReo = P04Y35_n132BarCodReo[0] ;
         A129BarCod = P04Y35_A129BarCod[0] ;
         n129BarCod = P04Y35_n129BarCod[0] ;
         A602MaqCod = P04Y35_A602MaqCod[0] ;
         AV44MaqCod = A602MaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      /* Using cursor P04Y36 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV44MaqCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A602MaqCod = P04Y36_A602MaqCod[0] ;
         A625MaqVolMin = P04Y36_A625MaqVolMin[0] ;
         n625MaqVolMin = P04Y36_n625MaqVolMin[0] ;
         A623MaqVolMax = P04Y36_A623MaqVolMax[0] ;
         n623MaqVolMax = P04Y36_n623MaqVolMax[0] ;
         AV45VolMin = A625MaqVolMin ;
         AV56VolMax = A623MaqVolMax ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      Gx_msg = GXutil.space( (short)(70)) ;
      if ( ( GXutil.strcmp(AV36BarFasFor, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV37BarFacTin, httpContext.getMessage( "S", "")) == 0 ) )
      {
         /* Using cursor P04Y37 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A130BarCodPar = P04Y37_A130BarCodPar[0] ;
            n130BarCodPar = P04Y37_n130BarCodPar[0] ;
            A132BarCodReo = P04Y37_A132BarCodReo[0] ;
            n132BarCodReo = P04Y37_n132BarCodReo[0] ;
            A129BarCod = P04Y37_A129BarCod[0] ;
            n129BarCod = P04Y37_n129BarCod[0] ;
            A252CliCod = P04Y37_A252CliCod[0] ;
            n252CliCod = P04Y37_n252CliCod[0] ;
            A212BarSer = P04Y37_A212BarSer[0] ;
            A135BarColNom = P04Y37_A135BarColNom[0] ;
            A136BarColNum = P04Y37_A136BarColNum[0] ;
            A218BarTipCol = P04Y37_A218BarTipCol[0] ;
            A217BarTipArt = P04Y37_A217BarTipArt[0] ;
            n217BarTipArt = P04Y37_n217BarTipArt[0] ;
            A5367BarAntp = P04Y37_A5367BarAntp[0] ;
            A5253BarAcc = P04Y37_A5253BarAcc[0] ;
            A5406BarAntpT = P04Y37_A5406BarAntpT[0] ;
            W129BarCod = A129BarCod ;
            n129BarCod = false ;
            W132BarCodReo = A132BarCodReo ;
            n132BarCodReo = false ;
            W130BarCodPar = A130BarCodPar ;
            n130BarCodPar = false ;
            AV15EmprCod = A396EmprCod ;
            AV38CliCod = A252CliCod ;
            AV68ForSer = A212BarSer ;
            AV69ForColNom = A135BarColNom ;
            AV70ForColNum = A136BarColNum ;
            AV71TipColCod = A218BarTipCol ;
            AV47BarTipArt = A217BarTipArt ;
            /* Execute user subroutine: 'MAQTAR' */
            S1211 ();
            if ( returnInSub )
            {
               pr_default.close(5);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV64Tab_p[GX_I-1] = GXutil.space( (short)(6)) ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV65Tab_L[GX_I-1] = (short)(0) ;
               GX_I = (int)(GX_I+1) ;
            }
            AV66i = (short)(0) ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A212BarSer ;
            GXv_char6[0] = A135BarColNom ;
            GXv_int7[0] = A136BarColNum ;
            GXv_int2[0] = A218BarTipCol ;
            GXv_char8[0] = A5367BarAntp ;
            GXv_char9[0] = A5253BarAcc ;
            GXv_char10[0] = A5406BarAntpT ;
            GXv_int11[0] = A129BarCod ;
            GXv_int12[0] = A132BarCodReo ;
            GXv_char13[0] = A130BarCodPar ;
            new app.pcoptct(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_char6, GXv_int7, GXv_int2, GXv_char8, GXv_char9, GXv_char10, AV64Tab_p, AV65Tab_L, GXv_int11, GXv_int12, GXv_char13) ;
            pmunprocesos.this.A396EmprCod = GXv_char3[0] ;
            pmunprocesos.this.A252CliCod = GXv_int4[0] ;
            pmunprocesos.this.A212BarSer = GXv_char5[0] ;
            pmunprocesos.this.A135BarColNom = GXv_char6[0] ;
            pmunprocesos.this.A136BarColNum = GXv_int7[0] ;
            pmunprocesos.this.A218BarTipCol = GXv_int2[0] ;
            pmunprocesos.this.A5367BarAntp = GXv_char8[0] ;
            pmunprocesos.this.A5253BarAcc = GXv_char9[0] ;
            pmunprocesos.this.A5406BarAntpT = GXv_char10[0] ;
            pmunprocesos.this.A129BarCod = GXv_int11[0] ;
            pmunprocesos.this.A132BarCodReo = GXv_int12[0] ;
            pmunprocesos.this.A130BarCodPar = GXv_char13[0] ;
            AV66i = (short)(1) ;
            while ( ! (GXutil.strcmp("", AV64Tab_p[AV66i-1])==0) )
            {
               AV67ForCod = AV64Tab_p[AV66i-1] ;
               /* Using cursor P04Y38 */
               pr_default.execute(6, new Object[] {A396EmprCod, AV67ForCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A252CliCod = P04Y38_A252CliCod[0] ;
                  n252CliCod = P04Y38_n252CliCod[0] ;
                  A494ForSer = P04Y38_A494ForSer[0] ;
                  A482ForColNom = P04Y38_A482ForColNom[0] ;
                  A483ForColNum = P04Y38_A483ForColNum[0] ;
                  A831TipColCod = P04Y38_A831TipColCod[0] ;
                  A4705ProForPau = P04Y38_A4705ProForPau[0] ;
                  A2392ProNumPro = P04Y38_A2392ProNumPro[0] ;
                  A772ProForTmx = P04Y38_A772ProForTmx[0] ;
                  A6877ProForPhn = P04Y38_A6877ProForPhn[0] ;
                  n6877ProForPhn = P04Y38_n6877ProForPhn[0] ;
                  A6876ProForPhx = P04Y38_A6876ProForPhx[0] ;
                  n6876ProForPhx = P04Y38_n6876ProForPhx[0] ;
                  A12109ProNh2o = P04Y38_A12109ProNh2o[0] ;
                  n12109ProNh2o = P04Y38_n12109ProNh2o[0] ;
                  A4706ProForRb = P04Y38_A4706ProForRb[0] ;
                  A764ProForCod = P04Y38_A764ProForCod[0] ;
                  A1160ProForL = P04Y38_A1160ProForL[0] ;
                  A4705ProForPau = P04Y38_A4705ProForPau[0] ;
                  A2392ProNumPro = P04Y38_A2392ProNumPro[0] ;
                  A772ProForTmx = P04Y38_A772ProForTmx[0] ;
                  A6877ProForPhn = P04Y38_A6877ProForPhn[0] ;
                  n6877ProForPhn = P04Y38_n6877ProForPhn[0] ;
                  A6876ProForPhx = P04Y38_A6876ProForPhx[0] ;
                  n6876ProForPhx = P04Y38_n6876ProForPhx[0] ;
                  A12109ProNh2o = P04Y38_A12109ProNh2o[0] ;
                  n12109ProNh2o = P04Y38_n12109ProNh2o[0] ;
                  A4706ProForRb = P04Y38_A4706ProForRb[0] ;
                  W764ProForCod = A764ProForCod ;
                  AV24Linea = (short)(AV24Linea+5) ;
                  /*
                     INSERT RECORD ON TABLE TXPCRECET

                  */
                  W129BarCod = A129BarCod ;
                  n129BarCod = false ;
                  W132BarCodReo = A132BarCodReo ;
                  n132BarCodReo = false ;
                  W130BarCodPar = A130BarCodPar ;
                  n130BarCodPar = false ;
                  W764ProForCod = A764ProForCod ;
                  A129BarCod = AV16BarCod ;
                  n129BarCod = false ;
                  A132BarCodReo = AV17BarCodReo ;
                  n132BarCodReo = false ;
                  A130BarCodPar = AV18BarCodPar ;
                  n130BarCodPar = false ;
                  A2804RecLinMaq = AV33RecLinMaq ;
                  A1273RecLinPro = (byte)(AV24Linea) ;
                  A764ProForCod = AV67ForCod ;
                  A4696RecTiempo = A4705ProForPau ;
                  n4696RecTiempo = false ;
                  A4697RecNroPrg = A2392ProNumPro ;
                  A7228RecTemp = A772ProForTmx ;
                  n7228RecTemp = false ;
                  A7230RecPhMn = A6877ProForPhn ;
                  n7230RecPhMn = false ;
                  A7229RecPhMx = A6876ProForPhx ;
                  n7229RecPhMx = false ;
                  A10544RecNH2O = A12109ProNh2o ;
                  if ( AV43Vol_for > 0 )
                  {
                     A4695RecVolPrf = AV43Vol_for ;
                     AV46Vol_cal = AV43Vol_for ;
                  }
                  else
                  {
                     if ( A4706ProForRb > 0 )
                     {
                        A4695RecVolPrf = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(A4706ProForRb).multiply(AV42Kgs_for))) ;
                        AV46Vol_cal = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(A4706ProForRb).multiply(AV42Kgs_for))) ;
                     }
                     if ( ( AV48MaqTipartr > 0 ) && ( A4706ProForRb == 0 ) )
                     {
                        A4695RecVolPrf = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV48MaqTipartr).multiply(AV42Kgs_for))) ;
                        AV46Vol_cal = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV48MaqTipartr).multiply(AV42Kgs_for))) ;
                     }
                  }
                  if ( ( AV46Vol_cal > AV56VolMax ) && ( AV57F_aqua == 0 ) && ( GXutil.strcmp(AV77M, httpContext.getMessage( "S", "")) == 0 ) )
                  {
                     Gx_msg = httpContext.getMessage( "Atencion, Volumen Calculado = ", "") + GXutil.str( AV46Vol_cal, 5, 0) + GXutil.newLine( ) + httpContext.getMessage( "es superior al Volumen Maximo = ", "") + GXutil.str( AV56VolMax, 5, 0) + GXutil.newLine( ) + httpContext.getMessage( ",Actualizamos el Volumen con el Volumen Maximo", "") ;
                     httpContext.GX_msglist.addItem(Gx_msg);
                     A4695RecVolPrf = AV56VolMax ;
                  }
                  if ( ( AV46Vol_cal < AV45VolMin ) && ( AV45VolMin > 0 ) && ( AV57F_aqua == 0 ) && ( GXutil.strcmp(AV77M, httpContext.getMessage( "S", "")) == 0 ) )
                  {
                     Gx_msg = httpContext.getMessage( "Atencion, Volumen Calculado = ", "") + GXutil.str( AV46Vol_cal, 5, 0) + GXutil.newLine( ) + httpContext.getMessage( "es inferior al Volumen Minimo = ", "") + GXutil.str( AV45VolMin, 5, 0) + GXutil.newLine( ) + httpContext.getMessage( ",Actualizamos el Volumen con el Volumen Minimo", "") ;
                     httpContext.GX_msglist.addItem(Gx_msg);
                     A4695RecVolPrf = AV45VolMin ;
                  }
                  if ( ( AV46Vol_cal < AV45VolMin ) && ( AV45VolMin > 0 ) && ( AV78F_laundry == 1 ) )
                  {
                     Gx_msg = httpContext.getMessage( "Atencion, Volumen Calculado = ", "") + GXutil.str( AV46Vol_cal, 5, 0) + GXutil.newLine( ) + httpContext.getMessage( "es inferior al Volumen Minimo = ", "") + GXutil.str( AV45VolMin, 5, 0) + GXutil.newLine( ) + httpContext.getMessage( ",Actualizamos el Volumen con el Volumen Minimo", "") ;
                     httpContext.GX_msglist.addItem(Gx_msg);
                     A4695RecVolPrf = AV45VolMin ;
                  }
                  if ( AV79Opi == 1 )
                  {
                     A4695RecVolPrf = AV43Vol_for ;
                  }
                  if ( ( AV45VolMin > 0 ) && ( AV46Vol_cal < AV45VolMin ) && ( AV57F_aqua == 1 ) )
                  {
                     Gx_msg = httpContext.getMessage( "Atencion, el volume p/processo calculado es INFERIOR al Volume minimo Maquina", "") ;
                  }
                  A4696RecTiempo = A4705ProForPau ;
                  n4696RecTiempo = false ;
                  A4697RecNroPrg = A2392ProNumPro ;
                  AV49ProForCod = A764ProForCod ;
                  /* Execute user subroutine: 'PROFOC' */
                  S1313 ();
                  if ( returnInSub )
                  {
                     pr_default.close(6);
                     pr_default.close(6);
                     pr_default.close(6);
                     pr_default.close(5);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  if ( ( AV50Flag_ctrl == 1 ) || ( AV54Cont_c > 0 ) )
                  {
                     A4696RecTiempo = AV52ProFoTmc ;
                     n4696RecTiempo = false ;
                     A4697RecNroPrg = AV51ProFoPgc ;
                  }
                  /* Using cursor P04Y39 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), A764ProForCod, Integer.valueOf(A4695RecVolPrf), Boolean.valueOf(n4696RecTiempo), Short.valueOf(A4696RecTiempo), Integer.valueOf(A4697RecNroPrg), Boolean.valueOf(n7228RecTemp), Short.valueOf(A7228RecTemp), Boolean.valueOf(n7229RecPhMx), A7229RecPhMx, Boolean.valueOf(n7230RecPhMn), A7230RecPhMn, Short.valueOf(A10544RecNH2O)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
                  if ( (pr_default.getStatus(7) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  A129BarCod = W129BarCod ;
                  n129BarCod = false ;
                  A132BarCodReo = W132BarCodReo ;
                  n132BarCodReo = false ;
                  A130BarCodPar = W130BarCodPar ;
                  n130BarCodPar = false ;
                  A764ProForCod = W764ProForCod ;
                  /* End Insert */
                  A764ProForCod = W764ProForCod ;
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               AV66i = (short)(AV66i+1) ;
            }
            A129BarCod = W129BarCod ;
            n129BarCod = false ;
            A132BarCodReo = W132BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = W130BarCodPar ;
            n130BarCodPar = false ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         if ( AV76F_Reccol == 1 )
         {
            /* Execute user subroutine: 'CFORMU' */
            S141 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            AV74MatCod = (short)(0) ;
            AV73IntCod = (byte)(0) ;
            AV75LineaC = (short)(0) ;
         }
         n5407RecUltLCo = false ;
         n5412RecIntCol = false ;
         n5413RecMatCol = false ;
         /* Optimized UPDATE. */
         /* Using cursor P04Y310 */
         byte AV24Linea1272Aux;
         AV24Linea1272Aux = (byte)(AV24Linea) ;
         pr_default.execute(8, new Object[] {Byte.valueOf(AV24Linea1272Aux), Boolean.valueOf(n5407RecUltLCo), Short.valueOf(AV75LineaC), Boolean.valueOf(n5412RecIntCol), Byte.valueOf(AV73IntCod), Boolean.valueOf(n5413RecMatCol), Short.valueOf(AV74MatCod), A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, Short.valueOf(AV33RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         /* End optimized UPDATE. */
      }
      if ( ( GXutil.strcmp(AV36BarFasFor, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV37BarFacTin, httpContext.getMessage( "N", "")) == 0 ) && ( GXutil.strcmp(AV58Manual, httpContext.getMessage( "N", "")) == 0 ) )
      {
         /* Execute user subroutine: 'DT001' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( ( GXutil.strcmp(AV36BarFasFor, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV58Manual, httpContext.getMessage( "S", "")) == 0 ) && ( ( AV55F_faspr1 == 1 ) || ( AV95Dt001 == 1 ) ) )
      {
         /* Execute user subroutine: 'DT001' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'DT001' Routine */
      returnInSub = false ;
      AV24Linea = (short)(0) ;
      /* Using cursor P04Y311 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A130BarCodPar = P04Y311_A130BarCodPar[0] ;
         n130BarCodPar = P04Y311_n130BarCodPar[0] ;
         A132BarCodReo = P04Y311_A132BarCodReo[0] ;
         n132BarCodReo = P04Y311_n132BarCodReo[0] ;
         A129BarCod = P04Y311_A129BarCod[0] ;
         n129BarCod = P04Y311_n129BarCod[0] ;
         A252CliCod = P04Y311_A252CliCod[0] ;
         n252CliCod = P04Y311_n252CliCod[0] ;
         A212BarSer = P04Y311_A212BarSer[0] ;
         A217BarTipArt = P04Y311_A217BarTipArt[0] ;
         n217BarTipArt = P04Y311_n217BarTipArt[0] ;
         W129BarCod = A129BarCod ;
         n129BarCod = false ;
         W132BarCodReo = A132BarCodReo ;
         n132BarCodReo = false ;
         W130BarCodPar = A130BarCodPar ;
         n130BarCodPar = false ;
         AV38CliCod = A252CliCod ;
         AV39ArtCod = A212BarSer ;
         AV47BarTipArt = A217BarTipArt ;
         /* Execute user subroutine: 'MAQTAR' */
         S1211 ();
         if ( returnInSub )
         {
            pr_default.close(9);
            returnInSub = true;
            if (true) return;
         }
         AV55F_faspr1 = (byte)(0) ;
         /* Using cursor P04Y312 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, Short.valueOf(AV34BarOrdLin)});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A7877Dt_CPQ = P04Y312_A7877Dt_CPQ[0] ;
            n7877Dt_CPQ = P04Y312_n7877Dt_CPQ[0] ;
            A7881Dt_ForTmx = P04Y312_A7881Dt_ForTmx[0] ;
            n7881Dt_ForTmx = P04Y312_n7881Dt_ForTmx[0] ;
            A7883Dt_ForPhx = P04Y312_A7883Dt_ForPhx[0] ;
            n7883Dt_ForPhx = P04Y312_n7883Dt_ForPhx[0] ;
            A7884Dt_ForPhn = P04Y312_A7884Dt_ForPhn[0] ;
            n7884Dt_ForPhn = P04Y312_n7884Dt_ForPhn[0] ;
            A7882Dt_ForRb = P04Y312_A7882Dt_ForRb[0] ;
            n7882Dt_ForRb = P04Y312_n7882Dt_ForRb[0] ;
            A12110Dt_Nh2o = P04Y312_A12110Dt_Nh2o[0] ;
            n12110Dt_Nh2o = P04Y312_n12110Dt_Nh2o[0] ;
            A7880Dt_Fortie = P04Y312_A7880Dt_Fortie[0] ;
            n7880Dt_Fortie = P04Y312_n7880Dt_Fortie[0] ;
            A7870Dt_Orden = P04Y312_A7870Dt_Orden[0] ;
            A7869Dt_Opp = P04Y312_A7869Dt_Opp[0] ;
            A7868Dt_Opr = P04Y312_A7868Dt_Opr[0] ;
            A7867Dt_Op = P04Y312_A7867Dt_Op[0] ;
            A7891Dt_Ordl = P04Y312_A7891Dt_Ordl[0] ;
            AV55F_faspr1 = (byte)(1) ;
            AV61F_fasqui = (byte)(1) ;
            AV24Linea = A7891Dt_Ordl ;
            /*
               INSERT RECORD ON TABLE TXPCRECET

            */
            W129BarCod = A129BarCod ;
            n129BarCod = false ;
            W132BarCodReo = A132BarCodReo ;
            n132BarCodReo = false ;
            W130BarCodPar = A130BarCodPar ;
            n130BarCodPar = false ;
            A129BarCod = AV16BarCod ;
            n129BarCod = false ;
            A132BarCodReo = AV17BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = AV18BarCodPar ;
            n130BarCodPar = false ;
            A2804RecLinMaq = AV33RecLinMaq ;
            A1273RecLinPro = (byte)(AV24Linea) ;
            A764ProForCod = A7877Dt_CPQ ;
            A4696RecTiempo = (short)(0) ;
            n4696RecTiempo = false ;
            A4697RecNroPrg = 0 ;
            A7228RecTemp = A7881Dt_ForTmx ;
            n7228RecTemp = false ;
            A7230RecPhMn = A7883Dt_ForPhx ;
            n7230RecPhMn = false ;
            A7229RecPhMx = A7884Dt_ForPhn ;
            n7229RecPhMx = false ;
            A7257RecRb = A7882Dt_ForRb ;
            n7257RecRb = false ;
            A10544RecNH2O = A12110Dt_Nh2o ;
            if ( AV43Vol_for > 0 )
            {
               A4695RecVolPrf = AV43Vol_for ;
               AV46Vol_cal = AV43Vol_for ;
            }
            else
            {
               if ( A7882Dt_ForRb.doubleValue() > 0 )
               {
                  A4695RecVolPrf = (int)(DecimalUtil.decToDouble(A7882Dt_ForRb.multiply(AV42Kgs_for))) ;
                  AV46Vol_cal = (int)(DecimalUtil.decToDouble(A7882Dt_ForRb.multiply(AV42Kgs_for))) ;
               }
            }
            A4696RecTiempo = A7880Dt_Fortie ;
            n4696RecTiempo = false ;
            A4697RecNroPrg = 0 ;
            AV49ProForCod = A7877Dt_CPQ ;
            /* Execute user subroutine: 'PROFOC' */
            S1313 ();
            if ( returnInSub )
            {
               pr_default.close(10);
               pr_default.close(9);
               returnInSub = true;
               if (true) return;
            }
            if ( ( AV50Flag_ctrl == 1 ) || ( AV54Cont_c > 0 ) )
            {
               A4696RecTiempo = AV52ProFoTmc ;
               n4696RecTiempo = false ;
               A4697RecNroPrg = AV51ProFoPgc ;
               if ( AV80ProFoRb > 0 )
               {
                  A4695RecVolPrf = (int)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV80ProFoRb).multiply(AV42Kgs_for))) ;
               }
            }
            /* Using cursor P04Y313 */
            pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), A764ProForCod, Integer.valueOf(A4695RecVolPrf), Boolean.valueOf(n4696RecTiempo), Short.valueOf(A4696RecTiempo), Integer.valueOf(A4697RecNroPrg), Boolean.valueOf(n7228RecTemp), Short.valueOf(A7228RecTemp), Boolean.valueOf(n7229RecPhMx), A7229RecPhMx, Boolean.valueOf(n7230RecPhMn), A7230RecPhMn, Boolean.valueOf(n7257RecRb), A7257RecRb, Short.valueOf(A10544RecNH2O)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
            if ( (pr_default.getStatus(11) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A129BarCod = W129BarCod ;
            n129BarCod = false ;
            A132BarCodReo = W132BarCodReo ;
            n132BarCodReo = false ;
            A130BarCodPar = W130BarCodPar ;
            n130BarCodPar = false ;
            /* End Insert */
            pr_default.readNext(10);
         }
         pr_default.close(10);
         A129BarCod = W129BarCod ;
         n129BarCod = false ;
         A132BarCodReo = W132BarCodReo ;
         n132BarCodReo = false ;
         A130BarCodPar = W130BarCodPar ;
         n130BarCodPar = false ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
      if ( AV55F_faspr1 == 1 )
      {
         /* Optimized UPDATE. */
         /* Using cursor P04Y314 */
         byte AV24Linea1272Aux;
         AV24Linea1272Aux = (byte)(AV24Linea) ;
         pr_default.execute(12, new Object[] {Byte.valueOf(AV24Linea1272Aux), A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, Short.valueOf(AV33RecLinMaq)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
         /* End optimized UPDATE. */
      }
   }

   public void S1211( )
   {
      /* 'MAQTAR' Routine */
      returnInSub = false ;
      AV48MaqTipartr = (short)(0) ;
      /* Using cursor P04Y315 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(AV47BarTipArt)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A4686MaqTipArt = P04Y315_A4686MaqTipArt[0] ;
         A5195MaqTipArtR = P04Y315_A5195MaqTipArtR[0] ;
         n5195MaqTipArtR = P04Y315_n5195MaqTipArtR[0] ;
         AV48MaqTipartr = A5195MaqTipArtR ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void S1313( )
   {
      /* 'PROFOC' Routine */
      returnInSub = false ;
      AV51ProFoPgc = (short)(0) ;
      AV52ProFoTmc = (short)(0) ;
      AV80ProFoRb = (short)(0) ;
      AV54Cont_c = (short)(0) ;
      AV53Accion = "" ;
      /* Using cursor P04Y316 */
      pr_default.execute(14, new Object[] {A396EmprCod, AV49ProForCod});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A764ProForCod = P04Y316_A764ProForCod[0] ;
         A5194ProFoCla = P04Y316_A5194ProFoCla[0] ;
         n5194ProFoCla = P04Y316_n5194ProFoCla[0] ;
         A5192ProFoPgC = P04Y316_A5192ProFoPgC[0] ;
         n5192ProFoPgC = P04Y316_n5192ProFoPgC[0] ;
         A5193ProFoTmC = P04Y316_A5193ProFoTmC[0] ;
         n5193ProFoTmC = P04Y316_n5193ProFoTmC[0] ;
         A5951ProFoRb = P04Y316_A5951ProFoRb[0] ;
         n5951ProFoRb = P04Y316_n5951ProFoRb[0] ;
         A5191ProForLC = P04Y316_A5191ProForLC[0] ;
         AV50Flag_ctrl = (byte)(0) ;
         GXv_char13[0] = A396EmprCod ;
         GXv_char10[0] = " " ;
         GXv_char9[0] = A5194ProFoCla ;
         GXv_int12[0] = AV50Flag_ctrl ;
         GXv_int11[0] = AV16BarCod ;
         GXv_int2[0] = AV17BarCodReo ;
         GXv_char8[0] = AV18BarCodPar ;
         GXv_decimal14[0] = AV42Kgs_for ;
         GXv_char6[0] = " " ;
         GXv_char5[0] = AV53Accion ;
         GXv_int15[0] = AV33RecLinMaq ;
         GXv_int16[0] = (byte)(0) ;
         GXv_char3[0] = "" ;
         GXv_char17[0] = "" ;
         new app.pclaespl(remoteHandle, context).execute( GXv_char13, GXv_char10, GXv_char9, GXv_int12, GXv_int11, GXv_int2, GXv_char8, GXv_decimal14, GXv_char6, GXv_char5, GXv_int15, GXv_int16, GXv_char3, GXv_char17) ;
         pmunprocesos.this.A396EmprCod = GXv_char13[0] ;
         pmunprocesos.this.A5194ProFoCla = GXv_char9[0] ;
         pmunprocesos.this.AV50Flag_ctrl = GXv_int12[0] ;
         pmunprocesos.this.AV16BarCod = GXv_int11[0] ;
         pmunprocesos.this.AV17BarCodReo = GXv_int2[0] ;
         pmunprocesos.this.AV18BarCodPar = GXv_char8[0] ;
         pmunprocesos.this.AV42Kgs_for = GXv_decimal14[0] ;
         pmunprocesos.this.AV53Accion = GXv_char5[0] ;
         pmunprocesos.this.AV33RecLinMaq = GXv_int15[0] ;
         if ( ( AV50Flag_ctrl == 1 ) || (GXutil.strcmp("", A5194ProFoCla)==0) )
         {
            AV51ProFoPgc = A5192ProFoPgC ;
            AV52ProFoTmc = A5193ProFoTmC ;
            AV80ProFoRb = A5951ProFoRb ;
            AV54Cont_c = (short)(AV54Cont_c+1) ;
         }
         pr_default.readNext(14);
      }
      pr_default.close(14);
   }

   public void S141( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      GXv_char17[0] = AV15EmprCod ;
      GXv_int11[0] = AV38CliCod ;
      GXv_char13[0] = AV68ForSer ;
      GXv_char10[0] = AV69ForColNom ;
      GXv_int7[0] = AV70ForColNum ;
      GXv_int16[0] = AV71TipColCod ;
      GXv_int12[0] = AV73IntCod ;
      GXv_int15[0] = AV74MatCod ;
      GXv_int18[0] = AV75LineaC ;
      GXv_int4[0] = AV16BarCod ;
      GXv_int2[0] = AV17BarCodReo ;
      GXv_char9[0] = AV18BarCodPar ;
      GXv_int19[0] = AV33RecLinMaq ;
      new app.preccol(remoteHandle, context).execute( GXv_char17, GXv_int11, GXv_char13, GXv_char10, GXv_int7, GXv_int16, GXv_int12, GXv_int15, GXv_int18, GXv_int4, GXv_int2, GXv_char9, GXv_int19) ;
      pmunprocesos.this.AV15EmprCod = GXv_char17[0] ;
      pmunprocesos.this.AV38CliCod = GXv_int11[0] ;
      pmunprocesos.this.AV68ForSer = GXv_char13[0] ;
      pmunprocesos.this.AV69ForColNom = GXv_char10[0] ;
      pmunprocesos.this.AV70ForColNum = GXv_int7[0] ;
      pmunprocesos.this.AV71TipColCod = GXv_int16[0] ;
      pmunprocesos.this.AV73IntCod = GXv_int12[0] ;
      pmunprocesos.this.AV74MatCod = GXv_int15[0] ;
      pmunprocesos.this.AV75LineaC = GXv_int18[0] ;
      pmunprocesos.this.AV16BarCod = GXv_int4[0] ;
      pmunprocesos.this.AV17BarCodReo = GXv_int2[0] ;
      pmunprocesos.this.AV18BarCodPar = GXv_char9[0] ;
      pmunprocesos.this.AV33RecLinMaq = GXv_int19[0] ;
   }

   public void S151( )
   {
      /* 'ELIMINO_ANT' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P04Y317 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar, Short.valueOf(AV33RecLinMaq), Byte.valueOf(AV87Linea_ant)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
      /* End optimized DELETE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmunprocesos.this.A396EmprCod;
      this.aP1[0] = pmunprocesos.this.AV16BarCod;
      this.aP2[0] = pmunprocesos.this.AV17BarCodReo;
      this.aP3[0] = pmunprocesos.this.AV18BarCodPar;
      this.aP4[0] = pmunprocesos.this.AV33RecLinMaq;
      this.aP5[0] = pmunprocesos.this.AV35ProCod;
      this.aP6[0] = pmunprocesos.this.AV34BarOrdLin;
      this.aP7[0] = pmunprocesos.this.AV42Kgs_for;
      this.aP8[0] = pmunprocesos.this.AV62Volumen_i;
      this.aP9[0] = pmunprocesos.this.AV79Opi;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmunprocesos");
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
      P04Y32_A396EmprCod = new String[] {""} ;
      P04Y32_A194BarOrdLin = new short[1] ;
      P04Y32_A758ProCod = new String[] {""} ;
      P04Y32_A130BarCodPar = new String[] {""} ;
      P04Y32_n130BarCodPar = new boolean[] {false} ;
      P04Y32_A132BarCodReo = new byte[1] ;
      P04Y32_n132BarCodReo = new boolean[] {false} ;
      P04Y32_A129BarCod = new int[1] ;
      P04Y32_n129BarCod = new boolean[] {false} ;
      P04Y32_A4287BarFasFor = new String[] {""} ;
      P04Y32_A150BarFacTin = new String[] {""} ;
      P04Y32_A4637BarFasCara = new String[] {""} ;
      P04Y32_A457FasCod = new String[] {""} ;
      P04Y32_A5369BarFasGral = new String[] {""} ;
      P04Y32_n5369BarFasGral = new boolean[] {false} ;
      P04Y32_A3030BarPlf = new String[] {""} ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      A4287BarFasFor = "" ;
      A150BarFacTin = "" ;
      A4637BarFasCara = "" ;
      A457FasCod = "" ;
      A5369BarFasGral = "" ;
      A3030BarPlf = "" ;
      AV36BarFasFor = "" ;
      AV37BarFacTin = "" ;
      AV58Manual = "" ;
      AV41FasCod = "" ;
      AV59BarFasGral = "" ;
      AV77M = "" ;
      AV92BarFasCara = "" ;
      P04Y33_A396EmprCod = new String[] {""} ;
      P04Y33_A7891Dt_Ordl = new short[1] ;
      P04Y33_A7870Dt_Orden = new short[1] ;
      P04Y33_A7869Dt_Opp = new String[] {""} ;
      P04Y33_A7868Dt_Opr = new byte[1] ;
      P04Y33_A7867Dt_Op = new int[1] ;
      A7869Dt_Opp = "" ;
      P04Y34_A396EmprCod = new String[] {""} ;
      P04Y34_A7867Dt_Op = new int[1] ;
      P04Y34_A7868Dt_Opr = new byte[1] ;
      P04Y34_A7869Dt_Opp = new String[] {""} ;
      P04Y34_A7870Dt_Orden = new short[1] ;
      P04Y34_A7891Dt_Ordl = new short[1] ;
      P04Y34_A7886Dt_ForLin = new short[1] ;
      P04Y35_A396EmprCod = new String[] {""} ;
      P04Y35_A2804RecLinMaq = new short[1] ;
      P04Y35_A130BarCodPar = new String[] {""} ;
      P04Y35_n130BarCodPar = new boolean[] {false} ;
      P04Y35_A132BarCodReo = new byte[1] ;
      P04Y35_n132BarCodReo = new boolean[] {false} ;
      P04Y35_A129BarCod = new int[1] ;
      P04Y35_n129BarCod = new boolean[] {false} ;
      P04Y35_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      AV44MaqCod = "" ;
      P04Y36_A396EmprCod = new String[] {""} ;
      P04Y36_A602MaqCod = new String[] {""} ;
      P04Y36_A625MaqVolMin = new int[1] ;
      P04Y36_n625MaqVolMin = new boolean[] {false} ;
      P04Y36_A623MaqVolMax = new int[1] ;
      P04Y36_n623MaqVolMax = new boolean[] {false} ;
      Gx_msg = "" ;
      P04Y37_A396EmprCod = new String[] {""} ;
      P04Y37_A130BarCodPar = new String[] {""} ;
      P04Y37_n130BarCodPar = new boolean[] {false} ;
      P04Y37_A132BarCodReo = new byte[1] ;
      P04Y37_n132BarCodReo = new boolean[] {false} ;
      P04Y37_A129BarCod = new int[1] ;
      P04Y37_n129BarCod = new boolean[] {false} ;
      P04Y37_A252CliCod = new int[1] ;
      P04Y37_n252CliCod = new boolean[] {false} ;
      P04Y37_A212BarSer = new String[] {""} ;
      P04Y37_A135BarColNom = new String[] {""} ;
      P04Y37_A136BarColNum = new int[1] ;
      P04Y37_A218BarTipCol = new byte[1] ;
      P04Y37_A217BarTipArt = new short[1] ;
      P04Y37_n217BarTipArt = new boolean[] {false} ;
      P04Y37_A5367BarAntp = new String[] {""} ;
      P04Y37_A5253BarAcc = new String[] {""} ;
      P04Y37_A5406BarAntpT = new String[] {""} ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A5367BarAntp = "" ;
      A5253BarAcc = "" ;
      A5406BarAntpT = "" ;
      W130BarCodPar = "" ;
      AV15EmprCod = "" ;
      AV68ForSer = "" ;
      AV69ForColNom = "" ;
      AV64Tab_p = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV64Tab_p[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV65Tab_L = new short[100] ;
      AV67ForCod = "" ;
      P04Y38_A252CliCod = new int[1] ;
      P04Y38_n252CliCod = new boolean[] {false} ;
      P04Y38_A494ForSer = new String[] {""} ;
      P04Y38_A482ForColNom = new String[] {""} ;
      P04Y38_A483ForColNum = new int[1] ;
      P04Y38_A831TipColCod = new byte[1] ;
      P04Y38_A396EmprCod = new String[] {""} ;
      P04Y38_A129BarCod = new int[1] ;
      P04Y38_n129BarCod = new boolean[] {false} ;
      P04Y38_A132BarCodReo = new byte[1] ;
      P04Y38_n132BarCodReo = new boolean[] {false} ;
      P04Y38_A130BarCodPar = new String[] {""} ;
      P04Y38_n130BarCodPar = new boolean[] {false} ;
      P04Y38_A4705ProForPau = new short[1] ;
      P04Y38_A2392ProNumPro = new int[1] ;
      P04Y38_A772ProForTmx = new short[1] ;
      P04Y38_A6877ProForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04Y38_n6877ProForPhn = new boolean[] {false} ;
      P04Y38_A6876ProForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04Y38_n6876ProForPhx = new boolean[] {false} ;
      P04Y38_A12109ProNh2o = new short[1] ;
      P04Y38_n12109ProNh2o = new boolean[] {false} ;
      P04Y38_A4706ProForRb = new short[1] ;
      P04Y38_A764ProForCod = new String[] {""} ;
      P04Y38_A1160ProForL = new short[1] ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A6877ProForPhn = DecimalUtil.ZERO ;
      A6876ProForPhx = DecimalUtil.ZERO ;
      A764ProForCod = "" ;
      W764ProForCod = "" ;
      A7230RecPhMn = DecimalUtil.ZERO ;
      A7229RecPhMx = DecimalUtil.ZERO ;
      AV49ProForCod = "" ;
      Gx_emsg = "" ;
      P04Y311_A396EmprCod = new String[] {""} ;
      P04Y311_A130BarCodPar = new String[] {""} ;
      P04Y311_n130BarCodPar = new boolean[] {false} ;
      P04Y311_A132BarCodReo = new byte[1] ;
      P04Y311_n132BarCodReo = new boolean[] {false} ;
      P04Y311_A129BarCod = new int[1] ;
      P04Y311_n129BarCod = new boolean[] {false} ;
      P04Y311_A252CliCod = new int[1] ;
      P04Y311_n252CliCod = new boolean[] {false} ;
      P04Y311_A212BarSer = new String[] {""} ;
      P04Y311_A217BarTipArt = new short[1] ;
      P04Y311_n217BarTipArt = new boolean[] {false} ;
      AV39ArtCod = "" ;
      P04Y312_A396EmprCod = new String[] {""} ;
      P04Y312_A7877Dt_CPQ = new String[] {""} ;
      P04Y312_n7877Dt_CPQ = new boolean[] {false} ;
      P04Y312_A7881Dt_ForTmx = new short[1] ;
      P04Y312_n7881Dt_ForTmx = new boolean[] {false} ;
      P04Y312_A7883Dt_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04Y312_n7883Dt_ForPhx = new boolean[] {false} ;
      P04Y312_A7884Dt_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04Y312_n7884Dt_ForPhn = new boolean[] {false} ;
      P04Y312_A7882Dt_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04Y312_n7882Dt_ForRb = new boolean[] {false} ;
      P04Y312_A12110Dt_Nh2o = new short[1] ;
      P04Y312_n12110Dt_Nh2o = new boolean[] {false} ;
      P04Y312_A7880Dt_Fortie = new short[1] ;
      P04Y312_n7880Dt_Fortie = new boolean[] {false} ;
      P04Y312_A7870Dt_Orden = new short[1] ;
      P04Y312_A7869Dt_Opp = new String[] {""} ;
      P04Y312_A7868Dt_Opr = new byte[1] ;
      P04Y312_A7867Dt_Op = new int[1] ;
      P04Y312_A7891Dt_Ordl = new short[1] ;
      A7877Dt_CPQ = "" ;
      A7883Dt_ForPhx = DecimalUtil.ZERO ;
      A7884Dt_ForPhn = DecimalUtil.ZERO ;
      A7882Dt_ForRb = DecimalUtil.ZERO ;
      A7257RecRb = DecimalUtil.ZERO ;
      P04Y315_A396EmprCod = new String[] {""} ;
      P04Y315_A4686MaqTipArt = new short[1] ;
      P04Y315_A5195MaqTipArtR = new short[1] ;
      P04Y315_n5195MaqTipArtR = new boolean[] {false} ;
      AV53Accion = "" ;
      P04Y316_A396EmprCod = new String[] {""} ;
      P04Y316_A764ProForCod = new String[] {""} ;
      P04Y316_A5194ProFoCla = new String[] {""} ;
      P04Y316_n5194ProFoCla = new boolean[] {false} ;
      P04Y316_A5192ProFoPgC = new short[1] ;
      P04Y316_n5192ProFoPgC = new boolean[] {false} ;
      P04Y316_A5193ProFoTmC = new short[1] ;
      P04Y316_n5193ProFoTmC = new boolean[] {false} ;
      P04Y316_A5951ProFoRb = new short[1] ;
      P04Y316_n5951ProFoRb = new boolean[] {false} ;
      P04Y316_A5191ProForLC = new short[1] ;
      A5194ProFoCla = "" ;
      GXv_char8 = new String[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_char13 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int16 = new byte[1] ;
      GXv_int12 = new byte[1] ;
      GXv_int15 = new short[1] ;
      GXv_int18 = new short[1] ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char9 = new String[1] ;
      GXv_int19 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmunprocesos__default(),
         new Object[] {
             new Object[] {
            P04Y32_A396EmprCod, P04Y32_A194BarOrdLin, P04Y32_A758ProCod, P04Y32_A130BarCodPar, P04Y32_A132BarCodReo, P04Y32_A129BarCod, P04Y32_A4287BarFasFor, P04Y32_A150BarFacTin, P04Y32_A4637BarFasCara, P04Y32_A457FasCod,
            P04Y32_A5369BarFasGral, P04Y32_n5369BarFasGral, P04Y32_A3030BarPlf
            }
            , new Object[] {
            P04Y33_A396EmprCod, P04Y33_A7891Dt_Ordl, P04Y33_A7870Dt_Orden, P04Y33_A7869Dt_Opp, P04Y33_A7868Dt_Opr, P04Y33_A7867Dt_Op
            }
            , new Object[] {
            P04Y34_A396EmprCod, P04Y34_A7867Dt_Op, P04Y34_A7868Dt_Opr, P04Y34_A7869Dt_Opp, P04Y34_A7870Dt_Orden, P04Y34_A7891Dt_Ordl, P04Y34_A7886Dt_ForLin
            }
            , new Object[] {
            P04Y35_A396EmprCod, P04Y35_A2804RecLinMaq, P04Y35_A130BarCodPar, P04Y35_A132BarCodReo, P04Y35_A129BarCod, P04Y35_A602MaqCod
            }
            , new Object[] {
            P04Y36_A396EmprCod, P04Y36_A602MaqCod, P04Y36_A625MaqVolMin, P04Y36_n625MaqVolMin, P04Y36_A623MaqVolMax, P04Y36_n623MaqVolMax
            }
            , new Object[] {
            P04Y37_A396EmprCod, P04Y37_A130BarCodPar, P04Y37_A132BarCodReo, P04Y37_A129BarCod, P04Y37_A252CliCod, P04Y37_n252CliCod, P04Y37_A212BarSer, P04Y37_A135BarColNom, P04Y37_A136BarColNum, P04Y37_A218BarTipCol,
            P04Y37_A217BarTipArt, P04Y37_n217BarTipArt, P04Y37_A5367BarAntp, P04Y37_A5253BarAcc, P04Y37_A5406BarAntpT
            }
            , new Object[] {
            P04Y38_A252CliCod, P04Y38_A494ForSer, P04Y38_A482ForColNom, P04Y38_A483ForColNum, P04Y38_A831TipColCod, P04Y38_A396EmprCod, P04Y38_A129BarCod, P04Y38_n129BarCod, P04Y38_A132BarCodReo, P04Y38_n132BarCodReo,
            P04Y38_A130BarCodPar, P04Y38_n130BarCodPar, P04Y38_A4705ProForPau, P04Y38_A2392ProNumPro, P04Y38_A772ProForTmx, P04Y38_A6877ProForPhn, P04Y38_n6877ProForPhn, P04Y38_A6876ProForPhx, P04Y38_n6876ProForPhx, P04Y38_A12109ProNh2o,
            P04Y38_n12109ProNh2o, P04Y38_A4706ProForRb, P04Y38_A764ProForCod, P04Y38_A1160ProForL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04Y311_A396EmprCod, P04Y311_A130BarCodPar, P04Y311_A132BarCodReo, P04Y311_A129BarCod, P04Y311_A252CliCod, P04Y311_n252CliCod, P04Y311_A212BarSer, P04Y311_A217BarTipArt, P04Y311_n217BarTipArt
            }
            , new Object[] {
            P04Y312_A396EmprCod, P04Y312_A7877Dt_CPQ, P04Y312_n7877Dt_CPQ, P04Y312_A7881Dt_ForTmx, P04Y312_n7881Dt_ForTmx, P04Y312_A7883Dt_ForPhx, P04Y312_n7883Dt_ForPhx, P04Y312_A7884Dt_ForPhn, P04Y312_n7884Dt_ForPhn, P04Y312_A7882Dt_ForRb,
            P04Y312_n7882Dt_ForRb, P04Y312_A12110Dt_Nh2o, P04Y312_n12110Dt_Nh2o, P04Y312_A7880Dt_Fortie, P04Y312_n7880Dt_Fortie, P04Y312_A7870Dt_Orden, P04Y312_A7869Dt_Opp, P04Y312_A7868Dt_Opr, P04Y312_A7867Dt_Op, P04Y312_A7891Dt_Ordl
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04Y315_A396EmprCod, P04Y315_A4686MaqTipArt, P04Y315_A5195MaqTipArtR, P04Y315_n5195MaqTipArtR
            }
            , new Object[] {
            P04Y316_A396EmprCod, P04Y316_A764ProForCod, P04Y316_A5194ProFoCla, P04Y316_n5194ProFoCla, P04Y316_A5192ProFoPgC, P04Y316_n5192ProFoPgC, P04Y316_A5193ProFoTmC, P04Y316_n5193ProFoTmC, P04Y316_A5951ProFoRb, P04Y316_n5951ProFoRb,
            P04Y316_A5191ProForLC
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV79Opi ;
   private byte AV76F_Reccol ;
   private byte AV94Suprema ;
   private byte GXt_int1 ;
   private byte A132BarCodReo ;
   private byte AV95Dt001 ;
   private byte A7868Dt_Opr ;
   private byte A218BarTipCol ;
   private byte W132BarCodReo ;
   private byte AV71TipColCod ;
   private byte A831TipColCod ;
   private byte A1273RecLinPro ;
   private byte AV57F_aqua ;
   private byte AV78F_laundry ;
   private byte AV50Flag_ctrl ;
   private byte AV73IntCod ;
   private byte A1272UltLinPro ;
   private byte A5412RecIntCol ;
   private byte AV55F_faspr1 ;
   private byte AV61F_fasqui ;
   private byte GXv_int16[] ;
   private byte GXv_int12[] ;
   private byte GXv_int2[] ;
   private byte AV87Linea_ant ;
   private short AV33RecLinMaq ;
   private short AV34BarOrdLin ;
   private short A194BarOrdLin ;
   private short A7891Dt_Ordl ;
   private short A7870Dt_Orden ;
   private short A7886Dt_ForLin ;
   private short A2804RecLinMaq ;
   private short A217BarTipArt ;
   private short AV47BarTipArt ;
   private short AV65Tab_L[] ;
   private short AV66i ;
   private short A4705ProForPau ;
   private short A772ProForTmx ;
   private short A12109ProNh2o ;
   private short A4706ProForRb ;
   private short A1160ProForL ;
   private short AV24Linea ;
   private short A4696RecTiempo ;
   private short A7228RecTemp ;
   private short A10544RecNH2O ;
   private short AV48MaqTipartr ;
   private short AV54Cont_c ;
   private short AV52ProFoTmc ;
   private short AV51ProFoPgc ;
   private short Gx_err ;
   private short AV74MatCod ;
   private short AV75LineaC ;
   private short A5407RecUltLCo ;
   private short A5413RecMatCol ;
   private short A7881Dt_ForTmx ;
   private short A12110Dt_Nh2o ;
   private short A7880Dt_Fortie ;
   private short AV80ProFoRb ;
   private short A4686MaqTipArt ;
   private short A5195MaqTipArtR ;
   private short A5192ProFoPgC ;
   private short A5193ProFoTmC ;
   private short A5951ProFoRb ;
   private short A5191ProForLC ;
   private short GXv_int15[] ;
   private short GXv_int18[] ;
   private short GXv_int19[] ;
   private int AV16BarCod ;
   private int AV62Volumen_i ;
   private int A129BarCod ;
   private int A7867Dt_Op ;
   private int AV43Vol_for ;
   private int AV45VolMin ;
   private int A625MaqVolMin ;
   private int A623MaqVolMax ;
   private int AV56VolMax ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int W129BarCod ;
   private int AV38CliCod ;
   private int AV70ForColNum ;
   private int GX_I ;
   private int A483ForColNum ;
   private int A2392ProNumPro ;
   private int GX_INS409 ;
   private int A4697RecNroPrg ;
   private int A4695RecVolPrf ;
   private int AV46Vol_cal ;
   private int GXv_int11[] ;
   private int GXv_int7[] ;
   private int GXv_int4[] ;
   private java.math.BigDecimal AV42Kgs_for ;
   private java.math.BigDecimal A6877ProForPhn ;
   private java.math.BigDecimal A6876ProForPhx ;
   private java.math.BigDecimal A7230RecPhMn ;
   private java.math.BigDecimal A7229RecPhMx ;
   private java.math.BigDecimal A7883Dt_ForPhx ;
   private java.math.BigDecimal A7884Dt_ForPhn ;
   private java.math.BigDecimal A7882Dt_ForRb ;
   private java.math.BigDecimal A7257RecRb ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private String A396EmprCod ;
   private String AV18BarCodPar ;
   private String AV35ProCod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String A4287BarFasFor ;
   private String A150BarFacTin ;
   private String A4637BarFasCara ;
   private String A457FasCod ;
   private String A5369BarFasGral ;
   private String A3030BarPlf ;
   private String AV36BarFasFor ;
   private String AV37BarFacTin ;
   private String AV58Manual ;
   private String AV41FasCod ;
   private String AV59BarFasGral ;
   private String AV77M ;
   private String AV92BarFasCara ;
   private String A7869Dt_Opp ;
   private String A602MaqCod ;
   private String AV44MaqCod ;
   private String Gx_msg ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A5367BarAntp ;
   private String A5253BarAcc ;
   private String A5406BarAntpT ;
   private String W130BarCodPar ;
   private String AV15EmprCod ;
   private String AV68ForSer ;
   private String AV69ForColNom ;
   private String AV64Tab_p[] ;
   private String AV67ForCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A764ProForCod ;
   private String W764ProForCod ;
   private String AV49ProForCod ;
   private String Gx_emsg ;
   private String AV39ArtCod ;
   private String A7877Dt_CPQ ;
   private String AV53Accion ;
   private String A5194ProFoCla ;
   private String GXv_char8[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private String GXv_char17[] ;
   private String GXv_char13[] ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private boolean n130BarCodPar ;
   private boolean n132BarCodReo ;
   private boolean n129BarCod ;
   private boolean n5369BarFasGral ;
   private boolean n625MaqVolMin ;
   private boolean n623MaqVolMax ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean returnInSub ;
   private boolean n6877ProForPhn ;
   private boolean n6876ProForPhx ;
   private boolean n12109ProNh2o ;
   private boolean n4696RecTiempo ;
   private boolean n7228RecTemp ;
   private boolean n7230RecPhMn ;
   private boolean n7229RecPhMx ;
   private boolean n5407RecUltLCo ;
   private boolean n5412RecIntCol ;
   private boolean n5413RecMatCol ;
   private boolean n7877Dt_CPQ ;
   private boolean n7881Dt_ForTmx ;
   private boolean n7883Dt_ForPhx ;
   private boolean n7884Dt_ForPhn ;
   private boolean n7882Dt_ForRb ;
   private boolean n12110Dt_Nh2o ;
   private boolean n7880Dt_Fortie ;
   private boolean n7257RecRb ;
   private boolean n5195MaqTipArtR ;
   private boolean n5194ProFoCla ;
   private boolean n5192ProFoPgC ;
   private boolean n5193ProFoTmC ;
   private boolean n5951ProFoRb ;
   private byte[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private int[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P04Y32_A396EmprCod ;
   private short[] P04Y32_A194BarOrdLin ;
   private String[] P04Y32_A758ProCod ;
   private String[] P04Y32_A130BarCodPar ;
   private boolean[] P04Y32_n130BarCodPar ;
   private byte[] P04Y32_A132BarCodReo ;
   private boolean[] P04Y32_n132BarCodReo ;
   private int[] P04Y32_A129BarCod ;
   private boolean[] P04Y32_n129BarCod ;
   private String[] P04Y32_A4287BarFasFor ;
   private String[] P04Y32_A150BarFacTin ;
   private String[] P04Y32_A4637BarFasCara ;
   private String[] P04Y32_A457FasCod ;
   private String[] P04Y32_A5369BarFasGral ;
   private boolean[] P04Y32_n5369BarFasGral ;
   private String[] P04Y32_A3030BarPlf ;
   private String[] P04Y33_A396EmprCod ;
   private short[] P04Y33_A7891Dt_Ordl ;
   private short[] P04Y33_A7870Dt_Orden ;
   private String[] P04Y33_A7869Dt_Opp ;
   private byte[] P04Y33_A7868Dt_Opr ;
   private int[] P04Y33_A7867Dt_Op ;
   private String[] P04Y34_A396EmprCod ;
   private int[] P04Y34_A7867Dt_Op ;
   private byte[] P04Y34_A7868Dt_Opr ;
   private String[] P04Y34_A7869Dt_Opp ;
   private short[] P04Y34_A7870Dt_Orden ;
   private short[] P04Y34_A7891Dt_Ordl ;
   private short[] P04Y34_A7886Dt_ForLin ;
   private String[] P04Y35_A396EmprCod ;
   private short[] P04Y35_A2804RecLinMaq ;
   private String[] P04Y35_A130BarCodPar ;
   private boolean[] P04Y35_n130BarCodPar ;
   private byte[] P04Y35_A132BarCodReo ;
   private boolean[] P04Y35_n132BarCodReo ;
   private int[] P04Y35_A129BarCod ;
   private boolean[] P04Y35_n129BarCod ;
   private String[] P04Y35_A602MaqCod ;
   private String[] P04Y36_A396EmprCod ;
   private String[] P04Y36_A602MaqCod ;
   private int[] P04Y36_A625MaqVolMin ;
   private boolean[] P04Y36_n625MaqVolMin ;
   private int[] P04Y36_A623MaqVolMax ;
   private boolean[] P04Y36_n623MaqVolMax ;
   private String[] P04Y37_A396EmprCod ;
   private String[] P04Y37_A130BarCodPar ;
   private boolean[] P04Y37_n130BarCodPar ;
   private byte[] P04Y37_A132BarCodReo ;
   private boolean[] P04Y37_n132BarCodReo ;
   private int[] P04Y37_A129BarCod ;
   private boolean[] P04Y37_n129BarCod ;
   private int[] P04Y37_A252CliCod ;
   private boolean[] P04Y37_n252CliCod ;
   private String[] P04Y37_A212BarSer ;
   private String[] P04Y37_A135BarColNom ;
   private int[] P04Y37_A136BarColNum ;
   private byte[] P04Y37_A218BarTipCol ;
   private short[] P04Y37_A217BarTipArt ;
   private boolean[] P04Y37_n217BarTipArt ;
   private String[] P04Y37_A5367BarAntp ;
   private String[] P04Y37_A5253BarAcc ;
   private String[] P04Y37_A5406BarAntpT ;
   private int[] P04Y38_A252CliCod ;
   private boolean[] P04Y38_n252CliCod ;
   private String[] P04Y38_A494ForSer ;
   private String[] P04Y38_A482ForColNom ;
   private int[] P04Y38_A483ForColNum ;
   private byte[] P04Y38_A831TipColCod ;
   private String[] P04Y38_A396EmprCod ;
   private int[] P04Y38_A129BarCod ;
   private boolean[] P04Y38_n129BarCod ;
   private byte[] P04Y38_A132BarCodReo ;
   private boolean[] P04Y38_n132BarCodReo ;
   private String[] P04Y38_A130BarCodPar ;
   private boolean[] P04Y38_n130BarCodPar ;
   private short[] P04Y38_A4705ProForPau ;
   private int[] P04Y38_A2392ProNumPro ;
   private short[] P04Y38_A772ProForTmx ;
   private java.math.BigDecimal[] P04Y38_A6877ProForPhn ;
   private boolean[] P04Y38_n6877ProForPhn ;
   private java.math.BigDecimal[] P04Y38_A6876ProForPhx ;
   private boolean[] P04Y38_n6876ProForPhx ;
   private short[] P04Y38_A12109ProNh2o ;
   private boolean[] P04Y38_n12109ProNh2o ;
   private short[] P04Y38_A4706ProForRb ;
   private String[] P04Y38_A764ProForCod ;
   private short[] P04Y38_A1160ProForL ;
   private String[] P04Y311_A396EmprCod ;
   private String[] P04Y311_A130BarCodPar ;
   private boolean[] P04Y311_n130BarCodPar ;
   private byte[] P04Y311_A132BarCodReo ;
   private boolean[] P04Y311_n132BarCodReo ;
   private int[] P04Y311_A129BarCod ;
   private boolean[] P04Y311_n129BarCod ;
   private int[] P04Y311_A252CliCod ;
   private boolean[] P04Y311_n252CliCod ;
   private String[] P04Y311_A212BarSer ;
   private short[] P04Y311_A217BarTipArt ;
   private boolean[] P04Y311_n217BarTipArt ;
   private String[] P04Y312_A396EmprCod ;
   private String[] P04Y312_A7877Dt_CPQ ;
   private boolean[] P04Y312_n7877Dt_CPQ ;
   private short[] P04Y312_A7881Dt_ForTmx ;
   private boolean[] P04Y312_n7881Dt_ForTmx ;
   private java.math.BigDecimal[] P04Y312_A7883Dt_ForPhx ;
   private boolean[] P04Y312_n7883Dt_ForPhx ;
   private java.math.BigDecimal[] P04Y312_A7884Dt_ForPhn ;
   private boolean[] P04Y312_n7884Dt_ForPhn ;
   private java.math.BigDecimal[] P04Y312_A7882Dt_ForRb ;
   private boolean[] P04Y312_n7882Dt_ForRb ;
   private short[] P04Y312_A12110Dt_Nh2o ;
   private boolean[] P04Y312_n12110Dt_Nh2o ;
   private short[] P04Y312_A7880Dt_Fortie ;
   private boolean[] P04Y312_n7880Dt_Fortie ;
   private short[] P04Y312_A7870Dt_Orden ;
   private String[] P04Y312_A7869Dt_Opp ;
   private byte[] P04Y312_A7868Dt_Opr ;
   private int[] P04Y312_A7867Dt_Op ;
   private short[] P04Y312_A7891Dt_Ordl ;
   private String[] P04Y315_A396EmprCod ;
   private short[] P04Y315_A4686MaqTipArt ;
   private short[] P04Y315_A5195MaqTipArtR ;
   private boolean[] P04Y315_n5195MaqTipArtR ;
   private String[] P04Y316_A396EmprCod ;
   private String[] P04Y316_A764ProForCod ;
   private String[] P04Y316_A5194ProFoCla ;
   private boolean[] P04Y316_n5194ProFoCla ;
   private short[] P04Y316_A5192ProFoPgC ;
   private boolean[] P04Y316_n5192ProFoPgC ;
   private short[] P04Y316_A5193ProFoTmC ;
   private boolean[] P04Y316_n5193ProFoTmC ;
   private short[] P04Y316_A5951ProFoRb ;
   private boolean[] P04Y316_n5951ProFoRb ;
   private short[] P04Y316_A5191ProForLC ;
}

final  class pmunprocesos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04Y32", "SELECT T1.EmprCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarFasFor, T1.BarFacTin, T1.BarFasCara, T1.FasCod, T1.BarFasGral, T2.BarPlf FROM (TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04Y33", "SELECT EmprCod, Dt_Ordl, Dt_Orden, Dt_Opp, Dt_Opr, Dt_Op FROM TXPDT001 WHERE EmprCod = ? and Dt_Op = ? and Dt_Opr = ? and Dt_Opp = ? and Dt_Orden = ? ORDER BY EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04Y34", "SELECT EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_ForLin FROM TXPDT0011 WHERE EmprCod = ? and Dt_Op = ? and Dt_Opr = ? and Dt_Opp = ? and Dt_Orden = ? and Dt_Ordl = ? ORDER BY EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_ForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04Y35", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04Y36", "SELECT EmprCod, MaqCod, MaqVolMin, MaqVolMax FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04Y37", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarTipArt, BarAntp, BarAcc, BarAntpT FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04Y38", "SELECT T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.EmprCod, T3.BarCod, T3.BarCodReo, T3.BarCodPar, T2.ProForPau, T2.ProNumPro, T2.ProForTmx, T2.ProForPhn, T2.ProForPhx, T2.ProNh2o, T2.ProForRb, T1.ProForCod, T1.ProForL FROM ((TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) INNER JOIN TXPCFORMU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ForSer = T1.ForSer AND T3.ForColNom = T1.ForColNom AND T3.ForColNum = T1.ForColNum AND T3.TipColCod = T1.TipColCod) WHERE (T1.EmprCod = ? and T1.ProForCod = ?) AND (T3.BarCod = ?) AND (T3.BarCodReo = ?) AND (T3.BarCodPar = ?) ORDER BY T1.EmprCod, T1.ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04Y39", "INSERT INTO TXPCRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ProForCod, RecVolPrf, RecTiempo, RecNroPrg, RecTemp, RecPhMx, RecPhMn, RecNH2O, ProRecObs, RecRb, RecNumRec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new UpdateCursor("P04Y310", "UPDATE TXPRECMAQ SET UltLinPro=?, RecUltLCo=?, RecIntCol=?, RecMatCol=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new ForEachCursor("P04Y311", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04Y312", "SELECT EmprCod, Dt_CPQ, Dt_ForTmx, Dt_ForPhx, Dt_ForPhn, Dt_ForRb, Dt_Nh2o, Dt_Fortie, Dt_Orden, Dt_Opp, Dt_Opr, Dt_Op, Dt_Ordl FROM TXPDT001 WHERE EmprCod = ? and Dt_Op = ? and Dt_Opr = ? and Dt_Opp = ? and Dt_Orden = ? ORDER BY EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04Y313", "INSERT INTO TXPCRECET(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ProForCod, RecVolPrf, RecTiempo, RecNroPrg, RecTemp, RecPhMx, RecPhMn, RecRb, RecNH2O, ProRecObs, RecNumRec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new UpdateCursor("P04Y314", "UPDATE TXPRECMAQ SET UltLinPro=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
         ,new ForEachCursor("P04Y315", "SELECT EmprCod, MaqTipArt, MaqTipArtR FROM TXPMAQTAR WHERE EmprCod = ? and MaqTipArt = ? ORDER BY EmprCod, MaqTipArt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04Y316", "SELECT EmprCod, ProForCod, ProFoCla, ProFoPgC, ProFoTmC, ProFoRb, ProForLC FROM TXPPROFOC WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod, ProForLC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04Y317", "DELETE FROM TXPCRECET  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
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
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(16);
               ((String[]) buf[22])[0] = rslt.getString(17, 6);
               ((short[]) buf[23])[0] = rslt.getShort(18);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((String[]) buf[16])[0] = rslt.getString(10, 1);
               ((byte[]) buf[17])[0] = rslt.getByte(11);
               ((int[]) buf[18])[0] = rslt.getInt(12);
               ((short[]) buf[19])[0] = rslt.getShort(13);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 14 :
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 6);
               stmt.setInt(8, ((Number) parms[10]).intValue());
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[12]).shortValue());
               }
               stmt.setInt(10, ((Number) parms[13]).intValue());
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[19], 2);
               }
               stmt.setShort(14, ((Number) parms[20]).shortValue());
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               stmt.setString(5, (String)parms[7], 3);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setString(8, (String)parms[10], 1);
               stmt.setShort(9, ((Number) parms[11]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               stmt.setShort(5, ((Number) parms[7]).shortValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 6);
               stmt.setInt(8, ((Number) parms[10]).intValue());
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[12]).shortValue());
               }
               stmt.setInt(10, ((Number) parms[13]).intValue());
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[21], 2);
               }
               stmt.setShort(15, ((Number) parms[22]).shortValue());
               return;
            case 12 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

