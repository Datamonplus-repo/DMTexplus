package app.recetasdeacabados ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcyesttin extends GXProcedure
{
   public pcyesttin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcyesttin.class ), "" );
   }

   public pcyesttin( int remoteHandle ,
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
                                     java.math.BigDecimal[] aP18 ,
                                     short[] aP19 ,
                                     String[] aP20 )
   {
      pcyesttin.this.aP21 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21);
      return aP21[0];
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
                        short[] aP19 ,
                        String[] aP20 ,
                        java.util.Date[] aP21 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21);
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
                             short[] aP19 ,
                             String[] aP20 ,
                             java.util.Date[] aP21 )
   {
      pcyesttin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcyesttin.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      pcyesttin.this.AV9BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcyesttin.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcyesttin.this.AV11BarCosPD = aP4[0];
      this.aP4 = aP4;
      pcyesttin.this.AV12BarCosAD = aP5[0];
      this.aP5 = aP5;
      pcyesttin.this.AV13BarCosAA = aP6[0];
      this.aP6 = aP6;
      pcyesttin.this.AV14BarCosPA = aP7[0];
      this.aP7 = aP7;
      pcyesttin.this.AV15BarCosCol = aP8[0];
      this.aP8 = aP8;
      pcyesttin.this.AV16BarCosAnc = aP9[0];
      this.aP9 = aP9;
      pcyesttin.this.AV29BarAgrLot = aP10[0];
      this.aP10 = aP10;
      pcyesttin.this.AV33BarNumTin = aP11[0];
      this.aP11 = aP11;
      pcyesttin.this.AV20UltLin = aP12[0];
      this.aP12 = aP12;
      pcyesttin.this.AV35RecAcab = aP13[0];
      this.aP13 = aP13;
      pcyesttin.this.AV36recLinMaq = aP14[0];
      this.aP14 = aP14;
      pcyesttin.this.AV37RecVolPrd = aP15[0];
      this.aP15 = aP15;
      pcyesttin.this.AV38MaqCod = aP16[0];
      this.aP16 = aP16;
      pcyesttin.this.AV40RecTotKgs = aP17[0];
      this.aP17 = aP17;
      pcyesttin.this.AV41RecTotMts = aP18[0];
      this.aP18 = aP18;
      pcyesttin.this.AV54RecOrdlin = aP19[0];
      this.aP19 = aP19;
      pcyesttin.this.AV55RecMaqFas = aP20[0];
      this.aP20 = aP20;
      pcyesttin.this.AV61fechacierre = aP21[0];
      this.aP21 = aP21;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV34NCLec ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int1) ;
      pcyesttin.this.AV34NCLec = GXv_int1[0] ;
      GXv_int1[0] = AV30F_vtabua ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VTABUA", ""), GXv_int1) ;
      pcyesttin.this.AV30F_vtabua = GXv_int1[0] ;
      GXv_int1[0] = AV39KgsRea ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KGSREA", ""), GXv_int1) ;
      pcyesttin.this.AV39KgsRea = GXv_int1[0] ;
      GXv_int1[0] = AV53Samofil ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SAMOFI", ""), GXv_int1) ;
      pcyesttin.this.AV53Samofil = GXv_int1[0] ;
      GXt_int2 = (int)(DecimalUtil.decToDouble(AV56Costem3)) ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "MT3H2O", "") ;
      GXv_int5[0] = GXt_int2 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_int5) ;
      pcyesttin.this.A396EmprCod = GXv_char3[0] ;
      pcyesttin.this.GXt_int2 = GXv_int5[0] ;
      AV56Costem3 = DecimalUtil.doubleToDec(GXt_int2) ;
      AV56Costem3 = AV56Costem3.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
      AV46TotKgs = DecimalUtil.doubleToDec(0) ;
      AV59TotMts = DecimalUtil.doubleToDec(0) ;
      AV50Linea = localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 18, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( "Actualizo Tabla LCONTI, HDR= ", "") ;
      AV57BarLts = 0 ;
      /* Using cursor P0A6J2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, Short.valueOf(AV36recLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P0A6J2_A2804RecLinMaq[0] ;
         A130BarCodPar = P0A6J2_A130BarCodPar[0] ;
         A132BarCodReo = P0A6J2_A132BarCodReo[0] ;
         A129BarCod = P0A6J2_A129BarCod[0] ;
         A4259RecTotKgs = P0A6J2_A4259RecTotKgs[0] ;
         A4260RecTotMts = P0A6J2_A4260RecTotMts[0] ;
         n4260RecTotMts = P0A6J2_n4260RecTotMts[0] ;
         A5110RecNumPrg = P0A6J2_A5110RecNumPrg[0] ;
         AV46TotKgs = ((A4259RecTotKgs.doubleValue()>0) ? A4259RecTotKgs : AV46TotKgs) ;
         AV59TotMts = ((A4260RecTotMts.doubleValue()>0) ? A4260RecTotMts : AV59TotMts) ;
         AV58RecNumPrg = A5110RecNumPrg ;
         /* Using cursor P0A6J3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A10544RecNH2O = P0A6J3_A10544RecNH2O[0] ;
            A4695RecVolPrf = P0A6J3_A4695RecVolPrf[0] ;
            A1273RecLinPro = P0A6J3_A1273RecLinPro[0] ;
            AV57BarLts = (int)(AV57BarLts+((A4695RecVolPrf*A10544RecNH2O))) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV57BarLts > 99999 )
      {
         AV57BarLts = 0 ;
      }
      AV52Cargo_1 = (byte)(0) ;
      /* Using cursor P0A6J6 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A129BarCod = P0A6J6_A129BarCod[0] ;
         A132BarCodReo = P0A6J6_A132BarCodReo[0] ;
         A130BarCodPar = P0A6J6_A130BarCodPar[0] ;
         A212BarSer = P0A6J6_A212BarSer[0] ;
         A1652BarSerDsc = P0A6J6_A1652BarSerDsc[0] ;
         A217BarTipArt = P0A6J6_A217BarTipArt[0] ;
         n217BarTipArt = P0A6J6_n217BarTipArt[0] ;
         A135BarColNom = P0A6J6_A135BarColNom[0] ;
         A136BarColNum = P0A6J6_A136BarColNum[0] ;
         A218BarTipCol = P0A6J6_A218BarTipCol[0] ;
         A180BarMaqCod = P0A6J6_A180BarMaqCod[0] ;
         A236BarVolMaq = P0A6J6_A236BarVolMaq[0] ;
         A148BarEstReo = P0A6J6_A148BarEstReo[0] ;
         A189BarNumAny = P0A6J6_A189BarNumAny[0] ;
         A833TipDefCod = P0A6J6_A833TipDefCod[0] ;
         n833TipDefCod = P0A6J6_n833TipDefCod[0] ;
         A209BarPri = P0A6J6_A209BarPri[0] ;
         A4975BarNumReo = P0A6J6_A4975BarNumReo[0] ;
         A2010BarTipDis = P0A6J6_A2010BarTipDis[0] ;
         A5291BarTipCor = P0A6J6_A5291BarTipCor[0] ;
         A4609BarMdlCod = P0A6J6_A4609BarMdlCod[0] ;
         A118BarAcaQui = P0A6J6_A118BarAcaQui[0] ;
         A4812BarEncCli = P0A6J6_A4812BarEncCli[0] ;
         A143BarDisNum = P0A6J6_A143BarDisNum[0] ;
         A252CliCod = P0A6J6_A252CliCod[0] ;
         n252CliCod = P0A6J6_n252CliCod[0] ;
         A159BarFecGen = P0A6J6_A159BarFecGen[0] ;
         A184BarMtr = P0A6J6_A184BarMtr[0] ;
         A870BarTotMtr = P0A6J6_A870BarTotMtr[0] ;
         A166BarKgm = P0A6J6_A166BarKgm[0] ;
         A219BarTotAgr = P0A6J6_A219BarTotAgr[0] ;
         A199BarPie1 = P0A6J6_A199BarPie1[0] ;
         A365DisDes = P0A6J6_A365DisDes[0] ;
         A898BarPieNDes = P0A6J6_A898BarPieNDes[0] ;
         A184BarMtr = P0A6J6_A184BarMtr[0] ;
         A166BarKgm = P0A6J6_A166BarKgm[0] ;
         A199BarPie1 = P0A6J6_A199BarPie1[0] ;
         A898BarPieNDes = P0A6J6_A898BarPieNDes[0] ;
         A870BarTotMtr = P0A6J6_A870BarTotMtr[0] ;
         A219BarTotAgr = P0A6J6_A219BarTotAgr[0] ;
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
         AV46TotKgs = ((AV46TotKgs.doubleValue()==0) ? A812RecTotKgm : AV46TotKgs) ;
         AV59TotMts = ((AV59TotMts.doubleValue()==0) ? A871RecTotMtr : AV59TotMts) ;
         if ( AV53Samofil == 0 )
         {
            AV17Dia = (byte)(GXutil.day( AV61fechacierre)) ;
            AV18Mes = (byte)(GXutil.month( AV61fechacierre)) ;
            AV19Any = (short)(GXutil.year( AV61fechacierre)) ;
         }
         else
         {
            AV17Dia = (byte)(GXutil.day( A159BarFecGen)) ;
            AV18Mes = (byte)(GXutil.month( A159BarFecGen)) ;
            AV19Any = (short)(GXutil.year( A159BarFecGen)) ;
         }
         AV25CliCod = A252CliCod ;
         AV21ForSer = A212BarSer ;
         AV22ForColNom = A135BarColNom ;
         AV23ForColNum = A136BarColNum ;
         AV24TipColCod = A218BarTipCol ;
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
         /* Using cursor P0A6J7 */
         pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(AV19Any), Byte.valueOf(AV18Mes), Byte.valueOf(AV17Dia)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A3648EstTinDia = P0A6J7_A3648EstTinDia[0] ;
            A3647EstTinMes = P0A6J7_A3647EstTinMes[0] ;
            A3646EstTinAny = P0A6J7_A3646EstTinAny[0] ;
            A3649EstTinUL = P0A6J7_A3649EstTinUL[0] ;
            n3649EstTinUL = P0A6J7_n3649EstTinUL[0] ;
            AV20UltLin = A3649EstTinUL ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         AV20UltLin = (short)(AV20UltLin+1) ;
         /*
            INSERT RECORD ON TABLE TXPCONTIN

         */
         A3646EstTinAny = AV19Any ;
         A3647EstTinMes = AV18Mes ;
         A3648EstTinDia = AV17Dia ;
         A3649EstTinUL = AV20UltLin ;
         n3649EstTinUL = false ;
         /* Using cursor P0A6J8 */
         pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Boolean.valueOf(n3649EstTinUL), Short.valueOf(A3649EstTinUL)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONTIN");
         if ( (pr_default.getStatus(4) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            n3649EstTinUL = false ;
            /* Optimized UPDATE. */
            /* Using cursor P0A6J9 */
            pr_default.execute(5, new Object[] {Boolean.valueOf(n3649EstTinUL), Short.valueOf(AV20UltLin), A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
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
         A3646EstTinAny = AV19Any ;
         A3647EstTinMes = AV18Mes ;
         A3648EstTinDia = AV17Dia ;
         A1929EstTinNr = AV20UltLin ;
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
         A1943BarNomClT = AV27BarNomClT ;
         n1943BarNomClT = false ;
         A1944BarNumClT = AV28BarNunClT ;
         n1944BarNumClT = false ;
         A1945BarMaqTin = A180BarMaqCod ;
         n1945BarMaqTin = false ;
         if ( ! (GXutil.strcmp("", AV38MaqCod)==0) )
         {
            A1945BarMaqTin = AV38MaqCod ;
            n1945BarMaqTin = false ;
         }
         A1946BarVolTin = A236BarVolMaq ;
         n1946BarVolTin = false ;
         if ( AV37RecVolPrd > 0 )
         {
            A1946BarVolTin = AV37RecVolPrd ;
            n1946BarVolTin = false ;
         }
         A1947BarKgmTin = ((AV39KgsRea==1) ? AV40RecTotKgs : A166BarKgm) ;
         n1947BarKgmTin = false ;
         A1948BarMtrTin = ((AV39KgsRea==1) ? AV41RecTotMts : A184BarMtr) ;
         n1948BarMtrTin = false ;
         if ( ( AV46TotKgs.doubleValue() > 0 ) && ( A166BarKgm.doubleValue() == 0 ) )
         {
            A1947BarKgmTin = AV46TotKgs ;
            n1947BarKgmTin = false ;
         }
         A1949BarPieTin = A198BarPie ;
         n1949BarPieTin = false ;
         A2304BarEstTin = A148BarEstReo ;
         n2304BarEstTin = false ;
         A2316BarAgrLot = AV29BarAgrLot ;
         n2316BarAgrLot = false ;
         A3650BarNumAna = A189BarNumAny ;
         n3650BarNumAna = false ;
         A3651BarTipDef = A833TipDefCod ;
         n3651BarTipDef = false ;
         A3652BarIntens = AV26IntCod ;
         n3652BarIntens = false ;
         A3653BarPriCod = A209BarPri ;
         n3653BarPriCod = false ;
         A3654BarCosPD = AV11BarCosPD ;
         n3654BarCosPD = false ;
         A3656BarCosAD = AV12BarCosAD ;
         n3656BarCosAD = false ;
         A3657BarCosAA = AV13BarCosAA ;
         n3657BarCosAA = false ;
         A3658BarCosPA = AV14BarCosPA ;
         n3658BarCosPA = false ;
         A3705BarCosCol = AV15BarCosCol ;
         n3705BarCosCol = false ;
         A3706BarCosAnc = AV16BarCosAnc ;
         n3706BarCosAnc = false ;
         A4977BarReoNum = A4975BarNumReo ;
         n4977BarReoNum = false ;
         A5169BarTipDTin = A2010BarTipDis ;
         n5169BarTipDTin = false ;
         A5170BarTipCTin = A5291BarTipCor ;
         n5170BarTipCTin = false ;
         if ( AV30F_vtabua == 1 )
         {
            A5171BarTipNTin = A4609BarMdlCod ;
            n5171BarTipNTin = false ;
         }
         A5899BarCosttTi = AV31ForCosForm ;
         n5899BarCosttTi = false ;
         A5900BarRbTeo = (short)(DecimalUtil.decToDouble(AV32ForRelBan)) ;
         n5900BarRbTeo = false ;
         A6177BarNumTin = AV33BarNumTin ;
         n6177BarNumTin = false ;
         A6634BarRecAcb = AV35RecAcab ;
         n6634BarRecAcb = false ;
         A4923BarNumActx = AV36recLinMaq ;
         n4923BarNumActx = false ;
         A8563BarKgsTt = AV46TotKgs ;
         n8563BarKgsTt = false ;
         A12993BarMtsTt = AV59TotMts ;
         n12993BarMtsTt = false ;
         A8584FamCodT = AV47Fam_cod ;
         n8584FamCodT = false ;
         A9754BarNTint = (byte)(0) ;
         n9754BarNTint = false ;
         if ( GXutil.strcmp(AV29BarAgrLot, GXutil.str( AV8BarCod, 8, 0)+GXutil.str( AV9BarCodReo, 1, 0)+AV10BarCodPar) == 0 )
         {
            A9754BarNTint = (byte)(1) ;
            n9754BarNTint = false ;
         }
         A4926BarFaseOrd = AV54RecOrdlin ;
         n4926BarFaseOrd = false ;
         A4925BarFaseCod = AV55RecMaqFas ;
         n4925BarFaseCod = false ;
         A10539BarAcs = A118BarAcaQui ;
         n10539BarAcs = false ;
         A10540BarNprg = AV58RecNumPrg ;
         n10540BarNprg = false ;
         A10541BarLts = AV57BarLts ;
         n10541BarLts = false ;
         A10546BarLtsV = GXutil.roundDecimal( DecimalUtil.doubleToDec(AV57BarLts).multiply(AV56Costem3), 2).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         n10546BarLtsV = false ;
         A11762BarDispCli = ((GXutil.strcmp(A143BarDisNum, " ")!=0) ? A143BarDisNum : A4812BarEncCli) ;
         n11762BarDispCli = false ;
         A13759EstFecCier = AV61fechacierre ;
         Gx_msg = httpContext.getMessage( "HDR=", "") + GXutil.str( AV8BarCod, 8, 0) + "-" + GXutil.str( AV9BarCodReo, 1, 0) + AV10BarCodPar + httpContext.getMessage( "&TotKgs  =", "") + GXutil.str( AV46TotKgs, 10, 2) + httpContext.getMessage( "BarKgstt=", "") + GXutil.str( AV43Kgs_a, 10, 2) ;
         System.out.println( Gx_msg );
         /* Using cursor P0A6J10 */
         pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr), Boolean.valueOf(n1933BarCodTin), Integer.valueOf(A1933BarCodTin), Boolean.valueOf(n1934BarReoTin), Byte.valueOf(A1934BarReoTin), Boolean.valueOf(n1935BarParTin), A1935BarParTin, Boolean.valueOf(n1936BarSerTin), A1936BarSerTin, Boolean.valueOf(n1937BarDscTin), A1937BarDscTin, Boolean.valueOf(n1939BarArtTin), Short.valueOf(A1939BarArtTin), Boolean.valueOf(n1940BarColNoT), A1940BarColNoT, Boolean.valueOf(n1941BarColNuT), Integer.valueOf(A1941BarColNuT), Boolean.valueOf(n1942BarTipCoT), Byte.valueOf(A1942BarTipCoT), Boolean.valueOf(n1943BarNomClT), A1943BarNomClT, Boolean.valueOf(n1944BarNumClT), Integer.valueOf(A1944BarNumClT), Boolean.valueOf(n1945BarMaqTin), A1945BarMaqTin, Boolean.valueOf(n1946BarVolTin), Integer.valueOf(A1946BarVolTin), Boolean.valueOf(n1947BarKgmTin), A1947BarKgmTin, Boolean.valueOf(n1948BarMtrTin), A1948BarMtrTin, Boolean.valueOf(n1949BarPieTin), Integer.valueOf(A1949BarPieTin), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n2304BarEstTin), Byte.valueOf(A2304BarEstTin), Boolean.valueOf(n2316BarAgrLot), A2316BarAgrLot, Boolean.valueOf(n3650BarNumAna), Short.valueOf(A3650BarNumAna), Boolean.valueOf(n3651BarTipDef), Short.valueOf(A3651BarTipDef), Boolean.valueOf(n3652BarIntens), Byte.valueOf(A3652BarIntens), Boolean.valueOf(n3653BarPriCod), A3653BarPriCod, Boolean.valueOf(n3654BarCosPD), A3654BarCosPD, Boolean.valueOf(n3656BarCosAD), A3656BarCosAD, Boolean.valueOf(n3657BarCosAA), A3657BarCosAA, Boolean.valueOf(n3658BarCosPA), A3658BarCosPA, Boolean.valueOf(n3705BarCosCol), A3705BarCosCol, Boolean.valueOf(n3706BarCosAnc), A3706BarCosAnc, Boolean.valueOf(n4923BarNumActx), Short.valueOf(A4923BarNumActx), Boolean.valueOf(n4925BarFaseCod), A4925BarFaseCod, Boolean.valueOf(n4926BarFaseOrd), Short.valueOf(A4926BarFaseOrd), Boolean.valueOf(n4977BarReoNum), Short.valueOf(A4977BarReoNum), Boolean.valueOf(n5169BarTipDTin), A5169BarTipDTin, Boolean.valueOf(n5170BarTipCTin), A5170BarTipCTin, Boolean.valueOf(n5171BarTipNTin), A5171BarTipNTin, Boolean.valueOf(n5899BarCosttTi), A5899BarCosttTi, Boolean.valueOf(n5900BarRbTeo), Short.valueOf(A5900BarRbTeo), Boolean.valueOf(n6177BarNumTin), Integer.valueOf(A6177BarNumTin), Boolean.valueOf(n6634BarRecAcb), A6634BarRecAcb, Boolean.valueOf(n8563BarKgsTt), A8563BarKgsTt, Boolean.valueOf(n8584FamCodT), Short.valueOf(A8584FamCodT), Boolean.valueOf(n9754BarNTint), Byte.valueOf(A9754BarNTint), Boolean.valueOf(n10539BarAcs), A10539BarAcs, Boolean.valueOf(n10540BarNprg), A10540BarNprg, Boolean.valueOf(n10541BarLts), Integer.valueOf(A10541BarLts), Boolean.valueOf(n10546BarLtsV), A10546BarLtsV, Boolean.valueOf(n11762BarDispCli), A11762BarDispCli, Boolean.valueOf(n12993BarMtsTt), A12993BarMtsTt, A13759EstFecCier});
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
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( AV34NCLec == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "recetasdeacabados.pcyesttin");
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'COLOR' Routine */
      returnInSub = false ;
      AV26IntCod = (byte)(0) ;
      AV31ForCosForm = DecimalUtil.doubleToDec(0) ;
      AV32ForRelBan = DecimalUtil.doubleToDec(0) ;
      AV47Fam_cod = (short)(999) ;
      /* Using cursor P0A6J11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV25CliCod), AV21ForSer, AV22ForColNom, Integer.valueOf(AV23ForColNum), Byte.valueOf(AV24TipColCod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A831TipColCod = P0A6J11_A831TipColCod[0] ;
         A483ForColNum = P0A6J11_A483ForColNum[0] ;
         A482ForColNom = P0A6J11_A482ForColNom[0] ;
         A494ForSer = P0A6J11_A494ForSer[0] ;
         A252CliCod = P0A6J11_A252CliCod[0] ;
         n252CliCod = P0A6J11_n252CliCod[0] ;
         A583IntCod = P0A6J11_A583IntCod[0] ;
         A1191ForNomCli = P0A6J11_A1191ForNomCli[0] ;
         n1191ForNomCli = P0A6J11_n1191ForNomCli[0] ;
         A1192ForNumCli = P0A6J11_A1192ForNumCli[0] ;
         n1192ForNumCli = P0A6J11_n1192ForNumCli[0] ;
         A4380ForCosForm = P0A6J11_A4380ForCosForm[0] ;
         n4380ForCosForm = P0A6J11_n4380ForCosForm[0] ;
         A2838ForRelBan = P0A6J11_A2838ForRelBan[0] ;
         n2838ForRelBan = P0A6J11_n2838ForRelBan[0] ;
         A8561Fam_Cod = P0A6J11_A8561Fam_Cod[0] ;
         n8561Fam_Cod = P0A6J11_n8561Fam_Cod[0] ;
         AV26IntCod = A583IntCod ;
         AV27BarNomClT = A1191ForNomCli ;
         AV28BarNunClT = A1192ForNumCli ;
         AV31ForCosForm = A4380ForCosForm ;
         AV32ForRelBan = A2838ForRelBan ;
         AV47Fam_cod = A8561Fam_Cod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcyesttin.this.A396EmprCod;
      this.aP1[0] = pcyesttin.this.AV8BarCod;
      this.aP2[0] = pcyesttin.this.AV9BarCodReo;
      this.aP3[0] = pcyesttin.this.AV10BarCodPar;
      this.aP4[0] = pcyesttin.this.AV11BarCosPD;
      this.aP5[0] = pcyesttin.this.AV12BarCosAD;
      this.aP6[0] = pcyesttin.this.AV13BarCosAA;
      this.aP7[0] = pcyesttin.this.AV14BarCosPA;
      this.aP8[0] = pcyesttin.this.AV15BarCosCol;
      this.aP9[0] = pcyesttin.this.AV16BarCosAnc;
      this.aP10[0] = pcyesttin.this.AV29BarAgrLot;
      this.aP11[0] = pcyesttin.this.AV33BarNumTin;
      this.aP12[0] = pcyesttin.this.AV20UltLin;
      this.aP13[0] = pcyesttin.this.AV35RecAcab;
      this.aP14[0] = pcyesttin.this.AV36recLinMaq;
      this.aP15[0] = pcyesttin.this.AV37RecVolPrd;
      this.aP16[0] = pcyesttin.this.AV38MaqCod;
      this.aP17[0] = pcyesttin.this.AV40RecTotKgs;
      this.aP18[0] = pcyesttin.this.AV41RecTotMts;
      this.aP19[0] = pcyesttin.this.AV54RecOrdlin;
      this.aP20[0] = pcyesttin.this.AV55RecMaqFas;
      this.aP21[0] = pcyesttin.this.AV61fechacierre;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      AV56Costem3 = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      AV46TotKgs = DecimalUtil.ZERO ;
      AV59TotMts = DecimalUtil.ZERO ;
      AV50Linea = "" ;
      scmdbuf = "" ;
      P0A6J2_A396EmprCod = new String[] {""} ;
      P0A6J2_A2804RecLinMaq = new short[1] ;
      P0A6J2_A130BarCodPar = new String[] {""} ;
      P0A6J2_A132BarCodReo = new byte[1] ;
      P0A6J2_A129BarCod = new int[1] ;
      P0A6J2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6J2_A4260RecTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6J2_n4260RecTotMts = new boolean[] {false} ;
      P0A6J2_A5110RecNumPrg = new String[] {""} ;
      A130BarCodPar = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A4260RecTotMts = DecimalUtil.ZERO ;
      A5110RecNumPrg = "" ;
      AV58RecNumPrg = "" ;
      P0A6J3_A396EmprCod = new String[] {""} ;
      P0A6J3_A129BarCod = new int[1] ;
      P0A6J3_A132BarCodReo = new byte[1] ;
      P0A6J3_A130BarCodPar = new String[] {""} ;
      P0A6J3_A2804RecLinMaq = new short[1] ;
      P0A6J3_A10544RecNH2O = new short[1] ;
      P0A6J3_A4695RecVolPrf = new int[1] ;
      P0A6J3_A1273RecLinPro = new byte[1] ;
      P0A6J6_A396EmprCod = new String[] {""} ;
      P0A6J6_A129BarCod = new int[1] ;
      P0A6J6_A132BarCodReo = new byte[1] ;
      P0A6J6_A130BarCodPar = new String[] {""} ;
      P0A6J6_A212BarSer = new String[] {""} ;
      P0A6J6_A1652BarSerDsc = new String[] {""} ;
      P0A6J6_A217BarTipArt = new short[1] ;
      P0A6J6_n217BarTipArt = new boolean[] {false} ;
      P0A6J6_A135BarColNom = new String[] {""} ;
      P0A6J6_A136BarColNum = new int[1] ;
      P0A6J6_A218BarTipCol = new byte[1] ;
      P0A6J6_A180BarMaqCod = new String[] {""} ;
      P0A6J6_A236BarVolMaq = new int[1] ;
      P0A6J6_A148BarEstReo = new byte[1] ;
      P0A6J6_A189BarNumAny = new short[1] ;
      P0A6J6_A833TipDefCod = new short[1] ;
      P0A6J6_n833TipDefCod = new boolean[] {false} ;
      P0A6J6_A209BarPri = new String[] {""} ;
      P0A6J6_A4975BarNumReo = new short[1] ;
      P0A6J6_A2010BarTipDis = new String[] {""} ;
      P0A6J6_A5291BarTipCor = new String[] {""} ;
      P0A6J6_A4609BarMdlCod = new String[] {""} ;
      P0A6J6_A118BarAcaQui = new String[] {""} ;
      P0A6J6_A4812BarEncCli = new String[] {""} ;
      P0A6J6_A143BarDisNum = new String[] {""} ;
      P0A6J6_A252CliCod = new int[1] ;
      P0A6J6_n252CliCod = new boolean[] {false} ;
      P0A6J6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0A6J6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6J6_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6J6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6J6_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6J6_A199BarPie1 = new short[1] ;
      P0A6J6_A365DisDes = new String[] {""} ;
      P0A6J6_A898BarPieNDes = new int[1] ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A180BarMaqCod = "" ;
      A209BarPri = "" ;
      A2010BarTipDis = "" ;
      A5291BarTipCor = "" ;
      A4609BarMdlCod = "" ;
      A118BarAcaQui = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A184BarMtr = DecimalUtil.ZERO ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      AV21ForSer = "" ;
      AV22ForColNom = "" ;
      P0A6J7_A396EmprCod = new String[] {""} ;
      P0A6J7_A3648EstTinDia = new byte[1] ;
      P0A6J7_A3647EstTinMes = new byte[1] ;
      P0A6J7_A3646EstTinAny = new short[1] ;
      P0A6J7_A3649EstTinUL = new short[1] ;
      P0A6J7_n3649EstTinUL = new boolean[] {false} ;
      Gx_emsg = "" ;
      A1935BarParTin = "" ;
      A1936BarSerTin = "" ;
      A1937BarDscTin = "" ;
      A1940BarColNoT = "" ;
      A1943BarNomClT = "" ;
      AV27BarNomClT = "" ;
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
      A5171BarTipNTin = "" ;
      A5899BarCosttTi = DecimalUtil.ZERO ;
      AV31ForCosForm = DecimalUtil.ZERO ;
      AV32ForRelBan = DecimalUtil.ZERO ;
      A6634BarRecAcb = "" ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      A12993BarMtsTt = DecimalUtil.ZERO ;
      A4925BarFaseCod = "" ;
      A10539BarAcs = "" ;
      A10540BarNprg = "" ;
      A10546BarLtsV = DecimalUtil.ZERO ;
      A11762BarDispCli = "" ;
      A13759EstFecCier = GXutil.nullDate() ;
      Gx_msg = "" ;
      AV43Kgs_a = DecimalUtil.ZERO ;
      P0A6J11_A396EmprCod = new String[] {""} ;
      P0A6J11_A831TipColCod = new byte[1] ;
      P0A6J11_A483ForColNum = new int[1] ;
      P0A6J11_A482ForColNom = new String[] {""} ;
      P0A6J11_A494ForSer = new String[] {""} ;
      P0A6J11_A252CliCod = new int[1] ;
      P0A6J11_n252CliCod = new boolean[] {false} ;
      P0A6J11_A583IntCod = new byte[1] ;
      P0A6J11_A1191ForNomCli = new String[] {""} ;
      P0A6J11_n1191ForNomCli = new boolean[] {false} ;
      P0A6J11_A1192ForNumCli = new int[1] ;
      P0A6J11_n1192ForNumCli = new boolean[] {false} ;
      P0A6J11_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6J11_n4380ForCosForm = new boolean[] {false} ;
      P0A6J11_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6J11_n2838ForRelBan = new boolean[] {false} ;
      P0A6J11_A8561Fam_Cod = new short[1] ;
      P0A6J11_n8561Fam_Cod = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A1191ForNomCli = "" ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.pcyesttin__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.pcyesttin__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.pcyesttin__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.pcyesttin__default(),
         new Object[] {
             new Object[] {
            P0A6J2_A396EmprCod, P0A6J2_A2804RecLinMaq, P0A6J2_A130BarCodPar, P0A6J2_A132BarCodReo, P0A6J2_A129BarCod, P0A6J2_A4259RecTotKgs, P0A6J2_A4260RecTotMts, P0A6J2_n4260RecTotMts, P0A6J2_A5110RecNumPrg
            }
            , new Object[] {
            P0A6J3_A396EmprCod, P0A6J3_A129BarCod, P0A6J3_A132BarCodReo, P0A6J3_A130BarCodPar, P0A6J3_A2804RecLinMaq, P0A6J3_A10544RecNH2O, P0A6J3_A4695RecVolPrf, P0A6J3_A1273RecLinPro
            }
            , new Object[] {
            P0A6J6_A396EmprCod, P0A6J6_A129BarCod, P0A6J6_A132BarCodReo, P0A6J6_A130BarCodPar, P0A6J6_A212BarSer, P0A6J6_A1652BarSerDsc, P0A6J6_A217BarTipArt, P0A6J6_n217BarTipArt, P0A6J6_A135BarColNom, P0A6J6_A136BarColNum,
            P0A6J6_A218BarTipCol, P0A6J6_A180BarMaqCod, P0A6J6_A236BarVolMaq, P0A6J6_A148BarEstReo, P0A6J6_A189BarNumAny, P0A6J6_A833TipDefCod, P0A6J6_n833TipDefCod, P0A6J6_A209BarPri, P0A6J6_A4975BarNumReo, P0A6J6_A2010BarTipDis,
            P0A6J6_A5291BarTipCor, P0A6J6_A4609BarMdlCod, P0A6J6_A118BarAcaQui, P0A6J6_A4812BarEncCli, P0A6J6_A143BarDisNum, P0A6J6_A252CliCod, P0A6J6_n252CliCod, P0A6J6_A159BarFecGen, P0A6J6_A184BarMtr, P0A6J6_A870BarTotMtr,
            P0A6J6_A166BarKgm, P0A6J6_A219BarTotAgr, P0A6J6_A199BarPie1, P0A6J6_A365DisDes, P0A6J6_A898BarPieNDes
            }
            , new Object[] {
            P0A6J7_A396EmprCod, P0A6J7_A3648EstTinDia, P0A6J7_A3647EstTinMes, P0A6J7_A3646EstTinAny, P0A6J7_A3649EstTinUL, P0A6J7_n3649EstTinUL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P0A6J11_A396EmprCod, P0A6J11_A831TipColCod, P0A6J11_A483ForColNum, P0A6J11_A482ForColNom, P0A6J11_A494ForSer, P0A6J11_A252CliCod, P0A6J11_A583IntCod, P0A6J11_A1191ForNomCli, P0A6J11_n1191ForNomCli, P0A6J11_A1192ForNumCli,
            P0A6J11_n1192ForNumCli, P0A6J11_A4380ForCosForm, P0A6J11_n4380ForCosForm, P0A6J11_A2838ForRelBan, P0A6J11_n2838ForRelBan, P0A6J11_A8561Fam_Cod, P0A6J11_n8561Fam_Cod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private byte AV34NCLec ;
   private byte AV30F_vtabua ;
   private byte AV39KgsRea ;
   private byte AV53Samofil ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV52Cargo_1 ;
   private byte A218BarTipCol ;
   private byte A148BarEstReo ;
   private byte AV17Dia ;
   private byte AV18Mes ;
   private byte AV24TipColCod ;
   private byte A3648EstTinDia ;
   private byte A3647EstTinMes ;
   private byte A1934BarReoTin ;
   private byte A1942BarTipCoT ;
   private byte A2304BarEstTin ;
   private byte A3652BarIntens ;
   private byte AV26IntCod ;
   private byte A9754BarNTint ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private short AV20UltLin ;
   private short AV36recLinMaq ;
   private short AV54RecOrdlin ;
   private short A2804RecLinMaq ;
   private short A10544RecNH2O ;
   private short A217BarTipArt ;
   private short A189BarNumAny ;
   private short A833TipDefCod ;
   private short A4975BarNumReo ;
   private short A199BarPie1 ;
   private short AV19Any ;
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
   private short AV47Fam_cod ;
   private short A4926BarFaseOrd ;
   private short A8561Fam_Cod ;
   private int AV8BarCod ;
   private int AV33BarNumTin ;
   private int AV37RecVolPrd ;
   private int GXt_int2 ;
   private int GXv_int5[] ;
   private int AV57BarLts ;
   private int A129BarCod ;
   private int A4695RecVolPrf ;
   private int A136BarColNum ;
   private int A236BarVolMaq ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV25CliCod ;
   private int AV23ForColNum ;
   private int GX_INS509 ;
   private int GX_INS510 ;
   private int A1933BarCodTin ;
   private int A1941BarColNuT ;
   private int A1944BarNumClT ;
   private int AV28BarNunClT ;
   private int A1946BarVolTin ;
   private int A1949BarPieTin ;
   private int A6177BarNumTin ;
   private int A10541BarLts ;
   private int A483ForColNum ;
   private int A1192ForNumCli ;
   private java.math.BigDecimal AV11BarCosPD ;
   private java.math.BigDecimal AV12BarCosAD ;
   private java.math.BigDecimal AV13BarCosAA ;
   private java.math.BigDecimal AV14BarCosPA ;
   private java.math.BigDecimal AV15BarCosCol ;
   private java.math.BigDecimal AV16BarCosAnc ;
   private java.math.BigDecimal AV40RecTotKgs ;
   private java.math.BigDecimal AV41RecTotMts ;
   private java.math.BigDecimal AV56Costem3 ;
   private java.math.BigDecimal AV46TotKgs ;
   private java.math.BigDecimal AV59TotMts ;
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
   private java.math.BigDecimal AV31ForCosForm ;
   private java.math.BigDecimal AV32ForRelBan ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A12993BarMtsTt ;
   private java.math.BigDecimal A10546BarLtsV ;
   private java.math.BigDecimal AV43Kgs_a ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal A2838ForRelBan ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String AV29BarAgrLot ;
   private String AV35RecAcab ;
   private String AV38MaqCod ;
   private String AV55RecMaqFas ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String AV50Linea ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A5110RecNumPrg ;
   private String AV58RecNumPrg ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A180BarMaqCod ;
   private String A209BarPri ;
   private String A2010BarTipDis ;
   private String A5291BarTipCor ;
   private String A4609BarMdlCod ;
   private String A118BarAcaQui ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A365DisDes ;
   private String AV21ForSer ;
   private String AV22ForColNom ;
   private String Gx_emsg ;
   private String A1935BarParTin ;
   private String A1936BarSerTin ;
   private String A1937BarDscTin ;
   private String A1940BarColNoT ;
   private String A1943BarNomClT ;
   private String AV27BarNomClT ;
   private String A1945BarMaqTin ;
   private String A2316BarAgrLot ;
   private String A3653BarPriCod ;
   private String A5169BarTipDTin ;
   private String A5170BarTipCTin ;
   private String A5171BarTipNTin ;
   private String A6634BarRecAcb ;
   private String A4925BarFaseCod ;
   private String A10539BarAcs ;
   private String A10540BarNprg ;
   private String A11762BarDispCli ;
   private String Gx_msg ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A1191ForNomCli ;
   private java.util.Date AV61fechacierre ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A13759EstFecCier ;
   private boolean n4260RecTotMts ;
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
   private boolean n5171BarTipNTin ;
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
   private java.util.Date[] aP21 ;
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
   private short[] aP19 ;
   private String[] aP20 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A6J2_A396EmprCod ;
   private short[] P0A6J2_A2804RecLinMaq ;
   private String[] P0A6J2_A130BarCodPar ;
   private byte[] P0A6J2_A132BarCodReo ;
   private int[] P0A6J2_A129BarCod ;
   private java.math.BigDecimal[] P0A6J2_A4259RecTotKgs ;
   private java.math.BigDecimal[] P0A6J2_A4260RecTotMts ;
   private boolean[] P0A6J2_n4260RecTotMts ;
   private String[] P0A6J2_A5110RecNumPrg ;
   private String[] P0A6J3_A396EmprCod ;
   private int[] P0A6J3_A129BarCod ;
   private byte[] P0A6J3_A132BarCodReo ;
   private String[] P0A6J3_A130BarCodPar ;
   private short[] P0A6J3_A2804RecLinMaq ;
   private short[] P0A6J3_A10544RecNH2O ;
   private int[] P0A6J3_A4695RecVolPrf ;
   private byte[] P0A6J3_A1273RecLinPro ;
   private String[] P0A6J6_A396EmprCod ;
   private int[] P0A6J6_A129BarCod ;
   private byte[] P0A6J6_A132BarCodReo ;
   private String[] P0A6J6_A130BarCodPar ;
   private String[] P0A6J6_A212BarSer ;
   private String[] P0A6J6_A1652BarSerDsc ;
   private short[] P0A6J6_A217BarTipArt ;
   private boolean[] P0A6J6_n217BarTipArt ;
   private String[] P0A6J6_A135BarColNom ;
   private int[] P0A6J6_A136BarColNum ;
   private byte[] P0A6J6_A218BarTipCol ;
   private String[] P0A6J6_A180BarMaqCod ;
   private int[] P0A6J6_A236BarVolMaq ;
   private byte[] P0A6J6_A148BarEstReo ;
   private short[] P0A6J6_A189BarNumAny ;
   private short[] P0A6J6_A833TipDefCod ;
   private boolean[] P0A6J6_n833TipDefCod ;
   private String[] P0A6J6_A209BarPri ;
   private short[] P0A6J6_A4975BarNumReo ;
   private String[] P0A6J6_A2010BarTipDis ;
   private String[] P0A6J6_A5291BarTipCor ;
   private String[] P0A6J6_A4609BarMdlCod ;
   private String[] P0A6J6_A118BarAcaQui ;
   private String[] P0A6J6_A4812BarEncCli ;
   private String[] P0A6J6_A143BarDisNum ;
   private int[] P0A6J6_A252CliCod ;
   private boolean[] P0A6J6_n252CliCod ;
   private java.util.Date[] P0A6J6_A159BarFecGen ;
   private java.math.BigDecimal[] P0A6J6_A184BarMtr ;
   private java.math.BigDecimal[] P0A6J6_A870BarTotMtr ;
   private java.math.BigDecimal[] P0A6J6_A166BarKgm ;
   private java.math.BigDecimal[] P0A6J6_A219BarTotAgr ;
   private short[] P0A6J6_A199BarPie1 ;
   private String[] P0A6J6_A365DisDes ;
   private int[] P0A6J6_A898BarPieNDes ;
   private String[] P0A6J7_A396EmprCod ;
   private byte[] P0A6J7_A3648EstTinDia ;
   private byte[] P0A6J7_A3647EstTinMes ;
   private short[] P0A6J7_A3646EstTinAny ;
   private short[] P0A6J7_A3649EstTinUL ;
   private boolean[] P0A6J7_n3649EstTinUL ;
   private String[] P0A6J11_A396EmprCod ;
   private byte[] P0A6J11_A831TipColCod ;
   private int[] P0A6J11_A483ForColNum ;
   private String[] P0A6J11_A482ForColNom ;
   private String[] P0A6J11_A494ForSer ;
   private int[] P0A6J11_A252CliCod ;
   private boolean[] P0A6J11_n252CliCod ;
   private byte[] P0A6J11_A583IntCod ;
   private String[] P0A6J11_A1191ForNomCli ;
   private boolean[] P0A6J11_n1191ForNomCli ;
   private int[] P0A6J11_A1192ForNumCli ;
   private boolean[] P0A6J11_n1192ForNumCli ;
   private java.math.BigDecimal[] P0A6J11_A4380ForCosForm ;
   private boolean[] P0A6J11_n4380ForCosForm ;
   private java.math.BigDecimal[] P0A6J11_A2838ForRelBan ;
   private boolean[] P0A6J11_n2838ForRelBan ;
   private short[] P0A6J11_A8561Fam_Cod ;
   private boolean[] P0A6J11_n8561Fam_Cod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pcyesttin__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pcyesttin__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pcyesttin__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pcyesttin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A6J2", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecTotKgs, RecTotMts, RecNumPrg FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A6J3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecNH2O, RecVolPrf, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6J6", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarSer, T1.BarSerDsc, T1.BarTipArt, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarMaqCod, T1.BarVolMaq, T1.BarEstReo, T1.BarNumAny, T1.TipDefCod, T1.BarPri, T1.BarNumReo, T1.BarTipDis, T1.BarTipCor, T1.BarMdlCod, T1.BarAcaQui, T1.BarEncCli, T1.BarDisNum, T1.CliCod, T1.BarFecGen, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T3.BarTotMtr, 0) AS BarTotMtr, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T3.BarTotAgr, 0) AS BarTotAgr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1, SUM(BarPieKil) AS BarKgm, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(MtrAgr) AS BarTotMtr FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A6J7", "SELECT EmprCod, EstTinDia, EstTinMes, EstTinAny, EstTinUL FROM TXPCONTIN WHERE EmprCod = ? and EstTinAny = ? and EstTinMes = ? and EstTinDia = ? ORDER BY EmprCod, EstTinAny, EstTinMes, EstTinDia ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0A6J8", "INSERT INTO TXPCONTIN(EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinUL) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONTIN")
         ,new UpdateCursor("P0A6J9", "UPDATE TXPCONTIN SET EstTinUL=?  WHERE EmprCod = ? and EstTinAny = ? and EstTinMes = ? and EstTinDia = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCONTIN")
         ,new UpdateCursor("P0A6J10", "INSERT INTO TXPLCONTI(EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr, BarCodTin, BarReoTin, BarParTin, BarSerTin, BarDscTin, BarArtTin, BarColNoT, BarColNuT, BarTipCoT, BarNomClT, BarNumClT, BarMaqTin, BarVolTin, BarKgmTin, BarMtrTin, BarPieTin, CliCod, BarEstTin, BarAgrLot, BarNumAna, BarTipDef, BarIntens, BarPriCod, BarCosPD, BarCosAD, BarCosAA, BarCosPA, BarCosCol, BarCosAnc, BarNumActx, BarFaseCod, BarFaseOrd, BarReoNum, BarTipDTin, BarTipCTin, BarTipNTin, BarCosttTi, BarRbTeo, BarNumTin, BarRecAcb, BarKgsTt, FamCodT, BarNTint, BarAcs, BarNprg, BarLts, BarLtsV, BarDispCli, BarMtsTt, EstFecCier, BarNumPda, BarCausa, BarForNum, BarFecIt, BarFecFt, BarColNm, EstCdn1, EstCdn2, EstCtw) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLCONTI")
         ,new ForEachCursor("P0A6J11", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, IntCod, ForNomCli, ForNumCli, ForCosForm, ForRelBan, Fam_Cod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 1);
               ((String[]) buf[20])[0] = rslt.getString(19, 2);
               ((String[]) buf[21])[0] = rslt.getString(20, 13);
               ((String[]) buf[22])[0] = rslt.getString(21, 6);
               ((String[]) buf[23])[0] = rslt.getString(22, 20);
               ((String[]) buf[24])[0] = rslt.getString(23, 8);
               ((int[]) buf[25])[0] = rslt.getInt(24);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(25);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(28,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(29,2);
               ((short[]) buf[32])[0] = rslt.getShort(30);
               ((String[]) buf[33])[0] = rslt.getString(31, 1);
               ((int[]) buf[34])[0] = rslt.getInt(32);
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
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[76], 10);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(42, (java.math.BigDecimal)parms[78], 5);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(43, ((Number) parms[80]).shortValue());
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(44, ((Number) parms[82]).intValue());
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[84], 1);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(46, (java.math.BigDecimal)parms[86], 2);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[88]).shortValue());
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(48, ((Number) parms[90]).byteValue());
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
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[94], 6);
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(51, ((Number) parms[96]).intValue());
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(52, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[100], 20);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(54, (java.math.BigDecimal)parms[102], 2);
               }
               stmt.setDate(55, (java.util.Date)parms[103]);
               return;
            case 7 :
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

