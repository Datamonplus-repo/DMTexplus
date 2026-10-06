package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcls012 extends GXProcedure
{
   public pcls012( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcls012.class ), "" );
   }

   public pcls012( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     String[] aP3 ,
                                     java.math.BigDecimal[] aP4 ,
                                     java.math.BigDecimal[] aP5 ,
                                     java.math.BigDecimal[] aP6 ,
                                     java.math.BigDecimal[] aP7 ,
                                     java.math.BigDecimal[] aP8 ,
                                     java.math.BigDecimal[] aP9 ,
                                     String[] aP10 ,
                                     int[] aP11 ,
                                     short[] aP12 ,
                                     String[] aP13 ,
                                     short[] aP14 ,
                                     int[] aP15 ,
                                     String[] aP16 ,
                                     java.math.BigDecimal[] aP17 ,
                                     java.math.BigDecimal[] aP18 )
   {
      pcls012.this.aP19 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19);
      return aP19[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        String[] aP10 ,
                        int[] aP11 ,
                        short[] aP12 ,
                        String[] aP13 ,
                        short[] aP14 ,
                        int[] aP15 ,
                        String[] aP16 ,
                        java.math.BigDecimal[] aP17 ,
                        java.math.BigDecimal[] aP18 ,
                        java.util.Date[] aP19 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             int[] aP15 ,
                             String[] aP16 ,
                             java.math.BigDecimal[] aP17 ,
                             java.math.BigDecimal[] aP18 ,
                             java.util.Date[] aP19 )
   {
      pcls012.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcls012.this.AV45BarCod = aP1[0];
      this.aP1 = aP1;
      pcls012.this.AV47BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcls012.this.AV46BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcls012.this.AV53BarCosPD = aP4[0];
      this.aP4 = aP4;
      pcls012.this.AV49BarCosAD = aP5[0];
      this.aP5 = aP5;
      pcls012.this.AV48BarCosAA = aP6[0];
      this.aP6 = aP6;
      pcls012.this.AV52BarCosPA = aP7[0];
      this.aP7 = aP7;
      pcls012.this.AV51BarCosCol = aP8[0];
      this.aP8 = aP8;
      pcls012.this.AV50BarCosAnc = aP9[0];
      this.aP9 = aP9;
      pcls012.this.AV44BarAgrLot = aP10[0];
      this.aP10 = aP10;
      pcls012.this.AV56BarNumTin = aP11[0];
      this.aP11 = aP11;
      pcls012.this.AV93UltLin = aP12[0];
      this.aP12 = aP12;
      pcls012.this.AV80RecAcab = aP13[0];
      this.aP13 = aP13;
      pcls012.this.AV81recLinMaq = aP14[0];
      this.aP14 = aP14;
      pcls012.this.AV87RecVolPrd = aP15[0];
      this.aP15 = aP15;
      pcls012.this.AV75MaqCod = aP16[0];
      this.aP16 = aP16;
      pcls012.this.AV85RecTotKgs = aP17[0];
      this.aP17 = aP17;
      pcls012.this.AV86RecTotMts = aP18[0];
      this.aP18 = aP18;
      pcls012.this.AV95FechaCierre = aP19[0];
      this.aP19 = aP19;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV73KgsRea ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KGSREA", ""), GXv_int1) ;
      pcls012.this.AV73KgsRea = GXv_int1[0] ;
      GXv_int1[0] = AV88Samofil ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SAMOFI", ""), GXv_int1) ;
      pcls012.this.AV88Samofil = GXv_int1[0] ;
      GXt_int2 = (int)(DecimalUtil.decToDouble(AV60Costem3)) ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "MT3H2O", "") ;
      GXv_int5[0] = GXt_int2 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_int5) ;
      pcls012.this.A396EmprCod = GXv_char3[0] ;
      pcls012.this.GXt_int2 = GXv_int5[0] ;
      AV60Costem3 = DecimalUtil.doubleToDec(GXt_int2) ;
      AV60Costem3 = AV60Costem3.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      GXt_int6 = (byte)(AV97actcostecolor) ;
      GXv_int1[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CORCOS", ""), GXv_int1) ;
      pcls012.this.GXt_int6 = GXv_int1[0] ;
      AV97actcostecolor = GXt_int6 ;
      GXt_int2 = AV96rbcolor ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CORCOS", "") ;
      GXv_int5[0] = GXt_int2 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5) ;
      pcls012.this.A396EmprCod = GXv_char4[0] ;
      pcls012.this.GXt_int2 = GXv_int5[0] ;
      AV96rbcolor = (short)(GXt_int2) ;
      AV91TotKgs = DecimalUtil.doubleToDec(0) ;
      AV94TotMts = DecimalUtil.doubleToDec(0) ;
      AV74Linea = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 18, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( "Actualizo Tabla LCONTI, HDR= ", "") ;
      AV54BarLts = 0 ;
      /* Using cursor P055V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV45BarCod), Byte.valueOf(AV47BarCodReo), AV46BarCodPar, Short.valueOf(AV81recLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P055V2_A2804RecLinMaq[0] ;
         A130BarCodPar = P055V2_A130BarCodPar[0] ;
         A132BarCodReo = P055V2_A132BarCodReo[0] ;
         A129BarCod = P055V2_A129BarCod[0] ;
         A4259RecTotKgs = P055V2_A4259RecTotKgs[0] ;
         A4260RecTotMts = P055V2_A4260RecTotMts[0] ;
         n4260RecTotMts = P055V2_n4260RecTotMts[0] ;
         A4268RecOrdLin = P055V2_A4268RecOrdLin[0] ;
         n4268RecOrdLin = P055V2_n4268RecOrdLin[0] ;
         A4258RecMaqFas = P055V2_A4258RecMaqFas[0] ;
         n4258RecMaqFas = P055V2_n4258RecMaqFas[0] ;
         A5110RecNumPrg = P055V2_A5110RecNumPrg[0] ;
         AV91TotKgs = ((A4259RecTotKgs.doubleValue()>0) ? A4259RecTotKgs : AV91TotKgs) ;
         AV94TotMts = ((A4260RecTotMts.doubleValue()>0) ? A4260RecTotMts : AV94TotMts) ;
         AV84RecOrdlin = A4268RecOrdLin ;
         AV82RecMaqFas = A4258RecMaqFas ;
         AV83RecNumPrg = A5110RecNumPrg ;
         /* Using cursor P055V3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A10544RecNH2O = P055V3_A10544RecNH2O[0] ;
            A4695RecVolPrf = P055V3_A4695RecVolPrf[0] ;
            A1273RecLinPro = P055V3_A1273RecLinPro[0] ;
            AV54BarLts = (int)(AV54BarLts+((A4695RecVolPrf*A10544RecNH2O))) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV54BarLts > 99999 )
      {
         AV54BarLts = 0 ;
      }
      AV58Cargo_1 = (byte)(0) ;
      /* Using cursor P055V6 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV45BarCod), Byte.valueOf(AV47BarCodReo), AV46BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P055V6_A361DisCod[0] ;
         A129BarCod = P055V6_A129BarCod[0] ;
         A132BarCodReo = P055V6_A132BarCodReo[0] ;
         A130BarCodPar = P055V6_A130BarCodPar[0] ;
         A212BarSer = P055V6_A212BarSer[0] ;
         A1652BarSerDsc = P055V6_A1652BarSerDsc[0] ;
         A217BarTipArt = P055V6_A217BarTipArt[0] ;
         n217BarTipArt = P055V6_n217BarTipArt[0] ;
         A135BarColNom = P055V6_A135BarColNom[0] ;
         A136BarColNum = P055V6_A136BarColNum[0] ;
         A218BarTipCol = P055V6_A218BarTipCol[0] ;
         A180BarMaqCod = P055V6_A180BarMaqCod[0] ;
         A236BarVolMaq = P055V6_A236BarVolMaq[0] ;
         A148BarEstReo = P055V6_A148BarEstReo[0] ;
         A189BarNumAny = P055V6_A189BarNumAny[0] ;
         A833TipDefCod = P055V6_A833TipDefCod[0] ;
         n833TipDefCod = P055V6_n833TipDefCod[0] ;
         A209BarPri = P055V6_A209BarPri[0] ;
         A4975BarNumReo = P055V6_A4975BarNumReo[0] ;
         A2010BarTipDis = P055V6_A2010BarTipDis[0] ;
         A5291BarTipCor = P055V6_A5291BarTipCor[0] ;
         A118BarAcaQui = P055V6_A118BarAcaQui[0] ;
         A4812BarEncCli = P055V6_A4812BarEncCli[0] ;
         A143BarDisNum = P055V6_A143BarDisNum[0] ;
         A4466BarAcaAnh = P055V6_A4466BarAcaAnh[0] ;
         A2829BarProPer = P055V6_A2829BarProPer[0] ;
         A252CliCod = P055V6_A252CliCod[0] ;
         n252CliCod = P055V6_n252CliCod[0] ;
         A159BarFecGen = P055V6_A159BarFecGen[0] ;
         A184BarMtr = P055V6_A184BarMtr[0] ;
         A870BarTotMtr = P055V6_A870BarTotMtr[0] ;
         A166BarKgm = P055V6_A166BarKgm[0] ;
         A219BarTotAgr = P055V6_A219BarTotAgr[0] ;
         A199BarPie1 = P055V6_A199BarPie1[0] ;
         A365DisDes = P055V6_A365DisDes[0] ;
         A898BarPieNDes = P055V6_A898BarPieNDes[0] ;
         A184BarMtr = P055V6_A184BarMtr[0] ;
         A166BarKgm = P055V6_A166BarKgm[0] ;
         A199BarPie1 = P055V6_A199BarPie1[0] ;
         A898BarPieNDes = P055V6_A898BarPieNDes[0] ;
         A870BarTotMtr = P055V6_A870BarTotMtr[0] ;
         A219BarTotAgr = P055V6_A219BarTotAgr[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         if ( A870BarTotMtr.doubleValue() != 0 )
         {
            A871RecTotMtr = A870BarTotMtr.add(A184BarMtr) ;
         }
         else
         {
            A871RecTotMtr = A184BarMtr ;
         }
         if ( A219BarTotAgr.doubleValue() != 0 )
         {
            A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
         }
         else
         {
            A812RecTotKgm = A166BarKgm ;
         }
         AV91TotKgs = ((AV91TotKgs.doubleValue()==0) ? A812RecTotKgm : AV91TotKgs) ;
         AV94TotMts = ((AV94TotMts.doubleValue()==0) ? A871RecTotMtr : AV94TotMts) ;
         if ( AV88Samofil == 0 )
         {
            AV61Dia = (byte)(GXutil.day( AV95FechaCierre)) ;
            AV76Mes = (byte)(GXutil.month( AV95FechaCierre)) ;
            AV43Any = (short)(GXutil.year( AV95FechaCierre)) ;
         }
         else
         {
            AV61Dia = (byte)(GXutil.day( A159BarFecGen)) ;
            AV76Mes = (byte)(GXutil.month( A159BarFecGen)) ;
            AV43Any = (short)(GXutil.year( A159BarFecGen)) ;
         }
         AV59CliCod = A252CliCod ;
         AV69ForSer = A212BarSer ;
         AV65ForColNom = A135BarColNom ;
         AV66ForColNum = A136BarColNum ;
         AV89TipColCod = A218BarTipCol ;
         /* Execute user subroutine: 'COLOR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P055V7 */
         pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(AV43Any), Byte.valueOf(AV76Mes), Byte.valueOf(AV61Dia)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A3648EstTinDia = P055V7_A3648EstTinDia[0] ;
            A3647EstTinMes = P055V7_A3647EstTinMes[0] ;
            A3646EstTinAny = P055V7_A3646EstTinAny[0] ;
            A3649EstTinUL = P055V7_A3649EstTinUL[0] ;
            n3649EstTinUL = P055V7_n3649EstTinUL[0] ;
            AV93UltLin = A3649EstTinUL ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         AV93UltLin = (short)(AV93UltLin+1) ;
         /*
            INSERT RECORD ON TABLE TXPCONTIN

         */
         A3646EstTinAny = AV43Any ;
         A3647EstTinMes = AV76Mes ;
         A3648EstTinDia = AV61Dia ;
         A3649EstTinUL = AV93UltLin ;
         n3649EstTinUL = false ;
         /* Using cursor P055V8 */
         pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Boolean.valueOf(n3649EstTinUL), Short.valueOf(A3649EstTinUL)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONTIN");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            n3649EstTinUL = false ;
            /* Optimized UPDATE. */
            /* Using cursor P055V9 */
            pr_default.execute(5, new Object[] {Boolean.valueOf(n3649EstTinUL), Short.valueOf(AV93UltLin), A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONTIN");
            /* End optimized UPDATE. */
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         /*
            INSERT RECORD ON TABLE TXPLCONTI

         */
         A3646EstTinAny = AV43Any ;
         A3647EstTinMes = AV76Mes ;
         A3648EstTinDia = AV61Dia ;
         A1929EstTinNr = AV93UltLin ;
         A1933BarCodTin = A129BarCod ;
         n1933BarCodTin = false ;
         A1934BarReoTin = A132BarCodReo ;
         n1934BarReoTin = false ;
         A1935BarParTin = A130BarCodPar ;
         n1935BarParTin = false ;
         A1936BarSerTin = A212BarSer ;
         n1936BarSerTin = false ;
         A1937BarDscTin = A1652BarSerDsc ;
         n1937BarDscTin = false ;
         A1939BarArtTin = A217BarTipArt ;
         n1939BarArtTin = false ;
         A1940BarColNoT = A135BarColNom ;
         n1940BarColNoT = false ;
         A1941BarColNuT = A136BarColNum ;
         n1941BarColNuT = false ;
         A1942BarTipCoT = A218BarTipCol ;
         n1942BarTipCoT = false ;
         A1943BarNomClT = AV55BarNomClT ;
         n1943BarNomClT = false ;
         A1944BarNumClT = AV57BarNunClT ;
         n1944BarNumClT = false ;
         A1945BarMaqTin = A180BarMaqCod ;
         n1945BarMaqTin = false ;
         if ( ! (GXutil.strcmp("", AV75MaqCod)==0) )
         {
            A1945BarMaqTin = AV75MaqCod ;
            n1945BarMaqTin = false ;
         }
         A1946BarVolTin = A236BarVolMaq ;
         n1946BarVolTin = false ;
         if ( AV87RecVolPrd > 0 )
         {
            A1946BarVolTin = AV87RecVolPrd ;
            n1946BarVolTin = false ;
         }
         A1947BarKgmTin = ((AV73KgsRea==1) ? AV85RecTotKgs : A166BarKgm) ;
         n1947BarKgmTin = false ;
         A1948BarMtrTin = ((AV73KgsRea==1) ? AV86RecTotMts : A184BarMtr) ;
         n1948BarMtrTin = false ;
         if ( ( AV91TotKgs.doubleValue() > 0 ) && ( A166BarKgm.doubleValue() == 0 ) )
         {
            A1947BarKgmTin = AV91TotKgs ;
            n1947BarKgmTin = false ;
         }
         A1949BarPieTin = A198BarPie ;
         n1949BarPieTin = false ;
         A2304BarEstTin = A148BarEstReo ;
         n2304BarEstTin = false ;
         A2316BarAgrLot = AV44BarAgrLot ;
         n2316BarAgrLot = false ;
         A3650BarNumAna = A189BarNumAny ;
         n3650BarNumAna = false ;
         A3651BarTipDef = A833TipDefCod ;
         n3651BarTipDef = false ;
         A3652BarIntens = AV70IntCod ;
         n3652BarIntens = false ;
         A3653BarPriCod = A209BarPri ;
         n3653BarPriCod = false ;
         A3654BarCosPD = AV53BarCosPD ;
         n3654BarCosPD = false ;
         A3656BarCosAD = AV49BarCosAD ;
         n3656BarCosAD = false ;
         A3657BarCosAA = AV48BarCosAA ;
         n3657BarCosAA = false ;
         A3658BarCosPA = AV52BarCosPA ;
         n3658BarCosPA = false ;
         A3705BarCosCol = AV51BarCosCol ;
         n3705BarCosCol = false ;
         A3706BarCosAnc = AV50BarCosAnc ;
         n3706BarCosAnc = false ;
         A4977BarReoNum = A4975BarNumReo ;
         n4977BarReoNum = false ;
         A5169BarTipDTin = A2010BarTipDis ;
         n5169BarTipDTin = false ;
         A5170BarTipCTin = A5291BarTipCor ;
         n5170BarTipCTin = false ;
         A5899BarCosttTi = AV67ForCosForm ;
         n5899BarCosttTi = false ;
         if ( (0==AV97actcostecolor) )
         {
            A5899BarCosttTi = AV67ForCosForm ;
            n5899BarCosttTi = false ;
         }
         else
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int5[0] = AV59CliCod ;
            GXv_char3[0] = AV69ForSer ;
            GXv_char7[0] = AV65ForColNom ;
            GXv_int8[0] = AV66ForColNum ;
            GXv_int1[0] = AV89TipColCod ;
            GXv_decimal9[0] = DecimalUtil.doubleToDec(1) ;
            GXv_int10[0] = AV96rbcolor ;
            GXv_char11[0] = " " ;
            GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
            new app.psimulax(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char7, GXv_int8, GXv_int1, GXv_decimal9, GXv_int10, GXv_char11, GXv_decimal12) ;
            pcls012.this.A396EmprCod = GXv_char4[0] ;
            pcls012.this.AV59CliCod = GXv_int5[0] ;
            pcls012.this.AV69ForSer = GXv_char3[0] ;
            pcls012.this.AV65ForColNom = GXv_char7[0] ;
            pcls012.this.AV66ForColNum = GXv_int8[0] ;
            pcls012.this.AV89TipColCod = GXv_int1[0] ;
            pcls012.this.AV96rbcolor = (short)((short)(GXv_int10[0])) ;
            GXv_char11[0] = A396EmprCod ;
            GXv_char7[0] = AV98Station ;
            GXv_decimal12[0] = AV67ForCosForm ;
            new app.pcoscor(remoteHandle, context).execute( GXv_char11, GXv_char7, GXv_decimal12) ;
            pcls012.this.A396EmprCod = GXv_char11[0] ;
            pcls012.this.AV98Station = GXv_char7[0] ;
            pcls012.this.AV67ForCosForm = GXv_decimal12[0] ;
            A5899BarCosttTi = AV67ForCosForm ;
            n5899BarCosttTi = false ;
         }
         A5900BarRbTeo = AV96rbcolor ;
         n5900BarRbTeo = false ;
         A6177BarNumTin = AV56BarNumTin ;
         n6177BarNumTin = false ;
         A6634BarRecAcb = AV80RecAcab ;
         n6634BarRecAcb = false ;
         A4923BarNumActx = AV81recLinMaq ;
         n4923BarNumActx = false ;
         A8563BarKgsTt = AV91TotKgs ;
         n8563BarKgsTt = false ;
         A12993BarMtsTt = AV94TotMts ;
         n12993BarMtsTt = false ;
         A8584FamCodT = AV63Fam_cod ;
         n8584FamCodT = false ;
         A9754BarNTint = (byte)(0) ;
         n9754BarNTint = false ;
         if ( GXutil.strcmp(AV44BarAgrLot, GXutil.str( AV45BarCod, 8, 0)+GXutil.str( AV47BarCodReo, 1, 0)+AV46BarCodPar) == 0 )
         {
            A9754BarNTint = (byte)(1) ;
            n9754BarNTint = false ;
         }
         A4926BarFaseOrd = AV84RecOrdlin ;
         n4926BarFaseOrd = false ;
         A4925BarFaseCod = AV82RecMaqFas ;
         n4925BarFaseCod = false ;
         A10539BarAcs = A118BarAcaQui ;
         n10539BarAcs = false ;
         A10540BarNprg = AV83RecNumPrg ;
         n10540BarNprg = false ;
         A10541BarLts = AV54BarLts ;
         n10541BarLts = false ;
         A10546BarLtsV = GXutil.roundDecimal( DecimalUtil.doubleToDec(AV54BarLts).multiply(AV60Costem3), 2).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         n10546BarLtsV = false ;
         A11762BarDispCli = ((GXutil.strcmp(A143BarDisNum, " ")!=0) ? A143BarDisNum : A4812BarEncCli) ;
         n11762BarDispCli = false ;
         A13759EstFecCier = AV95FechaCierre ;
         A13760EstCdn1 = A4466BarAcaAnh ;
         A13761EstCdn2 = GXutil.substring( A2829BarProPer, 1, 4) ;
         A13762EstCtw = GXutil.substring( A2829BarProPer, 1, 4) ;
         /* Using cursor P055V10 */
         pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr), Boolean.valueOf(n1933BarCodTin), Integer.valueOf(A1933BarCodTin), Boolean.valueOf(n1934BarReoTin), Byte.valueOf(A1934BarReoTin), Boolean.valueOf(n1935BarParTin), A1935BarParTin, Boolean.valueOf(n1936BarSerTin), A1936BarSerTin, Boolean.valueOf(n1937BarDscTin), A1937BarDscTin, Boolean.valueOf(n1939BarArtTin), Short.valueOf(A1939BarArtTin), Boolean.valueOf(n1940BarColNoT), A1940BarColNoT, Boolean.valueOf(n1941BarColNuT), Integer.valueOf(A1941BarColNuT), Boolean.valueOf(n1942BarTipCoT), Byte.valueOf(A1942BarTipCoT), Boolean.valueOf(n1943BarNomClT), A1943BarNomClT, Boolean.valueOf(n1944BarNumClT), Integer.valueOf(A1944BarNumClT), Boolean.valueOf(n1945BarMaqTin), A1945BarMaqTin, Boolean.valueOf(n1946BarVolTin), Integer.valueOf(A1946BarVolTin), Boolean.valueOf(n1947BarKgmTin), A1947BarKgmTin, Boolean.valueOf(n1948BarMtrTin), A1948BarMtrTin, Boolean.valueOf(n1949BarPieTin), Integer.valueOf(A1949BarPieTin), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n2304BarEstTin), Byte.valueOf(A2304BarEstTin), Boolean.valueOf(n2316BarAgrLot), A2316BarAgrLot, Boolean.valueOf(n3650BarNumAna), Short.valueOf(A3650BarNumAna), Boolean.valueOf(n3651BarTipDef), Short.valueOf(A3651BarTipDef), Boolean.valueOf(n3652BarIntens), Byte.valueOf(A3652BarIntens), Boolean.valueOf(n3653BarPriCod), A3653BarPriCod, Boolean.valueOf(n3654BarCosPD), A3654BarCosPD, Boolean.valueOf(n3656BarCosAD), A3656BarCosAD, Boolean.valueOf(n3657BarCosAA), A3657BarCosAA, Boolean.valueOf(n3658BarCosPA), A3658BarCosPA, Boolean.valueOf(n3705BarCosCol), A3705BarCosCol, Boolean.valueOf(n3706BarCosAnc), A3706BarCosAnc, Boolean.valueOf(n4923BarNumActx), Short.valueOf(A4923BarNumActx), Boolean.valueOf(n4925BarFaseCod), A4925BarFaseCod, Boolean.valueOf(n4926BarFaseOrd), Short.valueOf(A4926BarFaseOrd), Boolean.valueOf(n4977BarReoNum), Short.valueOf(A4977BarReoNum), Boolean.valueOf(n5169BarTipDTin), A5169BarTipDTin, Boolean.valueOf(n5170BarTipCTin), A5170BarTipCTin, Boolean.valueOf(n5899BarCosttTi), A5899BarCosttTi, Boolean.valueOf(n5900BarRbTeo), Short.valueOf(A5900BarRbTeo), Boolean.valueOf(n6177BarNumTin), Integer.valueOf(A6177BarNumTin), Boolean.valueOf(n6634BarRecAcb), A6634BarRecAcb, Boolean.valueOf(n8563BarKgsTt), A8563BarKgsTt, Boolean.valueOf(n8584FamCodT), Short.valueOf(A8584FamCodT), Boolean.valueOf(n9754BarNTint), Byte.valueOf(A9754BarNTint), Boolean.valueOf(n10539BarAcs), A10539BarAcs, Boolean.valueOf(n10540BarNprg), A10540BarNprg, Boolean.valueOf(n10541BarLts), Integer.valueOf(A10541BarLts), Boolean.valueOf(n10546BarLtsV), A10546BarLtsV, Boolean.valueOf(n11762BarDispCli), A11762BarDispCli, Boolean.valueOf(n12993BarMtsTt), A12993BarMtsTt, A13759EstFecCier, Short.valueOf(A13760EstCdn1), A13761EstCdn2, A13762EstCtw});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCONTI");
         if ( (pr_default.getStatus(6) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         /* Using cursor P055V11 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A13213DisNormID = P055V11_A13213DisNormID[0] ;
            A13214DisNormSt = P055V11_A13214DisNormSt[0] ;
            A13215DisNormNC = P055V11_A13215DisNormNC[0] ;
            /*
               INSERT RECORD ON TABLE TXPCONTI1

            */
            A3646EstTinAny = AV43Any ;
            A3647EstTinMes = AV76Mes ;
            A3648EstTinDia = AV61Dia ;
            A1929EstTinNr = AV93UltLin ;
            A13944EstNormaId = A13213DisNormID ;
            A13946EstNormSt = A13214DisNormSt ;
            A13947EstNormNc = A13215DisNormNC ;
            /* Using cursor P055V12 */
            pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr), A13944EstNormaId, A13946EstNormSt, A13947EstNormNc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONTI1");
            if ( (pr_default.getStatus(8) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            pr_default.readNext(7);
         }
         pr_default.close(7);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   public void S111( )
   {
      /* 'COLOR' Routine */
      returnInSub = false ;
      AV70IntCod = (byte)(0) ;
      AV67ForCosForm = DecimalUtil.doubleToDec(0) ;
      AV68ForRelBan = DecimalUtil.doubleToDec(0) ;
      AV63Fam_cod = (short)(999) ;
      /* Using cursor P055V13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV59CliCod), AV69ForSer, AV65ForColNom, Integer.valueOf(AV66ForColNum), Byte.valueOf(AV89TipColCod)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A831TipColCod = P055V13_A831TipColCod[0] ;
         A483ForColNum = P055V13_A483ForColNum[0] ;
         A482ForColNom = P055V13_A482ForColNom[0] ;
         A494ForSer = P055V13_A494ForSer[0] ;
         A252CliCod = P055V13_A252CliCod[0] ;
         n252CliCod = P055V13_n252CliCod[0] ;
         A583IntCod = P055V13_A583IntCod[0] ;
         A1191ForNomCli = P055V13_A1191ForNomCli[0] ;
         n1191ForNomCli = P055V13_n1191ForNomCli[0] ;
         A1192ForNumCli = P055V13_A1192ForNumCli[0] ;
         n1192ForNumCli = P055V13_n1192ForNumCli[0] ;
         A4380ForCosForm = P055V13_A4380ForCosForm[0] ;
         n4380ForCosForm = P055V13_n4380ForCosForm[0] ;
         A2838ForRelBan = P055V13_A2838ForRelBan[0] ;
         n2838ForRelBan = P055V13_n2838ForRelBan[0] ;
         A8561Fam_Cod = P055V13_A8561Fam_Cod[0] ;
         n8561Fam_Cod = P055V13_n8561Fam_Cod[0] ;
         AV70IntCod = A583IntCod ;
         AV55BarNomClT = A1191ForNomCli ;
         AV57BarNunClT = A1192ForNumCli ;
         AV67ForCosForm = A4380ForCosForm ;
         AV68ForRelBan = A2838ForRelBan ;
         AV63Fam_cod = A8561Fam_Cod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcls012.this.A396EmprCod;
      this.aP1[0] = pcls012.this.AV45BarCod;
      this.aP2[0] = pcls012.this.AV47BarCodReo;
      this.aP3[0] = pcls012.this.AV46BarCodPar;
      this.aP4[0] = pcls012.this.AV53BarCosPD;
      this.aP5[0] = pcls012.this.AV49BarCosAD;
      this.aP6[0] = pcls012.this.AV48BarCosAA;
      this.aP7[0] = pcls012.this.AV52BarCosPA;
      this.aP8[0] = pcls012.this.AV51BarCosCol;
      this.aP9[0] = pcls012.this.AV50BarCosAnc;
      this.aP10[0] = pcls012.this.AV44BarAgrLot;
      this.aP11[0] = pcls012.this.AV56BarNumTin;
      this.aP12[0] = pcls012.this.AV93UltLin;
      this.aP13[0] = pcls012.this.AV80RecAcab;
      this.aP14[0] = pcls012.this.AV81recLinMaq;
      this.aP15[0] = pcls012.this.AV87RecVolPrd;
      this.aP16[0] = pcls012.this.AV75MaqCod;
      this.aP17[0] = pcls012.this.AV85RecTotKgs;
      this.aP18[0] = pcls012.this.AV86RecTotMts;
      this.aP19[0] = pcls012.this.AV95FechaCierre;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV60Costem3 = DecimalUtil.ZERO ;
      AV91TotKgs = DecimalUtil.ZERO ;
      AV94TotMts = DecimalUtil.ZERO ;
      AV74Linea = "" ;
      scmdbuf = "" ;
      P055V2_A396EmprCod = new String[] {""} ;
      P055V2_A2804RecLinMaq = new short[1] ;
      P055V2_A130BarCodPar = new String[] {""} ;
      P055V2_A132BarCodReo = new byte[1] ;
      P055V2_A129BarCod = new int[1] ;
      P055V2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055V2_A4260RecTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055V2_n4260RecTotMts = new boolean[] {false} ;
      P055V2_A4268RecOrdLin = new short[1] ;
      P055V2_n4268RecOrdLin = new boolean[] {false} ;
      P055V2_A4258RecMaqFas = new String[] {""} ;
      P055V2_n4258RecMaqFas = new boolean[] {false} ;
      P055V2_A5110RecNumPrg = new String[] {""} ;
      A130BarCodPar = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4260RecTotMts = DecimalUtil.ZERO ;
      A4258RecMaqFas = "" ;
      A5110RecNumPrg = "" ;
      AV82RecMaqFas = "" ;
      AV83RecNumPrg = "" ;
      P055V3_A396EmprCod = new String[] {""} ;
      P055V3_A129BarCod = new int[1] ;
      P055V3_A132BarCodReo = new byte[1] ;
      P055V3_A130BarCodPar = new String[] {""} ;
      P055V3_A2804RecLinMaq = new short[1] ;
      P055V3_A10544RecNH2O = new short[1] ;
      P055V3_A4695RecVolPrf = new int[1] ;
      P055V3_A1273RecLinPro = new byte[1] ;
      P055V6_A396EmprCod = new String[] {""} ;
      P055V6_A361DisCod = new int[1] ;
      P055V6_A129BarCod = new int[1] ;
      P055V6_A132BarCodReo = new byte[1] ;
      P055V6_A130BarCodPar = new String[] {""} ;
      P055V6_A212BarSer = new String[] {""} ;
      P055V6_A1652BarSerDsc = new String[] {""} ;
      P055V6_A217BarTipArt = new short[1] ;
      P055V6_n217BarTipArt = new boolean[] {false} ;
      P055V6_A135BarColNom = new String[] {""} ;
      P055V6_A136BarColNum = new int[1] ;
      P055V6_A218BarTipCol = new byte[1] ;
      P055V6_A180BarMaqCod = new String[] {""} ;
      P055V6_A236BarVolMaq = new int[1] ;
      P055V6_A148BarEstReo = new byte[1] ;
      P055V6_A189BarNumAny = new short[1] ;
      P055V6_A833TipDefCod = new short[1] ;
      P055V6_n833TipDefCod = new boolean[] {false} ;
      P055V6_A209BarPri = new String[] {""} ;
      P055V6_A4975BarNumReo = new short[1] ;
      P055V6_A2010BarTipDis = new String[] {""} ;
      P055V6_A5291BarTipCor = new String[] {""} ;
      P055V6_A118BarAcaQui = new String[] {""} ;
      P055V6_A4812BarEncCli = new String[] {""} ;
      P055V6_A143BarDisNum = new String[] {""} ;
      P055V6_A4466BarAcaAnh = new short[1] ;
      P055V6_A2829BarProPer = new String[] {""} ;
      P055V6_A252CliCod = new int[1] ;
      P055V6_n252CliCod = new boolean[] {false} ;
      P055V6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P055V6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055V6_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055V6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055V6_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055V6_A199BarPie1 = new short[1] ;
      P055V6_A365DisDes = new String[] {""} ;
      P055V6_A898BarPieNDes = new int[1] ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A180BarMaqCod = "" ;
      A209BarPri = "" ;
      A2010BarTipDis = "" ;
      A5291BarTipCor = "" ;
      A118BarAcaQui = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A2829BarProPer = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A184BarMtr = DecimalUtil.ZERO ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      AV69ForSer = "" ;
      AV65ForColNom = "" ;
      P055V7_A396EmprCod = new String[] {""} ;
      P055V7_A3648EstTinDia = new byte[1] ;
      P055V7_A3647EstTinMes = new byte[1] ;
      P055V7_A3646EstTinAny = new short[1] ;
      P055V7_A3649EstTinUL = new short[1] ;
      P055V7_n3649EstTinUL = new boolean[] {false} ;
      Gx_emsg = "" ;
      A1935BarParTin = "" ;
      A1936BarSerTin = "" ;
      A1937BarDscTin = "" ;
      A1940BarColNoT = "" ;
      A1943BarNomClT = "" ;
      AV55BarNomClT = "" ;
      A1945BarMaqTin = "" ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      A1948BarMtrTin = DecimalUtil.ZERO ;
      A2316BarAgrLot = "" ;
      A3653BarPriCod = "" ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      A5169BarTipDTin = "" ;
      A5170BarTipCTin = "" ;
      A5899BarCosttTi = DecimalUtil.ZERO ;
      AV67ForCosForm = DecimalUtil.ZERO ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int10 = new int[1] ;
      GXv_char11 = new String[1] ;
      AV98Station = "" ;
      GXv_char7 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      A6634BarRecAcb = "" ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      A12993BarMtsTt = DecimalUtil.ZERO ;
      A4925BarFaseCod = "" ;
      A10539BarAcs = "" ;
      A10540BarNprg = "" ;
      A10546BarLtsV = DecimalUtil.ZERO ;
      A11762BarDispCli = "" ;
      A13759EstFecCier = GXutil.nullDate() ;
      A13761EstCdn2 = "" ;
      A13762EstCtw = "" ;
      P055V11_A396EmprCod = new String[] {""} ;
      P055V11_A361DisCod = new int[1] ;
      P055V11_A13213DisNormID = new String[] {""} ;
      P055V11_A13214DisNormSt = new String[] {""} ;
      P055V11_A13215DisNormNC = new String[] {""} ;
      A13213DisNormID = "" ;
      A13214DisNormSt = "" ;
      A13215DisNormNC = "" ;
      A13944EstNormaId = "" ;
      A13946EstNormSt = "" ;
      A13947EstNormNc = "" ;
      AV68ForRelBan = DecimalUtil.ZERO ;
      P055V13_A396EmprCod = new String[] {""} ;
      P055V13_A831TipColCod = new byte[1] ;
      P055V13_A483ForColNum = new int[1] ;
      P055V13_A482ForColNom = new String[] {""} ;
      P055V13_A494ForSer = new String[] {""} ;
      P055V13_A252CliCod = new int[1] ;
      P055V13_n252CliCod = new boolean[] {false} ;
      P055V13_A583IntCod = new byte[1] ;
      P055V13_A1191ForNomCli = new String[] {""} ;
      P055V13_n1191ForNomCli = new boolean[] {false} ;
      P055V13_A1192ForNumCli = new int[1] ;
      P055V13_n1192ForNumCli = new boolean[] {false} ;
      P055V13_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055V13_n4380ForCosForm = new boolean[] {false} ;
      P055V13_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P055V13_n2838ForRelBan = new boolean[] {false} ;
      P055V13_A8561Fam_Cod = new short[1] ;
      P055V13_n8561Fam_Cod = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A1191ForNomCli = "" ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcls012__default(),
         new Object[] {
             new Object[] {
            P055V2_A396EmprCod, P055V2_A2804RecLinMaq, P055V2_A130BarCodPar, P055V2_A132BarCodReo, P055V2_A129BarCod, P055V2_A4259RecTotKgs, P055V2_A4260RecTotMts, P055V2_n4260RecTotMts, P055V2_A4268RecOrdLin, P055V2_n4268RecOrdLin,
            P055V2_A4258RecMaqFas, P055V2_n4258RecMaqFas, P055V2_A5110RecNumPrg
            }
            , new Object[] {
            P055V3_A396EmprCod, P055V3_A129BarCod, P055V3_A132BarCodReo, P055V3_A130BarCodPar, P055V3_A2804RecLinMaq, P055V3_A10544RecNH2O, P055V3_A4695RecVolPrf, P055V3_A1273RecLinPro
            }
            , new Object[] {
            P055V6_A396EmprCod, P055V6_A361DisCod, P055V6_A129BarCod, P055V6_A132BarCodReo, P055V6_A130BarCodPar, P055V6_A212BarSer, P055V6_A1652BarSerDsc, P055V6_A217BarTipArt, P055V6_n217BarTipArt, P055V6_A135BarColNom,
            P055V6_A136BarColNum, P055V6_A218BarTipCol, P055V6_A180BarMaqCod, P055V6_A236BarVolMaq, P055V6_A148BarEstReo, P055V6_A189BarNumAny, P055V6_A833TipDefCod, P055V6_n833TipDefCod, P055V6_A209BarPri, P055V6_A4975BarNumReo,
            P055V6_A2010BarTipDis, P055V6_A5291BarTipCor, P055V6_A118BarAcaQui, P055V6_A4812BarEncCli, P055V6_A143BarDisNum, P055V6_A4466BarAcaAnh, P055V6_A2829BarProPer, P055V6_A252CliCod, P055V6_n252CliCod, P055V6_A159BarFecGen,
            P055V6_A184BarMtr, P055V6_A870BarTotMtr, P055V6_A166BarKgm, P055V6_A219BarTotAgr, P055V6_A199BarPie1, P055V6_A365DisDes, P055V6_A898BarPieNDes
            }
            , new Object[] {
            P055V7_A396EmprCod, P055V7_A3648EstTinDia, P055V7_A3647EstTinMes, P055V7_A3646EstTinAny, P055V7_A3649EstTinUL, P055V7_n3649EstTinUL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P055V11_A396EmprCod, P055V11_A361DisCod, P055V11_A13213DisNormID, P055V11_A13214DisNormSt, P055V11_A13215DisNormNC
            }
            , new Object[] {
            }
            , new Object[] {
            P055V13_A396EmprCod, P055V13_A831TipColCod, P055V13_A483ForColNum, P055V13_A482ForColNom, P055V13_A494ForSer, P055V13_A252CliCod, P055V13_A583IntCod, P055V13_A1191ForNomCli, P055V13_n1191ForNomCli, P055V13_A1192ForNumCli,
            P055V13_n1192ForNumCli, P055V13_A4380ForCosForm, P055V13_n4380ForCosForm, P055V13_A2838ForRelBan, P055V13_n2838ForRelBan, P055V13_A8561Fam_Cod, P055V13_n8561Fam_Cod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV47BarCodReo ;
   private byte AV73KgsRea ;
   private byte AV88Samofil ;
   private byte GXt_int6 ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV58Cargo_1 ;
   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte AV61Dia ;
   private byte AV76Mes ;
   private byte AV89TipColCod ;
   private byte A3648EstTinDia ;
   private byte A3647EstTinMes ;
   private byte A1934BarReoTin ;
   private byte A1942BarTipCoT ;
   private byte A2304BarEstTin ;
   private byte A3652BarIntens ;
   private byte AV70IntCod ;
   private byte GXv_int1[] ;
   private byte A9754BarNTint ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private short AV93UltLin ;
   private short AV81recLinMaq ;
   private short AV97actcostecolor ;
   private short AV96rbcolor ;
   private short A2804RecLinMaq ;
   private short A4268RecOrdLin ;
   private short AV84RecOrdlin ;
   private short A10544RecNH2O ;
   private short A217BarTipArt ;
   private short A189BarNumAny ;
   private short A833TipDefCod ;
   private short A4975BarNumReo ;
   private short A4466BarAcaAnh ;
   private short A199BarPie1 ;
   private short AV43Any ;
   private short A3646EstTinAny ;
   private short A3649EstTinUL ;
   private short Gx_err ;
   private short A1929EstTinNr ;
   private short A1939BarArtTin ;
   private short A3650BarNumAna ;
   private short A3651BarTipDef ;
   private short A4977BarReoNum ;
   private short A5900BarRbTeo ;
   private short A4923BarNumActx ;
   private short A8584FamCodT ;
   private short AV63Fam_cod ;
   private short A4926BarFaseOrd ;
   private short A13760EstCdn1 ;
   private short A8561Fam_Cod ;
   private int AV45BarCod ;
   private int AV56BarNumTin ;
   private int AV87RecVolPrd ;
   private int GXt_int2 ;
   private int AV54BarLts ;
   private int A129BarCod ;
   private int A4695RecVolPrf ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A236BarVolMaq ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV59CliCod ;
   private int AV66ForColNum ;
   private int GX_INS509 ;
   private int GX_INS510 ;
   private int A1933BarCodTin ;
   private int A1941BarColNuT ;
   private int A1944BarNumClT ;
   private int AV57BarNunClT ;
   private int A1946BarVolTin ;
   private int A1949BarPieTin ;
   private int GXv_int5[] ;
   private int GXv_int8[] ;
   private int GXv_int10[] ;
   private int A6177BarNumTin ;
   private int A10541BarLts ;
   private int GX_INS1879 ;
   private int A483ForColNum ;
   private int A1192ForNumCli ;
   private java.math.BigDecimal AV53BarCosPD ;
   private java.math.BigDecimal AV49BarCosAD ;
   private java.math.BigDecimal AV48BarCosAA ;
   private java.math.BigDecimal AV52BarCosPA ;
   private java.math.BigDecimal AV51BarCosCol ;
   private java.math.BigDecimal AV50BarCosAnc ;
   private java.math.BigDecimal AV85RecTotKgs ;
   private java.math.BigDecimal AV86RecTotMts ;
   private java.math.BigDecimal AV60Costem3 ;
   private java.math.BigDecimal AV91TotKgs ;
   private java.math.BigDecimal AV94TotMts ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A4260RecTotMts ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A871RecTotMtr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A1948BarMtrTin ;
   private java.math.BigDecimal A3654BarCosPD ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3657BarCosAA ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal A5899BarCosttTi ;
   private java.math.BigDecimal AV67ForCosForm ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A12993BarMtsTt ;
   private java.math.BigDecimal A10546BarLtsV ;
   private java.math.BigDecimal AV68ForRelBan ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal A2838ForRelBan ;
   private String A396EmprCod ;
   private String AV46BarCodPar ;
   private String AV44BarAgrLot ;
   private String AV80RecAcab ;
   private String AV75MaqCod ;
   private String AV74Linea ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A4258RecMaqFas ;
   private String A5110RecNumPrg ;
   private String AV82RecMaqFas ;
   private String AV83RecNumPrg ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A180BarMaqCod ;
   private String A209BarPri ;
   private String A2010BarTipDis ;
   private String A5291BarTipCor ;
   private String A118BarAcaQui ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A2829BarProPer ;
   private String A365DisDes ;
   private String AV69ForSer ;
   private String AV65ForColNom ;
   private String Gx_emsg ;
   private String A1935BarParTin ;
   private String A1936BarSerTin ;
   private String A1937BarDscTin ;
   private String A1940BarColNoT ;
   private String A1943BarNomClT ;
   private String AV55BarNomClT ;
   private String A1945BarMaqTin ;
   private String A2316BarAgrLot ;
   private String A3653BarPriCod ;
   private String A5169BarTipDTin ;
   private String A5170BarTipCTin ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char11[] ;
   private String AV98Station ;
   private String GXv_char7[] ;
   private String A6634BarRecAcb ;
   private String A4925BarFaseCod ;
   private String A10539BarAcs ;
   private String A10540BarNprg ;
   private String A11762BarDispCli ;
   private String A13761EstCdn2 ;
   private String A13762EstCtw ;
   private String A13213DisNormID ;
   private String A13214DisNormSt ;
   private String A13215DisNormNC ;
   private String A13944EstNormaId ;
   private String A13946EstNormSt ;
   private String A13947EstNormNc ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A1191ForNomCli ;
   private java.util.Date AV95FechaCierre ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A13759EstFecCier ;
   private boolean n4260RecTotMts ;
   private boolean n4268RecOrdLin ;
   private boolean n4258RecMaqFas ;
   private boolean n217BarTipArt ;
   private boolean n833TipDefCod ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n3649EstTinUL ;
   private boolean n1933BarCodTin ;
   private boolean n1934BarReoTin ;
   private boolean n1935BarParTin ;
   private boolean n1936BarSerTin ;
   private boolean n1937BarDscTin ;
   private boolean n1939BarArtTin ;
   private boolean n1940BarColNoT ;
   private boolean n1941BarColNuT ;
   private boolean n1942BarTipCoT ;
   private boolean n1943BarNomClT ;
   private boolean n1944BarNumClT ;
   private boolean n1945BarMaqTin ;
   private boolean n1946BarVolTin ;
   private boolean n1947BarKgmTin ;
   private boolean n1948BarMtrTin ;
   private boolean n1949BarPieTin ;
   private boolean n2304BarEstTin ;
   private boolean n2316BarAgrLot ;
   private boolean n3650BarNumAna ;
   private boolean n3651BarTipDef ;
   private boolean n3652BarIntens ;
   private boolean n3653BarPriCod ;
   private boolean n3654BarCosPD ;
   private boolean n3656BarCosAD ;
   private boolean n3657BarCosAA ;
   private boolean n3658BarCosPA ;
   private boolean n3705BarCosCol ;
   private boolean n3706BarCosAnc ;
   private boolean n4977BarReoNum ;
   private boolean n5169BarTipDTin ;
   private boolean n5170BarTipCTin ;
   private boolean n5899BarCosttTi ;
   private boolean n5900BarRbTeo ;
   private boolean n6177BarNumTin ;
   private boolean n6634BarRecAcb ;
   private boolean n4923BarNumActx ;
   private boolean n8563BarKgsTt ;
   private boolean n12993BarMtsTt ;
   private boolean n8584FamCodT ;
   private boolean n9754BarNTint ;
   private boolean n4926BarFaseOrd ;
   private boolean n4925BarFaseCod ;
   private boolean n10539BarAcs ;
   private boolean n10540BarNprg ;
   private boolean n10541BarLts ;
   private boolean n10546BarLtsV ;
   private boolean n11762BarDispCli ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean n4380ForCosForm ;
   private boolean n2838ForRelBan ;
   private boolean n8561Fam_Cod ;
   private java.util.Date[] aP19 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP10 ;
   private int[] aP11 ;
   private short[] aP12 ;
   private String[] aP13 ;
   private short[] aP14 ;
   private int[] aP15 ;
   private String[] aP16 ;
   private java.math.BigDecimal[] aP17 ;
   private java.math.BigDecimal[] aP18 ;
   private IDataStoreProvider pr_default ;
   private String[] P055V2_A396EmprCod ;
   private short[] P055V2_A2804RecLinMaq ;
   private String[] P055V2_A130BarCodPar ;
   private byte[] P055V2_A132BarCodReo ;
   private int[] P055V2_A129BarCod ;
   private java.math.BigDecimal[] P055V2_A4259RecTotKgs ;
   private java.math.BigDecimal[] P055V2_A4260RecTotMts ;
   private boolean[] P055V2_n4260RecTotMts ;
   private short[] P055V2_A4268RecOrdLin ;
   private boolean[] P055V2_n4268RecOrdLin ;
   private String[] P055V2_A4258RecMaqFas ;
   private boolean[] P055V2_n4258RecMaqFas ;
   private String[] P055V2_A5110RecNumPrg ;
   private String[] P055V3_A396EmprCod ;
   private int[] P055V3_A129BarCod ;
   private byte[] P055V3_A132BarCodReo ;
   private String[] P055V3_A130BarCodPar ;
   private short[] P055V3_A2804RecLinMaq ;
   private short[] P055V3_A10544RecNH2O ;
   private int[] P055V3_A4695RecVolPrf ;
   private byte[] P055V3_A1273RecLinPro ;
   private String[] P055V6_A396EmprCod ;
   private int[] P055V6_A361DisCod ;
   private int[] P055V6_A129BarCod ;
   private byte[] P055V6_A132BarCodReo ;
   private String[] P055V6_A130BarCodPar ;
   private String[] P055V6_A212BarSer ;
   private String[] P055V6_A1652BarSerDsc ;
   private short[] P055V6_A217BarTipArt ;
   private boolean[] P055V6_n217BarTipArt ;
   private String[] P055V6_A135BarColNom ;
   private int[] P055V6_A136BarColNum ;
   private byte[] P055V6_A218BarTipCol ;
   private String[] P055V6_A180BarMaqCod ;
   private int[] P055V6_A236BarVolMaq ;
   private byte[] P055V6_A148BarEstReo ;
   private short[] P055V6_A189BarNumAny ;
   private short[] P055V6_A833TipDefCod ;
   private boolean[] P055V6_n833TipDefCod ;
   private String[] P055V6_A209BarPri ;
   private short[] P055V6_A4975BarNumReo ;
   private String[] P055V6_A2010BarTipDis ;
   private String[] P055V6_A5291BarTipCor ;
   private String[] P055V6_A118BarAcaQui ;
   private String[] P055V6_A4812BarEncCli ;
   private String[] P055V6_A143BarDisNum ;
   private short[] P055V6_A4466BarAcaAnh ;
   private String[] P055V6_A2829BarProPer ;
   private int[] P055V6_A252CliCod ;
   private boolean[] P055V6_n252CliCod ;
   private java.util.Date[] P055V6_A159BarFecGen ;
   private java.math.BigDecimal[] P055V6_A184BarMtr ;
   private java.math.BigDecimal[] P055V6_A870BarTotMtr ;
   private java.math.BigDecimal[] P055V6_A166BarKgm ;
   private java.math.BigDecimal[] P055V6_A219BarTotAgr ;
   private short[] P055V6_A199BarPie1 ;
   private String[] P055V6_A365DisDes ;
   private int[] P055V6_A898BarPieNDes ;
   private String[] P055V7_A396EmprCod ;
   private byte[] P055V7_A3648EstTinDia ;
   private byte[] P055V7_A3647EstTinMes ;
   private short[] P055V7_A3646EstTinAny ;
   private short[] P055V7_A3649EstTinUL ;
   private boolean[] P055V7_n3649EstTinUL ;
   private String[] P055V11_A396EmprCod ;
   private int[] P055V11_A361DisCod ;
   private String[] P055V11_A13213DisNormID ;
   private String[] P055V11_A13214DisNormSt ;
   private String[] P055V11_A13215DisNormNC ;
   private String[] P055V13_A396EmprCod ;
   private byte[] P055V13_A831TipColCod ;
   private int[] P055V13_A483ForColNum ;
   private String[] P055V13_A482ForColNom ;
   private String[] P055V13_A494ForSer ;
   private int[] P055V13_A252CliCod ;
   private boolean[] P055V13_n252CliCod ;
   private byte[] P055V13_A583IntCod ;
   private String[] P055V13_A1191ForNomCli ;
   private boolean[] P055V13_n1191ForNomCli ;
   private int[] P055V13_A1192ForNumCli ;
   private boolean[] P055V13_n1192ForNumCli ;
   private java.math.BigDecimal[] P055V13_A4380ForCosForm ;
   private boolean[] P055V13_n4380ForCosForm ;
   private java.math.BigDecimal[] P055V13_A2838ForRelBan ;
   private boolean[] P055V13_n2838ForRelBan ;
   private short[] P055V13_A8561Fam_Cod ;
   private boolean[] P055V13_n8561Fam_Cod ;
}

final  class pcls012__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P055V2", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecTotKgs, RecTotMts, RecOrdLin, RecMaqFas, RecNumPrg FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P055V3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecNH2O, RecVolPrf, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P055V6", "SELECT T1.EmprCod, T1.DisCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarSer, T1.BarSerDsc, T1.BarTipArt, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarMaqCod, T1.BarVolMaq, T1.BarEstReo, T1.BarNumAny, T1.TipDefCod, T1.BarPri, T1.BarNumReo, T1.BarTipDis, T1.BarTipCor, T1.BarAcaQui, T1.BarEncCli, T1.BarDisNum, T1.BarAcaAnh, T1.BarProPer, T1.CliCod, T1.BarFecGen, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T3.BarTotMtr, 0) AS BarTotMtr, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T3.BarTotAgr, 0) AS BarTotAgr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(MtrAgr) AS BarTotMtr FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P055V7", "SELECT EmprCod, EstTinDia, EstTinMes, EstTinAny, EstTinUL FROM TXPCONTIN WHERE EmprCod = ? and EstTinAny = ? and EstTinMes = ? and EstTinDia = ? ORDER BY EmprCod, EstTinAny, EstTinMes, EstTinDia ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P055V8", "INSERT INTO TXPCONTIN(EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinUL) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONTIN")
         ,new UpdateCursor("P055V9", "UPDATE TXPCONTIN SET EstTinUL=?  WHERE EmprCod = ? and EstTinAny = ? and EstTinMes = ? and EstTinDia = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONTIN")
         ,new UpdateCursor("P055V10", "INSERT INTO TXPLCONTI(EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr, BarCodTin, BarReoTin, BarParTin, BarSerTin, BarDscTin, BarArtTin, BarColNoT, BarColNuT, BarTipCoT, BarNomClT, BarNumClT, BarMaqTin, BarVolTin, BarKgmTin, BarMtrTin, BarPieTin, CliCod, BarEstTin, BarAgrLot, BarNumAna, BarTipDef, BarIntens, BarPriCod, BarCosPD, BarCosAD, BarCosAA, BarCosPA, BarCosCol, BarCosAnc, BarNumActx, BarFaseCod, BarFaseOrd, BarReoNum, BarTipDTin, BarTipCTin, BarCosttTi, BarRbTeo, BarNumTin, BarRecAcb, BarKgsTt, FamCodT, BarNTint, BarAcs, BarNprg, BarLts, BarLtsV, BarDispCli, BarMtsTt, EstFecCier, EstCdn1, EstCdn2, EstCtw, BarNumPda, BarTipNTin, BarCausa, BarForNum, BarFecIt, BarFecFt, BarColNm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLCONTI")
         ,new ForEachCursor("P055V11", "SELECT EmprCod, DisCod, DisNormID, DisNormSt, DisNormNC FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P055V12", "INSERT INTO TXPCONTI1(EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr, EstNormaId, EstNormSt, EstNormNc, EstNormDsc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONTI1")
         ,new ForEachCursor("P055V13", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, IntCod, ForNomCli, ForNumCli, ForCosForm, ForRelBan, Fam_Cod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 2);
               ((String[]) buf[22])[0] = rslt.getString(21, 6);
               ((String[]) buf[23])[0] = rslt.getString(22, 20);
               ((String[]) buf[24])[0] = rslt.getString(23, 8);
               ((short[]) buf[25])[0] = rslt.getShort(24);
               ((String[]) buf[26])[0] = rslt.getString(25, 8);
               ((int[]) buf[27])[0] = rslt.getInt(26);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(27);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(28,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(30,2);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(31,2);
               ((short[]) buf[34])[0] = rslt.getShort(32);
               ((String[]) buf[35])[0] = rslt.getString(33, 1);
               ((int[]) buf[36])[0] = rslt.getInt(34);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
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
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 16);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 26);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[18], 13);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[20]).intValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[24], 13);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[28], 6);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[30]).intValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(21, ((Number) parms[36]).intValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[38]).intValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[40]).byteValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[42], 10);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[44]).shortValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[46]).shortValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[48]).byteValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[50], 1);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[64]).shortValue());
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[66], 8);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[68]).shortValue());
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(38, ((Number) parms[70]).shortValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[72], 1);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[74], 2);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(41, (java.math.BigDecimal)parms[76], 5);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(42, ((Number) parms[78]).shortValue());
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(43, ((Number) parms[80]).intValue());
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[82], 1);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(45, (java.math.BigDecimal)parms[84], 2);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(46, ((Number) parms[86]).shortValue());
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(47, ((Number) parms[88]).byteValue());
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[90], 6);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[92], 6);
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(50, ((Number) parms[94]).intValue());
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(51, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[98], 20);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(53, (java.math.BigDecimal)parms[100], 2);
               }
               stmt.setDate(54, (java.util.Date)parms[101]);
               stmt.setShort(55, ((Number) parms[102]).shortValue());
               stmt.setString(56, (String)parms[103], 4);
               stmt.setString(57, (String)parms[104], 4);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 4);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

