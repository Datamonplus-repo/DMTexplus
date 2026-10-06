package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbordis extends GXProcedure
{
   public pbordis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbordis.class ), "" );
   }

   public pbordis( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 )
   {
      pbordis.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 )
   {
      pbordis.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbordis.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      pbordis.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbordis.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbordis.this.AV18DisCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV27Flag1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HISEMP", ""), GXv_int1) ;
      pbordis.this.AV27Flag1 = GXv_int1[0] ;
      GXv_int1[0] = AV30Flag2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DETPIE", ""), GXv_int1) ;
      pbordis.this.AV30Flag2 = GXv_int1[0] ;
      AV44F_macros = (byte)(0) ;
      GXv_int1[0] = AV44F_macros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KILMAC", ""), GXv_int1) ;
      pbordis.this.AV44F_macros = GXv_int1[0] ;
      GXv_int1[0] = AV45BajaPP ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BAJAPP", ""), GXv_int1) ;
      pbordis.this.AV45BajaPP = GXv_int1[0] ;
      GXv_int1[0] = AV55PLinea ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int1) ;
      pbordis.this.AV55PLinea = GXv_int1[0] ;
      GXv_int1[0] = AV65Velta ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTTO", ""), GXv_int1) ;
      pbordis.this.AV65Velta = GXv_int1[0] ;
      GXt_int2 = AV60FasMin ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FASMIN", ""), GXv_int1) ;
      pbordis.this.GXt_int2 = GXv_int1[0] ;
      AV60FasMin = GXt_int2 ;
      GXt_int2 = AV61Texfina ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int1) ;
      pbordis.this.GXt_int2 = GXv_int1[0] ;
      AV61Texfina = GXt_int2 ;
      GXt_int2 = AV64Lindalana ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int1) ;
      pbordis.this.GXt_int2 = GXv_int1[0] ;
      AV64Lindalana = GXt_int2 ;
      GXt_char3 = AV22msg0 ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG249_", ""), (byte)(99), GXv_char4) ;
      pbordis.this.GXt_char3 = GXv_char4[0] ;
      AV22msg0 = GXt_char3 ;
      GXt_char3 = AV46msg1 ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN581_", ""), (byte)(99), GXv_char4) ;
      pbordis.this.GXt_char3 = GXv_char4[0] ;
      AV46msg1 = GXt_char3 ;
      GXt_char3 = AV72Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      pbordis.this.GXt_char3 = GXv_char4[0] ;
      AV72Station = GXt_char3 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = AV70EmprNom ;
      GXv_char6[0] = AV71UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV72Station, GXv_char4, GXv_char5, GXv_char6) ;
      pbordis.this.A396EmprCod = GXv_char4[0] ;
      pbordis.this.AV70EmprNom = GXv_char5[0] ;
      pbordis.this.AV71UsurCod = GXv_char6[0] ;
      GXt_int2 = (byte)(DecimalUtil.decToDouble(AV77Noalmacenmalha)) ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOALMH", ""), GXv_int1) ;
      pbordis.this.GXt_int2 = GXv_int1[0] ;
      AV77Noalmacenmalha = DecimalUtil.doubleToDec(GXt_int2) ;
      AV23Contador = (short)(0) ;
      AV24BorDis = (byte)(0) ;
      /* Optimized group. */
      /* Using cursor P003F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18DisCod)});
      cV23Contador = P003F2_AV23Contador[0] ;
      pr_default.close(0);
      AV23Contador = (short)(AV23Contador+cV23Contador*1) ;
      /* End optimized group. */
      if ( AV23Contador < 2 )
      {
         AV24BorDis = (byte)(1) ;
      }
      AV21Flag = (byte)(0) ;
      /* Using cursor P003F3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P003F3_A130BarCodPar[0] ;
         A132BarCodReo = P003F3_A132BarCodReo[0] ;
         A129BarCod = P003F3_A129BarCod[0] ;
         A213BarSit = P003F3_A213BarSit[0] ;
         A2826BarNumLot = P003F3_A2826BarNumLot[0] ;
         A2010BarTipDis = P003F3_A2010BarTipDis[0] ;
         A1799BarDibInt = P003F3_A1799BarDibInt[0] ;
         A361DisCod = P003F3_A361DisCod[0] ;
         A365DisDes = P003F3_A365DisDes[0] ;
         A12811BarLocCol = P003F3_A12811BarLocCol[0] ;
         A148BarEstReo = P003F3_A148BarEstReo[0] ;
         AV62Tex_Nped = A2826BarNumLot ;
         /* Using cursor P003F4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A758ProCod = P003F4_A758ProCod[0] ;
            A761ProFasLin = P003F4_A761ProFasLin[0] ;
            n761ProFasLin = P003F4_n761ProFasLin[0] ;
            /* Using cursor P003F5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A194BarOrdLin = P003F5_A194BarOrdLin[0] ;
               /* Using cursor P003F6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
               /* Optimized DELETE. */
               /* Using cursor P003F7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
               /* End optimized DELETE. */
               /* Using cursor P003F8 */
               pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               while ( (pr_default.getStatus(6) != 101) )
               {
                  A4643BarFasLot = P003F8_A4643BarFasLot[0] ;
                  /* Optimized DELETE. */
                  /* Using cursor P003F9 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPFA");
                  /* End optimized DELETE. */
                  /* Using cursor P003F10 */
                  pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
                  pr_default.readNext(6);
               }
               pr_default.close(6);
               /* Optimized DELETE. */
               /* Using cursor P003F11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
               /* End optimized DELETE. */
               /* Using cursor P003F12 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(10) != 101) )
               {
                  A5322Dp_Nrecep = P003F12_A5322Dp_Nrecep[0] ;
                  /* Using cursor P003F13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
                  while ( (pr_default.getStatus(11) != 101) )
                  {
                     A4344Dp_PzU = P003F13_A4344Dp_PzU[0] ;
                     n4344Dp_PzU = P003F13_n4344Dp_PzU[0] ;
                     A4982Dp_UnU = P003F13_A4982Dp_UnU[0] ;
                     n4982Dp_UnU = P003F13_n4982Dp_UnU[0] ;
                     A4979Dp_Plg = P003F13_A4979Dp_Plg[0] ;
                     A4978Dp_Ubi = P003F13_A4978Dp_Ubi[0] ;
                     GXv_char6[0] = A396EmprCod ;
                     GXv_int7[0] = A5322Dp_Nrecep ;
                     GXv_char5[0] = A4978Dp_Ubi ;
                     GXv_int8[0] = A4979Dp_Plg ;
                     GXv_int9[0] = A4344Dp_PzU ;
                     GXv_decimal10[0] = A4982Dp_UnU ;
                     GXv_int11[0] = 0 ;
                     GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
                     new app.pubiins(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5, GXv_int8, GXv_int9, GXv_decimal10, GXv_int11, GXv_decimal12) ;
                     pbordis.this.A396EmprCod = GXv_char6[0] ;
                     pbordis.this.A5322Dp_Nrecep = GXv_int7[0] ;
                     pbordis.this.A4978Dp_Ubi = GXv_char5[0] ;
                     pbordis.this.A4979Dp_Plg = GXv_int8[0] ;
                     pbordis.this.A4344Dp_PzU = GXv_int9[0] ;
                     pbordis.this.A4982Dp_UnU = GXv_decimal10[0] ;
                     /* Using cursor P003F14 */
                     pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep), A4978Dp_Ubi, Short.valueOf(A4979Dp_Plg)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIDPG");
                     pr_default.readNext(11);
                  }
                  pr_default.close(11);
                  /* Using cursor P003F15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIDEP");
                  pr_default.readNext(10);
               }
               pr_default.close(10);
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Using cursor P003F16 */
            pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
            pr_default.readNext(2);
         }
         pr_default.close(2);
         System.out.println( httpContext.getMessage( "Fin barpro", "") );
         /* Optimized DELETE. */
         /* Using cursor P003F17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
         /* End optimized DELETE. */
         System.out.println( httpContext.getMessage( "Baraud", "") );
         /* Optimized DELETE. */
         /* Using cursor P003F18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAUD");
         /* End optimized DELETE. */
         System.out.println( httpContext.getMessage( "Cmacro", "") );
         /* Optimized DELETE. */
         /* Using cursor P003F19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
         /* End optimized DELETE. */
         if ( AV64Lindalana == 0 )
         {
            System.out.println( httpContext.getMessage( "XLFORMU", "") );
            /* Using cursor P003F20 */
            pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(18) != 101) )
            {
               A5579XBarCodf = P003F20_A5579XBarCodf[0] ;
               A5580XCodReof = P003F20_A5580XCodReof[0] ;
               A5581XCodParf = P003F20_A5581XCodParf[0] ;
               A5575XTipColCod = P003F20_A5575XTipColCod[0] ;
               A5574XForColNum = P003F20_A5574XForColNum[0] ;
               A5573XForColNom = P003F20_A5573XForColNom[0] ;
               A5572XForSer = P003F20_A5572XForSer[0] ;
               A5571XCliCodf = P003F20_A5571XCliCodf[0] ;
               A5577XUltLinF = P003F20_A5577XUltLinF[0] ;
               n5577XUltLinF = P003F20_n5577XUltLinF[0] ;
               /* Optimized DELETE. */
               /* Using cursor P003F21 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A5571XCliCodf), A5572XForSer, A5573XForColNom, Integer.valueOf(A5574XForColNum), Byte.valueOf(A5575XTipColCod), Integer.valueOf(A5579XBarCodf), Byte.valueOf(A5580XCodReof), A5581XCodParf});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXLFOR1");
               /* End optimized DELETE. */
               /* Using cursor P003F22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A5571XCliCodf), A5572XForSer, A5573XForColNom, Integer.valueOf(A5574XForColNum), Byte.valueOf(A5575XTipColCod), Integer.valueOf(A5579XBarCodf), Byte.valueOf(A5580XCodReof), A5581XCodParf});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXLFORM");
               pr_default.readNext(18);
            }
            pr_default.close(18);
         }
         System.out.println( httpContext.getMessage( "Pll..", "") );
         /* Optimized DELETE. */
         /* Using cursor P003F23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLLBar");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P003F24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P003F25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIGBAR");
         /* End optimized DELETE. */
         if ( ( AV65Velta == 1 ) && ( ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "F", "")) == 0 ) ) )
         {
            AV66BarTipDis = A2010BarTipDis ;
            AV67BarDibInt = A1799BarDibInt ;
         }
         AV25DisPos = A361DisCod ;
         AV31DisDes = A365DisDes ;
         AV73BarLocCol = A12811BarLocCol ;
         System.out.println( httpContext.getMessage( "Busdis..", "") );
         /* Execute user subroutine: 'BUSDIS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( A148BarEstReo > 0 )
         {
            /* Execute user subroutine: 'HISREO' */
            S151 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Using cursor P003F26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV21Flag == 0 )
      {
         if ( AV24BorDis == 1 )
         {
            /* Using cursor P003F27 */
            pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(AV18DisCod)});
            while ( (pr_default.getStatus(25) != 101) )
            {
               A361DisCod = P003F27_A361DisCod[0] ;
               A375DisNumUni = P003F27_A375DisNumUni[0] ;
               AV63Tex_kgsp = A375DisNumUni ;
               /* Optimized DELETE. */
               /* Using cursor P003F28 */
               pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
               /* End optimized DELETE. */
               /* Using cursor P003F29 */
               pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(25);
         }
         /* Optimized DELETE. */
         /* Using cursor P003F30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(AV18DisCod), Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISBAR");
         /* End optimized DELETE. */
         if ( AV60FasMin == 1 )
         {
            GXv_char6[0] = A396EmprCod ;
            GXv_int11[0] = AV15BarCod ;
            GXv_int1[0] = AV16BarCodReo ;
            GXv_char5[0] = AV17BarCodPar ;
            new app.pelimin(remoteHandle, context).execute( GXv_char6, GXv_int11, GXv_int1, GXv_char5) ;
            pbordis.this.A396EmprCod = GXv_char6[0] ;
            pbordis.this.AV15BarCod = GXv_int11[0] ;
            pbordis.this.AV16BarCodReo = GXv_int1[0] ;
            pbordis.this.AV17BarCodPar = GXv_char5[0] ;
         }
         /* Using cursor P003F31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
         while ( (pr_default.getStatus(29) != 101) )
         {
            A130BarCodPar = P003F31_A130BarCodPar[0] ;
            A132BarCodReo = P003F31_A132BarCodReo[0] ;
            A129BarCod = P003F31_A129BarCod[0] ;
            A671PieAgr = P003F31_A671PieAgr[0] ;
            A119BarAgrCod = P003F31_A119BarAgrCod[0] ;
            A124BarAgrReo = P003F31_A124BarAgrReo[0] ;
            A122BarAgrPar = P003F31_A122BarAgrPar[0] ;
            AV57BarCodAgr = A119BarAgrCod ;
            AV58BarReoAgr = A124BarAgrReo ;
            AV59BarParAgr = A122BarAgrPar ;
            /* Using cursor P003F32 */
            pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
            pr_default.readNext(29);
         }
         pr_default.close(29);
         /* Optimized DELETE. */
         /* Using cursor P003F33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
         /* End optimized DELETE. */
         if ( AV60FasMin == 1 )
         {
            GXv_char6[0] = A396EmprCod ;
            GXv_int11[0] = AV57BarCodAgr ;
            GXv_int1[0] = AV58BarReoAgr ;
            GXv_char5[0] = AV59BarParAgr ;
            new app.pcremag(remoteHandle, context).execute( GXv_char6, GXv_int11, GXv_int1, GXv_char5) ;
            pbordis.this.A396EmprCod = GXv_char6[0] ;
            pbordis.this.AV57BarCodAgr = GXv_int11[0] ;
            pbordis.this.AV58BarReoAgr = GXv_int1[0] ;
            pbordis.this.AV59BarParAgr = GXv_char5[0] ;
         }
         /* Optimized DELETE. */
         /* Using cursor P003F34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPEG");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P003F35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPEG");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P003F36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFOA");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P003F37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFOA");
         /* End optimized DELETE. */
      }
      if ( ( AV24BorDis == 1 ) && ( AV44F_macros == 1 ) )
      {
         new app.pjln022(remoteHandle, context).execute( ) ;
      }
      if ( AV77Noalmacenmalha.doubleValue() == 1 )
      {
         AV105I = (byte)(1) ;
         while ( AV105I <= 100 )
         {
            if ( AV74tab_albrec[AV105I-1] == 0 )
            {
               if (true) break;
            }
            AV106Albreccoddelete = AV74tab_albrec[AV105I-1] ;
            /* Using cursor P003F38 */
            pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(AV106Albreccoddelete)});
            while ( (pr_default.getStatus(36) != 101) )
            {
               A44AlbRecCod = P003F38_A44AlbRecCod[0] ;
               A47AlbREst = P003F38_A47AlbREst[0] ;
               if ( A47AlbREst == 0 )
               {
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(36);
            AV105I = (byte)(AV105I+1) ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSDIS' Routine */
      returnInSub = false ;
      /* Using cursor P003F39 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(AV25DisPos)});
      while ( (pr_default.getStatus(37) != 101) )
      {
         A361DisCod = P003F39_A361DisCod[0] ;
         A392DisUniMed = P003F39_A392DisUniMed[0] ;
         A375DisNumUni = P003F39_A375DisNumUni[0] ;
         AV26DisUniMed = A392DisUniMed ;
         AV68DisNumUni = A375DisNumUni ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(37);
      if ( AV24BorDis == 1 )
      {
         /* Using cursor P003F40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(AV25DisPos)});
         while ( (pr_default.getStatus(38) != 101) )
         {
            A44AlbRecCod = P003F40_A44AlbRecCod[0] ;
            A361DisCod = P003F40_A361DisCod[0] ;
            /* Using cursor P003F41 */
            pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
            while ( (pr_default.getStatus(39) != 101) )
            {
               A758ProCod = P003F41_A758ProCod[0] ;
               A846UltFasLin = P003F41_A846UltFasLin[0] ;
               /* Using cursor P003F42 */
               pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
               while ( (pr_default.getStatus(40) != 101) )
               {
                  A368DisFasLin = P003F42_A368DisFasLin[0] ;
                  /* Using cursor P003F43 */
                  pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  /* Optimized DELETE. */
                  /* Using cursor P003F44 */
                  pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
                  /* End optimized DELETE. */
                  pr_default.readNext(40);
               }
               pr_default.close(40);
               /* Using cursor P003F45 */
               pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
               /* Optimized DELETE. */
               /* Using cursor P003F46 */
               pr_default.execute(44, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P003F47 */
               pr_default.execute(45, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISCOM");
               /* End optimized DELETE. */
               /* Optimized DELETE. */
               /* Using cursor P003F48 */
               pr_default.execute(46, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDIGCOM");
               /* End optimized DELETE. */
               AV32AlbRecCod = A44AlbRecCod ;
               if ( GXutil.strcmp(AV73BarLocCol, httpContext.getMessage( "Prepedido", "")) == 0 )
               {
                  /* Execute user subroutine: 'DELETEALBREC' */
                  S1232 ();
                  if ( returnInSub )
                  {
                     pr_default.close(39);
                     pr_default.close(38);
                     returnInSub = true;
                     if (true) return;
                  }
               }
               /* Using cursor P003F49 */
               pr_default.execute(47, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
               pr_default.readNext(39);
            }
            pr_default.close(39);
            /* Optimized DELETE. */
            /* Using cursor P003F50 */
            pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
            /* End optimized DELETE. */
            /* Using cursor P003F51 */
            pr_default.execute(49, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
            pr_default.readNext(38);
         }
         pr_default.close(38);
         /* Execute user subroutine: 'DISREF' */
         S131 ();
         if (returnInSub) return;
         if ( ( AV65Velta == 1 ) && ( ( GXutil.strcmp(AV66BarTipDis, httpContext.getMessage( "E", "")) == 0 ) || ( GXutil.strcmp(AV66BarTipDis, httpContext.getMessage( "F", "")) == 0 ) ) )
         {
            /* Execute user subroutine: 'EMPESA_DIBUJO' */
            S141 ();
            if (returnInSub) return;
         }
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV74tab_albrec[GX_I-1] = 0 ;
         GX_I = (int)(GX_I+1) ;
      }
      AV105I = (byte)(1) ;
      AV37termine = httpContext.getMessage( "N", "") ;
      while ( GXutil.strcmp(AV37termine, httpContext.getMessage( "N", "")) == 0 )
      {
         AV117GXLvl396 = (byte)(0) ;
         /* Using cursor P003F52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
         while ( (pr_default.getStatus(50) != 101) )
         {
            A130BarCodPar = P003F52_A130BarCodPar[0] ;
            A132BarCodReo = P003F52_A132BarCodReo[0] ;
            A129BarCod = P003F52_A129BarCod[0] ;
            A44AlbRecCod = P003F52_A44AlbRecCod[0] ;
            A203BarPieKil = P003F52_A203BarPieKil[0] ;
            A205BarPieMet = P003F52_A205BarPieMet[0] ;
            A1501BarPiePie = P003F52_A1501BarPiePie[0] ;
            A200BarPieCod = P003F52_A200BarPieCod[0] ;
            AV117GXLvl396 = (byte)(1) ;
            AV38BarPieCod = A200BarPieCod ;
            AV32AlbRecCod = A44AlbRecCod ;
            AV39barpiekil = A203BarPieKil ;
            AV40barpiemet = A205BarPieMet ;
            AV41barpiepie = A1501BarPiePie ;
            AV74tab_albrec[AV105I-1] = A44AlbRecCod ;
            AV105I = (byte)(AV105I+1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(50);
         }
         pr_default.close(50);
         if ( AV117GXLvl396 == 0 )
         {
            AV37termine = httpContext.getMessage( "S", "") ;
         }
         if ( GXutil.strcmp(AV37termine, httpContext.getMessage( "S", "")) != 0 )
         {
            if ( AV27Flag1 == 0 )
            {
               GXv_char6[0] = A396EmprCod ;
               GXv_int11[0] = AV18DisCod ;
               GXv_int9[0] = AV32AlbRecCod ;
               GXv_char5[0] = AV38BarPieCod ;
               GXv_char4[0] = AV31DisDes ;
               GXv_decimal12[0] = AV39barpiekil ;
               GXv_decimal10[0] = AV40barpiemet ;
               GXv_int7[0] = AV41barpiepie ;
               new app.pdelpdi2(remoteHandle, context).execute( GXv_char6, GXv_int11, GXv_int9, GXv_char5, GXv_char4, GXv_decimal12, GXv_decimal10, GXv_int7) ;
               pbordis.this.A396EmprCod = GXv_char6[0] ;
               pbordis.this.AV18DisCod = GXv_int11[0] ;
               pbordis.this.AV32AlbRecCod = GXv_int9[0] ;
               pbordis.this.AV38BarPieCod = GXv_char5[0] ;
               pbordis.this.AV31DisDes = GXv_char4[0] ;
               pbordis.this.AV39barpiekil = GXv_decimal12[0] ;
               pbordis.this.AV40barpiemet = GXv_decimal10[0] ;
               pbordis.this.AV41barpiepie = GXv_int7[0] ;
            }
            else
            {
               if ( GXutil.strcmp(AV31DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV41barpiepie = 1 ;
               }
               GXv_char6[0] = A396EmprCod ;
               GXv_int13[0] = AV18DisCod ;
               GXv_int11[0] = AV32AlbRecCod ;
               GXv_decimal12[0] = AV39barpiekil ;
               GXv_decimal10[0] = AV40barpiemet ;
               GXv_int9[0] = AV41barpiepie ;
               GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
               GXv_int7[0] = 0 ;
               GXv_char5[0] = httpContext.getMessage( "B", "") ;
               GXv_char4[0] = " " ;
               GXv_int16[0] = 0 ;
               GXv_char17[0] = httpContext.getMessage( "DEL", "") ;
               GXv_char18[0] = "" ;
               new app.pmodhis(remoteHandle, context).execute( GXv_char6, GXv_int13, GXv_int11, GXv_decimal12, GXv_decimal10, GXv_int9, GXv_decimal14, GXv_decimal15, GXv_int7, GXv_char5, GXv_char4, GXv_int16, GXv_char17, GXv_char18) ;
               pbordis.this.A396EmprCod = GXv_char6[0] ;
               pbordis.this.AV18DisCod = (int)((int)(GXv_int13[0])) ;
               pbordis.this.AV32AlbRecCod = GXv_int11[0] ;
               pbordis.this.AV39barpiekil = GXv_decimal12[0] ;
               pbordis.this.AV40barpiemet = GXv_decimal10[0] ;
               pbordis.this.AV41barpiepie = GXv_int9[0] ;
            }
            /* Optimized DELETE. */
            /* Using cursor P003F53 */
            pr_default.execute(51, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar, AV38BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            /* End optimized DELETE. */
         }
      }
   }

   public void S131( )
   {
      /* 'DISREF' Routine */
      returnInSub = false ;
      /* Using cursor P003F54 */
      pr_default.execute(52, new Object[] {A396EmprCod, Integer.valueOf(AV18DisCod)});
      while ( (pr_default.getStatus(52) != 101) )
      {
         A361DisCod = P003F54_A361DisCod[0] ;
         A3608DisRefAlbR = P003F54_A3608DisRefAlbR[0] ;
         n3608DisRefAlbR = P003F54_n3608DisRefAlbR[0] ;
         A3398DisRefBarC = P003F54_A3398DisRefBarC[0] ;
         A3399DisRefBCRe = P003F54_A3399DisRefBCRe[0] ;
         A3400DisRefBCPa = P003F54_A3400DisRefBCPa[0] ;
         A3607DisRefBPie = P003F54_A3607DisRefBPie[0] ;
         A3403DisRefPie = P003F54_A3403DisRefPie[0] ;
         n3403DisRefPie = P003F54_n3403DisRefPie[0] ;
         A3402DisRefMts = P003F54_A3402DisRefMts[0] ;
         n3402DisRefMts = P003F54_n3402DisRefMts[0] ;
         A3401DisRefKgs = P003F54_A3401DisRefKgs[0] ;
         n3401DisRefKgs = P003F54_n3401DisRefKgs[0] ;
         AV32AlbRecCod = A3608DisRefAlbR ;
         AV50RefBarCod = A3398DisRefBarC ;
         AV51RefBarReo = A3399DisRefBCRe ;
         AV52RefBarPar = A3400DisRefBCPa ;
         AV53RefCodPie = A3607DisRefBPie ;
         AV42BarPieLoc = "" ;
         AV43BarPieanc = (short)(0) ;
         if ( GXutil.strcmp(AV31DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            AV19Piezas = A3403DisRefPie ;
         }
         else
         {
            AV19Piezas = (short)(0) ;
         }
         AV28Metros = A3402DisRefMts ;
         AV29Kilos = A3401DisRefKgs ;
         GXv_char18[0] = A396EmprCod ;
         GXv_int16[0] = A361DisCod ;
         GXv_char17[0] = AV31DisDes ;
         GXv_int11[0] = AV32AlbRecCod ;
         GXv_int9[0] = AV50RefBarCod ;
         GXv_int1[0] = AV51RefBarReo ;
         GXv_char6[0] = AV52RefBarPar ;
         GXv_char5[0] = AV53RefCodPie ;
         GXv_char4[0] = AV42BarPieLoc ;
         GXv_int8[0] = AV43BarPieanc ;
         GXv_int19[0] = AV19Piezas ;
         GXv_decimal15[0] = AV28Metros ;
         GXv_decimal14[0] = AV29Kilos ;
         GXv_int20[0] = (short)(0) ;
         GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
         GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char21[0] = httpContext.getMessage( "DEL", "") ;
         new app.pdishdr(remoteHandle, context).execute( GXv_char18, GXv_int16, GXv_char17, GXv_int11, GXv_int9, GXv_int1, GXv_char6, GXv_char5, GXv_char4, GXv_int8, GXv_int19, GXv_decimal15, GXv_decimal14, GXv_int20, GXv_decimal12, GXv_decimal10, GXv_char21) ;
         pbordis.this.A396EmprCod = GXv_char18[0] ;
         pbordis.this.A361DisCod = GXv_int16[0] ;
         pbordis.this.AV31DisDes = GXv_char17[0] ;
         pbordis.this.AV32AlbRecCod = GXv_int11[0] ;
         pbordis.this.AV50RefBarCod = GXv_int9[0] ;
         pbordis.this.AV51RefBarReo = GXv_int1[0] ;
         pbordis.this.AV52RefBarPar = GXv_char6[0] ;
         pbordis.this.AV53RefCodPie = GXv_char5[0] ;
         pbordis.this.AV42BarPieLoc = GXv_char4[0] ;
         pbordis.this.AV43BarPieanc = GXv_int8[0] ;
         pbordis.this.AV19Piezas = GXv_int19[0] ;
         pbordis.this.AV28Metros = GXv_decimal15[0] ;
         pbordis.this.AV29Kilos = GXv_decimal14[0] ;
         pr_default.readNext(52);
      }
      pr_default.close(52);
   }

   public void S141( )
   {
      /* 'EMPESA_DIBUJO' Routine */
      returnInSub = false ;
      /* Using cursor P003F55 */
      pr_default.execute(53, new Object[] {A396EmprCod, Integer.valueOf(AV67BarDibInt)});
      while ( (pr_default.getStatus(53) != 101) )
      {
         A44AlbRecCod = P003F55_A44AlbRecCod[0] ;
         A47AlbREst = P003F55_A47AlbREst[0] ;
         A60AlbRUniUti = P003F55_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P003F55_A58AlbRUniEnt[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A60AlbRUniUti = A60AlbRUniUti.subtract(AV68DisNumUni) ;
         A47AlbREst = (byte)(0) ;
         if ( A57AlbRUniDis.doubleValue() <= 0 )
         {
            A47AlbREst = (byte)(1) ;
         }
         /* Using cursor P003F56 */
         pr_default.execute(54, new Object[] {Byte.valueOf(A47AlbREst), A60AlbRUniUti, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(53);
   }

   public void S151( )
   {
      /* 'HISREO' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P003F57 */
      pr_default.execute(55, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREO");
      /* End optimized DELETE. */
   }

   public void S1232( )
   {
      /* 'DELETEALBREC' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P003F58 */
      pr_default.execute(56, new Object[] {A396EmprCod, Integer.valueOf(AV32AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
      /* End optimized DELETE. */
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbordis.this.A396EmprCod;
      this.aP1[0] = pbordis.this.AV15BarCod;
      this.aP2[0] = pbordis.this.AV16BarCodReo;
      this.aP3[0] = pbordis.this.AV17BarCodPar;
      this.aP4[0] = pbordis.this.AV18DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbordis");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22msg0 = "" ;
      AV46msg1 = "" ;
      AV72Station = "" ;
      GXt_char3 = "" ;
      AV70EmprNom = "" ;
      AV71UsurCod = "" ;
      AV77Noalmacenmalha = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P003F2_AV23Contador = new short[1] ;
      P003F3_A396EmprCod = new String[] {""} ;
      P003F3_A130BarCodPar = new String[] {""} ;
      P003F3_A132BarCodReo = new byte[1] ;
      P003F3_A129BarCod = new int[1] ;
      P003F3_A213BarSit = new byte[1] ;
      P003F3_A2826BarNumLot = new int[1] ;
      P003F3_A2010BarTipDis = new String[] {""} ;
      P003F3_A1799BarDibInt = new int[1] ;
      P003F3_A361DisCod = new int[1] ;
      P003F3_A365DisDes = new String[] {""} ;
      P003F3_A12811BarLocCol = new String[] {""} ;
      P003F3_A148BarEstReo = new byte[1] ;
      A130BarCodPar = "" ;
      A2010BarTipDis = "" ;
      A365DisDes = "" ;
      A12811BarLocCol = "" ;
      P003F4_A396EmprCod = new String[] {""} ;
      P003F4_A129BarCod = new int[1] ;
      P003F4_A132BarCodReo = new byte[1] ;
      P003F4_A130BarCodPar = new String[] {""} ;
      P003F4_A758ProCod = new String[] {""} ;
      P003F4_A761ProFasLin = new short[1] ;
      P003F4_n761ProFasLin = new boolean[] {false} ;
      A758ProCod = "" ;
      P003F5_A396EmprCod = new String[] {""} ;
      P003F5_A129BarCod = new int[1] ;
      P003F5_A132BarCodReo = new byte[1] ;
      P003F5_A130BarCodPar = new String[] {""} ;
      P003F5_A758ProCod = new String[] {""} ;
      P003F5_A194BarOrdLin = new short[1] ;
      P003F8_A396EmprCod = new String[] {""} ;
      P003F8_A129BarCod = new int[1] ;
      P003F8_A132BarCodReo = new byte[1] ;
      P003F8_A130BarCodPar = new String[] {""} ;
      P003F8_A758ProCod = new String[] {""} ;
      P003F8_A194BarOrdLin = new short[1] ;
      P003F8_A4643BarFasLot = new int[1] ;
      P003F12_A396EmprCod = new String[] {""} ;
      P003F12_A129BarCod = new int[1] ;
      P003F12_A132BarCodReo = new byte[1] ;
      P003F12_A130BarCodPar = new String[] {""} ;
      P003F12_A5322Dp_Nrecep = new int[1] ;
      P003F13_A396EmprCod = new String[] {""} ;
      P003F13_A129BarCod = new int[1] ;
      P003F13_A132BarCodReo = new byte[1] ;
      P003F13_A130BarCodPar = new String[] {""} ;
      P003F13_A5322Dp_Nrecep = new int[1] ;
      P003F13_A4344Dp_PzU = new int[1] ;
      P003F13_n4344Dp_PzU = new boolean[] {false} ;
      P003F13_A4982Dp_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003F13_n4982Dp_UnU = new boolean[] {false} ;
      P003F13_A4979Dp_Plg = new short[1] ;
      P003F13_A4978Dp_Ubi = new String[] {""} ;
      A4982Dp_UnU = DecimalUtil.ZERO ;
      A4978Dp_Ubi = "" ;
      P003F20_A396EmprCod = new String[] {""} ;
      P003F20_A5579XBarCodf = new int[1] ;
      P003F20_A5580XCodReof = new byte[1] ;
      P003F20_A5581XCodParf = new String[] {""} ;
      P003F20_A5575XTipColCod = new byte[1] ;
      P003F20_A5574XForColNum = new int[1] ;
      P003F20_A5573XForColNom = new String[] {""} ;
      P003F20_A5572XForSer = new String[] {""} ;
      P003F20_A5571XCliCodf = new int[1] ;
      P003F20_A5577XUltLinF = new short[1] ;
      P003F20_n5577XUltLinF = new boolean[] {false} ;
      A5581XCodParf = "" ;
      A5573XForColNom = "" ;
      A5572XForSer = "" ;
      AV66BarTipDis = "" ;
      AV31DisDes = "" ;
      AV73BarLocCol = "" ;
      P003F27_A396EmprCod = new String[] {""} ;
      P003F27_A361DisCod = new int[1] ;
      P003F27_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A375DisNumUni = DecimalUtil.ZERO ;
      AV63Tex_kgsp = DecimalUtil.ZERO ;
      P003F31_A396EmprCod = new String[] {""} ;
      P003F31_A130BarCodPar = new String[] {""} ;
      P003F31_A132BarCodReo = new byte[1] ;
      P003F31_A129BarCod = new int[1] ;
      P003F31_A671PieAgr = new short[1] ;
      P003F31_A119BarAgrCod = new int[1] ;
      P003F31_A124BarAgrReo = new byte[1] ;
      P003F31_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      AV59BarParAgr = "" ;
      AV74tab_albrec = new int[100] ;
      P003F38_A396EmprCod = new String[] {""} ;
      P003F38_A44AlbRecCod = new int[1] ;
      P003F38_A47AlbREst = new byte[1] ;
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      P003F39_A396EmprCod = new String[] {""} ;
      P003F39_A361DisCod = new int[1] ;
      P003F39_A392DisUniMed = new String[] {""} ;
      P003F39_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A392DisUniMed = "" ;
      AV26DisUniMed = "" ;
      AV68DisNumUni = DecimalUtil.ZERO ;
      P003F40_A396EmprCod = new String[] {""} ;
      P003F40_A44AlbRecCod = new int[1] ;
      P003F40_A361DisCod = new int[1] ;
      P003F41_A396EmprCod = new String[] {""} ;
      P003F41_A361DisCod = new int[1] ;
      P003F41_A758ProCod = new String[] {""} ;
      P003F41_A846UltFasLin = new short[1] ;
      P003F42_A396EmprCod = new String[] {""} ;
      P003F42_A361DisCod = new int[1] ;
      P003F42_A758ProCod = new String[] {""} ;
      P003F42_A368DisFasLin = new short[1] ;
      AV37termine = "" ;
      P003F52_A396EmprCod = new String[] {""} ;
      P003F52_A130BarCodPar = new String[] {""} ;
      P003F52_A132BarCodReo = new byte[1] ;
      P003F52_A129BarCod = new int[1] ;
      P003F52_A44AlbRecCod = new int[1] ;
      P003F52_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003F52_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003F52_A1501BarPiePie = new int[1] ;
      P003F52_A200BarPieCod = new String[] {""} ;
      AV38BarPieCod = "" ;
      AV39barpiekil = DecimalUtil.ZERO ;
      AV40barpiemet = DecimalUtil.ZERO ;
      GXv_int13 = new long[1] ;
      GXv_int7 = new int[1] ;
      P003F54_A396EmprCod = new String[] {""} ;
      P003F54_A361DisCod = new int[1] ;
      P003F54_A3608DisRefAlbR = new int[1] ;
      P003F54_n3608DisRefAlbR = new boolean[] {false} ;
      P003F54_A3398DisRefBarC = new int[1] ;
      P003F54_A3399DisRefBCRe = new byte[1] ;
      P003F54_A3400DisRefBCPa = new String[] {""} ;
      P003F54_A3607DisRefBPie = new String[] {""} ;
      P003F54_A3403DisRefPie = new short[1] ;
      P003F54_n3403DisRefPie = new boolean[] {false} ;
      P003F54_A3402DisRefMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003F54_n3402DisRefMts = new boolean[] {false} ;
      P003F54_A3401DisRefKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003F54_n3401DisRefKgs = new boolean[] {false} ;
      A3400DisRefBCPa = "" ;
      A3607DisRefBPie = "" ;
      A3402DisRefMts = DecimalUtil.ZERO ;
      A3401DisRefKgs = DecimalUtil.ZERO ;
      AV52RefBarPar = "" ;
      AV53RefCodPie = "" ;
      AV42BarPieLoc = "" ;
      AV28Metros = DecimalUtil.ZERO ;
      AV29Kilos = DecimalUtil.ZERO ;
      GXv_char18 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXv_char17 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int9 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_int19 = new short[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int20 = new short[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_char21 = new String[1] ;
      P003F55_A396EmprCod = new String[] {""} ;
      P003F55_A44AlbRecCod = new int[1] ;
      P003F55_A47AlbREst = new byte[1] ;
      P003F55_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P003F55_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbordis__default(),
         new Object[] {
             new Object[] {
            P003F2_AV23Contador
            }
            , new Object[] {
            P003F3_A396EmprCod, P003F3_A130BarCodPar, P003F3_A132BarCodReo, P003F3_A129BarCod, P003F3_A213BarSit, P003F3_A2826BarNumLot, P003F3_A2010BarTipDis, P003F3_A1799BarDibInt, P003F3_A361DisCod, P003F3_A365DisDes,
            P003F3_A12811BarLocCol, P003F3_A148BarEstReo
            }
            , new Object[] {
            P003F4_A396EmprCod, P003F4_A129BarCod, P003F4_A132BarCodReo, P003F4_A130BarCodPar, P003F4_A758ProCod, P003F4_A761ProFasLin, P003F4_n761ProFasLin
            }
            , new Object[] {
            P003F5_A396EmprCod, P003F5_A129BarCod, P003F5_A132BarCodReo, P003F5_A130BarCodPar, P003F5_A758ProCod, P003F5_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P003F8_A396EmprCod, P003F8_A129BarCod, P003F8_A132BarCodReo, P003F8_A130BarCodPar, P003F8_A758ProCod, P003F8_A194BarOrdLin, P003F8_A4643BarFasLot
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P003F12_A396EmprCod, P003F12_A129BarCod, P003F12_A132BarCodReo, P003F12_A130BarCodPar, P003F12_A5322Dp_Nrecep
            }
            , new Object[] {
            P003F13_A396EmprCod, P003F13_A129BarCod, P003F13_A132BarCodReo, P003F13_A130BarCodPar, P003F13_A5322Dp_Nrecep, P003F13_A4344Dp_PzU, P003F13_n4344Dp_PzU, P003F13_A4982Dp_UnU, P003F13_n4982Dp_UnU, P003F13_A4979Dp_Plg,
            P003F13_A4978Dp_Ubi
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P003F20_A396EmprCod, P003F20_A5579XBarCodf, P003F20_A5580XCodReof, P003F20_A5581XCodParf, P003F20_A5575XTipColCod, P003F20_A5574XForColNum, P003F20_A5573XForColNom, P003F20_A5572XForSer, P003F20_A5571XCliCodf, P003F20_A5577XUltLinF,
            P003F20_n5577XUltLinF
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P003F27_A396EmprCod, P003F27_A361DisCod, P003F27_A375DisNumUni
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P003F31_A396EmprCod, P003F31_A130BarCodPar, P003F31_A132BarCodReo, P003F31_A129BarCod, P003F31_A671PieAgr, P003F31_A119BarAgrCod, P003F31_A124BarAgrReo, P003F31_A122BarAgrPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P003F38_A396EmprCod, P003F38_A44AlbRecCod, P003F38_A47AlbREst
            }
            , new Object[] {
            P003F39_A396EmprCod, P003F39_A361DisCod, P003F39_A392DisUniMed, P003F39_A375DisNumUni
            }
            , new Object[] {
            P003F40_A396EmprCod, P003F40_A44AlbRecCod, P003F40_A361DisCod
            }
            , new Object[] {
            P003F41_A396EmprCod, P003F41_A361DisCod, P003F41_A758ProCod, P003F41_A846UltFasLin
            }
            , new Object[] {
            P003F42_A396EmprCod, P003F42_A361DisCod, P003F42_A758ProCod, P003F42_A368DisFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P003F52_A396EmprCod, P003F52_A130BarCodPar, P003F52_A132BarCodReo, P003F52_A129BarCod, P003F52_A44AlbRecCod, P003F52_A203BarPieKil, P003F52_A205BarPieMet, P003F52_A1501BarPiePie, P003F52_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            P003F54_A396EmprCod, P003F54_A361DisCod, P003F54_A3608DisRefAlbR, P003F54_n3608DisRefAlbR, P003F54_A3398DisRefBarC, P003F54_A3399DisRefBCRe, P003F54_A3400DisRefBCPa, P003F54_A3607DisRefBPie, P003F54_A3403DisRefPie, P003F54_n3403DisRefPie,
            P003F54_A3402DisRefMts, P003F54_n3402DisRefMts, P003F54_A3401DisRefKgs, P003F54_n3401DisRefKgs
            }
            , new Object[] {
            P003F55_A396EmprCod, P003F55_A44AlbRecCod, P003F55_A47AlbREst, P003F55_A60AlbRUniUti, P003F55_A58AlbRUniEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte AV27Flag1 ;
   private byte AV30Flag2 ;
   private byte AV44F_macros ;
   private byte AV45BajaPP ;
   private byte AV55PLinea ;
   private byte AV65Velta ;
   private byte AV60FasMin ;
   private byte AV61Texfina ;
   private byte AV64Lindalana ;
   private byte GXt_int2 ;
   private byte AV24BorDis ;
   private byte AV21Flag ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A148BarEstReo ;
   private byte A5580XCodReof ;
   private byte A5575XTipColCod ;
   private byte A124BarAgrReo ;
   private byte AV58BarReoAgr ;
   private byte AV105I ;
   private byte A47AlbREst ;
   private byte AV117GXLvl396 ;
   private byte A3399DisRefBCRe ;
   private byte AV51RefBarReo ;
   private byte GXv_int1[] ;
   private short AV23Contador ;
   private short cV23Contador ;
   private short A761ProFasLin ;
   private short A194BarOrdLin ;
   private short A4979Dp_Plg ;
   private short A5577XUltLinF ;
   private short A671PieAgr ;
   private short A846UltFasLin ;
   private short A368DisFasLin ;
   private short A3403DisRefPie ;
   private short AV43BarPieanc ;
   private short AV19Piezas ;
   private short GXv_int8[] ;
   private short GXv_int19[] ;
   private short GXv_int20[] ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int AV18DisCod ;
   private int A129BarCod ;
   private int A2826BarNumLot ;
   private int A1799BarDibInt ;
   private int A361DisCod ;
   private int AV62Tex_Nped ;
   private int A4643BarFasLot ;
   private int A5322Dp_Nrecep ;
   private int A4344Dp_PzU ;
   private int A5579XBarCodf ;
   private int A5574XForColNum ;
   private int A5571XCliCodf ;
   private int AV67BarDibInt ;
   private int AV25DisPos ;
   private int A119BarAgrCod ;
   private int AV57BarCodAgr ;
   private int AV74tab_albrec[] ;
   private int AV106Albreccoddelete ;
   private int A44AlbRecCod ;
   private int A1501BarPiePie ;
   private int AV32AlbRecCod ;
   private int GX_I ;
   private int AV41barpiepie ;
   private int GXv_int7[] ;
   private int A3608DisRefAlbR ;
   private int A3398DisRefBarC ;
   private int AV50RefBarCod ;
   private int GXv_int16[] ;
   private int GXv_int11[] ;
   private int GXv_int9[] ;
   private long GXv_int13[] ;
   private java.math.BigDecimal AV77Noalmacenmalha ;
   private java.math.BigDecimal A4982Dp_UnU ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal AV63Tex_kgsp ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV68DisNumUni ;
   private java.math.BigDecimal AV39barpiekil ;
   private java.math.BigDecimal AV40barpiemet ;
   private java.math.BigDecimal A3402DisRefMts ;
   private java.math.BigDecimal A3401DisRefKgs ;
   private java.math.BigDecimal AV28Metros ;
   private java.math.BigDecimal AV29Kilos ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String AV22msg0 ;
   private String AV46msg1 ;
   private String AV72Station ;
   private String GXt_char3 ;
   private String AV70EmprNom ;
   private String AV71UsurCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A2010BarTipDis ;
   private String A365DisDes ;
   private String A12811BarLocCol ;
   private String A758ProCod ;
   private String A4978Dp_Ubi ;
   private String A5581XCodParf ;
   private String A5573XForColNom ;
   private String A5572XForSer ;
   private String AV66BarTipDis ;
   private String AV31DisDes ;
   private String AV73BarLocCol ;
   private String A122BarAgrPar ;
   private String AV59BarParAgr ;
   private String A200BarPieCod ;
   private String A392DisUniMed ;
   private String AV26DisUniMed ;
   private String AV37termine ;
   private String AV38BarPieCod ;
   private String A3400DisRefBCPa ;
   private String A3607DisRefBPie ;
   private String AV52RefBarPar ;
   private String AV53RefCodPie ;
   private String AV42BarPieLoc ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char21[] ;
   private boolean n761ProFasLin ;
   private boolean n4344Dp_PzU ;
   private boolean n4982Dp_UnU ;
   private boolean n5577XUltLinF ;
   private boolean returnInSub ;
   private boolean n3608DisRefAlbR ;
   private boolean n3403DisRefPie ;
   private boolean n3402DisRefMts ;
   private boolean n3401DisRefKgs ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P003F2_AV23Contador ;
   private String[] P003F3_A396EmprCod ;
   private String[] P003F3_A130BarCodPar ;
   private byte[] P003F3_A132BarCodReo ;
   private int[] P003F3_A129BarCod ;
   private byte[] P003F3_A213BarSit ;
   private int[] P003F3_A2826BarNumLot ;
   private String[] P003F3_A2010BarTipDis ;
   private int[] P003F3_A1799BarDibInt ;
   private int[] P003F3_A361DisCod ;
   private String[] P003F3_A365DisDes ;
   private String[] P003F3_A12811BarLocCol ;
   private byte[] P003F3_A148BarEstReo ;
   private String[] P003F4_A396EmprCod ;
   private int[] P003F4_A129BarCod ;
   private byte[] P003F4_A132BarCodReo ;
   private String[] P003F4_A130BarCodPar ;
   private String[] P003F4_A758ProCod ;
   private short[] P003F4_A761ProFasLin ;
   private boolean[] P003F4_n761ProFasLin ;
   private String[] P003F5_A396EmprCod ;
   private int[] P003F5_A129BarCod ;
   private byte[] P003F5_A132BarCodReo ;
   private String[] P003F5_A130BarCodPar ;
   private String[] P003F5_A758ProCod ;
   private short[] P003F5_A194BarOrdLin ;
   private String[] P003F8_A396EmprCod ;
   private int[] P003F8_A129BarCod ;
   private byte[] P003F8_A132BarCodReo ;
   private String[] P003F8_A130BarCodPar ;
   private String[] P003F8_A758ProCod ;
   private short[] P003F8_A194BarOrdLin ;
   private int[] P003F8_A4643BarFasLot ;
   private String[] P003F12_A396EmprCod ;
   private int[] P003F12_A129BarCod ;
   private byte[] P003F12_A132BarCodReo ;
   private String[] P003F12_A130BarCodPar ;
   private int[] P003F12_A5322Dp_Nrecep ;
   private String[] P003F13_A396EmprCod ;
   private int[] P003F13_A129BarCod ;
   private byte[] P003F13_A132BarCodReo ;
   private String[] P003F13_A130BarCodPar ;
   private int[] P003F13_A5322Dp_Nrecep ;
   private int[] P003F13_A4344Dp_PzU ;
   private boolean[] P003F13_n4344Dp_PzU ;
   private java.math.BigDecimal[] P003F13_A4982Dp_UnU ;
   private boolean[] P003F13_n4982Dp_UnU ;
   private short[] P003F13_A4979Dp_Plg ;
   private String[] P003F13_A4978Dp_Ubi ;
   private String[] P003F20_A396EmprCod ;
   private int[] P003F20_A5579XBarCodf ;
   private byte[] P003F20_A5580XCodReof ;
   private String[] P003F20_A5581XCodParf ;
   private byte[] P003F20_A5575XTipColCod ;
   private int[] P003F20_A5574XForColNum ;
   private String[] P003F20_A5573XForColNom ;
   private String[] P003F20_A5572XForSer ;
   private int[] P003F20_A5571XCliCodf ;
   private short[] P003F20_A5577XUltLinF ;
   private boolean[] P003F20_n5577XUltLinF ;
   private String[] P003F27_A396EmprCod ;
   private int[] P003F27_A361DisCod ;
   private java.math.BigDecimal[] P003F27_A375DisNumUni ;
   private String[] P003F31_A396EmprCod ;
   private String[] P003F31_A130BarCodPar ;
   private byte[] P003F31_A132BarCodReo ;
   private int[] P003F31_A129BarCod ;
   private short[] P003F31_A671PieAgr ;
   private int[] P003F31_A119BarAgrCod ;
   private byte[] P003F31_A124BarAgrReo ;
   private String[] P003F31_A122BarAgrPar ;
   private String[] P003F38_A396EmprCod ;
   private int[] P003F38_A44AlbRecCod ;
   private byte[] P003F38_A47AlbREst ;
   private String[] P003F39_A396EmprCod ;
   private int[] P003F39_A361DisCod ;
   private String[] P003F39_A392DisUniMed ;
   private java.math.BigDecimal[] P003F39_A375DisNumUni ;
   private String[] P003F40_A396EmprCod ;
   private int[] P003F40_A44AlbRecCod ;
   private int[] P003F40_A361DisCod ;
   private String[] P003F41_A396EmprCod ;
   private int[] P003F41_A361DisCod ;
   private String[] P003F41_A758ProCod ;
   private short[] P003F41_A846UltFasLin ;
   private String[] P003F42_A396EmprCod ;
   private int[] P003F42_A361DisCod ;
   private String[] P003F42_A758ProCod ;
   private short[] P003F42_A368DisFasLin ;
   private String[] P003F52_A396EmprCod ;
   private String[] P003F52_A130BarCodPar ;
   private byte[] P003F52_A132BarCodReo ;
   private int[] P003F52_A129BarCod ;
   private int[] P003F52_A44AlbRecCod ;
   private java.math.BigDecimal[] P003F52_A203BarPieKil ;
   private java.math.BigDecimal[] P003F52_A205BarPieMet ;
   private int[] P003F52_A1501BarPiePie ;
   private String[] P003F52_A200BarPieCod ;
   private String[] P003F54_A396EmprCod ;
   private int[] P003F54_A361DisCod ;
   private int[] P003F54_A3608DisRefAlbR ;
   private boolean[] P003F54_n3608DisRefAlbR ;
   private int[] P003F54_A3398DisRefBarC ;
   private byte[] P003F54_A3399DisRefBCRe ;
   private String[] P003F54_A3400DisRefBCPa ;
   private String[] P003F54_A3607DisRefBPie ;
   private short[] P003F54_A3403DisRefPie ;
   private boolean[] P003F54_n3403DisRefPie ;
   private java.math.BigDecimal[] P003F54_A3402DisRefMts ;
   private boolean[] P003F54_n3402DisRefMts ;
   private java.math.BigDecimal[] P003F54_A3401DisRefKgs ;
   private boolean[] P003F54_n3401DisRefKgs ;
   private String[] P003F55_A396EmprCod ;
   private int[] P003F55_A44AlbRecCod ;
   private byte[] P003F55_A47AlbREst ;
   private java.math.BigDecimal[] P003F55_A60AlbRUniUti ;
   private java.math.BigDecimal[] P003F55_A58AlbRUniEnt ;
}

final  class pbordis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003F2", "SELECT COUNT(*) FROM TXPDISBAR WHERE EmprCod = ? and DisDisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P003F3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSit, BarNumLot, BarTipDis, BarDibInt, DisCod, DisDes, BarLocCol, BarEstReo FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P003F4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P003F5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P003F6", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P003F7", "DELETE FROM TXPBarPar  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
         ,new ForEachCursor("P003F8", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P003F9", "DELETE FROM TXPFASPFA  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and BarFasLot = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASPFA")
         ,new UpdateCursor("P003F10", "DELETE FROM TXPFASMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASMAQ")
         ,new UpdateCursor("P003F11", "DELETE FROM TXPFASQUI  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new ForEachCursor("P003F12", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P003F13", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep, Dp_PzU, Dp_UnU, Dp_Plg, Dp_Ubi FROM TXPUBIDPG WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and Dp_Nrecep = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep, Dp_Ubi, Dp_Plg ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P003F14", "DELETE FROM TXPUBIDPG  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ? AND Dp_Ubi = ? AND Dp_Plg = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUBIDPG")
         ,new UpdateCursor("P003F15", "DELETE FROM TXPUBIDEP  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUBIDEP")
         ,new UpdateCursor("P003F16", "DELETE FROM TXPBARPRO  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
         ,new UpdateCursor("P003F17", "DELETE FROM TXPBARNOT  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
         ,new UpdateCursor("P003F18", "DELETE FROM TXPBARAUD  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAUD")
         ,new UpdateCursor("P003F19", "DELETE FROM TXPLMACRO  WHERE EmprCod = ? and MacBarCod = ? and MacBarReo = ? and MacBarPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMACRO")
         ,new ForEachCursor("P003F20", "SELECT Emprcod, XBarCodf, XCodReof, XCodParf, XTipColCod, XForColNum, XForColNom, XForSer, XCliCodf, XUltLinF FROM TXPXLFORM WHERE Emprcod = ? and XBarCodf = ? and XCodReof = ? and XCodParf = ? ORDER BY Emprcod, XBarCodf, XCodReof, XCodParf ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P003F21", "DELETE FROM TXPXLFOR1  WHERE EmprCod = ? and XCliCodf = ? and XForSer = ? and XForColNom = ? and XForColNum = ? and XTipColCod = ? and XBarCodf = ? and XCodReof = ? and XCodParf = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXLFOR1")
         ,new UpdateCursor("P003F22", "DELETE FROM TXPXLFORM  WHERE Emprcod = ? AND XCliCodf = ? AND XForSer = ? AND XForColNom = ? AND XForColNum = ? AND XTipColCod = ? AND XBarCodf = ? AND XCodReof = ? AND XCodParf = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXLFORM")
         ,new UpdateCursor("P003F23", "DELETE FROM TXPPLLBar  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPLLBar")
         ,new UpdateCursor("P003F24", "DELETE FROM TXPBARCOM  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
         ,new UpdateCursor("P003F25", "DELETE FROM TXPDIGBAR  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDIGBAR")
         ,new UpdateCursor("P003F26", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P003F27", "SELECT EmprCod, DisCod, DisNumUni FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P003F28", "DELETE FROM TXPDISDEF  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISDEF")
         ,new UpdateCursor("P003F29", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P003F30", "DELETE FROM TXPDISBAR  WHERE EmprCod = ? and DisDisCod = ? and DisBarCod = ? and DisBarReo = ? and DisBarPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISBAR")
         ,new ForEachCursor("P003F31", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, PieAgr, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P003F32", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new UpdateCursor("P003F33", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? and BarAgrCod = ? and BarAgrReo = ? and BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new UpdateCursor("P003F34", "DELETE FROM TXPBARPEG  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPEG")
         ,new UpdateCursor("P003F35", "DELETE FROM TXPBARPEG  WHERE EmprCod = ? and BarPegCod = ? and BarPegReo = ? and BarPegPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPEG")
         ,new UpdateCursor("P003F36", "DELETE FROM TXPBARFOA  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFOA")
         ,new UpdateCursor("P003F37", "DELETE FROM TXPBARFOA  WHERE EmprCod = ? and BarFoaCod = ? and BarFoaReo = ? and BarFoaPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFOA")
         ,new ForEachCursor("P003F38", "SELECT EmprCod, AlbRecCod, AlbREst FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P003F39", "SELECT EmprCod, DisCod, DisUniMed, DisNumUni FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P003F40", "SELECT EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P003F41", "SELECT EmprCod, DisCod, ProCod, UltFasLin FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P003F42", "SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P003F43", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new UpdateCursor("P003F44", "DELETE FROM TXPDISPAR  WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new UpdateCursor("P003F45", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new UpdateCursor("P003F46", "DELETE FROM TXPOBSERV  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new UpdateCursor("P003F47", "DELETE FROM TXPDISCOM  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISCOM")
         ,new UpdateCursor("P003F48", "DELETE FROM TXPDIGCOM  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDIGCOM")
         ,new UpdateCursor("P003F49", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
         ,new UpdateCursor("P003F50", "DELETE FROM TXPDISALD  WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P003F51", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new ForEachCursor("P003F52", "SELECT * FROM (SELECT EmprCod, BarCodPar, BarCodReo, BarCod, AlbRecCod, BarPieKil, BarPieMet, BarPiePie, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P003F53", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P003F54", "SELECT EmprCod, DisCod, DisRefAlbR, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie, DisRefPie, DisRefMts, DisRefKgs FROM TXPDISREF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P003F55", "SELECT EmprCod, AlbRecCod, AlbREst, AlbRUniUti, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P003F56", "UPDATE TXPALBREC SET AlbREst=?, AlbRUniUti=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P003F57", "DELETE FROM TXPHISREO  WHERE EmprCod = ? and HisBarCod = ? and HisCodReo = ? and HisCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISREO")
         ,new UpdateCursor("P003F58", "DELETE FROM TXPALBREC  WHERE EmprCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 10);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 10);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 10);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 54 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

