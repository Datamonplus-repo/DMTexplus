package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkilreo extends GXProcedure
{
   public pkilreo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkilreo.class ), "" );
   }

   public pkilreo( int remoteHandle ,
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
      pkilreo.this.aP4 = new int[] {0};
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
      pkilreo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkilreo.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      pkilreo.this.AV9BarCodReo = aP2[0];
      this.aP2 = aP2;
      pkilreo.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      pkilreo.this.AV11DisCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV12Lindalana) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int2) ;
      pkilreo.this.GXt_int1 = GXv_int2[0] ;
      AV12Lindalana = GXt_int1 ;
      /* Using cursor P057R2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P057R2_A130BarCodPar[0] ;
         A132BarCodReo = P057R2_A132BarCodReo[0] ;
         A129BarCod = P057R2_A129BarCod[0] ;
         A213BarSit = P057R2_A213BarSit[0] ;
         A361DisCod = P057R2_A361DisCod[0] ;
         A365DisDes = P057R2_A365DisDes[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         /* Using cursor P057R3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A758ProCod = P057R3_A758ProCod[0] ;
            A761ProFasLin = P057R3_A761ProFasLin[0] ;
            n761ProFasLin = P057R3_n761ProFasLin[0] ;
            /* Using cursor P057R4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A194BarOrdLin = P057R4_A194BarOrdLin[0] ;
               /* Using cursor P057R5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
               /* Optimized DELETE. */
               /* Using cursor P057R6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
               /* End optimized DELETE. */
               /* Using cursor P057R7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               while ( (pr_default.getStatus(5) != 101) )
               {
                  A4643BarFasLot = P057R7_A4643BarFasLot[0] ;
                  /* Optimized DELETE. */
                  /* Using cursor P057R8 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPFA");
                  /* End optimized DELETE. */
                  /* Using cursor P057R9 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
                  pr_default.readNext(5);
               }
               pr_default.close(5);
               /* Optimized DELETE. */
               /* Using cursor P057R10 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
               /* End optimized DELETE. */
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Using cursor P057R11 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Using cursor P057R12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(10) != 101) )
         {
            A5322Dp_Nrecep = P057R12_A5322Dp_Nrecep[0] ;
            /* Using cursor P057R13 */
            pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
            while ( (pr_default.getStatus(11) != 101) )
            {
               A4344Dp_PzU = P057R13_A4344Dp_PzU[0] ;
               n4344Dp_PzU = P057R13_n4344Dp_PzU[0] ;
               A4982Dp_UnU = P057R13_A4982Dp_UnU[0] ;
               n4982Dp_UnU = P057R13_n4982Dp_UnU[0] ;
               A4979Dp_Plg = P057R13_A4979Dp_Plg[0] ;
               A4978Dp_Ubi = P057R13_A4978Dp_Ubi[0] ;
               GXv_char3[0] = A396EmprCod ;
               GXv_int4[0] = A5322Dp_Nrecep ;
               GXv_char5[0] = A4978Dp_Ubi ;
               GXv_int6[0] = A4979Dp_Plg ;
               GXv_int7[0] = A4344Dp_PzU ;
               GXv_decimal8[0] = A4982Dp_UnU ;
               GXv_int9[0] = 0 ;
               GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
               new app.pubiins(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_int6, GXv_int7, GXv_decimal8, GXv_int9, GXv_decimal10) ;
               pkilreo.this.A396EmprCod = GXv_char3[0] ;
               pkilreo.this.A5322Dp_Nrecep = GXv_int4[0] ;
               pkilreo.this.A4978Dp_Ubi = GXv_char5[0] ;
               pkilreo.this.A4979Dp_Plg = GXv_int6[0] ;
               pkilreo.this.A4344Dp_PzU = GXv_int7[0] ;
               pkilreo.this.A4982Dp_UnU = GXv_decimal8[0] ;
               /* Using cursor P057R14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep), A4978Dp_Ubi, Short.valueOf(A4979Dp_Plg)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIDPG");
               pr_default.readNext(11);
            }
            pr_default.close(11);
            /* Using cursor P057R15 */
            pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A5322Dp_Nrecep)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIDEP");
            pr_default.readNext(10);
         }
         pr_default.close(10);
         /* Optimized DELETE. */
         /* Using cursor P057R16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARNOT");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P057R17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAUD");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P057R18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
         /* End optimized DELETE. */
         if ( AV12Lindalana == 0 )
         {
            /* Using cursor P057R19 */
            pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(17) != 101) )
            {
               A5579XBarCodf = P057R19_A5579XBarCodf[0] ;
               A5580XCodReof = P057R19_A5580XCodReof[0] ;
               A5581XCodParf = P057R19_A5581XCodParf[0] ;
               A5575XTipColCod = P057R19_A5575XTipColCod[0] ;
               A5574XForColNum = P057R19_A5574XForColNum[0] ;
               A5573XForColNom = P057R19_A5573XForColNom[0] ;
               A5572XForSer = P057R19_A5572XForSer[0] ;
               A5571XCliCodf = P057R19_A5571XCliCodf[0] ;
               A5577XUltLinF = P057R19_A5577XUltLinF[0] ;
               n5577XUltLinF = P057R19_n5577XUltLinF[0] ;
               /* Optimized DELETE. */
               /* Using cursor P057R20 */
               pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A5571XCliCodf), A5572XForSer, A5573XForColNom, Integer.valueOf(A5574XForColNum), Byte.valueOf(A5575XTipColCod), Integer.valueOf(A5579XBarCodf), Byte.valueOf(A5580XCodReof), A5581XCodParf});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXLFOR1");
               /* End optimized DELETE. */
               /* Using cursor P057R21 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A5571XCliCodf), A5572XForSer, A5573XForColNom, Integer.valueOf(A5574XForColNum), Byte.valueOf(A5575XTipColCod), Integer.valueOf(A5579XBarCodf), Byte.valueOf(A5580XCodReof), A5581XCodParf});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPXLFORM");
               pr_default.readNext(17);
            }
            pr_default.close(17);
         }
         /* Optimized DELETE. */
         /* Using cursor P057R22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPLLBar");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P057R23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
         /* End optimized DELETE. */
         /* Using cursor P057R24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(22) != 101) )
         {
            A13988BarPieVtx = P057R24_A13988BarPieVtx[0] ;
            A13519BarPieMq = P057R24_A13519BarPieMq[0] ;
            n13519BarPieMq = P057R24_n13519BarPieMq[0] ;
            A13518BarPieTurn = P057R24_A13518BarPieTurn[0] ;
            n13518BarPieTurn = P057R24_n13518BarPieTurn[0] ;
            A13109BarPieST = P057R24_A13109BarPieST[0] ;
            n13109BarPieST = P057R24_n13109BarPieST[0] ;
            A13108BarPieLote = P057R24_A13108BarPieLote[0] ;
            n13108BarPieLote = P057R24_n13108BarPieLote[0] ;
            A13107BarPieEmp = P057R24_A13107BarPieEmp[0] ;
            n13107BarPieEmp = P057R24_n13107BarPieEmp[0] ;
            A13004BarPieDest = P057R24_A13004BarPieDest[0] ;
            n13004BarPieDest = P057R24_n13004BarPieDest[0] ;
            A12992BarPieOpe = P057R24_A12992BarPieOpe[0] ;
            n12992BarPieOpe = P057R24_n12992BarPieOpe[0] ;
            A12936BarPieSecu = P057R24_A12936BarPieSecu[0] ;
            n12936BarPieSecu = P057R24_n12936BarPieSecu[0] ;
            A12935BarPieTono = P057R24_A12935BarPieTono[0] ;
            n12935BarPieTono = P057R24_n12935BarPieTono[0] ;
            A12928BarPieEncC = P057R24_A12928BarPieEncC[0] ;
            n12928BarPieEncC = P057R24_n12928BarPieEncC[0] ;
            A12927BarPieCoCN = P057R24_A12927BarPieCoCN[0] ;
            n12927BarPieCoCN = P057R24_n12927BarPieCoCN[0] ;
            A12926BarPieCoCI = P057R24_A12926BarPieCoCI[0] ;
            n12926BarPieCoCI = P057R24_n12926BarPieCoCI[0] ;
            A12925BarPieCliN = P057R24_A12925BarPieCliN[0] ;
            n12925BarPieCliN = P057R24_n12925BarPieCliN[0] ;
            A12924BarPieCliI = P057R24_A12924BarPieCliI[0] ;
            n12924BarPieCliI = P057R24_n12924BarPieCliI[0] ;
            A12923BarPieArtD = P057R24_A12923BarPieArtD[0] ;
            n12923BarPieArtD = P057R24_n12923BarPieArtD[0] ;
            A12922BarPieArtI = P057R24_A12922BarPieArtI[0] ;
            n12922BarPieArtI = P057R24_n12922BarPieArtI[0] ;
            A12921BarPieColN = P057R24_A12921BarPieColN[0] ;
            n12921BarPieColN = P057R24_n12921BarPieColN[0] ;
            A12920BarPieColD = P057R24_A12920BarPieColD[0] ;
            n12920BarPieColD = P057R24_n12920BarPieColD[0] ;
            A12912BarPieUltD = P057R24_A12912BarPieUltD[0] ;
            n12912BarPieUltD = P057R24_n12912BarPieUltD[0] ;
            A12911BarPieFep = P057R24_A12911BarPieFep[0] ;
            n12911BarPieFep = P057R24_n12911BarPieFep[0] ;
            A12780BarPieUsu = P057R24_A12780BarPieUsu[0] ;
            n12780BarPieUsu = P057R24_n12780BarPieUsu[0] ;
            A12779BarPieFdv = P057R24_A12779BarPieFdv[0] ;
            n12779BarPieFdv = P057R24_n12779BarPieFdv[0] ;
            A12113BarPieCLd = P057R24_A12113BarPieCLd[0] ;
            n12113BarPieCLd = P057R24_n12113BarPieCLd[0] ;
            A1642BarPieOrd = P057R24_A1642BarPieOrd[0] ;
            n1642BarPieOrd = P057R24_n1642BarPieOrd[0] ;
            A6473BarUniB = P057R24_A6473BarUniB[0] ;
            n6473BarUniB = P057R24_n6473BarUniB[0] ;
            A6472BarTara = P057R24_A6472BarTara[0] ;
            n6472BarTara = P057R24_n6472BarTara[0] ;
            A1919BarPieObs = P057R24_A1919BarPieObs[0] ;
            n1919BarPieObs = P057R24_n1919BarPieObs[0] ;
            A9984BarPiePda = P057R24_A9984BarPiePda[0] ;
            n9984BarPiePda = P057R24_n9984BarPiePda[0] ;
            A9846BarPieAncc = P057R24_A9846BarPieAncc[0] ;
            n9846BarPieAncc = P057R24_n9846BarPieAncc[0] ;
            A9800BarNPes = P057R24_A9800BarNPes[0] ;
            n9800BarNPes = P057R24_n9800BarNPes[0] ;
            A9799BarPz2 = P057R24_A9799BarPz2[0] ;
            n9799BarPz2 = P057R24_n9799BarPz2[0] ;
            A9798BarPz1 = P057R24_A9798BarPz1[0] ;
            n9798BarPz1 = P057R24_n9798BarPz1[0] ;
            A9796BarPieK2 = P057R24_A9796BarPieK2[0] ;
            n9796BarPieK2 = P057R24_n9796BarPieK2[0] ;
            A9795BarPieK1 = P057R24_A9795BarPieK1[0] ;
            n9795BarPieK1 = P057R24_n9795BarPieK1[0] ;
            A8907PzaB80 = P057R24_A8907PzaB80[0] ;
            n8907PzaB80 = P057R24_n8907PzaB80[0] ;
            A8838CodBarPz = P057R24_A8838CodBarPz[0] ;
            n8838CodBarPz = P057R24_n8838CodBarPz[0] ;
            A8707BapieObs = P057R24_A8707BapieObs[0] ;
            n8707BapieObs = P057R24_n8707BapieObs[0] ;
            A6489BarPieIdPz = P057R24_A6489BarPieIdPz[0] ;
            n6489BarPieIdPz = P057R24_n6489BarPieIdPz[0] ;
            A6116BarPieImp = P057R24_A6116BarPieImp[0] ;
            n6116BarPieImp = P057R24_n6116BarPieImp[0] ;
            A3277BarPieAut = P057R24_A3277BarPieAut[0] ;
            n3277BarPieAut = P057R24_n3277BarPieAut[0] ;
            A3276BarMtsAut = P057R24_A3276BarMtsAut[0] ;
            n3276BarMtsAut = P057R24_n3276BarMtsAut[0] ;
            A3275BarKgsAut = P057R24_A3275BarKgsAut[0] ;
            n3275BarKgsAut = P057R24_n3275BarKgsAut[0] ;
            A2186BarPieLoc = P057R24_A2186BarPieLoc[0] ;
            n2186BarPieLoc = P057R24_n2186BarPieLoc[0] ;
            A1691BarPieAnc = P057R24_A1691BarPieAnc[0] ;
            n1691BarPieAnc = P057R24_n1691BarPieAnc[0] ;
            A1501BarPiePie = P057R24_A1501BarPiePie[0] ;
            A1271BarPieLzd = P057R24_A1271BarPieLzd[0] ;
            A908PieOriCod = P057R24_A908PieOriCod[0] ;
            A197BarPConTro = P057R24_A197BarPConTro[0] ;
            A183BarMetLan = P057R24_A183BarMetLan[0] ;
            A170BarKilLan = P057R24_A170BarKilLan[0] ;
            A201BarPieEst = P057R24_A201BarPieEst[0] ;
            A205BarPieMet = P057R24_A205BarPieMet[0] ;
            A203BarPieKil = P057R24_A203BarPieKil[0] ;
            A44AlbRecCod = P057R24_A44AlbRecCod[0] ;
            A200BarPieCod = P057R24_A200BarPieCod[0] ;
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            /*
               INSERT RECORD ON TABLE TXPBARPIE

            */
            W396EmprCod = A396EmprCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W200BarPieCod = A200BarPieCod ;
            A129BarCod = AV8BarCod ;
            A132BarCodReo = (byte)(0) ;
            A130BarCodPar = AV10BarCodPar ;
            /* Using cursor P057R25 */
            pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Integer.valueOf(A44AlbRecCod), A203BarPieKil, A205BarPieMet, Byte.valueOf(A201BarPieEst), A170BarKilLan, A183BarMetLan, Short.valueOf(A197BarPConTro), A908PieOriCod, Integer.valueOf(A1271BarPieLzd), Integer.valueOf(A1501BarPiePie), Boolean.valueOf(n1691BarPieAnc), Short.valueOf(A1691BarPieAnc), Boolean.valueOf(n2186BarPieLoc), A2186BarPieLoc, Boolean.valueOf(n3275BarKgsAut), A3275BarKgsAut, Boolean.valueOf(n3276BarMtsAut), A3276BarMtsAut, Boolean.valueOf(n3277BarPieAut), Short.valueOf(A3277BarPieAut), Boolean.valueOf(n6116BarPieImp), A6116BarPieImp, Boolean.valueOf(n6489BarPieIdPz), A6489BarPieIdPz, Boolean.valueOf(n8707BapieObs), A8707BapieObs, Boolean.valueOf(n8838CodBarPz), A8838CodBarPz, Boolean.valueOf(n8907PzaB80), A8907PzaB80, Boolean.valueOf(n9795BarPieK1), A9795BarPieK1, Boolean.valueOf(n9796BarPieK2), A9796BarPieK2, Boolean.valueOf(n9798BarPz1), Integer.valueOf(A9798BarPz1), Boolean.valueOf(n9799BarPz2), Integer.valueOf(A9799BarPz2), Boolean.valueOf(n9800BarNPes), Byte.valueOf(A9800BarNPes), Boolean.valueOf(n9846BarPieAncc), Short.valueOf(A9846BarPieAncc), Boolean.valueOf(n9984BarPiePda), A9984BarPiePda, Boolean.valueOf(n1919BarPieObs), A1919BarPieObs, Boolean.valueOf(n6472BarTara), A6472BarTara, Boolean.valueOf(n6473BarUniB), A6473BarUniB, Boolean.valueOf(n1642BarPieOrd), Integer.valueOf(A1642BarPieOrd), Boolean.valueOf(n12113BarPieCLd), Byte.valueOf(A12113BarPieCLd), Boolean.valueOf(n12779BarPieFdv), A12779BarPieFdv, Boolean.valueOf(n12780BarPieUsu), A12780BarPieUsu, Boolean.valueOf(n12911BarPieFep), A12911BarPieFep, Boolean.valueOf(n12912BarPieUltD), Short.valueOf(A12912BarPieUltD), Boolean.valueOf(n12920BarPieColD), A12920BarPieColD, Boolean.valueOf(n12921BarPieColN), Integer.valueOf(A12921BarPieColN), Boolean.valueOf(n12922BarPieArtI), A12922BarPieArtI, Boolean.valueOf(n12923BarPieArtD), A12923BarPieArtD, Boolean.valueOf(n12924BarPieCliI), Integer.valueOf(A12924BarPieCliI), Boolean.valueOf(n12925BarPieCliN), A12925BarPieCliN, Boolean.valueOf(n12926BarPieCoCI), A12926BarPieCoCI, Boolean.valueOf(n12927BarPieCoCN), Integer.valueOf(A12927BarPieCoCN), Boolean.valueOf(n12928BarPieEncC), A12928BarPieEncC, Boolean.valueOf(n12935BarPieTono), A12935BarPieTono, Boolean.valueOf(n12936BarPieSecu), A12936BarPieSecu, Boolean.valueOf(n12992BarPieOpe), Integer.valueOf(A12992BarPieOpe), Boolean.valueOf(n13004BarPieDest), Byte.valueOf(A13004BarPieDest), Boolean.valueOf(n13107BarPieEmp), Short.valueOf(A13107BarPieEmp), Boolean.valueOf(n13108BarPieLote), A13108BarPieLote, Boolean.valueOf(n13109BarPieST), A13109BarPieST, Boolean.valueOf(n13518BarPieTurn), Byte.valueOf(A13518BarPieTurn), Boolean.valueOf(n13519BarPieMq), A13519BarPieMq, A13988BarPieVtx});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            if ( (pr_default.getStatus(23) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A200BarPieCod = W200BarPieCod ;
            /* End Insert */
            /* Using cursor P057R26 */
            pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            A396EmprCod = W396EmprCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            pr_default.readNext(22);
         }
         pr_default.close(22);
         AV14DisPos = A361DisCod ;
         AV13DisDes = A365DisDes ;
         /* Execute user subroutine: 'BUSDIS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P057R27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P057R28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(AV11DisCod)});
      while ( (pr_default.getStatus(26) != 101) )
      {
         A361DisCod = P057R28_A361DisCod[0] ;
         /* Optimized DELETE. */
         /* Using cursor P057R29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
         /* End optimized DELETE. */
         /* Using cursor P057R30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(26);
      /* Optimized DELETE. */
      /* Using cursor P057R31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(AV11DisCod), Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISBAR");
      /* End optimized DELETE. */
      /* Using cursor P057R32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(30) != 101) )
      {
         A130BarCodPar = P057R32_A130BarCodPar[0] ;
         A132BarCodReo = P057R32_A132BarCodReo[0] ;
         A129BarCod = P057R32_A129BarCod[0] ;
         A671PieAgr = P057R32_A671PieAgr[0] ;
         A119BarAgrCod = P057R32_A119BarAgrCod[0] ;
         A124BarAgrReo = P057R32_A124BarAgrReo[0] ;
         A122BarAgrPar = P057R32_A122BarAgrPar[0] ;
         AV17BarCodAgr = A119BarAgrCod ;
         AV15BarReoAgr = A124BarAgrReo ;
         AV16BarParAgr = A122BarAgrPar ;
         /* Using cursor P057R33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
         pr_default.readNext(30);
      }
      pr_default.close(30);
      /* Optimized DELETE. */
      /* Using cursor P057R34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
      /* End optimized DELETE. */
      cleanup();
   }

   public void S111( )
   {
      /* 'BUSDIS' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P057R35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(AV14DisPos)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISNOR");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P057R36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(AV14DisPos)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISATI");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P057R37 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(AV14DisPos)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P057R38 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(AV14DisPos)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P057R39 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(AV14DisPos)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
      /* End optimized DELETE. */
      /* Using cursor P057R40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(AV14DisPos)});
      while ( (pr_default.getStatus(38) != 101) )
      {
         A758ProCod = P057R40_A758ProCod[0] ;
         A361DisCod = P057R40_A361DisCod[0] ;
         A846UltFasLin = P057R40_A846UltFasLin[0] ;
         /* Using cursor P057R41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         while ( (pr_default.getStatus(39) != 101) )
         {
            A368DisFasLin = P057R41_A368DisFasLin[0] ;
            /* Using cursor P057R42 */
            pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
            /* Optimized DELETE. */
            /* Using cursor P057R43 */
            pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPAR");
            /* End optimized DELETE. */
            pr_default.readNext(39);
         }
         pr_default.close(39);
         /* Using cursor P057R44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
         pr_default.readNext(38);
      }
      pr_default.close(38);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkilreo.this.A396EmprCod;
      this.aP1[0] = pkilreo.this.AV8BarCod;
      this.aP2[0] = pkilreo.this.AV9BarCodReo;
      this.aP3[0] = pkilreo.this.AV10BarCodPar;
      this.aP4[0] = pkilreo.this.AV11DisCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pkilreo");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P057R2_A396EmprCod = new String[] {""} ;
      P057R2_A130BarCodPar = new String[] {""} ;
      P057R2_A132BarCodReo = new byte[1] ;
      P057R2_A129BarCod = new int[1] ;
      P057R2_A213BarSit = new byte[1] ;
      P057R2_A361DisCod = new int[1] ;
      P057R2_A365DisDes = new String[] {""} ;
      A130BarCodPar = "" ;
      A365DisDes = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      P057R3_A396EmprCod = new String[] {""} ;
      P057R3_A129BarCod = new int[1] ;
      P057R3_A132BarCodReo = new byte[1] ;
      P057R3_A130BarCodPar = new String[] {""} ;
      P057R3_A758ProCod = new String[] {""} ;
      P057R3_A761ProFasLin = new short[1] ;
      P057R3_n761ProFasLin = new boolean[] {false} ;
      A758ProCod = "" ;
      P057R4_A396EmprCod = new String[] {""} ;
      P057R4_A129BarCod = new int[1] ;
      P057R4_A132BarCodReo = new byte[1] ;
      P057R4_A130BarCodPar = new String[] {""} ;
      P057R4_A758ProCod = new String[] {""} ;
      P057R4_A194BarOrdLin = new short[1] ;
      P057R7_A396EmprCod = new String[] {""} ;
      P057R7_A129BarCod = new int[1] ;
      P057R7_A132BarCodReo = new byte[1] ;
      P057R7_A130BarCodPar = new String[] {""} ;
      P057R7_A758ProCod = new String[] {""} ;
      P057R7_A194BarOrdLin = new short[1] ;
      P057R7_A4643BarFasLot = new int[1] ;
      P057R12_A396EmprCod = new String[] {""} ;
      P057R12_A129BarCod = new int[1] ;
      P057R12_A132BarCodReo = new byte[1] ;
      P057R12_A130BarCodPar = new String[] {""} ;
      P057R12_A5322Dp_Nrecep = new int[1] ;
      P057R13_A396EmprCod = new String[] {""} ;
      P057R13_A129BarCod = new int[1] ;
      P057R13_A132BarCodReo = new byte[1] ;
      P057R13_A130BarCodPar = new String[] {""} ;
      P057R13_A5322Dp_Nrecep = new int[1] ;
      P057R13_A4344Dp_PzU = new int[1] ;
      P057R13_n4344Dp_PzU = new boolean[] {false} ;
      P057R13_A4982Dp_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057R13_n4982Dp_UnU = new boolean[] {false} ;
      P057R13_A4979Dp_Plg = new short[1] ;
      P057R13_A4978Dp_Ubi = new String[] {""} ;
      A4982Dp_UnU = DecimalUtil.ZERO ;
      A4978Dp_Ubi = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_int7 = new int[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int9 = new int[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      P057R19_A396EmprCod = new String[] {""} ;
      P057R19_A5579XBarCodf = new int[1] ;
      P057R19_A5580XCodReof = new byte[1] ;
      P057R19_A5581XCodParf = new String[] {""} ;
      P057R19_A5575XTipColCod = new byte[1] ;
      P057R19_A5574XForColNum = new int[1] ;
      P057R19_A5573XForColNom = new String[] {""} ;
      P057R19_A5572XForSer = new String[] {""} ;
      P057R19_A5571XCliCodf = new int[1] ;
      P057R19_A5577XUltLinF = new short[1] ;
      P057R19_n5577XUltLinF = new boolean[] {false} ;
      A5581XCodParf = "" ;
      A5573XForColNom = "" ;
      A5572XForSer = "" ;
      P057R24_A396EmprCod = new String[] {""} ;
      P057R24_A129BarCod = new int[1] ;
      P057R24_A132BarCodReo = new byte[1] ;
      P057R24_A130BarCodPar = new String[] {""} ;
      P057R24_A13988BarPieVtx = new String[] {""} ;
      P057R24_A13519BarPieMq = new String[] {""} ;
      P057R24_n13519BarPieMq = new boolean[] {false} ;
      P057R24_A13518BarPieTurn = new byte[1] ;
      P057R24_n13518BarPieTurn = new boolean[] {false} ;
      P057R24_A13109BarPieST = new String[] {""} ;
      P057R24_n13109BarPieST = new boolean[] {false} ;
      P057R24_A13108BarPieLote = new String[] {""} ;
      P057R24_n13108BarPieLote = new boolean[] {false} ;
      P057R24_A13107BarPieEmp = new short[1] ;
      P057R24_n13107BarPieEmp = new boolean[] {false} ;
      P057R24_A13004BarPieDest = new byte[1] ;
      P057R24_n13004BarPieDest = new boolean[] {false} ;
      P057R24_A12992BarPieOpe = new int[1] ;
      P057R24_n12992BarPieOpe = new boolean[] {false} ;
      P057R24_A12936BarPieSecu = new String[] {""} ;
      P057R24_n12936BarPieSecu = new boolean[] {false} ;
      P057R24_A12935BarPieTono = new String[] {""} ;
      P057R24_n12935BarPieTono = new boolean[] {false} ;
      P057R24_A12928BarPieEncC = new String[] {""} ;
      P057R24_n12928BarPieEncC = new boolean[] {false} ;
      P057R24_A12927BarPieCoCN = new int[1] ;
      P057R24_n12927BarPieCoCN = new boolean[] {false} ;
      P057R24_A12926BarPieCoCI = new String[] {""} ;
      P057R24_n12926BarPieCoCI = new boolean[] {false} ;
      P057R24_A12925BarPieCliN = new String[] {""} ;
      P057R24_n12925BarPieCliN = new boolean[] {false} ;
      P057R24_A12924BarPieCliI = new int[1] ;
      P057R24_n12924BarPieCliI = new boolean[] {false} ;
      P057R24_A12923BarPieArtD = new String[] {""} ;
      P057R24_n12923BarPieArtD = new boolean[] {false} ;
      P057R24_A12922BarPieArtI = new String[] {""} ;
      P057R24_n12922BarPieArtI = new boolean[] {false} ;
      P057R24_A12921BarPieColN = new int[1] ;
      P057R24_n12921BarPieColN = new boolean[] {false} ;
      P057R24_A12920BarPieColD = new String[] {""} ;
      P057R24_n12920BarPieColD = new boolean[] {false} ;
      P057R24_A12912BarPieUltD = new short[1] ;
      P057R24_n12912BarPieUltD = new boolean[] {false} ;
      P057R24_A12911BarPieFep = new java.util.Date[] {GXutil.nullDate()} ;
      P057R24_n12911BarPieFep = new boolean[] {false} ;
      P057R24_A12780BarPieUsu = new String[] {""} ;
      P057R24_n12780BarPieUsu = new boolean[] {false} ;
      P057R24_A12779BarPieFdv = new java.util.Date[] {GXutil.nullDate()} ;
      P057R24_n12779BarPieFdv = new boolean[] {false} ;
      P057R24_A12113BarPieCLd = new byte[1] ;
      P057R24_n12113BarPieCLd = new boolean[] {false} ;
      P057R24_A1642BarPieOrd = new int[1] ;
      P057R24_n1642BarPieOrd = new boolean[] {false} ;
      P057R24_A6473BarUniB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057R24_n6473BarUniB = new boolean[] {false} ;
      P057R24_A6472BarTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057R24_n6472BarTara = new boolean[] {false} ;
      P057R24_A1919BarPieObs = new String[] {""} ;
      P057R24_n1919BarPieObs = new boolean[] {false} ;
      P057R24_A9984BarPiePda = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057R24_n9984BarPiePda = new boolean[] {false} ;
      P057R24_A9846BarPieAncc = new short[1] ;
      P057R24_n9846BarPieAncc = new boolean[] {false} ;
      P057R24_A9800BarNPes = new byte[1] ;
      P057R24_n9800BarNPes = new boolean[] {false} ;
      P057R24_A9799BarPz2 = new int[1] ;
      P057R24_n9799BarPz2 = new boolean[] {false} ;
      P057R24_A9798BarPz1 = new int[1] ;
      P057R24_n9798BarPz1 = new boolean[] {false} ;
      P057R24_A9796BarPieK2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057R24_n9796BarPieK2 = new boolean[] {false} ;
      P057R24_A9795BarPieK1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057R24_n9795BarPieK1 = new boolean[] {false} ;
      P057R24_A8907PzaB80 = new String[] {""} ;
      P057R24_n8907PzaB80 = new boolean[] {false} ;
      P057R24_A8838CodBarPz = new String[] {""} ;
      P057R24_n8838CodBarPz = new boolean[] {false} ;
      P057R24_A8707BapieObs = new String[] {""} ;
      P057R24_n8707BapieObs = new boolean[] {false} ;
      P057R24_A6489BarPieIdPz = new String[] {""} ;
      P057R24_n6489BarPieIdPz = new boolean[] {false} ;
      P057R24_A6116BarPieImp = new String[] {""} ;
      P057R24_n6116BarPieImp = new boolean[] {false} ;
      P057R24_A3277BarPieAut = new short[1] ;
      P057R24_n3277BarPieAut = new boolean[] {false} ;
      P057R24_A3276BarMtsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057R24_n3276BarMtsAut = new boolean[] {false} ;
      P057R24_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057R24_n3275BarKgsAut = new boolean[] {false} ;
      P057R24_A2186BarPieLoc = new String[] {""} ;
      P057R24_n2186BarPieLoc = new boolean[] {false} ;
      P057R24_A1691BarPieAnc = new short[1] ;
      P057R24_n1691BarPieAnc = new boolean[] {false} ;
      P057R24_A1501BarPiePie = new int[1] ;
      P057R24_A1271BarPieLzd = new int[1] ;
      P057R24_A908PieOriCod = new String[] {""} ;
      P057R24_A197BarPConTro = new short[1] ;
      P057R24_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057R24_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057R24_A201BarPieEst = new byte[1] ;
      P057R24_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057R24_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057R24_A44AlbRecCod = new int[1] ;
      P057R24_A200BarPieCod = new String[] {""} ;
      A13988BarPieVtx = "" ;
      A13519BarPieMq = "" ;
      A13109BarPieST = "" ;
      A13108BarPieLote = "" ;
      A12936BarPieSecu = "" ;
      A12935BarPieTono = "" ;
      A12928BarPieEncC = "" ;
      A12926BarPieCoCI = "" ;
      A12925BarPieCliN = "" ;
      A12923BarPieArtD = "" ;
      A12922BarPieArtI = "" ;
      A12920BarPieColD = "" ;
      A12911BarPieFep = GXutil.nullDate() ;
      A12780BarPieUsu = "" ;
      A12779BarPieFdv = GXutil.nullDate() ;
      A6473BarUniB = DecimalUtil.ZERO ;
      A6472BarTara = DecimalUtil.ZERO ;
      A1919BarPieObs = "" ;
      A9984BarPiePda = DecimalUtil.ZERO ;
      A9796BarPieK2 = DecimalUtil.ZERO ;
      A9795BarPieK1 = DecimalUtil.ZERO ;
      A8907PzaB80 = "" ;
      A8838CodBarPz = "" ;
      A8707BapieObs = "" ;
      A6489BarPieIdPz = "" ;
      A6116BarPieImp = "" ;
      A3276BarMtsAut = DecimalUtil.ZERO ;
      A3275BarKgsAut = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      A908PieOriCod = "" ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      W200BarPieCod = "" ;
      Gx_emsg = "" ;
      AV13DisDes = "" ;
      P057R28_A396EmprCod = new String[] {""} ;
      P057R28_A361DisCod = new int[1] ;
      P057R32_A396EmprCod = new String[] {""} ;
      P057R32_A130BarCodPar = new String[] {""} ;
      P057R32_A132BarCodReo = new byte[1] ;
      P057R32_A129BarCod = new int[1] ;
      P057R32_A671PieAgr = new short[1] ;
      P057R32_A119BarAgrCod = new int[1] ;
      P057R32_A124BarAgrReo = new byte[1] ;
      P057R32_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      AV16BarParAgr = "" ;
      P057R40_A396EmprCod = new String[] {""} ;
      P057R40_A758ProCod = new String[] {""} ;
      P057R40_A361DisCod = new int[1] ;
      P057R40_A846UltFasLin = new short[1] ;
      P057R41_A396EmprCod = new String[] {""} ;
      P057R41_A361DisCod = new int[1] ;
      P057R41_A758ProCod = new String[] {""} ;
      P057R41_A368DisFasLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkilreo__default(),
         new Object[] {
             new Object[] {
            P057R2_A396EmprCod, P057R2_A130BarCodPar, P057R2_A132BarCodReo, P057R2_A129BarCod, P057R2_A213BarSit, P057R2_A361DisCod, P057R2_A365DisDes
            }
            , new Object[] {
            P057R3_A396EmprCod, P057R3_A129BarCod, P057R3_A132BarCodReo, P057R3_A130BarCodPar, P057R3_A758ProCod, P057R3_A761ProFasLin, P057R3_n761ProFasLin
            }
            , new Object[] {
            P057R4_A396EmprCod, P057R4_A129BarCod, P057R4_A132BarCodReo, P057R4_A130BarCodPar, P057R4_A758ProCod, P057R4_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P057R7_A396EmprCod, P057R7_A129BarCod, P057R7_A132BarCodReo, P057R7_A130BarCodPar, P057R7_A758ProCod, P057R7_A194BarOrdLin, P057R7_A4643BarFasLot
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
            P057R12_A396EmprCod, P057R12_A129BarCod, P057R12_A132BarCodReo, P057R12_A130BarCodPar, P057R12_A5322Dp_Nrecep
            }
            , new Object[] {
            P057R13_A396EmprCod, P057R13_A129BarCod, P057R13_A132BarCodReo, P057R13_A130BarCodPar, P057R13_A5322Dp_Nrecep, P057R13_A4344Dp_PzU, P057R13_n4344Dp_PzU, P057R13_A4982Dp_UnU, P057R13_n4982Dp_UnU, P057R13_A4979Dp_Plg,
            P057R13_A4978Dp_Ubi
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
            P057R19_A396EmprCod, P057R19_A5579XBarCodf, P057R19_A5580XCodReof, P057R19_A5581XCodParf, P057R19_A5575XTipColCod, P057R19_A5574XForColNum, P057R19_A5573XForColNom, P057R19_A5572XForSer, P057R19_A5571XCliCodf, P057R19_A5577XUltLinF,
            P057R19_n5577XUltLinF
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
            P057R24_A396EmprCod, P057R24_A129BarCod, P057R24_A132BarCodReo, P057R24_A130BarCodPar, P057R24_A13988BarPieVtx, P057R24_A13519BarPieMq, P057R24_n13519BarPieMq, P057R24_A13518BarPieTurn, P057R24_n13518BarPieTurn, P057R24_A13109BarPieST,
            P057R24_n13109BarPieST, P057R24_A13108BarPieLote, P057R24_n13108BarPieLote, P057R24_A13107BarPieEmp, P057R24_n13107BarPieEmp, P057R24_A13004BarPieDest, P057R24_n13004BarPieDest, P057R24_A12992BarPieOpe, P057R24_n12992BarPieOpe, P057R24_A12936BarPieSecu,
            P057R24_n12936BarPieSecu, P057R24_A12935BarPieTono, P057R24_n12935BarPieTono, P057R24_A12928BarPieEncC, P057R24_n12928BarPieEncC, P057R24_A12927BarPieCoCN, P057R24_n12927BarPieCoCN, P057R24_A12926BarPieCoCI, P057R24_n12926BarPieCoCI, P057R24_A12925BarPieCliN,
            P057R24_n12925BarPieCliN, P057R24_A12924BarPieCliI, P057R24_n12924BarPieCliI, P057R24_A12923BarPieArtD, P057R24_n12923BarPieArtD, P057R24_A12922BarPieArtI, P057R24_n12922BarPieArtI, P057R24_A12921BarPieColN, P057R24_n12921BarPieColN, P057R24_A12920BarPieColD,
            P057R24_n12920BarPieColD, P057R24_A12912BarPieUltD, P057R24_n12912BarPieUltD, P057R24_A12911BarPieFep, P057R24_n12911BarPieFep, P057R24_A12780BarPieUsu, P057R24_n12780BarPieUsu, P057R24_A12779BarPieFdv, P057R24_n12779BarPieFdv, P057R24_A12113BarPieCLd,
            P057R24_n12113BarPieCLd, P057R24_A1642BarPieOrd, P057R24_n1642BarPieOrd, P057R24_A6473BarUniB, P057R24_n6473BarUniB, P057R24_A6472BarTara, P057R24_n6472BarTara, P057R24_A1919BarPieObs, P057R24_n1919BarPieObs, P057R24_A9984BarPiePda,
            P057R24_n9984BarPiePda, P057R24_A9846BarPieAncc, P057R24_n9846BarPieAncc, P057R24_A9800BarNPes, P057R24_n9800BarNPes, P057R24_A9799BarPz2, P057R24_n9799BarPz2, P057R24_A9798BarPz1, P057R24_n9798BarPz1, P057R24_A9796BarPieK2,
            P057R24_n9796BarPieK2, P057R24_A9795BarPieK1, P057R24_n9795BarPieK1, P057R24_A8907PzaB80, P057R24_n8907PzaB80, P057R24_A8838CodBarPz, P057R24_n8838CodBarPz, P057R24_A8707BapieObs, P057R24_n8707BapieObs, P057R24_A6489BarPieIdPz,
            P057R24_n6489BarPieIdPz, P057R24_A6116BarPieImp, P057R24_n6116BarPieImp, P057R24_A3277BarPieAut, P057R24_n3277BarPieAut, P057R24_A3276BarMtsAut, P057R24_n3276BarMtsAut, P057R24_A3275BarKgsAut, P057R24_n3275BarKgsAut, P057R24_A2186BarPieLoc,
            P057R24_n2186BarPieLoc, P057R24_A1691BarPieAnc, P057R24_n1691BarPieAnc, P057R24_A1501BarPiePie, P057R24_A1271BarPieLzd, P057R24_A908PieOriCod, P057R24_A197BarPConTro, P057R24_A183BarMetLan, P057R24_A170BarKilLan, P057R24_A201BarPieEst,
            P057R24_A205BarPieMet, P057R24_A203BarPieKil, P057R24_A44AlbRecCod, P057R24_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P057R28_A396EmprCod, P057R28_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P057R32_A396EmprCod, P057R32_A130BarCodPar, P057R32_A132BarCodReo, P057R32_A129BarCod, P057R32_A671PieAgr, P057R32_A119BarAgrCod, P057R32_A124BarAgrReo, P057R32_A122BarAgrPar
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
            P057R40_A396EmprCod, P057R40_A758ProCod, P057R40_A361DisCod, P057R40_A846UltFasLin
            }
            , new Object[] {
            P057R41_A396EmprCod, P057R41_A361DisCod, P057R41_A758ProCod, P057R41_A368DisFasLin
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

   private byte AV9BarCodReo ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte W132BarCodReo ;
   private byte A5580XCodReof ;
   private byte A5575XTipColCod ;
   private byte A13518BarPieTurn ;
   private byte A13004BarPieDest ;
   private byte A12113BarPieCLd ;
   private byte A9800BarNPes ;
   private byte A201BarPieEst ;
   private byte A124BarAgrReo ;
   private byte AV15BarReoAgr ;
   private short AV12Lindalana ;
   private short A761ProFasLin ;
   private short A194BarOrdLin ;
   private short A4979Dp_Plg ;
   private short GXv_int6[] ;
   private short A5577XUltLinF ;
   private short A13107BarPieEmp ;
   private short A12912BarPieUltD ;
   private short A9846BarPieAncc ;
   private short A3277BarPieAut ;
   private short A1691BarPieAnc ;
   private short A197BarPConTro ;
   private short Gx_err ;
   private short A671PieAgr ;
   private short A846UltFasLin ;
   private short A368DisFasLin ;
   private int AV8BarCod ;
   private int AV11DisCod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int W129BarCod ;
   private int A4643BarFasLot ;
   private int A5322Dp_Nrecep ;
   private int A4344Dp_PzU ;
   private int GXv_int4[] ;
   private int GXv_int7[] ;
   private int GXv_int9[] ;
   private int A5579XBarCodf ;
   private int A5574XForColNum ;
   private int A5571XCliCodf ;
   private int A12992BarPieOpe ;
   private int A12927BarPieCoCN ;
   private int A12924BarPieCliI ;
   private int A12921BarPieColN ;
   private int A1642BarPieOrd ;
   private int A9799BarPz2 ;
   private int A9798BarPz1 ;
   private int A1501BarPiePie ;
   private int A1271BarPieLzd ;
   private int A44AlbRecCod ;
   private int GX_INS18 ;
   private int AV14DisPos ;
   private int A119BarAgrCod ;
   private int AV17BarCodAgr ;
   private java.math.BigDecimal A4982Dp_UnU ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal A6473BarUniB ;
   private java.math.BigDecimal A6472BarTara ;
   private java.math.BigDecimal A9984BarPiePda ;
   private java.math.BigDecimal A9796BarPieK2 ;
   private java.math.BigDecimal A9795BarPieK1 ;
   private java.math.BigDecimal A3276BarMtsAut ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A203BarPieKil ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A365DisDes ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String A758ProCod ;
   private String A4978Dp_Ubi ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String A5581XCodParf ;
   private String A5573XForColNom ;
   private String A5572XForSer ;
   private String A13988BarPieVtx ;
   private String A13519BarPieMq ;
   private String A13109BarPieST ;
   private String A13108BarPieLote ;
   private String A12936BarPieSecu ;
   private String A12935BarPieTono ;
   private String A12928BarPieEncC ;
   private String A12926BarPieCoCI ;
   private String A12925BarPieCliN ;
   private String A12923BarPieArtD ;
   private String A12922BarPieArtI ;
   private String A12920BarPieColD ;
   private String A12780BarPieUsu ;
   private String A1919BarPieObs ;
   private String A8907PzaB80 ;
   private String A8838CodBarPz ;
   private String A8707BapieObs ;
   private String A6489BarPieIdPz ;
   private String A6116BarPieImp ;
   private String A2186BarPieLoc ;
   private String A908PieOriCod ;
   private String A200BarPieCod ;
   private String W200BarPieCod ;
   private String Gx_emsg ;
   private String AV13DisDes ;
   private String A122BarAgrPar ;
   private String AV16BarParAgr ;
   private java.util.Date A12911BarPieFep ;
   private java.util.Date A12779BarPieFdv ;
   private boolean n761ProFasLin ;
   private boolean n4344Dp_PzU ;
   private boolean n4982Dp_UnU ;
   private boolean n5577XUltLinF ;
   private boolean n13519BarPieMq ;
   private boolean n13518BarPieTurn ;
   private boolean n13109BarPieST ;
   private boolean n13108BarPieLote ;
   private boolean n13107BarPieEmp ;
   private boolean n13004BarPieDest ;
   private boolean n12992BarPieOpe ;
   private boolean n12936BarPieSecu ;
   private boolean n12935BarPieTono ;
   private boolean n12928BarPieEncC ;
   private boolean n12927BarPieCoCN ;
   private boolean n12926BarPieCoCI ;
   private boolean n12925BarPieCliN ;
   private boolean n12924BarPieCliI ;
   private boolean n12923BarPieArtD ;
   private boolean n12922BarPieArtI ;
   private boolean n12921BarPieColN ;
   private boolean n12920BarPieColD ;
   private boolean n12912BarPieUltD ;
   private boolean n12911BarPieFep ;
   private boolean n12780BarPieUsu ;
   private boolean n12779BarPieFdv ;
   private boolean n12113BarPieCLd ;
   private boolean n1642BarPieOrd ;
   private boolean n6473BarUniB ;
   private boolean n6472BarTara ;
   private boolean n1919BarPieObs ;
   private boolean n9984BarPiePda ;
   private boolean n9846BarPieAncc ;
   private boolean n9800BarNPes ;
   private boolean n9799BarPz2 ;
   private boolean n9798BarPz1 ;
   private boolean n9796BarPieK2 ;
   private boolean n9795BarPieK1 ;
   private boolean n8907PzaB80 ;
   private boolean n8838CodBarPz ;
   private boolean n8707BapieObs ;
   private boolean n6489BarPieIdPz ;
   private boolean n6116BarPieImp ;
   private boolean n3277BarPieAut ;
   private boolean n3276BarMtsAut ;
   private boolean n3275BarKgsAut ;
   private boolean n2186BarPieLoc ;
   private boolean n1691BarPieAnc ;
   private boolean returnInSub ;
   private int[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P057R2_A396EmprCod ;
   private String[] P057R2_A130BarCodPar ;
   private byte[] P057R2_A132BarCodReo ;
   private int[] P057R2_A129BarCod ;
   private byte[] P057R2_A213BarSit ;
   private int[] P057R2_A361DisCod ;
   private String[] P057R2_A365DisDes ;
   private String[] P057R3_A396EmprCod ;
   private int[] P057R3_A129BarCod ;
   private byte[] P057R3_A132BarCodReo ;
   private String[] P057R3_A130BarCodPar ;
   private String[] P057R3_A758ProCod ;
   private short[] P057R3_A761ProFasLin ;
   private boolean[] P057R3_n761ProFasLin ;
   private String[] P057R4_A396EmprCod ;
   private int[] P057R4_A129BarCod ;
   private byte[] P057R4_A132BarCodReo ;
   private String[] P057R4_A130BarCodPar ;
   private String[] P057R4_A758ProCod ;
   private short[] P057R4_A194BarOrdLin ;
   private String[] P057R7_A396EmprCod ;
   private int[] P057R7_A129BarCod ;
   private byte[] P057R7_A132BarCodReo ;
   private String[] P057R7_A130BarCodPar ;
   private String[] P057R7_A758ProCod ;
   private short[] P057R7_A194BarOrdLin ;
   private int[] P057R7_A4643BarFasLot ;
   private String[] P057R12_A396EmprCod ;
   private int[] P057R12_A129BarCod ;
   private byte[] P057R12_A132BarCodReo ;
   private String[] P057R12_A130BarCodPar ;
   private int[] P057R12_A5322Dp_Nrecep ;
   private String[] P057R13_A396EmprCod ;
   private int[] P057R13_A129BarCod ;
   private byte[] P057R13_A132BarCodReo ;
   private String[] P057R13_A130BarCodPar ;
   private int[] P057R13_A5322Dp_Nrecep ;
   private int[] P057R13_A4344Dp_PzU ;
   private boolean[] P057R13_n4344Dp_PzU ;
   private java.math.BigDecimal[] P057R13_A4982Dp_UnU ;
   private boolean[] P057R13_n4982Dp_UnU ;
   private short[] P057R13_A4979Dp_Plg ;
   private String[] P057R13_A4978Dp_Ubi ;
   private String[] P057R19_A396EmprCod ;
   private int[] P057R19_A5579XBarCodf ;
   private byte[] P057R19_A5580XCodReof ;
   private String[] P057R19_A5581XCodParf ;
   private byte[] P057R19_A5575XTipColCod ;
   private int[] P057R19_A5574XForColNum ;
   private String[] P057R19_A5573XForColNom ;
   private String[] P057R19_A5572XForSer ;
   private int[] P057R19_A5571XCliCodf ;
   private short[] P057R19_A5577XUltLinF ;
   private boolean[] P057R19_n5577XUltLinF ;
   private String[] P057R24_A396EmprCod ;
   private int[] P057R24_A129BarCod ;
   private byte[] P057R24_A132BarCodReo ;
   private String[] P057R24_A130BarCodPar ;
   private String[] P057R24_A13988BarPieVtx ;
   private String[] P057R24_A13519BarPieMq ;
   private boolean[] P057R24_n13519BarPieMq ;
   private byte[] P057R24_A13518BarPieTurn ;
   private boolean[] P057R24_n13518BarPieTurn ;
   private String[] P057R24_A13109BarPieST ;
   private boolean[] P057R24_n13109BarPieST ;
   private String[] P057R24_A13108BarPieLote ;
   private boolean[] P057R24_n13108BarPieLote ;
   private short[] P057R24_A13107BarPieEmp ;
   private boolean[] P057R24_n13107BarPieEmp ;
   private byte[] P057R24_A13004BarPieDest ;
   private boolean[] P057R24_n13004BarPieDest ;
   private int[] P057R24_A12992BarPieOpe ;
   private boolean[] P057R24_n12992BarPieOpe ;
   private String[] P057R24_A12936BarPieSecu ;
   private boolean[] P057R24_n12936BarPieSecu ;
   private String[] P057R24_A12935BarPieTono ;
   private boolean[] P057R24_n12935BarPieTono ;
   private String[] P057R24_A12928BarPieEncC ;
   private boolean[] P057R24_n12928BarPieEncC ;
   private int[] P057R24_A12927BarPieCoCN ;
   private boolean[] P057R24_n12927BarPieCoCN ;
   private String[] P057R24_A12926BarPieCoCI ;
   private boolean[] P057R24_n12926BarPieCoCI ;
   private String[] P057R24_A12925BarPieCliN ;
   private boolean[] P057R24_n12925BarPieCliN ;
   private int[] P057R24_A12924BarPieCliI ;
   private boolean[] P057R24_n12924BarPieCliI ;
   private String[] P057R24_A12923BarPieArtD ;
   private boolean[] P057R24_n12923BarPieArtD ;
   private String[] P057R24_A12922BarPieArtI ;
   private boolean[] P057R24_n12922BarPieArtI ;
   private int[] P057R24_A12921BarPieColN ;
   private boolean[] P057R24_n12921BarPieColN ;
   private String[] P057R24_A12920BarPieColD ;
   private boolean[] P057R24_n12920BarPieColD ;
   private short[] P057R24_A12912BarPieUltD ;
   private boolean[] P057R24_n12912BarPieUltD ;
   private java.util.Date[] P057R24_A12911BarPieFep ;
   private boolean[] P057R24_n12911BarPieFep ;
   private String[] P057R24_A12780BarPieUsu ;
   private boolean[] P057R24_n12780BarPieUsu ;
   private java.util.Date[] P057R24_A12779BarPieFdv ;
   private boolean[] P057R24_n12779BarPieFdv ;
   private byte[] P057R24_A12113BarPieCLd ;
   private boolean[] P057R24_n12113BarPieCLd ;
   private int[] P057R24_A1642BarPieOrd ;
   private boolean[] P057R24_n1642BarPieOrd ;
   private java.math.BigDecimal[] P057R24_A6473BarUniB ;
   private boolean[] P057R24_n6473BarUniB ;
   private java.math.BigDecimal[] P057R24_A6472BarTara ;
   private boolean[] P057R24_n6472BarTara ;
   private String[] P057R24_A1919BarPieObs ;
   private boolean[] P057R24_n1919BarPieObs ;
   private java.math.BigDecimal[] P057R24_A9984BarPiePda ;
   private boolean[] P057R24_n9984BarPiePda ;
   private short[] P057R24_A9846BarPieAncc ;
   private boolean[] P057R24_n9846BarPieAncc ;
   private byte[] P057R24_A9800BarNPes ;
   private boolean[] P057R24_n9800BarNPes ;
   private int[] P057R24_A9799BarPz2 ;
   private boolean[] P057R24_n9799BarPz2 ;
   private int[] P057R24_A9798BarPz1 ;
   private boolean[] P057R24_n9798BarPz1 ;
   private java.math.BigDecimal[] P057R24_A9796BarPieK2 ;
   private boolean[] P057R24_n9796BarPieK2 ;
   private java.math.BigDecimal[] P057R24_A9795BarPieK1 ;
   private boolean[] P057R24_n9795BarPieK1 ;
   private String[] P057R24_A8907PzaB80 ;
   private boolean[] P057R24_n8907PzaB80 ;
   private String[] P057R24_A8838CodBarPz ;
   private boolean[] P057R24_n8838CodBarPz ;
   private String[] P057R24_A8707BapieObs ;
   private boolean[] P057R24_n8707BapieObs ;
   private String[] P057R24_A6489BarPieIdPz ;
   private boolean[] P057R24_n6489BarPieIdPz ;
   private String[] P057R24_A6116BarPieImp ;
   private boolean[] P057R24_n6116BarPieImp ;
   private short[] P057R24_A3277BarPieAut ;
   private boolean[] P057R24_n3277BarPieAut ;
   private java.math.BigDecimal[] P057R24_A3276BarMtsAut ;
   private boolean[] P057R24_n3276BarMtsAut ;
   private java.math.BigDecimal[] P057R24_A3275BarKgsAut ;
   private boolean[] P057R24_n3275BarKgsAut ;
   private String[] P057R24_A2186BarPieLoc ;
   private boolean[] P057R24_n2186BarPieLoc ;
   private short[] P057R24_A1691BarPieAnc ;
   private boolean[] P057R24_n1691BarPieAnc ;
   private int[] P057R24_A1501BarPiePie ;
   private int[] P057R24_A1271BarPieLzd ;
   private String[] P057R24_A908PieOriCod ;
   private short[] P057R24_A197BarPConTro ;
   private java.math.BigDecimal[] P057R24_A183BarMetLan ;
   private java.math.BigDecimal[] P057R24_A170BarKilLan ;
   private byte[] P057R24_A201BarPieEst ;
   private java.math.BigDecimal[] P057R24_A205BarPieMet ;
   private java.math.BigDecimal[] P057R24_A203BarPieKil ;
   private int[] P057R24_A44AlbRecCod ;
   private String[] P057R24_A200BarPieCod ;
   private String[] P057R28_A396EmprCod ;
   private int[] P057R28_A361DisCod ;
   private String[] P057R32_A396EmprCod ;
   private String[] P057R32_A130BarCodPar ;
   private byte[] P057R32_A132BarCodReo ;
   private int[] P057R32_A129BarCod ;
   private short[] P057R32_A671PieAgr ;
   private int[] P057R32_A119BarAgrCod ;
   private byte[] P057R32_A124BarAgrReo ;
   private String[] P057R32_A122BarAgrPar ;
   private String[] P057R40_A396EmprCod ;
   private String[] P057R40_A758ProCod ;
   private int[] P057R40_A361DisCod ;
   private short[] P057R40_A846UltFasLin ;
   private String[] P057R41_A396EmprCod ;
   private int[] P057R41_A361DisCod ;
   private String[] P057R41_A758ProCod ;
   private short[] P057R41_A368DisFasLin ;
}

final  class pkilreo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P057R2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSit, DisCod, DisDes FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P057R3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P057R4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P057R5", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P057R6", "DELETE FROM TXPBarPar  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
         ,new ForEachCursor("P057R7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P057R8", "DELETE FROM TXPFASPFA  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and BarFasLot = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASPFA")
         ,new UpdateCursor("P057R9", "DELETE FROM TXPFASMAQ  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASMAQ")
         ,new UpdateCursor("P057R10", "DELETE FROM TXPFASQUI  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new UpdateCursor("P057R11", "DELETE FROM TXPBARPRO  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
         ,new ForEachCursor("P057R12", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep FROM TXPUBIDEP WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P057R13", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep, Dp_PzU, Dp_UnU, Dp_Plg, Dp_Ubi FROM TXPUBIDPG WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and Dp_Nrecep = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Dp_Nrecep, Dp_Ubi, Dp_Plg ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P057R14", "DELETE FROM TXPUBIDPG  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ? AND Dp_Ubi = ? AND Dp_Plg = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUBIDPG")
         ,new UpdateCursor("P057R15", "DELETE FROM TXPUBIDEP  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Dp_Nrecep = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUBIDEP")
         ,new UpdateCursor("P057R16", "DELETE FROM TXPBARNOT  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARNOT")
         ,new UpdateCursor("P057R17", "DELETE FROM TXPBARAUD  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAUD")
         ,new UpdateCursor("P057R18", "DELETE FROM TXPLMACRO  WHERE EmprCod = ? and MacBarCod = ? and MacBarReo = ? and MacBarPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMACRO")
         ,new ForEachCursor("P057R19", "SELECT Emprcod, XBarCodf, XCodReof, XCodParf, XTipColCod, XForColNum, XForColNom, XForSer, XCliCodf, XUltLinF FROM TXPXLFORM WHERE Emprcod = ? and XBarCodf = ? and XCodReof = ? and XCodParf = ? ORDER BY Emprcod, XBarCodf, XCodReof, XCodParf ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P057R20", "DELETE FROM TXPXLFOR1  WHERE EmprCod = ? and XCliCodf = ? and XForSer = ? and XForColNom = ? and XForColNum = ? and XTipColCod = ? and XBarCodf = ? and XCodReof = ? and XCodParf = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXLFOR1")
         ,new UpdateCursor("P057R21", "DELETE FROM TXPXLFORM  WHERE Emprcod = ? AND XCliCodf = ? AND XForSer = ? AND XForColNom = ? AND XForColNum = ? AND XTipColCod = ? AND XBarCodf = ? AND XCodReof = ? AND XCodParf = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPXLFORM")
         ,new UpdateCursor("P057R22", "DELETE FROM TXPPLLBar  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPLLBar")
         ,new UpdateCursor("P057R23", "DELETE FROM TXPBARCOM  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
         ,new ForEachCursor("P057R24", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieVtx, BarPieMq, BarPieTurn, BarPieST, BarPieLote, BarPieEmp, BarPieDest, BarPieOpe, BarPieSecu, BarPieTono, BarPieEncC, BarPieCoCN, BarPieCoCI, BarPieCliN, BarPieCliI, BarPieArtD, BarPieArtI, BarPieColN, BarPieColD, BarPieUltD, BarPieFep, BarPieUsu, BarPieFdv, BarPieCLd, BarPieOrd, BarUniB, BarTara, BarPieObs, BarPiePda, BarPieAncc, BarNPes, BarPz2, BarPz1, BarPieK2, BarPieK1, PzaB80, CodBarPz, BapieObs, BarPieIdPz, BarPieImp, BarPieAut, BarMtsAut, BarKgsAut, BarPieLoc, BarPieAnc, BarPiePie, BarPieLzd, PieOriCod, BarPConTro, BarMetLan, BarKilLan, BarPieEst, BarPieMet, BarPieKil, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P057R25", "INSERT INTO TXPBARPIE(EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieUltD, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P057R26", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P057R27", "DELETE FROM TXPBARCAD  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P057R28", "SELECT EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P057R29", "DELETE FROM TXPDISDEF  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISDEF")
         ,new UpdateCursor("P057R30", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new UpdateCursor("P057R31", "DELETE FROM TXPDISBAR  WHERE EmprCod = ? and DisDisCod = ? and DisBarCod = ? and DisBarReo = ? and DisBarPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISBAR")
         ,new ForEachCursor("P057R32", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, PieAgr, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P057R33", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new UpdateCursor("P057R34", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? and BarAgrCod = ? and BarAgrReo = ? and BarAgrPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARAGR")
         ,new UpdateCursor("P057R35", "DELETE FROM TXPDISNOR  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISNOR")
         ,new UpdateCursor("P057R36", "DELETE FROM TXPDISATI  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISATI")
         ,new UpdateCursor("P057R37", "DELETE FROM TXPDISALB  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P057R38", "DELETE FROM TXPDISALD  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P057R39", "DELETE FROM TXPOBSERV  WHERE EmprCod = ? and DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new ForEachCursor("P057R40", "SELECT EmprCod, ProCod, DisCod, UltFasLin FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P057R41", "SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P057R42", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new UpdateCursor("P057R43", "DELETE FROM TXPDISPAR  WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPAR")
         ,new UpdateCursor("P057R44", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 5 :
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
            case 17 :
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
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 13);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 60);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(19);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(20, 26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(21, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(23, 13);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(24);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDate(25);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(26, 10);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDate(27);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(28);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(29);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(31,2);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(32, 60);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(34);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((byte[]) buf[63])[0] = rslt.getByte(35);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((int[]) buf[65])[0] = rslt.getInt(36);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((int[]) buf[67])[0] = rslt.getInt(37);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(40, 9);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(41, 20);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(42, 40);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(43, 15);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(44, 1);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(45);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[85])[0] = rslt.getBigDecimal(46,2);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[87])[0] = rslt.getBigDecimal(47,2);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(48, 10);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((short[]) buf[91])[0] = rslt.getShort(49);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((int[]) buf[93])[0] = rslt.getInt(50);
               ((int[]) buf[94])[0] = rslt.getInt(51);
               ((String[]) buf[95])[0] = rslt.getString(52, 9);
               ((short[]) buf[96])[0] = rslt.getShort(53);
               ((java.math.BigDecimal[]) buf[97])[0] = rslt.getBigDecimal(54,2);
               ((java.math.BigDecimal[]) buf[98])[0] = rslt.getBigDecimal(55,2);
               ((byte[]) buf[99])[0] = rslt.getByte(56);
               ((java.math.BigDecimal[]) buf[100])[0] = rslt.getBigDecimal(57,2);
               ((java.math.BigDecimal[]) buf[101])[0] = rslt.getBigDecimal(58,2);
               ((int[]) buf[102])[0] = rslt.getInt(59);
               ((String[]) buf[103])[0] = rslt.getString(60, 9);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setInt(7, ((Number) parms[6]).intValue());
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
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setString(5, (String)parms[4], 9);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 2);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 9);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[18], 10);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[28], 15);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[30], 40);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[32], 20);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[34], 9);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(28, ((Number) parms[40]).intValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(30, ((Number) parms[44]).byteValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[46]).shortValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[50], 60);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(36, ((Number) parms[56]).intValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(37, ((Number) parms[58]).byteValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DATE );
               }
               else
               {
                  stmt.setDate(38, (java.util.Date)parms[60]);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[62], 10);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DATE );
               }
               else
               {
                  stmt.setDate(40, (java.util.Date)parms[64]);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(41, ((Number) parms[66]).shortValue());
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[68], 13);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(43, ((Number) parms[70]).intValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[72], 16);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[74], 26);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(46, ((Number) parms[76]).intValue());
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[78], 60);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[80], 13);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(49, ((Number) parms[82]).intValue());
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(50, (String)parms[84], 20);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[86], 10);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[88], 10);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(53, ((Number) parms[90]).intValue());
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(54, ((Number) parms[92]).byteValue());
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(55, ((Number) parms[94]).shortValue());
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[96], 20);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(57, (String)parms[98], 20);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(58, ((Number) parms[100]).byteValue());
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[102], 6);
               }
               stmt.setString(60, (String)parms[103], 20);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
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
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               return;
      }
   }

}

